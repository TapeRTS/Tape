package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/af.class */
public class C0813af {

    /* renamed from: a */
    String f5731a = "";

    /* renamed from: b */
    String f5732b;

    /* renamed from: c */
    ZipFile f5733c;

    /* renamed from: d */
    String[] f5734d;

    public C0813af(String str, String str2) {
        this.f5732b = str;
        this.f5733c = new ZipFile(str2);
        try {
            m538a();
        } catch (IllegalArgumentException e) {
            C0812ae.m548a("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset forName = Charset.forName("ISO-8859-1");
            Constructor constructor = null;
            try {
                constructor = ZipFile.class.getDeclaredConstructor(String.class, Charset.class);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (SecurityException e3) {
                e3.printStackTrace();
            }
            if (constructor == null) {
                throw new IllegalArgumentException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1", e);
            }
            try {
                this.f5733c = (ZipFile) constructor.newInstance(str2, forName);
                m538a();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (IllegalArgumentException e5) {
                throw new RuntimeException(e5);
            } catch (InstantiationException e6) {
                throw new RuntimeException(e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: a */
    public void m538a() {
        double a;
        long a2 = C0586bj.m1919a();
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> entries = this.f5733c.entries();
        while (entries.hasMoreElements()) {
            String name = ((ZipEntry) entries.nextElement()).getName();
            if (name == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add(name);
        }
        this.f5734d = (String[]) arrayList.toArray(new String[0]);
        this.f5731a = "";
        String[] e = m533e("");
        if (e.length == 1 && m534d(e[0])) {
            this.f5731a = e[0] + "/";
            for (int i = 0; i < this.f5734d.length; i++) {
                if (this.f5734d[i].startsWith(this.f5731a)) {
                    this.f5734d[i] = this.f5734d[i].substring(this.f5731a.length());
                }
            }
        }
        if (C0586bj.m1917a(a2) > 3.0d) {
            AbstractC0789l.m670d("zip: buildCache for: " + this.f5732b + ", took:" + C0586bj.m1918a(a));
        }
    }

    /* renamed from: a */
    public void m537a(String str) {
        AbstractC0789l.m670d("Zip: " + str);
    }

    /* renamed from: b */
    public boolean m536b(String str) {
        for (String str2 : this.f5734d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m535c(String str) {
        for (String str2 : this.f5734d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : this.f5734d) {
            if (str3.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m534d(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (str.equals("/")) {
            return true;
        }
        for (String str2 : this.f5734d) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public String[] m533e(String str) {
        String[] strArr;
        if (str.equals("") || str.equals("/") || str.equals("\\")) {
            str = "";
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f5734d) {
            if (str.equals("") || str2.startsWith(str)) {
                String substring = str2.substring(str.length());
                if (substring.length() != 0 && !substring.equals("..")) {
                    if (substring.contains("/")) {
                        String substring2 = substring.substring(0, substring.indexOf("/"));
                        if (!arrayList.contains(substring2)) {
                            arrayList.add(substring2);
                        }
                    } else {
                        arrayList.add(substring);
                    }
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    public ZipEntry m532f(String str) {
        ZipEntry zipEntry;
        String str2 = this.f5731a + str;
        ZipEntry zipEntry2 = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry2 = this.f5733c.getEntry(str2);
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        if (zipEntry2 == null && m536b(str) && !m534d(str)) {
            Enumeration<? extends ZipEntry> entries = this.f5733c.entries();
            while (entries.hasMoreElements()) {
                try {
                    zipEntry = (ZipEntry) entries.nextElement();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
                if (zipEntry.getName().equals(str2)) {
                    return zipEntry;
                }
            }
            m537a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException == null) {
            return zipEntry2;
        }
        throw new RuntimeException("Failed to decode data in zip: " + str + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
    }

    /* renamed from: g */
    public String m531g(String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2 = str;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        for (String str3 : this.f5734d) {
            if (str3.equals(str)) {
                return str3;
            }
        }
        for (String str4 : this.f5734d) {
            if (str4.equals(str2)) {
                return str4;
            }
        }
        for (String str5 : this.f5734d) {
            if (str5.equalsIgnoreCase(str)) {
                return str5;
            }
        }
        for (String str6 : this.f5734d) {
            if (str6.equalsIgnoreCase(str2)) {
                return str6;
            }
        }
        return str;
    }

    /* renamed from: h */
    public long m530h(String str) {
        ZipEntry f = m532f(str);
        if (f != null) {
            return f.getSize();
        }
        m537a("getEntrySize: File not found: " + str);
        return -1L;
    }

    /* renamed from: i */
    public C0832j m529i(String str) {
        ZipEntry f = m532f(str);
        if (f == null) {
            f = m532f(m531g(str));
        }
        if (f == null) {
            return null;
        }
        try {
            return new C0832j(this.f5733c.getInputStream(f), this.f5732b + "/" + str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
