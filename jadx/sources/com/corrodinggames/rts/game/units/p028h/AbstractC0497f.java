package com.corrodinggames.rts.game.units.p028h;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0513p;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.h.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class AbstractC0497f extends AbstractC0513p {

    /* renamed from: m */
    float f3365m;

    /* renamed from: n */
    float f3366n;

    /* renamed from: o */
    boolean f3367o = false;

    /* renamed from: p */
    public static C0748e f3368p = null;

    /* renamed from: q */
    public static C0748e[] f3369q = new C0748e[10];

    public AbstractC0497f(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f3366n);
        apVar.mo1090a(this.f3367o);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3366n = kVar.m1061g();
        this.f3367o = kVar.m1063e();
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3369q[this.f1461bB.m3518M()];
    }

    /* renamed from: L */
    public static void m2385L() {
        f3368p = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.unit_icon_water);
        f3369q = AbstractC0171m.m3501a(f3368p);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.WATER;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cf */
    public boolean mo2384cf() {
        return true;
    }

    /* renamed from: f */
    public boolean mo2383f() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (this.f1459bz) {
            if (this.f5844dJ > -10.0f) {
                this.f3366n += 0.002f * f;
                this.f5844dJ -= this.f3366n * f;
                return;
            }
            this.f5844dJ = -10.0f;
            if (!this.f3367o) {
                this.f3367o = true;
            }
        } else if (m3321bG() && !this.f1459bz && mo2383f()) {
            if (this.f1470bK != 0.0f) {
                this.f3365m += f;
            }
            if (this.f3365m > 10.0f) {
                this.f3365m = 0.0f;
                if (mo2163j()) {
                    AbstractC0789l u = AbstractC0789l.m638u();
                    float f2 = this.f1471bL + 180.0f;
                    if (this.f1470bK < 0.0f) {
                        f2 += 180.0f;
                    }
                    float f3 = this.f1474bO - 6.0f;
                    if (f3 < 4.0f) {
                        f3 = 4.0f;
                    }
                    u.f5517bz.m1993b(this.f5842dH + (C0654f.m1421i(f2) * f3), this.f5843dI + (C0654f.m1425h(f2) * f3), 0.0f, f2);
                }
            }
        }
    }
}
