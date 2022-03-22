package com.corrodinggames.rts.java.p046c;

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
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p036g.C0698c;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b.class */
public class C0891b extends C0796a {

    /* renamed from: b */
    C0894d f5976b;

    /* renamed from: c */
    SteamFriends f5977c;

    /* renamed from: d */
    SteamMatchmaking f5978d;

    /* renamed from: e */
    C0895e f5979e;

    /* renamed from: f */
    C0896f f5980f;

    /* renamed from: g */
    C0897g f5981g;

    /* renamed from: h */
    SteamNetworking f5982h;

    /* renamed from: i */
    C0893c f5983i;

    /* renamed from: j */
    SteamUtils f5984j;

    /* renamed from: k */
    boolean f5985k = false;

    /* renamed from: l */
    HashMap f5986l = new HashMap();

    /* renamed from: m */
    ByteBuffer f5987m;

    /* renamed from: n */
    SteamID f5988n;

    /* renamed from: o */
    boolean f5989o;

    /* renamed from: p */
    SteamID f5990p;

    /* renamed from: m */
    public C0897g m238m() {
        return this.f5981g;
    }

    /* renamed from: b */
    public void mo641b() {
        if (this.f5985k) {
            AbstractC0789l.m683d("SteamEngine - init already called");
            return;
        }
        this.f5985k = true;
        AbstractC0789l.m683d("SteamEngine - java steamEngine init()");
        try {
            if (!SteamAPI.init()) {
                AbstractC0789l.m695b("steamAPI init failed");
                mo638d();
                return;
            }
            this.f5987m = ByteBuffer.allocateDirect(100000);
            this.f5976b = new C0894d(this);
            this.f5977c = new SteamFriends(this.f5976b);
            this.f5979e = new C0895e(this);
            this.f5978d = new SteamMatchmaking(this.f5979e);
            this.f5980f = new C0896f(this);
            this.f5982h = new SteamNetworking(this.f5980f, SteamNetworking.API.Client);
            this.f5981g = new C0897g(this);
            try {
                this.f5981g.m235a(new SteamUGC(this.f5981g.m237a()));
                this.f5983i = new C0893c(this);
                this.f5984j = new SteamUtils(this.f5983i);
            } catch (RuntimeException e) {
                e.printStackTrace();
                throw new SteamException("Failed to create workshop");
            }
        } catch (SteamException e2) {
            e2.printStackTrace();
            mo638d();
        }
    }

