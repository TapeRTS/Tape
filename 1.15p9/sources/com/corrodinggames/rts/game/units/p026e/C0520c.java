package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
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
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class C0520c extends AbstractC0525h {

    /* renamed from: a */
    static C0934e f3590a = null;

    /* renamed from: b */
    static C0934e f3591b = null;

    /* renamed from: c */
    static C0934e f3592c = null;

    /* renamed from: d */
    public static C0934e f3593d = null;

    /* renamed from: e */
    public static C0934e f3594e = null;

    /* renamed from: f */
    static C0934e[] f3595f = new C0934e[10];

    /* renamed from: g */
    int f3596g;

    /* renamed from: h */
    float f3597h;

    /* renamed from: i */
    C0188f f3598i;

    /* renamed from: j */
    Rect f3599j;

    /* renamed from: k */
    Paint f3600k;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType m3685r() {
        return UnitType.experimentalHoverTank;
    }

    /* renamed from: c */
    public static void m3700c() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_hovertank);
        f3595f = AbstractC0197n.m5378a(mo930a);
        f3590a = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_hovertank_dead);
        f3591b = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_hovertank_turret);
        f3592c = m4906a(mo930a, mo930a.mo396m() / 1, mo930a.mo397l());
        f3593d = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_hovertank_shield);
        f3594e = m1234A.f6107bO.mo930a(C0067R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        if (this.f3598i != null && this.f3598i.f6946ef) {
            this.f3598i = null;
        }
        c0859ar.m1568a(this.f3598i);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3598i = (C0188f) c0876k.m1468a(C0188f.class);
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e m3696d() {
        if (this.f1606bT) {
            return f3590a;
        }
        return f3595f[this.f1608bV.m5401O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e m3689k() {
        return f3592c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean m3719F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float m3718G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float m3716H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e m3695d(int i) {
        return f3591b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: T */
    public C0934e m3713T() {
        return f3593d;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean m3693e() {
        GameEngine.m1234A();
        this.f3880L = f3590a;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1505e);
        return true;
    }

    public C0520c(boolean z) {
        super(z);
        this.f3597h = 0.0f;
        this.f3599j = new Rect();
        this.f3600k = C1117y.m505a();
        m2874a(f3595f[7], 1);
        this.f1620ch = 30.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 3500.0f;
        this.f1631cs = this.f1632ct;
        this.f1637cy = 5000.0f;
        this.f1634cv = this.f1637cy;
        this.f3880L = f3595f[7];
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public float m3705bV() {
        if (this.f1637cy > 0.0f && this.f1634cv < this.f1637cy) {
            return this.f1634cv / this.f1637cy;
        }
        return super.mo3604bV();
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void m3712a(float f) {
        super.mo470a(f);
        if (this.f1606bT || !m4893bS()) {
            return;
        }
        if (!this.f1606bT) {
            if (this.f1622cj != 0.0f) {
                m472S(2);
            } else {
                m472S(4);
            }
        }
        if (this.f1647cI) {
        }
        this.f3597h += 1.0f * f;
        if (this.f3597h > 360.0f) {
            this.f3597h -= 360.0f;
        }
        this.f6953em = C0758f.m2362a(this.f6953em, 4.0f + (C0758f.m2249h(this.f3597h) * 2.0f), 0.1f * f);
        this.f1634cv = C0758f.m2362a(this.f1634cv, this.f1637cy, 0.25f * f);
        this.f1635cw = C0758f.m2362a(this.f1635cw, 0.0f, 4.0f * f);
        if (this.f1635cw > 50.0f) {
            this.f1635cw = 50.0f;
        }
        if (this.f3598i != null) {
            PointF E = mo3437E(0);
            this.f3598i.f6951ek = E.f227a;
            this.f3598i.f6952el = E.f228b;
            this.f3598i.f6953em = this.f6953em;
            if (this.f3598i.f6946ef) {
                this.f3598i = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float m3706bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: L */
    public float m3714L(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: K */
    public PointF m3715K(int i) {
        PointF K = super.mo3231K(i);
        if (this.f3598i != null) {
            K.f227a += this.f3598i.f1010K;
            K.f228b += this.f3598i.f1011L;
        }
        return K;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float m3686q(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void m3711a(Unit unit, int i) {
        GameEngine.m1234A();
        PointF E = mo3437E(i);
        if (this.f3598i != null) {
            boolean z = false;
            if (this.f3598i.f6946ef) {
                z = true;
            }
            if (this.f3598i.f985l != unit) {
                z = true;
            }
            if (z) {
                this.f3598i = null;
            }
        }
        float m3707b = m3707b(i) + m3691e(i) + 5.0f;
        if (this.f3598i != null) {
            this.f3598i.f981h = m3707b;
            return;
        }
        C0188f m5505a = C0188f.m5505a(this, E.f227a, E.f228b);
        m5505a.f1020U = 380.0f;
        m5505a.f985l = unit;
        m5505a.f981h = m3707b;
        m5505a.f1001B = true;
        m5505a.f1000A = true;
        m5505a.f1067aQ = true;
        m5505a.f1004E = true;
        m5505a.f1009J = 70.0f;
        m5505a.f1005F = 230.0f;
        m5505a.f1036ak = 0.75f;
        m5505a.f6949ei = this.f6949ei;
        this.f3598i = m5505a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float m3687m() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float m3707b(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float m3691e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float m3684z() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float m3704bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float m3723A() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float m3722B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float m3698c(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float m3721C() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float m3720D() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect m3710a_(boolean z) {
        if (this.f1606bT && !z) {
            return super.mo4937a_(z);
        }
        if (z) {
            return super.mo4937a_(z);
        }
        int i = 0 + (this.f3596g * this.f4223eo);
        this.f3599j.m6187a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f3599j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean m3699c(float f) {
        C0934e m3713T;
        if (!super.mo4770c(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        if (!this.f1606bT) {
            float f2 = 0.0f;
            if (this.f3598i != null) {
                f2 = C0758f.m2311b(this.f3598i.m5493e(), 0.25f) * 3.0f;
            }
            C1117y.m485a(this, MammothTank.f3658e, f2, 0);
        }
        GameEngine m1234A = GameEngine.m1234A();
        if (!this.f1606bT && this.f1634cv > 0.0f && this.f1636cx == 0.0f && (m3713T = m3713T()) != null) {
            this.f3600k.m6246a((int) ((0.09f + ((this.f1634cv / this.f1637cy) * 0.4f) + ((C0758f.m2311b(this.f1635cw, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            m1234A.f6107bO.mo916a(m3713T, this.f6951ek - m1234A.f6138cv, (this.f6952el - m1234A.f6139cw) - this.f6953em, mo4766d(false) - 90.0f, this.f3600k);
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean m3688l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean m3709af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float m3690g(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF m3717G(int i) {
        f3981bg.m6192a(this.f6951ek, this.f6952el);
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int m3701bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean m3703bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean m3702bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cu */
    public int m3697cu() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: db */
    public boolean m3694db() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void m3692e(float f) {
        super.mo4764e(f);
        C1117y.m495a(this, m3687m());
    }
}
