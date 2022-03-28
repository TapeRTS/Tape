package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.Unit;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/StatsHandler.class */
public class StatsHandler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public void startNew() {
    }

    public void unitHit(float f, Unit unit, Unit unit2) {
        GameEngine instance = GameEngine.getInstance();
        if (unit2.team == instance.playerTeam) {
            instance.minimapHandler.recordDamage((int) unit2.x, (int) unit2.y, f, unit2);
        }
    }
}
