package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.p023d.C0425p;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/b.class */
public class C0329b extends AbstractC0328a {

    /* renamed from: a */
    public static final AbstractC0328a f2227a = new C0329b();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        kVar.f2457s += f;
        if (kVar.f2457s > 40.0f && kVar.m2238ao()) {
            kVar.f2457s = 0.0f;
            C0425p.m2559a((AbstractC0515r) kVar, f, 0.0f, false);
        }
    }
}
