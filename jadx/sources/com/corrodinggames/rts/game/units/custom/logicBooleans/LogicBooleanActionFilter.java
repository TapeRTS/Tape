package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0180b;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanActionFilter.class */
public class LogicBooleanActionFilter extends C0180b {
    LogicBoolean logicBoolean;
    C0367k target;

    public LogicBooleanActionFilter(LogicBoolean logicBoolean, C0367k kVar) {
        this.logicBoolean = logicBoolean;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0180b
    public boolean isAvailable(AbstractC0197s sVar, AbstractC0210af afVar) {
        return this.logicBoolean.read(this.target);
    }
}
