package com.corrodinggames.rts.game.units.custom.p020d;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class C0424b extends AbstractC0423a implements Comparable {

    /* renamed from: b */
    public int f2698b;

    /* renamed from: c */
    public float f2699c;

    /* renamed from: d */
    public float f2700d;

    /* renamed from: e */
    public float f2701e;

    /* renamed from: f */
    public int f2702f;

    /* renamed from: g */
    public int f2703g;

    /* renamed from: h */
    public int f2704h;

    /* renamed from: i */
    public int f2705i;

    /* renamed from: j */
    public int f2706j;

    /* renamed from: k */
    public C0439f f2707k = f2708m;

    /* renamed from: m */
    private static final C0439f f2708m = new C0439f().m5129a();

    /* renamed from: a */
    public static final C0424b f2709a = m5230a(0);

    /* renamed from: l */
    static final int f2710l = Color.argb(255, 0, 100, 0);

    /* renamed from: a */
    public int m5231a() {
        return this.f2698b;
    }

    /* renamed from: a */
    public static C0424b m5219a(C0424b c0424b, C0424b c0424b2) {
        C0424b c0424b3 = new C0424b();
        c0424b3.f2698b = c0424b.f2698b + c0424b2.f2698b;
        c0424b3.f2699c = c0424b.f2699c + c0424b2.f2699c;
        c0424b3.f2700d = c0424b.f2700d + c0424b2.f2700d;
        c0424b3.f2701e = c0424b.f2701e + c0424b2.f2701e;
        c0424b3.f2702f = c0424b.f2702f + c0424b2.f2702f;
        if (!c0424b.f2707k.m5100c() || !c0424b2.f2707k.m5100c()) {
            c0424b3.f2707k = C0439f.m5115a(c0424b.f2707k, c0424b2.f2707k);
        }
        return c0424b3;
    }

    /* renamed from: a */
    public static C0424b m5220a(C0424b c0424b, float f) {
        C0424b c0424b2 = new C0424b();
        c0424b2.f2698b = (int) (c0424b.f2698b * f);
        c0424b2.f2699c = c0424b.f2699c * f;
        c0424b2.f2700d = c0424b.f2700d * f;
        c0424b2.f2701e = c0424b.f2701e * f;
        c0424b2.f2702f = (int) (c0424b.f2702f * f);
        if (!c0424b.f2707k.m5100c()) {
            c0424b2.f2707k = C0439f.m5105b(c0424b.f2707k, f);
        }
        return c0424b2;
    }

    /* renamed from: a */
    public static C0424b m5230a(int i) {
        C0424b c0424b = new C0424b();
        c0424b.f2698b = i;
        return c0424b;
    }

    /* renamed from: a */
    public static C0424b m5217a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        String m681b = c1072ab.m681b(str, str2, (String) null);
        if (m681b == null && !z) {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
        try {
            return m5200b(c0453l, m681b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0424b m5218a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0424b c0424b) {
        String m681b = c1072ab.m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0424b;
        }
        try {
            return m5200b(c0453l, m681b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static C0424b m5201b(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0424b c0424b) {
        String m681b = c1072ab.m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0424b;
        }
        try {
            return m5216a(c0453l, m681b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m5208b(int i) {
        if (i < 0 || i > 31) {
            throw new C0412bm("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    /* renamed from: a */
    public static int m5228a(int i, String str) {
        if (str.contains("-")) {
            String[] m2287c = CommonUtils.m2287c(str, '-');
            if (m2287c.length != 2) {
                throw new C0412bm("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(m2287c[0]);
            int parseInt2 = Integer.parseInt(m2287c[1]);
            m5208b(parseInt);
            m5208b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new C0412bm("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        m5208b(parseInt3);
        return i | (1 << parseInt3);
    }

    /* renamed from: a */
    public static C0424b m5216a(C0453l c0453l, String str) {
        C0424b m5200b = m5200b(c0453l, str);
        if (m5200b != null && m5200b.f2702f != 0) {
            throw new C0412bm("Ammo not supported on streaming price:" + str);
        }
        return m5200b;
    }

    /* renamed from: b */
    public static C0424b m5200b(C0453l c0453l, String str) {
        String trim;
        String trim2;
        if (str == null) {
            return f2709a;
        }
        C0424b c0424b = new C0424b();
        for (String str2 : str.split(",|\\|")) {
            String trim3 = str2.trim();
            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                String[] split = trim3.split("=|:");
                if (split.length == 1) {
                    trim = "credits";
                    trim2 = split[0];
                } else if (split.length == 2) {
                    trim = split[0].trim();
                    trim2 = split[1].trim();
                } else {
                    throw new C0412bm("Unknown price format:" + str);
                }
                try {
                    if (trim.equals("credits")) {
                        c0424b.f2698b = Integer.parseInt(trim2);
                    } else if (trim.equals("energy")) {
                        c0424b.f2699c = Float.parseFloat(trim2);
                    } else if (trim.equals("hp")) {
                        c0424b.f2700d = Float.parseFloat(trim2);
                    } else if (trim.equals("shield")) {
                        c0424b.f2701e = Float.parseFloat(trim2);
                    } else if (trim.equals("ammo")) {
                        c0424b.f2702f = Integer.parseInt(trim2);
                    } else if (trim.equals("hasFlag")) {
                        c0424b.f2705i = m5228a(c0424b.f2705i, trim2);
                    } else if (trim.equals("hasMissingFlag")) {
                        c0424b.f2706j = m5228a(c0424b.f2706j, trim2);
                    } else if (trim.equals("setFlag")) {
                        c0424b.f2703g = m5228a(c0424b.f2703g, trim2);
                    } else if (trim.equals("unsetFlag")) {
                        c0424b.f2704h = m5228a(c0424b.f2704h, trim2);
                    } else {
                        C0428a m4719k = c0453l.m4719k(trim);
                        if (m4719k != null) {
                            float parseFloat = Float.parseFloat(trim2);
                            if (c0424b.f2707k == f2708m) {
                                c0424b.f2707k = new C0439f();
                            }
                            c0424b.f2707k.m5122a(m4719k, parseFloat);
                        } else {
                            throw new C0412bm("Unknown price type:" + trim);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str3 = "Bad price number:" + trim2 + " in " + str;
                    if (0 != 0) {
                        str3 = str3 + " (Hint: A whole number was expected)";
                    }
                    throw new C0412bm(str3);
                }
            }
        }
        if (c0424b.f2707k != f2708m) {
            c0424b.f2707k.m5129a();
        }
        if (!c0424b.m5197c()) {
            return f2709a;
        }
        return c0424b;
    }

    /* renamed from: a */
    public int m5222a(Unit unit, boolean z) {
        int i = 9999;
        if (!z && this.f2698b > 0) {
            i = CommonUtils.m2289c(9999, (int) (unit.team.f1309o / this.f2698b));
        }
        if (this.f2699c > 0.0f) {
            i = CommonUtils.m2289c(i, (int) (unit.f1638cz / this.f2699c));
        }
        if (this.f2700d > 0.0f) {
            i = CommonUtils.m2289c(i, (int) (unit.f1631cs / this.f2700d));
        }
        if (this.f2701e > 0.0f) {
            i = CommonUtils.m2289c(i, (int) (unit.f1634cv / this.f2701e));
        }
        if (this.f2702f > 0) {
            i = CommonUtils.m2289c(i, unit.f1641cC / this.f2702f);
        }
        if (!this.f2707k.m5100c()) {
            i = CommonUtils.m2289c(i, C0439f.m5118a(this.f2707k, unit));
        }
        if (!m5187f(unit)) {
            i = 0;
        }
        return i;
    }

    /* renamed from: b */
    public boolean mo5234b(Unit unit, double d) {
        if (this.f2698b > 0 && !unit.team.m6395a(this.f2698b * d)) {
            return false;
        }
        if (this.f2699c > 0.0f && unit.f1638cz < this.f2699c * d) {
            return false;
        }
        if (this.f2700d > 0.0f && unit.f1631cs < this.f2700d * d) {
            return false;
        }
        if (this.f2701e > 0.0f && unit.f1634cv < this.f2701e * d) {
            return false;
        }
        if ((this.f2702f > 0 && unit.f1641cC < this.f2702f * d) || !m5187f(unit)) {
            return false;
        }
        if (!this.f2707k.m5100c() && !C0439f.m5117a(this.f2707k, unit, d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo5235b(Unit unit) {
        if (this.f2698b > 0 && !unit.team.m6395a(this.f2698b)) {
            return false;
        }
        if (this.f2699c > 0.0f && unit.f1638cz < this.f2699c) {
            return false;
        }
        if (this.f2700d > 0.0f && unit.f1631cs < this.f2700d) {
            return false;
        }
        if (this.f2701e > 0.0f && unit.f1634cv < this.f2701e) {
            return false;
        }
        if ((this.f2702f > 0 && unit.f1641cC < this.f2702f) || !m5187f(unit)) {
            return false;
        }
        if (!this.f2707k.m5100c() && !C0439f.m5103b(this.f2707k, unit)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m5223a(Unit unit, Unit unit2) {
        boolean z = false;
        if (!this.f2707k.m5100c() && C0439f.m5116a(this.f2707k, unit, unit2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public static void m5191d(Unit unit) {
        if (unit.f1638cz < 0.0f) {
            unit.f1638cz = 0.0f;
        }
        if (unit.f1638cz > unit.mo3101bd()) {
            unit.f1638cz = unit.mo3101bd();
        }
        if (unit.f1634cv < 0.0f) {
            unit.f1634cv = 0.0f;
        }
        if (unit.f1634cv > unit.f1637cy) {
            unit.f1634cv = unit.f1637cy;
        }
        if (unit.f1631cs > unit.f1632ct) {
            unit.f1631cs = unit.f1632ct;
        }
        if (unit.f1641cC < 0) {
            unit.f1641cC = 0;
        }
    }

    /* renamed from: e */
    public void m5189e(Unit unit) {
        if (this.f2704h != 0) {
            unit.f1642cD &= this.f2704h ^ (-1);
        }
        if (this.f2703g != 0) {
            unit.f1642cD |= this.f2703g;
        }
    }

    /* renamed from: c */
    public int m5196c(int i) {
        if (this.f2704h != 0) {
            i &= this.f2704h ^ (-1);
        }
        if (this.f2703g != 0) {
            i |= this.f2703g;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m5229a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: f */
    public boolean m5187f(Unit unit) {
        if (this.f2705i != 0 && !m5207b(unit.f1642cD, this.f2705i)) {
            return false;
        }
        if (this.f2706j != 0 && m5195c(unit.f1642cD, this.f2706j)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m5207b(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: c */
    public static boolean m5195c(int i, int i2) {
        return (i2 & i) != 0;
    }

    /* renamed from: a */
    public void mo5237a(Unit unit) {
        unit.team.f1309o -= this.f2698b;
        unit.f1638cz -= this.f2699c;
        unit.f1631cs -= this.f2700d;
        unit.f1634cv -= this.f2701e;
        unit.f1641cC -= this.f2702f;
        m5189e(unit);
        if (!this.f2707k.m5100c()) {
            C0439f.m5096c(this.f2707k, unit);
        }
        m5191d(unit);
    }

    /* renamed from: a */
    public void mo5236a(Unit unit, double d) {
        unit.team.f1309o -= this.f2698b * d;
        unit.f1638cz = (float) (unit.f1638cz - (this.f2699c * d));
        unit.f1631cs = (float) (unit.f1631cs - (this.f2700d * d));
        unit.f1634cv = (float) (unit.f1634cv - (this.f2701e * d));
        unit.f1641cC = (int) (unit.f1641cC - (this.f2702f * d));
        m5189e(unit);
        if (!this.f2707k.m5100c()) {
            C0439f.m5102b(this.f2707k, unit, d);
        }
        m5191d(unit);
    }

    /* renamed from: g */
    public void m5186g(Unit unit) {
        if (this.f2698b > 0) {
            unit.team.m6373b(this.f2698b);
        } else {
            unit.team.f1309o += this.f2698b;
        }
        unit.f1638cz += this.f2699c;
        unit.f1631cs += this.f2700d;
        unit.f1634cv += this.f2701e;
        unit.f1641cC += this.f2702f;
        m5189e(unit);
        if (!this.f2707k.m5100c()) {
            C0439f.m5091d(this.f2707k, unit);
        }
        m5191d(unit);
    }

    /* renamed from: h */
    public void m5185h(Unit unit) {
        unit.team.f1309o += this.f2698b;
        unit.f1638cz += this.f2699c;
        unit.f1631cs += this.f2700d;
        unit.f1634cv += this.f2701e;
        unit.f1641cC += this.f2702f;
        m5189e(unit);
        if (!this.f2707k.m5100c()) {
            C0439f.m5091d(this.f2707k, unit);
        }
        m5191d(unit);
    }

    /* renamed from: a */
    public void m5225a(Unit unit, double d, boolean z) {
        if (z) {
            unit.team.f1309o += this.f2698b * d;
        }
        unit.f1638cz = (float) (unit.f1638cz + (this.f2699c * d));
        unit.f1631cs = (float) (unit.f1631cs + (this.f2700d * d));
        unit.f1634cv = (float) (unit.f1634cv + (this.f2701e * d));
        unit.f1641cC = (int) (unit.f1641cC + (this.f2702f * d));
        m5189e(unit);
        if (!this.f2707k.m5100c()) {
            C0439f.m5095c(this.f2707k, unit, d);
        }
        m5191d(unit);
    }

    /* renamed from: b */
    public boolean m5209b() {
        if (this == f2709a) {
            return true;
        }
        if (this.f2698b != 0 || this.f2699c != 0.0f || this.f2700d != 0.0f || this.f2701e != 0.0f || this.f2702f != 0 || !this.f2707k.m5100c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m5197c() {
        if (this == f2709a) {
            return false;
        }
        if (this.f2698b != 0 || this.f2699c != 0.0f || this.f2700d != 0.0f || this.f2701e != 0.0f || this.f2702f != 0 || this.f2703g != 0 || this.f2704h != 0 || this.f2705i != 0 || this.f2706j != 0 || !this.f2707k.m5100c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m5192d() {
        if (this == f2709a) {
            return false;
        }
        if (this.f2698b != 0 || this.f2699c != 0.0f || this.f2700d != 0.0f || this.f2701e != 0.0f || this.f2702f != 0 || this.f2703g != 0 || this.f2704h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String m5210a(boolean z, boolean z2, int i, boolean z3) {
        C0813u c0813u = new C0813u();
        m5215a(c0813u, z, z2, i, z3);
        return c0813u.m1913a();
    }

    /* renamed from: a */
    public void m5214a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, Unit unit, int i2) {
        m5199b(c0813u, z, z2, i, z3, unit, i2);
    }

    /* renamed from: a */
    private void m5215a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3) {
        m5199b(c0813u, z, z2, i, z3, null, 0);
    }

    /* renamed from: b */
    private void m5199b(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, Unit unit, int i2) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        if (this.f2698b > 0 && 0 < i) {
            int i4 = f2710l;
            if (unit != null && unit.team.f1309o < this.f2698b) {
                i4 = i2;
            }
            c0813u.m1907a("$" + this.f2698b + str, i4);
            i3 = 0 + 1;
        }
        if (z2) {
            if (this.f2699c > 0.0f && i3 < i) {
                c0813u.m1902b(CommonUtils.m2266f(this.f2699c) + " energy" + str);
                i3++;
            }
            if (this.f2700d > 0.0f && i3 < i) {
                c0813u.m1902b(CommonUtils.m2266f(this.f2700d) + " hp" + str);
                i3++;
            }
            if (this.f2701e > 0.0f && i3 < i) {
                c0813u.m1902b(CommonUtils.m2266f(this.f2701e) + " shield" + str);
                i3++;
            }
            if (this.f2702f > 0 && i3 < i) {
                c0813u.m1902b(CommonUtils.m2266f(this.f2702f) + " ammo" + str);
                i3++;
            }
        }
        if (!this.f2707k.m5100c()) {
            this.f2707k.m5114a(c0813u, z, z2, i - i3, z3, false, unit, i2);
        }
        c0813u.m1908a(str);
    }

    /* renamed from: i */
    public C0424b m5184i(Unit unit) {
        C0424b c0424b = new C0424b();
        if (this.f2698b > 0 && unit.team.f1309o < this.f2698b) {
            c0424b.f2698b = this.f2698b - ((int) unit.team.f1309o);
        }
        if (!this.f2707k.m5100c()) {
            c0424b.f2707k = this.f2707k.m5127a(unit);
        }
        return c0424b;
    }

    /* renamed from: a */
    public String m5224a(Unit unit, int i, boolean z) {
        String m5126a;
        String str = null;
        if (this.f2698b > 0 && 0 < i && unit.team.f1309o < this.f2698b) {
            if (0 == 0) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "credits, ";
            int i2 = 0 + 1;
        }
        if (!this.f2707k.m5100c() && (m5126a = this.f2707k.m5126a(unit, ", ", i, z)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + m5126a;
        }
        if (str != null) {
            return CommonUtils.m2331a(str, ", ");
        }
        return null;
    }

    /* renamed from: a */
    public int mo4772a(C0424b c0424b) {
        return this.f2698b - c0424b.f2698b;
    }

    /* renamed from: a */
    public static void m5212a(C0859ar c0859ar, C0424b c0424b) {
        c0859ar.mo1482a(c0424b != null);
        if (c0424b != null) {
            c0424b.m5213a(c0859ar);
        }
    }

    /* renamed from: a */
    public void m5213a(C0859ar c0859ar) {
        boolean z = false;
        boolean z2 = false;
        if (this.f2699c != 0.0f || this.f2700d != 0.0f || this.f2701e != 0.0f || this.f2702f != 0) {
            z = true;
        }
        if (this.f2703g != 0 || this.f2704h != 0 || this.f2705i != 0 || this.f2706j != 0) {
            z = true;
        }
        if (!this.f2707k.m5100c()) {
            z2 = true;
        }
        byte b = 0;
        if (z) {
            b = (byte) (0 | 1);
        }
        if (z2) {
            b = (byte) (b | 2);
        }
        c0859ar.m1554c(b);
        c0859ar.mo1487a(this.f2698b);
        if (z) {
            c0859ar.mo1488a(this.f2699c);
            c0859ar.mo1488a(this.f2700d);
            c0859ar.mo1488a(this.f2701e);
            c0859ar.mo1487a(this.f2702f);
            c0859ar.mo1487a(this.f2703g);
            c0859ar.mo1487a(this.f2704h);
            c0859ar.mo1487a(this.f2705i);
            c0859ar.mo1487a(this.f2706j);
        }
        if (z2) {
            this.f2707k.m5113a(c0859ar);
        }
    }

    /* renamed from: a */
    public static C0424b m5211a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            return m5198b(c0876k);
        }
        return null;
    }

    /* renamed from: b */
    public static C0424b m5198b(C0876k c0876k) {
        C0424b c0424b = new C0424b();
        byte m1457d = c0876k.m1457d();
        boolean m5207b = m5207b(m1457d, 1);
        boolean m5207b2 = m5207b(m1457d, 2);
        c0424b.f2698b = c0876k.m1454f();
        if (m5207b) {
            c0424b.f2699c = c0876k.m1453g();
            c0424b.f2700d = c0876k.m1453g();
            c0424b.f2701e = c0876k.m1453g();
            c0424b.f2702f = c0876k.m1454f();
            c0424b.f2703g = c0876k.m1454f();
            c0424b.f2704h = c0876k.m1454f();
            c0424b.f2705i = c0876k.m1454f();
            c0424b.f2706j = c0876k.m1454f();
        }
        if (m5207b2) {
            c0424b.f2707k = new C0439f();
            c0424b.f2707k.m5112a(c0876k);
        }
        return c0424b;
    }

    /* renamed from: b */
    public boolean m5204b(Unit unit, boolean z) {
        if (m5194c(unit, z)) {
            m5190d(unit, z);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m5194c(Unit unit, boolean z) {
        if (this.f2698b > 0 && !unit.team.m6326g(this.f2698b)) {
            return false;
        }
        if (z) {
            return C0785ad.m2108c(unit, this);
        }
        return mo5235b(unit);
    }

    /* renamed from: d */
    public void m5190d(Unit unit, boolean z) {
        unit.team.f1310p -= this.f2698b;
        if (z) {
            C0785ad.m2112a(unit, this);
        }
    }

    /* renamed from: e */
    public void m5188e(Unit unit, boolean z) {
        unit.team.f1310p += this.f2698b;
        if (z) {
            C0785ad.m2109b(unit, this);
        }
    }

    /* renamed from: b */
    public static boolean m5202b(C0424b c0424b, C0424b c0424b2) {
        if (c0424b2 == c0424b) {
            return true;
        }
        if (c0424b2 == null || c0424b == null) {
            return false;
        }
        return c0424b2.m5203b(c0424b);
    }

    /* renamed from: b */
    public boolean m5203b(C0424b c0424b) {
        if (this.f2698b != c0424b.f2698b || this.f2700d != c0424b.f2700d || this.f2701e != c0424b.f2701e || this.f2702f != c0424b.f2702f || this.f2707k.m5100c() != c0424b.f2707k.m5100c()) {
            return false;
        }
        if (!this.f2707k.m5100c() && !c0424b.f2707k.m5100c() && !this.f2707k.m5089e(c0424b.f2707k)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m5193c(C0424b c0424b) {
        if (this.f2698b > 0 && c0424b.f2698b > 0) {
            return true;
        }
        if (this.f2700d > 0.0f && c0424b.f2700d > 0.0f) {
            return true;
        }
        if (this.f2701e > 0.0f && c0424b.f2701e > 0.0f) {
            return true;
        }
        if (this.f2702f > 0 && c0424b.f2702f > 0) {
            return true;
        }
        if (!this.f2707k.m5100c() && !c0424b.f2707k.m5100c() && this.f2707k.m5088f(c0424b.f2707k)) {
            return true;
        }
        return false;
    }
}
