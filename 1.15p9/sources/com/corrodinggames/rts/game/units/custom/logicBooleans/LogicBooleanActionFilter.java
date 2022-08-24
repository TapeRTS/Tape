package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0207b;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanActionFilter.class */
public class LogicBooleanActionFilter extends C0207b {
    LogicBoolean logicBoolean;
    C0451j target;

    public LogicBooleanActionFilter(LogicBoolean logicBoolean, C0451j c0451j) {
        this.logicBoolean = logicBoolean;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0207b
    public boolean isAvailable(AbstractC0224s abstractC0224s, AbstractC0244am abstractC0244am) {
        return this.logicBoolean.read(this.target);
    }
}
