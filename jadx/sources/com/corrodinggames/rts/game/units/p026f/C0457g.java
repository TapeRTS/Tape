package com.corrodinggames.rts.game.units.p026f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0210af;

/* renamed from: com.corrodinggames.rts.game.units.f.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/g.class */
public final class C0457g extends AbstractC0455e {

    /* renamed from: a */
    public RectF f3268a = new RectF();

    /* renamed from: b */
    public float f3269b;

    /* renamed from: c */
    public float f3270c;

    /* renamed from: d */
    public float f3271d;

    /* renamed from: e */
    public float f3272e;

    /* renamed from: a */
    public void m2450a(float f, float f2, float f3, float f4) {
        this.f3269b = f;
        this.f3270c = f3;
        this.f3271d = f2;
        this.f3272e = f4;
        this.f3268a.m4122a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0455e
    /* renamed from: a */
    public final boolean mo2449a(AbstractC0210af afVar) {
        float f = afVar.f5842dH;
        float f2 = afVar.f5843dI;
        return this.f3269b <= f && f <= this.f3270c && this.f3271d <= f2 && f2 <= this.f3272e;
    }
}
