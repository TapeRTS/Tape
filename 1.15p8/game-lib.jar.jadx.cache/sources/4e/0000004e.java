package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;

/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public class DummyNonUnitWithTeam extends DummyUnit {
    /* renamed from: a */
    public static DummyNonUnitWithTeam m2688a(Team team) {
        DummyNonUnitWithTeam dummyNonUnitWithTeam = new DummyNonUnitWithTeam(true);
        dummyNonUnitWithTeam.mo2537b(team);
        dummyNonUnitWithTeam.dead = true;
        return dummyNonUnitWithTeam;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DummyNonUnitWithTeam(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: r */
    public UnitType getUnitType() {
        return UnitType.dummyNonUnitWithTeam;
    }

    /* renamed from: b */
    public static void load() {
    }
}