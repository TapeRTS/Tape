package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public class SpreadingFire extends AbstractC0620v {

    /* renamed from: b */
    BitmapOrTexture f1539b;

    /* renamed from: c */
    int f1540c;

    /* renamed from: d */
    int f1541d;

    /* renamed from: e */
    float f1542e;

    /* renamed from: f */
    float f1543f;

    /* renamed from: g */
    int f1544g;

    /* renamed from: h */
    int f1545h;

    /* renamed from: i */
    float f1546i;

    /* renamed from: j */
    float f1547j;

    /* renamed from: k */
    boolean f1548k;

    /* renamed from: l */
    float f1549l;

    /* renamed from: m */
    float f1550m;

    /* renamed from: n */
    float f1551n;

    /* renamed from: o */
    float f1552o;

    /* renamed from: p */
    float f1553p;

    /* renamed from: q */
    float f1554q;

    /* renamed from: r */
    boolean f1555r;

    /* renamed from: u */
    Rect f1556u;

    /* renamed from: a */
    static BitmapOrTexture[] f1557a = new BitmapOrTexture[2];

    /* renamed from: s */
    static Point f1558s = new Point();

    /* renamed from: t */
    public static C0241aj f1559t = new C0241aj();

    /* renamed from: b */
    public static void load() {
        f1557a[0] = GameEngine.getInstance().graphics.loadImage(R.drawable.fire);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f1540c);
        c0859ar.mo1487a(this.f1541d);
        c0859ar.mo1488a(this.f1542e);
        c0859ar.m1554c(0);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f1540c = c0876k.m1454f();
        this.f1541d = c0876k.m1454f();
        this.f1542e = c0876k.m1453g();
        c0876k.m1457d();
        super.mo2877a(c0876k);
    }

    /* renamed from: c */
    public BitmapOrTexture m5949c() {
        return this.f1539b;
    }

    /* renamed from: e */
    public boolean m5945e() {
        return false;
    }

    public SpreadingFire(boolean z) {
        super(z);
        this.f1541d = 0;
        this.f1544g = 0;
        this.f1545h = 0;
        this.f1548k = false;
        this.f1556u = new Rect();
        m5958a(0);
        this.radius = 20.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 100.0f;
        this.f1631cs = this.f1632ct;
        this.direction = -90.0f;
        this.collidable = false;
        this.f1552o = 0.05f;
        this.f1553p = 120.0f;
        setDrawLayer(3);
    }

    /* renamed from: c_ */
    public void m5947c_() {
        this.collidable = false;
    }

    /* renamed from: a */
    public void m5958a(int i) {
        this.f1540c = i;
        if (this.f1540c == 0) {
            m2884T(20);
            m2883U(20);
            this.f1544g = 0;
            this.f1545h = 0;
            this.f1539b = f1557a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.f1540c + " is not supported");
    }

    /* renamed from: d */
    public void m5946d() {
        this.f1548k = true;
        this.f1546i = CommonUtils.m2345a((AbstractC1120w) this, -5, 5, 1);
        this.f1547j = CommonUtils.m2345a((AbstractC1120w) this, -5, 5, 2);
        this.f1542e = CommonUtils.m2345a((AbstractC1120w) this, 1, 10, 3);
        this.f1541d = CommonUtils.m2345a((AbstractC1120w) this, 0, 2, 4);
        this.f1543f = CommonUtils.m2345a((AbstractC1120w) this, 7, 13, 5);
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        gameEngine.f6104bL.m6652a(this.f6951ek, this.f6952el);
        int i = gameEngine.f6104bL.f800T;
        int i2 = gameEngine.f6104bL.f801U;
        if (!c0173b.m6608c(i, i2)) {
            this.f1549l = 0.0f;
            this.f1550m = 0.0f;
            this.f1551n = 2.0f;
            return;
        }
        C0180g m6560a = gameEngine.f6104bL.f832u.m6560a(i, i2);
        boolean z = false;
        if (m6560a.f917e || m6560a.f920h || m6560a.f923k || m6560a.f918f) {
            z = true;
        }
        if (z) {
            this.f1549l = 0.0f;
            this.f1550m = 0.0f;
            this.f1551n = 2.0f;
            return;
        }
        this.f1549l = 5.0E-4f;
        this.f1550m = 1.0f;
        this.f1551n = 0.3f;
        this.f1552o += CommonUtils.m2345a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
    }

    /* renamed from: a */
    public void m5960a(float f) {
        super.update(f);
        if (!this.f1548k) {
            m5946d();
        }
        if (this.f1552o < this.f1550m) {
            this.f1552o += this.f1549l * f;
            if (this.f1552o > this.f1550m) {
                this.f1552o = this.f1550m;
            }
        }
        if (this.f1552o > this.f1551n) {
            this.f1554q = (float) (this.f1554q + (0.01d * f));
            if ((!this.f1555r && this.f1554q > 1.0f) || this.f1554q > 8.0f) {
                this.f1554q = CommonUtils.m2345a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
                m5944f();
            }
        }
        this.f1542e += f;
        if (this.f1542e > 10.0f) {
            this.f1542e = 0.0f;
            this.f1541d++;
            if (this.f1541d > 3) {
                this.f1541d = 0;
            }
        }
        if (this.f1552o < 0.0f) {
            mo3083bv();
        }
    }

    /* renamed from: f */
    public void m5944f() {
        this.f1555r = true;
        m5951b(-1, -1);
        m5951b(0, -1);
        m5951b(1, -1);
        m5951b(-1, 0);
        m5951b(1, 0);
        m5951b(-1, 1);
        m5951b(0, 1);
        m5951b(1, 1);
    }

    /* renamed from: b */
    public void m5951b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f = (int) (this.f6951ek + (i * gameEngine.f6104bL.f784n));
        float f2 = (int) (this.f6952el + (i2 * gameEngine.f6104bL.f785o));
        if (m5959a(f, f2) == null) {
            SpreadingFire spreadingFire = new SpreadingFire(false);
            spreadingFire.f6951ek = f;
            spreadingFire.f6952el = f2;
            spreadingFire.mo3120b(this.team);
            gameEngine.f6121cc.m3787a(spreadingFire);
            Team.m6353c(spreadingFire);
            this.f1555r = false;
        }
    }

    /* renamed from: a */
    public static SpreadingFire m5959a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        f1559t.m5937a(f, f2);
        gameEngine.f6121cc.m3792a(f, f2, 30.0f, null, 1.0f, f1559t);
        return f1559t.f1562c;
    }

    /* renamed from: a_ */
    public Rect m5955a_(boolean z) {
        int i = this.f1544g;
        int i2 = this.f1545h;
        int i3 = i + (this.f1541d * this.f4223eo);
        f1691dA.m7208a(i3, i2, i3 + this.f4223eo, i2 + this.f4224ep);
        return f1691dA;
    }

    /* renamed from: c */
    public boolean m5948c(float f) {
        BitmapOrTexture m5949c = m5949c();
        GameEngine gameEngine = GameEngine.getInstance();
        f1683ds.m7193a(mo4492cE());
        f1683ds.m7196a(0.0f, (int) (-this.height));
        f1683ds.m7196a(this.f1546i, this.f1547j);
        f1684dt.m7207a(m5955a_(false));
        gameEngine.graphics.mo878k();
        float m7184d = f1683ds.m7184d();
        float m7183e = f1683ds.m7183e();
        gameEngine.graphics.mo934a(mo3996d(false), m7184d, m7183e);
        gameEngine.graphics.mo933a(this.f1552o * 2.7f, this.f1552o * 2.7f, m7184d, m7183e);
        gameEngine.graphics.mo909a(m5949c, f1684dt, f1683ds, (Paint) null);
        gameEngine.graphics.mo877l();
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao m5943h() {
        return EnumC0246ao.f1702a;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return false;
    }

    /* renamed from: ak */
    public boolean m5953ak() {
        return false;
    }

    /* renamed from: aj */
    public boolean m5954aj() {
        return false;
    }

    /* renamed from: p_ */
    public boolean m5939p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m5950b_() {
        return false;
    }

    /* renamed from: m */
    public UnitType m5938r() {
        return UnitType.f1778S;
    }

    /* renamed from: n */
    public void m5940n() {
        super.mo4207n();
    }

    /* renamed from: a_ */
    public float m5956a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean m5942l() {
        return false;
    }

    /* renamed from: P */
    public boolean m5961P() {
        return true;
    }

    /* renamed from: a */
    public float m5957a(Unit unit, float f, Projectile projectile) {
        this.f1552o -= f / 100.0f;
        return super.mo4499a(unit, 0.0f, projectile);
    }
}
