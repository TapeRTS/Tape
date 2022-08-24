package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class C0514v extends AbstractC0498i {

    /* renamed from: f */
    int f3555f;

    /* renamed from: g */
    float f3556g;

    /* renamed from: h */
    int f3557h;

    /* renamed from: a */
    static C0934e f3558a = null;

    /* renamed from: b */
    static C0934e f3559b = null;

    /* renamed from: c */
    static C0934e[] f3560c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3561d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3562e = null;

    /* renamed from: i */
    public static int f3563i = 0;

    /* renamed from: j */
    static Action f3564j = new C05151(102);

    /* renamed from: k */
    static ArrayList f3565k = new ArrayList();

    static {
        f3565k.add(f3564j);
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3555f);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        m3679a(c0876k.m1454f());
        super.mo2872a(c0876k);
    }

    /* renamed from: b */
    public UnitType m3672r() {
        return UnitType.supplyDepot;
    }

    /* renamed from: c */
    public static void m3676c() {
        GameEngine m1234A = GameEngine.m1234A();
        f3558a = m1234A.f6107bO.mo930a(C0067R.drawable.supply_depot);
        f3559b = m1234A.f6107bO.mo930a(C0067R.drawable.supply_depot_t2);
        f3560c = AbstractC0197n.m5244a(f3558a);
        f3561d = AbstractC0197n.m5244a(f3559b);
        f3562e = m1234A.f6107bO.mo930a(C0067R.drawable.supply_depot_dead);
    }

    /* renamed from: K */
    public boolean m3683K() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2558a(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3562e;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return false;
    }

    /* renamed from: d */
    public C0934e m3674d() {
        if (this.f1606bT) {
            return f3562e;
        }
        if (this.f1608bV == null) {
            return f3560c[f3560c.length - 1];
        }
        if (this.f3555f == 1) {
            return f3560c[this.f1608bV.m5267O()];
        }
        return f3561d[this.f1608bV.m5267O()];
    }

    /* renamed from: k */
    public C0934e m3673k() {
        return null;
    }

    public C0514v(boolean z) {
        super(z);
        this.f3555f = 1;
        this.f3556g = 0.0f;
        this.f3557h = 0;
        this.f3880L = f3558a;
        m2874a(this.f3880L, 1);
        this.f1620ch = 20.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6053a(-1, -1, 0, 0);
        this.f3422o.m6052a(this.f3421n);
    }

    /* renamed from: a */
    public void m3680a(float f) {
        super.mo470a(f);
        if (!m4759bS() || this.f1606bT) {
        }
    }

    /* renamed from: a */
    public void mo3692a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3564j.m4957N())) {
            m3682L();
            m3222W();
        }
    }

    /* renamed from: a */
    public void m3679a(int i) {
        this.f3555f = i;
    }

    /* renamed from: L */
    public void m3682L() {
        if (this.f3555f == 1) {
            this.f3555f = 2;
            mo3726S();
        }
    }

    /* renamed from: cl */
    public C0208c m3675cl() {
        if (this.f3555f == 1) {
            return f3564j.m4957N();
        }
        return Action.f1461i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.v$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v$1.class */
    final class C05151 extends AbstractC0228w {
        C05151(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo5043g() {
            return false;
        }

        /* renamed from: a */
        public String mo5051a() {
            return C0820a.m1882a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo5049b() {
            return C0820a.m1882a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo5047c() {
            return 1000;
        }

        /* renamed from: K */
        public float m3671K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean m3668a(Unit unit, boolean z) {
            C0514v c0514v = (C0514v) unit;
            if (c0514v.f3555f != 1 || c0514v.mo3736a(m4957N(), z) > 0) {
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

    /* renamed from: N */
    public ArrayList m3681N() {
        return f3565k;
    }
}
