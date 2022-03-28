package com.corrodinggames.rts.game.ai;

import android.graphics.PointF;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/ai/Base.class */
public class Base extends Zone {
    float abandonedTimer;
    private final AI ai;
    float buildBuildingDelay;
    float claimedBaseTimer;
    boolean isUnsafeBaseCache;
    float lastWantedBuildingWeight;
    BaseStates state;
    BaseType type;
    float allowedUnits = -1.0f;
    float requestedBuildersDelay = 100.0f;
    float builtBuildersDelay = 50.0f;
    float defendBaseCheckDelay = 50.0f;
    PointF _returnPoint = new PointF();

    public Base(AI ai, float f, float f2) {
        super(ai, f, f2);
        this.ai = ai;
    }

    private boolean buildBuilding(UnitType unitType) {
        boolean z;
        GameEngine instance = GameEngine.getInstance();
        Builder idleBuilder = getIdleBuilder();
        if (idleBuilder == null) {
            z = false;
        } else {
            PointF emptyResPool = unitType.equals(UnitType.extractor) ? getEmptyResPool() : getRandomPoint();
            if (emptyResPool != null) {
                CommandController.Command createNewCommand = instance.commandController.createNewCommand(this.ai);
                createNewCommand.addUnit(idleBuilder);
                createNewCommand.setBuildWaypoint(emptyResPool.x, emptyResPool.y, unitType);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private boolean buildUnit(UnitType unitType) {
        boolean z;
        Factory factoryWhichCanBuild = getFactoryWhichCanBuild(unitType, true);
        Factory factory = factoryWhichCanBuild;
        if (factoryWhichCanBuild == null) {
            factory = getFactoryWhichCanBuild(unitType, false);
        }
        if (factory == null) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            int specialActionFor = factory.getSpecialActionFor(unitType);
            if (specialActionFor == -1) {
                GameEngine.log("AI", "buildUnit: action is -1!");
                z = false;
            } else {
                CommandController.Command createNewCommand = instance.commandController.createNewCommand(this.ai);
                createNewCommand.addUnit(factory);
                createNewCommand.setSpecialAction(specialActionFor);
                z = true;
            }
        }
        return z;
    }

    private Factory getFactoryWhichCanBuild(UnitType unitType, boolean z) {
        Factory factory;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this.ai && isOverlapping(next) && (next instanceof Factory)) {
                Factory factory2 = (Factory) next;
                if (factory2.getSpecialActionFor(unitType) != -1 && (factory2.queueEmpty() || !z)) {
                    factory = factory2;
                    break;
                }
            }
        }
        factory = null;
        return factory;
    }

    private Builder getIdleBuilder() {
        Builder builder;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (true) {
            if (!it.hasNext()) {
                builder = null;
                break;
            }
            Unit next = it.next();
            if (next.team == this.ai && isOverlapping(next) && (next instanceof Builder)) {
                builder = (Builder) next;
                if (builder.isIdle()) {
                    break;
                }
            }
        }
        return builder;
    }

