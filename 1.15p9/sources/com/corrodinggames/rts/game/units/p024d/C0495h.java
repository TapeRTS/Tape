package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class C0495h extends AbstractC0498i {

    /* renamed from: h */
    float f3463h;

    /* renamed from: i */
    float f3464i;

    /* renamed from: j */
    int f3465j;

    /* renamed from: a */
    static C0934e f3466a = null;

    /* renamed from: b */
    static C0934e f3467b = null;

    /* renamed from: c */
    static C0934e f3468c = null;

    /* renamed from: d */
    static C0934e[] f3469d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3470e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f3471f = new C0934e[10];

    /* renamed from: g */
    static C0934e f3472g = null;

    /* renamed from: k */
    static Action f3473k = new C04961(102);

    /* renamed from: l */
    static Action f3474l = new C04972(103);

    /* renamed from: t */
    static ArrayList f3475t = new ArrayList();

    static {
        f3475t.add(f3473k);
        f3475t.add(f3474l);
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3463h);
        c0859ar.mo1482a(this.f3425r == 2);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3463h = c0876k.m1453g();
        boolean m1455e = c0876k.m1455e();
        if (c0876k.m1463b() < 51 && m1455e) {
            m3804a(2);
        }
        super.mo2872a(c0876k);
    }

    /* renamed from: R */
    public void m3807R(int i) {
        m3804a(i);
    }

    /* renamed from: b */
    public UnitType m3795r() {
        return UnitType.fabricator;
    }

    /* renamed from: c */
    public static void m3801c() {
        GameEngine m1234A = GameEngine.m1234A();
        f3466a = m1234A.f6107bO.mo930a(C0067R.drawable.power);
        f3467b = m1234A.f6107bO.mo930a(C0067R.drawable.power_t2);
        f3468c = m1234A.f6107bO.mo930a(C0067R.drawable.power_t3);
        f3469d = AbstractC0197n.m5244a(f3466a);
        f3470e = AbstractC0197n.m5244a(f3467b);
        f3471f = AbstractC0197n.m5244a(f3468c);
        f3472g = m1234A.f6107bO.mo930a(C0067R.drawable.power_dead);
    }

    /* renamed from: K */
    public boolean m3809K() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2558a(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3472g;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        m1234A.f6110bR.m2531b(EnumC0748h.critical);
        C0745e m2528c = m1234A.f6110bR.m2528c(this.f6951ek, this.f6952el, this.f6953em, -1127220);
        if (m2528c != null) {
            m2528c.f4730H = 0.15f;
            m2528c.f4729G = 1.0f;
            m2528c.f4786ar = (short) 2;
            m2528c.f4745W = 35.0f;
            m2528c.f4746X = m2528c.f4745W;
            m2528c.f4744V = 0.0f;
            m2528c.f4725y = -14492382;
        }
        m3083bo();
        return true;
    }

    /* renamed from: d */
    public C0934e m3797d() {
        if (this.f1606bT) {
            return f3472g;
        }
        if (this.f1608bV == null) {
            return f3469d[f3469d.length - 1];
        }
        if (this.f3425r == 1) {
            return f3469d[this.f1608bV.m5267O()];
        }
        if (this.f3425r == 2) {
            return f3470e[this.f1608bV.m5267O()];
        }
        if (this.f3425r == 3) {
            return f3471f[this.f1608bV.m5267O()];
        }
        GameEngine.PrintLog("Unknown tech level:" + this.f3425r);
        return f3469d[this.f1608bV.m5267O()];
    }

    /* renamed from: k */
    public C0934e m3796k() {
        return null;
    }

    public C0495h(boolean z) {
        super(z);
        this.f3464i = 0.0f;
        this.f3465j = 0;
        this.f3880L = f3466a;
        m2874a(this.f3880L, 3);
        this.f1620ch = 25.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6053a(-1, -1, 1, 1);
        this.f3422o.m6052a(this.f3421n);
    }

    /* renamed from: a */
    public void m3805a(float f) {
        super.mo470a(f);
        if (!m4759bS() || this.f1606bT) {
            return;
        }
        this.f3464i = C0758f.m2363a(this.f3464i, f);
        if (this.f3464i == 0.0f) {
            this.f3464i = 17.0f;
            this.f3465j++;
            if (this.f3465j > 5) {
                this.f3465j = 0;
            }
            if (this.f3465j <= 2) {
                this.f3426s = this.f3465j;
            } else {
                this.f3426s = 5 - this.f3465j;
            }
        }
        this.f3463h += f;
        if (this.f3463h > AbstractC0197n.f1377ao - 0.1f) {
            this.f3463h -= AbstractC0197n.f1377ao;
            this.f1608bV.m5235b(m3798cw() * (AbstractC0197n.f1377ao / AbstractC0197n.f1376an));
        }
    }

    /* renamed from: cw */
    public float m3798cw() {
        if (this.f3425r == 1) {
            return 2.0f;
        }
        if (this.f3425r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    /* renamed from: a */
    public void mo3692a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3473k.m4957N())) {
            m3804a(2);
            m3222W();
        }
        if (c0499j.f3491j.equals(f3474l.m4957N())) {
            m3804a(3);
            m3222W();
        }
    }

    /* renamed from: cl */
    public C0208c m3799cl() {
        if (this.f3425r == 1) {
            return f3473k.m4957N();
        }
        if (this.f3425r == 2) {
            return f3474l.m4957N();
        }
        return Action.f1461i;
    }

    /* renamed from: V */
    public int m3806V() {
        return this.f3425r;
    }

    /* renamed from: a */
    public void m3804a(int i) {
        AbstractC0197n.m5231b((Unit) this);
        if (this.f3425r > i) {
            this.f3425r = 1;
            this.f1632ct = 800.0f;
            if (this.f1631cs > this.f1632ct) {
                this.f1631cs = this.f1632ct;
            }
        }
        if (this.f3425r < 2 && i >= 2) {
            this.f1632ct += 500.0f;
            this.f1631cs += 500.0f;
        }
        if (this.f3425r < 3 && i >= 3) {
            this.f1632ct += 1300.0f;
            this.f1631cs += 1300.0f;
        }
        this.f3425r = i;
        AbstractC0197n.m5215c(this);
        mo3726S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$1.class */
    final class C04961 extends AbstractC0228w {
        C04961(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo5043g() {
            return false;
        }

        /* renamed from: a */
        public String mo5051a() {
            return C0820a.m1882a("units.fabricator.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo5049b() {
            return C0820a.m1882a("units.fabricator.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo5047c() {
            return UnitType.fabricator.getUpgradePrice(2);
        }

        /* renamed from: K */
        public float m3794K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean m3791a(Unit unit, boolean z) {
            C0495h c0495h = (C0495h) unit;
            if (c0495h.f3425r != 1 || c0495h.mo3736a(m4957N(), z) > 0) {
                return false;
            }
            return super.mo3471a(unit, z);
        }

        /* renamed from: b */
        public boolean m3789b(Unit unit) {
            if (((C0495h) unit).f3425r != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo6362i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo5044f() {
            return EnumC0225t.upgrade;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$2.class */
    final class C04972 extends AbstractC0228w {
        C04972(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo5043g() {
            return false;
        }

        /* renamed from: a */
        public String mo5051a() {
            return C0820a.m1882a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo5049b() {
            return C0820a.m1882a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo5047c() {
            return UnitType.fabricator.getUpgradePrice(3);
        }

        /* renamed from: K */
        public float m3784K() {
            return 2.0E-4f;
        }

        /* renamed from: a */
        public boolean m3781a(Unit unit, boolean z) {
            C0495h c0495h = (C0495h) unit;
            if (c0495h.f3425r != 2 || c0495h.mo3736a(m4957N(), z) > 0) {
                return false;
            }
            return super.mo3471a(unit, z);
        }

        /* renamed from: b */
        public boolean m3779b(Unit unit) {
            if (((C0495h) unit).f3425r != 2) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo6362i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo5044f() {
            return EnumC0225t.upgrade;
        }
    }

    /* renamed from: N */
    public ArrayList m3808N() {
        return f3475t;
    }

    /* renamed from: cZ */
    public float m3800cZ() {
        return super.mo3722cZ() - 8.0f;
    }

    /* renamed from: bp */
    public int m3802bp() {
        return 12;
    }
}
