package com.corrodinggames.rts.game.units.buildings;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.CommonUtils;
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
    public void m4390a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3498e);
        c0859ar.mo1487a(this.f3496c.size());
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            ((AbstractC0726bk) it.next()).mo466a(c0859ar);
        }
        c0859ar.mo1482a(this.f3495b != null);
        if (this.f3495b != null) {
            c0859ar.mo1488a(this.f3495b.x);
            c0859ar.mo1488a(this.f3495b.y);
        }
    }

    /* renamed from: a */
    public void m4389a(C0876k c0876k) {
        this.f3498e = c0876k.m1453g();
        int m1454f = c0876k.m1454f();
        this.f3496c.clear();
        for (int i = 0; i < m1454f; i++) {
            C0499j c0499j = new C0499j();
            c0499j.m4406a(c0876k);
            if (Action.m6080c(c0499j.f3491j)) {
                if (this.f3494a.m5893a(c0499j.f3491j) == null) {
                    GameEngine.m1144b("Factory", this.f3494a.getUnitType() + " no longer has the action:" + c0499j.f3491j);
                } else {
                    this.f3496c.add(c0499j);
                }
            } else {
                GameEngine.m1144b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (c0876k.m1463b() >= 5) {
            if (c0876k.m1455e()) {
                if (this.f3495b == null) {
                    this.f3495b = new PointF();
                }
                this.f3495b.x = c0876k.m1453g();
                this.f3495b.y = c0876k.m1453g();
                return;
            }
            this.f3495b = null;
        }
    }

    /* renamed from: a */
    public Unit m4391a(C0499j c0499j, float f, boolean z, float f2) {
        Action a = this.f3494a.m5893a(c0499j.f3491j);
        if (a == null) {
            C0831ad.m1742a("specialAction=null on completeQueueItem for item.uIndex:" + c0499j.f3491j + " id:" + this.f3494a.f6945ed, true);
            return null;
        }
        InterfaceC0303as mo7517i = a.mo7517i();
        if (mo7517i == null) {
            C0831ad.m1742a("unitType=null on completeQueueItem for item.uIndex:" + c0499j.f3491j + " id:" + this.f3494a.f6945ed, false);
            return null;
        }
        return m4394a(mo7517i, f, z, f2);
    }

    /* renamed from: a */
    public void m4396a(Unit unit, float f, boolean z) {
        unit.f1622cj = 30.0f;
        if (this.f3494a instanceof ExperimentalLandFactory) {
            unit.f1622cj += 40.0f;
        }
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
            abstractC0623y.m3049j(90.0f);
            if (abstractC0623y.getMoveSpeed() < 0.75d) {
                unit.f1622cj += 30.0f;
            }
            if (abstractC0623y.getMoveSpeed() < 0.55d) {
                unit.f1622cj += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float m2249i = this.f3494a.f6951ek + (CommonUtils.m2249i(unit.direction) * f);
            float sin = this.f3494a.f6952el + (CommonUtils.sin(unit.direction) * f);
            if (this.f3495b != null) {
                if (f != 0.0f) {
                    abstractC0623y.m3071d(m2249i, sin);
                }
                abstractC0623y.m3071d(this.f3495b.x + f2, this.f3495b.y);
                return;
            }
            float sin2 = m2249i - (CommonUtils.sin(unit.direction) * f2);
            float m2249i2 = sin + (CommonUtils.m2249i(unit.direction) * f2);
            if (f != 0.0f) {
                abstractC0623y.m3071d(sin2, m2249i2);
            }
        }
    }

    /* renamed from: a */
    public Unit m4394a(InterfaceC0303as interfaceC0303as, float f, boolean z, float f2) {
        Unit mo5717a = interfaceC0303as.mo5717a();
        mo5717a.f6951ek = this.f3494a.f6951ek;
        mo5717a.f6952el = this.f3494a.f6952el + 5.0f;
        mo5717a.direction = 90.0f + f2;
        mo5717a.m5766f(this.f3494a.team);
        mo5717a.m5907B(this.f3494a);
        m4396a(mo5717a, f, z);
        GameEngine gameEngine = GameEngine.getInstance();
        if (mo5717a.team == gameEngine.f6093bs) {
            gameEngine.f6111bS.f5108f.m2105a(mo5717a);
        }
        return mo5717a;
    }

    /* renamed from: a */
    public final boolean m4405a() {
        return this.f3496c.f6888a == 0;
    }

    /* renamed from: a */
    public C0499j m4398a(AbstractC0228w abstractC0228w, boolean z) {
        return m4397a(abstractC0228w, z, (PointF) null, (Unit) null);
    }

    /* renamed from: a */
    public C0499j m4397a(AbstractC0228w abstractC0228w, boolean z, PointF pointF, Unit unit) {
        C0499j c0499j = new C0499j();
        c0499j.f3491j = abstractC0228w.m6095N();
        c0499j.f3485h = pointF;
        c0499j.f3486i = unit;
        if (c0499j.f3491j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        c0499j.f3480a = 1;
        c0499j.f3481b = abstractC0228w.mo4250K();
        c0499j.f3489c = abstractC0228w.m6105B();
        c0499j.f3490d = abstractC0228w.m6051o_();
        c0499j.f3482e = abstractC0228w.m6093P();
        c0499j.f3483f = abstractC0228w.mo6181g();
        c0499j.f3484g = abstractC0228w.mo7517i();
        c0499j.f3488l = abstractC0228w.m6099H();
        if (!z) {
            Team.m6369b((Unit) this.f3494a);
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
            Team.m6353c(this.f3494a);
        } else {
            this.f3497d.add(c0499j);
        }
        return c0499j;
    }

    /* renamed from: b */
    public C0499j m4386b(AbstractC0228w abstractC0228w, boolean z) {
        if (z) {
            if (m4403a(abstractC0228w.m6095N(), true) > 0) {
                C0499j m4398a = m4398a(abstractC0228w, true);
                m4398a.f3487k = true;
                return m4398a;
            }
            return null;
        }
        C1101m c1101m = this.f3496c;
        ListIterator listIterator = c1101m.listIterator(c1101m.size());
        while (listIterator.hasPrevious()) {
            C0499j c0499j = (C0499j) listIterator.previous();
            if (c0499j.f3491j.equals(abstractC0228w.m6095N())) {
                Team.m6369b((Unit) this.f3494a);
                listIterator.remove();
                Team.m6353c(this.f3494a);
                return c0499j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4392a(C0499j c0499j) {
        this.f3499f = c0499j;
        this.f3494a.mo3107bC();
    }

    /* renamed from: b */
    public C0499j m4387b() {
        return this.f3499f;
    }

    /* renamed from: c */
    public C0424b m4383c() {
        if (this.f3499f == null || this.f3499f.f3490d == null) {
            return null;
        }
        return C0424b.m5220a(this.f3499f.f3490d, -(this.f3499f.f3481b * this.f3494a.m5798cv() * 60.0f));
    }

    /* renamed from: d */
    public Action m4381d() {
        if (this.f3499f != null) {
            return this.f3494a.m5893a(this.f3499f.f3491j);
        }
        return null;
    }

    /* renamed from: a */
    public void m4404a(float f) {
        if (!m4405a()) {
            C0499j c0499j = (C0499j) m4379f().get(0);
            if (this.f3499f != c0499j) {
                if (c0499j.f3492m < 0.0f) {
                    c0499j.f3492m = 0.0f;
                    ((InterfaceC0501l) this.f3494a).mo4374b(c0499j);
                }
                if (this.f3499f != null) {
                    this.f3498e = c0499j.f3492m;
                }
                m4392a(c0499j);
            }
            float cv = c0499j.f3481b * this.f3494a.m5798cv() * f;
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
                if (d2 > 0.0d && this.f3494a.team.f1358al.m5136a(c0499j.f3490d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || c0499j.f3490d.m5232c(this.f3494a, d2))) {
                    c0499j.f3493n += d2;
                } else {
                    if (!z2) {
                        this.f3494a.team.f1358al.m5135a(c0499j.f3490d, this.f3494a, d2);
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
                if (c0499j.f3483f && ((InterfaceC0501l) this.f3494a).mo4368dx()) {
                    this.f3498e = 1.0f;
                    return;
                }
                Team.m6369b((Unit) this.f3494a);
                this.f3498e = 0.0f;
                c0499j.f3480a--;
                if (c0499j.f3480a <= 0) {
                    List m4379f = m4379f();
                    if (m4379f.size() == 0) {
                        GameEngine.m1145b("-------------buildQueue empty for:" + c0499j.f3491j);
                        GameEngine.m1145b("-------------");
                    } else {
                        m4379f.remove(0);
                    }
                }
                Team.m6353c(this.f3494a);
                ((InterfaceC0501l) this.f3494a).mo4375a(c0499j);
                return;
            }
            return;
        }
        m4392a((C0499j) null);
        this.f3498e = 0.0f;
        if (this.f3497d.f6888a > 0) {
            C0499j c0499j2 = (C0499j) this.f3497d.get(0);
            if (c0499j2.f3481b > 10.0f && c0499j2.f3492m <= 0.0f) {
                c0499j2.f3492m = 1.0f;
                Action a = this.f3494a.m5893a(c0499j2.f3491j);
                if (a != null && a.m6092Q()) {
                    a.m6083a(this.f3494a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m4380e() {
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (this.f3494a.m5893a(c0499j.f3491j) == null) {
                m4384b(c0499j);
                m4382c(c0499j);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void m4388a(boolean z) {
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (z) {
                m4384b(c0499j);
            }
            m4382c(c0499j);
            it.remove();
        }
    }

    /* renamed from: b */
    private void m4384b(C0499j c0499j) {
        if (((InterfaceC0501l) this.f3494a).mo4373c(c0499j)) {
            if (c0499j.f3490d != null && c0499j.f3493n > 0.0d) {
                c0499j.f3490d.m5225a((Unit) this.f3494a, c0499j.f3493n, true);
            }
            c0499j.f3489c.m5185h(this.f3494a);
        }
    }

    /* renamed from: c */
    private void m4382c(C0499j c0499j) {
    }

    /* renamed from: a */
    public int m4395a(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        int i2 = this.f3496c.f6888a;
        if (i2 != 0) {
            Object[] m559a = this.f3496c.m559a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0499j c0499j = (C0499j) m559a[i3];
                if (c0499j.f3483f && c0499j.f3484g == interfaceC0303as) {
                    i += c0499j.f3480a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m4403a(C0208c c0208c, boolean z) {
        return m4402a(c0208c, z, false);
    }

    /* renamed from: a */
    public int m4393a(C0448g c0448g) {
        if (c0448g == null) {
            return this.f3496c.f6888a;
        }
        int i = 0;
        Iterator it = this.f3496c.iterator();
        while (it.hasNext()) {
            if (C0448g.m5062a(c0448g, ((C0499j) it.next()).f3482e)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m4402a(C0208c c0208c, boolean z, boolean z2) {
        int i = 0;
        if (this.f3496c.f6888a != 0) {
            Iterator it = this.f3496c.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (Action.f1461i == c0208c || c0499j.f3491j.equals(c0208c)) {
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
                if (Action.f1461i == c0208c || c0499j2.f3491j.equals(c0208c)) {
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
    public Action m4385b(InterfaceC0303as interfaceC0303as) {
        ArrayList N = this.f3494a.mo3520N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) N.get(i);
            if (action != null && (action instanceof AbstractC0228w)) {
                AbstractC0228w abstractC0228w = (AbstractC0228w) action;
                if (abstractC0228w.mo7517i() == interfaceC0303as) {
                    return abstractC0228w;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0499j m4399a(Action action, boolean z, PointF pointF, Unit unit) {
        if (action instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) action;
            if (!z) {
                if (action.mo4247a((Unit) this.f3494a, false) && action.mo4245b(this.f3494a)) {
                    if ((!abstractC0228w.mo6181g() || this.f3494a.team.m6307u() < this.f3494a.team.m6306v()) && abstractC0228w.m6105B().m5233c(this.f3494a)) {
                        return m4397a(abstractC0228w, false, pointF, unit);
                    }
                    return null;
                }
                return null;
            }
            C0499j m4386b = m4386b(abstractC0228w, false);
            if (m4386b != null) {
                m4384b(m4386b);
                m4382c(m4386b);
                return m4386b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m4400a(Action action, boolean z) {
        if (action instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) action;
            if (!z) {
                if (action.mo4247a((Unit) this.f3494a, true)) {
                    if ((!abstractC0228w.mo6181g() || this.f3494a.team.m6307u() < this.f3494a.team.m6306v()) && abstractC0228w.m6105B().m5204b(this.f3494a, action.m6092Q())) {
                        m4398a(abstractC0228w, true);
                    }
                }
            } else if (m4386b(abstractC0228w, true) != null) {
                abstractC0228w.m6105B().m5188e(this.f3494a, action.m6092Q());
            }
        }
    }

    /* renamed from: a */
    public void m4401a(Action action) {
        if (this.f3497d.size() != 0) {
            C0499j c0499j = null;
            Iterator it = this.f3497d.iterator();
            while (it.hasNext()) {
                C0499j c0499j2 = (C0499j) it.next();
                if (c0499j2.f3491j.equals(action.m6095N())) {
                    c0499j = c0499j2;
                }
            }
            if (c0499j != null) {
                if (!c0499j.f3487k) {
                    c0499j.f3489c.m5188e(this.f3494a, action.m6092Q());
                } else {
                    c0499j.f3489c.m5190d(this.f3494a, action.m6092Q());
                }
                this.f3497d.remove(c0499j);
            }
        }
    }

    /* renamed from: f */
    public List m4379f() {
        return this.f3496c;
    }

    /* renamed from: g */
    public C1101m m4378g() {
        return this.f3496c;
    }
}
