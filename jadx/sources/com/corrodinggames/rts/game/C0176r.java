package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0414i;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/r.class */
public final class C0176r {

    /* renamed from: b */
    public int f1307b;

    /* renamed from: c */
    public int f1308c;

    /* renamed from: d */
    public int f1309d;

    /* renamed from: e */
    public int f1310e;

    /* renamed from: f */
    public int f1311f;

    /* renamed from: h */
    public boolean f1313h;

    /* renamed from: a */
    public int f1306a = 5;

    /* renamed from: g */
    public C0354d f1312g = new C0354d();

    /* renamed from: i */
    public C0835m f1314i = new C0835m();

    /* renamed from: a */
    public void m3423a(AbstractC0210af afVar) {
        if (afVar.f1477bR < 1.0f) {
            this.f1310e++;
        } else {
            this.f1308c++;
        }
        if (!afVar.mo1606r().mo2750k()) {
            this.f1307b++;
        }
        if (!this.f1313h && !afVar.mo1607o_() && afVar.mo1606r().mo2731y()) {
            this.f1313h = true;
        }
        if (afVar instanceof AbstractC0416k) {
            AbstractC0416k kVar = (AbstractC0416k) afVar;
            int h = kVar.mo2581h(false);
            this.f1307b += h;
            this.f1309d += h;
            if (h != 0) {
                m3421a(kVar);
            }
        }
        m3418c(afVar);
        float ci = afVar.mo2623ci();
        if (ci != 0.0f && afVar.f1477bR >= 1.0f) {
            this.f1311f = (int) (this.f1311f + ci);
        }
        C0354d ck = afVar.mo2832ck();
        if (!ck.m2987b() && afVar.f1477bR >= 1.0f) {
            this.f1312g.m2997a(ck);
        }
    }

    /* renamed from: b */
    public void m3420b(AbstractC0210af afVar) {
        if (afVar.f1477bR < 1.0f) {
            this.f1310e--;
        } else {
            this.f1308c--;
        }
        if (!afVar.mo1606r().mo2750k()) {
            this.f1307b--;
        }
        if (afVar instanceof AbstractC0416k) {
            AbstractC0416k kVar = (AbstractC0416k) afVar;
            int h = kVar.mo2581h(false);
            this.f1307b -= h;
            this.f1309d -= h;
            if (h != 0) {
                m3419b(kVar);
            }
        }
        m3417d(afVar);
        float ci = afVar.mo2623ci();
        if (ci != 0.0f && afVar.f1477bR >= 1.0f) {
            this.f1311f = (int) (this.f1311f - ci);
        }
        C0354d ck = afVar.mo2832ck();
        if (!ck.m2987b() && afVar.f1477bR >= 1.0f) {
            this.f1312g.m2984b(ck);
        }
    }

    /* renamed from: c */
    private final void m3418c(AbstractC0210af afVar) {
        C0365i cM = afVar.mo2846cM();
        if (cM != null) {
            for (C0364h hVar : cM.f2437a) {
                C0173o a = m3422a(hVar);
                if (afVar.f1477bR < 1.0f) {
                    a.f1295c++;
                } else {
                    a.f1294b++;
                }
            }
        }
    }

    /* renamed from: d */
    private final void m3417d(AbstractC0210af afVar) {
        C0365i cM = afVar.mo2846cM();
        if (cM != null) {
            for (C0364h hVar : cM.f2437a) {
                C0173o a = m3422a(hVar);
                if (afVar.f1477bR < 1.0f) {
                    a.f1295c--;
                } else {
                    a.f1294b--;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m3421a(AbstractC0416k kVar) {
        AbstractC0268al alVar;
        C0365i x;
        C0835m dd = kVar.mo2586dd();
        if (dd.f5778a != 0) {
            Iterator it = dd.iterator();
            while (it.hasNext()) {
                C0414i iVar = (C0414i) it.next();
                if (!(!iVar.f3027d || (alVar = iVar.f3028e) == null || (x = alVar.mo2732x()) == null)) {
                    for (C0364h hVar : x.f2437a) {
                        m3422a(hVar).f1296d += iVar.f3024a;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m3419b(AbstractC0416k kVar) {
        AbstractC0268al alVar;
        C0365i x;
        C0835m dd = kVar.mo2586dd();
        if (dd.f5778a != 0) {
            Iterator it = dd.iterator();
            while (it.hasNext()) {
                C0414i iVar = (C0414i) it.next();
                if (!(!iVar.f3027d || (alVar = iVar.f3028e) == null || (x = alVar.mo2732x()) == null)) {
                    for (C0364h hVar : x.f2437a) {
                        m3422a(hVar).f1296d -= iVar.f3024a;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final C0173o m3422a(C0364h hVar) {
        Object[] a = this.f1314i.m490a();
        int i = this.f1314i.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            C0173o oVar = (C0173o) a[i2];
            if (oVar.f1293a == hVar) {
                return oVar;
            }
            if (oVar.f1293a == null) {
                oVar.f1293a = hVar;
                return oVar;
            }
        }
        C0173o oVar2 = new C0173o();
        oVar2.f1293a = hVar;
        this.f1314i.add(oVar2);
        return oVar2;
    }
}
