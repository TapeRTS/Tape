package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class ExperimentalLandFactory extends AbstractC0498i {

    /* renamed from: f */
    boolean f3439f;

    /* renamed from: a */
    static BitmapOrTexture f3440a = null;

    /* renamed from: b */
    static BitmapOrTexture f3441b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3442c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] f3443d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture f3444e = null;

    /* renamed from: g */
    static Action f3445g = new C04911(110);

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3439f);
        c0859ar.m1554c(0);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            m4488L();
        }
        c0876k.m1457d();
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3440a = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_front);
        f3441b = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_base);
        f3444e = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_dead);
        f3442c = Team.createBitmapForTeam(f3440a);
    }

    /* renamed from: c */
    public UnitType m4476r() {
        return UnitType.f1766G;
    }

    /* renamed from: K */
    public boolean m4489K() {
        GameEngine.getInstance();
        this.f3420m = null;
        this.image = f3444e;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1508h);
        return true;
    }

    /* renamed from: a */
    public void m4485a(int i) {
    }

    /* renamed from: d */
    public BitmapOrTexture m4478d() {
        if (this.isDead) {
            return f3444e;
        }
        if (this.team == null) {
            return f3442c[f3442c.length - 1];
        }
        if (!this.f3439f) {
            return f3442c[this.team.getId()];
        }
        return f3443d[this.team.getId()];
    }

    /* renamed from: S */
    public void m4486S() {
        super.mo4500S();
        if (this.isDead) {
            this.f3420m = null;
        } else {
            this.f3420m = f3441b;
        }
    }

    /* renamed from: k */
    public BitmapOrTexture m4477k() {
        return null;
    }

    public ExperimentalLandFactory(boolean z) {
        super(z);
        this.image = f3440a;
        this.f3420m = f3441b;
        m2878b(this.image);
        this.radius = 55.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 3200.0f;
        this.f1631cs = this.f1632ct;
        setDrawLayer(4);
        this.f3421n.m7208a(-2, -2, 2, 2);
        this.f3422o.m7208a(-2, -2, 2, 4);
    }

    /* renamed from: a */
    public void m4484a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3445g.m6095N())) {
            m4488L();
        } else {
            super.m4426a(c0499j);
        }
    }

    /* renamed from: L */
    public void m4488L() {
        if (!this.f3439f) {
            this.f3439f = true;
            m4486S();
        }
    }

    /* renamed from: cl */
    public C0208c m4479cl() {
        return Action.f1461i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.f$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f$1.class */
    final class C04911 extends AbstractC0228w {
        C04911(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "-Allows factory to build Tech 2 units";
        }

        /* renamed from: b */
        public String mo6187b() {
            return C0820a.m1886a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo6185c() {
            return 1500;
        }

        /* renamed from: K */
        public float mo4250K() {
            return 5.0E-4f;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            ExperimentalLandFactory experimentalLandFactory = (ExperimentalLandFactory) unit;
            if (experimentalLandFactory.f3439f || experimentalLandFactory.m4429a(m6095N(), z) > 0) {
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

    /* renamed from: a */
    public static void m4483a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(UnitType.f1765F, 2));
        arrayList.add(new C0217l(UnitType.f1774O, 3));
    }

    /* renamed from: N */
    public ArrayList m4487N() {
        return m4480c().mo5716a(mo3230V());
    }

    /* renamed from: bJ */
    public boolean m4481bJ() {
        return true;
    }
}
