package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/h.class */
public final class C0543h extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3735a = new RectF();

    /* renamed from: b */
    public float f3736b;

    /* renamed from: c */
    public float f3737c;

    /* renamed from: d */
    public float f3738d;

    /* renamed from: e */
    public float f3739e;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3491a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f1620ch;
        float f2 = abstractC0244am.f6951ek;
        float f3 = abstractC0244am.f6952el;
        return this.f3736b - f <= f2 && f2 <= this.f3737c + f && this.f3738d - f <= f3 && f3 <= this.f3739e + f;
    }
}
