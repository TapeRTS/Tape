package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/x.class */
public class C0522x extends AbstractC0459i {

    /* renamed from: a */
    public int f3523a;

    /* renamed from: b */
    public float f3524b;

    /* renamed from: c */
    public boolean f3525c;

    /* renamed from: d */
    public boolean f3526d;

    C0522x(boolean z) {
        this.f3525c = z;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public int excludeTeam(AbstractC0515r rVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
        return rVar.f1461bB;
    }

    /* renamed from: a */
    public void m2125a(float f) {
        this.f3524b = (f * f) + 1.0f;
        this.f3526d = true;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
        this.f3523a = 0;
        if (!this.f3526d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f3526d = false;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        if (rVar.m2218b(afVar, true)) {
            this.f3523a++;
            if (this.f3525c) {
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                    if (!rVar2.mo2356l() || !rVar2.mo2168h(rVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            float a = C0654f.m1520a(rVar.f5842dH, rVar.f5843dI, afVar.f5842dH, afVar.f5843dI);
            if (a < this.f3524b) {
                this.f3524b = a;
                rVar.f3399I = afVar;
            }
        }
    }
}
