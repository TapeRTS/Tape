package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p018b.C0331d;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class C0355e {

    /* renamed from: a */
    public C0362f f2379a;

    /* renamed from: b */
    float f2380b;

    /* renamed from: c */
    float f2381c;

    /* renamed from: g */
    boolean f2385g;

    /* renamed from: h */
    boolean f2386h;

    /* renamed from: i */
    boolean f2387i;

    /* renamed from: j */
    int f2388j;

    /* renamed from: m */
    C0367k f2391m;

    /* renamed from: n */
    float[] f2392n;

    /* renamed from: d */
    float f2382d = 1.0f;

    /* renamed from: e */
    boolean f2383e = false;

    /* renamed from: f */
    boolean f2384f = false;

    /* renamed from: k */
    float f2389k = 0.0f;

    /* renamed from: l */
    float f2390l = 0.05f;

    public C0355e(C0367k kVar) {
        this.f2391m = kVar;
    }

    /* renamed from: a */
    public void m2970a(C0362f fVar, int i) {
        m2969a(fVar, i, false);
    }

    /* renamed from: a */
    public void m2969a(C0362f fVar, int i, boolean z) {
        if (fVar != null && fVar.m2948a()) {
            if ((!this.f2387i && (!this.f2384f || !this.f2383e)) || i > this.f2388j || (z && fVar == this.f2379a)) {
                this.f2387i = true;
                if (fVar != this.f2379a || z || this.f2385g) {
                    float f = 0.0f;
                    if (this.f2379a != null && this.f2383e) {
                        f = this.f2379a.f2413i;
                    }
                    this.f2379a = fVar;
                    this.f2388j = i;
                    m2966c();
                    this.f2384f = z;
                    if (z) {
                        this.f2386h = false;
                    } else {
                        this.f2386h = true;
                    }
                    this.f2380b = -1.0f;
                    this.f2381c = -1.0f;
                    this.f2382d = 1.0f;
                    this.f2385g = false;
                    float f2 = fVar.f2412h;
                    if (f > f2) {
                        f2 = f;
                    }
                    if (f2 > 0.0f) {
                        this.f2389k = 1.0f;
                        this.f2390l = f2;
                    } else {
                        this.f2389k = 0.0f;
                    }
                }
                this.f2383e = true;
            }
        }
    }

    /* renamed from: a */
    public void m2973a() {
        if (this.f2379a != null) {
            m2968a(true);
        }
        this.f2383e = false;
        this.f2379a = null;
        this.f2388j = -1;
    }

    /* renamed from: b */
    public void m2967b() {
        if (this.f2379a != null) {
            if (!this.f2385g) {
                float f = this.f2379a.f2413i;
                if (f > 0.0f) {
                    this.f2385g = true;
                    m2966c();
                    this.f2386h = false;
                    this.f2388j = -1;
                    this.f2389k = 1.0f;
                    this.f2390l = f;
                    return;
                }
            }
            m2968a(true);
        }
        this.f2383e = false;
        this.f2379a = null;
        this.f2388j = -1;
    }

    /* renamed from: a */
    public void m2972a(float f) {
        if (this.f2383e) {
            this.f2381c = this.f2380b;
            if (this.f2380b < 0.0f) {
                this.f2380b = 0.0f;
            }
            this.f2380b += this.f2382d * f;
            if (this.f2386h && !this.f2387i) {
                m2967b();
            }
            this.f2387i = false;
            if (this.f2383e) {
                if (this.f2389k > 0.0f) {
                    this.f2389k -= this.f2390l * f;
                } else if (this.f2385g) {
                    m2967b();
                    return;
                }
                if (!this.f2385g && this.f2379a != null) {
                    if (this.f2379a.f2411g) {
                        if (this.f2380b > this.f2379a.f2417m) {
                            this.f2380b = this.f2379a.f2417m;
                            this.f2382d = -1.0f;
                        } else if (this.f2380b < 0.0f) {
                            this.f2380b = 0.0f;
                            this.f2382d = 1.0f;
                            if (this.f2384f) {
                                m2967b();
                                if (!this.f2385g) {
                                    return;
                                }
                            }
                        }
                    } else if (this.f2380b > this.f2379a.f2417m) {
                        if (this.f2384f) {
                            m2967b();
                            if (!this.f2385g) {
                                return;
                            }
                        } else {
                            this.f2380b = 0.0f;
                            this.f2382d = 1.0f;
                        }
                    }
                }
                boolean z = false;
                if (this.f2385g) {
                    z = true;
                }
                m2968a(z);
            }
        }
    }

    /* renamed from: c */
    void m2966c() {
        C0835m mVar = this.f2379a.f2415k;
        if (this.f2392n == null || this.f2392n.length < mVar.size()) {
            this.f2392n = new float[mVar.size()];
        }
        for (int i = 0; i < mVar.size(); i++) {
            C0337c cVar = (C0337c) mVar.get(i);
            EnumC0344d dVar = cVar.f2304a;
            if (dVar == EnumC0344d.scale) {
                this.f2392n[i] = this.f2391m.f2441c;
            } else if (dVar == EnumC0344d.frame) {
                this.f2392n[i] = -99.0f;
            } else if (dVar == EnumC0344d.legX) {
                if (this.f2391m.f2475ds == null || cVar.f2305b >= this.f2391m.f2475ds.length) {
                    this.f2392n[i] = 0.0f;
                    AbstractC0789l.m682b("setBaseBlendValues: Target leg out of range for: " + this.f2391m.mo1606r().mo2754i());
                } else {
                    this.f2392n[i] = this.f2391m.f2475ds[cVar.f2305b].f2247p;
                }
            } else if (dVar == EnumC0344d.legY) {
                if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                    this.f2392n[i] = this.f2391m.f2475ds[cVar.f2305b].f2248q;
                }
            } else if (dVar == EnumC0344d.legDir) {
                if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                    this.f2391m.f2475ds[cVar.f2305b].f2249r = C0654f.m1516a(this.f2391m.f2475ds[cVar.f2305b].f2249r, false);
                    this.f2392n[i] = this.f2391m.f2475ds[cVar.f2305b].f2249r;
                }
            } else if (dVar == EnumC0344d.legHeight) {
                if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                    this.f2392n[i] = this.f2391m.f2475ds[cVar.f2305b].f2235d;
                }
            } else if (dVar == EnumC0344d.legAlpha) {
                if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                    this.f2392n[i] = this.f2391m.f2475ds[cVar.f2305b].f2250s;
                }
            } else if (dVar != EnumC0344d.event) {
                this.f2392n[i] = 0.0f;
                AbstractC0789l.m682b("Unsupported blend type:" + dVar);
            }
        }
    }

    /* renamed from: a */
    void m2968a(boolean z) {
        float f;
        C0835m mVar = this.f2379a.f2415k;
        for (int i = 0; i < mVar.size(); i++) {
            C0337c cVar = (C0337c) mVar.get(i);
            EnumC0344d dVar = cVar.f2304a;
            if (dVar != EnumC0344d.frame || this.f2391m.f5839dE || z) {
                if (z) {
                    f = 0.0f;
                    if (dVar == EnumC0344d.scale) {
                        f = 1.0f;
                    } else if (dVar == EnumC0344d.frame) {
                        f = this.f2391m.f2460v.f2524P;
                    } else if (dVar == EnumC0344d.legAlpha) {
                        f = 1.0f;
                        C0310af[] afVarArr = this.f2391m.f2460v.f2547am;
                        if (afVarArr != null && cVar.f2305b < afVarArr.length) {
                            f = afVarArr[cVar.f2305b].f2023o;
                        }
                    }
                } else {
                    f = cVar.m3029b(this.f2380b);
                }
                if (this.f2389k > 0.0f && dVar != EnumC0344d.frame) {
                    f = (f * (1.0f - this.f2389k)) + (this.f2392n[i] * this.f2389k);
                }
                if (dVar == EnumC0344d.frame) {
                    this.f2391m.f2439a = (int) f;
                } else if (dVar == EnumC0344d.scale) {
                    this.f2391m.f2441c = f;
                } else if (dVar == EnumC0344d.legX) {
                    if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                        C0331d dVar2 = this.f2391m.f2475ds[cVar.f2305b];
                        dVar2.f2247p = f;
                        dVar2.f2242k = true;
                        dVar2.f2246o = true;
                    }
                } else if (dVar == EnumC0344d.legY) {
                    if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                        C0331d dVar3 = this.f2391m.f2475ds[cVar.f2305b];
                        dVar3.f2248q = f;
                        dVar3.f2242k = true;
                        dVar3.f2246o = true;
                    }
                } else if (dVar == EnumC0344d.legDir) {
                    if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                        this.f2391m.f2475ds[cVar.f2305b].f2249r = f;
                    }
                } else if (dVar == EnumC0344d.legHeight) {
                    if (this.f2391m.f2475ds != null && cVar.f2305b < this.f2391m.f2475ds.length) {
                        this.f2391m.f2475ds[cVar.f2305b].f2235d = f;
                    }
                } else if (dVar == EnumC0344d.legAlpha) {
                    C0331d[] dVarArr = this.f2391m.f2475ds;
                    if (dVarArr != null && cVar.f2305b < dVarArr.length) {
                        dVarArr[cVar.f2305b].f2250s = f;
                    }
                } else if (dVar != EnumC0344d.turretX && dVar == EnumC0344d.event) {
                    cVar.m3032a(this.f2391m, this.f2381c, this.f2380b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2971a(C0362f fVar) {
        return this.f2383e && this.f2379a == fVar;
    }
}
