package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0384ay;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class C0393g extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2409a = new C0393g();

    /* renamed from: b */
    static final Rect f2410b = new Rect();

    /* renamed from: c */
    static final RectF f2411c = new RectF();

    /* renamed from: d */
    static final Paint f2412d = new Paint();

    /* renamed from: b */
    public void mo5310b(C0451j c0451j, float f) {
        C0745e m2534c;
        C0453l c0453l = c0451j.f2861w;
        C0394h[] c0394hArr = c0451j.f2883dQ;
        if (c0394hArr == null) {
            return;
        }
        if (f != 0.0f && c0451j.f2844f > 0.3d) {
            return;
        }
        C0399m dl = c0451j.m5778dl();
        if (dl != null && dl.f2474t) {
            return;
        }
        if (c0451j.f1650cL != null && dl == null) {
            for (C0394h c0394h : c0394hArr) {
                c0394h.f2428m = true;
            }
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        float f2 = c0451j.direction;
        if (c0453l.f3072dz) {
            f2 = c0451j.f1648cJ[c0453l.f3073dA.f2546e].f1711a;
        }
        float f3 = c0451j.f6951ek - c0451j.f2879dM;
        float f4 = c0451j.f6952el - c0451j.f2880dN;
        float f5 = c0451j.height - c0451j.f2881dO;
        float f6 = f2 - c0451j.f2882dP;
        boolean z = (f3 == 0.0f && f4 == 0.0f && f6 == 0.0f) ? false : true;
        c0451j.f2879dM = c0451j.f6951ek;
        c0451j.f2880dN = c0451j.f6952el;
        c0451j.f2881dO = c0451j.height;
        c0451j.f2882dP = f2;
        PointF n = c0451j.m3035n(15.0f);
        float f7 = n.x;
        float f8 = n.y;
        if (f7 != 0.0f || f8 != 0.0f) {
            float m2366a = CommonUtils.m2366a(0.0f, 0.0f, f7, f8);
            float m2280d = CommonUtils.m2280d(0.0f, 0.0f, f7, f8);
            float f9 = m2366a * 240.0f;
            if (f9 > 15.0f) {
                f9 = 15.0f;
            }
            f7 = CommonUtils.m2249i(m2280d) * f9;
            f8 = CommonUtils.sin(m2280d) * f9;
        }
        int i = 0;
        float f10 = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < c0394hArr.length; i3++) {
            C0394h c0394h2 = c0394hArr[i3];
            C0384ay c0384ay = c0453l.f3220aw[i3];
            boolean z2 = false;
            boolean z3 = false;
            if (c0394h2.f2428m) {
                z2 = true;
                c0394h2.f2428m = false;
                c0394h2.f2430o = true;
                if (c0394h2.f2429n) {
                    z3 = true;
                }
                c0394h2.f2429n = false;
            }
            if (!c0384ay.f2296h) {
                c0394h2.f2426d -= f5;
            }
            if (!c0384ay.f2279l) {
                if (z) {
                    c0394h2.f2414b -= f3;
                    c0394h2.f2415c -= f4;
                    c0394h2.f2430o = true;
                }
            } else if (z && f6 != 0.0f) {
                CommonUtils.f4884c.m7213a(c0394h2.f2414b, c0394h2.f2415c);
                CommonUtils.m2365a(0.0f, 0.0f, f6, CommonUtils.f4884c);
                c0394h2.f2414b = CommonUtils.f4884c.x;
                c0394h2.f2415c = CommonUtils.f4884c.y;
                c0394h2.f2420i += f6;
                c0394h2.f2430o = true;
            }
            if (!c0384ay.f2280p) {
                if (c0384ay.f2293T != 0.0f) {
                    c0394h2.f2425r += c0384ay.f2293T * f;
                    c0394h2.f2425r %= 360.0f;
                }
                if (c0394h2.f2430o) {
                    float m2249i = CommonUtils.m2249i(f2);
                    float sin = CommonUtils.sin(f2);
                    float f11 = c0384ay.f2274d + c0394h2.f2423p;
                    float f12 = c0384ay.f2275e + c0394h2.f2424q;
                    c0394h2.f2417f = (m2249i * f12) - (sin * f11);
                    c0394h2.f2418g = (sin * f12) + (m2249i * f11);
                    if (z2) {
                        c0394h2.f2414b = c0394h2.f2417f;
                        c0394h2.f2415c = c0394h2.f2418g;
                        c0394h2.f2420i = f2 + c0384ay.f2276i;
                        c0394h2.f2430o = true;
                        if (z3) {
                            c0394h2.f2414b *= 0.6f;
                            c0394h2.f2415c *= 0.6f;
                            c0394h2.f2426d = -3.0f;
                        }
                    }
                    if (!c0384ay.f2279l) {
                        c0394h2.f2417f += f7 * c0384ay.f2297m;
                        c0394h2.f2418g += f8 * c0384ay.f2297m;
                    }
                    c0394h2.f2419h = CommonUtils.m2366a(c0394h2.f2414b, c0394h2.f2415c, c0394h2.f2417f, c0394h2.f2418g);
                    if (c0394h2.f2419h > f10) {
                        i2 = i3;
                        f10 = c0394h2.f2419h;
                    }
                    if (c0394h2.f2421k && !c0384ay.f2279l) {
                        i++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < c0394hArr.length; i4++) {
            C0394h c0394h3 = c0394hArr[i4];
            C0384ay c0384ay2 = c0453l.f3220aw[i4];
            if (!c0384ay2.f2280p) {
                float f13 = c0384ay2.f2295g;
                if (!c0384ay2.f2296h) {
                    f13 -= c0451j.height;
                }
                float f14 = f13 + c0384ay2.f2294f;
                if (c0394h3.f2419h > 90000.0f) {
                    c0394h3.f2414b = c0384ay2.f2274d;
                    c0394h3.f2415c = c0384ay2.f2275e;
                } else if (c0394h3.f2419h > c0384ay2.f2313O * c0384ay2.f2313O) {
                    float m2280d2 = CommonUtils.m2280d(c0394h3.f2417f, c0394h3.f2418g, c0394h3.f2414b, c0394h3.f2415c);
                    c0394h3.f2414b = c0394h3.f2417f + (CommonUtils.m2249i(m2280d2) * c0384ay2.f2313O);
                    c0394h3.f2415c = c0394h3.f2418g + (CommonUtils.sin(m2280d2) * c0384ay2.f2313O);
                    c0394h3.f2421k = true;
                }
                if (!c0394h3.f2421k && c0394h3.f2426d <= f13 + 0.1f && i < c0384ay2.f2310L && (i4 == i2 || !c0384ay2.f2311M)) {
                    boolean z4 = false;
                    if (c0384ay2.f2298n) {
                        for (int i5 = 0; i5 < c0384ay2.f2292S.length; i5++) {
                            if (c0394hArr[c0384ay2.f2292S[i5]].f2421k) {
                                z4 = true;
                            }
                        }
                    }
                    float f15 = c0384ay2.f2309K;
                    if (z4) {
                        f15 = c0384ay2.f2312N;
                    }
                    if (c0394h3.f2419h > f15 * f15) {
                        c0394h3.f2421k = true;
                        i++;
                    }
                }
                if (c0384ay2.f2279l) {
                    c0394h3.f2421k = true;
                }
                if (c0394h3.f2421k) {
                    if (c0394h3.f2426d > f14 || c0384ay2.f2279l) {
                        float f16 = f * c0384ay2.f2301s;
                        if (c0394h3.f2419h <= f16 * f16) {
                            c0394h3.f2414b = c0394h3.f2417f;
                            c0394h3.f2415c = c0394h3.f2418g;
                            c0394h3.f2430o = true;
                            c0394h3.f2421k = false;
                        } else {
                            float m2280d3 = CommonUtils.m2280d(c0394h3.f2414b, c0394h3.f2415c, c0394h3.f2417f, c0394h3.f2418g);
                            c0394h3.f2414b += CommonUtils.m2249i(m2280d3) * f16;
                            c0394h3.f2415c += CommonUtils.sin(m2280d3) * f16;
                            c0394h3.f2430o = true;
                        }
                        if (c0384ay2.f2279l && c0394h3.f2426d > f13) {
                            c0394h3.f2426d -= f * c0384ay2.f2304v;
                            if (c0394h3.f2426d <= f13) {
                                c0394h3.f2426d = f13;
                            }
                        }
                        c0394h3.f2420i += CommonUtils.m2292c(c0394h3.f2420i, f2 + c0384ay2.f2276i, c0384ay2.f2303u * f);
                        c0394h3.f2427j = false;
                    } else if (c0394h3.f2416e < c0384ay2.f2302t) {
                        c0394h3.f2416e += f;
                    } else {
                        c0394h3.f2426d += f * c0384ay2.f2304v;
                    }
                } else {
                    c0394h3.f2416e = 0.0f;
                    if (c0394h3.f2426d > f13) {
                        c0394h3.f2426d -= f * c0384ay2.f2304v;
                        if (c0394h3.f2426d <= f13) {
                            c0394h3.f2426d = f13;
                            float f17 = c0451j.f6951ek + c0394h3.f2414b;
                            float f18 = c0451j.f6952el + c0394h3.f2415c;
                            c0394h3.f2422l = C1117y.m476c(f17, f18);
                            if (c0384ay2.f2307I && !c0394h3.f2427j) {
                                c0394h3.f2427j = true;
                                if (c0394h3.f2422l) {
                                    if (gameEngine.f6253dc && c0451j.f6948eh) {
                                        gameEngine.effects.m2556a(f17, f18, c0394h3.f2426d, 0, 0.0f, 0.0f);
                                    }
                                } else if (gameEngine.f6252db && c0451j.f6948eh && (m2534c = gameEngine.effects.m2534c(f17, f18, c0394h3.f2426d, c0394h3.f2420i, 0)) != null) {
                                    m2534c.f4739Q = 0.0f;
                                    m2534c.f4740R = 0.0f;
                                    m2534c.f4730H = 1.6f;
                                    m2534c.f4729G = 2.8f;
                                }
                            }
                        }
                    } else if (c0394h3.f2422l && c0394h3.f2426d > (-3.0f) + f13) {
                        c0394h3.f2426d -= f * 0.3f;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5315a(C0451j c0451j, float f, boolean z, boolean z2) {
        C0394h[] c0394hArr = c0451j.f2883dQ;
        if (c0394hArr == null) {
            return;
        }
        C0453l c0453l = c0451j.f2861w;
        float f2 = c0451j.direction;
        if (c0453l.f3072dz) {
            f2 = c0451j.f1648cJ[c0453l.f3073dA.f2546e].f1711a;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (c0451j.f1627co || c0451j.f1626cn) {
            for (int i = 0; i < c0453l.f3220aw.length; i++) {
                c0394hArr[i].f2428m = true;
            }
            c0451j.m4842dy();
        }
        float m4907cC = c0451j.m4907cC();
        Paint paint = null;
        boolean z3 = gameEngine.f6256df || c0451j.f1626cn;
        for (int i2 = 0; i2 < c0394hArr.length; i2++) {
            C0384ay c0384ay = c0453l.f3220aw[i2];
            if ((c0384ay.f2314P == z || c0384ay.f2289D != null) && c0384ay.f2315Q == z2 && !c0384ay.f2280p && (c0384ay.f2281q == null || !c0384ay.f2281q.read(c0451j))) {
                C0394h c0394h = c0394hArr[i2];
                if (c0394h.f2431s > 0.0f) {
                    float f3 = c0451j.height + c0394h.f2426d;
                    if (paint == null) {
                        paint = c0451j.m4976aN();
                    }
                    Paint paint2 = paint;
                    float f4 = 1.0f;
                    if (f3 < -0.3f) {
                        f4 = c0451j.m3042l(f3) * 0.003921569f;
                    }
                    if (c0394h.f2431s < 1.0f) {
                        f4 *= c0394h.f2431s;
                    }
                    if (f4 < 1.0f) {
                        int i3 = (int) (255.0f * f4);
                        if (paint2.m7228f() != i3) {
                            f2412d.m7259a(paint2);
                            int m7228f = f2412d.m7228f();
                            if (m7228f < i3) {
                                i3 = m7228f;
                            }
                            f2412d.m7237c(i3);
                            paint2 = f2412d;
                        }
                    }
                    float f5 = (c0451j.f6951ek + c0394h.f2414b) - gameEngine.f6138cv;
                    float f6 = (((c0451j.f6952el + c0394h.f2415c) - gameEngine.f6139cw) - c0394h.f2426d) - c0451j.height;
                    InterfaceC1027y interfaceC1027y = gameEngine.graphics;
                    if (m4907cC != 1.0f) {
                        interfaceC1027y.mo878k();
                        interfaceC1027y.mo933a(m4907cC, m4907cC, f5, f6);
                    }
                    if (c0384ay.f2289D != null && !z && gameEngine.f6255de && c0394h.f2426d + c0451j.height > 0.0f) {
                        interfaceC1027y.mo916a(c0384ay.f2289D, f5, f6 + c0394h.f2426d + c0451j.height, c0394h.f2420i + c0394h.f2425r + c0384ay.f2316R, c0451j.m3234R());
                    }
                    if (c0384ay.f2314P == z) {
                        BitmapOrTexture bitmapOrTexture = c0384ay.f2287B;
                        if (c0384ay.f2288C != null) {
                            bitmapOrTexture = c0384ay.f2288C[c0451j.team.getId()];
                        }
                        if (!c0384ay.f2291H && ((z3 || c0384ay.f2306G) && bitmapOrTexture != null)) {
                            interfaceC1027y.mo916a(bitmapOrTexture, f5, f6, c0394h.f2420i + c0394h.f2425r + c0384ay.f2316R, paint2);
                        }
                        BitmapOrTexture bitmapOrTexture2 = c0384ay.f2283x;
                        if (c0384ay.f2284y != null) {
                            bitmapOrTexture2 = c0384ay.f2284y[c0451j.team.getId()];
                        }
                        if (bitmapOrTexture2 != null && (z3 || c0384ay.f2305F)) {
                            float f7 = bitmapOrTexture2.f6401u;
                            float f8 = f7;
                            float m2249i = CommonUtils.m2249i(f2);
                            float sin = CommonUtils.sin(f2);
                            float f9 = (m2249i * c0384ay.f2278k) - (sin * c0384ay.f2277j);
                            float f10 = (sin * c0384ay.f2278k) + (m2249i * c0384ay.f2277j);
                            float m2280d = CommonUtils.m2280d(c0394h.f2414b, c0394h.f2415c, f9, f10);
                            float m2366a = CommonUtils.m2366a(c0394h.f2414b, c0394h.f2415c, f9, f10);
                            if (m2366a < (f7 - 2.0f) * (f7 - 2.0f)) {
                                f8 = CommonUtils.m2361a((int) m2366a);
                            }
                            interfaceC1027y.mo878k();
                            interfaceC1027y.mo934a(m2280d + 90.0f, f5, f6);
                            f2410b.m7208a(0, (int) (f7 - f8), bitmapOrTexture2.f6396p, (int) (f7 + f8));
                            f2411c.m7195a(f5 - bitmapOrTexture2.f6398r, f6 - f8, f5 + bitmapOrTexture2.f6398r, f6 + f8);
                            interfaceC1027y.mo909a(bitmapOrTexture2, f2410b, f2411c, paint2);
                            interfaceC1027y.mo877l();
                        }
                        if (c0384ay.f2291H && ((z3 || c0384ay.f2306G) && bitmapOrTexture != null)) {
                            interfaceC1027y.mo916a(bitmapOrTexture, f5, f6, c0394h.f2420i + c0394h.f2425r + c0384ay.f2316R, paint2);
                        }
                    }
                    if (m4907cC != 1.0f) {
                        interfaceC1027y.mo877l();
                    }
                }
            }
        }
    }
}
