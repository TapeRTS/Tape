package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Building.class */
public abstract class Building extends OrderableUnit {
    private static /* synthetic */ int[] $SWITCH_TABLE$com$corrodinggames$rts$game$units$UnitType;
    BitmapOrTexture image_back;
    public static BitmapOrTexture IMAGE_ICON = null;
    public static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];
    static Point _point = new Point();
    static Paint buildingPaint = new Paint();
    static PorterDuffColorFilter buildingColorFilter = new PorterDuffColorFilter(Color.rgb(200, 255, 200), PorterDuff.Mode.MULTIPLY);
    static PorterDuffColorFilter previewColorFilterValid = new PorterDuffColorFilter(Color.rgb((int) NetworkEngine.PACKET_SEND_KICK, 255, (int) NetworkEngine.PACKET_SEND_KICK), PorterDuff.Mode.MULTIPLY);
    static PorterDuffColorFilter previewColorFilterNotValid = new PorterDuffColorFilter(Color.rgb(255, (int) NetworkEngine.PACKET_SEND_KICK, (int) NetworkEngine.PACKET_SEND_KICK), PorterDuff.Mode.MULTIPLY);
    public Rect footprint = new Rect();
    public Rect softFootprint = new Rect();
    int drawFrame = 0;

    static /* synthetic */ int[] $SWITCH_TABLE$com$corrodinggames$rts$game$units$UnitType() {
        int[] iArr = $SWITCH_TABLE$com$corrodinggames$rts$game$units$UnitType;
        if (iArr == null) {
            iArr = new int[UnitType.values().length];
            try {
                iArr[UnitType.airFactory.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[UnitType.airShip.ordinal()] = 13;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[UnitType.antiAirTurret.ordinal()] = 7;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[UnitType.artillery.ordinal()] = 11;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[UnitType.builder.ordinal()] = 8;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[UnitType.commandCenter.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[UnitType.extractor.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[UnitType.gunBoat.ordinal()] = 16;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[UnitType.gunShip.ordinal()] = 14;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[UnitType.helicopter.ordinal()] = 12;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[UnitType.hoverTank.ordinal()] = 10;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[UnitType.hovercraft.ordinal()] = 19;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[UnitType.ladybug.ordinal()] = 20;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[UnitType.landFactory.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[UnitType.laserTank.ordinal()] = 18;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[UnitType.megaTank.ordinal()] = 17;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[UnitType.missileShip.ordinal()] = 15;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[UnitType.seaFactory.ordinal()] = 4;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[UnitType.tank.ordinal()] = 9;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[UnitType.turret.ordinal()] = 6;
            } catch (NoSuchFieldError e20) {
            }
            $SWITCH_TABLE$com$corrodinggames$rts$game$units$UnitType = iArr;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Building() {
        this.dir = -90.0f;
        this.collidable = false;
    }

    public static Building createBuilding(UnitType unitType) {
        if (unitType != null) {
            return (Building) unitType.createInstance();
        }
        throw new RuntimeException("type is null");
    }

    public static Building getBuilding(int i, int i2) {
        Building building;
        GameEngine instance = GameEngine.getInstance();
        instance.map.fromGrid(i, i2);
        _point.set(instance.map.returnX, instance.map.returnY);
        Iterator<Unit> it = Unit.fastUnitList.iterator();
        while (true) {
            if (it.hasNext()) {
                Unit next = it.next();
                if ((next instanceof Building) && !next.dead && next.overlapping(_point)) {
                    building = (Building) next;
                    break;
                }
            } else {
                building = null;
                break;
            }
        }
        return building;
    }

    public static int getPrice(UnitType unitType) {
        int i;
        if (unitType == null) {
            throw new RuntimeException("type is null");
        }
        switch ($SWITCH_TABLE$com$corrodinggames$rts$game$units$UnitType()[unitType.ordinal()]) {
            case 1:
                i = 800;
                break;
            case 2:
                i = 700;
                break;
            case 3:
                i = 1000;
                break;
            case 4:
                i = 1000;
                break;
            case 5:
                i = 6000;
                break;
            case 6:
                i = 500;
                break;
            case 7:
                i = 600;
                break;
            default:
                throw new RuntimeException("type: " + unitType + " not handled");
        }
        return i;
    }

    public static boolean isTileValid(UnitType unitType, int i, int i2) {
        MapTile tileFromObjectLayer;
        GameEngine instance = GameEngine.getInstance();
        return !instance.map.isInMap(i, i2) ? false : (unitType == UnitType.commandCenter || unitType == UnitType.extractor || unitType == UnitType.landFactory || unitType == UnitType.airFactory || unitType == UnitType.turret || unitType == UnitType.antiAirTurret) ? (unitType != UnitType.extractor || (tileFromObjectLayer = instance.map.getTileFromObjectLayer(i, i2)) == null || !tileFromObjectLayer.resPool) ? !instance.path.isTileImpassable(instance.path.MovementType_LAND, i, i2) : true : unitType == UnitType.seaFactory ? !instance.path.isTileImpassable(instance.path.MovementType_WATER, i, i2) : false;
    }

    public static boolean isTileValidForInterface(UnitType unitType, int i, int i2) {
        boolean z;
        GameEngine instance = GameEngine.getInstance();
        if (!instance.map.isInMap(i, i2)) {
            z = false;
        } else if (instance.map.fogOfWar_active && instance.map.fogOfWar_map[i][i2] == 10) {
            z = false;
        } else if (!isTileValid(unitType, i, i2)) {
            z = false;
        } else if (unitType == UnitType.extractor) {
            MapTile tileFromObjectLayer = instance.map.getTileFromObjectLayer(i, i2);
            z = tileFromObjectLayer != null && tileFromObjectLayer.resPool;
        } else {
            z = true;
        }
        return z;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_building);
        for (int i = 0; i < IMAGE_ICON_TEAMS.length; i++) {
            IMAGE_ICON_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i));
        }
    }

    public boolean canBeBuiltHere() {
        boolean z;
        if (overOtherBuilding()) {
            z = false;
        } else {
            if (getUnitType() != UnitType.extractor) {
                Rect rect = this.softFootprint;
                GameEngine instance = GameEngine.getInstance();
                instance.map.toGrid(this.x, this.y);
                int i = instance.map.returnX;
                int i2 = instance.map.returnY;
                loop0: for (int i3 = i + rect.left; i3 <= rect.right + i; i3++) {
                    for (int i4 = i2 + rect.top; i4 <= rect.bottom + i2; i4++) {
                        if (!isTileValid(getUnitType(), i3, i4)) {
                            z = false;
                            break loop0;
                        }
                    }
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canMove() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean destroyEffectAndWreak() {
        boolean destroyEffectAndWreakForBuilding;
        GameEngine.getInstance().path.updateAllBuildingCosts();
        if (this.built < 1.0f) {
            destroyEffectAndWreakForBuilding = false;
        } else {
            this.drawFrame = 0;
            destroyEffectAndWreakForBuilding = destroyEffectAndWreakForBuilding();
        }
        return destroyEffectAndWreakForBuilding;
    }

    public boolean destroyEffectAndWreakForBuilding() {
        GameEngine.getInstance().effects.emitLargeExplosion(this.x, this.y, this.height);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        GameEngine instance = GameEngine.getInstance();
        if (shouldDrawCheck()) {
            int i = this.drawFrame * this.objectWidth;
            float f2 = (this.x - (this.objectWidth / 2)) - GameEngine.getInstance().viewpointX_rounded;
            float f3 = (this.y - (this.objectHeight / 2)) - GameEngine.getInstance().viewpointY_rounded;
            this._dst.set(f2, f3, this.objectWidth + f2, this.objectHeight + f3);
            if (RectF.intersects(instance.viewpointRectF, this._dst)) {
                this._src.set(i, 0, this.objectWidth + i, this.objectHeight + 0);
                instance.graphics.drawImage(this.image, this._src, this._dst, getBuildingPaint());
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void drawUnder(float f) {
        if (this.image_back != null && shouldDrawCheck()) {
            GameEngine instance = GameEngine.getInstance();
            this._dst.set(this.x - (this.objectWidth / 2), this.y - (this.objectHeight / 2), this.x + (this.objectWidth / 2), this.y + (this.objectHeight / 2));
            this._dst.offset(-GameEngine.getInstance().viewpointX_rounded, -GameEngine.getInstance().viewpointY_rounded);
            if (RectF.intersects(instance.viewpointRectF, this._dst)) {
                this._src.set(0, 0, this.objectWidth + 0, this.objectHeight + 0);
                instance.graphics.drawImage(this.image_back, this._src, this._dst, getBuildingPaint());
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public int getBuildRange() {
        return 70;
    }

    public Paint getBuildingPaint() {
        GameEngine instance = GameEngine.getInstance();
        buildingPaint.reset();
        if (this.built < 1.0f) {
            buildingPaint.setARGB((int) (20.0f + (this.built * 220.0f)), NetworkEngine.PACKET_SEND_CHAT_TO_SERVER, 255, NetworkEngine.PACKET_SEND_CHAT_TO_SERVER);
            buildingPaint.setColorFilter(buildingColorFilter);
        }
        if (this.preview) {
            buildingPaint.setARGB(200, 20, 255, 20);
            if (this.previewValidSpot) {
                buildingPaint.setColorFilter(previewColorFilterValid);
            } else {
                buildingPaint.setColorFilter(previewColorFilterNotValid);
            }
        }
        if (instance.settings.renderAntiAlias) {
            buildingPaint.setAntiAlias(true);
            buildingPaint.setFilterBitmap(true);
            buildingPaint.setDither(true);
        }
        return buildingPaint;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.MovementType getMovementType() {
        return Unit.MovementType.NONE;
    }

    public Building getOtherBuildingOverOfSameType() {
        Building building;
        Iterator<Unit> it = Unit.fastUnitList.iterator();
        while (true) {
            if (it.hasNext()) {
                Unit next = it.next();
                if (next != this && (next instanceof Building)) {
                    building = (Building) next;
                    if (!building.dead && building.team == this.team && building.getUnitType() == getUnitType() && overlapping(building)) {
                        break;
                    }
                }
            } else {
                building = null;
                break;
            }
        }
        return building;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean isFlying() {
        return false;
    }

    public boolean overOtherBuilding() {
        boolean z;
        Iterator<Unit> it = Unit.fastUnitList.iterator();
        while (true) {
            if (it.hasNext()) {
                Unit next = it.next();
                if (next != this && (next instanceof Building) && !next.dead && overlapping(next)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }
}
