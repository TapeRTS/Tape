package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.p026f.AbstractC0526i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/w.class */
public class C0589w extends AbstractC0526i {

    /* renamed from: a */
    public float f3801a;

    /* renamed from: b */
    public float f3802b;

    /* renamed from: c */
    public ValueList f3803c;

    /* renamed from: d */
    public float f3804d;

    /* renamed from: e */
    public Unit f3805e;

    /* renamed from: f */
    public boolean f3806f;

    /* renamed from: g */
    public boolean f3807g = false;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public void setup(OrderableUnit orderableUnit, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public int excludeTeam(OrderableUnit orderableUnit) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public Team onlyEnemiesOfTeam(OrderableUnit orderableUnit) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
    public Team onlyTeam(OrderableUnit orderableUnit) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0527j
    public void callback(OrderableUnit orderableUnit, float f, Unit unit) {
        if (this.f3806f && unit.mo2862g() <= 0.0f) {
            return;
        }
        float distanceSq = CommonUtils.distanceSq(this.f3801a, this.f3802b, unit.x, unit.y);
        if (distanceSq < this.f3804d) {
            if (unit.built < 1.0f && !this.f3807g) {
                return;
            }
            if (this.f3803c != null && !ValueListSource.m3248a(this.f3803c, unit.mo3167da())) {
                return;
            }
            if (this.f3806f && !orderableUnit.mo2728C(unit)) {
                return;
            }
            this.f3805e = unit;
            this.f3804d = distanceSq;
        }
    }
}