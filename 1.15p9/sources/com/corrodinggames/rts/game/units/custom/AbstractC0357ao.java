package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ao.class */
public abstract class AbstractC0357ao extends AbstractC0352aj {

    /* renamed from: a */
    LogicBoolean f2235a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0357ao(LogicBoolean logicBoolean) {
        this.f2235a = logicBoolean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0357ao m4719a(LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() == LogicBoolean.ReturnType.number) {
            return new C0354al(logicBoolean);
        }
        if (logicBoolean.getReturnType() == LogicBoolean.ReturnType.string) {
            return new C0355am(logicBoolean);
        }
        if (logicBoolean.getReturnType() == LogicBoolean.ReturnType.unit) {
            return new C0356an(logicBoolean);
        }
        return new C0353ak(logicBoolean);
    }
}
