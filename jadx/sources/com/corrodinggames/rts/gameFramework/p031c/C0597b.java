package com.corrodinggames.rts.gameFramework.p031c;

import android.content.res.AssetManager;
import android.os.Environment;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import com.corrodinggames.rts.p008a.C0067c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/b.class */
public class C0597b {

    /* renamed from: a */
    String f4095a;

    /* renamed from: b */
    String f4096b;

    /* renamed from: a */
    public String m1883a() {
        String str = this.f4095a;
        this.f4095a = null;
        return str;
    }

    /* renamed from: a */
    public void m1882a(String str) {
        this.f4095a = str;
    }

    /* renamed from: a */
    public String m1881a(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            AbstractC0789l.m670d("findFileExtension('" + str + "','" + str2 + "'): path is not a folder");
            return null;
        }
        for (File file : listFiles) {
            String name = file.getName();
            if (name.contains(".")) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            if (name.equals(str2)) {
                return str + "/" + file.getName();
            }
        }
        AbstractC0789l.m670d("Could not find file with path: " + str + " file:" + str2);
        return null;
    }

    /* renamed from: b */
    public boolean m1878b(String str) {
        if (!AbstractC0789l.f5471aF && !str.startsWith("/SD/")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1876c(String str) {
        if (str.startsWith("/") || str.startsWith("\\")) {
            return true;
        }
        if (AbstractC0789l.f5471aF) {
            if (str.startsWith("mods")) {
                return true;
            }
            if (AbstractC0789l.f5475aJ && str.startsWith("converted-sounds")) {
                return true;
            }
        }
        if (str.split("\\\\")[0].endsWith(":")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String m1875d(String str) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                String str2 = split[split.length - 1];
                boolean z = false;
                int length = split.length - 2;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    String str3 = split[length];
                    if (str3.startsWith("MOD|")) {
                        String substring = str3.substring("MOD|".length());
                        C0657b a = u.f5525bH.m1408a(substring);
                        if (a != null) {
                            str2 = C0654f.m1462b(a.f4616f, str2);
                            AbstractC0789l.m670d("Path changed to mod path:" + str2);
                            z = true;
                            break;
                        }
                        AbstractC0789l.m670d("Failed to find mod with hash:" + substring);
                    }
                    str2 = str3 + File.separator + str2;
                    length--;
                }
                if (z) {
                    str = str2;
                }
            }
            if (str.contains("MOD|")) {
                AbstractC0789l.m670d("Path still contains prefix: " + str);
            }
        }
        if (str.contains("NEW_PATH|")) {
            String[] split2 = str.split("/");
            if (split2.length >= 2) {
                String str4 = split2[split2.length - 1];
                boolean z2 = false;
                int length2 = split2.length - 2;
                while (true) {
                    if (length2 < 0) {
                        break;
                    }
                    String str5 = split2[length2];
                    if (str5.startsWith("NEW_PATH|") && str5.substring("NEW_PATH|".length()).equals("maps2")) {
                        str4 = "/SD/rustedWarfare/maps" + File.separator + str4;
                        AbstractC0789l.m670d("Path changed to maps2 path:" + str4);
                        z2 = true;
                        break;
                    }
                    str4 = str5 + File.separator + str4;
                    length2--;
                }
                if (z2) {
                    str = str4;
                }
            }
        }
        return str;
    }

    /* renamed from: e */
    public String m1874e(String str) {
        String d = m1875d(str);
        if (AbstractC0789l.f5471aF) {
            if (d.startsWith("/SD/rusted_warfare_maps")) {
                d = "/SD/mods/maps" + d.substring("/SD/rusted_warfare_maps".length());
                AbstractC0789l.m670d("convertAbstractPath: Changing to:" + d);
            }
            if (d.startsWith("/SD/rustedWarfare/maps")) {
                d = "/SD/mods/maps" + d.substring("/SD/rustedWarfare/maps".length());
                AbstractC0789l.m670d("convertAbstractPath2: Changing to:" + d);
            }
            if (d.startsWith("/SD/") || d.startsWith("\\SD\\")) {
                String substring = d.substring("/SD/".length());
                if (substring.startsWith("rustedWarfare/")) {
                    substring = substring.substring("rustedWarfare/".length());
                }
                return m1877c() + substring;
            } else if (m1876c(d)) {
                return d;
            } else {
                return "assets/" + d;
            }
        } else if (d.startsWith("/SD/")) {
            return m1879b() + "/" + d.substring("/SD/".length());
        } else {
            return d;
        }
    }

    /* renamed from: b */
    public String m1879b() {
        if (this.f4096b == null) {
            this.f4096b = Environment.getExternalStorageDirectory() + "";
        }
        return this.f4096b;
    }

    /* renamed from: f */
    public boolean m1873f(String str) {
        String e = m1874e(str);
        if (C0812ae.m544c(e)) {
            return C0812ae.m542d(e);
        }
        if (!m1878b(str)) {
            File file = new File(e);
            if (file.exists()) {
                return file.isDirectory();
            }
            AbstractC0789l.m670d("isDirectory: file doesn't exist:" + e);
            return false;
        } else if (!AbstractC0789l.m638u().f5510bs.m503a(e)) {
            AbstractC0789l.m670d("isDirectory: asset file doesn't exist:" + e);
            return false;
        } else if (C0654f.m1416k(str).contains(".")) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public boolean m1872g(String str) {
        String e = m1874e(str);
        if (C0812ae.m544c(e)) {
            return C0812ae.m546b(e);
        }
        if (m1878b(str)) {
            return AbstractC0789l.m638u().f5510bs.m503a(e);
        }
        File file = new File(e);
        return file != null && file.exists();
    }

    /* renamed from: a */
    public String[] m1880a(String str, boolean z) {
        String[] strArr;
        String e = m1874e(str);
        if (C0812ae.m544c(e)) {
            return C0812ae.m541e(e);
        }
        if (m1878b(str)) {
            strArr = AbstractC0789l.m638u().f5510bs.m501b(e);
        } else {
            File file = new File(e);
            if (file == null || !file.exists()) {
                String str2 = "listDir: path doesn't exist:" + e;
                AbstractC0789l.m682b(str2);
                C0596a.m1894a(str2);
                return null;
            }
            strArr = file.list();
            if (strArr == null) {
                if (file == null || file.isDirectory()) {
                    return null;
                }
                C0596a.m1894a("path is not a directory, .rwmod or .zip");
                return null;
            }
        }
        if (strArr == null) {
            AbstractC0789l.m670d("listDir baseList==null:" + str + " (non folder?)");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (String str3 : strArr) {
                if (str3.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    arrayList.add(str3);
                }
            }
        } else {
            for (String str4 : strArr) {
                arrayList.add(str4);
            }
        }
        Collections.sort(arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: h */
    public static File m1871h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.isDirectory()) {
            parentFile = m1871h(parentFile.getAbsolutePath());
            if (parentFile == null || !parentFile.isDirectory()) {
                AbstractC0789l.m670d("createFileCaseInsensitive: did not find parent for: " + str);
                return null;
            }
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null) {
            AbstractC0789l.m670d("createFileCaseInsensitive: Failed to list files for: " + str + " in " + parentFile);
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equalsIgnoreCase(file.getName())) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: i */
    public C0832j m1870i(String str) {
        if (str.startsWith("assets/") || str.startsWith("assets\\")) {
            str = str.substring("assets/".length());
        }
        String str2 = "assets/" + str;
        AssetManager d = C0067c.m3963a().mo4277d();
        if (AbstractC0789l.f5474aI) {
        }
        try {
            return new C0832j(d.m4267a(str), str2, str);
        } catch (IOException e) {
            AbstractC0789l.m670d("Could not find asset:" + str2);
            return null;
        }
    }

    /* renamed from: j */
    public C0832j m1869j(String str) {
        C0832j jVar;
        String str2;
        if (C0812ae.m544c(str) && !str.endsWith(".rwmod")) {
            return C0812ae.m545b(str, false);
        }
        if (str.startsWith("/SD/") || str.startsWith("\\SD\\")) {
            String substring = str.substring("/SD/".length());
            if (AbstractC0789l.f5471aF) {
                str2 = substring;
            } else {
                str2 = m1879b() + "/" + substring;
            }
            try {
                File h = m1871h(str2);
                if (h == null) {
                    return null;
                }
                jVar = new C0832j(new FileInputStream(h), h.getAbsolutePath());
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (m1876c(str)) {
            AbstractC0789l.m670d("using " + str + " as absolute path");
            try {
                File h2 = m1871h(str);
                if (h2 == null) {
                    return null;
                }
                jVar = new C0832j(new FileInputStream(h2), h2.getAbsolutePath());
            } catch (FileNotFoundException e2) {
                return null;
            }
        } else {
            jVar = m1870i(str);
        }
        return jVar;
    }

    /* renamed from: c */
    public String m1877c() {
        if (AbstractC0789l.f5471aF) {
            return "";
        }
        return m1879b() + "/rustedWarfare/";
    }
}
