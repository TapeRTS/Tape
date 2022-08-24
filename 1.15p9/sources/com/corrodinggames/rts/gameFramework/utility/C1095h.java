package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class C1095h implements Iterator {

    /* renamed from: b */
    private int f6868b;

    /* renamed from: c */
    private int f6869c;

    /* renamed from: d */
    private int f6870d;

    /* renamed from: a */
    final /* synthetic */ C1093g f6871a;

    private C1095h(C1093g c1093g) {
        int i;
        int i2;
        this.f6871a = c1093g;
        i = this.f6871a.f6865c;
        this.f6868b = i;
        i2 = this.f6871a.f6866d;
        this.f6869c = i2;
        this.f6870d = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6868b != this.f6869c;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object[] objArr;
        int i;
        Object[] objArr2;
        if (this.f6868b != this.f6869c) {
            objArr = this.f6871a.f6864b;
            Object obj = objArr[this.f6868b];
            i = this.f6871a.f6866d;
            if (i != this.f6869c || obj == null) {
                throw new ConcurrentModificationException();
            }
            this.f6870d = this.f6868b;
            objArr2 = this.f6871a.f6864b;
            this.f6868b = (this.f6868b + 1) & (objArr2.length - 1);
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean m579a;
        Object[] objArr;
        int i;
        if (this.f6870d >= 0) {
            m579a = this.f6871a.m579a(this.f6870d);
            if (m579a) {
                objArr = this.f6871a.f6864b;
                this.f6868b = (this.f6868b - 1) & (objArr.length - 1);
                i = this.f6871a.f6866d;
                this.f6869c = i;
            }
            this.f6870d = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
