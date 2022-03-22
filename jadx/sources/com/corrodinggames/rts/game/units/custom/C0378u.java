package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class C0378u extends C0377t {
    @Override // com.corrodinggames.rts.game.units.custom.C0377t
    /* renamed from: a */
    public void mo2715a() {
        if (!this.f2886e) {
            this.f2885d = C0368l.m2747l(this.f2884c);
            if (this.f2885d == null) {
                throw new C0324at("Could not find customUnit target:" + m2718d() + " used on:" + this.f2882a + " in section:" + this.f2883b);
            }
        }
    }

    /* renamed from: e */
    public C0368l mo2717c() {
        return (C0368l) this.f2885d;
    }
}
