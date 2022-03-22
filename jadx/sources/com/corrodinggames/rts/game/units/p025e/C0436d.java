package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class C0436d extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3142a = null;

    /* renamed from: b */
    static C0748e f3143b = null;

    /* renamed from: c */
    static C0748e f3144c = null;

    /* renamed from: d */
    static C0748e[] f3145d = new C0748e[10];

    /* renamed from: e */
    int f3146e;

    /* renamed from: f */
    float f3147f;

    /* renamed from: g */
    Rect f3148g = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.experimentalTank;
    }

    /* renamed from: c */
    public static void m2521c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.experimental_tank);
        f3145d = AbstractC0171m.m3501a(a);
        f3142a = u.f5514bw.mo194a(C0063R.drawable.experimental_tank_dead);
        f3143b = u.f5514bw.mo194a(C0063R.drawable.experimental_tank_turret);
        f3144c = m3330a(a, a.mo349l() / 2, a.mo350k());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3142a;
        }
        return f3145d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3144c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ > -2.0f && this.f1477bR >= 1.0f;
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
        if (m2523Q(i)) {
            return null;
        }
        return f3143b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        m2288a(EnumC0519u.largeUnit);
        this.f3387D = f3142a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0436d(boolean z) {
        super(z);
        m2036a(f3145d[7], 2);
        this.f1474bO = 37.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 6000.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3145d[7];
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            if (this.f1476bQ != 0.0f) {
                m406R(2);
            } else {
                m406R(4);
            }
        }
        if (this.f1498cm) {
            this.f3147f += f;
            if (this.f3147f > 5.0f) {
                this.f3147f = 0.0f;
                this.f3146e = 1 - this.f3146e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        if (!m2523Q(i)) {
            PointF E = mo2345E(i);
            C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
            PointF J = mo2336J(i);
            a.f952K = J.f224a;
            a.f953L = J.f225b;
            a.f985ar = Color.m4213a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            a.f923h = 120.0f;
            a.f935t = 5.0f;
            a.f927l = afVar;
            a.f966Y = 60.0f;
            a.f962U = 40.0f;
            a.f967Z = 45.0f;
            a.f968aa = true;
            a.f939x = 2.0f;
            a.f1010aQ = true;
            a.f957P = (short) 9;
            a.f939x = 1.0f;
            a.f5840dF = this.f5840dF;
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, 16745216);
            u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
            u.f5517bz.m2001a(a, -1127220);
            u.f5512bu.m2115a(C0530e.f3583u, 0.3f, this.f5842dH, this.f5843dI);
            return;
        }
        PointF E2 = mo2345E(i);
        E2.m4141a(this.f5842dH, this.f5843dI);
        C0163f a2 = C0163f.m3575a(this, this.f5842dH, this.f5843dI);
        a2.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a2.f962U = 60.0f;
        a2.f927l = afVar;
        a2.f923h = 190.0f;
        a2.f935t = 3.0f;
        a2.f933r = 6.0f;
        a2.f1001aH = true;
        a2.f1002aI = 10.0f;
        a2.f1003aJ = 15.0f;
        a2.f1006aM = true;
        a2.f1010aQ = true;
        a2.f1000aG = true;
        a2.f5840dF = this.f5840dF;
        AbstractC0789l u2 = AbstractC0789l.m638u();
        u2.f5512bu.m2115a(C0530e.f3574l, 0.2f, this.f5842dH, this.f5843dI);
        u2.f5517bz.m2001a(a2, -1118720);
        u2.f5517bz.m2009a(E2.f224a, E2.f225b, this.f5844dJ, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2306a(int i, AbstractC0210af afVar, boolean z, boolean z2) {
        if (!z && z2 && !m2253a_(afVar)) {
            return false;
        }
        if (m2523Q(i)) {
            if (!afVar.mo2357i()) {
                return false;
            }
            return true;
        } else if (afVar.mo2357i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        if (m2523Q(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        if (m2523Q(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aX */
    public float mo2256aX() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bc */
    public int mo2209bc() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        if (m2523Q(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        if (m2523Q(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.08f;
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
        int i = 0 + (this.f3146e * this.f3752dL);
        this.f3148g.m4136a(i, 0, i + this.f3752dL, 0 + this.f3753dM);
        return this.f3148g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        C0851y.m420a((AbstractC0515r) this);
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public PointF mo2343F(int i) {
        PointF F = super.mo2343F(i);
        float f = F.f224a;
        float f2 = F.f225b;
        if (!m2523Q(i)) {
            if (i <= 1) {
                f += C0654f.m1421i(this.f1471bL) * 5.0f;
                f2 += C0654f.m1425h(this.f1471bL) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += C0654f.m1421i(this.f1471bL + f3) * 18.0f;
            f2 += C0654f.m1425h(this.f1471bL + f3) * 18.0f;
        }
        f3486aU.m4141a(f, f2);
        return f3486aU;
    }

    /* renamed from: Q */
    public boolean m2523Q(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bg */
    public int mo2205bg() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2341G(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2339H(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public float mo2337I(int i) {
        return 12.0f;
    }
}
