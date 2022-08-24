package com.corrodinggames.rts.gameFramework.p036e;

import android.content.Context;
import android.os.Build;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/a.class */
public class C0750a {

    /* renamed from: a */
    public static final C0752c f4859a = new C0752c();

    /* renamed from: b */
    public static C0752c f4860b = f4859a;

    /* renamed from: c */
    public static Boolean f4861c;

    /* renamed from: d */
    public static String f4862d;

    /* renamed from: e */
    public static String f4863e;

    /* renamed from: a */
    protected static String m2469a() {
        File mo7350b = C0090c.m6984a().mo7350b(null);
        if (mo7350b != null) {
            return mo7350b.getAbsolutePath();
        }
        GameEngine.m1145b("Failed to get an internal path.");
        return null;
    }

    /* renamed from: b */
    public static void m2458b() {
        f4863e = null;
        if (GameEngine.m1159as()) {
            if (Build.VERSION.SDK_INT < 19) {
                f4863e = "Android version too old for new file system support";
                GameEngine.PrintLog("FileLoader: SDK too old, not changing FileLoader");
                return;
            }
            int i = GameEngine.getInstance().f6109bQ.storageType;
            GameEngine.PrintLog("FileLoader: storageBehaviour:" + i);
            C0752c m2468a = m2468a(i);
            GameEngine.PrintLog("Using file loader: " + m2468a.mo2389d());
            f4860b = m2468a;
        }
    }

    /* renamed from: a */
    public static boolean m2463a(String str) {
        return f4860b.m2411q(str);
    }

