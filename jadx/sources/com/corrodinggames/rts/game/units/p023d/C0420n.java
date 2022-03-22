package com.corrodinggames.rts.game.units.p023d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/n.class */
public class C0420n extends AbstractC0413h {

    /* renamed from: d */
    boolean f3052d;

    /* renamed from: e */
    boolean f3053e;

    /* renamed from: f */
    float f3054f;

    /* renamed from: i */
    PointF f3057i = new PointF();

    /* renamed from: j */
    Rect f3058j = new Rect();

    /* renamed from: a */
    static C0748e[] f3049a = new C0748e[10];

    /* renamed from: b */
    static C0748e[] f3050b = new C0748e[10];

    /* renamed from: c */
    static C0748e f3051c = null;

    /* renamed from: g */
    static C0748e f3055g = null;

    /* renamed from: h */
    static C0748e[] f3056h = new C0748e[10];

    /* renamed from: k */
    static AbstractC0197s f3059k = new AbstractC0201w(102) { // from class: com.corrodinggames.rts.game.units.d.n.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.laserDefence.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0420n nVar = (C0420n) afVar;
            if (nVar.f3052d || nVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            if (((C0420n) afVar).f3052d) {
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
    static ArrayList f3060l = new ArrayList();

    static {
        f3060l.add(f3059k);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f3052d);
        apVar.mo1096a(this.f1491cf);
        apVar.mo1090a(this.f3053e);
        apVar.mo1096a(this.f3054f);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3052d = kVar.m1063e();
        this.f1491cf = kVar.m1061g();
        this.f3053e = kVar.m1063e();
        if (kVar.m1071b() >= 38) {
            this.f3054f = kVar.m1061g();
        }
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3056h[this.f1461bB.m3518M()];
    }

    /* renamed from: b */
    public static void m2574b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3051c = u.f5514bw.mo194a(C0063R.drawable.laser_defence_dead);
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.laser_defence);
        C0748e a2 = u.f5514bw.mo194a(C0063R.drawable.laser_defence_t2);
        f3049a = AbstractC0171m.m3501a(a);
        f3050b = AbstractC0171m.m3501a(a2);
        a.mo49m();
        a2.mo49m();
        f3055g = u.f5514bw.mo194a(C0063R.drawable.unit_icon_building_turrent);
        f3056h = AbstractC0171m.m3501a(f3055g);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2015a(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3051c;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3051c;
        }
        if (this.f1461bB == null) {
            return f3049a[f3049a.length - 1];
        }
        if (!this.f3052d) {
            return f3049a[this.f1461bB.m3518M()];
        }
        return f3050b[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0420n(boolean z) {
        super(z);
        m2036a(f3049a[0], 2);
        this.f1491cf = 1.0f;
        this.f1474bO = 19.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 500.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3049a[f3049a.length - 1];
        this.f2965n.m4136a(0, 0, 1, 1);
        this.f2966o.m4136a(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        float f2;
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            AbstractC0789l.m638u();
            float f3 = 4.0E-4f * f;
            if (this.f3052d) {
                f3 += 2.0E-4f * f;
            }
            this.f1491cf = C0654f.m1521a(this.f1491cf, 1.0f, f3);
            if (this.f1491cf >= 1.0f) {
                this.f3053e = false;
            }
            this.f3054f -= f;
            this.f3057i.m4140a(mo2345E(0));
            if (this.f1491cf > 0.0f && !this.f3053e) {
                if (!this.f3052d) {
                    f2 = 0.11f;
                } else {
                    f2 = 0.05f;
                }
                if (m2575a(this, this.f3057i.f224a, this.f3057i.f225b, this.f5844dJ, mo2152m(), f2)) {
                    this.f3054f = 3.0f;
                }
                if (this.f1491cf < 0.0f) {
                    this.f1491cf = 0.0f;
                    this.f3053e = true;
                }
            }
            if (this.f3053e) {
                this.f2970s = 1;
            } else {
                this.f2970s = 0;
            }
        }
    }

    /* renamed from: a */
    public static boolean m2575a(AbstractC0515r rVar, float f, float f2, float f3, float f4, float f5) {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f6 = f4 * f4;
        Object[] a = C0163f.f915a.m490a();
        int i = C0163f.f915a.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            C0163f fVar = (C0163f) a[i2];
            if (!fVar.f942A && !fVar.f944C && ((fVar.f951J > 7.0f || (fVar.f951J > 2.0f && fVar.f935t > 8.0f)) && !fVar.f1013aS && ((fVar.f5842dH - f) * (fVar.f5842dH - f)) + ((fVar.f5843dI - f2) * (fVar.f5843dI - f2)) < f6 && fVar.f5844dJ >= -1.0f)) {
                boolean z = false;
                if (fVar.f927l != null && rVar.f1461bB.m3464d(fVar.f927l.f1461bB)) {
                    z = true;
                }
                if (!z && fVar.f925j != null && rVar.f1461bB.m3474c(fVar.f925j.f1461bB)) {
                    z = true;
                }
                if (z) {
                    C0573e a2 = u.f5517bz.m2012a(f, f2, f3, fVar.f5842dH, fVar.f5843dI, fVar.f5844dJ);
                    if (a2 != null) {
                        a2.f3875W = 10.0f;
                        a2.f3876X = a2.f3875W;
                    }
                    C0573e b = u.f5517bz.m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
                    if (b != null) {
                        b.f3869Q = 0.0f;
                        b.f3870R = 0.0f;
                        b.f3893ao = 4;
                        b.f3875W = 39.0f;
                        b.f3876X = b.f3875W;
                        b.f3845s = true;
                        b.f3858F = 1.3f;
                        b.f3860H = 1.1f;
                        b.f3859G = 0.7f;
                    }
                    fVar.f949H -= 1.01f;
                    if (fVar.f949H <= 0.0f) {
                        fVar.m3567d();
                        C0573e b2 = u.f5517bz.m1989b(fVar.f5842dH, fVar.f5843dI, fVar.f5844dJ, EnumC0572d.custom, false, EnumC0576h.high);
                        if (b2 != null) {
                            b2.f3869Q = 0.0f;
                            b2.f3870R = 0.0f;
                            b2.f3893ao = 4;
                            b2.f3875W = 23.0f;
                            b2.f3876X = b2.f3875W;
                            b2.f3845s = true;
                            b2.f3858F = 0.9f;
                            b2.f3860H = 0.5f;
                            b2.f3859G = 0.2f;
                        }
                        u.f5512bu.m2114a(C0530e.f3593E, 0.2f, 1.0f + C0654f.m1458c(-0.07f, 0.07f), fVar.f5842dH, fVar.f5843dI);
                    }
                    rVar.f1491cf -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        f3485aT.m4141a(this.f5842dH, this.f5843dI - 13.0f);
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        if (!this.f3052d) {
            return 160.0f;
        }
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public boolean mo2221b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.laserDefence;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bI */
    public float mo2486bI() {
        if (this.f1491cf != 1.0f) {
            return this.f1491cf;
        }
        return super.mo2486bI();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bJ */
    public boolean mo2485bJ() {
        return this.f3053e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: aY */
    public float mo2255aY() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3059k.m3387J())) {
            mo2310a(2);
            m2328U();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (!this.f3052d) {
            return f3059k.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        if (this.f3052d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        if (i == 1) {
            this.f3052d = false;
        } else if (i == 2 && !this.f3052d) {
            this.f3052d = true;
            this.f1485bZ += 900.0f;
            this.f1484bY += 900.0f;
        }
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3060l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cH */
    public float mo2572cH() {
        return AbstractC0789l.m638u().f5511bt.f735k;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cI */
    public float mo2571cI() {
        return AbstractC0789l.m638u().f5511bt.f736l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cJ */
    public float mo2570cJ() {
        return super.mo2570cJ() - 8.0f;
    }
}
