package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.land.ArtilleryTank;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.HoverTank;
import com.corrodinggames.rts.game.units.land.LaserTank;
import com.corrodinggames.rts.game.units.land.MegaTank;
import com.corrodinggames.rts.game.units.land.Tank;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/LandFactory.class */
public class LandFactory extends Factory {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_BACK = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    public static int actionId_queueBuilder = 0;
    public static int actionId_queueTank = 1;
    public static int actionId_queueArtillery = 2;
    public static int actionId_queueMegaTank = 3;
    public static int actionId_queueHoverTank = 4;
    public static int actionId_queueLaserTank = 5;
    static Unit.SpecialAction queueBuilder = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.1
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.005f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return CommandCenter.queueBuilder.getDescription();
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueBuilder;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return CommandCenter.queueBuilder.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return CommandCenter.queueBuilder.getText();
        }
    };
    static Unit.SpecialAction queueTank = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.2
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.004f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground only";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueTank;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 200;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Tank";
        }
    };
    static Unit.SpecialAction queueArtillery = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.3
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.003f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground only\nLong range";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueArtillery;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Artillery";
        }
    };
    static Unit.SpecialAction queueMegaTank = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.4
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.0015f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "heavily armed\nCan attack ground\nLight air attack";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueMegaTank;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Mega Tank";
        }
    };
    static Unit.SpecialAction queueHoverTank = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.5
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.005f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground only\nAble to move over water";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueHoverTank;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Hover Tank";
        }
    };
    static Unit.SpecialAction queueLaserTank = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.LandFactory.6
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground and air.\nWeak vs multiple units\nPowerful single shot, slow recharge";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return LandFactory.actionId_queueLaserTank;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Laser Tank";
        }
    };

    public LandFactory() {
        this.image = IMAGE;
        this.objectWidth = 50;
        this.objectHeight = 70;
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        setDrawLayer(3);
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.land_factory_front);
        IMAGE_BACK = instance.graphics.loadImage(R.drawable.land_factory_back);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.land_factory_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
        OrderableUnit orderableUnit = null;
        if (buildQueueItem.type == queueBuilder.getIndex()) {
            orderableUnit = new Builder();
        }
        if (buildQueueItem.type == queueTank.getIndex()) {
            orderableUnit = new Tank();
        }
        if (buildQueueItem.type == queueArtillery.getIndex()) {
            orderableUnit = new ArtilleryTank();
        }
        if (buildQueueItem.type == queueMegaTank.getIndex()) {
            orderableUnit = new MegaTank();
        }
        if (buildQueueItem.type == queueHoverTank.getIndex()) {
            orderableUnit = new HoverTank();
        }
        if (buildQueueItem.type == queueLaserTank.getIndex()) {
            orderableUnit = new LaserTank();
        }
        orderableUnit.x = this.x;
        orderableUnit.y = this.y + 5.0f;
        orderableUnit.dir = 90.0f;
        orderableUnit.turretDir = 90.0f;
        orderableUnit.setTeam(this.team.id);
        orderableUnit.factoryExitDelay = 40.0f;
        orderableUnit.addMoveWaypoint(this.x, this.y + (this.radius * 3.0f));
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    public boolean destroyEffectAndWreakForBuilding() {
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitLargeExplosion(this.x, this.y, this.height);
        this.image_back = null;
        this.image = IMAGE_WREAK;
        setDrawLayer(1);
        this.collidable = false;
        instance.audio.playSound(AudioEngine.building_explode, 0.8f, this.x, this.y);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueBuilder.getIndex() ? queueBuilder : i == queueTank.getIndex() ? queueTank : i == queueArtillery.getIndex() ? queueArtillery : i == queueMegaTank.getIndex() ? queueMegaTank : i == queueHoverTank.getIndex() ? queueHoverTank : i == queueLaserTank.getIndex() ? queueLaserTank : null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public int getSpecialActionFor(UnitType unitType) {
        return unitType == UnitType.builder ? queueBuilder.getIndex() : unitType == UnitType.tank ? queueTank.getIndex() : unitType == UnitType.artillery ? queueArtillery.getIndex() : unitType == UnitType.megaTank ? queueMegaTank.getIndex() : unitType == UnitType.hoverTank ? queueHoverTank.getIndex() : unitType == UnitType.laserTank ? queueLaserTank.getIndex() : -1;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        this.image = IMAGE_TEAMS[i];
        this.image_back = IMAGE_BACK;
        super.setTeam(i);
    }
}
