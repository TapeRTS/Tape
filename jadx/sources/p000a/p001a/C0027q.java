package p000a.p001a;

import java.io.OutputStream;

/* renamed from: a.a.q */
/* loaded from: game-lib.jar:a/a/q.class */
class C0027q extends OutputStream {

    /* renamed from: a */
    protected C0017h f98a;

    /* renamed from: b */
    protected byte[] f99b;

    /* renamed from: c */
    protected int f100c;

    public C0027q(C0017h hVar) {
        if (hVar == null) {
            throw new NullPointerException("sock");
        }
        this.f98a = hVar;
        this.f99b = new byte[this.f98a.getSendBufferSize()];
        this.f100c = 0;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f100c >= this.f99b.length) {
            flush();
        }
        byte[] bArr = this.f99b;
        int i2 = this.f100c;
        this.f100c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            int i3 = 0;
            while (i3 < i2) {
                int min = Math.min(this.f99b.length, i2 - i3);
                if (min > this.f99b.length - this.f100c) {
                    flush();
                }
                System.arraycopy(bArr, i + i3, this.f99b, this.f100c, min);
                this.f100c += min;
                i3 += min;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        if (this.f100c > 0) {
            this.f98a.m4364a(this.f99b, 0, this.f100c);
            this.f100c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        flush();
        this.f98a.shutdownOutput();
    }
}
