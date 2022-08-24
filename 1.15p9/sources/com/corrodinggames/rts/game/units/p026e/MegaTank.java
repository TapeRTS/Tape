package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class MegaTank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3662a = null;

    /* renamed from: b */
    static C0934e f3663b = null;

    /* renamed from: c */
    static C0934e f3664c = null;

    /* renamed from: d */
    static C0934e[] f3665d = new C0934e[10];

    /* renamed from: e */
    Rect f3666e;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6773r() {
        return UnitType.megaTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3663b = m1234A.f6107bO.mo930a(C0067R.drawable.mega_tank);
        f3662a = m1234A.f6107bO.mo930a(C0067R.drawable.mega_tank_dead);
        f3664c = m1234A.f6107bO.mo930a(C0067R.drawable.mega_tank_turret);
        f3665d = AbstractC0197n.m5654a(f3663b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3662a;
        }
        return f3665d[this.f1608bV.m5677O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return f3664c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3662a;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4044o, 0.8f, this.f6951ek, this.f6952el);
        mo3081bq();
        return true;
    }

    public MegaTank(boolean z) {
        super(z);
        this.f3666e = new Rect();
        m2879T(20);
        m2878U(25);
        this.f1620ch = 12.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 550.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3663b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3415bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        if (!unit.mo3263i()) {
            PointF E = mo3241E(i);
            C0188f m5781a = C0188f.m5781a(this, E.f227a, E.f228b);
            m5781a.f1042ar = Color.m6537a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m5781a.f1020U = 50.0f;
            m5781a.f985l = unit;
            m5781a.f981h = 60.0f;
            m5781a.f993t = 3.0f;
            m5781a.f997x = 2.0f;
            m5781a.f1067aQ = true;
            GameEngine m1234A = GameEngine.m1234A();
            m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1127220);
            m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
            m1234A.f6105bM.m2997a(C0631e.f4050u, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        C0188f m5781a2 = C0188f.m5781a(this, this.f6951ek, this.f6952el);
        m5781a2.f1042ar = Color.m6537a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m5781a2.f1020U = 40.0f;
        m5781a2.f985l = unit;
        m5781a2.f981h = 190.0f;
        m5781a2.f993t = 4.0f;
        m5781a2.f1058aH = true;
        m5781a2.f1059aI = 10.0f;
        m5781a2.f1060aJ = 15.0f;
        m5781a2.f1063aM = true;
        m5781a2.f1067aQ = true;
        GameEngine.m1234A().f6105bM.m2997a(C0631e.f4042m, 0.2f, this.f6951ek, this.f6952el);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 140.0f;
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
    /* renamed from: A */
    public float mo3250A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 2.0f;
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
        if (!super.mo3445c(f)) {
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
        return 12.0f;
    }
}
