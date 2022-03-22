package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0215ak;

/* renamed from: com.corrodinggames.rts.game.units.custom.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/t.class */
public class C0377t {

    /* renamed from: a */
    String f2882a;

    /* renamed from: b */
    String f2883b;

    /* renamed from: c */
    String f2884c;

    /* renamed from: d */
    AbstractC0268al f2885d;

    /* renamed from: e */
    boolean f2886e;

    /* renamed from: a */
    public void mo2715a() {
        if (!this.f2886e) {
            this.f2885d = EnumC0215ak.m3273a(this.f2884c);
            if (this.f2885d == null) {
                throw new C0324at("Could not find unit target:" + this.f2884c + " used on:" + this.f2882a + " in section:" + this.f2883b);
            }
        }
    }

    /* renamed from: b */
    public void mo2714b() {
    }

    /* renamed from: c */
    public AbstractC0268al mo2717c() {
        return this.f2885d;
    }

    /* renamed from: d */
    public String m2718d() {
        if (!this.f2886e) {
            return this.f2884c;
        }
        if (this.f2885d != null) {
            return this.f2885d.mo2754i();
        }
        return "(Error: known type is null)";
    }
}
