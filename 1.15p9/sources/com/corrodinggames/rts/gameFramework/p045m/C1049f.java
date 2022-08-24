package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0182i;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.p025a.Turret;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/f.class */
public class C1049f extends AbstractC0726bk {

    /* renamed from: a */
    public static boolean f6652a = false;

    /* renamed from: b */
    int f6653b;

    /* renamed from: c */
    int f6654c;

    /* renamed from: d */
    Team f6655d;

    /* renamed from: e */
    EnumC1055l f6656e;

    /* renamed from: h */
    public C0385az f6659h;

    /* renamed from: i */
    boolean f6660i;

    /* renamed from: j */
    boolean f6661j;

    /* renamed from: k */
    public boolean f6662k;

    /* renamed from: l */
    public boolean f6663l;

    /* renamed from: m */
    boolean f6664m;

    /* renamed from: n */
    boolean f6665n;

    /* renamed from: o */
    boolean f6666o;

    /* renamed from: p */
    boolean f6667p;

    /* renamed from: q */
    public boolean f6668q;

    /* renamed from: E */
    public Paint f6682E;

    /* renamed from: F */
    public Paint f6683F;

    /* renamed from: G */
    public Paint f6684G;

    /* renamed from: H */
    public Paint f6685H;

    /* renamed from: N */
    public boolean f6691N;

    /* renamed from: f */
    EnumC1055l f6657f = EnumC1055l.allUnitsAndBuildings;

    /* renamed from: g */
    public ArrayList f6658g = new ArrayList();

    /* renamed from: r */
    public int f6669r = 0;

    /* renamed from: s */
    String f6670s = null;

    /* renamed from: t */
    String f6671t = null;

    /* renamed from: u */
    int f6672u = 0;

    /* renamed from: v */
    int f6673v = 2;

    /* renamed from: w */
    int f6674w = 1;

    /* renamed from: x */
    int f6675x = 0;

    /* renamed from: y */
    public int f6676y = 0;

    /* renamed from: z */
    float f6677z = 3000.0f;

    /* renamed from: A */
    float f6678A = 0.0f;

    /* renamed from: B */
    float f6679B = 0.0f;

    /* renamed from: C */
    EnumC1051h f6680C = EnumC1051h.normal;

    /* renamed from: D */
    ArrayList f6681D = new ArrayList();

    /* renamed from: I */
    final boolean f6686I = true;

    /* renamed from: J */
    public ArrayList f6687J = new ArrayList();

    /* renamed from: K */
    PointF f6688K = new PointF();

    /* renamed from: L */
    int f6689L = 0;

    /* renamed from: M */
    float f6690M = 0.0f;

    /* renamed from: O */
    public ArrayList f6692O = new ArrayList();

    /* renamed from: P */
    PointF f6693P = new PointF();

    /* renamed from: Q */
    boolean f6694Q = false;

    /* renamed from: R */
    boolean f6695R = false;

    /* renamed from: S */
    ArrayList f6696S = new ArrayList();

    /* renamed from: T */
    ArrayList f6697T = new ArrayList();

