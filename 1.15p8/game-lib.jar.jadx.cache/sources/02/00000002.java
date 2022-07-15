package com.corrodinggames.rts.game.units.air;

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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class GunShip extends AbstractC0297b {

    /* renamed from: a */
    static BitmapOrTexture f1820a = null;

    /* renamed from: b */
    static BitmapOrTexture f1821b = null;

    /* renamed from: c */
    static BitmapOrTexture f1822c = null;

    /* renamed from: d */
    static BitmapOrTexture f1823d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1824e = new BitmapOrTexture[10];

    /* renamed from: f */
    float f1825f = 0.0f;

    /* renamed from: g */
    Rect f1826g = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.gunShip;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1821b = gameEngine.graphics.loadImage(R.drawable.gunship);
        f1822c = gameEngine.graphics.loadImage(R.drawable.gunship_shadow);
        f1820a = gameEngine.graphics.loadImage(R.drawable.gunship_dead);
        f1824e = Team.createBitmapForTeam(f1821b);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f1820a;
        }
        return f1824e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1822c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = f1820a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public GunShip(boolean z) {
        super(z);
        setObjectWidth(25);
        setObjectHeight(35);
        this.radius = 15.0f;
        this.displayRadius = this.radius + 0.0f;
        this.maxHp = 260.0f;
        this.hp = this.maxHp;
        this.image = f1821b;
        this.shadowImage = f1822c;
        this.height = 0.0f;
        setDrawLayer(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public boolean mo2657I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead) {
            return;
        }
        this.f1825f += 2.0f * f;
        if (this.f1825f > 360.0f) {
            this.f1825f -= 360.0f;
        }
        this.height = CommonUtils.m1744a(this.height, 20.0f + (CommonUtils.sin(this.f1825f) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        float turretSize = getTurretSize(i);
        float f = this.direction;
        f3751aZ.set(this.x + (CommonUtils.cos(f) * turretSize), this.y + (CommonUtils.sin(f) * turretSize));
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 35.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = target;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f1047x = 2.0f;
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        game.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        game.audio.playSound(AudioEngine.f3875u, 0.3f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        if (this.height < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bh */
    public boolean mo2515bh() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 15.0f;
    }
}