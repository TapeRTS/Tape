package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/n.class */
public class C0335n extends AbstractC0544i {

    /* renamed from: a */
    public C0449h f2021a;

    /* renamed from: b */
    public float f2022b;

    /* renamed from: c */
    public boolean f2023c;

    /* renamed from: d */
    public EnumC0200q f2024d;

    /* renamed from: e */
    public C1101m f2025e;

    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public Team onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
        C0449h m5787dc = unit.m5787dc();
        if ((this.f2021a == null || (m5787dc != null && C0448g.m5061a(this.f2021a, m5787dc))) && CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el) < this.f2022b) {
            if (unit.f1623ck < 1.0f && !this.f2023c) {
                return;
            }
            if (this.f2024d != null && !abstractC0623y.team.m6390a(this.f2024d, unit.team)) {
                return;
            }
            this.f2025e.add(unit);
        }
    }
}
