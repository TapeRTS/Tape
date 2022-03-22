package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/n.class */
class C0837n implements Iterator {

    /* renamed from: b */
    private int f5780b;

    /* renamed from: c */
    private int f5781c;

    /* renamed from: d */
    private int f5782d;

    /* renamed from: a */
    final /* synthetic */ C0835m f5783a;

    private C0837n(C0835m mVar) {
        int i;
        this.f5783a = mVar;
        this.f5780b = this.f5783a.f5778a;
        this.f5781c = -1;
        i = this.f5783a.modCount;
        this.f5782d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5780b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C0835m mVar = this.f5783a;
        int i2 = this.f5780b;
        i = mVar.modCount;
        if (i != this.f5782d) {
            throw new ConcurrentModificationException();
        } else if (i2 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f5780b = i2 - 1;
            Object[] objArr = mVar.f5779b;
            int i3 = mVar.f5778a - i2;
            this.f5781c = i3;
            return objArr[i3];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f5783a.f5779b;
        int i2 = this.f5781c;
        i = this.f5783a.modCount;
        if (i != this.f5782d) {
            throw new ConcurrentModificationException();
        } else if (i2 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(objArr, i2 + 1, objArr, i2, this.f5780b);
            C0835m mVar = this.f5783a;
            int i3 = mVar.f5778a - 1;
            mVar.f5778a = i3;
            objArr[i3] = null;
            this.f5781c = -1;
            this.f5782d = C0835m.m483d(this.f5783a);
        }
    }
}
