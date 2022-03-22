package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/i.class */
public class C0295i extends AbstractC0286a {

    /* renamed from: a */
    public C0325au f1828a;

    /* renamed from: b */
    public C0325au f1829b;

    /* renamed from: a */
    public static void m3197a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0325au a = C0325au.m3068a(lVar, abVar, str, str2 + "produceUnits");
        if (!a.m3063b()) {
            C0295i iVar = new C0295i();
            iVar.f1828a = a;
            cVar.f1920W.add(iVar);
        }
        C0325au a2 = C0325au.m3068a(lVar, abVar, str, str2 + "spawnUnits");
        if (!a2.m3063b()) {
            C0295i iVar2 = new C0295i();
            iVar2.f1829b = a2;
            cVar.f1920W.add(iVar2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1828a != null) {
            C0835m mVar = new C0835m();
            this.f1828a.m3065a(mVar, kVar.f1461bB, (AbstractC0210af) kVar, false);
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar2 = (AbstractC0210af) it.next();
                kVar.m2889A(afVar2);
                kVar.m2888B(afVar2);
            }
        }
        if (this.f1829b == null) {
            return true;
        }
        this.f1829b.m3070a(kVar.f5842dH, kVar.f5843dI, kVar.f5844dJ, kVar.f1471bL, kVar.f1461bB, false, kVar);
        return true;
    }
}
