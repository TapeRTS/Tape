package com.corrodinggames.rts.gameFramework.p035f;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/b.class */
public class C0657b {

    /* renamed from: a */
    public String f4611a;

    /* renamed from: b */
    public String f4612b;

    /* renamed from: c */
    public boolean f4613c;

    /* renamed from: d */
    public long f4614d;

    /* renamed from: e */
    boolean f4615e;

    /* renamed from: f */
    public String f4616f;

    /* renamed from: g */
    public boolean f4617g;

    /* renamed from: h */
    public String f4618h;

    /* renamed from: i */
    public String f4619i;

    /* renamed from: j */
    public boolean f4620j;

    /* renamed from: k */
    public boolean f4621k;

    /* renamed from: n */
    public boolean f4624n;

    /* renamed from: o */
    public boolean f4625o;

    /* renamed from: p */
    public int f4626p;

    /* renamed from: q */
    public int f4627q;

    /* renamed from: r */
    public int f4628r;

    /* renamed from: s */
    public int f4629s;

    /* renamed from: t */
    public int f4630t;

    /* renamed from: u */
    public String f4631u;

    /* renamed from: v */
    public boolean f4632v;

    /* renamed from: w */
    public boolean f4633w;

    /* renamed from: x */
    public int f4634x;

    /* renamed from: z */
    public String f4636z;

    /* renamed from: A */
    public String f4637A;

    /* renamed from: l */
    public boolean f4622l = false;

    /* renamed from: m */
    public boolean f4623m = true;

    /* renamed from: y */
    ArrayList f4635y = new ArrayList();

    /* renamed from: a */
    public String m1388a() {
        if (this.f4618h != null) {
            return this.f4618h;
        }
        return this.f4611a;
    }

    /* renamed from: b */
    public String m1384b() {
        return C0654f.m1488a(m1388a(), 25);
    }

    /* renamed from: c */
    public String m1382c() {
        return C0654f.m1488a(m1388a(), 40);
    }

    /* renamed from: d */
    public String m1380d() {
        return m1379e();
    }

    /* renamed from: e */
    public String m1379e() {
        String str = "";
        if (this.f4619i != null) {
            str = str + this.f4619i;
        }
        return str + "\n (RAM:" + m1367q() + ")";
    }

    /* renamed from: f */
    public String m1378f() {
        if (this.f4620j) {
            return this.f4616f;
        }
        return C0596a.m1889c(this.f4616f);
    }

    /* renamed from: g */
    public String m1377g() {
        return new File(m1378f()).getAbsolutePath();
    }

    /* renamed from: h */
    public String m1376h() {
        return this.f4616f;
    }

    /* renamed from: i */
    public String m1375i() {
        return new File(m1378f()).getCanonicalPath();
    }

    /* renamed from: j */
    public String m1374j() {
        String str = this.f4637A;
        if ((!this.f4624n || str != null) && !this.f4625o && str == null) {
            if (str == null) {
                str = "";
            }
            str = str + "Not yet loaded, refresh needed";
        }
        return str;
    }

    /* renamed from: k */
    public boolean m1373k() {
        return !this.f4613c && this.f4636z == null;
    }

    /* renamed from: a */
    public void m1386a(String str) {
        if (this.f4636z == null) {
            if (!this.f4613c) {
                AbstractC0789l.m638u().m657h(str);
            }
            this.f4636z = str;
        }
    }

    /* renamed from: b */
    public void m1383b(String str) {
        if (this.f4637A == null) {
            this.f4637A = str;
        }
    }

