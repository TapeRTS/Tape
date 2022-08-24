package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class AbstractC0529j extends AbstractC0621w {

    /* renamed from: dI */
    float f3642dI;

    /* renamed from: dJ */
    public static BitmapOrTexture f3643dJ = null;

    /* renamed from: dK */
    public static BitmapOrTexture f3644dK = null;

    /* renamed from: dL */
    public static BitmapOrTexture[] f3645dL = new BitmapOrTexture[10];

    /* renamed from: dM */
    public static BitmapOrTexture[] f3646dM = new BitmapOrTexture[10];

    public AbstractC0529j(boolean z) {
        super(z);
    }

    /* renamed from: v */
    public BitmapOrTexture m3939v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        if (m5788db()) {
            return f3646dM[this.team.getId()];
        }
        return f3645dL[this.team.getId()];
    }

    /* renamed from: dq */
    public static void m3941dq() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3643dJ = gameEngine.graphics.loadImage(R.drawable.unit_icon_land);
        if (f3643dJ == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        f3645dL = Team.createBitmapForTeam(f3643dJ);
        f3644dK = gameEngine.graphics.loadImage(R.drawable.unit_icon_land_exp);
        if (f3644dK == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        f3646dM = Team.createBitmapForTeam(f3644dK);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.isDead) {
            float f2 = 0.0f;
            if (m5837cJ()) {
                f2 = -10.0f;
            }
            if (this.height > f2) {
                if (this.height > 0.0f && this.f3642dI < 0.4f) {
                    this.f3642dI = 0.4f;
                }
                this.f3642dI += 0.002f * f;
                this.height -= this.f3642dI * f;
                if (this.height <= f2) {
                    this.height = f2;
                }
            }
        }
        if (isActive() && !this.isDead && !(this instanceof AbstractC0525h)) {
            if (this.height < 0.0f) {
                this.height += 0.2f * f;
                if (this.height >= 0.0f) {
                    this.height = 0.0f;
                }
            }
            if (this.height > 0.0f) {
                this.f3642dI += 0.03f * f;
                if (this.height < 0.0f) {
                    this.f3642dI = CommonUtils.m2316b(this.f3642dI, 0.2f);
                }
                this.height -= this.f3642dI * f;
                if (this.height <= 0.0f) {
                    if (this.height < 0.0f) {
                        this.height = 0.0f;
                    }
                    this.f3642dI = 0.0f;
                }
            }
        }
    }

    /* renamed from: h */
    public EnumC0246ao m3940h() {
        return EnumC0246ao.f1703b;
    }
}
