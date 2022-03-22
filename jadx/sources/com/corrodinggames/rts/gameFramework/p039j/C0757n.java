package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p032d.C0621d;

/* renamed from: com.corrodinggames.rts.gameFramework.j.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/n.class */
public final class C0757n {

    /* renamed from: b */
    static float f5284b;

    /* renamed from: c */
    static float f5285c;

    /* renamed from: d */
    static float f5286d;

    /* renamed from: a */
    static int f5283a = -1;

    /* renamed from: e */
    public static final Rect f5287e = new Rect();

    /* renamed from: a */
    public static void m846a(String str, float f, float f2, Paint paint) {
        AbstractC0789l u = AbstractC0789l.m638u();
        String[] b = C0654f.m1464b(str, '\n');
        float b2 = C0621d.m1764b(paint);
        float length = (b.length - 1) * b2;
        int i = 0;
        for (String str2 : b) {
            u.f5514bw.mo158a(str2, f, (f2 - (length / 2.0f)) + (i * b2) + (b2 / 2.0f), paint);
            i++;
        }
    }

    /* renamed from: a */
    public static void m847a(AbstractC0755l lVar, float f, float f2, float f3, Paint paint) {
        if (AbstractC0789l.m699aj()) {
            m848a(lVar, f, f2, f3, 40, paint, AbstractC0789l.m638u().f5567cx);
        } else {
            lVar.mo195a(f, f2, f3, paint);
        }
    }

    /* renamed from: a */
    public static void m848a(AbstractC0755l lVar, float f, float f2, float f3, int i, Paint paint, Rect rect) {
        if (f5283a != i) {
            f5283a = i;
            f5284b = 6.283185f / i;
            f5285c = C0654f.m1421i(f5284b);
            f5286d = C0654f.m1425h(f5284b);
        }
        float f4 = f5285c;
        float f5 = f5286d;
        int i2 = ((int) (f5284b * f3 * 0.5f)) + 50;
        f5287e.f227a = rect.f227a - i2;
        f5287e.f228b = rect.f228b - i2;
        f5287e.f229c = rect.f229c + i2;
        f5287e.f230d = rect.f230d + i2;
        float f6 = f3;
        float f7 = 0.0f;
        int i3 = i + 1;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z = true;
        for (int i4 = 0; i4 < i3; i4++) {
            float f12 = f6 + f;
            float f13 = f7 + f2;
            if (z) {
                z = false;
                f8 = f12;
                f9 = f13;
            } else if (f5287e.m4133b((int) f12, (int) f13) || f5287e.m4133b((int) f10, (int) f11)) {
                lVar.mo197a(f12, f13, f10, f11, paint);
            }
            f10 = f12;
            f11 = f13;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f6) + (f4 * f7);
        }
        if (f5287e.m4133b((int) f8, (int) f9) || f5287e.m4133b((int) f10, (int) f11)) {
            lVar.mo197a(f8, f9, f10, f11, paint);
        }
    }

    /* renamed from: a */
    public static final int m849a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static final int m845b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static final int m844c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static final int m843d(int i) {
        return i & 255;
    }
}
