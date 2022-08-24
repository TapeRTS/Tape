package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/av.class */
public abstract class AbstractC0381av extends AbstractC0377ar {
    /* renamed from: a */
    public abstract double mo4702a(C0451j c0451j);

    /* renamed from: b */
    public abstract void mo4698b(C0451j c0451j, double d);

    public AbstractC0381av(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public double mo4700a(C0451j c0451j, C0359aq c0359aq) {
        return mo4702a(c0451j);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public void mo4701a(C0451j c0451j, double d) {
        c0451j.m4226dH();
        mo4698b(c0451j, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: b */
    public boolean mo4699b() {
        return true;
    }
}
