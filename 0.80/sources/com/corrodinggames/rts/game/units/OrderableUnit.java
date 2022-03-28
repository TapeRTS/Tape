package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.GroupController;
import com.corrodinggames.rts.gameFramework.PathEngine;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/OrderableUnit.class */
public abstract class OrderableUnit extends ActiveUnit {
    static final int maxPathNodes = 60;
    static final int maxWaypoints = 30;
    protected Paint _imagePaint;
    float collidingTimer;
    protected float currentShootDelay;
    public float currentWaypointTime;
    protected BitmapOrTexture image;
    protected BitmapOrTexture imageShadow;
    public boolean isLeader;
    public OrderableUnit leader;
    private float passiveAttackCheckDelay;
    private Unit passivelyAttacking;
    float pathToLeaderTimer;
    boolean pathing_active;
    float pathing_delay;
    float pathing_pointX;
    float pathing_pointY;
    private float repairEffectDelay;
    public boolean wasLeader;
    static PointF lowerLeft = new PointF();
    static PointF upperRight = new PointF();
    static PointF upperLeft = new PointF();
    static PointF lowerRight = new PointF();
    protected static PointF _pointF = new PointF();
    Paint _shadowPaint = new Paint();
    private int waypointsCount = 0;
    private Waypoint[] waypoints = new Waypoint[30];
    public AttackMode attackMode = AttackMode.onlyInRange;
    Rect r = new Rect();
    PointF v1 = new PointF();
    PointF v2 = new PointF();
    PointF _return = new PointF();
    public boolean formationHasOffset = false;
    public float formationXOffset = 0.0f;
    public float formationYOffset = 0.0f;
    public float formationDir = 0.0f;
    public int formationStartTime = 0;
    private PathNode[] activePath = new PathNode[60];
    private int activePathCount = 0;
    private int activePathTotalCount = 0;
    RectF _tempF = new RectF();
    Rect _temp = new Rect();

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/OrderableUnit$AttackMode.class */
    public strict enum AttackMode {
        outOfRange,
        onlyInRange,
        returnFire,
        holdFire
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/OrderableUnit$PathNode.class */
    public strict class PathNode {
        float x;
        float y;

        public PathNode() {
        }
    }

    public OrderableUnit() {
        for (int i = 0; i < 30; i++) {
            this.waypoints[i] = new Waypoint();
        }
        for (int i2 = 0; i2 < 60; i2++) {
            this.activePath[i2] = new PathNode();
        }
        this._imagePaint = new Paint();
        if (GameEngine.getInstance().settings.renderAntiAlias) {
            this._imagePaint.setAntiAlias(true);
            this._imagePaint.setFilterBitmap(true);
            this._imagePaint.setDither(true);
        }
    }

    public Waypoint addAttackWaypoint(Unit unit) {
        Waypoint nextFreeWaypoint = getNextFreeWaypoint();
        nextFreeWaypoint.setAttack(unit);
        return nextFreeWaypoint;
    }

    public Waypoint addBuildWaypoint(float f, float f2, UnitType unitType) {
        Waypoint nextFreeWaypoint = getNextFreeWaypoint();
        nextFreeWaypoint.setBuild(f, f2, unitType);
        return nextFreeWaypoint;
    }

    public Waypoint addMoveWaypoint(float f, float f2) {
        Waypoint nextFreeWaypoint = getNextFreeWaypoint();
        nextFreeWaypoint.setMove(f, f2);
        return nextFreeWaypoint;
    }

    public Waypoint addWaypointByCopy(Waypoint waypoint) {
        Waypoint nextFreeWaypoint = getNextFreeWaypoint();
        nextFreeWaypoint.set(waypoint);
        return nextFreeWaypoint;
    }

    public abstract boolean canAttack();

    public boolean canAttackUnit(Unit unit) {
        return true;
    }

    public abstract boolean canMove();

    public void clearAllWaypoints() {
        this.currentWaypointTime = 0.0f;
        this.waypointsCount = 0;
        clearPath();
        stopFollowersFollowing();
        this.leader = null;
    }

    public void clearPath() {
        this.activePathCount = 0;
        this.activePathTotalCount = 0;
        this.pathing_delay = 0.0f;
    }

    public PointF collideWithTile(float f, float f2, float f3, float f4, int i, int i2) {
        char c;
        char c2;
        PointF pointF;
        GameEngine instance = GameEngine.getInstance();
        this.r.set(i, i2, i + 1, i2 + 1);
        this.v1.set(f, f2);
        this.v2.set(f3, f4);
        this._return.set(this.v2);
        lowerLeft.set(this.r.left, this.r.bottom);
        upperRight.set(this.r.right, this.r.top);
        upperLeft.set(this.r.left, this.r.top);
        lowerRight.set(this.r.right, this.r.bottom);
        if (this.v1.y < this.v2.y) {
            c = 65535;
            if (!instance.path.isTileImpassable(getMovementType(), i, i2 - 1)) {
                c = 65535;
                if (CommonUtils.lineIntersectLine(this.v1, this.v2, upperLeft, upperRight)) {
                    c = 3;
                }
            }
        } else {
            c = 65535;
            if (!instance.path.isTileImpassable(getMovementType(), i, i2 + 1)) {
                c = 65535;
                if (CommonUtils.lineIntersectLine(this.v1, this.v2, lowerLeft, lowerRight)) {
                    c = 1;
                }
            }
        }
        if (this.v1.x < this.v2.x) {
            c2 = c;
            if (!instance.path.isTileImpassable(getMovementType(), i - 1, i2)) {
                c2 = c;
                if (CommonUtils.lineIntersectLine(this.v1, this.v2, upperLeft, lowerLeft)) {
                    c2 = 2;
                }
            }
        } else {
            c2 = c;
            if (!instance.path.isTileImpassable(getMovementType(), i + 1, i2)) {
                c2 = c;
                if (CommonUtils.lineIntersectLine(this.v1, this.v2, upperRight, lowerRight)) {
                    c2 = 0;
                }
            }
        }
        if (c2 == 65535) {
            pointF = null;
        } else {
            if (c2 == 0) {
                this._return.x = i + 1 + 0.01f;
            }
            if (c2 == 2) {
                this._return.x = i - 0.01f;
            }
            if (c2 == 1) {
                this._return.y = i2 + 1 + 0.01f;
            }
            if (c2 == 3) {
                this._return.y = i2 - 0.01f;
            }
            pointF = this._return;
        }
        return pointF;
    }

    public void completeActivePathNode() {
        if (this.activePathCount != 0) {
            if (this.activePathCount == 1) {
                this.activePathCount = 0;
                return;
            }
            PathNode pathNode = this.activePath[0];
            for (int i = 0; i < 59; i++) {
                this.activePath[i] = this.activePath[i + 1];
            }
            this.activePath[59] = pathNode;
            this.activePathCount--;
        }
    }

    public void completeActiveWaypoint() {
        this.currentWaypointTime = 0.0f;
        if (this.waypointsCount != 0) {
            if (this.waypointsCount == 1) {
                this.waypointsCount = 0;
                return;
            }
            Waypoint waypoint = this.waypoints[0];
            for (int i = 0; i < 29; i++) {
                this.waypoints[i] = this.waypoints[i + 1];
            }
            this.waypoints[29] = waypoint;
            this.waypointsCount--;
            clearPath();
        }
    }

    public void delayPathing() {
        this.pathing_delay = (float) (Math.random() * 120.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0465, code lost:
        if (r0 >= (r22 * r22)) goto L_0x0468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04a7, code lost:
        if (r0 < (r22 * r22)) goto L_0x04aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05e1, code lost:
        if (r9.leader.getActiveWaypoint().type != com.corrodinggames.rts.game.units.Waypoint.WaypointType.build) goto L_0x05e4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doWaypoints(float r10) {
        /*
            Method dump skipped, instructions count: 2939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.OrderableUnit.doWaypoints(float):void");
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        super.draw(f);
        GameEngine instance = GameEngine.getInstance();
        if (shouldDrawCheck()) {
            drawShadow();
            this._dst.set(getImageDstRect());
            this._dst.offset(0.0f, (int) (-this.height));
            if (RectF.intersects(instance.viewpointRectF, this._dst)) {
                this._src.set(getImageSrcRect(false));
                instance.graphics.getCanvas().save();
                instance.graphics.getCanvas().rotate(getDrawBaseDir(), this._dst.centerX(), this._dst.centerY());
                Paint paint = this._imagePaint;
                if (this.height < 0.0f) {
                    this._imagePaint.setARGB((int) (((1.0f - ((-this.height) / 10.0f)) * 180.0f) + 75.0f), 255, 255, 255);
                    paint = this._imagePaint;
                }
                instance.graphics.drawImage(this.image, this._src, this._dst, paint);
                instance.graphics.getCanvas().restore();
            }
        }
    }

    public void drawShadow() {
        if (this.imageShadow != null && this.height > 0.0f) {
            GameEngine instance = GameEngine.getInstance();
            this._dst.set(getImageDstRect());
            if (RectF.intersects(instance.viewpointRectF, this._dst)) {
                this._src.set(getImageSrcRect(true));
                instance.graphics.getCanvas().save();
                instance.graphics.getCanvas().rotate(getDrawBaseDir(), this._dst.centerX(), this._dst.centerY());
                this._shadowPaint.setARGB(128, 255, 255, 255);
                instance.graphics.drawImage(this.imageShadow, this._src, this._dst, this._shadowPaint);
                instance.graphics.getCanvas().restore();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void drawUnder(float f) {
        super.drawUnder(f);
    }

    public abstract void fireProjectile(Unit unit);

    public PathNode getActivePathNode() {
        return this.activePathCount == 0 ? null : this.activePath[0];
    }

    public Waypoint getActiveWaypoint() {
        return this.waypointsCount == 0 ? null : this.waypoints[0];
    }

    public float getDrawBaseDir() {
        return this.dir + 90.0f;
    }

    public RectF getImageDstRect() {
        GameEngine instance = GameEngine.getInstance();
        this._tempF.set((this.x - (this.objectWidth / 2)) - instance.viewpointX_rounded, (this.y - (this.objectHeight / 2)) - instance.viewpointY_rounded, (this.x + (this.objectWidth / 2)) - instance.viewpointX_rounded, (this.y + (this.objectHeight / 2)) - instance.viewpointY_rounded);
        return this._tempF;
    }

    public Rect getImageSrcRect(boolean z) {
        this._temp.set(0, 0, this.objectWidth + 0, this.objectHeight + 0);
        return this._temp;
    }

    public abstract float getMaxAttackRange();

    public float getMoveAccelerationSpeed() {
        return 99.0f;
    }

    public float getMoveDecelerationSpeed() {
        return 99.0f;
    }

    public int getMoveSlidingDir() {
        return -1;
    }

    public abstract float getMoveSpeed();

    public void getNewPath(float f, float f2) {
        PathEngine pathEngine = GameEngine.getInstance().path;
        Map map = GameEngine.getInstance().map;
        this.moving = true;
        if (isFlying()) {
            this.activePathCount = 0;
            float restrictXInPixels = map.restrictXInPixels(f);
            float restrictYInPixels = map.restrictYInPixels(f2);
            this.activePath[this.activePathCount].x = restrictXInPixels;
            this.activePath[this.activePathCount].y = restrictYInPixels;
            this.activePathCount++;
            this.activePathTotalCount = this.activePathCount;
            return;
        }
        pathEngine.startNew();
        map.toGrid(this.x, this.y);
        pathEngine.setSrc(getMovementType(), (short) map.returnX, (short) map.returnY);
        map.toGrid(f, f2);
        pathEngine.setEnd((short) map.returnX, (short) map.returnY, (short) 0);
        pathEngine.findPath();
        this.activePathCount = 0;
        Iterator<PathEngine.Node> it = pathEngine.foundPath.iterator();
        while (it.hasNext()) {
            PathEngine.Node next = it.next();
            map.fromGrid(next.x, next.y);
            int i = map.returnX;
            map.getClass();
            float f3 = i + 10;
            int i2 = map.returnY;
            map.getClass();
            this.activePath[this.activePathCount].x = f3;
            this.activePath[this.activePathCount].y = i2 + 10;
            this.activePathCount++;
            if (this.activePathCount >= 60) {
                break;
            }
        }
        this.activePathTotalCount = this.activePathCount;
    }

    public Waypoint getNextFreeWaypoint() {
        Waypoint waypoint = this.waypoints[this.waypointsCount];
        waypoint.clear();
        if (this.waypointsCount < 29) {
            this.waypointsCount++;
        }
        return waypoint;
    }

    PathNode getPathNodeByIndex(int i) {
        return i >= this.activePathCount ? null : this.activePath[i];
    }

    public abstract float getShootDelay();

    public abstract float getTurnSpeed();

    public abstract float getTurrentTurnSpeed();

    public PointF getTurretEnd() {
        float turretSize = getTurretSize();
        float f = isFixedFiring() ? this.dir : this.turretDir;
        _pointF.set(this.x + (CommonUtils.cos(f) * turretSize), this.y + (CommonUtils.sin(f) * turretSize));
        return _pointF;
    }

    public float getTurretSize() {
        return 0.0f;
    }

    public boolean isFixedFiring() {
        return false;
    }

    public boolean isIdle() {
        return getActiveWaypoint() == null;
    }

    public boolean isInFiringRange(Unit unit) {
        return CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y) < getMaxAttackRange() * getMaxAttackRange();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean isOnScreen() {
        GameEngine instance = GameEngine.getInstance();
        this._dst.set(getImageDstRect());
        return RectF.intersects(instance.viewpointRectF, this._dst);
    }

    public boolean isOverWater() {
        GameEngine instance = GameEngine.getInstance();
        instance.map.toGrid(this.x, this.y);
        MapTile tileFromMainLayer = instance.map.getTileFromMainLayer(instance.map.returnX, instance.map.returnY);
        return tileFromMainLayer == null ? false : tileFromMainLayer.water;
    }

    public boolean isPassiveTarget(Unit unit) {
        boolean z;
        if (this.attackMode == AttackMode.holdFire) {
            z = false;
        } else if (this.attackMode == AttackMode.returnFire) {
            z = false;
        } else if (unit.dead || !this.team.isEnemy(unit.team)) {
            z = false;
        } else if (unit.transportedBy != null) {
            z = false;
        } else if (!canAttackUnit(unit)) {
            z = false;
        } else {
            float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
            if (this.attackMode == AttackMode.onlyInRange || this.attackMode == AttackMode.outOfRange) {
                if (distanceSq < (this.attackMode == AttackMode.onlyInRange ? getMaxAttackRange() * getMaxAttackRange() : (getMaxAttackRange() + 200.0f) * (getMaxAttackRange() + 200.0f))) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public void leaveScorchMark() {
        if (!isOverWater()) {
            ScorchMark.create(this.x, this.y);
        }
    }

    public boolean resetTurret() {
        return true;
    }

    public void rotateBody(float f) {
        this.dir += f;
        this.turretDir += f;
    }

    public void seeThoughFogOfWar() {
        GameEngine instance = GameEngine.getInstance();
        if (this.team == instance.playerTeam && this.transportedBy == null) {
            instance.map.seeThoughFogOfWar(this.x, this.y, 14);
        }
    }

    public void stopFollowersFollowing() {
        Waypoint activeWaypoint;
        GroupController.UnitGroup unitGroup;
        OrderableUnit orderableUnit = null;
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) next;
                if (orderableUnit2.leader == this) {
                    orderableUnit2.leader = null;
                    orderableUnit = orderableUnit2;
                }
            }
        }
        if (orderableUnit != null && (activeWaypoint = orderableUnit.getActiveWaypoint()) != null && (unitGroup = activeWaypoint.group) != null) {
            unitGroup.updateGroupLeaders();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
        if (r8.yPush != 0.0f) goto L_0x00ef;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01aa, code lost:
        if (r0 != r0) goto L_0x01ad;
     */
    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(float r9) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.OrderableUnit.update(float):void");
    }
}
