package com.corrodinggames.rts.game.units.water;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0451d;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0212m;
import com.corrodinggames.rts.game.units.p012a.C0221v;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class BuilderShip extends WaterUnit implements AbstractC0451d {

    /* renamed from: f */
    PointF[] f3624f = new PointF[6];

    /* renamed from: g */
    PointF[] f3625g = new PointF[this.f3624f.length];

    /* renamed from: h */
    Rect f3626h = new Rect();

    /* renamed from: a */
    static BitmapOrTexture IMAGE_WREAK = null;

    /* renamed from: b */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: c */
    static BitmapOrTexture IMAGE_TURRET = null;

    /* renamed from: d */
    static BitmapOrTexture f3621d = null;

    /* renamed from: e */
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[10];

    /* renamed from: i */
    static Action f3623i = new C0212m(false);

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return Builder.f3409h[this.team.getId()];
    }

    /* renamed from: q_ */
    public UnitType getUnitType() {
        return UnitType.f1686L;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: b */
    public PointF[] mo2725b() {
        return this.f3624f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: c */
    public PointF[] mo2724c() {
        return this.f3625g;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 6000.0f;
    }

    /* renamed from: K */
    public static void m2727K() {
        GameEngine gameEngine = GameEngine.getInstance();
        IMAGE = gameEngine.graphics.loadImage(R.drawable.builder_ship);
        IMAGE_WREAK = gameEngine.graphics.loadImage(R.drawable.builder_ship_dead);
        IMAGE_TURRET = gameEngine.graphics.loadImage(R.drawable.builder_ship_turret);
        IMAGE_TEAMS = Team.createBitmapForTeam(IMAGE);
        f3621d = m3772a(IMAGE, IMAGE.getWidth(), IMAGE.getHeight());
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
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return IMAGE_TURRET;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3621d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && this.height > -2.0f;
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
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = IMAGE_WREAK;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public BuilderShip(boolean z) {
        super(z);
        m2331b(IMAGE);
        this.radius = 13.0f;
        this.displayRadius = this.radius;
        this.maxHp = 500.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        for (int i = 0; i < this.f3624f.length; i++) {
            this.f3624f[i] = new PointF();
            this.f3625g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.water.WaterUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.dead) {
            Builder.m2854a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        super.mo431a(f, z);
        if (!this.dead) {
            Builder.m2852b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0955y.m449a((OrderableUnit) this);
        if (!this.dead) {
            float mo2483e = this.f1532cC[0].f1657f / mo2483e(0);
            if (mo2483e != 0.0f) {
                PointF E = getTurretEnd(0);
                gameEngine.graphics.mo137h();
                gameEngine.graphics.mo164b(E.x - gameEngine.viewpointX_rounded, (E.y - gameEngine.viewpointY_rounded) - this.height);
                gameEngine.graphics.mo224a(mo2483e, mo2483e);
                if (m2644X()) {
                    gameEngine.graphics.mo196a(Builder.f3407f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.graphics.mo196a(Builder.f3406e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.graphics.mo136i();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        f3752ba.set(this.x + (CommonUtils.cos(this.direction) * 8.0f), this.y + (CommonUtils.sin(this.direction) * 8.0f));
        return f3752ba;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2481f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2621a(Unit unit) {
        if (!unit.mo2858q() && unit.mo2975bH()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
    }

    /* renamed from: a */
    public static void m2726a(ArrayList arrayList, int i) {
        arrayList.add(f3623i);
        arrayList.add(new C0221v(UnitType.f1701a, 1, 1));
        arrayList.add(new C0221v(UnitType.f1709f, 1, 2));
        arrayList.add(new C0221v(UnitType.f1710g, 1, 3));
        arrayList.add(new C0221v(UnitType.f1705b, 1, 4));
        arrayList.add(new C0221v(UnitType.f1706c, 1, 5));
        arrayList.add(new C0221v(UnitType.f1707d, 1, 6));
        arrayList.add(new C0221v(UnitType.f1684J, 1, 7));
        arrayList.add(new C0221v(UnitType.f1728y, 1, 8));
        arrayList.add(new C0221v(UnitType.f1676B, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return getUnitType().mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo2719y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: C */
    public boolean mo2728C(Unit unit) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public float mo2723f(com.corrodinggames.rts.game.units.UnitType unitType) {
        int mo2719y = mo2719y();
        int mo3130a = unitType.mo3130a(this);
        if (mo3130a == 0 && unitType.mo3073p()) {
            mo3130a = 110;
        }
        return mo2719y + mo3130a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public int mo2721u(Unit unit) {
        return (int) mo2723f(unit.getUnitType());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public int mo2720v(Unit unit) {
        return (int) mo2723f(unit.getUnitType());
    }
}