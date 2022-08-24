package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/n.class */
public class C0085n {
    /* renamed from: a */
    public void m6233a() {
        GameEngine.PrintLog("Running unit tests");
        new C0075d().m6250a();
        new C0082k().m6241a();
        new C0076e().m6249a();
        new C0072a().m6267a();
        new C0077f().m6244a();
        new C0074c().m6264a();
        new C0084m().m6238a();
    }

    /* renamed from: a */
    public static void m6228a(boolean z) {
        if (!z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: b */
    public static void m6226b(boolean z) {
        if (z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: a */
    public static void m6231a(int i, int i2) {
        if (i != i2) {
            throw new RuntimeException("Asset failed (int):" + i + "!=" + i2);
        }
    }

    /* renamed from: a */
    public static void m6232a(float f, float f2) {
        if (C0758f.m2291c(f - f2) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f + "!=" + f2);
        }
    }

    /* renamed from: a */
    public static void m6229a(String str, String str2) {
        if (!str.equals(str2)) {
            throw new RuntimeException("Asset failed:" + str + "!=" + str2);
        }
    }

    /* renamed from: b */
    public static void m6227b(String str, String str2) {
        GameEngine.PrintLog("assertEqualDebug:'" + str + "' vs '" + str2 + "'");
        m6229a(str, str2);
    }

    /* renamed from: c */
    public static void m6225c(String str, String str2) {
        m6232a(Float.valueOf(Float.parseFloat(str)).floatValue(), Float.valueOf(Float.parseFloat(str2)).floatValue());
    }

    /* renamed from: a */
    public static void m6230a(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new RuntimeException("Asset failed:" + obj + "!=" + obj2);
        }
    }
}
