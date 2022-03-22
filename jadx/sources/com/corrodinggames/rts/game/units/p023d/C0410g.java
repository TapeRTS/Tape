package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class C0410g extends AbstractC0413h {

    /* renamed from: h */
    float f3014h;

    /* renamed from: i */
    float f3015i = 0.0f;

    /* renamed from: j */
    int f3016j = 0;

    /* renamed from: a */
    static C0748e f3007a = null;

    /* renamed from: b */
    static C0748e f3008b = null;

    /* renamed from: c */
    static C0748e f3009c = null;

    /* renamed from: d */
    static C0748e[] f3010d = new C0748e[10];

    /* renamed from: e */
    static C0748e[] f3011e = new C0748e[10];

    /* renamed from: f */
    static C0748e[] f3012f = new C0748e[10];

    /* renamed from: g */
    static C0748e f3013g = null;

    /* renamed from: k */
    static AbstractC0197s f3017k = new AbstractC0201w(102) { // from class: com.corrodinggames.rts.game.units.d.g.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.fabricator.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("units.fabricator.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.fabricator.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0410g gVar = (C0410g) afVar;
            if (gVar.f2969r != 1 || gVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            if (((C0410g) afVar).f2969r != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.upgrade;
        }
    };

    /* renamed from: l */
    static AbstractC0197s f3018l = new AbstractC0201w(103) { // from class: com.corrodinggames.rts.game.units.d.g.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.fabricator.mo3264c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0410g gVar = (C0410g) afVar;
            if (gVar.f2969r != 2 || gVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            if (((C0410g) afVar).f2969r != 2) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.upgrade;
        }
    };

    /* renamed from: t */
    static ArrayList f3019t = new ArrayList();

    static {
        f3019t.add(f3017k);
        f3019t.add(f3018l);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f3014h);
        apVar.mo1090a(this.f2969r == 2);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3014h = kVar.m1061g();
        boolean e = kVar.m1063e();
        if (kVar.m1071b() < 51 && e) {
            mo2310a(2);
        }
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: Q */
    public void mo2626Q(int i) {
        mo2310a(i);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.fabricator;
    }

    /* renamed from: c */
    public static void m2624c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3007a = u.f5514bw.mo194a(C0063R.drawable.power);
        f3008b = u.f5514bw.mo194a(C0063R.drawable.power_t2);
        f3009c = u.f5514bw.mo194a(C0063R.drawable.power_t3);
        f3010d = AbstractC0171m.m3501a(f3007a);
        f3011e = AbstractC0171m.m3501a(f3008b);
        f3012f = AbstractC0171m.m3501a(f3009c);
        f3013g = u.f5514bw.mo194a(C0063R.drawable.power_dead);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2015a(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3013g;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e c = u.f5517bz.m1985c(this.f5842dH, this.f5843dI, this.f5844dJ, -1127220);
        if (c != null) {
            c.f3860H = 0.15f;
            c.f3859G = 1.0f;
            c.f3895aq = (short) 2;
            c.f3875W = 35.0f;
            c.f3876X = c.f3875W;
            c.f3874V = 0.0f;
            c.f3851y = -14492382;
        }
        m2202bj();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3013g;
        }
        if (this.f1461bB == null) {
            return f3010d[f3010d.length - 1];
        }
        if (this.f2969r == 1) {
            return f3010d[this.f1461bB.m3518M()];
        }
        if (this.f2969r == 2) {
            return f3011e[this.f1461bB.m3518M()];
        }
        if (this.f2969r == 3) {
            return f3012f[this.f1461bB.m3518M()];
        }
        AbstractC0789l.m670d("Unknown tech level:" + this.f2969r);
        return f3010d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0410g(boolean z) {
        super(z);
        this.f3387D = f3007a;
        m2036a(this.f3387D, 3);
        this.f1474bO = 25.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 800.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4135a(this.f2965n);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f3015i = C0654f.m1522a(this.f3015i, f);
            if (this.f3015i == 0.0f) {
                this.f3015i = 17.0f;
                this.f3016j++;
                if (this.f3016j > 5) {
                    this.f3016j = 0;
                }
                if (this.f3016j <= 2) {
                    this.f2970s = this.f3016j;
                } else {
                    this.f2970s = 5 - this.f3016j;
                }
            }
            this.f3014h += f;
            if (this.f3014h > 39.9f) {
                this.f3014h -= 40.0f;
                this.f1461bB.m3452f((int) mo2623ci());
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ci */
    public float mo2623ci() {
        if (this.f2969r == 1) {
            return 2.0f;
        }
        if (this.f2969r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3017k.m3387J())) {
            mo2310a(2);
            m2328U();
        }
        if (iVar.f3031h.equals(f3018l.m3387J())) {
            mo2310a(3);
            m2328U();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f2969r == 1) {
            return f3017k.m3387J();
        }
        if (this.f2969r == 2) {
            return f3018l.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        return this.f2969r;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        AbstractC0171m.m3488b((AbstractC0210af) this);
        if (this.f2969r > i) {
            this.f2969r = 1;
            this.f1485bZ = 800.0f;
            if (this.f1484bY > this.f1485bZ) {
                this.f1484bY = this.f1485bZ;
            }
        }
        if (this.f2969r < 2 && i >= 2) {
            this.f1485bZ += 500.0f;
            this.f1484bY += 500.0f;
        }
        if (this.f2969r < 3 && i >= 3) {
            this.f1485bZ += 1300.0f;
            this.f1484bY += 1300.0f;
        }
        this.f2969r = i;
        AbstractC0171m.m3473c(this);
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3019t;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cJ */
    public float mo2570cJ() {
        return super.mo2570cJ() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bk */
    public int mo2201bk() {
        return 12;
    }
}
