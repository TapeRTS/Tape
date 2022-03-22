package com.corrodinggames.rts.game.units.p025e;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0513p;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.e.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class AbstractC0444j extends AbstractC0513p {

    /* renamed from: dl */
    float f3183dl;

    /* renamed from: dm */
    public static C0748e f3184dm = null;

    /* renamed from: dn */
    public static C0748e f3185dn = null;

    /* renamed from: do */
    public static C0748e[] f3186do = new C0748e[10];

    /* renamed from: dp */
    public static C0748e[] f3187dp = new C0748e[10];

    public AbstractC0444j(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        if (mo2520cL()) {
            return f3187dp[this.f1461bB.m3518M()];
        }
        return f3186do[this.f1461bB.m3518M()];
    }

    /* renamed from: cZ */
    public static void m2488cZ() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3184dm = u.f5514bw.mo194a(C0063R.drawable.unit_icon_land);
        if (f3184dm == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        f3186do = AbstractC0171m.m3501a(f3184dm);
        f3185dn = u.f5514bw.mo194a(C0063R.drawable.unit_icon_land_exp);
        if (f3185dn == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        f3187dp = AbstractC0171m.m3501a(f3185dn);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (this.f1459bz) {
            float f2 = 0.0f;
            if (m3298cu()) {
                f2 = -10.0f;
            }
            if (this.f5844dJ > f2) {
                if (this.f5844dJ > 0.0f && this.f3183dl < 0.4f) {
                    this.f3183dl = 0.4f;
                }
                this.f3183dl += 0.002f * f;
                this.f5844dJ -= this.f3183dl * f;
                if (this.f5844dJ <= f2) {
                    this.f5844dJ = f2;
                }
            }
        }
        if (m3321bG() && !this.f1459bz && !(this instanceof AbstractC0440h)) {
            if (this.f5844dJ < 0.0f) {
                this.f5844dJ += 0.2f * f;
                if (this.f5844dJ >= 0.0f) {
                    this.f5844dJ = 0.0f;
                }
            }
            if (this.f5844dJ > 0.0f) {
                this.f3183dl += 0.03f * f;
                if (this.f5844dJ < 0.0f) {
                    this.f3183dl = C0654f.m1476b(this.f3183dl, 0.2f);
                }
                this.f5844dJ -= this.f3183dl * f;
                if (this.f5844dJ <= 0.0f) {
                    if (this.f5844dJ < 0.0f) {
                        this.f5844dJ = 0.0f;
                    }
                    this.f3183dl = 0.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.LAND;
    }
}
