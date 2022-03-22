package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.EnumC0174p;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/l.class */
public class C0298l extends AbstractC0459i {

    /* renamed from: a */
    public C0365i f1851a;

    /* renamed from: b */
    public float f1852b;

    /* renamed from: c */
    public boolean f1853c;

    /* renamed from: d */
    public EnumC0174p f1854d;

    /* renamed from: e */
    public C0835m f1855e;

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
        C0365i cM = afVar.mo2846cM();
        if ((this.f1851a != null && (cM == null || !C0364h.m2904a(this.f1851a, cM))) || C0654f.m1520a(rVar.f5842dH, rVar.f5843dI, afVar.f5842dH, afVar.f5843dI) >= this.f1852b) {
            return;
        }
        if (afVar.f1477bR < 1.0f && !this.f1853c) {
            return;
        }
        if (this.f1854d == null || rVar.f1461bB.m3509a(this.f1854d, afVar.f1461bB)) {
            this.f1855e.add(afVar);
        }
    }
}