    /* renamed from: a */
    public void m824a(String str) {
        GameEngine.m1144b("MissionEngine", "Map warning: " + str);
        C0831ad.m1743a((String) null, "Map error: " + str);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f6661j);
        c0859ar.mo1487a(this.f6669r);
        c0859ar.mo1487a(this.f6672u);
        c0859ar.mo1487a(this.f6673v);
        c0859ar.mo1487a(this.f6674w);
        c0859ar.mo1487a(this.f6675x);
        c0859ar.mo1488a(this.f6677z);
        c0859ar.mo1488a(this.f6678A);
        c0859ar.mo1488a(this.f6679B);
        c0859ar.mo1482a(this.f6664m);
        c0859ar.mo1487a(6);
        c0859ar.mo1487a(this.f6687J.size());
        Iterator it = this.f6687J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            c0859ar.m1553c(c1030a.f6593c);
            c0859ar.mo1482a(c1030a.f6597j);
            c0859ar.mo1487a(c1030a.f6598k);
            c0859ar.mo1487a(c1030a.f6599l);
            c0859ar.mo1482a(c1030a.f6600m);
            c0859ar.mo1487a(c1030a.f6614n);
        }
        c0859ar.mo1487a(this.f6676y);
        c0859ar.mo1482a(this.f6663l);
    }

    /* renamed from: a */
    public void m828a(C0876k c0876k) {
        this.f6661j = c0876k.m1455e();
        this.f6669r = c0876k.m1454f();
        this.f6672u = c0876k.m1454f();
        this.f6673v = c0876k.m1454f();
        this.f6674w = c0876k.m1454f();
        this.f6675x = c0876k.m1454f();
        this.f6677z = c0876k.m1453g();
        this.f6678A = c0876k.m1453g();
        this.f6679B = c0876k.m1453g();
        this.f6664m = c0876k.m1455e();
        int m1454f = c0876k.m1454f();
        if (m1454f >= 1) {
            int m1454f2 = c0876k.m1454f();
            for (int i = 0; i < m1454f2; i++) {
                String m1448l = c0876k.m1448l();
                boolean m1455e = c0876k.m1455e();
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                if (m1454f >= 2) {
                    i2 = c0876k.m1454f();
                    i3 = c0876k.m1454f();
                }
                if (m1454f >= 3) {
                    z = c0876k.m1455e();
                }
                if (m1454f >= 4) {
                    i4 = c0876k.m1454f();
                }
                C1030a m809e = m809e(m1448l);
                if (m809e == null) {
                    GameEngine.m1145b("MissionEngine:readIn: Could not find saved trigger:" + m1448l + " for de/activation");
                } else {
                    m809e.f6597j = m1455e;
                    m809e.f6598k = i2;
                    m809e.f6599l = i3;
                    m809e.f6600m = z;
                    m809e.f6614n = i4;
                }
            }
        }
        if (m1454f >= 5) {
            this.f6676y = c0876k.m1454f();
        }
        if (m1454f >= 6) {
            this.f6663l = c0876k.m1455e();
        } else {
            this.f6663l = true;
        }
    }

    /* renamed from: b */
    public void m818b(String str) {
        GameEngine.m1144b("MissionEngine:triggerLog", str);
    }

    /* renamed from: a */
    public boolean m831a() {
        return this.f6665n;
    }

    /* renamed from: b */
    public boolean m820b() {
        return this.f6666o;
    }

    /* renamed from: a */
    public void m821a(boolean z) {
        String[] m6664a;
        String[] split;
        String[] split2;
        Integer m6656c;
        Integer m6656c2;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f6668q = false;
        this.f6653b = gameEngine.f6096by - 1000;
        this.f6654c = gameEngine.f6096by - 1000;
        this.f6682E = new Paint();
        this.f6682E.m7267a(255, 255, 255, 255);
        this.f6682E.m7248a(true);
        this.f6682E.m7263a(Paint.Align.CENTER);
        this.f6682E.m7258a(Typeface.m7174a(Typeface.f246c, 1));
        gameEngine.m1197a(this.f6682E, 24.0f);
        this.f6684G = new Paint();
        this.f6684G.m7267a(255, 255, 255, 255);
        this.f6684G.m7248a(true);
        this.f6684G.m7263a(Paint.Align.CENTER);
        gameEngine.m1197a(this.f6684G, 18.0f);
        this.f6685H = new Paint();
        this.f6685H.m7267a(255, 255, 255, 255);
        this.f6685H.m7248a(true);
        this.f6685H.m7263a(Paint.Align.CENTER);
        gameEngine.m1197a(this.f6685H, 14.0f);
        this.f6683F = new Paint();
        this.f6683F.m7259a(this.f6685H);
        gameEngine.m1197a(this.f6683F, 18.0f);
        this.f6661j = true;
        boolean z2 = false;
        C0172a c0172a = null;
        if (gameEngine.f6104bL.f797Q == null) {
            GameEngine.m1144b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            c0172a = gameEngine.f6104bL.f797Q.m6535a("map_info");
        }
        if (c0172a == null) {
            GameEngine.m1144b("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (c0172a != null && c0172a.m6657b("type") == null) {
            m824a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            GameEngine.m1144b("MissionEngine", "Defaulting to skirmish");
            this.f6665n = true;
            this.f6656e = EnumC1055l.noConstructionOrTech;
            return;
        }
        this.f6662k = "survival".equalsIgnoreCase(c0172a.m6657b("type"));
        if (this.f6662k) {
            this.f6663l = "true".equalsIgnoreCase(c0172a.m6657b("survivalWavesClassic"));
            if (this.f6663l) {
                GameEngine.PrintLog("Classic survial waves selected");
            }
            m808f();
            this.f6667p = false;
            this.f6676y = gameEngine.f6109bQ.aiDifficulty;
            if (!this.f6663l) {
                this.f6677z = 1200.0f;
                if (this.f6676y < 0) {
                    this.f6677z = 3000.0f;
                }
            } else {
                this.f6677z = 3000.0f;
            }
        }
        String m6657b = c0172a.m6657b("survivalWaves");
        if (m6657b != null) {
            m805g(m6657b);
        }
        String m6657b2 = c0172a.m6657b("startWithMusic");
        if (m6657b2 != null) {
            gameEngine.f6106bN.m2928a(m6657b2);
        }
        this.f6665n = "skirmish".equalsIgnoreCase(c0172a.m6657b("type"));
        if (this.f6665n) {
            this.f6656e = EnumC1055l.noConstructionOrTech;
        }
        this.f6666o = "true".equalsIgnoreCase(c0172a.m6657b("shareFogWithAllies"));
        String m6657b3 = c0172a.m6657b("winCondition");
        if (m6657b3 == null && !this.f6665n) {
            throw new C0179f("win condition not set");
        }
        if (m6657b3 != null) {
            if (m6657b3.equalsIgnoreCase("none")) {
                this.f6656e = EnumC1055l.none;
            } else if (m6657b3.equalsIgnoreCase("allUnitsAndBuildings")) {
                this.f6656e = EnumC1055l.allUnitsAndBuildings;
            } else if (m6657b3.equalsIgnoreCase("allBuildings")) {
                this.f6656e = EnumC1055l.allBuildings;
            } else if (m6657b3.equalsIgnoreCase("mainBuilings")) {
                this.f6656e = EnumC1055l.mainBuildings;
            } else if (m6657b3.equalsIgnoreCase("mainBuildings")) {
                this.f6656e = EnumC1055l.mainBuildings;
            } else if (m6657b3.equalsIgnoreCase("commandCenter")) {
                this.f6656e = EnumC1055l.commandCenter;
            } else if (m6657b3.equalsIgnoreCase("requiredObjectives")) {
                this.f6656e = EnumC1055l.requiredObjectives;
            } else {
                throw new C0179f("unknown win condition:" + m6657b3);
            }
        }
        if (this.f6665n) {
            this.f6657f = this.f6656e;
        }
        this.f6659h = c0172a.m6661a("introText", (C0385az) null);
        if (this.f6659h != null) {
            this.f6659h.m5340a("\\\\n", "\n");
            if (this.f6659h.m5342a()) {
                this.f6659h = null;
            }
        }
        if (!gameEngine.m1154ax() && !this.f6665n) {
            this.f6655d = Team.m6317k(3);
            if (this.f6655d != null) {
                this.f6655d.f1311q = 0;
            }
        }
        if (gameEngine.m1154ax()) {
        }
        Iterator it = gameEngine.f6104bL.f797Q.f945c.iterator();
        while (it.hasNext()) {
            C0172a c0172a2 = (C0172a) it.next();
            if ("team_info".equalsIgnoreCase(c0172a2.f768d)) {
                int parseInt = Integer.parseInt(c0172a2.m6660a("team", "-2"));
                if (parseInt == -2) {
                    throw new RuntimeException("cannot find team for:" + c0172a2.f766b);
                }
                Team m6317k = Team.m6317k(parseInt);
                if (m6317k == null) {
                    GameEngine.m1145b("No team loaded for:" + parseInt + " skipping");
                } else {
                    if (c0172a2.m6656c("credits") != null) {
                        m6317k.f1309o = m6656c2.intValue();
                    }
                    if (c0172a2.m6657b("basicAI") != null && gameEngine.m1220O() && (m6317k instanceof C0136a)) {
                        GameEngine.m1145b("Using basic AI:" + parseInt + " by map request");
                        ((C0136a) m6317k).f584aX = true;
                    }
                    String m6657b4 = c0172a2.m6657b("lockAiDifficulty");
                    if (m6657b4 != null && (m6317k instanceof C0136a)) {
                        GameEngine.m1145b("Locking lockAiDifficulty:" + parseInt + " by map request to: " + m6657b4);
                        C0136a c0136a = (C0136a) m6317k;
                        c0136a.f1317w = Integer.parseInt(m6657b4);
                        c0136a.f1318x = true;
                        gameEngine.networkEngine.m1712aq();
                    }
                    if (c0172a2.m6657b("disabledAI") != null && gameEngine.m1220O() && (m6317k instanceof C0136a)) {
                        GameEngine.m1145b("Disabling AI:" + parseInt + " by map request");
                        ((C0136a) m6317k).f583aW = true;
                    }
                    String m6657b5 = c0172a2.m6657b("allyGroup");
                    if (m6657b5 != null && gameEngine.m1220O()) {
                        m6317k.f1311q = Integer.parseInt(m6657b5);
                    }
                    String m6657b6 = c0172a2.m6657b("ai");
                    if (m6657b6 != null) {
                        m6317k.f1343T = m6657b6.equalsIgnoreCase("survival");
                    }
                }
            }
            if ("camera_start".equalsIgnoreCase(c0172a2.f766b) && !z) {
                gameEngine.m1150b(c0172a2.f769e, c0172a2.f770f);
                this.f6668q = true;
                if (c0172a2.m6656c("zoomTo") != null) {
                    gameEngine.f6248cU = m6656c.intValue();
                }
            }
            if ("attack_point".equalsIgnoreCase(c0172a2.f766b)) {
                this.f6681D.add(new PointF(c0172a2.f769e, c0172a2.f770f));
            }
            if ("rotate".equalsIgnoreCase(c0172a2.f768d)) {
                float parseFloat = Float.parseFloat(c0172a2.m6657b("dir"));
                Iterator it2 = Unit.f1589bD.iterator();
                while (it2.hasNext()) {
                    Unit unit = (Unit) it2.next();
                    if ((unit instanceof AbstractC0623y) && !unit.m5867bI() && c0172a2.m6663a(unit)) {
                        unit.direction = parseFloat;
                    }
                }
            }
            if ("fall".equalsIgnoreCase(c0172a2.f768d)) {
                Iterator it3 = Unit.f1589bD.iterator();
                while (it3.hasNext()) {
                    Unit unit2 = (Unit) it3.next();
                    if ((unit2 instanceof AbstractC0623y) && !unit2.m5867bI() && c0172a2.m6663a(unit2)) {
                        unit2.m5789da();
                    }
                }
            }
            if ("set_team".equalsIgnoreCase(c0172a2.f768d)) {
                int parseInt2 = Integer.parseInt(c0172a2.m6657b("team"));
                Iterator it4 = Unit.f1589bD.iterator();
                while (it4.hasNext()) {
                    Unit unit3 = (Unit) it4.next();
                    if ((unit3 instanceof AbstractC0623y) && c0172a2.m6663a(unit3)) {
                        unit3.m5902P(parseInt2);
                    }
                }
            }
            if ("ai_allow_full_use".equalsIgnoreCase(c0172a2.f768d)) {
                Iterator it5 = Unit.f1589bD.iterator();
                while (it5.hasNext()) {
                    Unit unit4 = (Unit) it5.next();
                    if ((unit4 instanceof AbstractC0623y) && c0172a2.m6663a(unit4)) {
                        ((AbstractC0623y) unit4).f1598bL = false;
                    }
                }
            }
            if ("disable_unit_ai".equalsIgnoreCase(c0172a2.f768d)) {
                Iterator it6 = Unit.f1589bD.iterator();
                while (it6.hasNext()) {
                    Unit unit5 = (Unit) it6.next();
                    if ((unit5 instanceof AbstractC0623y) && c0172a2.m6663a(unit5)) {
                        unit5.f1599bM = true;
                    }
                }
            }
        }
        Iterator it7 = Unit.f1589bD.iterator();
        while (it7.hasNext()) {
            Unit unit6 = (Unit) it7.next();
            if (!unit6.m5755u() && !(unit6 instanceof Tree) && !unit6.m5867bI() && unit6.f1650cL == null && unit6.f1651cM == null) {
                Unit unit7 = null;
                float f = 4900.0f;
                Iterator it8 = Unit.f1589bD.iterator();
                while (it8.hasNext()) {
                    Unit unit8 = (Unit) it8.next();
                    if (unit8.m5803cq() && unit6 != unit8 && (unit6.team == Team.f1370i || unit8.team.m6342d(unit6.team))) {
                        float m2366a = CommonUtils.m2366a(unit8.f6951ek, unit8.f6952el, unit6.f6951ek, unit6.f6952el);
                        if (m2366a < f && unit8.m5792d(unit6, true)) {
                            unit7 = unit8;
                            f = m2366a;
                        }
                    }
                }
                if (unit7 != null) {
                    unit7.m5772e(unit6, true);
                }
            }
        }
        this.f6687J.clear();
        Iterator it9 = gameEngine.f6104bL.f797Q.f945c.iterator();
        while (it9.hasNext()) {
            C0172a c0172a3 = (C0172a) it9.next();
            if (!"team_info".equalsIgnoreCase(c0172a3.f768d) && !"point".equalsIgnoreCase(c0172a3.f768d) && !"camera_pan".equalsIgnoreCase(c0172a3.f768d) && !"camera_start".equalsIgnoreCase(c0172a3.f766b) && !"map_info".equalsIgnoreCase(c0172a3.f766b) && !"attack_point".equalsIgnoreCase(c0172a3.f766b) && !"rotate".equalsIgnoreCase(c0172a3.f768d) && !"fall".equalsIgnoreCase(c0172a3.f768d) && !"set_team".equalsIgnoreCase(c0172a3.f768d) && !"ai_allow_full_use".equalsIgnoreCase(c0172a3.f768d) && !"disable_unit_ai".equalsIgnoreCase(c0172a3.f768d) && !"info".equalsIgnoreCase(c0172a3.f768d)) {
                if (c0172a3.f779n == null) {
                    m814c("Error: Skipping trigger:" + c0172a3.f766b + " - no properties found");
                } else {
                    C1030a m835a = C1035c.m835a(this, c0172a3);
                    if (m835a != null) {
                        this.f6687J.add(m835a);
                    }
                }
            }
        }
        Iterator it10 = this.f6687J.iterator();
        while (it10.hasNext()) {
            C1030a c1030a = (C1030a) it10.next();
            String m856b = c1030a.m856b("activateIds");
            if (m856b == null) {
                m856b = c1030a.m856b("alsoActivate");
            }
            if (m856b != null) {
                for (String str : m856b.split(",")) {
                    C1030a m811d = m811d(str);
                    if (m811d == null) {
                        c1030a.m847g("linkedTo target not found: " + m856b);
                        GameEngine.PrintLog("Possible IDs:");
                        Iterator it11 = this.f6687J.iterator();
                        while (it11.hasNext()) {
                            C1030a c1030a2 = (C1030a) it11.next();
                            if (c1030a2.f6592b != null) {
                                GameEngine.PrintLog(c1030a2.f6592b);
                            }
                        }
                        GameEngine.PrintLog("--------");
                    } else {
                        m811d.f6611d.m837a(c1030a);
                    }
                }
            }
            String m856b2 = c1030a.m856b("whenActivatedIds");
            if (m856b2 == null) {
                m856b2 = c1030a.m856b("activatedBy");
            }
            if (m856b2 != null) {
                for (String str2 : m856b2.split(",")) {
                    C1030a m811d2 = m811d(str2);
                    if (m811d2 == null) {
                        c1030a.m847g("linkedFrom target not found: " + str2);
                    } else {
                        c1030a.f6611d.m837a(m811d2);
                    }
                }
            }
            String m856b3 = c1030a.m856b("deactivatedBy");
            if (m856b3 != null) {
                for (String str3 : m856b3.split(",")) {
                    C1030a m811d3 = m811d(str3);
                    if (m811d3 == null) {
                        c1030a.m847g("deactivatedBy: target not found: " + str3);
                    } else {
                        c1030a.f6612e.m837a(m811d3);
                    }
                }
            }
        }
        GameEngine.PrintLog("Found " + this.f6687J.size() + " map triggers");
        Iterator it12 = this.f6687J.iterator();
        while (it12.hasNext()) {
            C1030a c1030a3 = (C1030a) it12.next();
            int length = c1030a3.f6602t.m6664a().length;
            for (int i = 0; i < length; i++) {
                c1030a3.m847g("Key was not used: " + m6664a[i]);
            }
        }
        m816c();
    }

    /* renamed from: c */
    public void m816c() {
        Iterator it = this.f6687J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6594g == EnumC1037e.f6640a) {
                boolean z = false;
                Iterator it2 = this.f6658g.iterator();
                while (it2.hasNext()) {
                    if (((C1056m) it2.next()).f6726a == c1030a) {
                        z = true;
                    }
                }
                if (!z) {
                    C1056m c1056m = new C1056m();
                    c1056m.f6726a = c1030a;
                    this.f6658g.add(c1056m);
                    GameEngine.PrintLog("Found objective: " + c1056m.m796a());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m814c(String str) {
        GameEngine.getInstance();
        GameEngine.m1144b("MissionEngine", str);
        C0831ad.m1648g(str);
    }

    /* renamed from: d */
    public C1030a m811d(String str) {
        String trim = str.trim();
        Iterator it = this.f6687J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6592b != null && c1030a.f6592b.equalsIgnoreCase(trim)) {
                return c1030a;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C1030a m809e(String str) {
        String trim = str.trim();
        Iterator it = this.f6687J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6593c.equalsIgnoreCase(trim)) {
                return c1030a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public PointF m807f(String str) {
        C0182i c0182i = GameEngine.getInstance().f6104bL.f797Q;
        if (c0182i != null) {
            Iterator it = c0182i.f945c.iterator();
            while (it.hasNext()) {
                C0172a c0172a = (C0172a) it.next();
                if ("point".equalsIgnoreCase(c0172a.f768d) && c0172a.f767c != null && c0172a.f767c.equalsIgnoreCase(str)) {
                    this.f6688K.m7213a(c0172a.f769e, c0172a.f770f);
                    return this.f6688K;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m830a(float f) {
        GameEngine.getInstance();
    }

    /* renamed from: b */
    public void m819b(float f) {
        C1050g m812d;
        C1052i m813c;
        String m5339b;
        C0747g c0747g;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f6660i) {
            Iterator it = this.f6687J.iterator();
            while (it.hasNext()) {
                C1030a c1030a = (C1030a) it.next();
                if (c1030a.f6594g == EnumC1037e.f6646g && c1030a.f6597j) {
                    float m858b = c1030a.m858b() - gameEngine.f6138cv;
                    float m854c = c1030a.m854c() - gameEngine.f6139cw;
                    float f2 = m858b * gameEngine.f6250cW;
                    float f3 = m854c * gameEngine.f6250cW;
                    float f4 = f2 + c1030a.f6604w;
                    float f5 = f3 + c1030a.f6605x;
                    if (c1030a.f6610C) {
                        C0743c.f4684s[9].m2504a(2, f4, f5, c1030a.f6609B);
                        f5 -= c0747g.f4815c - 2;
                    }
                    if (c1030a.f6607z != null && (m5339b = c1030a.f6607z.m5339b()) != null && !m5339b.equals(VariableScope.nullOrMissingString)) {
                        gameEngine.graphics.mo903a(m5339b, f4, f5, c1030a.f6609B);
                    }
                }
            }
        }
        if (this.f6662k && !this.f6691N) {
            boolean z = false;
            this.f6679B = CommonUtils.m2368a(this.f6679B, f);
            if (this.f6679B == 0.0f && this.f6678A != 0.0f) {
                this.f6678A = CommonUtils.m2368a(this.f6678A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int m7222k = (int) (23.0f + (this.f6682E.m7222k() / 2.0f));
                    gameEngine.graphics.mo903a("- Wave " + this.f6669r + " -", gameEngine.f6147cE / 2.0f, m7222k, this.f6682E);
                    if (this.f6670s != null) {
                        gameEngine.graphics.mo903a(this.f6670s, gameEngine.f6147cE / 2.0f, m7222k + this.f6682E.m7222k() + 2.0f, this.f6683F);
                    }
                } else {
                    int m7222k2 = (int) (23.0f + (this.f6684G.m7222k() / 2.0f));
                    String str = "Wave " + (this.f6669r + 1) + " in " + CommonUtils.m2261f(String.valueOf((int) (this.f6677z / 60.0d)), 3);
                    if (this.f6664m) {
                        str = "Defeat - Wave " + this.f6669r;
                    }
                    gameEngine.graphics.mo903a(str, gameEngine.f6147cE / 2.0f, m7222k2, this.f6684G);
                    if (this.f6671t == null) {
                        if (!this.f6663l) {
                            m813c = m817b(false);
                        } else {
                            m813c = m813c(false);
                        }
                        this.f6671t = m813c.toString();
                    }
                    gameEngine.graphics.mo903a(this.f6671t, gameEngine.f6147cE / 2.0f, m7222k2 + this.f6684G.m7222k() + 2.0f, this.f6685H);
                }
            }
        }
        if (this.f6662k && this.f6691N && (m812d = m812d()) != null) {
            int i = m812d.f6702e - (gameEngine.f6096by / 1000);
            int m7222k3 = (int) (23.0f + (this.f6684G.m7222k() / 2.0f));
            String str2 = "Wave " + (this.f6669r + 1) + " in " + CommonUtils.m2261f(String.valueOf(i), 3);
            if (this.f6664m) {
                str2 = "Defeat - Wave " + this.f6669r;
            }
            gameEngine.graphics.mo903a(str2, gameEngine.f6147cE / 2.0f, m7222k3, this.f6684G);
            String str3 = m812d.f6703f;
            if (str3 != null) {
                gameEngine.graphics.mo903a(str3, gameEngine.f6147cE / 2.0f, m7222k3 + this.f6684G.m7222k() + 2.0f, this.f6685H);
            }
        }
    }

    /* renamed from: g */
    public void m805g(String str) {
        String[] split;
        GameEngine.PrintLog("Loading survival waves");
        this.f6691N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            C1050g c1050g = new C1050g(this);
            if (c1050g.m800a(str2)) {
                c1050g.f6702e = i + ((int) c1050g.f6701d);
                i = c1050g.f6702e;
                GameEngine.PrintLog("Adding wave " + i2 + " at " + c1050g.f6702e);
                this.f6692O.add(c1050g);
            }
        }
    }

    /* renamed from: d */
    public C1050g m812d() {
        if (this.f6669r < this.f6692O.size()) {
            return (C1050g) this.f6692O.get(this.f6669r);
        }
        return null;
    }

    /* renamed from: e */
    public void m810e() {
        this.f6695R = true;
        this.f6693P.m7212a((PointF) this.f6681D.get(CommonUtils.m2358a(0, this.f6681D.size() - 1, this.f6669r)));
    }

    /* renamed from: f */
    public void m808f() {
        this.f6696S.clear();
        m822a(this.f6696S, "scout", 0.7f);
        m823a(this.f6696S, UnitType.f1742i, 2.1f);
        m822a(this.f6696S, "mechGun", 1.0f);
        m822a(this.f6696S, "lightGunship", 2.8f);
        m823a(this.f6696S, UnitType.f1743j, 1.9f);
        m823a(this.f6696S, UnitType.f1745l, 0.8f);
        m823a(this.f6696S, UnitType.f1756w, 1.0f);
        m823a(this.f6696S, UnitType.f1757x, 0.8f);
        m823a(this.f6696S, UnitType.f1747n, 0.7f);
        m822a(this.f6696S, "plasmaTank", 0.6f);
        m822a(this.f6696S, "missileAirship", 0.4f);
        this.f6697T.clear();
        m823a(this.f6697T, UnitType.f1765F, 1.0f);
        m823a(this.f6697T, UnitType.f1774O, 0.5f);
    }

    /* renamed from: a */
    public void m822a(ArrayList arrayList, String str, float f) {
        m823a(arrayList, C0453l.m4703s(str), f);
    }

    /* renamed from: a */
    public void m823a(ArrayList arrayList, InterfaceC0303as interfaceC0303as, float f) {
        if (interfaceC0303as == null) {
            interfaceC0303as = UnitType.f1742i;
        }
        InterfaceC0303as m4738c = C0453l.m4738c(interfaceC0303as);
        if (m4738c != null) {
            interfaceC0303as = m4738c;
        }
        C1054k c1054k = new C1054k(this);
        c1054k.f6715a = interfaceC0303as;
        c1054k.f6716b = f;
        arrayList.add(c1054k);
    }

    /* renamed from: a */
    public void m826a(C1052i c1052i, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.f6696S.size();
        if (size == 0) {
            GameEngine.m1145b("error maxTypeNum: " + size);
            return;
        }
        C1054k c1054k = (C1054k) this.f6696S.get(i % size);
        int m2273e = (int) CommonUtils.m2273e((int) ((i + 3) * 0.5d * c1054k.f6716b * f), 0.8f);
        if (m2273e < 1) {
            m2273e = 1;
        }
        c1052i.m797b(c1054k.f6715a, m2273e);
    }

    /* renamed from: b */
    public C1052i m817b(boolean z) {
        C1052i c1052i = new C1052i(this);
        boolean z2 = false;
        if (this.f6672u > 50 && (this.f6672u + 1) % 100 == 0) {
            int size = this.f6697T.size();
            int i = this.f6672u / 100;
            if (size == 0) {
                GameEngine.m1145b("error maxTypeNum: " + size);
            } else {
                C1054k c1054k = (C1054k) this.f6697T.get(i % size);
                int i2 = (int) (i * c1054k.f6716b);
                if (i2 < 1) {
                    i2 = 1;
                }
                c1052i.m797b(c1054k.f6715a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.f6676y > 0) {
            i3 = this.f6676y;
        }
        m826a(c1052i, this.f6672u + i3, 1.0f);
        if (this.f6672u > 15 && !z2) {
            m826a(c1052i, ((int) ((this.f6672u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.f6672u++;
            this.f6673v++;
        }
        return c1052i;
    }

    /* renamed from: c */
    public C1052i m813c(boolean z) {
        C1052i c1052i = new C1052i(this);
        c1052i.f6709a = false;
        int i = this.f6673v;
        UnitType unitType = null;
        if (this.f6667p) {
            unitType = UnitType.f1753t;
        } else {
            if (this.f6672u == 0) {
                i++;
                unitType = UnitType.f1742i;
            }
            if (this.f6672u == 1) {
                unitType = UnitType.f1743j;
            }
            if (this.f6672u == 2) {
                unitType = UnitType.f1745l;
            }
            if (this.f6672u == 3) {
                i = this.f6674w;
                unitType = UnitType.f1756w;
            }
            if (this.f6672u == 4) {
                i = this.f6674w;
                unitType = UnitType.f1757x;
                if (this.f6674w % 2 == 0) {
                    unitType = UnitType.f1747n;
                }
            }
            if (this.f6672u == 5) {
                c1052i.f6709a = true;
                i = 1;
                unitType = UnitType.f1765F;
            }
            if (z) {
                this.f6672u++;
                boolean z2 = false;
                if (this.f6674w == 1) {
                    if (this.f6672u > 2) {
                        z2 = true;
                    }
                } else if (this.f6674w < 5) {
                    if (this.f6672u > 4) {
                        z2 = true;
                    }
                } else {
                    if (this.f6672u > 5) {
                        z2 = true;
                    }
                    if (this.f6672u > 4 && this.f6674w % 2 == 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f6672u = 0;
                    this.f6673v += 2;
                    this.f6674w++;
                }
            }
        }
        c1052i.m798a(unitType, i);
        return c1052i;
    }

    /* renamed from: c */
    public void m815c(float f) {
        C1052i m813c;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = gameEngine.f6096by;
        this.f6690M = CommonUtils.m2368a(this.f6690M, f);
        if (gameEngine.f6075aq && gameEngine.f6237bH) {
            C0172a c0172a = null;
            if (gameEngine.f6104bL.f797Q != null) {
                Iterator it = gameEngine.f6104bL.f797Q.f945c.iterator();
                while (it.hasNext()) {
                    C0172a c0172a2 = (C0172a) it.next();
                    if ("camera_pan".equalsIgnoreCase(c0172a2.f768d) && this.f6689L == Integer.parseInt(c0172a2.m6660a("index", "-1"))) {
                        c0172a = c0172a2;
                    }
                }
            }
            if (c0172a == null) {
                this.f6689L = 0;
            } else {
                float f2 = c0172a.f769e;
                float f3 = c0172a.f770f;
                if (f2 < gameEngine.f6150cH + 2.0f) {
                    f2 = gameEngine.f6150cH + 2.0f;
                }
                if (f3 < gameEngine.f6151cI + 2.0f) {
                    f3 = gameEngine.f6151cI + 2.0f;
                }
                if (f2 > (gameEngine.f6104bL.m6589i() - gameEngine.f6150cH) - 2.0f) {
                    f2 = (gameEngine.f6104bL.m6589i() - gameEngine.f6150cH) - 2.0f;
                }
                if (f3 > (gameEngine.f6104bL.m6588j() - gameEngine.f6151cI) - 2.0f) {
                    f3 = (gameEngine.f6104bL.m6588j() - gameEngine.f6151cI) - 2.0f;
                }
                float m2280d = CommonUtils.m2280d(gameEngine.f6140cx + gameEngine.f6150cH, gameEngine.f6141cy + gameEngine.f6151cI, f2, f3);
                float m2366a = CommonUtils.m2366a(gameEngine.f6140cx + gameEngine.f6150cH, gameEngine.f6141cy + gameEngine.f6151cI, f2, f3);
                if (this.f6690M == 0.0f && (m2366a < 225.0f || gameEngine.f6135cs)) {
                    this.f6689L++;
                    this.f6690M = 50.0f;
                }
                float f4 = 0.45f * f;
                gameEngine.f6140cx += CommonUtils.m2249i(m2280d) * f4;
                gameEngine.f6141cy += CommonUtils.sin(m2280d) * f4;
                gameEngine.m1207a(gameEngine.f6140cx, gameEngine.f6141cy);
                gameEngine.m1219P();
            }
        }
        if (this.f6662k) {
            if (!this.f6691N) {
                if (!this.f6664m) {
                    this.f6677z = CommonUtils.m2368a(this.f6677z, f);
                }
                if (this.f6677z == 0.0f && !this.f6664m) {
                    this.f6669r++;
                    this.f6678A = 180.0f;
                    PointF pointF = (PointF) this.f6681D.get(CommonUtils.m2358a(0, this.f6681D.size() - 1, this.f6669r));
                    if (!this.f6663l) {
                        this.f6670s = m817b(false).toString();
                        m813c = m817b(true);
                    } else {
                        this.f6670s = m813c(false).toString();
                        m813c = m813c(true);
                    }
                    this.f6677z = 1800.0f;
                    if (!this.f6663l) {
                        if (this.f6676y > 0) {
                            this.f6677z -= (this.f6676y * 3) * 60;
                        } else {
                            this.f6677z -= (this.f6676y * 9) * 60;
                        }
                    }
                    m813c.m799a(pointF.x, pointF.y);
                    this.f6671t = null;
                }
            } else if (!this.f6664m) {
                C1050g m812d = m812d();
                if (m812d != null) {
                    if (m812d.f6702e * 1000 < gameEngine.f6096by) {
                        m812d.m801a();
                        this.f6669r++;
                    }
                } else if (!gameEngine.f6261dp && !gameEngine.f6120cb.m2635h()) {
                    gameEngine.f6111bS.m2073F();
                }
            }
        }
        if (this.f6661j) {
            this.f6661j = false;
            if (this.f6659h != null) {
                gameEngine.m1191a("Briefing", this.f6659h);
            }
        }
        if (i > this.f6653b + 250) {
            this.f6653b = i;
            m829a(i);
        }
        if (i > this.f6654c + 1000) {
            this.f6654c = i;
            if (m804h()) {
                m804h();
                m804h();
            }
            boolean z = false;
            boolean z2 = false;
            if (gameEngine.f6093bs != null) {
                if (gameEngine.f6093bs.m6320j()) {
                    z = true;
                }
                if (gameEngine.f6093bs.m6374b()) {
                    z2 = true;
                }
            }
            if (!gameEngine.f6261dp && !gameEngine.f6264ds && !gameEngine.f6120cb.m2635h() && !z && !z2) {
                boolean z3 = true;
                boolean z4 = true;
                if (this.f6656e == EnumC1055l.none) {
                    z3 = false;
                } else if (this.f6656e == EnumC1055l.requiredObjectives) {
                    Iterator it2 = this.f6658g.iterator();
                    while (it2.hasNext()) {
                        if (!((C1056m) it2.next()).m795b()) {
                            z3 = false;
                        }
                    }
                } else if (gameEngine.f6093bs != null) {
                    Iterator it3 = Unit.f1589bD.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Unit unit = (Unit) it3.next();
                        if (gameEngine.f6093bs.m6354c(unit.team) && m825a(this.f6656e, unit)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (this.f6657f == EnumC1055l.none) {
                    z4 = false;
                } else if (this.f6657f == EnumC1055l.requiredObjectives) {
                    z4 = false;
                } else if (gameEngine.f6093bs != null) {
                    Iterator it4 = Unit.f1589bD.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Unit unit2 = (Unit) it4.next();
                        if (gameEngine.f6093bs.m6342d(unit2.team) && m825a(this.f6657f, unit2)) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !z3) {
                    gameEngine.f6111bS.m2072G();
                }
                if (z3) {
                    gameEngine.f6111bS.m2073F();
                    if (gameEngine.f6096by > 1500) {
                        gameEngine.f6109bQ.numberOfWins++;
                        gameEngine.f6109bQ.save();
                    }
                }
            }
            if (this.f6662k && !this.f6664m) {
                boolean z5 = true;
                Iterator it5 = Unit.f1589bD.iterator();
                while (it5.hasNext()) {
                    Unit unit3 = (Unit) it5.next();
                    if ((unit3 instanceof CommandCenter) || unit3.f1601bO) {
                        if (!unit3.isDead && !unit3.m5755u() && unit3.team == gameEngine.f6093bs) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    this.f6664m = true;
                    gameEngine.f6111bS.m2072G();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m825a(EnumC1055l enumC1055l, Unit unit) {
        if (!(unit instanceof AbstractC0623y) || unit.isDead || unit.m5828cS() || enumC1055l == EnumC1055l.none) {
            return false;
        }
        if (enumC1055l == EnumC1055l.allUnitsAndBuildings) {
            return true;
        }
        if (enumC1055l == EnumC1055l.allBuildings) {
            return unit.m5867bI();
        }
        if (enumC1055l == EnumC1055l.commandCenter) {
            return (unit instanceof CommandCenter) || unit.f1601bO;
        } else if (enumC1055l == EnumC1055l.mainBuildings) {
            return unit.m5867bI() && unit.mo4495bJ() && !(unit instanceof Turret) && !(unit instanceof Extractor);
        } else if (enumC1055l == EnumC1055l.noConstructionOrTech) {
            if (unit.mo4495bJ() || unit.mo3142ak()) {
                return true;
            }
            return false;
        } else if (enumC1055l == EnumC1055l.requiredObjectives) {
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public void m803h(String str) {
        GameEngine.PrintLog("Map Script: " + str);
    }

    /* renamed from: a */
    public void m827a(C1030a c1030a) {
        if (m806g()) {
            m803h("Activiated trigger:" + c1030a.f6591a + " (id:" + c1030a.f6592b + ")");
        }
    }

    /* renamed from: g */
    public boolean m806g() {
        return f6652a && GameEngine.getInstance().f6225bl;
    }

    /* renamed from: i */
    public static void m802i(String str) {
        C0831ad.m1648g("Map ScriptError: " + str);
    }

    /* renamed from: a */
    public void m829a(int i) {
        Iterator it = this.f6687J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6597j && c1030a.f6616q != -1 && i >= c1030a.f6598k + c1030a.f6616q) {
                c1030a.f6597j = false;
                c1030a.f6619u = false;
            }
            if (!c1030a.f6597j && !c1030a.f6619u && c1030a.m851d()) {
                c1030a.f6619u = true;
            }
            if ((c1030a.f6597j || c1030a.f6619u) && c1030a.f6612e.m836b()) {
                c1030a.f6597j = false;
                c1030a.f6619u = false;
                c1030a.f6600m = true;
            }
            if (c1030a.f6597j && c1030a.f6601p > 0 && i >= c1030a.f6598k + c1030a.f6601p) {
                c1030a.f6619u = true;
            }
            if (c1030a.f6619u) {
                c1030a.f6619u = false;
                try {
                    C1036d.m834a(this, c1030a);
                } catch (C0179f e) {
                    e.printStackTrace();
                    c1030a.m847g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: h */
    public boolean m804h() {
        boolean z;
        boolean z2 = false;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == Team.f1370i && (unit instanceof AbstractC0623y) && unit.isActive() && !unit.mo4206o()) {
                int i2 = 0;
                int size2 = Unit.f1589bD.size();
                while (true) {
                    if (i2 < size2) {
                        Unit unit2 = m523a[i2];
                        if (!gameEngine.m1154ax()) {
                            z = unit2.team == gameEngine.f6093bs;
                        } else {
                            z = !unit2.team.f1316v;
                            if (unit.m5833cN()) {
                                z = true;
                            }
                        }
                        if (unit2.team != null && unit2.team.f1305k < 0) {
                            z = false;
                        }
                        if (!z || unit2.team == unit.team || !(unit2 instanceof AbstractC0623y) || unit2.mo3293i() || !unit2.isActive() || CommonUtils.m2366a(unit2.f6951ek, unit2.f6952el, unit.f6951ek, unit.f6952el) >= 28900.0f) {
                            i2++;
                        } else {
                            unit.m5773e(unit2.team);
                            unit.f1646cH = 60.0f;
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
