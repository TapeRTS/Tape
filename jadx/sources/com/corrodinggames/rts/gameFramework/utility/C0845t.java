package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
class C0845t implements Iterator {

    /* renamed from: b */
    private int f5801b;

    /* renamed from: c */
    private int f5802c;

    /* renamed from: d */
    private int f5803d;

    /* renamed from: a */
    final /* synthetic */ C0843s f5804a;

    private C0845t(C0843s sVar) {
        int i;
        this.f5804a = sVar;
        this.f5801b = this.f5804a.f5798b;
        this.f5802c = -1;
        i = this.f5804a.modCount;
        this.f5803d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5801b != 0;
    }

    /* renamed from: a */
    public AbstractC0854w next() {
        int i;
        int i2;
        C0843s sVar = this.f5804a;
        int i3 = this.f5801b;
        i = sVar.modCount;
        if (i != this.f5803d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f5804a.f5800d).append(" (modCount:");
            i2 = this.f5804a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f5803d).append(")").toString());
        } else if (i3 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f5801b = i3 - 1;
            AbstractC0854w[] wVarArr = sVar.f5799c;
            int i4 = sVar.f5798b - i3;
            this.f5802c = i4;
            return wVarArr[i4];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2;
        AbstractC0854w[] wVarArr = this.f5804a.f5799c;
        int i3 = this.f5802c;
        i = this.f5804a.modCount;
        if (i != this.f5803d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f5804a.f5800d).append(" (modCount:");
            i2 = this.f5804a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f5803d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(wVarArr, i3 + 1, wVarArr, i3, this.f5801b);
            C0843s sVar = this.f5804a;
            int i4 = sVar.f5798b - 1;
            sVar.f5798b = i4;
            wVarArr[i4] = null;
            this.f5802c = -1;
            this.f5803d = C0843s.m458f(this.f5804a);
        }
    }
}
