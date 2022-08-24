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

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class ExperimentalTank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3601a = null;

    /* renamed from: b */
    static C0934e f3602b = null;

    /* renamed from: c */
    static C0934e f3603c = null;

    /* renamed from: d */
    static C0934e[] f3604d = new C0934e[10];

    /* renamed from: e */
    int f3605e;

    /* renamed from: f */
    float f3606f;

    /* renamed from: g */
    Rect f3607g;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6365r() {
        return UnitType.experimentalTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_tank);
        f3604d = AbstractC0197n.m5244a(mo930a);
        f3601a = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_tank_dead);
        f3602b = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_tank_turret);
        f3603c = m4772a(mo930a, mo930a.mo396m() / 2, mo930a.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3601a;
        }
        return f3604d[this.f1608bV.m5267O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3603c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f && this.f1623ck >= 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        if (m3625R(i)) {
            return null;
        }
        return f3602b;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3574e() {
        GameEngine.m1234A();
        m3199a(EnumC0233ab.largeUnit);
        this.f3880L = f3601a;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    public ExperimentalTank(boolean z) {
        super(z);
        this.f3607g = new Rect();
        m2874a(f3604d[7], 2);
        this.f1620ch = 37.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 6000.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3604d[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (!this.f1606bT) {
            if (this.f1622cj != 0.0f) {
                m472S(2);
            } else {
                m472S(4);
            }
        }
        if (this.f1647cI) {
            this.f3606f += f;
            if (this.f3606f > 5.0f) {
                this.f3606f = 0.0f;
                this.f3605e = 1 - this.f3605e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3576bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        if (!m3625R(i)) {
            PointF E = mo3437E(i);
            C0188f m5371a = C0188f.m5371a(this, E.f227a, E.f228b);
            PointF K = mo3231K(i);
            m5371a.f1010K = K.f227a;
            m5371a.f1011L = K.f228b;
            m5371a.f1042ar = Color.m6127a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            m5371a.f981h = 120.0f;
            m5371a.f993t = 5.0f;
            m5371a.f985l = unit;
            m5371a.f1024Y = 60.0f;
            m5371a.f1020U = 40.0f;
            m5371a.f1025Z = 45.0f;
            m5371a.f1026aa = true;
            m5371a.f997x = 2.0f;
            m5371a.f1067aQ = true;
            m5371a.f1015P = (short) 9;
            m5371a.f997x = 1.0f;
            m5371a.f6949ei = this.f6949ei;
            GameEngine m1234A = GameEngine.m1234A();
            m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, 16745216);
            m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
            m1234A.f6110bR.m2544a(m5371a, -1127220);
            m1234A.f6105bM.m2997a(C0631e.f4051v, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        PointF E2 = mo3437E(i);
        E2.m6058a(this.f6951ek, this.f6952el);
        C0188f m5371a2 = C0188f.m5371a(this, this.f6951ek, this.f6952el);
        m5371a2.f1042ar = Color.m6127a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m5371a2.f1020U = 60.0f;
        m5371a2.f985l = unit;
        m5371a2.f981h = 190.0f;
        m5371a2.f993t = 3.0f;
        m5371a2.f991r = 6.0f;
        m5371a2.f1058aH = true;
        m5371a2.f1059aI = 10.0f;
        m5371a2.f1060aJ = 15.0f;
        m5371a2.f1063aM = true;
        m5371a2.f1067aQ = true;
        m5371a2.f1057aG = true;
        m5371a2.f6949ei = this.f6949ei;
        GameEngine m1234A2 = GameEngine.m1234A();
        m1234A2.f6105bM.m2997a(C0631e.f4042m, 0.2f, this.f6951ek, this.f6952el);
        m1234A2.f6110bR.m2544a(m5371a2, -1118720);
        m1234A2.f6110bR.m2552a(E2.f227a, E2.f228b, this.f6953em, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3202a(int i, Unit unit, boolean z, boolean z2) {
        if (!z && z2 && !m3047h(unit)) {
            return false;
        }
        if (m3625R(i)) {
            if (!unit.mo3283i()) {
                return false;
            }
            return true;
        } else if (unit.mo3283i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        if (m3625R(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3058e(int i) {
        if (m3625R(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3095bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bh */
    public int mo3090bh() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3011w(int i) {
        if (m3625R(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        if (m3625R(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect mo3578a_(boolean z) {
        if (this.f1606bT && !z) {
            return super.mo4803a_(z);
        }
        if (z) {
            return super.mo4803a_(z);
        }
        int i = 0 + (this.f3605e * this.f4223eo);
        this.f3607g.m6053a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f3607g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo462c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3573l() {
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3237G(int i) {
        PointF G = super.mo3459G(i);
        float f = G.f227a;
        float f2 = G.f228b;
        if (!m3625R(i)) {
            if (i <= 1) {
                f += C0758f.m2244i(this.f1617ce) * 5.0f;
                f2 += C0758f.m2249h(this.f1617ce) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += C0758f.m2244i(this.f1617ce + f3) * 18.0f;
            f2 += C0758f.m2249h(this.f1617ce + f3) * 18.0f;
        }
        f3981bg.m6058a(f, f2);
        return f3981bg;
    }

    /* renamed from: R */
    public boolean m3625R(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3086bl() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, mo3032m());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cu */
    public int mo3622cu() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: db */
    public boolean mo3621db() {
        return true;
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
}
