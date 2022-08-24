package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0618t;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0450i;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0436c;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p024d.CommandCenter;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/n.class */
public abstract class AbstractC0197n extends AbstractC0726bk implements Comparable {

    /* renamed from: k */
    public int f1305k;

    /* renamed from: l */
    public final String f1306l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";

    /* renamed from: m */
    public boolean f1307m;

    /* renamed from: n */
    public boolean f1308n;

    /* renamed from: o */
    public double f1309o;

    /* renamed from: p */
    public double f1310p;

    /* renamed from: q */
    public int f1311q;

    /* renamed from: r */
    public AbstractC0623y f1312r;

    /* renamed from: s */
    public AbstractC0623y f1313s;

    /* renamed from: t */
    public boolean f1314t;

    /* renamed from: u */
    public String f1315u;

    /* renamed from: v */
    public boolean f1316v;

    /* renamed from: w */
    public int f1317w;

    /* renamed from: x */
    public boolean f1318x;

    /* renamed from: y */
    public Integer f1319y;

    /* renamed from: z */
    public Integer f1320z;

    /* renamed from: A */
    public Integer f1321A;

    /* renamed from: B */
    public Integer f1322B;

    /* renamed from: C */
    public int f1323C;

    /* renamed from: as */
    private boolean f1324as;

    /* renamed from: at */
    private int f1325at;

    /* renamed from: D */
    public boolean f1326D;

    /* renamed from: au */
    private int f1327au;

    /* renamed from: E */
    public boolean f1328E;

    /* renamed from: F */
    public boolean f1329F;

    /* renamed from: G */
    public boolean f1330G;

    /* renamed from: H */
    public boolean f1331H;

    /* renamed from: I */
    public boolean f1332I;

    /* renamed from: J */
    public final Object f1333J;

    /* renamed from: K */
    public int f1334K;

    /* renamed from: L */
    public int f1335L;

    /* renamed from: M */
    public byte[][] f1336M;

    /* renamed from: N */
    public String f1337N;

    /* renamed from: O */
    public String f1338O;

    /* renamed from: P */
    public int f1339P;

    /* renamed from: Q */
    public int f1340Q;

    /* renamed from: R */
    public boolean f1341R;

    /* renamed from: S */
    public C0202s f1342S;

    /* renamed from: T */
    public boolean f1343T;

    /* renamed from: U */
    public byte f1344U;

    /* renamed from: V */
    public int f1345V;

    /* renamed from: W */
    public long f1346W;

    /* renamed from: X */
    public long f1347X;

    /* renamed from: Y */
    public int f1348Y;

    /* renamed from: Z */
    public boolean f1349Z;

    /* renamed from: aa */
    public boolean f1350aa;

    /* renamed from: ab */
    public int f1351ab;

    /* renamed from: ac */
    int f1352ac;

    /* renamed from: ad */
    public Paint f1353ad;

    /* renamed from: ae */
    public Paint f1354ae;

    /* renamed from: ah */
    int f1355ah;

    /* renamed from: aj */
    C0449h f1356aj;

    /* renamed from: ak */
    C0439f f1357ak;

    /* renamed from: al */
    public C0436c f1358al;

    /* renamed from: am */
    public float f1359am;

    /* renamed from: ap */
    long f1360ap;

    /* renamed from: aq */
    double f1361aq;

    /* renamed from: a */
    static C1101m f1362a = new C1101m();

    /* renamed from: b */
    static AbstractC0197n[] f1363b = new AbstractC0197n[0];

    /* renamed from: c */
    public static int f1364c = 10;

    /* renamed from: d */
    public static int f1365d = 0;

    /* renamed from: e */
    public static int f1366e = 100;

    /* renamed from: f */
    public static int f1367f = f1364c + f1365d;

    /* renamed from: g */
    public static final AbstractC0197n f1368g = new C0187e(-1, false, "<blank>");

    /* renamed from: h */
    public static final AbstractC0197n f1369h = new C0186d(-2);

    /* renamed from: i */
    public static final AbstractC0197n f1370i = new C0186d(-1);

    /* renamed from: ar */
    private static AbstractC0197n[] f1371ar = new AbstractC0197n[f1367f];

    /* renamed from: j */
    public static AbstractC0197n f1372j = new C0204u(-99);

    /* renamed from: af */
    static int[] f1373af = new int[10];

    /* renamed from: ag */
    static String[] f1374ag = new String[10];

    /* renamed from: ai */
    static int f1375ai = -99;

    /* renamed from: an */
    public static float f1376an = 40.0f;

    /* renamed from: ao */
    public static float f1377ao = 10.0f;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo4315a(AbstractC0197n abstractC0197n) {
        int i = this.f1351ab - abstractC0197n.f1351ab;
        if (i != 0) {
            return i;
        }
        int i2 = this.f1305k - abstractC0197n.f1305k;
        if (i2 != 0) {
            return i2;
        }
        if (this.f1315u != null && abstractC0197n.f1315u != null) {
            return this.f1315u.compareTo(abstractC0197n.f1315u);
        }
        return 0;
    }

    /* renamed from: b */
    public void m5902b(C0859ar c0859ar) {
        c0859ar.m1554c(this.f1305k);
        c0859ar.mo1487a((int) this.f1309o);
        c0859ar.mo1487a(this.f1311q);
        c0859ar.m1557b(this.f1315u);
        c0859ar.mo1482a(this.f1343T);
        if (c0859ar.m1547g() > 26) {
            c0859ar.mo1487a(m5841y());
            c0859ar.m1551d("lastPingTimeReceivedAt");
            c0859ar.m1577a(this.f1346W);
        }
        if (c0859ar.m1547g() >= 55) {
            c0859ar.mo1482a(this.f1316v);
            c0859ar.mo1487a(this.f1317w);
        }
        if (c0859ar.m1547g() >= 91) {
            c0859ar.mo1487a(this.f1351ab);
            c0859ar.m1554c(0);
        }
        if (c0859ar.m1547g() >= 97) {
            c0859ar.mo1482a(this.f1331H);
            c0859ar.mo1482a(this.f1332I);
        }
        if (c0859ar.m1547g() >= 125) {
            c0859ar.mo1482a(this.f1326D);
            c0859ar.mo1482a(this.f1324as);
            c0859ar.mo1487a(this.f1325at);
        }
        if (c0859ar.m1547g() >= 149) {
            c0859ar.m1557b(this.f1338O);
            c0859ar.mo1487a(this.f1339P);
        }
        if (c0859ar.m1547g() >= 156) {
            c0859ar.m1563a(this.f1319y);
            c0859ar.m1563a(this.f1320z);
            c0859ar.m1563a(this.f1321A);
            c0859ar.m1563a(this.f1322B);
            c0859ar.mo1487a(this.f1323C);
        }
    }

