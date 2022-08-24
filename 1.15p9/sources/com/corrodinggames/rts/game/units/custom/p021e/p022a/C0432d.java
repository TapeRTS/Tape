package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/d.class */
public class C0432d extends AbstractC0429a {
    public C0432d() {
        this.f2752s = true;
        this.f2751r = true;
        this.f2735b = "energy";
        this.f2736c = C0385az.m4690a("energy");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo4493a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1638cz;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo4492a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1638cz = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo4491b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1638cz = (float) (abstractC0244am.f1638cz + d);
    }
}
