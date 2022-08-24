package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
public class C1111t implements Iterator {

    /* renamed from: b */
    private int f6911b;

    /* renamed from: c */
    private int f6912c;

    /* renamed from: d */
    private int f6913d;

    /* renamed from: a */
    final /* synthetic */ C1109s f6914a;

    private C1111t(C1109s c1109s) {
        int i;
        this.f6914a = c1109s;
        this.f6911b = this.f6914a.f6908b;
        this.f6912c = -1;
        i = this.f6914a.modCount;
        this.f6913d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6911b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC1120w next() {
        int i;
        int i2;
        C1109s c1109s = this.f6914a;
        int i3 = this.f6911b;
        i = c1109s.modCount;
        if (i != this.f6913d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f6914a.f6910d).append(" (modCount:");
            i2 = this.f6914a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f6913d).append(")").toString());
        } else if (i3 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f6911b = i3 - 1;
            AbstractC1120w[] abstractC1120wArr = c1109s.f6909c;
            int i4 = c1109s.f6908b - i3;
            this.f6912c = i4;
            return abstractC1120wArr[i4];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2;
        AbstractC1120w[] abstractC1120wArr = this.f6914a.f6909c;
        int i3 = this.f6912c;
        i = this.f6914a.modCount;
        if (i != this.f6913d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f6914a.f6910d).append(" (modCount:");
            i2 = this.f6914a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f6913d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(abstractC1120wArr, i3 + 1, abstractC1120wArr, i3, this.f6911b);
            C1109s c1109s = this.f6914a;
            int i4 = c1109s.f6908b - 1;
            c1109s.f6908b = i4;
            abstractC1120wArr[i4] = null;
            this.f6912c = -1;
            this.f6913d = C1109s.m519f(this.f6914a);
        }
    }
}
