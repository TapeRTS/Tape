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
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class HeavyHovertank extends AbstractC0507h {

    /* renamed from: b */
    static BitmapOrTexture f3429b = null;

    /* renamed from: c */
    static BitmapOrTexture f3430c = null;

    /* renamed from: d */
    static BitmapOrTexture f3431d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3432e = new BitmapOrTexture[10];

    /* renamed from: a */
    float f3433a = 0.0f;

    /* renamed from: f */
    Rect f3434f = new Rect();

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.f1727x;
    }

    /* renamed from: c */
    public static void m2842c() {
        GameEngine game = GameEngine.getInstance();
        f3430c = game.graphics.loadImage(R.drawable.heavy_hover_tank);
        f3429b = game.graphics.loadImage(R.drawable.heavy_hover_tank_dead);
        f3431d = game.graphics.loadImage(R.drawable.heavy_hover_tank_shadow);
        f3432e = Team.createBitmapForTeam(f3430c);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3429b;
        }
        return f3432e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3431d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image = f3429b;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3794c);
        return true;
    }

    public HeavyHovertank(boolean z) {
        super(z);
        setObjectWidth(24);
        setObjectHeight(36);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 450.0f;
        this.hp = this.maxHp;
        this.image = f3430c;
        this.shadowImage = f3431d;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0507h, com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead || !isActive()) {
            return;
        }
        this.f3433a += 3.0f * f;
        if (this.f3433a > 360.0f) {
            this.f3433a -= 360.0f;
        }
        this.height = CommonUtils.m1744a(this.height, 4.0f + (CommonUtils.sin(this.f3433a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = unit;
        createProjectile.lifeTimer = 95.0f;
        createProjectile.speed = 1.0f;
        createProjectile.f1045r = 7.0f;
        createProjectile.f1046s = 0.2f;
        createProjectile.f1051P = (short) 7;
        createProjectile.f1047x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        EffectObject emitLight = gameEngine.effects.emitLight(E.x, E.y, this.height, -56798);
        if (emitLight != null) {
            emitLight.startingAlpha = 0.7f;
            emitLight.timer = 30.0f;
            emitLight.startTimer = emitLight.timer;
            EffectEngine.m2225a(emitLight, this);
        }
        gameEngine.effects.m2223a(createProjectile, -1179648);
        gameEngine.audio.playSound(AudioEngine.f3880z, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 20.0f;
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
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.4f;
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}