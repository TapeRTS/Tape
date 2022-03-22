package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p025e.C0441i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class C0278d extends AbstractC0274b implements AbstractC0208ad {

    /* renamed from: f */
    float f1721f;

    /* renamed from: g */
    boolean f1722g;

    /* renamed from: a */
    static C0748e f1716a = null;

    /* renamed from: b */
    static C0748e f1717b = null;

    /* renamed from: c */
    static C0748e f1718c = null;

    /* renamed from: d */
    static C0748e[] f1719d = new C0748e[10];

    /* renamed from: q */
    public static final AbstractC0197s f1725q = new AbstractC0202x(109) { // from class: com.corrodinggames.rts.game.units.b.d.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2416b(AbstractC0210af afVar, boolean z) {
            return ((C0278d) afVar).f1723o.size();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return !((C0278d) afVar).f1722g && !((AbstractC0515r) afVar).m3298cu() && ((C0278d) afVar).f1723o.size() > 0;
        }
    };

    /* renamed from: r */
    public static final AbstractC0197s f1726r = new AbstractC0202x(110) { // from class: com.corrodinggames.rts.game.units.b.d.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return ((C0278d) afVar).f1722g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            return mo2386a(afVar, false);
        }
    };

    /* renamed from: s */
    static ArrayList f1727s = new ArrayList();

    /* renamed from: e */
    float f1720e = 0.0f;

    /* renamed from: o */
    C0835m f1723o = new C0835m();

    /* renamed from: p */
    Rect f1724p = new Rect();

    static {
        f1727s.add(f1725q);
        f1727s.add(f1726r);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f1720e);
        apVar.mo1096a(this.f1721f);
        apVar.mo1090a(this.f1722g);
        apVar.mo1095a(this.f1723o.size());
        Iterator it = this.f1723o.iterator();
        while (it.hasNext()) {
            apVar.mo1094a((AbstractC0210af) it.next());
        }
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f1720e = kVar.m1061g();
        this.f1721f = kVar.m1061g();
        this.f1722g = kVar.m1063e();
        this.f1723o.clear();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0210af n = kVar.m1054n();
            if (n != null) {
                this.f1723o.add(n);
            }
        }
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bK */
    public int mo2503bK() {
        return C0441i.m2506a(this.f1723o);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bL */
    public int mo2502bL() {
        return 4;
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.dropship;
    }

    /* renamed from: c */
    public static void m3218c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1717b = u.f5514bw.mo194a(C0063R.drawable.dropship);
        f1718c = u.f5514bw.mo194a(C0063R.drawable.dropship_shadow);
        f1716a = u.f5514bw.mo194a(C0063R.drawable.dropship_dead);
        f1719d = AbstractC0171m.m3501a(f1717b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1716a;
        }
        return f1719d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f1718c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f1716a;
        m406R(0);
        this.f1458by = false;
        m3216h(true);
        return true;
    }

    public C0278d(boolean z) {
        super(z);
        m2038S(45);
        m2037T(47);
        this.f1474bO = 20.0f;
        this.f1475bP = this.f1474bO + 0.0f;
        this.f1485bZ = 500.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1717b;
        this.f3388E = f1718c;
        this.f5844dJ = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public boolean mo2338I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return this.f5844dJ >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cd */
    public boolean mo2836cd() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            boolean cu = m3298cu();
            if (this.f1722g && !cu && !this.f1498cm && this.f5844dJ < 4.0f) {
                this.f1721f = C0654f.m1522a(this.f1721f, f);
                if (this.f1721f == 0.0f) {
                    this.f1721f = 30.0f;
                    if (this.f1723o.size() == 0) {
                        this.f1722g = false;
                    } else {
                        boolean z = this.f1723o.size() % 2 == 0;
                        float i = this.f5842dH + (C0654f.m1421i(this.f1471bL) * (-9.0f));
                        float h = this.f5843dI + (C0654f.m1425h(this.f1471bL) * (-9.0f));
                        float i2 = i + (C0654f.m1421i(this.f1471bL + 90.0f) * (z ? -7 : 7)) + (C0654f.m1425h(this.f1471bL + 90.0f) * (z ? -7 : 7));
                        AbstractC0210af afVar = (AbstractC0210af) this.f1723o.remove(this.f1723o.size() - 1);
                        if (!C0851y.m427a(afVar, i2, h)) {
                            i2 += 10.0f;
                        }
                        if (!C0851y.m427a(afVar, i2, h)) {
                            i2 -= 20.0f;
                        }
                        if (!C0851y.m427a(afVar, i2, h)) {
                            i2 -= 10.0f;
                            h += 10.0f;
                        }
                        if (!C0851y.m427a(afVar, i2, h)) {
                            h -= 20.0f;
                        }
                        if (!C0851y.m427a(afVar, i2, h)) {
                            this.f1723o.add(afVar);
                        } else {
                            afVar.f1501cp = null;
                            afVar.f5842dH = i2;
                            afVar.f5843dI = h;
                            afVar.f1463bD += 0.1f;
                            afVar.f1471bL = this.f1471bL + 180.0f;
                            afVar.f1456bw = this;
                            afVar.f1457bx = 45.0f;
                            if (afVar instanceof AbstractC0515r) {
                                AbstractC0515r rVar = (AbstractC0515r) afVar;
                                rVar.m2229ax();
                                rVar.m2186d(this.f5842dH + (C0654f.m1421i(this.f1471bL) * (-66.0f)), this.f5843dI + (C0654f.m1425h(this.f1471bL) * (-66.0f)));
                            }
                            if (this.f1723o.size() == 0) {
                                this.f1722g = false;
                            }
                        }
                    }
                }
            }
            this.f1720e += 2.0f * f;
            if (this.f1720e > 360.0f) {
                this.f1720e -= 360.0f;
            }
            boolean i3 = mo2357i();
            if (m3321bG()) {
                if (!m2238ao() || cu) {
                    this.f5844dJ = C0654f.m1521a(this.f5844dJ, 35.0f + (C0654f.m1425h(this.f1720e) * 1.5f), 0.35f * f);
                } else {
                    this.f5844dJ = C0654f.m1521a(this.f5844dJ, 2.0f, 0.4f * f);
                }
            }
            if (i3 != mo2357i()) {
                this.f3446ao = true;
                if (mo2357i()) {
                    m406R(5);
                } else {
                    m406R(2);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        float g = mo2173g(i);
        float f = this.f1471bL;
        f3485aT.m4141a(this.f5842dH + (C0654f.m1421i(f) * g), this.f5843dI + (C0654f.m1425h(f) * g));
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
        a.f985ar = Color.m4213a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        a.f962U = 35.0f;
        a.f927l = afVar;
        a.f923h = 80.0f;
        a.f935t = 4.0f;
        a.f939x = 2.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        u.f5512bu.m2115a(C0530e.f3582t, 0.3f, this.f5842dH, this.f5843dI);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 2.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0566ay, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        m3216h(true);
        super.mo405a();
    }

    /* renamed from: h */
    public void m3216h(boolean z) {
        Iterator it = this.f1723o.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            afVar.f1501cp = null;
            afVar.f5842dH = this.f5842dH + (C0654f.m1421i(this.f1471bL) * (-9.0f));
            afVar.f5843dI = this.f5843dI + (C0654f.m1425h(this.f1471bL) * (-9.0f));
            if (z) {
                afVar.f1484bY = -1.0f;
            }
        }
        this.f1723o.clear();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: m_ */
    public boolean mo2492m_() {
        return this.f1722g;
    }

    /* renamed from: L */
    public void m3220L() {
        this.f1722g = true;
        this.f1721f = 30.0f;
    }

    /* renamed from: cY */
    public void m3217cY() {
        this.f1722g = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 16000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: d */
    public boolean mo2497d(AbstractC0210af afVar, boolean z) {
        if (this.f1722g || !C0441i.m2505a(this.f1723o, 4, afVar) || afVar == this) {
            return false;
        }
        if (this.f1461bB == afVar.f1461bB || z) {
            return C0851y.m421a(afVar, true, true);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2495e(AbstractC0210af afVar, boolean z) {
        if (!mo2497d(afVar, z)) {
            return false;
        }
        m3215y(afVar);
        return true;
    }

    /* renamed from: y */
    public void m3215y(AbstractC0210af afVar) {
        afVar.f1501cp = this;
        this.f1723o.add(afVar);
        AbstractC0789l.m638u().f5518bA.m1666l(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: e */
    public void mo2496e(AbstractC0210af afVar) {
        if (afVar.f1501cp == this) {
            this.f1723o.remove(afVar);
            afVar.f1501cp = null;
            return;
        }
        AbstractC0789l.m663f("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
        if (sVar == f1725q) {
            m3220L();
        }
        if (sVar == f1726r) {
            m3217cY();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: f */
    public int mo2494f() {
        return this.f1723o.size();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cc */
    public boolean mo2498cc() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ca */
    public C0181c mo2499ca() {
        return f1725q.m3387J();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f1727s;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: n_ */
    public boolean mo2491n_() {
        return !m3298cu();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: u */
    public boolean mo2490u() {
        return true;
    }
}
