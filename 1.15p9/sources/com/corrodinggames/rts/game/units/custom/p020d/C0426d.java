package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/d.class */
class C0426d {

    /* renamed from: a */
    public final C0428a f2717a;

    /* renamed from: b */
    public double f2718b;

    /* renamed from: c */
    public LogicBoolean f2719c;

    public C0426d(C0428a c0428a, LogicBoolean logicBoolean) {
        this.f2717a = c0428a;
        if (this.f2719c instanceof LogicBoolean.StaticValueBoolean) {
            this.f2718b = ((LogicBoolean.StaticValueBoolean) this.f2719c).getStaticValue();
        } else {
            this.f2719c = logicBoolean;
        }
    }
}
