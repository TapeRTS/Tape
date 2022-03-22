package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
class C0840p implements Iterator {

    /* renamed from: b */
    private int f5788b;

    /* renamed from: c */
    private int f5789c;

    /* renamed from: d */
    private int f5790d;

    /* renamed from: a */
    final /* synthetic */ C0838o f5791a;

    private C0840p(C0838o oVar) {
        int i;
        this.f5791a = oVar;
        this.f5788b = this.f5791a.f5786c;
        this.f5789c = -1;
        i = this.f5791a.modCount;
        this.f5790d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5788b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C0838o oVar = this.f5791a;
        int i2 = this.f5788b;
        i = oVar.modCount;
        if (i != this.f5790d) {
            throw new ConcurrentModificationException();
        } else if (i2 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f5788b = i2 - 1;
            Object[] objArr = oVar.f5787d;
            int i3 = oVar.f5786c - i2;
            this.f5789c = i3;
            return objArr[i3];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f5791a.f5787d;
        int i2 = this.f5789c;
        i = this.f5791a.modCount;
        if (i != this.f5790d) {
            throw new ConcurrentModificationException();
        } else if (i2 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(objArr, i2 + 1, objArr, i2, this.f5788b);
            C0838o oVar = this.f5791a;
            int i3 = oVar.f5786c - 1;
            oVar.f5786c = i3;
            objArr[i3] = null;
            this.f5789c = -1;
            this.f5790d = C0838o.m473d(this.f5791a);
        }
    }
}
