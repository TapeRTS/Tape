package com.corrodinggames.rts.gameFramework.p045m.p046a;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p045m.C1030a;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a/c.class */
public class C1033c extends AbstractC1031a {

    /* renamed from: a */
    Integer f6622a;

    /* renamed from: b */
    Integer f6623b;

    /* renamed from: c */
    Team f6624c;

    /* renamed from: d */
    InterfaceC0303as f6625d;

    /* renamed from: e */
    boolean f6626e;

    /* renamed from: f */
    boolean f6627f;

    /* renamed from: g */
    boolean f6628g;

    /* renamed from: h */
    boolean f6629h;

    /* renamed from: i */
    boolean f6630i;

    /* renamed from: j */
    boolean f6631j;

    /* renamed from: k */
    int f6632k;

    /* renamed from: l */
    boolean f6633l;

    /* renamed from: m */
    boolean f6634m;

    /* renamed from: n */
    boolean f6635n;

    /* renamed from: o */
    C0448g f6636o;

    /* renamed from: p */
    boolean f6637p;

    /* renamed from: d */
    public static C1033c m840d(C1030a c1030a) {
        C1033c c1033c = new C1033c();
        c1033c.f6622a = c1030a.m850d("maxUnits");
        int i = 1;
        if (c1033c.f6622a != null) {
            i = 0;
        }
        c1033c.f6623b = Integer.valueOf(c1030a.m864a("minUnits", i));
        c1033c.f6624c = c1030a.m869a();
        InterfaceC0303as interfaceC0303as = null;
        String m856b = c1030a.m856b("unitType");
        if (m856b != null) {
            interfaceC0303as = UnitType.m5734a(m856b);
            if (interfaceC0303as == null) {
                c1030a.m847g("Cound not find unitType:" + m856b);
            }
        }
        c1033c.f6625d = interfaceC0303as;
        c1033c.f6626e = c1030a.m860a("onlybuildings", "onlyBuildings", false);
        c1033c.f6628g = c1030a.m859a("onlyMainBuildings", false);
        c1033c.f6629h = c1030a.m859a("onlyOnResourcePool", false);
        c1033c.f6627f = c1030a.m860a("onlyidle", "onlyIdle", false);
        c1033c.f6632k = c1030a.m864a("onlyTechLevel", -1);
        c1033c.f6631j = c1030a.m859a("onlyBuilders", false);
        c1033c.f6630i = c1030a.m859a("onlyEmptyQueue", false);
        c1033c.f6633l = c1030a.m859a("onlyAttack", false);
        c1033c.f6634m = c1030a.m859a("onlyAttackAir", false);
        c1033c.f6635n = c1030a.m859a("onlyIfEmpty", false);
        String m856b2 = c1030a.m856b("onlyWithTag");
        if (m856b2 != null && !m856b2.equals(VariableScope.nullOrMissingString)) {
            try {
                c1033c.f6636o = C0448g.m5055b(m856b2);
            } catch (C0412bm e) {
                throw new C0179f(e.getMessage());
            }
        }
        c1033c.f6637p = c1030a.m859a("includeIncomplete", false);
        return c1033c;
    }

    /* renamed from: b */
    public boolean mo843b(C1030a c1030a) {
        return m839e(c1030a);
    }

    /* renamed from: e */
    public boolean m839e(C1030a c1030a) {
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if ((this.f6624c == null || unit.team == this.f6624c) && (unit instanceof AbstractC0623y) && unit.f1650cL == null && c1030a.m868a(unit) && (this.f6625d == null || unit.getUnitType() == this.f6625d)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if ((this.f6637p || unit.isActive()) && ((!this.f6633l || unit.canAttack()) && ((!this.f6634m || (unit.canAttack() && abstractC0623y.canAttackFly())) && ((!this.f6626e || unit.m5867bI()) && ((!this.f6628g || (unit.m5867bI() && unit.mo4495bJ())) && ((!this.f6629h || unit.getUnitType().mo5699p()) && ((!this.f6631j || unit.mo3142ak()) && ((!this.f6627f || abstractC0623y.m3136aq()) && ((!this.f6630i || abstractC0623y.m5885a((C0448g) null) <= 0) && ((this.f6632k == -1 || unit.mo3230V() == this.f6632k) && ((this.f6636o == null || C0448g.m5062a(this.f6636o, unit.m5787dc())) && (!this.f6635n || abstractC0623y.mo5935bB() <= 0)))))))))))) {
                    i++;
                }
            }
        }
        if (i >= this.f6623b.intValue()) {
            if (this.f6622a == null || i <= this.f6622a.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