    /* renamed from: a */
    public void mo644a(float f) {
        SteamAPI.runCallbacks();
        if (this.f5982h != null) {
            if (AbstractC0789l.f5554aC != null) {
                AbstractC0789l.m683d("Joining game from commandline invite:" + AbstractC0789l.f5554aC);
                long parseLong = Long.parseLong(AbstractC0789l.f5554aC);
                AbstractC0789l.f5554aC = null;
                this.f5978d.joinLobby(SteamID.createFromNativeHandle(parseLong));
            }
            while (true) {
                int isP2PPacketAvailable = this.f5982h.isP2PPacketAvailable(0);
                if (isP2PPacketAvailable != 0) {
                    if (isP2PPacketAvailable > this.f5987m.capacity()) {
                        AbstractC0789l.m695b("nextPacketSize:" + isP2PPacketAvailable + " larger then byteBuffer:" + this.f5987m.capacity() + " resizing");
                        this.f5987m = ByteBuffer.allocateDirect(isP2PPacketAvailable);
                    }
                    SteamID steamID = new SteamID();
                    try {
                        this.f5987m.clear();
                        int readP2PPacket = this.f5982h.readP2PPacket(steamID, this.f5987m, 0);
                        if (readP2PPacket == 0) {
                            AbstractC0789l.m695b("readP2PPacket with rtn==" + readP2PPacket);
                        }
                        C0899i iVar = (C0899i) this.f5986l.get(steamID);
                        if (iVar != null && iVar.isClosed()) {
                            AbstractC0789l.m695b("Removing stale steam socket");
                            this.f5986l.remove(steamID);
                            iVar = null;
                        }
                        if (iVar == null) {
                            m250b(steamID);
                            iVar = (C0899i) this.f5986l.get(steamID);
                        }
                        if (iVar == null) {
                            AbstractC0789l.m683d("Could not find remote ID steamSocket: " + steamID);
                        } else {
                            byte[] bArr = new byte[this.f5987m.limit()];
                            this.f5987m.get(bArr);
                            iVar.f6004c.m226a(bArr);
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
    public void mo638d() {
        AbstractC0789l.m695b("JavaSteamEngine: disableSteam");
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u != null) {
            u.m670h("Steam connection failed.");
        } else {
            AbstractC0789l.m683d("cannot show alert game has not been created");
        }
        C0796a.f5642a = new C0796a();
    }

    /* renamed from: c */
    public String mo639c() {
        return this.f5977c.getPersonaName();
    }

    /* renamed from: f */
    public boolean mo636f() {
        return false;
    }

    /* renamed from: a */
    public void m252a(String str) {
        AbstractC0789l.m683d("Steam: " + str);
    }

    /* renamed from: b */
    public void m248b(String str) {
        AbstractC0789l.m695b("Steam: " + str);
    }

    /* renamed from: i */
    public void mo633i() {
        m252a("createLobby");
        if (this.f5988n != null) {
            m248b("createLobby: activeLobby!=null");
        }
        this.f5978d.createLobby(SteamMatchmaking.LobbyType.FriendsOnly, 10);
    }

    /* renamed from: a */
    public synchronized void m255a(SteamID steamID) {
        AbstractC0789l.m651u();
        this.f5988n = steamID;
    }

    /* renamed from: b */
    public C0698c m250b(SteamID steamID) {
        AbstractC0789l.m683d("addPeer: " + steamID);
        AbstractC0789l u = AbstractC0789l.m651u();
        C0899i iVar = (C0899i) this.f5986l.get(steamID);
        if (iVar != null) {
            if (iVar.isClosed()) {
                this.f5986l.remove(steamID);
            } else {
                m248b("addPeer, user already exists");
                try {
                    iVar.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        C0899i iVar2 = new C0899i(this, steamID);
        C0698c cVar = new C0698c(u.f5486bF, iVar2);
        try {
            cVar.f4921i = true;
            cVar.m1121d();
            u.f5486bF.f4766aV.add(cVar);
            this.f5986l.put(steamID, iVar2);
            u.f5486bF.m1385I();
            return cVar;
        } catch (IOException e2) {
            e2.printStackTrace();
            cVar.m1129a("crash");
            return null;
        }
    }

    /* renamed from: c */
    public void m246c(SteamID steamID) {
        AbstractC0789l.m683d("connectTo: " + steamID);
        C0899i iVar = (C0899i) this.f5986l.get(steamID);
        if (iVar != null) {
            if (iVar.isClosed()) {
                this.f5986l.remove(steamID);
            } else {
                m248b("connectTo, user already exists");
                try {
                    iVar.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        AbstractC0789l.m651u();
        if (!this.f5989o) {
            ScriptEngine.getInstance().addRunnableToQueue(new RunnableC08921(steamID));
            return;
        }
        m252a("connectTo as server?");
        m250b(steamID);
    }

    /* renamed from: com.corrodinggames.rts.java.c.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b$1.class */
    class RunnableC08921 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SteamID f5991a;

        RunnableC08921(SteamID steamID) {
            this.f5991a = steamID;
        }

        public void run() {
            AbstractC0789l u = AbstractC0789l.m651u();
            try {
                C0891b.this.m252a("connectTo runnable start");
                Root root = ScriptEngine.getInstance().getRoot();
                u.f5486bF.m1295b("starting new");
                C0891b.this.f5988n = this.f5991a;
                C0891b.this.f5990p = C0891b.this.f5978d.getLobbyOwner(C0891b.this.f5988n);
                String str = u.f5479by.lastNetworkPlayerName;
                String c = C0796a.m645a().mo639c();
                if (c != null && str == null) {
                    str = C0654f.m1541a(c.replace(" ", "_"), 20);
                }
                u.f5486bF.f4660w = str;
                C0899i iVar = new C0899i(C0891b.this, C0891b.this.f5990p);
                C0891b.this.f5986l.put(C0891b.this.f5990p, iVar);
                u.f5486bF.m1332a(iVar);
                Iterator it = u.f5486bF.f4766aV.iterator();
                while (it.hasNext()) {
                    ((C0698c) it.next()).f4921i = true;
                }
                C0891b.this.m252a("connected");
                root.showBattleroom();
                C0891b.this.m252a("connectTo runnable end");
            } catch (IOException e) {
                u.m687c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public void mo632j() {
        m252a("stopLobby");
        if (this.f5988n == null) {
            m248b("stopLobby: activeLobby==null");
        } else {
            this.f5978d.leaveLobby(this.f5988n);
        }
        m252a("stopLobby: activeSteamSockets:" + this.f5986l.size());
        for (C0899i iVar : this.f5986l.values()) {
            try {
                iVar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f5986l.clear();
        this.f5988n = null;
        this.f5990p = null;
    }

    /* renamed from: g */
    public void mo635g() {
        if (this.f5988n == null) {
        }
        if (this.f5988n == null) {
            AbstractC0789l.m651u().m670h("Error: No steam lobby has been started");
        } else {
            this.f5977c.activateGameOverlayInviteDialog(this.f5988n);
        }
    }

    /* renamed from: k */
    public void mo631k() {
        this.f5981g.m229c();
    }

    /* renamed from: l */
    public void mo630l() {
        m238m().m231b();
    }

    /* renamed from: a */
    public void mo643a(C0657b bVar) {
        m238m().m228c(bVar);
    }

    /* renamed from: b */
    public void mo640b(C0657b bVar) {
        m238m().m230b(bVar);
    }

    /* renamed from: a */
    public void mo642a(C0657b bVar, boolean z, String str) {
        m238m().m232a(bVar, z, str);
    }
}
