package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;

/* renamed from: com.corrodinggames.rts.game.units.custom.bh */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bh.class */
public class C0407bh extends AbstractC0544i {

    /* renamed from: a */
    Projectile f2518a;

    /* renamed from: b */
    C0408bi f2519b;

    /* renamed from: c */
    Unit f2520c;

    /* renamed from: d */
    Projectile f2521d;

    /* renamed from: e */
    Unit f2522e;

    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public Team onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
    }
}
