package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.game.C0162e;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.p008a.ActivityC0092l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.g.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/c.class */
public class C0698c {

    /* renamed from: R */
    private final Hcat_Multiplaye f4915R;

    /* renamed from: c */
    public int f4916c;

    /* renamed from: d */
    Socket f4917d;

    /* renamed from: e */
    InetAddress f4918e;

    /* renamed from: g */
    public long f4919g;

    /* renamed from: h */
    public boolean f4920h;

    /* renamed from: i */
    public boolean f4921i;

    /* renamed from: j */
    public C0698c f4922j;

    /* renamed from: l */
    C0692ar f4923l;

    /* renamed from: m */
    public String f4924m;

    /* renamed from: n */
    public boolean f4925n;

    /* renamed from: o */
    public boolean f4926o;

    /* renamed from: p */
    public boolean f4927p;

    /* renamed from: q */
    public boolean f4928q;

    /* renamed from: r */
    public boolean f4929r;

    /* renamed from: s */
    public boolean f4930s;

    /* renamed from: t */
    public boolean f4931t;

    /* renamed from: u */
    public boolean f4932u;

    /* renamed from: v */
    public int f4933v;

    /* renamed from: w */
    public C0162e f4934w;

    /* renamed from: C */
    RunnableC0700d f4935C;

    /* renamed from: D */
    RunnableC0701e f4936D;

    /* renamed from: E */
    Thread f4937E;

    /* renamed from: F */
    Thread f4938F;

    /* renamed from: I */
    public String f4939I;

    /* renamed from: J */
    public int f4940J;

    /* renamed from: K */
    public int f4941K;

    /* renamed from: L */
    public boolean f4942L;

    /* renamed from: M */
    public int f4943M;

    /* renamed from: N */
    public long f4944N;

    /* renamed from: O */
    public boolean f4945O;

    /* renamed from: P */
    volatile int f4946P;

    /* renamed from: Q */
    volatile int f4947Q;

    /* renamed from: a */
    volatile boolean f4948a = false;

    /* renamed from: b */
    volatile boolean f4949b = false;

    /* renamed from: f */
    ConcurrentLinkedQueue f4950f = new ConcurrentLinkedQueue();

    /* renamed from: k */
    public int f4951k = -1;

    /* renamed from: x */
    int f4952x = -1;

    /* renamed from: y */
    long f4953y = -1;

    /* renamed from: z */
    boolean f4954z = false;

    /* renamed from: A */
    boolean f4955A = false;

    /* renamed from: B */
    public int f4956B = 999999;

    /* renamed from: G */
    boolean f4957G = false;

    /* renamed from: H */
    boolean f4958H = false;

    public C0698c(Hcat_Multiplaye adVar, Socket socket) {
        this.f4915R = adVar;
        this.f4917d = socket;
        synchronized (this.f4915R.f4769aZ) {
            this.f4916c = this.f4915R.f4768aY;
            this.f4915R.f4768aY++;
        }
        this.f4940J = C0654f.m1555a(1, 1000000);
    }

    /* renamed from: a */
    public boolean m1133a() {
        if (this.f4944N < System.currentTimeMillis() - 10000) {
            this.f4944N = System.currentTimeMillis();
            this.f4943M = 0;
        }
        if (this.f4943M <= 100) {
            this.f4943M++;
            return false;
        } else if (this.f4945O) {
            return true;
        } else {
            this.f4945O = true;
            m1122c("Command limit was reached");
            return true;
        }
    }

