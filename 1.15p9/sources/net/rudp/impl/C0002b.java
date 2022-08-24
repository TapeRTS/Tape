package net.rudp.impl;

/* renamed from: a.a.a.b */
/* loaded from: game-lib.jar:a/a/a/b.class */
public class C0002b extends Segment {

    /* renamed from: a */
    private byte[] f0a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0002b() {
    }

    public C0002b(int i, int i2, byte[] bArr, int i3, int i4) {
        m5317a(64, i, 6);
        m5318a(i2);
        this.f0a = new byte[i4];
        System.arraycopy(bArr, i3, this.f0a, 0, i4);
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: b */
    public int m5341b() {
        return this.f0a.length + super.m5315b();
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: a */
    public String m5343a() {
        return "DAT";
    }

    /* renamed from: c */
    public byte[] m5340c() {
        return this.f0a;
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: d */
    public byte[] m5339d() {
        byte[] m5312d = super.m5312d();
        System.arraycopy(this.f0a, 0, m5312d, 6, this.f0a.length);
        return m5312d;
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: a */
    public void m5342a(byte[] bArr, int i, int i2) {
        super.m5316a(bArr, i, i2);
        this.f0a = new byte[i2 - 6];
        System.arraycopy(bArr, i + 6, this.f0a, 0, this.f0a.length);
    }
}
