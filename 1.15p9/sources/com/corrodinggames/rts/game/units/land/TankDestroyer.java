package com.corrodinggames.rts.game.units.land;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class TankDestroyer extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3676a = null;

    /* renamed from: b */
    static BitmapOrTexture f3677b = null;

    /* renamed from: c */
    static BitmapOrTexture f3678c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3679d = new BitmapOrTexture[10];

    /* renamed from: e */
    Rect f3680e;

    /* renamed from: b */
    public UnitType m3816r() {
        return UnitType.f1755v;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3677b = gameEngine.graphics.loadImage(R.drawable.tank2);
        f3676a = gameEngine.graphics.loadImage(R.drawable.tank2_dead);
        f3678c = gameEngine.graphics.loadImage(R.drawable.tank2_turret);
        f3679d = Team.createBitmapForTeam(f3677b);
    }

    /* renamed from: d */
    public BitmapOrTexture m3823d() {
        if (this.isDead) {
            return f3676a;
        }
        return f3679d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3819k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3822d(int i) {
        return f3678c;
    }

    /* renamed from: e */
    public boolean m3821e() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3676a;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4044o, 0.8f, this.f6951ek, this.f6952el);
        m3088bq();
        return true;
    }

    public TankDestroyer(boolean z) {
        super(z);
        this.f3680e = new Rect();
        m2884T(16);
        m2883U(30);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 350.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3677b;
    }

    /* renamed from: a */
    public void m3831a(float f) {
        super.update(f);
    }

    /* renamed from: a */
    public void m3830a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        m6509a.directDamage = 35.0f;
        m6509a.target = unit;
        m6509a.lifeTimer = 60.0f;
        m6509a.speed = 3.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.audio.m3004a(AudioEngine.f4046q, 0.3f, E.x, E.y);
    }

    /* renamed from: m */
    public float m3817m() {
        return 150.0f;
    }

    /* renamed from: b */
    public float m3827b(int i) {
        return 70.0f;
    }

    /* renamed from: z */
    public float m3815z() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m3834A() {
        return 1.9f;
    }

    /* renamed from: c */
    public float m3824c(int i) {
        return 3.0f;
    }

    /* renamed from: c */
    public boolean m3825c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public float m3833C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float m3832D() {
        return 0.12f;
    }

    /* renamed from: l */
    public boolean m3818l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3829af() {
        return false;
    }

    /* renamed from: g */
    public float m3820g(int i) {
        return 10.0f;
    }
}
