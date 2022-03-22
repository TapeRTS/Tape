package com.corrodinggames.rts.game.units.p027g;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.g.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/c.class */
public class C0464c extends AbstractC0462a {

    /* renamed from: b */
    int f3289b;

    /* renamed from: c */
    C0181c f3290c;

    public C0464c() {
        this.f3290c = C0181c.f1325a;
    }

    public C0464c(int i, C0181c cVar) {
        super(i);
        this.f3290c = C0181c.f1325a;
        this.f3290c = cVar;
        this.f3289b = AbstractC0789l.m638u().f5499bh;
    }

    /* renamed from: a */
    public boolean m2441a(C0181c cVar) {
        return this.f3290c == C0181c.f1325a || this.f3290c == cVar;
    }

    /* renamed from: b */
    public float m2438b() {
        int i = this.f3288a - this.f3289b;
        if (i <= 0) {
            return 1.0f;
        }
        return (this.f3288a - AbstractC0789l.m638u().f5499bh) / i;
    }

    /* renamed from: a */
    public static void m2439a(AbstractC0515r rVar, C0181c cVar, int i) {
        C0463b.m2442a(rVar, new C0464c(AbstractC0789l.m638u().f5499bh + i, cVar));
    }

    /* renamed from: a */
    public static int m2440a(AbstractC0210af afVar, C0181c cVar) {
        C0464c b;
        if (!(afVar instanceof AbstractC0515r) || ((AbstractC0515r) afVar).f3493bb == null || (b = m2437b(afVar, cVar)) == null) {
            return 0;
        }
        return b.m2436c();
    }

    /* renamed from: c */
    public int m2436c() {
        return this.f3288a - AbstractC0789l.m638u().f5499bh;
    }

    /* renamed from: b */
    public static C0464c m2437b(AbstractC0210af afVar, C0181c cVar) {
        C0835m mVar;
        if (!(afVar instanceof AbstractC0515r) || (mVar = ((AbstractC0515r) afVar).f3493bb) == null) {
            return null;
        }
        int i = AbstractC0789l.m638u().f5499bh;
        C0464c cVar2 = null;
        Object[] a = mVar.m490a();
        for (int i2 = mVar.f5778a - 1; i2 >= 0; i2--) {
            AbstractC0462a aVar = (AbstractC0462a) a[i2];
            if (aVar instanceof C0464c) {
                C0464c cVar3 = (C0464c) aVar;
                if (cVar3.m2441a(cVar) && cVar3.f3288a > i) {
                    i = cVar3.f3288a;
                    cVar2 = cVar3;
                }
            }
        }
        if (cVar2 == null) {
            return null;
        }
        return cVar2;
    }

    /* renamed from: c */
    public static void m2435c(AbstractC0210af afVar, C0181c cVar) {
        C0835m mVar;
        if ((afVar instanceof AbstractC0515r) && (mVar = ((AbstractC0515r) afVar).f3493bb) != null) {
            int i = AbstractC0789l.m638u().f5499bh;
            Object[] a = mVar.m490a();
            for (int i2 = mVar.f5778a - 1; i2 >= 0; i2--) {
                AbstractC0462a aVar = (AbstractC0462a) a[i2];
                if (aVar instanceof C0464c) {
                    C0464c cVar2 = (C0464c) aVar;
                    if (cVar == C0181c.f1325a || cVar2.m2441a(cVar)) {
                        cVar2.f3288a = i - 1;
                    }
                }
            }
        }
    }
}
