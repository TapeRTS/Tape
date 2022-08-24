package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.DummyNonUnitWithTeam;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0450i;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0436c;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
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
public abstract class Team extends AbstractC0726bk implements Comparable {

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
    static Team[] f1363b = new Team[0];

    /* renamed from: c */
    public static int f1364c = 10;

    /* renamed from: d */
    public static int f1365d = 0;

    /* renamed from: e */
    public static int f1366e = 100;

    /* renamed from: f */
    public static int f1367f = f1364c + f1365d;

    /* renamed from: g */
    public static final Team f1368g = new C0187e(-1, false, "<blank>");

    /* renamed from: h */
    public static final Team f1369h = new C0186d(-2);

    /* renamed from: i */
    public static final Team f1370i = new C0186d(-1);

    /* renamed from: ar */
    private static Team[] f1371ar = new Team[f1367f];

    /* renamed from: j */
    public static Team f1372j = new C0204u(-99);

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

    /* renamed from: a */
    public int mo6146a(Team team) {
        int i = this.f1351ab - team.f1351ab;
        if (i != 0) {
            return i;
        }
        int i2 = this.f1305k - team.f1305k;
        if (i2 != 0) {
            return i2;
        }
        if (this.f1315u != null && team.f1315u != null) {
            return this.f1315u.compareTo(team.f1315u);
        }
        return 0;
    }

    /* renamed from: b */
    public void m6364b(C0859ar c0859ar) {
        c0859ar.m1554c(this.f1305k);
        c0859ar.mo1487a((int) this.f1309o);
        c0859ar.mo1487a(this.f1311q);
        c0859ar.m1557b(this.f1315u);
        c0859ar.mo1482a(this.f1343T);
        if (c0859ar.m1547g() > 26) {
            c0859ar.mo1487a(m6303y());
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
    public void m6349c(C0859ar c0859ar) {
        c0859ar.m1554c(0);
        c0859ar.mo1487a(m6303y());
        c0859ar.mo1482a(this.f1331H);
        c0859ar.mo1482a(this.f1332I);
    }

    /* renamed from: a */
    public void m6384a(C0876k c0876k) {
        c0876k.m1457d();
        this.f1345V = c0876k.m1454f();
        this.f1346W = System.currentTimeMillis();
        this.f1331H = c0876k.m1455e();
        this.f1332I = c0876k.m1455e();
    }

    /* renamed from: b */
    public void m6363b(C0876k c0876k) {
        m6383a(c0876k, false);
    }

    /* renamed from: a */
    public void m6383a(C0876k c0876k, boolean z) {
        if (!z) {
            m6329f((int) c0876k.m1457d());
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
        } else if (GameEngine.getInstance().networkEngine.f5564B) {
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
                    m6347c("readIn aiDifficultyOverride was:" + this.f1319y + " now:  " + m1449k);
                }
                this.f1319y = m1449k;
                this.f1320z = m1449k2;
                this.f1321A = m1449k3;
                this.f1322B = m1449k4;
                this.f1323C = m1454f4;
            }
        }
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.m1551d("Writing team: " + this.f1315u);
        m6364b(c0859ar);
        if (c0859ar.m1547g() >= 44) {
            c0859ar.m1554c(4);
            c0859ar.mo1482a(this.f1329F);
            c0859ar.mo1482a(this.f1328E);
            c0859ar.mo1482a(true);
            if (1 != 0) {
                m6340d(c0859ar);
            }
            this.f1357ak.m5113a(c0859ar);
            C0448g.m5060a(this.f1356aj, c0859ar);
            c0859ar.mo1482a(this.f1318x);
        }
    }

    /* renamed from: c */
    public void m6348c(C0876k c0876k) {
        m6363b(c0876k);
        if (c0876k.m1463b() >= 26) {
            byte m1457d = c0876k.m1457d();
            this.f1329F = c0876k.m1455e();
            if (m1457d >= 1) {
                this.f1328E = c0876k.m1455e();
            }
            if (c0876k.m1455e()) {
                m6339d(c0876k);
            }
            if (m1457d >= 2) {
                this.f1357ak.m5112a(c0876k);
            }
            if (m1457d >= 3) {
                m6386a(C0448g.m5059a(c0876k));
            }
            if (m1457d >= 4) {
                this.f1318x = c0876k.m1455e();
            }
        }
    }

