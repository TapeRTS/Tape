package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class C0490f extends AbstractC0498i {

    /* renamed from: f */
    boolean f3439f;

    /* renamed from: a */
    static C0934e f3440a = null;

    /* renamed from: b */
    static C0934e f3441b = null;

    /* renamed from: c */
    static C0934e[] f3442c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3443d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3444e = null;

    /* renamed from: g */
    static Action f3445g = new C04911(110);

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3439f);
        c0859ar.m1554c(0);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            m3838L();
        }
        c0876k.m1457d();
        super.mo2872a(c0876k);
    }

    /* renamed from: b */
    public static void m3833b() {
        GameEngine m1234A = GameEngine.m1234A();
        f3440a = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_unit_factory_front);
        f3441b = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_unit_factory_base);
        f3444e = m1234A.f6107bO.mo930a(C0067R.drawable.experimental_unit_factory_dead);
        f3442c = AbstractC0197n.m5244a(f3440a);
    }

    /* renamed from: c */
    public UnitType m3827r() {
        return UnitType.experimentalLandFactory;
    }

    /* renamed from: K */
    public boolean m3839K() {
        GameEngine.m1234A();
        this.f3420m = null;
        this.f3880L = f3444e;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.verylargeBuilding);
        return true;
    }

    /* renamed from: a */
    public void m3835a(int i) {
    }

    /* renamed from: d */
    public C0934e m3829d() {
        if (this.f1606bT) {
            return f3444e;
        }
        if (this.f1608bV == null) {
            return f3442c[f3442c.length - 1];
        }
        if (!this.f3439f) {
            return f3442c[this.f1608bV.m5267O()];
        }
        return f3443d[this.f1608bV.m5267O()];
    }

    /* renamed from: S */
    public void m3836S() {
        super.mo3726S();
        if (this.f1606bT) {
            this.f3420m = null;
        } else {
            this.f3420m = f3441b;
        }
    }

    /* renamed from: k */
    public C0934e m3828k() {
        return null;
    }

    public C0490f(boolean z) {
        super(z);
        this.f3880L = f3440a;
        this.f3420m = f3441b;
        m2873b(this.f3880L);
        this.f1620ch = 55.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 3200.0f;
        this.f1631cs = this.f1632ct;
        m472S(4);
        this.f3421n.m6053a(-2, -2, 2, 2);
        this.f3422o.m6053a(-2, -2, 2, 4);
    }

    /* renamed from: a */
    public void mo3692a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3445g.m4957N())) {
            m3838L();
        } else {
            super.mo3692a(c0499j);
        }
    }

    /* renamed from: L */
    public void m3838L() {
        if (!this.f3439f) {
            this.f3439f = true;
            m3836S();
        }
    }

    /* renamed from: cl */
    public C0208c m3830cl() {
        return Action.f1461i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.f$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f$1.class */
    final class C04911 extends AbstractC0228w {
        C04911(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo5043g() {
            return false;
        }

        /* renamed from: a */
        public String mo5051a() {
            return "-Allows factory to build Tech 2 units";
        }

        /* renamed from: b */
        public String mo5049b() {
            return C0820a.m1882a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo5047c() {
            return 1500;
        }

        /* renamed from: K */
        public float m3826K() {
            return 5.0E-4f;
        }

        /* renamed from: a */
        public boolean m3823a(Unit unit, boolean z) {
            C0490f c0490f = (C0490f) unit;
            if (c0490f.f3439f || c0490f.mo3736a(m4957N(), z) > 0) {
                return false;
            }
            return super.mo3471a(unit, z);
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

    /* renamed from: a */
    public static void m3834a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(UnitType.experimentalTank, 2));
        arrayList.add(new C0217l(UnitType.experimentalHoverTank, 3));
    }

    /* renamed from: N */
    public ArrayList m3837N() {
        return m3831c().mo4028a(mo3694V());
    }

    /* renamed from: bJ */
    public boolean m3832bJ() {
        return true;
    }
}
