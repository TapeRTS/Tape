package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0230ae;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p012a.AbstractC0223x;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.e.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class LandingCraft extends AbstractC0507h implements AbstractC0230ae {

    /* renamed from: f */
    float f3459f;

    /* renamed from: g */
    boolean f3460g;

    /* renamed from: a */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: b */
    static BitmapOrTexture f3453b = null;

    /* renamed from: c */
    static BitmapOrTexture f3454c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f3455d = new BitmapOrTexture[10];

    /* renamed from: i */
    public static final Action f3456i = new AbstractC0223x(109) { // from class: com.corrodinggames.rts.game.units.e.i.1
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
            return ((AbstractC0230ae) unit).mo2526bA();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return !((AbstractC0230ae) unit).mo2497bz() && ((AbstractC0230ae) unit).mo2818f() && ((AbstractC0230ae) unit).mo2526bA() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            return ((AbstractC0230ae) unit).mo2816j();
        }
    };

    /* renamed from: j */
    public static final Action f3457j = new AbstractC0223x(110) { // from class: com.corrodinggames.rts.game.units.e.i.2
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
            return ((AbstractC0230ae) unit).mo2497bz();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            return isActive(unit, false);
        }
    };

    /* renamed from: k */
    static ArrayList f3458k = new ArrayList();

    /* renamed from: e */
    float f3461e = 0.0f;

    /* renamed from: h */
    ObjectVector f3462h = new ObjectVector();

    static {
        f3458k.add(f3456i);
        f3458k.add(f3457j);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream stream) {
        stream.writeFloat(this.f3461e);
        stream.writeFloat(this.f3459f);
        stream.writeBoolean(this.f3460g);
        stream.writeInt(this.f3462h.size());
        Iterator it = this.f3462h.iterator();
        while (it.hasNext()) {
            stream.mo1260a((Unit) it.next());
        }
        super.writeOut(stream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream stream) {
        this.f3461e = stream.readFloat();
        this.f3459f = stream.readFloat();
        this.f3460g = stream.readBoolean();
        this.f3462h.clear();
        int readInt = stream.readInt();
        for (int i = 0; i < readInt; i++) {
            Unit m1219o = stream.m1219o();
            if (m1219o != null) {
                this.f3462h.add(m1219o);
            }
        }
        super.mo427a(stream);
    }

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.hovercraft;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        IMAGE = game.graphics.loadImage(R.drawable.hovercraft);
        f3454c = game.graphics.loadImage(R.drawable.hovercraft_shadow);
        f3453b = game.graphics.loadImage(R.drawable.hovercraft_dead);
        f3455d = Team.createBitmapForTeam(IMAGE);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3453b;
        }
        return f3455d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3454c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        this.image = f3453b;
        setDrawLayer(0);
        this.collidable = false;
        m2817f(true);
        m2605a(EnumC0588v.f3793b);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        m2817f(true);
        super.remove();
    }

    /* renamed from: f */
    public void m2817f(boolean z) {
        Iterator it = this.f3462h.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.transportedBy = null;
            unit.x = this.x + (CommonUtils.cos(this.direction) * (-9.0f));
            unit.y = this.y + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m3744ch();
            }
        }
        this.f3462h.clear();
    }

    public LandingCraft(boolean z) {
        super(z);
        setObjectWidth(20);
        setObjectHeight(32);
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.maxHp = 450.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
        this.shadowImage = f3454c;
    }

    /* renamed from: a */
    public static int m2830a(ObjectVector objectVector) {
        int i = 0;
        Iterator it = objectVector.iterator();
        while (it.hasNext()) {
            i += ((Unit) it.next()).mo2844ct();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m2829a(ObjectVector objectVector, int i, Unit unit) {
        if (m2830a(objectVector) + unit.mo2844ct() <= i) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bW */
    public int getBlockBar() {
        return m2830a(this.f3462h);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bX */
    public int getBlockBarMax() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m2832a(Unit unit, Unit unit2, boolean z) {
        return m2831a(unit, unit2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m2831a(Unit unit, Unit unit2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float cos = (unit.x + (CommonUtils.cos(unit.direction + f2) * f5)) - (CommonUtils.sin(unit.direction + f2) * f4);
        float sin = unit.y + (CommonUtils.sin(unit.direction + f2) * f5) + (CommonUtils.cos(unit.direction + f2) * f4);
        float cos2 = cos + (CommonUtils.cos(unit.direction + 90.0f) * (z ? -f : f));
        float sin2 = sin + (CommonUtils.sin(unit.direction + 90.0f) * (z ? -f : f));
        if (!C0955y.m456a(unit2, cos2, sin2)) {
            cos2 += 10.0f;
        }
        if (!C0955y.m456a(unit2, cos2, sin2)) {
            cos2 -= 20.0f;
        }
        if (!C0955y.m456a(unit2, cos2, sin2)) {
            cos2 -= 10.0f;
            sin2 += 10.0f;
        }
        if (!C0955y.m456a(unit2, cos2, sin2)) {
            sin2 -= 20.0f;
        }
        if (!C0955y.m456a(unit2, cos2, sin2)) {
            return false;
        }
        unit2.transportedBy = null;
        unit2.x = cos2;
        unit2.y = sin2;
        unit2.f1611bQ += 0.1f;
        unit2.direction = unit.direction + f2;
        unit2.f1518bJ = unit;
        unit2.f1519bK = 45.0f;
        if (unit2 instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit2;
            orderableUnit.m2467j(unit2.direction);
            orderableUnit.m2545ay();
            orderableUnit.m2489d(unit2.x + (CommonUtils.cos(unit2.direction + (z ? -f : f)) * f3), unit2.y + (CommonUtils.sin(unit2.direction + (z ? -f : f)) * f3));
            orderableUnit.f3685V = 0;
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0507h, com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead || !isActive()) {
            return;
        }
        if (this.f1541cc == 0.0f && this.f6366ed != 3) {
            setDrawLayer(3);
        }
        if (this.f3460g && !m3749cI() && !this.moving) {
            this.f3459f = CommonUtils.toZero(this.f3459f, f);
            if (this.f3459f == 0.0f) {
                this.f3459f = 30.0f;
                if (this.f3462h.size() == 0) {
                    this.f3460g = false;
                } else {
                    boolean z = this.f3462h.size() % 2 == 0;
                    Unit unit = (Unit) this.f3462h.remove(this.f3462h.size() - 1);
                    if (!m2832a(this, unit, z)) {
                        this.f3462h.add(unit);
                    }
                    if (this.f3462h.size() == 0) {
                        this.f3460g = false;
                    }
                }
            }
        }
        this.f3461e += 4.0f * f;
        if (this.f3461e > 360.0f) {
            this.f3461e -= 360.0f;
        }
        if (!this.f3460g) {
            this.height = CommonUtils.m1744a(this.height, 3.0f + (CommonUtils.sin(this.f3461e) * 1.5f), 0.1f * f);
        } else {
            this.height = CommonUtils.m1744a(this.height, 0.0f, 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        if (m3749cI()) {
            return 1.2f;
        }
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        if (m3749cI()) {
            return 1.8f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.1f;
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

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2822d(Unit unit, boolean z) {
        if (this.f3460g || !m2829a(this.f3462h, 4, unit) || unit == this) {
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
        m2834E(unit);
        return true;
    }

    /* renamed from: E */
    public void m2834E(Unit unit) {
        unit.transportedBy = this;
        this.f3462h.add(unit);
        GameEngine.getInstance().interfaceEngine.unselectUnit(unit);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: e */
    public void mo2820e(Unit unit) {
        if (unit.transportedBy == this) {
            this.f3462h.remove(unit);
            unit.transportedBy = null;
            return;
        }
        GameEngine.LogTrace("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return 12000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bz */
    public boolean mo2497bz() {
        return this.f3460g;
    }

    /* renamed from: L */
    public void m2833L() {
        this.f3460g = true;
        this.f3459f = 30.0f;
    }

    /* renamed from: dn */
    public void m2821dn() {
        this.f3460g = false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        if (action == f3456i) {
            m2833L();
        }
        if (action == f3457j) {
            m2821dn();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cp */
    public boolean mo2823cp() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bA */
    public int mo2526bA() {
        return this.f3462h.size();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cn */
    public C0202c mo2824cn() {
        return f3456i.m3834L();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f3458k;
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
        return this.f3462h;
    }
}