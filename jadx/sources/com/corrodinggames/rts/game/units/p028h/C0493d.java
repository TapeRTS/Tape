package com.corrodinggames.rts.game.units.p028h;

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
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class C0493d extends AbstractC0497f {

    /* renamed from: a */
    static C0748e f3347a = null;

    /* renamed from: b */
    static C0748e f3348b = null;

    /* renamed from: c */
    static C0748e f3349c = null;

    /* renamed from: d */
    static C0748e[] f3350d = new C0748e[10];

    /* renamed from: e */
    static PointF f3351e = new PointF();

    /* renamed from: f */
    Rect f3352f = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.missileShip;
    }

    /* renamed from: c */
    public static void m2392c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3348b = u.f5514bw.mo194a(C0063R.drawable.scout_ship);
        f3347a = u.f5514bw.mo194a(C0063R.drawable.scout_ship_dead);
        f3349c = m3330a(f3348b, f3348b.mo349l(), f3348b.mo350k());
        f3350d = AbstractC0171m.m3501a(f3348b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3347a;
        }
        return f3350d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3349c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ > -2.0f;
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
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3347a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0493d(boolean z) {
        super(z);
        m2038S(17);
        m2037T(31);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO - 2.0f;
        this.f1485bZ = 350.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3348b;
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        float f = this.f1471bL;
        f3351e.m4141a(this.f5842dH + (C0654f.m1421i(f) * 6.0f), this.f5843dI + (C0654f.m1425h(f) * 6.0f));
        return f3351e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        AbstractC0789l u = AbstractC0789l.m638u();
        PointF E = mo2345E(i);
        if (!afVar.mo2363P()) {
            C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
            PointF J = mo2336J(i);
            a.f952K = J.f224a;
            a.f953L = J.f225b;
            a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a.f962U = 62.0f;
            a.f927l = afVar;
            a.f923h = 190.0f;
            a.f935t = 2.0f;
            a.f1001aH = true;
            a.f1006aM = true;
            a.f1010aQ = true;
            u.f5512bu.m2115a(C0530e.f3574l, 0.8f, this.f5842dH, this.f5843dI);
            u.f5517bz.m2009a(this.f5842dH, this.f5843dI, this.f5844dJ, -1118720);
            u.f5517bz.m2001a(a, -1118720);
            return;
        }
        C0163f a2 = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ - 1.0f, i);
        a2.f985ar = Color.m4213a(255, 0, 0, 150);
        a2.f939x = 1.0f;
        a2.f962U = 42.0f;
        a2.f927l = afVar;
        a2.f923h = 220.0f;
        a2.f935t = 1.9f;
        a2.f1006aM = true;
        a2.f1010aQ = true;
        u.f5512bu.m2115a(C0530e.f3574l, 0.8f, this.f5842dH, this.f5843dI);
        u.f5517bz.m2009a(this.f5842dH, this.f5843dI, this.f5844dJ, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 1.2f;
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
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
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
        return super.mo396c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ac */
    public boolean mo2250ac() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
