package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.bd */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bd.class */
public class C0403bd extends AbstractC0544i {

    /* renamed from: a */
    public float f2493a;

    /* renamed from: b */
    public float f2494b;

    /* renamed from: c */
    public C0404be f2495c;

    /* renamed from: d */
    public int f2496d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y == abstractC0244am) {
            return;
        }
        C0449h m5192dc = abstractC0244am.m5192dc();
        C0449h c0449h = this.f2495c.f2499c;
        if ((c0449h == null || (m5192dc != null && C0448g.m4414a(c0449h, m5192dc))) && C0758f.m2363a(this.f2493a, this.f2494b, abstractC0244am.f6951ek, abstractC0244am.f6952el) < this.f2495c.f2502f) {
            if (abstractC0244am.f1623ck < 1.0f && this.f2495c.f2505i) {
                return;
            }
            if (this.f2495c.f2506j && !abstractC0244am.m5283bI()) {
                return;
            }
            if (this.f2495c.f2500d != null && !abstractC0623y.f1608bV.m5642a(this.f2495c.f2500d, abstractC0244am.f1608bV)) {
                return;
            }
            this.f2496d++;
        }
    }
}
