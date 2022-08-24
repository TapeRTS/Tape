package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.air.AbstractC0309b;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0337b;
import com.corrodinggames.rts.game.units.custom.p016a.C0338c;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0341f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0322a;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0323b;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0325d;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0326e;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0327f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0328g;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0329h;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0330i;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0331j;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0332k;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0333l;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0334m;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0336o;
import com.corrodinggames.rts.game.units.custom.p018b.C0388b;
import com.corrodinggames.rts.game.units.custom.p018b.C0389c;
import com.corrodinggames.rts.game.units.custom.p018b.C0393g;
import com.corrodinggames.rts.game.units.custom.p018b.C0395i;
import com.corrodinggames.rts.game.units.custom.p018b.C0397k;
import com.corrodinggames.rts.game.units.custom.p018b.C0398l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0437d;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.custom.p023f.C0442a;
import com.corrodinggames.rts.game.units.land.AbstractC0525h;
import com.corrodinggames.rts.game.units.land.AbstractC0529j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.ExperimentalHoverTank;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.water.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1073ac;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
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

/* renamed from: com.corrodinggames.rts.game.units.custom.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/af.class */
public class C0348af {

    /* renamed from: b */
    static int f2190b;

    /* renamed from: c */
    static int f2191c;

    /* renamed from: d */
    public static int f2192d;

    /* renamed from: e */
    static C0824b f2193e;

    /* renamed from: f */
    static boolean f2194f;

    /* renamed from: i */
    static int f2195i;

    /* renamed from: j */
    static int f2196j;

    /* renamed from: k */
    static boolean f2197k;

    /* renamed from: l */
    static int f2198l;

    /* renamed from: a */
    static boolean f2199a = false;

    /* renamed from: g */
    public static HashMap f2200g = new HashMap();

    /* renamed from: h */
    public static HashMap f2201h = new HashMap();

    /* renamed from: m */
    public static C1101m f2202m = new C1101m();

    /* renamed from: n */
    static HashMap f2203n = new HashMap();

    /* renamed from: o */
    static final Object f2204o = new Object();

    /* renamed from: p */
    public static float f2205p = 50.0f;

    /* renamed from: q */
    public static float f2206q = 50.0f;

    /* renamed from: r */
    static C0824b f2207r = null;

    /* renamed from: s */
    static String f2208s = null;

    /* renamed from: a */
    public static void m5434a(int i) {
        if (f2193e != null) {
            f2193e.f5442G += i;
        }
    }

    /* renamed from: a */
    public static void m5435a() {
        m5386i();
        m5385j();
    }

    /* renamed from: a */
    public static void m5421a(BitmapOrTexture bitmapOrTexture) {
        if (bitmapOrTexture != null && !bitmapOrTexture.f6402v) {
            if (GameEngine.m1153ay() && (bitmapOrTexture instanceof C0937h)) {
                return;
            }
            bitmapOrTexture.f6402v = true;
            m5434a(bitmapOrTexture.mo390u());
        }
    }

