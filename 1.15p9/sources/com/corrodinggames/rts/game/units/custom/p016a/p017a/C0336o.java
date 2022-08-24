package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/o.class */
public class C0336o extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f2026a;

    /* renamed from: b */
    public int f2027b;

    /* renamed from: c */
    public C0449h f2028c;

    /* renamed from: d */
    public boolean f2029d;

    /* renamed from: e */
    public boolean f2030e;

    /* renamed from: f */
    public int f2031f = -1;

    /* renamed from: a */
    public static void m5501a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m5260a = C0413bn.m5260a(c0453l, c1072ab, str, str2 + "addUnitsIntoTransport");
        int intValue = c1072ab.m682b(str, str2 + "deleteNumUnitsFromTransport", (Integer) 0).intValue();
        C0449h m5057a = C0448g.m5057a(c1072ab.m681b(str, "deleteNumUnitsFromTransport_onlyWithTags", (String) null), (C0449h) null);
        boolean booleanValue = c1072ab.m700a(str, str2 + "startUnloadingTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "forceUnloadTransportNow", (Boolean) false).booleanValue();
        int intValue2 = c1072ab.m682b(str, str2 + "forceUnloadTransportNow_onlyOnSlot", (Integer) (-1)).intValue();
        if (intValue2 != -1 && !booleanValue2) {
            throw new C0412bm("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
        }
        if (!m5260a.m5255b() || intValue > 0 || booleanValue || booleanValue2) {
            C0336o c0336o = new C0336o();
            if (!m5260a.m5255b()) {
                c0336o.f2026a = m5260a;
            }
            if (intValue > 0) {
                c0336o.f2027b = intValue;
                c0336o.f2028c = m5057a;
            }
            c0336o.f2029d = booleanValue;
            c0336o.f2030e = booleanValue2;
            c0336o.f2031f = intValue2;
            c0339d.f2132ab.add(c0336o);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f2027b != 0) {
            for (int i2 = 0; i2 < this.f2027b; i2++) {
                if (c0451j.f2865A.size() > 0) {
                    for (int size = c0451j.f2865A.size() - 1; size >= 0; size--) {
                        Unit unit2 = (Unit) c0451j.f2865A.get(size);
                        if (unit2 == null) {
                            GameEngine.m1145b("deleteNumUnitsFromTransport unit==null");
                        } else if (this.f2028c == null || C0448g.m5061a(this.f2028c, unit2.m5787dc())) {
                            c0451j.f2865A.remove(size);
                            c0451j.m5036D(unit2);
                            if (unit2 != null) {
                                unit2.m5812ch();
                            }
                        }
                    }
                }
            }
        }
        if (this.f2026a != null) {
            C1101m c1101m = new C1101m();
            this.f2026a.m5257a(c1101m, c0451j.team, (Unit) c0451j, false);
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                Unit unit3 = (Unit) it.next();
                unit3.f6951ek = c0451j.f6951ek;
                unit3.f6952el = c0451j.f6952el;
                unit3.height = c0451j.height;
                c0451j.m5039C(unit3);
            }
        }
        if (this.f2029d) {
            c0451j.m5020L();
        }
        if (this.f2030e) {
            for (int size2 = c0451j.f2865A.size() - 1; size2 >= 0; size2--) {
                if (this.f2031f == -1 || this.f2031f == size2) {
                    c0451j.m4993a((Unit) c0451j.f2865A.get(size2), true, c0451j.f2865A.size() % 2 == 0);
                }
            }
            return true;
        }
        return true;
    }
}
