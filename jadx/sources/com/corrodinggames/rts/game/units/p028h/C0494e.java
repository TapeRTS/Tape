package com.corrodinggames.rts.game.units.p028h;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class C0494e extends AbstractC0497f {

    /* renamed from: a */
    boolean f3353a = false;

    /* renamed from: b */
    boolean f3354b = true;

    /* renamed from: c */
    float f3355c = 0.0f;

    /* renamed from: d */
    static C0748e f3356d = null;

    /* renamed from: e */
    static C0748e f3357e = null;

    /* renamed from: f */
    static C0748e f3358f = null;

    /* renamed from: g */
    public static C0748e f3359g = null;

    /* renamed from: h */
    public static C0748e[] f3360h = new C0748e[10];

    /* renamed from: i */
    static C0748e[] f3361i = new C0748e[10];

    /* renamed from: j */
    public static final AbstractC0197s f3362j = new AbstractC0202x(151) { // from class: com.corrodinggames.rts.game.units.h.e.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return "Surface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return !((C0494e) afVar).f3353a;
        }
    };

    /* renamed from: k */
    public static final AbstractC0197s f3363k = new AbstractC0202x(152) { // from class: com.corrodinggames.rts.game.units.h.e.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            return ((C0494e) afVar).f3353a;
        }
    };

    /* renamed from: l */
    static ArrayList f3364l = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f3353a);
        apVar.mo1096a(this.f3355c);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f3353a = kVar.m1063e();
        this.f3354b = !mo2363P();
        if (kVar.m1071b() >= 21) {
            this.f3355c = kVar.m1061g();
        }
        m2391K();
        super.mo399a(kVar);
    }

    static {
        f3364l.add(f3362j);
        f3364l.add(f3363k);
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3360h[this.f1461bB.m3518M()];
    }

    /* renamed from: b */
    public static void m2388b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3357e = u.f5514bw.mo194a(C0063R.drawable.attack_submarine);
        f3358f = m3330a(f3357e, f3357e.mo349l(), f3357e.mo350k());
        f3356d = u.f5514bw.mo194a(C0063R.drawable.attack_submarine_dead);
        f3359g = u.f5514bw.mo194a(C0063R.drawable.unit_icon_water);
        f3360h = AbstractC0171m.m3501a(f3359g);
        f3361i = AbstractC0171m.m3501a(f3357e);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ >= 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3356d;
        }
        return f3361i[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3358f;
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.WATER;
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.attackSubmarine;
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f
    /* renamed from: f */
    public boolean mo2383f() {
        if (!mo2363P()) {
            return true;
        }
        return false;
    }

    public C0494e(boolean z) {
        super(z);
        m2035b(f3357e);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO - 2.0f;
        this.f1485bZ = 260.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3357e;
    }

    /* renamed from: K */
    public void m2391K() {
        if (!this.f3354b) {
            m406R(1);
        } else {
            m406R(2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        float f2;
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (this.f3353a) {
                f2 = 1.0f;
            } else {
                f2 = -8.0f;
            }
            if (C0654f.m1459c(this.f5844dJ - f2) > 2.0f) {
                this.f3355c = C0654f.m1521a(this.f3355c, 0.08f, 0.003f * f);
            } else {
                this.f3355c = C0654f.m1521a(this.f3355c, 0.02f, 0.003f * f);
            }
            this.f5844dJ = C0654f.m1521a(this.f5844dJ, f2, this.f3355c * f);
            boolean z = false;
            if (this.f3354b && mo2363P()) {
                this.f3354b = false;
                m2391K();
                z = true;
            }
            if (!this.f3354b && !mo2363P()) {
                this.f3354b = true;
                m2391K();
                z = true;
            }
            if (z) {
                u.f5517bz.m2007a(this.f5842dH, this.f5843dI, 0.0f, 0, 0.0f, 0.0f, this.f1471bL);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        if (!mo2363P()) {
            return 250.0f;
        }
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        if (!mo2363P()) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.018f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: P */
    public boolean mo2363P() {
        return this.f5844dJ < -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: af */
    public boolean mo2247af() {
        if (!mo2363P()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ac */
    public boolean mo2250ac() {
        if (!mo2363P()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        if (!mo2363P()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ae */
    public boolean mo2248ae() {
        if (!mo2363P()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: q */
    public float mo2141q(int i) {
        return 42.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        if (!mo2363P()) {
            PointF E = mo2345E(i);
            C0163f a = C0163f.m3573a(this, E.f224a, E.f225b, this.f5844dJ, i);
            PointF J = mo2336J(i);
            a.f952K = J.f224a;
            a.f953L = J.f225b;
            a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a.f962U = 42.0f;
            a.f927l = afVar;
            a.f923h = 190.0f;
            a.f935t = 2.0f;
            a.f1001aH = true;
            a.f1006aM = true;
            a.f1010aQ = true;
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5512bu.m2115a(C0530e.f3574l, 0.8f, this.f5842dH, this.f5843dI);
            u.f5517bz.m2009a(this.f5842dH, this.f5843dI, this.f5844dJ, -1118720);
            return;
        }
        PointF E2 = mo2345E(i);
        C0163f a2 = C0163f.m3573a(this, E2.f224a, E2.f225b, this.f5844dJ, i);
        PointF J2 = mo2336J(i);
        a2.f952K = J2.f224a;
        a2.f953L = J2.f225b;
        a2.f985ar = Color.m4213a(255, 30, 30, 150);
        a2.f939x = 1.0f;
        a2.f962U = 42.0f;
        a2.f927l = afVar;
        a2.f923h = 250.0f;
        a2.f935t = 1.3f;
        a2.f1001aH = false;
        a2.f1006aM = true;
        a2.f1010aQ = true;
        AbstractC0789l.m638u();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3356d;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
        if (sVar == f3362j) {
            this.f3353a = true;
        }
        if (sVar == f3363k) {
            this.f3353a = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3364l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }
}
