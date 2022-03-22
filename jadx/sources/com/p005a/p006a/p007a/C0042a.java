package com.p005a.p006a.p007a;

/* renamed from: com.a.a.a.a */
/* loaded from: game-lib.jar:com/a/a/a/a.class */
public class C0042a {

    /* renamed from: a */
    private static Object[] f326a = new Object[0];

    /* renamed from: b */
    private static Object[] f327b = new Object[73];

    /* renamed from: a */
    public static int m4013a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m4012b(int i) {
        return m4013a(i * 2) / 2;
    }

    /* renamed from: c */
    public static int m4011c(int i) {
        return m4013a(i * 4) / 4;
    }
}
