package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0458p;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.C0206a;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/c.class */
public class C0338c extends C0206a {

    /* renamed from: b */
    public LogicBoolean f2035b;

    /* renamed from: c */
    public LogicBoolean f2036c;

    /* renamed from: d */
    public C0351ai f2037d;

    /* renamed from: e */
    public LogicBoolean f2038e;

    /* renamed from: f */
    public C0351ai f2039f;

    /* renamed from: g */
    public LogicBoolean f2040g;

    /* renamed from: h */
    public C0351ai f2041h;

    /* renamed from: i */
    public boolean f2042i;

    /* renamed from: j */
    public LogicBoolean f2043j;

    /* renamed from: k */
    public C0424b f2044k;

    /* renamed from: l */
    public C0424b f2045l;

    /* renamed from: m */
    public C0424b f2046m;

    /* renamed from: a */
    public static C0206a m5488a(C0339d c0339d) {
        boolean z = false;
        if (c0339d.f2069y != null && c0339d.f2069y != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2071A != null && c0339d.f2071A != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2073C != null && c0339d.f2073C != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2065u != null && c0339d.f2065u != LogicBoolean.trueBoolean) {
            z = true;
        }
        if (c0339d.f2115aC != null && c0339d.f2115aC != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2090ad != null) {
            z = true;
        }
        if (c0339d.f2060p != null) {
            z = true;
        }
        if (!z) {
            return C0206a.f1425a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2036c = c0339d.f2069y;
        c0338c.f2037d = c0339d.f2070z;
        c0338c.f2038e = c0339d.f2071A;
        c0338c.f2039f = c0339d.f2072B;
        c0338c.f2040g = c0339d.f2073C;
        c0338c.f2041h = c0339d.f2074D;
        c0338c.f2035b = c0339d.f2065u;
        c0338c.f2043j = c0339d.f2115aC;
        c0338c.f2045l = c0339d.f2090ad;
        c0338c.f2044k = c0339d.f2060p;
        c0338c.f2046m = c0339d.f2061q;
        c0338c.f2042i = c0339d.f2068x;
        return c0338c;
    }

    /* renamed from: a */
    public static C0206a m5487a(C0458p c0458p) {
        boolean z = false;
        if (c0458p.f3329f != null && c0458p.f3329f != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (!z) {
            return C0206a.f1425a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2036c = c0458p.f3329f;
        c0338c.f2037d = C0351ai.m5377a(c0458p.f3330g);
        return c0338c;
    }

    /* renamed from: a */
    public boolean m5492a(Unit unit) {
        return this.f2042i;
    }

    /* renamed from: b */
    public boolean m5485b(Unit unit) {
        return m5491a(unit, -1);
    }

    /* renamed from: a */
    public boolean m5491a(Unit unit, int i) {
        if (this.f2036c != null && (i == -1 || i == 1)) {
            if (!(unit instanceof AbstractC0623y)) {
                GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2036c.read((AbstractC0623y) unit)) {
                return true;
            }
        }
        if (this.f2038e != null && (i == -1 || i == 2)) {
            if (!(unit instanceof AbstractC0623y)) {
                GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2038e.read((AbstractC0623y) unit)) {
                return true;
            }
        }
        if (this.f2040g != null) {
            if (i == -1 || i == 3) {
                if (!(unit instanceof AbstractC0623y)) {
                    GameEngine.m1106n("CustomActionConfig lockedInGame:" + unit.getUnitType().mo5706i() + " is not a OrderableUnit unit");
                    return false;
                } else if (this.f2040g.read((AbstractC0623y) unit)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public String m5484c(Unit unit) {
        if (m5491a(unit, 1) && this.f2037d != null) {
            return this.f2037d.m5372b(unit);
        }
        if (m5491a(unit, 2) && this.f2039f != null) {
            return this.f2039f.m5372b(unit);
        }
        if (m5491a(unit, 3) && this.f2041h != null) {
            return this.f2041h.m5372b(unit);
        }
        return null;
    }

    /* renamed from: a */
    public boolean m5489a(Unit unit, boolean z) {
        if (this.f2035b != null) {
            if (!(unit instanceof AbstractC0623y)) {
                GameEngine.m1106n("CustomActionConfig isAvailable:" + unit.getUnitType().mo5706i() + " is not a OrderableUnit unit");
                return true;
            } else if (z) {
                return C0785ad.m2111a(this.f2035b, (AbstractC0623y) unit);
            } else {
                return this.f2035b.read((AbstractC0623y) unit);
            }
        }
        return true;
    }

    /* renamed from: d */
    public boolean m5483d(Unit unit) {
        if (this.f2043j != null) {
            if (!(unit instanceof AbstractC0623y)) {
                GameEngine.m1106n("CustomActionConfig isGuiBlinking:" + unit.getUnitType().mo5706i() + " is not a OrderableUnit unit");
                return true;
            }
            return this.f2043j.read((AbstractC0623y) unit);
        }
        return false;
    }

    /* renamed from: a */
    public void m5490a(Unit unit, Unit unit2) {
        if (this.f2045l != null) {
            this.f2045l.m5185h(unit);
        }
    }

    /* renamed from: a */
    public C0424b m5493a() {
        return this.f2044k;
    }

    /* renamed from: b */
    public C0424b m5486b() {
        return this.f2046m;
    }
}
