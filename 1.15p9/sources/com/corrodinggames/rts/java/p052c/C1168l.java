package com.corrodinggames.rts.java.p052c;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.java.c.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/l.class */
public class C1168l extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f7133a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f7134b = true;

    /* renamed from: c */
    byte[] f7135c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C1167k f7136d;

    public C1168l(C1167k c1167k) {
        this.f7136d = c1167k;
    }

    /* renamed from: a */
    public void m255a(byte[] bArr) {
        this.f7133a.add(ByteBuffer.wrap(bArr));
    }

    public int read() {
        do {
        } while (read(this.f7135c, 0, 1) <= 0);
        return this.f7135c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f7136d.f7129b) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f7136d.f7129b) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f7133a.take();
                if (byteBuffer != null) {
                    if (this.f7134b) {
                        this.f7134b = false;
                        GameEngine.PrintLog("First packet from:" + this.f7136d.f7132e);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f7133a.addFirst(byteBuffer);
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
