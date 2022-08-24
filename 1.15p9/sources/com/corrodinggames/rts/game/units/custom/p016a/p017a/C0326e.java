package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class C0326e extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f1954a;

    /* renamed from: b */
    public ArrayList f1955b;

    /* renamed from: c */
    public int f1956c;

    /* renamed from: d */
    public boolean f1957d;

    /* renamed from: e */
    public boolean f1958e;

    /* renamed from: f */
    public boolean f1959f;

    /* renamed from: a */
    public static void m5520a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m5260a = C0413bn.m5260a(c0453l, c1072ab, str, str2 + "attachments_addNewUnits");
        int intValue = c1072ab.m682b(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = c1072ab.m700a(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = c1072ab.m700a(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!m5260a.m5255b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            C0326e c0326e = new C0326e();
            c0326e.f1954a = m5260a;
            String m681b = c1072ab.m681b(str, "attachments_onlyOnSlots", (String) null);
            if (m681b != null) {
                for (String str4 : m681b.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals(VariableScope.nullOrMissingString)) {
                        C0399m m4723i = c0453l.m4723i(trim);
                        if (c0326e.f1955b == null) {
                            c0326e.f1955b = new ArrayList();
                        }
                        if (m4723i == null) {
                            throw new C0412bm("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        c0326e.f1955b.add(m4723i);
                    }
                }
            }
            c0326e.f1956c = intValue;
            c0326e.f1959f = booleanValue3;
            c0326e.f1957d = booleanValue;
            c0326e.f1958e = booleanValue2;
            c0339d.f2132ab.add(c0326e);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if ((this.f1957d || this.f1958e) && c0451j.f2866B != null && c0451j.f2866B.size() > 0) {
            int size = c0451j.f2866B.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Unit unit2 = (Unit) c0451j.f2866B.get(size);
                if (unit2 != null) {
                    if (this.f1955b != null) {
                        boolean z = false;
                        Iterator it = this.f1955b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((C0399m) it.next()).m5293a() == size) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(unit2 instanceof AbstractC0623y)) {
                        GameEngine.PrintLog("Failed to deattach unit:" + unit2.getUnitType().mo5706i() + " is not an OrderableUnit");
                    } else {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                        if (this.f1958e) {
                            c0451j.m4993a((Unit) abstractC0623y, true, c0451j.f2865A.size() % 2 == 0);
                        } else {
                            abstractC0623y.m3081bx();
                        }
                    }
                }
                size--;
            }
        }
        if (this.f1956c != 0) {
            for (int i2 = 0; i2 < this.f1956c; i2++) {
                if (c0451j.f2866B != null && c0451j.f2866B.size() > 0) {
                    for (int size2 = c0451j.f2866B.size() - 1; size2 >= 0; size2--) {
                        Unit unit3 = (Unit) c0451j.f2866B.get(size2);
                        if (unit3 != null) {
                            if (this.f1955b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.f1955b.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((C0399m) it2.next()).m5293a() == size2) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            unit3.m5812ch();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f1954a != null) {
            C1101m c1101m = new C1101m();
            this.f1954a.m5257a(c1101m, c0451j.team, (Unit) c0451j, true);
            Iterator it3 = c1101m.iterator();
            while (it3.hasNext()) {
                Unit unit4 = (Unit) it3.next();
                boolean z3 = false;
                if (!(unit4 instanceof AbstractC0623y)) {
                    GameEngine.PrintLog("Failed to attach unit:" + unit4.getUnitType().mo5706i() + " is not an OrderableUnit");
                } else {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit4;
                    if (this.f1955b != null) {
                        Iterator it4 = this.f1955b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C0399m c0399m = (C0399m) it4.next();
                            if (c0451j.m4990a(c0399m) == null && c0451j.m4981a(abstractC0623y2, c0399m)) {
                                abstractC0623y2.f1653cO = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = c0451j.f2861w.f3223az.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C0399m c0399m2 = (C0399m) it5.next();
                            if (c0451j.m4990a(c0399m2) == null && c0451j.m4981a(abstractC0623y2, c0399m2)) {
                                abstractC0623y2.f1653cO = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        abstractC0623y2.mo2880a();
                    }
                }
            }
        }
        if (this.f1959f) {
            if (c0451j.f1651cM != null) {
                c0451j.m3081bx();
            }
            if (c0451j.f1650cL != null) {
                if (c0451j.f1650cL instanceof InterfaceC0242ak) {
                    ((InterfaceC0242ak) c0451j.f1650cL).mo5934e(c0451j);
                    return true;
                }
                GameEngine.m1120g("transportedBy is not a TransportInterface");
                c0451j.f1650cL = null;
                return true;
            }
            return true;
        }
        return true;
    }
}