    /* renamed from: a */
    public static C0751b m2459a(boolean z) {
        C0751b c0751b = new C0751b();
        if (!GameEngine.m1159as()) {
            c0751b.f4865b = false;
            c0751b.f4866c = true;
            return c0751b;
        } else if (Build.VERSION.SDK_INT < 19) {
            c0751b.f4865b = false;
            c0751b.f4866c = true;
            return c0751b;
        } else {
            c0751b.f4865b = true;
            c0751b.f4864a = false;
            if (f4862d != null) {
                c0751b.f4864a = true;
            }
            if (f4861c != null && !f4861c.booleanValue()) {
                c0751b.f4866c = true;
                c0751b.f4865b = false;
                c0751b.f4864a = false;
            }
            if (Build.VERSION.SDK_INT <= 28 && f4861c == null) {
                GameEngine.m1145b("FileLoader using direct external access due to sdk: " + Build.VERSION.SDK_INT);
                c0751b.f4866c = true;
                c0751b.f4865b = false;
                c0751b.f4864a = false;
            }
            return c0751b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.corrodinggames.rts.gameFramework.e.c] */
    /* renamed from: a */
    public static C0752c m2468a(int i) {
        C0753d c0753d;
        C0754e c0754e;
        if (!GameEngine.m1159as()) {
            return new C0752c();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String m2469a = m2469a();
            C0753d c0753d2 = null;
            if (m2469a == null) {
                f4863e = "Failed to get internal app path (is it unmounted?).";
                i = 3;
            } else {
                c0753d2 = new C0753d(m2469a, "internal");
                c0753d2.f4875i = "Internal: ";
            }
            C0751b m2459a = m2459a(false);
            if (!m2459a.f4864a) {
                if (!m2459a.f4866c) {
                    GameEngine.m1145b("Not using direct external backend: As direct reads will cause problems");
                    c0753d = null;
                    i = 0;
                } else {
                    GameEngine.m1145b("FileLoader using direct external file access! SDK:" + Build.VERSION.SDK_INT);
                    c0753d = new C0752c();
                }
            } else {
                GameEngine.PrintLog("FileLoader using overriddenExternalPath:" + f4862d);
                c0753d = new C0753d(f4862d, "external");
            }
            C0755f c0755f = new C0755f();
            if (i != 3 && c0753d2 == null) {
                GameEngine.m1145b("No available file backends!!");
                return c0755f;
            }
            if (i == 1) {
                c0754e = new C0754e(c0753d2, "[INTERNAL-PATH]/", c0753d, "[EXTERNAL-PATH]/");
            } else if (i == 2) {
                c0754e = new C0754e(c0753d, "[EXTERNAL-PATH]/", c0753d2, "[INTERNAL-PATH]/");
            } else if (i == 3) {
                c0754e = new C0754e(c0753d, "[EXTERNAL-PATH]/", c0755f, "[NULL-PATH]/");
            } else {
                c0754e = new C0754e(c0753d2, "[INTERNAL-PATH]/", c0755f, "[NULL-PATH]/");
            }
            c0754e.f4877h.f4870d = true;
            return c0754e;
        }
        GameEngine.PrintLog("FileLoader: SDK too old, not changing FileLoader");
        return new C0752c();
    }

    /* renamed from: c */
    public static String m2453c() {
        return f4860b.m2435a();
    }

    /* renamed from: b */
    public static void m2455b(String str) {
        f4860b.m2432a(str);
    }

    /* renamed from: a */
    public static String m2462a(String str, String str2) {
        return f4860b.m2431a(str, str2);
    }

    /* renamed from: c */
    public static boolean m2451c(String str) {
        return f4860b.m2428b(str);
    }

    /* renamed from: d */
    public static String m2449d(String str) {
        return f4860b.mo2410e(str);
    }

    /* renamed from: e */
    public static String m2447e(String str) {
        return f4860b.m2422f(str);
    }

    /* renamed from: f */
    public static boolean m2445f(String str) {
        return f4860b.m2421g(str);
    }

    /* renamed from: g */
    public static String[] m2444g(String str) {
        return f4860b.mo2391a(str, false);
    }

    /* renamed from: a */
    public static String[] m2460a(String str, boolean z) {
        return f4860b.mo2391a(str, z);
    }

    /* renamed from: h */
    public static boolean m2443h(String str) {
        return f4860b.m2420h(str);
    }

    /* renamed from: i */
    public static C1098j m2442i(String str) {
        return f4860b.m2418j(str);
    }

    /* renamed from: a */
    public static C1098j m2466a(File file) {
        return f4860b.m2417k(file.getAbsolutePath());
    }

    /* renamed from: j */
    public static C1098j m2441j(String str) {
        return f4860b.m2417k(str);
    }

    /* renamed from: a */
    public static OutputStream m2464a(File file, boolean z) {
        return f4860b.m2427b(file.getAbsolutePath(), z);
    }

    /* renamed from: b */
    public static OutputStream m2454b(String str, boolean z) {
        return f4860b.m2427b(str, z);
    }

    /* renamed from: k */
    public static boolean m2440k(String str) {
        return f4860b.m2416l(str);
    }

    /* renamed from: d */
    public static String m2450d() {
        return f4860b.mo2390b();
    }

    /* renamed from: e */
    public static String m2448e() {
        return f4860b.m2426c();
    }

    /* renamed from: l */
    public static long m2439l(String str) {
        return f4860b.m2415m(str);
    }

    /* renamed from: a */
    public static File m2461a(String str, String str2, boolean z) {
        return f4860b.m2430a(str, str2, z);
    }

    /* renamed from: a */
    public static boolean m2465a(File file, File file2) {
        if (GameEngine.m1157au() && file2.exists()) {
            file2.delete();
        }
        if (!file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m2456b(File file, File file2) {
        return f4860b.m2433a(file, file2);
    }

    /* renamed from: b */
    public static boolean m2457b(File file) {
        return f4860b.m2429b(file);
    }

    /* renamed from: m */
    public static String m2438m(String str) {
        return f4860b.m2414n(str);
    }

    /* renamed from: f */
    public static boolean m2446f() {
        return f4860b.mo2388e();
    }

    /* renamed from: n */
    public static String m2437n(String str) {
        return f4860b.m2413o(str);
    }

    /* renamed from: o */
    public static String m2436o(String str) {
        return f4860b.m2412p(str);
    }

    /* renamed from: a */
    public static File m2467a(Context context, String str, String str2) {
        try {
            return File.createTempFile(str, str2, context.mo7342i());
        } catch (IOException e) {
            try {
                return File.createTempFile(str, str2, context.mo7341j());
            } catch (IOException e2) {
                e.printStackTrace();
                throw e2;
            }
        }
    }

    /* renamed from: c */
    public static void m2452c(File file) {
        f4860b.m2434a(file);
    }
}
