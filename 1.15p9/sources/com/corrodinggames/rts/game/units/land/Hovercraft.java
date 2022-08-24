package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
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
    static BitmapOrTexture f3635a = null;

    /* renamed from: b */
    static BitmapOrTexture f3636b = null;

    /* renamed from: c */
    static BitmapOrTexture f3637c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3638d = new BitmapOrTexture[10];

    /* renamed from: i */
    public static final Action f3639i = new C05271(109);

    /* renamed from: j */
    public static final Action f3640j = new C05282(110);

    /* renamed from: k */
    static ArrayList f3641k = new ArrayList();

    static {
        f3641k.add(f3639i);
        f3641k.add(f3640j);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3631e);
        c0859ar.mo1488a(this.f3632f);
        c0859ar.mo1482a(this.f3633g);
        c0859ar.mo1487a(this.f3634h.size());
        Iterator it = this.f3634h.iterator();
        while (it.hasNext()) {
            c0859ar.mo1486a((Unit) it.next());
        }
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
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
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public UnitType m3952r() {
        return UnitType.f1752s;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3635a = gameEngine.graphics.loadImage(R.drawable.hovercraft);
        f3637c = gameEngine.graphics.loadImage(R.drawable.hovercraft_shadow);
        f3636b = gameEngine.graphics.loadImage(R.drawable.hovercraft_dead);
        f3638d = Team.createBitmapForTeam(f3635a);
    }

    /* renamed from: d */
    public BitmapOrTexture m3964d() {
        if (this.isDead) {
            return f3636b;
        }
        return f3638d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3955k() {
        return f3637c;
    }

    /* renamed from: d */
    public BitmapOrTexture m3963d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3961e() {
        this.image = f3636b;
        setDrawLayer(0);
        this.collidable = false;
        m3957f(true);
        m3206a(EnumC0233ab.f1502b);
        return true;
    }

    /* renamed from: a */
    public void mo2880a() {
        m3957f(true);
        super.mo2880a();
    }

    /* renamed from: f */
    public void m3957f(boolean z) {
        Iterator it = this.f3634h.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.f1650cL = null;
            unit.f6951ek = this.f6951ek + (CommonUtils.m2249i(this.direction) * (-9.0f));
            unit.f6952el = this.f6952el + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m5811ci();
            }
        }
        this.f3634h.clear();
    }

    public Hovercraft(boolean z) {
        super(z);
        this.f3631e = 0.0f;
        this.f3634h = new C1101m();
        m2884T(20);
        m2883U(32);
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 450.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3635a;
        this.shadowImage = f3637c;
    }

    /* renamed from: a */
    public static int m3978a(C1101m c1101m) {
        int i = 0;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            i += ((Unit) it.next()).m5799cu();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3977a(C1101m c1101m, int i, Unit unit) {
        if (m3978a(c1101m) + unit.m5799cu() <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: bX */
    public int m3971bX() {
        return m3978a(this.f3634h);
    }

    /* renamed from: bY */
    public int m3970bY() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m3980a(Unit unit, Unit unit2, boolean z) {
        return m3979a(unit, unit2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m3979a(Unit unit, Unit unit2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float m2249i = (unit.f6951ek + (CommonUtils.m2249i(unit.direction + f2) * f5)) - (CommonUtils.sin(unit.direction + f2) * f4);
        float sin = unit.f6952el + (CommonUtils.sin(unit.direction + f2) * f5) + (CommonUtils.m2249i(unit.direction + f2) * f4);
        float m2249i2 = m2249i + (CommonUtils.m2249i(unit.direction + 90.0f) * (z ? -f : f));
        float sin2 = sin + (CommonUtils.sin(unit.direction + 90.0f) * (z ? -f : f));
        if (!C1117y.m494a(unit2, m2249i2, sin2)) {
            m2249i2 += 10.0f;
        }
        if (!C1117y.m494a(unit2, m2249i2, sin2)) {
            m2249i2 -= 20.0f;
        }
        if (!C1117y.m494a(unit2, m2249i2, sin2)) {
            m2249i2 -= 10.0f;
            sin2 += 10.0f;
        }
        if (!C1117y.m494a(unit2, m2249i2, sin2)) {
            sin2 -= 20.0f;
        }
        if (!C1117y.m494a(unit2, m2249i2, sin2)) {
            return false;
        }
        unit2.f1650cL = null;
        unit2.f6951ek = m2249i2;
        unit2.f6952el = sin2;
        unit2.f1610bX += 0.1f;
        unit2.direction = unit.direction + f2;
        unit2.f1603bQ = unit;
        unit2.f1604bR = 45.0f;
        if (unit2 instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
            abstractC0623y.m3049j(unit2.direction);
            abstractC0623y.m3127az();
            abstractC0623y.m3071d(unit2.f6951ek + (CommonUtils.m2249i(unit2.direction + (z ? -f : f)) * f3), unit2.f6952el + (CommonUtils.sin(unit2.direction + (z ? -f : f)) * f3));
            abstractC0623y.f3915ab = 0;
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m3983a(float f) {
        super.update(f);
        if (this.isDead || !isActive()) {
            return;
        }
        if (this.f1622cj == 0.0f && this.f6949ei != 3) {
            setDrawLayer(3);
        }
        if (this.f3633g && !m5837cJ() && !this.f1647cI) {
            this.f3632f = CommonUtils.m2368a(this.f3632f, f);
            if (this.f3632f == 0.0f) {
                this.f3632f = 30.0f;
                if (this.f3634h.size() == 0) {
                    this.f3633g = false;
                } else {
                    boolean z = this.f3634h.size() % 2 == 0;
                    Unit unit = (Unit) this.f3634h.remove(this.f3634h.size() - 1);
                    if (!m3980a(this, unit, z)) {
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
            this.height = CommonUtils.m2367a(this.height, 3.0f + (CommonUtils.sin(this.f3631e) * 1.5f), 0.1f * f);
        } else {
            this.height = CommonUtils.m2367a(this.height, 0.0f, 0.1f * f);
        }
    }

    /* renamed from: a */
    public void m3981a(Unit unit, int i) {
    }

    /* renamed from: m */
    public float m3953m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float m3975b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float m3951z() {
        if (m5837cJ()) {
            return 1.2f;
        }
        return 0.9f;
    }

    /* renamed from: A */
    public float m3991A() {
        if (m5837cJ()) {
            return 1.8f;
        }
        return 1.4f;
    }

    /* renamed from: B */
    public float m3990B() {
        return 0.1f;
    }

    /* renamed from: C */
    public float m3989C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float m3987D() {
        return 0.05f;
    }

    /* renamed from: c */
    public float m3967c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m3954l() {
        return false;
    }

    /* renamed from: d */
    public boolean m3962d(Unit unit, boolean z) {
        if (this.f3633g || !m3977a(this.f3634h, 4, unit) || unit == this) {
            return false;
        }
        if (this.team != unit.team && !z) {
            return false;
        }
        return C1117y.m488a(unit, true, true);
    }

    /* renamed from: e */
    public boolean m3959e(Unit unit, boolean z) {
        if (!m3962d(unit, z)) {
            return false;
        }
        m3988C(unit);
        return true;
    }

    /* renamed from: C */
    public void m3988C(Unit unit) {
        unit.f1650cL = this;
        this.f3634h.add(unit);
        GameEngine.getInstance().f6111bS.m1976l(unit);
    }

    /* renamed from: e */
    public void mo5934e(Unit unit) {
        if (unit.f1650cL == this) {
            this.f3634h.remove(unit);
            unit.f1650cL = null;
            return;
        }
        GameEngine.m1120g("Unit is not being transported");
    }

    /* renamed from: bN */
    public float m3972bN() {
        return 12000.0f;
    }

    /* renamed from: bA */
    public boolean mo5936bA() {
        return this.f3633g;
    }

    /* renamed from: L */
    public void m3986L() {
        this.f3633g = true;
        this.f3632f = 30.0f;
    }

    /* renamed from: M */
    public void m3985M() {
        this.f3633g = false;
    }

    /* renamed from: a */
    public void m3982a(Action action, boolean z) {
        if (action == f3639i) {
            m3986L();
        }
        if (action == f3640j) {
            m3985M();
        }
    }

    /* renamed from: cq */
    public boolean m3965cq() {
        return true;
    }

    /* renamed from: bB */
    public int mo5935bB() {
        return this.f3634h.size();
    }

    /* renamed from: co */
    public C0208c m3966co() {
        return f3639i.m6095N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$1.class */
    final class C05271 extends AbstractC0229x {
        C05271(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Will unload all units when stopped";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.unload", new Object[0]);
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return ((InterfaceC0242ak) unit).mo5935bB();
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return !((InterfaceC0242ak) unit).mo5936bA() && ((InterfaceC0242ak) unit).mo5933f() && ((InterfaceC0242ak) unit).mo5935bB() > 0;
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            return ((InterfaceC0242ak) unit).mo5932j();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$2.class */
    final class C05282 extends AbstractC0229x {
        C05282(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Stop unloading";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.cancel", new Object[0]);
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return ((InterfaceC0242ak) unit).mo5936bA();
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            return mo4247a(unit, false);
        }
    }

    /* renamed from: N */
    public ArrayList m3984N() {
        return f3641k;
    }

    /* renamed from: f */
    public boolean mo5933f() {
        return !m5837cJ();
    }

    /* renamed from: j */
    public boolean mo5932j() {
        return true;
    }

    /* renamed from: bz */
    public C1101m m3969bz() {
        return this.f3634h;
    }
}
