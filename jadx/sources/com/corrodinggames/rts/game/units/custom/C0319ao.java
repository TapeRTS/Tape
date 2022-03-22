package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;

/* renamed from: com.corrodinggames.rts.game.units.custom.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ao.class */
public class C0319ao extends AbstractC0459i {

    /* renamed from: a */
    C0163f f2088a;

    /* renamed from: b */
    C0320ap f2089b;

    /* renamed from: c */
    AbstractC0210af f2090c;

    /* renamed from: d */
    C0163f f2091d;

    /* renamed from: e */
    AbstractC0210af f2092e;

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0459i
    public void setup(AbstractC0515r rVar, float f) {
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
    public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0460j
    public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
    }
}
