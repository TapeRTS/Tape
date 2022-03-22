package com.corrodinggames.rts.java.audio.p044a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/s.class */
public final class C0882s {

    /* renamed from: a */
    public static final byte[] f5963a = new byte[0];

    /* renamed from: a */
    public static void m266a(InputStream inputStream, OutputStream outputStream) {
        m265a(inputStream, outputStream, new byte[4096]);
    }

    /* renamed from: a */
    public static void m265a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m267a(InputStream inputStream, int i) {
        C0883t tVar = new C0883t(Math.max(0, i));
        m266a(inputStream, tVar);
        return tVar.toByteArray();
    }

    /* renamed from: a */
    public static void m268a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }
}