    /* renamed from: a */
    public static void m5403a(BitmapOrTexture[] bitmapOrTextureArr) {
        if (bitmapOrTextureArr != null) {
            BitmapOrTexture bitmapOrTexture = null;
            for (BitmapOrTexture bitmapOrTexture2 : bitmapOrTextureArr) {
                if (bitmapOrTexture2 != bitmapOrTexture) {
                    m5421a(bitmapOrTexture2);
                }
                if (bitmapOrTexture == null) {
                    bitmapOrTexture = bitmapOrTexture2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5423a(AbstractC0635i abstractC0635i) {
        if (!abstractC0635i.f4064g) {
            abstractC0635i.f4064g = true;
            if (f2193e != null) {
                f2193e.f5443H += abstractC0635i.mo2993a();
            }
        }
    }

    /* renamed from: a */
    public static boolean m5419a(C1101m c1101m) {
        C0453l c0453l;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(C0453l.f3184c);
        ArrayList arrayList2 = new ArrayList(C0453l.f3185d);
        C1101m c1101m2 = new C1101m();
        String str = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            C0453l m5430a = m5430a((C0453l) it.next());
            if (m5430a == null) {
                GameEngine.PrintLog("Failed to apply changes to unit type: " + c0453l.f2920L);
                z = true;
                if (str == null && f2208s != null) {
                    str = f2208s;
                }
            } else {
                GameEngine.PrintLog("Changes applied to unit type: " + c0453l.f2920L);
                z2 = true;
                c1101m2.add(m5430a);
            }
        }
        if (str != null && GameEngine.m1159as()) {
            gameEngine.m1137c("Unit errors", str);
        }
        if (z2 && !m5392c(false)) {
            z = true;
        }
        if (z2 && !z) {
            C0453l.f3186e = null;
            m5390e();
            f2208s = null;
            Team.m6408M();
            C0797f.m2069J();
            z3 = true;
            if (!z) {
                Iterator it2 = c1101m2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0453l c0453l2 = (C0453l) it2.next();
                    if (c0453l2.f3278gn.size() > 0) {
                        gameEngine.m1192a(c0453l2.f3278gn.size() + " Warning(s) loading: " + c0453l2.m4746b() + " \n" + ((String) c0453l2.f3278gn.get(0)), 1);
                        c0453l2.f3278gn.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            GameEngine.PrintLog("Failed to load some units, keeping old config");
            synchronized (C0453l.f3184c) {
                C0453l.f3184c.clear();
                C0453l.f3184c.addAll(arrayList);
            }
            C0453l.f3185d = arrayList2;
        }
        return z3;
    }

    /* renamed from: b */
    public static void m5402b() {
        C1101m c1101m = new C1101m();
        f2190b = 0;
        f2191c = 0;
        f2192d = 0;
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            InterfaceC0303as unitType = ((Unit) it.next()).getUnitType();
            if ((unitType instanceof C0453l) && !c1101m.contains(unitType)) {
                c1101m.add((C0453l) unitType);
            }
        }
        if (c1101m.size() > 0) {
            m5419a(c1101m);
        }
    }

    /* renamed from: c */
    public static void m5395c() {
        boolean z = false;
        C1101m c1101m = new C1101m();
        Iterator it = C0453l.f3184c.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            boolean z2 = false;
            Iterator it2 = c0453l.f3196k.iterator();
            while (it2.hasNext()) {
                C0468z c0468z = (C0468z) it2.next();
                long m4674a = c0468z.m4674a(false);
                if (m4674a != c0468z.f3355a) {
                    z2 = true;
                    c0468z.f3355a = m4674a;
                }
            }
            if (z2) {
                if (!z) {
                    GameEngine.PrintLog("Detected unit changes");
                    z = true;
                }
                c1101m.add(c0453l);
            }
        }
        if (c1101m.size() > 0) {
            m5419a(c1101m);
        }
    }

    /* renamed from: d */
    public static void m5391d() {
        if (C0453l.f3186e != null) {
            GameEngine.PrintLog("applyPendingNetworkUnits: Applying new network units from server (" + C0453l.f3186e.size() + " units)");
            C0453l.f3185d = C0453l.f3186e;
            C0453l.f3186e = null;
            m5390e();
            return;
        }
        GameEngine.PrintLog("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m5404a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (C0453l.f3184c) {
            Iterator it = C0453l.f3184c.iterator();
            while (it.hasNext()) {
                C0453l c0453l = (C0453l) it.next();
                if (c0453l.f2917I == null || (c0453l.f2917I.m1828m() && z)) {
                    arrayList.add(c0453l);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C1072ab m5418a(String str) {
        synchronized (f2203n) {
            C1072ab c1072ab = (C1072ab) f2203n.get(str);
            if (c1072ab != null) {
                return c1072ab;
            }
            C1098j m5399b = m5399b(str);
            if (m5399b == null) {
                return null;
            }
            try {
                C1072ab c1072ab2 = new C1072ab(new BufferedInputStream(m5399b), str);
                c1072ab2.m723a();
                c1072ab2.f6821f = m5399b.m565d();
                f2203n.put(str, c1072ab2);
                return c1072ab2;
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0412bm("Load of '" + str + "' failed: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m5425a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        C1072ab m5418a = m5418a(str);
        if (m5418a == null) {
            if (z) {
                return;
            }
            throw new C0412bm("[" + str2 + "] Could not find conf target:" + str);
        }
        c0453l.m4711o(m5418a.f6821f);
        c1072ab.m715a(m5418a);
        m5429a(c0453l, c1072ab, m5418a, str, 1);
    }

    /* renamed from: a */
    public static void m5429a(C0453l c0453l, C1072ab c1072ab, C1072ab c1072ab2, String str, int i) {
        String m5411a;
        String str2;
        if (i > 10) {
            throw new C0412bm("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String m681b = c1072ab2.m681b("core", "copyFrom", (String) null);
        if (m681b != null) {
            String[] split = m681b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new C0412bm("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (c0453l.f2917I == null) {
                            str2 = "units/common.ini";
                        } else {
                            str2 = c0453l.f2917I.f5426q + "/common.ini";
                        }
                        m5411a = m5411a(CommonUtils.m2251h(str2), substring);
                    } else if (trim.startsWith("CORE:")) {
                        m5411a = m5411a(CommonUtils.m2251h("units/common.ini"), trim.substring("CORE:".length()));
                    } else {
                        m5411a = m5411a(CommonUtils.m2251h(str), trim);
                    }
                    C1072ab m5418a = m5418a(m5411a);
                    if (m5418a == null) {
                        String str4 = "Could not find copyFrom target:" + m5411a;
                        if (i != 0) {
                            str4 = str4 + " (while loading: " + str + ")";
                        }
                        throw new C0412bm(str4);
                    }
                    c0453l.m4711o(m5418a.f6821f);
                    c1072ab.m715a(m5418a);
                    m5429a(c0453l, c1072ab, m5418a, m5411a, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5428a(C0453l c0453l, C1072ab c1072ab, String str, String str2, int i) {
        if (i > 10) {
            throw new C0412bm("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String m681b = c1072ab.m681b(str2, "@copyFromSection", (String) null);
        if (m681b == null || m681b.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = m681b.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C1101m m654k = c1072ab.m654k(trim, VariableScope.nullOrMissingString);
                if (m654k.size() == 0) {
                    throw new C0412bm("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = m654k.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String m684b = c1072ab.m684b(trim, str4);
                    if (m684b != null) {
                        c1072ab.m670d(str, str4, m684b);
                    }
                }
                m5428a(c0453l, c1072ab, str, trim, i + 1);
            }
        }
    }

    /* renamed from: a */
    public static C0385az m5420a(C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m691a(str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0351ai m5427a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m716a(c0453l, str, str2, str3);
    }

    /* renamed from: a */
    public static C0453l m5430a(C0453l c0453l) {
        String str = c0453l.f2912C;
        GameEngine gameEngine = GameEngine.getInstance();
        C0453l c0453l2 = null;
        String str2 = null;
        if (c0453l.f2917I != null) {
            str2 = c0453l.f2917I.f5452R;
        }
        synchronized (f2203n) {
            f2203n.clear();
        }
        f2208s = null;
        try {
            c0453l2 = m5416a(str, c0453l.f2917I, c0453l.f2918J, c0453l.f2919K);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f2208s == null) {
                gameEngine.m1192a("Error loading unit:" + m5422a(c0453l.f2917I, str, true) + "\n" + e.getMessage(), 1);
            }
        }
        if (c0453l2 == null && c0453l.f2917I != null) {
            c0453l.f2917I.f5452R = str2;
        }
        if (c0453l2 != null) {
            synchronized (C0453l.f3184c) {
                C0453l.f3184c.remove(c0453l);
            }
            m5431a((InterfaceC0303as) c0453l, c0453l2, true);
            if (C0453l.f3185d.remove(c0453l)) {
                C0453l.f3185d.add(c0453l2);
                if (c0453l.f2915G != c0453l2.f2915G) {
                    f2192d++;
                }
            } else {
                GameEngine.PrintLog("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            Team.m6408M();
            C0797f.m2069J();
        }
        return c0453l2;
    }

    /* renamed from: a */
    public static void m5431a(InterfaceC0303as interfaceC0303as, C0453l c0453l, boolean z) {
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof C0451j) {
                C0451j c0451j = (C0451j) unit;
                if (c0451j.f2861w == interfaceC0303as) {
                    Team.m6369b((Unit) c0451j);
                    c0451j.m4983a(c0453l, false, z);
                    c0451j.mo4500S();
                    if (c0451j.m5785de() != null) {
                        c0451j.m5785de().m5240a(c0453l);
                    }
                    Team.m6353c(c0451j);
                }
                if (c0451j.f2863y == interfaceC0303as) {
                    c0451j.f2863y = c0453l;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m5396b(boolean z) {
        ArrayList m5404a = m5404a(z);
        C0453l.f3186e = null;
        C0453l.f3185d = m5404a;
        f2208s = null;
        m5390e();
        return f2208s;
    }

    /* renamed from: c */
    public static boolean m5392c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = C0453l.f3185d;
        if (z) {
            arrayList = m5404a(true);
        } else {
            arrayList = C0453l.f3185d;
        }
        boolean z2 = true;
        f2208s = null;
        C0453l.f3185d = arrayList;
        m5388g();
        if (f2208s != null) {
            z2 = false;
        }
        C0453l.f3185d = arrayList2;
        m5388g();
        return z2;
    }

    /* renamed from: e */
    public static void m5390e() {
        synchronized (f2204o) {
            m5381n();
        }
    }

    /* renamed from: n */
    private static void m5381n() {
        C0453l c0453l = null;
        ArrayList arrayList = new ArrayList();
        if (GameEngine.getInstance().m1160ar()) {
            for (UnitType unitType : UnitType.values()) {
                arrayList.add(unitType);
            }
        }
        Iterator it = C0453l.f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l2 = (C0453l) it.next();
            arrayList.add(c0453l2);
            if (c0453l2.f2920L.equals("missing") && c0453l2.f2917I == null) {
                c0453l = c0453l2;
            }
        }
        UnitType.f1790ae = arrayList;
        Unit.m5865bL();
        m5388g();
        m5389f();
        C0428a.m5148d();
        if (c0453l == null) {
            GameEngine.PrintLog("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = C0453l.f3185d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l3 = (C0453l) it2.next();
                if (c0453l3.f2920L.equals("missing")) {
                    GameEngine.PrintLog("Found a missing placeholder");
                    c0453l = c0453l3;
                }
            }
        }
        C0453l.f2901b = c0453l;
    }

    /* renamed from: f */
    public static void m5389f() {
        float f = 50.0f;
        float f2 = 50.0f;
        Iterator it = C0453l.f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            float f3 = c0453l.f3045cR;
            if (f3 > 250.0f) {
                f3 = 250.0f;
            }
            if (f < f3) {
                f = f3;
            }
            if (c0453l.f2947aG && f2 < f3) {
                f2 = f3;
            }
        }
        f2205p = f;
        f2206q = f2;
    }

    /* renamed from: b */
    public static C1098j m5399b(String str) {
        return C0750a.m2441j(VariableScope.nullOrMissingString + str);
    }

    /* renamed from: a */
    public static void m5405a(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.corrodinggames.rts.game.units.a.v] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.corrodinggames.rts.game.units.a.l] */
    /* JADX WARN: Type inference failed for: r0v260, types: [com.corrodinggames.rts.game.units.a.l] */
    /* renamed from: a */
    public static void m5432a(InterfaceC0303as interfaceC0303as) {
        C0342g c0342g;
        C0227v c0227v;
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            interfaceC0303as.mo5707h();
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f3165fD != null) {
                    InterfaceC0303as m4703s = C0453l.m4703s(c0453l.f3165fD);
                    if (m4703s == null) {
                        throw new C0412bm("Could not find [ai]upgradedFrom target:" + c0453l.f3165fD);
                    }
                    c0453l.m4744b(m4703s);
                }
                Iterator it = c0453l.f3201p.iterator();
                while (it.hasNext()) {
                    ((C0463u) it.next()).mo4682a();
                }
                if (c0453l.f3121eC) {
                    C0453l.f3188g.add(c0453l);
                }
            }
            Iterator it2 = C0453l.f3185d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l2 = (C0453l) it2.next();
                if (interfaceC0303as instanceof C0453l) {
                    C0453l c0453l3 = (C0453l) interfaceC0303as;
                    if (c0453l2.f3165fD != null && c0453l2.f3165fD.equalsIgnoreCase(c0453l3.m4724i())) {
                        c0453l3.m4744b(c0453l2);
                    }
                }
                Iterator it3 = c0453l2.f3272ga.iterator();
                while (it3.hasNext()) {
                    C0458p c0458p = (C0458p) it3.next();
                    if (c0458p.f3324a.equalsIgnoreCase(interfaceC0303as.mo5706i())) {
                        c0458p.f3328e = true;
                        boolean z = false;
                        for (int i = c0453l2.f3018cj; i <= 3; i++) {
                            ArrayList mo5716a = interfaceC0303as.mo5716a(i);
                            if (c0453l2.f2947aG || c0458p.f3326c) {
                                c0227v = new C0227v(c0453l2);
                            } else {
                                c0227v = new C0217l(c0453l2, null);
                            }
                            if (c0458p.f3325b != -999.0f) {
                                c0227v.f1459g = c0458p.f3325b;
                            }
                            if (c0458p.f3329f != null) {
                                boolean z2 = false;
                                if (!(interfaceC0303as instanceof C0453l) && !(Unit.m5890a(interfaceC0303as) instanceof AbstractC0623y)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    c0227v.f1460h = C0338c.m5487a(c0458p);
                                } else if (!z) {
                                    z = true;
                                    c0453l2.m4705r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + interfaceC0303as.mo5706i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = mo5716a.iterator();
                            while (it4.hasNext()) {
                                if (c0227v.equals((Action) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                mo5716a.add(c0227v);
                            }
                            m5405a(mo5716a);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l4 = (C0453l) interfaceC0303as;
                Iterator it5 = c0453l4.f3273gb.iterator();
                while (it5.hasNext()) {
                    C0339d c0339d = (C0339d) it5.next();
                    if (c0339d.f2055j != null && c0339d.f2055j.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList mo5716a2 = interfaceC0303as.mo5716a(i2);
                            C0220o c0220o = new C0220o();
                            if (c0339d.f2122o != -999.0f) {
                                c0220o.f1459g = c0339d.f2122o;
                            }
                            mo5716a2.add(c0220o);
                            c0453l4.f3048cX = true;
                            m5405a(mo5716a2);
                        }
                    } else if (c0339d.f2055j != null && c0339d.f2055j.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList mo5716a3 = interfaceC0303as.mo5716a(i3);
                            C0218m c0218m = new C0218m(true);
                            if (c0339d.f2122o != -999.0f) {
                                c0218m.f1459g = c0339d.f2122o;
                            }
                            mo5716a3.add(c0218m);
                            m5405a(mo5716a3);
                        }
                    } else if (c0339d.f2055j != null && c0339d.f2055j.equalsIgnoreCase("repair")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList mo5716a4 = interfaceC0303as.mo5716a(i4);
                            C0219n c0219n = new C0219n();
                            if (c0339d.f2122o != -999.0f) {
                                c0219n.f1459g = c0339d.f2122o;
                            }
                            mo5716a4.add(c0219n);
                            m5405a(mo5716a4);
                        }
                    } else {
                        InterfaceC0303as interfaceC0303as2 = null;
                        if (c0339d.f2055j != null) {
                            interfaceC0303as2 = UnitType.m5734a(c0339d.f2055j);
                            if (interfaceC0303as2 == null) {
                                throw new C0412bm("Could not find canBuild target:" + c0339d.f2055j);
                            }
                        } else if (c0339d.f2134aJ != EnumC0341f.convert) {
                            throw new C0412bm("'Target' required for action:" + c0339d.m5482a());
                        }
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList mo5716a5 = interfaceC0303as.mo5716a(i5);
                            if (c0339d.f2134aJ == EnumC0341f.build) {
                                if (interfaceC0303as2.mo5705j() || c0339d.f2119aH) {
                                    c0342g = new C0227v(interfaceC0303as2, c0339d.f2118aG, null);
                                    c0342g.f1460h = C0338c.m5488a(c0339d);
                                } else {
                                    c0342g = new C0217l(interfaceC0303as2, null);
                                    c0342g.f1460h = C0338c.m5488a(c0339d);
                                }
                            } else if (c0339d.f2134aJ == EnumC0341f.convert) {
                                c0342g = new C0342g(c0339d, C0453l.m4770a(interfaceC0303as2));
                            } else {
                                throw new C0412bm("Could not find actionType:" + c0339d.f2134aJ);
                            }
                            if (c0339d.f2122o != -999.0f) {
                                c0342g.f1459g = c0339d.f2122o;
                            }
                            boolean z4 = false;
                            Iterator it6 = mo5716a5.iterator();
                            while (it6.hasNext()) {
                                if (c0342g.equals((Action) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                mo5716a5.add(c0342g);
                            }
                            m5405a(mo5716a5);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l5 = (C0453l) interfaceC0303as;
                c0453l5.f3151fp = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = interfaceC0303as.mo5716a(i6).iterator();
                    while (it7.hasNext()) {
                        Action action = (Action) it7.next();
                        if (!(action instanceof C0342g) && action.mo7517i() != null) {
                            c0453l5.f3151fp = true;
                        }
                    }
                }
                Iterator it8 = c0453l5.f3201p.iterator();
                while (it8.hasNext()) {
                    ((C0463u) it8.next()).mo4681b();
                }
            }
            boolean z5 = gameEngine.m1221N() && gameEngine.networkEngine.f5597aO.f5658k;
            for (int i7 = 1; i7 <= 3; i7++) {
                Iterator it9 = interfaceC0303as.mo5716a(i7).iterator();
                while (it9.hasNext()) {
                    Action action2 = (Action) it9.next();
                    if (action2.f1460h instanceof C0337b) {
                        GameEngine.m1193a("=== ChainedActionConfig already on: " + interfaceC0303as.mo5706i() + " action:" + action2.getText());
                        action2.f1460h = ((C0337b) action2.f1460h).f2032b;
                    }
                    if (z5) {
                        C0424b m6105B = action2.m6105B();
                        C0424b m6051o_ = action2.m6051o_();
                        if (!m6105B.m5209b() && m6051o_ == null) {
                            C0337b c0337b = new C0337b(action2.f1460h);
                            action2.f1460h = c0337b;
                            c0337b.f2033c = C0424b.f2709a;
                            c0337b.f2034d = m6105B;
                        }
                    }
                }
            }
        } catch (C0412bm e) {
            m5413a(interfaceC0303as.mo5706i(), e, interfaceC0303as);
        } catch (RuntimeException e2) {
            m5413a(interfaceC0303as.mo5706i(), e2, interfaceC0303as);
        }
    }

    /* renamed from: g */
    public static void m5388g() {
        synchronized (f2204o) {
            m5380o();
        }
    }

    /* renamed from: o */
    private static void m5380o() {
        C0458p c0458p;
        C0453l.f3188g.clear();
        C0453l.f3187f.clear();
        Iterator it = C0453l.f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            Iterator it2 = c0453l.f3272ga.iterator();
            while (it2.hasNext()) {
                ((C0458p) it2.next()).f3328e = false;
            }
            c0453l.f3263fG.clear();
        }
        Iterator it3 = C0453l.f3185d.iterator();
        while (it3.hasNext()) {
            C0453l c0453l2 = (C0453l) it3.next();
            try {
                if (c0453l2.f2923P != null) {
                    for (String str : c0453l2.f2923P.split(",")) {
                        String trim = str.trim();
                        InterfaceC0303as m4750a = C0453l.m4750a(trim, false);
                        if (m4750a == null) {
                            throw new C0412bm("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (m4750a instanceof C0453l) {
                            GameEngine.PrintLog("Replacing:" + m4750a.mo5706i() + " with " + c0453l2.m4724i());
                        }
                        C0453l.f3187f.put(m4750a, c0453l2);
                    }
                }
            } catch (C0412bm e) {
                m5413a(c0453l2.m4724i(), e, c0453l2);
            }
        }
        for (UnitType unitType : UnitType.values()) {
            m5432a(unitType);
        }
        Iterator it4 = C0453l.f3185d.iterator();
        while (it4.hasNext()) {
            m5432a((InterfaceC0303as) ((C0453l) it4.next()));
        }
        Iterator it5 = C0453l.f3185d.iterator();
        while (it5.hasNext()) {
            C0453l c0453l3 = (C0453l) it5.next();
            Iterator it6 = c0453l3.f3272ga.iterator();
            while (it6.hasNext()) {
                if (!((C0458p) it6.next()).f3328e) {
                    String str2 = c0458p.f3327d + " failed to find target:" + c0458p.f3324a;
                    c0453l3.m4707q(str2);
                    if (c0453l3.f2924Q >= 1) {
                        GameEngine.PrintLog("Converting warning to error (meta.strictLevel=" + c0453l3.f2924Q + ")");
                        c0453l3.m4709p(str2);
                    }
                }
            }
            if (c0453l3.f3276gj != null && c0453l3.f3276gj.size() > 0) {
                Iterator it7 = c0453l3.f3276gj.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0462t) it7.next()).m4685b(c0453l3);
                    } catch (C0412bm e2) {
                        m5413a(c0453l3.m4724i(), e2, c0453l3);
                    }
                }
            }
        }
        Iterator it8 = C0453l.f3185d.iterator();
        while (it8.hasNext()) {
            ((C0453l) it8.next()).m4706r();
        }
        Collections.sort(C0453l.f3188g, new C0459q());
    }

    /* renamed from: a */
    public static C0453l m5416a(String str, C0824b c0824b, String str2, String str3) {
        try {
            long m2612a = C0727bl.m2612a();
            C1098j m5399b = m5399b(str);
            if (m5399b == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m5399b);
            m5433a(m2612a, EnumC0349ag.iniOpen);
            f2190b++;
            if (c0824b != null) {
                f2191c++;
            }
            GameEngine gameEngine = GameEngine.getInstance();
            String str4 = "core units";
            if (c0824b != null) {
                str4 = c0824b.m1846a();
            }
            gameEngine.m1118h("Loading units - " + f2190b + " (" + str4 + ")");
            C0453l m5414a = m5414a(str, bufferedInputStream, m5399b.m566c(), c0824b, m5399b, str2, str3);
            long m2612a2 = C0727bl.m2612a();
            try {
                bufferedInputStream.close();
                m5399b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            m5433a(m2612a2, EnumC0349ag.iniClose);
            return m5414a;
        } catch (RuntimeException e2) {
            m5412a(str, e2, c0824b);
            return null;
        }
    }

    /* renamed from: h */
    public static void m5387h() {
        GameEngine gameEngine = GameEngine.getInstance();
        ArrayList m1850k = gameEngine.f6118bZ.m1850k();
        f2196j = 0;
        f2195i = 0;
        f2198l = 0;
        f2197k = false;
        long m2612a = C0727bl.m2612a();
        for (BitmapOrTexture bitmapOrTexture : f2200g.values()) {
            bitmapOrTexture.f6402v = false;
            if (bitmapOrTexture.f6382a != null) {
                for (BitmapOrTexture bitmapOrTexture2 : bitmapOrTexture.f6382a) {
                    bitmapOrTexture2.f6402v = false;
                }
            }
            if (bitmapOrTexture.f6383b != null) {
                for (BitmapOrTexture bitmapOrTexture3 : bitmapOrTexture.f6383b) {
                    bitmapOrTexture3.f6402v = false;
                }
            }
            if (bitmapOrTexture.f6384c != null) {
                for (BitmapOrTexture bitmapOrTexture4 : bitmapOrTexture.f6384c) {
                    bitmapOrTexture4.f6402v = false;
                }
            }
        }
        for (AbstractC0635i abstractC0635i : f2201h.values()) {
            abstractC0635i.f4064g = false;
        }
        byte[] bArr = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = gameEngine.f6280dY;
            gameEngine.f6281dZ = bArr[1];
            if (!GameEngine.m1159as()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            GameEngine.PrintLog("Failed to reserve memory pre-mod load");
        }
        synchronized (C0453l.f3184c) {
            C0453l.f3184c.clear();
        }
        C0453l.f3185d.clear();
        C0453l.f3186e = null;
        C0453l.f3187f.clear();
        gameEngine.f6118bZ.m1847n();
        f2190b = 0;
        f2191c = 0;
        synchronized (f2203n) {
            f2203n.clear();
        }
        m5417a(C0750a.m2436o("units"), 1, false, (C0824b) null, C0750a.m2436o("units"), (String) null);
        if (!GameEngine.f6086aJ && !gameEngine.f6222ar) {
            String m5382m = m5382m();
            if (!C0750a.m2445f(m5382m)) {
                GameEngine.PrintLog("Modded Custom '" + m5382m + "' directory not found");
            }
            Iterator it = m1850k.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                if (!c0824b.f5434y && c0824b.f5426q != null) {
                    String m1831j = c0824b.m1831j();
                    if (c0824b.f5422m) {
                        m1831j = C0750a.m2436o(m1831j);
                    }
                    GameEngine.PrintLog("Loading mod at:" + m1831j);
                    m5417a(m1831j, 2, true, c0824b, m1831j, (String) null);
                }
            }
            Iterator it2 = m1850k.iterator();
            while (it2.hasNext()) {
                C0824b c0824b2 = (C0824b) it2.next();
                if (c0824b2.f5434y && c0824b2.f5426q != null) {
                    String m1832i = c0824b2.m1832i();
                    GameEngine.PrintLog("Loading workshop mod at:" + m1832i);
                    m5417a(m1832i, 2, true, c0824b2, m1832i, (String) null);
                }
            }
        }
        m5435a();
        m5396b(true);
        GameEngine.PrintLog("Done loading custom units. image cacheHits:" + f2196j + " image cacheMisses:" + f2195i + " (in: " + C0727bl.m2610a(m2612a) + "ms)");
        GameEngine.PrintLog("========= Mods data loaded ===========");
        GameEngine.PrintLog("Number of mods:" + m1850k.size());
        Iterator it3 = m1850k.iterator();
        while (it3.hasNext()) {
            ((C0824b) it3.next()).m1821t();
        }
        GameEngine.PrintLog("================================");
        if (byteBufferArr != null) {
            byteBufferArr[0] = null;
            byteBufferArr[1] = null;
        }
        if (bArr != null) {
            bArr[1] = gameEngine.f6280dY;
            gameEngine.f6281dZ = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m5417a(String str, int i, boolean z, C0824b c0824b, String str2, String str3) {
        boolean z2 = z && i == 1;
        GameEngine gameEngine = GameEngine.getInstance();
        if (c0824b != null) {
            if (c0824b.f5415f && !gameEngine.f6109bQ.loadDisabledModData) {
                c0824b.f5438C = true;
                GameEngine.PrintLog("unitDataSkipped for: " + str);
                return;
            }
            c0824b.f5438C = false;
        }
        C0750a.m2453c();
        String[] m2444g = C0750a.m2444g(str);
        if (m2444g == null) {
            String m2453c = C0750a.m2453c();
            GameEngine.m1145b("readAllCustomUnitConfigs: ERROR");
            GameEngine.m1145b("readAllCustomUnitConfigs: Failed to load:" + str);
            if (c0824b != null) {
                if (!c0824b.f5439D) {
                    if (m2453c == null) {
                        c0824b.f5452R = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        c0824b.f5452R = "Failed to list directory: " + m2453c;
                        return;
                    }
                }
                c0824b.f5453S = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (m2453c != null) {
                    c0824b.f5453S += ": " + m2453c;
                    return;
                }
                return;
            }
            return;
        }
        if (c0824b != null) {
            c0824b.f5439D = true;
        }
        if (!z2) {
            for (String str4 : m2444g) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : m2444g) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                C0824b c0824b2 = c0824b;
                if (z && i == 1 && c0824b2 == null) {
                    c0824b2 = gameEngine.f6118bZ.m1860d(str5);
                    if (c0824b2 == null) {
                        GameEngine.m1145b("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        c0824b2 = gameEngine.f6118bZ.f5407c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (f2207r != c0824b2 && c0824b2 != null) {
                        f2207r = c0824b2;
                        m5435a();
                        GameEngine.PrintLog("Loading units from mod: " + c0824b2.f5412c);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        GameEngine.PrintLog("Skipping possible system file: " + str6);
                    } else {
                        long m2612a = C0727bl.m2612a();
                        m5416a(str6, c0824b2, str2, str3);
                        m5433a(m2612a, EnumC0349ag.unitParse);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    GameEngine.PrintLog("Found map: " + str7);
                    if (c0824b2 != null && c0824b2.f5437B) {
                        gameEngine.f6118bZ.m1872a(str7, c0824b2);
                    } else {
                        GameEngine.PrintLog("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i < 10) {
                        if (C0750a.m2445f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j = -1;
                            if (z3) {
                                j = C0727bl.m2612a();
                                GameEngine.PrintLog("============");
                                GameEngine.PrintLog(">>> Mod '" + c0824b2.m1839c() + "'" + (c0824b2.m1828m() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            m5417a(str8, i + 1, z, c0824b2, str9, str3);
                            if (z3 && c0824b2 != null && c0824b2.m1828m()) {
                                GameEngine.PrintLog("Mod '" + c0824b2.m1839c() + "' load took:" + C0727bl.m2611a(C0727bl.m2610a(j)));
                            }
                        }
                    } else {
                        GameEngine.PrintLog("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0453l m5414a(String str, InputStream inputStream, long j, C0824b c0824b, C1098j c1098j, String str2, String str3) {
        boolean z;
        C0359aq c0359aq;
        String substring;
        boolean z2;
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            if (f2199a) {
                String str4 = "CORE";
                if (c0824b != null) {
                    str4 = c0824b.m1831j();
                }
                GameEngine.PrintLog("Loading unit config: " + str + " [" + str4 + "]");
            }
            gameEngine.graphics.mo884e();
            long m2612a = C0727bl.m2612a();
            try {
                C1072ab c1072ab = new C1072ab(inputStream, str);
                m5433a(m2612a, EnumC0349ag.iniParse);
                C0453l c0453l = new C0453l();
                if (c1072ab.m700a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                c0453l.f2912C = str;
                c0453l.f2913D = c1098j.m565d();
                c0453l.f2914E = c0453l.f2912C;
                c0453l.f2917I = c0824b;
                c0453l.f2918J = str2;
                c0453l.f2919K = str3;
                f2193e = c0824b;
                f2194f = false;
                if (c0453l.f2917I != null) {
                }
                long m2612a2 = C0727bl.m2612a();
                m5429a(c0453l, c1072ab, c1072ab, str, 0);
                if (c0453l.f2919K != null) {
                    m5425a(c0453l, c1072ab, c0453l.f2919K + "/all-units.template", "AUTO units.template", true);
                }
                c1072ab.m707a("core", "copyFrom");
                c0453l.f2924Q = c1072ab.m682b("core", "strictLevel", (Integer) 0).intValue();
                if (c0453l.f2924Q < 0) {
                    throw new C0412bm("[core]strictLevel cannot be < 0");
                }
                if (c0453l.f2924Q > 1) {
                    throw new C0412bm("[core]strictLevel cannot yet be > 1");
                }
                c0453l.f3182gm = c1072ab.m700a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                c1072ab.m707a("core", "dont_load");
                c1072ab.m681b("core", "class", "CustomUnitMetadata");
                Iterator it = c1072ab.m678c("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    c1072ab.m707a((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = c1072ab.m678c("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    m5428a(c0453l, c1072ab, str5, str5, 0);
                }
                C0442a.m5079a(c0453l, c1072ab);
                String m681b = c1072ab.m681b("core", "overrideResourceLoadPath", (String) null);
                if (m681b != null) {
                    c0453l.f2914E = m5424a(c0453l, str, m681b);
                }
                m5433a(m2612a2, EnumC0349ag.iniSetup);
                c0453l.f2920L = c1072ab.m668e("core", "name");
                c0453l.f2915G = c1072ab.m680c();
                if (c0453l.f2920L.equals("self")) {
                    throw new C0412bm("Unit name: " + c0453l.f2920L + " is reserved");
                }
                if (c0453l.f2920L.startsWith("self.")) {
                    throw new C0412bm("Unit name cannot start with self.");
                }
                String m681b2 = c1072ab.m681b("core", "altNames", (String) null);
                if (m681b2 != null && !m681b2.equalsIgnoreCase("NONE")) {
                    for (String str6 : m681b2.split(",")) {
                        c0453l.f3205M.add(str6.trim());
                    }
                }
                c0453l.f2921N = C0448g.m5058a(c1072ab.m681b("core", "tags", (String) null));
                if (c0453l.f2924Q >= 1 && c0453l.f2921N != null) {
                    for (C0448g c0448g : c0453l.f2921N.f2837a) {
                        if (c0448g.f2833a.contains(" ")) {
                            throw new C0412bm("(strictLevel 1) [core]tags: space in tag: '" + c0448g.f2833a + "'");
                        }
                    }
                }
                c0453l.f2923P = c1072ab.m681b("core", "overrideAndReplace", (String) null);
                if (c0453l.f2923P != null && c0453l.f2923P.equalsIgnoreCase("NONE")) {
                    c0453l.f2923P = null;
                }
                String m681b3 = c1072ab.m681b("core", "defineUnitMemory", (String) null);
                if (m681b3 != null) {
                    c0453l.f3202q.addDefineValue(c0453l, "core", "defineUnitMemory", m681b3);
                }
                Iterator it3 = c1072ab.m654k("core", "@memory ").iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String trim = str7.substring("@memory ".length()).trim();
                    String m681b4 = c1072ab.m681b("core", str7, (String) null);
                    if (m681b4 != null) {
                        if (!m681b4.contains(",")) {
                            c0453l.f3202q.addSingleDefine(c0453l, trim, m681b4, "core", str7);
                        } else {
                            throw new C0412bm("[core]" + str7 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                c0453l.f2926S = (EnumC0345ac) c1072ab.m699a("core", "onNewMapSpawn", (Enum) null, EnumC0345ac.class);
                c0453l.f3224aF = c1072ab.m698a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                c0453l.m4711o(c0453l.f2913D);
                if (c0453l.f2920L.equals("missing")) {
                    if (c0824b == null) {
                        GameEngine.PrintLog("Setting missingPlaceHolder");
                        C0453l.f2901b = c0453l;
                    } else {
                        GameEngine.PrintLog("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                c0453l.f2945aD = c1072ab.m681b("core", "displayLocaleKey", (String) null);
                c0453l.f2943aB = m5420a(c1072ab, "core", "displayText", (String) null);
                c0453l.f2944aC = m5420a(c1072ab, "core", "displayDescription", (String) null);
                c0453l.f3117ey = c1072ab.m700a("core", "isBio", (Boolean) false).booleanValue();
                c0453l.f3118ez = c1072ab.m700a("core", "isBug", (Boolean) false).booleanValue();
                c0453l.f3121eC = c1072ab.m700a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3122eD = c1072ab.m700a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3023ct = c1072ab.m700a("core", "stayNeutral", (Boolean) false).booleanValue();
                c0453l.f3024cu = c1072ab.m700a("core", "createNeutral", (Boolean) false).booleanValue();
                c0453l.f3025cv = c1072ab.m700a("core", "allowCaptureWhenNeutralByAI", (Boolean) false).booleanValue();
                if (c1072ab.m700a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    c0453l.f3024cu = true;
                }
                c0453l.f3026cw = c1072ab.m700a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                c0453l.f3027cx = c1072ab.m700a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                c0453l.f3028cy = c1072ab.m700a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (c0453l.f3028cy) {
                    c0453l.f3023ct = true;
                }
                c0453l.f3029cz = c1072ab.m700a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                c0453l.f2946aE = c1072ab.m700a("core", "showInEditor", (Boolean) true).booleanValue();
                c0453l.f3206T = c1072ab.m682b("graphics", "total_frames", (Integer) 1).intValue();
                if (c0453l.f3206T < 1) {
                    throw new C0412bm("TOTAL_FRAMES cannot be: " + c0453l.f3206T + " (must be 1 or more)");
                }
                c0453l.f3208V = c1072ab.m682b("graphics", "frame_width", (Integer) (-1)).intValue();
                c0453l.f3209W = c1072ab.m682b("graphics", "frame_height", (Integer) (-1)).intValue();
                c0453l.f2927X = c1072ab.m682b("graphics", "default_frame", (Integer) 0).intValue();
                c0453l.f2934ag = c1072ab.m682b("graphics", "image_offsetX", (Integer) 0).intValue();
                c0453l.f2935ah = c1072ab.m682b("graphics", "image_offsetY", (Integer) 0).intValue();
                c0453l.f2936ai = c1072ab.m698a("graphics", "image_offsetH", Float.valueOf(0.0f)).floatValue();
                if (c0453l.f2934ag != 0 || c0453l.f2935ah != 0 || c0453l.f2936ai != 0.0f) {
                    c0453l.f2937aj = true;
                }
                c0453l.f2931ab = EnumC0198o.f1378a;
                if (c1072ab.m700a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    c0453l.f2931ab = EnumC0198o.f1379b;
                }
                String m681b5 = c1072ab.m681b("graphics", "teamColoringMode", (String) null);
                if (m681b5 != null) {
                    if (c1072ab.m700a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new C0412bm("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (m681b5.equalsIgnoreCase("pureGreen")) {
                        c0453l.f2931ab = EnumC0198o.f1378a;
                    } else if (m681b5.equalsIgnoreCase("hueAdd")) {
                        c0453l.f2931ab = EnumC0198o.f1379b;
                    } else if (m681b5.equalsIgnoreCase("hueShift")) {
                        c0453l.f2931ab = EnumC0198o.f1381d;
                    } else if (m681b5.equalsIgnoreCase("disabled")) {
                        c0453l.f2931ab = EnumC0198o.f1382e;
                    } else {
                        throw new C0412bm("Unknown teamColoringMode:" + m681b5);
                    }
                }
                c0453l.f2930aa = c1072ab.m700a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                c0453l.f2929Z = c1072ab.m700a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                c0453l.f2928Y = c1072ab.m719a(c0453l, "graphics", "isVisible", (LogicBoolean) null);
                if (c0453l.f2928Y == LogicBoolean.trueBoolean) {
                    c0453l.f2928Y = null;
                }
                c0453l.f3241cG.f2249m = c1072ab.m700a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                c0453l.f3210ac = c0453l.m4751a(c0453l.f2914E, c1072ab.m668e("graphics", "image"), c0453l.f2930aa, "graphics", "image");
                if (c0453l.f3210ac == null) {
                    throw new C0412bm("Main unit image must be set on custom unit");
                }
                c0453l.f3211ad = c1072ab.m700a("graphics", "image_floatingPointSize", (Boolean) false).booleanValue();
                c0453l.f2932ae = c0453l.f3210ac.mo396m() / c0453l.f3206T;
                c0453l.f2933af = c0453l.f3210ac.mo397l();
                if (c0453l.f3208V > 0) {
                    c0453l.f2932ae = c0453l.f3208V;
                }
                if (c0453l.f3209W > 0) {
                    c0453l.f2933af = c0453l.f3209W;
                    if (c0453l.f2933af < c0453l.f3210ac.mo397l()) {
                        c0453l.f3207U = c0453l.f3210ac.mo396m() / c0453l.f2932ae;
                        if (c0453l.f3207U < 1) {
                            c0453l.f3207U = 1;
                        }
                    }
                }
                c0453l.f3212ak = c0453l.m4758a(c1072ab, "graphics", "image_back");
                c0453l.f2938al = c1072ab.m700a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                c0453l.f3213am = c0453l.m4758a(c1072ab, "graphics", "image_wreak");
                c0453l.f3214an = c0453l.m4758a(c1072ab, "graphics", "image_turret");
                c0453l.f2940ar = AbstractC0529j.f3645dL;
                String m681b6 = c1072ab.m681b("graphics", "image_shadow", "NONE");
                if (m681b6.equalsIgnoreCase("AUTO")) {
                    String str8 = "[autoShadow:" + c0453l.f2932ae + "," + c0453l.f2933af + "]" + c0453l.f3210ac.f6386d + "-" + c0453l.f3210ac.f6387e;
                    BitmapOrTexture m5394c = m5394c(str8);
                    if (m5394c != null) {
                        c0453l.f3215ao = m5394c;
                    } else {
                        c0453l.f3215ao = Unit.m5883a(c0453l.f3210ac, c0453l.f2932ae, c0453l.f2933af);
                        m5421a(c0453l.f3215ao);
                        if (c0453l.f3215ao != null) {
                            m5415a(str8, c0453l.f3215ao);
                        }
                    }
                } else if (m681b6.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str9 = "[autoShadowAnimated:" + c0453l.f2932ae + "," + c0453l.f2933af + "]" + c0453l.f3210ac.f6386d + "-" + c0453l.f3210ac.f6387e;
                    BitmapOrTexture m5394c2 = m5394c(str9);
                    if (m5394c2 != null) {
                        c0453l.f3215ao = m5394c2;
                    } else {
                        c0453l.f3215ao = Unit.m5883a(c0453l.f3210ac, c0453l.f3210ac.mo396m(), c0453l.f3210ac.mo397l());
                        m5421a(c0453l.f3215ao);
                        if (c0453l.f3215ao != null) {
                            m5415a(str9, c0453l.f3215ao);
                        }
                    }
                    c0453l.f2939ap = true;
                } else {
                    c0453l.f3215ao = c0453l.m4751a(c0453l.f2914E, m681b6, c0453l.f2930aa, "graphics", "image_shadow");
                }
                if (c1072ab.m700a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    c0453l.f2939ap = true;
                }
                c0453l.f3216aq = c0453l.m4759a(c0453l.f3210ac, c0453l.f2931ab);
                c0453l.f2902r = c1072ab.m700a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (c0453l.f2902r && c0453l.f3214an != null) {
                    c0453l.f3217as = c0453l.m4759a(c0453l.f3214an, c0453l.f2931ab);
                }
                float floatValue = c1072ab.m698a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    c0453l.f3230bH = (floatValue * c0453l.f3224aF) / c0453l.f2932ae;
                }
                float floatValue2 = c1072ab.m698a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    c0453l.f3230bH *= floatValue2;
                }
                float floatValue3 = c1072ab.m698a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f = floatValue3 * c0453l.f3224aF;
                    if (c0453l.f3214an == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    c0453l.f3231bI = f / c0453l.f3214an.f6396p;
                }
                float floatValue4 = c1072ab.m698a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    c0453l.f3231bI *= floatValue4;
                }
                c0453l.f3218at = ExperimentalHoverTank.f3594e;
                BitmapOrTexture m4758a = c0453l.m4758a(c1072ab, "graphics", "image_shield");
                if (m4758a != null) {
                    c0453l.f3218at = m4758a;
                    c0453l.f3219au = true;
                }
                c0453l.f2941av = c0453l.m4757a(c1072ab, "graphics", "icon_build", false);
                float mo396m = c0453l.f3210ac.mo396m() * c0453l.f3230bH;
                float mo397l = c0453l.f3210ac.mo397l() * c0453l.f3230bH;
                if (mo396m / 2.0f > 90.0f || mo397l / 2.0f > 90.0f) {
                    c0453l.f2911B = new Rect();
                    c0453l.f2911B.f230a = (int) ((-mo396m) / 2.0f);
                    c0453l.f2911B.f232c = (int) (mo396m / 2.0f);
                    c0453l.f2911B.f231b = (int) ((-mo397l) / 2.0f);
                    c0453l.f2911B.f233d = (int) (mo397l / 2.0f);
                    c0453l.f2910A = true;
                }
                Iterator it4 = c1072ab.m652m("resource_", "global_resource_").iterator();
                while (it4.hasNext()) {
                    String str10 = (String) it4.next();
                    if (str10.startsWith("resource_")) {
                        substring = str10.substring("resource_".length());
                        z2 = false;
                    } else {
                        substring = str10.substring("global_resource_".length());
                        z2 = true;
                    }
                    String trim2 = substring.trim();
                    if (trim2.contains(" ")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain a space");
                    }
                    if (trim2.contains("=") || trim2.contains("|") || trim2.contains(":") || trim2.contains(",") || trim2.contains("(") || trim2.contains(")") || trim2.contains("<") || trim2.contains(">") || trim2.contains("$")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain the symbols: =|:,()<>$");
                    }
                    C0437d c0437d = new C0437d(z2);
                    c0437d.m5130a(c0453l, c1072ab, str10, trim2);
                    if (c0453l.m4719k(c0437d.f2771a) != null) {
                        throw new RuntimeException("[" + str10 + "] resource with name:" + c0437d.f2771a + " already exists in this file");
                    }
                    c0453l.f3195j.add(c0437d);
                }
                Iterator it5 = c0453l.f3195j.iterator();
                while (it5.hasNext()) {
                    ((C0437d) it5.next()).m5131a(c0453l);
                }
                if (gameEngine.m1105o()) {
                    C0397k.m5309a(c0453l, c1072ab);
                    C0395i.m5314a(c0453l, c1072ab);
                }
                C0398l.m5297a(c0453l, c1072ab);
                c0453l.f3232ca = c1072ab.m683b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (c0453l.f3232ca < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (c0453l.f3232ca > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!c1072ab.m700a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && c0453l.f3232ca < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                c0453l.f3233cb = (EnumC0461s) c1072ab.m699a("core", "autoTriggerCheckRate", EnumC0461s.everyFrame, EnumC0461s.class);
                c0453l.f3241cG.f2238b = c1072ab.m662g("core", "mass");
                c0453l.f3012cc = c1072ab.m700a("core", "availableInDemo", (Boolean) true).booleanValue();
                c0453l.f3013cd = c1072ab.m700a("core", "isLocked", (Boolean) false).booleanValue();
                c0453l.f3014ce = c1072ab.m700a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                c0453l.f3015cf = C0424b.m5217a(c0453l, c1072ab, "core", "price", false);
                c0453l.f3016cg = C0424b.m5218a(c0453l, c1072ab, "core", "reclaimPrice", (C0424b) null);
                c0453l.f3017ch = C0424b.m5201b(c0453l, c1072ab, "core", "streamingCost", null);
                boolean booleanValue = c1072ab.m700a("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (c0453l.f3017ch != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    c0453l.f3017ch = C0424b.m5201b(c0453l, c1072ab, "core", "price", null);
                    c0453l.f3015cf = C0424b.f2709a;
                }
                c0453l.f3234ci = c1072ab.m671d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3018cj = c1072ab.m682b("core", "techLevel", (Integer) 1).intValue();
                if (c0453l.f3018cj > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (c0453l.f3018cj < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + c0453l.f3018cj);
                }
                c0453l.f3019ck = c1072ab.m700a("core", "experimental", (Boolean) false).booleanValue();
                c0453l.f3238cq = C0424b.m5217a(c0453l, c1072ab, "core", "borrowResourcesWhileAlive", true);
                c0453l.f3239cr = C0424b.m5217a(c0453l, c1072ab, "core", "borrowResourcesWhileBuilt", true);
                c0453l.f3235cl = C0424b.m5217a(c0453l, c1072ab, "core", "generation_resources", true);
                int intValue = c1072ab.m682b("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    c0453l.f3235cl = C0424b.m5219a(c0453l.f3235cl, C0424b.m5230a(intValue));
                }
                c0453l.f3020co = c1072ab.m682b("core", "generation_delay", (Integer) 40).intValue();
                if (c0453l.f3020co == 0) {
                    c0453l.f3020co = 1;
                }
                if (c0453l.f3020co < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                c0453l.f3021cp = 40.0f / c0453l.f3020co;
                if (!c0453l.f3235cl.m5209b()) {
                    c0453l.f3236cm = new C0439f();
                    c0453l.f3236cm.m5125a(c0453l.f3235cl);
                    c0453l.f3236cm.m5128a(c0453l.f3021cp);
                }
                if (!c0453l.f3236cm.m5100c()) {
                    Iterator it6 = c0453l.f3236cm.f2801b.iterator();
                    while (it6.hasNext()) {
                        C0438e c0438e = (C0438e) it6.next();
                        if (!c0438e.f2798a.m5152b() && c0438e.f2798a.m5149c()) {
                            if (c0453l.f3237cn == C0439f.f2800a) {
                                c0453l.f3237cn = new C0439f();
                            }
                            c0453l.f3237cn.m5107b(c0438e.f2798a, c0438e.f2799b);
                        }
                    }
                }
                c0453l.f3022cs = c1072ab.m719a(c0453l, "core", "generation_active", LogicBoolean.trueBoolean);
                c0453l.m4767a(c0453l.f3235cl);
                c0453l.f3030cA = c1072ab.m698a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && c0453l.f3030cA != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                c0453l.f3031cB = c1072ab.m682b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                c0453l.f3032cC = c1072ab.m720a(c0453l, "core", "similarResourcesHaveTag", (C0449h) null);
                c0453l.f3060dj = C0409bj.m5268a(c0453l, c1072ab.m681b("core", "soundOnAttackOrder", (String) null));
                c0453l.f3061dk = C0409bj.m5268a(c0453l, c1072ab.m681b("core", "soundOnMoveOrder", (String) null));
                c0453l.f3062dl = C0409bj.m5268a(c0453l, c1072ab.m681b("core", "soundOnNewSelection", (String) null));
                String m681b7 = c1072ab.m681b("graphics", "drawLayer", (String) null);
                if (m681b7 != null) {
                    if (m681b7.equals("experimentals")) {
                        c0453l.f3240cD = 4;
                    } else if (m681b7.equals("underwater")) {
                        c0453l.f3240cD = 1;
                    } else if (m681b7.equals("bottom")) {
                        c0453l.f3240cD = 1;
                    } else if (m681b7.equals("ground")) {
                        c0453l.f3240cD = 2;
                    } else if (m681b7.equals("ground2")) {
                        c0453l.f3240cD = 3;
                    } else if (m681b7.equals("air")) {
                        c0453l.f3240cD = 5;
                    } else if (m681b7.equals("top")) {
                        c0453l.f3240cD = 10;
                    } else if (m681b7.equals("wreaks")) {
                        c0453l.f3240cD = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + m681b7);
                    }
                }
                c0453l.f3033cE = c1072ab.m698a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                c0453l.f3034cF = c1072ab.m698a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                c0453l.f3069dw = c1072ab.m700a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                c0453l.f3070dx = c1072ab.m700a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3071dy = c1072ab.m700a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(c0453l.f3070dx)).booleanValue();
                c0453l.f3072dz = c1072ab.m700a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3074dB = c1072ab.m698a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                c0453l.f3075dC = C0455m.m4694a(c0453l, c1072ab, "graphics", "animation_", false);
                Iterator it7 = c1072ab.m669e("effect_").iterator();
                while (it7.hasNext()) {
                    String str11 = (String) it7.next();
                    C0382aw c0382aw = new C0382aw(str11.substring("effect_".length()));
                    c0382aw.m5345a(c0453l, c1072ab, str11);
                    c0453l.f3271fX.add(c0382aw);
                }
                Iterator it8 = c0453l.f3271fX.iterator();
                while (it8.hasNext()) {
                    C0382aw c0382aw2 = (C0382aw) it8.next();
                    if (c0382aw2.alsoEmitEffects != null) {
                        c0382aw2.alsoEmitEffects.m4675c();
                    }
                    if (c0382aw2.alsoEmitEffectsOnDeath != null) {
                        c0382aw2.alsoEmitEffectsOnDeath.m4675c();
                    }
                    if (c0382aw2.ifSpawnFailsEmitEffects != null) {
                        c0382aw2.ifSpawnFailsEmitEffects.m4675c();
                    }
                }
                c0453l.f2995bJ = c1072ab.m700a("graphics", "splastEffect", (Boolean) false).booleanValue();
                c0453l.f2998bM = c1072ab.m700a("graphics", "dustEffect", (Boolean) false).booleanValue();
                c0453l.f2996bK = c1072ab.m700a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                c0453l.f2999bN = c1072ab.m700a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                c0453l.f2997bL = c0453l.f2998bM || c0453l.f2995bJ;
                String m681b8 = c1072ab.m681b("graphics", "movementEffect", (String) null);
                if (m681b8 != null) {
                    c0453l.f3000bO = c0453l.m4753a(m681b8, (C0467y) null);
                    if (c0453l.f3000bO != null && c0453l.f3000bO.m4679a()) {
                        c0453l.f2997bL = true;
                    }
                }
                String m681b9 = c1072ab.m681b("graphics", "movementEffectReverse", (String) null);
                if (m681b9 != null) {
                    c0453l.f3001bP = c0453l.m4753a(m681b9, (C0467y) null);
                    if (c0453l.f3001bP != null && c0453l.f3001bP.m4679a()) {
                        c0453l.f2997bL = true;
                    }
                }
                c0453l.f3003bR = c1072ab.m698a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                c0453l.f3002bQ = c1072ab.m700a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                c0453l.f3005bT = c1072ab.m698a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String m681b10 = c1072ab.m681b("graphics", "repairEffect", (String) null);
                if (m681b10 != null) {
                    c0453l.f3006bU = c0453l.m4753a(m681b10, (C0467y) null);
                    if (c0453l.f3006bU != null && c0453l.f3006bU.m4676b()) {
                        c0453l.f3004bS = true;
                    }
                }
                String m681b11 = c1072ab.m681b("graphics", "repairEffectAtTarget", (String) null);
                if (m681b11 != null) {
                    c0453l.f3007bV = c0453l.m4753a(m681b11, (C0467y) null);
                    if (c0453l.f3007bV != null && c0453l.f3007bV.m4676b()) {
                        c0453l.f3004bS = true;
                    }
                }
                c0453l.f3009bX = c1072ab.m698a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String m681b12 = c1072ab.m681b("graphics", "reclaimEffect", (String) null);
                if (m681b12 != null) {
                    c0453l.f3010bY = c0453l.m4753a(m681b12, (C0467y) null);
                    if (c0453l.f3010bY != null && c0453l.f3010bY.m4676b()) {
                        c0453l.f3008bW = true;
                    }
                }
                String m681b13 = c1072ab.m681b("graphics", "reclaimEffectAtTarget", (String) null);
                if (m681b13 != null) {
                    c0453l.f3011bZ = c0453l.m4753a(m681b13, (C0467y) null);
                    if (c0453l.f3011bZ != null && c0453l.f3011bZ.m4676b()) {
                        c0453l.f3008bW = true;
                    }
                }
                c0453l.f3246dn.m5083a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3246dn.f2804a + "_");
                c0453l.f3247do.m5083a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3247do.f2804a + "_");
                c0453l.f3248dp.m5083a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3248dp.f2804a + "_");
                Iterator it9 = c1072ab.m669e("animation_").iterator();
                while (it9.hasNext()) {
                    String str12 = (String) it9.next();
                    C0441f c0441f = new C0441f(str12.substring("animation_".length()));
                    c0441f.m5083a(c0453l, c1072ab, str12, VariableScope.nullOrMissingString);
                    c0453l.f3245dm.add(c0441f);
                }
                c0453l.f3246dn = c0453l.m4762a(EnumC0456n.move, c0453l.f3246dn, true);
                c0453l.f3247do = c0453l.m4762a(EnumC0456n.idle, c0453l.f3247do, true);
                c0453l.f3248dp = c0453l.m4762a(EnumC0456n.attack, c0453l.f3248dp, true);
                c0453l.f3064dr = c0453l.m4763a(EnumC0456n.underConstruction);
                c0453l.f3065ds = c0453l.m4763a(EnumC0456n.underConstructionWithLinkedBuiltTime);
                if (c0453l.f3064dr != null && c0453l.f3065ds != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                c0453l.f3063dq = c0453l.m4763a(EnumC0456n.created);
                c0453l.f3066dt = c0453l.m4763a(EnumC0456n.queuedUnits);
                if (c0453l.f3066dt != null) {
                    c0453l.f2970bg = true;
                }
                c0453l.f3067du = c0453l.m4763a(EnumC0456n.repair);
                c0453l.f3068dv = c0453l.m4763a(EnumC0456n.reclaim);
                c0453l.f3241cG.f2239c = c1072ab.m662g("core", "maxHp");
                c0453l.f3241cG.f2243g = c1072ab.m682b("core", "maxShield", (Integer) 0).intValue();
                c0453l.f3035cH = c1072ab.m700a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                c0453l.f3241cG.f2244h = c1072ab.m698a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                c0453l.f3043cP = c1072ab.m700a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                c0453l.f3044cQ = c1072ab.m698a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                c0453l.f3241cG.f2248l = c1072ab.m698a("core", "armour", Float.valueOf(0.0f)).floatValue();
                c0453l.f3036cI = c1072ab.m698a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                c0453l.f3241cG.f2240d = c1072ab.m698a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                c0453l.f3037cJ = c1072ab.m700a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                c0453l.f3038cK = c1072ab.m698a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                c0453l.f3041cN = c1072ab.m698a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                c0453l.f3040cM = c1072ab.m700a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                c0453l.f3039cL = c1072ab.m698a("core", "energyRegenWhenRecharging", Float.valueOf(c0453l.f3038cK)).floatValue();
                c0453l.f3042cO = m5420a(c1072ab, "core", "energyDisplayName", (String) null);
                c0453l.f3045cR = c1072ab.m662g("core", "radius");
                c0453l.f3049cY = c1072ab.m682b("core", "displayRadius", Integer.valueOf(c0453l.f3045cR)).intValue();
                float f2 = c0453l.f3045cR;
                if (f2 < 6.0f) {
                    f2 = 6.0f;
                }
                c0453l.f3050cZ = c1072ab.m698a("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                c0453l.f3051da = c1072ab.m682b("core", "shieldRenderRadius", Integer.valueOf(c0453l.f3045cR)).intValue();
                c0453l.f3052db = c1072ab.m682b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                c0453l.f3242cS = c1072ab.m703a("core", "footprint", c0453l.f3242cS);
                c0453l.f3243cT = c1072ab.m703a("core", "constructionFootprint", c0453l.f3243cT);
                c0453l.f3244cU.m7207a(c0453l.f3242cS);
                c0453l.f3244cU = c1072ab.m703a("core", "displayFootprint", c0453l.f3244cU);
                c0453l.f3046cV = c1072ab.m698a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                c0453l.f3047cW = c1072ab.m698a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                c0453l.f3045cR = (int) (c0453l.f3045cR * c0453l.f3224aF);
                c0453l.f3049cY = (int) (c0453l.f3049cY * c0453l.f3224aF);
                c0453l.f3241cG.f2250n = c1072ab.m682b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                c0453l.f3053dc = c1072ab.m682b("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                c0453l.f3054dd = c1072ab.m698a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                c0453l.f3055de = c1072ab.m698a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                c0453l.f3056df = c1072ab.m698a("core", "exit_dirOffset", (Float) null);
                c0453l.f3057dg = c1072ab.m698a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3058dh = c1072ab.m700a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                c0453l.f3059di = c1072ab.m698a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                c0453l.f3115ew = c1072ab.m682b("core", "softCollisionOnAll", (Integer) 0).intValue();
                c0453l.f3116ex = c1072ab.m700a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (c0453l.f3116ex) {
                    c0453l.f3242cS.m7208a(0, 0, -1, -1);
                }
                c0453l.f3255eE = c1072ab.m700a("core", "hideScorchMark", (Boolean) false).booleanValue();
                c0453l.f3256eF = c1072ab.m700a("graphics", "disableLowHpFire", Boolean.valueOf(c0453l.f3117ey)).booleanValue();
                c0453l.f3257eG = c1072ab.m700a("graphics", "disableLowHpSmoke", Boolean.valueOf(c0453l.f3117ey)).booleanValue();
                c0453l.f2947aG = c1072ab.m700a("core", "isBuilding", (Boolean) false).booleanValue();
                c0453l.f2948aH = c1072ab.m700a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(c0453l.f2947aG)).booleanValue();
                c0453l.f2949aI = c1072ab.m700a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                c0453l.f2950aJ = c1072ab.m700a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                c0453l.f2951aK = c1072ab.m698a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                c0453l.f2952aL = c1072ab.m700a("core", "isUnselectable", (Boolean) false).booleanValue();
                c0453l.f2953aM = c1072ab.m700a("core", "isUnselectableAsTarget", Boolean.valueOf(c0453l.f2952aL)).booleanValue();
                c0453l.f3169fJ = c1072ab.m720a(c0453l, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (C0449h) null);
                c0453l.f2954aN = c1072ab.m700a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                c0453l.f2955aO = c1072ab.m700a("core", "canNotBeDamaged", Boolean.valueOf(c0453l.f2954aN)).booleanValue();
                c0453l.f2956aP = c1072ab.m700a("core", "showOnMinimap", (Boolean) true).booleanValue();
                c0453l.f2957aQ = c1072ab.m700a("core", "showOnMinimapToEnemies", Boolean.valueOf(c0453l.f3241cG.f2249m)).booleanValue();
                c0453l.f2958aR = c1072ab.m720a(c0453l, "core", "canOnlyBeAttackedByUnitsWithTags", (C0449h) null);
                if (c0453l.f2954aN && c0453l.f2958aR != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                c0453l.f2959aS = c1072ab.m700a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                c0453l.f2960aT = c1072ab.m700a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                c0453l.f2961aU = c1072ab.m700a("core", "canRepairUnits", (Boolean) false).booleanValue();
                c0453l.f2962aV = c1072ab.m700a("core", "autoRepair", (Boolean) false).booleanValue();
                if (c0453l.f2962aV) {
                    c0453l.m4768a(C0388b.f2326a);
                }
                c0453l.f3241cG.f2251o = c1072ab.m682b("core", "nanoRange", (Integer) (-1)).intValue();
                if (c0453l.f3241cG.f2251o != -1) {
                    c0453l.f3241cG.f2251o = (int) (c0359aq.f2251o * c0453l.f3224aF);
                }
                c0453l.f2963aX = c1072ab.m700a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f2963aX) {
                    c0453l.f3225aW = 5;
                }
                int intValue2 = c1072ab.m682b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    c0453l.f3225aW = intValue2;
                    c0453l.f3225aW = (int) (c0453l.f3225aW * c0453l.f3224aF);
                }
                c0453l.f2964aZ = c1072ab.m700a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f2964aZ) {
                    c0453l.f3226aY = 5;
                }
                int intValue3 = c1072ab.m682b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    c0453l.f3226aY = intValue3;
                    c0453l.f3226aY = (int) (c0453l.f3226aY * c0453l.f3224aF);
                }
                c0453l.f2965ba = c1072ab.m698a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                c0453l.f2966bb = c1072ab.m698a("core", "nanoReclaimSpeed", Float.valueOf(c0453l.f2965ba * 5.1f)).floatValue();
                c0453l.f3227bc = c1072ab.m698a("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f2967bd = c1072ab.m698a("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                c0453l.f2968be = c1072ab.m698a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f2969bf = c1072ab.m698a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3241cG.f2252p = c1072ab.m698a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f2971bh = c1072ab.m671d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f2972bi = c1072ab.m700a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                c0453l.f2974bk = c1072ab.m700a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i = 4;
                if (c0453l.f3241cG.f2238b > 30000.0f) {
                    i = 8;
                }
                if (c0453l.f2947aG) {
                    i = 7;
                }
                c0453l.f2980bq = c1072ab.m682b("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                c0453l.f2977bn = c1072ab.m700a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                c0453l.f2978bo = c1072ab.m698a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                c0453l.f2979bp = c1072ab.m698a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                c0453l.f2981br = c1072ab.m700a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                c0453l.f2976bm = c1072ab.m682b("core", "fireOnDeath", (Integer) 0).intValue();
                c0453l.f2983bt = (EnumC0233ab) c1072ab.m699a("core", "explodeTypeOnDeath", (Enum) null, EnumC0233ab.class);
                c0453l.f2984bu = c1072ab.m700a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                c0453l.f2982bs = c1072ab.m700a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                c0453l.f2985bv = c1072ab.m700a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(c1072ab.m700a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                c0453l.f2988by = c0453l.m4753a(c1072ab.m681b("core", "effectOnDeath", (String) null), (C0467y) null);
                c0453l.f2987bx = c0453l.m4753a(c1072ab.m681b("core", "effectOnDeathIfUnbuilt", (String) null), (C0467y) null);
                c0453l.f2989bz = C0409bj.m5268a(c0453l, c1072ab.m681b("core", "soundOnDeath", (String) null));
                c0453l.f2986bw = c0453l.m4753a(c1072ab.m681b("core", "effectOnDeathGroundCollision", c1072ab.m681b("core", "effectOnDeathGroundCollosion", (String) null)), (C0467y) null);
                c0453l.f2990bC = C0413bn.m5260a(c0453l, c1072ab, "core", "unitsSpawnedOnDeath");
                c0453l.f2991bD = c1072ab.m700a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                c0453l.f3141ff = c1072ab.m700a("core", "canReclaimResources", (Boolean) false).booleanValue();
                c0453l.f3142fg = c1072ab.m720a(c0453l, "core", "canReclaimResourcesOnlyWithTags", (C0449h) null);
                c0453l.f3143fh = c1072ab.m682b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                c0453l.f3144fi = c1072ab.m720a(c0453l, "core", "canReclaimUnitsOnlyWithTags", (C0449h) null);
                c0453l.f3145fj = c1072ab.m720a(c0453l, "core", "canRepairUnitsOnlyWithTags", (C0449h) null);
                if (c0453l.f3144fi != null && !c0453l.f2961aU && !c0453l.f2960aT) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (c0453l.f3145fj != null && !c0453l.f2961aU && !c0453l.f2960aT) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                c0453l.f3258eH = c1072ab.m682b("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (c0453l.f3258eH < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                c0453l.f3123eI = c1072ab.m683b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                c0453l.f3125eK = C0448g.m5058a(c1072ab.m681b("core", "transportUnitsRequireTag", (String) null));
                String m681b14 = c1072ab.m681b("core", "transportUnitsRequireMovementType", (String) null);
                if (m681b14 != null) {
                    for (String str13 : m681b14.split(",")) {
                        c0453l.f3259eL.add(EnumC0246ao.m5750a(str13.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                c0453l.f3124eJ = c1072ab.m700a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                c0453l.f3126eM = c1072ab.m700a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(c0453l.f3259eL.size() == 0)).booleanValue();
                c0453l.f3127eN = c1072ab.m700a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                c0453l.f3129eP = c1072ab.m719a(c0453l, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                c0453l.f3130eQ = c1072ab.m719a(c0453l, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                c0453l.f3131eR = c1072ab.m719a(c0453l, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                c0453l.f3133eT = c1072ab.m698a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                c0453l.f3134eX = c1072ab.m719a(c0453l, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (c0453l.f3134eX != null) {
                    c0453l.f3135eY = c0453l.f3134eX;
                } else {
                    c0453l.f3134eX = C0453l.f3189eV;
                    c0453l.f3135eY = C0453l.f3190eW;
                }
                c0453l.f3128eO = c1072ab.m700a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(c0453l.f3134eX != LogicBoolean.falseBoolean)).booleanValue();
                c0453l.f3132eS = c1072ab.m700a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(c0453l.f3132eS)).booleanValue();
                c0453l.f3260eU = c1072ab.m682b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i2 = -1; i2 <= 29; i2++) {
                    String str14 = "builtFrom_" + i2 + "_";
                    if (i2 == -1) {
                        str14 = "builtFrom_";
                    }
                    String str15 = str14 + "name";
                    String m681b15 = c1072ab.m681b("core", str15, (String) null);
                    if (m681b15 != null) {
                        for (String str16 : m681b15.split(",")) {
                            String trim3 = str16.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                C0458p c0458p = new C0458p();
                                c0458p.f3324a = trim3;
                                c0458p.f3325b = c1072ab.m698a("core", str14 + "pos", Float.valueOf(999.0f)).floatValue();
                                c0458p.f3326c = c1072ab.m700a("core", str14 + "forceNano", (Boolean) false).booleanValue();
                                c0458p.f3327d = "[core]" + str15;
                                c0458p.f3329f = c1072ab.m719a(c0453l, "core", str14 + "isLocked", (LogicBoolean) null);
                                c0458p.f3330g = m5420a(c1072ab, "core", str14 + "isLockedMessage", (String) null);
                                if (c0458p.f3329f == LogicBoolean.falseBoolean) {
                                    c0458p.f3329f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    c0453l.f3272ga.add(c0458p);
                                }
                            }
                        }
                    }
                }
                for (int i3 = 0; i3 <= 50; i3++) {
                    if (c1072ab.m681b("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                        m5400b(c0453l, c1072ab, "core", "canBuild_" + i3 + "_", false);
                    }
                }
                Iterator it10 = c1072ab.m669e("canBuild_").iterator();
                while (it10.hasNext()) {
                    m5400b(c0453l, c1072ab, (String) it10.next(), VariableScope.nullOrMissingString, true);
                }
                c0453l.f3136fa = C0402bc.m5290a(c0453l, c1072ab);
                c0453l.f3137fb = EnumC0246ao.m5750a(c1072ab.m668e("movement", "movementType"), "movementType");
                if (!c0453l.f2947aG) {
                    c0453l.f3138fc = c0453l.f3137fb;
                } else {
                    c0453l.f3138fc = EnumC0246ao.f1702a;
                }
                Boolean m700a = c1072ab.m700a("ai", "useAsBuilder", (Boolean) null);
                c0453l.f3149fn = c1072ab.m700a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean m700a2 = c1072ab.m700a("core", "isBuilder", (Boolean) null);
                if (m700a2 == null) {
                    m700a2 = m700a == null ? false : m700a;
                } else if (m700a == null) {
                    m700a = m700a2;
                }
                if (m700a == null) {
                    m700a = false;
                }
                c0453l.f3146fk = m700a2.booleanValue();
                c0453l.f3147fl = m700a.booleanValue();
                if (!c0453l.f3146fk && c0453l.f3147fl) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + c0453l.f3147fl + " [core]isBuilder:" + c0453l.f3146fk);
                }
                if (c0453l.f3141ff) {
                    c0453l.f3148fm = true;
                }
                Boolean m700a3 = c1072ab.m700a("ai", "useAsHarvester", (Boolean) null);
                if (m700a3 != null) {
                    c0453l.f3148fm = m700a3.booleanValue();
                }
                Boolean m700a4 = c1072ab.m700a("ai", "useAsTransport", (Boolean) null);
                if (m700a4 == null) {
                    m700a4 = Boolean.valueOf(c0453l.f3258eH > 0 && !c0453l.f3147fl && !c0453l.f2947aG);
                    if (!c0453l.f3128eO) {
                        m700a4 = false;
                    }
                }
                c0453l.f3150fo = m700a4.booleanValue();
                if (c0453l.f2947aG) {
                    c0453l.f2940ar = AbstractC0488d.f3424q;
                } else if (c0453l.f3137fb == EnumC0246ao.f1705d) {
                    c0453l.f2940ar = AbstractC0309b.f1846n;
                } else if (c0453l.f3137fb == EnumC0246ao.f1706e) {
                    c0453l.f2940ar = AbstractC0590f.f3844q;
                } else if (c0453l.f3137fb == EnumC0246ao.f1707f) {
                    if (c0453l.f3019ck) {
                        c0453l.f2940ar = AbstractC0529j.f3646dM;
                    } else if (c0453l.m4718l()) {
                        c0453l.f2940ar = Builder.f3588h;
                    } else {
                        c0453l.f2940ar = AbstractC0525h.f3630n;
                    }
                } else if (c0453l.f3019ck) {
                    c0453l.f2940ar = AbstractC0529j.f3646dM;
                } else if (c0453l.m4718l()) {
                    c0453l.f2940ar = Builder.f3588h;
                } else {
                    c0453l.f2940ar = AbstractC0529j.f3645dL;
                }
                BitmapOrTexture m4757a = c0453l.m4757a(c1072ab, "graphics", "icon_zoomed_out", false);
                if (m4757a != null) {
                    c0453l.f2940ar = c0453l.m4759a(m4757a, c0453l.f2931ab);
                }
                if (c1072ab.m700a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    c0453l.f2940ar = null;
                }
                c0453l.f2903s = c1072ab.m700a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                c0453l.f2904t = c1072ab.m700a("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                c0453l.f2905u = c1072ab.m700a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                c0453l.f2906v = c1072ab.m700a("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                c0453l.f2907w = c1072ab.m700a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                c0453l.f2908x = c1072ab.m700a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                c0453l.f2909y = c1072ab.m700a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                c0453l.f3203z = c1072ab.m700a("graphics", "showSelectionIndicator", (Boolean) true).booleanValue();
                c0453l.f3139fd = c1072ab.m700a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                c0453l.f3140fe = c1072ab.m700a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                c0453l.f3241cG.f2246j = c1072ab.m698a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3224aF;
                c0453l.f3080dH = c1072ab.m698a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3224aF;
                c0453l.f3081dI = c1072ab.m698a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3224aF;
                Boolean m700a5 = c1072ab.m700a("movement", "ignoreMoveOrders", (Boolean) null);
                if (c0453l.f2947aG) {
                    c0453l.f3082dJ = true;
                }
                if (m700a5 != null) {
                    if (m700a5.booleanValue()) {
                        c0453l.f3082dJ = true;
                        if (c0453l.f3241cG.f2246j > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (c0453l.f2947aG) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                c0453l.f3099ee = c1072ab.m698a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (c0453l.f3099ee <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                c0453l.f3100ef = 1.0f / c0453l.f3099ee;
                c0453l.f3101eg = c1072ab.m698a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String m681b16 = c1072ab.m681b("movement", "landOnGround", "false");
                if (m681b16.equalsIgnoreCase("false")) {
                    c0453l.f3083dK = false;
                } else if (m681b16.equalsIgnoreCase("onlyIdle")) {
                    c0453l.f3083dK = true;
                    c0453l.f3084dL = true;
                } else if (m681b16.equalsIgnoreCase("true")) {
                    c0453l.f3083dK = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + m681b16);
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (c0453l.f3137fb == EnumC0246ao.f1705d) {
                    f3 = 35.0f;
                    f4 = 1.5f;
                }
                c0453l.f3249dM = c1072ab.m698a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3085dN = c1072ab.m698a("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                c0453l.f3086dO = c1072ab.m698a("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                if (c0453l.f3085dN > 80.0f) {
                    c0453l.f2910A = true;
                }
                c0453l.f3250dP = c1072ab.m698a("movement", "heightChangeRate", Float.valueOf(c0453l.f3250dP)).floatValue();
                c0453l.f3251dQ = c1072ab.m698a("movement", "fallingAcceleration", Float.valueOf(c0453l.f3251dQ)).floatValue();
                c0453l.f3252dR = c1072ab.m698a("movement", "fallingAccelerationDead", Float.valueOf(c0453l.f3252dR)).floatValue();
                c0453l.f3241cG.f2247k = c1072ab.m698a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3102ej = c1072ab.m698a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                c0453l.f3087dS = c1072ab.m700a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                c0453l.f3088dT = c1072ab.m700a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                c0453l.f3089dU = c1072ab.m682b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                c0453l.f3098ed = c1072ab.m700a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                c0453l.f3090dV = c1072ab.m698a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * c0453l.f3224aF;
                c0453l.f3091dW = c1072ab.m698a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                c0453l.f3078dF = c1072ab.m700a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String m681b17 = c1072ab.m681b("attack", "attackMovement", "normal");
                c0453l.f3092dX = EnumC0307b.f1828a;
                if (m681b17.equalsIgnoreCase("normal")) {
                    c0453l.f3092dX = EnumC0307b.f1828a;
                }
                if (m681b17.equalsIgnoreCase("strafing")) {
                    c0453l.f3092dX = EnumC0307b.f1829b;
                }
                if (m681b17.equalsIgnoreCase("bomber")) {
                    c0453l.f3092dX = EnumC0307b.f1831d;
                }
                c0453l.f3095ea = c1072ab.m700a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                c0453l.f3096eb = c1072ab.m700a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                c0453l.f3097ec = c1072ab.m700a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                c0453l.f3093dY = c1072ab.m698a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3094dZ = c1072ab.m698a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float m698a = c1072ab.m698a("attack", "maxAttackRange", (Float) null);
                if (m698a != null) {
                    z = true;
                    c0453l.f3241cG.f2245i = m698a.floatValue() * c0453l.f3224aF;
                } else {
                    z = false;
                    c0453l.f3241cG.f2245i = 100.0f * c0453l.f3224aF;
                }
                c0453l.f3113eu = c1072ab.m698a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                c0453l.f3079dG = c1072ab.m683b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                c0453l.f3241cG.f2241e = c1072ab.m698a("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3241cG.f2242f = c1072ab.m698a("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3077dE = c1072ab.m700a("attack", "showRangeUIGuide", (Boolean) null);
                c0453l.f3119eA = c1072ab.m700a("attack", "isMelee", (Boolean) false).booleanValue();
                c0453l.f3120eB = 0.0f;
                Float m698a2 = c1072ab.m698a("attack", "meleeEngangementDistance", (Float) null);
                if (c0453l.f3119eA) {
                    c0453l.f3120eB = 250.0f;
                    if (m698a2 != null) {
                        c0453l.f3120eB = m698a2.floatValue();
                    }
                } else if (m698a2 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                m5433a(m2612a, EnumC0349ag.unitParsePartA);
                Iterator it11 = c1072ab.m669e("projectile_").iterator();
                while (it11.hasNext()) {
                    String str17 = (String) it11.next();
                    String substring2 = str17.substring("projectile_".length());
                    if (c0453l.m4729f(substring2) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring2);
                    }
                    C0405bf c0405bf = new C0405bf();
                    c0405bf.f2513bh = substring2;
                    c0405bf.f2515bj = c0453l;
                    C0405bf.m5281a(c0405bf, c0453l, c1072ab, str17);
                }
                int size = c0453l.f3266fO.size();
                if (size < 1) {
                    size = 1;
                }
                c0453l.f3171fM = new C0405bf[size];
                for (int i4 = 0; i4 < c0453l.f3266fO.size(); i4++) {
                    C0405bf c0405bf2 = (C0405bf) c0453l.f3266fO.get(i4);
                    c0405bf2.f2514bi = i4;
                    c0453l.f3171fM[i4] = c0405bf2;
                }
                for (int i5 = 0; i5 < c0453l.f3171fM.length; i5++) {
                    C0405bf c0405bf3 = c0453l.f3171fM[i5];
                    if (c0405bf3 != null) {
                        c0405bf3.f1164w *= c0453l.f3224aF;
                        c0405bf3.f1188au *= c0453l.f3224aF;
                        c0405bf3.f1197aF *= c0453l.f3224aF;
                    }
                }
                if (c0453l.f3171fM[0] == null) {
                    C0405bf c0405bf4 = new C0405bf();
                    c0405bf4.f2514bi = 0;
                    c0405bf4.f2513bh = "1";
                    c0405bf4.f1099b = 10;
                    c0453l.f3266fO.add(c0405bf4);
                    c0453l.f3171fM[0] = c0405bf4;
                }
                ArrayList arrayList = c0453l.f3265fN;
                Iterator it12 = c1072ab.m669e("turret_").iterator();
                while (it12.hasNext()) {
                    String str18 = (String) it12.next();
                    String substring3 = str18.substring("turret_".length());
                    if (c0453l.m4731e(substring3) != null) {
                        throw new RuntimeException("Two turrets found with the same name:" + substring3);
                    }
                    C0411bl c0411bl = new C0411bl();
                    c0411bl.f2542a = substring3;
                    c0411bl.f2543b = str18;
                    arrayList.add(c0411bl);
                }
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    C0411bl c0411bl2 = (C0411bl) it13.next();
                    C0411bl.m5265a(c0411bl2, c0453l, c1072ab, c0411bl2.f2543b);
                }
                if (arrayList.size() == 0) {
                    C0411bl c0411bl3 = new C0411bl();
                    c0411bl3.f2547f = 0.0f;
                    c0411bl3.f2548g = 0.0f;
                    c0411bl3.f2542a = "1";
                    c0411bl3.f2600m = c0453l.f3079dG;
                    arrayList.add(c0411bl3);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.get(size2) != null) {
                        ((C0411bl) arrayList.get(size2)).f2546e = size2;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    if (arrayList.get(size3) != null) {
                        C0411bl c0411bl4 = (C0411bl) arrayList.get(size3);
                        if (c0411bl4.f2555y != null) {
                            c0411bl4.f2608w = c0411bl4.f2555y.f2546e;
                            if (c0411bl4.f2555y.f2555y != null) {
                                throw new RuntimeException(c0411bl4.f2542a + ": Turret can not be attached to turret that is also attached to a turret");
                            }
                        }
                        if (c0411bl4.f2556z != null) {
                            c0411bl4.f2609x = c0411bl4.f2556z.f2546e;
                        }
                        if (c0411bl4.f2615W < 0.0f) {
                            c0411bl4.f2615W = c0411bl4.f2614V;
                        }
                    }
                }
                if (arrayList.size() > 31) {
                    throw new RuntimeException("Turret max count per unit is: 31");
                }
                c0453l.f3264fL = (C0411bl[]) arrayList.toArray(new C0411bl[0]);
                c0453l.f3076dD = c0453l.f3241cG.f2245i;
                float f5 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    C0411bl c0411bl5 = (C0411bl) it14.next();
                    c0411bl5.f2574X *= c0453l.f3224aF;
                    c0411bl5.f2547f *= c0453l.f3224aF;
                    c0411bl5.f2548g *= c0453l.f3224aF;
                    c0411bl5.f2575Y *= c0453l.f3224aF;
                    c0411bl5.f2616Z *= c0453l.f3224aF;
                    boolean z5 = false;
                    if (c0411bl5.f2610B) {
                        if (c0411bl5.f2617ab >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (c0453l.f3076dD > c0411bl5.f2617ab) {
                                c0453l.f3076dD = c0411bl5.f2617ab;
                            }
                            if (f5 < c0411bl5.f2617ab) {
                                f5 = c0411bl5.f2617ab;
                            }
                            if (CommonUtils.m2294c(c0411bl5.f2617ab - c0453l.f3241cG.f2245i) > 5.0f) {
                                boolean z6 = false;
                                Iterator it15 = c0453l.f3200o.iterator();
                                while (it15.hasNext()) {
                                    if (CommonUtils.m2294c(c0411bl5.f2617ab - ((C0466x) it15.next()).f3351a) < 5.0f) {
                                        z6 = true;
                                    }
                                }
                                if (!z6) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (c0411bl5.f2577ac != null) {
                        z5 = c0411bl5.f2577ac.booleanValue();
                    }
                    if (z5) {
                        C0466x c0466x = new C0466x();
                        c0466x.f3351a = c0411bl5.f2617ab;
                        c0453l.f3200o.add(c0466x);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        c0453l.f3241cG.f2245i = f5;
                    } else if (f5 < c0453l.f3241cG.f2245i) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String m681b18 = c1072ab.m681b("attack", "setMainTurretAs", (String) null);
                if (m681b18 != null) {
                    c0453l.f3073dA = c0453l.m4731e(m681b18);
                    if (c0453l.f3073dA == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + m681b18);
                    }
                } else {
                    c0453l.f3073dA = c0453l.m4731e("1");
                    if (c0453l.f3073dA == null) {
                        c0453l.f3073dA = c0453l.f3264fL[0];
                    }
                }
                m5433a(m2612a, EnumC0349ag.unitParsePartB);
                long m2612a3 = C0727bl.m2612a();
                if (c1072ab.m653l("core", "action_")) {
                    for (int i6 = 0; i6 <= 50; i6++) {
                        m5426a(c0453l, c1072ab, "core", "action_" + i6 + "_", VariableScope.nullOrMissingString + i6, false, false);
                    }
                }
                Iterator it16 = c1072ab.m669e("action_").iterator();
                while (it16.hasNext()) {
                    String str19 = (String) it16.next();
                    String substring4 = str19.substring("action_".length());
                    if (c0453l.m4727g(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    m5426a(c0453l, c1072ab, str19, VariableScope.nullOrMissingString, substring4, true, false);
                }
                Iterator it17 = c1072ab.m669e("hiddenAction_").iterator();
                while (it17.hasNext()) {
                    String str20 = (String) it17.next();
                    String substring5 = str20.substring("hiddenAction_".length());
                    if (c0453l.m4727g(substring5) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring5);
                    }
                    m5426a(c0453l, c1072ab, str20, VariableScope.nullOrMissingString, substring5, true, true);
                }
                m5433a(m2612a3, EnumC0349ag.actionParse);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 <= 1) {
                    boolean z7 = i7 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i8 = 1; i8 < 21; i8++) {
                        String str21 = z7 ? "leg_" + i8 : "arm_" + i8;
                        if (c1072ab.m663g(str21)) {
                            C0384ay c0384ay = new C0384ay();
                            C0384ay.m5343a(c0384ay, c0453l, c1072ab, str21, z7, arrayList4);
                            arrayList4.add(c0384ay);
                        } else {
                            arrayList4.add(null);
                        }
                    }
                    i7++;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it18 = arrayList2.iterator();
                while (it18.hasNext()) {
                    C0384ay c0384ay2 = (C0384ay) it18.next();
                    if (c0384ay2 != null) {
                        arrayList5.add(c0384ay2);
                    }
                }
                Iterator it19 = arrayList3.iterator();
                while (it19.hasNext()) {
                    C0384ay c0384ay3 = (C0384ay) it19.next();
                    if (c0384ay3 != null) {
                        arrayList5.add(c0384ay3);
                    }
                }
                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                    ((C0384ay) arrayList5.get(size4)).f2271a = size4;
                }
                c0453l.f3220aw = (C0384ay[]) arrayList5.toArray(new C0384ay[0]);
                if (c0453l.f3220aw.length > 0) {
                    c0453l.m4768a(C0393g.f2409a);
                }
                Iterator it20 = c0453l.f3245dm.iterator();
                while (it20.hasNext()) {
                    ((C0441f) it20.next()).m5084a(c0453l);
                }
                m5401b(c0453l);
                String m681b19 = c1072ab.m681b("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (m681b19 != null && !"NONE".equalsIgnoreCase(m681b19)) {
                    C0411bl m4731e = c0453l.m4731e(m681b19);
                    if (m4731e == null) {
                        throw new RuntimeException("Cannot find turret:" + m681b19 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    c0453l.f3229bB = m4731e.f2546e;
                }
                C0389c.m5322a(c0453l, c1072ab);
                c0453l.f2973bj = c1072ab.m700a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                c0453l.f2975bl = c1072ab.m700a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                c0453l.f3103ek = c1072ab.m672d("attack", "canAttack");
                if (c0453l.f3103ek) {
                    c0453l.f3104el = c1072ab.m722a(c0453l, "attack", "canAttackFlyingUnits");
                    c0453l.f3105em = c1072ab.m722a(c0453l, "attack", "canAttackLandUnits");
                    c0453l.f3106en = c1072ab.m722a(c0453l, "attack", "canAttackUnderwaterUnits");
                } else {
                    c0453l.f3104el = c1072ab.m719a(c0453l, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    c0453l.f3105em = c1072ab.m719a(c0453l, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    c0453l.f3106en = c1072ab.m719a(c0453l, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                c0453l.f3107eo = c1072ab.m719a(c0453l, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(c0453l.f3107eo)) {
                    c0453l.f3107eo = null;
                }
                c0453l.f3109eq = c1072ab.m720a(c0453l, "attack", "canOnlyAttackUnitsWithTags", (C0449h) null);
                c0453l.f3110er = c1072ab.m720a(c0453l, "attack", "canOnlyAttackUnitsWithoutTags", (C0449h) null);
                if (c0453l.f3109eq != null || c0453l.f3110er != null) {
                    c0453l.f3108ep = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it21 = arrayList.iterator();
                while (it21.hasNext()) {
                    C0411bl c0411bl6 = (C0411bl) it21.next();
                    if (c0411bl6.f2570O != null && c0411bl6.f2570O.m5052a(c0453l.f3109eq)) {
                        c0411bl6.f2570O = null;
                    }
                    if (c0411bl6.f2571P != null && c0411bl6.f2571P.m5052a(c0453l.f3110er)) {
                        c0411bl6.f2571P = null;
                    }
                    if (c0411bl6.f2610B) {
                        if (c0411bl6.f2570O != null || c0411bl6.f2571P != null) {
                            z8 = true;
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (z8 && !z9) {
                    c0453l.f3111es = true;
                    c0453l.f3108ep = true;
                }
                c0453l.f3112et = c1072ab.m700a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                c0453l.f3167fH = c1072ab.m700a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                c0453l.f3168fI = c1072ab.m700a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (c0453l.f3103ek && c0453l.f3168fI) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                c0453l.f3152fq = c1072ab.m720a(c0453l, "ai", "aiTags", (C0449h) null);
                c0453l.f3153fr = c1072ab.m700a("ai", "disableUse", (Boolean) false).booleanValue();
                c0453l.f3156fu = c1072ab.m698a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                c0453l.f3157fv = c1072ab.m682b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                c0453l.f3158fw = c1072ab.m698a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                c0453l.f3155ft = c1072ab.m682b("ai", "maxEachBase", Integer.valueOf(CommonUtils.m2311b(2, c0453l.f3157fv))).intValue();
                c0453l.f3154fs = c1072ab.m682b("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (c0453l.f3155ft < c0453l.f3157fv) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!c0453l.f2947aG) {
                    if (c1072ab.m651n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (c1072ab.m651n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                c0453l.f3161fz = c1072ab.m682b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                c0453l.f3162fA = c1072ab.m682b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                c0453l.f3163fB = c1072ab.m700a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                c0453l.f3164fC = c1072ab.m720a(c0453l, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (C0449h) null);
                c0453l.f3159fx = c1072ab.m698a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                c0453l.f3159fx = c1072ab.m698a("ai", "noneInBaseExtraPriority", Float.valueOf(c0453l.f3159fx)).floatValue();
                c0453l.f3160fy = c1072ab.m698a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                c0453l.f3160fy = c1072ab.m698a("ai", "noneGlobalExtraPriority", Float.valueOf(c0453l.f3160fy)).floatValue();
                c0453l.f3165fD = c1072ab.m681b("ai", "upgradedFrom", (String) null);
                Float m698a3 = c1072ab.m698a("ai", "ai_upgradePriority", (Float) null);
                if (m698a3 != null && m698a3.floatValue() != -1.0f) {
                    if (m698a3.floatValue() >= 0.0f && m698a3.floatValue() <= 1.0f) {
                        c0453l.f3262fF = m698a3.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + c0453l.f3262fF + " must be between 0-1 or -1 for default");
                    }
                }
                if (c0453l.f3103ek) {
                    for (int i9 = 0; i9 < c0453l.f3264fL.length; i9++) {
                        C0411bl c0411bl7 = c0453l.f3264fL[i9];
                        if (c0411bl7.f2610B && c0411bl7.f2583ao == null && c0453l.f2906v) {
                            if (c0411bl7.f2600m > 140.0f && (c0453l.f3253eh == -1 || c0453l.f3264fL[c0453l.f3253eh].f2600m < c0411bl7.f2600m)) {
                                c0453l.f3253eh = i9;
                            }
                            if (c0411bl7.f2601n > 80.0f) {
                                c0453l.f3254ei = i9;
                            }
                        }
                    }
                }
                if (c0453l.f3240cD == -2) {
                    if (c0453l.f3137fb == EnumC0246ao.f1705d) {
                        c0453l.f3240cD = 5;
                    } else if (c0453l.m4722j()) {
                        if (c0453l.f3212ak != null) {
                            c0453l.f3240cD = 3;
                        } else {
                            c0453l.f3240cD = 2;
                        }
                    } else if (c0453l.f3085dN < -2.0f) {
                        c0453l.f3240cD = 1;
                    } else if (c0453l.f3258eH > 0) {
                        c0453l.f3240cD = 3;
                    } else {
                        c0453l.f3240cD = 2;
                    }
                }
                if (c0453l.f3269fR.size() > 0) {
                    c0453l.f3172fS = true;
                    C1101m c1101m = new C1101m();
                    C1101m c1101m2 = new C1101m();
                    C1101m c1101m3 = new C1101m();
                    Iterator it22 = c0453l.f3269fR.iterator();
                    while (it22.hasNext()) {
                        C0460r c0460r = (C0460r) it22.next();
                        if (c0460r.f3333c == EnumC0461s.everyFrame) {
                            c1101m.add(c0460r);
                        } else if (c0460r.f3333c == EnumC0461s.every4Frames) {
                            c1101m2.add(c0460r);
                        } else if (c0460r.f3333c == EnumC0461s.every8Frames) {
                            c1101m3.add(c0460r);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + c0460r.f3333c);
                        }
                    }
                    c0453l.f3173fT = (C0460r[]) c1101m.toArray(new C0460r[0]);
                    c0453l.f3174fU = (C0460r[]) c1101m2.toArray(new C0460r[0]);
                    c0453l.f3175fV = (C0460r[]) c1101m3.toArray(new C0460r[0]);
                }
                if (c0453l.f3276gj != null && c0453l.f3276gj.size() > 0) {
                    Iterator it23 = c0453l.f3276gj.iterator();
                    while (it23.hasNext()) {
                        ((C0462t) it23.next()).m4686a(c0453l);
                    }
                }
                m5433a(m2612a, EnumC0349ag.unitParsePartC);
                c1072ab.m687b();
                Iterator it24 = c1072ab.f6825d.iterator();
                while (it24.hasNext()) {
                    C1073ac c1073ac = (C1073ac) it24.next();
                    if (c1073ac.m650a() != null && (c1073ac.m650a().startsWith("hiddenAction_") || c1073ac.m650a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + c1073ac.m650a() + "]" + c1073ac.m649b() + " has been repeated");
                    }
                    String str22 = "Repeated key " + c1073ac;
                    c0453l.m4705r(str22);
                    if (c0453l.f2924Q >= 1) {
                        GameEngine.PrintLog("Converting warning to error (meta.strictLevel=" + c0453l.f2924Q + ")");
                        throw new C0412bm(str22);
                    }
                }
                Iterator it25 = c1072ab.f6826e.iterator();
                while (it25.hasNext()) {
                    String str23 = "Skipping line, unexpected format: '" + ((String) it25.next()) + "'";
                    c0453l.m4705r(str23);
                    if (c0453l.f2924Q >= 1) {
                        GameEngine.PrintLog("Converting warning to error (meta.strictLevel=" + c0453l.f2924Q + ")");
                        throw new C0412bm(str23);
                    }
                }
                if (c0824b != null) {
                    c0824b.f5440E++;
                }
                synchronized (C0453l.f3184c) {
                    C0453l.f3184c.add(c0453l);
                }
                m5433a(m2612a, EnumC0349ag.unitParsePartD);
                return c0453l;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0412bm e2) {
            m5412a(str, e2, c0824b);
            return null;
        } catch (OutOfMemoryError e3) {
            f2198l++;
            m5412a(str, new RuntimeException(e3), c0824b);
            return null;
        } catch (RuntimeException e4) {
            m5412a(str, e4, c0824b);
            return null;
        }
    }

    /* renamed from: a */
    public static void m5413a(String str, Exception exc, InterfaceC0303as interfaceC0303as) {
        C0824b c0824b = null;
        if (interfaceC0303as instanceof C0453l) {
            c0824b = ((C0453l) interfaceC0303as).f2917I;
        }
        m5412a(str, exc, c0824b);
    }

    /* renamed from: a */
    public static String m5422a(C0824b c0824b, String str, boolean z) {
        if (c0824b != null) {
            String m2437n = C0750a.m2437n(c0824b.f5426q);
            str = C0750a.m2437n(str);
            if (str.startsWith(m2437n)) {
                str = str.substring(m2437n.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + c0824b.m1846a() + ")";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m5412a(String str, Exception exc, C0824b c0824b) {
        String m2304b;
        String str2;
        GameEngine.m1145b("Error while loading unit:" + str);
        GameEngine.m1136c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0412bm) {
            m2304b = exc.getMessage();
        } else {
            m2304b = CommonUtils.m2304b(exc);
        }
        if (m2304b == null) {
            m2304b = "<No error cause>";
        }
        if (!m2304b.contains("unit config file")) {
            m2304b = m2304b.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String m5422a = m5422a(c0824b, str, true);
        if (c0824b != null) {
            str2 = "Error loading unit: " + m5422a + ": \n" + m2304b;
        } else if (m2304b.contains("Error loading core unit")) {
            str2 = m2304b;
        } else {
            str2 = "Error loading core unit: " + m5422a + ": \n" + m2304b + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof C0412bm) {
            C0412bm c0412bm = (C0412bm) exc;
            if (c0412bm.f2631c != null || c0412bm.f2632d != null) {
                str2 = str2 + " (section:" + c0412bm.f2631c + ", key:" + c0412bm.f2632d + ")";
            }
        }
        boolean z = false;
        if (c0824b != null) {
            z = c0824b.f5415f;
        }
        if (!z) {
        }
        if (f2208s != null) {
            f2208s = str2;
        }
        if (c0824b != null) {
            c0824b.m1843a(str2);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str2, exc);
        }
    }

    /* renamed from: b */
    public static void m5400b(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        String m681b = c1072ab.m681b(str, str2 + "name", (String) null);
        if (m681b == null) {
            return;
        }
        for (String str3 : m681b.split(",")) {
            String trim = str3.trim();
            C0339d c0339d = new C0339d();
            c0339d.f2055j = trim;
            c0339d.f2059n = c1072ab.m700a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2122o = c1072ab.m698a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2118aG = c1072ab.m682b(str, str2 + "tech", (Integer) 1).intValue();
            c0339d.f2119aH = c1072ab.m700a(str, str2 + "forceNano", (Boolean) false).booleanValue();
            c0339d.f2120aI = c1072ab.m681b(str, str2 + "type", (String) null);
            c0339d.f2060p = C0424b.m5218a(c0453l, c1072ab, str, str2 + "price", (C0424b) null);
            c0339d.f2115aC = c1072ab.m719a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2065u = c1072ab.m719a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2069y = c1072ab.m719a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2070z = m5427a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2069y != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2069y == LogicBoolean.falseBoolean) {
                c0339d.f2069y = null;
            }
            c0339d.f2071A = c1072ab.m719a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2072B = m5427a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2071A != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2071A == LogicBoolean.falseBoolean) {
                c0339d.f2071A = null;
            }
            c0339d.f2073C = c1072ab.m719a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2074D = m5427a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2073C != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2073C == LogicBoolean.falseBoolean) {
                c0339d.f2073C = null;
            }
            C0424b m5217a = C0424b.m5217a(c0453l, c1072ab, str, str2 + "addResources", true);
            if (m5217a != null && m5217a.m5197c()) {
                c0339d.f2090ad = m5217a;
            }
            c0339d.f2134aJ = EnumC0341f.build;
            if (!"NONE".equalsIgnoreCase(trim)) {
                c0453l.f3273gb.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static void m5426a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList m5409a;
        C0339d c0339d = new C0339d();
        String m681b = c1072ab.m681b(str, str2 + "convertTo", (String) null);
        String m681b2 = c1072ab.m681b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        AbstractC0377ar[] m5362a = C0359aq.m5362a(c1072ab, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (AbstractC0377ar[]) null);
        Float m698a = c1072ab.m698a(str, str2 + "addEnergy", (Float) null);
        C0424b m5217a = C0424b.m5217a(c0453l, c1072ab, str, str2 + "addResources", true);
        c0453l.m4767a(m5217a);
        C0424b m5217a2 = C0424b.m5217a(c0453l, c1072ab, str, str2 + "addResourcesScaledByAIHandicaps", true);
        c0453l.m4767a(m5217a2);
        String m681b3 = c1072ab.m681b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean m686b = c1072ab.m686b(c0453l, str, str2 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean m719a = c1072ab.m719a(c0453l, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String m681b4 = c1072ab.m681b(str, str2 + "alsoTriggerAction", (String) null);
        String m681b5 = c1072ab.m681b(str, str2 + "alsoQueueAction", (String) null);
        String m681b6 = c1072ab.m681b(str, str2 + "spawnEffects", (String) null);
        String m681b7 = c1072ab.m681b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String m681b8 = c1072ab.m681b(str, str2 + "playSoundAtUnit", (String) null);
        String m681b9 = c1072ab.m681b(str, str2 + "playSoundGlobally", (String) null);
        String m681b10 = c1072ab.m681b(str, str2 + "playSoundToPlayer", (String) null);
        String m681b11 = c1072ab.m681b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0336o.m5501a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0326e.m5520a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0329h.m5513a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0322a.m5527a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0332k.m5507a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0323b.m5524a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0325d.m5522a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0333l.m5505a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0328g.m5515a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0334m.m5503a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0327f.m5517a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0331j.m5509a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0330i.m5511a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        LogicBoolean m719a2 = c1072ab.m719a(c0453l, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            if (m681b != null || m681b2 != null || m698a != null || m681b3 != null) {
                z3 = true;
            }
            if (m5217a.m5197c() || m5217a2.m5197c()) {
                z3 = true;
            }
            if (m681b4 != null || m681b5 != null || m681b6 != null || 0 != 0) {
                z3 = true;
            }
            if (m681b8 != null || m681b9 != null || m681b10 != null || m681b11 != null) {
                z3 = true;
            }
            if (c0339d.f2132ab.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(m681b)) {
                m681b = null;
            }
            if ("NONE".equalsIgnoreCase(m681b2)) {
                m681b2 = null;
            }
            if (m681b3 != null && m681b3.equalsIgnoreCase("NONE")) {
                m681b3 = null;
            }
            c0339d.f2047a = c0453l.f3273gb.size();
            c0339d.f2048b = str3;
            c0339d.f2059n = c1072ab.m700a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2062r = C0448g.m5058a(c1072ab.m681b(str, str2 + "tags", (String) null));
            c0339d.f2122o = c1072ab.m698a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2060p = C0424b.m5217a(c0453l, c1072ab, str, str2 + "price", true);
            c0339d.f2061q = C0424b.m5201b(c0453l, c1072ab, str, str2 + "streamingCost", null);
            if (c1072ab.m700a(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (c0339d.f2061q != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                c0339d.f2061q = C0424b.m5201b(c0453l, c1072ab, str, str2 + "price", null);
                c0339d.f2060p = C0424b.f2709a;
            }
            c0453l.m4767a(c0339d.f2060p);
            if (c0339d.f2061q != null) {
                c0453l.m4767a(c0339d.f2061q);
            }
            c0339d.f2123J = c1072ab.m700a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            c0339d.f2124K = c1072ab.m700a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            c0339d.f2125L = c1072ab.m700a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            c0339d.f2127N = c1072ab.m700a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            c0339d.f2126M = c1072ab.m700a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!c0339d.f2125L && !c0339d.f2126M && c0339d.f2127N) {
                c0339d.f2128O = true;
            }
            if (!c0339d.f2125L) {
                c0339d.f2121i = EnumC0226u.f1474a;
            } else {
                c0339d.f2121i = EnumC0226u.f1476c;
            }
            c0339d.f2063s = c1072ab.m719a(c0453l, str, str2 + "requireConditional", (LogicBoolean) null);
            c0339d.f2064t = c1072ab.m719a(c0453l, str, str2 + "isActive", (LogicBoolean) null);
            c0339d.f2065u = c1072ab.m719a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2067w = c1072ab.m700a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            c0339d.f2066v = c1072ab.m700a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(c0339d.f2067w)).booleanValue();
            if (z2) {
                if (c0339d.f2065u != null && !LogicBoolean.isStaticFalse(c0339d.f2065u)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                c0339d.f2065u = LogicBoolean.falseBoolean;
            }
            c0339d.f2069y = c1072ab.m719a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2070z = m5427a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2069y != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2069y == LogicBoolean.falseBoolean) {
                c0339d.f2069y = null;
            }
            c0339d.f2071A = c1072ab.m719a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2072B = m5427a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2071A != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2071A == LogicBoolean.falseBoolean) {
                c0339d.f2071A = null;
            }
            c0339d.f2073C = c1072ab.m719a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2074D = m5427a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2073C != null) {
                c0339d.f2068x = true;
            }
            if (c0339d.f2073C == LogicBoolean.falseBoolean) {
                c0339d.f2073C = null;
            }
            c0339d.f2075E = LogicBoolean.create(c0453l, c1072ab.m681b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (c0339d.f2075E == LogicBoolean.falseBoolean) {
                c0339d.f2075E = null;
            }
            if (c0339d.f2075E != null) {
                c0453l.f3166fE = true;
            }
            c0339d.f2076F = c1072ab.m719a(c0453l, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            c0339d.f2135aK = (EnumC0340e) c1072ab.m699a(str, str2 + "aiUse", c0339d.f2135aK, EnumC0340e.class);
            c0339d.f2079I = c0453l.m4752a(c1072ab.m681b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (c0339d.f2079I != null) {
                c0339d.f2121i = EnumC0226u.f1475b;
                if (m681b != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            c0339d.f2078H = c0453l.m4752a(c1072ab.m681b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            c0339d.f2115aC = c1072ab.m719a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2108av = m5406a(c0453l.f2914E, c1072ab.m681b(str, str2 + "iconImage", "NONE"), c0453l.f2930aa, c0453l, str, str2 + "iconImage");
            c0339d.f2111ay = c1072ab.m719a(c0453l, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (c0339d.f2111ay == LogicBoolean.trueBoolean) {
                c0339d.f2111ay = null;
            }
            c0339d.f2109aw = c0453l.m4758a(c1072ab, str, str2 + "iconExtraImage");
            c0339d.f2110ax = c1072ab.m696a(str, str2 + "iconExtraColor", Integer.valueOf(Color.argb(100, 255, 255, 255))).intValue();
            c0339d.f2112az = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "unitShownInUI", null);
            if (c0339d.f2112az != null && c0339d.f2108av != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            c0339d.f2113aA = c1072ab.m700a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            c0339d.f2114aB = c1072ab.m700a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            c0339d.f2133aD = (EnumC0225t) c1072ab.m699a(str, str2 + "displayType", c0339d.f2133aD, EnumC0225t.class);
            c0339d.f2117aF = c1072ab.m700a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            c0339d.f2049c = m5427a(c0453l, c1072ab, str, str2 + "text", VariableScope.nullOrMissingString);
            c0339d.f2050d = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "textAddUnitName", null);
            c0339d.f2053g = m5420a(c1072ab, str, str2 + "textPostFix", (String) null);
            c0339d.f2051e = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddFromUnit", null);
            c0339d.f2052f = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddUnitStats", null);
            c0339d.f2054h = m5427a(c0453l, c1072ab, str, str2 + "description", VariableScope.nullOrMissingString);
            c0339d.f2129R = c1072ab.m671d(str, str2 + "buildSpeed", Float.valueOf(c0339d.f2129R)).floatValue();
            if (c0339d.f2129R == 0.0f) {
                c0339d.f2129R = 50.0f;
            }
            c0339d.f2130S = c1072ab.m700a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c0339d.f2130S)).booleanValue();
            boolean z4 = false;
            c0339d.f2131T = c1072ab.m700a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(c0339d.f2131T)).booleanValue();
            c0339d.f2082U = c0453l.m4754a(c1072ab.m681b(str, str2 + "whenBuilding_playAnimation", (String) null), c0339d.f2082U);
            c0339d.f2083V = c1072ab.m698a(str, str2 + "whenBuilding_rotateTo", c0339d.f2083V);
            c0339d.f2084W = c1072ab.m700a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c0339d.f2084W)).booleanValue();
            c0339d.f2085X = c1072ab.m700a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c0339d.f2085X)).booleanValue();
            c0339d.f2086Y = c1072ab.m700a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c0339d.f2086Y)).booleanValue();
            String m681b12 = c1072ab.m681b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (m681b12 != null) {
                c0339d.f2087Z = c0453l.m4731e(m681b12);
                if (c0339d.f2087Z == null) {
                    throw new RuntimeException("Cannot find turret:" + m681b12 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (c0339d.f2084W) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (c0339d.f2086Y && c0339d.f2083V == null) {
                c0339d.f2083V = Float.valueOf(0.0f);
            }
            c0339d.f2088aa = c1072ab.m717a(c0453l, str, str2 + "whenBuilding_triggerAction", (C0462t) null);
            c0339d.f2080P = c1072ab.m700a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(c0339d.f2080P)).booleanValue();
            c0339d.f2081Q = C0359aq.m5362a(c1072ab, str, str2 + "convertTo_keepCurrentFields", (AbstractC0377ar[]) null);
            if (m681b2 != null && !"NONE".equalsIgnoreCase(m681b2)) {
                c0339d.f2056k = c0453l.m4752a(m681b2, str2 + "whenBuilding_temporarilyConvertTo", str);
                c0339d.f2057l = m5362a;
                z4 = true;
            }
            if (c0339d.f2131T || c0339d.f2082U != null || c0339d.f2083V != null || c0339d.f2056k != null || c0339d.f2088aa != null) {
                c0453l.f2970bg = true;
            }
            c0339d.f2134aJ = EnumC0341f.convert;
            if (m681b != null && !"NONE".equalsIgnoreCase(m681b)) {
                c0339d.f2077G = c0453l.m4752a(m681b, str2 + "convertTo", str);
                c0339d.f2055j = m681b;
                c0339d.f2126M = false;
                z4 = true;
            }
            if (m698a != null) {
                c0339d.f2089ac = m698a;
                z4 = true;
            }
            if (m5217a != null && m5217a.m5197c()) {
                c0339d.f2090ad = m5217a;
                z4 = true;
            }
            if (m5217a2 != null && m5217a2.m5197c()) {
                c0339d.f2091ae = m5217a2;
                z4 = true;
            }
            c0339d.f2093ag = c1072ab.m704a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            c0339d.f2094ah = c1072ab.m686b(c0453l, str, str2 + "fireTurretXAtGround_withTarget", null);
            c0339d.f2096aj = c1072ab.m682b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            if (c0339d.f2094ah != null && c0339d.f2093ag == null) {
                c0339d.f2093ag = new PointF(0.0f, 0.0f);
            }
            String m681b13 = c1072ab.m681b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (m681b13 != null) {
                c0339d.f2095ai = c0453l.m4729f(m681b13);
                if (c0339d.f2095ai == null) {
                    throw new RuntimeException("Cannot find projectile:" + m681b13 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String m681b14 = c1072ab.m681b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (m681b14 != null) {
                c0339d.f2097ak = EnumC0246ao.m5750a(m681b14, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (m681b3 != null) {
                C0411bl m4731e = c0453l.m4731e(m681b3);
                if (m4731e == null) {
                    throw new RuntimeException("Cannot find turret:" + m681b3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                c0339d.f2092af = Integer.valueOf(m4731e.f2546e);
                if (c0339d.f2093ag == null) {
                    c0339d.f2121i = EnumC0226u.f1480g;
                    if (c0339d.f2079I != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            c0339d.f2098al = m686b;
            c0339d.f2099am = m719a;
            if (m681b4 != null && !"NONE".equalsIgnoreCase(m681b4)) {
                c0339d.f2100an = c0453l.m4736c(m681b4, "alsoTriggerAction", str);
                z4 = true;
            }
            if (m681b5 != null && !"NONE".equalsIgnoreCase(m681b5)) {
                c0339d.f2101ao = c0453l.m4736c(m681b5, "alsoQueueAction", str);
                z4 = true;
            }
            if (m681b6 != null) {
                c0339d.f2102ap = c0453l.m4753a(m681b6, (C0467y) null);
                z4 = true;
            }
            if (m681b7 != null) {
                c0339d.f2103aq = c0453l.m4753a(m681b7, (C0467y) null);
                z4 = true;
            }
            if (m681b8 != null) {
                c0339d.f2104ar = C0409bj.m5268a(c0453l, m681b8);
                z4 = true;
            }
            if (m681b9 != null) {
                c0339d.f2105as = C0409bj.m5268a(c0453l, m681b9);
                z4 = true;
            }
            if (m681b10 != null) {
                c0339d.f2106at = C0409bj.m5268a(c0453l, m681b10);
                z4 = true;
            }
            if (m681b11 != null) {
                c0339d.f2107au = C0409bj.m5268a(c0453l, m681b11);
                z4 = true;
            }
            if (m719a2 != null) {
                c0339d.f2116aE = m719a2;
                z4 = true;
            }
            if (c0339d.f2132ab.size() > 0) {
                z4 = true;
            }
            ArrayList arrayList = null;
            String m681b15 = c1072ab.m681b(str, str2 + "autoTriggerOnEvent", (String) null);
            if (m681b15 != null && (m5409a = m5409a(str, str2 + "autoTriggerOnEvent", m681b15)) != null) {
                if (m5409a.size() < 1) {
                    throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 or more options, got:" + m5409a.size());
                }
                Iterator it = m5409a.iterator();
                while (it.hasNext()) {
                    C0350ah c0350ah = (C0350ah) it.next();
                    try {
                        EnumC0347ae enumC0347ae = (EnumC0347ae) C1072ab.m708a(c0350ah.f2225a, (Enum) null, EnumC0347ae.class);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C0346ad c0346ad = new C0346ad();
                        c0346ad.f2167a = enumC0347ae;
                        if (c0350ah.f2226b != null) {
                            for (String str4 : c0350ah.f2226b.keySet()) {
                                String str5 = (String) c0350ah.f2226b.get(str4);
                                boolean z5 = false;
                                if (str4.equalsIgnoreCase("withtag")) {
                                    if (c0346ad.f2167a != EnumC0347ae.f2184n && c0346ad.f2167a != EnumC0347ae.f2187q) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2167a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withprojectiletag")) {
                                    if (c0346ad.f2167a != EnumC0347ae.f2184n) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2167a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withactiontag")) {
                                    if (c0346ad.f2167a != EnumC0347ae.f2176f && c0346ad.f2167a != EnumC0347ae.f2177g) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2167a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (z5) {
                                    String m2239p = CommonUtils.m2239p(str5);
                                    if (m2239p == null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2167a.name() + " expected quoted string, got: " + str5);
                                    }
                                    if (c0346ad.f2170d != null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2167a.name() + " tag was set twice");
                                    }
                                    c0346ad.f2170d = C1072ab.m655j(str, str2 + "autoTriggerOnEvent", m2239p);
                                } else {
                                    throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: Unknown parameter: " + str4);
                                }
                            }
                            continue;
                        }
                        arrayList.add(c0346ad);
                    } catch (C0412bm e) {
                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + e.getMessage(), e);
                    }
                }
            }
            LogicBoolean m719a3 = c1072ab.m719a(c0453l, str, str2 + "autoTrigger", (LogicBoolean) null);
            String m681b16 = c1072ab.m681b(str, str2 + "autoTrigger", (String) null);
            EnumC0461s enumC0461s = (EnumC0461s) c1072ab.m699a(str, str2 + "autoTriggerCheckRate", c0453l.f3233cb, EnumC0461s.class);
            c0339d.f2058m = z4;
            if (z4 || c0339d.f2065u != null) {
                if (m719a3 != null && z4) {
                    C0460r c0460r = new C0460r();
                    c0460r.f3331a = m719a3;
                    c0460r.f3332b = m681b16;
                    c0460r.f3333c = enumC0461s;
                    c0460r.f3334d = new C0342g(c0339d, c0453l.m4752a(c0339d.f2055j, "[" + str + "]" + str2, str));
                    c0453l.f3269fR.add(c0460r);
                }
                if (arrayList != null && z4) {
                    C0342g c0342g = new C0342g(c0339d, c0453l.m4752a(c0339d.f2055j, "[" + str + "]" + str2, str));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0346ad c0346ad2 = (C0346ad) it2.next();
                        c0346ad2.f2168b = c0342g;
                        c0346ad2.f2169c = c0453l;
                        c0453l.f3277gk.add(c0346ad2);
                    }
                }
                if (c0339d.f2055j != null && c0339d.f2060p != null && c0339d.f2060p.f2698b > 0) {
                    c0453l.f3176gc = true;
                }
                c0453l.f3273gb.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static String m5424a(C0453l c0453l, String str, String str2) {
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
            if (c0453l.f2917I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2917I.f5426q + "/common.ini";
            }
        }
        String str3 = CommonUtils.m2251h(str) + "/";
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str3 + str2;
            }
        }
    }

    /* renamed from: a */
    public static void m5433a(long j, EnumC0349ag enumC0349ag) {
        enumC0349ag.f2223o += C0727bl.m2610a(j);
    }

    /* renamed from: i */
    public static void m5386i() {
        EnumC0349ag[] values;
        GameEngine.PrintLog("==Timing==");
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            GameEngine.PrintLog(enumC0349ag.name() + ": " + C0727bl.m2611a(enumC0349ag.f2223o));
        }
    }

    /* renamed from: j */
    public static void m5385j() {
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            enumC0349ag.f2223o = 0.0d;
        }
    }

    /* renamed from: a */
    public static BitmapOrTexture m5406a(String str, String str2, boolean z, C0453l c0453l, String str3, String str4) {
        try {
            return m5407a(str, str2, z, c0453l);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static BitmapOrTexture m5407a(String str, String str2, boolean z, C0453l c0453l) {
        long m2612a = C0727bl.m2612a();
        BitmapOrTexture m5397b = m5397b(str, str2, z, c0453l);
        m5433a(m2612a, EnumC0349ag.imageLoadOrGet);
        return m5397b;
    }

    /* renamed from: b */
    public static BitmapOrTexture m5397b(String str, String str2, boolean z, C0453l c0453l) {
        BitmapOrTexture mo904a;
        if (str2 == null || str2.equalsIgnoreCase("NONE") || str2.equals(VariableScope.nullOrMissingString)) {
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
            if (c0453l.f2917I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2917I.f5426q + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        String str3 = CommonUtils.m2251h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        BitmapOrTexture m5394c = m5394c(str4);
        if (m5394c != null) {
            return m5394c;
        }
        C1098j m5393c = m5393c(str3, str2, c0453l);
        int i = 0;
        if (f2193e != null) {
            i = f2193e.f5444I;
        }
        if (i > 5) {
            GameEngine.PrintLog("Fast failing to oom image for this mod");
            mo904a = gameEngine.graphics.mo871r();
        } else {
            long m2612a = C0727bl.m2612a();
            try {
                mo904a = gameEngine.graphics.mo904a((InputStream) m5393c, true);
                m5433a(m2612a, EnumC0349ag.imageLoad);
                if (mo904a.mo419A()) {
                    GameEngine.PrintLog("oomErrors:" + f2198l);
                    f2198l++;
                    if (f2193e != null) {
                        f2193e.f5444I++;
                        f2193e.f5445J++;
                    }
                } else if (f2193e != null && !f2193e.f5435z && GameEngine.f6204aZ) {
                    mo904a.m1030z();
                }
            } catch (RuntimeException e) {
                GameEngine.PrintLog("imageStream:" + m5393c);
                throw new RuntimeException("Error decode image from: " + C0750a.m2449d(str3 + str2), e);
            }
        }
        try {
            m5393c.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (mo904a == null) {
            throw new RuntimeException("Failed to decode image: " + C0750a.m2447e(str3 + str2));
        }
        mo904a.mo405a(z);
        if (z2) {
            mo904a = Unit.m5883a(mo904a, mo904a.f6396p, mo904a.f6397q);
        }
        m5421a(mo904a);
        m5415a(str4, mo904a);
        return mo904a;
    }

    /* renamed from: a */
    public static void m5415a(String str, BitmapOrTexture bitmapOrTexture) {
        f2200g.put(str, bitmapOrTexture);
    }

    /* renamed from: c */
    public static BitmapOrTexture m5394c(String str) {
        BitmapOrTexture bitmapOrTexture = (BitmapOrTexture) f2200g.get(str);
        if (bitmapOrTexture != null) {
            f2196j++;
            m5421a(bitmapOrTexture);
            bitmapOrTexture.mo391t();
            return bitmapOrTexture;
        }
        if (f2197k) {
            GameEngine.PrintLog("loadImageInConf: cache miss: " + str);
        }
        f2195i++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0635i m5410a(String str, String str2, C0453l c0453l) {
        long m2612a = C0727bl.m2612a();
        AbstractC0635i m5398b = m5398b(str, str2, c0453l);
        m5433a(m2612a, EnumC0349ag.soundLoadOrGet);
        return m5398b;
    }

    /* renamed from: b */
    public static AbstractC0635i m5398b(String str, String str2, C0453l c0453l) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (!str2.contains(".")) {
            return gameEngine.audio.m3002a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0453l.f2917I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2917I.f5426q + "/common.ini";
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
        String str3 = CommonUtils.m2251h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0635i abstractC0635i = (AbstractC0635i) f2201h.get(str4);
        if (abstractC0635i != null) {
            m5423a(abstractC0635i);
            return abstractC0635i;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            C1098j m5393c = m5393c(str3, str2, c0453l);
            long m2612a = C0727bl.m2612a();
            AbstractC0635i m3001a = gameEngine.audio.m3001a(str2, m5393c, false);
            try {
                m5393c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m5433a(m2612a, EnumC0349ag.soundLoad);
            if (m3001a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                c0453l.m4705r(str5);
                return gameEngine.audio.m2997b("Failed to load");
            }
            m5423a(m3001a);
            f2201h.put(str4, m3001a);
            return m3001a;
        }
    }

    /* renamed from: a */
    public static boolean m5408a(String str, String str2, String str3, C0824b c0824b) {
        if (str2 == null || !str2.contains("..") || GameEngine.m1159as()) {
            return true;
        }
        String canonicalPath = new File(C0750a.m2447e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0750a.m2447e("units")).getCanonicalPath())) {
            return true;
        }
        String m1830k = c0824b.m1830k();
        boolean startsWith = canonicalPath.startsWith(m1830k);
        if (!startsWith) {
            GameEngine.m1145b("File: '" + canonicalPath + "' is not within mod: '" + m1830k + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m5411a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str + str2;
            }
        }
    }

    /* renamed from: c */
    public static C1098j m5393c(String str, String str2, C0453l c0453l) {
        String m5411a = m5411a(str, str2);
        C0824b c0824b = null;
        if (c0453l != null) {
            c0824b = c0453l.f2917I;
        } else {
            GameEngine.m1120g("findAssetSteam meta==null");
        }
        if (c0824b != null) {
            try {
                if (!m5408a(str, str2, m5411a, c0824b)) {
                    throw new RuntimeException("File is outside mod: " + m5411a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C1098j m2441j = C0750a.m2441j(m5411a);
        if (m2441j == null) {
            GameEngine.PrintLog("Orginal path: " + m5411a);
            throw new RuntimeException("IO Error: Failed to open: " + m5422a(c0824b, m5411a, true));
        }
        return m2441j;
    }

    /* renamed from: b */
    public static void m5401b(C0453l c0453l) {
        C0384ay[] c0384ayArr = c0453l.f3220aw;
        for (C0384ay c0384ay : c0384ayArr) {
            float f = -1.0f;
            C0384ay c0384ay2 = null;
            float f2 = 1.0f;
            if (c0384ay.f2299o) {
                f2 = 0.1f;
            }
            for (C0384ay c0384ay3 : c0384ayArr) {
                if (c0384ay != c0384ay3 && !c0384ay3.f2279l) {
                    float m2366a = CommonUtils.m2366a(c0384ay.f2274d * f2, c0384ay.f2275e, c0384ay3.f2274d * f2, c0384ay3.f2275e);
                    if (c0384ay2 == null || m2366a < f) {
                        f = m2366a;
                        c0384ay2 = c0384ay3;
                    }
                }
            }
            float m2369a = CommonUtils.m2369a(f) + 2.0f;
            float f3 = m2369a * m2369a;
            ArrayList arrayList = new ArrayList();
            for (C0384ay c0384ay4 : c0384ayArr) {
                if (c0384ay != c0384ay4 && !c0384ay4.f2279l && CommonUtils.m2366a(c0384ay.f2274d * f2, c0384ay.f2275e, c0384ay4.f2274d * f2, c0384ay4.f2275e) <= f3) {
                    arrayList.add(Integer.valueOf(c0384ay4.f2271a));
                }
            }
            c0384ay.f2292S = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                c0384ay.f2292S[i] = ((Integer) arrayList.get(i)).intValue();
            }
        }
    }

    /* renamed from: k */
    public static String m5384k() {
        return "builtin_mods";
    }

    /* renamed from: l */
    public static String m5383l() {
        return "builtin_mods_enabled";
    }

    /* renamed from: m */
    public static String m5382m() {
        String str;
        if (GameEngine.f6199aU) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList m5409a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CommonUtils.m2298b(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2260f = CommonUtils.m2260f(trim, "(");
                    if (m2260f == null) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = m2260f[0];
                    str4 = m2260f[1].trim();
                }
                C0350ah c0350ah = new C0350ah();
                c0350ah.f2225a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = CommonUtils.m2326a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2260f2 = CommonUtils.m2260f(str5, "=");
                            if (m2260f2 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = m2260f2[0].trim();
                            String trim3 = m2260f2[1].trim();
                            if (c0350ah.f2226b == null) {
                                c0350ah.f2226b = new HashMap();
                            }
                            c0350ah.f2226b.put(trim2, trim3);
                        }
                    }
                }
                arrayList.add(c0350ah);
            }
        }
        return arrayList;
    }
}
