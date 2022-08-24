package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* renamed from: com.corrodinggames.rts.game.units.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/k.class */
public enum EnumC0216k {
    normal,
    attack,
    defend,
    nuke,
    build,
    upgrade,
    ok,
    no,
    happy,
    sad,
    retreat;

    /* renamed from: a */
    public String m5480a() {
        return " - " + m5479b();
    }

    /* renamed from: b */
    public String m5479b() {
        return C0820a.m1880a(m5478c(), new Object[0]);
    }

    /* renamed from: c */
    public String m5478c() {
        return "menus.ingame.ping.type." + name();
    }
}
