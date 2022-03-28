package com.corrodinggames.rts.game.units.land;

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
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/HoverTank.class */
public class HoverTank extends HoverUnit {
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_SHADOW = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    float heightCos = 0.0f;
    Rect _srcRect = new Rect();

    public HoverTank() {
        this.objectWidth = 20;
        this.objectHeight = 20;
        this.radius = 7.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 130.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.imageShadow = IMAGE_SHADOW;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.hover_tank);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.hover_tank_dead);
        IMAGE_SHADOW = instance.graphics.loadImage(R.drawable.hover_tank_shadow);
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
        return true;
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
        super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        PointF turretEnd = getTurretEnd();
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.color = Color.argb(255, 50, 230, 50);
        createProjectile.directDamage = 25.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 3.0f;
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -14483678);
        instance.audio.playSound(AudioEngine.plasma_fire2, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getDrawBaseDir() {
        return this.turretDir + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public int getMoveSlidingDir() {
        return 181;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return isOverWater() ? 1.7f : 1.6f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.hoverTank;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void rotateBody(float f) {
        this.dir += f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof HoverTank) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.land.HoverUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (!this.dead && isActive()) {
            this.heightCos += 3.0f * f;
            if (this.heightCos > 360.0f) {
                this.heightCos -= 360.0f;
            }
            this.height = CommonUtils.toValue(this.height, 4.0f + (CommonUtils.sin(this.heightCos) * 1.5f), 0.1f * f);
        }
    }
}
