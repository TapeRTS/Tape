package com.corrodinggames.rts.game.units.p025e;

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

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class C0448n extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3208a = null;

    /* renamed from: b */
    static C0748e f3209b = null;

    /* renamed from: c */
    static C0748e f3210c = null;

    /* renamed from: d */
    static C0748e f3211d = null;

    /* renamed from: e */
    static C0748e[] f3212e = new C0748e[10];

    /* renamed from: f */
    int f3213f;

    /* renamed from: g */
    float f3214g;

    /* renamed from: h */
    float f3215h;

    /* renamed from: i */
    Rect f3216i = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.tank;
    }

    /* renamed from: c */
    public static void m2477c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3209b = u.f5514bw.mo194a(C0063R.drawable.tank2);
        f3208a = u.f5514bw.mo194a(C0063R.drawable.tank2_dead);
        f3210c = u.f5514bw.mo194a(C0063R.drawable.tank2_turret);
        f3211d = u.f5514bw.mo194a(C0063R.drawable.tank2_shadow);
        f3212e = AbstractC0171m.m3501a(f3209b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3208a;
        }
        return f3212e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3211d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && !this.f1459bz;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3210c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        this.f3387D = f3208a;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.small);
        return true;
    }

    public C0448n(boolean z) {
        super(z);
        m2036a(f3209b, 3);
        this.f1474bO = 11.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 210.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3209b;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz && this.f1470bK != 0.0f) {
            this.f3214g += f;
            if (this.f3214g > 1.0f) {
                this.f3214g = 0.0f;
                this.f3213f++;
                if (this.f3213f > 2) {
                    this.f3213f = 0;
                }
            }
            if (this.f1470bK > 0.0f && this.f5839dE) {
                this.f3215h += f;
                if (this.f3215h > 9.0f) {
                    this.f3215h = 0.0f;
                    m2476f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m2476f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            u.f5517bz.m1986c(this.f5842dH + (C0654f.m1421i(this.f1471bL + 180.0f + f) * this.f1474bO), this.f5843dI + (C0654f.m1425h(this.f1471bL + 180.0f + f) * this.f1474bO), this.f5844dJ, this.f1471bL + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f962U = 30.0f;
        a.f927l = afVar;
        a.f923h = 60.0f;
        a.f935t = 3.0f;
        a.f957P = (short) 1;
        a.f939x = 1.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        u.f5512bu.m2114a(C0530e.f3578p, 0.3f, 1.0f + C0654f.m1458c(-0.07f, 0.07f), E.f224a, E.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        C0851y.m420a((AbstractC0515r) this);
        if (!this.f1459bz) {
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.17f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 20.0f;
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
        return super.m3329a(z, this.f3213f);
    }
}
