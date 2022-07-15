package com.corrodinggames.rts.game.units.custom.p015a;

import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0338ah;
import com.corrodinggames.rts.game.units.custom.C0440p;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.C0200a;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.gui.C0704ad;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/c.class */
public class C0326c extends C0200a {

    /* renamed from: b */
    public LogicBoolean f1976b;

    /* renamed from: c */
    public LogicBoolean f1977c;

    /* renamed from: d */
    public C0338ah f1978d;

    /* renamed from: e */
    public LogicBoolean f1979e;

    /* renamed from: f */
    public C0338ah f1980f;

    /* renamed from: g */
    public LogicBoolean f1981g;

    /* renamed from: h */
    public C0338ah f1982h;

    /* renamed from: i */
    public LogicBoolean f1983i;

    /* renamed from: j */
    public C0407b f1984j;

    /* renamed from: k */
    public C0407b f1985k;

    /* renamed from: l */
    public C0407b f1986l;

    /* renamed from: a */
    public static C0200a m3622a(C0327d c0327d) {
        boolean z = false;
        if (c0327d.f2054w != null && c0327d.f2054w != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0327d.f2056y != null && c0327d.f2056y != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0327d.f1987A != null && c0327d.f1987A != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0327d.f2051t != null && c0327d.f2051t != LogicBoolean.trueBoolean) {
            z = true;
        }
        if (c0327d.f2034az != null && c0327d.f2034az != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0327d.f2010ab != null) {
            z = true;
        }
        if (c0327d.f2047p != null) {
            z = true;
        }
        if (!z) {
            return C0200a.f1400a;
        }
        C0326c c0326c = new C0326c();
        c0326c.f1977c = c0327d.f2054w;
        c0326c.f1978d = c0327d.f2055x;
        c0326c.f1979e = c0327d.f2056y;
        c0326c.f1980f = c0327d.f2057z;
        c0326c.f1981g = c0327d.f1987A;
        c0326c.f1982h = c0327d.f1988B;
        c0326c.f1976b = c0327d.f2051t;
        c0326c.f1983i = c0327d.f2034az;
        c0326c.f1985k = c0327d.f2010ab;
        c0326c.f1984j = c0327d.f2047p;
        c0326c.f1986l = c0327d.f2048q;
        return c0326c;
    }

    /* renamed from: a */
    public static C0200a m3621a(C0440p c0440p) {
        boolean z = false;
        if (c0440p.f3151f != null && c0440p.f3151f != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (!z) {
            return C0200a.f1400a;
        }
        C0326c c0326c = new C0326c();
        c0326c.f1977c = c0440p.f3151f;
        c0326c.f1978d = C0338ah.m3526a(c0440p.f3152g);
        return c0326c;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: a */
    public boolean mo3626a(Unit unit) {
        return m3625a(unit, -1);
    }

    /* renamed from: a */
    public boolean m3625a(Unit unit, int i) {
        if (this.f1977c != null && (i == -1 || i == 1)) {
            if (!(unit instanceof OrderableUnit)) {
                GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f1977c.read((OrderableUnit) unit)) {
                return true;
            }
        }
        if (this.f1979e != null && (i == -1 || i == 2)) {
            if (!(unit instanceof OrderableUnit)) {
                GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f1979e.read((OrderableUnit) unit)) {
                return true;
            }
        }
        if (this.f1981g != null) {
            if (i == -1 || i == 3) {
                if (!(unit instanceof OrderableUnit)) {
                    GameEngine.m805n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo3087i() + " is not a OrderableUnit unit");
                    return false;
                } else if (this.f1981g.read((OrderableUnit) unit)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: b */
    public String mo3619b(Unit unit) {
        if (m3625a(unit, 1) && this.f1978d != null) {
            return this.f1978d.m3521b(unit);
        }
        if (m3625a(unit, 2) && this.f1980f != null) {
            return this.f1980f.m3521b(unit);
        }
        if (m3625a(unit, 3) && this.f1982h != null) {
            return this.f1982h.m3521b(unit);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: a */
    public boolean mo3623a(Unit unit, boolean z) {
        if (this.f1976b != null) {
            if (!(unit instanceof OrderableUnit)) {
                GameEngine.m805n("CustomActionConfig isAvailable:" + unit.getUnitType().mo3087i() + " is not a OrderableUnit unit");
                return true;
            } else if (z) {
                return C0704ad.m1964a(this.f1976b, (OrderableUnit) unit);
            } else {
                return this.f1976b.read((OrderableUnit) unit);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: c */
    public boolean mo3618c(Unit unit) {
        if (this.f1983i != null) {
            if (!(unit instanceof OrderableUnit)) {
                GameEngine.m805n("CustomActionConfig isGuiBlinking:" + unit.getUnitType().mo3087i() + " is not a OrderableUnit unit");
                return true;
            }
            return this.f1983i.read((OrderableUnit) unit);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: a */
    public void mo3624a(Unit unit, Unit unit2) {
        if (this.f1985k != null) {
            this.f1985k.m3367h(unit);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: a */
    public C0407b mo3627a() {
        return this.f1984j;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.C0200a
    /* renamed from: b */
    public C0407b mo3620b() {
        return this.f1986l;
    }
}