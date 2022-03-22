package com.corrodinggames.rts.game.units.p023d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/b.class */
public class C0400b extends AbstractC0413h {

    /* renamed from: c */
    boolean f2954c;

    /* renamed from: d */
    int f2955d;

    /* renamed from: e */
    float f2956e;

    /* renamed from: h */
    PointF f2959h = new PointF();

    /* renamed from: i */
    Rect f2960i = new Rect();

    /* renamed from: a */
    static C0748e[] f2952a = new C0748e[10];

    /* renamed from: b */
    static C0748e f2953b = null;

    /* renamed from: f */
    static C0748e f2957f = null;

    /* renamed from: g */
    static C0748e[] f2958g = new C0748e[10];

    /* renamed from: j */
    static AbstractC0197s f2961j = new AbstractC0197s(145) { // from class: com.corrodinggames.rts.game.units.d.b.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.antiNukeCount", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            if (mo2416b(afVar, false) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2377e() {
            return EnumC0199u.none;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.none;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2416b(AbstractC0210af afVar, boolean z) {
            return ((C0400b) afVar).f2955d;
        }
    };

    /* renamed from: k */
    static AbstractC0197s f2962k = new AbstractC0201w(144) { // from class: com.corrodinggames.rts.game.units.d.b.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.buildAntiNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 4000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0400b bVar = (C0400b) afVar;
            if (bVar.f2955d + bVar.mo2589a(m3387J(), z) >= 12.0f) {
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
            return EnumC0198t.queueUnit;
        }
    };

    /* renamed from: l */
    static ArrayList f2963l = new ArrayList();

    static {
        f2963l.add(f2961j);
        f2963l.add(f2962k);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f2954c);
        apVar.mo1095a(this.f2955d);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f2954c = kVar.m1063e();
        if (kVar.m1071b() >= 30) {
            this.f2955d = kVar.m1062f();
        }
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f2958g[this.f1461bB.m3518M()];
    }

    /* renamed from: b */
    public static void m2657b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2953b = u.f5514bw.mo194a(C0063R.drawable.antinuke_launcher_dead);
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.antinuke_launcher);
        f2952a = AbstractC0171m.m3501a(a);
        a.mo49m();
        f2957f = u.f5514bw.mo194a(C0063R.drawable.unit_icon_building_turrent);
        f2958g = AbstractC0171m.m3501a(f2957f);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l.m638u();
        this.f3387D = f2953b;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.verylargeBuilding);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f2953b;
        }
        return f2952a[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    public C0400b(boolean z) {
        super(z);
        this.f3387D = f2952a[f2952a.length - 1];
        m2035b(this.f3387D);
        this.f1474bO = 24.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 2800.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4136a(-1, -1, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz && this.f2955d > 0) {
            C0163f fVar = null;
            this.f2956e = C0654f.m1522a(this.f2956e, f);
            if (this.f2956e == 0.0f) {
                this.f2956e = 15.0f;
                Iterator it = C0163f.f915a.iterator();
                while (it.hasNext()) {
                    C0163f fVar2 = (C0163f) it.next();
                    if (fVar2.f945D && fVar2.f5844dJ > 50.0f && C0654f.m1520a(this.f5842dH, this.f5843dI, fVar2.f5842dH, fVar2.f5843dI) < 2200.0f * 2200.0f && C0654f.m1520a(this.f5842dH, this.f5843dI, fVar2.f929n, fVar2.f930o) < 1000000.0f && (fVar2.f925j == null || (!fVar2.f925j.f1461bB.m3464d(this.f1461bB) && fVar2.f925j.f1461bB != this.f1461bB))) {
                        if (!m2658a(fVar2)) {
                            fVar = fVar2;
                        }
                    }
                }
            }
            if (fVar != null) {
                m2656b(fVar);
            }
        }
    }

    /* renamed from: a */
    public boolean m2658a(C0163f fVar) {
        Object[] a = C0163f.f915a.m490a();
        int i = C0163f.f915a.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            C0163f fVar2 = (C0163f) a[i2];
            if (fVar2 != fVar && fVar2.f932q == fVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m2656b(C0163f fVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f2955d > 0) {
            this.f2955d--;
            PointF E = mo2345E(0);
            C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
            a.m406R(10);
            a.f957P = (short) 10;
            a.f959R = (short) 0;
            a.f939x = 1.0f;
            a.f996aC = true;
            a.f932q = fVar;
            a.f923h = 99999.0f;
            a.f935t = 0.2f;
            a.f933r = 6.5f;
            a.f985ar = Color.m4213a(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            a.f962U = 600.0f;
            a.f1001aH = true;
            a.f1006aM = true;
            a.f1010aQ = true;
            a.f944C = true;
            a.f1002aI = 80.0f;
            a.f1003aJ = 100.0f;
            a.f1005aL = 2.0f;
            u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
            C0573e d = u.f5517bz.m1983d(E.f224a, E.f225b, 0.0f, -1);
            if (d != null) {
                d.f3860H = 0.5f;
                d.f3859G = 2.1f;
                d.f3895aq = (short) 2;
                d.f3875W = 90.0f;
                d.f3876X = d.f3875W;
                d.f3874V = 0.0f;
            }
            u.f5512bu.m2114a(C0530e.f3591C, 0.15f, 1.5f, E.f224a, E.f225b);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        f3485aT.m4141a(this.f5842dH, this.f5843dI - 9.0f);
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 1000.0f;
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
        return EnumC0215ak.AntiNukeLaucher;
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

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bH */
    public float mo2564bH() {
        return super.mo2564bH();
    }

    /* renamed from: L */
    public void m2659L() {
        this.f2955d++;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f2962k.m3387J())) {
            m2659L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f2955d < 4) {
            return f2962k.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bV */
    public boolean mo2654bV() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f2963l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: N */
    public void mo2432N() {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bN */
    public void mo2655bN() {
        C0851y.m423a((AbstractC0210af) this, 990.0f, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        if (this.f1494ci) {
            return true;
        }
        return super.mo398a(lVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo2362a(afVar, f, fVar);
    }
}
