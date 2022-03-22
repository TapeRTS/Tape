package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/e.class */
public class C0342e {

    /* renamed from: a */
    C0338a f2327a;

    /* renamed from: b */
    C0835m f2328b = new C0835m();

    public C0342e(C0338a aVar) {
        this.f2327a = aVar;
    }

    /* renamed from: a */
    public C0341d m3021a(AbstractC0210af afVar) {
        int i = this.f2328b.f5778a;
        Object[] a = this.f2328b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0341d dVar = (C0341d) a[i2];
            if (dVar.f2323a == afVar) {
                return dVar;
            }
        }
        return null;
    }
}
