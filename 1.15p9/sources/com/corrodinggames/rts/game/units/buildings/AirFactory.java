package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class AirFactory extends AbstractC0498i {

    /* renamed from: f */
    int f3357f;

    /* renamed from: g */
    float f3358g;

    /* renamed from: a */
    static BitmapOrTexture f3359a = null;

    /* renamed from: b */
    static BitmapOrTexture f3360b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3361c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] f3362d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture f3363e = null;

    /* renamed from: h */
    static final C0208c f3364h = C0208c.m6280a(String.valueOf(110));

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3357f);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1463b() >= 17) {
            m4669a(c0876k.m1454f());
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3359a = gameEngine.graphics.loadImage(R.drawable.air_factory);
        f3360b = gameEngine.graphics.loadImage(R.drawable.air_factory_t2);
        f3363e = gameEngine.graphics.loadImage(R.drawable.air_factory_dead);
        f3361c = Team.createBitmapForTeam(f3359a);
        f3362d = Team.createBitmapForTeam(f3360b);
    }

    /* renamed from: c */
    public UnitType m4660r() {
        return UnitType.f1736c;
    }

    /* renamed from: K */
    public boolean m4673K() {
        this.image = f3363e;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1504d);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4662d() {
        if (this.isDead) {
            return f3363e;
        }
        if (this.team == null) {
            return f3361c[f3361c.length - 1];
        }
        if (this.f3357f == 1) {
            return f3361c[this.team.getId()];
        }
        return f3362d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4661k() {
        return null;
    }

    public AirFactory(boolean z) {
        super(z);
        this.f3357f = 1;
        this.f3358g = 0.0f;
        this.image = f3359a;
        m2884T(40);
        m2883U(61);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-1, -1, 1, 1);
        this.f3422o.m7208a(-1, -1, 1, 2);
    }

    /* renamed from: a */
    public void m4670a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3358g = CommonUtils.m2368a(this.f3358g, f);
        if (this.f3358g == 0.0f) {
            this.f3358g = 27.0f;
            this.f3426s++;
            if (this.f3426s > 4) {
                this.f3426s = 0;
            }
        }
    }

    /* renamed from: a */
    public void m4668a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3364h)) {
            m4669a(2);
            m3229W();
            return;
        }
        super.m4426a(c0499j);
    }

    /* renamed from: V */
    public int m4671V() {
        return this.f3357f;
    }

    /* renamed from: a */
    public void m4669a(int i) {
        if (i == 1) {
            this.f3357f = 1;
        } else if (i == 2 && this.f3357f == 1) {
            this.f3357f = 2;
        }
        mo4500S();
    }

    /* renamed from: cl */
    public C0208c m4663cl() {
        if (this.f3357f == 1) {
            return f3364h;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m4667a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0484b());
        }
        if (i > 1) {
            arrayList.add(new C0217l(UnitType.f1759z, 3));
            arrayList.add(new C0217l(UnitType.f1747n, 4));
            arrayList.add(new C0217l(UnitType.f1772M, 5));
        }
    }

    /* renamed from: N */
    public ArrayList m4672N() {
        return m4664c().mo5716a(m4671V());
    }

    /* renamed from: bJ */
    public boolean m4665bJ() {
        return true;
    }
}
