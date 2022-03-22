package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.EnumC0172n;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0272b;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.p016a.C0300b;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p016a.C0304f;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0303e;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0287a;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0288b;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0290d;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0291e;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0292f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0293g;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0294h;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0295i;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0296j;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0297k;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0299m;
import com.corrodinggames.rts.game.units.custom.p018b.C0329b;
import com.corrodinggames.rts.game.units.custom.p018b.C0330c;
import com.corrodinggames.rts.game.units.custom.p018b.C0332e;
import com.corrodinggames.rts.game.units.custom.p018b.C0334g;
import com.corrodinggames.rts.game.units.custom.p018b.C0335h;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.custom.p020d.C0352b;
import com.corrodinggames.rts.game.units.custom.p020d.C0353c;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.custom.p022e.C0356a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0190l;
import com.corrodinggames.rts.game.units.p013a.C0191m;
import com.corrodinggames.rts.game.units.p013a.C0192n;
import com.corrodinggames.rts.game.units.p013a.C0193o;
import com.corrodinggames.rts.game.units.p013a.C0200v;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.game.units.p014b.AbstractC0274b;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.game.units.p025e.AbstractC0440h;
import com.corrodinggames.rts.game.units.p025e.AbstractC0444j;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.game.units.p025e.C0435c;
import com.corrodinggames.rts.game.units.p028h.AbstractC0497f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0810ac;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ac.class */
public class C0307ac {

    /* renamed from: a */
    static int f1985a;

    /* renamed from: b */
    static int f1986b;

    /* renamed from: c */
    static C0657b f1987c;

    /* renamed from: d */
    static boolean f1988d;

    /* renamed from: g */
    static int f1991g;

    /* renamed from: h */
    static int f1992h;

    /* renamed from: i */
    static boolean f1993i;

    /* renamed from: j */
    static int f1994j;

    /* renamed from: e */
    public static HashMap f1989e = new HashMap();

    /* renamed from: f */
    public static HashMap f1990f = new HashMap();

    /* renamed from: k */
    public static C0835m f1995k = new C0835m();

    /* renamed from: l */
    static final Object f1996l = new Object();

    /* renamed from: m */
    static C0657b f1997m = null;

    /* renamed from: n */
    static String f1998n = null;

    /* renamed from: a */
    public static void m3152a(int i) {
        if (f1987c != null) {
            f1987c.f4628r += i;
        }
    }

    /* renamed from: a */
    public static void m3153a() {
    }

    /* renamed from: a */
    public static void m3143a(C0748e eVar) {
        if (eVar != null && !eVar.f5251q) {
            eVar.f5251q = true;
            m3152a(eVar.mo348t());
        }
    }

