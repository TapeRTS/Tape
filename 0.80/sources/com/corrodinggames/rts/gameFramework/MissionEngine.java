package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.GroupObject;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.buildings.Turret;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.gameFramework.CommandController;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/MissionEngine.class */
public class MissionEngine {
    Team allyTeam;
    boolean firstLoop;
    public String introText;
    int lastUpdateTime;
    WinConditions mapWinCondition;
    boolean skirmish;
    boolean survival;
    boolean survival_against_aliens;
    public Paint waveTextPaint;
    String winText;
    WinConditions mapLoseCondition = WinConditions.allUnitsAndBuildings;
    int survival_wave = 0;
    int survival_unitType = 0;
    int survival_unitNumber = 2;
    int survival_unitMegaTankNumber = 2;
    int survival_unitPower = 0;
    float survival_nextwave = 200.0f;
    float survival_showmessage = 0.0f;
    float survival_showmessagewait = 0.0f;
    ArrayList<PointF> survival_attackPoints = new ArrayList<>();
    PointF _point = new PointF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/MissionEngine$WinConditions.class */
    public enum WinConditions {
        none,
        allUnitsAndBuildings,
        allBuildings,
        mainBuilings,
        commandCenter
    }

    public void draw(float f) {
        if (this.survival) {
            GameEngine instance = GameEngine.getInstance();
            this.survival_showmessagewait = CommonUtils.toZero(this.survival_showmessagewait, f);
            if (this.survival_showmessagewait == 0.0f && this.survival_showmessage != 0.0f) {
                this.survival_showmessage = CommonUtils.toZero(this.survival_showmessage, f);
                instance.graphics.drawText("Wave " + this.survival_wave, instance.halfScreenWidth, 40.0f, this.waveTextPaint);
            }
        }
    }

    public PointF findPoint(int i) {
        PointF pointF;
        Iterator<GroupObject> it = GameEngine.getInstance().map.objectGroup_triggers.objects.iterator();
        while (true) {
            if (it.hasNext()) {
                GroupObject next = it.next();
                if ("point".equalsIgnoreCase(next.type) && next.name != null && Integer.valueOf(next.name).intValue() == i) {
                    this._point.set(next.x, next.y);
                    pointF = this._point;
                    break;
                }
            } else {
                pointF = null;
                break;
            }
        }
        return pointF;
    }

