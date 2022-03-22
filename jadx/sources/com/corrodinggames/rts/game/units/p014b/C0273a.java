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
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class C0273a extends AbstractC0274b {

    /* renamed from: a */
    static C0748e f1682a = null;

    /* renamed from: b */
    static C0748e f1683b = null;

    /* renamed from: c */
    static C0748e f1684c = null;

    /* renamed from: d */
    static C0748e f1685d = null;

    /* renamed from: e */
    static C0748e[] f1686e = new C0748e[10];

    /* renamed from: g */
    Rect f1688g = new Rect();

    /* renamed from: f */
    float f1687f = 0.18f;

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.airShip;
    }

    /* renamed from: c */
    public static void m3229c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1683b = u.f5514bw.mo194a(C0063R.drawable.ship);
        f1684c = u.f5514bw.mo194a(C0063R.drawable.ship_shadow);
        f1682a = u.f5514bw.mo194a(C0063R.drawable.ship_dead);
        f1686e = AbstractC0171m.m3501a(f1683b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1682a;
        }
        return f1686e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f1684c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f1685d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f1682a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0273a(boolean z) {
        super(z);
        m2038S(24);
        m2037T(22);
        this.f1474bO = 11.0f;
        this.f1475bP = this.f1474bO + 0.0f;
        this.f1485bZ = 250.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1683b;
        this.f3388E = f1684c;
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
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, 20.0f, 0.3f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f962U = 30.0f;
        a.f927l = afVar;
        a.f923h = 75.0f;
        a.f935t = 6.0f;
        a.f939x = 2.0f;
        a.f940y = 4.0f;
        a.f985ar = Color.m4213a(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        AbstractC0789l u = AbstractC0789l.m638u();
        C0573e a2 = u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        if (a2 != null) {
            a2.f3894ap = 10;
        }
        u.f5512bu.m2114a(C0530e.f3586x, 0.14f, 1.0f + C0654f.m1458c(-0.1f, 0.1f), E.f224a, E.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 170.0f;
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
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bh */
    public boolean mo2204bh() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.16f;
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
    /* renamed from: ae */
    public boolean mo2248ae() {
        return false;
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
}
