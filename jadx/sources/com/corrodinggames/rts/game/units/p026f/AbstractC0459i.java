package com.corrodinggames.rts.game.units.p026f;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;

/* renamed from: com.corrodinggames.rts.game.units.f.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/i.class */
public abstract class AbstractC0459i extends AbstractC0460j {
    public abstract int excludeTeam(AbstractC0515r rVar);

    public abstract AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar);

    public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
        return null;
    }

    public void setup(AbstractC0515r rVar, float f) {
    }

    public AbstractC0210af getResult() {
        return null;
    }
}
