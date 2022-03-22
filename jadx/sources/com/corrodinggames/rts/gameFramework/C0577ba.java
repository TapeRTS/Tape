package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.p036g.C0683aj;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ba.class */
public class C0577ba {

    /* renamed from: b */
    public static boolean f3945b = true;

    /* renamed from: c */
    public static boolean f3946c = true;

    /* renamed from: d */
    public static boolean f3947d = true;

    /* renamed from: e */
    public static boolean f3948e = true;

    /* renamed from: f */
    public boolean f3949f;

    /* renamed from: g */
    int f3950g;

    /* renamed from: h */
    int f3951h;

    /* renamed from: i */
    boolean f3952i;

    /* renamed from: j */
    int f3953j;

    /* renamed from: k */
    boolean f3954k;

    /* renamed from: m */
    public int f3955m;

    /* renamed from: n */
    public int f3956n;

    /* renamed from: o */
    public int f3957o;

    /* renamed from: p */
    public String f3958p;

    /* renamed from: q */
    boolean f3959q;

    /* renamed from: N */
    private volatile boolean f3960N;

    /* renamed from: r */
    String f3961r;

    /* renamed from: s */
    boolean f3962s;

    /* renamed from: u */
    C0580bd f3963u;

    /* renamed from: v */
    C0580bd f3964v;

    /* renamed from: w */
    int f3965w;

    /* renamed from: x */
    int f3966x;

    /* renamed from: y */
    int f3967y;

    /* renamed from: z */
    int f3968z;

    /* renamed from: A */
    FileInputStream f3969A;

    /* renamed from: B */
    BufferedInputStream f3970B;

    /* renamed from: C */
    DataInputStream f3971C;

    /* renamed from: D */
    C0707k f3972D;

    /* renamed from: E */
    FileOutputStream f3973E;

    /* renamed from: F */
    BufferedOutputStream f3974F;

    /* renamed from: G */
    DataOutputStream f3975G;

    /* renamed from: H */
    C0690ap f3976H;

    /* renamed from: I */
    RunnableC0578bb f3977I;

    /* renamed from: J */
    Thread f3978J;

    /* renamed from: M */
    public boolean f3979M;

    /* renamed from: a */
    String f3980a = "replays/";

    /* renamed from: l */
    public boolean f3981l = false;

    /* renamed from: t */
    public int f3982t = 1;

    /* renamed from: K */
    Object f3983K = new Object();

    /* renamed from: L */
    public boolean f3984L = false;

