package com.corrodinggames.rts.gameFramework.mission;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.map.C0173f;
import com.corrodinggames.rts.game.map.GroupObject;
import com.corrodinggames.rts.game.map.ObjectGroup;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.Turrets.Turret;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.TextWrapper;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncedObject;
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.effect.ImageStrip;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.l.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/f.class */
public class MissionEngine extends SyncedObject {

    /* renamed from: a */
    public static boolean f6066a = false;

    /* renamed from: b */
    int f6072b;

    /* renamed from: c */
    int f6073c;

    /* renamed from: d */
    Team f6074d;

    /* renamed from: e */
    WinConditions mapWinCondition;

    /* renamed from: h */
    public TextWrapper f6076h;

    /* renamed from: i */
    boolean f6077i;

    /* renamed from: j */
    boolean f6078j;

    /* renamed from: k */
    public boolean f6079k;

    /* renamed from: l */
    public boolean f6080l;

    /* renamed from: m */
    boolean f6081m;

    /* renamed from: n */
    boolean skirmish;

    /* renamed from: o */
    boolean f6083o;

    /* renamed from: p */
    boolean f6084p;

    /* renamed from: q */
    public boolean f6085q;

    /* renamed from: E */
    public Paint f6067E;

    /* renamed from: F */
    public Paint f6068F;

    /* renamed from: G */
    public Paint f6069G;

    /* renamed from: H */
    public Paint f6070H;

    /* renamed from: N */
    public boolean f6071N;

    /* renamed from: f */
    WinConditions f6086f = WinConditions.allUnitsAndBuildings;

    /* renamed from: g */
    public ArrayList f6087g = new ArrayList();

    /* renamed from: r */
    public int f6088r = 0;

    /* renamed from: s */
    String f6089s = null;

    /* renamed from: t */
    String f6090t = null;

    /* renamed from: u */
    int f6091u = 0;

    /* renamed from: v */
    int f6092v = 2;

    /* renamed from: w */
    int f6093w = 1;

    /* renamed from: x */
    int f6094x = 0;

    /* renamed from: y */
    public int f6095y = 0;

    /* renamed from: z */
    float f6096z = 3000.0f;

    /* renamed from: A */
    float f6097A = 0.0f;

    /* renamed from: B */
    float f6098B = 0.0f;

    /* renamed from: C */
    EnumC0888h f6099C = EnumC0888h.normal;

    /* renamed from: D */
    ArrayList f6100D = new ArrayList();

    /* renamed from: I */
    final boolean f6101I = true;

    /* renamed from: J */
    public ArrayList f6102J = new ArrayList();

    /* renamed from: K */
    PointF f6103K = new PointF();

    /* renamed from: L */
    int f6104L = 0;

    /* renamed from: M */
    float f6105M = 0.0f;

    /* renamed from: O */
    public ArrayList f6106O = new ArrayList();

    /* renamed from: P */
    PointF f6107P = new PointF();

    /* renamed from: Q */
    boolean f6108Q = false;

    /* renamed from: R */
    boolean f6109R = false;

    /* renamed from: S */
    ArrayList f6110S = new ArrayList();

    /* renamed from: T */
    ArrayList f6111T = new ArrayList();

    /* renamed from: a */
    public void m749a(String str) {
        GameEngine.log("MissionEngine", "Map warning: " + str);
        NetworkEngine.m1468a((String) null, "Map error: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f6078j);
        outputNetStream.writeInt(this.f6088r);
        outputNetStream.writeInt(this.f6091u);
        outputNetStream.writeInt(this.f6092v);
        outputNetStream.writeInt(this.f6093w);
        outputNetStream.writeInt(this.f6094x);
        outputNetStream.writeFloat(this.f6096z);
        outputNetStream.writeFloat(this.f6097A);
        outputNetStream.writeFloat(this.f6098B);
        outputNetStream.writeBoolean(this.f6081m);
        outputNetStream.writeInt(6);
        outputNetStream.writeInt(this.f6102J.size());
        Iterator it = this.f6102J.iterator();
        while (it.hasNext()) {
            C0867a c0867a = (C0867a) it.next();
            outputNetStream.writeString(c0867a.f6010c);
            outputNetStream.writeBoolean(c0867a.f6014j);
            outputNetStream.writeInt(c0867a.f6015k);
            outputNetStream.writeInt(c0867a.f6016l);
            outputNetStream.writeBoolean(c0867a.f6017m);
            outputNetStream.writeInt(c0867a.f6028n);
        }
        outputNetStream.writeInt(this.f6095y);
        outputNetStream.writeBoolean(this.f6080l);
    }

    /* renamed from: a */
    public void m753a(InputNetStream inputNetStream) {
        this.f6078j = inputNetStream.readBoolean();
        this.f6088r = inputNetStream.readInt();
        this.f6091u = inputNetStream.readInt();
        this.f6092v = inputNetStream.readInt();
        this.f6093w = inputNetStream.readInt();
        this.f6094x = inputNetStream.readInt();
        this.f6096z = inputNetStream.readFloat();
        this.f6097A = inputNetStream.readFloat();
        this.f6098B = inputNetStream.readFloat();
        this.f6081m = inputNetStream.readBoolean();
        int readInt = inputNetStream.readInt();
        if (readInt >= 1) {
            int readInt2 = inputNetStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                String readString = inputNetStream.readString();
                boolean readBoolean = inputNetStream.readBoolean();
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                if (readInt >= 2) {
                    i2 = inputNetStream.readInt();
                    i3 = inputNetStream.readInt();
                }
                if (readInt >= 3) {
                    z = inputNetStream.readBoolean();
                }
                if (readInt >= 4) {
                    i4 = inputNetStream.readInt();
                }
                C0867a m734e = m734e(readString);
                if (m734e == null) {
                    GameEngine.log("MissionEngine:readIn: Could not find saved trigger:" + readString + " for de/activation");
                } else {
                    m734e.f6014j = readBoolean;
                    m734e.f6015k = i2;
                    m734e.f6016l = i3;
                    m734e.f6017m = z;
                    m734e.f6028n = i4;
                }
            }
        }
        if (readInt >= 5) {
            this.f6095y = inputNetStream.readInt();
        }
        if (readInt >= 6) {
            this.f6080l = inputNetStream.readBoolean();
        } else {
            this.f6080l = true;
        }
    }

