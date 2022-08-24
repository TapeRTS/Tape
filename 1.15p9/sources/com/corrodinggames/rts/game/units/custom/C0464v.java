package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/v.class */
public class C0464v extends C0463u {
    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: a */
    public void mo4061a() {
        if (!this.f3347e) {
            this.f3346d = C0453l.m4093n(this.f3345c);
            if (this.f3346d == null) {
                throw new C0412bm("Could not find customUnit target:" + m4064d() + " used on:" + this.f3343a + " in section:" + this.f3344b);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: e */
    public C0453l mo4063c() {
        return (C0453l) this.f3346d;
    }
}
