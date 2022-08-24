package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/w.class */
public class C1115w extends OutputStream {

    /* renamed from: a */
    public byte[] f6922a;

    /* renamed from: b */
    protected int f6923b;

    public C1115w() {
        this.f6922a = new byte[32];
    }

    public C1115w(int i) {
        if (i >= 0) {
            this.f6922a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("size < 0");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* renamed from: a */
    private void m502a(int i) {
        if (this.f6923b + i <= this.f6922a.length) {
            return;
        }
        byte[] bArr = new byte[(this.f6923b + i) * 2];
        System.arraycopy(this.f6922a, 0, bArr, 0, this.f6923b);
        this.f6922a = bArr;
    }

    /* renamed from: a */
    public synchronized void m503a() {
        this.f6923b = 0;
    }

    /* renamed from: b */
    public int m500b() {
        return this.f6923b;
    }

    public String toString() {
        return new String(this.f6922a, 0, this.f6923b);
    }

    /* renamed from: a */
    public static void m501a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m501a(bArr.length, i, i2);
        if (i2 == 0) {
            return;
        }
        m502a(i2);
        System.arraycopy(bArr, i, this.f6922a, this.f6923b, i2);
        this.f6923b += i2;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f6923b == this.f6922a.length) {
            m502a(1);
        }
        byte[] bArr = this.f6922a;
        int i2 = this.f6923b;
        this.f6923b = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
