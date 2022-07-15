package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class LandFactory extends Factory {

    /* renamed from: g */
    boolean f3328g;

    /* renamed from: a */
    static BitmapOrTexture f3321a = null;

    /* renamed from: b */
    static BitmapOrTexture f3322b = null;

    /* renamed from: c */
    static BitmapOrTexture f3323c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3324d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3325e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3326f = null;

    /* renamed from: h */
    static final C0202c f3327h = C0202c.m3859a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f3328g);
        outputNetStream.writeByte(0);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        if (inputNetStream.readBoolean()) {
            upgrade(2);
        }
        inputNetStream.readByte();
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public static void m2904b() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3321a = gameEngine.graphics.loadImage(R.drawable.land_factory_front);
        f3322b = gameEngine.graphics.loadImage(R.drawable.land_factory_front_t2);
        f3323c = gameEngine.graphics.loadImage(R.drawable.land_factory_back);
        f3326f = gameEngine.graphics.loadImage(R.drawable.land_factory_dead);
        f3324d = Team.createBitmapForTeam(f3321a);
        f3325e = Team.createBitmapForTeam(f3322b);
    }

    /* renamed from: c */
    public UnitType m2903c() {
        return UnitType.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2237a(this.x, this.y, this.height);
        this.image_back = null;
        this.image = f3326f;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: R */
    public void mo2650R() {
        super.mo2650R();
        if (this.dead) {
            this.image_back = null;
        } else {
            this.image_back = f3323c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3326f;
        }
        if (this.team == null) {
            return f3324d[f3324d.length - 1];
        }
        if (!this.f3328g) {
            return f3324d[this.team.getId()];
        }
        return f3325e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public LandFactory(boolean z) {
        super(z);
        this.image = f3321a;
        this.image_back = f3323c;
        m2331b(this.image);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1200.0f;
        this.hp = this.maxHp;
        setDrawLayer(3);
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (f3327h.m3862a(item.uIndex)) {
            upgrade(2);
            m2646V();
            return;
        }
        super.mo2873a(item);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        if (i == 1) {
            this.f3328g = false;
        } else if (i == 2 && !this.f3328g) {
            this.f3328g = true;
        }
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (!this.f3328g) {
            return f3327h;
        }
        return Action.f1432h;
    }

    /* renamed from: a */
    public static void m2905a(ArrayList arrayList, int i) {
        arrayList.add(new C0214o());
        if (i == 1) {
            arrayList.add(new C0485n());
        }
        arrayList.add(new C0211l(UnitType.builder, 1));
        arrayList.add(new C0211l(UnitType.tank, 2));
        arrayList.add(new C0211l(UnitType.hoverTank, 3));
        arrayList.add(new C0211l(UnitType.artillery, 4));
        if (i >= 2) {
            arrayList.add(new C0211l(UnitType.hovercraft, 5));
            arrayList.add(new C0211l(UnitType.heavyTank, 6));
            arrayList.add(new C0211l(UnitType.heavyHoverTank, 7));
            arrayList.add(new C0211l(UnitType.laserTank, 8));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return m2903c().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        if (this.f3328g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory
    /* renamed from: dp */
    public C0482k mo2902dp() {
        return new C0486o(this);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo2895cX() {
        return super.mo2895cX() - 8.0f;
    }
}