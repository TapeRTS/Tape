package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class AbstractC0525h extends AbstractC0529j {

    /* renamed from: l */
    float f3628l;

    /* renamed from: m */
    public static BitmapOrTexture f3629m = null;

    /* renamed from: n */
    public static BitmapOrTexture[] f3630n = new BitmapOrTexture[10];

    public AbstractC0525h(boolean z) {
        super(z);
    }

    /* renamed from: v */
    public BitmapOrTexture m3992v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        if (m5788db()) {
            return AbstractC0529j.f3646dM[this.team.getId()];
        }
        return f3630n[this.team.getId()];
    }

    /* renamed from: K */
    public static void m3994K() {
        f3629m = GameEngine.getInstance().graphics.loadImage(R.drawable.unit_icon_hover);
        f3630n = Team.createBitmapForTeam(f3629m);
    }

    /* renamed from: h */
    public EnumC0246ao m3993h() {
        return EnumC0246ao.f1707f;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (isActive() && !this.isDead && m5837cJ()) {
            if (this.f1616cd > 0.0f) {
                this.f3628l += f;
            }
            if (this.f3628l > 10.0f) {
                this.f3628l = 0.0f;
                if (mo4204p_()) {
                    C0745e m2537b = GameEngine.getInstance().effects.m2537b(this.f6951ek + (CommonUtils.m2249i(this.direction) * 4.0f), this.f6952el + (CommonUtils.sin(this.direction) * 4.0f), 0.0f, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
                    if (m2537b != null) {
                        m2537b.f4763aq = 0;
                        m2537b.f4762ap = 13;
                        m2537b.f4786ar = (short) 1;
                        m2537b.f4720s = true;
                        m2537b.f4728F = 0.8f;
                        m2537b.f4746X = 80.0f;
                        m2537b.f4745W = 80.0f;
                        m2537b.f4739Q = (-CommonUtils.m2249i(this.direction)) * 0.1f;
                        m2537b.f4740R = (-CommonUtils.sin(this.direction)) * 0.1f;
                        m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
