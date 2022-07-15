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
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class MammothTank extends AbstractC0511j {

    /* renamed from: a */
    static BitmapOrTexture f3475a = null;

    /* renamed from: b */
    static BitmapOrTexture f3476b = null;

    /* renamed from: c */
    static BitmapOrTexture[] f3477c = new BitmapOrTexture[10];

    /* renamed from: d */
    static BitmapOrTexture f3478d = null;

    /* renamed from: e */
    public static BitmapOrTexture f3479e = null;

    /* renamed from: f */
    int f3480f;

    /* renamed from: g */
    float f3481g;

    /* renamed from: h */
    Rect f3482h = new Rect();

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.mammothTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.mammoth_tank);
        f3477c = Team.createBitmapForTeam(loadImage);
        f3475a = gameEngine.graphics.loadImage(R.drawable.mammoth_tank_dead);
        f3476b = gameEngine.graphics.loadImage(R.drawable.mammoth_tank_turret);
        f3479e = gameEngine.graphics.loadImage(R.drawable.lighting_charge);
        f3478d = m3772a(loadImage, loadImage.getWidth() / 2, loadImage.getHeight());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3475a;
        }
        return f3477c[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3478d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f3476b;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f && !this.dead;
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

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image = f3475a;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3796e);
        return true;
    }

    public MammothTank(boolean z) {
        super(z);
        m2332a(f3477c[7], 2);
        this.radius = 21.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 2900.0f;
        this.hp = this.maxHp;
        this.image = f3477c[7];
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.moving) {
            this.f3481g += f;
            if (this.f3481g > 3.0f) {
                this.f3481g = 0.0f;
                this.f3480f = 1 - this.f3480f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y);
        createProjectile.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        createProjectile.directDamage = 260.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 20.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f1047x = 2.0f;
        createProjectile.f987aQ = true;
        createProjectile.f957A = true;
        createProjectile.f968M = true;
        createProjectile.f1062ai = 0.5f;
        createProjectile.f1064ak = 1.0f;
        createProjectile.f1065al = 0.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(E.x, E.y, this.height, -1118482);
        gameEngine.audio.playSound(AudioEngine.lighting_burst, 0.2f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.04f;
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
        return super.m3771a(z, this.f3480f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        C0955y.m449a((OrderableUnit) this);
        C0955y.m447a(this, f3479e, this.f1532cC[0].f1657f / mo2483e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 60.0f;
    }
}