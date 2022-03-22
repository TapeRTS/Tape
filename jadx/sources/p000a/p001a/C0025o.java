package p000a.p001a;

import java.io.InputStream;

/* renamed from: a.a.o */
/* loaded from: game-lib.jar:a/a/o.class */
class C0025o extends InputStream {

    /* renamed from: a */
    protected C0017h f94a;

    /* renamed from: b */
    protected byte[] f95b;

    /* renamed from: c */
    protected int f96c;

    /* renamed from: d */
    protected int f97d;

    public C0025o(C0017h hVar) {
        if (hVar == null) {
            throw new NullPointerException("sock");
        }
        this.f94a = hVar;
        this.f95b = new byte[this.f94a.getReceiveBufferSize()];
        this.f97d = 0;
        this.f96c = 0;
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        if (m4313a() < 0) {
            return -1;
        }
        byte[] bArr = this.f95b;
        int i = this.f96c;
        this.f96c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (m4313a() < 0) {
            return -1;
        } else {
            int min = Math.min(available(), i2);
            System.arraycopy(this.f95b, this.f96c, bArr, i, min);
            this.f96c += min;
            return min;
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.f97d - this.f96c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f94a.shutdownInput();
    }

    /* renamed from: a */
    private int m4313a() {
        if (available() == 0) {
            this.f97d = this.f94a.m4357b(this.f95b, 0, this.f95b.length);
            this.f96c = 0;
        }
        return this.f97d;
    }
}
