package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class CommandCenter extends Factory {

    /* renamed from: a */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: b */
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: d */
    static BitmapOrTexture f3252d = null;

    /* renamed from: e */
    float f3253e;

    /* renamed from: f */
    public float f3254f;

    /* renamed from: g */
    public float f3255g;

    /* renamed from: h */
    public int f3256h;

    /* renamed from: i */
    public float f3257i;

    /* renamed from: j */
    public float f3258j;

    /* renamed from: k */
    float frameUpdate = 20.0f;

    /* renamed from: l */
    int fakeFrame = 0;

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream stream) {
        stream.writeFloat(this.f3253e);
        super.writeOut(stream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream stream) {
        this.f3253e = stream.readFloat();
        super.mo427a(stream);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.base);
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.base_dead);
        f3252d = game.graphics.loadImage(R.drawable.base_back);
        IMAGE_TEAMS = Team.createBitmapForTeam(IMAGE);
    }

    // getUnitType
    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine game = GameEngine.getInstance();
        this.image = IMAGE_WREAK;
        this.image_back = null;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3795d);
        float x = this.x;
        float y = this.y;
        game.effects.m2210b(EnumC0668h.f4401e);
        EffectObject effectObj = game.effects.emitLight(x, y, this.height, Color.argb(255, 255, 255, 255));
        if (effectObj != null) {
            effectObj.f4287H = 8.0f;
            effectObj.f4286G = 5.0f;
            effectObj.startingAlpha = 0.9f;
            effectObj.timer = 20.0f;
            effectObj.startTimer = effectObj.timer;
            effectObj.fadeOut = true;
        }
        game.effects.m2210b(EnumC0668h.f4401e);
        EffectObject m2207c = game.effects.m2207c(x, y, 0.0f, -1127220);
        if (m2207c != null) {
            m2207c.f4287H = 0.2f;
            m2207c.f4286G = 2.0f;
            m2207c.drawLayer = (short) 2;
            m2207c.timer = 45.0f;
            m2207c.startTimer = m2207c.timer;
            m2207c.f4301V = 0.0f;
        }
        game.effects.m2235a(this.x, this.y, this.height, 40.0f, 70.0f);
        Emitter.m2195a(this.x, this.y);
        Emitter.m2191b(this.x, this.y).f4362a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: R */
    public void mo2650R() {
        super.mo2650R();
        if (this.dead) {
            this.image_back = null;
        } else {
            this.image_back = f3252d;
        }
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
        return null;
    }

    public CommandCenter(boolean z) {
        super(z);
        this.image = IMAGE;
        this.image_back = f3252d;
        setObjectWidth(53);
        setObjectHeight(68);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 4000.0f;
        this.hp = this.maxHp;
        setDrawLayer(3);
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cD */
    public RectF mo2967cD() {
        RectF cD = super.mo2967cD();
        cD.m4653a(6.0f, 0.0f);
        return cD;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float deltaSpeed) {
        GameEngine.getInstance();
        super.update(deltaSpeed);
        if (!isActive() || this.dead) {
            return;
        }
        this.frameUpdate = CommonUtils.toZero(this.frameUpdate, deltaSpeed);
        if (this.frameUpdate == 0.0f) {
            this.frameUpdate = 5.0f;
            this.fakeFrame++;
            if (this.fakeFrame > 6) {
                this.fakeFrame = 0;
                this.frameUpdate = 70.0f;
            }
            if (this.fakeFrame <= 3) {
                this.drawFrame = this.fakeFrame;
            } else {
                this.drawFrame = 6 - this.fakeFrame;
            }
        }
        this.f3254f += deltaSpeed;
        this.f3256h++;
        this.f3257i += 10.0f;
        if (this.f3258j > deltaSpeed) {
            this.f3258j = deltaSpeed;
        }
        this.f3255g += deltaSpeed;
        this.f3253e += deltaSpeed;
        if (this.f3253e > Team.f1353am - 0.1f) {
            this.f3253e -= Team.f1353am;
            this.team.m3944b(getIncome() * (Team.f1353am / Team.f1352al));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cv */
    public float getIncome() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        Projectile createProjectile = Projectile.createProjectile(this, this.x, this.y);
        PointF J = mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = target;
        createProjectile.lifeTimer = 180.0f;
        createProjectile.speed = 2.0f;
        createProjectile.f1045r = 5.0f;
        createProjectile.f982aH = true;
        createProjectile.f983aM = true;
        createProjectile.f987aQ = true;
        createProjectile.f981aG = true;
        GameEngine game = GameEngine.getInstance();
        game.effects.m2223a(createProjectile, -1118720);
        game.audio.playSound(AudioEngine.missile_fire, 0.8f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    /* renamed from: a */
    public static void m2970a(ArrayList arrayList, int i) {
        arrayList.add(new C0214o());
        arrayList.add(new C0211l(UnitType.builder, 1));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return getUnitType().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo2681a(unit, f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: s */
    public int mo2441s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bo */
    public int mo2508bo() {
        return 35;
    }
}