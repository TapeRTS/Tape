package com.corrodinggames.rts.gameFramework.p040h;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p036e.C0756g;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/b.class */
public class C0824b implements Comparable {

    /* renamed from: a */
    public int f5411a;

    /* renamed from: c */
    public String f5412c;

    /* renamed from: d */
    public String f5413d;

    /* renamed from: e */
    public String f5414e;

    /* renamed from: f */
    public boolean f5415f;

    /* renamed from: g */
    public boolean f5416g;

    /* renamed from: h */
    public boolean f5417h;

    /* renamed from: i */
    public boolean f5418i;

    /* renamed from: j */
    public boolean f5419j;

    /* renamed from: k */
    public long f5420k;

    /* renamed from: l */
    boolean f5421l;

    /* renamed from: m */
    public boolean f5422m;

    /* renamed from: n */
    public String f5423n;

    /* renamed from: o */
    public String f5424o;

    /* renamed from: p */
    public String f5425p;

    /* renamed from: q */
    public String f5426q;

    /* renamed from: r */
    public boolean f5427r;

    /* renamed from: s */
    public String f5428s;

    /* renamed from: t */
    public String f5429t;

    /* renamed from: u */
    public String f5430u;

    /* renamed from: v */
    public String f5431v;

    /* renamed from: w */
    public int f5432w;

    /* renamed from: x */
    public int f5433x;

    /* renamed from: y */
    public boolean f5434y;

    /* renamed from: z */
    public boolean f5435z;

    /* renamed from: A */
    public boolean f5436A = false;

    /* renamed from: B */
    public boolean f5437B = true;

    /* renamed from: C */
    public boolean f5438C;

    /* renamed from: D */
    public boolean f5439D;

    /* renamed from: E */
    public int f5440E;

    /* renamed from: F */
    public int f5441F;

    /* renamed from: G */
    public long f5442G;

    /* renamed from: H */
    public long f5443H;

    /* renamed from: I */
    public int f5444I;

    /* renamed from: J */
    public int f5445J;

    /* renamed from: L */
    public int f5446L;

    /* renamed from: M */
    public String f5447M;

    /* renamed from: N */
    public boolean f5448N;

    /* renamed from: O */
    public boolean f5449O;

    /* renamed from: P */
    public int f5450P;

    /* renamed from: Q */
    ArrayList f5451Q;

    /* renamed from: R */
    public String f5452R;

    /* renamed from: S */
    public String f5453S;

    /* renamed from: T */
    public String f5454T;

    /* renamed from: U */
    public ArrayList f5455U;

    /* renamed from: V */
    public ArrayList f5456V;

    /* renamed from: b */
    public static int f5457b = 1;

    /* renamed from: K */
    public static int f5458K = 1;

    public C0824b() {
        int i = f5458K;
        f5458K = i + 1;
        this.f5446L = i;
        this.f5451Q = new ArrayList();
        this.f5455U = new ArrayList();
        this.f5456V = new ArrayList();
        this.f5411a = f5457b;
        f5457b++;
    }

    /* renamed from: a */
    public String m1846a() {
        if (this.f5428s != null) {
            return this.f5428s;
        }
        if (this.f5429t != null) {
            return this.f5429t;
        }
        return this.f5412c;
    }

    /* renamed from: b */
    public String m1841b() {
        return CommonUtils.m2334a(m1846a(), 25);
    }

    /* renamed from: c */
    public String m1839c() {
        return CommonUtils.m2334a(m1846a(), 40);
    }

    /* renamed from: d */
    public int m1837d() {
        return this.f5446L;
    }

    /* renamed from: e */
    public String m1836e() {
        return m1835f();
    }

