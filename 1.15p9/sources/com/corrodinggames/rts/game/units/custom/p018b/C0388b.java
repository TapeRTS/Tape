package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.custom.C0451j;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/b.class */
public class C0388b extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2326a = new C0388b();

    /* renamed from: b */
    public void mo5310b(C0451j c0451j, float f) {
        c0451j.f2858t += f;
        if (c0451j.f2858t > 40.0f && c0451j.m3136aq()) {
            c0451j.f2858t = 0.0f;
            Repairbay.m4279a((AbstractC0623y) c0451j, f, 0.0f, false);
        }
    }
}
