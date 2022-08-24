package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.custom.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/at.class */
public class C0379at extends VariableScope.CachedWriter.WriterElement {

    /* renamed from: a */
    public AbstractC0377ar f2258a;

    /* renamed from: b */
    public LogicBoolean f2259b;

    /* renamed from: c */
    public VariableScope.CachedWriter.Operator f2260c;

    public void writeToUnit(AbstractC0623y abstractC0623y) {
        if (!(abstractC0623y instanceof C0451j)) {
            GameEngine.m1100n("Cannot change data on non custom unit:" + AbstractC0244am.m5329A(abstractC0623y));
            return;
        }
        this.f2258a.m4705a((C0451j) abstractC0623y, this.f2259b, this.f2260c);
    }
}
