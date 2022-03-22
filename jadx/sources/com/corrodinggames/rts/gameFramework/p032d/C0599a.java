package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0283c;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.game.units.C0518t;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p020d.C0353c;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0182d;
import com.corrodinggames.rts.game.units.p013a.C0185g;
import com.corrodinggames.rts.game.units.p013a.C0192n;
import com.corrodinggames.rts.game.units.p013a.C0203y;
import com.corrodinggames.rts.game.units.p013a.C0204z;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.game.units.p027g.C0464c;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0538ad;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0757n;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.AbstractC0068d;
import com.corrodinggames.rts.p008a.ActivityC0069e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a.class */
public class C0599a extends AbstractC0585bi {

    /* renamed from: a */
    C0623f f4105a;

    /* renamed from: b */
    AbstractC0789l f4106b;

    /* renamed from: e */
    public boolean f4109e;

    /* renamed from: f */
    public float f4110f;

    /* renamed from: n */
    C0760q f4118n;

    /* renamed from: o */
    C0760q f4119o;

    /* renamed from: q */
    Paint f4121q;

    /* renamed from: r */
    Paint f4122r;

    /* renamed from: s */
    Paint f4123s;

    /* renamed from: t */
    Paint f4124t;

    /* renamed from: u */
    Paint f4125u;

    /* renamed from: v */
    Paint f4126v;

    /* renamed from: G */
    boolean f4137G;

    /* renamed from: H */
    float f4138H;

    /* renamed from: I */
    float f4139I;

    /* renamed from: J */
    float f4140J;

    /* renamed from: K */
    int f4141K;

    /* renamed from: L */
    boolean f4142L;

    /* renamed from: M */
    float f4143M;

    /* renamed from: N */
    float f4144N;

    /* renamed from: O */
    float f4145O;

    /* renamed from: P */
    float f4146P;

    /* renamed from: Q */
    float f4147Q;

    /* renamed from: R */
    float f4148R;

    /* renamed from: S */
    int f4149S;

    /* renamed from: T */
    float f4150T;

    /* renamed from: U */
    float f4151U;

    /* renamed from: ac */
    AbstractC0210af f4159ac;

    /* renamed from: ad */
    AbstractC0197s f4160ad;

    /* renamed from: ae */
    float f4161ae;

    /* renamed from: af */
    long f4162af;

    /* renamed from: ag */
    float f4163ag;

    /* renamed from: ah */
    float f4164ah;

    /* renamed from: ai */
    String f4165ai;

    /* renamed from: aj */
    String f4166aj;

    /* renamed from: ak */
    String f4167ak;

    /* renamed from: al */
    String f4168al;

    /* renamed from: am */
    String f4169am;

    /* renamed from: an */
    public String f4170an;

    /* renamed from: aq */
    public float f4173aq;

    /* renamed from: ar */
    public boolean f4174ar;

    /* renamed from: aE */
    float f4187aE;

    /* renamed from: aJ */
    int f4192aJ;

    /* renamed from: aa */
    static Paint f4157aa = new Paint();

