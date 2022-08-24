package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class MissileShip extends AbstractC0590f {

    /* renamed from: a */
    static BitmapOrTexture f3822a = null;

    /* renamed from: b */
    static BitmapOrTexture f3823b = null;

    /* renamed from: c */
    static BitmapOrTexture f3824c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3825d = new BitmapOrTexture[10];

    /* renamed from: e */
    static PointF f3826e = new PointF();

    /* renamed from: f */
    Rect f3827f;

    /* renamed from: b */
    public UnitType m3441r() {
        return UnitType.f1748o;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3823b = gameEngine.graphics.loadImage(R.drawable.scout_ship);
        f3822a = gameEngine.graphics.loadImage(R.drawable.scout_ship_dead);
        f3824c = m5883a(f3823b, f3823b.mo396m(), f3823b.mo397l());
        f3825d = Team.createBitmapForTeam(f3823b);
    }

    /* renamed from: d */
    public BitmapOrTexture m3449d() {
        if (this.isDead) {
            return f3822a;
        }
        return f3825d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3445k() {
        return f3824c;
    }

    /* renamed from: F */
    public boolean m3460F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f;
    }

    /* renamed from: G */
    public float m3459G() {
        return 3.0f;
    }

    /* renamed from: H */
    public float m3458H() {
        return 3.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3448d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3447e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3822a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public MissileShip(boolean z) {
        super(z);
        this.f3827f = new Rect();
        m2884T(17);
        m2883U(31);
        this.radius = 15.0f;
        this.displayRadius = this.radius - 2.0f;
        this.f1632ct = 350.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3823b;
    }

    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    /* renamed from: E */
    public PointF m3461E(int i) {
        float f = this.direction;
        f3826e.m7213a(this.f6951ek + (CommonUtils.m2249i(f) * 6.0f), this.f6952el + (CommonUtils.sin(f) * 6.0f));
        return f3826e;
    }

    /* renamed from: q */
    public float m3442q(int i) {
        return 62.0f;
    }

    /* renamed from: a */
    public void m3457a(Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        PointF m3461E = m3461E(i);
        if (!unit.mo3294Q()) {
            Projectile createProjectile = Projectile.createProjectile(this, m3461E.x, m3461E.y, this.height, i);
            PointF K = m3238K(i);
            createProjectile.x = K.x;
            createProjectile.y = K.y;
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            createProjectile.directDamage = 62.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 190.0f;
            createProjectile.speed = 2.0f;
            createProjectile.f1058aH = true;
            createProjectile.f1063aM = true;
            createProjectile.f1067aQ = true;
            gameEngine.audio.m3004a(AudioEngine.f4042m, 0.8f, this.f6951ek, this.f6952el);
            gameEngine.effects.emitLight(this.f6951ek, this.f6952el, this.height, -1118720);
            gameEngine.effects.m2549a(createProjectile, -1118720);
            return;
        }
        Projectile createProjectile2 = Projectile.createProjectile(this, m3461E.x, m3461E.y, this.height - 1.0f, i);
        createProjectile2.color = Color.argb(255, 0, 0, 150);
        createProjectile2.f997x = 1.0f;
        createProjectile2.directDamage = 42.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 220.0f;
        createProjectile2.speed = 1.9f;
        createProjectile2.f1063aM = true;
        createProjectile2.f1067aQ = true;
        gameEngine.audio.m3004a(AudioEngine.f4042m, 0.8f, this.f6951ek, this.f6952el);
        gameEngine.effects.emitLight(this.f6951ek, this.f6952el, this.height, -1118720);
    }

    /* renamed from: m */
    public float m3443m() {
        return 200.0f;
    }

    /* renamed from: b */
    public float m3454b(int i) {
        return 170.0f;
    }

    /* renamed from: z */
    public float m3440z() {
        return 1.2f;
    }

    /* renamed from: bc */
    public float m3453bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m3465A() {
        return 1.9f;
    }

    /* renamed from: B */
    public float m3464B() {
        return 0.2f;
    }

    /* renamed from: c */
    public float m3450c(int i) {
        return 99.0f;
    }

    /* renamed from: C */
    public float m3463C() {
        return 0.05f;
    }

    /* renamed from: D */
    public float m3462D() {
        return 0.1f;
    }

    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    /* renamed from: l */
    public boolean m3444l() {
        return true;
    }

    /* renamed from: ae */
    public boolean m3456ae() {
        return true;
    }

    /* renamed from: e */
    public void m3446e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m3443m());
    }
}
