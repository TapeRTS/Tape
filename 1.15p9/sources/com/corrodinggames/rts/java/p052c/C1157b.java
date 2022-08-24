package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUtils;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.Connection;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b.class */
public class C1157b extends C1058a {

    /* renamed from: b */
    C1160d f7089b;

    /* renamed from: c */
    SteamFriends f7090c;

    /* renamed from: d */
    SteamMatchmaking f7091d;

    /* renamed from: e */
    C1161e f7092e;

    /* renamed from: f */
    C1162f f7093f;

    /* renamed from: g */
    C1163g f7094g;

    /* renamed from: h */
    SteamNetworking f7095h;

    /* renamed from: i */
    C1159c f7096i;

    /* renamed from: j */
    SteamUtils f7097j;

    /* renamed from: k */
    boolean f7098k = false;

    /* renamed from: l */
    HashMap f7099l = new HashMap();

    /* renamed from: m */
    ByteBuffer f7100m;

    /* renamed from: n */
    SteamID f7101n;

    /* renamed from: o */
    boolean f7102o;

    /* renamed from: p */
    SteamID f7103p;

    /* renamed from: n */
    public C1163g m280n() {
        return this.f7094g;
    }

    /* renamed from: b */
    public void m294b() {
        if (this.f7098k) {
            GameEngine.PrintLog("SteamEngine - init already called");
            return;
        }
        this.f7098k = true;
        GameEngine.PrintLog("SteamEngine - java steamEngine init()");
        try {
            if (!SteamAPI.init()) {
                GameEngine.m1145b("steamAPI init failed");
                m288d();
                return;
            }
            this.f7100m = ByteBuffer.allocateDirect(100000);
            this.f7089b = new C1160d(this);
            this.f7090c = new SteamFriends(this.f7089b);
            this.f7092e = new C1161e(this);
            this.f7091d = new SteamMatchmaking(this.f7092e);
            this.f7093f = new C1162f(this);
            this.f7095h = new SteamNetworking(this.f7093f, SteamNetworking.API.Client);
            this.f7094g = new C1163g(this);
            try {
                this.f7094g.m277a(new SteamUGC(this.f7094g.m279a()));
                this.f7096i = new C1159c(this);
                this.f7097j = new SteamUtils(this.f7096i);
            } catch (RuntimeException e) {
                e.printStackTrace();
                throw new SteamException("Failed to create workshop");
            }
        } catch (SteamException e2) {
            e2.printStackTrace();
            m288d();
        }
    }

