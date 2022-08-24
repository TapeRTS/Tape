package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class LandFactory extends AbstractC0498i {

    /* renamed from: g */
    boolean f3500g;

    /* renamed from: a */
    static BitmapOrTexture f3501a = null;

    /* renamed from: b */
    static BitmapOrTexture f3502b = null;

    /* renamed from: c */
    static BitmapOrTexture f3503c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3504d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3505e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3506f = null;

    /* renamed from: h */
    static final C0208c f3507h = C0208c.m6280a(String.valueOf(110));

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3500g);
        c0859ar.m1554c(0);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            m4361a(2);
        }
        c0876k.m1457d();
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3501a = gameEngine.graphics.loadImage(R.drawable.land_factory_front);
        f3502b = gameEngine.graphics.loadImage(R.drawable.land_factory_front_t2);
        f3503c = gameEngine.graphics.loadImage(R.drawable.land_factory_back);
        f3506f = gameEngine.graphics.loadImage(R.drawable.land_factory_dead);
        f3504d = Team.createBitmapForTeam(f3501a);
        f3505e = Team.createBitmapForTeam(f3502b);
    }

    /* renamed from: c */
    public UnitType m4350r() {
        return UnitType.f1735b;
    }

    /* renamed from: K */
    public boolean m4365K() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2563a(this.f6951ek, this.f6952el, this.height);
        this.f3420m = null;
        this.image = f3506f;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return true;
    }

    /* renamed from: S */
    public void m4363S() {
        super.mo4500S();
        if (this.isDead) {
            this.f3420m = null;
        } else {
            this.f3420m = f3503c;
        }
    }

    /* renamed from: d */
    public BitmapOrTexture m4353d() {
        if (this.isDead) {
            return f3506f;
        }
        if (this.team == null) {
            return f3504d[f3504d.length - 1];
        }
        if (!this.f3500g) {
            return f3504d[this.team.getId()];
        }
        return f3505e[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4351k() {
        return null;
    }

    public LandFactory(boolean z) {
        super(z);
        this.image = f3501a;
        this.f3420m = f3503c;
        m2878b(this.image);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1200.0f;
        this.f1631cs = this.f1632ct;
        setDrawLayer(3);
        this.f3421n.m7208a(-1, -1, 1, 1);
        this.f3422o.m7208a(-1, -1, 1, 3);
    }

    /* renamed from: a */
    public void m4360a(C0499j c0499j) {
        if (f3507h.m6283a(c0499j.f3491j)) {
            m4361a(2);
            m3229W();
            return;
        }
        super.m4426a(c0499j);
    }

    /* renamed from: a */
    public void m4361a(int i) {
        if (i == 1) {
            this.f3500g = false;
        } else if (i == 2 && !this.f3500g) {
            this.f3500g = true;
        }
        m4363S();
    }

    /* renamed from: cl */
    public C0208c m4354cl() {
        if (!this.f3500g) {
            return f3507h;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m4359a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0503n());
        }
        arrayList.add(new C0217l(UnitType.f1741h, 1));
        arrayList.add(new C0217l(UnitType.f1742i, 2));
        arrayList.add(new C0217l(UnitType.f1743j, 3));
        arrayList.add(new C0217l(UnitType.f1744k, 4));
        if (i >= 2) {
            arrayList.add(new C0217l(UnitType.f1752s, 5));
            arrayList.add(new C0217l(UnitType.f1756w, 6));
            arrayList.add(new C0217l(UnitType.f1757x, 7));
            arrayList.add(new C0217l(UnitType.f1751r, 8));
        }
    }

    /* renamed from: N */
    public ArrayList m4364N() {
        return m4356c().mo5716a(m4362V());
    }

    /* renamed from: V */
    public int m4362V() {
        if (this.f3500g) {
            return 2;
        }
        return 1;
    }

    /* renamed from: dr */
    public C0500k m4352dr() {
        return new C0504o(this);
    }

    /* renamed from: bJ */
    public boolean m4357bJ() {
        return true;
    }

    /* renamed from: cZ */
    public float m4355cZ() {
        return super.m5821cZ() - 8.0f;
    }
}
