package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.i.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/c.class */
public class Connection {

    /* renamed from: W */
    private final C0831ad f5759W;

    /* renamed from: c */
    public int f5760c;

    /* renamed from: d */
    public Socket f5761d;

    /* renamed from: e */
    InetAddress f5762e;

    /* renamed from: g */
    public long f5763g;

    /* renamed from: h */
    public boolean f5764h;

    /* renamed from: i */
    public boolean f5765i;

    /* renamed from: j */
    public Connection f5766j;

    /* renamed from: l */
    C0861at f5767l;

    /* renamed from: m */
    public String f5768m;

    /* renamed from: n */
    public String f5769n;

    /* renamed from: o */
    public String f5770o;

    /* renamed from: p */
    public boolean f5771p;

    /* renamed from: q */
    public boolean f5772q;

    /* renamed from: r */
    public boolean f5773r;

    /* renamed from: s */
    public boolean f5774s;

    /* renamed from: t */
    public boolean f5775t;

    /* renamed from: u */
    public boolean f5776u;

    /* renamed from: v */
    public boolean f5777v;

    /* renamed from: w */
    public boolean f5778w;

    /* renamed from: x */
    public int f5779x;

    /* renamed from: y */
    public int f5780y;

    /* renamed from: z */
    public C0187e f5781z;

    /* renamed from: F */
    RunnableC0869d f5782F;

    /* renamed from: G */
    RunnableC0870e f5783G;

    /* renamed from: H */
    Thread f5784H;

    /* renamed from: I */
    Thread f5785I;

    /* renamed from: L */
    public String f5786L;

    /* renamed from: M */
    public int f5787M;

    /* renamed from: N */
    public boolean f5788N;

    /* renamed from: O */
    public boolean f5789O;

    /* renamed from: P */
    public int f5790P;

    /* renamed from: Q */
    public boolean f5791Q;

    /* renamed from: R */
    public int f5792R;

    /* renamed from: S */
    public long f5793S;

    /* renamed from: T */
    public boolean f5794T;

    /* renamed from: U */
    volatile int f5795U;

    /* renamed from: V */
    volatile int f5796V;

    /* renamed from: a */
    volatile boolean f5797a = false;

    /* renamed from: b */
    volatile boolean f5798b = false;

    /* renamed from: f */
    ConcurrentLinkedQueue f5799f = new ConcurrentLinkedQueue();

    /* renamed from: k */
    public int f5800k = -1;

    /* renamed from: A */
    int f5801A = -1;

    /* renamed from: B */
    long f5802B = -1;

    /* renamed from: C */
    boolean f5803C = false;

    /* renamed from: D */
    boolean f5804D = false;

    /* renamed from: E */
    public int f5805E = 999999;

    /* renamed from: J */
    boolean f5806J = false;

