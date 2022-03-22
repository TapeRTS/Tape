package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aa.class */
public class C0205aa extends AbstractC0459i {

    /* renamed from: a */
    public int f1392a;

    /* renamed from: b */
    public float[] f1393b = new float[31];

    /* renamed from: c */
    public boolean[] f1394c = new boolean[31];

    /* renamed from: d */
    int f1395d;

    /* renamed from: e */
    public boolean f1396e;

    /* renamed from: f */
    public boolean f1397f;

    C0205aa(boolean z) {
        this.f1396e = z;
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
    public void m3358a(AbstractC0515r rVar) {
        float b = rVar.m2212b(false);
        this.f1395d = rVar.mo2205bg();
        for (int i = 0; i < this.f1395d; i++) {
            float z = rVar.mo2129z(i);
            if (z > b) {
                z = b;
            }
            this.f1393b[i] = (z * z) + 1.0f;
            this.f1394c[i] = false;
            if (rVar.mo2135v(i) == -1 && rVar.f1499cn[i].f1570j == null) {
                this.f1394c[i] = true;
            }
        }
        this.f1397f = true;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
        this.f1392a = 0;
        if (!this.f1397f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1397f = false;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        if (rVar.m2218b(afVar, true)) {
            this.f1392a++;
            if (this.f1396e) {
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
            for (int i = 0; i < this.f1395d; i++) {
                if (this.f1394c[i] && rVar.mo2306a(i, afVar, true, false) && a < this.f1393b[i] && a > rVar.mo2353A(i)) {
                    this.f1393b[i] = a;
                    rVar.f1499cn[i].f1570j = afVar;
                }
            }
        }
    }
}
