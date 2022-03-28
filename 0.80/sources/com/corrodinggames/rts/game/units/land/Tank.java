package com.corrodinggames.rts.game.units.land;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/Tank.class */
public class Tank extends LandUnit {
    Rect _srcRect = new Rect();
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];

    public Tank() {
        this.objectWidth = 20;
        this.objectHeight = 20;
        this.radius = 7.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 110.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.tank1);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.tank1_dead);
        IMAGE_TURRET = instance.graphics.loadImage(R.drawable.tank1_turret);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttackUnit(Unit unit) {
        return !unit.isFlying();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean destroyEffectAndWreak() {
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitSmallExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(1);
        this.collidable = false;
        instance.audio.playSound(AudioEngine.unit_explode, 0.8f, this.x, this.y);
        leaveScorchMark();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        if (shouldDrawCheck()) {
            super.draw(f);
            if (!this.dead) {
                GameEngine instance = GameEngine.getInstance();
                this._srcRect.set(0, 0, IMAGE_TURRET.getWidth(), IMAGE_TURRET.getHeight());
                instance.graphics.drawImageCentered(IMAGE_TURRET, this._srcRect, this.x - GameEngine.getInstance().viewpointX_rounded, this.y - GameEngine.getInstance().viewpointY_rounded, this.turretDir, this._imagePaint);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        PointF turretEnd = getTurretEnd();
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.directDamage = 25.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 3.0f;
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        instance.effects.emitSmallFlame(turretEnd.x, turretEnd.y, this.height, this.turretDir);
        instance.audio.playSound(AudioEngine.tank_firing, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.tank;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof Tank) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
    }
}
