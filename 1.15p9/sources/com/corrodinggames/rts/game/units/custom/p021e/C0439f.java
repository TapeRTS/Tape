package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f.class */
public final class C0439f {

    /* renamed from: a */
    public static final C0439f f2800a = new C0439f().m5129a();

    /* renamed from: b */
    public final C1101m f2801b = new C1101m();

    /* renamed from: c */
    boolean f2802c;

    /* renamed from: a */
    public C0439f m5129a() {
        this.f2802c = true;
        return this;
    }

    /* renamed from: b */
    public void m5110b() {
        this.f2801b.clear();
    }

    /* renamed from: c */
    public boolean m5100c() {
        if (this.f2801b.f6888a == 0) {
            return true;
        }
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0438e) m559a[i2]).f2799b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public double m5123a(C0428a c0428a) {
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a == c0428a) {
                return c0438e.f2799b;
            }
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double m5108b(C0428a c0428a) {
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0438e c0438e = (C0438e) m559a[i3];
            if (c0438e.f2798a == c0428a) {
                i2 = (int) (i2 + c0438e.f2799b);
            }
            if (c0438e.f2798a.f2753t == c0428a) {
                i2 = (int) (i2 + c0438e.f2799b);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m5121a(C0439f c0439f) {
        m5110b();
        m5106b(c0439f);
    }

    /* renamed from: a */
    public void m5122a(C0428a c0428a, double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a == c0428a) {
                c0438e.f2799b = d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2799b = d;
        this.f2801b.add(c0438e2);
    }

    /* renamed from: a */
    public void m5128a(double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            ((C0438e) m559a[i2]).f2799b *= d;
        }
    }

    /* renamed from: b */
    public void m5107b(C0428a c0428a, double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1101m c1101m = this.f2801b;
        int i = c1101m.f6888a;
        Object[] m559a = c1101m.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a == c0428a) {
                c0438e.f2799b += d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2799b = d;
        c1101m.add(c0438e2);
    }

    /* renamed from: c */
    public void m5098c(C0428a c0428a, double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1101m c1101m = this.f2801b;
        int i = c1101m.f6888a;
        Object[] m559a = c1101m.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a == c0428a) {
                c0438e.f2799b += d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2799b = d;
        c1101m.add(c0438e2);
    }

    /* renamed from: d */
    public void m5093d(C0428a c0428a, double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        m5107b(c0428a, -d);
    }

    /* renamed from: a */
    public void m5124a(C0424b c0424b, double d, double d2) {
        if (c0424b.f2698b >= d && c0424b.f2698b <= d2) {
            m5098c(C0428a.f2761B, c0424b.f2698b);
        }
        m5119a(c0424b.f2707k, d, d2);
    }

    /* renamed from: b */
    public void m5109b(C0424b c0424b, double d, double d2) {
        if (c0424b.f2698b >= d && c0424b.f2698b <= d2) {
            m5098c(C0428a.f2761B, -c0424b.f2698b);
        }
        m5104b(c0424b.f2707k, d, d2);
    }

    /* renamed from: a */
    public void m5125a(C0424b c0424b) {
        m5098c(C0428a.f2761B, c0424b.f2698b);
        m5106b(c0424b.f2707k);
    }

    /* renamed from: b */
    public void m5106b(C0439f c0439f) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            m5107b(c0438e.f2798a, c0438e.f2799b);
        }
    }

    /* renamed from: a */
    public void m5119a(C0439f c0439f, double d, double d2) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2799b >= d && c0438e.f2799b <= d2) {
                m5107b(c0438e.f2798a, c0438e.f2799b);
            }
        }
    }

    /* renamed from: a */
    public void m5120a(C0439f c0439f, double d) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            m5107b(c0438e.f2798a, c0438e.f2799b * d);
        }
    }

    /* renamed from: c */
    public void m5097c(C0439f c0439f) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            m5093d(c0438e.f2798a, c0438e.f2799b);
        }
    }

    /* renamed from: b */
    public void m5104b(C0439f c0439f, double d, double d2) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2799b >= d && c0438e.f2799b <= d2) {
                m5093d(c0438e.f2798a, c0438e.f2799b);
            }
        }
    }

    /* renamed from: a */
    public static C0439f m5115a(C0439f c0439f, C0439f c0439f2) {
        C0439f c0439f3 = new C0439f();
        c0439f3.m5106b(c0439f);
        c0439f3.m5106b(c0439f2);
        return c0439f3;
    }

    /* renamed from: b */
    public static C0439f m5101b(C0439f c0439f, C0439f c0439f2) {
        C0439f c0439f3 = new C0439f();
        c0439f3.m5106b(c0439f);
        c0439f3.m5097c(c0439f2);
        return c0439f3;
    }

    /* renamed from: b */
    public static C0439f m5105b(C0439f c0439f, double d) {
        C0439f c0439f2 = new C0439f();
        c0439f2.m5120a(c0439f, d);
        return c0439f2;
    }

    /* renamed from: d */
    public static C0439f m5092d(C0439f c0439f) {
        C0439f c0439f2 = new C0439f();
        c0439f2.m5106b(c0439f);
        return c0439f2;
    }

    /* renamed from: a */
    public static int m5118a(C0439f c0439f, Unit unit) {
        double m5886a;
        int i = 9999;
        int i2 = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0438e c0438e = (C0438e) m559a[i3];
            if (c0438e.f2799b > 0.0d) {
                if (c0438e.f2798a.f2751r) {
                    m5886a = unit.team.m6352c(c0438e.f2798a);
                } else {
                    m5886a = unit.m5886a(c0438e.f2798a);
                }
                i = CommonUtils.m2289c(i, (int) (m5886a / c0438e.f2799b));
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m5103b(C0439f c0439f, Unit unit) {
        double m5886a;
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                m5886a = unit.team.m6352c(c0438e.f2798a);
            } else {
                m5886a = unit.m5886a(c0438e.f2798a);
            }
            if (c0438e.f2799b > m5886a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5117a(C0439f c0439f, Unit unit, double d) {
        double m5886a;
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                m5886a = unit.team.m6352c(c0438e.f2798a);
            } else {
                m5886a = unit.m5886a(c0438e.f2798a);
            }
            if (c0438e.f2799b * d > m5886a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m5096c(C0439f c0439f, Unit unit) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                unit.team.m6402S().m5093d(c0438e.f2798a, c0438e.f2799b);
            } else {
                unit.m5786dd().m5093d(c0438e.f2798a, c0438e.f2799b);
            }
        }
    }

    /* renamed from: b */
    public static void m5102b(C0439f c0439f, Unit unit, double d) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                unit.team.m6402S().m5093d(c0438e.f2798a, c0438e.f2799b * d);
            } else {
                unit.m5786dd().m5093d(c0438e.f2798a, c0438e.f2799b * d);
            }
        }
    }

    /* renamed from: d */
    public static void m5091d(C0439f c0439f, Unit unit) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                unit.team.m6402S().m5107b(c0438e.f2798a, c0438e.f2799b);
            } else {
                unit.m5786dd().m5107b(c0438e.f2798a, c0438e.f2799b);
            }
        }
    }

    /* renamed from: c */
    public static void m5095c(C0439f c0439f, Unit unit, double d) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                unit.team.m6402S().m5107b(c0438e.f2798a, c0438e.f2799b * d);
            } else {
                unit.m5786dd().m5107b(c0438e.f2798a, c0438e.f2799b * d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5116a(C0439f c0439f, Unit unit, Unit unit2) {
        boolean z = false;
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            C0428a c0428a = c0438e.f2798a;
            double d = c0438e.f2799b;
            if (d != 0.0d) {
                double mo5140a = c0428a.mo5140a(unit);
                double mo5140a2 = c0428a.mo5140a(unit2);
                if (d >= 0.0d) {
                    if (mo5140a > 0.0d) {
                        double m2371a = CommonUtils.m2371a(mo5140a, d);
                        c0428a.mo5138b(unit, -m2371a);
                        c0428a.mo5138b(unit2, m2371a);
                        z = true;
                    }
                } else if (mo5140a2 > 0.0d) {
                    double m2371a2 = CommonUtils.m2371a(mo5140a2, -d);
                    c0428a.mo5138b(unit2, -m2371a2);
                    c0428a.mo5138b(unit, m2371a2);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public String m5111a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        C0813u c0813u = new C0813u();
        m5114a(c0813u, z, z2, i, z3, z4, null, 0);
        return c0813u.m1913a();
    }

    /* renamed from: a */
    public void m5114a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, boolean z4, Unit unit, int i2) {
        String str;
        int i3 = this.f2801b.f6888a;
        if (i3 == 0) {
            return;
        }
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i4 = 0;
        Object[] m559a = this.f2801b.m559a();
        for (int i5 = 0; i5 < i3; i5++) {
            C0438e c0438e = (C0438e) m559a[i5];
            if ((c0438e.f2799b > 0.0d || z4) && i4 < i) {
                C0428a c0428a = c0438e.f2798a;
                if (z3 || !c0428a.m5161a()) {
                    boolean z5 = false;
                    if (c0428a.f2756w != null && c0428a.f2757x) {
                        z5 = true;
                        int m1901c = c0813u.m1901c() - 2;
                        if (m1901c < 2) {
                            m1901c = 2;
                        }
                        c0813u.m1909a(c0428a.f2756w, m1901c * 3, m1901c);
                    }
                    String str2 = c0428a.m5158a(c0438e.f2799b, false, z5) + str;
                    boolean z6 = false;
                    int i6 = 0;
                    if (c0428a.f2745l != null && c0428a.f2746m) {
                        z6 = true;
                        i6 = c0428a.f2745l.intValue();
                    }
                    if (unit != null && c0428a.mo5140a(unit) < c0438e.f2799b) {
                        z6 = true;
                        i6 = i2;
                    }
                    if (z6) {
                        c0813u.m1907a(str2, i6);
                    } else {
                        c0813u.m1902b(str2);
                    }
                    i4++;
                }
            }
        }
    }

    /* renamed from: a */
    public void m5113a(C0859ar c0859ar) {
        if (this.f2801b.f6888a == 0) {
            c0859ar.m1554c(-1);
            return;
        }
        c0859ar.m1554c(0);
        c0859ar.mo1483a((short) this.f2801b.f6888a);
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            c0859ar.m1553c(c0438e.f2798a.f2735b);
            c0859ar.m1579a(c0438e.f2799b);
        }
    }

    /* renamed from: a */
    public void m5112a(C0876k c0876k) {
        if (this.f2802c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (c0876k.m1457d() == -1) {
            return;
        }
        int m1438v = c0876k.m1438v();
        this.f2801b.clear();
        for (int i = 0; i < m1438v; i++) {
            C0428a m5151b = C0428a.m5151b(c0876k.m1448l());
            double m1452h = c0876k.m1452h();
            if (m5151b != null && m1452h != 0.0d) {
                this.f2801b.add(new C0438e(m5151b, m1452h));
            }
        }
    }

    /* renamed from: d */
    public int m5094d() {
        int i = 0;
        int i2 = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0438e) m559a[i3]).f2799b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public boolean m5089e(C0439f c0439f) {
        if (m5094d() != c0439f.m5094d()) {
            return false;
        }
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (!CommonUtils.m2319b(c0438e.f2799b, c0439f.m5123a(c0438e.f2798a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m5088f(C0439f c0439f) {
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2799b > 0.0d && c0439f.m5108b(c0438e.f2798a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0439f m5127a(Unit unit) {
        double m5886a;
        C0439f c0439f = new C0439f();
        int i = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.f2751r) {
                m5886a = unit.team.m6352c(c0438e.f2798a);
            } else {
                m5886a = unit.m5886a(c0438e.f2798a);
            }
            if (m5886a < c0438e.f2799b) {
                c0439f.m5107b(c0438e.f2798a, c0438e.f2799b - m5886a);
            }
        }
        if (c0439f.m5100c()) {
            return f2800a;
        }
        return c0439f;
    }

    /* renamed from: a */
    public String m5126a(Unit unit, String str, int i, boolean z) {
        double m5886a;
        String str2 = null;
        int i2 = 0;
        int i3 = this.f2801b.f6888a;
        Object[] m559a = this.f2801b.m559a();
        for (int i4 = 0; i4 < i3; i4++) {
            C0438e c0438e = (C0438e) m559a[i4];
            if (z || !c0438e.f2798a.m5161a()) {
                if (c0438e.f2798a.f2751r) {
                    m5886a = unit.team.m6352c(c0438e.f2798a);
                } else {
                    m5886a = unit.m5886a(c0438e.f2798a);
                }
                if (m5886a < c0438e.f2799b) {
                    double d = c0438e.f2799b - m5886a;
                    String m5144h = c0438e.f2798a.m5144h();
                    if (str2 == null) {
                        str2 = m5144h;
                    } else {
                        str2 = str2 + str + m5144h;
                    }
                    i2++;
                    if (i2 > i) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return str2;
    }

    /* renamed from: g */
    public void m5087g(C0439f c0439f) {
        m5110b();
        m5106b(c0439f);
    }

    /* renamed from: c */
    public void m5099c(C0428a c0428a) {
        C1101m c1101m = this.f2801b;
        int i = c1101m.f6888a;
        Object[] m559a = c1101m.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0438e) m559a[i2]).f2798a == c0428a) {
                return;
            }
        }
        C0438e c0438e = new C0438e(c0428a);
        c0438e.f2799b = 0.0d;
        c1101m.add(c0438e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.custom.e.f$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f$1.class */
    public class C04401 implements Comparator {
        C04401() {
        }

        /* renamed from: a */
        public int mo4637a(C0438e c0438e, C0438e c0438e2) {
            if (c0438e.f2798a == null || c0438e2.f2798a == null) {
                return 0;
            }
            return Float.compare(c0438e.f2798a.f2755v, c0438e2.f2798a.f2755v);
        }
    }

    /* renamed from: e */
    public void m5090e() {
        Collections.sort(this.f2801b, new C04401());
    }
}
