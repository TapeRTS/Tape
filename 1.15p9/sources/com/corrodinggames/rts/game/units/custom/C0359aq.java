package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq.class */
public class C0359aq implements Cloneable {

    /* renamed from: a */
    public boolean f2237a;

    /* renamed from: b */
    public float f2238b;

    /* renamed from: c */
    public int f2239c;

    /* renamed from: d */
    public float f2240d;

    /* renamed from: e */
    public float f2241e = 1.0f;

    /* renamed from: f */
    public float f2242f = 1.0f;

    /* renamed from: g */
    public int f2243g;

    /* renamed from: h */
    public float f2244h;

    /* renamed from: i */
    public float f2245i;

    /* renamed from: j */
    public float f2246j;

    /* renamed from: k */
    public float f2247k;

    /* renamed from: l */
    public float f2248l;

    /* renamed from: m */
    public boolean f2249m;

    /* renamed from: n */
    public int f2250n;

    /* renamed from: o */
    public int f2251o;

    /* renamed from: p */
    public float f2252p;

    /* renamed from: q */
    static LinkedHashMap f2253q = new LinkedHashMap();

    /* renamed from: r */
    static LinkedHashMap f2254r;

    public C0359aq(boolean z) {
        this.f2237a = z;
    }

    /* renamed from: a */
    public static VariableScope.CachedWriter m5361a(String str, C0453l c0453l, String str2, String str3) {
        try {
            return VariableScope.CachedWriter.create(str, new C0378as(c0453l));
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0359aq clone() {
        try {
            C0359aq c0359aq = (C0359aq) super.clone();
            c0359aq.f2237a = false;
            return c0359aq;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m5359a(LinkedHashMap linkedHashMap, AbstractC0377ar abstractC0377ar) {
        linkedHashMap.put(abstractC0377ar.f2256b, abstractC0377ar);
    }

    static {
        m5359a(f2253q, new C03601(f2253q.size(), "mass"));
        m5359a(f2253q, new C036110(f2253q.size(), "maxenergy"));
        m5359a(f2253q, new C036211(f2253q.size(), "energy"));
        m5359a(f2253q, new C036312(f2253q.size(), "maxhp"));
        m5359a(f2253q, new C036413(f2253q.size(), "hp"));
        m5359a(f2253q, new C036514(f2253q.size(), "maxshield"));
        m5359a(f2253q, new C036615(f2253q.size(), "shield"));
        m5359a(f2253q, new C036716(f2253q.size(), "shieldregen"));
        m5359a(f2253q, new C036817(f2253q.size(), "armour"));
        m5359a(f2253q, new C03692(f2253q.size(), "maxattackrange"));
        m5359a(f2253q, new C03703(f2253q.size(), "shootdelaymultiplier"));
        m5359a(f2253q, new C03714(f2253q.size(), "shootdamagemultiplier"));
        m5359a(f2253q, new C03725(f2253q.size(), "movespeed"));
        m5359a(f2253q, new C03736(f2253q.size(), "maxturnspeed"));
        m5359a(f2253q, new C03747(f2253q.size(), "fogofwarsightrange"));
        m5359a(f2253q, new C03758(f2253q.size(), "nanorange"));
        m5359a(f2253q, new C03769(f2253q.size(), "selfregenrate"));
        f2254r = new LinkedHashMap();
        for (String str : f2253q.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2253q.get(str);
            if (!abstractC0377ar.mo5350b()) {
                f2254r.put(str, abstractC0377ar);
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$1.class */
    final class C03601 extends AbstractC0380au {
        C03601(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2238b;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2238b = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$10.class */
    final class C036110 extends AbstractC0380au {
        C036110(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2240d;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2240d = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$11.class */
    final class C036211 extends AbstractC0381av {
        C036211(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5353a(C0451j c0451j) {
            return c0451j.f1638cz;
        }

        /* renamed from: b */
        public void mo5349b(C0451j c0451j, double d) {
            c0451j.f1638cz = (float) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.f1638cz = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$12.class */
    final class C036312 extends AbstractC0380au {
        C036312(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2239c;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2239c = (int) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.f1632ct = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$13.class */
    final class C036413 extends AbstractC0381av {
        C036413(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5353a(C0451j c0451j) {
            return c0451j.f1631cs;
        }

        /* renamed from: b */
        public void mo5349b(C0451j c0451j, double d) {
            c0451j.f1631cs = (float) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.m5762o((float) d);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$14.class */
    final class C036514 extends AbstractC0380au {
        C036514(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2243g;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2243g = (int) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.f1637cy = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$15.class */
    final class C036615 extends AbstractC0381av {
        C036615(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5353a(C0451j c0451j) {
            return c0451j.f1634cv;
        }

        /* renamed from: b */
        public void mo5349b(C0451j c0451j, double d) {
            c0451j.f1634cv = (float) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.f1634cv = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$16.class */
    final class C036716 extends AbstractC0380au {
        C036716(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2244h;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2244h = (float) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$17.class */
    final class C036817 extends AbstractC0380au {
        C036817(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2248l;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2248l = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$2.class */
    final class C03692 extends AbstractC0380au {
        C03692(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2245i;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2245i = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$3.class */
    final class C03703 extends AbstractC0380au {
        C03703(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2241e;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2241e = (float) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            super.mo5352a(c0451j, d);
            c0451j.m3157aW();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$4.class */
    final class C03714 extends AbstractC0380au {
        C03714(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2242f;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2242f = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$5.class */
    final class C03725 extends AbstractC0380au {
        C03725(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2246j;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2246j = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$6.class */
    final class C03736 extends AbstractC0380au {
        C03736(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2247k;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2247k = (float) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$7.class */
    final class C03747 extends AbstractC0380au {
        C03747(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2250n;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2250n = (int) d;
        }

        /* renamed from: a */
        public void mo5352a(C0451j c0451j, double d) {
            int m4800s = c0451j.m4800s();
            super.mo5352a(c0451j, d);
            if (c0451j.m4800s() > m4800s && !c0451j.f3938aw) {
                c0451j.m4908c(false);
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$8.class */
    final class C03758 extends AbstractC0380au {
        C03758(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2251o;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2251o = (int) d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.custom.aq$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq$9.class */
    final class C03769 extends AbstractC0380au {
        C03769(int i, String str) {
            super(i, str);
        }

        /* renamed from: a */
        public double mo5355a(C0359aq c0359aq) {
            return c0359aq.f2252p;
        }

        /* renamed from: a */
        public void mo5354a(C0359aq c0359aq, double d) {
            c0359aq.f2252p = (float) d;
        }
    }

    /* renamed from: b */
    public C0359aq m5358b() {
        C0359aq m5368a = m5368a();
        m5368a.f2237a = false;
        return m5368a;
    }

    /* renamed from: a */
    public static AbstractC0377ar m5367a(int i) {
        for (AbstractC0377ar abstractC0377ar : f2253q.values()) {
            if (i == abstractC0377ar.f2255a) {
                return abstractC0377ar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m5364a(C0451j c0451j, C0359aq c0359aq, AbstractC0377ar[] abstractC0377arArr) {
        for (AbstractC0377ar abstractC0377ar : abstractC0377arArr) {
            double mo5351a = abstractC0377ar.mo5351a(c0451j, c0451j.f2862x);
            double mo5351a2 = abstractC0377ar.mo5351a(c0451j, c0359aq);
            if (mo5351a != mo5351a2) {
                c0451j.m4857dH();
                abstractC0377ar.mo5352a(c0451j, mo5351a2);
            }
        }
    }

    /* renamed from: a */
    public static void m5365a(C0451j c0451j, C0359aq c0359aq, C0453l c0453l) {
        if (!(c0359aq != c0453l.f3241cG)) {
            return;
        }
        for (String str : f2254r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2254r.get(str);
            double mo5351a = abstractC0377ar.mo5351a(c0451j, c0453l.f3241cG);
            double mo5351a2 = abstractC0377ar.mo5351a(c0451j, c0359aq);
            if (mo5351a != mo5351a2) {
                c0451j.m4857dH();
                abstractC0377ar.mo5352a(c0451j, mo5351a2);
            }
        }
    }

    /* renamed from: a */
    public static void m5366a(C0359aq c0359aq, C0451j c0451j, C0859ar c0859ar) {
        C0453l c0453l = c0451j.f2861w;
        if (!(c0359aq != c0453l.f3241cG)) {
            c0859ar.mo1482a(true);
            return;
        }
        c0859ar.mo1482a(false);
        short s = 0;
        for (String str : f2254r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2254r.get(str);
            if (abstractC0377ar.mo5351a(c0451j, c0453l.f3241cG) != abstractC0377ar.mo5351a(c0451j, c0359aq)) {
                s = (short) (s + 1);
            }
        }
        c0859ar.mo1483a(s);
        int i = 0;
        for (String str2 : f2254r.keySet()) {
            AbstractC0377ar abstractC0377ar2 = (AbstractC0377ar) f2254r.get(str2);
            double mo5351a = abstractC0377ar2.mo5351a(c0451j, c0453l.f3241cG);
            double mo5351a2 = abstractC0377ar2.mo5351a(c0451j, c0359aq);
            if (mo5351a != mo5351a2) {
                i++;
                if (s < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s) + ">" + i);
                }
                c0859ar.mo1483a((short) abstractC0377ar2.f2255a);
                c0859ar.m1579a(mo5351a2);
                c0859ar.m1579a(mo5351a);
            }
        }
    }

    /* renamed from: a */
    public static void m5363a(C0451j c0451j, C0876k c0876k, int i) {
        C0453l c0453l = c0451j.f2861w;
        if (c0876k.m1455e()) {
            return;
        }
        int m1438v = c0876k.m1438v();
        for (int i2 = 0; i2 < m1438v; i2++) {
            short m1438v2 = c0876k.m1438v();
            double m1452h = c0876k.m1452h();
            c0876k.m1452h();
            AbstractC0377ar m5367a = m5367a(m1438v2);
            if (m5367a == null) {
                throw new IOException("Field " + ((int) m1438v2) + " doesn't exist");
            }
            c0451j.m4857dH();
            m5367a.mo5352a(c0451j, m1452h);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m5362a(C1072ab c1072ab, String str, String str2, AbstractC0377ar[] abstractC0377arArr) {
        try {
            return m5360a(c1072ab.m681b(str, str2, (String) null), abstractC0377arArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m5360a(String str, AbstractC0377ar[] abstractC0377arArr) {
        if (str == null) {
            return abstractC0377arArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : CommonUtils.m2287c(str, ',')) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2254r.get(lowerCase);
            if (arrayList.contains(abstractC0377ar)) {
                throw new RuntimeException("Value: " + lowerCase + " is repeated");
            }
            if (abstractC0377ar == null) {
                String str3 = VariableScope.nullOrMissingString;
                for (String str4 : f2254r.keySet()) {
                    if (!str3.equals(VariableScope.nullOrMissingString)) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + str4;
                }
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + CommonUtils.m2301b(str3, 100) + ")");
            }
            arrayList.add(abstractC0377ar);
        }
        return (AbstractC0377ar[]) arrayList.toArray(new AbstractC0377ar[0]);
    }
}
