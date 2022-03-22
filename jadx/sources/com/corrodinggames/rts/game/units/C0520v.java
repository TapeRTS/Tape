package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/v.class */
public class C0520v extends AbstractC0459i {

    /* renamed from: a */
    public float f3511a;

    /* renamed from: b */
    public float f3512b;

    /* renamed from: c */
    public C0365i f3513c;

    /* renamed from: d */
    public float f3514d;

    /* renamed from: e */
    public AbstractC0210af f3515e;

    /* renamed from: f */
    public boolean f3516f;

    /* renamed from: g */
    public boolean f3517g = false;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public int excludeTeam(AbstractC0515r rVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        if (!this.f3516f || afVar.mo2537g() > 0.0f) {
            float a = C0654f.m1520a(this.f3511a, this.f3512b, afVar.f5842dH, afVar.f5843dI);
            if (a >= this.f3514d) {
                return;
            }
            if (afVar.f1477bR < 1.0f && !this.f3517g) {
                return;
            }
            if (this.f3513c != null && !C0364h.m2904a(this.f3513c, afVar.mo2846cM())) {
                return;
            }
            if (!this.f3516f || rVar.mo2398w(afVar)) {
                this.f3515e = afVar;
                this.f3514d = a;
            }
        }
    }
}
