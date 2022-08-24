package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bn.class */
public class C0413bn {

    /* renamed from: a */
    C1101m f2633a;

    /* renamed from: a */
    public static C0413bn m5256a(String str, String str2, String str3) {
        return m5253b(null, str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0413bn m5260a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m5259a(c0453l, c1072ab.m681b(str, str2, (String) null), str, str2, false);
    }

    /* renamed from: b */
    public static C0413bn m5254b(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m5259a(c0453l, c1072ab.m681b(str, str2, (String) null), str, str2, true);
    }

    /* renamed from: a */
    public static C0413bn m5259a(C0453l c0453l, String str, String str2, String str3, boolean z) {
        if (c0453l == null) {
            throw new RuntimeException("meta==null");
        }
        return m5253b(c0453l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0413bn m5253b(C0453l c0453l, String str, String str2, String str3, boolean z) {
        int m5263a;
        C0413bn c0413bn = new C0413bn();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0413bn;
        }
        Iterator it = CommonUtils.m2298b(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2260f = CommonUtils.m2260f(trim, "(");
                    if (m2260f == null) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = m2260f[0];
                    str4 = m2260f[1].trim();
                }
                String[] split = trim.split("\\*");
                String str5 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0463u c0463u = new C0463u();
                c0463u.f3343a = str3;
                c0463u.f3344b = str2;
                c0463u.f3345c = str5;
                if (c0453l != null) {
                    c0453l.f3201p.add(c0463u);
                } else {
                    c0463u.mo4682a();
                }
                C0414bo c0414bo = new C0414bo(c0463u);
                if (c0413bn.f2633a == null) {
                    c0413bn.f2633a = new C1101m();
                }
                c0414bo.f2648d = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    Iterator it2 = CommonUtils.m2326a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2260f2 = CommonUtils.m2260f(str6, "=");
                            if (m2260f2 == null) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = m2260f2[0].trim();
                            String trim3 = m2260f2[1].trim();
                            if (trim2.equalsIgnoreCase("neutralTeam")) {
                                c0414bo.f2637e = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                c0414bo.f2639g = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("aggressiveTeam")) {
                                c0414bo.f2638f = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0414bo.f2649h = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0414bo.f2650i = C1072ab.m657i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("techLevel")) {
                                c0414bo.f2652m = C1072ab.m657i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                c0414bo.f2651j = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                c0414bo.f2640k = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("falling")) {
                                c0414bo.f2641l = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                c0414bo.f2647w = (short) C1072ab.m657i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwaysStartDirAtZero")) {
                                c0414bo.f2642n = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                c0414bo.f2642n = C1072ab.m661g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX")) {
                                c0414bo.f2653o = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY")) {
                                c0414bo.f2654p = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m659h = C1072ab.m659h(str2, str3, trim3);
                                c0414bo.f2643s = m659h;
                                c0414bo.f2644t = m659h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0414bo.f2643s = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0414bo.f2644t = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0414bo.f2655q = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0414bo.f2645u = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0414bo.f2656r = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("addResources")) {
                                if (c0453l == null) {
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources not supported from here");
                                }
                                try {
                                    c0414bo.f2646v = C0424b.m5200b(c0453l, trim3);
                                } catch (C0412bm e) {
                                    e.printStackTrace();
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                }
                            } else if (trim2.equalsIgnoreCase("spawnSource")) {
                                c0414bo.f2635b = C1072ab.m711a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else if (trim2.equalsIgnoreCase("copyWaypointsFrom")) {
                                c0414bo.f2636c = C1072ab.m711a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else {
                                throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                    if (c0414bo.f2639g && c0414bo.f2637e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2638f && c0414bo.f2637e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2638f && c0414bo.f2639g) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and setToTeamOfLastAttacker at same time in " + str);
                    }
                }
                c0413bn.f2633a.add(c0414bo);
            }
        }
        if (z && (m5263a = c0413bn.m5263a()) > 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " Too many units: " + m5263a + ", only single unit is allowed here");
        }
        return c0413bn;
    }

