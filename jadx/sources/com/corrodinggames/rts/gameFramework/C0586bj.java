package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.corrodinggames.rts.gameFramework.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bj.class */
public final class C0586bj {

    /* renamed from: a */
    AbstractC0789l f4039a;

    /* renamed from: c */
    public static int f4041c = 40;

    /* renamed from: b */
    public int f4040b = 0;

    /* renamed from: d */
    public int f4042d = 0;

    /* renamed from: e */
    C0594bm f4043e = new C0594bm(this);

    /* renamed from: f */
    Paint f4044f = new Paint();

    /* renamed from: g */
    Rect f4045g = new Rect();

    /* renamed from: h */
    int f4046h = -1;

    public C0586bj(AbstractC0789l lVar) {
        this.f4039a = lVar;
    }

    /* renamed from: a */
    public static final long m1919a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public static final float m1917a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    /* renamed from: a */
    public static final double m1916a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    /* renamed from: a */
    public static final void m1914a(String str, long j) {
        AbstractC0789l.m670d(str + "" + m1918a(m1917a(j)));
    }

    /* renamed from: a */
    public final void m1915a(EnumC0588bk bkVar) {
    }

    /* renamed from: b */
    public final void m1910b(EnumC0588bk bkVar) {
    }

    /* renamed from: a */
    public static final String m1918a(double d) {
        return "" + C0654f.m1524a(d, 3) + "ms";
    }

    /* renamed from: b */
    public static final String m1911b(double d) {
        return "" + (d / 1000000.0d) + "ms";
    }

    /* renamed from: b */
    public final void m1912b() {
    }

    /* renamed from: c */
    public final void m1909c() {
    }

    /* renamed from: a */
    public final void m1913a(boolean z, boolean z2) {
    }
}
