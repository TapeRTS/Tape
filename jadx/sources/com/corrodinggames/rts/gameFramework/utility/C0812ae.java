package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ae.class */
public class C0812ae {

    /* renamed from: a */
    static HashMap f5730a = new HashMap();

    /* renamed from: a */
    public static void m548a(String str) {
        AbstractC0789l.m670d("Zip: " + str);
    }

    /* renamed from: b */
    public static boolean m546b(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C0813af c = m543c(str, true);
        if (c == null) {
            return false;
        }
        return c.m535c(m539g(str));
    }

    /* renamed from: c */
    public static boolean m544c(String str) {
        if (str.contains(".rwmod/") || str.contains(".rwmod\\") || str.endsWith(".rwmod")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m542d(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C0813af c = m543c(str, true);
        if (c == null) {
            return false;
        }
        return c.m534d(m539g(str));
    }

    /* renamed from: e */
    public static String[] m541e(String str) {
        C0813af c = m543c(str, true);
        if (c == null) {
            return null;
        }
        return c.m533e(m539g(str));
    }

    /* renamed from: a */
    public static long m547a(String str, boolean z) {
        C0813af c = m543c(str, z);
        if (c == null) {
            return -1L;
        }
        return c.m530h(m539g(str));
    }

    /* renamed from: b */
    public static C0832j m545b(String str, boolean z) {
        C0813af c = m543c(str, z);
        if (c == null) {
            return null;
        }
        return c.m529i(m539g(str));
    }

    /* renamed from: f */
    public static String m540f(String str) {
        int indexOf = str.indexOf(".rwmod/");
        int indexOf2 = str.indexOf(".rwmod\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".rwmod")) {
            indexOf = str.length() - ".rwmod".length();
        }
        if (indexOf != -1) {
            return str.substring(0, indexOf + ".rwmod".length());
        }
        throw new RuntimeException("Could not find .rwmod in path: " + str);
    }

    /* renamed from: c */
    public static C0813af m543c(String str, boolean z) {
        C0813af afVar;
        String str2;
        String f = m540f(str);
        synchronized (f5730a) {
            afVar = (C0813af) f5730a.get(f);
            if (afVar == null) {
                if (z) {
                    str2 = f;
                } else {
                    str2 = C0596a.m1889c(f);
                }
                try {
                    afVar = new C0813af(f, str2);
                    f5730a.put(f, afVar);
                } catch (IOException e) {
                    m548a("Failed to open source zip: '" + str2 + "'");
                    e.printStackTrace();
                    C0596a.m1894a("Failed to open zip, " + e.getMessage());
                    return null;
                } catch (IllegalArgumentException e2) {
                    m548a("Failed to open source zip: '" + str2 + "'");
                    e2.printStackTrace();
                    C0596a.m1894a("Failed to open zip, " + e2.getMessage());
                    return null;
                }
            }
        }
        return afVar;
    }

    /* renamed from: g */
    public static String m539g(String str) {
        String substring = str.substring(m540f(str).length());
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.contains("\\")) {
            substring = substring.replace("\\", "/");
        }
        if (substring.contains("..")) {
            String[] b = C0654f.m1464b(substring, '/');
            ArrayList arrayList = new ArrayList(b.length);
            int i = 0;
            for (int length = b.length - 1; length >= 0; length--) {
                if (b[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, b[length]);
                }
            }
            if (i != 0) {
                m548a("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0654f.m1495a("/", arrayList);
        }
        return substring;
    }
}
