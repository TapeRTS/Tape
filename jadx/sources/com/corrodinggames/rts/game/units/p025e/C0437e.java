package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class C0437e extends AbstractC0440h {

    /* renamed from: b */
    static C0748e f3150b = null;

    /* renamed from: c */
    static C0748e f3151c = null;

    /* renamed from: d */
    static C0748e f3152d = null;

    /* renamed from: e */
    static C0748e[] f3153e = new C0748e[10];

    /* renamed from: a */
    float f3149a = 0.0f;

    /* renamed from: f */
    Rect f3154f = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.heavyHoverTank;
    }

    /* renamed from: c */
    public static void m2517c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3151c = u.f5514bw.mo194a(C0063R.drawable.heavy_hover_tank);
        f3150b = u.f5514bw.mo194a(C0063R.drawable.heavy_hover_tank_dead);
        f3152d = u.f5514bw.mo194a(C0063R.drawable.heavy_hover_tank_shadow);
        f3153e = AbstractC0171m.m3501a(f3151c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3150b;
        }
        return f3153e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3152d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3150b;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.normal);
        return true;
    }

    public C0437e(boolean z) {
        super(z);
        m2038S(24);
        m2037T(36);
        this.f1474bO = 11.0f;
        this.f1475bP = this.f1474bO + 2.0f;
        this.f1485bZ = 450.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3151c;
        this.f3388E = f3152d;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0440h, com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz && m3321bG()) {
            this.f3149a += 3.0f * f;
            if (this.f3149a > 360.0f) {
                this.f3149a -= 360.0f;
            }
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, 4.0f + (C0654f.m1425h(this.f3149a) * 1.5f), 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        a.f962U = mo2141q(i);
        a.f927l = afVar;
        a.f923h = 95.0f;
        a.f935t = 1.0f;
        a.f933r = 7.0f;
        a.f934s = 0.2f;
        a.f957P = (short) 7;
        a.f939x = 1.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0573e a2 = u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -56798);
        if (a2 != null) {
            a2.f3858F = 0.7f;
            a2.f3875W = 30.0f;
            a2.f3876X = a2.f3875W;
            C0571c.m2003a(a2, this);
        }
        u.f5517bz.m2001a(a, -1179648);
        u.f5512bu.m2115a(C0530e.f3587y, 0.3f, E.f224a, E.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: i */
    public void mo2167i(float f) {
        this.f1471bL += f;
        if (this.f1471bL > 180.0f) {
            this.f1471bL -= 360.0f;
        }
        if (this.f1471bL < -180.0f) {
            this.f1471bL += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 2.4f;
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
    /* renamed from: f */
    public float mo2511f(boolean z) {
        return this.f1499cn[0].f1561a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