    /* renamed from: c */
    public void m5887c(C0859ar c0859ar) {
        c0859ar.m1554c(0);
        c0859ar.mo1487a(m5841y());
        c0859ar.mo1482a(this.f1331H);
        c0859ar.mo1482a(this.f1332I);
    }

    /* renamed from: a */
    public void m5922a(C0876k c0876k) {
        c0876k.m1457d();
        this.f1345V = c0876k.m1454f();
        this.f1346W = System.currentTimeMillis();
        this.f1331H = c0876k.m1455e();
        this.f1332I = c0876k.m1455e();
    }

    /* renamed from: b */
    public void m5901b(C0876k c0876k) {
        m5921a(c0876k, false);
    }

    /* renamed from: a */
    public void m5921a(C0876k c0876k, boolean z) {
        if (!z) {
            m5867f((int) c0876k.m1457d());
            this.f1309o = c0876k.m1454f();
            this.f1310p = 0.0d;
            this.f1311q = c0876k.m1454f();
            this.f1315u = c0876k.m1450j();
            this.f1343T = c0876k.m1455e();
        } else {
            c0876k.m1457d();
            c0876k.m1454f();
            c0876k.m1454f();
            c0876k.m1450j();
            c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 14) {
            this.f1345V = c0876k.m1454f();
            c0876k.m1451i();
            this.f1346W = System.currentTimeMillis();
        }
        if (c0876k.m1463b() >= 34 && c0876k.m1459c() >= 55) {
            boolean m1455e = c0876k.m1455e();
            int m1454f = c0876k.m1454f();
            if (!z) {
                this.f1316v = m1455e;
                this.f1317w = m1454f;
            }
        } else if (GameEngine.m1234A().networkEngine.f5564B) {
            C0831ad.m1648g("AI was skipping in networked game, steam version:" + c0876k.m1459c());
        }
        if (c0876k.m1463b() >= 50 && c0876k.m1459c() >= 91) {
            this.f1351ab = c0876k.m1454f();
            c0876k.m1457d();
        }
        if (c0876k.m1463b() >= 52 && c0876k.m1459c() >= 97) {
            this.f1331H = c0876k.m1455e();
            this.f1332I = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 70 && c0876k.m1459c() >= 125) {
            boolean m1455e2 = c0876k.m1455e();
            boolean m1455e3 = c0876k.m1455e();
            int m1454f2 = c0876k.m1454f();
            if (!z) {
                this.f1326D = m1455e2;
                this.f1324as = m1455e3;
                this.f1325at = m1454f2;
            }
        }
        if (c0876k.m1463b() >= 90 && c0876k.m1459c() >= 149) {
            String m1450j = c0876k.m1450j();
            int m1454f3 = c0876k.m1454f();
            if (!z) {
                this.f1338O = m1450j;
                this.f1339P = m1454f3;
            }
        }
        if (c0876k.m1463b() >= 93 && c0876k.m1459c() >= 156) {
            Integer m1449k = c0876k.m1449k();
            Integer m1449k2 = c0876k.m1449k();
            Integer m1449k3 = c0876k.m1449k();
            Integer m1449k4 = c0876k.m1449k();
            int m1454f4 = c0876k.m1454f();
            if (!z) {
                if (this.f1319y != m1449k) {
                    m5885c("readIn aiDifficultyOverride was:" + this.f1319y + " now:  " + m1449k);
                }
                this.f1319y = m1449k;
                this.f1320z = m1449k2;
                this.f1321A = m1449k3;
                this.f1322B = m1449k4;
                this.f1323C = m1454f4;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.m1551d("Writing team: " + this.f1315u);
        m5902b(c0859ar);
        if (c0859ar.m1547g() >= 44) {
            c0859ar.m1554c(4);
            c0859ar.mo1482a(this.f1329F);
            c0859ar.mo1482a(this.f1328E);
            c0859ar.mo1482a(true);
            if (1 != 0) {
                m5878d(c0859ar);
            }
            this.f1357ak.m4735a(c0859ar);
            C0448g.m4682a(this.f1356aj, c0859ar);
            c0859ar.mo1482a(this.f1318x);
        }
    }

    /* renamed from: c */
    public void mo5886c(C0876k c0876k) {
        m5901b(c0876k);
        if (c0876k.m1463b() >= 26) {
            byte m1457d = c0876k.m1457d();
            this.f1329F = c0876k.m1455e();
            if (m1457d >= 1) {
                this.f1328E = c0876k.m1455e();
            }
            if (c0876k.m1455e()) {
                m5877d(c0876k);
            }
            if (m1457d >= 2) {
                this.f1357ak.m4734a(c0876k);
            }
            if (m1457d >= 3) {
                m5924a(C0448g.m4681a(c0876k));
            }
            if (m1457d >= 4) {
                this.f1318x = c0876k.m1455e();
            }
        }
    }

    /* renamed from: d */
    public void m5878d(C0859ar c0859ar) {
        GameEngine.m1234A();
        c0859ar.m1551d("-- Saving fog --");
        c0859ar.mo1482a(this.f1336M != null);
        if (this.f1336M != null) {
            c0859ar.mo1487a(this.f1334K);
            c0859ar.mo1487a(this.f1335L);
            for (int i = 0; i < this.f1334K; i++) {
                for (int i2 = 0; i2 < this.f1335L; i2++) {
                    c0859ar.m1554c(this.f1336M[i][i2]);
                }
            }
        }
        c0859ar.m1551d("--End fog--");
    }

    /* renamed from: d */
    public void m5877d(C0876k c0876k) {
        GameEngine m1234A = GameEngine.m1234A();
        if (c0876k.m1455e()) {
            this.f1334K = c0876k.m1454f();
            this.f1335L = c0876k.m1454f();
            int i = this.f1334K;
            int i2 = this.f1335L;
            if (m1234A.f6104bL != null) {
                i = m1234A.f6104bL.f791C;
                i2 = m1234A.f6104bL.f792D;
                if (this.f1334K != i || this.f1335L != i2) {
                    GameEngine.m1145b("Map size does not match fog size: " + this.f1334K + "!=" + i + "|" + this.f1335L + "!=" + i2);
                }
            }
            if (1 != 0) {
                this.f1336M = new byte[i][i2];
            } else {
                this.f1336M = null;
            }
            for (int i3 = 0; i3 < this.f1334K; i3++) {
                for (int i4 = 0; i4 < this.f1335L; i4++) {
                    if (1 != 0) {
                        this.f1336M[i3][i4] = c0876k.m1457d();
                    } else {
                        c0876k.m1457d();
                    }
                }
            }
            return;
        }
        this.f1336M = null;
    }

    /* renamed from: a */
    public void m5933a() {
        if (this.f1336M != null) {
            for (int i = 0; i < this.f1334K; i++) {
                for (int i2 = 0; i2 < this.f1335L; i2++) {
                    this.f1336M[i][i2] = 0;
                }
            }
        }
        GameEngine m1234A = GameEngine.m1234A();
        if (m1234A.f6093bs == this) {
            m1234A.f6115bW.f5320O = true;
            if (m1234A.f6104bL != null) {
                m1234A.f6104bL.m6117k();
                m1234A.f6104bL.m6122g();
            }
        }
    }

    /* renamed from: b */
    public boolean m5912b() {
        return this.f1311q == -3;
    }

    /* renamed from: a */
    public static ArrayList m5914a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1367f; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && (z || abstractC0197n.m5912b())) {
                arrayList.add(abstractC0197n);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m5896c() {
        return m5897b(false);
    }

    /* renamed from: b */
    public static ArrayList m5897b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1367f; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && (z || !abstractC0197n.m5912b())) {
                arrayList.add(abstractC0197n);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static AbstractC0197n[] m5883d() {
        return f1363b;
    }

    /* renamed from: e */
    public static void m5874e() {
        C1101m c1101m = f1362a;
        c1101m.clear();
        c1101m.add(f1370i);
        c1101m.add(f1369h);
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                c1101m.add(abstractC0197n);
            }
        }
        if (f1363b.length != c1101m.f6888a) {
            f1363b = new AbstractC0197n[c1101m.f6888a];
        }
        int i2 = c1101m.f6888a;
        Object[] m559a = c1101m.m559a();
        for (int i3 = 0; i3 < i2; i3++) {
            f1363b[i3] = (AbstractC0197n) m559a[i3];
        }
    }

