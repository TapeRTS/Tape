package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.Paint;
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
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class Helicopter extends AbstractC0309b {

    /* renamed from: a */
    static BitmapOrTexture f1886a = null;

    /* renamed from: b */
    static BitmapOrTexture f1887b = null;

    /* renamed from: c */
    static BitmapOrTexture f1888c = null;

    /* renamed from: d */
    static BitmapOrTexture f1889d = null;

    /* renamed from: e */
    static BitmapOrTexture f1890e = null;

    /* renamed from: f */
    static BitmapOrTexture[] f1891f = new BitmapOrTexture[10];

    /* renamed from: g */
    boolean f1892g;

    /* renamed from: o */
    float f1893o;

    /* renamed from: p */
    float f1894p;

    /* renamed from: q */
    float f1895q;

    /* renamed from: r */
    Rect f1896r;

    /* renamed from: s */
    Rect f1897s;

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f1894p);
        c0859ar.mo1488a(this.f1893o);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1463b() >= 9) {
            this.f1894p = c0876k.m1453g();
            this.f1893o = c0876k.m1453g();
            if (c0876k.m1463b() == 8) {
                this.f1892g = c0876k.m1455e();
            }
        } else {
            this.f1893o = 0.5f;
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public UnitType m5556r() {
        return UnitType.f1745l;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1887b = gameEngine.graphics.loadImage(R.drawable.helicopter);
        f1888c = gameEngine.graphics.loadImage(R.drawable.helicopter_blades);
        f1889d = gameEngine.graphics.loadImage(R.drawable.helicopter_shadow);
        f1890e = gameEngine.graphics.loadImage(R.drawable.helicopter_shadow_blades);
        f1886a = gameEngine.graphics.loadImage(R.drawable.helicopter_dead);
        f1891f = Team.createBitmapForTeam(f1887b);
    }

    /* renamed from: d */
    public BitmapOrTexture m5564d() {
        if (this.isDead) {
            return f1886a;
        }
        return f1891f[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m5560k() {
        return f1889d;
    }

    /* renamed from: d */
    public BitmapOrTexture m5563d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m5562e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f1886a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public Helicopter(boolean z) {
        super(z);
        this.f1892g = false;
        this.f1894p = 0.0f;
        this.f1896r = new Rect();
        this.f1897s = new Rect();
        m2884T(26);
        m2883U(46);
        this.radius = 13.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 150.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1887b;
        this.shadowImage = f1889d;
        this.height = 0.0f;
        this.f1893o = 0.14f;
        this.f1895q = 0.0f;
        setDrawLayer(5);
    }

    /* renamed from: n */
    public void m5557n() {
        super.mo4207n();
        this.height = 20.0f;
        this.f1893o = 0.5f;
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
    public void m5574a(float f) {
        super.update(f);
        if (this.isDead) {
            return;
        }
        this.f1893o = CommonUtils.m2367a(this.f1893o, 0.5f, 0.003f * f);
        this.f1895q += 70.0f * this.f1893o * f;
        if (this.f1895q >= 360.0f) {
            this.f1895q -= 360.0f;
            this.f1895q += CommonUtils.m2346a(this, 0, 4);
        }
        if (this.f1893o > 0.4f) {
            this.f1894p += 2.0f * f;
            if (this.f1894p > 360.0f) {
                this.f1894p -= 360.0f;
            }
            this.height = CommonUtils.m2367a(this.height, 20.0f + (CommonUtils.sin(this.f1894p) * 1.5f), 0.1f * f);
        }
    }

    /* renamed from: a */
    public void m5573a(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.directDamage = 17.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 30.0f;
        createProjectile.speed = 8.0f;
        createProjectile.f1018S = false;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        createProjectile.f1000A = true;
        createProjectile.f1068aR = false;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m3003a(AudioEngine.f4048s, 0.2f, 1.0f + CommonUtils.rnd(-0.08f, 0.08f), E.x, E.y);
        gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118720);
    }

    /* renamed from: m */
    public float m5558m() {
        return 130.0f;
    }

    /* renamed from: b */
    public float m5570b(int i) {
        return 60.0f;
    }

    /* renamed from: z */
    public float m5555z() {
        if (this.height < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    /* renamed from: bc */
    public float m5569bc() {
        return 0.1f;
    }

    /* renamed from: A */
    public float m5578A() {
        return 6.0f;
    }

    /* renamed from: B */
    public float m5577B() {
        return 0.4f;
    }

    /* renamed from: bi */
    public boolean m5568bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean m5567bj() {
        return true;
    }

    /* renamed from: c */
    public float m5565c(int i) {
        return 16.0f;
    }

    /* renamed from: a_ */
    public Rect m5572a_(boolean z) {
        return super.m5876a_(z);
    }

    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        if (!this.isDead) {
            Paint aN = m3166aN();
            GameEngine gameEngine = GameEngine.getInstance();
            this.f1897s.m7208a(0, 0, f1888c.mo396m(), f1888c.mo397l());
            float f2 = this.f1895q;
            if (this.f1625cm) {
            }
            gameEngine.graphics.mo913a(f1888c, this.f1897s, this.f6951ek - GameEngine.getInstance().f6138cv, (this.f6952el - GameEngine.getInstance().f6139cw) - this.height, f2, aN);
            return true;
        }
        return true;
    }

    /* renamed from: C */
    public float m5576C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float m5575D() {
        return 0.1f;
    }

    /* renamed from: l */
    public boolean m5559l() {
        return true;
    }

    /* renamed from: g */
    public float m5561g(int i) {
        return 7.0f;
    }
}
