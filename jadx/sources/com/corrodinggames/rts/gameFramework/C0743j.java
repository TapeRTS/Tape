package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j.class */
public class C0743j {

    /* renamed from: a */
    static ConcurrentHashMap f5202a = new ConcurrentHashMap();

    /* renamed from: b */
    static C0761k f5203b;

    /* renamed from: a */
    public static long m881a(String str, boolean z) {
        Long l = (Long) f5202a.get(str);
        if (l != null) {
            return l.longValue();
        }
        Long valueOf = Long.valueOf(m882a(str));
        if (!z) {
            f5202a.put(str, valueOf);
            if (f5203b == null) {
            }
        }
        return valueOf.longValue();
    }

    /* renamed from: a */
    private static long m882a(String str) {
        return new File(str).lastModified();
    }

    /* renamed from: a */
    public static synchronized void m883a() {
        m880a(AbstractC0789l.m638u().f5516by.liveReloading);
    }

    /* renamed from: a */
    public static synchronized void m880a(boolean z) {
        if (AbstractC0789l.m697al()) {
            if (z) {
                if (f5203b != null) {
                    AbstractC0789l.m670d("FileChangeEngine: Already running");
                    return;
                }
                AbstractC0789l.m670d("FileChangeEngine: Starting");
                f5203b = new C0761k();
                f5203b.start();
            } else if (f5203b != null) {
                f5203b.f5311a = false;
                f5203b = null;
            }
        }
    }

    /* renamed from: b */
    public static void m879b() {
        int i = 0;
        Enumeration keys = f5202a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            long a = m882a(str);
            Long l = (Long) f5202a.get(str);
            if (l == null) {
                AbstractC0789l.m670d("FileChangeEngine: old lastModified null for " + str);
            } else if (l.longValue() != a) {
                AbstractC0789l.m670d("FileChangeEngine: Detected change to:" + str + " now " + a);
            }
            f5202a.put(str, Long.valueOf(a));
            i++;
            if (i > 50) {
                i = 0;
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
