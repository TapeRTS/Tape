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
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/MegaTank.class */
public class MegaTank extends LandUnit {
    Rect _srcRect = new Rect();
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];

    public MegaTank() {
        this.objectWidth = 20;
        this.objectHeight = 25;
        this.radius = 12.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 550.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.mega_tank);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.mega_tank_dead);
        IMAGE_TURRET = instance.graphics.loadImage(R.drawable.mega_tank_turrent);
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
        if (!unit.isFlying()) {
            PointF turretEnd = getTurretEnd();
            Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
            createProjectile.color = Color.argb(255, (int) NetworkEngine.PACKET_SEND_KICK, 230, 40);
            createProjectile.directDamage = 50.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 60.0f;
            createProjectile.speed = 3.0f;
            createProjectile.drawSize = 2;
            createProjectile.largeHitEffect = true;
            GameEngine instance = GameEngine.getInstance();
            instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
            instance.effects.emitSmallFlame(turretEnd.x, turretEnd.y, this.height, this.turretDir);
            instance.audio.playSound(AudioEngine.firing4, 0.3f, this.x, this.y);
            return;
        }
        Projectile createProjectile2 = Projectile.createProjectile(this, this.x, this.y);
        createProjectile2.color = Color.argb(255, 230, 230, 50);
        createProjectile2.directDamage = 40.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 190.0f;
        createProjectile2.speed = 4.0f;
        createProjectile2.ballistic = true;
        createProjectile2.ballistic_delaymove_height = 10.0f;
        createProjectile2.ballistic_height = 15.0f;
        createProjectile2.trailEffect = true;
        createProjectile2.largeHitEffect = true;
        GameEngine.getInstance().audio.playSound(AudioEngine.missile_fire, 0.2f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public float getMass() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.megaTank;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof MegaTank) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
    }
}
