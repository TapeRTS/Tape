package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;

/* renamed from: com.corrodinggames.rts.game.units.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/b.class */
public class C0466b extends AbstractC0222w {
    public C0466b() {
        super(AirFactory.f3184h.m3863a());
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: g */
    public boolean mo2735g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public String getDescription() {
        return "-Allows factory to build Tech 2 units";
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public String getText() {
        return LangLocale.getI18NText("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: c */
    public int getPrice() {
        return UnitType.airFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
    /* renamed from: I */
    public float getBuildSpeed() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean isActive(Unit unit, boolean z) {
        AirFactory airFactory = (AirFactory) unit;
        if (airFactory.f3185f != 1 || airFactory.mo2915a(m3834L(), z) > 0) {
            return false;
        }
        return super.isActive(unit, z);
    }

    /* renamed from: J */
    public UnitType m2990J() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: f */
    public EnumC0219t mo2697f() {
        return EnumC0219t.f1439c;
    }
}