    /* renamed from: f */
    public static ArrayList m5869f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && !abstractC0197n.m5912b()) {
                arrayList.add(Integer.valueOf(abstractC0197n.f1311q));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m5930a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            AbstractC0197n abstractC0197n = f1371ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1311q == i && !abstractC0197n.m5912b() && (!z || !abstractC0197n.f1316v)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public static int m5866g() {
        int i = 0;
        for (int i2 = 0; i2 < f1364c; i2++) {
            AbstractC0197n abstractC0197n = f1371ar[i2];
            if (abstractC0197n != null && !abstractC0197n.m5912b() && !abstractC0197n.f1328E && !abstractC0197n.f1329F) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m5909b(int i, boolean z) {
        if (i < 10 || i == f1364c) {
            return;
        }
        if (i > f1366e) {
            throw new IOException("setMaxTeamId: " + i + " is over limit of:" + f1366e);
        }
        if (!z && i <= f1364c) {
            return;
        }
        int i2 = i + f1365d;
        AbstractC0197n[] abstractC0197nArr = new AbstractC0197n[i2];
        for (int i3 = 0; i3 < f1371ar.length; i3++) {
            AbstractC0197n abstractC0197n = f1371ar[i3];
            if (i3 < abstractC0197nArr.length) {
                abstractC0197nArr[i3] = abstractC0197n;
            }
        }
        f1371ar = abstractC0197nArr;
        f1364c = i;
        f1367f = i2;
    }

    /* renamed from: a */
    public static String m5931a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : VariableScope.nullOrMissingString + i;
    }

    /* renamed from: h */
    public String m5863h() {
        return m5931a(this.f1311q);
    }

    /* renamed from: i */
    public void m5860i() {
        this.f1326D = false;
        this.f1324as = false;
        this.f1325at = -9999;
    }

    /* renamed from: j */
    public boolean m5858j() {
        return this.f1326D;
    }

    /* renamed from: k */
    public boolean m5856k() {
        return this.f1325at >= 0;
    }

    /* renamed from: l */
    public void m5854l() {
        this.f1325at = GameEngine.m1234A().f6096by;
    }

    /* renamed from: m */
    public boolean m5853m() {
        GameEngine m1234A = GameEngine.m1234A();
        if (((this.f1328E || this.f1329F) && !m1234A.networkEngine.f5597aO.f5646l) || this.f1316v || m5840z() || this.f1350aa) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m5910b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            AbstractC0197n abstractC0197n = f1371ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1311q == i && abstractC0197n.m5856k() && abstractC0197n.m5853m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m5894c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            AbstractC0197n abstractC0197n = f1371ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1311q == i && abstractC0197n.m5853m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: n */
    public static void m5852n() {
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.m5936V();
            }
        }
        m5937U();
    }

    /* renamed from: o */
    public static void m5851o() {
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.f1325at = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m5881d(int i) {
        GameEngine m1234A = GameEngine.m1234A();
        if (!m1234A.networkEngine.f5485C || m1234A.f6120cb.m2635h()) {
            return;
        }
        for (int i2 = 0; i2 < f1364c; i2++) {
            AbstractC0197n abstractC0197n = f1371ar[i2];
            if (abstractC0197n != null && abstractC0197n.f1311q == i && !abstractC0197n.f1324as) {
                abstractC0197n.f1324as = true;
                C0749e m2592b = m1234A.f6124cf.m2592b();
                m2592b.f4836i = abstractC0197n;
                m2592b.f4844r = true;
                m2592b.f4847u = 100;
                m1234A.networkEngine.m1763a(m2592b);
            }
        }
    }

    /* renamed from: e */
    public static void m5872e(int i) {
        AbstractC0197n[] abstractC0197nArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < f1364c; i3++) {
            AbstractC0197n abstractC0197n = f1371ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1311q == i && abstractC0197n.m5856k() && abstractC0197n.m5853m() && abstractC0197n.f1325at > i2) {
                i2 = abstractC0197n.f1325at;
            }
        }
        if (i2 >= 0 && C1117y.m500a(i2, 120000)) {
            for (AbstractC0197n abstractC0197n2 : f1371ar) {
                if (abstractC0197n2 != null && abstractC0197n2.f1311q == i) {
                    abstractC0197n2.f1325at = -9999;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m5908b(AbstractC0197n abstractC0197n) {
        if (m5850p() && abstractC0197n != null && m5880d(abstractC0197n)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m5850p() {
        if (this.f1331H || this.f1332I) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m5849q() {
        if (GameEngine.m1234A().f6093bs == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m5884c(boolean z) {
        if (z) {
            this.f1339P = 1;
        } else {
            this.f1339P = 0;
        }
    }

    /* renamed from: r */
    public boolean m5848r() {
        return this.f1339P == 1;
    }

    /* renamed from: a */
    public final int m5913a(boolean z, boolean z2) {
        C0202s c0202s = this.f1342S;
        int i = c0202s.f1400c;
        if (z) {
            i += c0202s.f1403f;
        }
        if (z2) {
            i += c0202s.f1402e;
        }
        return i;
    }

    /* renamed from: s */
    public final int m5847s() {
        return this.f1342S.f1400c + this.f1342S.f1403f + this.f1342S.f1402e;
    }

    /* renamed from: a */
    public final int m5925a(C0448g c0448g, boolean z, boolean z2) {
        C0202s c0202s = this.f1342S;
        if (c0202s.f1401d == 0) {
            return 0;
        }
        C0199p c0199p = null;
        C0203t c0203t = c0202s.f1412n;
        C0199p[] c0199pArr = c0203t.f1415b;
        int i = 0;
        int i2 = c0203t.f1416c;
        while (true) {
            if (i >= i2) {
                break;
            }
            C0199p c0199p2 = c0199pArr[i];
            if (c0199p2.f1384a != c0448g) {
                i++;
            } else {
                c0199p = c0199p2;
                break;
            }
        }
        if (c0199p == null) {
            c0199p = c0202s.m5838a(c0448g);
            if (c0199p.f1388e > 50) {
                c0203t.m5832a(c0199p);
            }
            c0199p.f1388e = (short) (c0199p.f1388e + 1);
        }
        int i3 = c0199p.f1385b;
        if (z) {
            i3 += c0199p.f1386c;
        }
        if (z2) {
            i3 += c0199p.f1387d;
        }
        return i3;
    }

    /* renamed from: t */
    public boolean m5846t() {
        boolean z = false;
        C0202s m5870e = m5870e(false);
        if (this.f1342S.f1399b != m5870e.f1399b) {
            GameEngine.m1145b("unitCountExcludingBuildingsIncludingQueued: " + this.f1342S.f1399b + "!=" + m5870e.f1399b + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1406a != m5870e.f1406a) {
            GameEngine.m1145b("unitsMax: " + this.f1342S.f1406a + "!=" + m5870e.f1406a + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1404g != m5870e.f1404g) {
            GameEngine.m1145b("incomeRate: " + this.f1342S.f1404g + "!=" + m5870e.f1404g + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1403f != m5870e.f1403f) {
            GameEngine.m1145b("incompleteUnitCountOfAllTypes: " + this.f1342S.f1403f + "!=" + m5870e.f1403f + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1402e != m5870e.f1402e) {
            GameEngine.m1145b("queuedCountOfAllTypes: " + this.f1342S.f1402e + "!=" + m5870e.f1402e + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1400c != m5870e.f1400c) {
            GameEngine.m1145b("unitCountOfAllTypesOnlyCompleted: " + this.f1342S.f1400c + "!=" + m5870e.f1400c + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1407h.m4711e(m5870e.f1407h)) {
            GameEngine.m1145b("customIncomeRate: " + this.f1342S.f1407h + "!=" + m5870e.f1407h + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1407h.m4733a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m5870e.f1407h.m4733a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1411l.m4711e(m5870e.f1411l)) {
            GameEngine.m1145b("streamingRateNegative (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1411l.m4733a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m5870e.f1411l.m4733a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1410k.m4711e(m5870e.f1410k)) {
            GameEngine.m1145b("streamingRatePositive (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1410k.m4733a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m5870e.f1410k.m4733a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: e */
    private C0202s m5870e(boolean z) {
        GameEngine m1234A = GameEngine.m1234A();
        C0202s c0202s = new C0202s();
        c0202s.f1406a = m1234A.f6099bB;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.f1608bV == this) {
                c0202s.m5839a(unit);
                if (z) {
                    unit.f1609bW = true;
                }
            }
        }
        if (c0202s.f1406a > m1234A.f6100bC) {
            c0202s.f1406a = m1234A.f6100bC;
        }
        return c0202s;
    }

    /* renamed from: d */
    public void m5875d(boolean z) {
        if (!z && !this.f1341R) {
            return;
        }
        this.f1342S = m5870e(true);
        this.f1341R = false;
        if (this.f1340Q < this.f1342S.f1399b) {
            this.f1340Q = this.f1342S.f1399b;
        }
        if (!this.f1308n && this.f1342S.f1405m) {
            this.f1308n = true;
        }
        if (!this.f1307m && m5847s() > 0) {
            this.f1307m = true;
        }
        mo5941Q();
    }

    /* renamed from: a */
    public int m5926a(C0428a c0428a) {
        return 0 - ((int) this.f1342S.f1411l.m4745a(c0428a));
    }

    /* renamed from: b */
    public int m5906b(C0428a c0428a) {
        int m4745a;
        if (c0428a == C0428a.f2761B) {
            m4745a = this.f1342S.f1404g;
        } else {
            m4745a = (int) this.f1342S.f1407h.m4745a(c0428a);
        }
        int m4745a2 = m4745a + ((int) this.f1342S.f1410k.m4745a(c0428a));
        GameEngine.m1234A();
        boolean z = false;
        if (c0428a == C0428a.f2761B) {
            z = true;
        }
        if (z) {
            m4745a2 = (int) (m4745a2 * m5956B());
        }
        return m4745a2;
    }

    /* renamed from: u */
    public int m5845u() {
        return this.f1342S.f1399b;
    }

    /* renamed from: v */
    public int m5844v() {
        return this.f1342S.f1406a;
    }

    /* renamed from: w */
    public String m5843w() {
        int m5841y = m5841y();
        if (m5841y == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1316v) {
            return VariableScope.nullOrMissingString;
        }
        if (m5841y == -2 || m5841y == -1) {
            return "(disconnected)";
        }
        return "(" + m5841y + ")";
    }

    /* renamed from: x */
    public String m5842x() {
        int m5841y = m5841y();
        if (m5841y == -99) {
            return "HOST";
        }
        if (this.f1316v) {
            return "-";
        }
        if (m5841y == -1) {
            return "N/A";
        }
        if (m5841y == -2) {
            return "-";
        }
        if (m5848r()) {
            return m5841y + " (HOST)";
        }
        return VariableScope.nullOrMissingString + m5841y;
    }

    /* renamed from: y */
    public int m5841y() {
        if (this.f1346W == -1) {
            return -2;
        }
        if (this.f1346W < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1345V;
    }

    /* renamed from: z */
    public boolean m5840z() {
        if (this.f1346W != -1 && this.f1346W < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo5831a(float f) {
        this.f1359am += f;
        if (this.f1359am > 90.0f) {
            this.f1359am = 0.0f;
            this.f1358al.m4759a();
        }
    }

    /* renamed from: A */
    public final int m5957A() {
        if (this.f1318x) {
            return this.f1317w;
        }
        GameEngine m1234A = GameEngine.m1234A();
        if ((m1234A.networkEngine.f5564B || m1234A.f6120cb.m2636g()) && !m1234A.networkEngine.f5565F) {
            if (this.f1319y != null && this.f1319y.intValue() != this.f1317w) {
                m5885c("aiDifficultyOverride:  " + this.f1319y + "!=" + this.f1317w);
            }
            return this.f1317w;
        } else if (this.f1319y != null) {
            return this.f1319y.intValue();
        } else {
            return GameEngine.m1234A().f6109bQ.aiDifficulty;
        }
    }

    /* renamed from: B */
    public final float m5956B() {
        GameEngine m1234A = GameEngine.m1234A();
        if (m1234A.m1221N()) {
            return m1234A.networkEngine.f5597aO.f5655h;
        }
        return 1.0f;
    }

    /* renamed from: C */
    public final float m5955C() {
        float f;
        if (!this.f1316v) {
            return 1.0f;
        }
        int m5957A = m5957A();
        if (m5957A > 0) {
            f = 1.0f + (m5957A * 0.4f);
        } else {
            f = 1.0f + (m5957A * 0.3f);
        }
        if (m5957A == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m5911b(float f) {
        if (!this.f1316v) {
            m5895c(f);
        } else {
            m5895c(m5955C() * f);
        }
    }

    /* renamed from: c */
    public final void m5895c(float f) {
        m5882d(f * m5956B());
    }

    /* renamed from: d */
    public final void m5882d(float f) {
        this.f1309o += f;
        if (this.f1309o > 9.99999999E8d) {
            this.f1309o = 9.99999999E8d;
        }
    }

    /* renamed from: D */
    public static void m5954D() {
        try {
            m5909b(10, true);
            for (int i = 0; i < f1371ar.length; i++) {
                f1371ar[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0187e m5915a(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.m1145b("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i = 0; i < f1371ar.length; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1337N)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                GameEngine.m1145b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0187e m5898b(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.m1145b("No id");
            return null;
        }
        for (int i = 0; i < f1371ar.length; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1338O)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                GameEngine.m1145b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: E */
    public static int m5953E() {
        for (int i = 0; i < f1364c; i++) {
            if (f1371ar[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public static int m5952F() {
        for (int i = f1364c; i < f1367f; i++) {
            if (f1371ar[i] == null) {
                return i;
            }
        }
        for (int i2 = f1364c - 1; i2 >= 0; i2--) {
            if (f1371ar[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public void m5951G() {
        for (int i = 0; i < f1371ar.length; i++) {
            if (f1371ar[i] == this) {
                f1371ar[i] = null;
            }
        }
    }

    public AbstractC0197n() {
        this.f1305k = -1;
        this.f1306l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.f1309o = 4000.0d;
        this.f1310p = 0.0d;
        this.f1312r = C0618t.m3299a(this);
        this.f1313s = C0618t.m3299a(this);
        this.f1314t = false;
        this.f1323C = -1;
        this.f1325at = -9999;
        this.f1327au = -9999;
        this.f1333J = new Object();
        this.f1341R = true;
        this.f1342S = new C0202s();
        this.f1345V = -1;
        this.f1346W = -1L;
        this.f1347X = -1L;
        this.f1348Y = -1;
        this.f1351ab = 0;
        this.f1353ad = new C0930ag();
        this.f1354ae = new C0930ag();
        this.f1355ah = -2;
        this.f1356aj = C0448g.f2836d;
        this.f1357ak = new C0439f();
        this.f1358al = new C0436c();
        this.f1360ap = -9999L;
        this.f1316v = this instanceof C0136a;
    }

    public AbstractC0197n(int i) {
        this(i, true);
    }

    public AbstractC0197n(int i, boolean z) {
        this();
        m5893c(i, z);
    }

    /* renamed from: f */
    public void m5867f(int i) {
        m5893c(i, true);
    }

    /* renamed from: c */
    public void m5893c(int i, boolean z) {
        if (this.f1305k != i) {
            if (z) {
                m5951G();
            }
            this.f1305k = i;
            this.f1311q = i;
            if (z && i != -3) {
                AbstractC0197n abstractC0197n = f1371ar[i];
                if (abstractC0197n != null) {
                    abstractC0197n.m5885c("Being replaced");
                }
                f1371ar[i] = this;
            }
            int m5950H = m5950H();
            this.f1353ad.m6754b(m5950H);
            this.f1354ae.m6754b(Color.m6794a(Color.m6796a(m5950H), (int) (Color.m6792b(m5950H) * 0.5f), (int) (Color.m6791c(m5950H) * 0.5f), (int) (Color.m6790d(m5950H) * 0.5f)));
        }
    }

    /* renamed from: a */
    public boolean m5932a(double d) {
        if (this.f1309o >= d || d == 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m5864g(int i) {
        if (this.f1309o + this.f1310p >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m5892c(AbstractC0197n abstractC0197n) {
        return (abstractC0197n == f1370i || this == f1370i || this.f1311q == abstractC0197n.f1311q) ? false : true;
    }

    /* renamed from: d */
    public final boolean m5880d(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == f1370i && this == f1370i) {
            return true;
        }
        return (abstractC0197n == f1370i || this == f1370i || this.f1311q != abstractC0197n.f1311q) ? false : true;
    }

    /* renamed from: H */
    public int m5950H() {
        return m5859i(m5943O());
    }

    /* renamed from: I */
    public static void m5949I() {
        GameEngine m1234A = GameEngine.m1234A();
        try {
            m5876d(m1234A.f6109bQ.teamColors);
        } catch (IllegalArgumentException e) {
            GameEngine.m1188a("initColors: Failed to read setting: '" + m1234A.f6109bQ.teamColors + "': " + e.getMessage(), (Throwable) e);
            m5876d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            m5871e(m1234A.f6109bQ.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            GameEngine.m1188a("initColors: Failed to read setting: '" + m1234A.f6109bQ.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            m5871e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void m5876d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i = 0; i < 10; i++) {
            f1373af[i] = Color.m6793a(split[i]);
        }
    }

    /* renamed from: e */
    private static void m5871e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            f1374ag[i] = split[i];
        }
    }

    /* renamed from: J */
    public int m5948J() {
        if (this.f1311q == -3) {
            return m5859i(-3);
        }
        return m5861h(this.f1305k);
    }

    /* renamed from: h */
    public static int m5861h(int i) {
        if (i >= f1364c) {
            return m5859i(-3);
        }
        return m5859i(i % 2);
    }

    /* renamed from: i */
    public static int m5859i(int i) {
        if (i >= 0 && i < 10) {
            return f1373af[i];
        }
        if (i == -3) {
            return Color.m6794a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: K */
    public String m5947K() {
        if (this.f1305k == -1 || this.f1305k == -2) {
            return "GRAY";
        }
        return m5857j(m5943O());
    }

    /* renamed from: j */
    public static String m5857j(int i) {
        if (i >= 0 && i < 10) {
            return f1374ag[i];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static C0934e[] m5920a(C0934e c0934e) {
        return m5918a(c0934e, EnumC0198o.f1378a, false);
    }

    /* renamed from: a */
    public static C0934e[] m5918a(C0934e c0934e, EnumC0198o enumC0198o, boolean z) {
        if (!z || c0934e.mo419A()) {
            return m5900b(c0934e, enumC0198o);
        }
        return m5919a(c0934e, enumC0198o);
    }

    /* renamed from: a */
    public static C0934e[] m5919a(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((GameEngine.f6199aU && !GameEngine.f6201aW) || enumC0198o == EnumC0198o.f1382e) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m1044a = c0934e.m1044a(enumC0198o);
        if (m1044a != null) {
            return m1044a;
        }
        C0727bl c0727bl = GameEngine.m1234A().f6122cd;
        c0727bl.m2608a(EnumC0729bm.init_unitcolour);
        for (int i2 = 0; i2 < c0934eArr.length; i2++) {
            int m5859i = m5859i(i2);
            if (i2 == 0) {
                c0934eArr[i2] = c0934e;
            } else {
                c0934eArr[i2] = new C0937h(c0934e, m5859i, enumC0198o, i2);
            }
        }
        c0727bl.m2603b(EnumC0729bm.init_unitcolour);
        c0934e.m1043a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: b */
    public static C0934e[] m5900b(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((GameEngine.f6199aU && !GameEngine.f6201aW) || enumC0198o == EnumC0198o.f1382e || c0934e.mo419A()) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m1044a = c0934e.m1044a(enumC0198o);
        if (m1044a != null) {
            return m1044a;
        }
        C0727bl c0727bl = GameEngine.m1234A().f6122cd;
        c0727bl.m2608a(EnumC0729bm.init_unitcolour);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m5859i(i2);
            iArr2[i2] = i2;
        }
        for (int i3 = 0; i3 < c0934eArr.length; i3++) {
            if (i3 != 0) {
                c0934eArr[i3] = c0934e.m1036h();
                c0934eArr[i3].m1041a("color(" + i3 + "):" + c0934e.mo413a());
                c0934eArr[i3].mo398j();
            }
        }
        c0934e.mo398j();
        if (enumC0198o == EnumC0198o.f1379b) {
            m5899b(c0934e, c0934eArr, iArr);
        } else if (enumC0198o == EnumC0198o.f1381d) {
            m5916a(c0934e, c0934eArr, iArr, iArr2);
        } else {
            m5917a(c0934e, c0934eArr, iArr);
        }
        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
            if (c0934eArr[i4] != null) {
                c0934eArr[i4].mo393p();
                c0934eArr[i4].m1033s();
            }
        }
        c0934e.mo392r();
        c0934eArr[0] = c0934e;
        c0727bl.m2603b(EnumC0729bm.init_unitcolour);
        c0934e.m1043a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: a */
    public static void m5917a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int m1084b;
        int mo396m = c0934e.mo396m();
        int mo397l = c0934e.mo397l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m6792b(iArr[i]);
            iArr3[i] = Color.m6791c(iArr[i]);
            iArr4[i] = Color.m6790d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo397l; i2++) {
            for (int i3 = 0; i3 < mo396m; i3++) {
                int mo412a = c0934e.mo412a(i3, i2);
                int m1093a = C0924aa.m1093a(mo412a);
                if (m1093a == 0) {
                    if (mo412a != 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo411a(i3, i2, 0);
                            }
                        }
                    }
                } else {
                    int m1083c = C0924aa.m1083c(mo412a);
                    if (m1083c > 0 && (m1084b = C0924aa.m1084b(mo412a)) == C0924aa.m1082d(mo412a)) {
                        if (m1084b == 0) {
                            for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                                if (c0934eArr[i5] != null) {
                                    c0934eArr[i5].mo411a(i3, i2, Color.m6794a(m1093a, (iArr2[i5] * m1083c) >> 8, (iArr3[i5] * m1083c) >> 8, (iArr4[i5] * m1083c) >> 8));
                                }
                            }
                        } else if (m1083c != m1084b) {
                            float f = (m1083c * 0.003921569f) - (m1084b * 0.003921569f);
                            for (int i6 = 0; i6 < c0934eArr.length; i6++) {
                                if (c0934eArr[i6] != null) {
                                    c0934eArr[i6].mo411a(i3, i2, Color.m6794a(m1093a, C0758f.m2310b((int) (m1084b + (iArr2[i6] * f)), 0, 255), C0758f.m2310b((int) (m1084b + (iArr3[i6] * f)), 0, 255), C0758f.m2310b((int) (m1084b + (iArr4[i6] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5916a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr, int[] iArr2) {
        int m6790d;
        int mo396m = c0934e.mo396m();
        int mo397l = c0934e.mo397l();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m6792b(iArr[i]);
            iArr4[i] = Color.m6791c(iArr[i]);
            iArr5[i] = Color.m6790d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo397l; i2++) {
            for (int i3 = 0; i3 < mo396m; i3++) {
                int mo412a = c0934e.mo412a(i3, i2);
                int m6796a = Color.m6796a(mo412a);
                if (m6796a == 0) {
                    if (Color.m6792b(mo412a) > 0 || Color.m6791c(mo412a) > 0 || Color.m6790d(mo412a) > 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo411a(i3, i2, Color.m6794a(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int m6791c = Color.m6791c(mo412a);
                    int m6792b = Color.m6792b(mo412a);
                    float m2289c = C0758f.m2289c(C0758f.m2289c(m6792b, m6791c), Color.m6790d(mo412a));
                    float m2265f = C0758f.m2265f(C0758f.m2265f(C0758f.m2279d(m6792b - m6791c), C0758f.m2279d(m6791c - m6790d)), C0758f.m2279d(m6790d - m6792b));
                    if (m2265f > 15.0f) {
                        for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                            if (c0934eArr[i5] != null) {
                                float f = m2265f / 255.0f;
                                c0934eArr[i5].mo411a(i3, i2, Color.m6794a(m6796a, C0758f.m2310b((int) (m2289c + (iArr3[i5] * f)), 0, 255), C0758f.m2310b((int) (m2289c + (iArr4[i5] * f)), 0, 255), C0758f.m2310b((int) (m2289c + (iArr5[i5] * f)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m5899b(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int mo396m = c0934e.mo396m();
        int mo397l = c0934e.mo397l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m6792b(iArr[i]);
            iArr3[i] = Color.m6791c(iArr[i]);
            iArr4[i] = Color.m6790d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo396m; i2++) {
            for (int i3 = 0; i3 < mo397l; i3++) {
                int mo412a = c0934e.mo412a(i2, i3);
                int m6796a = Color.m6796a(mo412a);
                if (m6796a > 0) {
                    int m6792b = Color.m6792b(mo412a);
                    int m6791c = Color.m6791c(mo412a);
                    int m6790d = Color.m6790d(mo412a);
                    for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                        int i5 = (int) (m6792b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (m6791c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (m6790d + (iArr4[i4] * 0.15f));
                        int m2310b = C0758f.m2310b(i5, 0, 255);
                        int m2310b2 = C0758f.m2310b(i6, 0, 255);
                        int m2310b3 = C0758f.m2310b(i7, 0, 255);
                        if (c0934eArr[i4] != null) {
                            c0934eArr[i4].mo411a(i2, i3, Color.m6794a(m6796a, m2310b, m2310b2, m2310b3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static AbstractC0197n m5855k(int i) {
        if (i == -1) {
            return f1370i;
        }
        if (i == -2) {
            return f1369h;
        }
        if (i >= f1367f) {
            GameEngine.m1120g("team index too high: " + i);
            return null;
        } else if (i < 0) {
            GameEngine.m1120g("team index too low: " + i);
            return null;
        } else {
            return f1371ar[i];
        }
    }

    /* renamed from: e */
    public void m5873e(float f) {
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f1355ah > 0) {
            this.f1355ah--;
            return;
        }
        if (this.f1355ah == -2) {
            this.f1355ah = this.f1305k;
        } else {
            this.f1355ah = 10;
        }
        if (!this.f1329F && !m1234A.f6120cb.m2635h()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = m1234A.networkEngine.f5597aO.f5646l;
            boolean z5 = false;
            Unit[] m523a = Unit.f1589bD.m523a();
            int size = Unit.f1589bD.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m523a[i];
                if (unit.f1608bV == this) {
                    if (!unit.m5370cS()) {
                        z = true;
                        if (!this.f1328E && (unit.mo3870bJ() || unit.m5427ak())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && unit.f1608bV != null && unit.f1608bV.m5880d(this) && !unit.m5370cS()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && m1234A.f6233bx < 100 && m1234A.f6094bv) {
                    z6 = true;
                }
                this.f1329F = true;
                m5933a();
                Iterator it = Unit.f1589bD.iterator();
                while (it.hasNext()) {
                    Unit unit2 = (Unit) it.next();
                    if (unit2.f1608bV == this && !unit2.mo3259u()) {
                        if (z6 && !unit2.f1606bT && unit2.m5370cS()) {
                            InterfaceC0303as mo7032r = unit2.mo7032r();
                            String str = unit2.m5388cA() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((mo7032r instanceof C0453l) && ((C0453l) mo7032r).f2954aN) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            C0831ad.m1743a((String) null, str);
                        }
                        unit2.m5355ci();
                    }
                }
                m1234A.networkEngine.m1639i(this);
            }
            if (!z2 && !this.f1328E && !this.f1329F) {
                this.f1328E = true;
                m1234A.networkEngine.m1645h(this);
            }
        }
    }

    /* renamed from: a */
    public void mo5923a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: b */
    public static void m5903b(AbstractC0623y abstractC0623y) {
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.mo5923a(abstractC0623y);
            }
        }
    }

    /* renamed from: a */
    public static void m5927a(Unit unit) {
        if (unit.f1608bV != null && unit.f1609bW && unit.f1597bK) {
            AbstractC0197n abstractC0197n = unit.f1608bV;
            unit.f1609bW = false;
            abstractC0197n.f1342S.m5836b(unit);
            unit.m5327dh();
        }
    }

    /* renamed from: b */
    public static void m5907b(Unit unit) {
        m5927a(unit);
    }

    /* renamed from: c */
    public static void m5891c(Unit unit) {
        if (unit.f1608bV != null && !unit.f1609bW && unit.f1597bK && !unit.f1606bT) {
            unit.f1609bW = true;
            AbstractC0197n abstractC0197n = unit.f1608bV;
            abstractC0197n.f1342S.m5839a(unit);
            unit.m5328dg();
            if (!abstractC0197n.f1308n && abstractC0197n.f1342S.f1405m) {
                abstractC0197n.f1308n = true;
            }
            if (!abstractC0197n.f1307m) {
                abstractC0197n.f1307m = true;
            }
            abstractC0197n.mo5941Q();
        }
    }

    /* renamed from: L */
    public static void m5946L() {
        f1370i.f1341R = true;
        f1369h.f1341R = true;
        Iterator it = m5896c().iterator();
        while (it.hasNext()) {
            ((AbstractC0197n) it.next()).f1341R = true;
        }
    }

    /* renamed from: M */
    public static void m5945M() {
        if (GameEngine.m1234A().m1223L()) {
            GameEngine.PrintLog("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.f1341R = true;
            }
        }
    }

    /* renamed from: f */
    public static void m5868f(float f) {
        int m5910b;
        GameEngine m1234A = GameEngine.m1234A();
        f1370i.mo5831a(f);
        f1369h.mo5831a(f);
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.mo5831a(f);
                abstractC0197n.m5873e(f);
                if (!abstractC0197n.f1324as && (m5910b = m5910b(abstractC0197n.f1311q)) > 0) {
                    if (m5910b >= m5894c(abstractC0197n.f1311q)) {
                        m5881d(abstractC0197n.f1311q);
                        m5851o();
                    } else {
                        m5872e(abstractC0197n.f1311q);
                    }
                }
                if (abstractC0197n.f1326D) {
                    if (abstractC0197n.f1327au < 0) {
                        abstractC0197n.f1327au = m1234A.f6096by;
                    }
                    if (!abstractC0197n.f1329F) {
                        int i2 = 0;
                        Iterator it = Unit.f1589bD.iterator();
                        while (it.hasNext()) {
                            Unit unit = (Unit) it.next();
                            if (unit.f1608bV == abstractC0197n && !unit.mo3259u()) {
                                boolean z = false;
                                int i3 = 1;
                                if (C1117y.m500a(abstractC0197n.f1327au, 16000)) {
                                    z = true;
                                    i3 = 50;
                                } else if (C1117y.m500a(abstractC0197n.f1327au, 6000)) {
                                    z = C0758f.m2346a(unit, 0, 100) > 90;
                                    i3 = 20;
                                } else if (C1117y.m500a(abstractC0197n.f1327au, 2000)) {
                                    z = C0758f.m2346a(unit, 0, 100) > 98;
                                    i3 = 2;
                                }
                                if (unit instanceof CommandCenter) {
                                    z = true;
                                }
                                if (z) {
                                    unit.f1631cs = -1.0f;
                                    i2++;
                                    if (i2 > i3) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (m1234A.m1220O() && m1234A.f6109bQ.aiDifficulty != f1375ai) {
            m1234A.networkEngine.m1712aq();
            f1375ai = m1234A.f6109bQ.aiDifficulty;
        }
    }

    /* renamed from: g */
    public static void m5865g(float f) {
        m5874e();
        for (AbstractC0197n abstractC0197n : m5883d()) {
            abstractC0197n.m5875d(false);
        }
    }

    /* renamed from: N */
    public static void m5944N() {
        f1370i.m5875d(false);
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && !abstractC0197n.m5912b() && !abstractC0197n.f1329F && !abstractC0197n.f1328E && !abstractC0197n.f1326D) {
                GameEngine.m1234A().networkEngine.m1651g(abstractC0197n);
            }
        }
    }

    /* renamed from: h */
    public static void m5862h(float f) {
        for (int i = 0; i < f1364c; i++) {
            AbstractC0197n abstractC0197n = f1371ar[i];
            if (abstractC0197n != null && (abstractC0197n instanceof C0136a)) {
                ((C0136a) abstractC0197n).m6347i(f);
            }
        }
    }

    /* renamed from: O */
    public int m5943O() {
        if (this.f1323C == -1) {
            return m5942P();
        }
        return this.f1323C;
    }

    /* renamed from: P */
    public int m5942P() {
        AbstractC0197n abstractC0197n;
        if (this.f1305k == -1 || this.f1305k == -2) {
            return 5;
        }
        int i = this.f1305k;
        if (i >= 10) {
            i %= 10;
        }
        if (f1364c > 10 && (abstractC0197n = GameEngine.m1234A().networkEngine.f5483z) != null && abstractC0197n != this && abstractC0197n.m5943O() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public void mo5941Q() {
    }

    /* renamed from: a */
    public void m5924a(C0449h c0449h) {
        this.f1356aj = c0449h;
    }

    /* renamed from: R */
    public C0449h m5940R() {
        return this.f1356aj;
    }

    /* renamed from: b */
    public void m5904b(C0449h c0449h) {
        C0449h m5940R = m5940R();
        if (m5940R == null || m5940R.m4673b() == 0) {
            m5924a(c0449h);
        } else if (C0448g.m4678b(m5940R, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m5940R);
            if (c0450i.m4670a(c0449h)) {
                m5924a(c0450i.m4672a());
            }
        }
    }

    /* renamed from: c */
    public void m5888c(C0449h c0449h) {
        C0449h m5940R = m5940R();
        if (m5940R == null || m5940R.m4673b() == 0 || !C0448g.m4683a(c0449h, m5940R)) {
            return;
        }
        C0450i c0450i = new C0450i(m5940R);
        if (c0450i.m4669b(c0449h)) {
            m5924a(c0450i.m4672a());
        }
    }

    /* renamed from: S */
    public C0439f m5939S() {
        return this.f1357ak;
    }

    /* renamed from: c */
    public double m5890c(C0428a c0428a) {
        return this.f1357ak.m4745a(c0428a);
    }

    /* renamed from: a */
    public boolean m5928a(EnumC0200q enumC0200q, AbstractC0197n abstractC0197n) {
        if (enumC0200q == EnumC0200q.own) {
            return abstractC0197n == this;
        } else if (enumC0200q == EnumC0200q.any) {
            return true;
        } else {
            if (enumC0200q == EnumC0200q.ally) {
                return m5880d(abstractC0197n);
            }
            if (enumC0200q == EnumC0200q.allyNotOwn) {
                return abstractC0197n != this && m5880d(abstractC0197n);
            } else if (enumC0200q == EnumC0200q.enemy) {
                return m5892c(abstractC0197n);
            } else {
                if (enumC0200q == EnumC0200q.neutral) {
                    return abstractC0197n == f1370i;
                } else if (enumC0200q != EnumC0200q.notOwn) {
                    throw new RuntimeException("Unsupported type: " + enumC0200q);
                } else {
                    return abstractC0197n != this;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo5879d(Unit unit) {
    }

    /* renamed from: T */
    public void m5938T() {
        GameEngine.PrintLog("debugUnitCountByType for team:" + this.f1305k);
        C1101m c1101m = new C1101m();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.f1608bV == this && !unit.f1606bT) {
                InterfaceC0303as interfaceC0303as = unit.f1688dx;
                boolean z = false;
                Iterator it = c1101m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0201r c0201r = (C0201r) it.next();
                    if (c0201r.f1397a == interfaceC0303as) {
                        c0201r.f1398b++;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C0201r c0201r2 = new C0201r();
                    c0201r2.f1397a = interfaceC0303as;
                    c0201r2.f1398b = 1;
                    c1101m.add(c0201r2);
                }
            }
        }
        GameEngine.PrintLog("--- Units ---");
        int i2 = 0;
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            C0201r c0201r3 = (C0201r) it2.next();
            if (!c0201r3.f1397a.mo4368k()) {
                GameEngine.PrintLog(c0201r3.f1397a.mo4372i() + " - count:" + c0201r3.f1398b);
                i2 += c0201r3.f1398b;
            }
        }
        GameEngine.PrintLog("total:" + i2);
        GameEngine.PrintLog("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = c1101m.iterator();
        while (it3.hasNext()) {
            C0201r c0201r4 = (C0201r) it3.next();
            if (c0201r4.f1397a.mo4368k()) {
                GameEngine.PrintLog(c0201r4.f1397a.mo4372i() + " - count:" + c0201r4.f1398b);
                i3 += c0201r4.f1398b;
            }
        }
        GameEngine.PrintLog("total:" + i3);
    }

    /* renamed from: c */
    public void m5885c(String str) {
        GameEngine.PrintLog("Team(id: " + this.f1305k + ", name:" + this.f1315u + "):" + str);
    }

    /* renamed from: b */
    public int m5905b(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        if (this == f1370i) {
            return 0;
        }
        AbstractC0197n[] abstractC0197nArr = f1371ar;
        int i2 = f1364c;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0197n abstractC0197n = abstractC0197nArr[i3];
            if (abstractC0197n != null && this != abstractC0197n && this.f1311q != abstractC0197n.f1311q) {
                if (c0448g == null) {
                    i += abstractC0197n.m5913a(z, z2);
                } else {
                    i += abstractC0197n.m5925a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m5889c(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        AbstractC0197n[] abstractC0197nArr = f1371ar;
        int i2 = f1364c;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0197n abstractC0197n = abstractC0197nArr[i3];
            if (abstractC0197n != null && this != abstractC0197n && m5880d(abstractC0197n)) {
                if (c0448g == null) {
                    i += abstractC0197n.m5913a(z, z2);
                } else {
                    i += abstractC0197n.m5925a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: U */
    public static void m5937U() {
        f1370i.m5936V();
        f1369h.m5936V();
    }

    /* renamed from: V */
    public void m5936V() {
        this.f1307m = false;
        this.f1308n = false;
        this.f1309o = 4000.0d;
        this.f1310p = 0.0d;
        this.f1355ah = -2;
        this.f1324as = false;
        this.f1325at = -9999;
        this.f1326D = false;
        this.f1327au = -9999;
        this.f1328E = false;
        this.f1329F = false;
        this.f1330G = false;
        this.f1331H = false;
        this.f1332I = false;
        this.f1358al.m4759a();
        this.f1359am = 0.0f;
        this.f1352ac = 0;
        this.f1340Q = 0;
        this.f1341R = true;
        this.f1342S = new C0202s();
        this.f1356aj = C0448g.f2836d;
        this.f1357ak = new C0439f();
    }

    /* renamed from: W */
    public double m5935W() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C0758f.m2294c((float) (this.f1360ap - currentTimeMillis)) > 166.66666f) {
            this.f1360ap = currentTimeMillis;
            this.f1361aq = this.f1309o;
        }
        return this.f1361aq;
    }

    /* renamed from: X */
    public C0439f m5934X() {
        return m5939S();
    }
}
