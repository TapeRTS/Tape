package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p023d.AbstractC0413h;
import com.corrodinggames.rts.game.units.p023d.C0414i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class C0389b extends AbstractC0413h {

    /* renamed from: j */
    boolean f2915j;

    /* renamed from: k */
    int f2916k;

    /* renamed from: dq */
    float f2917dq;

    /* renamed from: dr */
    float f2918dr;

    /* renamed from: ds */
    boolean f2919ds;

    /* renamed from: g */
    static C0748e f2920g = null;

    /* renamed from: a */
    private static C0748e f2921a = null;

    /* renamed from: b */
    private static C0748e f2922b = null;

    /* renamed from: c */
    private static C0748e f2923c = null;

    /* renamed from: d */
    private static C0748e f2924d = null;

    /* renamed from: e */
    private static C0748e f2925e = null;

    /* renamed from: h */
    static C0748e[] f2926h = new C0748e[10];

    /* renamed from: i */
    static C0748e f2927i = null;

    /* renamed from: t */
    static String f2928t = "gun";

    /* renamed from: u */
    static String f2929u = "gunT2";

    /* renamed from: v */
    static String f2930v = "gunT3";

    /* renamed from: w */
    static String f2931w = "artillery";

    /* renamed from: x */
    static String f2932x = "flamethrower";

    /* renamed from: C */
    static String f2933C = "aa_t1";

    /* renamed from: dl */
    static String f2934dl = "aa_t2";

    /* renamed from: dm */
    static String f2935dm = "aa_flak";

    /* renamed from: dn */
    static C0748e f2936dn = null;

    /* renamed from: do */
    static C0748e[] f2937do = new C0748e[10];

    /* renamed from: du */
    public static AbstractC0197s f2938du = new C03901(101);

    /* renamed from: dv */
    public static AbstractC0197s f2939dv = new C03912(104);

    /* renamed from: dw */
    public static AbstractC0197s f2940dw = new C03923(102);

    /* renamed from: dx */
    public static AbstractC0197s f2941dx = new C03934(103);

    /* renamed from: dy */
    static ArrayList f2942dy = new ArrayList();

    /* renamed from: l */
    AbstractC0394c f2943l = new C0399h(this);

    /* renamed from: dp */
    boolean f2944dp = true;

    /* renamed from: dt */
    Rect f2945dt = new Rect();

    /* renamed from: a */
    static /* synthetic */ PointF m2856a(C0389b bVar, int i) {
        return super.mo2485E(i);
    }

    /* renamed from: dj */
    static /* synthetic */ C0748e m2843dj() {
        return f2921a;
    }

    /* renamed from: dk */
    static /* synthetic */ C0748e m2842dk() {
        return f2922b;
    }

    /* renamed from: b */
    static /* synthetic */ PointF m2852b(C0389b bVar, int i) {
        return super.mo2485E(i);
    }

    /* renamed from: dl */
    static /* synthetic */ C0748e m2841dl() {
        return f2923c;
    }

    /* renamed from: c */
    static /* synthetic */ PointF m2848c(C0389b bVar, int i) {
        return super.mo2485E(i);
    }

    /* renamed from: dm */
    static /* synthetic */ C0748e m2840dm() {
        return f2924d;
    }

    /* renamed from: dn */
    static /* synthetic */ C0748e m2839dn() {
        return f2925e;
    }

    /* renamed from: a */
    static /* synthetic */ void m2857a(C0389b bVar) {
        bVar.m2391U();
    }

    /* renamed from: b */
    static /* synthetic */ void m2853b(C0389b bVar) {
        bVar.m2391U();
    }

    /* renamed from: c */
    static /* synthetic */ void m2849c(C0389b bVar) {
        bVar.m2391U();
    }

    /* renamed from: d */
    static /* synthetic */ void m2846d(C0389b bVar) {
        bVar.m2391U();
    }

    static {
        f2942dy.add(f2938du);
        f2942dy.add(f2939dv);
        f2942dy.add(f2940dw);
        f2942dy.add(f2941dx);
    }

    /* renamed from: L */
    public int m2859L() {
        return this.f2943l.mo2819b();
    }

    /* renamed from: G */
    public float mo2506G(int i) {
        return this.f2943l.mo2826h(i);
    }

    /* renamed from: a_ */
    public void mo3622a_(String str) {
        m2851b(str);
    }

    /* renamed from: b */
    public void m2851b(String str) {
        if (!this.f2943l.m2829a(str)) {
            AbstractC0394c cVar = this.f2943l;
            this.f2943l = m2847c(str);
            this.f2943l.mo2820a(cVar);
        }
    }

    /* renamed from: c */
    public AbstractC0394c m2847c(String str) {
        if (str.equals(f2928t)) {
            return new C0399h(this);
        }
        if (str.equals(f2929u)) {
            return new C0397f(this);
        }
        if (str.equals(f2930v)) {
            return new C0398g(this);
        }
        if (str.equals(f2931w)) {
            return new C0395d(this);
        }
        if (str.equals(f2932x)) {
            return new C0396e(this);
        }
        return null;
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.mo1104a(this.f2915j);
        apVar.mo1104a(this.f2916k == 1);
        apVar.m1174c(this.f2943l.mo2817c());
        apVar.mo1109a(this.f2916k);
        super.mo1654a(apVar);
    }

    /* renamed from: a */
    public void mo2031a(C0707k kVar) {
        boolean e = kVar.m1077e();
        if (e) {
            mo2603a(2);
        }
        if (kVar.m1085b() >= 27) {
            this.f2916k = kVar.m1077e() ? 1 : 0;
        }
        if (kVar.m1085b() >= 35) {
            String k = kVar.m1071k();
            if (!this.f2943l.m2829a(k)) {
                m2851b(k);
            }
            this.f2916k = kVar.m1076f();
        } else if (e && !(this instanceof C0387a)) {
            m2851b(f2929u);
        }
        super.mo2031a(kVar);
    }

    /* renamed from: v */
    public C0748e mo2419v() {
        if (this.f1441bB.f1230i == -1) {
            return null;
        }
        return f2937do[this.f1441bB.m3822M()];
    }

    /* renamed from: dh */
    public static void m2845dh() {
        AbstractC0789l u = AbstractC0789l.m651u();
        f2920g = u.f5477bw.mo194a(C0063R.drawable.turret_base);
        f2927i = u.f5477bw.mo194a(C0063R.drawable.turret_base_dead);
        f2921a = u.f5477bw.mo194a(C0063R.drawable.turret_top);
        f2922b = u.f5477bw.mo194a(C0063R.drawable.turret_top_l2);
        f2923c = u.f5477bw.mo194a(C0063R.drawable.turret_top_l3);
        f2924d = u.f5477bw.mo194a(C0063R.drawable.turret_top_artillery);
        f2925e = u.f5477bw.mo194a(C0063R.drawable.turret_top_flame);
        f2926h = AbstractC0171m.m3805a(f2920g);
        f2936dn = u.f5477bw.mo194a(C0063R.drawable.unit_icon_building_turrent);
        f2937do = AbstractC0171m.m3805a(f2936dn);
    }

    /* renamed from: K */
    public boolean mo2695K() {
        this.f3387D = f2927i;
        m406R(0);
        this.f1519by = false;
        m2351a(EnumC0519u.f3505d);
        return true;
    }

    /* renamed from: d */
    public C0748e mo2431d() {
        if (this.f1520bz) {
            return f2927i;
        }
        if (this.f1441bB == null) {
            return f2926h[f2926h.length - 1];
        }
        return f2926h[this.f1441bB.m3822M()];
    }

    /* renamed from: k */
    public C0748e mo2422k() {
        return null;
    }

    /* renamed from: d */
    public C0748e mo2430d(int i) {
        return this.f2943l.mo2816d(i);
    }

    public C0389b(boolean z) {
        super(z);
        m2101S(35);
        m2100T(42);
        this.f1447bO = 16.0f;
        this.f1448bP = this.f1447bO;
        this.f1451bZ = 700.0f;
        this.f1450bY = this.f1451bZ;
        this.f3387D = f2920g;
        this.f1462cn[0].f1561a = C0654f.m1553a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f2967n.m4469a(0, 0, 1, 1);
        this.f2968o.m4469a(0, 0, 1, 1);
    }

    /* renamed from: r */
    public void mo2864r(float f) {
        if (this.f1462cn[0].m3536a()) {
            if (this.f2944dp) {
                this.f2917dq = this.f1462cn[0].f1561a;
                this.f2944dp = false;
                this.f2918dr = C0654f.m1553a(this, 0, 120);
            }
            this.f2918dr += f;
            if (this.f2918dr > 450.0f) {
                this.f2918dr = C0654f.m1553a(this, 0, 30);
                this.f2919ds = !this.f2919ds;
            }
            if (this.f2918dr >= 120.0f) {
                return;
            }
            if (this.f2919ds) {
                m2384a(f * 0.3f, this.f2917dq - 20.0f, 0);
            } else {
                m2384a(f * 0.3f, this.f2917dq + 20.0f, 0);
            }
        } else {
            this.f2944dp = true;
        }
    }

    /* renamed from: a */
    public void mo1665a(float f) {
        super.mo1665a(f);
        if (m3613bG()) {
            this.f2943l.mo2823a(f);
        }
    }

    /* renamed from: a */
    public void mo2435a(AbstractC0210af afVar, int i) {
        this.f2943l.mo2821a(afVar, i);
    }

    /* renamed from: m */
    public float mo2420m() {
        return this.f2943l.mo2824a();
    }

    /* renamed from: b */
    public float mo2434b(int i) {
        return this.f2943l.mo2822a(i);
    }

    /* renamed from: c */
    public float mo2433c(int i) {
        return this.f2943l.mo2828e(i);
    }

    /* renamed from: w */
    public float mo2471w(int i) {
        return this.f2943l.mo2827f(i);
    }

    /* renamed from: b */
    public boolean mo2713b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo2025c(float f) {
        if (!super.mo2025c(f)) {
            return false;
        }
        if (this.f1520bz) {
            return true;
        }
        m2844di();
        return true;
    }

    /* renamed from: di */
    void m2844di() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0748e d = mo2430d(0);
        PointF F = mo2501F(0);
        u.f5477bw.mo176a(d, F.f224a - AbstractC0789l.m651u().f5508cd, F.f225b - AbstractC0789l.m651u().f5509ce, this.f1462cn[0].f1561a, mo2680f());
    }

    /* renamed from: c */
    public EnumC0215ak mo1660r() {
        return EnumC0215ak.f1589f;
    }

    /* renamed from: l */
    public boolean mo2421l() {
        return true;
    }

    /* renamed from: ad */
    public boolean mo2477ad() {
        return false;
    }

    /* renamed from: g */
    public float mo2425g(int i) {
        return this.f2943l.mo2815g(i);
    }

    /* renamed from: L */
    public void m2858L(int i) {
        if (mo2434b(i) >= 10.0f) {
            super.m2397L(i);
        }
    }

    /* renamed from: a */
    public void mo2693a(C0414i iVar) {
        AbstractC0197s a = mo3632a(iVar.f3033h);
        if (a != null) {
            a.mo3679g(this);
        } else {
            Hcat_Multiplaye.m1334a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + iVar.f3033h + " id:" + this.f5835dA, true);
        }
    }

    /* renamed from: bX */
    public C0181c mo2691bX() {
        if (m2859L() == 1) {
            return f2938du.m3690J();
        }
        if (this.f2943l instanceof C0397f) {
            return f2939dv.m3690J();
        }
        return AbstractC0197s.f1356h;
    }

    /* renamed from: a */
    public void mo2867a(ArrayList arrayList) {
        arrayList.clear();
        if (m2859L() == 1) {
            arrayList.add(f2940dw.m3690J());
            arrayList.add(f2941dx.m3690J());
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$1.class */
    final class C03901 extends AbstractC0201w {
        C03901(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo2687g() {
            return false;
        }

        /* renamed from: a */
        public String mo2464a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo2463b() {
            return C0652a.m1589a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo2688c() {
            return 1000;
        }

        /* renamed from: t */
        public float mo2685t() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo2470a(AbstractC0210af afVar, boolean z) {
            C0389b bVar = (C0389b) afVar;
            if (bVar.m2859L() != 1 || bVar.mo2741a(AbstractC0197s.f1356h, z) > 0) {
                return false;
            }
            return super.mo2470a(afVar, z);
        }

        /* renamed from: a */
        public boolean mo2465a(AbstractC0210af afVar) {
            if (((C0389b) afVar).m2859L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2686i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0198t mo2460f() {
            return EnumC0198t.f1361c;
        }

        /* renamed from: g */
        public void mo3679g(AbstractC0210af afVar) {
            C0389b bVar = (C0389b) afVar;
            bVar.m2851b(C0389b.f2929u);
            C0389b.m2857a(bVar);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$2.class */
    final class C03912 extends AbstractC0201w {
        C03912(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo2687g() {
            return false;
        }

        /* renamed from: a */
        public String mo2464a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        /* renamed from: b */
        public String mo2463b() {
            return C0652a.m1589a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo2688c() {
            return 11000;
        }

        /* renamed from: t */
        public float mo2685t() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo2470a(AbstractC0210af afVar, boolean z) {
            if (((C0389b) afVar).mo2741a(AbstractC0197s.f1356h, z) > 0) {
                return false;
            }
            return super.mo2470a(afVar, z);
        }

        /* renamed from: a */
        public boolean mo2465a(AbstractC0210af afVar) {
            if (!(((C0389b) afVar).f2943l instanceof C0397f)) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2686i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0198t mo2460f() {
            return EnumC0198t.f1361c;
        }

        /* renamed from: g */
        public void mo3679g(AbstractC0210af afVar) {
            C0389b bVar = (C0389b) afVar;
            bVar.m2851b(C0389b.f2930v);
            C0389b.m2853b(bVar);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$3.class */
    final class C03923 extends AbstractC0201w {
        C03923(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo2687g() {
            return false;
        }

        /* renamed from: a */
        public String mo2464a() {
            return "-Large increase in range";
        }

        /* renamed from: b */
        public String mo2463b() {
            return C0652a.m1589a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        /* renamed from: c */
        public int mo2688c() {
            return 1600;
        }

        /* renamed from: t */
        public float mo2685t() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo2470a(AbstractC0210af afVar, boolean z) {
            C0389b bVar = (C0389b) afVar;
            if (bVar.m2859L() != 1 || bVar.mo2741a(AbstractC0197s.f1356h, z) > 0) {
                return false;
            }
            return super.mo2470a(afVar, z);
        }

        /* renamed from: a */
        public boolean mo2465a(AbstractC0210af afVar) {
            if (((C0389b) afVar).m2859L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2686i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0198t mo2460f() {
            return EnumC0198t.f1361c;
        }

        /* renamed from: g */
        public void mo3679g(AbstractC0210af afVar) {
            C0389b bVar = (C0389b) afVar;
            bVar.m2851b(C0389b.f2931w);
            C0389b.m2849c(bVar);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$4.class */
    final class C03934 extends AbstractC0201w {
        C03934(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo2687g() {
            return false;
        }

        /* renamed from: a */
        public String mo2464a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        /* renamed from: b */
        public String mo2463b() {
            return C0652a.m1589a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        /* renamed from: c */
        public int mo2688c() {
            return 700;
        }

        /* renamed from: t */
        public float mo2685t() {
            return 0.002f;
        }

        /* renamed from: a */
        public boolean mo2470a(AbstractC0210af afVar, boolean z) {
            C0389b bVar = (C0389b) afVar;
            if (bVar.m2859L() != 1 || bVar.mo2741a(AbstractC0197s.f1356h, z) > 0) {
                return false;
            }
            return super.mo2470a(afVar, z);
        }

        /* renamed from: a */
        public boolean mo2465a(AbstractC0210af afVar) {
            if (((C0389b) afVar).m2859L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2686i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0198t mo2460f() {
            return EnumC0198t.f1361c;
        }

        /* renamed from: g */
        public void mo3679g(AbstractC0210af afVar) {
            C0389b bVar = (C0389b) afVar;
            bVar.m2851b(C0389b.f2932x);
            C0389b.m2846d(bVar);
        }
    }

    /* renamed from: a */
    public void mo2603a(int i) {
        if (i == 1) {
            this.f2915j = false;
        } else if (i == 2 && !this.f2915j) {
            this.f2915j = true;
        }
    }

    /* renamed from: E */
    public PointF mo2485E(int i) {
        return this.f2943l.mo2825c(i);
    }

    /* renamed from: bH */
    public float mo2712bH() {
        if (this.f1462cn[0].f1565e <= 0.0f || !this.f2943l.m2829a(f2931w)) {
            return super.mo2712bH();
        }
        return 1.0f - (this.f1462cn[0].f1565e / mo2434b(0));
    }

    /* renamed from: F */
    public PointF mo2501F(int i) {
        f3463aU.m4473a(super.mo2501F(i));
        f3463aU.m4472b(0.0f, -5.0f);
        return f3463aU;
    }

    /* renamed from: M */
    public ArrayList mo2480M() {
        return f2942dy;
    }

    /* renamed from: e */
    public void mo2023e(float f) {
        super.mo2023e(f);
        C0851y.m428a(this, mo2420m());
    }

    /* renamed from: cH */
    public float mo2722cH() {
        return AbstractC0789l.m651u().f5474bt.f727k;
    }

    /* renamed from: cI */
    public float mo2721cI() {
        return AbstractC0789l.m651u().f5474bt.f728l;
    }

    /* renamed from: cJ */
    public float mo2720cJ() {
        return super.mo2720cJ() - 8.0f;
    }

    /* renamed from: q */
    public float mo2472q(int i) {
        return this.f2943l.mo2818b(i);
    }
}
