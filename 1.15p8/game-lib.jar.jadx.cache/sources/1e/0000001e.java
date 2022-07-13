package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.path.C0822i;
import com.corrodinggames.rts.gameFramework.path.PathEngine;

/* renamed from: com.corrodinggames.rts.game.units.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ak.class */
public final class C0236ak {

    /* renamed from: a */
    public static final Paint f1665a = new Paint();

    /* renamed from: b */
    static final Point f1666b = new Point();

    /* renamed from: c */
    static final Rect f1667c = new Rect();

    /* renamed from: d */
    static final PointF f1668d = new PointF();

    /* renamed from: e */
    static final PointF f1669e = new PointF();

    /* renamed from: f */
    static final PointF f1670f = new PointF();

    /* renamed from: g */
    static final PointF f1671g = new PointF();

    /* renamed from: h */
    static final PointF f1672h = new PointF();

    /* renamed from: i */
    static final PointF f1673i = new PointF();

    /* renamed from: j */
    static final PointF f1674j = new PointF();

    /* renamed from: a */
    private static Point m3717a(MovementType movementType, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        PathEngine pathEngine = GameEngine.getInstance().PathEngine;
        C0822i m1104a = pathEngine.m1104a(movementType);
        int absi = CommonUtils.absi(i3 - i);
        int absi2 = CommonUtils.absi(i4 - i2);
        int i8 = i;
        int i9 = i2;
        int i10 = 1 + absi + absi2;
        int i11 = i3 > i ? 1 : -1;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = absi - absi2;
        int i14 = absi * 2;
        int i15 = absi2 * 2;
        int i16 = 0;
        while (i10 > 0) {
            int i17 = i8;
            int i18 = i9;
            if (i6 != 0 && pathEngine.m1085c(m1104a, i17, i18) < i6) {
                f1666b.m4674a(i17, i18);
                return f1666b;
            }
            if (i5 != 0) {
                int m1089b = pathEngine.m1089b(m1104a, i17, i18);
                if (m1089b == -1) {
                    f1666b.m4674a(i17, i18);
                    return f1666b;
                }
                if (i7 > 0) {
                    i7--;
                } else {
                    i16 += m1089b;
                }
                if (i16 >= i5) {
                    f1666b.m4674a(i17, i18);
                    return f1666b;
                }
            } else if (pathEngine.m1101a(m1104a, i17, i18)) {
                f1666b.m4674a(i17, i18);
                return f1666b;
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
    public static boolean m3719a(MovementType movementType, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.PathEngine.m1099a(gameEngine.PathEngine.m1104a(movementType), true);
        return m3715b(movementType, f, f2, f3, f4, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m3715b(MovementType movementType, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        Map map = GameEngine.getInstance().map;
        map.m4168a(f, f2);
        int i4 = map.returnX;
        int i5 = map.returnY;
        map.m4168a(f3, f4);
        return m3717a(movementType, i4, i5, map.returnX, map.returnY, i, i2, i3) == null;
    }

    /* renamed from: a */
    public static PointF m3718a(MovementType movementType, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        PathEngine pathEngine = GameEngine.getInstance().PathEngine;
        f1667c.set(i, i2, i + 1, i2 + 1);
        f1668d.set(f, f2);
        f1669e.set(f3, f4);
        f1670f.m4669a(f1669e);
        boolean z2 = true;
        f1671g.set(f1667c.left, f1667c.bottom);
        f1672h.set(f1667c.right, f1667c.top);
        f1673i.set(f1667c.left, f1667c.top);
        f1674j.set(f1667c.right, f1667c.bottom);
        if (f1668d.y < f1669e.y) {
            if ((z || !pathEngine.m1103a(movementType, i, i2 - 1)) && CommonUtils.m1731a(f1668d, f1669e, f1673i, f1672h)) {
                z2 = true;
            }
        } else {
            if ((z || !pathEngine.m1103a(movementType, i, i2 + 1)) && CommonUtils.m1731a(f1668d, f1669e, f1671g, f1674j)) {
                z2 = true;
            }
        }
        if (f1668d.x < f1669e.x) {
            if ((z || !pathEngine.m1103a(movementType, i - 1, i2)) && CommonUtils.m1731a(f1668d, f1669e, f1673i, f1671g)) {
                z2 = true;
            }
        } else {
            if ((z || !pathEngine.m1103a(movementType, i + 1, i2)) && CommonUtils.m1731a(f1668d, f1669e, f1672h, f1674j)) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        if (!z2) {
            f1670f.x = i + 1 + 0.01f;
        }
        if (z2) {
            f1670f.x = i - 0.01f;
        }
        if (z2) {
            f1670f.y = i2 + 1 + 0.01f;
        }
        if (z2) {
            f1670f.y = i2 - 0.01f;
        }
        return f1670f;
    }

    /* renamed from: a */
    public static boolean m3716a(OrderableUnit orderableUnit, Unit unit) {
        if (unit.transportedBy != null || !orderableUnit.mo2461k(unit) || !unit.mo2679d((Unit) orderableUnit)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3714b(OrderableUnit orderableUnit, Unit unit) {
        if (!m3716a(orderableUnit, unit) || !orderableUnit.m2472h(unit) || !orderableUnit.m2468i(unit)) {
            return false;
        }
        return true;
    }
}