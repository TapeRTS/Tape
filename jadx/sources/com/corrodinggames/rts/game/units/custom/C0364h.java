package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/h.class */
public final class C0364h {

    /* renamed from: a */
    final String f2433a;

    /* renamed from: b */
    public static ArrayList f2434b = new ArrayList();

    /* renamed from: c */
    public static final C0364h[] f2435c = new C0364h[0];

    /* renamed from: d */
    public static final C0365i f2436d = new C0365i(f2435c);

    private C0364h(String str) {
        this.f2433a = str;
    }

    public String toString() {
        return this.f2433a;
    }

    /* renamed from: a */
    public static C0365i m2901a(String str) {
        return m2900a(str, (C0365i) null);
    }

    /* renamed from: a */
    public static C0365i m2900a(String str, C0365i iVar) {
        if (str == null) {
            return iVar;
        }
        if (str.trim().equals("")) {
            return iVar;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (!trim.equals("")) {
                C0364h c = m2897c(trim);
                if (!arrayList.contains(c)) {
                    arrayList.add(c);
                }
            }
        }
        if (arrayList.size() == 0) {
            return iVar;
        }
        return new C0365i((C0364h[]) arrayList.toArray(new C0364h[0]));
    }

    /* renamed from: b */
    public static C0364h m2898b(String str) {
        String trim = str.trim();
        if (!trim.contains(",")) {
            return m2897c(trim);
        }
        throw new C0324at("Expected single tag, got:" + trim);
    }

    /* renamed from: c */
    public static C0364h m2897c(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        Iterator it = f2434b.iterator();
        while (it.hasNext()) {
            C0364h hVar = (C0364h) it.next();
            if (hVar.f2433a.equals(lowerCase)) {
                return hVar;
            }
        }
        C0364h hVar2 = new C0364h(lowerCase);
        f2434b.add(hVar2);
        return hVar2;
    }

    /* renamed from: a */
    public static void m2903a(C0365i iVar, C0690ap apVar) {
        C0364h[] hVarArr;
        if (iVar == null) {
            apVar.mo1132b((String) null);
        } else if (iVar.f2437a.length == 0) {
            apVar.mo1132b("");
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C0364h hVar : iVar.f2437a) {
                if (!z) {
                    sb.append(",");
                }
                z = false;
                sb.append(hVar.f2433a);
            }
            apVar.mo1132b(sb.toString());
        }
    }

    /* renamed from: a */
    public static C0365i m2902a(C0707k kVar) {
        String j = kVar.m1058j();
        if (j == null) {
            return null;
        }
        return m2900a(j, f2436d);
    }

    /* renamed from: a */
    public static boolean m2904a(C0365i iVar, C0365i iVar2) {
        if (iVar2 == null) {
            return false;
        }
        C0364h[] hVarArr = iVar.f2437a;
        C0364h[] hVarArr2 = iVar2.f2437a;
        for (C0364h hVar : hVarArr) {
            for (C0364h hVar2 : hVarArr2) {
                if (hVar == hVar2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2905a(C0364h hVar, C0365i iVar) {
        if (iVar == null) {
            return false;
        }
        for (C0364h hVar2 : iVar.f2437a) {
            if (hVar2 == hVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2899b(C0365i iVar, C0365i iVar2) {
        if (iVar2 != null) {
            C0364h[] hVarArr = iVar.f2437a;
            C0364h[] hVarArr2 = iVar2.f2437a;
            int length = hVarArr2.length;
            for (C0364h hVar : hVarArr) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (hVar == hVarArr2[i]) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        } else if (iVar == null || iVar.m2894b() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