    public void defendBase() {
        GameEngine instance = GameEngine.getInstance();
        Unit randomEnemyInBase = getRandomEnemyInBase();
        if (randomEnemyInBase != null) {
            CommandController.Command createNewCommand = instance.commandController.createNewCommand(this.ai);
            Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
            while (it.hasNext()) {
                Unit next = it.next();
                if (next instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) next;
                    if (next.team == this.ai && this.ai.isAttackingUnit(next, randomEnemyInBase) && orderableUnit.isIdle() && this.ai.unitWithinRange(next, this.x, this.y, 900)) {
                        createNewCommand.addUnit(orderableUnit);
                    }
                }
            }
            createNewCommand.setAttackWaypoint(randomEnemyInBase);
        }
    }

    Base getClosestBaseToBase() {
        Base base;
        float f = -1.0f;
        Base base2 = null;
        Iterator<Zone> it = this.ai.zones.iterator();
        while (it.hasNext()) {
            Zone next = it.next();
            if ((next instanceof Base) && (base = (Base) next) != this) {
                float disSq = base.getDisSq(this);
                if (base2 == null || disSq < f) {
                    f = disSq;
                    base2 = base;
                }
            }
        }
        return base2;
    }

    public PointF getEmptyResPool() {
        PointF pointF;
        MapTile tileFromObjectLayer;
        GameEngine instance = GameEngine.getInstance();
        float f = this.radius;
        instance.map.getClass();
        int i = (int) (f * 0.05f);
        instance.map.toGrid(this.x, this.y);
        int i2 = instance.map.returnX;
        int i3 = instance.map.returnY;
        int i4 = i2 - i;
        loop0: while (true) {
            if (i4 > i2 + i) {
                pointF = null;
                break;
            }
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (instance.map.isInMap(i4, i5) && (tileFromObjectLayer = instance.map.getTileFromObjectLayer(i4, i5)) != null && tileFromObjectLayer.resPool && Building.getBuilding(i4, i5) == null) {
                    instance.map.fromGrid(i4, i5);
                    this._returnPoint.set(instance.map.returnX, instance.map.returnY);
                    pointF = this._returnPoint;
                    break loop0;
                }
            }
            i4++;
        }
        return pointF;
    }

    public UnitType getNextWantedBuilding() {
        UnitType[] values;
        UnitType unitType = null;
        float f = -1.0f;
        for (UnitType unitType2 : UnitType.values()) {
            float f2 = -2.0f;
            if (unitType2 == UnitType.extractor) {
                int numOfBuildingType = numOfBuildingType(UnitType.extractor);
                f2 = -2.0f;
                if (getEmptyResPool() != null) {
                    f2 = -2.0f;
                    if (numOfBuildingType == 0) {
                        f2 = this.ai.credits < 4000 ? 0.98f : 0.75f;
                    }
                    if (numOfBuildingType == 1) {
                        f2 = 0.45f;
                    }
                    if (numOfBuildingType == 2) {
                        f2 = 0.3f;
                    }
                    if (numOfBuildingType == 3) {
                        f2 = 0.2f / numOfBuildingType;
                    }
                }
            }
            f2 = f2;
            if (unitType2 == UnitType.landFactory) {
                int numOfBuildingOnMapOfType = this.ai.numOfBuildingOnMapOfType(UnitType.landFactory);
                int numOfBuildingType2 = numOfBuildingType(UnitType.landFactory);
                if (numOfBuildingOnMapOfType == 0) {
                    f2 = 0.8f;
                }
                if (numOfBuildingOnMapOfType == 1) {
                    f2 = 0.6f / ((numOfBuildingType2 * 2) + numOfBuildingOnMapOfType);
                }
            }
            f2 = f2;
            if (unitType2 == UnitType.airFactory) {
                int numOfBuildingOnMapOfType2 = this.ai.numOfBuildingOnMapOfType(UnitType.airFactory);
                int numOfBuildingType3 = numOfBuildingType(UnitType.airFactory);
                if (numOfBuildingOnMapOfType2 == 0) {
                    f2 = 0.48f;
                }
                if (numOfBuildingOnMapOfType2 == 1) {
                    f2 = 0.29f / (numOfBuildingOnMapOfType2 + numOfBuildingType3);
                }
            }
            float f3 = f2;
            if (unitType2 == UnitType.turret) {
                int numOfBuildingType4 = numOfBuildingType(UnitType.turret);
                f3 = f2;
                if (numOfBuildingType4 == 0) {
                    f3 = 0.46f;
                }
                if (numOfBuildingType4 == 1) {
                    f3 = 0.4f / numOfBuildingType4;
                }
            }
            f3 = f3;
            if (unitType2 == UnitType.antiAirTurret) {
                int numOfBuildingType5 = numOfBuildingType(UnitType.antiAirTurret);
                if (numOfBuildingType5 == 0) {
                    f3 = 0.42f;
                }
                if (numOfBuildingType5 == 1) {
                    f3 = 0.3f / numOfBuildingType5;
                }
            }
            f = f;
            if (f3 > f) {
                f = f3;
                unitType = unitType2;
            }
        }
        this.lastWantedBuildingWeight = f;
        return unitType;
    }

    public int getNumberOfBuilders() {
        int i = 0;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this.ai && isOverlapping(next) && (next instanceof Builder)) {
                i++;
            }
        }
        return i;
    }

    public int getNumberOfBuildings() {
        int i = 0;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this.ai && isOverlapping(next) && (next instanceof Building)) {
                i++;
            }
        }
        return i;
    }

    public Unit getRandomEnemyInBase() {
        Unit unit;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (true) {
            if (it.hasNext()) {
                unit = it.next();
                if (isNear(unit) && unit.team.isEnemy(this.ai)) {
                    break;
                }
            } else {
                unit = null;
                break;
            }
        }
        return unit;
    }

    public boolean isUnsafe() {
        return getRandomEnemyInBase() != null;
    }

    public void moveSpareBuilders() {
        Builder idleBuilder;
        GameEngine instance = GameEngine.getInstance();
        Base closestBaseToBase = getClosestBaseToBase();
        if (closestBaseToBase != null && closestBaseToBase.getNumberOfBuilders() > 1 && (idleBuilder = closestBaseToBase.getIdleBuilder()) != null) {
            PointF randomPoint = getRandomPoint();
            CommandController.Command createNewCommand = instance.commandController.createNewCommand(this.ai);
            createNewCommand.addUnit(idleBuilder);
            createNewCommand.setMoveWaypoint(randomPoint.x, randomPoint.y);
            this.ai.aiDebug("find builder for request");
            this.requestedBuildersDelay = 1700.0f;
        }
    }

    public int numOfBuildingType(UnitType unitType) {
        int i = 0;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this.ai && isOverlapping(next) && (next instanceof Building) && ((Building) next).getUnitType() == unitType) {
                i++;
            }
        }
        return i;
    }

    public void slowUpdate(float f) {
        this.isUnsafeBaseCache = isUnsafe();
        this.buildBuildingDelay = CommonUtils.toZero(this.buildBuildingDelay, f);
        this.requestedBuildersDelay = CommonUtils.toZero(this.requestedBuildersDelay, f);
        this.builtBuildersDelay = CommonUtils.toZero(this.builtBuildersDelay, f);
        this.defendBaseCheckDelay = CommonUtils.toZero(this.defendBaseCheckDelay, f);
        if (this.defendBaseCheckDelay == 0.0f) {
            this.defendBaseCheckDelay = 100.0f;
            defendBase();
        }
        if (this.buildBuildingDelay == 0.0f) {
            UnitType nextWantedBuilding = getNextWantedBuilding();
            if (nextWantedBuilding != null && ((this.lastWantedBuildingWeight > 0.8d || this.ai.canBuy(1300)) && ((this.lastWantedBuildingWeight > 0.4d || this.ai.canBuy(1700)) && (this.lastWantedBuildingWeight > 0.2d || this.ai.canBuy(1900))))) {
                buildBuilding(nextWantedBuilding);
            }
            this.buildBuildingDelay = 230.0f;
        }
        int numberOfBuildings = getNumberOfBuildings();
        if (this.isUnsafeBaseCache) {
            this.allowedUnits = (float) (this.allowedUnits + (f * 0.025d));
        }
        if (this.lastWantedBuildingWeight < 0.5d) {
            if (this.ai.globalNumAttackingUnitsCache < 1) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 8.0E-4d * numberOfBuildings));
            } else {
                this.allowedUnits = (float) (this.allowedUnits + (f * 3.0E-4d * numberOfBuildings));
            }
            if (this.ai.canBuy(1900)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
            }
            if (this.ai.canBuy(2100)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
            }
        }
        if (!this.ai.canBuy(800) && !this.isUnsafeBaseCache && this.allowedUnits > 1.0f) {
            this.allowedUnits = 1.0f;
        }
        if (this.allowedUnits > 3.5f) {
            this.allowedUnits = 3.5f;
        }
        if (this.ai.globalNumAttackingUnitsCache >= 25) {
            return;
        }
        if ((this.ai.canBuy(1300) && this.allowedUnits >= 1.0f) || (this.ai.canBuy(300) && this.allowedUnits >= 3.0f)) {
            int realRand = CommonUtils.realRand(100);
            UnitType unitType = realRand < 15 ? UnitType.megaTank : realRand < 25 ? UnitType.artillery : realRand < 40 ? UnitType.helicopter : realRand < 45 ? UnitType.airShip : realRand < 50 ? UnitType.gunShip : realRand < 75 ? UnitType.hoverTank : UnitType.tank;
            boolean z = true;
            if (this.isUnsafeBaseCache) {
                Unit sharedObjectFromUnitType = Unit.getSharedObjectFromUnitType(unitType);
                Unit randomEnemyInBase = getRandomEnemyInBase();
                z = true;
                if (randomEnemyInBase != null) {
                    z = true;
                    if (!this.ai.isAttackingUnit(sharedObjectFromUnitType, randomEnemyInBase)) {
                        z = false;
                    }
                }
            }
            if (z && buildUnit(unitType)) {
                this.allowedUnits -= 1.0f;
            }
        }
    }

    public void verySlowUpdate(float f) {
        int numberOfBuilders = getNumberOfBuilders();
        int numberOfBuildings = getNumberOfBuildings();
        if (numberOfBuilders < 2 && this.builtBuildersDelay == 0.0f) {
            this.builtBuildersDelay = 300.0f;
            if (this.isUnsafeBaseCache) {
                this.ai.aiDebug("not getting/building builders, unsafe base");
            } else if (buildUnit(UnitType.builder)) {
                this.ai.aiDebug("built more required builders, we had" + numberOfBuilders);
                this.builtBuildersDelay = 900.0f;
            } else if (numberOfBuilders < 1 && this.requestedBuildersDelay == 0.0f) {
                this.ai.aiDebug("requesting builders to base");
                moveSpareBuilders();
            }
        }
        if (numberOfBuilders == 0 && numberOfBuildings == 0) {
            this.abandonedTimer += f;
        } else {
            this.abandonedTimer = CommonUtils.toZero(this.abandonedTimer, f);
        }
        if (this.abandonedTimer > 2400.0f) {
            this.ai.aiDebug("removing abandoned base");
            remove();
        }
        if (this.state == BaseStates.Pre && numberOfBuilders != 0 && numberOfBuildings != 0) {
            this.claimedBaseTimer += f;
            if (this.claimedBaseTimer > 2000.0f) {
                this.state = BaseStates.Active;
            }
        }
    }
}
