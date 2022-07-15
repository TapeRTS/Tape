package com.corrodinggames.rts.game.units.land;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class TankDestroyer extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture img_tank2_dead = null;

    /* renamed from: b */
    static BitmapOrTexture img_tank2 = null;

    /* renamed from: c */
    static BitmapOrTexture img_tank2_turret = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3500d = new BitmapOrTexture[10];

    /* renamed from: e */
    Rect f3501e = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.tankDestroyer;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        img_tank2 = game.graphics.loadImage(R.drawable.tank2);
        img_tank2_dead = game.graphics.loadImage(R.drawable.tank2_dead);
        img_tank2_turret = game.graphics.loadImage(R.drawable.tank2_turret);
        f3500d = Team.createBitmapForTeam(img_tank2);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return img_tank2_dead;
        }
        return f3500d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return img_tank2_turret;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine game = GameEngine.getInstance();
        game.effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = img_tank2_dead;
        setDrawLayer(0);
        this.collidable = false;
        game.audio.playSound(AudioEngine.f3869o, 0.8f, this.x, this.y);
        mo2507bp();
        return true;
    }

    public TankDestroyer(boolean z) {
        super(z);
        setObjectWidth(16);
        setObjectHeight(30);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 350.0f;
        this.hp = this.maxHp;
        this.image = img_tank2;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float deltaSpeed) {
        super.update(deltaSpeed);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.directDamage = 35.0f;
        createProjectile.target = target;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 3.0f;
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        game.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        game.audio.playSound(AudioEngine.tank_firing, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.12f;
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
        return 10.0f;
    }
}