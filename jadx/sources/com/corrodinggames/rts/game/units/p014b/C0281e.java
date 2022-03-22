package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class C0281e extends AbstractC0274b {

    /* renamed from: a */
    static C0748e f1728a = null;

    /* renamed from: b */
    static C0748e f1729b = null;

    /* renamed from: c */
    static C0748e f1730c = null;

    /* renamed from: d */
    static C0748e f1731d = null;

    /* renamed from: e */
    static C0748e[] f1732e = new C0748e[10];

    /* renamed from: f */
    float f1733f = 0.0f;

    /* renamed from: g */
    Rect f1734g = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.gunShip;
    }

    /* renamed from: c */
    public static void m3213c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1729b = u.f5514bw.mo194a(C0063R.drawable.gunship);
        f1730c = u.f5514bw.mo194a(C0063R.drawable.gunship_shadow);
        f1728a = u.f5514bw.mo194a(C0063R.drawable.gunship_dead);
        f1732e = AbstractC0171m.m3501a(f1729b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1728a;
        }
        return f1732e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f1730c;
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
        this.f3387D = f1728a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0281e(boolean z) {
        super(z);
        m2038S(25);
        m2037T(35);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO + 0.0f;
        this.f1485bZ = 260.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1729b;
        this.f3388E = f1730c;
        this.f5844dJ = 0.0f;
        m406R(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public boolean mo2338I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            this.f1733f += 2.0f * f;
            if (this.f1733f > 360.0f) {
                this.f1733f -= 360.0f;
            }
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, 20.0f + (C0654f.m1425h(this.f1733f) * 1.5f), 0.1f * f);
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
    /* renamed from: q */
    public float mo2141q(int i) {
        return 35.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f985ar = Color.m4213a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        a.f962U = mo2141q(i);
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
        if (this.f5844dJ < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bd */
    public boolean mo2208bd() {
        return true;
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
        return 0.2f;
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
    /* renamed from: ad */
    public boolean mo2249ad() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 15.0f;
    }
}