    /* renamed from: d */
    public void m6340d(C0859ar c0859ar) {
        GameEngine.getInstance();
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
    public void m6339d(C0876k c0876k) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (c0876k.m1455e()) {
            this.f1334K = c0876k.m1454f();
            this.f1335L = c0876k.m1454f();
            int i = this.f1334K;
            int i2 = this.f1335L;
            if (gameEngine.f6104bL != null) {
                i = gameEngine.f6104bL.f791C;
                i2 = gameEngine.f6104bL.f792D;
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
    public void m6396a() {
        if (this.f1336M != null) {
            for (int i = 0; i < this.f1334K; i++) {
                for (int i2 = 0; i2 < this.f1335L; i2++) {
                    this.f1336M[i][i2] = 0;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6093bs == this) {
            gameEngine.f6115bW.f5320O = true;
            if (gameEngine.f6104bL != null) {
                gameEngine.f6104bL.m6587k();
                gameEngine.f6104bL.m6592g();
            }
        }
    }

    /* renamed from: b */
    public boolean m6374b() {
        return this.f1311q == -3;
    }

    /* renamed from: a */
    public static ArrayList m6376a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1367f; i++) {
            Team team = f1371ar[i];
            if (team != null && (z || team.m6374b())) {
                arrayList.add(team);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m6358c() {
        return m6359b(false);
    }

    /* renamed from: b */
    public static ArrayList m6359b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1367f; i++) {
            Team team = f1371ar[i];
            if (team != null && (z || !team.m6374b())) {
                arrayList.add(team);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Team[] m6345d() {
        return f1363b;
    }

    /* renamed from: e */
    public static void m6336e() {
        C1101m c1101m = f1362a;
        c1101m.clear();
        c1101m.add(f1370i);
        c1101m.add(f1369h);
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                c1101m.add(team);
            }
        }
        if (f1363b.length != c1101m.f6888a) {
            f1363b = new Team[c1101m.f6888a];
        }
        int i2 = c1101m.f6888a;
        Object[] m559a = c1101m.m559a();
        for (int i3 = 0; i3 < i2; i3++) {
            f1363b[i3] = (Team) m559a[i3];
        }
    }

    /* renamed from: f */
    public static ArrayList m6331f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null && !team.m6374b()) {
                arrayList.add(Integer.valueOf(team.f1311q));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m6392a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            Team team = f1371ar[i3];
            if (team != null && team.f1311q == i && !team.m6374b() && (!z || !team.f1316v)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public static int m6328g() {
        int i = 0;
        for (int i2 = 0; i2 < f1364c; i2++) {
            Team team = f1371ar[i2];
            if (team != null && !team.m6374b() && !team.f1328E && !team.f1329F) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m6371b(int i, boolean z) {
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
        Team[] teamArr = new Team[i2];
        for (int i3 = 0; i3 < f1371ar.length; i3++) {
            Team team = f1371ar[i3];
            if (i3 < teamArr.length) {
                teamArr[i3] = team;
            }
        }
        f1371ar = teamArr;
        f1364c = i;
        f1367f = i2;
    }

    /* renamed from: a */
    public static String m6393a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : VariableScope.nullOrMissingString + i;
    }

    /* renamed from: h */
    public String m6325h() {
        return m6393a(this.f1311q);
    }

    /* renamed from: i */
    public void m6322i() {
        this.f1326D = false;
        this.f1324as = false;
        this.f1325at = -9999;
    }

    /* renamed from: j */
    public boolean m6320j() {
        return this.f1326D;
    }

    /* renamed from: k */
    public boolean m6318k() {
        return this.f1325at >= 0;
    }

    /* renamed from: l */
    public void m6316l() {
        this.f1325at = GameEngine.getInstance().f6096by;
    }

    /* renamed from: m */
    public boolean m6315m() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (((this.f1328E || this.f1329F) && !gameEngine.networkEngine.f5597aO.f5646l) || this.f1316v || m6302z() || this.f1350aa) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m6372b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            Team team = f1371ar[i3];
            if (team != null && team.f1311q == i && team.m6318k() && team.m6315m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m6356c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1364c; i3++) {
            Team team = f1371ar[i3];
            if (team != null && team.f1311q == i && team.m6315m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: n */
    public static void m6314n() {
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                team.m6399V();
            }
        }
        m6400U();
    }

    /* renamed from: o */
    public static void m6313o() {
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                team.f1325at = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m6343d(int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.networkEngine.f5485C || gameEngine.f6120cb.m2635h()) {
            return;
        }
        for (int i2 = 0; i2 < f1364c; i2++) {
            Team team = f1371ar[i2];
            if (team != null && team.f1311q == i && !team.f1324as) {
                team.f1324as = true;
                C0749e m2592b = gameEngine.f6124cf.m2592b();
                m2592b.f4836i = team;
                m2592b.f4844r = true;
                m2592b.f4847u = 100;
                gameEngine.networkEngine.m1763a(m2592b);
            }
        }
    }

    /* renamed from: e */
    public static void m6334e(int i) {
        Team[] teamArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < f1364c; i3++) {
            Team team = f1371ar[i3];
            if (team != null && team.f1311q == i && team.m6318k() && team.m6315m() && team.f1325at > i2) {
                i2 = team.f1325at;
            }
        }
        if (i2 >= 0 && C1117y.m500a(i2, 120000)) {
            for (Team team2 : f1371ar) {
                if (team2 != null && team2.f1311q == i) {
                    team2.f1325at = -9999;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m6370b(Team team) {
        if (m6312p() && team != null && m6342d(team)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m6312p() {
        if (this.f1331H || this.f1332I) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m6311q() {
        if (GameEngine.getInstance().f6093bs == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m6346c(boolean z) {
        if (z) {
            this.f1339P = 1;
        } else {
            this.f1339P = 0;
        }
    }

    /* renamed from: r */
    public boolean m6310r() {
        return this.f1339P == 1;
    }

    /* renamed from: a */
    public final int m6375a(boolean z, boolean z2) {
        C0202s c0202s = this.f1342S;
        int i = c0202s.f1401c;
        if (z) {
            i += c0202s.f1404f;
        }
        if (z2) {
            i += c0202s.f1403e;
        }
        return i;
    }

    /* renamed from: s */
    public final int m6309s() {
        return this.f1342S.f1401c + this.f1342S.f1404f + this.f1342S.f1403e;
    }

    /* renamed from: a */
    public final int m6387a(C0448g c0448g, boolean z, boolean z2) {
        C0202s c0202s = this.f1342S;
        if (c0202s.f1402d == 0) {
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
            c0199p = c0202s.m6300a(c0448g);
            if (c0199p.f1388e > 50) {
                c0203t.m6294a(c0199p);
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
    public boolean m6308t() {
        boolean z = false;
        C0202s m6332e = m6332e(false);
        if (this.f1342S.f1400b != m6332e.f1400b) {
            GameEngine.m1145b("unitCountExcludingBuildingsIncludingQueued: " + this.f1342S.f1400b + "!=" + m6332e.f1400b + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1399a != m6332e.f1399a) {
            GameEngine.m1145b("unitsMax: " + this.f1342S.f1399a + "!=" + m6332e.f1399a + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1405g != m6332e.f1405g) {
            GameEngine.m1145b("incomeRate: " + this.f1342S.f1405g + "!=" + m6332e.f1405g + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1404f != m6332e.f1404f) {
            GameEngine.m1145b("incompleteUnitCountOfAllTypes: " + this.f1342S.f1404f + "!=" + m6332e.f1404f + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1403e != m6332e.f1403e) {
            GameEngine.m1145b("queuedCountOfAllTypes: " + this.f1342S.f1403e + "!=" + m6332e.f1403e + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (this.f1342S.f1401c != m6332e.f1401c) {
            GameEngine.m1145b("unitCountOfAllTypesOnlyCompleted: " + this.f1342S.f1401c + "!=" + m6332e.f1401c + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1406h.m5089e(m6332e.f1406h)) {
            GameEngine.m1145b("customIncomeRate: " + this.f1342S.f1406h + "!=" + m6332e.f1406h + " (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1406h.m5111a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m6332e.f1406h.m5111a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1410l.m5089e(m6332e.f1410l)) {
            GameEngine.m1145b("streamingRateNegative (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1410l.m5111a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m6332e.f1410l.m5111a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (!this.f1342S.f1409k.m5089e(m6332e.f1409k)) {
            GameEngine.m1145b("streamingRatePositive (team:" + this.f1305k + " fails: " + this.f1352ac + ")");
            GameEngine.m1145b("currentCaches:" + this.f1342S.f1409k.m5111a(false, true, 30, true, true));
            GameEngine.m1145b("targetUnitCache:" + m6332e.f1409k.m5111a(false, true, 30, true, true));
            this.f1352ac++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: e */
    private C0202s m6332e(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0202s c0202s = new C0202s();
        c0202s.f1399a = gameEngine.f6099bB;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this) {
                c0202s.m6301a(unit);
                if (z) {
                    unit.f1609bW = true;
                }
            }
        }
        if (c0202s.f1399a > gameEngine.f6100bC) {
            c0202s.f1399a = gameEngine.f6100bC;
        }
        return c0202s;
    }

    /* renamed from: d */
    public void m6337d(boolean z) {
        if (!z && !this.f1341R) {
            return;
        }
        this.f1342S = m6332e(true);
        this.f1341R = false;
        if (this.f1340Q < this.f1342S.f1400b) {
            this.f1340Q = this.f1342S.f1400b;
        }
        if (!this.f1308n && this.f1342S.f1411m) {
            this.f1308n = true;
        }
        if (!this.f1307m && m6309s() > 0) {
            this.f1307m = true;
        }
        m6404Q();
    }

    /* renamed from: a */
    public int m6388a(C0428a c0428a) {
        return 0 - ((int) this.f1342S.f1410l.m5123a(c0428a));
    }

    /* renamed from: b */
    public int m6368b(C0428a c0428a) {
        int m5123a;
        if (c0428a == C0428a.f2761B) {
            m5123a = this.f1342S.f1405g;
        } else {
            m5123a = (int) this.f1342S.f1406h.m5123a(c0428a);
        }
        int m5123a2 = m5123a + ((int) this.f1342S.f1409k.m5123a(c0428a));
        GameEngine.getInstance();
        boolean z = false;
        if (c0428a == C0428a.f2761B) {
            z = true;
        }
        if (z) {
            m5123a2 = (int) (m5123a2 * m6419B());
        }
        return m5123a2;
    }

    /* renamed from: u */
    public int m6307u() {
        return this.f1342S.f1400b;
    }

    /* renamed from: v */
    public int m6306v() {
        return this.f1342S.f1399a;
    }

    /* renamed from: w */
    public String m6305w() {
        int m6303y = m6303y();
        if (m6303y == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1316v) {
            return VariableScope.nullOrMissingString;
        }
        if (m6303y == -2 || m6303y == -1) {
            return "(disconnected)";
        }
        return "(" + m6303y + ")";
    }

    /* renamed from: x */
    public String m6304x() {
        int m6303y = m6303y();
        if (m6303y == -99) {
            return "HOST";
        }
        if (this.f1316v) {
            return "-";
        }
        if (m6303y == -1) {
            return "N/A";
        }
        if (m6303y == -2) {
            return "-";
        }
        if (m6310r()) {
            return m6303y + " (HOST)";
        }
        return VariableScope.nullOrMissingString + m6303y;
    }

    /* renamed from: y */
    public int m6303y() {
        if (this.f1346W == -1) {
            return -2;
        }
        if (this.f1346W < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1345V;
    }

    /* renamed from: z */
    public boolean m6302z() {
        if (this.f1346W != -1 && this.f1346W < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m6394a(float f) {
        this.f1359am += f;
        if (this.f1359am > 90.0f) {
            this.f1359am = 0.0f;
            this.f1358al.m5137a();
        }
    }

    /* renamed from: A */
    public final int m6420A() {
        if (this.f1318x) {
            return this.f1317w;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if ((gameEngine.networkEngine.f5564B || gameEngine.f6120cb.m2636g()) && !gameEngine.networkEngine.f5565F) {
            if (this.f1319y != null && this.f1319y.intValue() != this.f1317w) {
                m6347c("aiDifficultyOverride:  " + this.f1319y + "!=" + this.f1317w);
            }
            return this.f1317w;
        } else if (this.f1319y != null) {
            return this.f1319y.intValue();
        } else {
            return GameEngine.getInstance().f6109bQ.aiDifficulty;
        }
    }

    /* renamed from: B */
    public final float m6419B() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.m1221N()) {
            return gameEngine.networkEngine.f5597aO.f5655h;
        }
        return 1.0f;
    }

    /* renamed from: C */
    public final float m6418C() {
        float f;
        if (!this.f1316v) {
            return 1.0f;
        }
        int m6420A = m6420A();
        if (m6420A > 0) {
            f = 1.0f + (m6420A * 0.4f);
        } else {
            f = 1.0f + (m6420A * 0.3f);
        }
        if (m6420A == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m6373b(float f) {
        if (!this.f1316v) {
            m6357c(f);
        } else {
            m6357c(m6418C() * f);
        }
    }

    /* renamed from: c */
    public final void m6357c(float f) {
        m6344d(f * m6419B());
    }

    /* renamed from: d */
    public final void m6344d(float f) {
        this.f1309o += f;
        if (this.f1309o > 9.99999999E8d) {
            this.f1309o = 9.99999999E8d;
        }
    }

    /* renamed from: D */
    public static void m6417D() {
        try {
            m6371b(10, true);
            for (int i = 0; i < f1371ar.length; i++) {
                f1371ar[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0187e m6377a(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.m1145b("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i = 0; i < f1371ar.length; i++) {
            Team team = f1371ar[i];
            if (team != null && str.equals(team.f1337N)) {
                if (team instanceof C0187e) {
                    return (C0187e) team;
                }
                GameEngine.m1145b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0187e m6360b(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.m1145b("No id");
            return null;
        }
        for (int i = 0; i < f1371ar.length; i++) {
            Team team = f1371ar[i];
            if (team != null && str.equals(team.f1338O)) {
                if (team instanceof C0187e) {
                    return (C0187e) team;
                }
                GameEngine.m1145b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: E */
    public static int m6416E() {
        for (int i = 0; i < f1364c; i++) {
            if (f1371ar[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public static int m6415F() {
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
    public void m6414G() {
        for (int i = 0; i < f1371ar.length; i++) {
            if (f1371ar[i] == this) {
                f1371ar[i] = null;
            }
        }
    }

    public Team() {
        this.f1305k = -1;
        this.f1306l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.f1309o = 4000.0d;
        this.f1310p = 0.0d;
        this.f1312r = DummyNonUnitWithTeam.m3305a(this);
        this.f1313s = DummyNonUnitWithTeam.m3305a(this);
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

    public Team(int i) {
        this(i, true);
    }

    public Team(int i, boolean z) {
        this();
        m6355c(i, z);
    }

    /* renamed from: f */
    public void m6329f(int i) {
        m6355c(i, true);
    }

    /* renamed from: c */
    public void m6355c(int i, boolean z) {
        if (this.f1305k != i) {
            if (z) {
                m6414G();
            }
            this.f1305k = i;
            this.f1311q = i;
            if (z && i != -3) {
                Team team = f1371ar[i];
                if (team != null) {
                    team.m6347c("Being replaced");
                }
                f1371ar[i] = this;
            }
            int m6413H = m6413H();
            this.f1353ad.m7242b(m6413H);
            this.f1354ae.m7242b(Color.argb(Color.m7284a(m6413H), (int) (Color.m7280b(m6413H) * 0.5f), (int) (Color.m7279c(m6413H) * 0.5f), (int) (Color.m7278d(m6413H) * 0.5f)));
        }
    }

    /* renamed from: a */
    public boolean m6395a(double d) {
        if (this.f1309o >= d || d == 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m6326g(int i) {
        if (this.f1309o + this.f1310p >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m6354c(Team team) {
        return (team == f1370i || this == f1370i || this.f1311q == team.f1311q) ? false : true;
    }

    /* renamed from: d */
    public final boolean m6342d(Team team) {
        if (team == f1370i && this == f1370i) {
            return true;
        }
        return (team == f1370i || this == f1370i || this.f1311q != team.f1311q) ? false : true;
    }

    /* renamed from: H */
    public int m6413H() {
        return m6321i(getId());
    }

    /* renamed from: I */
    public static void m6412I() {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            m6338d(gameEngine.f6109bQ.teamColors);
        } catch (IllegalArgumentException e) {
            GameEngine.m1188a("initColors: Failed to read setting: '" + gameEngine.f6109bQ.teamColors + "': " + e.getMessage(), (Throwable) e);
            m6338d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            m6333e(gameEngine.f6109bQ.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            GameEngine.m1188a("initColors: Failed to read setting: '" + gameEngine.f6109bQ.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            m6333e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void m6338d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i = 0; i < 10; i++) {
            f1373af[i] = Color.m7281a(split[i]);
        }
    }

    /* renamed from: e */
    private static void m6333e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            f1374ag[i] = split[i];
        }
    }

    /* renamed from: J */
    public int m6411J() {
        if (this.f1311q == -3) {
            return m6321i(-3);
        }
        return m6323h(this.f1305k);
    }

    /* renamed from: h */
    public static int m6323h(int i) {
        if (i >= f1364c) {
            return m6321i(-3);
        }
        return m6321i(i % 2);
    }

    /* renamed from: i */
    public static int m6321i(int i) {
        if (i >= 0 && i < 10) {
            return f1373af[i];
        }
        if (i == -3) {
            return Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: K */
    public String m6410K() {
        if (this.f1305k == -1 || this.f1305k == -2) {
            return "GRAY";
        }
        return m6319j(getId());
    }

    /* renamed from: j */
    public static String m6319j(int i) {
        if (i >= 0 && i < 10) {
            return f1374ag[i];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static BitmapOrTexture[] createBitmapForTeam(BitmapOrTexture bitmapOrTexture) {
        return m6380a(bitmapOrTexture, EnumC0198o.f1378a, false);
    }

    /* renamed from: a */
    public static BitmapOrTexture[] m6380a(BitmapOrTexture bitmapOrTexture, EnumC0198o enumC0198o, boolean z) {
        if (!z || bitmapOrTexture.mo419A()) {
            return m6362b(bitmapOrTexture, enumC0198o);
        }
        return m6381a(bitmapOrTexture, enumC0198o);
    }

    /* renamed from: a */
    public static BitmapOrTexture[] m6381a(BitmapOrTexture bitmapOrTexture, EnumC0198o enumC0198o) {
        BitmapOrTexture[] bitmapOrTextureArr = new BitmapOrTexture[10];
        if ((GameEngine.f6199aU && !GameEngine.f6201aW) || enumC0198o == EnumC0198o.f1382e) {
            for (int i = 0; i < bitmapOrTextureArr.length; i++) {
                bitmapOrTextureArr[i] = bitmapOrTexture;
            }
            return bitmapOrTextureArr;
        }
        BitmapOrTexture[] m1044a = bitmapOrTexture.m1044a(enumC0198o);
        if (m1044a != null) {
            return m1044a;
        }
        C0727bl c0727bl = GameEngine.getInstance().f6122cd;
        c0727bl.m2608a(EnumC0729bm.f4601D);
        for (int i2 = 0; i2 < bitmapOrTextureArr.length; i2++) {
            int m6321i = m6321i(i2);
            if (i2 == 0) {
                bitmapOrTextureArr[i2] = bitmapOrTexture;
            } else {
                bitmapOrTextureArr[i2] = new C0937h(bitmapOrTexture, m6321i, enumC0198o, i2);
            }
        }
        c0727bl.m2603b(EnumC0729bm.f4601D);
        bitmapOrTexture.m1043a(enumC0198o, bitmapOrTextureArr);
        return bitmapOrTextureArr;
    }

    /* renamed from: b */
    public static BitmapOrTexture[] m6362b(BitmapOrTexture bitmapOrTexture, EnumC0198o enumC0198o) {
        BitmapOrTexture[] bitmapOrTextureArr = new BitmapOrTexture[10];
        if ((GameEngine.f6199aU && !GameEngine.f6201aW) || enumC0198o == EnumC0198o.f1382e || bitmapOrTexture.mo419A()) {
            for (int i = 0; i < bitmapOrTextureArr.length; i++) {
                bitmapOrTextureArr[i] = bitmapOrTexture;
            }
            return bitmapOrTextureArr;
        }
        BitmapOrTexture[] m1044a = bitmapOrTexture.m1044a(enumC0198o);
        if (m1044a != null) {
            return m1044a;
        }
        C0727bl c0727bl = GameEngine.getInstance().f6122cd;
        c0727bl.m2608a(EnumC0729bm.f4601D);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m6321i(i2);
            iArr2[i2] = i2;
        }
        for (int i3 = 0; i3 < bitmapOrTextureArr.length; i3++) {
            if (i3 != 0) {
                bitmapOrTextureArr[i3] = bitmapOrTexture.m1036h();
                bitmapOrTextureArr[i3].m1041a("color(" + i3 + "):" + bitmapOrTexture.mo413a());
                bitmapOrTextureArr[i3].mo398j();
            }
        }
        bitmapOrTexture.mo398j();
        if (enumC0198o == EnumC0198o.f1379b) {
            m6361b(bitmapOrTexture, bitmapOrTextureArr, iArr);
        } else if (enumC0198o == EnumC0198o.f1381d) {
            m6378a(bitmapOrTexture, bitmapOrTextureArr, iArr, iArr2);
        } else {
            m6379a(bitmapOrTexture, bitmapOrTextureArr, iArr);
        }
        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
            if (bitmapOrTextureArr[i4] != null) {
                bitmapOrTextureArr[i4].mo393p();
                bitmapOrTextureArr[i4].m1033s();
            }
        }
        bitmapOrTexture.mo392r();
        bitmapOrTextureArr[0] = bitmapOrTexture;
        c0727bl.m2603b(EnumC0729bm.f4601D);
        bitmapOrTexture.m1043a(enumC0198o, bitmapOrTextureArr);
        return bitmapOrTextureArr;
    }

    /* renamed from: a */
    public static void m6379a(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr) {
        int m1084b;
        int mo396m = bitmapOrTexture.mo396m();
        int mo397l = bitmapOrTexture.mo397l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m7280b(iArr[i]);
            iArr3[i] = Color.m7279c(iArr[i]);
            iArr4[i] = Color.m7278d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo397l; i2++) {
            for (int i3 = 0; i3 < mo396m; i3++) {
                int mo412a = bitmapOrTexture.mo412a(i3, i2);
                int m1093a = C0924aa.m1093a(mo412a);
                if (m1093a == 0) {
                    if (mo412a != 0) {
                        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                            if (bitmapOrTextureArr[i4] != null) {
                                bitmapOrTextureArr[i4].mo411a(i3, i2, 0);
                            }
                        }
                    }
                } else {
                    int m1083c = C0924aa.m1083c(mo412a);
                    if (m1083c > 0 && (m1084b = C0924aa.m1084b(mo412a)) == C0924aa.m1082d(mo412a)) {
                        if (m1084b == 0) {
                            for (int i5 = 0; i5 < bitmapOrTextureArr.length; i5++) {
                                if (bitmapOrTextureArr[i5] != null) {
                                    bitmapOrTextureArr[i5].mo411a(i3, i2, Color.argb(m1093a, (iArr2[i5] * m1083c) >> 8, (iArr3[i5] * m1083c) >> 8, (iArr4[i5] * m1083c) >> 8));
                                }
                            }
                        } else if (m1083c != m1084b) {
                            float f = (m1083c * 0.003921569f) - (m1084b * 0.003921569f);
                            for (int i6 = 0; i6 < bitmapOrTextureArr.length; i6++) {
                                if (bitmapOrTextureArr[i6] != null) {
                                    bitmapOrTextureArr[i6].mo411a(i3, i2, Color.argb(m1093a, CommonUtils.m2310b((int) (m1084b + (iArr2[i6] * f)), 0, 255), CommonUtils.m2310b((int) (m1084b + (iArr3[i6] * f)), 0, 255), CommonUtils.m2310b((int) (m1084b + (iArr4[i6] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m6378a(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr, int[] iArr2) {
        int m7278d;
        int mo396m = bitmapOrTexture.mo396m();
        int mo397l = bitmapOrTexture.mo397l();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m7280b(iArr[i]);
            iArr4[i] = Color.m7279c(iArr[i]);
            iArr5[i] = Color.m7278d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo397l; i2++) {
            for (int i3 = 0; i3 < mo396m; i3++) {
                int mo412a = bitmapOrTexture.mo412a(i3, i2);
                int m7284a = Color.m7284a(mo412a);
                if (m7284a == 0) {
                    if (Color.m7280b(mo412a) > 0 || Color.m7279c(mo412a) > 0 || Color.m7278d(mo412a) > 0) {
                        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                            if (bitmapOrTextureArr[i4] != null) {
                                bitmapOrTextureArr[i4].mo411a(i3, i2, Color.argb(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int m7279c = Color.m7279c(mo412a);
                    int m7280b = Color.m7280b(mo412a);
                    float m2289c = CommonUtils.m2289c(CommonUtils.m2289c(m7280b, m7279c), Color.m7278d(mo412a));
                    float m2265f = CommonUtils.m2265f(CommonUtils.m2265f(CommonUtils.m2279d(m7280b - m7279c), CommonUtils.m2279d(m7279c - m7278d)), CommonUtils.m2279d(m7278d - m7280b));
                    if (m2265f > 15.0f) {
                        for (int i5 = 0; i5 < bitmapOrTextureArr.length; i5++) {
                            if (bitmapOrTextureArr[i5] != null) {
                                float f = m2265f / 255.0f;
                                bitmapOrTextureArr[i5].mo411a(i3, i2, Color.argb(m7284a, CommonUtils.m2310b((int) (m2289c + (iArr3[i5] * f)), 0, 255), CommonUtils.m2310b((int) (m2289c + (iArr4[i5] * f)), 0, 255), CommonUtils.m2310b((int) (m2289c + (iArr5[i5] * f)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m6361b(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr) {
        int mo396m = bitmapOrTexture.mo396m();
        int mo397l = bitmapOrTexture.mo397l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m7280b(iArr[i]);
            iArr3[i] = Color.m7279c(iArr[i]);
            iArr4[i] = Color.m7278d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo396m; i2++) {
            for (int i3 = 0; i3 < mo397l; i3++) {
                int mo412a = bitmapOrTexture.mo412a(i2, i3);
                int m7284a = Color.m7284a(mo412a);
                if (m7284a > 0) {
                    int m7280b = Color.m7280b(mo412a);
                    int m7279c = Color.m7279c(mo412a);
                    int m7278d = Color.m7278d(mo412a);
                    for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                        int i5 = (int) (m7280b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (m7279c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (m7278d + (iArr4[i4] * 0.15f));
                        int m2310b = CommonUtils.m2310b(i5, 0, 255);
                        int m2310b2 = CommonUtils.m2310b(i6, 0, 255);
                        int m2310b3 = CommonUtils.m2310b(i7, 0, 255);
                        if (bitmapOrTextureArr[i4] != null) {
                            bitmapOrTextureArr[i4].mo411a(i2, i3, Color.argb(m7284a, m2310b, m2310b2, m2310b3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static Team m6317k(int i) {
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
    public void m6335e(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1355ah > 0) {
            this.f1355ah--;
            return;
        }
        if (this.f1355ah == -2) {
            this.f1355ah = this.f1305k;
        } else {
            this.f1355ah = 10;
        }
        if (!this.f1329F && !gameEngine.f6120cb.m2635h()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = gameEngine.networkEngine.f5597aO.f5646l;
            boolean z5 = false;
            Unit[] m523a = Unit.f1589bD.m523a();
            int size = Unit.f1589bD.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m523a[i];
                if (unit.team == this) {
                    if (!unit.m5828cS()) {
                        z = true;
                        if (!this.f1328E && (unit.mo4495bJ() || unit.mo3142ak())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && unit.team != null && unit.team.m6342d(this) && !unit.m5828cS()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && gameEngine.f6233bx < 100 && gameEngine.f6094bv) {
                    z6 = true;
                }
                this.f1329F = true;
                m6396a();
                Iterator it = Unit.f1589bD.iterator();
                while (it.hasNext()) {
                    Unit unit2 = (Unit) it.next();
                    if (unit2.team == this && !unit2.m5755u()) {
                        if (z6 && !unit2.isDead && unit2.m5828cS()) {
                            InterfaceC0303as unitType = unit2.getUnitType();
                            String str = unit2.m5845cA() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((unitType instanceof C0453l) && ((C0453l) unitType).f2954aN) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            C0831ad.m1743a((String) null, str);
                        }
                        unit2.m5811ci();
                    }
                }
                gameEngine.networkEngine.m1639i(this);
            }
            if (!z2 && !this.f1328E && !this.f1329F) {
                this.f1328E = true;
                gameEngine.networkEngine.m1645h(this);
            }
        }
    }

    /* renamed from: a */
    public void m6385a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: b */
    public static void m6365b(AbstractC0623y abstractC0623y) {
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                team.m6385a(abstractC0623y);
            }
        }
    }

    /* renamed from: a */
    public static void m6389a(Unit unit) {
        if (unit.team != null && unit.f1609bW && unit.f1597bK) {
            Team team = unit.team;
            unit.f1609bW = false;
            team.f1342S.m6298b(unit);
            unit.m5782dh();
        }
    }

    /* renamed from: b */
    public static void m6369b(Unit unit) {
        m6389a(unit);
    }

    /* renamed from: c */
    public static void m6353c(Unit unit) {
        if (unit.team != null && !unit.f1609bW && unit.f1597bK && !unit.isDead) {
            unit.f1609bW = true;
            Team team = unit.team;
            team.f1342S.m6301a(unit);
            unit.m5783dg();
            if (!team.f1308n && team.f1342S.f1411m) {
                team.f1308n = true;
            }
            if (!team.f1307m) {
                team.f1307m = true;
            }
            team.m6404Q();
        }
    }

    /* renamed from: L */
    public static void m6409L() {
        f1370i.f1341R = true;
        f1369h.f1341R = true;
        Iterator it = m6358c().iterator();
        while (it.hasNext()) {
            ((Team) it.next()).f1341R = true;
        }
    }

    /* renamed from: M */
    public static void m6408M() {
        if (GameEngine.getInstance().m1223L()) {
            GameEngine.PrintLog("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                team.f1341R = true;
            }
        }
    }

    /* renamed from: f */
    public static void m6330f(float f) {
        int m6372b;
        GameEngine gameEngine = GameEngine.getInstance();
        f1370i.m6394a(f);
        f1369h.m6394a(f);
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null) {
                team.m6394a(f);
                team.m6335e(f);
                if (!team.f1324as && (m6372b = m6372b(team.f1311q)) > 0) {
                    if (m6372b >= m6356c(team.f1311q)) {
                        m6343d(team.f1311q);
                        m6313o();
                    } else {
                        m6334e(team.f1311q);
                    }
                }
                if (team.f1326D) {
                    if (team.f1327au < 0) {
                        team.f1327au = gameEngine.f6096by;
                    }
                    if (!team.f1329F) {
                        int i2 = 0;
                        Iterator it = Unit.f1589bD.iterator();
                        while (it.hasNext()) {
                            Unit unit = (Unit) it.next();
                            if (unit.team == team && !unit.m5755u()) {
                                boolean z = false;
                                int i3 = 1;
                                if (C1117y.m500a(team.f1327au, 16000)) {
                                    z = true;
                                    i3 = 50;
                                } else if (C1117y.m500a(team.f1327au, 6000)) {
                                    z = CommonUtils.m2346a(unit, 0, 100) > 90;
                                    i3 = 20;
                                } else if (C1117y.m500a(team.f1327au, 2000)) {
                                    z = CommonUtils.m2346a(unit, 0, 100) > 98;
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
        if (gameEngine.m1220O() && gameEngine.f6109bQ.aiDifficulty != f1375ai) {
            gameEngine.networkEngine.m1712aq();
            f1375ai = gameEngine.f6109bQ.aiDifficulty;
        }
    }

    /* renamed from: g */
    public static void m6327g(float f) {
        m6336e();
        for (Team team : m6345d()) {
            team.m6337d(false);
        }
    }

    /* renamed from: N */
    public static void m6407N() {
        f1370i.m6337d(false);
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null && !team.m6374b() && !team.f1329F && !team.f1328E && !team.f1326D) {
                GameEngine.getInstance().networkEngine.m1651g(team);
            }
        }
    }

    /* renamed from: h */
    public static void m6324h(float f) {
        for (int i = 0; i < f1364c; i++) {
            Team team = f1371ar[i];
            if (team != null && (team instanceof C0136a)) {
                ((C0136a) team).m6830i(f);
            }
        }
    }

    /* renamed from: O */
    public int getId() {
        if (this.f1323C == -1) {
            return m6405P();
        }
        return this.f1323C;
    }

    /* renamed from: P */
    public int m6405P() {
        Team team;
        if (this.f1305k == -1 || this.f1305k == -2) {
            return 5;
        }
        int i = this.f1305k;
        if (i >= 10) {
            i %= 10;
        }
        if (f1364c > 10 && (team = GameEngine.getInstance().networkEngine.f5483z) != null && team != this && team.getId() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public void m6404Q() {
    }

    /* renamed from: a */
    public void m6386a(C0449h c0449h) {
        this.f1356aj = c0449h;
    }

    /* renamed from: R */
    public C0449h m6403R() {
        return this.f1356aj;
    }

    /* renamed from: b */
    public void m6366b(C0449h c0449h) {
        C0449h m6403R = m6403R();
        if (m6403R == null || m6403R.m5051b() == 0) {
            m6386a(c0449h);
        } else if (C0448g.m5056b(m6403R, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m6403R);
            if (c0450i.m5048a(c0449h)) {
                m6386a(c0450i.m5050a());
            }
        }
    }

    /* renamed from: c */
    public void m6350c(C0449h c0449h) {
        C0449h m6403R = m6403R();
        if (m6403R == null || m6403R.m5051b() == 0 || !C0448g.m5061a(c0449h, m6403R)) {
            return;
        }
        C0450i c0450i = new C0450i(m6403R);
        if (c0450i.m5047b(c0449h)) {
            m6386a(c0450i.m5050a());
        }
    }

    /* renamed from: S */
    public C0439f m6402S() {
        return this.f1357ak;
    }

    /* renamed from: c */
    public double m6352c(C0428a c0428a) {
        return this.f1357ak.m5123a(c0428a);
    }

    /* renamed from: a */
    public boolean m6390a(EnumC0200q enumC0200q, Team team) {
        if (enumC0200q == EnumC0200q.f1389a) {
            return team == this;
        } else if (enumC0200q == EnumC0200q.f1394f) {
            return true;
        } else {
            if (enumC0200q == EnumC0200q.f1390b) {
                return m6342d(team);
            }
            if (enumC0200q == EnumC0200q.f1391c) {
                return team != this && m6342d(team);
            } else if (enumC0200q == EnumC0200q.f1392d) {
                return m6354c(team);
            } else {
                if (enumC0200q == EnumC0200q.f1393e) {
                    return team == f1370i;
                } else if (enumC0200q != EnumC0200q.f1395g) {
                    throw new RuntimeException("Unsupported type: " + enumC0200q);
                } else {
                    return team != this;
                }
            }
        }
    }

    /* renamed from: d */
    public void m6341d(Unit unit) {
    }

    /* renamed from: T */
    public void m6401T() {
        GameEngine.PrintLog("debugUnitCountByType for team:" + this.f1305k);
        C1101m c1101m = new C1101m();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this && !unit.isDead) {
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
            if (!c0201r3.f1397a.mo5704k()) {
                GameEngine.PrintLog(c0201r3.f1397a.mo5706i() + " - count:" + c0201r3.f1398b);
                i2 += c0201r3.f1398b;
            }
        }
        GameEngine.PrintLog("total:" + i2);
        GameEngine.PrintLog("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = c1101m.iterator();
        while (it3.hasNext()) {
            C0201r c0201r4 = (C0201r) it3.next();
            if (c0201r4.f1397a.mo5704k()) {
                GameEngine.PrintLog(c0201r4.f1397a.mo5706i() + " - count:" + c0201r4.f1398b);
                i3 += c0201r4.f1398b;
            }
        }
        GameEngine.PrintLog("total:" + i3);
    }

    /* renamed from: c */
    public void m6347c(String str) {
        GameEngine.PrintLog("Team(id: " + this.f1305k + ", name:" + this.f1315u + "):" + str);
    }

    /* renamed from: b */
    public int m6367b(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        if (this == f1370i) {
            return 0;
        }
        Team[] teamArr = f1371ar;
        int i2 = f1364c;
        for (int i3 = 0; i3 < i2; i3++) {
            Team team = teamArr[i3];
            if (team != null && this != team && this.f1311q != team.f1311q) {
                if (c0448g == null) {
                    i += team.m6375a(z, z2);
                } else {
                    i += team.m6387a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m6351c(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        Team[] teamArr = f1371ar;
        int i2 = f1364c;
        for (int i3 = 0; i3 < i2; i3++) {
            Team team = teamArr[i3];
            if (team != null && this != team && m6342d(team)) {
                if (c0448g == null) {
                    i += team.m6375a(z, z2);
                } else {
                    i += team.m6387a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: U */
    public static void m6400U() {
        f1370i.m6399V();
        f1369h.m6399V();
    }

    /* renamed from: V */
    public void m6399V() {
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
        this.f1358al.m5137a();
        this.f1359am = 0.0f;
        this.f1352ac = 0;
        this.f1340Q = 0;
        this.f1341R = true;
        this.f1342S = new C0202s();
        this.f1356aj = C0448g.f2836d;
        this.f1357ak = new C0439f();
    }

    /* renamed from: W */
    public double m6398W() {
        long currentTimeMillis = System.currentTimeMillis();
        if (CommonUtils.m2294c((float) (this.f1360ap - currentTimeMillis)) > 166.66666f) {
            this.f1360ap = currentTimeMillis;
            this.f1361aq = this.f1309o;
        }
        return this.f1361aq;
    }

    /* renamed from: X */
    public C0439f m6397X() {
        return m6402S();
    }
}
