package com.corrodinggames.rts.java.audio.p050a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/s.class */
public final class C1148s {

    /* renamed from: a */
    public static final byte[] f7075a = new byte[0];

    /* renamed from: a */
    public static void m303a(InputStream inputStream, OutputStream outputStream) {
        m302a(inputStream, outputStream, new byte[4096]);
    }

    /* renamed from: a */
    public static void m302a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
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
    public static byte[] m304a(InputStream inputStream, int i) {
        C1149t c1149t = new C1149t(Math.max(0, i));
        m303a(inputStream, c1149t);
        return c1149t.toByteArray();
    }

    /* renamed from: a */
    public static void m305a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }
}
