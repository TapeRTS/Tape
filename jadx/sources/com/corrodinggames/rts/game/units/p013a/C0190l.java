package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.p032d.C0599a;

/* renamed from: com.corrodinggames.rts.game.units.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class C0190l extends AbstractC0201w {

    /* renamed from: a */
    AbstractC0268al f1352a;

    public C0190l(AbstractC0268al alVar, Integer num) {
        super("u_" + alVar.mo2734v());
        AbstractC0268al c = C0368l.m2768c(alVar);
        if (c != null) {
            alVar = c;
            m3382a("u_" + alVar.mo2734v());
        }
        if (num != null) {
            this.f1354f = num.intValue();
        }
        this.f1352a = alVar;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return this.f1352a.mo2760f() + "\n\n" + C0599a.m1852a(AbstractC0210af.m3310c(this.f1352a), false, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return this.f1352a.mo2762e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return mo3154y().m2942a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: y */
    public C0363g mo3154y() {
        C0363g a = this.f1355g.mo3192a();
        if (a != null) {
            return a;
        }
        return this.f1352a.mo2735u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        return this.f1352a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
    /* renamed from: t */
    public float mo2543t() {
        return this.f1352a.mo2801C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.queueUnit;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k_ */
    public boolean mo3370k_() {
        return !this.f1352a.mo2802B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo3169h(AbstractC0210af afVar) {
        if (mo2412i().mo2733w()) {
            return true;
        }
        return super.mo3169h(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return true;
    }
}
