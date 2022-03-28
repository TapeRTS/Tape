package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.air.AirUnit;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.water.WaterUnit;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/Hovercraft.class */
public class Hovercraft extends HoverUnit {
    float heightCos = 0.0f;
    ArrayList<Unit> transportingUnits = new ArrayList<>();
    float unloadDelay;
    boolean unloading;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE_SHADOW = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    public static int unloadActionId = 0;
    public static final Unit.SpecialAction unload = new Unit.SpecialAction() { // from class: com.corrodinggames.rts.game.units.land.Hovercraft.1
        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getDescription() {
            return "-Unload all units";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getIndex() {
            return Hovercraft.unloadActionId;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int getPrice() {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public String getText() {
            return "Unload";
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public boolean isActive(Unit unit) {
            return !((OrderableUnit) unit).isOverWater() && ((Hovercraft) unit).transportingUnits.size() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return ((Hovercraft) unit).transportingUnits.size();
        }
    };

    public Hovercraft() {
        this.objectWidth = 20;
        this.objectHeight = 32;
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.maxHp = 350.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.imageShadow = IMAGE_SHADOW;
        setDrawLayer(3);
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.hovercraft);
        IMAGE_SHADOW = instance.graphics.loadImage(R.drawable.hovercraft_shadow);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.hovercraft_dead);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean canBeTransported(Unit unit) {
        return this.unloading ? false : this.transportingUnits.size() >= 4 ? false : unit == this ? false : unit instanceof Hovercraft ? false : ((unit instanceof AirUnit) || (unit instanceof WaterUnit)) ? false : unit instanceof Building ? false : unit.transportedBy == null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean destroyEffectAndWreak() {
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitSmallExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(1);
        this.collidable = false;
        forceUnload();
        instance.audio.playSound(AudioEngine.unit_explode, 0.8f, this.x, this.y);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
    }

    public void forceTransportUnit(Unit unit) {
        this.transportingUnits.add(unit);
        unit.transportedBy = this;
        GameEngine.getInstance().interfaceEngine.unselectUnit(unit);
    }

    public void forceUnload() {
        Iterator<Unit> it = this.transportingUnits.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            next.transportedBy = null;
            next.x = this.x + (CommonUtils.cos(this.dir) * (-9.0f));
            next.y = this.y + (CommonUtils.sin(this.dir) * (-9.0f));
        }
        this.transportingUnits.clear();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int getBlockBar() {
        return this.transportingUnits.size();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int getBlockBarMax() {
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public float getMass() {
        return 10000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public int getMoveSlidingDir() {
        return 90;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return isOverWater() ? 1.2f : 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return i == unload.getIndex() ? unload : null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return isOverWater() ? 1.8f : 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.hovercraft;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void giveSpecialActionOrder(Unit.SpecialAction specialAction, boolean z) {
        if (specialAction == unload) {
            unloadAll();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    public void remove() {
        forceUnload();
        super.remove();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        this.image = IMAGE_TEAMS[i];
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean transportUnit(Unit unit) {
        boolean z;
        if (!canBeTransported(unit)) {
            z = false;
        } else {
            forceTransportUnit(unit);
            z = true;
        }
        return z;
    }

    public void unloadAll() {
        this.unloading = true;
        this.unloadDelay = 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.land.HoverUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (!this.dead && isActive()) {
            if (this.unloading && !isOverWater() && !this.moving) {
                this.unloadDelay = CommonUtils.toZero(this.unloadDelay, f);
                if (this.unloadDelay == 0.0f) {
                    this.unloadDelay = 30.0f;
                    if (this.transportingUnits.size() == 0) {
                        this.unloading = false;
                    } else {
                        Unit remove = this.transportingUnits.remove(this.transportingUnits.size() - 1);
                        remove.transportedBy = null;
                        remove.x = this.x + (CommonUtils.cos(this.dir) * (-9.0f));
                        remove.y = this.y + (CommonUtils.sin(this.dir) * (-9.0f));
                        remove.xPush = 0.1f;
                        remove.dir = this.dir + 180.0f;
                        remove.dontCollideExit = this;
                        remove.dontCollideExitDelay = 45.0f;
                        if (remove instanceof OrderableUnit) {
                            OrderableUnit orderableUnit = (OrderableUnit) remove;
                            orderableUnit.clearAllWaypoints();
                            orderableUnit.addMoveWaypoint(this.x + (CommonUtils.cos(this.dir) * (-66.0f)), this.y + (CommonUtils.sin(this.dir) * (-66.0f)));
                        }
                        if (this.transportingUnits.size() == 0) {
                            this.unloading = false;
                        }
                    }
                }
            }
            this.heightCos += 4.0f * f;
            if (this.heightCos > 360.0f) {
                this.heightCos -= 360.0f;
            }
            if (!this.unloading) {
                this.height = CommonUtils.toValue(this.height, 3.0f + (CommonUtils.sin(this.heightCos) * 1.5f), 0.1f * f);
            } else {
                this.height = CommonUtils.toValue(this.height, 0.0f, 0.1f * f);
            }
        }
    }
}
