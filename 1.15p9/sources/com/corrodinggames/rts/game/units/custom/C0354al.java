package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/al.class */
public class C0354al extends AbstractC0357ao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0354al(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0352aj
    /* renamed from: a */
    public String mo4718a(AbstractC0623y abstractC0623y) {
        return C0758f.m2263f(this.f2235a.readNumber(abstractC0623y));
    }
}
