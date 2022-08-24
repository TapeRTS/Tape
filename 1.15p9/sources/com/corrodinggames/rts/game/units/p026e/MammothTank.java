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
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class MammothTank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3654a = null;

    /* renamed from: b */
    static C0934e f3655b = null;

    /* renamed from: c */
    static C0934e[] f3656c = new C0934e[10];

    /* renamed from: d */
    static C0934e f3657d = null;

    /* renamed from: e */
    public static C0934e f3658e = null;

    /* renamed from: f */
    int f3659f;

    /* renamed from: g */
    float f3660g;

    /* renamed from: h */
    Rect f3661h;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6402r() {
        return UnitType.mammothTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.mammoth_tank);
        f3656c = AbstractC0197n.m5281a(mo930a);
        f3654a = m1234A.f6107bO.mo930a(C0067R.drawable.mammoth_tank_dead);
        f3655b = m1234A.f6107bO.mo930a(C0067R.drawable.mammoth_tank_turret);
        f3658e = m1234A.f6107bO.mo930a(C0067R.drawable.lighting_charge);
        f3657d = m4809a(mo930a, mo930a.mo396m() / 2, mo930a.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3654a;
        }
        return f3656c[this.f1608bV.m5304O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3657d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return f3655b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f && !this.f1606bT;
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
    public boolean mo3574e() {
        GameEngine.m1234A();
        this.f3880L = f3654a;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1505e);
        return true;
    }

    public MammothTank(boolean z) {
        super(z);
        this.f3661h = new Rect();
        m2874a(f3656c[7], 2);
        this.f1620ch = 21.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 2900.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3656c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (this.f1647cI) {
            this.f3660g += f;
            if (this.f3660g > 3.0f) {
                this.f3660g = 0.0f;
                this.f3659f = 1 - this.f3659f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3576bN() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3437E(i);
        C0188f m5408a = C0188f.m5408a(this, E.f227a, E.f228b);
        m5408a.f1042ar = Color.m6164a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m5408a.f1020U = 260.0f;
        m5408a.f985l = unit;
        m5408a.f981h = 20.0f;
        m5408a.f993t = 4.0f;
        m5408a.f997x = 2.0f;
        m5408a.f1067aQ = true;
        m5408a.f1000A = true;
        m5408a.f1012M = true;
        m5408a.f1034ai = 0.5f;
        m5408a.f1036ak = 1.0f;
        m5408a.f1037al = 0.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1118482);
        m1234A.f6105bM.m2997a(C0631e.f4053x, 0.2f, this.f6951ek, this.f6952el);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3095bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3011w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.04f;
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
            return super.mo4840a_(z);
        }
        return super.m4808a(z, this.f3659f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo462c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        C1117y.m485a(this, f3658e, this.f1648cJ[0].f1716f / mo3058e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3058e(int i) {
        return 60.0f;
    }
}
