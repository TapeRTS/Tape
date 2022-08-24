package net.rudp.impl;

import java.io.IOException;

/* renamed from: a.a.a.g */
/* loaded from: game-lib.jar:a/a/a/g.class */
public class C0007g extends Segment {

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

    /* JADX INFO: Access modifiers changed from: protected */
    public C0007g() {
    }

    public C0007g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        m5317a(-128, i, 22);
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

    @Override // net.rudp.impl.Segment
    /* renamed from: a */
    public String m5331a() {
        return "SYN";
    }

    /* renamed from: c */
    public int m5329c() {
        return this.f3b;
    }

    /* renamed from: e */
    public int m5327e() {
        return this.f5d;
    }

    /* renamed from: f */
    public int m5326f() {
        return this.f6e;
    }

    /* renamed from: g */
    public int m5325g() {
        return this.f7f;
    }

    /* renamed from: h */
    public int m5324h() {
        return this.f8g;
    }

    /* renamed from: i */
    public int m5323i() {
        return this.f9h;
    }

    /* renamed from: j */
    public int m5322j() {
        return this.f10i;
    }

    /* renamed from: k */
    public int m5321k() {
        return this.f11j;
    }

    /* renamed from: l */
    public int m5320l() {
        return this.f12k;
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: d */
    public byte[] m5328d() {
        byte[] m5312d = super.m5312d();
        m5312d[4] = (byte) ((this.f2a << 4) & 255);
        m5312d[5] = (byte) (this.f3b & 255);
        m5312d[6] = (byte) (this.f4c & 255);
        m5312d[7] = 0;
        m5312d[8] = (byte) ((this.f5d >>> 8) & 255);
        m5312d[9] = (byte) ((this.f5d >>> 0) & 255);
        m5312d[10] = (byte) ((this.f6e >>> 8) & 255);
        m5312d[11] = (byte) ((this.f6e >>> 0) & 255);
        m5312d[12] = (byte) ((this.f7f >>> 8) & 255);
        m5312d[13] = (byte) ((this.f7f >>> 0) & 255);
        m5312d[14] = (byte) ((this.f8g >>> 8) & 255);
        m5312d[15] = (byte) ((this.f8g >>> 0) & 255);
        m5312d[16] = (byte) (this.f9h & 255);
        m5312d[17] = (byte) (this.f10i & 255);
        m5312d[18] = (byte) (this.f11j & 255);
        m5312d[19] = (byte) (this.f12k & 255);
        return m5312d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.rudp.impl.Segment
    /* renamed from: a */
    public void m5330a(byte[] bArr, int i, int i2) {
        super.m5316a(bArr, i, i2);
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
