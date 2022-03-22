package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class C0293g extends AbstractC0286a {

    /* renamed from: a */
    C0345a f1813a;

    /* renamed from: b */
    C0345a f1814b;

    /* renamed from: c */
    double f1815c;

    /* renamed from: d */
    double f1816d;

    /* renamed from: e */
    float f1817e;

    /* renamed from: a */
    public static void m3199a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0345a a = abVar.m610a(lVar, str, "convertResource_from", null, true);
        C0345a a2 = abVar.m610a(lVar, str, "convertResource_to", null, true);
        if (!(a == null && a2 == null) && (a == null || a2 == null)) {
            throw new C0324at("[" + str + "] Both convertResource_from and convertResource_to are required together");
        } else if (a != null && a2 != null) {
            C0293g gVar = new C0293g();
            gVar.f1813a = a;
            gVar.f1814b = a2;
            gVar.f1815c = abVar.m600a(str, "convertResource_minAmount", 0.0d);
            gVar.f1816d = abVar.m558i(str, "convertResource_maxAmount");
            if (gVar.f1815c < 0.0d) {
                throw new C0324at("[" + str + "] convertResource_minAmount cannot be < 0");
            } else if (gVar.f1816d < 0.0d) {
                throw new C0324at("[" + str + "] convertResource_maxAmount cannot be < 0");
            } else if (gVar.f1816d < gVar.f1815c) {
                throw new C0324at("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            } else {
                gVar.f1817e = abVar.m592a(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
                cVar.f1920W.add(gVar);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        double a = this.f1813a.mo3007a(kVar);
        if (a <= this.f1815c) {
            return true;
        }
        double a2 = C0654f.m1525a(a, this.f1816d);
        this.f1813a.mo3005b(kVar, -a2);
        this.f1814b.mo3005b(kVar, a2 * this.f1817e);
        return true;
    }
}
