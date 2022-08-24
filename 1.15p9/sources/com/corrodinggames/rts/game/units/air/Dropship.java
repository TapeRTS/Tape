package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class Dropship extends AbstractC0309b implements InterfaceC0242ak {

    /* renamed from: e */
    float f1871e;

    /* renamed from: f */
    float f1872f;

    /* renamed from: g */
    boolean f1873g;

    /* renamed from: o */
    C1101m f1874o;

    /* renamed from: p */
    Rect f1875p;

    /* renamed from: a */
    static BitmapOrTexture f1867a = null;

    /* renamed from: b */
    static BitmapOrTexture f1868b = null;

    /* renamed from: c */
    static BitmapOrTexture f1869c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f1870d = new BitmapOrTexture[10];

    /* renamed from: q */
    public static final Action f1876q = new C03141(109);

    /* renamed from: r */
    public static final Action f1877r = new C03152(110);

    /* renamed from: s */
    static ArrayList f1878s = new ArrayList();

    static {
        f1878s.add(f1876q);
        f1878s.add(f1877r);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f1871e);
        c0859ar.mo1488a(this.f1872f);
        c0859ar.mo1482a(this.f1873g);
        c0859ar.mo1487a(this.f1874o.size());
        Iterator it = this.f1874o.iterator();
        while (it.hasNext()) {
            c0859ar.mo1486a((Unit) it.next());
        }
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f1871e = c0876k.m1453g();
        this.f1872f = c0876k.m1453g();
        this.f1873g = c0876k.m1455e();
        this.f1874o.clear();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            Unit m1445o = c0876k.m1445o();
            if (m1445o != null) {
                this.f1874o.add(m1445o);
            }
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: bX */
    public int m5626bX() {
        return Hovercraft.m3978a(this.f1874o);
    }

    /* renamed from: bY */
    public int m5625bY() {
        return 4;
    }

    /* renamed from: b */
    public UnitType m5605r() {
        return UnitType.f1759z;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1868b = gameEngine.graphics.loadImage(R.drawable.dropship);
        f1869c = gameEngine.graphics.loadImage(R.drawable.dropship_shadow);
        f1867a = gameEngine.graphics.loadImage(R.drawable.dropship_dead);
        f1870d = Team.createBitmapForTeam(f1868b);
    }

    /* renamed from: d */
    public BitmapOrTexture m5618d() {
        if (this.isDead) {
            return f1867a;
        }
        return f1870d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m5608k() {
        return f1869c;
    }

    /* renamed from: d */
    public BitmapOrTexture m5617d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m5615e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f1867a;
        setDrawLayer(0);
        this.collidable = false;
        m5611f(true);
        return true;
    }

    public Dropship(boolean z) {
        super(z);
        this.f1871e = 0.0f;
        this.f1874o = new C1101m();
        this.f1875p = new Rect();
        m2884T(45);
        m2883U(47);
        this.radius = 20.0f;
        this.displayRadius = this.radius + 0.0f;
        this.f1632ct = 500.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1868b;
        this.shadowImage = f1869c;
        this.height = 0.0f;
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return this.height >= 4.0f;
    }

    /* renamed from: cr */
    public boolean m5619cr() {
        return true;
    }

    /* renamed from: a */
    public void m5634a(float f) {
        super.update(f);
        if (this.isDead) {
            return;
        }
        boolean cJ = m5837cJ();
        if (this.f1873g && !cJ && !this.f1647cI && this.height < 4.0f) {
            this.f1872f = CommonUtils.m2368a(this.f1872f, f);
            if (this.f1872f == 0.0f) {
                this.f1872f = 30.0f;
                if (this.f1874o.size() == 0) {
                    this.f1873g = false;
                } else {
                    boolean z = this.f1874o.size() % 2 == 0;
                    float m2249i = this.f6951ek + (CommonUtils.m2249i(this.direction) * (-9.0f));
                    float sin = this.f6952el + (CommonUtils.sin(this.direction) * (-9.0f));
                    float m2249i2 = m2249i + (CommonUtils.m2249i(this.direction + 90.0f) * (z ? -7 : 7)) + (CommonUtils.sin(this.direction + 90.0f) * (z ? -7 : 7));
                    Unit unit = (Unit) this.f1874o.remove(this.f1874o.size() - 1);
                    if (!C1117y.m494a(unit, m2249i2, sin)) {
                        m2249i2 += 10.0f;
                    }
                    if (!C1117y.m494a(unit, m2249i2, sin)) {
                        m2249i2 -= 20.0f;
                    }
                    if (!C1117y.m494a(unit, m2249i2, sin)) {
                        m2249i2 -= 10.0f;
                        sin += 10.0f;
                    }
                    if (!C1117y.m494a(unit, m2249i2, sin)) {
                        sin -= 20.0f;
                    }
                    if (!C1117y.m494a(unit, m2249i2, sin)) {
                        this.f1874o.add(unit);
                    } else {
                        unit.f1650cL = null;
                        unit.f6951ek = m2249i2;
                        unit.f6952el = sin;
                        unit.f1610bX += 0.1f;
                        unit.direction = this.direction + 180.0f;
                        unit.f1603bQ = this;
                        unit.f1604bR = 45.0f;
                        if (unit instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                            abstractC0623y.m3127az();
                            abstractC0623y.m3071d(this.f6951ek + (CommonUtils.m2249i(this.direction) * (-66.0f)), this.f6952el + (CommonUtils.sin(this.direction) * (-66.0f)));
                        }
                        if (this.f1874o.size() == 0) {
                            this.f1873g = false;
                        }
                    }
                }
            }
        }
        this.f1871e += 2.0f * f;
        if (this.f1871e > 360.0f) {
            this.f1871e -= 360.0f;
        }
        boolean mo3293i = mo3293i();
        if (isActive()) {
            if (m3136aq() && !cJ) {
                this.height = CommonUtils.m2367a(this.height, 2.0f, 0.4f * f);
            } else {
                this.height = CommonUtils.m2367a(this.height, 35.0f + (CommonUtils.sin(this.f1871e) * 1.5f), 0.35f * f);
            }
        }
        if (mo3293i != mo3293i()) {
            this.f3939ax = true;
            if (mo3293i()) {
                setDrawLayer(5);
            } else {
                setDrawLayer(2);
            }
        }
    }

    /* renamed from: E */
    public PointF m5638E(int i) {
        float m5610g = m5610g(i);
        float f = this.direction;
        f3980bf.m7213a(this.f6951ek + (CommonUtils.m2249i(f) * m5610g), this.f6952el + (CommonUtils.sin(f) * m5610g));
        return f3980bf;
    }

    /* renamed from: a */
    public void m5632a(Unit unit, int i) {
        PointF m5638E = m5638E(i);
        Projectile createProjectile = Projectile.createProjectile(this, m5638E.x, m5638E.y, this.height, i);
        createProjectile.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        createProjectile.directDamage = 35.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f997x = 2.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(m5638E.x, m5638E.y, this.height, -1127220);
        gameEngine.effects.m2562a(m5638E.x, m5638E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.audio.m3004a(AudioEngine.f4050u, 0.3f, this.f6951ek, this.f6952el);
    }

    /* renamed from: m */
    public float m5606m() {
        return 140.0f;
    }

    /* renamed from: b */
    public float m5630b(int i) {
        return 40.0f;
    }

    /* renamed from: z */
    public float m5604z() {
        return 2.3f;
    }

    /* renamed from: A */
    public float m5643A() {
        return 1.4f;
    }

    /* renamed from: c */
    public float m5622c(int i) {
        return 99.0f;
    }

    /* renamed from: E */
    public boolean m5639E() {
        return false;
    }

    /* renamed from: C */
    public float m5642C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float m5640D() {
        return 0.05f;
    }

    /* renamed from: l */
    public boolean m5607l() {
        return false;
    }

    /* renamed from: g */
    public float m5610g(int i) {
        return 15.0f;
    }

    /* renamed from: a */
    public void mo2880a() {
        m5611f(true);
        super.mo2880a();
    }

    /* renamed from: f */
    public void m5611f(boolean z) {
        Iterator it = this.f1874o.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.f1650cL = null;
            unit.f6951ek = this.f6951ek + (CommonUtils.m2249i(this.direction) * (-9.0f));
            unit.f6952el = this.f6952el + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m5811ci();
            }
        }
        this.f1874o.clear();
    }

    /* renamed from: bA */
    public boolean mo5936bA() {
        return this.f1873g;
    }

    /* renamed from: L */
    public void m5637L() {
        this.f1873g = true;
        this.f1872f = 30.0f;
    }

    /* renamed from: M */
    public void m5636M() {
        this.f1873g = false;
    }

    /* renamed from: bN */
    public float m5627bN() {
        return 16000.0f;
    }

    /* renamed from: d */
    public boolean m5616d(Unit unit, boolean z) {
        if (this.f1873g || !Hovercraft.m3977a(this.f1874o, 4, unit) || unit == this) {
            return false;
        }
        if (this.team != unit.team && !z) {
            return false;
        }
        return C1117y.m488a(unit, true, true);
    }

    /* renamed from: e */
    public boolean m5613e(Unit unit, boolean z) {
        if (!m5616d(unit, z)) {
            return false;
        }
        m5641C(unit);
        return true;
    }

    /* renamed from: C */
    public void m5641C(Unit unit) {
        unit.f1650cL = this;
        this.f1874o.add(unit);
        GameEngine.getInstance().f6111bS.m1976l(unit);
    }

    /* renamed from: e */
    public void mo5934e(Unit unit) {
        if (unit.f1650cL == this) {
            this.f1874o.remove(unit);
            unit.f1650cL = null;
            return;
        }
        GameEngine.m1120g("Unit is not being transported");
    }

    /* renamed from: a */
    public void m5633a(Action action, boolean z) {
        if (action == f1876q) {
            m5637L();
        }
        if (action == f1877r) {
            m5636M();
        }
    }

    /* renamed from: bB */
    public int mo5935bB() {
        return this.f1874o.size();
    }

    /* renamed from: cq */
    public boolean m5620cq() {
        return true;
    }

    /* renamed from: co */
    public C0208c m5621co() {
        return f1876q.m6095N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$1.class */
    final class C03141 extends AbstractC0229x {
        C03141(int i) {
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
            return ((Dropship) unit).f1874o.size();
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return !((Dropship) unit).f1873g && !((AbstractC0623y) unit).m5837cJ() && ((Dropship) unit).f1874o.size() > 0;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$2.class */
    final class C03152 extends AbstractC0229x {
        C03152(int i) {
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
            return ((Dropship) unit).f1873g;
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            return mo4247a(unit, false);
        }
    }

    /* renamed from: N */
    public ArrayList m5635N() {
        return f1878s;
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
    public C1101m m5624bz() {
        return this.f1874o;
    }
}
