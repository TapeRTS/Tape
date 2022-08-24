package com.corrodinggames.rts.game.units.water;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.h.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class AbstractC0590f extends AbstractC0621w {

    /* renamed from: m */
    float f3840m;

    /* renamed from: n */
    float f3841n;

    /* renamed from: o */
    boolean f3842o;

    /* renamed from: p */
    public static BitmapOrTexture f3843p = null;

    /* renamed from: q */
    public static BitmapOrTexture[] f3844q = new BitmapOrTexture[10];

    public AbstractC0590f(boolean z) {
        super(z);
        this.f3842o = false;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3841n);
        c0859ar.mo1482a(this.f3842o);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3841n = c0876k.m1453g();
        this.f3842o = c0876k.m1455e();
        super.mo2877a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo5658v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3844q[this.team.getId()];
    }

    /* renamed from: L */
    public static void m3398L() {
        f3843p = GameEngine.getInstance().graphics.loadImage(R.drawable.unit_icon_water);
        f3844q = Team.createBitmapForTeam(f3843p);
    }

    /* renamed from: h */
    public EnumC0246ao m3394h() {
        return EnumC0246ao.f1706e;
    }

    /* renamed from: ct */
    public boolean m3396ct() {
        return true;
    }

    /* renamed from: f */
    public boolean m3395f() {
        return true;
    }

    /* renamed from: s */
    public void m3393s(float f) {
        if (this.height != 0.0f) {
            this.height = CommonUtils.m2367a(this.height, 0.0f, 0.2f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.isDead) {
            if (this.height > -10.0f) {
                this.f3841n += 0.002f * f;
                this.height -= this.f3841n * f;
                return;
            }
            this.height = -10.0f;
            if (!this.f3842o) {
                this.f3842o = true;
            }
        } else if (!isActive() || this.isDead) {
        } else {
            m3393s(f);
            if (m3395f()) {
                if (this.f1616cd != 0.0f) {
                    this.f3840m += f;
                }
                if (this.f3840m > 10.0f) {
                    this.f3840m = 0.0f;
                    if (mo4204p_()) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        float f2 = this.direction + 180.0f;
                        if (this.f1616cd < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.radius - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        gameEngine.effects.m2541b(this.f6951ek + (CommonUtils.m2249i(f2) * f3), this.f6952el + (CommonUtils.sin(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
