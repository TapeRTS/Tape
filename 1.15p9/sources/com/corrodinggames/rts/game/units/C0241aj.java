package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;

/* renamed from: com.corrodinggames.rts.game.units.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aj.class */
public class C0241aj extends AbstractC0544i {

    /* renamed from: a */
    float f1560a;

    /* renamed from: b */
    float f1561b;

    /* renamed from: c */
    public SpreadingFire f1562c;

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1562c = null;
    }

    /* renamed from: a */
    public void m5937a(float f, float f2) {
        this.f1560a = f;
        this.f1561b = f2;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
        if ((unit instanceof SpreadingFire) && !unit.isDead && unit.m5850c(this.f1560a, this.f1561b, 0.0f)) {
            this.f1562c = (SpreadingFire) unit;
        }
    }
}
