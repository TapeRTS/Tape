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
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.AbstractC0163h;
import com.corrodinggames.rts.game.p010a.C0164i;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0545j;
import com.corrodinggames.rts.game.units.p028g.C0552c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.C0740d;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p042j.C0911p;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.game.units.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y.class */
public abstract class AbstractC0623y extends AbstractC0318c {

    /* renamed from: L */
    protected BitmapOrTexture image;

    /* renamed from: M */
    protected BitmapOrTexture shadowImage;

    /* renamed from: a */
    private int f3882a;

    /* renamed from: b */
    private float f3883b;

    /* renamed from: c */
    private float f3884c;

    /* renamed from: d */
    private float f3885d;

    /* renamed from: e */
    private float f3886e;

    /* renamed from: f */
    private int f3887f;

    /* renamed from: g */
    private C0305au[] f3888g;

    /* renamed from: O */
    public EnumC0205a f3889O;

    /* renamed from: P */
    int f3890P;

    /* renamed from: Q */
    public Unit f3891Q;

    /* renamed from: R */
    public float f3892R;

    /* renamed from: S */
    public float f3893S;

    /* renamed from: T */
    public float f3894T;

    /* renamed from: h */
    private boolean f3895h;

    /* renamed from: i */
    private int f3896i;

    /* renamed from: U */
    public float f3897U;

    /* renamed from: V */
    public float f3898V;

    /* renamed from: W */
    public float f3899W;

    /* renamed from: X */
    public float f3900X;

    /* renamed from: j */
    private boolean f3901j;

    /* renamed from: k */
    private boolean f3902k;

    /* renamed from: l */
    private float f3903l;

    /* renamed from: m */
    private float f3904m;

    /* renamed from: n */
    private int f3905n;

    /* renamed from: o */
    private float f3906o;

    /* renamed from: p */
    private float f3907p;

    /* renamed from: q */
    private byte f3908q;

    /* renamed from: r */
    private int f3909r;

    /* renamed from: s */
    private float f3910s;

    /* renamed from: t */
    private boolean f3911t;

    /* renamed from: Y */
    public Unit f3912Y;

    /* renamed from: Z */
    public int f3913Z;

    /* renamed from: aa */
    public float f3914aa;

    /* renamed from: ab */
    public int f3915ab;

    /* renamed from: ac */
    public AbstractC0623y f3916ac;

    /* renamed from: ad */
    public boolean f3917ad;

    /* renamed from: ae */
    public boolean f3918ae;

    /* renamed from: af */
    public int f3919af;

    /* renamed from: ag */
    public short f3920ag;

    /* renamed from: ah */
    public float f3921ah;

    /* renamed from: ai */
    public boolean f3922ai;

    /* renamed from: aj */
    public float f3923aj;

    /* renamed from: ak */
    public float f3924ak;

    /* renamed from: al */
    public float f3925al;

    /* renamed from: am */
    public int f3926am;

    /* renamed from: an */
    public float f3927an;

    /* renamed from: ao */
    public boolean f3928ao;

    /* renamed from: ap */
    public float f3929ap;

    /* renamed from: aq */
    public boolean f3930aq;

    /* renamed from: ar */
    public boolean f3931ar;

    /* renamed from: at */
    public AbstractC0898c f3932at;

    /* renamed from: au */
    protected C0237af[] f3933au;

    /* renamed from: av */
    protected int f3934av;

    /* renamed from: u */
    private boolean f3935u;

    /* renamed from: v */
    private int f3936v;

    /* renamed from: w */
    private int f3937w;

    /* renamed from: aw */
    public boolean f3938aw;

    /* renamed from: ax */
    public boolean f3939ax;

    /* renamed from: ay */
    public float f3940ay;

    /* renamed from: az */
    public float f3941az;

    /* renamed from: aA */
    public AbstractC0163h f3942aA;

    /* renamed from: aB */
    public C0164i f3943aB;

    /* renamed from: aC */
    public boolean f3944aC;

    /* renamed from: aE */
    public static final C0930ag f3945aE;

    /* renamed from: aF */
    public static final PointF f3946aF;

    /* renamed from: x */
    private C0930ag f3947x;

    /* renamed from: y */
    private int f3948y;

    /* renamed from: z */
    private C0930ag f3949z;

    /* renamed from: A */
    private int f3950A;

    /* renamed from: B */
    private static final Paint f3951B;

    /* renamed from: C */
    private static int f3952C;

    /* renamed from: D */
    private static final C0930ag f3953D;

    /* renamed from: E */
    private static final C0930ag f3954E;

    /* renamed from: aG */
    public static AbstractC0545j f3955aG;

    /* renamed from: aH */
    public byte f3956aH;

    /* renamed from: aI */
    public Unit[] f3957aI;

    /* renamed from: aJ */
    public float[] f3958aJ;

    /* renamed from: aK */
    public int f3959aK;

    /* renamed from: aL */
    public static final C1112u f3960aL;

    /* renamed from: aM */
    public boolean f3961aM;

    /* renamed from: aN */
    public boolean f3962aN;

    /* renamed from: aO */
    static final C0235ad f3963aO;

    /* renamed from: aP */
    public static C0236ae f3964aP;

    /* renamed from: aQ */
    public static C0236ae f3965aQ;

    /* renamed from: aR */
    public static C0239ah f3966aR;

    /* renamed from: aS */
    public static C0239ah f3967aS;

    /* renamed from: aT */
    C0906k f3968aT;

    /* renamed from: aU */
    static C1101m f3969aU;

    /* renamed from: aV */
    public static final C0237af f3970aV;

    /* renamed from: aW */
    protected static PorterDuffColorFilter f3971aW;

    /* renamed from: aX */
    protected static PorterDuffColorFilter f3972aX;

    /* renamed from: aY */
    protected static PorterDuffColorFilter f3973aY;

    /* renamed from: aZ */
    protected static PorterDuffColorFilter f3974aZ;

    /* renamed from: ba */
    protected static Paint f3975ba;

    /* renamed from: bb */
    protected static Paint f3976bb;

    /* renamed from: bc */
    protected static Paint f3977bc;

    /* renamed from: bd */
    static final PointF f3978bd;

    /* renamed from: be */
    protected static final C1080ai f3979be;

    /* renamed from: bf */
    protected static final PointF f3980bf;

    /* renamed from: bg */
    protected static final PointF f3981bg;

    /* renamed from: bh */
    protected static final C1080ai f3982bh;

    /* renamed from: bi */
    protected static final PointF f3983bi;

    /* renamed from: bj */
    static final Point f3984bj;

    /* renamed from: bk */
    static final Point f3985bk;

    /* renamed from: bl */
    static final PointF f3986bl;

    /* renamed from: bm */
    static final C0625z f3987bm;

    /* renamed from: bn */
    public static final C0234ac f3988bn;

    /* renamed from: bo */
    public C1101m f3989bo;

    /* renamed from: bp */
    static C1101m f3990bp;

    /* renamed from: K */
    public static boolean f3991K = false;

    /* renamed from: N */
    public static final C0305au[] f3992N = new C0305au[0];

    /* renamed from: as */
    public static final C0237af[] f3993as = new C0237af[0];

    /* renamed from: aD */
    public static final C0930ag f3994aD = new C0930ag();

    /* renamed from: d */
    public abstract BitmapOrTexture getImage();

    /* renamed from: k */
    public abstract BitmapOrTexture getShadowImage();

    /* renamed from: d */
    public abstract BitmapOrTexture mo3507d(int i);

    /* renamed from: I */
    public abstract boolean mo3295I();

    /* renamed from: m */
    public abstract float getMaxAttackRange();

    /* renamed from: b */
    public abstract float getShootDelay(int i);

    /* renamed from: A */
    public abstract float getTurnSpeed();

    /* renamed from: c */
    public abstract float getTurretTurnSpeed(int i);

    /* renamed from: z */
    public abstract float getMoveSpeed();

    /* renamed from: a */
    public abstract void fireProjectile(Unit unit, int i);

    static {
        f3994aD.m7267a(128, 255, 255, 255);
        f3994aD.m1049o();
        f3945aE = new C0930ag();
        f3945aE.m7259a(f3994aD);
        f3945aE.m1053a(true);
        f3945aE.m7231d(true);
        f3945aE.m7239b(true);
        f3945aE.m1049o();
        f3946aF = new PointF();
        f3951B = new Paint();
        f3953D = m3181a(false);
        f3954E = m3181a(true);
        f3955aG = new AbstractC0545j() { // from class: com.corrodinggames.rts.game.units.y.1
            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
            public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
                abstractC0623y.m3201a(unit, f, true);
            }
        };
        f3960aL = new C1112u();
        f3963aO = new C0235ad();
        f3964aP = new C0236ae(true);
        f3965aQ = new C0236ae(false);
        f3966aR = new C0239ah(true);
        f3967aS = new C0239ah(false);
        f3969aU = new C1101m();
        f3970aV = new C0237af();
        f3971aW = new PorterDuffColorFilter(Color.m7283a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
        f3972aX = new PorterDuffColorFilter(Color.m7283a(70, 255, 70), PorterDuff.Mode.MULTIPLY);
        f3973aY = new PorterDuffColorFilter(Color.m7283a(255, 40, 40), PorterDuff.Mode.MULTIPLY);
        f3974aZ = new PorterDuffColorFilter(Color.m7283a(120, 120, 255), PorterDuff.Mode.MULTIPLY);
        f3975ba = C1117y.m483b();
        f3976bb = C1117y.m483b();
        f3977bc = C1117y.m483b();
        f3978bd = new PointF();
        f3979be = new C1080ai();
        f3980bf = new PointF();
        f3981bg = new PointF();
        f3982bh = new C1080ai();
        f3983bi = new PointF();
        f3984bj = new Point();
        f3985bk = new Point();
        f3986bl = new PointF();
        f3987bm = new C0625z();
        f3988bn = new C0234ac();
        f3990bp = new C1101m();
    }

    /* renamed from: b */
    public void m3126b(float f) {
        if (this.f3940ay < f) {
            this.f3940ay = f;
        }
    }

    /* renamed from: R */
    public Paint m3234R() {
        if (m3165aO()) {
            return f3945aE;
        }
        return f3994aD;
    }

