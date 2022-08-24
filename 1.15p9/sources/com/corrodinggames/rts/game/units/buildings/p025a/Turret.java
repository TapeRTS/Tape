package com.corrodinggames.rts.game.units.buildings.p025a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0498i;
import com.corrodinggames.rts.game.units.buildings.C0499j;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class Turret extends AbstractC0498i {

    /* renamed from: j */
    boolean f3379j;

    /* renamed from: k */
    int f3380k;

    /* renamed from: l */
    AbstractC0478c f3381l;

    /* renamed from: H */
    boolean f3392H;

    /* renamed from: I */
    float f3393I;

    /* renamed from: J */
    float f3394J;

    /* renamed from: dI */
    boolean f3395dI;

    /* renamed from: dJ */
    Rect f3396dJ;

    /* renamed from: g */
    static BitmapOrTexture f3371g = null;

    /* renamed from: a */
    private static BitmapOrTexture f3372a = null;

    /* renamed from: b */
    private static BitmapOrTexture f3373b = null;

    /* renamed from: c */
    private static BitmapOrTexture f3374c = null;

    /* renamed from: d */
    private static BitmapOrTexture f3375d = null;

    /* renamed from: e */
    private static BitmapOrTexture f3376e = null;

    /* renamed from: h */
    static BitmapOrTexture[] f3377h = new BitmapOrTexture[10];

    /* renamed from: i */
    static BitmapOrTexture f3378i = null;

    /* renamed from: t */
    static String f3382t = "gun";

    /* renamed from: u */
    static String f3383u = "gunT2";

    /* renamed from: v */
    static String f3384v = "gunT3";

    /* renamed from: w */
    static String f3385w = "artillery";

    /* renamed from: x */
    static String f3386x = "flamethrower";

    /* renamed from: C */
    static String f3387C = "aa_t1";

    /* renamed from: D */
    static String f3388D = "aa_t2";

    /* renamed from: E */
    static String f3389E = "aa_flak";

    /* renamed from: F */
    static BitmapOrTexture f3390F = null;

    /* renamed from: G */
    static BitmapOrTexture[] f3391G = new BitmapOrTexture[10];

    /* renamed from: dK */
    public static Action f3397dK = new C04741(101);

    /* renamed from: dL */
    public static Action f3398dL = new C04752(104);

    /* renamed from: dM */
    public static Action f3399dM = new C04763(102);

    /* renamed from: dN */
    public static Action f3400dN = new C04774(103);

    /* renamed from: dO */
    static ArrayList f3401dO = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ PointF m4622a(Turret turret, int i) {
        return super.getTurretEnd(i);
    }

    /* renamed from: dA */
    static /* synthetic */ BitmapOrTexture m4597dA() {
        return f3372a;
    }

    /* renamed from: dB */
    static /* synthetic */ BitmapOrTexture m4596dB() {
        return f3373b;
    }

    /* renamed from: b */
    static /* synthetic */ PointF m4614b(Turret turret, int i) {
        return super.getTurretEnd(i);
    }

    /* renamed from: dC */
    static /* synthetic */ BitmapOrTexture m4595dC() {
        return f3374c;
    }

    /* renamed from: c */
    static /* synthetic */ PointF m4607c(Turret turret, int i) {
        return super.getTurretEnd(i);
    }

    /* renamed from: dD */
    static /* synthetic */ BitmapOrTexture m4594dD() {
        return f3375d;
    }

    /* renamed from: dE */
    static /* synthetic */ BitmapOrTexture m4593dE() {
        return f3376e;
    }

    /* renamed from: a */
    static /* synthetic */ void m4623a(Turret turret) {
        turret.m3229W();
    }

    /* renamed from: b */
    static /* synthetic */ void m4615b(Turret turret) {
        turret.m3229W();
    }

    /* renamed from: c */
    static /* synthetic */ void m4608c(Turret turret) {
        turret.m3229W();
    }

    /* renamed from: d */
    static /* synthetic */ void m4598d(Turret turret) {
        turret.m3229W();
    }

    static {
        f3401dO.add(f3397dK);
        f3401dO.add(f3398dL);
        f3401dO.add(f3399dM);
        f3401dO.add(f3400dN);
    }

    /* renamed from: L */
    public int m4629L() {
        return this.f3381l.mo4562b();
    }

    /* renamed from: H */
    public float m4631H(int i) {
        return this.f3381l.mo4569h(i);
    }

    /* renamed from: a_ */
    public void m4619a_(String str) {
        m4613b(str);
    }

    /* renamed from: b */
    public void m4613b(String str) {
        if (!this.f3381l.m4572a(str)) {
            AbstractC0478c abstractC0478c = this.f3381l;
            this.f3381l = m4606c(str);
            this.f3381l.mo4563a(abstractC0478c);
        }
    }

    /* renamed from: c */
    public AbstractC0478c m4606c(String str) {
        if (str.equals(f3382t)) {
            return new C0483h(this);
        }
        if (str.equals(f3383u)) {
            return new C0481f(this);
        }
        if (str.equals(f3384v)) {
            return new C0482g(this);
        }
        if (str.equals(f3385w)) {
            return new C0479d(this);
        }
        if (str.equals(f3386x)) {
            return new C0480e(this);
        }
        return null;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3379j);
        c0859ar.mo1482a(this.f3380k == 1);
        c0859ar.m1553c(this.f3381l.mo4560c());
        c0859ar.mo1487a(this.f3380k);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        boolean m1455e = c0876k.m1455e();
        if (m1455e) {
            m4625a(2);
        }
        if (c0876k.m1463b() >= 27) {
            this.f3380k = c0876k.m1455e() ? 1 : 0;
        }
        if (c0876k.m1463b() >= 35) {
            String m1448l = c0876k.m1448l();
            if (!this.f3381l.m4572a(m1448l)) {
                m4613b(m1448l);
            }
            this.f3380k = c0876k.m1454f();
        } else if (m1455e && !(this instanceof AntiAirTurret)) {
            m4613b(f3383u);
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: v */
    public BitmapOrTexture m4582v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3391G[this.team.getId()];
    }

    /* renamed from: dy */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3371g = gameEngine.graphics.loadImage(R.drawable.turret_base);
        f3378i = gameEngine.graphics.loadImage(R.drawable.turret_base_dead);
        f3372a = gameEngine.graphics.loadImage(R.drawable.turret_top);
        f3373b = gameEngine.graphics.loadImage(R.drawable.turret_top_l2);
        f3374c = gameEngine.graphics.loadImage(R.drawable.turret_top_l3);
        f3375d = gameEngine.graphics.loadImage(R.drawable.turret_top_artillery);
        f3376e = gameEngine.graphics.loadImage(R.drawable.turret_top_flame);
        f3377h = Team.createBitmapForTeam(f3371g);
        f3390F = gameEngine.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3391G = Team.createBitmapForTeam(f3390F);
    }

    /* renamed from: K */
    public boolean m4630K() {
        this.image = f3378i;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1504d);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4600d() {
        if (this.isDead) {
            return f3378i;
        }
        if (this.team == null) {
            return f3377h[f3377h.length - 1];
        }
        return f3377h[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4588k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m4599d(int i) {
        return this.f3381l.mo4558d(i);
    }

    public Turret(boolean z) {
        super(z);
        this.f3381l = new C0483h(this);
        this.f3392H = true;
        this.f3396dJ = new Rect();
        m2884T(35);
        m2883U(42);
        this.radius = 16.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 700.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3371g;
        this.f1648cJ[0].f1711a = CommonUtils.m2346a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f3421n.m7208a(0, 0, 1, 1);
        this.f3422o.m7208a(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void m4583s(float f) {
        if (this.f1648cJ[0].m5749a()) {
            if (this.f3392H) {
                this.f3393I = this.f1648cJ[0].f1711a;
                this.f3392H = false;
                this.f3394J = CommonUtils.m2346a(this, 0, 120);
            }
            this.f3394J += f;
            if (this.f3394J > 450.0f) {
                this.f3394J = CommonUtils.m2346a(this, 0, 30);
                this.f3395dI = !this.f3395dI;
            }
            if (this.f3394J < 120.0f) {
                if (this.f3395dI) {
                    m3224a(f * 0.3f, this.f3393I - 20.0f, 0);
                    return;
                } else {
                    m3224a(f * 0.3f, this.f3393I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3392H = true;
    }

    /* renamed from: a */
    public void m4626a(float f) {
        super.update(f);
        if (isActive()) {
            this.f3381l.mo4566a(f);
        }
    }

    /* renamed from: a */
    public void m4624a(Unit unit, int i) {
        this.f3381l.mo4564a(unit, i);
    }

    /* renamed from: m */
    public float m4586m() {
        return this.f3381l.mo4567a();
    }

    /* renamed from: b */
    public float m4617b(int i) {
        return this.f3381l.mo4565a(i);
    }

    /* renamed from: c */
    public float m4609c(int i) {
        return this.f3381l.mo4571e(i);
    }

    /* renamed from: w */
    public float m4581w(int i) {
        return this.f3381l.mo4570f(i);
    }

    /* renamed from: b */
    public boolean m4616b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean m4610c(float f) {
        if (!super.m4418c(f)) {
            return false;
        }
        if (!this.isDead) {
            m4591dz();
            return true;
        }
        return true;
    }

    /* renamed from: dz */
    void m4591dz() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture m4599d = m4599d(0);
        PointF m4632G = m4632G(0);
        gameEngine.graphics.mo916a(m4599d, m4632G.x - GameEngine.getInstance().f6138cv, m4632G.y - GameEngine.getInstance().f6139cw, this.f1648cJ[0].f1711a, mo4210f());
    }

    /* renamed from: c */
    public UnitType m4584r() {
        return UnitType.f1739f;
    }

    /* renamed from: l */
    public boolean m4587l() {
        return true;
    }

    /* renamed from: af */
    public boolean m4618af() {
        return false;
    }

    /* renamed from: g */
    public float m4589g(int i) {
        return this.f3381l.mo4557g(i);
    }

    /* renamed from: M */
    public void m4628M(int i) {
        if (m4617b(i) < 10.0f) {
            return;
        }
        super.m3236M(i);
    }

    /* renamed from: a */
    public void m4621a(C0499j c0499j) {
        Action a = m5893a(c0499j.f3491j);
        if (a != null) {
            a.m6069f(this);
        } else {
            C0831ad.m1742a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + c0499j.f3491j + " id:" + this.f6945ed, true);
        }
    }

    /* renamed from: cl */
    public C0208c m4601cl() {
        if (m4629L() == 1) {
            return f3397dK.m6095N();
        }
        if (this.f3381l instanceof C0481f) {
            return f3398dL.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public void m4620a(ArrayList arrayList) {
        arrayList.clear();
        if (m4629L() == 1) {
            arrayList.add(f3399dM.m6095N());
            arrayList.add(f3400dN.m6095N());
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$1.class */
    final class C04741 extends AbstractC0228w {
        C04741(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 1000;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4629L() != 1 || turret.m4429a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Turret) unit).m4629L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }

        /* renamed from: f */
        public void m4579f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4613b(Turret.f3383u);
            Turret.m4623a(turret);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$2.class */
    final class C04752 extends AbstractC0228w {
        C04752(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 11000;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            if (((Turret) unit).m4429a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (!(((Turret) unit).f3381l instanceof C0481f)) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }

        /* renamed from: f */
        public void m4577f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4613b(Turret.f3384v);
            Turret.m4615b(turret);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$3.class */
    final class C04763 extends AbstractC0228w {
        C04763(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Large increase in range";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 1600;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4629L() != 1 || turret.m4429a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Turret) unit).m4629L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }

        /* renamed from: f */
        public void m4575f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4613b(Turret.f3385w);
            Turret.m4608c(turret);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$4.class */
    final class C04774 extends AbstractC0228w {
        C04774(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 700;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 0.002f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m4629L() != 1 || turret.m4429a(Action.f1461i, z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Turret) unit).m4629L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }

        /* renamed from: f */
        public void m4573f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m4613b(Turret.f3386x);
            Turret.m4598d(turret);
        }
    }

    /* renamed from: a */
    public void m4625a(int i) {
        if (i == 1) {
            this.f3379j = false;
        } else if (i == 2 && !this.f3379j) {
            this.f3379j = true;
        }
    }

    /* renamed from: E */
    public PointF m4633E(int i) {
        return this.f3381l.mo4568c(i);
    }

    /* renamed from: bU */
    public float m4612bU() {
        if (this.f1648cJ[0].f1715e > 0.0f && this.f3381l.m4572a(f3385w)) {
            return 1.0f - (this.f1648cJ[0].f1715e / m4617b(0));
        }
        return super.m4421bU();
    }

    /* renamed from: G */
    public PointF m4632G(int i) {
        f3981bg.m7212a(super.mo3523G(i));
        f3981bg.m7211b(0.0f, -5.0f);
        return f3981bg;
    }

    /* renamed from: N */
    public ArrayList m4627N() {
        return f3401dO;
    }

    /* renamed from: e */
    public void m4590e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4586m());
    }

    /* renamed from: cX */
    public float m4604cX() {
        return GameEngine.getInstance().f6104bL.f784n;
    }

    /* renamed from: cY */
    public float m4603cY() {
        return GameEngine.getInstance().f6104bL.f785o;
    }

    /* renamed from: cZ */
    public float m4602cZ() {
        return super.m5821cZ() - 8.0f;
    }

    /* renamed from: cK */
    public int m4605cK() {
        return this.f3381l.mo4559d();
    }

    /* renamed from: q */
    public float m4585q(int i) {
        return this.f3381l.mo4561b(i);
    }
}
