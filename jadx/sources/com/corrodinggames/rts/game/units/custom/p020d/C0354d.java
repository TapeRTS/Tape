package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/d.class */
public final class C0354d {

    /* renamed from: a */
    public static final C0354d f2376a = new C0354d().m3002a();

    /* renamed from: b */
    public final C0835m f2377b = new C0835m();

    /* renamed from: c */
    boolean f2378c;

    /* renamed from: a */
    public C0354d m3002a() {
        this.f2378c = true;
        return this;
    }

    /* renamed from: b */
    public boolean m2987b() {
        if (this.f2377b.f5778a == 0) {
            return true;
        }
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0353c) a[i2]).f2375b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public double m2999a(C0345a aVar) {
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a == aVar) {
                return cVar.f2375b;
            }
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double m2986b(C0345a aVar) {
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0353c cVar = (C0353c) a[i3];
            if (cVar.f2374a == aVar) {
                i2 = (int) (i2 + cVar.f2375b);
            }
            if (cVar.f2374a.f2352i == aVar) {
                i2 = (int) (i2 + cVar.f2375b);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m2998a(C0345a aVar, double d) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a == aVar) {
                cVar.f2375b = d;
                return;
            }
        }
        C0353c cVar2 = new C0353c(aVar);
        cVar2.f2375b = d;
        this.f2377b.add(cVar2);
    }

    /* renamed from: a */
    public void m3001a(double d) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            ((C0353c) a[i2]).f2375b *= d;
        }
    }

    /* renamed from: b */
    public void m2985b(C0345a aVar, double d) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        } else if (d != 0.0d) {
            C0835m mVar = this.f2377b;
            int i = mVar.f5778a;
            Object[] a = mVar.m490a();
            for (int i2 = 0; i2 < i; i2++) {
                C0353c cVar = (C0353c) a[i2];
                if (cVar.f2374a == aVar) {
                    cVar.f2375b += d;
                    return;
                }
            }
            C0353c cVar2 = new C0353c(aVar);
            cVar2.f2375b = d;
            mVar.add(cVar2);
        }
    }

    /* renamed from: c */
    public void m2979c(C0345a aVar, double d) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        } else if (d != 0.0d) {
            C0835m mVar = this.f2377b;
            int i = mVar.f5778a;
            Object[] a = mVar.m490a();
            for (int i2 = 0; i2 < i; i2++) {
                C0353c cVar = (C0353c) a[i2];
                if (cVar.f2374a == aVar) {
                    cVar.f2375b += d;
                    return;
                }
            }
            C0353c cVar2 = new C0353c(aVar);
            cVar2.f2375b = d;
            mVar.add(cVar2);
        }
    }

    /* renamed from: d */
    public void m2976d(C0345a aVar, double d) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        m2985b(aVar, -d);
    }

    /* renamed from: a */
    public void m2991a(C0363g gVar) {
        m2979c(C0345a.f2355l, gVar.f2423b);
        m2997a(gVar.f2432k);
    }

    /* renamed from: a */
    public void m2997a(C0354d dVar) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            m2985b(cVar.f2374a, cVar.f2375b);
        }
    }

    /* renamed from: a */
    public void m2996a(C0354d dVar, float f) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            m2985b(cVar.f2374a, cVar.f2375b * f);
        }
    }

    /* renamed from: b */
    public void m2984b(C0354d dVar) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            m2976d(cVar.f2374a, cVar.f2375b);
        }
    }

    /* renamed from: a */
    public static C0354d m2992a(C0354d dVar, C0354d dVar2) {
        C0354d dVar3 = new C0354d();
        dVar3.m2997a(dVar);
        dVar3.m2997a(dVar2);
        return dVar3;
    }

    /* renamed from: b */
    public static C0354d m2981b(C0354d dVar, C0354d dVar2) {
        C0354d dVar3 = new C0354d();
        dVar3.m2997a(dVar);
        dVar3.m2984b(dVar2);
        return dVar3;
    }

    /* renamed from: b */
    public static C0354d m2983b(C0354d dVar, float f) {
        C0354d dVar2 = new C0354d();
        dVar2.m2996a(dVar, f);
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [double] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2995a(C0354d dVar, AbstractC0210af afVar) {
        ?? r12;
        int i = 9999;
        int i2 = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0353c cVar = (C0353c) a[i3];
            if (cVar.f2375b > 0.0d) {
                if (cVar.f2374a.f2350g) {
                    r12 = afVar.f1461bB.m3487b(cVar.f2374a);
                } else {
                    r12 = afVar.m3332a(cVar.f2374a);
                }
                i = C0654f.m1454c(i, (int) ((r12 == true ? 1.0d : 0.0d) / cVar.f2375b));
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [double] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2982b(C0354d dVar, AbstractC0210af afVar) {
        ?? r11;
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a.f2350g) {
                r11 = afVar.f1461bB.m3487b(cVar.f2374a);
            } else {
                r11 = afVar.m3332a(cVar.f2374a);
            }
            if (cVar.f2375b > (r11 == true ? 1.0d : 0.0d)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m2977c(C0354d dVar, AbstractC0210af afVar) {
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a.f2350g) {
                afVar.f1461bB.m3515P().m2976d(cVar.f2374a, cVar.f2375b);
            } else {
                afVar.mo1608cN().m2976d(cVar.f2374a, cVar.f2375b);
            }
        }
    }

    /* renamed from: d */
    public static void m2974d(C0354d dVar, AbstractC0210af afVar) {
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a.f2350g) {
                afVar.f1461bB.m3515P().m2985b(cVar.f2374a, cVar.f2375b);
            } else {
                afVar.mo1608cN().m2985b(cVar.f2374a, cVar.f2375b);
            }
        }
    }

    /* renamed from: a */
    public static void m2994a(C0354d dVar, AbstractC0210af afVar, float f) {
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a.f2350g) {
                afVar.f1461bB.m3515P().m2985b(cVar.f2374a, cVar.f2375b * f);
            } else {
                afVar.mo1608cN().m2985b(cVar.f2374a, cVar.f2375b * f);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2993a(C0354d dVar, AbstractC0210af afVar, AbstractC0210af afVar2) {
        boolean z = false;
        int i = dVar.f2377b.f5778a;
        Object[] a = dVar.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            C0345a aVar = cVar.f2374a;
            double d = cVar.f2375b;
            if (d != 0.0d) {
                double a2 = aVar.mo3007a(afVar);
                double a3 = aVar.mo3007a(afVar2);
                if (d >= 0.0d) {
                    if (a2 > 0.0d) {
                        double a4 = C0654f.m1525a(a2, d);
                        aVar.mo3005b(afVar, -a4);
                        aVar.mo3005b(afVar2, a4);
                        z = true;
                    }
                } else if (a3 > 0.0d) {
                    double a5 = C0654f.m1525a(a3, -d);
                    aVar.mo3005b(afVar2, -a5);
                    aVar.mo3005b(afVar, a5);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public String m2988a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        String str;
        C0353c cVar;
        int i2 = this.f2377b.f5778a;
        if (i2 == 0) {
            return "";
        }
        String str2 = "";
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        Object[] a = this.f2377b.m490a();
        for (int i4 = 0; i4 < i2; i4++) {
            if ((((C0353c) a[i4]).f2375b > 0.0d || z4) && i3 < i) {
                str2 = str2 + cVar.f2374a.m3019a(cVar.f2375b, false) + str;
                i3++;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public void m2990a(C0690ap apVar) {
        if (this.f2377b.f5778a == 0) {
            apVar.mo1130c(-1);
            return;
        }
        apVar.mo1130c(0);
        apVar.mo1091a((short) this.f2377b.f5778a);
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            apVar.mo1129c(cVar.f2374a.f2344a);
            apVar.m1159a(cVar.f2375b);
        }
    }

    /* renamed from: a */
    public void m2989a(C0707k kVar) {
        if (this.f2378c) {
            throw new RuntimeException("StoredResources are locked");
        } else if (kVar.m1065d() != -1) {
            short t = kVar.m1048t();
            this.f2377b.clear();
            for (int i = 0; i < t; i++) {
                C0345a b = C0345a.m3014b(kVar.m1057k());
                double h = kVar.m1060h();
                if (!(b == null || h == 0.0d)) {
                    this.f2377b.add(new C0353c(b, h));
                }
            }
        }
    }

    /* renamed from: c */
    public int m2980c() {
        int i = 0;
        int i2 = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0353c) a[i3]).f2375b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m2978c(C0354d dVar) {
        if (m2980c() != dVar.m2980c()) {
            return false;
        }
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (!C0654f.m1478b(cVar.f2375b, dVar.m2999a(cVar.f2374a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public boolean m2975d(C0354d dVar) {
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2375b > 0.0d && dVar.m2986b(cVar.f2374a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [double] */
    /* JADX WARN: Type inference failed for: r12v0, types: [double] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0354d m3000a(AbstractC0210af afVar) {
        ?? r12;
        C0354d dVar = new C0354d();
        int i = this.f2377b.f5778a;
        Object[] a = this.f2377b.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0353c cVar = (C0353c) a[i2];
            if (cVar.f2374a.f2350g) {
                r12 = afVar.f1461bB.m3487b(cVar.f2374a);
            } else {
                r12 = afVar.m3332a(cVar.f2374a);
            }
            if ((r12 == true ? 1.0d : 0.0d) < cVar.f2375b) {
                dVar.m2985b(cVar.f2374a, cVar.f2375b - r12);
            }
        }
        if (dVar.m2987b()) {
            return f2376a;
        }
        return dVar;
    }
}
