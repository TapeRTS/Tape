package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0511n;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0381x;
import com.corrodinggames.rts.game.units.custom.EnumC0306ab;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.gameFramework.AbstractC0567az;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0709m;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0814ag;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class C0163f extends AbstractC0567az {

    /* renamed from: h */
    public float f923h;

    /* renamed from: i */
    public float f924i;

    /* renamed from: j */
    public AbstractC0210af f925j;

    /* renamed from: l */
    public AbstractC0210af f927l;

    /* renamed from: m */
    public boolean f928m;

    /* renamed from: n */
    public float f929n;

    /* renamed from: o */
    public float f930o;

    /* renamed from: p */
    public float f931p;

    /* renamed from: q */
    public C0163f f932q;

    /* renamed from: t */
    public float f935t;

    /* renamed from: u */
    public float f936u;

    /* renamed from: v */
    public float f937v;

    /* renamed from: w */
    public float f938w;

    /* renamed from: A */
    public boolean f942A;

    /* renamed from: B */
    public boolean f943B;

    /* renamed from: C */
    public boolean f944C;

    /* renamed from: D */
    public boolean f945D;

    /* renamed from: E */
    public boolean f946E;

    /* renamed from: F */
    public float f947F;

    /* renamed from: G */
    public boolean f948G;

    /* renamed from: I */
    public float f950I;

    /* renamed from: J */
    public float f951J;

    /* renamed from: K */
    public float f952K;

    /* renamed from: L */
    public float f953L;

    /* renamed from: M */
    public boolean f954M;

    /* renamed from: N */
    public float f955N;

    /* renamed from: O */
    public float[] f956O;

    /* renamed from: T */
    public boolean f961T;

    /* renamed from: U */
    public float f962U;

    /* renamed from: Y */
    public float f966Y;

    /* renamed from: Z */
    public float f967Z;

    /* renamed from: aa */
    public boolean f968aa;

    /* renamed from: af */
    public boolean f973af;

    /* renamed from: ag */
    public float f974ag;

    /* renamed from: ah */
    public float f975ah;

    /* renamed from: an */
    public float f981an;

    /* renamed from: ao */
    public boolean f982ao;

    /* renamed from: ap */
    public C0835m f983ap;

    /* renamed from: as */
    public boolean f986as;

    /* renamed from: at */
    public boolean f987at;

    /* renamed from: au */
    public AbstractC0854w f988au;

    /* renamed from: aw */
    public float f990aw;

    /* renamed from: ax */
    public float f991ax;

    /* renamed from: ay */
    public float f992ay;

    /* renamed from: az */
    public float f993az;

    /* renamed from: aA */
    public float f994aA;

    /* renamed from: aB */
    public boolean f995aB;

    /* renamed from: aC */
    public boolean f996aC;

    /* renamed from: aD */
    public int f997aD;

    /* renamed from: aE */
    public C0365i f998aE;

    /* renamed from: aF */
    public float f999aF;

    /* renamed from: aG */
    public boolean f1000aG;

    /* renamed from: aH */
    public boolean f1001aH;

    /* renamed from: aM */
    public boolean f1006aM;

    /* renamed from: aN */
    public float f1007aN;

    /* renamed from: aO */
    public float f1008aO;

    /* renamed from: aP */
    public C0573e f1009aP;

    /* renamed from: aQ */
    public boolean f1010aQ;

    /* renamed from: bn */
    private boolean f1012bn;

    /* renamed from: aS */
    public boolean f1013aS;

    /* renamed from: aU */
    public boolean f1015aU;

    /* renamed from: aV */
    float f1016aV;

    /* renamed from: aW */
    float f1017aW;

    /* renamed from: aX */
    float f1018aX;

    /* renamed from: aY */
    public boolean f1019aY;

    /* renamed from: aZ */
    public boolean f1020aZ;

    /* renamed from: bj */
    public C0760q f1030bj;

    /* renamed from: a */
    public static final C0835m f915a = new C0835m();

    /* renamed from: bm */
    private static final C0163f f916bm = new C0163f(true);

    /* renamed from: b */
    static C0748e f917b = null;

    /* renamed from: c */
    static C0748e f918c = null;

    /* renamed from: d */
    static C0748e f919d = null;

    /* renamed from: e */
    static final Rect f920e = new Rect();

    /* renamed from: f */
    static final RectF f921f = new RectF();

    /* renamed from: aq */
    static final int f984aq = Color.m4213a(255, 255, 255, 255);

    /* renamed from: ba */
    public static final C0760q f1021ba = new C0760q();

    /* renamed from: bb */
    public static final Paint f1022bb = new Paint();

    /* renamed from: bd */
    public static final Paint f1024bd = new Paint();

    /* renamed from: be */
    public static final Paint f1025be = new Paint();

    /* renamed from: bf */
    public static final Paint f1026bf = new Paint();

    /* renamed from: bg */
    public static final Paint f1027bg = new Paint();

    /* renamed from: bh */
    public static final Paint f1028bh = new Paint();

    /* renamed from: bc */
    public static final Paint f1023bc = new C0760q();

    /* renamed from: bi */
    public static final C0846u f1029bi = new C0846u();

    /* renamed from: bk */
    public static C0760q f1031bk = null;

    /* renamed from: bl */
    public static int f1032bl = 0;

    /* renamed from: g */
    public C0164g f922g = C0164g.f1033a;

    /* renamed from: k */
    public short f926k = -1;

    /* renamed from: r */
    public float f933r = -1.0f;

    /* renamed from: s */
    public float f934s = 0.1f;

    /* renamed from: x */
    public float f939x = 2.0f;

    /* renamed from: y */
    public float f940y = -1.0f;

    /* renamed from: z */
    public boolean f941z = true;

    /* renamed from: H */
    public float f949H = 1.0f;

    /* renamed from: P */
    public short f957P = -1;

    /* renamed from: Q */
    public short f958Q = -1;

    /* renamed from: R */
    public short f959R = 0;

    /* renamed from: S */
    public boolean f960S = true;

    /* renamed from: V */
    public boolean f963V = false;

    /* renamed from: W */
    public float f964W = 0.0f;

    /* renamed from: X */
    public float f965X = 0.0f;

    /* renamed from: ab */
    public boolean f969ab = false;

    /* renamed from: ac */
    public boolean f970ac = false;

    /* renamed from: ad */
    public boolean f971ad = false;

    /* renamed from: ae */
    public boolean f972ae = true;

    /* renamed from: ai */
    public float f976ai = 1.0f;

    /* renamed from: aj */
    public float f977aj = 1.0f;

    /* renamed from: ak */
    public float f978ak = 1.0f;

    /* renamed from: al */
    public float f979al = 1.0f;

    /* renamed from: am */
    public float f980am = 1.0f;

    /* renamed from: ar */
    public int f985ar = f984aq;

    /* renamed from: av */
    public int f989av = -1;

    /* renamed from: aI */
    public float f1002aI = 40.0f;

    /* renamed from: aJ */
    public float f1003aJ = 60.0f;

    /* renamed from: aK */
    public boolean f1004aK = false;

    /* renamed from: aL */
    public float f1005aL = 2.0f;

    /* renamed from: aR */
    public boolean f1011aR = true;

    /* renamed from: aT */
    public float f1014aT = 0.0f;

    static {
        f1023bc.m4169b(-16777216);
        f1023bc.m4164c(108);
        f1024bd.m4189a(80, 255, 0, 0);
        f1024bd.m4173a(true);
        f1024bd.m4192a(5.0f);
        f1025be.m4189a(30, 255, 0, 0);
        f1025be.m4173a(true);
        f1025be.m4192a(8.0f);
        f1026bf.m4189a(80, 128, 166, 255);
        f1026bf.m4173a(true);
        f1026bf.m4192a(5.0f);
        f1027bg.m4189a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1027bg.m4173a(true);
        f1027bg.m4192a(3.0f);
        f1028bh.m4189a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1028bh.m4173a(true);
        f1028bh.m4192a(8.0f);
    }

    public C0163f(boolean z) {
        super(z);
        if (!z) {
            f915a.add(this);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        f915a.remove(this);
        super.mo405a();
    }

    /* renamed from: a */
    public static C0163f m3577a(C0163f fVar) {
        C0163f fVar2 = f916bm;
        fVar2.f997aD = -1;
        if (fVar == null) {
            fVar2.f980am = 1.0f;
            fVar2.f978ak = 1.0f;
            fVar2.f979al = 1.0f;
            fVar2.f981an = 0.0f;
        } else {
            fVar2.f980am = fVar.f980am;
            fVar2.f978ak = fVar.f978ak;
            fVar2.f979al = fVar.f979al;
            fVar2.f981an = fVar.f981an;
        }
        return fVar2;
    }

    /* renamed from: a */
    public void m3574a(AbstractC0210af afVar, float f, float f2, float f3) {
        this.f925j = afVar;
        this.f5842dH = f;
        this.f5843dI = f2;
        this.f5844dJ = f3;
        this.f1012bn = false;
        this.f963V = false;
    }

    /* renamed from: b */
    public void m3571b() {
        if (this.f945D) {
            AbstractC0789l u = AbstractC0789l.m638u();
            C0573e d = u.f5517bz.m1983d(this.f5842dH, this.f5843dI, this.f5844dJ, 0);
            if (d != null) {
                d.f3860H = 0.7f;
                d.f3859G = 2.1f;
                d.f3895aq = (short) 2;
                d.f3875W = 90.0f;
                d.f3876X = d.f3875W;
            }
            u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        }
        mo405a();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f923h);
        apVar.mo1094a(this.f925j);
        apVar.mo1094a(this.f927l);
        apVar.mo1096a(this.f935t);
        apVar.mo1095a(99);
        apVar.mo1090a(this.f942A);
        apVar.mo1090a(this.f943B);
        apVar.mo1090a(this.f960S);
        apVar.mo1090a(this.f961T);
        apVar.mo1096a(this.f962U);
        apVar.mo1096a(this.f966Y);
        apVar.mo1096a(this.f967Z);
        apVar.mo1095a(this.f985ar);
        apVar.mo1090a(this.f1001aH);
        apVar.mo1096a(this.f1002aI);
        apVar.mo1096a(this.f1003aJ);
        apVar.mo1090a(this.f1004aK);
        apVar.mo1096a(this.f1005aL);
        apVar.mo1090a(this.f1006aM);
        apVar.mo1096a(this.f1007aN);
        apVar.mo1090a(this.f1010aQ);
        apVar.mo1090a(this.f1011aR);
        apVar.mo1090a(this.f1012bn);
        apVar.mo1090a(this.f1013aS);
        apVar.mo1090a(this.f954M);
        apVar.mo1091a(this.f957P);
        apVar.mo1096a(this.f933r);
        apVar.mo1096a(this.f934s);
        apVar.mo1090a(this.f986as);
        apVar.mo1090a(this.f987at);
        apVar.mo1096a(this.f993az);
        apVar.mo1096a(this.f994aA);
        apVar.mo1090a(this.f995aB);
        apVar.mo1090a(this.f996aC);
        apVar.mo1090a(false);
        apVar.mo1096a(0.0f);
        apVar.mo1096a(0.0f);
        apVar.mo1090a(this.f946E);
        apVar.mo1096a(this.f947F);
        apVar.mo1096a(this.f951J);
        apVar.mo1096a(this.f952K);
        apVar.mo1096a(this.f953L);
        apVar.mo1090a(this.f928m);
        apVar.mo1096a(this.f929n);
        apVar.mo1096a(this.f930o);
        apVar.mo1090a(this.f944C);
        apVar.mo1090a(this.f945D);
        apVar.mo1142a(this.f932q);
        apVar.mo1096a(this.f1016aV);
        apVar.mo1096a(this.f1017aW);
        apVar.mo1096a(this.f1018aX);
        apVar.mo1090a(this.f963V);
        apVar.mo1096a(this.f964W);
        apVar.mo1096a(this.f965X);
        apVar.mo1090a(this.f1015aU);
        apVar.mo1091a(this.f959R);
        apVar.mo1090a(this.f982ao);
        apVar.m1156a(this.f983ap);
        apVar.mo1091a(this.f958Q);
        apVar.mo1096a(this.f939x);
        apVar.mo1090a(this.f968aa);
        apVar.mo1090a(this.f971ad);
        apVar.mo1090a(this.f948G);
        apVar.mo1096a(this.f949H);
        apVar.mo1090a(this.f972ae);
        apVar.mo1090a(this.f1000aG);
        apVar.mo1090a(this.f941z);
        apVar.mo1096a(this.f940y);
        apVar.mo1096a(this.f1008aO);
        apVar.mo1096a(this.f924i);
        apVar.mo1090a(this.f1019aY);
        apVar.mo1090a(this.f973af);
        apVar.mo1096a(this.f974ag);
        apVar.mo1096a(this.f975ah);
        apVar.mo1096a(this.f976ai);
        apVar.mo1096a(this.f977aj);
        apVar.mo1095a(0);
        apVar.mo1096a(0.0f);
        apVar.mo1096a(0.0f);
        apVar.mo1145a((AbstractC0268al) null);
        apVar.mo1095a(0);
        apVar.mo1090a(false);
        C0364h.m2903a(this.f998aE, apVar);
        apVar.mo1096a(this.f978ak);
        apVar.mo1096a(this.f979al);
        apVar.mo1090a(this.f969ab);
        apVar.mo1090a(this.f970ac);
        apVar.mo1096a(this.f981an);
        apVar.mo1090a(false);
        C0164g.m3564a(this.f922g, apVar);
        boolean z = this.f988au != null && !this.f988au.f5837dC;
        apVar.mo1090a(z);
        if (z) {
            apVar.mo1142a(this.f988au);
            apVar.mo1096a(this.f990aw);
            apVar.mo1096a(this.f991ax);
            apVar.mo1096a(this.f992ay);
        }
        apVar.mo1091a(this.f926k);
        apVar.mo1095a(this.f997aD);
        apVar.mo1096a(this.f980am);
        apVar.mo1096a(this.f931p);
        apVar.mo1095a(this.f989av);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f923h = kVar.m1061g();
        this.f925j = kVar.m1054n();
        this.f927l = kVar.m1078a(EnumC0709m.expected);
        this.f935t = kVar.m1061g();
        this.f939x = kVar.m1062f();
        this.f942A = kVar.m1063e();
        this.f943B = kVar.m1063e();
        this.f960S = kVar.m1063e();
        this.f961T = kVar.m1063e();
        this.f962U = kVar.m1061g();
        this.f966Y = kVar.m1061g();
        this.f967Z = kVar.m1061g();
        this.f985ar = kVar.m1062f();
        this.f1001aH = kVar.m1063e();
        this.f1002aI = kVar.m1061g();
        this.f1003aJ = kVar.m1061g();
        this.f1004aK = kVar.m1063e();
        this.f1005aL = kVar.m1061g();
        this.f1006aM = kVar.m1063e();
        this.f1007aN = kVar.m1061g();
        this.f1010aQ = kVar.m1063e();
        this.f1011aR = kVar.m1063e();
        this.f1012bn = kVar.m1063e();
        if (kVar.m1071b() >= 7) {
            this.f1013aS = kVar.m1063e();
        }
        if (kVar.m1071b() >= 13) {
            this.f954M = kVar.m1063e();
            this.f957P = kVar.m1048t();
        }
        if (kVar.m1071b() >= 16) {
            this.f933r = kVar.m1061g();
            this.f934s = kVar.m1061g();
        }
        if (kVar.m1071b() >= 17) {
            this.f986as = kVar.m1063e();
            this.f987at = kVar.m1063e();
            this.f993az = kVar.m1061g();
            this.f994aA = kVar.m1061g();
            this.f995aB = kVar.m1063e();
            this.f996aC = kVar.m1063e();
        }
        if (kVar.m1071b() >= 18) {
            kVar.m1063e();
            kVar.m1061g();
            kVar.m1061g();
        }
        if (kVar.m1071b() >= 28) {
            this.f946E = kVar.m1063e();
            this.f947F = kVar.m1061g();
            this.f951J = kVar.m1061g();
            this.f952K = kVar.m1061g();
            this.f953L = kVar.m1061g();
        }
        if (kVar.m1071b() >= 29) {
            this.f928m = kVar.m1063e();
            this.f929n = kVar.m1061g();
            this.f930o = kVar.m1061g();
            this.f944C = kVar.m1063e();
            this.f945D = kVar.m1063e();
            this.f932q = (C0163f) kVar.m1076a(C0163f.class);
            this.f1016aV = kVar.m1061g();
            this.f1017aW = kVar.m1061g();
            this.f1018aX = kVar.m1061g();
            this.f963V = kVar.m1063e();
            this.f964W = kVar.m1061g();
            this.f965X = kVar.m1061g();
            this.f1015aU = kVar.m1063e();
            this.f959R = kVar.m1048t();
            this.f982ao = kVar.m1063e();
            C0835m mVar = new C0835m();
            kVar.m1077a(mVar, AbstractC0210af.class);
            if (mVar.size() > 0) {
                this.f983ap = mVar;
            }
            this.f958Q = kVar.m1048t();
        }
        if (kVar.m1071b() >= 35) {
            this.f939x = kVar.m1061g();
            this.f968aa = kVar.m1063e();
            this.f971ad = kVar.m1063e();
            this.f948G = kVar.m1063e();
        }
        if (kVar.m1071b() >= 38) {
            this.f949H = kVar.m1061g();
        }
        if (kVar.m1071b() >= 39) {
            this.f972ae = kVar.m1063e();
        }
        if (kVar.m1071b() >= 41) {
            this.f1000aG = kVar.m1063e();
        }
        if (kVar.m1071b() >= 43) {
            this.f941z = kVar.m1063e();
            this.f940y = kVar.m1061g();
        }
        if (kVar.m1071b() >= 44) {
            this.f1008aO = kVar.m1061g();
        }
        if (kVar.m1071b() >= 47) {
            this.f924i = kVar.m1061g();
        }
        if (kVar.m1071b() >= 48) {
            this.f1019aY = kVar.m1063e();
        }
        if (kVar.m1071b() >= 59) {
            this.f973af = kVar.m1063e();
            this.f974ag = kVar.m1061g();
            this.f975ah = kVar.m1061g();
            this.f976ai = kVar.m1061g();
        }
        if (kVar.m1071b() >= 60) {
            this.f977aj = kVar.m1061g();
            kVar.m1062f();
            kVar.m1061g();
            kVar.m1061g();
        }
        if (kVar.m1071b() >= 62) {
            kVar.m1052p();
            kVar.m1062f();
            kVar.m1063e();
        }
        if (kVar.m1071b() >= 63) {
            this.f998aE = C0364h.m2902a(kVar);
        }
        if (kVar.m1071b() >= 64) {
            this.f978ak = kVar.m1061g();
            this.f979al = kVar.m1061g();
        }
        if (kVar.m1071b() >= 66) {
            this.f969ab = kVar.m1063e();
            this.f970ac = kVar.m1063e();
        }
        if (kVar.m1071b() >= 67 && kVar.m1071b() < 78) {
            C0325au.m3066a(kVar, true);
        }
        if (kVar.m1071b() >= 68) {
            this.f981an = kVar.m1061g();
        }
        if (kVar.m1071b() >= 77) {
            kVar.m1063e();
        }
        if (kVar.m1071b() >= 78) {
            this.f922g = C0164g.m3561a(kVar);
        }
        if (kVar.m1071b() >= 81 && kVar.m1063e()) {
            this.f988au = kVar.m1076a(AbstractC0854w.class);
            this.f990aw = kVar.m1061g();
            this.f991ax = kVar.m1061g();
            this.f992ay = kVar.m1061g();
        }
        if (kVar.m1071b() >= 83) {
            this.f926k = kVar.m1048t();
            this.f997aD = kVar.m1062f();
        }
        if (kVar.m1071b() >= 88) {
            this.f980am = kVar.m1061g();
        }
        if (kVar.m1071b() >= 89) {
            this.f931p = kVar.m1061g();
            this.f989av = kVar.m1062f();
        }
        super.mo399a(kVar);
    }

    /* renamed from: c */
    public static void m3568c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f917b = u.f5514bw.mo194a(C0063R.drawable.projectiles);
        f918c = u.f5514bw.mo194a(C0063R.drawable.projectiles2);
        f919d = u.f5514bw.mo194a(C0063R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m3567d() {
        this.f1013aS = true;
    }

    /* renamed from: a */
    public static C0163f m3575a(AbstractC0210af afVar, float f, float f2) {
        C0163f fVar = new C0163f(false);
        fVar.f925j = afVar;
        fVar.f5842dH = f;
        fVar.f5843dI = f2;
        fVar.f985ar = Color.m4213a(255, 100, 30, 30);
        fVar.f5841dG = afVar.f5841dG + 1;
        fVar.f5840dF = 4;
        return fVar;
    }

    /* renamed from: a */
    public static C0163f m3573a(AbstractC0210af afVar, float f, float f2, float f3, int i) {
        C0163f a = m3575a(afVar, f, f2);
        a.f5844dJ = f3;
        a.f926k = (short) i;
        a.f950I = C0654f.m1467b(afVar, 0.0f, 1.0f, afVar.f1441bi);
        afVar.f1441bi++;
        return a;
    }

    /* renamed from: a */
    public void m3576a(AbstractC0210af afVar) {
        float f;
        if (!(this.f974ag == 0.0f && this.f975ah == 0.0f) && !afVar.mo2643bw()) {
            if (C0654f.m1520a(this.f1016aV, this.f1017aW, afVar.f5842dH, afVar.f5843dI) > 100.0f) {
                f = C0654f.m1446d(this.f1016aV, this.f1017aW, afVar.f5842dH, afVar.f5843dI);
            } else {
                f = this.f993az;
            }
            float bB = this.f975ah + (this.f974ag / afVar.mo2395bB());
            afVar.f1467bH += C0654f.m1421i(f) * bB;
            afVar.f1468bI += C0654f.m1425h(f) * bB;
        }
    }

    /* renamed from: a */
    public static void m3572a(AbstractC0210af afVar, AbstractC0210af afVar2, float f, C0163f fVar, boolean z) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5497bf && f > 0.0f) {
            f = 0.0f;
        }
        if (afVar2 != null && !afVar2.f1459bz) {
            if (!(fVar == null || !fVar.f922g.f1137ba || afVar == null)) {
                afVar2.mo2854c(afVar.f1461bB);
            }
            if (fVar != null) {
                if (fVar.f976ai != 1.0f && afVar2.mo2643bw()) {
                    f *= fVar.f976ai;
                }
                if (fVar.f977aj != 1.0f && afVar2.mo2357i()) {
                    f *= fVar.f977aj;
                }
            }
            if (f < 0.0f) {
                afVar2.m3326b(afVar, -f, fVar);
            } else {
                boolean z2 = !afVar2.f1459bz && afVar2.f1484bY > 0.0f;
                afVar2.mo2362a(afVar, f, fVar);
                float f2 = f;
                if (afVar2.mo2365J()) {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    u.f5524bG.m1924a(afVar, afVar2, f2);
                }
                if (afVar != null) {
                    afVar.f1509cx += f2;
                    if (z2 && (afVar2.f1459bz || afVar2.f1484bY < 0.0f)) {
                        afVar.f1508cw++;
                        if (afVar instanceof C0367k) {
                            ((C0367k) afVar).mo2875a(EnumC0306ab.killedAnyUnit);
                        }
                    }
                }
            }
            if (fVar != null && !afVar2.f1459bz) {
                float bE = afVar2.m3323bE();
                if (bE != -1.0f) {
                    float d = C0654f.m1446d(fVar.f5842dH, fVar.f5843dI, afVar2.f5842dH, afVar2.f5843dI);
                    float f3 = 100.0f / bE;
                    afVar2.f1467bH += C0654f.m1421i(d) * f3;
                    afVar2.f1468bI += C0654f.m1425h(d) * f3;
                }
            }
        }
    }

    /* renamed from: e */
    public float m3566e() {
        float f = 1.0f;
        if (this.f951J < this.f947F) {
            f = this.f951J / this.f947F;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        C0573e d;
        C0573e d2;
        C0381x a;
        C0573e b;
        float f6;
        float f7;
        float f8;
        float f9;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1013aS) {
            mo405a();
        }
        if (this.f927l != null || this.f996aC) {
            if (this.f924i > 0.0f) {
                this.f924i = C0654f.m1522a(this.f924i, f);
                if (this.f924i > 0.0f) {
                    return;
                }
            }
            C0164g gVar = this.f922g;
            if (this.f924i == 0.0f) {
                this.f924i = -1.0f;
                if (gVar.f1095ak != null) {
                    gVar.f1095ak.m3085a(this.f5842dH, this.f5843dI, this.f5844dJ, this.f993az, this.f925j, null, false, this.f997aD + 1, this, null);
                }
            }
            this.f923h = C0654f.m1522a(this.f923h, f);
            boolean z = false;
            if (this.f1000aG) {
                if (this.f927l == null) {
                    z = true;
                } else if (this.f927l.f1459bz) {
                    z = true;
                }
            }
            if (z) {
                m3580a(gVar.f1107aw, gVar.f1108ax, (C0365i) null);
            }
            if (gVar.f1109ay) {
                this.f999aF = C0654f.m1522a(this.f999aF, f);
                if (this.f999aF == 0.0f) {
                    this.f999aF = gVar.f1110az;
                    m3580a(gVar.f1111aA, gVar.f1112aB, gVar.f1113aC);
                }
            }
            if (!(gVar.f1075Q == 0.0f && gVar.f1076R == 0.0f)) {
                float f10 = gVar.f1075Q;
                if (this.f927l != null) {
                    f10 += this.f927l.f1474bO * gVar.f1076R;
                }
                this.f952K = C0654f.m1425h(((360.0f * this.f950I) + (this.f951J * 1.0f)) % 360.0f) * f10;
                this.f953L = C0654f.m1425h(((360.0f * this.f950I) + (this.f951J * 1.5f)) % 360.0f) * f10;
            }
            if (this.f946E && this.f927l != null) {
                this.f952K = C0654f.m1425h((this.f951J * 1.0f) % 360.0f) * this.f927l.f1474bO * 0.4f;
                this.f953L = C0654f.m1425h((this.f951J * 1.5f) % 360.0f) * this.f927l.f1474bO * 0.4f;
                float f11 = this.f927l.f5842dH + this.f952K;
                float f12 = this.f927l.f5843dI + this.f953L;
                if (this.f5839dE) {
                    this.f1007aN += f;
                    this.f1008aO += f;
                    if (this.f1007aN > 11.0f) {
                        this.f1007aN = C0654f.m1458c(1.0f, 4.0f);
                        C0573e b2 = u.f5517bz.m1989b(f11, f12, this.f927l.f5844dJ, EnumC0572d.custom, false, EnumC0576h.low);
                        if (b2 != null) {
                            b2.f3894ap = 0;
                            b2.f3893ao = 0;
                            b2.f3895aq = (short) 2;
                            b2.f3845s = true;
                            b2.f3858F = 0.5f;
                            b2.f3876X = 60.0f;
                            b2.f3875W = 60.0f;
                            b2.f3860H = 0.7f;
                            b2.f3859G = 0.3f;
                            b2.f3896ar = false;
                            b2.f3869Q = C0654f.m1458c(-0.3f, 0.3f);
                            b2.f3870R = (-0.9f) + C0654f.m1458c(-0.3f, 0.3f);
                        }
                    }
                    if (this.f1008aO > 75.0f) {
                        this.f1008aO = C0654f.m1458c(1.0f, 20.0f);
                        u.f5517bz.m1994b(f11, f12, this.f927l.f5844dJ);
                    }
                }
            }
            float f13 = 5.0f;
            boolean z2 = false;
            boolean z3 = false;
            if (!this.f996aC) {
                float f14 = this.f927l.f5842dH + this.f952K;
                float f15 = this.f927l.f5843dI + this.f953L;
                float f16 = this.f927l.f5844dJ;
                f5 = C0654f.m1446d(this.f5842dH, this.f5843dI, f14, f15);
                f4 = C0654f.m1520a(this.f5842dH, this.f5843dI, f14, f15);
                f2 = f16;
                f3 = f2 - this.f5844dJ;
                f13 = this.f927l.f1474bO;
                z2 = this.f927l instanceof AbstractC0403c;
                z3 = this.f927l.f1487cb > 10.0f + this.f962U;
            } else {
                float f17 = this.f993az;
                if (this.f932q != null) {
                    float f18 = this.f932q.f5842dH + this.f952K;
                    float f19 = this.f932q.f5843dI + this.f953L;
                    float f20 = this.f932q.f5844dJ;
                    f5 = C0654f.m1446d(this.f5842dH, this.f5843dI, f18, f19);
                    f4 = C0654f.m1520a(this.f5842dH, this.f5843dI, f18, f19);
                    f2 = f20;
                    f3 = f2 - this.f5844dJ;
                } else if (this.f927l != null) {
                    float f21 = this.f927l.f5842dH + this.f952K;
                    float f22 = this.f927l.f5843dI + this.f953L;
                    float f23 = this.f927l.f5844dJ;
                    f5 = C0654f.m1446d(this.f5842dH, this.f5843dI, f21, f22);
                    f4 = C0654f.m1520a(this.f5842dH, this.f5843dI, f21, f22);
                    f2 = f23;
                    f3 = f2 - this.f5844dJ;
                    f13 = this.f927l.f1474bO;
                    z2 = this.f927l instanceof AbstractC0403c;
                    z3 = this.f927l.f1487cb > 10.0f + this.f962U;
                } else if (this.f928m) {
                    float f24 = this.f929n + this.f952K;
                    float f25 = this.f930o + this.f953L;
                    float f26 = this.f931p;
                    f5 = C0654f.m1446d(this.f5842dH, this.f5843dI, f24, f25);
                    f4 = C0654f.m1520a(this.f5842dH, this.f5843dI, f24, f25);
                    f2 = f26;
                    f3 = f2 - this.f5844dJ;
                } else {
                    float f27 = this.f929n + this.f952K;
                    float f28 = this.f930o + this.f953L;
                    f5 = C0654f.m1446d(this.f5842dH, this.f5843dI, f27, f28);
                    f4 = C0654f.m1520a(this.f5842dH, this.f5843dI, f27, f28);
                    f2 = 0.0f;
                    f3 = 0.0f - this.f5844dJ;
                }
            }
            float f29 = gVar.f1072N;
            if (f4 < 225.0f) {
                f29 = gVar.f1073O;
            }
            if (f29 >= 0.0f) {
                this.f993az += C0654f.m1457c(this.f993az, f5, f29 * f);
                f5 = this.f993az;
            } else {
                this.f993az = f5;
            }
            boolean z4 = false;
            boolean z5 = false;
            float f30 = f5;
            if (this.f988au != null && !this.f988au.f5837dC) {
                if (this.f989av >= 0) {
                    AbstractC0515r rVar = (AbstractC0515r) this.f988au;
                    if (this.f989av >= rVar.mo2205bg()) {
                        this.f989av = 0;
                    }
                    C0814ag D = rVar.mo2347D(this.f989av);
                    f9 = D.f5735a;
                    f8 = D.f5736b;
                    f7 = this.f925j.f5844dJ + D.f5737c;
                } else {
                    f9 = this.f988au.f5842dH;
                    f8 = this.f988au.f5843dI;
                    f7 = this.f988au.f5844dJ;
                }
                float f31 = f9 - this.f990aw;
                float f32 = f8 - this.f991ax;
                float f33 = f7 - this.f992ay;
                this.f5842dH += f31;
                this.f5843dI += f32;
                this.f5844dJ += f33;
                this.f990aw = f9;
                this.f991ax = f8;
                this.f992ay = f7;
            }
            if (!this.f942A) {
                this.f5842dH += this.f936u * f;
                this.f5843dI += this.f937v * f;
                this.f5844dJ += this.f938w * f;
                if (gVar.f1065G != 0.0f && this.f5844dJ > 0.0f) {
                    this.f5844dJ -= gVar.f1065G * f;
                    f3 = f2 - this.f5844dJ;
                }
                if (!this.f1001aH || this.f1002aI < this.f5844dJ || this.f1004aK) {
                    float f34 = this.f935t * f;
                    z4 = true;
                    if (f4 < f34 * f34) {
                        f34 = C0654f.m1523a(f4);
                        f4 = 0.0f;
                    }
                    this.f5842dH += C0654f.m1421i(f5) * f34;
                    this.f5843dI += C0654f.m1425h(f5) * f34;
                }
                if (this.f1001aH) {
                    if (this.f1005aL < 0.0f) {
                        f6 = this.f935t * f;
                        z4 = true;
                    } else {
                        f6 = this.f1005aL * f;
                    }
                    if (!this.f1004aK) {
                        this.f5844dJ = C0654f.m1521a(this.f5844dJ, this.f1003aJ, f6);
                        if (this.f5844dJ < this.f1002aI) {
                            f30 = -90.0f;
                        }
                        if (this.f5844dJ >= this.f1003aJ) {
                            this.f1004aK = true;
                        }
                    } else if (f4 < 400.0f) {
                        this.f5844dJ = C0654f.m1521a(this.f5844dJ, f2, f6);
                        if (C0654f.m1459c(this.f5844dJ - f2) > 0.5f) {
                            f30 = 90.0f;
                            z5 = true;
                        }
                    }
                } else {
                    float f35 = this.f935t * f;
                    z4 = true;
                    if (f3 != 0.0f) {
                        if (f4 > 0.1d) {
                            f35 = C0654f.m1476b((C0654f.m1459c(f3) / C0654f.m1523a(f4)) * this.f935t * f, this.f935t * f);
                        }
                        this.f5844dJ += C0654f.m1476b(f3, f35);
                        f3 = f2 - this.f5844dJ;
                    }
                }
            }
            if (z4 && this.f933r > 0.0f) {
                this.f935t = C0654f.m1521a(this.f935t, this.f933r, this.f934s * f);
            }
            if (gVar.f1096al != 0.0f) {
                float h = C0654f.m1425h((((this.f951J * 360.0f) / gVar.f1097am) + (360.0f * this.f950I)) % 360.0f) * gVar.f1096al * f;
                this.f5842dH += C0654f.m1421i(f5 + 90.0f) * h;
                this.f5843dI += C0654f.m1425h(f5 + 90.0f) * h;
            }
            if ((this.f1006aM || gVar.f1091ag != null) && this.f5839dE && !this.f1012bn) {
                this.f1007aN += f;
                if (this.f1007aN > gVar.f1090af) {
                    this.f1007aN = 0.0f;
                    boolean z6 = false;
                    if (this.f945D) {
                        z6 = true;
                    }
                    if (gVar.f1091ag != null) {
                        gVar.f1091ag.m2711a(this.f5842dH, this.f5843dI, this.f5844dJ, this.f1014aT, this);
                    }
                    if (this.f1006aM && (b = u.f5517bz.m1989b(this.f5842dH, this.f5843dI, this.f5844dJ, EnumC0572d.custom, z6, EnumC0576h.low)) != null) {
                        if (this.f5844dJ >= 0.0f) {
                            b.f3894ap = 0;
                            b.f3893ao = 0;
                            b.f3895aq = (short) 2;
                            b.f3845s = true;
                            b.f3858F = 0.5f;
                            b.f3875W = 70.0f;
                            b.f3876X = b.f3875W;
                            b.f3896ar = true;
                            if (z5) {
                                b.f3896ar = false;
                            }
                            b.f3870R = 0.1f;
                            b.f3846t = true;
                            b.f3847u = 5.0f;
                            b.f3860H = 0.5f;
                            b.f3859G = 1.2f;
                            b.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
                            if (this.f945D) {
                                b.f3860H = 0.5f;
                                b.f3859G = 2.1f;
                            }
                        } else {
                            b.f3894ap = 9;
                            b.f3893ao = 1;
                            b.f3895aq = (short) 1;
                            b.f3845s = true;
                            b.f3858F = 0.5f;
                            b.f3876X = 60.0f;
                            b.f3875W = 60.0f;
                            b.f3870R = 0.1f;
                        }
                    }
                }
            }
            if (!this.f1012bn) {
                boolean z7 = false;
                AbstractC0210af afVar = null;
                boolean z8 = false;
                float f36 = 6.0f;
                if (z2) {
                    f36 = f13 * 0.8f;
                    if (f36 < 6.0f) {
                        f36 = 6.0f;
                    }
                }
                if (z3) {
                    f36 = f13 * 1.1f;
                }
                if (f4 < f36 * f36 && C0654f.m1459c(f3) < 3.0f) {
                    z7 = true;
                    afVar = this.f927l;
                }
                if (this.f942A) {
                    z7 = true;
                    afVar = this.f927l;
                }
                if (this.f973af && this.f923h == 0.0f) {
                    z7 = true;
                }
                if (this.f986as) {
                    float f37 = this.f994aA + 50.0f;
                    AbstractC0210af[] a2 = AbstractC0210af.f1442bj.m456a();
                    int size = AbstractC0210af.f1442bj.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC0210af afVar2 = a2[i];
                        if (afVar2.f5842dH + f37 > this.f5842dH && afVar2.f5842dH - f37 < this.f5842dH && afVar2.f5843dI + f37 > this.f5843dI && afVar2.f5843dI - f37 < this.f5843dI && afVar2.f1458by && false == afVar2.mo2357i() && afVar2.f1501cp == null) {
                            float a3 = C0654f.m1520a(this.f5842dH, this.f5843dI, afVar2.f5842dH, afVar2.f5843dI);
                            float f38 = this.f994aA + afVar2.f1474bO;
                            if (a3 < f38 * f38) {
                                z7 = true;
                                afVar = afVar2;
                            }
                        }
                    }
                }
                if (this.f987at) {
                    u.f5511bt.m3703a(this.f5842dH, this.f5843dI);
                    if (u.f5520bC.m958a(EnumC0212ah.HOVER, u.f5511bt.f764M, u.f5511bt.f765N)) {
                        z7 = true;
                        z8 = true;
                    }
                }
                if (this.f996aC) {
                }
                if (this.f1019aY && (((this.f1001aH && z5 && this.f5844dJ < 30.0f) || z7) && this.f925j != null)) {
                    this.f1019aY = false;
                    C0511n nVar = new C0511n(false);
                    nVar.f5842dH = this.f5842dH;
                    nVar.f5843dI = this.f5843dI;
                    nVar.mo2305a(this.f925j.f1461bB);
                    nVar.f3385a = 15;
                    nVar.f3386b = 360.0f;
                    AbstractC0171m.m3473c(nVar);
                }
                if (z7) {
                    this.f1012bn = true;
                    this.f1016aV = this.f5842dH;
                    this.f1017aW = this.f5843dI;
                    this.f1018aX = this.f5844dJ;
                    if (this.f942A) {
                        if (this.f996aC) {
                            this.f1016aV = this.f929n;
                            this.f1017aW = this.f930o;
                            this.f1018aX = 0.0f;
                        }
                        if (this.f927l != null) {
                            this.f1016aV = this.f927l.f5842dH + this.f952K;
                            this.f1017aW = this.f927l.f5843dI + this.f953L;
                            this.f1018aX = this.f927l.f5844dJ;
                        }
                    }
                    if (!this.f943B && !this.f954M && !gVar.f1081W) {
                        this.f960S = false;
                    }
                    boolean z9 = false;
                    if (this.f927l != null) {
                        z9 = this.f927l.f1487cb > 10.0f;
                    }
                    C0381x xVar = gVar.f1132aV;
                    if (z9) {
                        xVar = gVar.f1133aW;
                    }
                    if (!(this.f927l == null || (a = gVar.m3563a(this.f927l)) == null)) {
                        xVar = a;
                    }
                    if (xVar != null) {
                        xVar.m2711a(this.f1016aV, this.f1017aW, this.f1018aX, this.f1014aT, this.f927l);
                    }
                    if (gVar.f1093ai != null) {
                        gVar.f1093ai.m3085a(this.f5842dH, this.f5843dI, this.f5844dJ, this.f993az, this.f925j, null, false, this.f997aD + 1, this, this.f927l);
                    }
                    if (!(gVar.f1134aX == null || this.f925j == null)) {
                        gVar.f1134aX.m3070a(this.f1016aV, this.f1017aW, 0.0f, this.f993az, this.f925j.f1461bB, false, this.f925j);
                    }
                    if (gVar.f1135aY > 0 && this.f925j != null && (this.f925j instanceof C0367k)) {
                        C0367k kVar = (C0367k) this.f925j;
                        for (int i2 = 0; i2 < gVar.f1135aY; i2++) {
                            if (kVar.f2462x != null && kVar.f2462x.size() > 0) {
                                AbstractC0210af afVar3 = (AbstractC0210af) kVar.f2462x.remove(kVar.f2462x.size() - 1);
                                C0851y.m422a(afVar3, kVar);
                                afVar3.f5842dH = this.f1016aV;
                                afVar3.f5843dI = this.f1017aW;
                                afVar3.f1471bL = this.f993az;
                                afVar3.f1468bI = 0.0f;
                                afVar3.f1467bH = 0.0f;
                                afVar3.f1463bD = 0.0f;
                                afVar3.f1464bE = 0.0f;
                                if (afVar3 instanceof AbstractC0515r) {
                                    AbstractC0515r rVar2 = (AbstractC0515r) afVar3;
                                    rVar2.m2229ax();
                                    rVar2.m2162j(afVar3.f1471bL);
                                    if (afVar3 instanceof C0367k) {
                                        ((C0367k) afVar3).m2818dl();
                                    }
                                }
                                kVar.m2804z(afVar3);
                            }
                        }
                    }
                    if (gVar.f1136aZ && this.f925j != null) {
                        this.f925j.f5842dH = this.f1016aV;
                        this.f925j.f5843dI = this.f1017aW;
                        if (this.f925j instanceof C0367k) {
                            ((C0367k) this.f925j).mo2875a(EnumC0306ab.teleported);
                        }
                    }
                    if (!z8 && afVar != null) {
                        if (this.f946E) {
                            this.f1012bn = false;
                            float e = (this.f962U / 60.0f) * f * m3566e();
                            if (this.f967Z == 0.0f) {
                                m3576a(afVar);
                            }
                            m3572a(this.f925j, afVar, gVar.m3562a(afVar, e, true), this, false);
                        } else {
                            if (this.f967Z == 0.0f) {
                                m3576a(afVar);
                            }
                            m3572a(this.f925j, afVar, gVar.m3562a(afVar, this.f962U, false), this, false);
                        }
                    }
                    if (this.f932q != null) {
                        if (gVar.f1036d) {
                            this.f932q.f923h = 0.0f;
                        } else {
                            this.f932q.m3571b();
                        }
                        mo405a();
                    }
                    if (!this.f946E) {
                        boolean z10 = true;
                        if (this.f927l != null && this.f927l.f1487cb > 10.0f) {
                            z10 = false;
                            if (gVar.f1133aW == null && (d2 = u.f5517bz.m1983d(this.f1016aV, this.f1017aW, this.f1018aX, -1127220)) != null) {
                                d2.f3875W = 10.0f;
                                d2.f3859G = 0.5f;
                                if (this.f1010aQ) {
                                    d2.f3875W = 25.0f;
                                    d2.f3859G = 1.0f;
                                }
                                d2.f3895aq = (short) 2;
                                d2.f3876X = d2.f3875W;
                            }
                        }
                        if (this.f948G) {
                            z10 = false;
                            C0574f.m1969b(this.f5842dH, this.f5843dI).f3902a = 21.0f;
                        }
                        if (z10) {
                            if (!this.f1010aQ) {
                                if (gVar.f1132aV == null) {
                                    u.f5517bz.m1987c(this.f1016aV, this.f1017aW, this.f1018aX);
                                }
                            } else if (gVar.f1132aV == null) {
                                if (this.f967Z > 10.0f && (d = u.f5517bz.m1983d(this.f1016aV, this.f1017aW, this.f1018aX, 0)) != null) {
                                    d.f3859G = this.f967Z / 25.0f;
                                    d.f3858F = 0.7f;
                                    if (this.f1018aX > 5.0f) {
                                        d.f3895aq = (short) 2;
                                    }
                                }
                                u.f5517bz.m1994b(this.f1016aV, this.f1017aW, this.f1018aX);
                                if (this.f1011aR && !this.f945D) {
                                    u.f5512bu.m2114a(C0530e.f3575m, 0.5f, 1.0f + C0654f.m1458c(-0.06f, 0.06f), this.f1016aV, this.f1017aW);
                                }
                            }
                            if (this.f945D && gVar.f1132aV == null) {
                                u.f5512bu.m2114a(C0530e.f3590B, 1.6f, 0.7f, this.f1016aV, this.f1017aW);
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a4 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, 255, 255));
                                if (a4 != null) {
                                    a4.f3860H = 14.0f;
                                    a4.f3859G = 8.0f;
                                    a4.f3858F = 0.9f;
                                    a4.f3875W = 35.0f;
                                    a4.f3876X = a4.f3875W;
                                    a4.f3845s = true;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e c = u.f5517bz.m1985c(this.f1016aV, this.f1017aW, this.f1018aX, -1127220);
                                if (c != null) {
                                    c.f3860H = 1.5f;
                                    c.f3859G = 3.0f;
                                    c.f3895aq = (short) 2;
                                    c.f3875W = 20.0f;
                                    c.f3876X = c.f3875W;
                                    c.f3874V = 0.0f;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e c2 = u.f5517bz.m1985c(this.f1016aV, this.f1017aW, this.f1018aX, -1127220);
                                if (c2 != null) {
                                    c2.f3860H = 0.2f;
                                    c2.f3859G = 5.0f;
                                    c2.f3895aq = (short) 2;
                                    c2.f3875W = 65.0f;
                                    c2.f3876X = c2.f3875W;
                                    c2.f3874V = 0.0f;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a5 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, 255, 255));
                                if (a5 != null) {
                                    a5.f3860H = 3.0f;
                                    a5.f3859G = 6.0f;
                                    a5.f3858F = 0.9f;
                                    a5.f3875W = 290.0f;
                                    a5.f3876X = a5.f3875W;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a6 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (a6 != null) {
                                    a6.f3860H = 2.0f;
                                    a6.f3859G = 6.0f;
                                    a6.f3858F = 0.5f;
                                    a6.f3875W = 370.0f;
                                    a6.f3876X = a6.f3875W;
                                    a6.f3874V = 10.0f;
                                }
                                for (int i3 = 0; i3 < 1; i3++) {
                                    u.f5517bz.m1988b(EnumC0576h.critical);
                                    C0573e a7 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                    if (a7 != null) {
                                        a7.f3860H = 0.2f;
                                        a7.f3859G = 9.0f;
                                        a7.f3858F = 0.7f;
                                        a7.f3875W = 210.0f;
                                        a7.f3876X = a7.f3875W;
                                        a7.f3874V = 20 + (i3 * 110);
                                    }
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a8 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, 255, 255));
                                if (a8 != null) {
                                    a8.f3860H = 3.0f;
                                    a8.f3859G = 4.0f;
                                    a8.f3858F = 0.2f;
                                    a8.f3875W = 870.0f;
                                    a8.f3876X = a8.f3875W;
                                    a8.f3845s = true;
                                    a8.f3874V = 70.0f;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a9 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                                if (a9 != null) {
                                    a9.f3860H = 4.0f;
                                    a9.f3859G = 1.0f;
                                    a9.f3858F = 0.9f;
                                    a9.f3875W = 320.0f;
                                    a9.f3876X = a9.f3875W;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a10 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (a10 != null) {
                                    a10.f3860H = 2.0f;
                                    a10.f3859G = 1.0f;
                                    a10.f3858F = 1.0f;
                                    a10.f3875W = 340.0f;
                                    a10.f3876X = a10.f3875W;
                                    a10.f3846t = true;
                                    a10.f3847u = 20.0f;
                                }
                                u.f5517bz.m1988b(EnumC0576h.critical);
                                C0573e a11 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                                if (a11 != null) {
                                    a11.f3860H = 1.5f;
                                    a11.f3859G = 1.5f;
                                    a11.f3858F = 0.3f;
                                    a11.f3875W = 1340.0f;
                                    a11.f3876X = a11.f3875W;
                                    a11.f3846t = true;
                                    a11.f3847u = 40.0f;
                                    a11.f3874V = 140.0f;
                                }
                                for (int i4 = 0; i4 < 4; i4++) {
                                    u.f5517bz.m1988b(EnumC0576h.critical);
                                    C0573e a12 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                    if (a12 != null) {
                                        a12.f3860H = 1.5f;
                                        a12.f3859G = 1.4f;
                                        a12.f3858F = 1.3f;
                                        a12.f3875W = 340.0f;
                                        a12.f3876X = a12.f3875W;
                                        a12.f3870R = -0.29f;
                                        a12.f3846t = true;
                                        a12.f3847u = 50.0f;
                                        a12.f3874V = 30 + (i4 * 40);
                                    }
                                }
                                for (int i5 = 0; i5 < 2; i5++) {
                                    u.f5517bz.m1988b(EnumC0576h.critical);
                                    C0573e a13 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW, this.f5844dJ, Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                    if (a13 != null) {
                                        a13.f3860H = 1.3f;
                                        a13.f3859G = 1.0f;
                                        a13.f3858F = 1.0f;
                                        a13.f3875W = 340.0f;
                                        a13.f3876X = a13.f3875W;
                                        a13.f3870R = -0.14f;
                                        a13.f3846t = true;
                                        a13.f3847u = 50.0f;
                                        a13.f3874V = 70 + (i5 * 70);
                                    }
                                }
                                for (int i6 = 0; i6 < 4; i6++) {
                                    u.f5517bz.m1988b(EnumC0576h.critical);
                                    C0573e a14 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW - 30.0f, this.f5844dJ, -16711936);
                                    if (a14 != null) {
                                        a14.f3860H = 1.5f;
                                        a14.f3859G = 2.6f;
                                        a14.f3858F = 1.3f;
                                        a14.f3875W = 510.0f;
                                        a14.f3876X = a14.f3875W;
                                        a14.f3870R = -0.2f;
                                        a14.f3846t = true;
                                        a14.f3847u = 50.0f;
                                        a14.f3855C = null;
                                        a14.f3851y = Color.m4213a(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                        a14.f3874V = 20 + (i6 * 40);
                                    }
                                }
                                for (int i7 = 0; i7 < 2; i7++) {
                                    u.f5517bz.m1988b(EnumC0576h.critical);
                                    C0573e a15 = u.f5517bz.m2009a(this.f1016aV, this.f1017aW - 30.0f, this.f5844dJ, -16711936);
                                    if (a15 != null) {
                                        a15.f3860H = 1.5f;
                                        a15.f3859G = 3.8f;
                                        a15.f3858F = 0.8f;
                                        a15.f3875W = 590.0f;
                                        a15.f3876X = a15.f3875W;
                                        a15.f3870R = -0.2f;
                                        a15.f3846t = true;
                                        a15.f3847u = 50.0f;
                                        a15.f3855C = null;
                                        a15.f3851y = Color.m4213a(105, 115, 115, 115);
                                        a15.f3874V = 20 + (i7 * 40);
                                    }
                                }
                                for (int i8 = 0; i8 < 1; i8++) {
                                    C0574f a16 = C0574f.m1973a(this.f1016aV + C0654f.m1518a(-10.0f, 10.0f, (int) this.f5835dA), this.f1017aW + C0654f.m1518a(-10.0f, 10.0f, ((int) this.f5835dA) + i8));
                                    if (a16 != null) {
                                        a16.f3921t = 200 + (i8 * 70);
                                        a16.f3902a = 980 + (i8 * 800);
                                    }
                                }
                                if (!C0851y.m409c(this.f1016aV, this.f1017aW)) {
                                    C0169k.m3537a(this.f1016aV, this.f1017aW, EnumC0170l.nuke);
                                }
                            }
                        }
                    }
                }
            }
            if (this.f1012bn && !this.f963V) {
                this.f964W = C0654f.m1522a(this.f964W, f);
                if (this.f982ao) {
                    m3570b(1.0f - (this.f964W / this.f965X));
                }
                if (this.f964W == 0.0f) {
                    this.f963V = true;
                    m3570b(1.0f);
                    if (!this.f943B && !this.f954M && !gVar.f1081W) {
                        mo405a();
                    }
                }
            }
            this.f951J += f;
            if (this.f923h == 0.0f && (!this.f1012bn || this.f963V)) {
                if (gVar.f1094aj != null) {
                    gVar.f1094aj.m3085a(this.f5842dH, this.f5843dI, this.f5844dJ, this.f993az, this.f925j, null, false, this.f997aD + 1, this, null);
                }
                mo405a();
            }
            if (!this.f1015aU) {
                this.f1014aT = f30;
                this.f1015aU = true;
            }
            this.f1014aT += C0654f.m1457c(this.f1014aT, f30, 12.0f * f);
            return;
        }
        mo405a();
    }

    /* renamed from: b */
    public void m3570b(float f) {
        boolean z = false;
        if (!this.f922g.f1038f) {
            if (this.f922g.f1037e) {
                z = true;
            }
            if (!z) {
                if (this.f966Y != 0.0f && this.f967Z > 0.0f) {
                    z = true;
                }
                if (!(this.f974ag == 0.0f && this.f975ah == 0.0f) && this.f967Z > 0.0f) {
                    z = true;
                }
            }
            if (z) {
                float f2 = this.f967Z * f;
                float f3 = f2;
                if (this.f922g.f1040h) {
                    f3 += 150.0f;
                }
                AbstractC0789l u = AbstractC0789l.m638u();
                f1029bi.clear();
                u.f5528bK.m2454b(this.f1016aV, this.f1017aW, f3, f1029bi);
                AbstractC0210af[] a = f1029bi.m456a();
                int size = f1029bi.size();
                for (int i = 0; i < size; i++) {
                    m3569b(a[i], f, f2);
                }
                f1029bi.clear();
            }
        }
    }

    /* renamed from: b */
    public void m3569b(AbstractC0210af afVar, float f, float f2) {
        if (afVar.f1501cp == null) {
            if (this.f983ap == null || !this.f983ap.contains(afVar)) {
                if (this.f925j != null) {
                    AbstractC0171m mVar = this.f925j.f1461bB;
                    AbstractC0171m mVar2 = afVar.f1461bB;
                    if (mVar2 != mVar && mVar.m3464d(mVar2)) {
                        return;
                    }
                    if (this.f968aa && !mVar.m3474c(mVar2)) {
                        return;
                    }
                    if (this.f969ab && mVar.m3474c(mVar2)) {
                        return;
                    }
                }
                if (afVar.f5844dJ >= -5.0f || this.f1018aX < -2.0f || this.f970ac) {
                    if (this.f972ae) {
                        if (afVar.mo2357i() != (this.f1018aX >= 5.0f)) {
                            return;
                        }
                    } else if (!this.f971ad && afVar.mo2357i()) {
                        return;
                    }
                    float a = C0654f.m1520a(this.f1016aV, this.f1017aW, afVar.f5842dH, afVar.f5843dI);
                    if (a <= f2 * f2 || this.f922g.f1040h) {
                        float sqrt = (float) StrictMath.sqrt(a);
                        if (this.f922g.f1040h) {
                            sqrt -= afVar.f1474bO;
                            if (sqrt < 0.0f) {
                                sqrt = 0.0f;
                            }
                        }
                        if (sqrt <= f2 && sqrt >= this.f922g.f1042j) {
                            m3579a(f, afVar, sqrt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3579a(float f, AbstractC0210af afVar, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f967Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f922g.f1039g) {
            f3 = 1.0f;
        }
        m3576a(afVar);
        m3572a(this.f925j, afVar, this.f922g.m3562a(afVar, f3 * this.f966Y, true), this, true);
        if (this.f982ao) {
            if (this.f983ap == null) {
                this.f983ap = new C0835m();
            }
            this.f983ap.add(afVar);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        if (lVar.f5565cv.m4116b(this.f5842dH, this.f5843dI)) {
            return true;
        }
        if ((this.f943B || this.f946E || this.f922g.f1081W) && this.f927l != null && lVar.f5565cv.m4116b(this.f927l.f5842dH, this.f927l.f5843dI)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.f960S || this.f924i > 0.0f) {
            return false;
        }
        C0164g gVar = this.f922g;
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0755l lVar = u.f5514bw;
        float f5 = this.f5842dH - u.f5547cd;
        float f6 = this.f5843dI - u.f5548ce;
        if (this.f927l != null) {
            f4 = this.f927l.f5842dH;
            f3 = this.f927l.f5843dI;
            f2 = this.f927l.f5844dJ;
        } else {
            f4 = this.f929n;
            f3 = this.f930o;
            f2 = this.f931p;
        }
        if (!this.f1020aZ && !this.f945D) {
            boolean z = false;
            if (this.f942A) {
                if (this.f927l != null) {
                    if (!u.f5511bt.m3701a(this.f927l.f5842dH, this.f927l.f5843dI, u.f5493bb)) {
                        z = true;
                    }
                } else if (this.f928m && !u.f5511bt.m3701a(this.f929n, this.f930o, u.f5493bb)) {
                    z = true;
                }
            }
            if (!(u.f5511bt.m3701a(this.f5842dH, this.f5843dI, u.f5493bb) || z)) {
                return false;
            }
            this.f1020aZ = true;
        }
        if (this.f946E || gVar.f1081W) {
            if (gVar.f1082X != null) {
                Paint f7 = m3565f();
                float f8 = 0.0f;
                if (gVar.f1087ac != 0.0f) {
                    f8 = 0.0f + (gVar.f1087ac * this.f951J);
                }
                float f9 = this.f5842dH - u.f5547cd;
                float f10 = (this.f5843dI - u.f5548ce) - this.f5844dJ;
                float f11 = (f4 - u.f5547cd) + this.f952K;
                float f12 = ((f3 - f2) - u.f5548ce) + this.f953L;
                float f13 = (f11 + f9) * 0.5f;
                float f14 = (f12 + f10) * 0.5f;
                float b = C0654f.m1474b(f13, f14, f11, f12);
                float d = C0654f.m1446d(f13, f14, f11, f12);
                lVar.mo125j();
                f921f.m4122a(f13 - gVar.f1082X.f5247m, f14 - b, f13 + gVar.f1082X.f5247m, f14 + b);
                lVar.mo199a(d + 90.0f, f13, f14);
                lVar.mo168a(gVar.f1082X, f921f, f7, 0.0f, f8, 0, 0);
                lVar.mo124k();
                if (gVar.f1083Y != null) {
                    if (gVar.f1084Z) {
                        lVar.mo125j();
                        lVar.mo199a(d + 90.0f, f9, f10);
                        lVar.mo175a(gVar.f1083Y, f9, f10, f7);
                        lVar.mo124k();
                    } else {
                        lVar.mo175a(gVar.f1083Y, f9, f10, f7);
                    }
                }
                if (gVar.f1085aa == null) {
                    return true;
                }
                if (gVar.f1086ab) {
                    lVar.mo125j();
                    lVar.mo199a(d + 90.0f, f11, f12);
                    lVar.mo175a(gVar.f1085aa, f11, f12, f7);
                    lVar.mo124k();
                    return true;
                }
                lVar.mo175a(gVar.f1085aa, f11, f12, f7);
                return true;
            }
            f1026bf.m4164c((int) (60.0f + (m3566e() * 60.0f)));
            float f15 = (f4 - u.f5547cd) + this.f952K;
            float f16 = ((f3 - f2) - u.f5548ce) + this.f953L;
            f1026bf.m4192a(6.0f);
            lVar.mo197a(this.f5842dH - u.f5547cd, (this.f5843dI - u.f5548ce) - this.f5844dJ, f15, f16, f1026bf);
            f1026bf.m4192a(3.0f);
            lVar.mo197a(this.f5842dH - u.f5547cd, (this.f5843dI - u.f5548ce) - this.f5844dJ, f15, f16, f1026bf);
            lVar.mo195a(f15, f16, 8.0f, f1026bf);
            lVar.mo195a(f15, f16, 5.0f, f1026bf);
            return true;
        } else if (this.f943B) {
            float f17 = (f4 - u.f5547cd) + this.f952K;
            float f18 = ((f3 - f2) - u.f5548ce) + this.f953L;
            f1024bd.m4169b(this.f985ar);
            f1025be.m4169b(this.f985ar);
            f1025be.m4164c((int) (f1025be.m4155f() * 0.5f));
            lVar.mo197a(this.f5842dH - u.f5547cd, (this.f5843dI - u.f5548ce) - this.f5844dJ, f17, f18, f1025be);
            lVar.mo197a(this.f5842dH - u.f5547cd, (this.f5843dI - u.f5548ce) - this.f5844dJ, f17, f18, f1024bd);
            lVar.mo195a(f17, f18, 5.0f, f1024bd);
            return true;
        } else if (this.f954M) {
            this.f955N = C0654f.m1522a(this.f955N, f);
            if (this.f956O == null) {
                this.f956O = new float[20];
                this.f955N = 0.0f;
            }
            if (this.f955N == 0.0f) {
                this.f955N = 4.0f;
                for (int i = 0; i < this.f956O.length; i++) {
                    this.f956O[i] = C0654f.m1458c(-10.0f, 10.0f);
                }
            }
            float f19 = this.f5842dH - u.f5547cd;
            float f20 = (this.f5843dI - u.f5548ce) - this.f5844dJ;
            float f21 = f4 - u.f5547cd;
            float f22 = (f3 - f2) - u.f5548ce;
            float c = C0654f.m1456c(f19, f20, f21, f22);
            int length = this.f956O.length;
            if (c < 200.0f) {
                length = C0654f.m1472b(0, length - 5);
            } else if (c < 100.0f) {
                length = C0654f.m1472b(0, length - 10);
            }
            float f23 = c / (length - 1);
            float d2 = C0654f.m1446d(f19, f20, f21, f22);
            float f24 = f19;
            float f25 = f20;
            float i2 = C0654f.m1421i(d2);
            float h = C0654f.m1425h(d2);
            for (int i3 = 0; i3 < length; i3++) {
                float f26 = this.f956O[i3];
                float f27 = f19 + (i2 * i3 * f23);
                float f28 = f20 + (h * i3 * f23);
                if (i3 != length - 1) {
                    f27 -= h * f26;
                    f28 += i2 * f26;
                }
                lVar.mo197a(f24, f25, f27, f28, f1027bg);
                f24 = f27;
                f25 = f28;
            }
            return true;
        } else if (this.f957P != -1) {
            C0748e eVar = f917b;
            int i4 = 20;
            int i5 = 20;
            if (this.f959R == 1) {
                eVar = f919d;
                i4 = 60;
                i5 = 60;
            } else if (this.f959R == 2) {
                eVar = f918c;
                i4 = 20;
                i5 = 20;
            }
            if (gVar.f1061C != null) {
                C0851y.m417a(gVar.f1061C, f5, f6, 0.0f, this.f1014aT, this.f939x, f1023bc, gVar.f1061C.f5245k, gVar.f1061C.f5246l, this.f958Q);
            } else if (this.f958Q != -1 && this.f941z) {
                C0851y.m417a(eVar, f5, f6, 0.0f, this.f1014aT, this.f939x, f1023bc, i4, i5, this.f958Q);
            }
            if (gVar.f1060B != null) {
                eVar = gVar.f1060B;
                i4 = gVar.f1060B.f5245k;
                i5 = gVar.f1060B.f5246l;
            }
            C0851y.m417a(eVar, f5, f6, this.f5844dJ, this.f1014aT, this.f939x, m3565f(), i4, i5, this.f957P);
            return true;
        } else {
            f1022bb.m4169b(this.f985ar);
            if (this.f5844dJ > 0.0f && this.f941z) {
                lVar.mo195a(f5, f6, this.f939x, f1023bc);
            }
            lVar.mo195a(f5, f6 - this.f5844dJ, this.f939x, f1022bb);
            if (this.f940y <= 0.0f) {
                return true;
            }
            f1022bb.m4164c(f1022bb.m4155f() / 3);
            lVar.mo195a(f5, f6 - this.f5844dJ, this.f940y, f1022bb);
            return true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: d */
    public void mo395d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: f */
    public boolean mo391f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m3565f() {
        C0760q qVar;
        if (this.f985ar == f984aq) {
            qVar = f1021ba;
        } else if (AbstractC0789l.m699aj()) {
            qVar = m3578a(this.f985ar);
        } else {
            qVar = f1022bb;
            qVar.m4169b(this.f985ar);
        }
        return qVar;
    }

    /* renamed from: a */
    public C0760q m3578a(int i) {
        if (this.f1030bj != null) {
            return this.f1030bj;
        }
        if (f1031bk == null || f1032bl != i) {
            C0760q qVar = new C0760q();
            qVar.m4187a(new LightingColorFilter(i, 0));
            qVar.m4169b(i);
            f1031bk = qVar;
            f1032bl = i;
            this.f1030bj = qVar;
            return this.f1030bj;
        }
        this.f1030bj = f1031bk;
        return this.f1030bj;
    }

    /* renamed from: a */
    public void m3580a(float f, float f2, C0365i iVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f925j == null) {
            AbstractC0789l.m682b("Projectile: cannot Retarget: source==null");
            return;
        }
        float i = this.f5842dH + (C0654f.m1421i(this.f993az) * f2);
        float h = this.f5843dI + (C0654f.m1425h(this.f993az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        AbstractC0515r rVar = null;
        AbstractC0210af afVar = null;
        if (this.f925j instanceof AbstractC0515r) {
            rVar = (AbstractC0515r) this.f925j;
            afVar = rVar.m2323Z();
        }
        Iterator it = u.f5528bK.m2463a(i, h, f).iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (this.f925j.f1461bB != afVar2.f1461bB) {
                boolean z = true;
                if (rVar != null) {
                    z = rVar.m2218b(afVar2, true);
                }
                if (z && this.f926k >= 0 && rVar != null && this.f926k < rVar.mo2205bg() && !rVar.mo2306a((int) this.f926k, afVar2, true, false)) {
                    z = false;
                }
                if (iVar != null && !C0364h.m2904a(iVar, afVar2.mo2846cM())) {
                    z = false;
                }
                if (z) {
                    float a = C0654f.m1520a(i, h, afVar2.f5842dH, afVar2.f5843dI);
                    boolean z2 = false;
                    if (f4 == -1.0f || a < f4) {
                        z2 = true;
                    }
                    if (afVar == afVar2) {
                        z2 = true;
                    }
                    if (z2 && a < f3) {
                        f4 = a;
                        this.f927l = afVar2;
                    }
                }
            }
        }
    }
}
