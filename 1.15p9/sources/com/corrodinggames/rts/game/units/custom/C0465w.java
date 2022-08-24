package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/w.class */
public class C0465w extends C0464v {

    /* renamed from: g */
    String f3349g;

    /* renamed from: h */
    C0405bf f3350h;

    @Override // com.corrodinggames.rts.game.units.custom.C0464v, com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: a */
    public void mo4061a() {
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: b */
    public void mo4060b() {
        super.mo4061a();
        this.f3350h = mo4063c().m4109f(this.f3349g);
        if (this.f3350h == null) {
            throw new C0412bm("Could not find projectile:" + this.f3349g + " on unit target:" + m4064d() + " used on:" + this.f3343a + " in section:" + this.f3344b);
        }
    }

    /* renamed from: f */
    public C0405bf m4059f() {
        return this.f3350h;
    }
}
