package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.C0499j;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/s.class */
public final class C0202s {

    /* renamed from: b */
    public int f1400b;

    /* renamed from: c */
    public int f1401c;

    /* renamed from: d */
    public int f1402d;

    /* renamed from: e */
    public int f1403e;

    /* renamed from: f */
    public int f1404f;

    /* renamed from: g */
    public int f1405g;

    /* renamed from: m */
    public boolean f1411m;

    /* renamed from: a */
    public int f1399a = 5;

    /* renamed from: h */
    public C0439f f1406h = new C0439f();

    /* renamed from: i */
    public C0439f f1407i = new C0439f();

    /* renamed from: j */
    public C0439f f1408j = new C0439f();

    /* renamed from: k */
    public C0439f f1409k = new C0439f();

    /* renamed from: l */
    public C0439f f1410l = new C0439f();

    /* renamed from: n */
    public C0203t f1412n = new C0203t();

    /* renamed from: o */
    public C0203t f1413o = new C0203t();

    /* renamed from: a */
    public void m6301a(Unit unit) {
        this.f1402d++;
        if (unit.f1623ck < 1.0f) {
            this.f1404f++;
        } else {
            this.f1401c++;
        }
        if (!unit.getUnitType().mo5704k()) {
            this.f1400b++;
        }
        if (!this.f1411m && !unit.m5755u() && unit.getUnitType().mo5693y()) {
            this.f1411m = true;
        }
        C0424b m5775do = unit.m5775do();
        if (m5775do != null) {
            this.f1409k.m5124a(m5775do, 0.0d, Double.MAX_VALUE);
            this.f1410l.m5124a(m5775do, -1.7976931348623157E308d, 0.0d);
        }
        if (unit instanceof InterfaceC0501l) {
            InterfaceC0501l interfaceC0501l = (InterfaceC0501l) unit;
            int mo4367f = interfaceC0501l.mo4367f(false);
            this.f1400b += mo4367f;
            this.f1403e += mo4367f;
            if (mo4367f != 0) {
                m6299a(interfaceC0501l);
            }
        }
        m6296c(unit);
        float mo4491cw = unit.mo4491cw();
        if (mo4491cw != 0.0f && unit.f1623ck >= 1.0f) {
            this.f1405g = (int) (this.f1405g + mo4491cw);
        }
        C0439f m5796cy = unit.m5796cy();
        if (!m5796cy.m5100c() && unit.f1623ck >= 1.0f) {
            this.f1406h.m5106b(m5796cy);
            this.f1407i.m5119a(m5796cy, 0.0d, Double.MAX_VALUE);
            this.f1408j.m5119a(m5796cy, -1.7976931348623157E308d, 0.0d);
        }
    }

    /* renamed from: b */
    public void m6298b(Unit unit) {
        this.f1402d--;
        if (unit.f1623ck < 1.0f) {
            this.f1404f--;
        } else {
            this.f1401c--;
        }
        if (!unit.getUnitType().mo5704k()) {
            this.f1400b--;
        }
        C0424b m5775do = unit.m5775do();
        if (m5775do != null) {
            this.f1409k.m5109b(m5775do, 0.0d, Double.MAX_VALUE);
            this.f1410l.m5109b(m5775do, -1.7976931348623157E308d, 0.0d);
        }
        if (unit instanceof InterfaceC0501l) {
            InterfaceC0501l interfaceC0501l = (InterfaceC0501l) unit;
            int mo4367f = interfaceC0501l.mo4367f(false);
            this.f1400b -= mo4367f;
            this.f1403e -= mo4367f;
            if (mo4367f != 0) {
                m6297b(interfaceC0501l);
            }
        }
        m6295d(unit);
        float mo4491cw = unit.mo4491cw();
        if (mo4491cw != 0.0f && unit.f1623ck >= 1.0f) {
            this.f1405g = (int) (this.f1405g - mo4491cw);
        }
        C0439f m5796cy = unit.m5796cy();
        if (!m5796cy.m5100c() && unit.f1623ck >= 1.0f) {
            this.f1406h.m5097c(m5796cy);
            this.f1407i.m5104b(m5796cy, 0.0d, Double.MAX_VALUE);
            this.f1408j.m5104b(m5796cy, -1.7976931348623157E308d, 0.0d);
        }
    }

    /* renamed from: c */
    private final void m6296c(Unit unit) {
        C0449h m5787dc = unit.m5787dc();
        if (m5787dc != null) {
            for (C0448g c0448g : m5787dc.f2837a) {
                C0199p m6300a = m6300a(c0448g);
                if (unit.f1623ck < 1.0f) {
                    m6300a.f1386c++;
                } else {
                    m6300a.f1385b++;
                }
            }
        }
    }

    /* renamed from: d */
    private final void m6295d(Unit unit) {
        C0449h m5787dc = unit.m5787dc();
        if (m5787dc != null) {
            for (C0448g c0448g : m5787dc.f2837a) {
                C0199p m6300a = m6300a(c0448g);
                if (unit.f1623ck < 1.0f) {
                    m6300a.f1386c--;
                } else {
                    m6300a.f1385b--;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m6299a(InterfaceC0501l interfaceC0501l) {
        InterfaceC0303as interfaceC0303as;
        C0449h mo5694x;
        C1101m mo4371du = interfaceC0501l.mo4371du();
        if (mo4371du.f6888a != 0) {
            Iterator it = mo4371du.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (c0499j.f3483f && (interfaceC0303as = c0499j.f3484g) != null && (mo5694x = interfaceC0303as.mo5694x()) != null) {
                    for (C0448g c0448g : mo5694x.f2837a) {
                        m6300a(c0448g).f1387d += c0499j.f3480a;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m6297b(InterfaceC0501l interfaceC0501l) {
        InterfaceC0303as interfaceC0303as;
        C0449h mo5694x;
        C1101m mo4371du = interfaceC0501l.mo4371du();
        if (mo4371du.f6888a != 0) {
            Iterator it = mo4371du.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (c0499j.f3483f && (interfaceC0303as = c0499j.f3484g) != null && (mo5694x = interfaceC0303as.mo5694x()) != null) {
                    for (C0448g c0448g : mo5694x.f2837a) {
                        m6300a(c0448g).f1387d -= c0499j.f3480a;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0199p m6300a(C0448g c0448g) {
        C0199p[] c0199pArr = this.f1413o.f1415b;
        int i = this.f1413o.f1416c;
        for (int i2 = 0; i2 < i; i2++) {
            C0199p c0199p = c0199pArr[i2];
            if (c0199p.f1384a == c0448g) {
                return c0199p;
            }
            if (c0199p.f1384a == null) {
                c0199p.f1384a = c0448g;
                return c0199p;
            }
        }
        C0199p c0199p2 = new C0199p();
        c0199p2.f1384a = c0448g;
        this.f1413o.m6294a(c0199p2);
        return c0199p2;
    }
}
