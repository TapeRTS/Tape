package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class HoverTank extends AbstractC0525h {

    /* renamed from: a */
    float f3622a;

    /* renamed from: b */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: c */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: d */
    static BitmapOrTexture IMAGE_SHADOW = null;

    /* renamed from: e */
    static BitmapOrTexture[] IMAGE_TEAM = new BitmapOrTexture[10];

    /* renamed from: f */
    Rect f3627f;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1743j;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.hover_tank);
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.hover_tank_dead);
        IMAGE_SHADOW = game.graphics.loadImage(R.drawable.hover_tank_shadow);
        IMAGE_TEAM = Team.createBitmapForTeam(IMAGE);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.isDead) {
            return IMAGE_WREAK;
        }
        return IMAGE_TEAM[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return IMAGE_SHADOW;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo3507d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5648e() {
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1502b);
        return true;
    }

    public HoverTank(boolean z) {
        super(z);
        this.f3622a = 0.0f;
        this.f3627f = new Rect();
        m2878b(IMAGE);
        this.radius = 7.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 150.0f;
        this.f1631cs = this.f1632ct;
        this.image = IMAGE;
        this.shadowImage = IMAGE_SHADOW;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0525h, com.corrodinggames.rts.game.units.land.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.isDead || !isActive()) {
            return;
        }
        this.f3622a += 3.0f * f;
        if (this.f3622a > 360.0f) {
            this.f3622a -= 360.0f;
        }
        this.height = CommonUtils.m2367a(this.height, 4.0f + (CommonUtils.sin(this.f3622a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.color = Color.argb(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 85.0f;
        createProjectile.speed = 2.0f;
        createProjectile.f991r = 6.0f;
        createProjectile.f992s = 0.2f;
        createProjectile.f1015P = (short) 6;
        createProjectile.f997x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -14483678);
        gameEngine.effects.m2549a(createProjectile, -16716288);
        gameEngine.audio.m3003a(AudioEngine.f4055z, 0.3f, 1.3f + CommonUtils.rnd(-0.07f, 0.07f), turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float getMoveSpeed() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float getTurnSpeed() {
        return 180.0f;
    }

    // 旋转角度单位为度
    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: i */
    public void rotateDeg(float f) {
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo3999bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo3998bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3493w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo3996d(boolean z) {
        return this.f1648cJ[0].f1711a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean canAttackFly() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3528B() {
        return 0.5f;
    }
}
