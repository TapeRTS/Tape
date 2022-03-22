package com.corrodinggames.rts.p009b.p010a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.b.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/i.class */
public class C0114i {
    /* renamed from: a */
    public void m3891a() {
        AbstractC0789l.m670d("Running unit tests");
        new C0108c().m3897a();
        new C0112g().m3894a();
        new C0109d().m3896a();
        new C0106a().m3900a();
        new C0110e().m3895a();
    }

    /* renamed from: a */
    public static void m3886a(boolean z) {
        if (!z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: b */
    public static void m3884b(boolean z) {
        if (z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: a */
    public static void m3889a(int i, int i2) {
        if (i != i2) {
            throw new RuntimeException("Asset failed (int):" + i + "!=" + i2);
        }
    }

    /* renamed from: a */
    public static void m3890a(float f, float f2) {
        if (C0654f.m1459c(f - f2) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f + "!=" + f2);
        }
    }

    /* renamed from: a */
    public static void m3887a(String str, String str2) {
        if (!str.equals(str2)) {
            throw new RuntimeException("Asset failed:" + str + "!=" + str2);
        }
    }

    /* renamed from: b */
    public static void m3885b(String str, String str2) {
        m3890a(Float.valueOf(Float.parseFloat(str)).floatValue(), Float.valueOf(Float.parseFloat(str2)).floatValue());
    }

    /* renamed from: a */
    public static void m3888a(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new RuntimeException("Asset failed:" + obj + "!=" + obj2);
        }
    }
}
