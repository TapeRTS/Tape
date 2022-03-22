package com.corrodinggames.rts.gameFramework.p037h;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/b.class */
class C0728b implements Iterator {

    /* renamed from: b */
    private int f5057b;

    /* renamed from: c */
    private int f5058c;

    /* renamed from: d */
    private int f5059d;

    /* renamed from: a */
    final /* synthetic */ C0726a f5060a;

    private C0728b(C0726a aVar) {
        int i;
        this.f5060a = aVar;
        this.f5057b = this.f5060a.f5055b;
        this.f5058c = -1;
        i = this.f5060a.modCount;
        this.f5059d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5057b != 0;
    }

    /* renamed from: a */
    public C0736j next() {
        int i;
        C0726a aVar = this.f5060a;
        int i2 = this.f5057b;
        i = aVar.modCount;
        if (i != this.f5059d) {
            throw new ConcurrentModificationException();
        } else if (i2 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f5057b = i2 - 1;
            C0736j[] jVarArr = aVar.f5056c;
            int i3 = aVar.f5055b - i2;
            this.f5058c = i3;
            return jVarArr[i3];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        C0736j[] jVarArr = this.f5060a.f5056c;
        int i2 = this.f5058c;
        i = this.f5060a.modCount;
        if (i != this.f5059d) {
            throw new ConcurrentModificationException();
        } else if (i2 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(jVarArr, i2 + 1, jVarArr, i2, this.f5057b);
            C0726a aVar = this.f5060a;
            int i3 = aVar.f5055b - 1;
            aVar.f5055b = i3;
            jVarArr[i3] = null;
            this.f5058c = -1;
            this.f5059d = C0726a.m1003d(this.f5060a);
        }
    }
}
