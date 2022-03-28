package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.GroupController;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/Waypoint.class */
public class Waypoint {
    UnitType build;
    long futureTargetUnitId = -1;
    public GroupController.UnitGroup group;
    Unit targetUnit;
    WaypointType type;
    float x;
    float y;

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/Waypoint$WaypointType.class */
    public enum WaypointType {
        move,
        attack,
        build,
        repair,
        loadInto
    }

    public void clear() {
        this.type = WaypointType.move;
        this.build = null;
        this.x = 0.0f;
        this.y = 0.0f;
        this.futureTargetUnitId = -1L;
        this.targetUnit = null;
        this.group = null;
    }

    public void convertUnitIds() {
        if (this.futureTargetUnitId != -1) {
            this.targetUnit = GameObject.getUnitFromId(this.futureTargetUnitId);
            this.futureTargetUnitId = -1L;
        }
    }

    public float getRealX() {
        return (this.type == WaypointType.attack || this.type == WaypointType.repair || this.type == WaypointType.loadInto) ? this.targetUnit.x : this.x;
    }

    public float getRealY() {
        return (this.type == WaypointType.attack || this.type == WaypointType.repair || this.type == WaypointType.loadInto) ? this.targetUnit.y : this.y;
    }

    public WaypointType getType() {
        return this.type;
    }

    public void readIn(InputNetStream inputNetStream) throws IOException {
        this.type = (WaypointType) inputNetStream.readEnum(WaypointType.class);
        this.build = (UnitType) inputNetStream.readEnum(UnitType.class);
        this.x = inputNetStream.readFloat();
        this.y = inputNetStream.readFloat();
        this.futureTargetUnitId = inputNetStream.readGameObjectId();
        this.targetUnit = null;
    }

    public void set(Waypoint waypoint) {
        clear();
        this.type = waypoint.type;
        this.build = waypoint.build;
        this.x = waypoint.x;
        this.y = waypoint.y;
        this.targetUnit = waypoint.targetUnit;
        this.group = waypoint.group;
    }

    public void setAttack(Unit unit) {
        clear();
        this.type = WaypointType.attack;
        this.targetUnit = unit;
    }

    public void setBuild(float f, float f2, UnitType unitType) {
        clear();
        this.type = WaypointType.build;
        this.x = f;
        this.y = f2;
        this.build = unitType;
    }

    public void setLoadInto(Unit unit) {
        clear();
        this.type = WaypointType.loadInto;
        this.targetUnit = unit;
    }

    public void setMove(float f, float f2) {
        clear();
        this.type = WaypointType.move;
        this.x = f;
        this.y = f2;
    }

    public void setRepair(Unit unit) {
        clear();
        this.type = WaypointType.repair;
        this.targetUnit = unit;
    }

    public void writeOut(OutputNetStream outputNetStream) throws IOException {
        outputNetStream.writeEnum(this.type);
        outputNetStream.writeEnum(this.build);
        outputNetStream.writeFloat(this.x);
        outputNetStream.writeFloat(this.y);
        if (this.futureTargetUnitId != -1) {
            outputNetStream.writeLong(this.futureTargetUnitId);
        } else {
            outputNetStream.writeUnit(this.targetUnit);
        }
    }
}
