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
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class C0446l extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3195a = null;

    /* renamed from: b */
    static C0748e f3196b = null;

    /* renamed from: c */
    static C0748e[] f3197c = new C0748e[10];

    /* renamed from: d */
    static C0748e f3198d = null;

    /* renamed from: e */
    public static C0748e f3199e = null;

    /* renamed from: f */
    int f3200f;

    /* renamed from: g */
    float f3201g;

    /* renamed from: h */
    Rect f3202h = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.mammothTank;
    }

    /* renamed from: c */
    public static void m2482c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0748e a = u.f5514bw.mo194a(C0063R.drawable.mammoth_tank);
        f3197c = AbstractC0171m.m3501a(a);
        f3195a = u.f5514bw.mo194a(C0063R.drawable.mammoth_tank_dead);
        f3196b = u.f5514bw.mo194a(C0063R.drawable.mammoth_tank_turret);
        f3199e = u.f5514bw.mo194a(C0063R.drawable.lighting_charge);
        f3198d = m3330a(a, a.mo349l() / 2, a.mo350k());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3195a;
        }
        return f3197c[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3198d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3196b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ > -2.0f && !this.f1459bz;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3195a;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.largeUnit);
        return true;
    }

    public C0446l(boolean z) {
        super(z);
        m2036a(f3197c[7], 2);
        this.f1474bO = 21.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 2900.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3197c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (this.f1498cm) {
            this.f3201g += f;
            if (this.f3201g > 3.0f) {
                this.f3201g = 0.0f;
                this.f3200f = 1 - this.f3200f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        a.f985ar = Color.m4213a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        a.f962U = 260.0f;
        a.f927l = afVar;
        a.f923h = 20.0f;
        a.f935t = 4.0f;
        a.f939x = 2.0f;
        a.f1010aQ = true;
        a.f942A = true;
        a.f954M = true;
        a.f976ai = 0.5f;
        a.f978ak = 1.0f;
        a.f979al = 0.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1118482);
        u.f5512bu.m2115a(C0530e.f3585w, 0.2f, this.f5842dH, this.f5843dI);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aX */
    public float mo2256aX() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        if (!this.f1459bz || z) {
            return super.m3329a(z, this.f3200f);
        }
        return super.mo2479a_(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        C0851y.m420a((AbstractC0515r) this);
        C0851y.m418a(this, f3199e, this.f1499cn[0].f1566f / mo2180e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 60.0f;
    }
}
