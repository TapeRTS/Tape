package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/g.class */
public final class C0542g extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3730a = new RectF();

    /* renamed from: b */
    public float f3731b;

    /* renamed from: c */
    public float f3732c;

    /* renamed from: d */
    public float f3733d;

    /* renamed from: e */
    public float f3734e;

    /* renamed from: a */
    public void m3492a(float f, float f2, float f3, float f4) {
        this.f3731b = f;
        this.f3732c = f3;
        this.f3733d = f2;
        this.f3734e = f4;
        this.f3730a.m6434a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3491a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f6951ek;
        float f2 = abstractC0244am.f6952el;
        return this.f3731b <= f && f <= this.f3732c && this.f3733d <= f2 && f2 <= this.f3734e;
    }
}
