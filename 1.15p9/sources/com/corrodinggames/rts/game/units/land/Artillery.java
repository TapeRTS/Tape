package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class Artillery extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f3572a = null;

    /* renamed from: b */
    static BitmapOrTexture f3573b = null;

    /* renamed from: c */
    static BitmapOrTexture f3574c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3575d = new BitmapOrTexture[10];

    /* renamed from: b */
    public UnitType m4177r() {
        return UnitType.f1744k;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3572a = gameEngine.graphics.loadImage(R.drawable.artillery2);
        f3573b = gameEngine.graphics.loadImage(R.drawable.artillery1_dead);
        f3575d = Team.createBitmapForTeam(f3572a);
        f3574c = m5884a(f3572a);
    }

    /* renamed from: d */
    public BitmapOrTexture m4185d() {
        if (this.isDead) {
            return f3573b;
        }
        return f3575d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4180k() {
        return f3574c;
    }

    /* renamed from: F */
    public boolean m4197F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m4196G() {
        return 3.0f;
    }

    /* renamed from: H */
    public float m4195H() {
        return 3.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m4184d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m4183e() {
        GameEngine.getInstance();
        this.image = f3573b;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1503c);
        return true;
    }

    public Artillery(boolean z) {
        super(z);
        m2884T(28);
        m2883U(50);
        this.radius = 18.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 140.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3572a;
    }

    /* renamed from: a */
    public void m4194a(float f) {
        super.update(f);
    }

    /* renamed from: a */
    public void m4193a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile m6509a = Projectile.m6509a(this, E.x, E.y);
        PointF K = m3238K(i);
        m6509a.x = K.x;
        m6509a.y = K.y;
        m6509a.lifeTimer = 150.0f;
        m6509a.speed = 4.0f;
        m6509a.f1067aQ = true;
        m6509a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m6509a.f1017R = (short) 2;
        m6509a.f1015P = (short) 1;
        m6509a.f997x = 0.9f;
        PointF m5900a = unit.m5900a(E.x, E.y, m6509a.speed, m6509a.lifeTimer, m4178m());
        m6509a.f1053aC = true;
        m6509a.f986m = true;
        m6509a.f987n = m5900a.x;
        m6509a.f988o = m5900a.y;
        m6509a.f1024Y = 80.0f;
        m6509a.f1025Z = 45.0f;
        m6509a.f1026aa = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m3004a(AudioEngine.f4047r, 0.3f, E.x, E.y);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        C0745e emitLight = gameEngine.effects.emitLight(E.x, E.y, this.height, -1118482);
        if (emitLight != null) {
            emitLight.f4745W = 15.0f;
            emitLight.f4746X = emitLight.f4745W;
        }
    }

    /* renamed from: bV */
    public float m4188bV() {
        if (this.f1648cJ[0].f1715e > 0.0f) {
            return 1.0f - (this.f1648cJ[0].f1715e / m4190b(0));
        }
        return super.m5856bV();
    }

    /* renamed from: m */
    public float m4178m() {
        return 290.0f;
    }

    /* renamed from: b */
    public float m4190b(int i) {
        return 240.0f;
    }

    /* renamed from: z */
    public float m4176z() {
        return 0.9f;
    }

    /* renamed from: A */
    public float m4202A() {
        return 1.7f;
    }

    /* renamed from: B */
    public float m4201B() {
        return 0.05f;
    }

    /* renamed from: c */
    public float m4186c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m4179l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4192af() {
        return false;
    }

    /* renamed from: E */
    public boolean m4198E() {
        return true;
    }

    /* renamed from: g */
    public float m4181g(int i) {
        return 20.0f;
    }

    /* renamed from: C */
    public float m4200C() {
        return 0.05f;
    }

    /* renamed from: D */
    public float m4199D() {
        return 0.12f;
    }

    /* renamed from: e */
    public void m4182e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4178m());
    }

    /* renamed from: bN */
    public float m4189bN() {
        return 14000.0f;
    }
}
