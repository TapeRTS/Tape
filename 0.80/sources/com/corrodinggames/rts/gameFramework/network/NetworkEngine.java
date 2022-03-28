package com.corrodinggames.rts.gameFramework.network;

import android.content.pm.PackageManager;
import android.util.Log;
import com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/NetworkEngine.class */
public class NetworkEngine {
    public static final int PACKET_ADDCLIENTCOMMAND = 20;
    public static final int PACKET_MOVEFRAME = 10;
    public static final int PACKET_NONE = 0;
    public static final int PACKET_RECEIVE_CHAT_FROM_SERVER = 141;
    public static final int PACKET_REGISTER_CONNECTION = 110;
    public static final int PACKET_SEND_CHAT_TO_SERVER = 140;
    public static final int PACKET_SEND_KICK = 150;
    public static final int PACKET_START_GAME = 120;
    public static final int PACKET_SYNCCHECKSUM = 30;
    public static final int PACKET_UPDATE_CLIENT_STATUS = 112;
    public static final int PACKET_UPDATE_PLAYER = 115;
    public static final int defaultPortNumber = 5000;
    boolean allPlayersInGame;
    public int currentPortNumber;
    public boolean gameHasBeenStarted;
    boolean hasPacketsToSend;
    public float inGameDelay;
    public long lastSyncCheckSum;
    public boolean lastSyncCheckSumSent;
    public int lastSyncFrame;
    public String localPlayerName;
    private boolean localPlayerReady;
    public int localPlayerTeamId;
    public boolean needsToSpeedUp;
    public int networkVersion;
    NewConnectionRunnable newConnectionRunnable;
    Thread newConnectionThread;
    int nextConnectionIndex;
    public int numberOfDesyncErrors;
    public int preupdateGapSize;
    public boolean server;
    public boolean showingDesyncErrors;
    public boolean skipGameUpdates;
    public int stepSize;
    long unitId;
    private boolean sentIngameStatus = false;
    public boolean networked = false;
    public int currentStep = 0;
    public int currentBlockingFrame = 0;
    public String networkMapPath = "maps/skirmish/[p4]Desert (4p).tmx";
    ConcurrentLinkedQueue<Connection> connections = new ConcurrentLinkedQueue<>();
    ConcurrentLinkedQueue<Packet> receivedPackets = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/NetworkEngine$NewConnectionRunnable.class */
    public final class NewConnectionRunnable implements Runnable {
        boolean active;
        ServerSocket serverSocket;

        private NewConnectionRunnable() {
            this.active = true;
        }

