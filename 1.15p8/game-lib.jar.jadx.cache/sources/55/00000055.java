package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class BattleShip extends WaterUnit {

    /* renamed from: a */
    static BitmapOrTexture f3612a = null;

    /* renamed from: b */
    static BitmapOrTexture f3613b = null;

    /* renamed from: c */
    static BitmapOrTexture f3614c = null;

    /* renamed from: d */
    static BitmapOrTexture f3615d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3616e = new BitmapOrTexture[10];

    /* renamed from: f */
    Rect f3617f = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.battleShip;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 9000.0f;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3613b = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2);
        f3612a = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2_dead);
        f3614c = gameEngine.graphics.loadImage(R.drawable.battle_ship_t2_turret);
        f3616e = Team.createBitmapForTeam(f3613b);
        f3615d = m3772a(f3613b, f3613b.getWidth(), f3613b.getHeight());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3612a;
        }
        return f3616e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f3614c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3615d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = f3612a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public BattleShip(boolean z) {
        super(z);
        m2331b(f3613b);
        this.radius = 20.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1200.0f;
        this.hp = this.maxHp;
        this.image = f3613b;
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.f1047x = 2.0f;
        createProjectile.speed = 4.0f;
        createProjectile.visible = true;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        createProjectile.f987aQ = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.playSound(AudioEngine.cannon_firing, 0.2f, E.x, E.y);
        gameEngine.effects.m2223a(createProjectile, -1118720);
        EffectObject emitSmalFlame = gameEngine.effects.emitSmalFlame(E.x, E.y, this.height, this.f1532cC[i].f1652a);
        if (emitSmalFlame != null) {
            EffectEngine.m2225a(emitSmalFlame, this);
        }
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float mo2668C(int i) {
        if (this.f1524bZ && mo2521bb() > 0.95d) {
            if (i == 0) {
                return this.direction + 140.0f;
            }
            return this.direction - 140.0f;
        }
        return this.direction;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C0955y.m449a((OrderableUnit) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        float f;
        PointF F = super.mo2662F(i);
        float f2 = F.x;
        float f3 = F.y;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        f3752ba.set(f2 + (CommonUtils.cos(this.direction) * f), f3 + (CommonUtils.sin(this.direction) * f));
        return f3752ba;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2660G(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2658H(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public float mo2656I(int i) {
        return 12.0f;
    }
}