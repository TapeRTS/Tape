package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class MissileShip extends AbstractC0590f {

    /* renamed from: a */
    static C0934e f3822a = null;

    /* renamed from: b */
    static C0934e f3823b = null;

    /* renamed from: c */
    static C0934e f3824c = null;

    /* renamed from: d */
    static C0934e[] f3825d = new C0934e[10];

    /* renamed from: e */
    static PointF f3826e = new PointF();

    /* renamed from: f */
    Rect f3827f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6815r() {
        return UnitType.missileShip;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3823b = m1234A.f6107bO.mo930a(C0067R.drawable.scout_ship);
        f3822a = m1234A.f6107bO.mo930a(C0067R.drawable.scout_ship_dead);
        f3824c = m5218a(f3823b, f3823b.mo396m(), f3823b.mo397l());
        f3825d = AbstractC0197n.m5696a(f3823b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3822a;
        }
        return f3825d[this.f1608bV.m5719O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3824c;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine.m1234A().f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3822a;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    public MissileShip(boolean z) {
        super(z);
        this.f3827f = new Rect();
        m2879T(17);
        m2878U(31);
        this.f1620ch = 15.0f;
        this.f1621ci = this.f1620ch - 2.0f;
        this.f1632ct = 350.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3823b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo3476a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3241E(int i) {
        float f = this.f1617ce;
        f3826e.m6510a(this.f6951ek + (C0758f.m2244i(f) * 6.0f), this.f6952el + (C0758f.m2249h(f) * 6.0f));
        return f3826e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        GameEngine m1234A = GameEngine.m1234A();
        PointF mo3241E = mo3241E(i);
        if (!unit.mo3264Q()) {
            C0188f m5821a = C0188f.m5821a(this, mo3241E.f227a, mo3241E.f228b, this.f6953em, i);
            PointF K = mo3231K(i);
            m5821a.f1010K = K.f227a;
            m5821a.f1011L = K.f228b;
            m5821a.f1042ar = Color.m6579a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m5821a.f1020U = 62.0f;
            m5821a.f985l = unit;
            m5821a.f981h = 190.0f;
            m5821a.f993t = 2.0f;
            m5821a.f1058aH = true;
            m5821a.f1063aM = true;
            m5821a.f1067aQ = true;
            m1234A.f6105bM.m2997a(C0631e.f4042m, 0.8f, this.f6951ek, this.f6952el);
            m1234A.f6110bR.m2552a(this.f6951ek, this.f6952el, this.f6953em, -1118720);
            m1234A.f6110bR.m2544a(m5821a, -1118720);
            return;
        }
        C0188f m5821a2 = C0188f.m5821a(this, mo3241E.f227a, mo3241E.f228b, this.f6953em - 1.0f, i);
        m5821a2.f1042ar = Color.m6579a(255, 0, 0, 150);
        m5821a2.f997x = 1.0f;
        m5821a2.f1020U = 42.0f;
        m5821a2.f985l = unit;
        m5821a2.f981h = 220.0f;
        m5821a2.f993t = 1.9f;
        m5821a2.f1063aM = true;
        m5821a2.f1067aQ = true;
        m1234A.f6105bM.m2997a(C0631e.f4042m, 0.8f, this.f6951ek, this.f6952el);
        m1234A.f6110bR.m2552a(this.f6951ek, this.f6952el, this.f6953em, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.2f;
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
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
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
        return super.mo3467c(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3410l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ae */
    public boolean mo3141ae() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo3462e(f);
        C1117y.m495a(this, mo3032m());
    }
}
