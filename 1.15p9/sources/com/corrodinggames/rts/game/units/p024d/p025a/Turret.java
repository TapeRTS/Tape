package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.AbstractC0498i;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class Turret extends AbstractC0498i {

    /* renamed from: j */
    boolean f3371j;

    /* renamed from: k */
    int f3372k;

    /* renamed from: l */
    AbstractC0478c f3373l;

    /* renamed from: H */
    boolean f3374H;

    /* renamed from: I */
    float f3375I;

    /* renamed from: J */
    float f3376J;

    /* renamed from: dI */
    boolean f3377dI;

    /* renamed from: dJ */
    Rect f3378dJ;

    /* renamed from: g */
    static C0934e f3379g = null;

    /* renamed from: a */
    private static C0934e f3380a = null;

    /* renamed from: b */
    private static C0934e f3381b = null;

    /* renamed from: c */
    private static C0934e f3382c = null;

    /* renamed from: d */
    private static C0934e f3383d = null;

    /* renamed from: e */
    private static C0934e f3384e = null;

    /* renamed from: h */
    static C0934e[] f3385h = new C0934e[10];

    /* renamed from: i */
    static C0934e f3386i = null;

    /* renamed from: t */
    static String f3387t = "gun";

    /* renamed from: u */
    static String f3388u = "gunT2";

    /* renamed from: v */
    static String f3389v = "gunT3";

    /* renamed from: w */
    static String f3390w = "artillery";

    /* renamed from: x */
    static String f3391x = "flamethrower";

    /* renamed from: C */
    static String f3392C = "aa_t1";

    /* renamed from: D */
    static String f3393D = "aa_t2";

    /* renamed from: E */
    static String f3394E = "aa_flak";

    /* renamed from: F */
    static C0934e f3395F = null;

    /* renamed from: G */
    static C0934e[] f3396G = new C0934e[10];

    /* renamed from: dK */
    public static Action f3397dK = new AbstractC0228w(101) { // from class: com.corrodinggames.rts.game.units.d.a.b.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5556g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5564a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5562b() {
            return C0820a.m1882a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5560c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3860K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3857a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4160L() != 1 || turret.mo3963a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo5053a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3855b(Unit unit) {
            if (((Turret) unit).m4160L() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6869i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5557f() {
            return EnumC0225t.f1466c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public void mo4133f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4153b(Turret.f3388u);
            turret.m3223W();
        }
    };

    /* renamed from: dL */
    public static Action f3398dL = new AbstractC0228w(104) { // from class: com.corrodinggames.rts.game.units.d.a.b.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5556g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5564a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5562b() {
            return C0820a.m1882a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5560c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3860K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3857a(Unit unit, boolean z) {
            if (((Turret) unit).mo3963a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo5053a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3855b(Unit unit) {
            if (!(((Turret) unit).f3373l instanceof C0481f)) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6869i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5557f() {
            return EnumC0225t.f1466c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public void mo4133f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4153b(Turret.f3389v);
            turret.m3223W();
        }
    };

    /* renamed from: dM */
    public static Action f3399dM = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.a.b.3
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5556g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5564a() {
            return "-Large increase in range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5562b() {
            return C0820a.m1882a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5560c() {
            return 1600;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3860K() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3857a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4160L() != 1 || turret.mo3963a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo5053a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3855b(Unit unit) {
            if (((Turret) unit).m4160L() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6869i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5557f() {
            return EnumC0225t.f1466c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public void mo4133f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4153b(Turret.f3390w);
            turret.m3223W();
        }
    };

    /* renamed from: dN */
    public static Action f3400dN = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.a.b.4
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5556g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5564a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5562b() {
            return C0820a.m1882a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5560c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3860K() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3857a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4160L() != 1 || turret.mo3963a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo5053a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3855b(Unit unit) {
            if (((Turret) unit).m4160L() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6869i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5557f() {
            return EnumC0225t.f1466c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public void mo4133f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4153b(Turret.f3391x);
            turret.m3223W();
        }
    };

    /* renamed from: dO */
    static ArrayList f3401dO = new ArrayList();

    static {
        f3401dO.add(f3397dK);
        f3401dO.add(f3398dL);
        f3401dO.add(f3399dM);
        f3401dO.add(f3400dN);
    }

    /* renamed from: L */
    public int m4160L() {
        return this.f3373l.mo4122b();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H(int i) {
        return this.f3373l.mo4129h(i);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public void mo4156a_(String str) {
        m4153b(str);
    }

    /* renamed from: b */
    public void m4153b(String str) {
        if (!this.f3373l.m4132a(str)) {
            AbstractC0478c abstractC0478c = this.f3373l;
            this.f3373l = m4150c(str);
            this.f3373l.mo4123a(abstractC0478c);
        }
    }

    /* renamed from: c */
    public AbstractC0478c m4150c(String str) {
        if (str.equals(f3387t)) {
            return new C0483h(this);
        }
        if (str.equals(f3388u)) {
            return new C0481f(this);
        }
        if (str.equals(f3389v)) {
            return new C0482g(this);
        }
        if (str.equals(f3390w)) {
            return new C0479d(this);
        }
        if (str.equals(f3391x)) {
            return new C0480e(this);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3371j);
        c0859ar.mo1482a(this.f3372k == 1);
        c0859ar.m1553c(this.f3373l.mo4120c());
        c0859ar.mo1487a(this.f3372k);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        boolean m1455e = c0876k.m1455e();
        if (m1455e) {
            mo3207a(2);
        }
        if (c0876k.m1463b() >= 27) {
            this.f3372k = c0876k.m1455e() ? 1 : 0;
        }
        if (c0876k.m1463b() >= 35) {
            String m1448l = c0876k.m1448l();
            if (!this.f3373l.m4132a(m1448l)) {
                m4153b(m1448l);
            }
            this.f3372k = c0876k.m1454f();
        } else if (m1455e && !(this instanceof AntiAirTurret)) {
            m4153b(f3388u);
        }
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3253v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3396G[this.f1608bV.m5780O()];
    }

    /* renamed from: dy */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3379g = m1234A.f6107bO.mo930a(C0067R.drawable.turret_base);
        f3386i = m1234A.f6107bO.mo930a(C0067R.drawable.turret_base_dead);
        f3380a = m1234A.f6107bO.mo930a(C0067R.drawable.turret_top);
        f3381b = m1234A.f6107bO.mo930a(C0067R.drawable.turret_top_l2);
        f3382c = m1234A.f6107bO.mo930a(C0067R.drawable.turret_top_l3);
        f3383d = m1234A.f6107bO.mo930a(C0067R.drawable.turret_top_artillery);
        f3384e = m1234A.f6107bO.mo930a(C0067R.drawable.turret_top_flame);
        f3385h = AbstractC0197n.m5757a(f3379g);
        f3395F = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_building_turrent);
        f3396G = AbstractC0197n.m5757a(f3395F);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3870K() {
        this.f3880L = f3386i;
        m472S(0);
        this.f1605bS = false;
        m3200a(EnumC0233ab.f1504d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3386i;
        }
        if (this.f1608bV == null) {
            return f3385h[f3385h.length - 1];
        }
        return f3385h[this.f1608bV.m5780O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3265d(int i) {
        return this.f3373l.mo4118d(i);
    }

    public Turret(boolean z) {
        super(z);
        this.f3373l = new C0483h(this);
        this.f3374H = true;
        this.f3378dJ = new Rect();
        m2879T(35);
        m2878U(42);
        this.f1620ch = 16.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 700.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3379g;
        this.f1648cJ[0].f1711a = C0758f.m2341a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f3421n.m6560a(0, 0, 1, 1);
        this.f3422o.m6560a(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void mo4162s(float f) {
        if (this.f1648cJ[0].m5132a()) {
            if (this.f3374H) {
                this.f3375I = this.f1648cJ[0].f1711a;
                this.f3374H = false;
                this.f3376J = C0758f.m2341a(this, 0, 120);
            }
            this.f3376J += f;
            if (this.f3376J > 450.0f) {
                this.f3376J = C0758f.m2341a(this, 0, 30);
                this.f3377dI = !this.f3377dI;
            }
            if (this.f3376J < 120.0f) {
                if (this.f3377dI) {
                    m3218a(f * 0.3f, this.f3375I - 20.0f, 0);
                    return;
                } else {
                    m3218a(f * 0.3f, this.f3375I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3374H = true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3274a(float f) {
        super.mo3274a(f);
        if (m5248bS()) {
            this.f3373l.mo4126a(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3271a(Unit unit, int i) {
        this.f3373l.mo4124a(unit, i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3255m() {
        return this.f3373l.mo4127a();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3270b(int i) {
        return this.f3373l.mo4125a(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3268c(int i) {
        return this.f3373l.mo4131e(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3011w(int i) {
        return this.f3373l.mo4130f(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3115b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo3269c(float f) {
        if (!super.mo3269c(f)) {
            return false;
        }
        if (!this.f1606bT) {
            m4139dz();
            return true;
        }
        return true;
    }

    /* renamed from: dz */
    void m4139dz() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo3265d = mo3265d(0);
        PointF mo3238G = mo3238G(0);
        m1234A.f6107bO.mo916a(mo3265d, mo3238G.f227a - GameEngine.m1234A().f6138cv, mo3238G.f228b - GameEngine.m1234A().f6139cw, this.f1648cJ[0].f1711a, m4067f());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo6874r() {
        return UnitType.turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3256l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3141af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3260g(int i) {
        return this.f3373l.mo4117g(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: M */
    public void mo3230M(int i) {
        if (mo3270b(i) < 10.0f) {
            return;
        }
        super.mo3230M(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3868a(C0499j c0499j) {
        Action a = m5284a(c0499j.f3491j);
        if (a != null) {
            a.mo4133f(this);
        } else {
            C0831ad.m1738a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + c0499j.f3491j + " id:" + this.f6945ed, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3863cl() {
        if (m4160L() == 1) {
            return f3397dK.m5470N();
        }
        if (this.f3373l instanceof C0481f) {
            return f3398dL.m5470N();
        }
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo4157a(ArrayList arrayList) {
        arrayList.clear();
        if (m4160L() == 1) {
            arrayList.add(f3399dM.m5470N());
            arrayList.add(f3400dN.m5470N());
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
        if (i == 1) {
            this.f3371j = false;
        } else if (i == 2 && !this.f3371j) {
            this.f3371j = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3242E(int i) {
        return this.f3373l.mo4128c(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo3997bU() {
        if (this.f1648cJ[0].f1715e > 0.0f && this.f3373l.m4132a(f3390w)) {
            return 1.0f - (this.f1648cJ[0].f1715e / mo3270b(0));
        }
        return super.mo3997bU();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3238G(int i) {
        f3981bg.m6564a(super.mo3437G(i));
        f3981bg.m6563b(0.0f, -5.0f);
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3869N() {
        return f3401dO;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo3439e(f);
        C1117y.m495a(this, mo3255m());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo4148cX() {
        return GameEngine.m1234A().f6104bL.f784n;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cY */
    public float mo4147cY() {
        return GameEngine.m1234A().f6104bL.f785o;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public float mo3950cZ() {
        return super.mo3950cZ() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cK */
    public int mo4149cK() {
        return this.f3373l.mo4119d();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3020q(int i) {
        return this.f3373l.mo4121b(i);
    }
}
