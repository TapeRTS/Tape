package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/m.class */
public class C0370m {

    /* renamed from: a */
    public boolean f2851a;

    /* renamed from: b */
    public float f2852b;

    /* renamed from: c */
    public int f2853c;

    /* renamed from: d */
    public int f2854d;

    /* renamed from: e */
    public float f2855e;

    /* renamed from: a */
    public static C0370m m2728a(C0368l lVar, C0809ab abVar, String str, String str2, boolean z) {
        C0370m mVar = new C0370m();
        mVar.f2851a = abVar.m594a(str, str2 + "direction_useMainTurret", (Boolean) false).booleanValue();
        mVar.f2852b = abVar.m592a(str, str2 + "direction_units", Float.valueOf(0.0f)).floatValue();
        mVar.f2853c = abVar.m580b(str, str2 + "direction_strideX", (Integer) (-1)).intValue();
        mVar.f2854d = abVar.m580b(str, str2 + "direction_strideY", (Integer) (-1)).intValue();
        mVar.f2855e = abVar.m592a(str, str2 + "direction_starting", Float.valueOf(0.0f)).floatValue();
        if (mVar.f2852b == 0.0f) {
            return null;
        }
        return mVar;
    }
}
