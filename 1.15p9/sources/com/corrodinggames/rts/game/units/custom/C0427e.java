package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p018b.C0394h;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class C0427e {

    /* renamed from: a */
    public C0441f f2720a;

    /* renamed from: b */
    float f2721b;

    /* renamed from: c */
    float f2722c;

    /* renamed from: g */
    boolean f2723g;

    /* renamed from: h */
    boolean f2724h;

    /* renamed from: i */
    boolean f2725i;

    /* renamed from: j */
    int f2726j;

    /* renamed from: m */
    C0451j f2727m;

    /* renamed from: n */
    float[] f2728n;

    /* renamed from: d */
    float f2729d = 1.0f;

    /* renamed from: e */
    boolean f2730e = false;

    /* renamed from: f */
    boolean f2731f = false;

    /* renamed from: k */
    float f2732k = 0.0f;

    /* renamed from: l */
    float f2733l = 0.05f;

    public C0427e(C0451j c0451j) {
        this.f2727m = c0451j;
    }

    /* renamed from: a */
    public void m5167a(C0441f c0441f, int i) {
        m5166a(c0441f, i, false);
    }

    /* renamed from: a */
    public void m5166a(C0441f c0441f, int i, boolean z) {
        if (c0441f == null || !c0441f.m5085a()) {
            return;
        }
        if ((this.f2725i || (this.f2731f && this.f2730e)) && i <= this.f2726j && (!z || c0441f != this.f2720a)) {
            return;
        }
        this.f2725i = true;
        if (c0441f != this.f2720a || z || this.f2723g) {
            float f = 0.0f;
            if (this.f2720a != null && this.f2730e) {
                f = this.f2720a.f2812i;
            }
            this.f2720a = c0441f;
            this.f2726j = i;
            m5162c();
            this.f2731f = z;
            if (z) {
                this.f2724h = false;
            } else {
                this.f2724h = true;
            }
            this.f2721b = -1.0f;
            this.f2722c = -1.0f;
            this.f2729d = 1.0f;
            this.f2723g = false;
            float f2 = c0441f.f2811h;
            if (f > f2) {
                f2 = f;
            }
            if (f2 > 0.0f) {
                this.f2732k = 1.0f;
                this.f2733l = f2;
            } else {
                this.f2732k = 0.0f;
            }
        }
        this.f2730e = true;
    }

    /* renamed from: a */
    public void m5170a() {
        if (this.f2720a != null) {
            m5163b(true);
        }
        this.f2730e = false;
        this.f2720a = null;
        this.f2726j = -1;
    }

    /* renamed from: b */
    public void m5164b() {
        if (this.f2720a != null) {
            if (!this.f2723g) {
                float f = this.f2720a.f2812i;
                if (f > 0.0f) {
                    this.f2723g = true;
                    m5162c();
                    this.f2724h = false;
                    this.f2726j = -1;
                    this.f2732k = 1.0f;
                    this.f2733l = f;
                    return;
                }
            }
            m5163b(true);
        }
        this.f2730e = false;
        this.f2720a = null;
        this.f2726j = -1;
    }

    /* renamed from: a */
    public void m5169a(float f) {
        if (!this.f2730e) {
            return;
        }
        this.f2722c = this.f2721b;
        if (this.f2721b < 0.0f) {
            this.f2721b = 0.0f;
        }
        float f2 = this.f2729d;
        if (this.f2720a != null && this.f2720a.f2813j != null) {
            f2 *= this.f2720a.f2813j.readNumber(this.f2727m);
        }
        this.f2721b += f2 * f;
        if (this.f2724h && !this.f2725i) {
            m5164b();
        }
        this.f2725i = false;
        if (this.f2730e) {
            if (this.f2732k > 0.0f) {
                this.f2732k -= this.f2733l * f;
            } else if (this.f2723g) {
                m5164b();
                return;
            }
            if (!this.f2723g && this.f2720a != null) {
                if (this.f2720a.f2810g) {
                    if (this.f2721b > this.f2720a.f2815n) {
                        m5165a(false);
                        this.f2721b = this.f2720a.f2815n;
                        this.f2729d = -1.0f;
                    } else if (this.f2721b < 0.0f) {
                        this.f2721b = 0.0f;
                        this.f2729d = 1.0f;
                        if (this.f2731f) {
                            m5164b();
                            if (!this.f2723g) {
                                return;
                            }
                        }
                    }
                } else {
                    if (this.f2721b > this.f2720a.f2815n) {
                        if (this.f2731f) {
                            m5165a(false);
                            m5164b();
                            if (!this.f2723g) {
                                return;
                            }
                        } else {
                            m5165a(false);
                            this.f2721b = 0.0f;
                            this.f2729d = 1.0f;
                        }
                    }
                    if (this.f2721b < 0.0f && !this.f2731f && f2 < 0.0f) {
                        this.f2721b = this.f2720a.f2815n;
                    }
                }
            }
            boolean z = false;
            if (this.f2723g) {
                z = true;
            }
            m5163b(z);
        }
    }

    /* renamed from: c */
    void m5162c() {
        C1101m c1101m = this.f2720a.f2818l;
        if (this.f2728n == null || this.f2728n.length < c1101m.size()) {
            this.f2728n = new float[c1101m.size()];
        }
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            EnumC0422d enumC0422d = c0415c.f2657a;
            if (enumC0422d == EnumC0422d.scale) {
                this.f2728n[i] = this.f2727m.f2841c;
            } else if (enumC0422d == EnumC0422d.frame) {
                this.f2728n[i] = -99.0f;
            } else if (enumC0422d == EnumC0422d.legX) {
                if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                    this.f2728n[i] = this.f2727m.f2883dQ[c0415c.f2658b].f2423p;
                } else {
                    this.f2728n[i] = 0.0f;
                    GameEngine.m1145b("setBaseBlendValues: Target leg out of range for: " + this.f2727m.m4802r().m4724i());
                }
            } else if (enumC0422d == EnumC0422d.legY) {
                if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                    this.f2728n[i] = this.f2727m.f2883dQ[c0415c.f2658b].f2424q;
                }
            } else if (enumC0422d == EnumC0422d.legDir) {
                if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                    this.f2727m.f2883dQ[c0415c.f2658b].f2425r = CommonUtils.m2362a(this.f2727m.f2883dQ[c0415c.f2658b].f2425r, false);
                    this.f2728n[i] = this.f2727m.f2883dQ[c0415c.f2658b].f2425r;
                }
            } else if (enumC0422d == EnumC0422d.legHeight) {
                if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                    this.f2728n[i] = this.f2727m.f2883dQ[c0415c.f2658b].f2426d;
                }
            } else if (enumC0422d == EnumC0422d.legAlpha) {
                if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                    this.f2728n[i] = this.f2727m.f2883dQ[c0415c.f2658b].f2431s;
                }
            } else if (enumC0422d != EnumC0422d.event) {
                this.f2728n[i] = 0.0f;
                GameEngine.m1145b("Unsupported blend type:" + enumC0422d);
            }
        }
    }

    /* renamed from: a */
    void m5165a(boolean z) {
        C1101m c1101m = this.f2720a.f2818l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            if (c0415c.f2657a == EnumC0422d.event) {
                c0415c.m5249a(this.f2727m, this.f2722c, this.f2721b, z);
            }
        }
    }

    /* renamed from: b */
    void m5163b(boolean z) {
        float m5246b;
        C1101m c1101m = this.f2720a.f2818l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            EnumC0422d enumC0422d = c0415c.f2657a;
            if (enumC0422d != EnumC0422d.frame || this.f2727m.f6948eh || z) {
                if (z) {
                    m5246b = 0.0f;
                    if (enumC0422d == EnumC0422d.scale) {
                        m5246b = 1.0f;
                    } else if (enumC0422d == EnumC0422d.frame) {
                        m5246b = this.f2727m.f2861w.f2927X;
                    } else if (enumC0422d == EnumC0422d.legAlpha) {
                        m5246b = 1.0f;
                        C0384ay[] c0384ayArr = this.f2727m.f2861w.f3220aw;
                        if (c0384ayArr != null && c0415c.f2658b < c0384ayArr.length) {
                            m5246b = c0384ayArr[c0415c.f2658b].f2300r;
                        }
                    }
                } else {
                    m5246b = c0415c.m5246b(this.f2721b);
                }
                if (this.f2732k > 0.0f && enumC0422d != EnumC0422d.frame) {
                    m5246b = (m5246b * (1.0f - this.f2732k)) + (this.f2728n[i] * this.f2732k);
                }
                if (enumC0422d == EnumC0422d.frame) {
                    this.f2727m.f2839a = (int) m5246b;
                } else if (enumC0422d == EnumC0422d.scale) {
                    this.f2727m.f2841c = m5246b;
                } else if (enumC0422d == EnumC0422d.legX) {
                    if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                        C0394h c0394h = this.f2727m.f2883dQ[c0415c.f2658b];
                        c0394h.f2423p = m5246b;
                        c0394h.f2421k = true;
                        c0394h.f2430o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legY) {
                    if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                        C0394h c0394h2 = this.f2727m.f2883dQ[c0415c.f2658b];
                        c0394h2.f2424q = m5246b;
                        c0394h2.f2421k = true;
                        c0394h2.f2430o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legDir) {
                    if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                        this.f2727m.f2883dQ[c0415c.f2658b].f2425r = m5246b;
                    }
                } else if (enumC0422d == EnumC0422d.legHeight) {
                    if (this.f2727m.f2883dQ != null && c0415c.f2658b < this.f2727m.f2883dQ.length) {
                        this.f2727m.f2883dQ[c0415c.f2658b].f2426d = m5246b;
                    }
                } else if (enumC0422d == EnumC0422d.legAlpha) {
                    C0394h[] c0394hArr = this.f2727m.f2883dQ;
                    if (c0394hArr != null && c0415c.f2658b < c0394hArr.length) {
                        c0394hArr[c0415c.f2658b].f2431s = m5246b;
                    }
                } else if (enumC0422d != EnumC0422d.turretX && enumC0422d == EnumC0422d.event) {
                    c0415c.m5249a(this.f2727m, this.f2722c, this.f2721b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m5168a(C0441f c0441f) {
        return this.f2730e && this.f2720a == c0441f;
    }
}