    /* renamed from: f */
    public String m1835f() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5430u != null) {
            str = str + this.f5430u;
        }
        String str2 = "RAM:" + m1822s();
        if (this.f5423n != null) {
            str2 = str2 + " Storage: slow external unpacked";
        }
        if (GameEngine.m1159as() && this.f5426q != null && C0750a.m2463a(this.f5426q) && !this.f5419j) {
            str2 = str2 + " Warning: slow external storage";
        }
        return str + "\n (" + str2 + ")";
    }

    /* renamed from: g */
    public String m1834g() {
        if (this.f5434y) {
            return this.f5426q;
        }
        return C0750a.m2447e(this.f5426q);
    }

    /* renamed from: h */
    public String m1833h() {
        if (this.f5434y) {
            return this.f5425p;
        }
        return C0750a.m2447e(this.f5425p);
    }

    /* renamed from: i */
    public String m1832i() {
        return new File(m1834g()).getAbsolutePath();
    }

    /* renamed from: j */
    public String m1831j() {
        return this.f5426q;
    }

    /* renamed from: k */
    public String m1830k() {
        return new File(m1834g()).getCanonicalPath();
    }

    /* renamed from: l */
    public String m1829l() {
        String str = this.f5453S;
        if (this.f5454T != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + this.f5454T;
        }
        if (str == null && this.f5455U.size() > 0) {
            str = VariableScope.nullOrMissingString;
            int i = 0;
            int i2 = 0;
            Iterator it = this.f5455U.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i2 <= 2) {
                    if (str == null) {
                        str = str2;
                    } else {
                        str = str + "\n" + str2;
                    }
                } else {
                    i++;
                }
                i2++;
            }
            if (i > 0) {
                str = str + "\n" + i + " more warnings...";
            }
        }
        if ((!this.f5438C || str != null) && !this.f5439D && str == null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "Not yet loaded, reload needed";
        }
        return str;
    }

    /* renamed from: m */
    public boolean m1828m() {
        return !this.f5415f && this.f5452R == null;
    }

    /* renamed from: a */
    public void m1843a(String str) {
        GameEngine.m1145b("Adding error for mod: " + m1841b() + ": " + str);
        if (this.f5452R == null) {
            if (!this.f5415f) {
                GameEngine.getInstance().m1116i(str);
            }
            this.f5452R = str;
        }
        this.f5456V.add(str);
    }

    /* renamed from: b */
    public void m1840b(String str) {
        if (this.f5455U.contains(str)) {
            return;
        }
        this.f5455U.add(str);
    }

    /* renamed from: a */
    public String m1842a(String str, int i) {
        String[] m2444g;
        String m1842a;
        if (i > 4 || (m2444g = C0750a.m2444g(str)) == null) {
            return null;
        }
        for (String str2 : m2444g) {
            if (str2.equalsIgnoreCase("mod-info.txt")) {
                return str + "/mod-info.txt";
            }
        }
        if (m2444g.length > 5) {
            return null;
        }
        int length = m2444g.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = str + "/" + m2444g[i2];
            if (C0750a.m2445f(str3) && (m1842a = m1842a(str3, i + 1)) != null) {
                return m1842a;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m1827n() {
        if (GameEngine.getInstance().m1134d()) {
            GameEngine.PrintLog("SAFE MODE: skipping setSourceFolder");
        } else if (!C0756g.m2375f("mods-info", this.f5426q + "/mod-info.txt")) {
            String str = this.f5426q;
            if (str == null) {
                GameEngine.PrintLog("setSourceFolder: sourceFolder==null");
                return;
            }
            String[] m2377d = C0756g.m2377d("mods-dir-search", str);
            if (m2377d != null && m2377d.length == 1) {
                String str2 = str + "/" + m2377d[0];
                String str3 = str2 + "/mod-info.txt";
                if (C0750a.m2445f(str2) && C0750a.m2443h(str3)) {
                    GameEngine.PrintLog("Changing mod sourceFolder to:" + str2);
                    this.f5426q = str2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.io.InputStream] */
    /* renamed from: o */
    public C1072ab m1826o() {
        C1098j m2441j;
        String m1842a;
        if (this.f5426q == null) {
            GameEngine.PrintLog("No source yet for mod: " + this.f5412c);
            return null;
        }
        String str = this.f5426q + "/mod-info.txt";
        try {
            if (this.f5419j) {
                m2441j = C0756g.m2376e("mods-info", str);
            } else {
                m2441j = C0750a.m2441j(str);
            }
            if (m2441j == null && (m1842a = m1842a(this.f5426q, 1)) != null) {
                C1098j m2441j2 = C0750a.m2441j(str);
                if (m2441j2 != null) {
                    GameEngine.m1193a("mod-info.txt cache seems to be invalid for: " + str);
                    C0756g.m2378c("mods-info", str);
                    m2441j = m2441j2;
                } else {
                    m1843a("No mod info at " + C0750a.m2449d(str) + " but found one nested at: " + C0750a.m2449d(m1842a) + " (Hint: This mod might have been extracted with an extra folder)");
                }
            }
            if (m2441j == null) {
                GameEngine.PrintLog("No mod info for: " + this.f5412c + " at " + str);
                return null;
            }
            try {
                return new C1072ab(m2441j, str);
            } catch (IOException e) {
                GameEngine.PrintLog("Error loading mod info for: " + this.f5412c + " at " + str);
                e.printStackTrace();
                m1840b("Error loading mod-info.txt: " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            GameEngine.PrintLog("Error loading mod info for: " + this.f5412c + " at " + str);
            e2.printStackTrace();
            m1840b("Error loading mod-info.txt: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    public String m1825p() {
        String m1838c = m1838c("thumbnail");
        if (m1838c != null) {
            return m1832i() + "/" + m1838c;
        }
        return null;
    }

    /* renamed from: q */
    public ArrayList m1824q() {
        return this.f5451Q;
    }

    /* renamed from: c */
    public String m1838c(String str) {
        C1072ab m1826o = m1826o();
        if (m1826o == null) {
            return null;
        }
        return m1826o.m681b("mod", str, (String) null);
    }

    /* renamed from: r */
    public void m1823r() {
        if (GameEngine.getInstance().m1134d()) {
            GameEngine.PrintLog("SAFE MODE: refreshData: Skipping mod read");
            this.f5430u = "<< SAFE MODE ACTIVE: MOD DATA SKIPPED. RESTART IN NORMAL MODE. >>";
            return;
        }
        C1072ab m1826o = m1826o();
        if (m1826o == null) {
            return;
        }
        this.f5428s = m1826o.m681b("mod", "title", (String) null);
        this.f5430u = m1826o.m681b("mod", "description", (String) null);
        if (this.f5430u != null && this.f5430u.contains("\\n")) {
            this.f5430u = this.f5430u.replace("\\n", "\n");
        }
        this.f5431v = m1826o.m681b("mod", "minVersion", (String) null);
        if (this.f5431v != null && !this.f5431v.trim().equals(VariableScope.nullOrMissingString)) {
            try {
                C0823a.m1874a(this.f5431v);
            } catch (C0412bm e) {
                m1843a(e.getMessage());
            }
        }
        this.f5447M = m1826o.m681b("music", "sourceFolder", (String) null);
        this.f5448N = m1826o.m700a("music", "whenUsingUnitsFromThisMod_playExclusively", (Boolean) false).booleanValue();
        this.f5449O = m1826o.m700a("music", "addToNormalPlaylist", (Boolean) false).booleanValue();
        if (this.f5447M != null && m1828m()) {
            GameEngine.PrintLog("Loading music for: " + m1846a());
            String m2300b = CommonUtils.m2300b(this.f5426q, this.f5447M);
            String[] m2377d = C0756g.m2377d("mods-dir-music", m2300b);
            if (m2377d == null) {
                m1840b("Could not read target music folder: " + C0750a.m2447e(m2300b));
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : m2377d) {
                    if (str.toLowerCase().endsWith(".ogg")) {
                        String m2300b2 = CommonUtils.m2300b(m2300b, str);
                        if (!this.f5451Q.contains(m2300b2)) {
                            GameEngine.PrintLog("Found music track: " + str);
                        }
                        arrayList.add(m2300b2);
                    }
                }
                this.f5451Q = arrayList;
                if (this.f5451Q.size() == 0) {
                    m1840b("Could not find any .ogg files in music folder: " + C0750a.m2447e(m2300b));
                }
            }
        }
        this.f5427r = true;
        String m1818w = m1818w();
        File file = new File(m1818w);
        if (file.exists() && !file.isDirectory()) {
            C1072ab c1072ab = null;
            try {
                c1072ab = new C1072ab(m1818w);
            } catch (IOException e2) {
                e2.printStackTrace();
                m1840b("IO error reading: " + C0750a.m2447e(m1818w));
            }
            if (c1072ab != null) {
                this.f5420k = c1072ab.m705a("steam", "id", 0L);
            }
        }
    }

    /* renamed from: w */
    private String m1818w() {
        return m1834g() + "/steam.dat";
    }

    /* renamed from: a */
    public boolean m1845a(long j) {
        this.f5420k = j;
        String m1818w = m1818w();
        try {
            PrintWriter printWriter = new PrintWriter(m1818w);
            printWriter.println("[steam]");
            printWriter.println("id: " + j);
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            GameEngine.getInstance().m1116i("IO error: Failed to save workshop id for mod at: " + m1818w);
            return false;
        }
    }

    /* renamed from: s */
    public String m1822s() {
        return VariableScope.nullOrMissingString + String.format("%.2f", Float.valueOf((float) (((this.f5442G + this.f5443H) / 1000.0d) / 1000.0d))) + " mb" + (this.f5438C ? " - disabled" : VariableScope.nullOrMissingString);
    }

    /* renamed from: t */
    public void m1821t() {
        GameEngine.PrintLog("Mod: '" + m1846a() + "' - Memory use:" + m1822s() + " " + (m1828m() ? VariableScope.nullOrMissingString : " (disabled)"));
    }

    /* renamed from: u */
    public boolean m1820u() {
        GameEngine.PrintLog("Trying to delete mod: '" + m1846a() + "'");
        String m1833h = m1833h();
        GameEngine.PrintLog("sourceFolder: '" + m1833h + "'");
        if (!m1819v()) {
            GameEngine.PrintLog("Mod: '" + m1846a() + "' - Cannot be deleted");
            return false;
        }
        File file = new File(m1833h);
        if (!C0750a.m2443h(file.getAbsolutePath())) {
            GameEngine.PrintLog("Mod: '" + m1846a() + "' - cannot delete: Not a file");
            return false;
        }
        boolean m2457b = C0750a.m2457b(file);
        GameEngine.PrintLog("Delete result: " + m2457b);
        return m2457b;
    }

    /* renamed from: v */
    public boolean m1819v() {
        if (this.f5435z) {
            return false;
        }
        if (GameEngine.f6204aZ && this.f5419j) {
            return true;
        }
        if (GameEngine.m1159as() && this.f5419j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C0824b c0824b) {
        if (c0824b == null) {
            return 0;
        }
        int i = this.f5433x;
        int i2 = c0824b.f5433x;
        if (i != i2) {
            return i - i2;
        }
        String m1846a = m1846a();
        String m1846a2 = c0824b.m1846a();
        if (m1846a == null) {
            m1846a = VariableScope.nullOrMissingString;
        }
        if (m1846a2 == null) {
            m1846a2 = VariableScope.nullOrMissingString;
        }
        return m1846a.compareTo(m1846a2);
    }
}
