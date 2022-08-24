package com.corrodinggames.rts.gameFramework.p040h;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/a.class */
public class C0823a {

    /* renamed from: a */
    public static String f5405a;

    /* renamed from: b */
    public static String f5406b;

    /* renamed from: c */
    public C0824b f5407c = new C0824b();

    /* renamed from: d */
    Object f5408d = new Object();

    /* renamed from: e */
    ArrayList f5409e = new ArrayList();

    /* renamed from: f */
    ArrayList f5410f = new ArrayList();

    public C0823a() {
        try {
            m1874a(GameEngine.getInstance().m1099t());
        } catch (C0412bm e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static int m1873a(String str, int i) {
        String[] m2287c = CommonUtils.m2287c(str, '.');
        if (m2287c == null) {
            throw new C0412bm("Unexpected version format (Missing " + i + ")");
        }
        if (m2287c.length > 3) {
            throw new C0412bm("Unexpected version format (" + str + ")");
        }
        if (m2287c.length <= i) {
            return 0;
        }
        try {
            return Integer.valueOf(m2287c[i]).intValue();
        } catch (NumberFormatException e) {
            throw new C0412bm("Unexpected version format (Bad " + i + ")", e);
        }
    }

    /* renamed from: a */
    public static void m1874a(String str) {
        m1871a(str, GameEngine.getInstance().m1099t());
    }

    /* renamed from: b */
    public static String m1864b(String str) {
        return CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(CommonUtils.m2329a(str, "v", VariableScope.nullOrMissingString).trim(), "a", VariableScope.nullOrMissingString), "b", VariableScope.nullOrMissingString), "c", VariableScope.nullOrMissingString), "d", VariableScope.nullOrMissingString), "e", VariableScope.nullOrMissingString), "f", VariableScope.nullOrMissingString), "g", VariableScope.nullOrMissingString), "h1", VariableScope.nullOrMissingString), "h2", VariableScope.nullOrMissingString), "h3", VariableScope.nullOrMissingString), "h4", VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    public static void m1871a(String str, String str2) {
        String m1864b = m1864b(str2);
        String m1864b2 = m1864b(str);
        try {
            int i = 1000;
            int i2 = 1000;
            if (m1864b.contains("p")) {
                String[] m2260f = CommonUtils.m2260f(m1864b, "p");
                try {
                    i = Integer.valueOf(m2260f[1]).intValue();
                    m1864b = m2260f[0];
                } catch (NumberFormatException e) {
                    throw new C0412bm("Unexpected min version:" + m1864b2 + " (Bad build number)", e);
                }
            }
            if (m1864b2.contains("p")) {
                String[] m2260f2 = CommonUtils.m2260f(m1864b2, "p");
                try {
                    i2 = Integer.valueOf(m2260f2[1]).intValue();
                    m1864b2 = m2260f2[0];
                } catch (NumberFormatException e2) {
                    throw new C0412bm("Unexpected min version:" + m1864b2 + "(Bad build number)", e2);
                }
            }
            try {
                int m1873a = m1873a(m1864b, 0);
                int m1873a2 = m1873a(m1864b2, 0);
                int m1873a3 = m1873a(m1864b, 1);
                int m1873a4 = m1873a(m1864b2, 1);
                int m1873a5 = m1873a(m1864b, 2);
                int m1873a6 = m1873a(m1864b2, 2);
                if (m1873a2 < 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1873a2 > m1873a) {
                    throw new C0412bm("Requires version: " + m1864b2 + " or higher. (You have: " + m1864b + ")");
                }
                if (m1873a > m1873a2) {
                    return;
                }
                if (m1873a4 < 10 && m1873a2 == 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1873a4 > m1873a3) {
                    throw new C0412bm("Requires version: " + m1864b2 + " or higher. (You have: " + m1864b + ")");
                }
                if (m1873a3 > m1873a4) {
                    return;
                }
                if (m1873a6 > m1873a5) {
                    throw new C0412bm("Requires version: " + m1864b2 + " or higher. (You have: " + m1864b + ")");
                }
                if (m1873a5 <= m1873a6 && i2 > i) {
                    throw new C0412bm("Requires newer build: " + m1864b2 + " or higher. (You have: " + m1864b + ")");
                }
            } catch (C0412bm e3) {
                throw new C0412bm("Requires version: " + m1864b2 + " or higher. " + e3.getMessage(), e3);
            }
        } catch (RuntimeException e4) {
            throw new C0412bm("Requires version: " + m1864b2 + " or higher." + e4.getMessage(), e4);
        }
    }

    /* renamed from: a */
    public void m1877a() {
        m1850k();
        m1857f();
    }

    /* renamed from: a */
    public int m1868a(boolean z) {
        int i = 0;
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (!c0824b.f5415f && !c0824b.f5439D && (!z || c0824b.f5452R == null)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public int m1865b() {
        int i = 0;
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (!c0824b.f5415f && c0824b.f5452R != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m1863c() {
        int i = 0;
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            if (!((C0824b) it.next()).f5435z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public void m1861d() {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5416g = c0824b.f5415f;
            c0824b.f5417h = false;
        }
    }

    /* renamed from: e */
    public void m1859e() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            String replace = c0824b.f5412c.replace(",", " ").replace("|", " ");
            if (replace.length() > 15) {
                replace = replace.substring(12) + "...";
            }
            if (str.length() != 0) {
                str = str + ",";
            }
            str = str + replace + "|" + c0824b.f5414e + "|" + (c0824b.f5415f ? "disabled" : "enabled");
        }
        gameEngine.f6109bQ.modSettingsVersion = 1;
        gameEngine.f6109bQ.modSettings = str;
    }

    /* renamed from: f */
    public void m1857f() {
        String[] split;
        boolean z;
        GameEngine.PrintLog("Loading mod selection");
        for (String str : GameEngine.getInstance().f6109bQ.modSettings.split(",")) {
            String[] split2 = str.split("\\|");
            if (split2.length != 3) {
                GameEngine.PrintLog("loadSelection: wrong count (" + split2.length + "):" + str);
            } else {
                String str2 = split2[0];
                String str3 = split2[1];
                String str4 = split2[2];
                if (str4.equals("enabled")) {
                    z = false;
                } else if (str4.equals("disabled")) {
                    z = true;
                } else {
                    GameEngine.PrintLog("loadSelection: Unknown option:" + str);
                }
                C0824b m1862c = m1862c(str3);
                if (m1862c == null) {
                    GameEngine.PrintLog("loadSelection: Did not find mod in settings:" + str2);
                } else {
                    m1862c.f5415f = z;
                    m1862c.f5418i = true;
                }
            }
        }
    }

    /* renamed from: c */
    public C0824b m1862c(String str) {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5414e.equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0824b m1876a(int i) {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5446L == i) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m1855g() {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            ((C0824b) it.next()).f5415f = true;
        }
    }

    /* renamed from: h */
    public int m1853h() {
        return this.f5409e.size();
    }

    /* renamed from: d */
    public C0824b m1860d(String str) {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5413d.equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0824b m1858e(String str) {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1846a().equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0824b m1870a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i) {
        C0824b m1862c = m1862c(str4);
        if (m1862c == null) {
            m1862c = new C0824b();
            m1862c.f5412c = str;
            m1862c.f5413d = str2;
            m1862c.f5414e = str4;
            m1862c.f5415f = !z;
        }
        if (m1862c.f5426q == null && str3 != null) {
            m1862c.f5426q = str3;
            m1862c.f5425p = m1862c.f5426q;
            m1862c.m1827n();
            if (m1862c.f5426q != null && m1862c.f5426q.toLowerCase(Locale.ROOT).contains("rwmod")) {
                m1862c.f5419j = true;
            }
        }
        m1862c.f5433x = i;
        m1862c.f5421l = true;
        m1862c.f5434y = z2;
        m1862c.f5435z = z3;
        if (!m1862c.f5435z) {
            m1862c.f5424o = "Storage: " + C0750a.m2449d(m1862c.f5426q);
        }
        m1862c.m1823r();
        synchronized (this.f5408d) {
            if (!this.f5409e.contains(m1862c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5409e);
                arrayList.add(m1862c);
                Collections.sort(arrayList);
                this.f5409e = arrayList;
            }
        }
        return m1862c;
    }

    /* renamed from: a */
    public void m1875a(C0824b c0824b) {
        synchronized (this.f5408d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f5409e);
            arrayList.remove(c0824b);
            this.f5409e = arrayList;
        }
    }

    /* renamed from: a */
    public void m1869a(String str, boolean z, boolean z2) {
        GameEngine.PrintLog("loading mod custom units at:" + str);
        String[] m2444g = C0750a.m2444g(str);
        if (m2444g == null) {
            GameEngine.m1145b("getAllModList: ERROR");
            GameEngine.m1145b("getAllModList: Failed to load:" + str);
            return;
        }
        for (String str2 : m2444g) {
            String str3 = str + "/" + str2;
            if (C0750a.m2445f(str3) || str2.endsWith(".ini")) {
                String m2270e = CommonUtils.m2270e(str2);
                String str4 = str2;
                if (str4.contains("/")) {
                    str4 = str4.substring(str2.lastIndexOf("/") + 1);
                }
                m1870a(str4, str2, str3, m2270e, z, false, z2, 0);
            }
        }
    }

    /* renamed from: i */
    public ArrayList m1852i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1828m()) {
                arrayList.addAll(c0824b.m1824q());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public ArrayList m1851j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1828m()) {
                arrayList.add(c0824b);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public ArrayList m1850k() {
        Iterator it = this.f5409e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5421l = false;
            if (c0824b.f5422m) {
                c0824b.f5421l = true;
            }
        }
        C1058a m786a = C1058a.m786a();
        if (m786a != null) {
            m786a.m771l();
        } else {
            GameEngine.PrintLog("getAllModList: SteamEngine==null");
        }
        String m5382m = C0348af.m5382m();
        if (!C0750a.m2445f(m5382m)) {
            GameEngine.PrintLog("Modded Custom '" + m5382m + "' directory not found");
        } else {
            m1869a(m5382m, true, false);
        }
        String m5384k = C0348af.m5384k();
        if (!C0750a.m2445f(m5384k)) {
            GameEngine.PrintLog("Modded Custom '" + m5384k + "' directory not found");
        } else {
            m1869a(m5384k, false, true);
        }
        String m5383l = C0348af.m5383l();
        if (!C0750a.m2445f(m5383l)) {
            GameEngine.PrintLog("Modded Custom '" + m5383l + "' directory not found");
        } else {
            m1869a(m5383l, true, true);
        }
        Iterator it2 = this.f5409e.iterator();
        while (it2.hasNext()) {
            C0824b c0824b2 = (C0824b) it2.next();
            if (!c0824b2.f5421l) {
                GameEngine.PrintLog("Removing mod no longer found on system: " + c0824b2.m1846a());
                m1875a(c0824b2);
            }
        }
        GameEngine.PrintLog("========= Mods ===========");
        GameEngine.PrintLog("Number of mods:" + this.f5409e.size());
        Iterator it3 = this.f5409e.iterator();
        while (it3.hasNext()) {
            GameEngine.PrintLog("Mod: '" + ((C0824b) it3.next()).m1846a());
        }
        GameEngine.PrintLog("================================");
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6109bQ.lastModCount == -1 || gameEngine.f6109bQ.modSettingsVersion < 1) {
            GameEngine.PrintLog("Disabling all new mods for first/new load");
            Iterator it4 = this.f5409e.iterator();
            while (it4.hasNext()) {
                ((C0824b) it4.next()).f5415f = true;
            }
            m1859e();
            gameEngine.f6109bQ.save();
        } else if (this.f5409e.size() > gameEngine.f6109bQ.lastModCount + 4) {
            GameEngine.PrintLog("Too many new mods found, not enabling new mods");
            GameEngine.PrintLog("Number of mods:" + this.f5409e.size() + " vs " + gameEngine.f6109bQ.lastModCount);
            Iterator it5 = this.f5409e.iterator();
            while (it5.hasNext()) {
                C0824b c0824b3 = (C0824b) it5.next();
                if (!c0824b3.f5418i) {
                    c0824b3.f5415f = true;
                }
            }
            m1859e();
            gameEngine.f6109bQ.save();
        }
        gameEngine.f6109bQ.lastModCount = this.f5409e.size();
        return this.f5409e;
    }

    /* renamed from: l */
    public void m1849l() {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            gameEngine.f6230br = true;
            gameEngine.m1129e();
            m1867a(false, false);
            gameEngine.m1097w();
        } finally {
            gameEngine.f6230br = false;
        }
    }

    /* renamed from: a */
    public void m1867a(boolean z, boolean z2) {
        GameEngine.getInstance();
        C1075ae.m644b();
        if (!z2) {
            Iterator it = this.f5409e.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                c0824b.f5452R = null;
                c0824b.f5456V.clear();
                c0824b.f5453S = null;
                c0824b.f5455U.clear();
                c0824b.f5438C = false;
                c0824b.f5439D = false;
                c0824b.f5440E = 0;
                c0824b.f5441F = 0;
                c0824b.f5442G = 0L;
                c0824b.f5443H = 0L;
                c0824b.f5444I = 0;
                c0824b.f5445J = 0;
            }
        }
        m1850k();
        ArrayList arrayList = new ArrayList(C0453l.f3185d);
        if (!z2) {
            C0348af.m5387h();
        } else {
            C0348af.m5402b();
        }
        if (z) {
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0453l c0453l = (C0453l) it2.next();
                if (c0453l.f2917I != null && !c0453l.f2917I.f5415f && c0453l.f2917I.f5452R != null && C0453l.m4764a(c0453l) == null) {
                    GameEngine.PrintLog("Was missing: " + c0453l.f2920L);
                    C0453l.f3185d.add(c0453l);
                    i++;
                }
            }
            if (i > 0) {
                C0348af.m5390e();
            }
        }
        C0453l.m4779A();
        Team.m6408M();
        C0797f.m2069J();
    }

    /* renamed from: m */
    public void m1848m() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6273dG != null) {
            gameEngine.f6273dG.mo787d();
        } else {
            GameEngine.PrintLog("No active callbacks");
        }
    }

    /* renamed from: a */
    public String[] m1866a(String[] strArr, String str) {
        String[] m2460a;
        GameEngine.PrintLog("addExtraMapsForPath: " + str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        if (GameEngine.m1159as() && "/SD/rusted_warfare_maps".equals(str) && (m2460a = C0750a.m2460a("/SD/rustedWarfare/maps", true)) != null) {
            int length = m2460a.length;
            for (int i = 0; i < length; i++) {
                arrayList.add("NEW_PATH|maps2/" + m2460a[i]);
            }
        }
        Iterator it = m1856f(str).iterator();
        while (it.hasNext()) {
            C0825c c0825c = (C0825c) it.next();
            arrayList.add("MOD|" + c0825c.f5461c.f5414e + "/" + c0825c.f5460b);
        }
        if (strArr == null && arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    public ArrayList m1856f(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5410f.iterator();
        while (it.hasNext()) {
            C0825c c0825c = (C0825c) it.next();
            boolean z = false;
            if (str.startsWith("mod/") && str.startsWith("mod/" + c0825c.f5461c.f5414e)) {
                z = true;
            }
            if (!c0825c.f5461c.f5415f && str.startsWith("/SD/rusted_warfare_maps")) {
                z = true;
            }
            if (z) {
                GameEngine.PrintLog("Adding extra map:" + c0825c.f5459a);
                arrayList.add(c0825c);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public void m1847n() {
        this.f5410f.clear();
    }

    /* renamed from: a */
    public void m1872a(String str, C0824b c0824b) {
        C0825c c0825c = new C0825c(this);
        c0825c.f5459a = str;
        c0825c.f5461c = c0824b;
        if (c0824b.f5426q == null) {
            GameEngine.m1193a("Skipping:" + str + " as mod sourceFolder is null");
            return;
        }
        String str2 = str;
        String str3 = c0824b.f5426q;
        if (str2.startsWith(str3)) {
            str2 = str2.substring(str3.length());
        } else {
            String m2437n = C0750a.m2437n(str2);
            if (m2437n.startsWith(str3)) {
                str2 = m2437n.substring(str3.length());
                GameEngine.PrintLog("Mod path:" + c0824b.f5426q + " in map path without tag:" + str2);
            } else {
                GameEngine.m1193a("Mod path:" + c0824b.f5426q + " not in map path:" + str2);
            }
        }
        c0825c.f5460b = str2;
        c0824b.f5436A = true;
        c0824b.f5441F++;
        this.f5410f.add(c0825c);
    }

    /* renamed from: g */
    public C0824b m1854g(String str) {
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                for (int length = split.length - 2; length >= 0; length--) {
                    String str2 = split[length];
                    if (str2.startsWith("MOD|")) {
                        String substring = str2.substring("MOD|".length());
                        C0824b m1862c = m1862c(substring);
                        if (m1862c == null) {
                            GameEngine.PrintLog("getLinkedModForFile: Failed to find mod with hash:" + substring);
                            return null;
                        }
                        return m1862c;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
