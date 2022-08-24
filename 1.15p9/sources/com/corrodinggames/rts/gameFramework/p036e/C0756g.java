package com.corrodinggames.rts.gameFramework.p036e;

import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.corrodinggames.rts.gameFramework.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/g.class */
public class C0756g {

    /* renamed from: a */
    public static boolean f4880a = true;

    /* renamed from: a */
    public static final String m2384a(char c) {
        return String.valueOf((int) c);
    }

    /* renamed from: a */
    public static String m2382a(String str, char c) {
        if (C0758f.m2299b(str, c)) {
            str = C0758f.m2326a(str, String.valueOf(c), "%" + m2384a(c));
        }
        return str;
    }

    /* renamed from: a */
    public static String m2383a(String str) {
        if (str == null) {
            return "null";
        }
        String m2382a = m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(m2382a(C0758f.m2326a(str, "%", "%%"), '/'), '\\'), ':'), '\"'), '\''), '|'), '?'), '*'), '<'), '>'), (char) 0);
        if (m2382a.contains("/")) {
            throw new IllegalArgumentException();
        }
        if (m2382a.contains("\\")) {
            throw new IllegalArgumentException();
        }
        return m2382a;
    }

    /* renamed from: a */
    public static String m2378a(String str, String str2, boolean z) {
        String str3 = C0750a.m2445e() + m2383a(str) + ".cachedata";
        if (z) {
            File file = new File(str3);
            if (!file.isDirectory() && !file.mkdirs()) {
                GameEngine.PrintLog("Failed to create folder for:" + file.getAbsolutePath());
            }
        }
        return str3 + "/" + m2383a(str2);
    }

    /* renamed from: a */
    public static boolean m2379a(String str, String str2, String str3) {
        try {
            return m2380a(str, str2, new ByteArrayInputStream(str3.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m2380a(String str, String str2, InputStream inputStream) {
        try {
            String m2378a = m2378a(str, str2, true);
            File file = new File(m2378a);
            File file2 = new File(m2378a + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            C0758f.m2339a(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!C0750a.m2462a(file2, file)) {
                GameEngine.m1139b("AddToCache: Failed to rename to final file: " + m2378a);
                return false;
            } else if (f4880a) {
                GameEngine.PrintLog("Wrote cache file at: " + file.getAbsolutePath());
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static FileInputStream m2381a(String str, String str2) {
        try {
            File file = new File(m2378a(str, str2, false));
            if (!file.exists()) {
                return null;
            }
            file.setLastModified(System.currentTimeMillis());
            return new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m2377b(String str, String str2) {
        FileInputStream m2381a = m2381a(str, str2);
        if (m2381a == null) {
            return null;
        }
        return C0758f.m2340a(m2381a);
    }

    /* renamed from: c */
    public static void m2375c(String str, String str2) {
        String m2378a = m2378a(str, str2, false);
        File file = new File(m2378a);
        if (file.exists() && !file.delete()) {
            GameEngine.m1114g("Failed to delete: " + m2378a);
        }
    }

    /* renamed from: b */
    private static C0757h m2376b(String str, String str2, String str3) {
        String[] m2257f;
        String str4 = str2 + ".data";
        String m2377b = m2377b(str, str2 + ".meta");
        if (m2377b != null && (m2257f = C0758f.m2257f(m2377b, ":")) != null) {
            Long m2239m = C0758f.m2239m(m2257f[0]);
            long m2436l = C0750a.m2436l(str2);
            String str5 = m2257f[1];
            if (m2239m == null) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Bad meta data for: " + str2);
                    return null;
                }
                return null;
            } else if (m2239m.longValue() != m2436l) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Stale timestamp for: " + str2 + " (" + m2239m + "!=" + m2436l + ")");
                    return null;
                }
                return null;
            } else if (str5.startsWith("null")) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Cache hit (null-type) for: " + str2 + " (" + m2239m + "!=" + m2436l + ")");
                }
                return new C0757h(null);
            } else if (!str5.startsWith(str3)) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Unsupported type " + str5 + " for: " + str2 + " expected: " + str3);
                }
                return new C0757h(null);
            } else {
                FileInputStream m2381a = m2381a(str, str4);
                if (m2381a != null) {
                    if (f4880a) {
                        GameEngine.PrintLog("openAssetCached: Cache hit for: " + str2);
                    }
                    return new C0757h(m2381a);
                } else if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: meta file but not data for: " + str2);
                    return null;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String[] m2374d(String str, String str2) {
        String str3;
        long m2436l;
        if (!C1077ag.m608i(str2)) {
            return C0750a.m2441g(str2);
        }
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0757h m2376b = m2376b(str, str2, "list");
        if (m2376b != null) {
            if (m2376b.f4881a == null) {
                return null;
            }
            String m2340a = C0758f.m2340a(m2376b.f4881a);
            m2376b.m2371a();
            return C0758f.m2234r(m2340a);
        }
        String[] m2441g = C0750a.m2441g(str2);
        if (m2441g != null) {
            if (f4880a) {
                GameEngine.PrintLog("listDirCached: Listing count: " + m2441g.length);
            }
            str3 = "list";
            m2436l = C0750a.m2436l(str2);
            if (m2436l == 0) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2441g;
            }
            m2379a(str, str4, C0758f.m2319a(m2441g));
        } else {
            if (f4880a) {
                GameEngine.PrintLog("listDirCached: Null");
            }
            str3 = "null";
            m2436l = C0750a.m2436l(str2);
        }
        m2379a(str, str5, m2436l + ":" + str3);
        return m2441g;
    }

    /* renamed from: e */
    public static InputStream m2373e(String str, String str2) {
        String str3;
        long m2436l;
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0757h m2376b = m2376b(str, str2, "data");
        if (m2376b != null) {
            return m2376b.f4881a;
        }
        if (f4880a) {
            GameEngine.PrintLog("openAssetCached: Cache miss for: " + str2);
        }
        C1098j m2438j = C0750a.m2438j(str2);
        if (m2438j != null) {
            if (f4880a) {
                GameEngine.PrintLog("openAssetCached: Reading: " + str2);
            }
            str3 = "data";
            m2436l = C0750a.m2436l(str2);
            if (m2436l == 0) {
                if (f4880a) {
                    GameEngine.PrintLog("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2438j;
            } else if (!m2380a(str, str4, m2438j)) {
            }
        } else {
            if (f4880a) {
                GameEngine.PrintLog("openAssetCached: Got null for: " + str2);
            }
            str3 = "null";
            m2436l = C0750a.m2436l(str2);
        }
        m2379a(str, str5, m2436l + ":" + str3);
        if (m2438j == null) {
            return null;
        }
        try {
            m2438j.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream m2381a = m2381a(str, str4);
        if (m2381a == null) {
            GameEngine.m1139b("openAssetCached: Error. Failed to reopen cache: " + str2);
            return C0750a.m2438j(str2);
        }
        return m2381a;
    }

    /* renamed from: f */
    public static boolean m2372f(String str, String str2) {
        InputStream m2373e = m2373e(str, str2);
        if (m2373e == null) {
            return false;
        }
        try {
            m2373e.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }
}
