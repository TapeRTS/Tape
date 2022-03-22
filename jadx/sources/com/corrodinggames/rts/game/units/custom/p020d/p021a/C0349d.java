package com.corrodinggames.rts.game.units.custom.p020d.p021a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a/d.class */
public class C0349d extends AbstractC0346a {
    public C0349d() {
        this.f2351h = true;
        this.f2350g = true;
        this.f2344a = "energy";
        this.f2345b = C0311ag.m3102a("energy");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: a */
    public double mo3007a(AbstractC0210af afVar) {
        return afVar.f1491cf;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: a */
    public void mo3006a(AbstractC0210af afVar, double d) {
        afVar.f1491cf = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.C0345a
    /* renamed from: b */
    public void mo3005b(AbstractC0210af afVar, double d) {
        afVar.f1491cf = (float) (afVar.f1491cf + d);
    }
}
