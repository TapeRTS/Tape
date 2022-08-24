package com.corrodinggames.rts.game.units.p026e;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class TankDestroyer extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3676a = null;

    /* renamed from: b */
    static C0934e f3677b = null;

    /* renamed from: c */
    static C0934e f3678c = null;

    /* renamed from: d */
    static C0934e[] f3679d = new C0934e[10];

    /* renamed from: e */
    Rect f3680e;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6613r() {
        return UnitType.tankDestroyer;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3677b = m1234A.f6107bO.mo930a(C0067R.drawable.tank2);
        f3676a = m1234A.f6107bO.mo930a(C0067R.drawable.tank2_dead);
        f3678c = m1234A.f6107bO.mo930a(C0067R.drawable.tank2_turret);
        f3679d = AbstractC0197n.m5494a(f3677b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3676a;
        }
        return f3679d[this.f1608bV.m5517O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return f3678c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3676a;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4044o, 0.8f, this.f6951ek, this.f6952el);
        mo3081bq();
        return true;
    }

    public TankDestroyer(boolean z) {
        super(z);
        this.f3680e = new Rect();
        m2879T(16);
        m2878U(30);
        this.f1620ch = 11.0f;
        this.f1621ci = this.f1620ch + 2.0f;
        this.f1632ct = 350.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3677b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5621a = C0188f.m5621a(this, E.f227a, E.f228b);
        m5621a.f1020U = 35.0f;
        m5621a.f985l = unit;
        m5621a.f981h = 60.0f;
        m5621a.f993t = 3.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1127220);
        m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        m1234A.f6105bM.m2997a(C0631e.f4046q, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo4875c(f)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3410l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3140af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 10.0f;
    }
}
