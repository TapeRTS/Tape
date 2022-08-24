package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0795d;

/* renamed from: com.corrodinggames.rts.gameFramework.l.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/aa.class */
public final class C0924aa {

    /* renamed from: b */
    static float f6307b;

    /* renamed from: c */
    static float f6308c;

    /* renamed from: d */
    static float f6309d;

    /* renamed from: f */
    static C0925ab[] f6310f;

    /* renamed from: g */
    static Paint f6311g;

    /* renamed from: a */
    static int f6312a = -1;

    /* renamed from: e */
    public static final Rect f6313e = new Rect();

    /* renamed from: h */
    static final Rect f6314h = new Rect();

    /* renamed from: i */
    static final Rect f6315i = new Rect();

    /* renamed from: j */
    static final RectF f6316j = new RectF();

    /* renamed from: a */
    public static final Bitmap m1091a(BitmapOrTexture bitmapOrTexture) {
        return bitmapOrTexture.mo404b();
    }

    /* renamed from: a */
    public static void m1085a(String str, float f, float f2, Paint paint) {
        GameEngine gameEngine = GameEngine.getInstance();
        String[] m2287c = CommonUtils.m2287c(str, '\n');
        float m2080b = C0795d.m2080b(paint);
        float length = (m2287c.length - 1) * m2080b;
        int i = 0;
        for (String str2 : m2287c) {
            gameEngine.graphics.mo903a(str2, f, (f2 - (length / 2.0f)) + (i * m2080b) + (m2080b / 2.0f), paint);
            i++;
        }
    }

