package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/e.class */
public class C0420e {

    /* renamed from: a */
    C0416a f2681a;

    /* renamed from: b */
    C1101m f2682b = new C1101m();

    public C0420e(C0416a c0416a) {
        this.f2681a = c0416a;
    }

    /* renamed from: a */
    public C0419d m4587a(AbstractC0244am abstractC0244am) {
        int i = this.f2682b.f6888a;
        Object[] m553a = this.f2682b.m553a();
        for (int i2 = 0; i2 < i; i2++) {
            C0419d c0419d = (C0419d) m553a[i2];
            if (c0419d.f2677a == abstractC0244am) {
                return c0419d;
            }
        }
        return null;
    }
}
