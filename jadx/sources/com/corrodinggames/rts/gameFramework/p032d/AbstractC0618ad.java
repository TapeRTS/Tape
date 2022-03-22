package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.d.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/ad.class */
abstract class AbstractC0618ad implements Comparable {

    /* renamed from: c */
    long f4257c;

    /* renamed from: d */
    float f4258d;

    /* renamed from: e */
    float f4259e;

    /* renamed from: f */
    String f4260f;

    /* renamed from: g */
    boolean f4261g;

    /* renamed from: b */
    public abstract void mo1575b(AbstractC0618ad adVar);

    /* renamed from: a */
    public abstract String mo1577a();

    public AbstractC0618ad(float f, float f2) {
        this.f4258d = f;
        this.f4259e = f2;
    }

    /* renamed from: c */
    public int compareTo(AbstractC0618ad adVar) {
        return (int) (adVar.f4257c - this.f4257c);
    }

    /* renamed from: a */
    public boolean mo1576a(AbstractC0618ad adVar) {
        if (this.f4257c + mo1774b() >= System.currentTimeMillis() && C0654f.m1520a(this.f4258d, this.f4259e, adVar.f4258d, adVar.f4259e) <= 90000.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    protected long mo1774b() {
        return 5000L;
    }
}
