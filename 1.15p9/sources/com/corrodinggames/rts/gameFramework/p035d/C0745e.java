package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0382aw;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/e.class */
public final class C0745e {

    /* renamed from: ay */
    private final C0743c f4712ay;

    /* renamed from: b */
    public AbstractC1120w f4713b;

    /* renamed from: c */
    public boolean f4714c;

    /* renamed from: d */
    public boolean f4715d;

    /* renamed from: g */
    public int f4716g;

    /* renamed from: o */
    public boolean f4717o;

    /* renamed from: p */
    public boolean f4718p;

    /* renamed from: q */
    public boolean f4719q;

    /* renamed from: s */
    public boolean f4720s;

    /* renamed from: t */
    public boolean f4721t;

    /* renamed from: u */
    public float f4722u;

    /* renamed from: v */
    public boolean f4723v;

    /* renamed from: w */
    public boolean f4724w;

    /* renamed from: y */
    public int f4725y;

    /* renamed from: z */
    public int f4726z;

    /* renamed from: B */
    public short f4727B;

    /* renamed from: F */
    public float f4728F;

    /* renamed from: G */
    public float f4729G;

    /* renamed from: H */
    public float f4730H;

    /* renamed from: I */
    public boolean f4731I;

    /* renamed from: J */
    public float f4732J;

    /* renamed from: K */
    public float f4733K;

    /* renamed from: L */
    public float f4734L;

    /* renamed from: M */
    public boolean f4735M;

    /* renamed from: N */
    public float f4736N;

    /* renamed from: O */
    public float f4737O;

    /* renamed from: P */
    public float f4738P;

    /* renamed from: Q */
    public float f4739Q;

    /* renamed from: R */
    public float f4740R;

    /* renamed from: S */
    public float f4741S;

    /* renamed from: T */
    public float f4742T;

    /* renamed from: U */
    public float f4743U;

    /* renamed from: V */
    public float f4744V;

    /* renamed from: W */
    public float f4745W;

    /* renamed from: X */
    public float f4746X;

    /* renamed from: Y */
    public float f4747Y;

    /* renamed from: Z */
    public float f4748Z;

    /* renamed from: aa */
    public String f4749aa;

    /* renamed from: ab */
    public Paint f4750ab;

    /* renamed from: ac */
    public float f4751ac;

    /* renamed from: ad */
    public float f4752ad;

    /* renamed from: ae */
    public boolean f4753ae;

    /* renamed from: af */
    public int f4754af;

    /* renamed from: ag */
    public int f4755ag;

    /* renamed from: ah */
    public boolean f4756ah;

    /* renamed from: ai */
    public boolean f4757ai;

    /* renamed from: aj */
    public float f4758aj;

    /* renamed from: ak */
    public float f4759ak;

    /* renamed from: al */
    public boolean f4760al;

    /* renamed from: am */
    public boolean f4761am;

    /* renamed from: ap */
    public int f4762ap;

    /* renamed from: aq */
    public int f4763aq;

    /* renamed from: au */
    public float f4764au;

    /* renamed from: av */
    public int f4765av;

    /* renamed from: aw */
    public boolean f4766aw;

    /* renamed from: h */
    public static int f4767h = 1;

    /* renamed from: i */
    public static int f4768i = 2;

    /* renamed from: j */
    public static int f4769j = 3;

    /* renamed from: k */
    public static int f4770k = 4;

    /* renamed from: l */
    public static int f4771l = 5;

    /* renamed from: m */
    public static int f4772m = 6;

    /* renamed from: n */
    public static int f4773n = 7;

    /* renamed from: D */
    public static LightingColorFilter f4774D = null;

    /* renamed from: E */
    public static int f4775E = 0;

    /* renamed from: ax */
    public static C0930ag[] f4776ax = new C0930ag[128];

    /* renamed from: a */
    public C0382aw f4777a = C0382aw.defaultEffectTemplate;

