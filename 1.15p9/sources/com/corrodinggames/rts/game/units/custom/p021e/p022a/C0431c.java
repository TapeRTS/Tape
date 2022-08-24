package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0435b;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/c.class */
public class C0431c extends AbstractC0429a {
    public C0431c() {
        this.f2752s = true;
        this.f2751r = true;
        this.f2735b = "credits";
        this.f2736c = C0385az.m4690a("$");
        this.f2747n = true;
        this.f2749p = EnumC0435b.space;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo4493a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1608bV.f1309o;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo4492a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1608bV.f1309o = d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo4491b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1608bV.f1309o += d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public String mo4494a(boolean z) {
        return "$";
    }
}
