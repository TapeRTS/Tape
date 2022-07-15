package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.Paint;
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
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class Helicopter extends AbstractC0297b {

    /* renamed from: a */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: b */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: c */
    static BitmapOrTexture IMAGE_BLADES = null;

    /* renamed from: d */
    static BitmapOrTexture IMAGE_SHADOW = null;

    /* renamed from: e */
    static BitmapOrTexture IMAGE_SHADOW_BLADES = null;

    /* renamed from: f */
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[10];

    /* renamed from: g */
    boolean f1833g = false;

    /* renamed from: p */
    float f1834p = 0.0f;

    /* renamed from: r */
    Rect f1835r = new Rect();

    /* renamed from: s */
    Rect f1836s = new Rect();

    /* renamed from: o */
    float f1837o = 0.14f;

    /* renamed from: q */
    float f1838q = 0.0f;

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeFloat(this.f1834p);
        outputNetStream.writeFloat(this.f1837o);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        if (inputNetStream.m1237b() >= 9) {
            this.f1834p = inputNetStream.readFloat();
            this.f1837o = inputNetStream.readFloat();
            if (inputNetStream.m1237b() == 8) {
                this.f1833g = inputNetStream.readBoolean();
            }
        } else {
            this.f1837o = 0.5f;
        }
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.helicopter;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        IMAGE = gameEngine.graphics.loadImage(R.drawable.helicopter);
        IMAGE_BLADES = gameEngine.graphics.loadImage(R.drawable.helicopter_blades);
        IMAGE_SHADOW = gameEngine.graphics.loadImage(R.drawable.helicopter_shadow);
        IMAGE_SHADOW_BLADES = gameEngine.graphics.loadImage(R.drawable.helicopter_shadow_blades);
        IMAGE_WREAK = gameEngine.graphics.loadImage(R.drawable.helicopter_dead);
        IMAGE_TEAMS = Team.createBitmapForTeam(IMAGE);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        return IMAGE_TEAMS[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return IMAGE_SHADOW;
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
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public Helicopter(boolean z) {
        super(z);
        setObjectWidth(26);
        setObjectHeight(46);
        this.radius = 13.0f;
        this.displayRadius = this.radius + 2.0f;
        this.maxHp = 150.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.shadowImage = IMAGE_SHADOW;
        this.height = 0.0f;
        setDrawLayer(5);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: n */
    public void mo2861n() {
        super.mo2861n();
        this.height = 20.0f;
        this.f1837o = 0.5f;
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
        this.f1837o = CommonUtils.m1744a(this.f1837o, 0.5f, 0.003f * f);
        this.f1838q += 70.0f * this.f1837o * f;
        if (this.f1838q >= 360.0f) {
            this.f1838q -= 360.0f;
            this.f1838q += CommonUtils.m1723a(this, 0, 4);
        }
        if (this.f1837o > 0.4f) {
            this.f1834p += 2.0f * f;
            if (this.f1834p > 360.0f) {
                this.f1834p -= 360.0f;
            }
            this.height = CommonUtils.m1744a(this.height, 20.0f + (CommonUtils.sin(this.f1834p) * 1.5f), 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.directDamage = 17.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 30.0f;
        createProjectile.speed = 8.0f;
        createProjectile.visible = false;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        createProjectile.f957A = true;
        createProjectile.f1073aR = false;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m2416a(AudioEngine.gun_fire, 0.2f, 1.0f + CommonUtils.rnd(-0.08f, 0.08f), turretEnd.x, turretEnd.y);
        gameEngine.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        gameEngine.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        if (this.height < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 6.0f;
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
    /* renamed from: bi */
    public boolean mo2514bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        return super.getImageSrcRect(z);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        if (!this.dead) {
            Paint aM = mo2584aM();
            GameEngine gameEngine = GameEngine.getInstance();
            this.f1836s.set(0, 0, IMAGE_BLADES.getWidth(), IMAGE_BLADES.getHeight());
            float f2 = this.f1838q;
            if (this.f1620cf) {
            }
            gameEngine.graphics.mo194a(IMAGE_BLADES, this.f1836s, this.x - GameEngine.getInstance().viewpointX_rounded, (this.y - GameEngine.getInstance().viewpointY_rounded) - this.height, f2, aM);
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
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 7.0f;
    }
}