package com.corrodinggames.rts.game.units.land;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class HeavyTank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3435a = null;

    /* renamed from: b */
    static BitmapOrTexture f3436b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3437c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture f3438d = null;

    /* renamed from: e */
    int f3439e;

    /* renamed from: f */
    float f3440f;

    /* renamed from: g */
    float f3441g;

    /* renamed from: h */
    Rect f3442h = new Rect();

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.heavyTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.heavy_tank);
        f3437c = Team.createBitmapForTeam(loadImage);
        f3435a = gameEngine.graphics.loadImage(R.drawable.heavy_tank_dead);
        f3436b = gameEngine.graphics.loadImage(R.drawable.heavy_tank_turret);
        f3438d = m3772a(loadImage, loadImage.getWidth() / 3, loadImage.getHeight());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3435a;
        }
        return f3437c[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3438d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f3436b;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && !this.dead && this.built >= 1.0f && !this.f1622ch;
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

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        this.image = f3435a;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3794c);
        return true;
    }

    public HeavyTank(boolean z) {
        super(z);
        m2332a(f3437c[7], 3);
        this.radius = 15.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 600.0f;
        this.hp = this.maxHp;
        this.image = f3437c[7];
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.dead && this.speed != 0.0f) {
            this.f3440f += f;
            if (this.f3440f > 1.4d) {
                this.f3440f = 0.0f;
                this.f3439e++;
                if (this.f3439e > 2) {
                    this.f3439e = 0;
                }
            }
            if (this.trailEffect) {
                this.f3441g += f;
                if (this.f3441g > 9.0f) {
                    this.f3441g = 0.0f;
                    m2839f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m2839f() {
        GameEngine game = GameEngine.getInstance();
        float f = this.direction;
        if (this.speed < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            game.effects.m2208c(this.x + (CommonUtils.cos(f + 180.0f + f2) * this.radius), this.y + (CommonUtils.sin(f + 180.0f + f2) * this.radius), this.height, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!unit.mo2676i()) {
            PointF E = getTurretEnd(i);
            Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y);
            PointF J = mo2655J(i);
            createProjectile.x = J.x;
            createProjectile.y = J.y;
            createProjectile.color = Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            createProjectile.directDamage = getDirectDamage(i);
            createProjectile.target = unit;
            createProjectile.lifeTimer = 60.0f;
            createProjectile.speed = 4.0f;
            createProjectile.f1047x = 2.0f;
            createProjectile.f987aQ = true;
            createProjectile.f1049z = true;
            gameEngine.effects.m2223a(createProjectile, -16716288);
            gameEngine.effects.emitLight(E.x, E.y, this.height, -1127220);
            gameEngine.effects.emitSmalFlame(E.x, E.y, this.height, this.f1532cC[i].f1652a);
            gameEngine.audio.playSound(AudioEngine.f3875u, 0.3f, this.x, this.y);
            return;
        }
        PointF E2 = getTurretEnd(i);
        E2.set(this.x, this.y);
        Projectile createProjectile2 = Projectile.createProjectile(this, this.x, this.y);
        createProjectile2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile2.directDamage = getDirectDamage(i);
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 190.0f;
        createProjectile2.speed = 0.5f;
        createProjectile2.f1045r = 5.0f;
        createProjectile2.f982aH = true;
        createProjectile2.f1069aI = 10.0f;
        createProjectile2.f1070aJ = 15.0f;
        createProjectile2.f983aM = true;
        createProjectile2.f987aQ = true;
        createProjectile2.f981aG = true;
        gameEngine.audio.playSound(AudioEngine.missile_fire, 0.2f, this.x, this.y);
        gameEngine.effects.m2223a(createProjectile2, -1118720);
        gameEngine.effects.emitLight(E2.x, E2.y, this.height, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 160.0f;
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
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.0f;
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
        return 21.0f;
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
        return super.m3771a(z, this.f3439e);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2660G(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2658H(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public float mo2656I(int i) {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}