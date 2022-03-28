package com.corrodinggames.rts.gameFramework.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/MinimapHandler.class */
public class MinimapHandler {
    Paint _fogPaint;
    float checkDamageUpdate;
    Bitmap mapBaseBitmap;
    Bitmap mapOverviewBitmap;
    Canvas mapOverviewCanvas;
    public int mapXSize;
    public int mapYSize;
    float screenX;
    float screenY;
    float updateFogDelay;
    public float screenXSize = 120.0f;
    public float screenYSize = 120.0f;
    Paint mapPaint = new Paint();
    Paint mapOutlinePaint = new Paint();
    Paint viewpointOutlinePaint = new Paint();
    Paint notificationPaint = new Paint();
    Rect outlineRect = new Rect();
    Paint unitPaint = new Paint();
    Rect _tempRect = new Rect();
    float updatePositionsDelay = 0.0f;
    public boolean fogNeedsUpdating = false;
    int fogRedrawParts = 30;
    int fogRedrawCurrentPart = -1;
    Rect _dstRect = new Rect();
    public ArrayList<DamageRecording> damageList = new ArrayList<>();
    public ArrayList<DamageNotification> notificationList = new ArrayList<>();
    Point point = new Point();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/MinimapHandler$DamageNotification.class */
    public class DamageNotification {
        public int x;
        public int y;
        public float timer = 1.0f;
        public float pauseTimer = 1.0f;

        public DamageNotification() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/MinimapHandler$DamageRecording.class */
    public class DamageRecording {
        public boolean base;
        public float hp;
        public float shownDelay;
        public int x;
        public int y;

        DamageRecording(float f, int i, int i2, boolean z) {
            this.hp = f;
            this.x = i;
            this.y = i2;
            this.base = z;
        }
    }

    private Point convertMapToScreen(float f, float f2) {
        this.point.set((int) (((f / this.mapXSize) * this.screenXSize) + this.screenX), (int) (((f2 / this.mapYSize) * this.screenYSize) + this.screenY));
        return this.point;
    }

    public float clipX(float f) {
        if (f < this.screenX) {
            f = this.screenX;
        } else if (f > this.screenX + this.screenXSize) {
            f = this.screenX + this.screenXSize;
        }
        return f;
    }

    public float clipY(float f) {
        if (f < this.screenY) {
            f = this.screenY;
        } else if (f > this.screenY + this.screenYSize) {
            f = this.screenY + this.screenYSize;
        }
        return f;
    }

    public Point convertScreenToMap(float f, float f2) {
        Point point;
        if (f < this.screenX || f2 < this.screenY || f > this.screenX + this.screenXSize || f2 > this.screenY + this.screenYSize) {
            point = null;
        } else {
            this.point.set((int) (((f - this.screenX) / this.screenXSize) * this.mapXSize), (int) (((f2 - this.screenY) / this.screenYSize) * this.mapYSize));
            point = this.point;
        }
        return point;
    }

