package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0310af;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/c.class */
public class C0330c extends AbstractC0328a {

    /* renamed from: a */
    public static final AbstractC0328a f2228a = new C0330c();

    /* renamed from: b */
    static final Rect f2229b = new Rect();

    /* renamed from: c */
    static final RectF f2230c = new RectF();

    /* renamed from: d */
    static final Paint f2231d = new Paint();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        C0573e c;
        C0368l lVar = kVar.f2460v;
        C0331d[] dVarArr = kVar.f2475ds;
        if (dVarArr != null) {
            if (f == 0.0f || kVar.f2444f <= 0.3d) {
                C0336i cV = kVar.m3306cV();
                if (cV != null && cV.f2282t) {
                    return;
                }
                if (kVar.f1501cp == null || cV != null) {
                    AbstractC0789l u = AbstractC0789l.m638u();
                    float f2 = kVar.f1471bL;
                    if (lVar.f2707dq) {
                        f2 = kVar.f1499cn[lVar.f2708dr.f2116e].f1561a;
                    }
                    float f3 = kVar.f5842dH - kVar.f2472dp;
                    float f4 = kVar.f5843dI - kVar.f2473dq;
                    float f5 = f2 - kVar.f2474dr;
                    boolean z = (f3 == 0.0f && f4 == 0.0f && f5 == 0.0f) ? false : true;
                    kVar.f2472dp = kVar.f5842dH;
                    kVar.f2473dq = kVar.f5843dI;
                    kVar.f2474dr = f2;
                    PointF n = kVar.m2148n(15.0f);
                    float f6 = n.f224a;
                    float f7 = n.f225b;
                    if (!(f6 == 0.0f && f7 == 0.0f)) {
                        float a = C0654f.m1520a(0.0f, 0.0f, f6, f7);
                        float d = C0654f.m1446d(0.0f, 0.0f, f6, f7);
                        float f8 = a * 240.0f;
                        if (f8 > 15.0f) {
                            f8 = 15.0f;
                        }
                        f6 = C0654f.m1421i(d) * f8;
                        f7 = C0654f.m1425h(d) * f8;
                    }
                    int i = 0;
                    float f9 = 0.0f;
                    int i2 = 0;
                    for (int i3 = 0; i3 < dVarArr.length; i3++) {
                        C0331d dVar = dVarArr[i3];
                        C0310af afVar = lVar.f2547am[i3];
                        boolean z2 = false;
                        boolean z3 = false;
                        if (dVar.f2244m) {
                            z2 = true;
                            dVar.f2244m = false;
                            dVar.f2246o = true;
                            if (dVar.f2245n) {
                                z3 = true;
                            }
                            dVar.f2245n = false;
                        }
                        if (!afVar.f2017i) {
                            if (z) {
                                dVar.f2233b -= f3;
                                dVar.f2234c -= f4;
                                dVar.f2246o = true;
                            }
                        } else if (z && f5 != 0.0f) {
                            C0654f.f4588c.m4141a(dVar.f2233b, dVar.f2234c);
                            C0654f.m1519a(0.0f, 0.0f, f5, C0654f.f4588c);
                            dVar.f2233b = C0654f.f4588c.f224a;
                            dVar.f2234c = C0654f.f4588c.f225b;
                            dVar.f2240i += f5;
                            dVar.f2246o = true;
                        }
                        if (!afVar.f2021m) {
                            if (afVar.f2050P != 0.0f) {
                                dVar.f2249r += afVar.f2050P * f;
                                dVar.f2249r %= 360.0f;
                            }
                            if (dVar.f2246o) {
                                float i4 = C0654f.m1421i(f2);
                                float h = C0654f.m1425h(f2);
                                float f10 = afVar.f2012d + dVar.f2247p;
                                float f11 = afVar.f2013e + dVar.f2248q;
                                dVar.f2237f = (i4 * f11) - (h * f10);
                                dVar.f2238g = (h * f11) + (i4 * f10);
                                if (z2) {
                                    dVar.f2233b = dVar.f2237f;
                                    dVar.f2234c = dVar.f2238g;
                                    dVar.f2240i = f2 + afVar.f2014f;
                                    dVar.f2246o = true;
                                    if (z3) {
                                        dVar.f2233b *= 0.6f;
                                        dVar.f2234c *= 0.6f;
                                        dVar.f2235d = -3.0f;
                                    }
                                }
                                if (!afVar.f2017i) {
                                    dVar.f2237f += f6 * afVar.f2018j;
                                    dVar.f2238g += f7 * afVar.f2018j;
                                }
                                dVar.f2239h = C0654f.m1520a(dVar.f2233b, dVar.f2234c, dVar.f2237f, dVar.f2238g);
                                if (dVar.f2239h > f9) {
                                    i2 = i3;
                                    f9 = dVar.f2239h;
                                }
                                if (dVar.f2242k && !afVar.f2017i) {
                                    i++;
                                }
                            }
                        }
                    }
                    for (int i5 = 0; i5 < dVarArr.length; i5++) {
                        C0331d dVar2 = dVarArr[i5];
                        C0310af afVar2 = lVar.f2547am[i5];
                        if (!afVar2.f2021m) {
                            if (dVar2.f2239h > 90000.0f) {
                                dVar2.f2233b = afVar2.f2012d;
                                dVar2.f2234c = afVar2.f2013e;
                            } else if (dVar2.f2239h > afVar2.f2045K * afVar2.f2045K) {
                                float d2 = C0654f.m1446d(dVar2.f2237f, dVar2.f2238g, dVar2.f2233b, dVar2.f2234c);
                                dVar2.f2233b = dVar2.f2237f + (C0654f.m1421i(d2) * afVar2.f2045K);
                                dVar2.f2234c = dVar2.f2238g + (C0654f.m1425h(d2) * afVar2.f2045K);
                                dVar2.f2242k = true;
                            }
                            if (!dVar2.f2242k && dVar2.f2235d <= 0.1f && i < afVar2.f2042H && (i5 == i2 || !afVar2.f2043I)) {
                                boolean z4 = false;
                                if (afVar2.f2019k) {
                                    for (int i6 = 0; i6 < afVar2.f2049O.length; i6++) {
                                        if (dVarArr[afVar2.f2049O[i6]].f2242k) {
                                            z4 = true;
                                        }
                                    }
                                }
                                float f12 = afVar2.f2041G;
                                if (z4) {
                                    f12 = afVar2.f2044J;
                                }
                                if (dVar2.f2239h > f12 * f12) {
                                    dVar2.f2242k = true;
                                    i++;
                                }
                            }
                            if (afVar2.f2017i) {
                                dVar2.f2242k = true;
                            }
                            if (!dVar2.f2242k) {
                                dVar2.f2236e = 0.0f;
                                if (dVar2.f2235d > 0.0f) {
                                    dVar2.f2235d -= f * afVar2.f2027s;
                                    if (dVar2.f2235d <= 0.0f) {
                                        dVar2.f2235d = 0.0f;
                                        float f13 = kVar.f5842dH + dVar2.f2233b;
                                        float f14 = kVar.f5843dI + dVar2.f2234c;
                                        dVar2.f2243l = C0851y.m414b(f13, f14);
                                        if (afVar2.f2039E && !dVar2.f2241j) {
                                            dVar2.f2241j = true;
                                            if (dVar2.f2243l) {
                                                if (u.f5580cK && kVar.f5839dE) {
                                                    u.f5517bz.m2008a(f13, f14, dVar2.f2235d, 0, 0.0f, 0.0f);
                                                }
                                            } else if (u.f5579cJ && kVar.f5839dE && (c = u.f5517bz.m1986c(f13, f14, dVar2.f2235d, dVar2.f2240i, 0)) != null) {
                                                c.f3869Q = 0.0f;
                                                c.f3870R = 0.0f;
                                                c.f3860H = 1.6f;
                                                c.f3859G = 2.8f;
                                            }
                                        }
                                    }
                                } else if (dVar2.f2243l && dVar2.f2235d > -3.0f) {
                                    dVar2.f2235d -= f * 0.3f;
                                }
                            } else if (dVar2.f2235d > 2.0f || afVar2.f2017i) {
                                float f15 = f * afVar2.f2024p;
                                if (dVar2.f2239h <= f15 * f15) {
                                    dVar2.f2233b = dVar2.f2237f;
                                    dVar2.f2234c = dVar2.f2238g;
                                    dVar2.f2246o = true;
                                    dVar2.f2242k = false;
                                } else {
                                    float d3 = C0654f.m1446d(dVar2.f2233b, dVar2.f2234c, dVar2.f2237f, dVar2.f2238g);
                                    dVar2.f2233b += C0654f.m1421i(d3) * f15;
                                    dVar2.f2234c += C0654f.m1425h(d3) * f15;
                                    dVar2.f2246o = true;
                                }
                                if (afVar2.f2017i && dVar2.f2235d > 0.0f) {
                                    dVar2.f2235d -= f * afVar2.f2027s;
                                    if (dVar2.f2235d <= 0.0f) {
                                        dVar2.f2235d = 0.0f;
                                    }
                                }
                                dVar2.f2240i += C0654f.m1457c(dVar2.f2240i, f2 + afVar2.f2014f, afVar2.f2026r * f);
                                dVar2.f2241j = false;
                            } else if (dVar2.f2236e < afVar2.f2025q) {
                                dVar2.f2236e += f;
                            } else {
                                dVar2.f2235d += f * afVar2.f2027s;
                            }
                        }
                    }
                    return;
                }
                for (C0331d dVar3 : dVarArr) {
                    dVar3.f2244m = true;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3058a(C0367k kVar, float f, boolean z, boolean z2) {
        C0331d[] dVarArr = kVar.f2475ds;
        if (dVarArr != null) {
            C0368l lVar = kVar.f2460v;
            float f2 = kVar.f1471bL;
            if (lVar.f2707dq) {
                f2 = kVar.f1499cn[lVar.f2708dr.f2116e].f1561a;
            }
            AbstractC0789l u = AbstractC0789l.m638u();
            if (kVar.f1480bU || kVar.f1479bT) {
                for (int i = 0; i < lVar.f2547am.length; i++) {
                    dVarArr[i].f2244m = true;
                }
                kVar.m2821di();
            }
            float cn = kVar.mo2831cn();
            Paint paint = null;
            for (int i2 = 0; i2 < dVarArr.length; i2++) {
                C0310af afVar = lVar.f2547am[i2];
                if ((afVar.f2046L == z || afVar.f2034z != null) && afVar.f2047M == z2 && !afVar.f2021m && (afVar.f2022n == null || !afVar.f2022n.read(kVar))) {
                    C0331d dVar = dVarArr[i2];
                    if (dVar.f2250s > 0.0f) {
                        float f3 = kVar.f5844dJ + dVar.f2235d;
                        if (paint == null) {
                            paint = kVar.mo2269aK();
                        }
                        Paint paint2 = paint;
                        float f4 = 1.0f;
                        if (f3 < -0.3f) {
                            f4 = kVar.m2155l(f3) * 0.003921569f;
                        }
                        if (dVar.f2250s < 1.0f) {
                            f4 *= dVar.f2250s;
                        }
                        if (f4 < 1.0f) {
                            int i3 = (int) (255.0f * f4);
                            if (paint2.m4155f() != i3) {
                                f2231d.m4183a(paint2);
                                int f5 = f2231d.m4155f();
                                if (f5 < i3) {
                                    i3 = f5;
                                }
                                f2231d.m4164c(i3);
                                paint2 = f2231d;
                            }
                        }
                        float f6 = (kVar.f5842dH + dVar.f2233b) - u.f5547cd;
                        float f7 = (((kVar.f5843dI + dVar.f2234c) - u.f5548ce) - dVar.f2235d) - kVar.f5844dJ;
                        AbstractC0755l lVar2 = u.f5514bw;
                        if (cn != 1.0f) {
                            lVar2.mo125j();
                            lVar2.mo198a(cn, cn, f6, f7);
                        }
                        if (afVar.f2034z != null && !z && u.f5582cM && dVar.f2235d + kVar.f5844dJ > 0.0f) {
                            lVar2.mo176a(afVar.f2034z, f6, f7 + dVar.f2235d + kVar.f5844dJ, dVar.f2240i + dVar.f2249r + afVar.f2048N, AbstractC0515r.f3452au);
                        }
                        if (afVar.f2046L == z) {
                            C0748e eVar = afVar.f2032x;
                            if (afVar.f2033y != null) {
                                eVar = afVar.f2033y[kVar.f1461bB.m3518M()];
                            }
                            if (!afVar.f2038D && ((u.f5583cN || afVar.f2037C) && eVar != null)) {
                                lVar2.mo176a(eVar, f6, f7, dVar.f2240i + dVar.f2249r + afVar.f2048N, paint2);
                            }
                            C0748e eVar2 = afVar.f2029u;
                            if (eVar2 != null && (u.f5583cN || afVar.f2036B)) {
                                float f8 = eVar2.f5250p;
                                float f9 = f8;
                                float i4 = C0654f.m1421i(f2);
                                float h = C0654f.m1425h(f2);
                                float f10 = (i4 * afVar.f2016h) - (h * afVar.f2015g);
                                float f11 = (h * afVar.f2016h) + (i4 * afVar.f2015g);
                                float d = C0654f.m1446d(dVar.f2233b, dVar.f2234c, f10, f11);
                                float a = C0654f.m1520a(dVar.f2233b, dVar.f2234c, f10, f11);
                                if (a < (f8 - 2.0f) * (f8 - 2.0f)) {
                                    f9 = C0654f.m1515a((int) a);
                                }
                                lVar2.mo125j();
                                lVar2.mo199a(d + 90.0f, f6, f7);
                                f2229b.m4136a(0, (int) (f8 - f9), eVar2.f5245k, (int) (f8 + f9));
                                f2230c.m4122a(f6 - eVar2.f5247m, f7 - f9, f6 + eVar2.f5247m, f7 + f9);
                                lVar2.mo169a(eVar2, f2229b, f2230c, paint2);
                                lVar2.mo124k();
                            }
                            if (afVar.f2038D && ((u.f5583cN || afVar.f2037C) && eVar != null)) {
                                lVar2.mo176a(eVar, f6, f7, dVar.f2240i + dVar.f2249r + afVar.f2048N, paint2);
                            }
                        }
                        if (cn != 1.0f) {
                            lVar2.mo124k();
                        }
                    }
                }
            }
        }
    }
}
