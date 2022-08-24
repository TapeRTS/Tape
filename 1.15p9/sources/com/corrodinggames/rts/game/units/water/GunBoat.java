package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/c.class */
public class GunBoat extends AbstractC0590f {

    /* renamed from: a */
    static BitmapOrTexture f3817a = null;

    /* renamed from: b */
    static BitmapOrTexture f3818b = null;

    /* renamed from: c */
    static BitmapOrTexture f3819c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3820d = new BitmapOrTexture[10];

    /* renamed from: e */
    Rect f3821e;

    /* renamed from: b */
    public UnitType m3467r() {
        return UnitType.f1749p;
    }

    /* renamed from: bN */
    public float m3478bN() {
        return 1500.0f;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3818b = gameEngine.graphics.loadImage(R.drawable.gun_boat);
        f3817a = gameEngine.graphics.loadImage(R.drawable.gun_boat_dead);
        f3819c = m5883a(f3818b, f3818b.mo396m(), f3818b.mo397l());
        f3820d = Team.createBitmapForTeam(f3818b);
    }

    /* renamed from: d */
    public BitmapOrTexture m3474d() {
        if (this.isDead) {
            return f3817a;
        }
        return f3820d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3471k() {
        return f3819c;
    }

    /* renamed from: F */
    public boolean m3486F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f;
    }

    /* renamed from: G */
    public float m3485G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float m3484H() {
        return 1.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3473d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3472e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3817a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public GunBoat(boolean z) {
        super(z);
        this.f3821e = new Rect();
        m2884T(15);
        m2883U(27);
        this.radius = 12.0f;
        this.displayRadius = this.radius - 2.0f;
        this.f1632ct = 170.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3818b;
    }

    /* renamed from: a */
    public void m3483a(float f) {
        super.update(f);
    }

    /* renamed from: q */
    public float m3468q(int i) {
        return 12.0f;
    }

    /* renamed from: a */
    public void m3482a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        PointF K = m3238K(i);
        m6509a.x = K.x;
        m6509a.y = K.y;
        m6509a.height = this.height;
        m6509a.directDamage = m3468q(i);
        m6509a.target = unit;
        m6509a.lifeTimer = 30.0f;
        m6509a.speed = 8.0f;
        m6509a.f1018S = false;
        m6509a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m3004a(AudioEngine.f4048s, 0.2f, E.x, E.y);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118720);
    }

    /* renamed from: m */
    public float m3469m() {
        return 120.0f;
    }

    /* renamed from: b */
    public float m3479b(int i) {
        return 60.0f;
    }

    /* renamed from: z */
    public float m3466z() {
        return 1.5f;
    }

    /* renamed from: A */
    public float m3490A() {
        return 2.8f;
    }

    /* renamed from: B */
    public float m3489B() {
        return 0.35f;
    }

    /* renamed from: c */
    public float m3475c(int i) {
        return 99.0f;
    }

    /* renamed from: C */
    public float m3488C() {
        return 0.06f;
    }

    /* renamed from: D */
    public float m3487D() {
        return 0.2f;
    }

    /* renamed from: c */
    public boolean m3476c(float f) {
        return super.draw(f);
    }

    /* renamed from: l */
    public boolean m3470l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3481af() {
        return false;
    }
}
