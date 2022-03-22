package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p032d.C0647w;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/g.class */
public class C0363g implements Comparable {

    /* renamed from: l */
    private static final C0354d f2421l = new C0354d().m3112a();

    /* renamed from: a */
    public static final C0363g f2422a = m3051a(0);

    /* renamed from: b */
    public int f2423b;

    /* renamed from: c */
    public float f2424c;

    /* renamed from: d */
    public float f2425d;

    /* renamed from: e */
    public float f2426e;

    /* renamed from: f */
    public int f2427f;

    /* renamed from: g */
    public int f2428g;

    /* renamed from: h */
    public int f2429h;

    /* renamed from: i */
    public int f2430i;

    /* renamed from: j */
    public int f2431j;

    /* renamed from: k */
    public C0354d f2432k = f2421l;

    /* renamed from: a */
    public int m3052a() {
        return this.f2423b;
    }

    /* renamed from: a */
    public static C0363g m3042a(C0363g gVar, C0363g gVar2) {
        C0363g gVar3 = new C0363g();
        gVar3.f2423b = gVar.f2423b + gVar2.f2423b;
        gVar3.f2424c = gVar.f2424c + gVar2.f2424c;
        gVar3.f2425d = gVar.f2425d + gVar2.f2425d;
        gVar3.f2426e = gVar.f2426e + gVar2.f2426e;
        gVar3.f2427f = gVar.f2427f + gVar2.f2427f;
        if (!gVar.f2432k.m3097b() || !gVar2.f2432k.m3097b()) {
            gVar3.f2432k = C0354d.m3102a(gVar.f2432k, gVar2.f2432k);
        }
        return gVar3;
    }

    /* renamed from: a */
    public static C0363g m3043a(C0363g gVar, float f) {
        C0363g gVar2 = new C0363g();
        gVar2.f2423b = (int) (gVar.f2423b * f);
        gVar2.f2424c = gVar.f2424c * f;
        gVar2.f2425d = gVar.f2425d * f;
        gVar2.f2426e = gVar.f2426e * f;
        gVar2.f2427f = (int) (gVar.f2427f * f);
        if (!gVar.f2432k.m3097b()) {
            gVar2.f2432k = C0354d.m3093b(gVar.f2432k, f);
        }
        return gVar2;
    }

    /* renamed from: a */
    public static C0363g m3051a(int i) {
        C0363g gVar = new C0363g();
        gVar.f2423b = i;
        return gVar;
    }

