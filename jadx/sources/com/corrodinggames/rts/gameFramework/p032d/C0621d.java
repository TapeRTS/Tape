package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/d.class */
public class C0621d {

    /* renamed from: a */
    static Rect f4270a = new Rect();

    /* renamed from: b */
    static ArrayList f4271b = new ArrayList();

    /* renamed from: a */
    public static int m1766a(Paint paint) {
        return AbstractC0789l.m638u().f5514bw.mo156a("abcABC123!|", paint) + 4;
    }

    /* renamed from: b */
    public static int m1764b(Paint paint) {
        int a = AbstractC0789l.m638u().f5514bw.mo156a("abcABC123!|", paint);
        if (AbstractC0789l.f5474aI) {
            return a + 2;
        }
        return a;
    }

    /* renamed from: a */
    public static ArrayList m1765a(String str, Rect rect, Paint paint, Paint paint2, boolean z) {
        int lastIndexOf;
        f4271b.clear();
        String str2 = "";
        int i = 0;
        int i2 = 0;
        while (i2 < str.length()) {
            int a = paint2.m4181a((CharSequence) str, i2, str.length(), true, rect.m4134b() - 5, (float[]) null);
            if (a == 0) {
                break;
            }
            int indexOf = str.indexOf("\n", i2 + 1);
            if (indexOf != -1 && indexOf < i2 + a) {
                a = indexOf - i2;
            } else if (!(i2 + a >= str.length() || (lastIndexOf = str.substring(i2, i2 + a).lastIndexOf(" ")) == -1 || lastIndexOf == 0)) {
                a = lastIndexOf;
            }
            String replaceAll = str.substring(i2, i2 + a).replaceAll("(\\n)", "");
            if (replaceAll.length() > str2.length()) {
                str2 = replaceAll;
                i = f4271b.size();
            }
            f4271b.add(replaceAll);
            i2 += a;
        }
        rect.f230d = rect.f228b + (f4271b.size() * m1766a(paint2));
        if (z) {
            float d = rect.m4129d();
            Paint paint3 = paint2;
            if (i == 0) {
                paint3 = paint;
            }
            float b = AbstractC0789l.m638u().f5514bw.mo138b(str2, paint3);
            if (b < rect.m4134b()) {
                rect.f227a = (int) (d - (b / 2.0f));
                rect.f229c = (int) (d + (b / 2.0f));
            }
        }
        return f4271b;
    }
}
