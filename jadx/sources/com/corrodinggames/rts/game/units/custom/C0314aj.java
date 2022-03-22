package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aj.class */
public final class C0314aj {

    /* renamed from: a */
    C0835m f2058a = new C0835m();

    /* renamed from: b */
    C0835m f2059b = new C0835m();

    /* renamed from: c */
    boolean f2060c;

    /* renamed from: d */
    boolean f2061d;

    /* renamed from: e */
    public static final C0315ak f2062e = new C0315ak();

    /* renamed from: a */
    public static C0314aj m3098a(C0368l lVar, C0809ab abVar) {
        C0314aj ajVar = new C0314aj();
        ajVar.m3094b(lVar, abVar);
        if (ajVar.f2059b.size() == 0) {
            return null;
        }
        Iterator it = ajVar.f2058a.iterator();
        while (it.hasNext()) {
            C0364h hVar = (C0364h) it.next();
            if (hVar != null) {
                int i = 0;
                C0316al alVar = null;
                Iterator it2 = ajVar.f2059b.iterator();
                while (it2.hasNext()) {
                    C0316al alVar2 = (C0316al) it2.next();
                    if (alVar2.f2068b == hVar) {
                        i++;
                        alVar = alVar2;
                    }
                }
                if (i == 1) {
                    lVar.m2741o("[placementRule_" + alVar.f2067a + "]anyRuleInGroup: No other rule with this same group name found");
                }
            }
        }
        return ajVar;
    }

    /* renamed from: b */
    public void m3094b(C0368l lVar, C0809ab abVar) {
        Iterator it = abVar.m569e("placementRule_").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.substring("placementRule_".length());
            C0316al alVar = new C0316al();
            alVar.f2067a = substring;
            alVar.m3091a(lVar, abVar, str);
            if (alVar.m3092a()) {
                if (!this.f2058a.contains(alVar.f2068b)) {
                    this.f2058a.add(alVar.f2068b);
                }
                if (alVar.f2080n) {
                    if (!alVar.f2082p) {
                        this.f2060c = true;
                    } else {
                        this.f2061d = true;
                    }
                }
                this.f2059b.add(alVar);
            }
        }
    }

    /* renamed from: a */
    public String m3097a(AbstractC0515r rVar, float f, float f2) {
        if (!this.f2060c) {
            return null;
        }
        return m3093b(rVar, f, f2);
    }

    /* renamed from: a */
    public String m3096a(AbstractC0515r rVar, int i, int i2) {
        if (!this.f2061d) {
            return null;
        }
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        bVar.m3667b(i, i2);
        return m3093b(rVar, bVar.f764M, bVar.f765N);
    }

    /* renamed from: b */
    public String m3093b(AbstractC0515r rVar, float f, float f2) {
        boolean z;
        Iterator it = this.f2058a.iterator();
        while (it.hasNext()) {
            C0364h hVar = (C0364h) it.next();
            boolean z2 = false;
            boolean z3 = false;
            C0316al alVar = null;
            Iterator it2 = this.f2059b.iterator();
            while (it2.hasNext()) {
                C0316al alVar2 = (C0316al) it2.next();
                if (alVar2.f2068b == hVar && alVar2.f2080n) {
                    if (!m3095a(rVar, alVar2, f, f2)) {
                        if (alVar == null) {
                            alVar = alVar2;
                        }
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (hVar == null) {
                z = !z3;
            } else {
                z = z2;
            }
            if (!z && alVar != null) {
                if (alVar.f2081o != null) {
                    return alVar.f2081o.m3100b();
                }
                return "{0}";
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m3095a(AbstractC0515r rVar, C0316al alVar, float f, float f2) {
        f2062e.f2063a = f + alVar.f2073g;
        f2062e.f2064b = f2 + alVar.f2074h;
        f2062e.f2065c = alVar;
        f2062e.f2066d = 0;
        AbstractC0789l.m638u().f5528bK.m2462a(f2062e.f2063a, f2062e.f2064b, alVar.f2071e, rVar, 0.0f, f2062e);
        if (f2062e.f2066d < alVar.f2077k || f2062e.f2066d > alVar.f2078l) {
            return false;
        }
        return true;
    }
}
