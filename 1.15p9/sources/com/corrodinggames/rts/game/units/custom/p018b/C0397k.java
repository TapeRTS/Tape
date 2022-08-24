package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/k.class */
public class C0397k extends AbstractC0387a {

    /* renamed from: a */
    LogicBoolean f2439a;

    /* renamed from: b */
    float f2440b;

    /* renamed from: c */
    float f2441c;

    /* renamed from: d */
    int f2442d;

    /* renamed from: a */
    public static void m5309a(C0453l c0453l, C1072ab c1072ab) {
        if (c1072ab.m663g("movement_random")) {
            C0397k c0397k = new C0397k();
            c0397k.m5308a(c0453l, c1072ab, "movement_random", "movement_random");
            if (!LogicBoolean.isStaticFalse(c0397k.f2439a)) {
                c0453l.m4768a(c0397k);
            }
        }
    }

    /* renamed from: a */
    public void m5308a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2439a = c1072ab.m722a(c0453l, str, "enabled");
        this.f2440b = c1072ab.m658i(str, "speed");
        this.f2441c = c1072ab.m698a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2442d = c1072ab.m682b(str, "awayFromEdge", (Integer) 75).intValue();
    }

    /* renamed from: b */
    public void mo5310b(C0451j c0451j, float f) {
        if (!this.f2439a.read(c0451j)) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (c0451j.m4920bi()) {
            if (CommonUtils.m2294c(c0451j.f1613ca) < this.f2441c) {
                c0451j.f1613ca += CommonUtils.m2306b(c0451j, -this.f2440b, this.f2440b, 1);
            }
            if (CommonUtils.m2294c(c0451j.f1614cb) < this.f2441c) {
                c0451j.f1614cb += CommonUtils.m2306b(c0451j, -this.f2440b, this.f2440b, 2);
            }
        } else {
            if (CommonUtils.m2294c(c0451j.f1616cd) < this.f2441c) {
                c0451j.f1616cd += CommonUtils.m2306b(c0451j, -this.f2440b, this.f2440b, 1);
            }
            c0451j.direction += CommonUtils.m2306b(c0451j, -1.0f, 1.0f, 2);
        }
        if (this.f2442d > 0) {
            if (c0451j.f6952el > gameEngine.f6104bL.m6588j() - this.f2442d) {
                c0451j.f1614cb -= CommonUtils.m2306b(c0451j, 0.0f, this.f2440b * 0.25f, 10);
            }
            if (c0451j.f6952el < this.f2442d) {
                c0451j.f1614cb += CommonUtils.m2306b(c0451j, 0.0f, this.f2440b * 0.25f, 11);
            }
            if (c0451j.f6951ek > gameEngine.f6104bL.m6589i() - this.f2442d) {
                c0451j.f1613ca -= CommonUtils.m2306b(c0451j, 0.0f, this.f2440b * 0.25f, 12);
            }
            if (c0451j.f6951ek < this.f2442d) {
                c0451j.f1613ca += CommonUtils.m2306b(c0451j, 0.0f, this.f2440b * 0.25f, 13);
            }
        }
        c0451j.f3939ax = true;
    }
}
