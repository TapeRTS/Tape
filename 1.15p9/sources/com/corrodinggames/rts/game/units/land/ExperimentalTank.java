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

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class ExperimentalTank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3601a = null;

    /* renamed from: b */
    static BitmapOrTexture f3602b = null;

    /* renamed from: c */
    static BitmapOrTexture f3603c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3604d = new BitmapOrTexture[10];

    /* renamed from: e */
    int f3605e;

    /* renamed from: f */
    float f3606f;

    /* renamed from: g */
    Rect f3607g;

    /* renamed from: b */
    public UnitType m4063r() {
        return UnitType.f1765F;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.experimental_tank);
        f3604d = Team.createBitmapForTeam(loadImage);
        f3601a = gameEngine.graphics.loadImage(R.drawable.experimental_tank_dead);
        f3602b = gameEngine.graphics.loadImage(R.drawable.experimental_tank_turret);
        f3603c = m5883a(loadImage, loadImage.mo396m() / 2, loadImage.mo397l());
    }

    /* renamed from: d */
    public BitmapOrTexture m4073d() {
        if (this.isDead) {
            return f3601a;
        }
        return f3604d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4066k() {
        return f3603c;
    }

    /* renamed from: F */
    public boolean m4096F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f && this.f1623ck >= 1.0f;
    }

    /* renamed from: G */
    public float m4095G() {
        return 4.0f;
    }

    /* renamed from: H */
    public float m4093H() {
        return 4.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m4072d(int i) {
        if (m4089R(i)) {
            return null;
        }
        return f3602b;
    }

    /* renamed from: e */
    public boolean m4070e() {
        GameEngine.getInstance();
        m3206a(EnumC0233ab.f1505e);
        this.image = f3601a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public ExperimentalTank(boolean z) {
        super(z);
        this.f3607g = new Rect();
        m2879a(f3604d[7], 2);
        this.radius = 37.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 6000.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3604d[7];
    }

    /* renamed from: a */
    public void m4088a(float f) {
        super.update(f);
        if (!this.isDead) {
            if (this.f1622cj != 0.0f) {
                setDrawLayer(2);
            } else {
                setDrawLayer(4);
            }
        }
        if (this.f1647cI) {
            this.f3606f += f;
            if (this.f3606f > 5.0f) {
                this.f3606f = 0.0f;
                this.f3605e = 1 - this.f3605e;
            }
        }
    }

    /* renamed from: bN */
    public float m4081bN() {
        return 80000.0f;
    }

    /* renamed from: a */
    public void m4086a(Unit unit, int i) {
        if (!m4089R(i)) {
            PointF E = getTurretEnd(i);
            Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
            PointF K = m3238K(i);
            m6509a.x = K.x;
            m6509a.y = K.y;
            m6509a.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            m6509a.lifeTimer = 120.0f;
            m6509a.speed = 5.0f;
            m6509a.target = unit;
            m6509a.f1024Y = 60.0f;
            m6509a.directDamage = 40.0f;
            m6509a.f1025Z = 45.0f;
            m6509a.f1026aa = true;
            m6509a.f997x = 2.0f;
            m6509a.f1067aQ = true;
            m6509a.f1015P = (short) 9;
            m6509a.f997x = 1.0f;
            m6509a.f6949ei = this.f6949ei;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.effects.emitLight(E.x, E.y, this.height, 16745216);
            gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
            gameEngine.effects.m2549a(m6509a, -1127220);
            gameEngine.audio.m3004a(AudioEngine.f4051v, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        PointF E2 = getTurretEnd(i);
        E2.m7213a(this.f6951ek, this.f6952el);
        Projectile m6509a2 = Projectile.m6509a(this, this.f6951ek, this.f6952el);
        m6509a2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m6509a2.directDamage = 60.0f;
        m6509a2.target = unit;
        m6509a2.lifeTimer = 190.0f;
        m6509a2.speed = 3.0f;
        m6509a2.f991r = 6.0f;
        m6509a2.f1058aH = true;
        m6509a2.f1059aI = 10.0f;
        m6509a2.f1060aJ = 15.0f;
        m6509a2.f1063aM = true;
        m6509a2.f1067aQ = true;
        m6509a2.f1057aG = true;
        m6509a2.f6949ei = this.f6949ei;
        GameEngine gameEngine2 = GameEngine.getInstance();
        gameEngine2.audio.m3004a(AudioEngine.f4042m, 0.2f, this.f6951ek, this.f6952el);
        gameEngine2.effects.m2549a(m6509a2, -1118720);
        gameEngine2.effects.emitLight(E2.x, E2.y, this.height, -1127220);
    }

    /* renamed from: a */
    public boolean m4087a(int i, Unit unit, boolean z, boolean z2) {
        if (!z && z2 && !m3054h(unit)) {
            return false;
        }
        if (m4089R(i)) {
            if (!unit.mo3293i()) {
                return false;
            }
            return true;
        } else if (unit.mo3293i()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public float m4064m() {
        return 310.0f;
    }

    /* renamed from: b */
    public float m4082b(int i) {
        if (m4089R(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    /* renamed from: e */
    public float m4068e(int i) {
        if (m4089R(i)) {
            i -= 4;
        }
        return i * 20;
    }

    /* renamed from: z */
    public float m4061z() {
        return 0.4f;
    }

    /* renamed from: bc */
    public float m4080bc() {
        return 1.0f;
    }

    /* renamed from: bh */
    public int m4079bh() {
        return 1;
    }

    /* renamed from: A */
    public float m4100A() {
        return 0.8f;
    }

    /* renamed from: B */
    public float m4099B() {
        return 0.04f;
    }

    /* renamed from: w */
    public float m4062w(int i) {
        if (m4089R(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    /* renamed from: c */
    public float m4075c(int i) {
        if (m4089R(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    /* renamed from: C */
    public float m4098C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float m4097D() {
        return 0.08f;
    }

    /* renamed from: a_ */
    public Rect m4085a_(boolean z) {
        if (this.isDead && !z) {
            return super.m5876a_(z);
        }
        if (z) {
            return super.m5876a_(z);
        }
        int i = 0 + (this.f3605e * this.f4223eo);
        this.f3607g.m7208a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f3607g;
    }

    /* renamed from: c */
    public boolean m4076c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    /* renamed from: l */
    public boolean m4065l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4084af() {
        return true;
    }

    /* renamed from: g */
    public float m4067g(int i) {
        return 20.0f;
    }

    /* renamed from: G */
    public PointF m4094G(int i) {
        PointF G = super.mo3523G(i);
        float f = G.x;
        float f2 = G.y;
        if (!m4089R(i)) {
            if (i <= 1) {
                f += CommonUtils.m2249i(this.direction) * 5.0f;
                f2 += CommonUtils.sin(this.direction) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += CommonUtils.m2249i(this.direction + f3) * 18.0f;
            f2 += CommonUtils.sin(this.direction + f3) * 18.0f;
        }
        f3981bg.m7213a(f, f2);
        return f3981bg;
    }

    /* renamed from: R */
    public boolean m4089R(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: bl */
    public int m4078bl() {
        return 6;
    }

    /* renamed from: e */
    public void m4069e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4064m());
    }

    /* renamed from: cu */
    public int m4074cu() {
        return 5;
    }

    /* renamed from: db */
    public boolean m4071db() {
        return true;
    }

    /* renamed from: H */
    public float m4092H(int i) {
        return -2.0f;
    }

    /* renamed from: I */
    public float m4091I(int i) {
        return 4.0f;
    }

    /* renamed from: J */
    public float m4090J(int i) {
        return 12.0f;
    }
}
