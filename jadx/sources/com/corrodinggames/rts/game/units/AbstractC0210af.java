package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.EnumC0306ab;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.custom.p019c.C0340c;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p014b.AbstractC0274b;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.game.units.p023d.C0420n;
import com.corrodinggames.rts.game.units.p023d.C0425p;
import com.corrodinggames.rts.game.units.p025e.AbstractC0440h;
import com.corrodinggames.rts.game.units.p025e.AbstractC0444j;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.game.units.p028h.AbstractC0497f;
import com.corrodinggames.rts.gameFramework.AbstractC0566ay;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0838o;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public abstract class AbstractC0210af extends AbstractC0566ay {

    /* renamed from: bc */
    public float f1435bc;

    /* renamed from: bf */
    public int f1438bf;

    /* renamed from: bi */
    public int f1441bi;

    /* renamed from: bq */
    public boolean f1450bq;

    /* renamed from: bw */
    public AbstractC0210af f1456bw;

    /* renamed from: bx */
    public float f1457bx;

    /* renamed from: bB */
    public AbstractC0171m f1461bB;

    /* renamed from: bC */
    public boolean f1462bC;

    /* renamed from: bF */
    public boolean f1465bF;

    /* renamed from: bL */
    public float f1471bL;

    /* renamed from: bM */
    public float f1472bM;

    /* renamed from: bN */
    public boolean f1473bN;

    /* renamed from: bO */
    public float f1474bO;

    /* renamed from: bP */
    public float f1475bP;

    /* renamed from: bQ */
    public float f1476bQ;

    /* renamed from: bY */
    public float f1484bY;

    /* renamed from: bZ */
    public float f1485bZ;

    /* renamed from: ca */
    public float f1486ca;

    /* renamed from: cb */
    public float f1487cb;

    /* renamed from: cc */
    public float f1488cc;

    /* renamed from: cd */
    public float f1489cd;

    /* renamed from: ce */
    public float f1490ce;

    /* renamed from: cf */
    public float f1491cf;

    /* renamed from: cg */
    public int f1492cg;

    /* renamed from: ch */
    public int f1493ch;

    /* renamed from: ci */
    public boolean f1494ci;

    /* renamed from: ck */
    public boolean f1496ck;

    /* renamed from: cn */
    public C0213ai[] f1499cn;

    /* renamed from: co */
    public boolean f1500co;

    /* renamed from: ct */
    public boolean f1505ct;

    /* renamed from: cu */
    public int f1506cu;

    /* renamed from: cv */
    public int f1507cv;

    /* renamed from: cw */
    public int f1508cw;

    /* renamed from: cx */
    public float f1509cx;

    /* renamed from: cQ */
    public float f1528cQ;

    /* renamed from: cR */
    public float f1529cR;

    /* renamed from: db */
    public AbstractC0268al f1539db;

    /* renamed from: dh */
    C0211ag[] f1545dh;

    /* renamed from: bj */
    public static final C0846u f1442bj = new C0846u();

    /* renamed from: a */
    private static final C0838o f1443a = new C0838o();

    /* renamed from: bk */
    public static HashMap f1444bk = new HashMap();

    /* renamed from: bl */
    public static HashMap f1445bl = new HashMap();

    /* renamed from: bm */
    public static HashMap f1446bm = new HashMap();

    /* renamed from: bn */
    public static final Paint f1447bn = new C0760q();

    /* renamed from: bo */
    public static final Paint f1448bo = new C0760q();

    /* renamed from: bp */
    static final LightingColorFilter f1449bp = new LightingColorFilter(Color.m4214a(255, 255, 255), Color.m4214a(100, 100, 100));

    /* renamed from: cy */
    public static final Paint f1510cy = new Paint();

    /* renamed from: cz */
    public static final Paint f1511cz = new C0760q();

    /* renamed from: cA */
    public static final Paint f1512cA = new C0760q();

    /* renamed from: cB */
    public static final Paint f1513cB = new C0760q();

    /* renamed from: cC */
    public static final Paint f1514cC = new C0760q();

    /* renamed from: cD */
    public static final Paint f1515cD = new C0760q();

    /* renamed from: cE */
    public static final Paint f1516cE = new C0760q();

    /* renamed from: cF */
    public static final Paint f1517cF = new Paint();

    /* renamed from: cG */
    public static final Paint f1518cG = new Paint();

    /* renamed from: cH */
    public static final Paint f1519cH = new Paint();

    /* renamed from: cI */
    public static final Paint f1520cI = new C0760q();

    /* renamed from: cJ */
    public static final Paint f1521cJ = new C0760q();

    /* renamed from: cK */
    public static final Paint f1522cK = new C0760q();

    /* renamed from: cL */
    public static final Paint f1523cL = new C0760q();

    /* renamed from: cM */
    public static final Paint f1524cM = new Paint();

    /* renamed from: cT */
    static final RectF f1531cT = new RectF();

    /* renamed from: cU */
    static Paint f1532cU = new Paint();

    /* renamed from: cV */
    static Paint f1533cV = new Paint();

    /* renamed from: cW */
    public static final RectF f1534cW = new RectF();

    /* renamed from: cX */
    public static final Rect f1535cX = new Rect();

    /* renamed from: cY */
    static final Rect f1536cY = new Rect();

    /* renamed from: cZ */
    static final ArrayList f1537cZ = new ArrayList();

    /* renamed from: da */
    static ArrayList f1538da = new ArrayList();

    /* renamed from: dc */
    static final RectF f1540dc = new RectF();

    /* renamed from: dd */
    static final RectF f1541dd = new RectF();

    /* renamed from: de */
    static final Rect f1542de = new Rect();

    /* renamed from: df */
    static final PointF f1543df = new PointF();

    /* renamed from: dg */
    static final PointF f1544dg = new PointF();

    /* renamed from: di */
    static final PointF f1546di = new PointF();

    /* renamed from: bd */
    public int f1436bd = -9999;

    /* renamed from: be */
    public AbstractC0210af f1437be = null;

    /* renamed from: bg */
    public int f1439bg = -9999;

    /* renamed from: bh */
    public int f1440bh = -9999;

    /* renamed from: br */
    public boolean f1451br = false;

    /* renamed from: bs */
    public boolean f1452bs = false;

    /* renamed from: bt */
    public boolean f1453bt = false;

    /* renamed from: bu */
    public boolean f1454bu = false;

    /* renamed from: bv */
    public AbstractC0210af f1455bv = null;

    /* renamed from: by */
    public boolean f1458by = true;

    /* renamed from: bz */
    public boolean f1459bz = false;

    /* renamed from: bA */
    public long f1460bA = 0;

    /* renamed from: bD */
    public float f1463bD = 0.0f;

    /* renamed from: bE */
    public float f1464bE = 0.0f;

    /* renamed from: bG */
    public boolean f1466bG = false;

    /* renamed from: bH */
    public float f1467bH = 0.0f;

    /* renamed from: bI */
    public float f1468bI = 0.0f;

    /* renamed from: bJ */
    public float f1469bJ = 0.0f;

    /* renamed from: bK */
    public float f1470bK = 0.0f;

    /* renamed from: bR */
    public float f1477bR = 1.0f;

    /* renamed from: bS */
    public boolean f1478bS = false;

    /* renamed from: bT */
    public boolean f1479bT = false;

    /* renamed from: bU */
    public boolean f1480bU = false;

    /* renamed from: bV */
    public boolean f1481bV = false;

    /* renamed from: bW */
    public boolean f1482bW = false;

    /* renamed from: bX */
    public boolean f1483bX = false;

    /* renamed from: cj */
    public int f1495cj = -9999;

    /* renamed from: cl */
    public float f1497cl = 0.0f;

    /* renamed from: cm */
    public boolean f1498cm = true;

    /* renamed from: cp */
    public AbstractC0210af f1501cp = null;

    /* renamed from: cq */
    public AbstractC0515r f1502cq = null;

    /* renamed from: cr */
    public C0336i f1503cr = null;

    /* renamed from: cs */
    public int f1504cs = -9999;

    /* renamed from: cN */
    public int f1525cN = -1;

    /* renamed from: cO */
    public int f1526cO = -1;

    /* renamed from: cP */
    public int f1527cP = -99;

    /* renamed from: cS */
    public float f1530cS = 70.0f;

    /* renamed from: dj */
    final C0354d f1547dj = new C0354d();

    /* renamed from: dk */
    public C0340c f1548dk = new C0340c();

    /* renamed from: h */
    public abstract EnumC0212ah mo2358h();

    /* renamed from: i */
    public abstract boolean mo2357i();

    /* renamed from: P */
    public abstract boolean mo2363P();

    /* renamed from: ah */
    public abstract boolean mo2245ah();

    /* renamed from: ai */
    public abstract boolean mo2244ai();

    /* renamed from: j */
    public abstract boolean mo2163j();

    /* renamed from: r */
    public abstract AbstractC0268al mo1606r();

    /* renamed from: l */
    public abstract boolean mo2356l();

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f1451br);
        apVar.mo1094a(this.f1455bv);
        apVar.mo1094a(this.f1456bw);
        apVar.mo1096a(this.f1457bx);
        apVar.mo1090a(this.f1458by);
        apVar.mo1090a(this.f1459bz);
        apVar.mo1148a(this.f1460bA);
        apVar.mo1146a(this.f1461bB);
        apVar.mo1096a(this.f1463bD);
        apVar.mo1096a(this.f1464bE);
        apVar.mo1096a(this.f1467bH);
        apVar.mo1096a(this.f1468bI);
        apVar.mo1096a(this.f1470bK);
        apVar.mo1096a(this.f1471bL);
        apVar.mo1096a(this.f1474bO);
        apVar.mo1096a(this.f1475bP);
        apVar.mo1096a(this.f1476bQ);
        apVar.mo1096a(this.f1477bR);
        apVar.mo1090a(this.f1479bT);
        apVar.mo1090a(this.f1482bW);
        apVar.mo1096a(this.f1484bY);
        apVar.mo1096a(this.f1485bZ);
        apVar.mo1090a(this.f1498cm);
        apVar.mo1096a(this.f1499cn[0].f1561a);
        apVar.mo1096a(this.f1499cn[0].f1564d);
        apVar.mo1094a(this.f1501cp);
        apVar.mo1130c(21);
        apVar.mo1095a(this.f1508cw);
        apVar.mo1096a(this.f1509cx);
        apVar.mo1096a(this.f1469bJ);
        apVar.mo1096a(this.f1472bM);
        int bg = mo2205bg();
        apVar.mo1095a(bg);
        for (int i = 0; i < bg; i++) {
            C0213ai aiVar = this.f1499cn[i];
            apVar.mo1096a(aiVar.f1561a);
            apVar.mo1096a(aiVar.f1563c);
            apVar.mo1096a(aiVar.f1564d);
            apVar.mo1096a(aiVar.f1565e);
            apVar.mo1096a(aiVar.f1566f);
            apVar.mo1096a(aiVar.f1568h);
            apVar.mo1096a(aiVar.f1569i);
            AbstractC0210af afVar = aiVar.f1570j;
            if (afVar != null && afVar.f1459bz) {
                afVar = null;
            }
            apVar.mo1094a(afVar);
            apVar.mo1090a(this.f1500co);
        }
        apVar.mo1095a(this.f1436bd);
        apVar.mo1096a(this.f1487cb);
        apVar.mo1096a(this.f1488cc);
        apVar.mo1096a(this.f1489cd);
        apVar.mo1096a(this.f1490ce);
        apVar.mo1090a(this.f1480bU);
        apVar.mo1090a(this.f1481bV);
        apVar.mo1090a(this.f1483bX);
        apVar.mo1090a(this.f1452bs);
        apVar.mo1096a(this.f1491cf);
        apVar.mo1090a(this.f1473bN);
        apVar.mo1090a(this.f1545dh != null);
        if (this.f1545dh != null) {
            apVar.mo1095a(this.f1545dh.length);
            for (int i2 = 0; i2 < this.f1545dh.length; i2++) {
                C0211ag agVar = this.f1545dh[i2];
                apVar.mo1090a(agVar.f1549a);
                apVar.mo1095a(agVar.f1550b);
            }
        }
        apVar.mo1096a(this.f1486ca);
        apVar.mo1134b(this.f1437be);
        apVar.mo1095a(this.f1492cg);
        apVar.mo1095a(this.f1493ch);
        apVar.mo1095a(this.f1438bf);
        apVar.mo1095a(this.f1439bg);
        apVar.mo1095a(this.f1440bh);
        apVar.mo1095a(this.f1441bi);
        apVar.mo1090a(this.f1453bt);
        apVar.mo1090a(this.f1454bu);
        this.f1547dj.m2990a(apVar);
        this.f1548dk.m3022a(apVar);
        apVar.mo1134b((AbstractC0210af) this.f1502cq);
        short s = -1;
        if (!(this.f1502cq == null || this.f1503cr == null)) {
            s = this.f1503cr.m3037a();
        }
        apVar.mo1091a(s);
        apVar.mo1095a(this.f1504cs);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        C0336i a;
        this.f1451br = kVar.m1063e();
        this.f1455bv = kVar.m1054n();
        this.f1456bw = kVar.m1054n();
        this.f1457bx = kVar.m1061g();
        this.f1458by = kVar.m1063e();
        this.f1459bz = kVar.m1063e();
        this.f1460bA = kVar.m1059i();
        mo2305a(kVar.m1051q());
        this.f1463bD = kVar.m1061g();
        this.f1464bE = kVar.m1061g();
        this.f1467bH = kVar.m1061g();
        this.f1468bI = kVar.m1061g();
        this.f1470bK = kVar.m1061g();
        this.f1471bL = kVar.m1061g();
        kVar.m1061g();
        kVar.m1061g();
        this.f1476bQ = kVar.m1061g();
        this.f1477bR = kVar.m1061g();
        this.f1479bT = kVar.m1063e();
        this.f1482bW = kVar.m1063e();
        this.f1484bY = kVar.m1061g();
        this.f1485bZ = kVar.m1061g();
        this.f1498cm = kVar.m1063e();
        this.f1499cn[0].f1561a = kVar.m1061g();
        this.f1499cn[0].f1564d = kVar.m1061g();
        this.f1501cp = kVar.m1054n();
        byte d = kVar.m1065d();
        if (d >= 1) {
            this.f1508cw = kVar.m1062f();
            this.f1509cx = kVar.m1061g();
        }
        if (d >= 2) {
            this.f1469bJ = kVar.m1061g();
            this.f1472bM = kVar.m1061g();
            int f = kVar.m1062f();
            m3343N(f);
            for (int i = 0; i < f; i++) {
                C0213ai aiVar = this.f1499cn[i];
                aiVar.f1561a = kVar.m1061g();
                aiVar.f1563c = kVar.m1061g();
                aiVar.f1564d = kVar.m1061g();
                aiVar.f1565e = kVar.m1061g();
                aiVar.f1566f = kVar.m1061g();
                if (d >= 8) {
                    aiVar.f1568h = kVar.m1061g();
                    aiVar.f1569i = kVar.m1061g();
                    aiVar.f1570j = kVar.m1054n();
                }
                if (d >= 12) {
                    this.f1500co = kVar.m1063e();
                }
            }
        }
        if (d >= 3) {
            this.f1436bd = kVar.m1062f();
        }
        if (d >= 4) {
            this.f1487cb = kVar.m1061g();
            this.f1488cc = kVar.m1061g();
            this.f1489cd = kVar.m1061g();
            this.f1490ce = kVar.m1061g();
        }
        if (d >= 5) {
            this.f1480bU = kVar.m1063e();
            this.f1481bV = kVar.m1063e();
        }
        if (d >= 6) {
            this.f1483bX = kVar.m1063e();
        }
        if (d >= 7) {
            this.f1452bs = kVar.m1063e();
        }
        if (d >= 9) {
            this.f1491cf = kVar.m1061g();
        }
        if (d >= 10) {
            this.f1473bN = kVar.m1063e();
        }
        if (d >= 11 && kVar.m1063e()) {
            this.f1545dh = new C0211ag[kVar.m1062f()];
            for (int i2 = 0; i2 < this.f1545dh.length; i2++) {
                this.f1545dh[i2] = new C0211ag();
                C0211ag agVar = this.f1545dh[i2];
                agVar.f1549a = kVar.m1063e();
                agVar.f1550b = kVar.m1062f();
            }
        }
        if (d >= 13) {
            this.f1486ca = kVar.m1061g();
        }
        if (d >= 14) {
            this.f1437be = kVar.m1054n();
        }
        if (d >= 15) {
            this.f1492cg = kVar.m1062f();
            this.f1493ch = kVar.m1062f();
        }
        if (d >= 16) {
            this.f1438bf = kVar.m1062f();
            this.f1439bg = kVar.m1062f();
            this.f1440bh = kVar.m1062f();
        }
        if (d >= 17) {
            this.f1441bi = kVar.m1062f();
        }
        if (d >= 18) {
            this.f1453bt = kVar.m1063e();
            this.f1454bu = kVar.m1063e();
        }
        if (d >= 19) {
            this.f1547dj.m2989a(kVar);
            this.f1548dk.m3026a(this, kVar);
        }
        if (d >= 20) {
            AbstractC0515r o = kVar.m1053o();
            short t = kVar.m1048t();
            if (t != -1) {
                boolean z = false;
                if (o != null && (this instanceof AbstractC0515r) && (a = o.mo2281a(t)) != null && o.mo2289a((AbstractC0515r) this, a)) {
                    z = true;
                }
                if (!z) {
                    this.f1484bY = -1.0f;
                }
            }
        }
        if (d >= 21) {
            this.f1504cs = kVar.m1062f();
        }
        if (this.f1459bz) {
            AbstractC0789l u = AbstractC0789l.m638u();
            f1442bj.remove(this);
            u.f5528bK.m2458a(this);
        }
        super.mo399a(kVar);
    }

    /* renamed from: a */
    public static C0748e m3331a(C0748e eVar) {
        return m3330a(eVar, eVar.mo349l(), eVar.mo350k());
    }

    /* renamed from: a */
    public static C0748e m3330a(C0748e eVar, int i, int i2) {
        C0748e a = eVar.mo60a(i, i2, false);
        eVar.mo42w();
        a.mo51i();
        int l = a.mo349l();
        int k = a.mo350k();
        for (int i3 = 0; i3 < l; i3++) {
            for (int i4 = 0; i4 < k; i4++) {
                a.mo61a(i3, i4, Color.m4213a(Color.m4215a(eVar.mo62a(i3, i4)), 0, 0, 0));
            }
        }
        a.mo47o();
        a.mo44r();
        eVar.mo41x();
        return a;
    }

    static {
        f1447bn.m4173a(true);
        f1447bn.m4189a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        f1448bo.m4173a(true);
        f1448bo.m4189a(255, 255, 255, 255);
        f1448bo.m4187a(f1449bp);
        f1510cy.m4184a(Paint.Style.STROKE);
        f1510cy.m4192a(2.0f);
        m3339a(f1510cy);
        f1511cz.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1511cz.m4184a(Paint.Style.STROKE);
        f1511cz.m4192a(2.0f);
        m3338a(f1511cz, true);
        f1512cA.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1512cA.m4184a(Paint.Style.STROKE);
        f1512cA.m4192a(2.0f);
        m3339a(f1512cA);
        f1513cB.m4189a(130, 0, 255, 0);
        f1513cB.m4184a(Paint.Style.STROKE);
        f1513cB.m4192a(2.0f);
        m3339a(f1513cB);
        f1517cF.m4189a(70, 0, 255, 0);
        f1517cF.m4184a(Paint.Style.STROKE);
        f1517cF.m4192a(1.0f);
        m3339a(f1517cF);
        f1514cC.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        f1514cC.m4184a(Paint.Style.STROKE);
        f1514cC.m4192a(2.0f);
        m3339a(f1514cC);
        f1518cG.m4189a(70, 255, 0, 0);
        f1518cG.m4184a(Paint.Style.STROKE);
        f1518cG.m4192a(1.0f);
        m3339a(f1518cG);
        f1516cE.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        f1516cE.m4184a(Paint.Style.STROKE);
        f1516cE.m4192a(2.0f);
        m3339a(f1516cE);
        f1519cH.m4189a(70, 255, 255, 0);
        f1519cH.m4184a(Paint.Style.STROKE);
        f1519cH.m4192a(1.0f);
        m3339a(f1519cH);
        f1515cD.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        f1515cD.m4184a(Paint.Style.STROKE);
        f1515cD.m4192a(2.0f);
        m3339a(f1515cD);
        f1520cI.m4189a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1520cI.m4184a(Paint.Style.STROKE);
        f1520cI.m4192a(1.0f);
        m3339a(f1520cI);
        f1521cJ.m4189a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1521cJ.m4184a(Paint.Style.STROKE);
        f1521cJ.m4192a(2.0f);
        m3339a(f1521cJ);
        f1522cK.m4189a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        f1522cK.m4184a(Paint.Style.STROKE);
        f1522cK.m4192a(1.0f);
        m3339a(f1522cK);
        f1523cL.m4184a(Paint.Style.STROKE);
        f1524cM.m4184a(Paint.Style.STROKE);
    }

    /* renamed from: bt */
    public static C0838o m3317bt() {
        f1443a.m482a();
        return f1443a;
    }

    /* renamed from: bu */
    public static void m3316bu() {
        f1443a.m482a();
    }

    /* renamed from: bv */
    public static void m3315bv() {
        AbstractC0444j.m2488cZ();
        AbstractC0403c.m2642cZ();
        AbstractC0440h.m2510K();
        AbstractC0497f.m2385L();
        AbstractC0274b.m3228K();
        if (AbstractC0789l.m638u().m700ai()) {
            Iterator it = EnumSet.allOf(EnumC0215ak.class).iterator();
            while (it.hasNext()) {
                ((EnumC0215ak) it.next()).mo3259b();
            }
        } else {
            C0434b.m2530K();
            C0420n.m2574b();
            C0425p.m2558da();
            C0209ae.m3348b();
        }
        EnumC0215ak.m3265t();
    }

    /* renamed from: bw */
    public boolean mo2643bw() {
        return false;
    }

    /* renamed from: bx */
    public boolean mo2554bx() {
        return false;
    }

    /* renamed from: by */
    public static HashMap m3314by() {
        HashMap hashMap = new HashMap();
        if (AbstractC0789l.m638u().m700ai()) {
            Iterator it = EnumSet.allOf(EnumC0215ak.class).iterator();
            while (it.hasNext()) {
                EnumC0215ak akVar = (EnumC0215ak) it.next();
                AbstractC0210af a = akVar.mo3260a(true);
                a.mo405a();
                a.mo2305a(AbstractC0171m.f1236g);
                a.f1479bT = true;
                hashMap.put(akVar, a);
            }
        }
        Iterator it2 = C0368l.f2486d.iterator();
        while (it2.hasNext()) {
            C0368l lVar = (C0368l) it2.next();
            AbstractC0210af a2 = lVar.m2776a(true);
            a2.mo405a();
            a2.mo2305a(AbstractC0171m.f1236g);
            a2.f1479bT = true;
            hashMap.put(lVar, a2);
        }
        return hashMap;
    }

    /* renamed from: bz */
    public static void m3313bz() {
        f1445bl = m3314by();
        f1446bm = m3314by();
        f1444bk = m3314by();
    }

    /* renamed from: a */
    public static AbstractC0210af m3333a(AbstractC0268al alVar) {
        return (AbstractC0210af) f1444bk.get(alVar);
    }

    /* renamed from: b */
    public static AbstractC0210af m3325b(AbstractC0268al alVar) {
        return m3310c(alVar);
    }

    /* renamed from: c */
    public static AbstractC0210af m3310c(AbstractC0268al alVar) {
        AbstractC0210af afVar = (AbstractC0210af) f1445bl.get(alVar);
        if (afVar == null) {
            if (C0368l.f2484b == null) {
                AbstractC0789l.m670d("Could not find:" + alVar.mo2754i() + " and missing place holder is null");
                return null;
            }
            afVar = (AbstractC0210af) f1445bl.get(C0368l.f2484b);
            if (afVar == null) {
                AbstractC0789l.m670d("name: " + C0368l.f2484b.f2513E);
                AbstractC0789l.m670d("contains:" + f1445bl.containsKey(C0368l.f2484b));
                Iterator it = f1445bl.keySet().iterator();
                while (it.hasNext()) {
                    AbstractC0789l.m670d("has:" + ((AbstractC0268al) it.next()).mo2754i());
                }
                AbstractC0789l.m670d("Could not find:" + alVar.mo2754i() + " and missing place holder could not be found");
            }
        }
        return afVar;
    }

    /* renamed from: d */
    public static AbstractC0210af m3296d(AbstractC0268al alVar) {
        AbstractC0210af afVar = (AbstractC0210af) f1446bm.get(alVar);
        if (afVar == null) {
            afVar = (AbstractC0210af) f1446bm.get(C0368l.f2484b);
        }
        return afVar;
    }

    /* renamed from: bA */
    public static int m3324bA() {
        int i = 0;
        if (AbstractC0789l.m638u().m700ai()) {
            Iterator it = EnumSet.allOf(EnumC0215ak.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + m3333a((EnumC0215ak) it.next()).mo2194br();
            }
        }
        return i;
    }

    protected AbstractC0210af(boolean z) {
        super(z);
        this.f1438bf = -9999;
        m3322bF();
        if (!z) {
            this.f1450bq = true;
            f1442bj.add(this);
            f1443a.m478a(this);
        }
        this.f1438bf = AbstractC0789l.m638u().f5499bh;
        this.f1539db = mo1606r();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0566ay, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        AbstractC0171m.m3508a(this);
        f1442bj.remove(this);
        f1443a.m475b(this);
        AbstractC0789l.m638u().f5518bA.m1666l(this);
        super.mo405a();
    }

    /* renamed from: bB */
    public float mo2395bB() {
        return 3000.0f;
    }

    /* renamed from: q */
    public int mo2810q(AbstractC0210af afVar) {
        return 0;
    }

    /* renamed from: bC */
    public boolean mo2862bC() {
        return false;
    }

    /* renamed from: bD */
    public boolean mo2861bD() {
        return false;
    }

    /* renamed from: bE */
    public float m3323bE() {
        return -1.0f;
    }

    /* renamed from: bF */
    public void m3322bF() {
        m3343N(1);
    }

    /* renamed from: N */
    public void m3343N(int i) {
        int i2;
        int bg = mo2205bg();
        if (bg < i) {
            bg = i;
        }
        if (this.f1499cn == null) {
            i2 = 0;
            this.f1499cn = new C0213ai[bg];
        } else if (this.f1499cn.length < bg) {
            i2 = this.f1499cn.length;
            this.f1499cn = (C0213ai[]) Arrays.copyOf(this.f1499cn, bg);
        } else {
            return;
        }
        for (int i3 = i2; i3 < this.f1499cn.length; i3++) {
            this.f1499cn[i3] = new C0213ai();
        }
    }

    /* renamed from: a */
    public static void m3339a(Paint paint) {
        m3338a(paint, false);
    }

    /* renamed from: a */
    public static void m3338a(Paint paint, boolean z) {
        if (!AbstractC0789l.m697al() && z) {
            paint.m4192a(0.0f);
        }
    }

    /* renamed from: f */
    public float mo2511f(boolean z) {
        return this.f1471bL + 90.0f;
    }

    /* renamed from: bG */
    public final boolean m3321bG() {
        return this.f1501cp == null && this.f1477bR >= 1.0f;
    }

    /* renamed from: a_ */
    public float mo2867a_() {
        if (this.f1484bY < this.f1485bZ) {
            return this.f1484bY / this.f1485bZ;
        }
        return -1.0f;
    }

    /* renamed from: bH */
    public float mo2564bH() {
        if (this.f1477bR >= 1.0f) {
            return -1.0f;
        }
        if (this.f1502cq == null || this.f1502cq.f1477bR >= 1.0f) {
            return this.f1477bR;
        }
        return -1.0f;
    }

    /* renamed from: bI */
    public float mo2486bI() {
        return -1.0f;
    }

    /* renamed from: bJ */
    public boolean mo2485bJ() {
        return false;
    }

    /* renamed from: bK */
    public int mo2503bK() {
        return -1;
    }

    /* renamed from: bL */
    public int mo2502bL() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.f1459bz && this.f1501cp == null) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (!z) {
                boolean z2 = false;
                int bK = mo2503bK();
                if (mo2564bH() >= 0.0f) {
                    z2 = true;
                }
                if (mo2486bI() >= 0.0f) {
                    z2 = true;
                }
                if (this.f1494ci || u.f5516by.showHp) {
                    if (mo2867a_() >= 0.0f) {
                        z2 = true;
                    }
                    if (bK >= 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    float f2 = this.f5842dH - u.f5547cd;
                    float f3 = (this.f5843dI - u.f5548ce) - this.f5844dJ;
                    float f4 = this.f1474bO + 4.0f;
                    int i5 = 4;
                    float f5 = 2.0f * this.f1474bO;
                    if (u.f5574cE < 1.0f) {
                        u.f5514bw.mo125j();
                        u.m749L();
                        f2 *= u.f5574cE;
                        f3 *= u.f5574cE;
                        f4 *= u.f5574cE;
                    }
                    float f6 = 3.0f;
                    if (this.f1494ci || u.f5516by.showHp) {
                        if (mo2867a_() >= 0.0f) {
                            boolean z3 = false;
                            boolean z4 = false;
                            C0336i cV = m3306cV();
                            if (cV != null) {
                                z3 = cV.f2278p;
                                z4 = cV.f2279q;
                            }
                            if (!z4) {
                                if (u.f5493bb.m3474c(this.f1461bB)) {
                                    i4 = C0654f.m1470b(200, 183, 44, 44);
                                    i3 = C0654f.m1470b(120, 255, 60, 60);
                                } else {
                                    i4 = C0654f.m1470b(200, 0, 150, 0);
                                    i3 = C0654f.m1470b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                }
                                Paint a = C0851y.m431a(i4, Paint.Style.FILL);
                                Paint a2 = C0851y.m431a(i3, Paint.Style.STROKE);
                                int i6 = 4;
                                if (z3) {
                                    i6 = 1;
                                }
                                f1531cT.m4122a(f2 - this.f1474bO, f3 + f4, (f2 - this.f1474bO) + (f5 * mo2867a_()), f3 + f4 + i6);
                                u.f5514bw.mo179a(f1531cT, a);
                                f1531cT.m4122a(f2 - this.f1474bO, f3 + f4, (f2 - this.f1474bO) + f5, f3 + f4 + i6);
                                u.f5514bw.mo179a(f1531cT, a2);
                            }
                        }
                        if (bK >= 0) {
                            int bL = mo2502bL();
                            float f7 = f5;
                            if (bL > 10) {
                                f7 += 20.0f;
                            }
                            float f8 = f2 - (f7 / 2.0f);
                            float f9 = (int) ((f7 / bL) + 0.5f);
                            float f10 = f9 - 2.0f;
                            for (int i7 = 1; i7 <= bL; i7++) {
                                float f11 = f8 + ((i7 - 1) * f9);
                                f1531cT.m4122a(f11, f3 + f4 + 3.0f, f11 + f10, f3 + f4 + 3.0f + 3.0f);
                                if (bK >= i7) {
                                    u.f5514bw.mo179a(f1531cT, C0851y.m432a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.FILL));
                                }
                                u.f5514bw.mo179a(f1531cT, C0851y.m432a(110, 0, 0, 210, Paint.Style.STROKE));
                            }
                            f6 = 3.0f + 5.0f;
                        }
                    }
                    if (mo2486bI() >= 0.0f) {
                        int i8 = 2 + 1;
                        boolean bJ = mo2485bJ();
                        f1531cT.m4122a(f2 - this.f1474bO, f3 + f4 + i8 + f6, (f2 - this.f1474bO) + (f5 * mo2486bI()), f3 + f4 + i8 + 2 + f6);
                        if (bJ) {
                            i = C0654f.m1470b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
                        } else {
                            i = C0654f.m1470b(200, 23, 179, 207);
                        }
                        u.f5514bw.mo179a(f1531cT, C0851y.m431a(i, Paint.Style.FILL));
                        f1531cT.m4122a(f2 - this.f1474bO, f3 + f4 + i8 + f6, (f2 - this.f1474bO) + f5, f3 + f4 + i8 + 2 + f6);
                        if (bJ) {
                            i2 = C0654f.m1470b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
                        } else {
                            i2 = C0654f.m1470b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
                        }
                        u.f5514bw.mo179a(f1531cT, C0851y.m431a(i2, Paint.Style.STROKE));
                        f6 += 2;
                        i5 = 4;
                    }
                    if (mo2564bH() >= 0.0f) {
                        int i9 = i5 + 1;
                        f1531cT.m4122a(f2 - this.f1474bO, f3 + f4 + i9 + f6, (f2 - this.f1474bO) + (f5 * mo2564bH()), f3 + f4 + i9 + i5 + f6);
                        u.f5514bw.mo179a(f1531cT, C0851y.m432a(200, 0, 0, 150, Paint.Style.FILL));
                        f1531cT.m4122a(f2 - this.f1474bO, f3 + f4 + i9 + f6, (f2 - this.f1474bO) + f5, f3 + f4 + i9 + i5 + f6);
                        u.f5514bw.mo179a(f1531cT, C0851y.m432a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.STROKE));
                        float f12 = f6 + i5;
                    }
                    if (u.f5574cE < 1.0f) {
                        u.f5514bw.mo124k();
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: d */
    public void mo395d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: o */
    public void mo390o(float f) {
        if (!this.f1459bz && this.f1501cp == null && this.f1494ci) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (this.f1461bB == u.f5493bb || u.f5518bA.m1664m(this)) {
                if (u.f5516by.showUnitWaypoints && u.f5599dd <= 40) {
                    u.f5599dd++;
                    mo2432N();
                }
                mo2618bM();
            }
            if (C0851y.m429a(this)) {
                mo2655bN();
            }
        }
    }

    /* renamed from: bM */
    public void mo2618bM() {
    }

    /* renamed from: N */
    public void mo2432N() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0270an anVar = null;
        C0270an anVar2 = null;
        if (this instanceof AbstractC0515r) {
            AbstractC0515r rVar = (AbstractC0515r) this;
            int at = rVar.m2233at();
            float f = this.f5842dH;
            float f2 = this.f5843dI;
            for (int i = 0; i < at; i++) {
                C0270an k = rVar.m2157k(i);
                if (k != null) {
                    if (AbstractC0789l.m697al()) {
                        f1532cU.m4192a(2.0f);
                    } else {
                        f1532cU.m4192a(0.0f);
                    }
                    if (k.m3243d() == EnumC0271ao.attack) {
                        f1532cU.m4169b(Color.m4213a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (k.m3243d() == EnumC0271ao.attackMove) {
                        f1532cU.m4169b(Color.m4213a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (k.m3243d() == EnumC0271ao.build) {
                        f1532cU.m4169b(Color.m4213a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.m3243d() == EnumC0271ao.repair) {
                        f1532cU.m4169b(Color.m4213a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.m3243d() == EnumC0271ao.loadInto || k.m3243d() == EnumC0271ao.loadUp) {
                        f1532cU.m4169b(Color.m4213a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (k.m3243d() == EnumC0271ao.reclaim) {
                        f1532cU.m4169b(Color.m4213a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (k.m3243d() == EnumC0271ao.guard || k.m3243d() == EnumC0271ao.guardAt) {
                        f1532cU.m4169b(Color.m4213a(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (k.m3243d() == EnumC0271ao.patrol) {
                        f1532cU.m4169b(Color.m4213a(160, 0, 210, 210));
                        if (anVar == null) {
                            anVar = k;
                        } else {
                            anVar2 = k;
                        }
                    } else {
                        f1532cU.m4169b(Color.m4213a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float g = k.m3237g();
                    float h = k.m3235h();
                    AbstractC0210af i2 = k.m3233i();
                    if (i2 != null && k.m3239f() && !i2.mo2643bw() && !i2.m3327b(u.f5493bb)) {
                        float d = C0654f.m1446d(f, f2, g, h);
                        g = f + (C0654f.m1421i(d) * 400.0f);
                        h = f2 + (C0654f.m1425h(d) * 400.0f);
                    }
                    u.f5514bw.mo197a(f - u.f5547cd, f2 - u.f5548ce, g - u.f5547cd, h - u.f5548ce, f1532cU);
                    if (0 != 0) {
                        float b = C0654f.m1474b(f, f2, g, h);
                        float d2 = C0654f.m1446d(f, f2, g, h);
                        float f3 = u.f5518bA.f4366aM * b;
                        float i3 = f + (C0654f.m1421i(d2) * f3);
                        float h2 = f2 + (C0654f.m1425h(d2) * f3);
                        f1531cT.m4122a(i3 - 1.0f, h2 - 1.0f, i3 + 1.0f, h2 + 1.0f);
                        f1531cT.m4123a(-u.f5547cd, -u.f5548ce);
                        u.f5514bw.mo179a(f1531cT, f1532cU);
                    }
                    f = g;
                    f2 = h;
                }
            }
        }
        if (!(anVar == null || anVar2 == null || anVar == anVar2)) {
            f1532cU.m4169b(Color.m4213a(50, 0, 210, 210));
            u.f5514bw.mo197a(anVar2.m3237g() - u.f5547cd, anVar2.m3235h() - u.f5548ce, anVar.m3237g() - u.f5547cd, anVar.m3235h() - u.f5548ce, f1532cU);
        }
    }

    /* renamed from: bN */
    public void mo2655bN() {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        Paint paint;
        boolean z = false;
        if (this.f1497cl != 0.0f) {
            this.f1497cl = C0654f.m1522a(this.f1497cl, f);
            if (this.f1497cl % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.f1494ci || z) {
            AbstractC0789l u = AbstractC0789l.m638u();
            float f2 = this.f5842dH - u.f5547cd;
            float f3 = (this.f5843dI - u.f5548ce) - this.f5844dJ;
            if (u.f5493bb == this.f1461bB) {
                if (this.f1475bP < 8.0f) {
                    paint = f1511cz;
                } else {
                    paint = f1512cA;
                }
            } else if (u.f5493bb.m3474c(this.f1461bB)) {
                paint = f1514cC;
            } else if (this.f1461bB == null || !u.f5527bJ.m1940h()) {
                paint = f1516cE;
            } else {
                f1510cy.m4169b(AbstractC0171m.m3438m(this.f1461bB.f1245o));
                paint = f1510cy;
            }
            if (z) {
                paint = f1515cD;
            }
            if (mo2643bw()) {
                if (paint == f1512cA) {
                    paint = f1513cB;
                }
                Rect bQ = mo2860bQ();
                if (bQ != null) {
                    f1531cT.m4121a(bQ);
                    f1531cT.f232b *= u.f5511bt.f736l;
                    f1531cT.f234d *= u.f5511bt.f736l;
                    f1531cT.f231a *= u.f5511bt.f735k;
                    f1531cT.f233c *= u.f5511bt.f735k;
                    float cJ = mo2570cJ();
                    f1531cT.m4123a(-(mo2572cH() - u.f5511bt.f737m), -(mo2571cI() - u.f5511bt.f738n));
                    C0654f.m1503a(f1531cT, cJ);
                    f1531cT.m4123a(f2, f3);
                    u.f5514bw.mo197a(f1531cT.f231a - 11.0f, f1531cT.f232b, f1531cT.f233c + 11.0f, f1531cT.f232b, paint);
                    u.f5514bw.mo197a(f1531cT.f231a - 11.0f, f1531cT.f234d, f1531cT.f233c + 11.0f, f1531cT.f234d, paint);
                    u.f5514bw.mo197a(f1531cT.f231a, f1531cT.f232b - 11.0f, f1531cT.f231a, f1531cT.f234d + 11.0f, paint);
                    u.f5514bw.mo197a(f1531cT.f233c, f1531cT.f232b - 11.0f, f1531cT.f233c, f1531cT.f234d + 11.0f, paint);
                    return;
                }
                return;
            }
            float r = this.f1475bP + u.f5518bA.m1654r(this);
            if (u.m732a(f2, f3, r)) {
                u.f5514bw.mo195a(f2, f3, r, paint);
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return true;
    }

    /* renamed from: bO */
    public Rect mo2645bO() {
        return f1536cY;
    }

    /* renamed from: bP */
    public Rect mo2644bP() {
        return f1536cY;
    }

    /* renamed from: bQ */
    public Rect mo2860bQ() {
        return mo2645bO();
    }

    /* renamed from: v */
    public C0748e mo2355v() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: f */
    public boolean mo391f(float f) {
        Paint paint;
        C0748e v = mo2355v();
        if (v == null) {
            return false;
        }
        if (this.f1459bz) {
            return true;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5514bw.mo124k();
        float f2 = (int) (this.f5842dH - u.f5547cd);
        float f3 = (int) (this.f5843dI - u.f5548ce);
        float f4 = f2 * u.f5574cE;
        float f5 = f3 * u.f5574cE;
        if (this.f1494ci) {
            paint = f1448bo;
        } else {
            paint = f1447bn;
        }
        u.f5514bw.mo175a(v, f4, f5, paint);
        u.f5514bw.mo125j();
        u.m750K();
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        if (!lVar.f5565cv.m4116b(this.f5842dH, this.f5843dI) || this.f1501cp != null) {
            return false;
        }
        if ((this.f1503cr == null || (!this.f1503cr.f2297I && !this.f1503cr.f2291C)) && m3327b(lVar.f5493bb)) {
            return true;
        }
        return false;
    }

    /* renamed from: b_ */
    public boolean mo2855b_() {
        return true;
    }

    /* renamed from: bR */
    public final boolean m3320bR() {
        return m3327b(AbstractC0789l.m638u().f5493bb);
    }

    /* renamed from: b */
    public boolean m3327b(AbstractC0171m mVar) {
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        if ((this.f1461bB == mVar && this.f1502cq == null) || !bVar.f752A || mVar.f1262C == null) {
            return true;
        }
        bVar.m3703a(this.f5842dH, this.f5843dI);
        int i = bVar.f764M;
        int i2 = bVar.f765N;
        if (!bVar.m3661c(i, i2) || mVar.f1262C[i][i2] < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: bS */
    public boolean mo2859bS() {
        return true;
    }

    /* renamed from: c_ */
    public void mo2361c_() {
        if (this.f1459bz) {
            this.f1458by = false;
        } else {
            this.f1458by = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        C0573e b;
        if (!this.f1459bz) {
            if (this.f1486ca > 0.0f) {
                if (this.f1486ca > this.f1485bZ * 2.0f) {
                    this.f1486ca = this.f1485bZ * 2.0f;
                }
                this.f1486ca = C0654f.m1522a(this.f1486ca, f);
            }
            if (this.f1484bY < this.f1485bZ * 0.33f && this.f5844dJ > -1.0f) {
                AbstractC0789l u = AbstractC0789l.m638u();
                this.f1528cQ += f;
                this.f1529cR += f;
                this.f1530cS += f;
                if (this.f1528cQ > 10.0f && this.f1529cR < 300.0f && !mo2841cT()) {
                    this.f1528cQ = 0.0f;
                    if (this.f5839dE && u.f5580cK && (b = u.f5517bz.m1989b(this.f5842dH, this.f5843dI, this.f5844dJ, EnumC0572d.custom, false, EnumC0576h.verylow)) != null) {
                        C0574f.m1968b(b, true);
                        b.f3862J = this.f5842dH;
                        b.f3863K = this.f5843dI;
                        b.f3864L = this.f5844dJ;
                        b.f3869Q += C0654f.m1458c(-0.1f, 0.1f) + this.f1467bH;
                        b.f3870R += C0654f.m1458c(-0.1f, 0.1f) + this.f1468bI;
                        b.f3862J += C0654f.m1458c(-4.0f, 4.0f);
                        b.f3863K += C0654f.m1458c(-4.0f, 4.0f);
                    }
                }
                if (this.f1530cS > 30.0f && this.f1529cR < 600.0f && !mo2840cU()) {
                    this.f1530cS = 0.0f;
                    u.f5517bz.m2018a();
                    C0573e b2 = u.f5517bz.m1989b(this.f5842dH, this.f5843dI, this.f5844dJ, EnumC0572d.custom, false, EnumC0576h.verylow);
                    if (b2 != null) {
                        C0574f.m1971a(b2, true);
                        b2.f3862J = this.f5842dH;
                        b2.f3863K = this.f5843dI;
                        b2.f3864L = this.f5844dJ;
                        b2.f3869Q += C0654f.m1458c(-0.1f, 0.1f);
                        b2.f3870R += C0654f.m1458c(-0.1f, 0.1f);
                        b2.f3862J += C0654f.m1458c(-4.0f, 4.0f);
                        b2.f3863K += C0654f.m1458c(-4.0f, 4.0f);
                    }
                }
            } else if (this.f1529cR != 0.0f) {
                this.f1529cR = 0.0f;
            }
            if (this.f1484bY <= 0.0f) {
                mo2858bT();
            }
        }
    }

    /* renamed from: b */
    public float m3326b(AbstractC0210af afVar, float f, C0163f fVar) {
        float f2 = f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (fVar != null) {
            f3 = fVar.f978ak;
            f4 = fVar.f979al;
            f5 = fVar.f980am;
        }
        if (this.f1487cb < this.f1490ce) {
            float f6 = f2 * f3;
            if (this.f1490ce - this.f1487cb > f6) {
                this.f1487cb += f6;
                f2 -= f6 * f4;
            } else {
                this.f1487cb = this.f1490ce;
                f2 -= f6 * f4;
            }
        }
        if (f2 <= 0.0f || this.f1484bY >= this.f1485bZ) {
            return 0.0f;
        }
        float f7 = f2 * f5;
        float f8 = this.f1485bZ - this.f1484bY;
        if (f8 > f7) {
            this.f1484bY += f7;
            return 0.0f;
        }
        this.f1484bY = this.f1485bZ;
        float f9 = f2 - f8;
        return 0.0f;
    }

    /* renamed from: J */
    public boolean mo2365J() {
        return false;
    }

    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1477bR < 1.0f) {
            f *= 1.75f;
        }
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (fVar != null) {
            f2 = fVar.f978ak;
            f3 = fVar.f979al;
            f4 = fVar.f980am;
        }
        float f5 = f;
        float f6 = 0.0f;
        if (this.f1489cd == 0.0f && this.f1487cb > 0.0f) {
            float f7 = f5 * f2;
            if (this.f1487cb < f7) {
                f5 -= this.f1487cb * f3;
                f6 = 0.0f + this.f1487cb;
                this.f1488cc += this.f1487cb;
                this.f1487cb = 0.0f;
            } else {
                this.f1487cb -= f7;
                this.f1488cc += f7;
                f6 = 0.0f + f7;
                f5 -= f5 * f3;
            }
        }
        if (f5 > 0.0f) {
            float f8 = f5 * f4;
            if (this.f1484bY < f8) {
                f5 -= this.f1484bY;
                float f9 = f6 + this.f1484bY;
                this.f1484bY = 0.0f;
            } else {
                this.f1484bY -= f8;
                float f10 = f6 + f8;
                f5 -= f8;
            }
        }
        this.f1436bd = u.f5499bh;
        if (afVar != null) {
            this.f1437be = afVar;
        } else {
            this.f1437be = null;
        }
        mo2858bT();
        return f5;
    }

    /* renamed from: p */
    public AbstractC0210af m3292p(float f) {
        if (AbstractC0789l.m638u().f5499bh - (f * 1000.0f) < this.f1436bd) {
            return this.f1437be;
        }
        return null;
    }

    /* renamed from: bT */
    public void mo2858bT() {
        if (!this.f1459bz && this.f1484bY <= 0.0f) {
            mo2195bq();
        }
    }

    /* renamed from: n */
    public void mo2536n() {
    }

    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        return false;
    }

    /* renamed from: bp */
    public void mo2196bp() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5518bA.m1666l(this);
        AbstractC0171m.m3508a(this);
        if (f1442bj.remove(this)) {
        }
        this.f1459bz = true;
        this.f1460bA = u.f5499bh;
        if (this.f1499cn != null) {
            int bg = mo2205bg();
            for (int i = 0; i < bg; i++) {
                this.f1499cn[i].f1570j = null;
            }
        }
        u.f5528bK.m2458a(this);
    }

    /* renamed from: bU */
    public void m3319bU() {
        mo2196bp();
        mo405a();
    }

    /* renamed from: bq */
    public void mo2195bq() {
        mo2196bp();
        if (!mo2359e()) {
            mo405a();
        }
    }

    /* renamed from: a */
    public boolean m3337a(RectF rectF) {
        if (this.f5842dH + this.f1474bO <= rectF.f231a || this.f5842dH - this.f1474bO >= rectF.f233c || this.f5843dI + this.f1474bO <= rectF.f232b || this.f5843dI - this.f1474bO >= rectF.f234d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m3312c(float f, float f2, float f3) {
        float a = C0654f.m1520a(this.f5842dH, this.f5843dI, f, f2);
        float f4 = this.f1474bO + f3;
        if (a < f4 * f4) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m3290r(AbstractC0210af afVar) {
        float a = C0654f.m1520a(this.f5842dH, this.f5843dI, afVar.f5842dH, afVar.f5843dI);
        float f = this.f1474bO + afVar.f1474bO;
        if (a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final void m3342O(int i) {
        AbstractC0171m n = AbstractC0171m.m3436n(i);
        if (n == null) {
            throw new C0154f("Could not find team with id: " + i);
        }
        mo2854c(n);
    }

    /* renamed from: c */
    public void mo2854c(AbstractC0171m mVar) {
        if (this.f1461bB != mVar) {
            if (mVar == null) {
                throw new RuntimeException("Could not set team to null");
            }
            if (this.f1461bB != null) {
                AbstractC0171m.m3488b(this);
                this.f1461bB.mo3463d(this);
            }
            mo2305a(mVar);
            AbstractC0171m.m3473c(this);
            if (mVar != AbstractC0171m.f1236g) {
                mo2188c(false);
            }
        }
    }

    /* renamed from: a */
    public void mo2305a(AbstractC0171m mVar) {
        if (mVar == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.f1461bB = mVar;
    }

    /* renamed from: P */
    public final void m3341P(int i) {
        this.f1461bB = AbstractC0171m.m3436n(i);
        if (this.f1461bB == null) {
            throw new C0154f("Could not find team with id: " + i);
        }
        mo2305a(this.f1461bB);
    }

    /* renamed from: M */
    public ArrayList mo2390M() {
        return f1537cZ;
    }

    /* renamed from: T */
    public int mo2329T() {
        return 1;
    }

    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
    }

    /* renamed from: a */
    public void mo2429a(AbstractC0197s sVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        mo2389a(sVar, z);
    }

    /* renamed from: b */
    public void mo2619b(AbstractC0197s sVar, boolean z) {
    }

    /* renamed from: b */
    public void mo2620b(AbstractC0197s sVar) {
    }

    /* renamed from: a */
    public AbstractC0197s mo2880a(C0181c cVar) {
        ArrayList M = mo2390M();
        int size = M.size();
        for (int i = 0; i < size; i++) {
            AbstractC0197s sVar = (AbstractC0197s) M.get(i);
            if (sVar.m3379d(cVar)) {
                return sVar;
            }
        }
        return null;
    }

    /* renamed from: bV */
    public boolean mo2654bV() {
        if (mo2643bw()) {
            return AbstractC0197s.m3380c(mo2546bX());
        }
        return false;
    }

    /* renamed from: bW */
    public boolean mo2857bW() {
        return false;
    }

    /* renamed from: bX */
    public C0181c mo2546bX() {
        return AbstractC0197s.f1356h;
    }

    /* renamed from: bY */
    public float mo2856bY() {
        return -1.0f;
    }

    /* renamed from: bZ */
    public boolean m3318bZ() {
        return false;
    }

    /* renamed from: a */
    public void mo2697a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: ca */
    public C0181c mo2499ca() {
        return AbstractC0197s.f1356h;
    }

    /* renamed from: e */
    public AbstractC0197s mo2616e(AbstractC0268al alVar) {
        return null;
    }

    /* renamed from: cb */
    public final int m3305cb() {
        int i = 0;
        Iterator it = mo2390M().iterator();
        while (it.hasNext()) {
            AbstractC0197s sVar = (AbstractC0197s) it.next();
            if (sVar.mo2381a(this) || sVar.mo3361o()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m3311c(AbstractC0210af afVar, boolean z) {
        AbstractC0210af afVar2 = afVar.f1501cp;
        AbstractC0515r rVar = afVar.f1502cq;
        afVar.f1501cp = null;
        afVar.f1502cq = null;
        boolean d = mo2497d(afVar, z);
        afVar.f1501cp = afVar2;
        afVar.f1502cq = rVar;
        return d;
    }

    /* renamed from: d */
    public boolean mo2497d(AbstractC0210af afVar, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo2495e(AbstractC0210af afVar, boolean z) {
        return false;
    }

    /* renamed from: cc */
    public boolean mo2498cc() {
        return false;
    }

    /* renamed from: cd */
    public boolean mo2836cd() {
        return mo2357i();
    }

    /* renamed from: ce */
    public boolean mo2835ce() {
        return false;
    }

    /* renamed from: cf */
    public boolean mo2384cf() {
        return false;
    }

    /* renamed from: O */
    public boolean mo2364O() {
        return false;
    }

    /* renamed from: cg */
    public int mo2519cg() {
        return 1;
    }

    /* renamed from: y */
    public int mo2397y() {
        return 85;
    }

    /* renamed from: f */
    public float mo2402f(AbstractC0268al alVar) {
        return alVar.mo2796a(this) + mo2397y();
    }

    /* renamed from: s */
    public int mo2400s(AbstractC0210af afVar) {
        return mo2397y() + afVar.mo1606r().mo2796a(this);
    }

    /* renamed from: t */
    public int mo2399t(AbstractC0210af afVar) {
        return mo2397y() + afVar.mo1606r().mo2796a(this);
    }

    /* renamed from: u */
    public boolean mo2808u(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: v */
    public boolean mo2807v(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: b */
    public float mo2426b(AbstractC0210af afVar) {
        return 1.0f;
    }

    /* renamed from: c */
    public float mo2425c(AbstractC0210af afVar) {
        return 0.2f;
    }

    /* renamed from: ch */
    public float mo2834ch() {
        return 1.0f;
    }

    /* renamed from: ci */
    public float mo2623ci() {
        return 0.0f;
    }

    /* renamed from: cj */
    public C0354d mo2833cj() {
        float ci = mo2623ci();
        if (ci == 0.0f) {
            return C0354d.f2376a;
        }
        C0354d dVar = new C0354d();
        dVar.m2985b(C0345a.f2355l, ci);
        return dVar;
    }

    /* renamed from: ck */
    public C0354d mo2832ck() {
        return C0354d.f2376a;
    }

    /* renamed from: cl */
    public String m3304cl() {
        return mo1606r().mo2754i() + "(id:" + this.f5835dA + ")";
    }

    /* renamed from: cm */
    public String m3303cm() {
        return mo1606r().mo2754i() + "(id:" + this.f5835dA + ", hp:" + this.f1484bY + ", dead:" + this.f1459bz + ", deleted:" + this.f5837dC + " tags:" + mo2846cM() + ")";
    }

    /* renamed from: cn */
    public float mo2831cn() {
        return 1.0f;
    }

    /* renamed from: co */
    public RectF m3302co() {
        AbstractC0789l u = AbstractC0789l.m638u();
        float cn = mo2831cn();
        f1540dc.m4122a((this.f5842dH - (this.f3754dN * cn)) - u.f5547cd, (this.f5843dI - (this.f3755dO * cn)) - u.f5548ce, (this.f5842dH + (this.f3754dN * cn)) - u.f5547cd, (this.f5843dI + (this.f3755dO * cn)) - u.f5548ce);
        return f1540dc;
    }

    /* renamed from: cp */
    public RectF mo2637cp() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1540dc.m4122a((this.f5842dH - this.f3754dN) - u.f5547cd, (this.f5843dI - this.f3755dO) - u.f5548ce, (this.f5842dH + this.f3754dN) - u.f5547cd, (this.f5843dI + this.f3755dO) - u.f5548ce);
        return f1540dc;
    }

    /* renamed from: cq */
    public boolean mo2830cq() {
        return false;
    }

    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        f1542de.m4136a(0, 0, 0 + this.f3752dL, 0 + this.f3753dM);
        return f1542de;
    }

    /* renamed from: a */
    public Rect m3329a(boolean z, int i) {
        int i2 = 0 + (i * this.f3752dL);
        f1542de.m4136a(i2, 0, i2 + this.f3752dL, 0 + this.f3753dM);
        return f1542de;
    }

    /* renamed from: a */
    public Rect m3328a(boolean z, int i, int i2) {
        int i3 = i * this.f3752dL;
        int i4 = i2 * this.f3753dM;
        f1542de.m4136a(i3, i4, i3 + this.f3752dL, i4 + this.f3753dM);
        return f1542de;
    }

    /* renamed from: a */
    public boolean mo3334a(AbstractC0210af afVar, float f) {
        return false;
    }

    /* renamed from: a_ */
    public void mo2696a_(String str) {
    }

    /* renamed from: cr */
    public final boolean m3301cr() {
        if (!m3299ct() || this.f5844dJ > 2.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: cs */
    public boolean m3300cs() {
        return C0851y.m436a(this.f5842dH, this.f5843dI);
    }

    /* renamed from: ct */
    public boolean m3299ct() {
        return C0851y.m414b(this.f5842dH, this.f5843dI);
    }

    /* renamed from: cu */
    public boolean m3298cu() {
        return C0851y.m409c(this.f5842dH, this.f5843dI);
    }

    /* renamed from: br */
    public int mo2194br() {
        return (((0 * 31) + ((int) mo2395bB())) * 31) + ((int) this.f1485bZ);
    }

    /* renamed from: cv */
    public C0363g m3297cv() {
        return mo1606r().mo2764d(mo2329T());
    }

    /* renamed from: cw */
    public C0363g mo2829cw() {
        return null;
    }

    /* renamed from: a */
    public PointF m3340a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.f1498cm) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF m = mo2151m(f6);
                f6 = C0654f.m1474b(f, f2, m.f224a, m.f225b) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF m2 = mo2151m(f6);
        float a = C0654f.m1520a(f, f2, m2.f224a, m2.f225b);
        if (f5 >= 0.0f && f5 * f5 < a) {
            float d = C0654f.m1446d(f, f2, m2.f224a, m2.f225b);
            m2.f224a = f + (C0654f.m1421i(d) * f5);
            m2.f225b = f2 + (C0654f.m1425h(d) * f5);
        }
        f1543df.m4140a(m2);
        return f1543df;
    }

    /* renamed from: m */
    PointF mo2151m(float f) {
        f1544dg.m4141a(this.f5842dH + (this.f1467bH * f), this.f5843dI + (this.f1468bI * f));
        return f1544dg;
    }

    /* renamed from: o */
    public boolean mo2535o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo2534p() {
        return false;
    }

    /* renamed from: d */
    public void mo2825d(AbstractC0171m mVar) {
        if (mo2534p()) {
            mo2305a(AbstractC0171m.f1236g);
        } else {
            mo2305a(mVar);
        }
    }

    /* renamed from: cx */
    public void mo2828cx() {
    }

    /* renamed from: cy */
    public void mo2827cy() {
    }

    /* renamed from: g */
    public float mo2537g() {
        return 0.0f;
    }

    /* renamed from: cz */
    public int mo2826cz() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: cA */
    public C0365i mo2853cA() {
        return null;
    }

    /* renamed from: w */
    public boolean mo2398w(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: x */
    public boolean mo2806x(AbstractC0210af afVar) {
        return mo2398w(afVar);
    }

    /* renamed from: cB */
    public int mo2852cB() {
        return 500;
    }

    /* renamed from: c */
    public boolean m3309c(AbstractC0515r rVar) {
        int cz = mo2826cz();
        if (cz >= Integer.MAX_VALUE || m3295d(rVar) < cz) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int m3295d(AbstractC0515r rVar) {
        C0270an ap;
        int i = 0;
        AbstractC0171m mVar = rVar.f1461bB;
        AbstractC0210af[] a = f1442bj.m456a();
        int size = f1442bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f1461bB == mVar && (afVar instanceof AbstractC0515r) && (ap = ((AbstractC0515r) afVar).m2237ap()) != null && ap.m3243d() == EnumC0271ao.reclaim && ap.f1652h == this && afVar != rVar) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m3293e(AbstractC0515r rVar) {
        C0270an ap;
        int i = 0;
        AbstractC0171m mVar = rVar.f1461bB;
        AbstractC0210af[] a = f1442bj.m456a();
        int size = f1442bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f1461bB == mVar && (afVar instanceof AbstractC0515r) && (ap = ((AbstractC0515r) afVar).m2237ap()) != null && ap.m3243d() == EnumC0271ao.repair && ap.f1652h == this && afVar != rVar) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bg */
    public int mo2205bg() {
        return 1;
    }

    /* renamed from: o_ */
    public boolean mo1607o_() {
        return false;
    }

    /* renamed from: cC */
    public boolean mo2851cC() {
        return mo1607o_() || this.f1477bR < 1.0f || this.f1461bB == AbstractC0171m.f1235f;
    }

    /* renamed from: t */
    public boolean mo1605t() {
        return false;
    }

    /* renamed from: cD */
    public boolean mo2850cD() {
        return mo1605t();
    }

    /* renamed from: cE */
    public boolean mo2849cE() {
        return false;
    }

    /* renamed from: d */
    public boolean mo2360d(AbstractC0210af afVar) {
        return true;
    }

    /* renamed from: e */
    public void m3294e(AbstractC0171m mVar) {
        if (this.f1545dh == null || this.f1545dh.length != AbstractC0171m.f1230a) {
            this.f1545dh = new C0211ag[AbstractC0171m.f1230a];
            for (int i = 0; i < this.f1545dh.length; i++) {
                this.f1545dh[i] = new C0211ag();
            }
        }
        C0211ag agVar = this.f1545dh[mVar.f1239i];
        if (this.f1459bz) {
            if (agVar.f1549a && m3327b(mVar)) {
                agVar.f1549a = false;
            }
        } else if (m3327b(mVar)) {
            agVar.f1549a = true;
            agVar.f1550b = mo2329T();
        }
    }

    /* renamed from: cF */
    public void m3308cF() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5493bb != null && this.f1461bB != u.f5493bb && u.f5493bb.f1239i >= 0 && u.f5493bb.f1239i < AbstractC0171m.f1230a) {
            C0211ag agVar = this.f1545dh[u.f5493bb.f1239i];
            if (agVar.f1551c != null && agVar.f1551c.f3762c) {
                agVar.f1551c = null;
            }
            if (agVar.f1551c == null && agVar.f1549a && !m3327b(u.f5493bb)) {
                C0569a aVar = new C0569a();
                agVar.f1551c = aVar;
                aVar.f3763d = mo1606r();
                aVar.f3766g = this.f5842dH;
                aVar.f3767h = this.f5843dI;
                aVar.f3773n = false;
                aVar.f3764e = this.f1461bB;
                aVar.f3765f = agVar.f1550b;
                aVar.f3769j = u.f5493bb;
                aVar.f3780u = mo2855b_();
                aVar.f3781v = this;
            }
        }
    }

    /* renamed from: cG */
    public PointF mo2848cG() {
        f1546di.m4141a(0.0f, 0.0f);
        return f1546di;
    }

    /* renamed from: cH */
    public float mo2572cH() {
        return AbstractC0789l.m638u().f5511bt.f737m;
    }

    /* renamed from: cI */
    public float mo2571cI() {
        return AbstractC0789l.m638u().f5511bt.f738n;
    }

    /* renamed from: cJ */
    public float mo2570cJ() {
        AbstractC0789l u = AbstractC0789l.m638u();
        return u.f5511bt.f737m + 2 + u.f5518bA.m1654r(this);
    }

    /* renamed from: a */
    public Point m3336a(C0148b bVar, Point point) {
        point.f221a = (int) (((this.f5842dH - mo2572cH()) + 1.0f) * bVar.f739o);
        point.f222b = (int) (((this.f5843dI - mo2571cI()) + 1.0f) * bVar.f740p);
        return point;
    }

    /* renamed from: a */
    public RectF m3335a(C0148b bVar, RectF rectF) {
        bVar.m3699a((int) (((this.f5842dH - mo2572cH()) + 1.0f) * bVar.f739o), (int) (((this.f5843dI - mo2571cI()) + 1.0f) * bVar.f740p));
        float f = bVar.f764M;
        float f2 = bVar.f765N;
        Rect bP = mo2644bP();
        rectF.m4122a(f + (bP.f227a * bVar.f735k), f2 + (bP.f228b * bVar.f736l), f + ((bP.f229c + 1) * bVar.f735k), f2 + ((bP.f230d + 1) * bVar.f736l));
        return rectF;
    }

    /* renamed from: cK */
    public void mo2847cK() {
    }

    /* renamed from: cL */
    public boolean mo2520cL() {
        return false;
    }

    /* renamed from: q */
    public boolean mo2533q() {
        return false;
    }

    /* renamed from: cM */
    public C0365i mo2846cM() {
        return null;
    }

    /* renamed from: cN */
    public C0354d mo1608cN() {
        return this.f1547dj;
    }

    /* renamed from: a */
    public double m3332a(C0345a aVar) {
        return this.f1547dj.m2999a(aVar);
    }

    /* renamed from: cO */
    public C0340c m3307cO() {
        return this.f1548dk;
    }

    /* renamed from: cP */
    public C0365i mo2845cP() {
        return null;
    }

    /* renamed from: aY */
    public float mo2255aY() {
        return 0.0f;
    }

    /* renamed from: cQ */
    public void mo2844cQ() {
    }

    /* renamed from: cR */
    public void mo2843cR() {
    }

    /* renamed from: cS */
    public boolean mo2842cS() {
        return false;
    }

    /* renamed from: cT */
    public boolean mo2841cT() {
        return mo2862bC();
    }

    /* renamed from: cU */
    public boolean mo2840cU() {
        return mo2862bC();
    }

    /* renamed from: cV */
    public final C0336i m3306cV() {
        return this.f1503cr;
    }

    public String toString() {
        return "unit(id=" + this.f5835dA + ",type=" + mo1606r().mo2754i() + ")";
    }

    /* renamed from: q */
    public void m3291q(float f) {
        if (f >= 1.0f) {
            if (!(this.f1477bR >= 1.0f)) {
                AbstractC0171m.m3488b(this);
                this.f1477bR = 1.0f;
                AbstractC0171m.m3473c(this);
                return;
            }
            return;
        }
        if (this.f1477bR >= 1.0f) {
            AbstractC0171m.m3488b(this);
            this.f1477bR = f;
            AbstractC0171m.m3473c(this);
            return;
        }
        this.f1477bR = f;
    }

    /* renamed from: a */
    public void mo2875a(EnumC0306ab abVar) {
    }

    /* renamed from: h */
    public void mo2171h(float f) {
        this.f1471bL = f;
    }

    /* renamed from: cW */
    public int mo2617cW() {
        return 0;
    }

    /* renamed from: g */
    public C0835m mo2814g(boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean mo2471a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public void mo2188c(boolean z) {
    }

    /* renamed from: cX */
    public float mo2839cX() {
        return this.f1474bO;
    }
}
