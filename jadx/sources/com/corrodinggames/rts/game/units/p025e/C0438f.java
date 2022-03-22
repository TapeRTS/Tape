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

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class C0438f extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3155a = null;

    /* renamed from: b */
    static C0748e f3156b = null;

    /* renamed from: c */
    static C0748e[] f3157c = new C0748e[10];

    /* renamed from: d */
    static C0748e f3158d = null;

    /* renamed from: e */
    int f3159e;

    /* renamed from: f */
    float f3160f;

    /* renamed from: g */
    float f3161g;

    /* renamed from: h */
    Rect f3162h = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.heavyTank;
    }

    /* renamed from: c */
    public static void m2515c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.heavy_tank);
        f3157c = AbstractC0171m.m3501a(a);
        f3155a = u.f5514bw.mo194a(C0063R.drawable.heavy_tank_dead);
        f3156b = u.f5514bw.mo194a(C0063R.drawable.heavy_tank_turret);
        f3158d = m3330a(a, a.mo349l() / 3, a.mo350k());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3155a;
        }
        return f3157c[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3158d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3156b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && !this.f1459bz && this.f1477bR >= 1.0f && !this.f1480bU;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        this.f3387D = f3155a;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.normal);
        return true;
    }

    public C0438f(boolean z) {
        super(z);
        m2036a(f3157c[7], 3);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 600.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3157c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz && this.f1470bK != 0.0f) {
            this.f3160f += f;
            if (this.f3160f > 1.4d) {
                this.f3160f = 0.0f;
                this.f3159e++;
                if (this.f3159e > 2) {
                    this.f3159e = 0;
                }
            }
            if (this.f5839dE) {
                this.f3161g += f;
                if (this.f3161g > 9.0f) {
                    this.f3161g = 0.0f;
                    m2514f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m2514f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f = this.f1471bL;
        if (this.f1470bK < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            u.f5517bz.m1986c(this.f5842dH + (C0654f.m1421i(f + 180.0f + f2) * this.f1474bO), this.f5843dI + (C0654f.m1425h(f + 180.0f + f2) * this.f1474bO), this.f5844dJ, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!afVar.mo2357i()) {
            PointF E = mo2345E(i);
            C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
            PointF J = mo2336J(i);
            a.f952K = J.f224a;
            a.f953L = J.f225b;
            a.f985ar = Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            a.f962U = mo2141q(i);
            a.f927l = afVar;
            a.f923h = 60.0f;
            a.f935t = 4.0f;
            a.f939x = 2.0f;
            a.f1010aQ = true;
            a.f941z = true;
            u.f5517bz.m2001a(a, -16716288);
            u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
            u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
            u.f5512bu.m2115a(C0530e.f3582t, 0.3f, this.f5842dH, this.f5843dI);
            return;
        }
        PointF E2 = mo2345E(i);
        E2.m4141a(this.f5842dH, this.f5843dI);
        C0163f a2 = C0163f.m3575a(this, this.f5842dH, this.f5843dI);
        a2.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a2.f962U = mo2141q(i);
        a2.f927l = afVar;
        a2.f923h = 190.0f;
        a2.f935t = 0.5f;
        a2.f933r = 5.0f;
        a2.f1001aH = true;
        a2.f1002aI = 10.0f;
        a2.f1003aJ = 15.0f;
        a2.f1006aM = true;
        a2.f1010aQ = true;
        a2.f1000aG = true;
        u.f5512bu.m2115a(C0530e.f3574l, 0.2f, this.f5842dH, this.f5843dI);
        u.f5517bz.m2001a(a2, -1118720);
        u.f5517bz.m2009a(E2.f224a, E2.f225b, this.f5844dJ, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aX */
    public float mo2256aX() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.1f;
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
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        if (z) {
            return super.mo2479a_(z);
        }
        if (this.f1459bz) {
            return super.mo2479a_(z);
        }
        return super.m3329a(z, this.f3159e);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
