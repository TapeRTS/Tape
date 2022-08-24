package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class AntiNukeLaucher extends AbstractC0498i {

    /* renamed from: c */
    boolean f3410c;

    /* renamed from: d */
    int f3411d;

    /* renamed from: e */
    float f3412e;

    /* renamed from: h */
    PointF f3415h;

    /* renamed from: i */
    Rect f3416i;

    /* renamed from: a */
    static BitmapOrTexture[] f3408a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture f3409b = null;

    /* renamed from: f */
    static BitmapOrTexture f3413f = null;

    /* renamed from: g */
    static BitmapOrTexture[] f3414g = new BitmapOrTexture[10];

    /* renamed from: j */
    static Action f3417j = new C04861(145);

    /* renamed from: k */
    static Action f3418k = new C04872(144);

    /* renamed from: l */
    static ArrayList f3419l = new ArrayList();

    static {
        f3419l.add(f3417j);
        f3419l.add(f3418k);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3410c);
        c0859ar.mo1487a(this.f3411d);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3410c = c0876k.m1455e();
        if (c0876k.m1463b() >= 30) {
            this.f3411d = c0876k.m1454f();
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: v */
    public BitmapOrTexture m4526v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3414g[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3409b = gameEngine.graphics.loadImage(R.drawable.antinuke_launcher_dead);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.antinuke_launcher);
        f3408a = Team.createBitmapForTeam(loadImage);
        loadImage.mo395n();
        f3413f = gameEngine.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3414g = Team.createBitmapForTeam(f3413f);
    }

    /* renamed from: K */
    public boolean m4554K() {
        GameEngine.getInstance();
        this.image = f3409b;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1508h);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4533d() {
        if (this.isDead) {
            return f3409b;
        }
        return f3408a[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4530k() {
        return null;
    }

    /* renamed from: a */
    public void m4549a(int i) {
    }

    public AntiNukeLaucher(boolean z) {
        super(z);
        this.f3415h = new PointF();
        this.f3416i = new Rect();
        this.image = f3408a[f3408a.length - 1];
        m2878b(this.image);
        this.radius = 24.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 2800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-1, -1, 1, 1);
        this.f3422o.m7208a(-1, -1, 1, 1);
    }

    /* renamed from: a */
    public void m4550a(float f) {
        super.update(f);
        if (isActive() && !this.isDead && this.f3411d > 0) {
            Projectile projectile = null;
            this.f3412e = CommonUtils.m2368a(this.f3412e, f);
            if (this.f3412e == 0.0f) {
                this.f3412e = 15.0f;
                Iterator it = Projectile.f1082a.iterator();
                while (it.hasNext()) {
                    Projectile projectile2 = (Projectile) it.next();
                    if (projectile2.f1003D && projectile2.height > 50.0f && CommonUtils.m2366a(this.f6951ek, this.f6952el, projectile2.f6951ek, projectile2.f6952el) < 2200.0f * 2200.0f && CommonUtils.m2366a(this.f6951ek, this.f6952el, projectile2.f987n, projectile2.f988o) < 1000000.0f && (projectile2.f983j == null || (!projectile2.f983j.team.m6342d(this.team) && projectile2.f983j.team != this.team))) {
                        if (!m4548a(projectile2)) {
                            projectile = projectile2;
                        }
                    }
                }
            }
            if (projectile != null) {
                m4541b(projectile);
            }
        }
    }

    /* renamed from: a */
    public boolean m4548a(Projectile projectile) {
        Object[] m559a = Projectile.f1082a.m559a();
        int i = Projectile.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile2 = (Projectile) m559a[i2];
            if (projectile2 != projectile && projectile2.f990q == projectile) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m4541b(Projectile projectile) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3411d <= 0) {
            return;
        }
        this.f3411d--;
        PointF m4555E = m4555E(0);
        Projectile m6509a = Projectile.m6509a(this, m4555E.x, m4555E.y);
        m6509a.setDrawLayer(10);
        m6509a.f1015P = (short) 10;
        m6509a.f1017R = (short) 0;
        m6509a.f997x = 1.0f;
        m6509a.f1053aC = true;
        m6509a.f990q = projectile;
        m6509a.lifeTimer = 99999.0f;
        m6509a.speed = 0.2f;
        m6509a.f991r = 6.5f;
        m6509a.color = Color.argb(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        m6509a.directDamage = 600.0f;
        m6509a.f1058aH = true;
        m6509a.f1063aM = true;
        m6509a.f1067aQ = true;
        m6509a.f1002C = true;
        m6509a.f1059aI = 80.0f;
        m6509a.f1060aJ = 100.0f;
        m6509a.f1062aL = 2.0f;
        gameEngine.effects.emitLight(m4555E.x, m4555E.y, this.height, -1127220);
        C0745e m2531d = gameEngine.effects.m2531d(m4555E.x, m4555E.y, 0.0f, -1);
        if (m2531d != null) {
            m2531d.f4730H = 0.5f;
            m2531d.f4729G = 2.1f;
            m2531d.f4786ar = (short) 2;
            m2531d.f4745W = 90.0f;
            m2531d.f4746X = m2531d.f4745W;
            m2531d.f4744V = 0.0f;
        }
        gameEngine.audio.m3003a(AudioEngine.f4059D, 0.15f, 1.5f, m4555E.x, m4555E.y);
    }

    /* renamed from: E */
    public PointF m4555E(int i) {
        f3980bf.m7213a(this.f6951ek, this.f6952el - 9.0f);
        return f3980bf;
    }

    /* renamed from: a */
    public void m4546a(Unit unit, int i) {
    }

    /* renamed from: m */
    public float m4528m() {
        return 1000.0f;
    }

    /* renamed from: c */
    public float m4537c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m4542b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean m4538c(float f) {
        return super.m4418c(f);
    }

    /* renamed from: c */
    public UnitType m4527r() {
        return UnitType.f1763D;
    }

    /* renamed from: l */
    public boolean m4529l() {
        return false;
    }

    /* renamed from: g */
    public float m4531g(int i) {
        return 1.0f;
    }

    /* renamed from: bU */
    public float m4540bU() {
        return super.m4421bU();
    }

    /* renamed from: L */
    public void m4553L() {
        this.f3411d++;
    }

    /* renamed from: a */
    public void m4545a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3418k.m6095N())) {
            m4553L();
        }
    }

    /* renamed from: cl */
    public C0208c m4534cl() {
        if (this.f3411d < 4) {
            return f3418k.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: cj */
    public boolean m4535cj() {
        return false;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.c$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c$1.class */
    final class C04861 extends Action {
        C04861(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return VariableScope.nullOrMissingString;
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.antiNukeCount", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            if (mo6186b(unit, false) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: K */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1474a;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1464a;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return ((AntiNukeLaucher) unit).f3411d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.c$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c$2.class */
    final class C04872 extends AbstractC0228w {
        C04872(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.buildAntiNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 4000;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 7.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            AntiNukeLaucher antiNukeLaucher = (AntiNukeLaucher) unit;
            if (antiNukeLaucher.f3411d + antiNukeLaucher.m4429a(m6095N(), z) >= 12.0f) {
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
            return EnumC0225t.f1467d;
        }
    }

    /* renamed from: N */
    public ArrayList m4552N() {
        return f3419l;
    }

    /* renamed from: e */
    public void m4532e(float f) {
        super.mo458e(f);
    }

    /* renamed from: O */
    public void m4551O() {
    }

    /* renamed from: ca */
    public void m4536ca() {
        C1117y.m490a((Unit) this, 990.0f, false, true);
    }

    /* renamed from: a */
    public boolean m4544a(GameEngine gameEngine) {
        if (this.f1643cE) {
            return true;
        }
        return super.m5882a(gameEngine);
    }

    /* renamed from: a */
    public float m4547a(Unit unit, float f, Projectile projectile) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo4499a(unit, f, projectile);
    }
}
