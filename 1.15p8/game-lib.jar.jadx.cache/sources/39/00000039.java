package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ax */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ax.class */
public class C0371ax {

    /* renamed from: a */
    int f2204a;

    /* renamed from: b */
    String f2205b;

    /* renamed from: c */
    boolean f2206c;

    /* renamed from: d */
    public float f2207d;

    /* renamed from: e */
    public float f2208e;

    /* renamed from: f */
    public float f2209f;

    /* renamed from: g */
    public float f2210g;

    /* renamed from: h */
    public float f2211h;

    /* renamed from: i */
    public boolean f2212i;

    /* renamed from: m */
    public boolean f2213m;

    /* renamed from: n */
    public LogicBoolean f2214n;

    /* renamed from: t */
    public float f2215t;

    /* renamed from: u */
    public BitmapOrTexture f2216u;

    /* renamed from: v */
    public boolean f2217v;

    /* renamed from: w */
    public float f2218w;

    /* renamed from: x */
    public BitmapOrTexture f2219x;

    /* renamed from: y */
    public BitmapOrTexture[] f2220y;

    /* renamed from: z */
    public BitmapOrTexture f2221z;

    /* renamed from: A */
    public boolean f2200A;

    /* renamed from: D */
    public boolean f2201D;

    /* renamed from: O */
    public int[] f2202O;

    /* renamed from: P */
    public float f2203P;

    /* renamed from: j */
    public float f2222j = 1.0f;

    /* renamed from: k */
    public boolean f2223k = true;

    /* renamed from: l */
    public boolean f2224l = false;

    /* renamed from: o */
    public float f2225o = 1.0f;

    /* renamed from: p */
    public float f2226p = 1.0f;

    /* renamed from: q */
    public float f2227q = 0.0f;

    /* renamed from: r */
    public float f2228r = 3.0f;

    /* renamed from: s */
    public float f2229s = 0.3f;

    /* renamed from: B */
    public boolean f2230B = true;

    /* renamed from: C */
    public boolean f2231C = true;

    /* renamed from: E */
    public boolean f2232E = true;

    /* renamed from: F */
    public boolean f2233F = true;

    /* renamed from: G */
    public float f2234G = 7.0f;

    /* renamed from: H */
    public int f2235H = 3;

    /* renamed from: I */
    public boolean f2236I = true;

    /* renamed from: J */
    public float f2237J = 16.0f;

    /* renamed from: K */
    public float f2238K = 50.0f;

    /* renamed from: L */
    public boolean f2239L = false;

    /* renamed from: M */
    public boolean f2240M = false;

    /* renamed from: N */
    public float f2241N = 0.0f;

    /* renamed from: a */
    public void m3493a(C0371ax c0371ax) {
        this.f2207d = c0371ax.f2207d;
        this.f2208e = c0371ax.f2208e;
        this.f2209f = c0371ax.f2209f;
        this.f2210g = c0371ax.f2210g;
        this.f2211h = c0371ax.f2211h;
        this.f2212i = c0371ax.f2212i;
        this.f2222j = c0371ax.f2222j;
        this.f2223k = c0371ax.f2223k;
        this.f2224l = c0371ax.f2224l;
        this.f2227q = c0371ax.f2227q;
        this.f2213m = c0371ax.f2213m;
        this.f2225o = c0371ax.f2225o;
        this.f2226p = c0371ax.f2226p;
        this.f2228r = c0371ax.f2228r;
        this.f2215t = c0371ax.f2215t;
        this.f2216u = c0371ax.f2216u;
        this.f2218w = c0371ax.f2218w;
        this.f2217v = c0371ax.f2217v;
        this.f2219x = c0371ax.f2219x;
        this.f2220y = c0371ax.f2220y;
        this.f2221z = c0371ax.f2221z;
        this.f2200A = c0371ax.f2200A;
        this.f2230B = c0371ax.f2230B;
        this.f2231C = c0371ax.f2231C;
        this.f2229s = c0371ax.f2229s;
        this.f2201D = c0371ax.f2201D;
        this.f2232E = c0371ax.f2232E;
        this.f2233F = c0371ax.f2233F;
        this.f2234G = c0371ax.f2234G;
        this.f2235H = c0371ax.f2235H;
        this.f2236I = c0371ax.f2236I;
        this.f2237J = c0371ax.f2237J;
        this.f2238K = c0371ax.f2238K;
        this.f2239L = c0371ax.f2239L;
        this.f2240M = c0371ax.f2240M;
        this.f2241N = c0371ax.f2241N;
        this.f2203P = c0371ax.f2203P;
    }

