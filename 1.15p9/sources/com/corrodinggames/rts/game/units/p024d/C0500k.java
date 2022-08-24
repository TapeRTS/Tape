package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.game.units.d.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/k.class */
public class C0500k {

    /* renamed from: a */
    AbstractC0623y f3494a;

    /* renamed from: b */
    public PointF f3495b = null;

    /* renamed from: c */
    public final C1101m f3496c = new C1101m();

    /* renamed from: d */
    final C1101m f3497d = new C1101m();

    /* renamed from: e */
    public float f3498e;

    /* renamed from: f */
    C0499j f3499f;

    public C0500k(AbstractC0623y abstractC0623y) {
        this.f3494a = abstractC0623y;
    }

    /* renamed from: a */
    public void m3786a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3498e);
        c0859ar.mo1481a(this.f3496c.size());
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            ((AbstractC0726bk) it.next()).mo2611a(c0859ar);
        }
        c0859ar.mo1476a(this.f3495b != null);
        if (this.f3495b != null) {
            c0859ar.mo1482a(this.f3495b.f227a);
            c0859ar.mo1482a(this.f3495b.f228b);
        }
    }

    /* renamed from: a */
    public void m3785a(C0876k c0876k) {
        this.f3498e = c0876k.m1447g();
        int m1448f = c0876k.m1448f();
        this.f3496c.clear();
        for (int i = 0; i < m1448f; i++) {
            C0499j c0499j = new C0499j();
            c0499j.m3802a(c0876k);
            if (AbstractC0224s.m5435c(c0499j.f3491j)) {
                if (this.f3494a.m5314a(c0499j.f3491j) == null) {
                    GameEngine.m1138b("Factory", this.f3494a.mo3298r() + " no longer has the action:" + c0499j.f3491j);
                } else {
                    this.f3496c.add(c0499j);
                }
            } else {
                GameEngine.m1138b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (c0876k.m1457b() >= 5) {
            if (c0876k.m1449e()) {
                if (this.f3495b == null) {
                    this.f3495b = new PointF();
                }
                this.f3495b.f227a = c0876k.m1447g();
                this.f3495b.f228b = c0876k.m1447g();
                return;
            }
            this.f3495b = null;
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3787a(C0499j c0499j, float f, boolean z, float f2) {
        AbstractC0224s a = this.f3494a.m5314a(c0499j.f3491j);
        if (a == null) {
            C0831ad.m1736a("specialAction=null on completeQueueItem for item.uIndex:" + c0499j.f3491j + " id:" + this.f3494a.f6945ed, true);
            return null;
        }
        InterfaceC0303as mo6754i = a.mo6754i();
        if (mo6754i == null) {
            C0831ad.m1736a("unitType=null on completeQueueItem for item.uIndex:" + c0499j.f3491j + " id:" + this.f3494a.f6945ed, false);
            return null;
        }
        return m3790a(mo6754i, f, z, f2);
    }

    /* renamed from: a */
    public void m3792a(AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0244am.f1622cj = 30.0f;
        if (this.f3494a instanceof C0490f) {
            abstractC0244am.f1622cj += 40.0f;
        }
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            abstractC0623y.m3046j(90.0f);
            if (abstractC0623y.mo3258z() < 0.75d) {
                abstractC0244am.f1622cj += 30.0f;
            }
            if (abstractC0623y.mo3258z() < 0.55d) {
                abstractC0244am.f1622cj += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float m2246i = this.f3494a.f6951ek + (C0758f.m2246i(abstractC0244am.f1617ce) * f);
            float m2251h = this.f3494a.f6952el + (C0758f.m2251h(abstractC0244am.f1617ce) * f);
            if (this.f3495b != null) {
                if (f != 0.0f) {
                    abstractC0623y.m3068d(m2246i, m2251h);
                }
                abstractC0623y.m3068d(this.f3495b.f227a + f2, this.f3495b.f228b);
                return;
            }
            float m2251h2 = m2246i - (C0758f.m2251h(abstractC0244am.f1617ce) * f2);
            float m2246i2 = m2251h + (C0758f.m2246i(abstractC0244am.f1617ce) * f2);
            if (f != 0.0f) {
                abstractC0623y.m3068d(m2251h2, m2246i2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3790a(InterfaceC0303as interfaceC0303as, float f, boolean z, float f2) {
        AbstractC0244am mo4987a = interfaceC0303as.mo4987a();
        mo4987a.f6951ek = this.f3494a.f6951ek;
        mo4987a.f6952el = this.f3494a.f6952el + 5.0f;
        mo4987a.f1617ce = 90.0f + f2;
        mo4987a.m5170f(this.f3494a.f1608bV);
        mo4987a.m5328B(this.f3494a);
        m3792a(mo4987a, f, z);
        GameEngine m1228A = GameEngine.m1228A();
        if (mo4987a.f1608bV == m1228A.f6093bs) {
            m1228A.f6111bS.f5108f.m2100a(mo4987a);
        }
        return mo4987a;
    }

    /* renamed from: a */
    public final boolean m3801a() {
        return this.f3496c.f6888a == 0;
    }

    /* renamed from: a */
    public C0499j m3794a(AbstractC0228w abstractC0228w, boolean z) {
        return m3793a(abstractC0228w, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: a */
    public C0499j m3793a(AbstractC0228w abstractC0228w, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        C0499j c0499j = new C0499j();
        c0499j.f3491j = abstractC0228w.m5449N();
        c0499j.f3485h = pointF;
        c0499j.f3486i = abstractC0244am;
        if (c0499j.f3491j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        c0499j.f3480a = 1;
        c0499j.f3481b = abstractC0228w.mo3684K();
        c0499j.f3489c = abstractC0228w.mo5477B();
        c0499j.f3490d = abstractC0228w.mo5474o_();
        c0499j.f3482e = abstractC0228w.m5447P();
        c0499j.f3483f = abstractC0228w.mo3308g();
        c0499j.f3484g = abstractC0228w.mo6754i();
        c0499j.f3488l = abstractC0228w.m5453H();
        if (!z) {
            AbstractC0197n.m5621b((AbstractC0244am) this.f3494a);
            if (c0499j.f3488l) {
                int i = 0;
                for (int i2 = 0; i2 < this.f3496c.size() && ((C0499j) this.f3496c.get(i2)).f3488l; i2++) {
                    i = i2 + 1;
                }
                if (i != 0 || this.f3496c.size() != 0) {
                }
                this.f3496c.add(i, c0499j);
            } else {
                this.f3496c.add(c0499j);
            }
            AbstractC0197n.m5605c(this.f3494a);
        } else {
            this.f3497d.add(c0499j);
        }
        return c0499j;
    }

    /* renamed from: b */
    public C0499j m3782b(AbstractC0228w abstractC0228w, boolean z) {
        if (z) {
            if (m3799a(abstractC0228w.m5449N(), true) > 0) {
                C0499j m3794a = m3794a(abstractC0228w, true);
                m3794a.f3487k = true;
                return m3794a;
            }
            return null;
        }
        C1101m c1101m = this.f3496c;
        ListIterator listIterator = c1101m.listIterator(c1101m.size());
        while (listIterator.hasPrevious()) {
            C0499j c0499j = (C0499j) listIterator.previous();
            if (c0499j.f3491j.equals(abstractC0228w.m5449N())) {
                AbstractC0197n.m5621b((AbstractC0244am) this.f3494a);
                listIterator.remove();
                AbstractC0197n.m5605c(this.f3494a);
                return c0499j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3788a(C0499j c0499j) {
        this.f3499f = c0499j;
        this.f3494a.m3106bC();
    }

    /* renamed from: b */
    public C0499j m3783b() {
        return this.f3499f;
    }

    /* renamed from: c */
    public C0424b m3779c() {
        if (this.f3499f == null || this.f3499f.f3490d == null) {
            return null;
        }
        return C0424b.m4573a(this.f3499f.f3490d, -(this.f3499f.f3481b * this.f3494a.m5205cv() * 60.0f));
    }

    /* renamed from: d */
    public AbstractC0224s m3777d() {
        if (this.f3499f != null) {
            return this.f3494a.m5314a(this.f3499f.f3491j);
        }
        return null;
    }

    /* renamed from: a */
    public void m3800a(float f) {
        if (!m3801a()) {
            C0499j c0499j = (C0499j) m3775f().get(0);
            if (this.f3499f != c0499j) {
                if (c0499j.f3492m < 0.0f) {
                    c0499j.f3492m = 0.0f;
                    ((InterfaceC0501l) this.f3494a).mo3770b(c0499j);
                }
                if (this.f3499f != null) {
                    this.f3498e = c0499j.f3492m;
                }
                m3788a(c0499j);
            }
            float cv = c0499j.f3481b * this.f3494a.m5205cv() * f;
            boolean z = false;
            if (c0499j.f3490d != null) {
                if (this.f3498e + cv > 1.0f) {
                    cv = 1.0f - this.f3498e;
                    z = true;
                }
                double d = (this.f3498e + cv) - c0499j.f3493n;
                double d2 = 0.0d;
                if (z) {
                    d2 = 1.0d - c0499j.f3493n;
                } else if (d >= 0.009999999776482582d) {
                    d2 = ((int) (d / 0.009999999776482582d)) * 0.009999999776482582d;
                }
                boolean z2 = false;
                if (d2 > 0.0d && this.f3494a.f1608bV.f1358al.m4489a(c0499j.f3490d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || c0499j.f3490d.m4585c(this.f3494a, d2))) {
                    c0499j.f3493n += d2;
                } else {
                    if (!z2) {
                        this.f3494a.f1608bV.f1358al.m4488a(c0499j.f3490d, this.f3494a, d2);
                    }
                    cv = 0.0f;
                    z = false;
                }
            }
            this.f3498e += cv;
            if (z) {
                this.f3498e = 1.0f;
            }
            c0499j.f3492m = this.f3498e;
            if (this.f3498e >= 1.0f) {
                if (c0499j.f3483f && ((InterfaceC0501l) this.f3494a).mo3764dx()) {
                    this.f3498e = 1.0f;
                    return;
                }
                AbstractC0197n.m5621b((AbstractC0244am) this.f3494a);
                this.f3498e = 0.0f;
                c0499j.f3480a--;
                if (c0499j.f3480a <= 0) {
                    List m3775f = m3775f();
                    if (m3775f.size() == 0) {
                        GameEngine.m1139b("-------------buildQueue empty for:" + c0499j.f3491j);
                        GameEngine.m1139b("-------------");
                    } else {
                        m3775f.remove(0);
                    }
                }
                AbstractC0197n.m5605c(this.f3494a);
                ((InterfaceC0501l) this.f3494a).mo3771a(c0499j);
                return;
            }
            return;
        }
        m3788a((C0499j) null);
        this.f3498e = 0.0f;
        if (this.f3497d.f6888a > 0) {
            C0499j c0499j2 = (C0499j) this.f3497d.get(0);
            if (c0499j2.f3481b > 10.0f && c0499j2.f3492m <= 0.0f) {
                c0499j2.f3492m = 1.0f;
                AbstractC0224s a = this.f3494a.m5314a(c0499j2.f3491j);
                if (a != null && a.m5446Q()) {
                    a.m5438a(this.f3494a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m3776e() {
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (this.f3494a.m5314a(c0499j.f3491j) == null) {
                m3780b(c0499j);
                m3778c(c0499j);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void m3784a(boolean z) {
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (z) {
                m3780b(c0499j);
            }
            m3778c(c0499j);
            it.remove();
        }
    }

    /* renamed from: b */
    private void m3780b(C0499j c0499j) {
        if (((InterfaceC0501l) this.f3494a).mo3769c(c0499j)) {
            if (c0499j.f3490d != null && c0499j.f3493n > 0.0d) {
                c0499j.f3490d.m4578a((AbstractC0244am) this.f3494a, c0499j.f3493n, true);
            }
            c0499j.f3489c.m4538h(this.f3494a);
        }
    }

    /* renamed from: c */
    private void m3778c(C0499j c0499j) {
    }

    /* renamed from: a */
    public int m3791a(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        int i2 = this.f3496c.f6888a;
        if (i2 != 0) {
            Object[] m553a = this.f3496c.m553a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0499j c0499j = (C0499j) m553a[i3];
                if (c0499j.f3483f && c0499j.f3484g == interfaceC0303as) {
                    i += c0499j.f3480a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3799a(C0208c c0208c, boolean z) {
        return m3798a(c0208c, z, false);
    }

    /* renamed from: a */
    public int m3789a(C0448g c0448g) {
        if (c0448g == null) {
            return this.f3496c.f6888a;
        }
        int i = 0;
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            if (C0448g.m4415a(c0448g, ((C0499j) it.next()).f3482e)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3798a(C0208c c0208c, boolean z, boolean z2) {
        int i = 0;
        if (this.f3496c.f6888a != 0) {
            Iterator it = this.f3496c.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (AbstractC0224s.f1461i == c0208c || c0499j.f3491j.equals(c0208c)) {
                    if (!z2 || c0499j.f3483f) {
                        i += c0499j.f3480a;
                    }
                }
            }
        }
        if (z && this.f3497d.f6888a != 0) {
            Iterator it2 = this.f3497d.iterator();
            while (it2.hasNext()) {
                C0499j c0499j2 = (C0499j) it2.next();
                if (AbstractC0224s.f1461i == c0208c || c0499j2.f3491j.equals(c0208c)) {
                    if (!z2 || c0499j2.f3483f) {
                        if (!c0499j2.f3487k) {
                            i += c0499j2.f3480a;
                        } else {
                            i -= c0499j2.f3480a;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC0224s m3781b(InterfaceC0303as interfaceC0303as) {
        ArrayList N = this.f3494a.m5327N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) N.get(i);
            if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                if (abstractC0228w.mo6754i() == interfaceC0303as) {
                    return abstractC0228w;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0499j m3795a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3316a((AbstractC0244am) this.f3494a, false) && abstractC0224s.mo3314b(this.f3494a)) {
                    if ((!abstractC0228w.mo3308g() || this.f3494a.f1608bV.m5559u() < this.f3494a.f1608bV.m5558v()) && abstractC0228w.mo5477B().m4586c(this.f3494a)) {
                        return m3793a(abstractC0228w, false, pointF, abstractC0244am);
                    }
                    return null;
                }
                return null;
            }
            C0499j m3782b = m3782b(abstractC0228w, false);
            if (m3782b != null) {
                m3780b(m3782b);
                m3778c(m3782b);
                return m3782b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m3796a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3316a((AbstractC0244am) this.f3494a, true)) {
                    if ((!abstractC0228w.mo3308g() || this.f3494a.f1608bV.m5559u() < this.f3494a.f1608bV.m5558v()) && abstractC0228w.mo5477B().m4557b(this.f3494a, abstractC0224s.m5446Q())) {
                        m3794a(abstractC0228w, true);
                    }
                }
            } else if (m3782b(abstractC0228w, true) != null) {
                abstractC0228w.mo5477B().m4541e(this.f3494a, abstractC0224s.m5446Q());
            }
        }
    }

    /* renamed from: a */
    public void m3797a(AbstractC0224s abstractC0224s) {
        if (this.f3497d.size() != 0) {
            C0499j c0499j = null;
            Iterator it = this.f3497d.iterator();
            while (it.hasNext()) {
                C0499j c0499j2 = (C0499j) it.next();
                if (c0499j2.f3491j.equals(abstractC0224s.m5449N())) {
                    c0499j = c0499j2;
                }
            }
            if (c0499j != null) {
                if (!c0499j.f3487k) {
                    c0499j.f3489c.m4541e(this.f3494a, abstractC0224s.m5446Q());
                } else {
                    c0499j.f3489c.m4543d(this.f3494a, abstractC0224s.m5446Q());
                }
                this.f3497d.remove(c0499j);
            }
        }
    }

    /* renamed from: f */
    public List m3775f() {
        return this.f3496c;
    }

    /* renamed from: g */
    public C1101m m3774g() {
        return this.f3496c;
    }
}
