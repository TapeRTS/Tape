package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.UnitType;

/* renamed from: com.corrodinggames.rts.game.units.custom.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class C0445u {

    /* renamed from: a */
    String f3165a;

    /* renamed from: b */
    String f3166b;

    /* renamed from: c */
    String f3167c;

    /* renamed from: d */
    UnitType f3168d;

    /* renamed from: e */
    boolean f3169e;

    /* renamed from: f */
    public boolean f3170f;

    /* renamed from: a */
    public void mo3047a() {
        if (!this.f3169e) {
            this.f3168d = com.corrodinggames.rts.game.units.UnitType.m3709a(this.f3167c);
            if (this.f3168d == null) {
                if (this.f3170f) {
                    throw new C0395bl("Could not find unit type:" + this.f3167c + " used on:" + this.f3165a + " in section:" + this.f3166b + " (Note: Prefix with 'unitref' if not using a unit type here)");
                }
                throw new C0395bl("Could not find unit type:" + this.f3167c + " used on:" + this.f3165a + " in section:" + this.f3166b);
            }
        }
    }

    /* renamed from: b */
    public void mo3046b() {
    }

    /* renamed from: c */
    public UnitType mo3049c() {
        return this.f3168d;
    }

    /* renamed from: d */
    public String m3050d() {
        if (this.f3169e) {
            if (this.f3168d != null) {
                return this.f3168d.mo3087i();
            }
            return "(Error: known type is null)";
        }
        return this.f3167c;
    }
}