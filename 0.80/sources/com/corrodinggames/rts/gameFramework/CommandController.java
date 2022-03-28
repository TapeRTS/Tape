package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.gameFramework.GroupController;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/CommandController.class */
public class CommandController {
    public ArrayList<Command> activeCommands = new ArrayList<>();
    public ArrayList<Command> localCommands = new ArrayList<>();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/CommandController$Command.class */
    public class Command {
        public int runStep;
        private OrderableUnit.AttackMode setAttackMode;
        Team team;
        private Waypoint waypoint;
        public boolean noClear = false;
        public boolean stopOrUndo = false;
        private int specialAction = -1;
        private ArrayList<Long> futureUnitIds = new ArrayList<>();
        ArrayList<OrderableUnit> units = new ArrayList<>();

        public Command() {
        }

        public void addUnit(OrderableUnit orderableUnit) {
            if (orderableUnit == null) {
                throw new RuntimeException("unit cannot be null");
            }
            if (orderableUnit.team != this.team) {
                GameEngine.log("CommandController", "Warning!: " + this.team.id + " gave an order to unit with team:" + orderableUnit.team.id);
            }
            this.units.add(orderableUnit);
        }

        public void convertUnitIds() {
            Iterator<Long> it = this.futureUnitIds.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                OrderableUnit orderableUnitFromId = GameObject.getOrderableUnitFromId(next.longValue());
                if (orderableUnitFromId == null) {
                    NetworkEngine.reportDesync("Got null converting id in convertUnitIds, id:" + next);
                } else {
                    this.units.add(orderableUnitFromId);
                }
            }
            this.futureUnitIds.clear();
        }

        public void issueCommand() {
            convertUnitIds();
            if (this.waypoint != null) {
                this.waypoint.convertUnitIds();
                GroupController.UnitGroup createGroup = GameEngine.getInstance().groupController.createGroup();
                Iterator<OrderableUnit> it = this.units.iterator();
                while (it.hasNext()) {
                    OrderableUnit next = it.next();
                    if (!this.noClear) {
                        next.clearAllWaypoints();
                    }
                    createGroup.addUnit(next, next.addWaypointByCopy(this.waypoint));
                }
                createGroup.setupGroup();
                return;
            }
            if (this.specialAction != -1) {
                Iterator<OrderableUnit> it2 = this.units.iterator();
                while (it2.hasNext()) {
                    OrderableUnit next2 = it2.next();
                    next2.giveSpecialActionOrder(next2.getSpecialAction(this.specialAction), this.stopOrUndo);
                }
            }
            if (this.setAttackMode != null) {
                Iterator<OrderableUnit> it3 = this.units.iterator();
                while (it3.hasNext()) {
                    it3.next().attackMode = this.setAttackMode;
                }
            }
        }

        public void readIn(InputNetStream inputNetStream) throws IOException {
            this.team = Team.getTeam(inputNetStream.readByte());
            if (inputNetStream.readBoolean()) {
                this.waypoint = new Waypoint();
                this.waypoint.readIn(inputNetStream);
            }
            this.noClear = inputNetStream.readBoolean();
            this.stopOrUndo = inputNetStream.readBoolean();
            this.specialAction = inputNetStream.readInt();
            this.setAttackMode = (OrderableUnit.AttackMode) inputNetStream.readEnum(OrderableUnit.AttackMode.class);
            int readInt = inputNetStream.readInt();
            for (int i = 0; i < readInt; i++) {
                this.futureUnitIds.add(Long.valueOf(inputNetStream.readGameObjectId()));
            }
        }

        public void setAttackMode(OrderableUnit.AttackMode attackMode) {
            this.setAttackMode = attackMode;
        }

        public void setAttackWaypoint(Unit unit) {
            this.waypoint = new Waypoint();
            this.waypoint.setAttack(unit);
        }

        public void setBuildWaypoint(float f, float f2, UnitType unitType) {
            this.waypoint = new Waypoint();
            this.waypoint.setBuild(f, f2, unitType);
        }

        public void setLoadIntoWaypoint(Unit unit) {
            this.waypoint = new Waypoint();
            this.waypoint.setLoadInto(unit);
        }

        public void setMoveWaypoint(float f, float f2) {
            this.waypoint = new Waypoint();
            this.waypoint.setMove(f, f2);
        }

        public void setRepairWaypoint(Unit unit) {
            this.waypoint = new Waypoint();
            this.waypoint.setRepair(unit);
        }

        public void setSpecialAction(int i) {
            this.specialAction = i;
        }

        public void writeOut(OutputNetStream outputNetStream) throws IOException {
            outputNetStream.writeByte(this.team.id);
            outputNetStream.writeBoolean(this.waypoint != null);
            if (this.waypoint != null) {
                this.waypoint.writeOut(outputNetStream);
            }
            outputNetStream.writeBoolean(this.noClear);
            outputNetStream.writeBoolean(this.stopOrUndo);
            outputNetStream.writeInt(this.specialAction);
            outputNetStream.writeEnum(this.setAttackMode);
            outputNetStream.writeInt(this.units.size() + this.futureUnitIds.size());
            Iterator<OrderableUnit> it = this.units.iterator();
            while (it.hasNext()) {
                outputNetStream.writeOrderableUnit(it.next());
            }
            Iterator<Long> it2 = this.futureUnitIds.iterator();
            while (it2.hasNext()) {
                outputNetStream.writeLong(it2.next().longValue());
            }
        }
    }

    public void clearAndSetup() {
        this.activeCommands.clear();
    }

    public Command createBlankCommand() {
        return new Command();
    }

    public Command createNewCommand(Team team) {
        Command command = new Command();
        command.team = team;
        if (!GameEngine.getInstance().network.networked) {
            this.activeCommands.add(command);
        } else {
            this.localCommands.add(command);
        }
        return command;
    }

    public void issueAllCommandsLocal() {
        Iterator<Command> it = this.activeCommands.iterator();
        while (it.hasNext()) {
            it.next().issueCommand();
        }
        this.activeCommands.clear();
    }

    public void issueAllCommandsNet() {
        GameEngine instance = GameEngine.getInstance();
        Iterator<Command> it = this.activeCommands.iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (next.runStep == instance.frameNumber) {
                next.issueCommand();
                it.remove();
            }
        }
    }

    public void issueCommands() {
        if (!GameEngine.getInstance().network.networked) {
            issueAllCommandsLocal();
        } else {
            issueAllCommandsNet();
        }
    }
}
