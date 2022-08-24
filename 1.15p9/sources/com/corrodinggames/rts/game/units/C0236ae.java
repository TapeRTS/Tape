package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ae.class */
public class C0236ae extends AbstractC0544i {

    /* renamed from: a */
    public int f1523a;

    /* renamed from: b */
    public float f1524b;

    /* renamed from: c */
    public boolean f1525c;

    /* renamed from: d */
    public boolean f1526d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0236ae(boolean z) {
        this.f1525c = z;
    }

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return abstractC0623y.team;
    }

    /* renamed from: a */
    public void m5965a(float f) {
        this.f1524b = (f * f) + 1.0f;
        this.f1526d = true;
    }

    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1523a = 0;
        if (!this.f1526d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1526d = false;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
        if (abstractC0623y.m3117b(unit, true)) {
            this.f1523a++;
            if (this.f1525c) {
                if (!(unit instanceof AbstractC0623y)) {
                    return;
                }
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                if (!abstractC0623y2.canAttack() || !abstractC0623y2.m3043k(abstractC0623y)) {
                    return;
                }
            }
            float m2366a = CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el);
            if (m2366a < this.f1524b) {
                this.f1524b = m2366a;
                abstractC0623y.f3891Q = unit;
            }
        }
    }
}
