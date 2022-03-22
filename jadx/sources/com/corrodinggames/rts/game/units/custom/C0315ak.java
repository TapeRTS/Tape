package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.custom.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ak.class */
public class C0315ak extends AbstractC0459i {

    /* renamed from: a */
    public float f2063a;

    /* renamed from: b */
    public float f2064b;

    /* renamed from: c */
    public C0316al f2065c;

    /* renamed from: d */
    public int f2066d;

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
        if (rVar != afVar) {
            C0365i cM = afVar.mo2846cM();
            C0365i iVar = this.f2065c.f2069c;
            if ((iVar != null && (cM == null || !C0364h.m2904a(iVar, cM))) || C0654f.m1520a(this.f2063a, this.f2064b, afVar.f5842dH, afVar.f5843dI) >= this.f2065c.f2072f) {
                return;
            }
            if (afVar.f1477bR < 1.0f && this.f2065c.f2075i) {
                return;
            }
            if (this.f2065c.f2076j && !afVar.mo2643bw()) {
                return;
            }
            if (this.f2065c.f2070d == null || rVar.f1461bB.m3509a(this.f2065c.f2070d, afVar.f1461bB)) {
                this.f2066d++;
            }
        }
    }
}
