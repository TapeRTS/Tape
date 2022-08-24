package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.custom.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ar.class */
public abstract class AbstractC0377ar {

    /* renamed from: a */
    int f2255a;

    /* renamed from: b */
    String f2256b;

    /* renamed from: a */
    public abstract double mo4700a(C0451j c0451j, C0359aq c0359aq);

    /* renamed from: a */
    public abstract void mo4701a(C0451j c0451j, double d);

    /* renamed from: b */
    public abstract boolean mo4699b();

    public AbstractC0377ar(int i, String str) {
        this.f2255a = i;
        this.f2256b = str;
    }

    /* renamed from: a */
    public LogicBoolean.ReturnType m4706a() {
        return LogicBoolean.ReturnType.number;
    }

    /* renamed from: a */
    public final void m4705a(C0451j c0451j, LogicBoolean logicBoolean, VariableScope.CachedWriter.Operator operator) {
        c0451j.m4226dH();
        double readNumber = logicBoolean.readNumber(c0451j);
        if (operator == VariableScope.CachedWriter.Operator.set) {
            mo4701a(c0451j, readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.add) {
            mo4701a(c0451j, mo4700a(c0451j, c0451j.f2862x) + readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.subtract) {
            mo4701a(c0451j, mo4700a(c0451j, c0451j.f2862x) - readNumber);
        } else {
            GameEngine.m1100n("setUnitDataFromLogic: unsupported operator");
        }
    }
}
