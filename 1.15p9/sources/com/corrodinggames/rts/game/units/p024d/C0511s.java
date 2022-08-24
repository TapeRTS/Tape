package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.d.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class C0511s extends AbstractC0544i {

    /* renamed from: a */
    public float f3540a;

    /* renamed from: b */
    public boolean f3541b;

    /* renamed from: c */
    public boolean f3542c;

    /* renamed from: d */
    AbstractC0197n f3543d;

    /* renamed from: e */
    AbstractC0244am f3544e;

    /* renamed from: f */
    float f3545f;

    /* renamed from: g */
    float f3546g;

    /* renamed from: h */
    boolean f3547h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511s(boolean z) {
        this.f3541b = z;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    /* renamed from: a */
    public void m3696a(float f, boolean z) {
        this.f3540a = f * f;
        this.f3547h = z;
        this.f3542c = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f3544e = null;
        this.f3545f = -1.0f;
        this.f3546g = -1.0f;
        this.f3543d = abstractC0623y.f1608bV;
        if (!this.f3542c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.f3542c = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y == abstractC0244am) {
            return;
        }
        if ((abstractC0244am.f1631cs < abstractC0244am.f1632ct || abstractC0244am.f1623ck < 1.0f) && !abstractC0244am.f1606bT && abstractC0244am.f1650cL == null && this.f3543d.m5594d(abstractC0244am.f1608bV) && abstractC0623y.m3202a(abstractC0244am)) {
            float m2363a = C0758f.m2363a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0244am.f6951ek, abstractC0244am.f6952el);
            if (m2363a < this.f3540a) {
                if (abstractC0244am.f1623ck < 1.0f && abstractC0623y.m3055g(abstractC0244am) != null) {
                    return;
                }
                boolean z = false;
                if (!this.f3547h) {
                    if (this.f3545f == -1.0f || this.f3545f > abstractC0244am.f1631cs) {
                        z = true;
                    }
                } else if (this.f3546g == -1.0f || this.f3546g > m2363a) {
                    z = true;
                }
                if (z && abstractC0244am.m5167g() == 0.0f) {
                    this.f3545f = abstractC0244am.f1631cs;
                    this.f3546g = m2363a;
                    this.f3544e = abstractC0244am;
                }
            }
        }
    }
}