    /* renamed from: a */
    public int m5263a() {
        if (this.f2633a == null || this.f2633a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2633a.iterator();
        while (it.hasNext()) {
            i += ((C0414bo) it.next()).f2648d;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m5255b() {
        if (this.f2633a == null || this.f2633a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m5257a(C1101m c1101m, Team team, Unit unit, boolean z) {
        m5261a(0.0f, 0.0f, 0.0f, 0.0f, team, false, unit, c1101m, z);
    }

    /* renamed from: a */
    public void m5262a(float f, float f2, float f3, float f4, Team team, boolean z, Unit unit) {
        m5261a(f, f2, f3, f4, team, z, unit, null, false);
    }

    /* renamed from: a */
    public void m5261a(float f, float f2, float f3, float f4, Team team, boolean z, Unit unit, C1101m c1101m, boolean z2) {
        if (this.f2633a == null || this.f2633a.size() == 0) {
            return;
        }
        boolean z3 = false;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        int i2 = 0;
        Iterator it = this.f2633a.iterator();
        while (it.hasNext()) {
            C0414bo c0414bo = (C0414bo) it.next();
            Team team2 = team;
            Unit unit2 = unit;
            float f5 = f;
            float f6 = f2;
            float f7 = f3;
            float f8 = f4;
            if (c0414bo.f2635b != null) {
                if (!(unit2 instanceof AbstractC0623y)) {
                    GameEngine.m1145b("spawnUnitsAt: sourceUnit!=OrderableUnit is:" + Unit.m5908A(unit2));
                } else {
                    Unit readUnit = c0414bo.f2635b.readUnit((AbstractC0623y) unit);
                    if (readUnit == null) {
                        GameEngine.m1145b("spawnUnitsAt: spawnSource==null");
                    } else {
                        team2 = readUnit.team;
                        unit2 = readUnit;
                        f5 = readUnit.f6951ek;
                        f6 = readUnit.f6952el;
                        f7 = readUnit.height;
                        f8 = readUnit.direction;
                        if (team2 == null) {
                            GameEngine.m1145b("spawnUnitsAt: newSpawnSource.team==null");
                        }
                    }
                }
            }
            if (!z2) {
                if (team2.m6307u() > team2.m6306v() + 300) {
                    z3 = true;
                }
            } else if (team2.m6375a(true, false) > team2.m6306v() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = VariableScope.nullOrMissingString;
                if (unit2 != null) {
                    str = str + "source:" + unit2.m5795cz();
                }
                GameEngine.m1145b("spawnUnitsAt: Skipping, too many units already on team:" + team2.f1305k + " count:" + team2.m6307u() + " " + str);
                if (GameEngine.getInstance().f6225bl) {
                    team2.m6401T();
                }
            } else if (team2.m6309s() > team2.m6306v() + 25000) {
                String str2 = VariableScope.nullOrMissingString;
                if (unit2 != null) {
                    str2 = str2 + "source:" + unit2.m5795cz();
                }
                GameEngine.m1145b("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + team2.f1305k + " total count:" + team2.m6309s() + " " + str2);
                if (GameEngine.getInstance().f6225bl) {
                    team2.m6401T();
                }
            } else {
                InterfaceC0303as mo7518c = c0414bo.f2634a.mo7518c();
                if (mo7518c != null) {
                    for (int i3 = 0; i3 < c0414bo.f2648d; i3++) {
                        i2++;
                        Team team3 = team2;
                        if (c0414bo.f2649h >= 1.0f || CommonUtils.m2347a(unit2, 0.0f, 1.0f, i2) <= c0414bo.f2649h) {
                            if (c0414bo.f2639g) {
                                if (unit2 != null && unit2.f1578bs != null) {
                                    team3 = unit2.f1578bs.team;
                                    if (team3 == null) {
                                        throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                    }
                                }
                            }
                            if (i >= c0414bo.f2650i) {
                                continue;
                            } else {
                                Unit mo5717a = mo7518c.mo5717a();
                                if (c0414bo.f2637e) {
                                    team3 = Team.f1370i;
                                }
                                if (c0414bo.f2638f) {
                                    team3 = Team.f1369h;
                                }
                                if (team3 == null) {
                                    throw new RuntimeException("Team==null");
                                }
                                mo5717a.m5766f(team3);
                                mo5717a.m5907B(unit2);
                                mo5717a.f6951ek = f5;
                                mo5717a.f6952el = f6;
                                mo5717a.height = f7;
                                if (!mo5717a.m5867bI() && !c0414bo.f2642n) {
                                    mo5717a.direction = f8;
                                }
                                mo5717a.height += c0414bo.f2655q;
                                if (c0414bo.f2652m != -1 && (mo5717a instanceof AbstractC0623y)) {
                                    ((AbstractC0623y) mo5717a).mo4213a(c0414bo.f2652m);
                                }
                                float f9 = c0414bo.f2656r;
                                if (c0414bo.f2645u != 0.0f) {
                                    f9 += CommonUtils.m2347a(unit2, -c0414bo.f2645u, c0414bo.f2645u, (i2 * 4) + 3);
                                }
                                if (f9 != 0.0f) {
                                    if (mo5717a instanceof AbstractC0623y) {
                                        ((AbstractC0623y) mo5717a).rotateDeg(f9);
                                    } else {
                                        mo5717a.direction += f9;
                                    }
                                }
                                mo5717a.f6951ek += i3;
                                if (c0414bo.f2643s != 0.0f) {
                                    mo5717a.f6951ek += CommonUtils.m2347a(unit2, -c0414bo.f2643s, c0414bo.f2643s, (i2 * 2) + 1);
                                }
                                if (c0414bo.f2644t != 0.0f) {
                                    mo5717a.f6952el += CommonUtils.m2347a(unit2, -c0414bo.f2644t, c0414bo.f2644t, (i2 * 3) + 2);
                                }
                                if (c0414bo.f2651j) {
                                    gameEngine.f6104bL.m6617b(mo5717a.f6951ek, mo5717a.f6952el);
                                    mo5717a.f6951ek = gameEngine.f6104bL.f800T;
                                    mo5717a.f6952el = gameEngine.f6104bL.f801U;
                                    mo5717a.f6951ek += mo5717a.m5823cX();
                                    mo5717a.f6952el += mo5717a.m5822cY();
                                }
                                mo5717a.f6951ek += c0414bo.f2653o;
                                mo5717a.f6952el += c0414bo.f2654p;
                                i++;
                                if (c0414bo.f2640k && (mo5717a instanceof AbstractC0623y) && !((AbstractC0623y) mo5717a).m3075c((Team) null)) {
                                    mo5717a.m5812ch();
                                } else {
                                    if (c0414bo.f2641l && (mo5717a instanceof AbstractC0623y)) {
                                        mo5717a.m5789da();
                                    }
                                    if (c0414bo.f2646v != null) {
                                        c0414bo.f2646v.m5185h(mo5717a);
                                    }
                                    if (c0414bo.f2647w > 0 && unit2 != null && (unit2 instanceof C0451j)) {
                                        C0451j c0451j = (C0451j) unit2;
                                        if (c0451j.f2865A != null) {
                                            for (int i4 = c0414bo.f2647w; i4 > 0; i4--) {
                                                int i5 = -1;
                                                int size = c0451j.f2865A.size() - 1;
                                                while (true) {
                                                    if (size >= 0) {
                                                        if (mo5717a.m5848c((Unit) c0451j.f2865A.get(size), true)) {
                                                            i5 = size;
                                                            break;
                                                        } else {
                                                            size--;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (i5 == -1) {
                                                    break;
                                                }
                                                Unit unit3 = (Unit) c0451j.f2865A.remove(i5);
                                                C1117y.m489a(unit3, c0451j);
                                                c0451j.m5036D(unit3);
                                                unit3.f6951ek = mo5717a.f6951ek;
                                                unit3.f6952el = mo5717a.f6952el;
                                                unit3.direction = mo5717a.direction;
                                                if (unit3 instanceof AbstractC0623y) {
                                                    ((AbstractC0623y) unit3).m3127az();
                                                }
                                                if (!mo5717a.m5772e(unit3, true)) {
                                                    GameEngine.m1145b("transportedUnitsToTransfer failed for: " + unit3.m5795cz() + " to: " + mo5717a.m5795cz());
                                                    unit3.m5812ch();
                                                }
                                            }
                                        }
                                    }
                                    Team.m6353c(mo5717a);
                                    if (mo5717a.m5867bI() && (mo5717a instanceof AbstractC0623y)) {
                                        gameEngine.f6113bU.m1312a((AbstractC0623y) mo5717a);
                                    }
                                    if (z && !mo5717a.m5755u()) {
                                        GameEngine.getInstance().f6111bS.m1978k(mo5717a);
                                    }
                                    if (c0414bo.f2636c != null) {
                                        if (!(mo5717a instanceof AbstractC0623y)) {
                                            GameEngine.m1145b("copyWaypointsFrom: spawnedUnit!=OrderableUnit is:" + Unit.m5908A(unit2));
                                        } else {
                                            Unit readUnit2 = c0414bo.f2636c.readUnit((AbstractC0623y) unit);
                                            if (readUnit2 != null) {
                                                if (!(readUnit2 instanceof AbstractC0623y)) {
                                                    GameEngine.m1145b("copyWaypointsFrom: copyWaypointsFrom!=OrderableUnit is:" + Unit.m5908A(unit2));
                                                } else {
                                                    AbstractC0623y.m3187a((AbstractC0623y) readUnit2, (AbstractC0623y) mo5717a);
                                                }
                                            }
                                        }
                                    }
                                    if (c1101m != null) {
                                        c1101m.add(mo5717a);
                                    }
                                }
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C0413bn m5258a(C0876k c0876k, boolean z) {
        int m1454f = c0876k.m1454f();
        if (z && m1454f == 0) {
            return null;
        }
        C0413bn c0413bn = new C0413bn();
        for (int i = 0; i < m1454f; i++) {
            C0414bo c0414bo = new C0414bo(null);
            InterfaceC0303as m1443q = c0876k.m1443q();
            if (m1443q != null) {
                if (c0413bn.f2633a == null) {
                    c0413bn.f2633a = new C1101m();
                }
                c0414bo.f2634a = C0453l.m4770a(m1443q);
            }
            if (c0876k.m1463b() >= 75 && c0876k.m1455e()) {
                c0414bo.f2648d = c0876k.m1454f();
                c0414bo.f2637e = c0876k.m1455e();
                c0414bo.f2639g = c0876k.m1455e();
                if (c0876k.m1463b() >= 76) {
                    c0414bo.f2649h = c0876k.m1453g();
                }
            }
            if (m1443q != null) {
                c0413bn.f2633a.add(c0414bo);
            }
        }
        return c0413bn;
    }
}
