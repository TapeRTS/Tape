package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class LaserTank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3647a = null;

    /* renamed from: b */
    static BitmapOrTexture f3648b = null;

    /* renamed from: c */
    static BitmapOrTexture f3649c = null;

    /* renamed from: d */
    static BitmapOrTexture f3650d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3651e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3652f = null;

    /* renamed from: g */
    Rect f3653g;

    /* renamed from: b */
    public UnitType m3912r() {
        return UnitType.f1751r;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3648b = gameEngine.graphics.loadImage(R.drawable.laser_tank_base);
        f3647a = gameEngine.graphics.loadImage(R.drawable.laser_tank_dead);
        f3649c = gameEngine.graphics.loadImage(R.drawable.laser_tank_turrent);
        f3650d = gameEngine.graphics.loadImage(R.drawable.laser_tank_charge);
        f3651e = Team.createBitmapForTeam(f3648b);
        f3652f = m5883a(f3648b, f3648b.mo396m(), f3648b.mo397l());
    }

    /* renamed from: d */
    public BitmapOrTexture m3921d() {
        if (this.isDead) {
            return f3647a;
        }
        return f3651e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3916k() {
        return f3652f;
    }

    /* renamed from: F */
    public boolean m3934F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m3933G() {
        return 2.0f;
    }

    /* renamed from: H */
    public float m3932H() {
        return 2.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3920d(int i) {
        return f3649c;
    }

    /* renamed from: e */
    public boolean m3919e() {
        GameEngine.getInstance();
        this.image = f3647a;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1502b);
        return true;
    }

    public LaserTank(boolean z) {
        super(z);
        this.f3653g = new Rect();
        m2879a(f3648b, 1);
        this.radius = 14.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 300.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3648b;
    }

    /* renamed from: a */
    public void m3931a(float f) {
        super.update(f);
    }

    /* renamed from: q */
    public float m3913q(int i) {
        return 450.0f;
    }

    /* renamed from: a */
    public void m3930a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        m6509a.directDamage = m3913q(i);
        m6509a.target = unit;
        m6509a.lifeTimer = 8.0f;
        m6509a.f1001B = true;
        m6509a.f1000A = true;
        m6509a.f1067aQ = true;
        m6509a.color = Color.argb(80, 255, 0, 0);
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.audio.m3004a(AudioEngine.f4054y, 0.3f, E.x, E.y);
    }

    /* renamed from: bV */
    public float m3926bV() {
        if (this.f1648cJ[0].f1715e > 0.0f) {
            return 1.0f - (this.f1648cJ[0].f1715e / m3927b(0));
        }
        if (this.f1648cJ[0].f1716f != 0.0f) {
            return this.f1648cJ[0].f1716f / m3918e(0);
        }
        return super.m5856bV();
    }

    /* renamed from: bW */
    public boolean m3925bW() {
        return this.f1648cJ[0].f1715e > 0.0f;
    }

    /* renamed from: m */
    public float m3914m() {
        return 190.0f;
    }

    /* renamed from: b */
    public float m3927b(int i) {
        return 450.0f;
    }

    /* renamed from: e */
    public float m3918e(int i) {
        return 80.0f;
    }

    /* renamed from: z */
    public float m3911z() {
        return 0.7f;
    }

    /* renamed from: A */
    public float m3938A() {
        return 1.5f;
    }

    /* renamed from: B */
    public float m3937B() {
        return 0.1f;
    }

    /* renamed from: c */
    public float m3922c(int i) {
        return 3.0f;
    }

    /* renamed from: c */
    public boolean m3923c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C1117y.m487a((AbstractC0623y) this);
        if (!this.isDead) {
            float m3918e = this.f1648cJ[0].f1716f / m3918e(0);
            if (m3918e != 0.0f) {
                PointF E = getTurretEnd(0);
                gameEngine.graphics.mo880i();
                gameEngine.graphics.mo896b(E.x - gameEngine.f6138cv, E.y - gameEngine.f6139cw);
                gameEngine.graphics.mo935a(m3918e, m3918e);
                gameEngine.graphics.mo915a(f3650d, 0.0f, 0.0f, (Paint) null);
                gameEngine.graphics.mo879j();
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: C */
    public float m3936C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float m3935D() {
        return 0.12f;
    }

    /* renamed from: l */
    public boolean m3915l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3929af() {
        return true;
    }

    /* renamed from: g */
    public float m3917g(int i) {
        return 19.0f;
    }
}
