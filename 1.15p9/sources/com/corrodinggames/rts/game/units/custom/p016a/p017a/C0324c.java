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
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/c.class */
public class C0324c extends AbstractC0544i {

    /* renamed from: a */
    public boolean f1939a;

    /* renamed from: b */
    public C0449h f1940b;

    /* renamed from: c */
    public float f1941c;

    /* renamed from: d */
    public boolean f1942d;

    /* renamed from: e */
    public EnumC0200q f1943e;

    /* renamed from: f */
    public boolean f1944f;

    /* renamed from: g */
    public C1101m f1945g = new C1101m();

    /* renamed from: h */
    public Unit f1946h;

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
        if (this.f1940b == null || (m5787dc != null && C0448g.m5061a(this.f1940b, m5787dc))) {
            float m2366a = CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el);
            if (m2366a < this.f1941c) {
                if (unit.f1623ck < 1.0f && !this.f1942d) {
                    return;
                }
                if (this.f1943e != null && !abstractC0623y.team.m6390a(this.f1943e, unit.team)) {
                    return;
                }
                if (this.f1939a && !C1117y.m478b(abstractC0623y, unit.f6951ek, unit.f6952el)) {
                    return;
                }
                if (!this.f1944f) {
                    this.f1946h = unit;
                    this.f1941c = m2366a;
                    return;
                }
                this.f1945g.add(unit);
            }
        }
    }
}
