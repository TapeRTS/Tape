package com.corrodinggames.rts.game.units.land;

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
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class ExperimentalHovertank extends AbstractC0507h {

    /* renamed from: a */
    static BitmapOrTexture f3411a = null;

    /* renamed from: b */
    static BitmapOrTexture f3412b = null;

    /* renamed from: c */
    static BitmapOrTexture f3413c = null;

    /* renamed from: d */
    public static BitmapOrTexture f3414d = null;

    /* renamed from: e */
    public static BitmapOrTexture f3415e = null;

    /* renamed from: f */
    static BitmapOrTexture[] f3416f = new BitmapOrTexture[10];

    /* renamed from: g */
    int f3417g;

    /* renamed from: i */
    Projectile f3418i;

    /* renamed from: h */
    float f3419h = 0.0f;

    /* renamed from: j */
    Rect f3420j = new Rect();

    /* renamed from: k */
    Paint f3421k = C0955y.m467a();

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.experimentalHoverTank;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank);
        f3416f = Team.createBitmapForTeam(loadImage);
        f3411a = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_dead);
        f3412b = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_turret);
        f3413c = m3772a(loadImage, loadImage.getWidth() / 1, loadImage.getHeight());
        f3414d = gameEngine.graphics.loadImage(R.drawable.experimental_hovertank_shield);
        f3415e = gameEngine.graphics.loadImage(R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        if (this.f3418i != null && this.f3418i.deleted) {
            this.f3418i = null;
        }
        outputNetStream.writeGameObject(this.f3418i);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3418i = (Projectile) inputNetStream.readGameObject(Projectile.class);
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3411a;
        }
        return f3416f[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3413c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f;
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
        return f3412b;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: S */
    public BitmapOrTexture mo2649S() {
        return f3414d;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image = f3411a;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3796e);
        return true;
    }

    public ExperimentalHovertank(boolean z) {
        super(z);
        m2332a(f3416f[7], 1);
        this.radius = 30.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 3500.0f;
        this.hp = this.maxHp;
        this.maxShield = 5000.0f;
        this.shield = this.maxShield;
        this.image = f3416f[7];
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo2813bU() {
        if (this.maxShield > 0.0f && this.shield < this.maxShield) {
            return this.shield / this.maxShield;
        }
        return super.mo2813bU();
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0507h, com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead || !isActive()) {
            return;
        }
        if (!this.dead) {
            if (this.f1541cc != 0.0f) {
                setDrawLayer(2);
            } else {
                setDrawLayer(4);
            }
        }
        if (this.moving) {
        }
        this.f3419h += 1.0f * f;
        if (this.f3419h > 360.0f) {
            this.f3419h -= 360.0f;
        }
        this.height = CommonUtils.m1744a(this.height, 4.0f + (CommonUtils.sin(this.f3419h) * 2.0f), 0.1f * f);
        this.shield = CommonUtils.m1744a(this.shield, this.maxShield, 0.25f * f);
        this.f1546cp = CommonUtils.m1744a(this.f1546cp, 0.0f, 4.0f * f);
        if (this.f1546cp > 50.0f) {
            this.f1546cp = 50.0f;
        }
        if (this.f3418i != null) {
            PointF E = getTurretEnd(0);
            this.f3418i.x = E.x;
            this.f3418i.y = E.y;
            this.f3418i.height = this.height;
            if (this.f3418i.deleted) {
                this.f3418i = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: K */
    public float mo2654K(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: J */
    public PointF mo2655J(int i) {
        PointF J = super.mo2655J(i);
        if (this.f3418i != null) {
            J.x += this.f3418i.x;
            J.y += this.f3418i.y;
        }
        return J;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        GameEngine.getInstance();
        PointF E = getTurretEnd(i);
        if (this.f3418i != null) {
            boolean z = false;
            if (this.f3418i.deleted) {
                z = true;
            }
            if (this.f3418i.target != unit) {
                z = true;
            }
            if (z) {
                this.f3418i = null;
            }
        }
        float shootDelay = getShootDelay(i) + mo2483e(i) + 5.0f;
        if (this.f3418i != null) {
            this.f3418i.lifeTimer = shootDelay;
            return;
        }
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y);
        createProjectile.directDamage = 380.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = shootDelay;
        createProjectile.f958B = true;
        createProjectile.f957A = true;
        createProjectile.f987aQ = true;
        createProjectile.f961E = true;
        createProjectile.f965J = 70.0f;
        createProjectile.f962F = 230.0f;
        createProjectile.f1064ak = 0.75f;
        createProjectile.f6366ed = this.f6366ed;
        this.f3418i = createProjectile;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.02f;
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
        int i = 0 + (this.f3417g * this.objectWidth);
        this.f3420j.set(i, 0, i + this.objectWidth, 0 + this.objectHeight);
        return this.f3420j;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        BitmapOrTexture mo2649S;
        if (!super.draw(f)) {
            return false;
        }
        C0955y.m449a((OrderableUnit) this);
        if (!this.dead) {
            float f2 = 0.0f;
            if (this.f3418i != null) {
                f2 = CommonUtils.m1693b(this.f3418i.m4028e(), 0.25f) * 3.0f;
            }
            C0955y.m447a(this, MammothTank.f3479e, f2, 0);
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.dead && this.shield > 0.0f && this.f1547cq == 0.0f && (mo2649S = mo2649S()) != null) {
            this.f3421k.m4717a((int) ((0.09f + ((this.shield / this.maxShield) * 0.4f) + ((CommonUtils.m1693b(this.f1546cp, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            gameEngine.graphics.mo197a(mo2649S, this.x - gameEngine.viewpointX_rounded, (this.y - gameEngine.viewpointY_rounded) - this.height, mo2836d(false) - 90.0f, this.f3421k);
            return true;
        }
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
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        f3752ba.set(this.x, this.y);
        return f3752ba;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 1;
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
    /* renamed from: ct */
    public int mo2844ct() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public boolean mo2845cZ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}