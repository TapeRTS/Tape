package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class Fabricator extends Factory {

    /* renamed from: h */
    float f3295h;

    /* renamed from: i */
    float f3296i = 0.0f;

    /* renamed from: j */
    int f3297j = 0;

    /* renamed from: a */
    static BitmapOrTexture f3285a = null;

    /* renamed from: b */
    static BitmapOrTexture f3286b = null;

    /* renamed from: c */
    static BitmapOrTexture f3287c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3288d = new BitmapOrTexture[10];

    /* renamed from: e */
    static BitmapOrTexture[] f3289e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f3290f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture f3291g = null;

    /* renamed from: k */
    static Action f3292k = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.h.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.fabricator.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("units.fabricator.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return UnitType.fabricator.getUpgradePrice(2);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Fabricator fabricator = (Fabricator) unit;
            if (fabricator.f3247r != 1 || fabricator.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Fabricator) unit).f3247r != 1) {
                return false;
            }
            return true;
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

    /* renamed from: l */
    static Action f3293l = new AbstractC0222w(103) { // from class: com.corrodinggames.rts.game.units.d.h.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return UnitType.fabricator.getUpgradePrice(3);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Fabricator fabricator = (Fabricator) unit;
            if (fabricator.f3247r != 2 || fabricator.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Fabricator) unit).f3247r != 2) {
                return false;
            }
            return true;
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

    /* renamed from: t */
    static ArrayList f3294t = new ArrayList();

    static {
        f3294t.add(f3292k);
        f3294t.add(f3293l);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeFloat(this.f3295h);
        outputNetStream.writeBoolean(this.f3247r == 2);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3295h = inputNetStream.readFloat();
        boolean readBoolean = inputNetStream.readBoolean();
        if (inputNetStream.m1237b() < 51 && readBoolean) {
            upgrade(2);
        }
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: Q */
    public void mo2956Q(int i) {
        upgrade(i);
    }

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.fabricator;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3285a = gameEngine.graphics.loadImage(R.drawable.power);
        f3286b = gameEngine.graphics.loadImage(R.drawable.power_t2);
        f3287c = gameEngine.graphics.loadImage(R.drawable.power_t3);
        f3288d = Team.createBitmapForTeam(f3285a);
        f3289e = Team.createBitmapForTeam(f3286b);
        f3290f = Team.createBitmapForTeam(f3287c);
        f3291g = gameEngine.graphics.loadImage(R.drawable.power_dead);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2237a(this.x, this.y, this.height);
        this.image = f3291g;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        gameEngine.effects.m2210b(EnumC0668h.f4401e);
        EffectObject m2207c = gameEngine.effects.m2207c(this.x, this.y, this.height, -1127220);
        if (m2207c != null) {
            m2207c.f4287H = 0.15f;
            m2207c.f4286G = 1.0f;
            m2207c.drawLayer = (short) 2;
            m2207c.timer = 35.0f;
            m2207c.startTimer = m2207c.timer;
            m2207c.f4301V = 0.0f;
            m2207c.f4336y = -14492382;
        }
        m2509bn();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3291g;
        }
        if (this.team == null) {
            return f3288d[f3288d.length - 1];
        }
        if (this.f3247r == 1) {
            return f3288d[this.team.getId()];
        }
        if (this.f3247r == 2) {
            return f3289e[this.team.getId()];
        }
        if (this.f3247r == 3) {
            return f3290f[this.team.getId()];
        }
        GameEngine.PrintLOG("Unknown tech level:" + this.f3247r);
        return f3288d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public Fabricator(boolean z) {
        super(z);
        this.image = f3285a;
        m2332a(this.image, 3);
        this.radius = 25.0f;
        this.displayRadius = this.radius;
        this.maxHp = 800.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.m4664a(this.footprint);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        this.f3296i = CommonUtils.toZero(this.f3296i, f);
        if (this.f3296i == 0.0f) {
            this.f3296i = 17.0f;
            this.f3297j++;
            if (this.f3297j > 5) {
                this.f3297j = 0;
            }
            if (this.f3297j <= 2) {
                this.drawFrame = this.f3297j;
            } else {
                this.drawFrame = 5 - this.f3297j;
            }
        }
        this.f3295h += f;
        if (this.f3295h > Team.f1353am - 0.1f) {
            this.f3295h -= Team.f1353am;
            this.team.m3944b(getIncome() * (Team.f1353am / Team.f1352al));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cv */
    public float getIncome() {
        if (this.f3247r == 1) {
            return 2.0f;
        }
        if (this.f3247r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3292k.m3834L())) {
            upgrade(2);
            m2646V();
        }
        if (item.uIndex.equals(f3293l.m3834L())) {
            upgrade(3);
            m2646V();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3247r == 1) {
            return f3292k.m3834L();
        }
        if (this.f3247r == 2) {
            return f3293l.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return this.f3247r;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        Team.m3940b((Unit) this);
        if (this.f3247r > i) {
            this.f3247r = 1;
            this.maxHp = 800.0f;
            if (this.hp > this.maxHp) {
                this.hp = this.maxHp;
            }
        }
        if (this.f3247r < 2 && i >= 2) {
            this.maxHp += 500.0f;
            this.hp += 500.0f;
        }
        if (this.f3247r < 3 && i >= 3) {
            this.maxHp += 1300.0f;
            this.hp += 1300.0f;
        }
        this.f3247r = i;
        Team.m3924c(this);
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3294t;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo2895cX() {
        return super.mo2895cX() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bo */
    public int mo2508bo() {
        return 12;
    }
}