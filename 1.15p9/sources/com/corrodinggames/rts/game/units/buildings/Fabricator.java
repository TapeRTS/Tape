package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
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
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class Fabricator extends AbstractC0498i {

    /* renamed from: h */
    float f3463h;

    /* renamed from: i */
    float f3464i;

    /* renamed from: j */
    int f3465j;

    /* renamed from: a */
    static BitmapOrTexture f3466a = null;

    /* renamed from: b */
    static BitmapOrTexture f3467b = null;

    /* renamed from: c */
    static BitmapOrTexture f3468c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3469d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3470e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f3471f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture f3472g = null;

    /* renamed from: k */
    static Action f3473k = new C04961(102);

    /* renamed from: l */
    static Action f3474l = new C04972(103);

    /* renamed from: t */
    static ArrayList f3475t = new ArrayList();

    static {
        f3475t.add(f3473k);
        f3475t.add(f3474l);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3463h);
        c0859ar.mo1482a(this.f3425r == 2);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3463h = c0876k.m1453g();
        boolean m1455e = c0876k.m1455e();
        if (c0876k.m1463b() < 51 && m1455e) {
            m4444a(2);
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: R */
    public void m4447R(int i) {
        m4444a(i);
    }

    /* renamed from: b */
    public UnitType m4434r() {
        return UnitType.f1769J;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3466a = gameEngine.graphics.loadImage(R.drawable.power);
        f3467b = gameEngine.graphics.loadImage(R.drawable.power_t2);
        f3468c = gameEngine.graphics.loadImage(R.drawable.power_t3);
        f3469d = Team.createBitmapForTeam(f3466a);
        f3470e = Team.createBitmapForTeam(f3467b);
        f3471f = Team.createBitmapForTeam(f3468c);
        f3472g = gameEngine.graphics.loadImage(R.drawable.power_dead);
    }

    /* renamed from: K */
    public boolean m4449K() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        this.image = f3472g;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e m2533c = gameEngine.effects.m2533c(this.f6951ek, this.f6952el, this.height, -1127220);
        if (m2533c != null) {
            m2533c.f4730H = 0.15f;
            m2533c.f4729G = 1.0f;
            m2533c.f4786ar = (short) 2;
            m2533c.f4745W = 35.0f;
            m2533c.f4746X = m2533c.f4745W;
            m2533c.f4744V = 0.0f;
            m2533c.f4725y = -14492382;
        }
        m3090bo();
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4436d() {
        if (this.isDead) {
            return f3472g;
        }
        if (this.team == null) {
            return f3469d[f3469d.length - 1];
        }
        if (this.f3425r == 1) {
            return f3469d[this.team.getId()];
        }
        if (this.f3425r == 2) {
            return f3470e[this.team.getId()];
        }
        if (this.f3425r == 3) {
            return f3471f[this.team.getId()];
        }
        GameEngine.PrintLog("Unknown tech level:" + this.f3425r);
        return f3469d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4435k() {
        return null;
    }

    public Fabricator(boolean z) {
        super(z);
        this.f3464i = 0.0f;
        this.f3465j = 0;
        this.image = f3466a;
        m2879a(this.image, 3);
        this.radius = 25.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-1, -1, 1, 1);
        this.f3422o.m7207a(this.f3421n);
    }

    /* renamed from: a */
    public void m4445a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3464i = CommonUtils.m2368a(this.f3464i, f);
        if (this.f3464i == 0.0f) {
            this.f3464i = 17.0f;
            this.f3465j++;
            if (this.f3465j > 5) {
                this.f3465j = 0;
            }
            if (this.f3465j <= 2) {
                this.f3426s = this.f3465j;
            } else {
                this.f3426s = 5 - this.f3465j;
            }
        }
        this.f3463h += f;
        if (this.f3463h > Team.f1377ao - 0.1f) {
            this.f3463h -= Team.f1377ao;
            this.team.m6373b(m4437cw() * (Team.f1377ao / Team.f1376an));
        }
    }

    /* renamed from: cw */
    public float m4437cw() {
        if (this.f3425r == 1) {
            return 2.0f;
        }
        if (this.f3425r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    /* renamed from: a */
    public void m4443a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3473k.m6095N())) {
            m4444a(2);
            m3229W();
        }
        if (c0499j.f3491j.equals(f3474l.m6095N())) {
            m4444a(3);
            m3229W();
        }
    }

    /* renamed from: cl */
    public C0208c m4438cl() {
        if (this.f3425r == 1) {
            return f3473k.m6095N();
        }
        if (this.f3425r == 2) {
            return f3474l.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: V */
    public int m4446V() {
        return this.f3425r;
    }

    /* renamed from: a */
    public void m4444a(int i) {
        Team.m6369b((Unit) this);
        if (this.f3425r > i) {
            this.f3425r = 1;
            this.f1632ct = 800.0f;
            if (this.f1631cs > this.f1632ct) {
                this.f1631cs = this.f1632ct;
            }
        }
        if (this.f3425r < 2 && i >= 2) {
            this.f1632ct += 500.0f;
            this.f1631cs += 500.0f;
        }
        if (this.f3425r < 3 && i >= 3) {
            this.f1632ct += 1300.0f;
            this.f1631cs += 1300.0f;
        }
        this.f3425r = i;
        Team.m6353c(this);
        mo4500S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$1.class */
    final class C04961 extends AbstractC0228w {
        C04961(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.fabricator.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("units.fabricator.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return UnitType.f1769J.getUpgradePrice(2);
        }

        /* renamed from: K */
        public float mo4250K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Fabricator fabricator = (Fabricator) unit;
            if (fabricator.f3425r != 1 || fabricator.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Fabricator) unit).f3425r != 1) {
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
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$2.class */
    final class C04972 extends AbstractC0228w {
        C04972(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return UnitType.f1769J.getUpgradePrice(3);
        }

        /* renamed from: K */
        public float mo4250K() {
            return 2.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Fabricator fabricator = (Fabricator) unit;
            if (fabricator.f3425r != 2 || fabricator.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Fabricator) unit).f3425r != 2) {
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
    }

    /* renamed from: N */
    public ArrayList m4448N() {
        return f3475t;
    }

    /* renamed from: cZ */
    public float m4439cZ() {
        return super.m5821cZ() - 8.0f;
    }

    /* renamed from: bp */
    public int m4441bp() {
        return 12;
    }
}
