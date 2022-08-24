package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0801j;
import com.corrodinggames.rts.gameFramework.p037f.EnumC0806n;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/d.class */
public class C1036d {
    /* renamed from: a */
    public static void m834a(C1049f c1049f, C1030a c1030a) {
        Integer m850d;
        Integer m850d2;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        if (!c1030a.f6597j) {
            z = true;
        }
        c1049f.m827a(c1030a);
        c1030a.f6596i = true;
        c1030a.f6597j = true;
        c1030a.f6598k = gameEngine.f6096by;
        boolean z2 = false;
        if (c1030a.f6608A != null) {
            C0801j m1952a = gameEngine.f6111bS.f5107e.m1952a(null, c1030a.f6608A.m5339b());
            if (m1952a != null) {
                String m856b = c1030a.m856b("globalMessage_delayPerChar");
                if (m856b != null) {
                    if (m856b.equals("slow")) {
                        m1952a.f5272e = 18;
                    } else {
                        int m855b = c1030a.m855b("globalMessage_delayPerChar", -1);
                        if (m855b != -1) {
                            m1952a.f5272e = m855b;
                        }
                    }
                }
                int m852c = c1030a.m852c("globalMessage_textColor", -1);
                if (m852c != -1) {
                    m1952a.f5273f = m852c;
                }
            }
            z2 = true;
        }
        String m856b2 = c1030a.m856b("debugMessage");
        if (m856b2 != null) {
            c1030a.m846h("Debug: " + m856b2);
            if (gameEngine.f6094bv && gameEngine.f6225bl) {
                C0831ad.m1743a((String) null, "Debug: " + m856b2);
            }
            z2 = true;
        }
        if (c1030a.m859a("showOnMap", false)) {
            gameEngine.f6115bW.m1942a(c1030a.m858b(), c1030a.m854c(), EnumC0806n.f5349d);
            z2 = true;
        }
        if (c1030a.f6613f.f6888a > 0) {
            Iterator it = c1030a.f6613f.iterator();
            while (it.hasNext()) {
                if (((AbstractC1031a) it.next()).m844c(c1030a)) {
                    z2 = true;
                }
            }
        }
        if (c1030a.f6594g == EnumC1037e.f6640a) {
            if (z) {
                c1030a.m846h("objective met");
            }
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6650k) {
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6648i) {
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6649j) {
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6646g) {
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6647h) {
            z2 = true;
            gameEngine.m1150b(c1030a.m858b(), c1030a.m854c());
        }
        if (c1030a.f6594g == EnumC1037e.f6644e) {
            float m858b = c1030a.m858b();
            float m854c = c1030a.m854c();
            Team m869a = c1030a.m869a();
            if (m869a == null) {
                c1030a.m847g("No team set, cannot spawn");
            } else if (c1030a.f6603v != null) {
                c1030a.f6603v.m5261a(m858b, m854c, 0.0f, 0.0f, m869a, false, null, null, false);
            } else {
                c1030a.m847g("No valid unit list to spawn");
            }
            z2 = true;
        }
        if (c1030a.f6594g == EnumC1037e.f6642c) {
            Team m869a2 = c1030a.m869a();
            if (m869a2 == null) {
                c1030a.m847g("Team not set for changeCredits");
                return;
            }
            if (c1030a.m850d("set") != null) {
                m869a2.f1309o = m850d.intValue();
            }
            if (c1030a.m850d("add") != null) {
                m869a2.m6344d(m850d2.intValue());
            }
        } else if (c1030a.f6594g == EnumC1037e.f6643d) {
            Team m869a3 = c1030a.m869a();
            if (m869a3 == null) {
                c1030a.m847g("Team not set for event_teamTags");
                return;
            }
            String m861a = c1030a.m861a("addTeamTags", (String) null);
            if (m861a != null) {
                m869a3.m6366b(C0448g.m5058a(m861a));
            }
            String m861a2 = c1030a.m861a("removeTeamTags", (String) null);
            if (m861a2 != null) {
                m869a3.m6350c(C0448g.m5058a(m861a2));
            }
        } else if (c1030a.f6594g == EnumC1037e.f6641b) {
            String m856b3 = c1030a.m856b("target");
            if (m856b3 == null) {
                C1049f.m802i("Move trigger has no target id:" + c1030a.f6591a);
                return;
            }
            PointF m807f = c1049f.m807f(m856b3);
            if (m807f == null) {
                C1049f.m802i("Move trigger: Cannot find target for:" + c1030a.f6591a + " target:" + m856b3);
                return;
            }
            Team m869a4 = c1030a.m869a();
            if (m869a4 == null) {
                C1049f.m802i("Team not set map trigger:" + c1030a.f6591a);
                return;
            }
            int i = 0;
            C0749e m2591b = gameEngine.f6124cf.m2591b(m869a4);
            Iterator it2 = Unit.f1589bD.iterator();
            while (it2.hasNext()) {
                Unit unit = (Unit) it2.next();
                if (unit.team == m869a4 && (unit instanceof AbstractC0623y) && c1030a.m868a(unit) && c1030a.m857b(unit)) {
                    m2591b.m2491a((AbstractC0623y) unit);
                    i++;
                }
            }
            m2591b.m2501a(m807f.x, m807f.y);
            if (z) {
                c1049f.m818b("firstActivation: move at:" + gameEngine.f6096by + " for teamId:" + m869a4.f1305k + " to targetId:" + m856b3 + " (#units:" + i + ")");
            }
            if (c1030a.m856b("unload") != null) {
                Iterator it3 = Unit.f1589bD.iterator();
                while (it3.hasNext()) {
                    Unit unit2 = (Unit) it3.next();
                    if (unit2.team == m869a4 && (unit2 instanceof AbstractC0623y) && c1030a.m868a(unit2) && c1030a.m857b(unit2) && unit2.m5803cq()) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                        C0749e m2591b2 = gameEngine.f6124cf.m2591b(m869a4);
                        m2591b2.f4849e = true;
                        m2591b2.m2491a(abstractC0623y);
                        m2591b2.m2496a(abstractC0623y.m5805co());
                    }
                }
            }
        } else {
            if (c1030a.f6594g == EnumC1037e.f6645f) {
                C1101m c1101m = new C1101m();
                Iterator it4 = Unit.f1589bD.iterator();
                while (it4.hasNext()) {
                    Unit unit3 = (Unit) it4.next();
                    if ((unit3 instanceof AbstractC0623y) && c1030a.m868a(unit3) && c1030a.m857b(unit3)) {
                        c1101m.add(unit3);
                    }
                }
                if (c1101m.size() > 0) {
                    Iterator it5 = c1101m.iterator();
                    while (it5.hasNext()) {
                        Unit unit4 = (Unit) it5.next();
                        unit4.m5812ch();
                        if ((unit4 instanceof AbstractC0623y) && unit4.m5867bI()) {
                            gameEngine.f6113bU.m1312a((AbstractC0623y) unit4);
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                c1030a.m846h("Trigger activated with no effect");
            }
        }
    }
}
