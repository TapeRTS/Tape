package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class Extractor extends AbstractC0498i {

    /* renamed from: a */
    float f3446a;

    /* renamed from: b */
    int f3447b;

    /* renamed from: c */
    float f3448c;

    /* renamed from: d */
    int f3449d;

    /* renamed from: j */
    Rect f3455j;

    /* renamed from: k */
    Rect f3456k;

    /* renamed from: w */
    static ArrayList f3461w;

    /* renamed from: x */
    static ArrayList f3462x;

    /* renamed from: e */
    static BitmapOrTexture[] f3450e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f3451f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture[] f3452g = new BitmapOrTexture[10];

    /* renamed from: h */
    static BitmapOrTexture f3453h = null;

    /* renamed from: i */
    static BitmapOrTexture f3454i = null;

    /* renamed from: l */
    public static int f3457l = 0;

    /* renamed from: t */
    static Action f3458t = new C04931(102);

    /* renamed from: u */
    static Action f3459u = new C04942(103);

    /* renamed from: v */
    static ArrayList f3460v = new ArrayList();

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3446a);
        c0859ar.mo1482a(this.f3447b > 1);
        c0859ar.mo1487a(this.f3447b);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3446a = c0876k.m1453g();
        int i = 1;
        if (c0876k.m1455e()) {
            i = 2;
        }
        if (c0876k.m1463b() >= 31) {
            i = c0876k.m1454f();
        }
        if (i != 1) {
            m4468a(i);
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public UnitType m4452r() {
        return UnitType.f1734a;
    }

    static {
        f3460v.add(f3458t);
        f3461w = new ArrayList();
        f3461w.add(f3459u);
        f3462x = new ArrayList();
    }

    /* renamed from: c */
    public boolean m4459c(Team team) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.m6652a(this.f6951ek, this.f6952el);
        C0180g m6598e = gameEngine.f6104bL.m6598e(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
        if (m6598e == null || !m6598e.f921i) {
            return false;
        }
        return super.m3075c(team);
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.extractor);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.extractor_t2);
        BitmapOrTexture loadImage3 = gameEngine.graphics.loadImage(R.drawable.extractor_t3);
        f3454i = gameEngine.graphics.loadImage(R.drawable.extractor_dead);
        f3450e = Team.createBitmapForTeam(loadImage);
        f3451f = Team.createBitmapForTeam(loadImage2);
        f3452g = Team.createBitmapForTeam(loadImage3);
        loadImage.mo395n();
        loadImage2.mo395n();
        loadImage3.mo395n();
        f3453h = gameEngine.graphics.loadImage(R.drawable.extractor_back);
    }

    /* renamed from: K */
    public boolean m4474K() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        this.image = f3454i;
        this.f3420m = null;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        C0746f.m2519a(this.f6951ek, this.f6952el).f4809j = -6684775;
        C0746f m2512b = C0746f.m2512b(this.f6951ek, this.f6952el);
        m2512b.f4789a = 500.0f;
        m2512b.f4809j = -6684775;
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e m2533c = gameEngine.effects.m2533c(this.f6951ek, this.f6952el, this.height, -1127220);
        if (m2533c != null) {
            m2533c.f4730H = 0.15f;
            m2533c.f4729G = 1.0f;
            m2533c.f4786ar = (short) 2;
            m2533c.f4745W = 35.0f;
            m2533c.f4746X = m2533c.f4745W;
            m2533c.f4744V = 0.0f;
            m2533c.f4725y = -13378253;
        }
        m3090bo();
        return false;
    }

    /* renamed from: bp */
    public int m4463bp() {
        return 16;
    }

    /* renamed from: S */
    public void m4471S() {
        super.mo4500S();
        if (this.isDead) {
            this.f3420m = null;
        } else {
            this.f3420m = f3453h;
        }
    }

    /* renamed from: M */
    public boolean m4473M() {
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4456d() {
        if (this.isDead) {
            return f3454i;
        }
        if (this.team == null) {
            return f3450e[f3450e.length - 1];
        }
        if (this.f3447b == 3) {
            return f3452g[this.team.getId()];
        }
        if (this.f3447b == 2) {
            return f3451f[this.team.getId()];
        }
        return f3450e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4455k() {
        return null;
    }

    public Extractor(boolean z) {
        super(z);
        this.f3447b = 1;
        this.f3448c = 0.0f;
        this.f3449d = 0;
        this.f3455j = new Rect();
        this.f3456k = new Rect();
        this.image = f3450e[9];
        m2884T(37);
        m2883U(56);
        this.radius = 18.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(0, -1, 0, 0);
        this.f3422o.m7207a(this.f3421n);
        m4471S();
    }

    /* renamed from: a */
    public void m4469a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3448c = CommonUtils.m2368a(this.f3448c, f * this.f3447b);
        if (this.f3448c == 0.0f) {
            this.f3448c = 17.0f;
            this.f3449d++;
            if (this.f3449d > 7) {
                this.f3449d = 0;
            }
            if (this.f3449d <= 3) {
                this.f3426s = this.f3449d;
            } else {
                this.f3426s = 7 - this.f3449d;
            }
        }
        this.f3446a += f;
        if (this.f3446a > Team.f1377ao - 0.1f) {
            this.f3446a -= Team.f1377ao;
            this.team.m6373b(m4457cw() * (Team.f1377ao / Team.f1376an));
        }
    }

    /* renamed from: cw */
    public float m4457cw() {
        if (this.f3447b == 3) {
            return 18.0f;
        }
        if (this.f3447b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    /* renamed from: c */
    public boolean m4461c(float f) {
        return super.m4418c(f);
    }

    /* renamed from: l */
    public boolean m4454l() {
        return false;
    }

    /* renamed from: a */
    public void m4467a(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float m4453m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float m4464b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float m4460c(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void m4466a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3458t.m6095N())) {
            m4468a(2);
            m3229W();
        }
        if (c0499j.f3491j.equals(f3459u.m6095N())) {
            m4468a(3);
            m3229W();
        }
    }

    /* renamed from: cl */
    public C0208c m4458cl() {
        if (this.f3447b == 1) {
            return f3458t.m6095N();
        }
        if (this.f3447b == 2) {
            return f3459u.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: V */
    public int m4470V() {
        return this.f3447b;
    }

    /* renamed from: a */
    public void m4468a(int i) {
        Team.m6369b((Unit) this);
        if (this.f3447b > i) {
            this.f3447b = 1;
            this.f1632ct = 800.0f;
            if (this.f1631cs > this.f1632ct) {
                this.f1631cs = this.f1632ct;
            }
        }
        if (this.f3447b < 2 && i >= 2) {
            this.f1632ct += 200.0f;
            this.f1631cs += 200.0f;
        }
        if (this.f3447b < 3 && i >= 3) {
            this.f1632ct += 1000.0f;
            this.f1631cs += 1000.0f;
        }
        this.f3447b = i;
        Team.m6353c(this);
        m4471S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$1.class */
    final class C04931 extends AbstractC0228w {
        C04931(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.extractor.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return UnitType.f1734a.getUpgradePrice(2);
        }

        /* renamed from: K */
        public float mo4250K() {
            return 6.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3447b != 1 || extractor.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$2.class */
    final class C04942 extends AbstractC0228w {
        C04942(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return UnitType.f1734a.getUpgradePrice(3);
        }

        /* renamed from: K */
        public float mo4250K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3447b != 2 || extractor.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: L */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1466c;
        }
    }

    /* renamed from: N */
    public ArrayList m4472N() {
        if (this.f3447b == 1) {
            return f3460v;
        }
        if (this.f3447b == 2) {
            return f3461w;
        }
        return f3462x;
    }
}
