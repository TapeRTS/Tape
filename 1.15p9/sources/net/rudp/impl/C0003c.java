package net.rudp.impl;

/* renamed from: a.a.a.c */
/* loaded from: game-lib.jar:a/a/a/c.class */
public class C0003c extends C0001a {

    /* renamed from: a */
    private int[] f1a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0003c() {
    }

    public C0003c(int i, int i2, int[] iArr) {
        m5317a(32, i, 6 + iArr.length);
        m5318a(i2);
        this.f1a = iArr;
    }

    @Override // net.rudp.impl.C0001a, net.rudp.impl.Segment
    /* renamed from: a */
    public String m5338a() {
        return "EAK";
    }

    /* renamed from: c */
    public int[] m5336c() {
        return this.f1a;
    }

    @Override // net.rudp.impl.Segment
    /* renamed from: d */
    public byte[] m5335d() {
        byte[] d = super.m5312d();
        for (int i = 0; i < this.f1a.length; i++) {
            d[4 + i] = (byte) (this.f1a[i] & 255);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.rudp.impl.Segment
    /* renamed from: a */
    public void m5337a(byte[] bArr, int i, int i2) {
        super.m5316a(bArr, i, i2);
        this.f1a = new int[i2 - 6];
        for (int i3 = 0; i3 < this.f1a.length; i3++) {
            this.f1a[i3] = bArr[i + 4 + i3] & 255;
        }
    }
}
