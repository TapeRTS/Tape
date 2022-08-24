package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.a.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class C0222q extends AbstractC0221p {
    public C0222q() {
        super("c__cut_chat");
    }

    /* renamed from: b */
    public String mo6187b() {
        return "Team Chat";
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Send a team chat message to your allies";
    }

    /* renamed from: c */
    public boolean m6111c(Unit unit, boolean z) {
        GameEngine.getInstance().f6111bS.f5106d.m2184o();
        return true;
    }

    /* renamed from: M */
    public C0639ad m6114M() {
        return GameEngine.getInstance().f6112bT.f4097u;
    }
}
