package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class C0209d extends Action {

    /* renamed from: a */
    int f1429a;

    /* renamed from: b */
    EnumC0205a f1430b;

    public C0209d() {
        super("c_7");
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: n */
    public UnitType mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1484k;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1464a;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Attack Mode";
    }

    /* renamed from: b */
    public String mo6187b() {
        EnumC0205a m6274q = m6274q();
        if (m6274q != null) {
            return m6274q.name();
        }
        return "NA";
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return false;
    }

    /* renamed from: c */
    public void m6277c(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        EnumC0205a m6279a = m6279a(m6273r());
        C0749e m2591b = gameEngine.f6124cf.m2591b(unit.team);
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (abstractC0623y.f1643cE) {
                    m2591b.m2491a(abstractC0623y);
                }
            }
        }
        m2591b.m2494a(m6279a);
        this.f1429a = gameEngine.f6111bS.f5117S;
        this.f1430b = m6279a;
    }

    /* renamed from: a */
    public EnumC0205a m6279a(EnumC0205a enumC0205a) {
        if (enumC0205a == EnumC0205a.f1418b) {
            return EnumC0205a.f1421e;
        }
        if (enumC0205a == EnumC0205a.f1418b) {
            return EnumC0205a.f1422f;
        }
        return EnumC0205a.f1418b;
    }

    /* renamed from: q */
    public EnumC0205a m6274q() {
        GameEngine gameEngine = GameEngine.getInstance();
        EnumC0205a m6273r = m6273r();
        this.f1429a = gameEngine.f6111bS.f5117S;
        this.f1430b = m6273r;
        return m6273r;
    }

    /* renamed from: r */
    public EnumC0205a m6273r() {
        if (this.f1429a == GameEngine.getInstance().f6111bS.f5117S && this.f1430b != null) {
            return this.f1430b;
        }
        EnumC0205a enumC0205a = null;
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE) {
                    if (enumC0205a == null || enumC0205a == abstractC0623y.f3889O) {
                        enumC0205a = abstractC0623y.f3889O;
                    } else {
                        enumC0205a = EnumC0205a.f1423g;
                    }
                }
            }
        }
        return enumC0205a;
    }

    /* renamed from: b */
    public boolean m6278b(Unit unit) {
        return true;
    }

    /* renamed from: d */
    public String m6276d() {
        return mo6187b();
    }

    /* renamed from: s */
    public boolean mo6178s() {
        return true;
    }
}
