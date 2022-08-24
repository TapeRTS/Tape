package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/d.class */
public class C0795d {

    /* renamed from: a */
    static Rect f5097a = new Rect();

    /* renamed from: b */
    static ArrayList f5098b = new ArrayList();

    /* renamed from: c */
    static final RectF f5099c = new RectF();

    /* renamed from: d */
    static final RectF f5100d = new RectF();

    /* renamed from: a */
    public static int m2085a(Paint paint) {
        return GameEngine.getInstance().graphics.mo901a("abcABC123!|", paint) + 4;
    }

    /* renamed from: b */
    public static int m2080b(Paint paint) {
        int mo901a = GameEngine.getInstance().graphics.mo901a("abcABC123!|", paint);
        if (GameEngine.f6203aY) {
            return mo901a + 2;
        }
        return mo901a;
    }

    /* renamed from: a */
    public static ArrayList m2081a(String str, Rect rect, Paint paint, Paint paint2, boolean z) {
        int lastIndexOf;
        f5098b.clear();
        String str2 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= str.length()) {
                break;
            }
            int m7256a = paint2.m7256a((CharSequence) str, i3, str.length(), true, rect.m7206b() - 5, (float[]) null);
            if (m7256a == 0) {
                break;
            }
            int indexOf = str.indexOf("\n", i3 + 1);
            if (indexOf != -1 && indexOf < i3 + m7256a) {
                m7256a = indexOf - i3;
            } else if (i3 + m7256a < str.length() && (lastIndexOf = str.substring(i3, i3 + m7256a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                m7256a = lastIndexOf;
            }
            String replaceAll = str.substring(i3, i3 + m7256a).replaceAll("(\\n)", VariableScope.nullOrMissingString);
            if (replaceAll.length() > str2.length()) {
                str2 = replaceAll;
                i = f5098b.size();
            }
            f5098b.add(replaceAll);
            i2 = i3 + m7256a;
        }
        rect.f233d = rect.f231b + (f5098b.size() * m2085a(paint2));
        if (z) {
            float m7201d = rect.m7201d();
            Paint paint3 = paint2;
            if (i == 0) {
                paint3 = paint;
            }
            float mo888b = GameEngine.getInstance().graphics.mo888b(str2, paint3);
            if (mo888b < rect.m7206b()) {
                rect.f230a = (int) (m7201d - (mo888b / 2.0f));
                rect.f232c = (int) (m7201d + (mo888b / 2.0f));
            }
        }
        return f5098b;
    }

    /* renamed from: a */
    public static void m2082a(String str, float f, float f2, Paint paint, Paint paint2, float f3, float f4, float f5, float f6) {
        InterfaceC1027y interfaceC1027y = GameEngine.getInstance().graphics;
        float mo888b = interfaceC1027y.mo888b(str, paint);
        f5100d.m7195a(f, f2, f + mo888b, f2 + interfaceC1027y.mo901a(str, paint));
        f5099c.m7193a(f5100d);
        if (paint.m7223j() == Paint.Align.CENTER) {
            f5099c.m7196a(-(mo888b / 2.0f), 0.0f);
        }
        f5099c.f234a -= f3;
        f5099c.f235b -= f4;
        f5099c.f236c += f5;
        f5099c.f237d += f6;
        interfaceC1027y.mo920a(f5099c, paint2);
        interfaceC1027y.mo903a(str, f5100d.f234a, f5100d.f237d, paint);
    }

    /* renamed from: a */
    public static float m2084a(BitmapOrTexture bitmapOrTexture, float f, float f2) {
        return m2083a(bitmapOrTexture, f, f2, f, f2);
    }

    /* renamed from: a */
    public static float m2083a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, float f4) {
        float f5 = bitmapOrTexture.f6396p;
        float f6 = bitmapOrTexture.f6397q;
        float f7 = 1.0f;
        if (f5 * 1.0f < f) {
            float f8 = f / f5;
            if (f8 > 1.0f) {
                f7 = f8;
            }
        }
        if (f6 * f7 < f2) {
            float f9 = f2 / f6;
            if (f9 > f7) {
                f7 = f9;
            }
        }
        if (f5 * f7 > f3) {
            float f10 = f3 / f5;
            if (f10 < f7) {
                f7 = f10;
            }
        }
        if (f6 * f7 > f4) {
            float f11 = f4 / f6;
            if (f11 < f7) {
                f7 = f11;
            }
        }
        return f7;
    }
}
