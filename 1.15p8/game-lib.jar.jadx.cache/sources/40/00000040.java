package com.corrodinggames.rts.gameFramework.effect;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.Effect;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.C0857w;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/e.class */
public final class EffectObject {

    /* renamed from: ax */
    private final EffectEngine f4323ax;

    /* renamed from: b */
    public GameObject f4324b;

    /* renamed from: c */
    public boolean f4325c;

    /* renamed from: d */
    public boolean f4326d;

    /* renamed from: g */
    public int f4327g;

    /* renamed from: o */
    public boolean f4328o;

    /* renamed from: p */
    public boolean f4329p;

    /* renamed from: q */
    public boolean f4330q;

    /* renamed from: s */
    public boolean fadeOut;

    /* renamed from: t */
    public boolean f4332t;

    /* renamed from: u */
    public float f4333u;

    /* renamed from: v */
    public boolean f4334v;

    /* renamed from: w */
    public boolean f4335w;

    /* renamed from: y */
    public int f4336y;

    /* renamed from: z */
    public int f4337z;

    /* renamed from: B */
    public short f4284B;

    /* renamed from: F */
    public float startingAlpha;

    /* renamed from: G */
    public float f4286G;

    /* renamed from: H */
    public float f4287H;

    /* renamed from: I */
    public boolean f4288I;

    /* renamed from: J */
    public float f4289J;

    /* renamed from: K */
    public float f4290K;

    /* renamed from: L */
    public float f4291L;

    /* renamed from: M */
    public boolean f4292M;

    /* renamed from: N */
    public float f4293N;

    /* renamed from: O */
    public float f4294O;

    /* renamed from: P */
    public float f4295P;

    /* renamed from: Q */
    public float f4296Q;

    /* renamed from: R */
    public float ySpeed;

    /* renamed from: S */
    public float f4298S;

    /* renamed from: T */
    public float f4299T;

    /* renamed from: U */
    public float f4300U;

    /* renamed from: V */
    public float f4301V;

    /* renamed from: W */
    public float timer;

    /* renamed from: X */
    public float startTimer;

    /* renamed from: Y */
    public float f4304Y;

    /* renamed from: Z */
    public float f4305Z;

    /* renamed from: aa */
    public String f4306aa;

    /* renamed from: ab */
    public Paint f4307ab;

    /* renamed from: ac */
    public float f4308ac;

    /* renamed from: ad */
    public float f4309ad;

    /* renamed from: ae */
    public boolean f4310ae;

    /* renamed from: af */
    public int f4311af;

    /* renamed from: ag */
    public int f4312ag;

    /* renamed from: ah */
    public boolean f4313ah;

    /* renamed from: ai */
    public boolean f4314ai;

    /* renamed from: aj */
    public float f4315aj;

    /* renamed from: ak */
    public float f4316ak;

    /* renamed from: al */
    public boolean f4317al;

    /* renamed from: ao */
    public int frameIndex;

    /* renamed from: ap */
    public int stripIndex;

    /* renamed from: at */
    public float f4320at;

    /* renamed from: au */
    public int f4321au;

    /* renamed from: av */
    public boolean f4322av;

    /* renamed from: h */
    public static int f4338h = 1;

    /* renamed from: i */
    public static int f4339i = 2;

    /* renamed from: j */
    public static int f4340j = 3;

    /* renamed from: k */
    public static int f4341k = 4;

    /* renamed from: l */
    public static int f4342l = 5;

    /* renamed from: m */
    public static int f4343m = 6;

    /* renamed from: n */
    public static int f4344n = 7;

    /* renamed from: D */
    public static LightingColorFilter f4345D = null;

    /* renamed from: E */
    public static int f4346E = 0;

    /* renamed from: aw */
    public static UniquePaint[] f4347aw = new UniquePaint[128];

    /* renamed from: a */
    public Effect f4348a = Effect.defaultEffectTemplate;

    /* renamed from: e */
    public boolean f4349e = true;

    /* renamed from: f */
    public boolean f4350f = false;

    /* renamed from: r */
    public EnumC0668h f4351r = EnumC0668h.verylow;

    /* renamed from: x */
    public float f4352x = 1.0f;

    /* renamed from: A */
    public float f4353A = -1.0f;

    /* renamed from: C */
    public LightingColorFilter lightingColorFilter = null;

    /* renamed from: am */
    public boolean f4355am = false;

    /* renamed from: an */
    public float f4356an = 0.0f;

    /* renamed from: aq */
    public short drawLayer = 2;

    /* renamed from: ar */
    public boolean f4358ar = false;

