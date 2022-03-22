package com.corrodinggames.rts.gameFramework.p032d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0214aj;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.EnumC0524z;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.C0304f;
import com.corrodinggames.rts.game.units.custom.p020d.C0353c;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0182d;
import com.corrodinggames.rts.game.units.p013a.C0183e;
import com.corrodinggames.rts.game.units.p013a.C0184f;
import com.corrodinggames.rts.game.units.p013a.C0185g;
import com.corrodinggames.rts.game.units.p013a.C0187i;
import com.corrodinggames.rts.game.units.p013a.C0188j;
import com.corrodinggames.rts.game.units.p013a.C0195q;
import com.corrodinggames.rts.game.units.p013a.C0196r;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0537ac;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0612j;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0602a;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0604c;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0606e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.p040k.C0781f;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public final class C0623f extends AbstractC0585bi {

    /* renamed from: c */
    C0465h f4276c;

    /* renamed from: d */
    public C0599a f4277d;

    /* renamed from: e */
    public C0626i f4278e;

    /* renamed from: f */
    public C0649y f4279f;

    /* renamed from: q */
    double f4280q;

    /* renamed from: x */
    boolean f4281x;

    /* renamed from: y */
    boolean f4282y;

    /* renamed from: z */
    float f4283z;

    /* renamed from: A */
    public float f4284A;

    /* renamed from: B */
    public float f4285B;

    /* renamed from: Q */
    public AbstractC0210af f4286Q;

    /* renamed from: R */
    public float f4287R;

    /* renamed from: S */
    public int f4288S;

    /* renamed from: T */
    public float f4289T;

    /* renamed from: U */
    public AbstractC0210af f4290U;

    /* renamed from: W */
    public AbstractC0197s f4291W;

    /* renamed from: X */
    public int f4292X;

    /* renamed from: Y */
    public boolean f4293Y;

    /* renamed from: Z */
    public float f4294Z;

    /* renamed from: aa */
    public float f4295aa;

    /* renamed from: ab */
    public float f4296ab;

    /* renamed from: ac */
    public boolean f4297ac;

    /* renamed from: ad */
    public float f4298ad;

    /* renamed from: ae */
    public float f4299ae;

    /* renamed from: af */
    public float f4300af;

    /* renamed from: ag */
    public float f4301ag;

    /* renamed from: ah */
    public float f4302ah;

    /* renamed from: ai */
    public float f4303ai;

    /* renamed from: aj */
    public boolean f4304aj;

    /* renamed from: ak */
    public float f4305ak;

    /* renamed from: al */
    public float f4306al;

    /* renamed from: am */
    public int f4307am;

    /* renamed from: ao */
    public Paint f4308ao;

    /* renamed from: ap */
    public Paint f4309ap;

    /* renamed from: aq */
    public Paint f4310aq;

    /* renamed from: ar */
    public Paint f4311ar;

    /* renamed from: as */
    public Paint f4312as;

    /* renamed from: at */
    public Paint f4313at;

    /* renamed from: au */
    public Paint f4314au;

    /* renamed from: av */
    public Paint f4315av;

    /* renamed from: aw */
    public Paint f4316aw;

    /* renamed from: ax */
    public Paint f4317ax;

    /* renamed from: ay */
    public Paint f4318ay;

    /* renamed from: az */
    public Paint f4319az;

    /* renamed from: aA */
    public Paint f4320aA;

    /* renamed from: aB */
    public Paint f4321aB;

    /* renamed from: aC */
    public Paint f4322aC;

    /* renamed from: aD */
    Paint f4323aD;

    /* renamed from: aE */
    Paint f4324aE;

    /* renamed from: aF */
    Paint f4325aF;

    /* renamed from: aG */
    Paint f4326aG;

    /* renamed from: aH */
    Paint f4327aH;

    /* renamed from: aI */
    Paint f4328aI;

    /* renamed from: aJ */
    C0760q f4329aJ;

    /* renamed from: aK */
    C0760q f4330aK;

    /* renamed from: aL */
    C0760q f4331aL;

    /* renamed from: aM */
    public float f4332aM;

    /* renamed from: aQ */
    int f4333aQ;

    /* renamed from: aS */
    public boolean f4334aS;

    /* renamed from: aW */
    boolean f4335aW;

    /* renamed from: aX */
    float f4336aX;

    /* renamed from: aY */
    Paint f4337aY;

    /* renamed from: aZ */
    Paint f4338aZ;

    /* renamed from: bp */
    String f4339bp;

    /* renamed from: bq */
    String f4340bq;

    /* renamed from: br */
    String f4341br;

    /* renamed from: bs */
    String f4342bs;

    /* renamed from: bt */
    String f4343bt;

    /* renamed from: bJ */
    private int f4344bJ;

    /* renamed from: bz */
    public static boolean f4345bz;

    /* renamed from: bD */
    long f4346bD;

    /* renamed from: bE */
    boolean f4347bE;

    /* renamed from: bG */
    public static AbstractC0210af f4348bG;

    /* renamed from: a */
    public static boolean f4349a = false;

    /* renamed from: bw */
    public static boolean f4350bw = false;

    /* renamed from: bx */
    public static boolean f4351bx = false;

    /* renamed from: by */
    public static boolean f4352by = false;

    /* renamed from: b */
    public boolean f4353b = false;

    /* renamed from: g */
    C0183e f4354g = new C0183e();

    /* renamed from: h */
    C0184f f4355h = new C0184f();

    /* renamed from: i */
    C0187i f4356i = new C0187i();

    /* renamed from: j */
    C0182d f4357j = new C0182d();

    /* renamed from: k */
    public C0188j f4358k = new C0188j();

    /* renamed from: l */
    C0196r f4359l = new C0196r();

    /* renamed from: m */
    C0195q f4360m = new C0195q();

    /* renamed from: n */
    AbstractC0612j f4361n = new C0602a();

    /* renamed from: o */
    boolean f4362o = false;

    /* renamed from: p */
    public boolean f4363p = false;

    /* renamed from: r */
    float f4364r = 0.0f;

    /* renamed from: s */
    public float f4365s = 0.0f;

    /* renamed from: t */
    public float f4366t = 0.0f;

    /* renamed from: u */
    float f4367u = 40.0f;

    /* renamed from: v */
    float f4368v = 40.0f;

    /* renamed from: w */
    int f4369w = 0;

    /* renamed from: C */
    boolean f4370C = false;

    /* renamed from: D */
    boolean f4371D = false;

    /* renamed from: E */
    boolean f4372E = false;

    /* renamed from: F */
    boolean f4373F = false;

    /* renamed from: G */
    boolean f4374G = false;

    /* renamed from: H */
    float f4375H = 0.0f;

    /* renamed from: I */
    float f4376I = 0.0f;

    /* renamed from: J */
    float f4377J = 0.0f;

    /* renamed from: K */
    float f4378K = 0.0f;

    /* renamed from: L */
    float f4379L = 0.0f;

    /* renamed from: M */
    float f4380M = 0.0f;

    /* renamed from: N */
    boolean f4381N = false;

    /* renamed from: O */
    boolean f4382O = false;

    /* renamed from: P */
    boolean f4383P = false;

    /* renamed from: V */
    public final boolean f4384V = true;

    /* renamed from: an */
    public final Paint f4385an = new Paint();

    /* renamed from: aN */
    public float f4386aN = 0.0f;

    /* renamed from: aO */
    public float f4387aO = 0.0f;

    /* renamed from: aP */
    public float f4388aP = 0.0f;

    /* renamed from: aR */
    public float f4389aR = 0.0f;

    /* renamed from: aT */
    C0748e f4390aT = null;

    /* renamed from: aU */
    C0748e f4391aU = null;

    /* renamed from: aV */
    C0748e f4392aV = null;

    /* renamed from: ba */
    C0748e f4393ba = null;

    /* renamed from: bb */
    C0748e f4394bb = null;

    /* renamed from: bc */
    public C0748e f4395bc = null;

    /* renamed from: bd */
    public C0748e f4396bd = null;

    /* renamed from: be */
    public C0748e f4397be = null;

    /* renamed from: bf */
    C0748e f4398bf = null;

    /* renamed from: bg */
    final Rect f4399bg = new Rect();

    /* renamed from: bh */
    final Rect f4400bh = new Rect();

    /* renamed from: bi */
    final Rect f4401bi = new Rect();

    /* renamed from: bj */
    final Rect f4402bj = new Rect();

    /* renamed from: bk */
    final Rect f4403bk = new Rect();

    /* renamed from: bl */
    final Paint f4404bl = new Paint();

    /* renamed from: bm */
    final Paint f4405bm = new Paint();

    /* renamed from: bn */
    final Paint f4406bn = new C0760q();

    /* renamed from: bo */
    final Paint f4407bo = new Paint();

    /* renamed from: bu */
    public ArrayList f4408bu = new ArrayList();

    /* renamed from: bv */
    public boolean f4409bv = false;

    /* renamed from: bA */
    C0604c f4410bA = C0604c.m1868b(-1, -1);

    /* renamed from: bB */
    long f4411bB = -1;

    /* renamed from: bC */
    long f4412bC = -1;

    /* renamed from: bF */
    public C0846u f4413bF = new C0846u();

    /* renamed from: bH */
    Paint f4414bH = new Paint();

    /* renamed from: bI */
    Rect f4415bI = new Rect();

    /* renamed from: a */
    public boolean m1809a() {
        if (AbstractC0789l.m709am()) {
            return false;
        }
        return AbstractC0789l.m651u().f5479by.useCircleSelect;
    }

    /* renamed from: b */
    float m1759b() {
        return Math.min(this.f4364r * 2.5f, 290.0f) + 10.0f;
    }

    /* renamed from: c */
    float m1747c() {
        AbstractC0789l u = AbstractC0789l.m651u();
        float f = 0.7f;
        if (AbstractC0789l.m710al()) {
            f = 0.9f;
        }
        if (u.f5602cE < 1.0f) {
            float f2 = u.f5602cE;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    /* renamed from: a */
    public void m1765a(String str, int i) {
        this.f4277d.m1899b(str, i);
    }

    /* renamed from: a */
    public void m1766a(String str) {
        this.f4277d.m1904a(str, 100);
    }

    /* renamed from: b */
    public void m1749b(String str) {
        this.f4277d.m1904a(str, 50);
    }

    /* renamed from: c */
    public void m1741c(String str) {
        this.f4277d.m1904a(str, 5);
    }

    /* renamed from: d */
    public void m1740d() {
        this.f4382O = false;
        this.f4383P = false;
        this.f4371D = false;
    }

    /* renamed from: a */
    public boolean m1807a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!f4350bw || this.f4277d.f4145ar) {
            return f < u.f5498bS - u.f5502bX;
        }
        if (u.f5485bE.m1675c(f, f2) != null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m1736e() {
        if (this.f4277d != null) {
            this.f4277d.m1921a();
        }
    }

    /* renamed from: a */
    public void m1762a(boolean z) {
        if (z) {
            this.f4277d.m1882j();
            return;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4277d.m1881k();
        m1724k();
        this.f4363p = false;
        this.f4408bu.clear();
        u.f5583bc = 1.0f;
        u.f5466bf = false;
        u.f5465be = false;
        u.f5578aV = false;
        u.f5580aX = false;
        if (u.m767G() && u.m765I()) {
            u.f5465be = u.f5486bF.f4656o;
        }
        C0647w.m1648a();
    }

    /* renamed from: f */
    public void m1734f() {
        f4350bw = false;
        f4351bx = false;
        f4352by = false;
        if (AbstractC0789l.m710al()) {
            f4350bw = true;
            f4351bx = true;
            f4349a = true;
            f4352by = true;
        }
        if (AbstractC0789l.f5559aI) {
            f4350bw = true;
            f4351bx = true;
            f4352by = true;
        }
        if (AbstractC0789l.m712aj() && !AbstractC0789l.m651u().f5479by.classicInterface) {
            f4350bw = true;
            f4351bx = true;
            f4352by = true;
        }
    }

    /* renamed from: a */
    public void m1791a(Context context) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (AbstractC0789l.m650v()) {
            this.f4409bv = true;
        }
        m1734f();
        this.f4339bp = C0652a.m1589a("gui.notAvailableInDemoText", new Object[0]);
        this.f4340bq = "Locked";
        this.f4341br = C0652a.m1589a("gui.cannotPlace.general", new Object[0]);
        this.f4342bs = C0652a.m1589a("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.f4343bt = C0652a.m1589a("gui.cannotPlace.needsWater", new Object[0]);
        this.f4277d = new C0599a(u, this);
        m1736e();
        this.f4278e = new C0626i(u, this);
        this.f4279f = new C0649y(u);
        this.f4390aT = u.f5477bw.mo194a(C0063R.drawable.button_no);
        this.f4391aU = u.f5477bw.mo194a(C0063R.drawable.button_yes);
        this.f4392aV = u.f5477bw.mo194a(C0063R.drawable.button_more);
        this.f4337aY = new Paint();
        this.f4337aY.m4491d(true);
        this.f4338aZ = new Paint();
        this.f4338aZ.m4491d(true);
        this.f4338aZ.m4522a(40, 255, 255, 255);
        this.f4393ba = u.f5477bw.mo194a(C0063R.drawable.button_add);
        this.f4394bb = u.f5477bw.mo194a(C0063R.drawable.button_subtract);
        this.f4395bc = u.f5477bw.mo194a(C0063R.drawable.icon_rally);
        this.f4396bd = u.f5477bw.mo194a(C0063R.drawable.icon_upgrade);
        this.f4397be = u.f5477bw.mo189a(C0063R.drawable.metal_dark, false);
        this.f4398bf = u.f5477bw.mo189a(C0063R.drawable.touch_indicator, false);
        this.f4406bn.m4522a(145, 0, 175, 0);
        this.f4406bn.m4525a(6.0f);
        C0760q.m849b(this.f4406bn);
        this.f4308ao = new Paint();
        this.f4309ap = new C0760q();
        this.f4309ap.m4522a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4309ap.m4506a(true);
        this.f4309ap.m4495c(true);
        this.f4309ap.mo851a(Typeface.m4434a(Typeface.f243c, 1));
        u.m736a(this.f4309ap, 20.0f);
        this.f4309ap.m4519a(Paint.Align.f196a);
        this.f4312as = new C0760q();
        this.f4312as.m4522a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4312as.m4506a(true);
        this.f4312as.m4495c(true);
        this.f4312as.mo851a(Typeface.m4434a(Typeface.f243c, 1));
        u.m736a(this.f4312as, 18.0f);
        this.f4312as.m4519a(Paint.Align.f196a);
        this.f4310aq = new C0760q();
        this.f4310aq.m4516a(this.f4309ap);
        this.f4310aq.m4522a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4311ar = new C0760q();
        this.f4311ar.m4502b(Color.m4546a(100, 0, 0, 0));
        this.f4311ar.m4517a(Paint.Style.f218c);
        this.f4313at = new C0760q();
        this.f4313at.m4522a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f4313at.m4519a(Paint.Align.f196a);
        this.f4313at.m4495c(true);
        this.f4313at.m4506a(true);
        u.m736a(this.f4313at, 12.0f);
        C0760q.m849b(this.f4313at);
        this.f4316aw = new C0760q();
        if (this.f4409bv) {
            this.f4316aw.m4522a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f4316aw.m4522a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f4316aw.m4519a(Paint.Align.f197b);
        this.f4316aw.m4495c(true);
        this.f4316aw.m4506a(true);
        u.m736a(this.f4316aw, 12.0f);
        C0760q.m849b(this.f4316aw);
        AbstractC0789l.m683d("smallTextPaint size: " + this.f4316aw.m4482k());
        this.f4315av = new C0760q();
        this.f4315av.m4516a(this.f4316aw);
        u.m736a(this.f4315av, 10.0f);
        C0760q.m849b(this.f4315av);
        this.f4314au = new C0760q();
        this.f4314au.m4516a(this.f4316aw);
        u.m736a(this.f4314au, 8.0f);
        C0760q.m849b(this.f4314au);
        this.f4317ax = new C0760q();
        if (this.f4409bv) {
            this.f4317ax.m4522a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f4317ax.m4522a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f4317ax.m4519a(Paint.Align.f197b);
        this.f4317ax.m4495c(true);
        this.f4317ax.m4506a(true);
        u.m736a(this.f4317ax, 20.0f);
        C0760q.m849b(this.f4317ax);
        this.f4318ay = new C0760q();
        this.f4318ay.m4522a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f4318ay.m4519a(Paint.Align.f197b);
        this.f4318ay.m4495c(true);
        this.f4318ay.m4506a(true);
        u.m736a(this.f4318ay, 20.0f);
        C0760q.m849b(this.f4318ay);
        this.f4322aC = new C0760q();
        this.f4322aC.m4522a(150, 20, 20, 20);
        u.m737a(this.f4322aC);
        C0760q.m849b(this.f4322aC);
        this.f4319az = new C0760q();
        this.f4319az.m4516a(this.f4317ax);
        this.f4319az.m4522a(255, 128, 0, 0);
        u.m736a(this.f4319az, 14.0f);
        this.f4319az.m4519a(Paint.Align.f197b);
        C0760q.m849b(this.f4319az);
        this.f4320aA = new C0760q();
        this.f4320aA.m4516a(this.f4319az);
        this.f4320aA.m4522a(255, 220, 222, 49);
        this.f4321aB = new C0760q();
        this.f4321aB.m4516a(this.f4317ax);
        u.m736a(this.f4321aB, 12.0f);
        this.f4321aB.m4522a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f4321aB.m4519a(Paint.Align.f197b);
        C0760q.m849b(this.f4321aB);
        this.f4329aJ = new C0760q();
        this.f4329aJ.m4502b(-16777216);
        this.f4329aJ.m4519a(Paint.Align.f197b);
        this.f4329aJ.m4506a(true);
        this.f4329aJ.m4495c(true);
        this.f4329aJ.mo851a(Typeface.m4434a(Typeface.f243c, 0));
        u.m736a(this.f4329aJ, 14.0f);
        this.f4330aK = new C0760q();
        this.f4330aK.m4516a(this.f4329aJ);
        this.f4330aK.mo851a(Typeface.m4434a(Typeface.f243c, 1));
        u.m736a(this.f4330aK, 16.0f);
        this.f4331aL = new C0760q();
        this.f4331aL.m4516a(this.f4330aK);
        this.f4331aL.m4502b(Color.m4547a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        u.m736a(this.f4331aL, 16.0f);
        this.f4323aD = new C0760q();
        this.f4323aD.m4502b(-16777216);
        this.f4323aD.m4519a(Paint.Align.f197b);
        this.f4323aD.m4506a(true);
        this.f4323aD.m4495c(true);
        this.f4323aD.mo851a(Typeface.m4434a(Typeface.f243c, 0));
        u.m736a(this.f4323aD, 20.0f);
        this.f4324aE = new C0760q();
        this.f4324aE.m4502b(-1);
        this.f4324aE.m4497c(160);
        if (AbstractC0789l.m710al()) {
            this.f4324aE.m4497c(140);
        }
        u.m737a(this.f4324aE);
        this.f4325aF = new C0760q();
        this.f4325aF.m4502b(-16777216);
        this.f4325aF.m4497c(210);
        u.m737a(this.f4325aF);
        this.f4328aI = new C0760q();
        this.f4328aI.m4502b(-7829368);
        this.f4328aI.m4497c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f4328aI.m4517a(Paint.Style.f217b);
        this.f4328aI.m4525a(1.0f);
        u.m737a(this.f4328aI);
        this.f4326aG = new C0760q();
        this.f4326aG.m4502b(-16711936);
        this.f4326aG.m4497c(80);
        this.f4326aG.m4517a(Paint.Style.f216a);
        this.f4326aG.m4525a(4.0f);
        u.m737a(this.f4326aG);
        this.f4327aH = new C0760q();
        this.f4327aH.m4502b(Color.m4546a(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.f4327aH.m4517a(Paint.Style.f216a);
        this.f4327aH.m4525a(8.0f);
        u.m737a(this.f4327aH);
    }

    /* renamed from: g */
    public void m1732g() {
        this.f4278e.m1696b();
        this.f4279f.m1635b();
        this.f4347bE = false;
    }

    /* renamed from: a */
    public void m1808a(float f) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4280q += f;
        this.f4386aN = C0654f.m1575a(this.f4386aN, f);
        this.f4387aO = C0654f.m1575a(this.f4387aO, f);
        this.f4389aR = C0654f.m1575a(this.f4389aR, 0.08f * f);
        this.f4388aP = C0654f.m1575a(this.f4388aP, f);
        this.f4283z += f;
        this.f4332aM += 0.05f * f;
        if (this.f4332aM > 1.0f) {
            this.f4332aM -= 1.0f;
            if (this.f4332aM > 1.0f) {
                this.f4332aM = 0.0f;
            }
        }
        u.f5619de = 4.0f * this.f4389aR;
        float f2 = 1.0f * f;
        if (!this.f4371D) {
            float f3 = this.f4379L * f;
            float f4 = this.f4380M * f;
            float g = C0654f.m1481g(80.0f, f3);
            float g2 = C0654f.m1481g(80.0f, f4);
            u.f5510cf += g;
            u.f5511cg += g2;
        } else {
            f2 *= 4.0f;
        }
        float b = C0654f.m1527b(0.0f, 0.0f, this.f4379L, this.f4380M);
        float d = C0654f.m1499d(0.0f, 0.0f, this.f4379L, this.f4380M);
        if (b > 30.0f) {
            b = 30.0f;
        }
        float a = C0654f.m1575a(b, f2);
        this.f4379L = C0654f.m1474i(d) * a;
        this.f4380M = C0654f.m1478h(d) * a;
        this.f4334aS = false;
        this.f4371D = u.m754T() && u.f5628dt[0] && this.f4386aN == 0.0f;
        if (this.f4387aO != 0.0f) {
            if (!this.f4371D) {
                this.f4387aO = 0.0f;
            }
            this.f4371D = false;
            this.f4370C = false;
        }
        boolean z = false;
        if (this.f4388aP > 0.0f) {
            z = true;
        }
        if (u.m754T() && u.m752V() > 1) {
            z = true;
            this.f4388aP = 4.0f;
        }
        if (z) {
            this.f4371D = false;
            this.f4370C = false;
            this.f4381N = false;
            this.f4364r = 0.0f;
        }
        this.f4374G = u.m751W() > u.f5517cm;
        this.f4382O = !this.f4371D && this.f4370C;
        this.f4383P = this.f4371D && !this.f4370C;
        if (AbstractC0789l.m710al() && u.f5479by.mouseSupport) {
            this.f4367u = u.m751W();
            this.f4368v = u.m750X();
        }
        if (!this.f4371D && !this.f4382O) {
            this.f4282y = false;
        }
        if (this.f4371D) {
            this.f4364r += f;
            this.f4365s = u.m699b(0);
            this.f4366t = u.m691c(0);
            this.f4367u = this.f4365s;
            this.f4368v = this.f4366t;
            this.f4369w = u.m685d(0);
            this.f4281x = m1807a(this.f4365s, this.f4366t);
            boolean z2 = false;
            if (this.f4281x && !this.f4370C) {
                if (this.f4283z < 30.0f) {
                    float a2 = C0654f.m1573a(this.f4284A, this.f4285B, this.f4365s, this.f4366t);
                    float f5 = 10.0f * u.f5496bQ;
                    if (AbstractC0789l.m711ak()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (a2 < f5 * f5) {
                        z2 = true;
                    }
                }
                this.f4283z = 0.0f;
                this.f4284A = this.f4365s;
                this.f4285B = this.f4366t;
            }
            if (z2) {
                this.f4282y = true;
            }
            if (!this.f4370C) {
                this.f4381N = false;
                this.f4375H = this.f4365s;
                this.f4376I = this.f4366t;
                this.f4377J = this.f4365s;
                this.f4378K = this.f4366t;
                this.f4372E = u.f5485bE.m1675c(this.f4365s, this.f4366t) != null;
                this.f4373F = false;
                if (!this.f4372E) {
                    this.f4373F = this.f4365s > u.f5517cm;
                }
            }
            this.f4370C = true;
        }
        if (this.f4371D && (this.f4364r <= 20.0f || !m1809a())) {
            float a3 = C0654f.m1573a(this.f4375H, this.f4376I, this.f4365s, this.f4366t);
            if (!this.f4372E) {
                float f6 = 30.0f * u.f5496bQ;
                if (AbstractC0789l.m710al() && u.f5479by.mouseSupport && u.m680e(3)) {
                    f6 = 0.0f;
                }
                if (!this.f4381N && a3 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (u.f5479by.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!u.f5479by.mouseSupport || this.f4369w != i) && !m1742c(u)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f4381N = true;
                    }
                    this.f4377J = this.f4365s;
                    this.f4378K = this.f4366t;
                }
            }
        }
        if (AbstractC0789l.m710al() && !u.f5449al && u.f5447aj != null && ((u.f5447aj.mo216f() || AbstractC0789l.f5459aD) && (!this.f4371D || this.f4277d.f4153c))) {
            float f7 = (24.0f * u.f5479by.edgeScrollSpeed) / u.f5602cE;
            float f8 = u.f5510cf;
            float f9 = u.f5511cg;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.f4367u <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.f4367u >= u.f5498bS - 1.0f) {
                f10 += f7 * f;
            }
            if (this.f4368v <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.f4368v >= u.f5499bT - 1.0f) {
                f11 += f7 * f;
            }
            u.f5510cf += f10;
            u.f5511cg += f11;
            u.m764J();
            this.f4277d.f4168B.f231a -= (u.f5510cf - f8) * u.f5602cE;
            this.f4277d.f4168B.f232b -= (u.f5511cg - f9) * u.f5602cE;
        }
        C0537ac acVar = u.f5482bB;
        if (u.f5479by.keyboardSupport) {
            if (u.m648x()) {
                float f12 = 12.0f * u.f5479by.scrollSpeed;
                if (acVar.f3623p.m2137b()) {
                    u.f5510cf -= f12 * f;
                }
                if (acVar.f3624q.m2137b()) {
                    u.f5510cf += f12 * f;
                }
                if (acVar.f3621n.m2137b()) {
                    u.f5511cg -= f12 * f;
                }
                if (acVar.f3622o.m2137b()) {
                    u.f5511cg += f12 * f;
                }
                if (acVar.f3625r.m2137b()) {
                    u.f5600cC += 0.1f;
                }
                if (acVar.f3626s.m2137b()) {
                    u.f5600cC -= 0.1f;
                }
            }
            if (acVar.f3632y.m2143a()) {
                m1724k();
                m1704w();
            }
            if (acVar.f3633z.m2143a()) {
                this.f4279f.m1631d();
            }
            if (acVar.f3634A.m2143a()) {
                m1724k();
                m1704w();
                Iterator it = AbstractC0854w.f5846dK.iterator();
                while (it.hasNext()) {
                    AbstractC0854w wVar = (AbstractC0854w) it.next();
                    if (wVar instanceof AbstractC0515r) {
                        AbstractC0515r rVar = (AbstractC0515r) wVar;
                        if (!rVar.f1520bz && rVar.f1441bB == u.f5464bb && rVar.mo2421l() && !rVar.mo3620ai() && rVar.m2328aO()) {
                            m1725j(rVar);
                        }
                    }
                }
            }
            if (acVar.f3635B.m2143a()) {
                m1724k();
                m1704w();
                Iterator it2 = AbstractC0854w.f5846dK.iterator();
                while (it2.hasNext()) {
                    AbstractC0854w wVar2 = (AbstractC0854w) it2.next();
                    if (wVar2 instanceof AbstractC0515r) {
                        AbstractC0515r rVar2 = (AbstractC0515r) wVar2;
                        if (rVar2.f1441bB == u.f5464bb && rVar2.mo1660r() == EnumC0215ak.f1588e && !rVar2.f1520bz) {
                            m1725j(rVar2);
                            u.m701b(rVar2.f5841dH, rVar2.f5842dI);
                        }
                    }
                }
            }
            if (acVar.f3636C.m2143a()) {
                AbstractC0639u.m1657a(this.f4408bu, AbstractC0639u.f4526a, AbstractC0639u.f4527b);
            }
            if (acVar.f3637D.m2143a()) {
                AbstractC0639u.m1657a(this.f4408bu, AbstractC0639u.f4528c, null);
            }
            if (acVar.f3638E.m2143a()) {
                AbstractC0639u.m1657a(this.f4408bu, AbstractC0639u.f4529d, null);
            }
            if (acVar.f3639F.m2143a()) {
                AbstractC0639u.m1657a(this.f4408bu, AbstractC0639u.f4530e, null);
            }
            if (acVar.f3640G.m2143a()) {
                AbstractC0639u.m1657a(this.f4408bu, AbstractC0639u.f4531f, null);
            }
            if (acVar.f3631x.m2143a()) {
                this.f4277d.m1917a(12);
            }
            if (acVar.f3647N.m2143a() && m1701z() && m1817A()) {
                m1724k();
                this.f4290U = null;
                this.f4291W = this.f4354g;
                return;
            } else if (acVar.f3649P.m2143a() && m1702y()) {
                m1724k();
                this.f4290U = null;
                this.f4291W = this.f4355h;
                return;
            } else if (!acVar.f3650Q.m2143a() || !m1817A()) {
                if (acVar.f3648O.m2143a()) {
                    m1707t();
                }
                if (acVar.f3629v.m2143a()) {
                    m1811G();
                }
                if (acVar.f3627t.m2143a() && u.m767G()) {
                    AbstractC0789l.m683d("showing send chat");
                    this.f4277d.m1917a(13);
                }
                if (acVar.f3628u.m2143a() && u.m767G()) {
                    AbstractC0789l.m683d("showing send team chat");
                    this.f4277d.m1917a(16);
                }
                if (u.m765I() || u.f5490bJ.m1995h()) {
                    if (acVar.f3645L.m2143a()) {
                        if (u.f5583bc != 0.0f) {
                            if (!u.f5490bJ.m1995h()) {
                                Hcat_Multiplaye.m1335a((String) null, "Game paused");
                            }
                            u.f5583bc = 0.0f;
                        } else {
                            u.f5583bc = 1.0f;
                        }
                    }
                    boolean a4 = acVar.f3643J.m2143a();
                    boolean a5 = acVar.f3644K.m2143a();
                    if (a4 || a5) {
                        if (a4) {
                            boolean z4 = u.f5583bc > 1.0f;
                            if (u.f5583bc < 2.0f) {
                                u.f5583bc = (float) (u.f5583bc - 0.25d);
                            } else if (u.f5583bc < 6.0f) {
                                u.f5583bc = (float) (u.f5583bc - 0.5d);
                            } else if (u.f5583bc < 16.0f) {
                                u.f5583bc -= 2.0f;
                            } else {
                                u.f5583bc -= 4.0f;
                            }
                            if (u.f5583bc < 0.0f) {
                                u.f5583bc = 0.0f;
                            }
                            if (z4 && u.f5583bc < 1.0f) {
                                u.f5583bc = 1.0f;
                            }
                        } else if (a5) {
                            boolean z5 = u.f5583bc < 1.0f;
                            if (u.f5583bc < 2.0f) {
                                u.f5583bc = (float) (u.f5583bc + 0.25d);
                            } else if (u.f5583bc < 6.0f) {
                                u.f5583bc = (float) (u.f5583bc + 0.5d);
                            } else if (u.f5583bc < 16.0f) {
                                u.f5583bc += 2.0f;
                            } else {
                                u.f5583bc += 4.0f;
                            }
                            if (u.f5490bJ.m1995h()) {
                                if (u.f5583bc > 64.0f) {
                                    u.f5583bc = 64.0f;
                                }
                            } else if (u.f5583bc > 5.0f) {
                                u.f5583bc = 5.0f;
                            }
                            if (z5 && u.f5583bc > 1.0f) {
                                u.f5583bc = 1.0f;
                            }
                        }
                        if (!u.f5490bJ.m1995h()) {
                            Hcat_Multiplaye.m1335a((String) null, "Game speed now: " + u.f5583bc);
                        }
                    }
                }
                u.f5524cA = C0654f.m1575a(u.f5524cA, f);
                if (acVar.f3658Y.m2143a()) {
                    u.f5524cA = 180.0f;
                }
                if (u.f5465be && acVar.f3661ab.m2143a()) {
                    u.f5578aV = !u.f5578aV;
                    AbstractC0789l.m683d("debugTempMode now: " + u.f5578aV);
                    m1766a("debug: " + u.f5578aV);
                }
                if (u.f5465be && u.f5578aV && acVar.f3662ac.m2143a()) {
                    C0118a.f509ab = !C0118a.f509ab;
                    m1766a("AI debug view: " + C0118a.f509ab);
                }
                if (u.f5465be && u.f5578aV && acVar.f3663ad.m2143a()) {
                    C0781f.f5371a = !C0781f.f5371a;
                    m1766a("Map debug: " + C0781f.f5371a);
                }
                if (u.m765I() || u.f5490bJ.m1995h()) {
                    if (u.f5465be) {
                        if (acVar.f3655V.m2143a()) {
                            u.f5463aZ = !u.f5463aZ;
                        }
                        if (acVar.f3656W.m2143a()) {
                            if (u.f5583bc == 1.0f) {
                                u.f5583bc = 0.1f;
                            } else {
                                u.f5583bc = 1.0f;
                            }
                        }
                        if (acVar.f3657X.m2143a()) {
                            AbstractC0789l.m683d("Adding test popup");
                            u.f5486bF.m1381M();
                        }
                        if (acVar.f3659Z.m2143a()) {
                            u.f5466bf = !u.f5466bf;
                        }
                        if (acVar.f3660aa.m2143a()) {
                            Iterator it3 = AbstractC0854w.f5846dK.iterator();
                            while (it3.hasNext()) {
                                AbstractC0854w wVar3 = (AbstractC0854w) it3.next();
                                if (wVar3 instanceof AbstractC0515r) {
                                    AbstractC0515r rVar3 = (AbstractC0515r) wVar3;
                                    if (rVar3.f1460ci) {
                                        rVar3.m2393S();
                                    }
                                }
                            }
                        }
                    }
                    if (acVar.f3654U.m2143a()) {
                        u.f5465be = !u.f5465be;
                        if (u.f5465be) {
                            m1704w();
                        }
                    }
                }
            } else {
                m1724k();
                this.f4290U = null;
                this.f4291W = this.f4356i;
                return;
            }
        }
        if (u.f5465be && !u.m765I() && !u.f5490bJ.m1995h()) {
            u.f5465be = false;
        }
        if (u.f5465be) {
            if (this.f4276c != null && (this.f4276c.f5836dC || this.f4276c.f1520bz)) {
                this.f4276c = null;
            }
            if (this.f4276c == null) {
                AbstractC0789l.m683d("Creating new debug editor");
                this.f4276c = new C0465h(false);
                this.f4276c.mo3633a(u.f5464bb);
            }
            if (m1714p() == 0) {
                m1704w();
                m1725j(this.f4276c);
            }
            if (u.f5479by.liveReloading && u.f5585bg % 100 == 0 && !u.f5490bJ.m1996g()) {
                C0307ac.m3339b();
            }
        } else {
            if (this.f4276c != null && (this.f4276c.f5836dC || this.f4276c.f1520bz)) {
                this.f4276c = null;
            }
            if (this.f4276c != null && !u.f5490bJ.m1995h()) {
                m1730h();
            }
        }
        if (this.f4381N) {
            if (this.f4373F) {
                this.f4277d.f4144aq = this.f4378K - this.f4366t;
            } else {
                int i2 = 1;
                if (u.f5479by.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!u.f5479by.mouseSupport || this.f4369w != i2) && !m1742c(u)) {
                    SettingsEngine settingsEngine = u.f5479by;
                    double d2 = this.f4377J - this.f4365s;
                    double d3 = this.f4378K - this.f4366t;
                    float b2 = C0654f.m1527b(0.0f, 0.0f, (float) d2, (float) d3);
                    double d4 = (d2 * settingsEngine.scrollSpeed) / u.f5602cE;
                    double d5 = (d3 * settingsEngine.scrollSpeed) / u.f5602cE;
                    if (f != 0.0f && b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (AbstractC0789l.m710al()) {
                            f13 = 1.7f;
                        }
                        this.f4379L = (float) (d4 * f13);
                        this.f4380M = (float) (d5 * f13);
                    }
                    u.f5510cf = (float) (u.f5510cf + (d4 * 2.0d));
                    u.f5511cg = (float) (u.f5511cg + (d5 * 2.0d));
                }
            }
            this.f4377J = this.f4365s;
            this.f4378K = this.f4366t;
        }
        if (u.f5479by.mouseSupport && !(this.f4410bA.f4202a == ((int) u.m751W()) && this.f4410bA.f4203b == ((int) u.m750X()))) {
            this.f4410bA.f4202a = (int) u.m751W();
            this.f4410bA.f4203b = (int) u.m750X();
            this.f4361n.m1843b(this.f4410bA);
        }
        if (this.f4382O && m1810H()) {
            this.f4361n.m1843b(C0604c.m1870a((int) this.f4367u, (int) this.f4368v));
        }
        this.f4361n.m1845b(f);
    }

    /* renamed from: h */
    public void m1730h() {
        if (this.f4276c != null) {
            m1721l(this.f4276c);
            this.f4276c.m3608bU();
            this.f4276c = null;
        }
    }

    /* renamed from: i */
    public C0465h m1728i() {
        return this.f4276c;
    }

    /* renamed from: a */
    public void m1779a(C0465h hVar) {
        this.f4276c = hVar;
    }

    /* renamed from: a */
    public boolean m1769a(AbstractC0789l lVar) {
        if (!lVar.f5479by.keyboardSupport) {
            return false;
        }
        return lVar.m690c(59, 60);
    }

    /* renamed from: b */
    public boolean m1750b(AbstractC0789l lVar) {
        if (!lVar.f5479by.keyboardSupport) {
            return false;
        }
        return lVar.m690c(113, 114);
    }

    /* renamed from: c */
    public boolean m1742c(AbstractC0789l lVar) {
        if (!lVar.f5479by.keyboardSupport) {
            return false;
        }
        return lVar.m690c(57, 58);
    }

    /* renamed from: b */
    public void m1758b(float f) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4289T += 0.2f * f;
        if (this.f4289T > 360.0f) {
            this.f4289T -= 360.0f;
        }
        this.f4401bi.m4469a((int) (u.f5498bS - u.f5502bX), 0, (int) u.f5498bS, (int) u.f5499bT);
        if (!f4350bw) {
            if (this.f4409bv) {
                this.f4404bl.m4526a();
                this.f4404bl.m4502b(Color.m4546a(255, 33, 40, 52));
                this.f4404bl.m4517a(Paint.Style.f216a);
                u.f5477bw.mo142b(this.f4401bi, this.f4404bl);
            } else {
                u.f5477bw.mo172a(this.f4397be, this.f4401bi, (Paint) null);
            }
            this.f4404bl.m4526a();
            this.f4404bl.m4502b(Color.m4546a(255, 0, 0, 0));
            this.f4404bl.m4517a(Paint.Style.f217b);
            u.f5477bw.mo142b(this.f4401bi, this.f4404bl);
        }
        this.f4344bJ = 0;
        AbstractC0515r r = m1710r();
        if (!(u.f5464bb == null || u.f5464bb == AbstractC0171m.f1281g)) {
            m1767a(u, u.f5464bb, false, true);
        }
        if (!(r == null || u.f5464bb == r.f1441bB || !m1719m(r))) {
            m1767a(u, r.f1441bB, true, true);
        }
        if (u.f5465be && !u.f5490bJ.m1995h()) {
            String str = "";
            if (u.f5465be) {
                str = str + "Editor Active\n";
            }
            if (u.f5583bc != 1.0f) {
                str = str + "Game Speed: " + u.f5583bc + "x\n";
            }
            if (u.f5466bf) {
                str = str + "Invincible Units\n";
            }
            boolean z = false;
            Iterator it = AbstractC0171m.m3782c().iterator();
            while (it.hasNext()) {
                AbstractC0171m mVar = (AbstractC0171m) it.next();
                if (mVar instanceof C0118a) {
                    z = ((C0118a) mVar).f574bo > 0.0f;
                }
            }
            if (z) {
                str = str + "AIs frozen\n";
            }
            this.f4404bl.m4526a();
            this.f4404bl.m4502b(Color.m4546a(0, 0, 0, 0));
            this.f4404bl.m4517a(Paint.Style.f216a);
            u.f5477bw.mo157a(str, 70.0f * u.f5496bQ, 40.0f, this.f4312as, this.f4404bl, 6.0f);
        }
        m1726j();
        this.f4361n.m1835f();
    }

    /* renamed from: j */
    public void m1726j() {
        AbstractC0789l.m651u();
    }

    /* renamed from: a */
    public void m1767a(AbstractC0789l lVar, AbstractC0171m mVar, boolean z, boolean z2) {
        String str;
        int i;
        if (mVar.f1233l) {
            String str2 = "$" + String.valueOf(mVar.money + mVar.f1235n);
            int r = mVar.m3736r();
            if (r >= 0) {
                str = str2 + "(+" + r + ")";
            } else {
                str = str2 + "(" + r + ")";
            }
            if (!f4345bz) {
                i = (int) (lVar.f5498bS - lVar.f5502bX);
            } else {
                i = (int) lVar.f5498bS;
            }
            Paint paint = this.f4309ap;
            if (z) {
                paint = this.f4310aq;
            }
            float b = lVar.f5477bw.mo138b(str, paint);
            float a = lVar.f5477bw.mo156a(str, paint);
            lVar.f5477bw.mo157a(str, (i - b) - 6, this.f4344bJ + 6, paint, this.f4311ar, 6);
            this.f4344bJ = (int) (this.f4344bJ + a + (6 * 1));
        }
        if (z2) {
            C0354d P = mVar.m3819P();
            if (!P.m3201b()) {
                m1768a(lVar, mVar, z, P);
            }
        }
    }

    /* renamed from: a */
    public void m1768a(AbstractC0789l lVar, AbstractC0171m mVar, boolean z, C0354d dVar) {
        String str;
        Iterator it = dVar.f2377b.iterator();
        while (it.hasNext()) {
            C0353c cVar = (C0353c) it.next();
            if (cVar.f2375b != 0.0d && !cVar.f2374a.m3234a()) {
                if (cVar.f2374a.f2348e) {
                    str = "" + ((int) cVar.f2375b);
                } else {
                    str = C0654f.m1513c(cVar.f2375b);
                }
                String str2 = cVar.f2374a.m3223g() + ": " + str;
                int a = mVar.m3811a(cVar.f2374a);
                if (a != 0) {
                    if (a >= 0) {
                        str2 = str2 + "(+" + a + ")";
                    } else {
                        str2 = str2 + "(" + a + ")";
                    }
                }
                int i = (int) (lVar.f5498bS - lVar.f5502bX);
                Paint paint = this.f4309ap;
                if (z) {
                    paint = this.f4310aq;
                } else {
                    Integer f = cVar.f2374a.m3224f();
                    if (f != null) {
                        this.f4385an.m4516a(paint);
                        paint = this.f4385an;
                        paint.m4502b(f.intValue());
                    }
                }
                float b = lVar.f5477bw.mo138b(str2, paint);
                float a2 = lVar.f5477bw.mo156a(str2, paint);
                lVar.f5477bw.mo157a(str2, (i - b) - 6, this.f4344bJ + 6, paint, this.f4311ar, 6);
                this.f4344bJ = (int) (this.f4344bJ + a2 + (6 * 1));
            }
        }
    }

    /* renamed from: b */
    public boolean m1748b(boolean z) {
        return m1760a(z, false, false);
    }

    /* renamed from: a */
    public boolean m1761a(boolean z, boolean z2) {
        return m1760a(z, true, z2);
    }

    /* renamed from: a */
    public boolean m1760a(boolean z, boolean z2, boolean z3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (AbstractC0789l.m710al()) {
            return false;
        }
        this.f4335aW = true;
        float f = u.f5496bQ * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((u.f5499bT - ((int) (9.0f * f))) - (i * this.f4336aX));
        if (f4345bz) {
            i3 = (int) (i3 - u.f5485bE.f4458d);
        }
        if (z3) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.f4402bj.m4469a(i2 + i4, i3, i2 + i4 + i, i3 + i);
            u.f5477bw.mo174a(this.f4392aV, this.f4402bj.f227a, this.f4402bj.f228b, this.f4337aY, 0.0f, f);
        } else if (z) {
            this.f4402bj.m4469a(i2, i3, i2 + i, i3 + i);
            u.f5477bw.mo174a(this.f4391aU, this.f4402bj.f227a, this.f4402bj.f228b, this.f4337aY, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.f4402bj.m4469a(i2 + i5, i3, i2 + i5 + i, i3 + i);
            u.f5477bw.mo174a(this.f4390aT, this.f4402bj.f227a, this.f4402bj.f228b, this.f4337aY, 0.0f, f);
        }
        if (!this.f4382O || this.f4381N) {
            return false;
        }
        C0654f.m1559a(this.f4402bj, 10.0f * f);
        if (this.f4402bj.m4466b((int) this.f4365s, (int) this.f4366t)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1724k() {
        AbstractC0789l.m651u();
        if (this.f4291W == null) {
            return false;
        }
        if (this.f4291W.mo2461e() == EnumC0199u.f1370b) {
            this.f4291W = null;
            this.f4293Y = false;
            this.f4297ac = false;
            this.f4290U = null;
            this.f4304aj = false;
            this.f4292X++;
        } else {
            this.f4291W = null;
        }
        this.f4307am = 0;
        return true;
    }

    /* renamed from: c */
    public void m1746c(float f) {
        float f2;
        float f3;
        AbstractC0789l u = AbstractC0789l.m651u();
        Point c = u.f5485bE.m1675c(this.f4365s, this.f4366t);
        if (c != null) {
            f3 = c.f221a;
            f2 = c.f222b;
        } else {
            f3 = (this.f4365s / u.f5602cE) + u.f5508cd;
            f2 = (this.f4366t / u.f5602cE) + u.f5509ce;
        }
        this.f4294Z = C0654f.m1575a(this.f4294Z, f);
        this.f4401bi.m4469a((int) (u.f5498bS - u.f5502bX), 0, (int) u.f5498bS, (int) u.f5499bT);
        if (!f4350bw && ((this.f4382O || this.f4371D) && this.f4401bi.m4466b((int) this.f4365s, (int) this.f4366t))) {
            this.f4334aS = true;
        }
        this.f4277d.m1920a(f);
        this.f4277d.m1902b(f);
        this.f4287R += f;
        if (!u.m652t()) {
            this.f4277d.m1919a(f, this.f4277d.m1893d(f));
            this.f4277d.m1885g(f);
            this.f4278e.m1698a(f);
            this.f4279f.m1639a(f);
            if (this.f4363p) {
                this.f4277d.m1897c(f);
            }
            this.f4277d.m1890e(f);
            this.f4277d.m1918a(f, true);
        }
        m1804a(f, f3, f2, c);
        if (!u.m652t() && !this.f4363p) {
            this.f4277d.m1897c(f);
        }
        boolean z = false;
        if (!this.f4381N) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (AbstractC0789l.m710al() && u.f5479by.mouseSupport) {
                if (u.f5479by.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (u.f5479by.mouseOrders == 1) {
                        if (u.m680e(1)) {
                            z3 = true;
                        } else if (u.m680e(2)) {
                            z4 = true;
                        }
                    } else if (u.m680e(2)) {
                        z3 = true;
                    } else if (u.m680e(1)) {
                        z4 = true;
                    }
                }
            }
            if (this.f4371D && c != null && this.f4372E) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                if (m1714p() == 0 || !m1817A()) {
                    z5 = true;
                }
                if (z2 && this.f4364r > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    u.m701b(f3, f2);
                    z = true;
                }
            }
            if ((this.f4281x || (c != null && (z2 || z4))) && !z && this.f4291W == null && this.f4382O) {
                if (this.f4364r <= 30.0f) {
                    u.f5525cB = false;
                    if (z2) {
                        AbstractC0210af afVar = null;
                        AbstractC0210af afVar2 = null;
                        if (c == null) {
                            afVar = m1799a(f3, f2, true);
                            afVar2 = m1799a(f3, f2, false);
                        }
                        if (afVar == null && afVar2 == null) {
                            m1745c(f3, f2, c);
                        } else if (afVar2 == null) {
                            m1782a(afVar);
                        } else if (!m1780a(afVar2, true, f3, f2, c)) {
                            if (!afVar2.mo1659t()) {
                                m1782a(afVar2);
                            } else if (afVar != null) {
                                m1782a(afVar);
                            }
                        }
                    } else if (z3) {
                        AbstractC0210af afVar3 = null;
                        if (c == null) {
                            afVar3 = m1799a(f3, f2, true);
                        }
                        m1782a(afVar3);
                    } else if (z4) {
                        AbstractC0210af afVar4 = null;
                        if (c == null) {
                            afVar4 = m1799a(f3, f2, false);
                        }
                        boolean z6 = false;
                        if (afVar4 == null) {
                            z6 = true;
                        } else if (!m1780a(afVar4, false, f3, f2, c)) {
                            z6 = true;
                        }
                        if (z6) {
                            m1745c(f3, f2, c);
                        }
                    }
                } else if (m1809a() && c == null) {
                    m1704w();
                    m1756b(f3, f2, m1759b() / u.f5602cE);
                    m1815C();
                }
            }
        }
        if (this.f4291W == null && this.f4371D && !this.f4381N && !this.f4372E && !this.f4334aS) {
            this.f4308ao.m4517a(Paint.Style.f216a);
            this.f4308ao.m4525a(1.0f);
            if (this.f4364r > 20.0f && m1809a()) {
                float b = m1759b();
                this.f4308ao.m4522a(100, 0, 255, 0);
                u.f5477bw.mo195a(this.f4365s, this.f4366t, b, this.f4308ao);
                this.f4308ao.m4517a(Paint.Style.f217b);
                this.f4308ao.m4525a(1.0f);
                this.f4308ao.m4522a(200, 0, 255, 0);
                u.f5477bw.mo195a(this.f4365s, this.f4366t, b, this.f4308ao);
            }
        }
        if (u.f5577aU && u.m754T() && u.m752V() > 0) {
            Paint paint = new Paint();
            paint.m4497c(100);
            for (int i = 0; i < u.m752V(); i++) {
                u.f5477bw.mo127h();
                u.f5477bw.mo198a(0.7f, 0.7f, u.m699b(i), u.m691c(i));
                u.f5477bw.mo175a(this.f4398bf, u.m699b(i), u.m691c(i), paint);
                u.f5477bw.mo126i();
            }
        }
        if (!this.f4371D) {
            this.f4364r = 0.0f;
            this.f4381N = false;
        }
        this.f4370C = this.f4371D;
        u.m753U();
    }

    /* renamed from: a */
    public void m1804a(float f, float f2, float f3, Point point) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4335aW) {
            this.f4336aX = C0654f.m1574a(this.f4336aX, 1.0f, 0.05f * f);
            this.f4336aX = (float) (this.f4336aX + (0.08d * (1.0f - this.f4336aX)));
        } else {
            this.f4336aX = C0654f.m1574a(this.f4336aX, 0.0f, 0.3f * f);
        }
        this.f4335aW = false;
        if (this.f4291W == null) {
            return;
        }
        if (this.f4291W.mo2461e() == EnumC0199u.f1373e) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                AbstractC0210af a = m1799a(f2, f3, false);
                if (a == null || !this.f4291W.mo3676p(a)) {
                    m1806a(f2, f3, 0.0f);
                } else {
                    m1751b(a);
                    if (!m1769a(u)) {
                        m1724k();
                    }
                }
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1374f) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                AbstractC0210af a2 = m1799a(f2, f3, true);
                if (a2 == null || !this.f4291W.mo3676p(a2)) {
                    m1806a(f2, f3, 0.0f);
                } else {
                    m1737d(a2);
                    if (!m1769a(u)) {
                        m1724k();
                    }
                }
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1372d) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                m1757b(f2, f3);
                m1724k();
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1375g) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            AbstractC0210af f4 = this.f4277d.m1888f();
            if (f4 != null && (f4 instanceof AbstractC0515r)) {
                u.f5477bw.mo127h();
                u.m763K();
                ((AbstractC0515r) f4).m2367a(this.f4291W);
                u.f5477bw.mo126i();
            }
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l() && point == null) {
                boolean z = false;
                if (m1787a(this.f4291W, f2, f3)) {
                    z = true;
                }
                if (!z) {
                    m1752b(this.f4291W, f2, f3);
                    if (!m1769a(u)) {
                        m1724k();
                    }
                } else {
                    m1806a(f2, f3, 0.0f);
                }
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1376h) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                m1739d(f2, f3, point);
                if (!m1769a(u)) {
                    m1724k();
                    this.f4382O = false;
                }
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1380l) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                AbstractC0210af a3 = m1799a(f2, f3, true);
                if (a3 == null || !this.f4291W.mo3676p(a3)) {
                    m1806a(f2, f3, 0.0f);
                } else {
                    m1735e(a3);
                    m1724k();
                }
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1381m) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l()) {
                m1801a(f2, f3, point, this.f4307am == 0);
                this.f4307am++;
            }
        } else if (this.f4291W.mo2461e() == EnumC0199u.f1378j) {
            m1784a(this.f4291W, false, (AbstractC0210af) null, false);
            if (m1748b(false) || m1720m()) {
                m1724k();
                this.f4382O = false;
            } else if (this.f4382O && !this.f4381N && !m1722l() && point == null) {
                if (this.f4291W instanceof C0188j) {
                    m1802a(f2, f3, point, (C0188j) this.f4291W);
                } else {
                    AbstractC0789l.m695b("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.f4291W.getClass().getName());
                }
                m1724k();
                this.f4382O = false;
            }
        } else if (this.f4291W.mo2686i() != null && this.f4291W.mo2461e() == EnumC0199u.f1370b) {
            m1803a(f2, f3, point);
        }
    }

    /* renamed from: a */
    public void m1803a(float f, float f2, Point point) {
        boolean z;
        Point a;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af f3 = this.f4277d.m1888f();
        boolean z2 = false;
        if (f3 != null) {
            z2 = this.f4291W.mo2470a(f3, true) && !C0599a.m1914a(this.f4291W);
            if (!this.f4291W.mo2465a(f3)) {
                z2 = false;
            }
        }
        m1784a(this.f4291W, false, (AbstractC0210af) null, !z2);
        float f4 = this.f4367u / u.f5602cE;
        float f5 = this.f4368v / u.f5602cE;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (AbstractC0789l.m709am() && u.f5479by.mouseSupport) {
            z3 = true;
            z6 = this.f4374G;
        }
        if (z3) {
            if (!m1718n()) {
                this.f4304aj = false;
            } else if (!this.f4304aj) {
                this.f4304aj = true;
                this.f4302ah = f4 + u.f5508cd;
                this.f4303ai = f5 + u.f5509ce;
            }
            if (this.f4304aj) {
                float f6 = f4 - (this.f4302ah - u.f5508cd);
                float f7 = f5 - (this.f4303ai - u.f5509ce);
                if (C0654f.m1512c(f6) > 4.0f || C0654f.m1512c(f7) > 4.0f) {
                    z4 = true;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = false;
        if (AbstractC0789l.m710al() && u.f5479by.mouseSupport) {
            z12 = true;
        }
        if (this.f4293Y && !z12) {
            if (z2) {
                if (!this.f4297ac && m1761a(true, false)) {
                    u.f5475bu.m2172b(C0530e.f3569g, 0.5f);
                    this.f4382O = false;
                    z7 = true;
                }
                if (m1761a(true, true)) {
                    u.f5475bu.m2172b(C0530e.f3569g, 0.5f);
                    this.f4382O = false;
                    z9 = true;
                }
            }
            if (m1761a(false, false)) {
                u.f5475bu.m2172b(C0530e.f3570h, 0.7f);
                this.f4382O = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (AbstractC0789l.m709am() && u.f5479by.mouseSupport) {
            z13 = true;
        }
        if (this.f4382O && !this.f4381N) {
            z13 = true;
        }
        if (AbstractC0789l.m711ak()) {
            z5 = true;
            if (u.m752V() == 2) {
                z13 = true;
                f4 = u.m699b(0) / u.f5602cE;
                f5 = u.m691c(0) / u.f5602cE;
                float b = u.m699b(1) / u.f5602cE;
                this.f4304aj = true;
                this.f4302ah = b;
                this.f4303ai = u.m691c(1) / u.f5602cE;
            } else if (this.f4382O && !this.f4381N) {
                this.f4304aj = false;
            }
            if (this.f4304aj) {
                z4 = true;
            }
        }
        if (z13) {
            this.f4293Y = true;
            this.f4295aa = f4 * u.f5602cE;
            this.f4296ab = f5 * u.f5602cE;
            if (!m1807a(u.m751W(), u.m750X())) {
                this.f4293Y = false;
                z11 = false;
            }
        }
        float f8 = this.f4302ah;
        float f9 = this.f4303ai;
        if (z5) {
            f8 += u.f5508cd + u.f5503bY;
            f9 += u.f5509ce + u.f5504bZ;
        }
        AbstractC0268al i = this.f4291W.mo2686i();
        int p = this.f4291W.mo3677p();
        boolean z14 = false;
        if (AbstractC0789l.m709am() && u.f5479by.mouseSupport && !u.f5593cr.m4466b((int) this.f4367u, (int) this.f4368v)) {
            z14 = true;
        }
        AbstractC0210af c = AbstractC0210af.m3593c(i);
        if ((c == null || !(c instanceof AbstractC0515r)) && C0368l.f2483b != null) {
            c = AbstractC0210af.m3593c(C0368l.f2483b);
        }
        if (this.f4293Y && !z14) {
            AbstractC0515r rVar = (AbstractC0515r) c;
            u.f5474bt.m3996b((this.f4295aa / u.f5602cE) + u.f5508cd, (this.f4296ab / u.f5602cE) + u.f5509ce);
            rVar.f5841dH = u.f5474bt.f741M;
            rVar.f5842dI = u.f5474bt.f742N;
            if (i.mo3487p()) {
                z4 = false;
                if (C0625h.m1700a((int) rVar.f5841dH, (int) rVar.f5842dI, 3) != null) {
                    rVar.f5841dH = a.f221a;
                    rVar.f5842dI = a.f222b;
                }
            }
            if (!rVar.mo2797bw()) {
                rVar.f1444bL = 0.0f;
            } else {
                rVar.f1444bL = -90.0f;
            }
            rVar.f5841dH += rVar.mo2722cH();
            rVar.f5842dI += rVar.mo2721cI();
            rVar.mo3633a(this.f4290U.f1441bB);
            rVar.mo2603a(p);
            rVar.f1531bT = true;
            String e = rVar.m2242e(false);
            if (C0569a.m2090a(u.f5464bb, rVar, this.f4292X)) {
                e = "{0}";
            }
            if (m1714p() == 1 && f3 != null && (f3 instanceof AbstractC0515r)) {
                AbstractC0515r rVar2 = (AbstractC0515r) f3;
                if (!rVar2.m2329aN()) {
                    float a2 = C0654f.m1573a(rVar2.f5841dH, rVar2.f5842dI, rVar.f5841dH, rVar.f5842dI);
                    float f10 = rVar2.mo2494f(rVar.mo1660r());
                    if (f10 > 800000.0f) {
                        z = true;
                    } else {
                        z = a2 <= f10 * f10;
                    }
                    if (!z) {
                        e = "{0}";
                    }
                }
            }
            if (z4) {
            }
            AbstractC0210af afVar = null;
            if (m1714p() == 1) {
                afVar = f3;
            }
            if (z2) {
                if (z4) {
                    if (AbstractC0789l.m710al() || (AbstractC0789l.m711ak() && u.m752V() == 2)) {
                        u.f5477bw.mo197a(f4 * u.f5602cE, f5 * u.f5602cE, (f8 - u.f5508cd) * u.f5602cE, (f9 - u.f5509ce) * u.f5602cE, this.f4406bn);
                    } else {
                        u.f5477bw.mo197a((rVar.f5841dH - u.f5508cd) * u.f5602cE, (rVar.f5842dI - u.f5509ce) * u.f5602cE, (f8 - u.f5508cd) * u.f5602cE, (f9 - u.f5509ce) * u.f5602cE, this.f4406bn);
                    }
                    e = null;
                    m1778a(rVar, f8, f9, rVar.f5841dH, rVar.f5842dI, true, (ArrayList) null, afVar);
                } else {
                    m1777a(rVar, rVar.f5841dH, rVar.f5842dI, true, z6, afVar);
                }
            }
            rVar.mo2603a(1);
            if (z11 && m1716o()) {
                this.f4382O = false;
                if (m1769a(u)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (m1720m()) {
                this.f4382O = false;
                z8 = true;
            }
            if (this.f4382O && !this.f4381N) {
                float f11 = this.f4305ak;
                float f12 = this.f4306al;
                if (C0654f.m1512c(f11 - f4) < 15.0f && C0654f.m1512c(f12 - f5) < 15.0f && this.f4294Z != 0.0f) {
                    this.f4382O = false;
                    u.f5475bu.m2172b(C0530e.f3569g, 0.5f);
                    if (this.f4297ac) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.f4294Z = 80.0f;
                this.f4305ak = f4;
                this.f4306al = f5;
            }
            if ((z7 || z9) && z2) {
                if (e != null) {
                    u.f5475bu.m2172b(C0530e.f3573k, 0.7f);
                    if (e != "{0}") {
                        String str = e;
                        if (str == "{2}") {
                            str = this.f4342bs;
                        }
                        if (str == "{3}") {
                            str = this.f4343bt;
                        }
                        if (str == "{1}") {
                            str = this.f4341br;
                        }
                        m1749b(str);
                    }
                } else {
                    float f13 = rVar.f5841dH;
                    float f14 = rVar.f5842dI;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        m1778a(rVar, f8, f9, rVar.f5841dH, rVar.f5842dI, false, arrayList, (AbstractC0210af) null);
                    } else {
                        arrayList.add(new PointF(f13, f14));
                    }
                    int i2 = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.f4291W.mo3369x()) {
                            C0651e v = m1705v();
                            m1773a(v);
                            v.m1620a(this.f4291W.m3690J(), pointF, (AbstractC0210af) null);
                        } else {
                            C0651e v2 = m1705v();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!v2.f4568e) {
                                        v2.f4569f = true;
                                    }
                                    this.f4297ac = true;
                                }
                            } else {
                                v2.f4568e = true;
                            }
                            AbstractC0515r r = m1710r();
                            if (this.f4291W instanceof C0185g) {
                                AbstractC0515r rVar3 = ((C0185g) this.f4291W).f1330b;
                                v2.m1616a(rVar3);
                                r = rVar3;
                            } else {
                                m1773a(v2);
                            }
                            v2.m1625a(pointF.f224a, pointF.f225b, i, p);
                            if (r != null) {
                                C0569a aVar = new C0569a();
                                aVar.f3763d = i;
                                aVar.f3765g = pointF.f224a;
                                aVar.f3766h = pointF.f225b;
                                aVar.f3772n = true;
                                aVar.f3773o = r;
                                aVar.f3764e = u.f5464bb;
                                aVar.f3786f = p;
                                aVar.f3768j = u.f5464bb;
                                aVar.f3774r = this.f4292X;
                                aVar.f3775s = 1.0f + (0.15f * i2);
                                if (r.m2296at() >= 29) {
                                    aVar.f3788q = true;
                                }
                            }
                            i2++;
                        }
                    }
                    this.f4386aN = 5.0f;
                    if (AbstractC0789l.m709am()) {
                        this.f4386aN = 1.0f;
                    }
                    this.f4304aj = false;
                    if (!z9) {
                        if (i2 > 0) {
                            boolean z16 = true;
                            if (rVar != null && !m1713p(rVar)) {
                                z16 = false;
                            }
                            this.f4291W = null;
                            this.f4293Y = false;
                            this.f4297ac = false;
                            this.f4290U = null;
                            if (z16) {
                                m1704w();
                            }
                            this.f4292X++;
                        }
                    } else if (!z10) {
                        float f15 = rVar.f5841dH;
                        float f16 = rVar.f5842dI;
                        boolean z17 = false;
                        if (C0654f.m1512c(f15 - this.f4298ad) < (rVar.mo2798bP().m4467b() * u.f5474bt.f727k * 2.0f) + (3 * u.f5474bt.f727k) && C0654f.m1512c(f16 - this.f4299ae) < (rVar.mo2798bP().m4463c() * u.f5474bt.f728l * 2.0f) + (3 * u.f5474bt.f728l)) {
                            this.f4300af = f15 - this.f4298ad;
                            this.f4301ag = f16 - this.f4299ae;
                            if (C0654f.m1512c(this.f4300af) > C0654f.m1512c(this.f4301ag)) {
                                this.f4301ag = 0.0f;
                            } else {
                                this.f4300af = 0.0f;
                            }
                        }
                        if (rVar.mo2798bP().m4463c() > rVar.mo2798bP().m4467b() + 1) {
                            this.f4301ag = 0.0f;
                        }
                        this.f4298ad = f15;
                        this.f4299ae = f16;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        if (this.f4301ag < 0.0f) {
                            f17 = -1.0f;
                        }
                        if (this.f4300af < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.f4301ag > 0.0f) {
                            f17 = 1.0f;
                        }
                        if (this.f4300af > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (f18 == 0.0f && f17 == 0.0f) {
                            f18 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f19 = f15 + (200.0f * f18);
                        float f20 = f16 + (200.0f * f17);
                        float f21 = (-rVar.mo2722cH()) + 1.0f;
                        float f22 = (-rVar.mo2721cI()) + 1.0f;
                        m1778a(rVar, f15 + f21, f16 + f22, f19 + f21, f20 + f22, false, arrayList2, (AbstractC0210af) null);
                        if (arrayList2.size() > 0) {
                            rVar.f5841dH = ((PointF) arrayList2.get(0)).f224a;
                            rVar.f5842dI = ((PointF) arrayList2.get(0)).f225b;
                            z17 = true;
                        }
                        if (!z17) {
                            m1778a(rVar, f15 + f21, f16 + f22, f15 + (200.0f * (-f18)) + f21, f16 + (200.0f * (-f17)) + f22, false, arrayList2, (AbstractC0210af) null);
                            if (arrayList2.size() > 0) {
                                rVar.f5841dH = ((PointF) arrayList2.get(0)).f224a;
                                rVar.f5842dI = ((PointF) arrayList2.get(0)).f225b;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            rVar.f5841dH += 3 * u.f5474bt.f727k;
                            rVar.f5842dI += u.f5474bt.f727k;
                        }
                        if (z17) {
                            float f23 = rVar.f5841dH - f15;
                            float f24 = rVar.f5842dI - f16;
                            float f25 = u.f5510cf;
                            float f26 = u.f5511cg;
                            u.f5503bY += f23;
                            u.f5504bZ += f24;
                            u.f5510cf += u.f5503bY;
                            u.f5511cg += u.f5504bZ;
                            float f27 = u.f5510cf;
                            float f28 = u.f5511cg;
                            u.m764J();
                            u.f5503bY += u.f5510cf - f27;
                            u.f5504bZ += u.f5511cg - f28;
                            float f29 = (f25 + f23) - u.f5510cf;
                            float f30 = (f26 + f24) - u.f5511cg;
                            if (C0654f.m1512c(f29) > 1.0f) {
                                this.f4295aa += f29 * u.f5602cE;
                            }
                            if (C0654f.m1512c(f30) > 1.0f) {
                                this.f4296ab += f30 * u.f5602cE;
                            }
                            u.f5510cf -= u.f5503bY;
                            u.f5511cg -= u.f5504bZ;
                        }
                    }
                }
            }
            if (z8) {
                m1724k();
                if (this.f4297ac) {
                    m1704w();
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m1722l() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!AbstractC0789l.m709am() || !u.f5479by.mouseSupport || m1720m() || m1716o()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1720m() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!AbstractC0789l.m709am() || !u.f5479by.mouseSupport || !this.f4382O || this.f4381N || this.f4334aS) {
            return false;
        }
        int i = 1;
        int i2 = 2;
        if (u.f5479by.mousePlacement == 2) {
            i = 2;
            i2 = 1;
        }
        if (u.m680e(i)) {
        }
        if (u.m680e(i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1718n() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!AbstractC0789l.m710al() || !u.f5479by.mouseSupport) {
            return false;
        }
        if (!this.f4382O && !this.f4371D) {
            return false;
        }
        int i = 1;
        int i2 = 2;
        if (u.f5479by.mousePlacement == 2) {
            i = 2;
            i2 = 1;
        }
        if (u.m680e(i)) {
            return true;
        }
        if (u.m680e(i2)) {
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1716o() {
        if (!this.f4382O || this.f4381N || this.f4334aS) {
            return false;
        }
        return m1718n();
    }

    /* renamed from: a */
    public void m1782a(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (afVar != null && this.f4286Q == afVar && this.f4287R < 40.0f && !m1750b(u)) {
            if (!m1769a(u)) {
                m1704w();
            }
            m1729h(afVar);
        } else if (afVar != null) {
            if (!m1769a(u) && !m1750b(u)) {
                m1704w();
            }
            m1781a(afVar, m1750b(u));
            this.f4286Q = afVar;
            this.f4287R = 0.0f;
        }
    }

    /* renamed from: a */
    public boolean m1780a(AbstractC0210af afVar, boolean z, float f, float f2, Point point) {
        AbstractC0789l.m651u();
        AbstractC0171m q = m1712q();
        boolean c = q.m3778c(afVar.f1441bB);
        if (!c || !m1701z() || !m1711q(afVar)) {
            if (q.m3768d(afVar.f1441bB) && ((afVar.f1450bY < afVar.f1451bZ || afVar.f1529bR < 1.0f) && m1714p() != 0)) {
                boolean z2 = true;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                if (afVar.mo2631cc() && m1717n(afVar)) {
                    z3 = true;
                }
                Iterator it = this.f4413bF.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC0854w wVar = (AbstractC0854w) it.next();
                    if (wVar instanceof AbstractC0515r) {
                        AbstractC0515r rVar = (AbstractC0515r) wVar;
                        if (!rVar.f1460ci) {
                            continue;
                        } else if (!m1719m(rVar)) {
                            z2 = false;
                            break;
                        } else if (!rVar.mo2499a(afVar)) {
                            z2 = false;
                            break;
                        } else {
                            if (rVar.m2328aO()) {
                                z5 = true;
                            }
                            C0270an ap = rVar.m2300ap();
                            if (ap != null && ap.m3464d() == EnumC0271ao.f1662d) {
                                z4 = true;
                            }
                        }
                    }
                }
                if (z2 && (!z4 || !z3)) {
                    if (z5) {
                        m1737d(afVar);
                        return true;
                    }
                    m1737d(afVar);
                    return true;
                }
            }
            if (afVar.mo2679g() > 0.0f && m1714p() != 0) {
                boolean z6 = true;
                Iterator it2 = AbstractC0854w.f5846dK.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC0854w wVar2 = (AbstractC0854w) it2.next();
                    if (wVar2 instanceof AbstractC0515r) {
                        AbstractC0515r rVar2 = (AbstractC0515r) wVar2;
                        if (rVar2.f1460ci) {
                            if (m1719m(rVar2)) {
                                if (!rVar2.mo3538x(afVar)) {
                                    z6 = false;
                                    break;
                                }
                            } else {
                                z6 = false;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (z6) {
                    m1751b(afVar);
                    return true;
                }
            }
            if (afVar.mo2631cc() && m1717n(afVar)) {
                m1733f(afVar);
                return true;
            } else if (!AbstractC0789l.m710al() || !m1817A() || !m1715o(afVar)) {
                boolean z7 = false;
                if ((!z || afVar.mo1659t()) && !q.m3778c(afVar.f1441bB)) {
                    if (afVar.mo2797bw()) {
                        if (afVar.mo2799bO().m4471a()) {
                            z7 = true;
                        }
                    } else if (!afVar.f1519by) {
                        z7 = true;
                    }
                    if (!z7 && !afVar.mo2423i() && m1816B()) {
                        z7 = true;
                    }
                }
                if (z7 || !c || !m1701z()) {
                    return false;
                }
                m1806a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ);
                return true;
            } else {
                m1731g(afVar);
                return true;
            }
        } else {
            m1743c(afVar);
            return true;
        }
    }

    /* renamed from: p */
    public int m1714p() {
        return this.f4333aQ;
    }

    /* renamed from: a */
    void m1773a(C0651e eVar) {
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) wVar;
                if (rVar.f1460ci && m1719m(rVar)) {
                    eVar.m1616a(rVar);
                }
            }
        }
    }

    /* renamed from: q */
    public AbstractC0171m m1712q() {
        AbstractC0789l u = AbstractC0789l.m651u();
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1441bB == u.f5464bb) {
                    return rVar.f1441bB;
                }
            }
        }
        Iterator it2 = this.f4413bF.iterator();
        while (it2.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar2;
                if (m1719m(rVar2)) {
                    return rVar2.f1441bB;
                }
            }
        }
        return u.f5464bb;
    }

    /* renamed from: r */
    public AbstractC0515r m1710r() {
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (m1719m(rVar)) {
                    return rVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    void m1772a(C0651e eVar, C0181c cVar, boolean z) {
        AbstractC0197s a;
        AbstractC0515r rVar = null;
        int i = -99;
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) wVar;
                if (rVar2.f1460ci && m1719m(rVar2) && (a = rVar2.mo3632a(cVar)) != null && a.mo2465a((AbstractC0210af) rVar2) && (a.mo2470a((AbstractC0210af) rVar2, true) || z)) {
                    int i2 = 0;
                    if (rVar2 instanceof AbstractC0416k) {
                        i2 = ((AbstractC0416k) rVar2).mo2741a(cVar, true);
                        if (rVar != null) {
                            if (z) {
                                if (i2 <= i) {
                                    break;
                                }
                            } else if (i2 >= i) {
                                break;
                            }
                        }
                    }
                    rVar = rVar2;
                    i = i2;
                }
            }
        }
        if (rVar != null) {
            eVar.m1616a(rVar);
        }
    }

    /* renamed from: a */
    boolean m1787a(AbstractC0197s sVar, float f, float f2) {
        AbstractC0197s a;
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            AbstractC0515r rVar = gVar.f1330b;
            AbstractC0197s t = gVar.m3706t();
            boolean z = false;
            if (t.mo2465a((AbstractC0210af) rVar) && t.mo2470a((AbstractC0210af) rVar, true) && !rVar.m2366a(t, f, f2)) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) wVar;
                if (rVar2.f1460ci && m1719m(rVar2) && (a = rVar2.mo3632a(sVar.m3690J())) != null && a.mo2465a((AbstractC0210af) rVar2) && a.mo2470a((AbstractC0210af) rVar2, true)) {
                    if (rVar2.m2366a(this.f4291W, f, f2)) {
                        return false;
                    }
                    z2 = true;
                }
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    void m1771a(C0651e eVar, AbstractC0197s sVar) {
        AbstractC0197s a;
        if (sVar instanceof C0185g) {
            eVar.m1616a(((C0185g) sVar).f1330b);
            return;
        }
        C0181c J = sVar.m3690J();
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) wVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null && a.mo2465a((AbstractC0210af) rVar)) {
                    eVar.m1616a(rVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m1785a(AbstractC0197s sVar, boolean z) {
        AbstractC0197s a;
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            return gVar.mo2470a((AbstractC0210af) gVar.f1330b, true);
        }
        C0181c J = sVar.m3690J();
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null && a.mo2470a(rVar, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1788a(AbstractC0197s sVar) {
        AbstractC0197s a;
        C0181c J = sVar.m3690J();
        if (sVar.mo3661l_()) {
            return false;
        }
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            return gVar.mo3387b(gVar.f1330b);
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null && a.mo3387b(rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1753b(AbstractC0197s sVar) {
        AbstractC0197s a;
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            return gVar.mo2465a((AbstractC0210af) gVar.f1330b);
        }
        C0181c J = sVar.m3690J();
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null && a.mo2465a((AbstractC0210af) rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1744c(AbstractC0197s sVar) {
        AbstractC0197s a;
        boolean z = false;
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            return gVar.mo3383h(gVar.f1330b);
        }
        C0181c J = sVar.m3690J();
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null) {
                    if (!a.mo3383h(rVar)) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public String m1738d(AbstractC0197s sVar) {
        AbstractC0197s a;
        String k;
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            return gVar.mo3380k(gVar.f1330b);
        }
        C0181c J = sVar.m3690J();
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && (a = rVar.mo3632a(J)) != null && a.mo3383h(rVar) && (k = a.mo3380k(rVar)) != null) {
                    return k;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public boolean m1708s() {
        if (this.f4333aQ == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (!rVar.f1460ci) {
                    continue;
                } else if (!m1719m(rVar)) {
                    return false;
                } else {
                    ArrayList M = rVar.mo2480M();
                    boolean z = false;
                    if (M != null) {
                        Iterator it2 = M.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0197s) it2.next()).mo2461e() == EnumC0199u.f1372d) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1776a(EnumC0524z zVar) {
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (m1719m(rVar) && m1775a(zVar, rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1775a(EnumC0524z zVar, AbstractC0210af afVar) {
        if (!(afVar instanceof AbstractC0515r)) {
            return false;
        }
        AbstractC0515r rVar = (AbstractC0515r) afVar;
        if ((zVar == EnumC0524z.f3529a || zVar == EnumC0524z.f3530b) && !AbstractC0789l.m741a(this.f4411bB, 1000L)) {
            return true;
        }
        if (zVar == EnumC0524z.f3531c) {
            if (AbstractC0789l.m651u().f5585bg < 10) {
                return false;
            }
            if (!AbstractC0789l.m741a(this.f4412bC, 1000L)) {
                return true;
            }
        }
        if (!rVar.m2349a(zVar)) {
            return false;
        }
        if (zVar == EnumC0524z.f3529a || zVar == EnumC0524z.f3530b) {
            this.f4411bB = AbstractC0789l.m760N();
        }
        if (zVar != EnumC0524z.f3531c) {
            return true;
        }
        this.f4412bC = AbstractC0789l.m760N();
        return true;
    }

    /* renamed from: b */
    public void m1755b(float f, float f2, Point point) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (m1817A()) {
            C0651e v = m1705v();
            v.f4571h = true;
            v.m1626a(f, f2);
            m1773a(v);
            if (!m1776a(EnumC0524z.f3530b)) {
                u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
            }
            C0573e a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
            if (a != null) {
                a.f3875ao = 8;
                a.f3859W = 30.0f;
                a.f3860X = a.f3859W;
                a.f3834s = true;
                a.f3842F = 2.0f;
                a.f3844H = 2.8f * m1747c();
                a.f3843G = 1.6f * m1747c();
                a.f3845I = true;
            }
            if (point != null) {
                Point b = u.f5485bE.m1678b(point.f221a, point.f222b);
                C0573e a2 = u.f5480bz.m2068a(b.f221a, b.f222b, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
                if (a2 != null) {
                    a2.f3831o = true;
                    a2.f3875ao = 8;
                    a2.f3859W = 35.0f;
                    a2.f3860X = a.f3859W;
                    a2.f3834s = true;
                    a2.f3842F = 2.0f;
                    a2.f3844H = 1.3f;
                    a2.f3843G = 0.6f;
                }
            }
        } else if (u.f5479by.quickRally && m1708s()) {
            m1757b(f, f2);
        }
    }

    /* renamed from: c */
    public void m1745c(float f, float f2, Point point) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!this.f4282y || !u.f5479by.doubleClickToAttackMove || !m1701z() || !m1817A()) {
            m1755b(f, f2, point);
        } else {
            m1739d(f, f2, point);
        }
    }

    /* renamed from: d */
    public void m1739d(float f, float f2, Point point) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        v.f4571h = true;
        v.m1611b(f, f2);
        m1773a(v);
        if (!m1776a(EnumC0524z.f3530b)) {
            u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
        }
        C0573e a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3876ap = 17;
            a.f3875ao = 2;
            a.f3859W = 30.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3862Z = 1.0f;
            a.f3844H = 1.9f * m1747c();
            a.f3843G = 3.5f * m1747c();
            a.f3845I = true;
        }
        if (point != null) {
            Point b = u.f5485bE.m1678b(point.f221a, point.f222b);
            C0573e a2 = u.f5480bz.m2068a(b.f221a, b.f222b, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
            if (a2 != null) {
                a2.f3831o = true;
                a2.f3875ao = 9;
                a2.f3859W = 35.0f;
                a2.f3860X = a.f3859W;
                a2.f3834s = true;
                a2.f3842F = 2.0f;
                a2.f3844H = 1.3f;
                a2.f3843G = 0.6f;
            }
        }
    }

    /* renamed from: t */
    public void m1707t() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        v.m1599h();
        m1773a(v);
        u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
    }

    /* renamed from: a */
    public void m1786a(AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, C0651e eVar) {
        if (sVar instanceof C0304f) {
            C0304f fVar = (C0304f) sVar;
            AbstractC0789l.m651u();
        }
    }

    /* renamed from: b */
    public void m1752b(AbstractC0197s sVar, float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        PointF pointF = new PointF(f, f2);
        C0651e v = m1705v();
        if (!sVar.mo3394F()) {
            m1771a(v, sVar);
        } else {
            m1772a(v, sVar.m3690J(), false);
        }
        v.m1620a(sVar.m3690J(), pointF, (AbstractC0210af) null);
        m1786a(sVar, pointF, (AbstractC0210af) null, v);
        u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
        C0573e a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 9;
            a.f3859W = 60.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3844H = 3.8f * m1747c();
            a.f3843G = 2.0f * m1747c();
            a.f3845I = true;
            a.f3862Z = 1.5f;
        }
    }

    /* renamed from: b */
    public void m1751b(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1605d(afVar);
        u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 12;
            a.f3859W = 25.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3845I = true;
            a.f3844H = 1.2f * m1747c();
            a.f3843G = 1.8f * m1747c();
        }
    }

    /* renamed from: b */
    public void m1757b(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e u2 = m1706u();
        m1773a(u2);
        u2.m1623a(new PointF(f, f2));
        u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
        C0573e a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 8;
            a.f3859W = 65.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3845I = true;
            a.f3862Z = 2.0f;
            a.f3844H = 2.0f * m1747c();
            a.f3843G = 1.5f * m1747c();
        }
    }

    /* renamed from: a */
    public void m1802a(float f, float f2, Point point, C0188j jVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5479by.showMapPingsOnBattlefield || u.f5479by.showMapPingsOnMinimap) {
            m1705v().m1620a(jVar.m3690J(), new PointF(f, f2), (AbstractC0210af) null);
            if (this.f4346bD == 0 || this.f4346bD + 15000 < System.currentTimeMillis()) {
                this.f4346bD = System.currentTimeMillis();
                u.f5486bF.m1245j("MAP PING - [i:" + jVar.m3703H() + "]");
                return;
            }
            return;
        }
        m1766a("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
    }

    /* renamed from: a */
    public void m1800a(float f, float f2, AbstractC0171m mVar, C0188j jVar) {
        C0573e a;
        AbstractC0789l u = AbstractC0789l.m651u();
        int ordinal = 7 + jVar.f1337a.ordinal();
        if (u.f5479by.showMapPingsOnBattlefield || u.f5479by.showMapPingsOnMinimap) {
            if (u.f5479by.showMapPingsOnBattlefield) {
                C0573e a2 = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
                if (a2 != null) {
                    a2.f3876ap = 9;
                    a2.f3875ao = 6;
                    a2.f3842F = 0.7f;
                    a2.f3859W = 490.0f;
                    a2.f3860X = a2.f3859W;
                    a2.f3834s = true;
                    a2.f3856T = 6.0f;
                    a2.f3857U = 60.0f;
                    a2.f3847K -= a2.f3856T;
                    a2.f3844H = 2.0f * 1.0f;
                    a2.f3843G = a2.f3844H;
                    a2.f3898an = -0.5f;
                    a2.f3845I = true;
                    if (mVar != null) {
                        a2.f3839y = mVar.m3829F();
                        if (AbstractC0789l.m712aj()) {
                            a2.f3896C = new LightingColorFilter(a2.f3839y, 0);
                        }
                    }
                }
                if (!(ordinal == -1 || (a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e)) == null)) {
                    a.f3876ap = 9;
                    a.f3875ao = ordinal;
                    a.f3859W = 490.0f;
                    a.f3860X = a.f3859W;
                    a.f3834s = true;
                    a.f3842F = 1.2f;
                    a.f3856T = 6.0f;
                    a.f3857U = 60.0f;
                    a.f3847K -= a.f3856T;
                    a.f3844H = 2.0f * 1.0f;
                    a.f3843G = a.f3844H;
                    a.f3898an = -0.7f;
                    a.f3845I = true;
                }
            }
            if (u.f5479by.showMapPingsOnMinimap) {
                Point b = u.f5485bE.m1678b(f, f2);
                C0573e a3 = u.f5480bz.m2068a(b.f221a, b.f222b, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
                if (a3 != null) {
                    a3.f3831o = true;
                    a3.f3876ap = 9;
                    a3.f3875ao = 6;
                    a3.f3842F = 0.8f;
                    a3.f3859W = 470.0f;
                    a3.f3860X = a3.f3859W;
                    a3.f3834s = true;
                    a3.f3847K -= 2.0f;
                    a3.f3856T = 2.0f;
                    a3.f3857U = 60.0f;
                    a3.f3898an = -0.5f;
                    if (mVar != null) {
                        a3.f3839y = mVar.m3829F();
                        if (AbstractC0789l.m712aj()) {
                            a3.f3896C = new LightingColorFilter(a3.f3839y, 0);
                        }
                    }
                    a3.f3844H = 1.0f;
                    a3.f3843G = 1.0f;
                }
                C0573e a4 = u.f5480bz.m2068a(b.f221a, b.f222b, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
                if (a4 != null) {
                    a4.f3831o = true;
                    a4.f3876ap = 9;
                    a4.f3875ao = ordinal;
                    a4.f3859W = 470.0f;
                    a4.f3860X = a4.f3859W;
                    a4.f3834s = true;
                    a4.f3842F = 0.8f;
                    a4.f3847K -= 2.0f;
                    a4.f3856T = 2.0f;
                    a4.f3857U = 60.0f;
                    if (mVar != null) {
                    }
                    a4.f3844H = 1.0f;
                    a4.f3843G = 1.0f;
                    a4.f3898an = -0.7f;
                }
            }
        } else if (!this.f4347bE && !u.f5490bJ.m1995h()) {
            this.f4347bE = true;
            this.f4278e.m1697a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
        }
    }

    /* renamed from: u */
    public C0651e m1706u() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e b = u.f5494bN.m1954b(u.f5464bb);
        if (u.f5486bF.f4734z) {
            b.f4561p = u.f5464bb;
        }
        return b;
    }

    /* renamed from: v */
    public C0651e m1705v() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e u2 = m1706u();
        if (m1769a(u)) {
            u2.f4568e = true;
        }
        return u2;
    }

    /* renamed from: c */
    public void m1743c(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        v.m1618a(afVar);
        m1773a(v);
        if (!m1776a(EnumC0524z.f3529a)) {
            u.f5475bu.m2172b(C0530e.f3566d, 0.2f);
        }
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3827b = afVar;
            a.f3846J = 0.0f;
            a.f3847K = 0.0f;
            a.f3848L = 0.0f;
            a.f3875ao = 9;
            a.f3859W = 35.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 1.5f;
            a.f3845I = true;
            a.f3862Z = 0.8f;
            a.f3844H = 1.9f * m1747c();
            a.f3843G = 3.3f * m1747c();
        }
        C0573e a2 = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a2 != null) {
            a2.f3827b = afVar;
            a2.f3846J = 0.0f;
            a2.f3847K = 0.0f;
            a2.f3848L = 0.0f;
            a2.f3876ap = 17;
            a2.f3875ao = 0;
            a2.f3859W = 25.0f;
            a2.f3860X = a2.f3859W;
            a2.f3834s = true;
            a2.f3842F = 1.0f;
            a2.f3845I = true;
            a2.f3862Z = 0.8f;
            a2.f3844H = 2.2f * m1747c();
            a2.f3843G = 1.1f * m1747c();
        }
    }

    /* renamed from: d */
    public void m1737d(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1610b(afVar);
        u.f5475bu.m2172b(C0530e.f3566d, 0.2f);
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 10;
            a.f3859W = 35.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3845I = true;
            a.f3844H = 1.5f * m1747c();
            a.f3843G = 2.2f * m1747c();
        }
    }

    /* renamed from: e */
    public void m1735e(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1607c(afVar);
        u.f5475bu.m2172b(C0530e.f3566d, 0.2f);
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3876ap = 17;
            a.f3875ao = 1;
            a.f3859W = 40.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 1.0f;
            a.f3845I = true;
            a.f3862Z = 0.0f;
            a.f3844H = 1.2f * m1747c();
            a.f3843G = 1.9f * m1747c();
        }
    }

    /* renamed from: a */
    public void m1806a(float f, float f2, float f3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5475bu.m2172b(C0530e.f3573k, 0.2f);
        C0573e a = u.f5480bz.m2068a(f, f2, f3, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3876ap = 9;
            a.f3875ao = 14;
            a.f3859W = 10.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3862Z = 0.0f;
            a.f3844H = 1.1f * m1747c();
            a.f3843G = 1.6f * m1747c();
            a.f3845I = true;
        }
    }

    /* renamed from: a */
    public void m1801a(float f, float f2, Point point, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1608c(f, f2);
        if (!z) {
            v.f4568e = true;
        }
        u.f5475bu.m2172b(C0530e.f3567e, 0.2f);
        C0573e a = u.f5480bz.m2068a(f, f2, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3876ap = 17;
            a.f3875ao = 0;
            a.f3859W = 40.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3862Z = 8.0f;
            a.f3844H = 1.1f * m1747c();
            a.f3843G = 1.9f * m1747c();
            a.f3845I = true;
        }
        if (point != null) {
            Point b = u.f5485bE.m1678b(point.f221a, point.f222b);
            C0573e a2 = u.f5480bz.m2068a(b.f221a, b.f222b, 0.0f, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
            if (a2 != null) {
                a2.f3831o = true;
                a2.f3875ao = 9;
                a2.f3859W = 35.0f;
                a2.f3860X = a.f3859W;
                a2.f3834s = true;
                a2.f3842F = 2.0f;
                a2.f3844H = 1.3f;
                a2.f3843G = 0.6f;
            }
        }
    }

    /* renamed from: f */
    public void m1733f(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1603e(afVar);
        u.f5475bu.m2172b(C0530e.f3566d, 0.2f);
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 11;
            a.f3859W = 25.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3845I = true;
            a.f3844H = 1.8f * m1747c();
            a.f3843G = 1.6f * m1747c();
        }
    }

    /* renamed from: g */
    public void m1731g(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e v = m1705v();
        m1773a(v);
        v.m1601f(afVar);
        u.f5475bu.m2172b(C0530e.f3566d, 0.2f);
        C0573e a = u.f5480bz.m2068a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, EnumC0572d.f3816a, true, EnumC0576h.f3943e);
        if (a != null) {
            a.f3875ao = 11;
            a.f3859W = 25.0f;
            a.f3860X = a.f3859W;
            a.f3834s = true;
            a.f3842F = 2.0f;
            a.f3845I = true;
            a.f3844H = 1.8f * m1747c();
            a.f3843G = 1.6f * m1747c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0210af m1799a(float f, float f2, boolean z) {
        float a;
        float f3;
        boolean c;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af afVar = null;
        float f4 = -1.0f;
        float f5 = 10.0f / u.f5602cE;
        float f6 = 5.0f / u.f5602cE;
        float f7 = 5.0f / u.f5602cE;
        AbstractC0171m q = m1712q();
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (z) {
                if (!afVar2.mo1659t()) {
                    if (!afVar2.f1520bz && afVar2.f1539cp == null) {
                        a = C0654f.m1573a(f, f2, afVar2.f5841dH, afVar2.f5842dI - afVar2.f5843dJ);
                        float cX = afVar2.mo3573cX();
                        if (afVar2.f1460ci) {
                            f3 = cX + f5;
                        } else {
                            f3 = cX + f6;
                        }
                        c = q.m3778c(afVar2.f1441bB);
                        if (c) {
                            f3 += f7;
                        }
                        if (a < f3 * f3 && (!c || afVar2.mo3610bS())) {
                            if (afVar != null || a < f4) {
                                afVar = afVar2;
                                f4 = a;
                            }
                        }
                    }
                }
            } else if (!afVar2.mo3587cD()) {
                if (!afVar2.f1520bz) {
                    a = C0654f.m1573a(f, f2, afVar2.f5841dH, afVar2.f5842dI - afVar2.f5843dJ);
                    float cX2 = afVar2.mo3573cX();
                    if (afVar2.f1460ci) {
                    }
                    c = q.m3778c(afVar2.f1441bB);
                    if (c) {
                    }
                    if (a < f3 * f3) {
                        if (afVar != null) {
                        }
                        afVar = afVar2;
                        f4 = a;
                    }
                }
            }
        }
        if (afVar == null || afVar.f1441bB == u.f5464bb || afVar.m3611bR()) {
            return afVar;
        }
        return null;
    }

    /* renamed from: b */
    public void m1756b(float f, float f2, float f3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0210af) {
                AbstractC0210af afVar = (AbstractC0210af) wVar;
                if (!afVar.f1520bz && afVar.f1539cp == null && afVar.f1441bB == u.f5464bb && C0654f.m1573a(f, f2, afVar.f5841dH, afVar.f5842dI - afVar.f5843dJ) < f3 * f3) {
                    m1725j(afVar);
                }
            }
        }
    }

    /* renamed from: h */
    public void m1729h(AbstractC0210af afVar) {
        this.f4286Q = null;
        AbstractC0789l u = AbstractC0789l.m651u();
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0210af) {
                AbstractC0210af afVar2 = (AbstractC0210af) wVar;
                if (!afVar2.f1520bz && afVar2.f1539cp == null && afVar2.f1441bB == afVar.f1441bB && afVar2.mo2678j() && C0599a.m1910a(afVar2, afVar) && (afVar2.f1441bB == u.f5464bb || afVar2.m3611bR())) {
                    m1725j(afVar2);
                }
            }
        }
    }

    /* renamed from: w */
    public void m1704w() {
        this.f4286Q = null;
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0210af) {
                ((AbstractC0210af) wVar).f1460ci = false;
            }
        }
        this.f4333aQ = 0;
        this.f4288S++;
        this.f4413bF.clear();
    }

    /* renamed from: i */
    public boolean m1727i(AbstractC0210af afVar) {
        if (afVar.mo1659t()) {
            return false;
        }
        AbstractC0171m mVar = AbstractC0789l.m651u().f5464bb;
        if (mVar == null || !mVar.m3778c(afVar.f1441bB) || afVar.mo3610bS()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m1725j(AbstractC0210af afVar) {
        if (afVar.f1460ci) {
            return true;
        }
        if (!m1727i(afVar)) {
            return false;
        }
        m1723k(afVar);
        m1775a(EnumC0524z.f3531c, afVar);
        return true;
    }

    /* renamed from: k */
    public void m1723k(AbstractC0210af afVar) {
        if (!afVar.f1460ci && m1727i(afVar)) {
            afVar.f1460ci = true;
            afVar.f1536cj = AbstractC0789l.m651u().f5469bj;
            this.f4333aQ++;
            if (!(afVar instanceof C0465h)) {
                f4348bG = afVar;
            }
            this.f4288S++;
            this.f4413bF.m452a(afVar);
        }
    }

    /* renamed from: x */
    public static C0657b m1703x() {
        AbstractC0268al r;
        AbstractC0210af afVar = f4348bG;
        if (afVar == null || (r = afVar.mo1660r()) == null || !(r instanceof C0368l)) {
            return null;
        }
        return ((C0368l) r).f2495B;
    }

    /* renamed from: a */
    public void m1781a(AbstractC0210af afVar, boolean z) {
        if (!z) {
            m1725j(afVar);
        } else if (afVar.f1460ci) {
            m1721l(afVar);
        } else {
            m1725j(afVar);
        }
    }

    /* renamed from: l */
    public void m1721l(AbstractC0210af afVar) {
        if (afVar.f1460ci) {
            afVar.f1460ci = false;
            this.f4333aQ--;
            this.f4413bF.remove(afVar);
            this.f4288S++;
        }
    }

    /* renamed from: y */
    public boolean m1702y() {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: z */
    public boolean m1701z() {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && m1719m(rVar) && rVar.mo2421l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m1817A() {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && rVar.m2328aO() && m1719m(rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1816B() {
        if (m1714p() == 0) {
            return true;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1460ci && !rVar.mo2423i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1719m(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (afVar.mo3586cE()) {
            return false;
        }
        if (afVar.f1441bB == u.f5464bb) {
            return true;
        }
        if ((afVar.f1441bB == null || !afVar.f1441bB.m3793b(u.f5464bb)) && !u.f5465be && !u.f5490bJ.m1995h()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean m1717n(AbstractC0210af afVar) {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (rVar.f1460ci && rVar != afVar && m1719m(rVar) && afVar.mo2630d(rVar, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1715o(AbstractC0210af afVar) {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (rVar.f1460ci && rVar != afVar && m1719m(rVar) && rVar.mo2630d(afVar, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean m1713p(AbstractC0210af afVar) {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (rVar.f1460ci && rVar != afVar && m1719m(rVar) && rVar.mo2499a(afVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m1711q(AbstractC0210af afVar) {
        if (m1714p() == 0) {
            return false;
        }
        Iterator it = this.f4413bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (rVar.f1460ci && rVar != afVar && m1719m(rVar) && C0214aj.m3528a(rVar, afVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public void m1815C() {
    }

    /* renamed from: D */
    public boolean m1814D() {
        return false;
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        this.f4277d.mo1654a(apVar);
        apVar.m1175c(1);
        apVar.mo1109a(this.f4292X);
    }

    /* renamed from: a */
    public void m1770a(C0707k kVar, boolean z) {
        this.f4277d.m1905a(kVar, z);
        if (kVar.m1079d() >= 1) {
            this.f4292X = kVar.m1076f();
        }
    }

    /* renamed from: a */
    public void m1778a(AbstractC0515r rVar, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        float f5 = rVar.f5841dH;
        float f6 = rVar.f5842dI;
        AbstractC0515r rVar2 = null;
        AbstractC0210af d = AbstractC0210af.m3552d(rVar.mo1660r());
        if (!(d instanceof AbstractC0515r)) {
            AbstractC0789l.m683d("buildingBlockoutUnit not OrderableUnit is: " + d.getClass().getName());
        } else {
            rVar2 = (AbstractC0515r) d;
        }
        boolean z2 = false;
        u.f5474bt.m3996b(f, f2);
        float f7 = u.f5474bt.f741M;
        float f8 = u.f5474bt.f742N;
        float cH = f7 + rVar.mo2722cH();
        float cI = f8 + rVar.mo2721cI();
        float cH2 = f3 + rVar.mo2722cH();
        float cI2 = f4 + rVar.mo2721cI();
        float b = C0654f.m1527b(cH, cI, cH2, cI2);
        float d2 = C0654f.m1499d(cH, cI, cH2, cI2);
        int i = 0;
        for (float f9 = 0.0f; f9 <= b; f9 += u.f5474bt.f729m) {
            u.f5474bt.m3996b((cH + (C0654f.m1474i(d2) * f9)) - rVar.mo2722cH(), (cI + (C0654f.m1478h(d2) * f9)) - rVar.mo2721cI());
            float f10 = u.f5474bt.f741M;
            float f11 = u.f5474bt.f742N;
            float cH3 = f10 + rVar.mo2722cH();
            float cI3 = f11 + rVar.mo2721cI();
            rVar.f5841dH = cH3;
            rVar.f5842dI = cI3;
            if ((!z2 || rVar2 == null || (!C0569a.m2089a(rVar, rVar2) && !rVar.m2207o(rVar2))) && 0 == 0) {
                boolean a = m1777a(rVar, cH3, cI3, z, false, afVar);
                if (arrayList != null && a) {
                    arrayList.add(new PointF(cH3, cI3));
                }
                if (a) {
                    i++;
                    if (i >= 29) {
                        return;
                    }
                }
                z2 = true;
                if (rVar2 != null) {
                    rVar2.f5841dH = cH3;
                    rVar2.f5842dI = cI3;
                }
            }
        }
        rVar.f5841dH = f5;
        rVar.f5842dI = f6;
    }

    /* renamed from: a */
    public boolean m1777a(AbstractC0515r rVar, float f, float f2, boolean z, boolean z2, AbstractC0210af afVar) {
        boolean z3;
        AbstractC0789l u = AbstractC0789l.m651u();
        float f3 = rVar.f5841dH;
        float f4 = rVar.f5842dI;
        rVar.f5841dH = f;
        rVar.f5842dI = f2;
        boolean bn = rVar.mo2784bn();
        if (C0569a.m2090a(u.f5464bb, rVar, this.f4292X)) {
            bn = false;
        }
        if (!(afVar == null || afVar == null || !(afVar instanceof AbstractC0515r))) {
            AbstractC0515r rVar2 = (AbstractC0515r) afVar;
            if (!rVar2.m2329aN()) {
                float a = C0654f.m1573a(rVar2.f5841dH, rVar2.f5842dI, rVar.f5841dH, rVar.f5842dI);
                float f5 = rVar2.mo2494f(rVar.mo1660r());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = a <= f5 * f5;
                }
                if (!z3) {
                    bn = false;
                }
            }
        }
        boolean z4 = rVar.f1531bT;
        rVar.f1531bT = true;
        rVar.f1534bW = bn;
        rVar.f1535bX = !bn;
        rVar.f1533bV = z2;
        if (z) {
            u.f5477bw.mo125j();
            u.m763K();
            rVar.mo2024d(0.0f);
            rVar.mo2025c(0.0f);
            rVar.mo2033a(0.0f, false);
            float m = rVar.mo2420m();
            if (m > 30.0f) {
                C0851y.m423a((AbstractC0210af) rVar, m, true, true);
            }
            rVar.mo2809bN();
            if (!z2) {
                rVar.m2396M(-1);
            }
            u.f5477bw.mo124k();
        }
        rVar.f5841dH = f3;
        rVar.f5842dI = f4;
        rVar.f1533bV = false;
        rVar.f1531bT = z4;
        return bn;
    }

    /* renamed from: E */
    public void m1813E() {
        AbstractC0789l.m651u().f5613cX = true;
        this.f4277d.m1876p();
    }

    /* renamed from: F */
    public void m1812F() {
        AbstractC0789l.m651u().f5616da = true;
        this.f4277d.m1875q();
    }

    /* renamed from: G */
    public void m1811G() {
        m1724k();
        this.f4290U = null;
        this.f4291W = this.f4358k;
    }

    /* renamed from: a */
    public void m1763a(ArrayList arrayList, Rect rect, Paint paint, Paint paint2) {
        Iterator it;
        String str = "";
        while (arrayList.iterator().hasNext()) {
            str = str + ((String) it.next()) + "\n";
        }
        m1764a(str, rect, paint, paint2);
    }

    /* renamed from: a */
    public void m1764a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] b;
        Paint paint3;
        AbstractC0789l u = AbstractC0789l.m651u();
        int i = 0;
        for (String str2 : C0654f.m1517b(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            int a = C0621d.m1821a(paint3);
            u.f5477bw.mo158a(str2, rect.m4462d(), rect.f228b + (a / 2) + (i * a), paint3);
            i++;
        }
    }

    /* renamed from: a */
    public boolean m1784a(AbstractC0197s sVar, boolean z, AbstractC0210af afVar, boolean z2) {
        return m1783a(sVar, z, afVar, z2, false, -1.0f);
    }

    /* renamed from: a */
    public boolean m1783a(AbstractC0197s sVar, boolean z, AbstractC0210af afVar, boolean z2, boolean z3, float f) {
        int i;
        Paint paint;
        Paint paint2;
        int i2;
        int i3;
        int i4;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        int indexOf;
        String d;
        AbstractC0789l u = AbstractC0789l.m651u();
        String c = sVar.mo2709c(afVar);
        String str = null;
        boolean z4 = false;
        boolean z5 = true;
        if (AbstractC0789l.m709am()) {
            z5 = false;
        }
        if (afVar != null && sVar.mo3378m(afVar)) {
            z5 = false;
        }
        if (c != null) {
            boolean z6 = false;
            if (C0599a.m1914a(sVar)) {
                z6 = true;
                c = this.f4339bp;
            }
            if (m1744c(sVar)) {
                z6 = true;
                str = this.f4340bq;
                String d2 = m1738d(sVar);
                if (d2 != null) {
                    str = d2;
                }
            }
            if (!z6 && z2 && (d = m1738d(sVar)) != null) {
                str = d;
            }
            if (str == null) {
                float b = this.f4277d.m1901b(sVar);
                if (b > 0.0f) {
                    str = C0654f.m1482g(b / 1000.0f);
                }
            }
            this.f4399bg.f227a = 20;
            int i5 = (int) ((u.f5498bS - u.f5502bX) - 20);
            this.f4399bg.f229c = i5;
            boolean z7 = u.f5479by.showActionInfoHoverNearMouse;
            if (z) {
                i = (int) (u.f5501bW - 40.0f);
            } else {
                i = 40;
            }
            if (AbstractC0789l.m711ak() && f > 0.0f) {
                i = (int) f;
                z4 = true;
            }
            if (AbstractC0789l.m710al() && z7 && z3) {
                i = (int) (u.m750X() - 40.0f);
            }
            this.f4399bg.f228b = i;
            this.f4399bg.f230d = this.f4399bg.f228b;
            boolean z8 = true;
            boolean z9 = true;
            int i6 = 7;
            if (AbstractC0789l.m710al()) {
                if (!z7) {
                    z8 = false;
                    z9 = false;
                } else if (!z3) {
                    z9 = false;
                    z8 = true;
                    i6 = 20;
                }
            } else if (!z) {
                z9 = false;
            }
            if (!AbstractC0789l.m710al() || z || !z7 || !z3) {
            }
            if (str != null) {
                if (c.indexOf("\n") == -1) {
                    c = c + "\n" + str;
                } else {
                    c = c.substring(0, indexOf) + "\nLocked: " + str + "\n" + c.substring(indexOf);
                }
            }
            ArrayList a = C0621d.m1820a(c, this.f4399bg, this.f4330aK, this.f4329aJ, z8);
            if (z8) {
                this.f4399bg.f227a = (int) (rect3.f227a - (i6 * u.f5496bQ));
                this.f4399bg.f229c = (int) (rect4.f229c + (i6 * u.f5496bQ));
            }
            if (z9) {
                this.f4399bg.m4470a((int) ((i5 - (7.0f * u.f5496bQ)) - this.f4399bg.f229c), 0);
            }
            this.f4400bh.m4468a(this.f4399bg);
            this.f4400bh.f228b -= 20;
            this.f4400bh.f230d += 15;
            int i7 = -1;
            if (afVar != null) {
                i7 = sVar.mo2621b(afVar, true);
            }
            if (!(afVar == null || !z5 || i7 == -1)) {
                this.f4400bh.f230d = (int) (rect2.f230d + (55.0f * u.f5496bQ));
            }
            if (this.f4400bh.f230d > u.f5499bT) {
                int i8 = (int) (u.f5499bT - this.f4400bh.f230d);
                this.f4399bg.m4470a(0, i8);
                this.f4400bh.m4470a(0, i8);
            }
            AbstractC0268al i9 = sVar.mo2686i();
            if (!sVar.mo3692A()) {
                i9 = null;
            }
            if (!(i9 == null || afVar == null)) {
                this.f4400bh.f228b = (int) (rect.f228b - (40.0f * u.f5496bQ));
            }
            if (z4) {
                int i10 = -this.f4399bg.m4463c();
                this.f4399bg.m4470a(0, i10);
                this.f4400bh.m4470a(0, i10);
            }
            if (0 != 0) {
                int i11 = (int) ((u.f5499bT - 30.0f) - this.f4400bh.f230d);
                this.f4400bh.m4470a(0, i11);
                this.f4399bg.m4470a(0, i11);
            }
            if (this.f4400bh.f228b < 0) {
                int i12 = 0 - this.f4400bh.f228b;
                this.f4400bh.m4470a(0, i12);
                this.f4399bg.m4470a(0, i12);
            }
            if (this.f4400bh.f230d > u.f5499bT - 20.0f) {
                int i13 = (int) ((u.f5499bT - 20.0f) - this.f4400bh.f230d);
                this.f4400bh.m4470a(0, i13);
                this.f4399bg.m4470a(0, i13);
            }
            u.f5477bw.mo142b(this.f4400bh, this.f4328aI);
            u.f5477bw.mo142b(this.f4400bh, this.f4324aE);
            if (z6) {
            }
            if (!(i9 == null || afVar == null)) {
                EnumC0215ak.m3524a(i9, this.f4400bh.m4462d(), this.f4400bh.f228b + (22.0f * u.f5496bQ), this.f4289T, 0.0f, afVar.f1441bB, 30.0f * u.f5496bQ, 100.0f * u.f5496bQ, false, false, sVar.mo3677p());
            }
            C0760q qVar = this.f4330aK;
            if (z2) {
                qVar = this.f4331aL;
            }
            m1763a(a, this.f4399bg, qVar, this.f4329aJ);
            if (!(afVar == null || i7 == -1 || !z5)) {
                float f2 = u.f5496bQ * 0.5f;
                int i14 = (int) (60.0f * f2);
                float b2 = C0620c.m1822b(afVar, sVar, true);
                if (!z6 || i7 > 0) {
                    this.f4323aD.m4502b(-16777216);
                    if (b2 != 0.0f) {
                        float b3 = C0654f.m1528b((C0654f.m1512c(b2) * 0.5f) - 0.4f, 0.0f, 1.0f);
                        if (b2 > 0.0f) {
                            i4 = Color.m4546a(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                        } else {
                            i4 = Color.m4546a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                        }
                        C0654f.m1566a(i4, this.f4323aD.m4490e(), b3);
                    }
                    float b4 = (this.f4400bh.f230d - ((65.0f * f2) / 2.0f)) + (C0621d.m1819b(this.f4323aD) / 2);
                    if (b2 > 0.5d) {
                        b4 += 1.0f;
                    }
                    if (b2 < -0.5d) {
                        b4 -= 1.0f;
                    }
                    u.f5477bw.mo158a("" + i7, this.f4400bh.m4462d(), b4, this.f4323aD);
                }
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = !z6 && m1785a(sVar, true);
                boolean z13 = i7 > 0 && sVar.mo3386d(afVar, true);
                int d3 = (int) (this.f4400bh.m4462d() + (60.0f * f2));
                int i15 = (int) (this.f4400bh.f230d - (65.0f * f2));
                this.f4402bj.m4469a(d3, i15, d3 + i14, i15 + i14);
                if (z12) {
                    paint = this.f4337aY;
                } else {
                    paint = this.f4338aZ;
                }
                if (b2 > 0.0f) {
                    float b5 = C0654f.m1528b((C0654f.m1512c(b2) * 0.7f) - 0.3f, 0.0f, 1.0f);
                    if (b2 > 0.0f) {
                        i3 = Color.m4546a(110, 210, 210, 210);
                    } else {
                        i3 = Color.m4546a(110, 210, 110, 110);
                    }
                    int a2 = C0654f.m1566a(i3, paint.m4490e(), b5);
                    paint = this.f4404bl;
                    paint.m4502b(a2);
                }
                if (b2 > 0.5d) {
                    this.f4402bj.m4470a(0, 1);
                }
                u.f5477bw.mo174a(this.f4393ba, this.f4402bj.f227a, this.f4402bj.f228b, paint, 0.0f, f2);
                C0654f.m1559a(this.f4402bj, this.f4402bj.m4467b() * 0.8f);
                if (this.f4382O && !this.f4381N && this.f4402bj.m4466b((int) this.f4365s, (int) this.f4366t)) {
                    this.f4382O = false;
                    z10 = true;
                }
                int d4 = (int) ((this.f4400bh.m4462d() - i14) - (60.0f * f2));
                int i16 = (int) (this.f4400bh.f230d - (65.0f * f2));
                this.f4402bj.m4469a(d4, i16, d4 + i14, i16 + i14);
                if (z13) {
                    paint2 = this.f4337aY;
                } else {
                    paint2 = this.f4338aZ;
                }
                if (b2 < 0.0f) {
                    float b6 = C0654f.m1528b((C0654f.m1512c(b2) * 0.7f) - 0.3f, 0.0f, 1.0f);
                    if (b2 > 0.0f) {
                        i2 = Color.m4546a(110, 210, 210, 210);
                    } else {
                        i2 = Color.m4546a(110, 210, 110, 110);
                    }
                    int a3 = C0654f.m1566a(i2, paint2.m4490e(), b6);
                    paint2 = this.f4404bl;
                    paint2.m4502b(a3);
                }
                if (b2 < -0.5d) {
                    this.f4402bj.m4470a(0, 1);
                }
                u.f5477bw.mo174a(this.f4394bb, this.f4402bj.f227a, this.f4402bj.f228b, paint2, 0.0f, f2);
                C0654f.m1559a(this.f4402bj, this.f4402bj.m4467b() * 0.8f);
                if (this.f4382O && !this.f4381N && this.f4402bj.m4466b((int) this.f4365s, (int) this.f4366t)) {
                    this.f4382O = false;
                    z11 = true;
                }
                int i17 = 1;
                if ((z10 || z11) && sVar.mo2687g()) {
                    if (m1769a(u)) {
                        i17 = 5;
                    }
                    if (m1750b(u)) {
                        i17 = 10;
                    }
                }
                if (z10) {
                    if (sVar.mo2687g() && u.f5464bb.m3734t() <= u.f5464bb.m3735s()) {
                        m1766a(this.f4277d.f4143an);
                    }
                    if (z12) {
                        u.f5475bu.m2172b(C0530e.f3569g, 0.5f);
                        C0620c.m1823a(afVar, sVar, false, true);
                    }
                    for (int i18 = 0; i18 < i17; i18++) {
                        C0651e u2 = m1706u();
                        if (m1769a(u)) {
                            u2.f4568e = true;
                        }
                        m1771a(u2, sVar);
                        u2.m1621a(sVar.mo3672w());
                        m1786a(sVar, (PointF) null, (AbstractC0210af) null, u2);
                    }
                }
                if (z11) {
                    if (z13) {
                        C0620c.m1823a(afVar, sVar, true, true);
                        u.f5475bu.m2172b(C0530e.f3570h, 0.5f);
                    }
                    for (int i19 = 0; i19 < i17; i19++) {
                        C0651e u3 = m1706u();
                        m1771a(u3, sVar);
                        u3.f4570g = true;
                        u3.m1621a(sVar.mo3672w());
                    }
                }
                if (!z10 && !z11 && this.f4382O && !this.f4381N && !this.f4400bh.m4466b((int) this.f4365s, (int) this.f4366t)) {
                    return true;
                }
            }
        }
        if (z5 || !AbstractC0789l.m711ak() || !this.f4382O || this.f4381N || this.f4400bh.m4466b((int) this.f4365s, (int) this.f4366t)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m1789a(Rect rect, Paint paint, Paint paint2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (f4350bw) {
            u.f5477bw.mo171a(this.f4397be, rect, paint2, rect.f227a, rect.f228b, 0, 0);
            if (paint != null) {
                int f = paint.m4488f() + 0;
                if (f > 255) {
                    f = 255;
                }
                paint.m4497c(f);
            }
        }
        if (paint != null) {
            u.f5477bw.mo142b(rect, paint);
        }
    }

    /* renamed from: a */
    public void m1790a(Rect rect, int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4407bo.m4502b(i);
        this.f4407bo.m4517a(Paint.Style.f217b);
        this.f4407bo.m4525a(1.0f);
        u.f5477bw.mo142b(rect, this.f4407bo);
        if (this.f4409bv) {
            this.f4407bo.m4502b(Color.m4546a(255, 116, 136, 160));
            this.f4407bo.m4525a(1);
            this.f4403bk.m4468a(rect);
            this.f4403bk.f230d--;
            this.f4403bk.f228b++;
            this.f4403bk.f227a++;
            this.f4403bk.f229c--;
            u.f5477bw.mo142b(this.f4403bk, this.f4407bo);
        }
    }

    /* renamed from: a */
    public void m1795a(int i, int i2, int i3, int i4, String str, int i5, Paint paint, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4401bi.m4469a(i, i2, i + i3, i2 + i4);
        this.f4407bo.m4502b(i5);
        if (!z) {
            this.f4407bo.m4517a(Paint.Style.f216a);
            u.f5477bw.mo142b(this.f4401bi, this.f4407bo);
        } else {
            m1789a(this.f4401bi, (Paint) null, this.f4407bo);
        }
        int a = Color.m4546a(255, 0, 0, 0);
        if (f4350bw) {
            a = Color.m4546a(100, 0, 0, 0);
        }
        m1790a(this.f4401bi, a);
        m1796a(i, i2, i3, i4, str, i5, paint);
    }

    /* renamed from: a */
    public void m1796a(int i, int i2, int i3, int i4, String str, int i5, Paint paint) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4401bi.m4469a(i, i2, i + i3, i2 + i4);
        if (AbstractC0789l.f5557aG) {
            u.f5477bw.mo158a(str, this.f4401bi.m4462d(), this.f4401bi.m4461e() + (u.f5477bw.mo156a(str, paint) / 2), paint);
        } else {
            u.f5477bw.mo158a(str, this.f4401bi.m4462d(), this.f4401bi.m4461e() - ((paint.m4481l() + paint.m4480m()) / 2.0f), paint);
        }
    }

    /* renamed from: H */
    public boolean m1810H() {
        if (this.f4381N) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1794a(int i, int i2, int i3, int i4, String str, EnumC0624g gVar, boolean z, int i5) {
        return m1792a(i, i2, i3, i4, str, gVar, z, i5, this.f4316aw, false);
    }

    /* renamed from: b */
    public boolean m1754b(int i, int i2, int i3, int i4, String str, EnumC0624g gVar, boolean z, int i5) {
        return m1792a(i, i2, i3, i4, str, gVar, z, i5, this.f4316aw, true);
    }

    /* renamed from: a */
    public boolean m1793a(int i, int i2, int i3, int i4, String str, EnumC0624g gVar, boolean z, int i5, Paint paint) {
        return m1792a(i, i2, i3, i4, str, gVar, z, i5, paint, false);
    }

    /* renamed from: a */
    public boolean m1792a(int i, int i2, int i3, int i4, String str, EnumC0624g gVar, boolean z, int i5, Paint paint, boolean z2) {
        m1795a(i, i2, i3, i4, str, i5, paint, z2);
        return m1797a(i, i2, i3, i4, gVar, z);
    }

    /* renamed from: a */
    public void m1805a(float f, float f2, float f3, float f4) {
        this.f4415bI.m4469a((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        if (this.f4415bI.m4466b((int) this.f4367u, (int) this.f4368v)) {
            this.f4374G = true;
            if (this.f4383P) {
                this.f4373F = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m1797a(int i, int i2, int i3, int i4, EnumC0624g gVar, boolean z) {
        m1805a(i, i2, i3, i4);
        this.f4401bi.m4469a(i, i2, i + i3, i2 + i4);
        if (((!z || !this.f4371D) && !this.f4382O) || !this.f4401bi.m4466b((int) this.f4365s, (int) this.f4366t)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1798a(int i, int i2, int i3, int i4, EnumC0624g gVar) {
        this.f4401bi.m4469a(i, i2, i + i3, i2 + i4);
        if (!this.f4383P || !this.f4401bi.m4466b((int) this.f4365s, (int) this.f4366t)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public float m1709r(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (afVar.f1536cj >= u.f5469bj || afVar.f1536cj + 200 <= u.f5469bj) {
            return AbstractC0789l.m651u().f5619de;
        }
        return (1.0f - ((u.f5469bj - afVar.f1536cj) / 200.0f)) * 6.0f;
    }

    /* renamed from: a */
    public void m1774a(C0606e eVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        eVar.m1863q_();
        eVar.m1841c(u.f5500bV);
        eVar.m1838d(u.f5501bW);
        this.f4361n.m1848a(eVar);
    }
}
