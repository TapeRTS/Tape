package com.corrodinggames.rts.game.units.custom.p015a.p016a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0230ae;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0396bm;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class C0314e extends AbstractC0309a {

    /* renamed from: a */
    public C0396bm f1895a;

    /* renamed from: b */
    public ArrayList f1896b;

    /* renamed from: c */
    public int f1897c;

    /* renamed from: d */
    public boolean f1898d;

    /* renamed from: e */
    public boolean f1899e;

    /* renamed from: f */
    public boolean f1900f;

    /* renamed from: a */
    public static void m3639a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, C0327d c0327d, String str3, boolean z) {
        C0396bm m3431a = C0396bm.m3431a(customUnitMetadata, unitConfig, str, str2 + "attachments_addNewUnits");
        int intValue = unitConfig.getStaticIntegerValue(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = unitConfig.getStaticBooleanValue(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = unitConfig.getStaticBooleanValue(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = unitConfig.getStaticBooleanValue(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!m3431a.m3426b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            C0314e c0314e = new C0314e();
            c0314e.f1895a = m3431a;
            String staticStringValue = unitConfig.getStaticStringValue(str, "attachments_onlyOnSlots", (String) null);
            if (staticStringValue != null) {
                for (String str4 : staticStringValue.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals(VariableScope.nullOrMissingString)) {
                        C0383i m3090g = customUnitMetadata.m3090g(trim);
                        if (c0314e.f1896b == null) {
                            c0314e.f1896b = new ArrayList();
                        }
                        if (m3090g == null) {
                            throw new C0395bl("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        c0314e.f1896b.add(m3090g);
                    }
                }
            }
            c0314e.f1897c = intValue;
            c0314e.f1900f = booleanValue3;
            c0314e.f1898d = booleanValue;
            c0314e.f1899e = booleanValue2;
            c0327d.f2069Z.add(c0314e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a
    /* renamed from: a */
    public boolean mo3629a(C0433j c0433j, Action action, PointF pointF, Unit unit, int i) {
        if ((this.f1898d || this.f1899e) && c0433j.f2719B != null && c0433j.f2719B.size() > 0) {
            int size = c0433j.f2719B.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Unit unit2 = (Unit) c0433j.f2719B.get(size);
                if (unit2 != null) {
                    if (this.f1896b != null) {
                        boolean z = false;
                        Iterator it = this.f1896b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((C0383i) it.next()).m3463a() == size) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(unit2 instanceof OrderableUnit)) {
                        GameEngine.PrintLOG("Failed to deattach unit:" + unit2.getUnitType().mo3087i() + " is not an OrderableUnit");
                    } else {
                        OrderableUnit orderableUnit = (OrderableUnit) unit2;
                        if (this.f1899e) {
                            c0433j.m3215a((Unit) orderableUnit, true, c0433j.f2718A.size() % 2 == 0);
                        } else {
                            orderableUnit.m2500bw();
                        }
                    }
                }
                size--;
            }
        }
        if (this.f1897c != 0) {
            for (int i2 = 0; i2 < this.f1897c; i2++) {
                if (c0433j.f2719B != null && c0433j.f2719B.size() > 0) {
                    for (int size2 = c0433j.f2719B.size() - 1; size2 >= 0; size2--) {
                        Unit unit3 = (Unit) c0433j.f2719B.get(size2);
                        if (unit3 != null) {
                            if (this.f1896b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.f1896b.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((C0383i) it2.next()).m3463a() == size2) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            unit3.m3745cg();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f1895a != null) {
            ObjectVector objectVector = new ObjectVector();
            this.f1895a.m3428a(objectVector, c0433j.team, (Unit) c0433j, true);
            Iterator it3 = objectVector.iterator();
            while (it3.hasNext()) {
                Unit unit4 = (Unit) it3.next();
                boolean z3 = false;
                if (!(unit4 instanceof OrderableUnit)) {
                    GameEngine.PrintLOG("Failed to attach unit:" + unit4.getUnitType().mo3087i() + " is not an OrderableUnit");
                } else {
                    OrderableUnit orderableUnit2 = (OrderableUnit) unit4;
                    if (this.f1896b != null) {
                        Iterator it4 = this.f1896b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C0383i c0383i = (C0383i) it4.next();
                            if (c0433j.m3213a(c0383i) == null && c0433j.mo2607a(orderableUnit2, c0383i)) {
                                orderableUnit2.f1632cH = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = c0433j.customUnitMetadataA.f3046au.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C0383i c0383i2 = (C0383i) it5.next();
                            if (c0433j.m3213a(c0383i2) == null && c0433j.mo2607a(orderableUnit2, c0383i2)) {
                                orderableUnit2.f1632cH = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        orderableUnit2.remove();
                    }
                }
            }
        }
        if (this.f1900f) {
            if (c0433j.f1630cF != null) {
                c0433j.m2500bw();
            }
            if (c0433j.transportedBy != null) {
                if (c0433j.transportedBy instanceof AbstractC0230ae) {
                    ((AbstractC0230ae) c0433j.transportedBy).mo2820e(c0433j);
                    return true;
                }
                GameEngine.LogTrace("transportedBy is not a TransportInterface");
                c0433j.transportedBy = null;
                return true;
            }
            return true;
        }
        return true;
    }
}