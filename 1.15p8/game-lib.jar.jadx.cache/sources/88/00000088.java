package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p026f.AbstractC0526i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y.class */
public class C0591y extends AbstractC0526i {

    /* renamed from: a */
    public int f3814a;

    /* renamed from: b */
    public float f3815b;

    /* renamed from: c */
    public boolean f3816c;

    /* renamed from: d */
    public boolean f3817d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0591y(boolean z) {
        this.f3816c = z;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public int excludeTeam(OrderableUnit orderableUnit) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public Team onlyEnemiesOfTeam(OrderableUnit orderableUnit) {
        return orderableUnit.team;
    }

    /* renamed from: a */
    public void m2427a(float f) {
        this.f3815b = (f * f) + 1.0f;
        this.f3817d = true;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public void setup(OrderableUnit orderableUnit, float f) {
        this.f3814a = 0;
        if (!this.f3817d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f3817d = false;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0527j
    public void callback(OrderableUnit orderableUnit, float f, Unit unit) {
        if (orderableUnit.m2534b(unit, true)) {
            this.f3814a++;
            if (this.f3816c) {
                if (!(unit instanceof OrderableUnit)) {
                    return;
                }
                OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                if (!orderableUnit2.canAttack() || !orderableUnit2.mo2461k(orderableUnit)) {
                    return;
                }
            }
            float distanceSq = CommonUtils.distanceSq(orderableUnit.x, orderableUnit.y, unit.x, unit.y);
            if (distanceSq < this.f3815b) {
                this.f3815b = distanceSq;
                orderableUnit.f3674K = unit;
            }
        }
    }
}