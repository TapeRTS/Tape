package net.rudp;

import java.io.IOException;

/* renamed from: a.a.r */
/* loaded from: game-lib.jar:a/a/r.class */
public class C0028r {

    /* renamed from: a */
    public static final C0028r f100a = new C0028r();

    /* renamed from: b */
    private int f101b;

    /* renamed from: c */
    private int f102c;

    /* renamed from: d */
    private int f103d;

    /* renamed from: e */
    private int f104e;

    /* renamed from: f */
    private int f105f;

    /* renamed from: g */
    private int f106g;

    /* renamed from: h */
    private int f107h;

    /* renamed from: i */
    private int f108i;

    /* renamed from: j */
    private int f109j;

    /* renamed from: k */
    private int f110k;

    /* renamed from: l */
    private int f111l;

    public C0028r() {
        try {
            m6618a(32, 32, 300, 70, 0, 3, 3, 3, 2000, 600, 300);
        } catch (IOException e) {
            throw new RuntimeException("IOException on ReliableSocketProfile default:" + e);
        }
    }

    public C0028r(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        m6618a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    /* renamed from: a */
    private void m6618a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        m6617a("maxSendQueueSize", i, 1, 255);
        m6617a("maxRecvQueueSize", i2, 1, 255);
        m6617a("maxSegmentSize", i3, 22, 6535);
        m6617a("maxOutstandingSegs", i4, 1, 255);
        m6617a("maxRetrans", i5, 0, 255);
        m6617a("maxCumulativeAcks", i6, 0, 255);
        m6617a("maxOutOfSequence", i7, 0, 255);
        m6617a("maxAutoReset", i8, 0, 255);
        m6617a("nullSegmentTimeout", i9, 0, 65535);
        m6617a("retransmissionTimeout", i10, 100, 65535);
        m6617a("cumulativeAckTimeout", i11, 100, 65535);
        this.f101b = i;
        this.f102c = i2;
        this.f103d = i3;
        this.f104e = i4;
        this.f105f = i5;
        this.f106g = i6;
        this.f107h = i7;
        this.f108i = i8;
        this.f109j = i9;
        this.f110k = i10;
        this.f111l = i11;
    }

    /* renamed from: a */
    public int m6619a() {
        return this.f103d;
    }

    /* renamed from: b */
    public int m6616b() {
        return this.f104e;
    }

    /* renamed from: c */
    public int m6615c() {
        return this.f105f;
    }

    /* renamed from: d */
    public int m6614d() {
        return this.f106g;
    }

    /* renamed from: e */
    public int m6613e() {
        return this.f107h;
    }

    /* renamed from: f */
    public int m6612f() {
        return this.f108i;
    }

    /* renamed from: g */
    public int m6611g() {
        return this.f109j;
    }

    /* renamed from: h */
    public int m6610h() {
        return this.f110k;
    }

    /* renamed from: i */
    public int m6609i() {
        return this.f111l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f101b).append(", ");
        sb.append(this.f102c).append(", ");
        sb.append(this.f103d).append(", ");
        sb.append(this.f104e).append(", ");
        sb.append(this.f105f).append(", ");
        sb.append(this.f106g).append(", ");
        sb.append(this.f107h).append(", ");
        sb.append(this.f108i).append(", ");
        sb.append(this.f109j).append(", ");
        sb.append(this.f110k).append(", ");
        sb.append(this.f111l);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private void m6617a(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IOException(str + " out of range");
        }
    }
}