    public void init() {
        GameEngine instance = GameEngine.getInstance();
        this.waveTextPaint = new Paint();
        this.waveTextPaint.setARGB(255, 255, 255, 255);
        this.waveTextPaint.setTextSize(26.0f);
        this.waveTextPaint.setAntiAlias(true);
        this.waveTextPaint.setTextAlign(Paint.Align.CENTER);
        this.waveTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        this.firstLoop = true;
        GroupObject groupObjectByName = instance.map.objectGroup_triggers.getGroupObjectByName("map_info");
        this.survival = groupObjectByName.props.getProperty("type").equalsIgnoreCase("survival");
        if (this.survival) {
            this.survival_against_aliens = false;
        }
        this.skirmish = groupObjectByName.props.getProperty("type").equalsIgnoreCase("skirmish");
        if (this.skirmish) {
            this.mapWinCondition = WinConditions.allUnitsAndBuildings;
        }
        String property = groupObjectByName.props.getProperty("winCondition");
        if (property != null || this.skirmish) {
            if (property != null) {
                if (property.equalsIgnoreCase("none")) {
                    this.mapWinCondition = WinConditions.none;
                } else if (property.equalsIgnoreCase("allUnitsAndBuildings")) {
                    this.mapWinCondition = WinConditions.allUnitsAndBuildings;
                } else if (property.equalsIgnoreCase("allBuildings")) {
                    this.mapWinCondition = WinConditions.allBuildings;
                } else if (property.equalsIgnoreCase("mainBuilings")) {
                    this.mapWinCondition = WinConditions.mainBuilings;
                } else if (property.equalsIgnoreCase("commandCenter")) {
                    this.mapWinCondition = WinConditions.commandCenter;
                } else {
                    throw new RuntimeException("unknown win condition:" + property);
                }
            }
            this.introText = groupObjectByName.props.getProperty("introText");
            if (this.introText != null) {
                this.introText = this.introText.replaceAll("\\\\n", "\n");
            }
            if (!instance.network.networked && !this.skirmish) {
                this.allyTeam = Team.getTeam(3);
                if (this.allyTeam != null) {
                    this.allyTeam.allyGroup = 0;
                }
            }
            if (instance.network.networked) {
                this.mapWinCondition = WinConditions.none;
            }
            Iterator<GroupObject> it = instance.map.objectGroup_triggers.objects.iterator();
            while (it.hasNext()) {
                GroupObject next = it.next();
                if ("team_info".equalsIgnoreCase(next.type)) {
                    int parseInt = Integer.parseInt(next.props.getProperty("team", "-1"));
                    if (parseInt == -1) {
                        throw new RuntimeException("cannot find team for:" + next.name);
                    }
                    Team team = Team.getTeam(parseInt);
                    String property2 = next.props.getProperty("credits");
                    if (property2 != null) {
                        team.credits = Integer.parseInt(property2);
                    }
                    String property3 = next.props.getProperty("allyGroup");
                    if (property3 != null) {
                        team.allyGroup = Integer.parseInt(property3);
                    }
                    String property4 = next.props.getProperty("ai");
                    if (property4 != null) {
                        team.survivalAttacker = property4.equalsIgnoreCase("survival");
                    }
                }
                if ("camera_start".equalsIgnoreCase(next.name)) {
                    instance.centerViewpointAtPoint(next.x, next.y);
                }
                if ("attack_point".equalsIgnoreCase(next.name)) {
                    this.survival_attackPoints.add(new PointF(next.x, next.y));
                }
            }
            if (this.allyTeam != null) {
                Iterator<Unit> it2 = Unit.fastLiveUnitList.iterator();
                while (it2.hasNext()) {
                    Unit next2 = it2.next();
                    if (next2.team == this.allyTeam && (next2 instanceof Hovercraft)) {
                        Iterator<Unit> it3 = Unit.fastLiveUnitList.iterator();
                        while (it3.hasNext()) {
                            Unit next3 = it3.next();
                            if (!this.allyTeam.isEnemy(next3.team) && !(next3 instanceof Hovercraft) && CommonUtils.distanceSq(next2.x, next2.y, next3.x, next3.y) < 4900.0f) {
                                ((Hovercraft) next2).transportUnit(next3);
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new RuntimeException("win condition not set");
    }

    public void runMapScripts(int i) {
        GameEngine instance = GameEngine.getInstance();
        Iterator<GroupObject> it = instance.map.objectGroup_triggers.objects.iterator();
        while (it.hasNext()) {
            GroupObject next = it.next();
            if (!next.activated && "move".equalsIgnoreCase(next.type)) {
                String property = next.props.getProperty("delay");
                boolean z = false;
                if (property != null) {
                    z = false;
                    if (Integer.parseInt(property) <= i) {
                        z = true;
                    }
                }
                if (z) {
                    next.activated = true;
                    PointF findPoint = findPoint(Integer.parseInt(next.props.getProperty("target", "-1")));
                    if (findPoint == null) {
                        throw new RuntimeException("cannot find target for:" + next.name);
                    }
                    int parseInt = Integer.parseInt(next.props.getProperty("team", "-1"));
                    if (parseInt == -1) {
                        throw new RuntimeException("cannot find team for:" + next.name);
                    }
                    Team team = Team.getTeam(parseInt);
                    CommandController.Command createNewCommand = instance.commandController.createNewCommand(team);
                    Iterator<Unit> it2 = Unit.fastLiveUnitList.iterator();
                    while (it2.hasNext()) {
                        Unit next2 = it2.next();
                        if (next2.team == team && (next2 instanceof OrderableUnit) && next.unitIn(next2)) {
                            createNewCommand.addUnit((OrderableUnit) next2);
                        }
                    }
                    createNewCommand.setMoveWaypoint(findPoint.x, findPoint.y);
                    if (next.props.getProperty("unload") != null) {
                        CommandController.Command createNewCommand2 = instance.commandController.createNewCommand(team);
                        createNewCommand2.noClear = true;
                        Iterator<Unit> it3 = Unit.fastLiveUnitList.iterator();
                        while (it3.hasNext()) {
                            Unit next3 = it3.next();
                            if (next3.team == team && (next3 instanceof Hovercraft) && next.unitIn(next3)) {
                                createNewCommand2.addUnit((OrderableUnit) next3);
                            }
                        }
                        createNewCommand2.setSpecialAction(Hovercraft.unloadActionId);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void update(float f) {
        int i;
        UnitType unitType;
        GameEngine instance = GameEngine.getInstance();
        int i2 = instance.levelTime;
        if (this.survival) {
            this.survival_nextwave = CommonUtils.toZero(this.survival_nextwave, f);
            if (this.survival_nextwave == 0.0f) {
                this.survival_wave++;
                this.survival_showmessage = 140.0f;
                this.survival_showmessagewait = 50.0f;
                this.survival_nextwave = 1600.0f;
                PointF pointF = this.survival_attackPoints.get(CommonUtils.realRand(this.survival_attackPoints.size()));
                int i3 = this.survival_unitNumber;
                UnitType unitType2 = null;
                if (this.survival_against_aliens) {
                    unitType = UnitType.ladybug;
                    i = i3;
                } else {
                    if (this.survival_unitType == 0) {
                        unitType2 = UnitType.tank;
                    }
                    if (this.survival_unitType == 1) {
                        unitType2 = UnitType.hoverTank;
                    }
                    if (this.survival_unitType == 2) {
                        unitType2 = UnitType.helicopter;
                    }
                    if (this.survival_unitType == 3) {
                        i3 = this.survival_unitMegaTankNumber;
                        this.survival_unitMegaTankNumber++;
                        unitType2 = UnitType.megaTank;
                    }
                    this.survival_unitType++;
                    boolean z = false;
                    if (this.survival_wave < 5) {
                        if (this.survival_unitType > 2) {
                            z = true;
                        }
                    } else if (this.survival_unitType > 3) {
                        z = true;
                    }
                    i = i3;
                    unitType = unitType2;
                    if (z) {
                        this.survival_unitType = 0;
                        this.survival_unitNumber += 2;
                        i = i3;
                        unitType = unitType2;
                    }
                }
                for (int i4 = 0; i4 < i; i4++) {
                    Unit createInstance = unitType.createInstance();
                    createInstance.x = pointF.x + CommonUtils.sameRnd(-25.0f, 25.0f);
                    createInstance.y = pointF.y + CommonUtils.sameRnd(-25.0f, 25.0f);
                    createInstance.dir = CommonUtils.sameRnd(0.0f, 350.0f);
                    createInstance.setTeam(1);
                }
            }
        }
        if (this.firstLoop) {
            this.firstLoop = false;
            if (this.introText != null) {
                instance.showMessageBox("Briefing", this.introText);
            }
        }
        if (i2 > this.lastUpdateTime + 1000) {
            this.lastUpdateTime = i2;
            runMapScripts(i2);
            if (!instance.levelComplete) {
                boolean z2 = true;
                boolean z3 = true;
                boolean z4 = true;
                boolean z5 = true;
                boolean z6 = true;
                if (this.mapWinCondition == WinConditions.none) {
                    z6 = false;
                } else if (this.mapWinCondition == WinConditions.allUnitsAndBuildings) {
                    Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
                    while (true) {
                        z6 = z2;
                        if (!it.hasNext()) {
                            break;
                        }
                        Unit next = it.next();
                        if ((next instanceof OrderableUnit) && !next.dead && instance.playerTeam.isEnemy(next.team)) {
                            z2 = false;
                        }
                    }
                } else if (this.mapWinCondition == WinConditions.allBuildings) {
                    Iterator<Unit> it2 = Unit.fastLiveUnitList.iterator();
                    while (true) {
                        z6 = z3;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Unit next2 = it2.next();
                        if ((next2 instanceof Building) && !next2.dead && instance.playerTeam.isEnemy(next2.team)) {
                            z3 = false;
                        }
                    }
                } else if (this.mapWinCondition == WinConditions.commandCenter) {
                    Iterator<Unit> it3 = Unit.fastLiveUnitList.iterator();
                    while (true) {
                        z6 = z4;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Unit next3 = it3.next();
                        if ((next3 instanceof CommandCenter) && !next3.dead && instance.playerTeam.isEnemy(next3.team)) {
                            z4 = false;
                        }
                    }
                } else if (this.mapWinCondition == WinConditions.mainBuilings) {
                    Iterator<Unit> it4 = Unit.fastLiveUnitList.iterator();
                    while (true) {
                        z6 = z5;
                        if (!it4.hasNext()) {
                            break;
                        }
                        Unit next4 = it4.next();
                        if ((next4 instanceof Factory) && !(next4 instanceof Turret) && !(next4 instanceof Extractor) && !next4.dead && instance.playerTeam.isEnemy(next4.team)) {
                            z5 = false;
                        }
                    }
                }
                if (z6) {
                    instance.levelComplete = true;
                }
            }
        }
    }
}
