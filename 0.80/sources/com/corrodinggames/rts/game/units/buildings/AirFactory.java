package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.air.AirShip;
import com.corrodinggames.rts.game.units.air.GunShip;
import com.corrodinggames.rts.game.units.air.Helicopter;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/AirFactory.class */
public class AirFactory extends Factory {
    float frameUpdate = 0.0f;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    static Unit.SpecialAction queueHelicopter = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.AirFactory.1
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground and air.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Helicopter";
        }
    };
    static Unit.SpecialAction queueInterceptor = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.AirFactory.2
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack air only.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 1;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Interceptor";
        }
    };
    static Unit.SpecialAction queueGunShip = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.AirFactory.3
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground only\nStrong attack\nHeavily armored";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 2;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Gun Ship";
        }
    };

    public AirFactory() {
        this.image = IMAGE;
        this.objectWidth = 40;
        this.objectHeight = 61;
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.air_factory);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.air_factory_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
        OrderableUnit orderableUnit = null;
        if (buildQueueItem.type == queueHelicopter.getIndex()) {
            orderableUnit = new Helicopter();
        }
        if (buildQueueItem.type == queueInterceptor.getIndex()) {
            orderableUnit = new AirShip();
        }
        if (buildQueueItem.type == queueGunShip.getIndex()) {
            orderableUnit = new GunShip();
        }
        orderableUnit.x = this.x;
        orderableUnit.y = this.y + 5.0f;
        orderableUnit.dir = 90.0f;
        orderableUnit.turretDir = 90.0f;
        orderableUnit.setTeam(this.team.id);
        orderableUnit.factoryExitDelay = 50.0f;
        orderableUnit.addMoveWaypoint(this.x, this.y + (this.radius * 3.0f));
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

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueHelicopter.getIndex() ? queueHelicopter : i == queueInterceptor.getIndex() ? queueInterceptor : i == queueGunShip.getIndex() ? queueGunShip : null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public int getSpecialActionFor(UnitType unitType) {
        return unitType == UnitType.helicopter ? queueHelicopter.getIndex() : unitType == UnitType.airShip ? queueInterceptor.getIndex() : unitType == UnitType.gunShip ? queueGunShip.getIndex() : -1;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 3;
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
                this.frameUpdate = 27.0f;
                this.drawFrame++;
                if (this.drawFrame > 4) {
                    this.drawFrame = 0;
                }
            }
        }
    }
}
