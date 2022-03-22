package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class C0829h implements Iterator {

    /* renamed from: b */
    private int f5760b;

    /* renamed from: c */
    private int f5761c;

    /* renamed from: d */
    private int f5762d;

    /* renamed from: a */
    final /* synthetic */ C0827g f5763a;

    private C0829h(C0827g gVar) {
        int i;
        int i2;
        this.f5763a = gVar;
        i = this.f5763a.f5757c;
        this.f5760b = i;
        i2 = this.f5763a.f5758d;
        this.f5761c = i2;
        this.f5762d = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5760b != this.f5761c;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object[] objArr;
        int i;
        Object[] objArr2;
        if (this.f5760b == this.f5761c) {
            throw new NoSuchElementException();
        }
        objArr = this.f5763a.f5756b;
        Object obj = objArr[this.f5760b];
        i = this.f5763a.f5758d;
        if (i != this.f5761c || obj == null) {
            throw new ConcurrentModificationException();
        }
        this.f5762d = this.f5760b;
        objArr2 = this.f5763a.f5756b;
        this.f5760b = (this.f5760b + 1) & (objArr2.length - 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean a;
        Object[] objArr;
        int i;
        if (this.f5762d < 0) {
            throw new IllegalStateException();
        }
        a = this.f5763a.m516a(this.f5762d);
        if (a) {
            objArr = this.f5763a.f5756b;
            this.f5760b = (this.f5760b - 1) & (objArr.length - 1);
            i = this.f5763a.f5758d;
            this.f5761c = i;
        }
        this.f5762d = -1;
    }
}