    /* renamed from: a */
    public static void m3492a(C0371ax c0371ax, CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, boolean z, ArrayList arrayList) {
        String str2 = customUnitMetadata.f2732B;
        if (!z) {
            c0371ax.f2212i = true;
            c0371ax.f2233F = false;
        }
        int intValue = unitConfig.getStaticIntegerValue(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            c0371ax.m3493a((C0371ax) arrayList.get(intValue - 1));
        }
        c0371ax.f2207d = unitConfig.m607i(str, "x");
        c0371ax.f2208e = unitConfig.m607i(str, "y");
        c0371ax.f2205b = str.replace("_", VariableScope.nullOrMissingString);
        c0371ax.f2206c = z;
        Float staticFloatValue = unitConfig.getStaticFloatValue(str, "attach_x", (Float) null);
        if (staticFloatValue != null) {
            c0371ax.f2210g = staticFloatValue.floatValue();
        }
        Float staticFloatValue2 = unitConfig.getStaticFloatValue(str, "attach_y", (Float) null);
        if (staticFloatValue2 != null) {
            c0371ax.f2211h = staticFloatValue2.floatValue();
        }
        c0371ax.f2209f = unitConfig.getStaticFloatValue(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        c0371ax.f2212i = unitConfig.getStaticBooleanValue(str, "lockMovement", Boolean.valueOf(c0371ax.f2212i)).booleanValue();
        c0371ax.f2222j = unitConfig.getStaticFloatValue(str, "estimatingPositionMultiplier", Float.valueOf(c0371ax.f2222j)).floatValue();
        c0371ax.f2214n = unitConfig.getLogicBooleanValue(customUnitMetadata, str, "hidden", c0371ax.f2214n);
        c0371ax.f2213m = c0371ax.f2214n == LogicBoolean.trueBoolean;
        c0371ax.f2225o = unitConfig.getStaticFloatValue(str, "alpha", Float.valueOf(c0371ax.f2225o)).floatValue();
        Float staticFloatValue3 = unitConfig.getStaticFloatValue(str, "moveSpeed", (Float) null);
        if (staticFloatValue3 != null) {
            c0371ax.f2226p = staticFloatValue3.floatValue();
        }
        c0371ax.f2227q = unitConfig.m631b(str, "moveWarmUp", Float.valueOf(c0371ax.f2227q)).floatValue();
        c0371ax.f2228r = unitConfig.getStaticFloatValue(str, "rotateSpeed", Float.valueOf(c0371ax.f2228r)).floatValue();
        Float staticFloatValue4 = unitConfig.getStaticFloatValue(str, "resetAngle", (Float) null);
        if (staticFloatValue4 != null) {
            c0371ax.f2215t = staticFloatValue4.floatValue();
        }
        boolean booleanValue = unitConfig.getStaticBooleanValue(str, "image_end_teamColors", (Boolean) false).booleanValue();
        BitmapOrTexture image = customUnitMetadata.getImage(unitConfig, str, "image_foot");
        if (image != null) {
            c0371ax.f2219x = image;
            if (booleanValue) {
                c0371ax.f2220y = customUnitMetadata.m3119a(c0371ax.f2219x, customUnitMetadata.hueColor);
            } else {
                c0371ax.f2220y = null;
            }
        }
        BitmapOrTexture image2 = customUnitMetadata.getImage(unitConfig, str, "image_end");
        if (image2 != null) {
            c0371ax.f2219x = image2;
            if (booleanValue) {
                c0371ax.f2220y = customUnitMetadata.m3119a(c0371ax.f2219x, customUnitMetadata.hueColor);
            } else {
                c0371ax.f2220y = null;
            }
        }
        BitmapOrTexture image3 = customUnitMetadata.getImage(unitConfig, str, "image_foot_shadow");
        if (image3 != null) {
            c0371ax.f2221z = image3;
        }
        BitmapOrTexture image4 = customUnitMetadata.getImage(unitConfig, str, "image_end_shadow");
        if (image4 != null) {
            c0371ax.f2221z = image4;
        }
        BitmapOrTexture image5 = customUnitMetadata.getImage(unitConfig, str, "image_leg");
        if (image5 != null) {
            c0371ax.f2216u = image5;
        }
        BitmapOrTexture image6 = customUnitMetadata.getImage(unitConfig, str, "image_middle");
        if (image6 != null) {
            c0371ax.f2216u = image6;
        }
        Float staticFloatValue5 = unitConfig.getStaticFloatValue(str, "heightSpeed", (Float) null);
        if (staticFloatValue5 != null) {
            c0371ax.f2229s = staticFloatValue5.floatValue();
        }
        Boolean staticBooleanValue = unitConfig.getStaticBooleanValue(str, "draw_foot_on_top", (Boolean) null);
        if (staticBooleanValue != null) {
            c0371ax.f2201D = staticBooleanValue.booleanValue();
        }
        Boolean staticBooleanValue2 = unitConfig.getStaticBooleanValue(str, "dust_effect", (Boolean) null);
        if (staticBooleanValue2 != null) {
            c0371ax.f2232E = staticBooleanValue2.booleanValue();
        }
        Boolean staticBooleanValue3 = unitConfig.getStaticBooleanValue(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (staticBooleanValue3 != null) {
            c0371ax.f2230B = staticBooleanValue3.booleanValue();
            c0371ax.f2200A = true;
        }
        Boolean staticBooleanValue4 = unitConfig.getStaticBooleanValue(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (staticBooleanValue4 != null) {
            c0371ax.f2231C = staticBooleanValue4.booleanValue();
            c0371ax.f2200A = true;
        }
        if (!c0371ax.f2200A && !c0371ax.f2212i && !c0371ax.f2239L) {
            if (customUnitMetadata.f2842cL < 30) {
                c0371ax.f2230B = false;
            }
            if (customUnitMetadata.f2842cL < 20) {
                c0371ax.f2231C = false;
            }
        }
        Boolean staticBooleanValue5 = unitConfig.getStaticBooleanValue(str, "explodeOnDeath", (Boolean) null);
        if (staticBooleanValue5 != null) {
            c0371ax.f2233F = staticBooleanValue5.booleanValue();
        }
        Float staticFloatValue6 = unitConfig.getStaticFloatValue(str, "holdDisMin", (Float) null);
        if (staticFloatValue6 != null) {
            c0371ax.f2234G = staticFloatValue6.floatValue();
        }
        c0371ax.f2235H = unitConfig.getStaticIntegerValue(str, "holdDisMin_maxMovingLegs", Integer.valueOf(c0371ax.f2235H)).intValue();
        c0371ax.f2236I = unitConfig.getStaticBooleanValue(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(c0371ax.f2236I)).booleanValue();
        c0371ax.f2223k = unitConfig.getStaticBooleanValue(str, "holdDisMin_checkNeighbours", Boolean.valueOf(c0371ax.f2223k)).booleanValue();
        c0371ax.f2224l = unitConfig.getStaticBooleanValue(str, "favourOppositeSideNeighbours", Boolean.valueOf(c0371ax.f2224l)).booleanValue();
        Float staticFloatValue7 = unitConfig.getStaticFloatValue(str, "holdDisMax", (Float) null);
        if (staticFloatValue7 != null) {
            c0371ax.f2237J = staticFloatValue7.floatValue();
        }
        Float staticFloatValue8 = unitConfig.getStaticFloatValue(str, "hardLimit", (Float) null);
        if (staticFloatValue8 != null) {
            c0371ax.f2238K = staticFloatValue8.floatValue();
        }
        c0371ax.f2239L = unitConfig.getStaticBooleanValue(str, "drawOverBody", Boolean.valueOf(c0371ax.f2239L)).booleanValue();
        if (c0371ax.f2239L) {
            customUnitMetadata.f3044as = true;
        }
        c0371ax.f2240M = unitConfig.getStaticBooleanValue(str, "drawUnderAllUnits", Boolean.valueOf(c0371ax.f2240M)).booleanValue();
        if (c0371ax.f2240M) {
            customUnitMetadata.f3045at = true;
        }
        if (c0371ax.f2240M && c0371ax.f2239L) {
            throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
        }
        c0371ax.f2241N = unitConfig.getStaticFloatValue(str, "drawDirOffset", Float.valueOf(c0371ax.f2241N)).floatValue();
        c0371ax.f2203P = unitConfig.getStaticFloatValue(str, "spinRate", Float.valueOf(c0371ax.f2203P)).floatValue();
    }
}