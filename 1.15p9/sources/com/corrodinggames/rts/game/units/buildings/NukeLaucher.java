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
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class NukeLaucher extends AbstractC0498i {

    /* renamed from: c */
    int f3520c;

    /* renamed from: f */
    PointF f3521f;

    /* renamed from: g */
    Rect f3522g;

    /* renamed from: a */
    static BitmapOrTexture[] f3523a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture f3524b = null;

    /* renamed from: d */
    static BitmapOrTexture f3525d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3526e = new BitmapOrTexture[10];

    /* renamed from: h */
    static Action f3527h = new C05081(142);

    /* renamed from: i */
    static Action f3528i = new C05092(143);

    /* renamed from: j */
    static ArrayList f3529j = new ArrayList();

    static {
        f3529j.add(f3527h);
        f3529j.add(f3528i);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3520c);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3520c = c0876k.m1454f();
        super.mo2877a(c0876k);
    }

    /* renamed from: v */
    public BitmapOrTexture m4293v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3526e[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3524b = gameEngine.graphics.loadImage(R.drawable.nuke_launcher_dead);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.nuke_launcher);
        f3523a = Team.createBitmapForTeam(loadImage);
        loadImage.mo395n();
        f3525d = gameEngine.graphics.loadImage(R.drawable.unit_icon_building);
        f3526e = Team.createBitmapForTeam(f3525d);
    }

    /* renamed from: bp */
    public int m4304bp() {
        return 20;
    }

    /* renamed from: K */
    public boolean m4317K() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.image = f3524b;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1508h);
        float f = this.f6951ek;
        float f2 = this.f6952el;
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e emitLight = gameEngine.effects.emitLight(f, f2, this.height, Color.argb(255, 255, 255, 255));
        if (emitLight != null) {
            emitLight.f4730H = 8.0f;
            emitLight.f4729G = 5.0f;
            emitLight.f4728F = 0.9f;
            emitLight.f4745W = 20.0f;
            emitLight.f4746X = emitLight.f4745W;
            emitLight.f4720s = true;
        }
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e m2533c = gameEngine.effects.m2533c(f, f2, 0.0f, -1127220);
        if (m2533c != null) {
            m2533c.f4730H = 0.2f;
            m2533c.f4729G = 2.0f;
            m2533c.f4786ar = (short) 2;
            m2533c.f4745W = 45.0f;
            m2533c.f4746X = m2533c.f4745W;
            m2533c.f4744V = 0.0f;
        }
        gameEngine.effects.m2561a(this.f6951ek, this.f6952el, this.height, 40.0f, 120.0f);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4299d() {
        if (this.isDead) {
            return f3524b;
        }
        return f3523a[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4296k() {
        return null;
    }

    /* renamed from: a */
    public void m4312a(int i) {
    }

    public NukeLaucher(boolean z) {
        super(z);
        this.f3521f = new PointF();
        this.f3522g = new Rect();
        this.image = f3523a[f3523a.length - 1];
        m2878b(this.image);
        this.radius = 40.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1500.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-2, -1, 2, 1);
        this.f3422o.m7208a(-2, -1, 2, 2);
    }

    /* renamed from: a */
    public void m4314a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
        }
    }

    /* renamed from: E */
    public PointF m4318E(int i) {
        f3980bf.m7213a(this.f6951ek, this.f6952el - 3.0f);
        return f3980bf;
    }

    /* renamed from: a */
    public void m4309a(Unit unit, int i) {
    }

    /* renamed from: c */
    public float m4301c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m4306b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean m4302c(float f) {
        return super.m4418c(f);
    }

    /* renamed from: c */
    public UnitType m4294r() {
        return UnitType.f1762C;
    }

    /* renamed from: l */
    public boolean m4295l() {
        return false;
    }

    /* renamed from: g */
    public float m4297g(int i) {
        return 1.0f;
    }

    /* renamed from: bU */
    public float m4305bU() {
        return super.m4421bU();
    }

    /* renamed from: a */
    public void m4313a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3520c <= 0) {
            return;
        }
        if (CommonUtils.m2366a(this.f6951ek, this.f6952el, f, f2) < 202500.0f) {
            if (this.team == gameEngine.f6093bs) {
                gameEngine.f6111bS.m2008b("Nuke target too close");
                return;
            }
            return;
        }
        this.f3520c--;
        PointF m4318E = m4318E(0);
        m4310a(this, m4318E.x, m4318E.y, f, f2).f982i = 5.0f;
        C0745e emitLight = gameEngine.effects.emitLight(m4318E.x, m4318E.y, this.height, -1127220);
        if (emitLight != null) {
            emitLight.f4744V = 5.0f;
            emitLight.f4730H = 2.1f;
            emitLight.f4729G = 2.1f;
            emitLight.f4786ar = (short) 2;
            emitLight.f4721t = true;
            emitLight.f4722u = 70.0f;
            emitLight.f4745W = 370.0f;
            emitLight.f4746X = emitLight.f4745W;
            emitLight.f4728F = 1.0f;
        }
        C0745e m2531d = gameEngine.effects.m2531d(m4318E.x, m4318E.y, 0.0f, -1);
        if (m2531d != null) {
            m2531d.f4730H = 1.0f;
            m2531d.f4729G = 3.1f;
            m2531d.f4786ar = (short) 2;
            m2531d.f4745W = 170.0f;
            m2531d.f4746X = m2531d.f4745W;
            m2531d.f4744V = 5.0f + 20.0f;
        }
        gameEngine.audio.m3003a(AudioEngine.f4059D, 0.27f, 0.8f, m4318E.x, m4318E.y);
    }

    /* renamed from: a */
    public static Projectile m4310a(Unit unit, float f, float f2, float f3, float f4) {
        Projectile m6509a = Projectile.m6509a(unit, f, f2);
        m6509a.setDrawLayer(10);
        m6509a.f1015P = (short) 0;
        m6509a.f1016Q = (short) 1;
        m6509a.f1017R = (short) 1;
        m6509a.f997x = 1.0f;
        m6509a.f1053aC = true;
        m6509a.f986m = true;
        m6509a.f987n = f3;
        m6509a.f988o = f4;
        m6509a.lifeTimer = 99999.0f;
        m6509a.speed = 0.1f;
        m6509a.f991r = 2.7f;
        m6509a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        m6509a.directDamage = 300.0f;
        m6509a.f1058aH = true;
        m6509a.f1063aM = true;
        m6509a.f1067aQ = true;
        m6509a.f1002C = true;
        m6509a.f1003D = true;
        m6509a.f1059aI = 80.0f;
        m6509a.f1060aJ = 100.0f;
        m6509a.f1062aL = 1.1f;
        m6509a.f1024Y = 5400.0f;
        m6509a.f1025Z = 250.0f;
        m6509a.f1029ad = true;
        m6509a.f1030ae = false;
        m6509a.f1040ao = true;
        m6509a.f1022W = 75.0f;
        m6509a.f1023X = m6509a.f1022W;
        m6509a.f1076aY = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e m2549a = gameEngine.effects.m2549a(m6509a, -1118720);
        if (m2549a != null) {
            m2549a.f4745W = 1300.0f;
            m2549a.f4746X = m2549a.f4745W;
            m2549a.f4728F = 0.2f;
            m2549a.f4730H = 1.0f;
        }
        return m6509a;
    }

    /* renamed from: L */
    public void m4316L() {
        this.f3520c++;
    }

    /* renamed from: a */
    public void m4308a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3528i.m6095N())) {
            m4316L();
        }
    }

    /* renamed from: cl */
    public C0208c m4300cl() {
        return Action.f1461i;
    }

    /* renamed from: a */
    public void m4311a(Action action, boolean z, PointF pointF, Unit unit) {
        if (z) {
            return;
        }
        if (action == f3527h) {
            m4313a(pointF.x, pointF.y);
        } else {
            super.m5892a(action, z, pointF, unit);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q$1.class */
    final class C05081 extends Action {
        C05081(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return ((NukeLaucher) unit).f3520c;
        }

        /* renamed from: K */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return ((NukeLaucher) unit).f3520c > 0;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.q$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q$2.class */
    final class C05092 extends AbstractC0228w {
        C05092(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("gui.actions.buildNuke.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.buildNuke", new Object[0]);
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
            NukeLaucher nukeLaucher = (NukeLaucher) unit;
            if (nukeLaucher.f3520c + nukeLaucher.m4429a(m6095N(), z) >= 4.0f) {
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
    public ArrayList m4315N() {
        return f3529j;
    }

    /* renamed from: e */
    public void m4298e(float f) {
        super.mo458e(f);
        C1117y.m477b((Unit) this, 450.0f, false);
    }
}
