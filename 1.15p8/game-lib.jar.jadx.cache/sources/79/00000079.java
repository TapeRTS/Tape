package com.corrodinggames.rts.game.ai;

import android.graphics.PointF;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.WaypointType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p026f.C0523f;
import com.corrodinggames.rts.gameFramework.C0678e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0950u;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class Base extends Zone {

    /* renamed from: a */
    float f685a;

    /* renamed from: b */
    BaseStates state;

    /* renamed from: c */
    BaseType type;

    /* renamed from: e */
    float f688e;

    /* renamed from: f */
    float f689f;

    /* renamed from: h */
    int f690h;

    /* renamed from: k */
    float abandonedTimer;

    /* renamed from: l */
    float claimedBaseTimer;

    /* renamed from: m */
    float f693m;

    /* renamed from: n */
    boolean f694n;

    /* renamed from: o */
    boolean f695o;

    /* renamed from: s */
    boolean f696s;

    /* renamed from: t */
    boolean f697t;

    /* renamed from: u */
    float f698u;

    /* renamed from: y */
    int f699y;

    /* renamed from: z */
    UnitType f700z;

    /* renamed from: A */
    C0407b f671A;

    /* renamed from: B */
    C0407b f672B;

    /* renamed from: C */
    int f673C;

    /* renamed from: D */
    int f674D;

    /* renamed from: E */
    String f675E;

    /* renamed from: F */
    int f676F;

    /* renamed from: G */
    int f677G;

    /* renamed from: I */
    int f678I;

    /* renamed from: J */
    int Builders;

    /* renamed from: K */
    int f680K;

    /* renamed from: L */
    int f681L;

    /* renamed from: M */
    boolean f682M;

    /* renamed from: O */
    UnitType f683O;

    /* renamed from: P */
    C0407b f684P;

    /* renamed from: d */
    float allowedUnits = -1.0f;

    /* renamed from: g */
    float requestedBuildersDelay = 100.0f;

    /* renamed from: i */
    float builtBuildersDelay = 50.0f;

    /* renamed from: j */
    float defendBaseCheckDelay = 50.0f;

    /* renamed from: p */
    ObjectVector f705p = new ObjectVector();

    /* renamed from: q */
    C0950u f706q = new C0950u();

    /* renamed from: r */
    C0950u f707r = new C0950u();

    /* renamed from: v */
    float f708v = 0.0f;

    /* renamed from: w */
    PointF f709w = new PointF();

    /* renamed from: x */
    PointF f710x = new PointF();

    /* renamed from: H */
    boolean f711H = false;

    /* renamed from: N */
    ArrayList f712N = new ArrayList();

    @Override // com.corrodinggames.rts.game.ai.Zone, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeEnum(this.state);
        outputNetStream.writeEnum(this.type);
        outputNetStream.writeFloat(this.allowedUnits);
        outputNetStream.writeFloat(this.f688e);
        outputNetStream.writeFloat(this.f689f);
        outputNetStream.writeFloat(this.requestedBuildersDelay);
        outputNetStream.writeFloat(this.builtBuildersDelay);
        outputNetStream.writeFloat(this.defendBaseCheckDelay);
        outputNetStream.writeFloat(this.abandonedTimer);
        outputNetStream.writeFloat(this.claimedBaseTimer);
        outputNetStream.writeByte(4);
        outputNetStream.writeFloat(this.f708v);
        outputNetStream.writeFloat(this.f693m);
        outputNetStream.writeBoolean(this.f694n);
        outputNetStream.writeBoolean(this.f695o);
        outputNetStream.writeInt(this.f690h);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.ai.Zone
    /* renamed from: a */
    public void mo4188a(InputNetStream inputNetStream) {
        this.state = (BaseStates) inputNetStream.readEnum(BaseStates.class);
        this.type = (BaseType) inputNetStream.readEnum(BaseType.class);
        this.allowedUnits = inputNetStream.readFloat();
        this.f688e = inputNetStream.readFloat();
        this.f689f = inputNetStream.readFloat();
        this.requestedBuildersDelay = inputNetStream.readFloat();
        this.builtBuildersDelay = inputNetStream.readFloat();
        this.defendBaseCheckDelay = inputNetStream.readFloat();
        this.abandonedTimer = inputNetStream.readFloat();
        this.claimedBaseTimer = inputNetStream.readFloat();
        byte readByte = inputNetStream.readByte();
        if (readByte >= 1) {
            this.f708v = inputNetStream.readFloat();
        }
        if (readByte >= 2) {
            this.f693m = inputNetStream.readFloat();
        }
        if (readByte >= 3) {
            this.f694n = inputNetStream.readBoolean();
            this.f695o = inputNetStream.readBoolean();
        }
        if (readByte >= 4) {
            this.f690h = inputNetStream.readInt();
        }
        super.mo4188a(inputNetStream);
    }

    public Base(AI ai, float f, float f2) {
        super(ai, f, f2);
    }

    /* renamed from: a */
    public PointF m4248a() {
        MapTile tileFromObjectLayer;
        GameEngine gameEngine = GameEngine.getInstance();
        PointF pointF = null;
        int i = (int) (this.radius * gameEngine.map.f794r);
        gameEngine.map.m4168a(this.x, this.y);
        int i2 = gameEngine.map.returnX;
        int i3 = gameEngine.map.returnY;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (gameEngine.map.isInMap(i4, i5) && (tileFromObjectLayer = gameEngine.map.getTileFromObjectLayer(i4, i5)) != null && tileFromObjectLayer.nresPool) {
                    Unit m2976b = Building.m2976b(i4, i5);
                    boolean z = false;
                    if (m2976b == null) {
                        z = true;
                    }
                    if (m2976b != null && (m2976b instanceof OrderableUnit) && !((OrderableUnit) m2976b).getUnitType().mo3073p()) {
                        z = true;
                    }
                    if (z) {
                        gameEngine.map.fromGrid(i4, i5);
                        if (pointF == null || CommonUtils.m1737a(0, 100) < 50) {
                            this.f709w.set(gameEngine.map.returnX + gameEngine.map.f792p, gameEngine.map.returnY + gameEngine.map.f793q);
                            pointF = this.f709w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m4235a(OrderableUnit orderableUnit) {
        this.f706q.remove(orderableUnit);
    }

    /* renamed from: b */
    public void m4230b() {
        this.f705p.clear();
        this.f706q.clear();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this.ai && !unit.dead && !unit.mo1773u() && m4244a(unit)) {
                this.f706q.m481a(unit);
                UnitType unitType = unit.unitType;
                if (!this.f705p.contains(unitType)) {
                    this.f705p.add(unitType);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4241a(UnitType unitType) {
        if (getOrderableUnitWhichCanBuild(unitType, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4228b(UnitType unitType) {
        if ((GameEngine.getInstance().f5936at && !unitType.mo3136C()) || unitType.mo3065w()) {
            return false;
        }
        Object[] items = this.f705p.getItems();
        int size = this.f705p.size();
        for (int i = 0; i < size; i++) {
            UnitType unitType2 = (UnitType) items[i];
            Unit[] m485a = this.f706q.m485a();
            int i2 = 0;
            int size2 = this.f706q.size();
            while (true) {
                if (i2 < size2) {
                    Unit unit = m485a[i2];
                    if (unit.getUnitType() != unitType2 || !(unit instanceof OrderableUnit)) {
                        i2++;
                    } else if (((OrderableUnit) unit).m2533b(unitType, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public UnitType m4227c() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.ai.f557aV) {
            return null;
        }
        int m4246a = m4246a(this.ai.f603bz);
        UnitType unitType = null;
        float f = -1.0f;
        Iterator it = com.corrodinggames.rts.game.units.UnitType.f1702ae.iterator();
        while (it.hasNext()) {
            UnitType unitType2 = (UnitType) it.next();
            if (unitType2.mo3085j() && m4228b(unitType2)) {
                int m4359a = this.ai.m4359a(unitType2, EnumC0151b.f625a);
                int m4225c = m4225c(unitType2);
                boolean z = false;
                if (unitType2 instanceof CustomUnitMetadata) {
                    z = true;
                    CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) unitType2;
                    if (customUnitMetadata.f3086fA.size() != 0) {
                        Iterator it2 = customUnitMetadata.f3086fA.iterator();
                        while (it2.hasNext()) {
                            UnitType unitType3 = (UnitType) it2.next();
                            m4359a += this.ai.m4359a(unitType3, EnumC0151b.f625a);
                            m4225c += m4225c(unitType3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (unitType2.mo3073p() && !z) {
                    int i = m4225c;
                    if (m4248a() != null && CommonUtils.m1737a(0, 100) < 90) {
                        if (i == 0) {
                            if (this.ai.credits < 5000.0d) {
                                f2 = 0.98f;
                            } else {
                                f2 = 0.58f;
                            }
                        }
                        if (i == 1) {
                            f2 = 0.55f;
                        }
                        if (i == 2) {
                            f2 = 0.4f;
                        }
                        if (i >= 3) {
                            f2 = 0.25f / i;
                        }
                        if (m4359a >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.landFactory && (m4359a < 5 || m4246a == 0)) {
                    if (m4359a == 0) {
                        f2 = 0.8f;
                    } else if (m4225c < 2) {
                        f2 = 0.46f / (m4359a + (m4225c * 2));
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.seaFactory && this.ai.m4351aa() && (m4359a < 5 || m4246a == 0)) {
                    if (m4359a == 0) {
                        f2 = 0.3f;
                    } else if (m4225c < 1) {
                        f2 = 0.1f / (m4359a + (m4225c * 2));
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.airFactory && (m4359a < 5 || m4246a == 0)) {
                    if (m4359a == 0) {
                        f2 = 0.48f;
                    } else if (m4225c < 2) {
                        f2 = 0.29f / (m4359a + m4225c);
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.turret) {
                    if (m4225c == 0) {
                        f2 = 0.47f;
                    } else if (m4225c < 3) {
                        f2 = 0.35f / m4225c;
                    } else if (m4225c < 4) {
                        f2 = 0.025f / m4225c;
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.laserDefence && m4225c == 0) {
                    f2 = 0.018f;
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.repairbay && m4225c == 0) {
                    f2 = 0.02f;
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.antiAirTurret) {
                    if (m4225c == 0) {
                        f2 = 0.42f;
                    } else if (this.ai.m4381V()) {
                        if (m4225c < 4) {
                            f2 = 0.3f / m4225c;
                        }
                    } else if (m4225c < 3) {
                        f2 = 0.3f / m4225c;
                    } else if (m4225c < 4) {
                        f2 = 0.02f / m4225c;
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.fabricator && this.ai.credits > 2000.0d && m4225c < 5) {
                    if (m4359a == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * m4359a) + m4225c);
                    }
                }
                if (unitType2 == com.corrodinggames.rts.game.units.UnitType.AntiNukeLaucher && ((!gameEngine.m919K() || !gameEngine.networkEngine.setup.noNukes) && this.ai.credits > 2200.0d && m4359a < 4)) {
                    if (m4359a == 0) {
                        f2 = 0.06f;
                    } else if (m4225c < 1) {
                        f2 = 0.05f / (m4359a + (m4225c * 2));
                    }
                }
                if (z) {
                    CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) unitType2;
                    if (!customUnitMetadata2.f2981fl && ((m4359a < customUnitMetadata2.f2982fm || customUnitMetadata2.f2982fm == -1) && (m4225c < customUnitMetadata2.f2983fn || customUnitMetadata2.f2983fn == -1))) {
                        f2 = customUnitMetadata2.f2984fo;
                        if (m4225c < customUnitMetadata2.f2985fp) {
                            f2 = customUnitMetadata2.f2986fq;
                        }
                        if (m4225c == 0) {
                            f2 += customUnitMetadata2.f2987fr;
                        }
                        if (m4359a == 0) {
                            f2 += customUnitMetadata2.f2988fs;
                        }
                        if (unitType2.mo3073p() && m4248a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.ai.m4380W() && unitType2 == com.corrodinggames.rts.game.units.UnitType.experimentalLandFactory && this.ai.credits > 15000.0d) {
                    if (m4359a == 0) {
                        f2 = 0.04f;
                    }
                    if (this.ai.credits > 55000.0d && m4359a == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || CommonUtils.rnd(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    unitType = unitType2;
                }
            }
        }
        this.f689f = f;
        return unitType;
    }

    /* renamed from: a */
    public int m4246a(AbstractC0153d abstractC0153d) {
        int i = 0;
        Iterator it = abstractC0153d.unitMix.iterator();
        while (it.hasNext()) {
            i += m4225c(((C0154e) it.next()).f635a);
        }
        return i;
    }

    /* renamed from: c */
    public int m4225c(UnitType unitType) {
        int i = 0;
        C0950u c0950u = this.f706q;
        Unit[] m485a = c0950u.m485a();
        int size = c0950u.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == this.ai && unit.unitType == unitType && m4244a(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m4224d() {
        int i = 0;
        C0950u c0950u = this.f706q;
        Unit[] m485a = c0950u.m485a();
        int size = c0950u.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == this.ai && (unit instanceof OrderableUnit)) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (m4232a(orderableUnit, false) && !orderableUnit.f1603bE && orderableUnit.f3702au == null && this.ai.m4322h(orderableUnit) && this.ai.m4320i(orderableUnit)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4221e() {
        return this.f680K;
    }

    /* renamed from: f */
    public boolean m4220f() {
        return m4216h() != 0;
    }

    /* renamed from: g */
    public Unit m4218g() {
        float f = this.radius + 120.0f;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.x + f > this.x && unit.x - f < this.x && unit.y + f > this.y && unit.y - f < this.y && unit.team != this.ai && m4189a(unit, 120.0f) && unit.team.m3925c(this.ai) && this.ai.m4318j(unit)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m4216h() {
        return m4247a(60.0f);
    }

    /* renamed from: a */
    public int m4247a(float f) {
        int i = 0;
        float f2 = this.radius + f;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.x + f2 > this.x && unit.x - f2 < this.x && unit.y + f2 > this.y && unit.y - f2 < this.y && unit.team != this.ai && m4189a(unit, f) && unit.team.m3925c(this.ai) && unit.canAttack() && this.ai.m4318j(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m4215i() {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m4218g = m4218g();
        if (m4218g != null) {
            C0678e m2261a = gameEngine.f5867cf.m2261a(this.ai);
            Unit[] m485a = Unit.fastUnitList.m485a();
            int size = Unit.fastUnitList.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m485a[i];
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) unit;
                    if (unit.team == this.ai && this.ai.m4332b(unit, m4218g) && this.ai.m4320i(orderableUnit) && orderableUnit.m2554ap()) {
                        if (!unit.f1603bE) {
                            if (AI.m4364a(unit, this.x, this.y, 800.0f)) {
                                m2261a.m2092a(orderableUnit);
                            }
                        } else if (AI.m4364a(unit, this.x, this.y, 540.0f)) {
                            m2261a.m2092a(orderableUnit);
                        }
                    }
                }
            }
            m2261a.m2094a(m4218g);
        }
    }

    /* renamed from: a */
    public boolean m4244a(Unit unit) {
        return m4242a(unit, false);
    }

    /* renamed from: a */
    public boolean m4242a(Unit unit, boolean z) {
        if ((unit instanceof OrderableUnit) && ((OrderableUnit) unit).f3703av == this) {
            if (!z || m4187b(unit)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4232a(OrderableUnit orderableUnit, boolean z) {
        if (orderableUnit.f3703av == this) {
            if (!z || m4187b(orderableUnit)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public int m4214j() {
        int i = 0;
        Iterator it = m4213k().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (this.ai != unit.team && unit.team.m3925c(this.ai) && (unit instanceof OrderableUnit) && m4187b(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public C0523f m4213k() {
        return GameEngine.getInstance().UnitGeoIndex.m2778b(this.x, this.y, this.radius);
    }

    /* renamed from: x */
    private OrderableUnit m4202x() {
        return m4240a((UnitType) null, (PointF) null, true);
    }

    /* renamed from: y */
    private OrderableUnit m4201y() {
        return m4219f(null);
    }

    /* renamed from: f */
    private OrderableUnit m4219f(UnitType unitType) {
        return m4240a(unitType, (PointF) null, false);
    }

    /* renamed from: a */
    private OrderableUnit m4240a(UnitType unitType, PointF pointF, boolean z) {
        if (this.f680K == 0) {
            return null;
        }
        this.f699y = 0;
        float f = Float.MAX_VALUE;
        OrderableUnit orderableUnit = null;
        GameEngine gameEngine = GameEngine.getInstance();
        if (unitType != null && ((gameEngine.f5936at && !unitType.mo3136C()) || unitType.mo3065w())) {
            return null;
        }
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this.ai && m4244a(unit) && unit.transportedBy == null && unit.mo2561ai() && (unit instanceof OrderableUnit) && this.ai.m4320i(unit)) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                if (C0155f.m4282a(orderableUnit2) && (!z || orderableUnit2.mo2657I())) {
                    this.f699y++;
                    if (unitType == null || orderableUnit2.m2533b(unitType, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = CommonUtils.distanceSq(pointF.x, pointF.y, unit.x, unit.y);
                        }
                        if (orderableUnit == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (CommonUtils.rnd(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            orderableUnit = (OrderableUnit) unit;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return orderableUnit;
    }

    /* renamed from: a */
    private OrderableUnit m4243a(Unit unit, PointF pointF, boolean z) {
        if (this.f681L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        OrderableUnit orderableUnit = null;
        GameEngine.getInstance();
        Unit[] m485a = this.f706q.m485a();
        int size = this.f706q.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m485a[i];
            if (unit2.team == this.ai && m4244a(unit2) && unit2.transportedBy == null) {
                UnitType unitType = unit2.getUnitType();
                if (unitType.mo3077n() && (unit2 instanceof OrderableUnit) && this.ai.m4320i(unit2)) {
                    OrderableUnit orderableUnit2 = (OrderableUnit) unit2;
                    if (C0155f.m4279b(orderableUnit2) && ((!z || orderableUnit2.mo2657I()) && (unit == null || orderableUnit2.mo3232D(unit)))) {
                        boolean z2 = false;
                        if (unitType instanceof CustomUnitMetadata) {
                            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) unitType;
                            if (customUnitMetadata.f2992fw != null && !m4236a(customUnitMetadata.f2992fw)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = CommonUtils.distanceSq(pointF.x, pointF.y, unit2.x, unit2.y);
                        }
                        if (orderableUnit == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (CommonUtils.rnd(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            orderableUnit = (OrderableUnit) unit2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return orderableUnit;
    }

    /* renamed from: g */
    private boolean m4217g(UnitType unitType) {
        PointF pointF;
        OrderableUnit m4240a;
        this.f700z = unitType;
        this.f671A = null;
        this.f672B = null;
        GameEngine gameEngine = GameEngine.getInstance();
        if (unitType.mo3073p()) {
            pointF = m4248a();
        } else {
            pointF = m4183e(unitType);
        }
        if (pointF == null || (m4240a = m4240a(unitType, pointF, false)) == null) {
            return false;
        }
        if (unitType == com.corrodinggames.rts.game.units.UnitType.seaFactory) {
            int m437c = C0955y.m437c(pointF.x, pointF.y, MovementType.f1647e);
            this.ai.getClass();
            if (m437c < 3000) {
                return false;
            }
        }
        int i = 1;
        Action m2613a = m4240a.m2613a(unitType, true);
        if (m2613a != null) {
            i = m2613a.mo3816q();
        } else {
            GameEngine.log("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + unitType.mo3087i());
        }
        if (!m2613a.isAvailable(m4240a) || !m2613a.isActive((Unit) m4240a, false)) {
            if (!this.ai.m4357a(m2613a.mo3586z(), m4240a)) {
                this.f671A = m2613a.mo3586z();
                this.f672B = this.f671A.m3366i(m4240a);
                return true;
            }
            return true;
        } else if (m2613a.mo3587y()) {
            C0678e m2261a = gameEngine.f5867cf.m2261a(this.ai);
            m2261a.m2092a(m4240a);
            m2261a.m2096a(m2613a.m3834L(), pointF, (Unit) null);
            return true;
        } else {
            C0678e m2261a2 = gameEngine.f5867cf.m2261a(this.ai);
            m2261a2.m2092a(m4240a);
            m2261a2.m2101a(pointF.x, pointF.y, unitType, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m4200z() {
        Unit[] m485a = Unit.fastUnitList.m485a();
        C0950u unit = Unit.fastUnitList;
        int size = unit.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m485a[i];
            if (unit2.team == this.ai && m4244a(unit2) && unit2.isActive() && !unit2.mo1773u() && (unit2 instanceof OrderableUnit) && ((OrderableUnit) unit2).m2562ah()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4236a(ValueList unit) {
        ValueList mo3167da;
        Unit[] m485a = this.f706q.m485a();
        int size = this.f706q.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m485a[i];
            if (unit2.team == this.ai && unit2.isActive() && (mo3167da = unit2.mo3167da()) != null && ValueListSource.m3248a(unit, mo3167da)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private OrderableUnit getOrderableUnitWhichCanBuild(UnitType unitType, boolean z, boolean action) {
        Unit[] m485a = this.f706q.m485a();
        int size = this.f706q.size();
        for (int type = 0; type < size; type++) {
            Unit unit = m485a[type];
            if (unit.team == this.ai && unit.isActive() && this.ai.m4320i(unit) && (unit instanceof AbstractC0483l) && (unit instanceof OrderableUnit)) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                AbstractC0483l abstractC0483l = (AbstractC0483l) unit;
                Action specialActionFor = unit.getSpecialActionFor(unitType);
                if (specialActionFor != null && ((abstractC0483l.mo2910dt() || !z) && !specialActionFor.mo3597m(unit) && specialActionFor.isAvailable(orderableUnit) && specialActionFor.isActive((Unit) orderableUnit, false) && ((!(unit instanceof CommandCenter) || unitType.mo3079m() || m4204u() <= 2 || this.f696s || !z) && (!action || orderableUnit.f3704aw)))) {
                    return orderableUnit;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m4245a(AbstractC0153d abstractC0153d, boolean z) {
        Iterator it = abstractC0153d.m4292a().iterator();
        while (it.hasNext()) {
            if (m4239a(((C0154e) it.next()).f635a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4239a(UnitType unitType, boolean z) {
        return buildUnit(unitType, z, 1);
    }

    /* renamed from: a */
    private boolean buildUnit(UnitType unitType, boolean z, int type) {
        if (type < 1) {
            GameEngine.log("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        OrderableUnit orderableUnitWhichCanBuild = getOrderableUnitWhichCanBuild(unitType, true, z);
        if (orderableUnitWhichCanBuild == null) {
        }
        if (orderableUnitWhichCanBuild == null) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Action e = orderableUnitWhichCanBuild.getSpecialActionFor(unitType);
        if (e == null) {
            GameEngine.log("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.isAvailable(orderableUnitWhichCanBuild)) {
            GameEngine.log("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.isActive((Unit) orderableUnitWhichCanBuild, false)) {
            GameEngine.log("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.mo3603g(orderableUnitWhichCanBuild)) {
            return false;
        } else {
            if (e.mo3817k_() && gameEngine.f5936at) {
                return false;
            }
            for (int i = 0; i < type; i++) {
                C0678e m2261a = gameEngine.f5867cf.m2261a(this.ai);
                m2261a.m2092a(orderableUnitWhichCanBuild);
                m2261a.m2097a(e.mo3819x());
            }
            return true;
        }
    }

    /* renamed from: l */
    Base getClosestBaseToBase() {
        Base base;
        float f = -1.0f;
        Base base2 = null;
        Iterator it = this.ai.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if ((zone instanceof Base) && (base = (Base) zone) != this && base.m4221e() > 1) {
                float a = base.m4190a(this);
                if (base2 == null || a < f) {
                    f = a;
                    base2 = base;
                }
            }
        }
        return base2;
    }

    /* renamed from: m */
    public void m4211m() {
        OrderableUnit m4202x;
        GameEngine gameEngine = GameEngine.getInstance();
        Base closestBaseToBase = getClosestBaseToBase();
        if (closestBaseToBase != null && closestBaseToBase.m4221e() > 1 && (m4202x = closestBaseToBase.m4202x()) != null) {
            PointF w = getRandomPoint();
            if (C0955y.m456a(m4202x, w.x, w.y)) {
                boolean m4365a = this.ai.m4365a(m4202x, w.x, w.y);
                if (m4365a || this.ai.f539aD != 0) {
                    C0678e m2261a = gameEngine.f5867cf.m2261a(this.ai);
                    m2261a.m2092a(m4202x);
                    m2261a.m2102a(w.x, w.y);
                    this.f690h++;
                    this.requestedBuildersDelay = CommonUtils.m1737a(1800, 2500);
                    if (this.f690h >= 2) {
                        this.requestedBuildersDelay += 11000.0f;
                    }
                    closestBaseToBase.f680K--;
                    if (!m4365a) {
                        boolean z = true;
                        if (m4202x.f3702au != null) {
                            if (!m4202x.f3702au.mo4259a()) {
                                m4202x.f3702au.m4255b(m4202x);
                            } else {
                                z = false;
                                if (!m4202x.f3702au.f670G.contains(m4202x)) {
                                    m4202x.f3702au.f670G.add(m4202x);
                                }
                            }
                        }
                        if (z) {
                            C0161l c0161l = new C0161l(this.ai);
                            c0161l.m4198c(m4202x);
                            c0161l.x = w.x;
                            c0161l.y = w.y;
                        }
                        this.requestedBuildersDelay = CommonUtils.m1737a(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private Unit m4249A() {
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this.ai && m4242a(unit, true) && unit.mo2975bH() && (unit.hp < unit.maxHp - 1.0f || unit.built < 1.0f)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m4210n() {
        GameEngine.getInstance();
        if (this.f707r.size() == 0 || this.f696s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            UnitType m4285c = this.ai.f601bx.m4285c();
            if (m4285c != null && m4241a(m4285c) && m4222d(m4285c)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4222d(com.corrodinggames.rts.game.units.UnitType r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.ai.Base.m4222d(com.corrodinggames.rts.game.units.am):boolean");
    }

    /* renamed from: o */
    public void m4209o() {
        Unit m4207r;
        int unit = this.f707r.size();
        if (unit != 0 && (m4207r = m4207r()) != null) {
            this.f710x.set(m4207r.x, m4207r.y);
            OrderableUnit m4243a = m4243a(m4207r, this.f710x, true);
            if (m4243a != null) {
                m4234a(m4243a, m4207r);
            }
        }
    }

    /* renamed from: q */
    public void m4208q() {
        OrderableUnit orderableUnit;
        Waypoint activeWaypoint;
        Unit m3670i;
        if (this.f707r.size() != 0 && this.f672B != null) {
            Unit[] m485a = this.f706q.m485a();
            int size = this.f706q.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m485a[i];
                if (unit.team == this.ai && m4244a(unit) && unit.transportedBy == null && unit.getUnitType().mo3077n() && (unit instanceof OrderableUnit) && this.ai.m4320i(unit) && CommonUtils.rnd(0.0f, 1.0f) <= 0.3d && (activeWaypoint = (orderableUnit = (OrderableUnit) unit).getActiveWaypoint()) != null && activeWaypoint.getType() == WaypointType.f1757g && (m3670i = activeWaypoint.m3670i()) != null && m3670i.mo2862g() > 0.0f && !this.f672B.m3375c(m3670i.m3748cK())) {
                    m4234a(orderableUnit, m4207r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public Unit m4207r() {
        Unit unit = null;
        for (int i = 0; i < 20; i++) {
            unit = this.f707r.m484a(CommonUtils.m1737a(0, this.f707r.size() - 1));
            if (unit == null || this.f672B == null || this.f672B.m3375c(unit.m3748cK())) {
                break;
            }
        }
        return unit;
    }

    /* renamed from: a */
    public void m4234a(OrderableUnit orderableUnit, Unit unit) {
        GameEngine game = GameEngine.getInstance();
        if (orderableUnit.mo2728C(unit)) {
            C0678e m2261a = game.f5867cf.m2261a(this.ai);
            m2261a.m2092a(orderableUnit);
            m2261a.m2081d(unit);
        }
    }

    /* renamed from: s */
    public void m4206s() {
        GameEngine game = GameEngine.getInstance();
        Unit m4249A = m4249A();
        if (m4249A != null) {
            this.f710x.set(m4249A.x, m4249A.y);
            OrderableUnit m4240a = m4240a((UnitType) null, this.f710x, true);
            if (m4240a != null && m4240a.mo2621a(m4249A) && m4249A.m3733e(m4240a) < 2) {
                C0678e m2261a = game.f5867cf.m2261a(this.ai);
                m2261a.m2092a(m4240a);
                m2261a.m2086b(m4249A);
            }
        }
    }

    /* renamed from: b */
    public void m4229b(float f) {
        m4226c(f);
        int i = this.Builders;
        int i2 = this.f678I;
        m4230b();
        this.f694n = m4200z();
        if (this.f694n) {
            this.f695o = true;
        }
        if (i >= 1) {
            m4206s();
        }
        if (this.f682M && this.f678I > 0) {
            m4210n();
            m4208q();
            m4209o();
        }
        if (i < 2 && this.builtBuildersDelay == 0.0f) {
            this.builtBuildersDelay = 300.0f;
            int m4369a = this.ai.m4369a(this.ai.f600bw, EnumC0151b.f625a);
            if (!this.f696s || m4369a <= 2) {
                boolean z = CommonUtils.m1737a(0, 100) < 5;
                if (!z && m4245a(this.ai.f600bw, true)) {
                    this.f711H = false;
                    this.builtBuildersDelay = 900.0f;
                } else {
                    if (!z) {
                        this.f711H = true;
                    }
                    if (!this.f696s && this.f708v == 0.0f && i < 1 && this.requestedBuildersDelay == 0.0f) {
                        m4211m();
                    }
                }
            }
        }
        int m4214j = m4214j();
        if (i == 0 && i2 == 0) {
            this.abandonedTimer += f;
            if (m4214j > 2) {
                this.abandonedTimer += 2.0f * f;
            }
            if (m4214j > 5) {
                this.abandonedTimer += 4.0f * f;
            }
        } else {
            this.abandonedTimer = CommonUtils.toZero(this.abandonedTimer, f);
        }
        if (this.abandonedTimer > 11000.0f) {
            mo4182p();
        }
        if (this.state == BaseStates.f713a && ((i != 0 && i2 != 0) || (i2 > 5 && m4214j == 0))) {
            this.claimedBaseTimer += f;
            if (this.claimedBaseTimer > 2000.0f) {
                this.state = BaseStates.f715c;
            }
        }
        m4205t();
    }

    /* renamed from: t */
    public void m4205t() {
        if (this.state == null) {
            GameEngine.PrintLOG_err("fixOverlaps: this.state==null");
            GameEngine.PrintLOG_err("id:" + this.id);
            GameEngine.PrintLOG_err("x:" + this.x);
            GameEngine.PrintLOG_err("y:" + this.y);
            GameEngine.PrintLOG_err("radius:" + this.radius);
            if (this.ai != null) {
                GameEngine.PrintLOG_err("team:" + this.ai.teamID);
                return;
            }
            return;
        }
        Iterator it = this.ai.f587bj.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if ((zone instanceof Base) && zone != this) {
                Base base = (Base) zone;
                if (CommonUtils.distanceSq(this.x, this.y, base.x, base.y) < 400.0f) {
                    if (base.state == null) {
                        GameEngine.PrintLOG_err("fixOverlaps: targetBase.state==null");
                    } else if (base.state.m4199a() < this.state.m4199a()) {
                        base.mo4182p();
                    } else {
                        mo4182p();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m4204u() {
        return this.f678I;
    }

    /* renamed from: c */
    public void m4226c(float f) {
        this.f678I = 0;
        this.Builders = 0;
        this.f681L = 0;
        this.f680K = 0;
        this.f682M = false;
        this.f707r.clear();
        if (1 != 0) {
            Iterator it = m4213k().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.mo2862g() > 0.0f && m4187b(unit)) {
                    this.f682M = true;
                    this.f707r.m481a(unit);
                }
            }
        }
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m485a[i];
            if (unit2.team == this.ai && (unit2 instanceof OrderableUnit)) {
                OrderableUnit orderableUnit = (OrderableUnit) unit2;
                if (m4232a(orderableUnit, false) && unit2.isActive() && this.ai.m4320i(unit2) && !unit2.mo1773u()) {
                    UnitType unitType = unit2.getUnitType();
                    if (unitType.mo3085j()) {
                        this.f678I++;
                    }
                    if (unitType.mo3079m()) {
                        this.Builders++;
                        if (C0155f.m4282a(orderableUnit)) {
                            this.f680K++;
                        }
                    }
                    if (unitType.mo3077n()) {
                        this.f681L++;
                    }
                    if (unit2 instanceof AbstractC0483l) {
                        this.Builders += ((AbstractC0483l) unit2).mo2906h(com.corrodinggames.rts.game.units.UnitType.builder);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m4223d(float f) {
        UnitType m4227c;
        this.f696s = m4220f();
        this.f697t = this.f696s;
        if (this.f696s) {
            this.f708v += f;
            this.f698u = 100.0f;
        } else {
            this.f708v = 0.0f;
        }
        if (this.f708v > 6000.0f) {
            this.f696s = false;
        }
        this.f693m = CommonUtils.toZero(this.f693m, f);
        this.f688e = CommonUtils.toZero(this.f688e, f);
        this.requestedBuildersDelay = CommonUtils.toZero(this.requestedBuildersDelay, f);
        this.builtBuildersDelay = CommonUtils.toZero(this.builtBuildersDelay, f);
        this.defendBaseCheckDelay = CommonUtils.toZero(this.defendBaseCheckDelay, f);
        if (this.f696s && this.defendBaseCheckDelay == 0.0f) {
            this.defendBaseCheckDelay = 100 + (this.id % 15);
            if (!this.ai.f557aV) {
                m4215i();
            }
        }
        if (this.f688e <= 0.0f) {
            this.f688e = 270 + (this.id % 15);
            if (this.ai.m4381V()) {
                this.f688e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.id % 15);
            }
            if (this.f689f < 0.2d) {
                this.f688e += 180.0f;
            }
            if (this.f689f < 0.08d) {
                this.f688e += 180.0f;
            }
            if ((m4201y() != null) && (m4227c = m4227c()) != null && ((this.f689f > 0.8d || this.ai.canBuy(1300.0d)) && ((this.f689f > 0.4d || this.ai.canBuy(1700.0d)) && ((this.f689f > 0.2d || this.ai.canBuy(2100.0d)) && ((this.f689f > 0.1d || this.ai.canBuy(2800.0d)) && ((this.f689f > 0.05d || this.ai.canBuy(3100.0d)) && (this.f689f > 0.01d || this.ai.canBuy(4800.0d)))))))) {
                this.f673C++;
                if (!m4217g(m4227c)) {
                    this.f688e -= 120.0f;
                    this.f674D++;
                }
            }
        }
        float m4204u = m4204u() / 3.0f;
        if (m4204u < 1.0f) {
            m4204u = 1.0f;
        }
        if (this.f696s) {
            this.allowedUnits = (float) (this.allowedUnits + (f * 0.015d));
        }
        if (this.f689f < 0.6d) {
            if (this.ai.defendingCount < 2) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 7.0E-4d * m4204u));
            } else if (this.ai.canBuy(1200.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 1.0E-4d * m4204u));
            }
            if (this.ai.canBuy(1600.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
            }
            if (this.ai.canBuy(2200.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
            }
            if (this.ai.canBuy(2600.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
            }
            if (this.ai.canBuy(8000.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.005d));
            }
            if (this.ai.canBuy(9000.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.01d));
            }
            if (this.ai.canBuy(10100.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.01d));
            }
            if (this.ai.canBuy(30000.0d)) {
                this.allowedUnits = (float) (this.allowedUnits + (f * 0.05d));
            }
        }
        if (this.ai.canBuy(5000.0d)) {
            this.allowedUnits = (float) (this.allowedUnits + (f * 0.001d));
        }
        if (!this.ai.canBuy(800.0d) && !this.f696s && this.allowedUnits > 1.2f) {
            this.allowedUnits = 1.2f;
        }
        if (this.allowedUnits > 3.5f) {
            this.allowedUnits = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m4203v();
            if (this.allowedUnits < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m4231a(ArrayList arrayList, AbstractC0153d abstractC0153d, MovementType movementType, int i) {
        this.f712N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            UnitType m4291a = abstractC0153d.m4291a(movementType);
            if (m4291a != null && !this.f712N.contains(m4291a)) {
                this.f712N.add(m4291a);
            }
        }
        arrayList.addAll(this.f712N);
    }

    /* renamed from: v */
    public void m4203v() {
        MovementType movementType;
        Unit m4218g;
        int m4224d = m4224d();
        int i = 12;
        int i2 = 50;
        if (this.ai.m4381V()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.ai.canBuy(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean m4350ab = this.ai.m4350ab();
        boolean m4349ac = this.ai.m4349ac();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.ai.f582be) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.ai.f583bf) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float rnd = CommonUtils.rnd(0.0f, 1.0f);
        if (rnd < f) {
            movementType = MovementType.f1644b;
        } else if (rnd < f + f2) {
            movementType = MovementType.f1648f;
        } else {
            movementType = MovementType.f1646d;
        }
        if ((this.ai.canBuy(1300.0d) && this.allowedUnits >= 1.0f) || (this.ai.canBuy(300.0d) && this.allowedUnits >= 3.0f)) {
            if (this.ai.m4351aa() && this.ai.f561aZ < i && CommonUtils.realRand(100) < 35) {
                m4231a(arrayList, this.ai.f595br, null, 2);
                if (a) {
                }
            }
            if (m4224d < 3 && this.ai.attackingCount < i2) {
                if (movementType == MovementType.f1644b) {
                    m4231a(arrayList, this.ai.f592bo, null, 4);
                    if (a) {
                    }
                } else if (movementType == MovementType.f1648f) {
                    m4231a(arrayList, this.ai.f593bp, null, 4);
                    if (a) {
                    }
                } else {
                    m4231a(arrayList, this.ai.f594bq, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.allowedUnits >= 1.0f && m4350ab && this.f693m == 0.0f) {
                int m4369a = this.ai.m4369a(this.ai.f598bu, EnumC0151b.f625a);
                int m4369a2 = m4369a + this.ai.m4369a(this.ai.f599bv, EnumC0151b.f625a);
                int m4344ah = this.ai.m4344ah();
                if ((this.ai.canBuy(1700.0d) || m4344ah > 10 || (this.ai.f586bi == 0 && m4344ah >= 1 && m4369a == 0)) && (m4369a2 < 3 || (m4344ah > 20 && m4369a2 < 5))) {
                    if (m4349ac && m4369a2 < 2) {
                        m4231a(arrayList, this.ai.f597bt, null, 2);
                    } else {
                        m4231a(arrayList, this.ai.f597bt, MovementType.f1646d, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f676F++;
        }
        while (arrayList.size() != 0) {
            UnitType unitType = (UnitType) arrayList.remove(arrayList.size() - 1);
            Unit m3768b = Unit.m3768b(unitType);
            boolean z = true;
            if (this.f696s && CommonUtils.realRand(100) < 10 && (m4218g = m4218g()) != null && !this.ai.m4332b(m3768b, m4218g)) {
                this.f676F++;
                z = false;
            }
            if (z) {
                if (m4239a(unitType, false)) {
                    this.f676F++;
                    this.ai.f573bB.m4297a(unitType);
                    this.allowedUnits -= 1.0f;
                    if (this.ai.m4323g(m3768b)) {
                        this.f693m = 1000.0f;
                        this.ai.f586bi++;
                        return;
                    }
                    return;
                }
                this.f677G++;
            }
        }
    }

    /* renamed from: a */
    public void m4233a(OrderableUnit orderableUnit, C0407b c0407b, boolean z) {
        this.f683O = orderableUnit.getUnitType();
        if (z) {
            this.f684P = null;
            this.f672B = null;
            return;
        }
        this.f684P = c0407b;
        this.f672B = c0407b.m3366i(orderableUnit);
    }
}