    /* renamed from: ab */
    static PorterDuffColorFilter f4158ab = new PorterDuffColorFilter(Color.m4214a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aK */
    static String f4193aK = C0652a.m1536a("gui.rategame.text", new Object[0]);

    /* renamed from: aL */
    static String f4194aL = C0652a.m1536a("gui.rategame.yes", new Object[0]);

    /* renamed from: aM */
    static String f4195aM = C0652a.m1536a("gui.rategame.no", new Object[0]);

    /* renamed from: c */
    public boolean f4107c = false;

    /* renamed from: d */
    public boolean f4108d = false;

    /* renamed from: g */
    Paint f4111g = new Paint();

    /* renamed from: h */
    Paint f4112h = new Paint();

    /* renamed from: i */
    Paint f4113i = new Paint();

    /* renamed from: j */
    Paint f4114j = new Paint();

    /* renamed from: k */
    Paint f4115k = new Paint();

    /* renamed from: l */
    Paint f4116l = new Paint();

    /* renamed from: m */
    Paint f4117m = new Paint();

    /* renamed from: p */
    Paint f4120p = new Paint();

    /* renamed from: w */
    Rect f4127w = new Rect();

    /* renamed from: x */
    RectF f4128x = new RectF();

    /* renamed from: y */
    Rect f4129y = new Rect();

    /* renamed from: z */
    Rect f4130z = new Rect();

    /* renamed from: A */
    RectF f4131A = new RectF();

    /* renamed from: B */
    RectF f4132B = new RectF();

    /* renamed from: C */
    Rect f4133C = new Rect();

    /* renamed from: D */
    RectF f4134D = new RectF();

    /* renamed from: E */
    Rect f4135E = new Rect();

    /* renamed from: F */
    RectF f4136F = new RectF();

    /* renamed from: V */
    C0748e f4152V = null;

    /* renamed from: W */
    C0748e f4153W = null;

    /* renamed from: X */
    C0748e f4154X = null;

    /* renamed from: Y */
    C0748e f4155Y = null;

    /* renamed from: Z */
    C0748e f4156Z = null;

    /* renamed from: ao */
    String f4171ao = null;

    /* renamed from: ap */
    float f4172ap = 0.0f;

    /* renamed from: as */
    ArrayList f4175as = new ArrayList();

    /* renamed from: at */
    C0203y f4176at = new C0203y(false);

    /* renamed from: au */
    C0203y f4177au = new C0203y(true);

    /* renamed from: av */
    C0182d f4178av = new C0182d();

    /* renamed from: aw */
    ArrayList f4179aw = new ArrayList();

    /* renamed from: ax */
    ArrayList f4180ax = new ArrayList();

    /* renamed from: ay */
    C0835m f4181ay = new C0835m();

    /* renamed from: az */
    ArrayList f4182az = new ArrayList();

    /* renamed from: aA */
    RectF f4183aA = new RectF();

    /* renamed from: aB */
    HashMap f4184aB = new HashMap();

    /* renamed from: aC */
    ArrayList f4185aC = new ArrayList();

    /* renamed from: aD */
    Rect f4186aD = new Rect();

    /* renamed from: aF */
    ArrayList f4188aF = new ArrayList();

    /* renamed from: aG */
    boolean f4189aG = false;

    /* renamed from: aH */
    float f4190aH = 0.0f;

    /* renamed from: aI */
    float f4191aI = 0.0f;

    /* renamed from: aN */
    boolean f4196aN = false;

    /* renamed from: aO */
    float f4197aO = 0.0f;

    /* renamed from: aP */
    MenuC0636r f4198aP = new MenuC0636r();

    /* renamed from: aQ */
    ArrayList f4199aQ = null;

    C0599a(AbstractC0789l lVar, C0623f fVar) {
        this.f4105a = fVar;
        this.f4106b = lVar;
        m1848b();
    }

    /* renamed from: a */
    public void m1866a() {
        this.f4165ai = C0652a.m1536a("gui.unselectall", new Object[0]);
        this.f4166aj = C0652a.m1536a("gui.common.allyUnit", new Object[0]);
        this.f4167ak = C0652a.m1536a("gui.common.enemyUnit", new Object[0]);
        this.f4168al = C0652a.m1536a("gui.common.neutralUnit", new Object[0]);
        this.f4169am = C0652a.m1536a("gui.infoText.ownedBy", new Object[0]);
        this.f4170an = C0652a.m1536a("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void m1848b() {
        m1866a();
        this.f4152V = this.f4106b.f5514bw.mo194a(C0063R.drawable.zoom_button);
        this.f4153W = this.f4106b.f5514bw.mo194a(C0063R.drawable.lock_icon_menu);
        this.f4154X = this.f4106b.f5514bw.mo194a(C0063R.drawable.pause);
        this.f4155Y = this.f4106b.f5514bw.mo194a(C0063R.drawable.replay_pause);
        this.f4156Z = this.f4106b.f5514bw.mo194a(C0063R.drawable.fast);
        f4157aa.m4189a(255, 30, 30, 30);
        f4157aa.m4187a(f4158ab);
        f4157aa.m4158d(true);
        this.f4121q = new Paint();
        this.f4121q.m4173a(true);
        this.f4121q.m4186a(Paint.Align.CENTER);
        this.f4121q.m4189a(255, 0, 255, 0);
        this.f4106b.m723a(this.f4121q, 34.0f);
        this.f4122r = new Paint();
        this.f4122r.m4173a(true);
        this.f4122r.m4186a(Paint.Align.CENTER);
        this.f4122r.m4189a(255, 255, 0, 0);
        this.f4106b.m723a(this.f4122r, 32.0f);
        this.f4123s = new Paint();
        this.f4123s.m4173a(true);
        this.f4123s.m4186a(Paint.Align.LEFT);
        this.f4123s.m4189a(255, 0, 255, 0);
        this.f4106b.m723a(this.f4123s, 16.0f);
        this.f4124t = new Paint();
        this.f4124t.m4173a(true);
        this.f4124t.m4186a(Paint.Align.RIGHT);
        this.f4124t.m4189a(255, 0, 255, 0);
        this.f4106b.m723a(this.f4124t, 16.0f);
        this.f4125u = new Paint();
        this.f4125u.m4189a(255, 255, 255, 255);
        this.f4125u.m4186a(Paint.Align.LEFT);
        this.f4125u.m4162c(true);
        this.f4125u.m4173a(true);
        this.f4126v = new Paint();
        this.f4126v.m4189a(255, 255, 255, 255);
        this.f4126v.m4186a(Paint.Align.LEFT);
        this.f4126v.m4162c(true);
        this.f4126v.m4173a(true);
        this.f4118n = new C0760q();
        this.f4118n.m4169b(Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4118n.m833n();
        this.f4119o = new C0760q();
        this.f4119o.m4169b(Color.m4213a(133, 255, 255, 255));
        this.f4119o.m833n();
        this.f4185aC.clear();
        int i = 0;
        while (i < 10) {
            this.f4185aC.add(new C0646v(this, i < 3));
            i++;
        }
        m1825l();
    }

    /* renamed from: r */
    private float m1819r() {
        float f = 4.6f / this.f4106b.f5575cF;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: s */
    private float m1818s() {
        return m1817t() / this.f4106b.f5575cF;
    }

    /* renamed from: t */
    private float m1817t() {
        if (this.f4106b.f5556cm / this.f4106b.f5511bt.m3649f() < this.f4106b.f5558co / this.f4106b.f5511bt.m3646g()) {
            return this.f4106b.f5556cm / this.f4106b.f5511bt.m3649f();
        }
        return this.f4106b.f5558co / this.f4106b.f5511bt.m3646g();
    }

    /* renamed from: a */
    void m1865a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f4106b.f5516by.showZoomButton) {
            float f6 = this.f4106b.f5534bQ * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.f4106b.f5540bW;
            if (this.f4137G) {
                this.f4127w.m4136a(i - 4, (int) (i2 - (50.0f * this.f4106b.f5534bQ)), i + 4, (int) (i2 + (50.0f * this.f4106b.f5534bQ)));
                this.f4113i.m4193a();
                this.f4113i.m4169b(Color.m4213a(255, 0, 0, 0));
                this.f4106b.f5514bw.mo142b(this.f4127w, this.f4113i);
            }
            float f7 = i2;
            if (this.f4106b.f5572cC > 1.0f) {
                f5 = f7 - (((this.f4106b.f5572cC - 1.0f) * 3.0f) * this.f4106b.f5534bQ);
            } else {
                f5 = f7 + (((this.f4106b.f5572cC * (-20.0f)) + 20.0f + 1.0f) * this.f4106b.f5534bQ);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.f4106b.f5537bT - f11) {
                f5 = (int) (this.f4106b.f5537bT - f11);
            }
            this.f4127w.m4136a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4137G) {
                f4157aa.m4189a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f4157aa.m4189a(255, 255, 255, 255);
            }
            this.f4106b.f5514bw.mo174a(this.f4152V, this.f4127w.f227a, this.f4127w.f228b, f4157aa, 0.0f, f6);
            boolean z = this.f4137G;
            if (!this.f4137G && this.f4105a.m1743a(this.f4127w.f227a, this.f4127w.f228b, this.f4127w.m4134b(), this.f4127w.m4130c(), EnumC0624g.zoomButton)) {
                this.f4137G = true;
                this.f4138H = this.f4105a.f4295t;
            }
            if (!this.f4105a.f4305D) {
                this.f4137G = false;
            }
            if (this.f4137G) {
                this.f4139I += f;
                this.f4105a.m1685d();
                float f12 = this.f4105a.f4295t - this.f4138H;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.f4106b.f5572cC;
                if (f13 > 2.0f) {
                    this.f4106b.f5572cC -= (5.0E-4f * C0654f.m1459c(f13)) * f;
                    this.f4106b.f5573cD = false;
                    if (this.f4106b.f5572cC < m1818s()) {
                        this.f4106b.f5572cC = m1818s();
                        this.f4106b.f5573cD = true;
                    }
                } else if (f13 < -2.0f) {
                    this.f4106b.f5572cC += 5.0E-4f * C0654f.m1459c(f13) * f;
                    this.f4106b.f5573cD = false;
                    if (this.f4106b.f5572cC > m1819r()) {
                        this.f4106b.f5572cC = m1819r();
                        this.f4106b.f5573cD = true;
                    }
                }
            } else {
                if (!z || this.f4139I < 12.0f) {
                }
                this.f4139I = 0.0f;
            }
        }
        if (this.f4106b.f5516by.mouseSupport) {
            if (this.f4105a.m1752a(this.f4106b.m738W(), this.f4106b.m737X()) && !this.f4105a.f4308G) {
                int Z = this.f4106b.m735Z();
                if (Z != 0) {
                    this.f4140J += (Z / 120.0f) * 0.18f;
                }
                if (this.f4140J > 1.0f) {
                    this.f4140J = 1.0f;
                }
                if (this.f4140J < -1.0f) {
                    this.f4140J = -1.0f;
                }
            }
            if (this.f4140J != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f4140J < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f4140J * 0.18f * f);
                float f16 = this.f4140J;
                this.f4140J = C0654f.m1522a(this.f4140J, C0654f.m1459c(f15));
                if (this.f4140J == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.f4106b.f5572cC;
                this.f4106b.f5572cC += f17;
                this.f4106b.f5576cG = true;
                this.f4106b.f5577cH = this.f4106b.m738W();
                this.f4106b.f5578cI = this.f4106b.m737X();
                if (f17 != 0.0f) {
                    this.f4106b.f5573cD = false;
                }
            }
        }
        if (this.f4106b.f5516by.gestureZoom && this.f4106b.m741T() && this.f4106b.m739V() >= 3) {
            this.f4151U = 20.0f;
        }
        if (this.f4151U < 10.0f) {
            this.f4142L = false;
        }
        if (this.f4151U > 0.0f) {
            this.f4151U = C0654f.m1522a(this.f4151U, f);
            boolean z2 = this.f4106b.m741T() && this.f4106b.m739V() >= 3;
            this.f4105a.f4367aN = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.f4106b.m739V(); i3++) {
                    f18 += this.f4106b.m686b(i3);
                    f19 += this.f4106b.m678c(i3);
                }
                f4 = f18 / this.f4106b.m739V();
                f3 = f19 / this.f4106b.m739V();
                f2 = 0.0f;
                for (int i4 = 0; i4 < this.f4106b.m739V(); i4++) {
                    f2 += C0654f.m1474b(f4, f3, this.f4106b.m686b(i4), this.f4106b.m678c(i4));
                }
            } else {
                f4 = this.f4146P;
                f3 = this.f4147Q;
                f2 = this.f4148R;
            }
            if (this.f4142L && this.f4149S != this.f4106b.m739V()) {
                this.f4142L = false;
            }
            if (!this.f4142L && z2) {
                this.f4142L = true;
                this.f4143M = f4;
                this.f4144N = f3;
                this.f4145O = f2;
                this.f4150T = this.f4106b.f5572cC;
                this.f4146P = f4;
                this.f4147Q = f3;
                this.f4148R = f2;
                this.f4149S = this.f4106b.m739V();
            }
            if (z2) {
                float f20 = (this.f4147Q - f3) * 2.0f * this.f4106b.f5572cC;
                this.f4106b.f5572cC += (f20 / 250.0f) / this.f4106b.f5534bQ;
                this.f4106b.f5573cD = false;
                float f21 = this.f4148R - f2;
                if (0 != 0) {
                    this.f4106b.f5572cC -= (f21 / 350.0f) / this.f4106b.f5534bQ;
                    this.f4106b.f5573cD = false;
                }
                this.f4146P = f4;
                this.f4147Q = f3;
                this.f4148R = f2;
                this.f4149S = this.f4106b.m739V();
                for (int i5 = 0; i5 < this.f4106b.m739V(); i5++) {
                    this.f4106b.f5514bw.mo197a(f4, f3, this.f4106b.m686b(i5), this.f4106b.m678c(i5), this.f4105a.f4360aG);
                }
                this.f4106b.f5514bw.mo197a(f4, f3, f4, this.f4144N, this.f4105a.f4361aH);
                this.f4106b.f5514bw.mo195a(f4, f3, 6.0f, this.f4105a.f4360aG);
            }
        }
        if (this.f4106b.f5572cC > m1819r()) {
            this.f4106b.f5572cC = m1819r();
            this.f4106b.f5573cD = true;
        }
        if (this.f4106b.f5572cC < m1818s()) {
            this.f4106b.f5572cC = m1818s();
            this.f4106b.f5573cD = true;
        }
    }

    /* renamed from: b */
    void m1847b(float f) {
        this.f4109e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (AbstractC0789l.m696am()) {
            i = 14;
        }
        if (this.f4106b.m741T() && this.f4105a.f4324W == null) {
            boolean c = this.f4105a.m1687c(this.f4106b);
            int i2 = 1;
            if (this.f4106b.f5516by.mouseOrders == 2) {
                i2 = 2;
            }
            int f2 = this.f4106b.m664f(i2);
            if (c || (this.f4106b.f5516by.mouseSupport && f2 != -1 && !this.f4105a.f4306E && !this.f4105a.f4307F)) {
                float b = this.f4106b.m686b(0);
                float c2 = this.f4106b.m678c(0);
                if (f2 != -1) {
                    b = this.f4106b.m686b(f2);
                    c2 = this.f4106b.m678c(f2);
                }
                if (!this.f4107c) {
                    z2 = true;
                    this.f4132B.f231a = (int) b;
                    this.f4132B.f232b = (int) c2;
                }
                this.f4132B.f233c = (int) b;
                this.f4132B.f234d = (int) c2;
                if (Math.abs(this.f4132B.f231a - this.f4132B.f233c) > i || Math.abs(this.f4132B.f232b - this.f4132B.f234d) > i) {
                    this.f4108d = true;
                }
                z = true;
            } else if (this.f4106b.m739V() == 2 && this.f4151U == 0.0f) {
                this.f4132B.f231a = (int) this.f4106b.m686b(0);
                this.f4132B.f232b = (int) this.f4106b.m678c(0);
                this.f4132B.f233c = (int) this.f4106b.m686b(1);
                this.f4132B.f234d = (int) this.f4106b.m678c(1);
                this.f4108d = false;
                z = true;
            }
            if (z) {
                this.f4110f += f;
                if (this.f4110f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4110f = 0.0f;
            }
            if (z) {
                this.f4107c = true;
                if (Math.abs(this.f4132B.f231a - this.f4132B.f233c) > i || Math.abs(this.f4132B.f232b - this.f4132B.f234d) > i) {
                    this.f4133C.f230d = (int) this.f4132B.f234d;
                    this.f4133C.f228b = (int) this.f4132B.f232b;
                    this.f4133C.f227a = (int) this.f4132B.f231a;
                    this.f4133C.f229c = (int) this.f4132B.f233c;
                    C0654f.m1507a(this.f4133C);
                    this.f4111g.m4169b(Color.m4213a(255, 0, 255, 0));
                    this.f4111g.m4184a(Paint.Style.STROKE);
                    this.f4111g.m4192a(1.0f);
                    this.f4106b.f5514bw.mo142b(this.f4133C, this.f4111g);
                    this.f4109e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f4107c && !z) {
            if (!z3 || this.f4106b.m739V() != 3) {
                z4 = true;
            } else {
                z5 = true;
            }
        }
        if (z5) {
            this.f4108d = false;
            this.f4107c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = AbstractC0854w.f5846dK.iterator();
                while (it.hasNext()) {
                    AbstractC0854w wVar = (AbstractC0854w) it.next();
                    if (wVar instanceof AbstractC0283c) {
                        AbstractC0283c cVar = (AbstractC0283c) wVar;
                        cVar.f1496ck = cVar.f1494ci;
                    }
                }
            }
            if (z4) {
                this.f4108d = false;
                this.f4107c = false;
            }
            this.f4134D.m4120a(this.f4132B);
            C0654f.m1504a(this.f4134D);
            if (Math.abs(this.f4134D.f231a - this.f4134D.f233c) > i || Math.abs(this.f4134D.f232b - this.f4134D.f234d) > i) {
                this.f4134D.f234d /= this.f4106b.f5574cE;
                this.f4134D.f232b /= this.f4106b.f5574cE;
                this.f4134D.f231a /= this.f4106b.f5574cE;
                this.f4134D.f233c /= this.f4106b.f5574cE;
                this.f4134D.m4123a(this.f4106b.f5545cb, this.f4106b.f5546cc);
                this.f4105a.f4367aN = 4.0f;
                this.f4105a.f4368aO = 40.0f;
                this.f4105a.f4316O = false;
                boolean a = this.f4105a.m1714a(this.f4106b);
                boolean b2 = this.f4105a.m1695b(this.f4106b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.f4106b.f5516by.smartSelection_v2) {
                    Iterator it2 = AbstractC0854w.f5846dK.iterator();
                    while (it2.hasNext()) {
                        AbstractC0854w wVar2 = (AbstractC0854w) it2.next();
                        if (wVar2 instanceof AbstractC0515r) {
                            AbstractC0515r rVar = (AbstractC0515r) wVar2;
                            if (m1851a(rVar) && (!a || !rVar.f1496ck)) {
                                if (!rVar.mo2643bw()) {
                                    z6 = false;
                                }
                                if (rVar.mo2265aO() && rVar.mo2356l()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (b2) {
                    z6 = true;
                }
                Iterator it3 = AbstractC0854w.f5846dK.iterator();
                while (it3.hasNext()) {
                    AbstractC0854w wVar3 = (AbstractC0854w) it3.next();
                    if (wVar3 instanceof AbstractC0283c) {
                        AbstractC0283c cVar2 = (AbstractC0283c) wVar3;
                        boolean z9 = false;
                        if (m1851a(cVar2)) {
                            z9 = true;
                            if (!z6 && cVar2.mo2643bw()) {
                                z9 = false;
                            }
                            if (!z7 && cVar2.mo2244ai() && !cVar2.mo2356l()) {
                                z9 = false;
                            }
                        }
                        if (b2) {
                            if (z9) {
                                z9 = !cVar2.f1496ck;
                            } else if (cVar2.f1496ck) {
                                z9 = true;
                            }
                        } else if (a && cVar2.f1496ck) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4105a.m1670j(cVar2);
                            if (z4 && cVar2.f1495cj + 900 < this.f4106b.f5501bj && ((!a && !b2) || !cVar2.f1496ck)) {
                                z8 = true;
                            }
                        } else {
                            this.f4105a.m1666l(cVar2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = AbstractC0854w.f5846dK.iterator();
                    while (it4.hasNext()) {
                        AbstractC0854w wVar4 = (AbstractC0854w) it4.next();
                        if (wVar4 instanceof AbstractC0283c) {
                            ((AbstractC0283c) wVar4).f1495cj = this.f4106b.f5501bj;
                        }
                    }
                }
                this.f4105a.m1760C();
            }
        }
    }

    /* renamed from: a */
    private boolean m1851a(AbstractC0283c cVar) {
        if (cVar.f1459bz || cVar.f1501cp != null) {
            return false;
        }
        float f = cVar.f5842dH;
        float f2 = cVar.f5843dI - cVar.f5844dJ;
        if (f2 <= 0.0f) {
            f2 += cVar.f5844dJ;
        }
        if (!this.f4134D.m4116b(f, f2)) {
            return false;
        }
        if ((this.f4105a.m1664m(cVar) || this.f4106b.f5493bb.m3493b()) && !cVar.mo1605t()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1849a(String str, int i) {
        this.f4171ao = str;
        this.f4172ap = i;
    }

    /* renamed from: b */
    public void m1844b(String str, int i) {
        if (this.f4172ap <= 0.0f || str.equals(this.f4171ao)) {
            this.f4171ao = str;
            this.f4172ap = i;
        }
    }

    /* renamed from: c */
    public void m1842c(float f) {
        if (this.f4172ap > 0.0f && this.f4171ao != null) {
            this.f4172ap = C0654f.m1522a(this.f4172ap, f);
            this.f4106b.f5514bw.mo157a(this.f4171ao, this.f4106b.f5539bV, this.f4106b.f5540bW, this.f4105a.f4351ax, this.f4105a.f4356aC, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m1859a(AbstractC0197s sVar) {
        return AbstractC0789l.m638u().f5452am && sVar.mo3370k_();
    }

    /* renamed from: c */
    public void m1843c() {
        this.f4141K = 0;
    }

    /* renamed from: a */
    public C0538ad m1858a(AbstractC0197s sVar, int i, ArrayList arrayList) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!AbstractC0789l.m697al()) {
            return null;
        }
        if (sVar.mo3388I() != null) {
            return sVar.mo3388I();
        }
        if ((sVar instanceof C0192n) || (sVar instanceof C0182d)) {
            return null;
        }
        if (sVar.mo2376f() == EnumC0198t.rally) {
            return u.f5519bB.f3653T;
        }
        if (sVar.mo2377e() == EnumC0199u.patrol) {
            return u.f5519bB.f3650Q;
        }
        if (sVar.mo2377e() == EnumC0199u.guardUnit) {
            return u.f5519bB.f3649P;
        }
        if (sVar.mo2377e() == EnumC0199u.reclaimTarget) {
            return u.f5519bB.f3651R;
        }
        if (sVar.mo2376f() == EnumC0198t.upgrade) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar2 = (AbstractC0197s) it.next();
                if (sVar2 != sVar && sVar2.mo2376f() == EnumC0198t.upgrade && this.f4105a.m1698b(sVar2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return u.f5519bB.f3652S;
            }
        }
        EnumC0198t f = sVar.mo2376f();
        if (f == EnumC0198t.infoOnly || f == EnumC0198t.infoOnlyNoBox || f == EnumC0198t.infoOnlyStockpile) {
            return null;
        }
        C0538ad adVar = null;
        C0538ad[] adVarArr = u.f5519bB.f3665af;
        if (this.f4141K < adVarArr.length) {
            adVar = adVarArr[this.f4141K];
            this.f4141K++;
        }
        return adVar;
    }

    /* renamed from: d */
    public ArrayList m1839d() {
        this.f4179aw.clear();
        AbstractC0210af[] a = this.f4105a.f4412bF.m456a();
        int size = this.f4105a.f4412bF.size();
        for (int i = 0; i < size; i++) {
            AbstractC0268al r = a[i].mo1606r();
            if (!this.f4179aw.contains(r)) {
                this.f4179aw.add(r);
            }
        }
        return this.f4179aw;
    }

    /* renamed from: a */
    public ArrayList m1854a(AbstractC0210af afVar, ArrayList arrayList) {
        C0835m g;
        ArrayList M;
        int i = 0;
        this.f4175as.clear();
        int p = this.f4105a.m1659p();
        if (p == 0) {
            if (this.f4106b.f5516by.showChatAndPingShortcuts && this.f4106b.m755F()) {
                this.f4175as.add(0, this.f4105a.f4287l);
                this.f4175as.add(0, this.f4105a.f4288m);
            }
            return this.f4175as;
        }
        if (C0623f.f4403bw && afVar != null && !(afVar instanceof C0465h)) {
            this.f4175as.add(this.f4176at);
            this.f4175as.add(this.f4177au);
        }
        if (afVar == null) {
        }
        if (afVar != null) {
            i = this.f4175as.size();
            if (afVar.f1494ci) {
                if (this.f4105a.m1664m(afVar)) {
                    ArrayList M2 = afVar.mo2390M();
                    if (M2 != null) {
                        this.f4175as.addAll(M2);
                    }
                } else {
                    ArrayList M3 = afVar.mo2390M();
                    if (M3 != null) {
                        this.f4175as.addAll(M3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0210af afVar2 = (AbstractC0210af) arrayList.get(i2);
                if (this.f4105a.m1664m(afVar2) && !((afVar2.mo1606r() == afVar.mo1606r() && afVar2.mo2329T() == afVar.mo2329T()) || (M = afVar2.mo2390M()) == null)) {
                    Iterator it = M.iterator();
                    while (it.hasNext()) {
                        AbstractC0197s sVar = (AbstractC0197s) it.next();
                        boolean z = false;
                        Iterator it2 = this.f4175as.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0197s) it2.next()).m3387J().equals(sVar.m3387J())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f4175as.add(sVar);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0210af afVar3 = (AbstractC0210af) arrayList.get(i3);
            if (this.f4105a.m1664m(afVar3) && (afVar3 instanceof AbstractC0515r) && !((AbstractC0515r) afVar3).mo2265aO()) {
                z2 = true;
            }
        }
        AbstractC0210af e = m1836e();
        if (!z2 && e != null && this.f4105a.m1664m(e)) {
            this.f4175as.add(i, this.f4105a.f4283h);
            this.f4175as.add(i, this.f4105a.f4284i);
        }
        boolean z3 = false;
        if (C0623f.f4403bw && (this.f4106b.f5516by.showSelectedUnitsList || p == 1)) {
            z3 = true;
        }
        if (AbstractC0789l.m699aj() && p > 0) {
            z3 = true;
        }
        if (z3 && !(afVar instanceof C0465h)) {
            if (p == 1 && e != null && (g = e.mo2814g(true)) != null && g.size() > 0) {
                for (int i4 = 0; i4 < g.f5778a; i4++) {
                    AbstractC0197s sVar2 = (AbstractC0197s) g.get(i4);
                    if (sVar2 instanceof C0185g) {
                        C0185g gVar = (C0185g) sVar2;
                        Iterator it3 = this.f4181ay.iterator();
                        while (it3.hasNext()) {
                            C0185g gVar2 = (C0185g) it3.next();
                            if (gVar2.m3403a(gVar)) {
                                g.set(i4, gVar2);
                            }
                        }
                    }
                }
                this.f4181ay.clear();
                Iterator it4 = g.iterator();
                while (it4.hasNext()) {
                    AbstractC0197s sVar3 = (AbstractC0197s) it4.next();
                    if (sVar3 instanceof C0185g) {
                        this.f4181ay.add((C0185g) sVar3);
                    }
                    this.f4175as.add(sVar3);
                }
            }
            ArrayList d = m1839d();
            this.f4180ax.clear();
            Iterator it5 = d.iterator();
            while (it5.hasNext()) {
                C0204z d2 = ((AbstractC0268al) it5.next()).mo2765d();
                d2.m3360t();
                this.f4180ax.add(d2);
            }
            Collections.sort(this.f4180ax);
            if (C0623f.f4403bw) {
                Collections.reverse(this.f4180ax);
            }
            Iterator it6 = this.f4180ax.iterator();
            while (it6.hasNext()) {
                C0204z zVar = (C0204z) it6.next();
                if (C0623f.f4403bw) {
                    this.f4175as.add(0, zVar);
                } else {
                    this.f4175as.add(zVar);
                }
            }
        }
        return this.f4175as;
    }

    /* renamed from: e */
    AbstractC0210af m1836e() {
        if (this.f4105a.f4412bF.size() > 0) {
            return this.f4105a.f4412bF.get(0);
        }
        return null;
    }

    /* renamed from: f */
    AbstractC0210af m1833f() {
        AbstractC0210af afVar = null;
        if (this.f4105a.f4370aQ > 0) {
            AbstractC0210af[] a = this.f4105a.f4412bF.m456a();
            int i = 0;
            int size = this.f4105a.f4412bF.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC0210af afVar2 = a[i];
                if (afVar2.f1494ci) {
                    if (afVar == null) {
                        afVar = afVar2;
                    } else if (!m1855a(afVar, afVar2)) {
                        afVar = null;
                        break;
                    } else if (afVar.mo2329T() > afVar2.mo2329T()) {
                        afVar = afVar2;
                    }
                }
                i++;
            }
        }
        return afVar;
    }

    /* renamed from: a */
    public static boolean m1855a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        AbstractC0268al r = afVar.mo1606r();
        AbstractC0268al r2 = afVar2.mo1606r();
        if (r == r2) {
            return true;
        }
        if (!(r instanceof C0368l) || !(r2 instanceof C0368l)) {
            return false;
        }
        C0368l lVar = (C0368l) r;
        C0368l lVar2 = (C0368l) r2;
        if (lVar.f2820fz.contains(r2)) {
            return true;
        }
        if (lVar.f2823fC != null && C0364h.m2904a(lVar.f2823fC, lVar2.mo2732x())) {
            return true;
        }
        if (lVar2.f2823fC == null || !C0364h.m2904a(lVar2.f2823fC, lVar.mo2732x())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    ArrayList m1831g() {
        this.f4182az.clear();
        AbstractC0210af[] a = this.f4105a.f4412bF.m456a();
        int size = this.f4105a.f4412bF.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar instanceof AbstractC0515r) {
                this.f4182az.add((AbstractC0515r) afVar);
            }
        }
        return this.f4182az;
    }

    /* renamed from: h */
    float m1829h() {
        return C0654f.m1475b((this.f4106b.f5537bT / 14.0f) / this.f4106b.f5534bQ, 25.0f * this.f4106b.f5534bQ, 40.0f * this.f4106b.f5534bQ);
    }

    /* renamed from: c */
    private boolean m1841c(AbstractC0197s sVar) {
        if (sVar.mo3361o()) {
            return true;
        }
        if (sVar instanceof C0185g) {
            return this.f4105a.m1664m(((C0185g) sVar).f1330b);
        }
        ArrayList g = m1831g();
        C0181c J = sVar.m3387J();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (rVar.mo2880a(J) != null && this.f4105a.m1664m(rVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1857a(AbstractC0197s sVar, ArrayList arrayList) {
        if (sVar.mo3361o()) {
            return true;
        }
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            if (!gVar.mo3159s(gVar.f1330b)) {
                return false;
            }
            if (this.f4105a.m1664m(gVar.f1330b) || gVar.mo3174a(gVar.f1330b, this.f4106b.f5493bb)) {
                return true;
            }
            return false;
        }
        C0181c J = sVar.m3387J();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0515r) it.next();
            AbstractC0197s a = afVar.mo2880a(J);
            if (a != null && a.mo3159s(afVar) && (this.f4105a.m1664m(afVar) || a.mo3174a(afVar, this.f4106b.f5493bb))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m1845b(AbstractC0197s sVar, ArrayList arrayList) {
        if (sVar.mo3361o()) {
            return true;
        }
        if (sVar instanceof C0185g) {
            C0185g gVar = (C0185g) sVar;
            if (gVar.mo2386a((AbstractC0210af) gVar.f1330b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0515r) it.next();
            AbstractC0197s a = afVar.mo2880a(sVar.m3387J());
            if (a != null && a.mo2386a(afVar, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private float m1840c(AbstractC0197s sVar, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (sVar.mo3362l_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0515r) it.next();
            AbstractC0197s a = afVar.mo2880a(sVar.m3387J());
            if (a != null) {
                float q = a.mo3368q(afVar);
                if (q > f) {
                    f = q;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0464c m1837d(AbstractC0197s sVar) {
        float f = -1.0f;
        C0464c cVar = null;
        if (sVar.mo3362l_()) {
            return null;
        }
        Iterator it = this.f4105a.f4412bF.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.mo2880a(sVar.m3387J()) == null) {
                    continue;
                } else {
                    C0464c b = C0464c.m2437b(rVar, sVar.m3387J());
                    if (b == null) {
                        return null;
                    }
                    if (f < b.m2445a()) {
                        f = b.m2445a();
                        cVar = b;
                    }
                }
            }
        }
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    /* renamed from: e */
    private float m1834e(AbstractC0197s sVar) {
        C0464c d = m1837d(sVar);
        if (d == null) {
            return 0.0f;
        }
        return d.m2438b();
    }

    /* renamed from: b */
    float m1846b(AbstractC0197s sVar) {
        C0464c d = m1837d(sVar);
        if (d == null) {
            return 0.0f;
        }
        return d.m2436c();
    }

    /* renamed from: d */
    int m1838d(float f) {
        ArrayList arrayList;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0760q qVar;
        Rect rect;
        Rect rect2;
        int i;
        int Z;
        this.f4174ar = false;
        int i2 = 1;
        if (C0623f.f4404bx) {
            i2 = 2;
        }
        int i3 = 0;
        boolean z = false;
        C0620c.m1770a(f);
        ArrayList g = m1831g();
        AbstractC0210af f8 = m1833f();
        ArrayList arrayList2 = null;
        if (this.f4105a.f4324W != null) {
            arrayList2 = this.f4105a.f4324W.mo3375r(f8);
        }
        if (arrayList2 != null) {
            arrayList = arrayList2;
        } else {
            arrayList = m1854a(f8, g);
        }
        if (f8 == null && arrayList.size() > 0) {
            f8 = m1836e();
            if (f8 == null && C0368l.f2484b != null) {
                f8 = AbstractC0210af.m3310c(C0368l.f2484b);
            }
        }
        this.f4105a.f4290o = false;
        if (arrayList.contains(this.f4105a.f4283h)) {
            this.f4105a.f4290o = true;
        }
        if (f8 == null) {
            f8 = m1836e();
        }
        boolean z2 = true;
        if (f8 == null) {
            this.f4162af = -1L;
        }
        if (f8 != null && arrayList.size() > 0) {
            float f9 = 2.0f;
            float h = m1829h();
            float f10 = 2.0f;
            float f11 = h + 2.0f;
            boolean z3 = false;
            if (!C0623f.f4406bz) {
                f2 = this.f4106b.f5522bE.m1625b() + 2;
                f3 = this.f4106b.f5536bS - this.f4106b.f5522bE.f4434c;
                f4 = this.f4106b.f5522bE.f4434c;
            } else {
                f2 = this.f4106b.f5522bE.f4433b;
                f3 = this.f4106b.f5522bE.f4434c;
                f4 = this.f4106b.f5522bE.f4434c;
                z3 = true;
            }
            if (C0623f.f4403bw) {
                h += 15.0f * this.f4106b.f5534bQ;
                float f12 = f11 + (15.0f * this.f4106b.f5534bQ);
                f9 = 5.0f;
                if (AbstractC0789l.m698ak()) {
                    f9 = 2.0f;
                }
                f11 = f12 + 2.0f;
                f10 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!C0623f.f4276a) {
                boolean z4 = true;
                if (this.f4105a.f4278c != null && this.f4105a.f4370aQ == 1 && this.f4105a.f4278c.f1494ci) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m1828i() + 2.0f;
                }
            }
            int i4 = 0;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar = (AbstractC0197s) it.next();
                if (m1857a(sVar, g)) {
                    i4++;
                    float j = f11 * sVar.mo2375j();
                    int i5 = i2;
                    if (sVar.mo2374k() > 0) {
                        i5 = sVar.mo2374k();
                    }
                    float f16 = f4 / i5;
                    boolean z5 = false;
                    if ((f14 + f16) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f13 > 0.0f && j + 0.1f < f13) {
                        z5 = true;
                    }
                    if (z5) {
                        f15 += f13;
                        f13 = 0.0f;
                        f14 = 0.0f;
                    }
                    if (f13 < j) {
                        f13 = j;
                    }
                    f14 += f16;
                }
            }
            if (f14 > 0.0f) {
                f15 += f13;
            }
            float f17 = f2 + f15;
            float f18 = f2;
            float f19 = f2 + 1.0f;
            if (this.f4106b.f5516by.showUnitGroups) {
                f5 = this.f4106b.f5558co - (34.0f * this.f4106b.f5534bQ);
            } else {
                f5 = this.f4106b.f5558co;
            }
            this.f4162af = f8.f5835dA;
            float f20 = f19 - ((int) f8.f1435bc);
            float f21 = 0.0f;
            float f22 = 1.0f + (h * 0.25f);
            boolean z6 = f17 - f8.f1435bc > f5 + f22;
            boolean z7 = f8.f1435bc > f22;
            this.f4174ar = z6 || z7;
            if (this.f4106b.f5516by.mouseSupport && !this.f4105a.m1752a(this.f4106b.m738W(), this.f4106b.m737X()) && (Z = this.f4106b.m735Z()) != 0) {
                f21 = -(Z / 120.0f);
            }
            float f23 = 0.0f;
            if (z6) {
                this.f4127w.f227a = (int) (f3 + 2.0f);
                this.f4127w.f229c = (int) ((f3 + f4) - 2.0f);
                this.f4127w.f228b = (int) (f5 - (h * 0.4f));
                this.f4127w.f230d = (int) (this.f4127w.f228b + (h * 0.4f));
                if (this.f4105a.m1738a(this.f4127w.f227a, this.f4127w.f228b, this.f4127w.m4134b(), this.f4127w.m4130c(), "\\/", EnumC0624g.none, false, Color.m4213a(80, 100, 150, 100), this.f4105a.f4350aw) && this.f4105a.m1755H()) {
                    f23 = 0.0f + (3.0f * f11);
                    this.f4105a.f4316O = false;
                }
                if (f21 > 0.0f) {
                    this.f4173aq = (float) (this.f4173aq + (0.5d * f11));
                }
                f5 -= (f11 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f4127w.f227a = (int) (f3 + 2.0f);
                this.f4127w.f229c = (int) ((f3 + f4) - 2.0f);
                this.f4127w.f228b = (int) f18;
                this.f4127w.f230d = (int) (this.f4127w.f228b + (h * 0.4f));
                if (this.f4105a.m1738a(this.f4127w.f227a, this.f4127w.f228b, this.f4127w.m4134b(), this.f4127w.m4130c(), "/\\", EnumC0624g.none, false, Color.m4213a(80, 100, 150, 100), this.f4105a.f4350aw) && this.f4105a.m1755H()) {
                    f23 -= 3.0f * f11;
                    this.f4105a.f4316O = false;
                }
                if (f21 < 0.0f) {
                    this.f4173aq = (float) (this.f4173aq - (0.5d * f11));
                }
                f18 += (f11 * 0.4f) + 2.0f;
            }
            this.f4106b.f5514bw.mo127h();
            this.f4183aA.m4122a(0.0f, f18 - 1.0f, this.f4106b.f5536bS, f5 + 1.0f);
            this.f4106b.f5514bw.mo180a(this.f4183aA);
            if (AbstractC0789l.m698ak()) {
                if (this.f4162af != f8.f5835dA) {
                    this.f4163ag = 0.0f;
                    this.f4164ah = f8.f1435bc;
                } else if (this.f4173aq != 0.0f) {
                    this.f4163ag = this.f4173aq;
                } else {
                    if (!this.f4105a.f4305D) {
                        this.f4173aq += this.f4163ag * f;
                    }
                    this.f4163ag = C0654f.m1522a(this.f4163ag, f);
                }
            }
            f8.f1435bc += this.f4173aq + f23;
            this.f4173aq = 0.0f;
            int i6 = (int) (f17 - f5);
            if (i6 > 0) {
                if (f8.f1435bc > i6 + 0.0f) {
                    f8.f1435bc = i6 + 0.0f;
                }
                if (f8.f1435bc < 0.0f - 0.0f) {
                    f8.f1435bc = 0.0f - 0.0f;
                }
            } else {
                f8.f1435bc = 0.0f;
            }
            int i7 = -1;
            float f24 = 0.0f;
            float f25 = 0.0f;
            float f26 = 0.0f;
            m1843c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC0197s sVar2 = (AbstractC0197s) it2.next();
                if (m1857a(sVar2, g)) {
                    i3++;
                    boolean b = m1845b(sVar2, g);
                    i7++;
                    float j2 = h * sVar2.mo2375j();
                    int i8 = i2;
                    if (sVar2.mo2374k() > 0) {
                        i8 = sVar2.mo2374k();
                    }
                    float f27 = f4 / i8;
                    if (!z3) {
                        f7 = j2;
                        f6 = f27;
                    } else {
                        f7 = f27;
                        f6 = j2;
                    }
                    boolean z8 = false;
                    if ((f26 + f6) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f25 > 0.0f && f7 + 0.1f < f25) {
                        z8 = true;
                    }
                    if (z8) {
                        f24 += f25 + f10;
                        f25 = 0.0f;
                        f26 = 0.0f;
                    }
                    if (f25 < f7) {
                        f25 = f7;
                    }
                    if (!z3) {
                        this.f4127w.f227a = (int) (f3 + f9);
                        this.f4127w.f229c = (int) ((this.f4127w.f227a + f27) - (f9 * 2.0f));
                        this.f4127w.f228b = (int) (f24 + f20);
                        this.f4127w.f230d = (int) (this.f4127w.f228b + j2);
                        this.f4127w.m4137a((int) f26, 0);
                    } else {
                        this.f4127w.f227a = (int) (f3 + f9 + f24);
                        this.f4127w.f229c = (int) ((this.f4127w.f227a + f27) - (f9 * 2.0f));
                        this.f4127w.f228b = (int) f20;
                        this.f4127w.f230d = (int) (this.f4127w.f228b + j2);
                        this.f4127w.m4137a(0, (int) f26);
                    }
                    boolean z9 = true;
                    this.f4128x.m4121a(this.f4127w);
                    if (!this.f4128x.m4114b(this.f4183aA)) {
                        z9 = false;
                    }
                    f26 += f6;
                    EnumC0198t f28 = sVar2.mo2376f();
                    boolean z10 = false;
                    if (f28 == EnumC0198t.infoOnly || f28 == EnumC0198t.infoOnlyNoBox || f28 == EnumC0198t.infoOnlyStockpile) {
                        z10 = true;
                    }
                    boolean a = m1859a(sVar2);
                    boolean D = sVar2.mo3364D();
                    Paint paint = this.f4114j;
                    boolean z11 = b;
                    if (f28 == EnumC0198t.infoOnlyStockpile) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.m4169b(Color.m4213a(70, 100, 100, 100));
                    } else {
                        paint.m4169b(Color.m4213a(50, 170, 100, 100));
                    }
                    if (a) {
                        paint.m4169b(Color.m4213a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f4159ac == f8 && this.f4160ad == sVar2) {
                        z12 = true;
                    }
                    if (this.f4105a.f4324W == sVar2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.m4169b(Color.m4213a(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.m4169b(Color.m4213a(80, 100, 200, 100));
                    }
                    if (D) {
                        paint.m4164c((int) (paint.m4155f() * 0.7f));
                        qVar = this.f4119o;
                    } else {
                        qVar = this.f4118n;
                    }
                    float f29 = 0.0f;
                    if (z9) {
                        f29 = C0620c.m1767b(f8, sVar2, false);
                        if (sVar2.mo2376f() != EnumC0198t.infoOnlyNoBox) {
                            boolean a2 = this.f4105a.m1733a(sVar2);
                            float f30 = 0.0f;
                            if (a2) {
                                f30 = C0654f.m1459c(C0654f.m1421i((((float) (AbstractC0789l.m747N() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f29 != 0.0f) {
                                float b2 = C0654f.m1475b((C0654f.m1459c(f29) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f29 > 0.0f) {
                                    i = Color.m4213a(110, 210, 210, 210);
                                } else {
                                    i = Color.m4213a(110, 210, 110, 110);
                                }
                                int a3 = C0654f.m1513a(i, paint.m4157e(), b2);
                                paint = this.f4113i;
                                paint.m4169b(a3);
                            }
                            this.f4105a.m1734a(this.f4127w, paint, qVar);
                            float c = m1840c(sVar2, g);
                            if (c >= 0.0f) {
                                this.f4116l.m4189a(80, 0, 0, 100);
                                this.f4135E.m4135a(this.f4127w);
                                this.f4135E.f229c = (int) (rect2.f229c - ((1.0f - c) * this.f4135E.m4134b()));
                                this.f4106b.f5514bw.mo142b(this.f4135E, this.f4116l);
                                this.f4117m.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.f4106b.f5514bw.mo197a(this.f4135E.f229c, this.f4135E.f228b, this.f4135E.f229c, this.f4135E.f230d, this.f4116l);
                            } else {
                                float e = m1834e(sVar2);
                                if (e >= 0.0f) {
                                    this.f4116l.m4189a(80, 100, 0, 0);
                                    this.f4135E.m4135a(this.f4127w);
                                    this.f4135E.f229c = (int) (rect.f229c - ((1.0f - e) * this.f4135E.m4134b()));
                                    this.f4106b.f5514bw.mo142b(this.f4135E, this.f4116l);
                                    this.f4117m.m4189a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.f4106b.f5514bw.mo197a(this.f4135E.f229c, this.f4135E.f228b, this.f4135E.f229c, this.f4135E.f230d, this.f4116l);
                                }
                            }
                            int a4 = Color.m4213a(255, 0, 0, 0);
                            if (C0623f.f4403bw) {
                                a4 = Color.m4213a(100, 0, 0, 0);
                                if (D) {
                                    a4 = Color.m4213a(50, 155, 155, 155);
                                }
                            }
                            if (a2) {
                                a4 = Color.m4213a((int) (100.0f + (150.0f * f30)), 255, 255, 255);
                            }
                            this.f4105a.m1735a(this.f4127w, a4);
                        }
                    }
                    C0538ad a5 = m1858a(sVar2, i7, arrayList);
                    if (a5 != null && z9) {
                        this.f4106b.f5514bw.mo158a(a5.m2071c(), this.f4127w.f227a + 3, this.f4127w.f228b + 14, this.f4105a.f4347at);
                    }
                    boolean z14 = false;
                    AbstractC0268al i9 = sVar2.mo2412i();
                    C0748e r = sVar2.mo3160r();
                    AbstractC0210af j3 = sVar2.mo3167j(f8);
                    if (j3 != null) {
                        i9 = j3.mo1606r();
                    }
                    if (r == null && i9 != null) {
                        r = i9.mo2730z();
                    }
                    if (r != null) {
                        Rect s = sVar2.mo3374s();
                        if (s == null) {
                            s = this.f4135E;
                            s.m4136a(0, 0, r.mo349l(), r.mo350k());
                        }
                        float c2 = (this.f4127w.m4130c() * 0.7f) / s.m4130c();
                        int d = (int) (this.f4127w.m4129d() - ((s.m4134b() * 0.5f) * c2));
                        int e2 = (int) (this.f4127w.m4128e() - ((s.m4130c() * 0.5f) * c2));
                        this.f4120p.m4189a(100, 255, 255, 255);
                        RectF rectF = this.f4136F;
                        rectF.m4122a(d, e2, d + (s.m4134b() * c2), e2 + (s.m4130c() * c2));
                        this.f4106b.f5514bw.mo169a(r, s, rectF, this.f4120p);
                        z14 = true;
                    } else if (i9 != null) {
                        float d2 = this.f4127w.m4129d();
                        float e3 = this.f4127w.m4128e();
                        if (f29 > 0.5d) {
                            e3 += 1.0f;
                        }
                        if (f29 < -0.5d) {
                            e3 -= 1.0f;
                        }
                        float c3 = this.f4127w.m4130c() * 0.7f;
                        float c4 = this.f4127w.m4130c() * 0.95f;
                        if (C0623f.f4403bw) {
                            c3 = this.f4127w.m4130c() * 0.4f;
                            c4 = this.f4127w.m4130c() * 0.85f;
                        }
                        this.f4131A.m4121a(this.f4127w);
                        if (this.f4131A.m4114b(this.f4183aA)) {
                            this.f4106b.f5514bw.mo127h();
                            this.f4106b.f5514bw.mo180a(this.f4131A);
                            EnumC0215ak.m3276a(i9, d2, e3, 0.0f, 0.0f, f8.f1461bB, c3, c4, false, false, sVar2.mo3369p());
                            if (j3 != null) {
                                float a_ = j3.mo2867a_();
                                float bH = j3.mo2564bH();
                                if (bH != -1.0f && sVar2.mo3157u(f8)) {
                                    int b3 = C0654f.m1470b(200, 0, 0, 150);
                                    int b4 = C0654f.m1470b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint a6 = C0851y.m431a(b3, Paint.Style.FILL);
                                    Paint a7 = C0851y.m431a(b4, Paint.Style.STROKE);
                                    int b5 = ((int) (this.f4131A.m4117b() / 3.0f)) - 3;
                                    int i10 = b5 * 2;
                                    this.f4136F.m4122a(d2 - b5, e3 + 0, (d2 - b5) + (i10 * bH), e3 + 0 + 3);
                                    this.f4106b.f5514bw.mo179a(this.f4136F, a6);
                                    this.f4136F.m4122a(d2 - b5, e3 + 0, (d2 - b5) + i10, e3 + 0 + 3);
                                    this.f4106b.f5514bw.mo179a(this.f4136F, a7);
                                } else if (a_ != -1.0f && sVar2.mo3158t(f8)) {
                                    int b6 = C0654f.m1470b(200, 0, 150, 0);
                                    int b7 = C0654f.m1470b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint a8 = C0851y.m431a(b6, Paint.Style.FILL);
                                    Paint a9 = C0851y.m431a(b7, Paint.Style.STROKE);
                                    int b8 = ((int) (this.f4131A.m4117b() / 3.0f)) - 3;
                                    int i11 = b8 * 2;
                                    this.f4136F.m4122a(d2 - b8, e3 + 0, (d2 - b8) + (i11 * a_), e3 + 0 + 3);
                                    this.f4106b.f5514bw.mo179a(this.f4136F, a8);
                                    this.f4136F.m4122a(d2 - b8, e3 + 0, (d2 - b8) + i11, e3 + 0 + 3);
                                    this.f4106b.f5514bw.mo179a(this.f4136F, a9);
                                }
                            }
                            this.f4106b.f5514bw.mo126i();
                        }
                        z14 = true;
                    }
                    C0748e i12 = sVar2.mo3168i(f8);
                    if (i12 != null) {
                        Rect s2 = sVar2.mo3374s();
                        if (s2 == null) {
                            s2 = this.f4135E;
                            s2.m4136a(0, 0, i12.mo349l(), i12.mo350k());
                        }
                        float c5 = (this.f4127w.m4130c() * 0.7f) / s2.m4130c();
                        int d3 = (int) (this.f4127w.m4129d() - ((s2.m4134b() * 0.5f) * c5));
                        int e4 = (int) (this.f4127w.m4128e() - ((s2.m4130c() * 0.5f) * c5));
                        this.f4120p.m4169b(sVar2.mo3178G());
                        RectF rectF2 = this.f4136F;
                        rectF2.m4122a(d3, e4, d3 + (s2.m4134b() * c5), e4 + (s2.m4130c() * c5));
                        this.f4106b.f5514bw.mo169a(i12, s2, rectF2, this.f4120p);
                        z14 = true;
                    }
                    if (z9) {
                        String d4 = sVar2.mo2378d();
                        if (a) {
                            this.f4106b.f5514bw.mo175a(this.f4153W, this.f4127w.f227a + 25, this.f4127w.m4126g(), (Paint) null);
                        }
                        if (this.f4106b.f5514bw.mo138b(d4, this.f4105a.f4350aw) <= this.f4127w.m4134b() - 2) {
                            this.f4113i.m4183a(this.f4105a.f4350aw);
                        } else if (this.f4106b.f5514bw.mo138b(d4, this.f4105a.f4349av) > this.f4127w.m4134b() - 2) {
                            this.f4113i.m4183a(this.f4105a.f4348au);
                        } else {
                            this.f4113i.m4183a(this.f4105a.f4349av);
                        }
                        if (!z11) {
                            this.f4113i.m4169b(Color.m4213a(255, 0, 100, 0));
                        }
                        if (f28 == EnumC0198t.rally) {
                            this.f4113i.m4189a(255, 255, 255, 255);
                        } else if (f28 == EnumC0198t.upgrade || f28 == EnumC0198t.action) {
                            if (!z11) {
                                this.f4113i.m4189a(255, 19, 101, 94);
                            } else {
                                this.f4113i.m4189a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (f28 == EnumC0198t.queueUnit) {
                            AbstractC0268al i13 = sVar2.mo2412i();
                            if (i13 != null && i13.mo2758g() > 1) {
                                if (!z11) {
                                    this.f4113i.m4189a(255, 117, 120, 15);
                                } else {
                                    this.f4113i.m4189a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f4113i.m4189a(155, 255, 255, 255);
                        }
                        int a10 = this.f4106b.f5514bw.mo156a(d4, this.f4113i);
                        float g2 = this.f4127w.m4126g() + (a10 / 2);
                        if (z10) {
                            g2 = this.f4127w.m4126g();
                        }
                        if (z14 && !d4.contains("\n")) {
                            if (z10) {
                                g2 = (this.f4127w.f230d - (a10 / 2)) - 1;
                            } else {
                                g2 = this.f4127w.f230d - 6;
                            }
                        }
                        if (z10) {
                            C0757n.m846a(d4, this.f4127w.m4127f(), g2, this.f4113i);
                        } else {
                            this.f4106b.f5514bw.mo158a(d4, this.f4127w.m4127f(), g2, this.f4113i);
                        }
                    }
                    boolean z15 = false;
                    boolean z16 = false;
                    boolean z17 = false;
                    if (a5 != null && a5.m2080a()) {
                        z15 = true;
                        z17 = true;
                    }
                    this.f4129y.m4135a(this.f4127w);
                    if (AbstractC0789l.m698ak()) {
                        C0654f.m1468b(this.f4129y, 2.0f);
                    }
                    this.f4105a.m1750a(this.f4129y.f227a, this.f4129y.f228b, this.f4129y.m4134b(), this.f4129y.m4130c());
                    if (!this.f4108d && this.f4129y.m4133b((int) this.f4105a.f4296u, (int) this.f4105a.f4297v) && this.f4183aA.m4116b((int) this.f4105a.f4296u, (int) this.f4105a.f4297v)) {
                        z = true;
                        if (AbstractC0789l.m697al()) {
                            z16 = true;
                        }
                        if ((this.f4105a.f4316O || this.f4105a.f4305D) && this.f4105a.f4316O && this.f4105a.m1755H()) {
                            this.f4105a.f4316O = false;
                            z15 = true;
                        }
                    }
                    if (AbstractC0789l.m697al() && this.f4105a.f4324W == null) {
                        if (z16) {
                            this.f4159ac = f8;
                            this.f4160ad = sVar2;
                            this.f4161ae = f24 + f20;
                        } else if (AbstractC0197s.m3384a(this.f4160ad, sVar2)) {
                            this.f4159ac = null;
                            this.f4160ad = null;
                        }
                    }
                    boolean z18 = false;
                    if (z15 && !z17 && this.f4106b.f5516by.mouseSupport && this.f4106b.m667e(2)) {
                        z18 = true;
                    }
                    if (z15) {
                        if (sVar2.mo2409c(f8, z18)) {
                            z15 = false;
                        }
                        if (this.f4106b.f5527bJ.m1940h()) {
                            z15 = false;
                        }
                        if (!m1841c(sVar2)) {
                            z15 = false;
                        }
                    }
                    if (z15) {
                        if (sVar2.mo2377e() == EnumC0199u.none || sVar2.mo2377e() == EnumC0199u.popupQueue) {
                            this.f4105a.f4324W = null;
                            boolean z19 = false;
                            if (z17) {
                                z19 = true;
                            } else if (!sVar2.mo3161q()) {
                                z19 = true;
                            } else {
                                if (sVar2.mo3165l(f8)) {
                                    z19 = true;
                                } else if (this.f4159ac == f8 && AbstractC0197s.m3384a(this.f4160ad, sVar2)) {
                                    z19 = true;
                                }
                                this.f4159ac = f8;
                                this.f4160ad = sVar2;
                                this.f4161ae = f24 + f20;
                            }
                            if (z19) {
                                int i14 = 1;
                                if (sVar2.mo2413g()) {
                                    if (this.f4105a.m1714a(this.f4106b)) {
                                        i14 = 5;
                                    }
                                    if (this.f4105a.m1695b(this.f4106b)) {
                                        i14 = 10;
                                    }
                                }
                                boolean z20 = false;
                                if (!z17) {
                                    boolean z21 = false;
                                    if (!(f8 == null || sVar2.mo2416b(f8, false) == -1)) {
                                        z21 = true;
                                    }
                                    if (z18 && z21) {
                                        z20 = true;
                                    }
                                }
                                if (m1859a(sVar2)) {
                                    this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                                } else if (b || z20) {
                                    boolean g3 = sVar2.mo2413g();
                                    if (g3 && !z20 && this.f4106b.f5493bb.m3430t() <= this.f4106b.f5493bb.m3431s()) {
                                        this.f4105a.m1711a(this.f4170an);
                                    }
                                    if (!g3) {
                                        this.f4106b.f5512bu.m2109b(C0530e.f3568f, 0.8f);
                                    } else if (!z20) {
                                        this.f4106b.f5512bu.m2109b(C0530e.f3569g, 0.5f);
                                    } else {
                                        this.f4106b.f5512bu.m2109b(C0530e.f3570h, 0.5f);
                                    }
                                    C0620c.m1768a(f8, sVar2, z20, false);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        C0651e v = this.f4105a.m1650v();
                                        if (!sVar2.mo3179F()) {
                                            this.f4105a.m1716a(v, sVar2);
                                        } else {
                                            this.f4105a.m1717a(v, sVar2.m3387J(), z20);
                                        }
                                        if (z20) {
                                            v.f4557g = true;
                                        }
                                        v.m1568a(sVar2.mo3372w());
                                        if (!z20) {
                                            this.f4105a.m1731a(sVar2, (PointF) null, (AbstractC0210af) null, v);
                                        }
                                    }
                                } else {
                                    this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                                }
                            }
                        } else if (sVar2.mo2377e() == EnumC0199u.patrol || sVar2.mo2377e() == EnumC0199u.guardUnit || sVar2.mo2377e() == EnumC0199u.pingMap) {
                            if (z18) {
                                if (sVar2 != null && sVar2.equals(this.f4105a.f4324W)) {
                                    this.f4105a.m1669k();
                                }
                            } else if (!b) {
                                this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                            } else {
                                C0620c.m1768a(f8, sVar2, false, false);
                                this.f4159ac = null;
                                this.f4160ad = null;
                                this.f4105a.f4324W = sVar2;
                            }
                        } else if (sVar2.mo2377e() == EnumC0199u.setRally || sVar2.mo2377e() == EnumC0199u.reclaimTarget || sVar2.mo2377e() == EnumC0199u.repairTarget || sVar2.mo2377e() == EnumC0199u.targetGround) {
                            boolean z22 = false;
                            boolean z23 = false;
                            if (sVar2.mo2377e() == EnumC0199u.targetGround) {
                                z23 = true;
                            }
                            if (z18 && z23) {
                                z22 = true;
                            }
                            if (z22) {
                                C0651e v2 = this.f4105a.m1650v();
                                if (!sVar2.mo3179F()) {
                                    this.f4105a.m1716a(v2, sVar2);
                                } else {
                                    this.f4105a.m1717a(v2, sVar2.m3387J(), z22);
                                }
                                v2.f4557g = true;
                                v2.m1568a(sVar2.mo3372w());
                            } else {
                                AbstractC0789l.m670d("Clicked button: actionActive: " + b);
                                if (!b) {
                                    this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                                } else {
                                    C0620c.m1768a(f8, sVar2, false, false);
                                    this.f4159ac = null;
                                    this.f4160ad = null;
                                    this.f4105a.f4324W = sVar2;
                                }
                            }
                        } else if (sVar2.mo2377e() == EnumC0199u.placeBuilding) {
                            if (m1859a(sVar2)) {
                                this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                            } else if (!b) {
                                this.f4106b.f5512bu.m2109b(C0530e.f3573k, 0.8f);
                            } else {
                                this.f4106b.f5512bu.m2109b(C0530e.f3568f, 0.8f);
                            }
                            C0620c.m1768a(f8, sVar2, false, false);
                            this.f4159ac = null;
                            this.f4160ad = null;
                            if (this.f4105a.f4324W == null) {
                                this.f4105a.f4330ac = false;
                            }
                            this.f4105a.f4322U = f8;
                            this.f4105a.f4324W = sVar2;
                            this.f4105a.f4327Z = 0.0f;
                            this.f4105a.f4338ak = -99.0f;
                            this.f4105a.f4339al = -99.0f;
                            if (!this.f4105a.f4326Y) {
                                this.f4105a.f4328aa = this.f4106b.f5559cp * this.f4106b.f5574cE;
                                this.f4105a.f4329ab = this.f4106b.f5560cq * this.f4106b.f5574cE;
                            }
                            this.f4105a.f4326Y = true;
                            this.f4106b.f5511bt.m3672b();
                        } else if (sVar2.mo2377e() == EnumC0199u.directToAction) {
                            C0620c.m1768a(f8, sVar2, false, false);
                            sVar2.mo3378d(f8);
                        } else if (sVar2.mo2377e() != EnumC0199u.infoOnly) {
                            throw new RuntimeException("unknown gui action:" + sVar2.mo2377e());
                        } else if (sVar2.mo3359z()) {
                            this.f4159ac = f8;
                            this.f4160ad = sVar2;
                            this.f4161ae = f24 + f20;
                            this.f4105a.f4324W = null;
                        }
                    }
                    if (this.f4160ad == sVar2) {
                        z2 = b;
                    }
                }
            }
            this.f4106b.f5514bw.mo126i();
            this.f4183aA.m4109f();
        }
        if (f8 == null || f8 != this.f4159ac) {
            this.f4159ac = null;
        } else if (this.f4160ad != null) {
            boolean z24 = true;
            if (AbstractC0789l.m697al()) {
                z24 = false;
            }
            boolean z25 = false;
            if (this.f4160ad.mo3161q()) {
                z25 = true;
            }
            if (AbstractC0789l.m697al() && this.f4160ad.mo2382h()) {
                z25 = true;
            }
            if (z25) {
                boolean z26 = true;
                if (!z2) {
                    z26 = false;
                }
                if (this.f4105a.m1728a(this.f4160ad, z24, this.f4159ac, !z26, true, this.f4161ae)) {
                    this.f4159ac = null;
                }
            }
        }
        if (AbstractC0789l.m697al() && !z) {
            this.f4159ac = null;
            this.f4160ad = null;
        }
        return i3;
    }

    /* renamed from: i */
    float m1828i() {
        return (float) (C0654f.m1475b((this.f4106b.f5537bT / 14.0f) / this.f4106b.f5534bQ, 25.0f * this.f4106b.f5534bQ, 40.0f * this.f4106b.f5534bQ) * 0.9d);
    }

    /* renamed from: a */
    void m1864a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (C0623f.f4276a) {
            z = false;
        }
        if (this.f4105a.f4370aQ > 0) {
            if (this.f4105a.f4278c != null && this.f4105a.f4370aQ == 1 && this.f4105a.f4278c.f1494ci) {
                z = false;
            }
            if (z) {
                if (this.f4105a.m1699b((int) ((this.f4106b.f5536bS - this.f4106b.f5522bE.f4434c) + 2.0f), this.f4106b.f5522bE.m1625b() + 2, (int) (this.f4106b.f5522bE.f4434c - 4.0f), (int) m1828i(), this.f4165ai, EnumC0624g.unselectAllButton, false, Color.m4213a(140, 100, 100, 100)) && !this.f4105a.f4315N) {
                    this.f4105a.m1685d();
                    this.f4105a.m1669k();
                    this.f4105a.m1649w();
                }
            }
            AbstractC0171m mVar = null;
            boolean z2 = false;
            this.f4184aB.clear();
            AbstractC0210af afVar = null;
            AbstractC0210af[] a = this.f4105a.f4412bF.m456a();
            int size = this.f4105a.f4412bF.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0210af afVar2 = a[i2];
                if (afVar2.f1494ci) {
                    afVar = afVar2;
                    if (this.f4105a.m1664m(afVar2)) {
                        AbstractC0268al r = afVar2.mo1606r();
                        Integer num = (Integer) this.f4184aB.get(r);
                        if (num == null) {
                            this.f4184aB.put(r, 1);
                        } else {
                            this.f4184aB.put(r, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        mVar = afVar2.f1461bB;
                    }
                }
            }
            boolean z3 = this.f4106b.f5496be;
            if (!(mVar == null || this.f4106b.f5493bb == null || !mVar.m3489b(this.f4106b.f5493bb))) {
                z3 = true;
            }
            int h = (int) m1829h();
            int i3 = h + 2;
            int i4 = (int) (10.0f * this.f4106b.f5534bQ);
            float b = this.f4106b.f5522bE.m1625b() + h + 30;
            float f2 = (this.f4106b.f5536bS - this.f4106b.f5541bX) + i4;
            float f3 = b + 5.0f;
            if (afVar != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4105a.f4290o) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f4127w.m4136a((int) f2, (int) f3, (int) ((f2 + this.f4106b.f5541bX) - (i4 * 2)), (int) (f3 + h));
            boolean z4 = false;
            if (!C0623f.f4405by) {
                if (i < 3 && !z2 && mVar != null) {
                    Paint paint = this.f4105a.f4353az;
                    if (this.f4106b.f5493bb.m3464d(mVar)) {
                        paint = this.f4105a.f4354aA;
                    }
                    this.f4105a.m1709a(m1860a(mVar), this.f4127w, paint, paint);
                    z4 = true;
                }
                if (this.f4105a.m1659p() == 1 && afVar != null) {
                    if (afVar.m3305cb() <= 3 || (mVar != null && !z3)) {
                        String a2 = m1853a(afVar, false);
                        if (z4) {
                            a2 = "\n" + ("\n" + ("\n" + a2));
                        }
                        Paint paint2 = this.f4113i;
                        paint2.m4193a();
                        paint2.m4169b(Color.m4213a(50, 100, 100, 100));
                        this.f4105a.m1709a(a2, this.f4127w, this.f4105a.f4355aB, this.f4105a.f4355aB);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m1860a(AbstractC0171m mVar) {
        String str = "";
        boolean z = false;
        if (this.f4106b.f5493bb.m3493b()) {
            z = true;
        } else if (this.f4106b.f5493bb.m3464d(mVar)) {
            str = str + this.f4166aj;
        } else if (this.f4106b.f5493bb.m3474c(mVar)) {
            str = str + this.f4167ak;
        } else {
            z = true;
        }
        if (z) {
            if (mVar == AbstractC0171m.f1236g) {
                str = str + this.f4168al;
            } else {
                str = str + "Team - " + mVar.m3453f();
            }
        }
        String str2 = str + "\n";
        if (mVar.f1247q != null) {
            str2 = str2 + mVar.f1247q;
        }
        if (!mVar.f1248r && this.f4106b.m754G() && mVar.m3426x()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m1853a(AbstractC0210af afVar, boolean z) {
        String str;
        String str2 = "";
        if (z) {
            str2 = str2 + afVar.mo1606r().mo2762e() + "\n";
        }
        if (afVar.mo2537g() > 0.0f) {
            str = str2 + C0363g.m2933a(afVar.m3297cv(), afVar.f1484bY / afVar.f1485bZ).m2926a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(afVar.f1484bY)) + "/" + ((int) afVar.f1485bZ) + "\n";
        }
        if (afVar.f1490ce != 0.0f) {
            str = str + "(" + ((int) afVar.f1487cb) + "/" + ((int) afVar.f1490ce) + ")\n";
        }
        C0354d cj = afVar.mo2833cj();
        if (!cj.m2987b()) {
            Iterator it = cj.f2377b.iterator();
            while (it.hasNext()) {
                C0353c cVar = (C0353c) it.next();
                if (cVar.f2375b != 0.0d && !cVar.f2374a.m3020a()) {
                    str = str + cVar.f2374a.m3019a(cVar.f2375b, true) + "\n";
                }
            }
        }
        return C0654f.m1417j(str);
    }

    /* renamed from: a */
    public static String m1856a(AbstractC0197s sVar, boolean z) {
        String str;
        AbstractC0201w wVar;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = "";
        if (sVar instanceof AbstractC0201w) {
            if (((AbstractC0201w) sVar).mo2543t() < 1.0f) {
                AbstractC0789l u = AbstractC0789l.m638u();
                float f = -1.0f;
                AbstractC0210af[] a = u.f5518bA.f4412bF.m456a();
                int size = u.f5518bA.f4412bF.size();
                for (int i = 0; i < size; i++) {
                    float ch = a[i].mo2834ch();
                    if (f == -1.0f || ch < f) {
                        f = ch;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + C0654f.m1429g(1.0f / ((wVar.mo2543t() * f) * 60.0f)) + str;
            }
        }
        return C0654f.m1486a(str2, str);
    }

    /* renamed from: a */
    public static String m1852a(AbstractC0210af afVar, boolean z, boolean z2, boolean z3) {
        String str;
        float ci;
        float f;
        if (z2) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = "";
        C0368l lVar = null;
        if (afVar instanceof C0367k) {
            lVar = ((C0367k) afVar).f2460v;
        }
        if (z) {
            str2 = str2 + afVar.mo1606r().mo2762e() + str;
        }
        if (lVar == null || !lVar.f2564aD) {
            if (!z3) {
                str2 = str2 + "HP: " + ((int) Math.ceil(afVar.f1484bY)) + "/" + ((int) afVar.f1485bZ) + str;
            } else {
                str2 = str2 + "HP: " + ((int) afVar.f1485bZ) + str;
            }
        }
        if (afVar.f1490ce != 0.0f) {
            if (!z3) {
                str2 = str2 + "Shield: " + ((int) afVar.f1487cb) + "/" + ((int) afVar.f1490ce) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) afVar.f1490ce) + str;
            }
        }
        if (lVar != null) {
            if (lVar.f2660cv >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) f) + str;
            }
        }
        if (afVar.mo2623ci() != 0.0f) {
            str2 = str2 + "Income: +$" + C0654f.m1517a(ci, 1) + str;
        }
        if (afVar instanceof AbstractC0515r) {
            AbstractC0515r rVar = (AbstractC0515r) afVar;
            if (rVar.mo2255aY() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + C0654f.m1435f(afVar.f1491cf) + "/" + C0654f.m1435f(rVar.mo2255aY()) + str;
            }
            float z4 = rVar.mo2130z();
            if (!rVar.mo2266aN()) {
                z4 = 0.0f;
            }
            if (z4 != 0.0f) {
                str2 = str2 + "Speed: " + C0654f.m1435f(z4) + str;
            }
            if (rVar.mo2356l()) {
                ArrayList aS = rVar.m2261aS();
                if (aS.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z5 = true;
                    Iterator it = aS.iterator();
                    while (it.hasNext()) {
                        C0518t tVar = (C0518t) it.next();
                        if (!z5) {
                            str3 = str3 + ", ";
                        }
                        z5 = false;
                        String str4 = str3 + C0654f.m1435f(tVar.f3498a);
                        if (tVar.f3501d > 1) {
                            str4 = str4 + "x" + tVar.f3501d;
                        }
                        str3 = str4 + "/" + C0654f.m1435f(tVar.m2127a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float m = rVar.mo2152m();
            if (!rVar.mo2356l()) {
                m = 0.0f;
            }
            if (m != 0.0f) {
                str2 = str2 + "Range: " + C0654f.m1435f(m) + str;
            }
            if (z3 && rVar.mo2654bV()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && afVar.f1508cw > 0) {
            str2 = str2 + "Kills: " + afVar.f1508cw + str;
        }
        boolean z6 = false;
        if (AbstractC0789l.m638u().f5487aV) {
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + afVar.mo1606r().mo2754i() + str;
            if (afVar.f5835dA != 0) {
                str2 = str2 + "id: " + afVar.f5835dA + str;
            }
            if (afVar.f1493ch != 0) {
                str2 = str2 + "flags: " + afVar.f1493ch + str;
            }
            if (afVar.f1492cg != 0) {
                str2 = str2 + "ammo: " + afVar.f1492cg + str;
            }
            if (!afVar.f1479bT) {
                str2 = (str2 + "x: " + C0654f.m1435f(afVar.f5842dH) + str) + "y: " + C0654f.m1435f(afVar.f5843dI) + str;
            }
            if (!(afVar.f1467bH == 0.0f && afVar.f1468bI == 0.0f)) {
                str2 = str2 + "x/y speed: " + C0654f.m1435f(afVar.f1467bH) + ", " + C0654f.m1435f(afVar.f1468bI) + str;
            }
            if (!afVar.f1479bT) {
                str2 = (str2 + "height: " + C0654f.m1435f(afVar.f5844dJ) + str) + "dir: " + C0654f.m1435f(afVar.f1471bL) + str;
            }
            if (afVar.f1477bR < 1.0f) {
                str2 = str2 + "built: " + C0654f.m1435f(afVar.f1477bR) + str;
            }
            if (afVar instanceof C0367k) {
                C0367k kVar = (C0367k) afVar;
                str2 = (str2 + "frame: " + kVar.f2439a + str) + "drawLayer: " + kVar.f5840dF + str;
                if (kVar.mo2846cM() != null) {
                    str2 = str2 + "tags: " + kVar.mo2846cM() + str;
                }
                if (kVar.f1439bg != -9999) {
                    str2 = str2 + "customTimer: " + C0654f.m1429g(kVar.f1439bg / 1000.0f) + str;
                }
            }
            z6 = true;
        }
        C0354d cN = afVar.mo1608cN();
        if (cN != null && !cN.m2987b()) {
            String a = cN.m2988a(z2, true, 10, z6, false);
            if (!a.equals("")) {
                str2 = str2 + a + str;
            }
        }
        return C0654f.m1486a(str2, str);
    }

    /* renamed from: j */
    void m1827j() {
        Iterator it = this.f4185aC.iterator();
        while (it.hasNext()) {
            ((C0646v) it.next()).f4540h = true;
        }
    }

    /* renamed from: k */
    void m1826k() {
        Iterator it = this.f4185aC.iterator();
        while (it.hasNext()) {
            ((C0646v) it.next()).m1599b();
        }
        this.f4171ao = null;
        this.f4172ap = 0.0f;
    }

    /* renamed from: a */
    void m1861a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.f4106b.f5534bQ);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.f4106b.f5534bQ));
        this.f4186aD.m4136a(i6 - (i4 / 2), i7, i4, i5);
        this.f4105a.m1740a(this.f4186aD.f227a, this.f4186aD.f228b, this.f4186aD.f229c, this.f4186aD.f230d, "", Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4105a.f4350aw, false);
        this.f4127w.m4136a(this.f4186aD.f227a, this.f4186aD.f228b, this.f4186aD.f229c, this.f4186aD.f230d);
        Rect rect = this.f4127w;
        rect.f229c = (int) (rect.f229c * f);
        this.f4106b.f5514bw.mo134c(this.f4127w, paint);
        this.f4106b.f5514bw.mo158a(str, i6, i7 + ((this.f4105a.f4350aw.m4149k() + 5.0f) * 1.0f), this.f4105a.f4350aw);
        this.f4106b.f5514bw.mo158a(str2, i6, i7 + ((this.f4105a.f4350aw.m4149k() + 5.0f) * 2.0f), this.f4105a.f4350aw);
    }

    /* renamed from: l */
    void m1825l() {
        this.f4188aF.clear();
        this.f4188aF.add(new AbstractC0619b("Finish game") { // from class: com.corrodinggames.rts.gameFramework.d.a.1
            @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0619b
            /* renamed from: a */
            void mo1772a() {
                C0599a.this.f4106b.f5597db = true;
            }
        });
        this.f4188aF.add(new AbstractC0619b("Keep playing") { // from class: com.corrodinggames.rts.gameFramework.d.a.2
            @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0619b
            /* renamed from: a */
            void mo1772a() {
                C0599a.this.f4106b.f5594cY = true;
            }
        });
    }

    /* renamed from: e */
    void m1835e(float f) {
        String str;
        boolean z = false;
        if ((this.f4106b.f5593cX || this.f4106b.f5596da) && !this.f4106b.f5594cY) {
            z = true;
        }
        if (!this.f4106b.f5593cX) {
            this.f4189aG = false;
        } else if (!this.f4189aG) {
            this.f4189aG = true;
            if (!this.f4106b.f5452am && this.f4106b.f5516by.numberOfWins >= 5 && !this.f4106b.f5516by.rateGameShown && AbstractC0789l.f5455ap) {
                this.f4196aN = true;
                this.f4106b.f5516by.rateGameShown = true;
                this.f4106b.f5516by.save();
            }
        }
        if (!z) {
            this.f4190aH = 0.0f;
            this.f4192aJ = 0;
        }
        if (!z || this.f4106b.f5498bg >= 120 || this.f4106b.f5518bA.f4278c != null) {
        }
        if (z && !this.f4105a.f4291p) {
            this.f4190aH += f;
            if (this.f4106b.f5498bg < 120) {
                this.f4190aH = 100000.0f;
            }
            boolean z2 = this.f4190aH > 80.0f;
            boolean z3 = this.f4190aH > 100.0f;
            boolean z4 = this.f4190aH > 160.0f;
            if (this.f4192aJ == 0) {
                this.f4192aJ = 1;
            }
            int a = this.f4106b.m730a(210);
            this.f4127w.f227a = (int) ((this.f4106b.f5556cm / 2.0f) - (a / 2));
            this.f4127w.f229c = (int) ((this.f4106b.f5556cm / 2.0f) + (a / 2));
            int a2 = this.f4106b.m730a(30);
            int a3 = a2 + this.f4106b.m730a(30);
            int a4 = this.f4106b.m730a(40) + (a3 * this.f4188aF.size());
            float f2 = this.f4106b.f5540bW - (a4 / 2);
            if (f2 > 50.0f) {
                f2 /= 2.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.f4127w.f228b = (int) f2;
            this.f4127w.f230d = this.f4127w.f228b + a4;
            if (z2) {
                this.f4106b.f5514bw.mo172a(this.f4105a.f4384be, this.f4127w, (Paint) null);
                this.f4106b.f5514bw.mo142b(this.f4127w, this.f4105a.f4362aI);
            }
            Rect rect = new Rect(this.f4127w);
            int a5 = this.f4127w.f228b + this.f4106b.m730a(20);
            int a6 = this.f4106b.m730a(140);
            int i = (int) ((this.f4106b.f5556cm / 2.0f) - (a6 / 2));
            int a7 = Color.m4213a(140, 100, 100, 100);
            int i2 = i + (a6 / 2);
            Paint paint = this.f4121q;
            String str2 = "Victory!";
            if (this.f4106b.f5596da) {
                str2 = "Defeat";
            }
            float f3 = 1.0f;
            if (this.f4190aH < 95.0f) {
                f3 = this.f4190aH / 95.0f;
            }
            int i3 = (int) (a5 - (C0654f.m1421i(f3 * 90.0f) * 100.0f));
            paint.m4177a(str2, 0, str2.length(), this.f4130z);
            this.f4106b.f5514bw.mo158a(str2, i2, i3 - ((paint.m4148l() + paint.m4147m()) / 2.0f), paint);
            if (this.f4190aH < 100.0f && !this.f4106b.f5596da) {
                this.f4191aI += f;
                if (this.f4191aI > 0.5f) {
                    this.f4191aI = 0.0f;
                    this.f4106b.f5517bz.m1988b(EnumC0576h.critical);
                    this.f4106b.f5517bz.m1996b();
                    C0573e b = this.f4106b.f5517bz.m1990b(0.0f, 0.0f, 0.0f, Color.m4213a(255, C0654f.m1514a(0, 255), C0654f.m1514a(0, 255), C0654f.m1514a(0, 255)));
                    if (b != null) {
                        b.f3841o = true;
                        b.f3862J = i2 + C0654f.m1458c(-70.0f, 70.0f);
                        b.f3863K = i3 + C0654f.m1458c(-15.0f, 15.0f);
                        b.f3863K += this.f4106b.f5540bW / 2.0f;
                        b.f3864L += this.f4106b.f5540bW / 2.0f;
                        b.f3875W = C0654f.m1458c(140.0f, 380.0f);
                        b.f3876X = b.f3875W;
                        b.f3845s = true;
                        b.f3846t = true;
                        b.f3847u = 5.0f;
                        b.f3858F = 2.0f;
                        b.f3870R = C0654f.m1458c(-2.7f, 2.7f);
                        b.f3869Q = C0654f.m1458c(-12.7f, 12.7f);
                        b.f3860H = 0.4f;
                        b.f3859G = 0.2f;
                        b.f3871S = C0654f.m1458c(2.0f, 4.0f);
                        b.f3850x = 2.0f;
                        b.f3849w = true;
                    }
                }
            }
            int c = a5 + this.f4130z.m4130c();
            int i4 = rect.f230d + 30;
            this.f4123s.m4177a("123|", 0, "123|".length(), this.f4130z);
            float c2 = this.f4130z.m4130c() + 6;
            float f4 = 1.5f;
            Iterator it = this.f4199aQ.iterator();
            while (it.hasNext()) {
                C0622e eVar = (C0622e) it.next();
                if (z4) {
                    if (eVar.f4275d != 1.0f && f4 > 0.0f) {
                        eVar.f4275d = C0654f.m1521a(eVar.f4275d, 1.0f, 0.01f * f4 * f);
                        f4 -= 1.0f - eVar.f4275d;
                    }
                    float b2 = C0654f.m1475b(eVar.f4275d, 0.0f, 1.0f);
                    if (eVar.f4273b != null) {
                        str = eVar.f4273b;
                    } else {
                        str = "" + ((int) (eVar.f4274c * b2));
                        if (b2 <= 0.0f) {
                            str = " ";
                        }
                    }
                    String str3 = eVar.f4272a;
                    float b3 = C0654f.m1475b(eVar.f4275d * 2.2f, 0.0f, 1.0f);
                    int i5 = 0;
                    if (b3 > 0.0f) {
                        i5 = (int) (str3.length() * b3);
                    }
                    int b4 = C0654f.m1471b(i5, 0, str3.length());
                    String str4 = "";
                    if (b4 > 0 && b4 < str3.length() - 1) {
                        str4 = "_";
                    }
                    this.f4106b.f5514bw.mo158a(str3.substring(0, b4) + str4 + C0654f.m1443d(" ", (str3.length() + str4.length()) - b4), i2 - (8.0f * this.f4123s.m4149k()), i4, this.f4123s);
                    this.f4106b.f5514bw.mo158a(str, i2 + (8.0f * this.f4123s.m4149k()), i4, this.f4124t);
                    i4 = (int) (i4 + c2);
                }
            }
            for (int i6 = 0; i6 < this.f4188aF.size(); i6++) {
                if (z3) {
                    AbstractC0619b bVar = (AbstractC0619b) this.f4188aF.get(i6);
                    if (this.f4105a.m1738a(i, c, a6, a2, bVar.m1771b(), EnumC0624g.none, false, a7, this.f4105a.f4351ax)) {
                        this.f4196aN = false;
                        bVar.mo1772a();
                    }
                }
                c += a3;
            }
            if (this.f4196aN) {
                m1832f(f);
            }
        }
    }

    /* renamed from: f */
    void m1832f(float f) {
        int a = this.f4106b.m730a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((this.f4106b.f5556cm / 2.0f) - (a / 2));
        int a2 = this.f4106b.m730a(120);
        int i2 = (int) (this.f4106b.f5558co - a2);
        this.f4127w.m4136a(i, i2, a, a2);
        this.f4106b.f5514bw.mo142b(this.f4127w, this.f4105a.f4362aI);
        int i3 = i + (a / 2);
        Paint paint = this.f4121q;
        String str = f4193aK;
        paint.m4177a(str, 0, str.length(), this.f4130z);
        this.f4106b.f5514bw.mo158a(str, i3, i2 - ((paint.m4148l() + paint.m4147m()) / 2.0f), paint);
        int c = i2 + this.f4130z.m4130c();
        int a3 = this.f4106b.m730a(70);
        int a4 = this.f4106b.m730a(30);
        int a5 = ((i + (a / 2)) - this.f4106b.m730a(10)) - a3;
        int a6 = Color.m4213a(140, 100, 100, 100);
        if (this.f4105a.m1738a(a5, c, a3, a4, f4194aL, EnumC0624g.none, false, a6, this.f4105a.f4351ax)) {
            this.f4196aN = false;
            AbstractC0068d dVar = this.f4106b.f5449aj;
            if (dVar == null) {
                AbstractC0789l.m682b("showRateNow: gameView==null");
                return;
            }
            ActivityC0069e k = dVar.mo211k();
            if (k == null) {
                AbstractC0789l.m682b("showRateNow: inGameActivity==null");
                return;
            }
            k.m3943j();
        }
        if (this.f4105a.m1738a(i + (a / 2) + this.f4106b.m730a(10), c, a3, a4, f4195aM, EnumC0624g.none, false, a6, this.f4105a.f4351ax)) {
            this.f4196aN = false;
        }
    }

    /* renamed from: a */
    void m1863a(float f, boolean z) {
        int i;
        int i2;
        float f2 = this.f4106b.f5534bQ * 0.7f;
        if (AbstractC0789l.m698ak() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int l = (int) (this.f4154X.mo349l() * f2);
        int i3 = 4 + (l / 2);
        int i4 = 4 + (l / 2);
        if (this.f4106b.m661g(111)) {
            boolean z2 = false;
            if (!this.f4105a.f4291p) {
                z2 = this.f4105a.m1669k();
            }
            if (!z2) {
                this.f4105a.f4291p = !this.f4105a.f4291p;
            }
        }
        if (this.f4105a.f4291p) {
            this.f4187aE += 0.008f * f;
            if (this.f4187aE > 1.0f) {
                this.f4187aE = 0.0f;
            }
            this.f4112h.m4164c(150 + ((int) (100.0f * C0654f.m1425h(this.f4187aE * 180.0f))));
        } else {
            this.f4187aE = 0.0f;
            this.f4112h.m4164c(80);
        }
        this.f4130z.m4136a(i3, i4, i3 + l, i4 + l);
        this.f4130z.m4137a(-(l / 2), -(l / 2));
        if (z) {
            this.f4106b.f5514bw.mo174a(this.f4154X, this.f4130z.f227a, this.f4130z.f228b, this.f4112h, 0.0f, f2);
        }
        if (AbstractC0789l.m698ak()) {
            C0654f.m1506a(this.f4130z, 4.0f);
        }
        if (this.f4105a.f4316O && !this.f4105a.f4315N && this.f4130z.m4133b((int) this.f4105a.f4294s, (int) this.f4105a.f4295t)) {
            this.f4105a.f4316O = false;
            this.f4105a.f4291p = !this.f4105a.f4291p;
        }
        if (this.f4106b.f5527bJ.m1940h()) {
            this.f4112h.m4164c(80);
            if (this.f4106b.f5527bJ.f3965t != 1) {
                this.f4112h.m4164c(200);
            }
            int i5 = (int) (this.f4156Z.f5246l * this.f4106b.f5534bQ * 1.6f);
            int i6 = (int) (this.f4106b.f5556cm / 2.0f);
            int k = 7 + ((int) this.f4105a.f4352ay.m4149k());
            this.f4106b.f5514bw.mo158a(C0654f.m1510a(this.f4106b.f5499bh / 1000), i6, k, this.f4105a.f4352ay);
            int i7 = k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f4130z.m4136a(i8, i7, i8 + i5, i7 + i5);
            this.f4130z.m4137a((-this.f4130z.m4134b()) / 2, (-this.f4130z.m4130c()) / 2);
            if (z) {
                this.f4106b.f5514bw.mo174a(this.f4156Z, this.f4130z.f227a, this.f4130z.f228b, this.f4112h, 0.0f, i5 / i);
            }
            if (this.f4105a.f4316O && !this.f4105a.f4315N && this.f4130z.m4133b((int) this.f4105a.f4294s, (int) this.f4105a.f4295t)) {
                this.f4105a.f4316O = false;
                this.f4106b.f5527bJ.m1950b();
            }
            if (this.f4106b.f5494bc != 1.0f && z) {
                this.f4106b.f5514bw.mo158a("x" + this.f4106b.f5494bc, this.f4130z.m4129d() + (i5 / 2), this.f4130z.m4128e(), this.f4105a.f4350aw);
            }
            C0748e eVar = this.f4155Y;
            int i9 = (int) (eVar.f5246l * this.f4106b.f5534bQ * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f4130z.m4136a(i10, i7, i10 + i9, i7 + i9);
            this.f4130z.m4137a((-this.f4130z.m4134b()) / 2, (-this.f4130z.m4130c()) / 2);
            if (z) {
                this.f4106b.f5514bw.mo174a(eVar, this.f4130z.f227a, this.f4130z.f228b, this.f4112h, 0.0f, i9 / i2);
            }
            if (this.f4105a.f4316O && !this.f4105a.f4315N && this.f4130z.m4133b((int) this.f4105a.f4294s, (int) this.f4105a.f4295t)) {
                this.f4105a.f4316O = false;
                this.f4106b.f5527bJ.m1963a();
            }
        }
        if (this.f4105a.f4291p) {
            this.f4106b.f5571cB = false;
            int a = this.f4106b.m730a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            this.f4127w.f227a = (int) ((this.f4106b.f5556cm / 2.0f) - (a / 2));
            this.f4127w.f229c = (int) ((this.f4106b.f5556cm / 2.0f) + (a / 2));
            int a2 = this.f4106b.m730a(30);
            int a3 = a2 + this.f4106b.m730a(15);
            Menu o = m1822o();
            int a4 = this.f4106b.m730a(40) + (a3 * (1 + o.size()));
            this.f4127w.f228b = (int) (this.f4106b.f5540bW - (a4 / 2));
            this.f4127w.f230d = (int) (this.f4106b.f5540bW + (a4 / 2));
            if (z) {
                this.f4106b.f5514bw.mo172a(this.f4105a.f4384be, this.f4127w, (Paint) null);
                this.f4106b.f5514bw.mo142b(this.f4127w, this.f4105a.f4362aI);
            }
            int a5 = this.f4127w.f228b + this.f4106b.m730a(40);
            int a6 = this.f4106b.m730a(140);
            int i11 = (int) ((this.f4106b.f5556cm / 2.0f) - (a6 / 2));
            int a7 = Color.m4213a(140, 100, 100, 100);
            if (this.f4105a.m1738a(i11, a5, a6, a2, C0652a.m1536a("menus.ingame.resume", new Object[0]), EnumC0624g.none, false, a7, this.f4105a.f4351ax)) {
                this.f4105a.f4316O = false;
                this.f4105a.f4368aO = 40.0f;
                this.f4105a.f4291p = false;
            }
            int i12 = a5 + a3;
            for (int i13 = 0; i13 < o.size(); i13++) {
                MenuItem item = o.getItem(i13);
                if (this.f4105a.m1738a(i11, i12, a6, a2, item.getTitle().toString(), EnumC0624g.none, false, a7, this.f4105a.f4351ax)) {
                    m1862a(item.getItemId());
                    this.f4105a.f4316O = false;
                    this.f4105a.f4368aO = 40.0f;
                }
                i12 += a3;
            }
        }
    }

    /* renamed from: m */
    public void m1824m() {
        m1862a(20);
    }

    /* renamed from: n */
    public void m1823n() {
        m1862a(16);
    }

    /* renamed from: a */
    void m1862a(int i) {
        AbstractC0068d dVar = this.f4106b.f5449aj;
        if (dVar == null) {
            AbstractC0789l.m682b("selectMenuOption: gameView==null");
            return;
        }
        ActivityC0069e k = dVar.mo211k();
        if (k == null) {
            AbstractC0789l.m682b("selectMenuOption: inGameActivity==null");
        } else {
            k.mo111c(i);
        }
    }

    /* renamed from: o */
    Menu m1822o() {
        this.f4198aP.clear();
        AbstractC0068d dVar = this.f4106b.f5449aj;
        if (dVar == null) {
            AbstractC0789l.m682b("selectMenuOption: gameView==null");
            return this.f4198aP;
        }
        ActivityC0069e k = dVar.mo211k();
        if (k == null) {
            AbstractC0789l.m682b("selectMenuOption: inGameActivity==null");
            return this.f4198aP;
        }
        k.mo3951a(this.f4198aP);
        return this.f4198aP;
    }

    /* renamed from: g */
    void m1830g(float f) {
        String str;
        int i = (int) (this.f4106b.f5558co - (30.0f * this.f4106b.f5534bQ));
        int i2 = (int) ((this.f4106b.f5536bS - this.f4106b.f5541bX) + 10.0f);
        int i3 = ((int) (this.f4106b.f5541bX - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f4185aC.size(); i5++) {
            C0646v vVar = (C0646v) this.f4185aC.get(i5);
            if (vVar.f4540h) {
                vVar.m1596e();
                vVar.f4540h = false;
            }
            vVar.m1597d();
            if (this.f4106b.f5516by.keyboardSupport && i5 < this.f4106b.f5519bB.f3667ah.length) {
                if (this.f4106b.f5519bB.f3669aj[i5].m2080a()) {
                    vVar.m1599b();
                    vVar.m1598c();
                }
                if (this.f4106b.f5519bB.f3668ai[i5].m2080a()) {
                    this.f4105a.m1669k();
                    vVar.m1601a();
                }
                if (this.f4106b.f5519bB.f3667ah[i5].m2080a()) {
                    this.f4105a.m1669k();
                    this.f4105a.m1649w();
                    vVar.m1601a();
                }
            }
            if (this.f4106b.f5516by.showUnitGroups && i5 < 3) {
                if (vVar.f4533a.size() != 0) {
                    str = "" + vVar.f4533a.size();
                } else if (this.f4105a.f4402bv) {
                    str = "Empty";
                } else {
                    str = "(" + (i5 + 1) + ")";
                }
                boolean z = false;
                vVar.f4536d = C0654f.m1522a(vVar.f4536d, 0.01f * f);
                vVar.f4537e = C0654f.m1522a(vVar.f4537e, 0.01f * f);
                vVar.f4538f = C0654f.m1522a(vVar.f4538f, 0.01f * f);
                if (this.f4105a.m1739a(i2, i, i4, (int) (31.0f * this.f4106b.f5534bQ), str, EnumC0624g.none, true, Color.m4213a(50, (int) (100.0f + (vVar.f4538f * 100.0f)), (int) (100.0f + (vVar.f4537e * 100.0f)), (int) (100.0f + (vVar.f4536d * 100.0f)))) && this.f4105a.f4324W == null && !this.f4105a.f4315N) {
                    z = true;
                    vVar.f4534b += f;
                    this.f4105a.m1685d();
                    float f2 = 1.0f;
                    this.f4113i.m4193a();
                    this.f4113i.m4169b(Color.m4213a(120, 200, 0, 0));
                    if (vVar.f4534b < 50.0f) {
                        f2 = vVar.f4534b / 50.0f;
                        this.f4113i.m4169b(Color.m4213a((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m1861a(i2, i, i4, "Select Group", "(Hold for more..)", this.f4113i, f2);
                    } else if (vVar.f4534b < 100.0f) {
                        f2 = (vVar.f4534b - 50.0f) / 50.0f;
                        this.f4113i.m4169b(Color.m4213a((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m1861a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f4113i, f2);
                    } else {
                        m1861a(i2, i, i4, "Replace Group", "", this.f4113i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.f4106b.f5534bQ);
                    this.f4127w.m4136a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.f4106b.f5514bw.mo142b(this.f4127w, this.f4113i);
                }
                if (!z) {
                    if (vVar.f4534b != 0.0f && !this.f4105a.f4305D) {
                        if (vVar.f4534b > 100.0f) {
                            vVar.m1599b();
                            vVar.m1598c();
                            vVar.f4538f = 1.0f;
                        } else if (vVar.f4534b > 50.0f) {
                            vVar.m1598c();
                            this.f4105a.m1669k();
                            this.f4105a.m1649w();
                            vVar.m1601a();
                            vVar.f4537e = 1.0f;
                        } else if (vVar.f4533a.size() != 0) {
                            this.f4105a.m1669k();
                            this.f4105a.m1649w();
                            vVar.m1601a();
                            vVar.f4536d = 1.0f;
                        } else {
                            vVar.m1599b();
                            vVar.m1598c();
                            vVar.f4537e = 1.0f;
                        }
                    }
                    if (!z) {
                        vVar.f4534b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f4185aC.size());
        Iterator it = this.f4185aC.iterator();
        while (it.hasNext()) {
            ((C0646v) it.next()).mo400a(apVar);
        }
        apVar.mo1130c(0);
    }

    /* renamed from: a */
    public void m1850a(C0707k kVar, boolean z) {
        if (!z) {
            this.f4185aC.clear();
        }
        int f = kVar.m1062f();
        int i = 0;
        while (i < f) {
            C0646v vVar = new C0646v(this, i < 3);
            vVar.m1600a(kVar);
            if (!z) {
                this.f4185aC.add(vVar);
            }
            i++;
        }
        kVar.m1065d();
    }

    /* renamed from: p */
    public void m1821p() {
        this.f4199aQ = C0622e.m1763a();
    }

    /* renamed from: q */
    public void m1820q() {
        this.f4199aQ = C0622e.m1763a();
    }
}
