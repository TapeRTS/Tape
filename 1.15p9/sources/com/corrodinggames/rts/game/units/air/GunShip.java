package com.corrodinggames.rts.game.units.air;

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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class GunShip extends AbstractC0309b {

    /* renamed from: a */
    static BitmapOrTexture f1879a = null;

    /* renamed from: b */
    static BitmapOrTexture f1880b = null;

    /* renamed from: c */
    static BitmapOrTexture f1881c = null;

    /* renamed from: d */
    static BitmapOrTexture f1882d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1883e = new BitmapOrTexture[10];

    /* renamed from: f */
    float f1884f;

    /* renamed from: g */
    Rect f1885g;

    /* renamed from: b */
    public UnitType m5580r() {
        return UnitType.f1747n;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1880b = gameEngine.graphics.loadImage(R.drawable.gunship);
        f1881c = gameEngine.graphics.loadImage(R.drawable.gunship_shadow);
        f1879a = gameEngine.graphics.loadImage(R.drawable.gunship_dead);
        f1883e = Team.createBitmapForTeam(f1880b);
    }

    /* renamed from: d */
    public BitmapOrTexture m5588d() {
        if (this.isDead) {
            return f1879a;
        }
        return f1883e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m5584k() {
        return f1881c;
    }

    /* renamed from: d */
    public BitmapOrTexture m5587d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m5586e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f1879a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public GunShip(boolean z) {
        super(z);
        this.f1884f = 0.0f;
        this.f1885g = new Rect();
        m2884T(25);
        m2883U(35);
        this.radius = 15.0f;
        this.displayRadius = this.radius + 0.0f;
        this.f1632ct = 260.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1880b;
        this.shadowImage = f1881c;
        this.height = 0.0f;
        setDrawLayer(5);
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return true;
    }

    /* renamed from: a */
    public void m5596a(float f) {
        super.update(f);
        if (this.isDead) {
            return;
        }
        this.f1884f += 2.0f * f;
        if (this.f1884f > 360.0f) {
            this.f1884f -= 360.0f;
        }
        this.height = CommonUtils.m2367a(this.height, 20.0f + (CommonUtils.sin(this.f1884f) * 1.5f), 0.1f * f);
    }

    /* renamed from: E */
    public PointF m5597E(int i) {
        float m5585g = m5585g(i);
        float f = this.direction;
        f3980bf.m7213a(this.f6951ek + (CommonUtils.m2249i(f) * m5585g), this.f6952el + (CommonUtils.sin(f) * m5585g));
        return f3980bf;
    }

    /* renamed from: q */
    public float m5581q(int i) {
        return 35.0f;
    }

    /* renamed from: a */
    public void m5595a(Unit unit, int i) {
        PointF m5597E = m5597E(i);
        Projectile createProjectile = Projectile.createProjectile(this, m5597E.x, m5597E.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        createProjectile.directDamage = m5581q(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f997x = 2.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(m5597E.x, m5597E.y, this.height, -1127220);
        gameEngine.effects.m2562a(m5597E.x, m5597E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.audio.m3004a(AudioEngine.f4050u, 0.3f, this.f6951ek, this.f6952el);
    }

    /* renamed from: m */
    public float m5582m() {
        return 140.0f;
    }

    /* renamed from: b */
    public float m5592b(int i) {
        return 40.0f;
    }

    /* renamed from: z */
    public float m5579z() {
        if (this.height < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    /* renamed from: A */
    public float m5602A() {
        return 4.0f;
    }

    /* renamed from: B */
    public float m5601B() {
        return 0.4f;
    }

    /* renamed from: bi */
    public boolean m5591bi() {
        return true;
    }

    /* renamed from: c */
    public float m5589c(int i) {
        return 99.0f;
    }

    /* renamed from: E */
    public boolean m5598E() {
        return false;
    }

    /* renamed from: C */
    public float m5600C() {
        return 0.2f;
    }

    /* renamed from: D */
    public float m5599D() {
        return 0.1f;
    }

    /* renamed from: l */
    public boolean m5583l() {
        return true;
    }

    /* renamed from: af */
    public boolean m5594af() {
        return false;
    }

    /* renamed from: g */
    public float m5585g(int i) {
        return 15.0f;
    }
}
