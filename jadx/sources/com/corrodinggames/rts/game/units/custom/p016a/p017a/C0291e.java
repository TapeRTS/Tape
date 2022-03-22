package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class C0291e extends AbstractC0286a {

    /* renamed from: a */
    public C0325au f1800a;

    /* renamed from: b */
    public ArrayList f1801b;

    /* renamed from: c */
    public int f1802c;

    /* renamed from: d */
    public boolean f1803d;

    /* renamed from: e */
    public boolean f1804e;

    /* renamed from: f */
    public boolean f1805f;

    /* renamed from: a */
    public static void m3203a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0325au a = C0325au.m3068a(lVar, abVar, str, str2 + "attachments_addNewUnits");
        int intValue = abVar.m580b(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = abVar.m594a(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.m594a(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = abVar.m594a(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!a.m3063b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            C0291e eVar = new C0291e();
            eVar.f1800a = a;
            String b = abVar.m579b(str, "attachments_onlyOnSlots", (String) null);
            if (b != null) {
                for (String str4 : b.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals("")) {
                        C0336i g = lVar.m2757g(trim);
                        if (eVar.f1801b == null) {
                            eVar.f1801b = new ArrayList();
                        }
                        if (g == null) {
                            throw new C0324at("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        eVar.f1801b.add(g);
                    }
                }
            }
            eVar.f1802c = intValue;
            eVar.f1805f = booleanValue3;
            eVar.f1803d = booleanValue;
            eVar.f1804e = booleanValue2;
            cVar.f1920W.add(eVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if ((this.f1803d || this.f1804e) && kVar.f2463y != null && kVar.f2463y.size() > 0) {
            int size = kVar.f2463y.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                AbstractC0210af afVar2 = (AbstractC0210af) kVar.f2463y.get(size);
                if (afVar2 != null) {
                    if (this.f1801b != null) {
                        boolean z = false;
                        Iterator it = this.f1801b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C0336i) it.next()).m3037a() == size) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(afVar2 instanceof AbstractC0515r)) {
                        AbstractC0789l.m670d("Failed to deattach unit:" + afVar2.mo1606r().mo2754i() + " is not an OrderableUnit");
                    } else {
                        AbstractC0515r rVar = (AbstractC0515r) afVar2;
                        if (this.f1804e) {
                            kVar.m2876a((AbstractC0210af) rVar, true, kVar.f2462x.size() % 2 == 0);
                        } else {
                            rVar.m2193bs();
                        }
                    }
                }
                size--;
            }
        }
        if (this.f1802c != 0) {
            for (int i2 = 0; i2 < this.f1802c; i2++) {
                if (kVar.f2463y != null && kVar.f2463y.size() > 0) {
                    for (int size2 = kVar.f2463y.size() - 1; size2 >= 0; size2--) {
                        AbstractC0210af afVar3 = (AbstractC0210af) kVar.f2463y.get(size2);
                        if (afVar3 != null) {
                            if (this.f1801b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.f1801b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C0336i) it2.next()).m3037a() == size2) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            afVar3.m3319bU();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f1800a != null) {
            C0835m mVar = new C0835m();
            this.f1800a.m3065a(mVar, kVar.f1461bB, (AbstractC0210af) kVar, true);
            Iterator it3 = mVar.iterator();
            while (it3.hasNext()) {
                AbstractC0210af afVar4 = (AbstractC0210af) it3.next();
                boolean z3 = false;
                if (!(afVar4 instanceof AbstractC0515r)) {
                    AbstractC0789l.m670d("Failed to attach unit:" + afVar4.mo1606r().mo2754i() + " is not an OrderableUnit");
                } else {
                    AbstractC0515r rVar2 = (AbstractC0515r) afVar4;
                    if (this.f1801b != null) {
                        Iterator it4 = this.f1801b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C0336i iVar = (C0336i) it4.next();
                            if (kVar.m2871a(iVar) == null && kVar.mo2289a(rVar2, iVar)) {
                                rVar2.f1504cs = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = kVar.f2460v.f2550ap.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C0336i iVar2 = (C0336i) it5.next();
                            if (kVar.m2871a(iVar2) == null && kVar.mo2289a(rVar2, iVar2)) {
                                rVar2.f1504cs = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        rVar2.mo405a();
                    }
                }
            }
        }
        if (!this.f1805f) {
            return true;
        }
        if (kVar.f1502cq != null) {
            kVar.m2193bs();
        }
        if (kVar.f1501cp == null) {
            return true;
        }
        if (kVar.f1501cp instanceof AbstractC0208ad) {
            ((AbstractC0208ad) kVar.f1501cp).mo2496e(kVar);
            return true;
        }
        AbstractC0789l.m663f("transportedBy is not a TransportInterface");
        kVar.f1501cp = null;
        return true;
    }
}