    /* renamed from: a */
    public static void m3126a(C0748e[] eVarArr) {
        if (eVarArr != null) {
            C0748e eVar = null;
            for (C0748e eVar2 : eVarArr) {
                if (eVar2 != eVar) {
                    m3143a(eVar2);
                }
                if (eVar == null) {
                    eVar = eVar2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3144a(AbstractC0534i iVar) {
        if (!iVar.f3597f) {
            iVar.f3597f = true;
            if (f1987c != null) {
                f1987c.f4629s += iVar.mo73a();
            }
        }
    }

    /* renamed from: b */
    public static void m3125b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        ArrayList arrayList = new ArrayList(C0368l.f2485c);
        ArrayList arrayList2 = new ArrayList(C0368l.f2486d);
        C0835m mVar = new C0835m();
        boolean z = false;
        boolean z2 = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            boolean z3 = false;
            Iterator it2 = lVar.f2492j.iterator();
            while (it2.hasNext()) {
                C0382y yVar = (C0382y) it2.next();
                long a = yVar.m2707a(false);
                if (a != yVar.f2893a) {
                    z3 = true;
                    yVar.f2893a = a;
                }
            }
            if (z3) {
                if (!z2) {
                    AbstractC0789l.m670d("Detected unit changes");
                }
                C0368l a2 = m3149a(lVar);
                if (a2 == null) {
                    AbstractC0789l.m670d("Failed to apply changes to unit type: " + lVar.f2513E);
                    z = true;
                } else {
                    AbstractC0789l.m670d("Changes applied to unit type: " + lVar.f2513E);
                    z2 = true;
                    mVar.add(a2);
                }
            }
        }
        if (z2 && !m3118c(false)) {
            z = true;
        }
        if (z2 && !z) {
            C0368l.f2487e = null;
            m3117d();
            f1998n = null;
            AbstractC0171m.m3520K();
            if (!z) {
                Iterator it3 = mVar.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C0368l lVar2 = (C0368l) it3.next();
                    if (lVar2.f2850gd.size() > 0) {
                        u.m718a(lVar2.f2850gd.size() + " Warning(s) loading: " + lVar2.m2774b() + " \n" + ((String) lVar2.f2850gd.get(0)), 1);
                        lVar2.f2850gd.clear();
                        break;
                    }
                }
            }
        }
        if (z) {
            AbstractC0789l.m670d("Failed to load some units, keeping old config");
            synchronized (C0368l.f2485c) {
                C0368l.f2485c.clear();
                C0368l.f2485c.addAll(arrayList);
            }
            C0368l.f2486d = arrayList2;
        }
    }

    /* renamed from: c */
    public static void m3119c() {
        if (C0368l.f2487e != null) {
            AbstractC0789l.m670d("applyPendingNetworkUnits: Applying new network units from server (" + C0368l.f2487e.size() + " units)");
            C0368l.f2486d = C0368l.f2487e;
            C0368l.f2487e = null;
            m3117d();
            return;
        }
        AbstractC0789l.m670d("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m3127a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (C0368l.f2485c) {
            Iterator it = C0368l.f2485c.iterator();
            while (it.hasNext()) {
                C0368l lVar = (C0368l) it.next();
                if (lVar.f2510B == null || (lVar.f2510B.m1373k() && z)) {
                    arrayList.add(lVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m3145a(C0368l lVar, C0809ab abVar, String str, String str2, boolean z) {
        C0832j a = m3141a(str);
        if (a != null) {
            try {
                C0809ab abVar2 = new C0809ab(new BufferedInputStream(a), str);
                lVar.m2745m(a.m496d());
                abVar.m606a(abVar2);
                m3148a(lVar, abVar, abVar2, str, 1);
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0324at("copyFrom conf failed", "IOException: " + e.getMessage());
            }
        } else if (!z) {
            throw new C0324at("[" + str2 + "] Could not find conf target:" + str);
        }
    }

    /* renamed from: a */
    public static void m3148a(C0368l lVar, C0809ab abVar, C0809ab abVar2, String str, int i) {
        String str2;
        String str3;
        if (i > 10) {
            throw new C0324at("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String b = abVar2.m579b("core", "copyFrom", (String) null);
        if (b != null) {
            String[] split = b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str4 : split) {
                String trim = str4.trim();
                if (!trim.equals("")) {
                    if (trim.contains("..")) {
                        throw new C0324at("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (lVar.f2510B == null) {
                            str3 = "units/common.ini";
                        } else {
                            str3 = lVar.f2510B.f4616f + "/common.ini";
                        }
                        str2 = m3134a(C0654f.m1423h(str3), substring);
                    } else {
                        str2 = m3134a(C0654f.m1423h(str), trim);
                    }
                    C0832j a = m3141a(str2);
                    if (a == null) {
                        String str5 = "Could not find copyFrom target:" + str2;
                        if (i != 0) {
                            str5 = str5 + " (while loading: " + str + ")";
                        }
                        throw new C0324at(str5);
                    }
                    try {
                        C0809ab abVar3 = new C0809ab(new BufferedInputStream(a), str2);
                        lVar.m2745m(a.m496d());
                        abVar.m606a(abVar3);
                        m3148a(lVar, abVar, abVar3, str2, i + 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new C0324at("copyFrom conf failed", "IOException: " + e.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3147a(C0368l lVar, C0809ab abVar, String str, String str2, int i) {
        if (i > 10) {
            throw new C0324at("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String b = abVar.m579b(str2, "@copyFromSection", (String) null);
        if (!(b == null || b.equals(""))) {
            String[] split = b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals("")) {
                    C0835m j = abVar.m556j(trim, "");
                    if (j.size() == 0) {
                        throw new C0324at("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                    }
                    Iterator it = j.iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        String b2 = abVar.m582b(trim, str4);
                        if (b2 != null) {
                            abVar.m570d(str, str4, b2);
                        }
                    }
                    m3147a(lVar, abVar, str, trim, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0311ag m3142a(C0809ab abVar, String str, String str2, String str3) {
        return abVar.m574c(str, str2, str3);
    }

    /* renamed from: a */
    public static C0368l m3149a(C0368l lVar) {
        String str = lVar.f2506x;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0368l lVar2 = null;
        String str2 = null;
        if (lVar.f2510B != null) {
            str2 = lVar.f2510B.f4636z;
        }
        f1998n = null;
        try {
            lVar2 = m3139a(str, lVar.f2510B, lVar.f2511C, lVar.f2512D);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f1998n == null) {
                u.m718a("Error loading unit:" + str + "\n" + e.getMessage(), 1);
            }
        }
        if (lVar2 == null && lVar.f2510B != null) {
            lVar.f2510B.f4636z = str2;
        }
        if (lVar2 != null) {
            synchronized (C0368l.f2485c) {
                C0368l.f2485c.remove(lVar);
            }
            m3150a(lVar, lVar2);
            if (C0368l.f2486d.remove(lVar)) {
                C0368l.f2486d.add(lVar2);
            } else {
                AbstractC0789l.m670d("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            AbstractC0171m.m3520K();
        }
        return lVar2;
    }

    /* renamed from: a */
    public static void m3150a(AbstractC0268al alVar, C0368l lVar) {
        Iterator it = AbstractC0210af.m3317bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof C0367k) {
                C0367k kVar = (C0367k) afVar;
                if (kVar.f2460v == alVar) {
                    AbstractC0171m.m3488b((AbstractC0210af) kVar);
                    kVar.m2868a(lVar, false);
                    kVar.mo2332Q();
                    if (kVar.m3307cO() != null) {
                        kVar.m3307cO().m3023a(lVar);
                    }
                    AbstractC0171m.m3473c(kVar);
                }
                if (kVar.f2461w == alVar) {
                    kVar.f2461w = lVar;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m3120b(boolean z) {
        ArrayList a = m3127a(z);
        C0368l.f2487e = null;
        C0368l.f2486d = a;
        f1998n = null;
        m3117d();
        return f1998n;
    }

    /* renamed from: c */
    public static boolean m3118c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = C0368l.f2486d;
        if (z) {
            arrayList = m3127a(true);
        } else {
            arrayList = C0368l.f2486d;
        }
        boolean z2 = true;
        f1998n = null;
        C0368l.f2486d = arrayList;
        m3116e();
        if (f1998n != null) {
            z2 = false;
        }
        C0368l.f2486d = arrayList2;
        m3116e();
        return z2;
    }

    /* renamed from: d */
    public static void m3117d() {
        synchronized (f1996l) {
            m3111j();
        }
    }

    /* renamed from: j */
    private static void m3111j() {
        C0368l lVar = null;
        ArrayList arrayList = new ArrayList();
        if (AbstractC0789l.m638u().m700ai()) {
            for (EnumC0215ak akVar : EnumC0215ak.values()) {
                arrayList.add(akVar);
            }
        }
        Iterator it = C0368l.f2486d.iterator();
        while (it.hasNext()) {
            C0368l lVar2 = (C0368l) it.next();
            arrayList.add(lVar2);
            if (lVar2.f2513E.equals("missing") && lVar2.f2510B == null) {
                lVar = lVar2;
            }
        }
        EnumC0215ak.f1639ad = arrayList;
        AbstractC0210af.m3313bz();
        m3116e();
        C0345a.m3012d();
        if (lVar == null) {
            AbstractC0789l.m670d("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = C0368l.f2486d.iterator();
            while (it2.hasNext()) {
                C0368l lVar3 = (C0368l) it2.next();
                if (lVar3.f2513E.equals("missing")) {
                    AbstractC0789l.m670d("Found a missing placeholder");
                    lVar = lVar3;
                }
            }
        }
        C0368l.f2484b = lVar;
    }

    /* renamed from: a */
    public static C0832j m3141a(String str) {
        return C0596a.m1884h("" + str);
    }

    /* renamed from: a */
    public static void m3128a(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* renamed from: a */
    public static void m3151a(AbstractC0268al alVar) {
        C0190l lVar;
        C0190l lVar2;
        AbstractC0789l.m638u();
        try {
            alVar.mo2756h();
            if (alVar instanceof C0368l) {
                C0368l lVar3 = (C0368l) alVar;
                if (lVar3.f2817fw != null) {
                    AbstractC0268al a = EnumC0215ak.m3273a(lVar3.f2817fw);
                    if (a == null) {
                        throw new C0324at("Could not find [ai]upgradedFrom target:" + lVar3.f2817fw);
                    }
                    lVar3.m2772b(a);
                }
                Iterator it = lVar3.f2497o.iterator();
                while (it.hasNext()) {
                    ((C0377t) it.next()).mo2715a();
                }
                if (lVar3.f2765ew) {
                    C0368l.f2489g.add(lVar3);
                }
            }
            Iterator it2 = C0368l.f2486d.iterator();
            while (it2.hasNext()) {
                C0368l lVar4 = (C0368l) it2.next();
                if (alVar instanceof C0368l) {
                    C0368l lVar5 = (C0368l) alVar;
                    if (lVar4.f2817fw != null && lVar4.f2817fw.equalsIgnoreCase(lVar5.mo2754i())) {
                        lVar5.m2772b(lVar4);
                    }
                }
                Iterator it3 = lVar4.f2837fQ.iterator();
                while (it3.hasNext()) {
                    C0373p pVar = (C0373p) it3.next();
                    if (pVar.f2869a.equalsIgnoreCase(alVar.mo2754i())) {
                        pVar.f2873e = true;
                        boolean z = false;
                        for (int i = lVar4.f2636bX; i <= 3; i++) {
                            ArrayList a2 = alVar.mo2798a(i);
                            if (lVar4.f2557aw || pVar.f2871c) {
                                lVar2 = new C0200v(lVar4);
                            } else {
                                lVar2 = new C0190l(lVar4, null);
                            }
                            if (pVar.f2870b != -999.0f) {
                                lVar2.f1354f = pVar.f2870b;
                            }
                            if (pVar.f2874f != null) {
                                if (alVar instanceof C0368l) {
                                    lVar2.f1355g = C0300b.m3186a(pVar);
                                } else if (!z) {
                                    z = true;
                                    lVar4.m2741o("builtFrom isLocked currently cannot be used when targeting old-style unit:" + alVar.mo2754i());
                                }
                            }
                            boolean z2 = false;
                            Iterator it4 = a2.iterator();
                            while (it4.hasNext()) {
                                if (lVar2.equals((AbstractC0197s) it4.next())) {
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                a2.add(lVar2);
                            }
                            m3128a(a2);
                        }
                    }
                }
            }
            if (alVar instanceof C0368l) {
                C0368l lVar6 = (C0368l) alVar;
                Iterator it5 = lVar6.f2838fR.iterator();
                while (it5.hasNext()) {
                    C0301c cVar = (C0301c) it5.next();
                    if (cVar.f1881j != null && cVar.f1881j.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList a3 = alVar.mo2798a(i2);
                            C0193o oVar = new C0193o();
                            if (cVar.f1885n != -999.0f) {
                                oVar.f1354f = cVar.f1885n;
                            }
                            a3.add(oVar);
                            lVar6.f2678cN = true;
                            m3128a(a3);
                        }
                    } else if (cVar.f1881j != null && cVar.f1881j.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList a4 = alVar.mo2798a(i3);
                            C0191m mVar = new C0191m(true);
                            if (cVar.f1885n != -999.0f) {
                                mVar.f1354f = cVar.f1885n;
                            }
                            a4.add(mVar);
                            m3128a(a4);
                        }
                    } else if (cVar.f1881j == null || !cVar.f1881j.equalsIgnoreCase("repair")) {
                        AbstractC0268al alVar2 = null;
                        if (cVar.f1881j != null) {
                            alVar2 = EnumC0215ak.m3273a(cVar.f1881j);
                            if (alVar2 == null) {
                                throw new C0324at("Could not find canBuild target:" + cVar.f1881j);
                            }
                        } else if (cVar.f1952aC != EnumC0303e.convert) {
                            throw new C0324at("'Target' required for action:" + cVar.m3183a());
                        }
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList a5 = alVar.mo2798a(i4);
                            if (cVar.f1952aC == EnumC0303e.build) {
                                if (alVar2.mo2752j() || cVar.f1950aA) {
                                    lVar = new C0200v(alVar2, cVar.f1949az, null);
                                    lVar.f1355g = C0300b.m3187a(cVar);
                                } else {
                                    lVar = new C0190l(alVar2, null);
                                    lVar.f1355g = C0300b.m3187a(cVar);
                                }
                            } else if (cVar.f1952aC == EnumC0303e.convert) {
                                lVar = new C0304f(cVar, C0368l.m2795a(alVar2));
                            } else {
                                throw new C0324at("Could not find actionType:" + cVar.f1952aC);
                            }
                            if (cVar.f1885n != -999.0f) {
                                lVar.f1354f = cVar.f1885n;
                            }
                            boolean z3 = false;
                            Iterator it6 = a5.iterator();
                            while (it6.hasNext()) {
                                if (lVar.equals((AbstractC0197s) it6.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                a5.add(lVar);
                            }
                            m3128a(a5);
                        }
                    } else {
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList a6 = alVar.mo2798a(i5);
                            C0192n nVar = new C0192n();
                            if (cVar.f1885n != -999.0f) {
                                nVar.f1354f = cVar.f1885n;
                            }
                            a6.add(nVar);
                            m3128a(a6);
                        }
                    }
                }
            }
            if (alVar instanceof C0368l) {
                C0368l lVar7 = (C0368l) alVar;
                lVar7.f2804fj = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = alVar.mo2798a(i6).iterator();
                    while (it7.hasNext()) {
                        AbstractC0197s sVar = (AbstractC0197s) it7.next();
                        if (!(sVar instanceof C0304f) && sVar.mo2412i() != null) {
                            lVar7.f2804fj = true;
                        }
                    }
                }
                Iterator it8 = lVar7.f2497o.iterator();
                while (it8.hasNext()) {
                    ((C0377t) it8.next()).mo2714b();
                }
            }
        } catch (C0324at e) {
            m3136a(alVar.mo2754i(), e, alVar);
        } catch (RuntimeException e2) {
            m3136a(alVar.mo2754i(), e2, alVar);
        }
    }

    /* renamed from: e */
    public static void m3116e() {
        synchronized (f1996l) {
            m3110k();
        }
    }

    /* renamed from: k */
    private static void m3110k() {
        C0373p pVar;
        C0368l.f2489g.clear();
        C0368l.f2488f.clear();
        Iterator it = C0368l.f2486d.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            Iterator it2 = lVar.f2837fQ.iterator();
            while (it2.hasNext()) {
                ((C0373p) it2.next()).f2873e = false;
            }
            lVar.f2820fz.clear();
        }
        Iterator it3 = C0368l.f2486d.iterator();
        while (it3.hasNext()) {
            C0368l lVar2 = (C0368l) it3.next();
            try {
                if (lVar2.f2517I != null) {
                    for (String str : lVar2.f2517I.split(",")) {
                        String trim = str.trim();
                        AbstractC0268al a = EnumC0215ak.m3269a(trim, false);
                        if (a == null) {
                            throw new C0324at("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (a instanceof C0368l) {
                            AbstractC0789l.m670d("Replacing:" + a.mo2754i() + " with " + lVar2.mo2754i());
                        }
                        C0368l.f2488f.put(a, lVar2);
                    }
                }
            } catch (C0324at e) {
                m3136a(lVar2.mo2754i(), e, lVar2);
            }
        }
        for (EnumC0215ak akVar : EnumC0215ak.values()) {
            m3151a(akVar);
        }
        Iterator it4 = C0368l.f2486d.iterator();
        while (it4.hasNext()) {
            m3151a((AbstractC0268al) ((C0368l) it4.next()));
        }
        Iterator it5 = C0368l.f2486d.iterator();
        while (it5.hasNext()) {
            C0368l lVar3 = (C0368l) it5.next();
            Iterator it6 = lVar3.f2837fQ.iterator();
            while (it6.hasNext()) {
                if (!((C0373p) it6.next()).f2873e) {
                    String str2 = pVar.f2872d + " failed to find target:" + pVar.f2869a;
                    lVar3.m2741o(str2);
                    if (lVar3.f2518J >= 1) {
                        AbstractC0789l.m670d("Converting warning to error (meta.strictLevel=" + lVar3.f2518J + ")");
                        lVar3.m2743n(str2);
                    }
                }
            }
            if (lVar3.f2846fZ != null && lVar3.f2846fZ.size() > 0) {
                Iterator it7 = lVar3.f2846fZ.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0376s) it7.next()).m2719b(lVar3);
                    } catch (C0324at e2) {
                        m3136a(lVar3.mo2754i(), e2, lVar3);
                    }
                }
            }
        }
        Iterator it8 = C0368l.f2486d.iterator();
        while (it8.hasNext()) {
            ((C0368l) it8.next()).m2738r();
        }
        Collections.sort(C0368l.f2489g, new C0374q());
    }

    /* renamed from: a */
    public static C0368l m3139a(String str, C0657b bVar, String str2, String str3) {
        try {
            C0832j a = m3141a(str);
            if (a == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a);
            f1985a++;
            if (bVar != null) {
                f1986b++;
            }
            AbstractC0789l u = AbstractC0789l.m638u();
            String str4 = "core units";
            if (bVar != null) {
                str4 = bVar.m1388a();
            }
            u.m660g("Loading units - " + f1985a + " (" + str4 + ")");
            C0368l a2 = m3137a(str, bufferedInputStream, a.m497c(), bVar, a, str2, str3);
            try {
                bufferedInputStream.close();
                a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return a2;
        } catch (RuntimeException e2) {
            m3135a(str, e2, bVar);
            return null;
        }
    }

    /* renamed from: f */
    public static void m3115f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        ArrayList i = u.f5525bH.m1392i();
        f1992h = 0;
        f1991g = 0;
        f1994j = 0;
        f1993i = false;
        long a = C0586bj.m1919a();
        for (C0748e eVar : f1989e.values()) {
            eVar.f5251q = false;
            if (eVar.f5233a != null) {
                for (C0748e eVar2 : eVar.f5233a) {
                    eVar2.f5251q = false;
                }
            }
        }
        for (AbstractC0534i iVar : f1990f.values()) {
            iVar.f3597f = false;
        }
        byte[] bArr = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = u.f5632dF;
            u.f5633dG = bArr[1];
            byteBufferArr = new ByteBuffer[2];
            byteBufferArr[0] = ByteBuffer.allocateDirect(5000000);
            if (!AbstractC0789l.m699aj()) {
                byteBufferArr[1] = ByteBuffer.allocateDirect(5000000);
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            AbstractC0789l.m670d("Failed to reserve memory pre-mod load");
        }
        synchronized (C0368l.f2485c) {
            C0368l.f2485c.clear();
        }
        C0368l.f2486d.clear();
        C0368l.f2487e = null;
        C0368l.f2488f.clear();
        u.f5525bH.m1389l();
        f1985a = 0;
        f1986b = 0;
        m3140a("units", 1, false, (C0657b) null, "units", (String) null);
        if (!AbstractC0789l.f5467aB && !u.f5452am) {
            m3129a(m3114g(), true, (C0657b) null);
            m3129a(m3113h(), true, (C0657b) null);
            String i2 = m3112i();
            if (!C0596a.m1888d(i2)) {
                AbstractC0789l.m670d("Modded Custom '" + i2 + "' directory not found");
            }
            Iterator it = i.iterator();
            while (it.hasNext()) {
                C0657b bVar = (C0657b) it.next();
                if (!bVar.f4620j && bVar.f4616f != null) {
                    String h = bVar.m1376h();
                    AbstractC0789l.m670d("Loading mod at:" + h);
                    m3140a(h, 2, true, bVar, h, (String) null);
                }
            }
            Iterator it2 = i.iterator();
            while (it2.hasNext()) {
                C0657b bVar2 = (C0657b) it2.next();
                if (bVar2.f4620j && bVar2.f4616f != null) {
                    String g = bVar2.m1377g();
                    AbstractC0789l.m670d("Loading workshop mod at:" + g);
                    m3140a(g, 2, true, bVar2, g, (String) null);
                }
            }
        }
        m3120b(true);
        AbstractC0789l.m670d("Done loading custom units. image cacheHits:" + f1992h + " image cacheMisses:" + f1991g + " (in: " + C0586bj.m1917a(a) + "ms)");
        AbstractC0789l.m670d("========= Mods data loaded ===========");
        AbstractC0789l.m670d("Number of mods:" + i.size());
        Iterator it3 = i.iterator();
        while (it3.hasNext()) {
            ((C0657b) it3.next()).m1366r();
        }
        AbstractC0789l.m670d("================================");
        if (byteBufferArr != null) {
            byteBufferArr[0] = null;
            byteBufferArr[1] = null;
        }
        if (bArr != null) {
            bArr[1] = u.f5632dF;
            u.f5633dG = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m3129a(String str, boolean z, C0657b bVar) {
        m3140a(str, 1, z, bVar, (String) null, (String) null);
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [long] */
    /* renamed from: a */
    public static void m3140a(String str, int i, boolean z, C0657b bVar, String str2, String str3) {
        boolean z2 = z && i == 1;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (bVar != null) {
            if (!bVar.f4613c || u.f5516by.loadDisabledModData) {
                bVar.f4624n = false;
            } else {
                bVar.f4624n = true;
                return;
            }
        }
        C0596a.m1895a();
        String[] e = C0596a.m1887e(str);
        if (e == null) {
            String a = C0596a.m1895a();
            AbstractC0789l.m682b("readAllCustomUnitConfigs: ERROR");
            AbstractC0789l.m682b("readAllCustomUnitConfigs: Failed to load:" + str);
            if (bVar == null) {
                return;
            }
            if (bVar.f4625o) {
                bVar.f4637A = "Failed to list subdirectory: '" + str + "' check file permissions";
            } else if (a == null) {
                bVar.f4636z = "Failed to list directory, check file permissions";
            } else {
                bVar.f4636z = "Failed to list directory: " + a;
            }
        } else {
            if (bVar != null) {
                bVar.f4625o = true;
            }
            if (!z2) {
                for (String str4 : e) {
                    if (str4.equalsIgnoreCase("all-units.template")) {
                        str3 = str;
                    }
                }
            }
            for (String str5 : e) {
                if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt")) {
                    boolean z3 = false;
                    C0657b bVar2 = bVar;
                    if (z && i == 1 && bVar2 == null) {
                        bVar2 = u.f5525bH.m1401b(str5);
                        if (bVar2 == null) {
                            AbstractC0789l.m682b("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                            bVar2 = u.f5525bH.f4607a;
                        }
                        z3 = true;
                    }
                    if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                        String str6 = str + "/" + str5;
                        if (!(f1997m == bVar2 || bVar2 == null)) {
                            f1997m = bVar2;
                            m3153a();
                            AbstractC0789l.m670d("Loading units from mod: " + bVar2.f4611a);
                        }
                        if (str5.equalsIgnoreCase("desktop.ini")) {
                            AbstractC0789l.m670d("Skipping possible system file: " + str6);
                        } else {
                            m3139a(str6, bVar2, str2, str3);
                        }
                    } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                        String str7 = str + "/" + str5;
                        AbstractC0789l.m670d("Found map: " + str7);
                        if (bVar2 == null || !bVar2.f4623m) {
                            AbstractC0789l.m670d("Skipping map due to mod settings");
                        } else {
                            u.f5525bH.m1407a(str7, bVar2);
                        }
                    } else {
                        String str8 = str + "/" + str5;
                        if (i >= 10) {
                            AbstractC0789l.m670d("Too many levels:" + str8);
                        } else if (C0596a.m1888d(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            char c = 65535;
                            if (z3) {
                                c = C0586bj.m1919a();
                                AbstractC0789l.m670d("============");
                                AbstractC0789l.m670d(">>> Mod '" + bVar2.m1382c() + "'" + (bVar2.m1373k() ? "" : " (disabled)"));
                            }
                            m3140a(str8, i + 1, z, bVar2, str9, str3);
                            if (z3 && bVar2 != null && bVar2.m1373k()) {
                                AbstractC0789l.m670d("Mod '" + bVar2.m1382c() + "' load took:" + C0586bj.m1918a(C0586bj.m1917a((long) c)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0368l m3137a(String str, InputStream inputStream, long j, C0657b bVar, C0832j jVar, String str2, String str3) {
        boolean z;
        boolean z2;
        String str4;
        AbstractC0789l u = AbstractC0789l.m638u();
        try {
            u.f5514bw.mo133d();
            try {
                C0809ab abVar = new C0809ab(inputStream, str);
                C0368l lVar = new C0368l();
                if (abVar.m594a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                lVar.f2506x = str;
                lVar.f2507y = jVar.m496d();
                lVar.f2510B = bVar;
                lVar.f2511C = str2;
                lVar.f2512D = str3;
                f1987c = bVar;
                f1988d = false;
                if (lVar.f2510B != null) {
                }
                m3148a(lVar, abVar, abVar, str, 0);
                if (lVar.f2512D != null) {
                    m3145a(lVar, abVar, lVar.f2512D + "/all-units.template", "AUTO units.template", true);
                }
                lVar.f2518J = abVar.m580b("core", "strictLevel", (Integer) 0).intValue();
                if (lVar.f2518J < 0) {
                    throw new C0324at("[core]strictLevel cannot be < 0");
                } else if (lVar.f2518J > 1) {
                    throw new C0324at("[core]strictLevel cannot yet be > 1");
                } else {
                    lVar.f2849gc = abVar.m594a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                    abVar.m601a("core", "dont_load");
                    abVar.m579b("core", "class", "CustomUnitMetadata");
                    Iterator it = abVar.m577c("@copyFrom_skipThisSection").iterator();
                    while (it.hasNext()) {
                        abVar.m601a((String) it.next(), "@copyFrom_skipThisSection");
                    }
                    Iterator it2 = abVar.m577c("@copyFromSection").iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        m3147a(lVar, abVar, str5, str5, 0);
                    }
                    C0356a.m2965a(lVar, abVar);
                    lVar.f2513E = abVar.m568e("core", "name");
                    lVar.f2509A = abVar.m584b();
                    if (lVar.f2513E.equals("self")) {
                        throw new C0324at("Unit name: " + lVar.f2513E + " is reserved");
                    } else if (lVar.f2513E.startsWith("self.")) {
                        throw new C0324at("Unit name cannot start with self.");
                    } else {
                        String b = abVar.m579b("core", "altNames", (String) null);
                        if (b != null && !b.equalsIgnoreCase("NONE")) {
                            for (String str6 : b.split(",")) {
                                lVar.f2514F.add(str6.trim());
                            }
                        }
                        lVar.f2515G = C0364h.m2901a(abVar.m579b("core", "tags", (String) null));
                        if (lVar.f2518J >= 1 && lVar.f2515G != null) {
                            for (C0364h hVar : lVar.f2515G.f2437a) {
                                if (hVar.f2433a.contains(" ")) {
                                    throw new C0324at("(strictLevel 1) [core]tags: space in tag: '" + hVar.f2433a + "'");
                                }
                            }
                        }
                        lVar.f2517I = abVar.m579b("core", "overrideAndReplace", (String) null);
                        if (lVar.f2517I != null && lVar.f2517I.equalsIgnoreCase("NONE")) {
                            lVar.f2517I = null;
                        }
                        lVar.f2519K = (EnumC0383z) abVar.m593a("core", "onNewMapSpawn", (Enum) null, EnumC0383z.class);
                        lVar.f2556av = abVar.m592a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                        lVar.m2745m(lVar.f2507y);
                        if (lVar.f2513E.equals("missing")) {
                            if (bVar == null) {
                                AbstractC0789l.m670d("Setting missingPlaceHolder");
                                C0368l.f2484b = lVar;
                            } else {
                                AbstractC0789l.m670d("Not setting missingPlaceHolder, as we are in a mod");
                            }
                        }
                        lVar.f2554at = abVar.m579b("core", "displayLocaleKey", (String) null);
                        lVar.f2552ar = m3142a(abVar, "core", "displayText", (String) null);
                        lVar.f2553as = m3142a(abVar, "core", "displayDescription", (String) null);
                        lVar.f2761es = abVar.m594a("core", "isBio", (Boolean) false).booleanValue();
                        lVar.f2762et = abVar.m594a("core", "isBug", (Boolean) false).booleanValue();
                        lVar.f2765ew = abVar.m594a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                        lVar.f2766ex = abVar.m594a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                        lVar.f2645cg = abVar.m594a("core", "stayNeutral", (Boolean) false).booleanValue();
                        lVar.f2646ch = abVar.m594a("core", "createNeutral", (Boolean) false).booleanValue();
                        if (abVar.m594a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                            lVar.f2646ch = true;
                        }
                        lVar.f2647ci = abVar.m594a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                        lVar.f2648cj = abVar.m594a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                        lVar.f2649ck = abVar.m594a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                        if (lVar.f2649ck) {
                            lVar.f2645cg = true;
                        }
                        lVar.f2650cl = abVar.m594a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                        lVar.f2555au = abVar.m594a("core", "showInEditor", (Boolean) true).booleanValue();
                        lVar.f2520L = abVar.m580b("graphics", "total_frames", (Integer) 1).intValue();
                        if (lVar.f2520L < 1) {
                            throw new C0324at("TOTAL_FRAMES cannot be: " + lVar.f2520L + " (must be 1 or more)");
                        }
                        lVar.f2522N = abVar.m580b("graphics", "frame_width", (Integer) (-1)).intValue();
                        lVar.f2523O = abVar.m580b("graphics", "frame_height", (Integer) (-1)).intValue();
                        lVar.f2524P = abVar.m580b("graphics", "default_frame", (Integer) 0).intValue();
                        lVar.f2533Y = abVar.m580b("graphics", "image_offsetX", (Integer) 0).intValue();
                        lVar.f2534Z = abVar.m580b("graphics", "image_offsetY", (Integer) 0).intValue();
                        lVar.f2529U = EnumC0172n.pureGreen;
                        if (abVar.m594a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                            lVar.f2529U = EnumC0172n.hueAdd;
                        }
                        String b2 = abVar.m579b("graphics", "teamColoringMode", (String) null);
                        if (b2 != null) {
                            if (abVar.m594a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                                throw new C0324at("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                            } else if (b2.equalsIgnoreCase("pureGreen")) {
                                lVar.f2529U = EnumC0172n.pureGreen;
                            } else if (b2.equalsIgnoreCase("hueAdd")) {
                                lVar.f2529U = EnumC0172n.hueAdd;
                            } else if (b2.equalsIgnoreCase("hueShift")) {
                                lVar.f2529U = EnumC0172n.hueShift;
                            } else if (b2.equalsIgnoreCase("disabled")) {
                                lVar.f2529U = EnumC0172n.disabled;
                            } else {
                                throw new C0324at("Unknown teamColoringMode:" + b2);
                            }
                        }
                        lVar.f2528T = abVar.m594a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                        lVar.f2527S = abVar.m594a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                        lVar.f2525Q = abVar.m608a(lVar, "graphics", "isVisible", (LogicBoolean) null);
                        if (lVar.f2525Q == LogicBoolean.trueBoolean) {
                            lVar.f2525Q = null;
                        }
                        lVar.f2526R = abVar.m594a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                        lVar.f2530V = lVar.m2778a(str, abVar.m568e("graphics", "image"), lVar.f2528T, "graphics", "image");
                        if (lVar.f2530V == null) {
                            throw new C0324at("Main unit image must be set on custom unit");
                        }
                        lVar.f2531W = lVar.f2530V.mo349l() / lVar.f2520L;
                        lVar.f2532X = lVar.f2530V.mo350k();
                        if (lVar.f2522N > 0) {
                            lVar.f2531W = lVar.f2522N;
                        }
                        if (lVar.f2523O > 0) {
                            lVar.f2532X = lVar.f2523O;
                            if (lVar.f2532X < lVar.f2530V.mo350k()) {
                                lVar.f2521M = lVar.f2530V.mo349l() / lVar.f2531W;
                                if (lVar.f2521M < 1) {
                                    lVar.f2521M = 1;
                                }
                            }
                        }
                        lVar.f2535aa = lVar.m2784a(abVar, "graphics", "image_back");
                        lVar.f2536ab = abVar.m594a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                        lVar.f2537ac = lVar.m2784a(abVar, "graphics", "image_wreak");
                        lVar.f2538ad = lVar.m2784a(abVar, "graphics", "image_turret");
                        lVar.f2542ah = AbstractC0444j.f3186do;
                        String b3 = abVar.m579b("graphics", "image_shadow", "NONE");
                        if (b3.equalsIgnoreCase("AUTO")) {
                            String str7 = "[autoShadow:" + lVar.f2531W + "," + lVar.f2532X + "]" + lVar.f2530V.f5236b + "-" + lVar.f2530V.f5237c;
                            C0748e b4 = m3122b(str7);
                            if (b4 != null) {
                                lVar.f2539ae = b4;
                            } else {
                                lVar.f2539ae = AbstractC0210af.m3330a(lVar.f2530V, lVar.f2531W, lVar.f2532X);
                                m3143a(lVar.f2539ae);
                                if (lVar.f2539ae != null) {
                                    m3138a(str7, lVar.f2539ae);
                                }
                            }
                        } else if (b3.equalsIgnoreCase("AUTO_ANIMATED")) {
                            String str8 = "[autoShadowAnimated:" + lVar.f2531W + "," + lVar.f2532X + "]" + lVar.f2530V.f5236b + "-" + lVar.f2530V.f5237c;
                            C0748e b5 = m3122b(str8);
                            if (b5 != null) {
                                lVar.f2539ae = b5;
                            } else {
                                lVar.f2539ae = AbstractC0210af.m3330a(lVar.f2530V, lVar.f2530V.mo349l(), lVar.f2530V.mo350k());
                                m3143a(lVar.f2539ae);
                                if (lVar.f2539ae != null) {
                                    m3138a(str8, lVar.f2539ae);
                                }
                            }
                            lVar.f2540af = true;
                        } else {
                            lVar.f2539ae = lVar.m2778a(str, b3, lVar.f2528T, "graphics", "image_shadow");
                        }
                        if (abVar.m594a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                            lVar.f2540af = true;
                        }
                        lVar.f2541ag = lVar.m2785a(lVar.f2530V, lVar.f2529U);
                        lVar.f2498p = abVar.m594a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                        if (lVar.f2498p && lVar.f2538ad != null) {
                            lVar.f2543ai = lVar.m2785a(lVar.f2538ad, lVar.f2529U);
                        }
                        float floatValue = abVar.m592a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                        if (floatValue > 0.0f) {
                            lVar.f2609bw = (floatValue * lVar.f2556av) / lVar.f2531W;
                        }
                        float floatValue2 = abVar.m592a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                        if (floatValue2 != 1.0f) {
                            lVar.f2609bw *= floatValue2;
                        }
                        float floatValue3 = abVar.m592a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                        if (floatValue3 > 0.0f) {
                            float f = floatValue3 * lVar.f2556av;
                            if (lVar.f2538ad == null) {
                                throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                            }
                            lVar.f2610bx = f / lVar.f2538ad.f5245k;
                        }
                        float floatValue4 = abVar.m592a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                        if (floatValue4 != 1.0f) {
                            lVar.f2610bx *= floatValue4;
                        }
                        lVar.f2544aj = C0435c.f3135e;
                        C0748e a = lVar.m2784a(abVar, "graphics", "image_shield");
                        if (a != null) {
                            lVar.f2544aj = a;
                            lVar.f2545ak = true;
                        }
                        lVar.f2546al = lVar.m2783a(abVar, "graphics", "icon_build", false);
                        float l = lVar.f2530V.mo349l() * lVar.f2609bw;
                        float k = lVar.f2530V.mo350k() * lVar.f2609bw;
                        if (l / 2.0f > 90.0f || k / 2.0f > 90.0f) {
                            lVar.f2505w = new Rect();
                            lVar.f2505w.f227a = (int) ((-l) / 2.0f);
                            lVar.f2505w.f229c = (int) (l / 2.0f);
                            lVar.f2505w.f228b = (int) ((-k) / 2.0f);
                            lVar.f2505w.f230d = (int) (k / 2.0f);
                            lVar.f2504v = true;
                        }
                        Iterator it3 = abVar.m554l("resource_", "global_resource_").iterator();
                        while (it3.hasNext()) {
                            String str9 = (String) it3.next();
                            if (str9.startsWith("resource_")) {
                                str4 = str9.substring("resource_".length());
                                z2 = false;
                            } else {
                                str4 = str9.substring("global_resource_".length());
                                z2 = true;
                            }
                            String trim = str4.trim();
                            if (trim.contains(" ")) {
                                throw new RuntimeException("[" + str9 + "] resource codename cannot contain a space");
                            } else if (trim.contains("=") || trim.contains("|") || trim.contains(":") || trim.contains(",") || trim.contains("(") || trim.contains(")") || trim.contains("<") || trim.contains(">") || trim.contains("$")) {
                                throw new RuntimeException("[" + str9 + "] resource codename cannot contain the symbols: =|:,()<>$");
                            } else {
                                C0352b bVar2 = new C0352b(z2);
                                bVar2.m3003a(lVar, abVar, str9, trim);
                                if (lVar.m2753i(bVar2.f2360a) != null) {
                                    throw new RuntimeException("[" + str9 + "] resource with name:" + bVar2.f2360a + " already exists in this file");
                                }
                                lVar.f2491i.add(bVar2);
                            }
                        }
                        Iterator it4 = lVar.f2491i.iterator();
                        while (it4.hasNext()) {
                            ((C0352b) it4.next()).m3004a(lVar);
                        }
                        if (u.mo650k()) {
                            C0334g.m3053a(lVar, abVar);
                            C0332e.m3057a(lVar, abVar);
                        }
                        C0335h.m3041a(lVar, abVar);
                        lVar.f2628bP = abVar.m581b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                        if (lVar.f2628bP < 0.0f) {
                            throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                        } else if (lVar.f2628bP > 120.0f) {
                            throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                        } else if (abVar.m594a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() || lVar.f2628bP >= 5.0f) {
                            lVar.f2629bQ = abVar.m565f("core", "mass");
                            lVar.f2630bR = abVar.m594a("core", "availableInDemo", (Boolean) true).booleanValue();
                            lVar.f2631bS = abVar.m594a("core", "isLocked", (Boolean) false).booleanValue();
                            lVar.f2632bT = abVar.m594a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                            lVar.f2633bU = C0363g.m2930a(lVar, abVar, "core", "price", false);
                            lVar.f2634bV = C0363g.m2931a(lVar, abVar, "core", "reclaimPrice", (C0363g) null);
                            lVar.f2635bW = abVar.m571d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                            lVar.f2636bX = abVar.m580b("core", "techLevel", (Integer) 1).intValue();
                            if (lVar.f2636bX > 3) {
                                throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                            } else if (lVar.f2636bX < 1) {
                                throw new RuntimeException("techLevel cannot be less than 1, it is:" + lVar.f2636bX);
                            } else {
                                lVar.f2637bY = abVar.m594a("core", "experimental", (Boolean) false).booleanValue();
                                lVar.f2643ce = C0363g.m2930a(lVar, abVar, "core", "borrowResourcesWhileAlive", true);
                                lVar.f2638bZ = C0363g.m2930a(lVar, abVar, "core", "generation_resources", true);
                                int intValue = abVar.m580b("core", "generation_credits", (Integer) 0).intValue();
                                if (intValue != 0) {
                                    lVar.f2638bZ = C0363g.m2932a(lVar.f2638bZ, C0363g.m2941a(intValue));
                                }
                                lVar.f2641cc = abVar.m580b("core", "generation_delay", (Integer) 40).intValue();
                                if (lVar.f2641cc == 0) {
                                    lVar.f2641cc = 1;
                                }
                                if (lVar.f2641cc < 0) {
                                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                                }
                                lVar.f2642cd = 40.0f / lVar.f2641cc;
                                if (!lVar.f2638bZ.m2925b()) {
                                    lVar.f2639ca = new C0354d();
                                    lVar.f2639ca.m2991a(lVar.f2638bZ);
                                    lVar.f2639ca.m3001a(lVar.f2642cd);
                                }
                                if (!lVar.f2639ca.m2987b()) {
                                    Iterator it5 = lVar.f2639ca.f2377b.iterator();
                                    while (it5.hasNext()) {
                                        C0353c cVar = (C0353c) it5.next();
                                        if (!cVar.f2374a.m3015b() && cVar.f2374a.m3013c()) {
                                            if (lVar.f2640cb == C0354d.f2376a) {
                                                lVar.f2640cb = new C0354d();
                                            }
                                            lVar.f2640cb.m2985b(cVar.f2374a, cVar.f2375b);
                                        }
                                    }
                                }
                                lVar.f2644cf = abVar.m608a(lVar, "core", "generation_active", LogicBoolean.trueBoolean);
                                lVar.m2792a(lVar.f2638bZ);
                                lVar.f2651cm = abVar.m592a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                                lVar.f2652cn = abVar.m580b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                                lVar.f2653co = abVar.m609a(lVar, "core", "similarResourcesHaveTag", (C0365i) null);
                                lVar.f2691da = C0321aq.m3076a(lVar, abVar.m579b("core", "soundOnAttackOrder", (String) null));
                                lVar.f2692db = C0321aq.m3076a(lVar, abVar.m579b("core", "soundOnMoveOrder", (String) null));
                                lVar.f2693dc = C0321aq.m3076a(lVar, abVar.m579b("core", "soundOnNewSelection", (String) null));
                                String b6 = abVar.m579b("graphics", "drawLayer", (String) null);
                                if (b6 != null) {
                                    if (b6.equals("experimentals")) {
                                        lVar.f2654cp = 4;
                                    } else if (b6.equals("underwater")) {
                                        lVar.f2654cp = 1;
                                    } else if (b6.equals("bottom")) {
                                        lVar.f2654cp = 1;
                                    } else if (b6.equals("ground")) {
                                        lVar.f2654cp = 2;
                                    } else if (b6.equals("ground2")) {
                                        lVar.f2654cp = 3;
                                    } else if (b6.equals("air")) {
                                        lVar.f2654cp = 5;
                                    } else if (b6.equals("top")) {
                                        lVar.f2654cp = 10;
                                    } else if (b6.equals("wreaks")) {
                                        lVar.f2654cp = 0;
                                    } else {
                                        throw new RuntimeException("unknown drawLayer:" + b6);
                                    }
                                }
                                lVar.f2655cq = abVar.m592a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                                lVar.f2656cr = abVar.m592a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                                lVar.f2704dn = abVar.m594a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                                lVar.f2705do = abVar.m594a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                                lVar.f2706dp = abVar.m594a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(lVar.f2705do)).booleanValue();
                                lVar.f2707dq = abVar.m594a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                                lVar.f2709ds = abVar.m592a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                                lVar.f2710dt = C0370m.m2728a(lVar, abVar, "graphics", "animation_", false);
                                Iterator it6 = abVar.m569e("effect_").iterator();
                                while (it6.hasNext()) {
                                    String str10 = (String) it6.next();
                                    C0308ad adVar = new C0308ad(str10.substring("effect_".length()));
                                    adVar.m3106a(lVar, abVar, str10);
                                    lVar.f2834fN.add(adVar);
                                }
                                Iterator it7 = lVar.f2834fN.iterator();
                                while (it7.hasNext()) {
                                    C0308ad adVar2 = (C0308ad) it7.next();
                                    if (adVar2.alsoEmitEffects != null) {
                                        adVar2.alsoEmitEffects.m2708c();
                                    }
                                    if (adVar2.alsoEmitEffectsOnDeath != null) {
                                        adVar2.alsoEmitEffectsOnDeath.m2708c();
                                    }
                                    if (adVar2.ifSpawnFailsEmitEffects != null) {
                                        adVar2.ifSpawnFailsEmitEffects.m2708c();
                                    }
                                }
                                lVar.f2611by = abVar.m594a("graphics", "splastEffect", (Boolean) false).booleanValue();
                                lVar.f2614bB = abVar.m594a("graphics", "dustEffect", (Boolean) false).booleanValue();
                                lVar.f2612bz = abVar.m594a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                                lVar.f2615bC = abVar.m594a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                                lVar.f2613bA = lVar.f2614bB || lVar.f2611by;
                                String b7 = abVar.m579b("graphics", "movementEffect", (String) null);
                                if (b7 != null) {
                                    lVar.f2616bD = lVar.m2780a(b7, (C0381x) null);
                                    if (lVar.f2616bD != null && lVar.f2616bD.m2712a()) {
                                        lVar.f2613bA = true;
                                    }
                                }
                                String b8 = abVar.m579b("graphics", "movementEffectReverse", (String) null);
                                if (b8 != null) {
                                    lVar.f2617bE = lVar.m2780a(b8, (C0381x) null);
                                    if (lVar.f2617bE != null && lVar.f2617bE.m2712a()) {
                                        lVar.f2613bA = true;
                                    }
                                }
                                lVar.f2619bG = abVar.m592a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                                lVar.f2618bF = abVar.m594a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                                lVar.f2621bI = abVar.m592a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                                String b9 = abVar.m579b("graphics", "repairEffect", (String) null);
                                if (b9 != null) {
                                    lVar.f2622bJ = lVar.m2780a(b9, (C0381x) null);
                                    if (lVar.f2622bJ != null && lVar.f2622bJ.m2709b()) {
                                        lVar.f2620bH = true;
                                    }
                                }
                                String b10 = abVar.m579b("graphics", "repairEffectAtTarget", (String) null);
                                if (b10 != null) {
                                    lVar.f2623bK = lVar.m2780a(b10, (C0381x) null);
                                    if (lVar.f2623bK != null && lVar.f2623bK.m2709b()) {
                                        lVar.f2620bH = true;
                                    }
                                }
                                lVar.f2625bM = abVar.m592a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                                String b11 = abVar.m579b("graphics", "reclaimEffect", (String) null);
                                if (b11 != null) {
                                    lVar.f2626bN = lVar.m2780a(b11, (C0381x) null);
                                    if (lVar.f2626bN != null && lVar.f2626bN.m2709b()) {
                                        lVar.f2624bL = true;
                                    }
                                }
                                String b12 = abVar.m579b("graphics", "reclaimEffectAtTarget", (String) null);
                                if (b12 != null) {
                                    lVar.f2627bO = lVar.m2780a(b12, (C0381x) null);
                                    if (lVar.f2627bO != null && lVar.f2627bO.m2709b()) {
                                        lVar.f2624bL = true;
                                    }
                                }
                                lVar.f2695de.m2946a(lVar, abVar, "graphics", "animation_" + lVar.f2695de.f2405a + "_");
                                lVar.f2696df.m2946a(lVar, abVar, "graphics", "animation_" + lVar.f2696df.f2405a + "_");
                                lVar.f2697dg.m2946a(lVar, abVar, "graphics", "animation_" + lVar.f2697dg.f2405a + "_");
                                Iterator it8 = abVar.m569e("animation_").iterator();
                                while (it8.hasNext()) {
                                    String str11 = (String) it8.next();
                                    C0362f fVar = new C0362f(str11.substring("animation_".length()));
                                    fVar.m2946a(lVar, abVar, str11, "");
                                    lVar.f2694dd.add(fVar);
                                }
                                lVar.f2695de = lVar.m2788a(EnumC0371n.move, lVar.f2695de, true);
                                lVar.f2696df = lVar.m2788a(EnumC0371n.idle, lVar.f2696df, true);
                                lVar.f2697dg = lVar.m2788a(EnumC0371n.attack, lVar.f2697dg, true);
                                lVar.f2699di = lVar.m2789a(EnumC0371n.underConstruction);
                                lVar.f2700dj = lVar.m2789a(EnumC0371n.underConstructionWithLinkedBuiltTime);
                                if (lVar.f2699di == null || lVar.f2700dj == null) {
                                    lVar.f2698dh = lVar.m2789a(EnumC0371n.created);
                                    lVar.f2701dk = lVar.m2789a(EnumC0371n.queuedUnits);
                                    if (lVar.f2701dk != null) {
                                        lVar.f2581aU = true;
                                    }
                                    lVar.f2702dl = lVar.m2789a(EnumC0371n.repair);
                                    lVar.f2703dm = lVar.m2789a(EnumC0371n.reclaim);
                                    lVar.f2657cs = abVar.m565f("core", "maxHp");
                                    lVar.f2658ct = abVar.m580b("core", "maxShield", (Integer) 0).intValue();
                                    lVar.f2659cu = abVar.m594a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                                    lVar.f2662cx = abVar.m592a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                                    lVar.f2670cF = abVar.m594a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                                    lVar.f2671cG = abVar.m592a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                                    lVar.f2660cv = abVar.m592a("core", "armour", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2661cw = abVar.m592a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                                    lVar.f2663cy = abVar.m592a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2664cz = abVar.m594a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                                    lVar.f2665cA = abVar.m592a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2668cD = abVar.m592a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                                    lVar.f2667cC = abVar.m594a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                                    lVar.f2666cB = abVar.m592a("core", "energyRegenWhenRecharging", Float.valueOf(lVar.f2665cA)).floatValue();
                                    lVar.f2669cE = m3142a(abVar, "core", "energyDisplayName", (String) null);
                                    lVar.f2672cH = abVar.m565f("core", "radius");
                                    lVar.f2679cO = abVar.m580b("core", "displayRadius", Integer.valueOf(lVar.f2672cH)).intValue();
                                    float f2 = lVar.f2672cH;
                                    if (f2 < 6.0f) {
                                        f2 = 6.0f;
                                    }
                                    lVar.f2680cP = abVar.m592a("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                                    lVar.f2681cQ = abVar.m580b("core", "shieldRenderRadius", Integer.valueOf(lVar.f2672cH)).intValue();
                                    lVar.f2682cR = abVar.m580b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                                    lVar.f2673cI = abVar.m597a("core", "footprint", lVar.f2673cI);
                                    lVar.f2674cJ = abVar.m597a("core", "constructionFootprint", lVar.f2674cJ);
                                    lVar.f2675cK.m4135a(lVar.f2673cI);
                                    lVar.f2675cK = abVar.m597a("core", "displayFootprint", lVar.f2675cK);
                                    lVar.f2676cL = abVar.m592a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                                    lVar.f2677cM = abVar.m592a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                                    lVar.f2672cH = (int) (lVar.f2672cH * lVar.f2556av);
                                    lVar.f2679cO = (int) (lVar.f2679cO * lVar.f2556av);
                                    lVar.f2683cS = abVar.m580b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                                    lVar.f2684cT = abVar.m580b("core", "fogOfWarSightRangeWhileNotBuilt", Integer.valueOf(lVar.f2683cS)).intValue();
                                    lVar.f2685cU = abVar.m592a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2686cV = abVar.m592a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                                    lVar.f2687cW = abVar.m592a("core", "exit_dirOffset", (Float) null);
                                    lVar.f2688cX = abVar.m592a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2689cY = abVar.m594a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                                    lVar.f2690cZ = abVar.m592a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                                    lVar.f2759eq = abVar.m580b("core", "softCollisionOnAll", (Integer) 0).intValue();
                                    lVar.f2760er = abVar.m594a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                                    if (lVar.f2760er) {
                                        lVar.f2673cI.m4136a(0, 0, -1, -1);
                                    }
                                    lVar.f2767ey = abVar.m594a("core", "hideScorchMark", (Boolean) false).booleanValue();
                                    lVar.f2768ez = abVar.m594a("graphics", "disableLowHpFire", Boolean.valueOf(lVar.f2761es)).booleanValue();
                                    lVar.f2769eA = abVar.m594a("graphics", "disableLowHpSmoke", Boolean.valueOf(lVar.f2761es)).booleanValue();
                                    lVar.f2557aw = abVar.m594a("core", "isBuilding", (Boolean) false).booleanValue();
                                    lVar.f2558ax = abVar.m594a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(lVar.f2557aw)).booleanValue();
                                    lVar.f2559ay = abVar.m594a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                                    lVar.f2560az = abVar.m594a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                                    lVar.f2561aA = abVar.m592a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                                    lVar.f2562aB = abVar.m594a("core", "isUnselectable", (Boolean) false).booleanValue();
                                    lVar.f2563aC = abVar.m594a("core", "isUnselectableAsTarget", Boolean.valueOf(lVar.f2562aB)).booleanValue();
                                    lVar.f2823fC = abVar.m609a(lVar, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (C0365i) null);
                                    lVar.f2564aD = abVar.m594a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                                    lVar.f2565aE = abVar.m594a("core", "canNotBeDamaged", Boolean.valueOf(lVar.f2564aD)).booleanValue();
                                    lVar.f2566aF = abVar.m594a("core", "showOnMinimap", (Boolean) true).booleanValue();
                                    lVar.f2567aG = abVar.m594a("core", "showOnMinimapToEnemies", Boolean.valueOf(lVar.f2526R)).booleanValue();
                                    lVar.f2568aH = abVar.m609a(lVar, "core", "canOnlyBeAttackedByUnitsWithTags", (C0365i) null);
                                    if (!lVar.f2564aD || lVar.f2568aH == null) {
                                        lVar.f2569aI = abVar.m594a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                                        lVar.f2570aJ = abVar.m594a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                                        lVar.f2571aK = abVar.m594a("core", "canRepairUnits", (Boolean) false).booleanValue();
                                        lVar.f2572aL = abVar.m594a("core", "autoRepair", (Boolean) false).booleanValue();
                                        if (lVar.f2572aL) {
                                            lVar.m2794a(C0329b.f2227a);
                                        }
                                        lVar.f2573aM = abVar.m580b("core", "nanoRange", (Integer) (-1)).intValue();
                                        if (lVar.f2573aM != -1) {
                                            lVar.f2573aM = (int) (lVar.f2573aM * lVar.f2556av);
                                        }
                                        lVar.f2575aO = abVar.m594a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                                        if (lVar.f2575aO) {
                                            lVar.f2574aN = 5;
                                        }
                                        int intValue2 = abVar.m580b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                                        if (intValue2 != -1) {
                                            lVar.f2574aN = intValue2;
                                            lVar.f2574aN = (int) (lVar.f2574aN * lVar.f2556av);
                                        }
                                        lVar.f2577aQ = abVar.m594a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                                        if (lVar.f2577aQ) {
                                            lVar.f2576aP = 5;
                                        }
                                        int intValue3 = abVar.m580b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                                        if (intValue3 != -1) {
                                            lVar.f2576aP = intValue3;
                                            lVar.f2576aP = (int) (lVar.f2576aP * lVar.f2556av);
                                        }
                                        lVar.f2578aR = abVar.m592a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                                        lVar.f2579aS = abVar.m592a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                                        lVar.f2580aT = abVar.m592a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                                        lVar.f2582aV = abVar.m592a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                                        lVar.f2583aW = abVar.m571d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                                        lVar.f2584aX = abVar.m594a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                                        lVar.f2586aZ = abVar.m594a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                                        int i = 4;
                                        if (lVar.f2629bQ > 30000) {
                                            i = 8;
                                        }
                                        if (lVar.f2557aw) {
                                            i = 7;
                                        }
                                        lVar.f2592bf = abVar.m580b("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                                        lVar.f2589bc = abVar.m594a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                                        lVar.f2590bd = abVar.m592a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                                        lVar.f2591be = abVar.m592a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                                        lVar.f2593bg = abVar.m594a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                                        lVar.f2588bb = abVar.m580b("core", "fireOnDeath", (Integer) 0).intValue();
                                        lVar.f2595bi = (EnumC0519u) abVar.m593a("core", "explodeTypeOnDeath", (Enum) null, EnumC0519u.class);
                                        lVar.f2596bj = abVar.m594a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                                        lVar.f2594bh = abVar.m594a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                                        lVar.f2597bk = abVar.m594a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(abVar.m594a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                                        lVar.f2600bn = lVar.m2780a(abVar.m579b("core", "effectOnDeath", (String) null), (C0381x) null);
                                        lVar.f2599bm = lVar.m2780a(abVar.m579b("core", "effectOnDeathIfUnbuilt", (String) null), (C0381x) null);
                                        lVar.f2601bo = C0321aq.m3076a(lVar, abVar.m579b("core", "soundOnDeath", (String) null));
                                        lVar.f2598bl = lVar.m2780a(abVar.m579b("core", "effectOnDeathGroundCollision", abVar.m579b("core", "effectOnDeathGroundCollosion", (String) null)), (C0381x) null);
                                        lVar.f2604br = C0325au.m3068a(lVar, abVar, "core", "unitsSpawnedOnDeath");
                                        lVar.f2605bs = abVar.m594a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                                        lVar.f2794eZ = abVar.m594a("core", "canReclaimResources", (Boolean) false).booleanValue();
                                        lVar.f2795fa = abVar.m609a(lVar, "core", "canReclaimResourcesOnlyWithTags", (C0365i) null);
                                        lVar.f2796fb = abVar.m580b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                                        lVar.f2797fc = abVar.m609a(lVar, "core", "canReclaimUnitsOnlyWithTags", (C0365i) null);
                                        lVar.f2798fd = abVar.m609a(lVar, "core", "canRepairUnitsOnlyWithTags", (C0365i) null);
                                        if (lVar.f2797fc != null && !lVar.f2571aK && !lVar.f2570aJ) {
                                            throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                                        } else if (lVar.f2798fd == null || lVar.f2571aK || lVar.f2570aJ) {
                                            lVar.f2770eB = abVar.m580b("core", "maxTransportingUnits", (Integer) 0).intValue();
                                            if (lVar.f2770eB < 0) {
                                                throw new RuntimeException("maxTransportingUnits cannot be < 0");
                                            }
                                            lVar.f2771eC = abVar.m581b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                                            lVar.f2773eE = C0364h.m2901a(abVar.m579b("core", "transportUnitsRequireTag", (String) null));
                                            String b13 = abVar.m579b("core", "transportUnitsRequireMovementType", (String) null);
                                            if (b13 != null) {
                                                for (String str12 : b13.split(",")) {
                                                    lVar.f2774eF.add(EnumC0212ah.m3289a(str12.trim(), "transportUnitsRequireMovementType"));
                                                }
                                            }
                                            lVar.f2772eD = abVar.m594a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                                            lVar.f2775eG = abVar.m594a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(lVar.f2774eF.size() == 0)).booleanValue();
                                            lVar.f2776eH = abVar.m594a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                                            lVar.f2778eJ = abVar.m608a(lVar, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                                            lVar.f2779eK = abVar.m608a(lVar, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                                            lVar.f2780eL = abVar.m608a(lVar, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                                            lVar.f2782eN = abVar.m592a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                                            lVar.f2786eR = abVar.m608a(lVar, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                                            if (lVar.f2786eR != null) {
                                                lVar.f2787eS = lVar.f2786eR;
                                            } else {
                                                lVar.f2786eR = C0368l.f2784eP;
                                                lVar.f2787eS = C0368l.f2785eQ;
                                            }
                                            lVar.f2777eI = abVar.m594a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(lVar.f2786eR != LogicBoolean.falseBoolean)).booleanValue();
                                            lVar.f2781eM = abVar.m594a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(lVar.f2781eM)).booleanValue();
                                            lVar.f2783eO = abVar.m580b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                                            for (int i2 = -1; i2 <= 29; i2++) {
                                                String str13 = "builtFrom_" + i2 + "_";
                                                if (i2 == -1) {
                                                    str13 = "builtFrom_";
                                                }
                                                String str14 = str13 + "name";
                                                String b14 = abVar.m579b("core", str14, (String) null);
                                                if (b14 != null) {
                                                    for (String str15 : b14.split(",")) {
                                                        String trim2 = str15.trim();
                                                        if (!trim2.equals("")) {
                                                            C0373p pVar = new C0373p();
                                                            pVar.f2869a = trim2;
                                                            pVar.f2870b = abVar.m592a("core", str13 + "pos", Float.valueOf(999.0f)).floatValue();
                                                            pVar.f2871c = abVar.m594a("core", str13 + "forceNano", (Boolean) false).booleanValue();
                                                            pVar.f2872d = "[core]" + str14;
                                                            pVar.f2874f = abVar.m608a(lVar, "core", str13 + "isLocked", (LogicBoolean) null);
                                                            pVar.f2875g = m3142a(abVar, "core", str13 + "isLockedMessage", (String) null);
                                                            if (pVar.f2874f == LogicBoolean.falseBoolean) {
                                                                pVar.f2874f = null;
                                                            }
                                                            if (!"NONE".equalsIgnoreCase(trim2)) {
                                                                lVar.f2837fQ.add(pVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            for (int i3 = 0; i3 <= 50; i3++) {
                                                if (abVar.m579b("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                                                    m3123b(lVar, abVar, "core", "canBuild_" + i3 + "_", false);
                                                }
                                            }
                                            Iterator it9 = abVar.m569e("canBuild_").iterator();
                                            while (it9.hasNext()) {
                                                m3123b(lVar, abVar, (String) it9.next(), "", true);
                                            }
                                            lVar.f2789eU = C0314aj.m3098a(lVar, abVar);
                                            lVar.f2790eV = EnumC0212ah.m3289a(abVar.m568e("movement", "movementType"), "movementType");
                                            if (!lVar.f2557aw) {
                                                lVar.f2791eW = lVar.f2790eV;
                                            } else {
                                                lVar.f2791eW = EnumC0212ah.NONE;
                                            }
                                            Boolean a2 = abVar.m594a("ai", "useAsBuilder", (Boolean) null);
                                            lVar.f2802fh = abVar.m594a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                                            Boolean a3 = abVar.m594a("core", "isBuilder", (Boolean) null);
                                            if (a3 == null) {
                                                a3 = a2 == null ? false : a2;
                                            } else if (a2 == null) {
                                                a2 = a3;
                                            }
                                            if (a2 == null) {
                                                a2 = false;
                                            }
                                            lVar.f2799fe = a3.booleanValue();
                                            lVar.f2800ff = a2.booleanValue();
                                            if (lVar.f2799fe || !lVar.f2800ff) {
                                                if (lVar.f2794eZ) {
                                                    lVar.f2801fg = true;
                                                }
                                                Boolean a4 = abVar.m594a("ai", "useAsHarvester", (Boolean) null);
                                                if (a4 != null) {
                                                    lVar.f2801fg = a4.booleanValue();
                                                }
                                                Boolean a5 = abVar.m594a("ai", "useAsTransport", (Boolean) null);
                                                if (a5 == null) {
                                                    a5 = Boolean.valueOf(lVar.f2770eB > 0 && !lVar.f2800ff && !lVar.f2557aw);
                                                    if (!lVar.f2777eI) {
                                                        a5 = false;
                                                    }
                                                }
                                                lVar.f2803fi = a5.booleanValue();
                                                if (lVar.f2557aw) {
                                                    lVar.f2542ah = AbstractC0403c.f2968q;
                                                } else if (lVar.f2790eV == EnumC0212ah.AIR) {
                                                    lVar.f2542ah = AbstractC0274b.f1695n;
                                                } else if (lVar.f2790eV == EnumC0212ah.WATER) {
                                                    lVar.f2542ah = AbstractC0497f.f3369q;
                                                } else if (lVar.f2790eV == EnumC0212ah.HOVER) {
                                                    if (lVar.f2637bY) {
                                                        lVar.f2542ah = AbstractC0444j.f3187dp;
                                                    } else if (lVar.mo2748l()) {
                                                        lVar.f2542ah = C0434b.f3124h;
                                                    } else {
                                                        lVar.f2542ah = AbstractC0440h.f3171n;
                                                    }
                                                } else if (lVar.f2637bY) {
                                                    lVar.f2542ah = AbstractC0444j.f3187dp;
                                                } else if (lVar.mo2748l()) {
                                                    lVar.f2542ah = C0434b.f3124h;
                                                } else {
                                                    lVar.f2542ah = AbstractC0444j.f3186do;
                                                }
                                                C0748e a6 = lVar.m2783a(abVar, "graphics", "icon_zoomed_out", false);
                                                if (a6 != null) {
                                                    lVar.f2542ah = lVar.m2785a(a6, lVar.f2529U);
                                                }
                                                if (abVar.m594a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                                                    lVar.f2542ah = null;
                                                }
                                                lVar.f2499q = abVar.m594a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                                                lVar.f2500r = abVar.m594a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                                                lVar.f2501s = abVar.m594a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                                                lVar.f2502t = abVar.m594a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                                                lVar.f2503u = abVar.m594a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                                                lVar.f2792eX = abVar.m594a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                                                lVar.f2793eY = abVar.m594a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                                                lVar.f2716dz = abVar.m592a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * lVar.f2556av;
                                                lVar.f2717dA = abVar.m592a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * lVar.f2556av;
                                                lVar.f2718dB = abVar.m592a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * lVar.f2556av;
                                                Boolean a7 = abVar.m594a("movement", "ignoreMoveOrders", (Boolean) null);
                                                if (lVar.f2557aw) {
                                                    lVar.f2719dC = true;
                                                }
                                                if (a7 != null) {
                                                    if (a7.booleanValue()) {
                                                        lVar.f2719dC = true;
                                                        if (lVar.f2716dz > 0.0f) {
                                                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                                                        }
                                                    } else if (lVar.f2557aw) {
                                                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                                                    }
                                                }
                                                lVar.f2741dY = abVar.m592a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                                                if (lVar.f2741dY <= 0.0f) {
                                                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                                                }
                                                lVar.f2742dZ = 1.0f / lVar.f2741dY;
                                                lVar.f2743ea = abVar.m592a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                                                String b15 = abVar.m579b("movement", "landOnGround", "false");
                                                if (b15.equalsIgnoreCase("false")) {
                                                    lVar.f2720dD = false;
                                                } else if (b15.equalsIgnoreCase("onlyIdle")) {
                                                    lVar.f2720dD = true;
                                                    lVar.f2721dE = true;
                                                } else if (b15.equalsIgnoreCase("true")) {
                                                    lVar.f2720dD = true;
                                                } else {
                                                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + b15);
                                                }
                                                float f3 = 0.0f;
                                                float f4 = 0.0f;
                                                if (lVar.f2790eV == EnumC0212ah.AIR) {
                                                    f3 = 35.0f;
                                                    f4 = 1.5f;
                                                }
                                                lVar.f2722dF = abVar.m592a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                                                lVar.f2723dG = abVar.m592a("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                                                lVar.f2724dH = abVar.m592a("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                                                if (lVar.f2723dG > 80.0f) {
                                                    lVar.f2504v = true;
                                                }
                                                lVar.f2725dI = abVar.m592a("movement", "heightChangeRate", Float.valueOf(lVar.f2725dI)).floatValue();
                                                lVar.f2726dJ = abVar.m592a("movement", "fallingAcceleration", Float.valueOf(lVar.f2726dJ)).floatValue();
                                                lVar.f2727dK = abVar.m592a("movement", "fallingAccelerationDead", Float.valueOf(lVar.f2727dK)).floatValue();
                                                lVar.f2728dL = abVar.m592a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                                                lVar.f2746ed = abVar.m592a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                                                lVar.f2729dM = abVar.m594a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                                                lVar.f2730dN = abVar.m594a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                                                lVar.f2731dO = abVar.m580b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                                                lVar.f2740dX = abVar.m594a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                                                lVar.f2732dP = abVar.m592a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * lVar.f2556av;
                                                lVar.f2733dQ = abVar.m592a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                                                lVar.f2714dx = abVar.m594a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                                                String b16 = abVar.m579b("attack", "attackMovement", "normal");
                                                lVar.f2734dR = EnumC0272b.normal;
                                                if (b16.equalsIgnoreCase("normal")) {
                                                    lVar.f2734dR = EnumC0272b.normal;
                                                }
                                                if (b16.equalsIgnoreCase("strafing")) {
                                                    lVar.f2734dR = EnumC0272b.strafing;
                                                }
                                                if (b16.equalsIgnoreCase("bomber")) {
                                                    lVar.f2734dR = EnumC0272b.bomber;
                                                }
                                                lVar.f2737dU = abVar.m594a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                                                lVar.f2738dV = abVar.m594a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                                                lVar.f2739dW = abVar.m594a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                                                lVar.f2735dS = abVar.m592a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                                                lVar.f2736dT = abVar.m592a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                                                Float a8 = abVar.m592a("attack", "maxAttackRange", (Float) null);
                                                if (a8 != null) {
                                                    z = true;
                                                    lVar.f2711du = a8.floatValue() * lVar.f2556av;
                                                } else {
                                                    z = false;
                                                    lVar.f2711du = 100.0f * lVar.f2556av;
                                                }
                                                lVar.f2757eo = abVar.m592a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                                                lVar.f2715dy = abVar.m581b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                                                lVar.f2713dw = abVar.m594a("attack", "showRangeUIGuide", (Boolean) null);
                                                lVar.f2763eu = abVar.m594a("attack", "isMelee", (Boolean) false).booleanValue();
                                                lVar.f2764ev = 0.0f;
                                                Float a9 = abVar.m592a("attack", "meleeEngangementDistance", (Float) null);
                                                if (lVar.f2763eu) {
                                                    lVar.f2764ev = 250.0f;
                                                    if (a9 != null) {
                                                        lVar.f2764ev = a9.floatValue();
                                                    }
                                                } else if (a9 != null) {
                                                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                                                }
                                                Iterator it10 = abVar.m569e("projectile_").iterator();
                                                while (it10.hasNext()) {
                                                    String str16 = (String) it10.next();
                                                    String substring = str16.substring("projectile_".length());
                                                    if (lVar.m2763d(substring) != null) {
                                                        throw new RuntimeException("Two projectiles found with the same name:" + substring);
                                                    }
                                                    C0317am amVar = new C0317am();
                                                    amVar.f2083bf = substring;
                                                    amVar.f2085bh = lVar;
                                                    C0317am.m3089a(amVar, lVar, abVar, str16);
                                                }
                                                int size = lVar.f2828fH.size();
                                                if (size < 1) {
                                                    size = 1;
                                                }
                                                lVar.f2826fF = new C0317am[size];
                                                for (int i4 = 0; i4 < lVar.f2828fH.size(); i4++) {
                                                    C0317am amVar2 = (C0317am) lVar.f2828fH.get(i4);
                                                    amVar2.f2084bg = i4;
                                                    lVar.f2826fF[i4] = amVar2;
                                                }
                                                for (int i5 = 0; i5 < lVar.f2826fF.length; i5++) {
                                                    C0317am amVar3 = lVar.f2826fF[i5];
                                                    if (amVar3 != null) {
                                                        amVar3.f1055w *= lVar.f2556av;
                                                        amVar3.f1104at *= lVar.f2556av;
                                                        amVar3.f1115aE *= lVar.f2556av;
                                                    }
                                                }
                                                if (lVar.f2826fF[0] == null) {
                                                    C0317am amVar4 = new C0317am();
                                                    amVar4.f2084bg = 0;
                                                    amVar4.f2083bf = "1";
                                                    amVar4.f1034b = 10;
                                                    lVar.f2828fH.add(amVar4);
                                                    lVar.f2826fF[0] = amVar4;
                                                }
                                                ArrayList arrayList = lVar.f2827fG;
                                                Iterator it11 = abVar.m569e("turret_").iterator();
                                                while (it11.hasNext()) {
                                                    String str17 = (String) it11.next();
                                                    String substring2 = str17.substring("turret_".length());
                                                    if (lVar.m2767c(substring2) != null) {
                                                        throw new RuntimeException("Two turrets found with the same name:" + substring2);
                                                    }
                                                    C0323as asVar = new C0323as();
                                                    asVar.f2112a = substring2;
                                                    asVar.f2113b = str17;
                                                    arrayList.add(asVar);
                                                }
                                                Iterator it12 = arrayList.iterator();
                                                while (it12.hasNext()) {
                                                    C0323as asVar2 = (C0323as) it12.next();
                                                    C0323as.m3073a(asVar2, lVar, abVar, asVar2.f2113b);
                                                }
                                                if (arrayList.size() == 0) {
                                                    C0323as asVar3 = new C0323as();
                                                    asVar3.f2117f = 0.0f;
                                                    asVar3.f2118g = 0.0f;
                                                    asVar3.f2112a = "1";
                                                    asVar3.f2123l = lVar.f2715dy;
                                                    arrayList.add(asVar3);
                                                }
                                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                                    if (arrayList.get(size2) != null) {
                                                        ((C0323as) arrayList.get(size2)).f2116e = size2;
                                                    }
                                                }
                                                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                                    if (arrayList.get(size3) != null) {
                                                        C0323as asVar4 = (C0323as) arrayList.get(size3);
                                                        if (asVar4.f2135x != null) {
                                                            asVar4.f2133v = asVar4.f2135x.f2116e;
                                                            if (asVar4.f2135x.f2135x != null) {
                                                                throw new RuntimeException(asVar4.f2112a + ": Turret can not be attached to turret that is also attached to a turret");
                                                            }
                                                        }
                                                        if (asVar4.f2136y != null) {
                                                            asVar4.f2134w = asVar4.f2136y.f2116e;
                                                        }
                                                        if (asVar4.f2159V < 0.0f) {
                                                            asVar4.f2159V = asVar4.f2158U;
                                                        }
                                                    }
                                                }
                                                if (arrayList.size() > 31) {
                                                    throw new RuntimeException("Turret max count per unit is: 31");
                                                }
                                                lVar.f2825fE = (C0323as[]) arrayList.toArray(new C0323as[0]);
                                                lVar.f2712dv = lVar.f2711du;
                                                float f5 = -1.0f;
                                                boolean z3 = true;
                                                boolean z4 = false;
                                                Iterator it13 = arrayList.iterator();
                                                while (it13.hasNext()) {
                                                    C0323as asVar5 = (C0323as) it13.next();
                                                    asVar5.f2160W *= lVar.f2556av;
                                                    asVar5.f2117f *= lVar.f2556av;
                                                    asVar5.f2118g *= lVar.f2556av;
                                                    asVar5.f2161X *= lVar.f2556av;
                                                    asVar5.f2162Y *= lVar.f2556av;
                                                    boolean z5 = false;
                                                    if (asVar5.f2138A) {
                                                        if (asVar5.f2164aa >= 99999.0f) {
                                                            z3 = false;
                                                        } else {
                                                            z4 = true;
                                                            if (lVar.f2712dv > asVar5.f2164aa) {
                                                                lVar.f2712dv = asVar5.f2164aa;
                                                            }
                                                            if (f5 < asVar5.f2164aa) {
                                                                f5 = asVar5.f2164aa;
                                                            }
                                                            if (C0654f.m1459c(asVar5.f2164aa - lVar.f2711du) > 5.0f) {
                                                                boolean z6 = false;
                                                                Iterator it14 = lVar.f2496n.iterator();
                                                                while (it14.hasNext()) {
                                                                    if (C0654f.m1459c(asVar5.f2164aa - ((C0380w) it14.next()).f2889a) < 5.0f) {
                                                                        z6 = true;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    z5 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (asVar5.f2165ab != null) {
                                                        z5 = asVar5.f2165ab.booleanValue();
                                                    }
                                                    if (z5) {
                                                        C0380w wVar = new C0380w();
                                                        wVar.f2889a = asVar5.f2164aa;
                                                        lVar.f2496n.add(wVar);
                                                    }
                                                }
                                                if (z4 && z3) {
                                                    if (!z) {
                                                        lVar.f2711du = f5;
                                                    } else if (f5 < lVar.f2711du) {
                                                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                                                    }
                                                }
                                                String b17 = abVar.m579b("attack", "setMainTurretAs", (String) null);
                                                if (b17 != null) {
                                                    lVar.f2708dr = lVar.m2767c(b17);
                                                    if (lVar.f2708dr == null) {
                                                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + b17);
                                                    }
                                                } else {
                                                    lVar.f2708dr = lVar.m2767c("1");
                                                    if (lVar.f2708dr == null) {
                                                        lVar.f2708dr = lVar.f2825fE[0];
                                                    }
                                                }
                                                if (abVar.m555k("core", "action_")) {
                                                    for (int i6 = 0; i6 <= 50; i6++) {
                                                        m3146a(lVar, abVar, "core", "action_" + i6 + "_", "" + i6, false, false);
                                                    }
                                                }
                                                Iterator it15 = abVar.m569e("action_").iterator();
                                                while (it15.hasNext()) {
                                                    String str18 = (String) it15.next();
                                                    String substring3 = str18.substring("action_".length());
                                                    if (lVar.m2761e(substring3) != null) {
                                                        throw new RuntimeException("Two actions found with the same name:" + substring3);
                                                    }
                                                    m3146a(lVar, abVar, str18, "", substring3, true, false);
                                                }
                                                Iterator it16 = abVar.m569e("hiddenAction_").iterator();
                                                while (it16.hasNext()) {
                                                    String str19 = (String) it16.next();
                                                    String substring4 = str19.substring("hiddenAction_".length());
                                                    if (lVar.m2761e(substring4) != null) {
                                                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                                                    }
                                                    m3146a(lVar, abVar, str19, "", substring4, true, true);
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                ArrayList arrayList3 = new ArrayList();
                                                int i7 = 0;
                                                while (i7 <= 1) {
                                                    boolean z7 = i7 == 0;
                                                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                                                    for (int i8 = 1; i8 < 21; i8++) {
                                                        String str20 = z7 ? "leg_" + i8 : "arm_" + i8;
                                                        if (abVar.m563g(str20)) {
                                                            C0310af afVar = new C0310af();
                                                            C0310af.m3104a(afVar, lVar, abVar, str20, z7, arrayList4);
                                                            arrayList4.add(afVar);
                                                        } else {
                                                            arrayList4.add(null);
                                                        }
                                                    }
                                                    i7++;
                                                }
                                                ArrayList arrayList5 = new ArrayList();
                                                Iterator it17 = arrayList2.iterator();
                                                while (it17.hasNext()) {
                                                    C0310af afVar2 = (C0310af) it17.next();
                                                    if (afVar2 != null) {
                                                        arrayList5.add(afVar2);
                                                    }
                                                }
                                                Iterator it18 = arrayList3.iterator();
                                                while (it18.hasNext()) {
                                                    C0310af afVar3 = (C0310af) it18.next();
                                                    if (afVar3 != null) {
                                                        arrayList5.add(afVar3);
                                                    }
                                                }
                                                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                                                    ((C0310af) arrayList5.get(size4)).f2009a = size4;
                                                }
                                                lVar.f2547am = (C0310af[]) arrayList5.toArray(new C0310af[0]);
                                                if (lVar.f2547am.length > 0) {
                                                    lVar.m2794a(C0330c.f2228a);
                                                }
                                                Iterator it19 = lVar.f2694dd.iterator();
                                                while (it19.hasNext()) {
                                                    ((C0362f) it19.next()).m2947a(lVar);
                                                }
                                                m3124b(lVar);
                                                String b18 = abVar.m579b("core", "fireTurretXAtSelfOnDeath", (String) null);
                                                if (b18 != null && !"NONE".equalsIgnoreCase(b18)) {
                                                    C0323as c = lVar.m2767c(b18);
                                                    if (c == null) {
                                                        throw new RuntimeException("Cannot find turret:" + b18 + " for [core]fireTurretXAtSelfOnDeath");
                                                    }
                                                    lVar.f2603bq = c.f2116e;
                                                }
                                                lVar.f2585aY = abVar.m594a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                                                lVar.f2587ba = abVar.m594a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                                                lVar.f2747ee = abVar.m572d("attack", "canAttack");
                                                if (lVar.f2747ee) {
                                                    lVar.f2748ef = abVar.m611a(lVar, "attack", "canAttackFlyingUnits");
                                                    lVar.f2749eg = abVar.m611a(lVar, "attack", "canAttackLandUnits");
                                                    lVar.f2750eh = abVar.m611a(lVar, "attack", "canAttackUnderwaterUnits");
                                                } else {
                                                    lVar.f2748ef = abVar.m608a(lVar, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                                                    lVar.f2749eg = abVar.m608a(lVar, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                                                    lVar.f2750eh = abVar.m608a(lVar, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                                                }
                                                lVar.f2751ei = abVar.m608a(lVar, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                                                if (LogicBoolean.isStaticTrue(lVar.f2751ei)) {
                                                    lVar.f2751ei = null;
                                                }
                                                lVar.f2753ek = abVar.m609a(lVar, "attack", "canOnlyAttackUnitsWithTags", (C0365i) null);
                                                lVar.f2754el = abVar.m609a(lVar, "attack", "canOnlyAttackUnitsWithoutTags", (C0365i) null);
                                                if (!(lVar.f2753ek == null && lVar.f2754el == null)) {
                                                    lVar.f2752ej = true;
                                                }
                                                boolean z8 = false;
                                                boolean z9 = false;
                                                Iterator it20 = arrayList.iterator();
                                                while (it20.hasNext()) {
                                                    C0323as asVar6 = (C0323as) it20.next();
                                                    if (asVar6.f2151N != null && asVar6.f2151N.m2895a(lVar.f2753ek)) {
                                                        asVar6.f2151N = null;
                                                    }
                                                    if (asVar6.f2152O != null && asVar6.f2152O.m2895a(lVar.f2754el)) {
                                                        asVar6.f2152O = null;
                                                    }
                                                    if (asVar6.f2138A) {
                                                        if (asVar6.f2151N == null && asVar6.f2152O == null) {
                                                            z9 = true;
                                                        } else {
                                                            z8 = true;
                                                        }
                                                    }
                                                }
                                                if (z8 && !z9) {
                                                    lVar.f2755em = true;
                                                    lVar.f2752ej = true;
                                                }
                                                lVar.f2756en = abVar.m594a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                                                lVar.f2821fA = abVar.m594a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                                                lVar.f2822fB = abVar.m594a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                                                if (!lVar.f2747ee || !lVar.f2822fB) {
                                                    lVar.f2805fk = abVar.m594a("ai", "disableUse", (Boolean) false).booleanValue();
                                                    lVar.f2808fn = abVar.m592a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                                                    lVar.f2809fo = abVar.m580b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                                                    lVar.f2810fp = abVar.m592a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                                                    lVar.f2807fm = abVar.m580b("ai", "maxEachBase", Integer.valueOf(C0654f.m1472b(2, lVar.f2809fo))).intValue();
                                                    lVar.f2806fl = abVar.m580b("ai", "maxGlobal", (Integer) (-1)).intValue();
                                                    if (lVar.f2807fm < lVar.f2809fo) {
                                                        throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                                                    }
                                                    if (!lVar.f2557aw) {
                                                        if (abVar.m553m("ai", "recommendedInEachBaseNum")) {
                                                            throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                                                        } else if (abVar.m553m("ai", "recommendedInEachBasePriorityIfUnmet")) {
                                                            throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                                                        }
                                                    }
                                                    lVar.f2813fs = abVar.m580b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                                                    lVar.f2814ft = abVar.m580b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                                                    lVar.f2815fu = abVar.m594a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                                                    lVar.f2816fv = abVar.m609a(lVar, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (C0365i) null);
                                                    lVar.f2811fq = abVar.m592a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                                                    lVar.f2811fq = abVar.m592a("ai", "noneInBaseExtraPriority", Float.valueOf(lVar.f2811fq)).floatValue();
                                                    lVar.f2812fr = abVar.m592a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                                                    lVar.f2812fr = abVar.m592a("ai", "noneGlobalExtraPriority", Float.valueOf(lVar.f2812fr)).floatValue();
                                                    lVar.f2817fw = abVar.m579b("ai", "upgradedFrom", (String) null);
                                                    Float a10 = abVar.m592a("ai", "ai_upgradePriority", (Float) null);
                                                    if (!(a10 == null || a10.floatValue() == -1.0f)) {
                                                        if (a10.floatValue() < 0.0f || a10.floatValue() > 1.0f) {
                                                            throw new RuntimeException("[ai]ai_upgradePriority: " + lVar.f2819fy + " must be between 0-1 or -1 for default");
                                                        }
                                                        lVar.f2819fy = a10.floatValue() * 100.0f;
                                                    }
                                                    if (lVar.f2747ee) {
                                                        for (int i9 = 0; i9 < lVar.f2825fE.length; i9++) {
                                                            C0323as asVar7 = lVar.f2825fE[i9];
                                                            if (asVar7.f2138A && asVar7.f2177an == null) {
                                                                if (asVar7.f2123l > 140.0f && (lVar.f2744eb == -1 || lVar.f2825fE[lVar.f2744eb].f2123l < asVar7.f2123l)) {
                                                                    lVar.f2744eb = i9;
                                                                }
                                                                if (asVar7.f2124m > 80.0f) {
                                                                    lVar.f2745ec = i9;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (lVar.f2654cp == -2) {
                                                        if (lVar.f2790eV == EnumC0212ah.AIR) {
                                                            lVar.f2654cp = 5;
                                                        } else if (lVar.mo2752j()) {
                                                            if (lVar.f2535aa != null) {
                                                                lVar.f2654cp = 3;
                                                            } else {
                                                                lVar.f2654cp = 2;
                                                            }
                                                        } else if (lVar.f2723dG < -2.0f) {
                                                            lVar.f2654cp = 1;
                                                        } else if (lVar.f2770eB > 0) {
                                                            lVar.f2654cp = 3;
                                                        } else {
                                                            lVar.f2654cp = 2;
                                                        }
                                                    }
                                                    if (lVar.f2831fK.size() > 0) {
                                                        lVar.f2832fL = (C0375r[]) lVar.f2831fK.toArray(new C0375r[0]);
                                                    }
                                                    if (lVar.f2846fZ != null && lVar.f2846fZ.size() > 0) {
                                                        Iterator it21 = lVar.f2846fZ.iterator();
                                                        while (it21.hasNext()) {
                                                            ((C0376s) it21.next()).m2720a(lVar);
                                                        }
                                                    }
                                                    abVar.m612a();
                                                    Iterator it22 = abVar.f5723d.iterator();
                                                    while (it22.hasNext()) {
                                                        C0810ac acVar = (C0810ac) it22.next();
                                                        if (acVar.m552a() == null || (!acVar.m552a().startsWith("hiddenAction_") && !acVar.m552a().startsWith("canBuild_"))) {
                                                            String str21 = "Repeated key " + acVar;
                                                            lVar.m2741o(str21);
                                                            if (lVar.f2518J >= 1) {
                                                                AbstractC0789l.m670d("Converting warning to error (meta.strictLevel=" + lVar.f2518J + ")");
                                                                throw new C0324at(str21);
                                                            }
                                                        } else {
                                                            throw new RuntimeException("Error [" + acVar.m552a() + "]" + acVar.m551b() + " has been repeated");
                                                        }
                                                    }
                                                    Iterator it23 = abVar.f5724e.iterator();
                                                    while (it23.hasNext()) {
                                                        String str22 = "Skipping line, unexpected format: '" + ((String) it23.next()) + "'";
                                                        lVar.m2741o(str22);
                                                        if (lVar.f2518J >= 1) {
                                                            AbstractC0789l.m670d("Converting warning to error (meta.strictLevel=" + lVar.f2518J + ")");
                                                            throw new C0324at(str22);
                                                        }
                                                    }
                                                    if (bVar != null) {
                                                        bVar.f4626p++;
                                                    }
                                                    synchronized (C0368l.f2485c) {
                                                        C0368l.f2485c.add(lVar);
                                                    }
                                                    return lVar;
                                                }
                                                throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                                            }
                                            throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + lVar.f2800ff + " [core]isBuilder:" + lVar.f2799fe);
                                        } else {
                                            throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                                        }
                                    } else {
                                        throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                                    }
                                } else {
                                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                                }
                            }
                        } else {
                            throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0324at e2) {
            m3135a(str, e2, bVar);
            return null;
        } catch (OutOfMemoryError e3) {
            f1994j++;
            m3135a(str, new RuntimeException(e3), bVar);
            return null;
        } catch (RuntimeException e4) {
            m3135a(str, e4, bVar);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3136a(String str, Exception exc, AbstractC0268al alVar) {
        C0657b bVar = null;
        if (alVar instanceof C0368l) {
            bVar = ((C0368l) alVar).f2510B;
        }
        m3135a(str, exc, bVar);
    }

    /* renamed from: a */
    public static void m3135a(String str, Exception exc, C0657b bVar) {
        String str2;
        String str3;
        AbstractC0789l.m638u();
        AbstractC0789l.m682b("Error while loading unit:" + str);
        exc.printStackTrace();
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0324at) {
            str2 = exc.getMessage();
        } else {
            str2 = C0654f.m1466b(exc);
        }
        String replace = str2.replace(str + ": ", "").replace(str, "");
        if (bVar != null) {
            String str4 = bVar.f4616f;
            AbstractC0789l.m670d("baseUnitPath:" + str4);
            AbstractC0789l.m670d("customUnit:" + str);
            if (str.startsWith(str4)) {
                str = str.substring(str4.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + bVar.m1388a() + ")";
        }
        if (bVar != null) {
            str3 = "Error loading unit: " + str + ": \n" + replace;
        } else if (replace.contains("Error loading core unit")) {
            str3 = replace;
        } else {
            str3 = "Error loading core unit: " + str + ": \n" + replace + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof C0324at) {
            C0324at atVar = (C0324at) exc;
            if (!(atVar.f2200b == null && atVar.f2201c == null)) {
                str3 = str3 + " (section:" + atVar.f2200b + ", key:" + atVar.f2201c + ")";
            }
        }
        boolean z = false;
        if (bVar != null) {
            z = bVar.f4613c;
        }
        if (!z) {
        }
        if (f1998n != null) {
            f1998n = str3;
        }
        if (bVar != null) {
            bVar.m1386a(str3);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str3, exc);
        }
    }

    /* renamed from: b */
    public static void m3123b(C0368l lVar, C0809ab abVar, String str, String str2, boolean z) {
        String b = abVar.m579b(str, str2 + "name", (String) null);
        if (b != null) {
            for (String str3 : b.split(",")) {
                String trim = str3.trim();
                C0301c cVar = new C0301c();
                cVar.f1881j = trim;
                cVar.f1884m = abVar.m594a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
                cVar.f1885n = abVar.m592a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
                cVar.f1949az = abVar.m580b(str, str2 + "tech", (Integer) 1).intValue();
                cVar.f1950aA = abVar.m594a(str, str2 + "forceNano", (Boolean) false).booleanValue();
                cVar.f1951aB = abVar.m579b(str, str2 + "type", (String) null);
                cVar.f1886o = C0363g.m2931a(lVar, abVar, str, str2 + "price", (C0363g) null);
                cVar.f1945av = abVar.m608a(lVar, str, str2 + "isGuiBlinking", (LogicBoolean) null);
                cVar.f1889r = abVar.m608a(lVar, str, str2 + "isVisible", (LogicBoolean) null);
                cVar.f1892u = abVar.m608a(lVar, str, str2 + "isLocked", (LogicBoolean) null);
                cVar.f1893v = m3142a(abVar, str, str2 + "isLockedMessage", (String) null);
                if (cVar.f1892u == LogicBoolean.falseBoolean) {
                    cVar.f1892u = null;
                }
                cVar.f1894w = abVar.m608a(lVar, str, str2 + "isLockedAlt", (LogicBoolean) null);
                cVar.f1895x = m3142a(abVar, str, str2 + "isLockedAltMessage", (String) null);
                if (cVar.f1894w == LogicBoolean.falseBoolean) {
                    cVar.f1894w = null;
                }
                cVar.f1896y = abVar.m608a(lVar, str, str2 + "isLockedAlt2", (LogicBoolean) null);
                cVar.f1897z = m3142a(abVar, str, str2 + "isLockedAlt2Message", (String) null);
                if (cVar.f1896y == LogicBoolean.falseBoolean) {
                    cVar.f1896y = null;
                }
                C0363g a = C0363g.m2930a(lVar, abVar, str, str2 + "addResources", true);
                if (a != null && a.m2918c()) {
                    cVar.f1922Y = a;
                }
                cVar.f1952aC = EnumC0303e.build;
                if (!"NONE".equalsIgnoreCase(trim)) {
                    lVar.f2838fR.add(cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3146a(C0368l lVar, C0809ab abVar, String str, String str2, String str3, boolean z, boolean z2) {
        C0301c cVar = new C0301c();
        String b = abVar.m579b(str, str2 + "convertTo", (String) null);
        String b2 = abVar.m579b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        Float a = abVar.m592a(str, str2 + "addEnergy", (Float) null);
        C0363g a2 = C0363g.m2930a(lVar, abVar, str, str2 + "addResources", true);
        lVar.m2792a(a2);
        C0363g a3 = C0363g.m2930a(lVar, abVar, str, str2 + "addResourcesScaledByAIHandicaps", true);
        lVar.m2792a(a3);
        String b3 = abVar.m579b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean a4 = abVar.m608a(lVar, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String b4 = abVar.m579b(str, str2 + "alsoTriggerAction", (String) null);
        String b5 = abVar.m579b(str, str2 + "alsoQueueAction", (String) null);
        String b6 = abVar.m579b(str, str2 + "spawnEffects", (String) null);
        String b7 = abVar.m579b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String b8 = abVar.m579b(str, str2 + "playSoundAtUnit", (String) null);
        String b9 = abVar.m579b(str, str2 + "playSoundGlobally", (String) null);
        String b10 = abVar.m579b(str, str2 + "playSoundToPlayer", (String) null);
        String b11 = abVar.m579b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0299m.m3193a(lVar, abVar, str, str2, cVar, str3, z);
        C0291e.m3203a(lVar, abVar, str, str2, cVar, str3, z);
        C0287a.m3207a(lVar, abVar, str, str2, cVar, str3, z);
        C0295i.m3197a(lVar, abVar, str, str2, cVar, str3, z);
        C0288b.m3205a(lVar, abVar, str, str2, cVar, str3, z);
        C0290d.m3204a(lVar, abVar, str, str2, cVar, str3, z);
        C0296j.m3196a(lVar, abVar, str, str2, cVar, str3, z);
        C0293g.m3199a(lVar, abVar, str, str2, cVar, str3, z);
        C0297k.m3195a(lVar, abVar, str, str2, cVar, str3, z);
        C0292f.m3201a(lVar, abVar, str, str2, cVar, str3, z);
        C0294h.m3198a(lVar, abVar, str, str2, cVar, str3, z);
        LogicBoolean a5 = abVar.m608a(lVar, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            if (!(b == null && b2 == null && a == null && b3 == null)) {
                z3 = true;
            }
            if (a2.m2918c() || a3.m2918c()) {
                z3 = true;
            }
            if (!(b4 == null && b5 == null && b6 == null)) {
                z3 = true;
            }
            if (!(b8 == null && b9 == null && b10 == null && b11 == null)) {
                z3 = true;
            }
            if (cVar.f1920W.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(b)) {
                b = null;
            }
            if ("NONE".equalsIgnoreCase(b2)) {
                b2 = null;
            }
            if (b3 != null && b3.equalsIgnoreCase("NONE")) {
                b3 = null;
            }
            cVar.f1872a = lVar.f2838fR.size();
            cVar.f1873b = str3;
            cVar.f1884m = abVar.m594a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            cVar.f1885n = abVar.m592a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            cVar.f1886o = C0363g.m2930a(lVar, abVar, str, str2 + "price", true);
            lVar.m2792a(cVar.f1886o);
            cVar.f1903F = abVar.m594a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            cVar.f1904G = abVar.m594a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            cVar.f1905H = abVar.m594a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            cVar.f1907J = abVar.m594a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            cVar.f1906I = abVar.m594a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!cVar.f1905H && !cVar.f1906I && cVar.f1907J) {
                cVar.f1908K = true;
            }
            if (!cVar.f1905H) {
                cVar.f1880i = EnumC0199u.none;
            } else {
                cVar.f1880i = EnumC0199u.popupQueue;
            }
            cVar.f1887p = abVar.m608a(lVar, str, str2 + "requireConditional", (LogicBoolean) null);
            cVar.f1888q = abVar.m608a(lVar, str, str2 + "isActive", (LogicBoolean) null);
            cVar.f1889r = abVar.m608a(lVar, str, str2 + "isVisible", (LogicBoolean) null);
            cVar.f1891t = abVar.m594a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            cVar.f1890s = abVar.m594a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(cVar.f1891t)).booleanValue();
            if (z2) {
                if (cVar.f1889r == null || LogicBoolean.isStaticFalse(cVar.f1889r)) {
                    cVar.f1889r = LogicBoolean.falseBoolean;
                } else {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
            }
            cVar.f1892u = abVar.m608a(lVar, str, str2 + "isLocked", (LogicBoolean) null);
            cVar.f1893v = m3142a(abVar, str, str2 + "isLockedMessage", (String) null);
            if (cVar.f1892u == LogicBoolean.falseBoolean) {
                cVar.f1892u = null;
            }
            cVar.f1894w = abVar.m608a(lVar, str, str2 + "isLockedAlt", (LogicBoolean) null);
            cVar.f1895x = m3142a(abVar, str, str2 + "isLockedAltMessage", (String) null);
            if (cVar.f1894w == LogicBoolean.falseBoolean) {
                cVar.f1894w = null;
            }
            cVar.f1896y = abVar.m608a(lVar, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            cVar.f1897z = m3142a(abVar, str, str2 + "isLockedAlt2Message", (String) null);
            if (cVar.f1896y == LogicBoolean.falseBoolean) {
                cVar.f1896y = null;
            }
            cVar.f1898A = LogicBoolean.create(lVar, abVar.m579b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (cVar.f1898A == LogicBoolean.falseBoolean) {
                cVar.f1898A = null;
            }
            if (cVar.f1898A != null) {
                lVar.f2818fx = true;
            }
            cVar.f1899B = abVar.m608a(lVar, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            cVar.f1902E = lVar.m2779a(abVar.m579b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (cVar.f1902E != null) {
                cVar.f1880i = EnumC0199u.placeBuilding;
                if (b != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            cVar.f1901D = lVar.m2779a(abVar.m579b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            cVar.f1945av = abVar.m608a(lVar, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            cVar.f1938ao = m3130a(lVar.f2506x, abVar.m579b(str, str2 + "iconImage", "NONE"), lVar.f2528T, lVar, str, str2 + "iconImage");
            cVar.f1941ar = abVar.m608a(lVar, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (cVar.f1941ar == LogicBoolean.trueBoolean) {
                cVar.f1941ar = null;
            }
            cVar.f1939ap = lVar.m2784a(abVar, str, str2 + "iconExtraImage");
            cVar.f1940aq = abVar.m590a(str, str2 + "iconExtraColor", Integer.valueOf(Color.m4213a(100, 255, 255, 255))).intValue();
            cVar.f1942as = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "unitShownInUI", null);
            if (cVar.f1942as == null || cVar.f1938ao == null) {
                cVar.f1943at = abVar.m594a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
                cVar.f1944au = abVar.m594a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
                cVar.f1946aw = (EnumC0198t) abVar.m593a(str, str2 + "displayType", cVar.f1946aw, EnumC0198t.class);
                cVar.f1948ay = abVar.m594a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
                cVar.f1874c = m3142a(abVar, str, str2 + "text", "");
                cVar.f1875d = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "textAddUnitName", null);
                cVar.f1878g = m3142a(abVar, str, str2 + "textPostFix", (String) null);
                cVar.f1876e = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "descriptionAddFromUnit", null);
                cVar.f1877f = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "descriptionAddUnitStats", null);
                cVar.f1879h = m3142a(abVar, str, str2 + "description", "");
                cVar.f1910M = abVar.m571d(str, str2 + "buildSpeed", Float.valueOf(cVar.f1910M)).floatValue();
                if (cVar.f1910M == 0.0f) {
                    cVar.f1910M = 50.0f;
                }
                cVar.f1911N = abVar.m594a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(cVar.f1911N)).booleanValue();
                boolean z4 = false;
                cVar.f1912O = abVar.m594a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(cVar.f1912O)).booleanValue();
                cVar.f1913P = lVar.m2781a(abVar.m579b(str, str2 + "whenBuilding_playAnimation", (String) null), cVar.f1913P);
                cVar.f1914Q = abVar.m592a(str, str2 + "whenBuilding_rotateTo", cVar.f1914Q);
                cVar.f1915R = abVar.m594a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(cVar.f1915R)).booleanValue();
                cVar.f1916S = abVar.m594a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(cVar.f1916S)).booleanValue();
                cVar.f1917T = abVar.m594a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(cVar.f1917T)).booleanValue();
                String b12 = abVar.m579b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
                if (b12 != null) {
                    cVar.f1918U = lVar.m2767c(b12);
                    if (cVar.f1918U == null) {
                        throw new RuntimeException("Cannot find turret:" + b12 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                    } else if (cVar.f1915R) {
                        throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                    }
                }
                if (cVar.f1917T && cVar.f1914Q == null) {
                    cVar.f1914Q = Float.valueOf(0.0f);
                }
                cVar.f1919V = abVar.m607a(lVar, str, str2 + "whenBuilding_triggerAction", (C0376s) null);
                cVar.f1909L = abVar.m594a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(cVar.f1909L)).booleanValue();
                if (b2 != null && !"NONE".equalsIgnoreCase(b2)) {
                    cVar.f1882k = lVar.m2779a(b2, str2 + "whenBuilding_temporarilyConvertTo", str);
                    z4 = true;
                }
                if (!(!cVar.f1912O && cVar.f1913P == null && cVar.f1914Q == null && cVar.f1882k == null && cVar.f1919V == null)) {
                    lVar.f2581aU = true;
                }
                cVar.f1952aC = EnumC0303e.convert;
                if (b != null && !"NONE".equalsIgnoreCase(b)) {
                    cVar.f1900C = lVar.m2779a(b, str2 + "convertTo", str);
                    cVar.f1881j = b;
                    cVar.f1906I = false;
                    z4 = true;
                }
                if (a != null) {
                    cVar.f1921X = a;
                    z4 = true;
                }
                if (a2 != null && a2.m2918c()) {
                    cVar.f1922Y = a2;
                    z4 = true;
                }
                if (a3 != null && a3.m2918c()) {
                    cVar.f1923Z = a3;
                    z4 = true;
                }
                cVar.f1925ab = abVar.m598a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
                cVar.f1927ad = abVar.m580b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
                String b13 = abVar.m579b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
                if (b13 != null) {
                    cVar.f1926ac = lVar.m2763d(b13);
                    if (cVar.f1926ac == null) {
                        throw new RuntimeException("Cannot find projectile:" + b13 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                    }
                }
                String b14 = abVar.m579b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
                if (b14 != null) {
                    cVar.f1928ae = EnumC0212ah.m3289a(b14, str2 + "fireTurretXAtGround_overPassableTileOf");
                }
                if (b3 != null) {
                    C0323as c = lVar.m2767c(b3);
                    if (c == null) {
                        throw new RuntimeException("Cannot find turret:" + b3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                    }
                    cVar.f1924aa = Integer.valueOf(c.f2116e);
                    if (cVar.f1925ab == null) {
                        cVar.f1880i = EnumC0199u.targetGround;
                        if (cVar.f1902E != null) {
                            throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                        }
                    }
                    z4 = true;
                }
                cVar.f1929af = a4;
                if (b4 != null && !"NONE".equalsIgnoreCase(b4)) {
                    cVar.f1930ag = lVar.m2766c(b4, "alsoTriggerAction", str);
                    z4 = true;
                }
                if (b5 != null && !"NONE".equalsIgnoreCase(b5)) {
                    cVar.f1931ah = lVar.m2766c(b5, "alsoQueueAction", str);
                    z4 = true;
                }
                if (b6 != null) {
                    cVar.f1932ai = lVar.m2780a(b6, (C0381x) null);
                    z4 = true;
                }
                if (b7 != null) {
                    cVar.f1933aj = lVar.m2780a(b7, (C0381x) null);
                    z4 = true;
                }
                if (b8 != null) {
                    cVar.f1934ak = C0321aq.m3076a(lVar, b8);
                    z4 = true;
                }
                if (b9 != null) {
                    cVar.f1935al = C0321aq.m3076a(lVar, b9);
                    z4 = true;
                }
                if (b10 != null) {
                    cVar.f1936am = C0321aq.m3076a(lVar, b10);
                    z4 = true;
                }
                if (b11 != null) {
                    cVar.f1937an = C0321aq.m3076a(lVar, b11);
                    z4 = true;
                }
                if (a5 != null) {
                    cVar.f1947ax = a5;
                    z4 = true;
                }
                if (cVar.f1920W.size() > 0) {
                    z4 = true;
                }
                EnumC0306ab abVar2 = (EnumC0306ab) abVar.m593a(str, str2 + "autoTriggerOnEvent", (Enum) null, EnumC0306ab.class);
                LogicBoolean a6 = abVar.m608a(lVar, str, str2 + "autoTrigger", (LogicBoolean) null);
                cVar.f1883l = z4;
                if (z4 || cVar.f1889r != null) {
                    if (a6 != null && z4) {
                        C0375r rVar = new C0375r();
                        rVar.f2876a = a6;
                        rVar.f2877b = new C0304f(cVar, lVar.m2779a(cVar.f1881j, "[" + str + "]" + str2, str));
                        lVar.f2831fK.add(rVar);
                    }
                    if (abVar2 != null && z4) {
                        C0305aa aaVar = new C0305aa();
                        aaVar.f1967a = abVar2;
                        aaVar.f1968b = new C0304f(cVar, lVar.m2779a(cVar.f1881j, "[" + str + "]" + str2, str));
                        aaVar.f1969c = lVar;
                        lVar.f2847ga.add(aaVar);
                    }
                    if (!(cVar.f1881j == null || cVar.f1886o == null || cVar.f1886o.f2423b <= 0)) {
                        lVar.f2839fS = true;
                    }
                    lVar.f2838fR.add(cVar);
                    return;
                }
                return;
            }
            throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
        }
    }

    /* renamed from: a */
    public static C0748e m3130a(String str, String str2, boolean z, C0368l lVar, String str3, String str4) {
        try {
            return m3131a(str, str2, z, lVar);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static C0748e m3131a(String str, String str2, boolean z, C0368l lVar) {
        C0748e eVar;
        if (str2 == null || str2.equalsIgnoreCase("NONE") || str2.equals("")) {
            return null;
        }
        boolean z2 = false;
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (lVar.f2510B == null) {
                str = "units/common.ini";
            } else {
                str = lVar.f2510B.f4616f + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        String str3 = C0654f.m1423h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        C0748e b = m3122b(str4);
        if (b != null) {
            return b;
        }
        C0832j b2 = m3121b(str3, str2, lVar);
        int i = 0;
        if (f1987c != null) {
            i = f1987c.f4630t;
        }
        if (i > 5) {
            AbstractC0789l.m670d("Fast failing to oom image for this mod");
            eVar = u.f5514bw.mo120o();
        } else {
            try {
                eVar = u.f5514bw.mo160a((InputStream) b2, true);
                if (eVar.mo345y()) {
                    AbstractC0789l.m670d("oomErrors:" + f1994j);
                    f1994j++;
                    if (f1987c != null) {
                        f1987c.f4630t++;
                    }
                }
            } catch (RuntimeException e) {
                AbstractC0789l.m670d("imageStream:" + b2);
                throw new RuntimeException("Error decode image from: " + C0596a.m1889c(str3 + str2), e);
            }
        }
        try {
            b2.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (eVar == null) {
            throw new RuntimeException("Failed to decode image: " + C0596a.m1889c(str3 + str2));
        }
        eVar.mo354a(z);
        if (z2) {
            eVar = AbstractC0210af.m3330a(eVar, eVar.f5245k, eVar.f5246l);
        }
        m3143a(eVar);
        m3138a(str4, eVar);
        return eVar;
    }

    /* renamed from: a */
    public static void m3138a(String str, C0748e eVar) {
        f1989e.put(str, eVar);
    }

    /* renamed from: b */
    public static C0748e m3122b(String str) {
        C0748e eVar = (C0748e) f1989e.get(str);
        if (eVar != null) {
            f1992h++;
            m3143a(eVar);
            eVar.mo43s();
            return eVar;
        }
        if (f1993i) {
            AbstractC0789l.m670d("loadImageInConf: cache miss: " + str);
        }
        f1991g++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0534i m3133a(String str, String str2, C0368l lVar) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!str2.contains(".")) {
            return u.f5512bu.m2113a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (lVar.f2510B == null) {
                str = "units/common.ini";
            } else {
                str = lVar.f2510B.f4616f + "/common.ini";
            }
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        String str3 = C0654f.m1423h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0534i iVar = (AbstractC0534i) f1990f.get(str4);
        if (iVar != null) {
            m3144a(iVar);
            return iVar;
        } else if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg") || str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            C0832j b = m3121b(str3, str2, lVar);
            AbstractC0534i a = u.f5512bu.m2112a(str2, b, false);
            try {
                b.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                throw new RuntimeException(str5);
            }
            m3144a(a);
            f1990f.put(str4, a);
            return a;
        } else {
            throw new RuntimeException("Failed to open sound: " + str3 + "" + str2 + " only the ogg & wav sound formats are supported.");
        }
    }

    /* renamed from: a */
    public static boolean m3132a(String str, String str2, String str3, C0657b bVar) {
        if (str2 == null || !str2.contains("..") || AbstractC0789l.m699aj()) {
            return true;
        }
        String canonicalPath = new File(C0596a.m1889c(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0596a.m1889c("units")).getCanonicalPath())) {
            return true;
        }
        String i = bVar.m1375i();
        boolean startsWith = canonicalPath.startsWith(i);
        if (!startsWith) {
            AbstractC0789l.m682b("File: '" + canonicalPath + "' is not within mod: '" + i + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m3134a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        while (true) {
            if (!str2.startsWith("/") && !str2.startsWith("\\")) {
                return str + str2;
            }
            str2 = str2.substring(1);
        }
    }

    /* renamed from: b */
    public static C0832j m3121b(String str, String str2, C0368l lVar) {
        String a = m3134a(str, str2);
        C0657b bVar = null;
        if (lVar != null) {
            bVar = lVar.f2510B;
        } else {
            AbstractC0789l.m663f("findAssetSteam meta==null");
        }
        if (bVar != null) {
            try {
                if (!m3132a(str, str2, a, bVar)) {
                    throw new RuntimeException("File is outside mod: " + a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C0832j h = C0596a.m1884h(a);
        if (h != null) {
            return h;
        }
        AbstractC0789l.m670d("Orginal path: " + a);
        throw new RuntimeException("IO Error: Failed to open: " + C0596a.m1889c(a));
    }

    /* renamed from: b */
    public static void m3124b(C0368l lVar) {
        C0310af[] afVarArr = lVar.f2547am;
        for (C0310af afVar : afVarArr) {
            float f = -1.0f;
            C0310af afVar2 = null;
            float f2 = 1.0f;
            if (afVar.f2020l) {
                f2 = 0.1f;
            }
            for (C0310af afVar3 : afVarArr) {
                if (afVar != afVar3 && !afVar3.f2017i) {
                    float a = C0654f.m1520a(afVar.f2012d * f2, afVar.f2013e, afVar3.f2012d * f2, afVar3.f2013e);
                    if (afVar2 == null || a < f) {
                        f = a;
                        afVar2 = afVar3;
                    }
                }
            }
            float a2 = C0654f.m1523a(f) + 2.0f;
            float f3 = a2 * a2;
            ArrayList arrayList = new ArrayList();
            for (C0310af afVar4 : afVarArr) {
                if (afVar != afVar4 && !afVar4.f2017i && C0654f.m1520a(afVar.f2012d * f2, afVar.f2013e, afVar4.f2012d * f2, afVar4.f2013e) <= f3) {
                    arrayList.add(Integer.valueOf(afVar4.f2009a));
                }
            }
            afVar.f2049O = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                afVar.f2049O[i] = ((Integer) arrayList.get(i)).intValue();
            }
        }
    }

    /* renamed from: g */
    public static String m3114g() {
        return "builtin_mods";
    }

    /* renamed from: h */
    public static String m3113h() {
        return "builtin_mods_enabled";
    }

    /* renamed from: i */
    public static String m3112i() {
        String str;
        if (AbstractC0789l.f5471aF) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }
}
