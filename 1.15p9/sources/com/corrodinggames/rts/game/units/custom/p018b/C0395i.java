package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/i.class */
public class C0395i extends AbstractC0387a {

    /* renamed from: a */
    LogicBoolean f2432a;

    /* renamed from: b */
    float f2433b;

    /* renamed from: c */
    float f2434c;

    /* renamed from: d */
    C0449h f2435d;

    /* renamed from: e */
    boolean f2436e;

    /* renamed from: a */
    public static void m4663a(C0453l c0453l, C1072ab c1072ab) {
        if (c1072ab.m657g("movement_repelFromUnits")) {
            C0395i c0395i = new C0395i();
            c0395i.m4662a(c0453l, c1072ab, "movement_repelFromUnits", "movement_repelFromUnits");
            if (!LogicBoolean.isStaticFalse(c0395i.f2432a)) {
                c0453l.m4148a(c0395i);
            }
        }
    }

    /* renamed from: a */
    public void m4662a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2432a = c1072ab.m716a(c0453l, str, "enabled");
        this.f2433b = c1072ab.m652i(str, "speed");
        this.f2434c = c1072ab.m692a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2435d = C0448g.m4410a(c1072ab.m675b(str, "otherUnitHasTag", (String) null), (C0449h) null);
        this.f2436e = c1072ab.m694a(str, "onlySameTeam", (Boolean) false).booleanValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo4659b(C0451j c0451j, float f) {
        if (!this.f2432a.read(c0451j)) {
        }
    }
}
