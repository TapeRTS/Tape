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
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/c.class */
public class C0492c extends AbstractC0497f {

    /* renamed from: a */
    static C0748e f3343a = null;

    /* renamed from: b */
    static C0748e f3344b = null;

    /* renamed from: c */
    static C0748e[] f3345c = new C0748e[10];

    /* renamed from: d */
    Rect f3346d = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.gunBoat;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 1500.0f;
    }

    /* renamed from: c */
    public static void m2394c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3344b = u.f5514bw.mo194a(C0063R.drawable.gun_boat);
        f3343a = u.f5514bw.mo194a(C0063R.drawable.gun_boat_dead);
        f3345c = AbstractC0171m.m3501a(f3344b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3343a;
        }
        return f3345c[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
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
        this.f3387D = f3343a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0492c(boolean z) {
        super(z);
        m2038S(15);
        m2037T(27);
        this.f1474bO = 12.0f;
        this.f1475bP = this.f1474bO - 2.0f;
        this.f1485bZ = 170.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3344b;
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f5844dJ = this.f5844dJ;
        a.f962U = mo2141q(i);
        a.f927l = afVar;
        a.f923h = 30.0f;
        a.f935t = 8.0f;
        a.f960S = false;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5512bu.m2115a(C0530e.f3580r, 0.2f, E.f224a, E.f225b);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 120.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 2.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.2f;
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
        return false;
    }
}
