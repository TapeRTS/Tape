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
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class NukeLauncher extends Factory {

    /* renamed from: c */
    int f3348c;

    /* renamed from: f */
    PointF f3349f = new PointF();

    /* renamed from: g */
    Rect f3350g = new Rect();

    /* renamed from: a */
    static BitmapOrTexture[] f3341a = new BitmapOrTexture[10];

    /* renamed from: b */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: d */
    static BitmapOrTexture f3343d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3344e = new BitmapOrTexture[10];

    /* renamed from: h */
    static Action f3345h = new Action(142) { // from class: com.corrodinggames.rts.game.units.d.q.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return ((NukeLauncher) unit).f3348c;
        }

        /* renamed from: I */
        public UnitType m2887I() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return ((NukeLauncher) unit).f3348c > 0;
        }
    };

    /* renamed from: i */
    static Action f3346i = new AbstractC0222w(143) { // from class: com.corrodinggames.rts.game.units.d.q.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return LangLocale.getI18NText("gui.actions.buildNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.buildNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            NukeLauncher nukeLauncher = (NukeLauncher) unit;
            if (nukeLauncher.f3348c + nukeLauncher.mo2915a(m3834L(), z) >= 4.0f) {
                return false;
            }
            return super.isActive(unit, z);
        }

        /* renamed from: J */
        public UnitType m2886J() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1440d;
        }
    };

    /* renamed from: j */
    static ArrayList f3347j = new ArrayList();

    static {
        f3347j.add(f3345h);
        f3347j.add(f3346i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f3348c);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3348c = inputNetStream.readInt();
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3344e[this.team.getId()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.nuke_launcher_dead);
        BitmapOrTexture IMAGE = game.graphics.loadImage(R.drawable.nuke_launcher);
        f3341a = Team.createBitmapForTeam(IMAGE);
        IMAGE.mo50m();
        f3343d = game.graphics.loadImage(R.drawable.unit_icon_building);
        f3344e = Team.createBitmapForTeam(f3343d);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bo */
    public int mo2508bo() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        GameEngine game = GameEngine.getInstance();
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3799h);
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
        EffectObject effect = game.effects.m2207c(x, y, 0.0f, -1127220);
        if (effect != null) {
            effect.f4287H = 0.2f;
            effect.f4286G = 2.0f;
            effect.drawLayer = (short) 2;
            effect.timer = 45.0f;
            effect.startTimer = effect.timer;
            effect.f4301V = 0.0f;
        }
        game.effects.m2235a(this.x, this.y, this.height, 40.0f, 120.0f);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        return f3341a[this.team.getId()];
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

    public NukeLauncher(boolean z) {
        super(z);
        this.image = f3341a[f3341a.length - 1];
        m2331b(this.image);
        this.radius = 40.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1500.0f;
        this.hp = this.maxHp;
        this.footprint.set(-2, -1, 2, 1);
        this.softFootprint.set(-2, -1, 2, 2);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        f3751aZ.set(this.x, this.y - 3.0f);
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
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

    // getUnitType
    /* renamed from: c */
    public UnitType get() {
        return UnitType.NukeLaucher;
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

    /* renamed from: a */
    public void m2892a(float f, float f2) {
        GameEngine game = GameEngine.getInstance();
        if (this.f3348c <= 0) {
            return;
        }
        if (CommonUtils.distanceSq(this.x, this.y, f, f2) < 202500.0f) {
            if (this.team == game.playerTeam) {
                game.interfaceEngine.m1879a("Nuke target too close");
                return;
            }
            return;
        }
        this.f3348c--;
        PointF turretEnd = getTurretEnd(0);
        createNuke(this, turretEnd.x, turretEnd.y, f, f2).f1012i = 5.0f;
        EffectObject emitLight = game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        if (emitLight != null) {
            emitLight.f4301V = 5.0f;
            emitLight.f4287H = 2.1f;
            emitLight.f4286G = 2.1f;
            emitLight.drawLayer = (short) 2;
            emitLight.f4332t = true;
            emitLight.f4333u = 70.0f;
            emitLight.timer = 370.0f;
            emitLight.startTimer = emitLight.timer;
            emitLight.startingAlpha = 1.0f;
        }
        EffectObject m2205d = game.effects.m2205d(turretEnd.x, turretEnd.y, 0.0f, -1);
        if (m2205d != null) {
            m2205d.f4287H = 1.0f;
            m2205d.f4286G = 3.1f;
            m2205d.drawLayer = (short) 2;
            m2205d.timer = 170.0f;
            m2205d.startTimer = m2205d.timer;
            m2205d.f4301V = 5.0f + 20.0f;
        }
        game.audio.m2416a(AudioEngine.f3854D, 0.27f, 0.8f, turretEnd.x, turretEnd.y);
    }

    /* renamed from: a */
    public static Projectile createNuke(Unit source, float x, float y, float x2, float y2) {
        Projectile p = Projectile.createProjectile(source, x, y);
        p.setDrawLayer(10);
        p.f1051P = (short) 0;
        p.f1052Q = (short) 1;
        p.f1053R = (short) 1;
        p.f1047x = 1.0f;
        p.f977aC = true;
        p.f1015m = true;
        p.f1016n = x2;
        p.f1017o = y2;
        p.lifeTimer = 99999.0f;
        p.speed = 0.1f;
        p.f1045r = 2.7f;
        p.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        p.directDamage = 300.0f;
        p.f982aH = true;
        p.f983aM = true;
        p.f987aQ = true;
        p.f959C = true;
        p.f960D = true;
        p.f1069aI = 80.0f;
        p.f1070aJ = 100.0f;
        p.f1072aL = 1.1f;
        p.f973Y = 5400.0f;
        p.f974Z = 250.0f;
        p.f1060ad = true;
        p.f1061ae = false;
        p.f1000ao = true;
        p.f1056W = 75.0f;
        p.f1057X = p.f1056W;
        p.f993aY = true;
        GameEngine game = GameEngine.getInstance();
        game.effects.m2210b(EnumC0668h.f4401e);
        EffectObject effect = game.effects.m2223a(p, -1118720);
        if (effect != null) {
            effect.timer = 1300.0f;
            effect.startTimer = effect.timer;
            effect.startingAlpha = 0.2f;
            effect.f4287H = 1.0f;
        }
        return p;
    }

    /* renamed from: L */
    public void m2893L() {
        this.f3348c++;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        if (item.uIndex.equals(f3346i.m3834L())) {
            m2893L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2752a(Action action, boolean z, PointF pointF, Unit unit) {
        if (z) {
            return;
        }
        if (action == f3345h) {
            m2892a(pointF.x, pointF.y);
        } else {
            super.mo2752a(action, z, pointF, unit);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3347j;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m439b((Unit) this, 450.0f, false);
    }
}