package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.game.p011a.AbstractC0138h;
import com.corrodinggames.rts.game.p011a.C0139i;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.custom.C0314aj;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.EnumC0306ab;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.game.units.p023d.C0425p;
import com.corrodinggames.rts.game.units.p026f.AbstractC0460j;
import com.corrodinggames.rts.game.units.p027g.C0463b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0536ab;
import com.corrodinggames.rts.gameFramework.C0598d;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0588bk;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p037h.C0733g;
import com.corrodinggames.rts.gameFramework.p037h.C0734h;
import com.corrodinggames.rts.gameFramework.p037h.C0738l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0814ag;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.game.units.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/r.class */
public abstract class AbstractC0515r extends AbstractC0283c {

    /* renamed from: D */
    protected C0748e f3387D;

    /* renamed from: E */
    protected C0748e f3388E;

    /* renamed from: a */
    private int f3389a;

    /* renamed from: b */
    private float f3390b;

    /* renamed from: c */
    private float f3391c;

    /* renamed from: d */
    private float f3392d;

    /* renamed from: e */
    private float f3393e;

    /* renamed from: I */
    public AbstractC0210af f3399I;

    /* renamed from: J */
    public float f3400J;

    /* renamed from: K */
    public float f3401K;

    /* renamed from: L */
    public float f3402L;

    /* renamed from: h */
    private boolean f3403h;

    /* renamed from: M */
    public float f3404M;

    /* renamed from: N */
    public float f3405N;

    /* renamed from: O */
    public float f3406O;

    /* renamed from: P */
    public float f3407P;

    /* renamed from: i */
    private boolean f3408i;

    /* renamed from: j */
    private boolean f3409j;

    /* renamed from: m */
    private int f3412m;

    /* renamed from: n */
    private float f3413n;

    /* renamed from: o */
    private float f3414o;

    /* renamed from: p */
    private byte f3415p;

    /* renamed from: q */
    private int f3416q;

    /* renamed from: r */
    private float f3417r;

    /* renamed from: s */
    private boolean f3418s;

    /* renamed from: Q */
    public AbstractC0210af f3419Q;

    /* renamed from: R */
    public int f3420R;

    /* renamed from: S */
    public float f3421S;

    /* renamed from: T */
    public int f3422T;

    /* renamed from: U */
    public AbstractC0515r f3423U;

    /* renamed from: V */
    public boolean f3424V;

    /* renamed from: W */
    public boolean f3425W;

    /* renamed from: X */
    public int f3426X;

    /* renamed from: Y */
    public short f3427Y;

    /* renamed from: Z */
    public float f3428Z;

    /* renamed from: ag */
    public boolean f3435ag;

    /* renamed from: t */
    private boolean f3442t;

    /* renamed from: v */
    private int f3444v;

    /* renamed from: ao */
    public boolean f3446ao;

    /* renamed from: ap */
    public float f3447ap;

    /* renamed from: aq */
    public float f3448aq;

    /* renamed from: ar */
    public AbstractC0138h f3449ar;

    /* renamed from: as */
    public C0139i f3450as;

    /* renamed from: at */
    public boolean f3451at;

    /* renamed from: x */
    private int f3455x;

    /* renamed from: z */
    private int f3457z;

    /* renamed from: B */
    private static int f3459B;

    /* renamed from: ay */
    public AbstractC0210af[] f3464ay;

    /* renamed from: az */
    public float[] f3465az;

    /* renamed from: aC */
    public boolean f3468aC;

    /* renamed from: bb */
    public C0835m f3493bb;

    /* renamed from: F */
    public static final C0270an[] f3395F = new C0270an[0];

    /* renamed from: ak */
    public static final C0523y[] f3439ak = new C0523y[0];

    /* renamed from: au */
    public static final C0760q f3452au = new C0760q();

    /* renamed from: av */
    public static final PointF f3453av = new PointF();

    /* renamed from: A */
    private static final Paint f3458A = new Paint();

    /* renamed from: C */
    private static final C0760q f3460C = m2283a(false);

    /* renamed from: dl */
    private static final C0760q f3461dl = m2283a(true);

    /* renamed from: aw */
    public static AbstractC0460j f3462aw = new C05161();

    /* renamed from: aB */
    public static final C0846u f3467aB = new C0846u();

    /* renamed from: aD */
    static final C0521w f3469aD = new C0521w();

    /* renamed from: aE */
    public static C0522x f3470aE = new C0522x(true);

    /* renamed from: aF */
    public static C0522x f3471aF = new C0522x(false);

    /* renamed from: aG */
    public static C0205aa f3472aG = new C0205aa(true);

    /* renamed from: aH */
    public static C0205aa f3473aH = new C0205aa(false);

    /* renamed from: aJ */
    public static final C0523y f3475aJ = new C0523y();

