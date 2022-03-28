package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/CommandCenter.class */
public class CommandCenter extends Factory {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    public static Unit.SpecialAction queueBuilder = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.CommandCenter.1
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Constructs and repairs buildings.\nCan not attack.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 300;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Builder";
        }
    };
    float addDelay;
    float frameUpdate = 20.0f;
    int fakeFrame = 0;

    public CommandCenter() {
        this.image = IMAGE;
        this.objectWidth = 53;
        this.objectHeight = 68;
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 3000.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.base);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.base_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
        Builder builder = null;
        if (buildQueueItem.type == queueBuilder.getIndex()) {
            builder = new Builder();
        }
        builder.x = this.x;
        builder.y = this.y + 15.0f;
        builder.dir = 90.0f;
        builder.setTeam(this.team.id);
        builder.factoryExitDelay = 40.0f;
        builder.addMoveWaypoint(this.x, this.y + (this.radius * 3.0f));
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    public boolean destroyEffectAndWreakForBuilding() {
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitLargeExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(1);
        this.collidable = false;
        instance.audio.playSound(AudioEngine.building_explode, 0.8f, this.x, this.y);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        Projectile createProjectile = Projectile.createProjectile(this, this.x, this.y);
        createProjectile.color = Color.argb(255, 230, 230, 50);
        createProjectile.directDamage = 70.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 180.0f;
        createProjectile.speed = 3.0f;
        createProjectile.ballistic = true;
        createProjectile.trailEffect = true;
        createProjectile.largeHitEffect = true;
        GameEngine.getInstance().audio.playSound(AudioEngine.missile_fire, 0.8f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueBuilder.getIndex() ? queueBuilder : null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public int getSpecialActionFor(UnitType unitType) {
        return unitType.equals(UnitType.builder) ? queueBuilder.getIndex() : -1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean resetTurret() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        this.image = IMAGE_TEAMS[i];
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (isActive() && !this.dead) {
            this.frameUpdate = CommonUtils.toZero(this.frameUpdate, f);
            if (this.frameUpdate == 0.0f) {
                this.frameUpdate = 5.0f;
                this.fakeFrame++;
                if (this.fakeFrame > 6) {
                    this.fakeFrame = 0;
                    this.frameUpdate = 70.0f;
                }
                if (this.fakeFrame <= 3) {
                    this.drawFrame = this.fakeFrame;
                } else {
                    this.drawFrame = 6 - this.fakeFrame;
                }
            }
            this.addDelay += f;
            if (this.addDelay > 60.0f) {
                this.addDelay -= 60.0f;
                this.team.credits += 10;
            }
        }
    }
}
