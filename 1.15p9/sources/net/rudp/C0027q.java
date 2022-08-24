package net.rudp;

import java.io.OutputStream;

/* renamed from: a.a.q */
/* loaded from: game-lib.jar:a/a/q.class */
class C0027q extends OutputStream {

    /* renamed from: a */
    protected C0017h f97a;

    /* renamed from: b */
    protected byte[] f98b;

    /* renamed from: c */
    protected int f99c;

    public C0027q(C0017h c0017h) {
        if (c0017h == null) {
            throw new NullPointerException("sock");
        }
        this.f97a = c0017h;
        this.f98b = new byte[this.f97a.getSendBufferSize()];
        this.f99c = 0;
    }

    public synchronized void write(int i) {
        if (this.f99c >= this.f98b.length) {
            flush();
        }
        byte[] bArr = this.f98b;
        int i2 = this.f99c;
        this.f99c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < i2) {
                int min = Math.min(this.f98b.length, i2 - i4);
                if (min > this.f98b.length - this.f99c) {
                    flush();
                }
                System.arraycopy(bArr, i + i4, this.f98b, this.f99c, min);
                this.f99c += min;
                i3 = i4 + min;
            } else {
                return;
            }
        }
    }

    public synchronized void flush() {
        if (this.f99c > 0) {
            this.f97a.m6677a(this.f98b, 0, this.f99c);
            this.f99c = 0;
        }
    }

    public synchronized void close() {
        flush();
        this.f97a.shutdownOutput();
    }
}
