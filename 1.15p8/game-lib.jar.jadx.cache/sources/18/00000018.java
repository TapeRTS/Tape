package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p026f.AbstractC0526i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ab.class */
public class C0227ab extends AbstractC0526i {

    /* renamed from: a */
    public int f1474a;

    /* renamed from: b */
    public float[] f1475b = new float[31];

    /* renamed from: c */
    public boolean[] f1476c = new boolean[31];

    /* renamed from: d */
    int f1477d;

    /* renamed from: e */
    public boolean f1478e;

    /* renamed from: f */
    public boolean f1479f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0227ab(boolean z) {
        this.f1478e = z;
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
    public void m3803a(OrderableUnit orderableUnit) {
        float m2528b = orderableUnit.m2528b(false);
        this.f1477d = orderableUnit.mo2512bk();
        for (int i = 0; i < this.f1477d; i++) {
            float mo2431z = orderableUnit.mo2431z(i);
            if (mo2431z > m2528b) {
                mo2431z = m2528b;
            }
            this.f1475b[i] = (mo2431z * mo2431z) + 1.0f;
            this.f1476c[i] = false;
            if (orderableUnit.mo2437v(i) == -1 && orderableUnit.f1532cC[i].f1661j == null) {
                this.f1476c[i] = true;
            }
        }
        this.f1479f = true;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public void setup(OrderableUnit orderableUnit, float f) {
        this.f1474a = 0;
        if (!this.f1479f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1479f = false;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0527j
    public void callback(OrderableUnit orderableUnit, float f, Unit unit) {
        if (orderableUnit.m2534b(unit, true)) {
            this.f1474a++;
            if (this.f1478e) {
                if (!(unit instanceof OrderableUnit)) {
                    return;
                }
                OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                if (!orderableUnit2.canAttack() || !orderableUnit2.mo2461k(orderableUnit)) {
                    return;
                }
            }
            float distanceSq = CommonUtils.distanceSq(orderableUnit.x, orderableUnit.y, unit.x, unit.y);
            for (int i = 0; i < this.f1477d; i++) {
                if (this.f1476c[i] && orderableUnit.mo2625a(i, unit, true, false) && distanceSq < this.f1475b[i] && distanceSq > orderableUnit.mo2672A(i)) {
                    this.f1475b[i] = distanceSq;
                    orderableUnit.f1532cC[i].f1661j = unit;
                }
            }
        }
    }
}