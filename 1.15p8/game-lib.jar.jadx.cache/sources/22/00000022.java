package com.corrodinggames.rts.game.units.custom.p019d;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.gui.C0704ad;
import com.corrodinggames.rts.gameFramework.gui.C0732u;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class C0407b extends AbstractC0406a implements Comparable {

    /* renamed from: b */
    public int f2538b;

    /* renamed from: c */
    public float f2539c;

    /* renamed from: d */
    public float f2540d;

    /* renamed from: e */
    public float f2541e;

    /* renamed from: f */
    public int f2542f;

    /* renamed from: g */
    public int f2543g;

    /* renamed from: h */
    public int f2544h;

    /* renamed from: i */
    public int f2545i;

    /* renamed from: j */
    public int f2546j;

    /* renamed from: k */
    public C0421e f2547k = f2548m;

    /* renamed from: m */
    private static final C0421e f2548m = new C0421e().m3315a();

    /* renamed from: a */
    public static final C0407b f2549a = m3405a(0);

    /* renamed from: l */
    static final int f2550l = Color.argb(255, 0, 100, 0);

    /* renamed from: a */
    public int m3406a() {
        return this.f2538b;
    }

    /* renamed from: a */
    public static C0407b m3397a(C0407b c0407b, C0407b c0407b2) {
        C0407b c0407b3 = new C0407b();
        c0407b3.f2538b = c0407b.f2538b + c0407b2.f2538b;
        c0407b3.f2539c = c0407b.f2539c + c0407b2.f2539c;
        c0407b3.f2540d = c0407b.f2540d + c0407b2.f2540d;
        c0407b3.f2541e = c0407b.f2541e + c0407b2.f2541e;
        c0407b3.f2542f = c0407b.f2542f + c0407b2.f2542f;
        if (!c0407b.f2547k.m3287c() || !c0407b2.f2547k.m3287c()) {
            c0407b3.f2547k = C0421e.m3302a(c0407b.f2547k, c0407b2.f2547k);
        }
        return c0407b3;
    }

    /* renamed from: a */
    public static C0407b m3398a(C0407b c0407b, float f) {
        C0407b c0407b2 = new C0407b();
        c0407b2.f2538b = (int) (c0407b.f2538b * f);
        c0407b2.f2539c = c0407b.f2539c * f;
        c0407b2.f2540d = c0407b.f2540d * f;
        c0407b2.f2541e = c0407b.f2541e * f;
        c0407b2.f2542f = (int) (c0407b.f2542f * f);
        if (!c0407b.f2547k.m3287c()) {
            c0407b2.f2547k = C0421e.m3292b(c0407b.f2547k, f);
        }
        return c0407b2;
    }

    /* renamed from: a */
    public static C0407b m3405a(int i) {
        C0407b c0407b = new C0407b();
        c0407b.f2538b = i;
        return c0407b;
    }

    /* renamed from: a */
    public static C0407b m3395a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, boolean z) {
        String staticStringValue = unitConfig.getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null && !z) {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
        try {
            return m3382b(customUnitMetadata, staticStringValue);
        } catch (C0395bl e) {
            throw new C0395bl("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0407b m3396a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, C0407b c0407b) {
        String staticStringValue = unitConfig.getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return c0407b;
        }
        try {
            return m3382b(customUnitMetadata, staticStringValue);
        } catch (C0395bl e) {
            throw new C0395bl("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static C0407b m3383b(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, C0407b c0407b) {
        String staticStringValue = unitConfig.getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return c0407b;
        }
        try {
            return m3394a(customUnitMetadata, staticStringValue);
        } catch (C0395bl e) {
            throw new C0395bl("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m3387b(int i) {
        if (i < 0 || i > 31) {
            throw new C0395bl("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    /* renamed from: a */
    public static int m3403a(int i, String str) {
        if (str.contains("-")) {
            String[] m1665c = CommonUtils.m1665c(str, '-');
            if (m1665c.length != 2) {
                throw new C0395bl("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(m1665c[0]);
            int parseInt2 = Integer.parseInt(m1665c[1]);
            m3387b(parseInt);
            m3387b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new C0395bl("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        m3387b(parseInt3);
        return i | (1 << parseInt3);
    }

    /* renamed from: a */
    public static C0407b m3394a(CustomUnitMetadata customUnitMetadata, String str) {
        C0407b m3382b = m3382b(customUnitMetadata, str);
        if (m3382b != null && m3382b.f2542f != 0) {
            throw new C0395bl("Ammo not supported on streaming price:" + str);
        }
        return m3382b;
    }

    /* renamed from: b */
    public static C0407b m3382b(CustomUnitMetadata customUnitMetadata, String str) {
        String str2;
        String str3;
        if (str == null) {
            return f2549a;
        }
        C0407b c0407b = new C0407b();
        for (String str4 : str.split(",|\\|")) {
            String trim = str4.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                String[] split = trim.split("=|:");
                if (split.length == 1) {
                    str3 = "credits";
                    str2 = split[0];
                } else if (split.length == 2) {
                    str3 = split[0].trim();
                    str2 = split[1].trim();
                } else {
                    throw new C0395bl("Unknown price format:" + str);
                }
                try {
                    if (str3.equals("credits")) {
                        c0407b.f2538b = Integer.parseInt(str2);
                    } else if (str3.equals("energy")) {
                        c0407b.f2539c = Float.parseFloat(str2);
                    } else if (str3.equals("hp")) {
                        c0407b.f2540d = Float.parseFloat(str2);
                    } else if (str3.equals("shield")) {
                        c0407b.f2541e = Float.parseFloat(str2);
                    } else if (str3.equals("ammo")) {
                        c0407b.f2542f = Integer.parseInt(str2);
                    } else if (str3.equals("hasFlag")) {
                        c0407b.f2545i = m3403a(c0407b.f2545i, str2);
                    } else if (str3.equals("hasMissingFlag")) {
                        c0407b.f2546j = m3403a(c0407b.f2546j, str2);
                    } else if (str3.equals("setFlag")) {
                        c0407b.f2543g = m3403a(c0407b.f2543g, str2);
                    } else if (str3.equals("unsetFlag")) {
                        c0407b.f2544h = m3403a(c0407b.f2544h, str2);
                    } else {
                        C0411a m3086i = customUnitMetadata.m3086i(str3);
                        if (m3086i != null) {
                            float parseFloat = Float.parseFloat(str2);
                            if (c0407b.f2547k == f2548m) {
                                c0407b.f2547k = new C0421e();
                            }
                            c0407b.f2547k.m3309a(m3086i, parseFloat);
                        } else {
                            throw new C0395bl("Unknown price type:" + str3);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str5 = "Bad price number:" + str2 + " in " + str;
                    if (0 != 0) {
                        str5 = str5 + " (Hint: A whole number was expected)";
                    }
                    throw new C0395bl(str5);
                }
            }
        }
        if (c0407b.f2547k != f2548m) {
            c0407b.f2547k.m3315a();
        }
        if (!c0407b.m3379c()) {
            return f2549a;
        }
        return c0407b;
    }

    /* renamed from: a */
    public int m3400a(Unit unit, boolean z) {
        int i = 9999;
        if (!z && this.f2538b > 0) {
            i = CommonUtils.mini(9999, (int) (unit.team.credits / this.f2538b));
        }
        if (this.f2539c > 0.0f) {
            i = CommonUtils.mini(i, (int) (unit.f1549cs / this.f2539c));
        }
        if (this.f2540d > 0.0f) {
            i = CommonUtils.mini(i, (int) (unit.hp / this.f2540d));
        }
        if (this.f2541e > 0.0f) {
            i = CommonUtils.mini(i, (int) (unit.shield / this.f2541e));
        }
        if (this.f2542f > 0) {
            i = CommonUtils.mini(i, unit.f1552cv / this.f2542f);
        }
        if (!this.f2547k.m3287c()) {
            i = CommonUtils.mini(i, C0421e.m3305a(this.f2547k, unit));
        }
        if (!m3369f(unit)) {
            i = 0;
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p019d.AbstractC0406a
    /* renamed from: b */
    public boolean mo3357b(Unit unit, double d) {
        if (this.f2538b > 0 && !unit.team.canBuy(this.f2538b * d)) {
            return false;
        }
        if (this.f2539c > 0.0f && unit.f1549cs < this.f2539c * d) {
            return false;
        }
        if (this.f2540d > 0.0f && unit.hp < this.f2540d * d) {
            return false;
        }
        if (this.f2541e > 0.0f && unit.shield < this.f2541e * d) {
            return false;
        }
        if ((this.f2542f > 0 && unit.f1552cv < this.f2542f * d) || !m3369f(unit)) {
            return false;
        }
        if (!this.f2547k.m3287c() && !C0421e.m3304a(this.f2547k, unit, d)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p019d.AbstractC0406a
    /* renamed from: b */
    public boolean mo3358b(Unit unit) {
        if (this.f2538b > 0 && !unit.team.canBuy(this.f2538b)) {
            return false;
        }
        if (this.f2539c > 0.0f && unit.f1549cs < this.f2539c) {
            return false;
        }
        if (this.f2540d > 0.0f && unit.hp < this.f2540d) {
            return false;
        }
        if (this.f2541e > 0.0f && unit.shield < this.f2541e) {
            return false;
        }
        if ((this.f2542f > 0 && unit.f1552cv < this.f2542f) || !m3369f(unit)) {
            return false;
        }
        if (!this.f2547k.m3287c() && !C0421e.m3290b(this.f2547k, unit)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m3401a(Unit unit, Unit unit2) {
        boolean z = false;
        if (!this.f2547k.m3287c() && C0421e.m3303a(this.f2547k, unit, unit2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public static void m3373d(Unit unit) {
        if (unit.f1549cs < 0.0f) {
            unit.f1549cs = 0.0f;
        }
        if (unit.f1549cs > unit.mo2520bc()) {
            unit.f1549cs = unit.mo2520bc();
        }
        if (unit.shield < 0.0f) {
            unit.shield = 0.0f;
        }
        if (unit.shield > unit.maxShield) {
            unit.shield = unit.maxShield;
        }
        if (unit.hp > unit.maxHp) {
            unit.hp = unit.maxHp;
        }
        if (unit.f1552cv < 0) {
            unit.f1552cv = 0;
        }
    }

    /* renamed from: e */
    public void m3371e(Unit unit) {
        if (this.f2544h != 0) {
            unit.f1553cw &= this.f2544h ^ (-1);
        }
        if (this.f2543g != 0) {
            unit.f1553cw |= this.f2543g;
        }
    }

    /* renamed from: c */
    public int m3378c(int i) {
        if (this.f2544h != 0) {
            i &= this.f2544h ^ (-1);
        }
        if (this.f2543g != 0) {
            i |= this.f2543g;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3404a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: f */
    public boolean m3369f(Unit unit) {
        if (this.f2545i != 0 && !m3386b(unit.f1553cw, this.f2545i)) {
            return false;
        }
        if (this.f2546j != 0 && m3377c(unit.f1553cw, this.f2546j)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3386b(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: c */
    public static boolean m3377c(int i, int i2) {
        return (i2 & i) != 0;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p019d.AbstractC0406a
    /* renamed from: a */
    public void mo3364a(Unit unit) {
        unit.team.credits -= this.f2538b;
        unit.f1549cs -= this.f2539c;
        unit.hp -= this.f2540d;
        unit.shield -= this.f2541e;
        unit.f1552cv -= this.f2542f;
        m3371e(unit);
        if (!this.f2547k.m3287c()) {
            C0421e.m3283c(this.f2547k, unit);
        }
        m3373d(unit);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p019d.AbstractC0406a
    /* renamed from: a */
    public void mo3363a(Unit unit, double d) {
        unit.team.credits -= this.f2538b * d;
        unit.f1549cs = (float) (unit.f1549cs - (this.f2539c * d));
        unit.hp = (float) (unit.hp - (this.f2540d * d));
        unit.shield = (float) (unit.shield - (this.f2541e * d));
        unit.f1552cv = (int) (unit.f1552cv - (this.f2542f * d));
        m3371e(unit);
        if (!this.f2547k.m3287c()) {
            C0421e.m3289b(this.f2547k, unit, d);
        }
        m3373d(unit);
    }

    /* renamed from: g */
    public void m3368g(Unit unit) {
        if (this.f2538b > 0) {
            unit.team.m3944b(this.f2538b);
        } else {
            unit.team.credits += this.f2538b;
        }
        unit.f1549cs += this.f2539c;
        unit.hp += this.f2540d;
        unit.shield += this.f2541e;
        unit.f1552cv += this.f2542f;
        m3371e(unit);
        if (!this.f2547k.m3287c()) {
            C0421e.m3278d(this.f2547k, unit);
        }
        m3373d(unit);
    }

    /* renamed from: h */
    public void m3367h(Unit unit) {
        unit.team.credits += this.f2538b;
        unit.f1549cs += this.f2539c;
        unit.hp += this.f2540d;
        unit.shield += this.f2541e;
        unit.f1552cv += this.f2542f;
        m3371e(unit);
        if (!this.f2547k.m3287c()) {
            C0421e.m3278d(this.f2547k, unit);
        }
        m3373d(unit);
    }

    /* renamed from: a */
    public void m3402a(Unit unit, double d, boolean z) {
        if (z) {
            unit.team.credits += this.f2538b * d;
        }
        unit.f1549cs = (float) (unit.f1549cs + (this.f2539c * d));
        unit.hp = (float) (unit.hp + (this.f2540d * d));
        unit.shield = (float) (unit.shield + (this.f2541e * d));
        unit.f1552cv = (int) (unit.f1552cv + (this.f2542f * d));
        m3371e(unit);
        if (!this.f2547k.m3287c()) {
            C0421e.m3282c(this.f2547k, unit, d);
        }
        m3373d(unit);
    }

    /* renamed from: b */
    public boolean m3388b() {
        if (this == f2549a) {
            return true;
        }
        if (this.f2538b != 0 || this.f2539c != 0.0f || this.f2540d != 0.0f || this.f2541e != 0.0f || this.f2542f != 0 || !this.f2547k.m3287c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m3379c() {
        if (this == f2549a) {
            return false;
        }
        if (this.f2538b != 0 || this.f2539c != 0.0f || this.f2540d != 0.0f || this.f2541e != 0.0f || this.f2542f != 0 || this.f2543g != 0 || this.f2544h != 0 || this.f2545i != 0 || this.f2546j != 0 || !this.f2547k.m3287c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m3374d() {
        if (this == f2549a) {
            return false;
        }
        if (this.f2538b != 0 || this.f2539c != 0.0f || this.f2540d != 0.0f || this.f2541e != 0.0f || this.f2542f != 0 || this.f2543g != 0 || this.f2544h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String m3389a(boolean z, boolean z2, int i, boolean z3) {
        C0732u c0732u = new C0732u();
        m3381b(c0732u, z, z2, i, z3);
        return c0732u.m1772a();
    }

    /* renamed from: a */
    public void m3393a(C0732u c0732u, boolean z, boolean z2, int i, boolean z3) {
        m3381b(c0732u, z, z2, i, z3);
    }

    /* renamed from: b */
    private void m3381b(C0732u c0732u, boolean z, boolean z2, int i, boolean z3) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i2 = 0;
        if (this.f2538b > 0 && 0 < i) {
            c0732u.m1765a("$" + this.f2538b + str, f2550l);
            i2 = 0 + 1;
        }
        if (z2) {
            if (this.f2539c > 0.0f && i2 < i) {
                c0732u.m1760b(CommonUtils.m1645f(this.f2539c) + " energy" + str);
                i2++;
            }
            if (this.f2540d > 0.0f && i2 < i) {
                c0732u.m1760b(CommonUtils.m1645f(this.f2540d) + " hp" + str);
                i2++;
            }
            if (this.f2541e > 0.0f && i2 < i) {
                c0732u.m1760b(CommonUtils.m1645f(this.f2541e) + " shield" + str);
                i2++;
            }
            if (this.f2542f > 0 && i2 < i) {
                c0732u.m1760b(CommonUtils.m1645f(this.f2542f) + " ammo" + str);
                i2++;
            }
        }
        if (!this.f2547k.m3287c()) {
            this.f2547k.m3301a(c0732u, z, z2, i - i2, z3, false);
        }
        c0732u.m1766a(str);
    }

    /* renamed from: i */
    public C0407b m3366i(Unit unit) {
        C0407b c0407b = new C0407b();
        if (this.f2538b > 0 && unit.team.credits < this.f2538b) {
            c0407b.f2538b = this.f2538b - ((int) unit.team.credits);
        }
        if (!this.f2547k.m3287c()) {
            c0407b.f2547k = this.f2547k.m3313a(unit);
        }
        return c0407b;
    }

    /* renamed from: a */
    public int compareTo(C0407b c0407b) {
        return this.f2538b - c0407b.f2538b;
    }

    /* renamed from: a */
    public static void m3391a(OutputNetStream outputNetStream, C0407b c0407b) {
        outputNetStream.writeBoolean(c0407b != null);
        if (c0407b != null) {
            c0407b.m3392a(outputNetStream);
        }
    }

    /* renamed from: a */
    public void m3392a(OutputNetStream outputNetStream) {
        boolean z = false;
        boolean z2 = false;
        if (this.f2539c != 0.0f || this.f2540d != 0.0f || this.f2541e != 0.0f || this.f2542f != 0) {
            z = true;
        }
        if (this.f2543g != 0 || this.f2544h != 0 || this.f2545i != 0 || this.f2546j != 0) {
            z = true;
        }
        if (!this.f2547k.m3287c()) {
            z2 = true;
        }
        byte b = 0;
        if (z) {
            b = (byte) (0 | 1);
        }
        if (z2) {
            b = (byte) (b | 2);
        }
        outputNetStream.writeByte(b);
        outputNetStream.writeInt(this.f2538b);
        if (z) {
            outputNetStream.writeFloat(this.f2539c);
            outputNetStream.writeFloat(this.f2540d);
            outputNetStream.writeFloat(this.f2541e);
            outputNetStream.writeInt(this.f2542f);
            outputNetStream.writeInt(this.f2543g);
            outputNetStream.writeInt(this.f2544h);
            outputNetStream.writeInt(this.f2545i);
            outputNetStream.writeInt(this.f2546j);
        }
        if (z2) {
            this.f2547k.m3300a(outputNetStream);
        }
    }

    /* renamed from: a */
    public static C0407b m3390a(InputNetStream inputNetStream) {
        if (inputNetStream.readBoolean()) {
            return m3380b(inputNetStream);
        }
        return null;
    }

    /* renamed from: b */
    public static C0407b m3380b(InputNetStream inputNetStream) {
        C0407b c0407b = new C0407b();
        byte readByte = inputNetStream.readByte();
        boolean m3386b = m3386b(readByte, 1);
        boolean m3386b2 = m3386b(readByte, 2);
        c0407b.f2538b = inputNetStream.readInt();
        if (m3386b) {
            c0407b.f2539c = inputNetStream.readFloat();
            c0407b.f2540d = inputNetStream.readFloat();
            c0407b.f2541e = inputNetStream.readFloat();
            c0407b.f2542f = inputNetStream.readInt();
            c0407b.f2543g = inputNetStream.readInt();
            c0407b.f2544h = inputNetStream.readInt();
            c0407b.f2545i = inputNetStream.readInt();
            c0407b.f2546j = inputNetStream.readInt();
        }
        if (m3386b2) {
            c0407b.f2547k = new C0421e();
            c0407b.f2547k.m3299a(inputNetStream);
        }
        return c0407b;
    }

    /* renamed from: b */
    public boolean m3385b(Unit unit, boolean z) {
        if (m3376c(unit, z)) {
            m3372d(unit, z);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3376c(Unit unit, boolean z) {
        if (this.f2538b > 0 && !unit.team.tryToBuy(this.f2538b)) {
            return false;
        }
        if (z) {
            return C0704ad.m1961c(unit, this);
        }
        return mo3358b(unit);
    }

    /* renamed from: d */
    public void m3372d(Unit unit, boolean z) {
        unit.team.f1327n -= this.f2538b;
        if (z) {
            C0704ad.m1965a(unit, this);
        }
    }

    /* renamed from: e */
    public void m3370e(Unit unit, boolean z) {
        unit.team.f1327n += this.f2538b;
        if (z) {
            C0704ad.m1962b(unit, this);
        }
    }

    /* renamed from: b */
    public boolean m3384b(C0407b c0407b) {
        if (this.f2538b != c0407b.f2538b || this.f2540d != c0407b.f2540d || this.f2541e != c0407b.f2541e || this.f2542f != c0407b.f2542f || this.f2547k.m3287c() != c0407b.f2547k.m3287c()) {
            return false;
        }
        if (!this.f2547k.m3287c() && !c0407b.f2547k.m3287c() && !this.f2547k.m3276e(c0407b.f2547k)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m3375c(C0407b c0407b) {
        if (this.f2538b > 0 && c0407b.f2538b > 0) {
            return true;
        }
        if (this.f2540d > 0.0f && c0407b.f2540d > 0.0f) {
            return true;
        }
        if (this.f2541e > 0.0f && c0407b.f2541e > 0.0f) {
            return true;
        }
        if (this.f2542f > 0 && c0407b.f2542f > 0) {
            return true;
        }
        if (!this.f2547k.m3287c() && !c0407b.f2547k.m3287c() && this.f2547k.m3275f(c0407b.f2547k)) {
            return true;
        }
        return false;
    }
}