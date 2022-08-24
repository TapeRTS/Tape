package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class C0327f extends AbstractC0321a {

    /* renamed from: a */
    C0351ai f1960a;

    /* renamed from: b */
    C0351ai f1961b;

    /* renamed from: c */
    C0351ai f1962c;

    /* renamed from: d */
    C0351ai f1963d;

    /* renamed from: e */
    C0351ai f1964e;

    /* renamed from: f */
    C0351ai f1965f;

    /* renamed from: g */
    static final Pattern f1966g = Pattern.compile("%\\{([^\\]]*?)\\}");

    /* renamed from: a */
    public static void m5517a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0351ai m5427a = C0348af.m5427a(c0453l, c1072ab, str, "showMessageToPlayer", (String) null);
        C0351ai m5427a2 = C0348af.m5427a(c0453l, c1072ab, str, "showMessageToAllPlayers", (String) null);
        C0351ai m5427a3 = C0348af.m5427a(c0453l, c1072ab, str, "showMessageToAllEnemyPlayers", (String) null);
        C0351ai m5427a4 = C0348af.m5427a(c0453l, c1072ab, str, "showQuickWarLogToPlayer", (String) null);
        C0351ai m5427a5 = C0348af.m5427a(c0453l, c1072ab, str, "showQuickWarLogToAllPlayers", (String) null);
        C0351ai m5427a6 = C0348af.m5427a(c0453l, c1072ab, str, "debugMessage", (String) null);
        if (m5427a != null || m5427a2 != null || m5427a3 != null || m5427a4 != null || m5427a5 != null || m5427a6 != null) {
            C0327f c0327f = new C0327f();
            c0327f.f1960a = m5427a;
            c0327f.f1961b = m5427a2;
            c0327f.f1962c = m5427a3;
            c0327f.f1963d = m5427a4;
            c0327f.f1964e = m5427a5;
            c0327f.f1965f = m5427a6;
            c0339d.f2132ab.add(c0327f);
        }
    }

    /* renamed from: a */
    public String m5518a(C0451j c0451j, String str) {
        if (str == null) {
            str = null;
        }
        return str;
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1960a != null && c0451j.team == gameEngine.f6093bs) {
            C0831ad.m1743a((String) null, m5518a(c0451j, this.f1960a.m5372b(c0451j)));
        }
        if (this.f1961b != null) {
            C0831ad.m1743a((String) null, m5518a(c0451j, this.f1961b.m5372b(c0451j)));
        }
        if (this.f1962c != null && gameEngine.f6093bs != null && c0451j.team.m6354c(gameEngine.f6093bs)) {
            C0831ad.m1743a((String) null, m5518a(c0451j, this.f1962c.m5372b(c0451j)));
        }
        if (this.f1963d != null && c0451j.team == gameEngine.f6093bs) {
            gameEngine.f6111bS.f5108f.m2103a(m5518a(c0451j, this.f1963d.m5372b(c0451j)));
        }
        if (this.f1964e != null) {
            gameEngine.f6111bS.f5108f.m2103a(m5518a(c0451j, this.f1964e.m5372b(c0451j)));
        }
        if (this.f1965f != null && gameEngine.f6094bv && gameEngine.f6225bl) {
            C0831ad.m1743a((String) null, c0451j.m4802r().m4724i() + "(" + c0451j.f6945ed + ") Debug: " + m5518a(c0451j, this.f1965f.m5372b(c0451j)));
            return true;
        }
        return true;
    }
}
