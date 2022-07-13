package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class MissileShip extends WaterUnit {

    /* renamed from: a */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: b */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: c */
    static BitmapOrTexture f3633c = null;

    /* renamed from: d */
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[10];

    /* renamed from: e */
    static PointF f3635e = new PointF();

    /* renamed from: f */
    Rect f3636f = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1718o;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.scout_ship);
        IMAGE_WREAK = instance.graphics.loadImage(R.drawable.scout_ship_dead);
        f3633c = m3772a(IMAGE, IMAGE.getWidth(), IMAGE.getHeight());
        IMAGE_TEAMS = Team.createBitmapForTeam(IMAGE);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        return IMAGE_TEAMS[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3633c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public MissileShip(boolean z) {
        super(z);
        setObjectWidth(17);
        setObjectHeight(31);
        this.radius = 15.0f;
        this.displayRadius = this.radius - 2.0f;
        this.maxHp = 350.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        float f = this.direction;
        f3635e.set(this.x + (CommonUtils.cos(f) * 6.0f), this.y + (CommonUtils.sin(f) * 6.0f));
        return f3635e;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        PointF turretEnd = getTurretEnd(i);
        if (!unit.isUnderwater()) {
            Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
            PointF J = mo2655J(i);
            createProjectile.x = J.x;
            createProjectile.y = J.y;
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            createProjectile.directDamage = 62.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 190.0f;
            createProjectile.speed = 2.0f;
            createProjectile.f982aH = true;
            createProjectile.f983aM = true;
            createProjectile.f987aQ = true;
            gameEngine.audio.playSound(AudioEngine.missile_fire, 0.8f, this.x, this.y);
            gameEngine.effects.emitLight(this.x, this.y, this.height, -1118720);
            gameEngine.effects.m2223a(createProjectile, -1118720);
            return;
        }
        Projectile createProjectile2 = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height - 1.0f, i);
        createProjectile2.color = Color.argb(255, 0, 0, 150);
        createProjectile2.f1047x = 1.0f;
        createProjectile2.directDamage = 42.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 220.0f;
        createProjectile2.speed = 1.9f;
        createProjectile2.f983aM = true;
        createProjectile2.f987aQ = true;
        gameEngine.audio.playSound(AudioEngine.missile_fire, 0.8f, this.x, this.y);
        gameEngine.effects.emitLight(this.x, this.y, this.height, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ad */
    public boolean mo2566ad() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}