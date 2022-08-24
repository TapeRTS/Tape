package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ay.class */
public class C0384ay {

    /* renamed from: a */
    int f2271a;

    /* renamed from: b */
    String f2272b;

    /* renamed from: c */
    boolean f2273c;

    /* renamed from: d */
    public float f2274d;

    /* renamed from: e */
    public float f2275e;

    /* renamed from: i */
    public float f2276i;

    /* renamed from: j */
    public float f2277j;

    /* renamed from: k */
    public float f2278k;

    /* renamed from: l */
    public boolean f2279l;

    /* renamed from: p */
    public boolean f2280p;

    /* renamed from: q */
    public LogicBoolean f2281q;

    /* renamed from: w */
    public float f2282w;

    /* renamed from: x */
    public BitmapOrTexture f2283x;

    /* renamed from: y */
    public BitmapOrTexture[] f2284y;

    /* renamed from: z */
    public boolean f2285z;

    /* renamed from: A */
    public float f2286A;

    /* renamed from: B */
    public BitmapOrTexture f2287B;

    /* renamed from: C */
    public BitmapOrTexture[] f2288C;

    /* renamed from: D */
    public BitmapOrTexture f2289D;

    /* renamed from: E */
    public boolean f2290E;

    /* renamed from: H */
    public boolean f2291H;

    /* renamed from: S */
    public int[] f2292S;

    /* renamed from: T */
    public float f2293T;

    /* renamed from: f */
    public float f2294f = 2.0f;

    /* renamed from: g */
    public float f2295g = 0.0f;

    /* renamed from: h */
    public boolean f2296h = true;

    /* renamed from: m */
    public float f2297m = 1.0f;

    /* renamed from: n */
    public boolean f2298n = true;

    /* renamed from: o */
    public boolean f2299o = false;

    /* renamed from: r */
    public float f2300r = 1.0f;

    /* renamed from: s */
    public float f2301s = 1.0f;

    /* renamed from: t */
    public float f2302t = 0.0f;

    /* renamed from: u */
    public float f2303u = 3.0f;

    /* renamed from: v */
    public float f2304v = 0.3f;

    /* renamed from: F */
    public boolean f2305F = true;

    /* renamed from: G */
    public boolean f2306G = true;

    /* renamed from: I */
    public boolean f2307I = true;

    /* renamed from: J */
    public boolean f2308J = true;

    /* renamed from: K */
    public float f2309K = 7.0f;

    /* renamed from: L */
    public int f2310L = 3;

    /* renamed from: M */
    public boolean f2311M = true;

    /* renamed from: N */
    public float f2312N = 16.0f;

    /* renamed from: O */
    public float f2313O = 50.0f;

    /* renamed from: P */
    public boolean f2314P = false;

    /* renamed from: Q */
    public boolean f2315Q = false;

    /* renamed from: R */
    public float f2316R = 0.0f;

    /* renamed from: a */
    public void m5344a(C0384ay c0384ay) {
        this.f2274d = c0384ay.f2274d;
        this.f2275e = c0384ay.f2275e;
        this.f2276i = c0384ay.f2276i;
        this.f2277j = c0384ay.f2277j;
        this.f2278k = c0384ay.f2278k;
        this.f2294f = c0384ay.f2294f;
        this.f2295g = c0384ay.f2295g;
        this.f2296h = c0384ay.f2296h;
        this.f2279l = c0384ay.f2279l;
        this.f2297m = c0384ay.f2297m;
        this.f2298n = c0384ay.f2298n;
        this.f2299o = c0384ay.f2299o;
        this.f2302t = c0384ay.f2302t;
        this.f2280p = c0384ay.f2280p;
        this.f2300r = c0384ay.f2300r;
        this.f2301s = c0384ay.f2301s;
        this.f2303u = c0384ay.f2303u;
        this.f2282w = c0384ay.f2282w;
        this.f2283x = c0384ay.f2283x;
        this.f2284y = c0384ay.f2284y;
        this.f2286A = c0384ay.f2286A;
        this.f2285z = c0384ay.f2285z;
        this.f2287B = c0384ay.f2287B;
        this.f2288C = c0384ay.f2288C;
        this.f2289D = c0384ay.f2289D;
        this.f2290E = c0384ay.f2290E;
        this.f2305F = c0384ay.f2305F;
        this.f2306G = c0384ay.f2306G;
        this.f2304v = c0384ay.f2304v;
        this.f2291H = c0384ay.f2291H;
        this.f2307I = c0384ay.f2307I;
        this.f2308J = c0384ay.f2308J;
        this.f2309K = c0384ay.f2309K;
        this.f2310L = c0384ay.f2310L;
        this.f2311M = c0384ay.f2311M;
        this.f2312N = c0384ay.f2312N;
        this.f2313O = c0384ay.f2313O;
        this.f2314P = c0384ay.f2314P;
        this.f2315Q = c0384ay.f2315Q;
        this.f2316R = c0384ay.f2316R;
        this.f2293T = c0384ay.f2293T;
    }

