package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/e.class */
public class C0433e extends AbstractC0429a {
    public C0433e() {
        this.f2752s = true;
        this.f2751r = true;
        this.f2735b = "hp";
        this.f2736c = C0385az.m4690a("hp");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo4493a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1631cs;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo4492a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.m5159o((float) d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo4491b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.m5159o(abstractC0244am.f1631cs + ((float) d));
    }
}
