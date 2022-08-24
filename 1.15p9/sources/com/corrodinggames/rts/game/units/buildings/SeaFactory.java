package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class SeaFactory extends AbstractC0498i {

    /* renamed from: a */
    static BitmapOrTexture f3548a = null;

    /* renamed from: b */
    static BitmapOrTexture f3549b = null;

    /* renamed from: c */
    static BitmapOrTexture f3550c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3551d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3552e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3553f = null;

    /* renamed from: g */
    static final C0208c f3554g = C0208c.m6280a(String.valueOf(110));

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3548a = gameEngine.graphics.loadImage(R.drawable.sea_factory);
        f3549b = gameEngine.graphics.loadImage(R.drawable.sea_factory_t2);
        f3553f = gameEngine.graphics.loadImage(R.drawable.sea_factory_dead);
        f3551d = Team.createBitmapForTeam(f3548a);
        f3552e = Team.createBitmapForTeam(f3549b);
    }

    /* renamed from: c */
    public UnitType m4251r() {
        return UnitType.f1737d;
    }

    /* renamed from: K */
    public boolean m4264K() {
        this.f3420m = null;
        this.image = f3553f;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1504d);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4254d() {
        if (this.isDead) {
            return f3553f;
        }
        if (this.team == null) {
            return f3551d[f3551d.length - 1];
        }
        if (this.f3425r == 1) {
            return f3551d[this.team.getId()];
        }
        return f3552e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4252k() {
        return null;
    }

    public SeaFactory(boolean z) {
        super(z);
        this.image = f3548a;
        m2878b(f3548a);
        this.radius = 45.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        setDrawLayer(2);
        this.f3421n.m7208a(-1, -1, 1, 2);
        this.f3422o.m7208a(-2, -1, 2, 4);
    }

    /* renamed from: a */
    public void m4260a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3554g)) {
            m4261a(2);
            m3229W();
            return;
        }
        super.m4426a(c0499j);
    }

    /* renamed from: ds */
    public int m4253ds() {
        return -20;
    }

    /* renamed from: V */
    public int m4262V() {
        return this.f3425r;
    }

    /* renamed from: a */
    public void m4261a(int i) {
        if (i == 1) {
            this.f3425r = 1;
        } else if (i == 2 && this.f3425r == 1) {
            this.f3425r = 2;
        }
        mo4500S();
    }

    /* renamed from: cl */
    public C0208c m4255cl() {
        if (this.f3425r == 1) {
            return f3554g;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m4259a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0513u());
        arrayList.add(new C0217l(UnitType.f1771L, 1));
        arrayList.add(new C0217l(UnitType.f1749p, 2));
        arrayList.add(new C0217l(UnitType.f1748o, 3));
        arrayList.add(new C0217l(UnitType.f1752s, 4));
        arrayList.add(new C0217l(UnitType.f1754u, 5));
        arrayList.add(new C0217l(UnitType.f1770K, 6));
        if (i > 1) {
        }
    }

    /* renamed from: N */
    public ArrayList m4263N() {
        return m4256c().mo5716a(m4262V());
    }

    /* renamed from: bJ */
    public boolean m4257bJ() {
        return true;
    }
}
