package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p037h.C0731e;
import com.corrodinggames.rts.gameFramework.p037h.C0734h;

/* renamed from: com.corrodinggames.rts.game.units.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aj.class */
public final class C0214aj {

    /* renamed from: a */
    public static final Paint f1574a = new Paint();

    /* renamed from: b */
    static final Point f1575b = new Point();

    /* renamed from: c */
    static final Rect f1576c = new Rect();

    /* renamed from: d */
    static final PointF f1577d = new PointF();

    /* renamed from: e */
    static final PointF f1578e = new PointF();

    /* renamed from: f */
    static final PointF f1579f = new PointF();

    /* renamed from: g */
    static final PointF f1580g = new PointF();

    /* renamed from: h */
    static final PointF f1581h = new PointF();

    /* renamed from: i */
    static final PointF f1582i = new PointF();

    /* renamed from: j */
    static final PointF f1583j = new PointF();

    /* renamed from: a */
    private static Point m3281a(EnumC0212ah ahVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C0734h hVar = AbstractC0789l.m638u().f5520bC;
        C0731e a = hVar.m959a(ahVar);
        int c = C0654f.m1455c(i3 - i);
        int c2 = C0654f.m1455c(i4 - i2);
        int i8 = i;
        int i9 = i2;
        int i10 = 1 + c + c2;
        int i11 = i3 > i ? 1 : -1;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = c - c2;
        int i14 = c * 2;
        int i15 = c2 * 2;
        int i16 = 0;
        while (i10 > 0) {
            if (i6 == 0 || hVar.m940c(a, i8, i9) >= i6) {
                if (i5 != 0) {
                    int b = hVar.m944b(a, i8, i9);
                    if (b == -1) {
                        f1575b.m4145a(i8, i9);
                        return f1575b;
                    }
                    if (i7 > 0) {
                        i7--;
                    } else {
                        i16 += b;
                    }
                    if (i16 >= i5) {
                        f1575b.m4145a(i8, i9);
                        return f1575b;
                    }
                } else if (hVar.m956a(a, i8, i9)) {
                    f1575b.m4145a(i8, i9);
                    return f1575b;
                }
                if (i13 > 0) {
                    i8 += i11;
                    i13 -= i15;
                } else if (i13 < 0) {
                    i9 += i12;
                    i13 += i14;
                } else if (i13 == 0) {
                    i8 += i11;
                    i9 += i12;
                    i13 = (i13 - i15) + i14;
                    i10--;
                }
                i10--;
            } else {
                f1575b.m4145a(i8, i9);
                return f1575b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3283a(EnumC0212ah ahVar, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5520bC.m954a(u.f5520bC.m959a(ahVar), true);
        return m3279b(ahVar, f, f2, f3, f4, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m3279b(EnumC0212ah ahVar, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        bVar.m3703a(f, f2);
        int i4 = bVar.f764M;
        int i5 = bVar.f765N;
        bVar.m3703a(f3, f4);
        return m3281a(ahVar, i4, i5, bVar.f764M, bVar.f765N, i, i2, i3) == null;
    }

    /* renamed from: a */
    public static PointF m3282a(EnumC0212ah ahVar, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C0734h hVar = AbstractC0789l.m638u().f5520bC;
        f1576c.m4136a(i, i2, i + 1, i2 + 1);
        f1577d.m4141a(f, f2);
        f1578e.m4141a(f3, f4);
        f1579f.m4140a(f1578e);
        char c = 65535;
        f1580g.m4141a(f1576c.f227a, f1576c.f230d);
        f1581h.m4141a(f1576c.f229c, f1576c.f228b);
        f1582i.m4141a(f1576c.f227a, f1576c.f228b);
        f1583j.m4141a(f1576c.f229c, f1576c.f230d);
        if (f1577d.f225b < f1578e.f225b) {
            if ((z || !hVar.m958a(ahVar, i, i2 - 1)) && C0654f.m1508a(f1577d, f1578e, f1582i, f1581h)) {
                c = 3;
            }
        } else {
            if ((z || !hVar.m958a(ahVar, i, i2 + 1)) && C0654f.m1508a(f1577d, f1578e, f1580g, f1583j)) {
                c = 1;
            }
        }
        if (f1577d.f224a < f1578e.f224a) {
            if ((z || !hVar.m958a(ahVar, i - 1, i2)) && C0654f.m1508a(f1577d, f1578e, f1582i, f1580g)) {
                c = 2;
            }
        } else {
            if ((z || !hVar.m958a(ahVar, i + 1, i2)) && C0654f.m1508a(f1577d, f1578e, f1581h, f1583j)) {
                c = 0;
            }
        }
        if (c == 65535) {
            return null;
        }
        if (c == 0) {
            f1579f.f224a = i + 1 + 0.01f;
        }
        if (c == 2) {
            f1579f.f224a = i - 0.01f;
        }
        if (c == 1) {
            f1579f.f225b = i2 + 1 + 0.01f;
        }
        if (c == 3) {
            f1579f.f225b = i2 - 0.01f;
        }
        return f1579f;
    }

    /* renamed from: a */
    public static boolean m3280a(AbstractC0515r rVar, AbstractC0210af afVar) {
        if (afVar.f1501cp == null && rVar.mo2168h(afVar) && afVar.mo2360d((AbstractC0210af) rVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3278b(AbstractC0515r rVar, AbstractC0210af afVar) {
        if (m3280a(rVar, afVar) && rVar.m2253a_(afVar) && rVar.m2176f(afVar)) {
            return true;
        }
        return false;
    }
}
