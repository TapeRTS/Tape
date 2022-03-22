package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
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
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class C0282f extends AbstractC0274b {

    /* renamed from: a */
    static C0748e f1735a = null;

    /* renamed from: b */
    static C0748e f1736b = null;

    /* renamed from: c */
    static C0748e f1737c = null;

    /* renamed from: d */
    static C0748e f1738d = null;

    /* renamed from: e */
    static C0748e f1739e = null;

    /* renamed from: f */
    static C0748e[] f1740f = new C0748e[10];

    /* renamed from: g */
    boolean f1741g = false;

    /* renamed from: p */
    float f1743p = 0.0f;

    /* renamed from: r */
    Rect f1745r = new Rect();

    /* renamed from: s */
    Rect f1746s = new Rect();

    /* renamed from: o */
    float f1742o = 0.14f;

    /* renamed from: q */
    float f1744q = 0.0f;

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f1743p);
        apVar.mo1096a(this.f1742o);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0274b, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1071b() >= 9) {
            this.f1743p = kVar.m1061g();
            this.f1742o = kVar.m1061g();
            if (kVar.m1071b() == 8) {
                this.f1741g = kVar.m1063e();
            }
        } else {
            this.f1742o = 0.5f;
        }
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.helicopter;
    }

    /* renamed from: c */
    public static void m3211c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1736b = u.f5514bw.mo194a(C0063R.drawable.helicopter);
        f1737c = u.f5514bw.mo194a(C0063R.drawable.helicopter_blades);
        f1738d = u.f5514bw.mo194a(C0063R.drawable.helicopter_shadow);
        f1739e = u.f5514bw.mo194a(C0063R.drawable.helicopter_shadow_blades);
        f1735a = u.f5514bw.mo194a(C0063R.drawable.helicopter_dead);
        f1740f = AbstractC0171m.m3501a(f1736b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1735a;
        }
        return f1740f[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f1738d;
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
        this.f3387D = f1735a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0282f(boolean z) {
        super(z);
        m2038S(26);
        m2037T(46);
        this.f1474bO = 13.0f;
        this.f1475bP = this.f1474bO + 2.0f;
        this.f1485bZ = 150.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1736b;
        this.f3388E = f1738d;
        this.f5844dJ = 0.0f;
        m406R(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: n */
    public void mo2536n() {
        super.mo2536n();
        this.f5844dJ = 20.0f;
        this.f1742o = 0.5f;
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
            this.f1742o = C0654f.m1521a(this.f1742o, 0.5f, 0.003f * f);
            this.f1744q += 70.0f * this.f1742o * f;
            if (this.f1744q >= 360.0f) {
                this.f1744q -= 360.0f;
                this.f1744q += C0654f.m1500a(this, 0, 4);
            }
            if (this.f1742o > 0.4f) {
                this.f1743p += 2.0f * f;
                if (this.f1743p > 360.0f) {
                    this.f1743p -= 360.0f;
                }
                this.f5844dJ = C0654f.m1521a(this.f5844dJ, 20.0f + (C0654f.m1425h(this.f1743p) * 1.5f), 0.1f * f);
            }
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
        a.f962U = 17.0f;
        a.f927l = afVar;
        a.f923h = 30.0f;
        a.f935t = 8.0f;
        a.f960S = false;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        a.f942A = true;
        a.f1011aR = false;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5512bu.m2114a(C0530e.f3580r, 0.2f, 1.0f + C0654f.m1458c(-0.08f, 0.08f), E.f224a, E.f225b);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        if (this.f5844dJ < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: aX */
    public float mo2256aX() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 6.0f;
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
    /* renamed from: be */
    public boolean mo2207be() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        return super.mo2479a_(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        if (this.f1459bz) {
            return true;
        }
        Paint aK = mo2269aK();
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f1746s.m4136a(0, 0, f1737c.mo349l(), f1737c.mo350k());
        float f2 = this.f1744q;
        if (this.f1478bS) {
        }
        u.f5514bw.mo173a(f1737c, this.f1746s, this.f5842dH - AbstractC0789l.m638u().f5547cd, (this.f5843dI - AbstractC0789l.m638u().f5548ce) - this.f5844dJ, f2, aK);
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
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 7.0f;
    }
}
