package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.water.GunBoat;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/SeaFactory.class */
public class SeaFactory extends Factory {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_BACK = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    static Unit.SpecialAction queueGunBoat = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.SeaFactory.1
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.01f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Fast\nCan attack ground";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 400;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Gun Boat";
        }
    };
    static Unit.SpecialAction queueMissileShip = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.SeaFactory.2
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.005f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Can attack ground and air";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 1;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Missile Ship";
        }
    };
    static Unit.SpecialAction queueHovercraft = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.SeaFactory.3
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 0.003f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "Transports units\nAble to move over land and water.\nCan not attack";
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
            return "Hovercraft";
        }
    };

    public SeaFactory() {
        this.image = IMAGE;
        this.objectWidth = 73;
        this.objectHeight = 80;
        this.radius = 40.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        setDrawLayer(2);
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.sea_factory);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.sea_factory);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
        OrderableUnit orderableUnit = null;
        if (buildQueueItem.type == queueGunBoat.getIndex()) {
            orderableUnit = new GunBoat();
        }
        if (buildQueueItem.type == queueMissileShip.getIndex()) {
            orderableUnit = new MissileShip();
        }
        if (buildQueueItem.type == queueHovercraft.getIndex()) {
            orderableUnit = new Hovercraft();
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

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    public int getBuildRange() {
        return 180;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueGunBoat.getIndex() ? queueGunBoat : i == queueMissileShip.getIndex() ? queueMissileShip : i == queueHovercraft.getIndex() ? queueHovercraft : null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.seaFactory;
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
}
