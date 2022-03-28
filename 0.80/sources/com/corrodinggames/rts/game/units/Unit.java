package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.air.AirUnit;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.land.HoverUnit;
import com.corrodinggames.rts.game.units.land.LandUnit;
import com.corrodinggames.rts.game.units.water.WaterUnit;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.PhysicalObject;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/Unit.class */
public abstract class Unit extends PhysicalObject {
    public static final float seaFloorHeight = -10.0f;
    public float dir;
    public float displayRadius;
    public Unit dontCollideExit;
    public float dontCollideExitDelay;
    public float factoryExitDelay;
    public float hp;
    public float maxHp;
    public boolean miniMapCacheDraw;
    public int miniMapXCache;
    public int miniMapYCache;
    public boolean moving;
    public float radius;
    public boolean selected;
    public Team team;
    public boolean tempBoolean;
    public float tempFloat;
    public int tempInt;
    public float turretDir;
    public float turretLockDelay;
    public static ArrayList<Unit> fastUnitList = new ArrayList<>();
    public static ArrayList<Unit> fastLiveUnitList = new ArrayList<>();
    public static HashMap<UnitType, Unit> sharedUnitTypeList = new HashMap<>();
    static Paint iconSelectedPaint = new Paint();
    static LightingColorFilter iconSelectedPaintFilter = new LightingColorFilter(Color.rgb(255, 255, 255), Color.rgb(100, 100, 100));
    public static final Paint selectedPaint = new Paint();
    public static final Paint selectedPaintEnemy = new Paint();
    public static Paint tempPaint = new Paint();
    public boolean createdFromMap = false;
    public Unit dontCollideWith = null;
    public boolean collidable = true;
    public boolean dead = false;
    public long dead_time = 0;
    public float xPush = 0.0f;
    public float yPush = 0.0f;
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;
    public float speed = 0.0f;
    public float built = 1.0f;
    public boolean preview = false;
    public boolean previewValidSpot = false;
    RectF _rect = new RectF();
    protected RectF _dst = new RectF();
    protected Rect _dstInt = new Rect();
    protected Rect _src = new Rect();
    public Unit transportedBy = null;

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/Unit$MovementType.class */
    public enum MovementType {
        NONE,
        LAND,
        AIR,
        WATER,
        HOVER
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/Unit$SpecialAction.class */
    public static abstract class SpecialAction {
        public String getButtonText(Unit unit) {
            String text = getText();
            int queueCount = queueCount(unit);
            String str = text;
            if (queueCount != -1) {
                str = text;
                if (queueCount != 0) {
                    str = String.valueOf(text) + " (" + queueCount + ")";
                }
            }
            return str;
        }

        public UnitType getCreatedUnitType() {
            return null;
        }

        public abstract String getDescription();

        public abstract int getIndex();

        public String getInfoBoxText() {
            return String.valueOf(getText()) + " ($" + getPrice() + ")\n" + getDescription();
        }

        public abstract int getPrice();

        public abstract String getText();

        public boolean isActive(Unit unit) {
            return unit.team.canBuy(getPrice());
        }

        public boolean queueAble() {
            return false;
        }

        public abstract int queueCount(Unit unit);

        public boolean showPopupWindow() {
            return false;
        }
    }

