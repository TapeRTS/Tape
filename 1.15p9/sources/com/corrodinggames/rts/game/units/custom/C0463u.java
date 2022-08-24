package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.InterfaceC0303as;

/* renamed from: com.corrodinggames.rts.game.units.custom.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class C0463u {

    /* renamed from: a */
    String f3343a;

    /* renamed from: b */
    String f3344b;

    /* renamed from: c */
    String f3345c;

    /* renamed from: d */
    InterfaceC0303as f3346d;

    /* renamed from: e */
    boolean f3347e;

    /* renamed from: f */
    public boolean f3348f;

    /* renamed from: a */
    public void mo4061a() {
        if (!this.f3347e) {
            this.f3346d = C0453l.m4083s(this.f3345c);
            if (this.f3346d == null) {
                if (this.f3348f) {
                    throw new C0412bm("Could not find unit type:" + this.f3345c + " used on:" + this.f3343a + " in section:" + this.f3344b + " (Note: Prefix with 'unitref' if not using a unit type here)");
                }
                throw new C0412bm("Could not find unit type:" + this.f3345c + " used on:" + this.f3343a + " in section:" + this.f3344b);
            }
        }
    }

    /* renamed from: b */
    public void mo4060b() {
    }

    /* renamed from: c */
    public InterfaceC0303as mo4063c() {
        return this.f3346d;
    }

    /* renamed from: d */
    public String m4064d() {
        if (this.f3347e) {
            if (this.f3346d != null) {
                return this.f3346d.mo4976i();
            }
            return "(Error: known type is null)";
        }
        return this.f3345c;
    }
}
