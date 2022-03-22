package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/af.class */
public class C0310af {

    /* renamed from: a */
    int f2009a;

    /* renamed from: b */
    String f2010b;

    /* renamed from: c */
    boolean f2011c;

    /* renamed from: d */
    public float f2012d;

    /* renamed from: e */
    public float f2013e;

    /* renamed from: f */
    public float f2014f;

    /* renamed from: g */
    public float f2015g;

    /* renamed from: h */
    public float f2016h;

    /* renamed from: i */
    public boolean f2017i;

    /* renamed from: m */
    public boolean f2021m;

    /* renamed from: n */
    public LogicBoolean f2022n;

    /* renamed from: t */
    public float f2028t;

    /* renamed from: u */
    public C0748e f2029u;

    /* renamed from: v */
    public boolean f2030v;

    /* renamed from: w */
    public float f2031w;

    /* renamed from: x */
    public C0748e f2032x;

    /* renamed from: y */
    public C0748e[] f2033y;

    /* renamed from: z */
    public C0748e f2034z;

    /* renamed from: A */
    public boolean f2035A;

    /* renamed from: D */
    public boolean f2038D;

    /* renamed from: O */
    public int[] f2049O;

    /* renamed from: P */
    public float f2050P;

    /* renamed from: j */
    public float f2018j = 1.0f;

    /* renamed from: k */
    public boolean f2019k = true;

    /* renamed from: l */
    public boolean f2020l = false;

    /* renamed from: o */
    public float f2023o = 1.0f;

    /* renamed from: p */
    public float f2024p = 1.0f;

    /* renamed from: q */
    public float f2025q = 0.0f;

    /* renamed from: r */
    public float f2026r = 3.0f;

    /* renamed from: s */
    public float f2027s = 0.3f;

    /* renamed from: B */
    public boolean f2036B = true;

    /* renamed from: C */
    public boolean f2037C = true;

    /* renamed from: E */
    public boolean f2039E = true;

    /* renamed from: F */
    public boolean f2040F = true;

    /* renamed from: G */
    public float f2041G = 7.0f;

    /* renamed from: H */
    public int f2042H = 3;

    /* renamed from: I */
    public boolean f2043I = true;

    /* renamed from: J */
    public float f2044J = 16.0f;

    /* renamed from: K */
    public float f2045K = 50.0f;

    /* renamed from: L */
    public boolean f2046L = false;

    /* renamed from: M */
    public boolean f2047M = false;

    /* renamed from: N */
    public float f2048N = 0.0f;

    /* renamed from: a */
    public void m3105a(C0310af afVar) {
        this.f2012d = afVar.f2012d;
        this.f2013e = afVar.f2013e;
        this.f2014f = afVar.f2014f;
        this.f2015g = afVar.f2015g;
        this.f2016h = afVar.f2016h;
        this.f2017i = afVar.f2017i;
        this.f2018j = afVar.f2018j;
        this.f2019k = afVar.f2019k;
        this.f2020l = afVar.f2020l;
        this.f2025q = afVar.f2025q;
        this.f2021m = afVar.f2021m;
        this.f2023o = afVar.f2023o;
        this.f2024p = afVar.f2024p;
        this.f2026r = afVar.f2026r;
        this.f2028t = afVar.f2028t;
        this.f2029u = afVar.f2029u;
        this.f2031w = afVar.f2031w;
        this.f2030v = afVar.f2030v;
        this.f2032x = afVar.f2032x;
        this.f2033y = afVar.f2033y;
        this.f2034z = afVar.f2034z;
        this.f2035A = afVar.f2035A;
        this.f2036B = afVar.f2036B;
        this.f2037C = afVar.f2037C;
        this.f2027s = afVar.f2027s;
        this.f2038D = afVar.f2038D;
        this.f2039E = afVar.f2039E;
        this.f2040F = afVar.f2040F;
        this.f2041G = afVar.f2041G;
        this.f2042H = afVar.f2042H;
        this.f2043I = afVar.f2043I;
        this.f2044J = afVar.f2044J;
        this.f2045K = afVar.f2045K;
        this.f2046L = afVar.f2046L;
        this.f2047M = afVar.f2047M;
        this.f2048N = afVar.f2048N;
        this.f2050P = afVar.f2050P;
    }

