package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class AbstractC0529j extends AbstractC0621w {

    /* renamed from: dI */
    float f3642dI;

    /* renamed from: dJ */
    public static C0934e f3643dJ = null;

    /* renamed from: dK */
    public static C0934e f3644dK = null;

    /* renamed from: dL */
    public static C0934e[] f3645dL = new C0934e[10];

    /* renamed from: dM */
    public static C0934e[] f3646dM = new C0934e[10];

    public AbstractC0529j(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        if (mo3621db()) {
            return f3646dM[this.f1608bV.m5267O()];
        }
        return f3645dL[this.f1608bV.m5267O()];
    }

    /* renamed from: dq */
    public static void m3584dq() {
        GameEngine m1234A = GameEngine.m1234A();
        f3643dJ = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_land);
        if (f3643dJ == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        f3645dL = AbstractC0197n.m5244a(f3643dJ);
        f3644dK = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_land_exp);
        if (f3644dK == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        f3646dM = AbstractC0197n.m5244a(f3644dK);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo4640a(f);
        if (this.f1606bT) {
            float f2 = 0.0f;
            if (m4748cJ()) {
                f2 = -10.0f;
            }
            if (this.f6953em > f2) {
                if (this.f6953em > 0.0f && this.f3642dI < 0.4f) {
                    this.f3642dI = 0.4f;
                }
                this.f3642dI += 0.002f * f;
                this.f6953em -= this.f3642dI * f;
                if (this.f6953em <= f2) {
                    this.f6953em = f2;
                }
            }
        }
        if (m4759bS() && !this.f1606bT && !(this instanceof AbstractC0525h)) {
            if (this.f6953em < 0.0f) {
                this.f6953em += 0.2f * f;
                if (this.f6953em >= 0.0f) {
                    this.f6953em = 0.0f;
                }
            }
            if (this.f6953em > 0.0f) {
                this.f3642dI += 0.03f * f;
                if (this.f6953em < 0.0f) {
                    this.f3642dI = C0758f.m2311b(this.f3642dI, 0.2f);
                }
                this.f6953em -= this.f3642dI * f;
                if (this.f6953em <= 0.0f) {
                    if (this.f6953em < 0.0f) {
                        this.f6953em = 0.0f;
                    }
                    this.f3642dI = 0.0f;
                }
            }
        }
    }

    /* renamed from: h */
    public EnumC0246ao m3583h() {
        return EnumC0246ao.LAND;
    }
}
