package com.corrodinggames.rts.game.units.p026e;

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

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class Tank extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3667a = null;

    /* renamed from: b */
    static C0934e f3668b = null;

    /* renamed from: c */
    static C0934e f3669c = null;

    /* renamed from: d */
    static C0934e f3670d = null;

    /* renamed from: e */
    static C0934e[] f3671e = new C0934e[10];

    /* renamed from: f */
    int f3672f;

    /* renamed from: g */
    float f3673g;

    /* renamed from: h */
    float f3674h;

    /* renamed from: i */
    Rect f3675i;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6940r() {
        return UnitType.tank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3668b = m1234A.f6107bO.mo930a(C0067R.drawable.tank2);
        f3667a = m1234A.f6107bO.mo930a(C0067R.drawable.tank2_dead);
        f3669c = m1234A.f6107bO.mo930a(C0067R.drawable.tank2_turret);
        f3670d = m1234A.f6107bO.mo930a(C0067R.drawable.tank2_shadow);
        f3671e = AbstractC0197n.m5816a(f3668b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3667a;
        }
        return f3671e[this.f1608bV.m5839O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3670d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT;
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
        return f3669c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3630e() {
        this.f3880L = f3667a;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1502b);
        return true;
    }

    public Tank(boolean z) {
        super(z);
        this.f3675i = new Rect();
        m2874a(f3668b, 3);
        this.f1620ch = 11.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 210.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3668b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (!this.f1606bT && this.f1616cd != 0.0f) {
            this.f3673g += f;
            if (this.f3673g > 1.0f) {
                this.f3673g = 0.0f;
                this.f3672f++;
                if (this.f3672f > 2) {
                    this.f3672f = 0;
                }
            }
            if (this.f1616cd > 0.0f && this.f6948eh) {
                this.f3674h += f;
                if (this.f3674h > 9.0f) {
                    this.f3674h = 0.0f;
                    m3629f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m3629f() {
        GameEngine m1234A = GameEngine.m1234A();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            m1234A.f6110bR.m2529c(this.f6951ek + (C0758f.m2244i(this.f1617ce + 180.0f + f) * this.f1620ch), this.f6952el + (C0758f.m2249h(this.f1617ce + 180.0f + f) * this.f1620ch), this.f6953em, this.f1617ce + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5943a = C0188f.m5943a(this, E.f227a, E.f228b);
        PointF K = mo3231K(i);
        m5943a.f1010K = K.f227a;
        m5943a.f1011L = K.f228b;
        m5943a.f1020U = 30.0f;
        m5943a.f985l = unit;
        m5943a.f981h = 60.0f;
        m5943a.f993t = 3.0f;
        m5943a.f1015P = (short) 1;
        m5943a.f997x = 1.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1127220);
        m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        m1234A.f6105bM.m2996a(C0631e.f4046q, 0.3f, 1.0f + C0758f.m2288c(-0.07f, 0.07f), E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo3489c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        if (!this.f1606bT) {
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.17f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3628l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3140af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect mo3633a_(boolean z) {
        if (z) {
            return super.mo4557a_(z);
        }
        if (this.f1606bT) {
            return super.mo4557a_(z);
        }
        return super.m5337a(z, this.f3672f);
    }
}
