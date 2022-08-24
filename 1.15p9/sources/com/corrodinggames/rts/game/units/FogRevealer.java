package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/u.class */
public class FogRevealer extends AbstractC0622x {

    /* renamed from: a */
    public int f3878a;

    /* renamed from: b */
    public float f3879b;

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.m1554c(0);
        c0859ar.mo1487a(this.f3878a);
        c0859ar.mo1488a(this.f3879b);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        c0876k.m1457d();
        this.f3878a = c0876k.m1454f();
        this.f3879b = c0876k.m1453g();
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public UnitType m3299r() {
        return UnitType.f1777R;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine.getInstance();
    }

    public FogRevealer(boolean z) {
        super(z);
        this.f3878a = 14;
        this.f3879b = 60.0f;
    }

    /* renamed from: a */
    public void m3302a(float f) {
        super.m3280a(f);
        this.f3879b -= f;
        if (this.f3879b < 0.0f) {
            m5812ch();
        }
    }

    /* renamed from: s */
    public int m3298s() {
        return this.f3878a;
    }

    /* renamed from: t */
    public boolean m3297t() {
        return true;
    }

    /* renamed from: u */
    public boolean m3296u() {
        return true;
    }
}
