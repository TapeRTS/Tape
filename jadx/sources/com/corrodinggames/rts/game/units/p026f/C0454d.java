package com.corrodinggames.rts.game.units.p026f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/d.class */
public final class C0454d extends AbstractC0455e {

    /* renamed from: a */
    public RectF f3258a = new RectF();

    /* renamed from: b */
    public float f3259b;

    /* renamed from: c */
    public float f3260c;

    /* renamed from: d */
    public float f3261d;

    /* renamed from: e */
    public float f3262e;

    /* renamed from: f */
    public float f3263f;

    /* renamed from: g */
    public float f3264g;

    /* renamed from: h */
    public float f3265h;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0455e
    /* renamed from: a */
    public final boolean mo2449a(AbstractC0210af afVar) {
        float f = afVar.f5842dH;
        float f2 = afVar.f5843dI;
        return this.f3259b <= f && f <= this.f3260c && this.f3261d <= f2 && f2 <= this.f3262e && C0654f.m1520a(this.f3263f, this.f3264g, f, f2) < this.f3265h;
    }
}
