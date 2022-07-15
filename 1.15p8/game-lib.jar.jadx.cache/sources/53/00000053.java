package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class MegaTank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3483a = null;

    /* renamed from: b */
    static BitmapOrTexture f3484b = null;

    /* renamed from: c */
    static BitmapOrTexture f3485c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3486d = new BitmapOrTexture[10];

    /* renamed from: e */
    Rect f3487e = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.megaTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        f3484b = game.graphics.loadImage(R.drawable.mega_tank);
        f3483a = game.graphics.loadImage(R.drawable.mega_tank_dead);
        f3485c = game.graphics.loadImage(R.drawable.mega_tank_turret);
        f3486d = Team.createBitmapForTeam(f3484b);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3483a;
        }
        return f3486d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f3485c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = f3483a;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.f3869o, 0.8f, this.x, this.y);
        mo2507bp();
        return true;
    }

    public MegaTank(boolean z) {
        super(z);
        setObjectWidth(20);
        setObjectHeight(25);
        this.radius = 12.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 550.0f;
        this.hp = this.maxHp;
        this.image = f3484b;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        if (!unit.mo2676i()) {
            PointF E = getTurretEnd(i);
            Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y);
            createProjectile.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            createProjectile.directDamage = 50.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 60.0f;
            createProjectile.speed = 3.0f;
            createProjectile.f1047x = 2.0f;
            createProjectile.f987aQ = true;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
            gameEngine.effects.emitSmalFlame(E.x, E.y, this.height, this.f1532cC[i].f1652a);
            gameEngine.audio.playSound(AudioEngine.f3875u, 0.3f, this.x, this.y);
            return;
        }
        Projectile createProjectile2 = Projectile.createProjectile(this, this.x, this.y);
        createProjectile2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile2.directDamage = 40.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 190.0f;
        createProjectile2.speed = 4.0f;
        createProjectile2.f982aH = true;
        createProjectile2.f1069aI = 10.0f;
        createProjectile2.f1070aJ = 15.0f;
        createProjectile2.f983aM = true;
        createProjectile2.f987aQ = true;
        GameEngine.getInstance().audio.playSound(AudioEngine.missile_fire, 0.2f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.0f;
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
        if (!super.draw(f)) {
            return false;
        }
        C0955y.m449a((OrderableUnit) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 12.0f;
    }
}