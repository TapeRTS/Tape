package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class C0328g extends AbstractC0321a {

    /* renamed from: a */
    C0428a f1967a;

    /* renamed from: b */
    C0428a f1968b;

    /* renamed from: c */
    double f1969c;

    /* renamed from: d */
    double f1970d;

    /* renamed from: e */
    float f1971e;

    /* renamed from: a */
    public static void m5515a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0428a m721a = c1072ab.m721a(c0453l, str, "convertResource_from", (C0428a) null, true);
        C0428a m721a2 = c1072ab.m721a(c0453l, str, "convertResource_to", (C0428a) null, true);
        if ((m721a != null || m721a2 != null) && (m721a == null || m721a2 == null)) {
            throw new C0412bm("[" + str + "] Both convertResource_from and convertResource_to are required together");
        }
        if (m721a != null && m721a2 != null) {
            C0328g c0328g = new C0328g();
            c0328g.f1967a = m721a;
            c0328g.f1968b = m721a2;
            c0328g.f1969c = c1072ab.m706a(str, "convertResource_minAmount", 0.0d);
            c0328g.f1970d = c1072ab.m656j(str, "convertResource_maxAmount");
            if (c0328g.f1969c < 0.0d) {
                throw new C0412bm("[" + str + "] convertResource_minAmount cannot be < 0");
            }
            if (c0328g.f1970d < 0.0d) {
                throw new C0412bm("[" + str + "] convertResource_maxAmount cannot be < 0");
            }
            if (c0328g.f1970d < c0328g.f1969c) {
                throw new C0412bm("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            }
            c0328g.f1971e = c1072ab.m698a(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2132ab.add(c0328g);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        double mo5140a = this.f1967a.mo5140a(c0451j);
        if (mo5140a > this.f1969c) {
            double m2371a = CommonUtils.m2371a(mo5140a, this.f1970d);
            this.f1967a.mo5138b(c0451j, -m2371a);
            this.f1968b.mo5138b(c0451j, m2371a * this.f1971e);
            return true;
        }
        return true;
    }
}
