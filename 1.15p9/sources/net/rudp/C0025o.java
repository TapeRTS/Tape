package net.rudp;

import java.io.InputStream;

/* renamed from: a.a.o */
/* loaded from: game-lib.jar:a/a/o.class */
class C0025o extends InputStream {

    /* renamed from: a */
    protected C0017h f93a;

    /* renamed from: b */
    protected byte[] f94b;

    /* renamed from: c */
    protected int f95c;

    /* renamed from: d */
    protected int f96d;

    public C0025o(C0017h c0017h) {
        if (c0017h == null) {
            throw new NullPointerException("sock");
        }
        this.f93a = c0017h;
        this.f94b = new byte[this.f93a.getReceiveBufferSize()];
        this.f96d = 0;
        this.f95c = 0;
    }

    public synchronized int read() {
        if (m6624a() < 0) {
            return -1;
        }
        byte[] bArr = this.f94b;
        int i = this.f95c;
        this.f95c = i + 1;
        return bArr[i] & 255;
    }

    public synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (m6624a() < 0) {
            return -1;
        }
        int min = Math.min(available(), i2);
        System.arraycopy(this.f94b, this.f95c, bArr, i, min);
        this.f95c += min;
        return min;
    }

    public synchronized int available() {
        return this.f96d - this.f95c;
    }

    public boolean markSupported() {
        return false;
    }

    public void close() {
        this.f93a.shutdownInput();
    }

    /* renamed from: a */
    private int m6624a() {
        if (available() == 0) {
            this.f96d = this.f93a.m6670b(this.f94b, 0, this.f94b.length);
            this.f95c = 0;
        }
        return this.f96d;
    }
}
