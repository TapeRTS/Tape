package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetManager;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/i.class */
public final class C0830i {

    /* renamed from: c */
    private ArrayList f5764c;

    /* renamed from: a */
    public Context f5765a;

    /* renamed from: b */
    boolean f5766b = true;

    public C0830i(Context context) {
        this.f5765a = context;
        m505a();
    }

    /* renamed from: a */
    public void m505a() {
        new Thread() { // from class: com.corrodinggames.rts.gameFramework.utility.i.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C0830i.this.m502b();
            }
        }.start();
    }

    /* renamed from: b */
    public void m502b() {
        synchronized (this) {
            if (this.f5764c == null) {
                AssetManager d = this.f5765a.mo4277d();
                ArrayList arrayList = new ArrayList();
                try {
                    AbstractC0789l.m670d("------- createIndex -------");
                    arrayList.addAll(m504a(d, "", 1));
                    this.f5764c = arrayList;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: a */
    public ArrayList m504a(AssetManager assetManager, String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] c = assetManager.m4262c(str);
        if (str.length() > 0) {
            str = str + "/";
        }
        if (i > 140) {
            throw new RuntimeException("dirLevel>140 for: " + str);
        }
        AbstractC0789l.m670d("c:" + str);
        for (String str2 : c) {
            String str3 = str + str2;
            boolean z = false;
            if (!str2.contains(".")) {
                z = true;
            }
            if (!str2.equals(".") && !str2.equals("..") && !str2.equals("")) {
                arrayList.add(str3);
                if (z) {
                    arrayList.addAll(m504a(assetManager, str3, i + 1));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList m500c() {
        if (this.f5764c != null) {
            if (this.f5766b) {
                AbstractC0789l.m670d("assetIndex: getFile was not blocked on load");
                this.f5766b = false;
            }
            return this.f5764c;
        }
        AbstractC0789l.m747N();
        m502b();
        if (this.f5766b) {
            AbstractC0789l.m670d("assetIndex: getFile is BLOCKED on load");
            this.f5766b = false;
        }
        return this.f5764c;
    }

    /* renamed from: a */
    public boolean m503a(String str) {
        if (str.endsWith(File.separator)) {
            str = str.substring(0, str.length() - 1);
        }
        String replace = str.replace("//", "/");
        Iterator it = m500c().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(replace)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String[] m501b(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2.endsWith(File.separator)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        int i = 0;
        Iterator it = m500c().iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith(str2)) {
                String substring = str3.substring(str2.length());
                if (substring.length() != 0 && substring.charAt(0) == File.separatorChar && substring.indexOf(File.separator, 1) == -1) {
                    i++;
                    arrayList.add(str3.substring((str2 + "/").length()));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
