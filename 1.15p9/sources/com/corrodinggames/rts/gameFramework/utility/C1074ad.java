package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ad.class */
public class C1074ad {

    /* renamed from: a */
    private final Object[] f6829a;

    /* renamed from: b */
    private int f6830b;

    /* renamed from: c */
    private final boolean f6831c = false;

    public C1074ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6829a = new Object[i];
    }

    /* renamed from: a */
    public Object m642a() {
        if (this.f6830b > 0) {
            int i = this.f6830b - 1;
            Object obj = this.f6829a[i];
            this.f6829a[i] = null;
            this.f6830b--;
            return obj;
        }
        return null;
    }

    /* renamed from: a */
    public boolean m641a(Object obj) {
        if (this.f6830b < this.f6829a.length) {
            this.f6829a[this.f6830b] = obj;
            this.f6830b++;
            return true;
        }
        return false;
    }
}
