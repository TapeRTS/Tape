package com.corrodinggames.rts.gameFramework.p037h;

import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.h.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/j.class */
public final class C0736j implements Comparable {

    /* renamed from: a */
    public short f5166a;

    /* renamed from: b */
    public short f5167b;

    /* renamed from: c */
    public int f5168c;

    /* renamed from: a */
    public final void m923a(short s, short s2) {
        this.f5166a = s;
        this.f5167b = s2;
    }

    /* renamed from: a */
    public final void m925a(int i, int i2, int i3) {
        int i4 = i2 - this.f5166a;
        int i5 = i3 - this.f5167b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.f5168c = i + ((i6 + i7) * 11) + (C0654f.m1454c(i6, i7) * (-7));
    }

    /* renamed from: a */
    public final int compareTo(C0736j jVar) {
        if (this.f5168c != jVar.f5168c) {
            return this.f5168c - jVar.f5168c;
        }
        if (this.f5166a - jVar.f5166a != 0) {
            return this.f5166a - jVar.f5166a;
        }
        return this.f5167b - jVar.f5167b;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f5166a) + ", y=" + ((int) this.f5167b) + ", score=" + this.f5168c + "]";
    }
}
