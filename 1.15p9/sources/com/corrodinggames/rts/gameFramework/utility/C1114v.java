package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/v.class */
public class C1114v implements Iterator {

    /* renamed from: b */
    private int f6918b;

    /* renamed from: c */
    private int f6919c;

    /* renamed from: d */
    private int f6920d;

    /* renamed from: a */
    final /* synthetic */ C1112u f6921a;

    private C1114v(C1112u c1112u) {
        int i;
        this.f6921a = c1112u;
        this.f6918b = this.f6921a.f6916b;
        this.f6919c = -1;
        i = this.f6921a.modCount;
        this.f6920d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6918b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC0244am next() {
        int i;
        C1112u c1112u = this.f6921a;
        int i2 = this.f6918b;
        i = c1112u.modCount;
        if (i != this.f6920d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f6918b = i2 - 1;
        AbstractC0244am[] abstractC0244amArr = c1112u.f6917c;
        int i3 = c1112u.f6916b - i2;
        this.f6919c = i3;
        return abstractC0244amArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        AbstractC0244am[] abstractC0244amArr = this.f6921a.f6917c;
        int i2 = this.f6919c;
        i = this.f6921a.modCount;
        if (i != this.f6920d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(abstractC0244amArr, i2 + 1, abstractC0244amArr, i2, this.f6918b);
        C1112u c1112u = this.f6921a;
        int i3 = c1112u.f6916b - 1;
        c1112u.f6916b = i3;
        abstractC0244amArr[i3] = null;
        this.f6919c = -1;
        this.f6920d = C1112u.m505d(this.f6921a);
    }
}
