package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/v.class */
public class C0379v extends C0378u {

    /* renamed from: f */
    String f2887f;

    /* renamed from: g */
    C0317am f2888g;

    @Override // com.corrodinggames.rts.game.units.custom.C0378u, com.corrodinggames.rts.game.units.custom.C0377t
    /* renamed from: a */
    public void mo2715a() {
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0377t
    /* renamed from: b */
    public void mo2714b() {
        super.mo2715a();
        this.f2888g = mo2717c().m2763d(this.f2887f);
        if (this.f2888g == null) {
            throw new C0324at("Could not find projectile:" + this.f2887f + " on unit target:" + m2718d() + " used on:" + this.f2882a + " in section:" + this.f2883b);
        }
    }

    /* renamed from: f */
    public C0317am m2713f() {
        return this.f2888g;
    }
}
