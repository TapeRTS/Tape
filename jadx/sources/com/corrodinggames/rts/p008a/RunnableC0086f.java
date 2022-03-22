package com.corrodinggames.rts.p008a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/f.class */
class RunnableC0086f implements Runnable {

    /* renamed from: a */
    public String f413a;

    /* renamed from: b */
    final /* synthetic */ ActivityC0069e f414b;

    RunnableC0086f(ActivityC0069e eVar) {
        this.f414b = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.m756E();
        u.f5526bI.m386a(this.f413a);
        u.m758C();
        if (this.f414b.f385c != null && this.f414b.f385c.isShowing()) {
            this.f414b.m4286b(0);
        }
    }
}
