package com.corrodinggames.rts.game.units.water;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0223x;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class AttackSubmarine extends WaterUnit {

    /* renamed from: a */
    boolean f3646a = false;

    /* renamed from: b */
    boolean f3647b = true;

    /* renamed from: c */
    float f3648c = 0.0f;

    /* renamed from: d */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: e */
    static BitmapOrTexture f3638e = null;

    /* renamed from: f */
    static BitmapOrTexture f3639f = null;

    /* renamed from: g */
    public static BitmapOrTexture f3640g = null;

    /* renamed from: h */
    public static BitmapOrTexture[] f3641h = new BitmapOrTexture[10];

    /* renamed from: i */
    static BitmapOrTexture[] f3642i = new BitmapOrTexture[10];

    /* renamed from: j */
    public static final Action f3643j = new AbstractC0223x(151) { // from class: com.corrodinggames.rts.game.units.h.e.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Surface unit. Allows it to fire missiles";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Surface";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return !((AttackSubmarine) unit).f3646a;
        }
    };

    /* renamed from: k */
    public static final Action f3644k = new AbstractC0223x(152) { // from class: com.corrodinggames.rts.game.units.h.e.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Dive unit underwater. Evades most attacks";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return ((AttackSubmarine) unit).f3646a;
        }
    };

    /* renamed from: l */
    static ArrayList f3645l = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f3646a);
        outputNetStream.writeFloat(this.f3648c);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3646a = inputNetStream.readBoolean();
        this.f3647b = !isUnderwater();
        if (inputNetStream.m1237b() >= 21) {
            this.f3648c = inputNetStream.readFloat();
        }
        m2713K();
        super.mo427a(inputNetStream);
    }

    static {
        f3645l.add(f3643j);
        f3645l.add(f3644k);
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3641h[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3638e = gameEngine.graphics.loadImage(R.drawable.attack_submarine);
        f3639f = m3772a(f3638e, f3638e.getWidth(), f3638e.getHeight());
        IMAGE_WREAK = gameEngine.graphics.loadImage(R.drawable.attack_submarine_dead);
        f3640g = gameEngine.graphics.loadImage(R.drawable.unit_icon_water);
        f3641h = Team.createBitmapForTeam(f3640g);
        f3642i = Team.createBitmapForTeam(f3638e);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height >= 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        return f3642i[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3639f;
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        return MovementType.f1647e;
    }

    /* renamed from: c */
    public UnitType mo1775r() {
        return UnitType.attackSubmarine;
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit
    /* renamed from: f */
    public boolean mo2705f() {
        if (!isUnderwater()) {
            return true;
        }
        return false;
    }

    public AttackSubmarine(boolean z) {
        super(z);
        m2331b(f3638e);
        this.radius = 15.0f;
        this.displayRadius = this.radius - 2.0f;
        this.maxHp = 260.0f;
        this.hp = this.maxHp;
        this.image = f3638e;
    }

    /* renamed from: K */
    public void m2713K() {
        if (!this.f3647b) {
            setDrawLayer(1);
        } else {
            setDrawLayer(2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit
    /* renamed from: s */
    public void mo2704s(float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3646a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (CommonUtils.absf(this.height - f2) > 2.0f) {
            this.f3648c = CommonUtils.m1744a(this.f3648c, 0.08f, 0.003f * f);
        } else {
            this.f3648c = CommonUtils.m1744a(this.f3648c, 0.02f, 0.003f * f);
        }
        this.height = CommonUtils.m1744a(this.height, f2, this.f3648c * f);
        boolean z = false;
        if (this.f3647b && isUnderwater()) {
            this.f3647b = false;
            m2713K();
            z = true;
        }
        if (!this.f3647b && !isUnderwater()) {
            this.f3647b = true;
            m2713K();
            z = true;
        }
        if (z) {
            gameEngine.effects.m2229a(this.x, this.y, 0.0f, 0, 0.0f, 0.0f, this.direction);
        }
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        if (!isUnderwater()) {
            return 250.0f;
        }
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        if (!isUnderwater()) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.018f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean isUnderwater() {
        return this.height < -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ag */
    public boolean mo2563ag() {
        if (!isUnderwater()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ad */
    public boolean mo2566ad() {
        if (!isUnderwater()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        if (!isUnderwater()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: af */
    public boolean mo2564af() {
        if (!isUnderwater()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 42.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        if (!isUnderwater()) {
            PointF turretEnd = getTurretEnd(i);
            Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
            PointF J = mo2655J(i);
            createProjectile.x = J.x;
            createProjectile.y = J.y;
            createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            createProjectile.directDamage = 42.0f;
            createProjectile.target = unit;
            createProjectile.lifeTimer = 190.0f;
            createProjectile.speed = 2.0f;
            createProjectile.f982aH = true;
            createProjectile.f983aM = true;
            createProjectile.f987aQ = true;
            GameEngine instance = GameEngine.getInstance();
            instance.audio.playSound(AudioEngine.missile_fire, 0.8f, this.x, this.y);
            instance.effects.emitLight(this.x, this.y, this.height, -1118720);
            return;
        }
        PointF E = getTurretEnd(i);
        Projectile createProjectile2 = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF J2 = mo2655J(i);
        createProjectile2.x = J2.x;
        createProjectile2.y = J2.y;
        createProjectile2.color = Color.argb(255, 30, 30, 150);
        createProjectile2.f1047x = 1.0f;
        createProjectile2.directDamage = 42.0f;
        createProjectile2.target = unit;
        createProjectile2.lifeTimer = 250.0f;
        createProjectile2.speed = 1.3f;
        createProjectile2.f982aH = false;
        createProjectile2.f983aM = true;
        createProjectile2.f987aQ = true;
        GameEngine.getInstance();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        if (action == f3643j) {
            this.f3646a = true;
        }
        if (action == f3644k) {
            this.f3646a = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3645l;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}