package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class Battleship extends AbstractC0590f {

    /* renamed from: a */
    static C0934e f3802a = null;

    /* renamed from: b */
    static C0934e f3803b = null;

    /* renamed from: c */
    static C0934e f3804c = null;

    /* renamed from: d */
    static C0934e f3805d = null;

    /* renamed from: e */
    static C0934e[] f3806e = new C0934e[10];

    /* renamed from: f */
    Rect f3807f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6632r() {
        return UnitType.battleShip;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3415bN() {
        return 9000.0f;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3803b = m1234A.f6107bO.mo930a(C0067R.drawable.battle_ship_t2);
        f3802a = m1234A.f6107bO.mo930a(C0067R.drawable.battle_ship_t2_dead);
        f3804c = m1234A.f6107bO.mo930a(C0067R.drawable.battle_ship_t2_turret);
        f3806e = AbstractC0197n.m5512a(f3803b);
        f3805d = m5035a(f3803b, f3803b.mo396m(), f3803b.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo4891d() {
        if (this.f1606bT) {
            return f3802a;
        }
        return f3806e[this.f1608bV.m5535O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo4890d(int i) {
        return f3804c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo4880k() {
        return f3805d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo4888e() {
        GameEngine.m1234A().f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3802a;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    public Battleship(boolean z) {
        super(z);
        this.f3807f = new Rect();
        m2873b(f3803b);
        this.f1620ch = 20.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1200.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3803b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo4861a(float f) {
        super.mo4861a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo4877q(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4905a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5637a = C0188f.m5637a(this, E.f227a, E.f228b, this.f6953em, i);
        PointF K = mo3231K(i);
        m5637a.f1010K = K.f227a;
        m5637a.f1011L = K.f228b;
        m5637a.f1020U = mo4877q(i);
        m5637a.f985l = unit;
        m5637a.f981h = 80.0f;
        m5637a.f997x = 2.0f;
        m5637a.f993t = 4.0f;
        m5637a.f1018S = true;
        m5637a.f1042ar = Color.m6395a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m5637a.f1067aQ = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6105bM.m2997a(C0631e.f4047r, 0.2f, E.f227a, E.f228b);
        m1234A.f6110bR.m2544a(m5637a, -1118720);
        C0745e m2557a = m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        if (m2557a != null) {
            C0743c.m2546a(m2557a, this);
        }
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo4878m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo4873z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3095bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3245C(int i) {
        if (this.f1619cg && mo3095bc() > 0.95d) {
            if (i == 0) {
                return this.f1617ce + 140.0f;
            }
            return this.f1617ce - 140.0f;
        }
        return this.f1617ce;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo4916A() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo4915B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo4892c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo4875w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo4914C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo4913D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo4893c(float f) {
        if (!super.mo4893c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo4879l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo4902af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo4895bl() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo4911G(int i) {
        float f;
        PointF G = super.mo4911G(i);
        float f2 = G.f227a;
        float f3 = G.f228b;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        f3981bg.m6326a(f2 + (C0758f.m2244i(this.f1617ce) * f), f3 + (C0758f.m2249h(this.f1617ce) * f));
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo4898b(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo4886e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo4887e(float f) {
        super.mo4887e(f);
        C1117y.m495a(this, mo4878m());
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
