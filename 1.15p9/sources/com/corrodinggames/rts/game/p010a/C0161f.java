package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/f.class */
public class C0161f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m6778a(AbstractC0623y abstractC0623y) {
        C0305au m3135ar;
        boolean z = false;
        if (abstractC0623y.m3136aq()) {
            z = true;
        }
        if (!z && (m3135ar = abstractC0623y.m3135ar()) != null && m3135ar.m5676d() == EnumC0306av.f1816g) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m6775b(AbstractC0623y abstractC0623y) {
        boolean z = false;
        if (abstractC0623y.m3136aq()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Object m6776a(AbstractList abstractList) {
        int size = abstractList.size();
        if (size == 0) {
            return null;
        }
        return abstractList.get(CommonUtils.m2360a(0, size - 1));
    }

    /* renamed from: a */
    public static boolean m6777a(AbstractC0623y abstractC0623y, C0448g c0448g) {
        InterfaceC0303as r = abstractC0623y.getUnitType();
        if ((r instanceof C0453l) && C0448g.m5062a(c0448g, ((C0453l) r).f3152fq)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Action m6779a(C0136a c0136a, AbstractC0623y abstractC0623y, EnumC0340e enumC0340e) {
        ArrayList N = abstractC0623y.mo3520N();
        ArrayList m6854al = c0136a.m6854al();
        Iterator it = N.iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (action.m6039v(abstractC0623y) == enumC0340e) {
                m6854al.add(action);
            }
        }
        if (m6854al.size() > 0) {
            return (Action) m6776a(m6854al);
        }
        return null;
    }
}
