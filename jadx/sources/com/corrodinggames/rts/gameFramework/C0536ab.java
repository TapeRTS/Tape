package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ab.class */
public class C0536ab {

    /* renamed from: a */
    C0835m f3600a = new C0835m();

    /* renamed from: b */
    boolean f3601b;

    /* renamed from: c */
    float f3602c;

    /* renamed from: d */
    float f3603d;

    /* renamed from: e */
    int f3604e;

    /* renamed from: f */
    boolean f3605f;

    /* renamed from: g */
    public C0835m f3606g;

    /* renamed from: h */
    final /* synthetic */ C0535aa f3607h;

    public C0536ab(C0535aa aaVar) {
        this.f3607h = aaVar;
    }

    /* renamed from: a */
    public void m2094a(AbstractC0515r rVar, C0270an anVar) {
        anVar.f1653i = this;
        this.f3605f = anVar.f1654j;
    }

    /* renamed from: a */
    public void m2096a(C0270an anVar) {
        C0270an ap;
        Iterator it = this.f3600a.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (!rVar.f1459bz && (ap = rVar.m2237ap()) != null && ap.m3248b(anVar)) {
                rVar.m2230aw();
            }
        }
    }

    /* renamed from: a */
    public void m2098a() {
        C0270an ap;
        this.f3600a.clear();
        AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
        int size = AbstractC0210af.f1442bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.mo2338I() && (ap = rVar.m2237ap()) != null && ap.f1653i == this && rVar.mo2210bb()) {
                    this.f3600a.add(rVar);
                    this.f3602c = ap.m3237g();
                    this.f3603d = ap.m3235h();
                }
            }
        }
    }

    /* renamed from: a */
    public void m2095a(AbstractC0515r rVar) {
        rVar.f3422T = this.f3604e;
        C0270an ap = rVar.m2237ap();
        if (ap != null) {
            ap.f1653i = this;
        }
    }

    /* renamed from: b */
    public void m2091b() {
        C0586bj.m1919a();
        m2090c();
    }

    /* renamed from: a */
    public AbstractC0515r m2093a(C0835m mVar, float f, float f2, boolean z) {
        float f3 = -1.0f;
        AbstractC0515r rVar = null;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar2 = (AbstractC0515r) it.next();
            if (z || (rVar2.f3423U == null && !rVar2.f3424V)) {
                float b = C0654f.m1474b(f, f2, rVar2.f5842dH, rVar2.f5843dI);
                if (rVar2.f3425W) {
                    b -= 160.0f;
                }
                if (f3 == -1.0f || b < f3) {
                    f3 = b;
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    /* renamed from: a */
    public C0835m m2097a(float f, float f2, boolean z) {
        C0835m mVar = new C0835m(1);
        C0835m mVar2 = new C0835m();
        mVar2.clear();
        mVar2.addAll(this.f3600a);
        while (true) {
            AbstractC0515r a = m2093a(mVar2, f, f2, true);
            if (a == null) {
                return mVar;
            }
            mVar.add(a);
            mVar2.remove(a);
            mVar2.removeAll(m2092a(mVar2, a, true, z));
        }
    }

    /* renamed from: a */
    public C0835m m2092a(C0835m mVar, AbstractC0515r rVar, boolean z, boolean z2) {
        C0835m mVar2 = new C0835m(1);
        mVar2.clear();
        int i = 0;
        Object[] a = mVar.m490a();
        int size = mVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0515r) a[i2]).f3435ag = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = mVar.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0515r rVar2 = (AbstractC0515r) a[i4];
                if (!rVar2.f3435ag && rVar2 != rVar && ((z || (rVar2.f3423U == null && !rVar2.f3424V)) && rVar2.mo2358h() == rVar.mo2358h())) {
                    float a2 = C0654f.m1520a(rVar2.f5842dH, rVar2.f5843dI, rVar.f5842dH, rVar.f5843dI);
                    if ((i3 != 0 || a2 <= 3600.0f) && ((i3 != 1 || a2 <= 14400.0f) && (((z2 && a2 < 160000.0f) || (a2 < 40000.0f && i < 25)) && (z2 || C0654f.m1459c(rVar2.mo2130z() - rVar.mo2130z()) < 0.4f)))) {
                        rVar2.f3435ag = true;
                        mVar2.add(rVar2);
                        i++;
                    }
                }
            }
        }
        return mVar2;
    }

    /* renamed from: c */
    public void m2090c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0586bj.m1919a();
        m2098a();
        this.f3607h.f3599b.m4141a(0.0f, 0.0f);
        Iterator it = this.f3600a.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            this.f3607h.f3599b.m4139b(rVar.f5842dH, rVar.f5843dI);
        }
        this.f3607h.f3599b.m4141a(this.f3607h.f3599b.f224a / this.f3600a.size(), this.f3607h.f3599b.f225b / this.f3600a.size());
        float d = C0654f.m1446d(this.f3607h.f3599b.f224a, this.f3607h.f3599b.f225b, this.f3602c, this.f3603d);
        Iterator it2 = this.f3600a.iterator();
        while (it2.hasNext()) {
            AbstractC0515r rVar2 = (AbstractC0515r) it2.next();
            if (rVar2.f3427Y > 1) {
                rVar2.f3425W = rVar2.f3424V;
            } else {
                rVar2.f3425W = false;
            }
            if (rVar2.f3425W && rVar2.f3427Y > 7 && C0654f.m1459c(C0654f.m1457c(rVar2.f3432ad, d, 360.0f)) > 80.0f) {
                rVar2.f3425W = false;
            }
            rVar2.m2227az();
            rVar2.f3427Y = (short) 0;
            rVar2.f3433ae = u.f5499bh;
            rVar2.f3422T = this.f3604e;
        }
        int i = 0;
        while (true) {
            C0586bj.m1919a();
            AbstractC0515r a = m2093a(this.f3600a, this.f3602c, this.f3603d, false);
            if (a != null) {
                a.f3424V = true;
                C0536ab abVar = null;
                if (i > 0) {
                    abVar = this.f3607h.m2100b();
                }
                if (abVar != null) {
                    abVar.f3606g = this.f3606g;
                    abVar.m2095a(a);
                }
                int i2 = 0;
                float f = 0.0f;
                Iterator it3 = m2092a(this.f3600a, a, false, this.f3605f).iterator();
                while (it3.hasNext()) {
                    AbstractC0515r rVar3 = (AbstractC0515r) it3.next();
                    if (rVar3.f1474bO > f) {
                        f = rVar3.f1474bO;
                    }
                    rVar3.m2292a(a);
                    if (abVar != null) {
                        abVar.m2095a(rVar3);
                    }
                    i2++;
                }
                if (a != null) {
                    a.f3427Y = (short) (i2 + 1);
                }
                C0835m mVar = new C0835m();
                Object[] a2 = this.f3600a.m490a();
                int size = this.f3600a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0515r rVar4 = (AbstractC0515r) a2[i3];
                    if (rVar4.f3423U == a) {
                        mVar.add(rVar4);
                    }
                }
                C0835m a3 = this.f3607h.m2104a(i2, f, d);
                C0586bj.m1919a();
                this.f3607h.m2101a(mVar, a, a3, d, i2);
                C0586bj.m1919a();
                this.f3607h.m2102a(mVar, a);
                i++;
            } else {
                return;
            }
        }
    }
}
