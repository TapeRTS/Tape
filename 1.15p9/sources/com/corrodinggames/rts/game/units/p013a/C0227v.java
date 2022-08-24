package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;

/* renamed from: com.corrodinggames.rts.game.units.a.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/v.class */
public class C0227v extends Action {

    /* renamed from: a */
    InterfaceC0303as f1488a;

    /* renamed from: b */
    int f1489b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C0227v c0227v = (C0227v) obj;
        if (this.f1489b != c0227v.f1489b || this.f1488a != c0227v.f1488a) {
            return false;
        }
        return super.equals(obj);
    }

    public C0227v(InterfaceC0303as interfaceC0303as) {
        this(interfaceC0303as, 1, null);
    }

    public C0227v(InterfaceC0303as interfaceC0303as, int i, Integer num) {
        super("b_" + interfaceC0303as.mo5696v());
        this.f1489b = 1;
        InterfaceC0303as m4738c = C0453l.m4738c(interfaceC0303as);
        if (m4738c != null) {
            interfaceC0303as = m4738c;
            m6082a("b_" + interfaceC0303as.mo5696v());
        }
        if (i != 1) {
            m6082a(m6095N() + "_" + i);
        }
        this.f1488a = interfaceC0303as;
        this.f1489b = i;
        if (num != null) {
            this.f1459g = num.intValue();
        }
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return this.f1488a;
    }

    /* renamed from: y */
    public InterfaceC0303as m6016y() {
        return this.f1488a;
    }

    /* renamed from: t */
    public int m6018t() {
        return this.f1489b;
    }

    /* renamed from: a */
    public String mo6189a() {
        String mo5709f = mo7517i().mo5709f();
        Unit m5847c = Unit.m5847c(mo7517i());
        if (this.f1489b != 1 && (m5847c instanceof AbstractC0623y)) {
            ((AbstractC0623y) m5847c).mo4213a(this.f1489b);
        }
        String str = mo5709f + "\n\n" + C0760a.m2216a(m5847c, false, false, true);
        if (this.f1489b != 1 && (m5847c instanceof AbstractC0623y)) {
            ((AbstractC0623y) m5847c).mo4213a(1);
        }
        return str;
    }

    /* renamed from: b */
    public String mo6187b() {
        InterfaceC0303as mo7517i = mo7517i();
        String mo5710e = mo7517i().mo5710e();
        if (!(mo7517i instanceof C0453l)) {
            if (m6018t() == 2) {
                mo5710e = mo5710e + " T-2";
            }
            if (m6018t() == 3) {
                mo5710e = mo5710e + " T-3";
            }
        }
        return mo5710e;
    }

    /* renamed from: c */
    public int mo6185c() {
        return m6034B().m5231a();
    }

    /* renamed from: B */
    public C0424b m6034B() {
        C0424b m6292a = this.f1460h.m6292a();
        if (m6292a != null) {
            return m6292a;
        }
        return mo7517i().mo5711d(m6018t());
    }

    /* renamed from: o_ */
    public C0424b m6021o_() {
        C0424b m6288b = this.f1460h.m6288b();
        if (m6288b != null) {
            return m6288b;
        }
        return mo7517i().mo5720B();
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1475b;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1468e;
    }

    /* renamed from: k_ */
    public boolean m6022k_() {
        return !mo7517i().mo5719C();
    }

    /* renamed from: g */
    public boolean m6024g(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (((mo7517i() == UnitType.f1763D || mo7517i() == UnitType.f1762C) && gameEngine.m1221N() && gameEngine.networkEngine.f5597aO.f5656i) || mo7517i().mo5695w()) {
            return true;
        }
        return super.m6068g(unit);
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: u */
    public boolean m6017u() {
        return true;
    }

    /* renamed from: D */
    public boolean m6033D() {
        return false;
    }

    /* renamed from: p */
    public float m6020p(Unit unit) {
        Unit m3228X;
        if ((unit instanceof AbstractC0623y) && (m3228X = ((AbstractC0623y) unit).m3228X()) != null && m3228X.f1623ck < 1.0f && m3228X.getUnitType() == mo7517i()) {
            return m3228X.f1623ck;
        }
        return -1.0f;
    }

    /* renamed from: r */
    public boolean m6019r(Unit unit) {
        return this.f1460h.m6289a(unit, true);
    }

    /* renamed from: b */
    public boolean m6030b(Unit unit) {
        return this.f1460h.m6289a(unit, false);
    }
}
