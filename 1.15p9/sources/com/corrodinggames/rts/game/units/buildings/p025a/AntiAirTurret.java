package com.corrodinggames.rts.game.units.buildings.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.C0499j;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class AntiAirTurret extends Turret {

    /* renamed from: a */
    static BitmapOrTexture f3365a = null;

    /* renamed from: b */
    static BitmapOrTexture f3366b = null;

    /* renamed from: c */
    static BitmapOrTexture f3367c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3368d = new BitmapOrTexture[10];

    /* renamed from: e */
    public static Action f3369e = new C04721(102);

    /* renamed from: f */
    static ArrayList f3370f = new ArrayList();

    static {
        f3370f.add(f3369e);
    }

    /* renamed from: v */
    public BitmapOrTexture m4636v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3368d[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3365a = gameEngine.graphics.loadImage(R.drawable.anti_air_top);
        f3366b = gameEngine.graphics.loadImage(R.drawable.anti_air_top_l2);
        f3367c = gameEngine.graphics.loadImage(R.drawable.unit_icon_building_air_turrent);
        f3368d = Team.createBitmapForTeam(f3367c);
    }

    public AntiAirTurret(boolean z) {
        super(z);
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
    }

    /* renamed from: m */
    public float m4641m() {
        if (!this.f3379j) {
            return 250.0f;
        }
        return 320.0f;
    }

    /* renamed from: b */
    public float m4649b(int i) {
        if (!this.f3379j) {
            return 80.0f;
        }
        return 70.0f;
    }

    /* renamed from: e */
    public float m4643e(int i) {
        if (!this.f3379j) {
            return super.mo3505e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo3505e(i);
    }

    /* renamed from: E */
    public PointF m4658E(int i) {
        if (!this.f3379j || i == 0) {
            return super.m4633E(i);
        }
        float f = isFixedFiring() ? this.direction : this.f1648cJ[i].f1711a;
        PointF G = m4632G(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3980bf.m7213a(G.x + (CommonUtils.m2249i(f2) * 10.0f), G.y + (CommonUtils.sin(f2) * 10.0f));
        return f3980bf;
    }

    /* renamed from: a */
    public void m4655a(Unit unit, int i) {
        PointF m4658E = m4658E(i);
        Projectile m6509a = Projectile.m6509a(this, m4658E.x, m4658E.y);
        PointF K = m3238K(i);
        m6509a.x = K.x;
        m6509a.y = K.y;
        m6509a.speed = 0.3f;
        m6509a.f991r = 6.0f;
        if (!this.f3379j) {
            m6509a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m6509a.directDamage = 60.0f;
            m6509a.lifeTimer = 220.0f;
        } else {
            m6509a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            m6509a.directDamage = 60.0f;
            m6509a.lifeTimer = 250.0f;
            m6509a.speed = 0.5f;
            m6509a.f991r = 7.0f;
        }
        m6509a.f1015P = (short) 4;
        m6509a.f997x = 1.0f;
        m6509a.target = unit;
        m6509a.f1058aH = false;
        m6509a.f1059aI = 0.0f;
        m6509a.f1060aJ = 0.0f;
        m6509a.f1063aM = true;
        m6509a.f1067aQ = true;
        m6509a.f1057aG = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m3003a(AudioEngine.f4042m, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), m4658E.x, m4658E.y);
        gameEngine.effects.m2549a(m6509a, -1118720);
        gameEngine.effects.emitLight(m4658E.x, m4658E.y, this.height, -1127220);
    }

    /* renamed from: c */
    public UnitType m4640r() {
        if (this.f3379j) {
            return UnitType.f1779T;
        }
        return UnitType.f1740g;
    }

    /* renamed from: d */
    public BitmapOrTexture m4644d(int i) {
        if (!this.f3379j) {
            return f3365a;
        }
        return f3366b;
    }

    /* renamed from: af */
    public boolean m4652af() {
        return true;
    }

    /* renamed from: ag */
    public boolean m4651ag() {
        return false;
    }

    /* renamed from: s */
    public void m4638s(float f) {
        if (this.f1648cJ[0].m5749a()) {
            this.f1648cJ[0].f1711a += m4646c(0) * f * 0.1f;
        }
    }

    /* renamed from: g */
    public float m4642g(int i) {
        return 9.0f;
    }

    /* renamed from: c */
    public float m4646c(int i) {
        return 6.0f;
    }

    /* renamed from: B */
    public float m4659B() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean m4637u(int i) {
        if (!this.f3379j) {
            return super.m3020u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.m3020u(i);
    }

    /* renamed from: v */
    public int m4635v(int i) {
        if (!this.f3379j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    /* renamed from: bl */
    public int m4648bl() {
        return 3;
    }

    /* renamed from: r */
    public boolean m4639r(int i) {
        if (!this.f3379j && i > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m4654a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3369e.m6095N())) {
            setTech(2);
            m3229W();
        }
    }

    /* renamed from: cl */
    public C0208c m4645cl() {
        if (!this.f3379j) {
            return f3369e.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public void m4653a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a$1.class */
    final class C04721 extends AbstractC0228w {
        C04721(int i) {
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
            return "Upgrade";
        }

        /* renamed from: c */
        public int mo6185c() {
            return 1200;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.f3379j || turret.m4429a(m6095N(), z) > 0) {
                return false;
            }
            return super.mo4247a(unit, z);
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            if (((Turret) unit).f3379j) {
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

    /* renamed from: a */
    public void setTech(int i) {
        if (i == 1) {
            this.f3379j = false;
        } else if (i == 2 && !this.f3379j) {
            this.f3379j = true;
            this.f1632ct += 600.0f;
            this.f1631cs += 600.0f;
        }
    }

    /* renamed from: N */
    public ArrayList m4657N() {
        return f3370f;
    }
}
