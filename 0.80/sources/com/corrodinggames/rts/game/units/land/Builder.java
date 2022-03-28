package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/Builder.class */
public class Builder extends LandUnit {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_ICON = null;
    static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];
    static Unit.SpecialAction constructExtractor = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.1
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.extractor;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Generates credits.\n-Can only be built on resource pools.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Extractor";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };
    static Unit.SpecialAction constructTurret = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.2
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.turret;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Attacks ground units.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 1;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Turret";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };
    static Unit.SpecialAction constructAntiAirTurret = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.3
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.antiAirTurret;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Attacks air units.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 2;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Anti-Air";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };
    static Unit.SpecialAction constructLandFactory = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.4
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.landFactory;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Builds land units.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 3;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Land Factory";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };
    static Unit.SpecialAction constructAirFactory = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.5
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.airFactory;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Builds air units.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 4;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Air Factory";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };
    static Unit.SpecialAction constructSeaFactory = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Builder.6
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public UnitType getCreatedUnitType() {
            return UnitType.seaFactory;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Builds sea units.\n-Can only be built on water.";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return 5;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return Building.getPrice(getCreatedUnitType());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Sea Factory";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return -1;
        }
    };

    public Builder() {
        this.objectWidth = 20;
        this.objectHeight = 20;
        this.radius = 10.0f;
        this.displayRadius = this.radius;
        this.maxHp = 150.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.builder);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.builder_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_builder);
        for (int i2 = 0; i2 < IMAGE_ICON_TEAMS.length; i2++) {
            IMAGE_ICON_TEAMS[i2] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i2));
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return false;
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
    }

    @Override // com.corrodinggames.rts.game.units.land.LandUnit, com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 30.0f;
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
        return isOverWater() ? 0.6f : 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == constructExtractor.getIndex() ? constructExtractor : i == constructTurret.getIndex() ? constructTurret : i == constructAntiAirTurret.getIndex() ? constructAntiAirTurret : i == constructLandFactory.getIndex() ? constructLandFactory : i == constructAirFactory.getIndex() ? constructAirFactory : i == constructSeaFactory.getIndex() ? constructSeaFactory : null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return isOverWater() ? 1.5f : 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.builder;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void giveSpecialActionOrder(Unit.SpecialAction specialAction, boolean z) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        this.image = IMAGE_TEAMS[i];
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
    }
}
