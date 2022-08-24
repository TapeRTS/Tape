package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/m.class */
public class C0455m {

    /* renamed from: a */
    public boolean f3306a;

    /* renamed from: b */
    public float f3307b;

    /* renamed from: c */
    public int f3308c;

    /* renamed from: d */
    public int f3309d;

    /* renamed from: e */
    public float f3310e;

    /* renamed from: a */
    public static C0455m m4074a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        C0455m c0455m = new C0455m();
        c0455m.f3306a = c1072ab.m694a(str, str2 + "direction_useMainTurret", (Boolean) false).booleanValue();
        c0455m.f3307b = c1072ab.m692a(str, str2 + "direction_units", Float.valueOf(0.0f)).floatValue();
        c0455m.f3308c = c1072ab.m676b(str, str2 + "direction_strideX", (Integer) (-1)).intValue();
        c0455m.f3309d = c1072ab.m676b(str, str2 + "direction_strideY", (Integer) (-1)).intValue();
        c0455m.f3310e = c1072ab.m692a(str, str2 + "direction_starting", Float.valueOf(0.0f)).floatValue();
        if (c0455m.f3307b == 0.0f) {
            return null;
        }
        return c0455m;
    }
}
