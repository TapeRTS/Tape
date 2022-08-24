package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/n.class */
public class C1103n implements Iterator {

    /* renamed from: b */
    private int f6890b;

    /* renamed from: c */
    private int f6891c;

    /* renamed from: d */
    private int f6892d;

    /* renamed from: a */
    final /* synthetic */ C1101m f6893a;

    private C1103n(C1101m c1101m) {
        int i;
        this.f6893a = c1101m;
        this.f6890b = this.f6893a.f6888a;
        this.f6891c = -1;
        i = this.f6893a.modCount;
        this.f6892d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6890b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C1101m c1101m = this.f6893a;
        int i2 = this.f6890b;
        i = c1101m.modCount;
        if (i != this.f6892d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f6890b = i2 - 1;
        Object[] objArr = c1101m.f6889b;
        int i3 = c1101m.f6888a - i2;
        this.f6891c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f6893a.f6889b;
        int i2 = this.f6891c;
        i = this.f6893a.modCount;
        if (i != this.f6892d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.f6890b);
        C1101m c1101m = this.f6893a;
        int i3 = c1101m.f6888a - 1;
        c1101m.f6888a = i3;
        objArr[i3] = null;
        this.f6891c = -1;
        this.f6892d = C1101m.m544d(this.f6893a);
    }
}
