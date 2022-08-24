package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.net.Uri;
import com.corrodinggames.rts.appFramework.android.AndroidSAF;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/a.class */
public class C1068a extends AbstractC1076af {

    /* renamed from: a */
    static AndroidSAF f6792a = AndroidSAF.getInstance();

    /* renamed from: b */
    static HashMap f6793b = new HashMap();

    /* renamed from: c */
    public static int f6794c = 1;

    /* renamed from: h */
    public static void m743h(String str) {
        GameEngine.PrintLog("Saf: " + str);
    }

    /* renamed from: i */
    public static void m742i(String str) {
    }

    /* renamed from: j */
    public static void m741j(String str) {
        GameEngine.PrintLog("Saf: " + str);
    }

    /* renamed from: k */
    public static void m740k(String str) {
    }

    /* renamed from: l */
    public static boolean m739l(String str) {
        if (str.contains(".[saflink]/") || str.contains(".[saflink]\\") || str.endsWith(".[saflink]")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static String m738m(String str) {
        int indexOf = str.indexOf(".[saflink]/");
        int indexOf2 = str.indexOf(".[saflink]\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".[saflink]")) {
            indexOf = str.length() - ".[saflink]".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find saf link in path: " + str);
        }
        return str.substring(0, indexOf + ".[saflink]".length());
    }

    /* renamed from: d */
    public static C1069b m744d(String str, boolean z) {
        String m738m = m738m(str);
        synchronized (f6793b) {
            C1069b c1069b = (C1069b) f6793b.get(m738m);
            if (c1069b == null) {
                C0750a.m2452b("Folder link no longer open");
                return null;
            }
            return c1069b;
        }
    }

    /* renamed from: a */
    public void mo635a() {
        synchronized (f6793b) {
            for (C1069b c1069b : f6793b.values()) {
                c1069b.m736a();
            }
        }
    }

    /* renamed from: a */
    public static String m746a(Uri uri, boolean z) {
        GameEngine.PrintLog("createSAFLink: " + uri);
        synchronized (f6793b) {
            String str = "/saf-virtual/" + f6794c + ".[saflink]";
            f6794c++;
            if (m745a(uri, z, str) == null) {
                return null;
            }
            return str;
        }
    }

    /* renamed from: a */
    public static C1069b m745a(Uri uri, boolean z, String str) {
        C1069b c1069b;
        GameEngine.PrintLog("createSAFLink: " + uri + " to " + str);
        synchronized (f6793b) {
            if (((C1069b) f6793b.get(str)) != null) {
                GameEngine.m1139b("createSAFLink: Already open");
            }
            c1069b = new C1069b(uri, z);
            try {
                c1069b.m732b();
                f6793b.put(str, c1069b);
            } catch (IOException e) {
                e.printStackTrace();
                C0750a.m2452b("Failed to list files: " + e.getMessage());
                return null;
            }
        }
        return c1069b;
    }

    /* renamed from: n */
    public static String m737n(String str) {
        String substring = str.substring(m738m(str).length());
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
            String[] m2284c = C0758f.m2284c(substring, '/');
            ArrayList arrayList = new ArrayList(m2284c.length);
            int i = 0;
            for (int length = m2284c.length - 1; length >= 0; length--) {
                if (m2284c[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, m2284c[length]);
                }
            }
            if (i != 0) {
                m741j("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0758f.m2338a("/", arrayList);
        }
        return substring;
    }

    /* renamed from: a */
    public boolean mo634a(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            m743h("fileExists failed to open for: " + str);
            return false;
        }
        try {
            return m744d.m735a(m737n(str));
        } catch (IOException e) {
            m742i("fileExists failed for: " + str);
            return false;
        }
    }

    /* renamed from: f */
    public String mo625f(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return str;
        }
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            m741j("convertAbstractPathForDebug failed for: " + str);
            return str;
        }
        return m744d.f6797c + "/" + m737n(str);
    }

    /* renamed from: d */
    public boolean mo627d(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            return false;
        }
        try {
            return m744d.m724h(m737n(str));
        } catch (IOException e) {
            m742i("isDirectory failed for: " + str);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo626e(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            m742i("createDirectory on root path: " + str);
            return false;
        }
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            m741j("createDirectory failed for: " + str);
            return false;
        }
        try {
            return m744d.m722j(m737n(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public String[] mo631b(String str) {
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            return null;
        }
        try {
            return m744d.m725g(m737n(str));
        } catch (IOException e) {
            e.printStackTrace();
            C0750a.m2452b("Failed to open saf, " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public long mo632a(String str, boolean z) {
        C1069b m744d = m744d(str, z);
        if (m744d == null) {
            m741j("saf==null: for '" + str + "'");
            return -1L;
        }
        return m744d.m728d(m737n(str));
    }

    /* renamed from: b */
    public C1098j mo630b(String str, boolean z) {
        C1069b m744d = m744d(str, z);
        if (m744d == null) {
            m741j("openAssetSteam: saf==null: for '" + str + "'");
            return null;
        }
        String m737n = m737n(str);
        try {
            C1098j m731b = m744d.m731b(m737n);
            if (m731b == null) {
                m740k("openAssetSteam: Failed to find: '" + m737n + "' in: '" + str + "'");
            }
            return m731b;
        } catch (IOException e) {
            e.printStackTrace();
            m741j("Error opening: '" + m737n + "' in: '" + str + "'");
            return null;
        }
    }

    /* renamed from: g */
    public long mo624g(String str) {
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            m743h("saf==null: for '" + str + "'");
            return 0L;
        }
        try {
            return m744d.m729c(m737n(str));
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: c */
    public OutputStream mo628c(String str, boolean z) {
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            return null;
        }
        String m737n = m737n(str);
        OutputStream m733a = m744d.m733a(m737n, z);
        if (m733a == null) {
            m741j("Failed to find: '" + m737n + "' in: '" + str + "'");
        }
        return m733a;
    }

    /* renamed from: a */
    public boolean mo633a(String str, String str2) {
        m743h("Rename: " + str + " to " + str2);
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            return false;
        }
        String m737n = m737n(str);
        String m737n2 = m737n(str2);
        m742i("Relative path: " + m737n + " to " + m737n2);
        return m744d.m734a(m737n, m737n2);
    }

    /* renamed from: c */
    public boolean mo629c(String str) {
        m743h("deleteFile: " + str);
        C1069b m744d = m744d(str, true);
        if (m744d == null) {
            m741j("saf==null: for deleteFile: '" + str + "'");
            return false;
        }
        return m744d.m727e(m737n(str));
    }
}
