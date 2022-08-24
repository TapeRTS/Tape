package com.corrodinggames.rts.game.units.land;

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

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class Tank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3667a = null;

    /* renamed from: b */
    static BitmapOrTexture f3668b = null;

    /* renamed from: c */
    static BitmapOrTexture f3669c = null;

    /* renamed from: d */
    static BitmapOrTexture f3670d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3671e = new BitmapOrTexture[10];

    /* renamed from: f */
    int f3672f;

    /* renamed from: g */
    float f3673g;

    /* renamed from: h */
    float f3674h;

    /* renamed from: i */
    Rect f3675i;

    /* renamed from: b */
    public UnitType m3836r() {
        return UnitType.f1742i;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3668b = gameEngine.graphics.loadImage(R.drawable.tank2);
        f3667a = gameEngine.graphics.loadImage(R.drawable.tank2_dead);
        f3669c = gameEngine.graphics.loadImage(R.drawable.tank2_turret);
        f3670d = gameEngine.graphics.loadImage(R.drawable.tank2_shadow);
        f3671e = Team.createBitmapForTeam(f3668b);
    }

    /* renamed from: d */
    public BitmapOrTexture m3844d() {
        if (this.isDead) {
            return f3667a;
        }
        return f3671e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3839k() {
        return f3670d;
    }

    /* renamed from: F */
    public boolean m3856F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m3855G() {
        return 3.0f;
    }

    /* renamed from: H */
    public float m3854H() {
        return 3.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3843d(int i) {
        return f3669c;
    }

    /* renamed from: e */
    public boolean m3842e() {
        this.image = f3667a;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1502b);
        return true;
    }

    public Tank(boolean z) {
        super(z);
        this.f3675i = new Rect();
        m2879a(f3668b, 3);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 210.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3668b;
    }

    /* renamed from: a */
    public void m3853a(float f) {
        super.update(f);
        if (!this.isDead && this.f1616cd != 0.0f) {
            this.f3673g += f;
            if (this.f3673g > 1.0f) {
                this.f3673g = 0.0f;
                this.f3672f++;
                if (this.f3672f > 2) {
                    this.f3672f = 0;
                }
            }
            if (this.f1616cd > 0.0f && this.f6948eh) {
                this.f3674h += f;
                if (this.f3674h > 9.0f) {
                    this.f3674h = 0.0f;
                    m3841f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m3841f() {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            gameEngine.effects.m2534c(this.f6951ek + (CommonUtils.m2249i(this.direction + 180.0f + f) * this.radius), this.f6952el + (CommonUtils.sin(this.direction + 180.0f + f) * this.radius), this.height, this.direction + 180.0f, 0);
            i++;
        }
    }

    /* renamed from: a */
    public void m3852a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        PointF K = m3238K(i);
        m6509a.x = K.x;
        m6509a.y = K.y;
        m6509a.directDamage = 30.0f;
        m6509a.target = unit;
        m6509a.lifeTimer = 60.0f;
        m6509a.speed = 3.0f;
        m6509a.f1015P = (short) 1;
        m6509a.f997x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.audio.m3003a(AudioEngine.f4046q, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), E.x, E.y);
    }

    /* renamed from: m */
    public float m3837m() {
        return 130.0f;
    }

    /* renamed from: b */
    public float m3848b(int i) {
        return 75.0f;
    }

    /* renamed from: z */
    public float m3835z() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m3860A() {
        return 4.1f;
    }

    /* renamed from: c */
    public float m3845c(int i) {
        return 4.0f;
    }

    /* renamed from: B */
    public float m3859B() {
        return 0.25f;
    }

    /* renamed from: c */
    public boolean m3846c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        if (!this.isDead) {
        }
        return true;
    }

    /* renamed from: C */
    public float m3858C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float m3857D() {
        return 0.17f;
    }

    /* renamed from: l */
    public boolean m3838l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3850af() {
        return false;
    }

    /* renamed from: g */
    public float m3840g(int i) {
        return 20.0f;
    }

    /* renamed from: a_ */
    public Rect m3851a_(boolean z) {
        if (z) {
            return super.m5876a_(z);
        }
        if (this.isDead) {
            return super.m5876a_(z);
        }
        return super.m5880a(z, this.f3672f);
    }
}
