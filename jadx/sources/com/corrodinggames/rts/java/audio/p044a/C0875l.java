package com.corrodinggames.rts.java.audio.p044a;

/* renamed from: com.corrodinggames.rts.java.audio.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/l.class */
class C0875l {

    /* renamed from: a */
    public boolean f5935a;

    /* renamed from: b */
    final C0872i f5936b;

    /* renamed from: c */
    int f5937c;

    /* renamed from: d */
    int f5938d;

    /* renamed from: e */
    boolean f5939e = true;

    public C0875l(C0872i iVar) {
        this.f5936b = iVar;
        mo295b();
    }

    /* renamed from: b */
    public void mo295b() {
        this.f5938d = -2;
        this.f5937c = -1;
        if (this.f5936b.f5923g) {
            this.f5935a = true;
        } else {
            m294c();
        }
    }

    /* renamed from: c */
    void m294c() {
        this.f5935a = false;
        long[] jArr = this.f5936b.f5918b;
        int i = this.f5936b.f5920d + this.f5936b.f5921e;
        do {
            int i2 = this.f5937c + 1;
            this.f5937c = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.f5937c] == 0);
        this.f5935a = true;
    }

    public void remove() {
        if (this.f5938d == -1 && this.f5936b.f5923g) {
            this.f5936b.f5922f = null;
            this.f5936b.f5923g = false;
        } else if (this.f5938d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else if (this.f5938d >= this.f5936b.f5920d) {
            this.f5936b.m311a(this.f5938d);
            this.f5937c = this.f5938d - 1;
            m294c();
        } else {
            this.f5936b.f5918b[this.f5938d] = 0;
            this.f5936b.f5919c[this.f5938d] = null;
        }
        this.f5938d = -2;
        this.f5936b.f5917a--;
    }
}