    /* renamed from: a */
    public static C0363g m3040a(C0368l lVar, C0809ab abVar, String str, String str2, boolean z) {
        String b = abVar.m579b(str, str2, (String) null);
        if (b != null || z) {
            try {
                return m3039a(lVar, b);
            } catch (C0324at e) {
                throw new C0324at("Error on key:" + str2 + " section:" + str + " - " + e.getMessage());
            }
        } else {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
    }

    /* renamed from: a */
    public static C0363g m3041a(C0368l lVar, C0809ab abVar, String str, String str2, C0363g gVar) {
        String b = abVar.m579b(str, str2, (String) null);
        if (b == null) {
            return gVar;
        }
        try {
            return m3039a(lVar, b);
        } catch (C0324at e) {
            throw new C0324at("Error on key:" + str2 + " section:" + str + " - " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m3034b(int i) {
        if (i < 0 || i > 31) {
            throw new C0324at("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    /* renamed from: a */
    public static int m3049a(int i, String str) {
        if (str.contains("-")) {
            String[] b = C0654f.m1466b(str, '-');
            if (b.length != 2) {
                throw new C0324at("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(b[0]);
            int parseInt2 = Integer.parseInt(b[1]);
            m3034b(parseInt);
            m3034b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new C0324at("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        m3034b(parseInt3);
        return i | (1 << parseInt3);
    }

    /* renamed from: a */
    public static C0363g m3039a(C0368l lVar, String str) {
        String str2;
        String str3;
        if (str == null) {
            return f2422a;
        }
        C0363g gVar = new C0363g();
        for (String str4 : str.split(",|\\|")) {
            String trim = str4.trim();
            if (!trim.equals("")) {
                String[] split = trim.split("=|:");
                if (split.length == 1) {
                    str3 = "credits";
                    str2 = split[0];
                } else if (split.length == 2) {
                    str3 = split[0].trim();
                    str2 = split[1].trim();
                } else {
                    throw new C0324at("Unknown price format:" + str);
                }
                try {
                    if (str3.equals("credits")) {
                        gVar.f2423b = Integer.parseInt(str2);
                    } else if (str3.equals("energy")) {
                        gVar.f2424c = Float.parseFloat(str2);
                    } else if (str3.equals("hp")) {
                        gVar.f2425d = Float.parseFloat(str2);
                    } else if (str3.equals("shield")) {
                        gVar.f2426e = Float.parseFloat(str2);
                    } else if (str3.equals("ammo")) {
                        gVar.f2427f = Integer.parseInt(str2);
                    } else if (str3.equals("hasFlag")) {
                        gVar.f2430i = m3049a(gVar.f2430i, str2);
                    } else if (str3.equals("hasMissingFlag")) {
                        gVar.f2431j = m3049a(gVar.f2431j, str2);
                    } else if (str3.equals("setFlag")) {
                        gVar.f2428g = m3049a(gVar.f2428g, str2);
                    } else if (str3.equals("unsetFlag")) {
                        gVar.f2429h = m3049a(gVar.f2429h, str2);
                    } else {
                        C0345a i = lVar.m2814i(str3);
                        if (i != null) {
                            float parseFloat = Float.parseFloat(str2);
                            if (gVar.f2432k == f2421l) {
                                gVar.f2432k = new C0354d();
                            }
                            gVar.f2432k.m3108a(i, parseFloat);
                        } else {
                            throw new C0324at("Unknown price type:" + str3);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str5 = "Bad price number:" + str2 + " in " + str;
                    if (0 != 0) {
                        str5 = str5 + " (Hint: A whole number was expected)";
                    }
                    throw new C0324at(str5);
                }
            }
        }
        if (gVar.f2432k != f2421l) {
            gVar.f2432k.m3112a();
        }
        if (!gVar.m3028c()) {
            return f2422a;
        }
        return gVar;
    }

    /* renamed from: a */
    public int m3045a(AbstractC0210af afVar, boolean z) {
        int i = 9999;
        if (!z && this.f2423b > 0) {
            i = C0654f.m1456c(9999, afVar.f1441bB.money / this.f2423b);
        }
        if (this.f2424c > 0.0f) {
            i = C0654f.m1456c(i, (int) (afVar.f1457cf / this.f2424c));
        }
        if (this.f2425d > 0.0f) {
            i = C0654f.m1456c(i, (int) (afVar.f1450bY / this.f2425d));
        }
        if (this.f2426e > 0.0f) {
            i = C0654f.m1456c(i, (int) (afVar.f1453cb / this.f2426e));
        }
        if (this.f2427f > 0) {
            i = C0654f.m1456c(i, afVar.f1458cg / this.f2427f);
        }
        if (!this.f2432k.m3097b()) {
            i = C0654f.m1456c(i, C0354d.m3105a(this.f2432k, afVar));
        }
        if (!m3023d(afVar)) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public boolean m3048a(AbstractC0210af afVar) {
        if (!m3031b(afVar, false)) {
            return false;
        }
        m3025c(afVar, false);
        return true;
    }

    /* renamed from: b */
    public boolean m3031b(AbstractC0210af afVar, boolean z) {
        if (!z && this.f2423b > 0 && !afVar.f1441bB.m3559j(this.f2423b)) {
            return false;
        }
        if (this.f2424c > 0.0f && afVar.f1457cf < this.f2424c) {
            return false;
        }
        if (this.f2425d > 0.0f && afVar.f1450bY < this.f2425d) {
            return false;
        }
        if (this.f2426e > 0.0f && afVar.f1453cb < this.f2426e) {
            return false;
        }
        if ((this.f2427f > 0 && afVar.f1458cg < this.f2427f) || !m3023d(afVar)) {
            return false;
        }
        if (this.f2432k.m3097b() || C0354d.m3092b(this.f2432k, afVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3046a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        boolean z = false;
        if (!this.f2432k.m3097b() && C0354d.m3103a(this.f2432k, afVar, afVar2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void m3032b(AbstractC0210af afVar) {
        if (afVar.f1457cf < 0.0f) {
            afVar.f1457cf = 0.0f;
        }
        if (afVar.f1457cf > afVar.mo2628aY()) {
            afVar.f1457cf = afVar.mo2628aY();
        }
        if (afVar.f1453cb < 0.0f) {
            afVar.f1453cb = 0.0f;
        }
        if (afVar.f1453cb > afVar.f1456ce) {
            afVar.f1453cb = afVar.f1456ce;
        }
        if (afVar.f1450bY > afVar.f1451bZ) {
            afVar.f1450bY = afVar.f1451bZ;
        }
        if (afVar.f1458cg < 0) {
            afVar.f1458cg = 0;
        }
    }

    /* renamed from: c */
    public void m3026c(AbstractC0210af afVar) {
        if (this.f2429h != 0) {
            afVar.f1459ch &= this.f2429h ^ (-1);
        }
        if (this.f2428g != 0) {
            afVar.f1459ch |= this.f2428g;
        }
    }

    /* renamed from: c */
    public int m3027c(int i) {
        if (this.f2429h != 0) {
            i &= this.f2429h ^ (-1);
        }
        if (this.f2428g != 0) {
            i |= this.f2428g;
        }
        return i;
    }

    /* renamed from: d */
    public boolean m3023d(AbstractC0210af afVar) {
        if (this.f2430i != 0 && !m3050a(afVar.f1459ch, this.f2430i)) {
            return false;
        }
        if (this.f2431j == 0 || !m3033b(afVar.f1459ch, this.f2431j)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3050a(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: b */
    public static boolean m3033b(int i, int i2) {
        return (i2 & i) != 0;
    }

    /* renamed from: c */
    public void m3025c(AbstractC0210af afVar, boolean z) {
        if (!z) {
            afVar.f1441bB.money -= this.f2423b;
        }
        afVar.f1457cf -= this.f2424c;
        afVar.f1450bY -= this.f2425d;
        afVar.f1453cb -= this.f2426e;
        afVar.f1458cg -= this.f2427f;
        m3026c(afVar);
        if (!this.f2432k.m3097b()) {
            C0354d.m3087c(this.f2432k, afVar);
        }
        m3032b(afVar);
    }

    /* renamed from: e */
    public void m3021e(AbstractC0210af afVar) {
        if (this.f2423b > 0) {
            afVar.f1441bB.m3567f(this.f2423b);
        } else {
            afVar.f1441bB.money += this.f2423b;
        }
        afVar.f1457cf += this.f2424c;
        afVar.f1450bY += this.f2425d;
        afVar.f1453cb += this.f2426e;
        afVar.f1458cg += this.f2427f;
        m3026c(afVar);
        if (!this.f2432k.m3097b()) {
            C0354d.m3084d(this.f2432k, afVar);
        }
        m3032b(afVar);
    }

    /* renamed from: f */
    public void m3019f(AbstractC0210af afVar) {
        afVar.f1441bB.money += this.f2423b;
        afVar.f1457cf += this.f2424c;
        afVar.f1450bY += this.f2425d;
        afVar.f1453cb += this.f2426e;
        afVar.f1458cg += this.f2427f;
        m3026c(afVar);
        if (!this.f2432k.m3097b()) {
            C0354d.m3084d(this.f2432k, afVar);
        }
        m3032b(afVar);
    }

    /* renamed from: a */
    public void m3047a(AbstractC0210af afVar, float f, boolean z) {
        AbstractC0171m mVar;
        if (z) {
            afVar.f1441bB.money = (int) (mVar.money + (this.f2423b * f));
        }
        afVar.f1457cf += this.f2424c * f;
        afVar.f1450bY += this.f2425d * f;
        afVar.f1453cb += this.f2426e * f;
        afVar.f1458cg = (int) (afVar.f1458cg + (this.f2427f * f));
        m3026c(afVar);
        if (!this.f2432k.m3097b()) {
            C0354d.m3104a(this.f2432k, afVar, f);
        }
        m3032b(afVar);
    }

    /* renamed from: b */
    public boolean m3035b() {
        if (this == f2422a) {
            return true;
        }
        if (this.f2423b == 0 && this.f2424c == 0.0f && this.f2425d == 0.0f && this.f2426e == 0.0f && this.f2427f == 0 && this.f2432k.m3097b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3028c() {
        if (this == f2422a) {
            return false;
        }
        if (this.f2423b == 0 && this.f2424c == 0.0f && this.f2425d == 0.0f && this.f2426e == 0.0f && this.f2427f == 0 && this.f2428g == 0 && this.f2429h == 0 && this.f2430i == 0 && this.f2431j == 0 && this.f2432k.m3097b()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m3024d() {
        if (this == f2422a) {
            return false;
        }
        if (this.f2423b == 0 && this.f2424c == 0.0f && this.f2425d == 0.0f && this.f2426e == 0.0f && this.f2427f == 0 && this.f2428g == 0 && this.f2429h == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String m3036a(boolean z, boolean z2, int i, boolean z3) {
        return m3029b(z, z2, i, z3);
    }

    /* renamed from: b */
    private String m3029b(boolean z, boolean z2, int i, boolean z3) {
        String str;
        String str2 = "";
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i2 = 0;
        if (this.f2423b > 0 && 0 < i) {
            str2 = str2 + "$" + this.f2423b + str;
            i2 = 0 + 1;
        }
        if (z2) {
            if (this.f2424c > 0.0f && i2 < i) {
                str2 = str2 + "" + C0654f.m1437f(this.f2424c) + " energy" + str;
                i2++;
            }
            if (this.f2425d > 0.0f && i2 < i) {
                str2 = str2 + "" + C0654f.m1437f(this.f2425d) + " hp" + str;
                i2++;
            }
            if (this.f2426e > 0.0f && i2 < i) {
                str2 = str2 + "" + C0654f.m1437f(this.f2426e) + " shield" + str;
                i2++;
            }
            if (this.f2427f > 0 && i2 < i) {
                str2 = str2 + "" + C0654f.m1437f(this.f2427f) + " ammo" + str;
                i2++;
            }
        }
        if (!this.f2432k.m3097b()) {
            str2 = str2 + this.f2432k.m3098a(z, z2, i - i2, z3, false);
        }
        return C0654f.m1488a(str2, str);
    }

    /* renamed from: g */
    public C0363g m3017g(AbstractC0210af afVar) {
        C0363g gVar = new C0363g();
        if (this.f2423b > 0 && afVar.f1441bB.money < this.f2423b) {
            gVar.f2423b = this.f2423b - afVar.f1441bB.money;
        }
        if (!this.f2432k.m3097b()) {
            gVar.f2432k = this.f2432k.m3110a(afVar);
        }
        return gVar;
    }

    /* renamed from: a */
    public int compareTo(C0363g gVar) {
        return this.f2423b - gVar.f2423b;
    }

    /* renamed from: a */
    public void m3038a(C0690ap apVar) {
        boolean z = false;
        boolean z2 = false;
        if (!(this.f2424c == 0.0f && this.f2425d == 0.0f && this.f2426e == 0.0f && this.f2427f == 0)) {
            z = true;
        }
        if (!(this.f2428g == 0 && this.f2429h == 0 && this.f2430i == 0 && this.f2431j == 0)) {
            z = true;
        }
        if (!this.f2432k.m3097b()) {
            z2 = true;
        }
        byte b = 0;
        if (z) {
            b = (byte) (0 | 1);
        }
        if (z2) {
            b = (byte) (b | 2);
        }
        apVar.mo1130c(b);
        apVar.mo1095a(this.f2423b);
        if (z) {
            apVar.mo1096a(this.f2424c);
            apVar.mo1096a(this.f2425d);
            apVar.mo1096a(this.f2426e);
            apVar.mo1095a(this.f2427f);
            apVar.mo1095a(this.f2428g);
            apVar.mo1095a(this.f2429h);
            apVar.mo1095a(this.f2430i);
            apVar.mo1095a(this.f2431j);
        }
        if (z2) {
            this.f2432k.m3100a(apVar);
        }
    }

    /* renamed from: a */
    public static C0363g m3037a(C0707k kVar) {
        C0363g gVar = new C0363g();
        byte d = kVar.m1065d();
        boolean a = m3050a(d, 1);
        boolean a2 = m3050a(d, 2);
        gVar.f2423b = kVar.m1062f();
        if (a) {
            gVar.f2424c = kVar.m1061g();
            gVar.f2425d = kVar.m1061g();
            gVar.f2426e = kVar.m1061g();
            gVar.f2427f = kVar.m1062f();
            gVar.f2428g = kVar.m1062f();
            gVar.f2429h = kVar.m1062f();
            gVar.f2430i = kVar.m1062f();
            gVar.f2431j = kVar.m1062f();
        }
        if (a2) {
            gVar.f2432k = new C0354d();
            gVar.f2432k.m3099a(kVar);
        }
        return gVar;
    }

    /* renamed from: d */
    public boolean m3022d(AbstractC0210af afVar, boolean z) {
        if (!m3020e(afVar, z)) {
            return false;
        }
        m3018f(afVar, z);
        return true;
    }

    /* renamed from: e */
    public boolean m3020e(AbstractC0210af afVar, boolean z) {
        if (this.f2423b > 0 && !afVar.f1441bB.m3557k(this.f2423b)) {
            return false;
        }
        if (z) {
            return C0647w.m1590c(afVar, this);
        }
        return m3031b(afVar, true);
    }

    /* renamed from: f */
    public void m3018f(AbstractC0210af afVar, boolean z) {
        afVar.f1441bB.f1235n -= this.f2423b;
        if (z) {
            C0647w.m1594a(afVar, this);
        }
    }

    /* renamed from: g */
    public void m3016g(AbstractC0210af afVar, boolean z) {
        afVar.f1441bB.f1235n += this.f2423b;
        if (z) {
            C0647w.m1591b(afVar, this);
        }
    }

    /* renamed from: b */
    public boolean m3030b(C0363g gVar) {
        if (this.f2423b > 0 && gVar.f2423b > 0) {
            return true;
        }
        if (this.f2425d > 0.0f && gVar.f2425d > 0.0f) {
            return true;
        }
        if (this.f2426e > 0.0f && gVar.f2426e > 0.0f) {
            return true;
        }
        if (this.f2427f > 0 && gVar.f2427f > 0) {
            return true;
        }
        if (this.f2432k.m3097b() || gVar.f2432k.m3097b() || !this.f2432k.m3085d(gVar.f2432k)) {
            return false;
        }
        return true;
    }
}
