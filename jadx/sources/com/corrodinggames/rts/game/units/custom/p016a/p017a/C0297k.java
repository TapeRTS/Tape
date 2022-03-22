package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0174p;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0376s;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/k.class */
public class C0297k extends AbstractC0286a {

    /* renamed from: a */
    public C0363g f1835a;

    /* renamed from: b */
    public boolean f1836b;

    /* renamed from: c */
    public boolean f1837c;

    /* renamed from: e */
    public EnumC0174p f1839e;

    /* renamed from: f */
    public C0365i f1840f;

    /* renamed from: h */
    public C0363g f1842h;

    /* renamed from: j */
    public C0376s f1844j;

    /* renamed from: k */
    public C0376s f1845k;

    /* renamed from: l */
    public boolean f1846l;

    /* renamed from: m */
    public boolean f1847m;

    /* renamed from: o */
    public static final C0835m f1849o = new C0835m();

    /* renamed from: p */
    public static final C0298l f1850p = new C0298l();

    /* renamed from: d */
    public float f1838d = -1.0f;

    /* renamed from: g */
    public boolean f1841g = true;

    /* renamed from: i */
    public int f1843i = 1;

    /* renamed from: n */
    public boolean f1848n = false;

    /* renamed from: a */
    public static void m3195a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        boolean booleanValue = abVar.m594a(str, str2 + "takeResources_includeUnitsInTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.m594a(str, str2 + "takeResources_includeParent", (Boolean) false).booleanValue();
        float floatValue = abVar.m592a(str, str2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0f)).floatValue();
        C0363g a = C0363g.m2930a(lVar, abVar, str, str2 + "takeResources", true);
        if (booleanValue || booleanValue2 || floatValue >= 0.0f) {
            C0297k kVar = new C0297k();
            cVar.f1920W.add(kVar);
            kVar.f1836b = booleanValue;
            kVar.f1838d = floatValue;
            kVar.f1837c = booleanValue2;
            kVar.f1835a = a;
            kVar.f1848n = abVar.m594a(str, str2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(kVar.f1848n)).booleanValue();
            kVar.f1839e = (EnumC0174p) abVar.m593a(str, "takeResources_includeUnitsWithinRange_team", EnumC0174p.own, EnumC0174p.class);
            kVar.f1840f = abVar.m609a(lVar, str, str2 + "takeResources_excludeUnitsWithoutTags", (C0365i) null);
            if (kVar.f1848n) {
                kVar.f1841g = false;
            }
            kVar.f1841g = abVar.m594a(str, str2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(kVar.f1841g)).booleanValue();
            kVar.f1843i = abVar.m580b(str, str2 + "takeResources_maxUnits", Integer.valueOf(kVar.f1843i)).intValue();
            kVar.f1844j = abVar.m607a(lVar, str, str2 + "takeResources_triggerActionIfAnyCollected", (C0376s) null);
            kVar.f1845k = abVar.m607a(lVar, str, str2 + "takeResources_triggerActionIfNoneCollected", (C0376s) null);
            kVar.f1846l = abVar.m594a(str, str2 + "takeResources_discardCollected", Boolean.valueOf(kVar.f1846l)).booleanValue();
            kVar.f1847m = abVar.m594a(str, str2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(kVar.f1847m)).booleanValue();
            kVar.f1842h = C0363g.m2930a(lVar, abVar, str, str2 + "takeResources_excludeUnitsWithTheseResources", true);
            if (kVar.f1842h != null && kVar.f1842h.m2925b()) {
                kVar.f1842h = null;
            }
            if (!kVar.f1848n) {
                return;
            }
            if (kVar.f1835a.m2914d()) {
                throw new C0324at("[" + str + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
            } else if (kVar.f1841g) {
                throw new C0324at("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
            } else if (kVar.f1847m) {
                throw new C0324at("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
            } else if (kVar.f1846l) {
                throw new C0324at("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
            }
        } else if (a != null && !a.m2925b()) {
            throw new C0324at("[" + str + "]takeResources requires an include (eg: takeResources_includeUnitsInTransport, takeResources_includeUnitsWithinRange)");
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        f1849o.clear();
        if (this.f1836b) {
            Iterator it = kVar.f2462x.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar2 = (AbstractC0210af) it.next();
                if (afVar2 != null && !afVar2.f1459bz) {
                    f1849o.add(afVar2);
                }
            }
        }
        if (this.f1837c) {
            if (kVar.f1502cq != null) {
                f1849o.add(kVar.f1502cq);
            } else if (kVar.f1501cp != null) {
                f1849o.add(kVar.f1502cq);
            }
        }
        if (this.f1838d > 0.0f) {
            f1850p.f1852b = this.f1838d * this.f1838d;
            f1850p.f1851a = this.f1840f;
            f1850p.f1853c = true;
            f1850p.f1854d = this.f1839e;
            f1850p.f1855e = f1849o;
            AbstractC0789l.m638u().f5528bK.m2462a(kVar.f5842dH, kVar.f5843dI, this.f1838d, kVar, 0.0f, f1850p);
        }
        if (this.f1840f != null) {
            for (int size = f1849o.size() - 1; size >= 0; size--) {
                if (!C0364h.m2904a(this.f1840f, ((AbstractC0210af) f1849o.get(size)).mo2846cM())) {
                    f1849o.remove(size);
                }
            }
        }
        if (this.f1841g) {
            for (int size2 = f1849o.size() - 1; size2 >= 0; size2--) {
                if (!this.f1835a.m2921b((AbstractC0210af) f1849o.get(size2), false)) {
                    f1849o.remove(size2);
                }
            }
        }
        if (this.f1842h != null) {
            for (int size3 = f1849o.size() - 1; size3 >= 0; size3--) {
                if (this.f1842h.m2921b((AbstractC0210af) f1849o.get(size3), false)) {
                    f1849o.remove(size3);
                }
            }
        }
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < f1849o.size(); i3++) {
            AbstractC0210af afVar3 = (AbstractC0210af) f1849o.get(i3);
            if (!this.f1848n) {
                if (!this.f1847m) {
                    this.f1835a.m2915c(afVar3, false);
                }
                if (!this.f1846l) {
                    this.f1835a.m2909f(kVar);
                }
            } else if (!this.f1835a.m2936a(afVar3, kVar)) {
                continue;
            }
            z = true;
            i2++;
            if (i2 >= this.f1843i) {
                break;
            }
        }
        if (z) {
            if (this.f1844j != null) {
                this.f1844j.m2721a(kVar, pointF, afVar, i + 1);
            }
        } else if (this.f1845k != null) {
            this.f1845k.m2721a(kVar, pointF, afVar, i + 1);
        }
        f1849o.clear();
        return true;
    }
}
