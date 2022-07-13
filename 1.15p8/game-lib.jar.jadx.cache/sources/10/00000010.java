package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0230ae;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.LandingCraft;
import com.corrodinggames.rts.game.units.p012a.AbstractC0223x;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class DropShip extends AbstractC0297b implements AbstractC0230ae {

    /* renamed from: f */
    float f1815f;

    /* renamed from: g */
    boolean f1816g;

    /* renamed from: a */
    static BitmapOrTexture f1808a = null;

    /* renamed from: b */
    static BitmapOrTexture f1809b = null;

    /* renamed from: c */
    static BitmapOrTexture f1810c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f1811d = new BitmapOrTexture[10];

    /* renamed from: q */
    public static final Action f1812q = new AbstractC0223x(109) { // from class: com.corrodinggames.rts.game.units.b.d.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.AbstractC0223x, com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return ((DropShip) unit).f1818o.size();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return !((DropShip) unit).f1816g && !((OrderableUnit) unit).m3749cI() && ((DropShip) unit).f1818o.size() > 0;
        }
    };

    /* renamed from: r */
    public static final Action f1813r = new AbstractC0223x(110) { // from class: com.corrodinggames.rts.game.units.b.d.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return LangLocale.getI18NText("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return ((DropShip) unit).f1816g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            return isActive(unit, false);
        }
    };

    /* renamed from: s */
    static ArrayList f1814s = new ArrayList();

    /* renamed from: e */
    float f1817e = 0.0f;

    /* renamed from: o */
    ObjectVector f1818o = new ObjectVector();

    /* renamed from: p */
    Rect f1819p = new Rect();

    static {
        f1814s.add(f1812q);
        f1814s.add(f1813r);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeFloat(this.f1817e);
        outputNetStream.writeFloat(this.f1815f);
        outputNetStream.writeBoolean(this.f1816g);
        outputNetStream.writeInt(this.f1818o.size());
        Iterator it = this.f1818o.iterator();
        while (it.hasNext()) {
            outputNetStream.mo1260a((Unit) it.next());
        }
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f1817e = inputNetStream.readFloat();
        this.f1815f = inputNetStream.readFloat();
        this.f1816g = inputNetStream.readBoolean();
        this.f1818o.clear();
        int readInt = inputNetStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Unit m1219o = inputNetStream.m1219o();
            if (m1219o != null) {
                this.f1818o.add(m1219o);
            }
        }
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bW */
    public int getBlockBar() {
        return LandingCraft.m2830a(this.f1818o);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bX */
    public int getBlockBarMax() {
        return 4;
    }

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.f1729z;
    }

    /* renamed from: c */
    public static void m3653c() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1809b = gameEngine.graphics.loadImage(R.drawable.dropship);
        f1810c = gameEngine.graphics.loadImage(R.drawable.dropship_shadow);
        f1808a = gameEngine.graphics.loadImage(R.drawable.dropship_dead);
        f1811d = Team.createBitmapForTeam(f1809b);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f1808a;
        }
        return f1811d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1810c;
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
        this.image = f1808a;
        setDrawLayer(0);
        this.collidable = false;
        m3651f(true);
        return true;
    }

    public DropShip(boolean z) {
        super(z);
        setObjectWidth(45);
        setObjectHeight(47);
        this.radius = 20.0f;
        this.displayRadius = this.radius + 0.0f;
        this.maxHp = 500.0f;
        this.hp = this.maxHp;
        this.image = f1809b;
        this.shadowImage = f1810c;
        this.height = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public boolean mo2657I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return this.height >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cq */
    public boolean mo3177cq() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead) {
            return;
        }
        boolean cI = m3749cI();
        if (this.f1816g && !cI && !this.moving && this.height < 4.0f) {
            this.f1815f = CommonUtils.toZero(this.f1815f, f);
            if (this.f1815f == 0.0f) {
                this.f1815f = 30.0f;
                if (this.f1818o.size() == 0) {
                    this.f1816g = false;
                } else {
                    boolean z = this.f1818o.size() % 2 == 0;
                    float cos = this.x + (CommonUtils.cos(this.direction) * (-9.0f));
                    float sin = this.y + (CommonUtils.sin(this.direction) * (-9.0f));
                    float cos2 = cos + (CommonUtils.cos(this.direction + 90.0f) * (z ? -7 : 7)) + (CommonUtils.sin(this.direction + 90.0f) * (z ? -7 : 7));
                    Unit unit = (Unit) this.f1818o.remove(this.f1818o.size() - 1);
                    if (!C0955y.m456a(unit, cos2, sin)) {
                        cos2 += 10.0f;
                    }
                    if (!C0955y.m456a(unit, cos2, sin)) {
                        cos2 -= 20.0f;
                    }
                    if (!C0955y.m456a(unit, cos2, sin)) {
                        cos2 -= 10.0f;
                        sin += 10.0f;
                    }
                    if (!C0955y.m456a(unit, cos2, sin)) {
                        sin -= 20.0f;
                    }
                    if (!C0955y.m456a(unit, cos2, sin)) {
                        this.f1818o.add(unit);
                    } else {
                        unit.transportedBy = null;
                        unit.x = cos2;
                        unit.y = sin;
                        unit.f1611bQ += 0.1f;
                        unit.direction = this.direction + 180.0f;
                        unit.f1518bJ = this;
                        unit.f1519bK = 45.0f;
                        if (unit instanceof OrderableUnit) {
                            OrderableUnit orderableUnit = (OrderableUnit) unit;
                            orderableUnit.m2545ay();
                            orderableUnit.m2489d(this.x + (CommonUtils.cos(this.direction) * (-66.0f)), this.y + (CommonUtils.sin(this.direction) * (-66.0f)));
                        }
                        if (this.f1818o.size() == 0) {
                            this.f1816g = false;
                        }
                    }
                }
            }
        }
        this.f1817e += 2.0f * f;
        if (this.f1817e > 360.0f) {
            this.f1817e -= 360.0f;
        }
        boolean mo2676i = mo2676i();
        if (isActive()) {
            if (m2554ap() && !cI) {
                this.height = CommonUtils.m1744a(this.height, 2.0f, 0.4f * f);
            } else {
                this.height = CommonUtils.m1744a(this.height, 35.0f + (CommonUtils.sin(this.f1817e) * 1.5f), 0.35f * f);
            }
        }
        if (mo2676i != mo2676i()) {
            this.f3699ar = true;
            if (mo2676i()) {
                setDrawLayer(5);
            } else {
                setDrawLayer(2);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        float turretSize = getTurretSize(i);
        float f = this.direction;
        f3751aZ.set(this.x + (CommonUtils.cos(f) * turretSize), this.y + (CommonUtils.sin(f) * turretSize));
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        createProjectile.color = Color.argb(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        createProjectile.directDamage = 35.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 80.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f1047x = 2.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1127220);
        gameEngine.effects.emitSmalFlame(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a);
        gameEngine.audio.playSound(AudioEngine.f3875u, 0.3f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 2.3f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        m3651f(true);
        super.remove();
    }

    /* renamed from: f */
    public void m3651f(boolean z) {
        Iterator it = this.f1818o.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.transportedBy = null;
            unit.x = this.x + (CommonUtils.cos(this.direction) * (-9.0f));
            unit.y = this.y + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m3744ch();
            }
        }
        this.f1818o.clear();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bz */
    public boolean mo2497bz() {
        return this.f1816g;
    }

    /* renamed from: L */
    public void m3655L() {
        this.f1816g = true;
        this.f1815f = 30.0f;
    }

    /* renamed from: dn */
    public void m3652dn() {
        this.f1816g = false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 16000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2822d(Unit unit, boolean z) {
        if (this.f1816g || !LandingCraft.m2829a(this.f1818o, 4, unit) || unit == this) {
            return false;
        }
        if (this.team != unit.team && !z) {
            return false;
        }
        return C0955y.m450a(unit, true, true);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo2819e(Unit unit, boolean z) {
        if (!mo2822d(unit, z)) {
            return false;
        }
        m3656E(unit);
        return true;
    }

    /* renamed from: E */
    public void m3656E(Unit unit) {
        unit.transportedBy = this;
        this.f1818o.add(unit);
        GameEngine.getInstance().interfaceEngine.unselectUnit(unit);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: e */
    public void mo2820e(Unit unit) {
        if (unit.transportedBy == this) {
            this.f1818o.remove(unit);
            unit.transportedBy = null;
            return;
        }
        GameEngine.LogTrace("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        if (action == f1812q) {
            m3655L();
        }
        if (action == f1813r) {
            m3652dn();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bA */
    public int mo2526bA() {
        return this.f1818o.size();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cp */
    public boolean mo2823cp() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cn */
    public C0202c mo2824cn() {
        return f1812q.m3834L();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f1814s;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: f */
    public boolean mo2818f() {
        return !m3749cI();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: j */
    public boolean mo2816j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: by */
    public ObjectVector mo2498by() {
        return this.f1818o;
    }
}