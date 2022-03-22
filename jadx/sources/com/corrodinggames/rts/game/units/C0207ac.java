package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;

/* renamed from: com.corrodinggames.rts.game.units.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class C0207ac extends AbstractC0459i {

    /* renamed from: a */
    float f1419a;

    /* renamed from: b */
    float f1420b;

    /* renamed from: c */
    public C0206ab f1421c;

    C0207ac() {
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public int excludeTeam(AbstractC0515r rVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
        this.f1421c = null;
    }

    /* renamed from: a */
    public void m3349a(float f, float f2) {
        this.f1419a = f;
        this.f1420b = f2;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
        if ((afVar instanceof C0206ab) && !afVar.f1459bz && afVar.m3312c(this.f1419a, this.f1420b, 0.0f)) {
            this.f1421c = (C0206ab) afVar;
        }
    }
}
