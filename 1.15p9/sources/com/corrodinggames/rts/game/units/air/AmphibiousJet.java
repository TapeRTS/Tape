package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.MammothTank;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class AmphibiousJet extends AbstractC0309b {

    /* renamed from: q */
    float f1847q;

    /* renamed from: r */
    boolean f1848r;

    /* renamed from: s */
    boolean f1849s;

    /* renamed from: t */
    float f1850t;

    /* renamed from: u */
    float f1851u;

    /* renamed from: v */
    protected Paint f1852v;

    /* renamed from: w */
    PointF f1853w;

    /* renamed from: x */
    Rect f1854x;

    /* renamed from: a */
    static BitmapOrTexture f1855a = null;

    /* renamed from: b */
    static BitmapOrTexture f1856b = null;

    /* renamed from: c */
    static BitmapOrTexture f1857c = null;

    /* renamed from: d */
    static BitmapOrTexture f1858d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1859e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f1860f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture[] f1861g = new BitmapOrTexture[10];

    /* renamed from: o */
    static BitmapOrTexture f1862o = null;

    /* renamed from: p */
    static BitmapOrTexture f1863p = null;

    /* renamed from: y */
    public static final Action f1864y = new AbstractC0229x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String getText() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo4212a(Unit unit, boolean z) {
            return !((AmphibiousJet) unit).f1848r;
        }
    };

    /* renamed from: z */
    public static final Action f1865z = new AbstractC0229x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String getText() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo4212a(Unit unit, boolean z) {
            return ((AmphibiousJet) unit).f1848r && ((AbstractC0623y) unit).m5792cI();
        }
    };

    /* renamed from: A */
    static ArrayList f1866A = new ArrayList();

    static {
        f1866A.add(f1864y);
        f1866A.add(f1865z);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f1848r);
        c0859ar.mo1488a(this.f1850t);
        c0859ar.mo1488a(this.f1851u);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f1848r = c0876k.m1455e();
        this.f1849s = !mo3297Q();
        if (c0876k.m1463b() >= 21) {
            this.f1850t = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 22) {
            this.f1851u = c0876k.m1453g();
        }
        m5612L();
        super.mo2877a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.Unit
    /* renamed from: Q */
    public boolean mo3297Q() {
        return this.height < -1.0f;
    }

    /* renamed from: b */
    public boolean m5609b() {
        if (!this.f1848r || this.height < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public EnumC0246ao mo5604h() {
        if (this.f1626cn) {
            return EnumC0246ao.f1705d;
        }
        if (m5609b()) {
            return EnumC0246ao.f1706e;
        }
        return EnumC0246ao.f1705d;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.f1772M;
    }

    /* renamed from: f */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1856b = gameEngine.graphics.loadImage(R.drawable.amphibious_jet);
        f1857c = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_shadow);
        f1855a = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_dead);
        f1859e = Team.createBitmapForTeam(f1856b);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_p1);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_p2);
        f1860f = Team.createBitmapForTeam(loadImage);
        f1861g = Team.createBitmapForTeam(loadImage2);
        f1862o = m5838a(loadImage);
        f1863p = m5838a(loadImage2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: aQ */
    public boolean mo3165aQ() {
        if (super.mo3165aQ()) {
            m5605f(true);
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        if (this.isDead) {
            return true;
        }
        m5605f(false);
        if (!this.isDead) {
            for (int i = 0; i < mo3095bl(); i++) {
                if (i != m5611M()) {
                    float mo3065e = this.f1648cJ[i].f1716f / mo3065e(i);
                    if (mo3065e != 0.0f) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        PointF E = getTurretEnd(i);
                        gameEngine.graphics.mo880i();
                        gameEngine.graphics.mo896b(E.x - gameEngine.f6138cv, (E.y - gameEngine.f6139cw) - this.height);
                        gameEngine.graphics.mo935a(mo3065e * 0.7f, mo3065e * 0.7f);
                        gameEngine.graphics.mo915a(MammothTank.f3658e, 0.0f, 0.0f, (Paint) null);
                        gameEngine.graphics.mo879j();
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m5605f(boolean z) {
        Paint paint;
        BitmapOrTexture bitmapOrTexture;
        float f;
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            paint = m3168aN();
        } else {
            this.f1852v.m7220a(50, 255, 255, 255);
            paint = this.f1852v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF m5610a = m5610a(i, z);
            float f2 = m5610a.x - gameEngine.f6138cv;
            float f3 = m5610a.y - gameEngine.f6139cw;
            float mo3966d = mo3966d(false) - 90.0f;
            if (!z) {
                f3 -= this.height;
            }
            if (i == 0) {
                if (z) {
                    bitmapOrTexture = f1863p;
                } else {
                    bitmapOrTexture = f1861g[this.team.getId()];
                }
                f = mo3966d + 0.0f;
            } else {
                if (z) {
                    bitmapOrTexture = f1862o;
                } else {
                    bitmapOrTexture = f1860f[this.team.getId()];
                }
                f = mo3966d - 0.0f;
            }
            gameEngine.graphics.mo916a(bitmapOrTexture, f2, f3, f, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3095bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3247G(int i) {
        if (i == m5611M()) {
            return super.mo3247G(i);
        }
        float mo3966d = mo3966d(false) - 90.0f;
        PointF m5610a = m5610a(i, false);
        float f = m5610a.x;
        float f2 = m5610a.y;
        f3981bg.m7166a(f + (CommonUtils.m2249i(mo3966d) * 5.0f), f2 + (CommonUtils.sin(mo3966d) * 5.0f));
        return f3981bg;
    }

    /* renamed from: a */
    public PointF m5610a(int i, boolean z) {
        float mo3966d = mo3966d(false) - 90.0f;
        if (i == m5611M()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f = this.f6951ek;
        float f2 = this.f6952el;
        float m2315b = CommonUtils.m2315b(this.f1851u * 4.0f, 0.0f, 1.0f);
        float m2315b2 = CommonUtils.m2315b((this.f1851u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float m2249i = f + (CommonUtils.m2249i(mo3966d) * (7.0f - (5.0f * m2315b)));
        float sin = f2 + (CommonUtils.sin(mo3966d) * (7.0f - (5.0f * m2315b)));
        float f3 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1853w.m7166a(m2249i + (CommonUtils.m2249i(mo3966d + f3) * (12.0f - (5.0f * m2315b2))), sin + (CommonUtils.sin(mo3966d + f3) * (12.0f - (5.0f * m2315b2))));
        return this.f1853w;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.isDead) {
            return f1855a;
        }
        return f1859e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1857c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo3069d(int i) {
        return f1858d;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5607e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f1855a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public AmphibiousJet(boolean z) {
        super(z);
        this.f1848r = true;
        this.f1849s = true;
        this.f1850t = 0.0f;
        this.f1851u = 0.0f;
        this.f1852v = new C0930ag();
        this.f1853w = new PointF();
        this.f1854x = new Rect();
        m2878b(f1856b);
        this.radius = 12.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 530.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1856b;
        this.shadowImage = f1857c;
        this.height = 0.0f;
        setDrawLayer(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo3296i() {
        return !m5609b();
    }

    /* renamed from: L */
    public void m5612L() {
        if (!this.f1849s) {
            setDrawLayer(1);
        } else {
            setDrawLayer(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        float f2;
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        this.f1847q += 2.0f * f;
        if (this.f1847q > 360.0f) {
            this.f1847q -= 360.0f;
        }
        if (this.f1848r) {
            f2 = 20.0f + (CommonUtils.sin(this.f1847q) * 1.5f);
        } else {
            f2 = -8.0f;
        }
        if (this.f1848r && !mo3297Q()) {
            this.f1851u = CommonUtils.m2367a(this.f1851u, 0.0f, 0.018f * f);
        } else {
            this.f1851u = CommonUtils.m2367a(this.f1851u, 1.0f, 0.018f * f);
        }
        if (CommonUtils.m2294c(this.height - f2) > 3.0f) {
            float f3 = 0.6f;
            if (mo3297Q()) {
                f3 = 0.6f / 6.0f;
            }
            this.f1850t = CommonUtils.m2316b(this.f1850t, f3);
            this.f1850t = CommonUtils.m2367a(this.f1850t, f3, 0.006f * f);
        } else {
            this.f1850t = CommonUtils.m2367a(this.f1850t, 0.07f, 0.006f * f);
        }
        this.height = CommonUtils.m2367a(this.height, f2, this.f1850t * f);
        boolean z = false;
        if (this.f1849s && mo3297Q()) {
            if (!m5792cI()) {
                this.f1848r = true;
            } else {
                this.f1849s = false;
                m5612L();
                z = true;
            }
        }
        if (!this.f1849s && !mo3297Q()) {
            this.f1849s = true;
            m5612L();
            z = true;
        }
        if (z) {
            gameEngine.effects.m2556a(this.f6951ek, this.f6952el, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f4 = this.direction + i;
                C0745e m2541b = gameEngine.effects.m2541b((float) (this.f6951ek + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.f6952el + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                if (m2541b != null) {
                    m2541b.f4786ar = (short) 2;
                    m2541b.f4721t = true;
                    m2541b.f4722u = 7.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float getDirectDamage(int i) {
        if (i == m5611M()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        if (i == m5611M()) {
            return;
        }
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        createProjectile.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 10.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f997x = 2.0f;
        createProjectile.f1067aQ = false;
        createProjectile.f1000A = true;
        createProjectile.f1012M = true;
        createProjectile.f1034ai = 0.5f;
        createProjectile.f1036ak = 1.0f;
        createProjectile.f1037al = 0.1f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118482);
        gameEngine.audio.m3004a(AudioEngine.f4053x, 0.2f, this.f6951ek, this.f6952el);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float getMaxAttackRange() {
        if (m5609b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3065e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3063f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float getMoveSpeed() {
        if (!mo3297Q()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float getTurnSpeed() {
        if (!mo3297Q()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3258B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3018w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: y */
    public float mo3015y(int i) {
        return 0.38f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo3098bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo3097bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: i */
    public void rotateDeg(float f) {
        if (!m3229Z()) {
            super.rotateDeg(f);
            return;
        }
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
    }

    /* renamed from: M */
    public int m5611M() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo3966d(boolean z) {
        return this.f1648cJ[m5611M()].f1711a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ah */
    public boolean mo3147ah() {
        if (!mo3297Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ae */
    public boolean mo3150ae() {
        if (!mo3297Q()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean canAttackFly() {
        if (!mo3297Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ag */
    public boolean mo3148ag() {
        if (!mo3297Q()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3505a(Action action, boolean z) {
        if (action == f1864y) {
            this.f1848r = true;
        }
        if (action == f1865z) {
            this.f1848r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3506N() {
        return f1866A;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, getMaxAttackRange());
    }
}
