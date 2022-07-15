package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/u.class */
public class C0495u extends AbstractC0222w {
    public C0495u() {
        super(SeaFactory.f3375g.m3863a());
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
        return UnitType.seaFactory.getUpgradePrice(2);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
    /* renamed from: I */
    public float getBuildSpeed() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: a */
    public boolean isActive(Unit unit, boolean z) {
        SeaFactory seaFactory = (SeaFactory) unit;
        if (seaFactory.f3247r != 1 || seaFactory.mo2915a(m3834L(), z) > 0) {
            return false;
        }
        return super.isActive(unit, z);
    }

    @Override // com.corrodinggames.rts.game.units.p012a.Action
    /* renamed from: b */
    public boolean isAvailable(Unit unit) {
        if (((SeaFactory) unit).f3247r != 1) {
            return false;
        }
        return true;
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