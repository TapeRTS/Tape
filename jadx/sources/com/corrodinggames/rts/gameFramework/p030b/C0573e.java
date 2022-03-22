package com.corrodinggames.rts.gameFramework.p030b;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0308ad;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.gameFramework.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/e.class */
public final class C0573e {

    /* renamed from: ax */
    private final C0571c f3826ax;

    /* renamed from: b */
    public AbstractC0854w f3828b;

    /* renamed from: c */
    public boolean f3829c;

    /* renamed from: d */
    public boolean f3830d;

    /* renamed from: g */
    public int f3833g;

    /* renamed from: o */
    public boolean f3841o;

    /* renamed from: p */
    public boolean f3842p;

    /* renamed from: q */
    public boolean f3843q;

    /* renamed from: s */
    public boolean f3845s;

    /* renamed from: t */
    public boolean f3846t;

    /* renamed from: u */
    public float f3847u;

    /* renamed from: v */
    public boolean f3848v;

    /* renamed from: w */
    public boolean f3849w;

    /* renamed from: y */
    public int f3851y;

    /* renamed from: z */
    public int f3852z;

    /* renamed from: B */
    public short f3854B;

    /* renamed from: F */
    public float f3858F;

    /* renamed from: G */
    public float f3859G;

    /* renamed from: H */
    public float f3860H;

    /* renamed from: I */
    public boolean f3861I;

    /* renamed from: J */
    public float f3862J;

    /* renamed from: K */
    public float f3863K;

    /* renamed from: L */
    public float f3864L;

    /* renamed from: M */
    public boolean f3865M;

    /* renamed from: N */
    public float f3866N;

    /* renamed from: O */
    public float f3867O;

    /* renamed from: P */
    public float f3868P;

    /* renamed from: Q */
    public float f3869Q;

    /* renamed from: R */
    public float f3870R;

    /* renamed from: S */
    public float f3871S;

    /* renamed from: T */
    public float f3872T;

    /* renamed from: U */
    public float f3873U;

    /* renamed from: V */
    public float f3874V;

    /* renamed from: W */
    public float f3875W;

    /* renamed from: X */
    public float f3876X;

    /* renamed from: Y */
    public float f3877Y;

    /* renamed from: Z */
    public float f3878Z;

    /* renamed from: aa */
    public String f3879aa;

    /* renamed from: ab */
    public Paint f3880ab;

    /* renamed from: ac */
    public float f3881ac;

    /* renamed from: ad */
    public float f3882ad;

    /* renamed from: ae */
    public boolean f3883ae;

    /* renamed from: af */
    public int f3884af;

    /* renamed from: ag */
    public int f3885ag;

    /* renamed from: ah */
    public boolean f3886ah;

    /* renamed from: ai */
    public boolean f3887ai;

    /* renamed from: aj */
    public float f3888aj;

    /* renamed from: ak */
    public float f3889ak;

    /* renamed from: al */
    public boolean f3890al;

    /* renamed from: ao */
    public int f3893ao;

    /* renamed from: ap */
    public int f3894ap;

    /* renamed from: at */
    public float f3898at;

    /* renamed from: au */
    public int f3899au;

    /* renamed from: av */
    public boolean f3900av;

    /* renamed from: h */
    public static int f3834h = 1;

    /* renamed from: i */
    public static int f3835i = 2;

    /* renamed from: j */
    public static int f3836j = 3;

    /* renamed from: k */
    public static int f3837k = 4;

    /* renamed from: l */
    public static int f3838l = 5;

    /* renamed from: m */
    public static int f3839m = 6;

    /* renamed from: n */
    public static int f3840n = 7;

    /* renamed from: D */
    public static LightingColorFilter f3856D = null;

    /* renamed from: E */
    public static int f3857E = 0;

    /* renamed from: aw */
    public static C0760q[] f3901aw = new C0760q[128];

    /* renamed from: a */
    public C0308ad f3827a = C0308ad.defaultEffectTemplate;

    /* renamed from: e */
    public boolean f3831e = true;

    /* renamed from: f */
    public boolean f3832f = false;

    /* renamed from: r */
    public EnumC0576h f3844r = EnumC0576h.verylow;

    /* renamed from: x */
    public float f3850x = 1.0f;

    /* renamed from: A */
    public float f3853A = -1.0f;

    /* renamed from: C */
    public LightingColorFilter f3855C = null;

    /* renamed from: am */
    public boolean f3891am = false;

