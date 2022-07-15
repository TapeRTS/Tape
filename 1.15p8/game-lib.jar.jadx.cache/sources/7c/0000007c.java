package com.corrodinggames.rts.game.units.custom.p015a;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.C0445u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.gui.BattleInterface;
import com.corrodinggames.rts.gameFramework.gui.C0704ad;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class C0330g extends AbstractC0222w {

    /* renamed from: a */
    public C0327d f2085a;

    /* renamed from: b */
    public C0445u f2086b;

    /* renamed from: c */
    public EnumC0328e f2087c;

    public C0330g(C0327d c0327d, C0445u c0445u) {
        super((String) null);
        this.f2087c = EnumC0328e.disabled;
        String str = VariableScope.nullOrMissingString;
        m3829a((c0327d.f2042j != null ? str + c0327d.f2042j : str) + "_" + c0327d.f2003a);
        this.f2085a = c0327d;
        this.f2086b = c0445u;
        if (c0327d.f1993G != null) {
            this.f2086b = c0327d.f1993G;
        }
        this.f2087c = c0327d.f2072aH;
        if (this.f2087c == EnumC0328e.auto) {
            boolean z = false;
            boolean z2 = false;
            if (c0327d.f2012ad != null && c0327d.f2013ae == null) {
                z2 = true;
            }
            if (c0327d.f2047p.m3379c()) {
                z = true;
                this.f2087c = EnumC0328e.upgrade;
            }
            if (z && !z2) {
                this.f2087c = EnumC0328e.upgrade;
            } else {
                this.f2087c = EnumC0328e.movementChange;
            }
            if (c0327d.f1992F != null) {
                this.f2087c = EnumC0328e.sameAsBuilding;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: D */
    public boolean mo3615D() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: d */
    public boolean mo3605d(Unit unit, boolean z) {
        return this.f2085a.f2062J;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: k */
    public boolean mo3599k(Unit unit) {
        return this.f2085a.f2064L;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: l */
    public boolean mo3598l(Unit unit) {
        return this.f2085a.f2065M;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w, com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: r */
    public boolean mo3594r() {
        return super.mo3594r();
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean isActive(Unit unit, boolean z) {
        C0433j c0433j = (C0433j) unit;
        if (!this.f2085a.f2063K && c0433j.mo2915a(m3834L(), z) > 0) {
            return false;
        }
        if (this.f2085a.f2050s != null) {
            if (z && mo3610N()) {
                if (!C0704ad.m1964a(this.f2085a.f2050s, c0433j)) {
                    return false;
                }
            } else if (!this.f2085a.f2050s.read(c0433j)) {
                return false;
            }
        }
        return super.isActive(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: g */
    public boolean mo3603g(Unit unit) {
        if (m3609a(unit, -1)) {
            return true;
        }
        return super.mo3603g(unit);
    }

    /* renamed from: a */
    public boolean m3609a(Unit unit, int i) {
        if (this.f2085a.f2054w != null && (i == -1 || i == 1)) {
            if (!(unit instanceof C0433j)) {
                GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a custom unit");
                return false;
            } else if (this.f2085a.f2054w.read((C0433j) unit)) {
                return true;
            }
        }
        if (this.f2085a.f2056y != null && (i == -1 || i == 2)) {
            if (!(unit instanceof C0433j)) {
                GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a custom unit");
                return false;
            } else if (this.f2085a.f2056y.read((C0433j) unit)) {
                return true;
            }
        }
        if (this.f2085a.f1987A != null) {
            if (i == -1 || i == 3) {
                if (!(unit instanceof C0433j)) {
                    GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a custom unit");
                    return false;
                } else if (this.f2085a.f1987A.read((C0433j) unit)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: j */
    public String mo3600j(Unit unit) {
        if (m3609a(unit, 1) && this.f2085a.f2055x != null) {
            return this.f2085a.f2055x.m3521b(unit);
        }
        if (m3609a(unit, 2) && this.f2085a.f2057z != null) {
            return this.f2085a.f2057z.m3521b(unit);
        }
        if (m3609a(unit, 3) && this.f2085a.f1988B != null) {
            return this.f2085a.f1988B.m3521b(unit);
        }
        return super.mo3600j(unit);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: r */
    public boolean mo3593r(Unit unit) {
        C0433j c0433j = (C0433j) unit;
        if (this.f2085a.f2051t != null) {
            if (mo3610N()) {
                return C0704ad.m1964a(this.f2085a.f2051t, c0433j);
            }
            return this.f2085a.f2051t.read(c0433j);
        }
        return super.isAvailable(unit);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public boolean isAvailable(Unit unit) {
        C0433j c0433j = (C0433j) unit;
        if (this.f2085a.f2051t != null) {
            return this.f2085a.f2051t.read(c0433j);
        }
        return super.isAvailable(unit);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean mo3608a(Unit unit, Team team) {
        if (!this.f2085a.f2052u && !this.f2085a.f2053v) {
            return false;
        }
        if (unit.team.m3913d(team)) {
            return this.f2085a.f2052u;
        }
        return this.f2085a.f2053v;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: o_ */
    public C0407b mo3595o_() {
        C0407b mo3620b = this.f1436g.mo3620b();
        if (mo3620b != null) {
            return mo3620b;
        }
        return this.f2085a.f2048q;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w, com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public int mo2738b(Unit unit, boolean z) {
        if (this.f2085a.f2005aC) {
            return this.f2085a.f2047p.m3400a(unit, true);
        }
        return super.mo2738b(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: d */
    public String mo2699d() {
        return super.mo2699d();
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public String getText() {
        String str = null;
        if (this.f2085a.f2036c != null) {
            str = this.f2085a.f2036c.m3522b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: d */
    public String mo3606d(Unit unit) {
        UnitType typeOrNull;
        String str = null;
        if (this.f2085a.f2036c != null) {
            str = this.f2085a.f2036c.m3521b(unit);
        }
        if (this.f2085a.f2037d != null && (typeOrNull = this.f2085a.f2037d.getTypeOrNull(unit)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3095e();
        }
        if (this.f2085a.f2040g != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f2085a.f2040g.m3488b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public String getDescription() {
        String str = null;
        if (this.f2085a.f2041h != null) {
            str = this.f2085a.f2041h.m3522b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: e */
    public String mo3604e(Unit unit) {
        Unit unitReferenceOrNull;
        Unit unitOrSharedUnit;
        UnitType typeOrNull;
        String str = null;
        if (this.f2085a.f2041h != null) {
            str = this.f2085a.f2041h.m3521b(unit);
        }
        if (this.f2085a.f2038e != null && (typeOrNull = this.f2085a.f2038e.getTypeOrNull(unit)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3093f();
        }
        if (this.f2085a.f2039f != null) {
            if (this.f2085a.f2039f.getUnitReferenceOrNull(unit) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + BattleInterface.m2056a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f2085a.f2039f.getUnitOrSharedUnit(unit) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + BattleInterface.m2056a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: J */
    public boolean m3611J() {
        return this.f2085a.f2068R;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
    /* renamed from: I */
    public float getBuildSpeed() {
        if (this.f2085a.f2066P >= 1.0f) {
            return 1000.0f;
        }
        return this.f2085a.f2066P;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w, com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: e */
    public EnumC0220u mo2698e() {
        return this.f2085a.f2058i;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: z */
    public C0407b mo3586z() {
        C0407b mo3627a = this.f1436g.mo3627a();
        if (mo3627a != null) {
            return mo3627a;
        }
        return this.f2085a.f2047p;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: c */
    public int getPrice() {
        return mo3586z().m3406a();
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: i */
    public UnitType mo2734i() {
        if (this.f2086b == null) {
            return null;
        }
        return this.f2086b.mo3049c();
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: w */
    public UnitType mo3588w() {
        if (this.f2085a.f1993G != null) {
            return this.f2085a.f1993G.mo3049c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: C */
    public UnitType mo3616C() {
        if (this.f2085a.f1992F != null) {
            return this.f2085a.f1992F.mo3049c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: y */
    public boolean mo3587y() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: g */
    public boolean mo2735g() {
        if (this.f2085a.f1993G != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: f */
    public EnumC0219t mo2697f() {
        return this.f2085a.f2070aA;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: m */
    public boolean mo3597m(Unit unit) {
        return this.f2085a.f1990D.read((C0433j) unit);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: n */
    public boolean mo3596n(Unit unit) {
        if (this.f2085a.f1989C == null) {
            return false;
        }
        if (!(unit instanceof C0433j)) {
            GameEngine.log("ai_isHighPriority non customUnit:" + unit.getUnitType().mo3087i());
            return false;
        }
        return this.f2085a.f1989C.read((C0433j) unit);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: u */
    public EnumC0328e mo3589u(Unit unit) {
        return this.f2087c;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: F */
    public boolean mo3614F() {
        return this.f2085a.f2060H;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: G */
    public boolean mo3613G() {
        return this.f2085a.f2061I;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: s */
    public BitmapOrTexture mo3592s() {
        return this.f2085a.f2027as;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: h */
    public BitmapOrTexture mo3602h(Unit unit) {
        if (this.f2085a.f2030av != null && (unit instanceof C0433j) && !C0704ad.m1964a(this.f2085a.f2030av, (C0433j) unit)) {
            return null;
        }
        return this.f2085a.f2028at;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: H */
    public int mo3612H() {
        return this.f2085a.f2029au;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: i */
    public Unit mo3601i(Unit unit) {
        if (this.f2085a.f2031aw != null) {
            return this.f2085a.f2031aw.getUnitOrSharedUnit(unit);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: s */
    public boolean mo3591s(Unit unit) {
        return this.f2085a.f2032ax;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: t */
    public boolean mo3590t(Unit unit) {
        return this.f2085a.f2033ay;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean mo2732a(Unit unit) {
        if (this.f2085a.f2034az != null) {
            return C0704ad.m1964a(this.f2085a.f2034az, (C0433j) unit);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: N */
    public boolean mo3610N() {
        return this.f2085a.f2046n;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public void mo3607a(OrderableUnit orderableUnit) {
        if (this.f2085a.f2010ab != null) {
            C0704ad.m1962b(orderableUnit, this.f2085a.f2010ab);
        }
    }
}