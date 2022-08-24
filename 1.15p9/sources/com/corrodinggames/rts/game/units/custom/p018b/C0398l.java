package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/l.class */
public final class C0398l extends AbstractC0387a {

    /* renamed from: a */
    public static final C0398l f2443a = new C0398l();

    /* renamed from: a */
    public static void m5297a(C0453l c0453l, C1072ab c1072ab) {
        C1101m m669e = c1072ab.m669e("attachment_");
        if (m669e.size() > 0) {
            c0453l.m4768a(f2443a);
            short s = 0;
            Iterator it = m669e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0399m c0399m = new C0399m();
                m5306a(c0399m, c0453l, c1072ab, str, substring);
                c0399m.f2445b = substring;
                c0399m.f2444a = s;
                s = (short) (s + 1);
                c0453l.f3223az.add(c0399m);
            }
        }
    }

    /* renamed from: a */
    public static void m5306a(C0399m c0399m, C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        c0399m.f2446c = c1072ab.m658i(str, "x");
        c0399m.f2447d = c1072ab.m658i(str, "y");
        c0399m.f2448e = c1072ab.m698a(str, "height", Float.valueOf(c0399m.f2448e)).floatValue();
        c0399m.f2451i = c1072ab.m700a(str, "lockDir", Boolean.valueOf(c0399m.f2451i)).booleanValue();
        c0399m.f2452j = c1072ab.m700a(str, "redirectDamageToParent", Boolean.valueOf(c0399m.f2452j)).booleanValue();
        c0399m.f2453k = c1072ab.m700a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(c0399m.f2453k)).booleanValue();
        if (!c0399m.f2452j && c0399m.f2453k) {
            throw new C0412bm("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        c0399m.f2466l = c1072ab.m700a(str, "canBeAttackedAndDamaged", Boolean.valueOf(c0399m.f2466l)).booleanValue();
        c0399m.f2467m = c1072ab.m700a(str, "isUnselectable", Boolean.valueOf(c0399m.f2467m)).booleanValue();
        c0399m.f2468n = c1072ab.m700a(str, "isUnselectableAsTarget", Boolean.valueOf(c0399m.f2467m)).booleanValue();
        c0399m.f2469o = c1072ab.m700a(str, "isVisible", Boolean.valueOf(c0399m.f2469o)).booleanValue();
        c0399m.f2470p = c1072ab.m700a(str, "showMiniHp", Boolean.valueOf(c0399m.f2470p)).booleanValue();
        c0399m.f2471q = c1072ab.m700a(str, "hideHp", Boolean.valueOf(c0399m.f2471q)).booleanValue();
        c0399m.f2463N = c1072ab.m719a(c0453l, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(c0399m.f2463N)) {
            c0399m.f2463N = null;
        }
        Float m698a = c1072ab.m698a(str, "idleDir", (Float) null);
        Float m698a2 = c1072ab.m698a(str, "idleDirReversing", (Float) null);
        if (m698a != null) {
            c0399m.f2449f = m698a.floatValue();
            c0399m.f2465g = m698a.floatValue();
        }
        if (m698a2 != null) {
            c0399m.f2465g = m698a2.floatValue();
        } else {
            c0399m.f2465g = c0399m.f2449f;
        }
        c0399m.f2450h = c1072ab.m700a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        c0399m.f2472r = c1072ab.m700a(str, "rotateWithParent", Boolean.valueOf(c0399m.f2472r)).booleanValue();
        c0399m.f2473s = c1072ab.m700a(str, "lockLegMovement", Boolean.valueOf(c0399m.f2473s)).booleanValue();
        c0399m.f2474t = c1072ab.m700a(str, "freezeLegMovement", Boolean.valueOf(c0399m.f2474t)).booleanValue();
        c0399m.f2454u = c1072ab.m700a(str, "lockRotation", Boolean.valueOf(c0399m.f2454u)).booleanValue();
        if (c0399m.f2454u && c0399m.f2450h) {
            throw new C0412bm("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        c0399m.f2475v = c1072ab.m700a(str, "keepAliveWhenParentDies", Boolean.valueOf(c0399m.f2475v)).booleanValue();
        c0399m.f2455w = C0413bn.m5254b(c0453l, c1072ab, str, "onCreateSpawnUnitOf");
        if (c0399m.f2455w.m5255b()) {
            c0399m.f2455w = null;
        }
        c0399m.f2476x = c1072ab.m700a(str, "createIncompleteIfParentIs", Boolean.valueOf(c0399m.f2476x)).booleanValue();
        c0399m.f2456y = c1072ab.m700a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(c0399m.f2456y)).booleanValue();
        c0399m.f2457z = c1072ab.m700a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(c0399m.f2457z)).booleanValue();
        c0399m.f2478B = c1072ab.m700a(str, "setDrawLayerOnBottom", Boolean.valueOf(c0399m.f2478B)).booleanValue();
        if (c0399m.f2478B) {
            c0399m.f2477A = false;
        }
        c0399m.f2477A = c1072ab.m700a(str, "setDrawLayerOnTop", Boolean.valueOf(c0399m.f2477A)).booleanValue();
        if (c0399m.f2477A && c0399m.f2478B) {
            throw new C0412bm("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        c0399m.f2480D = c1072ab.m700a(str, "addTransportedUnits", Boolean.valueOf(c0399m.f2480D)).booleanValue();
        c0399m.f2458E = c1072ab.m700a(str, "unloadInCurrentPosition", Boolean.valueOf(c0399m.f2458E)).booleanValue();
        c0399m.f2481F = c1072ab.m700a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(c0399m.f2481F)).booleanValue();
        if (c0399m.f2481F) {
            c0399m.f2459G = 500.0f;
        } else {
            c0399m.f2459G = 0.0f;
        }
        c0399m.f2460H = c1072ab.m700a(str, "deattachIfWantingToMove", Boolean.valueOf(c0399m.f2460H)).booleanValue();
        c0399m.f2482I = c1072ab.m700a(str, "hidden", Boolean.valueOf(c0399m.f2482I)).booleanValue();
        c0399m.f2483J = c1072ab.m700a(str, "prioritizeParentsMainTarget", Boolean.valueOf(c0399m.f2483J)).booleanValue();
        c0399m.f2461K = c1072ab.m700a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(c0399m.f2461K)).booleanValue();
        c0399m.f2462L = c1072ab.m700a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(c0399m.f2462L)).booleanValue();
        c0399m.f2484M = c1072ab.m700a(str, "canAttack", Boolean.valueOf(c0399m.f2484M)).booleanValue();
        c0399m.f2464O = c1072ab.m700a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(c0399m.f2464O)).booleanValue();
        if (c0399m.f2480D) {
            c0453l.f2942aA = true;
        }
    }

    /* renamed from: a */
    public void mo5334a(C0451j c0451j, float f) {
        mo5310b(c0451j, f);
    }

    /* renamed from: b */
    public void mo5310b(C0451j c0451j, float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        C0453l c0453l = c0451j.f2861w;
        C1101m c1101m = c0453l.f3223az;
        if (c1101m.f6888a == 0) {
            return;
        }
        if (c0453l.f2942aA) {
            Object[] m559a = c1101m.m559a();
            for (int i = 0; i < c1101m.f6888a; i++) {
                C0399m c0399m = (C0399m) m559a[i];
                if (c0399m.f2480D && c0451j.f2865A.f6888a > 0 && m5303a(c0451j, c0399m) == null) {
                    Iterator it = c0451j.f2865A.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Unit unit = (Unit) it.next();
                            if ((unit instanceof AbstractC0623y) && unit.f1651cM == null && c0451j.m4981a((AbstractC0623y) unit, c0399m)) {
                                unit.f1650cL = null;
                                break;
                            }
                        }
                    }
                }
            }
        }
        C1101m c1101m2 = c0451j.f2866B;
        if (c1101m2 == null) {
            return;
        }
        float f3 = c0451j.direction - c0451j.f2867C;
        c0451j.f2867C = c0451j.direction;
        Object[] m559a2 = c1101m2.m559a();
        for (int i2 = c1101m2.f6888a - 1; i2 >= 0; i2--) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m559a2[i2];
            if (abstractC0623y != null) {
                if (abstractC0623y.isDead) {
                    abstractC0623y.m3081bx();
                    m559a2[i2] = null;
                } else {
                    if (c0451j.f1650cL != null) {
                        if (abstractC0623y.f1650cL == null) {
                            abstractC0623y.f1650cL = c0451j.f1650cL;
                            gameEngine.f6111bS.m1976l(abstractC0623y);
                        }
                    } else if (abstractC0623y.f1650cL != null && abstractC0623y.f1650cL != c0451j) {
                        abstractC0623y.f1650cL = null;
                    }
                    C0399m c0399m2 = (C0399m) c1101m.get(i2);
                    float m2249i = CommonUtils.m2249i(c0451j.direction);
                    float sin = CommonUtils.sin(c0451j.direction);
                    float f4 = (m2249i * c0399m2.f2447d) - (sin * c0399m2.f2446c);
                    float f5 = (sin * c0399m2.f2447d) + (m2249i * c0399m2.f2446c);
                    float f6 = f4 + c0451j.f6951ek;
                    float f7 = f5 + c0451j.f6952el;
                    float f8 = c0451j.height + c0399m2.f2448e;
                    if (C1117y.m479b(abstractC0623y.f1653cO, (int) c0399m2.f2459G)) {
                        abstractC0623y.f6951ek += (f6 - abstractC0623y.f6951ek) * 0.05f;
                        abstractC0623y.f6952el += (f7 - abstractC0623y.f6952el) * 0.05f;
                        abstractC0623y.height += (f8 - abstractC0623y.height) * 0.05f;
                    } else {
                        abstractC0623y.f6951ek = f6;
                        abstractC0623y.f6952el = f7;
                        abstractC0623y.height = f8;
                    }
                    if (abstractC0623y.f1623ck < 1.0f && c0399m2.f2476x) {
                        abstractC0623y.m5759r(c0451j.f1623ck);
                        abstractC0623y.f1624cl = c0451j.f1623ck;
                    }
                    if (c0399m2.f2477A) {
                        if (abstractC0623y.f6949ei <= c0451j.f6949ei) {
                            int i3 = 0;
                            if (abstractC0623y instanceof C0451j) {
                                i3 = ((C0451j) abstractC0623y).f2861w.f3240cD;
                            }
                            abstractC0623y.f6949ei = c0451j.f6949ei;
                            abstractC0623y.f6950ej = c0451j.f6950ej + 1 + i3;
                        }
                    } else if (c0399m2.f2478B && abstractC0623y.f6949ei >= c0451j.f6949ei) {
                        abstractC0623y.f6949ei = c0451j.f6949ei;
                        abstractC0623y.f6950ej = c0451j.f6950ej - 1;
                    }
                    if (c0451j.f1619cg) {
                        f2 = c0451j.direction + c0399m2.f2465g;
                    } else {
                        f2 = c0451j.direction + c0399m2.f2449f;
                    }
                    if (!abstractC0623y.m5867bI()) {
                        if (c0399m2.f2454u) {
                            abstractC0623y.mo3057h(f2);
                        } else {
                            if (f3 != 0.0f && c0399m2.f2472r) {
                                abstractC0623y.rotateDeg(f3);
                            }
                            if (c0399m2.f2450h && abstractC0623y.f3891Q == null) {
                                abstractC0623y.m3078c(f, f2);
                            }
                        }
                    }
                    if (c0399m2.f2461K) {
                        abstractC0623y.f3891Q = c0451j.f3891Q;
                        abstractC0623y.f3892R = 5.0f;
                    }
                    if (c0399m2.f2462L && abstractC0623y.f3891Q == null) {
                        abstractC0623y.f3891Q = c0451j.f3891Q;
                    }
                    if (c0399m2.f2483J && c0451j.f3891Q != null && abstractC0623y.f3891Q != c0451j.f3891Q) {
                        boolean z = false;
                        if (c0399m2.f2462L) {
                            z = true;
                        }
                        if (abstractC0623y.m3198a(c0451j.f3891Q, z)) {
                            abstractC0623y.f3891Q = c0451j.f3891Q;
                            abstractC0623y.f3892R = 5.0f;
                        }
                    }
                    if (abstractC0623y instanceof C0451j) {
                        C0451j c0451j2 = (C0451j) abstractC0623y;
                        if (c0399m2.f2473s) {
                            c0451j2.f2879dM = c0451j2.f6951ek;
                            c0451j2.f2879dM = c0451j2.f6952el;
                            c0451j2.f2881dO = c0451j2.height;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5298a(C0451j c0451j, boolean z) {
        C1101m c1101m = c0451j.f2866B;
        if (c1101m == null) {
            return;
        }
        C1101m c1101m2 = c0451j.f2861w.f3223az;
        Object[] m559a = c1101m.m559a();
        for (int i = c1101m.f6888a - 1; i >= 0; i--) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m559a[i];
            if (abstractC0623y != null) {
                C0399m c0399m = (C0399m) c1101m2.get(i);
                abstractC0623y.m3081bx();
                m559a[i] = null;
                if (z && !c0399m.f2475v) {
                    abstractC0623y.m5812ch();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5332b(C0451j c0451j) {
        m5298a(c0451j, true);
    }

    /* renamed from: c */
    public void mo5331c(C0451j c0451j) {
        m5298a(c0451j, true);
    }

    /* renamed from: a */
    public void mo5335a(C0451j c0451j) {
        boolean z = false;
        C1101m c1101m = c0451j.f2861w.f3223az;
        Object[] m559a = c1101m.m559a();
        for (int i = c1101m.f6888a - 1; i >= 0; i--) {
            C0399m c0399m = (C0399m) m559a[i];
            if (c0399m.f2455w != null) {
                AbstractC0623y m5303a = m5303a(c0451j, c0399m);
                if (m5303a != null) {
                    if (!c0399m.f2456y) {
                        m5303a.m5812ch();
                    }
                }
                C1101m c1101m2 = new C1101m();
                c0399m.f2455w.m5257a(c1101m2, c0451j.team, (Unit) c0451j, true);
                if (c1101m2.size() > 1) {
                    GameEngine.m1145b("onCreateSpawnUnitOf: created an extra " + (c1101m2.size() - 1) + " units");
                    for (int i2 = 1; i2 < c1101m2.size(); i2++) {
                        ((Unit) c1101m2.get(i2)).m5812ch();
                    }
                }
                if (c1101m2.size() == 0) {
                    GameEngine.m1145b("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    Unit unit = (Unit) c1101m2.get(0);
                    if (!(unit instanceof AbstractC0623y)) {
                        GameEngine.m1145b("onCreateSpawnUnitOf: Warning " + unit.getUnitType().mo5706i() + " not an orderable unit type, cannot attach");
                        unit.m5812ch();
                    } else {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                        if (c0451j.m4981a(abstractC0623y, c0399m)) {
                            abstractC0623y.f1653cO = -9999;
                            if (c0451j.f1623ck < 1.0f && c0399m.f2476x) {
                                abstractC0623y.m5759r(c0451j.f1623ck);
                                abstractC0623y.f1624cl = c0451j.f1623ck;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo5310b(c0451j, 0.0f);
        }
    }

    /* renamed from: a */
    public void mo5333a(C0451j c0451j, C0453l c0453l) {
        C1101m c1101m = c0451j.f2866B;
        C1101m c1101m2 = c0451j.f2861w.f3223az;
        if (c1101m2.size() == 0) {
            c0451j.f2866B = null;
        } else if (c1101m != null) {
            for (int size = c1101m.size() - 1; size >= 0; size--) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) c1101m.get(size);
                if (abstractC0623y != null && size >= c1101m2.size()) {
                    abstractC0623y.m5812ch();
                    c1101m.remove(size);
                }
            }
            for (int size2 = c1101m.size() - 1; size2 >= 0; size2--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) c1101m.get(size2);
                if (abstractC0623y2 != null) {
                    abstractC0623y2.f1652cN = (C0399m) c1101m2.get(size2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0399m m5299a(C0451j c0451j, short s) {
        C1101m c1101m = c0451j.f2861w.f3223az;
        if (c1101m.f6888a <= s) {
            return null;
        }
        return (C0399m) c1101m.get(s);
    }

    /* renamed from: a */
    public static AbstractC0623y m5303a(C0451j c0451j, C0399m c0399m) {
        short s;
        C1101m c1101m = c0451j.f2866B;
        if (c1101m == null || c1101m.f6888a <= (s = c0399m.f2444a)) {
            return null;
        }
        return (AbstractC0623y) c1101m.get(s);
    }

    /* renamed from: a */
    public static boolean m5302a(C0451j c0451j, C0399m c0399m, AbstractC0623y abstractC0623y) {
        C0453l c0453l = c0451j.f2861w;
        short s = c0399m.f2444a;
        if (c0453l.f3223az.f6888a <= s && abstractC0623y != null) {
            GameEngine.m1145b("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + c0453l.f3223az.f6888a);
            return false;
        }
        if (c0451j.f2866B == null) {
            c0451j.f2866B = new C1101m();
        }
        C1101m c1101m = c0451j.f2866B;
        if (c1101m.size() == 0) {
            c0451j.f2867C = c0451j.direction;
        }
        if (abstractC0623y == null && s >= c1101m.size()) {
            return true;
        }
        while (c1101m.size() <= s) {
            c1101m.add(null);
        }
        c1101m.set(s, abstractC0623y);
        return true;
    }

    /* renamed from: a */
    public static void m5300a(C0451j c0451j, C1101m c1101m, boolean z) {
        C0399m m5778dl;
        boolean read;
        C1101m c1101m2 = c0451j.f2866B;
        if (c1101m2 != null) {
            Iterator it = c1101m2.iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit != null && (unit instanceof AbstractC0623y) && (m5778dl = unit.m5778dl()) != null && m5778dl.f2463N != null) {
                    Iterator it2 = unit.mo3520N().iterator();
                    while (it2.hasNext()) {
                        Action action = (Action) it2.next();
                        if (z) {
                            read = C0785ad.m2111a(m5778dl.f2463N, c0451j);
                        } else {
                            read = m5778dl.f2463N.read(c0451j);
                        }
                        if (read) {
                            c1101m.add(new C0212g(action, (AbstractC0623y) unit, action.m6095N()));
                        }
                    }
                }
            }
        }
    }
}
