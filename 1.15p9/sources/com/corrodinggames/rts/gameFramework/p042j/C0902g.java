package com.corrodinggames.rts.gameFramework.p042j;

/* renamed from: com.corrodinggames.rts.gameFramework.j.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/g.class */
public class C0902g {

    /* renamed from: a */
    int f5941a;

    /* renamed from: b */
    int f5942b;

    /* renamed from: c */
    int f5943c;

    /* renamed from: d */
    int f5944d;

    /* renamed from: e */
    byte[] f5945e;

    /* renamed from: f */
    byte[] f5946f;

    public C0902g(int i, int i2) {
        this.f5941a = i;
        this.f5942b = i2;
        this.f5945e = new byte[i * i2];
        this.f5946f = new byte[i * i2];
    }

    /* renamed from: a */
    public final byte m1354a(int i, int i2) {
        return this.f5945e[(i * this.f5942b) + i2];
    }

    /* renamed from: a */
    public final byte m1353a(C0911p c0911p) {
        return this.f5945e[(c0911p.f6068a * this.f5942b) + c0911p.f6069b];
    }

    /* renamed from: b */
    public boolean m1350b(C0911p c0911p) {
        return m1353a(c0911p) <= 0;
    }

    /* renamed from: a */
    public void m1352a(C0911p c0911p, byte b) {
        this.f5945e[(c0911p.f6068a * this.f5942b) + c0911p.f6069b] = b;
    }

    /* renamed from: a */
    public void m1351a(C0911p c0911p, boolean z) {
        this.f5946f[(c0911p.f6068a * this.f5942b) + c0911p.f6069b] = (byte) (z ? 1 : 0);
    }

    /* renamed from: c */
    public boolean m1349c(C0911p c0911p) {
        return this.f5946f[(c0911p.f6068a * this.f5942b) + c0911p.f6069b] == 1;
    }
}
