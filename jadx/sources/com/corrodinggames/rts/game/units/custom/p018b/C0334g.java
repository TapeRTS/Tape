package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class C0334g extends AbstractC0328a {

    /* renamed from: a */
    LogicBoolean f2258a;

    /* renamed from: b */
    float f2259b;

    /* renamed from: c */
    float f2260c;

    /* renamed from: d */
    int f2261d;

    /* renamed from: a */
    public static void m3053a(C0368l lVar, C0809ab abVar) {
        if (abVar.m563g("movement_random")) {
            C0334g gVar = new C0334g();
            gVar.m3052a(lVar, abVar, "movement_random", "movement_random");
            if (!LogicBoolean.isStaticFalse(gVar.f2258a)) {
                lVar.m2794a(gVar);
            }
        }
    }

    /* renamed from: a */
    public void m3052a(C0368l lVar, C0809ab abVar, String str, String str2) {
        this.f2258a = abVar.m611a(lVar, str, "enabled");
        this.f2259b = abVar.m560h(str, "speed");
        this.f2260c = abVar.m592a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2261d = abVar.m580b(str, "awayFromEdge", (Integer) 75).intValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        if (this.f2258a.read(kVar)) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (kVar.mo2208bd()) {
                if (C0654f.m1459c(kVar.f1467bH) < this.f2260c) {
                    kVar.f1467bH += C0654f.m1467b(kVar, -this.f2259b, this.f2259b, 1);
                }
                if (C0654f.m1459c(kVar.f1468bI) < this.f2260c) {
                    kVar.f1468bI += C0654f.m1467b(kVar, -this.f2259b, this.f2259b, 2);
                }
            } else {
                if (C0654f.m1459c(kVar.f1470bK) < this.f2260c) {
                    kVar.f1470bK += C0654f.m1467b(kVar, -this.f2259b, this.f2259b, 1);
                }
                kVar.f1471bL += C0654f.m1467b(kVar, -1.0f, 1.0f, 2);
            }
            if (this.f2261d > 0) {
                if (kVar.f5843dI > u.f5511bt.m3646g() - this.f2261d) {
                    kVar.f1468bI -= C0654f.m1467b(kVar, 0.0f, this.f2259b * 0.25f, 10);
                }
                if (kVar.f5843dI < this.f2261d) {
                    kVar.f1468bI += C0654f.m1467b(kVar, 0.0f, this.f2259b * 0.25f, 11);
                }
                if (kVar.f5842dH > u.f5511bt.m3649f() - this.f2261d) {
                    kVar.f1467bH -= C0654f.m1467b(kVar, 0.0f, this.f2259b * 0.25f, 12);
                }
                if (kVar.f5842dH < this.f2261d) {
                    kVar.f1467bH += C0654f.m1467b(kVar, 0.0f, this.f2259b * 0.25f, 13);
                }
            }
            kVar.f3446ao = true;
        }
    }
}
