package com.corrodinggames.rts.game.units.p025e;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.e.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class C0441i extends AbstractC0440h implements AbstractC0208ad {

    /* renamed from: f */
    float f3177f;

    /* renamed from: g */
    boolean f3178g;

    /* renamed from: a */
    static C0748e f3172a = null;

    /* renamed from: b */
    static C0748e f3173b = null;

    /* renamed from: c */
    static C0748e f3174c = null;

    /* renamed from: d */
    static C0748e[] f3175d = new C0748e[10];

    /* renamed from: i */
    public static final AbstractC0197s f3180i = new AbstractC0202x(109) { // from class: com.corrodinggames.rts.game.units.e.i.1
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
            return ((AbstractC0208ad) afVar).mo2494f();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return !((AbstractC0208ad) afVar).mo2492m_() && ((AbstractC0208ad) afVar).mo2491n_() && ((AbstractC0208ad) afVar).mo2494f() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            return ((AbstractC0208ad) afVar).mo2490u();
        }
    };

    /* renamed from: j */
    public static final AbstractC0197s f3181j = new AbstractC0202x(110) { // from class: com.corrodinggames.rts.game.units.e.i.2
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
            return ((AbstractC0208ad) afVar).mo2492m_();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            return mo2386a(afVar, false);
        }
    };

    /* renamed from: k */
    static ArrayList f3182k = new ArrayList();

    /* renamed from: e */
    float f3176e = 0.0f;

    /* renamed from: h */
    C0835m f3179h = new C0835m();

    static {
        f3182k.add(f3180i);
        f3182k.add(f3181j);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f3176e);
        apVar.mo1096a(this.f3177f);
        apVar.mo1090a(this.f3178g);
        apVar.mo1095a(this.f3179h.size());
        Iterator it = this.f3179h.iterator();
        while (it.hasNext()) {
            apVar.mo1094a((AbstractC0210af) it.next());
        }
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3176e = kVar.m1061g();
        this.f3177f = kVar.m1061g();
        this.f3178g = kVar.m1063e();
        this.f3179h.clear();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0210af n = kVar.m1054n();
            if (n != null) {
                this.f3179h.add(n);
            }
        }
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.hovercraft;
    }

    /* renamed from: c */
    public static void m2501c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3172a = u.f5514bw.mo194a(C0063R.drawable.hovercraft);
        f3174c = u.f5514bw.mo194a(C0063R.drawable.hovercraft_shadow);
        f3173b = u.f5514bw.mo194a(C0063R.drawable.hovercraft_dead);
        f3175d = AbstractC0171m.m3501a(f3172a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3173b;
        }
        return f3175d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3174c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        this.f3387D = f3173b;
        m406R(0);
        this.f1458by = false;
        m2493h(true);
        m2288a(EnumC0519u.small);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0566ay, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        m2493h(true);
        super.mo405a();
    }

    /* renamed from: h */
    public void m2493h(boolean z) {
        Iterator it = this.f3179h.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            afVar.f1501cp = null;
            afVar.f5842dH = this.f5842dH + (C0654f.m1421i(this.f1471bL) * (-9.0f));
            afVar.f5843dI = this.f5843dI + (C0654f.m1425h(this.f1471bL) * (-9.0f));
            if (z) {
                afVar.f1484bY = -1.0f;
            }
        }
        this.f3179h.clear();
    }

    public C0441i(boolean z) {
        super(z);
        m2038S(20);
        m2037T(32);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 450.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3172a;
        this.f3388E = f3174c;
    }

    /* renamed from: a */
    public static int m2506a(C0835m mVar) {
        int i = 0;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            i += ((AbstractC0210af) it.next()).mo2519cg();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m2505a(C0835m mVar, int i, AbstractC0210af afVar) {
        if (m2506a(mVar) + afVar.mo2519cg() <= i) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bK */
    public int mo2503bK() {
        return m2506a(this.f3179h);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bL */
    public int mo2502bL() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m2508a(AbstractC0210af afVar, AbstractC0210af afVar2, boolean z) {
        return m2507a(afVar, afVar2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m2507a(AbstractC0210af afVar, AbstractC0210af afVar2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float i = (afVar.f5842dH + (C0654f.m1421i(afVar.f1471bL + f2) * f5)) - (C0654f.m1425h(afVar.f1471bL + f2) * f4);
        float h = afVar.f5843dI + (C0654f.m1425h(afVar.f1471bL + f2) * f5) + (C0654f.m1421i(afVar.f1471bL + f2) * f4);
        float i2 = i + (C0654f.m1421i(afVar.f1471bL + 90.0f) * (z ? -f : f));
        float h2 = h + (C0654f.m1425h(afVar.f1471bL + 90.0f) * (z ? -f : f));
        if (!C0851y.m427a(afVar2, i2, h2)) {
            i2 += 10.0f;
        }
        if (!C0851y.m427a(afVar2, i2, h2)) {
            i2 -= 20.0f;
        }
        if (!C0851y.m427a(afVar2, i2, h2)) {
            i2 -= 10.0f;
            h2 += 10.0f;
        }
        if (!C0851y.m427a(afVar2, i2, h2)) {
            h2 -= 20.0f;
        }
        if (!C0851y.m427a(afVar2, i2, h2)) {
            return false;
        }
        afVar2.f1501cp = null;
        afVar2.f5842dH = i2;
        afVar2.f5843dI = h2;
        afVar2.f1463bD += 0.1f;
        afVar2.f1471bL = afVar.f1471bL + f2;
        afVar2.f1456bw = afVar;
        afVar2.f1457bx = 45.0f;
        if (!(afVar2 instanceof AbstractC0515r)) {
            return true;
        }
        AbstractC0515r rVar = (AbstractC0515r) afVar2;
        rVar.m2162j(afVar2.f1471bL);
        rVar.m2229ax();
        rVar.m2186d(afVar2.f5842dH + (C0654f.m1421i(afVar2.f1471bL + (z ? -f : f)) * f3), afVar2.f5843dI + (C0654f.m1425h(afVar2.f1471bL + (z ? -f : f)) * f3));
        rVar.f3422T = 0;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0440h, com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz && m3321bG()) {
            if (this.f1476bQ == 0.0f && this.f5840dF != 3) {
                m406R(3);
            }
            if (this.f3178g && !m3298cu() && !this.f1498cm) {
                this.f3177f = C0654f.m1522a(this.f3177f, f);
                if (this.f3177f == 0.0f) {
                    this.f3177f = 30.0f;
                    if (this.f3179h.size() == 0) {
                        this.f3178g = false;
                    } else {
                        boolean z = this.f3179h.size() % 2 == 0;
                        AbstractC0210af afVar = (AbstractC0210af) this.f3179h.remove(this.f3179h.size() - 1);
                        if (!m2508a(this, afVar, z)) {
                            this.f3179h.add(afVar);
                        }
                        if (this.f3179h.size() == 0) {
                            this.f3178g = false;
                        }
                    }
                }
            }
            this.f3176e += 4.0f * f;
            if (this.f3176e > 360.0f) {
                this.f3176e -= 360.0f;
            }
            if (!this.f3178g) {
                this.f5844dJ = C0654f.m1521a(this.f5844dJ, 3.0f + (C0654f.m1425h(this.f3176e) * 1.5f), 0.1f * f);
            } else {
                this.f5844dJ = C0654f.m1521a(this.f5844dJ, 0.0f, 0.1f * f);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        if (m3298cu()) {
            return 1.2f;
        }
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        if (m3298cu()) {
            return 1.8f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.1f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: d */
    public boolean mo2497d(AbstractC0210af afVar, boolean z) {
        if (this.f3178g || !m2505a(this.f3179h, 4, afVar) || afVar == this) {
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
        m2489y(afVar);
        return true;
    }

    /* renamed from: y */
    public void m2489y(AbstractC0210af afVar) {
        afVar.f1501cp = this;
        this.f3179h.add(afVar);
        AbstractC0789l.m638u().f5518bA.m1666l(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: e */
    public void mo2496e(AbstractC0210af afVar) {
        if (afVar.f1501cp == this) {
            this.f3179h.remove(afVar);
            afVar.f1501cp = null;
            return;
        }
        AbstractC0789l.m663f("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 12000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: m_ */
    public boolean mo2492m_() {
        return this.f3178g;
    }

    /* renamed from: L */
    public void m2509L() {
        this.f3178g = true;
        this.f3177f = 30.0f;
    }

    /* renamed from: cY */
    public void m2500cY() {
        this.f3178g = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
        if (sVar == f3180i) {
            m2509L();
        }
        if (sVar == f3181j) {
            m2500cY();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cc */
    public boolean mo2498cc() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0208ad
    /* renamed from: f */
    public int mo2494f() {
        return this.f3179h.size();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ca */
    public C0181c mo2499ca() {
        return f3180i.m3387J();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3182k;
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
