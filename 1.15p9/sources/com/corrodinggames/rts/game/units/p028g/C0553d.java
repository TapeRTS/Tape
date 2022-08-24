package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/d.class */
public class C0553d extends AbstractC0547a {

    /* renamed from: b */
    float f3754b;

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: b */
    public EnumC0549b mo3471b() {
        return EnumC0549b.f3751a;
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: a */
    public void mo3473a(AbstractC0623y abstractC0623y, C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3754b);
        super.mo3473a(abstractC0623y, c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: a */
    public void mo3472a(AbstractC0623y abstractC0623y, C0876k c0876k) {
        this.f3754b = c0876k.m1447g();
        super.mo3472a(abstractC0623y, c0876k);
    }
}
