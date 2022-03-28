package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Extractor.class */
public class Extractor extends Factory {
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    static BitmapOrTexture IMAGE_WREAK = null;
    public static int actionId_queueUpgrade = 0;
    static Unit.SpecialAction queueUpgrade = new Factory.SpecialQueueAction() { // from class: com.corrodinggames.rts.game.units.buildings.Extractor.1
        @Override // com.corrodinggames.rts.game.units.buildings.Factory.SpecialQueueAction
        public float getBuildSpeed() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Generates credits 50% faster";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return Extractor.actionId_queueUpgrade;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public boolean isActive(Unit unit) {
            Extractor extractor = (Extractor) unit;
            return (extractor.upgraded || extractor.getItemCountInQueue(getIndex()) > 0) ? false : super.isActive(unit);
        }
    };
    float addDelay;
    boolean upgraded;
    float frameUpdate = 0.0f;
    int fakeFrame = 0;
    Rect _dst = new Rect();
    Rect _src = new Rect();

    public Extractor() {
        this.image = IMAGE;
        this.objectWidth = 37;
        this.objectHeight = 50;
        this.radius = 18.0f;
        this.displayRadius = this.radius;
        this.maxHp = 800.0f;
        this.hp = this.maxHp;
        this.footprint.set(0, -1, 0, 0);
        this.softFootprint.set(this.footprint);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.extractor);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.extractor_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    public boolean canBeBuiltHere() {
        GameEngine instance = GameEngine.getInstance();
        instance.map.toGrid(this.x, this.y);
        MapTile tileFromObjectLayer = instance.map.getTileFromObjectLayer(instance.map.returnX, instance.map.returnY);
        return (tileFromObjectLayer == null || !tileFromObjectLayer.resPool) ? false : super.canBeBuiltHere();
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
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == queueUpgrade.getIndex() ? queueUpgrade : null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.extractor;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 1;
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
                this.frameUpdate = 17.0f;
                this.fakeFrame++;
                if (this.fakeFrame > 7) {
                    this.fakeFrame = 0;
                }
                if (this.fakeFrame <= 3) {
                    this.drawFrame = this.fakeFrame;
                } else {
                    this.drawFrame = 7 - this.fakeFrame;
                }
            }
            this.addDelay += f;
            if (this.addDelay > 60.0f) {
                this.addDelay -= 60.0f;
                if (!this.upgraded) {
                    this.team.credits += 10;
                    return;
                }
                this.team.credits += 15;
            }
        }
    }

    public void upgrade() {
        if (!this.upgraded) {
            this.upgraded = true;
            this.maxHp += 200.0f;
            this.hp += 200.0f;
        }
    }
}
