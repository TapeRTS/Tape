package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class MegaTank extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3662a = null;

    /* renamed from: b */
    static BitmapOrTexture f3663b = null;

    /* renamed from: c */
    static BitmapOrTexture f3664c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3665d = new BitmapOrTexture[10];

    /* renamed from: e */
    Rect f3666e;

    /* renamed from: b */
    public UnitType m3862r() {
        return UnitType.f1750q;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3663b = gameEngine.graphics.loadImage(R.drawable.mega_tank);
        f3662a = gameEngine.graphics.loadImage(R.drawable.mega_tank_dead);
        f3664c = gameEngine.graphics.loadImage(R.drawable.mega_tank_turret);
        f3665d = Team.createBitmapForTeam(f3663b);
    }

    /* renamed from: d */
    public BitmapOrTexture m3869d() {
        if (this.isDead) {
            return f3662a;
        }
        return f3665d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3865k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3868d(int i) {
        return f3664c;
    }

    /* renamed from: e */
    public boolean m3867e() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3662a;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4044o, 0.8f, this.f6951ek, this.f6952el);
        m3088bq();
        return true;
    }

    public MegaTank(boolean z) {
        super(z);
        this.f3666e = new Rect();
        m2884T(20);
        m2883U(25);
        this.radius = 12.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 550.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3663b;
    }

    /* renamed from: a */
    public void m3878a(float f) {
        super.update(f);
    }

    /* renamed from: bN */
    public float m3873bN() {
        return 7000.0f;
    }

    /* renamed from: a */
    public void m3877a(Unit unit, int i) {
        if (!unit.mo3293i()) {
            PointF E = getTurretEnd(i);
            Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
            m6509a.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m6509a.directDamage = 50.0f;
            m6509a.target = unit;
            m6509a.lifeTimer = 60.0f;
            m6509a.speed = 3.0f;
            m6509a.f997x = 2.0f;
            m6509a.f1067aQ = true;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
            gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
            gameEngine.audio.m3004a(AudioEngine.f4050u, 0.3f, this.f6951ek, this.f6952el);
            return;
        }
        Projectile m6509a2 = Projectile.m6509a(this, this.f6951ek, this.f6952el);
        m6509a2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m6509a2.directDamage = 40.0f;
        m6509a2.target = unit;
        m6509a2.lifeTimer = 190.0f;
        m6509a2.speed = 4.0f;
        m6509a2.f1058aH = true;
        m6509a2.f1059aI = 10.0f;
        m6509a2.f1060aJ = 15.0f;
        m6509a2.f1063aM = true;
        m6509a2.f1067aQ = true;
        GameEngine.getInstance().audio.m3004a(AudioEngine.f4042m, 0.2f, this.f6951ek, this.f6952el);
    }

    /* renamed from: m */
    public float m3863m() {
        return 140.0f;
    }

    /* renamed from: b */
    public float m3874b(int i) {
        return 70.0f;
    }

    /* renamed from: z */
    public float m3861z() {
        return 0.8f;
    }

    /* renamed from: A */
    public float m3881A() {
        return 1.2f;
    }

    /* renamed from: c */
    public float m3870c(int i) {
        return 2.0f;
    }

    /* renamed from: C */
    public float m3880C() {
        return 0.05f;
    }

    /* renamed from: D */
    public float m3879D() {
        return 0.1f;
    }

    /* renamed from: c */
    public boolean m3871c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    /* renamed from: l */
    public boolean m3864l() {
        return true;
    }

    /* renamed from: af */
    public boolean m3876af() {
        return true;
    }

    /* renamed from: g */
    public float m3866g(int i) {
        return 12.0f;
    }
}