    /* renamed from: aK */
    protected static PorterDuffColorFilter f3476aK = new PorterDuffColorFilter(Color.m4333a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aL */
    protected static PorterDuffColorFilter f3477aL = new PorterDuffColorFilter(Color.m4333a(70, 255, 70), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aM */
    protected static PorterDuffColorFilter f3478aM = new PorterDuffColorFilter(Color.m4333a(255, 40, 40), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aN */
    protected static PorterDuffColorFilter f3479aN = new PorterDuffColorFilter(Color.m4333a(120, 120, 255), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aO */
    protected static Paint f3480aO = C0851y.m416b();

    /* renamed from: aP */
    protected static Paint f3481aP = C0851y.m416b();

    /* renamed from: aQ */
    protected static Paint f3482aQ = C0851y.m416b();

    /* renamed from: aR */
    static final PointF f3483aR = new PointF();

    /* renamed from: aS */
    protected static final C0814ag f3484aS = new C0814ag();

    /* renamed from: aT */
    protected static final PointF f3485aT = new PointF();

    /* renamed from: aU */
    protected static final PointF f3486aU = new PointF();

    /* renamed from: aV */
    protected static final PointF f3487aV = new PointF();

    /* renamed from: aW */
    static final Point f3488aW = new Point();

    /* renamed from: aX */
    static final Point f3489aX = new Point();

    /* renamed from: aY */
    static final PointF f3490aY = new PointF();

    /* renamed from: aZ */
    static final C0517s f3491aZ = new C0517s();

    /* renamed from: ba */
    public static final C0520v f3492ba = new C0520v();

    /* renamed from: f */
    private int f3394f = 0;

    /* renamed from: g */
    private C0270an[] f3396g = f3395F;

    /* renamed from: G */
    public EnumC0178a f3397G = EnumC0178a.f1316b;

    /* renamed from: H */
    int f3398H = -9999;

    /* renamed from: k */
    private float f3410k = 3.0f;

    /* renamed from: l */
    private float f3411l = 3.0f;

    /* renamed from: aa */
    public boolean f3429aa = false;

    /* renamed from: ab */
    public float f3430ab = 0.0f;

    /* renamed from: ac */
    public float f3431ac = 0.0f;

    /* renamed from: ad */
    public float f3432ad = 0.0f;

    /* renamed from: ae */
    public int f3433ae = 0;

    /* renamed from: af */
    public float f3434af = 0.0f;

    /* renamed from: ah */
    public float f3436ah = -999.0f;

    /* renamed from: ai */
    public boolean f3437ai = false;

    /* renamed from: aj */
    public boolean f3438aj = false;

    /* renamed from: al */
    protected C0523y[] f3440al = f3439ak;

    /* renamed from: am */
    protected int f3441am = 0;

    /* renamed from: u */
    private int f3443u = 0;

    /* renamed from: an */
    public boolean f3445an = true;

    /* renamed from: w */
    private C0760q f3454w = null;

    /* renamed from: y */
    private C0760q f3456y = null;

    /* renamed from: ax */
    public byte f3463ax = 0;

    /* renamed from: aA */
    public int f3466aA = -9999;

    /* renamed from: aI */
    C0733g f3474aI = null;

    /* renamed from: d */
    public abstract C0748e mo2371d();

    /* renamed from: k */
    public abstract C0748e mo2362k();

    /* renamed from: d */
    public abstract C0748e mo2370d(int i);

    /* renamed from: I */
    public abstract boolean mo2380I();

    /* renamed from: m */
    public abstract float mo2360m();

    /* renamed from: b */
    public abstract float mo2374b(int i);

    /* renamed from: A */
    public abstract float mo2388A();

    /* renamed from: c */
    public abstract float mo2373c(int i);

    /* renamed from: z */
    public abstract float mo2358z();

    /* renamed from: a */
    public abstract void mo2375a(AbstractC0210af afVar, int i);

    /* renamed from: a */
    static /* synthetic */ void m2293a(AbstractC0515r rVar, AbstractC0210af afVar, float f, boolean z) {
        rVar.m2303a(afVar, f, z);
    }

    static {
        f3452au.m4308a(128, 255, 255, 255);
        f3452au.m833n();
    }

    /* renamed from: b */
    public void m2229b(float f) {
        if (this.f3447ap < f) {
            this.f3447ap = f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f3390b);
        apVar.mo1096a(this.f3391c);
        apVar.mo1096a(this.f1462cn[0].f1565e);
        apVar.mo1095a(this.f3394f);
        int i = this.f3394f;
        apVar.mo1095a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3396g[i2].m3364a(apVar);
        }
        apVar.mo1138a(this.f3397G);
        AbstractC0210af afVar = this.f3399I;
        if (afVar != null && afVar.f1520bz) {
            afVar = null;
        }
        apVar.mo1094a(afVar);
        apVar.mo1096a(this.f3400J);
        apVar.mo1096a(this.f3402L);
        apVar.mo1096a(this.f3404M);
        apVar.mo1127d("pathing_active:");
        apVar.mo1090a(this.f3409j);
        apVar.mo1096a(this.f3410k);
        apVar.mo1096a(this.f3411l);
        apVar.mo1096a(this.f3417r);
        apVar.mo1144a(this.f3423U);
        apVar.mo1090a(this.f3424V);
        apVar.mo1090a(this.f3425W);
        apVar.mo1090a(this.f3429aa);
        apVar.mo1096a(this.f3430ab);
        apVar.mo1096a(this.f3431ac);
        apVar.mo1096a(this.f3432ad);
        apVar.mo1095a(this.f3433ae);
        apVar.mo1095a(this.f3422T);
        apVar.mo1127d("activePathCount:");
        apVar.mo1095a(this.f3441am);
        for (int i3 = 0; i3 < this.f3441am; i3++) {
            this.f3440al[i3].m2127a(apVar);
        }
        apVar.mo1095a(this.f3441am);
        apVar.mo1095a(this.f3443u);
        if (apVar.mo1124f()) {
        }
        apVar.mo1130c(11);
        apVar.mo1096a(this.f3413n);
        apVar.mo1096a(this.f3414o);
        apVar.mo1096a(this.f3392d);
        apVar.mo1096a(this.f3393e);
        apVar.mo1090a(this.f3442t);
        apVar.mo1096a(this.f3428Z);
        apVar.mo1095a(this.f3412m);
        apVar.mo1096a(this.f3405N);
        apVar.mo1096a(this.f3436ah);
        apVar.mo1090a(this.f3437ai);
        apVar.mo1090a(this.f3438aj);
        apVar.mo1091a(this.f3427Y);
        apVar.mo1096a(this.f3421S);
        apVar.mo1095a(this.f3444v);
        apVar.mo1096a(this.f3406O);
        apVar.mo1096a(this.f3447ap);
        apVar.mo1096a(this.f3448aq);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3390b = kVar.m1061g();
        this.f3391c = kVar.m1061g();
        this.f1462cn[0].f1565e = kVar.m1061g();
        this.f3394f = kVar.m1062f();
        if (this.f3394f > 0) {
            m2153m(C0654f.m1456c(this.f3394f - 1, 29));
        }
        int i = 30;
        if (kVar.m1071b() >= 42) {
            i = kVar.m1062f();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m2153m(i3);
            if (i3 >= this.f3396g.length) {
                AbstractC0789l.m682b("Too many waypoints:" + i2);
                i3 = this.f3396g.length - 1;
            }
            if (this.f3396g[i3] == null) {
                this.f3396g[i3] = new C0270an();
            }
            this.f3396g[i3].m3363a(kVar);
        }
        this.f3397G = (EnumC0178a) kVar.m1069b(EnumC0178a.class);
        if (this.f3397G == EnumC0178a.f1315a) {
            if (!mo2380I()) {
                this.f3397G = EnumC0178a.f1316b;
            }
            if (kVar.m1071b() < 74) {
                this.f3397G = EnumC0178a.f1316b;
            }
        }
        long m = kVar.m1055m();
        this.f3400J = kVar.m1061g();
        this.f3402L = kVar.m1061g();
        this.f3404M = kVar.m1061g();
        this.f3409j = kVar.m1063e();
        this.f3410k = kVar.m1061g();
        this.f3411l = kVar.m1061g();
        this.f3417r = kVar.m1061g();
        m2295a(kVar.m1053o());
        this.f3424V = kVar.m1063e();
        this.f3425W = kVar.m1063e();
        this.f3429aa = kVar.m1063e();
        this.f3430ab = kVar.m1061g();
        this.f3431ac = kVar.m1061g();
        this.f3432ad = kVar.m1061g();
        this.f3433ae = kVar.m1062f();
        if (kVar.m1071b() >= 18) {
            this.f3422T = kVar.m1062f();
        }
        if (kVar.m1071b() >= 21) {
            int f = kVar.m1062f();
            for (int i4 = 0; i4 < f; i4++) {
                m2157l(i4);
                if (this.f3440al[i4] == null) {
                    this.f3440al[i4] = new C0523y();
                }
                this.f3440al[i4].m2126a(kVar);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                m2157l(i5);
                if (this.f3440al[i5] == null) {
                    this.f3440al[i5] = new C0523y();
                }
                this.f3440al[i5].m2126a(kVar);
            }
        }
        this.f3441am = kVar.m1062f();
        this.f3443u = kVar.m1062f();
        byte d = kVar.m1065d();
        if (d >= 1) {
            this.f3413n = kVar.m1061g();
            this.f3414o = kVar.m1061g();
        }
        if (d >= 2) {
            this.f3392d = kVar.m1061g();
            this.f3393e = kVar.m1061g();
        }
        if (d >= 3) {
            this.f3442t = kVar.m1063e();
        }
        if (d >= 4) {
            this.f3428Z = kVar.m1061g();
            this.f3412m = kVar.m1062f();
        }
        if (d >= 5) {
            this.f3405N = kVar.m1061g();
        }
        if (d >= 6) {
            this.f3436ah = kVar.m1061g();
            this.f3437ai = kVar.m1063e();
            this.f3438aj = kVar.m1063e();
        }
        if (d >= 7) {
            this.f3427Y = kVar.m1048t();
        }
        if (d >= 8) {
            this.f3421S = kVar.m1061g();
        }
        if (d >= 9) {
            this.f3444v = kVar.m1062f();
        }
        if (d >= 10) {
            this.f3406O = kVar.m1061g();
        }
        if (d >= 11) {
            this.f3447ap = kVar.m1061g();
            this.f3448aq = kVar.m1061g();
        }
        super.mo399a(kVar);
        if (!this.f1520bz) {
            this.f3399I = AbstractC0854w.m401a(m, false);
            for (int i6 = 0; i6 < this.f3394f; i6++) {
                if (this.f3396g[i6] == null) {
                    AbstractC0789l.m670d("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f3394f);
                } else {
                    this.f3396g[i6].m3358c();
                }
            }
        }
        mo2635Q();
        if (this.f1520bz) {
            this.f3756dP = true;
        }
    }

    /* renamed from: a */
    public void mo3449a(AbstractC0171m mVar) {
        super.mo3449a(mVar);
        mo2635Q();
    }

    /* renamed from: Q */
    public void mo2635Q() {
        this.f3387D = mo2371d();
        this.f3388E = mo2362k();
    }

    /* renamed from: h */
    public float mo2885h(int i) {
        return 0.0f;
    }

    /* renamed from: i */
    public float mo2883i(int i) {
        return 0.0f;
    }

    /* renamed from: R */
    public C0748e mo2572R() {
        return null;
    }

    /* renamed from: a */
    public Paint m2310a(int i, ColorFilter colorFilter, boolean z) {
        int i2;
        C0760q qVar;
        if (i != -1 || colorFilter != null) {
            if (this.f1531bT) {
                if (colorFilter == null) {
                    qVar = f3458A;
                    i2 = f3459B;
                    f3459B = i;
                } else {
                    qVar = f3458A;
                    i2 = -1;
                    if (colorFilter == f3478aM) {
                        qVar = f3481aP;
                    }
                    if (colorFilter == f3477aL) {
                        qVar = f3480aO;
                    }
                    if (colorFilter == f3479aN) {
                        qVar = f3482aQ;
                    }
                }
            } else if (z) {
                if (this.f3456y == null) {
                    this.f3456y = m2283a(true);
                }
                qVar = this.f3456y;
                i2 = this.f3457z;
                this.f3457z = i;
            } else {
                if (this.f3454w == null) {
                    this.f3454w = m2283a(false);
                }
                qVar = this.f3454w;
                i2 = this.f3455x;
                this.f3455x = i;
            }
            if (i2 != i) {
                qVar.m4288b(i);
            }
            if (qVar.m4271h() != colorFilter) {
                qVar.m4306a(colorFilter);
            }
            return qVar;
        } else if (z) {
            return f3461dl;
        } else {
            return f3460C;
        }
    }

    /* renamed from: a */
    public static C0760q m2283a(boolean z) {
        C0760q qVar = new C0760q();
        if (z) {
            qVar.m4292a(true);
            qVar.m4277d(true);
            qVar.m4285b(true);
        } else {
            qVar.m4292a(false);
            qVar.m4277d(false);
            qVar.m4285b(false);
        }
        return qVar;
    }

    public AbstractC0515r(boolean z) {
        super(z);
    }

    /* renamed from: j */
    public final void m2164j(int i) {
        int bg = mo2436bg();
        for (int i2 = 0; i2 < bg; i2++) {
            this.f1462cn[i2].m3397a(i);
        }
    }

    /* renamed from: a */
    public void m2285a(String str) {
        AbstractC0789l.m670d("(Unit log:" + mo1608r().mo2815i() + " id:" + this.f5835dA + "): " + str);
    }

    /* renamed from: S */
    public void mo2990S() {
        AbstractC0789l.m670d("---- Debug for:" + mo1608r().mo2815i() + " id:" + this.f5835dA + "---");
    }

    /* renamed from: a */
    public void mo404a(float f) {
        float f2;
        float f3;
        float f4;
        super.mo404a(f);
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f3446ao) {
            this.f3446ao = false;
        }
        if (this.f1449bQ != 0.0f) {
            this.f1449bQ = C0654f.m1524a(this.f1449bQ, f);
        }
        if (!this.f1520bz && m3435bG()) {
            if (this.f3447ap > 0.0f) {
                this.f3447ap = C0654f.m1524a(this.f3447ap, f);
            }
            if (this.f3448aq > 0.0f) {
                this.f3448aq = C0654f.m1524a(this.f3448aq, f);
            }
            if (this.f3493bb != null) {
                C0463b.m2483a(this, f);
            }
            float f5 = this.f5841dH;
            float f6 = this.f5842dI;
            int bg = mo2436bg();
            for (int i = 0; i < bg; i++) {
                C0213ai aiVar = this.f1462cn[i];
                if (aiVar.f1564d == 0.0f) {
                    float C = mo2447C(i);
                    if (mo2617b(i, f) && aiVar.f1561a != C) {
                        if (C0654f.m1461c(C0654f.m1459c(aiVar.f1561a, C, 360.0f)) < 0.5f) {
                            aiVar.f1564d = 20.0f;
                            aiVar.f1563c = 0.0f;
                        } else {
                            m2324a(f, C, i);
                        }
                    }
                } else {
                    aiVar.f1564d = C0654f.m1524a(aiVar.f1564d, f);
                }
            }
            if (!m2209bf()) {
                m2161k(f);
            }
            for (int i2 = 0; i2 < bg; i2++) {
                C0213ai aiVar2 = this.f1462cn[i2];
                if (aiVar2.f1565e != 0.0f) {
                    aiVar2.f1565e = C0654f.m1524a(aiVar2.f1565e, f);
                }
            }
            boolean bd = mo2556bd();
            boolean z = (this.f1525bH == 0.0f && this.f1526bI == 0.0f) ? false : true;
            if ((this.f1528bK != 0.0f || z) && mo2380I()) {
                float f7 = this.f1444bL;
                float z2 = mo2358z();
                if (mo2555be()) {
                    f7 = this.f1445bM;
                }
                if (!bd) {
                    float f8 = z2 * this.f1528bK * f;
                    f5 += C0654f.m1423i(f7) * f8;
                    f6 += C0654f.m1427h(f7) * f8 * mo2957aU();
                    if (z) {
                        f5 += this.f1525bH * f;
                        f6 += this.f1526bI * f * mo2957aU();
                        if (C0654f.m1522a(0.0f, 0.0f, this.f1525bH, this.f1526bI) > z2 * z2) {
                            this.f1525bH = (float) (this.f1525bH - ((this.f1525bH * 0.05d) * f));
                            this.f1526bI = (float) (this.f1526bI - ((this.f1526bI * 0.05d) * f));
                        }
                        this.f1525bH = C0654f.m1523a(this.f1525bH, 0.0f, 0.5f * z2 * f);
                        this.f1526bI = C0654f.m1523a(this.f1526bI, 0.0f, 0.5f * z2 * f);
                    }
                } else {
                    if (this.f1528bK != 0.0f) {
                        f4 = mo2386C() * 1.41f;
                        f3 = C0654f.m1423i(f7) * z2 * this.f1528bK;
                        f2 = C0654f.m1427h(f7) * z2 * this.f1528bK;
                    } else {
                        f4 = mo2385D() * 1.41f;
                        f3 = 0.0f;
                        f2 = 0.0f;
                    }
                    float a = C0654f.m1522a(this.f1525bH, this.f1526bI, f3, f2);
                    if (a > z2 * z2) {
                        this.f1525bH = (float) (this.f1525bH - ((this.f1525bH * 0.05d) * f));
                        this.f1526bI = (float) (this.f1526bI - ((this.f1526bI * 0.05d) * f));
                    }
                    float f9 = f4 * f;
                    if (a < f9 * f9) {
                        this.f1525bH = f3;
                        this.f1526bI = f2;
                    } else {
                        float d = C0654f.m1448d(this.f1525bH, this.f1526bI, f3, f2);
                        this.f1525bH += C0654f.m1423i(d) * f9;
                        this.f1526bI += C0654f.m1427h(d) * f9;
                    }
                    f5 += this.f1525bH * f;
                    f6 += this.f1526bI * f * mo2957aU();
                }
                this.f3446ao = true;
            }
            if (!(this.f1522bD == 0.0f && this.f1523bE == 0.0f)) {
                this.f1522bD = C0654f.m1477b(this.f1522bD, -9.0f, 9.0f);
                this.f1523bE = C0654f.m1477b(this.f1523bE, -9.0f, 9.0f);
                f5 += this.f1522bD;
                f6 += this.f1523bE;
                this.f1523bE = 0.0f;
                this.f1522bD = 0.0f;
                this.f3446ao = true;
            }
            if (this.f3446ao && mo2380I() && this.f1540cq == null) {
                m2314a(f, u, f5, f6);
            }
            if (this.f3445an) {
                this.f3445an = false;
                mo2926c(false);
                this.f3446ao = true;
            }
        }
    }

    /* renamed from: a */
    private void m2314a(float f, AbstractC0789l lVar, float f2, float f3) {
        C0148b bVar = lVar.f5474bt;
        float f4 = bVar.f731o;
        float f5 = bVar.f732p;
        float f6 = this.f5841dH * f4;
        float f7 = this.f5842dI * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int e = C0654f.m1443e(f6);
        int e2 = C0654f.m1443e(f7);
        int e3 = C0654f.m1443e(f8);
        int e4 = C0654f.m1443e(f9);
        if (!(e == e3 && e2 == e4) && this.f1449bQ == 0.0f && lVar.f5483bC.m958a(mo2364h(), e3, e4)) {
            if (!(e == e3 || e2 == e4)) {
                boolean a = lVar.f5483bC.m958a(mo2364h(), e, e4);
                boolean a2 = lVar.f5483bC.m958a(mo2364h(), e3, e2);
                if (a && a2) {
                    z = true;
                    f3453av.m4260a(f6, f7);
                    pointF = f3453av;
                }
                if (pointF == null && a) {
                    pointF = C0214aj.m3393a(mo2364h(), f6, f7, f8, f9, e, e4, false);
                }
                if (pointF == null && a2) {
                    pointF = C0214aj.m3393a(mo2364h(), f6, f7, f8, f9, e3, e2, false);
                }
            }
            if (pointF == null) {
                pointF = C0214aj.m3393a(mo2364h(), f6, f7, f8, f9, e3, e4, false);
            }
            if (pointF == null) {
                z = true;
                f3453av.m4260a(f6, f7);
                pointF = f3453av;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (lVar.f5483bC.m958a(mo2364h(), e, e2) && !lVar.f5483bC.m945b(mo2364h(), e3, e4)) {
                z3 = true;
            }
            if (!z3) {
                f2 = pointF.f224a * bVar.f727k;
                f3 = pointF.f225b * bVar.f728l;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2) {
            this.f3390b += f;
            this.f3389a = 0;
        } else if (this.f3390b != 0.0f && f > 0.0f) {
            this.f3389a++;
            if (this.f3389a >= 3) {
                this.f3390b = 0.0f;
            }
        }
        if (!z) {
            int e5 = C0654f.m1443e(f2 * f4);
            int e6 = C0654f.m1443e(f3 * f5);
            this.f5841dH = f2;
            this.f5842dI = f3;
            if (e != e5 || e2 != e6) {
                mo2926c(true);
            }
        }
    }

    /* renamed from: b */
    public void m2228b(float f, float f2) {
        C0148b bVar = AbstractC0789l.m638u().f5474bt;
        float f3 = bVar.f731o;
        float f4 = bVar.f732p;
        int e = C0654f.m1443e(this.f5841dH * f3);
        int e2 = C0654f.m1443e(this.f5842dI * f4);
        int e3 = C0654f.m1443e(f * f3);
        int e4 = C0654f.m1443e(f2 * f4);
        this.f5841dH = f;
        this.f5842dI = f2;
        if (e != e3 || e2 != e4) {
            mo2926c(true);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.r$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/r$1.class */
    final class C05161 extends AbstractC0460j {
        C05161() {
        }

        public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
            AbstractC0515r.m2293a(rVar, afVar, f, true);
        }
    }

    /* renamed from: g */
    public static void m2178g(float f) {
        float f2;
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        u.f5492bL.m1918a(EnumC0588bk.f4056j);
        for (int i = 0; i < size; i++) {
            if (a[i] instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) a[i];
                rVar.f1443bF = false;
                if ((rVar.f3446ao || rVar.f1524bG) && rVar.mo2380I() && rVar.f3466aA <= u.f5467bh) {
                    rVar.f1524bG = false;
                    rVar.f3446ao = true;
                    if (rVar.f1538cm) {
                        f2 = rVar.f1447bO + 7.0f;
                        if (rVar.f3463ax > 9) {
                            rVar.f3466aA = u.f5467bh + 200 + (i % 50);
                        } else {
                            rVar.f3466aA = u.f5467bh + 50 + (i % 50);
                        }
                    } else {
                        f2 = rVar.f1447bO + 5.0f;
                        rVar.f3466aA = u.f5467bh + 250 + (i % 50);
                    }
                    rVar.f3463ax = (byte) 0;
                    f3467aB.clear();
                    u.f5491bK.m2494b(rVar.f5841dH, rVar.f5842dI, f2, f3467aB);
                    AbstractC0210af[] a2 = f3467aB.m456a();
                    int i2 = f3467aB.f5806b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        rVar.m2303a(a2[i3], f, true);
                    }
                    if (rVar.f3463ax > 9 && rVar.f1436bf > u.f5467bh - 400) {
                        rVar.f3466aA = u.f5467bh + 5 + (i % 5);
                        rVar.f1524bG = true;
                    }
                }
            }
        }
        u.f5492bL.m1913b(EnumC0588bk.f4056j);
        u.f5492bL.m1918a(EnumC0588bk.f4057k);
        for (int i4 = 0; i4 < size; i4++) {
            if (a[i4] instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) a[i4];
                if (rVar2.f3446ao && rVar2.f3463ax > 0 && rVar2.mo2380I()) {
                    rVar2.f1443bF = true;
                    rVar2.f1524bG = true;
                    if (rVar2.f3466aA >= u.f5467bh) {
                        for (int i5 = 0; i5 < rVar2.f3463ax; i5++) {
                            if (i5 < rVar2.f3464ay.length) {
                                AbstractC0210af afVar = rVar2.f3464ay[i5];
                                if (0 == 0) {
                                    rVar2.m2303a(afVar, f, false);
                                }
                            }
                        }
                    }
                }
            }
        }
        u.f5492bL.m1913b(EnumC0588bk.f4057k);
    }

    /* renamed from: a */
    private void m2303a(AbstractC0210af afVar, float f, boolean z) {
        C0270an ap;
        C0270an ap2;
        if (afVar != this && afVar.f1519by && this.f1519by && mo2363i() == afVar.mo2363i() && mo2377P() == afVar.mo2377P() && afVar.f1539cp == null && this.f1539cp == null && this.f1518bv != afVar && afVar.f1518bv != this) {
            float f2 = this.f5841dH + this.f1522bD;
            float f3 = this.f5842dI + this.f1523bE;
            float f4 = afVar.f5841dH + afVar.f1522bD;
            float f5 = afVar.f5842dI + afVar.f1523bE;
            float a = C0654f.m1522a(f2, f3, f4, f5);
            float f6 = this.f1447bO + afVar.f1447bO;
            if (z) {
                float f7 = a;
                if (a < f6 * f6) {
                    f7 = 0.0f;
                }
                if (afVar instanceof AbstractC0515r) {
                    for (int i = 0; i < ((AbstractC0515r) afVar).f3463ax; i++) {
                        if (((AbstractC0515r) afVar).f3464ay[i] == this) {
                            return;
                        }
                    }
                }
                if (this.f3464ay == null) {
                    this.f3464ay = new AbstractC0210af[10];
                    this.f3465az = new float[10];
                }
                byte b = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f3463ax) {
                        break;
                    } else if (f7 < this.f3465az[i2]) {
                        b = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (b == -1) {
                    if (this.f3463ax < this.f3464ay.length) {
                        b = this.f3463ax;
                    } else {
                        return;
                    }
                }
                if (this.f3463ax < this.f3464ay.length) {
                    this.f3463ax = (byte) (this.f3463ax + 1);
                }
                for (int i3 = this.f3463ax - 1; i3 > b; i3--) {
                    this.f3464ay[i3] = this.f3464ay[i3 - 1];
                }
                this.f3464ay[b] = afVar;
                this.f3465az[b] = f7;
            } else if (a < f6 * f6 && !afVar.mo3448a(this, f) && !mo3448a(afVar, f)) {
                float d = C0654f.m1448d(f2, f3, f4, f5);
                float sqrt = (f6 - ((float) Math.sqrt(a))) + 0.001f;
                if (sqrt > 0.0f) {
                    int q = mo2876q(afVar);
                    int q2 = afVar.mo2876q(this);
                    int i4 = q > q2 ? q : q2;
                    if (i4 != 0) {
                        float f8 = (sqrt / i4) * f;
                        if (f8 > sqrt) {
                            f8 = sqrt;
                        }
                        sqrt = f8;
                    }
                    float f9 = sqrt * 0.95f;
                    if (f9 > 1.0f) {
                        f9 *= 0.7f;
                    }
                    if (f9 > 3.0f) {
                        f9 = 3.0f + ((f9 - 3.0f) * 0.7f);
                    }
                    if (f9 > 6.0f) {
                        f9 = 6.0f + ((f9 - 6.0f) * 0.7f);
                    }
                    if (f9 > 10.0f) {
                        f9 = 10.0f + ((f9 - 10.0f) * 0.7f);
                    }
                    float f10 = 0.0f;
                    float bB = mo2427bB();
                    float bB2 = afVar.mo2427bB();
                    if (this.f1441bB == afVar.f1441bB) {
                        boolean z2 = false;
                        float f11 = 1.7f;
                        if (afVar instanceof AbstractC0515r) {
                            AbstractC0515r rVar = (AbstractC0515r) afVar;
                            if (this.f3405N > 200.0f || rVar.f3405N > 200.0f) {
                                f11 = 5.0f;
                            }
                            if (this.f3423U == rVar) {
                                bB2 *= f11;
                                z2 = true;
                            }
                            if (rVar.f3423U == this) {
                                bB *= f11;
                                z2 = true;
                            }
                            if (!z2) {
                                if (this.f3424V && rVar.f3423U != null) {
                                    bB *= f11;
                                } else if (rVar.f3424V && this.f3423U != null) {
                                    bB2 *= f11;
                                } else if (this.f3391c == 0.0f && rVar.f3391c != 0.0f) {
                                    bB *= f11;
                                } else if (rVar.f3391c == 0.0f && this.f3391c != 0.0f) {
                                    bB2 *= f11;
                                }
                            }
                        }
                    }
                    if (afVar instanceof AbstractC0513p) {
                        f10 = bB / (bB + bB2);
                    }
                    float f12 = 1.0f - f10;
                    float i5 = C0654f.m1423i(d);
                    float h = C0654f.m1427h(d);
                    if (afVar instanceof AbstractC0513p) {
                        float f13 = f9 * f10;
                        afVar.f1522bD += i5 * f13;
                        afVar.f1523bE += h * f13;
                    }
                    float f14 = f9 * f12;
                    this.f1522bD -= i5 * f14;
                    this.f1523bE -= h * f14;
                    AbstractC0789l u = AbstractC0789l.m638u();
                    this.f3419Q = afVar;
                    this.f3420R = u.f5585bg;
                    if (afVar instanceof AbstractC0515r) {
                        AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                        rVar2.f3419Q = this;
                        rVar2.f3420R = u.f5585bg;
                    }
                    if (afVar instanceof AbstractC0515r) {
                        AbstractC0515r rVar3 = (AbstractC0515r) afVar;
                        if (this.f3422T != 0 && this.f3422T == rVar3.f3422T) {
                            if (m2240ap() == null && (ap2 = rVar3.m2240ap()) != null && (ap2.f1645a == EnumC0271ao.f1659a || ap2.f1645a == EnumC0271ao.f1666h)) {
                                rVar3.m2233aw();
                            }
                            if (rVar3.m2240ap() == null && (ap = rVar3.m2240ap()) != null) {
                                if (ap.f1645a == EnumC0271ao.f1659a || ap.f1645a == EnumC0271ao.f1666h) {
                                    m2233aw();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: T */
    public int mo2607T() {
        return 1;
    }

    /* renamed from: a */
    public void mo2512a(int i) {
    }

    /* renamed from: U */
    protected void m2331U() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1441bB == u.f5464bb) {
            u.f5481bA.f4281f.m1583b(this);
        }
    }

    /* renamed from: b */
    public float m2227b(float f, float f2, float f3) {
        if (mo2384E()) {
            if (mo2700bw()) {
                return 0.0f;
            }
            return m2195c(f, C0654f.m1448d(this.f5841dH, this.f5842dI, f2, f3));
        } else if (mo2436bg() < 1) {
            return 0.0f;
        } else {
            int aP = mo2960aP();
            if (aP == -1) {
                aP = 0;
            }
            PointF F = mo2441F(aP);
            float d = C0654f.m1448d(F.f224a, F.f225b, f2, f3);
            this.f1462cn[aP].m3397a(70);
            return m2324a(f, d, aP);
        }
    }

    /* renamed from: c */
    public float m2195c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.f1446bN && m2260aW()) {
            z = true;
            z2 = true;
        }
        return m2321a(f, f2, z, z2);
    }

    /* renamed from: h */
    public void mo3405h(float f) {
        float c = C0654f.m1459c(this.f1444bL, f, 360.0f);
        if (C0654f.m1461c(c) > 0.01d) {
            mo2552i(c);
        }
    }

    /* renamed from: a */
    public float m2321a(float f, float f2, boolean z, boolean z2) {
        this.f1445bM = f2;
        if (C0654f.m1461c(this.f1444bL - f2) >= 0.01f) {
            float c = C0654f.m1459c(this.f1444bL, f2, 360.0f);
            if (z) {
                if (z2 && C0654f.m1461c(c) > 100.0f) {
                    c = C0654f.m1459c(this.f1444bL, f2 + 180.0f, 360.0f);
                    if (!this.f1446bN) {
                        m2164j(25);
                        this.f1446bN = true;
                    }
                } else if (this.f1446bN) {
                    m2164j(25);
                    this.f1446bN = false;
                }
            }
            if (C0654f.m1461c(c) < 0.01f) {
                return 0.0f;
            }
            if (this.f3447ap <= 0.0f) {
                float B = mo2387B();
                if (B <= 0.0f) {
                    float A = (c > 0.0f ? 1.0f : -1.0f) * mo2388A() * f;
                    if (C0654f.m1461c(A) > C0654f.m1461c(c)) {
                        A = c;
                    }
                    mo2552i(A);
                } else {
                    float f3 = c > 0.0f ? 1.0f : -1.0f;
                    if (C0654f.m1461c(c) < C0654f.m1461c(this.f1527bJ) / B) {
                        this.f1527bJ = C0654f.m1523a(this.f1527bJ, f3 * B, B * f);
                    } else {
                        this.f1527bJ = C0654f.m1523a(this.f1527bJ, f3 * mo2388A(), B * f);
                    }
                    float f4 = this.f1527bJ * f;
                    if (C0654f.m1461c(f4) > C0654f.m1461c(c)) {
                        this.f1527bJ = 0.0f;
                        f4 = c;
                    }
                    mo2552i(f4);
                }
            }
            return c;
        } else if (!z || !this.f1446bN) {
            return 0.0f;
        } else {
            m2164j(25);
            this.f1446bN = false;
            return 0.0f;
        }
    }

    /* renamed from: i */
    public void mo2552i(float f) {
        this.f1444bL += f;
        if (this.f1444bL > 180.0f) {
            this.f1444bL -= 360.0f;
        }
        if (this.f1444bL < -180.0f) {
            this.f1444bL += 360.0f;
        }
        if (mo2930bh()) {
            int bg = mo2436bg();
            for (int i = 0; i < bg; i++) {
                C0213ai aiVar = this.f1462cn[i];
                aiVar.f1561a += f;
                if (aiVar.f1561a > 180.0f) {
                    aiVar.f1561a -= 360.0f;
                }
                if (aiVar.f1561a < -180.0f) {
                    aiVar.f1561a += 360.0f;
                }
            }
        }
    }

    /* renamed from: j */
    public void m2165j(float f) {
        int bg = mo2436bg();
        for (int i = 0; i < bg; i++) {
            this.f1462cn[i].f1561a = f + mo2997B(i);
        }
    }

    /* renamed from: a */
    public void mo2988a(int i, float f) {
        this.f1462cn[i].f1561a += f;
    }

    /* renamed from: a */
    public float m2324a(float f, float f2, int i) {
        float f3;
        C0213ai aiVar = this.f1462cn[i];
        float c = C0654f.m1459c(aiVar.f1561a, f2, 360.0f);
        if (c == 0.0f) {
            return c;
        }
        float w = mo2411w(i);
        if (w <= 0.0f) {
            float c2 = C0654f.m1459c(aiVar.f1561a, f2, mo2373c(i) * f);
            mo2988a(i, c2);
            f3 = c - c2;
        } else {
            float y = mo2868y(i);
            float f4 = c > 0.0f ? 1.0f : -1.0f;
            float c3 = C0654f.m1461c(aiVar.f1563c) / y;
            boolean z = ((c > 0.0f ? 1 : (c == 0.0f ? 0 : -1)) > 0) == ((aiVar.f1563c > 0.0f ? 1 : (aiVar.f1563c == 0.0f ? 0 : -1)) > 0);
            if (C0654f.m1461c(c) >= c3 || !z) {
                aiVar.f1563c = C0654f.m1523a(aiVar.f1563c, f4 * mo2373c(i), w * f);
            } else {
                aiVar.f1563c = C0654f.m1523a(aiVar.f1563c, f4 * y, y * f);
            }
            float f5 = aiVar.f1563c * f;
            if (C0654f.m1461c(f5) > C0654f.m1461c(c)) {
                aiVar.f1563c = 0.0f;
                f5 = c;
            }
            mo2988a(i, f5);
            f3 = c - f5;
        }
        return f3;
    }

    /* renamed from: V */
    public AbstractC0210af m2330V() {
        C0270an ap;
        if (!this.f3403h || (ap = m2240ap()) == null) {
            return null;
        }
        if ((ap.f1645a == EnumC0271ao.f1662d || ap.f1645a == EnumC0271ao.f1665g) && ap.f1649h != null && !ap.f1649h.f1520bz) {
            return ap.f1649h;
        }
        return null;
    }

    /* renamed from: W */
    public boolean m2329W() {
        C0270an ap = m2240ap();
        if (ap == null || ap.f1645a != EnumC0271ao.f1665g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m2318a(float f, C0270an anVar, C0521w wVar) {
        if (anVar.f1647c == null) {
            m2233aw();
            anVar = null;
        }
        if (anVar != null) {
            if (anVar.f1645a == EnumC0271ao.f1674p) {
            }
            if (1 != 0) {
                AbstractC0197s a = mo2985a(anVar.f1647c);
                mo2990S();
                if (a == null) {
                    m2285a("Failed to find action:" + anVar.f1647c.m3530a());
                } else {
                    mo2469a(a, false, new PointF(anVar.f1654e, anVar.f1655f), anVar.f1649h);
                }
                m2233aw();
            }
        }
    }

    /* renamed from: b */
    private void m2226b(float f, C0270an anVar, C0521w wVar) {
        AbstractC0210af i = anVar.m3344i();
        if (i != null) {
            this.f3399I = i;
            if (this.f3401K > 5.0f) {
                this.f3401K = 5.0f;
            }
        }
        m2233aw();
    }

    /* renamed from: c */
    private void m2194c(float f, C0270an anVar, C0521w wVar) {
        float f2;
        AbstractC0210af V;
        C0270an am;
        C0270an am2;
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        boolean z = anVar.f1645a == EnumC0271ao.f1669k || anVar.f1645a == EnumC0271ao.f1672n;
        boolean z2 = anVar.f1645a == EnumC0271ao.f1669k;
        AbstractC0210af afVar = anVar.f1649h;
        if (z && (afVar == null || afVar.f1520bz)) {
            m2233aw();
            anVar = null;
        }
        if (anVar != null) {
            boolean z3 = false;
            float f3 = this.f1447bO;
            if (z) {
                f3 += afVar.f1447bO;
            }
            if (anVar.f1645a == EnumC0271ao.f1672n) {
                if (this.f1538cm) {
                    f2 = f3 + 30.0f;
                } else {
                    f2 = f3 + 50.0f;
                }
            } else if (this.f1538cm) {
                f2 = f3 + 80.0f;
            } else {
                f2 = f3 + 100.0f;
            }
            if (a > f2 * f2) {
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                this.f3412m = 2;
                if (this.f3417r > 90.0f) {
                    this.f3417r = 90.0f;
                }
                this.f3416q = 18;
                if (this.f3423U != null && !this.f3423U.m3435bG()) {
                    wVar.f3520c = false;
                }
            } else {
                this.f3444v = 0;
            }
            wVar.f3520c = false;
            if (0 == 0 && this.f3399I != null && !this.f3399I.f1520bz) {
                boolean z4 = false;
                if (m2221b(this.f3399I, false)) {
                    z4 = true;
                }
                if (z4) {
                    float a2 = C0654f.m1522a(this.f5841dH, this.f5842dI, this.f3399I.f5841dH, this.f3399I.f5842dI);
                    float l = m2156l(this.f3399I);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (a2 < l * l) {
                        z6 = true;
                    }
                    if (z6 && !m2327Y()) {
                        z6 = false;
                    }
                    if (a < 22500.0f) {
                        this.f3444v = 0;
                    }
                    if (!z6 && (this.f3444v == 1 || a > 122500.0f)) {
                        z5 = true;
                        this.f3444v = 1;
                    }
                    if (a > 302500.0f || (this.f3444v == 1 && a > 202500.0f)) {
                        z5 = true;
                        this.f3444v = 1;
                    }
                    if (!z5) {
                        z3 = true;
                        this.f3444v = 0;
                        if (z6) {
                            this.f3409j = false;
                        } else {
                            if (this.f3417r > 90.0f) {
                                this.f3417r = 90.0f;
                            }
                            this.f3409j = true;
                            this.f3410k = this.f3399I.f5841dH;
                            this.f3411l = this.f3399I.f5842dI;
                            this.f3412m = 0;
                            this.f3408i = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                AbstractC0210af p = afVar.m3403p(2.0f);
                if (p != null && !m2221b(p, true)) {
                    p = null;
                }
                if (p == null && this.f3444v != 1) {
                    p = m3403p(2.0f);
                    if (p != null && !m2221b(p, true)) {
                        p = null;
                    }
                }
                if (p != null) {
                    z3 = true;
                    if (this.f3417r > 90.0f) {
                        this.f3417r = 90.0f;
                    }
                    this.f3409j = true;
                    this.f3410k = p.f5841dH;
                    this.f3411l = p.f5842dI;
                    this.f3412m = 0;
                    this.f3408i = true;
                }
            }
            if (z2 && !z3 && mo2439a(afVar) && ((afVar.f1450bY < afVar.f1451bZ || afVar.f1529bR < 1.0f) && mo2439a(afVar) && (am2 = m2243am()) != null)) {
                am2.m3360b(afVar);
                am2.f1652m = true;
                z3 = true;
                if (this.f3417r > 20.0f) {
                    this.f3417r = 20.0f;
                }
            }
            if (z2 && !z3 && mo2951ai() && (afVar instanceof AbstractC0515r) && (V = ((AbstractC0515r) afVar).m2330V()) != null && mo2439a(V) && (am = m2243am()) != null) {
                am.m3360b(V);
                am.f1652m = true;
                if (this.f3417r > 20.0f) {
                    this.f3417r = 20.0f;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2188d(float f, C0270an anVar, C0521w wVar) {
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        if (anVar.f1649h == null || anVar.f1649h.f1520bz) {
            m2233aw();
            anVar = null;
        }
        if (anVar != null) {
            boolean z = false;
            if (anVar.f1649h.mo2700bw()) {
                if (a < 961.0f) {
                    this.f3407P += f;
                }
                if (this.f3407P > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (anVar.f1649h.mo2702bO().m4257a()) {
                    f2 = 11.0f;
                }
                if (this.f3390b > 0.0f) {
                    f2 = anVar.f1649h.f1447bO + this.f1447bO + 31.0f;
                }
                if (a < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = anVar.f1649h.f1447bO + this.f1447bO + 5.0f;
                if (a < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                this.f3412m = 0;
                if (anVar.f1649h.mo2700bw()) {
                    Rect bO = anVar.f1649h.mo2702bO();
                    this.f3412m = C0654f.m1456c(bO.m4249c() / 2, bO.m4253b() / 2) + 1;
                }
                if (this.f3417r > 90.0f) {
                    this.f3417r = 90.0f;
                }
                this.f3416q = 18;
                if (a < 48400.0f) {
                    wVar.f3520c = false;
                    if (this.f3417r > 0.0f && m2280aC() == null) {
                        this.f3408i = true;
                    }
                }
                if (this.f3423U != null && !this.f3423U.m3435bG()) {
                    wVar.f3520c = false;
                }
            }
            if (z) {
                AbstractC0210af afVar = anVar.f1649h;
                mo2976a(EnumC0306ab.f1978i);
                m2233aw();
            }
        }
    }

    /* renamed from: e */
    private void m2184e(float f, C0270an anVar, C0521w wVar) {
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        if (anVar.f1649h == null || anVar.f1649h.f1520bz || !anVar.f1649h.m3435bG()) {
            m2233aw();
            anVar = null;
        }
        if (anVar != null && !mo2538d(anVar.f1649h, false)) {
            m2233aw();
        }
        if (anVar != null) {
            this.f1518bv = anVar.f1649h;
            if (a > 441.0f) {
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                if (this.f3417r > 90.0f) {
                    this.f3417r = 90.0f;
                }
                this.f3416q = 18;
                if (a < 72900.0f) {
                    wVar.f3520c = false;
                    if (this.f3417r > 0.0f && this.f3474aI == null) {
                        this.f3408i = true;
                    }
                }
                if (this.f3423U != null && !this.f3423U.m3435bG()) {
                    wVar.f3520c = false;
                    return;
                }
                return;
            }
            mo2536e(anVar.f1649h, false);
            m2233aw();
        }
    }

    /* renamed from: a */
    private void m2317a(float f, C0270an anVar, C0521w wVar, boolean z) {
        C0270an a;
        AbstractC0210af p;
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a2 = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!mo2962aN()) {
            boolean z2 = false;
            C0336i cV = m3419cV();
            if (cV != null && cV.f2279H) {
                m2196bs();
                z2 = true;
            }
            if (!z2) {
                m2234av();
                anVar = null;
            }
        }
        float f2 = 7.0f;
        if (a2 < 1681.0f) {
            this.f3407P += f;
        }
        if (this.f3407P > 240.0f) {
            f2 = 16.0f;
        }
        if (this.f3407P > 340.0f) {
            f2 = 36.0f;
        }
        if (anVar != null && anVar.f1645a == EnumC0271ao.f1668j) {
            if (m2236at() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.f3420R == u.f5585bg || this.f3420R == u.f5585bg - 1) {
                    f3 = 70.0f;
                }
                if (a2 < f3 * f3) {
                    m2192c(anVar);
                    m2234av();
                    anVar = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.f3420R == u.f5585bg || this.f3420R == u.f5585bg - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (anVar != null) {
            if (a2 >= f2 * f2) {
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                this.f3412m = 0;
                if (anVar.f1645a == EnumC0271ao.f1668j) {
                    this.f3418s = true;
                    m2230az();
                }
            } else if (anVar.f1645a == EnumC0271ao.f1668j) {
                if (m2236at() == 1) {
                }
            } else if (anVar.f1645a == EnumC0271ao.f1666h) {
                boolean z3 = false;
                if (this.f3399I != null && !this.f3399I.f1520bz && m2301a(this.f3399I, false)) {
                    z3 = true;
                }
                if (!z3) {
                    m2234av();
                    anVar = null;
                }
            } else {
                m2234av();
                anVar = null;
            }
        }
        if (anVar != null) {
            if (anVar.f1645a == EnumC0271ao.f1666h || anVar.f1645a == EnumC0271ao.f1668j) {
                if (this.f3399I != null && !this.f3399I.f1520bz && m2301a(this.f3399I, false)) {
                    m2319a(f, this.f3399I, wVar, true);
                }
                if (!(this.f3423U == null || this.f3423U.f3399I == null)) {
                    wVar.f3520c = false;
                }
            }
            if (anVar.f1645a == EnumC0271ao.f1668j) {
                if (this.f3399I == null && (p = m3403p(3.0f)) != null && m2221b(p, true)) {
                    if (this.f3417r > 90.0f) {
                        this.f3417r = 90.0f;
                    }
                    this.f3409j = true;
                    this.f3410k = p.f5841dH;
                    this.f3411l = p.f5842dI;
                    this.f3412m = 0;
                    this.f3408i = true;
                }
                if (mo2951ai() && u.f5585bg % 10 == this.f5835dA % 10 && (a = C0425p.m2610a(this, f, 150.0f, true)) != null) {
                    a.f1652m = false;
                    a.f1657k = 200.0f;
                    this.f3409j = false;
                    m2278aE();
                }
            }
        }
    }

    /* renamed from: f */
    private void m2181f(float f, C0270an anVar, C0521w wVar) {
        boolean z;
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0268al alVar = anVar.f1646b;
        if (alVar == null) {
            m2285a("activeBuildingType==null, removing waypoint");
            m2233aw();
            anVar = null;
        }
        if (anVar != null) {
            float f2 = mo2434f(alVar);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.f5843dJ > 4.0f) {
                z2 = true;
            }
            if (this.f3423U != null) {
                C0270an ap = this.f3423U.m2240ap();
                if (ap == null || ap.f1645a != EnumC0271ao.f1661c) {
                    wVar.f3520c = false;
                }
                if (ap != null && !anVar.m3359b(ap)) {
                    wVar.f3520c = false;
                }
            }
            boolean z3 = false;
            if (!C0851y.m433a(this.f3398H, 200)) {
                z3 = true;
            }
            if (f2 > 800000.0f) {
                z = true;
            } else {
                z = a <= f2 * f2;
            }
            if (!z || z2) {
                if (!mo2962aN()) {
                    m2233aw();
                    return;
                }
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                if (f2 > 58.0f) {
                    this.f3412m = (int) ((f2 - 41.0f) / (u.f5474bt.f727k * 1.414f));
                }
                if (this.f3417r > 90.0f) {
                    this.f3417r = 90.0f;
                }
                if (this.f3415p > 3) {
                    m2233aw();
                }
            } else if (!z3) {
                if (!mo2462x() || C0654f.m1461c(m2227b(f, g, h)) <= 30.0f) {
                    C0517s a2 = m2296a(anVar, anVar.f1646b, anVar.f1648d, anVar.f1654e, anVar.f1655f);
                    AbstractC0210af afVar = null;
                    if (a2.f3494a != null) {
                        afVar = a2.f3494a;
                    } else if (a2.f3495b != null) {
                        afVar = a2.f3495b;
                    }
                    if (afVar != null) {
                        a2.f3497d.mo3498a(this, afVar);
                        if (!mo2439a(afVar)) {
                            m2233aw();
                        } else if (mo2466b(afVar) > 10000.0f) {
                            afVar.m3402q(1.0f);
                            m2234av();
                        } else {
                            anVar.m3352e();
                            anVar.f1645a = EnumC0271ao.f1662d;
                            anVar.f1649h = afVar;
                            m2278aE();
                        }
                        this.f3398H = -9999;
                        return;
                    }
                    if (anVar.f1646b == null) {
                        AbstractC0789l.m670d("active.build==null");
                    }
                    if (!a2.f3496c) {
                        m2233aw();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2319a(float f, AbstractC0210af afVar, C0521w wVar, boolean z) {
        EnumC0272b aZ = mo2955aZ();
        float f2 = afVar.f5841dH;
        float f3 = afVar.f5842dI;
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, f2, f3);
        if (this.f3423U != null) {
            if (a < 490000.0f) {
                if (a < 48400.0f) {
                    wVar.f3520c = false;
                }
                float a2 = C0654f.m1522a(this.f3423U.f5841dH, this.f3423U.f5842dI, f2, f3);
                if (a2 < 48400.0f) {
                    wVar.f3520c = false;
                }
                if (a2 < 270400.0f && mo2958aR()) {
                    wVar.f3520c = false;
                }
            }
            if (this.f3423U.f3399I == afVar) {
                wVar.f3520c = false;
            }
            if (wVar.f3520c) {
                this.f3428Z = 0.0f;
            } else {
                this.f3428Z += f;
            }
        } else {
            this.f3428Z = 500.0f;
        }
        float l = m2156l(afVar);
        boolean z2 = true;
        if (a < l * l) {
            if (this.f3399I == afVar) {
                this.f3400J = 10.0f;
            } else if (C0214aj.m3391a(this, afVar)) {
                this.f3399I = afVar;
                this.f3400J = 10.0f;
                mo2757L(-1);
            }
            float f4 = l;
            if (!mo2384E()) {
                f4 -= 1.0f;
                if (mo2958aR()) {
                    f4 -= 2.0f;
                }
                if (mo2367e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (a < f4 * f4 && mo2955aZ() != EnumC0272b.f1680d) {
                if (afVar == null) {
                    z2 = false;
                } else if (m2179f(afVar)) {
                    z2 = false;
                    if (z) {
                        this.f3409j = false;
                    }
                } else if (!m2175g(afVar)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f3409j = true;
            this.f3410k = f2;
            this.f3411l = f3;
            this.f3412m = 0;
            if (aZ == EnumC0272b.f1680d) {
                m2325a(a, f2, f3);
            }
            this.f3412m = m2149n(afVar);
            if (this.f3417r > 90.0f) {
                this.f3417r = 90.0f;
            }
            if (a < 810000.0f) {
                if (mo2908cd() || mo2958aR()) {
                    this.f3408i = true;
                }
                if (!wVar.f3520c && this.f3428Z < 120.0f) {
                    this.f3417r = 0.1f;
                    this.f3408i = true;
                }
            }
        }
    }

    /* renamed from: g */
    private void m2177g(float f, C0270an anVar, C0521w wVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (mo2955aZ() == EnumC0272b.f1680d) {
            if (anVar != null && ((anVar.f1649h == null || anVar.f1649h.f1520bz || anVar.f1649h.f1441bB == this.f1441bB) && !this.f3438aj)) {
                if (this.f3399I != null && this.f3399I.f1520bz) {
                    this.f3399I = null;
                }
                m2287a(u, f, m2215b(true) + 200.0f);
                if (this.f3399I != null) {
                    anVar.f1649h = this.f3399I;
                    m2230az();
                    m2278aE();
                } else {
                    this.f3438aj = true;
                    this.f3437ai = true;
                }
            }
            if (anVar != null && (anVar.f1649h == null || anVar.f1649h.f1520bz || anVar.f1649h.f1441bB == this.f1441bB)) {
                if (anVar.f1649h == null) {
                    m2233aw();
                    anVar = null;
                } else if (!this.f3437ai) {
                    m2233aw();
                    anVar = null;
                }
            }
        } else if (anVar.f1649h == null || anVar.f1649h.f1520bz || anVar.f1649h.f1441bB == this.f1441bB) {
            boolean z = true;
            if (m2236at() > 1) {
                z = false;
            }
            anVar.f1649h = null;
            if (z) {
                if (this.f3399I != null && this.f3399I.f1520bz) {
                    this.f3399I = null;
                }
                m2287a(u, f, m2215b(true));
                if (this.f3399I != null) {
                    anVar.f1649h = this.f3399I;
                    m2230az();
                    m2278aE();
                }
            }
            if (anVar.f1649h == null) {
                m2233aw();
                anVar = null;
            }
        }
        if (anVar == null || anVar.f1649h == null || anVar.f1649h.f1520bz || anVar.f1649h.mo2937bS() || !this.f1441bB.m3589c(anVar.f1649h.f1441bB) || C0214aj.m3389b(this, anVar.f1649h)) {
            if (anVar != null && !mo2962aN() && !mo2361l()) {
                m2233aw();
                anVar = null;
            }
            if (anVar != null) {
                m2319a(f, anVar.f1649h, wVar, false);
                return;
            }
            return;
        }
        m2233aw();
    }

    /* renamed from: h */
    private void m2173h(float f, C0270an anVar, C0521w wVar) {
        float g = anVar.m3348g();
        float h = anVar.m3346h();
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
        if (anVar.f1649h == null || anVar.f1649h.f1520bz) {
            m2233aw();
            anVar = null;
        }
        if (anVar != null && !anVar.f1649h.mo2538d(this, false)) {
            m2233aw();
        }
        if (anVar != null) {
            this.f1518bv = anVar.f1649h;
            boolean z = false;
            if (anVar.f1649h.mo2700bw()) {
                if (a < 961.0f) {
                    this.f3407P += f;
                }
                if (this.f3407P > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (anVar.f1649h.mo2702bO().m4257a()) {
                    f2 = 11.0f;
                }
                if (this.f3390b > 0.0f) {
                    f2 = anVar.f1649h.f1447bO + 31.0f;
                }
                if (a < f2 * f2) {
                    z = true;
                }
            } else if (a < 441.0f) {
                z = true;
            }
            if (!z) {
                this.f3409j = true;
                this.f3410k = g;
                this.f3411l = h;
                if (this.f3417r > 90.0f) {
                    this.f3417r = 90.0f;
                }
                this.f3416q = 18;
                if (a < 48400.0f) {
                    wVar.f3520c = false;
                    if (this.f3417r > 0.0f && this.f3474aI == null) {
                        this.f3408i = true;
                    }
                }
                if (this.f3423U != null && !this.f3423U.m3435bG()) {
                    wVar.f3520c = false;
                }
            }
            if (z) {
                anVar.f1649h.mo2536e(this, false);
                m2233aw();
            }
        }
    }

    /* renamed from: i */
    private void m2169i(float f, C0270an anVar, C0521w wVar) {
        boolean z;
        int i;
        AbstractC0789l u = AbstractC0789l.m638u();
        boolean z2 = false;
        boolean z3 = false;
        if (anVar != null) {
            float g = anVar.m3348g();
            float h = anVar.m3346h();
            float a = C0654f.m1522a(this.f5841dH, this.f5842dI, g, h);
            if (anVar != null && anVar.f1645a == EnumC0271ao.f1665g && anVar.f1649h != null && anVar.f1649h.mo2587g() > 0.0f) {
                z3 = true;
            }
            if (anVar != null && (anVar.f1649h == null || anVar.f1649h.f1520bz || anVar.f1649h.f1539cp != null)) {
                if (z3) {
                    z2 = true;
                } else {
                    m2234av();
                    anVar = null;
                }
            }
            if (anVar != null && !z2 && z3 && anVar.f1649h != null && !mo2430w(anVar.f1649h)) {
                z2 = true;
            }
            if (anVar != null && z2) {
                C0365i iVar = null;
                if (anVar.f1649h != null) {
                    iVar = anVar.f1649h.mo2925cA();
                }
                AbstractC0210af a2 = m2294a(this, anVar.f1649h.f5841dH, anVar.f1649h.f5842dI, mo2924cB(), iVar);
                if (a2 != null) {
                    anVar.f1649h = a2;
                    m2230az();
                } else {
                    m2234av();
                    anVar = null;
                }
            }
            if (anVar != null) {
                if (anVar.f1645a == EnumC0271ao.f1662d) {
                    if (!mo2439a(anVar.f1649h)) {
                        m2233aw();
                        anVar = null;
                    }
                } else if (!mo2882i(anVar.f1649h)) {
                    m2233aw();
                    anVar = null;
                }
            }
            if (anVar != null && anVar.f1645a == EnumC0271ao.f1662d && anVar.f1649h != null && anVar.f1649h.f1450bY >= anVar.f1649h.f1451bZ && anVar.f1649h.f1529bR >= 1.0f) {
                m2234av();
                anVar = null;
            }
            if (anVar != null && anVar.f1649h == this) {
                m2233aw();
                anVar = null;
            }
            if (!(anVar == null || anVar == null || anVar.f1649h == null || anVar.f1649h.mo2587g() == 0.0f)) {
                boolean z4 = false;
                if (anVar.f1645a == EnumC0271ao.f1662d) {
                    z4 = true;
                }
                if (z4) {
                    m2233aw();
                    anVar = null;
                }
            }
            if (anVar != null && anVar.f1645a == EnumC0271ao.f1665g && anVar.f1649h.f1441bB != this.f1441bB && anVar.f1649h.mo2587g() == 0.0f) {
                boolean z5 = true;
                if (u.m752I() && this.f1441bB.m3579d(anVar.f1649h.f1441bB)) {
                    z5 = false;
                }
                if (z5) {
                    m2233aw();
                    anVar = null;
                }
            }
            if (anVar != null) {
                if (anVar.f1645a == EnumC0271ao.f1665g) {
                    i = mo2431t(anVar.f1649h);
                    z = mo2872u(anVar.f1649h);
                } else {
                    i = mo2432s(anVar.f1649h);
                    z = mo2871v(anVar.f1649h);
                }
                if (this.f3423U != null) {
                    float a3 = C0654f.m1522a(this.f3423U.f5841dH, this.f3423U.f5842dI, g, h);
                    int i2 = i + 80;
                    if (a3 < i2 * i2) {
                        wVar.f3520c = false;
                    }
                    C0270an ap = this.f3423U.m2240ap();
                    if (ap == null) {
                        wVar.f3520c = false;
                    }
                    if (ap != null && !anVar.m3359b(ap)) {
                        wVar.f3520c = false;
                    }
                }
                float f2 = i;
                if (this.f3403h) {
                    f2 += 5.0f;
                }
                if (i <= 30) {
                }
                if (a <= f2 * f2) {
                    int aP = mo2960aP();
                    if (aP == -1) {
                        aP = 0;
                    }
                    float f3 = 0.0f;
                    if (mo2462x()) {
                        f3 = m2227b(f, g, h);
                    }
                    boolean z6 = false;
                    if (C0654f.m1461c(f3) < 30.0f || !mo2462x()) {
                        this.f3403h = true;
                        C0213ai aiVar = this.f1462cn[aP];
                        if (aiVar.f1566f < mo2367e(aP)) {
                            aiVar.f1566f += f;
                        } else {
                            aiVar.f1566f = mo2367e(aP);
                            z6 = true;
                        }
                    }
                    if (z6) {
                        AbstractC0210af afVar = anVar.f1649h;
                        if (anVar.f1645a != EnumC0271ao.f1665g) {
                            mo2980a(afVar, f, aP);
                            if (afVar.f1529bR < 1.0f) {
                                float C = afVar.mo1608r().mo2862C();
                                if (afVar.mo2607T() == 2) {
                                    C *= 0.5f;
                                }
                                if (afVar.mo2607T() == 3) {
                                    C *= 0.25f;
                                }
                                float b = C * mo2466b(afVar);
                                float f4 = afVar.f1529bR + (b * f);
                                afVar.m3402q(f4);
                                if (f4 >= 1.0f && b < 0.3d && afVar.f1441bB == u.f5464bb) {
                                    u.f5481bA.f4281f.m1587a(afVar);
                                    return;
                                }
                                return;
                            }
                            afVar.f1450bY += mo2465c(afVar) * f;
                            if (afVar.f1450bY > afVar.f1451bZ) {
                                afVar.f1450bY = afVar.f1451bZ;
                                m2233aw();
                                return;
                            }
                            return;
                        }
                        mo2947b(afVar, f, aP);
                        boolean z7 = false;
                        boolean z8 = false;
                        float c = mo2465c(afVar) * 5.1f;
                        boolean z9 = anVar.f1649h.mo2587g() > 0.0f;
                        if (z9) {
                            c = anVar.f1649h.mo2587g();
                            z8 = true;
                        }
                        boolean z10 = false;
                        if (!z9 && this.f3404M < 200.0f && !z9) {
                            if (afVar.f1529bR < 0.5d) {
                                z10 = true;
                            } else if (afVar.f1450bY / afVar.f1451bZ < 0.5d) {
                                z10 = true;
                            }
                        }
                        if (!z10) {
                            if (afVar.f1529bR < 1.0f) {
                                afVar.f1529bR = (float) (afVar.f1529bR - ((0.001d * f) * 5.1f));
                                if (afVar.f1529bR <= 0.0f) {
                                    z7 = true;
                                }
                            } else {
                                float f5 = c * f;
                                if (f5 >= afVar.f1450bY) {
                                    f5 = afVar.f1450bY;
                                    afVar.f1450bY = -1.0f;
                                } else {
                                    afVar.f1450bY -= f5;
                                }
                                afVar.f1470cR = 1000.0f;
                                if (z8) {
                                    float f6 = f5 / afVar.f1451bZ;
                                    C0363g cv = afVar.m3410cv();
                                    C0363g cw = afVar.mo2901cw();
                                    if (cw != null) {
                                        cv = cw;
                                    }
                                    if (cv.m3052a() > 0) {
                                        this.f3421S += f6 * cv.m3052a();
                                        if (this.f3421S > 1.0f) {
                                            this.f1441bB.money += (int) this.f3421S;
                                            this.f3421S -= (int) this.f3421S;
                                        }
                                        cv.m3047a(this, f6, false);
                                    } else {
                                        cv.m3047a(this, f6, true);
                                    }
                                }
                                if (afVar.f1450bY <= 0.0f) {
                                    z7 = true;
                                }
                            }
                        }
                        if (z7 && !afVar.f1520bz) {
                            if (!z8) {
                                C0363g cw2 = afVar.mo2901cw();
                                if (cw2 != null) {
                                    cw2.m3047a(this, 1.0f, true);
                                } else {
                                    afVar.m3410cv().m3047a(this, 0.8f, true);
                                }
                            }
                            afVar.f1520bz = true;
                            afVar.f1521bA = u.f5467bh;
                            afVar.m3433bU();
                            if ((afVar instanceof AbstractC0515r) && afVar.mo2700bw()) {
                                u.f5483bC.m957a((AbstractC0515r) afVar);
                            }
                        }
                    }
                } else if (!mo2962aN() || anVar.f1657k == 0.0f) {
                    m2233aw();
                } else {
                    boolean z11 = false;
                    if (anVar.f1657k >= 0.0f) {
                        if (anVar.f1657k < C0654f.m1517a((int) a) - f2) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        m2233aw();
                        return;
                    }
                    this.f3409j = true;
                    this.f3410k = g;
                    this.f3411l = h;
                    if (i > 58) {
                        this.f3412m = (int) ((i - 41.0f) / (u.f5474bt.f727k * 1.414f));
                    } else {
                        this.f3412m = 0;
                    }
                    if (i < 30 || z) {
                        if (a < 841.0f) {
                            this.f3408i = true;
                        }
                        float f7 = i + 14;
                        if (a < f7 * f7 && this.f3417r > 0.0f && this.f3474aI == null) {
                            this.f3408i = true;
                        }
                    }
                    this.f3416q = this.f3412m;
                    if (this.f3417r > 90.0f) {
                        this.f3417r = 90.0f;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m2161k(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1518bv != null) {
            this.f1518bv = null;
        }
        if (this.f1439bw != null) {
            this.f1440bx = C0654f.m1524a(this.f1440bx, f);
            this.f1518bv = this.f1439bw;
            if (this.f1440bx == 0.0f) {
                this.f1439bw = null;
            }
        }
        if (this.f3417r != 0.0f) {
            this.f3417r = C0654f.m1524a(this.f3417r, f);
        }
        if (this.f1528bK != 0.0f) {
            this.f3391c = C0654f.m1524a(this.f3391c, f);
        }
        C0270an ap = m2240ap();
        this.f3408i = false;
        if (this.f3403h) {
            this.f3403h = false;
        }
        boolean z = this.f3409j;
        this.f3409j = false;
        this.f3418s = false;
        this.f3416q = 150;
        if (ap != null && ap.f1658l > 0.0f && ap.f1658l < this.f3404M) {
            m2234av();
            ap = null;
        }
        C0521w wVar = f3469aD;
        wVar.m2129a();
        if (ap != null) {
            this.f3404M += f;
            EnumC0271ao aoVar = ap.f1645a;
            if (aoVar == EnumC0271ao.f1659a || aoVar == EnumC0271ao.f1666h || aoVar == EnumC0271ao.f1668j) {
                m2317a(f, ap, wVar, z);
            } else if (aoVar == EnumC0271ao.f1660b) {
                m2177g(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1661c) {
                m2181f(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1662d || aoVar == EnumC0271ao.f1665g) {
                m2169i(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1663e) {
                m2173h(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1667i) {
                m2184e(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1671m) {
                m2188d(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1669k || aoVar == EnumC0271ao.f1670l || aoVar == EnumC0271ao.f1672n) {
                m2194c(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1673o || aoVar == EnumC0271ao.f1674p) {
                m2318a(f, ap, wVar);
            } else if (aoVar == EnumC0271ao.f1675q) {
                m2226b(f, ap, wVar);
            }
            if (ap != m2240ap()) {
                ap = null;
            }
        }
        if (ap != null && ap.f1652m && this.f3394f > 1) {
            boolean z2 = true;
            C0270an k = m2160k(1);
            if (k != null && (k.f1645a == EnumC0271ao.f1669k || k.f1645a == EnumC0271ao.f1668j)) {
                z2 = false;
            }
            if (z2) {
                m2233aw();
                ap = null;
            }
        }
        if (ap == null) {
            this.f3409j = false;
        }
        if (this.f3409j) {
            C0336i cV = m3419cV();
            if (cV != null && cV.f2279H) {
                m2196bs();
            }
        } else if (this.f3415p != 0) {
            this.f3415p = (byte) 0;
        }
        m2216b(u, f);
        m2286a(u, f, ap, wVar);
    }

    /* renamed from: a */
    private void m2325a(float f, float f2, float f3) {
        if (this.f3436ah < -900.0f) {
            this.f3436ah = C0654f.m1448d(this.f5841dH, this.f5842dI, f2, f3);
        }
        if (f < 10000.0f && mo2526bJ()) {
            this.f3437ai = true;
        }
        if (!this.f3437ai) {
            return;
        }
        if (this.f1457cf < mo2628aY() * 0.6d || (f < 40000.0f && this.f1457cf < mo2628aY())) {
            this.f3410k += C0654f.m1423i(this.f3436ah + 180.0f) * 600.0f;
            this.f3411l += C0654f.m1427h(this.f3436ah + 180.0f) * 600.0f;
            return;
        }
        this.f3437ai = false;
        this.f3436ah = -999.0f;
        m2278aE();
    }

    /* renamed from: a */
    private void m2315a(float f, C0523y yVar, C0521w wVar, C0270an anVar) {
        float f2;
        C0523y yVar2;
        C0523y yVar3;
        float f3;
        float f4;
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r rVar = this.f3423U;
        float f5 = rVar.f5841dH + this.f3430ab;
        float f6 = rVar.f5842dI + this.f3431ac;
        int i = u.f5467bh - rVar.f3433ae;
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, f5, f6);
        if (i > 300 || this.f3390b > 1.0f) {
            this.f3392d += f;
        }
        boolean z = false;
        if (this.f3392d > 300.0f) {
            z = true;
        }
        if (i > 300 && a > 250000.0f) {
            z = true;
        }
        if (this.f3390b > 1.0f) {
            if (this.f3391c != 0.0f) {
                z = true;
            }
            if (this.f3392d > 10.0f) {
                z = true;
            }
        }
        if (z) {
            this.f3391c = 90.0f;
        }
        if (this.f3391c == 0.0f) {
            m2278aE();
            wVar.f3521d = f5;
            wVar.f3522e = f6;
            C0523y yVar4 = null;
            if (i < 3000 && 0 == 0 && rVar.f3443u > 2 && rVar.f3443u - rVar.f3441am <= 2) {
                yVar4 = rVar.m2148o(2);
            }
            if (i < 1500 && yVar4 == null && rVar.f3443u > 0 && rVar.f3441am + 0 >= rVar.f3443u) {
                C0523y o = rVar.m2148o(0);
                yVar4 = f3475aJ;
                float d = C0654f.m1448d(rVar.f5841dH, rVar.f5842dI, o.f3527a, o.f3528b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                yVar4.f3527a = rVar.f5841dH + (C0654f.m1423i(d) * f7);
                yVar4.f3528b = rVar.f5842dI + (C0654f.m1427h(d) * f7);
            }
            if (yVar4 != null) {
                wVar.f3519b = true;
                wVar.f3521d = yVar4.f3527a + this.f3430ab;
                wVar.f3522e = yVar4.f3528b + this.f3431ac;
            } else if (rVar.f3443u >= 2 && rVar.f3441am >= 1) {
                if (rVar.f3441am >= 2) {
                    yVar3 = rVar.m2148o(0);
                    yVar2 = rVar.m2148o(1);
                } else {
                    yVar3 = rVar.m2148o(0);
                    yVar2 = rVar.m2148o(0);
                }
                if (!(yVar3 == null || yVar2 == null)) {
                    float c = 1.0f - ((C0654f.m1458c(rVar.f5841dH, rVar.f5842dI, yVar3.f3527a, yVar3.f3528b) - 15.0f) * 0.05f);
                    if (c > 2.0f) {
                        c = 2.0f;
                    }
                    if (c < 0.0f) {
                        c = 0.0f;
                    }
                    if (c <= 1.0f) {
                        f4 = (yVar2.f3527a - yVar3.f3527a) * c;
                        f3 = (yVar2.f3528b - yVar3.f3528b) * c;
                    } else if (rVar.f3441am >= 3) {
                        C0523y o2 = rVar.m2148o(2);
                        float f8 = yVar2.f3527a - yVar3.f3527a;
                        float f9 = yVar2.f3528b - yVar3.f3528b;
                        f4 = f8 + ((o2.f3527a - yVar2.f3527a) * (c - 1.0f));
                        f3 = f9 + ((o2.f3528b - yVar2.f3528b) * (c - 1.0f));
                    } else {
                        f4 = yVar2.f3527a - yVar3.f3527a;
                        f3 = yVar2.f3528b - yVar3.f3528b;
                    }
                    wVar.f3521d = yVar3.f3527a + this.f3430ab + f4;
                    wVar.f3522e = yVar3.f3528b + this.f3431ac + f3;
                }
            }
            float f10 = 45.0f;
            if (this.f3390b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.f3390b <= 1.0f) {
                f10 = 110.0f;
            }
            if (a < f10 * f10) {
                this.f3392d = 0.0f;
            }
            boolean z2 = false;
            C0270an ap = rVar.m2240ap();
            if (ap == null || anVar != null) {
            }
            if (ap == null || 0 != 0) {
                this.f3393e += f;
                boolean z3 = false;
                if (anVar != null && (anVar.f1645a == EnumC0271ao.f1659a || anVar.f1645a == EnumC0271ao.f1666h || anVar.f1645a == EnumC0271ao.f1668j)) {
                    z3 = true;
                }
                if (z3 && this.f3393e > 600.0f) {
                    f2 = 260.0f;
                } else if (z3 && this.f3393e > 360.0f) {
                    f2 = 140.0f;
                } else if (z3 && this.f3393e > 180.0f) {
                    f2 = 70.0f;
                } else if (!z3 || this.f3393e <= 120.0f) {
                    f2 = 16.0f;
                } else {
                    f2 = 50.0f;
                }
                if (a < f2 * f2) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (ap == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && C0654f.m1461c(m2195c(f, this.f3432ad)) < 3.0f && anVar != null) {
                    if (anVar.f1645a == EnumC0271ao.f1659a || anVar.f1645a == EnumC0271ao.f1666h) {
                        m2233aw();
                        if (rVar != null) {
                            boolean z5 = false;
                            C0270an ap2 = m2240ap();
                            C0270an ap3 = rVar.m2240ap();
                            if (!(ap2 == null || ap3 == null || !ap2.m3359b(ap3))) {
                                z5 = true;
                            }
                            if (!z5) {
                                m2295a((AbstractC0515r) null);
                            }
                        }
                    }
                }
            } else if (0 == 0) {
                wVar.f3518a = true;
            }
        } else {
            C0523y yVar5 = null;
            if (0 == 0 && rVar.f3443u > 2 && 8 < rVar.f3441am) {
                yVar5 = rVar.m2148o(8);
            }
            if (yVar5 == null) {
                yVar5 = f3475aJ;
                yVar5.f3527a = rVar.f5841dH;
                yVar5.f3528b = rVar.f5842dI;
            }
            float a2 = C0654f.m1522a(this.f5841dH, this.f5842dI, yVar5.f3527a, yVar5.f3528b);
            float f11 = this.f1447bO + rVar.f1447bO + 15.0f;
            float f12 = this.f1447bO + rVar.f1447bO + 100.0f;
            if (a2 < f11 * f11) {
                this.f3392d = 0.0f;
                this.f3391c = 0.0f;
            } else if (a2 < f12 * f12) {
            }
            if (this.f3474aI == null && yVar != null && ((C0654f.m1461c(this.f3413n - yVar5.f3527a) > 300.0f || C0654f.m1461c(this.f3414o - yVar5.f3528b) > 300.0f) && this.f3417r > 30.0f)) {
                this.f3417r = 30.0f;
            }
            if (this.f3417r == 0.0f && this.f3474aI == null) {
                this.f3417r = 700.0f;
                m2323a(yVar5.f3527a, yVar5.f3528b, 0, false, false);
            }
            if (yVar != null) {
                wVar.f3521d = yVar.f3527a;
                wVar.f3522e = yVar.f3528b;
                if (0 == 0) {
                    wVar.f3518a = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m2286a(AbstractC0789l lVar, float f, C0270an anVar, C0521w wVar) {
        C0270an ap;
        boolean I = mo2380I();
        if (this.f3474aI != null) {
            m2217b(lVar);
        }
        if (this.f3423U != null && (this.f3423U.f1520bz || !this.f3423U.m3435bG())) {
            m2295a((AbstractC0515r) null);
        }
        if (this.f3409j) {
            C0523y aC = m2280aC();
            C0270an ap2 = m2240ap();
            if (ap2 == null) {
                wVar.f3520c = false;
            }
            if (this.f3424V && this.f3426X > 0 && m2279aD()) {
                this.f3433ae = lVar.f5467bh;
            }
            if (!(ap2 == null || this.f3423U == null || !wVar.f3520c || (ap = this.f3423U.m2240ap()) == null || ap.m3359b(ap2))) {
                wVar.f3520c = false;
            }
            if (this.f3423U != null && wVar.f3520c) {
                m2315a(f, aC, wVar, anVar);
            } else if (this.f1449bQ != 0.0f) {
                wVar.f3521d = this.f3410k;
                wVar.f3522e = this.f3411l;
                wVar.f3518a = true;
            } else {
                boolean z = false;
                if (this.f3474aI == null) {
                    if (aC == null && this.f3417r == 0.0f) {
                        z = true;
                    }
                    if (this.f3417r == 0.0f && (mo2908cd() || mo2958aR())) {
                        float m = mo2360m() - 1.0f;
                        if (C0654f.m1461c(this.f3413n - this.f3410k) > m || C0654f.m1461c(this.f3414o - this.f3411l) > m) {
                            z = true;
                        }
                    }
                    if (anVar != null && this.f3417r == 0.0f && ((anVar.f1645a == EnumC0271ao.f1663e || anVar.f1645a == EnumC0271ao.f1667i) && (C0654f.m1461c(this.f3413n - this.f3410k) > 12.0f || C0654f.m1461c(this.f3414o - this.f3411l) > 12.0f))) {
                        z = true;
                    }
                    if (anVar != null) {
                        float f2 = this.f3416q;
                        if (C0654f.m1461c(this.f3413n - this.f3410k) > f2 || C0654f.m1461c(this.f3414o - this.f3411l) > f2) {
                            if (this.f3417r > 30.0f) {
                                this.f3417r = 30.0f;
                            }
                            if (this.f3417r == 0.0f) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.f3417r = 500.0f;
                    m2323a(this.f3410k, this.f3411l, this.f3412m, this.f3424V && this.f3427Y > 1, this.f3418s);
                }
                if (aC != null) {
                    wVar.f3521d = aC.f3527a;
                    wVar.f3522e = aC.f3528b;
                    wVar.f3518a = true;
                } else if (this.f3408i) {
                    wVar.f3521d = this.f3410k;
                    wVar.f3522e = this.f3411l;
                    wVar.f3518a = true;
                }
            }
        }
        m2316a(f, wVar, anVar, I);
    }

    /* renamed from: a */
    private void m2316a(float f, C0521w wVar, C0270an anVar, boolean z) {
        float f2 = 0.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f3409j && wVar.f3518a && z) {
            float f3 = wVar.f3521d;
            float f4 = wVar.f3522e;
            float d = C0654f.m1448d(this.f5841dH, this.f5842dI, f3, ((f4 - this.f5842dI) * mo2956aV()) + this.f5842dI);
            float a = C0654f.m1522a(this.f5841dH, this.f5842dI, f3, f4);
            boolean z2 = false;
            float aX = mo2424aX();
            if (aX > 0.95f) {
                z2 = true;
            } else if (aX > 0.87d) {
                if (this.f3427Y <= 1 && this.f3441am > 0 && this.f3441am <= 9 && this.f3424V && a < 250000.0f) {
                    z2 = true;
                }
            } else if (aX > 0.7d) {
                if (this.f3427Y <= 1 && this.f3441am > 0 && this.f3441am <= 4 && this.f3424V && a < 40000.0f) {
                    z2 = true;
                }
            } else if (aX > 0.4d && this.f3427Y <= 1 && this.f3441am > 0 && this.f3441am <= 2 && this.f3424V && a < 10000.0f) {
                z2 = true;
            }
            float f5 = 179.0f;
            if (this.f3399I != null && mo2384E() && mo2555be() && !mo2958aR()) {
                this.f1445bM = d;
            } else if (this.f3447ap <= 0.0f) {
                f5 = m2321a(f, d, true, z2);
            }
            float f6 = 20.0f;
            if (a > 361.0f) {
                f6 = 46.0f;
            }
            if (a > 3600.0f) {
                f6 = 89.0f;
            }
            float A = mo2388A();
            if (A < 1.4d) {
                if (a > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (A < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.f1528bK > 0.4d && a > 16900.0f) {
                f6 = 180.0f;
            }
            if (m2263aT() && this.f3443u == this.f3441am) {
                f6 = 1.0f;
            }
            if (mo2555be()) {
                f6 = 181.0f;
            }
            boolean z3 = this.f3441am == 1;
            if ((!z3 || a >= 4.0f * 4.0f) && C0654f.m1461c(f5) <= f6) {
                f2 = 1.0f;
                if (wVar.f3519b) {
                    if (a < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (a < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (a < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.f3423U != null) {
                    if (a > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (a < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (a < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (a < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z3 && f2 != 0.0f) {
                if (a < 324.0f && mo2385D() < 0.13f && mo2358z() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (a < 169.0f && mo2385D() < 0.15f && mo2358z() > 0.9f) {
                    f2 = 0.5f * f2;
                }
            }
            boolean z4 = false;
            if (!z3 && a < 256.0f) {
                z4 = true;
            }
            if (z3 && a < 4.0f * 4.0f) {
                z4 = true;
            }
            if ((this.f3420R == u.f5585bg || this.f3420R == u.f5585bg - 1) && this.f3419Q != null && this.f3419Q.m3425c(f3, f4, 2.0f)) {
                z4 = true;
            }
            if (f2 > 0.0f) {
                this.f3405N += f;
                if (this.f3405N > 200.0f && a < 3600.0f && this.f3441am >= 2) {
                    float f7 = this.f3405N;
                    m2276aG();
                    this.f3405N = f7;
                }
                if (this.f3405N > 600.0f && this.f3441am >= 2) {
                    m2278aE();
                }
                if (this.f3405N > 80.0f && this.f3390b > 30.0f) {
                    m2278aE();
                }
                if (this.f3405N > 40.0f && this.f3441am >= 2) {
                    C0523y yVar = this.f3440al[1];
                    if (C0654f.m1522a(this.f5841dH, this.f5842dI, yVar.f3527a, yVar.f3528b) < a) {
                        float f8 = this.f3405N;
                        m2276aG();
                        this.f3405N = f8;
                    }
                }
            }
            if (z4) {
                m2276aG();
                if (z3) {
                    this.f3392d = 0.0f;
                    this.f3391c = 0.0f;
                }
                if (!this.f3442t && this.f3423U == null && z3 && anVar != null && anVar.f1645a == EnumC0271ao.f1659a) {
                    m2234av();
                }
            }
        }
        if (this.f1446bN && !mo2555be()) {
            f2 = (-f2) * mo2424aX();
        }
        if (this.f3447ap > 0.0f) {
            f2 = 0.0f;
        }
        if (!mo2556bd()) {
            if (this.f1528bK < f2) {
                this.f1528bK = C0654f.m1523a(this.f1528bK, f2, mo2386C() * f);
            }
            if (this.f1528bK > f2) {
                this.f1528bK = C0654f.m1523a(this.f1528bK, f2, mo2385D() * f);
            }
        } else {
            this.f1528bK = f2;
        }
        this.f1538cm = wVar.f3518a && z;
    }

    @Deprecated
    /* renamed from: X */
    public boolean m2328X() {
        return this.f3399I != null;
    }

    /* renamed from: Y */
    public boolean m2327Y() {
        if (this.f3399I == null || this.f3399I.f1520bz) {
            return false;
        }
        int bg = mo2436bg();
        for (int i = 0; i < bg; i++) {
            if (this.f1462cn[i].f1570j != null && mo2762r(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z */
    public AbstractC0210af m2326Z() {
        if (this.f3399I != null && !this.f3399I.f1520bz) {
            return this.f3399I;
        }
        C0270an ap = m2240ap();
        if (ap == null || ap.f1649h == null || ap.f1649h.f1520bz) {
            return null;
        }
        return ap.f1649h;
    }

    /* renamed from: a */
    private void m2287a(AbstractC0789l lVar, float f, float f2) {
        f3470aE.m2128a(f2);
        lVar.f5491bK.m2502a(this.f5841dH, this.f5842dI, f2, this, f, f3470aE);
        if (f3470aE.f3523a == 0) {
            return;
        }
        if (this.f3399I == null || !m2256a_(this.f3399I)) {
            f3471aF.m2128a(f2);
            lVar.f5491bK.m2502a(this.f5841dH, this.f5842dI, f2, this, f, f3471aF);
        }
    }

    /* renamed from: aa */
    public boolean mo2953aa() {
        return mo2436bg() > 1;
    }

    /* renamed from: a */
    private void m2288a(AbstractC0789l lVar, float f) {
        int bg = mo2436bg();
        if (!mo2953aa()) {
            for (int i = 0; i < bg; i++) {
                this.f1462cn[i].f1570j = this.f3399I;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < bg; i2++) {
            C0213ai aiVar = this.f1462cn[i2];
            if (mo2760v(i2) == -1) {
                if (mo2568a(i2, this.f3399I, false, false)) {
                    aiVar.f1570j = this.f3399I;
                } else {
                    z = true;
                    if (aiVar.f1570j == this.f3399I) {
                        aiVar.f1570j = null;
                    }
                }
            }
        }
        if (z) {
            float b = m2215b(false);
            f3473aH.m3473a(this);
            lVar.f5491bK.m2502a(this.f5841dH, this.f5842dI, b, this, f, f3473aH);
        }
        for (int i3 = 0; i3 < bg; i3++) {
            int v = mo2760v(i3);
            if (v != -1) {
                this.f1462cn[i3].f1570j = this.f1462cn[v].f1570j;
            }
        }
    }

    /* renamed from: ab */
    public boolean m2254ab() {
        if (!mo2361l()) {
            return false;
        }
        C0336i cV = m3419cV();
        if (cV == null || cV.f2303M) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m2216b(AbstractC0789l lVar, float f) {
        int bg = mo2436bg();
        boolean z = false;
        if (m2254ab()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.f3399I != null) {
                C0336i cV = m3419cV();
                if (cV != null && this.f1540cq != null && cV.f2281L && this.f1540cq.f3399I == this.f3399I) {
                    z2 = true;
                }
                if (!m2301a(this.f3399I, false) && !z2 && 1 != 0) {
                    this.f3399I = null;
                }
            }
            if (this.f3399I != null && !z2) {
                z3 = !m2256a_(this.f3399I);
            }
            this.f3400J = C0654f.m1524a(this.f3400J, f);
            this.f3401K = C0654f.m1524a(this.f3401K, f);
            if ((this.f3399I == null || z3) && this.f3400J == 0.0f && mo2932ba()) {
                this.f3400J = 20.0f + (this.f5841dH % 5.0f) + (this.f5842dI % 5.0f);
                m2287a(lVar, f, m2215b(false));
                if (this.f3399I != null) {
                    this.f3401K = 0.0f;
                }
            }
            if (this.f3399I != null && this.f3401K == 0.0f) {
                this.f3401K = 20.0f + (this.f5841dH % 5.0f) + (this.f5842dI % 5.0f);
                m2288a(lVar, f);
            }
            for (int i = 0; i < bg; i++) {
                this.f1462cn[i].f1567g = false;
            }
            if (this.f3399I != null) {
                float a = C0654f.m1522a(this.f5841dH, this.f5842dI, this.f3399I.f5841dH, this.f3399I.f5842dI);
                float l = m2156l(this.f3399I);
                if (a < l * l || z2) {
                    int aP = mo2960aP();
                    for (int i2 = 0; i2 < bg; i2++) {
                        C0213ai aiVar = this.f1462cn[i2];
                        AbstractC0210af afVar = aiVar.f1570j;
                        if (afVar != null) {
                            boolean z4 = afVar == this.f3399I;
                            if (!z4 && !m2221b(afVar, true)) {
                                aiVar.f1570j = null;
                            } else if (!mo2568a(i2, afVar, false, !z4)) {
                                aiVar.f1570j = null;
                            } else {
                                PointF F = mo2441F(i2);
                                PointF J = mo2574J(i2);
                                J.f224a += afVar.f5841dH;
                                J.f225b += afVar.f5842dI;
                                float d = C0654f.m1448d(F.f224a, F.f225b, J.f224a, J.f225b);
                                if (mo2760v(i2) == -1 && i2 != aP) {
                                    if (!mo2384E()) {
                                        aiVar.m3397a(70);
                                        aiVar.f1562b = aiVar.f1561a;
                                        float f2 = 179.0f;
                                        if (!aiVar.m3396b()) {
                                            f2 = m2324a(f, d, i2);
                                        }
                                        if (C0654f.m1461c(f2) < mo2870x(i2)) {
                                            aiVar.f1567g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        C0270an ap = m2240ap();
                                        if (ap != null && (ap.f1645a == EnumC0271ao.f1661c || ap.f1645a == EnumC0271ao.f1662d || ap.f1645a == EnumC0271ao.f1665g)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.f3409j || mo2555be())) {
                                            float c = m2195c(f, d);
                                            aiVar.f1562b = aiVar.f1561a;
                                            if (C0654f.m1461c(c) < mo2870x(i2)) {
                                                aiVar.f1567g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < bg; i3++) {
                        C0213ai aiVar2 = this.f1462cn[i3];
                        AbstractC0210af afVar2 = aiVar2.f1570j;
                        if (afVar2 != null) {
                            if (mo2761u(i3) && aiVar2.f1565e == 0.0f) {
                                z = true;
                            }
                            if (mo2761u(i3)) {
                                m2320a(f, afVar2, i3);
                            }
                        }
                    }
                } else if (!this.f3409j && mo2948al()) {
                    this.f3408i = true;
                    this.f3409j = true;
                    this.f3410k = this.f3399I.f5841dH;
                    this.f3411l = this.f3399I.f5842dI;
                    this.f3412m = 0;
                }
            }
        }
        if (this.f3468aC && m2330V() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < bg; i4++) {
            C0213ai aiVar3 = this.f1462cn[i4];
            if (!z && aiVar3.f1566f != 0.0f) {
                aiVar3.f1566f = C0654f.m1524a(aiVar3.f1566f, mo2366f(i4) * f);
            }
        }
    }

    /* renamed from: b */
    public void mo2946b(AbstractC0210af afVar, int i) {
    }

    /* renamed from: a */
    public boolean m2320a(float f, AbstractC0210af afVar, int i) {
        C0213ai aiVar = this.f1462cn[i];
        int v = mo2760v(i);
        if (v != -1) {
            aiVar.f1561a = this.f1462cn[v].f1561a;
        }
        boolean s = mo2874s(i);
        boolean z = false;
        if (s) {
            if (aiVar.f1566f < mo2367e(i)) {
                if (aiVar.f1566f == 0.0f) {
                    mo2946b(afVar, i);
                }
                aiVar.f1566f += f;
            } else {
                aiVar.f1566f = mo2367e(i);
            }
            z = true;
        }
        if (aiVar.f1565e != 0.0f || !mo2762r(i)) {
            return false;
        }
        if (!mo2568a(i, afVar, false, false)) {
            aiVar.f1565e = -10.0f;
            return false;
        }
        if (!s) {
            if (aiVar.f1566f < mo2367e(i)) {
                if (aiVar.f1566f == 0.0f) {
                    mo2946b(afVar, i);
                }
                aiVar.f1566f += f;
            } else {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        aiVar.f1565e = mo2374b(i) + mo2873t(i);
        if (!s) {
            aiVar.f1566f = 0.0f;
        }
        mo2375a(afVar, i);
        mo2757L(i);
        aiVar.f1573m = !aiVar.f1573m;
        return true;
    }

    /* renamed from: a_ */
    public boolean m2256a_(AbstractC0210af afVar) {
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, afVar.f5841dH, afVar.f5842dI);
        float l = m2156l(afVar);
        if (a < l * l) {
            return true;
        }
        return false;
    }

    /* renamed from: ac */
    public boolean mo2418ac() {
        return false;
    }

    /* renamed from: ad */
    public boolean mo2417ad() {
        return true;
    }

    /* renamed from: ae */
    public boolean mo2416ae() {
        return true;
    }

    /* renamed from: af */
    public boolean mo2415af() {
        return true;
    }

    /* renamed from: f */
    public boolean m2179f(AbstractC0210af afVar) {
        int v;
        int bg = mo2436bg();
        for (int i = 0; i < bg; i++) {
            if (mo2762r(i) && mo2568a(i, afVar, false, false) && ((v = mo2760v(i)) == -1 || mo2568a(v, afVar, false, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m2175g(AbstractC0210af afVar) {
        int v;
        int bg = mo2436bg();
        for (int i = 0; i < bg; i++) {
            if (mo2762r(i) && mo2568a(i, afVar, true, false) && ((v = mo2760v(i)) == -1 || mo2568a(v, afVar, true, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2568a(int i, AbstractC0210af afVar, boolean z, boolean z2) {
        if (z || !z2 || m2256a_(afVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo2884h(AbstractC0210af afVar) {
        if (afVar.mo2363i()) {
            return mo2417ad();
        }
        if (afVar.mo2377P()) {
            return mo2418ac();
        }
        if (mo2415af() || afVar.m3414cr()) {
            return mo2416ae();
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2439a(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: i */
    public boolean mo2882i(AbstractC0210af afVar) {
        if (afVar.mo2587g() == 0.0f || !mo2869x(afVar)) {
            return mo2439a(afVar);
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC0197s m2298a(AbstractC0268al alVar, boolean z) {
        return m2299a(alVar, -1, z);
    }

    /* renamed from: ag */
    public boolean m2249ag() {
        Iterator it = mo2420M().iterator();
        while (it.hasNext()) {
            if (((AbstractC0197s) it.next()).mo2452g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0197s m2299a(AbstractC0268al alVar, int i, boolean z) {
        AbstractC0268al B;
        ArrayList M = mo2420M();
        AbstractC0197s sVar = null;
        if (M.size() > 0) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar2 = (AbstractC0197s) it.next();
                AbstractC0268al v = sVar2.mo3266v();
                if (z && (B = sVar2.mo3292B()) != null) {
                    v = B;
                }
                if (v == alVar && (i == -1 || i == sVar2.mo3484p())) {
                    sVar = sVar2;
                    if (sVar2.mo2405a((AbstractC0210af) this) && sVar2.mo2410a((AbstractC0210af) this, false)) {
                        return sVar2;
                    }
                }
            }
        }
        return sVar;
    }

    /* renamed from: b */
    public boolean m2220b(AbstractC0268al alVar, boolean z) {
        AbstractC0197s a = m2298a(alVar, z);
        if (a == null || a.mo3279h(this) || !a.mo2405a((AbstractC0210af) this)) {
            return false;
        }
        return true;
    }

    /* renamed from: ah */
    public boolean mo2952ah() {
        return mo1608r().mo2807m();
    }

    /* renamed from: ai */
    public boolean mo2951ai() {
        return mo1608r().mo2809l();
    }

    /* renamed from: j */
    public void mo2880j(AbstractC0210af afVar) {
    }

    /* renamed from: aj */
    public boolean mo2950aj() {
        return false;
    }

    /* renamed from: a */
    public final boolean m2301a(AbstractC0210af afVar, boolean z) {
        if (this.f1441bB == afVar.f1441bB || afVar.f1520bz || !this.f1441bB.m3589c(afVar.f1441bB) || this.f3397G == EnumC0178a.f1318d || this.f3397G == EnumC0178a.f1317c || afVar.f1539cp != null || !mo2884h(afVar) || !afVar.mo2369d((AbstractC0210af) this)) {
            return false;
        }
        if (z) {
            return true;
        }
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, afVar.f5841dH, afVar.f5842dI);
        float b = m2215b(false);
        if (a < b * b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2221b(AbstractC0210af afVar, boolean z) {
        if (afVar.mo2907ce()) {
            return false;
        }
        return m2301a(afVar, z);
    }

    /* renamed from: ak */
    public float mo2949ak() {
        return 0.0f;
    }

    /* renamed from: al */
    public boolean mo2948al() {
        return this.f3397G == EnumC0178a.f1315a || this.f3397G == EnumC0178a.f1319e || this.f3397G == EnumC0178a.f1320f;
    }

    /* renamed from: b */
    public float m2215b(boolean z) {
        float f;
        float m = mo2360m();
        C0270an ap = m2240ap();
        if (ap != null && (ap.f1645a == EnumC0271ao.f1666h || ap.f1645a == EnumC0271ao.f1668j || ap.f1645a == EnumC0271ao.f1669k)) {
            if (ap.f1645a == EnumC0271ao.f1668j) {
                m += 110.0f;
            } else if (ap.f1645a == EnumC0271ao.f1669k) {
                m += 90.0f;
            } else {
                m += 20.0f;
            }
            if (m < 190.0f) {
                m = 190.0f;
            }
        }
        if (this.f3397G == EnumC0178a.f1315a) {
            f = m + 250.0f;
        } else if (this.f3397G == EnumC0178a.f1319e) {
            f = m + 150.0f;
        } else if (this.f3397G == EnumC0178a.f1320f) {
            f = m + 180.0f;
        } else {
            f = m + mo2949ak();
            if (z) {
                f += 110.0f;
            }
        }
        return f;
    }

    /* renamed from: am */
    public C0270an m2243am() {
        m2153m(29);
        C0270an anVar = this.f3396g[29];
        for (int i = 29; i >= 1; i--) {
            this.f3396g[i] = this.f3396g[i - 1];
        }
        this.f3396g[0] = anVar;
        if (this.f3394f < 29) {
            this.f3394f++;
        }
        if (this.f3396g[0] == null) {
            this.f3396g[0] = new C0270an();
        }
        C0270an anVar2 = this.f3396g[0];
        anVar2.m3352e();
        this.f3404M = 0.0f;
        this.f3407P = 0.0f;
        this.f3405N = 0.0f;
        m2219b(anVar2);
        m2278aE();
        return anVar2;
    }

    /* renamed from: a */
    public void mo2977a(C0270an anVar) {
    }

    /* renamed from: b */
    public void m2219b(C0270an anVar) {
        if (this.f3399I != null && this.f3399I.mo2907ce()) {
            this.f3399I = null;
        }
    }

    /* renamed from: an */
    public C0270an m2242an() {
        m2153m(this.f3394f);
        if (this.f3396g[this.f3394f] == null) {
            this.f3396g[this.f3394f] = new C0270an();
        }
        C0270an anVar = this.f3396g[this.f3394f];
        anVar.m3352e();
        if (this.f3394f < 29) {
            this.f3394f++;
        }
        if (this.f3394f > 0) {
            m2219b(this.f3396g[0]);
        }
        return anVar;
    }

    /* renamed from: d */
    public C0270an m2189d(float f, float f2) {
        C0270an an = m2242an();
        an.m3368a(f, f2);
        return an;
    }

    /* renamed from: k */
    public C0270an m2159k(AbstractC0210af afVar) {
        C0270an an = m2242an();
        an.m3366a(afVar);
        return an;
    }

    /* renamed from: e */
    public C0270an m2185e(float f, float f2) {
        C0270an an = m2242an();
        an.m3361b(f, f2);
        return an;
    }

    /* renamed from: c */
    public C0270an m2192c(C0270an anVar) {
        C0270an an = m2242an();
        an.m3355c(anVar);
        return an;
    }

    /* renamed from: ao */
    public boolean m2241ao() {
        return m2240ap() == null;
    }

    /* renamed from: ap */
    public C0270an m2240ap() {
        if (this.f3394f == 0) {
            return null;
        }
        return this.f3396g[0];
    }

    /* renamed from: aq */
    public C0270an m2239aq() {
        if (this.f3394f <= 1) {
            return null;
        }
        return this.f3396g[1];
    }

    /* renamed from: ar */
    public C0270an m2238ar() {
        if (this.f3394f == 0) {
            return null;
        }
        return this.f3396g[this.f3394f - 1];
    }

    /* renamed from: as */
    public void m2237as() {
        if (this.f3394f != 0) {
            if (this.f3394f == 1) {
                m2233aw();
            } else {
                this.f3394f--;
            }
        }
    }

    /* renamed from: k */
    public C0270an m2160k(int i) {
        return this.f3396g[i];
    }

    /* renamed from: at */
    public int m2236at() {
        return this.f3394f;
    }

    /* renamed from: au */
    public boolean m2235au() {
        C0270an ap = m2240ap();
        if (ap == null || ap.f1645a != EnumC0271ao.f1660b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m2300a(AbstractC0268al alVar, float f, float f2) {
        for (int i = 0; i < this.f3394f; i++) {
            C0270an anVar = this.f3396g[i];
            if (anVar.f1645a == EnumC0271ao.f1661c && anVar.f1646b == alVar && C0654f.m1461c(anVar.f1654e - f) < 10.0f && C0654f.m1461c(anVar.f1655f - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m2157l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        } else if (this.f3440al == f3439ak) {
            this.f3440al = new C0523y[120];
        }
    }

    /* renamed from: m */
    public void m2153m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        } else if (this.f3396g == f3395F) {
            this.f3396g = new C0270an[30];
        }
    }

    /* renamed from: n */
    public void m2150n(int i) {
        if (this.f3394f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f3394f + ", waypointIndex:" + i);
        } else if (i == 0) {
            m2233aw();
        } else {
            if (this.f3396g.length > 0) {
                C0270an anVar = this.f3396g[i];
                for (int i2 = i; i2 < this.f3394f - 1; i2++) {
                    this.f3396g[i2] = this.f3396g[i2 + 1];
                }
                this.f3396g[this.f3394f - 1] = anVar;
            }
            this.f3394f--;
        }
    }

    /* renamed from: av */
    public void m2234av() {
        m2282aA();
        m2233aw();
    }

    /* renamed from: aw */
    public void m2233aw() {
        this.f3404M = 0.0f;
        this.f3407P = 0.0f;
        this.f3405N = 0.0f;
        this.f3437ai = false;
        this.f3436ah = -999.0f;
        this.f3438aj = false;
        this.f3444v = 0;
        if (this.f3394f == 0) {
            m2278aE();
            this.f3393e = 0.0f;
            this.f3392d = 0.0f;
            this.f3391c = 0.0f;
        } else if (this.f3394f == 1) {
            this.f3394f = 0;
            m2278aE();
            this.f3393e = 0.0f;
            this.f3392d = 0.0f;
            this.f3391c = 0.0f;
        } else {
            if (this.f3396g.length > 0) {
                C0270an anVar = this.f3396g[0];
                for (int i = 0; i < this.f3394f - 1; i++) {
                    this.f3396g[i] = this.f3396g[i + 1];
                }
                this.f3396g[this.f3394f - 1] = anVar;
            }
            this.f3394f--;
            if (this.f3394f > 0) {
                m2219b(this.f3396g[0]);
            }
            m2278aE();
        }
    }

    /* renamed from: ax */
    public void m2232ax() {
        this.f3404M = 0.0f;
        this.f3407P = 0.0f;
        this.f3437ai = false;
        this.f3436ah = -999.0f;
        this.f3438aj = false;
        this.f3394f = 0;
        m2278aE();
        m2281aB();
        m2295a((AbstractC0515r) null);
        this.f3393e = 0.0f;
        this.f3392d = 0.0f;
        this.f3391c = 0.0f;
        this.f3444v = 0;
    }

    /* renamed from: ay */
    public void m2231ay() {
        for (int i = 0; i < this.f3394f; i++) {
            C0270an anVar = this.f3396g[i];
            if (!(anVar == null || anVar.f1645a == EnumC0271ao.f1661c || anVar.f1645a == EnumC0271ao.f1662d)) {
                m2150n(i);
            }
        }
    }

    /* renamed from: a */
    public void m2295a(AbstractC0515r rVar) {
        if (this.f3423U != null) {
            this.f3423U.f3426X--;
        }
        this.f3423U = rVar;
        if (rVar != null) {
            this.f3423U.f3426X++;
        }
    }

    /* renamed from: az */
    public void m2230az() {
        m2295a((AbstractC0515r) null);
        this.f3424V = false;
        this.f3429aa = false;
        this.f3430ab = 0.0f;
        this.f3431ac = 0.0f;
        this.f3422T = 0;
        this.f3391c = 0.0f;
    }

    /* renamed from: aA */
    public void m2282aA() {
        if (this.f3426X != 0) {
            C0270an aq = m2239aq();
            AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar = (AbstractC0515r) afVar;
                    if (rVar.f3423U == this) {
                        boolean z = C0654f.m1522a(this.f5841dH, this.f5842dI, rVar.f5841dH, rVar.f5842dI) < 108900.0f;
                        boolean z2 = false;
                        boolean z3 = false;
                        C0270an aq2 = rVar.m2239aq();
                        if (aq == null || aq2 == null) {
                            if (aq == null && aq2 == null) {
                                z3 = true;
                            }
                        } else if (aq.m3359b(aq2)) {
                            z2 = true;
                        }
                        if (z2 && z) {
                            rVar.m2233aw();
                        } else if (!z3) {
                            rVar.m2295a((AbstractC0515r) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: aB */
    public void m2281aB() {
        C0270an ap;
        C0536ab abVar;
        AbstractC0515r rVar = null;
        if (this.f3426X != 0) {
            AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                    if (rVar2.f3423U == this) {
                        rVar2.m2295a((AbstractC0515r) null);
                        rVar = rVar2;
                    }
                }
            }
            if (this.f3426X != 0) {
                this.f3426X = 0;
            }
            if (!(rVar == null || (ap = rVar.m2240ap()) == null || (abVar = ap.f1650i) == null)) {
                abVar.m2093c();
            }
        }
    }

    /* renamed from: aC */
    public C0523y m2280aC() {
        if (this.f3441am == 0) {
            return null;
        }
        return this.f3440al[0];
    }

    /* renamed from: a */
    public void m2311a(int i, float f, float f2) {
        m2157l(i);
        if (this.f3440al[i] == null) {
            this.f3440al[i] = new C0523y();
        }
        this.f3440al[i].f3527a = f;
        this.f3440al[i].f3528b = f2;
    }

    /* renamed from: aD */
    public boolean m2279aD() {
        if (this.f3441am < 2) {
            return false;
        }
        if (mo2358z() > 0.5d) {
            if (this.f3405N > 150.0f || this.f3406O > 150.0f) {
                return true;
            }
            return false;
        } else if (this.f3405N > 300.0f || this.f3406O > 300.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: aE */
    public void m2278aE() {
        this.f3441am = 0;
        this.f3442t = false;
        this.f3443u = 0;
        this.f3417r = 0.0f;
        this.f3405N = 0.0f;
        this.f3406O = 0.0f;
        this.f3415p = (byte) 0;
    }

    /* renamed from: aF */
    public void m2277aF() {
        m2278aE();
        this.f3440al = f3439ak;
        this.f3463ax = (byte) 0;
        this.f3464ay = null;
        this.f3465az = null;
    }

    /* renamed from: aG */
    public void m2276aG() {
        this.f3406O = this.f3405N;
        this.f3405N = 0.0f;
        if (this.f3441am != 0) {
            if (this.f3441am == 1) {
                this.f3441am = 0;
                return;
            }
            C0523y yVar = this.f3440al[0];
            for (int i = 0; i < this.f3441am - 1; i++) {
                this.f3440al[i] = this.f3440al[i + 1];
            }
            this.f3440al[this.f3441am - 1] = yVar;
            this.f3441am--;
        }
    }

    /* renamed from: aH */
    public boolean m2275aH() {
        AbstractC0789l u = AbstractC0789l.m638u();
        boolean z = false;
        if (mo2908cd()) {
            z = true;
        }
        u.f5474bt.m3818a(this.f5841dH, this.f5842dI);
        int i = u.f5474bt.f741M;
        int i2 = u.f5474bt.f742N;
        if (u.f5483bC.m958a(mo2364h(), i, i2) && !u.f5483bC.m945b(mo2364h(), i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m2323a(float f, float f2, int i, boolean z, boolean z2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0734h hVar = u.f5483bC;
        C0148b bVar = u.f5474bt;
        this.f1538cm = true;
        boolean z3 = false;
        boolean z4 = false;
        if (mo2908cd()) {
            z3 = true;
        }
        bVar.m3818a(this.f5841dH, this.f5842dI);
        int i2 = bVar.f741M;
        int i3 = bVar.f742N;
        if (hVar.m958a(mo2364h(), i2, i3) && !hVar.m945b(mo2364h(), i2, i3)) {
            z3 = true;
            z4 = true;
        }
        if (!(f == this.f3413n && this.f3414o == f2)) {
            this.f3415p = (byte) 0;
        }
        this.f3413n = f;
        this.f3414o = f2;
        if (z3) {
            this.f3442t = false;
            this.f3441am = 0;
            float a = bVar.m3819a(f);
            float b = bVar.m3786b(f2);
            if (z4) {
                float d = C0654f.m1448d(this.f5841dH, this.f5842dI, a, b);
                float b2 = C0654f.m1476b(this.f5841dH, this.f5842dI, a, b);
                if (b2 > 60.0f) {
                    b2 = 60.0f;
                    this.f3442t = true;
                    if (this.f3417r > 10.0f) {
                        this.f3417r = 10.0f;
                    }
                }
                a = this.f5841dH + (C0654f.m1423i(d) * b2);
                b = this.f5842dI + (C0654f.m1427h(d) * b2);
            }
            m2311a(this.f3441am, a, b);
            this.f3441am++;
            this.f3443u = this.f3441am;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (C0214aj.m3394a(mo2364h(), this.f5841dH, this.f5842dI, f, f2, 80, i4, 1)) {
            this.f3442t = false;
            this.f3441am = 0;
            float a2 = bVar.m3819a(f);
            float b3 = bVar.m3786b(f2);
            float f3 = this.f5841dH;
            float f4 = this.f5842dI;
            float d2 = C0654f.m1448d(this.f5841dH, this.f5842dI, a2, b3);
            float b4 = C0654f.m1476b(this.f5841dH, this.f5842dI, a2, b3);
            float i5 = C0654f.m1423i(d2);
            float h = C0654f.m1427h(d2);
            int i6 = (int) ((b4 * 0.05f) - 1.0f);
            int i7 = 1;
            if (i6 < 4) {
                i7 = 0;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    break;
                }
                f3 += i5 * 20.0f;
                f4 += h * 20.0f;
                if (i7 > 0) {
                    i7--;
                } else {
                    m2311a(this.f3441am, f3, f4);
                    this.f3441am++;
                    if (this.f3441am >= 119) {
                        this.f3442t = true;
                        break;
                    }
                }
                i8++;
            }
            if (!this.f3442t) {
                if (this.f3441am < 119) {
                    m2311a(this.f3441am, a2, b3);
                    this.f3441am++;
                } else {
                    this.f3442t = true;
                }
            }
            this.f3443u = this.f3441am;
            return;
        }
        C0536ab abVar = null;
        C0270an ap = m2240ap();
        if (ap != null) {
            abVar = ap.f1650i;
            if (abVar == null) {
            }
        }
        if (!(abVar == null || abVar.f3606g == null)) {
            C0598d dVar = null;
            Iterator it = abVar.f3606g.iterator();
            while (it.hasNext()) {
                C0598d dVar2 = (C0598d) it.next();
                if (dVar2.f4097a != null && dVar2.f4097a.m967c() != null && C0654f.m1461c(dVar2.f4101e - f) <= 10.0f && C0654f.m1461c(dVar2.f4102f - f2) <= 10.0f && dVar2.f4103g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= u.f5585bg && dVar2.f4104h == mo2364h() && C0654f.m1522a(this.f5841dH, this.f5842dI, dVar2.f4099c, dVar2.f4100d) < 3600.0f) {
                    dVar = dVar2;
                }
            }
            if (dVar != null) {
                this.f3474aI = dVar.f4097a;
                return;
            }
        }
        this.f3474aI = m2322a(f, f2, i, z, true, z2);
    }

    /* renamed from: a */
    public C0733g m2322a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0734h hVar = u.f5483bC;
        C0148b bVar = u.f5474bt;
        C0733g a = hVar.m949a(z2);
        bVar.m3818a(this.f5841dH, this.f5842dI);
        boolean z4 = false;
        if (m2260aW() || this.f1446bN) {
            z4 = true;
        }
        a.m973a(mo2364h(), (short) bVar.f741M, (short) bVar.f742N, Float.valueOf(this.f1444bL), z4);
        bVar.m3818a(f, f2);
        a.m969a((short) bVar.f741M, (short) bVar.f742N, (short) i);
        a.f5113l = z;
        a.f5114m = mo2566bc();
        a.f5115n = z3;
        boolean z5 = this.f1538cm;
        this.f1538cm = true;
        hVar.m952a(a, z2);
        this.f1538cm = z5;
        return a;
    }

    /* renamed from: b */
    void m2217b(AbstractC0789l lVar) {
        if (this.f3474aI != null) {
            C0148b bVar = lVar.f5474bt;
            LinkedList c = this.f3474aI.m967c();
            if (c != null) {
                C0733g gVar = this.f3474aI;
                this.f3441am = 0;
                this.f3442t = false;
                Iterator it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0738l lVar2 = (C0738l) it.next();
                    bVar.m3814a((int) lVar2.f5198a, (int) lVar2.f5199b);
                    m2311a(this.f3441am, bVar.f741M + bVar.f729m, bVar.f742N + bVar.f730n);
                    this.f3441am++;
                    if (this.f3441am >= 120) {
                        this.f3442t = true;
                        break;
                    }
                }
                if (this.f3441am == 1) {
                    this.f3415p = (byte) (this.f3415p + 1);
                }
                boolean z = false;
                if (c.size() != 0) {
                    bVar.m3818a(this.f3413n, this.f3414o);
                    if (!this.f3442t && ((C0738l) c.getLast()).f5198a == bVar.f741M && ((C0738l) c.getLast()).f5199b == bVar.f742N) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 != 0) {
                        if (this.f3441am == 0) {
                            this.f3441am++;
                        }
                        m2311a(this.f3441am - 1, this.f3413n, this.f3414o);
                    } else if (this.f3441am < 120) {
                        m2311a(this.f3441am, this.f3413n, this.f3414o);
                        this.f3441am++;
                    }
                }
                this.f3474aI = null;
                if (this.f3441am > 120) {
                    AbstractC0789l.m682b("activePathCount>maxPathNodes: activePathCount:" + this.f3441am);
                    this.f3441am = 120;
                }
                this.f3443u = this.f3441am;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [long] */
    /* renamed from: aI */
    public long m2274aI() {
        C0523y yVar;
        char c = 0;
        for (int i = 0; i < this.f3441am; i++) {
            if (this.f3440al[i] != null) {
                c = c + Float.floatToRawIntBits(yVar.f3527a) + Float.floatToRawIntBits(yVar.f3528b);
            }
        }
        return c;
    }

    /* renamed from: o */
    C0523y m2148o(int i) {
        if (i >= this.f3441am) {
            return null;
        }
        return this.f3440al[i];
    }

    /* renamed from: d */
    public void mo395d(float f) {
        super.mo395d(f);
    }

    /* renamed from: aJ */
    public float mo2965aJ() {
        return 1.0f;
    }

    /* renamed from: l */
    public int m2158l(float f) {
        if (f >= -0.3f) {
            return 255;
        }
        int i = (int) (((1.0f - ((-f) / 10.0f)) * 130.0f) + 45.0f);
        if (i < 45) {
            i = 45;
        }
        return i;
    }

    /* renamed from: aK */
    public Paint mo2964aK() {
        int i;
        AbstractC0789l u = AbstractC0789l.m638u();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f5843dJ < -0.3f) {
            i = Color.m4332a(m2158l(this.f5843dJ), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.f1529bR < 1.0f && this.f1529bR < mo2965aJ()) {
            i = Color.m4332a((int) (20.0f + ((this.f1529bR / mo2965aJ()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = f3476aK;
        }
        if (this.f1531bT) {
            if (this.f1534bW) {
                i = Color.m4332a(200, 20, 255, 20);
                porterDuffColorFilter = f3477aL;
            }
            if (this.f1535bX) {
                i = Color.m4332a(200, 255, 20, 20);
                porterDuffColorFilter = f3478aM;
            }
            if (this.f1532bU) {
                i = Color.m4332a(50, 70, 70, 245);
                porterDuffColorFilter = f3479aN;
                if (this.f1535bX) {
                    i = Color.m4332a(50, 255, 20, 20);
                    porterDuffColorFilter = f3478aM;
                }
            }
            if (this.f1533bV) {
                i = Color.m4332a(150, 100, 100, 100);
            }
        }
        boolean z = u.f5479by.renderAntiAlias;
        if (!mo2914cS()) {
            z = false;
            if (u.f5602cE < 1.0f) {
                z = true;
            }
        }
        if (this.f1530bS) {
            z = EnumC0215ak.f1641af;
        }
        return m2310a(i, porterDuffColorFilter, z);
    }

    /* renamed from: p */
    public float mo2877p(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0755l lVar = u.f5477bw;
        Paint aK = mo2964aK();
        float cn = mo2903cn();
        if (this.f3756dP) {
            PointF cG = mo2920cG();
            float f2 = (this.f5841dH + cG.f224a) - u.f5508cd;
            float f3 = ((this.f5842dI + cG.f225b) - u.f5509ce) - this.f5843dJ;
            mo3336aM();
            if (cn != 1.0f) {
                lVar.mo125j();
                lVar.mo198a(cn, cn, f2, f3);
            }
            lVar.mo176a(this.f3387D, f2, f3, mo2553f(false) - 90.0f, aK);
            if (cn == 1.0f) {
                return true;
            }
            lVar.mo124k();
            return true;
        }
        PointF cG2 = mo2920cG();
        RectF cp = mo2694cp();
        cp.m4242a(cG2.f224a, cG2.f225b - this.f5843dJ);
        Rect a_ = mo2520a_(false);
        float d = cp.m4230d();
        float e = cp.m4229e();
        lVar.mo125j();
        mo3336aM();
        if (cn != 1.0f) {
            lVar.mo198a(cn, cn, d, e);
        }
        lVar.mo199a(mo2553f(false), d, e);
        lVar.mo169a(this.f3387D, a_, cp, aK);
        lVar.mo124k();
        return true;
    }

    /* renamed from: F */
    public boolean mo2383F() {
        return this.f5843dJ > 0.0f && this.f1529bR >= 1.0f && !this.f1532bU;
    }

    /* renamed from: aL */
    public PointF mo2963aL() {
        f3483aR.m4260a(mo2382G(), mo2381H());
        return f3483aR;
    }

    /* renamed from: G */
    public float mo2382G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo2381H() {
        return 0.0f;
    }

    /* renamed from: aM */
    public boolean mo3336aM() {
        if (this.f3388E == null || !mo2383F()) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!u.f5606cL && this.f1447bO < 18.0f && this.f5843dJ < 0.5d) {
            return true;
        }
        if (!u.f5607cM && this.f1447bO < 28.0f && this.f5843dJ < 5.0f) {
            return true;
        }
        PointF aL = mo2963aL();
        float f = (this.f5841dH + aL.f224a) - u.f5508cd;
        float f2 = (this.f5842dI + aL.f225b) - u.f5509ce;
        float cn = mo2903cn();
        AbstractC0755l lVar = u.f5477bw;
        if (cn != 1.0f) {
            lVar.mo125j();
            lVar.mo198a(cn, cn, f, f2);
        }
        if (mo2902cq()) {
            Rect a_ = mo2520a_(true);
            RectF rectF = f1505dd;
            rectF.m4241a(f - this.f3754dN, f2 - this.f3755dO, f + this.f3754dN, f2 + this.f3755dO);
            lVar.mo125j();
            lVar.mo199a(mo2553f(true), f, f2);
            lVar.mo169a(this.f3388E, a_, rectF, f3452au);
            lVar.mo124k();
        } else {
            lVar.mo176a(this.f3388E, f, f2, mo2553f(true) - 90.0f, f3452au);
        }
        if (cn == 1.0f) {
            return true;
        }
        lVar.mo124k();
        return true;
    }

    /* renamed from: j */
    public boolean mo2586j() {
        return RectF.m4238a(AbstractC0789l.m638u().f5595ct, m3415co());
    }

    /* renamed from: aN */
    public boolean mo2962aN() {
        C0336i cV = m3419cV();
        if (cV == null || cV.f2283O) {
            return mo2380I();
        }
        return false;
    }

    /* renamed from: aO */
    public boolean mo2961aO() {
        return mo2962aN();
    }

    /* renamed from: x */
    public boolean mo2462x() {
        return true;
    }

    /* renamed from: aP */
    public int mo2960aP() {
        return -1;
    }

    /* renamed from: l */
    public float m2156l(AbstractC0210af afVar) {
        if (!mo2958aR() || afVar == null) {
            return mo2360m();
        }
        return mo2360m() + this.f1447bO + afVar.f1447bO;
    }

    /* renamed from: m */
    public float m2152m(AbstractC0210af afVar) {
        if (!mo2958aR() || afVar == null) {
            return mo2959aQ();
        }
        return mo2959aQ() + this.f1447bO + afVar.f1447bO;
    }

    /* renamed from: aQ */
    public float mo2959aQ() {
        return mo2360m();
    }

    /* renamed from: n */
    public int m2149n(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = 0;
        float m = m2152m(afVar);
        if (m > 58.0f) {
            i = (int) ((m - 41.0f) / (u.f5474bt.f727k * 1.414f));
        }
        return i;
    }

    /* renamed from: aR */
    public boolean mo2958aR() {
        return false;
    }

    /* renamed from: q */
    public float mo2412q(int i) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[SYNTHETIC] */
    /* renamed from: aS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m2264aS() {
        ArrayList arrayList = new ArrayList();
        if (mo2361l()) {
            int bg = mo2436bg();
            for (int i = 0; i < bg; i++) {
                float q = mo2412q(i);
                if (q != 0.0f) {
                    float b = mo2374b(i);
                    if (b == 9000.0f) {
                        b = 0.0f;
                    }
                    boolean z = false;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0518t tVar = (C0518t) it.next();
                        if (tVar.f3498a == q && (tVar.f3499b == b || b == 0.0f || tVar.f3499b == 0.0f)) {
                            tVar.f3501d++;
                            if (tVar.f3499b == 0.0f) {
                                tVar.f3499b = b;
                            }
                            z = true;
                            if (z) {
                                C0518t tVar2 = new C0518t();
                                tVar2.f3498a = q;
                                tVar2.f3499b = b;
                                tVar2.f3500c = mo2367e(i);
                                arrayList.add(tVar2);
                            }
                        }
                    }
                    if (z) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    public boolean mo2762r(int i) {
        return true;
    }

    /* renamed from: e */
    public float mo2367e(int i) {
        return 0.0f;
    }

    /* renamed from: s */
    public boolean mo2874s(int i) {
        return false;
    }

    /* renamed from: t */
    public float mo2873t(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo2366f(int i) {
        return 4.0f;
    }

    /* renamed from: u */
    public boolean mo2761u(int i) {
        int v = mo2760v(i);
        if (v == -1) {
            return this.f1462cn[i].f1567g;
        }
        return this.f1462cn[v].f1567g;
    }

    /* renamed from: v */
    public int mo2760v(int i) {
        return -1;
    }

    /* renamed from: B */
    public float mo2387B() {
        return -1.0f;
    }

    /* renamed from: w */
    public float mo2411w(int i) {
        return -1.0f;
    }

    /* renamed from: x */
    public float mo2870x(int i) {
        return 5.0f;
    }

    /* renamed from: y */
    public float mo2868y(int i) {
        return mo2411w(i);
    }

    /* renamed from: E */
    public boolean mo2384E() {
        return false;
    }

    /* renamed from: aT */
    public boolean m2263aT() {
        return false;
    }

    /* renamed from: aU */
    public float mo2957aU() {
        return 1.0f;
    }

    /* renamed from: aV */
    public float mo2956aV() {
        return 1.0f;
    }

    /* renamed from: aW */
    public boolean m2260aW() {
        return mo2424aX() > 0.95f;
    }

    /* renamed from: aX */
    public float mo2424aX() {
        return 0.6f;
    }

    /* renamed from: aY */
    public float mo2628aY() {
        return 0.0f;
    }

    /* renamed from: aZ */
    public EnumC0272b mo2955aZ() {
        return EnumC0272b.f1677a;
    }

    /* renamed from: ba */
    public boolean mo2932ba() {
        return true;
    }

    /* renamed from: bb */
    public boolean mo2931bb() {
        return true;
    }

    /* renamed from: bc */
    public int mo2566bc() {
        return 0;
    }

    /* renamed from: C */
    public float mo2386C() {
        return 99.0f;
    }

    /* renamed from: D */
    public float mo2385D() {
        return 99.0f;
    }

    /* renamed from: bd */
    public boolean mo2556bd() {
        return false;
    }

    /* renamed from: be */
    public boolean mo2555be() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2617b(int i, float f) {
        return true;
    }

    /* renamed from: bf */
    public boolean m2209bf() {
        return false;
    }

    /* renamed from: bg */
    public int mo2436bg() {
        return 1;
    }

    /* renamed from: bh */
    public boolean mo2930bh() {
        return true;
    }

    /* renamed from: g */
    public float mo2365g(int i) {
        return 0.0f;
    }

    /* renamed from: z */
    public float mo2866z(int i) {
        return 99999.0f;
    }

    /* renamed from: A */
    public float mo2999A(int i) {
        return -1.0f;
    }

    /* renamed from: B */
    public float mo2997B(int i) {
        return 0.0f;
    }

    /* renamed from: C */
    public float mo2447C(int i) {
        if (!this.f1446bN || !m2260aW()) {
            return this.f1444bL;
        }
        return this.f1444bL + 180.0f;
    }

    /* renamed from: bi */
    public C0814ag m2206bi() {
        int aP = mo2960aP();
        if (aP == -1) {
            return mo2994D(0);
        }
        return mo2994D(aP);
    }

    /* renamed from: D */
    public C0814ag mo2994D(int i) {
        f3484aS.m528a(mo2425E(i));
        return f3484aS;
    }

    /* renamed from: E */
    public PointF mo2425E(int i) {
        C0213ai aiVar = this.f1462cn[i];
        float g = mo2365g(i);
        float f = mo2384E() ? this.f1444bL : aiVar.f1561a;
        PointF F = mo2441F(i);
        f3485aT.m4260a(F.f224a + (C0654f.m1423i(f) * g), F.f225b + (C0654f.m1427h(f) * g));
        return f3485aT;
    }

    /* renamed from: F */
    public PointF mo2441F(int i) {
        C0213ai aiVar = this.f1462cn[i];
        float f = this.f5841dH;
        float f2 = this.f5842dI;
        float G = mo2446G(i);
        if (!(aiVar.f1565e == 0.0f || G == 0.0f)) {
            float H = mo2445H(i);
            float I = mo2444I(i);
            float f3 = 0.0f;
            float b = mo2374b(i) - aiVar.f1565e;
            if (b < H) {
                f3 = (b / H) * G;
            } else if (b < I + H) {
                f3 = G - (((b - H) / I) * G);
            }
            if (f3 != 0.0f) {
                f += C0654f.m1423i(aiVar.f1561a) * f3;
                f2 += C0654f.m1427h(aiVar.f1561a) * f3;
            }
        }
        f3486aU.m4260a(f, f2);
        return f3486aU;
    }

    /* renamed from: G */
    public float mo2446G(int i) {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo2445H(int i) {
        return 4.0f;
    }

    /* renamed from: I */
    public float mo2444I(int i) {
        return 6.0f;
    }

    /* renamed from: J */
    public PointF mo2574J(int i) {
        PointF pointF = f3487aV;
        pointF.m4260a(0.0f, 0.0f);
        C0213ai aiVar = this.f1462cn[i];
        pointF.f224a += aiVar.f1568h;
        pointF.f225b += aiVar.f1569i;
        return pointF;
    }

    /* renamed from: K */
    public float mo2573K(int i) {
        return 0.6f;
    }

    /* renamed from: L */
    public void mo2757L(int i) {
        if (i == -1) {
            int bg = mo2436bg();
            for (int i2 = 0; i2 < bg; i2++) {
                mo2757L(i2);
            }
            return;
        }
        C0213ai aiVar = this.f1462cn[i];
        aiVar.f1568h = 0.0f;
        aiVar.f1569i = 0.0f;
        if (!(this.f3399I == null || mo2573K(i) == 0.0f)) {
            float K = this.f3399I.f1447bO * mo2573K(i);
            aiVar.f1568h += C0654f.m1501a((AbstractC0854w) this, (int) (-K), (int) K, 1 + i);
            aiVar.f1569i += C0654f.m1501a((AbstractC0854w) this, (int) (-K), (int) K, 2 + i);
        }
    }

    /* renamed from: a */
    public void m2291a(EnumC0519u uVar) {
        m2290a(uVar, true);
    }

    /* renamed from: a */
    public void m2290a(EnumC0519u uVar, boolean z) {
        C0573e d;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (uVar == EnumC0519u.f3509h) {
            u.f5475bu.m2118a(C0530e.f3577o, 0.8f, this.f5841dH, this.f5842dI);
            u.f5480bz.m2018a(this.f5841dH, this.f5842dI, this.f5843dJ);
            u.f5480bz.m1991b(EnumC0576h.f3943e);
            C0573e c = u.f5480bz.m1988c(this.f5841dH, this.f5842dI, this.f5843dJ, -1127220);
            if (c != null) {
                c.f3844H = 0.2f;
                c.f3843G = 2.0f;
                c.f3899aq = (short) 2;
                c.f3859W = 45.0f;
                c.f3860X = c.f3859W;
                c.f3858V = 0.0f;
            }
        } else if (uVar == EnumC0519u.f3505d || uVar == EnumC0519u.f3507f || uVar == EnumC0519u.f3508g) {
            u.f5475bu.m2118a(C0530e.f3577o, 0.8f, this.f5841dH, this.f5842dI);
            u.f5480bz.m2018a(this.f5841dH, this.f5842dI, this.f5843dJ);
        } else if (uVar == EnumC0519u.f3502a) {
            u.f5475bu.m2117a(C0530e.f3576n, 0.4f, 1.0f + C0654f.m1460c(-0.07f, 0.07f), this.f5841dH, this.f5842dI);
            u.f5480bz.m1997b(this.f5841dH, this.f5842dI, this.f5843dJ);
        } else if (uVar == EnumC0519u.f3506e) {
            u.f5475bu.m2117a(C0530e.f3576n, 0.8f, 1.0f + C0654f.m1460c(-0.07f, 0.07f), this.f5841dH, this.f5842dI);
            u.f5480bz.m1997b(this.f5841dH, this.f5842dI, this.f5843dJ);
            u.f5480bz.m1991b(EnumC0576h.f3943e);
            C0573e c2 = u.f5480bz.m1988c(this.f5841dH, this.f5842dI, this.f5843dJ, -1127220);
            if (c2 != null) {
                c2.f3844H = 0.2f;
                c2.f3843G = 2.0f;
                c2.f3899aq = (short) 2;
                c2.f3859W = 45.0f;
                c2.f3860X = c2.f3859W;
                c2.f3858V = 0.0f;
            }
        } else {
            u.f5475bu.m2117a(C0530e.f3576n, 0.8f, 1.0f + C0654f.m1460c(-0.07f, 0.07f), this.f5841dH, this.f5842dI);
            u.f5480bz.m1997b(this.f5841dH, this.f5842dI, this.f5843dJ);
        }
        if (uVar != EnumC0519u.f3502a) {
            if (!(uVar == EnumC0519u.f3508g || (d = u.f5480bz.m1986d(this.f5841dH, this.f5842dI, this.f5843dJ, 0)) == null)) {
                d.f3842F = 0.9f;
            }
            if (z) {
                if (!mo2940bC()) {
                    m2205bj();
                }
                if (uVar != EnumC0519u.f3508g && !m3411cu()) {
                    C0574f.m1976a(this.f5841dH, this.f5842dI);
                    C0574f.m1972b(this.f5841dH, this.f5842dI);
                    mo2929bl();
                }
            }
        }
    }

    /* renamed from: bj */
    public void m2205bj() {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f = 1.0f;
        float f2 = 1.0f;
        int bk = mo2615bk();
        if (bk >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (bk >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.f5843dJ > -1.0f) {
            for (int i = 0; i < bk; i++) {
                u.f5480bz.m1995b(this.f5841dH, this.f5842dI, this.f5843dJ, f, f2);
            }
        }
    }

    /* renamed from: bk */
    public int mo2615bk() {
        if (mo2564cL()) {
            return 8;
        }
        if (mo2700bw()) {
            return 7;
        }
        return 4;
    }

    /* renamed from: bl */
    public void mo2929bl() {
        if (!m3411cu()) {
            C0169k.m3653a(this.f5841dH, this.f5842dI);
        }
    }

    /* renamed from: s */
    public int mo2389s() {
        return 15;
    }

    /* renamed from: c */
    public void mo2926c(boolean z) {
        int s;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1539cp == null && this.f1540cq == null && (s = mo2389s()) > 0) {
            u.f5474bt.m3817a(this.f5841dH, this.f5842dI, s, this.f1441bB, z);
        }
    }

    /* renamed from: bm */
    public void m2202bm() {
        AbstractC0789l u = AbstractC0789l.m638u();
        RectF rectF = new RectF();
        rectF.m4240a(mo2701bP());
        rectF.f232b *= u.f5474bt.f728l;
        rectF.f234d *= u.f5474bt.f728l;
        rectF.f231a *= u.f5474bt.f727k;
        rectF.f233c *= u.f5474bt.f727k;
        rectF.m4242a(this.f5841dH, this.f5842dI);
        rectF.m4242a(-mo2625cH(), -mo2624cI());
        rectF.f232b -= 10.0f;
        rectF.f234d += 10.0f;
        rectF.f231a -= 10.0f;
        rectF.f233c += 10.0f;
        Iterator it = AbstractC0210af.m3430bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if ((afVar instanceof AbstractC0210af) && afVar != this && afVar.m3452a(rectF)) {
                if ((afVar instanceof AbstractC0515r) && afVar.f1520bz) {
                    afVar.mo405a();
                }
                if (afVar instanceof C0209ae) {
                    ((C0209ae) afVar).m3459f();
                }
            }
        }
    }

    /* renamed from: bn */
    public boolean mo2687bn() {
        return m2182e(false) == null;
    }

    /* renamed from: d */
    public boolean m2186d(boolean z) {
        return m2182e(z) == null;
    }

    /* renamed from: e */
    public String m2182e(boolean z) {
        String a;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0314aj q = mo1608r().mo2800q();
        if (!(q == null || (a = q.m3207a(this, this.f5841dH, this.f5842dI)) == null)) {
            return a;
        }
        if (mo1608r().mo2801p()) {
            u.f5474bt.m3818a(this.f5841dH, this.f5842dI);
            C0155g e = u.f5474bt.m3766e(u.f5474bt.f741M, u.f5474bt.f742N);
            if (e == null || !e.f857i) {
                return "{2}";
            }
        }
        if (!z && m2145p((AbstractC0210af) null)) {
            return "{0}";
        }
        if (mo1608r().mo2801p()) {
            return null;
        }
        Rect bP = mo2701bP();
        Point a2 = m3451a(u.f5474bt, f3488aW);
        int i = a2.f221a;
        int i2 = a2.f222b;
        AbstractC0268al r = mo1608r();
        EnumC0212ah o = r.mo2803o();
        for (int i3 = i + bP.f227a; i3 <= i + bP.f229c; i3++) {
            for (int i4 = i2 + bP.f228b; i4 <= i2 + bP.f230d; i4++) {
                String b = AbstractC0403c.m2703b(this, r, o, i3, i4, false);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: M */
    public void m2336M(int i) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!mo1608r().mo2801p()) {
            Rect bP = mo2701bP();
            Point a = m3451a(u.f5474bt, f3489aX);
            int i2 = a.f221a;
            int i3 = a.f222b;
            mo1608r();
            int i4 = i2 + bP.f227a;
            int i5 = i3 + bP.f228b;
            int i6 = i2 + bP.f229c;
            int i7 = i3 + bP.f230d;
            if (i != -2) {
                u.f5474bt.m3802a(this, i4, i5, i6, i7, (int) u.f5508cd, (int) u.f5509ce, u.f5477bw, true, i);
            }
        }
    }

    /* renamed from: o */
    public boolean m2147o(AbstractC0210af afVar) {
        float a = C0654f.m1522a(this.f5841dH, this.f5842dI, afVar.f5841dH, afVar.f5842dI);
        float f = 9.0f;
        if (!afVar.mo2700bw()) {
            f = this.f1447bO + afVar.f1447bO;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m2145p(AbstractC0210af afVar) {
        boolean z = false;
        if (!mo2700bw()) {
            z = true;
        }
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar2 = a[i];
            if (afVar2 != this && ((z || afVar2.mo2700bw()) && !afVar2.f1520bz && m2147o(afVar2) && afVar2 != afVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bo */
    public AbstractC0515r m2200bo() {
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar != this && (afVar instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (!rVar.f1520bz && rVar.f1441bB == this.f1441bB && rVar.mo1608r() == mo1608r() && m3401r(rVar)) {
                    return rVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo405a() {
        if (this.f1540cq != null) {
            m2196bs();
        }
        m2232ax();
        m2277aF();
        super.mo405a();
    }

    /* renamed from: bp */
    public void mo2928bp() {
        if (this.f1540cq != null) {
            m2196bs();
        }
        m2295a((AbstractC0515r) null);
        this.f3399I = null;
        m2232ax();
        m2277aF();
        super.mo2928bp();
    }

    /* renamed from: bq */
    public void mo2673bq() {
        super.mo2673bq();
    }

    /* renamed from: br */
    public int mo3431br() {
        return (((((((((((0 * 31) + super.mo3431br()) * 31) + ((int) (mo2358z() * 100.0f))) * 31) + ((int) (mo2388A() * 100.0f))) * 31) + ((int) (mo2360m() * 100.0f))) * 31) + ((int) mo2374b(0))) * 31) + ((int) (mo2386C() * 100.0f));
    }

    /* renamed from: m */
    PointF mo3404m(float f) {
        PointF n = m2151n(f);
        f1508dg.m4260a(this.f5841dH + n.f224a, this.f5842dI + n.f225b);
        return f1508dg;
    }

    /* renamed from: n */
    public PointF m2151n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (mo2380I() && this.f3390b == 0.0f) {
            if (mo2556bd()) {
                f2 = this.f1525bH * f;
                f3 = this.f1526bI * f;
            } else if (this.f1528bK != 0.0f) {
                float f4 = this.f1444bL;
                if (mo2555be()) {
                    f4 = this.f1445bM;
                }
                float z = mo2358z() * this.f1528bK * f;
                f2 = C0654f.m1423i(f4) * z;
                f3 = C0654f.m1427h(f4) * z;
            }
        }
        f3490aY.m4260a(f2, f3);
        return f3490aY;
    }

    /* renamed from: a */
    public boolean mo2967a(EnumC0524z zVar) {
        return false;
    }

    /* renamed from: a */
    public void mo2984a(AbstractC0197s sVar) {
    }

    /* renamed from: a */
    public boolean mo2983a(AbstractC0197s sVar, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public void mo2980a(AbstractC0210af afVar, float f, int i) {
        this.f3402L = C0654f.m1524a(this.f3402L, f);
        if (this.f3402L == 0.0f) {
            this.f3402L = 5.0f;
            if (mo2586j()) {
                C0814ag bi = m2206bi();
                C0573e b = AbstractC0789l.m638u().f5480bz.m1992b(bi.f5735a, bi.f5736b, this.f5843dJ + bi.f5737c, EnumC0572d.f3816a, false, EnumC0576h.f3940b);
                if (b != null) {
                    float d = C0654f.m1448d(bi.f5735a, bi.f5736b, (float) (afVar.f5841dH + (-8.0d) + (Math.random() * 16.0d)), (float) (afVar.f5842dI + (-8.0d) + (Math.random() * 16.0d)));
                    b.f3853Q = C0654f.m1423i(d) * C0654f.m1460c(2.0f, 4.0f);
                    b.f3854R = C0654f.m1427h(d) * C0654f.m1460c(2.0f, 4.0f);
                    b.f3875ao = 6;
                    b.f3859W = 20.0f;
                    b.f3860X = b.f3859W;
                    b.f3834s = true;
                    b.f3842F = 0.8f;
                    b.f3844H = 0.2f;
                    b.f3843G = 1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2947b(AbstractC0210af afVar, float f, int i) {
        this.f3402L = C0654f.m1524a(this.f3402L, f);
        if (this.f3402L == 0.0f) {
            this.f3402L = 5.0f;
            if (mo2586j()) {
                PointF E = mo2425E(0);
                C0573e b = AbstractC0789l.m638u().f5480bz.m1992b(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, false, EnumC0576h.f3940b);
                if (b != null) {
                    float d = C0654f.m1448d(afVar.f5841dH, afVar.f5842dI - afVar.f5843dJ, (float) (E.f224a + (-8.0d) + (Math.random() * 16.0d)), (float) (E.f225b + (-8.0d) + (Math.random() * 16.0d)));
                    b.f3853Q = C0654f.m1423i(d) * C0654f.m1460c(2.0f, 4.0f);
                    b.f3854R = C0654f.m1427h(d) * C0654f.m1460c(2.0f, 4.0f);
                    b.f3875ao = 5;
                    b.f3859W = 20.0f;
                    b.f3860X = b.f3859W;
                    b.f3834s = true;
                    b.f3842F = 0.8f;
                    b.f3844H = 0.2f;
                    b.f3843G = 1.0f;
                }
            }
        }
    }

    /* renamed from: a */
    public C0517s m2296a(C0270an anVar, AbstractC0268al alVar, int i, float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0197s a = m2299a(alVar, i, false);
        if (a == null) {
            AbstractC0789l.m682b("Unit '" + mo1608r().mo2815i() + "' can not build:" + alVar.mo2815i());
            return f3491aZ.m2131a();
        }
        if (!anVar.f1653n) {
            if (a.mo3279h(this)) {
                AbstractC0789l.m682b("Builder '" + mo1608r().mo2815i() + "' tried to build a locked building:" + a.m3501K());
                return f3491aZ.m2131a();
            } else if (!a.mo2405a((AbstractC0210af) this)) {
                AbstractC0789l.m682b("Builder '" + mo1608r().mo2815i() + "' tried to build a unavailable building:" + a.m3501K());
                return f3491aZ.m2131a();
            }
        }
        if (!alVar.mo2811k() && !a.mo3488u() && this.f1441bB.m3546s() >= this.f1441bB.m3545t()) {
            if (this.f1441bB == u.f5464bb) {
                u.f5481bA.m1713a(u.f5481bA.f4279d.f4143an);
            }
            return f3491aZ.m2131a();
        } else if (AbstractC0210af.m3447a(alVar) == null) {
            String str = "{build is null}";
            if (anVar.f1646b != null) {
                str = anVar.f1646b.mo2815i();
            }
            AbstractC0789l.m670d("Build unit type missing: " + str);
            return f3491aZ.m2131a();
        } else {
            AbstractC0210af g = AbstractC0403c.m2698g(alVar);
            g.f1529bR = 0.0f;
            u.f5474bt.m3785b((f - g.mo2625cH()) + 1.0f, (f2 - g.mo2624cI()) + 1.0f);
            g.f5841dH = u.f5474bt.f741M + g.mo2625cH();
            g.f5842dI = u.f5474bt.f742N + g.mo2624cI();
            g.mo2897d(this.f1441bB);
            g.mo2900cx();
            if (i != 1 && (g instanceof AbstractC0515r)) {
                ((AbstractC0515r) g).mo2512a(i);
            }
            g.mo2899cy();
            if (g instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) g;
                boolean z = false;
                AbstractC0515r rVar2 = null;
                if (mo2950aj()) {
                    rVar2 = this;
                } else if (!this.f1519by && !mo2700bw()) {
                    rVar2 = this;
                }
                if (rVar.m2145p(rVar2)) {
                    z = true;
                }
                if (!z && !rVar.m2186d(true)) {
                    z = true;
                }
                if (z) {
                    g.mo405a();
                    C0517s a2 = f3491aZ.m2131a();
                    AbstractC0515r bo = ((AbstractC0515r) g).m2200bo();
                    a2.f3495b = bo;
                    a2.f3497d = a;
                    if (bo == null) {
                    }
                    return a2;
                }
            }
            C0363g y = a.mo3264y();
            if (anVar.f1653n) {
                y = C0363g.f2422a;
            }
            if (!y.m3048a(this)) {
                g.mo405a();
                C0517s a3 = f3491aZ.m2131a();
                this.f3398H = u.f5467bh;
                if (this.f3404M < 1000.0f) {
                    a3.f3496c = true;
                    C0569a a4 = C0569a.m2034a(this.f1441bB, g.f5841dH, g.f5842dI);
                    if (a4 != null) {
                        a4.f3767i = true;
                    }
                }
                return a3;
            }
            mo2880j(g);
            if (g instanceof AbstractC0515r) {
                AbstractC0515r rVar3 = (AbstractC0515r) g;
                rVar3.m2202bm();
                if (g.mo2700bw()) {
                    u.f5483bC.m957a(rVar3);
                }
            }
            AbstractC0171m.m3588c(g);
            C0517s a5 = f3491aZ.m2131a();
            a5.f3494a = g;
            a5.f3497d = a;
            return a5;
        }
    }

    /* renamed from: a */
    public boolean mo2968a(AbstractC0515r rVar, C0336i iVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo2941b(AbstractC0515r rVar) {
        return false;
    }

    /* renamed from: bs */
    public void m2196bs() {
        if (this.f1540cq != null) {
            if (this.f1540cq.f1520bz) {
            }
            if (!this.f1540cq.mo2941b(this)) {
                AbstractC0789l.m682b("Deattach failed, forcing deattach. Child:" + m3417cl() + " Parent:" + this.f1540cq.m3417cl());
                this.f1540cq = null;
                this.f1541cr = null;
            }
        }
    }

    /* renamed from: a */
    public C0336i mo2966a(short s) {
        return null;
    }

    /* renamed from: a */
    public static AbstractC0210af m2294a(AbstractC0515r rVar, float f, float f2, float f3, C0365i iVar) {
        if (f3 <= 0.0f) {
            return null;
        }
        f3492ba.f3516f = true;
        f3492ba.f3517g = false;
        f3492ba.f3515e = null;
        f3492ba.f3514d = f3 * f3;
        f3492ba.f3513c = iVar;
        f3492ba.f3511a = f;
        f3492ba.f3512b = f2;
        AbstractC0789l.m638u().f5491bK.m2502a(f, f2, f3, rVar, 0.0f, f3492ba);
        return f3492ba.f3515e;
    }
}
