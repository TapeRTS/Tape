package com.corrodinggames.rts.gameFramework.gui;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.DummyUnit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.e.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/t.class */
public class C0731t extends DummyUnit {

    /* renamed from: a */
    C0421e f4921a = new C0421e();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1692R;
    }

    public C0731t() {
        super(true);
        this.team = Team.f1346g;
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        GameEngine.PrintLOG_err("PlaceholderUnit was updated");
        m3745cg();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: t */
    public boolean mo1774t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public boolean mo1773u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: db */
    public C0421e mo1776db() {
        return this.f4921a;
    }

    /* renamed from: a */
    public void m1778a(C0421e c0421e) {
        this.f4921a = c0421e;
    }
}