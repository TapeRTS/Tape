package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/m.class */
public class C0299m extends AbstractC0286a {

    /* renamed from: a */
    public C0325au f1856a;

    /* renamed from: b */
    public int f1857b;

    /* renamed from: c */
    public C0365i f1858c;

    /* renamed from: d */
    public boolean f1859d;

    /* renamed from: e */
    public boolean f1860e;

    /* renamed from: f */
    public int f1861f = -1;

    /* renamed from: a */
    public static void m3193a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0325au a = C0325au.m3068a(lVar, abVar, str, str2 + "addUnitsIntoTransport");
        int intValue = abVar.m580b(str, str2 + "deleteNumUnitsFromTransport", (Integer) 0).intValue();
        C0365i a2 = C0364h.m2900a(abVar.m579b(str, "deleteNumUnitsFromTransport_onlyWithTags", (String) null), (C0365i) null);
        boolean booleanValue = abVar.m594a(str, str2 + "startUnloadingTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.m594a(str, str2 + "forceUnloadTransportNow", (Boolean) false).booleanValue();
        int intValue2 = abVar.m580b(str, str2 + "forceUnloadTransportNow_onlyOnSlot", (Integer) (-1)).intValue();
        if (intValue2 != -1 && !booleanValue2) {
            throw new C0324at("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
        } else if (!a.m3063b() || intValue > 0 || booleanValue || booleanValue2) {
            C0299m mVar = new C0299m();
            if (!a.m3063b()) {
                mVar.f1856a = a;
            }
            if (intValue > 0) {
                mVar.f1857b = intValue;
                mVar.f1858c = a2;
            }
            mVar.f1859d = booleanValue;
            mVar.f1860e = booleanValue2;
            mVar.f1861f = intValue2;
            cVar.f1920W.add(mVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1857b != 0) {
            for (int i2 = 0; i2 < this.f1857b; i2++) {
                if (kVar.f2462x.size() > 0) {
                    for (int size = kVar.f2462x.size() - 1; size >= 0; size--) {
                        AbstractC0210af afVar2 = (AbstractC0210af) kVar.f2462x.get(size);
                        if (afVar2 == null) {
                            AbstractC0789l.m682b("deleteNumUnitsFromTransport unit==null");
                        } else if (this.f1858c == null || C0364h.m2904a(this.f1858c, afVar2.mo2846cM())) {
                            kVar.f2462x.remove(size);
                            kVar.m2804z(afVar2);
                            if (afVar2 != null) {
                                afVar2.m3319bU();
                            }
                        }
                    }
                }
            }
        }
        if (this.f1856a != null) {
            C0835m mVar = new C0835m();
            this.f1856a.m3065a(mVar, kVar.f1461bB, (AbstractC0210af) kVar, false);
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar3 = (AbstractC0210af) it.next();
                afVar3.f5842dH = kVar.f5842dH;
                afVar3.f5843dI = kVar.f5843dI;
                afVar3.f5844dJ = kVar.f5844dJ;
                kVar.m2805y(afVar3);
            }
        }
        if (this.f1859d) {
            kVar.m2884L();
        }
        if (!this.f1860e) {
            return true;
        }
        for (int size2 = kVar.f2462x.size() - 1; size2 >= 0; size2--) {
            if (this.f1861f == -1 || this.f1861f == size2) {
                kVar.m2876a((AbstractC0210af) kVar.f2462x.get(size2), true, kVar.f2462x.size() % 2 == 0);
            }
        }
        return true;
    }
}
