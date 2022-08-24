package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p042j.C0904i;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;

/* renamed from: com.corrodinggames.rts.game.units.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aq.class */
public final class C0248aq {

    /* renamed from: a */
    public static final Paint f1724a = new Paint();

    /* renamed from: b */
    static final Point f1725b = new Point();

    /* renamed from: c */
    static final Rect f1726c = new Rect();

    /* renamed from: d */
    static final PointF f1727d = new PointF();

    /* renamed from: e */
    static final PointF f1728e = new PointF();

    /* renamed from: f */
    static final PointF f1729f = new PointF();

    /* renamed from: g */
    static final PointF f1730g = new PointF();

    /* renamed from: h */
    static final PointF f1731h = new PointF();

    /* renamed from: i */
    static final PointF f1732i = new PointF();

    /* renamed from: j */
    static final PointF f1733j = new PointF();

    /* renamed from: a */
    private static Point m5742a(EnumC0246ao enumC0246ao, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C0907l c0907l = GameEngine.getInstance().f6113bU;
        C0904i m1314a = c0907l.m1314a(enumC0246ao);
        int m2279d = CommonUtils.m2279d(i3 - i);
        int m2279d2 = CommonUtils.m2279d(i4 - i2);
        int i8 = i;
        int i9 = i2;
        int i10 = 1 + m2279d + m2279d2;
        int i11 = i3 > i ? 1 : -1;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = m2279d - m2279d2;
        int i14 = m2279d * 2;
        int i15 = m2279d2 * 2;
        int i16 = 0;
        while (i10 > 0) {
            int i17 = i8;
            int i18 = i9;
            if (i6 != 0 && c0907l.m1295c(m1314a, i17, i18) < i6) {
                f1725b.m7217a(i17, i18);
                return f1725b;
            }
            if (i5 != 0) {
                int m1299b = c0907l.m1299b(m1314a, i17, i18);
                if (m1299b == -1) {
                    f1725b.m7217a(i17, i18);
                    return f1725b;
                }
                if (i7 > 0) {
                    i7--;
                } else {
                    i16 += m1299b;
                }
                if (i16 >= i5) {
                    f1725b.m7217a(i17, i18);
                    return f1725b;
                }
            } else if (c0907l.m1311a(m1314a, i17, i18)) {
                f1725b.m7217a(i17, i18);
                return f1725b;
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
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m5744a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6113bU.m1309a(gameEngine.f6113bU.m1314a(enumC0246ao), true);
        return m5740b(enumC0246ao, f, f2, f3, f4, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m5740b(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        c0173b.m6652a(f, f2);
        int i4 = c0173b.f800T;
        int i5 = c0173b.f801U;
        c0173b.m6652a(f3, f4);
        return m5742a(enumC0246ao, i4, i5, c0173b.f800T, c0173b.f801U, i, i2, i3) == null;
    }

    /* renamed from: a */
    public static PointF m5743a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C0907l c0907l = GameEngine.getInstance().f6113bU;
        f1726c.m7208a(i, i2, i + 1, i2 + 1);
        f1727d.m7213a(f, f2);
        f1728e.m7213a(f3, f4);
        f1729f.m7212a(f1728e);
        boolean z2 = true;
        f1730g.m7213a(f1726c.f230a, f1726c.f233d);
        f1731h.m7213a(f1726c.f232c, f1726c.f231b);
        f1732i.m7213a(f1726c.f230a, f1726c.f231b);
        f1733j.m7213a(f1726c.f232c, f1726c.f233d);
        if (f1727d.y < f1728e.y) {
            if ((z || !c0907l.m1313a(enumC0246ao, i, i2 - 1)) && CommonUtils.m2354a(f1727d, f1728e, f1732i, f1731h)) {
                z2 = true;
            }
        } else {
            if ((z || !c0907l.m1313a(enumC0246ao, i, i2 + 1)) && CommonUtils.m2354a(f1727d, f1728e, f1730g, f1733j)) {
                z2 = true;
            }
        }
        if (f1727d.x < f1728e.x) {
            if ((z || !c0907l.m1313a(enumC0246ao, i - 1, i2)) && CommonUtils.m2354a(f1727d, f1728e, f1732i, f1730g)) {
                z2 = true;
            }
        } else {
            if ((z || !c0907l.m1313a(enumC0246ao, i + 1, i2)) && CommonUtils.m2354a(f1727d, f1728e, f1731h, f1733j)) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        if (!z2) {
            f1729f.x = i + 1 + 0.01f;
        }
        if (z2) {
            f1729f.x = i - 0.01f;
        }
        if (z2) {
            f1729f.y = i2 + 1 + 0.01f;
        }
        if (z2) {
            f1729f.y = i2 - 0.01f;
        }
        return f1729f;
    }

    /* renamed from: a */
    public static boolean m5741a(AbstractC0623y abstractC0623y, Unit unit) {
        if (unit.f1650cL != null || !abstractC0623y.m3043k(unit) || !unit.m5793d((Unit) abstractC0623y)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m5739b(AbstractC0623y abstractC0623y, Unit unit) {
        if (!m5741a(abstractC0623y, unit) || !abstractC0623y.m3054h(unit) || !abstractC0623y.m3050i(unit)) {
            return false;
        }
        return true;
    }
}
