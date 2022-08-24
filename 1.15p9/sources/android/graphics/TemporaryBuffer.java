package android.graphics;

import com.p005a.p006a.p007a.C0042a;

/* loaded from: game-lib.jar:android/graphics/TemporaryBuffer.class */
public class TemporaryBuffer {

    /* renamed from: a */
    private static char[] f239a = null;

    /* renamed from: a */
    public static char[] m6417a(int i) {
        char[] cArr;
        synchronized (TemporaryBuffer.class) {
            cArr = f239a;
            f239a = null;
        }
        if (cArr == null || cArr.length < i) {
            cArr = new char[C0042a.m6324b(i)];
        }
        return cArr;
    }

    /* renamed from: a */
    public static void m6416a(char[] cArr) {
        if (cArr.length > 1000) {
            return;
        }
        synchronized (TemporaryBuffer.class) {
            f239a = cArr;
        }
    }
}
