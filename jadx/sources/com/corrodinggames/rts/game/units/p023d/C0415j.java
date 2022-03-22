package com.corrodinggames.rts.game.units.p023d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.game.units.d.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/j.class */
public class C0415j {

    /* renamed from: a */
    AbstractC0515r f3035a;

    /* renamed from: b */
    public PointF f3036b = null;

    /* renamed from: c */
    public final C0835m f3037c = new C0835m();

    /* renamed from: d */
    final C0835m f3038d = new C0835m();

    /* renamed from: e */
    public float f3039e;

    /* renamed from: f */
    C0414i f3040f;

    public C0415j(AbstractC0515r rVar) {
        this.f3035a = rVar;
    }

    /* renamed from: a */
    public void m2753a(C0690ap apVar) {
        apVar.mo1110a(this.f3039e);
        apVar.mo1109a(this.f3037c.size());
        Iterator it = this.f3037c.iterator();
        while (it.hasNext()) {
            ((AbstractC0585bi) it.next()).mo1654a(apVar);
        }
        apVar.mo1104a(this.f3036b != null);
        if (this.f3036b != null) {
            apVar.mo1110a(this.f3036b.f224a);
            apVar.mo1110a(this.f3036b.f225b);
        }
    }

    /* renamed from: a */
    public void m2752a(C0707k kVar) {
        this.f3039e = kVar.m1075g();
        int f = kVar.m1076f();
        this.f3037c.clear();
        for (int i = 0; i < f; i++) {
            C0414i iVar = new C0414i();
            iVar.m2767a(kVar);
            if (!AbstractC0197s.m3683c(iVar.f3033h)) {
                AbstractC0789l.m694b("Factory", "buildQueue has uIndex of -1, skipping");
            } else if (this.f3035a.mo3632a(iVar.f3033h) == null) {
                AbstractC0789l.m694b("Factory", this.f3035a.mo1660r() + " no longer has the action:" + iVar.f3033h);
            } else {
                this.f3037c.add(iVar);
            }
        }
        if (kVar.m1085b() < 5) {
            return;
        }
        if (kVar.m1077e()) {
            if (this.f3036b == null) {
                this.f3036b = new PointF();
            }
            this.f3036b.f224a = kVar.m1075g();
            this.f3036b.f225b = kVar.m1075g();
            return;
        }
        this.f3036b = null;
    }

    /* renamed from: a */
    public AbstractC0210af m2754a(C0414i iVar, float f, boolean z, float f2) {
        AbstractC0197s a = this.f3035a.mo3632a(iVar.f3033h);
        if (a == null) {
            Hcat_Multiplaye.m1334a("specialAction=null on completeQueueItem for item.uIndex:" + iVar.f3033h + " id:" + this.f3035a.f5835dA, true);
            return null;
        }
        AbstractC0268al i = a.mo2686i();
        if (i != null) {
            return m2755a(i, f, z, f2);
        }
        Hcat_Multiplaye.m1334a("unitType=null on completeQueueItem for item.uIndex:" + iVar.f3033h + " id:" + this.f3035a.f5835dA, false);
        return null;
    }

