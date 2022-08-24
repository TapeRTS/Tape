package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/l.class */
public class C0333l extends AbstractC0321a {

    /* renamed from: a */
    boolean f1996a;

    /* renamed from: b */
    C0449h f1997b;

    /* renamed from: c */
    C0449h f1998c;

    /* renamed from: d */
    C0449h f1999d;

    /* renamed from: e */
    C0449h f2000e;

    /* renamed from: a */
    public static void m5505a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m700a(str, str2 + "resetToDefaultTags", (Boolean) false).booleanValue();
        C0449h m720a = c1072ab.m720a(c0453l, str, str2 + "temporarilyAddTags", (C0449h) null);
        C0449h m720a2 = c1072ab.m720a(c0453l, str, str2 + "temporarilyRemoveTags", (C0449h) null);
        if (booleanValue || m720a != null || m720a2 != null) {
            C0333l c0333l = new C0333l();
            c0333l.f1996a = booleanValue;
            c0333l.f1997b = m720a;
            c0333l.f1998c = m720a2;
            c0339d.f2132ab.add(c0333l);
        }
        C0449h m720a3 = c1072ab.m720a(c0453l, str, str2 + "addGlobalTeamTags", (C0449h) null);
        C0449h m720a4 = c1072ab.m720a(c0453l, str, str2 + "removeGlobalTeamTags", (C0449h) null);
        if (m720a3 != null || m720a4 != null) {
            C0333l c0333l2 = new C0333l();
            c0333l2.f1999d = m720a3;
            c0333l2.f2000e = m720a4;
            c0339d.f2132ab.add(c0333l2);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f1996a) {
            c0451j.m4815j(false);
        }
        if (this.f1998c != null) {
            c0451j.m4944b(this.f1998c);
        }
        if (this.f1997b != null) {
            c0451j.m4985a(this.f1997b);
        }
        if (this.f1999d != null) {
            c0451j.team.m6366b(this.f1999d);
        }
        if (this.f2000e != null) {
            c0451j.team.m6350c(this.f2000e);
            return true;
        }
        return true;
    }
}
