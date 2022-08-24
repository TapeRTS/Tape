package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/c.class */
public class GunBoat extends AbstractC0590f {

    /* renamed from: a */
    static C0934e f3817a = null;

    /* renamed from: b */
    static C0934e f3818b = null;

    /* renamed from: c */
    static C0934e f3819c = null;

    /* renamed from: d */
    static C0934e[] f3820d = new C0934e[10];

    /* renamed from: e */
    Rect f3821e;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6792r() {
        return UnitType.gunBoat;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3415bN() {
        return 1500.0f;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3818b = m1234A.f6107bO.mo930a(C0067R.drawable.gun_boat);
        f3817a = m1234A.f6107bO.mo930a(C0067R.drawable.gun_boat_dead);
        f3819c = m5195a(f3818b, f3818b.mo396m(), f3818b.mo397l());
        f3820d = AbstractC0197n.m5673a(f3818b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3817a;
        }
        return f3820d[this.f1608bV.m5696O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3819c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 1.0f;
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
        this.f3880L = f3817a;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    public GunBoat(boolean z) {
        super(z);
        this.f3821e = new Rect();
        m2879T(15);
        m2878U(27);
        this.f1620ch = 12.0f;
        this.f1621ci = this.f1620ch - 2.0f;
        this.f1632ct = 170.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3818b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo3454a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5800a = C0188f.m5800a(this, E.f227a, E.f228b);
        PointF K = mo3231K(i);
        m5800a.f1010K = K.f227a;
        m5800a.f1011L = K.f228b;
        m5800a.f6953em = this.f6953em;
        m5800a.f1020U = mo3020q(i);
        m5800a.f985l = unit;
        m5800a.f981h = 30.0f;
        m5800a.f993t = 8.0f;
        m5800a.f1018S = false;
        m5800a.f1042ar = Color.m6556a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6105bM.m2997a(C0631e.f4048s, 0.2f, E.f227a, E.f228b);
        m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 120.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 2.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo3445c(f);
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
}
