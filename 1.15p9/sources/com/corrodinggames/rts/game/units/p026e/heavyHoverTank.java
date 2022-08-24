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
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class heavyHoverTank extends AbstractC0525h {

    /* renamed from: a */
    float f3608a;

    /* renamed from: b */
    static C0934e f3609b = null;

    /* renamed from: c */
    static C0934e f3610c = null;

    /* renamed from: d */
    static C0934e f3611d = null;

    /* renamed from: e */
    static C0934e[] f3612e = new C0934e[10];

    /* renamed from: f */
    Rect f3613f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6557r() {
        return UnitType.heavyHoverTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3610c = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_hover_tank);
        f3609b = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_hover_tank_dead);
        f3611d = m1234A.f6107bO.mo930a(C0067R.drawable.heavy_hover_tank_shadow);
        f3612e = AbstractC0197n.m5438a(f3610c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3609b;
        }
        return f3612e[this.f1608bV.m5461O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3611d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine.m1234A();
        this.f3880L = f3609b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1503c);
        return true;
    }

    public heavyHoverTank(boolean z) {
        super(z);
        this.f3608a = 0.0f;
        this.f3613f = new Rect();
        m2879T(24);
        m2878U(36);
        this.f1620ch = 11.0f;
        this.f1621ci = this.f1620ch + 2.0f;
        this.f1632ct = 450.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3610c;
        this.f3881M = f3611d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (this.f1606bT || !m4946bS()) {
            return;
        }
        this.f3608a += 3.0f * f;
        if (this.f3608a > 360.0f) {
            this.f3608a -= 360.0f;
        }
        this.f6953em = C0758f.m2362a(this.f6953em, 4.0f + (C0758f.m2249h(this.f3608a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5563a = C0188f.m5563a(this, E.f227a, E.f228b, this.f6953em, i);
        PointF K = mo3231K(i);
        m5563a.f1010K = K.f227a;
        m5563a.f1011L = K.f228b;
        m5563a.f1042ar = Color.m6321a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        m5563a.f1020U = mo3020q(i);
        m5563a.f985l = unit;
        m5563a.f981h = 95.0f;
        m5563a.f993t = 1.0f;
        m5563a.f991r = 7.0f;
        m5563a.f992s = 0.2f;
        m5563a.f1015P = (short) 7;
        m5563a.f997x = 1.0f;
        GameEngine m1234A = GameEngine.m1234A();
        C0745e m2552a = m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -56798);
        if (m2552a != null) {
            m2552a.f4728F = 0.7f;
            m2552a.f4745W = 30.0f;
            m2552a.f4746X = m2552a.f4745W;
            C0743c.m2546a(m2552a, this);
        }
        m1234A.f6110bR.m2544a(m5563a, -1179648);
        m1234A.f6105bM.m2997a(C0631e.f4055z, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3242E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 20.0f;
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
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 2.4f;
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

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo3596d(boolean z) {
        return this.f1648cJ[0].f1711a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo4819c(f);
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo4813e(f);
        C1117y.m495a(this, mo3032m());
    }
}
