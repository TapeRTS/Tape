package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class SupplyDepot extends AbstractC0498i {

    /* renamed from: f */
    int f3555f;

    /* renamed from: g */
    float f3556g;

    /* renamed from: h */
    int f3557h;

    /* renamed from: a */
    static BitmapOrTexture f3558a = null;

    /* renamed from: b */
    static BitmapOrTexture f3559b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3560c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] f3561d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture f3562e = null;

    /* renamed from: i */
    public static int f3563i = 0;

    /* renamed from: j */
    static Action f3564j = new C05151(102);

    /* renamed from: k */
    static ArrayList f3565k = new ArrayList();

    static {
        f3565k.add(f3564j);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3555f);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        m4236a(c0876k.m1454f());
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public UnitType m4229r() {
        return UnitType.f1773N;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3558a = gameEngine.graphics.loadImage(R.drawable.supply_depot);
        f3559b = gameEngine.graphics.loadImage(R.drawable.supply_depot_t2);
        f3560c = Team.createBitmapForTeam(f3558a);
        f3561d = Team.createBitmapForTeam(f3559b);
        f3562e = gameEngine.graphics.loadImage(R.drawable.supply_depot_dead);
    }

    /* renamed from: K */
    public boolean m4240K() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        this.image = f3562e;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return false;
    }

    /* renamed from: d */
    public BitmapOrTexture m4231d() {
        if (this.isDead) {
            return f3562e;
        }
        if (this.team == null) {
            return f3560c[f3560c.length - 1];
        }
        if (this.f3555f == 1) {
            return f3560c[this.team.getId()];
        }
        return f3561d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4230k() {
        return null;
    }

    public SupplyDepot(boolean z) {
        super(z);
        this.f3555f = 1;
        this.f3556g = 0.0f;
        this.f3557h = 0;
        this.image = f3558a;
        m2879a(this.image, 1);
        this.radius = 20.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-1, -1, 0, 0);
        this.f3422o.m7207a(this.f3421n);
    }

    /* renamed from: a */
    public void m4237a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
        }
    }

    /* renamed from: a */
    public void m4235a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3564j.m6095N())) {
            m4239L();
            m3229W();
        }
    }

    /* renamed from: a */
    public void m4236a(int i) {
        this.f3555f = i;
    }

    /* renamed from: L */
    public void m4239L() {
        if (this.f3555f == 1) {
            this.f3555f = 2;
            mo4500S();
        }
    }

    /* renamed from: cl */
    public C0208c m4232cl() {
        if (this.f3555f == 1) {
            return f3564j.m6095N();
        }
        return Action.f1461i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.v$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v$1.class */
    final class C05151 extends AbstractC0228w {
        C05151(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return C0820a.m1886a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 1000;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            SupplyDepot supplyDepot = (SupplyDepot) unit;
            if (supplyDepot.f3555f != 1 || supplyDepot.m4429a(m6095N(), z) > 0) {
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
    public ArrayList m4238N() {
        return f3565k;
    }
}
