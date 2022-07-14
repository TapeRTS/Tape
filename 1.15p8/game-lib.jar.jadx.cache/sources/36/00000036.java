package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p017b.C0378d;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;

/* renamed from: com.corrodinggames.rts.game.units.custom.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class C0410e {

    /* renamed from: a */
    public C0423f f2560a;

    /* renamed from: b */
    float f2561b;

    /* renamed from: c */
    float f2562c;

    /* renamed from: g */
    boolean f2563g;

    /* renamed from: h */
    boolean f2564h;

    /* renamed from: i */
    boolean f2565i;

    /* renamed from: j */
    int f2566j;

    /* renamed from: m */
    C0433j f2567m;

    /* renamed from: n */
    float[] f2568n;

    /* renamed from: d */
    float f2569d = 1.0f;

    /* renamed from: e */
    boolean f2570e = false;

    /* renamed from: f */
    boolean f2571f = false;

    /* renamed from: k */
    float f2572k = 0.0f;

    /* renamed from: l */
    float f2573l = 0.05f;

    public C0410e(C0433j c0433j) {
        this.f2567m = c0433j;
    }

    /* renamed from: a */
    public void m3349a(C0423f c0423f, int i) {
        m3348a(c0423f, i, false);
    }

    /* renamed from: a */
    public void m3348a(C0423f c0423f, int i, boolean z) {
        if (c0423f == null || !c0423f.m3272a()) {
            return;
        }
        if ((this.f2565i || (this.f2571f && this.f2570e)) && i <= this.f2566j && (!z || c0423f != this.f2560a)) {
            return;
        }
        this.f2565i = true;
        if (c0423f != this.f2560a || z || this.f2563g) {
            float f = 0.0f;
            if (this.f2560a != null && this.f2570e) {
                f = this.f2560a.f2646i;
            }
            this.f2560a = c0423f;
            this.f2566j = i;
            m3345c();
            this.f2571f = z;
            if (z) {
                this.f2564h = false;
            } else {
                this.f2564h = true;
            }
            this.f2561b = -1.0f;
            this.f2562c = -1.0f;
            this.f2569d = 1.0f;
            this.f2563g = false;
            float f2 = c0423f.f2645h;
            if (f > f2) {
                f2 = f;
            }
            if (f2 > 0.0f) {
                this.f2572k = 1.0f;
                this.f2573l = f2;
            } else {
                this.f2572k = 0.0f;
            }
        }
        this.f2570e = true;
    }

    /* renamed from: a */
    public void m3352a() {
        if (this.f2560a != null) {
            m3347a(true);
        }
        this.f2570e = false;
        this.f2560a = null;
        this.f2566j = -1;
    }

    /* renamed from: b */
    public void m3346b() {
        if (this.f2560a != null) {
            if (!this.f2563g) {
                float f = this.f2560a.f2646i;
                if (f > 0.0f) {
                    this.f2563g = true;
                    m3345c();
                    this.f2564h = false;
                    this.f2566j = -1;
                    this.f2572k = 1.0f;
                    this.f2573l = f;
                    return;
                }
            }
            m3347a(true);
        }
        this.f2570e = false;
        this.f2560a = null;
        this.f2566j = -1;
    }

    /* renamed from: a */
    public void m3351a(float f) {
        if (!this.f2570e) {
            return;
        }
        this.f2562c = this.f2561b;
        if (this.f2561b < 0.0f) {
            this.f2561b = 0.0f;
        }
        this.f2561b += this.f2569d * f;
        if (this.f2564h && !this.f2565i) {
            m3346b();
        }
        this.f2565i = false;
        if (this.f2570e) {
            if (this.f2572k > 0.0f) {
                this.f2572k -= this.f2573l * f;
            } else if (this.f2563g) {
                m3346b();
                return;
            }
            if (!this.f2563g && this.f2560a != null) {
                if (this.f2560a.f2644g) {
                    if (this.f2561b > this.f2560a.f2648m) {
                        this.f2561b = this.f2560a.f2648m;
                        this.f2569d = -1.0f;
                    } else if (this.f2561b < 0.0f) {
                        this.f2561b = 0.0f;
                        this.f2569d = 1.0f;
                        if (this.f2571f) {
                            m3346b();
                            if (!this.f2563g) {
                                return;
                            }
                        }
                    }
                } else if (this.f2561b > this.f2560a.f2648m) {
                    if (this.f2571f) {
                        m3346b();
                        if (!this.f2563g) {
                            return;
                        }
                    } else {
                        this.f2561b = 0.0f;
                        this.f2569d = 1.0f;
                    }
                }
            }
            boolean z = false;
            if (this.f2563g) {
                z = true;
            }
            m3347a(z);
        }
    }

    /* renamed from: c */
    void m3345c() {
        ObjectVector objectVector = this.f2560a.f2651k;
        if (this.f2568n == null || this.f2568n.length < objectVector.size()) {
            this.f2568n = new float[objectVector.size()];
        }
        for (int i = 0; i < objectVector.size(); i++) {
            C0398c c0398c = (C0398c) objectVector.get(i);
            EnumC0405d enumC0405d = c0398c.f2498a;
            if (enumC0405d == EnumC0405d.scale) {
                this.f2568n[i] = this.f2567m.f2712c;
            } else if (enumC0405d == EnumC0405d.frame) {
                this.f2568n[i] = -99.0f;
            } else if (enumC0405d == EnumC0405d.legX) {
                if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                    this.f2568n[i] = this.f2567m.f2723dM[c0398c.f2499b].f2268p;
                } else {
                    this.f2568n[i] = 0.0f;
                    GameEngine.log("setBaseBlendValues: Target leg out of range for: " + this.f2567m.getUnitType().mo3087i());
                }
            } else if (enumC0405d == EnumC0405d.legY) {
                if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                    this.f2568n[i] = this.f2567m.f2723dM[c0398c.f2499b].f2269q;
                }
            } else if (enumC0405d == EnumC0405d.legDir) {
                if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                    this.f2567m.f2723dM[c0398c.f2499b].f2270r = CommonUtils.m1739a(this.f2567m.f2723dM[c0398c.f2499b].f2270r, false);
                    this.f2568n[i] = this.f2567m.f2723dM[c0398c.f2499b].f2270r;
                }
            } else if (enumC0405d == EnumC0405d.legHeight) {
                if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                    this.f2568n[i] = this.f2567m.f2723dM[c0398c.f2499b].f2271d;
                }
            } else if (enumC0405d == EnumC0405d.legAlpha) {
                if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                    this.f2568n[i] = this.f2567m.f2723dM[c0398c.f2499b].f2276s;
                }
            } else if (enumC0405d != EnumC0405d.event) {
                this.f2568n[i] = 0.0f;
                GameEngine.log("Unsupported blend type:" + enumC0405d);
            }
        }
    }

    /* renamed from: a */
    void m3347a(boolean z) {
        float f;
        ObjectVector objectVector = this.f2560a.f2651k;
        for (int i = 0; i < objectVector.size(); i++) {
            C0398c c0398c = (C0398c) objectVector.get(i);
            EnumC0405d enumC0405d = c0398c.f2498a;
            if (enumC0405d != EnumC0405d.frame || this.f2567m.trailEffect || z) {
                if (z) {
                    f = 0.0f;
                    if (enumC0405d == EnumC0405d.scale) {
                        f = 1.0f;
                    } else if (enumC0405d == EnumC0405d.frame) {
                        f = this.f2567m.customUnitMetadataA.graphics_default_frame;
                    } else if (enumC0405d == EnumC0405d.legAlpha) {
                        f = 1.0f;
                        C0371ax[] c0371axArr = this.f2567m.customUnitMetadataA.f3043ar;
                        if (c0371axArr != null && c0398c.f2499b < c0371axArr.length) {
                            f = c0371axArr[c0398c.f2499b].f2225o;
                        }
                    }
                } else {
                    f = c0398c.m3417b(this.f2561b);
                }
                if (this.f2572k > 0.0f && enumC0405d != EnumC0405d.frame) {
                    f = (f * (1.0f - this.f2572k)) + (this.f2568n[i] * this.f2572k);
                }
                if (enumC0405d == EnumC0405d.frame) {
                    this.f2567m.f2681a = (int) f;
                } else if (enumC0405d == EnumC0405d.scale) {
                    this.f2567m.f2712c = f;
                } else if (enumC0405d == EnumC0405d.legX) {
                    if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                        C0378d c0378d = this.f2567m.f2723dM[c0398c.f2499b];
                        c0378d.f2268p = f;
                        c0378d.f2266k = true;
                        c0378d.f2275o = true;
                    }
                } else if (enumC0405d == EnumC0405d.legY) {
                    if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                        C0378d c0378d2 = this.f2567m.f2723dM[c0398c.f2499b];
                        c0378d2.f2269q = f;
                        c0378d2.f2266k = true;
                        c0378d2.f2275o = true;
                    }
                } else if (enumC0405d == EnumC0405d.legDir) {
                    if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                        this.f2567m.f2723dM[c0398c.f2499b].f2270r = f;
                    }
                } else if (enumC0405d == EnumC0405d.legHeight) {
                    if (this.f2567m.f2723dM != null && c0398c.f2499b < this.f2567m.f2723dM.length) {
                        this.f2567m.f2723dM[c0398c.f2499b].f2271d = f;
                    }
                } else if (enumC0405d == EnumC0405d.legAlpha) {
                    C0378d[] c0378dArr = this.f2567m.f2723dM;
                    if (c0378dArr != null && c0398c.f2499b < c0378dArr.length) {
                        c0378dArr[c0398c.f2499b].f2276s = f;
                    }
                } else if (enumC0405d != EnumC0405d.turretX && enumC0405d == EnumC0405d.event) {
                    c0398c.m3420a(this.f2567m, this.f2562c, this.f2561b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m3350a(C0423f c0423f) {
        return this.f2570e && this.f2560a == c0423f;
    }
}