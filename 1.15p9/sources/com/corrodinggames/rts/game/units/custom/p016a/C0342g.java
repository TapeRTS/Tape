package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class C0342g extends AbstractC0228w {

    /* renamed from: a */
    public C0339d f2148a;

    /* renamed from: b */
    public C0463u f2149b;

    /* renamed from: c */
    public EnumC0340e f2150c;

    public C0342g(C0339d c0339d, C0463u c0463u) {
        super((String) null);
        this.f2150c = EnumC0340e.f2137b;
        String str = VariableScope.nullOrMissingString;
        m6082a((c0339d.f2055j != null ? str + c0339d.f2055j : str) + "_" + c0339d.f2047a);
        this.f2148a = c0339d;
        this.f2149b = c0463u;
        if (c0339d.f2079I != null) {
            this.f2149b = c0339d.f2079I;
        }
        this.f2150c = c0339d.f2135aK;
        if (this.f2150c == EnumC0340e.f2136a) {
            boolean z = false;
            boolean z2 = false;
            if (c0339d.f2092af != null && c0339d.f2093ag == null) {
                z2 = true;
            }
            if (c0339d.f2060p.m5197c()) {
                z = true;
                this.f2150c = EnumC0340e.f2138c;
            }
            if (z && !z2) {
                this.f2150c = EnumC0340e.f2138c;
            } else {
                this.f2150c = EnumC0340e.f2139d;
            }
            if (c0339d.f2078H != null) {
                this.f2150c = EnumC0340e.f2140e;
            }
        }
    }

    /* renamed from: P */
    public C0449h m5472P() {
        return this.f2148a.f2062r;
    }

    /* renamed from: F */
    public boolean m5478F() {
        return true;
    }

    /* renamed from: d */
    public boolean m5458d(Unit unit, boolean z) {
        return this.f2148a.f2125L;
    }

    /* renamed from: k */
    public boolean m5447k(Unit unit) {
        return this.f2148a.f2127N;
    }

    /* renamed from: l */
    public boolean m5446l(Unit unit) {
        return this.f2148a.f2128O;
    }

    /* renamed from: u */
    public boolean m5439u() {
        return super.m6012u();
    }

    /* renamed from: a */
    public boolean m5466a(Unit unit, boolean z) {
        C0451j c0451j = (C0451j) unit;
        if (!this.f2148a.f2126M && c0451j.mo4376a(m6095N(), z) > 0) {
            return false;
        }
        if (this.f2148a.f2064t != null) {
            if (z && m5471Q()) {
                if (!C0785ad.m2111a(this.f2148a.f2064t, c0451j)) {
                    return false;
                }
            } else if (!this.f2148a.f2064t.read(c0451j)) {
                return false;
            }
        }
        return super.mo4247a(unit, z);
    }

    /* renamed from: g */
    public boolean m5453g(Unit unit) {
        if (m5468a(unit, -1)) {
            return true;
        }
        return super.m6068g(unit);
    }

    /* renamed from: a */
    public boolean m5468a(Unit unit, int i) {
        if (this.f2148a.f2069y != null && (i == -1 || i == 1)) {
            if (!(unit instanceof C0451j)) {
                GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a custom unit");
                return false;
            } else if (this.f2148a.f2069y.read((C0451j) unit)) {
                return true;
            }
        }
        if (this.f2148a.f2071A != null && (i == -1 || i == 2)) {
            if (!(unit instanceof C0451j)) {
                GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a custom unit");
                return false;
            } else if (this.f2148a.f2071A.read((C0451j) unit)) {
                return true;
            }
        }
        if (this.f2148a.f2073C != null) {
            if (i == -1 || i == 3) {
                if (!(unit instanceof C0451j)) {
                    GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a custom unit");
                    return false;
                } else if (this.f2148a.f2073C.read((C0451j) unit)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public String m5448j(Unit unit) {
        if (m5468a(unit, 1) && this.f2148a.f2070z != null) {
            return this.f2148a.f2070z.m5372b(unit);
        }
        if (m5468a(unit, 2) && this.f2148a.f2072B != null) {
            return this.f2148a.f2072B.m5372b(unit);
        }
        if (m5468a(unit, 3) && this.f2148a.f2074D != null) {
            return this.f2148a.f2074D.m5372b(unit);
        }
        return super.m6063j(unit);
    }

    /* renamed from: r */
    public boolean m5442r(Unit unit) {
        C0451j c0451j = (C0451j) unit;
        if (this.f2148a.f2065u != null) {
            if (m5471Q()) {
                return C0785ad.m2111a(this.f2148a.f2065u, c0451j);
            }
            return this.f2148a.f2065u.read(c0451j);
        }
        return super.mo4245b(unit);
    }

    /* renamed from: b */
    public boolean m5463b(Unit unit) {
        C0451j c0451j = (C0451j) unit;
        if (this.f2148a.f2065u != null) {
            return this.f2148a.f2065u.read(c0451j);
        }
        return super.mo4245b(unit);
    }

    /* renamed from: a */
    public boolean m5467a(Unit unit, Team team) {
        if (!this.f2148a.f2066v && !this.f2148a.f2067w) {
            return false;
        }
        if (unit.team.m6342d(team)) {
            return this.f2148a.f2066v;
        }
        return this.f2148a.f2067w;
    }

    /* renamed from: o_ */
    public C0424b m5443o_() {
        C0424b m6288b = this.f1460h.m6288b();
        if (m6288b != null) {
            return m6288b;
        }
        return this.f2148a.f2061q;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        if (this.f2148a.f2117aF) {
            return this.f2148a.f2060p.m5222a(unit, true);
        }
        return super.mo6186b(unit, z);
    }

    /* renamed from: d */
    public String m5460d() {
        return super.m6077d();
    }

    /* renamed from: b */
    public String mo6187b() {
        String str = null;
        if (this.f2148a.f2049c != null) {
            str = this.f2148a.f2049c.m5373b();
        }
        return str;
    }

    /* renamed from: d */
    public String m5459d(Unit unit) {
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2148a.f2049c != null) {
            str = this.f2148a.f2049c.m5372b(unit);
        }
        if (this.f2148a.f2050d != null && (typeOrNull = this.f2148a.f2050d.getTypeOrNull(unit)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo5710e();
        }
        if (this.f2148a.f2053g != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f2148a.f2053g.m5339b();
        }
        return str;
    }

    /* renamed from: a */
    public String mo6189a() {
        String str = null;
        if (this.f2148a.f2054h != null) {
            str = this.f2148a.f2054h.m5373b();
        }
        return str;
    }

    /* renamed from: e */
    public String m5456e(Unit unit) {
        Unit unitReferenceOrNull;
        Unit unitOrSharedUnit;
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2148a.f2054h != null) {
            str = this.f2148a.f2054h.m5372b(unit);
        }
        if (this.f2148a.f2051e != null && (typeOrNull = this.f2148a.f2051e.getTypeOrNull(unit)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo5709f();
        }
        if (this.f2148a.f2052f != null) {
            if (this.f2148a.f2052f.getUnitReferenceOrNull(unit) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + C0760a.m2216a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f2148a.f2052f.getUnitOrSharedUnit(unit) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + C0760a.m2216a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: L */
    public boolean m5473L() {
        return this.f2148a.f2131T;
    }

    /* renamed from: K */
    public float m5474K() {
        if (this.f2148a.f2129R >= 1.0f) {
            return 1000.0f;
        }
        return this.f2148a.f2129R;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return this.f2148a.f2121i;
    }

    /* renamed from: B */
    public C0424b m5480B() {
        C0424b m6292a = this.f1460h.m6292a();
        if (m6292a != null) {
            return m6292a;
        }
        return this.f2148a.f2060p;
    }

    /* renamed from: c */
    public int mo6185c() {
        return m5480B().m5231a();
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        if (this.f2149b == null) {
            return null;
        }
        return this.f2149b.mo7518c();
    }

    /* renamed from: y */
    public InterfaceC0303as m5437y() {
        if (this.f2148a.f2079I != null) {
            return this.f2148a.f2079I.mo7518c();
        }
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as m5479E() {
        if (this.f2148a.f2078H != null) {
            return this.f2148a.f2078H.mo7518c();
        }
        return null;
    }

    /* renamed from: A */
    public boolean m5481A() {
        return true;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        if (this.f2148a.f2079I != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return this.f2148a.f2133aD;
    }

    /* renamed from: m */
    public boolean m5445m(Unit unit) {
        return this.f2148a.f2076F.read((C0451j) unit);
    }

    /* renamed from: n */
    public boolean m5444n(Unit unit) {
        if (this.f2148a.f2075E == null) {
            return false;
        }
        if (!(unit instanceof C0451j)) {
            GameEngine.m1145b("ai_isHighPriority non customUnit:" + unit.getUnitType().mo5706i());
            return false;
        }
        return this.f2148a.f2075E.read((C0451j) unit);
    }

    /* renamed from: v */
    public EnumC0340e m5438v(Unit unit) {
        return this.f2150c;
    }

    /* renamed from: H */
    public boolean m5477H() {
        return this.f2148a.f2123J;
    }

    /* renamed from: I */
    public boolean m5476I() {
        return this.f2148a.f2124K;
    }

    /* renamed from: j */
    public BitmapOrTexture mo6180j() {
        return this.f2148a.f2108av;
    }

    /* renamed from: h */
    public BitmapOrTexture m5452h(Unit unit) {
        if (this.f2148a.f2111ay != null && (unit instanceof C0451j) && !C0785ad.m2111a(this.f2148a.f2111ay, (C0451j) unit)) {
            return null;
        }
        return this.f2148a.f2109aw;
    }

    /* renamed from: J */
    public int m5475J() {
        return this.f2148a.f2110ax;
    }

    /* renamed from: i */
    public Unit m5450i(Unit unit) {
        if (this.f2148a.f2112az != null) {
            return this.f2148a.f2112az.getUnitOrSharedUnit(unit);
        }
        return null;
    }

    /* renamed from: s */
    public boolean m5441s(Unit unit) {
        return this.f2148a.f2113aA;
    }

    /* renamed from: t */
    public boolean m5440t(Unit unit) {
        return this.f2148a.f2114aB;
    }

    /* renamed from: a */
    public boolean m5469a(Unit unit) {
        if (this.f2148a.f2115aC != null) {
            return C0785ad.m2111a(this.f2148a.f2115aC, (C0451j) unit);
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m5471Q() {
        return this.f2148a.f2059n;
    }

    /* renamed from: a */
    public void m5465a(AbstractC0623y abstractC0623y) {
        if (this.f2148a.f2090ad != null) {
            C0785ad.m2109b(abstractC0623y, this.f2148a.f2090ad);
        }
    }
}
