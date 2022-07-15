package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class SupplyDepot extends Factory {

    /* renamed from: f */
    int f3384f = 1;

    /* renamed from: g */
    float f3385g = 0.0f;

    /* renamed from: h */
    int f3386h = 0;

    /* renamed from: a */
    static BitmapOrTexture f3376a = null;

    /* renamed from: b */
    static BitmapOrTexture f3377b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3378c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] f3379d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture f3380e = null;

    /* renamed from: i */
    public static int f3381i = 0;

    /* renamed from: j */
    static Action f3382j = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.v.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.supplyDepot.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("units.supplyDepot.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            SupplyDepot supplyDepot = (SupplyDepot) unit;
            if (supplyDepot.f3384f != 1 || supplyDepot.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        /* renamed from: J */
        public UnitType mo2734i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1439c;
        }
    };

    /* renamed from: k */
    static ArrayList f3383k = new ArrayList();

    static {
        f3383k.add(f3382j);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f3384f);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        upgrade(inputNetStream.readInt());
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.supplyDepot;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3376a = gameEngine.graphics.loadImage(R.drawable.supply_depot);
        f3377b = gameEngine.graphics.loadImage(R.drawable.supply_depot_t2);
        f3378c = Team.createBitmapForTeam(f3376a);
        f3379d = Team.createBitmapForTeam(f3377b);
        f3380e = gameEngine.graphics.loadImage(R.drawable.supply_depot_dead);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2237a(this.x, this.y, this.height);
        this.image = f3380e;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3380e;
        }
        if (this.team == null) {
            return f3378c[f3378c.length - 1];
        }
        if (this.f3384f == 1) {
            return f3378c[this.team.getId()];
        }
        return f3379d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public SupplyDepot(boolean z) {
        super(z);
        this.image = f3376a;
        m2332a(this.image, 1);
        this.radius = 20.0f;
        this.displayRadius = this.radius;
        this.maxHp = 800.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 0, 0);
        this.softFootprint.m4664a(this.footprint);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3382j.m3834L())) {
            m2874L();
            m2646V();
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        this.f3384f = i;
    }

    /* renamed from: L */
    public void m2874L() {
        if (this.f3384f == 1) {
            this.f3384f = 2;
            mo2650R();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3384f == 1) {
            return f3382j.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3383k;
    }
}