package com.corrodinggames.rts.gameFramework.path;

import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.i.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/n.class */
public final class C0827n implements Comparable {

    /* renamed from: a */
    public short f5586a;

    /* renamed from: b */
    public short f5587b;

    /* renamed from: c */
    public int f5588c;

    /* renamed from: a */
    public final void m1068a(short s, short s2) {
        this.f5586a = s;
        this.f5587b = s2;
    }

    /* renamed from: a */
    public final void m1070a(int i, int i2, int i3) {
        int i4 = i2 - this.f5586a;
        int i5 = i3 - this.f5587b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.f5588c = i + ((i6 + i7) * 11) + (CommonUtils.mini(i6, i7) * (-7));
    }

    /* renamed from: a */
    public final int compareTo(C0827n c0827n) {
        if (this.f5588c == c0827n.f5588c) {
            if (this.f5586a - c0827n.f5586a != 0) {
                return this.f5586a - c0827n.f5586a;
            }
            return this.f5587b - c0827n.f5587b;
        }
        return this.f5588c - c0827n.f5588c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f5586a) + ", y=" + ((int) this.f5587b) + ", score=" + this.f5588c + "]";
    }
}