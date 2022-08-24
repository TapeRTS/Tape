package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.gameFramework.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class C0722bg {

    /* renamed from: a */
    C0725bj f4548a = new C0725bj(this);

    /* renamed from: b */
    C0725bj[] f4549b = new C0725bj[Team.f1366e];

    /* renamed from: c */
    public static C0724bi f4550c = new C0724bi();

    /* renamed from: a */
    public void m2618a(C0859ar c0859ar) {
        c0859ar.m1549e("stats");
        c0859ar.m1554c(0);
        int i = Team.f1364c;
        c0859ar.mo1487a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f4549b[i2].m2614a(c0859ar);
        }
        c0859ar.mo1485a("stats");
    }

    /* renamed from: a */
    public void m2617a(C0876k c0876k, boolean z) {
        c0876k.m1460b("stats");
        c0876k.m1457d();
        int m1454f = c0876k.m1454f();
        this.f4549b = new C0725bj[Team.f1366e];
        for (int i = 0; i < m1454f; i++) {
            this.f4549b[i] = new C0725bj(this);
            this.f4549b[i].m2613a(c0876k);
        }
        c0876k.m1456d("stats");
    }

    /* renamed from: a */
    public void m2622a() {
        this.f4548a = new C0725bj(this);
        this.f4549b = new C0725bj[Team.f1366e];
        for (int i = 0; i < this.f4549b.length; i++) {
            this.f4549b[i] = new C0725bj(this);
        }
    }

    /* renamed from: a */
    public C0725bj m2620a(Unit unit) {
        return m2621a(unit.team);
    }

    /* renamed from: a */
    public C0725bj m2621a(Team team) {
        int i = team.f1305k;
        if (i < 0 || i >= this.f4549b.length) {
            return this.f4548a;
        }
        C0725bj c0725bj = this.f4549b[i];
        if (c0725bj == null) {
            return this.f4548a;
        }
        return c0725bj;
    }

    /* renamed from: a */
    public void m2619a(Unit unit, Unit unit2, float f) {
        if (unit != null) {
            boolean z = unit2.isDead;
            C0725bj m2620a = m2620a(unit);
            C0725bj m2620a2 = m2620a(unit2);
            if (z) {
                f4550c.m2615a(unit, unit2);
                if (unit2.m5867bI()) {
                    m2620a.f4555d++;
                    m2620a2.f4558g++;
                } else if (unit2.m5788db()) {
                    m2620a.f4556e++;
                    m2620a2.f4559h++;
                } else {
                    m2620a.f4554c++;
                    m2620a2.f4557f++;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit2.team == gameEngine.f6093bs) {
            gameEngine.m1196a(unit2, f);
        }
    }
}
