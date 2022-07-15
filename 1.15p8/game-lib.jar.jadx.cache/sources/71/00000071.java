package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/n.class */
public class C0485n extends AbstractC0222w {
    public C0485n() {
        super(LandFactory.f3327h.m3863a());
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: g */
    public boolean mo2735g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public String getDescription() {
        return LangLocale.getI18NText("units.landFactory.upgrade.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public String getText() {
        return LangLocale.getI18NText("units.landFactory.upgrade.name", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: c */
    public int getPrice() {
        return UnitType.landFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
    /* renamed from: I */
    public float getBuildSpeed() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean isActive(Unit unit, boolean z) {
        LandFactory landFactory = (LandFactory) unit;
        if (landFactory.f3328g || landFactory.mo2915a(m3834L(), z) > 0) {
            return false;
        }
        return super.isActive(unit, z);
    }

    /* renamed from: J */
    public UnitType mo2734i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: f */
    public EnumC0219t mo2697f() {
        return EnumC0219t.f1439c;
    }
}