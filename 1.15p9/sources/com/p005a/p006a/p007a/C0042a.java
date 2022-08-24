package com.p005a.p006a.p007a;

/* renamed from: com.a.a.a.a */
/* loaded from: game-lib.jar:com/a/a/a/a.class */
public class C0042a {

    /* renamed from: a */
    private static Object[] f329a = new Object[0];

    /* renamed from: b */
    private static Object[] f330b = new Object[73];

    /* renamed from: a */
    public static int m6325a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m6324b(int i) {
        return m6325a(i * 2) / 2;
    }

    /* renamed from: c */
    public static int m6323c(int i) {
        return m6325a(i * 4) / 4;
    }
}
