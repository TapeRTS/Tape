package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p020d.p021a.C0347b;
import com.corrodinggames.rts.game.units.custom.p020d.p021a.C0348c;
import com.corrodinggames.rts.game.units.custom.p020d.p021a.C0349d;
import com.corrodinggames.rts.game.units.custom.p020d.p021a.C0350e;
import com.corrodinggames.rts.game.units.custom.p020d.p021a.C0351f;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a.class */
public class C0345a {

    /* renamed from: a */
    protected String f2344a;

    /* renamed from: b */
    protected C0311ag f2345b;

    /* renamed from: c */
    protected C0311ag f2346c;

    /* renamed from: d */
    Integer f2347d;

    /* renamed from: e */
    public boolean f2348e;

    /* renamed from: f */
    boolean f2349f;

    /* renamed from: g */
    protected boolean f2350g;

    /* renamed from: h */
    protected boolean f2351h;

    /* renamed from: i */
    C0345a f2352i;

    /* renamed from: j */
    static ArrayList f2353j = new ArrayList();

    /* renamed from: k */
    public static ArrayList f2354k = new ArrayList();

    /* renamed from: l */
    public static final C0345a f2355l = m3018a(new C0348c());

    /* renamed from: m */
    public static final C0345a f2356m = m3018a(new C0349d());

    /* renamed from: n */
    public static final C0345a f2357n = m3018a(new C0347b());

    /* renamed from: p */
    public static final C0345a f2359p = m3018a(new C0351f());

    /* renamed from: o */
    public static final C0345a f2358o = m3018a(new C0350e());

    /* renamed from: a */
    public boolean m3020a() {
        return this.f2349f;
    }

    /* renamed from: b */
    public boolean m3015b() {
        return this.f2351h;
    }

    /* renamed from: c */
    public boolean m3013c() {
        return this.f2350g;
    }

    /* renamed from: d */
    public static void m3012d() {
        Iterator it = f2353j.iterator();
        while (it.hasNext()) {
            ((C0345a) it.next()).m3011e();
        }
    }

    /* renamed from: e */
    public void m3011e() {
        if (!this.f2351h) {
            C0352b bVar = null;
            Iterator it = C0368l.f2486d.iterator();
            while (it.hasNext()) {
                C0352b a = ((C0368l) it.next()).m2793a(this);
                if (a != null && (bVar == null || bVar.f2362c < a.f2362c)) {
                    bVar = a;
                }
            }
            if (bVar != null) {
                this.f2345b = bVar.f2365f;
                this.f2346c = bVar.f2366g;
                this.f2347d = bVar.f2363d;
                this.f2348e = bVar.f2369j;
                this.f2349f = bVar.f2367h;
                this.f2352i = bVar.f2373n;
            }
        }
    }

    /* renamed from: f */
    public Integer m3010f() {
        return this.f2347d;
    }

    /* renamed from: g */
    public String m3009g() {
        if (this.f2345b == null) {
            return this.f2344a;
        }
        return this.f2345b.m3100b();
    }

    /* renamed from: h */
    public String m3008h() {
        if (this.f2346c != null) {
            return this.f2346c.m3100b();
        }
        return m3009g();
    }

    protected C0345a() {
    }

    /* renamed from: a */
    public static C0345a m3017a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator it = f2354k.iterator();
        while (it.hasNext()) {
            C0345a aVar = (C0345a) it.next();
            if (aVar.f2344a.equalsIgnoreCase(lowerCase)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0345a m3018a(C0345a aVar) {
        Iterator it = f2353j.iterator();
        while (it.hasNext()) {
            if (((C0345a) it.next()).f2344a.equals(aVar.f2344a)) {
                throw new RuntimeException("Built in resource already exists:" + aVar.f2344a);
            }
        }
        f2353j.add(aVar);
        f2354k.add(aVar);
        return aVar;
    }

    /* renamed from: a */
    public static C0345a m3016a(String str, boolean z, boolean z2) {
        Iterator it = f2353j.iterator();
        while (it.hasNext()) {
            C0345a aVar = (C0345a) it.next();
            if (aVar.f2344a.equals(str)) {
                return aVar;
            }
        }
        C0345a aVar2 = new C0345a();
        aVar2.f2344a = str;
        aVar2.f2351h = z;
        aVar2.f2350g = z2;
        f2353j.add(aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public static C0345a m3014b(String str) {
        Iterator it = f2353j.iterator();
        while (it.hasNext()) {
            C0345a aVar = (C0345a) it.next();
            if (aVar.f2344a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m3019a(double d, boolean z) {
        String str = m3008h() + ": ";
        if (this == f2355l) {
            str = "$";
        }
        if (z) {
            if (d > 0.0d) {
                return "+" + str + C0654f.m1524a(d, 1);
            }
            return "-" + str + C0654f.m1524a(-d, 1);
        } else if (d > 0.0d) {
            return str + C0654f.m1524a(d, 1);
        } else {
            return str + C0654f.m1524a(d, 1);
        }
    }

    public String toString() {
        return "resource(" + this.f2344a + ")";
    }

    /* renamed from: a */
    public double mo3007a(AbstractC0210af afVar) {
        if (this.f2350g) {
            return afVar.f1461bB.m3487b(this);
        }
        return afVar.m3332a(this);
    }

    /* renamed from: a */
    public void mo3006a(AbstractC0210af afVar, double d) {
        if (this.f2350g) {
            afVar.f1461bB.m3515P().m2998a(this, d);
        } else {
            afVar.mo1608cN().m2998a(this, d);
        }
    }

    /* renamed from: b */
    public void mo3005b(AbstractC0210af afVar, double d) {
        if (this.f2350g) {
            afVar.f1461bB.m3515P().m2985b(this, d);
        } else {
            afVar.mo1608cN().m2985b(this, d);
        }
    }
}
