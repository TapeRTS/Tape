package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.gameFramework.j.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/n.class */
public final class C0909n implements Comparable {

    /* renamed from: a */
    public short f6035a;

    /* renamed from: b */
    public short f6036b;

    /* renamed from: c */
    public int f6037c;

    /* renamed from: a */
    public final void m1272a(short s, short s2) {
        this.f6035a = s;
        this.f6036b = s2;
    }

    /* renamed from: a */
    public final void m1274a(int i, int i2, int i3) {
        int i4 = i2 - this.f6035a;
        int i5 = i3 - this.f6036b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.f6037c = i + ((i6 + i7) * 11) + (C0758f.m2286c(i6, i7) * (-7));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int mo1273a(C0909n c0909n) {
        if (this.f6037c == c0909n.f6037c) {
            if (this.f6035a - c0909n.f6035a != 0) {
                return this.f6035a - c0909n.f6035a;
            }
            return this.f6036b - c0909n.f6036b;
        }
        return this.f6037c - c0909n.f6037c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f6035a) + ", y=" + ((int) this.f6036b) + ", score=" + this.f6037c + "]";
    }
}
