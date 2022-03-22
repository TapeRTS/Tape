package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0599a;

/* renamed from: com.corrodinggames.rts.game.units.a.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/v.class */
public class C0200v extends AbstractC0197s {

    /* renamed from: a */
    AbstractC0268al f1383a;

    /* renamed from: b */
    int f1384b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C0200v vVar = (C0200v) obj;
        if (this.f1384b == vVar.f1384b && this.f1383a == vVar.f1383a) {
            return super.equals(obj);
        }
        return false;
    }

    public C0200v(AbstractC0268al alVar) {
        this(alVar, 1, null);
    }

    public C0200v(AbstractC0268al alVar, int i, Integer num) {
        super("b_" + alVar.mo3484v());
        this.f1384b = 1;
        AbstractC0268al c = C0368l.m2933c(alVar);
        if (c != null) {
            alVar = c;
            m3685a("b_" + alVar.mo3484v());
        }
        if (i != 1) {
            m3685a(m3690J() + "_" + i);
        }
        this.f1383a = alVar;
        this.f1384b = i;
        if (num != null) {
            this.f1354f = num.intValue();
        }
    }

    /* renamed from: i */
    public AbstractC0268al mo2686i() {
        return this.f1383a;
    }

    /* renamed from: v */
    public AbstractC0268al mo3370v() {
        return this.f1383a;
    }

    /* renamed from: p */
    public int mo3677p() {
        return this.f1384b;
    }

    /* renamed from: a */
    public String mo2464a() {
        String f = mo2686i().mo3497f();
        AbstractC0210af c = AbstractC0210af.m3593c(mo2686i());
        if (this.f1384b != 1 && (c instanceof AbstractC0515r)) {
            ((AbstractC0515r) c).mo2603a(this.f1384b);
        }
        String str = f + "\n\n" + C0599a.m1907a(c, false, false, true);
        if (this.f1384b != 1 && (c instanceof AbstractC0515r)) {
            ((AbstractC0515r) c).mo2603a(1);
        }
        return str;
    }

    /* renamed from: b */
    public String mo2463b() {
        AbstractC0268al i = mo2686i();
        String e = mo2686i().mo3498e();
        if (!(i instanceof C0368l)) {
            if (mo3677p() == 2) {
                e = e + " T-2";
            }
            if (mo3677p() == 3) {
                e = e + " T-3";
            }
        }
        return e;
    }

    /* renamed from: c */
    public int mo2688c() {
        return mo3368y().m3156a();
    }

    /* renamed from: y */
    public C0363g mo3368y() {
        C0363g a = this.f1355g.mo3407a();
        if (a != null) {
            return a;
        }
        return mo2686i().mo3499d(mo3677p());
    }

    /* renamed from: b */
    public int mo2621b(AbstractC0210af afVar, boolean z) {
        return -1;
    }

    /* renamed from: e */
    public EnumC0199u mo2461e() {
        return EnumC0199u.f1370b;
    }

    /* renamed from: f */
    public EnumC0198t mo2460f() {
        return EnumC0198t.f1363e;
    }

    /* renamed from: k_ */
    public boolean mo3678k_() {
        return !mo2686i().mo3506B();
    }

    /* renamed from: h */
    public boolean mo3383h(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (((mo2686i() == EnumC0215ak.f1613D || mo2686i() == EnumC0215ak.f1612C) && u.m766H() && u.f5486bF.f4763aH.f4818i) || mo2686i().mo3483w()) {
            return true;
        }
        return super.mo3383h(afVar);
    }

    /* renamed from: g */
    public boolean mo2687g() {
        return false;
    }

    /* renamed from: q */
    public boolean mo3375q() {
        return true;
    }

    /* renamed from: A */
    public boolean mo3692A() {
        return false;
    }

    /* renamed from: q */
    public float mo3668q(AbstractC0210af afVar) {
        AbstractC0210af V;
        if ((afVar instanceof AbstractC0515r) && (V = ((AbstractC0515r) afVar).m2390V()) != null && V.f1529bR < 1.0f && V.mo1660r() == mo2686i()) {
            return V.f1529bR;
        }
        return -1.0f;
    }

    /* renamed from: s */
    public boolean mo3373s(AbstractC0210af afVar) {
        return this.f1355g.mo3403a(afVar, true);
    }

    /* renamed from: a */
    public boolean mo2465a(AbstractC0210af afVar) {
        return this.f1355g.mo3403a(afVar, false);
    }
}
