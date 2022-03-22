package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;

/* renamed from: com.corrodinggames.rts.gameFramework.d.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/ac.class */
class C0617ac extends C0615aa {
    public C0617ac(float f, float f2, AbstractC0268al alVar) {
        super(f, f2, alVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.C0615aa, com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: a */
    public String mo1577a() {
        if (this.f4260f == null) {
            this.f4260f = String.format(C0652a.m1536a("gui.log.upgradeCompleted", new Object[0]), this.f4254a.mo2762e(), Integer.valueOf(this.f4255b));
        }
        return this.f4260f;
    }
}
