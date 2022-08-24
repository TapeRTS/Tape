package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag.class */
public class C1077ag extends AbstractC1076af {

    /* renamed from: a */
    static HashMap f6835a = new HashMap();

    /* renamed from: h */
    public static void m609h(String str) {
        GameEngine.PrintLog("Zip: " + str);
    }

    /* renamed from: a */
    public boolean mo634a(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1079ah m614d = m614d(str, true);
        if (m614d == null) {
            return false;
        }
        return m614d.m598c(m605l(str));
    }

    /* renamed from: f */
    public String mo625f(String str) {
        return str;
    }

    /* renamed from: i */
    public static boolean m608i(String str) {
        if (str.contains(".rwmod/") || str.contains(".rwmod\\") || str.endsWith(".rwmod")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo627d(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1079ah m614d = m614d(str, true);
        if (m614d == null) {
            return false;
        }
        return m614d.m597d(m605l(str));
    }

    /* renamed from: e */
    public boolean mo626e(String str) {
        m609h("createDirectory not supported in zip files: " + str);
        return false;
    }

    /* renamed from: b */
    public String[] mo631b(String str) {
        C1079ah m614d = m614d(str, true);
        if (m614d == null) {
            return null;
        }
        return m614d.m596e(m605l(str));
    }

    /* renamed from: a */
    public long mo632a(String str, boolean z) {
        C1079ah m614d = m614d(str, z);
        if (m614d == null) {
            return -1L;
        }
        return m614d.m593h(m605l(str));
    }

    /* renamed from: b */
    public C1098j mo630b(String str, boolean z) {
        C1079ah m614d = m614d(str, z);
        if (m614d == null) {
            return null;
        }
        return m614d.m592i(m605l(str));
    }

    /* renamed from: g */
    public long mo624g(String str) {
        String m607j = m607j(str);
        AbstractC1076af m637b = C1075ae.m637b(m607j);
        if (m637b != null) {
            return m637b.mo624g(m607j);
        }
        return new File(m607j).lastModified();
    }

    /* renamed from: c */
    public OutputStream mo628c(String str, boolean z) {
        m609h("writableOutputSteam not supported in zip files: " + str);
        return null;
    }

    /* renamed from: a */
    public boolean mo633a(String str, String str2) {
        m609h("Rename not supported in zip files: " + str + " to " + str2);
        return false;
    }

    /* renamed from: c */
    public boolean mo629c(String str) {
        m609h("Delete not supported in zip files: " + str);
        return false;
    }

    /* renamed from: j */
    public static String m607j(String str) {
        int indexOf = str.indexOf(".rwmod/");
        int indexOf2 = str.indexOf(".rwmod\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".rwmod")) {
            indexOf = str.length() - ".rwmod".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find .rwmod in path: " + str);
        }
        return str.substring(0, indexOf + ".rwmod".length());
    }

    /* renamed from: d */
    public static C1079ah m614d(String str, boolean z) {
        C1079ah c1079ah;
        String m2444e;
        String m607j = m607j(str);
        synchronized (f6835a) {
            C1079ah c1079ah2 = (C1079ah) f6835a.get(m607j);
            if (c1079ah2 == null) {
                if (z) {
                    m2444e = m607j;
                } else {
                    m2444e = C0750a.m2444e(m607j);
                }
                try {
                    try {
                        c1079ah2 = new C1079ah(m607j, m2444e);
                        f6835a.put(m607j, c1079ah2);
                    } catch (IllegalArgumentException e) {
                        m609h("Failed to open source zip: '" + m2444e + "'");
                        e.printStackTrace();
                        C0750a.m2452b("Failed to open zip, " + e.getMessage());
                        return null;
                    }
                } catch (IOException e2) {
                    m609h("Failed to open source zip: '" + m2444e + "'");
                    e2.printStackTrace();
                    String str2 = "Failed to open zip, " + e2.getMessage();
                    if (C0750a.m2442f(m2444e)) {
                        m609h("isDirectory: " + m2444e);
                        str2 = "Failed to open .rwmod file (Appears to be a directory!). Please remove .rwmod from any folder names.";
                    }
                    C0750a.m2452b(str2 + VariableScope.nullOrMissingString);
                    return null;
                }
            }
            c1079ah = c1079ah2;
        }
        return c1079ah;
    }

    /* renamed from: e */
    public static void m612e(String str, boolean z) {
        String m607j = m607j(str);
        synchronized (f6835a) {
            C1079ah c1079ah = (C1079ah) f6835a.remove(m607j);
            if (c1079ah != null) {
                GameEngine.PrintLog("Closing zip file: " + m607j);
                new Thread(new RunnableC10781(m607j, c1079ah)).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.utility.ag$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag$1.class */
    public final class RunnableC10781 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6836a;

        /* renamed from: b */
        final /* synthetic */ C1079ah f6837b;

        RunnableC10781(String str, C1079ah c1079ah) {
            this.f6836a = str;
            this.f6837b = c1079ah;
        }

        public void run() {
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameEngine.PrintLog("Running delayed close of zip: " + this.f6836a);
            this.f6837b.m604a();
        }
    }

    /* renamed from: k */
    public void m606k(String str) {
        m612e(str, false);
    }

    /* renamed from: a */
    public void mo635a() {
    }

    /* renamed from: l */
    public static String m605l(String str) {
        String substring = str.substring(m607j(str).length());
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
                m609h("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0758f.m2338a("/", arrayList);
        }
        return substring;
    }
}
