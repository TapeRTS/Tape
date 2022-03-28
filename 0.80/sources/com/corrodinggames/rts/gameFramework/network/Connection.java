package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/Connection.class */
public class Connection {
    int index;
    private final NetworkEngine networkEngine;
    Player player;
    Thread receiveThread;
    ReceiveWorker receiveWorker;
    Thread sendThread;
    SendWorker sendWorker;
    Socket socket;
    boolean trusted;
    boolean disconnecting = false;
    boolean disconnectingWhenEmpty = false;
    ConcurrentLinkedQueue<Packet> sendingPackets = new ConcurrentLinkedQueue<>();
    boolean ready = false;
    boolean ingame = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/Connection$ReceiveWorker.class */
    public final class ReceiveWorker implements Runnable {
        Boolean loop;

        private ReceiveWorker() {
            this.loop = true;
        }

        /* synthetic */ ReceiveWorker(Connection connection, ReceiveWorker receiveWorker) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Connection.this.networkEngine.addDebugText("started ReceiveWorker..");
                DataInputStream dataInputStream = new DataInputStream(Connection.this.socket.getInputStream());
                while (this.loop.booleanValue() && !Connection.this.disconnecting) {
                    int readInt = dataInputStream.readInt();
                    Connection.this.networkEngine.addDebugText("we have packet (size:" + readInt + ")");
                    Packet packet = new Packet(dataInputStream.readInt());
                    packet.bytes = new byte[readInt];
                    int i = 0;
                    packet.connectionIndex = Connection.this.index;
                    while (true) {
                        if (i >= readInt || Connection.this.disconnecting) {
                            break;
                        }
                        int read = dataInputStream.read(packet.bytes, i, readInt - i);
                        if (read == -1) {
                            Connection.this.networkEngine.addDebugText("we got to the end of the stream?!?");
                            break;
                        }
                        i += read;
                    }
                    if (!Connection.this.disconnecting) {
                        if (packet.type > 100) {
                            Connection.this.networkEngine.processSystemPacket(packet);
                        } else {
                            Connection.this.networkEngine.receivedPackets.add(packet);
                        }
                    }
                }
            } catch (IOException e) {
                GameEngine.log("network:ReceiveWorker", e.getMessage());
            }
            Connection.this.timedOut();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/Connection$SendWorker.class */
    public final class SendWorker implements Runnable {
        DataOutputStream dataOutputStream;
        Boolean loop = true;

        SendWorker() {
            try {
                this.dataOutputStream = new DataOutputStream(Connection.this.socket.getOutputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Connection.this.networkEngine.addDebugText("ready to send packets");
                while (this.loop.booleanValue() && !Connection.this.disconnecting) {
                    while (!Connection.this.sendingPackets.isEmpty() && !Connection.this.disconnecting) {
                        Connection.this.networkEngine.addDebugText("sending packets..");
                        Packet remove = Connection.this.sendingPackets.remove();
                        this.dataOutputStream.writeInt(remove.bytes.length);
                        this.dataOutputStream.writeInt(remove.type);
                        this.dataOutputStream.write(remove.bytes);
                        this.dataOutputStream.flush();
                    }
                    if (Connection.this.disconnectingWhenEmpty) {
                        Connection.this.disconnecting = true;
                    }
                    Connection.this.networkEngine.addDebugText("waiting..");
                    waitForWakeUp();
                }
            } catch (IOException e) {
                GameEngine.log("network:SendWorker", e.getMessage());
            }
            Connection.this.timedOut();
        }

        public void waitForWakeUp() {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }

        public void wakeUp() {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Connection(NetworkEngine networkEngine, Socket socket) {
        this.networkEngine = networkEngine;
        this.socket = socket;
        this.index = this.networkEngine.nextConnectionIndex;
        this.networkEngine.nextConnectionIndex++;
    }

    public void disconnect() {
        this.disconnecting = true;
    }

    public void disconnectWhenEmpty() {
        this.disconnectingWhenEmpty = true;
        this.sendWorker.wakeUp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPlayerId() {
        return this.player != null ? this.player.id : -1;
    }

    public void sendQueuedPackets() {
        this.sendWorker.wakeUp();
    }

    public void startThreads() {
        this.receiveWorker = new ReceiveWorker(this, null);
        this.receiveThread = new Thread(this.receiveWorker);
        this.receiveThread.start();
        this.sendWorker = new SendWorker();
        this.sendThread = new Thread(this.sendWorker);
        this.sendThread.start();
    }

    public void timedOut() {
        if (this.player != null) {
            this.networkEngine.reportProblem("player '" + this.player.playerName + "' disconnected");
        }
        disconnect();
    }
}
