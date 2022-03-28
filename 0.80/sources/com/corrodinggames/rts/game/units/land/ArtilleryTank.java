package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.EffectEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/ArtilleryTank.class */
public class ArtilleryTank extends LandUnit {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];

    public ArtilleryTank() {
        this.objectWidth = 19;
        this.objectHeight = 44;
        this.radius = 13.0f;
        this.displayRadius = this.radius;
        this.maxHp = 80.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.artillery1);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.artillery1_dead);
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

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        PointF turretEnd = getTurretEnd();
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.directDamage = 70.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 150.0f;
        createProjectile.speed = 3.5f;
        createProjectile.largeHitEffect = true;
        createProjectile.color = Color.argb(255, 190, 190, 80);
        createProjectile.drawSize = 2;
        GameEngine instance = GameEngine.getInstance();
        instance.audio.playSound(AudioEngine.cannon_firing, 0.3f, turretEnd.x, turretEnd.y);
        instance.effects.emitSmallFlame(turretEnd.x, turretEnd.y, this.height, this.turretDir);
        EffectEngine.EffectObject emitLight = instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1118482);
        if (emitLight != null) {
            emitLight.timer = 15.0f;
            emitLight.startTimer = emitLight.timer;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 260.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public float getSecBar() {
        return this.currentShootDelay != 0.0f ? 1.0f - (this.currentShootDelay / getShootDelay()) : super.getSecBar();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.artillery;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean isFixedFiring() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof ArtilleryTank) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
    }
}
