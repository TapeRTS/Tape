package com.corrodinggames.rts.game.units.p023d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.C0190l;
import com.corrodinggames.rts.game.units.p013a.C0193o;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public class C0404d extends AbstractC0413h {

    /* renamed from: a */
    static C0748e f2971a = null;

    /* renamed from: b */
    static C0748e[] f2972b = new C0748e[10];

    /* renamed from: c */
    static C0748e f2973c = null;

    /* renamed from: d */
    static C0748e f2974d = null;

    /* renamed from: e */
    float f2975e;

    /* renamed from: f */
    public float f2976f;

    /* renamed from: g */
    public float f2977g;

    /* renamed from: h */
    public int f2978h;

    /* renamed from: i */
    public float f2979i;

    /* renamed from: j */
    public float f2980j;

    /* renamed from: k */
    float f2981k = 20.0f;

    /* renamed from: l */
    int f2982l = 0;

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f2975e);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f2975e = kVar.m1061g();
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public static void m2639b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2971a = u.f5514bw.mo194a(C0063R.drawable.base);
        f2973c = u.f5514bw.mo194a(C0063R.drawable.base_dead);
        f2974d = u.f5514bw.mo194a(C0063R.drawable.base_back);
        f2972b = AbstractC0171m.m3501a(f2971a);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f3387D = f2973c;
        this.f2964m = null;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.large);
        float f = this.f5842dH;
        float f2 = this.f5843dI;
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e a = u.f5517bz.m2009a(f, f2, this.f5844dJ, Color.m4213a(255, 255, 255, 255));
        if (a != null) {
            a.f3860H = 8.0f;
            a.f3859G = 5.0f;
            a.f3858F = 0.9f;
            a.f3875W = 20.0f;
            a.f3876X = a.f3875W;
            a.f3845s = true;
        }
        u.f5517bz.m1988b(EnumC0576h.critical);
        C0573e c = u.f5517bz.m1985c(f, f2, 0.0f, -1127220);
        if (c != null) {
            c.f3860H = 0.2f;
            c.f3859G = 2.0f;
            c.f3895aq = (short) 2;
            c.f3875W = 45.0f;
            c.f3876X = c.f3875W;
            c.f3874V = 0.0f;
        }
        u.f5517bz.m2013a(this.f5842dH, this.f5843dI, this.f5844dJ, 40.0f, 70.0f);
        C0574f.m1973a(this.f5842dH, this.f5843dI);
        C0574f.m1969b(this.f5842dH, this.f5843dI).f3902a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: Q */
    public void mo2332Q() {
        super.mo2332Q();
        if (this.f1459bz) {
            this.f2964m = null;
        } else {
            this.f2964m = f2974d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f2973c;
        }
        return f2972b[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0404d(boolean z) {
        super(z);
        this.f3387D = f2971a;
        this.f2964m = f2974d;
        m2038S(53);
        m2037T(68);
        this.f1474bO = 30.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 4000.0f;
        this.f1484bY = this.f1485bZ;
        m406R(3);
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4136a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cp */
    public RectF mo2637cp() {
        RectF cp = super.mo2637cp();
        cp.m4123a(6.0f, 0.0f);
        return cp;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        AbstractC0789l.m638u();
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f2981k = C0654f.m1522a(this.f2981k, f);
            if (this.f2981k == 0.0f) {
                this.f2981k = 5.0f;
                this.f2982l++;
                if (this.f2982l > 6) {
                    this.f2982l = 0;
                    this.f2981k = 70.0f;
                }
                if (this.f2982l <= 3) {
                    this.f2970s = this.f2982l;
                } else {
                    this.f2970s = 6 - this.f2982l;
                }
            }
            this.f2976f += f;
            this.f2978h++;
            this.f2979i += 10.0f;
            if (this.f2980j > f) {
                this.f2980j = f;
            }
            this.f2977g += f;
            this.f2975e += f;
            if (this.f2975e > 39.9f) {
                this.f2975e -= 40.0f;
                this.f1461bB.m3452f((int) mo2623ci());
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ci */
    public float mo2623ci() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        C0163f a = C0163f.m3575a(this, this.f5842dH, this.f5843dI);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a.f962U = mo2141q(i);
        a.f927l = afVar;
        a.f923h = 180.0f;
        a.f935t = 2.0f;
        a.f933r = 5.0f;
        a.f1001aH = true;
        a.f1006aM = true;
        a.f1010aQ = true;
        a.f1000aG = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2001a(a, -1118720);
        u.f5512bu.m2115a(C0530e.f3574l, 0.8f, this.f5842dH, this.f5843dI);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public boolean mo2221b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    /* renamed from: a */
    public static void m2640a(ArrayList arrayList, int i) {
        arrayList.add(new C0193o());
        arrayList.add(new C0190l(EnumC0215ak.builder, 1));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return mo1606r().mo2798a(mo2329T());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo2362a(afVar, f, fVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bx */
    public boolean mo2554bx() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: s */
    public int mo2139s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: bk */
    public int mo2201bk() {
        return 35;
    }
}
