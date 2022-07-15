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
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class AirShip extends AbstractC0297b {

    /* renamed from: a */
    static BitmapOrTexture f1774a = null;

    /* renamed from: b */
    static BitmapOrTexture f1775b = null;

    /* renamed from: c */
    static BitmapOrTexture f1776c = null;

    /* renamed from: d */
    static BitmapOrTexture f1777d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1778e = new BitmapOrTexture[10];

    /* renamed from: g */
    Rect f1779g = new Rect();

    /* renamed from: f */
    float f1780f = 0.18f;

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.airShip;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1775b = gameEngine.graphics.loadImage(R.drawable.ship);
        f1776c = gameEngine.graphics.loadImage(R.drawable.ship_shadow);
        f1774a = gameEngine.graphics.loadImage(R.drawable.ship_dead);
        f1778e = Team.createBitmapForTeam(f1775b);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f1774a;
        }
        return f1778e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1776c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f1777d;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = f1774a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public AirShip(boolean z) {
        super(z);
        setObjectWidth(24);
        setObjectHeight(22);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 0.0f;
        this.maxHp = 250.0f;
        this.hp = this.maxHp;
        this.image = f1775b;
        this.shadowImage = f1776c;
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
        this.height = CommonUtils.m1744a(this.height, 20.0f, 0.3f * f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.directDamage = 30.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 75.0f;
        createProjectile.speed = 6.0f;
        createProjectile.f1047x = 2.0f;
        createProjectile.f1048y = 4.0f;
        createProjectile.color = Color.argb(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        GameEngine gameEngine = GameEngine.getInstance();
        EffectObject emitSmalFlame = gameEngine.effects.emitSmalFlame(E.x, E.y, this.height, this.f1532cC[i].f1652a);
        if (emitSmalFlame != null) {
            emitSmalFlame.stripIndex = 10;
        }
        gameEngine.audio.m2416a(AudioEngine.f3879y, 0.14f, 1.0f + CommonUtils.rnd(-0.1f, 0.1f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 170.0f;
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
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bl */
    public boolean mo2511bl() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.16f;
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
    /* renamed from: af */
    public boolean mo2564af() {
        return false;
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
}