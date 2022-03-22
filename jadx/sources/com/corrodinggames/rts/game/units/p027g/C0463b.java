package com.corrodinggames.rts.game.units.p027g;

import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/b.class */
public final class C0463b {
    /* renamed from: a */
    public static void m2443a(AbstractC0515r rVar, float f) {
        C0835m mVar = rVar.f3493bb;
        if (mVar != null) {
            int i = AbstractC0789l.m638u().f5499bh;
            Object[] a = mVar.m490a();
            for (int i2 = mVar.f5778a - 1; i2 >= 0; i2--) {
                AbstractC0462a aVar = (AbstractC0462a) a[i2];
                if (aVar.f3288a <= i) {
                    mVar.remove(i2);
                } else {
                    aVar.m2444a(rVar, f);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2442a(AbstractC0515r rVar, AbstractC0462a aVar) {
        if (rVar.f3493bb == null) {
            rVar.f3493bb = new C0835m();
        }
        if (rVar.f3493bb.size() > 1000) {
            rVar.m2282a("status effect limit reached");
        } else {
            rVar.f3493bb.add(aVar);
        }
    }
}
