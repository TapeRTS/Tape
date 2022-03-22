package com.corrodinggames.rts.java.audio.p044a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/r.class */
abstract class AbstractC0881r implements Iterable, Iterator {

    /* renamed from: b */
    public boolean f5958b;

    /* renamed from: c */
    final C0878o f5959c;

    /* renamed from: d */
    int f5960d;

    /* renamed from: e */
    int f5961e;

    /* renamed from: f */
    boolean f5962f = true;

    public AbstractC0881r(C0878o oVar) {
        this.f5959c = oVar;
        mo270c();
    }

    /* renamed from: c */
    public void mo270c() {
        this.f5961e = -1;
        this.f5960d = -1;
        m269d();
    }

    /* renamed from: d */
    void m269d() {
        this.f5958b = false;
        Object[] objArr = this.f5959c.f5943b;
        int i = this.f5959c.f5945d + this.f5959c.f5946e;
        do {
            int i2 = this.f5960d + 1;
            this.f5960d = i2;
            if (i2 >= i) {
                return;
            }
        } while (objArr[this.f5960d] == null);
        this.f5958b = true;
    }

    public void remove() {
        if (this.f5961e < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        if (this.f5961e >= this.f5959c.f5945d) {
            this.f5959c.m287a(this.f5961e);
            this.f5960d = this.f5961e - 1;
            m269d();
        } else {
            this.f5959c.f5943b[this.f5961e] = null;
            this.f5959c.f5944c[this.f5961e] = null;
        }
        this.f5961e = -1;
        this.f5959c.f5942a--;
    }
}
