package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.FogRevealer;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.custom.C0382aw;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.EnumC0383ax;
import com.corrodinggames.rts.gameFramework.AbstractC0668az;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0878m;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class Projectile extends AbstractC0668az {

    /* renamed from: g */
    public C0189g f980g;

    /* renamed from: h */
    public float lifeTimer;

    /* renamed from: i */
    public float f982i;

    /* renamed from: j */
    public Unit f983j;

    /* renamed from: k */
    public short f984k;

    /* renamed from: l */
    public Unit target;

    /* renamed from: m */
    public boolean f986m;

    /* renamed from: n */
    public float f987n;

    /* renamed from: o */
    public float f988o;

    /* renamed from: p */
    public float f989p;

    /* renamed from: q */
    public Projectile f990q;

    /* renamed from: r */
    public float f991r;

    /* renamed from: s */
    public float f992s;

    /* renamed from: t */
    public float speed;

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
    public float x;

    /* renamed from: L */
    public float y;

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
    public float directDamage;

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
    public int color;

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
    private static final Projectile f1083bm = new Projectile(true);

    /* renamed from: b */
    static BitmapOrTexture f1084b = null;

    /* renamed from: c */
    static BitmapOrTexture f1085c = null;

    /* renamed from: d */
    static BitmapOrTexture f1086d = null;

    /* renamed from: e */
    static final Rect f1087e = new Rect();

    /* renamed from: f */
    static final RectF f1088f = new RectF();

    /* renamed from: aq */
    static final int f1089aq = Color.argb(255, 255, 255, 255);

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
        f1097bc.m7242b(-16777216);
        f1097bc.m7237c(108);
        f1092bd.m7267a(80, 255, 0, 0);
        f1092bd.m7248a(true);
        f1092bd.m7270a(5.0f);
        f1093be.m7267a(30, 255, 0, 0);
        f1093be.m7248a(true);
        f1093be.m7270a(8.0f);
        f1094bf.m7267a(80, 128, 166, 255);
        f1094bf.m7248a(true);
        f1094bf.m7270a(5.0f);
        f1095bg.m7267a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1095bg.m7248a(true);
        f1095bg.m7270a(3.0f);
        f1096bh.m7267a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1096bh.m7248a(true);
        f1096bh.m7270a(8.0f);
        f1078bi = new C1112u();
        f1080bk = null;
        f1081bl = 0;
    }

    public Projectile(boolean z) {
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
        this.color = f1089aq;
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
    public void mo2880a() {
        f1082a.remove(this);
        super.mo2880a();
    }

    /* renamed from: a */
    public static Projectile m6511a(Projectile projectile) {
        Projectile projectile2 = f1083bm;
        projectile2.f1054aD = -1;
        if (projectile == null) {
            projectile2.f1038am = 1.0f;
            projectile2.f1036ak = 1.0f;
            projectile2.f1037al = 1.0f;
            projectile2.f1039an = 0.0f;
        } else {
            projectile2.f1038am = projectile.f1038am;
            projectile2.f1036ak = projectile.f1036ak;
            projectile2.f1037al = projectile.f1037al;
            projectile2.f1039an = projectile.f1039an;
        }
        return projectile2;
    }

    /* renamed from: a */
    public void m6508a(Unit unit, float f, float f2, float f3) {
        this.f983j = unit;
        this.f6951ek = f;
        this.f6952el = f2;
        this.height = f3;
        this.f1069bn = false;
        this.f1021V = false;
    }

    /* renamed from: b */
    public void m6504b() {
        if (this.f1003D) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0745e m2531d = gameEngine.effects.m2531d(this.f6951ek, this.f6952el, this.height, 0);
            if (m2531d != null) {
                m2531d.f4730H = 0.7f;
                m2531d.f4729G = 2.1f;
                m2531d.f4786ar = (short) 2;
                m2531d.f4745W = 90.0f;
                m2531d.f4746X = m2531d.f4745W;
            }
            gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        }
        mo2880a();
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.lifeTimer);
        c0859ar.mo1486a(this.f983j);
        c0859ar.mo1486a(this.target);
        c0859ar.mo1488a(this.speed);
        c0859ar.mo1487a(99);
        c0859ar.mo1482a(this.f1000A);
        c0859ar.mo1482a(this.f1001B);
        c0859ar.mo1482a(this.f1018S);
        c0859ar.mo1482a(this.f1019T);
        c0859ar.mo1488a(this.directDamage);
        c0859ar.mo1488a(this.f1024Y);
        c0859ar.mo1488a(this.f1025Z);
        c0859ar.mo1487a(this.color);
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
        c0859ar.mo1488a(this.x);
        c0859ar.mo1488a(this.y);
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
        C0448g.m5060a(this.f1055aE, c0859ar);
        c0859ar.mo1488a(this.f1036ak);
        c0859ar.mo1488a(this.f1037al);
        c0859ar.mo1482a(this.f1027ab);
        c0859ar.mo1482a(this.f1028ac);
        c0859ar.mo1488a(this.f1039an);
        c0859ar.mo1482a(false);
        C0189g.m6494a(this.f980g, c0859ar);
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
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.lifeTimer = c0876k.m1453g();
        this.f983j = c0876k.m1445o();
        this.target = c0876k.m1470a(EnumC0878m.f5864a);
        this.speed = c0876k.m1453g();
        this.f997x = c0876k.m1454f();
        this.f1000A = c0876k.m1455e();
        this.f1001B = c0876k.m1455e();
        this.f1018S = c0876k.m1455e();
        this.f1019T = c0876k.m1455e();
        this.directDamage = c0876k.m1453g();
        this.f1024Y = c0876k.m1453g();
        this.f1025Z = c0876k.m1453g();
        this.color = c0876k.m1454f();
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
            this.x = c0876k.m1453g();
            this.y = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 29) {
            this.f986m = c0876k.m1455e();
            this.f987n = c0876k.m1453g();
            this.f988o = c0876k.m1453g();
            this.f1002C = c0876k.m1455e();
            this.f1003D = c0876k.m1455e();
            this.f990q = (Projectile) c0876k.m1468a(Projectile.class);
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
            this.f1055aE = C0448g.m5059a(c0876k);
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
            C0413bn.m5258a(c0876k, true);
        }
        if (c0876k.m1463b() >= 68) {
            this.f1039an = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 77) {
            c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 78) {
            this.f980g = C0189g.m6491a(c0876k);
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
        super.mo2877a(c0876k);
    }

    /* renamed from: c */
    public static void m6501c() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1084b = gameEngine.graphics.loadImage(R.drawable.projectiles);
        f1085c = gameEngine.graphics.loadImage(R.drawable.projectiles2);
        f1086d = gameEngine.graphics.loadImage(R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m6500d() {
        this.f1070aS = true;
    }

    /* renamed from: a */
    public static Projectile m6509a(Unit unit, float f, float f2) {
        Projectile projectile = new Projectile(false);
        projectile.f983j = unit;
        projectile.f6951ek = f;
        projectile.f6952el = f2;
        projectile.color = Color.argb(255, 100, 30, 30);
        projectile.f6950ej = unit.f6950ej + 1;
        projectile.f6949ei = 4;
        return projectile;
    }

    /* renamed from: a */
    public static Projectile createProjectile(Unit unit, float f, float f2, float f3, int i) {
        Projectile m6509a = m6509a(unit, f, f2);
        m6509a.height = f3;
        m6509a.f984k = (short) i;
        m6509a.f1008I = CommonUtils.m2306b(unit, 0.0f, 1.0f, unit.f1587bB);
        unit.f1587bB++;
        return m6509a;
    }

    /* renamed from: a */
    public void m6510a(Unit unit) {
        float f;
        if ((this.f1032ag == 0.0f && this.f1033ah == 0.0f) || unit.m5867bI()) {
            return;
        }
        if (CommonUtils.m2366a(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el) > 100.0f) {
            f = CommonUtils.m2280d(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el);
        } else {
            f = this.f1050az;
        }
        float mo3513bN = this.f1033ah + (this.f1032ag / unit.mo3513bN());
        unit.f1613ca += CommonUtils.m2249i(f) * mo3513bN;
        unit.f1614cb += CommonUtils.sin(f) * mo3513bN;
    }

    /* renamed from: a */
    public static void m6506a(Unit unit, Unit unit2, float f, Projectile projectile, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6095bw && f > 0.0f) {
            f = 0.0f;
        }
        if (unit2 != null && !unit2.isDead) {
            if (projectile != null && projectile.f980g.f1150bc && unit != null) {
                unit2.m5773e(unit.team);
            }
            if (projectile != null) {
                if (projectile.f1034ai != 1.0f && unit2.m5867bI()) {
                    f *= projectile.f1034ai;
                }
                if (projectile.f1035aj != 1.0f && unit2.mo3293i()) {
                    f *= projectile.f1035aj;
                }
            }
            if (f < 0.0f) {
                unit2.m5872b(unit, -f, projectile);
            } else {
                boolean z2 = !unit2.isDead && unit2.f1631cs > 0.0f;
                unit2.mo4499a(unit, f, projectile);
                float f2 = f;
                if (unit2.m5906J()) {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    gameEngine.f6117bY.m2619a(unit, unit2, f2);
                }
                if (unit != null) {
                    unit.f1658cT += f2;
                    if (z2 && (unit2.isDead || unit2.f1631cs < 0.0f)) {
                        unit.f1657cS++;
                        unit.m5888a(EnumC0347ae.f2174d, unit2);
                    }
                }
            }
            if (projectile != null && !unit2.isDead) {
                float m5861bQ = unit2.m5861bQ();
                if (m5861bQ != -1.0f) {
                    float m2280d = CommonUtils.m2280d(projectile.f6951ek, projectile.f6952el, unit2.f6951ek, unit2.f6952el);
                    float f3 = 100.0f / m5861bQ;
                    unit2.f1613ca += CommonUtils.m2249i(m2280d) * f3;
                    unit2.f1614cb += CommonUtils.sin(m2280d) * f3;
                }
            }
        }
    }

    /* renamed from: e */
    public float m6498e() {
        float f = 1.0f;
        if (this.f1009J < this.f1005F) {
            f = this.f1009J / this.f1005F;
        }
        return f;
    }

    /* renamed from: a */
    public void update(float f) {
        float m2280d;
        float m2366a;
        float f2;
        float f3;
        C0745e m2531d;
        C0745e m2531d2;
        C0467y m6493a;
        C0745e m2537b;
        float f4;
        float f5;
        float f6;
        float f7;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1070aS) {
            mo2880a();
        }
        if (this.target == null && !this.f1053aC) {
            mo2880a();
            return;
        }
        if (this.f982i > 0.0f) {
            this.f982i = CommonUtils.m2368a(this.f982i, f);
            if (this.f982i > 0.0f) {
                return;
            }
        }
        C0189g c0189g = this.f980g;
        if (this.f982i == 0.0f) {
            this.f982i = -1.0f;
            if (c0189g.f1131al != null) {
                c0189g.f1131al.m5277a(this.f6951ek, this.f6952el, this.height, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, null);
            }
        }
        this.lifeTimer = CommonUtils.m2368a(this.lifeTimer, f);
        boolean z = false;
        if (this.f1057aG) {
            if (this.target == null) {
                z = true;
            } else if (this.target.isDead) {
                z = true;
            }
        }
        if (z) {
            m6515a(c0189g.f1191ax, c0189g.f1192ay, (C0449h) null);
        }
        if (c0189g.f1134az) {
            this.f1056aF = CommonUtils.m2368a(this.f1056aF, f);
            if (this.f1056aF == 0.0f) {
                this.f1056aF = c0189g.f1193aA;
                m6515a(c0189g.f1194aB, c0189g.f1195aC, c0189g.f1135aD);
            }
        }
        if (c0189g.f1118R != 0.0f || c0189g.f1119S != 0.0f) {
            float f8 = c0189g.f1118R;
            if (this.target != null) {
                f8 += this.target.radius * c0189g.f1119S;
            }
            this.x = CommonUtils.sin(((360.0f * this.f1008I) + (this.f1009J * 1.0f)) % 360.0f) * f8;
            this.y = CommonUtils.sin(((360.0f * this.f1008I) + (this.f1009J * 1.5f)) % 360.0f) * f8;
        }
        if (this.f1004E && this.target != null) {
            this.x = CommonUtils.sin((this.f1009J * 1.0f) % 360.0f) * this.target.radius * 0.4f;
            this.y = CommonUtils.sin((this.f1009J * 1.5f) % 360.0f) * this.target.radius * 0.4f;
            float f9 = this.target.f6951ek + this.x;
            float f10 = this.target.f6952el + this.y;
            if (this.f6948eh) {
                this.f1064aN += f;
                this.f1065aO += f;
                if (this.f1064aN > 11.0f) {
                    this.f1064aN = CommonUtils.rnd(1.0f, 4.0f);
                    C0745e m2537b2 = gameEngine.effects.m2537b(f9, f10, this.target.height, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
                    if (m2537b2 != null) {
                        m2537b2.f4763aq = 0;
                        m2537b2.f4762ap = 0;
                        m2537b2.f4786ar = (short) 2;
                        m2537b2.f4720s = true;
                        m2537b2.f4728F = 0.5f;
                        m2537b2.f4746X = 60.0f;
                        m2537b2.f4745W = 60.0f;
                        m2537b2.f4730H = 0.7f;
                        m2537b2.f4729G = 0.3f;
                        m2537b2.f4787as = false;
                        m2537b2.f4739Q = CommonUtils.rnd(-0.3f, 0.3f);
                        m2537b2.f4740R = (-0.9f) + CommonUtils.rnd(-0.3f, 0.3f);
                    }
                }
                if (this.f1065aO > 75.0f) {
                    this.f1065aO = CommonUtils.rnd(1.0f, 20.0f);
                    gameEngine.effects.m2542b(f9, f10, this.target.height);
                }
            }
        }
        float f11 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.f1053aC) {
            float f12 = this.target.f6951ek + this.x;
            float f13 = this.target.f6952el + this.y;
            float f14 = this.target.height;
            m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f12, f13);
            m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f12, f13);
            f2 = f14;
            f3 = f2 - this.height;
            f11 = this.target.radius;
            z2 = this.target instanceof AbstractC0488d;
            z3 = this.target.f1634cv > 10.0f + this.directDamage;
        } else {
            float f15 = this.f1050az;
            if (this.f990q != null) {
                float f16 = this.f990q.f6951ek + this.x;
                float f17 = this.f990q.f6952el + this.y;
                float f18 = this.f990q.height;
                m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f16, f17);
                m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f16, f17);
                f2 = f18;
                f3 = f2 - this.height;
            } else if (this.target != null) {
                float f19 = this.target.f6951ek + this.x;
                float f20 = this.target.f6952el + this.y;
                float f21 = this.target.height;
                m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f19, f20);
                m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f19, f20);
                f2 = f21;
                f3 = f2 - this.height;
                f11 = this.target.radius;
                z2 = this.target instanceof AbstractC0488d;
                z3 = this.target.f1634cv > 10.0f + this.directDamage;
            } else if (this.f986m) {
                float f22 = this.f987n + this.x;
                float f23 = this.f988o + this.y;
                float f24 = this.f989p;
                m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f22, f23);
                m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f22, f23);
                f2 = f24;
                f3 = f2 - this.height;
            } else {
                float f25 = this.f987n + this.x;
                float f26 = this.f988o + this.y;
                m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f25, f26);
                m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f25, f26);
                f2 = 0.0f;
                f3 = 0.0f - this.height;
            }
        }
        float f27 = c0189g.f1173O;
        if (m2366a < 225.0f) {
            f27 = c0189g.f1174P;
        }
        if (f27 >= 0.0f) {
            this.f1050az += CommonUtils.m2292c(this.f1050az, m2280d, f27 * f);
            m2280d = this.f1050az;
        } else {
            this.f1050az = m2280d;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f28 = m2280d;
        if (this.f1045au != null && !this.f1045au.f6946ef) {
            if (this.f1046av >= 0) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) this.f1045au;
                if (this.f1046av >= abstractC0623y.mo3512bl()) {
                    this.f1046av = 0;
                }
                C1080ai m3250D = abstractC0623y.m3250D(this.f1046av);
                f5 = m3250D.f6843a;
                f6 = m3250D.f6844b;
                f7 = this.f983j.height + m3250D.f6845c;
            } else {
                f5 = this.f1045au.f6951ek;
                f6 = this.f1045au.f6952el;
                f7 = this.f1045au.height;
            }
            float f29 = f5 - this.f1047aw;
            float f30 = f6 - this.f1048ax;
            float f31 = f7 - this.f1049ay;
            this.f6951ek += f29;
            this.f6952el += f30;
            this.height += f31;
            this.f1047aw = f5;
            this.f1048ax = f6;
            this.f1049ay = f7;
        }
        if (!this.f1000A) {
            this.f6951ek += this.f994u * f;
            this.f6952el += this.f995v * f;
            if (this.f996w != 0.0f) {
                this.height += this.f996w * f;
                f3 = f2 - this.height;
            }
            if (this.height > 0.0f) {
                if (c0189g.f1115G != 0.0f) {
                    this.height -= c0189g.f1115G * f;
                    f3 = f2 - this.height;
                }
                if (c0189g.f1116H != 0.0f) {
                    this.f996w -= c0189g.f1116H * f;
                }
            }
            if (!this.f1058aH || this.f1059aI < this.height || this.f1061aK) {
                float f32 = this.speed * f;
                z4 = true;
                if (m2366a < f32 * f32) {
                    f32 = CommonUtils.m2369a(m2366a);
                    m2366a = 0.0f;
                }
                this.f6951ek += CommonUtils.m2249i(m2280d) * f32;
                this.f6952el += CommonUtils.sin(m2280d) * f32;
            }
            if (this.f1058aH) {
                if (this.f1062aL < 0.0f) {
                    f4 = this.speed * f;
                    z4 = true;
                } else {
                    f4 = this.f1062aL * f;
                }
                if (!this.f1061aK) {
                    this.height = CommonUtils.m2367a(this.height, this.f1060aJ, f4);
                    if (this.height < this.f1059aI) {
                        f28 = -90.0f;
                    }
                    if (this.height >= this.f1060aJ) {
                        this.f1061aK = true;
                    }
                } else if (m2366a < 400.0f) {
                    this.height = CommonUtils.m2367a(this.height, f2, f4);
                    if (CommonUtils.m2294c(this.height - f2) > 0.5f) {
                        f28 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f33 = f3;
                float f34 = this.speed * f;
                z4 = true;
                if (f33 != 0.0f) {
                    if (m2366a > 0.1d) {
                        f34 = CommonUtils.m2316b((CommonUtils.m2294c(f33) / CommonUtils.m2369a(m2366a)) * this.speed * f, this.speed * f);
                    }
                    this.height += CommonUtils.m2316b(f3, f34);
                    f3 = f2 - this.height;
                }
            }
        }
        if (z4 && this.f991r > 0.0f) {
            this.speed = CommonUtils.m2367a(this.speed, this.f991r, this.f992s * f);
        }
        if (c0189g.f1132am != 0.0f) {
            float sin = CommonUtils.sin((((this.f1009J * 360.0f) / c0189g.f1182an) + (360.0f * this.f1008I)) % 360.0f) * c0189g.f1132am * f;
            this.f6951ek += CommonUtils.m2249i(m2280d + 90.0f) * sin;
            this.f6952el += CommonUtils.sin(m2280d + 90.0f) * sin;
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
                    c0189g.f1127ah.m4678a(this.f6951ek, this.f6952el, this.height, this.f1071aT, this);
                }
                if (this.f1063aM && (m2537b = gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4702a, z6, EnumC0748h.f4827b)) != null) {
                    if (this.height >= 0.0f) {
                        m2537b.f4763aq = 0;
                        m2537b.f4762ap = 0;
                        m2537b.f4786ar = (short) 2;
                        m2537b.f4720s = true;
                        m2537b.f4728F = 0.5f;
                        m2537b.f4745W = 70.0f;
                        m2537b.f4746X = m2537b.f4745W;
                        m2537b.f4787as = true;
                        if (z5) {
                            m2537b.f4787as = false;
                        }
                        m2537b.f4740R = 0.1f;
                        m2537b.f4721t = true;
                        m2537b.f4722u = 5.0f;
                        m2537b.f4730H = 0.5f;
                        m2537b.f4729G = 1.2f;
                        m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
                        if (this.f1003D) {
                            m2537b.f4730H = 0.5f;
                            m2537b.f4729G = 2.1f;
                        }
                    } else {
                        m2537b.f4763aq = 9;
                        m2537b.f4762ap = 1;
                        m2537b.f4786ar = (short) 1;
                        m2537b.f4720s = true;
                        m2537b.f4728F = 0.5f;
                        m2537b.f4746X = 60.0f;
                        m2537b.f4745W = 60.0f;
                        m2537b.f4740R = 0.1f;
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
                f36 = 3.0f + CommonUtils.m2294c(this.f996w * f) + CommonUtils.m2294c(c0189g.f1115G * f);
            }
            if (m2366a < f35 * f35 && CommonUtils.m2294c(f3) < f36) {
                z7 = true;
                unit = this.target;
            }
            if (this.f1000A) {
                z7 = true;
                unit = this.target;
            }
            if (this.f1031af && this.lifeTimer == 0.0f) {
                z7 = true;
            }
            if (this.f1043as) {
                float f37 = this.f1051aA + 50.0f;
                Unit[] m523a = Unit.f1589bD.m523a();
                int size = Unit.f1589bD.size();
                for (int i = 0; i < size; i++) {
                    Unit unit2 = m523a[i];
                    if (unit2.f6951ek + f37 > this.f6951ek && unit2.f6951ek - f37 < this.f6951ek && unit2.f6952el + f37 > this.f6952el && unit2.f6952el - f37 < this.f6952el && unit2.collidable && false == unit2.mo3293i() && unit2.f1650cL == null) {
                        float m2366a2 = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit2.f6951ek, unit2.f6952el);
                        float f38 = this.f1051aA + unit2.radius;
                        if (m2366a2 < f38 * f38) {
                            z7 = true;
                            unit = unit2;
                        }
                    }
                }
            }
            if (this.f1044at) {
                gameEngine.f6104bL.m6652a(this.f6951ek, this.f6952el);
                if (gameEngine.f6113bU.m1313a(EnumC0246ao.f1707f, gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.f1053aC) {
            }
            if (this.f1076aY && (((this.f1058aH && z5 && this.height < 30.0f) || z7) && this.f983j != null)) {
                this.f1076aY = false;
                FogRevealer fogRevealer = new FogRevealer(false);
                fogRevealer.f6951ek = this.f6951ek;
                fogRevealer.f6952el = this.f6952el;
                fogRevealer.mo3120b(this.f983j.team);
                fogRevealer.f3878a = 15;
                fogRevealer.f3879b = 360.0f;
                Team.m6353c(fogRevealer);
            }
            if (z7) {
                this.f1069bn = true;
                this.f1073aV = this.f6951ek;
                this.f1074aW = this.f6952el;
                this.f1075aX = this.height;
                if (this.f1000A) {
                    if (this.f1053aC) {
                        this.f1073aV = this.f987n;
                        this.f1074aW = this.f988o;
                        this.f1075aX = 0.0f;
                    }
                    if (this.target != null) {
                        this.f1073aV = this.target.f6951ek + this.x;
                        this.f1074aW = this.target.f6952el + this.y;
                        this.f1075aX = this.target.height;
                    }
                }
                if (!this.f1001B && !this.f1012M && !c0189g.f1178X) {
                    this.f1018S = false;
                }
                boolean z9 = false;
                if (this.target != null) {
                    z9 = this.target.f1634cv > 10.0f;
                }
                C0467y c0467y = c0189g.f1145aX;
                if (z9) {
                    c0467y = c0189g.f1146aY;
                }
                if (this.target != null && (m6493a = c0189g.m6493a(this.target)) != null) {
                    c0467y = m6493a;
                }
                if (c0467y != null) {
                    c0467y.m4678a(this.f1073aV, this.f1074aW, this.f1075aX, this.f1071aT, this.target);
                }
                if (c0189g.f1129aj != null) {
                    c0189g.f1129aj.m5277a(this.f6951ek, this.f6952el, this.height, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, this.target);
                }
                if (c0189g.f1147aZ != null && this.f983j != null) {
                    c0189g.f1147aZ.m5262a(this.f1073aV, this.f1074aW, 0.0f, this.f1050az, this.f983j.team, false, this.f983j);
                }
                if (c0189g.f1148ba > 0 && this.f983j != null && (this.f983j instanceof C0451j)) {
                    C0451j c0451j = (C0451j) this.f983j;
                    for (int i2 = 0; i2 < c0189g.f1148ba; i2++) {
                        if (c0451j.f2865A != null && c0451j.f2865A.size() > 0) {
                            Unit unit3 = (Unit) c0451j.f2865A.remove(c0451j.f2865A.size() - 1);
                            C1117y.m489a(unit3, c0451j);
                            unit3.f6951ek = this.f1073aV;
                            unit3.f6952el = this.f1074aW;
                            unit3.direction = this.f1050az;
                            unit3.f1614cb = 0.0f;
                            unit3.f1613ca = 0.0f;
                            unit3.f1610bX = 0.0f;
                            unit3.f1611bY = 0.0f;
                            if (unit3 instanceof AbstractC0623y) {
                                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit3;
                                abstractC0623y2.m3127az();
                                abstractC0623y2.m3049j(unit3.direction);
                                if (unit3 instanceof C0451j) {
                                    ((C0451j) unit3).m4861dD();
                                }
                            }
                            c0451j.m5036D(unit3);
                        }
                    }
                }
                if (c0189g.f1149bb && this.f983j != null) {
                    this.f983j.m5767f(this.f1073aV, this.f1074aW);
                }
                if (!z8 && unit != null) {
                    if (this.f1004E) {
                        this.f1069bn = false;
                        float m6498e = (this.directDamage / 60.0f) * f * m6498e();
                        if (this.f1025Z == 0.0f) {
                            m6510a(unit);
                        }
                        m6506a(this.f983j, unit, c0189g.m6492a(unit, m6498e, true), this, false);
                    } else {
                        if (this.f1025Z == 0.0f) {
                            m6510a(unit);
                        }
                        m6506a(this.f983j, unit, c0189g.m6492a(unit, this.directDamage, false), this, false);
                    }
                }
                if (this.f990q != null) {
                    if (c0189g.f1101d) {
                        this.f990q.lifeTimer = 0.0f;
                    } else {
                        this.f990q.m6504b();
                    }
                    mo2880a();
                }
                if (!this.f1004E) {
                    boolean z10 = true;
                    if (this.target != null && this.target.f1634cv > 10.0f) {
                        z10 = false;
                        if (c0189g.f1146aY == null && (m2531d2 = gameEngine.effects.m2531d(this.f1073aV, this.f1074aW, this.f1075aX, -1127220)) != null) {
                            m2531d2.f4745W = 10.0f;
                            m2531d2.f4729G = 0.5f;
                            if (this.f1067aQ) {
                                m2531d2.f4745W = 25.0f;
                                m2531d2.f4729G = 1.0f;
                            }
                            m2531d2.f4786ar = (short) 2;
                            m2531d2.f4746X = m2531d2.f4745W;
                        }
                    }
                    if (this.f1006G) {
                        z10 = false;
                        C0746f.m2512b(this.f6951ek, this.f6952el).f4789a = 21.0f;
                    }
                    if (z10) {
                        if (!this.f1067aQ) {
                            if (c0189g.f1145aX == null) {
                                gameEngine.effects.m2535c(this.f1073aV, this.f1074aW, this.f1075aX);
                            }
                        } else if (c0189g.f1145aX == null) {
                            if (this.f1025Z > 10.0f && (m2531d = gameEngine.effects.m2531d(this.f1073aV, this.f1074aW, this.f1075aX, 0)) != null) {
                                m2531d.f4729G = this.f1025Z / 25.0f;
                                m2531d.f4728F = 0.7f;
                                if (this.f1075aX > 5.0f) {
                                    m2531d.f4786ar = (short) 2;
                                }
                            }
                            gameEngine.effects.m2542b(this.f1073aV, this.f1074aW, this.f1075aX);
                            if (this.f1068aR && !this.f1003D) {
                                gameEngine.audio.m3003a(AudioEngine.f4043n, 0.5f, 1.0f + CommonUtils.rnd(-0.06f, 0.06f), this.f1073aV, this.f1074aW);
                            }
                        }
                        if (this.f1003D && c0189g.f1145aX == null) {
                            gameEngine.audio.m3003a(AudioEngine.f4058C, 1.6f, 0.7f, this.f1073aV, this.f1074aW);
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight != null) {
                                emitLight.f4730H = 14.0f;
                                emitLight.f4729G = 8.0f;
                                emitLight.f4728F = 0.9f;
                                emitLight.f4745W = 35.0f;
                                emitLight.f4746X = emitLight.f4745W;
                                emitLight.f4720s = true;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e m2533c = gameEngine.effects.m2533c(this.f1073aV, this.f1074aW, this.f1075aX, -1127220);
                            if (m2533c != null) {
                                m2533c.f4730H = 1.5f;
                                m2533c.f4729G = 3.0f;
                                m2533c.f4786ar = (short) 2;
                                m2533c.f4745W = 20.0f;
                                m2533c.f4746X = m2533c.f4745W;
                                m2533c.f4744V = 0.0f;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e m2533c2 = gameEngine.effects.m2533c(this.f1073aV, this.f1074aW, this.f1075aX, -1127220);
                            if (m2533c2 != null) {
                                m2533c2.f4730H = 0.2f;
                                m2533c2.f4729G = 5.0f;
                                m2533c2.f4786ar = (short) 2;
                                m2533c2.f4745W = 65.0f;
                                m2533c2.f4746X = m2533c2.f4745W;
                                m2533c2.f4744V = 0.0f;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight2 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight2 != null) {
                                emitLight2.f4730H = 3.0f;
                                emitLight2.f4729G = 6.0f;
                                emitLight2.f4728F = 0.9f;
                                emitLight2.f4745W = 290.0f;
                                emitLight2.f4746X = emitLight2.f4745W;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight3 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (emitLight3 != null) {
                                emitLight3.f4730H = 2.0f;
                                emitLight3.f4729G = 6.0f;
                                emitLight3.f4728F = 0.5f;
                                emitLight3.f4745W = 370.0f;
                                emitLight3.f4746X = emitLight3.f4745W;
                                emitLight3.f4744V = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight4 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (emitLight4 != null) {
                                    emitLight4.f4730H = 0.2f;
                                    emitLight4.f4729G = 9.0f;
                                    emitLight4.f4728F = 0.7f;
                                    emitLight4.f4745W = 210.0f;
                                    emitLight4.f4746X = emitLight4.f4745W;
                                    emitLight4.f4744V = 20 + (i3 * 110);
                                }
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight5 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight5 != null) {
                                emitLight5.f4730H = 3.0f;
                                emitLight5.f4729G = 4.0f;
                                emitLight5.f4728F = 0.2f;
                                emitLight5.f4745W = 870.0f;
                                emitLight5.f4746X = emitLight5.f4745W;
                                emitLight5.f4720s = true;
                                emitLight5.f4744V = 70.0f;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight6 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (emitLight6 != null) {
                                emitLight6.f4730H = 4.0f;
                                emitLight6.f4729G = 1.0f;
                                emitLight6.f4728F = 0.9f;
                                emitLight6.f4745W = 320.0f;
                                emitLight6.f4746X = emitLight6.f4745W;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight7 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (emitLight7 != null) {
                                emitLight7.f4730H = 2.0f;
                                emitLight7.f4729G = 1.0f;
                                emitLight7.f4728F = 1.0f;
                                emitLight7.f4745W = 340.0f;
                                emitLight7.f4746X = emitLight7.f4745W;
                                emitLight7.f4721t = true;
                                emitLight7.f4722u = 20.0f;
                            }
                            gameEngine.effects.m2536b(EnumC0748h.f4830e);
                            C0745e emitLight8 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (emitLight8 != null) {
                                emitLight8.f4730H = 1.5f;
                                emitLight8.f4729G = 1.5f;
                                emitLight8.f4728F = 0.3f;
                                emitLight8.f4745W = 1340.0f;
                                emitLight8.f4746X = emitLight8.f4745W;
                                emitLight8.f4721t = true;
                                emitLight8.f4722u = 40.0f;
                                emitLight8.f4744V = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight9 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (emitLight9 != null) {
                                    emitLight9.f4730H = 1.5f;
                                    emitLight9.f4729G = 1.4f;
                                    emitLight9.f4728F = 1.3f;
                                    emitLight9.f4745W = 340.0f;
                                    emitLight9.f4746X = emitLight9.f4745W;
                                    emitLight9.f4740R = -0.29f;
                                    emitLight9.f4721t = true;
                                    emitLight9.f4722u = 50.0f;
                                    emitLight9.f4744V = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight10 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (emitLight10 != null) {
                                    emitLight10.f4730H = 1.3f;
                                    emitLight10.f4729G = 1.0f;
                                    emitLight10.f4728F = 1.0f;
                                    emitLight10.f4745W = 340.0f;
                                    emitLight10.f4746X = emitLight10.f4745W;
                                    emitLight10.f4740R = -0.14f;
                                    emitLight10.f4721t = true;
                                    emitLight10.f4722u = 50.0f;
                                    emitLight10.f4744V = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight11 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW - 30.0f, this.height, -16711936);
                                if (emitLight11 != null) {
                                    emitLight11.f4730H = 1.5f;
                                    emitLight11.f4729G = 2.6f;
                                    emitLight11.f4728F = 1.3f;
                                    emitLight11.f4745W = 510.0f;
                                    emitLight11.f4746X = emitLight11.f4745W;
                                    emitLight11.f4740R = -0.2f;
                                    emitLight11.f4721t = true;
                                    emitLight11.f4722u = 50.0f;
                                    emitLight11.f4783C = null;
                                    emitLight11.f4725y = Color.argb(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    emitLight11.f4744V = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight12 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW - 30.0f, this.height, -16711936);
                                if (emitLight12 != null) {
                                    emitLight12.f4730H = 1.5f;
                                    emitLight12.f4729G = 3.8f;
                                    emitLight12.f4728F = 0.8f;
                                    emitLight12.f4745W = 590.0f;
                                    emitLight12.f4746X = emitLight12.f4745W;
                                    emitLight12.f4740R = -0.2f;
                                    emitLight12.f4721t = true;
                                    emitLight12.f4722u = 50.0f;
                                    emitLight12.f4783C = null;
                                    emitLight12.f4725y = Color.argb(105, 115, 115, 115);
                                    emitLight12.f4744V = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                C0746f m2519a = C0746f.m2519a(this.f1073aV + CommonUtils.m2364a(-10.0f, 10.0f, (int) this.f6945ed), this.f1074aW + CommonUtils.m2364a(-10.0f, 10.0f, ((int) this.f6945ed) + i8));
                                if (m2519a != null) {
                                    m2519a.f4804t = 200 + (i8 * 70);
                                    m2519a.f4789a = 980 + (i8 * 800);
                                }
                            }
                            if (!C1117y.m474d(this.f1073aV, this.f1074aW)) {
                                C0195l.m6433a(this.f1073aV, this.f1074aW, EnumC0196m.f1303b);
                            }
                            if (GameEngine.m1182aA()) {
                                if (gameEngine.effects.f4683m == null) {
                                    gameEngine.effects.f4683m = gameEngine.graphics.mo926a(R.drawable.shockwave_normal_256, true);
                                }
                                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                                C0745e emitLight13 = gameEngine.effects.emitLight(this.f1073aV, this.f1074aW, this.height, -1);
                                if (emitLight13 != null && gameEngine.effects.f4683m != null) {
                                    emitLight13.f4777a = new C0382aw((EnumC0383ax) null);
                                    emitLight13.f4777a.imageStrip = new C0747g();
                                    emitLight13.f4777a.imageStrip.f4823k = true;
                                    emitLight13.f4777a.imageStrip.f4821i = gameEngine.effects.f4683m;
                                    emitLight13.f4777a.imageStrip.f4814b = emitLight13.f4777a.imageStrip.f4821i.mo396m();
                                    emitLight13.f4777a.imageStrip.f4815c = emitLight13.f4777a.imageStrip.f4821i.mo397l();
                                    emitLight13.f4786ar = (short) 101;
                                    emitLight13.f4730H = 0.5f;
                                    emitLight13.f4729G = 3.5f;
                                    emitLight13.f4728F = 0.5f;
                                    emitLight13.f4745W = 60.0f;
                                    emitLight13.f4746X = emitLight13.f4745W;
                                    emitLight13.f4740R = -0.2f;
                                    emitLight13.f4721t = true;
                                    emitLight13.f4722u = 1.0f;
                                    emitLight13.f4783C = null;
                                    emitLight13.f4744V = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f1069bn && !this.f1021V) {
            this.f1022W = CommonUtils.m2368a(this.f1022W, f);
            if (this.f1040ao) {
                m6503b(1.0f - (this.f1022W / this.f1023X));
            }
            if (this.f1022W == 0.0f) {
                this.f1021V = true;
                m6503b(1.0f);
                if (!this.f1001B && !this.f1012M && !c0189g.f1178X) {
                    mo2880a();
                }
            }
        }
        this.f1009J += f;
        if (this.lifeTimer == 0.0f && (!this.f1069bn || this.f1021V)) {
            if (c0189g.f1130ak != null) {
                c0189g.f1130ak.m5277a(this.f6951ek, this.f6952el, this.height, this.f1050az, this.f983j, null, false, this.f1054aD + 1, this, null);
            }
            mo2880a();
        }
        if (!this.f1072aU) {
            this.f1071aT = f28;
            this.f1072aU = true;
        }
        this.f1071aT += CommonUtils.m2292c(this.f1071aT, f28, 12.0f * f);
    }

    /* renamed from: b */
    public void m6503b(float f) {
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
        GameEngine gameEngine = GameEngine.getInstance();
        f1078bi.clear();
        gameEngine.f6121cc.m3783b(this.f1073aV, this.f1074aW, f3, f1078bi);
        Unit[] m523a = f1078bi.m523a();
        int size = f1078bi.size();
        for (int i = 0; i < size; i++) {
            m6502b(m523a[i], f, f2);
        }
        f1078bi.clear();
    }

    /* renamed from: b */
    public void m6502b(Unit unit, float f, float f2) {
        if (unit.f1650cL != null) {
            return;
        }
        if (this.f1041ap != null && this.f1041ap.contains(unit)) {
            return;
        }
        if (this.f983j != null) {
            Team team = this.f983j.team;
            Team team2 = unit.team;
            if (team2 != team && team.m6342d(team2)) {
                return;
            }
            if (this.f1026aa && !team.m6354c(team2)) {
                return;
            }
            if (this.f1027ab && team.m6354c(team2)) {
                return;
            }
        }
        if (unit.height < -5.0f && this.f1075aX >= -2.0f && !this.f1028ac) {
            return;
        }
        if (this.f1030ae) {
            if (unit.mo3293i() != (this.f1075aX >= 5.0f)) {
                return;
            }
        } else if (!this.f1029ad && unit.mo3293i()) {
            return;
        }
        float m2366a = CommonUtils.m2366a(this.f1073aV, this.f1074aW, unit.f6951ek, unit.f6952el);
        if (m2366a > f2 * f2 && !this.f980g.f1105h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(m2366a);
        if (this.f980g.f1105h) {
            sqrt -= unit.radius;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f2 || sqrt < this.f980g.f1153j) {
            return;
        }
        m6514a(f, unit, sqrt);
    }

    /* renamed from: a */
    public void m6514a(float f, Unit unit, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f1025Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f980g.f1104g) {
            f3 = 1.0f;
        }
        float f4 = f3 * this.f1024Y;
        m6510a(unit);
        m6506a(this.f983j, unit, this.f980g.m6492a(unit, f4, true), this, true);
        if (this.f1040ao) {
            if (this.f1041ap == null) {
                this.f1041ap = new C1101m();
            }
            this.f1041ap.add(unit);
        }
    }

    /* renamed from: a */
    public boolean m6505a(GameEngine gameEngine) {
        if (gameEngine.f6245cN.m7189b(this.f6951ek, this.f6952el)) {
            return true;
        }
        if ((this.f1001B || this.f1004E || this.f980g.f1178X) && this.target != null && gameEngine.f6245cN.m7189b(this.target.f6951ek, this.target.f6952el)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean draw(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.f1018S || this.f982i > 0.0f) {
            return false;
        }
        C0189g c0189g = this.f980g;
        GameEngine gameEngine = GameEngine.getInstance();
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        float f5 = this.f6951ek - gameEngine.f6138cv;
        float f6 = this.f6952el - gameEngine.f6139cw;
        if (this.target != null) {
            f2 = this.target.f6951ek;
            f3 = this.target.f6952el;
            f4 = this.target.height;
        } else {
            f2 = this.f987n;
            f3 = this.f988o;
            f4 = this.f989p;
        }
        if (!this.f1077aZ && !this.f1003D) {
            boolean z = false;
            if (this.f1000A) {
                if (this.target != null) {
                    if (!gameEngine.f6104bL.m6650a(this.target.f6951ek, this.target.f6952el, gameEngine.f6093bs)) {
                        z = true;
                    }
                } else if (this.f986m && !gameEngine.f6104bL.m6650a(this.f987n, this.f988o, gameEngine.f6093bs)) {
                    z = true;
                }
            }
            if (!gameEngine.f6104bL.m6650a(this.f6951ek, this.f6952el, gameEngine.f6093bs) && !z) {
                return false;
            }
            this.f1077aZ = true;
        }
        if (this.f1004E || c0189g.f1178X) {
            if (c0189g.f1121Y != null) {
                Paint m6496f = m6496f();
                float f7 = 0.0f;
                if (c0189g.f1126ad != 0.0f) {
                    f7 = 0.0f + (c0189g.f1126ad * this.f1009J);
                }
                float f8 = this.f6951ek - gameEngine.f6138cv;
                float f9 = (this.f6952el - gameEngine.f6139cw) - this.height;
                float f10 = (f2 - gameEngine.f6138cv) + this.x;
                float f11 = ((f3 - f4) - gameEngine.f6139cw) + this.y;
                float f12 = (f10 + f8) * 0.5f;
                float f13 = (f11 + f9) * 0.5f;
                float m2314b = CommonUtils.m2314b(f12, f13, f10, f11);
                float m2280d = CommonUtils.m2280d(f12, f13, f10, f11);
                interfaceC1027y.mo878k();
                f1088f.m7195a(f12 - c0189g.f1121Y.f6398r, f13 - m2314b, f12 + c0189g.f1121Y.f6398r, f13 + m2314b);
                interfaceC1027y.mo934a(m2280d + 90.0f, f12, f13);
                interfaceC1027y.mo908a(c0189g.f1121Y, f1088f, m6496f, 0.0f, f7, 0, 0);
                interfaceC1027y.mo877l();
                if (c0189g.f1122Z != null) {
                    if (c0189g.f1123aa) {
                        interfaceC1027y.mo878k();
                        interfaceC1027y.mo934a(m2280d + 90.0f, f8, f9);
                        interfaceC1027y.mo915a(c0189g.f1122Z, f8, f9, m6496f);
                        interfaceC1027y.mo877l();
                    } else {
                        interfaceC1027y.mo915a(c0189g.f1122Z, f8, f9, m6496f);
                    }
                }
                if (c0189g.f1124ab != null) {
                    if (c0189g.f1125ac) {
                        interfaceC1027y.mo878k();
                        interfaceC1027y.mo934a(m2280d + 90.0f, f10, f11);
                        interfaceC1027y.mo915a(c0189g.f1124ab, f10, f11, m6496f);
                        interfaceC1027y.mo877l();
                        return true;
                    }
                    interfaceC1027y.mo915a(c0189g.f1124ab, f10, f11, m6496f);
                    return true;
                }
                return true;
            }
            f1094bf.m7237c((int) (60.0f + (m6498e() * 60.0f)));
            float f14 = (f2 - gameEngine.f6138cv) + this.x;
            float f15 = ((f3 - f4) - gameEngine.f6139cw) + this.y;
            f1094bf.m7270a(6.0f);
            interfaceC1027y.mo932a(this.f6951ek - gameEngine.f6138cv, (this.f6952el - gameEngine.f6139cw) - this.height, f14, f15, f1094bf);
            f1094bf.m7270a(3.0f);
            interfaceC1027y.mo932a(this.f6951ek - gameEngine.f6138cv, (this.f6952el - gameEngine.f6139cw) - this.height, f14, f15, f1094bf);
            interfaceC1027y.mo931a(f14, f15, 8.0f, f1094bf);
            interfaceC1027y.mo931a(f14, f15, 5.0f, f1094bf);
            return true;
        } else if (this.f1001B) {
            float f16 = (f2 - gameEngine.f6138cv) + this.x;
            float f17 = ((f3 - f4) - gameEngine.f6139cw) + this.y;
            f1092bd.m7242b(this.color);
            f1093be.m7242b(this.color);
            f1093be.m7237c((int) (f1093be.m7228f() * 0.5f));
            interfaceC1027y.mo932a(this.f6951ek - gameEngine.f6138cv, (this.f6952el - gameEngine.f6139cw) - this.height, f16, f17, f1093be);
            interfaceC1027y.mo932a(this.f6951ek - gameEngine.f6138cv, (this.f6952el - gameEngine.f6139cw) - this.height, f16, f17, f1092bd);
            interfaceC1027y.mo931a(f16, f17, 5.0f, f1092bd);
            return true;
        } else if (this.f1012M) {
            this.f1013N = CommonUtils.m2368a(this.f1013N, f);
            if (this.f1014O == null) {
                this.f1014O = new float[20];
                this.f1013N = 0.0f;
            }
            if (this.f1013N == 0.0f) {
                this.f1013N = 4.0f;
                for (int i = 0; i < this.f1014O.length; i++) {
                    this.f1014O[i] = CommonUtils.rnd(-10.0f, 10.0f);
                }
            }
            float f18 = this.f6951ek - gameEngine.f6138cv;
            float f19 = (this.f6952el - gameEngine.f6139cw) - this.height;
            float f20 = f2 - gameEngine.f6138cv;
            float f21 = (f3 - f4) - gameEngine.f6139cw;
            float m2291c = CommonUtils.m2291c(f18, f19, f20, f21);
            int length = this.f1014O.length;
            if (m2291c < 200.0f) {
                length = CommonUtils.m2311b(0, length - 5);
            } else if (m2291c < 100.0f) {
                length = CommonUtils.m2311b(0, length - 10);
            }
            float f22 = m2291c / (length - 1);
            float m2280d2 = CommonUtils.m2280d(f18, f19, f20, f21);
            float f23 = f18;
            float f24 = f19;
            float m2249i = CommonUtils.m2249i(m2280d2);
            float sin = CommonUtils.sin(m2280d2);
            for (int i2 = 0; i2 < length; i2++) {
                float f25 = this.f1014O[i2];
                float f26 = f18 + (m2249i * i2 * f22);
                float f27 = f19 + (sin * i2 * f22);
                if (i2 != length - 1) {
                    f26 -= sin * f25;
                    f27 += m2249i * f25;
                }
                interfaceC1027y.mo932a(f23, f24, f26, f27, f1095bg);
                f23 = f26;
                f24 = f27;
            }
            return true;
        } else if (this.f1015P != -1) {
            BitmapOrTexture bitmapOrTexture = f1084b;
            int i3 = 20;
            int i4 = 20;
            if (this.f1017R == 1) {
                bitmapOrTexture = f1086d;
                i3 = 60;
                i4 = 60;
            } else if (this.f1017R == 2) {
                bitmapOrTexture = f1085c;
                i3 = 20;
                i4 = 20;
            }
            if (c0189g.f1111C != null) {
                C1117y.m484a(c0189g.f1111C, f5, f6, 0.0f, this.f1071aT, this.f997x, f1097bc, c0189g.f1111C.f6396p, c0189g.f1111C.f6397q, 0);
            } else if (this.f1016Q != -1 && this.f999z) {
                C1117y.m484a(bitmapOrTexture, f5, f6, 0.0f, this.f1071aT, this.f997x, f1097bc, i3, i4, this.f1016Q);
            }
            if (c0189g.f1110B != null) {
                bitmapOrTexture = c0189g.f1110B;
                i3 = c0189g.f1110B.f6396p;
                i4 = c0189g.f1110B.f6397q;
            }
            C1117y.m484a(bitmapOrTexture, f5, f6, this.height, this.f1071aT, this.f997x, m6496f(), i3, i4, this.f1015P);
            return true;
        } else {
            f1091bb.m7242b(this.color);
            if (this.height > 0.0f && this.f999z) {
                interfaceC1027y.mo931a(f5, f6, this.f997x, f1097bc);
            }
            interfaceC1027y.mo931a(f5, f6 - this.height, this.f997x, f1091bb);
            if (this.f998y > 0.0f) {
                f1091bb.m7237c(f1091bb.m7228f() / 3);
                interfaceC1027y.mo931a(f5, f6 - this.height, this.f998y, f1091bb);
                return true;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void m6513a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m6499d(float f) {
    }

    /* renamed from: e */
    public void m6497e(float f) {
    }

    /* renamed from: f */
    public boolean m6495f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m6496f() {
        C0930ag c0930ag;
        if (this.color != f1089aq) {
            if (GameEngine.m1159as()) {
                c0930ag = m6512a(this.color);
            } else {
                c0930ag = f1091bb;
                c0930ag.m7242b(this.color);
            }
        } else {
            c0930ag = f1090ba;
        }
        return c0930ag;
    }

    /* renamed from: a */
    public C0930ag m6512a(int i) {
        if (this.f1079bj != null) {
            return this.f1079bj;
        }
        if (f1080bk != null && f1081bl == i) {
            this.f1079bj = f1080bk;
            return this.f1079bj;
        }
        C0930ag c0930ag = new C0930ag();
        c0930ag.m7264a(new LightingColorFilter(i, 0));
        c0930ag.m7242b(i);
        f1080bk = c0930ag;
        f1081bl = i;
        this.f1079bj = c0930ag;
        return this.f1079bj;
    }

    /* renamed from: a */
    public void m6515a(float f, float f2, C0449h c0449h) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f983j == null) {
            GameEngine.m1145b("Projectile: cannot Retarget: source==null");
            return;
        }
        float m2249i = this.f6951ek + (CommonUtils.m2249i(this.f1050az) * f2);
        float sin = this.f6952el + (CommonUtils.sin(this.f1050az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        Unit unit = null;
        if (this.f983j instanceof AbstractC0623y) {
            abstractC0623y = (AbstractC0623y) this.f983j;
            unit = abstractC0623y.m3151ab();
        }
        Iterator it = gameEngine.f6121cc.m3793a(m2249i, sin, f).iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (this.f983j.team != unit2.team) {
                boolean z = true;
                if (abstractC0623y != null) {
                    z = abstractC0623y.m3117b(unit2, true);
                }
                if (z && this.f984k >= 0 && abstractC0623y != null && this.f984k < abstractC0623y.mo3512bl() && !abstractC0623y.m3209a((int) this.f984k, unit2, true, false)) {
                    z = false;
                }
                if (c0449h != null && !C0448g.m5061a(c0449h, unit2.m5787dc())) {
                    z = false;
                }
                if (z) {
                    float m2366a = CommonUtils.m2366a(m2249i, sin, unit2.f6951ek, unit2.f6952el);
                    boolean z2 = false;
                    if (f4 == -1.0f || m2366a < f4) {
                        z2 = true;
                    }
                    if (unit == unit2) {
                        z2 = true;
                    }
                    if (z2 && m2366a < f3) {
                        f4 = m2366a;
                        this.target = unit2;
                    }
                }
            }
        }
    }
}
