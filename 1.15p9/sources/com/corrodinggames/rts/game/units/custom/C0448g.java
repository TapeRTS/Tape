package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/g.class */
public final class C0448g {

    /* renamed from: a */
    final String f2833a;

    /* renamed from: b */
    public static ArrayList f2834b = new ArrayList();

    /* renamed from: c */
    public static final C0448g[] f2835c = new C0448g[0];

    /* renamed from: d */
    public static final C0449h f2836d = new C0449h(f2835c);

    private C0448g(String str) {
        this.f2833a = str;
    }

    public String toString() {
        return this.f2833a;
    }

    /* renamed from: a */
    public static C0449h m4411a(String str) {
        return m4410a(str, (C0449h) null);
    }

    /* renamed from: a */
    public static C0449h m4410a(String str, C0449h c0449h) {
        if (str == null) {
            return c0449h;
        }
        if (str.trim().equals(VariableScope.nullOrMissingString)) {
            return c0449h;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C0448g m4407c = m4407c(trim);
                if (!arrayList.contains(m4407c)) {
                    arrayList.add(m4407c);
                }
            }
        }
        if (arrayList.size() == 0) {
            return c0449h;
        }
        return new C0449h((C0448g[]) arrayList.toArray(new C0448g[0]));
    }

    /* renamed from: b */
    public static C0448g m4408b(String str) {
        String trim = str.trim();
        if (trim.contains(",")) {
            throw new C0412bm("Expected single tag, got:" + trim);
        }
        return m4407c(trim);
    }

    /* renamed from: c */
    public static C0448g m4407c(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        Iterator it = f2834b.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            if (c0448g.f2833a.equals(lowerCase)) {
                return c0448g;
            }
        }
        C0448g c0448g2 = new C0448g(lowerCase);
        f2834b.add(c0448g2);
        return c0448g2;
    }

    /* renamed from: a */
    public static void m4413a(C0449h c0449h, C0859ar c0859ar) {
        C0448g[] c0448gArr;
        if (c0449h == null) {
            c0859ar.m1551b((String) null);
        } else if (c0449h.f2837a.length == 0) {
            c0859ar.m1551b(VariableScope.nullOrMissingString);
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C0448g c0448g : c0449h.f2837a) {
                if (!z) {
                    sb.append(",");
                }
                z = false;
                sb.append(c0448g.f2833a);
            }
            c0859ar.m1551b(sb.toString());
        }
    }

    /* renamed from: a */
    public static C0449h m4412a(C0876k c0876k) {
        String m1444j = c0876k.m1444j();
        if (m1444j == null) {
            return null;
        }
        return m4410a(m1444j, f2836d);
    }

    /* renamed from: a */
    public static boolean m4414a(C0449h c0449h, C0449h c0449h2) {
        if (c0449h2 == null) {
            return false;
        }
        C0448g[] c0448gArr = c0449h.f2837a;
        C0448g[] c0448gArr2 = c0449h2.f2837a;
        for (C0448g c0448g : c0448gArr) {
            for (C0448g c0448g2 : c0448gArr2) {
                if (c0448g == c0448g2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4415a(C0448g c0448g, C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        for (C0448g c0448g2 : c0449h.f2837a) {
            if (c0448g2 == c0448g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m4409b(C0449h c0449h, C0449h c0449h2) {
        if (c0449h2 == null) {
            if (c0449h == null || c0449h.m4404b() == 0) {
                return true;
            }
            return false;
        }
        C0448g[] c0448gArr = c0449h.f2837a;
        C0448g[] c0448gArr2 = c0449h2.f2837a;
        int length = c0448gArr2.length;
        for (C0448g c0448g : c0448gArr) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c0448g != c0448gArr2[i]) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
