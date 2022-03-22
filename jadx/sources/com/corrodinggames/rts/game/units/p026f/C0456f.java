package com.corrodinggames.rts.game.units.p026f;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/f.class */
public class C0456f implements Iterable, Iterator {

    /* renamed from: a */
    int f3266a;

    /* renamed from: b */
    AbstractC0210af[] f3267b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3266a > 0;
    }

    /* renamed from: a */
    public AbstractC0210af next() {
        this.f3266a--;
        return this.f3267b[this.f3266a];
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
    public void m2451a(C0846u uVar) {
        this.f3267b = uVar.m456a();
        this.f3266a = uVar.f5806b;
    }
}
