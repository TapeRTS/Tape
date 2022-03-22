package android.graphics;

import com.p005a.p006a.p007a.C0042a;

/* loaded from: game-lib.jar:android/graphics/TemporaryBuffer.class */
public class TemporaryBuffer {

    /* renamed from: a */
    private static char[] f236a = null;

    /* renamed from: a */
    public static char[] m4364a(int i) {
        char[] cArr;
        synchronized (TemporaryBuffer.class) {
            cArr = f236a;
            f236a = null;
        }
        if (cArr == null || cArr.length < i) {
            cArr = new char[C0042a.m4271b(i)];
        }
        return cArr;
    }

    /* renamed from: a */
    public static void m4363a(char[] cArr) {
        if (cArr.length <= 1000) {
            synchronized (TemporaryBuffer.class) {
                f236a = cArr;
            }
        }
    }
}
