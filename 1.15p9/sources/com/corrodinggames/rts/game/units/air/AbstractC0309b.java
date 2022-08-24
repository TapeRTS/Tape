package com.corrodinggames.rts.game.units.air;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/b.class */
public abstract class AbstractC0309b extends AbstractC0621w {

    /* renamed from: h */
    float f1840h;

    /* renamed from: i */
    boolean f1841i;

    /* renamed from: j */
    float f1842j;

    /* renamed from: k */
    Boolean f1843k;

    /* renamed from: l */
    Boolean f1844l;

    /* renamed from: m */
    public static BitmapOrTexture f1845m = null;

    /* renamed from: n */
    public static BitmapOrTexture[] f1846n = new BitmapOrTexture[10];

    public AbstractC0309b(boolean z) {
        super(z);
        this.f1841i = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f1840h);
        c0859ar.mo1482a(this.f1841i);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f1840h = c0876k.m1453g();
        this.f1841i = c0876k.m1455e();
        super.mo2877a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo5651v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f1846n[this.team.getId()];
    }

    /* renamed from: K */
    public static void m5652K() {
        f1845m = GameEngine.getInstance().graphics.loadImage(R.drawable.unit_icon_air);
        f1846n = Team.createBitmapForTeam(f1845m);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public EnumC0246ao mo5638h() {
        return EnumC0246ao.f1705d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        C0745e m2541b;
        super.update(f);
        if (this.isDead) {
            if (this.height > 0.0f) {
                this.f1840h += 0.06f * f;
                this.height -= this.f1840h * f;
                return;
            }
            if (this.f1843k == null) {
                this.f1843k = Boolean.valueOf(m5828cJ());
            }
            if (this.f1844l == null) {
                this.f1844l = Boolean.valueOf(m5829cI());
            }
            if (!this.f1841i) {
                this.f1841i = true;
                if (this.f1843k.booleanValue()) {
                    m3206a(EnumC0233ab.f1501a);
                    if (this.f1844l.booleanValue()) {
                        GameEngine.getInstance().effects.m2555a(this.f6951ek, this.f6952el, 0.0f, 0, 0.0f, 0.0f, this.direction);
                    }
                } else {
                    m3206a(EnumC0233ab.f1502b);
                }
                this.f1840h = 0.0f;
            } else if (this.f1843k.booleanValue()) {
                if (this.height > -10.0f) {
                    this.f1840h += 8.0E-4f * f;
                    this.height -= this.f1840h * f;
                    if (this.f1844l.booleanValue()) {
                        this.f1842j += f;
                        if (this.f1842j > 30.0f) {
                            this.f1842j = 0.0f;
                            if (mo3028p_() && (m2541b = GameEngine.getInstance().effects.m2541b(this.f6951ek, this.f6952el, this.height, this.direction)) != null) {
                                m2541b.f4739Q = 0.0f;
                                m2541b.f4740R = -0.1f;
                            }
                        }
                    }
                }
            } else {
                this.height = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5641e() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.height > -1.0f) {
            for (int i = 0; i < 3; i++) {
                gameEngine.effects.m2530e(this.f6951ek, this.f6952el, this.height);
            }
        }
        return super.mo5641e();
    }
}
