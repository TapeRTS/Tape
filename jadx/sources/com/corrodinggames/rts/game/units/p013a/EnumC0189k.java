package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p034e.C0652a;

/* renamed from: com.corrodinggames.rts.game.units.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/k.class */
public enum EnumC0189k {
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
    public String m3396a() {
        return " - " + m3395b();
    }

    /* renamed from: b */
    public String m3395b() {
        return C0652a.m1536a(m3394c(), new Object[0]);
    }

    /* renamed from: c */
    public String m3394c() {
        return "menus.ingame.ping.type." + name();
    }
}
