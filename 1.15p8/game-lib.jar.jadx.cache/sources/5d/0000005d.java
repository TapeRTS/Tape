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

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class ExperimentalTank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3422a = null;

    /* renamed from: b */
    static BitmapOrTexture f3423b = null;

    /* renamed from: c */
    static BitmapOrTexture f3424c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3425d = new BitmapOrTexture[10];

    /* renamed from: e */
    int f3426e;

    /* renamed from: f */
    float f3427f;

    /* renamed from: g */
    Rect f3428g = new Rect();

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.experimentalTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.experimental_tank);
        f3425d = Team.createBitmapForTeam(loadImage);
        f3422a = gameEngine.graphics.loadImage(R.drawable.experimental_tank_dead);
        f3423b = gameEngine.graphics.loadImage(R.drawable.experimental_tank_turret);
        f3424c = m3772a(loadImage, loadImage.getWidth() / 2, loadImage.getHeight());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3422a;
        }
        return f3425d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3424c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f && this.built >= 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        if (m2848Q(i)) {
            return null;
        }
        return f3423b;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        m2605a(EnumC0588v.f3796e);
        this.image = f3422a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public ExperimentalTank(boolean z) {
        super(z);
        m2332a(f3425d[7], 2);
        this.radius = 37.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 6000.0f;
        this.hp = this.maxHp;
        this.image = f3425d[7];
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.dead) {
            if (this.f1541cc != 0.0f) {
                setDrawLayer(2);
            } else {
                setDrawLayer(4);
            }
        }
        if (this.moving) {
            this.f3427f += f;
            if (this.f3427f > 5.0f) {
                this.f3427f = 0.0f;
                this.f3426e = 1 - this.f3426e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        if (!m2848Q(i)) {
            PointF E = getTurretEnd(i);
            Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y);
            PointF J = mo2655J(i);
            createProjectile.x = J.x;
            createProjectile.y = J.y;
            createProjectile.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            createProjectile.lifeTimer = 120.0f;
            createProjectile.speed = 5.0f;
            createProjectile.target = unit;
            createProjectile.f973Y = 60.0f;
            createProjectile.directDamage = 40.0f;
            createProjectile.f974Z = 45.0f;
            createProjectile.f995aa = true;
            createProjectile.f1047x = 2.0f;
            createProjectile.f987aQ = true;
            createProjectile.f1051P = (short) 9;
            createProjectile.f1047x = 1.0f;
            createProjectile.f6366ed = this.f6366ed;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.effects.emitLight(E.x, E.y, this.height, 16745216);
            gameEngine.effects.emitSmalFlame(E.x, E.y, this.height, this.f1532cC[i].f1652a);
            gameEngine.effects.m2223a(createProjectile, -1127220);
            gameEngine.audio.playSound(AudioEngine.f3876v, 0.3f, this.x, this.y);
            return;
        }
        PointF E2 = getTurretEnd(i);
        E2.set(this.x, this.y);
        Projectile createProjectile2 = Projectile.createProjectile(this, this.x, this.y);
        createProjectile2.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile2.directDamage = 60.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 190.0f;
        createProjectile2.speed = 3.0f;
        createProjectile2.f1045r = 6.0f;
        createProjectile2.f982aH = true;
        createProjectile2.f1069aI = 10.0f;
        createProjectile2.f1070aJ = 15.0f;
        createProjectile2.f983aM = true;
        createProjectile2.f987aQ = true;
        createProjectile2.f981aG = true;
        createProjectile2.f6366ed = this.f6366ed;
        GameEngine gameEngine2 = GameEngine.getInstance();
        gameEngine2.audio.playSound(AudioEngine.missile_fire, 0.2f, this.x, this.y);
        gameEngine2.effects.m2223a(createProjectile2, -1118720);
        gameEngine2.effects.emitLight(E2.x, E2.y, this.height, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2625a(int i, Unit unit, boolean z, boolean z2) {
        if (!z && z2 && !m2472h(unit)) {
            return false;
        }
        if (m2848Q(i)) {
            if (!unit.mo2676i()) {
                return false;
            }
            return true;
        } else if (unit.mo2676i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        if (m2848Q(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        if (m2848Q(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bg */
    public int mo2516bg() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        if (m2848Q(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        if (m2848Q(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        if (this.dead && !z) {
            return super.getImageSrcRect(z);
        }
        if (z) {
            return super.getImageSrcRect(z);
        }
        int i = 0 + (this.f3426e * this.objectWidth);
        this.f3428g.set(i, 0, i + this.objectWidth, 0 + this.objectHeight);
        return this.f3428g;
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
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        PointF F = super.mo2662F(i);
        float f = F.x;
        float f2 = F.y;
        if (!m2848Q(i)) {
            if (i <= 1) {
                f += CommonUtils.cos(this.direction) * 5.0f;
                f2 += CommonUtils.sin(this.direction) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += CommonUtils.cos(this.direction + f3) * 18.0f;
            f2 += CommonUtils.sin(this.direction + f3) * 18.0f;
        }
        f3752ba.set(f, f2);
        return f3752ba;
    }

    /* renamed from: Q */
    public boolean m2848Q(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ct */
    public int mo2844ct() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public boolean mo2845cZ() {
        return true;
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
}