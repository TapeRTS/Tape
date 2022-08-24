package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.gameFramework.i.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/i.class */
public class C0874i extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f5849a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f5850b = true;

    /* renamed from: c */
    byte[] f5851c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C0873h f5852d;

    public C0874i(C0873h c0873h) {
        this.f5852d = c0873h;
    }

    /* renamed from: a */
    public void m1467a(byte[] bArr) {
        this.f5849a.add(ByteBuffer.wrap(bArr));
    }

    public int read() {
        do {
        } while (read(this.f5851c, 0, 1) <= 0);
        return this.f5851c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f5852d.f5846c) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f5852d.f5846c) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f5849a.take();
                if (byteBuffer != null) {
                    if (this.f5850b) {
                        this.f5850b = false;
                        GameEngine.PrintLog("First packet from forwarded:" + this.f5852d.f5845b);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f5849a.addFirst(byteBuffer);
                    }
                    i4 += i3;
                    i5 -= i3;
                    i6 += i3;
                    if (i5 < 0) {
                        throw new IOException("bytesNeeded<0:" + i5);
                    }
                    if (i5 == 0) {
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
