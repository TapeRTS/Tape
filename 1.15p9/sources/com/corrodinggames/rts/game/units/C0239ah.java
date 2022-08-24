package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.game.units.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ah.class */
public class C0239ah extends AbstractC0544i {

    /* renamed from: a */
    public int f1533a;

    /* renamed from: b */
    public float[] f1534b = new float[31];

    /* renamed from: c */
    public boolean[] f1535c = new boolean[31];

    /* renamed from: d */
    int f1536d;

    /* renamed from: e */
    public boolean f1537e;

    /* renamed from: f */
    public boolean f1538f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0239ah(boolean z) {
        this.f1537e = z;
    }

    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return abstractC0623y.team;
    }

    /* renamed from: a */
    public void m5962a(AbstractC0623y abstractC0623y) {
        float m3111b = abstractC0623y.m3111b(false);
        this.f1536d = abstractC0623y.mo3512bl();
        for (int i = 0; i < this.f1536d; i++) {
            float m3013z = abstractC0623y.m3013z(i);
            if (m3013z > m3111b) {
                m3013z = m3111b;
            }
            this.f1534b[i] = (m3013z * m3013z) + 1.0f;
            this.f1535c[i] = false;
            if (abstractC0623y.m3019v(i) == -1 && abstractC0623y.f1648cJ[i].f1720j == null) {
                this.f1535c[i] = true;
            }
        }
        this.f1538f = true;
    }

    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1533a = 0;
        if (!this.f1538f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1538f = false;
    }

    public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
        if (abstractC0623y.m3117b(unit, true)) {
            this.f1533a++;
            if (this.f1537e) {
                if (!(unit instanceof AbstractC0623y)) {
                    return;
                }
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                if (!abstractC0623y2.canAttack() || !abstractC0623y2.m3043k(abstractC0623y)) {
                    return;
                }
            }
            float m2366a = CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el);
            for (int i = 0; i < this.f1536d; i++) {
                if (this.f1535c[i] && abstractC0623y.m3209a(i, unit, true, false) && m2366a < this.f1534b[i] && m2366a > abstractC0623y.m3256A(i)) {
                    this.f1534b[i] = m2366a;
                    abstractC0623y.f1648cJ[i].f1720j = unit;
                }
            }
        }
    }
}