    /* renamed from: a */
    public void m299a(float f) {
        SteamAPI.runCallbacks();
        if (this.f7095h != null) {
            if (GameEngine.f6191aK != null) {
                GameEngine.PrintLog("Joining game from commandline invite:" + GameEngine.f6191aK);
                long parseLong = Long.parseLong(GameEngine.f6191aK);
                GameEngine.f6191aK = null;
                this.f7091d.joinLobby(SteamID.createFromNativeHandle(parseLong));
            }
            while (true) {
                int isP2PPacketAvailable = this.f7095h.isP2PPacketAvailable(0);
                if (isP2PPacketAvailable != 0) {
                    if (isP2PPacketAvailable > this.f7100m.capacity()) {
                        GameEngine.m1145b("nextPacketSize:" + isP2PPacketAvailable + " larger then byteBuffer:" + this.f7100m.capacity() + " resizing");
                        this.f7100m = ByteBuffer.allocateDirect(isP2PPacketAvailable);
                    }
                    SteamID steamID = new SteamID();
                    try {
                        this.f7100m.clear();
                        int readP2PPacket = this.f7095h.readP2PPacket(steamID, this.f7100m, 0);
                        if (readP2PPacket == 0) {
                            GameEngine.m1145b("readP2PPacket with rtn==" + readP2PPacket);
                        }
                        C1167k c1167k = (C1167k) this.f7099l.get(steamID);
                        if (c1167k != null && c1167k.isClosed()) {
                            GameEngine.m1145b("Removing stale steam socket");
                            this.f7099l.remove(steamID);
                            c1167k = null;
                        }
                        if (c1167k == null) {
                            m293b(steamID);
                            c1167k = (C1167k) this.f7099l.get(steamID);
                        }
                        if (c1167k == null) {
                            GameEngine.PrintLog("Could not find remote ID steamSocket: " + steamID);
                        } else {
                            byte[] bArr = new byte[this.f7100m.limit()];
                            this.f7100m.get(bArr);
                            c1167k.f7130c.m261a(bArr);
                        }
                    } catch (SteamException e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void m288d() {
        GameEngine.m1145b("JavaSteamEngine: disableSteam");
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine != null) {
            gameEngine.m1116i("Steam connection failed.");
        } else {
            GameEngine.PrintLog("cannot show alert game has not been created");
        }
        C1058a.f6727a = new C1058a();
    }

    /* renamed from: c */
    public String m290c() {
        return this.f7090c.getPersonaName();
    }

    /* renamed from: f */
    public boolean m287f() {
        return false;
    }

    /* renamed from: a */
    public void m295a(String str) {
        GameEngine.PrintLog("Steam: " + str);
    }

    /* renamed from: b */
    public void m291b(String str) {
        GameEngine.m1145b("Steam: " + str);
    }

    /* renamed from: i */
    public void m285i() {
        m295a("createLobby");
        if (this.f7101n != null) {
            m291b("createLobby: activeLobby!=null");
        }
        this.f7091d.createLobby(SteamMatchmaking.LobbyType.FriendsOnly, 10);
    }

    /* renamed from: a */
    public synchronized void m298a(SteamID steamID) {
        GameEngine.getInstance();
        this.f7101n = steamID;
    }

    /* renamed from: b */
    public Connection m293b(SteamID steamID) {
        GameEngine.PrintLog("addPeer: " + steamID);
        GameEngine gameEngine = GameEngine.getInstance();
        C1167k c1167k = (C1167k) this.f7099l.get(steamID);
        if (c1167k != null) {
            if (c1167k.isClosed()) {
                this.f7099l.remove(steamID);
            } else {
                m291b("addPeer, user already exists");
                try {
                    c1167k.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        C1167k c1167k2 = new C1167k(this, steamID);
        Connection connection = new Connection(gameEngine.networkEngine, c1167k2);
        try {
            connection.f5765i = true;
            connection.m1500d();
            gameEngine.networkEngine.f5600bc.add(connection);
            this.f7099l.put(steamID, c1167k2);
            gameEngine.networkEngine.m1786Q();
            return connection;
        } catch (IOException e2) {
            e2.printStackTrace();
            connection.m1508a("crash");
            return null;
        }
    }

    /* renamed from: c */
    public void m289c(SteamID steamID) {
        GameEngine.PrintLog("connectTo: " + steamID);
        C1167k c1167k = (C1167k) this.f7099l.get(steamID);
        if (c1167k != null) {
            if (c1167k.isClosed()) {
                this.f7099l.remove(steamID);
            } else {
                m291b("connectTo, user already exists");
                try {
                    c1167k.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        GameEngine.getInstance();
        if (!this.f7102o) {
            ScriptEngine.getInstance().addRunnableToQueue(new RunnableC11581(steamID));
            return;
        }
        m295a("connectTo as server?");
        m293b(steamID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.java.c.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b$1.class */
    public class RunnableC11581 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SteamID f7104a;

        RunnableC11581(SteamID steamID) {
            this.f7104a = steamID;
        }

        public void run() {
            GameEngine gameEngine = GameEngine.getInstance();
            try {
                C1157b.this.m295a("connectTo runnable start");
                Root root = ScriptEngine.getInstance().getRoot();
                gameEngine.networkEngine.m1690b("starting new");
                C1157b.this.f7101n = this.f7104a;
                C1157b.this.f7103p = C1157b.this.f7091d.getLobbyOwner(C1157b.this.f7101n);
                String str = gameEngine.f6109bQ.lastNetworkPlayerName;
                String m780c = C1058a.m786a().m780c();
                if (m780c != null && str == null) {
                    str = CommonUtils.m2334a(m780c.replace(" ", "_"), 20);
                }
                gameEngine.networkEngine.f5481y = str;
                C1167k c1167k = new C1167k(C1157b.this, C1157b.this.f7103p);
                C1157b.this.f7099l.put(C1157b.this.f7103p, c1167k);
                gameEngine.networkEngine.m1740a(c1167k);
                Iterator it = gameEngine.networkEngine.f5600bc.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).f5765i = true;
                }
                C1157b.this.m295a("connected");
                root.showBattleroom();
                C1157b.this.m295a("connectTo runnable end");
            } catch (IOException e) {
                gameEngine.m1137c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public void m284j() {
        m295a("stopLobby");
        if (this.f7101n == null) {
            m291b("stopLobby: activeLobby==null");
        } else {
            this.f7091d.leaveLobby(this.f7101n);
        }
        m295a("stopLobby: activeSteamSockets:" + this.f7099l.size());
        for (C1167k c1167k : this.f7099l.values()) {
            try {
                c1167k.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f7099l.clear();
        this.f7101n = null;
        this.f7103p = null;
    }

    /* renamed from: g */
    public void m286g() {
        if (this.f7101n == null) {
        }
        if (this.f7101n == null) {
            GameEngine.getInstance().m1116i("Error: No steam lobby has been started");
        } else {
            this.f7090c.activateGameOverlayInviteDialog(this.f7101n);
        }
    }

    /* renamed from: k */
    public void m283k() {
        this.f7094g.m270c();
    }

    /* renamed from: l */
    public void m282l() {
        this.f7094g.m267d();
    }

    /* renamed from: m */
    public void m281m() {
        m280n().m273b();
    }

    /* renamed from: a */
    public void m297a(C0824b c0824b) {
        m280n().m268c(c0824b);
    }

    /* renamed from: b */
    public void m292b(C0824b c0824b) {
        m280n().m271b(c0824b);
    }

    /* renamed from: a */
    public void m296a(C0824b c0824b, boolean z, String str) {
        m280n().m274a(c0824b, z, str);
    }
}
