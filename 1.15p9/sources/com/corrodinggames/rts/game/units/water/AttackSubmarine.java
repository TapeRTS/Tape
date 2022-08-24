package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class AttackSubmarine extends AbstractC0590f {

    /* renamed from: a */
    boolean f3828a;

    /* renamed from: b */
    boolean f3829b;

    /* renamed from: c */
    float f3830c;

    /* renamed from: d */
    static BitmapOrTexture f3831d = null;

    /* renamed from: e */
    static BitmapOrTexture f3832e = null;

    /* renamed from: f */
    static BitmapOrTexture f3833f = null;

    /* renamed from: g */
    public static BitmapOrTexture f3834g = null;

    /* renamed from: h */
    public static BitmapOrTexture[] f3835h = new BitmapOrTexture[10];

    /* renamed from: i */
    static BitmapOrTexture[] f3836i = new BitmapOrTexture[10];

    /* renamed from: j */
    public static final Action f3837j = new C05881(151);

    /* renamed from: k */
    public static final Action f3838k = new C05892(152);

    /* renamed from: l */
    static ArrayList f3839l = new ArrayList();

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3828a);
        c0859ar.mo1488a(this.f3830c);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3828a = c0876k.m1455e();
        this.f3829b = !mo3294Q();
        if (c0876k.m1463b() >= 21) {
            this.f3830c = c0876k.m1453g();
        }
        m3432K();
        super.mo2877a(c0876k);
    }

    static {
        f3839l.add(f3837j);
        f3839l.add(f3838k);
    }

    /* renamed from: v */
    public BitmapOrTexture m3407v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3835h[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3832e = gameEngine.graphics.loadImage(R.drawable.attack_submarine);
        f3833f = m5883a(f3832e, f3832e.mo396m(), f3832e.mo397l());
        f3831d = gameEngine.graphics.loadImage(R.drawable.attack_submarine_dead);
        f3834g = gameEngine.graphics.loadImage(R.drawable.unit_icon_water);
        f3835h = Team.createBitmapForTeam(f3834g);
        f3836i = Team.createBitmapForTeam(f3832e);
    }

    /* renamed from: F */
    public boolean m3435F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height >= 0.0f;
    }

    /* renamed from: G */
    public float m3434G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float m3433H() {
        return 0.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3420d() {
        if (this.isDead) {
            return f3831d;
        }
        return f3836i[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3413k() {
        return f3833f;
    }

    /* renamed from: h */
    public EnumC0246ao m3414h() {
        return EnumC0246ao.f1706e;
    }

    /* renamed from: c */
    public UnitType m3409r() {
        return UnitType.f1770K;
    }

    /* renamed from: f */
    public boolean m3415f() {
        if (!mo3294Q()) {
            return true;
        }
        return false;
    }

    public AttackSubmarine(boolean z) {
        super(z);
        this.f3828a = false;
        this.f3829b = true;
        this.f3830c = 0.0f;
        m2878b(f3832e);
        this.radius = 15.0f;
        this.displayRadius = this.radius - 2.0f;
        this.f1632ct = 260.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3832e;
    }

    /* renamed from: K */
    public void m3432K() {
        if (!this.f3829b) {
            setDrawLayer(1);
        } else {
            setDrawLayer(2);
        }
    }

    /* renamed from: s */
    public void m3408s(float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3828a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (CommonUtils.m2294c(this.height - f2) > 2.0f) {
            this.f3830c = CommonUtils.m2367a(this.f3830c, 0.08f, 0.003f * f);
        } else {
            this.f3830c = CommonUtils.m2367a(this.f3830c, 0.02f, 0.003f * f);
        }
        this.height = CommonUtils.m2367a(this.height, f2, this.f3830c * f);
        boolean z = false;
        if (this.f3829b && mo3294Q()) {
            this.f3829b = false;
            m3432K();
            z = true;
        }
        if (!this.f3829b && !mo3294Q()) {
            this.f3829b = true;
            m3432K();
            z = true;
        }
        if (z) {
            gameEngine.effects.m2555a(this.f6951ek, this.f6952el, 0.0f, 0, 0.0f, 0.0f, this.direction);
        }
    }

    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
        }
    }

    /* renamed from: m */
    public float m3411m() {
        if (!mo3294Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    /* renamed from: b */
    public float m3423b(int i) {
        return 170.0f;
    }

    /* renamed from: e */
    public float m3416e(int i) {
        return 10.0f;
    }

    /* renamed from: z */
    public float m3405z() {
        if (!mo3294Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    /* renamed from: A */
    public float m3439A() {
        return 1.2f;
    }

    /* renamed from: B */
    public float m3438B() {
        return 0.06f;
    }

    /* renamed from: c */
    public float m3421c(int i) {
        return 2.5f;
    }

    /* renamed from: w */
    public float m3406w(int i) {
        return 0.08f;
    }

    /* renamed from: C */
    public float m3437C() {
        return 0.018f;
    }

    /* renamed from: D */
    public float m3436D() {
        return 0.1f;
    }

    /* renamed from: d */
    public BitmapOrTexture m3419d(int i) {
        return null;
    }

    /* renamed from: l */
    public boolean m3412l() {
        return true;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return this.height < -1.0f;
    }

    /* renamed from: ah */
    public boolean m3425ah() {
        if (!mo3294Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean m3428ae() {
        if (!mo3294Q()) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    public boolean m3427af() {
        if (!mo3294Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ag */
    public boolean m3426ag() {
        if (!mo3294Q()) {
            return true;
        }
        return true;
    }

    /* renamed from: q */
    public float m3410q(int i) {
        return 42.0f;
    }

    /* renamed from: a */
    public void m3429a(Unit unit, int i) {
        if (!mo3294Q()) {
            PointF E = getTurretEnd(i);
            Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
            PointF K = m3238K(i);
            createProjectile.x = K.x;
            createProjectile.y = K.y;
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            createProjectile.directDamage = 42.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 190.0f;
            createProjectile.speed = 2.0f;
            createProjectile.f1058aH = true;
            createProjectile.f1063aM = true;
            createProjectile.f1067aQ = true;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.audio.m3004a(AudioEngine.f4042m, 0.8f, this.f6951ek, this.f6952el);
            gameEngine.effects.emitLight(this.f6951ek, this.f6952el, this.height, -1118720);
            return;
        }
        PointF E2 = getTurretEnd(i);
        Projectile createProjectile2 = Projectile.createProjectile(this, E2.x, E2.y, this.height, i);
        PointF K2 = m3238K(i);
        createProjectile2.x = K2.x;
        createProjectile2.y = K2.y;
        createProjectile2.color = Color.argb(255, 30, 30, 150);
        createProjectile2.f997x = 1.0f;
        createProjectile2.directDamage = 42.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 250.0f;
        createProjectile2.speed = 1.3f;
        createProjectile2.f1058aH = false;
        createProjectile2.f1063aM = true;
        createProjectile2.f1067aQ = true;
        GameEngine.getInstance();
    }

    /* renamed from: e */
    public boolean m3418e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3831d;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    /* renamed from: a */
    public void m3430a(Action action, boolean z) {
        if (action == f3837j) {
            this.f3828a = true;
        }
        if (action == f3838k) {
            this.f3828a = false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$1.class */
    final class C05881 extends AbstractC0229x {
        C05881(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Surface";
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return !((AttackSubmarine) unit).f3828a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$2.class */
    final class C05892 extends AbstractC0229x {
        C05892(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Dive";
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return ((AttackSubmarine) unit).f3828a;
        }
    }

    /* renamed from: N */
    public ArrayList m3431N() {
        return f3839l;
    }

    /* renamed from: e */
    public void m3417e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m3411m());
    }
}
