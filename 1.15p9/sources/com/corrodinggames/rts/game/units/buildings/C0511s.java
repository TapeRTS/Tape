package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.d.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class C0511s extends AbstractC0544i {

    /* renamed from: a */
    public float f3540a;

    /* renamed from: b */
    public boolean f3541b;

    /* renamed from: c */
    public boolean f3542c;

    /* renamed from: d */
    Team f3543d;

    /* renamed from: e */
    Unit f3544e;

    /* renamed from: f */
    float f3545f;

    /* renamed from: g */
    float f3546g;

    /* renamed from: h */
    boolean f3547h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511s(boolean z) {
        this.f3541b = z;
    }

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    /* renamed from: a */
    public void m4265a(float f, boolean z) {
        this.f3540a = f * f;
        this.f3547h = z;
        this.f3542c = true;
    }

    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f3544e = null;
        this.f3545f = -1.0f;
        this.f3546g = -1.0f;
        this.f3543d = abstractC0623y.team;
        if (!this.f3542c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.f3542c = false;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
        if (abstractC0623y == unit) {
            return;
        }
        if ((unit.f1631cs < unit.f1632ct || unit.f1623ck < 1.0f) && !unit.isDead && unit.f1650cL == null && this.f3543d.m6342d(unit.team) && abstractC0623y.mo3518a(unit)) {
            float m2366a = CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el);
            if (m2366a < this.f3540a) {
                if (unit.f1623ck < 1.0f && abstractC0623y.m3058g(unit) != null) {
                    return;
                }
                boolean z = false;
                if (!this.f3547h) {
                    if (this.f3545f == -1.0f || this.f3545f > unit.f1631cs) {
                        z = true;
                    }
                } else if (this.f3546g == -1.0f || this.f3546g > m2366a) {
                    z = true;
                }
                if (z && unit.mo4209g() == 0.0f) {
                    this.f3545f = unit.f1631cs;
                    this.f3546g = m2366a;
                    this.f3544e = unit;
                }
            }
        }
    }
}
