package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;

/* renamed from: com.corrodinggames.rts.game.units.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/t.class */
public class DummyNonUnitWithTeam extends AbstractC0622x {
    /* renamed from: a */
    public static DummyNonUnitWithTeam m3305a(Team team) {
        DummyNonUnitWithTeam dummyNonUnitWithTeam = new DummyNonUnitWithTeam(true);
        dummyNonUnitWithTeam.mo3120b(team);
        dummyNonUnitWithTeam.isDead = true;
        return dummyNonUnitWithTeam;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DummyNonUnitWithTeam(boolean z) {
        super(z);
    }

    /* renamed from: r */
    public InterfaceC0303as m3303r() {
        return UnitType.f1785Z;
    }

    /* renamed from: b */
    public static void load() {
    }
}
