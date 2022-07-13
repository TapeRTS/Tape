package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class HoverTank extends AbstractC0507h {

    /* renamed from: b */
    static BitmapOrTexture f3443b = null;

    /* renamed from: c */
    static BitmapOrTexture f3444c = null;

    /* renamed from: d */
    static BitmapOrTexture f3445d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3446e = new BitmapOrTexture[10];

    /* renamed from: a */
    float f3447a = 0.0f;

    /* renamed from: f */
    Rect f3448f = new Rect();

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.f1713j;
    }

    /* renamed from: c */
    public static void m2837c() {
        GameEngine game = GameEngine.getInstance();
        f3444c = game.graphics.loadImage(R.drawable.hover_tank);
        f3443b = game.graphics.loadImage(R.drawable.hover_tank_dead);
        f3445d = game.graphics.loadImage(R.drawable.hover_tank_shadow);
        f3446e = Team.createBitmapForTeam(f3444c);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3443b;
        }
        return f3446e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3445d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        this.image = f3443b;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3793b);
        return true;
    }

    public HoverTank(boolean z) {
        super(z);
        m2331b(f3444c);
        this.radius = 7.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 150.0f;
        this.hp = this.maxHp;
        this.image = f3444c;
        this.shadowImage = f3445d;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0507h, com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead || !isActive()) {
            return;
        }
        this.f3447a += 3.0f * f;
        if (this.f3447a > 360.0f) {
            this.f3447a -= 360.0f;
        }
        this.height = CommonUtils.m1744a(this.height, 4.0f + (CommonUtils.sin(this.f3447a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.color = Color.argb(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 85.0f;
        createProjectile.speed = 2.0f;
        createProjectile.f1045r = 6.0f;
        createProjectile.f1046s = 0.2f;
        createProjectile.f1051P = (short) 6;
        createProjectile.f1047x = 1.0f;
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -14483678);
        game.effects.m2223a(createProjectile, -16716288);
        game.audio.m2416a(AudioEngine.f3880z, 0.3f, 1.3f + CommonUtils.rnd(-0.07f, 0.07f), turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: i */
    public void mo2471i(float f) {
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bh */
    public boolean mo2515bh() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bi */
    public boolean mo2514bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo2836d(boolean z) {
        return this.f1532cC[0].f1652a + 90.0f;
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
    /* renamed from: ae */
    public boolean canAttackFly() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.5f;
    }
}