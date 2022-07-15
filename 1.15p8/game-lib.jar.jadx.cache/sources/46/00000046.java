package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class AirFactory extends Factory {

    /* renamed from: f */
    int f3185f = 1;

    /* renamed from: g */
    float frameUpdate = 0.0f;

    /* renamed from: a */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: b */
    static BitmapOrTexture IMAGE_T2 = null;

    /* renamed from: c */
    static BitmapOrTexture[] bitmap = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: h */
    static final C0202c f3184h = C0202c.m3859a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f3185f);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream stream) {
        if (stream.m1237b() >= 17) {
            upgrade(stream.readInt());
        }
        super.mo427a(stream);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.air_factory);
        IMAGE_T2 = game.graphics.loadImage(R.drawable.air_factory_t2);
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.air_factory_dead);
        bitmap = Team.createBitmapForTeam(IMAGE);
        IMAGE_TEAMS = Team.createBitmapForTeam(IMAGE_T2);
    }

    // getUnitType
    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3795d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        if (this.team == null) {
            return bitmap[bitmap.length - 1];
        }
        if (this.f3185f == 1) {
            return bitmap[this.team.getId()];
        }
        return IMAGE_TEAMS[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public AirFactory(boolean z) {
        super(z);
        this.image = IMAGE;
        setObjectWidth(40);
        setObjectHeight(61);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float deltaSpeed) {
        super.update(deltaSpeed);
        if (!isActive() || this.dead) {
            return;
        }
        this.frameUpdate = CommonUtils.toZero(this.frameUpdate, deltaSpeed);
        if (this.frameUpdate == 0.0f) {
            this.frameUpdate = 27.0f;
            this.drawFrame++;
            if (this.drawFrame > 4) {
                this.drawFrame = 0;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3184h)) {
            upgrade(2);
            m2646V();
            return;
        }
        super.mo2873a(item);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return this.f3185f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int lev) {
        if (lev == 1) {
            this.f3185f = 1;
        } else if (lev == 2 && this.f3185f == 1) {
            this.f3185f = 2;
        }
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3185f == 1) {
            return f3184h;
        }
        return Action.f1432h;
    }

    /* renamed from: a */
    public static void m3038a(ArrayList arrayList, int i) {
        arrayList.add(new C0214o());
        if (i == 1) {
            arrayList.add(new C0466b());
        }
        if (i > 1) {
            arrayList.add(new C0211l(UnitType.dropship, 3));
            arrayList.add(new C0211l(UnitType.gunShip, 4));
            arrayList.add(new C0211l(UnitType.amphibiousJet, 5));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return getUnitType().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return true;
    }
}