    /* renamed from: a */
    public void m2757a(AbstractC0210af afVar, float f, boolean z) {
        afVar.f1449bQ = 30.0f;
        if (this.f3035a instanceof C0405e) {
            afVar.f1449bQ += 40.0f;
        }
        if (afVar instanceof AbstractC0515r) {
            AbstractC0515r rVar = (AbstractC0515r) afVar;
            rVar.m2225j(90.0f);
            if (rVar.mo2418z() < 0.75d) {
                afVar.f1449bQ += 30.0f;
            }
            if (rVar.mo2418z() < 0.55d) {
                afVar.f1449bQ += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float i = this.f3035a.f5841dH + (C0654f.m1474i(afVar.f1444bL) * f);
            float h = this.f3035a.f5842dI + (C0654f.m1478h(afVar.f1444bL) * f);
            if (this.f3036b != null) {
                if (f != 0.0f) {
                    rVar.m2249d(i, h);
                }
                rVar.m2249d(this.f3036b.f224a + f2, this.f3036b.f225b);
                return;
            }
            float h2 = i - (C0654f.m1478h(afVar.f1444bL) * f2);
            float i2 = h + (C0654f.m1474i(afVar.f1444bL) * f2);
            if (f != 0.0f) {
                rVar.m2249d(h2, i2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0210af m2755a(AbstractC0268al alVar, float f, boolean z, float f2) {
        AbstractC0210af a = alVar.mo3504a();
        a.f5841dH = this.f3035a.f5841dH;
        a.f5842dI = this.f3035a.f5842dI + 5.0f;
        a.f1444bL = 90.0f + f2;
        a.mo3553d(this.f3035a.f1441bB);
        a.mo3556cx();
        m2757a(a, f, z);
        AbstractC0789l u = AbstractC0789l.m651u();
        if (a.f1441bB == u.f5464bb) {
            u.f5481bA.f4279f.m1638a(a);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean m2766a() {
        return this.f3037c.f5778a == 0;
    }

    /* renamed from: a */
    public C0414i m2759a(AbstractC0201w wVar, boolean z) {
        return m2758a(wVar, z, (PointF) null, (AbstractC0210af) null);
    }

    /* renamed from: a */
    public C0414i m2758a(AbstractC0201w wVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        C0414i iVar = new C0414i();
        iVar.f3033h = wVar.m3690J();
        iVar.f3028f = pointF;
        iVar.f3029g = afVar;
        if (iVar.f3033h == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        iVar.f3024a = 1;
        iVar.f3025b = wVar.mo2685t();
        iVar.f3032c = wVar.mo3368y();
        iVar.f3026d = wVar.mo2687g();
        iVar.f3027e = wVar.mo2686i();
        iVar.f3031j = wVar.mo3395E();
        if (!z) {
            AbstractC0171m.m3792b((AbstractC0210af) this.f3035a);
            if (iVar.f3031j) {
                int i = 0;
                for (int i2 = 0; i2 < this.f3037c.size() && ((C0414i) this.f3037c.get(i2)).f3031j; i2++) {
                    i = i2 + 1;
                }
                if (!(i == 0 && this.f3037c.size() == 0)) {
                }
                this.f3037c.add(i, iVar);
            } else {
                this.f3037c.add(iVar);
            }
            AbstractC0171m.m3777c(this.f3035a);
        } else {
            this.f3038d.add(iVar);
        }
        return iVar;
    }

    /* renamed from: b */
    public C0414i m2750b(AbstractC0201w wVar, boolean z) {
        if (!z) {
            C0835m mVar = this.f3037c;
            ListIterator listIterator = mVar.listIterator(mVar.size());
            while (listIterator.hasPrevious()) {
                C0414i iVar = (C0414i) listIterator.previous();
                if (iVar.f3033h.equals(wVar.m3690J())) {
                    AbstractC0171m.m3792b((AbstractC0210af) this.f3035a);
                    listIterator.remove();
                    AbstractC0171m.m3777c(this.f3035a);
                    return iVar;
                }
            }
            return null;
        } else if (m2764a(wVar.m3690J(), true) <= 0) {
            return null;
        } else {
            C0414i a = m2759a(wVar, true);
            a.f3030i = true;
            return a;
        }
    }

    /* renamed from: b */
    public C0414i m2751b() {
        return this.f3040f;
    }

    /* renamed from: c */
    public AbstractC0197s m2748c() {
        if (this.f3040f != null) {
            return this.f3035a.mo3632a(this.f3040f.f3033h);
        }
        return null;
    }

    /* renamed from: a */
    public void m2765a(float f) {
        if (!m2766a()) {
            C0414i iVar = (C0414i) m2744g().get(0);
            if (this.f3040f != iVar) {
                if (iVar.f3034k < 0.0f) {
                    iVar.f3034k = 0.0f;
                    ((AbstractC0416k) this.f3035a).mo2740b(iVar);
                }
                if (this.f3040f != null) {
                    this.f3039e = iVar.f3034k;
                }
                this.f3040f = iVar;
            }
            this.f3039e += iVar.f3025b * this.f3035a.mo3570ch() * f;
            iVar.f3034k = this.f3039e;
            if (this.f3039e <= 1.0f) {
                return;
            }
            if (!iVar.f3026d || !((AbstractC0416k) this.f3035a).mo2735dg()) {
                AbstractC0171m.m3792b((AbstractC0210af) this.f3035a);
                this.f3039e = 0.0f;
                iVar.f3024a--;
                if (iVar.f3024a <= 0) {
                    List g = m2744g();
                    if (g.size() == 0) {
                        AbstractC0789l.m695b("-------------buildQueue empty for:" + iVar.f3033h);
                        AbstractC0789l.m695b("-------------");
                    } else {
                        g.remove(0);
                    }
                }
                AbstractC0171m.m3777c(this.f3035a);
                ((AbstractC0416k) this.f3035a).mo2693a(iVar);
                return;
            }
            this.f3039e = 1.0f;
            return;
        }
        this.f3040f = null;
        this.f3039e = 0.0f;
        if (this.f3038d.f5778a > 0) {
            C0414i iVar2 = (C0414i) this.f3038d.get(0);
            if (iVar2.f3025b > 10.0f && iVar2.f3034k <= 0.0f) {
                iVar2.f3034k = 1.0f;
                AbstractC0197s a = this.f3035a.mo3632a(iVar2.f3033h);
                if (a != null && a.mo3391L()) {
                    AbstractC0789l.m683d("fakeAntiLagIssue:" + iVar2.f3033h);
                    a.mo3388a(this.f3035a);
                }
            }
        }
    }

    /* renamed from: d */
    public void m2747d() {
        Iterator it = this.f3037c.iterator();
        while (it.hasNext()) {
            C0414i iVar = (C0414i) it.next();
            if (this.f3035a.mo3632a(iVar.f3033h) == null) {
                iVar.f3032c.m3123f(this.f3035a);
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public void m2746e() {
        Iterator it = this.f3037c.iterator();
        while (it.hasNext()) {
            ((C0414i) it.next()).f3032c.m3123f(this.f3035a);
            it.remove();
        }
    }

    /* renamed from: a */
    public int m2756a(AbstractC0268al alVar) {
        int i = 0;
        int i2 = this.f3037c.f5778a;
        if (i2 != 0) {
            Object[] a = this.f3037c.m490a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0414i iVar = (C0414i) a[i3];
                if (iVar.f3026d && iVar.f3027e == alVar) {
                    i += iVar.f3024a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m2764a(C0181c cVar, boolean z) {
        return m2763a(cVar, z, false);
    }

    /* renamed from: f */
    public int m2745f() {
        return this.f3037c.f5778a;
    }

    /* renamed from: a */
    public int m2763a(C0181c cVar, boolean z, boolean z2) {
        int i = 0;
        if (this.f3037c.f5778a != 0) {
            Iterator it = this.f3037c.iterator();
            while (it.hasNext()) {
                C0414i iVar = (C0414i) it.next();
                if (AbstractC0197s.f1356h == cVar || iVar.f3033h.equals(cVar)) {
                    if (!z2 || iVar.f3026d) {
                        i += iVar.f3024a;
                    }
                }
            }
        }
        if (z && this.f3038d.f5778a != 0) {
            Iterator it2 = this.f3038d.iterator();
            while (it2.hasNext()) {
                C0414i iVar2 = (C0414i) it2.next();
                if (AbstractC0197s.f1356h == cVar || iVar2.f3033h.equals(cVar)) {
                    if (!z2 || iVar2.f3026d) {
                        if (!iVar2.f3030i) {
                            i += iVar2.f3024a;
                        } else {
                            i -= iVar2.f3024a;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC0197s m2749b(AbstractC0268al alVar) {
        ArrayList M = this.f3035a.mo2480M();
        int size = M.size();
        for (int i = 0; i < size; i++) {
            AbstractC0197s sVar = (AbstractC0197s) M.get(i);
            if (sVar != null && (sVar instanceof AbstractC0201w)) {
                AbstractC0201w wVar = (AbstractC0201w) sVar;
                if (wVar.mo2686i() == alVar) {
                    return wVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0414i m2760a(AbstractC0197s sVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        if (!(sVar instanceof AbstractC0201w)) {
            return null;
        }
        AbstractC0201w wVar = (AbstractC0201w) sVar;
        if (z) {
            C0414i b = m2750b(wVar, false);
            if (b == null) {
                return null;
            }
            wVar.mo3368y().m3123f(this.f3035a);
            return b;
        } else if (!sVar.mo2470a((AbstractC0210af) this.f3035a, false) || !sVar.mo2465a((AbstractC0210af) this.f3035a)) {
            return null;
        } else {
            if ((!wVar.mo2687g() || this.f3035a.f1441bB.m3735s() < this.f3035a.f1441bB.m3734t()) && wVar.mo3368y().m3152a(this.f3035a)) {
                return m2758a(wVar, false, pointF, afVar);
            }
            return null;
        }
    }

    /* renamed from: a */
    public void m2761a(AbstractC0197s sVar, boolean z) {
        if (sVar instanceof AbstractC0201w) {
            AbstractC0201w wVar = (AbstractC0201w) sVar;
            if (!z) {
                if (!sVar.mo2470a((AbstractC0210af) this.f3035a, true)) {
                    return;
                }
                if ((!wVar.mo2687g() || this.f3035a.f1441bB.m3735s() < this.f3035a.f1441bB.m3734t()) && wVar.mo3368y().m3126d(this.f3035a, sVar.mo3391L())) {
                    m2759a(wVar, true);
                }
            } else if (m2750b(wVar, true) != null) {
                wVar.mo3368y().m3120g(this.f3035a, sVar.mo3391L());
            }
        }
    }

    /* renamed from: a */
    public void m2762a(AbstractC0197s sVar) {
        if (this.f3038d.size() != 0) {
            C0414i iVar = null;
            Iterator it = this.f3038d.iterator();
            while (it.hasNext()) {
                C0414i iVar2 = (C0414i) it.next();
                if (iVar2.f3033h.equals(sVar.m3690J())) {
                    iVar = iVar2;
                }
            }
            if (iVar != null) {
                if (!iVar.f3030i) {
                    iVar.f3032c.m3120g(this.f3035a, sVar.mo3391L());
                } else {
                    iVar.f3032c.m3122f(this.f3035a, sVar.mo3391L());
                }
                this.f3038d.remove(iVar);
            }
        }
    }

    /* renamed from: g */
    public List m2744g() {
        return this.f3037c;
    }

    /* renamed from: h */
    public C0835m m2743h() {
        return this.f3037c;
    }
}
