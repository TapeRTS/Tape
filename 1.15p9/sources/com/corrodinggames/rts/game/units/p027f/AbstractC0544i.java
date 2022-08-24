package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;

/* renamed from: com.corrodinggames.rts.game.units.f.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/i.class */
public abstract class AbstractC0544i extends AbstractC0545j {
    public abstract int excludeTeam(AbstractC0623y abstractC0623y);

    public abstract Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y);

    public Team onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    public Unit getResult() {
        return null;
    }
}
