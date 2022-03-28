package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Turret.class */
public class Turret extends Factory {
    Rect _srcRect = new Rect();
    boolean upgraded;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture IMAGE_TURRET_L2 = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE_ICON = null;
    static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];
    public static int actionId_queueUpgrade = 0;
    static Unit.SpecialAction queueUpgrade = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.Turret.1
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return Turret.actionId_queueUpgrade;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public boolean isActive(Unit unit) {
            Turret turret = (Turret) unit;
            return (turret.upgraded || turret.getItemCountInQueue(getIndex()) > 0) ? false : super.isActive(unit);
        }
    };

    public Turret() {
        this.objectWidth = 35;
        this.objectHeight = 42;
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.maxHp = 700.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.turret_base);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.turret_base_dead);
        IMAGE_TURRET = instance.graphics.loadImage(R.drawable.turret_top);
        IMAGE_TURRET_L2 = instance.graphics.loadImage(R.drawable.turret_top_l2);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        for (int i2 = 0; i2 < IMAGE_ICON_TEAMS.length; i2++) {
            IMAGE_ICON_TEAMS[i2] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i2));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttackUnit(Unit unit) {
        return !unit.isFlying();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
        if (buildQueueItem.type == queueUpgrade.getIndex()) {
            upgrade();
        }
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

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        if (shouldDrawCheck()) {
            super.draw(f);
            if (!this.dead) {
                drawTurret();
            }
        }
    }

    void drawTurret() {
        GameEngine instance = GameEngine.getInstance();
        BitmapOrTexture bitmapOrTexture = !this.upgraded ? IMAGE_TURRET : IMAGE_TURRET_L2;
        this._srcRect.set(0, 0, bitmapOrTexture.getWidth(), bitmapOrTexture.getHeight());
        instance.graphics.drawImageCentered(bitmapOrTexture, this._srcRect, this.x - GameEngine.getInstance().viewpointX_rounded, this.y - GameEngine.getInstance().viewpointY_rounded, this.turretDir, getBuildingPaint());
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        PointF turretEnd = getTurretEnd();
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        if (!this.upgraded) {
            createProjectile.speed = 4.0f;
            createProjectile.color = Color.argb(255, 100, 30, 30);
            createProjectile.directDamage = 41.0f;
        } else {
            createProjectile.speed = 5.0f;
            createProjectile.color = Color.argb(255, 40, 30, (int) NetworkEngine.PACKET_REGISTER_CONNECTION);
            createProjectile.directDamage = 44.0f;
        }
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        instance.effects.emitSmallFlame(turretEnd.x, turretEnd.y, this.height, this.turretDir);
        instance.audio.playSound(AudioEngine.firing3, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return !this.upgraded ? 165.0f : 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return !this.upgraded ? 30.0f : 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueUpgrade.getIndex() ? queueUpgrade : null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.turret;
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
    }

    public void upgrade() {
        if (!this.upgraded) {
            this.upgraded = true;
            this.maxHp += 400.0f;
            this.hp += 400.0f;
        }
    }
}
