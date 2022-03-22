package com.corrodinggames.rts.gameFramework.p036g;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0162e;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0313ai;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0604c;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0606e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.ActivityC0065a;
import com.corrodinggames.rts.p008a.ActivityC0087g;
import com.corrodinggames.rts.p008a.ActivityC0092l;
import com.corrodinggames.rts.p008a.ActivityC0098n;
import com.corrodinggames.rts.p008a.C0067c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000a.p001a.C0017h;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ad.class */
public final class Hcat_Multiplaye {

    /* renamed from: e */
    ArrayList f4648e;

    /* renamed from: f */
    public boolean f4649f;

    /* renamed from: h */
    public boolean f4650h;

    /* renamed from: i */
    public float f4651i;

    /* renamed from: j */
    public float f4652j;

    /* renamed from: l */
    public int f4653l;

    /* renamed from: m */
    public String f4654m;

    /* renamed from: n */
    public boolean f4655n;

    /* renamed from: o */
    public boolean f4656o;

    /* renamed from: p */
    public boolean f4657p;

    /* renamed from: q */
    public boolean f4658q;

    /* renamed from: s */
    public String f4659s;

    /* renamed from: w */
    public String f4660w;

    /* renamed from: bG */
    private boolean f4661bG;

    /* renamed from: x */
    public AbstractC0171m f4662x;

    /* renamed from: y */
    public boolean f4663y;

    /* renamed from: A */
    public boolean f4664A;

    /* renamed from: B */
    public boolean f4665B;

    /* renamed from: C */
    public String f4666C;

    /* renamed from: E */
    public boolean f4667E;

    /* renamed from: F */
    public boolean f4668F;

    /* renamed from: I */
    public Float f4669I;

    /* renamed from: J */
    public String f4670J;

    /* renamed from: K */
    public boolean f4671K;

    /* renamed from: L */
    public int f4672L;

    /* renamed from: M */
    public int f4673M;

    /* renamed from: N */
    public int f4674N;

    /* renamed from: O */
    public int f4675O;

    /* renamed from: P */
    public String f4676P;

    /* renamed from: S */
    public boolean f4677S;

    /* renamed from: T */
    public float f4678T;

    /* renamed from: U */
    boolean f4679U;

    /* renamed from: V */
    public float f4680V;

    /* renamed from: W */
    public float f4681W;

    /* renamed from: X */
    public boolean f4682X;

    /* renamed from: Y */
    public float f4683Y;

    /* renamed from: Z */
    public boolean f4684Z;

    /* renamed from: aa */
    public boolean f4685aa;

    /* renamed from: ad */
    public boolean f4686ad;

    /* renamed from: ae */
    public boolean f4687ae;

    /* renamed from: af */
    public boolean f4688af;

    /* renamed from: ag */
    public long f4689ag;

    /* renamed from: ax */
    public boolean f4690ax;

    /* renamed from: az */
    public int f4691az;

    /* renamed from: aA */
    public int f4692aA;

    /* renamed from: aB */
    public static boolean f4693aB;

    /* renamed from: aD */
    long f4694aD;

    /* renamed from: aE */
    public boolean f4695aE;

    /* renamed from: aJ */
    public C0707k f4696aJ;

    /* renamed from: aK */
    public C0707k f4697aK;

    /* renamed from: aM */
    Thread f4698aM;

    /* renamed from: aN */
    RunnableC0686am f4699aN;

    /* renamed from: aO */
    Thread f4700aO;

    /* renamed from: aP */
    RunnableC0686am f4701aP;

    /* renamed from: aQ */
    Timer f4702aQ;

    /* renamed from: aR */
    C0693as f4703aR;

    /* renamed from: aS */
    Thread f4704aS;

    /* renamed from: aT */
    RunnableC0675af f4705aT;

    /* renamed from: aX */
    boolean f4706aX;

    /* renamed from: bb */
    String f4707bb;

    /* renamed from: bc */
    public String f4708bc;

    /* renamed from: bd */
    public Boolean f4709bd;

    /* renamed from: be */
    public Boolean f4710be;

    /* renamed from: bf */
    public boolean isGameStart_Hcat;

    /* renamed from: bh */
    public boolean f4712bh;

    /* renamed from: bi */
    public boolean f4713bi;

    /* renamed from: bj */
    public boolean f4714bj;

    /* renamed from: bk */
    public boolean f4715bk;

    /* renamed from: br */
    float f4716br;

    /* renamed from: bs */
    float f4717bs;

    /* renamed from: bt */
    int f4718bt;

    /* renamed from: bu */
    int f4719bu;

    /* renamed from: bz */
    public boolean f4720bz;

    /* renamed from: bD */
    Timer f4721bD;

    /* renamed from: bF */
    RunnableC0685al f4722bF;

    /* renamed from: a */
    public static final boolean f4723a = false;

    /* renamed from: b */
    public static boolean f4724b = true;

    /* renamed from: bE */
    public static C0674ae f4725bE = new C0674ae();

    /* renamed from: c */
    public C0663ac f4726c = new C0663ac();

    /* renamed from: g */
    public int f4727g = 25;

    /* renamed from: k */
    public boolean f4728k = false;

    /* renamed from: r */
    public int f4729r = 5005;

    /* renamed from: t */
    public boolean f4730t = false;

    /* renamed from: u */
    public long f4731u = 1;

    /* renamed from: v */
    public boolean f4732v = false;

    /* renamed from: bH */
    private boolean f4733bH = false;

    /* renamed from: z */
    public volatile boolean f4734z = false;

    /* renamed from: D */
    public boolean f4735D = false;

    /* renamed from: G */
    public int f4736G = 0;

    /* renamed from: bI */
    private volatile float f4737bI = 1.0f;

    /* renamed from: H */
    public volatile float f4738H = 1.0f;

    /* renamed from: Q */
    public int f4739Q = -1;

    /* renamed from: R */
    public int f4740R = 0;

    /* renamed from: ab */
    public int f4741ab = -1;

    /* renamed from: ac */
    public int f4742ac = 300;

    /* renamed from: ah */
    public ArrayList f4743ah = new ArrayList();

    /* renamed from: ai */
    public C0683aj f4744ai = new C0683aj(this, "Unit Pos");

    /* renamed from: aj */
    public C0683aj f4745aj = new C0683aj(this, "Unit Dir", false);

    /* renamed from: ak */
    public C0683aj f4746ak = new C0683aj(this, "Unit Hp");

    /* renamed from: al */
    public C0683aj f4747al = new C0683aj(this, "Unit Id");

    /* renamed from: am */
    public C0683aj f4748am = new C0683aj(this, "Waypoints");

    /* renamed from: an */
    public C0683aj f4749an = new C0683aj(this, "Waypoints Pos");

    /* renamed from: ao */
    public C0683aj f4750ao = new C0683aj(this, "Team Credits");

    /* renamed from: ap */
    public C0683aj f4751ap = new C0683aj(this, "UnitPaths");

    /* renamed from: aq */
    public C0683aj f4752aq = new C0683aj(this, "Unit Count");

    /* renamed from: ar */
    public C0683aj f4753ar = new C0683aj(this, "Team Info", false);

    /* renamed from: as */
    public C0683aj f4754as = new C0683aj(this, "Team 1 Credits", false);

    /* renamed from: at */
    public C0683aj f4755at = new C0683aj(this, "Team 2 Credits", false);

    /* renamed from: au */
    public C0683aj f4756au = new C0683aj(this, "Team 3 Credits", false);

    /* renamed from: av */
    public C0683aj f4757av = new C0683aj(this, "Command center2", false);

    /* renamed from: aw */
    public C0683aj f4758aw = new C0683aj(this, "Command center3", false);

    /* renamed from: ay */
    public boolean f4759ay = true;

    /* renamed from: aC */
    float f4760aC = 0.0f;

    /* renamed from: aF */
    public int f4761aF = 5;

    /* renamed from: aG */
    public int f4762aG = 5;

    /* renamed from: aH */
    public C0678ah f4763aH = new C0678ah();

    /* renamed from: aI */
    public String f4764aI = null;

    /* renamed from: aL */
    public C0660a f4765aL = new C0660a();

    /* renamed from: aV */
    public ConcurrentLinkedQueue f4766aV = new ConcurrentLinkedQueue();

    /* renamed from: aW */
    ConcurrentLinkedQueue f4767aW = new ConcurrentLinkedQueue();

    /* renamed from: aY */
    volatile int f4768aY = 1;

    /* renamed from: aZ */
    Object f4769aZ = new Object();

    /* renamed from: bg */
    public boolean f4770bg = false;

    /* renamed from: bl */
    public String f4771bl = null;

    /* renamed from: bm */
    public ConcurrentLinkedQueue f4772bm = new ConcurrentLinkedQueue();

    /* renamed from: bp */
    public final Object f4773bp = new Object();

    /* renamed from: bq */
    public boolean f4774bq = false;

    /* renamed from: bv */
    boolean f4775bv = false;

    /* renamed from: bw */
    boolean f4776bw = false;

    /* renamed from: bx */
    public Socket f4777bx = null;

    /* renamed from: by */
    public String f4778by = null;

    /* renamed from: bA */
    boolean f4779bA = false;

    /* renamed from: bB */
    boolean f4780bB = false;

    /* renamed from: bC */
    final Object f4781bC = new Object();

    /* renamed from: d */
    public int f4782d = AbstractC0789l.m651u().mo686c(true);

    /* renamed from: ba */
    String f4783ba = C0654f.m1486d(40);

    /* renamed from: aU */
    C0698c f4784aU = new C0698c(this, null);

    /* renamed from: bn */
    public C0162e f4785bn = new C0162e(-3, false);

    /* renamed from: bo */
    public C0162e f4786bo = new C0162e(-1, false);

