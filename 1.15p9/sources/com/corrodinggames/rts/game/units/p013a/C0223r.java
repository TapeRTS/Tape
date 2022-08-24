package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/r.class */
public class C0223r extends AbstractC0221p {
    public C0223r() {
        super("c__cut_ping");
    }

    /* renamed from: b */
    public String mo6187b() {
        return "Map Ping";
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Send a map ping to your allies";
    }

    /* renamed from: c */
    public boolean m6107c(Unit unit, boolean z) {
        GameEngine.getInstance().f6111bS.m2071H();
        return true;
    }

    /* renamed from: M */
    public C0639ad m6110M() {
        return GameEngine.getInstance().f6112bT.f4098v;
    }
}
