package com.corrodinggames.rts.gameFramework.p036e;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;

/* renamed from: com.corrodinggames.rts.gameFramework.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/e.class */
public class C0754e extends C0752c {

    /* renamed from: g */
    C0752c f4876g;

    /* renamed from: h */
    C0752c f4877h;

    /* renamed from: i */
    String f4878i;

    /* renamed from: j */
    String f4879j;

    public C0754e(C0752c c0752c, String str, C0752c c0752c2, String str2) {
        this.f4876g = c0752c;
        this.f4878i = str;
        this.f4877h = c0752c2;
        this.f4879j = str2;
    }

    /* renamed from: a */
    public String m2406a() {
        String m2432a = this.f4876g.m2432a();
        String m2432a2 = this.f4877h.m2432a();
        if (m2432a != null) {
            return m2432a;
        }
        return m2432a2;
    }

    /* renamed from: a */
    public void m2405a(String str) {
        this.f4876g.m2429a(str);
        this.f4877h.m2429a(str);
    }

    /* renamed from: a */
    public String m2404a(String str, String str2) {
        return m2389t(str).m2428a(str, str2);
    }

    /* renamed from: b */
    public boolean m2402b(String str) {
        return m2389t(str).m2425b(m2391r(str));
    }

    /* renamed from: c */
    public boolean m2401c(String str) {
        return m2389t(str).m2422c(m2391r(str));
    }

    /* renamed from: d */
    public String m2400d(String str) {
        return m2389t(str).m2421d(m2391r(str));
    }

    /* renamed from: f */
    public String m2398f(String str) {
        return m2389t(str).m2419f(m2391r(str));
    }

    /* renamed from: e */
    public String mo2407e(String str) {
        return m2389t(str).mo2407e(m2391r(str));
    }

    /* renamed from: g */
    public boolean m2397g(String str) {
        C0752c m2390s = m2390s(str);
        String m2391r = m2391r(str);
        if (m2390s != null) {
            return m2390s.m2418g(m2391r(m2391r));
        }
        boolean m2418g = this.f4876g.m2418g(m2391r(m2391r));
        if (this.f4877h.m2418g(m2391r(m2391r))) {
            m2418g = true;
        }
        return m2418g;
    }

    /* renamed from: h */
    public boolean m2396h(String str) {
        return m2389t(str).m2417h(m2391r(str));
    }

    /* renamed from: r */
    private String m2391r(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf(this.f4878i) != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + this.f4878i.length());
            if (str2.contains(this.f4878i) || str2.contains(this.f4879j)) {
                GameEngine.PrintLog("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf(this.f4879j) != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + this.f4879j.length());
            if (str3.contains(this.f4878i) || str3.contains(this.f4879j)) {
                GameEngine.PrintLog("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: s */
    private C0752c m2390s(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(this.f4878i)) {
            return this.f4876g;
        }
        if (str.contains(this.f4879j)) {
            return this.f4877h;
        }
        return null;
    }

    /* renamed from: t */
    private C0752c m2389t(String str) {
        C0752c m2390s = m2390s(str);
        if (m2390s != null) {
            return m2390s;
        }
        return this.f4876g;
    }

    /* renamed from: a */
    public String[] mo2388a(String str, boolean z) {
        C0752c m2390s = m2390s(str);
        String m2391r = m2391r(str);
        if (m2390s != null) {
            return m2390s.mo2388a(m2391r, z);
        }
        String[] mo2388a = this.f4876g.mo2388a(m2391r, z);
        String[] mo2388a2 = this.f4877h.mo2388a(m2391r, z);
        if (mo2388a == null && mo2388a2 == null) {
            return null;
        }
        if (mo2388a == null) {
            mo2388a = new String[0];
        }
        if (mo2388a2 == null) {
            mo2388a2 = new String[0];
        }
        String[] strArr = new String[mo2388a.length + mo2388a2.length];
        for (int i = 0; i < mo2388a.length; i++) {
            strArr[i] = this.f4878i + mo2388a[i];
        }
        for (int i2 = 0; i2 < mo2388a2.length; i2++) {
            strArr[i2 + mo2388a.length] = this.f4879j + mo2388a2[i2];
        }
        return strArr;
    }

    /* renamed from: j */
    public C1098j m2395j(String str) {
        return this.f4876g.m2415j(str);
    }

    /* renamed from: k */
    public C1098j m2394k(String str) {
        return m2389t(str).m2414k(m2391r(str));
    }

    /* renamed from: b */
    public String mo2387b() {
        return this.f4876g.mo2387b();
    }

    /* renamed from: a */
    public File m2403a(String str, String str2, boolean z) {
        return m2389t(str).m2427a(m2391r(str), str2, z);
    }

    /* renamed from: n */
    public String m2393n(String str) {
        return m2389t(str).m2411n(str);
    }

    /* renamed from: d */
    public String mo2386d() {
        String mo2386d = this.f4876g.mo2386d();
        if (this.f4877h.mo2386d() != null) {
            mo2386d = mo2386d + " and " + this.f4877h.mo2386d();
        }
        return mo2386d;
    }

    /* renamed from: e */
    public boolean mo2385e() {
        return this.f4876g.mo2385e() || this.f4877h.mo2385e();
    }

    /* renamed from: p */
    public String m2392p(String str) {
        if (str.startsWith("/") && this.f4878i.endsWith("/")) {
            return "/" + this.f4878i + str.substring(1);
        }
        return this.f4878i + str;
    }
}
