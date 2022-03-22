package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.gameFramework.g.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/i.class */
public class C0705i extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f4999a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f5000b = true;

    /* renamed from: c */
    byte[] f5001c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C0704h f5002d;

    public C0705i(C0704h hVar) {
        this.f5002d = hVar;
    }

    /* renamed from: a */
    public void m1081a(byte[] bArr) {
        this.f4999a.add(ByteBuffer.wrap(bArr));
    }

    @Override // java.io.InputStream
    public int read() {
        do {
        } while (read(this.f5001c, 0, 1) <= 0);
        return this.f5001c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f5002d.f4996c) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f5002d.f4996c) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f4999a.take();
                if (byteBuffer != null) {
                    if (this.f5000b) {
                        this.f5000b = false;
                        AbstractC0789l.m670d("First packet from forwarded:" + this.f5002d.f4995b);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f4999a.addFirst(byteBuffer);
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