    static {
        iconSelectedPaint.setARGB(255, 255, 255, 255);
        iconSelectedPaint.setColorFilter(iconSelectedPaintFilter);
        selectedPaint.setARGB(180, 0, 255, 0);
        selectedPaint.setStyle(Paint.Style.STROKE);
        selectedPaint.setStrokeWidth(1.0f);
        selectedPaintEnemy.setARGB(180, 255, 0, 0);
        selectedPaintEnemy.setStyle(Paint.Style.STROKE);
        selectedPaintEnemy.setStrokeWidth(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Unit() {
        fastUnitList.add(this);
        fastLiveUnitList.add(this);
    }

    public static Unit getSharedObjectFromUnitType(UnitType unitType) {
        return sharedUnitTypeList.get(unitType);
    }

    public static void loadAllUnits() {
        LandUnit.load();
        Building.load();
        HoverUnit.load();
        WaterUnit.load();
        AirUnit.load();
        Iterator it = EnumSet.allOf(UnitType.class).iterator();
        while (it.hasNext()) {
            ((UnitType) it.next()).load();
        }
    }

    public static void loadSharedUnitTypeList() {
        sharedUnitTypeList.clear();
        Iterator it = EnumSet.allOf(UnitType.class).iterator();
        while (it.hasNext()) {
            UnitType unitType = (UnitType) it.next();
            Unit createInstance = unitType.createInstance();
            if (createInstance != null) {
                createInstance.remove();
            }
            sharedUnitTypeList.put(unitType, createInstance);
        }
    }

    public boolean canBeTransported(Unit unit) {
        return false;
    }

    public void destroy() {
        GameEngine instance = GameEngine.getInstance();
        instance.interfaceEngine.unselectUnit(this);
        this.dead = true;
        this.dead_time = instance.levelTime;
        fastLiveUnitList.remove(this);
        if (!destroyEffectAndWreak()) {
            remove();
        }
    }

    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmallExplosion(this.x, this.y, this.height);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public boolean drawIcon(float f) {
        boolean z;
        BitmapOrTexture icon = getIcon();
        if (icon == null) {
            z = false;
        } else if (this.dead) {
            z = true;
        } else if (this.transportedBy != null) {
            z = true;
        } else if (!notInFogOfWarForPlayer()) {
            z = true;
        } else {
            GameEngine instance = GameEngine.getInstance();
            instance.graphics.getCanvas().restore();
            float f2 = (int) (this.x - instance.viewpointX_rounded);
            float f3 = (int) (this.y - instance.viewpointY_rounded);
            float f4 = f2 * instance.viewpointZoom;
            float f5 = f3 * instance.viewpointZoom;
            this._dstInt.set(((int) f4) - (icon.getWidth() / 2), ((int) f5) - (icon.getHeight() / 2), ((int) (f4 - (icon.getWidth() / 2))) + icon.getWidth(), ((int) (f5 - (icon.getHeight() / 2))) + icon.getHeight());
            this._src.set(0, 0, icon.getWidth(), icon.getHeight());
            Paint paint = null;
            if (this.selected) {
                paint = iconSelectedPaint;
            }
            instance.graphics.drawImage(icon, this._src, this._dstInt, paint);
            instance.graphics.getCanvas().save();
            instance.setViewpointZoom(instance.graphics.getCanvas());
            z = true;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawInterface(float f) {
        if (this.selected) {
            GameEngine instance = GameEngine.getInstance();
            instance.graphics.getCanvas().drawCircle((int) (this.x - instance.viewpointX_rounded), (int) (this.y - instance.viewpointY_rounded), this.displayRadius, this.team == instance.playerTeam ? selectedPaint : selectedPaintEnemy);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r0.settings.showHp != false) goto L_0x0041;
     */
    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawOver(float r8) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.Unit.drawOver(float):void");
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawUnder(float f) {
    }

    public void fromLoadedMap() {
    }

    public int getBlockBar() {
        return -1;
    }

    public int getBlockBarMax() {
        return -1;
    }

    public int getBuildRange() {
        return 70;
    }

    public float getHpBar() {
        return this.hp < this.maxHp ? this.hp / this.maxHp : -1.0f;
    }

    public BitmapOrTexture getIcon() {
        return null;
    }

    public float getMass() {
        return 3000.0f;
    }

    public abstract MovementType getMovementType();

    public float getSecBar() {
        return this.built < 1.0f ? this.built : -1.0f;
    }

    public SpecialAction getSpecialAction(int i) {
        return null;
    }

    public boolean getSpecialActionActive(int i) {
        return getSpecialAction(i).isActive(this);
    }

    public String getSpecialActionText(int i) {
        return getSpecialAction(i).getText();
    }

    public abstract UnitType getUnitType();

    public void giveSpecialActionOrder(SpecialAction specialAction, boolean z) {
    }

    public boolean isActive() {
        return this.transportedBy != null ? false : this.built >= 1.0f;
    }

    public abstract boolean isFlying();

    public abstract boolean isOnScreen();

    public boolean notInFogOfWarForPlayer() {
        boolean z;
        GameEngine instance = GameEngine.getInstance();
        if (this.team != instance.playerTeam && instance.map.fogOfWar_active) {
            instance.map.toGrid(this.x, this.y);
            int i = instance.map.returnX;
            int i2 = instance.map.returnY;
            if (instance.map.isInMap(i, i2) && instance.map.fogOfWar_map[i][i2] == 10) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    public int numSpecialActions() {
        return 0;
    }

    public boolean overlapping(Point point) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, point.x, point.y);
        float f = this.radius;
        return distanceSq < f * f;
    }

    public boolean overlapping(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float f = this.radius + unit.radius;
        return distanceSq < f * f;
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void readIn(InputNetStream inputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }

    @Override // com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    public void remove() {
        fastUnitList.remove(this);
        fastLiveUnitList.remove(this);
        GameEngine.getInstance().interfaceEngine.unselectUnit(this);
        super.remove();
    }

    public void setTeam(int i) {
        this.team = Team.teamList[i];
    }

    public void setTeam(Team team) {
        setTeam(team.id);
    }

    public boolean shouldDrawCheck() {
        boolean z;
        if (this.transportedBy != null) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            if (!instance.viewpointDrawCheckGlobalRect.contains((int) this.x, (int) this.y)) {
                z = false;
            } else {
                if (this.team != instance.playerTeam && instance.map.fogOfWar_active) {
                    instance.map.toGrid(this.x, this.y);
                    int i = instance.map.returnX;
                    int i2 = instance.map.returnY;
                    if (instance.map.isInMap(i, i2) && instance.map.fogOfWar_map[i][i2] == 10) {
                        z = false;
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public boolean transportUnit(Unit unit) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        if (!this.dead && this.hp < 0.0f) {
            destroy();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void writeOut(OutputNetStream outputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }
}
