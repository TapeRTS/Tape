package com.corrodinggames.rts.java.audio.p050a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.audio.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/l.class */
public class C1141l {

    /* renamed from: a */
    public boolean f7047a;

    /* renamed from: b */
    final C1138i f7048b;

    /* renamed from: c */
    int f7049c;

    /* renamed from: d */
    int f7050d;

    /* renamed from: e */
    boolean f7051e = true;

    public C1141l(C1138i c1138i) {
        this.f7048b = c1138i;
        mo332b();
    }

    /* renamed from: b */
    public void mo332b() {
        this.f7050d = -2;
        this.f7049c = -1;
        if (this.f7048b.f7035g) {
            this.f7047a = true;
        } else {
            m331c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m331c() {
        this.f7047a = false;
        long[] jArr = this.f7048b.f7030b;
        int i = this.f7048b.f7032d + this.f7048b.f7033e;
        do {
            int i2 = this.f7049c + 1;
            this.f7049c = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.f7049c] == 0);
        this.f7047a = true;
    }

    public void remove() {
        if (this.f7050d == -1 && this.f7048b.f7035g) {
            this.f7048b.f7034f = null;
            this.f7048b.f7035g = false;
        } else if (this.f7050d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7050d >= this.f7048b.f7032d) {
                this.f7048b.m348a(this.f7050d);
                this.f7049c = this.f7050d - 1;
                m331c();
            } else {
                this.f7048b.f7030b[this.f7050d] = 0;
                this.f7048b.f7031c[this.f7050d] = null;
            }
        }
        this.f7050d = -2;
        this.f7048b.f7029a--;
    }
}
