package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class LaserTank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3647a = null;

    /* renamed from: b */
    static C0934e f3648b = null;

    /* renamed from: c */
    static C0934e f3649c = null;

    /* renamed from: d */
    static C0934e f3650d = null;

    /* renamed from: e */
    static C0934e[] f3651e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3652f = null;

    /* renamed from: g */
    Rect f3653g;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6748r() {
        return UnitType.laserTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3648b = m1234A.f6107bO.mo930a(C0067R.drawable.laser_tank_base);
        f3647a = m1234A.f6107bO.mo930a(C0067R.drawable.laser_tank_dead);
        f3649c = m1234A.f6107bO.mo930a(C0067R.drawable.laser_tank_turrent);
        f3650d = m1234A.f6107bO.mo930a(C0067R.drawable.laser_tank_charge);
        f3651e = AbstractC0197n.m5629a(f3648b);
        f3652f = m5151a(f3648b, f3648b.mo396m(), f3648b.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3647a;
        }
        return f3651e[this.f1608bV.m5652O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3652f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return f3649c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine.m1234A();
        this.f3880L = f3647a;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1502b);
        return true;
    }

    public LaserTank(boolean z) {
        super(z);
        this.f3653g = new Rect();
        m2874a(f3648b, 1);
        this.f1620ch = 14.0f;
        this.f1621ci = this.f1620ch + 2.0f;
        this.f1632ct = 300.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3648b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5756a = C0188f.m5756a(this, E.f227a, E.f228b);
        m5756a.f1020U = mo3020q(i);
        m5756a.f985l = unit;
        m5756a.f981h = 8.0f;
        m5756a.f1001B = true;
        m5756a.f1000A = true;
        m5756a.f1067aQ = true;
        m5756a.f1042ar = Color.m6512a(80, 255, 0, 0);
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1127220);
        m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        m1234A.f6105bM.m2997a(C0631e.f4054y, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public float mo3620bV() {
        if (this.f1648cJ[0].f1715e > 0.0f) {
            return 1.0f - (this.f1648cJ[0].f1715e / mo3115b(0));
        }
        if (this.f1648cJ[0].f1716f != 0.0f) {
            return this.f1648cJ[0].f1716f / mo3058e(0);
        }
        return super.mo4403bV();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bW */
    public boolean mo3619bW() {
        return this.f1648cJ[0].f1715e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3058e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo3445c(f)) {
            return false;
        }
        GameEngine m1234A = GameEngine.m1234A();
        C1117y.m487a((AbstractC0623y) this);
        if (!this.f1606bT) {
            float mo3058e = this.f1648cJ[0].f1716f / mo3058e(0);
            if (mo3058e != 0.0f) {
                PointF E = mo3241E(0);
                m1234A.f6107bO.mo880i();
                m1234A.f6107bO.mo896b(E.f227a - m1234A.f6138cv, E.f228b - m1234A.f6139cw);
                m1234A.f6107bO.mo935a(mo3058e, mo3058e);
                m1234A.f6107bO.mo915a(f3650d, 0.0f, 0.0f, (Paint) null);
                m1234A.f6107bO.mo879j();
                return true;
            }
            return true;
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
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 19.0f;
    }
}
