package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/w.class */
public class C0849w extends OutputStream {

    /* renamed from: a */
    public byte[] f5812a;

    /* renamed from: b */
    protected int f5813b;

    public C0849w() {
        this.f5812a = new byte[32];
    }

    public C0849w(int i) {
        if (i >= 0) {
            this.f5812a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("size < 0");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* renamed from: a */
    private void m441a(int i) {
        if (this.f5813b + i > this.f5812a.length) {
            byte[] bArr = new byte[(this.f5813b + i) * 2];
            System.arraycopy(this.f5812a, 0, bArr, 0, this.f5813b);
            this.f5812a = bArr;
        }
    }

    /* renamed from: a */
    public synchronized void m442a() {
        this.f5813b = 0;
    }

    /* renamed from: b */
    public int m439b() {
        return this.f5813b;
    }

    public String toString() {
        return new String(this.f5812a, 0, this.f5813b);
    }

    /* renamed from: a */
    public static void m440a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m440a(bArr.length, i, i2);
        if (i2 != 0) {
            m441a(i2);
            System.arraycopy(bArr, i, this.f5812a, this.f5813b, i2);
            this.f5813b += i2;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f5813b == this.f5812a.length) {
            m441a(1);
        }
        byte[] bArr = this.f5812a;
        int i2 = this.f5813b;
        this.f5813b = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
