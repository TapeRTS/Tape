package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class heavyHoverTank extends AbstractC0525h {

    /* renamed from: a */
    float f3608a;

    /* renamed from: b */
    static BitmapOrTexture f3609b = null;

    /* renamed from: c */
    static BitmapOrTexture f3610c = null;

    /* renamed from: d */
    static BitmapOrTexture f3611d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3612e = new BitmapOrTexture[10];

    /* renamed from: f */
    Rect f3613f;

    /* renamed from: b */
    public UnitType m4037r() {
        return UnitType.f1757x;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3610c = gameEngine.graphics.loadImage(R.drawable.heavy_hover_tank);
        f3609b = gameEngine.graphics.loadImage(R.drawable.heavy_hover_tank_dead);
        f3611d = gameEngine.graphics.loadImage(R.drawable.heavy_hover_tank_shadow);
        f3612e = Team.createBitmapForTeam(f3610c);
    }

    /* renamed from: d */
    public BitmapOrTexture m4048d() {
        if (this.isDead) {
            return f3609b;
        }
        return f3612e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4041k() {
        return f3611d;
    }

    /* renamed from: d */
    public BitmapOrTexture m4047d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m4045e() {
        GameEngine.getInstance();
        this.image = f3609b;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1503c);
        return true;
    }

    public heavyHoverTank(boolean z) {
        super(z);
        this.f3608a = 0.0f;
        this.f3613f = new Rect();
        m2884T(24);
        m2883U(36);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 450.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3610c;
        this.shadowImage = f3611d;
    }

    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.isDead || !isActive()) {
            return;
        }
        this.f3608a += 3.0f * f;
        if (this.f3608a > 360.0f) {
            this.f3608a -= 360.0f;
        }
        this.height = CommonUtils.m2367a(this.height, 4.0f + (CommonUtils.sin(this.f3608a) * 1.5f), 0.1f * f);
    }

    /* renamed from: q */
    public float m4038q(int i) {
        return 40.0f;
    }

    /* renamed from: a */
    public void m4056a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        createProjectile.directDamage = m4038q(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 95.0f;
        createProjectile.speed = 1.0f;
        createProjectile.f991r = 7.0f;
        createProjectile.f992s = 0.2f;
        createProjectile.f1015P = (short) 7;
        createProjectile.f997x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        C0745e emitLight = gameEngine.effects.emitLight(E.x, E.y, this.height, -56798);
        if (emitLight != null) {
            emitLight.f4728F = 0.7f;
            emitLight.f4745W = 30.0f;
            emitLight.f4746X = emitLight.f4745W;
            C0743c.m2551a(emitLight, this);
        }
        gameEngine.effects.m2549a(createProjectile, -1179648);
        gameEngine.audio.m3004a(AudioEngine.f4055z, 0.3f, E.x, E.y);
    }

    /* renamed from: E */
    public boolean m4057E() {
        return false;
    }

    /* renamed from: m */
    public float m4039m() {
        return 160.0f;
    }

    /* renamed from: b */
    public float m4053b(int i) {
        return 75.0f;
    }

    /* renamed from: z */
    public float m4036z() {
        return 0.7f;
    }

    /* renamed from: A */
    public float m4060A() {
        return 20.0f;
    }

    /* renamed from: i */
    public void m4042i(float f) {
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
    }

    /* renamed from: C */
    public float m4059C() {
        return 0.06f;
    }

    /* renamed from: D */
    public float m4058D() {
        return 0.09f;
    }

    /* renamed from: c */
    public float m4049c(int i) {
        return 2.4f;
    }

    /* renamed from: bi */
    public boolean m4052bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean m4051bj() {
        return true;
    }

    /* renamed from: d */
    public float m4046d(boolean z) {
        return this.f1648cJ[0].f1711a + 90.0f;
    }

    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    /* renamed from: l */
    public boolean m4040l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4055af() {
        return true;
    }

    /* renamed from: g */
    public float m4043g(int i) {
        return 16.0f;
    }

    /* renamed from: e */
    public void m4044e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4039m());
    }
}
