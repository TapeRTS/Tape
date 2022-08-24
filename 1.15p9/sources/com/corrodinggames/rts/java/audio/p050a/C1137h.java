package com.corrodinggames.rts.java.audio.p050a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.audio.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
public class C1137h {

    /* renamed from: a */
    public boolean f7024a;

    /* renamed from: b */
    final C1134e f7025b;

    /* renamed from: c */
    int f7026c;

    /* renamed from: d */
    int f7027d;

    /* renamed from: e */
    boolean f7028e = true;

    public C1137h(C1134e c1134e) {
        this.f7025b = c1134e;
        mo351b();
    }

    /* renamed from: b */
    public void mo351b() {
        this.f7027d = -2;
        this.f7026c = -1;
        if (this.f7025b.f7012g) {
            this.f7024a = true;
        } else {
            m350c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m350c() {
        this.f7024a = false;
        int[] iArr = this.f7025b.f7007b;
        int i = this.f7025b.f7009d + this.f7025b.f7010e;
        do {
            int i2 = this.f7026c + 1;
            this.f7026c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.f7026c] == 0);
        this.f7024a = true;
    }

    public void remove() {
        if (this.f7027d == -1 && this.f7025b.f7012g) {
            this.f7025b.f7011f = null;
            this.f7025b.f7012g = false;
        } else if (this.f7027d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7027d >= this.f7025b.f7009d) {
                this.f7025b.m359d(this.f7027d);
                this.f7026c = this.f7027d - 1;
                m350c();
            } else {
                this.f7025b.f7007b[this.f7027d] = 0;
                this.f7025b.f7008c[this.f7027d] = null;
            }
        }
        this.f7027d = -2;
        this.f7025b.f7006a--;
    }
}
