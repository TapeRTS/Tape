package com.corrodinggames.rts.game.units.buildings;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0451d;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p012a.C0212m;
import com.corrodinggames.rts.game.units.p012a.C0213n;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class Repairbay extends Building implements AbstractC0451d {

    /* renamed from: d */
    float f3356d;

    /* renamed from: f */
    Rect f3357f = new Rect();

    /* renamed from: g */
    Rect f3358g = new Rect();

    /* renamed from: i */
    PointF[] f3359i = new PointF[6];

    /* renamed from: j */
    PointF[] f3360j = new PointF[this.f3359i.length];

    /* renamed from: a */
    static BitmapOrTexture f3351a = null;

    /* renamed from: b */
    static BitmapOrTexture[] f3352b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3353c = null;

    /* renamed from: e */
    public static C0493s f3354e = new C0493s(true);

    /* renamed from: h */
    static ArrayList f3355h = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        super.mo427a(inputNetStream);
    }

    /* renamed from: L */
    public UnitType mo1775r() {
        return UnitType.repairbay;
    }

    static {
        f3355h.add(new C0212m(true));
        f3355h.add(new C0213n());
    }

    /* renamed from: dp */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        f3351a = game.graphics.loadImage(R.drawable.repair_bay);
        f3353c = game.graphics.loadImage(R.drawable.repair_bay_dead);
        f3352b = Team.createBitmapForTeam(f3351a);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: K */
    public boolean destroyEffectAndWreak() {
        this.image = f3353c;
        setDrawLayer(0);
        this.collidable = false;
        m2605a(EnumC0588v.f3794c);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3353c;
        }
        if (this.team == null) {
            return f3352b[f3352b.length - 1];
        }
        return f3352b[this.team.getId()];
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

    public Repairbay(boolean z) {
        super(z);
        this.image = f3351a;
        m2331b(f3351a);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.maxHp = 1000.0f;
        this.hp = this.maxHp;
        this.footprint.set(-1, -1, 1, 1);
        this.softFootprint.set(-1, -1, 1, 1);
        for (int i = 0; i < this.f3359i.length; i++) {
            this.f3359i[i] = new PointF();
            this.f3360j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo2719y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public float mo2748c(Unit unit) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2621a(Unit unit) {
        if (unit.mo2858q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Waypoint m2884a(OrderableUnit orderableUnit, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        f3354e.m2882a(orderableUnit.mo2719y() + f2, z);
        gameEngine.UnitGeoIndex.m2786a(orderableUnit.x, orderableUnit.y, orderableUnit.mo2719y() + f2, orderableUnit, f, f3354e);
        Unit unit = f3354e.f3365e;
        if (unit != null) {
            Waypoint m2556an = orderableUnit.m2556an();
            m2556an.m3686b(unit);
            if (m2556an != null) {
                m2556an.f1749k = f2;
                m2556an.f1744m = true;
                return m2556an;
            }
            return null;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        this.f3356d += f;
        if (m2554ap() && this.f3356d > 40.0f) {
            this.f3356d = 0.0f;
            m2884a((OrderableUnit) this, f, 0.0f, false);
        }
        if (!this.dead) {
            Builder.m2854a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        super.mo431a(f, z);
        if (!this.dead) {
            Builder.m2852b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        PointF F = mo2662F(i);
        f3751aZ.set(F.x + 0.0f, F.y - 33.0f);
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3355h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: b */
    public PointF[] mo2725b() {
        return this.f3359i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: c */
    public PointF[] mo2724c() {
        return this.f3360j;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return mo2719y();
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, mo2719y());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: C */
    public boolean mo2728C(Unit unit) {
        return true;
    }
}