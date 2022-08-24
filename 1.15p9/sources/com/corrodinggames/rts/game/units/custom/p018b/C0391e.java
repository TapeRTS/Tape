package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/e.class */
public class C0391e {

    /* renamed from: a */
    public C0934e f2397a;

    /* renamed from: b */
    public C0934e[] f2398b;

    /* renamed from: c */
    public int f2399c;

    /* renamed from: d */
    public int f2400d;

    /* renamed from: e */
    public int f2401e = 1;

    /* renamed from: f */
    public int f2402f = 1;

    /* renamed from: a */
    public void m4665a(C0390d c0390d) {
        int i = this.f2397a.f6396p;
        int i2 = this.f2397a.f6397q;
        this.f2399c = i;
        this.f2400d = i2;
        if (c0390d.f2393J > 0) {
            this.f2399c = c0390d.f2393J;
        } else if (c0390d.f2392I > 0) {
            this.f2399c = i / c0390d.f2392I;
        }
        if (c0390d.f2394K > 0) {
            this.f2400d = c0390d.f2394K;
        }
        if (this.f2399c > 0) {
            this.f2402f = i / this.f2399c;
        }
        if (this.f2400d > 0) {
            this.f2401e = i2 / this.f2400d;
        }
        if (this.f2402f <= 0) {
            this.f2402f = 1;
        }
        if (this.f2401e <= 0) {
            this.f2401e = 1;
        }
    }
}