        /* synthetic */ NewConnectionRunnable(NetworkEngine networkEngine, NewConnectionRunnable newConnectionRunnable) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                NetworkEngine.this.addDebugText("starting socket..");
                this.serverSocket = new ServerSocket(NetworkEngine.this.currentPortNumber);
                NetworkEngine.this.addDebugText("reading..");
                while (this.active) {
                    Socket accept = this.serverSocket.accept();
                    NetworkEngine.this.addDebugText("accepted socket..");
                    Connection connection = new Connection(NetworkEngine.this, accept);
                    NetworkEngine.this.connections.add(connection);
                    connection.startThreads();
                    NetworkEngine.this.sendUpdatePlayer();
                    NetworkEngine.this.addDebugText("done..");
                }
            } catch (SocketException e) {
                if (this.active) {
                    throw new RuntimeException(e);
                }
                e.printStackTrace();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void stop() {
            this.active = false;
            try {
                this.serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public NetworkEngine() {
        GameEngine instance = GameEngine.getInstance();
        try {
            this.networkVersion = instance.context.getPackageManager().getPackageInfo(instance.context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void disconnectAll() {
        Iterator<Connection> it = this.connections.iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.connections.clear();
        this.receivedPackets.clear();
        this.nextConnectionIndex = 0;
        this.hasPacketsToSend = false;
    }

    private void receiveChatMessageFromServer(String str) throws IOException {
        MultiplayerBattleroomActivity.addMessageToChatLog(str);
    }

    private void relayChatMessage(String str, String str2) {
        String str3 = String.valueOf(str) + ": " + str2;
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            outputNetStream.writeString(str3);
            outputNetStream.writeByte(0);
            sendPacketToClients(outputNetStream.createPacket(PACKET_RECEIVE_CHAT_FROM_SERVER));
            receiveChatMessageFromServer(str3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reportDesync(String str) {
        GameEngine instance = GameEngine.getInstance();
        NetworkEngine networkEngine = instance.network;
        String str2 = "warning network desync detected:" + str;
        Log.e(GameEngine.TAG, str2);
        networkEngine.numberOfDesyncErrors++;
        if (!networkEngine.showingDesyncErrors) {
            return;
        }
        if (networkEngine.numberOfDesyncErrors > 5) {
            instance.interfaceEngine.messageInterface.addMessage("", "--too many desync errors, suppressing output--");
            networkEngine.showingDesyncErrors = false;
            return;
        }
        instance.interfaceEngine.messageInterface.addMessage("", str2);
    }

    private void startGame() {
        this.gameHasBeenStarted = true;
        MultiplayerBattleroomActivity.startGame();
    }

    public void addCommand(CommandController.Command command) {
        GameEngine instance = GameEngine.getInstance();
        command.runStep = this.currentBlockingFrame;
        instance.commandController.activeCommands.add(command);
    }

    public void addDebugText(String str) {
        Log.d(GameEngine.TAG, "network:" + str);
    }

    public boolean allPlayersIngame() {
        boolean z;
        Iterator<Connection> it = this.connections.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().ingame) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean connectToServer(String str) {
        boolean z;
        synchronized (this) {
            if (this.networked) {
                throw new RuntimeException("networking already started, can not join");
            }
            startNewNetwork();
            GameEngine instance = GameEngine.getInstance();
            try {
                try {
                    String[] split = str.split(":");
                    String str2 = split[0];
                    this.currentPortNumber = defaultPortNumber;
                    if (split.length > 1) {
                        try {
                            this.currentPortNumber = Integer.parseInt(split[1]);
                        } catch (NumberFormatException e) {
                            instance.alert("Bad port number", 1);
                            e.printStackTrace();
                            z = false;
                        }
                    }
                    Socket socket = new Socket(InetAddress.getByName(str2), this.currentPortNumber);
                    this.networked = true;
                    this.server = false;
                    addDebugText("connect To Server..");
                    Connection connection = new Connection(this, socket);
                    this.connections.add(connection);
                    connection.startThreads();
                    sendRegisterConnection(connection);
                    z = true;
                } catch (UnknownHostException e2) {
                    addDebugText("UnknownHostException..");
                    instance.alert("Failed to connect to host", 1);
                    e2.printStackTrace();
                    z = false;
                }
            } catch (IOException e3) {
                addDebugText("IOException..");
                instance.alert("Failed to connecting to host", 1);
                e3.printStackTrace();
                z = false;
            }
        }
        return z;
    }

    public void disconnect() {
        synchronized (this) {
            if (this.server && this.newConnectionRunnable != null) {
                this.newConnectionRunnable.stop();
                this.newConnectionRunnable = null;
                this.newConnectionThread = null;
            }
            disconnectAll();
            this.networked = false;
            this.server = false;
            this.gameHasBeenStarted = false;
            GameEngine.getInstance().unloadMap();
        }
    }

    void doSyncCheckSum() {
        OrderableUnit orderableUnit;
        this.lastSyncFrame = GameEngine.getInstance().frameNumber;
        this.lastSyncCheckSum = 0L;
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof OrderableUnit) {
                this.lastSyncCheckSum = ((float) this.lastSyncCheckSum) + (orderableUnit.x * 100.0f);
                this.lastSyncCheckSum = ((float) this.lastSyncCheckSum) + (orderableUnit.y * 100.0f);
                this.lastSyncCheckSum = ((float) this.lastSyncCheckSum) + (orderableUnit.hp * 1.0f);
                this.lastSyncCheckSum += ((OrderableUnit) next).id;
            }
        }
        this.lastSyncCheckSumSent = false;
    }

    public Connection getConnection(int i) {
        Connection connection;
        Iterator<Connection> it = this.connections.iterator();
        while (true) {
            if (it.hasNext()) {
                connection = it.next();
                if (connection.index == i) {
                    break;
                }
            } else {
                connection = null;
                break;
            }
        }
        return connection;
    }

    public String getLocalIpAddress() {
        String localIpAddress = getLocalIpAddress(true);
        if (localIpAddress == null) {
            localIpAddress = getLocalIpAddress(false);
        }
        return localIpAddress;
    }

    public String getLocalIpAddress(boolean z) {
        String str;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            loop0: while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        str = nextElement.getHostAddress().toString();
                        if (!z || str.contains(".")) {
                            break loop0;
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Log.e(GameEngine.TAG, e.toString());
        }
        str = null;
        return str;
    }

    public long getNextUnitId() {
        long j = this.unitId;
        this.unitId = 1 + j;
        return j;
    }

    public int getNumberOfPlayers() {
        return this.connections.size();
    }

    public void load() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void processGamePacket(Packet packet) throws IOException {
        GameEngine instance = GameEngine.getInstance();
        switch (packet.type) {
            case 10:
                InputNetStream inputNetStream = new InputNetStream(packet);
                int readInt = inputNetStream.readInt();
                int readInt2 = inputNetStream.readInt();
                for (int i = 0; i < readInt2; i++) {
                    CommandController.Command createBlankCommand = instance.commandController.createBlankCommand();
                    createBlankCommand.runStep = this.currentBlockingFrame;
                    createBlankCommand.readIn(inputNetStream);
                    addCommand(createBlankCommand);
                }
                this.currentBlockingFrame = readInt;
                return;
            case PACKET_ADDCLIENTCOMMAND /* 20 */:
                InputNetStream inputNetStream2 = new InputNetStream(packet);
                addDebugText("got command");
                CommandController.Command createBlankCommand2 = instance.commandController.createBlankCommand();
                createBlankCommand2.readIn(inputNetStream2);
                addCommand(createBlankCommand2);
                return;
            case PACKET_SYNCCHECKSUM /* 30 */:
                InputNetStream inputNetStream3 = new InputNetStream(packet);
                int readInt3 = inputNetStream3.readInt();
                long readLong = inputNetStream3.readLong();
                if (this.lastSyncFrame == readInt3 && readLong != this.lastSyncCheckSum) {
                    reportDesync("Checksum doesn't match. Got:" + readLong + " expect:" + this.lastSyncCheckSum);
                    break;
                }
                break;
        }
        addDebugText("we did not handle packet:" + packet.type);
    }

    public void processSystemPacket(Packet packet) throws IOException {
        synchronized (this) {
            GameEngine instance = GameEngine.getInstance();
            switch (packet.type) {
                case PACKET_REGISTER_CONNECTION /* 110 */:
                    addDebugText("got REGISTER_CONNECTION");
                    if (!this.server) {
                        addDebugText("we are not a server! skipping");
                        break;
                    } else {
                        InputNetStream inputNetStream = new InputNetStream(packet);
                        Connection connection = getConnection(packet.connectionIndex);
                        inputNetStream.readString();
                        inputNetStream.readInt();
                        int readInt = inputNetStream.readInt();
                        inputNetStream.readInt();
                        String readString = inputNetStream.readString();
                        if (readInt >= this.networkVersion) {
                            if (readInt <= this.networkVersion) {
                                if (this.gameHasBeenStarted) {
                                    sendKick(connection, "The game as already been started");
                                    connection.disconnectWhenEmpty();
                                    break;
                                } else {
                                    if (connection.player == null) {
                                        int nextFreeSlot = Team.nextFreeSlot();
                                        if (nextFreeSlot == -1) {
                                            sendKick(connection, "No free slots on server");
                                            connection.disconnectWhenEmpty();
                                            reportProblem("New Player tried to join but there are free slots on server");
                                        } else {
                                            connection.player = new Player(nextFreeSlot);
                                            connection.player.playerName = readString;
                                        }
                                    }
                                    MultiplayerBattleroomActivity.updateUI();
                                    sendUpdatePlayer();
                                    break;
                                }
                            } else {
                                sendKick(connection, "Your client is newer then the server");
                                connection.disconnectWhenEmpty();
                                reportProblem("New Player kicked: Their game is newer then this server");
                                break;
                            }
                        } else {
                            sendKick(connection, "Game is out of date, please update");
                            connection.disconnectWhenEmpty();
                            reportProblem("New Player kicked: Their game is out of date");
                            break;
                        }
                    }
                case PACKET_UPDATE_CLIENT_STATUS /* 112 */:
                    if (!this.server) {
                        addDebugText("we are not a server! skipping");
                        break;
                    } else {
                        Connection connection2 = getConnection(packet.connectionIndex);
                        InputNetStream inputNetStream2 = new InputNetStream(packet);
                        connection2.ready = inputNetStream2.readBoolean();
                        connection2.ingame = inputNetStream2.readBoolean();
                        break;
                    }
                case PACKET_UPDATE_PLAYER /* 115 */:
                    addDebugText("got PACKET_UPDATE_PLAYER");
                    if (this.server) {
                        addDebugText("we are a server! we don't follow orders");
                        break;
                    } else {
                        InputNetStream inputNetStream3 = new InputNetStream(packet);
                        this.localPlayerTeamId = inputNetStream3.readInt();
                        int readInt2 = inputNetStream3.readInt();
                        addDebugText("got in " + readInt2 + " players");
                        for (int i = 0; i < readInt2; i++) {
                            inputNetStream3.readInt();
                            int readInt3 = inputNetStream3.readInt();
                            Team team = Team.getTeam(readInt3);
                            Team team2 = team;
                            if (team == null) {
                                team2 = new Player(readInt3);
                            }
                            team2.readIn(inputNetStream3);
                        }
                        MultiplayerBattleroomActivity.updateUI();
                        break;
                    }
                case PACKET_START_GAME /* 120 */:
                    if (this.server) {
                        addDebugText("error, we are a server but got: PACKET_START_GAME");
                        break;
                    } else {
                        InputNetStream inputNetStream4 = new InputNetStream(packet);
                        inputNetStream4.readByte();
                        this.networkMapPath = inputNetStream4.readString();
                        startGame();
                        break;
                    }
                case PACKET_SEND_CHAT_TO_SERVER /* 140 */:
                    if (!this.server) {
                        addDebugText("we are not a server! skipping");
                        break;
                    } else {
                        Connection connection3 = getConnection(packet.connectionIndex);
                        InputNetStream inputNetStream5 = new InputNetStream(packet);
                        if (connection3.player == null) {
                            addDebugText("player is null for message, skipping");
                            break;
                        } else {
                            relayChatMessage(connection3.player.playerName, inputNetStream5.readString());
                            inputNetStream5.readByte();
                            break;
                        }
                    }
                case PACKET_RECEIVE_CHAT_FROM_SERVER /* 141 */:
                    if (this.server) {
                        addDebugText("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                        break;
                    } else {
                        InputNetStream inputNetStream6 = new InputNetStream(packet);
                        String readString2 = inputNetStream6.readString();
                        inputNetStream6.readByte();
                        receiveChatMessageFromServer(readString2);
                        break;
                    }
                case PACKET_SEND_KICK /* 150 */:
                    if (this.server) {
                        addDebugText("error, we are a server but got: PACKET_SEND_KICK");
                        break;
                    } else {
                        String readString3 = new InputNetStream(packet).readString();
                        addDebugText("we got kicked, reason:" + readString3);
                        instance.alert("Kicked: " + readString3, 1);
                        disconnect();
                        MultiplayerBattleroomActivity.closeIfOpen();
                        break;
                    }
                default:
                    addDebugText("we did not handle packet:" + packet.type);
                    break;
            }
        }
    }

    public void reportProblem(String str) {
        GameEngine instance = GameEngine.getInstance();
        Log.e(GameEngine.TAG, "reportProblem:" + str);
        if (this.gameHasBeenStarted) {
            instance.interfaceEngine.messageInterface.addMessage("", str);
            return;
        }
        try {
            receiveChatMessageFromServer(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendChatMessage(String str) {
        if (this.server) {
            relayChatMessage(this.localPlayerName, str);
            return;
        }
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            outputNetStream.writeString(str);
            outputNetStream.writeByte(0);
            sendPacketToServer(outputNetStream.createPacket(PACKET_SEND_CHAT_TO_SERVER));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendClientStatus() {
        if (this.server) {
            throw new RuntimeException("We are a server");
        }
        GameEngine instance = GameEngine.getInstance();
        OutputNetStream outputNetStream = new OutputNetStream();
        try {
            outputNetStream.writeBoolean(this.localPlayerReady);
            outputNetStream.writeBoolean(instance.gameRunning);
            sendPacketToServer(outputNetStream.createPacket(PACKET_UPDATE_CLIENT_STATUS));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendKick(Connection connection, String str) {
        synchronized (this) {
            if (!this.server) {
                addDebugText("sendKick: we are not a server!");
            } else {
                addDebugText("kicking client reason:" + str);
                OutputNetStream outputNetStream = new OutputNetStream();
                try {
                    outputNetStream.writeString(str);
                    sendPacketOnConnection(connection, outputNetStream.createPacket(PACKET_SEND_KICK));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void sendPacketOnConnection(Connection connection, Packet packet) {
        synchronized (this) {
            connection.sendingPackets.add(packet);
            connection.sendQueuedPackets();
        }
    }

    public void sendPacketToAll(Packet packet) {
        synchronized (this) {
            Iterator<Connection> it = this.connections.iterator();
            while (it.hasNext()) {
                Connection next = it.next();
                next.sendingPackets.add(packet);
                next.sendQueuedPackets();
            }
        }
    }

    public void sendPacketToClients(Packet packet) {
        synchronized (this) {
            if (!this.server) {
                throw new RuntimeException("We are not a server");
            }
            sendPacketToAll(packet);
        }
    }

    public void sendPacketToServer(Packet packet) {
        synchronized (this) {
            if (this.server) {
                throw new RuntimeException("We are a server");
            }
            sendPacketToAll(packet);
        }
    }

    public void sendRegisterConnection(Connection connection) {
        OutputNetStream outputNetStream = new OutputNetStream();
        try {
            outputNetStream.writeString("com.corrodinggames.rts");
            outputNetStream.writeInt(0);
            outputNetStream.writeInt(this.networkVersion);
            GameEngine instance = GameEngine.getInstance();
            outputNetStream.writeInt(instance.context.getPackageManager().getPackageInfo(instance.context.getPackageName(), 0).versionCode);
            outputNetStream.writeString(this.localPlayerName);
            sendPacketOnConnection(connection, outputNetStream.createPacket(PACKET_REGISTER_CONNECTION));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void sendStartGameEvent() {
        if (!this.server) {
            throw new RuntimeException("We are not a server");
        }
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            outputNetStream.writeByte(0);
            outputNetStream.writeString(this.networkMapPath);
            sendPacketToClients(outputNetStream.createPacket(PACKET_START_GAME));
            startGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendUpdatePlayer() {
        synchronized (this) {
            if (!this.server) {
                addDebugText("sendUpdatePlayer: we are not a server!");
            } else {
                Iterator<Connection> it = this.connections.iterator();
                while (it.hasNext()) {
                    Connection next = it.next();
                    OutputNetStream outputNetStream = new OutputNetStream();
                    try {
                        outputNetStream.writeInt(next.getPlayerId());
                        int i = 0;
                        for (int i2 = 0; i2 < Team.teamList.length; i2++) {
                            i = i;
                            if (Team.teamList[i2] != null) {
                                i++;
                            }
                        }
                        outputNetStream.writeInt(i);
                        for (int i3 = 0; i3 < Team.teamList.length; i3++) {
                            Team team = Team.teamList[i3];
                            if (team != null) {
                                int i4 = 0;
                                if (team instanceof AI) {
                                    i4 = 1;
                                }
                                outputNetStream.writeInt(i4);
                                outputNetStream.writeInt(team.id);
                                team.writeOut(outputNetStream);
                            }
                        }
                        sendPacketOnConnection(next, outputNetStream.createPacket(PACKET_UPDATE_PLAYER));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public void setReadyState(boolean z) {
        this.localPlayerReady = z;
    }

    public void startNewLevel() {
    }

    public void startNewNetwork() {
        this.networked = false;
        this.server = false;
        this.sentIngameStatus = false;
        this.localPlayerReady = false;
        this.localPlayerTeamId = 0;
        this.currentBlockingFrame = 0;
        this.currentStep = 0;
        this.unitId = 0L;
        this.inGameDelay = 10.0f;
        this.stepSize = 20;
        this.preupdateGapSize = 5;
        this.skipGameUpdates = false;
        this.allPlayersInGame = false;
        this.needsToSpeedUp = false;
        this.gameHasBeenStarted = false;
        this.lastSyncFrame = 0;
        this.lastSyncCheckSum = 0L;
        this.lastSyncCheckSumSent = false;
        this.showingDesyncErrors = true;
        this.numberOfDesyncErrors = 0;
        this.currentPortNumber = 0;
        Team.removeAll();
    }

    public void startServer() {
        synchronized (this) {
            if (this.networked) {
                throw new RuntimeException("networking already started");
            }
            startNewNetwork();
            this.networked = true;
            this.server = true;
            GameEngine instance = GameEngine.getInstance();
            int nextFreeSlot = Team.nextFreeSlot();
            if (nextFreeSlot == -1) {
                throw new RuntimeException("playerId is -1 for server player");
            }
            Player player = new Player(nextFreeSlot);
            player.playerName = this.localPlayerName;
            instance.playerTeam = player;
            this.localPlayerTeamId = nextFreeSlot;
            MultiplayerBattleroomActivity.updateUI();
            this.currentPortNumber = defaultPortNumber;
            this.newConnectionRunnable = new NewConnectionRunnable(this, null);
            this.newConnectionThread = new Thread(this.newConnectionRunnable);
            this.newConnectionThread.start();
            addDebugText("server started");
        }
    }

    public void unload() {
    }

    public void update(float f) {
        GameEngine instance = GameEngine.getInstance();
        if (!this.server && !this.sentIngameStatus) {
            sendClientStatus();
            this.sentIngameStatus = true;
        }
        if (this.server) {
            if (!this.allPlayersInGame && allPlayersIngame()) {
                this.inGameDelay = CommonUtils.toZero(this.inGameDelay, f);
                if (this.inGameDelay == 0.0f) {
                    this.allPlayersInGame = true;
                    instance.interfaceEngine.messageInterface.addMessage("", "<All players ready>");
                }
            }
            if (this.allPlayersInGame && instance.frameNumber >= this.currentBlockingFrame - this.preupdateGapSize) {
                int i = this.currentBlockingFrame + this.stepSize;
                OutputNetStream outputNetStream = new OutputNetStream();
                try {
                    outputNetStream.writeInt(i);
                    int i2 = 0;
                    Iterator<CommandController.Command> it = instance.commandController.activeCommands.iterator();
                    while (it.hasNext()) {
                        if (it.next().runStep == this.currentBlockingFrame) {
                            i2++;
                        }
                    }
                    outputNetStream.writeInt(i2);
                    Iterator<CommandController.Command> it2 = instance.commandController.activeCommands.iterator();
                    while (it2.hasNext()) {
                        CommandController.Command next = it2.next();
                        if (next.runStep == this.currentBlockingFrame) {
                            next.writeOut(outputNetStream);
                        }
                    }
                    sendPacketToAll(outputNetStream.createPacket(10));
                    this.currentBlockingFrame = i;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (!this.server) {
            if (!instance.commandController.localCommands.isEmpty()) {
                Iterator<CommandController.Command> it3 = instance.commandController.localCommands.iterator();
                while (it3.hasNext()) {
                    CommandController.Command next2 = it3.next();
                    OutputNetStream outputNetStream2 = new OutputNetStream();
                    try {
                        next2.writeOut(outputNetStream2);
                        sendPacketToAll(outputNetStream2.createPacket(20));
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                instance.commandController.localCommands.clear();
            }
        } else if (!instance.commandController.localCommands.isEmpty()) {
            Iterator<CommandController.Command> it4 = instance.commandController.localCommands.iterator();
            while (it4.hasNext()) {
                addCommand(it4.next());
            }
            instance.commandController.localCommands.clear();
        }
        while (!this.receivedPackets.isEmpty()) {
            try {
                processGamePacket(this.receivedPackets.remove());
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
        if (instance.frameNumber < this.currentBlockingFrame) {
            this.skipGameUpdates = false;
        }
    }

    public void updateCheckFrame(int i) {
        GameEngine instance = GameEngine.getInstance();
        if (instance.frameNumber < this.currentBlockingFrame) {
            return;
        }
        if (instance.frameNumber > this.currentBlockingFrame) {
            throw new RuntimeException("game frame:" + instance.frameNumber + " is greater then nest step:" + this.currentBlockingFrame);
        }
        this.skipGameUpdates = true;
    }

    public void updateFrameStep(float f) {
        GameEngine instance = GameEngine.getInstance();
        if (this.lastSyncFrame + 500 < instance.frameNumber) {
            doSyncCheckSum();
        }
        if (this.server && !this.lastSyncCheckSumSent && this.lastSyncFrame + 200 < instance.frameNumber && this.lastSyncFrame != 0) {
            try {
                OutputNetStream outputNetStream = new OutputNetStream();
                outputNetStream.writeInt(this.lastSyncFrame);
                outputNetStream.writeLong(this.lastSyncCheckSum);
                sendPacketToClients(outputNetStream.createPacket(30));
                this.lastSyncCheckSumSent = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
