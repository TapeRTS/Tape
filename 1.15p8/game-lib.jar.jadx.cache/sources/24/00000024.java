package com.corrodinggames.rts.game.units.custom.p020e;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.gui.C0732u;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/e.class */
public final class C0421e {

    /* renamed from: a */
    public static final C0421e f2634a = new C0421e().m3315a();

    /* renamed from: b */
    public final ObjectVector f2635b = new ObjectVector();

    /* renamed from: c */
    boolean f2636c;

    /* renamed from: a */
    public C0421e m3315a() {
        this.f2636c = true;
        return this;
    }

    /* renamed from: b */
    public void m3297b() {
        this.f2635b.clear();
    }

    /* renamed from: c */
    public boolean m3287c() {
        if (this.f2635b.size == 0) {
            return true;
        }
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0420d) items[i2]).f2633b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public double m3310a(C0411a c0411a) {
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a == c0411a) {
                return c0420d.f2633b;
            }
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double m3295b(C0411a c0411a) {
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0420d c0420d = (C0420d) items[i3];
            if (c0420d.f2632a == c0411a) {
                i2 = (int) (i2 + c0420d.f2633b);
            }
            if (c0420d.f2632a.f2592s == c0411a) {
                i2 = (int) (i2 + c0420d.f2633b);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m3308a(C0421e c0421e) {
        m3297b();
        m3293b(c0421e);
    }

    /* renamed from: a */
    public void m3309a(C0411a c0411a, double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a == c0411a) {
                c0420d.f2633b = d;
                return;
            }
        }
        C0420d c0420d2 = new C0420d(c0411a);
        c0420d2.f2633b = d;
        this.f2635b.add(c0420d2);
    }

    /* renamed from: a */
    public void m3314a(double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            ((C0420d) items[i2]).f2633b *= d;
        }
    }

    /* renamed from: b */
    public void m3294b(C0411a c0411a, double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        ObjectVector objectVector = this.f2635b;
        int i = objectVector.size;
        Object[] items = objectVector.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a == c0411a) {
                c0420d.f2633b += d;
                return;
            }
        }
        C0420d c0420d2 = new C0420d(c0411a);
        c0420d2.f2633b = d;
        objectVector.add(c0420d2);
    }

    /* renamed from: c */
    public void m3285c(C0411a c0411a, double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        ObjectVector objectVector = this.f2635b;
        int i = objectVector.size;
        Object[] items = objectVector.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a == c0411a) {
                c0420d.f2633b += d;
                return;
            }
        }
        C0420d c0420d2 = new C0420d(c0411a);
        c0420d2.f2633b = d;
        objectVector.add(c0420d2);
    }

    /* renamed from: d */
    public void m3280d(C0411a c0411a, double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        m3294b(c0411a, -d);
    }

    /* renamed from: a */
    public void m3311a(C0407b c0407b, double d, double d2) {
        if (c0407b.f2538b >= d && c0407b.f2538b <= d2) {
            m3285c(C0411a.f2600A, c0407b.f2538b);
        }
        m3306a(c0407b.f2547k, d, d2);
    }

    /* renamed from: b */
    public void m3296b(C0407b c0407b, double d, double d2) {
        if (c0407b.f2538b >= d && c0407b.f2538b <= d2) {
            m3285c(C0411a.f2600A, -c0407b.f2538b);
        }
        m3291b(c0407b.f2547k, d, d2);
    }

    /* renamed from: a */
    public void m3312a(C0407b c0407b) {
        m3285c(C0411a.f2600A, c0407b.f2538b);
        m3293b(c0407b.f2547k);
    }

    /* renamed from: b */
    public void m3293b(C0421e c0421e) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            m3294b(c0420d.f2632a, c0420d.f2633b);
        }
    }

    /* renamed from: a */
    public void m3306a(C0421e c0421e, double d, double d2) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2633b >= d && c0420d.f2633b <= d2) {
                m3294b(c0420d.f2632a, c0420d.f2633b);
            }
        }
    }

    /* renamed from: a */
    public void m3307a(C0421e c0421e, double d) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            m3294b(c0420d.f2632a, c0420d.f2633b * d);
        }
    }

    /* renamed from: c */
    public void m3284c(C0421e c0421e) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            m3280d(c0420d.f2632a, c0420d.f2633b);
        }
    }

    /* renamed from: b */
    public void m3291b(C0421e c0421e, double d, double d2) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2633b >= d && c0420d.f2633b <= d2) {
                m3280d(c0420d.f2632a, c0420d.f2633b);
            }
        }
    }

    /* renamed from: a */
    public static C0421e m3302a(C0421e c0421e, C0421e c0421e2) {
        C0421e c0421e3 = new C0421e();
        c0421e3.m3293b(c0421e);
        c0421e3.m3293b(c0421e2);
        return c0421e3;
    }

    /* renamed from: b */
    public static C0421e m3288b(C0421e c0421e, C0421e c0421e2) {
        C0421e c0421e3 = new C0421e();
        c0421e3.m3293b(c0421e);
        c0421e3.m3284c(c0421e2);
        return c0421e3;
    }

    /* renamed from: b */
    public static C0421e m3292b(C0421e c0421e, double d) {
        C0421e c0421e2 = new C0421e();
        c0421e2.m3307a(c0421e, d);
        return c0421e2;
    }

    /* renamed from: d */
    public static C0421e m3279d(C0421e c0421e) {
        C0421e c0421e2 = new C0421e();
        c0421e2.m3293b(c0421e);
        return c0421e2;
    }

    /* renamed from: a */
    public static int m3305a(C0421e c0421e, Unit unit) {
        double d;
        int i = 9999;
        int i2 = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i3 = 0; i3 < i2; i3++) {
            C0420d c0420d = (C0420d) items[i3];
            if (c0420d.f2633b > 0.0d) {
                if (c0420d.f2632a.f2590q) {
                    d = unit.team.m3923c(c0420d.f2632a);
                } else {
                    d = unit.m3774a(c0420d.f2632a);
                }
                i = CommonUtils.mini(i, (int) (d / c0420d.f2633b));
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m3290b(C0421e c0421e, Unit unit) {
        double d;
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                d = unit.team.m3923c(c0420d.f2632a);
            } else {
                d = unit.m3774a(c0420d.f2632a);
            }
            if (c0420d.f2633b > d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3304a(C0421e c0421e, Unit unit, double d) {
        double d2;
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                d2 = unit.team.m3923c(c0420d.f2632a);
            } else {
                d2 = unit.m3774a(c0420d.f2632a);
            }
            if (c0420d.f2633b * d > d2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m3283c(C0421e c0421e, Unit unit) {
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                unit.team.m3972P().m3280d(c0420d.f2632a, c0420d.f2633b);
            } else {
                unit.mo1776db().m3280d(c0420d.f2632a, c0420d.f2633b);
            }
        }
    }

    /* renamed from: b */
    public static void m3289b(C0421e c0421e, Unit unit, double d) {
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                unit.team.m3972P().m3280d(c0420d.f2632a, c0420d.f2633b * d);
            } else {
                unit.mo1776db().m3280d(c0420d.f2632a, c0420d.f2633b * d);
            }
        }
    }

    /* renamed from: d */
    public static void m3278d(C0421e c0421e, Unit unit) {
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                unit.team.m3972P().m3294b(c0420d.f2632a, c0420d.f2633b);
            } else {
                unit.mo1776db().m3294b(c0420d.f2632a, c0420d.f2633b);
            }
        }
    }

    /* renamed from: c */
    public static void m3282c(C0421e c0421e, Unit unit, double d) {
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                unit.team.m3972P().m3294b(c0420d.f2632a, c0420d.f2633b * d);
            } else {
                unit.mo1776db().m3294b(c0420d.f2632a, c0420d.f2633b * d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3303a(C0421e c0421e, Unit unit, Unit unit2) {
        boolean z = false;
        int i = c0421e.f2635b.size;
        Object[] items = c0421e.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            C0411a c0411a = c0420d.f2632a;
            double d = c0420d.f2633b;
            if (d != 0.0d) {
                double mo3326a = c0411a.mo3326a(unit);
                double mo3326a2 = c0411a.mo3326a(unit2);
                if (d >= 0.0d) {
                    if (mo3326a > 0.0d) {
                        double mind = CommonUtils.mind(mo3326a, d);
                        c0411a.mo3324b(unit, -mind);
                        c0411a.mo3324b(unit2, mind);
                        z = true;
                    }
                } else if (mo3326a2 > 0.0d) {
                    double mind2 = CommonUtils.mind(mo3326a2, -d);
                    c0411a.mo3324b(unit2, -mind2);
                    c0411a.mo3324b(unit, mind2);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public String m3298a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        C0732u c0732u = new C0732u();
        m3301a(c0732u, z, z2, i, z3, z4);
        return c0732u.m1772a();
    }

    /* renamed from: a */
    public void m3301a(C0732u c0732u, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        String str;
        int i2 = this.f2635b.size;
        if (i2 == 0) {
            return;
        }
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        Object[] items = this.f2635b.getItems();
        for (int i4 = 0; i4 < i2; i4++) {
            C0420d c0420d = (C0420d) items[i4];
            if ((c0420d.f2633b > 0.0d || z4) && i3 < i) {
                C0411a c0411a = c0420d.f2632a;
                if (z3 || !c0411a.m3344a()) {
                    boolean z5 = false;
                    if (c0411a.f2595v != null && c0411a.f2596w) {
                        z5 = true;
                        int m1759c = c0732u.m1759c() - 2;
                        if (m1759c < 2) {
                            m1759c = 2;
                        }
                        c0732u.m1767a(c0411a.f2595v, m1759c * 3, m1759c);
                    }
                    String str2 = c0411a.m3342a(c0420d.f2633b, false, z5) + str;
                    if (c0411a.f2585l != null && c0411a.f2586m) {
                        c0732u.m1765a(str2, c0411a.f2585l.intValue());
                    } else {
                        c0732u.m1760b(str2);
                    }
                    i3++;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3300a(OutputNetStream outputNetStream) {
        if (this.f2635b.size == 0) {
            outputNetStream.writeByte(-1);
            return;
        }
        outputNetStream.writeByte(0);
        outputNetStream.mo1257a((short) this.f2635b.size);
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            outputNetStream.writeString(c0420d.f2632a.f2575b);
            outputNetStream.writeDouble(c0420d.f2633b);
        }
    }

    /* renamed from: a */
    public void m3299a(InputNetStream inputNetStream) {
        if (this.f2636c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (inputNetStream.readByte() == -1) {
            return;
        }
        int m1212v = inputNetStream.m1212v();
        this.f2635b.clear();
        for (int i = 0; i < m1212v; i++) {
            C0411a m3337b = C0411a.m3337b(inputNetStream.readString());
            double readDouble = inputNetStream.readDouble();
            if (m3337b != null && readDouble != 0.0d) {
                this.f2635b.add(new C0420d(m3337b, readDouble));
            }
        }
    }

    /* renamed from: d */
    public int m3281d() {
        int i = 0;
        int i2 = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0420d) items[i3]).f2633b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public boolean m3276e(C0421e c0421e) {
        if (m3281d() != c0421e.m3281d()) {
            return false;
        }
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (!CommonUtils.m1696b(c0420d.f2633b, c0421e.m3310a(c0420d.f2632a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m3275f(C0421e c0421e) {
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2633b > 0.0d && c0421e.m3295b(c0420d.f2632a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0421e m3313a(Unit unit) {
        double d;
        C0421e c0421e = new C0421e();
        int i = this.f2635b.size;
        Object[] items = this.f2635b.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            C0420d c0420d = (C0420d) items[i2];
            if (c0420d.f2632a.f2590q) {
                d = unit.team.m3923c(c0420d.f2632a);
            } else {
                d = unit.m3774a(c0420d.f2632a);
            }
            if (d < c0420d.f2633b) {
                c0421e.m3294b(c0420d.f2632a, c0420d.f2633b - d);
            }
        }
        if (c0421e.m3287c()) {
            return f2634a;
        }
        return c0421e;
    }

    /* renamed from: g */
    public void m3274g(C0421e c0421e) {
        m3297b();
        m3293b(c0421e);
    }

    /* renamed from: c */
    public void m3286c(C0411a c0411a) {
        ObjectVector objectVector = this.f2635b;
        int i = objectVector.size;
        Object[] items = objectVector.getItems();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0420d) items[i2]).f2632a == c0411a) {
                return;
            }
        }
        C0420d c0420d = new C0420d(c0411a);
        c0420d.f2633b = 0.0d;
        objectVector.add(c0420d);
    }

    /* renamed from: e */
    public void m3277e() {
        Collections.sort(this.f2635b, new Comparator() { // from class: com.corrodinggames.rts.game.units.custom.e.e.1
            /* renamed from: a */
            public int compare(C0420d c0420d, C0420d c0420d2) {
                if (c0420d.f2632a == null || c0420d2.f2632a == null) {
                    return 0;
                }
                return Float.compare(c0420d.f2632a.f2594u, c0420d2.f2632a.f2594u);
            }
        });
    }
}