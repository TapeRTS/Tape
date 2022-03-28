package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Waypoint;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GroupController.class */
public class GroupController {
    PointF _centerPoint = new PointF();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GroupController$UnitGroup.class */
    public class UnitGroup {
        ArrayList<OrderableUnit> cacheList = new ArrayList<>();
        float cacheX;
        float cacheY;

        public UnitGroup() {
        }

        public void addUnit(OrderableUnit orderableUnit, Waypoint waypoint) {
            waypoint.group = this;
        }

        public void getGroupList() {
            OrderableUnit orderableUnit;
            Waypoint activeWaypoint;
            this.cacheList.clear();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (it.hasNext()) {
                GameObject next = it.next();
                if ((next instanceof OrderableUnit) && (activeWaypoint = (orderableUnit = (OrderableUnit) next).getActiveWaypoint()) != null && activeWaypoint.group == this) {
                    this.cacheList.add(orderableUnit);
                    this.cacheX = activeWaypoint.getRealX();
                    this.cacheY = activeWaypoint.getRealY();
                }
            }
        }

        public Waypoint getGroupWaypoint(OrderableUnit orderableUnit) {
            return orderableUnit.getActiveWaypoint();
        }

        public void setupGroup() {
            updateGroupLeaders();
        }

        public void updateGroupLeaders() {
            GameEngine instance = GameEngine.getInstance();
            getGroupList();
            GroupController.this._centerPoint.set(0.0f, 0.0f);
            Iterator<OrderableUnit> it = this.cacheList.iterator();
            while (it.hasNext()) {
                OrderableUnit next = it.next();
                next.leader = null;
                next.wasLeader = next.isLeader;
                next.isLeader = false;
                next.formationHasOffset = false;
                next.formationXOffset = 0.0f;
                next.formationYOffset = 0.0f;
                next.formationStartTime = instance.levelTime;
                GroupController.this._centerPoint.offset(next.x, next.y);
            }
            GroupController.this._centerPoint.set(GroupController.this._centerPoint.x / this.cacheList.size(), GroupController.this._centerPoint.y / this.cacheList.size());
            while (true) {
                float f = -1.0f;
                OrderableUnit orderableUnit = null;
                Iterator<OrderableUnit> it2 = this.cacheList.iterator();
                while (it2.hasNext()) {
                    OrderableUnit next2 = it2.next();
                    if (next2.leader == null && !next2.isLeader) {
                        float distanceSq = CommonUtils.distanceSq(this.cacheX, this.cacheY, next2.x, next2.y);
                        float f2 = distanceSq;
                        if (next2.wasLeader) {
                            f2 = distanceSq - 400.0f;
                        }
                        if (f == -1.0f || f2 < f) {
                            orderableUnit = next2;
                            f = f2;
                        }
                    }
                }
                if (orderableUnit != null) {
                    orderableUnit.isLeader = true;
                    int i = 0;
                    float f3 = 0.0f;
                    Iterator<OrderableUnit> it3 = this.cacheList.iterator();
                    while (it3.hasNext()) {
                        OrderableUnit next3 = it3.next();
                        float f4 = f3;
                        if (next3.radius > f3) {
                            f4 = next3.radius;
                        }
                        f3 = f4;
                        if (next3.leader == null) {
                            f3 = f4;
                            if (!next3.isLeader) {
                                f3 = f4;
                                if (next3.getMovementType().equals(orderableUnit.getMovementType())) {
                                    f3 = f4;
                                    if (CommonUtils.distanceSq(next3.x, next3.y, orderableUnit.x, orderableUnit.y) < 40000.0f) {
                                        f3 = f4;
                                        if (next3.getMoveSpeed() >= orderableUnit.getMoveSpeed() - 0.2d) {
                                            next3.leader = orderableUnit;
                                            i++;
                                            f3 = f4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i2 = 1;
                    int i3 = 0;
                    int i4 = 6 / 2;
                    float direction = CommonUtils.getDirection(GroupController.this._centerPoint.x, GroupController.this._centerPoint.y, this.cacheX, this.cacheY);
                    float f5 = 20.0f + f3;
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < i; i5++) {
                        float f6 = ((i2 % 2 == 0 ? i4 + (i2 / 2) : i4 - ((i2 + 1) / 2)) - i4) * f5;
                        float f7 = (-i3) * f5;
                        arrayList.add(new PointF((float) ((f7 * Math.cos(Math.toRadians(direction))) - (f6 * Math.sin(Math.toRadians(direction)))), (float) ((f6 * Math.cos(Math.toRadians(direction))) + (f7 * Math.sin(Math.toRadians(direction))))));
                        int i6 = i2 + 1;
                        i3 = i3;
                        i2 = i6;
                        if (i6 > 6) {
                            i2 = 0;
                            i3++;
                        }
                    }
                    while (!arrayList.isEmpty()) {
                        OrderableUnit orderableUnit2 = null;
                        float f8 = -1.0f;
                        PointF pointF = null;
                        Iterator<OrderableUnit> it4 = this.cacheList.iterator();
                        while (it4.hasNext()) {
                            OrderableUnit next4 = it4.next();
                            if (next4.leader == orderableUnit && !next4.formationHasOffset) {
                                float f9 = -1.0f;
                                PointF pointF2 = null;
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    PointF pointF3 = (PointF) it5.next();
                                    float distanceSq2 = CommonUtils.distanceSq(next4.x, next4.y, orderableUnit.x + pointF3.x, orderableUnit.y + pointF3.y);
                                    if (f9 == -1.0f || distanceSq2 < f9) {
                                        f9 = distanceSq2;
                                        pointF2 = pointF3;
                                    }
                                }
                                if (f9 > f8) {
                                    orderableUnit2 = next4;
                                    f8 = f9;
                                    pointF = pointF2;
                                }
                            }
                        }
                        if (orderableUnit2 != null) {
                            orderableUnit2.formationHasOffset = true;
                            orderableUnit2.formationXOffset = pointF.x;
                            orderableUnit2.formationYOffset = pointF.y;
                            orderableUnit2.formationDir = direction;
                            arrayList.remove(pointF);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public UnitGroup createGroup() {
        return new UnitGroup();
    }

    public void update(float f) {
    }
}
