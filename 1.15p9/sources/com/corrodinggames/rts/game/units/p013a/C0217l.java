package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;

/* renamed from: com.corrodinggames.rts.game.units.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class C0217l extends AbstractC0228w {

    /* renamed from: a */
    InterfaceC0303as f1457a;

    public C0217l(InterfaceC0303as interfaceC0303as, Integer num) {
        super("u_" + interfaceC0303as.mo5696v());
        InterfaceC0303as m4738c = C0453l.m4738c(interfaceC0303as);
        if (m4738c != null) {
            interfaceC0303as = m4738c;
            m6082a("u_" + interfaceC0303as.mo5696v());
        }
        if (num != null) {
            this.f1459g = num.intValue();
        }
        this.f1457a = interfaceC0303as;
    }

    /* renamed from: a */
    public String mo6189a() {
        return this.f1457a.mo5709f() + "\n\n" + C0760a.m2216a(Unit.m5847c(this.f1457a), false, false, true);
    }

    /* renamed from: b */
    public String mo6187b() {
        return this.f1457a.mo5710e();
    }

    /* renamed from: c */
    public int mo6185c() {
        return m6172B().m5231a();
    }

    /* renamed from: B */
    public C0424b m6172B() {
        C0424b m6292a = this.f1460h.m6292a();
        if (m6292a != null) {
            return m6292a;
        }
        return this.f1457a.mo5697u();
    }

    /* renamed from: o_ */
    public C0424b m6162o_() {
        C0424b m6288b = this.f1460h.m6288b();
        if (m6288b != null) {
            return m6288b;
        }
        return this.f1457a.mo5720B();
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return this.f1457a;
    }

    /* renamed from: K */
    public float m6171K() {
        return this.f1457a.mo5718D();
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1467d;
    }

    /* renamed from: k_ */
    public boolean m6163k_() {
        return !this.f1457a.mo5719C();
    }

    /* renamed from: g */
    public boolean m6165g(Unit unit) {
        if (mo7517i().mo5695w()) {
            return true;
        }
        return super.m6068g(unit);
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return true;
    }
}
