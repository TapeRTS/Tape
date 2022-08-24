package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/d.class */
public final class C0539d extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3720a = new RectF();

    /* renamed from: b */
    public float f3721b;

    /* renamed from: c */
    public float f3722c;

    /* renamed from: d */
    public float f3723d;

    /* renamed from: e */
    public float f3724e;

    /* renamed from: f */
    public float f3725f;

    /* renamed from: g */
    public float f3726g;

    /* renamed from: h */
    public float f3727h;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3491a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f6951ek;
        float f2 = abstractC0244am.f6952el;
        return this.f3721b <= f && f <= this.f3722c && this.f3723d <= f2 && f2 <= this.f3724e && C0758f.m2363a(this.f3725f, this.f3726g, f, f2) < this.f3727h;
    }
}
