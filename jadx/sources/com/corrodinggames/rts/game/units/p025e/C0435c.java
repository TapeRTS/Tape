package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class C0435c extends AbstractC0440h {

    /* renamed from: a */
    static C0748e f3131a = null;

    /* renamed from: b */
    static C0748e f3132b = null;

    /* renamed from: c */
    static C0748e f3133c = null;

    /* renamed from: d */
    public static C0748e f3134d = null;

    /* renamed from: e */
    public static C0748e f3135e = null;

    /* renamed from: f */
    static C0748e[] f3136f = new C0748e[10];

    /* renamed from: g */
    int f3137g;

    /* renamed from: i */
    C0163f f3139i;

    /* renamed from: h */
    float f3138h = 0.0f;

    /* renamed from: j */
    Rect f3140j = new Rect();

    /* renamed from: k */
    Paint f3141k = C0851y.m438a();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.experimentalHoverTank;
    }

    /* renamed from: c */
    public static void m2524c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.experimental_hovertank);
        f3136f = AbstractC0171m.m3501a(a);
        f3131a = u.f5514bw.mo194a(C0063R.drawable.experimental_hovertank_dead);
        f3132b = u.f5514bw.mo194a(C0063R.drawable.experimental_hovertank_turret);
        f3133c = m3330a(a, a.mo349l() / 1, a.mo350k());
        f3134d = u.f5514bw.mo194a(C0063R.drawable.experimental_hovertank_shield);
        f3135e = u.f5514bw.mo194a(C0063R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        if (this.f3139i != null && this.f3139i.f5837dC) {
            this.f3139i = null;
        }
        apVar.mo1142a(this.f3139i);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3139i = (C0163f) kVar.m1076a(C0163f.class);
        super.mo399a(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3131a;
        }
        return f3136f[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3133c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3132b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: R */
    public C0748e mo2331R() {
        return f3134d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3131a;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.largeUnit);
        return true;
    }

    public C0435c(boolean z) {
        super(z);
        m2036a(f3136f[7], 1);
        this.f1474bO = 30.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 3500.0f;
        this.f1484bY = this.f1485bZ;
        this.f1490ce = 5000.0f;
        this.f1487cb = this.f1490ce;
        this.f3387D = f3136f[7];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bI */
    public float mo2486bI() {
        if (this.f1490ce <= 0.0f || this.f1487cb >= this.f1490ce) {
            return super.mo2486bI();
        }
        return this.f1487cb / this.f1490ce;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0440h, com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz && m3321bG()) {
            if (!this.f1459bz) {
                if (this.f1476bQ != 0.0f) {
                    m406R(2);
                } else {
                    m406R(4);
                }
            }
            if (this.f1498cm) {
            }
            this.f3138h += 1.0f * f;
            if (this.f3138h > 360.0f) {
                this.f3138h -= 360.0f;
            }
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, 4.0f + (C0654f.m1425h(this.f3138h) * 2.0f), 0.1f * f);
            this.f1487cb = C0654f.m1521a(this.f1487cb, this.f1490ce, 0.25f * f);
            this.f1488cc = C0654f.m1521a(this.f1488cc, 0.0f, 4.0f * f);
            if (this.f1488cc > 50.0f) {
                this.f1488cc = 50.0f;
            }
            if (this.f3139i != null) {
                PointF E = mo2345E(0);
                this.f3139i.f5842dH = E.f224a;
                this.f3139i.f5843dI = E.f225b;
                this.f3139i.f5844dJ = this.f5844dJ;
                if (this.f3139i.f5837dC) {
                    this.f3139i = null;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: K */
    public float mo2335K(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: J */
    public PointF mo2336J(int i) {
        PointF J = super.mo2336J(i);
        if (this.f3139i != null) {
            J.f224a += this.f3139i.f952K;
            J.f225b += this.f3139i.f953L;
        }
        return J;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        AbstractC0789l.m638u();
        PointF E = mo2345E(i);
        if (this.f3139i != null) {
            boolean z = false;
            if (this.f3139i.f5837dC) {
                z = true;
            }
            if (this.f3139i.f927l != afVar) {
                z = true;
            }
            if (z) {
                this.f3139i = null;
            }
        }
        float b = mo2222b(i) + mo2180e(i) + 5.0f;
        if (this.f3139i != null) {
            this.f3139i.f923h = b;
            return;
        }
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        a.f962U = 380.0f;
        a.f927l = afVar;
        a.f923h = b;
        a.f943B = true;
        a.f942A = true;
        a.f1010aQ = true;
        a.f946E = true;
        a.f951J = 70.0f;
        a.f947F = 230.0f;
        a.f978ak = 0.75f;
        a.f5840dF = this.f5840dF;
        this.f3139i = a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aX */
    public float mo2256aX() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        if (this.f1459bz && !z) {
            return super.mo2479a_(z);
        }
        if (z) {
            return super.mo2479a_(z);
        }
        int i = 0 + (this.f3137g * this.f3752dL);
        this.f3140j.m4136a(i, 0, i + this.f3752dL, 0 + this.f3753dM);
        return this.f3140j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        C0748e R;
        if (!super.mo396c(f)) {
            return false;
        }
        C0851y.m420a((AbstractC0515r) this);
        if (!this.f1459bz) {
            float f2 = 0.0f;
            if (this.f3139i != null) {
                f2 = C0654f.m1476b(this.f3139i.m3566e(), 0.25f) * 3.0f;
            }
            C0851y.m418a(this, C0446l.f3199e, f2, 0);
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1459bz || this.f1487cb <= 0.0f || this.f1489cd != 0.0f || (R = mo2331R()) == null) {
            return true;
        }
        this.f3141k.m4189a((int) ((0.09f + ((this.f1487cb / this.f1490ce) * 0.4f) + ((C0654f.m1476b(this.f1488cc, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
        u.f5514bw.mo176a(R, this.f5842dH - u.f5547cd, (this.f5843dI - u.f5548ce) - this.f5844dJ, mo2511f(false) - 90.0f, this.f3141k);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public PointF mo2343F(int i) {
        f3486aU.m4141a(this.f5842dH, this.f5843dI);
        return f3486aU;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bg */
    public int mo2205bg() {
        return 1;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cg */
    public int mo2519cg() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cL */
    public boolean mo2520cL() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
