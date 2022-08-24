package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/n.class */
public class C0503n extends AbstractC0228w {
    public C0503n() {
        super(LandFactory.f3507h.m5656a());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: g */
    public boolean mo3857g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: a */
    public String mo3863a() {
        return C0820a.m1886a("units.landFactory.upgrade.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: b */
    public String mo3861b() {
        return C0820a.m1886a("units.landFactory.upgrade.name", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: c */
    public int mo3859c() {
        return UnitType.landFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3865K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: a */
    public boolean mo3862a(Unit unit, boolean z) {
        LandFactory landFactory = (LandFactory) unit;
        if (landFactory.f3500g || landFactory.mo3958a(m5510N(), z) > 0) {
            return false;
        }
        return super.mo3862a(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: L */
    public UnitType mo6880i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: f */
    public EnumC0225t mo3858f() {
        return EnumC0225t.f1466c;
    }
}
