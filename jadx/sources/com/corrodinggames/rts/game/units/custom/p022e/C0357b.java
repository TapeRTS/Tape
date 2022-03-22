package com.corrodinggames.rts.game.units.custom.p022e;

import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import java.util.regex.Matcher;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/b.class */
public class C0357b {

    /* renamed from: a */
    public C0361e f2396a;

    /* renamed from: b */
    public C0361e f2397b;

    public C0357b() {
        this.f2396a = new C0361e();
        this.f2397b = new C0361e();
    }

    public C0357b(C0361e eVar, C0361e eVar2) {
        this.f2396a = eVar;
        this.f2397b = eVar2;
    }

    /* renamed from: a */
    public void m2964a() {
        this.f2396a.m2951a();
        this.f2397b.m2951a();
    }

    /* renamed from: b */
    public C0357b m2961b() {
        return new C0357b(this.f2396a, new C0361e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.corrodinggames.rts.game.units.custom.e.b$1] */
    /* renamed from: a */
    public static double m2962a(final String str) {
        return new Object() { // from class: com.corrodinggames.rts.game.units.custom.e.b.1

            /* renamed from: a */
            int f2398a = -1;

            /* renamed from: b */
            int f2399b;

            /* renamed from: a */
            void m2958a() {
                int i = this.f2398a + 1;
                this.f2398a = i;
                this.f2399b = i < str.length() ? str.charAt(this.f2398a) : (char) 65535;
            }

            /* renamed from: a */
            boolean m2957a(int i) {
                while (this.f2399b == 32) {
                    m2958a();
                }
                if (this.f2399b != i) {
                    return false;
                }
                m2958a();
                return true;
            }

            /* renamed from: b */
            double m2956b() {
                m2958a();
                double c = m2955c();
                if (this.f2398a >= str.length()) {
                    return c;
                }
                throw new RuntimeException("Unexpected: " + ((char) this.f2399b));
            }

            /* renamed from: c */
            double m2955c() {
                double d = m2954d();
                while (true) {
                    if (m2957a(43)) {
                        d += m2954d();
                    } else if (!m2957a(45)) {
                        return d;
                    } else {
                        d -= m2954d();
                    }
                }
            }

            /* renamed from: d */
            double m2954d() {
                double e = m2953e();
                while (true) {
                    if (m2957a(42)) {
                        e *= m2953e();
                    } else if (!m2957a(47)) {
                        return e;
                    } else {
                        e /= m2953e();
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v71, types: [double] */
            /* JADX WARN: Type inference failed for: r6v0, types: [double] */
            /* JADX WARN: Type inference failed for: r6v10 */
            /* JADX WARN: Type inference failed for: r6v12 */
            /* JADX WARN: Type inference failed for: r6v13 */
            /* JADX WARN: Type inference failed for: r6v14 */
            /* JADX WARN: Type inference failed for: r6v15 */
            /* JADX WARN: Type inference failed for: r6v16 */
            /* JADX WARN: Type inference failed for: r6v17 */
            /* JADX WARN: Unknown variable types count: 1 */
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            double m2953e() {
                ?? r6;
                if (m2957a(43)) {
                    return m2953e();
                }
                if (m2957a(45)) {
                    return -m2953e();
                }
                int i = this.f2398a;
                if (m2957a(40)) {
                    r6 = m2955c();
                    m2957a(41);
                } else if ((this.f2399b >= 48 && this.f2399b <= 57) || this.f2399b == 46) {
                    while (true) {
                        if ((this.f2399b < 48 || this.f2399b > 57) && this.f2399b != 46) {
                            break;
                        }
                        m2958a();
                    }
                    r6 = Double.parseDouble(str.substring(i, this.f2398a));
                } else if (this.f2399b < 97 || this.f2399b > 122) {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2399b));
                } else {
                    while (this.f2399b >= 97 && this.f2399b <= 122) {
                        m2958a();
                    }
                    String substring = str.substring(i, this.f2398a);
                    double e = m2953e();
                    if (substring.equals("sqrt")) {
                        r6 = Math.sqrt(e);
                    } else if (substring.equals("sin")) {
                        r6 = Math.sin(Math.toRadians(e));
                    } else if (substring.equals("cos")) {
                        r6 = Math.cos(Math.toRadians(e));
                    } else if (substring.equals("tan")) {
                        r6 = Math.tan(Math.toRadians(e));
                    } else if (substring.equals("int")) {
                        r6 = (int) e;
                    } else {
                        throw new RuntimeException("Unknown function: " + substring);
                    }
                }
                double d = r6;
                if (m2957a(94)) {
                    d = Math.pow(r6, m2953e());
                }
                return d == Double.MIN_VALUE ? 1.0d : 0.0d;
            }
        }.m2956b();
    }

    /* renamed from: b */
    public boolean m2959b(String str) {
        return str.contains("*") || str.contains("/") || str.contains("+") || str.contains("-") || str.contains("(") || str.contains(")") || str.contains("^");
    }

    /* renamed from: a */
    public String m2963a(C0368l lVar, C0809ab abVar, String str, String str2) {
        String trim = str2.trim();
        boolean b = m2959b(trim);
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = C0356a.f2394b.matcher(trim);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                throw new C0324at("Too many loops while parsing");
            }
            String group = matcher.group(0);
            if (!C0654f.m1410q(group) && !group.equals("int") && !group.equals("cos") && !group.equals("sin") && !group.equals("sqrt")) {
                String b2 = m2960b(lVar, abVar, str, group);
                if (!b || C0654f.m1410q(b2)) {
                    matcher.appendReplacement(stringBuffer, b2);
                } else {
                    throw new C0324at("Cannot do maths on '" + b2 + "' from " + group + " (not a number)");
                }
            }
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        if (b) {
            stringBuffer2 = C0654f.m1479b(m2962a(stringBuffer2));
        }
        return stringBuffer2;
    }

    /* renamed from: b */
    public String m2960b(C0368l lVar, C0809ab abVar, String str, String str2) {
        if (str2.contains(".")) {
            String[] b = C0654f.m1464b(str2, '.');
            if (b.length != 2) {
                throw new C0324at("Unexpected key format: " + str2);
            }
            String str3 = b[0];
            String str4 = b[1];
            if (str3.equals("section")) {
                str3 = str;
            }
            String b2 = abVar.m579b(str3, str4, (String) null);
            if (b2 == null) {
                throw new C0324at("Could not find: [" + str3 + "]" + str4 + " in this conf file");
            } else if (!b2.contains("${")) {
                return b2;
            } else {
                throw new C0324at("Reference [" + str3 + "]" + str4 + " is dynamic, chaining is not yet supported");
            }
        } else {
            String a = this.f2397b.m2950a(str2);
            if (a != null) {
                return a;
            }
            String a2 = this.f2396a.m2950a(str2);
            if (a2 != null) {
                return a2;
            }
            throw new C0324at("Could not find variable with name: " + str2);
        }
    }
}
