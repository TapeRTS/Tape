package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/a.class */
public abstract class AbstractC0547a {

    /* renamed from: a */
    int f3750a;

    /* renamed from: b */
    public abstract EnumC0549b mo3471b();

    public AbstractC0547a() {
    }

    public AbstractC0547a(int i) {
        this.f3750a = i;
    }

    /* renamed from: a */
    public int m3480a() {
        return this.f3750a;
    }

    /* renamed from: a */
    public void m3479a(AbstractC0623y abstractC0623y, float f) {
    }

    /* renamed from: a */
    public void mo3473a(AbstractC0623y abstractC0623y, C0859ar c0859ar) {
        c0859ar.mo1481a(this.f3750a);
    }

    /* renamed from: a */
    public void mo3472a(AbstractC0623y abstractC0623y, C0876k c0876k) {
        this.f3750a = c0876k.m1448f();
    }
}
