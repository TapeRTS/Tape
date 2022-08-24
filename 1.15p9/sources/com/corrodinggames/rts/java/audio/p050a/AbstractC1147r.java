package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/r.class */
abstract class AbstractC1147r implements Iterable, Iterator {

    /* renamed from: b */
    public boolean f7070b;

    /* renamed from: c */
    final C1144o f7071c;

    /* renamed from: d */
    int f7072d;

    /* renamed from: e */
    int f7073e;

    /* renamed from: f */
    boolean f7074f = true;

    public AbstractC1147r(C1144o c1144o) {
        this.f7071c = c1144o;
        mo307c();
    }

    /* renamed from: c */
    public void mo307c() {
        this.f7073e = -1;
        this.f7072d = -1;
        m306d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m306d() {
        this.f7070b = false;
        Object[] objArr = this.f7071c.f7055b;
        int i = this.f7071c.f7057d + this.f7071c.f7058e;
        do {
            int i2 = this.f7072d + 1;
            this.f7072d = i2;
            if (i2 >= i) {
                return;
            }
        } while (objArr[this.f7072d] == null);
        this.f7070b = true;
    }

    public void remove() {
        if (this.f7073e < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        if (this.f7073e >= this.f7071c.f7057d) {
            this.f7071c.m324a(this.f7073e);
            this.f7072d = this.f7073e - 1;
            m306d();
        } else {
            this.f7071c.f7055b[this.f7073e] = null;
            this.f7071c.f7056c[this.f7073e] = null;
        }
        this.f7073e = -1;
        this.f7071c.f7054a--;
    }
}
