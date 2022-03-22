package p000a.p001a;

import java.io.IOException;

/* renamed from: a.a.r */
/* loaded from: game-lib.jar:a/a/r.class */
public class C0028r {

    /* renamed from: a */
    public static final C0028r f101a = new C0028r();

    /* renamed from: b */
    private int f102b;

    /* renamed from: c */
    private int f103c;

    /* renamed from: d */
    private int f104d;

    /* renamed from: e */
    private int f105e;

    /* renamed from: f */
    private int f106f;

    /* renamed from: g */
    private int f107g;

    /* renamed from: h */
    private int f108h;

    /* renamed from: i */
    private int f109i;

    /* renamed from: j */
    private int f110j;

    /* renamed from: k */
    private int f111k;

    /* renamed from: l */
    private int f112l;

    public C0028r() {
        try {
            m4307a(32, 32, 300, 70, 0, 3, 3, 3, 2000, 600, 300);
        } catch (IOException e) {
            throw new RuntimeException("IOException on ReliableSocketProfile default:" + e);
        }
    }

    public C0028r(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        m4307a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    /* renamed from: a */
    private void m4307a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        m4306a("maxSendQueueSize", i, 1, 255);
        m4306a("maxRecvQueueSize", i2, 1, 255);
        m4306a("maxSegmentSize", i3, 22, 6535);
        m4306a("maxOutstandingSegs", i4, 1, 255);
        m4306a("maxRetrans", i5, 0, 255);
        m4306a("maxCumulativeAcks", i6, 0, 255);
        m4306a("maxOutOfSequence", i7, 0, 255);
        m4306a("maxAutoReset", i8, 0, 255);
        m4306a("nullSegmentTimeout", i9, 0, 65535);
        m4306a("retransmissionTimeout", i10, 100, 65535);
        m4306a("cumulativeAckTimeout", i11, 100, 65535);
        this.f102b = i;
        this.f103c = i2;
        this.f104d = i3;
        this.f105e = i4;
        this.f106f = i5;
        this.f107g = i6;
        this.f108h = i7;
        this.f109i = i8;
        this.f110j = i9;
        this.f111k = i10;
        this.f112l = i11;
    }

    /* renamed from: a */
    public int m4308a() {
        return this.f104d;
    }

    /* renamed from: b */
    public int m4305b() {
        return this.f105e;
    }

    /* renamed from: c */
    public int m4304c() {
        return this.f106f;
    }

    /* renamed from: d */
    public int m4303d() {
        return this.f107g;
    }

    /* renamed from: e */
    public int m4302e() {
        return this.f108h;
    }

    /* renamed from: f */
    public int m4301f() {
        return this.f109i;
    }

    /* renamed from: g */
    public int m4300g() {
        return this.f110j;
    }

    /* renamed from: h */
    public int m4299h() {
        return this.f111k;
    }

    /* renamed from: i */
    public int m4298i() {
        return this.f112l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f102b).append(", ");
        sb.append(this.f103c).append(", ");
        sb.append(this.f104d).append(", ");
        sb.append(this.f105e).append(", ");
        sb.append(this.f106f).append(", ");
        sb.append(this.f107g).append(", ");
        sb.append(this.f108h).append(", ");
        sb.append(this.f109i).append(", ");
        sb.append(this.f110j).append(", ");
        sb.append(this.f111k).append(", ");
        sb.append(this.f112l);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private void m4306a(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IOException(str + " out of range");
        }
    }
}
