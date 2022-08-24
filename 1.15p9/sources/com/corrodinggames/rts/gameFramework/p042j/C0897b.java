package com.corrodinggames.rts.gameFramework.p042j;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/b.class */
class C0897b implements Iterator {

    /* renamed from: b */
    private int f5908b;

    /* renamed from: c */
    private int f5909c;

    /* renamed from: d */
    private int f5910d;

    /* renamed from: a */
    final /* synthetic */ C0895a f5911a;

    private C0897b(C0895a c0895a) {
        this.f5911a = c0895a;
        this.f5908b = this.f5911a.f5906b;
        this.f5909c = -1;
        this.f5910d = C0895a.m1388a(this.f5911a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5908b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C0909n next() {
        C0895a c0895a = this.f5911a;
        int i = this.f5908b;
        if (C0895a.m1383b(c0895a) != this.f5910d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.f5908b = i - 1;
        C0909n[] c0909nArr = c0895a.f5907c;
        int i2 = c0895a.f5906b - i;
        this.f5909c = i2;
        return c0909nArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        C0909n[] c0909nArr = this.f5911a.f5907c;
        int i = this.f5909c;
        if (C0895a.m1380c(this.f5911a) != this.f5910d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(c0909nArr, i + 1, c0909nArr, i, this.f5908b);
        C0895a c0895a = this.f5911a;
        int i2 = c0895a.f5906b - 1;
        c0895a.f5906b = i2;
        c0909nArr[i2] = null;
        this.f5909c = -1;
        this.f5910d = C0895a.m1379d(this.f5911a);
    }
}
