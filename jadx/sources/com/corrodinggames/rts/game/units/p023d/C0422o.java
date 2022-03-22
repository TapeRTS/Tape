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
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/o.class */
public class C0422o extends AbstractC0413h {

    /* renamed from: c */
    int f3063c;

    /* renamed from: f */
    PointF f3066f = new PointF();

    /* renamed from: g */
    Rect f3067g = new Rect();

    /* renamed from: a */
    static C0748e[] f3061a = new C0748e[10];

    /* renamed from: b */
    static C0748e f3062b = null;

    /* renamed from: d */
    static C0748e f3064d = null;

    /* renamed from: e */
    static C0748e[] f3065e = new C0748e[10];

    /* renamed from: h */
    static AbstractC0197s f3068h = new AbstractC0197s(142) { // from class: com.corrodinggames.rts.game.units.d.o.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public String mo2414c(AbstractC0210af afVar) {
            return C0652a.m1536a("gui.actions.launchNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2416b(AbstractC0210af afVar, boolean z) {
            return ((C0422o) afVar).f3063c;
        }

        /* renamed from: t */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2377e() {
            return EnumC0199u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.action;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return ((C0422o) afVar).f3063c > 0;
        }
    };

    /* renamed from: i */
    static AbstractC0197s f3069i = new AbstractC0201w(143) { // from class: com.corrodinggames.rts.game.units.d.o.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("gui.actions.buildNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.buildNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0422o oVar = (C0422o) afVar;
            if (oVar.f3063c + oVar.mo2589a(m3387J(), z) >= 4.0f) {
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

    /* renamed from: j */
    static ArrayList f3070j = new ArrayList();

    static {
        f3070j.add(f3068h);
        f3070j.add(f3069i);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f3063c);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3063c = kVar.m1062f();
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3065e[this.f1461bB.m3518M()];
    }

    /* renamed from: b */
    public static void m2565b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3062b = u.f5514bw.mo194a(C0063R.drawable.nuke_launcher_dead);
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.nuke_launcher);
        f3061a = AbstractC0171m.m3501a(a);
        a.mo49m();
        f3064d = u.f5514bw.mo194a(C0063R.drawable.unit_icon_building);
        f3065e = AbstractC0171m.m3501a(f3064d);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bk */
    public int mo2201bk() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f3387D = f3062b;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.verylargeBuilding);
        float f = this.f5842dH;
        float f2 = this.f5843dI;
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e a = u.f5517bz.m2009a(f, f2, this.f5844dJ, Color.m4213a(255, 255, 255, 255));
        if (a != null) {
            a.f3860H = 8.0f;
            a.f3859G = 5.0f;
            a.f3858F = 0.9f;
            a.f3875W = 20.0f;
            a.f3876X = a.f3875W;
            a.f3845s = true;
        }
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e c = u.f5517bz.m1985c(f, f2, 0.0f, -1127220);
        if (c != null) {
            c.f3860H = 0.2f;
            c.f3859G = 2.0f;
            c.f3895aq = (short) 2;
            c.f3875W = 45.0f;
            c.f3876X = c.f3875W;
            c.f3874V = 0.0f;
        }
        u.f5517bz.m2013a(this.f5842dH, this.f5843dI, this.f5844dJ, 40.0f, 120.0f);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3062b;
        }
        return f3061a[this.f1461bB.m3518M()];
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

    public C0422o(boolean z) {
        super(z);
        this.f3387D = f3061a[f3061a.length - 1];
        m2035b(this.f3387D);
        this.f1474bO = 40.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 1500.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-2, -1, 2, 1);
        this.f2966o.m4136a(-2, -1, 2, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        f3485aT.m4141a(this.f5842dH, this.f5843dI - 3.0f);
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
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
        return EnumC0215ak.NukeLaucher;
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

    /* renamed from: a */
    public void m2567a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f3063c > 0) {
            if (C0654f.m1520a(this.f5842dH, this.f5843dI, f, f2) >= 202500.0f) {
                this.f3063c--;
                PointF E = mo2345E(0);
                m2566a(this, E.f224a, E.f225b, f, f2).f924i = 5.0f;
                C0573e a = u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
                if (a != null) {
                    a.f3874V = 5.0f;
                    a.f3860H = 2.1f;
                    a.f3859G = 2.1f;
                    a.f3895aq = (short) 2;
                    a.f3846t = true;
                    a.f3847u = 70.0f;
                    a.f3875W = 370.0f;
                    a.f3876X = a.f3875W;
                    a.f3858F = 1.0f;
                }
                C0573e d = u.f5517bz.m1983d(E.f224a, E.f225b, 0.0f, -1);
                if (d != null) {
                    d.f3860H = 1.0f;
                    d.f3859G = 3.1f;
                    d.f3895aq = (short) 2;
                    d.f3875W = 170.0f;
                    d.f3876X = d.f3875W;
                    d.f3874V = 5.0f + 20.0f;
                }
                u.f5512bu.m2114a(C0530e.f3591C, 0.27f, 0.8f, E.f224a, E.f225b);
            } else if (this.f1461bB == u.f5493bb) {
                u.f5518bA.m1711a("Nuke target too close");
            }
        }
    }

    /* renamed from: a */
    public static C0163f m2566a(AbstractC0210af afVar, float f, float f2, float f3, float f4) {
        C0163f a = C0163f.m3575a(afVar, f, f2);
        a.m406R(10);
        a.f957P = (short) 0;
        a.f958Q = (short) 1;
        a.f959R = (short) 1;
        a.f939x = 1.0f;
        a.f996aC = true;
        a.f928m = true;
        a.f929n = f3;
        a.f930o = f4;
        a.f923h = 99999.0f;
        a.f935t = 0.1f;
        a.f933r = 2.7f;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        a.f962U = 300.0f;
        a.f1001aH = true;
        a.f1006aM = true;
        a.f1010aQ = true;
        a.f944C = true;
        a.f945D = true;
        a.f1002aI = 80.0f;
        a.f1003aJ = 100.0f;
        a.f1005aL = 1.1f;
        a.f966Y = 5400.0f;
        a.f967Z = 250.0f;
        a.f971ad = true;
        a.f972ae = false;
        a.f982ao = true;
        a.f964W = 75.0f;
        a.f965X = a.f964W;
        a.f1019aY = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e a2 = u.f5517bz.m2001a(a, -1118720);
        if (a2 != null) {
            a2.f3875W = 1300.0f;
            a2.f3876X = a2.f3875W;
            a2.f3858F = 0.2f;
            a2.f3860H = 1.0f;
        }
        return a;
    }

    /* renamed from: L */
    public void m2568L() {
        this.f3063c++;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3069i.m3387J())) {
            m2568L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2429a(AbstractC0197s sVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        if (!z) {
            if (sVar == f3068h) {
                m2567a(pointF.f224a, pointF.f225b);
            } else {
                super.mo2429a(sVar, z, pointF, afVar);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3070j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m410b((AbstractC0210af) this, 450.0f, false);
    }
}