    /* renamed from: a */
    public static void m3187a(AbstractC0623y abstractC0623y, AbstractC0623y abstractC0623y2) {
        try {
            C0859ar c0859ar = new C0859ar();
            int i = abstractC0623y.f3887f;
            for (int i2 = 0; i2 < i; i2++) {
                abstractC0623y.f3888g[i2].m5686a(c0859ar);
            }
            C0876k c0876k = new C0876k(c0859ar.m1552d());
            abstractC0623y2.f3887f = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3;
                abstractC0623y2.m3037m(i4);
                if (i4 >= abstractC0623y2.f3888g.length) {
                    GameEngine.m1145b("Too many waypoints:" + i3);
                    i4 = abstractC0623y2.f3888g.length - 1;
                }
                if (abstractC0623y2.f3888g[i4] == null) {
                    abstractC0623y2.f3888g[i4] = new C0305au();
                }
                abstractC0623y2.f3888g[i4].m5685a(c0876k);
                abstractC0623y2.f3888g[i4].m5680c();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3883b);
        c0859ar.mo1488a(this.f3884c);
        c0859ar.mo1488a(this.f1648cJ[0].f1715e);
        c0859ar.mo1487a(this.f3887f);
        int i = this.f3887f;
        c0859ar.mo1487a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3888g[i2].m5686a(c0859ar);
        }
        c0859ar.m1564a(this.f3889O);
        Unit unit = this.f3891Q;
        if (unit != null && unit.isDead) {
            unit = null;
        }
        c0859ar.mo1486a(unit);
        c0859ar.mo1488a(this.f3892R);
        c0859ar.mo1488a(this.f3894T);
        c0859ar.mo1488a(this.f3897U);
        c0859ar.m1551d("pathing_active:");
        c0859ar.mo1482a(this.f3902k);
        c0859ar.mo1488a(this.f3903l);
        c0859ar.mo1488a(this.f3904m);
        c0859ar.mo1488a(this.f3910s);
        c0859ar.m1572a(this.f3916ac);
        c0859ar.mo1482a(this.f3917ad);
        c0859ar.mo1482a(this.f3918ae);
        c0859ar.mo1482a(this.f3922ai);
        c0859ar.mo1488a(this.f3923aj);
        c0859ar.mo1488a(this.f3924ak);
        c0859ar.mo1488a(this.f3925al);
        c0859ar.mo1487a(this.f3926am);
        c0859ar.mo1487a(this.f3915ab);
        c0859ar.m1551d("activePathCount:");
        c0859ar.mo1487a(this.f3934av);
        for (int i3 = 0; i3 < this.f3934av; i3++) {
            this.f3933au[i3].m5964a(c0859ar);
        }
        c0859ar.mo1487a(this.f3934av);
        c0859ar.mo1487a(this.f3936v);
        if (c0859ar.m1548f()) {
        }
        c0859ar.m1554c(12);
        c0859ar.mo1488a(this.f3906o);
        c0859ar.mo1488a(this.f3907p);
        c0859ar.mo1488a(this.f3885d);
        c0859ar.mo1488a(this.f3886e);
        c0859ar.mo1482a(this.f3935u);
        c0859ar.mo1488a(this.f3921ah);
        c0859ar.mo1487a(this.f3905n);
        c0859ar.mo1488a(this.f3898V);
        c0859ar.mo1488a(this.f3929ap);
        c0859ar.mo1482a(this.f3930aq);
        c0859ar.mo1482a(this.f3931ar);
        c0859ar.mo1483a(this.f3920ag);
        c0859ar.mo1488a(this.f3914aa);
        c0859ar.mo1487a(this.f3937w);
        c0859ar.mo1488a(this.f3899W);
        c0859ar.mo1488a(this.f3940ay);
        c0859ar.mo1488a(this.f3941az);
        C0552c.m3734a(this, c0859ar);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3883b = c0876k.m1453g();
        this.f3884c = c0876k.m1453g();
        this.f1648cJ[0].f1715e = c0876k.m1453g();
        this.f3887f = c0876k.m1454f();
        if (this.f3887f > 0) {
            m3037m(CommonUtils.m2289c(this.f3887f - 1, 29));
        }
        int i = 30;
        if (c0876k.m1463b() >= 42) {
            i = c0876k.m1454f();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m3037m(i3);
            if (i3 >= this.f3888g.length) {
                GameEngine.m1145b("Too many waypoints:" + i2);
                i3 = this.f3888g.length - 1;
            }
            if (this.f3888g[i3] == null) {
                this.f3888g[i3] = new C0305au();
            }
            this.f3888g[i3].m5685a(c0876k);
        }
        this.f3889O = (EnumC0205a) c0876k.m1461b(EnumC0205a.class);
        if (this.f3889O == EnumC0205a.f1417a) {
            if (!mo3295I()) {
                this.f3889O = EnumC0205a.f1418b;
            }
            if (c0876k.m1463b() < 74) {
                this.f3889O = EnumC0205a.f1418b;
            }
        }
        long m1446n = c0876k.m1446n();
        this.f3892R = c0876k.m1453g();
        this.f3894T = c0876k.m1453g();
        this.f3897U = c0876k.m1453g();
        this.f3902k = c0876k.m1455e();
        this.f3903l = c0876k.m1453g();
        this.f3904m = c0876k.m1453g();
        this.f3910s = c0876k.m1453g();
        m3191a(c0876k.m1444p());
        this.f3917ad = c0876k.m1455e();
        this.f3918ae = c0876k.m1455e();
        this.f3922ai = c0876k.m1455e();
        this.f3923aj = c0876k.m1453g();
        this.f3924ak = c0876k.m1453g();
        this.f3925al = c0876k.m1453g();
        this.f3926am = c0876k.m1454f();
        if (c0876k.m1463b() >= 18) {
            this.f3915ab = c0876k.m1454f();
        }
        if (c0876k.m1463b() >= 21) {
            int m1454f = c0876k.m1454f();
            for (int i4 = 0; i4 < m1454f; i4++) {
                m3041l(i4);
                if (this.f3933au[i4] == null) {
                    this.f3933au[i4] = new C0237af();
                }
                this.f3933au[i4].m5963a(c0876k);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                m3041l(i5);
                if (this.f3933au[i5] == null) {
                    this.f3933au[i5] = new C0237af();
                }
                this.f3933au[i5].m5963a(c0876k);
            }
        }
        this.f3934av = c0876k.m1454f();
        this.f3936v = c0876k.m1454f();
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f3906o = c0876k.m1453g();
            this.f3907p = c0876k.m1453g();
        }
        if (m1457d >= 2) {
            this.f3885d = c0876k.m1453g();
            this.f3886e = c0876k.m1453g();
        }
        if (m1457d >= 3) {
            this.f3935u = c0876k.m1455e();
        }
        if (m1457d >= 4) {
            this.f3921ah = c0876k.m1453g();
            this.f3905n = c0876k.m1454f();
        }
        if (m1457d >= 5) {
            this.f3898V = c0876k.m1453g();
        }
        if (m1457d >= 6) {
            this.f3929ap = c0876k.m1453g();
            this.f3930aq = c0876k.m1455e();
            this.f3931ar = c0876k.m1455e();
        }
        if (m1457d >= 7) {
            this.f3920ag = c0876k.m1438v();
        }
        if (m1457d >= 8) {
            this.f3914aa = c0876k.m1453g();
        }
        if (m1457d >= 9) {
            this.f3937w = c0876k.m1454f();
        }
        if (m1457d >= 10) {
            this.f3899W = c0876k.m1453g();
        }
        if (m1457d >= 11) {
            this.f3940ay = c0876k.m1453g();
            this.f3941az = c0876k.m1453g();
        }
        if (m1457d >= 12) {
            C0552c.m3733a(this, c0876k);
        }
        super.mo2877a(c0876k);
        if (!this.isDead) {
            this.f3891Q = AbstractC1120w.m467a(m1446n, false);
            for (int i6 = 0; i6 < this.f3887f; i6++) {
                if (this.f3888g[i6] == null) {
                    GameEngine.PrintLog("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f3887f);
                } else {
                    this.f3888g[i6].m5680c();
                }
            }
        }
        mo4500S();
        if (this.isDead) {
            this.f4227es = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo3120b(Team team) {
        super.mo3120b(team);
        mo4500S();
    }

    /* renamed from: S */
    public void mo4500S() {
        this.image = getImage();
        this.shadowImage = getShadowImage();
    }

    /* renamed from: h */
    public float m3055h(int i) {
        return 0.0f;
    }

    /* renamed from: i */
    public float m3051i(int i) {
        return 0.0f;
    }

    /* renamed from: T */
    public BitmapOrTexture m3232T() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.graphics.Paint] */
    /* renamed from: a */
    public Paint m3210a(int i, ColorFilter colorFilter, boolean z) {
        C0930ag c0930ag;
        int i2;
        if (i == -1 && colorFilter == null) {
            if (z) {
                return f3954E;
            }
            return f3953D;
        }
        if (this.f1626cn) {
            if (colorFilter == null) {
                c0930ag = f3951B;
                i2 = f3952C;
                f3952C = i;
            } else {
                c0930ag = f3951B;
                i2 = -1;
                if (colorFilter == f3973aY) {
                    c0930ag = f3976bb;
                }
                if (colorFilter == f3972aX) {
                    c0930ag = f3975ba;
                }
                if (colorFilter == f3974aZ) {
                    c0930ag = f3977bc;
                }
            }
        } else if (z) {
            if (this.f3949z == null) {
                this.f3949z = m3181a(true);
            }
            c0930ag = this.f3949z;
            i2 = this.f3950A;
            this.f3950A = i;
        } else {
            if (this.f3947x == null) {
                this.f3947x = m3181a(false);
            }
            c0930ag = this.f3947x;
            i2 = this.f3948y;
            this.f3948y = i;
        }
        if (i2 != i) {
            c0930ag.m7242b(i);
        }
        if (c0930ag.m7225h() != colorFilter) {
            c0930ag.m7264a(colorFilter);
        }
        return c0930ag;
    }

    /* renamed from: a */
    public static C0930ag m3181a(boolean z) {
        C0930ag c0930ag = new C0930ag();
        if (z) {
            c0930ag.m1053a(true);
            c0930ag.m7231d(true);
            c0930ag.m7239b(true);
        } else {
            c0930ag.m1053a(false);
            c0930ag.m7231d(false);
            c0930ag.m7239b(false);
        }
        return c0930ag;
    }

    public AbstractC0623y(boolean z) {
        super(z);
        this.f3887f = 0;
        this.f3888g = f3992N;
        this.f3889O = EnumC0205a.f1418b;
        this.f3890P = -9999;
        this.f3896i = -9999;
        this.f3903l = 3.0f;
        this.f3904m = 3.0f;
        this.f3922ai = false;
        this.f3923aj = 0.0f;
        this.f3924ak = 0.0f;
        this.f3925al = 0.0f;
        this.f3926am = 0;
        this.f3927an = 0.0f;
        this.f3929ap = -999.0f;
        this.f3930aq = false;
        this.f3931ar = false;
        this.f3933au = f3993as;
        this.f3934av = 0;
        this.f3936v = 0;
        this.f3938aw = true;
        this.f3947x = null;
        this.f3949z = null;
        this.f3956aH = (byte) 0;
        this.f3959aK = -9999;
        this.f3968aT = null;
    }

    /* renamed from: j */
    public final void m3048j(int i) {
        int mo3512bl = mo3512bl();
        for (int i2 = 0; i2 < mo3512bl; i2++) {
            this.f1648cJ[i2].m5747a(i);
        }
    }

    /* renamed from: a */
    public void m3183a(String str) {
        String str2;
        if (getUnitType() != null) {
            str2 = getUnitType().mo5706i();
        } else {
            str2 = "<NO UNIT TYPE>";
        }
        GameEngine.PrintLog("(Unit log:" + str2 + " id:" + this.f6945ed + "): " + str);
    }

    /* renamed from: U */
    public void m3231U() {
        String str;
        if (getUnitType() != null) {
            str = getUnitType().mo5706i();
        } else {
            str = "<NO UNIT TYPE>";
        }
        GameEngine.PrintLog("---- Debug for:" + str + " id:" + this.f6945ed + "---");
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        float moveDecelerationSpeed;
        float f2;
        float f3;
        super.update(f);
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3939ax) {
            this.f3939ax = false;
        }
        if (this.f1622cj != 0.0f) {
            this.f1622cj = CommonUtils.m2368a(this.f1622cj, f);
        }
        if (!this.isDead && isActive()) {
            if (this.f3940ay > 0.0f) {
                this.f3940ay = CommonUtils.m2368a(this.f3940ay, f);
            }
            if (this.f3941az > 0.0f) {
                this.f3941az = CommonUtils.m2368a(this.f3941az, f);
            }
            if (this.f3989bo != null) {
                C0552c.m3736a(this, f);
            }
            float f4 = this.f6951ek;
            float f5 = this.f6952el;
            int mo3512bl = mo3512bl();
            for (int i = 0; i < mo3512bl; i++) {
                C0247ap c0247ap = this.f1648cJ[i];
                if (c0247ap.f1714d == 0.0f) {
                    float mo3538C = mo3538C(i);
                    if (mo4496b(i, f) && c0247ap.f1711a != mo3538C) {
                        if (CommonUtils.m2294c(CommonUtils.m2292c(c0247ap.f1711a, mo3538C, 360.0f)) < 0.5f) {
                            c0247ap.f1714d = 20.0f;
                            c0247ap.f1713c = 0.0f;
                        } else {
                            m3224a(f, mo3538C, i);
                        }
                    }
                } else {
                    c0247ap.f1714d = CommonUtils.m2368a(c0247ap.f1714d, f);
                }
            }
            if (!m3094bk()) {
                m3045k(f);
            }
            for (int i2 = 0; i2 < mo3512bl; i2++) {
                C0247ap c0247ap2 = this.f1648cJ[i2];
                if (c0247ap2.f1715e != 0.0f) {
                    c0247ap2.f1715e = CommonUtils.m2368a(c0247ap2.f1715e, f);
                }
            }
            boolean mo3999bi = mo3999bi();
            boolean z = (this.f1613ca == 0.0f && this.f1614cb == 0.0f) ? false : true;
            if ((this.f1616cd != 0.0f || z) && mo3295I()) {
                float f6 = this.direction;
                float moveSpeed = getMoveSpeed();
                if (mo3998bj()) {
                    f6 = this.f1618cf;
                }
                if (!mo3999bi) {
                    float f7 = moveSpeed * this.f1616cd * f;
                    f4 += CommonUtils.m2249i(f6) * f7;
                    f5 += CommonUtils.sin(f6) * f7 * m3154aZ();
                    if (z) {
                        f4 += this.f1613ca * f;
                        f5 += this.f1614cb * f * m3154aZ();
                        if (CommonUtils.m2366a(0.0f, 0.0f, this.f1613ca, this.f1614cb) > moveSpeed * moveSpeed) {
                            this.f1613ca = (float) (this.f1613ca - ((this.f1613ca * 0.05d) * f));
                            this.f1614cb = (float) (this.f1614cb - ((this.f1614cb * 0.05d) * f));
                        }
                        this.f1613ca = CommonUtils.m2367a(this.f1613ca, 0.0f, 0.5f * moveSpeed * f);
                        this.f1614cb = CommonUtils.m2367a(this.f1614cb, 0.0f, 0.5f * moveSpeed * f);
                    }
                } else {
                    if (this.f1616cd != 0.0f) {
                        moveDecelerationSpeed = getMoveAccelerationSpeed() * 1.41f;
                        f2 = CommonUtils.m2249i(f6) * moveSpeed * this.f1616cd;
                        f3 = CommonUtils.sin(f6) * moveSpeed * this.f1616cd;
                    } else {
                        moveDecelerationSpeed = getMoveDecelerationSpeed() * 1.41f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float m2366a = CommonUtils.m2366a(this.f1613ca, this.f1614cb, f2, f3);
                    if (m2366a > moveSpeed * moveSpeed) {
                        this.f1613ca = (float) (this.f1613ca - ((this.f1613ca * 0.05d) * f));
                        this.f1614cb = (float) (this.f1614cb - ((this.f1614cb * 0.05d) * f));
                    }
                    float f8 = moveDecelerationSpeed * f;
                    if (m2366a < f8 * f8) {
                        this.f1613ca = f2;
                        this.f1614cb = f3;
                    } else {
                        float m2280d = CommonUtils.m2280d(this.f1613ca, this.f1614cb, f2, f3);
                        this.f1613ca += CommonUtils.m2249i(m2280d) * f8;
                        this.f1614cb += CommonUtils.sin(m2280d) * f8;
                    }
                    f4 += this.f1613ca * f;
                    f5 += this.f1614cb * f * m3154aZ();
                }
                this.f3939ax = true;
            }
            if (this.f1610bX != 0.0f || this.f1611bY != 0.0f) {
                this.f1610bX = CommonUtils.m2315b(this.f1610bX, -9.0f, 9.0f);
                this.f1611bY = CommonUtils.m2315b(this.f1611bY, -9.0f, 9.0f);
                f4 += this.f1610bX;
                f5 += this.f1611bY;
                this.f1611bY = 0.0f;
                this.f1610bX = 0.0f;
                this.f3939ax = true;
            }
            if (this.f3939ax && mo3295I() && this.f1651cM == null) {
                m3214a(f, gameEngine, f4, f5);
            }
            if (this.f3938aw) {
                this.f3938aw = false;
                mo3073c(false);
                this.f3939ax = true;
            }
        }
    }

    /* renamed from: a */
    private void m3214a(float f, GameEngine gameEngine, float f2, float f3) {
        C0173b c0173b = gameEngine.f6104bL;
        float f4 = c0173b.f788r;
        float f5 = c0173b.f789s;
        float f6 = this.f6951ek * f4;
        float f7 = this.f6952el * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int m2274e = CommonUtils.m2274e(f6);
        int m2274e2 = CommonUtils.m2274e(f7);
        int m2274e3 = CommonUtils.m2274e(f8);
        int m2274e4 = CommonUtils.m2274e(f9);
        if ((m2274e != m2274e3 || m2274e2 != m2274e4) && this.f1622cj == 0.0f && gameEngine.f6113bU.m1313a(mo5645h(), m2274e3, m2274e4)) {
            if (m2274e != m2274e3 && m2274e2 != m2274e4) {
                boolean m1313a = gameEngine.f6113bU.m1313a(mo5645h(), m2274e, m2274e4);
                boolean m1313a2 = gameEngine.f6113bU.m1313a(mo5645h(), m2274e3, m2274e2);
                if (m1313a && m1313a2) {
                    z = true;
                    f3946aF.m7213a(f6, f7);
                    pointF = f3946aF;
                }
                if (pointF == null && m1313a) {
                    pointF = C0248aq.m5743a(mo5645h(), f6, f7, f8, f9, m2274e, m2274e4, false);
                }
                if (pointF == null && m1313a2) {
                    pointF = C0248aq.m5743a(mo5645h(), f6, f7, f8, f9, m2274e3, m2274e2, false);
                }
            }
            if (pointF == null) {
                pointF = C0248aq.m5743a(mo5645h(), f6, f7, f8, f9, m2274e3, m2274e4, false);
            }
            if (pointF == null) {
                z = true;
                f3946aF.m7213a(f6, f7);
                pointF = f3946aF;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (gameEngine.f6113bU.m1313a(mo5645h(), m2274e, m2274e2) && !gameEngine.f6113bU.m1300b(mo5645h(), m2274e3, m2274e4)) {
                z3 = true;
            }
            if (!z3) {
                f2 = pointF.x * c0173b.f784n;
                f3 = pointF.y * c0173b.f785o;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2) {
            this.f3883b += f;
            this.f3882a = 0;
        } else if (this.f3883b != 0.0f && f > 0.0f) {
            this.f3882a++;
            if (this.f3882a >= 3) {
                this.f3883b = 0.0f;
            }
        }
        if (!z) {
            int m2274e5 = CommonUtils.m2274e(f2 * f4);
            int m2274e6 = CommonUtils.m2274e(f3 * f5);
            this.f6951ek = f2;
            this.f6952el = f3;
            if (m2274e != m2274e5 || m2274e2 != m2274e6) {
                mo3073c(true);
            }
        }
    }

    /* renamed from: b */
    public void m3125b(float f, float f2) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        float f3 = c0173b.f788r;
        float f4 = c0173b.f789s;
        int m2274e = CommonUtils.m2274e(this.f6951ek * f3);
        int m2274e2 = CommonUtils.m2274e(this.f6952el * f4);
        int m2274e3 = CommonUtils.m2274e(f * f3);
        int m2274e4 = CommonUtils.m2274e(f2 * f4);
        this.f6951ek = f;
        this.f6952el = f2;
        if (m2274e != m2274e3 || m2274e2 != m2274e4) {
            mo3073c(true);
        }
    }

    /* renamed from: g */
    public static void m3061g(float f) {
        int i;
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        gameEngine.f6122cd.m2608a(EnumC0729bm.f4581j);
        int i2 = gameEngine.f6096by;
        for (int i3 = 0; i3 < size; i3++) {
            if (m523a[i3] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m523a[i3];
                if ((abstractC0623y.f3939ax || abstractC0623y.f1612bZ) && abstractC0623y.mo3295I() && abstractC0623y.f3959aK <= i2) {
                    abstractC0623y.f1612bZ = false;
                    abstractC0623y.f3939ax = true;
                    if (abstractC0623y.f1647cI) {
                        f2 = abstractC0623y.radius + 7.0f;
                        if (abstractC0623y.f3956aH > 9) {
                            abstractC0623y.f3959aK = i2 + 200 + (i3 % 50);
                        } else {
                            abstractC0623y.f3959aK = i2 + 50 + (i3 % 50);
                        }
                    } else {
                        f2 = abstractC0623y.radius + 5.0f;
                        abstractC0623y.f3959aK = i2 + 250 + (i3 % 50);
                    }
                    abstractC0623y.f3956aH = (byte) 0;
                    f3960aL.clear();
                    gameEngine.f6121cc.m3783b(abstractC0623y.f6951ek, abstractC0623y.f6952el, f2, f3960aL);
                    Unit[] m523a2 = f3960aL.m523a();
                    int i4 = f3960aL.f6916b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        abstractC0623y.m3201a(m523a2[i5], f, true);
                    }
                    if (abstractC0623y.f3956aH > 9 && abstractC0623y.f1584by > i2 - 400) {
                        abstractC0623y.f3959aK = gameEngine.f6096by + 5 + (i3 % 5);
                        abstractC0623y.f1612bZ = true;
                    }
                }
            }
        }
        gameEngine.f6122cd.m2603b(EnumC0729bm.f4581j);
        gameEngine.f6122cd.m2608a(EnumC0729bm.f4582k);
        for (int i6 = 0; i6 < size; i6++) {
            if (m523a[i6] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m523a[i6];
                if (abstractC0623y2.f3939ax && (i = abstractC0623y2.f3956aH) > 0 && abstractC0623y2.mo3295I()) {
                    if (!abstractC0623y2.f1612bZ) {
                        abstractC0623y2.f1612bZ = true;
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        abstractC0623y2.m3201a(abstractC0623y2.f3957aI[i7], f, false);
                    }
                }
            }
        }
        gameEngine.f6122cd.m2603b(EnumC0729bm.f4582k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3201a(Unit unit, float f, boolean z) {
        C0305au m3135ar;
        C0305au m3135ar2;
        if (unit != this && unit.collidable && this.collidable && mo3293i() == unit.mo3293i() && mo3294Q() == unit.mo3294Q() && unit.f1650cL == null && this.f1650cL == null && this.f1602bP != unit && unit.f1602bP != this) {
            float f2 = this.f6951ek + this.f1610bX;
            float f3 = this.f6952el + this.f1611bY;
            float f4 = unit.f6951ek + unit.f1610bX;
            float f5 = unit.f6952el + unit.f1611bY;
            float m2366a = CommonUtils.m2366a(f2, f3, f4, f5);
            float f6 = this.radius + unit.radius;
            if (z) {
                float f7 = m2366a;
                if (m2366a < f6 * f6) {
                    f7 = 0.0f;
                }
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                    int i = abstractC0623y.f3956aH;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (abstractC0623y.f3957aI[i2] == this) {
                            return;
                        }
                    }
                }
                if (this.f3957aI == null) {
                    this.f3957aI = new Unit[10];
                    this.f3958aJ = new float[10];
                }
                Unit[] unitArr = this.f3957aI;
                byte b = -1;
                int i3 = 0;
                while (true) {
                    if (i3 < this.f3956aH) {
                        if (f7 >= this.f3958aJ[i3]) {
                            i3++;
                        } else {
                            b = i3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (b == -1) {
                    if (this.f3956aH < unitArr.length) {
                        b = this.f3956aH;
                    } else {
                        return;
                    }
                }
                if (this.f3956aH < unitArr.length) {
                    this.f3956aH = (byte) (this.f3956aH + 1);
                }
                for (int i4 = this.f3956aH - 1; i4 > b; i4--) {
                    unitArr[i4] = unitArr[i4 - 1];
                }
                unitArr[b] = unit;
                this.f3958aJ[b] = f7;
            } else if (m2366a < f6 * f6 && !unit.m5891a(this, f) && !m5891a(unit, f)) {
                float m2280d = CommonUtils.m2280d(f2, f3, f4, f5);
                float sqrt = (f6 - ((float) Math.sqrt(m2366a))) + 0.001f;
                if (sqrt <= 0.0f) {
                    return;
                }
                int s = m5758s(unit);
                int m5758s = unit.m5758s(this);
                int i5 = s > m5758s ? s : m5758s;
                if (i5 != 0) {
                    float f8 = (sqrt / i5) * f;
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
                float bN = mo3513bN();
                float mo3513bN = unit.mo3513bN();
                if (this.team == unit.team) {
                    boolean z2 = false;
                    float f11 = 1.7f;
                    if (unit instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                        if (this.f3898V > 200.0f || abstractC0623y2.f3898V > 200.0f) {
                            f11 = 5.0f;
                        }
                        if (this.f3916ac == abstractC0623y2) {
                            mo3513bN *= f11;
                            z2 = true;
                        }
                        if (abstractC0623y2.f3916ac == this) {
                            bN *= f11;
                            z2 = true;
                        }
                        if (!z2) {
                            if (this.f3917ad && abstractC0623y2.f3916ac != null) {
                                bN *= f11;
                            } else if (abstractC0623y2.f3917ad && this.f3916ac != null) {
                                mo3513bN *= f11;
                            } else if (this.f3884c == 0.0f && abstractC0623y2.f3884c != 0.0f) {
                                bN *= f11;
                            } else if (abstractC0623y2.f3884c == 0.0f && this.f3884c != 0.0f) {
                                mo3513bN *= f11;
                            }
                        }
                    }
                }
                if (unit instanceof AbstractC0621w) {
                    f10 = bN / (bN + mo3513bN);
                }
                float f12 = 1.0f - f10;
                float m2249i = CommonUtils.m2249i(m2280d);
                float sin = CommonUtils.sin(m2280d);
                if (unit instanceof AbstractC0621w) {
                    float f13 = f9 * f10;
                    unit.f1610bX += m2249i * f13;
                    unit.f1611bY += sin * f13;
                }
                float f14 = f9 * f12;
                this.f1610bX -= m2249i * f14;
                this.f1611bY -= sin * f14;
                GameEngine gameEngine = GameEngine.getInstance();
                this.f3912Y = unit;
                this.f3913Z = gameEngine.f6233bx;
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) unit;
                    abstractC0623y3.f3912Y = this;
                    abstractC0623y3.f3913Z = gameEngine.f6233bx;
                }
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y4 = (AbstractC0623y) unit;
                    if (this.f3915ab != 0 && this.f3915ab == abstractC0623y4.f3915ab) {
                        if (m3135ar() == null && (m3135ar2 = abstractC0623y4.m3135ar()) != null && (m3135ar2.f1796a == EnumC0306av.f1810a || m3135ar2.f1796a == EnumC0306av.f1817h)) {
                            abstractC0623y4.m3128ay();
                        }
                        if (abstractC0623y4.m3135ar() == null && (m3135ar = abstractC0623y4.m3135ar()) != null) {
                            if (m3135ar.f1796a == EnumC0306av.f1810a || m3135ar.f1796a == EnumC0306av.f1817h) {
                                m3128ay();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3230V() {
        return 1;
    }

    /* renamed from: a */
    public void mo4213a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public void m3229W() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.team == gameEngine.f6093bs) {
            gameEngine.f6111bS.f5108f.m2100b(this);
        }
    }

    /* renamed from: b */
    public float m3124b(float f, float f2, float f3) {
        if (isFixedFiring()) {
            if (m5867bI()) {
                return 0.0f;
            }
            return m3078c(f, CommonUtils.m2280d(this.f6951ek, this.f6952el, f2, f3));
        } else if (mo3512bl() < 1) {
            return 0.0f;
        } else {
            int m3160aT = m3160aT();
            if (m3160aT == -1) {
                m3160aT = 0;
            }
            PointF mo3523G = mo3523G(m3160aT);
            float m2280d = CommonUtils.m2280d(mo3523G.x, mo3523G.y, f2, f3);
            this.f1648cJ[m3160aT].m5747a(70);
            return m3224a(f, m2280d, m3160aT);
        }
    }

    /* renamed from: c */
    public float m3078c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.f1619cg && m3103bb()) {
            z = true;
            z2 = true;
        }
        return m3221a(f, f2, z, z2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public void mo3057h(float f) {
        float m2292c = CommonUtils.m2292c(this.direction, f, 360.0f);
        if (CommonUtils.m2294c(m2292c) > 0.01d) {
            rotateDeg(m2292c);
        }
    }

    /* renamed from: a */
    public float m3221a(float f, float f2, boolean z, boolean z2) {
        this.f1618cf = f2;
        if (CommonUtils.m2294c(this.direction - f2) < 0.01f) {
            if (z && this.f1619cg) {
                m3048j(25);
                this.f1619cg = false;
                return 0.0f;
            }
            return 0.0f;
        }
        float m2292c = CommonUtils.m2292c(this.direction, f2, 360.0f);
        if (z) {
            if (z2 && CommonUtils.m2294c(m2292c) > 100.0f) {
                m2292c = CommonUtils.m2292c(this.direction, f2 + 180.0f, 360.0f);
                if (!this.f1619cg) {
                    m3048j(25);
                    this.f1619cg = true;
                }
            } else if (this.f1619cg) {
                m3048j(25);
                this.f1619cg = false;
            }
        }
        if (CommonUtils.m2294c(m2292c) < 0.01f) {
            return 0.0f;
        }
        if (this.f3940ay <= 0.0f) {
            float mo3528B = mo3528B();
            if (mo3528B <= 0.0f) {
                float turnSpeed = (m2292c > 0.0f ? 1.0f : -1.0f) * getTurnSpeed() * f;
                if (CommonUtils.m2294c(turnSpeed) > CommonUtils.m2294c(m2292c)) {
                    turnSpeed = m2292c;
                }
                rotateDeg(turnSpeed);
            } else {
                float f3 = m2292c > 0.0f ? 1.0f : -1.0f;
                if (CommonUtils.m2294c(m2292c) < CommonUtils.m2294c(this.f1615cc) / mo3528B) {
                    this.f1615cc = CommonUtils.m2367a(this.f1615cc, f3 * mo3528B, mo3528B * f);
                } else {
                    this.f1615cc = CommonUtils.m2367a(this.f1615cc, f3 * getTurnSpeed(), mo3528B * f);
                }
                float f4 = this.f1615cc * f;
                if (CommonUtils.m2294c(f4) > CommonUtils.m2294c(m2292c)) {
                    this.f1615cc = 0.0f;
                    f4 = m2292c;
                }
                rotateDeg(f4);
            }
        }
        return m2292c;
    }

    /* renamed from: i */
    public void rotateDeg(float f) {
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
        if (mo5661bm()) {
            int mo3512bl = mo3512bl();
            for (int i = 0; i < mo3512bl; i++) {
                C0247ap c0247ap = this.f1648cJ[i];
                c0247ap.f1711a += f;
                if (c0247ap.f1711a > 180.0f) {
                    c0247ap.f1711a -= 360.0f;
                }
                if (c0247ap.f1711a < -180.0f) {
                    c0247ap.f1711a += 360.0f;
                }
            }
        }
    }

    /* renamed from: j */
    public void m3049j(float f) {
        int mo3512bl = mo3512bl();
        for (int i = 0; i < mo3512bl; i++) {
            this.f1648cJ[i].f1711a = f + m3254B(i);
        }
    }

    /* renamed from: a */
    public void m3212a(int i, float f) {
        this.f1648cJ[i].f1711a += f;
    }

    /* renamed from: a */
    public float m3224a(float f, float f2, int i) {
        float f3;
        C0247ap c0247ap = this.f1648cJ[i];
        float m2292c = CommonUtils.m2292c(c0247ap.f1711a, f2, 360.0f);
        if (m2292c == 0.0f) {
            return m2292c;
        }
        float mo3493w = mo3493w(i);
        if (mo3493w <= 0.0f) {
            float m2292c2 = CommonUtils.m2292c(c0247ap.f1711a, f2, getTurretTurnSpeed(i) * f);
            m3212a(i, m2292c2);
            f3 = m2292c - m2292c2;
        } else {
            float mo5644y = mo5644y(i);
            float f4 = m2292c > 0.0f ? 1.0f : -1.0f;
            float m2294c = CommonUtils.m2294c(c0247ap.f1713c) / mo5644y;
            boolean z = ((m2292c > 0.0f ? 1 : (m2292c == 0.0f ? 0 : -1)) > 0) == ((c0247ap.f1713c > 0.0f ? 1 : (c0247ap.f1713c == 0.0f ? 0 : -1)) > 0);
            if (CommonUtils.m2294c(m2292c) < m2294c && z) {
                c0247ap.f1713c = CommonUtils.m2367a(c0247ap.f1713c, f4 * mo5644y, mo5644y * f);
            } else {
                c0247ap.f1713c = CommonUtils.m2367a(c0247ap.f1713c, f4 * getTurretTurnSpeed(i), mo3493w * f);
            }
            float f5 = c0247ap.f1713c * f;
            if (CommonUtils.m2294c(f5) > CommonUtils.m2294c(m2292c)) {
                c0247ap.f1713c = 0.0f;
                f5 = m2292c;
            }
            m3212a(i, f5);
            f3 = m2292c - f5;
        }
        return f3;
    }

    /* renamed from: X */
    public Unit m3228X() {
        C0305au m3135ar;
        if (this.f3895h && (m3135ar = m3135ar()) != null) {
            if ((m3135ar.f1796a == EnumC0306av.f1813d || m3135ar.f1796a == EnumC0306av.f1816g) && m3135ar.f1800h != null && !m3135ar.f1800h.isDead) {
                return m3135ar.f1800h;
            }
            return null;
        }
        return null;
    }

    /* renamed from: Y */
    public boolean m3227Y() {
        C0305au m3135ar = m3135ar();
        if (m3135ar != null && m3135ar.f1796a == EnumC0306av.f1816g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m3216a(float f, C0305au c0305au, C0235ad c0235ad) {
        if (c0305au.f1798c == null) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null) {
            if (c0305au.f1796a == EnumC0306av.f1825p) {
            }
            if (1 != 0) {
                Action a = m5893a(c0305au.f1798c);
                m3231U();
                if (a == null) {
                    m3183a("Failed to find action:" + c0305au.f1798c.m6284a());
                } else {
                    m5892a(a, false, new PointF(c0305au.f1805e, c0305au.f1806f), c0305au.f1800h);
                }
                m3128ay();
            }
        }
    }

    /* renamed from: b */
    private void m3123b(float f, C0305au c0305au, C0235ad c0235ad) {
        Unit m5666i = c0305au.m5666i();
        if (m5666i != null) {
            this.f3891Q = m5666i;
            if (this.f3893S > 5.0f) {
                this.f3893S = 5.0f;
            }
        }
        m3128ay();
    }

    /* renamed from: c */
    private void m3077c(float f, C0305au c0305au, C0235ad c0235ad) {
        float f2;
        Unit m3228X;
        C0305au m3138ao;
        C0305au m3138ao2;
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        boolean z = c0305au.f1796a == EnumC0306av.f1820k || c0305au.f1796a == EnumC0306av.f1823n;
        boolean z2 = c0305au.f1796a == EnumC0306av.f1820k;
        Unit unit = c0305au.f1800h;
        if (z) {
            if (unit == null || unit.isDead) {
                m3128ay();
                c0305au = null;
            }
            if (c0305au != null && unit != null && !unit.m5814cf() && this.team.m6354c(unit.team)) {
                m3128ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            boolean z3 = false;
            float f3 = this.radius;
            if (z) {
                f3 += unit.radius;
            }
            if (c0305au.f1796a == EnumC0306av.f1823n) {
                if (this.f1647cI) {
                    f2 = f3 + 30.0f;
                } else {
                    f2 = f3 + 50.0f;
                }
            } else if (this.f1647cI) {
                f2 = f3 + 80.0f;
            } else {
                f2 = f3 + 100.0f;
            }
            if (m2366a > f2 * f2) {
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                this.f3905n = 2;
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                }
                this.f3909r = 18;
                if (this.f3916ac != null && !this.f3916ac.isActive()) {
                    c0235ad.f1520d = false;
                }
            } else {
                this.f3937w = 0;
            }
            c0235ad.f1520d = false;
            if (0 == 0 && this.f3891Q != null && !this.f3891Q.isDead) {
                boolean z4 = false;
                if (m3117b(this.f3891Q, false)) {
                    z4 = true;
                }
                if (z4) {
                    float m2366a2 = CommonUtils.m2366a(this.f6951ek, this.f6952el, this.f3891Q.f6951ek, this.f3891Q.f6952el);
                    float m3031o = m3031o(this.f3891Q);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (m2366a2 < m3031o * m3031o) {
                        z6 = true;
                    }
                    if (z6 && !m3152aa()) {
                        z6 = false;
                    }
                    if (m2366a < 22500.0f) {
                        this.f3937w = 0;
                    }
                    if (!z6 && (this.f3937w == 1 || m2366a > 122500.0f)) {
                        z5 = true;
                        this.f3937w = 1;
                    }
                    if (m2366a > 302500.0f || (this.f3937w == 1 && m2366a > 202500.0f)) {
                        z5 = true;
                        this.f3937w = 1;
                    }
                    if (!z5) {
                        z3 = true;
                        this.f3937w = 0;
                        if (z6) {
                            this.f3902k = false;
                        } else {
                            if (this.f3910s > 90.0f) {
                                this.f3910s = 90.0f;
                            }
                            this.f3902k = true;
                            this.f3903l = this.f3891Q.f6951ek;
                            this.f3904m = this.f3891Q.f6952el;
                            this.f3905n = 0;
                            this.f3901j = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                Unit m5760q = unit.m5760q(2.0f);
                if (m5760q != null && !m3117b(m5760q, true)) {
                    m5760q = null;
                }
                if (m5760q == null && this.f3937w != 1) {
                    m5760q = m5760q(2.0f);
                    if (m5760q != null && !m3117b(m5760q, true)) {
                        m5760q = null;
                    }
                }
                if (m5760q != null) {
                    z3 = true;
                    if (this.f3910s > 90.0f) {
                        this.f3910s = 90.0f;
                    }
                    this.f3902k = true;
                    this.f3903l = m5760q.f6951ek;
                    this.f3904m = m5760q.f6952el;
                    this.f3905n = 0;
                    this.f3901j = true;
                }
            }
            if (z2 && !z3 && mo3518a(unit) && ((unit.f1631cs < unit.f1632ct || unit.f1623ck < 1.0f) && mo3518a(unit) && (m3138ao2 = m3138ao()) != null)) {
                m3138ao2.m5682b(unit);
                m3138ao2.f1803m = true;
                z3 = true;
                if (this.f3910s > 20.0f) {
                    this.f3910s = 20.0f;
                }
            }
            if (z2 && !z3 && mo3142ak() && (unit instanceof AbstractC0623y) && (m3228X = ((AbstractC0623y) unit).m3228X()) != null && mo3518a(m3228X) && (m3138ao = m3138ao()) != null) {
                m3138ao.m5682b(m3228X);
                m3138ao.f1803m = true;
                if (this.f3910s > 20.0f) {
                    this.f3910s = 20.0f;
                }
            }
        }
    }

    /* renamed from: d */
    private void m3070d(float f, C0305au c0305au, C0235ad c0235ad) {
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        if (c0305au.f1800h == null || c0305au.f1800h.isDead) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null) {
            boolean z = false;
            if (c0305au.f1800h.m5867bI()) {
                if (m2366a < 961.0f) {
                    this.f3900X += f;
                }
                if (this.f3900X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1800h.m5818cb().m7210a()) {
                    f2 = 11.0f;
                }
                if (this.f3883b > 0.0f) {
                    f2 = c0305au.f1800h.radius + this.radius + 31.0f;
                }
                if (m2366a < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = c0305au.f1800h.radius + this.radius + 5.0f;
                if (m2366a < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                this.f3905n = 0;
                if (c0305au.f1800h.m5867bI()) {
                    Rect m5818cb = c0305au.f1800h.m5818cb();
                    this.f3905n = CommonUtils.m2289c(m5818cb.m7202c() / 2, m5818cb.m7206b() / 2) + 1;
                }
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                }
                this.f3909r = 18;
                if (m2366a < 48400.0f) {
                    c0235ad.f1520d = false;
                    if (this.f3910s > 0.0f && m3175aE() == null) {
                        this.f3901j = true;
                    }
                }
                if (this.f3916ac != null && !this.f3916ac.isActive()) {
                    c0235ad.f1520d = false;
                }
            }
            if (z) {
                m5888a(EnumC0347ae.f2179i, c0305au.f1800h);
                m3128ay();
            }
        }
    }

    /* renamed from: e */
    private void m3066e(float f, C0305au c0305au, C0235ad c0235ad) {
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        if (c0305au.f1800h == null || c0305au.f1800h.isDead || !c0305au.f1800h.isActive()) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null && !m5792d(c0305au.f1800h, false)) {
            m3128ay();
        }
        if (c0305au != null) {
            this.f1602bP = c0305au.f1800h;
            if (m2366a > 441.0f) {
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                }
                this.f3909r = 18;
                if (m2366a < 72900.0f) {
                    c0235ad.f1520d = false;
                    if (this.f3910s > 0.0f && this.f3968aT == null) {
                        this.f3901j = true;
                    }
                }
                if (this.f3916ac != null && !this.f3916ac.isActive()) {
                    c0235ad.f1520d = false;
                    return;
                }
                return;
            }
            m5772e(c0305au.f1800h, false);
            m3128ay();
        }
    }

    /* renamed from: a */
    private void m3215a(float f, C0305au c0305au, C0235ad c0235ad, boolean z) {
        C0305au m4279a;
        Unit q;
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        GameEngine gameEngine = GameEngine.getInstance();
        if (!m3162aR()) {
            boolean z2 = false;
            C0399m dl = m5778dl();
            if (dl != null && dl.f2460H) {
                m3081bx();
                z2 = true;
            }
            if (!z2) {
                m3129ax();
                c0305au = null;
            }
        }
        float f2 = 7.0f;
        if (m2366a < 1681.0f) {
            this.f3900X += f;
        }
        if (this.f3900X > 240.0f) {
            f2 = 16.0f;
        }
        if (this.f3900X > 340.0f) {
            f2 = 36.0f;
        }
        if (c0305au != null && c0305au.f1796a == EnumC0306av.f1819j) {
            if (m3131av() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.f3913Z == gameEngine.f6233bx || this.f3913Z == gameEngine.f6233bx - 1) {
                    f3 = 70.0f;
                }
                if (m2366a < f3 * f3) {
                    m3068d(c0305au);
                    m3129ax();
                    c0305au = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.f3913Z == gameEngine.f6233bx || this.f3913Z == gameEngine.f6233bx - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (c0305au != null) {
            if (m2366a < f2 * f2) {
                if (c0305au.f1796a == EnumC0306av.f1819j) {
                    if (m3131av() == 1) {
                    }
                } else if (c0305au.f1796a == EnumC0306av.f1817h) {
                    boolean z3 = false;
                    if (this.f3891Q != null && !this.f3891Q.isDead && m3198a(this.f3891Q, false)) {
                        z3 = true;
                    }
                    if (!z3) {
                        m3129ax();
                        c0305au = null;
                    }
                } else {
                    m3129ax();
                    c0305au = null;
                }
            } else {
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                this.f3905n = 0;
                if (c0305au.f1796a == EnumC0306av.f1819j) {
                    this.f3911t = true;
                    m3178aB();
                }
            }
        }
        if (c0305au != null) {
            if (c0305au.f1796a == EnumC0306av.f1817h || c0305au.f1796a == EnumC0306av.f1819j) {
                if (this.f3891Q != null && !this.f3891Q.isDead && m3198a(this.f3891Q, false)) {
                    m3217a(f, this.f3891Q, c0235ad, true);
                }
                if (this.f3916ac != null && this.f3916ac.f3891Q != null) {
                    c0235ad.f1520d = false;
                }
            }
            if (c0305au.f1796a == EnumC0306av.f1819j) {
                if (this.f3891Q == null && (q = m5760q(3.0f)) != null && m3117b(q, true)) {
                    if (this.f3910s > 90.0f) {
                        this.f3910s = 90.0f;
                    }
                    this.f3902k = true;
                    this.f3903l = q.f6951ek;
                    this.f3904m = q.f6952el;
                    this.f3905n = 0;
                    this.f3901j = true;
                }
                if (mo3142ak() && gameEngine.f6233bx % 10 == this.f6945ed % 10 && (m4279a = Repairbay.m4279a(this, f, 150.0f, true)) != null) {
                    m4279a.f1803m = false;
                    m4279a.f1808k = 200.0f;
                    this.f3902k = false;
                    m3172aH();
                }
            }
        }
    }

    /* renamed from: f */
    private void m3064f(float f, C0305au c0305au, C0235ad c0235ad) {
        boolean z;
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        GameEngine gameEngine = GameEngine.getInstance();
        InterfaceC0303as interfaceC0303as = c0305au.f1797b;
        if (interfaceC0303as == null) {
            m3183a("activeBuildingType==null, removing waypoint");
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null) {
            float f2 = mo3503f(interfaceC0303as);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.height > 4.0f) {
                z2 = true;
            }
            if (this.f3916ac != null) {
                C0305au m3135ar = this.f3916ac.m3135ar();
                if (m3135ar == null || m3135ar.f1796a != EnumC0306av.f1812c) {
                    c0235ad.f1520d = false;
                }
                if (m3135ar != null && !c0305au.m5681b(m3135ar)) {
                    c0235ad.f1520d = false;
                }
            }
            boolean z3 = false;
            if (!C1117y.m500a(this.f3890P, 200)) {
                z3 = true;
            }
            if (f2 > 800000.0f) {
                z = true;
            } else {
                z = m2366a <= f2 * f2;
            }
            if (!z || z2) {
                if (!m3162aR()) {
                    m3128ay();
                    return;
                }
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                if (f2 > 58.0f) {
                    this.f3905n = (int) ((f2 - 41.0f) / (gameEngine.f6104bL.f784n * 1.414f));
                }
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                }
                if (this.f3908q > 3) {
                    m3128ay();
                }
            } else if (!z3) {
                if (!m3017x() || CommonUtils.m2294c(m3124b(f, m5670g, m5668h)) <= 30.0f) {
                    C0625z m3193a = m3193a(c0305au, c0305au.f1797b, c0305au.f1799d, c0305au.f1805e, c0305au.f1806f);
                    Unit unit = null;
                    if (m3193a.f3995a != null) {
                        unit = m3193a.f3995a;
                    } else if (m3193a.f3996b != null) {
                        unit = m3193a.f3996b;
                    }
                    if (unit != null) {
                        m3193a.f3998d.m6086a(this, unit);
                        if (mo3518a(unit)) {
                            if (m5873b(unit) > 10000.0f) {
                                unit.m5759r(1.0f);
                                m3129ax();
                            } else {
                                c0305au.m5674e();
                                c0305au.f1796a = EnumC0306av.f1813d;
                                c0305au.f1800h = unit;
                                m3172aH();
                            }
                        } else {
                            m3128ay();
                        }
                        this.f3890P = -9999;
                        return;
                    }
                    if (c0305au.f1797b == null) {
                        GameEngine.PrintLog("active.build==null");
                    }
                    if (!m3193a.f3997c) {
                        m3128ay();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m3217a(float f, Unit unit, C0235ad c0235ad, boolean z) {
        EnumC0307b m3100be = m3100be();
        float f2 = unit.f6951ek;
        float f3 = unit.f6952el;
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f2, f3);
        if (this.f3916ac != null) {
            if (m2366a < 490000.0f) {
                if (m2366a < 48400.0f) {
                    c0235ad.f1520d = false;
                }
                float m2366a2 = CommonUtils.m2366a(this.f3916ac.f6951ek, this.f3916ac.f6952el, f2, f3);
                if (m2366a2 < 48400.0f) {
                    c0235ad.f1520d = false;
                }
                if (m2366a2 < 270400.0f && m3158aV()) {
                    c0235ad.f1520d = false;
                }
            }
            if (this.f3916ac.f3891Q == unit) {
                c0235ad.f1520d = false;
            }
            if (c0235ad.f1520d) {
                this.f3921ah = 0.0f;
            } else {
                this.f3921ah += f;
            }
        } else {
            this.f3921ah = 500.0f;
        }
        float m3031o = m3031o(unit);
        boolean z2 = true;
        if (m2366a < m3031o * m3031o) {
            if (this.f3891Q != unit) {
                if (C0248aq.m5741a(this, unit)) {
                    this.f3891Q = unit;
                    this.f3892R = 10.0f;
                    m3236M(-1);
                }
            } else {
                this.f3892R = 10.0f;
            }
            float f4 = m3031o;
            if (!isFixedFiring()) {
                f4 -= 1.0f;
                if (m3158aV()) {
                    f4 -= 2.0f;
                }
                if (mo3505e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (m2366a < f4 * f4 && m3100be() != EnumC0307b.f1831d) {
                if (unit == null) {
                    z2 = false;
                } else if (m3050i(unit)) {
                    z2 = false;
                    if (z) {
                        this.f3902k = false;
                    }
                } else if (!m3047j(unit)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f3902k = true;
            this.f3903l = f2;
            this.f3904m = f3;
            this.f3905n = 0;
            if (m3100be == EnumC0307b.f1831d) {
                m3225a(m2366a, f2, f3);
            }
            this.f3905n = m3026q(unit);
            if (this.f3910s > 90.0f) {
                this.f3910s = 90.0f;
            }
            if (m2366a < 810000.0f) {
                if (m5802cr() || m3158aV()) {
                    this.f3901j = true;
                }
                if (!c0235ad.f1520d && this.f3921ah < 120.0f) {
                    this.f3910s = 0.1f;
                    this.f3901j = true;
                }
            }
        }
    }

    /* renamed from: g */
    private void m3060g(float f, C0305au c0305au, C0235ad c0235ad) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (m3100be() == EnumC0307b.f1831d) {
            if (c0305au != null && ((c0305au.f1800h == null || c0305au.f1800h.isDead || c0305au.f1800h.team == this.team) && !this.f3931ar)) {
                if (this.f3891Q != null && this.f3891Q.isDead) {
                    this.f3891Q = null;
                }
                m3185a(gameEngine, f, m3111b(true) + 200.0f);
                if (this.f3891Q != null) {
                    c0305au.f1800h = this.f3891Q;
                    m3178aB();
                    m3172aH();
                } else {
                    this.f3931ar = true;
                    this.f3930aq = true;
                }
            }
            if (c0305au != null && (c0305au.f1800h == null || c0305au.f1800h.isDead || c0305au.f1800h.team == this.team)) {
                if (c0305au.f1800h == null) {
                    m3128ay();
                    c0305au = null;
                } else if (!this.f3930aq) {
                    m3128ay();
                    c0305au = null;
                }
            }
        } else if (c0305au.f1800h == null || c0305au.f1800h.isDead || c0305au.f1800h.team == this.team) {
            boolean z = true;
            if (m3131av() > 1) {
                z = false;
            }
            c0305au.f1800h = null;
            if (z) {
                if (this.f3891Q != null && this.f3891Q.isDead) {
                    this.f3891Q = null;
                }
                m3185a(gameEngine, f, m3111b(true));
                if (this.f3891Q != null) {
                    c0305au.f1800h = this.f3891Q;
                    m3178aB();
                    m3172aH();
                }
            }
            if (c0305au.f1800h == null) {
                m3128ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1800h != null && !c0305au.f1800h.isDead && !c0305au.f1800h.m5814cf() && this.team.m6354c(c0305au.f1800h.team) && !C0248aq.m5739b(this, c0305au.f1800h)) {
            m3128ay();
            return;
        }
        if (c0305au != null && !m3162aR() && !canAttack()) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null) {
            m3217a(f, c0305au.f1800h, c0235ad, false);
        }
    }

    /* renamed from: h */
    private void m3056h(float f, C0305au c0305au, C0235ad c0235ad) {
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        if (c0305au.f1800h == null || c0305au.f1800h.isDead) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null && !c0305au.f1800h.m5792d(this, false)) {
            m3128ay();
        }
        if (c0305au != null) {
            this.f1602bP = c0305au.f1800h;
            boolean z = false;
            if (c0305au.f1800h.m5867bI()) {
                if (m2366a < 961.0f) {
                    this.f3900X += f;
                }
                if (this.f3900X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1800h.m5818cb().m7210a()) {
                    f2 = 11.0f;
                }
                if (this.f3883b > 0.0f) {
                    f2 = c0305au.f1800h.radius + 31.0f;
                }
                if (m2366a < f2 * f2) {
                    z = true;
                }
            } else if (m2366a < 441.0f) {
                z = true;
            }
            if (!z) {
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                }
                this.f3909r = 18;
                if (m2366a < 48400.0f) {
                    c0235ad.f1520d = false;
                    if (this.f3910s > 0.0f && this.f3968aT == null) {
                        this.f3901j = true;
                    }
                }
                if (this.f3916ac != null && !this.f3916ac.isActive()) {
                    c0235ad.f1520d = false;
                }
            }
            if (z) {
                c0305au.f1800h.m5772e(this, false);
                m3128ay();
            }
        }
    }

    /* renamed from: a_ */
    public float m3153a_(Unit unit) {
        float mo5718D = unit.getUnitType().mo5718D();
        if (unit.mo3230V() == 2) {
            mo5718D *= 0.5f;
        }
        if (unit.mo3230V() == 3) {
            mo5718D *= 0.25f;
        }
        return mo5718D * m5873b(unit);
    }

    /* renamed from: f */
    public float m3062f(Unit unit) {
        return 0.001f * 5.1f;
    }

    /* renamed from: g */
    public C0424b m3058g(Unit unit) {
        if (unit.f1583bx != null) {
            return unit.f1583bx;
        }
        return unit.getUnitType().mo5720B();
    }

    /* renamed from: i */
    private void m3052i(float f, C0305au c0305au, C0235ad c0235ad) {
        int u;
        boolean x;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        boolean z2 = false;
        if (c0305au == null) {
            return;
        }
        float m5670g = c0305au.m5670g();
        float m5668h = c0305au.m5668h();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m5670g, m5668h);
        if (c0305au != null && c0305au.f1796a == EnumC0306av.f1816g && c0305au.f1800h != null && c0305au.f1800h.mo4209g() > 0.0f) {
            z2 = true;
        }
        if (c0305au != null && (c0305au.f1800h == null || c0305au.f1800h.isDead || c0305au.f1800h.f1650cL != null)) {
            if (z2) {
                z = true;
            } else {
                m3129ax();
                c0305au = null;
            }
        }
        if (c0305au != null && !z && z2 && c0305au.f1800h != null) {
            boolean z3 = true;
            if (this.f3896i < gameEngine.f6096by - 100) {
                z3 = false;
            }
            if (!mo3501g(c0305au.f1800h, z3)) {
                z = true;
            }
            if (!z) {
                this.f3896i = gameEngine.f6096by;
            }
        }
        if (c0305au != null && z) {
            C0449h c0449h = null;
            if (c0305au.f1800h != null) {
                c0449h = c0305au.f1800h.m5830cQ();
            }
            Unit m3190a = m3190a(this, c0305au.f1800h.f6951ek, c0305au.f1800h.f6952el, m5829cR(), c0449h);
            if (m3190a != null) {
                c0305au.f1800h = m3190a;
                m3178aB();
            } else {
                m3129ax();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1796a == EnumC0306av.f1813d) {
                if (!mo3518a(c0305au.f1800h)) {
                    m3128ay();
                    c0305au = null;
                }
            } else if (!z2 && !m3040l(c0305au.f1800h)) {
                m3128ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1796a == EnumC0306av.f1813d && c0305au.f1800h != null && c0305au.f1800h.f1631cs >= c0305au.f1800h.f1632ct && c0305au.f1800h.f1623ck >= 1.0f) {
            m3129ax();
            c0305au = null;
        }
        if (c0305au != null && c0305au.f1800h == this) {
            m3128ay();
            c0305au = null;
        }
        if (c0305au != null && c0305au != null && c0305au.f1800h != null && c0305au.f1800h.mo4209g() != 0.0f) {
            boolean z4 = false;
            if (c0305au.f1796a == EnumC0306av.f1813d) {
                z4 = true;
            }
            if (z4) {
                m3128ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1796a == EnumC0306av.f1816g && c0305au.f1800h.team != this.team && c0305au.f1800h.mo4209g() == 0.0f) {
            boolean z5 = true;
            if (gameEngine.m1220O() && this.team.m6342d(c0305au.f1800h.team)) {
                z5 = false;
            }
            if (z5) {
                m3128ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1796a == EnumC0306av.f1816g) {
                u = mo3494v(c0305au.f1800h);
                x = m5754w(c0305au.f1800h);
            } else {
                u = mo3495u(c0305au.f1800h);
                x = m5753x(c0305au.f1800h);
            }
            if (this.f3916ac != null) {
                float m2366a2 = CommonUtils.m2366a(this.f3916ac.f6951ek, this.f3916ac.f6952el, m5670g, m5668h);
                int i = u + 80;
                if (m2366a2 < i * i) {
                    c0235ad.f1520d = false;
                }
                C0305au m3135ar = this.f3916ac.m3135ar();
                if (m3135ar == null) {
                    c0235ad.f1520d = false;
                }
                if (m3135ar != null && !c0305au.m5681b(m3135ar)) {
                    c0235ad.f1520d = false;
                }
            }
            float f2 = u;
            if (this.f3895h) {
                f2 += 5.0f;
            }
            if (u <= 30) {
            }
            if (m2366a > f2 * f2) {
                if (!m3162aR() || c0305au.f1808k == 0.0f) {
                    m3128ay();
                    return;
                }
                boolean z6 = false;
                if (c0305au.f1808k >= 0.0f) {
                    if (c0305au.f1808k < CommonUtils.m2361a((int) m2366a) - f2) {
                        z6 = true;
                    }
                }
                if (z6) {
                    m3128ay();
                    return;
                }
                this.f3902k = true;
                this.f3903l = m5670g;
                this.f3904m = m5668h;
                if (u > 58) {
                    this.f3905n = (int) ((u - 41.0f) / (gameEngine.f6104bL.f784n * 1.414f));
                } else {
                    this.f3905n = 0;
                }
                if (u < 30 || x) {
                    if (m2366a < 841.0f) {
                        this.f3901j = true;
                    }
                    float f3 = u + 14;
                    if (m2366a < f3 * f3 && this.f3910s > 0.0f && this.f3968aT == null) {
                        this.f3901j = true;
                    }
                }
                this.f3909r = this.f3905n;
                if (this.f3910s > 90.0f) {
                    this.f3910s = 90.0f;
                    return;
                }
                return;
            }
            int m3160aT = m3160aT();
            if (m3160aT == -1) {
                m3160aT = 0;
            }
            float f4 = 0.0f;
            if (m3017x()) {
                f4 = m3124b(f, m5670g, m5668h);
            }
            boolean z7 = false;
            if (CommonUtils.m2294c(f4) < 30.0f || !m3017x()) {
                this.f3895h = true;
                c0235ad.f1517a = true;
                C0247ap c0247ap = this.f1648cJ[m3160aT];
                if (c0247ap.f1716f < mo3505e(m3160aT)) {
                    c0247ap.f1716f += f;
                } else {
                    c0247ap.f1716f = mo3505e(m3160aT);
                    z7 = true;
                }
            }
            if (z7) {
                Unit unit = c0305au.f1800h;
                if (c0305au.f1796a != EnumC0306av.f1816g) {
                    if (unit.f1623ck < 1.0f) {
                        mo3107bC();
                        float m3153a_ = m3153a_(unit);
                        float f5 = m3153a_ * f;
                        boolean z8 = false;
                        boolean z9 = false;
                        C0424b m3058g = m3058g(unit);
                        if (m3058g != null) {
                            if (unit.f1623ck + f5 > 1.0f) {
                                f5 = 1.0f - unit.f1623ck;
                                z8 = true;
                            }
                            double d = (unit.f1623ck + f5) - unit.f1624cl;
                            double d2 = 0.0d;
                            if (z8) {
                                d2 = 1.0f - unit.f1624cl;
                            } else if (d >= 0.0010000000474974513d) {
                                d2 = ((int) (d / 0.0010000000474974513d)) * 0.0010000000474974513d;
                            }
                            boolean z10 = false;
                            if (d2 > 0.0d && this.team.f1358al.m5136a(m3058g)) {
                                z10 = true;
                            }
                            if (!z10 && (d2 <= 0.0d || m3058g.m5232c(this, d2))) {
                                unit.f1624cl = (float) (unit.f1624cl + d2);
                            } else {
                                if (!z10) {
                                    this.team.f1358al.m5135a(m3058g, this, d2);
                                }
                                f5 = 0.0f;
                                z8 = false;
                                z9 = true;
                            }
                        }
                        if (!z9) {
                            m3202a(unit, f, m3160aT);
                            float f6 = unit.f1623ck + f5;
                            if (z8) {
                                f6 = 1.0f;
                            }
                            unit.m5759r(f6);
                            if (f6 >= 1.0f && m3153a_ < 0.3d && unit.team == gameEngine.f6093bs) {
                                gameEngine.f6111bS.f5108f.m2105a(unit);
                            }
                            this.f3962aN = false;
                            return;
                        }
                        this.f3962aN = true;
                        return;
                    }
                    m3202a(unit, f, m3160aT);
                    unit.f1631cs += m5849c(unit) * f;
                    if (unit.f1631cs > unit.f1632ct) {
                        unit.f1631cs = unit.f1632ct;
                        m3128ay();
                    }
                    this.f3962aN = false;
                    return;
                }
                m3119b(unit, f, m3160aT);
                this.f3962aN = false;
                mo3107bC();
                boolean z11 = false;
                boolean y = m5752y(unit);
                float z12 = m5751z(unit);
                boolean z13 = c0305au.f1800h.mo4209g() > 0.0f;
                C0424b m3058g2 = m3058g(unit);
                if (z13 || m3058g2 != null) {
                }
                boolean z14 = false;
                if (!z13 && this.f3897U < 100.0f && !z13) {
                    if (unit.f1623ck < 0.5d) {
                        if (m3058g2 == null) {
                            z14 = true;
                        }
                    } else if (unit.f1631cs / unit.f1632ct < 0.5d) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    if (unit.f1623ck < 1.0f) {
                        float m3062f = m3062f(unit) * f;
                        if (m3062f >= unit.f1623ck) {
                            m3062f = unit.f1623ck;
                            unit.f1623ck = 0.0f;
                        } else {
                            unit.f1623ck -= m3062f;
                        }
                        unit.f1624cl = unit.f1623ck;
                        if (m3058g2 != null) {
                            m3058g2.m5225a((Unit) this, m3062f, true);
                        }
                        if (unit.f1623ck <= 0.0f) {
                            z11 = true;
                        }
                    } else {
                        float f7 = z12 * f;
                        if (f7 >= unit.f1631cs) {
                            f7 = unit.f1631cs;
                            unit.f1631cs = -1.0f;
                        } else {
                            unit.f1631cs -= f7;
                        }
                        unit.f1678dn = 1000.0f;
                        if (y) {
                            float f8 = f7 / unit.f1632ct;
                            C0424b m5835cL = unit.m5835cL();
                            C0424b m5834cM = unit.m5834cM();
                            if (m5834cM != null) {
                                m5835cL = m5834cM;
                            }
                            if (z13 || m3058g2 != null) {
                            }
                            if (m5835cL.m5231a() > 0) {
                                this.f3914aa += f8 * m5835cL.m5231a();
                                if (this.f3914aa > 1.0f) {
                                    this.team.f1309o += (int) this.f3914aa;
                                    this.f3914aa -= (int) this.f3914aa;
                                }
                                m5835cL.m5225a((Unit) this, f8, false);
                            } else {
                                m5835cL.m5225a((Unit) this, f8, true);
                            }
                        }
                        if (unit.f1631cs <= 0.0f) {
                            z11 = true;
                        }
                    }
                }
                if (z11 && !unit.isDead) {
                    if (!y) {
                        C0424b m5834cM2 = unit.m5834cM();
                        if (m5834cM2 != null) {
                            GameEngine.PrintLog("refund: " + m5834cM2.m5210a(false, true, 10, true));
                            m5834cM2.m5225a((Unit) this, 1.0d, true);
                        } else {
                            C0424b m5835cL2 = unit.m5835cL();
                            if (unit.f1582bw != null) {
                                m5835cL2 = unit.f1582bw;
                                GameEngine.PrintLog("refund==null overridePriceBuildCost: " + m5835cL2.m5210a(false, true, 10, true));
                            }
                            m5835cL2.m5225a((Unit) this, 0.800000011920929d, true);
                            if (unit.f1623ck >= 1.0f && m3058g2 != null) {
                                m3058g2.m5225a((Unit) this, 0.800000011920929d, true);
                            }
                        }
                    }
                    unit.isDead = true;
                    unit.f1607bU = gameEngine.f6096by;
                    unit.m5812ch();
                    if ((unit instanceof AbstractC0623y) && unit.m5867bI()) {
                        gameEngine.f6113bU.m1312a((AbstractC0623y) unit);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m3045k(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1602bP != null) {
            this.f1602bP = null;
        }
        if (this.f1603bQ != null) {
            this.f1604bR = CommonUtils.m2368a(this.f1604bR, f);
            this.f1602bP = this.f1603bQ;
            if (this.f1604bR == 0.0f) {
                this.f1603bQ = null;
            }
        }
        if (this.f3910s != 0.0f) {
            this.f3910s = CommonUtils.m2368a(this.f3910s, f);
        }
        if (this.f1616cd != 0.0f) {
            this.f3884c = CommonUtils.m2368a(this.f3884c, f);
        }
        C0305au m3135ar = m3135ar();
        this.f3901j = false;
        boolean z = this.f3902k;
        this.f3902k = false;
        this.f3911t = false;
        this.f3909r = 150;
        if (m3135ar != null && m3135ar.f1809l > 0.0f && m3135ar.f1809l < this.f3897U) {
            m3129ax();
            m3135ar = null;
        }
        C0235ad c0235ad = f3963aO;
        c0235ad.m5966a();
        if (m3135ar != null) {
            this.f3897U += f;
            EnumC0306av enumC0306av = m3135ar.f1796a;
            if (enumC0306av == EnumC0306av.f1810a || enumC0306av == EnumC0306av.f1817h || enumC0306av == EnumC0306av.f1819j) {
                m3215a(f, m3135ar, c0235ad, z);
            } else if (enumC0306av == EnumC0306av.f1811b) {
                m3060g(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1812c) {
                m3064f(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1813d || enumC0306av == EnumC0306av.f1816g) {
                m3052i(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1814e) {
                m3056h(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1818i) {
                m3066e(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1822m) {
                m3070d(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1820k || enumC0306av == EnumC0306av.f1821l || enumC0306av == EnumC0306av.f1823n) {
                m3077c(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1824o || enumC0306av == EnumC0306av.f1825p) {
                m3216a(f, m3135ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1826q) {
                m3123b(f, m3135ar, c0235ad);
            }
            if (m3135ar != m3135ar()) {
                m3135ar = null;
            }
        }
        this.f3895h = c0235ad.f1517a;
        if (m3135ar != null && m3135ar.f1803m && this.f3887f > 1) {
            boolean z2 = true;
            C0305au m3044k = m3044k(1);
            if (m3044k != null && (m3044k.f1796a == EnumC0306av.f1820k || m3044k.f1796a == EnumC0306av.f1819j)) {
                z2 = false;
            }
            if (z2) {
                m3128ay();
                m3135ar = null;
            }
        }
        if (m3135ar == null) {
            this.f3902k = false;
        }
        if (this.f3902k) {
            C0399m dl = m5778dl();
            if (dl != null && dl.f2460H) {
                m3081bx();
            }
        } else if (this.f3908q != 0) {
            this.f3908q = (byte) 0;
        }
        m3112b(gameEngine, f);
        m3184a(gameEngine, f, m3135ar, c0235ad);
    }

    /* renamed from: a */
    private void m3225a(float f, float f2, float f3) {
        if (this.f3929ap < -900.0f) {
            this.f3929ap = CommonUtils.m2280d(this.f6951ek, this.f6952el, f2, f3);
        }
        if (f < 10000.0f && m5855bW()) {
            this.f3930aq = true;
        }
        if (this.f3930aq) {
            if (this.f1638cz < mo3101bd() * 0.6d || (f < 40000.0f && this.f1638cz < mo3101bd())) {
                this.f3903l += CommonUtils.m2249i(this.f3929ap + 180.0f) * 600.0f;
                this.f3904m += CommonUtils.sin(this.f3929ap + 180.0f) * 600.0f;
                return;
            }
            this.f3930aq = false;
            this.f3929ap = -999.0f;
            m3172aH();
        }
    }

    /* renamed from: a */
    private void m3219a(float f, C0237af c0237af, C0235ad c0235ad, C0305au c0305au) {
        C0237af m3032o;
        C0237af m3032o2;
        float f2;
        float f3;
        float f4;
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y abstractC0623y = this.f3916ac;
        float f5 = abstractC0623y.f6951ek + this.f3923aj;
        float f6 = abstractC0623y.f6952el + this.f3924ak;
        int i = gameEngine.f6096by - abstractC0623y.f3926am;
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f5, f6);
        if (i > 300 || this.f3883b > 1.0f) {
            this.f3885d += f;
        }
        boolean z = false;
        if (this.f3885d > 300.0f) {
            z = true;
        }
        if (i > 300 && m2366a > 250000.0f) {
            z = true;
        }
        if (this.f3883b > 1.0f) {
            if (this.f3884c != 0.0f) {
                z = true;
            }
            if (this.f3885d > 10.0f) {
                z = true;
            }
        }
        if (z) {
            this.f3884c = 90.0f;
        }
        if (this.f3884c == 0.0f) {
            m3172aH();
            c0235ad.f1521e = f5;
            c0235ad.f1522f = f6;
            C0237af c0237af2 = null;
            if (i < 3000 && 0 == 0 && abstractC0623y.f3936v > 2 && abstractC0623y.f3936v - abstractC0623y.f3934av <= 2) {
                c0237af2 = abstractC0623y.m3032o(2);
            }
            if (i < 1500 && c0237af2 == null && abstractC0623y.f3936v > 0 && abstractC0623y.f3934av + 0 >= abstractC0623y.f3936v) {
                C0237af m3032o3 = abstractC0623y.m3032o(0);
                c0237af2 = f3970aV;
                float m2280d = CommonUtils.m2280d(abstractC0623y.f6951ek, abstractC0623y.f6952el, m3032o3.f1527a, m3032o3.f1528b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                c0237af2.f1527a = abstractC0623y.f6951ek + (CommonUtils.m2249i(m2280d) * f7);
                c0237af2.f1528b = abstractC0623y.f6952el + (CommonUtils.sin(m2280d) * f7);
            }
            if (c0237af2 != null) {
                c0235ad.f1519c = true;
                c0235ad.f1521e = c0237af2.f1527a + this.f3923aj;
                c0235ad.f1522f = c0237af2.f1528b + this.f3924ak;
            } else if (abstractC0623y.f3936v >= 2 && abstractC0623y.f3934av >= 1) {
                if (abstractC0623y.f3934av >= 2) {
                    m3032o = abstractC0623y.m3032o(0);
                    m3032o2 = abstractC0623y.m3032o(1);
                } else {
                    m3032o = abstractC0623y.m3032o(0);
                    m3032o2 = abstractC0623y.m3032o(0);
                }
                if (m3032o != null && m3032o2 != null) {
                    float m2291c = 1.0f - ((CommonUtils.m2291c(abstractC0623y.f6951ek, abstractC0623y.f6952el, m3032o.f1527a, m3032o.f1528b) - 15.0f) * 0.05f);
                    if (m2291c > 2.0f) {
                        m2291c = 2.0f;
                    }
                    if (m2291c < 0.0f) {
                        m2291c = 0.0f;
                    }
                    if (m2291c > 1.0f) {
                        if (abstractC0623y.f3934av >= 3) {
                            C0237af m3032o4 = abstractC0623y.m3032o(2);
                            float f8 = m3032o2.f1527a - m3032o.f1527a;
                            float f9 = m3032o2.f1528b - m3032o.f1528b;
                            f2 = f8 + ((m3032o4.f1527a - m3032o2.f1527a) * (m2291c - 1.0f));
                            f3 = f9 + ((m3032o4.f1528b - m3032o2.f1528b) * (m2291c - 1.0f));
                        } else {
                            f2 = m3032o2.f1527a - m3032o.f1527a;
                            f3 = m3032o2.f1528b - m3032o.f1528b;
                        }
                    } else {
                        f2 = (m3032o2.f1527a - m3032o.f1527a) * m2291c;
                        f3 = (m3032o2.f1528b - m3032o.f1528b) * m2291c;
                    }
                    c0235ad.f1521e = m3032o.f1527a + this.f3923aj + f2;
                    c0235ad.f1522f = m3032o.f1528b + this.f3924ak + f3;
                }
            }
            float f10 = 45.0f;
            if (this.f3883b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.f3883b <= 1.0f) {
                f10 = 110.0f;
            }
            if (m2366a < f10 * f10) {
                this.f3885d = 0.0f;
            }
            boolean z2 = false;
            C0305au m3135ar = abstractC0623y.m3135ar();
            if (m3135ar == null || c0305au != null) {
            }
            if (m3135ar == null || 0 != 0) {
                this.f3886e += f;
                boolean z3 = false;
                if (c0305au != null && (c0305au.f1796a == EnumC0306av.f1810a || c0305au.f1796a == EnumC0306av.f1817h || c0305au.f1796a == EnumC0306av.f1819j)) {
                    z3 = true;
                }
                if (z3 && this.f3886e > 600.0f) {
                    f4 = 260.0f;
                } else if (z3 && this.f3886e > 360.0f) {
                    f4 = 140.0f;
                } else if (z3 && this.f3886e > 180.0f) {
                    f4 = 70.0f;
                } else if (z3 && this.f3886e > 120.0f) {
                    f4 = 50.0f;
                } else {
                    f4 = 16.0f;
                }
                if (m2366a < f4 * f4) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (m3135ar == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && CommonUtils.m2294c(m3078c(f, this.f3925al)) < 3.0f && c0305au != null) {
                    if (c0305au.f1796a == EnumC0306av.f1810a || c0305au.f1796a == EnumC0306av.f1817h) {
                        m3128ay();
                        if (abstractC0623y != null) {
                            boolean z5 = false;
                            C0305au m3135ar2 = m3135ar();
                            C0305au m3135ar3 = abstractC0623y.m3135ar();
                            if (m3135ar2 != null && m3135ar3 != null && m3135ar2.m5681b(m3135ar3)) {
                                z5 = true;
                            }
                            if (!z5) {
                                m3191a((AbstractC0623y) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (0 == 0) {
                c0235ad.f1518b = true;
                return;
            } else {
                return;
            }
        }
        C0237af c0237af3 = null;
        if (0 == 0 && abstractC0623y.f3936v > 2 && 8 < abstractC0623y.f3934av) {
            c0237af3 = abstractC0623y.m3032o(8);
        }
        if (c0237af3 == null) {
            c0237af3 = f3970aV;
            c0237af3.f1527a = abstractC0623y.f6951ek;
            c0237af3.f1528b = abstractC0623y.f6952el;
        }
        float m2366a2 = CommonUtils.m2366a(this.f6951ek, this.f6952el, c0237af3.f1527a, c0237af3.f1528b);
        float f11 = this.radius + abstractC0623y.radius + 15.0f;
        float f12 = this.radius + abstractC0623y.radius + 100.0f;
        if (m2366a2 < f11 * f11) {
            this.f3885d = 0.0f;
            this.f3884c = 0.0f;
        } else if (m2366a2 < f12 * f12) {
        }
        if (this.f3968aT == null && c0237af != null && ((CommonUtils.m2294c(this.f3906o - c0237af3.f1527a) > 300.0f || CommonUtils.m2294c(this.f3907p - c0237af3.f1528b) > 300.0f) && this.f3910s > 30.0f)) {
            this.f3910s = 30.0f;
        }
        if (this.f3910s == 0.0f && this.f3968aT == null) {
            this.f3910s = 700.0f;
            m3223a(c0237af3.f1527a, c0237af3.f1528b, 0, false, false);
        }
        if (c0237af != null) {
            c0235ad.f1521e = c0237af.f1527a;
            c0235ad.f1522f = c0237af.f1528b;
            if (0 == 0) {
                c0235ad.f1518b = true;
            }
        }
    }

    /* renamed from: a */
    private void m3184a(GameEngine gameEngine, float f, C0305au c0305au, C0235ad c0235ad) {
        C0305au m3135ar;
        boolean mo3295I = mo3295I();
        if (this.f3968aT != null) {
            m3113b(gameEngine);
        }
        if (this.f3916ac != null && (this.f3916ac.isDead || !this.f3916ac.isActive())) {
            m3191a((AbstractC0623y) null);
        }
        if (this.f3902k) {
            C0237af m3175aE = m3175aE();
            C0305au m3135ar2 = m3135ar();
            if (m3135ar2 == null) {
                c0235ad.f1520d = false;
            }
            if (f3991K) {
                c0235ad.f1520d = false;
            }
            if (this.f3917ad && this.f3919af > 0 && m3173aG()) {
                this.f3926am = gameEngine.f6096by;
            }
            if (m3135ar2 != null && this.f3916ac != null && c0235ad.f1520d && (m3135ar = this.f3916ac.m3135ar()) != null && !m3135ar.m5681b(m3135ar2)) {
                c0235ad.f1520d = false;
            }
            if (this.f3916ac != null && c0235ad.f1520d) {
                m3219a(f, m3175aE, c0235ad, c0305au);
            } else if (this.f1622cj != 0.0f) {
                c0235ad.f1521e = this.f3903l;
                c0235ad.f1522f = this.f3904m;
                c0235ad.f1518b = true;
            } else {
                boolean z = false;
                if (this.f3968aT == null) {
                    if (m3175aE == null) {
                        if (this.f3935u && this.f3910s < 450.0f && this.f3968aT == null) {
                            z = true;
                        }
                        if (this.f3910s == 0.0f) {
                            z = true;
                        }
                    }
                    if (this.f3910s == 0.0f && (m5802cr() || m3158aV())) {
                        float maxAttackRange = getMaxAttackRange() - 1.0f;
                        if (CommonUtils.m2294c(this.f3906o - this.f3903l) > maxAttackRange || CommonUtils.m2294c(this.f3907p - this.f3904m) > maxAttackRange) {
                            z = true;
                        }
                    }
                    if (c0305au != null && this.f3910s == 0.0f && ((c0305au.f1796a == EnumC0306av.f1814e || c0305au.f1796a == EnumC0306av.f1818i) && (CommonUtils.m2294c(this.f3906o - this.f3903l) > 12.0f || CommonUtils.m2294c(this.f3907p - this.f3904m) > 12.0f))) {
                        z = true;
                    }
                    if (c0305au != null) {
                        float f2 = this.f3909r;
                        if (CommonUtils.m2294c(this.f3906o - this.f3903l) > f2 || CommonUtils.m2294c(this.f3907p - this.f3904m) > f2) {
                            if (this.f3910s > 30.0f) {
                                this.f3910s = 30.0f;
                            }
                            if (this.f3910s == 0.0f) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.f3910s = 500.0f;
                    m3223a(this.f3903l, this.f3904m, this.f3905n, this.f3917ad && this.f3920ag > 1, this.f3911t);
                }
                if (m3175aE != null && this.f3932at == null && this.f3934av >= 2 && getMoveSpeed() > 5.0f) {
                    C0237af c0237af = this.f3933au[1];
                    float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, m3175aE.f1527a, m3175aE.f1528b);
                    float m2366a2 = CommonUtils.m2366a(this.f6951ek, this.f6952el, c0237af.f1527a, c0237af.f1528b);
                    if (m2366a < 36.0f) {
                        m3170aJ();
                        m3175aE = m3175aE();
                    } else if (m2366a2 < 361.0f) {
                        m3170aJ();
                        m3175aE = m3175aE();
                    }
                }
                if (m3175aE != null) {
                    c0235ad.f1521e = m3175aE.f1527a;
                    c0235ad.f1522f = m3175aE.f1528b;
                    c0235ad.f1518b = true;
                } else if (this.f3901j) {
                    c0235ad.f1521e = this.f3903l;
                    c0235ad.f1522f = this.f3904m;
                    c0235ad.f1518b = true;
                }
            }
        }
        m3220a(f, c0235ad, c0305au, mo3295I);
    }

    /* renamed from: a */
    private void m3220a(float f, C0235ad c0235ad, C0305au c0305au, boolean z) {
        float f2 = 0.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3902k && c0235ad.f1518b && z) {
            float f3 = c0235ad.f1521e;
            float f4 = c0235ad.f1522f;
            float moveSpeed = getMoveSpeed();
            float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f3, f4);
            float m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f3, ((f4 - this.f6952el) * m3104ba()) + this.f6952el);
            boolean z2 = false;
            float mo3532bc = mo3532bc();
            if (mo3532bc > 0.95f) {
                z2 = true;
            } else if (mo3532bc > 0.87d) {
                if (this.f3920ag <= 1 && this.f3934av > 0 && this.f3934av <= 9 && this.f3917ad && m2366a < 250000.0f) {
                    z2 = true;
                }
            } else if (mo3532bc > 0.7d) {
                if (this.f3920ag <= 1 && this.f3934av > 0 && this.f3934av <= 4 && this.f3917ad && m2366a < 40000.0f) {
                    z2 = true;
                }
            } else if (mo3532bc > 0.4d && this.f3920ag <= 1 && this.f3934av > 0 && this.f3934av <= 2 && this.f3917ad && m2366a < 10000.0f) {
                z2 = true;
            }
            float f5 = 179.0f;
            if (this.f3891Q != null && isFixedFiring() && mo3998bj() && !m3158aV()) {
                this.f1618cf = m2280d;
            } else if (this.f3940ay <= 0.0f) {
                f5 = m3221a(f, m2280d, true, z2);
            }
            float f6 = 20.0f;
            if (m2366a > 361.0f) {
                f6 = 46.0f;
            }
            if (m2366a > 3600.0f) {
                f6 = 89.0f;
            }
            float turnSpeed = getTurnSpeed();
            if (turnSpeed < 1.4d) {
                if (m2366a > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (moveSpeed > 5.0f && this.f1616cd < 0.01d && this.f1616cd > -0.01d) {
                f6 = 1.0f;
            }
            if (turnSpeed < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.f1616cd > 0.4d && m2366a > 16900.0f) {
                f6 = 180.0f;
            }
            if (m3155aY() && this.f3936v == this.f3934av) {
                f6 = 1.0f;
            }
            if (mo3998bj()) {
                f6 = 181.0f;
            }
            boolean z3 = this.f3934av == 1;
            if ((!z3 || m2366a >= 4.0f * 4.0f) && CommonUtils.m2294c(f5) <= f6) {
                f2 = 1.0f;
                if (c0235ad.f1519c) {
                    if (m2366a < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (m2366a < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2366a < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.f3916ac != null) {
                    if (m2366a > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (m2366a < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2366a < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (m2366a < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z3 && f2 != 0.0f) {
                if (m2366a < 324.0f && getMoveDecelerationSpeed() < 0.13f && getMoveSpeed() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (m2366a < 169.0f && getMoveDecelerationSpeed() < 0.15f && getMoveSpeed() > 0.9f) {
                    f2 = 0.5f * f2;
                }
                if (moveSpeed > 5.0f) {
                    if (m2366a < 324.0f && f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    if (m2366a < 81.0f && f2 > 0.25f) {
                        f2 = 0.25f;
                    }
                }
            }
            boolean z4 = false;
            if (!z3 && m2366a < 256.0f) {
                z4 = true;
            }
            if (z3 && m2366a < 4.0f * 4.0f) {
                z4 = true;
            }
            if ((this.f3913Z == gameEngine.f6233bx || this.f3913Z == gameEngine.f6233bx - 1) && this.f3912Y != null && this.f3912Y.m5850c(f3, f4, 2.0f)) {
                z4 = true;
            }
            if (f2 > 0.0f) {
                this.f3898V += f;
                if (this.f3898V > 200.0f && m2366a < 3600.0f && this.f3934av >= 2) {
                    float f7 = this.f3898V;
                    m3170aJ();
                    this.f3898V = f7;
                }
                if (this.f3898V > 600.0f && this.f3934av >= 2 && this.f3932at == null) {
                    m3172aH();
                }
                if (this.f3898V > 80.0f && this.f3883b > 30.0f) {
                    m3172aH();
                }
                if (this.f3898V > 40.0f && this.f3934av >= 2 && this.f3932at == null) {
                    C0237af c0237af = this.f3933au[1];
                    if (CommonUtils.m2366a(this.f6951ek, this.f6952el, c0237af.f1527a, c0237af.f1528b) < m2366a) {
                        float f8 = this.f3898V;
                        m3170aJ();
                        this.f3898V = f8;
                    }
                }
            }
            if (z4) {
                m3170aJ();
                if (z3) {
                    this.f3885d = 0.0f;
                    this.f3884c = 0.0f;
                    if (!this.f3935u && this.f3916ac == null && c0305au != null && c0305au.f1796a == EnumC0306av.f1810a) {
                        m3129ax();
                    }
                }
            }
        }
        if (this.f1619cg && !mo3998bj()) {
            f2 = (-f2) * mo3532bc();
        }
        if (this.f3940ay > 0.0f) {
            f2 = 0.0f;
        }
        if (!mo3999bi()) {
            if (this.f1616cd < f2) {
                this.f1616cd = CommonUtils.m2367a(this.f1616cd, f2, getMoveAccelerationSpeed() * f);
            }
            if (this.f1616cd > f2) {
                this.f1616cd = CommonUtils.m2367a(this.f1616cd, f2, getMoveDecelerationSpeed() * f);
            }
        } else {
            this.f1616cd = f2;
        }
        this.f1647cI = c0235ad.f1518b && z;
    }

    @Deprecated
    /* renamed from: Z */
    public boolean m3226Z() {
        return this.f3891Q != null;
    }

    /* renamed from: aa */
    public boolean m3152aa() {
        if (this.f3891Q != null && !this.f3891Q.isDead) {
            int mo3512bl = mo3512bl();
            for (int i = 0; i < mo3512bl; i++) {
                if (this.f1648cJ[i].f1720j != null && m3025r(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: ab */
    public Unit m3151ab() {
        if (this.f3891Q != null && !this.f3891Q.isDead) {
            return this.f3891Q;
        }
        C0305au m3135ar = m3135ar();
        if (m3135ar != null && m3135ar.f1800h != null && !m3135ar.f1800h.isDead) {
            return m3135ar.f1800h;
        }
        return null;
    }

    /* renamed from: a */
    private void m3185a(GameEngine gameEngine, float f, float f2) {
        f3964aP.m5965a(f2);
        gameEngine.f6121cc.m3792a(this.f6951ek, this.f6952el, f2, this, f, f3964aP);
        if (f3964aP.f1523a != 0) {
            if (this.f3891Q == null || !m3054h(this.f3891Q)) {
                f3965aQ.m5965a(f2);
                gameEngine.f6121cc.m3792a(this.f6951ek, this.f6952el, f2, this, f, f3965aQ);
            }
        }
    }

    /* renamed from: ac */
    public boolean m3150ac() {
        return mo3512bl() > 1;
    }

    /* renamed from: a */
    private void m3186a(GameEngine gameEngine, float f) {
        int mo3512bl = mo3512bl();
        if (!m3150ac()) {
            for (int i = 0; i < mo3512bl; i++) {
                this.f1648cJ[i].f1720j = this.f3891Q;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < mo3512bl; i2++) {
            C0247ap c0247ap = this.f1648cJ[i2];
            if (m3019v(i2) == -1) {
                if (m3209a(i2, this.f3891Q, false, false)) {
                    c0247ap.f1720j = this.f3891Q;
                } else {
                    z = true;
                    if (c0247ap.f1720j == this.f3891Q) {
                        c0247ap.f1720j = null;
                    }
                }
            }
        }
        if (z) {
            float m3111b = m3111b(false);
            f3967aS.m5962a(this);
            gameEngine.f6121cc.m3792a(this.f6951ek, this.f6952el, m3111b, this, f, f3967aS);
        }
        for (int i3 = 0; i3 < mo3512bl; i3++) {
            int m3019v = m3019v(i3);
            if (m3019v != -1) {
                this.f1648cJ[i3].f1720j = this.f1648cJ[m3019v].f1720j;
            }
        }
    }

    /* renamed from: ad */
    public boolean m3149ad() {
        if (!canAttack()) {
            return false;
        }
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2484M) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m3112b(GameEngine gameEngine, float f) {
        int mo3512bl = mo3512bl();
        boolean z = false;
        if (m3149ad()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.f3891Q != null) {
                C0399m dl = m5778dl();
                if (dl != null && this.f1651cM != null && dl.f2462L && this.f1651cM.f3891Q == this.f3891Q) {
                    z2 = true;
                }
                if (!m3198a(this.f3891Q, false) && !z2 && 1 != 0) {
                    this.f3891Q = null;
                }
            }
            if (this.f3891Q != null && !z2) {
                z3 = !m3054h(this.f3891Q);
            }
            this.f3892R = CommonUtils.m2368a(this.f3892R, f);
            this.f3893S = CommonUtils.m2368a(this.f3893S, f);
            if ((this.f3891Q == null || z3) && this.f3892R == 0.0f && m3099bf()) {
                this.f3892R = 20.0f + (this.f6951ek % 5.0f) + (this.f6952el % 5.0f);
                m3185a(gameEngine, f, m3111b(false));
                if (this.f3891Q != null) {
                    this.f3893S = 0.0f;
                }
            }
            if (this.f3891Q != null && this.f3893S == 0.0f) {
                this.f3893S = 20.0f + (this.f6951ek % 5.0f) + (this.f6952el % 5.0f);
                m3186a(gameEngine, f);
            }
            for (int i = 0; i < mo3512bl; i++) {
                this.f1648cJ[i].f1717g = false;
            }
            if (this.f3891Q != null) {
                float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, this.f3891Q.f6951ek, this.f3891Q.f6952el);
                float m3031o = m3031o(this.f3891Q);
                if (m2366a < m3031o * m3031o || z2) {
                    int m3160aT = m3160aT();
                    for (int i2 = 0; i2 < mo3512bl; i2++) {
                        C0247ap c0247ap = this.f1648cJ[i2];
                        Unit unit = c0247ap.f1720j;
                        if (unit != null) {
                            boolean z4 = unit == this.f3891Q;
                            if (!z4 && !m3117b(unit, true)) {
                                c0247ap.f1720j = null;
                            } else if (!m3209a(i2, unit, false, !z4)) {
                                c0247ap.f1720j = null;
                            } else {
                                PointF mo3523G = mo3523G(i2);
                                PointF m3238K = m3238K(i2);
                                m3238K.x += unit.f6951ek;
                                m3238K.y += unit.f6952el;
                                float m2280d = CommonUtils.m2280d(mo3523G.x, mo3523G.y, m3238K.x, m3238K.y);
                                if (m3019v(i2) == -1 && i2 != m3160aT) {
                                    if (!isFixedFiring()) {
                                        c0247ap.m5747a(70);
                                        c0247ap.f1712b = c0247ap.f1711a;
                                        float f2 = 179.0f;
                                        if (!c0247ap.m5746b()) {
                                            f2 = m3224a(f, m2280d, i2);
                                        }
                                        if (CommonUtils.m2294c(f2) < m3016x(i2)) {
                                            c0247ap.f1717g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        C0305au m3135ar = m3135ar();
                                        if (m3135ar != null && (m3135ar.f1796a == EnumC0306av.f1812c || m3135ar.f1796a == EnumC0306av.f1813d || m3135ar.f1796a == EnumC0306av.f1816g)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.f3902k || mo3998bj())) {
                                            float m3078c = m3078c(f, m2280d);
                                            c0247ap.f1712b = c0247ap.f1711a;
                                            if (CommonUtils.m2294c(m3078c) < m3016x(i2)) {
                                                c0247ap.f1717g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < mo3512bl; i3++) {
                        C0247ap c0247ap2 = this.f1648cJ[i3];
                        Unit unit2 = c0247ap2.f1720j;
                        if (unit2 != null) {
                            if (m3020u(i3) && c0247ap2.f1715e == 0.0f) {
                                z = true;
                            }
                            if (m3020u(i3)) {
                                m3218a(f, unit2, i3);
                            }
                        }
                    }
                } else if (!this.f3902k && m3139an()) {
                    this.f3901j = true;
                    this.f3902k = true;
                    this.f3903l = this.f3891Q.f6951ek;
                    this.f3904m = this.f3891Q.f6952el;
                    this.f3905n = 0;
                }
            }
        }
        if (this.f3961aM && m3228X() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < mo3512bl; i4++) {
            C0247ap c0247ap3 = this.f1648cJ[i4];
            if (!z && c0247ap3.f1716f != 0.0f) {
                c0247ap3.f1716f = CommonUtils.m2368a(c0247ap3.f1716f, mo3504f(i4) * f);
            }
        }
    }

    /* renamed from: b */
    public void m3118b(Unit unit, int i) {
    }

    /* renamed from: a */
    public boolean m3218a(float f, Unit unit, int i) {
        C0247ap c0247ap = this.f1648cJ[i];
        int m3019v = m3019v(i);
        if (m3019v != -1) {
            c0247ap.f1711a = this.f1648cJ[m3019v].f1711a;
        }
        boolean m3022s = m3022s(i);
        boolean z = false;
        if (m3022s) {
            if (c0247ap.f1716f < mo3505e(i)) {
                if (c0247ap.f1716f == 0.0f) {
                    m3118b(unit, i);
                }
                c0247ap.f1716f += f;
            } else {
                c0247ap.f1716f = mo3505e(i);
            }
            z = true;
        }
        if (c0247ap.f1715e == 0.0f && m3025r(i)) {
            if (!m3209a(i, unit, false, false)) {
                c0247ap.f1715e = -10.0f;
                return false;
            }
            if (!m3022s) {
                if (c0247ap.f1716f < mo3505e(i)) {
                    if (c0247ap.f1716f == 0.0f) {
                        m3118b(unit, i);
                    }
                    c0247ap.f1716f += f;
                } else {
                    z = true;
                }
            }
            if (z) {
                c0247ap.f1715e = getShootDelay(i) + m3021t(i);
                if (!m3022s) {
                    c0247ap.f1716f = 0.0f;
                }
                fireProjectile(unit, i);
                m3236M(i);
                c0247ap.f1723m = !c0247ap.f1723m;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m3054h(Unit unit) {
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el);
        float m3031o = m3031o(unit);
        if (m2366a < m3031o * m3031o) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean mo5653ae() {
        return false;
    }

    /* renamed from: af */
    public boolean canAttackFly() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo5652ag() {
        return true;
    }

    /* renamed from: ah */
    public boolean mo5651ah() {
        return true;
    }

    /* renamed from: i */
    public boolean m3050i(Unit unit) {
        int m3019v;
        int mo3512bl = mo3512bl();
        for (int i = 0; i < mo3512bl; i++) {
            if (m3025r(i) && m3209a(i, unit, false, false) && ((m3019v = m3019v(i)) == -1 || m3209a(m3019v, unit, false, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m3047j(Unit unit) {
        int m3019v;
        int mo3512bl = mo3512bl();
        for (int i = 0; i < mo3512bl; i++) {
            if (m3025r(i) && m3209a(i, unit, true, false) && ((m3019v = m3019v(i)) == -1 || m3209a(m3019v, unit, true, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3209a(int i, Unit unit, boolean z, boolean z2) {
        if (!z && z2 && !m3054h(unit)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m3043k(Unit unit) {
        if (unit.mo3293i()) {
            return canAttackFly();
        }
        if (unit.mo3294Q()) {
            return mo5653ae();
        }
        if (!mo5651ah() && !unit.m5840cG()) {
            return false;
        }
        return mo5652ag();
    }

    /* renamed from: a */
    public boolean mo3518a(Unit unit) {
        return false;
    }

    /* renamed from: l */
    public boolean m3040l(Unit unit) {
        if (unit.mo4209g() != 0.0f && m5763h(unit, true)) {
            return true;
        }
        return mo3518a(unit);
    }

    /* renamed from: a */
    public Action m3195a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m3196a(interfaceC0303as, -1, z);
    }

    /* renamed from: ai */
    public boolean m3144ai() {
        Iterator it = mo3520N().iterator();
        while (it.hasNext()) {
            if (((Action) it.next()).mo6181g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Action m3196a(InterfaceC0303as interfaceC0303as, int i, boolean z) {
        InterfaceC0303as m6102E;
        ArrayList N = mo3520N();
        Action action = null;
        if (N.size() > 0) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                Action action2 = (Action) it.next();
                InterfaceC0303as m6036y = action2.m6036y();
                if (z && (m6102E = action2.m6102E()) != null) {
                    m6036y = m6102E;
                }
                if (m6036y == interfaceC0303as && (i == -1 || i == action2.m6044t())) {
                    action = action2;
                    if (action2.mo4245b(this) && action2.mo4247a((Unit) this, false)) {
                        return action2;
                    }
                }
            }
        }
        return action;
    }

    /* renamed from: b */
    public boolean m3116b(InterfaceC0303as interfaceC0303as, boolean z) {
        Action m3195a = m3195a(interfaceC0303as, z);
        if (m3195a == null || m3195a.m6068g(this) || !m3195a.mo4245b(this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: aj */
    public boolean mo3143aj() {
        return getUnitType().mo5702m();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ak */
    public boolean mo3142ak() {
        return getUnitType().mo5703l();
    }

    /* renamed from: m */
    public void m3036m(Unit unit) {
    }

    /* renamed from: al */
    public boolean m3141al() {
        return false;
    }

    /* renamed from: a */
    public final boolean m3198a(Unit unit, boolean z) {
        if (this.team == unit.team || unit.isDead || !this.team.m6354c(unit.team) || this.f3889O == EnumC0205a.f1420d || this.f3889O == EnumC0205a.f1419c || unit.f1650cL != null || !m3043k(unit) || !unit.m5793d((Unit) this)) {
            return false;
        }
        if (!z) {
            float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el);
            float m3111b = m3111b(false);
            if (m2366a < m3111b * m3111b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m3117b(Unit unit, boolean z) {
        if (unit.m5801cs()) {
            return false;
        }
        return m3198a(unit, z);
    }

    /* renamed from: am */
    public float m3140am() {
        return 0.0f;
    }

    /* renamed from: an */
    public boolean m3139an() {
        return this.f3889O == EnumC0205a.f1417a || this.f3889O == EnumC0205a.f1421e || this.f3889O == EnumC0205a.f1422f;
    }

    /* renamed from: b */
    public float m3111b(boolean z) {
        float m3140am;
        float maxAttackRange = getMaxAttackRange();
        C0305au m3135ar = m3135ar();
        if (m3135ar != null && (m3135ar.f1796a == EnumC0306av.f1817h || m3135ar.f1796a == EnumC0306av.f1819j || m3135ar.f1796a == EnumC0306av.f1820k)) {
            if (m3135ar.f1796a == EnumC0306av.f1819j) {
                maxAttackRange += 110.0f;
            } else if (m3135ar.f1796a == EnumC0306av.f1820k) {
                maxAttackRange += 90.0f;
            } else {
                maxAttackRange += 20.0f;
            }
            if (maxAttackRange < 190.0f) {
                maxAttackRange = 190.0f;
            }
        }
        if (this.f3889O == EnumC0205a.f1417a) {
            m3140am = maxAttackRange + 250.0f;
        } else if (this.f3889O == EnumC0205a.f1421e) {
            m3140am = maxAttackRange + 150.0f;
        } else if (this.f3889O == EnumC0205a.f1422f) {
            m3140am = maxAttackRange + 180.0f;
        } else {
            m3140am = maxAttackRange + m3140am();
            if (z) {
                m3140am += 110.0f;
            }
        }
        return m3140am;
    }

    /* renamed from: ao */
    public C0305au m3138ao() {
        m3037m(29);
        if (this.f3887f > 0) {
            m3115b(this.f3888g[0]);
        }
        C0305au c0305au = this.f3888g[29];
        for (int i = 29; i >= 1; i--) {
            this.f3888g[i] = this.f3888g[i - 1];
        }
        this.f3888g[0] = c0305au;
        if (this.f3887f < 29) {
            this.f3887f++;
        }
        if (this.f3888g[0] == null) {
            this.f3888g[0] = new C0305au();
        }
        C0305au c0305au2 = this.f3888g[0];
        c0305au2.m5674e();
        this.f3897U = 0.0f;
        this.f3900X = 0.0f;
        this.f3898V = 0.0f;
        m3074c(c0305au2);
        m3172aH();
        return c0305au2;
    }

    /* renamed from: a */
    public void m3194a(C0305au c0305au) {
    }

    /* renamed from: b */
    public final void m3115b(C0305au c0305au) {
        this.f3895h = false;
    }

    /* renamed from: c */
    public void m3074c(C0305au c0305au) {
        mo3107bC();
        this.f3896i = -9999;
        if (this.f3891Q != null && this.f3891Q.m5801cs()) {
            this.f3891Q = null;
        }
    }

    /* renamed from: ap */
    public C0305au m3137ap() {
        m3037m(this.f3887f);
        if (this.f3888g[this.f3887f] == null) {
            this.f3888g[this.f3887f] = new C0305au();
        }
        C0305au c0305au = this.f3888g[this.f3887f];
        c0305au.m5674e();
        if (this.f3887f < 29) {
            this.f3887f++;
        }
        if (this.f3887f > 0) {
            m3074c(this.f3888g[0]);
        }
        return c0305au;
    }

    /* renamed from: d */
    public C0305au m3071d(float f, float f2) {
        C0305au m3137ap = m3137ap();
        m3137ap.m5690a(f, f2);
        return m3137ap;
    }

    /* renamed from: n */
    public C0305au m3033n(Unit unit) {
        C0305au m3137ap = m3137ap();
        m3137ap.m5688a(unit);
        return m3137ap;
    }

    /* renamed from: e */
    public C0305au m3067e(float f, float f2) {
        C0305au m3137ap = m3137ap();
        m3137ap.m5683b(f, f2);
        return m3137ap;
    }

    /* renamed from: a */
    public boolean m3192a(C0305au c0305au, boolean z) {
        if (c0305au == null) {
            if (z) {
                GameEngine.m1145b("isValidNewWaypoint: Skipping null waypoint");
                return false;
            }
            return false;
        } else if (c0305au.m5676d() == EnumC0306av.f1812c) {
            if (c0305au.f1797b == null) {
                if (z) {
                    GameEngine.m1145b("isValidNewWaypoint: Skipping build waypoint with no buildType");
                    return false;
                }
                return false;
            }
            Action m3196a = m3196a(c0305au.f1797b, c0305au.f1799d, false);
            if (m3196a == null) {
                if (z) {
                    GameEngine.m1145b("Unit '" + getUnitType().mo5706i() + "' can not queue build:" + c0305au.f1797b.mo5706i());
                    return false;
                }
                return false;
            } else if (!c0305au.f1804n) {
                if (m3196a.m6068g(this)) {
                    if (z) {
                        GameEngine.m1145b("Builder '" + getUnitType().mo5706i() + "' tried to queue a locked building:" + m3196a.m6094O());
                        return false;
                    }
                    return false;
                } else if (!m3196a.mo4245b(this)) {
                    if (z) {
                        GameEngine.m1145b("Builder '" + getUnitType().mo5706i() + "' tried to queue a unavailable building:" + m3196a.m6094O());
                        return false;
                    }
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public C0305au m3068d(C0305au c0305au) {
        C0305au m3137ap = m3137ap();
        m3137ap.m5677c(c0305au);
        return m3137ap;
    }

    /* renamed from: aq */
    public boolean m3136aq() {
        return m3135ar() == null;
    }

    /* renamed from: ar */
    public C0305au m3135ar() {
        if (this.f3887f == 0) {
            return null;
        }
        return this.f3888g[0];
    }

    /* renamed from: as */
    public C0305au m3134as() {
        if (this.f3887f <= 1) {
            return null;
        }
        return this.f3888g[1];
    }

    /* renamed from: at */
    public C0305au m3133at() {
        if (this.f3887f == 0) {
            return null;
        }
        return this.f3888g[this.f3887f - 1];
    }

    /* renamed from: au */
    public void m3132au() {
        if (this.f3887f == 0) {
            return;
        }
        if (this.f3887f == 1) {
            m3128ay();
        } else {
            this.f3887f--;
        }
    }

    /* renamed from: k */
    public C0305au m3044k(int i) {
        return this.f3888g[i];
    }

    /* renamed from: av */
    public int m3131av() {
        return this.f3887f;
    }

    /* renamed from: aw */
    public boolean m3130aw() {
        C0305au m3135ar = m3135ar();
        if (m3135ar != null && m3135ar.f1796a == EnumC0306av.f1811b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3197a(InterfaceC0303as interfaceC0303as, float f, float f2) {
        for (int i = 0; i < this.f3887f; i++) {
            C0305au c0305au = this.f3888g[i];
            if (c0305au.f1796a == EnumC0306av.f1812c && c0305au.f1797b == interfaceC0303as && CommonUtils.m2294c(c0305au.f1805e - f) < 10.0f && CommonUtils.m2294c(c0305au.f1806f - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m3041l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        }
        if (this.f3933au == f3993as) {
            this.f3933au = new C0237af[120];
        }
    }

    /* renamed from: m */
    public void m3037m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        }
        if (this.f3888g == f3992N) {
            this.f3888g = new C0305au[30];
        }
    }

    /* renamed from: n */
    public void m3034n(int i) {
        if (this.f3887f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f3887f + ", waypointIndex:" + i);
        }
        if (i == 0) {
            m3128ay();
            return;
        }
        if (this.f3888g.length > 0) {
            C0305au c0305au = this.f3888g[i];
            for (int i2 = i; i2 < this.f3887f - 1; i2++) {
                this.f3888g[i2] = this.f3888g[i2 + 1];
            }
            this.f3888g[this.f3887f - 1] = c0305au;
        }
        this.f3887f--;
    }

    /* renamed from: ax */
    public void m3129ax() {
        m3177aC();
        m3128ay();
    }

    /* renamed from: ay */
    public void m3128ay() {
        this.f3897U = 0.0f;
        this.f3900X = 0.0f;
        this.f3898V = 0.0f;
        this.f3930aq = false;
        this.f3929ap = -999.0f;
        this.f3931ar = false;
        this.f3937w = 0;
        if (this.f3887f == 0) {
            m3172aH();
            this.f3886e = 0.0f;
            this.f3885d = 0.0f;
            this.f3884c = 0.0f;
        } else if (this.f3887f == 1) {
            m3115b(this.f3888g[0]);
            this.f3887f = 0;
            m3172aH();
            this.f3886e = 0.0f;
            this.f3885d = 0.0f;
            this.f3884c = 0.0f;
            m3074c((C0305au) null);
        } else {
            if (this.f3888g.length > 0) {
                C0305au c0305au = this.f3888g[0];
                m3115b(c0305au);
                for (int i = 0; i < this.f3887f - 1; i++) {
                    this.f3888g[i] = this.f3888g[i + 1];
                }
                this.f3888g[this.f3887f - 1] = c0305au;
            }
            this.f3887f--;
            if (this.f3887f > 0) {
                m3074c(this.f3888g[0]);
            } else {
                m3074c((C0305au) null);
            }
            m3172aH();
        }
    }

    /* renamed from: az */
    public void m3127az() {
        int i = this.f3887f;
        if (this.f3887f > 0) {
            m3115b(this.f3888g[0]);
        }
        this.f3897U = 0.0f;
        this.f3900X = 0.0f;
        this.f3930aq = false;
        this.f3929ap = -999.0f;
        this.f3931ar = false;
        this.f3887f = 0;
        m3172aH();
        m3176aD();
        m3191a((AbstractC0623y) null);
        this.f3886e = 0.0f;
        this.f3885d = 0.0f;
        this.f3884c = 0.0f;
        this.f3937w = 0;
        if (i > 0) {
            m3074c((C0305au) null);
        }
    }

    /* renamed from: aA */
    public void m3179aA() {
        for (int i = 0; i < this.f3887f; i++) {
            C0305au c0305au = this.f3888g[i];
            if (c0305au != null && c0305au.f1796a != EnumC0306av.f1812c && c0305au.f1796a != EnumC0306av.f1813d) {
                m3034n(i);
            }
        }
    }

    /* renamed from: a */
    public void m3191a(AbstractC0623y abstractC0623y) {
        if (this.f3916ac != null) {
            this.f3916ac.f3919af--;
        }
        this.f3916ac = abstractC0623y;
        if (abstractC0623y != null) {
            this.f3916ac.f3919af++;
        }
    }

    /* renamed from: aB */
    public void m3178aB() {
        m3191a((AbstractC0623y) null);
        this.f3917ad = false;
        this.f3922ai = false;
        this.f3923aj = 0.0f;
        this.f3924ak = 0.0f;
        this.f3915ab = 0;
        this.f3884c = 0.0f;
    }

    /* renamed from: aC */
    public void m3177aC() {
        if (this.f3919af == 0) {
            return;
        }
        C0305au m3134as = m3134as();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f3916ac == this) {
                    boolean z = CommonUtils.m2366a(this.f6951ek, this.f6952el, abstractC0623y.f6951ek, abstractC0623y.f6952el) < 108900.0f;
                    boolean z2 = false;
                    boolean z3 = false;
                    C0305au m3134as2 = abstractC0623y.m3134as();
                    if (m3134as != null && m3134as2 != null) {
                        if (m3134as.m5681b(m3134as2)) {
                            z2 = true;
                        }
                    } else if (m3134as == null && m3134as2 == null) {
                        z3 = true;
                    }
                    if (z2 && z) {
                        abstractC0623y.m3128ay();
                    } else if (!z3) {
                        abstractC0623y.m3191a((AbstractC0623y) null);
                    }
                }
            }
        }
    }

    /* renamed from: aD */
    public void m3176aD() {
        C0305au m3135ar;
        C0637ab c0637ab;
        AbstractC0623y abstractC0623y = null;
        if (this.f3919af == 0) {
            return;
        }
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                if (abstractC0623y2.f3916ac == this) {
                    abstractC0623y2.m3191a((AbstractC0623y) null);
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        if (this.f3919af != 0) {
            this.f3919af = 0;
        }
        if (abstractC0623y != null && (m3135ar = abstractC0623y.m3135ar()) != null && (c0637ab = m3135ar.f1801i) != null) {
            c0637ab.m2969c();
        }
    }

    /* renamed from: aE */
    public C0237af m3175aE() {
        if (this.f3934av == 0) {
            return null;
        }
        if (this.f3932at != null) {
            return this.f3932at.mo1383a(this);
        }
        return this.f3933au[0];
    }

    /* renamed from: aF */
    public C0237af m3174aF() {
        if (this.f3934av < 2) {
            return null;
        }
        if (this.f3932at != null) {
            return this.f3932at.mo1382b(this);
        }
        return this.f3933au[1];
    }

    /* renamed from: a */
    public void m3211a(int i, float f, float f2) {
        m3041l(i);
        if (this.f3933au[i] == null) {
            this.f3933au[i] = new C0237af();
        }
        this.f3933au[i].f1527a = f;
        this.f3933au[i].f1528b = f2;
    }

    /* renamed from: aG */
    public boolean m3173aG() {
        if (this.f3932at == null && this.f3934av >= 2) {
            if (getMoveSpeed() > 0.5d) {
                if (this.f3898V > 150.0f || this.f3899W > 150.0f) {
                    return true;
                }
                return false;
            } else if (this.f3898V > 300.0f || this.f3899W > 300.0f) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: aH */
    public void m3172aH() {
        this.f3934av = 0;
        this.f3935u = false;
        this.f3936v = 0;
        this.f3910s = 0.0f;
        this.f3898V = 0.0f;
        this.f3899W = 0.0f;
        this.f3908q = (byte) 0;
    }

    /* renamed from: aI */
    public void m3171aI() {
        m3172aH();
        this.f3933au = f3993as;
        this.f3956aH = (byte) 0;
        this.f3957aI = null;
        this.f3958aJ = null;
    }

    /* renamed from: aJ */
    public void m3170aJ() {
        this.f3899W = this.f3898V;
        this.f3898V = 0.0f;
        if (this.f3932at != null) {
            this.f3932at.mo1381c(this);
        } else if (this.f3934av != 0) {
            if (this.f3934av == 1) {
                this.f3934av = 0;
                return;
            }
            C0237af c0237af = this.f3933au[0];
            for (int i = 0; i < this.f3934av - 1; i++) {
                this.f3933au[i] = this.f3933au[i + 1];
            }
            this.f3933au[this.f3934av - 1] = c0237af;
            this.f3934av--;
        }
    }

    /* renamed from: aK */
    public boolean m3169aK() {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        if (m5802cr()) {
            z = true;
        }
        gameEngine.f6104bL.m6652a(this.f6951ek, this.f6952el);
        int i = gameEngine.f6104bL.f800T;
        int i2 = gameEngine.f6104bL.f801U;
        if (gameEngine.f6113bU.m1313a(mo5645h(), i, i2) && !gameEngine.f6113bU.m1300b(mo5645h(), i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m3223a(float f, float f2, int i, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0907l c0907l = gameEngine.f6113bU;
        C0173b c0173b = gameEngine.f6104bL;
        this.f1647cI = true;
        boolean z3 = false;
        boolean z4 = false;
        if (m5802cr()) {
            z3 = true;
        }
        c0173b.m6652a(this.f6951ek, this.f6952el);
        int i2 = c0173b.f800T;
        int i3 = c0173b.f801U;
        if (c0907l.m1313a(mo5645h(), i2, i3) && !c0907l.m1300b(mo5645h(), i2, i3)) {
            z3 = true;
            z4 = true;
        }
        if (f != this.f3906o || this.f3907p != f2) {
            this.f3908q = (byte) 0;
        }
        this.f3906o = f;
        this.f3907p = f2;
        if (z3) {
            this.f3935u = false;
            this.f3934av = 0;
            this.f3932at = null;
            float m6653a = c0173b.m6653a(f);
            float m6618b = c0173b.m6618b(f2);
            if (z4) {
                float m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, m6653a, m6618b);
                float m2314b = CommonUtils.m2314b(this.f6951ek, this.f6952el, m6653a, m6618b);
                if (m2314b > 60.0f) {
                    m2314b = 60.0f;
                    this.f3935u = true;
                    if (this.f3910s > 10.0f) {
                        this.f3910s = 10.0f;
                    }
                }
                m6653a = this.f6951ek + (CommonUtils.m2249i(m2280d) * m2314b);
                m6618b = this.f6952el + (CommonUtils.sin(m2280d) * m2314b);
            }
            m3211a(this.f3934av, m6653a, m6618b);
            this.f3934av++;
            this.f3936v = this.f3934av;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (C0248aq.m5744a(mo5645h(), this.f6951ek, this.f6952el, f, f2, 80, i4, 1)) {
            this.f3935u = false;
            this.f3934av = 0;
            this.f3932at = null;
            float m6653a2 = c0173b.m6653a(f);
            float m6618b2 = c0173b.m6618b(f2);
            float f3 = this.f6951ek;
            float f4 = this.f6952el;
            float m2280d2 = CommonUtils.m2280d(this.f6951ek, this.f6952el, m6653a2, m6618b2);
            float m2314b2 = CommonUtils.m2314b(this.f6951ek, this.f6952el, m6653a2, m6618b2);
            float m2249i = CommonUtils.m2249i(m2280d2);
            float sin = CommonUtils.sin(m2280d2);
            int i5 = (int) ((m2314b2 * 0.05f) - 1.0f);
            int i6 = 1;
            if (i5 < 4) {
                i6 = 0;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                f3 += m2249i * 20.0f;
                f4 += sin * 20.0f;
                if (i6 > 0) {
                    i6--;
                } else {
                    m3211a(this.f3934av, f3, f4);
                    this.f3934av++;
                    if (this.f3934av >= 119) {
                        this.f3935u = true;
                        break;
                    }
                }
                i7++;
            }
            if (!this.f3935u) {
                if (this.f3934av < 119) {
                    m3211a(this.f3934av, m6653a2, m6618b2);
                    this.f3934av++;
                } else {
                    this.f3935u = true;
                }
            }
            this.f3936v = this.f3934av;
            return;
        }
        C0637ab c0637ab = null;
        C0305au m3135ar = m3135ar();
        if (m3135ar != null) {
            c0637ab = m3135ar.f1801i;
            if (c0637ab == null) {
            }
        }
        if (c0637ab != null && c0637ab.f4075g != null) {
            C0740d c0740d = null;
            Iterator it = c0637ab.f4075g.iterator();
            while (it.hasNext()) {
                C0740d c0740d2 = (C0740d) it.next();
                if (c0740d2.f4633a != null && c0740d2.f4633a.m1332a() != null && CommonUtils.m2294c(c0740d2.f4637e - f) <= 10.0f && CommonUtils.m2294c(c0740d2.f4638f - f2) <= 10.0f && c0740d2.f4639g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= gameEngine.f6233bx && c0740d2.f4640h == mo5645h() && CommonUtils.m2366a(this.f6951ek, this.f6952el, c0740d2.f4635c, c0740d2.f4636d) < 3600.0f) {
                    c0740d = c0740d2;
                }
            }
            if (c0740d != null) {
                this.f3968aT = c0740d.f4633a;
                return;
            }
        }
        if (f3991K && i > 2) {
            i = 2;
        }
        this.f3968aT = m3222a(f, f2, i, z, true, z2);
    }

    /* renamed from: a */
    public C0906k m3222a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0907l c0907l = gameEngine.f6113bU;
        C0173b c0173b = gameEngine.f6104bL;
        C0906k m1304a = c0907l.m1304a(z2);
        c0173b.m6652a(this.f6951ek, this.f6952el);
        boolean z4 = false;
        if (m3103bb() || this.f1619cg) {
            z4 = true;
        }
        m1304a.m1330a(mo5645h(), (short) c0173b.f800T, (short) c0173b.f801U, Float.valueOf(this.direction), z4);
        c0173b.m6652a(f, f2);
        m1304a.m1325a((short) c0173b.f800T, (short) c0173b.f801U, (short) i);
        m1304a.f5979p = z;
        m1304a.f5980q = m3097bh();
        m1304a.f5981r = z3;
        boolean z5 = this.f1647cI;
        this.f1647cI = true;
        if (z2 && m1304a.m1324b()) {
            Iterator it = f3969aU.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                if (c0906k.f5970g + 60 < gameEngine.f6233bx) {
                    it.remove();
                } else if (c0906k.m1327a(m1304a)) {
                    return c0906k;
                }
            }
        }
        c0907l.m1307a(m1304a, z2);
        this.f1647cI = z5;
        if (z2 && m1304a.m1324b()) {
            f3969aU.add(m1304a);
        }
        return m1304a;
    }

    /* renamed from: b */
    void m3113b(GameEngine gameEngine) {
        if (this.f3968aT != null) {
            C0173b c0173b = gameEngine.f6104bL;
            LinkedList m1332a = this.f3968aT.m1332a();
            if (m1332a != null) {
                this.f3932at = this.f3968aT.m1331a(this);
                C0906k c0906k = this.f3968aT;
                this.f3934av = 0;
                this.f3935u = false;
                Iterator it = m1332a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0911p c0911p = (C0911p) it.next();
                    c0173b.m6648a((int) c0911p.f6068a, (int) c0911p.f6069b);
                    m3211a(this.f3934av, c0173b.f800T + c0173b.f786p, c0173b.f801U + c0173b.f787q);
                    this.f3934av++;
                    if (this.f3934av >= 120) {
                        this.f3935u = true;
                        break;
                    }
                }
                if (this.f3934av == 1) {
                    this.f3908q = (byte) (this.f3908q + 1);
                }
                boolean z = false;
                if (m1332a.size() != 0) {
                    c0173b.m6652a(this.f3906o, this.f3907p);
                    if (!this.f3935u && ((C0911p) m1332a.getLast()).f6068a == c0173b.f800T && ((C0911p) m1332a.getLast()).f6069b == c0173b.f801U) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 == 0) {
                        if (this.f3934av < 120) {
                            m3211a(this.f3934av, this.f3906o, this.f3907p);
                            this.f3934av++;
                        }
                    } else {
                        if (this.f3934av == 0) {
                            this.f3934av++;
                        }
                        m3211a(this.f3934av - 1, this.f3906o, this.f3907p);
                    }
                }
                this.f3968aT = null;
                if (this.f3934av > 120) {
                    GameEngine.m1145b("activePathCount>maxPathNodes: activePathCount:" + this.f3934av);
                    this.f3934av = 120;
                }
                this.f3936v = this.f3934av;
            }
        }
    }

    /* renamed from: aL */
    public long m3168aL() {
        C0237af c0237af;
        long j = 0;
        for (int i = 0; i < this.f3934av; i++) {
            if (this.f3933au[i] != null) {
                j = j + Float.floatToRawIntBits(c0237af.f1527a) + Float.floatToRawIntBits(c0237af.f1528b);
            }
        }
        return j;
    }

    /* renamed from: o */
    C0237af m3032o(int i) {
        if (this.f3932at != null) {
            if (i == 0) {
                return m3175aE();
            }
            return m3174aF();
        } else if (i >= this.f3934av) {
            return null;
        } else {
            return this.f3933au[i];
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: d */
    public void mo461d(float f) {
        super.mo461d(f);
    }

    /* renamed from: aM */
    public float m3167aM() {
        return 1.0f;
    }

    /* renamed from: l */
    public int m3042l(float f) {
        if (f < -0.3f) {
            int i = (int) (((1.0f - ((-f) / 10.0f)) * 130.0f) + 45.0f);
            if (i < 45) {
                i = 45;
            }
            return i;
        }
        return 255;
    }

    /* renamed from: aN */
    public Paint m3166aN() {
        int i;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.height < -0.3f) {
            i = Color.argb(m3042l(this.height), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.f1623ck < 1.0f && this.f1623ck < m3167aM()) {
            i = Color.argb((int) (20.0f + ((this.f1623ck / m3167aM()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = f3971aW;
        }
        if (this.f1626cn) {
            if (this.f1629cq) {
                i = Color.argb(200, 20, 255, 20);
                porterDuffColorFilter = f3972aX;
            }
            if (this.f1630cr) {
                i = Color.argb(200, 255, 20, 20);
                porterDuffColorFilter = f3973aY;
            }
            if (this.f1627co) {
                i = Color.argb(50, 70, 70, 245);
                porterDuffColorFilter = f3974aZ;
                if (this.f1630cr) {
                    i = Color.argb(50, 255, 20, 20);
                    porterDuffColorFilter = f3973aY;
                }
            }
            if (this.f1628cp) {
                i = Color.argb(150, 100, 100, 100);
            }
        }
        return m3210a(i, porterDuffColorFilter, m3165aO());
    }

    /* renamed from: aO */
    public boolean m3165aO() {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = gameEngine.f6109bQ.renderAntiAlias;
        if (!m5781di()) {
            z = false;
            if (gameEngine.f6250cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1625cm) {
            z = UnitType.f1792ag;
        }
        return z;
    }

    /* renamed from: p */
    public float m3030p(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        Paint m3166aN = m3166aN();
        float cC = m5843cC();
        if (this.f4227es) {
            PointF cW = m5824cW();
            float f2 = (this.f6951ek + cW.x) - gameEngine.f6138cv;
            float f3 = ((this.f6952el + cW.y) - gameEngine.f6139cw) - this.height;
            mo5654aQ();
            if (cC != 1.0f) {
                interfaceC1027y.mo878k();
                interfaceC1027y.mo933a(cC, cC, f2, f3);
            }
            interfaceC1027y.mo916a(this.image, f2, f3, mo3996d(false) - 90.0f, m3166aN);
            if (cC != 1.0f) {
                interfaceC1027y.mo877l();
                return true;
            }
            return true;
        }
        PointF cW2 = m5824cW();
        RectF cE = mo4492cE();
        float f4 = cW2.x;
        float f5 = cW2.y - this.height;
        cE.f234a += f4;
        cE.f235b += f5;
        cE.f236c += f4;
        cE.f237d += f5;
        Rect a_ = m5876a_(false);
        float f6 = (cE.f234a + cE.f236c) * 0.5f;
        float f7 = (cE.f235b + cE.f237d) * 0.5f;
        interfaceC1027y.mo878k();
        mo5654aQ();
        if (cC != 1.0f) {
            interfaceC1027y.mo933a(cC, cC, f6, f7);
        }
        interfaceC1027y.mo934a(mo3996d(false), f6, f7);
        interfaceC1027y.mo909a(this.image, a_, cE, m3166aN);
        interfaceC1027y.mo877l();
        return true;
    }

    /* renamed from: F */
    public boolean mo3525F() {
        return this.height > 0.0f && this.f1623ck >= 1.0f && !this.f1627co;
    }

    /* renamed from: aP */
    public PointF m3164aP() {
        f3978bd.m7213a(mo3524G(), mo3522H());
        return f3978bd;
    }

    /* renamed from: G */
    public float mo3524G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo3522H() {
        return 0.0f;
    }

    /* renamed from: aQ */
    public boolean mo5654aQ() {
        if (this.shadowImage != null && mo3525F()) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (!gameEngine.f6254dd && this.radius < 18.0f && this.height < 0.5d) {
                return true;
            }
            if (!gameEngine.f6255de && this.radius < 28.0f && this.height < 5.0f) {
                return true;
            }
            PointF m3164aP = m3164aP();
            float f = (this.f6951ek + m3164aP.x) - gameEngine.f6138cv;
            float f2 = (this.f6952el + m3164aP.y) - gameEngine.f6139cw;
            float cC = m5843cC();
            InterfaceC1027y interfaceC1027y = gameEngine.graphics;
            if (cC != 1.0f) {
                interfaceC1027y.mo878k();
                interfaceC1027y.mo933a(cC, cC, f, f2);
            }
            if (m5841cF()) {
                Rect a_ = m5876a_(true);
                RectF rectF = f1690dz;
                rectF.m7195a(f - this.f4225eq, f2 - this.f4226er, f + this.f4225eq, f2 + this.f4226er);
                interfaceC1027y.mo878k();
                interfaceC1027y.mo934a(mo3996d(true), f, f2);
                interfaceC1027y.mo909a(this.shadowImage, a_, rectF, m3234R());
                interfaceC1027y.mo877l();
            } else {
                interfaceC1027y.mo916a(this.shadowImage, f, f2, mo3996d(true) - 90.0f, m3234R());
            }
            if (cC != 1.0f) {
                interfaceC1027y.mo877l();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p_ */
    public boolean mo4204p_() {
        return RectF.m7192a(GameEngine.getInstance().f6243cL, m5842cD());
    }

    /* renamed from: aR */
    public boolean m3162aR() {
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2464O) {
            return false;
        }
        return mo3295I();
    }

    /* renamed from: aS */
    public boolean m3161aS() {
        return m3162aR();
    }

    /* renamed from: x */
    public boolean m3017x() {
        return true;
    }

    /* renamed from: aT */
    public int m3160aT() {
        return -1;
    }

    /* renamed from: o */
    public float m3031o(Unit unit) {
        if (m3158aV() && unit != null) {
            return getMaxAttackRange() + this.radius + unit.radius;
        }
        return getMaxAttackRange();
    }

    /* renamed from: p */
    public float m3029p(Unit unit) {
        if (m3158aV() && unit != null) {
            return m3159aU() + this.radius + unit.radius;
        }
        return m3159aU();
    }

    /* renamed from: aU */
    public float m3159aU() {
        return getMaxAttackRange();
    }

    /* renamed from: q */
    public int m3026q(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        float m3029p = m3029p(unit);
        if (m3029p > 58.0f) {
            i = (int) ((m3029p - 41.0f) / (gameEngine.f6104bL.f784n * 1.414f));
        }
        return i;
    }

    /* renamed from: aV */
    public boolean m3158aV() {
        return false;
    }

    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 0.0f;
    }

    /* renamed from: aW */
    public void m3157aW() {
        int mo3512bl = mo3512bl();
        for (int i = 0; i < mo3512bl; i++) {
            if (i < this.f1648cJ.length) {
                C0247ap c0247ap = this.f1648cJ[i];
                if (c0247ap.f1715e > getShootDelay(i)) {
                    c0247ap.f1715e = getShootDelay(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[SYNTHETIC] */
    /* renamed from: aX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList m3156aX() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.AbstractC0623y.m3156aX():java.util.ArrayList");
    }

    /* renamed from: r */
    public boolean m3025r(int i) {
        return true;
    }

    /* renamed from: e */
    public float mo3505e(int i) {
        return 0.0f;
    }

    /* renamed from: s */
    public boolean m3022s(int i) {
        return false;
    }

    /* renamed from: t */
    public float m3021t(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo3504f(int i) {
        return 4.0f;
    }

    /* renamed from: u */
    public boolean m3020u(int i) {
        int m3019v = m3019v(i);
        if (m3019v == -1) {
            return this.f1648cJ[i].f1717g;
        }
        return this.f1648cJ[m3019v].f1717g;
    }

    /* renamed from: v */
    public int m3019v(int i) {
        return -1;
    }

    /* renamed from: B */
    public float mo3528B() {
        return -1.0f;
    }

    /* renamed from: w */
    public float mo3493w(int i) {
        return -1.0f;
    }

    /* renamed from: x */
    public float m3016x(int i) {
        return 5.0f;
    }

    /* renamed from: y */
    public float mo5644y(int i) {
        return mo3493w(i);
    }

    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    /* renamed from: aY */
    public boolean m3155aY() {
        return false;
    }

    /* renamed from: aZ */
    public float m3154aZ() {
        return 1.0f;
    }

    /* renamed from: ba */
    public float m3104ba() {
        return 1.0f;
    }

    /* renamed from: bb */
    public boolean m3103bb() {
        return mo3532bc() > 0.95f;
    }

    /* renamed from: bc */
    public float mo3532bc() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bd */
    public float mo3101bd() {
        return 0.0f;
    }

    /* renamed from: be */
    public EnumC0307b m3100be() {
        return EnumC0307b.f1828a;
    }

    /* renamed from: bf */
    public boolean m3099bf() {
        return true;
    }

    /* renamed from: bg */
    public boolean m3098bg() {
        return true;
    }

    /* renamed from: bh */
    public int m3097bh() {
        return 0;
    }

    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 99.0f;
    }

    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 99.0f;
    }

    /* renamed from: bi */
    public boolean mo3999bi() {
        return false;
    }

    /* renamed from: bj */
    public boolean mo3998bj() {
        return false;
    }

    /* renamed from: b */
    public boolean mo4496b(int i, float f) {
        return true;
    }

    /* renamed from: bk */
    public boolean m3094bk() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3512bl() {
        return 1;
    }

    /* renamed from: bm */
    public boolean mo5661bm() {
        return true;
    }

    /* renamed from: g */
    public float getTurretSize(int i) {
        return 0.0f;
    }

    /* renamed from: z */
    public float m3013z(int i) {
        return 99999.0f;
    }

    /* renamed from: A */
    public float m3256A(int i) {
        return -1.0f;
    }

    /* renamed from: B */
    public float m3254B(int i) {
        return 0.0f;
    }

    /* renamed from: C */
    public float mo3538C(int i) {
        if (this.f1619cg && m3103bb()) {
            return this.direction + 180.0f;
        }
        return this.direction;
    }

    /* renamed from: bn */
    public C1080ai m3091bn() {
        int m3160aT = m3160aT();
        if (m3160aT == -1) {
            return m3250D(0);
        }
        return m3250D(m3160aT);
    }

    /* renamed from: D */
    public C1080ai m3250D(int i) {
        f3979be.m597a(getTurretEnd(i));
        return f3979be;
    }

    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        C0247ap c0247ap = this.f1648cJ[i];
        float turretSize = getTurretSize(i);
        float f = isFixedFiring() ? this.direction : c0247ap.f1711a;
        PointF mo3523G = mo3523G(i);
        f3980bf.m7213a(mo3523G.x + (CommonUtils.m2249i(f) * turretSize), mo3523G.y + (CommonUtils.sin(f) * turretSize));
        return f3980bf;
    }

    /* renamed from: F */
    public C1080ai m3246F(int i) {
        f3982bh.m597a(mo3523G(i));
        f3982bh.f6845c = 0.0f;
        return f3982bh;
    }

    /* renamed from: G */
    public PointF mo3523G(int i) {
        C0247ap c0247ap = this.f1648cJ[i];
        float f = this.f6951ek;
        float f2 = this.f6952el;
        float mo3537H = mo3537H(i);
        if (c0247ap.f1715e != 0.0f && mo3537H != 0.0f) {
            float mo3536I = mo3536I(i);
            float mo3535J = mo3535J(i);
            float f3 = 0.0f;
            float shootDelay = getShootDelay(i) - c0247ap.f1715e;
            if (shootDelay < mo3536I) {
                f3 = (shootDelay / mo3536I) * mo3537H;
            } else if (shootDelay < mo3535J + mo3536I) {
                f3 = mo3537H - (((shootDelay - mo3536I) / mo3535J) * mo3537H);
            }
            if (f3 != 0.0f) {
                f += CommonUtils.m2249i(c0247ap.f1711a) * f3;
                f2 += CommonUtils.sin(c0247ap.f1711a) * f3;
            }
        }
        f3981bg.m7213a(f, f2);
        return f3981bg;
    }

    /* renamed from: H */
    public float mo3537H(int i) {
        return 0.0f;
    }

    /* renamed from: I */
    public float mo3536I(int i) {
        return 4.0f;
    }

    /* renamed from: J */
    public float mo3535J(int i) {
        return 6.0f;
    }

    /* renamed from: K */
    public PointF m3238K(int i) {
        PointF pointF = f3983bi;
        pointF.m7213a(0.0f, 0.0f);
        C0247ap c0247ap = this.f1648cJ[i];
        pointF.x += c0247ap.f1718h;
        pointF.y += c0247ap.f1719i;
        return pointF;
    }

    /* renamed from: L */
    public float m3237L(int i) {
        return 0.6f;
    }

    /* renamed from: M */
    public void m3236M(int i) {
        if (i == -1) {
            int mo3512bl = mo3512bl();
            for (int i2 = 0; i2 < mo3512bl; i2++) {
                m3236M(i2);
            }
            return;
        }
        C0247ap c0247ap = this.f1648cJ[i];
        c0247ap.f1718h = 0.0f;
        c0247ap.f1719i = 0.0f;
        if (this.f3891Q != null && m3237L(i) != 0.0f) {
            float m3237L = this.f3891Q.radius * m3237L(i);
            c0247ap.f1718h += CommonUtils.m2345a((AbstractC1120w) this, (int) (-m3237L), (int) m3237L, 1 + i);
            c0247ap.f1719i += CommonUtils.m2345a((AbstractC1120w) this, (int) (-m3237L), (int) m3237L, 2 + i);
        }
    }

    /* renamed from: a */
    public void m3206a(EnumC0233ab enumC0233ab) {
        m3205a(enumC0233ab, true);
    }

    /* renamed from: a */
    public void m3205a(EnumC0233ab enumC0233ab, boolean z) {
        C0745e m2531d;
        GameEngine gameEngine = GameEngine.getInstance();
        if (enumC0233ab == EnumC0233ab.f1508h) {
            gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
            gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
            gameEngine.effects.m2536b(EnumC0748h.f4830e);
            C0745e m2533c = gameEngine.effects.m2533c(this.f6951ek, this.f6952el, this.height, -1127220);
            if (m2533c != null) {
                m2533c.f4730H = 0.2f;
                m2533c.f4729G = 2.0f;
                m2533c.f4786ar = (short) 2;
                m2533c.f4745W = 45.0f;
                m2533c.f4746X = m2533c.f4745W;
                m2533c.f4744V = 0.0f;
            }
        } else if (enumC0233ab == EnumC0233ab.f1504d || enumC0233ab == EnumC0233ab.f1506f || enumC0233ab == EnumC0233ab.f1507g) {
            gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
            gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        } else if (enumC0233ab == EnumC0233ab.f1501a) {
            gameEngine.audio.m3003a(AudioEngine.f4044o, 0.4f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.f6951ek, this.f6952el);
            gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        } else if (enumC0233ab == EnumC0233ab.f1505e) {
            gameEngine.audio.m3003a(AudioEngine.f4044o, 0.8f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.f6951ek, this.f6952el);
            gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
            gameEngine.effects.m2536b(EnumC0748h.f4830e);
            C0745e m2533c2 = gameEngine.effects.m2533c(this.f6951ek, this.f6952el, this.height, -1127220);
            if (m2533c2 != null) {
                m2533c2.f4730H = 0.2f;
                m2533c2.f4729G = 2.0f;
                m2533c2.f4786ar = (short) 2;
                m2533c2.f4745W = 45.0f;
                m2533c2.f4746X = m2533c2.f4745W;
                m2533c2.f4744V = 0.0f;
            }
        } else {
            gameEngine.audio.m3003a(AudioEngine.f4044o, 0.8f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.f6951ek, this.f6952el);
            gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        }
        if (enumC0233ab != EnumC0233ab.f1501a) {
            if (enumC0233ab != EnumC0233ab.f1507g && (m2531d = gameEngine.effects.m2531d(this.f6951ek, this.f6952el, this.height, 0)) != null) {
                m2531d.f4728F = 0.9f;
            }
            if (z) {
                if (!m5863bO()) {
                    m3090bo();
                }
                if (enumC0233ab != EnumC0233ab.f1507g && !m5837cJ()) {
                    C0746f.m2519a(this.f6951ek, this.f6952el);
                    C0746f.m2512b(this.f6951ek, this.f6952el);
                    m3088bq();
                }
            }
        }
    }

    /* renamed from: bo */
    public void m3090bo() {
        GameEngine gameEngine = GameEngine.getInstance();
        float f = 1.0f;
        float f2 = 1.0f;
        int mo4494bp = mo4494bp();
        if (mo4494bp >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (mo4494bp >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.height > -1.0f) {
            for (int i = 0; i < mo4494bp; i++) {
                gameEngine.effects.m2540b(this.f6951ek, this.f6952el, this.height, f, f2);
            }
        }
    }

    /* renamed from: bp */
    public int mo4494bp() {
        if (m5788db()) {
            return 8;
        }
        if (m5867bI()) {
            return 7;
        }
        return 4;
    }

    /* renamed from: bq */
    public void m3088bq() {
        if (!m5837cJ()) {
            C0195l.m6434a(this.f6951ek, this.f6952el);
        }
    }

    /* renamed from: s */
    public int mo4490s() {
        return 15;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public void mo3073c(boolean z) {
        int mo4490s;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1650cL == null && this.f1651cM == null && (mo4490s = mo4490s()) > 0) {
            gameEngine.f6104bL.m6651a(this.f6951ek, this.f6952el, mo4490s, this.team, z);
        }
    }

    /* renamed from: br */
    public void m3087br() {
        GameEngine gameEngine = GameEngine.getInstance();
        RectF rectF = new RectF();
        rectF.m7194a(m5817cc());
        rectF.f235b *= gameEngine.f6104bL.f785o;
        rectF.f237d *= gameEngine.f6104bL.f785o;
        rectF.f234a *= gameEngine.f6104bL.f784n;
        rectF.f236c *= gameEngine.f6104bL.f784n;
        rectF.m7196a(this.f6951ek, this.f6952el);
        rectF.m7196a(-m5823cX(), -m5822cY());
        rectF.f235b -= 10.0f;
        rectF.f237d += 10.0f;
        rectF.f234a -= 10.0f;
        rectF.f236c += 10.0f;
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof Unit) && unit != this && unit.m5896a(rectF)) {
                if ((unit instanceof AbstractC0623y) && unit.isDead) {
                    unit.mo2880a();
                }
                if (unit instanceof Tree) {
                    ((Tree) unit).m5916f();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m3075c(Team team) {
        return m3110b(false, team) == null;
    }

    /* renamed from: a */
    public boolean m3180a(boolean z, Team team) {
        return m3110b(z, team) == null;
    }

    /* renamed from: b */
    public String m3110b(boolean z, Team team) {
        String m5289a;
        GameEngine gameEngine = GameEngine.getInstance();
        C0402bc mo5698q = getUnitType().mo5698q();
        if (mo5698q != null && (m5289a = mo5698q.m5289a(this, this.f6951ek, this.f6952el)) != null) {
            return m5289a;
        }
        if (getUnitType().mo5699p()) {
            gameEngine.f6104bL.m6652a(this.f6951ek, this.f6952el);
            C0180g m6598e = gameEngine.f6104bL.m6598e(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
            if (m6598e == null || !m6598e.f921i) {
                return "{2}";
            }
        }
        if (!z && m3199a((Unit) null, team)) {
            return "{0}";
        }
        if (!getUnitType().mo5699p()) {
            Rect cc = m5817cc();
            Point a = m5895a(gameEngine.f6104bL, f3984bj);
            int i = a.f224a;
            int i2 = a.f225b;
            InterfaceC0303as r = getUnitType();
            EnumC0246ao mo5700o = r.mo5700o();
            for (int i3 = i + cc.f230a; i3 <= i + cc.f232c; i3++) {
                for (int i4 = i2 + cc.f231b; i4 <= i2 + cc.f233d; i4++) {
                    String m4515a = AbstractC0488d.m4515a(this, r, mo5700o, i3, i4, false, team);
                    if (m4515a != null) {
                        return m4515a;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: N */
    public void m3235N(int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!getUnitType().mo5699p()) {
            Rect cc = m5817cc();
            Point a = m5895a(gameEngine.f6104bL, f3985bk);
            int i2 = a.f224a;
            int i3 = a.f225b;
            getUnitType();
            int i4 = i2 + cc.f230a;
            int i5 = i3 + cc.f231b;
            int i6 = i2 + cc.f232c;
            int i7 = i3 + cc.f233d;
            if (i != -2) {
                gameEngine.f6104bL.m6635a(this, i4, i5, i6, i7, (int) gameEngine.f6138cv, (int) gameEngine.f6139cw, gameEngine.graphics, true, i);
            }
        }
    }

    /* renamed from: r */
    public boolean m3024r(Unit unit) {
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el);
        float f = 9.0f;
        if (!unit.m5867bI()) {
            f = this.radius + unit.radius;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (m2366a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3199a(Unit unit, Team team) {
        boolean z = false;
        if (!m5867bI()) {
            z = true;
        }
        float f = this.radius + C0348af.f2205p + 10.0f;
        float f2 = this.f6951ek - f;
        float f3 = this.f6951ek + f;
        float f4 = this.f6952el - f;
        float f5 = this.f6952el + f;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m523a[i];
            float f6 = unit2.f6951ek;
            float f7 = unit2.f6952el;
            if (f2 <= f6 && f6 <= f3 && f4 <= f7 && f7 <= f5 && unit2 != this && ((z || unit2.m5867bI()) && !unit2.isDead && m3024r(unit2) && unit2 != unit && (team == null || unit2.m5794d(team)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bs */
    public AbstractC0623y m3086bs() {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit != this && (unit instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (!abstractC0623y.isDead && abstractC0623y.team == this.team && abstractC0623y.getUnitType() == getUnitType() && m5756t(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0667ay, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2880a() {
        if (this.f1651cM != null) {
            m3081bx();
        }
        m3127az();
        m3171aI();
        super.mo2880a();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bt */
    public void mo3085bt() {
        m3191a((AbstractC0623y) null);
        this.f3891Q = null;
        m3127az();
        m3171aI();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bu */
    public void mo3084bu() {
        if (this.f1651cM != null) {
            m3081bx();
        }
        super.mo3084bu();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bv */
    public void mo3083bv() {
        super.mo3083bv();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bw */
    public int mo3082bw() {
        return (((((((((((0 * 31) + super.mo3082bw()) * 31) + ((int) (getMoveSpeed() * 100.0f))) * 31) + ((int) (getTurnSpeed() * 100.0f))) * 31) + ((int) (getMaxAttackRange() * 100.0f))) * 31) + ((int) getShootDelay(0))) * 31) + ((int) (getMoveAccelerationSpeed() * 100.0f));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: m */
    PointF mo3038m(float f) {
        PointF m3035n = m3035n(f);
        f1693dC.m7213a(this.f6951ek + m3035n.x, this.f6952el + m3035n.y);
        return f1693dC;
    }

    /* renamed from: n */
    public PointF m3035n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (mo3295I() && this.f3883b == 0.0f) {
            if (mo3999bi()) {
                f2 = this.f1613ca * f;
                f3 = this.f1614cb * f;
            } else if (this.f1616cd != 0.0f) {
                float f4 = this.direction;
                if (mo3998bj()) {
                    f4 = this.f1618cf;
                }
                float moveSpeed = getMoveSpeed() * this.f1616cd * f;
                f2 = CommonUtils.m2249i(f4) * moveSpeed;
                f3 = CommonUtils.sin(f4) * moveSpeed;
            }
        }
        f3986bl.m7213a(f2, f3);
        return f3986bl;
    }

    /* renamed from: a */
    public boolean m3204a(EnumC0238ag enumC0238ag) {
        return false;
    }

    /* renamed from: a */
    public void m3208a(Action action) {
    }

    /* renamed from: a */
    public boolean m3207a(Action action, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public void m3202a(Unit unit, float f, int i) {
        this.f3894T = CommonUtils.m2368a(this.f3894T, f);
        if (this.f3894T == 0.0f) {
            this.f3894T = 5.0f;
            if (mo4204p_()) {
                C1080ai m3091bn = m3091bn();
                C0745e m2537b = GameEngine.getInstance().effects.m2537b(m3091bn.f6843a, m3091bn.f6844b, this.height + m3091bn.f6845c, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
                if (m2537b != null) {
                    float m2280d = CommonUtils.m2280d(m3091bn.f6843a, m3091bn.f6844b, (float) (unit.f6951ek + (-8.0d) + (Math.random() * 16.0d)), (float) (unit.f6952el + (-8.0d) + (Math.random() * 16.0d)));
                    m2537b.f4739Q = CommonUtils.m2249i(m2280d) * CommonUtils.rnd(2.0f, 4.0f);
                    m2537b.f4740R = CommonUtils.sin(m2280d) * CommonUtils.rnd(2.0f, 4.0f);
                    m2537b.f4762ap = 6;
                    m2537b.f4745W = 20.0f;
                    m2537b.f4746X = m2537b.f4745W;
                    m2537b.f4720s = true;
                    m2537b.f4728F = 0.8f;
                    m2537b.f4730H = 0.2f;
                    m2537b.f4729G = 1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public void m3119b(Unit unit, float f, int i) {
        this.f3894T = CommonUtils.m2368a(this.f3894T, f);
        if (this.f3894T == 0.0f) {
            this.f3894T = 5.0f;
            if (mo4204p_()) {
                PointF turretEnd = getTurretEnd(0);
                C0745e m2537b = GameEngine.getInstance().effects.m2537b(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
                if (m2537b != null) {
                    float m2280d = CommonUtils.m2280d(unit.f6951ek, unit.f6952el - unit.height, (float) (turretEnd.x + (-8.0d) + (Math.random() * 16.0d)), (float) (turretEnd.y + (-8.0d) + (Math.random() * 16.0d)));
                    m2537b.f4739Q = CommonUtils.m2249i(m2280d) * CommonUtils.rnd(2.0f, 4.0f);
                    m2537b.f4740R = CommonUtils.sin(m2280d) * CommonUtils.rnd(2.0f, 4.0f);
                    m2537b.f4762ap = 5;
                    m2537b.f4745W = 20.0f;
                    m2537b.f4746X = m2537b.f4745W;
                    m2537b.f4720s = true;
                    m2537b.f4728F = 0.8f;
                    m2537b.f4730H = 0.2f;
                    m2537b.f4729G = 1.0f;
                }
            }
        }
    }

    /* renamed from: a */
    public C0625z m3193a(C0305au c0305au, InterfaceC0303as interfaceC0303as, int i, float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        Action m3196a = m3196a(interfaceC0303as, i, false);
        if (m3196a == null) {
            GameEngine.m1145b("Unit '" + getUnitType().mo5706i() + "' can not build:" + interfaceC0303as.mo5706i());
            return f3987bm.m3012a();
        }
        if (!c0305au.f1804n) {
            if (m3196a.m6068g(this)) {
                GameEngine.m1145b("Builder '" + getUnitType().mo5706i() + "' tried to build a locked building:" + m3196a.m6094O());
                return f3987bm.m3012a();
            } else if (!m3196a.mo4245b(this) && !m3196a.m6041u(this)) {
                GameEngine.m1145b("Builder '" + getUnitType().mo5706i() + "' tried to build a unavailable building:" + m3196a.m6094O() + " (add isLocked:false to fix)");
                return f3987bm.m3012a();
            }
        }
        if (!interfaceC0303as.mo5704k() && !m3196a.m6037x() && this.team.m6307u() >= this.team.m6306v()) {
            if (this.team == gameEngine.f6093bs) {
                gameEngine.f6111bS.m2008b(gameEngine.f6111bS.f5106d.f4941an);
            }
            return f3987bm.m3012a();
        } else if (Unit.m5890a(interfaceC0303as) == null) {
            String str = "{build is null}";
            if (c0305au.f1797b != null) {
                str = c0305au.f1797b.mo5706i();
            }
            GameEngine.PrintLog("Build unit type missing: " + str);
            return f3987bm.m3012a();
        } else {
            Unit m4505g = AbstractC0488d.m4505g(interfaceC0303as);
            if (!C0424b.m5202b(interfaceC0303as.mo5697u(), m3196a.m6105B()) || !C0424b.m5202b(interfaceC0303as.mo5720B(), m3196a.m6051o_())) {
                m4505g.f1582bw = m3196a.m6105B();
                m4505g.f1583bx = m3196a.m6051o_();
            }
            if (m3196a instanceof C0213h) {
                m4505g.f1582bw = null;
                m4505g.f1583bx = null;
            }
            m4505g.f1623ck = 0.0f;
            m4505g.f1624cl = 0.0f;
            gameEngine.f6104bL.m6617b((f - m4505g.m5823cX()) + 1.0f, (f2 - m4505g.m5822cY()) + 1.0f);
            m4505g.f6951ek = gameEngine.f6104bL.f800T + m4505g.m5823cX();
            m4505g.f6952el = gameEngine.f6104bL.f801U + m4505g.m5822cY();
            m4505g.m5766f(this.team);
            m4505g.m5907B(this);
            if (i != 1 && (m4505g instanceof AbstractC0623y)) {
                ((AbstractC0623y) m4505g).mo4213a(i);
            }
            m4505g.m5832cO();
            if (m4505g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m4505g;
                boolean z = false;
                AbstractC0623y abstractC0623y2 = null;
                if (m3141al()) {
                    abstractC0623y2 = this;
                } else if (!this.collidable && !m5867bI()) {
                    abstractC0623y2 = this;
                }
                if (abstractC0623y.m3199a(abstractC0623y2, (Team) null)) {
                    z = true;
                }
                if (!z && !abstractC0623y.m3180a(true, (Team) null)) {
                    z = true;
                }
                if (z) {
                    m4505g.mo2880a();
                    C0625z m3012a = f3987bm.m3012a();
                    AbstractC0623y m3086bs = ((AbstractC0623y) m4505g).m3086bs();
                    m3012a.f3996b = m3086bs;
                    m3012a.f3998d = m3196a;
                    if (m3086bs == null) {
                    }
                    return m3012a;
                }
            }
            C0424b m6105B = m3196a.m6105B();
            if (c0305au.f1804n) {
                m6105B = C0424b.f2709a;
            }
            if (!m6105B.m5233c(this)) {
                m4505g.mo2880a();
                C0625z m3012a2 = f3987bm.m3012a();
                this.f3890P = gameEngine.f6096by;
                if (this.f3897U < 1000.0f) {
                    m3012a2.f3997c = true;
                    C0741a m2579a = C0741a.m2579a(this.team, m4505g.f6951ek, m4505g.f6952el);
                    if (m2579a != null) {
                        m2579a.f4648i = true;
                    }
                }
                return m3012a2;
            }
            m3036m(m4505g);
            if (m4505g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) m4505g;
                abstractC0623y3.m3087br();
                if (m4505g.m5867bI()) {
                    gameEngine.f6113bU.m1312a(abstractC0623y3);
                }
            }
            Team.m6353c(m4505g);
            C0625z m3012a3 = f3987bm.m3012a();
            m3012a3.f3995a = m4505g;
            m3012a3.f3998d = m3196a;
            return m3012a3;
        }
    }

    /* renamed from: a */
    public boolean m3188a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        return false;
    }

    /* renamed from: b */
    public boolean m3114b(AbstractC0623y abstractC0623y) {
        return false;
    }

    /* renamed from: bx */
    public void m3081bx() {
        if (this.f1651cM == null) {
            return;
        }
        if (this.f1651cM.isDead) {
        }
        if (!this.f1651cM.m3114b(this)) {
            GameEngine.m1145b("Deattach failed, forcing deattach. Child:" + m5795cz() + " Parent:" + this.f1651cM.m5795cz());
            this.f1651cM = null;
            this.f1652cN = null;
        }
    }

    /* renamed from: a */
    public C0399m m3182a(short s) {
        return null;
    }

    /* renamed from: a */
    public static Unit m3190a(AbstractC0623y abstractC0623y, float f, float f2, float f3, C0449h c0449h) {
        if (f3 <= 0.0f) {
            return null;
        }
        f3988bn.f1515f = true;
        f3988bn.f1516g = false;
        f3988bn.f1514e = null;
        f3988bn.f1513d = f3 * f3;
        f3988bn.f1512c = c0449h;
        f3988bn.f1510a = f;
        f3988bn.f1511b = f2;
        GameEngine.getInstance().f6121cc.m3792a(f, f2, f3, abstractC0623y, 0.0f, f3988bn);
        return f3988bn.f1514e;
    }

    /* renamed from: by */
    public C0424b m3080by() {
        return C0424b.f2709a;
    }

    /* renamed from: bz */
    public C1101m m3079bz() {
        return f3990bp;
    }

    /* renamed from: bA */
    public boolean mo5936bA() {
        return false;
    }

    /* renamed from: bB */
    public int mo5935bB() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bC */
    public void mo3107bC() {
        C0424b m5219a;
        C0424b m3105bE = m3105bE();
        C0424b m3106bD = m3106bD();
        if (m3105bE == null) {
            m5219a = m3106bD;
        } else if (m3106bD == null) {
            m5219a = m3105bE;
        } else {
            m5219a = C0424b.m5219a(m3105bE, m3106bD);
        }
        if (this.f1698dH == null && m5219a == null) {
            return;
        }
        if (this.f1698dH != null && m5219a != null && this.f1698dH.m5203b(m5219a)) {
            return;
        }
        Team.m6369b((Unit) this);
        this.f1698dH = m5219a;
        Team.m6353c(this);
    }

    /* renamed from: bD */
    public C0424b m3106bD() {
        return null;
    }

    /* renamed from: bE */
    public C0424b m3105bE() {
        C0305au m3135ar;
        Unit m3228X = m3228X();
        if (m3228X != null && (m3135ar = m3135ar()) != null) {
            if (m3135ar.f1796a == EnumC0306av.f1813d && m3228X.f1623ck < 1.0f) {
                C0424b m3058g = m3058g(m3228X);
                float m3153a_ = m3153a_(m3228X) * 60.0f;
                if (m3058g != null) {
                    return C0424b.m5220a(m3058g, -m3153a_);
                }
            }
            if (m3135ar.f1796a == EnumC0306av.f1816g) {
                if (m3228X.f1623ck < 1.0f) {
                    C0424b m3058g2 = m3058g(m3228X);
                    float m3062f = m3062f(m3228X) * 60.0f;
                    if (m3058g2 != null) {
                        return C0424b.m5220a(m3058g2, m3062f);
                    }
                    return null;
                } else if (m5752y(m3228X)) {
                    float z = m5751z(m3228X);
                    C0424b m5835cL = m3228X.m5835cL();
                    C0424b m5834cM = m3228X.m5834cM();
                    if (m5834cM != null) {
                        m5835cL = m5834cM;
                    }
                    return C0424b.m5220a(m5835cL, (z * 60.0f) / m3228X.f1632ct);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
