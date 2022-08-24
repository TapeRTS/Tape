package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/f.class */
public class C0421f extends AbstractC0544i {

    /* renamed from: a */
    public C0418c f2683a;

    /* renamed from: b */
    public C0416a f2684b;

    /* renamed from: c */
    public AbstractC0244am f2685c;

    /* renamed from: d */
    public float f2686d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -3;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
        return abstractC0623y.f1608bV;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        C0449h m5189df;
        if (abstractC0623y != abstractC0244am && (m5189df = abstractC0244am.m5189df()) != null && C0448g.m4414a(this.f2684b.f2664a, m5189df)) {
            if (abstractC0623y.f1608bV != abstractC0244am.f1608bV) {
                if (abstractC0623y.f1608bV.m5594d(abstractC0244am.f1608bV)) {
                    if (!this.f2684b.f2665b) {
                        return;
                    }
                } else if (!abstractC0623y.f1608bV.m5606c(abstractC0244am.f1608bV) || !this.f2684b.f2666c) {
                    return;
                }
            }
            float m2363a = C0758f.m2363a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0244am.f6951ek, abstractC0244am.f6952el);
            if (m2363a < this.f2686d) {
                C0420e m4590a = this.f2683a.m4590a(this.f2684b, false);
                if (m4590a == null || m4590a.m4587a(abstractC0244am) == null) {
                    this.f2685c = abstractC0244am;
                    this.f2686d = m2363a;
                }
            }
        }
    }
}
