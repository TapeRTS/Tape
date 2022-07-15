package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.buildings.Item;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class Turret extends Factory {

    /* renamed from: j */
    boolean upgraded;

    /* renamed from: k */
    int f3197k;

    /* renamed from: dF */
    float f3193dF;

    /* renamed from: dG */
    float f3194dG;

    /* renamed from: dH */
    boolean f3195dH;

    /* renamed from: g */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: a */
    private static BitmapOrTexture IMAGE_TURRET = null;

    /* renamed from: b */
    private static BitmapOrTexture IMAGE_TURRET_L2 = null;

    /* renamed from: c */
    private static BitmapOrTexture IMAGE_TURRET_L3 = null;

    /* renamed from: d */
    private static BitmapOrTexture IMAGE_TURRET_ART = null;

    /* renamed from: e */
    private static BitmapOrTexture IMAGE_TURRET_FLAME = null;

    /* renamed from: h */
    static BitmapOrTexture[] f3204h = new BitmapOrTexture[10];

    /* renamed from: i */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: t */
    static String gun = "gun";

    /* renamed from: u */
    static String gunT2 = "gunT2";

    /* renamed from: v */
    static String gunT3 = "gunT3";

    /* renamed from: w */
    static String artillery = "artillery";

    /* renamed from: x */
    static String flamethrower = "flamethrower";

    /* renamed from: C */
    static String aa_t1 = "aa_t1";

    /* renamed from: D */
    static String aa_t2 = "aa_t2";

    /* renamed from: dB */
    static String aa_flak = "aa_flak";

    /* renamed from: dC */
    static BitmapOrTexture IMAGE_ICON = null;

    /* renamed from: dD */
    static BitmapOrTexture[] f3215dD = new BitmapOrTexture[10];

    /* renamed from: dJ */
    public static Action f3216dJ = new AbstractC0222w(101) { // from class: com.corrodinggames.rts.game.units.d.a.b.1
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
            return LangLocale.getI18NText("gui.actions.upgradeToGunT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 1000;
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
            if (turret.m3033L() != 1 || turret.mo2915a(Action.f1432h, z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Turret) unit).m3033L() != 1) {
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
            return EnumC0219t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public void mo3007f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m3026b(Turret.gunT2);
            turret.m2646V();
        }
    };

    /* renamed from: dK */
    public static Action f3217dK = new AbstractC0222w(104) { // from class: com.corrodinggames.rts.game.units.d.a.b.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeToGunT3", new Object[0]);
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
            if (((Turret) unit).mo2915a(Action.f1432h, z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (!(((Turret) unit).f3221l instanceof C0463f)) {
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
            return EnumC0219t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public void mo3007f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m3026b(Turret.gunT3);
            turret.m2646V();
        }
    };

    /* renamed from: dL */
    public static Action f3218dL = new AbstractC0222w(102) { // from class: com.corrodinggames.rts.game.units.d.a.b.3
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Large increase in range";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeToArtillery", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 1600;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m3033L() != 1 || turret.mo2915a(Action.f1432h, z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Turret) unit).m3033L() != 1) {
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
            return EnumC0219t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public void mo3007f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m3026b(Turret.artillery);
            turret.m2646V();
        }
    };

    /* renamed from: dM */
    public static Action f3219dM = new AbstractC0222w(103) { // from class: com.corrodinggames.rts.game.units.d.a.b.4
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Short range area affect\n-Adds self-repair";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0222w
        /* renamed from: I */
        public float getBuildSpeed() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.m3033L() != 1 || turret.mo2915a(Action.f1432h, z) > 0) {
                return false;
            }
            return super.isActive(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            if (((Turret) unit).m3033L() != 1) {
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
            return EnumC0219t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public void mo3007f(Unit unit) {
            Turret turret = (Turret) unit;
            turret.m3026b(Turret.flamethrower);
            turret.m2646V();
        }
    };

    /* renamed from: dN */
    static ArrayList f3220dN = new ArrayList();

    /* renamed from: l */
    AbstractC0460c f3221l = new C0465h(this);

    /* renamed from: dE */
    boolean f3222dE = true;

    /* renamed from: dI */
    Rect f3223dI = new Rect();

    static {
        f3220dN.add(f3216dJ);
        f3220dN.add(f3217dK);
        f3220dN.add(f3218dL);
        f3220dN.add(f3219dM);
    }

    /* renamed from: L */
    public int m3033L() {
        return this.f3221l.mo2996b();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2660G(int i) {
        return this.f3221l.mo3003h(i);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public void type(String str) {
        m3026b(str);
    }

    /* renamed from: b */
    public void m3026b(String str) {
        if (!this.f3221l.m3006a(str)) {
            AbstractC0460c abstractC0460c = this.f3221l;
            this.f3221l = m3022c(str);
            this.f3221l.mo2997a(abstractC0460c);
        }
    }

    /* renamed from: c */
    public AbstractC0460c m3022c(String str) {
        if (str.equals(gun)) {
            return new C0465h(this);
        }
        if (str.equals(gunT2)) {
            return new C0463f(this);
        }
        if (str.equals(gunT3)) {
            return new C0464g(this);
        }
        if (str.equals(artillery)) {
            return new C0461d(this);
        }
        if (str.equals(flamethrower)) {
            return new C0462e(this);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.upgraded);
        outputNetStream.writeBoolean(this.f3197k == 1);
        outputNetStream.writeString(this.f3221l.mo2994c());
        outputNetStream.writeInt(this.f3197k);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        boolean readBoolean = inputNetStream.readBoolean();
        if (readBoolean) {
            upgrade(2);
        }
        if (inputNetStream.m1237b() >= 27) {
            this.f3197k = inputNetStream.readBoolean() ? 1 : 0;
        }
        if (inputNetStream.m1237b() >= 35) {
            String readString = inputNetStream.readString();
            if (!this.f3221l.m3006a(readString)) {
                m3026b(readString);
            }
            this.f3197k = inputNetStream.readInt();
        } else if (readBoolean && !(this instanceof AntiAir)) {
            m3026b(gunT2);
        }
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3215dD[this.team.getId()];
    }

    /* renamed from: dw */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.turret_base);
        IMAGE_WREAK = game.graphics.loadImage(R.drawable.turret_base_dead);
        IMAGE_TURRET = game.graphics.loadImage(R.drawable.turret_top);
        IMAGE_TURRET_L2 = game.graphics.loadImage(R.drawable.turret_top_l2);
        IMAGE_TURRET_L3 = game.graphics.loadImage(R.drawable.turret_top_l3);
        IMAGE_TURRET_ART = game.graphics.loadImage(R.drawable.turret_top_artillery);
        IMAGE_TURRET_FLAME = game.graphics.loadImage(R.drawable.turret_top_flame);
        f3204h = Team.createBitmapForTeam(IMAGE);
        IMAGE_ICON = game.graphics.loadImage(R.drawable.unit_icon_building_turrent);
        f3215dD = Team.createBitmapForTeam(IMAGE_ICON);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3795d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return IMAGE_WREAK;
        }
        if (this.team == null) {
            return f3204h[f3204h.length - 1];
        }
        return f3204h[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return this.f3221l.mo2992d(i);
    }

    public Turret(boolean z) {
        super(z);
        setObjectWidth(35);
        setObjectHeight(42);
        this.radius = 16.0f;
        this.displayRadius = this.radius;
        this.maxHp = 700.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.f1532cC[0].f1652a = CommonUtils.m1723a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.footprint.set(0, 0, 1, 1);
        this.softFootprint.set(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void mo3012s(float f) {
        if (this.f1532cC[0].m3724a()) {
            if (this.f3222dE) {
                this.f3193dF = this.f1532cC[0].f1652a;
                this.f3222dE = false;
                this.f3194dG = CommonUtils.m1723a(this, 0, 120);
            }
            this.f3194dG += f;
            if (this.f3194dG > 450.0f) {
                this.f3194dG = CommonUtils.m1723a(this, 0, 30);
                this.f3195dH = !this.f3195dH;
            }
            if (this.f3194dG < 120.0f) {
                if (this.f3195dH) {
                    m2640a(f * 0.3f, this.f3193dF - 20.0f, 0);
                    return;
                } else {
                    m2640a(f * 0.3f, this.f3193dF + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3222dE = true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (isActive()) {
            this.f3221l.mo3000a(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        this.f3221l.mo2998a(unit, i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return this.f3221l.mo3001a();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return this.f3221l.mo2999a(i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return this.f3221l.mo3005e(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return this.f3221l.mo3004f(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        if (!this.dead) {
            m3015dx();
            return true;
        }
        return true;
    }

    /* renamed from: dx */
    void m3015dx() {
        GameEngine game = GameEngine.getInstance();
        BitmapOrTexture mo2487d = mo2487d(0);
        PointF pointF = mo2662F(0);
        game.graphics.mo197a(mo2487d, pointF.x - GameEngine.getInstance().viewpointX_rounded, pointF.y - GameEngine.getInstance().viewpointY_rounded, this.f1532cC[0].f1652a, mo2863f());
    }

    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return this.f3221l.mo2991g(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: L */
    public void mo2653L(int i) {
        if (getShootDelay(i) < 10.0f) {
            return;
        }
        super.mo2653L(i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        Action specialAction = mo3219a(item.uIndex);
        if (specialAction != null) {
            specialAction.mo3007f(this);
        } else {
            NetworkEngine.m1467a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + item.uIndex + " id:" + this.GameObjectID, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        if (m3033L() == 1) {
            return f3216dJ.m3834L();
        }
        if (this.f3221l instanceof C0463f) {
            return f3217dK.m3834L();
        }
        return Action.f1432h;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3030a(ArrayList arrayList) {
        arrayList.clear();
        if (m3033L() == 1) {
            arrayList.add(f3218dL.m3834L());
            arrayList.add(f3219dM.m3834L());
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        if (i == 1) {
            this.upgraded = false;
        } else if (i == 2 && !this.upgraded) {
            this.upgraded = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        return this.f3221l.mo3002c(i);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bT */
    public float getSecBar() {
        if (this.f1532cC[0].f1656e > 0.0f && this.f3221l.m3006a(artillery)) {
            return 1.0f - (this.f1532cC[0].f1656e / getShootDelay(0));
        }
        return super.getSecBar();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        f3752ba.m4669a(super.mo2662F(i));
        f3752ba.m4668b(0.0f, -5.0f);
        return f3752ba;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3220dN;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cV */
    public float mo2897cV() {
        return GameEngine.getInstance().map.pixel_Width;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cW */
    public float mo2896cW() {
        return GameEngine.getInstance().map.pixel_Height;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo2895cX() {
        return super.mo2895cX() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cJ */
    public int mo3021cJ() {
        return this.f3221l.mo2993d();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        return this.f3221l.mo2995b(i);
    }
}