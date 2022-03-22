package com.corrodinggames.rts.game.units.p014b;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0513p;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/b.class */
public abstract class AbstractC0274b extends AbstractC0513p {

    /* renamed from: h */
    float f1689h;

    /* renamed from: i */
    boolean f1690i = false;

    /* renamed from: j */
    float f1691j;

    /* renamed from: k */
    Boolean f1692k;

    /* renamed from: l */
    Boolean f1693l;

    /* renamed from: m */
    public static C0748e f1694m = null;

    /* renamed from: n */
    public static C0748e[] f1695n = new C0748e[10];

    public AbstractC0274b(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f1689h);
        apVar.mo1090a(this.f1690i);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f1689h = kVar.m1061g();
        this.f1690i = kVar.m1063e();
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f1695n[this.f1461bB.m3518M()];
    }

    /* renamed from: K */
    public static void m3228K() {
        f1694m = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.unit_icon_air);
        f1695n = AbstractC0171m.m3501a(f1694m);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.AIR;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        C0573e b;
        super.mo404a(f);
        if (!this.f1459bz) {
            return;
        }
        if (this.f5844dJ > 0.0f) {
            this.f1689h += 0.06f * f;
            this.f5844dJ -= this.f1689h * f;
            return;
        }
        if (this.f1692k == null) {
            this.f1692k = Boolean.valueOf(m3298cu());
        }
        if (this.f1693l == null) {
            this.f1693l = Boolean.valueOf(m3299ct());
        }
        if (!this.f1690i) {
            this.f1690i = true;
            if (this.f1692k.booleanValue()) {
                m2288a(EnumC0519u.verysmall);
                if (this.f1693l.booleanValue()) {
                    AbstractC0789l.m638u().f5517bz.m2007a(this.f5842dH, this.f5843dI, 0.0f, 0, 0.0f, 0.0f, this.f1471bL);
                }
            } else {
                m2288a(EnumC0519u.small);
            }
            this.f1689h = 0.0f;
        } else if (!this.f1692k.booleanValue()) {
            this.f5844dJ = 0.0f;
        } else if (this.f5844dJ > -10.0f) {
            this.f1689h += 8.0E-4f * f;
            this.f5844dJ -= this.f1689h * f;
            if (this.f1693l.booleanValue()) {
                this.f1691j += f;
                if (this.f1691j > 30.0f) {
                    this.f1691j = 0.0f;
                    if (mo2163j() && (b = AbstractC0789l.m638u().f5517bz.m1993b(this.f5842dH, this.f5843dI, this.f5844dJ, this.f1471bL)) != null) {
                        b.f3869Q = 0.0f;
                        b.f3870R = -0.1f;
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f5844dJ > -1.0f) {
            for (int i = 0; i < 3; i++) {
                u.f5517bz.m1982e(this.f5842dH, this.f5843dI, this.f5844dJ);
            }
        }
        return super.mo2359e();
    }
}
