package com.corrodinggames.rts.java.audio.p044a;

/* renamed from: com.corrodinggames.rts.java.audio.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
class C0871h {

    /* renamed from: a */
    public boolean f5912a;

    /* renamed from: b */
    final C0868e f5913b;

    /* renamed from: c */
    int f5914c;

    /* renamed from: d */
    int f5915d;

    /* renamed from: e */
    boolean f5916e = true;

    public C0871h(C0868e eVar) {
        this.f5913b = eVar;
        mo314b();
    }

    /* renamed from: b */
    public void mo314b() {
        this.f5915d = -2;
        this.f5914c = -1;
        if (this.f5913b.f5900g) {
            this.f5912a = true;
        } else {
            m313c();
        }
    }

    /* renamed from: c */
    void m313c() {
        this.f5912a = false;
        int[] iArr = this.f5913b.f5895b;
        int i = this.f5913b.f5897d + this.f5913b.f5898e;
        do {
            int i2 = this.f5914c + 1;
            this.f5914c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.f5914c] == 0);
        this.f5912a = true;
    }

    public void remove() {
        if (this.f5915d == -1 && this.f5913b.f5900g) {
            this.f5913b.f5899f = null;
            this.f5913b.f5900g = false;
        } else if (this.f5915d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else if (this.f5915d >= this.f5913b.f5897d) {
            this.f5913b.m322d(this.f5915d);
            this.f5914c = this.f5915d - 1;
            m313c();
        } else {
            this.f5913b.f5895b[this.f5915d] = 0;
            this.f5913b.f5896c[this.f5915d] = null;
        }
        this.f5915d = -2;
        this.f5913b.f5894a--;
    }
}
