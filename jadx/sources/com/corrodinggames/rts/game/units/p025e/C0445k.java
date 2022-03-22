package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class C0445k extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3188a = null;

    /* renamed from: b */
    static C0748e f3189b = null;

    /* renamed from: c */
    static C0748e f3190c = null;

    /* renamed from: d */
    static C0748e f3191d = null;

    /* renamed from: e */
    static C0748e[] f3192e = new C0748e[10];

    /* renamed from: f */
    static C0748e f3193f = null;

    /* renamed from: g */
    Rect f3194g = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.laserTank;
    }

    /* renamed from: c */
    public static void m2484c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3189b = u.f5514bw.mo194a(C0063R.drawable.laser_tank_base);
        f3188a = u.f5514bw.mo194a(C0063R.drawable.laser_tank_dead);
        f3190c = u.f5514bw.mo194a(C0063R.drawable.laser_tank_turrent);
        f3191d = u.f5514bw.mo194a(C0063R.drawable.laser_tank_charge);
        f3192e = AbstractC0171m.m3501a(f3189b);
        f3193f = m3330a(f3189b, f3189b.mo349l(), f3189b.mo350k());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3188a;
        }
        return f3192e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3193f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && !this.f1459bz;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3190c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3188a;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.small);
        return true;
    }

    public C0445k(boolean z) {
        super(z);
        m2036a(f3189b, 1);
        this.f1474bO = 14.0f;
        this.f1475bP = this.f1474bO + 2.0f;
        this.f1485bZ = 300.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3189b;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        a.f962U = mo2141q(i);
        a.f927l = afVar;
        a.f923h = 8.0f;
        a.f943B = true;
        a.f942A = true;
        a.f1010aQ = true;
        a.f985ar = Color.m4213a(80, 255, 0, 0);
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        u.f5512bu.m2115a(C0530e.f3586x, 0.3f, E.f224a, E.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bI */
    public float mo2486bI() {
        if (this.f1499cn[0].f1565e > 0.0f) {
            return 1.0f - (this.f1499cn[0].f1565e / mo2222b(0));
        }
        if (this.f1499cn[0].f1566f != 0.0f) {
            return this.f1499cn[0].f1566f / mo2180e(0);
        }
        return super.mo2486bI();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bJ */
    public boolean mo2485bJ() {
        return this.f1499cn[0].f1565e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        C0851y.m420a((AbstractC0515r) this);
        if (this.f1459bz) {
            return true;
        }
        float e = this.f1499cn[0].f1566f / mo2180e(0);
        if (e == 0.0f) {
            return true;
        }
        PointF E = mo2345E(0);
        u.f5514bw.mo127h();
        u.f5514bw.mo147b(E.f224a - u.f5547cd, E.f225b - u.f5548ce);
        u.f5514bw.mo200a(e, e);
        u.f5514bw.mo175a(f3191d, 0.0f, 0.0f, (Paint) null);
        u.f5514bw.mo126i();
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
        return 0.12f;
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
        return 19.0f;
    }
}