    public void draw(float f) {
        GameEngine instance = GameEngine.getInstance();
        updateValues();
        if (this.mapOverviewBitmap == null) {
            setupMap();
        }
        instance.graphics.getCanvas().drawBitmap(this.mapOverviewBitmap, this.screenX, this.screenY, this.mapPaint);
        this.outlineRect.set((int) this.screenX, (int) this.screenY, (int) (this.screenX + this.screenXSize), (int) (this.screenY + this.screenYSize));
        instance.graphics.getCanvas().drawRect(this.outlineRect, this.mapOutlinePaint);
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (next.miniMapCacheDraw) {
                instance.graphics.getCanvas().drawRect(next.miniMapXCache, next.miniMapYCache, next.miniMapXCache + 2, next.miniMapYCache + 2, next.team.mapPaint);
            }
        }
        Point convertMapToScreen = convertMapToScreen(instance.viewpointX_rounded, instance.viewpointY_rounded);
        this._tempRect.left = convertMapToScreen.x;
        this._tempRect.top = convertMapToScreen.y;
        Point convertMapToScreen2 = convertMapToScreen(instance.viewpointX_rounded + instance.viewpointWidth, instance.viewpointY_rounded + instance.viewpointHeight);
        this._tempRect.right = convertMapToScreen2.x;
        this._tempRect.bottom = convertMapToScreen2.y;
        if (this._tempRect.left < this.outlineRect.left) {
            this._tempRect.left = this.outlineRect.left;
        }
        if (this._tempRect.right > this.outlineRect.right) {
            this._tempRect.right = this.outlineRect.right;
        }
        if (this._tempRect.top < this.outlineRect.top) {
            this._tempRect.top = this.outlineRect.top;
        }
        if (this._tempRect.bottom > this.outlineRect.bottom) {
            this._tempRect.bottom = this.outlineRect.bottom;
        }
        instance.graphics.getCanvas().drawRect(this._tempRect, this.viewpointOutlinePaint);
        Iterator<DamageNotification> it2 = this.notificationList.iterator();
        while (it2.hasNext()) {
            DamageNotification next2 = it2.next();
            Point convertMapToScreen3 = convertMapToScreen(next2.x, next2.y);
            float limit = CommonUtils.limit(next2.timer, 0.05f, 1.0f);
            instance.graphics.getCanvas().drawLine(clipX(convertMapToScreen3.x - (this.screenXSize * limit)), clipY(convertMapToScreen3.y), clipX(convertMapToScreen3.x + (this.screenXSize * limit)), clipY(convertMapToScreen3.y), this.notificationPaint);
            instance.graphics.getCanvas().drawLine(clipX(convertMapToScreen3.x), clipY(convertMapToScreen3.y - (this.screenYSize * limit)), clipX(convertMapToScreen3.x), clipY(convertMapToScreen3.y + (this.screenYSize * limit)), this.notificationPaint);
            next2.timer = CommonUtils.toZero(next2.timer, 0.05f * f);
            if (next2.timer == 0.0f) {
                next2.pauseTimer = CommonUtils.toZero(next2.pauseTimer, 0.01f * f);
                if (next2.pauseTimer == 0.0f) {
                    it2.remove();
                }
            }
        }
    }

    public int getBottomEdge() {
        return (int) (this.screenY + this.screenYSize);
    }

    public void init(Context context) {
        this.mapOutlinePaint.setARGB(255, 100, 100, 100);
        this.mapOutlinePaint.setStyle(Paint.Style.STROKE);
        this.mapOutlinePaint.setStrokeWidth(1.0f);
        this.viewpointOutlinePaint.setARGB(255, 255, 255, 255);
        this.viewpointOutlinePaint.setStyle(Paint.Style.STROKE);
        this.viewpointOutlinePaint.setStrokeWidth(1.0f);
        this._fogPaint = new Paint();
        this._fogPaint.setColor(-16777216);
        this._fogPaint.setStyle(Paint.Style.FILL);
        this.notificationPaint.setARGB(255, 255, 0, 0);
        this.notificationPaint.setStyle(Paint.Style.STROKE);
        this.notificationPaint.setStrokeWidth(1.0f);
    }

    public void recordDamage(int i, int i2, float f, Unit unit) {
        boolean z = unit instanceof Building;
        Iterator<DamageRecording> it = this.damageList.iterator();
        while (it.hasNext()) {
            DamageRecording next = it.next();
            if (next.base == z && CommonUtils.abs(i - next.x) < 40 && CommonUtils.abs(i2 - next.y) < 40) {
                next.hp += f;
                return;
            }
        }
        this.damageList.add(new DamageRecording(f, i, i2, z));
    }

    void redrawMapAndFog() {
        GameEngine instance = GameEngine.getInstance();
        this.mapOverviewCanvas.drawBitmap(this.mapBaseBitmap, 0.0f, 0.0f, (Paint) null);
        if (instance.map.fogOfWar_active) {
            float f = this.screenXSize / instance.map.mapWidth;
            float f2 = this.screenYSize / instance.map.mapHeight;
            for (int i = 0; i < instance.map.mapWidth; i++) {
                for (int i2 = 0; i2 < instance.map.mapHeight; i2++) {
                    byte b = instance.map.fogOfWar_map[i][i2];
                    if (b != 0) {
                        this._dstRect.set(((int) (i * f)) + 0, ((int) (i2 * f2)) + 0, ((int) ((i + 1) * f)) + 0, ((int) ((i2 + 1) * f2)) + 0);
                        this._fogPaint.setAlpha((b * 25) + 5);
                        this.mapOverviewCanvas.drawRect(this._dstRect, this._fogPaint);
                    }
                }
            }
        }
    }

