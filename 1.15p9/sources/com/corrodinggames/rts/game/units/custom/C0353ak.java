package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* renamed from: com.corrodinggames.rts.game.units.custom.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ak.class */
public class C0353ak extends AbstractC0357ao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0353ak(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0352aj
    /* renamed from: a */
    public String mo4718a(AbstractC0623y abstractC0623y) {
        return this.f2235a.read(abstractC0623y) ? "true" : "false";
    }
}
