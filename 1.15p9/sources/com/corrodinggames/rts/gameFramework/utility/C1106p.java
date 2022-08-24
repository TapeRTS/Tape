package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
public class C1106p implements Iterator {

    /* renamed from: b */
    private int f6898b;

    /* renamed from: c */
    private int f6899c;

    /* renamed from: d */
    private int f6900d;

    /* renamed from: a */
    final /* synthetic */ C1104o f6901a;

    private C1106p(C1104o c1104o) {
        int i;
        this.f6901a = c1104o;
        this.f6898b = this.f6901a.f6894c;
        this.f6899c = -1;
        i = this.f6901a.modCount;
        this.f6900d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6898b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C1104o c1104o = this.f6901a;
        int i2 = this.f6898b;
        i = c1104o.modCount;
        if (i != this.f6900d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f6898b = i2 - 1;
        Object[] objArr = c1104o.f6897d;
        int i3 = c1104o.f6894c - i2;
        this.f6899c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f6901a.f6897d;
        int i2 = this.f6899c;
        i = this.f6901a.modCount;
        if (i != this.f6900d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.f6898b);
        C1104o c1104o = this.f6901a;
        int i3 = c1104o.f6894c - 1;
        c1104o.f6894c = i3;
        objArr[i3] = null;
        this.f6899c = -1;
        this.f6900d = C1104o.m534d(this.f6901a);
    }
}
