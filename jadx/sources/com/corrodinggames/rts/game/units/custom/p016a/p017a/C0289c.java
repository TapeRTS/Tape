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
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/c.class */
public class C0289c extends AbstractC0459i {

    /* renamed from: a */
    public boolean f1785a;

    /* renamed from: b */
    public C0365i f1786b;

    /* renamed from: c */
    public float f1787c;

    /* renamed from: d */
    public boolean f1788d;

    /* renamed from: e */
    public EnumC0174p f1789e;

    /* renamed from: f */
    public boolean f1790f;

    /* renamed from: g */
    public C0835m f1791g = new C0835m();

    /* renamed from: h */
    public AbstractC0210af f1792h;

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
        if (this.f1786b == null || (cM != null && C0364h.m2904a(this.f1786b, cM))) {
            float a = C0654f.m1520a(rVar.f5842dH, rVar.f5843dI, afVar.f5842dH, afVar.f5843dI);
            if (a >= this.f1787c) {
                return;
            }
            if (afVar.f1477bR < 1.0f && !this.f1788d) {
                return;
            }
            if (this.f1789e != null && !rVar.f1461bB.m3509a(this.f1789e, afVar.f1461bB)) {
                return;
            }
            if (this.f1785a && !C0851y.m411b(rVar, afVar.f5842dH, afVar.f5843dI)) {
                return;
            }
            if (!this.f1790f) {
                this.f1792h = afVar;
                this.f1787c = a;
                return;
            }
            this.f1791g.add(afVar);
        }
    }
}
