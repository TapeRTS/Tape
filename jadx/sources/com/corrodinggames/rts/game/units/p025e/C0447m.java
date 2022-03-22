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
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class C0447m extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3203a = null;

    /* renamed from: b */
    static C0748e f3204b = null;

    /* renamed from: c */
    static C0748e f3205c = null;

    /* renamed from: d */
    static C0748e[] f3206d = new C0748e[10];

    /* renamed from: e */
    Rect f3207e = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.megaTank;
    }

    /* renamed from: c */
    public static void m2480c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3204b = u.f5514bw.mo194a(C0063R.drawable.mega_tank);
        f3203a = u.f5514bw.mo194a(C0063R.drawable.mega_tank_dead);
        f3205c = u.f5514bw.mo194a(C0063R.drawable.mega_tank_turret);
        f3206d = AbstractC0171m.m3501a(f3204b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3203a;
        }
        return f3206d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3205c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3203a;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3576n, 0.8f, this.f5842dH, this.f5843dI);
        mo2200bl();
        return true;
    }

    public C0447m(boolean z) {
        super(z);
        m2038S(20);
        m2037T(25);
        this.f1474bO = 12.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 550.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3204b;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        if (!afVar.mo2357i()) {
            PointF E = mo2345E(i);
            C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
            a.f985ar = Color.m4213a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            a.f962U = 50.0f;
            a.f927l = afVar;
            a.f923h = 60.0f;
            a.f935t = 3.0f;
            a.f939x = 2.0f;
            a.f1010aQ = true;
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
            u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
            u.f5512bu.m2115a(C0530e.f3582t, 0.3f, this.f5842dH, this.f5843dI);
            return;
        }
        C0163f a2 = C0163f.m3575a(this, this.f5842dH, this.f5843dI);
        a2.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a2.f962U = 40.0f;
        a2.f927l = afVar;
        a2.f923h = 190.0f;
        a2.f935t = 4.0f;
        a2.f1001aH = true;
        a2.f1002aI = 10.0f;
        a2.f1003aJ = 15.0f;
        a2.f1006aM = true;
        a2.f1010aQ = true;
        AbstractC0789l.m638u().f5512bu.m2115a(C0530e.f3574l, 0.2f, this.f5842dH, this.f5843dI);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 140.0f;
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
    /* renamed from: A */
    public float mo2354A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 2.0f;
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
        return 12.0f;
    }
}
