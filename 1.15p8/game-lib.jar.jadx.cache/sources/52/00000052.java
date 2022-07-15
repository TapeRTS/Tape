package com.corrodinggames.rts.game.units.land;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class Tank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3488a = null;

    /* renamed from: b */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: c */
    static BitmapOrTexture f3490c = null;

    /* renamed from: d */
    static BitmapOrTexture f3491d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3492e = new BitmapOrTexture[10];

    /* renamed from: f */
    int f3493f;

    /* renamed from: g */
    float f3494g;

    /* renamed from: h */
    float f3495h;

    /* renamed from: i */
    Rect f3496i = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.tank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.tank2);
        f3488a = game.graphics.loadImage(R.drawable.tank2_dead);
        f3490c = game.graphics.loadImage(R.drawable.tank2_turret);
        f3491d = game.graphics.loadImage(R.drawable.tank2_shadow);
        f3492e = Team.createBitmapForTeam(IMAGE);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3488a;
        }
        return f3492e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3491d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && !this.dead;
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
        return f3490c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        this.image = f3488a;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3793b);
        return true;
    }

    public Tank(boolean z) {
        super(z);
        m2332a(IMAGE, 3);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 210.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.dead && this.speed != 0.0f) {
            this.f3494g += f;
            if (this.f3494g > 1.0f) {
                this.f3494g = 0.0f;
                this.f3493f++;
                if (this.f3493f > 2) {
                    this.f3493f = 0;
                }
            }
            if (this.speed > 0.0f && this.trailEffect) {
                this.f3495h += f;
                if (this.f3495h > 9.0f) {
                    this.f3495h = 0.0f;
                    m2803f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m2803f() {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            gameEngine.effects.m2208c(this.x + (CommonUtils.cos(this.direction + 180.0f + f) * this.radius), this.y + (CommonUtils.sin(this.direction + 180.0f + f) * this.radius), this.height, this.direction + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.directDamage = 30.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 3.0f;
        createProjectile.f1051P = (short) 1;
        createProjectile.f1047x = 1.0f;
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        game.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        game.audio.m2416a(AudioEngine.tank_firing, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C0955y.m449a((OrderableUnit) this);
        if (!this.dead) {
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
        return 0.17f;
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        if (z) {
            return super.getImageSrcRect(z);
        }
        if (this.dead) {
            return super.getImageSrcRect(z);
        }
        return super.m3771a(z, this.f3493f);
    }
}