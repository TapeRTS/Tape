package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class HeavyTank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3614a = null;

    /* renamed from: b */
    static BitmapOrTexture f3615b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3616c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture f3617d = null;

    /* renamed from: e */
    int f3618e;

    /* renamed from: f */
    float f3619f;

    /* renamed from: g */
    float f3620g;

    /* renamed from: h */
    Rect f3621h;

    /* renamed from: b */
    public UnitType m4004r() {
        return UnitType.f1756w;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.heavy_tank);
        f3616c = Team.createBitmapForTeam(loadImage);
        f3614a = gameEngine.graphics.loadImage(R.drawable.heavy_tank_dead);
        f3615b = gameEngine.graphics.loadImage(R.drawable.heavy_tank_turret);
        f3617d = m5883a(loadImage, loadImage.mo396m() / 3, loadImage.mo397l());
    }

    /* renamed from: d */
    public BitmapOrTexture m4014d() {
        if (this.isDead) {
            return f3614a;
        }
        return f3616c[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4008k() {
        return f3617d;
    }

    /* renamed from: d */
    public BitmapOrTexture m4013d(int i) {
        return f3615b;
    }

    /* renamed from: F */
    public boolean m4031F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead && this.f1623ck >= 1.0f && !this.f1627co;
    }

    /* renamed from: G */
    public float m4030G() {
        return 2.0f;
    }

    /* renamed from: H */
    public float m4029H() {
        return 2.0f;
    }

    /* renamed from: e */
    public boolean m4012e() {
        this.image = f3614a;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1503c);
        return true;
    }

    public HeavyTank(boolean z) {
        super(z);
        this.f3621h = new Rect();
        m2879a(f3616c[7], 3);
        this.radius = 15.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 600.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3616c[7];
    }

    /* renamed from: a */
    public void m4025a(float f) {
        super.update(f);
        if (!this.isDead && this.f1616cd != 0.0f) {
            this.f3619f += f;
            if (this.f3619f > 1.4d) {
                this.f3619f = 0.0f;
                this.f3618e++;
                if (this.f3618e > 2) {
                    this.f3618e = 0;
                }
            }
            if (this.f6948eh) {
                this.f3620g += f;
                if (this.f3620g > 9.0f) {
                    this.f3620g = 0.0f;
                    m4010f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m4010f() {
        GameEngine gameEngine = GameEngine.getInstance();
        float f = this.direction;
        if (this.f1616cd < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            gameEngine.effects.m2534c(this.f6951ek + (CommonUtils.m2249i(f + 180.0f + f2) * this.radius), this.f6952el + (CommonUtils.sin(f + 180.0f + f2) * this.radius), this.height, f + 180.0f, 0);
            i++;
        }
    }

    /* renamed from: bN */
    public float m4019bN() {
        return 7000.0f;
    }

    /* renamed from: q */
    public float m4005q(int i) {
        return 50.0f;
    }

    /* renamed from: a */
    public void m4024a(Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!unit.mo3293i()) {
            PointF E = getTurretEnd(i);
            Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
            PointF K = m3238K(i);
            m6509a.x = K.x;
            m6509a.y = K.y;
            m6509a.color = Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m6509a.directDamage = m4005q(i);
            m6509a.target = unit;
            m6509a.lifeTimer = 60.0f;
            m6509a.speed = 4.0f;
            m6509a.f997x = 2.0f;
            m6509a.f1067aQ = true;
            m6509a.f999z = true;
            gameEngine.effects.m2549a(m6509a, -16716288);
            gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
            gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
            gameEngine.audio.m3004a(AudioEngine.f4050u, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        PointF E2 = getTurretEnd(i);
        E2.m7213a(this.f6951ek, this.f6952el);
        Projectile m6509a2 = Projectile.m6509a(this, this.f6951ek, this.f6952el);
        m6509a2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m6509a2.directDamage = m4005q(i);
        m6509a2.target = unit;
        m6509a2.lifeTimer = 190.0f;
        m6509a2.speed = 0.5f;
        m6509a2.f991r = 5.0f;
        m6509a2.f1058aH = true;
        m6509a2.f1059aI = 10.0f;
        m6509a2.f1060aJ = 15.0f;
        m6509a2.f1063aM = true;
        m6509a2.f1067aQ = true;
        m6509a2.f1057aG = true;
        gameEngine.audio.m3004a(AudioEngine.f4042m, 0.2f, this.f6951ek, this.f6952el);
        gameEngine.effects.m2549a(m6509a2, -1118720);
        gameEngine.effects.emitLight(E2.x, E2.y, this.height, -1127220);
    }

    /* renamed from: m */
    public float m4006m() {
        return 160.0f;
    }

    /* renamed from: b */
    public float m4020b(int i) {
        return 70.0f;
    }

    /* renamed from: z */
    public float m4002z() {
        return 0.8f;
    }

    /* renamed from: bc */
    public float m4018bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m4035A() {
        return 1.9f;
    }

    /* renamed from: B */
    public float m4034B() {
        return 0.2f;
    }

    /* renamed from: w */
    public float m4003w(int i) {
        return 0.12f;
    }

    /* renamed from: c */
    public float m4015c(int i) {
        return 3.0f;
    }

    /* renamed from: C */
    public float m4033C() {
        return 0.05f;
    }

    /* renamed from: D */
    public float m4032D() {
        return 0.1f;
    }

    /* renamed from: c */
    public boolean m4016c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    /* renamed from: l */
    public boolean m4007l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4022af() {
        return true;
    }

    /* renamed from: g */
    public float m4009g(int i) {
        return 21.0f;
    }

    /* renamed from: a_ */
    public Rect m4023a_(boolean z) {
        if (z) {
            return super.m5876a_(z);
        }
        if (this.isDead) {
            return super.m5876a_(z);
        }
        return super.m5880a(z, this.f3618e);
    }

    /* renamed from: H */
    public float m4028H(int i) {
        return -2.0f;
    }

    /* renamed from: I */
    public float m4027I(int i) {
        return 4.0f;
    }

    /* renamed from: J */
    public float m4026J(int i) {
        return 12.0f;
    }

    /* renamed from: e */
    public void m4011e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4006m());
    }
}
