package com.corrodinggames.rts.game.units.buildings;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
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
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class LaserDefence extends AbstractC0498i {

    /* renamed from: d */
    boolean f3511d;

    /* renamed from: e */
    boolean f3512e;

    /* renamed from: f */
    float f3513f;

    /* renamed from: i */
    PointF f3516i;

    /* renamed from: j */
    Rect f3517j;

    /* renamed from: a */
    static BitmapOrTexture[] f3508a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture[] f3509b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3510c = null;

    /* renamed from: g */
    static BitmapOrTexture f3514g = null;

    /* renamed from: h */
    static BitmapOrTexture[] f3515h = new BitmapOrTexture[10];

    /* renamed from: k */
    static Action f3518k = new C05061(102);

    /* renamed from: l */
    static ArrayList f3519l = new ArrayList();

    static {
        f3519l.add(f3518k);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3511d);
        c0859ar.mo1488a(this.f1638cz);
        c0859ar.mo1482a(this.f3512e);
        c0859ar.mo1488a(this.f3513f);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3511d = c0876k.m1455e();
        this.f1638cz = c0876k.m1453g();
        this.f3512e = c0876k.m1455e();
        if (c0876k.m1463b() >= 38) {
            this.f3513f = c0876k.m1453g();
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: v */
    public BitmapOrTexture m4320v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3515h[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3510c = gameEngine.graphics.loadImage(R.drawable.laser_defence_dead);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.laser_defence);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.laser_defence_t2);
        f3508a = Team.createBitmapForTeam(loadImage);
        f3509b = Team.createBitmapForTeam(loadImage2);
        loadImage.mo395n();
        loadImage2.mo395n();
        f3514g = gameEngine.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3515h = Team.createBitmapForTeam(f3514g);
    }

    /* renamed from: K */
    public boolean m4347K() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        this.image = f3510c;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4327d() {
        if (this.isDead) {
            return f3510c;
        }
        if (this.team == null) {
            return f3508a[f3508a.length - 1];
        }
        if (!this.f3511d) {
            return f3508a[this.team.getId()];
        }
        return f3509b[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4324k() {
        return null;
    }

    public LaserDefence(boolean z) {
        super(z);
        this.f3516i = new PointF();
        this.f3517j = new Rect();
        m2879a(f3508a[0], 2);
        this.f1638cz = 1.0f;
        this.radius = 19.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 500.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3508a[f3508a.length - 1];
        this.f3421n.m7208a(0, 0, 1, 1);
        this.f3422o.m7208a(0, 0, 1, 1);
    }

    /* renamed from: a */
    public void m4344a(float f) {
        float f2;
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        GameEngine.getInstance();
        float f3 = 4.0E-4f * f;
        if (this.f3511d) {
            f3 += 2.0E-4f * f;
        }
        this.f1638cz = CommonUtils.m2367a(this.f1638cz, 1.0f, f3);
        if (this.f1638cz >= 1.0f) {
            this.f3512e = false;
        }
        this.f3513f -= f;
        this.f3516i.m7212a(m4348E(0));
        if (this.f1638cz > 0.0f && !this.f3512e) {
            if (!this.f3511d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m4340a(this, this.f3516i.x, this.f3516i.y, this.height, m4322m(), f2)) {
                this.f3513f = 3.0f;
            }
            if (this.f1638cz < 0.0f) {
                this.f1638cz = 0.0f;
                this.f3512e = true;
            }
        }
        if (this.f3512e) {
            this.f3426s = 1;
        } else {
            this.f3426s = 0;
        }
    }

    /* renamed from: a */
    public static boolean m4340a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, float f5) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f6 = f4 * f4;
        Object[] m559a = Projectile.f1082a.m559a();
        int i = Projectile.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile = (Projectile) m559a[i2];
            if (!projectile.f1000A && !projectile.f1002C && ((projectile.f1009J > 7.0f || (projectile.f1009J > 2.0f && projectile.speed > 8.0f)) && !projectile.f1070aS && ((projectile.f6951ek - f) * (projectile.f6951ek - f)) + ((projectile.f6952el - f2) * (projectile.f6952el - f2)) < f6 && projectile.height >= -1.0f)) {
                boolean z = false;
                if (projectile.target != null && abstractC0623y.team.m6342d(projectile.target.team)) {
                    z = true;
                }
                if (!z && projectile.f983j != null && abstractC0623y.team.m6354c(projectile.f983j.team)) {
                    z = true;
                }
                if (z) {
                    C0745e m2560a = gameEngine.effects.m2560a(f, f2, f3, projectile.f6951ek, projectile.f6952el, projectile.height);
                    if (m2560a != null) {
                        m2560a.f4745W = 10.0f;
                        m2560a.f4746X = m2560a.f4745W;
                    }
                    C0745e m2537b = gameEngine.effects.m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                    if (m2537b != null) {
                        m2537b.f4739Q = 0.0f;
                        m2537b.f4740R = 0.0f;
                        m2537b.f4762ap = 4;
                        m2537b.f4745W = 39.0f;
                        m2537b.f4746X = m2537b.f4745W;
                        m2537b.f4720s = true;
                        m2537b.f4728F = 1.3f;
                        m2537b.f4730H = 1.1f;
                        m2537b.f4729G = 0.7f;
                    }
                    projectile.f1007H -= 1.01f;
                    if (projectile.f1007H <= 0.0f) {
                        projectile.m6500d();
                        C0745e m2537b2 = gameEngine.effects.m2537b(projectile.f6951ek, projectile.f6952el, projectile.height, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                        if (m2537b2 != null) {
                            m2537b2.f4739Q = 0.0f;
                            m2537b2.f4740R = 0.0f;
                            m2537b2.f4762ap = 4;
                            m2537b2.f4745W = 23.0f;
                            m2537b2.f4746X = m2537b2.f4745W;
                            m2537b2.f4720s = true;
                            m2537b2.f4728F = 0.9f;
                            m2537b2.f4730H = 0.5f;
                            m2537b2.f4729G = 0.2f;
                        }
                        gameEngine.audio.m3003a(AudioEngine.f4061F, 0.2f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), projectile.f6951ek, projectile.f6952el);
                    }
                    abstractC0623y.f1638cz -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public PointF m4348E(int i) {
        f3980bf.m7213a(this.f6951ek, this.f6952el - 13.0f);
        return f3980bf;
    }

    /* renamed from: a */
    public void m4342a(Unit unit, int i) {
    }

    /* renamed from: m */
    public float m4322m() {
        if (!this.f3511d) {
            return 160.0f;
        }
        return 210.0f;
    }

    /* renamed from: c */
    public float m4332c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m4338b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean m4333c(float f) {
        return super.m4418c(f);
    }

    /* renamed from: c */
    public UnitType m4321r() {
        return UnitType.f1758y;
    }

    /* renamed from: l */
    public boolean m4323l() {
        return false;
    }

    /* renamed from: g */
    public float m4325g(int i) {
        return 1.0f;
    }

    /* renamed from: bV */
    public float m4337bV() {
        if (this.f1638cz != 1.0f) {
            return this.f1638cz;
        }
        return super.m5856bV();
    }

    /* renamed from: bW */
    public boolean m4336bW() {
        return this.f3512e;
    }

    /* renamed from: bd */
    public float m4335bd() {
        return 1.0f;
    }

    /* renamed from: a */
    public void m4341a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3518k.m6095N())) {
            m4343a(2);
            m3229W();
        }
    }

    /* renamed from: cl */
    public C0208c m4328cl() {
        if (!this.f3511d) {
            return f3518k.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: V */
    public int m4345V() {
        if (this.f3511d) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void m4343a(int i) {
        if (i == 1) {
            this.f3511d = false;
        } else if (i == 2 && !this.f3511d) {
            this.f3511d = true;
            this.f1632ct += 900.0f;
            this.f1631cs += 900.0f;
        }
        mo4500S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.p$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p$1.class */
    final class C05061 extends AbstractC0228w {
        C05061(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.laserDefence.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("units.laserDefence.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return UnitType.f1758y.getUpgradePrice(2);
        }

        /* renamed from: K */
        public float mo4250K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            LaserDefence laserDefence = (LaserDefence) unit;
            if (laserDefence.f3511d || laserDefence.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((LaserDefence) unit).f3511d) {
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
    public ArrayList m4346N() {
        return f3519l;
    }

    /* renamed from: e */
    public void m4326e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4322m());
    }

    /* renamed from: cX */
    public float m4331cX() {
        return GameEngine.getInstance().f6104bL.f784n;
    }

    /* renamed from: cY */
    public float m4330cY() {
        return GameEngine.getInstance().f6104bL.f785o;
    }

    /* renamed from: cZ */
    public float m4329cZ() {
        return super.m5821cZ() - 8.0f;
    }
}
