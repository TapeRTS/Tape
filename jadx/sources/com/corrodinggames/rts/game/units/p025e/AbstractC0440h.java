package com.corrodinggames.rts.game.units.p025e;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class AbstractC0440h extends AbstractC0444j {

    /* renamed from: l */
    float f3169l;

    /* renamed from: m */
    public static C0748e f3170m = null;

    /* renamed from: n */
    public static C0748e[] f3171n = new C0748e[10];

    public AbstractC0440h(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        if (mo2520cL()) {
            return AbstractC0444j.f3187dp[this.f1461bB.m3518M()];
        }
        return f3171n[this.f1461bB.m3518M()];
    }

    /* renamed from: K */
    public static void m2510K() {
        f3170m = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.unit_icon_hover);
        f3171n = AbstractC0171m.m3501a(f3170m);
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.HOVER;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz && m3298cu()) {
            if (this.f1470bK > 0.0f) {
                this.f3169l += f;
            }
            if (this.f3169l > 10.0f) {
                this.f3169l = 0.0f;
                if (mo2163j()) {
                    C0573e b = AbstractC0789l.m638u().f5517bz.m1989b(this.f5842dH + (C0654f.m1421i(this.f1471bL) * 4.0f), this.f5843dI + (C0654f.m1425h(this.f1471bL) * 4.0f), 0.0f, EnumC0572d.custom, false, EnumC0576h.low);
                    if (b != null) {
                        b.f3894ap = 0;
                        b.f3893ao = 13;
                        b.f3895aq = (short) 1;
                        b.f3845s = true;
                        b.f3858F = 0.8f;
                        b.f3876X = 80.0f;
                        b.f3875W = 80.0f;
                        b.f3869Q = (-C0654f.m1421i(this.f1471bL)) * 0.1f;
                        b.f3870R = (-C0654f.m1425h(this.f1471bL)) * 0.1f;
                        b.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
