package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/b.class */
public class C1069b {

    /* renamed from: a */
    Uri f6795a;

    /* renamed from: b */
    Uri f6796b;

    /* renamed from: c */
    String f6797c;

    /* renamed from: d */
    boolean f6798d;

    /* renamed from: e */
    C1070c f6799e;

    /* renamed from: f */
    boolean f6800f = false;

    /* renamed from: g */
    int f6801g = 1;

    public C1069b(Uri uri, boolean z) {
        this.f6795a = uri;
        this.f6796b = C1068a.f6792a.buildDocumentUriUsingTree(uri);
        this.f6797c = C1068a.f6792a.getReadablePath(m730c(), uri);
        this.f6798d = z;
        C1068a.m743h("== new SafLink write:" + z + " ==");
        C1068a.m743h("root:" + this.f6795a);
        C1068a.m743h("rootDocument:" + this.f6796b);
        C1068a.m743h("shownUrl:" + this.f6797c);
        this.f6799e = new C1070c(this, VariableScope.nullOrMissingString, this.f6796b, true);
    }

    /* renamed from: a */
    public void m736a() {
        this.f6800f = true;
        this.f6801g++;
    }

    /* renamed from: b */
    public void m732b() {
        C1068a.m743h("== testRoot ==");
        C1068a.f6792a.listWithDetails(m730c(), this.f6796b);
    }

    /* renamed from: c */
    public Context m730c() {
        return C0090c.m6223a();
    }

    /* renamed from: a */
    public boolean m735a(String str) {
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (z) {
            return C1068a.f6792a.exists(m730c(), m726f(str));
        }
        if (m721k(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C1098j m731b(String str) {
        Uri m726f;
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (!z) {
            C1070c m721k = m721k(str);
            if (m721k == null) {
                return null;
            }
            m726f = m721k.f6803b;
        } else {
            m726f = m726f(str);
        }
        if (m726f == null) {
            return null;
        }
        try {
            InputStream read = C1068a.f6792a.read(m730c(), m726f);
            if (read == null) {
                return null;
            }
            return new C1098j(read, this.f6795a + "/" + str);
        } catch (FileNotFoundException e) {
            C1068a.m741j("openAssetSteam: " + e.getMessage() + " (file: " + str + ")");
            return null;
        } catch (IllegalArgumentException e2) {
            C1068a.m741j("openAssetSteam: " + e2.getMessage() + " (file: " + str + ")");
            return null;
        }
    }

    /* renamed from: c */
    public long m729c(String str) {
        Uri m726f = m726f(str);
        if (m726f == null) {
            C1068a.m743h("getLastModified file missing: " + str);
            return 0L;
        }
        return C1068a.f6792a.getLastModified(m730c(), m726f);
    }

    /* renamed from: d */
    public long m728d(String str) {
        Uri m726f = m726f(str);
        if (m726f == null) {
            C1068a.m743h("getEntrySize file missing: " + str);
            return -1L;
        }
        return C1068a.f6792a.getFileSize(m730c(), m726f);
    }

    /* renamed from: a */
    public OutputStream m733a(String str, boolean z) {
        C1068a.m742i("writableOutputSteam:" + str);
        Uri m726f = m726f(str);
        if (m726f == null) {
            String name = new File(str).getName();
            Uri m723i = m723i(str);
            C1068a.m742i("writableOutputSteam creating: " + name + " in " + m723i);
            if (m723i == null) {
                C1068a.m741j("writableOutputSteam: Parent folder not found for: " + str);
                return null;
            }
            try {
                m726f = C1068a.f6792a.createFile(m730c(), m723i, VariableScope.nullOrMissingString, name);
                C1068a.m742i("newFileUri: " + m726f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        String str2 = "w";
        if (z) {
            str2 = "wa";
        }
        try {
            OutputStream write = C1068a.f6792a.write(m730c(), m726f, str2);
            m736a();
            return write;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public boolean m727e(String str) {
        if (!this.f6798d) {
            C1068a.m741j("deleteFile: Not open as writable");
            return false;
        }
        Uri m726f = m726f(str);
        if (m726f == null) {
            C1068a.m741j("deleteFile: fileUri==null for:" + str);
            return false;
        } else if (C1068a.f6792a.isDirectory(m730c(), m726f)) {
            throw new RuntimeException("Attempted to delete folder at: " + str + " url:" + m726f);
        } else {
            try {
                boolean deleteFile = C1068a.f6792a.deleteFile(m730c(), m726f);
                m736a();
                return deleteFile;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: a */
    public boolean m734a(String str, String str2) {
        if (!this.f6798d) {
            C1068a.m741j("renameFile: Not open as writable");
            return false;
        }
        Uri m726f = m726f(str);
        if (m726f == null) {
            C1068a.m741j("renameFile: fileUri==null for:" + str);
            return false;
        }
        String m2241k = C0758f.m2241k(str2);
        C1068a.m742i("Rename: " + m726f + " to " + m2241k);
        try {
            Uri renameFile = C1068a.f6792a.renameFile(m730c(), m726f, m2241k);
            m736a();
            return renameFile != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public Uri m726f(String str) {
        C1070c m721k = m721k(str);
        if (m721k == null) {
            return null;
        }
        return m721k.f6803b;
    }

    /* renamed from: g */
    public String[] m725g(String str) {
        C1070c m721k = m721k(str);
        if (m721k == null || !m721k.f6804c) {
            return null;
        }
        HashMap m719a = m721k.m719a();
        ArrayList arrayList = new ArrayList();
        for (String str2 : m719a.keySet()) {
            arrayList.add(str2);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: h */
    public boolean m724h(String str) {
        if (str.equals("/") || str.equals(VariableScope.nullOrMissingString)) {
            return true;
        }
        C1070c m721k = m721k(str);
        if (m721k == null) {
            return false;
        }
        return m721k.f6804c;
    }

    /* renamed from: i */
    public Uri m723i(String str) {
        String parent = new File(str).getParent();
        if (parent == null) {
            parent = VariableScope.nullOrMissingString;
        }
        Uri m726f = m726f(parent);
        if (m726f == null) {
            C1068a.m741j("createDirectory: Parent folder: " + parent + " not found");
        }
        return m726f;
    }

    /* renamed from: j */
    public boolean m722j(String str) {
        String name = new File(str).getName();
        Uri m723i = m723i(str);
        if (m723i == null) {
            return false;
        }
        Uri createDirectory = C1068a.f6792a.createDirectory(m730c(), m723i, name);
        m736a();
        return createDirectory != null;
    }

    /* renamed from: k */
    private C1070c m721k(String str) {
        return m720l(str);
    }

    /* renamed from: l */
    private C1070c m720l(String str) {
        String[] split = str.split("\\\\|\\/");
        C1070c c1070c = this.f6799e;
        for (String str2 : split) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    C1070c c1070c2 = (C1070c) c1070c.m719a().get(str2);
                    if (c1070c2 != null) {
                        c1070c = c1070c2;
                    } else {
                        C1070c c1070c3 = (C1070c) c1070c.f6806e.get(str2.toLowerCase(Locale.ROOT));
                        if (c1070c3 != null) {
                            c1070c = c1070c3;
                        } else {
                            C1068a.m742i("child null for: " + str);
                            C1068a.m742i("element: " + str2);
                            return null;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return c1070c;
    }
}
