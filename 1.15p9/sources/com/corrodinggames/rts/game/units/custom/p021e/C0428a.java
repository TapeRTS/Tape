package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0430b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0431c;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0432d;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0433e;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0434f;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a.class */
public class C0428a {

    /* renamed from: a */
    public boolean f2734a;

    /* renamed from: b */
    protected String f2735b;

    /* renamed from: c */
    protected C0385az f2736c;

    /* renamed from: d */
    protected C0385az f2737d;

    /* renamed from: e */
    protected boolean f2738e;

    /* renamed from: f */
    protected boolean f2739f;

    /* renamed from: g */
    protected C0385az f2740g;

    /* renamed from: h */
    protected C0385az f2741h;

    /* renamed from: i */
    public C0428a f2742i;

    /* renamed from: j */
    public boolean f2743j;

    /* renamed from: k */
    public boolean f2744k;

    /* renamed from: l */
    Integer f2745l;

    /* renamed from: m */
    public boolean f2746m;

    /* renamed from: n */
    public boolean f2747n;

    /* renamed from: o */
    public boolean f2748o;

    /* renamed from: p */
    public EnumC0435b f2749p = EnumC0435b.f2766a;

    /* renamed from: q */
    boolean f2750q;

    /* renamed from: r */
    protected boolean f2751r;

    /* renamed from: s */
    protected boolean f2752s;

    /* renamed from: t */
    C0428a f2753t;

    /* renamed from: u */
    public boolean f2754u;

    /* renamed from: v */
    public float f2755v;

    /* renamed from: w */
    public BitmapOrTexture f2756w;

    /* renamed from: x */
    public boolean f2757x;

    /* renamed from: y */
    static ArrayList f2758y = new ArrayList();

    /* renamed from: z */
    static ArrayList f2759z = new ArrayList();

    /* renamed from: A */
    public static ArrayList f2760A = new ArrayList();

    /* renamed from: B */
    public static final C0428a f2761B = m5156a(new C0431c());

    /* renamed from: C */
    public static final C0428a f2762C = m5156a(new C0432d());

    /* renamed from: D */
    public static final C0428a f2763D = m5156a(new C0430b());

    /* renamed from: F */
    public static final C0428a f2765F = m5156a(new C0434f());

    /* renamed from: E */
    public static final C0428a f2764E = m5156a(new C0433e());

    /* renamed from: a */
    public boolean m5161a() {
        return this.f2750q;
    }

    /* renamed from: b */
    public boolean m5152b() {
        return this.f2752s;
    }

    /* renamed from: c */
    public boolean m5149c() {
        return this.f2751r;
    }