    /* renamed from: b */
    public void m743b(String str) {
        GameEngine.log("MissionEngine:triggerLog", str);
    }

    /* renamed from: a */
    public boolean m756a() {
        return this.skirmish;
    }

    /* renamed from: b */
    public boolean m745b() {
        return this.f6083o;
    }

    /* renamed from: a */
    public void m746a(boolean z) {
        String[] m4180a;
        String[] split;
        String[] split2;
        Integer m4172c;
        Integer m4172c2;
        GameEngine game = GameEngine.getInstance();
        this.f6085q = false;
        this.f6072b = game.f5845by - 1000;
        this.f6073c = game.f5845by - 1000;
        this.f6067E = new Paint();
        this.f6067E.m4717a(255, 255, 255, 255);
        this.f6067E.mo935a(true);
        this.f6067E.m4714a(Paint.Align.f197b);
        this.f6067E.mo937a(Typeface.m4631a(Typeface.f243c, 1));
        game.m892a(this.f6067E, 24.0f);
        this.f6069G = new Paint();
        this.f6069G.m4717a(255, 255, 255, 255);
        this.f6069G.mo935a(true);
        this.f6069G.m4714a(Paint.Align.f197b);
        game.m892a(this.f6069G, 18.0f);
        this.f6070H = new Paint();
        this.f6070H.m4717a(255, 255, 255, 255);
        this.f6070H.mo935a(true);
        this.f6070H.m4714a(Paint.Align.f197b);
        game.m892a(this.f6070H, 14.0f);
        this.f6068F = new Paint();
        this.f6068F.m4711a(this.f6070H);
        game.m892a(this.f6068F, 18.0f);
        this.f6078j = true;
        boolean z2 = false;
        GroupObject mapInfo = null;
        if (game.map.objectGroup_triggers == null) {
            GameEngine.log("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            mapInfo = game.map.objectGroup_triggers.getGroupObjectByName("map_info");
        }
        if (mapInfo == null) {
            GameEngine.log("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (mapInfo != null && mapInfo.getProperty("type") == null) {
            m749a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            GameEngine.log("MissionEngine", "Defaulting to skirmish");
            this.skirmish = true;
            this.mapWinCondition = WinConditions.noConstructionOrTech;
            return;
        }
        this.f6079k = "survival".equalsIgnoreCase(mapInfo.getProperty("type"));
        if (this.f6079k) {
            this.f6080l = "true".equalsIgnoreCase(mapInfo.getProperty("survivalWavesClassic"));
            if (this.f6080l) {
                GameEngine.PrintLOG("Classic survial waves selected");
            }
            m733f();
            this.f6084p = false;
            this.f6095y = game.curSettings.aiDifficulty;
            if (!this.f6080l) {
                this.f6096z = 1200.0f;
                if (this.f6095y < 0) {
                    this.f6096z = 3000.0f;
                }
            } else {
                this.f6096z = 3000.0f;
            }
        }
        String property = mapInfo.getProperty("survivalWaves");
        if (property != null) {
            m730g(property);
        }
        String property2 = mapInfo.getProperty("startWithMusic");
        if (property2 != null) {
            game.musicController.m2354a(property2);
        }
        this.skirmish = "skirmish".equalsIgnoreCase(mapInfo.getProperty("type"));
        if (this.skirmish) {
            this.mapWinCondition = WinConditions.noConstructionOrTech;
        }
        this.f6083o = "true".equalsIgnoreCase(mapInfo.getProperty("shareFogWithAllies"));
        String winConditionText = mapInfo.getProperty("winCondition");
        if (winConditionText == null && !this.skirmish) {
            throw new C0173f("win condition not set");
        }
        if (winConditionText != null) {
            if (winConditionText.equalsIgnoreCase("none")) {
                this.mapWinCondition = WinConditions.none;
            } else if (winConditionText.equalsIgnoreCase("allUnitsAndBuildings")) {
                this.mapWinCondition = WinConditions.allUnitsAndBuildings;
            } else if (winConditionText.equalsIgnoreCase("allBuildings")) {
                this.mapWinCondition = WinConditions.allBuildings;
            } else if (winConditionText.equalsIgnoreCase("mainBuilings")) {
                this.mapWinCondition = WinConditions.mainBuildings;
            } else if (winConditionText.equalsIgnoreCase("mainBuildings")) {
                this.mapWinCondition = WinConditions.mainBuildings;
            } else if (winConditionText.equalsIgnoreCase("commandCenter")) {
                this.mapWinCondition = WinConditions.commandCenter;
            } else if (winConditionText.equalsIgnoreCase("requiredObjectives")) {
                this.mapWinCondition = WinConditions.requiredObjectives;
            } else {
                throw new C0173f("unknown win condition:" + winConditionText);
            }
        }
        if (this.skirmish) {
            this.f6086f = this.mapWinCondition;
        }
        this.f6076h = mapInfo.m4177a("introText", (TextWrapper) null);
        if (this.f6076h != null) {
            this.f6076h.m3489a("\\\\n", "\n");
            if (this.f6076h.m3491a()) {
                this.f6076h = null;
            }
        }
        if (!game.m857au() && !this.skirmish) {
            this.f6074d = Team.getTeam(3);
            if (this.f6074d != null) {
                this.f6074d.allyGroup = 0;
            }
        }
        if (game.m857au()) {
        }
        Iterator it = game.map.objectGroup_triggers.objects.iterator();
        while (it.hasNext()) {
            GroupObject check = (GroupObject) it.next();
            if ("team_info".equalsIgnoreCase(check.type)) {
                int teamId = Integer.parseInt(check.m4176a("team", "-2"));
                if (teamId == -2) {
                    throw new RuntimeException("cannot find team for:" + check.name);
                }
                Team team = Team.getTeam(teamId);
                if (team == null) {
                    GameEngine.log("No team loaded for:" + teamId + " skipping");
                } else {
                    if (check.m4172c("credits") != null) {
                        team.credits = m4172c2.intValue();
                    }
                    if (check.getProperty("basicAI") != null && game.m918L() && (team instanceof AI)) {
                        GameEngine.log("Using basic AI:" + teamId + " by map request");
                        ((AI) team).f557aV = true;
                    }
                    String property3 = check.getProperty("lockAiDifficulty");
                    if (property3 != null && (team instanceof AI)) {
                        GameEngine.log("Locking lockAiDifficulty:" + teamId + " by map request to: " + property3);
                        AI ai = (AI) team;
                        ai.f1334u = Integer.parseInt(property3);
                        ai.aiDifficultyLocked = true;
                        game.networkEngine.updateNamesOfAI();
                    }
                    if (check.getProperty("disabledAI") != null && game.m918L() && (team instanceof AI)) {
                        GameEngine.log("Disabling AI:" + teamId + " by map request");
                        ((AI) team).f556aU = true;
                    }
                    String property4 = check.getProperty("allyGroup");
                    if (property4 != null && game.m918L()) {
                        team.allyGroup = Integer.parseInt(property4);
                    }
                    String property5 = check.getProperty("ai");
                    if (property5 != null) {
                        team.isSurvival = property5.equalsIgnoreCase("survival");
                    }
                }
            }
            if ("camera_start".equalsIgnoreCase(check.name) && !z) {
                game.m851b(check.x, check.y);
                this.f6085q = true;
                if (check.m4172c("zoomTo") != null) {
                    game.f5962cU = m4172c.intValue();
                }
            }
            if ("attack_point".equalsIgnoreCase(check.name)) {
                this.f6100D.add(new PointF(check.x, check.y));
            }
            if ("rotate".equalsIgnoreCase(check.type)) {
                float parseFloat = Float.parseFloat(check.getProperty("dir"));
                Iterator it2 = Unit.fastUnitList.iterator();
                while (it2.hasNext()) {
                    Unit unit = (Unit) it2.next();
                    if ((unit instanceof OrderableUnit) && !unit.mo2975bH() && check.m4179a(unit)) {
                        unit.direction = parseFloat;
                    }
                }
            }
            if ("fall".equalsIgnoreCase(check.type)) {
                Iterator it3 = Unit.fastUnitList.iterator();
                while (it3.hasNext()) {
                    Unit unit2 = (Unit) it3.next();
                    if ((unit2 instanceof OrderableUnit) && !unit2.mo2975bH() && check.m4179a(unit2)) {
                        unit2.mo3183cY();
                    }
                }
            }
            if ("set_team".equalsIgnoreCase(check.type)) {
                int parseInt = Integer.parseInt(check.getProperty("team"));
                Iterator it4 = Unit.fastUnitList.iterator();
                while (it4.hasNext()) {
                    Unit unit3 = (Unit) it4.next();
                    if ((unit3 instanceof OrderableUnit) && check.m4179a(unit3)) {
                        unit3.m3786O(parseInt);
                    }
                }
            }
            if ("ai_allow_full_use".equalsIgnoreCase(check.type)) {
                Iterator it5 = Unit.fastUnitList.iterator();
                while (it5.hasNext()) {
                    Unit unit4 = (Unit) it5.next();
                    if ((unit4 instanceof OrderableUnit) && check.m4179a(unit4)) {
                        ((OrderableUnit) unit4).f1603bE = false;
                    }
                }
            }
            if ("disable_unit_ai".equalsIgnoreCase(check.type)) {
                Iterator it6 = Unit.fastUnitList.iterator();
                while (it6.hasNext()) {
                    Unit unit5 = (Unit) it6.next();
                    if ((unit5 instanceof OrderableUnit) && check.m4179a(unit5)) {
                        unit5.f1604bF = true;
                    }
                }
            }
        }
        Iterator it7 = Unit.fastUnitList.iterator();
        while (it7.hasNext()) {
            Unit unit6 = (Unit) it7.next();
            if (!unit6.mo1773u() && !(unit6 instanceof Tree) && !unit6.mo2975bH() && unit6.transportedBy == null && unit6.f1630cF == null) {
                Unit unit7 = null;
                float f = 4900.0f;
                Iterator it8 = Unit.fastUnitList.iterator();
                while (it8.hasNext()) {
                    Unit unit8 = (Unit) it8.next();
                    if (unit8.mo2823cp() && unit6 != unit8 && (unit6.team == Team.f1346g || unit8.team.m3913d(unit6.team))) {
                        float distanceSq = CommonUtils.distanceSq(unit8.x, unit8.y, unit6.x, unit6.y);
                        if (distanceSq < f && unit8.mo2822d(unit6, true)) {
                            unit7 = unit8;
                            f = distanceSq;
                        }
                    }
                }
                if (unit7 != null) {
                    unit7.mo2819e(unit6, true);
                }
            }
        }
        this.f6102J.clear();
        Iterator it9 = game.map.objectGroup_triggers.objects.iterator();
        while (it9.hasNext()) {
            GroupObject groupObject = (GroupObject) it9.next();
            if (!"team_info".equalsIgnoreCase(groupObject.type) && !"point".equalsIgnoreCase(groupObject.type) && !"camera_pan".equalsIgnoreCase(groupObject.type) && !"camera_start".equalsIgnoreCase(groupObject.name) && !"map_info".equalsIgnoreCase(groupObject.name) && !"attack_point".equalsIgnoreCase(groupObject.name) && !"rotate".equalsIgnoreCase(groupObject.type) && !"fall".equalsIgnoreCase(groupObject.type) && !"set_team".equalsIgnoreCase(groupObject.type) && !"ai_allow_full_use".equalsIgnoreCase(groupObject.type) && !"disable_unit_ai".equalsIgnoreCase(groupObject.type) && !"info".equalsIgnoreCase(groupObject.type)) {
                if (groupObject.props == null) {
                    m739c("Error: Skipping trigger:" + groupObject.name + " - no properties found");
                } else {
                    C0867a m760a = C0872c.m760a(this, groupObject);
                    if (m760a != null) {
                        this.f6102J.add(m760a);
                    }
                }
            }
        }
        Iterator it10 = this.f6102J.iterator();
        while (it10.hasNext()) {
            C0867a c0867a = (C0867a) it10.next();
            String m780b = c0867a.m780b("activateIds");
            if (m780b == null) {
                m780b = c0867a.m780b("alsoActivate");
            }
            if (m780b != null) {
                for (String str : m780b.split(",")) {
                    C0867a m736d = m736d(str);
                    if (m736d == null) {
                        c0867a.m771g("linkedTo target not found: " + m780b);
                        GameEngine.PrintLOG("Possible IDs:");
                        Iterator it11 = this.f6102J.iterator();
                        while (it11.hasNext()) {
                            C0867a c0867a2 = (C0867a) it11.next();
                            if (c0867a2.f6009b != null) {
                                GameEngine.PrintLOG(c0867a2.f6009b);
                            }
                        }
                        GameEngine.PrintLOG("--------");
                    } else {
                        m736d.f6025d.m762a(c0867a);
                    }
                }
            }
            String m780b2 = c0867a.m780b("whenActivatedIds");
            if (m780b2 == null) {
                m780b2 = c0867a.m780b("activatedBy");
            }
            if (m780b2 != null) {
                for (String str2 : m780b2.split(",")) {
                    C0867a m736d2 = m736d(str2);
                    if (m736d2 == null) {
                        c0867a.m771g("linkedFrom target not found: " + str2);
                    } else {
                        c0867a.f6025d.m762a(m736d2);
                    }
                }
            }
            String m780b3 = c0867a.m780b("deactivatedBy");
            if (m780b3 != null) {
                for (String str3 : m780b3.split(",")) {
                    C0867a m736d3 = m736d(str3);
                    if (m736d3 == null) {
                        c0867a.m771g("deactivatedBy: target not found: " + str3);
                    } else {
                        c0867a.f6026e.m762a(m736d3);
                    }
                }
            }
        }
        GameEngine.PrintLOG("Found " + this.f6102J.size() + " map triggers");
        Iterator it12 = this.f6102J.iterator();
        while (it12.hasNext()) {
            C0867a c0867a3 = (C0867a) it12.next();
            int length = c0867a3.f6019t.m4180a().length;
            for (int i = 0; i < length; i++) {
                c0867a3.m771g("Key was not used: " + m4180a[i]);
            }
        }
        m741c();
    }

    /* renamed from: c */
    public void m741c() {
        Iterator it = this.f6102J.iterator();
        while (it.hasNext()) {
            C0867a c0867a = (C0867a) it.next();
            if (c0867a.f6011g == EnumC0874e.objective) {
                boolean z = false;
                Iterator it2 = this.f6087g.iterator();
                while (it2.hasNext()) {
                    if (((C0893m) it2.next()).f6140a == c0867a) {
                        z = true;
                    }
                }
                if (!z) {
                    C0893m c0893m = new C0893m();
                    c0893m.f6140a = c0867a;
                    this.f6087g.add(c0893m);
                    GameEngine.PrintLOG("Found objective: " + c0893m.m721a());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m739c(String str) {
        GameEngine.getInstance();
        GameEngine.log("MissionEngine", str);
        NetworkEngine.reportDesync(str);
    }

    /* renamed from: d */
    public C0867a m736d(String str) {
        String trim = str.trim();
        Iterator it = this.f6102J.iterator();
        while (it.hasNext()) {
            C0867a c0867a = (C0867a) it.next();
            if (c0867a.f6009b != null && c0867a.f6009b.equalsIgnoreCase(trim)) {
                return c0867a;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0867a m734e(String str) {
        String trim = str.trim();
        Iterator it = this.f6102J.iterator();
        while (it.hasNext()) {
            C0867a c0867a = (C0867a) it.next();
            if (c0867a.f6010c.equalsIgnoreCase(trim)) {
                return c0867a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public PointF m732f(String str) {
        ObjectGroup objectGroup = GameEngine.getInstance().map.objectGroup_triggers;
        if (objectGroup != null) {
            Iterator it = objectGroup.objects.iterator();
            while (it.hasNext()) {
                GroupObject groupObject = (GroupObject) it.next();
                if ("point".equalsIgnoreCase(groupObject.type) && groupObject.f750c != null && groupObject.f750c.equalsIgnoreCase(str)) {
                    this.f6103K.set(groupObject.x, groupObject.y);
                    return this.f6103K;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m755a(float f) {
        GameEngine.getInstance();
    }

    /* renamed from: b */
    public void m744b(float f) {
        C0887g m737d;
        C0889i c0889i;
        String m3488b;
        ImageStrip imageStrip;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f6077i) {
            Iterator it = this.f6102J.iterator();
            while (it.hasNext()) {
                C0867a c0867a = (C0867a) it.next();
                if (c0867a.f6011g == EnumC0874e.mapText && c0867a.f6014j) {
                    float m782b = c0867a.m782b() - gameEngine.viewpointX_rounded;
                    float m778c = c0867a.m778c() - gameEngine.viewpointY_rounded;
                    float f2 = m782b * gameEngine.viewpointZoom;
                    float f3 = m778c * gameEngine.viewpointZoom;
                    float f4 = f2 + c0867a.f6021w;
                    float f5 = f3 + c0867a.f6022x;
                    if (c0867a.f6007C) {
                        EffectEngine.imageStrips[9].m2187a(2, f4, f5, c0867a.f6006B);
                        f5 -= imageStrip.tileHeight - 2;
                    }
                    if (c0867a.f6024z != null && (m3488b = c0867a.f6024z.m3488b()) != null && !m3488b.equals(VariableScope.nullOrMissingString)) {
                        gameEngine.graphics.drawText(m3488b, f4, f5, c0867a.f6006B);
                    }
                }
            }
        }
        if (this.f6079k && !this.f6071N) {
            boolean z = false;
            this.f6098B = CommonUtils.toZero(this.f6098B, f);
            if (this.f6098B == 0.0f && this.f6097A != 0.0f) {
                this.f6097A = CommonUtils.toZero(this.f6097A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int m4678k = (int) (23.0f + (this.f6067E.m4678k() / 2.0f));
                    gameEngine.graphics.drawText("- Wave " + this.f6088r + " -", gameEngine.f5851cE / 2.0f, m4678k, this.f6067E);
                    if (this.f6089s != null) {
                        gameEngine.graphics.drawText(this.f6089s, gameEngine.f5851cE / 2.0f, m4678k + this.f6067E.m4678k() + 2.0f, this.f6068F);
                    }
                } else {
                    int m4678k2 = (int) (23.0f + (this.f6069G.m4678k() / 2.0f));
                    String str = "Wave " + (this.f6088r + 1) + " in " + CommonUtils.m1640f(String.valueOf((int) (this.f6096z / 60.0d)), 3);
                    if (this.f6081m) {
                        str = "Defeat - Wave " + this.f6088r;
                    }
                    gameEngine.graphics.drawText(str, gameEngine.f5851cE / 2.0f, m4678k2, this.f6069G);
                    if (this.f6090t == null) {
                        if (!this.f6080l) {
                            c0889i = m742b(false);
                        } else {
                            c0889i = m738c(false);
                        }
                        this.f6090t = c0889i.toString();
                    }
                    gameEngine.graphics.drawText(this.f6090t, gameEngine.f5851cE / 2.0f, m4678k2 + this.f6069G.m4678k() + 2.0f, this.f6070H);
                }
            }
        }
        if (this.f6079k && this.f6071N && (m737d = m737d()) != null) {
            int i = m737d.f6116e - (gameEngine.f5845by / 1000);
            int m4678k3 = (int) (23.0f + (this.f6069G.m4678k() / 2.0f));
            String str2 = "Wave " + (this.f6088r + 1) + " in " + CommonUtils.m1640f(String.valueOf(i), 3);
            if (this.f6081m) {
                str2 = "Defeat - Wave " + this.f6088r;
            }
            gameEngine.graphics.drawText(str2, gameEngine.f5851cE / 2.0f, m4678k3, this.f6069G);
            String str3 = m737d.f6117f;
            if (str3 != null) {
                gameEngine.graphics.drawText(str3, gameEngine.f5851cE / 2.0f, m4678k3 + this.f6069G.m4678k() + 2.0f, this.f6070H);
            }
        }
    }

    /* renamed from: g */
    public void m730g(String str) {
        String[] split;
        GameEngine.PrintLOG("Loading survival waves");
        this.f6071N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            C0887g c0887g = new C0887g(this);
            if (c0887g.m725a(str2)) {
                c0887g.f6116e = i + ((int) c0887g.f6115d);
                i = c0887g.f6116e;
                GameEngine.PrintLOG("Adding wave " + i2 + " at " + c0887g.f6116e);
                this.f6106O.add(c0887g);
            }
        }
    }

    /* renamed from: d */
    public C0887g m737d() {
        if (this.f6088r < this.f6106O.size()) {
            return (C0887g) this.f6106O.get(this.f6088r);
        }
        return null;
    }

    /* renamed from: e */
    public void m735e() {
        this.f6109R = true;
        this.f6107P.m4669a((PointF) this.f6100D.get(CommonUtils.m1735a(0, this.f6100D.size() - 1, this.f6088r)));
    }

    /* renamed from: f */
    public void m733f() {
        this.f6110S.clear();
        m747a(this.f6110S, "scout", 0.7f);
        m748a(this.f6110S, UnitType.f1712i, 2.1f);
        m747a(this.f6110S, "mechGun", 1.0f);
        m747a(this.f6110S, "lightGunship", 2.8f);
        m748a(this.f6110S, UnitType.f1713j, 1.9f);
        m748a(this.f6110S, UnitType.f1715l, 0.8f);
        m748a(this.f6110S, UnitType.f1726w, 1.0f);
        m748a(this.f6110S, UnitType.f1727x, 0.8f);
        m748a(this.f6110S, UnitType.f1717n, 0.7f);
        m747a(this.f6110S, "plasmaTank", 0.6f);
        m747a(this.f6110S, "missileAirship", 0.4f);
        this.f6111T.clear();
        m748a(this.f6111T, UnitType.f1680F, 1.0f);
        m748a(this.f6111T, UnitType.f1689O, 0.5f);
    }

    /* renamed from: a */
    public void m747a(ArrayList arrayList, String str, float f) {
        m748a(arrayList, UnitType.m3709a(str), f);
    }

    /* renamed from: a */
    public void m748a(ArrayList arrayList, com.corrodinggames.rts.game.units.UnitType unitType, float f) {
        if (unitType == null) {
            unitType = UnitType.f1712i;
        }
        com.corrodinggames.rts.game.units.UnitType m3101c = CustomUnitMetadata.m3101c(unitType);
        if (m3101c != null) {
            unitType = m3101c;
        }
        C0891k c0891k = new C0891k(this);
        c0891k.f6129a = unitType;
        c0891k.f6130b = f;
        arrayList.add(c0891k);
    }

    /* renamed from: a */
    public void m751a(C0889i c0889i, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.f6110S.size();
        if (size == 0) {
            GameEngine.log("error maxTypeNum: " + size);
            return;
        }
        C0891k c0891k = (C0891k) this.f6110S.get(i % size);
        int pow = (int) CommonUtils.pow((int) ((i + 3) * 0.5d * c0891k.f6130b * f), 0.8f);
        if (pow < 1) {
            pow = 1;
        }
        c0889i.m722b(c0891k.f6129a, pow);
    }

    /* renamed from: b */
    public C0889i m742b(boolean z) {
        C0889i c0889i = new C0889i(this);
        boolean z2 = false;
        if (this.f6091u > 50 && (this.f6091u + 1) % 100 == 0) {
            int size = this.f6111T.size();
            int i = this.f6091u / 100;
            if (size == 0) {
                GameEngine.log("error maxTypeNum: " + size);
            } else {
                C0891k c0891k = (C0891k) this.f6111T.get(i % size);
                int i2 = (int) (i * c0891k.f6130b);
                if (i2 < 1) {
                    i2 = 1;
                }
                c0889i.m722b(c0891k.f6129a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.f6095y > 0) {
            i3 = this.f6095y;
        }
        m751a(c0889i, this.f6091u + i3, 1.0f);
        if (this.f6091u > 15 && !z2) {
            m751a(c0889i, ((int) ((this.f6091u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.f6091u++;
            this.f6092v++;
        }
        return c0889i;
    }

    /* renamed from: c */
    public C0889i m738c(boolean z) {
        C0889i c0889i = new C0889i(this);
        c0889i.f6123a = false;
        int i = this.f6092v;
        UnitType unitType = null;
        if (this.f6084p) {
            unitType = UnitType.f1723t;
        } else {
            if (this.f6091u == 0) {
                i++;
                unitType = UnitType.f1712i;
            }
            if (this.f6091u == 1) {
                unitType = UnitType.f1713j;
            }
            if (this.f6091u == 2) {
                unitType = UnitType.f1715l;
            }
            if (this.f6091u == 3) {
                i = this.f6093w;
                unitType = UnitType.f1726w;
            }
            if (this.f6091u == 4) {
                i = this.f6093w;
                unitType = UnitType.f1727x;
                if (this.f6093w % 2 == 0) {
                    unitType = UnitType.f1717n;
                }
            }
            if (this.f6091u == 5) {
                c0889i.f6123a = true;
                i = 1;
                unitType = UnitType.f1680F;
            }
            if (z) {
                this.f6091u++;
                boolean z2 = false;
                if (this.f6093w == 1) {
                    if (this.f6091u > 2) {
                        z2 = true;
                    }
                } else if (this.f6093w < 5) {
                    if (this.f6091u > 4) {
                        z2 = true;
                    }
                } else {
                    if (this.f6091u > 5) {
                        z2 = true;
                    }
                    if (this.f6091u > 4 && this.f6093w % 2 == 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f6091u = 0;
                    this.f6092v += 2;
                    this.f6093w++;
                }
            }
        }
        c0889i.m723a(unitType, i);
        return c0889i;
    }

    /* renamed from: c */
    public void m740c(float f) {
        C0889i c0889i;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = gameEngine.f5845by;
        this.f6105M = CommonUtils.toZero(this.f6105M, f);
        if (gameEngine.f5818as && gameEngine.f5951bH) {
            GroupObject groupObject = null;
            if (gameEngine.map.objectGroup_triggers != null) {
                Iterator it = gameEngine.map.objectGroup_triggers.objects.iterator();
                while (it.hasNext()) {
                    GroupObject groupObject2 = (GroupObject) it.next();
                    if ("camera_pan".equalsIgnoreCase(groupObject2.type) && this.f6104L == Integer.parseInt(groupObject2.m4176a("index", "-1"))) {
                        groupObject = groupObject2;
                    }
                }
            }
            if (groupObject == null) {
                this.f6104L = 0;
            } else {
                float f2 = groupObject.x;
                float f3 = groupObject.y;
                if (f2 < gameEngine.f5854cH + 2.0f) {
                    f2 = gameEngine.f5854cH + 2.0f;
                }
                if (f3 < gameEngine.f5855cI + 2.0f) {
                    f3 = gameEngine.f5855cI + 2.0f;
                }
                if (f2 > (gameEngine.map.getWidthInPixels() - gameEngine.f5854cH) - 2.0f) {
                    f2 = (gameEngine.map.getWidthInPixels() - gameEngine.f5854cH) - 2.0f;
                }
                if (f3 > (gameEngine.map.getHeightInPixels() - gameEngine.f5855cI) - 2.0f) {
                    f3 = (gameEngine.map.getHeightInPixels() - gameEngine.f5855cI) - 2.0f;
                }
                float m1659d = CommonUtils.m1659d(gameEngine.f5882cx + gameEngine.f5854cH, gameEngine.f5883cy + gameEngine.f5855cI, f2, f3);
                float distanceSq = CommonUtils.distanceSq(gameEngine.f5882cx + gameEngine.f5854cH, gameEngine.f5883cy + gameEngine.f5855cI, f2, f3);
                if (this.f6105M == 0.0f && (distanceSq < 225.0f || gameEngine.f5877cs)) {
                    this.f6104L++;
                    this.f6105M = 50.0f;
                }
                float f4 = 0.45f * f;
                gameEngine.f5882cx += CommonUtils.cos(m1659d) * f4;
                gameEngine.f5883cy += CommonUtils.sin(m1659d) * f4;
                gameEngine.m902a(gameEngine.f5882cx, gameEngine.f5883cy);
                gameEngine.m917M();
            }
        }
        if (this.f6079k) {
            if (!this.f6071N) {
                if (!this.f6081m) {
                    this.f6096z = CommonUtils.toZero(this.f6096z, f);
                }
                if (this.f6096z == 0.0f && !this.f6081m) {
                    this.f6088r++;
                    this.f6097A = 180.0f;
                    PointF pointF = (PointF) this.f6100D.get(CommonUtils.m1735a(0, this.f6100D.size() - 1, this.f6088r));
                    if (!this.f6080l) {
                        this.f6089s = m742b(false).toString();
                        c0889i = m742b(true);
                    } else {
                        this.f6089s = m738c(false).toString();
                        c0889i = m738c(true);
                    }
                    this.f6096z = 1800.0f;
                    if (!this.f6080l) {
                        if (this.f6095y > 0) {
                            this.f6096z -= (this.f6095y * 3) * 60;
                        } else {
                            this.f6096z -= (this.f6095y * 9) * 60;
                        }
                    }
                    c0889i.m724a(pointF.x, pointF.y);
                    this.f6090t = null;
                }
            } else if (!this.f6081m) {
                C0887g m737d = m737d();
                if (m737d != null) {
                    if (m737d.f6116e * 1000 < gameEngine.f5845by) {
                        m737d.m726a();
                        this.f6088r++;
                    }
                } else if (!gameEngine.f5976dq && !gameEngine.replayEngine.isPlaying()) {
                    gameEngine.interfaceEngine.m1927E();
                }
            }
        }
        if (this.f6078j) {
            this.f6078j = false;
            if (this.f6076h != null) {
                gameEngine.m886a("Briefing", this.f6076h);
            }
        }
        if (i > this.f6072b + 250) {
            this.f6072b = i;
            m754a(i);
        }
        if (i > this.f6073c + 1000) {
            this.f6073c = i;
            if (m729h()) {
                m729h();
                m729h();
            }
            boolean z = false;
            boolean z2 = false;
            if (gameEngine.playerTeam != null) {
                if (gameEngine.playerTeam.m3896h()) {
                    z = true;
                }
                if (gameEngine.playerTeam.m3945b()) {
                    z2 = true;
                }
            }
            if (!gameEngine.f5976dq && !gameEngine.f5979dt && !gameEngine.replayEngine.isPlaying() && !z && !z2) {
                boolean z3 = true;
                boolean z4 = true;
                if (this.mapWinCondition == WinConditions.none) {
                    z3 = false;
                } else if (this.mapWinCondition == WinConditions.requiredObjectives) {
                    Iterator it2 = this.f6087g.iterator();
                    while (it2.hasNext()) {
                        if (!((C0893m) it2.next()).m720b()) {
                            z3 = false;
                        }
                    }
                } else if (gameEngine.playerTeam != null) {
                    Iterator it3 = Unit.fastUnitList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Unit unit = (Unit) it3.next();
                        if (gameEngine.playerTeam.m3925c(unit.team) && m750a(this.mapWinCondition, unit)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (this.f6086f == WinConditions.none) {
                    z4 = false;
                } else if (this.f6086f == WinConditions.requiredObjectives) {
                    z4 = false;
                } else if (gameEngine.playerTeam != null) {
                    Iterator it4 = Unit.fastUnitList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Unit unit2 = (Unit) it4.next();
                        if (gameEngine.playerTeam.m3913d(unit2.team) && m750a(this.f6086f, unit2)) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !z3) {
                    gameEngine.interfaceEngine.m1926F();
                }
                if (z3) {
                    gameEngine.interfaceEngine.m1927E();
                    if (gameEngine.f5845by > 1500) {
                        gameEngine.curSettings.numberOfWins++;
                        gameEngine.curSettings.save();
                    }
                }
            }
            if (this.f6079k && !this.f6081m) {
                boolean z5 = true;
                Iterator it5 = Unit.fastUnitList.iterator();
                while (it5.hasNext()) {
                    Unit unit3 = (Unit) it5.next();
                    if ((unit3 instanceof CommandCenter) || unit3.f1606bH) {
                        if (!unit3.dead && !unit3.mo1773u() && unit3.team == gameEngine.playerTeam) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    this.f6081m = true;
                    gameEngine.interfaceEngine.m1926F();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m750a(WinConditions winConditions, Unit unit) {
        if (!(unit instanceof OrderableUnit) || unit.dead || unit.mo3187cQ() || winConditions == WinConditions.none) {
            return false;
        }
        if (winConditions == WinConditions.allUnitsAndBuildings) {
            return true;
        }
        if (winConditions == WinConditions.allBuildings) {
            return unit.mo2975bH();
        }
        if (winConditions == WinConditions.commandCenter) {
            return (unit instanceof CommandCenter) || unit.f1606bH;
        } else if (winConditions == WinConditions.mainBuildings) {
            return unit.mo2975bH() && unit.mo2879bI() && !(unit instanceof Turret) && !(unit instanceof Extractor);
        } else if (winConditions == WinConditions.noConstructionOrTech) {
            if (unit.mo2879bI() || unit.mo2560aj()) {
                return true;
            }
            return false;
        } else if (winConditions == WinConditions.requiredObjectives) {
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public void m728h(String str) {
        GameEngine.PrintLOG("Map Script: " + str);
    }

    /* renamed from: a */
    public void m752a(C0867a c0867a) {
        if (m731g()) {
            m728h("Activiated trigger:" + c0867a.f6008a + " (id:" + c0867a.f6009b + ")");
        }
    }

    /* renamed from: g */
    public boolean m731g() {
        return f6066a && GameEngine.getInstance().debugTempMode;
    }

    /* renamed from: i */
    public static void m727i(String str) {
        NetworkEngine.reportDesync("Map ScriptError: " + str);
    }

    /* renamed from: a */
    public void m754a(int i) {
        Iterator it = this.f6102J.iterator();
        while (it.hasNext()) {
            C0867a c0867a = (C0867a) it.next();
            if (c0867a.f6014j && c0867a.f6030q != -1 && i >= c0867a.f6015k + c0867a.f6030q) {
                c0867a.f6014j = false;
                c0867a.f6033u = false;
            }
            if (!c0867a.f6014j && !c0867a.f6033u && c0867a.m775d()) {
                c0867a.f6033u = true;
            }
            if ((c0867a.f6014j || c0867a.f6033u) && c0867a.f6026e.m761b()) {
                c0867a.f6014j = false;
                c0867a.f6033u = false;
                c0867a.f6017m = true;
            }
            if (c0867a.f6014j && c0867a.f6018p > 0 && i >= c0867a.f6015k + c0867a.f6018p) {
                c0867a.f6033u = true;
            }
            if (c0867a.f6033u) {
                c0867a.f6033u = false;
                try {
                    C0873d.m759a(this, c0867a);
                } catch (C0173f e) {
                    e.printStackTrace();
                    c0867a.m771g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: h */
    public boolean m729h() {
        boolean z;
        boolean z2 = false;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == Team.f1346g && (unit instanceof OrderableUnit) && unit.isActive() && !unit.mo2860o()) {
                int i2 = 0;
                int size2 = Unit.fastUnitList.size();
                while (true) {
                    if (i2 < size2) {
                        Unit unit2 = m485a[i2];
                        if (!gameEngine.m857au()) {
                            z = unit2.team == gameEngine.playerTeam;
                        } else {
                            z = !unit2.team.f1333t;
                        }
                        if (unit2.team != null && unit2.team.teamID < 0) {
                            z = false;
                        }
                        if (!z || unit2.team == unit.team || !(unit2 instanceof OrderableUnit) || unit2.mo2676i() || !unit2.isActive() || CommonUtils.distanceSq(unit2.x, unit2.y, unit.x, unit.y) >= 28900.0f) {
                            i2++;
                        } else {
                            unit.mo3151e(unit2.team);
                            unit.f1627cA = 60.0f;
                            z2 = true;
                            break;
                        }
                    }
                }
            }
        }
        return z2;
    }
}