    public void setMap(Map map) {
        this.mapXSize = 0;
        this.mapYSize = 0;
        this.mapOverviewBitmap = null;
    }

    public void setupMap() {
        GameEngine instance = GameEngine.getInstance();
        this.screenXSize = instance.sidebarWidth;
        this.screenYSize = instance.sidebarWidth;
        updateValues();
        short s = instance.map.mainLayer.width;
        instance.map.getClass();
        this.mapXSize = s * 20;
        short s2 = instance.map.mainLayer.height;
        instance.map.getClass();
        this.mapYSize = s2 * 20;
        this.mapBaseBitmap = Bitmap.createBitmap((int) this.screenXSize, (int) this.screenYSize, Bitmap.Config.RGB_565);
        this.mapOverviewBitmap = Bitmap.createBitmap((int) this.screenXSize, (int) this.screenYSize, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas();
        canvas.setBitmap(this.mapBaseBitmap);
        instance.map.mainLayer.draw(canvas, 0.0f, 0.0f, 0.0f, 0.0f, this.mapXSize, this.mapYSize, this.screenXSize / this.mapXSize, this.screenYSize / this.mapYSize, false);
        this.mapOverviewCanvas = new Canvas();
        this.mapOverviewCanvas.setBitmap(this.mapOverviewBitmap);
        this.updateFogDelay = 50.0f;
        redrawMapAndFog();
    }

    public void update(float f) {
        GameEngine instance = GameEngine.getInstance();
        this.updatePositionsDelay = CommonUtils.toZero(this.updatePositionsDelay, f);
        if (this.updatePositionsDelay == 0.0f) {
            this.updatePositionsDelay = 15.0f;
            Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
            while (it.hasNext()) {
                Unit next = it.next();
                if (next.transportedBy != null || !next.notInFogOfWarForPlayer()) {
                    next.miniMapCacheDraw = false;
                } else {
                    Point convertMapToScreen = convertMapToScreen(next.x, next.y);
                    next.miniMapXCache = convertMapToScreen.x;
                    next.miniMapYCache = convertMapToScreen.y;
                    next.miniMapCacheDraw = true;
                }
            }
        }
        if (this.fogNeedsUpdating && instance.map.fogOfWar_active) {
            this.updateFogDelay = CommonUtils.toZero(this.updateFogDelay, 1.0f);
            if (this.updateFogDelay == 0.0f) {
                this.updateFogDelay = 75.0f;
                if (this.mapOverviewBitmap != null) {
                    redrawMapAndFog();
                    this.fogNeedsUpdating = false;
                }
            }
        }
        this.checkDamageUpdate += f;
        if (this.checkDamageUpdate > 15.0f) {
            DamageRecording damageRecording = null;
            Iterator<DamageRecording> it2 = this.damageList.iterator();
            while (it2.hasNext()) {
                DamageRecording next2 = it2.next();
                if (next2.shownDelay != 0.0f) {
                    next2.hp = 0.0f;
                } else if (next2.hp > 15.0f && next2.base) {
                    next2.hp = 0.0f;
                    next2.shownDelay = 300.0f;
                    DamageNotification damageNotification = new DamageNotification();
                    damageNotification.x = next2.x;
                    damageNotification.y = next2.y;
                    this.notificationList.add(damageNotification);
                }
                next2.hp = CommonUtils.toZero(next2.hp, 2.0f * this.checkDamageUpdate);
                next2.shownDelay = CommonUtils.toZero(next2.shownDelay, this.checkDamageUpdate);
                if (next2.hp == 0.0f && next2.shownDelay == 0.0f) {
                    damageRecording = next2;
                }
            }
            if (damageRecording != null) {
                this.damageList.remove(damageRecording);
            }
            this.checkDamageUpdate = 0.0f;
        }
    }

    public void updateValues() {
        this.screenX = (int) (GameEngine.getInstance().screenWidth - (this.screenXSize + 0.0f));
        this.screenY = 0.0f;
    }
}
