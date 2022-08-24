package com.corrodinggames.rts.gameFramework.p044l;

/* renamed from: com.corrodinggames.rts.gameFramework.l.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/af.class */
public class C0929af {

    /* renamed from: a */
    public String f6359a;

    /* renamed from: c */
    public boolean f6360c;

    /* renamed from: d */
    public boolean f6361d;

    /* renamed from: f */
    public C0934e f6362f;

    /* renamed from: g */
    public boolean f6363g;

    /* renamed from: b */
    public int f6364b = -1;

    /* renamed from: e */
    public float[] f6365e = new float[1];

    /* renamed from: a */
    public void m1054a(float f) {
        if (this.f6365e.length != 1) {
            this.f6365e = new float[1];
        }
        if (this.f6365e[0] == f) {
            return;
        }
        this.f6365e[0] = f;
        this.f6360c = true;
    }

    /* renamed from: a */
    public void m1053a(float f, float f2) {
        if (this.f6365e.length != 2) {
            this.f6365e = new float[2];
        }
        if (this.f6365e[0] == f && this.f6365e[1] == f2) {
            return;
        }
        this.f6365e[0] = f;
        this.f6365e[1] = f2;
        this.f6360c = true;
    }

    /* renamed from: a */
    public void m1052a(float f, float f2, float f3, float f4) {
        if (this.f6365e.length != 4) {
            this.f6365e = new float[4];
        }
        if (this.f6365e[0] == f && this.f6365e[1] == f2 && this.f6365e[2] == f3 && this.f6365e[3] == f4) {
            return;
        }
        this.f6365e[0] = f;
        this.f6365e[1] = f2;
        this.f6365e[2] = f3;
        this.f6365e[3] = f4;
        this.f6360c = true;
    }

    /* renamed from: a */
    public void m1051a(C0934e c0934e) {
        if (this.f6362f != c0934e) {
            this.f6362f = c0934e;
            this.f6360c = true;
        }
    }

    /* renamed from: b */
    public void m1050b(C0934e c0934e) {
        this.f6363g = true;
        if (this.f6362f != c0934e) {
            this.f6362f = c0934e;
            this.f6360c = true;
        }
    }
}