    /* renamed from: a */
    public static void m1089a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, Paint paint) {
        if (GameEngine.m1159as()) {
            m1090a(interfaceC1027y, f, f2, f3, 40, paint, GameEngine.getInstance().f6247cP);
        } else {
            interfaceC1027y.mo931a(f, f2, f3, paint);
        }
    }

    /* renamed from: a */
    public static C0925ab m1094a(float f, float f2, boolean z, InterfaceC1027y interfaceC1027y) {
        int i;
        int i2;
        int i3 = (int) f2;
        int i4 = 0;
        if (((int) f) > 20) {
            i4 = 1;
            i = 60;
        } else {
            i = 30;
        }
        int i5 = 0;
        if (i3 >= 2) {
            i5 = 1;
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i6 = i4 + (i5 * 2) + (z ? 0 : 2 + (2 * 2));
        if (f6310f == null) {
            f6310f = new C0925ab[((2 + (2 * 2)) * 2) + 1];
        }
        if (f6310f[i6] != null) {
            if (f6310f[i6].f6318b != i) {
                GameEngine.PrintLog("Mismatch on index: " + i6 + " size:" + i);
            }
            return f6310f[i6];
        }
        C0925ab c0925ab = new C0925ab();
        c0925ab.f6320d = m1092a(i, i2, z, interfaceC1027y);
        c0925ab.f6318b = i;
        c0925ab.f6317a = i2;
        c0925ab.f6319c = z;
        f6310f[i6] = c0925ab;
        return c0925ab;
    }

    /* renamed from: a */
    public static BitmapOrTexture m1092a(int i, int i2, boolean z, InterfaceC1027y interfaceC1027y) {
        Paint paint = new Paint();
        paint.m7242b(-1);
        paint.m7260a(z ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.m7270a(i2);
        BitmapOrTexture mo893b = interfaceC1027y.mo893b((i * 2) + 4, (i * 2) + 4, true);
        InterfaceC1027y mo891b = interfaceC1027y.mo891b(mo893b);
        mo891b.mo895b(i + 2, i + 2, i, paint);
        mo891b.mo873p();
        mo893b.mo393p();
        mo891b.mo872q();
        return mo893b;
    }

    /* renamed from: a */
    public static void m1088a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, Paint paint, float f4) {
        if (f6311g == null) {
            f6311g = new Paint();
            f6311g.m7248a(true);
            f6311g.m7239b(true);
        }
        int m7230e = paint.m7230e();
        if (GameEngine.m1159as()) {
            f6311g.m7264a(new LightingColorFilter(m7230e, 0));
        }
        f6311g.m7242b(m7230e);
        C0925ab m1094a = m1094a(f3 * f4, paint.m7226g(), paint.m7234d() == Paint.Style.FILL, interfaceC1027y);
        float f5 = f3 / m1094a.f6318b;
        float f6 = (-f3) - (f5 * 2.0f);
        interfaceC1027y.mo914a(m1094a.f6320d, f + f6, f2 + f6, f6311g, 0.0f, f5);
    }

    /* renamed from: a */
    public static void m1090a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, int i, Paint paint, Rect rect) {
        if (f6312a != i) {
            f6312a = i;
            f6307b = 6.283185f / i;
            f6308c = CommonUtils.m2249i(f6307b);
            f6309d = CommonUtils.sin(f6307b);
        }
        float f4 = f6308c;
        float f5 = f6309d;
        int i2 = ((int) (f6307b * f3 * 0.5f)) + 50;
        f6313e.f230a = rect.f230a - i2;
        f6313e.f231b = rect.f231b - i2;
        f6313e.f232c = rect.f232c + i2;
        f6313e.f233d = rect.f233d + i2;
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
            } else if (f6313e.m7205b((int) f12, (int) f13) || f6313e.m7205b((int) f10, (int) f11)) {
                interfaceC1027y.mo932a(f12, f13, f10, f11, paint);
            }
            f10 = f12;
            f11 = f13;
            float f14 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f14) + (f4 * f7);
        }
        if (f6313e.m7205b((int) f8, (int) f9) || f6313e.m7205b((int) f10, (int) f11)) {
            interfaceC1027y.mo932a(f8, f9, f10, f11, paint);
        }
    }

    /* renamed from: a */
    public static final int m1093a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static final int m1084b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static final int m1083c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static final int m1082d(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public static void m1087a(InterfaceC1027y interfaceC1027y, BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        int mo396m = bitmapOrTexture.mo396m();
        int mo397l = bitmapOrTexture.mo397l();
        if (i != 0) {
            i %= bitmapOrTexture.mo396m();
            if (i < 0) {
                i += bitmapOrTexture.mo396m();
            }
        }
        if (i2 != 0) {
            i2 %= bitmapOrTexture.mo397l();
            if (i2 < 0) {
                i2 += bitmapOrTexture.mo397l();
            }
        }
        int i5 = rect.f230a - i;
        int i6 = rect.f231b - i2;
        int i7 = mo396m - i3;
        int i8 = mo397l - i4;
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        int i9 = 0;
        while (i5 < rect.f232c) {
            while (i6 < rect.f233d) {
                i9++;
                if (i9 > 2000) {
                    GameEngine.PrintLog("tileImage hit limit");
                    return;
                }
                int i10 = rect.f232c - i5;
                if (i10 > mo396m) {
                    i10 = mo396m;
                }
                int i11 = rect.f233d - i6;
                if (i11 > mo397l) {
                    i11 = mo397l;
                }
                if (i11 > 0 && i10 > 0) {
                    f6314h.m7208a(0, 0, i10, i11);
                    f6315i.m7208a(i5, i6, i5 + i10, i6 + i11);
                    int i12 = f6315i.f230a - rect.f230a;
                    if (i12 < 0) {
                        f6314h.f230a -= i12;
                        f6315i.f230a -= i12;
                    }
                    int i13 = f6315i.f231b - rect.f231b;
                    if (i13 < 0) {
                        f6314h.f231b -= i13;
                        f6315i.f231b -= i13;
                    }
                    interfaceC1027y.mo910a(bitmapOrTexture, f6314h, f6315i, paint);
                    i6 += i8;
                }
                i5 += i7;
                i6 = rect.f231b - i2;
            }
            i5 += i7;
            i6 = rect.f231b - i2;
        }
    }

    /* renamed from: a */
    public static void m1086a(InterfaceC1027y interfaceC1027y, BitmapOrTexture bitmapOrTexture, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        Rect rect;
        Rect rect2;
        int mo396m = bitmapOrTexture.mo396m();
        int mo397l = bitmapOrTexture.mo397l();
        if (f != 0.0f) {
            f %= mo396m;
            if (f < 0.0f) {
                f += mo396m;
            }
        }
        if (f2 != 0.0f) {
            f2 %= mo397l;
            if (f2 < 0.0f) {
                f2 += mo397l;
            }
        }
        float f3 = rectF.f234a - f;
        float f4 = rectF.f235b - f2;
        int i3 = 0;
        int i4 = mo396m - i;
        int i5 = mo397l - i2;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        while (f3 < rectF.f236c) {
            while (f4 < rectF.f237d) {
                i3++;
                if (i3 > 2000) {
                    GameEngine.PrintLog("tileImage hit limit");
                    return;
                }
                float f5 = rectF.f236c - f3;
                if (f5 > mo396m) {
                    f5 = mo396m;
                }
                float f6 = rectF.f237d - f4;
                if (f6 > mo397l) {
                    f6 = mo397l;
                }
                if (f6 > 0.0f && f5 > 0.0f) {
                    f6314h.m7208a(0, 0, (int) f5, (int) f6);
                    f6316j.m7195a(f3, f4, f3 + f5, f4 + f6);
                    float f7 = f6316j.f234a - rectF.f234a;
                    if (f7 < 0.0f) {
                        f6314h.f230a = (int) (rect2.f230a - f7);
                        f6316j.f234a -= f7;
                    }
                    float f8 = f6316j.f235b - rectF.f235b;
                    if (f8 < 0.0f) {
                        f6314h.f231b = (int) (rect.f231b - f8);
                        f6316j.f235b -= f8;
                    }
                    interfaceC1027y.mo909a(bitmapOrTexture, f6314h, f6316j, paint);
                    f4 += i5;
                }
                f3 += i4;
                f4 = rectF.f235b - f2;
            }
            f3 += i4;
            f4 = rectF.f235b - f2;
        }
    }
}
