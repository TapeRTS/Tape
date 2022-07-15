package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class SeaFactory extends Factory {

    /* renamed from: a */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: b */
    static BitmapOrTexture f3370b = null;

    /* renamed from: c */
    static BitmapOrTexture f3371c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3372d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3373e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3374f = null;

    /* renamed from: g */
    static final C0202c f3375g = C0202c.m3859a(String.valueOf(110));

    /* renamed from: b */
    public static void m2880b() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.sea_factory);
        f3370b = game.graphics.loadImage(R.drawable.sea_factory_t2);
        f3374f = game.graphics.loadImage(R.drawable.sea_factory_dead);
        f3372d = Team.createBitmapForTeam(IMAGE);
        f3373e = Team.createBitmapForTeam(f3370b);
    }

    /* renamed from: c */
    public UnitType m2878c() {
        return UnitType.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        this.image_back = null;
        this.image = f3374f;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3795d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3374f;
        }
        if (this.team == null) {
            return f3372d[f3372d.length - 1];
        }
        if (this.f3247r == 1) {
            return f3372d[this.team.getId()];
        }
        return f3373e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public SeaFactory(boolean z) {
        super(z);
        this.image = IMAGE;
        m2331b(IMAGE);
        this.radius = 45.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        setDrawLayer(2);
        this.footprint.set(-1, -1, 1, 2);
        this.softFootprint.set(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3375g)) {
            upgrade(2);
            m2646V();
            return;
        }
        super.mo2873a(item);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    /* renamed from: dq */
    public int mo2877dq() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return this.f3247r;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        if (i == 1) {
            this.f3247r = 1;
        } else if (i == 2 && this.f3247r == 1) {
            this.f3247r = 2;
        }
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3247r == 1) {
            return f3375g;
        }
        return Action.f1432h;
    }

    /* renamed from: a */
    public static void m2881a(ArrayList arrayList, int i) {
        arrayList.add(new C0214o());
        arrayList.add(new C0495u());
        arrayList.add(new C0211l(UnitType.builderShip, 1));
        arrayList.add(new C0211l(UnitType.gunBoat, 2));
        arrayList.add(new C0211l(UnitType.missileShip, 3));
        arrayList.add(new C0211l(UnitType.hovercraft, 4));
        arrayList.add(new C0211l(UnitType.battleShip, 5));
        arrayList.add(new C0211l(UnitType.attackSubmarine, 6));
        if (i > 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return m2878c().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return true;
    }
}