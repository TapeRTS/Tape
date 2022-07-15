package com.corrodinggames.rts.game.units.buildings;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
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
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class LaserDefence extends Factory {

    /* renamed from: d */
    boolean f3336d;

    /* renamed from: e */
    boolean f3337e;

    /* renamed from: f */
    float f3338f;

    /* renamed from: i */
    PointF f3339i = new PointF();

    /* renamed from: j */
    Rect f3340j = new Rect();

    /* renamed from: a */
    static BitmapOrTexture[] f3329a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture[] f3330b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3331c = null;

    /* renamed from: g */
    static BitmapOrTexture f3332g = null;

    /* renamed from: h */
    static BitmapOrTexture[] f3333h = new BitmapOrTexture[10];

    /* renamed from: k */
    static Action f3334k = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.p.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return UnitType.laserDefence.getUpgradePrice(2);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            LaserDefence laserDefence = (LaserDefence) unit;
            if (laserDefence.f3336d || laserDefence.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((LaserDefence) unit).f3336d) {
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
            return EnumC0219t.upgrade;
        }
    };

    /* renamed from: l */
    static ArrayList f3335l = new ArrayList();

    static {
        f3335l.add(f3334k);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f3336d);
        outputNetStream.writeFloat(this.f1549cs);
        outputNetStream.writeBoolean(this.f3337e);
        outputNetStream.writeFloat(this.f3338f);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3336d = inputNetStream.readBoolean();
        this.f1549cs = inputNetStream.readFloat();
        this.f3337e = inputNetStream.readBoolean();
        if (inputNetStream.m1237b() >= 38) {
            this.f3338f = inputNetStream.readFloat();
        }
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3333h[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3331c = gameEngine.graphics.loadImage(R.drawable.laser_defence_dead);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.laser_defence);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.laser_defence_t2);
        f3329a = Team.createBitmapForTeam(loadImage);
        f3330b = Team.createBitmapForTeam(loadImage2);
        loadImage.mo50m();
        loadImage2.mo50m();
        f3332g = gameEngine.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3333h = Team.createBitmapForTeam(f3332g);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2237a(this.x, this.y, this.height);
        this.image = f3331c;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3331c;
        }
        if (this.team == null) {
            return f3329a[f3329a.length - 1];
        }
        if (!this.f3336d) {
            return f3329a[this.team.getId()];
        }
        return f3330b[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    public LaserDefence(boolean z) {
        super(z);
        m2332a(f3329a[0], 2);
        this.f1549cs = 1.0f;
        this.radius = 19.0f;
        this.displayRadius = this.radius;
        this.maxHp = 500.0f;
        this.hp = this.maxHp;
        this.image = f3329a[f3329a.length - 1];
        this.footprint.set(0, 0, 1, 1);
        this.softFootprint.set(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        float f2;
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        GameEngine.getInstance();
        float f3 = 4.0E-4f * f;
        if (this.f3336d) {
            f3 += 2.0E-4f * f;
        }
        this.f1549cs = CommonUtils.m1744a(this.f1549cs, 1.0f, f3);
        if (this.f1549cs >= 1.0f) {
            this.f3337e = false;
        }
        this.f3338f -= f;
        this.f3339i.m4669a(getTurretEnd(0));
        if (this.f1549cs > 0.0f && !this.f3337e) {
            if (!this.f3336d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m2900a(this, this.f3339i.x, this.f3339i.y, this.height, getMaxAttackRange(), f2)) {
                this.f3338f = 3.0f;
            }
            if (this.f1549cs < 0.0f) {
                this.f1549cs = 0.0f;
                this.f3337e = true;
            }
        }
        if (this.f3337e) {
            this.drawFrame = 1;
        } else {
            this.drawFrame = 0;
        }
    }

    /* renamed from: a */
    public static boolean m2900a(OrderableUnit orderableUnit, float f, float f2, float f3, float f4, float f5) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f6 = f4 * f4;
        Object[] items = Projectile.f1024a.getItems();
        int i = Projectile.f1024a.size;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile = (Projectile) items[i2];
            if (!projectile.f957A && !projectile.f959C && ((projectile.f965J > 7.0f || (projectile.f965J > 2.0f && projectile.speed > 8.0f)) && !projectile.f988aS && ((projectile.x - f) * (projectile.x - f)) + ((projectile.y - f2) * (projectile.y - f2)) < f6 && projectile.height >= -1.0f)) {
                boolean z = false;
                if (projectile.target != null && orderableUnit.team.m3913d(projectile.target.team)) {
                    z = true;
                }
                if (!z && projectile.source != null && orderableUnit.team.m3925c(projectile.source.team)) {
                    z = true;
                }
                if (z) {
                    EffectObject m2234a = gameEngine.effects.m2234a(f, f2, f3, projectile.x, projectile.y, projectile.height);
                    if (m2234a != null) {
                        m2234a.timer = 10.0f;
                        m2234a.startTimer = m2234a.timer;
                    }
                    EffectObject emitEffect = gameEngine.effects.emitEffect(f, f2, f3, EffectType.f4274a, false, EnumC0668h.f4399c);
                    if (emitEffect != null) {
                        emitEffect.f4296Q = 0.0f;
                        emitEffect.ySpeed = 0.0f;
                        emitEffect.frameIndex = 4;
                        emitEffect.timer = 39.0f;
                        emitEffect.startTimer = emitEffect.timer;
                        emitEffect.fadeOut = true;
                        emitEffect.startingAlpha = 1.3f;
                        emitEffect.f4287H = 1.1f;
                        emitEffect.f4286G = 0.7f;
                    }
                    projectile.f1050H -= 1.01f;
                    if (projectile.f1050H <= 0.0f) {
                        projectile.m4029d();
                        EffectObject emitEffect2 = gameEngine.effects.emitEffect(projectile.x, projectile.y, projectile.height, EffectType.f4274a, false, EnumC0668h.f4399c);
                        if (emitEffect2 != null) {
                            emitEffect2.f4296Q = 0.0f;
                            emitEffect2.ySpeed = 0.0f;
                            emitEffect2.frameIndex = 4;
                            emitEffect2.timer = 23.0f;
                            emitEffect2.startTimer = emitEffect2.timer;
                            emitEffect2.fadeOut = true;
                            emitEffect2.startingAlpha = 0.9f;
                            emitEffect2.f4287H = 0.5f;
                            emitEffect2.f4286G = 0.2f;
                        }
                        gameEngine.audio.m2416a(AudioEngine.f3856F, 0.2f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), projectile.x, projectile.y);
                    }
                    orderableUnit.f1549cs -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        f3751aZ.set(this.x, this.y - 13.0f);
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        if (!this.f3336d) {
            return 160.0f;
        }
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.laserDefence;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo2813bU() {
        if (this.f1549cs != 1.0f) {
            return this.f1549cs;
        }
        return super.mo2813bU();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public boolean mo2812bV() {
        return this.f3337e;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bc */
    public float mo2520bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3334k.m3834L())) {
            upgrade(2);
            m2646V();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (!this.f3336d) {
            return f3334k.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        if (this.f3336d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        if (i == 1) {
            this.f3336d = false;
        } else if (i == 2 && !this.f3336d) {
            this.f3336d = true;
            this.maxHp += 900.0f;
            this.hp += 900.0f;
        }
        mo2650R();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3335l;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cV */
    public float mo2897cV() {
        return GameEngine.getInstance().map.pixel_Width;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cW */
    public float mo2896cW() {
        return GameEngine.getInstance().map.pixel_Height;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo2895cX() {
        return super.mo2895cX() - 8.0f;
    }
}