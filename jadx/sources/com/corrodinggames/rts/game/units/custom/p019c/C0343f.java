package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/f.class */
public class C0343f extends AbstractC0459i {

    /* renamed from: a */
    public C0340c f2329a;

    /* renamed from: b */
    public C0338a f2330b;

    /* renamed from: c */
    public AbstractC0210af f2331c;

    /* renamed from: d */
    public float f2332d;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public int excludeTeam(AbstractC0515r rVar) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
        return rVar.f1461bB;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        C0365i cP;
        if (rVar != afVar && (cP = afVar.mo2845cP()) != null && C0364h.m2904a(this.f2330b.f2310a, cP)) {
            if (rVar.f1461bB != afVar.f1461bB) {
                if (rVar.f1461bB.m3464d(afVar.f1461bB)) {
                    if (!this.f2330b.f2311b) {
                        return;
                    }
                } else if (!rVar.f1461bB.m3474c(afVar.f1461bB) || !this.f2330b.f2312c) {
                    return;
                }
            }
            float a = C0654f.m1520a(rVar.f5842dH, rVar.f5843dI, afVar.f5842dH, afVar.f5843dI);
            if (a < this.f2332d) {
                C0342e a2 = this.f2329a.m3024a(this.f2330b, false);
                if (a2 == null || a2.m3021a(afVar) == null) {
                    this.f2331c = afVar;
                    this.f2332d = a;
                }
            }
        }
    }
}