    /* renamed from: as */
    public UniquePaint f4359as = m2202a();

    /* JADX INFO: Access modifiers changed from: protected */
    public EffectObject(EffectEngine effectEngine) {
        this.f4323ax = effectEngine;
    }

    static {
        for (int i = 0; i < f4347aw.length; i++) {
            f4347aw[i] = m2202a();
            f4347aw[i].setAlpha((int) ((i / (f4347aw.length - 1)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static UniquePaint m2202a() {
        return C0955y.m445b();
    }

    /* renamed from: a */
    public UniquePaint m2201a(float f) {
        int length = (int) (f * (f4347aw.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > f4347aw.length - 1) {
            length = f4347aw.length - 1;
        }
        return f4347aw[length];
    }

    /* renamed from: b */
    public void m2198b() {
        if (this.f4329p) {
            this.f4329p = false;
            this.f4323ax.effectListActiveSize--;
            EffectEngine.f4252h = true;
            if (this.f4348a.alsoEmitEffectsOnDeath != null && this.f4284B < 20) {
                float f = this.f4289J;
                float f2 = this.f4290K;
                float f3 = this.f4291L;
                if (this.f4324b != null) {
                    f += this.f4324b.x;
                    f2 += this.f4324b.y;
                    f3 += this.f4324b.height;
                }
                this.f4348a.alsoEmitEffectsOnDeath.m3042a(f, f2, f3, this.f4304Y, this.f4324b, 0, this.f4284B);
            }
        }
    }

    /* renamed from: c */
    public void clear() {
        this.f4348a = Effect.defaultEffectTemplate;
        this.f4351r = EnumC0668h.verylow;
        this.f4324b = null;
        this.f4325c = false;
        this.f4326d = false;
        this.f4349e = true;
        this.f4350f = false;
        this.f4327g = 0;
        this.f4328o = false;
        this.f4330q = false;
        this.f4289J = 0.0f;
        this.f4290K = 0.0f;
        this.f4292M = false;
        this.f4293N = 0.0f;
        this.f4294O = 0.0f;
        this.f4295P = 0.0f;
        this.f4291L = 0.0f;
        this.drawLayer = (short) 2;
        this.f4355am = false;
        this.f4356an = 0.0f;
        this.f4310ae = false;
        this.f4316ak = 0.0f;
        this.f4315aj = 0.0f;
        this.f4312ag = 0;
        this.f4313ah = false;
        this.f4314ai = false;
        this.f4317al = false;
        this.frameIndex = 0;
        this.stripIndex = 0;
        this.f4301V = 0.0f;
        this.timer = 15.0f;
        this.startTimer = this.timer;
        this.fadeOut = false;
        this.f4332t = false;
        this.f4333u = 0.0f;
        this.f4286G = 1.0f;
        this.f4287H = 1.0f;
        this.f4288I = false;
        this.f4334v = false;
        this.f4335w = false;
        this.f4352x = 1.0f;
        this.startingAlpha = 1.0f;
        this.f4304Y = 0.0f;
        this.f4305Z = 0.0f;
        this.f4296Q = 0.0f;
        this.ySpeed = 0.0f;
        this.f4298S = 0.0f;
        this.f4299T = 0.0f;
        this.f4300U = 0.0f;
        this.f4306aa = null;
        this.f4307ab = null;
        this.f4308ac = 0.0f;
        this.f4309ad = 0.0f;
        this.f4284B = (short) 0;
        this.f4336y = -1;
        this.lightingColorFilter = null;
        this.f4337z = -1;
        this.f4353A = -1.0f;
        this.f4359as.m4715a((ColorFilter) null);
        this.f4322av = false;
        this.f4359as.m936a((C0857w) null);
        this.f4358ar = false;
    }

    /* renamed from: a */
    public void m2200a(EffectObject effectObject) {
        this.f4348a = effectObject.f4348a;
        this.f4351r = effectObject.f4351r;
        this.f4327g = effectObject.f4327g;
        this.f4324b = effectObject.f4324b;
        this.f4325c = effectObject.f4325c;
        this.f4326d = effectObject.f4326d;
        this.f4349e = effectObject.f4349e;
        this.f4328o = effectObject.f4328o;
        this.f4330q = effectObject.f4330q;
        this.f4289J = effectObject.f4289J;
        this.f4290K = effectObject.f4290K;
        this.f4292M = effectObject.f4292M;
        this.f4293N = effectObject.f4293N;
        this.f4294O = effectObject.f4294O;
        this.f4295P = effectObject.f4295P;
        this.f4291L = effectObject.f4291L;
        this.drawLayer = effectObject.drawLayer;
        this.f4355am = effectObject.f4355am;
        this.f4356an = effectObject.f4356an;
        this.f4310ae = effectObject.f4310ae;
        this.f4316ak = effectObject.f4316ak;
        this.f4315aj = effectObject.f4315aj;
        this.f4312ag = effectObject.f4312ag;
        this.f4313ah = effectObject.f4313ah;
        this.f4314ai = effectObject.f4314ai;
        this.f4317al = effectObject.f4313ah;
        this.frameIndex = effectObject.frameIndex;
        this.stripIndex = effectObject.stripIndex;
        this.f4301V = effectObject.f4301V;
        this.timer = effectObject.timer;
        this.startTimer = effectObject.startTimer;
        this.fadeOut = effectObject.fadeOut;
        this.f4332t = effectObject.f4332t;
        this.f4333u = effectObject.f4333u;
        this.f4286G = effectObject.f4286G;
        this.f4287H = effectObject.f4287H;
        this.f4288I = effectObject.f4288I;
        this.f4334v = effectObject.f4334v;
        this.f4335w = effectObject.f4335w;
        this.f4352x = effectObject.f4352x;
        this.startingAlpha = effectObject.startingAlpha;
        this.f4304Y = effectObject.f4304Y;
        this.f4305Z = effectObject.f4305Z;
        this.f4296Q = effectObject.f4296Q;
        this.ySpeed = effectObject.ySpeed;
        this.f4298S = effectObject.f4298S;
        this.f4299T = effectObject.f4299T;
        this.f4300U = effectObject.f4300U;
        this.f4306aa = effectObject.f4306aa;
        this.f4307ab = effectObject.f4307ab;
        this.f4308ac = effectObject.f4308ac;
        this.f4309ad = effectObject.f4309ad;
        this.f4284B = effectObject.f4284B;
        this.f4336y = effectObject.f4336y;
        this.f4337z = effectObject.f4337z;
        this.f4353A = effectObject.f4353A;
        this.lightingColorFilter = effectObject.lightingColorFilter;
        this.f4358ar = effectObject.f4358ar;
    }

    /* renamed from: b */
    public void m2197b(float f) {
        this.f4301V = CommonUtils.toZero(this.f4301V, f);
        if (this.f4301V > 0.0f) {
            return;
        }
        this.timer -= f;
        if (this.f4324b != null && this.f4324b.deleted && !this.f4348a.liveAfterAttachedDies) {
            this.timer = -1.0f;
        }
        if (this.timer < 0.0f) {
            m2198b();
            return;
        }
        if (this.f4310ae) {
            if (this.f4317al) {
                this.f4316ak -= this.f4315aj * f;
            } else {
                this.f4316ak += this.f4315aj * f;
            }
            if (this.f4313ah) {
                if (!this.f4317al) {
                    if (this.f4316ak >= this.f4312ag + 1) {
                        this.f4317al = true;
                        this.f4316ak = this.f4312ag;
                    }
                } else if (this.f4316ak < this.f4311af) {
                    if (!this.f4314ai) {
                        m2198b();
                        return;
                    } else {
                        this.f4317al = false;
                        this.f4316ak = this.f4311af;
                    }
                }
            } else if (this.f4316ak >= this.f4312ag + 1) {
                if (!this.f4314ai) {
                    m2198b();
                    return;
                }
                this.f4316ak = this.f4311af;
            }
            this.frameIndex = (int) this.f4316ak;
        }
        if (this.f4334v) {
            this.f4298S -= (this.f4298S * 0.002f) * f;
            this.f4296Q -= f * 0.0015f;
        }
        if (this.f4335w) {
            if (this.f4291L > 0.0f) {
                this.f4298S -= (0.1f * this.f4352x) * f;
            } else {
                if (this.f4298S < 0.0f) {
                    this.f4298S = -this.f4298S;
                    this.f4298S *= 0.5f;
                    this.f4298S = CommonUtils.toZero(this.f4298S, 1.3f);
                }
                if (this.f4291L < 0.0f) {
                    this.f4291L = 0.0f;
                }
                if (this.f4298S < 0.2d) {
                    this.drawLayer = (short) 1;
                }
                this.f4296Q = CommonUtils.toZero(this.f4296Q, 0.15f * f);
                this.ySpeed = CommonUtils.toZero(this.ySpeed, 0.15f * f);
                this.f4305Z = CommonUtils.toZero(this.f4305Z, 1.0f * f);
            }
        }
        this.f4289J += this.f4296Q * f;
        this.f4290K += this.ySpeed * f;
        this.f4291L += this.f4298S * f;
        this.f4304Y += this.f4305Z * f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v92, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m2199a(GameEngine gameEngine, boolean z) {
        ImageStrip imageStrip;
        PointF pointF;
        float f;
        UniquePaint uniquePaint;
        Rect rect = EffectEngine.f4262o;
        RectF rectF = EffectEngine.f4261n;
        if (this.f4301V > 0.0f) {
            return;
        }
        if (z && this.f4291L < 1.0f) {
            return;
        }
        if (this.f4348a.imageStrip != null) {
            imageStrip = this.f4348a.imageStrip;
        } else {
            imageStrip = EffectEngine.imageStrips[this.stripIndex];
        }
        if (!imageStrip.f4396k) {
            int i = this.frameIndex;
            int i2 = 0;
            if (i >= imageStrip.f4393h) {
                i2 = 0 + (i / imageStrip.f4393h);
                i %= imageStrip.f4393h;
            }
            int i3 = imageStrip.globalOffsetX + (i * imageStrip.tileStrideX);
            int i4 = imageStrip.globalOffsetY + (i2 * imageStrip.tileStrideY);
            rect.set(i3, i4, i3 + imageStrip.tileWidth, i4 + imageStrip.tileHeight);
        } else {
            rect.set(0, 0, imageStrip.image.getWidth(), imageStrip.image.getHeight());
        }
        if (!z) {
            pointF = CommonUtils.m1660d(this.f4289J, this.f4290K, this.f4291L);
        } else {
            pointF = CommonUtils.m1660d(this.f4289J, this.f4290K, 0.0f);
        }
        float f2 = 1.0f;
        if (this.f4287H != 1.0f || this.f4286G != 1.0f || this.f4288I) {
            f2 = CommonUtils.m1643f(this.f4287H, this.f4286G, 1.0f - (this.timer / this.startTimer));
            if (this.f4288I && !this.f4328o) {
                f2 = f2 * (1.0f / gameEngine.viewpointZoom) * gameEngine.densityScale;
            }
        }
        rectF.m4652a(pointF.x, pointF.y, pointF.x + rect.width(), pointF.y + rect.height());
        if (this.f4355am) {
            rectF.m4653a((-rectF.m4647b()) / 2.0f, (-rectF.m4643c()) / 2.0f);
        }
        if (this.f4356an != 0.0f) {
            rectF.m4653a(0.0f, rectF.m4643c() * this.f4356an * f2);
        }
        if (this.f4324b != null) {
            if (!z) {
                if (!this.f4325c) {
                    rectF.m4653a(this.f4324b.x, this.f4324b.y - this.f4324b.height);
                } else {
                    rectF.m4653a(this.f4324b.x, this.f4324b.y);
                }
            } else {
                rectF.m4653a(this.f4324b.x, this.f4324b.y);
            }
        }
        if ((!this.f4328o || this.f4292M) && !CommonUtils.m1728a(gameEngine.f5958cM, rectF)) {
            return;
        }
        if (!this.f4349e && !this.f4328o && !this.f4350f) {
            if (!gameEngine.map.m4166a(rectF.m4641d(), rectF.m4640e(), gameEngine.playerTeam)) {
                return;
            }
            this.f4350f = true;
        }
        if (!this.f4328o) {
            rectF.m4653a(-gameEngine.viewpointX_rounded, -gameEngine.viewpointY_rounded);
        }
        if (this.f4299T != 0.0f) {
            rectF.m4653a(0.0f, CommonUtils.sin(((this.startTimer - this.timer) / this.f4300U) * 360.0f) * this.f4299T);
        }
        float f3 = this.startTimer - this.timer;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        boolean z2 = false;
        if (this.f4336y != -1) {
            f4 = Color.m4734a(this.f4336y) * 0.003921569f;
            int m4730b = Color.m4730b(this.f4336y);
            int m4729c = Color.m4729c(this.f4336y);
            int m4728d = Color.m4728d(this.f4336y);
            if (m4730b != 255 || m4729c != 255 || m4728d != 255) {
                z2 = true;
                f5 = m4730b * 0.003921569f;
                f6 = m4729c * 0.003921569f;
                f7 = m4728d * 0.003921569f;
            }
        }
        if (this.f4353A >= 0.0f) {
            float m4734a = Color.m4734a(this.f4337z) * 0.003921569f;
            float m4730b2 = Color.m4730b(this.f4337z) * 0.003921569f;
            float m4729c2 = Color.m4729c(this.f4337z) * 0.003921569f;
            float m4728d2 = Color.m4728d(this.f4337z) * 0.003921569f;
            if (this.f4353A <= f3) {
                f4 = m4734a;
                z2 = true;
                f5 = m4730b2;
                f6 = m4729c2;
                f7 = m4728d2;
            } else {
                float f8 = f3 / this.f4353A;
                float f9 = 1.0f - f8;
                f4 = (f4 * f9) + (m4734a * f8);
                z2 = true;
                f5 = (f5 * f9) + (m4730b2 * f8);
                f6 = (f6 * f9) + (m4729c2 * f8);
                f7 = (f7 * f9) + (m4728d2 * f8);
            }
        }
        if (this.fadeOut && f3 >= this.f4333u) {
            f = f4 * ((this.timer - this.f4333u) / this.startTimer) * this.startingAlpha;
        } else if (this.f4332t && f3 < this.f4333u) {
            f = f4 * (f3 / this.f4333u) * this.startingAlpha;
        } else {
            f = f4 * this.startingAlpha;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        boolean z3 = false;
        Graphics graphics = gameEngine.graphics;
        if (this.f4304Y != 0.0f) {
            if (0 == 0) {
                z3 = true;
                graphics.mo135j();
            }
            graphics.mo223a(this.f4304Y + 90.0f, rectF.m4641d(), rectF.m4640e());
        }
        if (f2 != 1.0f) {
            if (!z3) {
                z3 = true;
                graphics.mo135j();
            }
            graphics.mo222a(f2, f2, rectF.m4641d(), rectF.m4640e());
        }
        if (z) {
            f = CommonUtils.m1692b(f / 3.0f, 0.0f, 1.0f);
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            z2 = true;
        }
        if (z2 && GameEngine.isNonDedicatedServer() && !z && this.lightingColorFilter == null) {
            int m1686b = CommonUtils.m1686b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            if (f4345D != null && f4346E == m1686b) {
                this.lightingColorFilter = f4345D;
            } else {
                f4345D = new LightingColorFilter(m1686b, 0);
                f4346E = m1686b;
                this.lightingColorFilter = f4345D;
            }
        }
        LightingColorFilter lightingColorFilter = this.lightingColorFilter;
        if (lightingColorFilter != null) {
            if (!this.f4322av) {
                this.f4359as.m4715a(lightingColorFilter);
                this.f4322av = true;
            }
            z2 = true;
        } else if (this.f4322av) {
            this.f4359as.m4715a((ColorFilter) null);
            this.f4322av = false;
        }
        if (this.drawLayer == 101) {
            if (EffectEngine.f4253k == null) {
                GameEngine.PrintLOG("Loading displacement shader");
                try {
                    EffectEngine.f4253k = new C0857w("assets/shaders/post_displacement.frag");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            EffectEngine.f4253k.m947a("screenBase", this.f4323ax.f4257l);
            EffectEngine.f4253k.m949a("u_resolution", gameEngine.f5870ck, gameEngine.f5871cl);
            EffectEngine.f4253k.teamColorAmount("u_offsetBy", 0.12f * gameEngine.viewpointZoom);
            this.f4359as.m936a(EffectEngine.f4253k);
            z2 = true;
        }
        if (!z2) {
            uniquePaint = m2201a(f);
        } else {
            uniquePaint = this.f4359as;
            int m1686b2 = CommonUtils.m1686b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            float f10 = this.f4320at - f;
            if (f10 < -0.01f || f10 > 0.01f || this.f4321au != m1686b2) {
                this.f4320at = f;
                this.f4321au = m1686b2;
                this.f4359as.setColor(CommonUtils.m1686b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
            }
        }
        if (this.f4306aa != null) {
            UniquePaint uniquePaint2 = uniquePaint;
            if (this.f4307ab != null) {
                uniquePaint2 = this.f4307ab;
            }
            graphics.drawText(this.f4306aa, rectF.m4641d() + this.f4308ac, rectF.m4640e() + this.f4309ad, uniquePaint2);
        }
        if (this.f4292M) {
            PointF m1660d = CommonUtils.m1660d(this.f4293N, this.f4294O, this.f4295P);
            graphics.mo221a(rectF.left, rectF.top, m1660d.x - gameEngine.viewpointX_rounded, m1660d.y - gameEngine.viewpointY_rounded, this.f4323ax.f4272u);
        } else if (z) {
            graphics.mo190a(imageStrip.f4395j, rect, rectF, uniquePaint);
        } else {
            graphics.mo190a(imageStrip.image, rect, rectF, uniquePaint);
        }
        if (z3) {
            graphics.mo134k();
        }
    }
}