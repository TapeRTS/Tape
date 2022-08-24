package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/u.class */
public class C0513u extends AbstractC0228w {
    public C0513u() {
        super(SeaFactory.f3554g.m5638a());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: g */
    public boolean mo3857g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: a */
    public String mo3863a() {
        return "-Allows factory to build Tech 2 units";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: b */
    public String mo3861b() {
        return C0820a.m1886a("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: c */
    public int mo3859c() {
        return UnitType.seaFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3865K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: a */
    public boolean mo3862a(Unit unit, boolean z) {
        SeaFactory seaFactory = (SeaFactory) unit;
        if (seaFactory.f3425r != 1 || seaFactory.mo3954a(m5492N(), z) > 0) {
            return false;
        }
        return super.mo3862a(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: b */
    public boolean mo3860b(Unit unit) {
        if (((SeaFactory) unit).f3425r != 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: L */
    public UnitType mo6845i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: f */
    public EnumC0225t mo3858f() {
        return EnumC0225t.f1466c;
    }
}