    /* renamed from: a */
    static /* synthetic */ boolean m2014a(C0577ba baVar) {
        return baVar.f3960N;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m2013a(C0577ba baVar, boolean z) {
        baVar.f3960N = z;
        return z;
    }

    /* renamed from: a */
    public static void m2011a(String str) {
        AbstractC0789l.m683d("Replay: " + str);
    }

    /* renamed from: b */
    public static void m2004b(String str) {
        AbstractC0789l.m695b("Replay: " + str);
    }

    /* renamed from: a */
    public static void m2009a(String str, Exception exc) {
        AbstractC0789l.m727a("Replay: " + str, (Throwable) exc);
    }

    /* renamed from: a */
    public File m2008a(String str, boolean z) {
        File file = new File(C0856y.m384a(str, this.f3980a));
        if (z) {
            file.getParentFile().mkdirs();
            if (!file.canWrite()) {
            }
        }
        return file;
    }

    /* renamed from: a */
    public void m2015a(Context context) {
    }

    /* renamed from: a */
    public void m2018a() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5583bc != 0.0f) {
            u.f5583bc = 0.0f;
        } else {
            u.f5583bc = 1.0f;
        }
    }

    /* renamed from: b */
    public void m2005b() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5583bc == 1.0f) {
            u.f5583bc = 2.0f;
        } else if (u.f5583bc == 2.0f) {
            u.f5583bc = 4.0f;
        } else if (u.f5583bc == 4.0f) {
            u.f5583bc = 8.0f;
        } else if (u.f5583bc == 8.0f) {
            u.f5583bc = 16.0f;
        } else if (u.f5583bc == 16.0f) {
            u.f5583bc = 32.0f;
        } else if (u.f5583bc == 32.0f) {
            u.f5583bc = 64.0f;
        } else if (u.f5583bc == 64.0f) {
            u.f5583bc = 1.0f;
        } else {
            u.f5583bc = 1.0f;
        }
    }

    /* renamed from: a */
    public void m2016a(int i, String str, String str2, int i2) {
        RunnableC0578bb bbVar = this.f3977I;
        if (this.f3960N && !this.f3962s) {
            if (str2.startsWith("-t ")) {
            }
            C0580bd bdVar = new C0580bd();
            bdVar.f3999a = i2;
            bdVar.f4005g = new C0579bc();
            bdVar.f4005g.f3996a = i;
            bdVar.f4005g.f3997b = str;
            bdVar.f4005g.f3998c = str2;
            if (bbVar == null) {
                AbstractC0789l.m676f("Failed to record chat message, replay might have already stopped");
            } else {
                bbVar.m1991a(bdVar);
            }
        }
    }

    /* renamed from: a */
    public void m2006a(byte[] bArr, int i, int i2, int i3, float f, float f2) {
        RunnableC0578bb bbVar = this.f3977I;
        if (this.f3960N && !this.f3962s) {
            C0580bd bdVar = new C0580bd();
            bdVar.f3999a = i;
            bdVar.f4004f = bArr;
            bdVar.f4006h = i2;
            bdVar.f4007i = i3;
            bdVar.f4008j = f;
            bdVar.f4009k = f2;
            if (bbVar == null) {
                AbstractC0789l.m676f("Failed to save resync, replay might have already stopped");
            } else {
                bbVar.m1991a(bdVar);
            }
        }
    }

    /* renamed from: a */
    public void m2012a(C0651e eVar, int i) {
        RunnableC0578bb bbVar = this.f3977I;
        if (this.f3960N && !this.f3962s) {
            if (bbVar == null) {
                AbstractC0789l.m676f("Failed to record command, replay might have already stopped");
                return;
            }
            C0580bd bdVar = new C0580bd();
            bdVar.f4003e = eVar.m1602f();
            bdVar.f3999a = i;
            bbVar.m1991a(bdVar);
            this.f3951h++;
            if (this.f3951h > 5) {
                this.f3951h = 0;
                AbstractC0789l u = AbstractC0789l.m651u();
                C0580bd bdVar2 = new C0580bd();
                bdVar2.f4001c = Long.valueOf(m1999e());
                bdVar2.f3999a = u.f5585bg;
                bbVar.m1991a(bdVar2);
            }
        }
    }

    /* renamed from: c */
    public void m2003c() {
        if (this.f3960N && !this.f3962s) {
            AbstractC0789l u = AbstractC0789l.m651u();
            C0580bd bdVar = new C0580bd();
            C0690ap apVar = new C0690ap();
            try {
                apVar.m1175c(0);
                apVar.mo1109a(u.f5486bF.f4743ah.size());
                Iterator it = u.f5486bF.f4743ah.iterator();
                while (it.hasNext()) {
                    apVar.m1197a(((C0683aj) it.next()).f4829b);
                }
                bdVar.f4002d = apVar.m1173d();
                bdVar.f3999a = u.f5585bg;
                this.f3977I.m1991a(bdVar);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    public void m2001d() {
        synchronized (this.f3983K) {
            try {
                if (this.f3977I != null) {
                    this.f3977I.m1992a();
                    try {
                        this.f3978J.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f3960N = false;
                    this.f3977I = null;
                    this.f3978J = null;
                }
                if (this.f3973E != null) {
                    this.f3975G.flush();
                    this.f3975G.close();
                    this.f3974F.flush();
                    this.f3974F.close();
                    this.f3973E.flush();
                    this.f3973E.close();
                }
                this.f3973E = null;
                this.f3974F = null;
                this.f3975G = null;
                this.f3976H = null;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f3973E = null;
                this.f3974F = null;
                this.f3975G = null;
                this.f3976H = null;
            }
            this.f3959q = false;
            this.f3960N = false;
            this.f3962s = false;
            this.f3961r = null;
            this.f3950g = 0;
            this.f3951h = 0;
            this.f3952i = false;
            this.f3953j = 0;
            this.f3954k = false;
            this.f3965w = 0;
            this.f3982t = 1;
            this.f3966x = 0;
            this.f3967y = 0;
            this.f3968z = 0;
            this.f3955m = -1;
            this.f3956n = 0;
            this.f3957o = -1;
            this.f3958p = null;
            try {
                if (this.f3969A != null) {
                    this.f3971C.close();
                    this.f3970B.close();
                    this.f3969A.close();
                }
                this.f3969A = null;
                this.f3970B = null;
                this.f3971C = null;
                this.f3972D = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f3969A = null;
                this.f3970B = null;
                this.f3971C = null;
                this.f3972D = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [long] */
    /* renamed from: e */
    public long m1999e() {
        AbstractC0515r rVar;
        char c = 0;
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                c = c + (rVar.f5841dH * 1000.0f) + (rVar.f5842dI * 1000.0f) + (rVar.f1450bY * 1.0f) + ((AbstractC0515r) wVar).f5835dA;
            }
        }
        return c;
    }

    /* renamed from: f */
    public void m1997f() {
        if (!this.f3984L) {
            m2001d();
        }
    }

    /* renamed from: c */
    public boolean m2002c(String str) {
        return m2010a(str, m2008a(str, false));
    }

    /* renamed from: j */
    private void m1993j() {
        for (int i = 0; i < AbstractC0171m.f1275a; i++) {
            AbstractC0171m n = AbstractC0171m.m3740n(i);
            if (n != null && (n instanceof C0118a)) {
                ((C0118a) n).f540aG = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2010a(String str, File file) {
        if (this.f3960N) {
            if (this.f3962s) {
                AbstractC0789l.m695b("startReplayingFile: A replay is already playing");
            } else {
                AbstractC0789l.m695b("startReplayingFile: A replay is already saving");
            }
        }
        m2001d();
        AbstractC0789l u = AbstractC0789l.m651u();
        u.m692c();
        u.f5486bF.m1240m();
        this.f3963u = null;
        this.f3959q = false;
        this.f3960N = true;
        this.f3962s = true;
        this.f3961r = str;
        try {
            this.f3969A = new FileInputStream(file);
            this.f3970B = new BufferedInputStream(this.f3969A);
            this.f3971C = new DataInputStream(this.f3970B);
            this.f3972D = new C0707k(this.f3971C);
            String k = this.f3972D.m1071k();
            if (!k.equals("rustedWarfareReplay")) {
                AbstractC0789l.m683d("Header is not correct:" + k);
                AbstractC0789l.m683d("Cannot load replay: File is missing header (check if this file is a replay)");
                u.m731a("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int f = this.f3972D.m1076f();
            int f2 = this.f3972D.m1076f();
            m2011a("Loading save from version: " + f2);
            this.f3972D.m1093a(f2);
            String k2 = this.f3972D.m1071k();
            if (!(f2 == 90 && f == u.m686c(true)) && !this.f3981l) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + k2;
                if (AbstractC0789l.m710al()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                u.m731a(str2, 1);
                m2011a("Replay version: " + f2 + " (" + f + ")");
                m2011a("GameSaver.thisSaveVersion: 90 (" + u.m686c(true) + ")");
                if (!AbstractC0789l.f5457ay) {
                    this.f3960N = false;
                    return false;
                }
            }
            this.f3957o = f2;
            this.f3958p = k2;
            this.f3972D.m1077e();
            this.f3972D.m1082b("gamesave");
            this.f3979M = false;
            this.f3984L = true;
            m2011a("Loading replay initial save");
            u.f5489bI.m387a(this.f3972D, false, false, false);
            this.f3984L = false;
            this.f3972D.m1078d("gamesave");
            if (!this.f3979M) {
                m2011a("ReplayEngine: --- No game setup read ----");
                u.f5486bF.f4763aH.f4818i = true;
                u.f5471bl = u.f5479by.teamUnitCapHostedGame;
                u.f5470bk = u.f5471bl;
            }
            if (!this.f3949f) {
                m1993j();
            }
            m2011a("--- Reply settings ---");
            m2011a("Unit cap: " + u.f5471bl);
            m2011a(u.f5486bF.f4763aH.m1213b());
            m2011a("Starting frame:" + u.f5585bg);
            if (!this.f3949f) {
                for (int i = 0; i < AbstractC0171m.f1275a; i++) {
                    AbstractC0171m n = AbstractC0171m.m3740n(i);
                    if (!(n == null || n.f1238q == null)) {
                        u.f5481bA.f4278e.m1697a("", "Player '" + n.f1238q + "' playing as " + n.m3826I().toLowerCase() + " (team:" + n.m3757f() + ")");
                    }
                }
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m2007a(boolean z) {
        if (AbstractC0789l.f5557aG) {
            if (!AbstractC0789l.f5564aN) {
                return;
            }
        } else if (!AbstractC0789l.f5563aM) {
            return;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4734z && !z && !this.f3984L && u.f5479by.saveMultiplayerReplays) {
            m2000d(u.m719ac() + " [v" + u.m655o() + "] (" + C0654f.m1543a("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    /* renamed from: d */
    public void m2000d(String str) {
        m2011a("Recording replay to: " + str);
        if (this.f3960N) {
            if (this.f3962s) {
                m2004b("startSaving: A replay is already playing");
            } else {
                m2004b("startSaving: A replay is already saving");
            }
        }
        m2001d();
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f3959q = false;
        this.f3960N = true;
        this.f3962s = false;
        this.f3961r = str;
        try {
            this.f3973E = new FileOutputStream(m2008a(str, true));
            this.f3974F = new BufferedOutputStream(this.f3973E);
            this.f3975G = new DataOutputStream(this.f3974F);
            this.f3976H = new C0690ap(this.f3975G);
            this.f3976H.m1174c("rustedWarfareReplay");
            this.f3976H.mo1109a(u.m686c(true));
            this.f3976H.mo1109a(90);
            this.f3976H.m1174c(u.m655o());
            this.f3976H.mo1104a(u.f5575am);
            this.f3976H.m1170e("gamesave");
            u.f5489bI.m388a(this.f3976H);
            this.f3976H.mo1107a("gamesave");
            this.f3975G.flush();
            this.f3977I = new RunnableC0578bb(this);
            this.f3978J = new Thread(this.f3977I);
            this.f3978J.start();
        } catch (IOException e) {
            m2009a("Failed to start recording replay", e);
            AbstractC0789l.m651u().m670h("Failed to start recording replay: " + e.getMessage());
            m2001d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05fe, code lost:
        r0.f5464bb = r0.f1441bB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0607, code lost:
        r6.f3972D.m1078d("end");
        com.corrodinggames.rts.gameFramework.AbstractC0789l.m683d("number of replay commands issued:" + r6.f3966x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0629, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05b6, code lost:
        com.corrodinggames.rts.gameFramework.AbstractC0789l.m694b("replay:updateGameFrame", "end of replay block found");
        r0.f5481bA.f4278e.m1697a("", "Replay has ended");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05d0, code lost:
        if (r0.f5465be != false) goto L_0x05e1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d3, code lost:
        r6.f3959q = true;
        r0.f5583bc = 0.25f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e1, code lost:
        r6.f3959q = false;
        r6.f3960N = false;
        r6.f3962s = false;
        r0 = r0.f5481bA.m1728i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05fb, code lost:
        if (r0 == null) goto L_0x0607;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2017a(float f) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!this.f3959q && this.f3960N && this.f3962s) {
            while (true) {
                if (this.f3963u == null) {
                    try {
                        String v = this.f3972D.m1060v();
                        if ("rc".equals(v)) {
                            this.f3965w++;
                            C0580bd bdVar = new C0580bd();
                            bdVar.f3999a = this.f3972D.m1076f();
                            C0651e b = u.f5494bN.m1955b();
                            b.m1614a(this.f3972D);
                            b.f4551a = true;
                            bdVar.f4003e = b;
                            this.f3972D.m1078d("rc");
                            this.f3963u = bdVar;
                            this.f3956n++;
                            this.f3955m = bdVar.f3999a;
                            if (f3946c) {
                                m2011a("updateGameFrame: Command: " + b.f4555i.f1238q + " count:" + b.m1606d() + " id:" + this.f3965w);
                                if (b.f4556j != null) {
                                    m2011a("updateGameFrame: Waypoint: " + b.f4556j.m3464d().name());
                                    if (b.f4556j.m3479a() != null) {
                                        m2011a("updateGameFrame: Build Type: " + b.f4556j.m3479a().mo3494i());
                                    }
                                }
                                if (AbstractC0197s.m3683c(b.f4572k)) {
                                    m2011a("updateGameFrame: SpecialAction: " + b.f4572k.m3719a());
                                }
                                if (b.f4559n != null) {
                                    m2011a("updateGameFrame: SetAttackMode: " + b.f4559n);
                                }
                                if (b.f4570g) {
                                    m2011a("updateGameFrame: stopOrUndo is set");
                                }
                                if (b.f4563r) {
                                    if (b.f4564s != 0.0f) {
                                        m2011a("updateGameFrame: changeStepRate:" + b.f4564s);
                                    }
                                    if (b.f4566u != 0) {
                                        m2011a("updateGameFrame: systemAction_action:" + b.f4566u);
                                    }
                                }
                                m2011a("updateGameFrame: ------");
                            }
                        } else if ("wait".equals(v)) {
                            C0580bd bdVar2 = new C0580bd();
                            bdVar2.f3999a = this.f3972D.m1076f();
                            bdVar2.f4000b = true;
                            this.f3963u = bdVar2;
                            this.f3972D.m1078d("wait");
                        } else if ("cs".equals(v)) {
                            int f2 = this.f3972D.m1076f();
                            long i = this.f3972D.m1073i();
                            if (!this.f3981l) {
                                if (u.f5585bg != f2) {
                                    AbstractC0789l.m694b("replay:updateGameFrame", "expected:" + f2 + " got:" + u.f5585bg);
                                }
                                if (m1999e() != i) {
                                    m2004b("checksum: checksums don't match!!");
                                    m2004b("checksum: game frameNumber:" + u.f5585bg);
                                    m2004b("checksum: Replay checksum:" + i);
                                    m2004b("checksum: Game checksum  :" + m1999e());
                                    this.f3953j++;
                                    if (!this.f3952i) {
                                        this.f3952i = true;
                                        u.f5481bA.f4278e.m1697a("", "Error: This replay might be out of sync");
                                    }
                                } else {
                                    m2004b("checksum: checksums are matching frameNumber:" + u.f5585bg);
                                }
                            }
                            this.f3972D.m1078d("cs");
                        } else if ("es".equals(v)) {
                            int f3 = this.f3972D.m1076f();
                            if (!this.f3981l) {
                                if (u.f5585bg != f3) {
                                    AbstractC0789l.m694b("replay:updateGameFrame", "expected:" + f3 + " got:" + u.f5585bg);
                                }
                                AbstractC0789l.m683d("replay: -long checksum-");
                                u.f5486bF.m1224z();
                                C0707k kVar = new C0707k(this.f3972D.m1064r());
                                kVar.m1079d();
                                kVar.m1076f();
                                Iterator it = u.f5486bF.f4743ah.iterator();
                                while (it.hasNext()) {
                                    C0683aj ajVar = (C0683aj) it.next();
                                    long i2 = kVar.m1073i();
                                    if (!this.f3954k && i2 == ajVar.f4829b) {
                                        m2011a("extraChecksum: " + ajVar.f4828a + " Checksum [" + f3 + "]. " + i2 + " == " + ajVar.f4829b + " (ok)");
                                    }
                                    if (i2 != ajVar.f4829b) {
                                        if (this.f3953j < 150) {
                                            m2004b("extraChecksum: " + ajVar.f4828a + " Checksum [" + f3 + "]. " + i2 + " != " + ajVar.f4829b + " (failed)");
                                        }
                                        this.f3953j++;
                                    }
                                }
                            }
                            this.f3954k = true;
                            this.f3972D.m1078d("es");
                        } else if ("resync".equals(v)) {
                            int f4 = this.f3972D.m1076f();
                            AbstractC0789l.m683d("Loading resync from replay");
                            if (u.f5585bg != f4) {
                                AbstractC0789l.m694b("replay:resync", "expected:" + f4 + " got:" + u.f5585bg);
                            }
                            int f5 = this.f3972D.m1076f();
                            int f6 = this.f3972D.m1076f();
                            float g = this.f3972D.m1075g();
                            float g2 = this.f3972D.m1075g();
                            u.f5489bI.m387a(new C0707k(this.f3972D.m1064r()), true, true, true);
                            m1993j();
                            u.f5585bg = f5;
                            u.f5467bh = f6;
                            u.f5486bF.f4689ag = 0L;
                            if (g < 0.1d) {
                                Hcat_Multiplaye.m1334a("replay setCurrentStepRate:" + g + " is too small", true);
                            }
                            u.f5486bF.m1365a(g, "replay");
                            u.f5486bF.f4738H = g2;
                            this.f3972D.m1078d("resync");
                        } else if ("chat".equals(v)) {
                            C0580bd bdVar3 = new C0580bd();
                            bdVar3.f3999a = this.f3972D.m1076f();
                            bdVar3.f4005g = new C0579bc();
                            bdVar3.f4005g.f3996a = this.f3972D.m1076f();
                            bdVar3.f4005g.f3997b = this.f3972D.m1072j();
                            bdVar3.f4005g.f3998c = this.f3972D.m1072j();
                            this.f3963u = bdVar3;
                            this.f3972D.m1078d("chat");
                        } else if ("end".equals(v)) {
                            break;
                        } else {
                            AbstractC0789l.m694b("updateGameFrame", "Unknown command block:" + v);
                        }
                    } catch (IOException e) {
                        AbstractC0789l.m694b("updateGameFrame", "IOException, read of replay?");
                        e.printStackTrace();
                        this.f3959q = true;
                        u.f5583bc = 0.25f;
                        u.f5481bA.f4278e.m1697a("", "Replay ended (unexpected)");
                        return;
                    }
                }
                if (this.f3963u != null) {
                    if (this.f3981l) {
                        this.f3963u = null;
                    } else {
                        if (!(!f3945b || this.f3963u == null || this.f3964v == this.f3963u)) {
                            this.f3964v = this.f3963u;
                            AbstractC0789l.m683d("replay: upcoming in " + (this.f3963u.f3999a - u.f5585bg) + " command:" + (this.f3963u.f4003e != null));
                        }
                        if (this.f3963u.f4000b && this.f3966x == 0) {
                            AbstractC0789l.m683d("updateGameFrame: replay: Skipping wait on first resync without commands to avoid delay");
                            this.f3963u = null;
                        } else if (u.f5585bg >= this.f3963u.f3999a) {
                            if (this.f3963u.f4003e != null) {
                                if (u.f5585bg > this.f3963u.f3999a) {
                                    AbstractC0789l.m695b("updateGameFrame: replay incorrect frameNumber, skipping command:" + u.f5585bg + " vs " + this.f3963u.f3999a);
                                } else {
                                    if (f3947d) {
                                        if (this.f3963u.f4003e.f4561p == null) {
                                            AbstractC0789l.m683d("Precommand Team: commandingPlayer==null");
                                        } else {
                                            AbstractC0789l.m683d("Precommand Team id:" + this.f3963u.f4003e.f4561p.f1230i + " credits:" + this.f3963u.f4003e.f4561p.money + " count:" + this.f3963u.f4003e.f4561p.m3735s() + " max:" + this.f3963u.f4003e.f4561p.m3734t());
                                        }
                                    }
                                    if (this.f3963u.f4003e.f4563r && this.f3963u.f4003e.f4566u != 0) {
                                        AbstractC0789l.m694b("replay:issueCommand", "systemAction_action:" + this.f3963u.f4003e.f4566u);
                                    }
                                    this.f3963u.f4003e.m1596k();
                                    if (f3947d && this.f3963u.f4003e.f4561p != null) {
                                        AbstractC0789l.m683d("Postcommand credits:" + this.f3963u.f4003e.f4561p.money + " count:" + this.f3963u.f4003e.f4561p.m3735s() + " max:" + this.f3963u.f4003e.f4561p.m3734t());
                                    }
                                    this.f3966x++;
                                }
                            } else if (this.f3963u.f4005g != null) {
                                C0579bc bcVar = this.f3963u.f4005g;
                                boolean z = false;
                                if (bcVar.f3998c == null) {
                                    z = true;
                                } else {
                                    if (bcVar.f3998c.startsWith("-i ")) {
                                        z = true;
                                    }
                                    if (bcVar.f3998c.equals("<All players ready>")) {
                                        z = true;
                                    }
                                    if (bcVar.f3998c.equals("--too many desync errors, suppressing output--")) {
                                        z = true;
                                    }
                                    if (bcVar.f3998c.startsWith("desync:")) {
                                        z = true;
                                    }
                                }
                                if (!u.f5479by.replaysShowRecordedChat) {
                                    z = true;
                                }
                                if (z) {
                                    AbstractC0789l.m694b("replay:updateGameFrame", "Skipping message: " + bcVar.f3997b + ":" + bcVar.f3998c);
                                } else {
                                    AbstractC0789l.m694b("replay:updateGameFrame", "message: " + bcVar.f3997b + ":" + bcVar.f3998c);
                                    u.f5481bA.f4278e.m1697a(bcVar.f3997b, bcVar.f3998c);
                                }
                            } else if (!this.f3963u.f4000b) {
                                AbstractC0789l.m694b("updateGameFrame", "error: lastReadCommand null action");
                            } else if (f3946c) {
                            }
                            this.f3963u = null;
                        }
                    }
                }
                if (this.f3963u != null) {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void m1998e(String str) {
        if (str.contains("\\") || str.contains("/")) {
            AbstractC0789l.m683d("Cannot get replay with path: " + str);
            return;
        }
        m2008a(str, true).delete();
        File a = m2008a(str + ".map", true);
        if (a.exists()) {
            a.delete();
        }
    }

    /* renamed from: g */
    public boolean m1996g() {
        return this.f3960N;
    }

    /* renamed from: h */
    public boolean m1995h() {
        return this.f3960N && this.f3962s;
    }

    /* renamed from: i */
    public boolean m1994i() {
        return this.f3960N && !this.f3962s;
    }
}
