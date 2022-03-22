package com.corrodinggames.rts.p008a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.p003os.Handler;
import android.p003os.Looper;
import android.support.p004v4.app.ActivityCompat;
import android.support.p004v4.content.ContextCompat;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/c.class */
public class C0067c {

    /* renamed from: a */
    static Handler f382a;

    /* renamed from: b */
    static volatile Context f383b;

    /* renamed from: a */
    public static int m3957a(String str) {
        String[] split;
        String str2 = null;
        if (str != null) {
            str2 = C0654f.m1416k(str);
        }
        if (str2 != null) {
            Matcher matcher = Pattern.compile("^ *\\[([^\\]]*)\\].*").matcher(str2);
            if (matcher.matches()) {
                for (String str3 : matcher.group(1).split(";")) {
                    if (str3.startsWith("p") && str3.length() >= 2) {
                        String substring = str3.substring(1);
                        try {
                            return Integer.parseInt(substring);
                        } catch (NumberFormatException e) {
                            AbstractC0789l.m670d("getNumberOfPlayersInMap: NumberFormatException:" + substring);
                            return -1;
                        }
                    }
                }
            }
        }
        AbstractC0789l.m670d("getNumberOfPlayersInMap: fail to match:" + str2);
        return -1;
    }

    /* renamed from: b */
    public static String m3955b(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(File.separator)) {
            String[] split = str.split(Pattern.quote(File.separator));
            str = split[split.length - 1];
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/");
            str = split2[split2.length - 1];
        }
        String str2 = null;
        if (0 == 0) {
            Matcher matcher = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher2 = Pattern.compile("^l\\d*;(.+)\\.tmx").matcher(str);
            if (matcher2.matches()) {
                str2 = matcher2.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher3 = Pattern.compile("^ *\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher3.matches()) {
                str2 = matcher3.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher4 = Pattern.compile("(.*)\\.tmx").matcher(str);
            if (matcher4.matches()) {
                str2 = matcher4.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            str2 = str;
        }
        return str2.replace('_', ' ');
    }

    /* renamed from: c */
    public static String m3953c(String str) {
        return str.replace(".tmx", "") + "_map.png";
    }

    /* renamed from: c */
    private static void m3954c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.m4292a().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* renamed from: d */
    private static void m3952d(Activity activity) {
    }

    /* renamed from: a */
    public static void m3958a(Runnable runnable) {
        if (f382a == null) {
            f382a = new Handler(Looper.m4072b());
        }
        f382a.m4082a(runnable);
    }

    /* renamed from: a */
    public static Context m3963a() {
        if (f383b != null) {
            return f383b;
        }
        throw new RuntimeException("ApplicationContext==null");
    }

    /* renamed from: a */
    public static void m3962a(Activity activity) {
        if (f383b == null) {
            f383b = activity.mo4274g();
        }
    }

    /* renamed from: a */
    public static void m3959a(Context context) {
        if (f383b == null) {
            f383b = context.mo4274g();
        }
    }

    /* renamed from: a */
    public static void m3960a(Activity activity, boolean z, boolean z2) {
        m3962a(activity);
        if (z2) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (u != null && u.f5516by.immersiveFullScreen) {
                m3954c(activity);
            }
        } else {
            m3952d(activity);
        }
        AbstractC0789l u2 = AbstractC0789l.m638u();
        if (u2 != null) {
            u2.m742S();
        }
        if (z) {
            activity.m4292a().setBackgroundDrawable(null);
        }
    }

    /* renamed from: a */
    public static void m3961a(Activity activity, boolean z) {
        if (z) {
            activity.m4290a(0, 0);
        }
    }

    /* renamed from: b */
    public static boolean m3956b(Activity activity) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (AbstractC0789l.f5471aF || Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (u.m692aq() == null) {
        }
        if (ContextCompat.m4044a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            AbstractC0789l.m670d("File Permission is granted");
            return true;
        }
        AbstractC0789l.m670d("Permission is revoked");
        ActivityCompat.m4045a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        return false;
    }
}
