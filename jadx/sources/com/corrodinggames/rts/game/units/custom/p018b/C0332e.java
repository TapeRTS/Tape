package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/e.class */
public class C0332e extends AbstractC0328a {

    /* renamed from: a */
    LogicBoolean f2251a;

    /* renamed from: b */
    float f2252b;

    /* renamed from: c */
    float f2253c;

    /* renamed from: d */
    C0365i f2254d;

    /* renamed from: e */
    boolean f2255e;

    /* renamed from: a */
    public static void m3057a(C0368l lVar, C0809ab abVar) {
        if (abVar.m563g("movement_repelFromUnits")) {
            C0332e eVar = new C0332e();
            eVar.m3056a(lVar, abVar, "movement_repelFromUnits", "movement_repelFromUnits");
            if (!LogicBoolean.isStaticFalse(eVar.f2251a)) {
                lVar.m2794a(eVar);
            }
        }
    }

    /* renamed from: a */
    public void m3056a(C0368l lVar, C0809ab abVar, String str, String str2) {
        this.f2251a = abVar.m611a(lVar, str, "enabled");
        this.f2252b = abVar.m560h(str, "speed");
        this.f2253c = abVar.m592a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2254d = C0364h.m2900a(abVar.m579b(str, "otherUnitHasTag", (String) null), (C0365i) null);
        this.f2255e = abVar.m594a(str, "onlySameTeam", (Boolean) false).booleanValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        if (this.f2251a.read(kVar)) {
        }
    }
}
