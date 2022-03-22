package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class C0426q extends AbstractC0459i {

    /* renamed from: a */
    public float f3081a;

    /* renamed from: b */
    public boolean f3082b;

    /* renamed from: c */
    public boolean f3083c;

    /* renamed from: d */
    AbstractC0171m f3084d;

    /* renamed from: e */
    AbstractC0210af f3085e;

    /* renamed from: f */
    float f3086f;

    /* renamed from: g */
    float f3087g;

    /* renamed from: h */
    boolean f3088h;

    C0426q(boolean z) {
        this.f3082b = z;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public int excludeTeam(AbstractC0515r rVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
        return null;
    }

    /* renamed from: a */
    public void m2557a(float f, boolean z) {
        this.f3081a = f * f;
        this.f3088h = z;
        this.f3083c = true;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
        this.f3085e = null;
        this.f3086f = -1.0f;
        this.f3087g = -1.0f;
        this.f3084d = rVar.f1461bB;
        if (!this.f3083c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.f3083c = false;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        if (rVar != afVar) {
            if ((afVar.f1484bY < afVar.f1485bZ || afVar.f1477bR < 1.0f) && !afVar.f1459bz && afVar.f1501cp == null && this.f3084d.m3464d(afVar.f1461bB) && rVar.mo2302a(afVar)) {
                float a = C0654f.m1520a(rVar.f5842dH, rVar.f5843dI, afVar.f5842dH, afVar.f5843dI);
                if (a < this.f3081a) {
                    boolean z = false;
                    if (!this.f3088h) {
                        if (this.f3086f == -1.0f || this.f3086f > afVar.f1484bY) {
                            z = true;
                        }
                    } else if (this.f3087g == -1.0f || this.f3087g > a) {
                        z = true;
                    }
                    if (z && afVar.mo2537g() == 0.0f) {
                        this.f3086f = afVar.f1484bY;
                        this.f3087g = a;
                        this.f3085e = afVar;
                    }
                }
            }
        }
    }
}
