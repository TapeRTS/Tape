package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ah.class */
public class C1079ah {

    /* renamed from: a */
    String f6838a = VariableScope.nullOrMissingString;

    /* renamed from: b */
    String f6839b;

    /* renamed from: c */
    ZipFile f6840c;

    /* renamed from: d */
    String[] f6841d;

    /* renamed from: e */
    boolean f6842e;

    public C1079ah(String str, String str2) {
        this.f6839b = str;
        GameEngine.m1114g("Opening new zip at: " + str2);
        AbstractC1076af m637b = C1075ae.m637b(str2);
        if (m637b != null) {
            GameEngine.PrintLog("Temp file needed for zip with SAF interface");
            if (!GameEngine.m1153as()) {
                throw new IOException("Failed to open source zip with mapper: " + str2);
            }
            long m2610a = C0727bl.m2610a();
            C1098j mo630b = m637b.mo630b(str2, true);
            if (mo630b == null) {
                throw new IOException("Failed to open file of zip: " + str2);
            }
            this.f6840c = m603a(mo630b, (Charset) null);
            GameEngine.PrintLog("Streamed zip open took:" + C0727bl.m2609a(C0727bl.m2608a(m2610a)));
        } else {
            this.f6840c = new ZipFile(str2);
        }
        try {
            m600b();
        } catch (IllegalArgumentException e) {
            C1077ag.m609h("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset forName = Charset.forName("ISO-8859-1");
            try {
                if (m637b != null) {
                    GameEngine.PrintLog("Temp file needed for zip with SAF interface");
                    if (!GameEngine.m1153as()) {
                        throw new IOException("Failed to open source zip with mapper: " + str2);
                    }
                    long m2610a2 = C0727bl.m2610a();
                    this.f6840c = m603a(m637b.mo630b(str2, true), forName);
                    GameEngine.PrintLog("Streamed zip open took:" + C0727bl.m2609a(C0727bl.m2608a(m2610a2)));
                } else {
                    this.f6840c = m601a(str2, forName);
                }
                m600b();
            } catch (RuntimeException e2) {
                e.printStackTrace();
                throw new IOException("Failed to open source zip with unicode and ISO-8859-1 encoding", e2);
            }
        }
    }

    /* renamed from: a */
    public void m604a() {
        if (!this.f6842e) {
            this.f6842e = true;
            if (this.f6840c != null) {
                try {
                    this.f6840c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static ZipFile m603a(InputStream inputStream, Charset charset) {
        File m2464a = C0750a.m2464a(C0090c.m6223a(), "safMod", "zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m2464a);
            C0758f.m2339a(inputStream, fileOutputStream);
            fileOutputStream.close();
            inputStream.close();
            if (charset == null) {
                ZipFile zipFile = new ZipFile(m2464a);
                m2464a.delete();
                return zipFile;
            }
            ZipFile m601a = m601a(m2464a.getAbsolutePath(), charset);
            m2464a.delete();
            return m601a;
        } catch (Throwable th) {
            m2464a.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public static ZipFile m601a(String str, Charset charset) {
        Constructor constructor = null;
        try {
            constructor = ZipFile.class.getDeclaredConstructor(String.class, Charset.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
        if (constructor == null) {
            throw new IOException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1");
        }
        try {
            return (ZipFile) constructor.newInstance(str, charset);
        } catch (IllegalAccessException e3) {
            throw new IOException(e3);
        } catch (IllegalArgumentException e4) {
            throw new IOException(e4);
        } catch (InstantiationException e5) {
            throw new IOException(e5);
        } catch (InvocationTargetException e6) {
            throw new IOException(e6);
        }
    }

    /* renamed from: b */
    public void m600b() {
        double m2608a;
        long m2610a = C0727bl.m2610a();
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> entries = this.f6840c.entries();
        while (entries.hasMoreElements()) {
            String name = entries.nextElement().getName();
            if (name == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add(name);
        }
        this.f6841d = (String[]) arrayList.toArray(new String[0]);
        this.f6838a = VariableScope.nullOrMissingString;
        String[] m596e = m596e(VariableScope.nullOrMissingString);
        if (m596e.length == 1 && m597d(m596e[0])) {
            this.f6838a = m596e[0] + "/";
            for (int i = 0; i < this.f6841d.length; i++) {
                if (this.f6841d[i].startsWith(this.f6838a)) {
                    this.f6841d[i] = this.f6841d[i].substring(this.f6838a.length());
                }
            }
        }
        if (C0727bl.m2608a(m2610a) > 3.0d) {
            GameEngine.PrintLog("zip: buildCache for: " + this.f6839b + ", took:" + C0727bl.m2609a(m2608a));
        }
    }

    /* renamed from: a */
    public void m602a(String str) {
        GameEngine.PrintLog("Zip: " + str);
    }

    /* renamed from: b */
    public boolean m599b(String str) {
        for (String str2 : this.f6841d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m598c(String str) {
        for (String str2 : this.f6841d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : this.f6841d) {
            if (str3.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m597d(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (str.equals("/")) {
            return true;
        }
        for (String str2 : this.f6841d) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public String[] m596e(String str) {
        String[] strArr;
        if (str.equals(VariableScope.nullOrMissingString) || str.equals("/") || str.equals("\\")) {
            str = VariableScope.nullOrMissingString;
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f6841d) {
            if (str.equals(VariableScope.nullOrMissingString) || str2.startsWith(str)) {
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
    public ZipEntry m595f(String str) {
        ZipEntry nextElement;
        String str2 = this.f6838a + str;
        ZipEntry zipEntry = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry = this.f6840c.getEntry(str2);
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        if (zipEntry == null && m599b(str) && !m597d(str)) {
            Enumeration<? extends ZipEntry> entries = this.f6840c.entries();
            while (entries.hasMoreElements()) {
                try {
                    nextElement = entries.nextElement();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
                if (nextElement.getName().equals(str2)) {
                    return nextElement;
                }
            }
            m602a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException != null) {
            throw new RuntimeException("Failed to decode data in zip: " + str + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
        }
        return zipEntry;
    }

    /* renamed from: g */
    public String m594g(String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2 = str;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        for (String str3 : this.f6841d) {
            if (str3.equals(str)) {
                return str3;
            }
        }
        for (String str4 : this.f6841d) {
            if (str4.equals(str2)) {
                return str4;
            }
        }
        for (String str5 : this.f6841d) {
            if (str5.equalsIgnoreCase(str)) {
                return str5;
            }
        }
        for (String str6 : this.f6841d) {
            if (str6.equalsIgnoreCase(str2)) {
                return str6;
            }
        }
        return str;
    }

    /* renamed from: h */
    public long m593h(String str) {
        ZipEntry m595f = m595f(str);
        if (m595f == null) {
            m602a("getEntrySize: File not found: " + str);
            return -1L;
        }
        return m595f.getSize();
    }

    /* renamed from: i */
    public C1098j m592i(String str) {
        ZipEntry m595f = m595f(str);
        if (m595f == null) {
            m595f = m595f(m594g(str));
        }
        if (m595f == null) {
            return null;
        }
        try {
            try {
                return new C1098j(this.f6840c.getInputStream(m595f), this.f6839b + "/" + str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