    /* renamed from: a */
    public static void m5343a(C0384ay c0384ay, C0453l c0453l, C1072ab c1072ab, String str, boolean z, ArrayList arrayList) {
        if (!z) {
            c0384ay.f2279l = true;
            c0384ay.f2308J = false;
        }
        int intValue = c1072ab.m682b(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            c0384ay.m5344a((C0384ay) arrayList.get(intValue - 1));
        }
        c0384ay.f2274d = c1072ab.m658i(str, "x");
        c0384ay.f2275e = c1072ab.m658i(str, "y");
        c0384ay.f2272b = str.replace("_", VariableScope.nullOrMissingString);
        c0384ay.f2273c = z;
        Float m698a = c1072ab.m698a(str, "attach_x", (Float) null);
        if (m698a != null) {
            c0384ay.f2277j = m698a.floatValue();
        }
        Float m698a2 = c1072ab.m698a(str, "attach_y", (Float) null);
        if (m698a2 != null) {
            c0384ay.f2278k = m698a2.floatValue();
        }
        c0384ay.f2294f = c1072ab.m698a(str, "liftingHeightOffset", Float.valueOf(c0384ay.f2294f)).floatValue();
        c0384ay.f2295g = c1072ab.m698a(str, "targetHeight", Float.valueOf(c0384ay.f2295g)).floatValue();
        c0384ay.f2296h = c1072ab.m700a(str, "targetHeightRelative", Boolean.valueOf(c0384ay.f2296h)).booleanValue();
        c0384ay.f2276i = c1072ab.m698a(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        c0384ay.f2279l = c1072ab.m700a(str, "lockMovement", Boolean.valueOf(c0384ay.f2279l)).booleanValue();
        c0384ay.f2297m = c1072ab.m698a(str, "estimatingPositionMultiplier", Float.valueOf(c0384ay.f2297m)).floatValue();
        c0384ay.f2281q = c1072ab.m719a(c0453l, str, "hidden", c0384ay.f2281q);
        c0384ay.f2280p = c0384ay.f2281q == LogicBoolean.trueBoolean;
        c0384ay.f2300r = c1072ab.m698a(str, "alpha", Float.valueOf(c0384ay.f2300r)).floatValue();
        Float m698a3 = c1072ab.m698a(str, "moveSpeed", (Float) null);
        if (m698a3 != null) {
            c0384ay.f2301s = m698a3.floatValue();
        }
        c0384ay.f2302t = c1072ab.m683b(str, "moveWarmUp", Float.valueOf(c0384ay.f2302t)).floatValue();
        c0384ay.f2303u = c1072ab.m698a(str, "rotateSpeed", Float.valueOf(c0384ay.f2303u)).floatValue();
        Float m698a4 = c1072ab.m698a(str, "resetAngle", (Float) null);
        if (m698a4 != null) {
            c0384ay.f2282w = m698a4.floatValue();
        }
        boolean booleanValue = c1072ab.m700a(str, "image_end_teamColors", (Boolean) false).booleanValue();
        BitmapOrTexture m4758a = c0453l.m4758a(c1072ab, str, "image_foot");
        if (m4758a != null) {
            c0384ay.f2287B = m4758a;
            if (booleanValue) {
                c0384ay.f2288C = c0453l.m4759a(c0384ay.f2287B, c0453l.f2931ab);
            } else {
                c0384ay.f2288C = null;
            }
        }
        BitmapOrTexture m4758a2 = c0453l.m4758a(c1072ab, str, "image_end");
        if (m4758a2 != null) {
            c0384ay.f2287B = m4758a2;
            if (booleanValue) {
                c0384ay.f2288C = c0453l.m4759a(c0384ay.f2287B, c0453l.f2931ab);
            } else {
                c0384ay.f2288C = null;
            }
        }
        BitmapOrTexture m4758a3 = c0453l.m4758a(c1072ab, str, "image_foot_shadow");
        if (m4758a3 != null) {
            c0384ay.f2289D = m4758a3;
        }
        BitmapOrTexture m4758a4 = c0453l.m4758a(c1072ab, str, "image_end_shadow");
        if (m4758a4 != null) {
            c0384ay.f2289D = m4758a4;
        }
        BitmapOrTexture m4758a5 = c0453l.m4758a(c1072ab, str, "image_leg");
        if (m4758a5 != null) {
            c0384ay.f2283x = m4758a5;
        }
        BitmapOrTexture m4758a6 = c0453l.m4758a(c1072ab, str, "image_middle");
        if (m4758a6 != null) {
            c0384ay.f2283x = m4758a6;
        }
        boolean booleanValue2 = c1072ab.m700a(str, "image_middle_teamColors", (Boolean) false).booleanValue();
        if (c0384ay.f2283x != null && booleanValue2) {
            c0384ay.f2284y = c0453l.m4759a(c0384ay.f2283x, c0453l.f2931ab);
        } else {
            c0384ay.f2284y = null;
        }
        Float m698a5 = c1072ab.m698a(str, "heightSpeed", (Float) null);
        if (m698a5 != null) {
            c0384ay.f2304v = m698a5.floatValue();
        }
        Boolean m700a = c1072ab.m700a(str, "draw_foot_on_top", (Boolean) null);
        if (m700a != null) {
            c0384ay.f2291H = m700a.booleanValue();
        }
        Boolean m700a2 = c1072ab.m700a(str, "dust_effect", (Boolean) null);
        if (m700a2 != null) {
            c0384ay.f2307I = m700a2.booleanValue();
        }
        Boolean m700a3 = c1072ab.m700a(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (m700a3 != null) {
            c0384ay.f2305F = m700a3.booleanValue();
            c0384ay.f2290E = true;
        }
        Boolean m700a4 = c1072ab.m700a(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (m700a4 != null) {
            c0384ay.f2306G = m700a4.booleanValue();
            c0384ay.f2290E = true;
        }
        if (!c0384ay.f2290E && !c0384ay.f2279l && !c0384ay.f2314P) {
            if (c0453l.f3045cR < 30) {
                c0384ay.f2305F = false;
            }
            if (c0453l.f3045cR < 20) {
                c0384ay.f2306G = false;
            }
        }
        Boolean m700a5 = c1072ab.m700a(str, "explodeOnDeath", (Boolean) null);
        if (m700a5 != null) {
            c0384ay.f2308J = m700a5.booleanValue();
        }
        Float m698a6 = c1072ab.m698a(str, "holdDisMin", (Float) null);
        if (m698a6 != null) {
            c0384ay.f2309K = m698a6.floatValue();
        }
        c0384ay.f2310L = c1072ab.m682b(str, "holdDisMin_maxMovingLegs", Integer.valueOf(c0384ay.f2310L)).intValue();
        c0384ay.f2311M = c1072ab.m700a(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(c0384ay.f2311M)).booleanValue();
        c0384ay.f2298n = c1072ab.m700a(str, "holdDisMin_checkNeighbours", Boolean.valueOf(c0384ay.f2298n)).booleanValue();
        c0384ay.f2299o = c1072ab.m700a(str, "favourOppositeSideNeighbours", Boolean.valueOf(c0384ay.f2299o)).booleanValue();
        Float m698a7 = c1072ab.m698a(str, "holdDisMax", (Float) null);
        if (m698a7 != null) {
            c0384ay.f2312N = m698a7.floatValue();
        }
        Float m698a8 = c1072ab.m698a(str, "hardLimit", (Float) null);
        if (m698a8 != null) {
            c0384ay.f2313O = m698a8.floatValue();
        }
        c0384ay.f2314P = c1072ab.m700a(str, "drawOverBody", Boolean.valueOf(c0384ay.f2314P)).booleanValue();
        if (c0384ay.f2314P) {
            c0453l.f3221ax = true;
        }
        c0384ay.f2315Q = c1072ab.m700a(str, "drawUnderAllUnits", Boolean.valueOf(c0384ay.f2315Q)).booleanValue();
        if (c0384ay.f2315Q) {
            c0453l.f3222ay = true;
        }
        if (c0384ay.f2315Q && c0384ay.f2314P) {
            throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
        }
        c0384ay.f2316R = c1072ab.m698a(str, "drawDirOffset", Float.valueOf(c0384ay.f2316R)).floatValue();
        c0384ay.f2293T = c1072ab.m698a(str, "spinRate", Float.valueOf(c0384ay.f2293T)).floatValue();
    }
}
