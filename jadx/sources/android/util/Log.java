package android.util;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: game-lib.jar:android/util/Log.class */
public final class Log {

    /* renamed from: a */
    private static final ThreadLocal f299a = new ThreadLocal() { // from class: android.util.Log.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
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
    public static int m4040a(String str, String str2) {
        return m4043a(0, 2, str, str2);
    }

    /* renamed from: b */
    public static int m4037b(String str, String str2) {
        return m4043a(0, 3, str, str2);
    }

    /* renamed from: c */
    public static int m4035c(String str, String str2) {
        return m4043a(0, 5, str, str2);
    }

    /* renamed from: a */
    public static int m4039a(String str, String str2, Throwable th) {
        return m4043a(0, 5, str, str2 + '\n' + m4038a(th));
    }

    /* renamed from: d */
    public static int m4033d(String str, String str2) {
        return m4043a(0, 6, str, str2);
    }

    /* renamed from: b */
    public static int m4036b(String str, String str2, Throwable th) {
        return m4043a(0, 6, str, str2 + '\n' + m4038a(th));
    }

    /* renamed from: c */
    public static int m4034c(String str, String str2, Throwable th) {
        return m4041a(0, str, str2, th, false);
    }

    /* renamed from: a */
    static int m4041a(int i, String str, String str2, Throwable th, boolean z) {
        throw new RuntimeException("removed");
    }

    /* renamed from: a */
    public static String m4038a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length;
        for (int i = 0; i < length; i++) {
            stringWriter.write(stackTrace[i].toString() + "\n");
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static int m4043a(int i, int i2, String str, String str2) {
        m4042a(i, str, str2);
        return 0;
    }

    /* renamed from: a */
    public static int m4042a(int i, String str, String str2) {
        System.out.println(((SimpleDateFormat) f299a.get()).format(new Date()) + ": " + str2);
        return 0;
    }
}
