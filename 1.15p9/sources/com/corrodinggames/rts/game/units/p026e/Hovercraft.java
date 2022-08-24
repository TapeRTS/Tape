package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.e.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class Hovercraft extends AbstractC0525h implements InterfaceC0242ak {

    /* renamed from: e */
    float f3631e;

    /* renamed from: f */
    float f3632f;

    /* renamed from: g */
    boolean f3633g;

    /* renamed from: h */
    C1101m f3634h;

    /* renamed from: a */
    static C0934e f3635a = null;

    /* renamed from: b */
    static C0934e f3636b = null;

    /* renamed from: c */
    static C0934e f3637c = null;

    /* renamed from: d */
    static C0934e[] f3638d = new C0934e[10];

    /* renamed from: i */
    public static final Action f3639i = new AbstractC0229x(109) { // from class: com.corrodinggames.rts.game.units.e.i.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5351a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5349b() {
            return C0820a.m1882a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5348b(Unit unit, boolean z) {
            return ((InterfaceC0242ak) unit).mo3101bB();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3472a(Unit unit, boolean z) {
            return !((InterfaceC0242ak) unit).mo3102bA() && ((InterfaceC0242ak) unit).mo3626f() && ((InterfaceC0242ak) unit).mo3101bB() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3473b(Unit unit) {
            return ((InterfaceC0242ak) unit).mo3624j();
        }
    };

    /* renamed from: j */
    public static final Action f3640j = new AbstractC0229x(110) { // from class: com.corrodinggames.rts.game.units.e.i.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5351a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5349b() {
            return C0820a.m1882a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3472a(Unit unit, boolean z) {
            return ((InterfaceC0242ak) unit).mo3102bA();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3473b(Unit unit) {
            return mo3472a(unit, false);
        }
    };

    /* renamed from: k */
    static ArrayList f3641k = new ArrayList();

    static {
        f3641k.add(f3639i);
        f3641k.add(f3640j);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3631e);
        c0859ar.mo1488a(this.f3632f);
        c0859ar.mo1482a(this.f3633g);
        c0859ar.mo1487a(this.f3634h.size());
        Iterator it = this.f3634h.iterator();
        while (it.hasNext()) {
            c0859ar.mo1486a((Unit) it.next());
        }
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3631e = c0876k.m1453g();
        this.f3632f = c0876k.m1453g();
        this.f3633g = c0876k.m1455e();
        this.f3634h.clear();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            Unit m1445o = c0876k.m1445o();
            if (m1445o != null) {
                this.f3634h.add(m1445o);
            }
        }
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6663r() {
        return UnitType.hovercraft;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3635a = m1234A.f6107bO.mo930a(C0067R.drawable.hovercraft);
        f3637c = m1234A.f6107bO.mo930a(C0067R.drawable.hovercraft_shadow);
        f3636b = m1234A.f6107bO.mo930a(C0067R.drawable.hovercraft_dead);
        f3638d = AbstractC0197n.m5544a(f3635a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3636b;
        }
        return f3638d[this.f1608bV.m5567O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3637c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        this.f3880L = f3636b;
        m472S(0);
        this.f1605bS = false;
        m3625f(true);
        m3199a(EnumC0233ab.f1502b);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0667ay, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2875a() {
        m3625f(true);
        super.mo2875a();
    }

    /* renamed from: f */
    public void m3625f(boolean z) {
        Iterator it = this.f3634h.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.f1650cL = null;
            unit.f6951ek = this.f6951ek + (C0758f.m2244i(this.f1617ce) * (-9.0f));
            unit.f6952el = this.f6952el + (C0758f.m2249h(this.f1617ce) * (-9.0f));
            if (z) {
                unit.m5034ci();
            }
        }
        this.f3634h.clear();
    }

    public Hovercraft(boolean z) {
        super(z);
        this.f3631e = 0.0f;
        this.f3634h = new C1101m();
        m2879T(20);
        m2878U(32);
        this.f1620ch = 15.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 450.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3635a;
        this.f3881M = f3637c;
    }

    /* renamed from: a */
    public static int m3637a(C1101m c1101m) {
        int i = 0;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            i += ((Unit) it.next()).mo4336cu();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3636a(C1101m c1101m, int i, Unit unit) {
        if (m3637a(c1101m) + unit.mo4336cu() <= i) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bX */
    public int mo3634bX() {
        return m3637a(this.f3634h);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bY */
    public int mo3633bY() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m3639a(Unit unit, Unit unit2, boolean z) {
        return m3638a(unit, unit2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m3638a(Unit unit, Unit unit2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float m2244i = (unit.f6951ek + (C0758f.m2244i(unit.f1617ce + f2) * f5)) - (C0758f.m2249h(unit.f1617ce + f2) * f4);
        float m2249h = unit.f6952el + (C0758f.m2249h(unit.f1617ce + f2) * f5) + (C0758f.m2244i(unit.f1617ce + f2) * f4);
        float m2244i2 = m2244i + (C0758f.m2244i(unit.f1617ce + 90.0f) * (z ? -f : f));
        float m2249h2 = m2249h + (C0758f.m2249h(unit.f1617ce + 90.0f) * (z ? -f : f));
        if (!C1117y.m494a(unit2, m2244i2, m2249h2)) {
            m2244i2 += 10.0f;
        }
        if (!C1117y.m494a(unit2, m2244i2, m2249h2)) {
            m2244i2 -= 20.0f;
        }
        if (!C1117y.m494a(unit2, m2244i2, m2249h2)) {
            m2244i2 -= 10.0f;
            m2249h2 += 10.0f;
        }
        if (!C1117y.m494a(unit2, m2244i2, m2249h2)) {
            m2249h2 -= 20.0f;
        }
        if (!C1117y.m494a(unit2, m2244i2, m2249h2)) {
            return false;
        }
        unit2.f1650cL = null;
        unit2.f6951ek = m2244i2;
        unit2.f6952el = m2249h2;
        unit2.f1610bX += 0.1f;
        unit2.f1617ce = unit.f1617ce + f2;
        unit2.f1603bQ = unit;
        unit2.f1604bR = 45.0f;
        if (unit2 instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
            abstractC0623y.m3042j(unit2.f1617ce);
            abstractC0623y.m3120az();
            abstractC0623y.m3064d(unit2.f6951ek + (C0758f.m2244i(unit2.f1617ce + (z ? -f : f)) * f3), unit2.f6952el + (C0758f.m2249h(unit2.f1617ce + (z ? -f : f)) * f3));
            abstractC0623y.f3915ab = 0;
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (this.f1606bT || !m5052bS()) {
            return;
        }
        if (this.f1622cj == 0.0f && this.f6949ei != 3) {
            m472S(3);
        }
        if (this.f3633g && !m5039cJ() && !this.f1647cI) {
            this.f3632f = C0758f.m2363a(this.f3632f, f);
            if (this.f3632f == 0.0f) {
                this.f3632f = 30.0f;
                if (this.f3634h.size() == 0) {
                    this.f3633g = false;
                } else {
                    boolean z = this.f3634h.size() % 2 == 0;
                    Unit unit = (Unit) this.f3634h.remove(this.f3634h.size() - 1);
                    if (!m3639a(this, unit, z)) {
                        this.f3634h.add(unit);
                    }
                    if (this.f3634h.size() == 0) {
                        this.f3633g = false;
                    }
                }
            }
        }
        this.f3631e += 4.0f * f;
        if (this.f3631e > 360.0f) {
            this.f3631e -= 360.0f;
        }
        if (!this.f3633g) {
            this.f6953em = C0758f.m2362a(this.f6953em, 3.0f + (C0758f.m2249h(this.f3631e) * 1.5f), 0.1f * f);
        } else {
            this.f6953em = C0758f.m2362a(this.f6953em, 0.0f, 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        if (m5039cJ()) {
            return 1.2f;
        }
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        if (m5039cJ()) {
            return 1.8f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3410l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo3629d(Unit unit, boolean z) {
        if (this.f3633g || !m3636a(this.f3634h, 4, unit) || unit == this) {
            return false;
        }
        if (this.f1608bV != unit.f1608bV && !z) {
            return false;
        }
        return C1117y.m488a(unit, true, true);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3627e(Unit unit, boolean z) {
        if (!mo3629d(unit, z)) {
            return false;
        }
        m3644C(unit);
        return true;
    }

    /* renamed from: C */
    public void m3644C(Unit unit) {
        unit.f1650cL = this;
        this.f3634h.add(unit);
        GameEngine.m1234A().f6111bS.m1972l(unit);
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: e */
    public void mo3628e(Unit unit) {
        if (unit.f1650cL == this) {
            this.f3634h.remove(unit);
            unit.f1650cL = null;
            return;
        }
        GameEngine.m1120g("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3415bN() {
        return 12000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bA */
    public boolean mo3102bA() {
        return this.f3633g;
    }

    /* renamed from: L */
    public void m3643L() {
        this.f3633g = true;
        this.f3632f = 30.0f;
    }

    /* renamed from: M */
    public void m3642M() {
        this.f3633g = false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3640a(Action action, boolean z) {
        if (action == f3639i) {
            m3643L();
        }
        if (action == f3640j) {
            m3642M();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cq */
    public boolean mo3630cq() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bB */
    public int mo3101bB() {
        return this.f3634h.size();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: co */
    public C0208c mo3631co() {
        return f3639i.m5257N();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3641N() {
        return f3641k;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: f */
    public boolean mo3626f() {
        return !m5039cJ();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: j */
    public boolean mo3624j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bz */
    public C1101m mo3072bz() {
        return this.f3634h;
    }
}
