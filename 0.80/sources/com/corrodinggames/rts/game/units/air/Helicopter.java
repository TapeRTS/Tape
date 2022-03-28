package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/air/Helicopter.class */
public class Helicopter extends AirUnit {
    float animFrame;
    float fallSpeed;
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_SHADOW = null;
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    boolean hitGround = false;
    float heightCos = 0.0f;
    Rect _temp = new Rect();
    float rotorSpeed = 0.14f;

    public Helicopter() {
        this.objectWidth = 42;
        this.objectHeight = 42;
        this.radius = 13.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 150.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.imageShadow = IMAGE_SHADOW;
        this.height = 0.0f;
        setDrawLayer(4);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.helicopter);
        IMAGE_SHADOW = instance.graphics.loadImage(R.drawable.helicopter_shadow);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.helicopter_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.MovableUnit, com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canMove() {
        return this.height > 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmallExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(1);
        this.collidable = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        PointF turretEnd = getTurretEnd();
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.height = this.height;
        createProjectile.directDamage = 17.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 30.0f;
        createProjectile.speed = 8.0f;
        createProjectile.visible = false;
        createProjectile.color = Color.argb(255, 180, 180, 0);
        createProjectile.instant = true;
        createProjectile.hitSound = false;
        GameEngine instance = GameEngine.getInstance();
        instance.audio.playSound(AudioEngine.gun_fire, 0.2f, turretEnd.x, turretEnd.y);
        instance.effects.emitSmallFlame(turretEnd.x, turretEnd.y, this.height, this.turretDir);
        instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void fromLoadedMap() {
        super.fromLoadedMap();
        this.height = 20.0f;
        this.rotorSpeed = 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public Rect getImageSrcRect(boolean z) {
        Rect rect;
        if (!this.dead || z) {
            int i = 1 + (((int) this.animFrame) * (this.objectWidth + 1));
            this._temp.set(i, 1, this.objectWidth + i, this.objectHeight + 1);
            rect = this._temp;
        } else {
            rect = super.getImageSrcRect(z);
        }
        return rect;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public int getMoveSlidingDir() {
        return 180;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.helicopter;
    }

    @Override // com.corrodinggames.rts.game.units.MovableUnit, com.corrodinggames.rts.game.units.Unit
    public boolean isFlying() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof Helicopter) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.air.AirUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        GameEngine.getInstance();
        if (!this.dead) {
            this.rotorSpeed = CommonUtils.toValue(this.rotorSpeed, 0.5f, 0.003f * f);
            this.animFrame += this.rotorSpeed * f;
            if (this.animFrame >= 4.0f) {
                this.animFrame = 0.0f;
            }
            if (this.rotorSpeed > 0.4f) {
                this.heightCos += 2.0f * f;
                if (this.heightCos > 360.0f) {
                    this.heightCos -= 360.0f;
                }
                this.height = CommonUtils.toValue(this.height, 20.0f + (CommonUtils.sin(this.heightCos) * 1.5f), 0.1f * f);
            }
        }
    }
}
