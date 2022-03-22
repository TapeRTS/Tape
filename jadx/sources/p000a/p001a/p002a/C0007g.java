package p000a.p001a.p002a;

import java.io.IOException;

/* renamed from: a.a.a.g */
/* loaded from: game-lib.jar:a/a/a/g.class */
public class C0007g extends AbstractC0008h {

    /* renamed from: a */
    private int f2a;

    /* renamed from: b */
    private int f3b;

    /* renamed from: c */
    private int f4c;

    /* renamed from: d */
    private int f5d;

    /* renamed from: e */
    private int f6e;

    /* renamed from: f */
    private int f7f;

    /* renamed from: g */
    private int f8g;

    /* renamed from: h */
    private int f9h;

    /* renamed from: i */
    private int f10i;

    /* renamed from: j */
    private int f11j;

    /* renamed from: k */
    private int f12k;

    protected C0007g() {
    }

    public C0007g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        m4407a(-128, i, 22);
        this.f2a = 1;
        this.f3b = i2;
        this.f4c = 1;
        this.f5d = i3;
        this.f6e = i4;
        this.f7f = i5;
        this.f8g = i6;
        this.f9h = i7;
        this.f10i = i8;
        this.f11j = i9;
        this.f12k = i10;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public String mo4409a() {
        return "SYN";
    }

    /* renamed from: c */
    public int m4418c() {
        return this.f3b;
    }

    /* renamed from: e */
    public int m4417e() {
        return this.f5d;
    }

    /* renamed from: f */
    public int m4416f() {
        return this.f6e;
    }

    /* renamed from: g */
    public int m4415g() {
        return this.f7f;
    }

    /* renamed from: h */
    public int m4414h() {
        return this.f8g;
    }

    /* renamed from: i */
    public int m4413i() {
        return this.f9h;
    }

    /* renamed from: j */
    public int m4412j() {
        return this.f10i;
    }

    /* renamed from: k */
    public int m4411k() {
        return this.f11j;
    }

    /* renamed from: l */
    public int m4410l() {
        return this.f12k;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: d */
    public byte[] mo4402d() {
        byte[] d = super.mo4402d();
        d[4] = (byte) ((this.f2a << 4) & 255);
        d[5] = (byte) (this.f3b & 255);
        d[6] = (byte) (this.f4c & 255);
        d[7] = 0;
        d[8] = (byte) ((this.f5d >>> 8) & 255);
        d[9] = (byte) ((this.f5d >>> 0) & 255);
        d[10] = (byte) ((this.f6e >>> 8) & 255);
        d[11] = (byte) ((this.f6e >>> 0) & 255);
        d[12] = (byte) ((this.f7f >>> 8) & 255);
        d[13] = (byte) ((this.f7f >>> 0) & 255);
        d[14] = (byte) ((this.f8g >>> 8) & 255);
        d[15] = (byte) ((this.f8g >>> 0) & 255);
        d[16] = (byte) (this.f9h & 255);
        d[17] = (byte) (this.f10i & 255);
        d[18] = (byte) (this.f11j & 255);
        d[19] = (byte) (this.f12k & 255);
        return d;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    protected void mo4406a(byte[] bArr, int i, int i2) {
        super.mo4406a(bArr, i, i2);
        if (i2 < 22) {
            throw new IOException("Invalid SYN segment");
        }
        this.f2a = (bArr[i + 4] & 255) >>> 4;
        if (this.f2a != 1) {
            throw new IOException("Invalid RUDP version:" + this.f2a);
        }
        this.f3b = bArr[i + 5] & 255;
        this.f4c = bArr[i + 6] & 255;
        this.f5d = ((bArr[i + 8] & 255) << 8) | ((bArr[i + 9] & 255) << 0);
        this.f6e = ((bArr[i + 10] & 255) << 8) | ((bArr[i + 11] & 255) << 0);
        this.f7f = ((bArr[i + 12] & 255) << 8) | ((bArr[i + 13] & 255) << 0);
        this.f8g = ((bArr[i + 14] & 255) << 8) | ((bArr[i + 15] & 255) << 0);
        this.f9h = bArr[i + 16] & 255;
        this.f10i = bArr[i + 17] & 255;
        this.f11j = bArr[i + 18] & 255;
        this.f12k = bArr[i + 19] & 255;
    }
}
