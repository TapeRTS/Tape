package com.corrodinggames.rts.game.p011a;

import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.AbstractList;

/* renamed from: com.corrodinggames.rts.game.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/f.class */
public class C0136f {
    /* renamed from: a */
    static boolean m3805a(AbstractC0515r rVar) {
        C0270an ap;
        boolean z = false;
        if (rVar.m2238ao()) {
            z = true;
        }
        if (!z && (ap = rVar.m2237ap()) != null && ap.m3243d() == EnumC0271ao.reclaim) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    static boolean m3803b(AbstractC0515r rVar) {
        boolean z = false;
        if (rVar.m2238ao()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Object m3804a(AbstractList abstractList) {
        int size = abstractList.size();
        if (size == 0) {
            return null;
        }
        return abstractList.get(C0654f.m1514a(0, size - 1));
    }
}
