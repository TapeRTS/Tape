package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.MapTile;
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
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class Extractor extends Factory {

    /* renamed from: a */
    float f3279a;

    /* renamed from: b */
    int f3280b = 1;

    /* renamed from: c */
    float f3281c = 0.0f;

    /* renamed from: d */
    int f3282d = 0;

    /* renamed from: j */
    Rect f3283j = new Rect();

    /* renamed from: k */
    Rect f3284k = new Rect();

    /* renamed from: e */
    static BitmapOrTexture[] f3268e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f3269f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture[] f3270g = new BitmapOrTexture[10];

    /* renamed from: h */
    static BitmapOrTexture f3271h = null;

    /* renamed from: i */
    static BitmapOrTexture f3272i = null;

    /* renamed from: l */
    public static int f3273l = 0;

    /* renamed from: t */
    static Action f3274t = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.g.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.extractor.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return UnitType.extractor.getUpgradePrice(2);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 6.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3280b != 1 || extractor.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        /* renamed from: J */
        public UnitType m2958J() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1439c;
        }
    };

    /* renamed from: u */
    static Action f3275u = new AbstractC0222w(103) { // from class: com.corrodinggames.rts.game.units.d.g.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return UnitType.extractor.getUpgradePrice(3);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3280b != 2 || extractor.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        /* renamed from: J */
        public UnitType m2957J() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1439c;
        }
    };

    /* renamed from: v */
    static ArrayList f3276v = new ArrayList();

    /* renamed from: w */
    static ArrayList f3277w = new ArrayList();

    /* renamed from: x */
    static ArrayList f3278x = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeFloat(this.f3279a);
        outputNetStream.writeBoolean(this.f3280b > 1);
        outputNetStream.writeInt(this.f3280b);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3279a = inputNetStream.readFloat();
        int i = 1;
        if (inputNetStream.readBoolean()) {
            i = 2;
        }
        if (inputNetStream.m1237b() >= 31) {
            i = inputNetStream.readInt();
        }
        if (i != 1) {
            upgrade(i);
        }
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public UnitType m2961b() {
        return UnitType.extractor;
    }

    static {
        f3276v.add(f3274t);
        f3277w.add(f3275u);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public boolean mo2493c(Team team) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.map.m4168a(this.x, this.y);
        MapTile tileFromObjectLayer = gameEngine.map.getTileFromObjectLayer(gameEngine.map.returnX, gameEngine.map.returnY);
        if (tileFromObjectLayer == null || !tileFromObjectLayer.nresPool) {
            return false;
        }
        return super.mo2493c(team);
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.extractor);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.extractor_t2);
        BitmapOrTexture loadImage3 = gameEngine.graphics.loadImage(R.drawable.extractor_t3);
        f3272i = gameEngine.graphics.loadImage(R.drawable.extractor_dead);
        f3268e = Team.createBitmapForTeam(loadImage);
        f3269f = Team.createBitmapForTeam(loadImage2);
        f3270g = Team.createBitmapForTeam(loadImage3);
        loadImage.mo50m();
        loadImage2.mo50m();
        loadImage3.mo50m();
        f3271h = gameEngine.graphics.loadImage(R.drawable.extractor_back);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2237a(this.x, this.y, this.height);
        this.image = f3272i;
        this.image_back = null;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        Emitter.m2195a(this.x, this.y).f4380j = -6684775;
        Emitter m2191b = Emitter.m2191b(this.x, this.y);
        m2191b.f4362a = 500.0f;
        m2191b.f4380j = -6684775;
        gameEngine.effects.m2210b(EnumC0668h.f4401e);
        EffectObject m2207c = gameEngine.effects.m2207c(this.x, this.y, this.height, -1127220);
        if (m2207c != null) {
            m2207c.f4287H = 0.15f;
            m2207c.f4286G = 1.0f;
            m2207c.drawLayer = (short) 2;
            m2207c.timer = 35.0f;
            m2207c.startTimer = m2207c.timer;
            m2207c.f4301V = 0.0f;
            m2207c.f4336y = -13378253;
        }
        m2509bn();
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bo */
    public int mo2508bo() {
        return 16;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: R */
    public void mo2650R() {
        super.mo2650R();
        if (this.dead) {
            this.image_back = null;
        } else {
            this.image_back = f3271h;
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: dn */
    public boolean mo2959dn() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3272i;
        }
        if (this.team == null) {
            return f3268e[f3268e.length - 1];
        }
        if (this.f3280b == 3) {
            return f3270g[this.team.getId()];
        }
        if (this.f3280b == 2) {
            return f3269f[this.team.getId()];
        }
        return f3268e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public Extractor(boolean z) {
        super(z);
        this.image = f3268e[9];
        setObjectWidth(37);
        setObjectHeight(56);
        this.radius = 18.0f;
        this.displayRadius = this.radius;
        this.maxHp = 800.0f;
        this.hp = this.maxHp;
        this.footprint.set(0, -1, 0, 0);
        this.softFootprint.m4664a(this.footprint);
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        this.f3281c = CommonUtils.toZero(this.f3281c, f * this.f3280b);
        if (this.f3281c == 0.0f) {
            this.f3281c = 17.0f;
            this.f3282d++;
            if (this.f3282d > 7) {
                this.f3282d = 0;
            }
            if (this.f3282d <= 3) {
                this.drawFrame = this.f3282d;
            } else {
                this.drawFrame = 7 - this.f3282d;
            }
        }
        this.f3279a += f;
        if (this.f3279a > Team.f1353am - 0.1f) {
            this.f3279a -= Team.f1353am;
            this.team.m3944b(getIncome() * (Team.f1353am / Team.f1352al));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cv */
    public float getIncome() {
        if (this.f3280b == 3) {
            return 18.0f;
        }
        if (this.f3280b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3274t.m3834L())) {
            upgrade(2);
            m2646V();
        }
        if (item.uIndex.equals(f3275u.m3834L())) {
            upgrade(3);
            m2646V();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3280b == 1) {
            return f3274t.m3834L();
        }
        if (this.f3280b == 2) {
            return f3275u.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return this.f3280b;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int level) {
        Team.m3940b((Unit) this);
        if (this.f3280b > level) {
            this.f3280b = 1;
            this.maxHp = 800.0f;
            if (this.hp > this.maxHp) {
                this.hp = this.maxHp;
            }
        }
        if (this.f3280b < 2 && level >= 2) {
            this.maxHp += 200.0f;
            this.hp += 200.0f;
        }
        if (this.f3280b < 3 && level >= 3) {
            this.maxHp += 1000.0f;
            this.hp += 1000.0f;
        }
        this.f3280b = level;
        Team.m3924c(this);
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        if (this.f3280b == 1) {
            return f3276v;
        }
        if (this.f3280b == 2) {
            return f3277w;
        }
        return f3278x;
    }
}