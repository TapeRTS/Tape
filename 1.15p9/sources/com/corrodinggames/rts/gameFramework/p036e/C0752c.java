package com.corrodinggames.rts.gameFramework.p036e;

import android.content.res.AssetManager;
import android.os.Environment;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.p048a.C1068a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/c.class */
public class C0752c {

    /* renamed from: a */
    public String f4867a = "FileLoader: ";

    /* renamed from: b */
    public boolean f4868b = false;

    /* renamed from: c */
    public boolean f4869c = true;

    /* renamed from: d */
    public boolean f4870d = false;

    /* renamed from: e */
    String f4871e;

    /* renamed from: f */
    String f4872f;

    /* renamed from: a */
    public String m2432a() {
        String str = this.f4871e;
        this.f4871e = null;
        return str;
    }

    /* renamed from: a */
    public void m2429a(String str) {
        this.f4871e = str;
    }

    /* renamed from: a */
    public String m2428a(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            GameEngine.PrintLog(this.f4867a + "findFileExtension('" + str + "','" + str2 + "'): path is not a folder");
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
        GameEngine.PrintLog(this.f4867a + "Could not find file with path: " + str + " file:" + str2);
        return null;
    }

    /* renamed from: b */
    public boolean m2425b(String str) {
        if (GameEngine.f6199aU || str.startsWith("/") || str.startsWith("/SD/")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m2422c(String str) {
        if (str.startsWith("/") || str.startsWith("\\")) {
            return true;
        }
        if (GameEngine.f6199aU) {
            if (str.startsWith("mods")) {
                return true;
            }
            if (GameEngine.f6204aZ && str.startsWith("converted-sounds")) {
                return true;
            }
        }
        if (str.split("\\\\")[0].endsWith(":")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String m2421d(String str) {
        GameEngine m1228A = GameEngine.m1228A();
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
                        C0824b m1856c = m1228A.f6118bZ.m1856c(substring);
                        if (m1856c == null) {
                            GameEngine.PrintLog(this.f4867a + "Failed to find mod with hash:" + substring);
                        } else {
                            str2 = C0758f.m2297b(m1856c.m1828g(), str2);
                            GameEngine.PrintLog(this.f4867a + "Path changed to mod path:" + str2);
                            z = true;
                            break;
                        }
                    }
                    str2 = str3 + File.separator + str2;
                    length--;
                }
                if (z) {
                    str = str2;
                }
            }
            if (str.contains("MOD|")) {
                GameEngine.PrintLog(this.f4867a + "Path still contains prefix: " + str);
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
                        GameEngine.PrintLog(this.f4867a + "Path changed to maps2 path:" + str4);
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
    public String mo2407e(String str) {
        if (str == null) {
            return "<null>";
        }
        String m2419f = m2419f(str);
        AbstractC1076af m637b = C1075ae.m637b(m2419f);
        if (m637b != null) {
            return m637b.mo625f(m2419f);
        }
        return m2419f;
    }

    /* renamed from: f */
    public String m2419f(String str) {
        String m2421d = m2421d(str);
        if (GameEngine.f6199aU) {
            if (m2421d.startsWith("/SD/rusted_warfare_maps")) {
                m2421d = "/SD/mods/maps" + m2421d.substring("/SD/rusted_warfare_maps".length());
                GameEngine.PrintLog(this.f4867a + "convertAbstractPath: Changing to:" + m2421d);
            }
            if (m2421d.startsWith("/SD/rustedWarfare/maps")) {
                m2421d = "/SD/mods/maps" + m2421d.substring("/SD/rustedWarfare/maps".length());
                GameEngine.PrintLog(this.f4867a + "convertAbstractPath2: Changing to:" + m2421d);
            }
            if (m2421d.startsWith("/SD/") || m2421d.startsWith("\\SD\\")) {
                String substring = m2421d.substring("/SD/".length());
                if (substring.startsWith("rustedWarfare/")) {
                    substring = substring.substring("rustedWarfare/".length());
                }
                return mo2387b() + substring;
            } else if (m2422c(m2421d)) {
                return m2421d;
            } else {
                return "assets/" + m2421d;
            }
        } else if (m2421d.startsWith("/SD/")) {
            String substring2 = m2421d.substring("/SD/".length());
            if (substring2.startsWith("rustedWarfare/")) {
                substring2 = substring2.substring("rustedWarfare/".length());
            }
            return mo2387b() + substring2;
        } else {
            return m2421d;
        }
    }

    /* renamed from: f */
    private String m2420f() {
        if (this.f4872f == null) {
            this.f4872f = Environment.getExternalStorageDirectory() + VariableScope.nullOrMissingString;
        }
        return this.f4872f;
    }

    /* renamed from: g */
    public boolean m2418g(String str) {
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null) {
            return m639a.mo627d(m2419f);
        }
        if (m2425b(str)) {
            if (this.f4870d) {
                return false;
            }
            if (!GameEngine.m1228A().f6103bK.m566a(m2419f)) {
                GameEngine.PrintLog(this.f4867a + "isDirectory: asset file doesn't exist:" + m2419f);
                return false;
            } else if (C0758f.m2241k(str).contains(".")) {
                return false;
            } else {
                return true;
            }
        }
        File file = new File(m2419f);
        if (!file.exists()) {
            GameEngine.PrintLog(this.f4867a + "isDirectory: file doesn't exist:" + m2419f);
            return false;
        }
        return file.isDirectory();
    }

    /* renamed from: h */
    public boolean m2417h(String str) {
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null) {
            boolean mo634a = m639a.mo634a(m2419f);
            if (this.f4869c) {
                GameEngine.PrintLog("fileExists: " + mo634a + " with reader: " + m639a + " convertedDir:" + m2419f);
            }
            return mo634a;
        } else if (m2425b(str)) {
            if (this.f4870d) {
                if (this.f4869c) {
                    GameEngine.PrintLog("fileExists: false with disableAssets");
                    return false;
                }
                return false;
            }
            boolean m566a = GameEngine.m1228A().f6103bK.m566a(m2419f);
            if (this.f4869c) {
                GameEngine.PrintLog("fileExists: " + m566a + " with abstractPathAsset convertedDir:" + m2419f);
            }
            return m566a;
        } else {
            File file = new File(m2419f);
            if (file == null || !file.exists()) {
                if (this.f4869c) {
                    GameEngine.PrintLog("fileExists: false with normal file convertedDir:" + m2419f);
                    return false;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public String[] mo2388a(String str, boolean z) {
        String[] list;
        String[] strArr;
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null) {
            list = m639a.mo631b(m2419f);
        } else if (m2425b(str)) {
            if (this.f4870d) {
                return null;
            }
            list = GameEngine.m1228A().f6103bK.m564b(m2419f);
        } else {
            File file = new File(m2419f);
            if (file == null || !file.exists()) {
                String str2 = "listDir: path doesn't exist:" + m2419f;
                GameEngine.m1139b(str2);
                C0750a.m2452b(str2);
                return null;
            }
            list = file.list();
            if (list == null) {
                if (file != null && !file.isDirectory()) {
                    C0750a.m2452b("path is not a directory, .rwmod or .zip");
                    return null;
                }
                return null;
            }
        }
        if (list == null) {
            GameEngine.PrintLog(this.f4867a + "listDir baseList==null:" + str + " (non folder?)");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (String str3 : list) {
                if (str3.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    arrayList.add(str3);
                }
            }
        } else {
            for (String str4 : list) {
                arrayList.add(str4);
            }
        }
        Collections.sort(arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: i */
    public File m2416i(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.isDirectory()) {
            parentFile = m2416i(parentFile.getAbsolutePath());
            if (parentFile == null || !parentFile.isDirectory()) {
                GameEngine.PrintLog(this.f4867a + "createFileCaseInsensitive: did not find parent for: " + str);
                return null;
            }
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null) {
            GameEngine.PrintLog(this.f4867a + "createFileCaseInsensitive: Failed to list files for: " + str + " in " + parentFile);
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equalsIgnoreCase(file.getName())) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C1098j m2415j(String str) {
        if (str.startsWith("assets/") || str.startsWith("assets\\")) {
            str = str.substring("assets/".length());
        }
        String str2 = str;
        String str3 = "assets/" + str;
        AssetManager mo6586d = C0090c.m6223a().mo6586d();
        if (GameEngine.f6203aY) {
        }
        try {
            try {
                return new C1098j(mo6586d.m6574a(str2), str3, str2);
            } catch (FileNotFoundException e) {
                return null;
            }
        } catch (IOException e2) {
            GameEngine.PrintLog(this.f4867a + "Could not find asset:" + str3);
            return null;
        }
    }

    /* renamed from: k */
    public C1098j m2414k(String str) {
        C1098j c1098j;
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null && !m2419f.endsWith(".rwmod")) {
            return m639a.mo630b(m2419f, true);
        }
        if (str.startsWith("/SD/") || str.startsWith("\\SD\\")) {
            String substring = str.substring("/SD/".length());
            String str2 = substring;
            if (str2.startsWith("rustedWarfare/")) {
                str2 = str2.substring("rustedWarfare/".length());
            }
            String str3 = mo2387b() + str2;
            if (this.f4868b) {
                GameEngine.PrintLog(this.f4867a + "openAssetSteam converted:" + substring + " to: " + str3);
            }
            try {
                File m2416i = m2416i(str3);
                if (m2416i == null) {
                    return null;
                }
                c1098j = new C1098j(new FileInputStream(m2416i), m2416i.getAbsolutePath());
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (m2422c(str)) {
            try {
                File m2416i2 = m2416i(str);
                if (m2416i2 == null) {
                    return null;
                }
                c1098j = new C1098j(new FileInputStream(m2416i2), m2416i2.getAbsolutePath());
            } catch (FileNotFoundException e2) {
                return null;
            }
        } else {
            c1098j = m2415j(str);
        }
        return c1098j;
    }

    /* renamed from: b */
    public OutputStream m2424b(String str, boolean z) {
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null && !m2419f.endsWith(".rwmod")) {
            return m639a.mo628c(m2419f, z);
        }
        return new FileOutputStream(m2419f, z);
    }

    /* renamed from: l */
    public boolean m2413l(String str) {
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null && !m2419f.endsWith(".rwmod")) {
            boolean mo626e = m639a.mo626e(m2419f);
            if (!mo626e) {
                GameEngine.PrintLog("Failed to create directory: " + m2419f + " using reader:" + m639a);
            }
            return mo626e;
        }
        boolean mkdirs = new File(m2419f).mkdirs();
        if (!mkdirs) {
            GameEngine.PrintLog("Failed to create directory: " + m2419f);
        }
        return mkdirs;
    }

    /* renamed from: b */
    public String mo2387b() {
        if (GameEngine.f6199aU) {
            return VariableScope.nullOrMissingString;
        }
        return m2420f() + "/rustedWarfare/";
    }

    /* renamed from: c */
    public String m2423c() {
        if (GameEngine.m1153as()) {
            String absolutePath = C0090c.m6223a().mo6581i().getAbsolutePath();
            if (!absolutePath.endsWith("/")) {
                absolutePath = absolutePath + "/";
            }
            return absolutePath;
        }
        String mo2387b = mo2387b();
        if (mo2387b.equals(VariableScope.nullOrMissingString)) {
            return "cache/";
        }
        return mo2387b + "/cache/";
    }

    /* renamed from: m */
    public long m2412m(String str) {
        String m2419f = m2419f(str);
        AbstractC1076af m639a = C1075ae.m639a(m2419f);
        if (m639a != null) {
            return m639a.mo624g(m2419f);
        }
        File file = new File(m2419f);
        if (!file.exists()) {
        }
        return file.lastModified();
    }

    /* renamed from: a */
    public void m2431a(File file) {
        if (GameEngine.m1153as()) {
        }
    }

    /* renamed from: a */
    public File m2427a(String str, String str2, boolean z) {
        File file = new File(mo2387b() + str2 + str);
        if (z) {
            File parentFile = file.getParentFile();
            if (!C0750a.m2440h(parentFile.getAbsolutePath())) {
                GameEngine.PrintLog("Making missing parent dir: " + parentFile.getAbsolutePath());
                if (!C0750a.m2437k(parentFile.getAbsolutePath())) {
                    GameEngine.m1139b("getRWFile: Could not create parent directory");
                }
            }
            if (GameEngine.m1153as()) {
            }
        }
        return file;
    }

    /* renamed from: d */
    public String mo2386d() {
        return "external";
    }

    /* renamed from: n */
    public String m2411n(String str) {
        return mo2386d();
    }

    /* renamed from: e */
    public boolean mo2385e() {
        return true;
    }

    /* renamed from: o */
    public String m2410o(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf("[INTERNAL-PATH]/") != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + "[INTERNAL-PATH]/".length());
            if (str2.contains("[INTERNAL-PATH]/") || str2.contains("[EXTERNAL-PATH]/")) {
                GameEngine.PrintLog("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf("[EXTERNAL-PATH]/") != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + "[EXTERNAL-PATH]/".length());
            if (str3.contains("[INTERNAL-PATH]/") || str3.contains("[EXTERNAL-PATH]/")) {
                GameEngine.PrintLog("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: p */
    public String m2409p(String str) {
        return str;
    }

    /* renamed from: b */
    public boolean m2426b(File file) {
        GameEngine.PrintLog("deleteFile: " + file.getAbsolutePath());
        AbstractC1076af m637b = C1075ae.m637b(file.getAbsolutePath());
        if (m637b != null) {
            GameEngine.PrintLog("Mapped delete");
            return m637b.mo629c(file.getAbsolutePath());
        }
        GameEngine.PrintLog("Native delete");
        return file.delete();
    }

    /* renamed from: a */
    public boolean m2430a(File file, File file2) {
        GameEngine.PrintLog("renameFile: " + file.getAbsolutePath() + " to:" + file2.getAbsolutePath());
        AbstractC1076af m637b = C1075ae.m637b(file.getAbsolutePath());
        if (m637b != null) {
            boolean mo633a = m637b.mo633a(file.getAbsolutePath(), file2.getAbsolutePath());
            C1075ae.m636c(file2.getAbsolutePath());
            return mo633a;
        }
        boolean renameTo = file.renameTo(file2);
        C1075ae.m636c(file2.getAbsolutePath());
        return renameTo;
    }

    /* renamed from: q */
    public boolean m2408q(String str) {
        AbstractC1076af m637b = C1075ae.m637b(m2419f(str));
        if (m637b != null && (m637b instanceof C1068a)) {
            return true;
        }
        return false;
    }
}
