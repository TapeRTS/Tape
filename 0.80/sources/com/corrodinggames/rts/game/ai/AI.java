package com.corrodinggames.rts.game.ai;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.jar:com/corrodinggames/rts/game/ai/AI.class */
public class AI extends Team {
    int attackState;
    boolean disabled;
    int globalNumAttackingUnitsCache;
    boolean missionMode;
    float slowUpdateTimePast;
    float verySlowUpdateTimePast;
    ConcurrentLinkedQueue<Zone> zones = new ConcurrentLinkedQueue<>();
    ArrayList<Zone> fastZones = new ArrayList<>();
    PointF _returnPoint = new PointF();
    Zone _tmpZone = new Zone(this);
    float slowUpdateDelay = 100.0f;
    float verySlowUpdateDelay = 200.0f;
    float doAttackDelay = 4200.0f;
    float makeNewBaseDelay = 3500.0f;

    public AI(int i) {
        super(i);
    }

    private boolean isBaseLocationGood(PointF pointF) {
        boolean z;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (true) {
            if (it.hasNext()) {
                Unit next = it.next();
                if ((next instanceof CommandCenter) && next.team.isEnemy(this) && unitWithinRange(next, pointF.x, pointF.y, 300)) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    public void aiDebug(String str) {
        GameEngine.log("ai_debug(" + this.id + ")", str);
    }

    Base getClosestBase(Unit unit) {
        float f = -1.0f;
        Base base = null;
        Iterator<Zone> it = this.zones.iterator();
        while (it.hasNext()) {
            Zone next = it.next();
            if (next instanceof Base) {
                Base base2 = (Base) next;
                float disSq = base2.getDisSq(unit);
                if (base == null || disSq < f) {
                    f = disSq;
                    base = base2;
                }
            }
        }
        return base;
    }

    Base getCurrentBase(float f, float f2) {
        Base base;
        Iterator<Zone> it = this.zones.iterator();
        while (true) {
            if (!it.hasNext()) {
                base = null;
                break;
            }
            Zone next = it.next();
            if (next instanceof Base) {
                base = (Base) next;
                if (base.isOverlapping(f, f2)) {
                    break;
                }
            }
        }
        return base;
    }

    Base getCurrentBase(Unit unit) {
        Base base;
        Iterator<Zone> it = this.zones.iterator();
        while (true) {
            if (!it.hasNext()) {
                base = null;
                break;
            }
            Zone next = it.next();
            if (next instanceof Base) {
                Base base2 = (Base) next;
                if (base2.isOverlapping(unit)) {
                    base = base2;
                    break;
                }
            }
        }
        return base;
    }

    public PointF getRandomResPool() {
        PointF pointF;
        GameEngine instance = GameEngine.getInstance();
        if (instance.map.resPools.size() == 0) {
            pointF = null;
        } else {
            Point point = instance.map.resPools.get(CommonUtils.realRand(instance.map.resPools.size()));
            instance.map.fromGrid(point.x, point.y);
            this._returnPoint.set(instance.map.returnX, instance.map.returnY);
            pointF = this._returnPoint;
        }
        return pointF;
    }

    public boolean isAttackingUnit(Unit unit, Unit unit2) {
        boolean z;
        if (this.survivalAttacker) {
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.isIdle() && orderableUnit.canAttackUnit(unit2)) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = isAttackingUnitGenerally(unit) && (unit instanceof OrderableUnit) && ((OrderableUnit) unit).canAttackUnit(unit2);
        }
        return z;
    }

    public boolean isAttackingUnitGenerally(Unit unit) {
        boolean z;
        if (unit instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit;
            if (!(orderableUnit instanceof Building) && orderableUnit.canAttack()) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    public int numOfBuildingOnMapOfType(UnitType unitType) {
        int i = 0;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this && (next instanceof Building) && ((Building) next).getUnitType() == unitType) {
                i++;
            }
        }
        return i;
    }

    public void slowUpdate(float f) {
        int i;
        Waypoint activeWaypoint;
        GameEngine instance = GameEngine.getInstance();
        Iterator<Zone> it = this.zones.iterator();
        while (it.hasNext()) {
            Zone next = it.next();
            if (next instanceof Base) {
                ((Base) next).slowUpdate(f);
            }
        }
        this.doAttackDelay = CommonUtils.toZero(this.doAttackDelay, f);
        int i2 = 0;
        Iterator<Zone> it2 = this.fastZones.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof Base) {
                i2++;
            }
        }
        if (i2 < 1) {
            Iterator<Unit> it3 = Unit.fastUnitList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Unit next2 = it3.next();
                    if (next2.team == this && (next2 instanceof Builder)) {
                        Base base = new Base(this, next2.x, next2.y);
                        base.radius = 420.0f;
                        base.state = BaseStates.Active;
                        base.type = BaseType.Main;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Iterator<Unit> it4 = Unit.fastLiveUnitList.iterator();
        while (it4.hasNext()) {
            Unit next3 = it4.next();
            if (next3.team == this && (next3 instanceof Builder)) {
                Builder builder = (Builder) next3;
                if (getCurrentBase(builder) != null) {
                    if (builder.isIdle()) {
                    }
                } else if (builder.isIdle()) {
                    PointF randomPoint = getClosestBase(builder).getRandomPoint();
                    CommandController.Command createNewCommand = instance.commandController.createNewCommand(this);
                    createNewCommand.addUnit(builder);
                    createNewCommand.setMoveWaypoint(randomPoint.x, randomPoint.y);
                }
            }
        }
        Iterator<Unit> it5 = Unit.fastLiveUnitList.iterator();
        while (it5.hasNext()) {
            Unit next4 = it5.next();
            if (next4.team == this && (next4 instanceof OrderableUnit)) {
                OrderableUnit orderableUnit = (OrderableUnit) next4;
                if (orderableUnit.currentWaypointTime > 2400.0f) {
                    orderableUnit.completeActiveWaypoint();
                }
                if ((orderableUnit instanceof Builder) && (activeWaypoint = orderableUnit.getActiveWaypoint()) != null && activeWaypoint.getType() == Waypoint.WaypointType.build && orderableUnit.currentWaypointTime > 700.0f) {
                    orderableUnit.completeActiveWaypoint();
                }
            }
        }
        if (this.survivalAttacker && this.doAttackDelay > 30.0f) {
            this.doAttackDelay = 30.0f;
        }
        if (this.doAttackDelay == 0.0f) {
            this.attackState++;
            if (this.attackState == 1) {
                this.doAttackDelay = 1000.0f;
            } else if (this.attackState == 2) {
                this.doAttackDelay = 3000.0f;
                Unit unit = null;
                int i3 = 0;
                Iterator<Unit> it6 = Unit.fastLiveUnitList.iterator();
                while (it6.hasNext()) {
                    Unit next5 = it6.next();
                    if (!next5.dead && next5.transportedBy == null && isEnemy(next5.team)) {
                        i3++;
                    }
                }
                int random = (int) (Math.random() * i3);
                int i4 = 0;
                Iterator<Unit> it7 = Unit.fastLiveUnitList.iterator();
                while (it7.hasNext()) {
                    Unit next6 = it7.next();
                    if (!next6.dead && next6.transportedBy == null && isEnemy(next6.team)) {
                        if (i4 == random) {
                            unit = next6;
                        }
                        i4++;
                    }
                }
                if (unit != null) {
                    if (this.survivalAttacker) {
                        i = 0;
                    } else {
                        i = 2;
                        if (this.globalNumAttackingUnitsCache < 4) {
                            i = 5;
                        }
                    }
                    CommandController.Command createNewCommand2 = instance.commandController.createNewCommand(this);
                    Iterator<Unit> it8 = Unit.fastLiveUnitList.iterator();
                    while (it8.hasNext()) {
                        Unit next7 = it8.next();
                        if (next7.team == this && (next7 instanceof OrderableUnit)) {
                            OrderableUnit orderableUnit2 = (OrderableUnit) next7;
                            if (!orderableUnit2.createdFromMap && isAttackingUnit(orderableUnit2, unit)) {
                                if (i <= 0) {
                                    createNewCommand2.addUnit(orderableUnit2);
                                } else {
                                    i--;
                                }
                            }
                        }
                    }
                    createNewCommand2.setAttackWaypoint(unit);
                }
            } else {
                this.attackState = 0;
            }
        }
    }

    public boolean unitWithinRange(Unit unit, float f, float f2, int i) {
        float f3 = i;
        return CommonUtils.distanceSq(unit.x, unit.y, f, f2) < f3 * f3;
    }

    @Override // com.corrodinggames.rts.game.Team
    public void update(float f) {
        if (!this.disabled) {
            this.slowUpdateDelay += f;
            this.slowUpdateTimePast += f;
            if (this.slowUpdateDelay > 50.0f) {
                slowUpdate(this.slowUpdateTimePast);
                this.slowUpdateDelay = 0.0f;
                this.slowUpdateTimePast = 0.0f;
            }
            this.verySlowUpdateDelay += f;
            this.verySlowUpdateTimePast += f;
            if (this.verySlowUpdateDelay > 100.0f) {
                verySlowUpdate(this.verySlowUpdateTimePast);
                this.verySlowUpdateDelay = 0.0f;
                this.verySlowUpdateTimePast = 0.0f;
            }
        }
    }

    public void verySlowUpdate(float f) {
        CommandController.Command createNewCommand = GameEngine.getInstance().commandController.createNewCommand(this);
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.team == this && (next instanceof OrderableUnit)) {
                createNewCommand.addUnit((OrderableUnit) next);
            }
        }
        createNewCommand.setAttackMode(OrderableUnit.AttackMode.outOfRange);
        int i = 0;
        Iterator<Unit> it2 = Unit.fastLiveUnitList.iterator();
        while (it2.hasNext()) {
            if (it2.next().team == this) {
                i++;
            }
        }
        if (i == 0 && !this.survivalAttacker) {
            this.disabled = true;
        }
        Iterator<Zone> it3 = this.zones.iterator();
        while (it3.hasNext()) {
            Zone next2 = it3.next();
            if (next2 instanceof Base) {
                ((Base) next2).verySlowUpdate(f);
            }
        }
        this.makeNewBaseDelay = CommonUtils.toZero(this.makeNewBaseDelay, f);
        if (this.makeNewBaseDelay == 0.0f) {
            PointF randomResPool = getRandomResPool();
            if (getCurrentBase(randomResPool.x, randomResPool.y) == null && isBaseLocationGood(randomResPool)) {
                this.makeNewBaseDelay = 3000.0f;
                Base base = new Base(this, randomResPool.x, randomResPool.y);
                base.radius = 340.0f;
                base.state = BaseStates.Pre;
                base.type = BaseType.ResourceOutpost;
                aiDebug("making new base on res pool");
            }
        }
        this.globalNumAttackingUnitsCache = 0;
        Iterator<Unit> it4 = Unit.fastLiveUnitList.iterator();
        while (it4.hasNext()) {
            Unit next3 = it4.next();
            if (next3.team == this && (next3 instanceof OrderableUnit) && isAttackingUnitGenerally((OrderableUnit) next3)) {
                this.globalNumAttackingUnitsCache++;
            }
        }
    }
}
