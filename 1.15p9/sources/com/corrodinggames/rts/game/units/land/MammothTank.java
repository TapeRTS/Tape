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
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class MammothTank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3654a = null;

    /* renamed from: b */
    static BitmapOrTexture f3655b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3656c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture f3657d = null;

    /* renamed from: e */
    public static BitmapOrTexture f3658e = null;

    /* renamed from: f */
    int f3659f;

    /* renamed from: g */
    float f3660g;

    /* renamed from: h */
    Rect f3661h;

    /* renamed from: b */
    public UnitType m3884r() {
        return UnitType.f1764E;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.mammoth_tank);
        f3656c = Team.createBitmapForTeam(loadImage);
        f3654a = gameEngine.graphics.loadImage(R.drawable.mammoth_tank_dead);
        f3655b = gameEngine.graphics.loadImage(R.drawable.mammoth_tank_turret);
        f3658e = gameEngine.graphics.loadImage(R.drawable.lighting_charge);
        f3657d = m5883a(loadImage, loadImage.mo396m() / 2, loadImage.mo397l());
    }

    /* renamed from: d */
    public BitmapOrTexture m3892d() {
        if (this.isDead) {
            return f3654a;
        }
        return f3656c[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3887k() {
        return f3657d;
    }

    /* renamed from: d */
    public BitmapOrTexture m3891d(int i) {
        return f3655b;
    }

    /* renamed from: F */
    public boolean m3906F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f && !this.isDead;
    }

    /* renamed from: G */
    public float m3905G() {
        return 3.0f;
    }

    /* renamed from: H */
    public float m3904H() {
        return 3.0f;
    }

    /* renamed from: e */
    public boolean m3890e() {
        GameEngine.getInstance();
        this.image = f3654a;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1505e);
        return true;
    }

    public MammothTank(boolean z) {
        super(z);
        this.f3661h = new Rect();
        m2879a(f3656c[7], 2);
        this.radius = 21.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 2900.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3656c[7];
    }

    /* renamed from: a */
    public void m3903a(float f) {
        super.update(f);
        if (this.f1647cI) {
            this.f3660g += f;
            if (this.f3660g > 3.0f) {
                this.f3660g = 0.0f;
                this.f3659f = 1 - this.f3659f;
            }
        }
    }

    /* renamed from: bN */
    public float m3897bN() {
        return 14000.0f;
    }

    /* renamed from: a */
    public void m3902a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        m6509a.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m6509a.directDamage = 260.0f;
        m6509a.target = unit;
        m6509a.lifeTimer = 20.0f;
        m6509a.speed = 4.0f;
        m6509a.f997x = 2.0f;
        m6509a.f1067aQ = true;
        m6509a.f1000A = true;
        m6509a.f1012M = true;
        m6509a.f1034ai = 0.5f;
        m6509a.f1036ak = 1.0f;
        m6509a.f1037al = 0.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118482);
        gameEngine.audio.m3004a(AudioEngine.f4053x, 0.2f, this.f6951ek, this.f6952el);
    }

    /* renamed from: m */
    public float m3885m() {
        return 210.0f;
    }

    /* renamed from: b */
    public float m3898b(int i) {
        return 140.0f;
    }

    /* renamed from: z */
    public float m3882z() {
        return 0.5f;
    }

    /* renamed from: bc */
    public float m3896bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float m3910A() {
        return 1.0f;
    }

    /* renamed from: B */
    public float m3909B() {
        return 0.5f;
    }

    /* renamed from: w */
    public float m3883w(int i) {
        return 0.08f;
    }

    /* renamed from: c */
    public float m3893c(int i) {
        return 2.5f;
    }

    /* renamed from: C */
    public float m3908C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float m3907D() {
        return 0.08f;
    }

    /* renamed from: a_ */
    public Rect m3901a_(boolean z) {
        if (this.isDead && !z) {
            return super.m5876a_(z);
        }
        return super.m5880a(z, this.f3659f);
    }

    /* renamed from: c */
    public boolean m3894c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        C1117y.m485a(this, f3658e, this.f1648cJ[0].f1716f / m3889e(0), 0);
        return true;
    }

    /* renamed from: l */
    public boolean m3886l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3900af() {
        return true;
    }

    /* renamed from: g */
    public float m3888g(int i) {
        return 22.0f;
    }

    /* renamed from: e */
    public float m3889e(int i) {
        return 60.0f;
    }
}
