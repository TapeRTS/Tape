package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/b.class */
public class C0484b extends AbstractC0228w {
    public C0484b() {
        super(AirFactory.f3364h.m5645a());
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
        return UnitType.airFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3865K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: a */
    public boolean mo3862a(Unit unit, boolean z) {
        AirFactory airFactory = (AirFactory) unit;
        if (airFactory.f3357f != 1 || airFactory.mo3954a(m5499N(), z) > 0) {
            return false;
        }
        return super.mo3862a(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: L */
    public UnitType mo6852i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.Action
    /* renamed from: f */
    public EnumC0225t mo3858f() {
        return EnumC0225t.f1466c;
    }
}
