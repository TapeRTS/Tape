package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class C0234ac extends AbstractC0544i {

    /* renamed from: a */
    public float f1510a;

    /* renamed from: b */
    public float f1511b;

    /* renamed from: c */
    public C0449h f1512c;

    /* renamed from: d */
    public float f1513d;

    /* renamed from: e */
    public Unit f1514e;

    /* renamed from: f */
    public boolean f1515f;

    /* renamed from: g */
    public boolean f1516g = false;

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
        if (this.f1515f && unit.mo4209g() <= 0.0f) {
            return;
        }
        float m2366a = CommonUtils.m2366a(this.f1510a, this.f1511b, unit.f6951ek, unit.f6952el);
        if (m2366a < this.f1513d) {
            if (unit.f1623ck < 1.0f && !this.f1516g) {
                return;
            }
            if (this.f1512c != null && !C0448g.m5061a(this.f1512c, unit.m5787dc())) {
                return;
            }
            if ((this.f1515f && !abstractC0623y.mo3501g(unit, true)) || unit.f1650cL != null) {
                return;
            }
            this.f1514e = unit;
            this.f1513d = m2366a;
        }
    }
}