    /* renamed from: an */
    public float f3892an = 0.0f;

    /* renamed from: aq */
    public short f3895aq = 2;

    /* renamed from: ar */
    public boolean f3896ar = false;

    /* renamed from: as */
    public Paint f3897as = m1980a();

    protected C0573e(C0571c cVar) {
        this.f3826ax = cVar;
    }

    static {
        for (int i = 0; i < f3901aw.length; i++) {
            f3901aw[i] = m1980a();
            f3901aw[i].m4164c((int) ((i / (f3901aw.length - 1)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static C0760q m1980a() {
        return C0851y.m416b();
    }

    /* renamed from: a */
    public C0760q m1979a(float f) {
        int length = (int) (f * (f3901aw.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > f3901aw.length - 1) {
            length = f3901aw.length - 1;
        }
        return f3901aw[length];
    }

    /* renamed from: b */
    public void m1976b() {
        if (this.f3842p) {
            this.f3842p = false;
            this.f3826ax.f3797a--;
            C0571c.f3804h = true;
            if (this.f3827a.alsoEmitEffectsOnDeath != null && this.f3854B < 20) {
                float f = this.f3862J;
                float f2 = this.f3863K;
                float f3 = this.f3864L;
                if (this.f3828b != null) {
                    f += this.f3828b.f5842dH;
                    f2 += this.f3828b.f5843dI;
                    f3 += this.f3828b.f5844dJ;
                }
                this.f3827a.alsoEmitEffectsOnDeath.m2710a(f, f2, f3, this.f3877Y, this.f3828b, 0, this.f3854B);
            }
        }
    }

    /* renamed from: c */
    public void m1974c() {
        this.f3827a = C0308ad.defaultEffectTemplate;
        this.f3844r = EnumC0576h.verylow;
        this.f3828b = null;
        this.f3829c = false;
        this.f3830d = false;
        this.f3831e = true;
        this.f3832f = false;
        this.f3833g = 0;
        this.f3841o = false;
        this.f3843q = false;
        this.f3862J = 0.0f;
        this.f3863K = 0.0f;
        this.f3865M = false;
        this.f3866N = 0.0f;
        this.f3867O = 0.0f;
        this.f3868P = 0.0f;
        this.f3864L = 0.0f;
        this.f3895aq = (short) 2;
        this.f3891am = false;
        this.f3892an = 0.0f;
        this.f3883ae = false;
        this.f3889ak = 0.0f;
        this.f3888aj = 0.0f;
        this.f3885ag = 0;
        this.f3886ah = false;
        this.f3887ai = false;
        this.f3890al = false;
        this.f3893ao = 0;
        this.f3894ap = 0;
        this.f3874V = 0.0f;
        this.f3875W = 15.0f;
        this.f3876X = this.f3875W;
        this.f3845s = false;
        this.f3846t = false;
        this.f3847u = 0.0f;
        this.f3859G = 1.0f;
        this.f3860H = 1.0f;
        this.f3861I = false;
        this.f3848v = false;
        this.f3849w = false;
        this.f3850x = 1.0f;
        this.f3858F = 1.0f;
        this.f3877Y = 0.0f;
        this.f3878Z = 0.0f;
        this.f3869Q = 0.0f;
        this.f3870R = 0.0f;
        this.f3871S = 0.0f;
        this.f3872T = 0.0f;
        this.f3873U = 0.0f;
        this.f3879aa = null;
        this.f3880ab = null;
        this.f3881ac = 0.0f;
        this.f3882ad = 0.0f;
        this.f3854B = (short) 0;
        this.f3851y = -1;
        this.f3855C = null;
        this.f3852z = -1;
        this.f3853A = -1.0f;
        this.f3897as.m4187a((ColorFilter) null);
        this.f3900av = false;
        this.f3896ar = false;
    }

    /* renamed from: a */
    public void m1978a(C0573e eVar) {
        this.f3827a = eVar.f3827a;
        this.f3844r = eVar.f3844r;
        this.f3833g = eVar.f3833g;
        this.f3828b = eVar.f3828b;
        this.f3829c = eVar.f3829c;
        this.f3830d = eVar.f3830d;
        this.f3831e = eVar.f3831e;
        this.f3841o = eVar.f3841o;
        this.f3843q = eVar.f3843q;
        this.f3862J = eVar.f3862J;
        this.f3863K = eVar.f3863K;
        this.f3865M = eVar.f3865M;
        this.f3866N = eVar.f3866N;
        this.f3867O = eVar.f3867O;
        this.f3868P = eVar.f3868P;
        this.f3864L = eVar.f3864L;
        this.f3895aq = eVar.f3895aq;
        this.f3891am = eVar.f3891am;
        this.f3892an = eVar.f3892an;
        this.f3883ae = eVar.f3883ae;
        this.f3889ak = eVar.f3889ak;
        this.f3888aj = eVar.f3888aj;
        this.f3885ag = eVar.f3885ag;
        this.f3886ah = eVar.f3886ah;
        this.f3887ai = eVar.f3887ai;
        this.f3890al = eVar.f3886ah;
        this.f3893ao = eVar.f3893ao;
        this.f3894ap = eVar.f3894ap;
        this.f3874V = eVar.f3874V;
        this.f3875W = eVar.f3875W;
        this.f3876X = eVar.f3876X;
        this.f3845s = eVar.f3845s;
        this.f3846t = eVar.f3846t;
        this.f3847u = eVar.f3847u;
        this.f3859G = eVar.f3859G;
        this.f3860H = eVar.f3860H;
        this.f3861I = eVar.f3861I;
        this.f3848v = eVar.f3848v;
        this.f3849w = eVar.f3849w;
        this.f3850x = eVar.f3850x;
        this.f3858F = eVar.f3858F;
        this.f3877Y = eVar.f3877Y;
        this.f3878Z = eVar.f3878Z;
        this.f3869Q = eVar.f3869Q;
        this.f3870R = eVar.f3870R;
        this.f3871S = eVar.f3871S;
        this.f3872T = eVar.f3872T;
        this.f3873U = eVar.f3873U;
        this.f3879aa = eVar.f3879aa;
        this.f3880ab = eVar.f3880ab;
        this.f3881ac = eVar.f3881ac;
        this.f3882ad = eVar.f3882ad;
        this.f3854B = eVar.f3854B;
        this.f3851y = eVar.f3851y;
        this.f3852z = eVar.f3852z;
        this.f3853A = eVar.f3853A;
        this.f3855C = eVar.f3855C;
        this.f3896ar = eVar.f3896ar;
    }

    /* renamed from: b */
    public void m1975b(float f) {
        this.f3874V = C0654f.m1522a(this.f3874V, f);
        if (this.f3874V <= 0.0f) {
            this.f3875W -= f;
            if (this.f3828b != null && this.f3828b.f5837dC && !this.f3827a.liveAfterAttachedDies) {
                this.f3875W = -1.0f;
            }
            if (this.f3875W < 0.0f) {
                m1976b();
                return;
            }
            if (this.f3883ae) {
                if (this.f3890al) {
                    this.f3889ak -= this.f3888aj * f;
                } else {
                    this.f3889ak += this.f3888aj * f;
                }
                if (this.f3886ah) {
                    if (!this.f3890al) {
                        if (this.f3889ak >= this.f3885ag + 1) {
                            this.f3890al = true;
                            this.f3889ak = this.f3885ag;
                        }
                    } else if (this.f3889ak < this.f3884af) {
                        if (!this.f3887ai) {
                            m1976b();
                            return;
                        } else {
                            this.f3890al = false;
                            this.f3889ak = this.f3884af;
                        }
                    }
                } else if (this.f3889ak >= this.f3885ag + 1) {
                    if (!this.f3887ai) {
                        m1976b();
                        return;
                    }
                    this.f3889ak = this.f3884af;
                }
                this.f3893ao = (int) this.f3889ak;
            }
            if (this.f3848v) {
                this.f3871S -= (this.f3871S * 0.002f) * f;
                this.f3869Q -= f * 0.0015f;
            }
            if (this.f3849w) {
                if (this.f3864L > 0.0f) {
                    this.f3871S -= (0.1f * this.f3850x) * f;
                } else {
                    if (this.f3871S < 0.0f) {
                        this.f3871S = -this.f3871S;
                        this.f3871S *= 0.5f;
                        this.f3871S = C0654f.m1522a(this.f3871S, 1.3f);
                    }
                    if (this.f3864L < 0.0f) {
                        this.f3864L = 0.0f;
                    }
                    if (this.f3871S < 0.2d) {
                        this.f3895aq = (short) 1;
                    }
                    this.f3869Q = C0654f.m1522a(this.f3869Q, 0.15f * f);
                    this.f3870R = C0654f.m1522a(this.f3870R, 0.15f * f);
                    this.f3878Z = C0654f.m1522a(this.f3878Z, 1.0f * f);
                }
            }
            this.f3862J += this.f3869Q * f;
            this.f3863K += this.f3870R * f;
            this.f3864L += this.f3871S * f;
            this.f3877Y += this.f3878Z * f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v92, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m1977a(AbstractC0789l lVar, boolean z) {
        C0575g gVar;
        PointF pointF;
        float f;
        C0760q qVar;
        Rect rect = C0571c.f3808l;
        RectF rectF = C0571c.f3807k;
        if (this.f3874V <= 0.0f) {
            if (!z || this.f3864L >= 1.0f) {
                if (this.f3827a.imageStrip != null) {
                    gVar = this.f3827a.imageStrip;
                } else {
                    gVar = C0571c.f3810n[this.f3894ap];
                }
                if (!gVar.f3936k) {
                    int i = this.f3893ao;
                    int i2 = 0;
                    if (i >= gVar.f3933h) {
                        i2 = 0 + (i / gVar.f3933h);
                        i %= gVar.f3933h;
                    }
                    int i3 = gVar.f3929d + (i * gVar.f3931f);
                    int i4 = gVar.f3930e + (i2 * gVar.f3932g);
                    rect.m4136a(i3, i4, i3 + gVar.f3927b, i4 + gVar.f3928c);
                } else {
                    rect.m4136a(0, 0, gVar.f3934i.mo349l(), gVar.f3934i.mo350k());
                }
                if (!z) {
                    pointF = C0654f.m1447d(this.f3862J, this.f3863K, this.f3864L);
                } else {
                    pointF = C0654f.m1447d(this.f3862J, this.f3863K, 0.0f);
                }
                float f2 = 1.0f;
                if (!(this.f3860H == 1.0f && this.f3859G == 1.0f && !this.f3861I)) {
                    f2 = C0654f.m1433f(this.f3860H, this.f3859G, 1.0f - (this.f3875W / this.f3876X));
                    if (this.f3861I && !this.f3841o) {
                        f2 = f2 * (1.0f / lVar.f5574cE) * lVar.f5534bQ;
                    }
                }
                rectF.m4122a(pointF.f224a, pointF.f225b, pointF.f224a + rect.m4134b(), pointF.f225b + rect.m4130c());
                if (this.f3891am) {
                    rectF.m4123a((-rectF.m4117b()) / 2.0f, (-rectF.m4113c()) / 2.0f);
                }
                if (this.f3892an != 0.0f) {
                    rectF.m4123a(0.0f, rectF.m4113c() * this.f3892an * f2);
                }
                if (this.f3828b != null) {
                    if (z) {
                        rectF.m4123a(this.f3828b.f5842dH, this.f3828b.f5843dI);
                    } else if (!this.f3829c) {
                        rectF.m4123a(this.f3828b.f5842dH, this.f3828b.f5843dI - this.f3828b.f5844dJ);
                    } else {
                        rectF.m4123a(this.f3828b.f5842dH, this.f3828b.f5843dI);
                    }
                }
                if ((this.f3841o && !this.f3865M) || C0654f.m1505a(lVar.f5564cu, rectF)) {
                    if (!this.f3831e && !this.f3841o && !this.f3832f) {
                        if (lVar.f5511bt.m3701a(rectF.m4111d(), rectF.m4110e(), lVar.f5493bb)) {
                            this.f3832f = true;
                        } else {
                            return;
                        }
                    }
                    if (!this.f3841o) {
                        rectF.m4123a(-lVar.f5547cd, -lVar.f5548ce);
                    }
                    if (this.f3872T != 0.0f) {
                        rectF.m4123a(0.0f, C0654f.m1425h(((this.f3876X - this.f3875W) / this.f3873U) * 360.0f) * this.f3872T);
                    }
                    float f3 = this.f3876X - this.f3875W;
                    float f4 = 1.0f;
                    float f5 = 1.0f;
                    float f6 = 1.0f;
                    float f7 = 1.0f;
                    boolean z2 = false;
                    if (this.f3851y != -1) {
                        f4 = Color.m4215a(this.f3851y) * 0.003921569f;
                        int b = Color.m4211b(this.f3851y);
                        int c = Color.m4210c(this.f3851y);
                        int d = Color.m4209d(this.f3851y);
                        if (!(b == 255 && c == 255 && d == 255)) {
                            z2 = true;
                            f5 = b * 0.003921569f;
                            f6 = c * 0.003921569f;
                            f7 = d * 0.003921569f;
                        }
                    }
                    if (this.f3853A >= 0.0f) {
                        float a = Color.m4215a(this.f3852z) * 0.003921569f;
                        float b2 = Color.m4211b(this.f3852z) * 0.003921569f;
                        float c2 = Color.m4210c(this.f3852z) * 0.003921569f;
                        float d2 = Color.m4209d(this.f3852z) * 0.003921569f;
                        if (this.f3853A <= f3) {
                            f4 = a;
                            z2 = true;
                            f5 = b2;
                            f6 = c2;
                            f7 = d2;
                        } else {
                            float f8 = f3 / this.f3853A;
                            float f9 = 1.0f - f8;
                            f4 = (f4 * f9) + (a * f8);
                            z2 = true;
                            f5 = (f5 * f9) + (b2 * f8);
                            f6 = (f6 * f9) + (c2 * f8);
                            f7 = (f7 * f9) + (d2 * f8);
                        }
                    }
                    if (this.f3845s && f3 >= this.f3847u) {
                        f = f4 * ((this.f3875W - this.f3847u) / this.f3876X) * this.f3858F;
                    } else if (!this.f3846t || f3 >= this.f3847u) {
                        f = f4 * this.f3858F;
                    } else {
                        f = f4 * (f3 / this.f3847u) * this.f3858F;
                    }
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    boolean z3 = false;
                    AbstractC0755l lVar2 = lVar.f5514bw;
                    if (this.f3877Y != 0.0f) {
                        if (0 == 0) {
                            z3 = true;
                            lVar2.mo125j();
                        }
                        lVar2.mo199a(this.f3877Y + 90.0f, rectF.m4111d(), rectF.m4110e());
                    }
                    if (f2 != 1.0f) {
                        if (!z3) {
                            z3 = true;
                            lVar2.mo125j();
                        }
                        lVar2.mo198a(f2, f2, rectF.m4111d(), rectF.m4110e());
                    }
                    if (z) {
                        f = C0654f.m1475b(f / 3.0f, 0.0f, 1.0f);
                        f5 = 0.0f;
                        f6 = 0.0f;
                        f7 = 0.0f;
                        z2 = true;
                    }
                    if (z2 && AbstractC0789l.m699aj() && !z && this.f3855C == null) {
                        int b3 = C0654f.m1470b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
                        if (f3856D == null || f3857E != b3) {
                            f3856D = new LightingColorFilter(b3, 0);
                            f3857E = b3;
                            this.f3855C = f3856D;
                        } else {
                            this.f3855C = f3856D;
                        }
                    }
                    LightingColorFilter lightingColorFilter = this.f3855C;
                    if (lightingColorFilter != null) {
                        if (!this.f3900av) {
                            this.f3897as.m4187a(lightingColorFilter);
                            this.f3900av = true;
                        }
                        z2 = true;
                    } else if (this.f3900av) {
                        this.f3897as.m4187a((ColorFilter) null);
                        this.f3900av = false;
                    }
                    if (!z2) {
                        qVar = m1979a(f);
                    } else {
                        qVar = this.f3897as;
                        int b4 = C0654f.m1470b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
                        float f10 = this.f3898at - f;
                        if (f10 < -0.01f || f10 > 0.01f || this.f3899au != b4) {
                            this.f3898at = f;
                            this.f3899au = b4;
                            this.f3897as.m4169b(C0654f.m1470b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
                        }
                    }
                    if (this.f3879aa != null) {
                        C0760q qVar2 = qVar;
                        if (this.f3880ab != null) {
                            qVar2 = this.f3880ab;
                        }
                        lVar2.mo158a(this.f3879aa, rectF.m4111d() + this.f3881ac, rectF.m4110e() + this.f3882ad, qVar2);
                    }
                    if (this.f3865M) {
                        PointF d3 = C0654f.m1447d(this.f3866N, this.f3867O, this.f3868P);
                        lVar2.mo197a(rectF.f231a, rectF.f232b, d3.f224a - lVar.f5547cd, d3.f225b - lVar.f5548ce, this.f3826ax.f3814r);
                    } else if (z) {
                        lVar2.mo169a(gVar.f3935j, rect, rectF, qVar);
                    } else {
                        lVar2.mo169a(gVar.f3934i, rect, rectF, qVar);
                    }
                    if (z3) {
                        lVar2.mo124k();
                    }
                }
            }
        }
    }
}
