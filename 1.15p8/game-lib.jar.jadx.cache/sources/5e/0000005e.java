package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class ExperimentalLandFactory extends Factory {

    /* renamed from: f */
    boolean f3267f;

    /* renamed from: a */
    static BitmapOrTexture f3261a = null;

    /* renamed from: b */
    static BitmapOrTexture f3262b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3263c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture[] f3264d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture f3265e = null;

    /* renamed from: g */
    static Action f3266g = new AbstractC0222w(110) { // from class: com.corrodinggames.rts.game.units.d.f.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Allows factory to build Tech 2 units";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            ExperimentalLandFactory experimentalLandFactory = (ExperimentalLandFactory) unit;
            if (experimentalLandFactory.f3267f || experimentalLandFactory.mo2915a(m3834L(), z) > 0) {
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

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f3267f);
        outputNetStream.writeByte(0);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        if (inputNetStream.readBoolean()) {
            m2966L();
        }
        inputNetStream.readByte();
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3261a = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_front);
        f3262b = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_base);
        f3265e = gameEngine.graphics.loadImage(R.drawable.experimental_unit_factory_dead);
        f3263c = Team.createBitmapForTeam(f3261a);
    }

    /* renamed from: c */
    public UnitType mo1775r() {
        return UnitType.experimentalLandFactory;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image_back = null;
        this.image = f3265e;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3799h);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3265e;
        }
        if (this.team == null) {
            return f3263c[f3263c.length - 1];
        }
        if (!this.f3267f) {
            return f3263c[this.team.getId()];
        }
        return f3264d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: R */
    public void mo2650R() {
        super.mo2650R();
        if (this.dead) {
            this.image_back = null;
        } else {
            this.image_back = f3262b;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public ExperimentalLandFactory(boolean z) {
        super(z);
        this.image = f3261a;
        this.image_back = f3262b;
        m2331b(this.image);
        this.radius = 55.0f;
        this.displayRadius = this.radius;
        this.maxHp = 3200.0f;
        this.hp = this.maxHp;
        setDrawLayer(4);
        this.footprint.set(-2, -2, 2, 2);
        this.softFootprint.set(-2, -2, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3266g.m3834L())) {
            m2966L();
        } else {
            super.mo2873a(item);
        }
    }

    /* renamed from: L */
    public void m2966L() {
        if (!this.f3267f) {
            this.f3267f = true;
            mo2650R();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        return Action.f1432h;
    }

    /* renamed from: a */
    public static void m2965a(ArrayList arrayList, int i) {
        arrayList.add(new C0214o());
        arrayList.add(new C0211l(UnitType.experimentalTank, 2));
        arrayList.add(new C0211l(UnitType.experimentalHoverTank, 3));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return mo1775r().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return true;
    }
}