package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/f.class */
public class C0541f implements Iterable, Iterator {

    /* renamed from: a */
    int f3728a;

    /* renamed from: b */
    AbstractC0244am[] f3729b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3728a > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC0244am mo6755next() {
        this.f3728a--;
        return this.f3729b[this.f3728a];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    /* renamed from: a */
    public void m3493a(C1112u c1112u) {
        this.f3729b = c1112u.m517a();
        this.f3728a = c1112u.f6916b;
    }
}