    /* renamed from: d */
    public static void m5148d() {
        Iterator it = f2758y.iterator();
        while (it.hasNext()) {
            ((C0428a) it.next()).m5146f();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = f2758y.iterator();
        while (it2.hasNext()) {
            C0428a c0428a = (C0428a) it2.next();
            if (c0428a.f2734a) {
                arrayList.add(c0428a);
            }
        }
        f2759z = arrayList;
    }

    /* renamed from: e */
    public static ArrayList m5147e() {
        return f2759z;
    }

    /* renamed from: f */
    public void m5146f() {
        if (this.f2752s) {
            this.f2734a = true;
            return;
        }
        C0437d c0437d = null;
        Iterator it = C0453l.f3185d.iterator();
        while (it.hasNext()) {
            C0437d m4766a = ((C0453l) it.next()).m4766a(this);
            if (m4766a != null && (c0437d == null || c0437d.f2773c < m4766a.f2773c)) {
                c0437d = m4766a;
            }
        }
        this.f2734a = c0437d != null;
        if (c0437d != null) {
            this.f2736c = c0437d.f2777g;
            this.f2737d = c0437d.f2778h;
            this.f2738e = c0437d.f2779i;
            this.f2739f = c0437d.f2780j;
            this.f2745l = c0437d.f2774d;
            this.f2746m = c0437d.f2775e;
            this.f2747n = c0437d.f2784n;
            this.f2748o = c0437d.f2785o;
            this.f2749p = c0437d.f2786p;
            this.f2740g = c0437d.f2788r;
            this.f2741h = c0437d.f2789s;
            this.f2742i = c0437d.f2791u;
            this.f2743j = c0437d.f2793w;
            this.f2744k = c0437d.f2792v;
            this.f2750q = c0437d.f2782l;
            this.f2753t = c0437d.f2795y;
            this.f2754u = c0437d.f2781k;
            this.f2755v = c0437d.f2787q;
            this.f2756w = c0437d.f2796z;
            this.f2757x = c0437d.f2797A;
        }
    }

    /* renamed from: g */
    public Integer m5145g() {
        return this.f2745l;
    }

    /* renamed from: h */
    public String m5144h() {
        if (this.f2736c == null) {
            return this.f2735b;
        }
        return this.f2736c.m5339b();
    }

    /* renamed from: i */
    public String m5143i() {
        if (this.f2737d != null) {
            return this.f2737d.m5339b();
        }
        return m5144h();
    }

    /* renamed from: a */
    public String m5159a(double d, boolean z) {
        String m2295c;
        if (this.f2747n) {
            m2295c = VariableScope.nullOrMissingString + ((int) d);
        } else {
            m2295c = CommonUtils.m2295c(d);
        }
        return mo5141a(z) + m5154a(m2295c, this.f2749p) + m5150b(z);
    }

    /* renamed from: a */
    public static String m5154a(String str, EnumC0435b enumC0435b) {
        String str2;
        if (enumC0435b == EnumC0435b.f2766a) {
            return str;
        }
        if (GameEngine.getInstance().f6109bQ.disableDigitGrouping) {
            return str;
        }
        String str3 = str;
        String str4 = VariableScope.nullOrMissingString;
        int indexOf = str3.indexOf(".");
        if (indexOf != -1) {
            str4 = str3.substring(indexOf);
            str3 = str3.substring(0, indexOf);
        }
        if (str3.length() <= 3) {
            return str;
        }
        if (enumC0435b == EnumC0435b.f2767b) {
            str2 = " ";
        } else if (enumC0435b == EnumC0435b.f2768c) {
            str2 = ",";
        } else {
            throw new RuntimeException("Unhandled grouping style: " + enumC0435b);
        }
        StringBuilder sb = new StringBuilder();
        int length = str3.length() % 3;
        if (length != 0) {
            sb.append(str3.substring(0, length));
        }
        for (int i = length; i < str3.length(); i += 3) {
            if (i != 0) {
                sb.append(str2);
            }
            sb.append(str3.substring(i, i + 3));
        }
        if (str4 == VariableScope.nullOrMissingString) {
            return sb.toString();
        }
        return sb.toString() + str4;
    }

    /* renamed from: a */
    public static String m5157a(long j, EnumC0435b enumC0435b) {
        if (enumC0435b == EnumC0435b.f2766a) {
            return VariableScope.nullOrMissingString + j;
        }
        if (enumC0435b == EnumC0435b.f2767b) {
            return String.format(Locale.US, "%,d", Long.valueOf(j)).replace(",", " ");
        }
        if (enumC0435b != EnumC0435b.f2768c) {
            throw new RuntimeException("Unhandled grouping style: " + enumC0435b);
        }
        return String.format(Locale.US, "%,d", Long.valueOf(j));
    }

    /* renamed from: a */
    public String mo5141a(boolean z) {
        if (this.f2740g != null) {
            return this.f2740g.m5339b();
        }
        if (z && this.f2738e) {
            return VariableScope.nullOrMissingString;
        }
        return m5144h() + ": ";
    }

    /* renamed from: b */
    public String m5150b(boolean z) {
        if (this.f2741h != null) {
            return this.f2741h.m5339b();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: j */
    public BitmapOrTexture m5142j() {
        return this.f2756w;
    }

    /* renamed from: a */
    public static C0428a m5155a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator it = f2760A.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2735b.equalsIgnoreCase(lowerCase)) {
                return c0428a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0428a m5156a(C0428a c0428a) {
        Iterator it = f2758y.iterator();
        while (it.hasNext()) {
            if (((C0428a) it.next()).f2735b.equals(c0428a.f2735b)) {
                throw new RuntimeException("Built in resource already exists:" + c0428a.f2735b);
            }
        }
        f2758y.add(c0428a);
        f2760A.add(c0428a);
        return c0428a;
    }

    /* renamed from: a */
    public static C0428a m5153a(String str, boolean z, boolean z2) {
        Iterator it = f2758y.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2735b.equals(str)) {
                return c0428a;
            }
        }
        C0428a c0428a2 = new C0428a();
        c0428a2.f2735b = str;
        c0428a2.f2752s = z;
        c0428a2.f2751r = z2;
        f2758y.add(c0428a2);
        return c0428a2;
    }

    /* renamed from: b */
    public static C0428a m5151b(String str) {
        Iterator it = f2758y.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2735b.equals(str)) {
                return c0428a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m5160a(double d) {
        return m5154a(CommonUtils.m2370a(d, 1), this.f2749p);
    }

    /* renamed from: a */
    public String m5158a(double d, boolean z, boolean z2) {
        String str;
        if (z2 && this.f2739f) {
            str = VariableScope.nullOrMissingString;
        } else {
            str = m5143i() + ": ";
        }
        if (this == f2761B) {
            str = "$";
        }
        if (z) {
            if (d > 0.0d) {
                return "+" + str + m5160a(d);
            }
            return "-" + str + m5160a(-d);
        } else if (d > 0.0d) {
            return str + m5160a(d);
        } else {
            return str + m5160a(d);
        }
    }

    public String toString() {
        return "resource(" + this.f2735b + ")";
    }

    /* renamed from: a */
    public double mo5140a(Unit unit) {
        if (this.f2751r) {
            return unit.team.m6352c(this);
        }
        return unit.m5886a(this);
    }

    /* renamed from: a */
    public void mo5139a(Unit unit, double d) {
        if (this.f2751r) {
            unit.team.m6402S().m5122a(this, d);
        } else {
            unit.m5786dd().m5122a(this, d);
        }
    }

    /* renamed from: b */
    public void mo5138b(Unit unit, double d) {
        if (this.f2751r) {
            unit.team.m6402S().m5107b(this, d);
        } else {
            unit.m5786dd().m5107b(this, d);
        }
    }
}
