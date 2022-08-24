package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/an.class */
public class C0356an extends AbstractC0357ao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0356an(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0352aj
    /* renamed from: a */
    public String mo4718a(AbstractC0623y abstractC0623y) {
        return AbstractC0244am.m5169f(this.f2235a.readUnit(abstractC0623y), false);
    }
}
