package android.util;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: game-lib.jar:android/util/Log.class */
public final class Log {

    /* renamed from: a */
    private static final ThreadLocal f302a = new ThreadLocal() { // from class: android.util.Log.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat mo6751initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
    };

    /* loaded from: game-lib.jar:android/util/Log$TerribleFailureHandler.class */
    public interface TerribleFailureHandler {
    }

    public static native boolean isLoggable(String str, int i);

    private Log() {
    }

    /* renamed from: a */
    public static int m6352a(String str, String str2) {
        return m6355a(0, 2, str, str2);
    }

    /* renamed from: b */
    public static int m6349b(String str, String str2) {
        return m6355a(0, 3, str, str2);
    }

    /* renamed from: c */
    public static int m6347c(String str, String str2) {
        return m6355a(0, 5, str, str2);
    }

    /* renamed from: a */
    public static int m6351a(String str, String str2, Throwable th) {
        return m6355a(0, 5, str, str2 + '\n' + m6350a(th));
    }

    /* renamed from: d */
    public static int m6345d(String str, String str2) {
        return m6355a(0, 6, str, str2);
    }

    /* renamed from: b */
    public static int m6348b(String str, String str2, Throwable th) {
        return m6355a(0, 6, str, str2 + '\n' + m6350a(th));
    }

    /* renamed from: c */
    public static int m6346c(String str, String str2, Throwable th) {
        return m6353a(0, str, str2, th, false);
    }

    /* renamed from: a */
    static int m6353a(int i, String str, String str2, Throwable th, boolean z) {
        throw new RuntimeException("removed");
    }

    /* renamed from: a */
    public static String m6350a(Throwable th) {
        StackTraceElement[] stackTrace;
        StringWriter stringWriter = new StringWriter();
        int length = new Throwable().getStackTrace().length;
        for (int i = 0; i < length; i++) {
            stringWriter.write(stackTrace[i].toString() + "\n");
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static int m6355a(int i, int i2, String str, String str2) {
        m6354a(i, str, str2);
        return 0;
    }

    /* renamed from: a */
    public static int m6354a(int i, String str, String str2) {
        System.out.println(((SimpleDateFormat) f302a.get()).format(new Date()) + ": " + str2);
        return 0;
    }
}
