package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/au.class */
public abstract class AbstractC0380au extends AbstractC0377ar {
    /* renamed from: a */
    public abstract double mo4704a(C0359aq c0359aq);

    /* renamed from: a */
    public abstract void mo4703a(C0359aq c0359aq, double d);

    public AbstractC0380au(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public double mo4700a(C0451j c0451j, C0359aq c0359aq) {
        return mo4704a(c0359aq);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public void mo4701a(C0451j c0451j, double d) {
        c0451j.m4226dH();
        mo4703a(c0451j.f2862x, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: b */
    public boolean mo4699b() {
        return false;
    }
}
