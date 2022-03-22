package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p025e.C0446l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class C0275c extends AbstractC0274b {

    /* renamed from: q */
    float f1705q;

    /* renamed from: r */
    boolean f1706r = true;

    /* renamed from: s */
    boolean f1707s = true;

    /* renamed from: t */
    float f1708t = 0.0f;

    /* renamed from: u */
    float f1709u = 0.0f;

    /* renamed from: v */
    protected Paint f1710v = new C0760q();

    /* renamed from: w */
    PointF f1711w = new PointF();

    /* renamed from: x */
    Rect f1712x = new Rect();

    /* renamed from: a */
    static C0748e f1696a = null;

    /* renamed from: b */
    static C0748e f1697b = null;

    /* renamed from: c */
    static C0748e f1698c = null;

    /* renamed from: d */
    static C0748e f1699d = null;

    /* renamed from: e */
    static C0748e[] f1700e = new C0748e[10];

    /* renamed from: f */
    static C0748e[] f1701f = new C0748e[10];

    /* renamed from: g */
    static C0748e[] f1702g = new C0748e[10];

    /* renamed from: o */
    static C0748e f1703o = null;

    /* renamed from: p */
    static C0748e f1704p = null;

    /* renamed from: y */
    public static final AbstractC0197s f1713y = new AbstractC0202x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return !((C0275c) afVar).f1706r;
        }
    };

    /* renamed from: z */
    public static final AbstractC0197s f1714z = new AbstractC0202x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return ((C0275c) afVar).f1706r && ((AbstractC0515r) afVar).m3299ct();
        }
    };

    /* renamed from: A */
    static ArrayList f1715A = new ArrayList();

    static {
        f1715A.add(f1713y);
        f1715A.add(f1714z);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f1706r);
        apVar.mo1096a(this.f1708t);
        apVar.mo1096a(this.f1709u);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f1706r = kVar.m1063e();
        this.f1707s = !mo2363P();
        if (kVar.m1071b() >= 21) {
            this.f1708t = kVar.m1061g();
        }
        if (kVar.m1071b() >= 22) {
            this.f1709u = kVar.m1061g();
        }
        m3227L();
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: P */
    public boolean mo2363P() {
        return this.f5844dJ < -1.0f;
    }

    /* renamed from: b */
    public boolean m3225b() {
        if (!this.f1706r || this.f5844dJ < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        if (this.f1479bT) {
            return EnumC0212ah.AIR;
        }
        if (m3225b()) {
            return EnumC0212ah.WATER;
        }
        return EnumC0212ah.AIR;
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.amphibiousJet;
    }

    /* renamed from: f */
    public static void m3222f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1697b = u.f5514bw.mo194a(C0063R.drawable.amphibious_jet);
        f1698c = u.f5514bw.mo194a(C0063R.drawable.amphibious_jet_shadow);
        f1696a = u.f5514bw.mo194a(C0063R.drawable.amphibious_jet_dead);
        f1700e = AbstractC0171m.m3501a(f1697b);
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.amphibious_jet_p1);
        C0748e a2 = u.f5514bw.mo194a(C0063R.drawable.amphibious_jet_p2);
        f1701f = AbstractC0171m.m3501a(a);
        f1702g = AbstractC0171m.m3501a(a2);
        f1703o = m3331a(a);
        f1704p = m3331a(a2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aM */
    public boolean mo2267aM() {
        if (!super.mo2267aM()) {
            return false;
        }
        m3221h(true);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        if (this.f1459bz) {
            return true;
        }
        m3221h(false);
        if (this.f1459bz) {
            return true;
        }
        for (int i = 0; i < mo2205bg(); i++) {
            if (i != m3223cY()) {
                float e = this.f1499cn[i].f1566f / mo2180e(i);
                if (e != 0.0f) {
                    AbstractC0789l u = AbstractC0789l.m638u();
                    PointF E = mo2345E(i);
                    u.f5514bw.mo127h();
                    u.f5514bw.mo147b(E.f224a - u.f5547cd, (E.f225b - u.f5548ce) - this.f5844dJ);
                    u.f5514bw.mo200a(e * 0.7f, e * 0.7f);
                    u.f5514bw.mo175a(C0446l.f3199e, 0.0f, 0.0f, (Paint) null);
                    u.f5514bw.mo126i();
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public void m3221h(boolean z) {
        Paint paint;
        C0748e eVar;
        float f;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!z) {
            paint = mo2269aK();
        } else {
            this.f1710v.m4189a(50, 255, 255, 255);
            paint = this.f1710v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF a = m3226a(i, z);
            float f2 = a.f224a - u.f5547cd;
            float f3 = a.f225b - u.f5548ce;
            float f4 = mo2511f(false) - 90.0f;
            if (!z) {
                f3 -= this.f5844dJ;
            }
            if (i == 0) {
                if (z) {
                    eVar = f1704p;
                } else {
                    eVar = f1702g[this.f1461bB.m3518M()];
                }
                f = f4 + 0.0f;
            } else {
                if (z) {
                    eVar = f1703o;
                } else {
                    eVar = f1701f[this.f1461bB.m3518M()];
                }
                f = f4 - 0.0f;
            }
            u.f5514bw.mo176a(eVar, f2, f3, f, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bg */
    public int mo2205bg() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public PointF mo2343F(int i) {
        if (i == m3223cY()) {
            return super.mo2343F(i);
        }
        float f = mo2511f(false) - 90.0f;
        PointF a = m3226a(i, false);
        float f2 = a.f224a;
        float f3 = a.f225b;
        f3486aU.m4141a(f2 + (C0654f.m1421i(f) * 5.0f), f3 + (C0654f.m1425h(f) * 5.0f));
        return f3486aU;
    }

    /* renamed from: a */
    public PointF m3226a(int i, boolean z) {
        float f = mo2511f(false) - 90.0f;
        if (i == m3223cY()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f2 = this.f5842dH;
        float f3 = this.f5843dI;
        float b = C0654f.m1475b(this.f1709u * 4.0f, 0.0f, 1.0f);
        float b2 = C0654f.m1475b((this.f1709u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float i2 = f2 + (C0654f.m1421i(f) * (7.0f - (5.0f * b)));
        float h = f3 + (C0654f.m1425h(f) * (7.0f - (5.0f * b)));
        float f4 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1711w.m4141a(i2 + (C0654f.m1421i(f + f4) * (12.0f - (5.0f * b2))), h + (C0654f.m1425h(f + f4) * (12.0f - (5.0f * b2))));
        return this.f1711w;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1696a;
        }
        return f1700e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f1698c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f1699d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f1696a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0275c(boolean z) {
        super(z);
        m2035b(f1697b);
        this.f1474bO = 12.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 530.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1697b;
        this.f3388E = f1698c;
        this.f5844dJ = 0.0f;
        m406R(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return !m3225b();
    }

    /* renamed from: L */
    public void m3227L() {
        if (!this.f1707s) {
            m406R(1);
        } else {
            m406R(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        float f2;
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            AbstractC0789l u = AbstractC0789l.m638u();
            this.f1705q += 2.0f * f;
            if (this.f1705q > 360.0f) {
                this.f1705q -= 360.0f;
            }
            if (this.f1706r) {
                f2 = 20.0f + (C0654f.m1425h(this.f1705q) * 1.5f);
            } else {
                f2 = -8.0f;
            }
            if (!this.f1706r || mo2363P()) {
                this.f1709u = C0654f.m1521a(this.f1709u, 1.0f, 0.018f * f);
            } else {
                this.f1709u = C0654f.m1521a(this.f1709u, 0.0f, 0.018f * f);
            }
            if (C0654f.m1459c(this.f5844dJ - f2) > 3.0f) {
                float f3 = 0.6f;
                if (mo2363P()) {
                    f3 = 0.6f / 6.0f;
                }
                this.f1708t = C0654f.m1476b(this.f1708t, f3);
                this.f1708t = C0654f.m1521a(this.f1708t, f3, 0.006f * f);
            } else {
                this.f1708t = C0654f.m1521a(this.f1708t, 0.07f, 0.006f * f);
            }
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, f2, this.f1708t * f);
            boolean z = false;
            if (this.f1707s && mo2363P()) {
                if (!m3299ct()) {
                    this.f1706r = true;
                } else {
                    this.f1707s = false;
                    m3227L();
                    z = true;
                }
            }
            if (!this.f1707s && !mo2363P()) {
                this.f1707s = true;
                m3227L();
                z = true;
            }
            if (z) {
                u.f5517bz.m2008a(this.f5842dH, this.f5843dI, 0.0f, 0, 0.0f, 0.0f);
                for (int i = -180; i < 180; i += 45) {
                    float f4 = this.f1471bL + i;
                    C0573e b = u.f5517bz.m1993b((float) (this.f5842dH + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.f5843dI + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                    if (b != null) {
                        b.f3895aq = (short) 2;
                        b.f3846t = true;
                        b.f3847u = 7.0f;
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        if (i == m3223cY()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        if (i != m3223cY()) {
            PointF E = mo2345E(i);
            C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
            a.f985ar = Color.m4213a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            a.f962U = mo2141q(i);
            a.f927l = afVar;
            a.f923h = 10.0f;
            a.f935t = 4.0f;
            a.f939x = 2.0f;
            a.f1010aQ = false;
            a.f942A = true;
            a.f954M = true;
            a.f976ai = 0.5f;
            a.f978ak = 1.0f;
            a.f979al = 0.1f;
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1118482);
            u.f5512bu.m2115a(C0530e.f3585w, 0.2f, this.f5842dH, this.f5843dI);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        if (m3225b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: f */
    public float mo2177f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        if (!mo2363P()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        if (!mo2363P()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: y */
    public float mo2131y(int i) {
        return 0.38f;
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
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bd */
    public boolean mo2208bd() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: be */
    public boolean mo2207be() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: i */
    public void mo2167i(float f) {
        if (!m2325X()) {
            super.mo2167i(f);
            return;
        }
        this.f1471bL += f;
        if (this.f1471bL > 180.0f) {
            this.f1471bL -= 360.0f;
        }
        if (this.f1471bL < -180.0f) {
            this.f1471bL += 360.0f;
        }
    }

    /* renamed from: cY */
    public int m3223cY() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: f */
    public float mo2511f(boolean z) {
        return this.f1499cn[m3223cY()].f1561a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: af */
    public boolean mo2247af() {
        if (!mo2363P()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ac */
    public boolean mo2250ac() {
        if (!mo2363P()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        if (!mo2363P()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ae */
    public boolean mo2248ae() {
        if (!mo2363P()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
        if (sVar == f1713y) {
            this.f1706r = true;
        }
        if (sVar == f1714z) {
            this.f1706r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f1715A;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
