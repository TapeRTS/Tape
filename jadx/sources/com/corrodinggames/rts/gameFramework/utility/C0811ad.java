package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ad.class */
public class C0811ad {

    /* renamed from: a */
    private final Object[] f5727a;

    /* renamed from: b */
    private int f5728b;

    /* renamed from: c */
    private final boolean f5729c = false;

    public C0811ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5727a = new Object[i];
    }

    /* renamed from: a */
    public Object m550a() {
        if (this.f5728b <= 0) {
            return null;
        }
        int i = this.f5728b - 1;
        Object obj = this.f5727a[i];
        this.f5727a[i] = null;
        this.f5728b--;
        return obj;
    }

    /* renamed from: a */
    public boolean m549a(Object obj) {
        if (this.f5728b >= this.f5727a.length) {
            return false;
        }
        this.f5727a[this.f5728b] = obj;
        this.f5728b++;
        return true;
    }
}
