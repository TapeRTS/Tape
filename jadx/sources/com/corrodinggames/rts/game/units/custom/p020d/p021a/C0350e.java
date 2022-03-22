package com.corrodinggames.rts.game.units.custom.p020d.p021a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a/e.class */
public class C0350e extends AbstractC0346a {
    public C0350e() {
        this.f2351h = true;
        this.f2350g = true;
        this.f2344a = "hp";
        this.f2345b = C0311ag.m3102a("hp");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: a */
    public double mo3007a(AbstractC0210af afVar) {
        return afVar.f1484bY;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: a */
    public void mo3006a(AbstractC0210af afVar, double d) {
        afVar.f1484bY = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: b */
    public void mo3005b(AbstractC0210af afVar, double d) {
        afVar.f1484bY = (float) (afVar.f1484bY + d);
    }
}
