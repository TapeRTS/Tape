package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/j.class */
public class C0296j extends AbstractC0286a {

    /* renamed from: a */
    boolean f1830a;

    /* renamed from: b */
    C0365i f1831b;

    /* renamed from: c */
    C0365i f1832c;

    /* renamed from: d */
    C0365i f1833d;

    /* renamed from: e */
    C0365i f1834e;

    /* renamed from: a */
    public static void m3196a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        boolean booleanValue = abVar.m594a(str, str2 + "resetToDefaultTags", (Boolean) false).booleanValue();
        C0365i a = abVar.m609a(lVar, str, str2 + "temporarilyAddTags", (C0365i) null);
        C0365i a2 = abVar.m609a(lVar, str, str2 + "temporarilyRemoveTags", (C0365i) null);
        if (!(!booleanValue && a == null && a2 == null)) {
            C0296j jVar = new C0296j();
            jVar.f1830a = booleanValue;
            jVar.f1831b = a;
            jVar.f1832c = a2;
            cVar.f1920W.add(jVar);
        }
        C0365i a3 = abVar.m609a(lVar, str, str2 + "addGlobalTeamTags", (C0365i) null);
        C0365i a4 = abVar.m609a(lVar, str, str2 + "removeGlobalTeamTags", (C0365i) null);
        if (a3 != null || a4 != null) {
            C0296j jVar2 = new C0296j();
            jVar2.f1833d = a3;
            jVar2.f1834e = a4;
            cVar.f1920W.add(jVar2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1830a) {
            kVar.m2811k(false);
        }
        if (this.f1832c != null) {
            kVar.m2863b(this.f1832c);
        }
        if (this.f1831b != null) {
            kVar.m2870a(this.f1831b);
        }
        if (this.f1833d != null) {
            kVar.f1461bB.m3486b(this.f1833d);
        }
        if (this.f1834e == null) {
            return true;
        }
        kVar.f1461bB.m3472c(this.f1834e);
        return true;
    }
}
