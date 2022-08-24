package com.corrodinggames.rts.game.units.land;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class ExperimentalHoverTank extends AbstractC0525h {

    /* renamed from: a */
    static BitmapOrTexture f3590a = null;

    /* renamed from: b */
    static BitmapOrTexture f3591b = null;

    /* renamed from: c */
    static BitmapOrTexture f3592c = null;

    /* renamed from: d */
    public static BitmapOrTexture f3593d = null;

    /* renamed from: e */
    public static BitmapOrTexture f3594e = null;

    /* renamed from: f */
    static BitmapOrTexture[] f3595f = new BitmapOrTexture[10];

    /* renamed from: g */
    int f3596g;

    /* renamed from: h */
    float f3597h;

    /* renamed from: i */
    Projectile f3598i;

    /* renamed from: j */
    Rect f3599j;

    /* renamed from: k */
    Paint f3600k;

    /* renamed from: b */
    public UnitType m4102r() {
        return UnitType.f1774O;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank);
        f3595f = Team.createBitmapForTeam(loadImage);
        f3590a = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_dead);
        f3591b = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_turret);
        f3592c = m5883a(loadImage, loadImage.mo396m() / 1, loadImage.mo397l());
        f3593d = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_shield);
        f3594e = gameEngine.graphics.loadImage(R.drawable.shield_mid);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        if (this.f3598i != null && this.f3598i.f6946ef) {
            this.f3598i = null;
        }
        c0859ar.m1568a(this.f3598i);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3598i = (Projectile) c0876k.m1468a(Projectile.class);
        super.mo2877a(c0876k);
    }

    /* renamed from: d */
    public BitmapOrTexture m4113d() {
        if (this.isDead) {
            return f3590a;
        }
        return f3595f[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4106k() {
        return f3592c;
    }

    /* renamed from: F */
    public boolean m4136F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f;
    }

    /* renamed from: G */
    public float m4135G() {
        return 4.0f;
    }

    /* renamed from: H */
    public float m4133H() {
        return 4.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m4112d(int i) {
        return f3591b;
    }

    /* renamed from: T */
    public BitmapOrTexture m4130T() {
        return f3593d;
    }

    /* renamed from: e */
    public boolean m4110e() {
        GameEngine.getInstance();
        this.image = f3590a;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1505e);
        return true;
    }

    public ExperimentalHoverTank(boolean z) {
        super(z);
        this.f3597h = 0.0f;
        this.f3599j = new Rect();
        this.f3600k = C1117y.m505a();
        m2879a(f3595f[7], 1);
        this.radius = 30.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 3500.0f;
        this.f1631cs = this.f1632ct;
        this.f1637cy = 5000.0f;
        this.f1634cv = this.f1637cy;
        this.image = f3595f[7];
    }

    /* renamed from: bV */
    public float m4122bV() {
        if (this.f1637cy > 0.0f && this.f1634cv < this.f1637cy) {
            return this.f1634cv / this.f1637cy;
        }
        return super.m5856bV();
    }

    /* renamed from: a */
    public void m4129a(float f) {
        super.update(f);
        if (this.isDead || !isActive()) {
            return;
        }
        if (!this.isDead) {
            if (this.f1622cj != 0.0f) {
                setDrawLayer(2);
            } else {
                setDrawLayer(4);
            }
        }
        if (this.f1647cI) {
        }
        this.f3597h += 1.0f * f;
        if (this.f3597h > 360.0f) {
            this.f3597h -= 360.0f;
        }
        this.height = CommonUtils.m2367a(this.height, 4.0f + (CommonUtils.sin(this.f3597h) * 2.0f), 0.1f * f);
        this.f1634cv = CommonUtils.m2367a(this.f1634cv, this.f1637cy, 0.25f * f);
        this.f1635cw = CommonUtils.m2367a(this.f1635cw, 0.0f, 4.0f * f);
        if (this.f1635cw > 50.0f) {
            this.f1635cw = 50.0f;
        }
        if (this.f3598i != null) {
            PointF E = getTurretEnd(0);
            this.f3598i.f6951ek = E.x;
            this.f3598i.f6952el = E.y;
            this.f3598i.height = this.height;
            if (this.f3598i.f6946ef) {
                this.f3598i = null;
            }
        }
    }

    /* renamed from: bN */
    public float m4123bN() {
        return 80000.0f;
    }

    /* renamed from: L */
    public float m4131L(int i) {
        return 0.0f;
    }

    /* renamed from: K */
    public PointF m4132K(int i) {
        PointF K = super.m3238K(i);
        if (this.f3598i != null) {
            K.x += this.f3598i.x;
            K.y += this.f3598i.y;
        }
        return K;
    }

    /* renamed from: q */
    public float m4103q(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void m4128a(Unit unit, int i) {
        GameEngine.getInstance();
        PointF E = getTurretEnd(i);
        if (this.f3598i != null) {
            boolean z = false;
            if (this.f3598i.f6946ef) {
                z = true;
            }
            if (this.f3598i.target != unit) {
                z = true;
            }
            if (z) {
                this.f3598i = null;
            }
        }
        float m4124b = m4124b(i) + m4108e(i) + 5.0f;
        if (this.f3598i != null) {
            this.f3598i.lifeTimer = m4124b;
            return;
        }
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        m6509a.directDamage = 380.0f;
        m6509a.target = unit;
        m6509a.lifeTimer = m4124b;
        m6509a.f1001B = true;
        m6509a.f1000A = true;
        m6509a.f1067aQ = true;
        m6509a.f1004E = true;
        m6509a.f1009J = 70.0f;
        m6509a.f1005F = 230.0f;
        m6509a.f1036ak = 0.75f;
        m6509a.f6949ei = this.f6949ei;
        this.f3598i = m6509a;
    }

    /* renamed from: m */
    public float m4104m() {
        return 180.0f;
    }

    /* renamed from: b */
    public float m4124b(int i) {
        return 8.0f;
    }

    /* renamed from: e */
    public float m4108e(int i) {
        return 8.0f;
    }

    /* renamed from: z */
    public float m4101z() {
        return 0.6f;
    }

    /* renamed from: bc */
    public float m4121bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m4140A() {
        return 1.1f;
    }

    /* renamed from: B */
    public float m4139B() {
        return 0.03f;
    }

    /* renamed from: c */
    public float m4115c(int i) {
        return 1.5f;
    }

    /* renamed from: C */
    public float m4138C() {
        return 0.02f;
    }

    /* renamed from: D */
    public float m4137D() {
        return 0.02f;
    }

    /* renamed from: a_ */
    public Rect m4127a_(boolean z) {
        if (this.isDead && !z) {
            return super.m5876a_(z);
        }
        if (z) {
            return super.m5876a_(z);
        }
        int i = 0 + (this.f3596g * this.f4223eo);
        this.f3599j.m7208a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f3599j;
    }

    /* renamed from: c */
    public boolean m4116c(float f) {
        BitmapOrTexture m4130T;
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        if (!this.isDead) {
            float f2 = 0.0f;
            if (this.f3598i != null) {
                f2 = CommonUtils.m2316b(this.f3598i.m6498e(), 0.25f) * 3.0f;
            }
            C1117y.m485a(this, MammothTank.f3658e, f2, 0);
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.isDead && this.f1634cv > 0.0f && this.f1636cx == 0.0f && (m4130T = m4130T()) != null) {
            this.f3600k.m7267a((int) ((0.09f + ((this.f1634cv / this.f1637cy) * 0.4f) + ((CommonUtils.m2316b(this.f1635cw, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            gameEngine.graphics.mo916a(m4130T, this.f6951ek - gameEngine.f6138cv, (this.f6952el - gameEngine.f6139cw) - this.height, mo3996d(false) - 90.0f, this.f3600k);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m4105l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4126af() {
        return true;
    }

    /* renamed from: g */
    public float m4107g(int i) {
        return 8.0f;
    }

    /* renamed from: G */
    public PointF m4134G(int i) {
        f3981bg.m7213a(this.f6951ek, this.f6952el);
        return f3981bg;
    }

    /* renamed from: bl */
    public int m4118bl() {
        return 1;
    }

    /* renamed from: bi */
    public boolean m4120bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean m4119bj() {
        return true;
    }

    /* renamed from: cu */
    public int m4114cu() {
        return 5;
    }

    /* renamed from: db */
    public boolean m4111db() {
        return true;
    }

    /* renamed from: e */
    public void m4109e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4104m());
    }
}
