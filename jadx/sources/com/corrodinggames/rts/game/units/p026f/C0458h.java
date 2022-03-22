package com.corrodinggames.rts.game.units.p026f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0210af;

/* renamed from: com.corrodinggames.rts.game.units.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/h.class */
public final class C0458h extends AbstractC0455e {

    /* renamed from: a */
    public RectF f3273a = new RectF();

    /* renamed from: b */
    public float f3274b;

    /* renamed from: c */
    public float f3275c;

    /* renamed from: d */
    public float f3276d;

    /* renamed from: e */
    public float f3277e;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0455e
    /* renamed from: a */
    public final boolean mo2449a(AbstractC0210af afVar) {
        float f = afVar.f1474bO;
        float f2 = afVar.f5842dH;
        float f3 = afVar.f5843dI;
        return this.f3274b - f <= f2 && f2 <= this.f3275c + f && this.f3276d - f <= f3 && f3 <= this.f3277e + f;
    }
}
