package com.corrodinggames.rts.java.p046c;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.java.c.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/j.class */
public class C0900j extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f6007a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f6008b = true;

    /* renamed from: c */
    byte[] f6009c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C0899i f6010d;

    public C0900j(C0899i iVar) {
        this.f6010d = iVar;
    }

    /* renamed from: a */
    public void m226a(byte[] bArr) {
        this.f6007a.add(ByteBuffer.wrap(bArr));
    }

    @Override // java.io.InputStream
    public int read() {
        do {
        } while (read(this.f6009c, 0, 1) <= 0);
        return this.f6009c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f6010d.f6003b) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f6010d.f6003b) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f6007a.take();
                if (byteBuffer != null) {
                    if (this.f6008b) {
                        this.f6008b = false;
                        AbstractC0789l.m670d("First packet from:" + this.f6010d.f6006e);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f6007a.addFirst(byteBuffer);
                    }
                    i4 += i3;
                    i5 -= i3;
                    i6 += i3;
                    if (i5 < 0) {
                        throw new IOException("bytesNeeded<0:" + i5);
                    } else if (i5 == 0) {
                        return i4;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return i4;
            }
        }
        throw new IOException("Closed");
    }
}
