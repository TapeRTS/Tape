package com.corrodinggames.rts.game.units.custom.p020d.p021a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a/c.class */
public class C0348c extends AbstractC0346a {
    public C0348c() {
        this.f2351h = true;
        this.f2350g = true;
        this.f2344a = "credits";
        this.f2345b = C0311ag.m3212a("$");
    }

    /* renamed from: a */
    public double mo3117a(AbstractC0210af afVar) {
        return afVar.f1441bB.money;
    }

    /* renamed from: a */
    public void mo3116a(AbstractC0210af afVar, double d) {
        afVar.f1441bB.money = (int) d;
    }

    /* renamed from: b */
    public void mo3115b(AbstractC0210af afVar, double d) {
        AbstractC0171m mVar = afVar.f1441bB;
        mVar.money = (int) (mVar.money + d);
    }
}
