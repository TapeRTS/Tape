package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j.class */
public class C0894j {

    /* renamed from: a */
    static ConcurrentHashMap f5903a = new ConcurrentHashMap();

    /* renamed from: b */
    static C0912k f5904b;

    /* renamed from: a */
    public static long m1395a(String str, boolean z) {
        Long l = (Long) f5903a.get(str);
        if (l != null) {
            return l.longValue();
        }
        Long valueOf = Long.valueOf(m1396a(str));
        if (!z) {
            f5903a.put(str, valueOf);
            if (f5904b == null) {
            }
        }
        return valueOf.longValue();
    }

    /* renamed from: a */
    private static long m1396a(String str) {
        return new File(str).lastModified();
    }

    /* renamed from: a */
    public static synchronized void m1397a() {
        m1394a(GameEngine.m1228A().f6109bQ.liveReloading);
    }

    /* renamed from: a */
    public static synchronized void m1394a(boolean z) {
        if (!GameEngine.m1151au()) {
            return;
        }
        if (z) {
            if (f5904b != null) {
                GameEngine.PrintLog("FileChangeEngine: Already running");
                return;
            }
            GameEngine.PrintLog("FileChangeEngine: Starting");
            f5904b = new C0912k();
            f5904b.start();
        } else if (f5904b != null) {
            f5904b.f6070a = false;
            f5904b = null;
        }
    }

    /* renamed from: b */
    public static void m1393b() {
        int i = 0;
        Enumeration keys = f5903a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            long m1396a = m1396a(str);
            Long l = (Long) f5903a.get(str);
            if (l == null) {
                GameEngine.PrintLog("FileChangeEngine: old lastModified null for " + str);
            } else if (l.longValue() != m1396a) {
                GameEngine.PrintLog("FileChangeEngine: Detected change to:" + str + " now " + m1396a);
            }
            f5903a.put(str, Long.valueOf(m1396a));
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
