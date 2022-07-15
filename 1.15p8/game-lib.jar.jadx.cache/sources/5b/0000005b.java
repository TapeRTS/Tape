package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class AntinukeLauncher extends Factory {

    /* renamed from: c */
    boolean f3237c;

    /* renamed from: d */
    int f3238d;

    /* renamed from: e */
    float f3239e;

    /* renamed from: h */
    PointF f3240h = new PointF();

    /* renamed from: i */
    Rect f3241i = new Rect();

    /* renamed from: a */
    static BitmapOrTexture[] f3230a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: f */
    static BitmapOrTexture f3232f = null;

    /* renamed from: g */
    static BitmapOrTexture[] f3233g = new BitmapOrTexture[10];

    /* renamed from: j */
    static Action f3234j = new Action(145) { // from class: com.corrodinggames.rts.game.units.d.c.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.antiNukeCount", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            if (mo2738b(unit, false) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: I */
        public UnitType mo2734i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1447a;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1437a;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return ((AntinukeLauncher) unit).f3238d;
        }
    };

    /* renamed from: k */
    static Action f3235k = new AbstractC0222w(144) { // from class: com.corrodinggames.rts.game.units.d.c.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.buildAntiNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 4000;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            AntinukeLauncher antinukeLauncher = (AntinukeLauncher) unit;
            if (antinukeLauncher.f3238d + antinukeLauncher.mo2915a(m3834L(), z) >= 12.0f) {
                return false;
            }
            return super.isActive(unit, z);
        }

        /* renamed from: J */
        public UnitType mo2734i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1440d;
        }
    };

    /* renamed from: l */
    static ArrayList f3236l = new ArrayList();

    static {
        f3236l.add(f3234j);
        f3236l.add(f3235k);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream stream) {
        stream.writeBoolean(this.f3237c);
        stream.writeInt(this.f3238d);
        super.writeOut(stream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream stream) {
        this.f3237c = stream.readBoolean();
        if (stream.m1237b() >= 30) {
            this.f3238d = stream.readInt();
        }
        super.mo427a(stream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3233g[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.antinuke_launcher_dead);
        BitmapOrTexture IMAGE = game.graphics.loadImage(R.drawable.antinuke_launcher);
        f3230a = Team.createBitmapForTeam(IMAGE);
        IMAGE.mo50m();
        f3232f = game.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3233g = Team.createBitmapForTeam(f3232f);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance();
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3799h);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        return f3230a[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
    }

    public AntinukeLauncher(boolean z) {
        super(z);
        this.image = f3230a[f3230a.length - 1];
        m2331b(this.image);
        this.radius = 24.0f;
        this.displayRadius = this.radius;
        this.maxHp = 2800.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (isActive() && !this.dead && this.f3238d > 0) {
            Projectile projectile = null;
            this.f3239e = CommonUtils.toZero(this.f3239e, f);
            if (this.f3239e == 0.0f) {
                this.f3239e = 15.0f;
                Iterator it = Projectile.f1024a.iterator();
                while (it.hasNext()) {
                    Projectile projectile2 = (Projectile) it.next();
                    if (projectile2.f960D && projectile2.height > 50.0f && CommonUtils.distanceSq(this.x, this.y, projectile2.x, projectile2.y) < 2200.0f * 2200.0f && CommonUtils.distanceSq(this.x, this.y, projectile2.f1016n, projectile2.f1017o) < 1000000.0f && (projectile2.source == null || (!projectile2.source.team.m3913d(this.team) && projectile2.source.team != this.team))) {
                        if (!m2988a(projectile2)) {
                            projectile = projectile2;
                        }
                    }
                }
            }
            if (projectile != null) {
                m2986b(projectile);
            }
        }
    }

    /* renamed from: a */
    public boolean m2988a(Projectile projectile) {
        Object[] items = Projectile.f1024a.getItems();
        int i = Projectile.f1024a.size;
        for (int i2 = 0; i2 < i; i2++) {
            Projectile projectile2 = (Projectile) items[i2];
            if (projectile2 != projectile && projectile2.f1019q == projectile) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m2986b(Projectile projectile) {
        GameEngine game = GameEngine.getInstance();
        if (this.f3238d <= 0) {
            return;
        }
        this.f3238d--;
        PointF turretEnd = getTurretEnd(0);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y);
        createProjectile.setDrawLayer(10);
        createProjectile.f1051P = (short) 10;
        createProjectile.f1053R = (short) 0;
        createProjectile.f1047x = 1.0f;
        createProjectile.f977aC = true;
        createProjectile.f1019q = projectile;
        createProjectile.lifeTimer = 99999.0f;
        createProjectile.speed = 0.2f;
        createProjectile.f1045r = 6.5f;
        createProjectile.color = Color.argb(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        createProjectile.directDamage = 600.0f;
        createProjectile.f982aH = true;
        createProjectile.f983aM = true;
        createProjectile.f987aQ = true;
        createProjectile.f959C = true;
        createProjectile.f1069aI = 80.0f;
        createProjectile.f1070aJ = 100.0f;
        createProjectile.f1072aL = 2.0f;
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        EffectObject m2205d = game.effects.m2205d(turretEnd.x, turretEnd.y, 0.0f, -1);
        if (m2205d != null) {
            m2205d.f4287H = 0.5f;
            m2205d.f4286G = 2.1f;
            m2205d.drawLayer = (short) 2;
            m2205d.timer = 90.0f;
            m2205d.startTimer = m2205d.timer;
            m2205d.f4301V = 0.0f;
        }
        game.audio.m2416a(AudioEngine.f3854D, 0.15f, 1.5f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        f3751aZ.set(this.x, this.y - 9.0f);
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    /* renamed from: c */
    public UnitType mo1775r() {
        return UnitType.AntiNukeLaucher;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bT */
    public float getSecBar() {
        return super.getSecBar();
    }

    /* renamed from: L */
    public void m2989L() {
        this.f3238d++;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3235k.m3834L())) {
            m2989L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (this.f3238d < 4) {
            return f3235k.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ci */
    public boolean mo2983ci() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3236l;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public void mo2755N() {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bZ */
    public void mo2985bZ() {
        C0955y.m452a((Unit) this, 990.0f, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public boolean mo426a(GameEngine gameEngine) {
        if (this.selected) {
            return true;
        }
        return super.mo426a(gameEngine);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo2681a(unit, f, projectile);
    }
}