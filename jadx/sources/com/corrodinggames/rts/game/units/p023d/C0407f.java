package com.corrodinggames.rts.game.units.p023d;

import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0155g;
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
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class C0407f extends AbstractC0413h {

    /* renamed from: a */
    float f2990a;

    /* renamed from: b */
    int f2991b = 1;

    /* renamed from: c */
    float f2992c = 0.0f;

    /* renamed from: d */
    int f2993d = 0;

    /* renamed from: j */
    Rect f2999j = new Rect();

    /* renamed from: k */
    Rect f3000k = new Rect();

    /* renamed from: e */
    static C0748e[] f2994e = new C0748e[10];

    /* renamed from: f */
    static C0748e[] f2995f = new C0748e[10];

    /* renamed from: g */
    static C0748e[] f2996g = new C0748e[10];

    /* renamed from: h */
    static C0748e f2997h = null;

    /* renamed from: i */
    static C0748e f2998i = null;

    /* renamed from: l */
    public static int f3001l = 0;

    /* renamed from: t */
    static AbstractC0197s f3002t = new AbstractC0201w(102) { // from class: com.corrodinggames.rts.game.units.d.f.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.extractor.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.extractor.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 6.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0407f fVar = (C0407f) afVar;
            if (fVar.f2991b != 1 || fVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
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

    /* renamed from: u */
    static AbstractC0197s f3003u = new AbstractC0201w(103) { // from class: com.corrodinggames.rts.game.units.d.f.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.upgradeT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.extractor.mo3264c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0407f fVar = (C0407f) afVar;
            if (fVar.f2991b != 2 || fVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
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

    /* renamed from: v */
    static ArrayList f3004v = new ArrayList();

    /* renamed from: w */
    static ArrayList f3005w = new ArrayList();

    /* renamed from: x */
    static ArrayList f3006x = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f2990a);
        apVar.mo1090a(this.f2991b > 1);
        apVar.mo1095a(this.f2991b);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f2990a = kVar.m1061g();
        int i = 1;
        if (kVar.m1063e()) {
            i = 2;
        }
        if (kVar.m1071b() >= 31) {
            i = kVar.m1062f();
        }
        if (i != 1) {
            mo2310a(i);
        }
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.extractor;
    }

    static {
        f3004v.add(f3002t);
        f3005w.add(f3003u);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bn */
    public boolean mo2198bn() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5511bt.m3703a(this.f5842dH, this.f5843dI);
        C0155g e = u.f5511bt.m3651e(u.f5511bt.f764M, u.f5511bt.f765N);
        if (e == null || !e.f857i) {
            return false;
        }
        return super.mo2198bn();
    }

    /* renamed from: c */
    public static void m2630c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.extractor);
        C0748e a2 = u.f5514bw.mo194a(C0063R.drawable.extractor_t2);
        C0748e a3 = u.f5514bw.mo194a(C0063R.drawable.extractor_t3);
        f2998i = u.f5514bw.mo194a(C0063R.drawable.extractor_dead);
        f2994e = AbstractC0171m.m3501a(a);
        f2995f = AbstractC0171m.m3501a(a2);
        f2996g = AbstractC0171m.m3501a(a3);
        a.mo49m();
        a2.mo49m();
        a3.mo49m();
        f2997h = u.f5514bw.mo194a(C0063R.drawable.extractor_back);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2015a(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f2998i;
        this.f2964m = null;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        C0574f.m1973a(this.f5842dH, this.f5843dI).f3911j = -6684775;
        C0574f b = C0574f.m1969b(this.f5842dH, this.f5843dI);
        b.f3902a = 500.0f;
        b.f3911j = -6684775;
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e c = u.f5517bz.m1985c(this.f5842dH, this.f5843dI, this.f5844dJ, -1127220);
        if (c != null) {
            c.f3860H = 0.15f;
            c.f3859G = 1.0f;
            c.f3895aq = (short) 2;
            c.f3875W = 35.0f;
            c.f3876X = c.f3875W;
            c.f3874V = 0.0f;
            c.f3851y = -13378253;
        }
        m2202bj();
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bk */
    public int mo2201bk() {
        return 16;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: Q */
    public void mo2332Q() {
        super.mo2332Q();
        if (this.f1459bz) {
            this.f2964m = null;
        } else {
            this.f2964m = f2997h;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: cY */
    public boolean mo2629cY() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f2998i;
        }
        if (this.f1461bB == null) {
            return f2994e[f2994e.length - 1];
        }
        if (this.f2991b == 3) {
            return f2996g[this.f1461bB.m3518M()];
        }
        if (this.f2991b == 2) {
            return f2995f[this.f1461bB.m3518M()];
        }
        return f2994e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0407f(boolean z) {
        super(z);
        this.f3387D = f2994e[9];
        m2038S(37);
        m2037T(56);
        this.f1474bO = 18.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 800.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(0, -1, 0, 0);
        this.f2966o.m4135a(this.f2965n);
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f2992c = C0654f.m1522a(this.f2992c, f * this.f2991b);
            if (this.f2992c == 0.0f) {
                this.f2992c = 17.0f;
                this.f2993d++;
                if (this.f2993d > 7) {
                    this.f2993d = 0;
                }
                if (this.f2993d <= 3) {
                    this.f2970s = this.f2993d;
                } else {
                    this.f2970s = 7 - this.f2993d;
                }
            }
            this.f2990a += f;
            if (this.f2990a > 39.9f) {
                this.f2990a -= 40.0f;
                this.f1461bB.m3452f((int) mo2623ci());
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ci */
    public float mo2623ci() {
        if (this.f2991b == 3) {
            return 18.0f;
        }
        if (this.f2991b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3002t.m3387J())) {
            mo2310a(2);
            m2328U();
        }
        if (iVar.f3031h.equals(f3003u.m3387J())) {
            mo2310a(3);
            m2328U();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f2991b == 1) {
            return f3002t.m3387J();
        }
        if (this.f2991b == 2) {
            return f3003u.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        return this.f2991b;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        AbstractC0171m.m3488b((AbstractC0210af) this);
        if (this.f2991b > i) {
            this.f2991b = 1;
            this.f1485bZ = 800.0f;
            if (this.f1484bY > this.f1485bZ) {
                this.f1484bY = this.f1485bZ;
            }
        }
        if (this.f2991b < 2 && i >= 2) {
            this.f1485bZ += 200.0f;
            this.f1484bY += 200.0f;
        }
        if (this.f2991b < 3 && i >= 3) {
            this.f1485bZ += 1000.0f;
            this.f1484bY += 1000.0f;
        }
        this.f2991b = i;
        AbstractC0171m.m3473c(this);
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        if (this.f2991b == 1) {
            return f3004v;
        }
        if (this.f2991b == 2) {
            return f3005w;
        }
        return f3006x;
    }
}
