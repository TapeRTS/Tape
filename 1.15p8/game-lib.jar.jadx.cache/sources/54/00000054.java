package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class LaserTank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3468a = null;

    /* renamed from: b */
    static BitmapOrTexture f3469b = null;

    /* renamed from: c */
    static BitmapOrTexture f3470c = null;

    /* renamed from: d */
    static BitmapOrTexture f3471d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3472e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture f3473f = null;

    /* renamed from: g */
    Rect f3474g = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.laserTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        f3469b = game.graphics.loadImage(R.drawable.laser_tank_base);
        f3468a = game.graphics.loadImage(R.drawable.laser_tank_dead);
        f3470c = game.graphics.loadImage(R.drawable.laser_tank_turrent);
        f3471d = game.graphics.loadImage(R.drawable.laser_tank_charge);
        f3472e = Team.createBitmapForTeam(f3469b);
        f3473f = m3772a(f3469b, f3469b.getWidth(), f3469b.getHeight());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3468a;
        }
        return f3472e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3473f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && !this.dead;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f3470c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image = f3468a;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3793b);
        return true;
    }

    public LaserTank(boolean z) {
        super(z);
        m2332a(f3469b, 1);
        this.radius = 14.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 300.0f;
        this.hp = this.maxHp;
        this.image = f3469b;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = target;
        createProjectile.lifeTimer = 8.0f;
        createProjectile.f958B = true;
        createProjectile.f957A = true;
        createProjectile.f987aQ = true;
        createProjectile.color = Color.argb(80, 255, 0, 0);
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        game.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        game.audio.playSound(AudioEngine.f3879y, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo2813bU() {
        if (this.f1532cC[0].f1656e > 0.0f) {
            return 1.0f - (this.f1532cC[0].f1656e / getShootDelay(0));
        }
        if (this.f1532cC[0].f1657f != 0.0f) {
            return this.f1532cC[0].f1657f / mo2483e(0);
        }
        return super.mo2813bU();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public boolean mo2812bV() {
        return this.f1532cC[0].f1656e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine game = GameEngine.getInstance();
        C0955y.m449a((OrderableUnit) this);
        if (!this.dead) {
            float mo2483e = this.f1532cC[0].f1657f / mo2483e(0);
            if (mo2483e != 0.0f) {
                PointF E = getTurretEnd(0);
                game.graphics.mo137h();
                game.graphics.mo164b(E.x - game.viewpointX_rounded, E.y - game.viewpointY_rounded);
                game.graphics.mo224a(mo2483e, mo2483e);
                game.graphics.mo196a(f3471d, 0.0f, 0.0f, (Paint) null);
                game.graphics.mo136i();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.12f;
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
        return 19.0f;
    }
}