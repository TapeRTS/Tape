package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class HoverTank extends AbstractC0525h {

    /* renamed from: a */
    float f3622a;

    /* renamed from: b */
    static C0934e f3623b = null;

    /* renamed from: c */
    static C0934e f3624c = null;

    /* renamed from: d */
    static C0934e f3625d = null;

    /* renamed from: e */
    static C0934e[] f3626e = new C0934e[10];

    /* renamed from: f */
    Rect f3627f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6914r() {
        return UnitType.hoverTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3624c = m1234A.f6107bO.mo930a(C0067R.drawable.hover_tank);
        f3623b = m1234A.f6107bO.mo930a(C0067R.drawable.hover_tank_dead);
        f3625d = m1234A.f6107bO.mo930a(C0067R.drawable.hover_tank_shadow);
        f3626e = AbstractC0197n.m5790a(f3624c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3623b;
        }
        return f3626e[this.f1608bV.m5813O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3625d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3630e() {
        this.f3880L = f3623b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.small);
        return true;
    }

    public HoverTank(boolean z) {
        super(z);
        this.f3622a = 0.0f;
        this.f3627f = new Rect();
        m2873b(f3624c);
        this.f1620ch = 7.0f;
        this.f1621ci = this.f1620ch + 2.0f;
        this.f1632ct = 150.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3624c;
        this.f3881M = f3625d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (this.f1606bT || !m5297bS()) {
            return;
        }
        this.f3622a += 3.0f * f;
        if (this.f3622a > 360.0f) {
            this.f3622a -= 360.0f;
        }
        this.f6953em = C0758f.m2362a(this.f6953em, 4.0f + (C0758f.m2249h(this.f3622a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5915a = C0188f.m5915a(this, E.f227a, E.f228b, this.f6953em, i);
        PointF K = mo3231K(i);
        m5915a.f1010K = K.f227a;
        m5915a.f1011L = K.f228b;
        m5915a.f1042ar = Color.m6673a(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m5915a.f1020U = mo3020q(i);
        m5915a.f985l = unit;
        m5915a.f981h = 85.0f;
        m5915a.f993t = 2.0f;
        m5915a.f991r = 6.0f;
        m5915a.f992s = 0.2f;
        m5915a.f1015P = (short) 6;
        m5915a.f997x = 1.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -14483678);
        m1234A.f6110bR.m2544a(m5915a, -16716288);
        m1234A.f6105bM.m2996a(C0631e.f4055z, 0.3f, 1.3f + C0758f.m2288c(-0.07f, 0.07f), E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3242E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: i */
    public void mo3046i(float f) {
        this.f1617ce += f;
        if (this.f1617ce > 180.0f) {
            this.f1617ce -= 360.0f;
        }
        if (this.f1617ce < -180.0f) {
            this.f1617ce += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo3089bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo3088bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3011w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo3767d(boolean z) {
        return this.f1648cJ[0].f1711a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo3489c(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3628l() {
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
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.5f;
    }
}