    /* renamed from: a */
    public String m1385a(String str, int i) {
        String[] e;
        String a;
        if (i > 4 || (e = C0596a.m1887e(str)) == null) {
            return null;
        }
        for (String str2 : e) {
            if (str2.equalsIgnoreCase("mod-info.txt")) {
                return str + "/mod-info.txt";
            }
        }
        if (e.length > 5) {
            return null;
        }
        int length = e.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = str + "/" + e[i2];
            if (C0596a.m1888d(str3) && (a = m1385a(str3, i + 1)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: l */
    public void m1372l() {
        if (!C0596a.m1886f(this.f4616f + "/mod-info.txt")) {
            String str = this.f4616f;
            if (str == null) {
                AbstractC0789l.m670d("setSourceFolder: sourceFolder==null");
                return;
            }
            String[] e = C0596a.m1887e(str);
            if (e != null && e.length == 1) {
                String str2 = str + "/" + e[0];
                String str3 = str2 + "/mod-info.txt";
                if (C0596a.m1888d(str2) && C0596a.m1886f(str3)) {
                    AbstractC0789l.m670d("Changing mod sourceFolder to:" + str2);
                    this.f4616f = str2;
                }
            }
        }
    }

    /* renamed from: m */
    public C0809ab m1371m() {
        String a;
        if (this.f4616f == null) {
            AbstractC0789l.m670d("No source yet for mod: " + this.f4611a);
            return null;
        }
        String str = this.f4616f + "/mod-info.txt";
        try {
            C0832j h = C0596a.m1884h(str);
            if (h == null && (a = m1385a(this.f4616f, 1)) != null) {
                m1386a("No mod info at " + C0596a.m1889c(str) + " but found one nested at: " + C0596a.m1889c(a) + " (Hint: This mod might have been extracted with an extra folder)");
            }
            if (h == null) {
                AbstractC0789l.m670d("No mod info for: " + this.f4611a + " at " + str);
                return null;
            }
            try {
                return new C0809ab(h, str);
            } catch (IOException e) {
                AbstractC0789l.m670d("Error loading mod info for: " + this.f4611a + " at " + str);
                e.printStackTrace();
                m1383b("Error loading mod-info.txt: " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            AbstractC0789l.m670d("Error loading mod info for: " + this.f4611a + " at " + str);
            e2.printStackTrace();
            m1383b("Error loading mod-info.txt: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: n */
    public String m1370n() {
        String c = m1381c("thumbnail");
        if (c != null) {
            return m1377g() + "/" + c;
        }
        return null;
    }

    /* renamed from: o */
    public ArrayList m1369o() {
        return this.f4635y;
    }

    /* renamed from: c */
    public String m1381c(String str) {
        C0809ab m = m1371m();
        if (m == null) {
            return null;
        }
        return m.m579b("mod", str, (String) null);
    }

    /* renamed from: p */
    public void m1368p() {
        C0809ab m = m1371m();
        if (m != null) {
            this.f4618h = m.m579b("mod", "title", (String) null);
            this.f4619i = m.m579b("mod", "description", (String) null);
            if (this.f4619i != null && this.f4619i.contains("\\n")) {
                this.f4619i = this.f4619i.replace("\\n", "\n");
            }
            this.f4631u = m.m579b("music", "sourceFolder", (String) null);
            this.f4632v = m.m594a("music", "whenUsingUnitsFromThisMod_playExclusively", (Boolean) false).booleanValue();
            this.f4633w = m.m594a("music", "addToNormalPlaylist", (Boolean) false).booleanValue();
            if (this.f4631u != null) {
                AbstractC0789l.m670d("Loading music for: " + m1388a());
                String b = C0654f.m1462b(this.f4616f, this.f4631u);
                String[] e = C0596a.m1887e(b);
                if (e == null) {
                    m1383b("Could not read target music folder: " + C0596a.m1889c(b));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str : e) {
                        if (str.toLowerCase().endsWith(".ogg")) {
                            String b2 = C0654f.m1462b(b, str);
                            if (!this.f4635y.contains(b2)) {
                                AbstractC0789l.m670d("Found music track: " + str);
                            }
                            arrayList.add(b2);
                        }
                    }
                    this.f4635y = arrayList;
                    if (this.f4635y.size() == 0) {
                        m1383b("Could not find any .ogg files in music folder: " + C0596a.m1889c(b));
                    }
                }
            }
            this.f4617g = true;
            String s = m1365s();
            File file = new File(s);
            if (file.exists() && !file.isDirectory()) {
                try {
                    this.f4614d = new C0809ab(s).m599a("steam", "id", 0L);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    /* renamed from: s */
    private String m1365s() {
        return m1378f() + "/steam.dat";
    }

    /* renamed from: a */
    public boolean m1387a(long j) {
        this.f4614d = j;
        String s = m1365s();
        try {
            PrintWriter printWriter = new PrintWriter(s);
            printWriter.println("[steam]");
            printWriter.println("id: " + j);
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AbstractC0789l.m638u().m657h("IO error: Failed to save workshop id for mod at: " + s);
            return false;
        }
    }

    /* renamed from: q */
    public String m1367q() {
        return "" + String.format("%.2f", Float.valueOf((float) (((this.f4628r + this.f4629s) / 1000.0d) / 1000.0d))) + " mb" + (this.f4624n ? " - disabled" : "");
    }

    /* renamed from: r */
    public void m1366r() {
        AbstractC0789l.m670d("Mod: '" + m1388a() + "' - Memory use:" + m1367q() + " " + (m1373k() ? "" : " (disabled)"));
    }
}
