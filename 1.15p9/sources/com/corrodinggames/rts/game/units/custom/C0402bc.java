package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bc */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bc.class */
public final class C0402bc {

    /* renamed from: a */
    C1101m f2488a = new C1101m();

    /* renamed from: b */
    C1101m f2489b = new C1101m();

    /* renamed from: c */
    boolean f2490c;

    /* renamed from: d */
    boolean f2491d;

    /* renamed from: e */
    public static final C0403bd f2492e = new C0403bd();

    /* renamed from: a */
    public static C0402bc m5290a(C0453l c0453l, C1072ab c1072ab) {
        C0402bc c0402bc = new C0402bc();
        c0402bc.m5286b(c0453l, c1072ab);
        if (c0402bc.f2489b.size() == 0) {
            return null;
        }
        Iterator it = c0402bc.f2488a.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            if (c0448g != null) {
                int i = 0;
                C0404be c0404be = null;
                Iterator it2 = c0402bc.f2489b.iterator();
                while (it2.hasNext()) {
                    C0404be c0404be2 = (C0404be) it2.next();
                    if (c0404be2.f2498b == c0448g) {
                        i++;
                        c0404be = c0404be2;
                    }
                }
                if (i == 1) {
                    c0453l.m4705r("[placementRule_" + c0404be.f2497a + "]anyRuleInGroup: No other rule with this same group name found");
                }
            }
        }
        return c0402bc;
    }

    /* renamed from: b */
    public void m5286b(C0453l c0453l, C1072ab c1072ab) {
        Iterator it = c1072ab.m669e("placementRule_").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.substring("placementRule_".length());
            C0404be c0404be = new C0404be();
            c0404be.f2497a = substring;
            c0404be.m5283a(c0453l, c1072ab, str);
            if (c0404be.m5284a()) {
                if (!this.f2488a.contains(c0404be.f2498b)) {
                    this.f2488a.add(c0404be.f2498b);
                }
                if (c0404be.f2510n) {
                    if (!c0404be.f2512p) {
                        this.f2490c = true;
                    } else {
                        this.f2491d = true;
                    }
                }
                this.f2489b.add(c0404be);
            }
        }
    }

    /* renamed from: a */
    public String m5289a(AbstractC0623y abstractC0623y, float f, float f2) {
        if (!this.f2490c) {
            return null;
        }
        return m5285b(abstractC0623y, f, f2);
    }

    /* renamed from: a */
    public String m5288a(AbstractC0623y abstractC0623y, int i, int i2) {
        if (!this.f2491d) {
            return null;
        }
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        c0173b.m6614b(i, i2);
        return m5285b(abstractC0623y, c0173b.f800T, c0173b.f801U);
    }

    /* renamed from: b */
    public String m5285b(AbstractC0623y abstractC0623y, float f, float f2) {
        boolean z;
        Iterator it = this.f2488a.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            boolean z2 = false;
            boolean z3 = false;
            C0404be c0404be = null;
            Iterator it2 = this.f2489b.iterator();
            while (it2.hasNext()) {
                C0404be c0404be2 = (C0404be) it2.next();
                if (c0404be2.f2498b == c0448g && c0404be2.f2510n) {
                    if (!m5287a(abstractC0623y, c0404be2, f, f2)) {
                        if (c0404be == null) {
                            c0404be = c0404be2;
                        }
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (c0448g == null) {
                z = !z3;
            } else {
                z = z2;
            }
            if (!z && c0404be != null) {
                if (c0404be.f2511o != null) {
                    return c0404be.f2511o.m5339b();
                }
                return "{0}";
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m5287a(AbstractC0623y abstractC0623y, C0404be c0404be, float f, float f2) {
        f2492e.f2493a = f + c0404be.f2503g;
        f2492e.f2494b = f2 + c0404be.f2504h;
        f2492e.f2495c = c0404be;
        f2492e.f2496d = 0;
        GameEngine.getInstance().f6121cc.m3792a(f2492e.f2493a, f2492e.f2494b, c0404be.f2501e, abstractC0623y, 0.0f, f2492e);
        if (f2492e.f2496d >= c0404be.f2507k && f2492e.f2496d <= c0404be.f2508l) {
            return true;
        }
        return false;
    }
}
