package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
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

/* renamed from: com.corrodinggames.rts.game.units.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class Battleship extends AbstractC0590f {

    /* renamed from: a */
    static BitmapOrTexture f3802a = null;

    /* renamed from: b */
    static BitmapOrTexture f3803b = null;

    /* renamed from: c */
    static BitmapOrTexture f3804c = null;

    /* renamed from: d */
    static BitmapOrTexture f3805d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3806e = new BitmapOrTexture[10];

    /* renamed from: f */
    Rect f3807f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1754u;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3513bN() {
        return 9000.0f;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3803b = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2);
        f3802a = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2_dead);
        f3804c = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2_turret);
        f3806e = Team.createBitmapForTeam(f3803b);
        f3805d = m5883a(f3803b, f3803b.mo396m(), f3803b.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.isDead) {
            return f3802a;
        }
        return f3806e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo3507d(int i) {
        return f3804c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3805d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3525F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3524G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3522H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5648e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3802a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public Battleship(boolean z) {
        super(z);
        this.f3807f = new Rect();
        m2878b(f3803b);
        this.radius = 20.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1200.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3803b;
    }

    @Override // com.corrodinggames.rts.game.units.water.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.f997x = 2.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f1018S = true;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        createProjectile.f1067aQ = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m3004a(AudioEngine.f4047r, 0.2f, E.x, E.y);
        gameEngine.effects.m2549a(createProjectile, -1118720);
        C0745e m2562a = gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        if (m2562a != null) {
            C0743c.m2551a(m2562a, this);
        }
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3532bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3538C(int i) {
        if (this.f1619cg && mo3532bc() > 0.95d) {
            if (i == 0) {
                return this.direction + 140.0f;
            }
            return this.direction - 140.0f;
        }
        return this.direction;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3528B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3493w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C1117y.m487a((AbstractC0623y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean canAttackFly() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3512bl() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3523G(int i) {
        float f;
        PointF G = super.mo3523G(i);
        float f2 = G.x;
        float f3 = G.y;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        f3981bg.m7213a(f2 + (CommonUtils.m2249i(this.direction) * f), f3 + (CommonUtils.sin(this.direction) * f));
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3505e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3537H(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public float mo3536I(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: J */
    public float mo3535J(int i) {
        return 12.0f;
    }
}
