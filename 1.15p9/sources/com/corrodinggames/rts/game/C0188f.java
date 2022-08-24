package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0619u;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0382aw;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.EnumC0383ax;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0668az;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0878m;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class C0188f extends AbstractC0668az {

    /* renamed from: g */
    public C0189g f980g;

    /* renamed from: h */
    public float f981h;

    /* renamed from: i */
    public float f982i;

    /* renamed from: j */
    public Unit f983j;

    /* renamed from: k */
    public short f984k;

    /* renamed from: l */
    public Unit f985l;

    /* renamed from: m */
    public boolean f986m;

    /* renamed from: n */
    public float f987n;

    /* renamed from: o */
    public float f988o;

    /* renamed from: p */
    public float f989p;

    /* renamed from: q */
    public C0188f f990q;

    /* renamed from: r */
    public float f991r;

    /* renamed from: s */
    public float f992s;

    /* renamed from: t */
    public float f993t;

    /* renamed from: u */
    public float f994u;

    /* renamed from: v */
    public float f995v;

    /* renamed from: w */
    public float f996w;

    /* renamed from: x */
    public float f997x;

    /* renamed from: y */
    public float f998y;

    /* renamed from: z */
    public boolean f999z;

    /* renamed from: A */
    public boolean f1000A;

    /* renamed from: B */
    public boolean f1001B;

    /* renamed from: C */
    public boolean f1002C;

    /* renamed from: D */
    public boolean f1003D;

    /* renamed from: E */
    public boolean f1004E;

    /* renamed from: F */
    public float f1005F;

    /* renamed from: G */
    public boolean f1006G;

    /* renamed from: H */
    public float f1007H;

    /* renamed from: I */
    public float f1008I;

    /* renamed from: J */
    public float f1009J;

    /* renamed from: K */
    public float f1010K;

    /* renamed from: L */
    public float f1011L;

    /* renamed from: M */
    public boolean f1012M;

    /* renamed from: N */
    public float f1013N;

    /* renamed from: O */
    public float[] f1014O;

    /* renamed from: P */
    public short f1015P;

    /* renamed from: Q */
    public short f1016Q;

    /* renamed from: R */
    public short f1017R;

    /* renamed from: S */
    public boolean f1018S;

    /* renamed from: T */
    public boolean f1019T;

    /* renamed from: U */
    public float f1020U;

    /* renamed from: V */
    public boolean f1021V;

    /* renamed from: W */
    public float f1022W;

    /* renamed from: X */
    public float f1023X;

    /* renamed from: Y */
    public float f1024Y;

    /* renamed from: Z */
    public float f1025Z;

    /* renamed from: aa */
    public boolean f1026aa;

    /* renamed from: ab */
    public boolean f1027ab;

    /* renamed from: ac */
    public boolean f1028ac;

    /* renamed from: ad */
    public boolean f1029ad;

    /* renamed from: ae */
    public boolean f1030ae;

    /* renamed from: af */
    public boolean f1031af;

    /* renamed from: ag */
    public float f1032ag;

    /* renamed from: ah */
    public float f1033ah;

    /* renamed from: ai */
    public float f1034ai;

    /* renamed from: aj */
    public float f1035aj;

    /* renamed from: ak */
    public float f1036ak;

    /* renamed from: al */
    public float f1037al;

    /* renamed from: am */
    public float f1038am;

    /* renamed from: an */
    public float f1039an;

    /* renamed from: ao */
    public boolean f1040ao;

    /* renamed from: ap */
    public C1101m f1041ap;

    /* renamed from: ar */
    public int f1042ar;

    /* renamed from: as */
    public boolean f1043as;

    /* renamed from: at */
    public boolean f1044at;

    /* renamed from: au */
    public AbstractC1120w f1045au;

    /* renamed from: av */
    public int f1046av;

    /* renamed from: aw */
    public float f1047aw;

    /* renamed from: ax */
    public float f1048ax;

    /* renamed from: ay */
    public float f1049ay;

    /* renamed from: az */
    public float f1050az;

    /* renamed from: aA */
    public float f1051aA;

    /* renamed from: aB */
    public boolean f1052aB;

    /* renamed from: aC */
    public boolean f1053aC;

    /* renamed from: aD */
    public int f1054aD;

    /* renamed from: aE */
    public C0449h f1055aE;

    /* renamed from: aF */
    public float f1056aF;

    /* renamed from: aG */
    public boolean f1057aG;

    /* renamed from: aH */
    public boolean f1058aH;

    /* renamed from: aI */
    public float f1059aI;

    /* renamed from: aJ */
    public float f1060aJ;

    /* renamed from: aK */
    public boolean f1061aK;

    /* renamed from: aL */
    public float f1062aL;

    /* renamed from: aM */
    public boolean f1063aM;

    /* renamed from: aN */
    public float f1064aN;

    /* renamed from: aO */
    public float f1065aO;

    /* renamed from: aP */
    public C0745e f1066aP;

    /* renamed from: aQ */
    public boolean f1067aQ;

    /* renamed from: aR */
    public boolean f1068aR;

    /* renamed from: bn */
    private boolean f1069bn;

    /* renamed from: aS */
    public boolean f1070aS;

    /* renamed from: aT */
    public float f1071aT;

    /* renamed from: aU */
    public boolean f1072aU;

    /* renamed from: aV */
    float f1073aV;

    /* renamed from: aW */
    float f1074aW;

    /* renamed from: aX */
    float f1075aX;

    /* renamed from: aY */
    public boolean f1076aY;

    /* renamed from: aZ */
    public boolean f1077aZ;

    /* renamed from: bi */
    public static final C1112u f1078bi;

    /* renamed from: bj */
    public C0930ag f1079bj;

    /* renamed from: bk */
    public static C0930ag f1080bk;

    /* renamed from: bl */
    public static int f1081bl;

    /* renamed from: a */
    public static final C1101m f1082a = new C1101m();

    /* renamed from: bm */
    private static final C0188f f1083bm = new C0188f(true);

    /* renamed from: b */
    static C0934e f1084b = null;

    /* renamed from: c */
    static C0934e f1085c = null;

    /* renamed from: d */
    static C0934e f1086d = null;

    /* renamed from: e */
    static final Rect f1087e = new Rect();

    /* renamed from: f */
    static final RectF f1088f = new RectF();

    /* renamed from: aq */
    static final int f1089aq = Color.m6127a(255, 255, 255, 255);

    /* renamed from: ba */
    public static final C0930ag f1090ba = new C0930ag();

    /* renamed from: bb */
    public static final Paint f1091bb = new Paint();

    /* renamed from: bd */
    public static final Paint f1092bd = new Paint();

    /* renamed from: be */
    public static final Paint f1093be = new Paint();

    /* renamed from: bf */
    public static final Paint f1094bf = new Paint();

    /* renamed from: bg */
    public static final Paint f1095bg = new Paint();

    /* renamed from: bh */
    public static final Paint f1096bh = new Paint();

    /* renamed from: bc */
    public static final Paint f1097bc = new C0930ag();

    static {
        f1097bc.m6087b(-16777216);
        f1097bc.m6082c(108);
        f1092bd.m6112a(80, 255, 0, 0);
        f1092bd.mo6093a(true);
        f1092bd.m6115a(5.0f);
        f1093be.m6112a(30, 255, 0, 0);
        f1093be.mo6093a(true);
        f1093be.m6115a(8.0f);
        f1094bf.m6112a(80, 128, 166, 255);
        f1094bf.mo6093a(true);
        f1094bf.m6115a(5.0f);
        f1095bg.m6112a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1095bg.mo6093a(true);
        f1095bg.m6115a(3.0f);
        f1096bh.m6112a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1096bh.mo6093a(true);
        f1096bh.m6115a(8.0f);
        f1078bi = new C1112u();
        f1080bk = null;
        f1081bl = 0;
    }

    public C0188f(boolean z) {
        super(z);
        this.f980g = C0189g.f1098a;
        this.f984k = (short) -1;
        this.f991r = -1.0f;
        this.f992s = 0.1f;
        this.f997x = 2.0f;
        this.f998y = -1.0f;
        this.f999z = true;
        this.f1007H = 1.0f;
        this.f1015P = (short) -1;
        this.f1016Q = (short) -1;
        this.f1017R = (short) 0;
        this.f1018S = true;
        this.f1021V = false;
        this.f1022W = 0.0f;
        this.f1023X = 0.0f;
        this.f1027ab = false;
        this.f1028ac = false;
        this.f1029ad = false;
        this.f1030ae = true;
        this.f1034ai = 1.0f;
        this.f1035aj = 1.0f;
        this.f1036ak = 1.0f;
        this.f1037al = 1.0f;
        this.f1038am = 1.0f;
        this.f1042ar = f1089aq;
        this.f1046av = -1;
        this.f1059aI = 40.0f;
        this.f1060aJ = 60.0f;
        this.f1061aK = false;
        this.f1062aL = 2.0f;
        this.f1068aR = true;
        this.f1071aT = 0.0f;
        if (!z) {
            f1082a.add(this);
        }
    }

    /* renamed from: a */
    public void mo2875a() {
        f1082a.remove(this);
        super.mo2875a();
    }

    /* renamed from: a */
    public static C0188f m5373a(C0188f c0188f) {
        C0188f c0188f2 = f1083bm;
        c0188f2.f1054aD = -1;
        if (c0188f == null) {
            c0188f2.f1038am = 1.0f;
            c0188f2.f1036ak = 1.0f;
            c0188f2.f1037al = 1.0f;
            c0188f2.f1039an = 0.0f;
        } else {
            c0188f2.f1038am = c0188f.f1038am;
            c0188f2.f1036ak = c0188f.f1036ak;
            c0188f2.f1037al = c0188f.f1037al;
            c0188f2.f1039an = c0188f.f1039an;
        }
        return c0188f2;
    }

    /* renamed from: a */
    public void m5370a(Unit unit, float f, float f2, float f3) {
        this.f983j = unit;
        this.f6951ek = f;
        this.f6952el = f2;
        this.f6953em = f3;
        this.f1069bn = false;
        this.f1021V = false;
    }

    /* renamed from: b */
    public void m5366b() {
        if (this.f1003D) {
            GameEngine m1234A = GameEngine.m1234A();
            C0745e m2526d = m1234A.f6110bR.m2526d(this.f6951ek, this.f6952el, this.f6953em, 0);
            if (m2526d != null) {
                m2526d.f4730H = 0.7f;
                m2526d.f4729G = 2.1f;
                m2526d.f4786ar = (short) 2;
                m2526d.f4745W = 90.0f;
                m2526d.f4746X = m2526d.f4745W;
            }
            m1234A.f6105bM.m2997a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        }
        mo2875a();
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f981h);
        c0859ar.mo1486a(this.f983j);
        c0859ar.mo1486a(this.f985l);
        c0859ar.mo1488a(this.f993t);
        c0859ar.mo1487a(99);
        c0859ar.mo1482a(this.f1000A);
        c0859ar.mo1482a(this.f1001B);
        c0859ar.mo1482a(this.f1018S);
        c0859ar.mo1482a(this.f1019T);
        c0859ar.mo1488a(this.f1020U);
        c0859ar.mo1488a(this.f1024Y);
        c0859ar.mo1488a(this.f1025Z);
        c0859ar.mo1487a(this.f1042ar);
        c0859ar.mo1482a(this.f1058aH);
        c0859ar.mo1488a(this.f1059aI);
        c0859ar.mo1488a(this.f1060aJ);
        c0859ar.mo1482a(this.f1061aK);
        c0859ar.mo1488a(this.f1062aL);
        c0859ar.mo1482a(this.f1063aM);
        c0859ar.mo1488a(this.f1064aN);
        c0859ar.mo1482a(this.f1067aQ);
        c0859ar.mo1482a(this.f1068aR);
        c0859ar.mo1482a(this.f1069bn);
        c0859ar.mo1482a(this.f1070aS);
        c0859ar.mo1482a(this.f1012M);
        c0859ar.mo1483a(this.f1015P);
        c0859ar.mo1488a(this.f991r);
        c0859ar.mo1488a(this.f992s);
        c0859ar.mo1482a(this.f1043as);
        c0859ar.mo1482a(this.f1044at);
        c0859ar.mo1488a(this.f1050az);
        c0859ar.mo1488a(this.f1051aA);
        c0859ar.mo1482a(this.f1052aB);
        c0859ar.mo1482a(this.f1053aC);
        c0859ar.mo1482a(false);
        c0859ar.mo1488a(0.0f);
        c0859ar.mo1488a(0.0f);
        c0859ar.mo1482a(this.f1004E);
        c0859ar.mo1488a(this.f1005F);
        c0859ar.mo1488a(this.f1009J);
        c0859ar.mo1488a(this.f1010K);
        c0859ar.mo1488a(this.f1011L);
        c0859ar.mo1482a(this.f986m);
        c0859ar.mo1488a(this.f987n);
        c0859ar.mo1488a(this.f988o);
        c0859ar.mo1482a(this.f1002C);
        c0859ar.mo1482a(this.f1003D);
        c0859ar.m1568a(this.f990q);
        c0859ar.mo1488a(this.f1073aV);
        c0859ar.mo1488a(this.f1074aW);
        c0859ar.mo1488a(this.f1075aX);
        c0859ar.mo1482a(this.f1021V);
        c0859ar.mo1488a(this.f1022W);
        c0859ar.mo1488a(this.f1023X);
        c0859ar.mo1482a(this.f1072aU);
        c0859ar.mo1483a(this.f1017R);
        c0859ar.mo1482a(this.f1040ao);
        c0859ar.m1569a(this.f1041ap);
        c0859ar.mo1483a(this.f1016Q);
        c0859ar.mo1488a(this.f997x);
        c0859ar.mo1482a(this.f1026aa);
        c0859ar.mo1482a(this.f1029ad);
        c0859ar.mo1482a(this.f1006G);
        c0859ar.mo1488a(this.f1007H);
        c0859ar.mo1482a(this.f1030ae);
        c0859ar.mo1482a(this.f1057aG);
        c0859ar.mo1482a(this.f999z);
        c0859ar.mo1488a(this.f998y);
        c0859ar.mo1488a(this.f1065aO);
        c0859ar.mo1488a(this.f982i);
        c0859ar.mo1482a(this.f1076aY);
        c0859ar.mo1482a(this.f1031af);
        c0859ar.mo1488a(this.f1032ag);
        c0859ar.mo1488a(this.f1033ah);
        c0859ar.mo1488a(this.f1034ai);
        c0859ar.mo1488a(this.f1035aj);
        c0859ar.mo1487a(0);
        c0859ar.mo1488a(0.0f);
        c0859ar.mo1488a(0.0f);
        c0859ar.m1574a((InterfaceC0303as) null);
        c0859ar.mo1487a(0);
        c0859ar.mo1482a(false);
        C0448g.m4161a(this.f1055aE, c0859ar);
        c0859ar.mo1488a(this.f1036ak);
        c0859ar.mo1488a(this.f1037al);
        c0859ar.mo1482a(this.f1027ab);
        c0859ar.mo1482a(this.f1028ac);
        c0859ar.mo1488a(this.f1039an);
        c0859ar.mo1482a(false);
        C0189g.m5355a(this.f980g, c0859ar);
        boolean z = this.f1045au != null && !this.f1045au.f6946ef;
        c0859ar.mo1482a(z);
        if (z) {
            c0859ar.m1568a(this.f1045au);
            c0859ar.mo1488a(this.f1047aw);
            c0859ar.mo1488a(this.f1048ax);
            c0859ar.mo1488a(this.f1049ay);
        }
        c0859ar.mo1483a(this.f984k);
        c0859ar.mo1487a(this.f1054aD);
        c0859ar.mo1488a(this.f1038am);
        c0859ar.mo1488a(this.f989p);
        c0859ar.mo1487a(this.f1046av);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f981h = c0876k.m1453g();
        this.f983j = c0876k.m1445o();
        this.f985l = c0876k.m1470a(EnumC0878m.expected);
        this.f993t = c0876k.m1453g();
        this.f997x = c0876k.m1454f();
        this.f1000A = c0876k.m1455e();
        this.f1001B = c0876k.m1455e();
        this.f1018S = c0876k.m1455e();
        this.f1019T = c0876k.m1455e();
        this.f1020U = c0876k.m1453g();
        this.f1024Y = c0876k.m1453g();
        this.f1025Z = c0876k.m1453g();
        this.f1042ar = c0876k.m1454f();
        this.f1058aH = c0876k.m1455e();
        this.f1059aI = c0876k.m1453g();
        this.f1060aJ = c0876k.m1453g();
        this.f1061aK = c0876k.m1455e();
        this.f1062aL = c0876k.m1453g();
        this.f1063aM = c0876k.m1455e();
        this.f1064aN = c0876k.m1453g();
        this.f1067aQ = c0876k.m1455e();
        this.f1068aR = c0876k.m1455e();
        this.f1069bn = c0876k.m1455e();
        if (c0876k.m1463b() >= 7) {
            this.f1070aS = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 13) {
            this.f1012M = c0876k.m1455e();
            this.f1015P = c0876k.m1438v();
        }
        if (c0876k.m1463b() >= 16) {
            this.f991r = c0876k.m1453g();
            this.f992s = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 17) {
            this.f1043as = c0876k.m1455e();
            this.f1044at = c0876k.m1455e();
            this.f1050az = c0876k.m1453g();
            this.f1051aA = c0876k.m1453g();
            this.f1052aB = c0876k.m1455e();
            this.f1053aC = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 18) {
            c0876k.m1455e();
            c0876k.m1453g();
            c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 28) {
            this.f1004E = c0876k.m1455e();
            this.f1005F = c0876k.m1453g();
            this.f1009J = c0876k.m1453g();
            this.f1010K = c0876k.m1453g();
            this.f1011L = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 29) {
            this.f986m = c0876k.m1455e();
            this.f987n = c0876k.m1453g();
            this.f988o = c0876k.m1453g();
            this.f1002C = c0876k.m1455e();
            this.f1003D = c0876k.m1455e();
            this.f990q = (C0188f) c0876k.m1468a(C0188f.class);
            this.f1073aV = c0876k.m1453g();
            this.f1074aW = c0876k.m1453g();
            this.f1075aX = c0876k.m1453g();
            this.f1021V = c0876k.m1455e();
            this.f1022W = c0876k.m1453g();
            this.f1023X = c0876k.m1453g();
            this.f1072aU = c0876k.m1455e();
            this.f1017R = c0876k.m1438v();
            this.f1040ao = c0876k.m1455e();
            C1101m c1101m = new C1101m();
            c0876k.m1469a(c1101m, Unit.class);
            if (c1101m.size() > 0) {
                this.f1041ap = c1101m;
            }
            this.f1016Q = c0876k.m1438v();
        }
        if (c0876k.m1463b() >= 35) {
            this.f997x = c0876k.m1453g();
            this.f1026aa = c0876k.m1455e();
            this.f1029ad = c0876k.m1455e();
            this.f1006G = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 38) {
            this.f1007H = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 39) {
            this.f1030ae = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 41) {
            this.f1057aG = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 43) {
            this.f999z = c0876k.m1455e();
            this.f998y = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 44) {
            this.f1065aO = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 47) {
            this.f982i = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 48) {
            this.f1076aY = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 59) {
            this.f1031af = c0876k.m1455e();
            this.f1032ag = c0876k.m1453g();
            this.f1033ah = c0876k.m1453g();
            this.f1034ai = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 60) {
            this.f1035aj = c0876k.m1453g();
            c0876k.m1454f();
            c0876k.m1453g();
            c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 62) {
            c0876k.m1443q();
            c0876k.m1454f();
            c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 63) {
            this.f1055aE = C0448g.m4160a(c0876k);
        }
        if (c0876k.m1463b() >= 64) {
            this.f1036ak = c0876k.m1453g();
            this.f1037al = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 66) {
            this.f1027ab = c0876k.m1455e();
            this.f1028ac = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 67 && c0876k.m1463b() < 78) {
            C0413bn.m4359a(c0876k, true);
        }
        if (c0876k.m1463b() >= 68) {
            this.f1039an = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 77) {
            c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 78) {
            this.f980g = C0189g.m5352a(c0876k);
        }
        if (c0876k.m1463b() >= 81 && c0876k.m1455e()) {
            this.f1045au = c0876k.m1468a(AbstractC1120w.class);
            this.f1047aw = c0876k.m1453g();
            this.f1048ax = c0876k.m1453g();
            this.f1049ay = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 83) {
            this.f984k = c0876k.m1438v();
            this.f1054aD = c0876k.m1454f();
        }
        if (c0876k.m1463b() >= 88) {
            this.f1038am = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 89) {
            this.f989p = c0876k.m1453g();
            this.f1046av = c0876k.m1454f();
        }
        super.mo2872a(c0876k);
    }

    /* renamed from: c */
    public static void m5363c() {
        GameEngine m1234A = GameEngine.m1234A();
        f1084b = m1234A.f6107bO.mo930a(C0067R.drawable.projectiles);
        f1085c = m1234A.f6107bO.mo930a(C0067R.drawable.projectiles2);
        f1086d = m1234A.f6107bO.mo930a(C0067R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m5361d() {
        this.f1070aS = true;
    }

    /* renamed from: a */
    public static C0188f m5371a(Unit unit, float f, float f2) {
        C0188f c0188f = new C0188f(false);
        c0188f.f983j = unit;
        c0188f.f6951ek = f;
        c0188f.f6952el = f2;
        c0188f.f1042ar = Color.m6127a(255, 100, 30, 30);
        c0188f.f6950ej = unit.f6950ej + 1;
        c0188f.f6949ei = 4;
        return c0188f;
    }

    /* renamed from: a */
    public static C0188f m5369a(Unit unit, float f, float f2, float f3, int i) {
        C0188f m5371a = m5371a(unit, f, f2);
        m5371a.f6953em = f3;
        m5371a.f984k = (short) i;
        m5371a.f1008I = C0758f.m2301b(unit, 0.0f, 1.0f, unit.f1587bB);
        unit.f1587bB++;
        return m5371a;
    }

    /* renamed from: a */
    public void m5372a(Unit unit) {
        float f;
        if ((this.f1032ag == 0.0f && this.f1033ah == 0.0f) || unit.mo4109bI()) {
            return;
        }
        if (C0758f.m2361a(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el) > 100.0f) {
            f = C0758f.m2275d(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el);
        } else {
            f = this.f1050az;
        }
        float mo3576bN = this.f1033ah + (this.f1032ag / unit.mo3576bN());
        unit.f1613ca += C0758f.m2244i(f) * mo3576bN;
        unit.f1614cb += C0758f.m2249h(f) * mo3576bN;
    }

    /* renamed from: a */
    public static void m5368a(Unit unit, Unit unit2, float f, C0188f c0188f, boolean z) {
        GameEngine m1234A = GameEngine.m1234A();
        if (m1234A.f6095bw && f > 0.0f) {
            f = 0.0f;
        }
        if (unit2 != null && !unit2.f1606bT) {
            if (c0188f != null && c0188f.f980g.f1150bc && unit != null) {
                unit2.mo4055e(unit.f1608bV);
            }
            if (c0188f != null) {
                if (c0188f.f1034ai != 1.0f && unit2.mo4109bI()) {
                    f *= c0188f.f1034ai;
                }
                if (c0188f.f1035aj != 1.0f && unit2.mo3283i()) {
                    f *= c0188f.f1035aj;
                }
            }
            if (f < 0.0f) {
                unit2.m4769b(unit, -f, c0188f);
            } else {
                boolean z2 = !unit2.f1606bT && unit2.f1631cs > 0.0f;
                unit2.mo4806a(unit, f, c0188f);
                float f2 = f;
                if (unit2.mo3273J()) {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    m1234A.f6117bY.m2614a(unit, unit2, f2);
                }
                if (unit != null) {
                    unit.f1658cT += f2;
                    if (z2 && (unit2.f1606bT || unit2.f1631cs < 0.0f)) {
                        unit.f1657cS++;
                        unit.m4775a(EnumC0347ae.killedAnyUnit, unit2);
                    }
                }
            }
            if (c0188f != null && !unit2.f1606bT) {
                float m4761bQ = unit2.m4761bQ();
                if (m4761bQ != -1.0f) {
                    float m2275d = C0758f.m2275d(c0188f.f6951ek, c0188f.f6952el, unit2.f6951ek, unit2.f6952el);
                    float f3 = 100.0f / m4761bQ;
                    unit2.f1613ca += C0758f.m2244i(m2275d) * f3;
                    unit2.f1614cb += C0758f.m2249h(m2275d) * f3;
                }
            }
        }
    }

    /* renamed from: e */
    public float m5359e() {
        float f = 1.0f;
        if (this.f1009J < this.f1005F) {
            f = this.f1009J / this.f1005F;
        }
        return f;
    }

    /* renamed from: a */
    public void m5378a(float f) {
        float m2275d;
        float m2361a;
        float f2;
        float f3;
        C0745e m2526d;
        C0745e m2526d2;
        C0467y m5354a;
        C0745e m2532b;
        float f4;
        float f5;
        float f6;
        float f7;
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f1070aS) {
            mo2875a();
        }
        if (this.f985l == null && !this.f1053aC) {
            mo2875a();
            return;
        }
        if (this.f982i > 0.0f) {
            this.f982i = C0758f.m2363a(this.f982i, f);
            if (this.f982i > 0.0f) {
                return;
            }
        }
        C0189g c0189g = this.f980g;
        if (this.f982i == 0.0f) {
            this.f982i = -1.0f;
            if (c0189g.f1131al != null) {
                c0189g.f1131al.m4378a(this.f6951ek, this.f6952el, this.f6953em, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, null);
            }
        }
        this.f981h = C0758f.m2363a(this.f981h, f);
        boolean z = false;
        if (this.f1057aG) {
            if (this.f985l == null) {
                z = true;
            } else if (this.f985l.f1606bT) {
                z = true;
            }
        }
        if (z) {
            m5377a(c0189g.f1191ax, c0189g.f1192ay, (C0449h) null);
        }
        if (c0189g.f1134az) {
            this.f1056aF = C0758f.m2363a(this.f1056aF, f);
            if (this.f1056aF == 0.0f) {
                this.f1056aF = c0189g.f1193aA;
                m5377a(c0189g.f1194aB, c0189g.f1195aC, c0189g.f1135aD);
            }
        }
        if (c0189g.f1118R != 0.0f || c0189g.f1119S != 0.0f) {
            float f8 = c0189g.f1118R;
            if (this.f985l != null) {
                f8 += this.f985l.f1620ch * c0189g.f1119S;
            }
            this.f1010K = C0758f.m2249h(((360.0f * this.f1008I) + (this.f1009J * 1.0f)) % 360.0f) * f8;
            this.f1011L = C0758f.m2249h(((360.0f * this.f1008I) + (this.f1009J * 1.5f)) % 360.0f) * f8;
        }
        if (this.f1004E && this.f985l != null) {
            this.f1010K = C0758f.m2249h((this.f1009J * 1.0f) % 360.0f) * this.f985l.f1620ch * 0.4f;
            this.f1011L = C0758f.m2249h((this.f1009J * 1.5f) % 360.0f) * this.f985l.f1620ch * 0.4f;
            float f9 = this.f985l.f6951ek + this.f1010K;
            float f10 = this.f985l.f6952el + this.f1011L;
            if (this.f6948eh) {
                this.f1064aN += f;
                this.f1065aO += f;
                if (this.f1064aN > 11.0f) {
                    this.f1064aN = C0758f.m2288c(1.0f, 4.0f);
                    C0745e m2532b2 = m1234A.f6110bR.m2532b(f9, f10, this.f985l.f6953em, EnumC0744d.custom, false, EnumC0748h.low);
                    if (m2532b2 != null) {
                        m2532b2.f4763aq = 0;
                        m2532b2.f4762ap = 0;
                        m2532b2.f4786ar = (short) 2;
                        m2532b2.f4720s = true;
                        m2532b2.f4728F = 0.5f;
                        m2532b2.f4746X = 60.0f;
                        m2532b2.f4745W = 60.0f;
                        m2532b2.f4730H = 0.7f;
                        m2532b2.f4729G = 0.3f;
                        m2532b2.f4787as = false;
                        m2532b2.f4739Q = C0758f.m2288c(-0.3f, 0.3f);
                        m2532b2.f4740R = (-0.9f) + C0758f.m2288c(-0.3f, 0.3f);
                    }
                }
                if (this.f1065aO > 75.0f) {
                    this.f1065aO = C0758f.m2288c(1.0f, 20.0f);
                    m1234A.f6110bR.m2537b(f9, f10, this.f985l.f6953em);
                }
            }
        }
        float f11 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.f1053aC) {
            float f12 = this.f985l.f6951ek + this.f1010K;
            float f13 = this.f985l.f6952el + this.f1011L;
            float f14 = this.f985l.f6953em;
            m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f12, f13);
            m2361a = C0758f.m2361a(this.f6951ek, this.f6952el, f12, f13);
            f2 = f14;
            f3 = f2 - this.f6953em;
            f11 = this.f985l.f1620ch;
            z2 = this.f985l instanceof AbstractC0488d;
            z3 = this.f985l.f1634cv > 10.0f + this.f1020U;
        } else {
            float f15 = this.f1050az;
            if (this.f990q != null) {
                float f16 = this.f990q.f6951ek + this.f1010K;
                float f17 = this.f990q.f6952el + this.f1011L;
                float f18 = this.f990q.f6953em;
                m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f16, f17);
                m2361a = C0758f.m2361a(this.f6951ek, this.f6952el, f16, f17);
                f2 = f18;
                f3 = f2 - this.f6953em;
            } else if (this.f985l != null) {
                float f19 = this.f985l.f6951ek + this.f1010K;
                float f20 = this.f985l.f6952el + this.f1011L;
                float f21 = this.f985l.f6953em;
                m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f19, f20);
                m2361a = C0758f.m2361a(this.f6951ek, this.f6952el, f19, f20);
                f2 = f21;
                f3 = f2 - this.f6953em;
                f11 = this.f985l.f1620ch;
                z2 = this.f985l instanceof AbstractC0488d;
                z3 = this.f985l.f1634cv > 10.0f + this.f1020U;
            } else if (this.f986m) {
                float f22 = this.f987n + this.f1010K;
                float f23 = this.f988o + this.f1011L;
                float f24 = this.f989p;
                m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f22, f23);
                m2361a = C0758f.m2361a(this.f6951ek, this.f6952el, f22, f23);
                f2 = f24;
                f3 = f2 - this.f6953em;
            } else {
                float f25 = this.f987n + this.f1010K;
                float f26 = this.f988o + this.f1011L;
                m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f25, f26);
                m2361a = C0758f.m2361a(this.f6951ek, this.f6952el, f25, f26);
                f2 = 0.0f;
                f3 = 0.0f - this.f6953em;
            }
        }
        float f27 = c0189g.f1173O;
        if (m2361a < 225.0f) {
            f27 = c0189g.f1174P;
        }
        if (f27 >= 0.0f) {
            this.f1050az += C0758f.m2287c(this.f1050az, m2275d, f27 * f);
            m2275d = this.f1050az;
        } else {
            this.f1050az = m2275d;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f28 = m2275d;
        if (this.f1045au != null && !this.f1045au.f6946ef) {
            if (this.f1046av >= 0) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) this.f1045au;
                if (this.f1046av >= abstractC0623y.mo3451bl()) {
                    this.f1046av = 0;
                }
                C1080ai mo3243D = abstractC0623y.mo3243D(this.f1046av);
                f5 = mo3243D.f6843a;
                f6 = mo3243D.f6844b;
                f7 = this.f983j.f6953em + mo3243D.f6845c;
            } else {
                f5 = this.f1045au.f6951ek;
                f6 = this.f1045au.f6952el;
                f7 = this.f1045au.f6953em;
            }
            float f29 = f5 - this.f1047aw;
            float f30 = f6 - this.f1048ax;
            float f31 = f7 - this.f1049ay;
            this.f6951ek += f29;
            this.f6952el += f30;
            this.f6953em += f31;
            this.f1047aw = f5;
            this.f1048ax = f6;
            this.f1049ay = f7;
        }
        if (!this.f1000A) {
            this.f6951ek += this.f994u * f;
            this.f6952el += this.f995v * f;
            if (this.f996w != 0.0f) {
                this.f6953em += this.f996w * f;
                f3 = f2 - this.f6953em;
            }
            if (this.f6953em > 0.0f) {
                if (c0189g.f1115G != 0.0f) {
                    this.f6953em -= c0189g.f1115G * f;
                    f3 = f2 - this.f6953em;
                }
                if (c0189g.f1116H != 0.0f) {
                    this.f996w -= c0189g.f1116H * f;
                }
            }
            if (!this.f1058aH || this.f1059aI < this.f6953em || this.f1061aK) {
                float f32 = this.f993t * f;
                z4 = true;
                if (m2361a < f32 * f32) {
                    f32 = C0758f.m2364a(m2361a);
                    m2361a = 0.0f;
                }
                this.f6951ek += C0758f.m2244i(m2275d) * f32;
                this.f6952el += C0758f.m2249h(m2275d) * f32;
            }
            if (this.f1058aH) {
                if (this.f1062aL < 0.0f) {
                    f4 = this.f993t * f;
                    z4 = true;
                } else {
                    f4 = this.f1062aL * f;
                }
                if (!this.f1061aK) {
                    this.f6953em = C0758f.m2362a(this.f6953em, this.f1060aJ, f4);
                    if (this.f6953em < this.f1059aI) {
                        f28 = -90.0f;
                    }
                    if (this.f6953em >= this.f1060aJ) {
                        this.f1061aK = true;
                    }
                } else if (m2361a < 400.0f) {
                    this.f6953em = C0758f.m2362a(this.f6953em, f2, f4);
                    if (C0758f.m2289c(this.f6953em - f2) > 0.5f) {
                        f28 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f33 = f3;
                float f34 = this.f993t * f;
                z4 = true;
                if (f33 != 0.0f) {
                    if (m2361a > 0.1d) {
                        f34 = C0758f.m2311b((C0758f.m2289c(f33) / C0758f.m2364a(m2361a)) * this.f993t * f, this.f993t * f);
                    }
                    this.f6953em += C0758f.m2311b(f3, f34);
                    f3 = f2 - this.f6953em;
                }
            }
        }
        if (z4 && this.f991r > 0.0f) {
            this.f993t = C0758f.m2362a(this.f993t, this.f991r, this.f992s * f);
        }
        if (c0189g.f1132am != 0.0f) {
            float m2249h = C0758f.m2249h((((this.f1009J * 360.0f) / c0189g.f1182an) + (360.0f * this.f1008I)) % 360.0f) * c0189g.f1132am * f;
            this.f6951ek += C0758f.m2244i(m2275d + 90.0f) * m2249h;
            this.f6952el += C0758f.m2249h(m2275d + 90.0f) * m2249h;
        }
        if (this.f6948eh && ((this.f1063aM || c0189g.f1127ah != null) && !this.f1069bn)) {
            this.f1064aN += f;
            if (this.f1064aN > c0189g.f1181ag) {
                this.f1064aN = 0.0f;
                boolean z6 = false;
                if (this.f1003D) {
                    z6 = true;
                }
                if (c0189g.f1127ah != null) {
                    c0189g.f1127ah.m3933a(this.f6951ek, this.f6952el, this.f6953em, this.f1071aT, this);
                }
                if (this.f1063aM && (m2532b = m1234A.f6110bR.m2532b(this.f6951ek, this.f6952el, this.f6953em, EnumC0744d.custom, z6, EnumC0748h.low)) != null) {
                    if (this.f6953em >= 0.0f) {
                        m2532b.f4763aq = 0;
                        m2532b.f4762ap = 0;
                        m2532b.f4786ar = (short) 2;
                        m2532b.f4720s = true;
                        m2532b.f4728F = 0.5f;
                        m2532b.f4745W = 70.0f;
                        m2532b.f4746X = m2532b.f4745W;
                        m2532b.f4787as = true;
                        if (z5) {
                            m2532b.f4787as = false;
                        }
                        m2532b.f4740R = 0.1f;
                        m2532b.f4721t = true;
                        m2532b.f4722u = 5.0f;
                        m2532b.f4730H = 0.5f;
                        m2532b.f4729G = 1.2f;
                        m2532b.f4747Y = C0758f.m2288c(-180.0f, 180.0f);
                        if (this.f1003D) {
                            m2532b.f4730H = 0.5f;
                            m2532b.f4729G = 2.1f;
                        }
                    } else {
                        m2532b.f4763aq = 9;
                        m2532b.f4762ap = 1;
                        m2532b.f4786ar = (short) 1;
                        m2532b.f4720s = true;
                        m2532b.f4728F = 0.5f;
                        m2532b.f4746X = 60.0f;
                        m2532b.f4745W = 60.0f;
                        m2532b.f4740R = 0.1f;
                    }
                }
            }
        }
        if (!this.f1069bn) {
            boolean z7 = false;
            Unit unit = null;
            boolean z8 = false;
            float f35 = 6.0f;
            if (z2) {
                f35 = f11 * 0.8f;
                if (f35 < 6.0f) {
                    f35 = 6.0f;
                }
            }
            if (z3) {
                f35 = f11 * 1.1f;
            }
            float f36 = 3.0f;
            if (this.f996w != 0.0f || c0189g.f1115G != 0.0f) {
                f36 = 3.0f + C0758f.m2289c(this.f996w * f) + C0758f.m2289c(c0189g.f1115G * f);
            }
            if (m2361a < f35 * f35 && C0758f.m2289c(f3) < f36) {
                z7 = true;
                unit = this.f985l;
            }
            if (this.f1000A) {
                z7 = true;
                unit = this.f985l;
            }
            if (this.f1031af && this.f981h == 0.0f) {
                z7 = true;
            }
            if (this.f1043as) {
                float f37 = this.f1051aA + 50.0f;
                Unit[] m523a = Unit.f1589bD.m523a();
                int size = Unit.f1589bD.size();
                for (int i = 0; i < size; i++) {
                    Unit unit2 = m523a[i];
                    if (unit2.f6951ek + f37 > this.f6951ek && unit2.f6951ek - f37 < this.f6951ek && unit2.f6952el + f37 > this.f6952el && unit2.f6952el - f37 < this.f6952el && unit2.f1605bS && false == unit2.mo3283i() && unit2.f1650cL == null) {
                        float m2361a2 = C0758f.m2361a(this.f6951ek, this.f6952el, unit2.f6951ek, unit2.f6952el);
                        float f38 = this.f1051aA + unit2.f1620ch;
                        if (m2361a2 < f38 * f38) {
                            z7 = true;
                            unit = unit2;
                        }
                    }
                }
            }
            if (this.f1044at) {
                m1234A.f6104bL.m5512a(this.f6951ek, this.f6952el);
                if (m1234A.f6113bU.m1313a(EnumC0246ao.HOVER, m1234A.f6104bL.f800T, m1234A.f6104bL.f801U)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.f1053aC) {
            }
            if (this.f1076aY && (((this.f1058aH && z5 && this.f6953em < 30.0f) || z7) && this.f983j != null)) {
                this.f1076aY = false;
                C0619u c0619u = new C0619u(false);
                c0619u.f6951ek = this.f6951ek;
                c0619u.f6952el = this.f6952el;
                c0619u.mo3113b(this.f983j.f1608bV);
                c0619u.f3878a = 15;
                c0619u.f3879b = 360.0f;
                AbstractC0197n.m5215c(c0619u);
            }
            if (z7) {
                this.f1069bn = true;
                this.f1073aV = this.f6951ek;
                this.f1074aW = this.f6952el;
                this.f1075aX = this.f6953em;
                if (this.f1000A) {
                    if (this.f1053aC) {
                        this.f1073aV = this.f987n;
                        this.f1074aW = this.f988o;
                        this.f1075aX = 0.0f;
                    }
                    if (this.f985l != null) {
                        this.f1073aV = this.f985l.f6951ek + this.f1010K;
                        this.f1074aW = this.f985l.f6952el + this.f1011L;
                        this.f1075aX = this.f985l.f6953em;
                    }
                }
                if (!this.f1001B && !this.f1012M && !c0189g.f1178X) {
                    this.f1018S = false;
                }
                boolean z9 = false;
                if (this.f985l != null) {
                    z9 = this.f985l.f1634cv > 10.0f;
                }
                C0467y c0467y = c0189g.f1145aX;
                if (z9) {
                    c0467y = c0189g.f1146aY;
                }
                if (this.f985l != null && (m5354a = c0189g.m5354a(this.f985l)) != null) {
                    c0467y = m5354a;
                }
                if (c0467y != null) {
                    c0467y.m3933a(this.f1073aV, this.f1074aW, this.f1075aX, this.f1071aT, this.f985l);
                }
                if (c0189g.f1129aj != null) {
                    c0189g.f1129aj.m4378a(this.f6951ek, this.f6952el, this.f6953em, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, this.f985l);
                }
                if (c0189g.f1147aZ != null && this.f983j != null) {
                    c0189g.f1147aZ.m4363a(this.f1073aV, this.f1074aW, 0.0f, this.f1050az, this.f983j.f1608bV, false, this.f983j);
                }
                if (c0189g.f1148ba > 0 && this.f983j != null && (this.f983j instanceof C0451j)) {
                    C0451j c0451j = (C0451j) this.f983j;
                    for (int i2 = 0; i2 < c0189g.f1148ba; i2++) {
                        if (c0451j.f2865A != null && c0451j.f2865A.size() > 0) {
                            Unit unit3 = (Unit) c0451j.f2865A.remove(c0451j.f2865A.size() - 1);
                            C1117y.m489a(unit3, c0451j);
                            unit3.f6951ek = this.f1073aV;
                            unit3.f6952el = this.f1074aW;
                            unit3.f1617ce = this.f1050az;
                            unit3.f1614cb = 0.0f;
                            unit3.f1613ca = 0.0f;
                            unit3.f1610bX = 0.0f;
                            unit3.f1611bY = 0.0f;
                            if (unit3 instanceof AbstractC0623y) {
                                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit3;
                                abstractC0623y2.m3120az();
                                abstractC0623y2.m3042j(unit3.f1617ce);
                                if (unit3 instanceof C0451j) {
                                    ((C0451j) unit3).m4075dD();
                                }
                            }
                            c0451j.m4145D(unit3);
                        }
                    }
                }
                if (c0189g.f1149bb && this.f983j != null) {
                    this.f983j.mo4052f(this.f1073aV, this.f1074aW);
                }
                if (!z8 && unit != null) {
                    if (this.f1004E) {
                        this.f1069bn = false;
                        float m5359e = (this.f1020U / 60.0f) * f * m5359e();
                        if (this.f1025Z == 0.0f) {
                            m5372a(unit);
                        }
                        m5368a(this.f983j, unit, c0189g.m5353a(unit, m5359e, true), this, false);
                    } else {
                        if (this.f1025Z == 0.0f) {
                            m5372a(unit);
                        }
                        m5368a(this.f983j, unit, c0189g.m5353a(unit, this.f1020U, false), this, false);
                    }
                }
                if (this.f990q != null) {
                    if (c0189g.f1101d) {
                        this.f990q.f981h = 0.0f;
                    } else {
                        this.f990q.m5366b();
                    }
                    mo2875a();
                }
                if (!this.f1004E) {
                    boolean z10 = true;
                    if (this.f985l != null && this.f985l.f1634cv > 10.0f) {
                        z10 = false;
                        if (c0189g.f1146aY == null && (m2526d2 = m1234A.f6110bR.m2526d(this.f1073aV, this.f1074aW, this.f1075aX, -1127220)) != null) {
                            m2526d2.f4745W = 10.0f;
                            m2526d2.f4729G = 0.5f;
                            if (this.f1067aQ) {
                                m2526d2.f4745W = 25.0f;
                                m2526d2.f4729G = 1.0f;
                            }
                            m2526d2.f4786ar = (short) 2;
                            m2526d2.f4746X = m2526d2.f4745W;
                        }
                    }
                    if (this.f1006G) {
                        z10 = false;
                        C0746f.m2507b(this.f6951ek, this.f6952el).f4789a = 21.0f;
                    }
                    if (z10) {
                        if (!this.f1067aQ) {
                            if (c0189g.f1145aX == null) {
                                m1234A.f6110bR.m2530c(this.f1073aV, this.f1074aW, this.f1075aX);
                            }
                        } else if (c0189g.f1145aX == null) {
                            if (this.f1025Z > 10.0f && (m2526d = m1234A.f6110bR.m2526d(this.f1073aV, this.f1074aW, this.f1075aX, 0)) != null) {
                                m2526d.f4729G = this.f1025Z / 25.0f;
                                m2526d.f4728F = 0.7f;
                                if (this.f1075aX > 5.0f) {
                                    m2526d.f4786ar = (short) 2;
                                }
                            }
                            m1234A.f6110bR.m2537b(this.f1073aV, this.f1074aW, this.f1075aX);
                            if (this.f1068aR && !this.f1003D) {
                                m1234A.f6105bM.m2996a(C0631e.f4043n, 0.5f, 1.0f + C0758f.m2288c(-0.06f, 0.06f), this.f1073aV, this.f1074aW);
                            }
                        }
                        if (this.f1003D && c0189g.f1145aX == null) {
                            m1234A.f6105bM.m2996a(C0631e.f4058C, 1.6f, 0.7f, this.f1073aV, this.f1074aW);
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, 255, 255));
                            if (m2552a != null) {
                                m2552a.f4730H = 14.0f;
                                m2552a.f4729G = 8.0f;
                                m2552a.f4728F = 0.9f;
                                m2552a.f4745W = 35.0f;
                                m2552a.f4746X = m2552a.f4745W;
                                m2552a.f4720s = true;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2528c = m1234A.f6110bR.m2528c(this.f1073aV, this.f1074aW, this.f1075aX, -1127220);
                            if (m2528c != null) {
                                m2528c.f4730H = 1.5f;
                                m2528c.f4729G = 3.0f;
                                m2528c.f4786ar = (short) 2;
                                m2528c.f4745W = 20.0f;
                                m2528c.f4746X = m2528c.f4745W;
                                m2528c.f4744V = 0.0f;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2528c2 = m1234A.f6110bR.m2528c(this.f1073aV, this.f1074aW, this.f1075aX, -1127220);
                            if (m2528c2 != null) {
                                m2528c2.f4730H = 0.2f;
                                m2528c2.f4729G = 5.0f;
                                m2528c2.f4786ar = (short) 2;
                                m2528c2.f4745W = 65.0f;
                                m2528c2.f4746X = m2528c2.f4745W;
                                m2528c2.f4744V = 0.0f;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a2 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, 255, 255));
                            if (m2552a2 != null) {
                                m2552a2.f4730H = 3.0f;
                                m2552a2.f4729G = 6.0f;
                                m2552a2.f4728F = 0.9f;
                                m2552a2.f4745W = 290.0f;
                                m2552a2.f4746X = m2552a2.f4745W;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a3 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (m2552a3 != null) {
                                m2552a3.f4730H = 2.0f;
                                m2552a3.f4729G = 6.0f;
                                m2552a3.f4728F = 0.5f;
                                m2552a3.f4745W = 370.0f;
                                m2552a3.f4746X = m2552a3.f4745W;
                                m2552a3.f4744V = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a4 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (m2552a4 != null) {
                                    m2552a4.f4730H = 0.2f;
                                    m2552a4.f4729G = 9.0f;
                                    m2552a4.f4728F = 0.7f;
                                    m2552a4.f4745W = 210.0f;
                                    m2552a4.f4746X = m2552a4.f4745W;
                                    m2552a4.f4744V = 20 + (i3 * 110);
                                }
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a5 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, 255, 255));
                            if (m2552a5 != null) {
                                m2552a5.f4730H = 3.0f;
                                m2552a5.f4729G = 4.0f;
                                m2552a5.f4728F = 0.2f;
                                m2552a5.f4745W = 870.0f;
                                m2552a5.f4746X = m2552a5.f4745W;
                                m2552a5.f4720s = true;
                                m2552a5.f4744V = 70.0f;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a6 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (m2552a6 != null) {
                                m2552a6.f4730H = 4.0f;
                                m2552a6.f4729G = 1.0f;
                                m2552a6.f4728F = 0.9f;
                                m2552a6.f4745W = 320.0f;
                                m2552a6.f4746X = m2552a6.f4745W;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a7 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (m2552a7 != null) {
                                m2552a7.f4730H = 2.0f;
                                m2552a7.f4729G = 1.0f;
                                m2552a7.f4728F = 1.0f;
                                m2552a7.f4745W = 340.0f;
                                m2552a7.f4746X = m2552a7.f4745W;
                                m2552a7.f4721t = true;
                                m2552a7.f4722u = 20.0f;
                            }
                            m1234A.f6110bR.m2531b(EnumC0748h.critical);
                            C0745e m2552a8 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (m2552a8 != null) {
                                m2552a8.f4730H = 1.5f;
                                m2552a8.f4729G = 1.5f;
                                m2552a8.f4728F = 0.3f;
                                m2552a8.f4745W = 1340.0f;
                                m2552a8.f4746X = m2552a8.f4745W;
                                m2552a8.f4721t = true;
                                m2552a8.f4722u = 40.0f;
                                m2552a8.f4744V = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a9 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2552a9 != null) {
                                    m2552a9.f4730H = 1.5f;
                                    m2552a9.f4729G = 1.4f;
                                    m2552a9.f4728F = 1.3f;
                                    m2552a9.f4745W = 340.0f;
                                    m2552a9.f4746X = m2552a9.f4745W;
                                    m2552a9.f4740R = -0.29f;
                                    m2552a9.f4721t = true;
                                    m2552a9.f4722u = 50.0f;
                                    m2552a9.f4744V = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a10 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, Color.m6127a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2552a10 != null) {
                                    m2552a10.f4730H = 1.3f;
                                    m2552a10.f4729G = 1.0f;
                                    m2552a10.f4728F = 1.0f;
                                    m2552a10.f4745W = 340.0f;
                                    m2552a10.f4746X = m2552a10.f4745W;
                                    m2552a10.f4740R = -0.14f;
                                    m2552a10.f4721t = true;
                                    m2552a10.f4722u = 50.0f;
                                    m2552a10.f4744V = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a11 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW - 30.0f, this.f6953em, -16711936);
                                if (m2552a11 != null) {
                                    m2552a11.f4730H = 1.5f;
                                    m2552a11.f4729G = 2.6f;
                                    m2552a11.f4728F = 1.3f;
                                    m2552a11.f4745W = 510.0f;
                                    m2552a11.f4746X = m2552a11.f4745W;
                                    m2552a11.f4740R = -0.2f;
                                    m2552a11.f4721t = true;
                                    m2552a11.f4722u = 50.0f;
                                    m2552a11.f4783C = null;
                                    m2552a11.f4725y = Color.m6127a(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    m2552a11.f4744V = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a12 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW - 30.0f, this.f6953em, -16711936);
                                if (m2552a12 != null) {
                                    m2552a12.f4730H = 1.5f;
                                    m2552a12.f4729G = 3.8f;
                                    m2552a12.f4728F = 0.8f;
                                    m2552a12.f4745W = 590.0f;
                                    m2552a12.f4746X = m2552a12.f4745W;
                                    m2552a12.f4740R = -0.2f;
                                    m2552a12.f4721t = true;
                                    m2552a12.f4722u = 50.0f;
                                    m2552a12.f4783C = null;
                                    m2552a12.f4725y = Color.m6127a(105, 115, 115, 115);
                                    m2552a12.f4744V = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                C0746f m2514a = C0746f.m2514a(this.f1073aV + C0758f.m2359a(-10.0f, 10.0f, (int) this.f6945ed), this.f1074aW + C0758f.m2359a(-10.0f, 10.0f, ((int) this.f6945ed) + i8));
                                if (m2514a != null) {
                                    m2514a.f4804t = 200 + (i8 * 70);
                                    m2514a.f4789a = 980 + (i8 * 800);
                                }
                            }
                            if (!C1117y.m474d(this.f1073aV, this.f1074aW)) {
                                C0195l.m5294a(this.f1073aV, this.f1074aW, EnumC0196m.nuke);
                            }
                            if (GameEngine.m1182aA()) {
                                if (m1234A.f6110bR.f4683m == null) {
                                    m1234A.f6110bR.f4683m = m1234A.f6107bO.mo926a(C0067R.drawable.shockwave_normal_256, true);
                                }
                                m1234A.f6110bR.m2531b(EnumC0748h.critical);
                                C0745e m2552a13 = m1234A.f6110bR.m2552a(this.f1073aV, this.f1074aW, this.f6953em, -1);
                                if (m2552a13 != null && m1234A.f6110bR.f4683m != null) {
                                    m2552a13.f4777a = new C0382aw((EnumC0383ax) null);
                                    m2552a13.f4777a.imageStrip = new C0747g();
                                    m2552a13.f4777a.imageStrip.f4823k = true;
                                    m2552a13.f4777a.imageStrip.f4821i = m1234A.f6110bR.f4683m;
                                    m2552a13.f4777a.imageStrip.f4814b = m2552a13.f4777a.imageStrip.f4821i.mo396m();
                                    m2552a13.f4777a.imageStrip.f4815c = m2552a13.f4777a.imageStrip.f4821i.mo397l();
                                    m2552a13.f4786ar = (short) 101;
                                    m2552a13.f4730H = 0.5f;
                                    m2552a13.f4729G = 3.5f;
                                    m2552a13.f4728F = 0.5f;
                                    m2552a13.f4745W = 60.0f;
                                    m2552a13.f4746X = m2552a13.f4745W;
                                    m2552a13.f4740R = -0.2f;
                                    m2552a13.f4721t = true;
                                    m2552a13.f4722u = 1.0f;
                                    m2552a13.f4783C = null;
                                    m2552a13.f4744V = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f1069bn && !this.f1021V) {
            this.f1022W = C0758f.m2363a(this.f1022W, f);
            if (this.f1040ao) {
                m5365b(1.0f - (this.f1022W / this.f1023X));
            }
            if (this.f1022W == 0.0f) {
                this.f1021V = true;
                m5365b(1.0f);
                if (!this.f1001B && !this.f1012M && !c0189g.f1178X) {
                    mo2875a();
                }
            }
        }
        this.f1009J += f;
        if (this.f981h == 0.0f && (!this.f1069bn || this.f1021V)) {
            if (c0189g.f1130ak != null) {
                c0189g.f1130ak.m4378a(this.f6951ek, this.f6952el, this.f6953em, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, null);
            }
            mo2875a();
        }
        if (!this.f1072aU) {
            this.f1071aT = f28;
            this.f1072aU = true;
        }
        this.f1071aT += C0758f.m2287c(this.f1071aT, f28, 12.0f * f);
    }

    /* renamed from: b */
    public void m5365b(float f) {
        boolean z = false;
        if (this.f980g.f1103f) {
            return;
        }
        if (this.f980g.f1102e) {
            z = true;
        }
        if (!z) {
            if (this.f1024Y != 0.0f && this.f1025Z > 0.0f) {
                z = true;
            }
            if ((this.f1032ag != 0.0f || this.f1033ah != 0.0f) && this.f1025Z > 0.0f) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        float f2 = this.f1025Z * f;
        float f3 = f2;
        if (this.f980g.f1105h) {
            f3 += 150.0f;
        }
        GameEngine m1234A = GameEngine.m1234A();
        f1078bi.clear();
        m1234A.f6121cc.m3533b(this.f1073aV, this.f1074aW, f3, f1078bi);
        Unit[] m523a = f1078bi.m523a();
        int size = f1078bi.size();
        for (int i = 0; i < size; i++) {
            m5364b(m523a[i], f, f2);
        }
        f1078bi.clear();
    }

    /* renamed from: b */
    public void m5364b(Unit unit, float f, float f2) {
        if (unit.f1650cL != null) {
            return;
        }
        if (this.f1041ap != null && this.f1041ap.contains(unit)) {
            return;
        }
        if (this.f983j != null) {
            AbstractC0197n abstractC0197n = this.f983j.f1608bV;
            AbstractC0197n abstractC0197n2 = unit.f1608bV;
            if (abstractC0197n2 != abstractC0197n && abstractC0197n.m5204d(abstractC0197n2)) {
                return;
            }
            if (this.f1026aa && !abstractC0197n.m5216c(abstractC0197n2)) {
                return;
            }
            if (this.f1027ab && abstractC0197n.m5216c(abstractC0197n2)) {
                return;
            }
        }
        if (unit.f6953em < -5.0f && this.f1075aX >= -2.0f && !this.f1028ac) {
            return;
        }
        if (this.f1030ae) {
            if (unit.mo3283i() != (this.f1075aX >= 5.0f)) {
                return;
            }
        } else if (!this.f1029ad && unit.mo3283i()) {
            return;
        }
        float m2361a = C0758f.m2361a(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el);
        if (m2361a > f2 * f2 && !this.f980g.f1105h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(m2361a);
        if (this.f980g.f1105h) {
            sqrt -= unit.f1620ch;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f2 || sqrt < this.f980g.f1153j) {
            return;
        }
        m5376a(f, unit, sqrt);
    }

    /* renamed from: a */
    public void m5376a(float f, Unit unit, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f1025Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f980g.f1104g) {
            f3 = 1.0f;
        }
        float f4 = f3 * this.f1024Y;
        m5372a(unit);
        m5368a(this.f983j, unit, this.f980g.m5353a(unit, f4, true), this, true);
        if (this.f1040ao) {
            if (this.f1041ap == null) {
                this.f1041ap = new C1101m();
            }
            this.f1041ap.add(unit);
        }
    }

    /* renamed from: a */
    public boolean m5367a(GameEngine gameEngine) {
        if (gameEngine.f6245cN.m6034b(this.f6951ek, this.f6952el)) {
            return true;
        }
        if ((this.f1001B || this.f1004E || this.f980g.f1178X) && this.f985l != null && gameEngine.f6245cN.m6034b(this.f985l.f6951ek, this.f985l.f6952el)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m5362c(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.f1018S || this.f982i > 0.0f) {
            return false;
        }
        C0189g c0189g = this.f980g;
        GameEngine m1234A = GameEngine.m1234A();
        InterfaceC1027y interfaceC1027y = m1234A.f6107bO;
        float f5 = this.f6951ek - m1234A.f6138cv;
        float f6 = this.f6952el - m1234A.f6139cw;
        if (this.f985l != null) {
            f2 = this.f985l.f6951ek;
            f3 = this.f985l.f6952el;
            f4 = this.f985l.f6953em;
        } else {
            f2 = this.f987n;
            f3 = this.f988o;
            f4 = this.f989p;
        }
        if (!this.f1077aZ && !this.f1003D) {
            boolean z = false;
            if (this.f1000A) {
                if (this.f985l != null) {
                    if (!m1234A.f6104bL.m5510a(this.f985l.f6951ek, this.f985l.f6952el, m1234A.f6093bs)) {
                        z = true;
                    }
                } else if (this.f986m && !m1234A.f6104bL.m5510a(this.f987n, this.f988o, m1234A.f6093bs)) {
                    z = true;
                }
            }
            if (!m1234A.f6104bL.m5510a(this.f6951ek, this.f6952el, m1234A.f6093bs) && !z) {
                return false;
            }
            this.f1077aZ = true;
        }
        if (this.f1004E || c0189g.f1178X) {
            if (c0189g.f1121Y != null) {
                Paint m5357f = m5357f();
                float f7 = 0.0f;
                if (c0189g.f1126ad != 0.0f) {
                    f7 = 0.0f + (c0189g.f1126ad * this.f1009J);
                }
                float f8 = this.f6951ek - m1234A.f6138cv;
                float f9 = (this.f6952el - m1234A.f6139cw) - this.f6953em;
                float f10 = (f2 - m1234A.f6138cv) + this.f1010K;
                float f11 = ((f3 - f4) - m1234A.f6139cw) + this.f1011L;
                float f12 = (f10 + f8) * 0.5f;
                float f13 = (f11 + f9) * 0.5f;
                float m2309b = C0758f.m2309b(f12, f13, f10, f11);
                float m2275d = C0758f.m2275d(f12, f13, f10, f11);
                interfaceC1027y.mo878k();
                f1088f.m6040a(f12 - c0189g.f1121Y.f6398r, f13 - m2309b, f12 + c0189g.f1121Y.f6398r, f13 + m2309b);
                interfaceC1027y.mo934a(m2275d + 90.0f, f12, f13);
                interfaceC1027y.mo908a(c0189g.f1121Y, f1088f, m5357f, 0.0f, f7, 0, 0);
                interfaceC1027y.mo877l();
                if (c0189g.f1122Z != null) {
                    if (c0189g.f1123aa) {
                        interfaceC1027y.mo878k();
                        interfaceC1027y.mo934a(m2275d + 90.0f, f8, f9);
                        interfaceC1027y.mo915a(c0189g.f1122Z, f8, f9, m5357f);
                        interfaceC1027y.mo877l();
                    } else {
                        interfaceC1027y.mo915a(c0189g.f1122Z, f8, f9, m5357f);
                    }
                }
                if (c0189g.f1124ab != null) {
                    if (c0189g.f1125ac) {
                        interfaceC1027y.mo878k();
                        interfaceC1027y.mo934a(m2275d + 90.0f, f10, f11);
                        interfaceC1027y.mo915a(c0189g.f1124ab, f10, f11, m5357f);
                        interfaceC1027y.mo877l();
                        return true;
                    }
                    interfaceC1027y.mo915a(c0189g.f1124ab, f10, f11, m5357f);
                    return true;
                }
                return true;
            }
            f1094bf.m6082c((int) (60.0f + (m5359e() * 60.0f)));
            float f14 = (f2 - m1234A.f6138cv) + this.f1010K;
            float f15 = ((f3 - f4) - m1234A.f6139cw) + this.f1011L;
            f1094bf.m6115a(6.0f);
            interfaceC1027y.mo932a(this.f6951ek - m1234A.f6138cv, (this.f6952el - m1234A.f6139cw) - this.f6953em, f14, f15, f1094bf);
            f1094bf.m6115a(3.0f);
            interfaceC1027y.mo932a(this.f6951ek - m1234A.f6138cv, (this.f6952el - m1234A.f6139cw) - this.f6953em, f14, f15, f1094bf);
            interfaceC1027y.mo931a(f14, f15, 8.0f, f1094bf);
            interfaceC1027y.mo931a(f14, f15, 5.0f, f1094bf);
            return true;
        } else if (this.f1001B) {
            float f16 = (f2 - m1234A.f6138cv) + this.f1010K;
            float f17 = ((f3 - f4) - m1234A.f6139cw) + this.f1011L;
            f1092bd.m6087b(this.f1042ar);
            f1093be.m6087b(this.f1042ar);
            f1093be.m6082c((int) (f1093be.m6073f() * 0.5f));
            interfaceC1027y.mo932a(this.f6951ek - m1234A.f6138cv, (this.f6952el - m1234A.f6139cw) - this.f6953em, f16, f17, f1093be);
            interfaceC1027y.mo932a(this.f6951ek - m1234A.f6138cv, (this.f6952el - m1234A.f6139cw) - this.f6953em, f16, f17, f1092bd);
            interfaceC1027y.mo931a(f16, f17, 5.0f, f1092bd);
            return true;
        } else if (this.f1012M) {
            this.f1013N = C0758f.m2363a(this.f1013N, f);
            if (this.f1014O == null) {
                this.f1014O = new float[20];
                this.f1013N = 0.0f;
            }
            if (this.f1013N == 0.0f) {
                this.f1013N = 4.0f;
                for (int i = 0; i < this.f1014O.length; i++) {
                    this.f1014O[i] = C0758f.m2288c(-10.0f, 10.0f);
                }
            }
            float f18 = this.f6951ek - m1234A.f6138cv;
            float f19 = (this.f6952el - m1234A.f6139cw) - this.f6953em;
            float f20 = f2 - m1234A.f6138cv;
            float f21 = (f3 - f4) - m1234A.f6139cw;
            float m2286c = C0758f.m2286c(f18, f19, f20, f21);
            int length = this.f1014O.length;
            if (m2286c < 200.0f) {
                length = C0758f.m2306b(0, length - 5);
            } else if (m2286c < 100.0f) {
                length = C0758f.m2306b(0, length - 10);
            }
            float f22 = m2286c / (length - 1);
            float m2275d2 = C0758f.m2275d(f18, f19, f20, f21);
            float f23 = f18;
            float f24 = f19;
            float m2244i = C0758f.m2244i(m2275d2);
            float m2249h = C0758f.m2249h(m2275d2);
            for (int i2 = 0; i2 < length; i2++) {
                float f25 = this.f1014O[i2];
                float f26 = f18 + (m2244i * i2 * f22);
                float f27 = f19 + (m2249h * i2 * f22);
                if (i2 != length - 1) {
                    f26 -= m2249h * f25;
                    f27 += m2244i * f25;
                }
                interfaceC1027y.mo932a(f23, f24, f26, f27, f1095bg);
                f23 = f26;
                f24 = f27;
            }
            return true;
        } else if (this.f1015P != -1) {
            C0934e c0934e = f1084b;
            int i3 = 20;
            int i4 = 20;
            if (this.f1017R == 1) {
                c0934e = f1086d;
                i3 = 60;
                i4 = 60;
            } else if (this.f1017R == 2) {
                c0934e = f1085c;
                i3 = 20;
                i4 = 20;
            }
            if (c0189g.f1111C != null) {
                C1117y.m484a(c0189g.f1111C, f5, f6, 0.0f, this.f1071aT, this.f997x, f1097bc, c0189g.f1111C.f6396p, c0189g.f1111C.f6397q, 0);
            } else if (this.f1016Q != -1 && this.f999z) {
                C1117y.m484a(c0934e, f5, f6, 0.0f, this.f1071aT, this.f997x, f1097bc, i3, i4, this.f1016Q);
            }
            if (c0189g.f1110B != null) {
                c0934e = c0189g.f1110B;
                i3 = c0189g.f1110B.f6396p;
                i4 = c0189g.f1110B.f6397q;
            }
            C1117y.m484a(c0934e, f5, f6, this.f6953em, this.f1071aT, this.f997x, m5357f(), i3, i4, this.f1015P);
            return true;
        } else {
            f1091bb.m6087b(this.f1042ar);
            if (this.f6953em > 0.0f && this.f999z) {
                interfaceC1027y.mo931a(f5, f6, this.f997x, f1097bc);
            }
            interfaceC1027y.mo931a(f5, f6 - this.f6953em, this.f997x, f1091bb);
            if (this.f998y > 0.0f) {
                f1091bb.m6082c(f1091bb.m6073f() / 3);
                interfaceC1027y.mo931a(f5, f6 - this.f6953em, this.f998y, f1091bb);
                return true;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void m5375a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m5360d(float f) {
    }

    /* renamed from: e */
    public void m5358e(float f) {
    }

    /* renamed from: f */
    public boolean m5356f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m5357f() {
        C0930ag c0930ag;
        if (this.f1042ar != f1089aq) {
            if (GameEngine.m1159as()) {
                c0930ag = m5374a(this.f1042ar);
            } else {
                c0930ag = f1091bb;
                c0930ag.m6087b(this.f1042ar);
            }
        } else {
            c0930ag = f1090ba;
        }
        return c0930ag;
    }

    /* renamed from: a */
    public C0930ag m5374a(int i) {
        if (this.f1079bj != null) {
            return this.f1079bj;
        }
        if (f1080bk != null && f1081bl == i) {
            this.f1079bj = f1080bk;
            return this.f1079bj;
        }
        C0930ag c0930ag = new C0930ag();
        c0930ag.m6109a(new LightingColorFilter(i, 0));
        c0930ag.m6087b(i);
        f1080bk = c0930ag;
        f1081bl = i;
        this.f1079bj = c0930ag;
        return this.f1079bj;
    }

    /* renamed from: a */
    public void m5377a(float f, float f2, C0449h c0449h) {
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f983j == null) {
            GameEngine.m1145b("Projectile: cannot Retarget: source==null");
            return;
        }
        float m2244i = this.f6951ek + (C0758f.m2244i(this.f1050az) * f2);
        float m2249h = this.f6952el + (C0758f.m2249h(this.f1050az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        Unit unit = null;
        if (this.f983j instanceof AbstractC0623y) {
            abstractC0623y = (AbstractC0623y) this.f983j;
            unit = abstractC0623y.m3144ab();
        }
        Iterator it = m1234A.f6121cc.m3543a(m2244i, m2249h, f).iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (this.f983j.f1608bV != unit2.f1608bV) {
                boolean z = true;
                if (abstractC0623y != null) {
                    z = abstractC0623y.m3110b(unit2, true);
                }
                if (z && this.f984k >= 0 && abstractC0623y != null && this.f984k < abstractC0623y.mo3451bl() && !abstractC0623y.mo3202a((int) this.f984k, unit2, true, false)) {
                    z = false;
                }
                if (c0449h != null && !C0448g.m4162a(c0449h, unit2.mo4069dc())) {
                    z = false;
                }
                if (z) {
                    float m2361a = C0758f.m2361a(m2244i, m2249h, unit2.f6951ek, unit2.f6952el);
                    boolean z2 = false;
                    if (f4 == -1.0f || m2361a < f4) {
                        z2 = true;
                    }
                    if (unit == unit2) {
                        z2 = true;
                    }
                    if (z2 && m2361a < f3) {
                        f4 = m2361a;
                        this.f985l = unit2;
                    }
                }
            }
        }
    }
}
