package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/v.class */
class C0848v implements Iterator {

    /* renamed from: b */
    private int f5808b;

    /* renamed from: c */
    private int f5809c;

    /* renamed from: d */
    private int f5810d;

    /* renamed from: a */
    final /* synthetic */ C0846u f5811a;

    private C0848v(C0846u uVar) {
        int i;
        this.f5811a = uVar;
        this.f5808b = this.f5811a.f5806b;
        this.f5809c = -1;
        i = this.f5811a.modCount;
        this.f5810d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5808b != 0;
    }

    /* renamed from: a */
    public AbstractC0210af next() {
        int i;
        C0846u uVar = this.f5811a;
        int i2 = this.f5808b;
        i = uVar.modCount;
        if (i != this.f5810d) {
            throw new ConcurrentModificationException();
        } else if (i2 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f5808b = i2 - 1;
            AbstractC0210af[] afVarArr = uVar.f5807c;
            int i3 = uVar.f5806b - i2;
            this.f5809c = i3;
            return afVarArr[i3];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        AbstractC0210af[] afVarArr = this.f5811a.f5807c;
        int i2 = this.f5809c;
        i = this.f5811a.modCount;
        if (i != this.f5810d) {
            throw new ConcurrentModificationException();
        } else if (i2 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(afVarArr, i2 + 1, afVarArr, i2, this.f5808b);
            C0846u uVar = this.f5811a;
            int i3 = uVar.f5806b - 1;
            uVar.f5806b = i3;
            afVarArr[i3] = null;
            this.f5809c = -1;
            this.f5810d = C0846u.m444d(this.f5811a);
        }
    }
}
