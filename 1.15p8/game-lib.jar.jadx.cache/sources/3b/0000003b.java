package com.corrodinggames.rts.game.units.custom.p017b;

import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0396bm;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0206g;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.gui.C0704ad;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/h.class */
public final class C0382h extends AbstractC0375a {

    /* renamed from: a */
    public static final C0382h f2288a = new C0382h();

    /* renamed from: a */
    public static void m3467a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig) {
        ObjectVector m618e = unitConfig.m618e("attachment_");
        if (m618e.size() > 0) {
            customUnitMetadata.m3128a(f2288a);
            short s = 0;
            Iterator it = m618e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0383i c0383i = new C0383i();
                m3476a(c0383i, customUnitMetadata, unitConfig, str, substring);
                c0383i.f2297b = substring;
                c0383i.f2296a = s;
                s = (short) (s + 1);
                customUnitMetadata.f3046au.add(c0383i);
            }
        }
    }

    /* renamed from: a */
    public static void m3476a(C0383i c0383i, CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2) {
        c0383i.f2298c = unitConfig.m607i(str, "x");
        c0383i.f2299d = unitConfig.m607i(str, "y");
        c0383i.f2300e = unitConfig.getStaticFloatValue(str, "height", Float.valueOf(c0383i.f2300e)).floatValue();
        c0383i.f2303i = unitConfig.getStaticBooleanValue(str, "lockDir", Boolean.valueOf(c0383i.f2303i)).booleanValue();
        c0383i.f2304j = unitConfig.getStaticBooleanValue(str, "redirectDamageToParent", Boolean.valueOf(c0383i.f2304j)).booleanValue();
        c0383i.f2305k = unitConfig.getStaticBooleanValue(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(c0383i.f2305k)).booleanValue();
        if (!c0383i.f2304j && c0383i.f2305k) {
            throw new C0395bl("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        c0383i.f2311l = unitConfig.getStaticBooleanValue(str, "canBeAttackedAndDamaged", Boolean.valueOf(c0383i.f2311l)).booleanValue();
        c0383i.f2312m = unitConfig.getStaticBooleanValue(str, "isUnselectable", Boolean.valueOf(c0383i.f2312m)).booleanValue();
        c0383i.f2313n = unitConfig.getStaticBooleanValue(str, "isUnselectableAsTarget", Boolean.valueOf(c0383i.f2312m)).booleanValue();
        c0383i.f2314o = unitConfig.getStaticBooleanValue(str, "isVisible", Boolean.valueOf(c0383i.f2314o)).booleanValue();
        c0383i.f2315p = unitConfig.getStaticBooleanValue(str, "showMiniHp", Boolean.valueOf(c0383i.f2315p)).booleanValue();
        c0383i.f2316q = unitConfig.getStaticBooleanValue(str, "hideHp", Boolean.valueOf(c0383i.f2316q)).booleanValue();
        c0383i.f2294N = unitConfig.getLogicBooleanValue(customUnitMetadata, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(c0383i.f2294N)) {
            c0383i.f2294N = null;
        }
        Float staticFloatValue = unitConfig.getStaticFloatValue(str, "idleDir", (Float) null);
        Float staticFloatValue2 = unitConfig.getStaticFloatValue(str, "idleDirReversing", (Float) null);
        if (staticFloatValue != null) {
            c0383i.f2301f = staticFloatValue.floatValue();
            c0383i.f2310g = staticFloatValue.floatValue();
        }
        if (staticFloatValue2 != null) {
            c0383i.f2310g = staticFloatValue2.floatValue();
        } else {
            c0383i.f2310g = c0383i.f2301f;
        }
        c0383i.f2302h = unitConfig.getStaticBooleanValue(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        c0383i.f2317r = unitConfig.getStaticBooleanValue(str, "rotateWithParent", Boolean.valueOf(c0383i.f2317r)).booleanValue();
        c0383i.f2318s = unitConfig.getStaticBooleanValue(str, "lockLegMovement", Boolean.valueOf(c0383i.f2318s)).booleanValue();
        c0383i.f2319t = unitConfig.getStaticBooleanValue(str, "freezeLegMovement", Boolean.valueOf(c0383i.f2319t)).booleanValue();
        c0383i.f2306u = unitConfig.getStaticBooleanValue(str, "lockRotation", Boolean.valueOf(c0383i.f2306u)).booleanValue();
        if (c0383i.f2306u && c0383i.f2302h) {
            throw new C0395bl("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        c0383i.f2320v = unitConfig.getStaticBooleanValue(str, "keepAliveWhenParentDies", Boolean.valueOf(c0383i.f2320v)).booleanValue();
        c0383i.f2307w = C0396bm.m3425b(customUnitMetadata, unitConfig, str, "onCreateSpawnUnitOf");
        if (c0383i.f2307w.m3426b()) {
            c0383i.f2307w = null;
        }
        c0383i.f2321x = unitConfig.getStaticBooleanValue(str, "createIncompleteIfParentIs", Boolean.valueOf(c0383i.f2321x)).booleanValue();
        c0383i.f2308y = unitConfig.getStaticBooleanValue(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(c0383i.f2308y)).booleanValue();
        c0383i.f2309z = unitConfig.getStaticBooleanValue(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(c0383i.f2309z)).booleanValue();
        c0383i.f2323B = unitConfig.getStaticBooleanValue(str, "setDrawLayerOnBottom", Boolean.valueOf(c0383i.f2323B)).booleanValue();
        if (c0383i.f2323B) {
            c0383i.f2322A = false;
        }
        c0383i.f2322A = unitConfig.getStaticBooleanValue(str, "setDrawLayerOnTop", Boolean.valueOf(c0383i.f2322A)).booleanValue();
        if (c0383i.f2322A && c0383i.f2323B) {
            throw new C0395bl("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        c0383i.f2325D = unitConfig.getStaticBooleanValue(str, "addTransportedUnits", Boolean.valueOf(c0383i.f2325D)).booleanValue();
        c0383i.f2289E = unitConfig.getStaticBooleanValue(str, "unloadInCurrentPosition", Boolean.valueOf(c0383i.f2289E)).booleanValue();
        c0383i.f2326F = unitConfig.getStaticBooleanValue(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(c0383i.f2326F)).booleanValue();
        if (c0383i.f2326F) {
            c0383i.f2290G = 500.0f;
        } else {
            c0383i.f2290G = 0.0f;
        }
        c0383i.f2291H = unitConfig.getStaticBooleanValue(str, "deattachIfWantingToMove", Boolean.valueOf(c0383i.f2291H)).booleanValue();
        c0383i.f2327I = unitConfig.getStaticBooleanValue(str, "hidden", Boolean.valueOf(c0383i.f2327I)).booleanValue();
        c0383i.f2328J = unitConfig.getStaticBooleanValue(str, "prioritizeParentsMainTarget", Boolean.valueOf(c0383i.f2328J)).booleanValue();
        c0383i.f2292K = unitConfig.getStaticBooleanValue(str, "onlyAttackParentsMainTarget", Boolean.valueOf(c0383i.f2292K)).booleanValue();
        c0383i.f2293L = unitConfig.getStaticBooleanValue(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(c0383i.f2293L)).booleanValue();
        c0383i.f2329M = unitConfig.getStaticBooleanValue(str, "canAttack", Boolean.valueOf(c0383i.f2329M)).booleanValue();
        c0383i.f2295O = unitConfig.getStaticBooleanValue(str, "keepWaypointsNeedingMovement", Boolean.valueOf(c0383i.f2295O)).booleanValue();
        if (c0383i.f2325D) {
            customUnitMetadata.f2781av = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: a */
    public void mo3474a(C0433j c0433j, float f) {
        mo3465b(c0433j, f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: b */
    public void mo3465b(C0433j c0433j, float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        CustomUnitMetadata customUnitMetadata = c0433j.customUnitMetadataA;
        ObjectVector objectVector = customUnitMetadata.f3046au;
        if (objectVector.size == 0) {
            return;
        }
        if (customUnitMetadata.f2781av) {
            Object[] items = objectVector.getItems();
            for (int i = 0; i < objectVector.size; i++) {
                C0383i c0383i = (C0383i) items[i];
                if (c0383i.f2325D && c0433j.f2718A.size > 0 && m3473a(c0433j, c0383i) == null) {
                    Iterator it = c0433j.f2718A.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Unit unit = (Unit) it.next();
                            if ((unit instanceof OrderableUnit) && unit.f1630cF == null && c0433j.mo2607a((OrderableUnit) unit, c0383i)) {
                                unit.transportedBy = null;
                                break;
                            }
                        }
                    }
                }
            }
        }
        ObjectVector objectVector2 = c0433j.f2719B;
        if (objectVector2 == null) {
            return;
        }
        float f3 = c0433j.direction - c0433j.f2680C;
        c0433j.f2680C = c0433j.direction;
        Object[] items2 = objectVector2.getItems();
        for (int i2 = objectVector2.size - 1; i2 >= 0; i2--) {
            OrderableUnit orderableUnit = (OrderableUnit) items2[i2];
            if (orderableUnit != null) {
                if (orderableUnit.dead) {
                    orderableUnit.m2500bw();
                    items2[i2] = null;
                } else {
                    if (c0433j.transportedBy != null) {
                        if (orderableUnit.transportedBy == null) {
                            orderableUnit.transportedBy = c0433j.transportedBy;
                            gameEngine.interfaceEngine.unselectUnit(orderableUnit);
                        }
                    } else if (orderableUnit.transportedBy != null && orderableUnit.transportedBy != c0433j) {
                        orderableUnit.transportedBy = null;
                    }
                    C0383i c0383i2 = (C0383i) objectVector.get(i2);
                    float cos = CommonUtils.cos(c0433j.direction);
                    float sin = CommonUtils.sin(c0433j.direction);
                    float f4 = (cos * c0383i2.f2299d) - (sin * c0383i2.f2298c);
                    float f5 = (sin * c0383i2.f2299d) + (cos * c0383i2.f2298c);
                    float f6 = f4 + c0433j.x;
                    float f7 = f5 + c0433j.y;
                    float f8 = c0433j.height + c0383i2.f2300e;
                    if (C0955y.m441b(orderableUnit.f1632cH, (int) c0383i2.f2290G)) {
                        orderableUnit.x += (f6 - orderableUnit.x) * 0.05f;
                        orderableUnit.y += (f7 - orderableUnit.y) * 0.05f;
                        orderableUnit.height += (f8 - orderableUnit.height) * 0.05f;
                    } else {
                        orderableUnit.x = f6;
                        orderableUnit.y = f7;
                        orderableUnit.height = f8;
                    }
                    if (orderableUnit.built < 1.0f && c0383i2.f2321x) {
                        orderableUnit.m3728r(c0433j.built);
                        orderableUnit.f1619ce = c0433j.built;
                    }
                    if (c0383i2.f2322A) {
                        if (orderableUnit.f6366ed <= c0433j.f6366ed) {
                            int i3 = 0;
                            if (orderableUnit instanceof C0433j) {
                                i3 = ((C0433j) orderableUnit).customUnitMetadataA.f3063cx;
                            }
                            orderableUnit.f6366ed = c0433j.f6366ed;
                            orderableUnit.f6367ee = c0433j.f6367ee + 1 + i3;
                        }
                    } else if (c0383i2.f2323B && orderableUnit.f6366ed >= c0433j.f6366ed) {
                        orderableUnit.f6366ed = c0433j.f6366ed;
                        orderableUnit.f6367ee = c0433j.f6367ee - 1;
                    }
                    if (c0433j.f1524bZ) {
                        f2 = c0433j.direction + c0383i2.f2310g;
                    } else {
                        f2 = c0433j.direction + c0383i2.f2301f;
                    }
                    if (!orderableUnit.mo2975bH()) {
                        if (c0383i2.f2306u) {
                            orderableUnit.mo2475h(f2);
                        } else {
                            if (f3 != 0.0f && c0383i2.f2317r) {
                                orderableUnit.mo2471i(f3);
                            }
                            if (c0383i2.f2302h && orderableUnit.f3674K == null) {
                                orderableUnit.m2496c(f, f2);
                            }
                        }
                    }
                    if (c0383i2.f2292K) {
                        orderableUnit.f3674K = c0433j.f3674K;
                        orderableUnit.f3675L = 5.0f;
                    }
                    if (c0383i2.f2293L && orderableUnit.f3674K == null) {
                        orderableUnit.f3674K = c0433j.f3674K;
                    }
                    if (c0383i2.f2328J && c0433j.f3674K != null && orderableUnit.f3674K != c0433j.f3674K) {
                        boolean z = false;
                        if (c0383i2.f2293L) {
                            z = true;
                        }
                        if (orderableUnit.m2616a(c0433j.f3674K, z)) {
                            orderableUnit.f3674K = c0433j.f3674K;
                            orderableUnit.f3675L = 5.0f;
                        }
                    }
                    if (orderableUnit instanceof C0433j) {
                        C0433j c0433j2 = (C0433j) orderableUnit;
                        if (c0383i2.f2318s) {
                            c0433j2.f2685dJ = c0433j2.x;
                            c0433j2.f2685dJ = c0433j2.y;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3468a(C0433j c0433j, boolean z) {
        ObjectVector objectVector = c0433j.f2719B;
        if (objectVector == null) {
            return;
        }
        ObjectVector objectVector2 = c0433j.customUnitMetadataA.f3046au;
        Object[] items = objectVector.getItems();
        for (int i = objectVector.size - 1; i >= 0; i--) {
            OrderableUnit orderableUnit = (OrderableUnit) items[i];
            if (orderableUnit != null) {
                C0383i c0383i = (C0383i) objectVector2.get(i);
                orderableUnit.m2500bw();
                items[i] = null;
                if (z && !c0383i.f2320v) {
                    orderableUnit.m3745cg();
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: b */
    public void mo3466b(C0433j c0433j) {
        m3468a(c0433j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: c */
    public void mo3464c(C0433j c0433j) {
        m3468a(c0433j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: a */
    public void mo3475a(C0433j c0433j) {
        boolean z = false;
        ObjectVector objectVector = c0433j.customUnitMetadataA.f3046au;
        Object[] items = objectVector.getItems();
        for (int i = objectVector.size - 1; i >= 0; i--) {
            C0383i c0383i = (C0383i) items[i];
            if (c0383i.f2307w != null) {
                OrderableUnit m3473a = m3473a(c0433j, c0383i);
                if (m3473a != null) {
                    if (!c0383i.f2308y) {
                        m3473a.m3745cg();
                    }
                }
                ObjectVector objectVector2 = new ObjectVector();
                c0383i.f2307w.m3428a(objectVector2, c0433j.team, (Unit) c0433j, true);
                if (objectVector2.size() > 1) {
                    GameEngine.log("onCreateSpawnUnitOf: created an extra " + (objectVector2.size() - 1) + " units");
                    for (int i2 = 1; i2 < objectVector2.size(); i2++) {
                        ((Unit) objectVector2.get(i2)).m3745cg();
                    }
                }
                if (objectVector2.size() == 0) {
                    GameEngine.log("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    Unit unit = (Unit) objectVector2.get(0);
                    if (!(unit instanceof OrderableUnit)) {
                        GameEngine.log("onCreateSpawnUnitOf: Warning " + unit.getUnitType().mo3087i() + " not an orderable unit type, cannot attach");
                        unit.m3745cg();
                    } else {
                        OrderableUnit orderableUnit = (OrderableUnit) unit;
                        if (c0433j.mo2607a(orderableUnit, c0383i)) {
                            orderableUnit.f1632cH = -9999;
                            if (c0433j.built < 1.0f && c0383i.f2321x) {
                                orderableUnit.m3728r(c0433j.built);
                                orderableUnit.f1619ce = c0433j.built;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo3465b(c0433j, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a
    /* renamed from: a */
    public void mo3471a(C0433j c0433j, CustomUnitMetadata customUnitMetadata) {
        ObjectVector objectVector = c0433j.f2719B;
        ObjectVector objectVector2 = c0433j.customUnitMetadataA.f3046au;
        if (objectVector2.size() == 0) {
            c0433j.f2719B = null;
        } else if (objectVector != null) {
            for (int size = objectVector.size() - 1; size >= 0; size--) {
                OrderableUnit orderableUnit = (OrderableUnit) objectVector.get(size);
                if (orderableUnit != null && size >= objectVector2.size()) {
                    orderableUnit.m3745cg();
                    objectVector.remove(size);
                }
            }
            for (int size2 = objectVector.size() - 1; size2 >= 0; size2--) {
                OrderableUnit orderableUnit2 = (OrderableUnit) objectVector.get(size2);
                if (orderableUnit2 != null) {
                    orderableUnit2.f1631cG = (C0383i) objectVector2.get(size2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0383i m3469a(C0433j c0433j, short s) {
        ObjectVector objectVector = c0433j.customUnitMetadataA.f3046au;
        if (objectVector.size <= s) {
            return null;
        }
        return (C0383i) objectVector.get(s);
    }

    /* renamed from: a */
    public static OrderableUnit m3473a(C0433j c0433j, C0383i c0383i) {
        short s;
        ObjectVector objectVector = c0433j.f2719B;
        if (objectVector == null || objectVector.size <= (s = c0383i.f2296a)) {
            return null;
        }
        return (OrderableUnit) objectVector.get(s);
    }

    /* renamed from: a */
    public static boolean m3472a(C0433j c0433j, C0383i c0383i, OrderableUnit orderableUnit) {
        CustomUnitMetadata customUnitMetadata = c0433j.customUnitMetadataA;
        short s = c0383i.f2296a;
        if (customUnitMetadata.f3046au.size <= s && orderableUnit != null) {
            GameEngine.log("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + customUnitMetadata.f3046au.size);
            return false;
        }
        if (c0433j.f2719B == null) {
            c0433j.f2719B = new ObjectVector();
        }
        ObjectVector objectVector = c0433j.f2719B;
        if (objectVector.size() == 0) {
            c0433j.f2680C = c0433j.direction;
        }
        if (orderableUnit == null && s >= objectVector.size()) {
            return true;
        }
        while (objectVector.size() <= s) {
            objectVector.add(null);
        }
        objectVector.set(s, orderableUnit);
        return true;
    }

    /* renamed from: a */
    public static void m3470a(C0433j c0433j, ObjectVector objectVector, boolean z) {
        C0383i m3735dj;
        boolean z2;
        ObjectVector objectVector2 = c0433j.f2719B;
        if (objectVector2 != null) {
            Iterator it = objectVector2.iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit != null && (unit instanceof OrderableUnit) && (m3735dj = unit.m3735dj()) != null && m3735dj.f2294N != null) {
                    Iterator it2 = unit.mo2712M().iterator();
                    while (it2.hasNext()) {
                        Action action = (Action) it2.next();
                        if (z) {
                            z2 = C0704ad.m1964a(m3735dj.f2294N, c0433j);
                        } else {
                            z2 = m3735dj.f2294N.read(c0433j);
                        }
                        if (z2) {
                            objectVector.add(new C0206g(action, (OrderableUnit) unit, action.m3834L()));
                        }
                    }
                }
            }
        }
    }
}