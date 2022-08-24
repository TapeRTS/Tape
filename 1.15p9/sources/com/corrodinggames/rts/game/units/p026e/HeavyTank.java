package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class HeavyTank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3614a = null;

    /* renamed from: b */
    static C0934e f3615b = null;

    /* renamed from: c */
    static C0934e[] f3616c = new C0934e[10];

    /* renamed from: d */
    static C0934e f3617d = null;

    /* renamed from: e */
    int f3618e;

    /* renamed from: f */
    float f3619f;

    /* renamed from: g */
    float f3620g;

    /* renamed from: h */
    Rect f3621h;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6582r() {
        return UnitType.heavyTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_tank);
        f3616c = AbstractC0197n.m5463a(mo930a);
        f3614a = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_tank_dead);
        f3615b = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_tank_turret);
        f3617d = m4986a(mo930a, mo930a.mo396m() / 3, mo930a.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3614a;
        }
        return f3616c[this.f1608bV.m5486O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3617d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return f3615b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT && this.f1623ck >= 1.0f && !this.f1627co;
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

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        this.f3880L = f3614a;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1503c);
        return true;
    }

    public HeavyTank(boolean z) {
        super(z);
        this.f3621h = new Rect();
        m2874a(f3616c[7], 3);
        this.f1620ch = 15.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 600.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3616c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (!this.f1606bT && this.f1616cd != 0.0f) {
            this.f3619f += f;
            if (this.f3619f > 1.4d) {
                this.f3619f = 0.0f;
                this.f3618e++;
                if (this.f3618e > 2) {
                    this.f3618e = 0;
                }
            }
            if (this.f6948eh) {
                this.f3620g += f;
                if (this.f3620g > 9.0f) {
                    this.f3620g = 0.0f;
                    m3599f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m3599f() {
        GameEngine m1234A = GameEngine.m1234A();
        float f = this.f1617ce;
        if (this.f1616cd < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            m1234A.f6110bR.m2529c(this.f6951ek + (C0758f.m2244i(f + 180.0f + f2) * this.f1620ch), this.f6952el + (C0758f.m2249h(f + 180.0f + f2) * this.f1620ch), this.f6953em, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3415bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        GameEngine m1234A = GameEngine.m1234A();
        if (!unit.mo3263i()) {
            PointF E = mo3241E(i);
            C0188f m5590a = C0188f.m5590a(this, E.f227a, E.f228b);
            PointF K = mo3231K(i);
            m5590a.f1010K = K.f227a;
            m5590a.f1011L = K.f228b;
            m5590a.f1042ar = Color.m6346a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m5590a.f1020U = mo3020q(i);
            m5590a.f985l = unit;
            m5590a.f981h = 60.0f;
            m5590a.f993t = 4.0f;
            m5590a.f997x = 2.0f;
            m5590a.f1067aQ = true;
            m5590a.f999z = true;
            m1234A.f6110bR.m2544a(m5590a, -16716288);
            m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1127220);
            m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
            m1234A.f6105bM.m2997a(C0631e.f4050u, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        PointF E2 = mo3241E(i);
        E2.m6277a(this.f6951ek, this.f6952el);
        C0188f m5590a2 = C0188f.m5590a(this, this.f6951ek, this.f6952el);
        m5590a2.f1042ar = Color.m6346a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m5590a2.f1020U = mo3020q(i);
        m5590a2.f985l = unit;
        m5590a2.f981h = 190.0f;
        m5590a2.f993t = 0.5f;
        m5590a2.f991r = 5.0f;
        m5590a2.f1058aH = true;
        m5590a2.f1059aI = 10.0f;
        m5590a2.f1060aJ = 15.0f;
        m5590a2.f1063aM = true;
        m5590a2.f1067aQ = true;
        m5590a2.f1057aG = true;
        m1234A.f6105bM.m2997a(C0631e.f4042m, 0.2f, this.f6951ek, this.f6952el);
        m1234A.f6110bR.m2544a(m5590a2, -1118720);
        m1234A.f6110bR.m2552a(E2.f227a, E2.f228b, this.f6953em, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3095bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3011w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo4844c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
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
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect mo3534a_(boolean z) {
        if (z) {
            return super.mo3534a_(z);
        }
        if (this.f1606bT) {
            return super.mo3534a_(z);
        }
        return super.m4985a(z, this.f3618e);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3235H(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public float mo3233I(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: J */
    public float mo3232J(int i) {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo4838e(f);
        C1117y.m495a(this, mo3032m());
    }
}