    /* renamed from: a */
    public static void m3104a(C0310af afVar, C0368l lVar, C0809ab abVar, String str, boolean z, ArrayList arrayList) {
        String str2 = lVar.f2506x;
        if (!z) {
            afVar.f2017i = true;
            afVar.f2040F = false;
        }
        int intValue = abVar.m580b(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            afVar.m3105a((C0310af) arrayList.get(intValue - 1));
        }
        afVar.f2012d = abVar.m560h(str, "x");
        afVar.f2013e = abVar.m560h(str, "y");
        afVar.f2010b = str.replace("_", "");
        afVar.f2011c = z;
        Float a = abVar.m592a(str, "attach_x", (Float) null);
        if (a != null) {
            afVar.f2015g = a.floatValue();
        }
        Float a2 = abVar.m592a(str, "attach_y", (Float) null);
        if (a2 != null) {
            afVar.f2016h = a2.floatValue();
        }
        afVar.f2014f = abVar.m592a(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        afVar.f2017i = abVar.m594a(str, "lockMovement", Boolean.valueOf(afVar.f2017i)).booleanValue();
        afVar.f2018j = abVar.m592a(str, "estimatingPositionMultiplier", Float.valueOf(afVar.f2018j)).floatValue();
        afVar.f2022n = abVar.m608a(lVar, str, "hidden", afVar.f2022n);
        afVar.f2021m = afVar.f2022n == LogicBoolean.trueBoolean;
        afVar.f2023o = abVar.m592a(str, "alpha", Float.valueOf(afVar.f2023o)).floatValue();
        Float a3 = abVar.m592a(str, "moveSpeed", (Float) null);
        if (a3 != null) {
            afVar.f2024p = a3.floatValue();
        }
        afVar.f2025q = abVar.m581b(str, "moveWarmUp", Float.valueOf(afVar.f2025q)).floatValue();
        afVar.f2026r = abVar.m592a(str, "rotateSpeed", Float.valueOf(afVar.f2026r)).floatValue();
        Float a4 = abVar.m592a(str, "resetAngle", (Float) null);
        if (a4 != null) {
            afVar.f2028t = a4.floatValue();
        }
        boolean booleanValue = abVar.m594a(str, "image_end_teamColors", (Boolean) false).booleanValue();
        C0748e a5 = lVar.m2784a(abVar, str, "image_foot");
        if (a5 != null) {
            afVar.f2032x = a5;
            if (booleanValue) {
                afVar.f2033y = lVar.m2785a(afVar.f2032x, lVar.f2529U);
            } else {
                afVar.f2033y = null;
            }
        }
        C0748e a6 = lVar.m2784a(abVar, str, "image_end");
        if (a6 != null) {
            afVar.f2032x = a6;
            if (booleanValue) {
                afVar.f2033y = lVar.m2785a(afVar.f2032x, lVar.f2529U);
            } else {
                afVar.f2033y = null;
            }
        }
        C0748e a7 = lVar.m2784a(abVar, str, "image_foot_shadow");
        if (a7 != null) {
            afVar.f2034z = a7;
        }
        C0748e a8 = lVar.m2784a(abVar, str, "image_end_shadow");
        if (a8 != null) {
            afVar.f2034z = a8;
        }
        C0748e a9 = lVar.m2784a(abVar, str, "image_leg");
        if (a9 != null) {
            afVar.f2029u = a9;
        }
        C0748e a10 = lVar.m2784a(abVar, str, "image_middle");
        if (a10 != null) {
            afVar.f2029u = a10;
        }
        Float a11 = abVar.m592a(str, "heightSpeed", (Float) null);
        if (a11 != null) {
            afVar.f2027s = a11.floatValue();
        }
        Boolean a12 = abVar.m594a(str, "draw_foot_on_top", (Boolean) null);
        if (a12 != null) {
            afVar.f2038D = a12.booleanValue();
        }
        Boolean a13 = abVar.m594a(str, "dust_effect", (Boolean) null);
        if (a13 != null) {
            afVar.f2039E = a13.booleanValue();
        }
        Boolean a14 = abVar.m594a(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (a14 != null) {
            afVar.f2036B = a14.booleanValue();
            afVar.f2035A = true;
        }
        Boolean a15 = abVar.m594a(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (a15 != null) {
            afVar.f2037C = a15.booleanValue();
            afVar.f2035A = true;
        }
        if (!afVar.f2035A && !afVar.f2017i && !afVar.f2046L) {
            if (lVar.f2672cH < 30) {
                afVar.f2036B = false;
            }
            if (lVar.f2672cH < 20) {
                afVar.f2037C = false;
            }
        }
        Boolean a16 = abVar.m594a(str, "explodeOnDeath", (Boolean) null);
        if (a16 != null) {
            afVar.f2040F = a16.booleanValue();
        }
        Float a17 = abVar.m592a(str, "holdDisMin", (Float) null);
        if (a17 != null) {
            afVar.f2041G = a17.floatValue();
        }
        afVar.f2042H = abVar.m580b(str, "holdDisMin_maxMovingLegs", Integer.valueOf(afVar.f2042H)).intValue();
        afVar.f2043I = abVar.m594a(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(afVar.f2043I)).booleanValue();
        afVar.f2019k = abVar.m594a(str, "holdDisMin_checkNeighbours", Boolean.valueOf(afVar.f2019k)).booleanValue();
        afVar.f2020l = abVar.m594a(str, "favourOppositeSideNeighbours", Boolean.valueOf(afVar.f2020l)).booleanValue();
        Float a18 = abVar.m592a(str, "holdDisMax", (Float) null);
        if (a18 != null) {
            afVar.f2044J = a18.floatValue();
        }
        Float a19 = abVar.m592a(str, "hardLimit", (Float) null);
        if (a19 != null) {
            afVar.f2045K = a19.floatValue();
        }
        afVar.f2046L = abVar.m594a(str, "drawOverBody", Boolean.valueOf(afVar.f2046L)).booleanValue();
        if (afVar.f2046L) {
            lVar.f2548an = true;
        }
        afVar.f2047M = abVar.m594a(str, "drawUnderAllUnits", Boolean.valueOf(afVar.f2047M)).booleanValue();
        if (afVar.f2047M) {
            lVar.f2549ao = true;
        }
        if (!afVar.f2047M || !afVar.f2046L) {
            afVar.f2048N = abVar.m592a(str, "drawDirOffset", Float.valueOf(afVar.f2048N)).floatValue();
            afVar.f2050P = abVar.m592a(str, "spinRate", Float.valueOf(afVar.f2050P)).floatValue();
            return;
        }
        throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
    }
}