    /* renamed from: b */
    public int m1126b() {
        if (this.f4953y == -1) {
            return -2;
        }
        if (this.f4953y < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f4952x;
    }

    /* renamed from: c */
    int m1123c() {
        C0162e eVar = this.f4934w;
        if (eVar != null) {
            return eVar.f1230i;
        }
        return -1;
    }

    /* renamed from: d */
    public synchronized void m1121d() {
        this.f4936D = new RunnableC0701e(this);
        this.f4938F = new Thread(this.f4936D);
        this.f4938F.setDaemon(true);
        this.f4938F.start();
        this.f4935C = new RunnableC0700d(this);
        this.f4937E = new Thread(this.f4935C);
        this.f4937E.setDaemon(true);
        this.f4937E.start();
    }

    /* renamed from: h */
    private void m1116h() {
        C0162e eVar;
        this.f4948a = true;
        if (this.f4915R.f4664A && !this.f4915R.m1244j() && (eVar = this.f4934w) != null) {
            this.f4934w = null;
            if (this.f4915R.m1300b(eVar) == null) {
                eVar.m3778E();
                this.f4915R.m1384H();
                ActivityC0092l.m4175k();
            }
        }
        if (this.f4937E != null) {
            this.f4937E.interrupt();
        }
        this.f4915R.m1347a(this);
        this.f4925n = false;
        if (this.f4926o) {
            this.f4915R.m1246i(this);
        }
    }

    /* renamed from: i */
    private synchronized void m1115i() {
        if (!this.f4948a) {
            this.f4949b = true;
            if (this.f4936D != null) {
                this.f4936D.m1113a();
            }
            if (this.f4937E != null) {
                this.f4937E.interrupt();
            }
            this.f4915R.m1347a(this);
        }
    }

    /* renamed from: a */
    public void m1129a(String str) {
        C0690ap apVar = new C0690ap();
        if (str == null) {
            str = "NULL";
        }
        try {
            apVar.m1174c(str);
            m1132a(apVar.m1181b(111));
            m1115i();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m1124b(boolean z, boolean z2) {
        m1127a(z, z2);
    }

    /* renamed from: e */
    public String m1119e() {
        String str = "<null>";
        if (this.f4934w != null) {
            str = this.f4934w.f1238q;
        }
        return str;
    }

    /* renamed from: f */
    public String m1118f() {
        String str = "<no socket>";
        try {
            Socket socket = this.f4917d;
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
    public synchronized void m1127a(boolean z, boolean z2) {
        if (!this.f4948a) {
            m1122c("handleRemoteDisconnect");
            String str = null;
            if (this.f4934w != null) {
                str = this.f4934w.f1238q;
            }
            String str2 = null;
            if (this.f4934w != null) {
                String str3 = "player";
                String str4 = "";
                if (this.f4934w.m3745b()) {
                    str3 = "spectator";
                } else if (this.f4915R.isGameStart_Hcat) {
                    str4 = this.f4934w.m3746a(false, false) == 0 ? " (Had no units)" : " (Team " + this.f4934w.m3705f() + ")";
                }
                str2 = str3 + " '" + this.f4934w.f1238q + "' disconnected" + str4;
            } else if (this.f4925n) {
                if (!this.f4928q || !this.f4926o) {
                    str2 = "a player disconnected";
                } else {
                    str2 = "relay server disconnected";
                }
            }
            if (!this.f4915R.f4664A) {
                str2 = "The server disconnected";
            }
            m1116h();
            if (str2 != null) {
                boolean z3 = false;
                if (!(this.f4934w == null || !this.f4915R.f4664A || this.f4915R.m1300b(this.f4934w) == null)) {
                    z3 = true;
                }
                if (z3) {
                    m1122c("Not sending: '" + str2 + "' still another active connection");
                } else if (!this.f4915R.f4664A) {
                    this.f4915R.m1266e(str2);
                } else {
                    this.f4915R.m1249h(str2);
                }
            }
            this.f4915R.f4726c.mo366b(this, str);
        } else {
            m1122c("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.f4936D != null) {
            this.f4936D.m1113a();
        }
        if (z2) {
            this.f4957G = true;
        }
        if (z) {
            this.f4958H = true;
        }
        if (this.f4957G && this.f4958H) {
            try {
                this.f4917d.close();
            } catch (IOException e) {
                AbstractC0789l.m727a("Error while closing network socket", (Throwable) e);
            }
            this.f4938F = null;
            this.f4937E = null;
            this.f4936D = null;
            this.f4935C = null;
            if (this.f4950f != null) {
                this.f4950f.clear();
            }
        }
    }

    /* renamed from: a */
    public void m1128a(String str, Throwable th) {
        AbstractC0789l.m727a(m1120d(str), th);
    }

    /* renamed from: b */
    public void m1125b(String str) {
        AbstractC0789l.m695b(m1120d(str));
    }

    /* renamed from: c */
    public void m1122c(String str) {
        AbstractC0789l.m683d(m1120d(str));
    }

    /* renamed from: d */
    public String m1120d(String str) {
        String str2 = "id:" + this.f4916c + ": " + str;
        if (this.f4934w != null) {
            str2 = str2 + " (Player:" + this.f4934w.f1238q + ")";
        }
        return str2;
    }

    /* renamed from: a */
    public void m1132a(C0692ar arVar) {
        if (this.f4936D != null || !this.f4948a) {
            this.f4936D.m1112a(arVar);
        }
    }

    /* renamed from: g */
    public boolean m1117g() {
        return !this.f4948a;
    }

    public void finalize() {
        try {
            if (this.f4917d != null && !this.f4917d.isClosed()) {
                AbstractC0789l.m683d("Connection::finalize called on unclosed socket (index:" + this.f4916c + ")");
                if (this.f4917d.getInetAddress() == null) {
                    AbstractC0789l.m683d("Skipping possible steam socket");
                }
                try {
                    this.f4917d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}
