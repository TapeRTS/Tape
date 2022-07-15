package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Item;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class AntiAir extends Turret {

    /* renamed from: a */
    static BitmapOrTexture f3187a = null;

    /* renamed from: b */
    static BitmapOrTexture f3188b = null;

    /* renamed from: c */
    static BitmapOrTexture f3189c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3190d = new BitmapOrTexture[10];

    /* renamed from: e */
    public static Action f3191e = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.a.a.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.upgraded || turret.mo2915a(m3834L(), z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Turret) unit).upgraded) {
                return false;
            }
            return true;
        }

        /* renamed from: J */
        public UnitType mo2734i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1439c;
        }
    };

    /* renamed from: f */
    static ArrayList f3192f = new ArrayList();

    static {
        f3192f.add(f3191e);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3190d[this.team.getId()];
    }

    /* renamed from: b */
    public static void m3035b() {
        GameEngine game = GameEngine.getInstance();
        f3187a = game.graphics.loadImage(R.drawable.anti_air_top);
        f3188b = game.graphics.loadImage(R.drawable.anti_air_top_l2);
        f3189c = game.graphics.loadImage(R.drawable.unit_icon_building_air_turrent);
        f3190d = Team.createBitmapForTeam(f3189c);
    }

    public AntiAir(boolean z) {
        super(z);
        this.maxHp = 800.0f;
        this.hp = this.maxHp;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        if (!this.upgraded) {
            return 250.0f;
        }
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        if (!this.upgraded) {
            return 80.0f;
        }
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        if (!this.upgraded) {
            return super.mo2483e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo2483e(i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        if (!this.upgraded || i == 0) {
            return super.getTurretEnd(i);
        }
        float f = isFixedFiring() ? this.direction : this.f1532cC[i].f1652a;
        PointF F = mo2662F(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3751aZ.set(F.x + (CommonUtils.cos(f2) * 10.0f), F.y + (CommonUtils.sin(f2) * 10.0f));
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.speed = 0.3f;
        createProjectile.f1045r = 6.0f;
        if (!this.upgraded) {
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            createProjectile.directDamage = 60.0f;
            createProjectile.lifeTimer = 220.0f;
        } else {
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            createProjectile.directDamage = 60.0f;
            createProjectile.lifeTimer = 250.0f;
            createProjectile.speed = 0.5f;
            createProjectile.f1045r = 7.0f;
        }
        createProjectile.f1051P = (short) 4;
        createProjectile.f1047x = 1.0f;
        createProjectile.target = unit;
        createProjectile.f982aH = false;
        createProjectile.f1069aI = 0.0f;
        createProjectile.f1070aJ = 0.0f;
        createProjectile.f983aM = true;
        createProjectile.f987aQ = true;
        createProjectile.f981aG = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m2416a(AudioEngine.missile_fire, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), turretEnd.x, turretEnd.y);
        gameEngine.effects.m2223a(createProjectile, -1118720);
        gameEngine.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret
    /* renamed from: c */
    public UnitType getUnitType() {
        if (this.upgraded) {
            return UnitType.antiAirTurretT2;
        }
        return UnitType.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        if (!this.upgraded) {
            return f3187a;
        }
        return f3188b;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: af */
    public boolean mo2564af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret
    /* renamed from: s */
    public void mo3012s(float f) {
        if (this.f1532cC[0].m3724a()) {
            this.f1532cC[0].f1652a += getTurretTurnSpeed(0) * f * 0.1f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 9.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: u */
    public boolean mo2438u(int i) {
        if (!this.upgraded) {
            return super.mo2438u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.mo2438u(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: v */
    public int mo2437v(int i) {
        if (!this.upgraded) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: r */
    public boolean mo2443r(int i) {
        if (!this.upgraded && i > 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3191e.m3834L())) {
            upgrade(2);
            m2646V();
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (!this.upgraded) {
            return f3191e.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3030a(ArrayList arrayList) {
        arrayList.clear();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int level) {
        if (level == 1) {
            this.upgraded = false;
        } else if (level == 2 && !this.upgraded) {
            this.upgraded = true;
            this.maxHp += 600.0f;
            this.hp += 600.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3192f;
    }
}