    /* renamed from: K */
    boolean f5807K = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m1509a(Connection connection, boolean z, boolean z2) {
        connection.m1506a(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C0831ad m1510a(Connection connection) {
        return connection.f5759W;
    }

    public Connection(C0831ad c0831ad, Socket socket) {
        this.f5759W = c0831ad;
        this.f5761d = socket;
        synchronized (this.f5759W.f5603bg) {
            this.f5760c = this.f5759W.f5602bf;
            this.f5759W.f5602bf++;
        }
        this.f5787M = CommonUtils.m2360a(1, 1000000);
    }

    /* renamed from: a */
    public boolean m1512a() {
        if (this.f5793S < System.currentTimeMillis() - 10000) {
            this.f5793S = System.currentTimeMillis();
            this.f5792R = 0;
        }
        if (this.f5792R > 100) {
            if (!this.f5794T) {
                this.f5794T = true;
                m1501c("Command limit was reached");
                return true;
            }
            return true;
        }
        this.f5792R++;
        return false;
    }

    /* renamed from: b */
    public int m1504b() {
        if (this.f5802B == -1) {
            return -2;
        }
        if (this.f5802B < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f5801A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1502c() {
        C0187e c0187e = this.f5781z;
        if (c0187e != null) {
            return c0187e.f1305k;
        }
        return -1;
    }

    /* renamed from: d */
    public synchronized void m1500d() {
        this.f5783G = new RunnableC0870e(this);
        this.f5785I = new Thread(this.f5783G);
        this.f5785I.setDaemon(true);
        this.f5785I.start();
        this.f5782F = new RunnableC0869d(this, null);
        this.f5784H = new Thread(this.f5782F);
        this.f5784H.setDaemon(true);
        this.f5784H.start();
    }

    /* renamed from: i */
    private void m1494i() {
        C0187e c0187e;
        this.f5797a = true;
        if (this.f5759W.f5485C && !this.f5759W.m1627n() && (c0187e = this.f5781z) != null) {
            this.f5781z = null;
            if (this.f5759W.m1672d(c0187e) == null) {
                c0187e.m6414G();
                this.f5759W.m1787P();
                ActivityC0122n.m6910o();
            }
        }
        if (this.f5784H != null) {
            this.f5784H.interrupt();
        }
        this.f5759W.m1694b(this);
        this.f5771p = false;
        if (this.f5772q) {
            this.f5759W.m1679c(this, "Closing");
        }
    }

    /* renamed from: j */
    private synchronized void m1493j() {
        if (this.f5797a) {
            return;
        }
        this.f5798b = true;
        if (this.f5783G != null) {
            this.f5783G.m1491a();
        }
        if (this.f5784H != null) {
            this.f5784H.interrupt();
        }
        this.f5759W.m1694b(this);
    }

    /* renamed from: a */
    public void m1508a(String str) {
        C0859ar c0859ar = new C0859ar();
        if (str == null) {
            str = "NULL";
        }
        try {
            c0859ar.m1553c(str);
            m1511a(c0859ar.m1560b(111));
            m1493j();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1506a(boolean z, boolean z2) {
        m1505a(z, z2, "Time out");
    }

    /* renamed from: e */
    public String m1498e() {
        String str = "<null>";
        if (this.f5781z != null) {
            str = this.f5781z.f1315u;
        }
        return str;
    }

    /* renamed from: f */
    public String m1497f() {
        InetAddress inetAddress;
        if (this.f5766j != null) {
            return this.f5769n;
        }
        try {
            Socket socket = this.f5761d;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                return inetAddress.getHostAddress();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public String m1496g() {
        if (this.f5766j != null) {
            return this.f5769n == null ? "<forwarded unknown>" : this.f5769n;
        }
        String str = "<no socket>";
        try {
            Socket socket = this.f5761d;
            if (socket != null) {
                str = "<no bond socket>";
                InetAddress inetAddress = socket.getInetAddress();
                if (inetAddress != null) {
                    str = inetAddress.getHostAddress();
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "<socket error>";
        }
    }

    /* renamed from: a */
    public synchronized void m1505a(boolean z, boolean z2, String str) {
        if (!this.f5797a) {
            m1501c("handleRemoteDisconnect");
            String str2 = null;
            if (this.f5781z != null) {
                str2 = this.f5781z.f1315u;
            }
            String str3 = null;
            if (this.f5781z != null) {
                String str4 = "player";
                String str5 = VariableScope.nullOrMissingString;
                if (this.f5781z.m6374b()) {
                    str4 = "spectator";
                } else if (this.f5759W.f5533bm) {
                    str5 = this.f5781z.m6375a(false, false) == 0 ? " (Had no units)" : " (Team " + this.f5781z.m6325h() + ")";
                }
                str3 = str4 + " '" + this.f5781z.f1315u + "' disconnected" + str5;
            } else if (this.f5771p) {
                if (this.f5774s && this.f5772q) {
                    str3 = "relay server disconnected";
                } else {
                    str3 = "a player disconnected";
                }
            }
            if (!this.f5759W.f5485C) {
                str3 = "The server disconnected";
            }
            if (str3 != null && str != null) {
                str3 = str3 + "  (" + C0831ad.m1636i(str) + ")";
            }
            m1494i();
            if (str3 != null) {
                boolean z3 = false;
                if (this.f5781z != null && this.f5759W.f5485C && this.f5759W.m1672d(this.f5781z) != null) {
                    z3 = true;
                }
                if (!z3) {
                    if (!this.f5759W.f5485C) {
                        this.f5759W.m1654f(str3);
                    } else {
                        this.f5759W.m1634j(str3);
                    }
                } else {
                    m1501c("Not sending: '" + str3 + "' still another active connection");
                }
            }
            this.f5759W.f5556d.mo429b(this, str2);
        } else {
            m1501c("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.f5783G != null) {
            this.f5783G.m1491a();
        }
        if (z2) {
            this.f5806J = true;
        }
        if (z) {
            this.f5807K = true;
        }
        if (this.f5806J && this.f5807K) {
            try {
                this.f5761d.close();
            } catch (IOException e) {
                GameEngine.m1188a("Error while closing network socket", (Throwable) e);
            }
            this.f5785I = null;
            this.f5784H = null;
            this.f5783G = null;
            this.f5782F = null;
            if (this.f5799f != null) {
                this.f5799f.clear();
            }
        }
    }

    /* renamed from: a */
    public void m1507a(String str, Throwable th) {
        GameEngine.m1188a(m1499d(str), th);
    }

    /* renamed from: b */
    public void m1503b(String str) {
        GameEngine.m1145b(m1499d(str));
    }

    /* renamed from: c */
    public void m1501c(String str) {
        GameEngine.PrintLog(m1499d(str));
    }

    /* renamed from: d */
    public String m1499d(String str) {
        C0187e c0187e;
        String str2 = "id:" + this.f5760c + ": " + str;
        if (this.f5781z != null) {
            str2 = str2 + " (Player:" + c0187e.f1315u + ")";
        }
        return str2;
    }

    /* renamed from: a */
    public void m1511a(C0861at c0861at) {
        if (this.f5783G == null && this.f5797a) {
            return;
        }
        this.f5783G.m1490a(c0861at);
    }

    /* renamed from: h */
    public boolean m1495h() {
        return !this.f5797a;
    }

    public void finalize() {
        try {
            if (this.f5761d == null || this.f5761d.isClosed()) {
                return;
            }
            GameEngine.PrintLog("Connection::finalize called on unclosed socket (index:" + this.f5760c + ")");
            if (this.f5761d.getInetAddress() == null) {
                GameEngine.PrintLog("Skipping possible steam socket");
            }
            try {
                this.f5761d.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}
