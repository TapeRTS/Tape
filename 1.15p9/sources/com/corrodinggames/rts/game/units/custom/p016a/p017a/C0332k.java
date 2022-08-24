package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/k.class */
public class C0332k extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f1994a;

    /* renamed from: b */
    public C0413bn f1995b;

    /* renamed from: a */
    public static void m5507a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m5260a = C0413bn.m5260a(c0453l, c1072ab, str, str2 + "produceUnits");
        if (!m5260a.m5255b()) {
            C0332k c0332k = new C0332k();
            c0332k.f1994a = m5260a;
            c0339d.f2132ab.add(c0332k);
        }
        C0413bn m5260a2 = C0413bn.m5260a(c0453l, c1072ab, str, str2 + "spawnUnits");
        if (!m5260a2.m5255b()) {
            C0332k c0332k2 = new C0332k();
            c0332k2.f1995b = m5260a2;
            c0339d.f2132ab.add(c0332k2);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f1994a != null) {
            C1101m c1101m = new C1101m();
            this.f1994a.m5257a(c1101m, c0451j.team, (Unit) c0451j, false);
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                Unit unit2 = (Unit) it.next();
                c0451j.m5033E(unit2);
                c0451j.m5030F(unit2);
            }
        }
        if (this.f1995b != null) {
            this.f1995b.m5262a(c0451j.f6951ek, c0451j.f6952el, c0451j.height, c0451j.direction, c0451j.team, false, c0451j);
            return true;
        }
        return true;
    }
}
