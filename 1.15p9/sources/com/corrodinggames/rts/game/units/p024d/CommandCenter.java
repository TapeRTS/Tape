package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class CommandCenter extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3427a = null;

    /* renamed from: b */
    static C0934e[] f3428b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3429c = null;

    /* renamed from: d */
    static C0934e f3430d = null;

    /* renamed from: e */
    float f3431e;

    /* renamed from: f */
    public float f3432f;

    /* renamed from: g */
    public float f3433g;

    /* renamed from: h */
    public int f3434h;

    /* renamed from: i */
    public float f3435i;

    /* renamed from: j */
    public float f3436j;

    /* renamed from: k */
    float f3437k;

    /* renamed from: l */
    int f3438l;

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3431e);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3431e = c0876k.m1453g();
        super.mo2872a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3427a = m1234A.f6107bO.mo930a(C0067R.drawable.base);
        f3429c = m1234A.f6107bO.mo930a(C0067R.drawable.base_dead);
        f3430d = m1234A.f6107bO.mo930a(C0067R.drawable.base_back);
        f3428b = AbstractC0197n.m5902a(f3427a);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo7017r() {
        return UnitType.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3870K() {
        GameEngine m1234A = GameEngine.m1234A();
        this.f3880L = f3429c;
        this.f3420m = null;
        m472S(0);
        this.f1605bS = false;
        m3200a(EnumC0233ab.f1504d);
        float f = this.f6951ek;
        float f2 = this.f6952el;
        m1234A.f6110bR.m2531b(EnumC0748h.f4830e);
        C0745e m2552a = m1234A.f6110bR.m2552a(f, f2, this.f6953em, Color.m6779a(255, 255, 255, 255));
        if (m2552a != null) {
            m2552a.f4730H = 8.0f;
            m2552a.f4729G = 5.0f;
            m2552a.f4728F = 0.9f;
            m2552a.f4745W = 20.0f;
            m2552a.f4746X = m2552a.f4745W;
            m2552a.f4720s = true;
        }
        m1234A.f6110bR.m2531b(EnumC0748h.f4830e);
        C0745e m2528c = m1234A.f6110bR.m2528c(f, f2, 0.0f, -1127220);
        if (m2528c != null) {
            m2528c.f4730H = 0.2f;
            m2528c.f4729G = 2.0f;
            m2528c.f4786ar = (short) 2;
            m2528c.f4745W = 45.0f;
            m2528c.f4746X = m2528c.f4745W;
            m2528c.f4744V = 0.0f;
        }
        m1234A.f6110bR.m2556a(this.f6951ek, this.f6952el, this.f6953em, 40.0f, 70.0f);
        C0746f.m2514a(this.f6951ek, this.f6952el);
        C0746f.m2507b(this.f6951ek, this.f6952el).f4789a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3227S() {
        super.mo3227S();
        if (this.f1606bT) {
            this.f3420m = null;
        } else {
            this.f3420m = f3430d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3429c;
        }
        return f3428b[this.f1608bV.m5925O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return null;
    }

    public CommandCenter(boolean z) {
        super(z);
        this.f3437k = 20.0f;
        this.f3438l = 0;
        this.f3880L = f3427a;
        this.f3420m = f3430d;
        m2879T(53);
        m2878U(68);
        this.f1620ch = 30.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 4000.0f;
        this.f1631cs = this.f1632ct;
        m472S(3);
        this.f3421n.m6705a(-1, -1, 1, 1);
        this.f3422o.m6705a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cE */
    public RectF mo4061cE() {
        RectF cE = super.mo4061cE();
        cE.m6693a(6.0f, 0.0f);
        return cE;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3274a(float f) {
        GameEngine.m1234A();
        super.mo3274a(f);
        if (!m5390bS() || this.f1606bT) {
            return;
        }
        this.f3437k = C0758f.m2363a(this.f3437k, f);
        if (this.f3437k == 0.0f) {
            this.f3437k = 5.0f;
            this.f3438l++;
            if (this.f3438l > 6) {
                this.f3438l = 0;
                this.f3437k = 70.0f;
            }
            if (this.f3438l <= 3) {
                this.f3426s = this.f3438l;
            } else {
                this.f3426s = 6 - this.f3438l;
            }
        }
        this.f3432f += f;
        this.f3434h++;
        this.f3435i += 10.0f;
        if (this.f3436j > f) {
            this.f3436j = f;
        }
        this.f3433g += f;
        this.f3431e += f;
        if (this.f3431e > AbstractC0197n.f1377ao - 0.1f) {
            this.f3431e -= AbstractC0197n.f1377ao;
            this.f1608bV.m5893b(mo4037cw() * (AbstractC0197n.f1377ao / AbstractC0197n.f1376an));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cw */
    public float mo4037cw() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3271a(Unit unit, int i) {
        C0188f m6025a = C0188f.m6025a(this, this.f6951ek, this.f6952el);
        PointF K = m3232K(i);
        m6025a.f1010K = K.f227a;
        m6025a.f1011L = K.f228b;
        m6025a.f1042ar = Color.m6779a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m6025a.f1020U = mo3020q(i);
        m6025a.f985l = unit;
        m6025a.f981h = 180.0f;
        m6025a.f993t = 2.0f;
        m6025a.f991r = 5.0f;
        m6025a.f1058aH = true;
        m6025a.f1063aM = true;
        m6025a.f1067aQ = true;
        m6025a.f1057aG = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2544a(m6025a, -1118720);
        m1234A.f6105bM.m2997a(C0631e.f4042m, 0.8f, this.f6951ek, this.f6952el);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3255m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3270b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3268c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3115b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3256l() {
        return true;
    }

    /* renamed from: a */
    public static void m4064a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(UnitType.builder, 1));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3869N() {
        return mo7017r().mo4404a(mo3224V());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo3272a(Unit unit, float f, C0188f c0188f) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo3272a(unit, f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bJ */
    public boolean mo3865bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo3439e(f);
        C1117y.m495a(this, mo3255m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: s */
    public int mo3016s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo3083bp() {
        return 35;
    }
}
