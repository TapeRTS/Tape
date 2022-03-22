package com.corrodinggames.rts.game.units.custom.p022e;

import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a.class */
public class C0356a {

    /* renamed from: a */
    static final Pattern f2393a = Pattern.compile("\\$\\{([^\\}]*)\\}");

    /* renamed from: b */
    static final Pattern f2394b = Pattern.compile("[A-Za-z_][A-Za-z_.0-9]*");

    /* renamed from: c */
    static C0357b f2395c = new C0357b();

    /* renamed from: a */
    public static void m2965a(C0368l lVar, C0809ab abVar) {
        int i = 0;
        f2395c.m2964a();
        Iterator it = abVar.m573d("@global ").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = abVar.m556j(str, "@global ").iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                String trim = str2.substring("@global ".length()).trim();
                try {
                    C0360d.m2952a(trim);
                    if (abVar.m566f(trim)) {
                        throw new C0324at("[" + str + "]" + str2 + ": A section already has that name");
                    }
                    String e = abVar.m568e(str, str2);
                    if (e.contains("${")) {
                        throw new C0324at("[" + str + "]" + str2 + " has dynamic value: '" + e + "', this is not yet supported");
                    }
                    f2395c.f2396a.m2949a(trim, e);
                } catch (C0324at e2) {
                    throw new C0324at("[" + str + "]" + str2 + ": " + e2.getMessage());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap c = abVar.m578c();
        for (String str3 : c.keySet()) {
            if (str3 != null && !str3.startsWith("comment_") && !str3.startsWith("template_")) {
                C0357b b = f2395c.m2961b();
                Iterator it3 = abVar.m556j(str3, "@define ").iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    String trim2 = str4.substring("@define ".length()).trim();
                    try {
                        C0360d.m2952a(trim2);
                        if (abVar.m566f(trim2)) {
                            throw new C0324at("[" + str3 + "]" + str4 + ": A section already has that name");
                        }
                        String e3 = abVar.m568e(str3, str4);
                        if (e3.contains("${")) {
                            throw new C0324at("[" + str3 + "]" + str4 + " has dynamic value: '" + e3 + "', this is not yet supported");
                        }
                        b.f2397b.m2949a(trim2, e3);
                    } catch (C0324at e4) {
                        throw new C0324at("[" + str3 + "]" + str4 + ": " + e4.getMessage());
                    }
                }
                Map map = (Map) c.get(str3);
                for (String str5 : map.keySet()) {
                    String str6 = (String) map.get(str5);
                    if (str6 != null && str6.contains("${")) {
                        int i2 = 0;
                        StringBuffer stringBuffer = new StringBuffer();
                        Matcher matcher = f2393a.matcher(str6);
                        while (matcher.find()) {
                            i2++;
                            if (i2 > 100) {
                                throw new C0324at("[" + str3 + "]" + str5 + ": Too many loops while parsing");
                            }
                            String group = matcher.group(1);
                            i++;
                            try {
                                String a = b.m2963a(lVar, abVar, str3, group);
                                if (!group.equals(a)) {
                                }
                                matcher.appendReplacement(stringBuffer, a);
                            } catch (C0324at e5) {
                                e5.printStackTrace();
                                throw new C0324at("[" + str3 + "]" + str5 + ": " + e5.getMessage());
                            }
                        }
                        matcher.appendTail(stringBuffer);
                        arrayList.add(new C0359c(str3, str5, stringBuffer.toString()));
                    }
                }
                continue;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C0359c cVar = (C0359c) it4.next();
            abVar.m567e(cVar.f2401a, cVar.f2402b, cVar.f2403c);
        }
        arrayList.clear();
    }
}