    /* renamed from: e */
    public boolean f4778e = true;

    /* renamed from: f */
    public boolean f4779f = false;

    /* renamed from: r */
    public EnumC0748h f4780r = EnumC0748h.f4826a;

    /* renamed from: x */
    public float f4781x = 1.0f;

    /* renamed from: A */
    public float f4782A = -1.0f;

    /* renamed from: C */
    public LightingColorFilter f4783C = null;

    /* renamed from: an */
    public boolean f4784an = false;

    /* renamed from: ao */
    public float f4785ao = 0.0f;

    /* renamed from: ar */
    public short f4786ar = 2;

    /* renamed from: as */
    public boolean f4787as = false;

    /* renamed from: at */
    public C0930ag f4788at = m2528a();

    /* JADX INFO: Access modifiers changed from: protected */
    public C0745e(C0743c c0743c) {
        this.f4712ay = c0743c;
    }

    static {
        for (int i = 0; i < f4776ax.length; i++) {
            f4776ax[i] = m2528a();
            f4776ax[i].m7237c((int) ((i / (f4776ax.length - 1)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static C0930ag m2528a() {
        return C1117y.m483b();
    }

    /* renamed from: a */
    public C0930ag m2527a(float f) {
        int length = (int) (f * (f4776ax.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > f4776ax.length - 1) {
            length = f4776ax.length - 1;
        }
        return f4776ax[length];
    }

    /* renamed from: b */
    public void m2523b() {
        if (this.f4718p) {
            this.f4718p = false;
            this.f4712ay.f4692a--;
            C0743c.f4678h = true;
            if (this.f4777a.alsoEmitEffectsOnDeath != null && this.f4727B < 20) {
                float f = this.f4732J;
                float f2 = this.f4733K;
                float f3 = this.f4734L;
                if (this.f4713b != null) {
                    f += this.f4713b.f6951ek;
                    f2 += this.f4713b.f6952el;
                    f3 += this.f4713b.height;
                }
                this.f4777a.alsoEmitEffectsOnDeath.m4677a(f, f2, f3, this.f4747Y, this.f4713b, 0, this.f4727B);
            }
        }
    }

    /* renamed from: c */
    public void m2521c() {
        this.f4777a = C0382aw.defaultEffectTemplate;
        this.f4780r = EnumC0748h.f4826a;
        this.f4713b = null;
        this.f4714c = false;
        this.f4715d = false;
        this.f4778e = true;
        this.f4779f = false;
        this.f4716g = 0;
        this.f4717o = false;
        this.f4719q = false;
        this.f4732J = 0.0f;
        this.f4733K = 0.0f;
        this.f4735M = false;
        this.f4736N = 0.0f;
        this.f4737O = 0.0f;
        this.f4738P = 0.0f;
        this.f4734L = 0.0f;
        this.f4786ar = (short) 2;
        this.f4784an = false;
        this.f4785ao = 0.0f;
        this.f4753ae = false;
        this.f4759ak = 0.0f;
        this.f4758aj = 0.0f;
        this.f4755ag = 0;
        this.f4756ah = false;
        this.f4757ai = false;
        this.f4760al = false;
        this.f4761am = false;
        this.f4762ap = 0;
        this.f4763aq = 0;
        this.f4744V = 0.0f;
        this.f4745W = 15.0f;
        this.f4746X = this.f4745W;
        this.f4720s = false;
        this.f4721t = false;
        this.f4722u = 0.0f;
        this.f4729G = 1.0f;
        this.f4730H = 1.0f;
        this.f4731I = false;
        this.f4723v = false;
        this.f4724w = false;
        this.f4781x = 1.0f;
        this.f4728F = 1.0f;
        this.f4747Y = 0.0f;
        this.f4748Z = 0.0f;
        this.f4739Q = 0.0f;
        this.f4740R = 0.0f;
        this.f4741S = 0.0f;
        this.f4742T = 0.0f;
        this.f4743U = 0.0f;
        this.f4749aa = null;
        this.f4750ab = null;
        this.f4751ac = 0.0f;
        this.f4752ad = 0.0f;
        this.f4727B = (short) 0;
        this.f4725y = -1;
        this.f4783C = null;
        this.f4726z = -1;
        this.f4782A = -1.0f;
        this.f4788at.m7264a((ColorFilter) null);
        this.f4766aw = false;
        this.f4788at.m1054a((C0928ae) null);
        this.f4787as = false;
    }

    /* renamed from: a */
    public void m2525a(C0745e c0745e) {
        this.f4777a = c0745e.f4777a;
        this.f4780r = c0745e.f4780r;
        this.f4716g = c0745e.f4716g;
        this.f4713b = c0745e.f4713b;
        this.f4714c = c0745e.f4714c;
        this.f4715d = c0745e.f4715d;
        this.f4778e = c0745e.f4778e;
        this.f4717o = c0745e.f4717o;
        this.f4719q = c0745e.f4719q;
        this.f4732J = c0745e.f4732J;
        this.f4733K = c0745e.f4733K;
        this.f4735M = c0745e.f4735M;
        this.f4736N = c0745e.f4736N;
        this.f4737O = c0745e.f4737O;
        this.f4738P = c0745e.f4738P;
        this.f4734L = c0745e.f4734L;
        this.f4786ar = c0745e.f4786ar;
        this.f4784an = c0745e.f4784an;
        this.f4785ao = c0745e.f4785ao;
        this.f4753ae = c0745e.f4753ae;
        this.f4759ak = c0745e.f4759ak;
        this.f4758aj = c0745e.f4758aj;
        this.f4755ag = c0745e.f4755ag;
        this.f4756ah = c0745e.f4756ah;
        this.f4757ai = c0745e.f4757ai;
        this.f4760al = c0745e.f4756ah;
        this.f4761am = c0745e.f4761am;
        this.f4762ap = c0745e.f4762ap;
        this.f4763aq = c0745e.f4763aq;
        this.f4744V = c0745e.f4744V;
        this.f4745W = c0745e.f4745W;
        this.f4746X = c0745e.f4746X;
        this.f4720s = c0745e.f4720s;
        this.f4721t = c0745e.f4721t;
        this.f4722u = c0745e.f4722u;
        this.f4729G = c0745e.f4729G;
        this.f4730H = c0745e.f4730H;
        this.f4731I = c0745e.f4731I;
        this.f4723v = c0745e.f4723v;
        this.f4724w = c0745e.f4724w;
        this.f4781x = c0745e.f4781x;
        this.f4728F = c0745e.f4728F;
        this.f4747Y = c0745e.f4747Y;
        this.f4748Z = c0745e.f4748Z;
        this.f4739Q = c0745e.f4739Q;
        this.f4740R = c0745e.f4740R;
        this.f4741S = c0745e.f4741S;
        this.f4742T = c0745e.f4742T;
        this.f4743U = c0745e.f4743U;
        this.f4749aa = c0745e.f4749aa;
        this.f4750ab = c0745e.f4750ab;
        this.f4751ac = c0745e.f4751ac;
        this.f4752ad = c0745e.f4752ad;
        this.f4727B = c0745e.f4727B;
        this.f4725y = c0745e.f4725y;
        this.f4726z = c0745e.f4726z;
        this.f4782A = c0745e.f4782A;
        this.f4783C = c0745e.f4783C;
        this.f4787as = c0745e.f4787as;
    }

    /* renamed from: b */
    public void m2522b(float f) {
        this.f4744V = CommonUtils.m2368a(this.f4744V, f);
        if (this.f4744V > 0.0f) {
            return;
        }
        this.f4745W -= f;
        if (this.f4713b != null && this.f4713b.f6946ef && !this.f4777a.liveAfterAttachedDies) {
            this.f4745W = -1.0f;
        }
        if (this.f4745W < 0.0f) {
            m2523b();
            return;
        }
        if (this.f4753ae) {
            if (this.f4760al) {
                this.f4759ak -= this.f4758aj * f;
            } else {
                this.f4759ak += this.f4758aj * f;
            }
            if (this.f4756ah) {
                if (!this.f4760al) {
                    if (this.f4759ak >= this.f4755ag + 1) {
                        this.f4760al = true;
                        this.f4759ak = this.f4755ag;
                    }
                } else if (this.f4759ak < this.f4754af) {
                    if (!this.f4757ai) {
                        m2523b();
                        return;
                    } else {
                        this.f4760al = false;
                        this.f4759ak = this.f4754af;
                    }
                }
            } else if (this.f4759ak >= this.f4755ag + 1) {
                if (!this.f4757ai) {
                    m2523b();
                    return;
                }
                this.f4759ak = this.f4754af;
            }
            this.f4762ap = (int) this.f4759ak;
        }
        if (this.f4723v) {
            this.f4741S -= (this.f4741S * 0.002f) * f;
            this.f4739Q -= f * 0.0015f;
        }
        if (this.f4724w) {
            if (this.f4734L > 0.0f) {
                this.f4741S -= (0.1f * this.f4781x) * f;
            } else {
                if (this.f4741S < 0.0f) {
                    this.f4741S = -this.f4741S;
                    this.f4741S *= 0.5f;
                    this.f4741S = CommonUtils.m2368a(this.f4741S, 1.3f);
                }
                if (this.f4734L < 0.0f) {
                    this.f4734L = 0.0f;
                }
                if (this.f4741S < 0.2d) {
                    this.f4786ar = (short) 1;
                }
                this.f4739Q = CommonUtils.m2368a(this.f4739Q, 0.15f * f);
                this.f4740R = CommonUtils.m2368a(this.f4740R, 0.15f * f);
                this.f4748Z = CommonUtils.m2368a(this.f4748Z, 1.0f * f);
            }
        }
        this.f4732J += this.f4739Q * f;
        this.f4733K += this.f4740R * f;
        this.f4734L += this.f4741S * f;
        this.f4747Y += this.f4748Z * f;
    }

    /* renamed from: a */
    public static void m2526a(int i, C0747g c0747g, Rect rect) {
        int i2 = 0;
        if (i >= c0747g.f4820h) {
            i2 = 0 + (i / c0747g.f4820h);
            i %= c0747g.f4820h;
        }
        int i3 = c0747g.f4816d + (i * c0747g.f4818f);
        int i4 = c0747g.f4817e + (i2 * c0747g.f4819g);
        rect.f230a = i3;
        rect.f231b = i4;
        rect.f232c = i3 + c0747g.f4814b;
        rect.f233d = i4 + c0747g.f4815c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150, types: [android.graphics.Paint] */
    /* renamed from: a */
    public boolean m2524a(GameEngine gameEngine, boolean z) {
        C0747g c0747g;
        PointF m2281d;
        float f;
        C0930ag c0930ag;
        Rect rect = C0743c.f4688o;
        RectF rectF = C0743c.f4687n;
        if (this.f4744V > 0.0f) {
            return false;
        }
        if (z && this.f4734L < 1.0f) {
            return false;
        }
        if (this.f4777a.imageStrip != null) {
            c0747g = this.f4777a.imageStrip;
        } else {
            c0747g = C0743c.f4684s[this.f4763aq];
        }
        if (!c0747g.f4823k) {
            m2526a(this.f4762ap, c0747g, rect);
        } else {
            rect.m7208a(0, 0, c0747g.f4821i.mo396m(), c0747g.f4821i.mo397l());
        }
        if (!z) {
            m2281d = CommonUtils.m2281d(this.f4732J, this.f4733K, this.f4734L);
        } else {
            m2281d = CommonUtils.m2281d(this.f4732J, this.f4733K, 0.0f);
        }
        float f2 = 1.0f;
        if (this.f4730H != 1.0f || this.f4729G != 1.0f || this.f4731I) {
            f2 = CommonUtils.m2264f(this.f4730H, this.f4729G, 1.0f - (this.f4745W / this.f4746X));
            if (this.f4731I && !this.f4717o) {
                f2 = f2 * (1.0f / gameEngine.f6250cW) * gameEngine.f6126ci;
            }
        }
        rectF.m7195a(m2281d.x, m2281d.y, m2281d.x + rect.m7206b(), m2281d.y + rect.m7202c());
        if (this.f4784an) {
            rectF.m7196a((-rectF.m7190b()) / 2.0f, (-rectF.m7186c()) / 2.0f);
        }
        if (this.f4785ao != 0.0f) {
            rectF.m7196a(0.0f, rectF.m7186c() * this.f4785ao * f2);
        }
        if (this.f4713b != null) {
            if (!z) {
                if (!this.f4714c) {
                    rectF.m7196a(this.f4713b.f6951ek, this.f4713b.f6952el - this.f4713b.height);
                } else {
                    rectF.m7196a(this.f4713b.f6951ek, this.f4713b.f6952el);
                }
            } else {
                rectF.m7196a(this.f4713b.f6951ek, this.f4713b.f6952el);
            }
        }
        if ((!this.f4717o || this.f4735M) && !CommonUtils.m2351a(gameEngine.f6244cM, rectF)) {
            return false;
        }
        if (!this.f4778e && !this.f4717o && !this.f4779f) {
            if (!gameEngine.f6104bL.m6650a(rectF.m7184d(), rectF.m7183e(), gameEngine.f6093bs)) {
                return false;
            }
            this.f4779f = true;
        }
        if (!this.f4717o) {
            rectF.m7196a(-gameEngine.f6138cv, -gameEngine.f6139cw);
        }
        if (this.f4742T != 0.0f) {
            rectF.m7196a(0.0f, CommonUtils.sin(((this.f4746X - this.f4745W) / this.f4743U) * 360.0f) * this.f4742T);
        }
        float f3 = this.f4746X - this.f4745W;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        boolean z2 = false;
        if (this.f4725y != -1) {
            f4 = Color.m7284a(this.f4725y) * 0.003921569f;
            int m7280b = Color.m7280b(this.f4725y);
            int m7279c = Color.m7279c(this.f4725y);
            int m7278d = Color.m7278d(this.f4725y);
            if (m7280b != 255 || m7279c != 255 || m7278d != 255) {
                z2 = true;
                f5 = m7280b * 0.003921569f;
                f6 = m7279c * 0.003921569f;
                f7 = m7278d * 0.003921569f;
            }
        }
        if (this.f4782A >= 0.0f) {
            float m7284a = Color.m7284a(this.f4726z) * 0.003921569f;
            float m7280b2 = Color.m7280b(this.f4726z) * 0.003921569f;
            float m7279c2 = Color.m7279c(this.f4726z) * 0.003921569f;
            float m7278d2 = Color.m7278d(this.f4726z) * 0.003921569f;
            if (this.f4782A <= f3) {
                f4 = m7284a;
                z2 = true;
                f5 = m7280b2;
                f6 = m7279c2;
                f7 = m7278d2;
            } else {
                float f8 = f3 / this.f4782A;
                float f9 = 1.0f - f8;
                f4 = (f4 * f9) + (m7284a * f8);
                z2 = true;
                f5 = (f5 * f9) + (m7280b2 * f8);
                f6 = (f6 * f9) + (m7279c2 * f8);
                f7 = (f7 * f9) + (m7278d2 * f8);
            }
        }
        if (this.f4720s && f3 >= this.f4722u) {
            f = f4 * (this.f4745W / (this.f4746X - this.f4722u)) * this.f4728F;
        } else if (this.f4721t && f3 < this.f4722u) {
            f = f4 * (f3 / this.f4722u) * this.f4728F;
        } else {
            f = f4 * this.f4728F;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        boolean z3 = false;
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        if (this.f4747Y != 0.0f) {
            if (0 == 0) {
                z3 = true;
                interfaceC1027y.mo878k();
            }
            interfaceC1027y.mo934a(this.f4747Y + 90.0f, rectF.m7184d(), rectF.m7183e());
        }
        if (f2 != 1.0f) {
            if (!z3) {
                z3 = true;
                interfaceC1027y.mo878k();
            }
            interfaceC1027y.mo933a(f2, f2, rectF.m7184d(), rectF.m7183e());
        }
        if (z) {
            f = CommonUtils.m2315b(f / 3.0f, 0.0f, 1.0f);
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            z2 = true;
        }
        if (z2 && GameEngine.m1159as() && !z && this.f4783C == null) {
            int m2309b = CommonUtils.m2309b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            if (f4774D != null && f4775E == m2309b) {
                this.f4783C = f4774D;
            } else {
                f4774D = new LightingColorFilter(m2309b, 0);
                f4775E = m2309b;
                this.f4783C = f4774D;
            }
        }
        LightingColorFilter lightingColorFilter = this.f4783C;
        if (lightingColorFilter != null) {
            if (!this.f4766aw) {
                this.f4788at.m7264a(lightingColorFilter);
                this.f4766aw = true;
            }
            z2 = true;
        } else if (this.f4766aw) {
            this.f4788at.m7264a((ColorFilter) null);
            this.f4766aw = false;
        }
        if (this.f4786ar == 101) {
            if (C0743c.f4681k == null) {
                GameEngine.PrintLog("Loading displacement shader");
                try {
                    C0743c.f4681k = new C0928ae("assets/shaders/post_displacement.frag");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (this.f4712ay.f4682l != null) {
                C0928ae c0928ae = C0743c.f4681k;
                c0928ae.m1068a("screenBase", this.f4712ay.f4682l);
                c0928ae.m1065b("screenBaseSize", this.f4712ay.f4682l);
                c0928ae.m1070a("u_resolution", gameEngine.f6128ck, gameEngine.f6129cl);
                c0928ae.m1071a("u_offsetBy", 0.12f * gameEngine.f6250cW);
                this.f4788at.m1054a(c0928ae);
                z2 = true;
            }
        }
        if (!z2) {
            c0930ag = m2527a(f);
        } else {
            c0930ag = this.f4788at;
            int m2309b2 = CommonUtils.m2309b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            float f10 = this.f4764au - f;
            if (f10 < -0.01f || f10 > 0.01f || this.f4765av != m2309b2) {
                this.f4764au = f;
                this.f4765av = m2309b2;
                this.f4788at.m7242b(CommonUtils.m2309b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
            }
        }
        if (this.f4749aa != null) {
            C0930ag c0930ag2 = c0930ag;
            if (this.f4750ab != null) {
                c0930ag2 = this.f4750ab;
            }
            interfaceC1027y.mo903a(this.f4749aa, rectF.m7184d() + this.f4751ac, rectF.m7183e() + this.f4752ad, c0930ag2);
        }
        if (this.f4735M) {
            PointF m2281d2 = CommonUtils.m2281d(this.f4736N, this.f4737O, this.f4738P);
            interfaceC1027y.mo932a(rectF.f234a, rectF.f235b, m2281d2.x - gameEngine.f6138cv, m2281d2.y - gameEngine.f6139cw, this.f4712ay.f4700w);
        } else if (z) {
            interfaceC1027y.mo909a(c0747g.f4822j, rect, rectF, c0930ag);
        } else {
            interfaceC1027y.mo909a(c0747g.f4821i, rect, rectF, c0930ag);
        }
        if (z3) {
            interfaceC1027y.mo877l();
            return true;
        }
        return true;
    }
}