    /* renamed from: a */
    public String m1335a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.f4660w = replace;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4660w != null && !this.f4660w.equals(u.f5479by.lastNetworkPlayerName)) {
            u.f5479by.lastNetworkPlayerName = this.f4660w;
            u.f5479by.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void m1363a(float f, String str) {
        if (f < 0.1d) {
            m1332a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.f4737bI = f;
        }
    }

    /* renamed from: a */
    public float m1365a() {
        return this.f4737bI;
    }

    /* renamed from: b */
    public void m1303b() {
        Iterator it = this.f4743ah.iterator();
        while (it.hasNext()) {
            ((C0683aj) it.next()).f4829b = 0L;
        }
    }

    /* renamed from: a */
    public void m1349a(C0690ap apVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        apVar.m1175c(0);
        this.f4763aH.m1215a(apVar);
        apVar.mo1109a(u.f5470bk);
        apVar.mo1109a(u.f5471bl);
    }

    /* renamed from: a */
    public void m1336a(C0707k kVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        kVar.m1079d();
        this.f4763aH.m1214a(kVar);
        u.f5470bk = kVar.m1076f();
        u.f5471bl = kVar.m1076f();
    }

    /* renamed from: c */
    public C0678ah m1289c() {
        C0678ah ahVar;
        if (this.f4664A) {
            ahVar = this.f4763aH;
        } else if (this.f4668F) {
            ahVar = this.f4763aH.m1212c();
        } else {
            ahVar = null;
            AbstractC0789l.m694b("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return ahVar;
    }

    /* renamed from: d */
    public void m1279d() {
        if (this.f4735D) {
            AbstractC0789l.m651u().f5479by.aiDifficulty = this.f4763aH.f4815f;
        }
        if (this.isGameStart_Hcat) {
            AbstractC0789l.m676f("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < AbstractC0171m.f1275a; i++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i);
                if (n != null && n.f1239r) {
                    n.f1240s = this.f4763aH.f4815f;
                }
            }
        }
        m1316ah();
    }

    /* renamed from: a */
    public void m1351a(C0678ah ahVar) {
        if (this.f4664A) {
            m1279d();
            m1384H();
            m1387E();
            ActivityC0092l.m4175k();
        } else if (this.f4668F) {
            game_command_Hcat(ahVar);
        } else {
            AbstractC0789l.m683d("applyChangedSetup but not server or proxy controller");
        }
    }

    /* renamed from: b */
    private void game_command_Hcat(C0678ah ahVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("applyProxyControl");
        C0678ah ahVar2 = this.f4763aH;
        if (!ahVar2.f4811b.equals(ahVar.f4811b)) {
            u.f5486bF.m1245i("-map '" + ActivityC0087g.m4194d(ahVar.f4811b) + "'");
        }
        if (ahVar2.f4814e != ahVar.f4814e) {
            u.f5486bF.m1245i("-revealedmap " + (!ahVar.f4814e ? "true" : "false"));
        }
        if (ahVar2.f4813d != ahVar.f4813d) {
            u.f5486bF.m1245i("-fog " + u.f5486bF.read_config_fog_Hcat(ahVar.f4813d));
        }
        if (ahVar2.f4812c != ahVar.f4812c) {
            u.f5486bF.m1245i("-credits " + u.f5486bF.m1270e(ahVar.f4812c));
        }
        if (!C0654f.m1459j(ahVar2.f4817h, ahVar.f4817h)) {
            u.f5486bF.m1245i("-income " + C0654f.m1558a(ahVar.f4817h, 1));
        }
        if (ahVar2.f4818i != ahVar.f4818i) {
            u.f5486bF.m1245i("-nukes " + (!ahVar.f4818i ? "true" : "false"));
        }
        if (ahVar2.f4815f != ahVar.f4815f) {
            u.f5486bF.m1245i("-ai " + ahVar.f4815f);
        }
        if (ahVar2.f4816g != ahVar.f4816g) {
            u.f5486bF.m1245i("-startingunits " + ahVar.f4816g);
        }
        if (ahVar2.f4809k != ahVar.f4809k) {
            u.f5486bF.m1245i("-sharedControl " + (ahVar.f4809k ? "true" : "false"));
        }
    }

    /* renamed from: e */
    public String m1271e() {
        if (this.f4763aH.f4813d == 0) {
            return "No fog";
        }
        if (this.f4763aH.f4813d == 1) {
            return "Basic fog";
        }
        if (this.f4763aH.f4813d == 2) {
            return "Line of Sight";
        }
        return "Unknown";
    }

    /* renamed from: a */
    public String read_config_fog_Hcat(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "basic";
        }
        if (i == 2) {
            return "los";
        }
        return "Unknown";
    }

    /* renamed from: b */
    public String m1301b(int i) {
        return AI_difficulty_Hcat(i);
    }

    /* renamed from: c */
    public String AI_difficulty_Hcat(int i) {
        if (i == -2) {
            return "Very Easy";
        }
        if (i == -1) {
            return "Easy";
        }
        if (i == 0) {
            return "Medium";
        }
        if (i == 1) {
            return "Hard";
        }
        if (i == 2) {
            return "Very Hard";
        }
        if (i == 3) {
            return "Impossible";
        }
        return "Unknown";
    }

    /* renamed from: f */
    public String m1264f() {
        return m1278d(this.f4763aH.f4816g);
    }

    /* renamed from: g */
    public ArrayList m1258g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(C0368l.m2852s());
        return arrayList;
    }

    /* renamed from: d */
    public String m1278d(int i) {
        if (i == 1) {
            return "Normal (1 builder)";
        }
        if (i == 2) {
            return "Small Army";
        }
        if (i == 3) {
            return "3 Engineers";
        }
        if (i == 4) {
            return "3 Engineers (No Command Center)";
        }
        if (i == 5) {
            return "Experimental Spider";
        }
        if (i == 9) {
            return "Custom";
        }
        C0368l b = C0368l.m2888b(i);
        if (b != null) {
            return b.mo3447e();
        }
        return "Unknown";
    }

    /* renamed from: h */
    public String m1252h() {
        if (this.f4763aH.f4812c == 0) {
            return "Default ($" + m1248i() + ")";
        }
        return "$" + m1248i();
    }

    /* renamed from: i */
    public final int m1248i() {
        return m1270e(this.f4763aH.f4812c);
    }

    /* renamed from: e */
    public int m1270e(int i) {
        if (i == 0) {
            return 4000;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1000;
        }
        if (i == 3) {
            return 2000;
        }
        if (i == 4) {
            return 5000;
        }
        if (i == 5) {
            return 10000;
        }
        if (i == 6) {
            return 50000;
        }
        if (i == 7) {
            return 100000;
        }
        if (i == 8) {
            return 200000;
        }
        return 999;
    }

    /* renamed from: j */
    public boolean m1244j() {
        return this.isGameStart_Hcat;
    }

    /* renamed from: k */
    public boolean m1242k() {
        return this.f4726c.m1392e();
    }

    /* renamed from: a */
    public synchronized void m1326a(boolean z, String str, Boolean bool) {
        this.f4710be = Boolean.valueOf(z);
        this.f4708bc = str;
        this.f4709bd = bool;
        ActivityC0092l.m4175k();
    }

    /* renamed from: a */
    void m1337a(C0703g gVar) {
        Iterator it = this.f4772bm.iterator();
        while (it.hasNext()) {
            C0703g gVar2 = (C0703g) it.next();
            if (gVar2.f4968a && gVar2.f4970c.equals(gVar.f4970c) && gVar2.f4974g == gVar.f4974g) {
                gVar2.f4980n = m1240l();
            }
        }
        gVar.f4980n = m1240l();
        this.f4772bm.add(gVar);
        ActivityC0098n.m4169j();
    }

    /* renamed from: l */
    public long m1240l() {
        return System.currentTimeMillis();
    }

    public Hcat_Multiplaye() {
        this.f4784aU.f4925n = true;
        this.f4785bn.f1238q = "SPECTATOR";
        this.f4786bo.f1238q = "ADMIN";
    }

    /* renamed from: m */
    public void m1238m() {
        m1328a(false);
    }

    /* renamed from: n */
    public void m1236n() {
        m1328a(true);
    }

    /* renamed from: o */
    public void m1234o() {
        this.f4733bH = false;
        this.f4661bG = false;
        this.f4662x = null;
        this.f4656o = false;
        this.f4740R = 0;
        this.f4736G = 0;
        this.f4731u = 1L;
        m1363a(1.0f, "new");
        this.f4678T = 10.0f;
        this.f4671K = false;
        this.f4674N = 10;
        this.f4675O = 0;
        this.f4677S = false;
        this.f4679U = false;
        this.f4688af = false;
        this.f4687ae = false;
        this.f4680V = 0.0f;
        this.f4681W = 0.0f;
        this.f4682X = false;
        this.f4684Z = false;
        this.isGameStart_Hcat = false;
        this.f4770bg = false;
        this.f4712bh = false;
        this.f4713bi = false;
        this.f4714bj = false;
        this.f4715bk = false;
        this.f4685aa = false;
        this.f4741ab = -1;
        this.f4689ag = 0L;
        this.f4775bv = false;
        m1303b();
        this.f4690ax = false;
        this.f4759ay = true;
        this.f4691az = 0;
        this.f4692aA = 0;
        this.f4760aC = 0.0f;
        this.f4716br = 0.0f;
        this.f4717bs = 0.0f;
        this.f4718bt = 0;
        this.f4719bu = -1000;
        C0689ao.f4877i = 55;
        C0689ao.f4878j = 66;
    }

    /* renamed from: a */
    public void m1328a(boolean z) {
        this.f4734z = false;
        this.f4664A = false;
        this.f4648e = null;
        this.f4735D = false;
        this.f4665B = false;
        this.f4666C = null;
        this.f4732v = false;
        this.f4668F = false;
        this.f4667E = false;
        this.f4695aE = false;
        this.f4663y = false;
        m1234o();
        this.f4676P = null;
        this.f4653l = 0;
        this.f4650h = false;
        this.f4651i = 0.0f;
        this.f4652j = 0.0f;
        this.f4780bB = false;
        this.f4697aK = null;
        this.f4762aG = AbstractC0789l.m651u().f5479by.teamUnitCapHostedGame;
        if (this.f4762aG < 1) {
            this.f4762aG = 1;
        }
        this.f4761aF = this.f4762aG;
        this.f4763aH.f4816g = 1;
        this.f4763aH.f4817h = 1.0f;
        this.f4763aH.f4818i = false;
        this.f4763aH.f4819j = false;
        this.f4763aH.f4809k = false;
        this.f4763aH.f4812c = 0;
        this.f4763aH.f4820l = false;
        this.f4763aH.f4821m = false;
        this.f4763aH.f4822n = true;
        this.f4763aH.f4823o = false;
        this.f4765aL.m1399c();
        AbstractC0789l.m651u().f5481bA.m1720g();
        if ("<CHAT ONLY>".equals(this.f4763aH.f4811b)) {
            AbstractC0789l.m683d("Chat only map selection - restarting");
            this.f4763aH.m1216a();
        }
        if (!z) {
            AbstractC0171m.m3781B();
        }
        C0307ac.m3284b(this.f4655n);
    }

    /* renamed from: p */
    public void m1232p() {
    }

    /* renamed from: b */
    public synchronized void m1293b(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("Disconnect: " + str);
        if (this.f4664A) {
            m1315ai();
            C0710n.m1038d();
            if (this.f4699aN != null) {
                this.f4699aN.m1205b();
                try {
                    if (this.f4698aM != null) {
                        this.f4698aM.join();
                    }
                } catch (InterruptedException e) {
                }
                this.f4699aN = null;
                this.f4698aM = null;
            }
            if (this.f4701aP != null) {
                this.f4701aP.m1205b();
                try {
                    if (this.f4700aO != null) {
                        this.f4700aO.join();
                    }
                } catch (InterruptedException e2) {
                }
                this.f4701aP = null;
                this.f4700aO = null;
            }
            if (this.f4702aQ != null) {
                this.f4702aQ.cancel();
                this.f4702aQ = null;
                this.f4703aR = null;
            }
            if (this.f4705aT != null) {
                this.f4705aT.m1217b();
                this.f4705aT = null;
                this.f4704aS = null;
            }
        }
        m1235n(str);
        C0796a.m645a().mo632j();
        synchronized (this.f4773bp) {
            this.f4734z = false;
            this.f4664A = false;
            this.f4648e = null;
            try {
                wait(50L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.isGameStart_Hcat = false;
            u.f5490bJ.m1989d();
            u.mo692c();
            m1320ad();
            this.f4774bq = false;
            this.f4773bp.notifyAll();
        }
    }

    /* renamed from: q */
    public void m1231q() {
        synchronized (this.f4773bp) {
            if (this.f4734z) {
                this.f4774bq = true;
                try {
                    this.f4773bp.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void m1347a(C0698c cVar) {
        this.f4766aV.remove(cVar);
    }

    /* renamed from: ap */
    private synchronized void m1308ap() {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            if (((C0698c) it.next()).f4948a) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void m1324a(byte[] bArr, C0698c cVar) {
        if (!AbstractC0789l.m708an()) {
            Log.m4292d("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (cVar.f4930s) {
            Log.m4292d("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            cVar.f4930s = true;
            Log.m4292d("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + C0654f.m1531a("d MMM yyyy HH.mm.ss") + "_" + cVar.f4916c));
            file.getParentFile().mkdirs();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: r */
    public void m1230r() {
        if (!this.f4775bv) {
            AbstractC0789l.m683d("Adding quick resync command");
            AbstractC0789l u = AbstractC0789l.m651u();
            C0651e b = u.f5494bN.m1943b();
            b.f4555i = AbstractC0171m.f1281g;
            b.f4563r = true;
            b.f4566u = 200;
            u.f5486bF.m1353a(b);
            this.f4775bv = true;
        }
    }

    /* renamed from: s */
    public void m1229s() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0690ap apVar = new C0690ap();
        u.f5489bI.m388a(apVar);
        try {
            apVar.m1200a();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] d = apVar.m1173d();
        apVar.m1167h();
        if (this.f4664A) {
            Iterator it = this.f4766aV.iterator();
            while (it.hasNext()) {
                C0698c cVar = (C0698c) it.next();
                if (cVar.f4932u) {
                    cVar.f4932u = false;
                    cVar.f4931t = false;
                    m1338a(cVar, d, this.f4728k, false);
                }
            }
        }
        AbstractC0789l.m683d("Loading quick resync save data (bytes:" + d.length + ")");
        C0707k kVar = new C0707k(d);
        u.m726a("Game resync (quick)...", true);
        int i = u.f5585bg;
        int i2 = u.f5467bh;
        u.f5489bI.m387a(kVar, true, true, true);
        u.f5585bg = i;
        u.f5467bh = i2;
        this.f4740R = u.f5585bg + 1;
        this.f4685aa = false;
        this.f4741ab = this.f4740R + 1;
        this.f4689ag = 0L;
        Iterator it2 = this.f4766aV.iterator();
        while (it2.hasNext()) {
            ((C0698c) it2.next()).f4931t = false;
        }
        this.f4775bv = false;
        this.f4716br = 0.0f;
        this.f4717bs = 0.0f;
        if (this.f4718bt < 1) {
            this.f4718bt++;
        }
        this.f4719bu = u.f5585bg;
    }

    /* renamed from: c */
    private synchronized void m1288c(float f) {
        AbstractC0789l.m651u();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        this.f4716br += f;
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4932u) {
                z = true;
            }
            if (cVar.f4931t && (cVar.f4933v < 4 || this.f4716br > 3600.0f)) {
                z3 = true;
            }
        }
        if (z3) {
            this.f4717bs += f;
            if (this.f4718bt == 0) {
                if (this.f4717bs > 60.0f) {
                    z2 = true;
                }
            } else if (this.f4718bt == 1) {
                if (this.f4717bs > 420.0f) {
                    z2 = true;
                }
            } else if (this.f4718bt == 2) {
                if (this.f4717bs > 3600.0f) {
                    z2 = true;
                }
            } else if (this.f4718bt == 3 && this.f4717bs > 14400.0f) {
                z2 = true;
            }
        }
        if (f4693aB && z2) {
            AbstractC0789l.m683d("disableDesyncFixing==true, running quick resync instead");
            z2 = false;
            z = true;
        }
        if (!z2 && z) {
            if (f4724b) {
                m1230r();
            } else {
                z2 = true;
            }
        }
        if (z2) {
            String str = "";
            Iterator it2 = this.f4766aV.iterator();
            while (it2.hasNext()) {
                C0698c cVar2 = (C0698c) it2.next();
                if (cVar2.f4932u || cVar2.f4931t) {
                    if (!str.equals("")) {
                        str = str + ", ";
                    }
                    str = str + cVar2.m1119e();
                }
            }
            m1249h("Resyncing game for " + str + "...");
            m1307aq();
            m1325a(this.f4728k, false, true);
        }
    }

    /* renamed from: aq */
    private void m1307aq() {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4716br = 0.0f;
        this.f4717bs = 0.0f;
        this.f4718bt++;
        this.f4719bu = u.f5585bg;
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            cVar.f4932u = false;
            cVar.f4931t = false;
        }
    }

    /* renamed from: n */
    private void m1235n(String str) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            ((C0698c) it.next()).m1129a(str);
        }
        this.f4766aV.clear();
        this.f4767aW.clear();
        this.f4768aY = 1;
        this.f4706aX = false;
    }

    /* renamed from: t */
    public long m1228t() {
        if (0 != 0) {
            AbstractC0789l.m683d("New id set:" + this.f4731u + 1);
            AbstractC0789l.m761M();
        }
        long j = this.f4731u;
        this.f4731u = j + 1;
        return j;
    }

    /* renamed from: u */
    public long m1227u() {
        return this.f4731u;
    }

    /* renamed from: a */
    public void m1360a(long j) {
        this.f4731u = j;
    }

    /* renamed from: a */
    public boolean m1327a(boolean z, int i) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n && cVar.m1117g() && !cVar.f4928q && !cVar.f4955A) {
                if (!z) {
                    return false;
                }
                m1249h("Still waiting on: " + cVar.m1119e());
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public int m1226v() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n && cVar.m1117g() && !cVar.f4928q) {
                C0162e eVar = cVar.f4934w;
                if (eVar != null) {
                    if (!arrayList.contains(eVar)) {
                        arrayList.add(eVar);
                    }
                }
                i++;
            }
        }
        return i;
    }

    /* renamed from: w */
    public int m1225w() {
        int i = 0;
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n && !cVar.f4928q) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public int m1224x() {
        int v = 0 + m1226v();
        if (!AbstractC0789l.m708an()) {
            v++;
        }
        return v;
    }

    /* renamed from: c */
    public void m1282c(String str) {
        Log.m4296b("RustedWarfare", "network:" + str);
    }

    /* renamed from: d */
    public static void m1274d(String str) {
        AbstractC0789l.m683d("network debug: " + str);
    }

    /* renamed from: e */
    public void m1266e(String str) {
        Log.m4292d("RustedWarfare", "reportProblem:" + str);
        if (this.isGameStart_Hcat) {
            m1344a((C0698c) null, -1, (String) null, str);
        } else {
            m1344a((C0698c) null, -1, (String) null, str);
        }
    }

    /* renamed from: f */
    public static void m1259f(String str) {
        m1332a(str, false);
    }

    /* renamed from: g */
    public static void m1253g(String str) {
        m1332a(str, true);
    }

    /* renamed from: a */
    public static void m1332a(String str, boolean z) {
        String str2;
        Hcat_Multiplaye adVar = AbstractC0789l.m651u().f5486bF;
        String str3 = "desync:" + str;
        AbstractC0789l.m695b(str3);
        AbstractC0789l.m761M();
        adVar.f4691az++;
        if (adVar.f4759ay) {
            if (adVar.f4691az > 2 || f4693aB) {
                z = true;
            }
            if (adVar.f4691az > 10) {
                str2 = "<suppressing desync errors>";
                adVar.f4759ay = false;
                z = true;
            } else {
                str2 = str3;
            }
            if (z) {
                str2 = "-i " + str2;
            }
            adVar.m1241k(str2);
        }
    }

    /* renamed from: a */
    public static void m1333a(String str, String str2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5490bJ.m2004a(-1, str, str2, u.f5585bg);
        if (u.f5481bA == null || u.f5481bA.f4278e == null) {
            AbstractC0789l.m676f("interfaceEngine/messageInterface==null");
        } else {
            u.f5481bA.f4278e.m1685a(str, str2);
        }
    }

    /* renamed from: y */
    public void m1223y() {
    }

    /* renamed from: a */
    public void m1353a(C0651e eVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        eVar.f4553c = this.f4740R;
        eVar.m1588g();
        u.f5494bN.f4091b.add(eVar);
    }

    /* renamed from: z */
    public void m1222z() {
        C0683aj ajVar;
        C0683aj ajVar2;
        C0683aj ajVar3;
        this.f4741ab = AbstractC0789l.m651u().f5585bg;
        this.f4689ag = 0L;
        m1303b();
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) wVar;
                this.f4689ag = ((float) this.f4689ag) + (rVar.f5841dH * 1000.0f);
                this.f4689ag = ((float) this.f4689ag) + (rVar.f5842dI * 1000.0f);
                this.f4689ag = ((float) this.f4689ag) + (rVar.f1450bY * 1.0f);
                this.f4689ag += rVar.f5835dA;
                this.f4744ai.f4829b += Float.floatToRawIntBits(rVar.f5841dH);
                this.f4744ai.f4829b += Float.floatToRawIntBits(rVar.f5842dI);
                this.f4745aj.f4829b += Float.floatToRawIntBits(rVar.f1444bL);
                this.f4746ak.f4829b = ((float) ajVar.f4829b) + rVar.f1450bY;
                this.f4747al.f4829b += rVar.f5835dA;
                if (wVar instanceof C0404d) {
                    C0404d dVar = (C0404d) rVar;
                    this.f4757av.f4829b = ((float) ajVar3.f4829b) + (dVar.f2976f * 2.0f);
                    this.f4758aw.f4829b += dVar.f2978h;
                }
                C0270an ap = rVar.m2288ap();
                if (ap != null) {
                    this.f4748am.f4829b += ap.m3402j();
                    this.f4749an.f4829b = ((float) ajVar2.f4829b) + (ap.m3407g() * 1000.0f);
                }
                this.f4751ap.f4829b += rVar.m2322aI();
            }
        }
        for (int i = 0; i < AbstractC0171m.f1275a; i++) {
            AbstractC0171m n = AbstractC0171m.m3688n(i);
            if (n != null) {
                this.f4750ao.f4829b += n.money;
                if (i == 0) {
                    this.f4754as.f4829b += n.money;
                }
                if (i == 1) {
                    this.f4755at.f4829b += n.money;
                }
                if (i == 2) {
                    this.f4756au.f4829b += n.money;
                }
                this.f4752aq.f4829b += n.m3683s();
                this.f4753ar.f4829b += i + (n.f1240s * 100) + (n.f1236o * 1000) + ((n.f1239r ? i : 0) * 10000);
            }
        }
        this.f4690ax = false;
    }

    /* renamed from: A */
    public void m1391A() {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (!cVar.f4925n || cVar.m1126b() == -2 || cVar.m1126b() > 500 || cVar.m1126b() < 0) {
            }
        }
    }

    /* renamed from: B */
    public void m1390B() {
        AbstractC0789l u = AbstractC0789l.m651u();
        String str = "";
        for (AbstractC0171m mVar : AbstractC0171m.m3747a(true)) {
            if (mVar != null) {
                String str2 = "unnamed";
                if (mVar.f1238q != null) {
                    str2 = mVar.f1238q;
                }
                str = str + "•" + mVar.m3774I().toLowerCase() + " [Team " + mVar.m3705f() + "] - " + str2 + (" " + mVar.m3681u()) + "\n";
            }
        }
        AbstractC0789l.m683d("showPlayerListPopup(): Showing playlist messagebox.");
        u.m687c("Players", str);
    }

    /* renamed from: a */
    public void m1364a(float f) {
        C0698c O;
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4760aC += f;
        if (this.f4760aC > 60.0f) {
            m1391A();
            this.f4760aC = 0.0f;
        }
        if (this.isGameStart_Hcat && !this.f4770bg) {
            this.f4770bg = true;
            int i = 0;
            int i2 = 0;
            Iterator it = AbstractC0171m.m3719d().iterator();
            while (it.hasNext()) {
                int a = AbstractC0171m.m3763a(((Integer) it.next()).intValue(), false);
                if (a > i2) {
                    i2 = a;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.f4712bh = true;
            }
        }
        if (!this.f4664A && !this.f4733bH) {
            m1370V();
            this.f4733bH = true;
        }
        if (this.f4664A) {
            if (!this.f4679U) {
                if (m1327a(false, 0)) {
                    this.f4678T = C0654f.m1563a(this.f4678T, f);
                    if (this.f4678T == 0.0f) {
                        this.f4679U = true;
                        m1333a("", "<All players ready>");
                        this.f4726c.m1398a();
                    }
                } else {
                    this.f4680V += f;
                    this.f4681W += f;
                    if (this.f4680V > 900.0f) {
                        this.f4679U = true;
                        m1333a("", "Starting game without all players ready!");
                    } else if (this.f4681W > 180.0f) {
                        this.f4681W = 0.0f;
                        m1327a(true, (int) ((900.0f - this.f4680V) / 60.0f));
                    }
                }
            }
            if (this.f4679U) {
                boolean z = false;
                if (this.f4687ae) {
                    z = true;
                }
                if (this.f4688af) {
                    z = true;
                }
                if ((u.f5585bg >= this.f4740R - this.f4675O) && (!z)) {
                    int i3 = this.f4740R + this.f4674N;
                    this.f4672L++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < AbstractC0171m.f1275a; i4++) {
                        AbstractC0171m n = AbstractC0171m.m3688n(i4);
                        if (n != null && n.f1261K != 0 && !n.m3678x() && n.f1261K < 40) {
                            z2 = true;
                        }
                    }
                    if (u.mo702b() != 0 && u.mo702b() < 40 && !AbstractC0789l.m708an()) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f4673M++;
                    }
                    if (this.f4672L > 8) {
                        float f2 = 1.0f;
                        if (this.f4673M > 4) {
                            f2 = 2.0f;
                        }
                        if (this.f4669I != null) {
                            f2 = this.f4669I.floatValue();
                        }
                        if (f2 != m1365a()) {
                            AbstractC0789l.m683d("Changing step rate to " + f2);
                            C0651e b = u.f5494bN.m1943b();
                            b.f4555i = AbstractC0171m.f1281g;
                            b.f4563r = true;
                            b.f4564s = f2;
                            m1353a(b);
                        }
                        this.f4672L = 0;
                        this.f4673M = 0;
                    }
                    C0690ap apVar = new C0690ap();
                    try {
                        apVar.mo1109a(i3);
                        int i5 = 0;
                        Iterator it2 = u.f5494bN.f4091b.iterator();
                        while (it2.hasNext()) {
                            if (((C0651e) it2.next()).f4553c == this.f4740R) {
                                i5++;
                            }
                        }
                        apVar.mo1109a(i5);
                        Iterator it3 = u.f5494bN.f4091b.iterator();
                        while (it3.hasNext()) {
                            C0651e eVar = (C0651e) it3.next();
                            if (eVar.f4553c == this.f4740R) {
                                eVar.m1603a(apVar);
                            }
                        }
                        C0692ar b2 = apVar.m1181b(10);
                        b2.f4892e = true;
                        m1276d(b2);
                        this.f4740R = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!u.f5494bN.f4093d.isEmpty()) {
            Iterator it4 = u.f5494bN.f4093d.iterator();
            while (it4.hasNext()) {
                C0651e eVar2 = (C0651e) it4.next();
                if (0 != 0) {
                    u.f5494bN.f4092c.add(eVar2);
                    it4.remove();
                } else {
                    if (!eVar2.f4577x) {
                        eVar2.m1600b();
                    }
                    if (eVar2.m1615a()) {
                        u.f5494bN.f4092c.add(eVar2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.f4664A) {
            if (!u.f5494bN.f4092c.isEmpty()) {
                Iterator it5 = u.f5494bN.f4092c.iterator();
                while (it5.hasNext()) {
                    C0651e eVar3 = (C0651e) it5.next();
                    if (!eVar3.m1592e()) {
                        eVar3.m1585j();
                        C0690ap apVar2 = new C0690ap();
                        try {
                            eVar3.m1603a(apVar2);
                            m1276d(apVar2.m1181b(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                u.f5494bN.f4092c.clear();
            }
        } else if (!u.f5494bN.f4092c.isEmpty()) {
            Iterator it6 = u.f5494bN.f4092c.iterator();
            while (it6.hasNext()) {
                C0651e eVar4 = (C0651e) it6.next();
                if (!eVar4.m1592e()) {
                    if (!eVar4.m1583l()) {
                        m1259f("Skipped command issued from server");
                    } else {
                        eVar4.m1585j();
                        m1353a(eVar4);
                    }
                }
            }
            u.f5494bN.f4092c.clear();
        }
        while (!this.f4767aW.isEmpty()) {
            C0692ar arVar = (C0692ar) this.f4767aW.remove();
            try {
                m1348a(arVar);
            } catch (IOException e3) {
                String str = "None";
                C0698c cVar = arVar.f4893a;
                if (cVar != null) {
                    str = cVar.m1118f();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    cVar.m1129a(message);
                    m1259f("IO error on processGamePacket for " + cVar.m1119e());
                }
                AbstractC0789l.m727a("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.f4664A) {
            if (!this.f4734z) {
                AbstractC0789l.m683d("Skipping server updates, not networked");
            } else {
                m1308ap();
                if (!this.f4686ad) {
                    m1288c(f);
                }
            }
        }
        if (!this.f4664A && this.f4734z) {
            boolean z3 = false;
            Iterator it7 = this.f4766aV.iterator();
            while (it7.hasNext()) {
                C0698c cVar2 = (C0698c) it7.next();
                if (cVar2.f4925n && !cVar2.f4948a) {
                    z3 = true;
                }
            }
            if (this.f4715bk && m1244j()) {
                u.f5481bA.m1754a("Game ended by server.");
                ActivityC0092l.m4175k();
            } else if (!z3 && m1244j()) {
                u.f5481bA.m1754a("Server Disconnected.");
                ActivityC0092l.m4175k();
            }
            if (z3 && this.f4677S && !this.f4664A && (O = m1377O()) != null && O.f4946P > 20000) {
                String str2 = "Receiving network data: " + O.f4947Q + "/" + O.f4946P;
                AbstractC0789l.m683d(str2);
                u.f5481bA.m1729c(str2);
            }
        }
        if (this.f4734z && this.f4688af) {
            u.f5481bA.m1753a("Game paused.", 100);
        }
        if (u.f5585bg < this.f4740R) {
            this.f4677S = false;
        }
        if (this.f4774bq) {
            m1293b("queDisconnect");
        }
    }

    /* renamed from: b */
    public void m1302b(float f) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4734z && (this.f4741ab + this.f4742ac < u.f5585bg || this.f4741ab == -1)) {
            m1222z();
            u.f5490bJ.m1991c();
        }
        if ((this.f4734z || u.f5490bJ.m1983h()) && this.f4671K) {
            this.f4671K = false;
            m1229s();
        }
        if (this.f4734z && this.f4664A && !this.f4690ax && this.f4741ab + (this.f4742ac / 2) < u.f5585bg && this.f4741ab != -1) {
            try {
                C0690ap apVar = new C0690ap();
                apVar.mo1109a(this.f4741ab);
                apVar.m1197a(this.f4689ag);
                apVar.mo1109a(this.f4743ah.size());
                Iterator it = this.f4743ah.iterator();
                while (it.hasNext()) {
                    apVar.m1197a(((C0683aj) it.next()).f4829b);
                }
                m1251h(apVar.m1181b(30));
                if (this.f4649f) {
                    AbstractC0789l.m683d("Sent checksum to client [" + this.f4741ab + "]");
                }
                this.f4690ax = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: C */
    public boolean m1389C() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5483bC.m951e()) {
            if (!this.f4776bw) {
                AbstractC0789l.m683d("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + u.f5483bC.m950f());
            }
            this.f4776bw = true;
            return true;
        }
        if (this.f4776bw) {
            AbstractC0789l.m683d("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.f4776bw = false;
        return false;
    }

    /* renamed from: a */
    public void m1362a(float f, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5585bg >= this.f4740R) {
            if (u.f5585bg > this.f4740R) {
                throw new RuntimeException("game frame:" + u.f5585bg + " is greater then nest step:" + this.f4740R);
            }
            this.f4677S = true;
        }
        if (z && m1389C()) {
            this.f4677S = true;
        }
    }

    /* renamed from: a */
    public void m1348a(C0692ar arVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (m1296b(arVar)) {
            m1282c("filtered packet (type:" + arVar.f4890b + ")");
            return;
        }
        switch (arVar.f4890b) {
            case 10:
                if (this.f4664A) {
                    m1282c("we are a server! we don't follow orders");
                    return;
                } else if (arVar.f4893a.f4929r) {
                    m1282c("ignoring command");
                    return;
                } else {
                    C0707k kVar = new C0707k(arVar);
                    int f = kVar.m1076f();
                    int f2 = kVar.m1076f();
                    for (int i = 0; i < f2; i++) {
                        C0651e b = u.f5494bN.m1943b();
                        b.f4553c = this.f4740R;
                        b.m1602a(kVar);
                        m1353a(b);
                    }
                    if (f < this.f4740R) {
                        m1259f("New nextBlockingFrame:" + f + " is smaller than current step:" + this.f4740R);
                    }
                    this.f4740R = f;
                    return;
                }
            case 20:
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                C0707k kVar2 = new C0707k(arVar);
                C0698c cVar = arVar.f4893a;
                if (!cVar.m1133a()) {
                    C0162e eVar = cVar.f4934w;
                    if (eVar == null) {
                        m1282c("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    C0651e b2 = u.f5494bN.m1943b();
                    b2.m1602a(kVar2);
                    b2.f4561p = eVar;
                    if (b2.f4563r) {
                        m1282c("Got system action from client, ignoring (" + cVar.f4916c + ")");
                        b2.f4563r = false;
                    }
                    if (b2.m1597c() == null) {
                        m1259f("Invalid command from '" + eVar.f1238q + "', no team found");
                        return;
                    } else if (!b2.m1583l()) {
                        m1259f("Ignored command from '" + eVar.f1238q + "', check failed");
                        return;
                    } else {
                        m1353a(b2);
                        return;
                    }
                } else {
                    return;
                }
            case 30:
                C0698c cVar2 = arVar.f4893a;
                C0707k kVar3 = new C0707k(arVar);
                int f3 = kVar3.m1076f();
                long i2 = kVar3.m1073i();
                if (this.f4685aa) {
                    m1282c("PACKET_SYNCCHECKSUM: skipping frame:" + f3 + ", we were told to wait for resync");
                    return;
                }
                C0690ap apVar = new C0690ap();
                apVar.m1175c(0);
                apVar.mo1109a(f3);
                apVar.mo1109a(this.f4741ab);
                if (this.f4741ab != f3 || this.f4689ag == 0) {
                    apVar.mo1104a(false);
                    Log.m4292d("RustedWarfare", "got remoteSyncFrame for:" + f3 + " needed:" + this.f4741ab + " lastSyncCheckSum:" + this.f4689ag);
                } else {
                    apVar.mo1104a(true);
                    Log.m4292d("RustedWarfare", "Running checksum");
                    apVar.m1197a(i2);
                    apVar.m1197a(this.f4689ag);
                    boolean z = false;
                    if (i2 != this.f4689ag) {
                        m1259f("Checksum doesn't match. Got:" + i2 + " expected:" + this.f4689ag);
                        z = true;
                        Iterator it = AbstractC0171m.m3730c().iterator();
                        while (it.hasNext()) {
                            ((AbstractC0171m) it.next()).m3685q();
                        }
                    } else {
                        this.f4692aA++;
                    }
                    int f4 = kVar3.m1076f();
                    if (f4 != this.f4743ah.size()) {
                        Log.m4292d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    apVar.m1170e("checkList");
                    apVar.mo1109a(f4);
                    apVar.mo1109a(this.f4743ah.size());
                    Iterator it2 = this.f4743ah.iterator();
                    while (it2.hasNext()) {
                        C0683aj ajVar = (C0683aj) it2.next();
                        long i3 = kVar3.m1073i();
                        apVar.m1197a(i3);
                        apVar.m1197a(ajVar.f4829b);
                        if (i3 != ajVar.f4829b && ajVar.f4830c) {
                            m1259f("[" + f3 + "] check(" + ajVar.f4828a + "): " + i3 + "!=" + ajVar.f4829b);
                            z = true;
                        }
                    }
                    apVar.mo1107a("checkList");
                    apVar.mo1104a(z);
                }
                if (!this.f4664A) {
                    m1341a(cVar2, apVar.m1181b(31));
                    return;
                }
                return;
            case 31:
                if (!this.f4664A) {
                    m1282c("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
                    return;
                }
                C0698c cVar3 = arVar.f4893a;
                C0707k kVar4 = new C0707k(arVar);
                kVar4.m1079d();
                int f5 = kVar4.m1076f();
                int f6 = kVar4.m1076f();
                if (kVar4.m1077e()) {
                    kVar4.m1073i();
                    kVar4.m1073i();
                    kVar4.m1082b("checkList");
                    kVar4.m1076f();
                    if (kVar4.m1076f() != this.f4743ah.size()) {
                        Log.m4292d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.f4743ah.iterator();
                    while (it3.hasNext()) {
                        C0683aj ajVar2 = (C0683aj) it3.next();
                        long i4 = kVar4.m1073i();
                        long i5 = kVar4.m1073i();
                        if (i4 != i5) {
                            AbstractC0789l.m695b(ajVar2.f4828a + " Checksum [" + f5 + "]. server:" + i4 + " client:" + i5);
                        }
                    }
                    kVar4.m1078d("checkList");
                    boolean e = kVar4.m1077e();
                    if (this.f4719bu >= f5) {
                        m1282c("Not marking desync, already resynced before frame: " + this.f4719bu + "<=" + f5);
                        return;
                    }
                    if (!cVar3.f4931t) {
                        cVar3.f4933v++;
                    }
                    cVar3.f4931t = e;
                    if (e) {
                        AbstractC0789l.m683d("client:" + cVar3.m1119e() + " desync [" + f5 + "]");
                        if (this.f4686ad && !this.f4687ae) {
                            m1259f("pauseOnDesync is active, pausing");
                            this.f4687ae = true;
                            return;
                        }
                        return;
                    } else if (this.f4649f) {
                        AbstractC0789l.m683d("checksum: client checksum match [" + f5 + "]");
                        return;
                    } else {
                        return;
                    }
                } else if (this.f4649f) {
                    AbstractC0789l.m683d("checksum for:" + cVar3.m1119e() + " frameMatch==false client:" + f6 + " server:[" + f5 + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                C0707k kVar5 = new C0707k(arVar);
                kVar5.m1079d();
                int f7 = kVar5.m1076f();
                int f8 = kVar5.m1076f();
                float g = kVar5.m1075g();
                float g2 = kVar5.m1075g();
                if (!this.f4664A && g < 0.1d) {
                    m1332a("resync packet with setCurrentStepRate:" + g + " is too small", true);
                }
                C0698c cVar4 = arVar.f4893a;
                if (cVar4.f4929r) {
                    m1282c("ignoring resync command");
                    return;
                }
                boolean e2 = kVar5.m1077e();
                if (!kVar5.m1077e()) {
                    AbstractC0789l.m683d("Reloading from network save");
                    if (e2 && !this.f4664A) {
                        m1325a(false, true, false);
                    }
                    byte[] c = kVar5.m1080c("gameSave");
                    AbstractC0789l.m683d("Save size: " + c.length);
                    if (this.f4728k) {
                        m1324a(c, cVar4);
                    }
                    u.f5490bJ.m1994a(c, u.f5585bg, f7, f8, g, g2);
                    C0707k kVar6 = new C0707k(c);
                    u.m726a("Resyncing game from server...", true);
                    u.f5489bI.m387a(kVar6, true, true, true);
                    u.m756R();
                    u.f5585bg = f7;
                    u.f5467bh = f8;
                    this.f4740R = f7 + 1;
                    this.f4685aa = false;
                    this.f4741ab = this.f4740R + 1;
                    this.f4689ag = 0L;
                    if (g < 0.1d) {
                        m1332a("resync setCurrentStepRate:" + g + " is too small", true);
                    }
                    m1363a(g, "rsync");
                    this.f4738H = g2;
                    return;
                } else if (!this.f4664A) {
                    m1282c("we are not a server, but got a debug game save! skipping");
                    return;
                } else {
                    m1324a(kVar5.m1080c("gameSave"), cVar4);
                    return;
                }
            default:
                m1282c("we did not handle packet:" + arVar.f4890b);
                return;
        }
    }

    /* renamed from: b */
    public synchronized boolean m1296b(C0692ar arVar) {
        C0698c cVar;
        if (!this.f4664A || (cVar = arVar.f4893a) == null || cVar.f4925n || arVar.f4890b == 105 || arVar.f4890b == 110 || arVar.f4890b == 111 || arVar.f4890b == 108 || arVar.f4890b == 160) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void m1284c(C0692ar arVar) {
        int i;
        AbstractC0171m mVar;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (m1296b(arVar)) {
            m1282c("filtered packet (type:" + arVar.f4890b + ")");
            return;
        }
        switch (arVar.f4890b) {
            case 105:
                m1282c("got PACKET_GET_SERVER_INFO");
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                return;
            case 106:
                if (this.f4664A) {
                    m1282c("we are a server! we don't follow orders");
                    return;
                }
                C0707k kVar = new C0707k(arVar);
                C0698c cVar = arVar.f4893a;
                kVar.m1071k();
                kVar.m1076f();
                this.f4763aH.f4810a = (EnumC0679ai) kVar.m1083b(EnumC0679ai.class);
                this.f4763aH.f4811b = kVar.m1071k();
                this.f4763aH.f4812c = kVar.m1076f();
                this.f4763aH.f4813d = kVar.m1076f();
                this.f4763aH.f4814e = kVar.m1077e();
                this.f4763aH.f4815f = kVar.m1076f();
                byte d = kVar.m1079d();
                this.f4667E = kVar.m1077e();
                this.f4668F = kVar.m1077e();
                this.f4695aE = true;
                if (d >= 1) {
                    this.f4761aF = kVar.m1076f();
                    this.f4762aG = kVar.m1076f();
                }
                if (d >= 2) {
                    this.f4763aH.f4816g = kVar.m1076f();
                    this.f4763aH.f4817h = kVar.m1075g();
                    this.f4763aH.f4818i = kVar.m1077e();
                    this.f4763aH.f4819j = kVar.m1077e();
                }
                if (d >= 3 && kVar.m1077e()) {
                    try {
                        C0368l.m2901a(kVar);
                        this.f4732v = true;
                    } catch (C0313ai e) {
                        m1293b("Missing unit:" + e.getMessage() + " d:" + e.f2199a);
                        m1292b("Server sync mismatch", e.getMessage());
                        if (!AbstractC0789l.m710al()) {
                            u.m670h(e.getMessage());
                        }
                        u.m682d("Server sync mismatch", e.getMessage());
                        return;
                    }
                }
                if (d >= 4) {
                    this.f4763aH.f4809k = kVar.m1077e();
                }
                if (d >= 5) {
                    this.f4763aH.f4820l = kVar.m1077e();
                }
                if (d >= 6) {
                    this.f4763aH.f4821m = kVar.m1077e();
                }
                if (d >= 7) {
                    this.f4763aH.f4822n = kVar.m1077e();
                    this.f4763aH.f4823o = kVar.m1077e();
                }
                ActivityC0092l.m4175k();
                return;
            case 107:
            case 114:
            case 119:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 162:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 171:
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER /* 177 */:
            default:
                m1282c("we did not handle packet:" + arVar.f4890b);
                return;
            case 108:
                C0698c cVar2 = arVar.f4893a;
                C0707k kVar2 = new C0707k(arVar);
                long i2 = kVar2.m1073i();
                kVar2.m1079d();
                C0690ap apVar = new C0690ap();
                apVar.m1197a(i2);
                apVar.m1175c(1);
                int b = u.mo702b();
                if (b > 130) {
                    b = 130;
                }
                apVar.m1175c(b);
                m1341a(cVar2, apVar.m1181b(109));
                return;
            case 109:
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C0698c cVar3 = arVar.f4893a;
                C0707k kVar3 = new C0707k(arVar);
                long i3 = kVar3.m1073i();
                byte b2 = 0;
                if (kVar3.m1079d() >= 1) {
                    b2 = kVar3.m1079d();
                }
                int i4 = (int) (currentTimeMillis - i3);
                cVar3.f4952x = i4;
                cVar3.f4953y = currentTimeMillis;
                if (cVar3.f4934w != null) {
                    cVar3.f4934w.f1262L = i4;
                    cVar3.f4934w.f1263M = currentTimeMillis;
                    cVar3.f4934w.f1261K = b2;
                }
                if (cVar3.f4926o && this.f4664A && this.f4665B && this.f4662x != null) {
                    this.f4662x.f1262L = i4;
                    this.f4662x.f1263M = currentTimeMillis;
                }
                if (!this.isGameStart_Hcat) {
                    ActivityC0092l.m4175k();
                    return;
                }
                return;
            case 110:
                m1282c("got REGISTER_CONNECTION");
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                C0707k kVar4 = new C0707k(arVar);
                C0698c cVar4 = arVar.f4893a;
                kVar4.m1071k();
                int f = kVar4.m1076f();
                int f2 = kVar4.m1076f();
                int f3 = kVar4.m1076f();
                String k = kVar4.m1071k();
                String j = kVar4.m1072j();
                String str = null;
                cVar4.f4956B = f2;
                if (f >= 1) {
                    cVar4.f4939I = kVar4.m1071k();
                }
                if (f >= 2) {
                    str = kVar4.m1071k();
                }
                int i5 = -1;
                if (f >= 3) {
                    i5 = kVar4.m1076f();
                }
                String str2 = "MISSING";
                if (f >= 4) {
                    str2 = kVar4.m1071k();
                }
                if (k.length() > 20) {
                    m1340a(cVar4, "Your username is too long");
                    cVar4.m1129a("kicked");
                    return;
                }
                String m = m1237m(k);
                if (m.length() < 2) {
                    m1340a(cVar4, "Your username is too short");
                    cVar4.m1129a("kicked");
                    return;
                }
                C0162e eVar = null;
                if (str != null) {
                    eVar = AbstractC0171m.m3748a(str);
                    if (eVar != null) {
                        m1282c("Existing player: " + eVar.f1230i + " - " + eVar.f1238q);
                    }
                }
                String a = this.f4726c.m1394a(cVar4, m, f2, f3, cVar4.f4939I, eVar);
                if (a != null) {
                    m1340a(cVar4, a);
                    cVar4.m1129a("kicked");
                    return;
                } else if (f2 < this.f4782d && !this.f4730t) {
                    m1340a(cVar4, "Game is out of date, please update");
                    cVar4.m1129a("kicked");
                    return;
                } else if (f2 > this.f4782d && !this.f4730t) {
                    m1340a(cVar4, "Your client is newer then the server");
                    cVar4.m1129a("kicked");
                    return;
                } else if (this.f4730t || i5 == u.mo653s()) {
                    if (!this.f4730t) {
                        String f4 = m1263f(cVar4.f4940J);
                        if (!f4.equals(str2)) {
                            AbstractC0789l.m683d("New Player kicked: Integrity Check Failed: expectedResponse=" + f4 + " clientResponse=" + str2);
                            m1340a(cVar4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized. (Are you running a mod?)");
                            cVar4.m1129a("kicked");
                            return;
                        }
                    }
                    if (!this.isGameStart_Hcat && this.f4763aH.f4823o) {
                        m1340a(cVar4, "Room is locked. New players cannot join this server.");
                        cVar4.m1129a("kicked");
                        return;
                    } else if (this.isGameStart_Hcat && eVar == null && !this.f4658q) {
                        m1340a(cVar4, "A game has already been started on this server");
                        cVar4.m1129a("kicked");
                        return;
                    } else if (this.f4654m != null && eVar == null && !C0654f.m1478e(this.f4654m).equals(j)) {
                        if (j == null) {
                            AbstractC0789l.m694b("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            AbstractC0789l.m694b("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        m1283c(cVar4);
                        return;
                    } else if (cVar4.f4934w == null) {
                        synchronized (this.f4781bC) {
                            if (eVar == null) {
                                i = AbstractC0171m.m3780C();
                            } else {
                                i = eVar.f1230i;
                            }
                            if (i != -1 || this.f4730t) {
                                String a2 = this.f4726c.mo373a(cVar4, m);
                                if (a2 != null) {
                                    m1340a(cVar4, a2);
                                    cVar4.m1129a("kicked");
                                } else {
                                    String str3 = null;
                                    if (eVar != null) {
                                        cVar4.f4934w = eVar;
                                        String str4 = "";
                                        if (this.isGameStart_Hcat) {
                                            if (eVar.m3745b()) {
                                                str4 = " (Spectator)";
                                            } else {
                                                str4 = " (Team " + eVar.m3705f() + ")";
                                            }
                                        }
                                        m1249h("'" + cVar4.f4934w.f1238q + "' reconnected. " + str4);
                                        cVar4.f4932u = true;
                                        str3 = eVar.f1238q;
                                        eVar.f1255E = cVar4.f4924m;
                                    } else {
                                        if (!this.f4730t || i != -1) {
                                            cVar4.f4934w = new C0162e(i);
                                            cVar4.f4934w.f1236o = i % 2;
                                        } else {
                                            cVar4.f4934w = new C0162e(-3);
                                        }
                                        if (this.isGameStart_Hcat && this.f4658q) {
                                            cVar4.f4932u = true;
                                        }
                                    }
                                    if (eVar == null && m != null) {
                                        ArrayList ao = m1309ao();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < 10) {
                                                boolean z = false;
                                                String str5 = m;
                                                if (i6 > 0) {
                                                    str5 = str5 + "(" + i6 + ")";
                                                }
                                                Iterator it = ao.iterator();
                                                while (it.hasNext()) {
                                                    if (str5.equalsIgnoreCase(((AbstractC0171m) it.next()).f1238q)) {
                                                        z = true;
                                                    }
                                                }
                                                if (!z) {
                                                    m = str5;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                    cVar4.f4934w.f1238q = m;
                                    cVar4.f4934w.f1254D = str;
                                    cVar4.f4934w.f1255E = cVar4.f4924m;
                                    cVar4.f4956B = f2;
                                    AbstractC0789l.m694b("processSystemPacket", "New player: " + m + ", networkVersion:" + cVar4.f4956B + " existing:" + (eVar != null));
                                    cVar4.f4925n = true;
                                    if (eVar == null) {
                                        this.f4726c.m1397a(cVar4.f4934w);
                                    }
                                    ActivityC0092l.m4175k();
                                    m1275d(cVar4);
                                    m1295b(cVar4);
                                    this.f4726c.mo362c(cVar4, m, str3);
                                    if ((eVar != null || this.f4658q) && this.isGameStart_Hcat) {
                                        m1339a(cVar4, true);
                                    }
                                }
                                return;
                            }
                            m1340a(cVar4, "No free slots on server");
                            cVar4.m1129a("no free slots");
                            return;
                        }
                    } else {
                        AbstractC0789l.m694b("processSystemPacket", "This connection already has a player");
                        return;
                    }
                } else {
                    AbstractC0789l.m683d("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i5 + " game.getAllUnitsChecksum():" + u.mo653s());
                    m1340a(cVar4, "Your units are different to the server's units. Game can not be synchronized");
                    cVar4.m1129a("kicked");
                    return;
                }
            case 111:
                C0707k kVar5 = new C0707k(arVar);
                C0698c cVar5 = arVar.f4893a;
                String str6 = null;
                try {
                    str6 = kVar5.m1071k();
                } catch (IOException e2) {
                    AbstractC0789l.m727a("Error reading disconnect reason", (Throwable) e2);
                }
                m1282c("Got a disconnect packet:" + str6);
                if (cVar5 != null) {
                    cVar5.m1127a(false, false);
                }
                if (!this.f4664A) {
                }
                return;
            case 112:
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                C0698c cVar6 = arVar.f4893a;
                C0707k kVar6 = new C0707k(arVar);
                cVar6.f4954z = kVar6.m1077e();
                cVar6.f4955A = kVar6.m1077e();
                return;
            case 113:
                if (this.f4664A) {
                    m1282c("we are a server! skipping: " + arVar.f4890b);
                    return;
                } else {
                    m1352a(f4725bE);
                    return;
                }
            case 115:
                if (this.f4664A) {
                    m1282c("we are a server! we don't follow orders");
                    return;
                }
                C0707k kVar7 = new C0707k(arVar);
                kVar7.m1084b(arVar.f4893a.f4956B);
                C0698c cVar7 = arVar.f4893a;
                int f5 = kVar7.m1076f();
                AbstractC0171m mVar2 = null;
                int i7 = 8;
                boolean z2 = false;
                if (kVar7.m1081c() >= 90) {
                    boolean z3 = false;
                    if (kVar7.m1081c() >= 141) {
                        z3 = true;
                        z2 = kVar7.m1077e();
                    }
                    i7 = kVar7.m1076f();
                    AbstractC0171m.m3742b(i7, false);
                    kVar7.m1088a("teams", z3);
                    if (i7 > AbstractC0171m.f1275a) {
                        throw new IOException("Cannot load:" + i7 + " teams");
                    }
                } else if (this.isGameStart_Hcat) {
                    m1259f("Warning old team system used in started game, stream version:" + kVar7.m1081c());
                }
                for (int i8 = 0; i8 < i7; i8++) {
                    C0162e n = AbstractC0171m.m3688n(i8);
                    if (kVar7.m1077e()) {
                        kVar7.m1076f();
                        n = n;
                        if (n == null) {
                            if (this.isGameStart_Hcat) {
                                m1259f("Warning team:" + i8 + " added while game is running");
                            }
                            if (!this.f4664A && (n instanceof C0118a)) {
                                m1259f("Warning we are a client with an AI team");
                            }
                            n = new C0162e(i8);
                        }
                        if (z2) {
                            n.m3755a(kVar7);
                        } else {
                            n.m3754a(kVar7, this.isGameStart_Hcat);
                        }
                    } else if (n != null) {
                        if (this.isGameStart_Hcat) {
                            m1259f("Warning team:" + i8 + " removed while game is running");
                        }
                        n.m3778E();
                    }
                    if (n != null && n.f1230i == f5) {
                        mVar2 = n;
                    }
                }
                if (kVar7.m1081c() >= 90) {
                    kVar7.m1078d("teams");
                }
                this.f4662x = mVar2;
                this.f4763aH.f4813d = kVar7.m1076f();
                this.f4763aH.f4812c = kVar7.m1076f();
                this.f4763aH.f4814e = kVar7.m1077e();
                this.f4763aH.f4815f = kVar7.m1076f();
                byte d2 = kVar7.m1079d();
                this.f4761aF = kVar7.m1076f();
                this.f4762aG = kVar7.m1076f();
                if (d2 >= 2) {
                    this.f4763aH.f4816g = kVar7.m1076f();
                    this.f4763aH.f4817h = kVar7.m1075g();
                    this.f4763aH.f4818i = kVar7.m1077e();
                    this.f4763aH.f4819j = kVar7.m1077e();
                }
                if (d2 >= 3 && kVar7.m1077e()) {
                    try {
                        C0368l.m2901a(kVar7);
                        this.f4732v = true;
                    } catch (C0313ai e3) {
                        m1293b("Missing unit:" + e3.getMessage() + " d:" + e3.f2199a);
                        m1292b("Connection Failed", e3.getMessage());
                        if (!AbstractC0789l.m710al()) {
                            u.m670h(e3.getMessage());
                        }
                        u.m682d("Connection Failed", e3.getMessage());
                        return;
                    }
                }
                if (d2 >= 4) {
                    this.f4763aH.f4809k = kVar7.m1077e();
                }
                if (d2 >= 5) {
                    this.f4688af = kVar7.m1077e();
                }
                ActivityC0092l.m4175k();
                return;
            case 116:
                if (this.f4664A) {
                    m1282c("we are a server! we don't follow orders");
                    return;
                }
                C0707k kVar8 = new C0707k(arVar);
                C0698c cVar8 = arVar.f4893a;
                kVar8.m1076f();
                boolean e4 = kVar8.m1077e();
                if (e4 && !this.f4715bk) {
                    this.f4715bk = e4;
                    return;
                }
                return;
            case 117:
                C0698c cVar9 = arVar.f4893a;
                if (!this.f4664A || cVar9.f4926o) {
                    C0707k kVar9 = new C0707k(arVar);
                    kVar9.m1079d();
                    int f6 = kVar9.m1076f();
                    String k2 = kVar9.m1071k();
                    C0674ae aeVar = new C0674ae();
                    aeVar.f4803d = true;
                    aeVar.f4802c = f6;
                    aeVar.f4801b = k2;
                    m1352a(aeVar);
                    return;
                }
                m1282c("we are a server! skipping: " + arVar.f4890b);
                return;
            case 118:
                return;
            case 120:
                if (this.f4664A) {
                    m1282c("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                C0707k kVar10 = new C0707k(arVar);
                kVar10.m1079d();
                this.f4763aH.f4810a = (EnumC0679ai) kVar10.m1083b(EnumC0679ai.class);
                if (this.f4763aH.f4810a == EnumC0679ai.f4826c) {
                    this.f4696aJ = kVar10.m1063s();
                } else if (this.f4763aH.f4810a == EnumC0679ai.f4825b) {
                    this.f4697aK = kVar10.m1063s();
                }
                this.f4764aI = kVar10.m1071k();
                m1306ar();
                return;
            case 122:
                if (this.f4664A) {
                    m1282c("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    m1305as();
                    return;
                }
            case 140:
                if (!this.f4664A) {
                    m1282c("we are not a server! skipping");
                    return;
                }
                C0698c cVar10 = arVar.f4893a;
                C0707k kVar11 = new C0707k(arVar);
                C0162e eVar2 = cVar10.f4934w;
                if (eVar2 == null) {
                    if (cVar10.f4926o) {
                        m1282c("Allowing message from non player on forwarding connection");
                        eVar2 = this.f4786bo;
                    } else {
                        m1282c("player is null for message, skipping");
                        return;
                    }
                }
                String k3 = kVar11.m1071k();
                kVar11.m1079d();
                if (k3.length() > 250) {
                    k3 = k3.substring(0, 250);
                }
                if (k3.contains("\n")) {
                    k3 = k3.replace("\n", "?");
                }
                String o = m1233o(k3);
                if (!this.f4726c.mo372a(cVar10, eVar2.f1238q, o)) {
                    return;
                }
                if (this.f4765aL.m1402a(cVar10, 60000) > this.f4727g) {
                    if (C0654f.m1550a(cVar10.f4919g, System.nanoTime()) > 60000) {
                        cVar10.f4919g = System.nanoTime();
                        m1249h("Anti-spam: Too many messages from '" + cVar10.m1119e() + "'");
                    }
                    if (this.f4649f) {
                        AbstractC0789l.m683d("extraDebug:" + o);
                        return;
                    }
                    return;
                }
                m1343a(cVar10, eVar2, eVar2.f1238q, o);
                this.f4726c.mo365b(cVar10, eVar2.f1238q, o);
                m1294b(cVar10, eVar2, eVar2.f1238q, o);
                return;
            case 141:
                if (!this.f4664A || arVar.f4893a.f4926o) {
                    C0707k kVar12 = new C0707k(arVar);
                    String k4 = kVar12.m1071k();
                    byte d3 = kVar12.m1079d();
                    String j2 = kVar12.m1072j();
                    kVar12.m1076f();
                    int i9 = -1;
                    if (d3 >= 3) {
                        i9 = kVar12.m1076f();
                    }
                    m1344a((C0698c) null, i9, j2, k4);
                    return;
                }
                m1282c("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                return;
            case 150:
                if (this.f4664A) {
                    m1282c("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String c = C0652a.m1573c(new C0707k(arVar).m1071k());
                m1282c("we got kicked, reason:" + c);
                m1293b("I was kicked");
                m1292b("Kicked", "Kicked: " + c);
                u.m682d("Kicked", "Kicked: " + c);
                u.m670h("Kicked: " + c);
                return;
            case 151:
                C0698c cVar11 = arVar.f4893a;
                if (!this.f4664A || cVar11.f4926o) {
                    long a3 = C0586bj.m1962a();
                    C0707k kVar13 = new C0707k(arVar);
                    int f7 = kVar13.m1076f();
                    int f8 = kVar13.m1076f();
                    if (kVar13.m1077e()) {
                        C0689ao.f4877i = kVar13.m1076f();
                    }
                    if (kVar13.m1077e()) {
                        C0689ao.f4878j = kVar13.m1076f();
                    }
                    String str7 = "";
                    if (f8 == 0) {
                        str7 = "" + C0689ao.f4877i;
                    }
                    if (f8 == 1) {
                        str7 = "" + C0689ao.f4878j;
                    }
                    if (f8 == 2) {
                        str7 = m1263f(C0689ao.f4877i);
                    }
                    if (f8 == 3) {
                        str7 = C0654f.m1494c(C0689ao.f4877i + "|" + C0689ao.f4878j);
                    }
                    if (f8 == 4) {
                        str7 = C0654f.m1494c(C0689ao.f4877i + "|" + C0689ao.f4878j);
                    }
                    if (f8 == 5 || f8 == 6) {
                        String k5 = kVar13.m1071k();
                        String k6 = kVar13.m1071k();
                        int f9 = kVar13.m1076f();
                        if (f8 == 6) {
                            k6 = k6 + C0689ao.f4877i;
                        }
                        if (f9 > 10000000) {
                            str7 = "max";
                        } else {
                            str7 = "-1";
                            int i10 = 0;
                            while (true) {
                                if (i10 <= f9) {
                                    if (C0654f.m1494c(k6 + i10).equals(k5)) {
                                        str7 = "" + i10;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                    if (f8 == 7) {
                        String k7 = kVar13.m1071k();
                        int f10 = kVar13.m1076f();
                        if (f10 > 10000) {
                            str7 = "max";
                        } else {
                            str7 = "";
                            for (int i11 = 0; i11 < f10; i11++) {
                                str7 = str7 + k7;
                            }
                        }
                    }
                    float a4 = C0586bj.m1960a(a3);
                    C0690ap apVar2 = new C0690ap();
                    apVar2.mo1109a(f7);
                    apVar2.mo1109a(f8);
                    apVar2.m1174c(str7);
                    apVar2.mo1110a(a4);
                    m1341a(cVar11, apVar2.m1181b(152));
                    return;
                }
                m1282c("error, we are a server but got: 151");
                return;
            case 160:
                C0707k kVar14 = new C0707k(arVar);
                C0698c cVar12 = arVar.f4893a;
                kVar14.m1071k();
                int f11 = kVar14.m1076f();
                kVar14.m1076f();
                if (f11 >= 1) {
                    kVar14.m1076f();
                }
                if (cVar12.f4921i) {
                    AbstractC0789l.m683d("steam: request info packet");
                }
                if (f11 >= 2) {
                    kVar14.m1072j();
                }
                if (f11 >= 3) {
                    kVar14.m1071k();
                }
                m1260f(cVar12);
                return;
            case 161:
                if (this.f4664A) {
                    m1282c("we are a server! we don't PREREGISTER_INFO");
                    return;
                }
                C0707k kVar15 = new C0707k(arVar);
                C0698c cVar13 = arVar.f4893a;
                if (cVar13.f4921i) {
                    AbstractC0789l.m683d("steam: got info packet");
                }
                kVar15.m1071k();
                int f12 = kVar15.m1076f();
                int f13 = kVar15.m1076f();
                kVar15.m1076f();
                kVar15.m1071k();
                this.f4676P = kVar15.m1071k();
                cVar13.f4956B = f13;
                if (f12 >= 1) {
                    this.f4739Q = kVar15.m1076f();
                }
                if (this.f4780bB) {
                    m1282c("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");
                }
                m1254g(cVar13);
                return;
            case 163:
                if (this.f4664A) {
                    m1282c("we are already a server");
                    return;
                }
                C0707k kVar16 = new C0707k(arVar);
                kVar16.m1079d();
                int f14 = kVar16.m1076f();
                kVar16.m1076f();
                kVar16.m1072j();
                m1282c("Relay version: " + f14);
                return;
            case 170:
                m1282c("Got 'become server' packet");
                if (this.f4664A) {
                    m1282c("we are already a server");
                    return;
                }
                C0698c cVar14 = arVar.f4893a;
                C0707k kVar17 = new C0707k(arVar);
                byte d4 = kVar17.m1079d();
                boolean e5 = kVar17.m1077e();
                boolean e6 = kVar17.m1077e();
                String j3 = kVar17.m1072j();
                boolean e7 = kVar17.m1077e();
                boolean e8 = kVar17.m1077e();
                String j4 = kVar17.m1072j();
                boolean z4 = false;
                if (d4 >= 1) {
                    z4 = kVar17.m1077e();
                }
                m1282c("Multicast:" + z4);
                cVar14.f4927p = z4;
                if (e5) {
                    cVar14.f4926o = true;
                }
                if (e6) {
                    cVar14.f4928q = true;
                }
                this.f4665B = true;
                this.f4666C = j4;
                u.f5486bF.f4654m = null;
                u.f5486bF.f4655n = e7;
                u.f5486bF.f4657p = e8;
                m1280c(false);
                if (u.f5486bF.f4657p) {
                }
                if (j3 != null) {
                    u.f5479by.networkServerId = j3;
                }
                if (u.f5585bg > 60) {
                    this.f4679U = true;
                }
                if (!(this.f4732v || this.isGameStart_Hcat)) {
                    AbstractC0789l.m683d("enableAllCustomUnitsPossible mods:" + this.f4655n);
                    C0307ac.m3284b(this.f4655n);
                    this.f4732v = true;
                    return;
                }
                return;
            case 172:
                C0698c cVar15 = arVar.f4893a;
                if (!cVar15.f4926o) {
                    m1282c("forwarding not allowed on this connection");
                    return;
                }
                m1282c("got FORWARD_CLIENT_ADD");
                C0707k kVar18 = new C0707k(arVar);
                kVar18.m1079d();
                int f15 = kVar18.m1076f();
                String k8 = kVar18.m1071k();
                String j5 = kVar18.m1072j();
                if (m1346a(cVar15, f15) != null) {
                    m1282c("Not adding client:" + f15 + " already exists");
                    return;
                } else if (m1345a(cVar15, f15, k8) != null && j5 != null) {
                    C0162e b3 = AbstractC0171m.m3732b(k8);
                    if (b3 == null) {
                        m1282c("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + k8);
                        Iterator it2 = AbstractC0171m.m3730c().iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0171m) it2.next()) != null) {
                                m1282c("option: " + mVar.f1238q + " - " + mVar.f1255E);
                            }
                        }
                        return;
                    }
                    b3.f1254D = j5;
                    return;
                } else {
                    return;
                }
            case 173:
                C0698c cVar16 = arVar.f4893a;
                if (!cVar16.f4926o) {
                    m1282c("forwarding not allowed on this connection");
                    return;
                }
                m1282c("got FORWARD_CLIENT_REMOVE");
                C0707k kVar19 = new C0707k(arVar);
                kVar19.m1079d();
                C0698c a5 = m1346a(cVar16, kVar19.m1076f());
                if (a5 != null) {
                    m1250h(a5);
                    return;
                }
                return;
            case 174:
                C0698c cVar17 = arVar.f4893a;
                if (!cVar17.f4926o) {
                    m1282c("forwarding not allowed on this connection");
                    return;
                }
                C0707k kVar20 = new C0707k(arVar);
                int f16 = kVar20.m1076f();
                byte[] r = kVar20.m1064r();
                C0698c a6 = m1346a(cVar17, f16);
                if (a6 == null) {
                    m1282c("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(a6.f4917d instanceof C0704h)) {
                    m1282c("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((C0704h) a6.f4917d).f4997d.m1095a(r);
                    return;
                }
            case 175:
                m1282c("got PACKET_FORWARD_CLIENT_TO");
                return;
            case 176:
                m1282c("got PACKET_FORWARD_CLIENT_TO_REPEATED");
                return;
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT /* 178 */:
                m1282c("got PACKET_RECONNECT_TO");
                C0698c cVar18 = arVar.f4893a;
                if (!this.f4664A || cVar18.f4926o) {
                    C0707k kVar21 = new C0707k(arVar);
                    kVar21.m1079d();
                    kVar21.m1076f();
                    boolean e9 = kVar21.m1077e();
                    int f17 = kVar21.m1076f();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < f17; i12++) {
                        arrayList.add(kVar21.m1071k());
                    }
                    m1329a(arrayList, e9);
                    return;
                }
                m1282c("we are a server, ");
                return;
        }
    }

    /* renamed from: o */
    private String m1233o(String str) {
        char[] charArray;
        String replace = str.replace("��", ".");
        boolean z = false;
        char[] charArray2 = replace.toCharArray();
        int length = charArray2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Character.isISOControl(charArray2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (char c : replace.toCharArray()) {
                if (!Character.isISOControl(c)) {
                    sb.append(c);
                }
            }
            replace = sb.toString();
        }
        return replace;
    }

    /* renamed from: D */
    public void m1388D() {
        m1292b((String) null, (String) null);
    }

    /* renamed from: b */
    public void m1292b(String str, String str2) {
        ActivityC0092l.m4178a(str, str2);
        this.f4726c.mo361d();
    }

    /* renamed from: E */
    public synchronized void m1387E() {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n) {
                m1295b(cVar);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m1295b(C0698c cVar) {
        if (!this.f4664A) {
            m1282c("sendServerInfo: we are not a server!");
            return;
        }
        C0690ap apVar = new C0690ap();
        try {
            apVar.m1174c("com.corrodinggames.rts");
            apVar.mo1109a(this.f4782d);
            apVar.m1184a(this.f4763aH.f4810a);
            if (this.f4730t) {
                apVar.m1174c("<CHAT ONLY>");
            } else {
                apVar.m1174c(this.f4763aH.f4811b == null ? "<NULL>" : this.f4763aH.f4811b);
            }
            apVar.mo1109a(this.f4763aH.f4812c);
            apVar.mo1109a(this.f4763aH.f4813d);
            apVar.mo1104a(this.f4763aH.f4814e);
            apVar.mo1109a(this.f4763aH.f4815f);
            apVar.m1175c(7);
            apVar.mo1104a(this.f4726c.m1396a(cVar));
            apVar.mo1104a(this.f4726c.m1393b(cVar));
            apVar.mo1109a(this.f4761aF);
            apVar.mo1109a(this.f4762aG);
            apVar.mo1109a(this.f4763aH.f4816g);
            apVar.mo1110a(this.f4763aH.f4817h);
            apVar.mo1104a(this.f4763aH.f4818i);
            apVar.mo1104a(this.f4763aH.f4819j);
            if (this.f4730t) {
                apVar.mo1104a(false);
            } else {
                apVar.mo1104a(true);
                C0368l.m2902a(apVar);
            }
            apVar.mo1104a(this.f4763aH.f4809k);
            apVar.mo1104a(this.f4763aH.f4820l);
            apVar.mo1104a(this.f4763aH.f4821m);
            apVar.mo1104a(this.f4763aH.f4822n);
            apVar.mo1104a(this.f4763aH.f4823o);
            m1341a(cVar, apVar.m1181b(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m1340a(C0698c cVar, String str) {
        if (!this.f4664A) {
            m1282c("sendKick: we are not a server!");
            return;
        }
        m1282c("kicking client reason:" + str);
        C0690ap apVar = new C0690ap();
        try {
            apVar.m1174c(str);
            m1341a(cVar, apVar.m1181b(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public synchronized void m1283c(C0698c cVar) {
        if (!this.f4664A) {
            m1282c("sendIncorrectPassword: we are not a server!");
            return;
        }
        m1282c("sendIncorrectPassword");
        C0690ap apVar = new C0690ap();
        try {
            apVar.mo1109a(0);
            m1341a(cVar, apVar.m1181b(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: F */
    public void m1386F() {
        if (this.f4664A) {
            for (int i = 0; i < AbstractC0171m.f1278d; i++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i);
                if (n != null) {
                    if (this.f4730t) {
                        n.f1268R = 0;
                    } else if (n.m3745b()) {
                        n.f1268R = 100;
                    } else {
                        n.f1268R = n.f1236o;
                    }
                }
            }
        }
    }

    /* renamed from: G */
    public void m1385G() {
        if (this.f4664A) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = AbstractC0789l.m651u().f5467bh;
            if (this.f4662x != null && !this.f4665B) {
                this.f4662x.f1262L = -99;
                this.f4662x.f1263M = currentTimeMillis;
            }
            m1386F();
            for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i2);
                if (n != null) {
                    n.m3720c(this.f4662x == n);
                    if (!this.isGameStart_Hcat) {
                    }
                    if (this.isGameStart_Hcat && !this.f4735D && !n.f1239r) {
                        boolean z = false;
                        if (n.m3678x()) {
                            z = true;
                        }
                        char c = 60000;
                        if (n.f1265O > 180000) {
                            c = 28928;
                        }
                        boolean z2 = false;
                        if (this.f4679U) {
                            if (n.f1264N == -1) {
                                n.f1264N = currentTimeMillis;
                                n.f1265O = i;
                            }
                            if ((this.f4687ae || this.f4688af) && !n.f1267Q) {
                                n.f1264N = currentTimeMillis;
                                n.f1265O = i;
                            }
                            if (n.f1264N + c < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (n.f1267Q != z2) {
                            n.f1267Q = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!n.f1266P) {
                                if (!(n.f1247w || n.f1246v || n.f1250z || n.m3745b())) {
                                    n.f1266P = true;
                                }
                            }
                        }
                        if (n.f1250z != z) {
                            if (z && !n.f1247w && !n.f1246v && !n.f1249y && !n.m3745b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                AbstractC0789l.m683d(n.f1238q + " - " + str);
                                if (AbstractC0171m.m3763a(n.f1236o, true) > 1) {
                                    m1343a((C0698c) null, n, n.f1238q, str);
                                }
                            }
                            n.f1250z = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public void m1384H() {
        if (this.f4694aD == 0) {
            this.f4694aD = System.currentTimeMillis();
        }
    }

    /* renamed from: I */
    public void m1383I() {
        this.f4694aD = 0L;
        m1275d((C0698c) null);
    }

    /* renamed from: d */
    public void m1275d(C0698c cVar) {
        if (!this.f4664A) {
            m1282c("sendUpdatePlayer: we are not a server!");
            return;
        }
        m1385G();
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar2 = (C0698c) it.next();
            if (cVar2.f4925n) {
                C0690ap apVar = new C0690ap(cVar2.f4956B);
                try {
                    apVar.mo1109a(cVar2.m1123c());
                    int i = AbstractC0171m.f1275a;
                    boolean z = false;
                    if (apVar.m1168g() >= 90) {
                        boolean z2 = false;
                        if (apVar.m1168g() >= 141) {
                            z2 = true;
                            if (this.isGameStart_Hcat && cVar2.f4942L) {
                                z = true;
                            }
                            apVar.mo1104a(z);
                        }
                        apVar.mo1109a(i);
                        apVar.mo1106a("teams", z2);
                    } else {
                        i = 8;
                        if (!this.f4730t) {
                            m1282c("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC0171m n = AbstractC0171m.m3688n(i2);
                        apVar.mo1104a(n != null);
                        if (n != null) {
                            int i3 = 0;
                            if (n instanceof C0118a) {
                                i3 = 1;
                            }
                            apVar.mo1109a(i3);
                            if (z) {
                                n.m3723c(apVar);
                            } else {
                                n.m3736b(apVar);
                            }
                        }
                    }
                    if (apVar.m1168g() >= 90) {
                        apVar.mo1107a("teams");
                    }
                    apVar.mo1109a(this.f4763aH.f4813d);
                    apVar.mo1109a(this.f4763aH.f4812c);
                    apVar.mo1104a(this.f4763aH.f4814e);
                    apVar.mo1109a(this.f4763aH.f4815f);
                    apVar.m1175c(5);
                    apVar.mo1109a(this.f4761aF);
                    apVar.mo1109a(this.f4762aG);
                    apVar.mo1109a(this.f4763aH.f4816g);
                    apVar.mo1110a(this.f4763aH.f4817h);
                    apVar.mo1104a(this.f4763aH.f4818i);
                    apVar.mo1104a(this.f4763aH.f4819j);
                    apVar.mo1104a(false);
                    apVar.mo1104a(this.f4763aH.f4809k);
                    apVar.mo1104a(this.f4688af);
                    int i4 = -1;
                    if (cVar == cVar2 && cVar2.f4956B <= 26) {
                        i4 = 1000;
                    }
                    cVar2.f4942L = true;
                    m1341a(cVar2, apVar.m1198a(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: J */
    public synchronized boolean m1382J() {
        if (!m1381K()) {
            return false;
        }
        this.f4656o = true;
        this.f4763aH.f4813d = 0;
        return true;
    }

    /* renamed from: K */
    public synchronized boolean m1381K() {
        if (this.f4734z) {
            m1293b("Started singleplayer");
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        m1236n();
        this.f4734z = true;
        this.f4664A = true;
        this.f4735D = true;
        this.f4763aH.f4810a = u.m717ae();
        this.f4763aH.f4811b = u.m718ad();
        m1373S();
        this.f4662x = u.f5464bb;
        ActivityC0092l.m4175k();
        this.f4653l = u.f5479by.networkPort;
        m1282c("singleplayer server started");
        return true;
    }

    /* renamed from: b */
    public synchronized boolean m1290b(boolean z) {
        if (this.f4734z) {
            throw new RuntimeException("networking already started");
        }
        m1238m();
        this.f4734z = true;
        this.f4664A = true;
        m1373S();
        AbstractC0789l u = AbstractC0789l.m651u();
        m1280c(z);
        ActivityC0092l.m4175k();
        this.f4653l = u.f5479by.networkPort;
        C0796a.m645a().mo633i();
        this.f4699aN = new RunnableC0686am(this);
        try {
            this.f4699aN.m1206a(false);
            this.f4698aM = new Thread(this.f4699aN);
            this.f4698aM.setDaemon(true);
            this.f4698aM.start();
            if (1 != 0) {
                this.f4701aP = new RunnableC0686am(this);
                try {
                    this.f4701aP.m1206a(true);
                    this.f4700aO = new Thread(this.f4701aP);
                    this.f4700aO.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    u.m731a("Could not open udp port:" + this.f4653l + ", check this port is not in use or change the port in the game settings", 1);
                    m1293b("Could not open udp port");
                    return false;
                }
            }
            m1320ad();
            if (this.f4657p) {
                C0710n.m1042b();
            }
            this.f4710be = null;
            C0710n.m1058a();
            m1282c("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            u.m731a("Could not open tcp port:" + this.f4653l + ", check this port is not in use or change the port in the game settings", 1);
            m1293b("Could not open tcp port");
            return false;
        }
    }

    /* renamed from: c */
    public void m1280c(boolean z) {
        int i;
        this.f4664A = true;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4662x == null) {
            C0162e eVar = null;
            if (!z) {
                i = AbstractC0171m.m3780C();
                if (i == -1) {
                    throw new RuntimeException("playerId is -1 for server player");
                }
            } else {
                eVar = this.f4786bo;
                i = this.f4786bo.f1230i;
            }
            if (eVar == null) {
                eVar = new C0162e(i);
                eVar.f1238q = this.f4660w;
                u.f5464bb = eVar;
            }
            this.f4662x = eVar;
        }
        if (this.f4703aR == null) {
            AbstractC0789l.m683d("pingerTask starting");
            this.f4703aR = new C0693as(this);
            this.f4702aQ = new Timer();
            this.f4702aQ.schedule(this.f4703aR, 100L, 100L);
        } else {
            AbstractC0789l.m683d("pingerTask already active");
        }
        ActivityC0092l.m4175k();
    }

    /* renamed from: L */
    public boolean m1380L() {
        return AbstractC0789l.m651u().f5479by.udpInMultiplayer;
    }

    /* renamed from: a */
    public RunnableC0685al m1331a(String str, boolean z, Runnable runnable) {
        RunnableC0685al alVar = new RunnableC0685al(str, z, runnable);
        alVar.m1209b();
        return alVar;
    }

    /* renamed from: b */
    public static Socket m1291b(String str, boolean z) {
        C0017h hVar;
        String str2;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("Connect to server: " + str + " (force tcp:" + z + ")");
        boolean z2 = false;
        String trim = str.trim();
        if (trim.startsWith("get|")) {
            String[] split = trim.split("\\|");
            try {
                String str3 = split[0];
                String str4 = split[1];
                int parseInt = Integer.parseInt(split[2]);
                boolean parseBoolean = Boolean.parseBoolean(split[3]);
                Integer.parseInt(split[4]);
                if (parseBoolean) {
                    u.f5486bF.f4654m = null;
                    final Object obj = new Object();
                    C0674ae aeVar = new C0674ae() { // from class: com.corrodinggames.rts.gameFramework.g.ad.1
                        @Override // com.corrodinggames.rts.gameFramework.p036g.C0674ae
                        /* renamed from: a */
                        public void mo1219a(String str5) {
                            AbstractC0789l u2 = AbstractC0789l.m651u();
                            AbstractC0789l.m683d("Entered password");
                            if (u2.f5486bF.f4664A) {
                                AbstractC0789l.m732a("Cannot enter a password when we are a server");
                            } else {
                                u2.f5486bF.f4654m = str5;
                            }
                            synchronized (obj) {
                                obj.notify();
                            }
                        }

                        @Override // com.corrodinggames.rts.gameFramework.p036g.C0674ae
                        /* renamed from: a */
                        public void mo1220a() {
                            synchronized (obj) {
                                obj.notify();
                            }
                        }
                    };
                    AbstractC0789l.m683d("Asking for password..");
                    synchronized (obj) {
                        m1352a(aeVar);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (u.f5486bF.f4654m == null) {
                        AbstractC0789l.m695b("No password entered");
                        throw new C0677ag();
                    }
                    AbstractC0789l.m683d("Password has been entered");
                }
                String str5 = null;
                if (parseBoolean) {
                    str5 = u.f5486bF.f4654m;
                    if (str5 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                final Object obj2 = new Object();
                C0721w wVar = new C0721w() { // from class: com.corrodinggames.rts.gameFramework.g.ad.2
                    @Override // com.corrodinggames.rts.gameFramework.p036g.C0721w
                    /* renamed from: a */
                    public void mo1032a(String str6) {
                        super.mo1032a(str6);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }

                    @Override // com.corrodinggames.rts.gameFramework.p036g.C0721w
                    /* renamed from: a */
                    public void mo1031a(String str6, EnumC0722x xVar, Exception exc) {
                        super.mo1031a(str6, xVar, exc);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }
                };
                synchronized (obj2) {
                    C0710n.m1055a(wVar, str4, parseInt, str5);
                    try {
                        obj2.wait(15000L);
                    } catch (InterruptedException e2) {
                    }
                }
                if (wVar.f5044b != null) {
                    throw new IOException(wVar.f5044b);
                } else if (wVar.f5043a != null) {
                    return m1291b(wVar.f5043a, z);
                } else {
                    throw new IOException("Failed to get game server info.");
                }
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                throw new IOException("Bad server connect string");
            }
        } else {
            if (trim.toLowerCase(Locale.ENGLISH).endsWith(".relay")) {
                trim = trim + ".corrodinggames.com";
            }
            if (trim.startsWith("[TCP]")) {
                trim = trim.substring("[TCP]".length());
                z = true;
            }
            if (trim.length() > 4 && !trim.contains(":") && !trim.contains(".") && !trim.equals("localhost") && !trim.contains("/") && !trim.contains("\\")) {
                String str6 = ("" + trim.charAt(0)) + ".relay.corrodinggames.com/" + trim;
                AbstractC0789l.m683d("Converting connect string to: " + str6);
                trim = str6;
            }
            u.f5486bF.f4670J = null;
            if (trim.contains("/") || trim.contains("\\")) {
                int indexOf = trim.indexOf("/");
                int indexOf2 = trim.indexOf("\\");
                if (indexOf == -1) {
                    indexOf = trim.length();
                }
                if (indexOf2 == -1) {
                    indexOf2 = trim.length();
                }
                int c = C0654f.m1495c(indexOf, indexOf2);
                String trim2 = trim.substring(c + 1).trim();
                if (!trim2.equals("")) {
                    u.f5486bF.f4670J = trim2;
                }
                trim = trim.substring(0, c);
            }
            String str7 = trim;
            int i = 5123;
            String[] split2 = trim.split(":");
            if (split2.length > 1) {
                str7 = null;
                for (int i2 = 0; i2 < split2.length - 1; i2++) {
                    if (str7 == null) {
                        str2 = "";
                    } else {
                        str2 = str7 + ":";
                    }
                    str7 = str2 + split2[i2];
                }
                String str8 = split2[split2.length - 1];
                try {
                    i = Integer.parseInt(str8);
                } catch (NumberFormatException e4) {
                    String str9 = "Bad port number:" + str8;
                    e4.printStackTrace();
                    throw new IOException(str9);
                }
            }
            if (!z && u.f5486bF.m1380L()) {
                z2 = true;
            }
            int i3 = 7000;
            AbstractC0789l.m683d("");
            AbstractC0789l.m683d("===============================");
            AbstractC0789l.m683d("Connect to: " + trim);
            if (!z2) {
                hVar = new Socket();
                AbstractC0789l.m683d("connecting to Server.. (tcp)");
            } else {
                hVar = new C0017h();
                AbstractC0789l.m683d("connecting to Server.. (udp)");
                i3 = 5000;
            }
            hVar.setTcpNoDelay(true);
            try {
                try {
                    hVar.connect(new InetSocketAddress(InetAddress.getByName(str7), i), i3);
                    return hVar;
                } catch (UnknownHostException e5) {
                    String str10 = "Failed to connect to host";
                    if (z2) {
                        str10 = str10 + " (udp)";
                    }
                    AbstractC0789l.m683d("UnknownHostException.." + str10);
                    e5.printStackTrace();
                    throw new IOException(str10, e5);
                } catch (IOException e6) {
                    String str11 = "Failed to connect to host";
                    if (z2) {
                        str11 = str11 + " (udp)";
                    }
                    String str12 = str11 + " - " + e6.getMessage();
                    AbstractC0789l.m683d("IOException.." + str12);
                    e6.printStackTrace();
                    throw new IOException(str12, e6);
                }
            } catch (IllegalArgumentException e7) {
                AbstractC0789l.m695b("IllegalArgumentException..Incorrect server format");
                e7.printStackTrace();
                throw new IOException("Incorrect server format", e7);
            }
        }
    }

    /* renamed from: M */
    public void m1379M() {
        final AbstractC0789l u = AbstractC0789l.m651u();
        final C0606e a = C0606e.m1853a(C0652a.m1577a("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        a.m1854a(C0652a.m1577a("menus.ingame.resume", new Object[0]), new AbstractC0611i() { // from class: com.corrodinggames.rts.gameFramework.g.ad.3
            @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i
            /* renamed from: a */
            public boolean mo1221a(C0604c cVar) {
                a.m1819i();
                return true;
            }
        });
        a.m1854a(C0652a.m1577a("menus.ingame.reconnect", new Object[0]), new AbstractC0611i() { // from class: com.corrodinggames.rts.gameFramework.g.ad.4
            @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i
            /* renamed from: a */
            public boolean mo1221a(C0604c cVar) {
                a.m1819i();
                Hcat_Multiplaye.this.m1378N();
                return true;
            }
        });
        a.m1854a(C0652a.m1577a("menus.ingame.disconnect", new Object[0]), new AbstractC0611i() { // from class: com.corrodinggames.rts.gameFramework.g.ad.5
            @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i
            /* renamed from: a */
            public boolean mo1221a(C0604c cVar) {
                a.m1819i();
                u.m733a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.g.ad.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Hcat_Multiplaye.this.m1293b("already disconnected");
                        u.f5481bA.f4277d.m1867m();
                    }
                });
                return true;
            }
        });
        u.f5481bA.m1762a(a);
        this.f4720bz = true;
    }

    /* renamed from: N */
    public synchronized boolean m1378N() {
        Socket socket = this.f4777bx;
        if (socket == null) {
            AbstractC0789l.m683d("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        AbstractC0789l.m683d("reconnectToServer attempted");
        if (this.f4734z) {
            AbstractC0789l.m683d("reconnectToServer: disconnecting");
            m1293b("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            AbstractC0789l.m683d("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        AbstractC0789l.m683d("reconnectToServer: connecting to: " + str);
        try {
            return m1330a(m1291b(str, false));
        } catch (C0677ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m1330a(Socket socket) {
        if (this.f4734z) {
            m1293b("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        m1238m();
        AbstractC0789l.m651u();
        this.f4653l = socket.getPort();
        this.f4734z = true;
        this.f4664A = false;
        m1282c("connected to Server..");
        C0698c cVar = new C0698c(this, socket);
        cVar.f4925n = true;
        cVar.m1121d();
        this.f4766aV.add(cVar);
        m1267e(cVar);
        m1320ad();
        this.f4777bx = socket;
        return true;
    }

    /* renamed from: a */
    public C0698c m1356a(AbstractC0171m mVar) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4934w == mVar) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0698c m1300b(AbstractC0171m mVar) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (!cVar.f4948a && cVar.f4934w == mVar) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: O */
    public C0698c m1377O() {
        if (this.f4664A) {
            return null;
        }
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (!cVar.f4948a) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m1276d(C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketToAll, not networked");
        } else {
            m1247i(arVar);
        }
    }

    /* renamed from: i */
    private void m1247i(C0692ar arVar) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n && !cVar.f4948a && !cVar.f4928q) {
                cVar.m1132a(arVar);
            }
        }
    }

    /* renamed from: e */
    public void m1268e(C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar = (C0698c) it.next();
            if (cVar.f4925n && !cVar.f4948a) {
                cVar.m1132a(arVar);
            }
        }
    }

    /* renamed from: f */
    public void m1261f(C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketToServer, not networked");
        } else if (this.f4664A) {
            throw new RuntimeException("We are a server");
        } else {
            m1276d(arVar);
        }
    }

    /* renamed from: g */
    public void m1255g(C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketToClients, not networked");
        } else if (!this.f4664A) {
            throw new RuntimeException("We are not a server");
        } else {
            m1268e(arVar);
        }
    }

    /* renamed from: h */
    public void m1251h(C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketToClients, not networked");
        } else if (!this.f4664A) {
            throw new RuntimeException("We are not a server");
        } else {
            m1276d(arVar);
        }
    }

    /* renamed from: a */
    public void m1341a(C0698c cVar, C0692ar arVar) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("Skipping sendPacketOnConnection, not networked");
        } else {
            cVar.m1132a(arVar);
        }
    }

    /* renamed from: P */
    public void m1376P() {
        if (this.f4664A) {
            m1282c("registerConnection: We are a server");
        }
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            m1254g((C0698c) it.next());
        }
    }

    /* renamed from: Q */
    public void m1375Q() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5479by.networkClientId = null;
        if (this.f4676P == null) {
            AbstractC0789l.m683d("generateNewClientId: serverUUID==null");
            this.f4676P = "x";
        }
        m1374R();
        u.f5479by.save();
    }

    /* renamed from: R */
    public String m1374R() {
        AbstractC0789l u = AbstractC0789l.m651u();
        boolean z = false;
        if (u.f5479by.networkClientId == null) {
            z = true;
        }
        if (!this.f4779bA) {
            this.f4779bA = true;
            if (AbstractC0789l.m710al()) {
                String ab = m1322ab();
                if (!ab.equals(u.f5479by.networkClientIdMachineKey)) {
                    if (u.f5479by.networkClientIdMachineKey != null) {
                        AbstractC0789l.m683d("Machine appears to have changed: " + u.f5479by.networkClientIdMachineKey + " vs " + ab);
                    }
                    u.f5479by.networkClientIdMachineKey = ab;
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC0789l.m683d("new networkClientId needed");
            u.f5479by.networkClientId = UUID.randomUUID().toString();
            u.f5479by.save();
        }
        String str = u.f5479by.networkClientId;
        if (this.f4676P != null) {
            return C0654f.m1478e(str + this.f4676P);
        }
        throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
    }

    /* renamed from: S */
    public void m1373S() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5479by.networkServerId = UUID.randomUUID().toString();
        u.f5479by.save();
    }

    /* renamed from: T */
    public String m1372T() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5479by.networkServerId == null) {
            m1373S();
        }
        return u.f5479by.networkServerId;
    }

    /* renamed from: U */
    public String m1371U() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4664A) {
            return u.f5479by.networkServerId;
        }
        return this.f4676P;
    }

    /* renamed from: e */
    public void m1267e(C0698c cVar) {
        C0690ap apVar = new C0690ap();
        try {
            int i = 1;
            if (AbstractC0789l.m710al()) {
                i = 2;
            }
            if (AbstractC0789l.f5560aJ) {
                i = 3;
            }
            apVar.m1174c("com.corrodinggames.rts");
            apVar.mo1109a(3);
            apVar.mo1109a(this.f4782d);
            apVar.mo1109a(i);
            apVar.m1178b(this.f4670J);
            apVar.m1174c(this.f4660w);
            m1341a(cVar, apVar.m1181b(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public void m1260f(C0698c cVar) {
        C0690ap apVar = new C0690ap();
        try {
            AbstractC0789l u = AbstractC0789l.m651u();
            apVar.m1174c("com.corrodinggames.rts");
            apVar.mo1109a(1);
            apVar.mo1109a(this.f4782d);
            apVar.mo1109a(u.mo686c(true));
            apVar.m1174c(u.mo672h());
            apVar.m1174c(m1372T());
            apVar.mo1109a(cVar.f4940J);
            m1341a(cVar, apVar.m1181b(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m1254g(C0698c cVar) {
        AbstractC0789l.m683d("sendRegisterConnection...");
        C0690ap apVar = new C0690ap();
        try {
            apVar.m1174c("com.corrodinggames.rts");
            apVar.mo1109a(4);
            apVar.mo1109a(this.f4782d);
            AbstractC0789l u = AbstractC0789l.m651u();
            apVar.mo1109a(u.mo686c(true));
            apVar.m1174c(this.f4660w);
            String str = null;
            if (this.f4654m != null) {
                str = C0654f.m1478e(this.f4654m);
            }
            apVar.m1178b(str);
            apVar.m1174c(u.mo672h());
            apVar.m1174c(m1374R());
            apVar.mo1109a(u.mo653s());
            apVar.m1174c(m1263f(this.f4739Q));
            m1341a(cVar, apVar.m1181b(110));
            this.f4780bB = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public String m1263f(int i) {
        String str = ((((((((("c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (m1270e(0) * 11 * i)) + "1:" + ((m1270e(1) * 12) + i)) + "2:" + (m1270e(2) * 13 * i)) + "3:" + ((m1270e(3) * 14) + i)) + "4:" + (m1270e(4) * 15 * i)) + "5:" + ((m1270e(5) * 16) + i)) + "6:" + (m1270e(6) * 17 * i)) + "t1:" + (AbstractC0171m.f1283h.money * 11 * i);
        int i2 = 5 * i;
        if (m1248i() != m1270e(this.f4763aH.f4812c)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    /* renamed from: V */
    public void m1370V() {
        if (this.f4664A) {
            throw new RuntimeException("We are a server");
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0690ap apVar = new C0690ap();
        try {
            apVar.mo1104a(this.f4661bG);
            apVar.mo1104a(u.f5582ba);
            m1261f(apVar.m1181b(112));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public void m1249h(String str) {
        if (!this.f4664A) {
            m1282c("cannot send sendSystemMessage:" + str + ", we are not a server");
        } else if (!this.f4734z || this.f4735D) {
            m1282c("cannot send sendSystemMessage:" + str + ", not networked");
        } else {
            AbstractC0789l.m683d("sendSystemMessage:" + str);
            m1343a((C0698c) null, (AbstractC0171m) null, (String) null, str);
        }
    }

    /* renamed from: i */
    public void m1245i(String str) {
        m1241k("-qc " + str);
    }

    /* renamed from: j */
    public void m1243j(String str) {
        boolean z = true;
        String str2 = null;
        if (str != null) {
            String trim = str.trim();
            if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
                String trim2 = trim.substring(1).trim();
                int indexOf = trim2.indexOf(" ");
                if (indexOf == -1) {
                    indexOf = trim2.length();
                }
                str2 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            }
        }
        if ("share".equals(str2)) {
            z = false;
        }
        if ("t".equals(str2)) {
            z = false;
        }
        if (z) {
            str = "-t " + str;
        }
        m1241k(str);
    }

    /* renamed from: k */
    public void m1241k(String str) {
        if (!this.f4734z) {
            AbstractC0789l.m683d("sendChatMessage: not networked:" + str);
            m1344a((C0698c) null, -1, (String) null, str);
        } else if (this.f4664A) {
            m1343a((C0698c) null, this.f4662x, this.f4660w, str);
            m1294b(null, this.f4662x, this.f4660w, str);
        } else {
            try {
                C0690ap apVar = new C0690ap();
                apVar.m1174c(str);
                apVar.m1175c(0);
                m1261f(apVar.m1181b(140));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m1343a(C0698c cVar, AbstractC0171m mVar, String str, String str2) {
        m1342a(cVar, mVar, str, str2, null);
    }

    /* renamed from: a */
    public void m1342a(C0698c cVar, AbstractC0171m mVar, String str, String str2, C0698c cVar2) {
        C0162e eVar;
        try {
            boolean z = false;
            boolean z2 = false;
            String l = m1239l(str2);
            if ("t".equalsIgnoreCase(l)) {
                if (mVar != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    AbstractC0789l.m695b("toOnlyTeams failed team==null");
                }
            }
            if (mVar != null && "surrender".equalsIgnoreCase(l)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (mVar != null && "i".equalsIgnoreCase(l)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (mVar != null && "qc".equalsIgnoreCase(l)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!(z2 || mVar == null || mVar == this.f4785bn || mVar == this.f4786bo || this.f4726c.m1395a(cVar, mVar, str2, z))) {
                z2 = true;
            }
            C0690ap apVar = new C0690ap();
            apVar.m1174c(str2);
            apVar.m1175c(3);
            apVar.m1178b(str);
            apVar.m1191a(cVar);
            int i = -1;
            if (mVar != null) {
                i = mVar.f1230i;
            }
            apVar.mo1109a(i);
            C0692ar b = apVar.m1181b(141);
            if (z) {
                Iterator it = this.f4766aV.iterator();
                while (it.hasNext()) {
                    C0698c cVar3 = (C0698c) it.next();
                    if (cVar3.f4925n && !cVar3.f4948a && (eVar = cVar3.f4934w) != null && eVar.m3716d(mVar)) {
                        cVar3.m1132a(b);
                    }
                }
                AbstractC0171m mVar2 = this.f4662x;
                if (mVar2 != null && mVar2.m3716d(mVar)) {
                    m1344a(cVar, i, str, str2);
                }
            } else if (z2) {
                AbstractC0789l.m695b("info message:" + m1281c(str, str2));
            } else {
                if (cVar2 != null) {
                    m1341a(cVar2, b);
                } else {
                    m1255g(b);
                }
                m1344a(cVar, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static String m1239l(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((!trim.startsWith("-") && !trim.startsWith(".") && !trim.startsWith("_")) || trim.length() < 2) {
            return null;
        }
        String trim2 = trim.substring(1).trim();
        int indexOf = trim2.indexOf(" ");
        if (indexOf == -1) {
            indexOf = trim2.length();
        }
        return trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: c */
    public static String m1281c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* renamed from: a */
    private void m1344a(C0698c cVar, int i, String str, String str2) {
        if (!this.f4734z && str2.startsWith("-i ")) {
            return;
        }
        if (this.f4734z || !str2.startsWith("-qc ")) {
            String c = C0652a.m1573c(str2);
            if (str != null) {
                m1273d("New Message", str + ": " + c);
            }
            C0698c cVar2 = null;
            if (this.f4664A) {
                cVar2 = cVar;
            }
            this.f4765aL.m1403a(i, str, c, cVar2);
            this.f4726c.mo375a(i, str, c, cVar);
            boolean z = false;
            if (this.isGameStart_Hcat) {
                z = true;
            }
            if (!this.f4734z) {
                z = true;
            }
            if (z) {
                m1333a(str, c);
                return;
            }
            String c2 = m1281c(str, c);
            if (!AbstractC0789l.f5556aF) {
                ActivityC0092l.m4177c(c2);
            }
        }
    }

    /* renamed from: a */
    public void m1338a(C0698c cVar, byte[] bArr, boolean z, boolean z2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            C0690ap apVar = new C0690ap();
            apVar.m1175c(0);
            apVar.mo1109a(u.f5585bg);
            apVar.mo1109a(u.f5467bh);
            apVar.mo1110a(m1365a());
            apVar.mo1110a(1.0f);
            apVar.mo1104a(z);
            apVar.mo1104a(z2);
            apVar.m1170e("gameSave");
            apVar.m1177b(bArr);
            apVar.mo1107a("gameSave");
            m1341a(cVar, apVar.m1181b(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1325a(boolean z, boolean z2, boolean z3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            C0690ap apVar = new C0690ap();
            apVar.m1175c(0);
            apVar.mo1109a(u.f5585bg);
            apVar.mo1109a(u.f5467bh);
            apVar.mo1110a(m1365a());
            apVar.mo1110a(1.0f);
            apVar.mo1104a(z);
            apVar.mo1104a(z2);
            apVar.m1170e("gameSave");
            u.f5489bI.m388a(apVar);
            apVar.mo1107a("gameSave");
            if (z) {
            }
            C0692ar b = apVar.m1181b(35);
            m1276d(b);
            if (z3) {
                if (!this.f4664A) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                b.f4893a = this.f4784aU;
                m1348a(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: W */
    public boolean m1369W() {
        m1383I();
        m1387E();
        return m1339a((C0698c) null, false);
    }

    /* renamed from: a */
    public boolean m1339a(C0698c cVar, boolean z) {
        if (!this.f4664A) {
            throw new RuntimeException("We are not a server");
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0690ap apVar = new C0690ap();
        try {
            apVar.m1175c(0);
            apVar.m1184a(this.f4763aH.f4810a);
            if (this.f4763aH.f4810a == EnumC0679ai.f4826c) {
                u.f5489bI.m385a(this.f4763aH.f4811b, apVar);
                apVar.m1174c("SAVE:" + this.f4763aH.f4811b);
            } else if (this.f4763aH.f4810a == EnumC0679ai.f4825b) {
                try {
                    C0148b.m3933a(this.f4764aI, apVar);
                    apVar.m1174c("STEAM:" + this.f4764aI);
                } catch (IOException e) {
                    e.printStackTrace();
                    u.m687c("Map error starting game", "Map error: " + e.getMessage());
                    return false;
                }
            } else {
                apVar.m1174c(this.f4764aI);
            }
            apVar.mo1104a(z);
            C0692ar b = apVar.m1181b(120);
            if (cVar == null) {
                m1255g(b);
            } else {
                m1341a(cVar, b);
            }
            if (this.isGameStart_Hcat) {
                return true;
            }
            m1306ar();
            return true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: X */
    public void m1368X() {
        this.f4713bi = true;
        AbstractC0789l.m683d("onStartGameFailed");
        if (this.f4664A) {
            this.isGameStart_Hcat = false;
            m1249h("Map load failed.");
            return;
        }
        m1293b("Map load failed");
    }

    /* renamed from: ar */
    private void m1306ar() {
        this.isGameStart_Hcat = true;
        this.f4713bi = false;
        this.f4714bj = false;
        AbstractC0789l.m683d("Starting new network game (" + m1371U() + ")");
        if (this.f4657p && this.f4664A) {
            C0710n.m1039c();
        }
        if (!AbstractC0789l.f5556aF) {
            ActivityC0092l.m4174l();
        }
        this.f4726c.mo367b();
    }

    /* renamed from: as */
    private void m1305as() {
        m1234o();
        if (this.f4657p && this.f4664A) {
            C0710n.m1039c();
        }
        if (!AbstractC0789l.f5556aF) {
        }
    }

    /* renamed from: Y */
    public String m1367Y() {
        ArrayList aa = m1323aa();
        if (aa == null || aa.size() == 0) {
            return null;
        }
        return (String) aa.get(0);
    }

    /* renamed from: Z */
    public String m1366Z() {
        ArrayList aa = m1323aa();
        if (aa == null || aa.size() == 0) {
            return null;
        }
        String str = "";
        boolean z = true;
        Iterator it = aa.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ", ";
            }
            str = str + str2;
        }
        return str;
    }

    /* renamed from: aa */
    public ArrayList m1323aa() {
        double a;
        double a2;
        long a3 = C0586bj.m1962a();
        try {
            ArrayList d = m1272d(true);
            if (d != null && d.size() > 0) {
                return d;
            }
            ArrayList d2 = m1272d(false);
            if (C0586bj.m1960a(a3) > 2.0d) {
                AbstractC0789l.m695b("getLocalIpAddressList was slow, taking:" + C0586bj.m1961a(a2));
            }
            return d2;
        } finally {
            if (C0586bj.m1960a(a3) > 2.0d) {
                AbstractC0789l.m695b("getLocalIpAddressList was slow, taking:" + C0586bj.m1961a(a));
            }
        }
    }

    /* renamed from: ab */
    public String m1322ab() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                if (hardwareAddress != null) {
                    String trim = new String(hardwareAddress).trim();
                    if (trim.length() > 2) {
                        str = trim;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str != null) {
            return C0654f.m1494c(str);
        }
        return "[blank]";
    }

    /* renamed from: d */
    public ArrayList m1272d(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String str = nextElement.getHostAddress().toString();
                        if (!str.contains("%")) {
                            if (!z) {
                                arrayList.add(str);
                            } else if (str.contains(".")) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Log.m4292d("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    /* renamed from: ac */
    InetAddress m1321ac() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) AbstractC0789l.m651u().f5574ah.mo4538b("wifi")).getDhcpInfo();
            int i = (dhcpInfo.ipAddress & dhcpInfo.netmask) | (dhcpInfo.netmask ^ (-1));
            byte[] bArr = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            }
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public void m1273d(String str, String str2) {
        if (!AbstractC0789l.f5556aF) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (!this.f4735D && !u.f5490bJ.m1983h()) {
                if (ActivityC0092l.m4176j()) {
                    m1257g(2);
                    return;
                }
                NotificationManager notificationManager = (NotificationManager) u.f5574ah.mo4538b("notification");
                PendingIntent activity = PendingIntent.getActivity(u.f5574ah, 0, new Intent(u.f5574ah, ActivityC0065a.class), 2);
                if (Build.VERSION.SDK_INT >= 11) {
                    Notification.Builder builder = new Notification.Builder(u.f5574ah);
                    builder.setContentTitle("Rusted Warfare Multiplayer");
                    builder.setContentText(str + ": " + str2);
                    builder.setSmallIcon(C0063R.drawable.icon);
                    builder.setContentIntent(activity);
                    builder.setOngoing(false);
                    builder.setAutoCancel(true);
                    m1358a(notificationManager);
                    m1359a(builder, "multiplayerChatId");
                    notificationManager.notify(2, builder.getNotification());
                }
            }
        }
    }

    /* renamed from: ad */
    public void m1320ad() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!this.f4734z || u == null || !u.m768F()) {
            m1257g(1);
        } else {
            m1304at();
        }
    }

    /* renamed from: a */
    private void m1359a(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                AbstractC0789l.m727a("setChannelId failed", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m1358a(NotificationManager notificationManager) {
        m1357a(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        m1357a(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    /* renamed from: a */
    private void m1357a(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                AbstractC0789l.m727a("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    /* renamed from: at */
    private void m1304at() {
        if (!AbstractC0789l.f5556aF) {
            AbstractC0789l u = AbstractC0789l.m651u();
            PendingIntent activity = PendingIntent.getActivity(u.f5574ah, 0, new Intent(u.f5574ah, ActivityC0065a.class), 2);
            NotificationManager notificationManager = (NotificationManager) u.f5574ah.mo4538b("notification");
            if (Build.VERSION.SDK_INT >= 11) {
                if (Build.VERSION.SDK_INT >= 26) {
                }
                Notification.Builder builder = new Notification.Builder(u.f5574ah);
                builder.setContentTitle("Rusted Warfare Multiplayer");
                builder.setContentText("A multiplayer game is in progress");
                builder.setSmallIcon(C0063R.drawable.icon);
                builder.setContentIntent(activity);
                builder.setOngoing(true);
                m1358a(notificationManager);
                m1359a(builder, "multiplayerStatusId");
                if (Build.VERSION.SDK_INT >= 16) {
                    builder.build();
                }
                notificationManager.notify(1, builder.getNotification());
            }
        }
    }

    /* renamed from: g */
    private void m1257g(int i) {
        if (!AbstractC0789l.f5556aF) {
            ((NotificationManager) AbstractC0789l.m651u().f5574ah.mo4538b("notification")).cancel(i);
        }
    }

    /* renamed from: ae */
    public int m1319ae() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
            AbstractC0171m n = AbstractC0171m.m3688n(i2);
            if (n != null && !n.f1239r) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: af */
    public int m1318af() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
            if (AbstractC0171m.m3688n(i2) != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void m1286c(AbstractC0171m mVar) {
        if (this.f4664A) {
            m1277d(mVar);
        } else if (this.f4668F) {
            m1245i("-kick " + (mVar.f1230i + 1));
        } else {
            AbstractC0789l.m695b("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    /* renamed from: d */
    public void m1277d(AbstractC0171m mVar) {
        if (mVar instanceof C0118a) {
            mVar.m3778E();
        } else if (this.f4662x == mVar) {
            AbstractC0789l.m694b("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            C0698c a = m1356a(mVar);
            if (a == null) {
                m1259f("Kick player: cannot find connection for team");
            } else {
                m1340a(a, "Kicked by host");
                a.m1129a("Kicked by host");
            }
            mVar.m3778E();
        }
        m1384H();
        ActivityC0092l.m4175k();
    }

    /* renamed from: ag */
    public void m1317ag() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!this.f4664A) {
            AbstractC0789l.m694b("addAIToGame", "We are not a server");
            return;
        }
        int C = AbstractC0171m.m3780C();
        if (C == -1) {
            u.m731a("No free slots for AI", 1);
        }
        C0118a aVar = new C0118a(C);
        aVar.f1238q = "AI";
        aVar.f1236o = C % 2;
        aVar.f1240s = this.f4763aH.f4815f;
        m1316ah();
        u.f5486bF.f4726c.m1397a(aVar);
        u.f5486bF.m1275d((C0698c) null);
        ActivityC0092l.m4175k();
    }

    /* renamed from: ah */
    public boolean m1316ah() {
        if (this.f4664A || !this.f4734z) {
            boolean z = false;
            for (int i = 0; i < AbstractC0171m.f1275a; i++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i);
                if (n != null && n.f1239r) {
                    String str = "AI - " + m1301b(n.m3677y());
                    if (!str.equals(n.f1238q)) {
                        n.f1238q = str;
                        z = true;
                    }
                }
            }
            return z;
        }
        AbstractC0789l.m694b("updateNamesOfAI", "We are not a server");
        return false;
    }

    /* renamed from: a */
    public void m1355a(AbstractC0171m mVar, int i) {
        synchronized (this.f4781bC) {
            m1285c(mVar, i);
        }
    }

    /* renamed from: c */
    private void m1285c(AbstractC0171m mVar, int i) {
        if (mVar.f1230i != i) {
            int i2 = mVar.f1230i;
            int i3 = mVar.f1236o;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = AbstractC0171m.m3779D();
                if (i == -1) {
                    m1274d("No free spectator slots");
                    return;
                }
            }
            AbstractC0171m n = AbstractC0171m.m3688n(i);
            mVar.m3698i(i);
            mVar.f1236o = i3;
            if (z) {
                mVar.f1236o = -3;
            }
            if (n != null) {
                int i4 = n.f1236o;
                n.m3698i(i2);
                if (i4 == -3) {
                    n.f1236o = -3;
                } else {
                    n.f1236o = i3;
                }
            }
            m1386F();
            m1384H();
        }
    }

    /* renamed from: a */
    public void m1350a(EnumC0684ak akVar) {
        synchronized (this.f4781bC) {
            m1297b(akVar);
        }
    }

    /* renamed from: b */
    private synchronized void m1297b(EnumC0684ak akVar) {
        if (!AbstractC0789l.m651u().f5486bF.f4664A) {
            AbstractC0789l.m683d("Not server");
            return;
        }
        if (akVar == EnumC0684ak.f4832a) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < AbstractC0171m.f1275a; i++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i);
                if (n != null) {
                    arrayList.add(n);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += C0654f.m1555a(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0171m) arrayList.get(i3)).m3698i(i2);
                i2 += 2;
                ((AbstractC0171m) arrayList.get(i3)).f1236o = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((AbstractC0171m) arrayList.get(i5)).m3698i(i4);
                i4 += 2;
                ((AbstractC0171m) arrayList.get(i5)).f1236o = 1;
            }
        } else if (akVar == EnumC0684ak.f4833b) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < AbstractC0171m.f1275a; i6++) {
                AbstractC0171m n2 = AbstractC0171m.m3688n(i6);
                if (n2 != null) {
                    arrayList2.add(n2);
                }
            }
            Collections.shuffle(arrayList2);
            int size2 = arrayList2.size() / 3;
            if (size2 >= arrayList2.size()) {
                size2 = arrayList2.size();
            }
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                AbstractC0171m mVar = (AbstractC0171m) arrayList2.get(i8);
                mVar.m3698i(i7);
                mVar.f1236o = 0;
                i7 += 3;
                arrayList2.set(i8, null);
            }
            int i9 = 0 + size2;
            int size3 = i9 + (arrayList2.size() / 3);
            if (size3 >= arrayList2.size()) {
                size3 = arrayList2.size();
            }
            if (i9 >= arrayList2.size()) {
                i9 = arrayList2.size();
            }
            int i10 = 1;
            for (int i11 = i9; i11 < size3; i11++) {
                AbstractC0171m mVar2 = (AbstractC0171m) arrayList2.get(i11);
                mVar2.m3698i(i10);
                mVar2.f1236o = 1;
                i10 += 3;
                arrayList2.set(i11, null);
            }
            int i12 = i9 + size2;
            if (i12 >= arrayList2.size()) {
                i12 = arrayList2.size();
            }
            int i13 = 2;
            for (int i14 = i12; i14 < arrayList2.size(); i14++) {
                AbstractC0171m mVar3 = (AbstractC0171m) arrayList2.get(i14);
                if (i13 >= AbstractC0171m.f1275a) {
                    mVar3.m3698i(i13);
                    mVar3.f1236o = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                AbstractC0171m mVar4 = (AbstractC0171m) arrayList2.get(i15);
                if (mVar4 != null) {
                    for (int i16 = 0; i16 < AbstractC0171m.f1275a; i16++) {
                        if (AbstractC0171m.m3688n(i16) == null) {
                            mVar4.m3698i(i16);
                            mVar4.f1236o = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (akVar == EnumC0684ak.f4834c) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < AbstractC0171m.f1275a; i17++) {
                AbstractC0171m n3 = AbstractC0171m.m3688n(i17);
                if (n3 != null) {
                    arrayList3.add(n3);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((AbstractC0171m) arrayList3.get(i19)).m3698i(i18);
                ((AbstractC0171m) arrayList3.get(i19)).f1236o = i18;
                i18++;
            }
        } else if (akVar == EnumC0684ak.f4835d) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < AbstractC0171m.f1275a; i20++) {
                AbstractC0171m n4 = AbstractC0171m.m3688n(i20);
                if (n4 != null) {
                    arrayList4.add(n4);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int D = AbstractC0171m.m3779D();
                if (D != -1) {
                    ((AbstractC0171m) arrayList4.get(i22)).m3698i(D);
                }
                ((AbstractC0171m) arrayList4.get(i22)).f1236o = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + akVar);
        }
        m1386F();
    }

    /* renamed from: a */
    public void m1354a(AbstractC0171m mVar, int i, Integer num) {
        String str = "";
        if (num != null) {
            str = " " + num;
        }
        if (this.f4668F || this.f4662x != mVar) {
            m1245i("-move " + (mVar.f1230i + 1) + " " + (i + 1) + str);
        } else {
            m1245i("-self_move " + (i + 1) + str);
        }
    }

    /* renamed from: b */
    public void m1299b(AbstractC0171m mVar, int i) {
        if (i != -1) {
            i++;
        }
        if (this.f4668F || this.f4662x != mVar) {
            m1245i("-team " + (mVar.f1230i + 1) + " " + i);
        } else {
            m1245i("-self_team " + i);
        }
    }

    /* renamed from: e */
    public void m1269e(AbstractC0171m mVar) {
        if (!mVar.f1248x) {
            mVar.f1248x = true;
            String str = mVar.f1238q;
            if (str == null) {
                str = "Player - " + (mVar.f1230i + 1) + "";
            }
            m1249h(str + " is victorious!");
        }
    }

    /* renamed from: f */
    public void m1262f(AbstractC0171m mVar) {
        String str;
        AbstractC0789l u = AbstractC0789l.m651u();
        boolean z = false;
        String str2 = mVar.f1238q;
        if (str2 == null) {
            str2 = "Player - " + (mVar.f1230i + 1) + "";
        }
        String str3 = str2 + " was defeated";
        if (!this.f4712bh) {
            str = str3 + " (Team: " + mVar.m3705f() + ")";
        } else {
            int e = AbstractC0171m.m3710e();
            str = str3 + " (" + e + " players remaining)";
            if (e == 1) {
                z = true;
            }
        }
        if (!u.m767G() && u.f5585bg < 60) {
            AbstractC0789l.m683d("Not showing defeated message: " + str);
            str = null;
        }
        if (mVar.f1244u) {
            str = null;
        }
        if (str != null) {
            m1249h(str);
        }
        if (z) {
            AbstractC0171m.m3771L();
        }
    }

    /* renamed from: g */
    public void m1256g(AbstractC0171m mVar) {
        String str;
        String str2;
        AbstractC0789l u = AbstractC0789l.m651u();
        String str3 = mVar.f1238q;
        if (str3 == null) {
            str3 = "Player - " + (mVar.f1230i + 1) + "";
        }
        boolean z = false;
        if (u.f5585bg < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.f4712bh) {
            str2 = str + " (Team: " + mVar.m3705f() + ")";
        } else {
            int e = AbstractC0171m.m3710e();
            str2 = str + " (" + e + " players remaining)";
            if (e == 1) {
                z = true;
            }
        }
        if (!u.m767G() && u.f5585bg < 60) {
            AbstractC0789l.m683d("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (mVar.f1244u) {
            str2 = null;
        }
        if (mVar.m3745b()) {
            str2 = null;
        }
        if (str2 != null) {
            m1249h(str2);
        }
        if (z) {
            AbstractC0171m.m3771L();
        }
    }

    /* renamed from: ai */
    public synchronized void m1315ai() {
        if (this.f4721bD != null) {
            this.f4721bD.cancel();
            this.f4721bD = null;
        }
    }

    /* renamed from: aj */
    public synchronized void m1314aj() {
        if (this.f4657p && this.f4664A && this.f4721bD == null) {
            this.f4721bD = new Timer();
            this.f4721bD.schedule(new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.g.ad.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C0710n.m1039c();
                }
            }, 60000L, 60000L);
        }
    }

    /* renamed from: ak */
    public String m1313ak() {
        AbstractC0789l u = AbstractC0789l.m651u();
        String str = "";
        if (u.f5486bF.f4664A && !u.f5486bF.f4735D) {
            String Z = u.f5486bF.m1366Z();
            if (this.f4665B) {
                if (this.f4666C != null) {
                    str = str + this.f4666C;
                }
            } else if (Z != null) {
                String str2 = "Local IP address: " + Z + " port: " + u.f5486bF.f4653l;
                if (u.f5486bF.f4710be == null) {
                    str2 = str2 + "\nRetrieving your public IP...";
                } else if (!u.f5486bF.f4710be.booleanValue()) {
                    str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                } else if (!(u.f5486bF.f4708bc == null || u.f5486bF.f4709bd == null)) {
                    str2 = str2 + "\nYour public address is " + (u.f5486bF.f4709bd.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (u.m765I()) {
            if (this.f4656o) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (AbstractC0789l.m712aj() && u.f5486bF.f4664A) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (AbstractC0789l.m710al()) {
                str = str + "\n";
            }
        }
        if (u.f5486bF.f4695aE || u.f5486bF.f4664A) {
            if (z) {
                if (u.f5486bF.f4763aH.f4810a != null) {
                    str = str + "Game Mode: " + u.f5486bF.f4763aH.f4810a.mo1211a();
                }
                if (u.f5486bF.f4763aH.f4811b != null) {
                    str = str + "\nMap: " + ActivityC0087g.m4194d(u.f5486bF.f4763aH.f4811b);
                }
            }
            str = (str + "\nStarting Credits: " + u.f5486bF.m1252h()) + "\nFog: " + u.f5486bF.m1271e();
            if (u.f5486bF.f4763aH.f4816g != 1) {
                str = str + "\nStarting Units: " + u.f5486bF.m1264f();
            }
            if (u.f5486bF.f4763aH.f4817h != 1.0f) {
                str = str + "\n" + C0654f.m1558a(u.f5486bF.f4763aH.f4817h, 1) + "X income";
            }
            if (u.f5486bF.f4763aH.f4818i) {
                str = str + "\nNo nukes";
            }
            if (u.f5486bF.f4763aH.f4809k) {
                str = str + "\nShared control: On";
            }
            if (this.f4664A) {
                if (u.f5486bF.f4654m != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!u.f5486bF.f4657p && !u.f5486bF.f4735D) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (u.f5486bF.f4655n && !u.f5486bF.f4735D) {
                    ArrayList h = u.f5488bH.m1434h();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0657b bVar = (C0657b) it.next();
                        if (i > 2 && i < h.size() - 1) {
                            str = str + "" + (h.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String b = bVar.m1425b();
                        b.replace("\"", "'");
                        b.replace(";", ".");
                        str = str + " mod: \"" + b + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: al */
    public String m1312al() {
        if (!this.f4655n) {
            return null;
        }
        ArrayList h = AbstractC0789l.m651u().f5488bH.m1434h();
        String str = "";
        int i = 0;
        Iterator it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0657b bVar = (C0657b) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < h.size() - 1) {
                str = str + "" + (h.size() - i) + " more...";
                break;
            }
            i++;
            String b = bVar.m1425b();
            b.replace(";", ".");
            str = str + b;
        }
        return str;
    }

    /* renamed from: am */
    public String m1311am() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4763aH.f4811b == null || u.f5486bF.f4763aH.f4810a == null) {
            return null;
        }
        if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4824a) {
            return "maps/skirmish/" + u.f5486bF.f4763aH.f4811b;
        }
        if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4825b) {
            return "/SD/rusted_warfare_maps/" + u.f5486bF.f4763aH.f4811b;
        }
        AbstractC0789l.m683d("getNetworkMapPath: unhandled type:" + u.f5486bF.f4763aH.f4810a);
        return null;
    }

    /* renamed from: an */
    public boolean m1310an() {
        return this.f4664A || this.f4668F;
    }

    /* renamed from: a */
    public void m1334a(String str, C0698c cVar) {
        AbstractC0789l.m683d("sendCommandError: " + str);
        if (cVar == null) {
            m1344a((C0698c) null, -1, (String) null, str);
        } else {
            m1342a(null, null, null, str, cVar);
        }
    }

    /* renamed from: b */
    public boolean m1294b(C0698c cVar, AbstractC0171m mVar, String str, String str2) {
        int i;
        AbstractC0171m n;
        String str3 = null;
        String str4 = "";
        String[] strArr = new String[0];
        String trim = str2.trim();
        boolean z = false;
        if (trim.startsWith("-qc ")) {
            trim = trim.substring("-qc ".length()).trim();
            z = true;
        }
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            str3 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            if (indexOf != -1 && trim2.length() >= indexOf + 1) {
                str4 = trim2.substring(indexOf + 1).trim();
                strArr = str4.split(" ");
            }
        }
        if (str3 == null) {
            return false;
        }
        if (z && !"self_move".equals(str3) && !"self_team".equals(str3)) {
            return false;
        }
        if ("pause".equals(str3) || "unpause".equals(str3)) {
            if (mVar == null) {
                m1334a("[Could not find player]", cVar);
                return true;
            } else if ((!this.f4664A || mVar != this.f4662x) && !this.f4726c.m1393b(cVar)) {
                m1334a("[Only the host can change pause state]", cVar);
                return true;
            } else if (!this.isGameStart_Hcat) {
                m1334a("[Game not yet started]", cVar);
                return true;
            } else {
                boolean z2 = !this.f4688af;
                if ("unpause".equals(str3)) {
                    z2 = false;
                }
                m1265e(z2);
                return true;
            }
        } else if ("teamlock".equals(str3)) {
            if (mVar == null) {
                m1334a("[Could not find player]", cVar);
                return true;
            } else if ((!this.f4664A || mVar != this.f4662x) && !this.f4726c.m1393b(cVar)) {
                m1334a("[Only the host can change teamlock]", cVar);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f4763aH.f4820l = true;
                m1334a("[teams are locked]", cVar);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f4763aH.f4820l = false;
                m1334a("[teams are unlocked]", cVar);
                return true;
            } else {
                m1334a("[Expected true or false]", cVar);
                return true;
            }
        } else if ("roomlock".equals(str3)) {
            if (mVar == null) {
                m1334a("[Could not find player]", cVar);
                return true;
            } else if (!this.f4664A || mVar != this.f4662x) {
                m1334a("[Only the host can change roomlock]", cVar);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f4763aH.f4823o = true;
                m1334a("[room is locked]", cVar);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f4763aH.f4823o = false;
                m1334a("[room is unlocked]", cVar);
                return true;
            } else {
                m1334a("[Expected true or false]", cVar);
                return true;
            }
        } else if ("share".equals(str3)) {
            if (mVar == null) {
                m1334a("[Could not find player]", cVar);
                return true;
            } else if (!this.f4763aH.f4809k) {
                m1334a("[Shared control is not enabled in this game]", cVar);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                if (!mVar.f1249y) {
                    mVar.f1249y = true;
                    m1249h("[shared control now on for " + str + "]");
                    return true;
                }
                m1249h("[shared control already on for " + str + "]");
                return true;
            } else if (!"false".equalsIgnoreCase(str4) && !"off".equalsIgnoreCase(str4)) {
                m1334a("[Expected true or false]", cVar);
                return true;
            } else if (mVar.f1249y) {
                mVar.f1249y = false;
                m1249h("[shared control now off for " + str + "]");
                return true;
            } else {
                m1249h("[shared control already off for " + str + "]");
                return true;
            }
        } else if ("self_move".equals(str3)) {
            if (mVar == null) {
                m1334a("[Cannot Move - Player not found]", cVar);
                return true;
            } else if (this.isGameStart_Hcat) {
                m1334a("[Cannot Move '" + mVar.f1238q + "' - Game has been started]", cVar);
                return true;
            } else if (m1242k()) {
                m1334a("[Cannot Move '" + mVar.f1238q + "' - Game is starting]", cVar);
                return true;
            } else if (this.f4763aH.f4820l) {
                m1334a("[Cannot Move '" + mVar.f1238q + "' - Teams locked]", cVar);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                m1334a("[Cannot Move Team - Ally group - Out of range]", cVar);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            m1334a("[Cannot Move '" + mVar.f1238q + "' - ally group '" + strArr[1] + "' is not a number]", cVar);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.f4763aH.f4822n) {
                            m1334a("[Spectators are disabled on this server]", cVar);
                            return true;
                        }
                        synchronized (this.f4781bC) {
                            intValue = AbstractC0171m.m3779D();
                            if (intValue != -1) {
                                m1355a(mVar, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = mVar.f1236o;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > AbstractC0171m.f1275a) {
                            m1334a("[Cannot Move '" + mVar.f1238q + "' - target slotId must between 1-" + AbstractC0171m.f1275a + "]", cVar);
                            return true;
                        }
                        synchronized (this.f4781bC) {
                            if (this.f4662x == mVar || (n = AbstractC0171m.m3688n(intValue - 1)) == null || n.f1239r || n.m3745b()) {
                                m1355a(mVar, intValue - 1);
                            } else {
                                m1334a("[Cannot move '" + mVar.f1238q + "' to slot: " + intValue + " - Player: " + n.f1238q + " is in that slot.]", cVar);
                                return true;
                            }
                        }
                    }
                    mVar.f1236o = i2;
                    if (num != null) {
                        if (num.intValue() == -1) {
                            mVar.f1236o = mVar.f1230i % 2;
                        } else {
                            mVar.f1236o = num.intValue();
                        }
                    }
                    if (this.f4763aH.f4821m) {
                        mVar.f1236o = mVar.f1230i % 2;
                    }
                    if (z3) {
                        mVar.f1236o = -3;
                    }
                    if (!z3) {
                        m1249h("Player '" + mVar.f1238q + "' moved themselves to: " + intValue);
                    } else if (!z4) {
                        m1249h("Player '" + mVar.f1238q + "' is now a spectator");
                    }
                    m1384H();
                    ActivityC0092l.m4175k();
                    return true;
                } catch (NumberFormatException e2) {
                    m1334a("[Cannot Move '" + mVar.f1238q + "' - team '" + strArr[0] + "' is not a number]", cVar);
                    return true;
                }
            } else {
                m1334a("[Cannot Move '" + mVar.f1238q + "' - No target]", cVar);
                return true;
            }
        } else if ("self_team".equals(str3)) {
            if (mVar == null) {
                m1334a("[Cannot Set Team - Player not found]", cVar);
                return true;
            } else if (this.isGameStart_Hcat) {
                m1334a("[" + mVar.f1238q + ": Cannot Set Team - Game has been started]", cVar);
                return true;
            } else if (m1242k()) {
                m1334a("[" + mVar.f1238q + ": Cannot Set Team - Game is starting]", cVar);
                return true;
            } else if (this.f4763aH.f4820l) {
                m1334a("[" + mVar.f1238q + ": Cannot Set Team - Teams locked]", cVar);
                return true;
            } else if (this.f4763aH.f4821m) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str4).intValue();
                    if (intValue2 == -1) {
                        i = mVar.f1230i % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        m1334a("[Cannot Set Team - Out of range]", cVar);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (mVar.f1236o != i) {
                        mVar.f1236o = i;
                        m1334a("Player '" + mVar.f1238q + "' team changed to: " + intValue2, cVar);
                    }
                    m1384H();
                    ActivityC0092l.m4175k();
                    return true;
                } catch (NumberFormatException e3) {
                    m1241k("'" + str4 + "' is not a number");
                    return true;
                }
            }
        } else if (!"surrender".equals(str3)) {
            return false;
        } else {
            if (!this.isGameStart_Hcat) {
                m1334a("[Cannot Surrender - Game has not started]", cVar);
                return true;
            } else if (mVar == null) {
                m1334a("[Could not find player]", cVar);
                return true;
            } else if (!mVar.m3699i()) {
                AbstractC0789l.m683d(str + ": Is voting to surrender");
                mVar.m3697j();
                m1343a(cVar, mVar, str, "-t [Votes to surrender " + (AbstractC0171m.m3743b(mVar.f1236o) + "/" + AbstractC0171m.m3728c(mVar.f1236o)) + "]");
                return true;
            } else {
                AbstractC0789l.m683d(str + ": Is already voting to surrender but updating timestamp");
                mVar.m3697j();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static void m1352a(final C0674ae aeVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF != null) {
            u.f5486bF.f4726c.mo374a(aeVar);
        }
        if (!AbstractC0789l.f5556aF) {
            C0067c.m4217a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.g.ad.7
                @Override // java.lang.Runnable
                public void run() {
                    ActivityC0092l.m4179a(C0674ae.this);
                }
            });
        }
    }

    /* renamed from: ao */
    public ArrayList m1309ao() {
        ArrayList c;
        synchronized (this.f4781bC) {
            c = AbstractC0171m.m3730c();
        }
        return c;
    }

    /* renamed from: e */
    public void m1265e(boolean z) {
        this.f4688af = z;
        if (this.f4688af) {
            m1249h("Game Paused");
        } else {
            m1249h("Game unpaused");
        }
    }

    /* renamed from: h */
    public void m1250h(C0698c cVar) {
        cVar.m1127a(false, false);
    }

    /* renamed from: i */
    public void m1246i(C0698c cVar) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar2 = (C0698c) it.next();
            if (cVar2.f4922j == cVar) {
                m1250h(cVar2);
            }
        }
    }

    /* renamed from: a */
    public C0698c m1345a(C0698c cVar, int i, String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0698c cVar2 = new C0698c(this, new C0704h(cVar, i));
        cVar2.f4951k = i;
        cVar2.f4922j = cVar;
        cVar2.f4924m = str;
        try {
            cVar2.m1121d();
            u.f5486bF.f4766aV.add(cVar2);
            u.f5486bF.m1383I();
            return cVar2;
        } catch (IOException e) {
            e.printStackTrace();
            cVar2.m1129a("crash");
            return null;
        }
    }

    /* renamed from: a */
    public C0698c m1346a(C0698c cVar, int i) {
        Iterator it = this.f4766aV.iterator();
        while (it.hasNext()) {
            C0698c cVar2 = (C0698c) it.next();
            if (cVar2.f4951k == i && cVar2.f4922j == cVar) {
                return cVar2;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static String m1237m(String str) {
        char[] charArray;
        String replace = str.trim().replace("\n", ".").replace("\r", ".").replace("\t", ".").replace("��", ".").replace(" ", "_");
        while (true) {
            if (!(replace.startsWith(".") || replace.startsWith("-") || replace.startsWith(" "))) {
                break;
            }
            replace = replace.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : replace.toCharArray()) {
            if (!Character.isISOControl(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1329a(ArrayList arrayList, final boolean z) {
        if (this.f4722bF != null) {
            AbstractC0789l.m683d("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            AbstractC0789l.m683d("startJoinServerInternalThread: no servers");
        } else {
            this.f4722bF = m1331a((String) arrayList.get(0), false, new Runnable() { // from class: com.corrodinggames.rts.gameFramework.g.ad.8
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC0789l u = AbstractC0789l.m651u();
                    AbstractC0789l.m683d("startJoinServerInternalThread callback");
                    RunnableC0685al alVar = Hcat_Multiplaye.this.f4722bF;
                    Hcat_Multiplaye.this.f4722bF = null;
                    if (alVar == null) {
                        AbstractC0789l.m683d("startJoinServerInternalThread callback gameConnector==null");
                    } else if (alVar.f4841e != null) {
                        AbstractC0789l.m683d("startJoinServerInternalThread failed to connect: " + alVar.f4841e);
                        if (z) {
                            u.f5486bF.m1293b("Reconnect failed: " + alVar.f4841e);
                            Hcat_Multiplaye.this.m1292b("Reconnect failed", "reconnect failed");
                            u.m682d("Reconnect failed", "Reconnect failed: " + alVar.f4841e);
                            u.m670h("Reconnect failed: " + alVar.f4841e);
                        }
                    } else {
                        try {
                            u.f5486bF.m1293b("starting new");
                            u.f5486bF.m1330a(alVar.f4843g);
                        } catch (IOException e) {
                            u.m687c(e.getMessage(), "Connection failed");
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
