package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq.class */
public class C0321aq {

    /* renamed from: a */
    ArrayList f2107a = new ArrayList();

    /* renamed from: b */
    int f2108b;

    /* renamed from: a */
    public void m3079a(float f) {
        Iterator it = this.f2107a.iterator();
        while (it.hasNext()) {
            ((C0322ar) it.next()).f2110b = f;
        }
    }

    /* renamed from: a */
    public boolean m3080a() {
        return m3077a(0.0f, 0.0f, 1.0f, true);
    }

    /* renamed from: a */
    public boolean m3078a(float f, float f2, float f3) {
        return m3077a(f, f2, f3, false);
    }

    /* renamed from: a */
    public boolean m3077a(float f, float f2, float f3, boolean z) {
        if (this.f2107a.size() == 0) {
            return false;
        }
        if (this.f2108b >= this.f2107a.size()) {
            this.f2108b = 0;
        }
        C0322ar arVar = (C0322ar) this.f2107a.get(this.f2108b);
        AbstractC0789l u = AbstractC0789l.m638u();
        if (z) {
            u.f5512bu.m2108c(arVar.f2109a, arVar.f2110b);
        } else {
            u.f5512bu.m2115a(arVar.f2109a, arVar.f2110b, f, f2);
        }
        this.f2108b++;
        return true;
    }

    /* renamed from: a */
    public static C0321aq m3076a(C0368l lVar, String str) {
        return m3075a(lVar, str, (C0321aq) null);
    }

    /* renamed from: a */
    public static C0321aq m3075a(C0368l lVar, String str, C0321aq aqVar) {
        if ((str == null || str.equals("")) && aqVar != null) {
            return aqVar;
        }
        return new C0321aq(lVar, str);
    }

    public C0321aq() {
    }

    public C0321aq(C0368l lVar, String str) {
        String[] split;
        if (!(str == null || str.equals("") || str.equalsIgnoreCase("NONE"))) {
            String str2 = lVar.f2506x;
            for (String str3 : str.split(",")) {
                C0322ar arVar = new C0322ar(this);
                String trim = str3.trim();
                String str4 = "";
                if (trim.startsWith("ROOT:")) {
                    trim = trim.substring("ROOT:".length());
                    str4 = str4 + "ROOT:";
                }
                if (trim.startsWith("SHARED:")) {
                    trim = trim.substring("SHARED:".length());
                    str4 = str4 + "SHARED:";
                }
                String[] split2 = trim.split(":");
                String str5 = null;
                String trim2 = split2[0].trim();
                if (split2.length != 1) {
                    if (split2.length == 2) {
                        str5 = split2[1].trim();
                    } else {
                        throw new RuntimeException("Unknown sound format:" + trim);
                    }
                }
                if (str5 != null) {
                    try {
                        arVar.f2110b = Float.parseFloat(str5);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException("Failed to parse volume float: '" + str5 + "' of sound: '" + trim + "'");
                    }
                }
                arVar.f2109a = C0307ac.m3133a(str2, str4 + trim2, lVar);
                if (arVar.f2109a != null) {
                    this.f2107a.add(arVar);
                }
            }
        }
    }
}
