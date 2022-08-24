package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.regex.Matcher;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/b.class */
public class C0443b {

    /* renamed from: a */
    public C0446d f2824a;

    /* renamed from: b */
    public C0446d f2825b;

    public C0443b() {
        this.f2824a = new C0446d();
        this.f2825b = new C0446d();
    }

    public C0443b(C0446d c0446d, C0446d c0446d2) {
        this.f2824a = c0446d;
        this.f2825b = c0446d2;
    }

    /* renamed from: a */
    public void m4431a() {
        this.f2824a.m4419a();
        this.f2825b.m4419a();
    }

    /* renamed from: b */
    public C0443b m4428b() {
        return new C0443b(this.f2824a, new C0446d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.corrodinggames.rts.game.units.custom.f.b$1] */
    /* renamed from: a */
    public static double m4429a(final String str) {
        return new Object() { // from class: com.corrodinggames.rts.game.units.custom.f.b.1

            /* renamed from: a */
            int f2826a = -1;

            /* renamed from: b */
            int f2827b;

            /* renamed from: a */
            void m4425a() {
                int i = this.f2826a + 1;
                this.f2826a = i;
                this.f2827b = i < str.length() ? str.charAt(this.f2826a) : (char) 65535;
            }

            /* renamed from: a */
            boolean m4424a(int i) {
                while (this.f2827b == 32) {
                    m4425a();
                }
                if (this.f2827b == i) {
                    m4425a();
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            double m4423b() {
                m4425a();
                double m4422c = m4422c();
                if (this.f2826a < str.length()) {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2827b));
                }
                return m4422c;
            }

            /* renamed from: c */
            double m4422c() {
                double m4421d = m4421d();
                while (true) {
                    double d = m4421d;
                    if (m4424a(43)) {
                        m4421d = d + m4421d();
                    } else if (!m4424a(45)) {
                        return d;
                    } else {
                        m4421d = d - m4421d();
                    }
                }
            }

            /* renamed from: d */
            double m4421d() {
                double m4420e = m4420e();
                while (true) {
                    double d = m4420e;
                    if (m4424a(42)) {
                        m4420e = d * m4420e();
                    } else if (m4424a(47)) {
                        m4420e = d / m4420e();
                    } else if (!m4424a(37)) {
                        return d;
                    } else {
                        m4420e = d % m4420e();
                    }
                }
            }

            /* renamed from: e */
            double m4420e() {
                double d;
                if (m4424a(43)) {
                    return m4420e();
                }
                if (m4424a(45)) {
                    return -m4420e();
                }
                int i = this.f2826a;
                if (m4424a(40)) {
                    d = m4422c();
                    m4424a(41);
                } else if ((this.f2827b >= 48 && this.f2827b <= 57) || this.f2827b == 46) {
                    while (true) {
                        if ((this.f2827b < 48 || this.f2827b > 57) && this.f2827b != 46) {
                            break;
                        }
                        m4425a();
                    }
                    d = Double.parseDouble(str.substring(i, this.f2826a));
                } else if (this.f2827b >= 97 && this.f2827b <= 122) {
                    while (this.f2827b >= 97 && this.f2827b <= 122) {
                        m4425a();
                    }
                    String substring = str.substring(i, this.f2826a);
                    double m4420e = m4420e();
                    if (substring.equals("sqrt")) {
                        d = Math.sqrt(m4420e);
                    } else if (substring.equals("sin")) {
                        d = Math.sin(Math.toRadians(m4420e));
                    } else if (substring.equals("cos")) {
                        d = Math.cos(Math.toRadians(m4420e));
                    } else if (substring.equals("tan")) {
                        d = Math.tan(Math.toRadians(m4420e));
                    } else if (!substring.equals("int")) {
                        throw new RuntimeException("Unknown function: " + substring);
                    } else {
                        d = (int) m4420e;
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2827b));
                }
                if (m4424a(94)) {
                    d = Math.pow(d, m4420e());
                }
                return d;
            }
        }.m4423b();
    }

    /* renamed from: b */
    public boolean m4426b(String str) {
        return str.contains("*") || str.contains("/") || str.contains("+") || str.contains("-") || str.contains("(") || str.contains(")") || str.contains("^") || str.contains("%");
    }

    /* renamed from: a */
    public String m4430a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        String trim = str2.trim();
        boolean m4426b = m4426b(trim);
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = C0442a.f2822b.matcher(trim);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                throw new C0412bm("Too many loops while parsing");
            }
            String group = matcher.group(0);
            if (!C0758f.m2231u(group) && !group.equals("int") && !group.equals("cos") && !group.equals("sin") && !group.equals("sqrt")) {
                String m4427b = m4427b(c0453l, c1072ab, str, group);
                if (m4426b && !C0758f.m2231u(m4427b)) {
                    throw new C0412bm("Cannot do maths on '" + m4427b + "' from " + group + " (not a number)");
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(m4427b));
            }
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        if (m4426b) {
            stringBuffer2 = C0758f.m2317b(m4429a(stringBuffer2));
        }
        return stringBuffer2;
    }

    /* renamed from: b */
    public String m4427b(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        if (str2.contains(".")) {
            String[] m2284c = C0758f.m2284c(str2, '.');
            if (m2284c.length != 2) {
                throw new C0412bm("Unexpected key format: " + str2);
            }
            String str3 = m2284c[0];
            String str4 = m2284c[1];
            if (str3.equals("section")) {
                str3 = str;
            }
            String m675b = c1072ab.m675b(str3, str4, (String) null);
            if (m675b == null) {
                if (str3.equalsIgnoreCase("self")) {
                    throw new C0412bm("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file. Hint: You might have wanted % instead of $ for a dynamic string");
                }
                throw new C0412bm("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file");
            } else if (m675b.contains("${")) {
                throw new C0412bm("Reference [" + str3 + "]" + str4 + " is dynamic, chaining is not yet supported");
            } else {
                return m675b;
            }
        }
        String m4418a = this.f2825b.m4418a(str2);
        if (m4418a != null) {
            return m4418a;
        }
        String m4418a2 = this.f2824a.m4418a(str2);
        if (m4418a2 != null) {
            return m4418a2;
        }
        throw new C0412bm("Could not find variable with name: " + str2);
    }
}
