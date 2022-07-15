package com.corrodinggames.rts.game.ai;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.p010a.AbstractC0144a;
import com.corrodinggames.rts.game.ai.p010a.EnumC0146b;
import com.corrodinggames.rts.game.units.AttackMode;
import com.corrodinggames.rts.game.units.C0236ak;
import com.corrodinggames.rts.game.units.EnumC0295b;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.WaypointType;
import com.corrodinggames.rts.game.units.ZoneMarkerOrDamagingBorder;
import com.corrodinggames.rts.game.units.air.AmphibiousJet;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.buildings.AirFactory;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.LandFactory;
import com.corrodinggames.rts.game.units.buildings.SeaFactory;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.game.units.water.AttackSubmarine;
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
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a.class */
public final class AI extends Team {

    /* renamed from: ap */
    public static boolean f535ap;

    /* renamed from: aq */
    final int f562aq = 3000;

    /* renamed from: ar */
    int f563ar;

    /* renamed from: as */
    int f564as;

    /* renamed from: at */
    int f565at;

    /* renamed from: au */
    int f566au;

    /* renamed from: av */
    int f567av;

    /* renamed from: aw */
    int f568aw;

    /* renamed from: ax */
    int f569ax;

    /* renamed from: ay */
    int f570ay;

    /* renamed from: az */
    int f571az;

    /* renamed from: aA */
    int f536aA;

    /* renamed from: aB */
    int f537aB;

    /* renamed from: aC */
    int f538aC;

    /* renamed from: aD */
    int f539aD;

    /* renamed from: aE */
    int f540aE;

    /* renamed from: aF */
    public int f541aF;

    /* renamed from: aG */
    int f542aG;

    /* renamed from: aH */
    boolean f543aH;

    /* renamed from: aI */
    float f544aI;

    /* renamed from: aJ */
    float f545aJ;

    /* renamed from: aK */
    float f546aK;

    /* renamed from: aL */
    float f547aL;

    /* renamed from: aM */
    float f548aM;

    /* renamed from: aN */
    float f549aN;

    /* renamed from: aO */
    float f550aO;

    /* renamed from: aP */
    float f551aP;

    /* renamed from: aQ */
    float f552aQ;

    /* renamed from: aR */
    float f553aR;

    /* renamed from: aS */
    int f554aS;

    /* renamed from: aT */
    float doAttackDelay;

    /* renamed from: aU */
    public boolean f556aU;

    /* renamed from: aV */
    public boolean f557aV;

    /* renamed from: aW */
    public boolean f558aW;

    /* renamed from: aX */
    int attackingCount;

    /* renamed from: aY */
    int defendingCount;

    /* renamed from: aZ */
    int f561aZ;

    /* renamed from: ba */
    boolean firstRun;

    /* renamed from: bb */
    boolean f579bb;

    /* renamed from: bc */
    boolean f580bc;

    /* renamed from: bd */
    ZoneMarkerOrDamagingBorder f581bd;

    /* renamed from: be */
    boolean f582be;

    /* renamed from: bf */
    boolean f583bf;

    /* renamed from: bg */
    boolean f584bg;

    /* renamed from: bh */
    boolean f585bh;

    /* renamed from: bi */
    int f586bi;

    /* renamed from: bj */
    ConcurrentLinkedQueue f587bj;

    /* renamed from: bk */
    ArrayList f588bk;

    /* renamed from: bl */
    PointF _returnPoint;

    /* renamed from: bm */
    Paint f590bm;

    /* renamed from: bn */
    ArrayList f591bn;

    /* renamed from: bo */
    AbstractC0153d f592bo;

    /* renamed from: bp */
    AbstractC0153d f593bp;

    /* renamed from: bq */
    AbstractC0153d f594bq;

    /* renamed from: br */
    AbstractC0153d f595br;

    /* renamed from: bs */
    AbstractC0153d f596bs;

    /* renamed from: bt */
    AbstractC0153d f597bt;

    /* renamed from: bu */
    AbstractC0153d f598bu;

    /* renamed from: bv */
    AbstractC0153d f599bv;

    /* renamed from: bw */
    AbstractC0153d f600bw;

    /* renamed from: bx */
    AbstractC0153d f601bx;

    /* renamed from: by */
    AbstractC0153d f602by;

    /* renamed from: bz */
    AbstractC0153d f603bz;

    /* renamed from: bA */
    AbstractC0153d f572bA;

    /* renamed from: bB */
    public C0152c f573bB;

    /* renamed from: bC */
    int f574bC;

    /* renamed from: bD */
    public float f575bD;

    /* renamed from: bE */
    ArrayList f576bE;

    /* renamed from: bH */
    private static ArrayList f604bH = new ArrayList();

    /* renamed from: bF */
    public static final C0950u f605bF = new C0950u();

    /* renamed from: bG */
    public final ObjectVector zones;

    /* renamed from: V */
    public boolean m4381V() {
        return m4377Z() == 3 || m4377Z() > 300;
    }

    /* renamed from: W */
    public boolean m4380W() {
        return m4377Z() >= 2;
    }

    /* renamed from: X */
    public boolean m4379X() {
        return (1 & this.f542aG) == 1;
    }

    /* renamed from: Y */
    public boolean m4378Y() {
        return m4379X();
    }

    /* renamed from: Z */
    public int m4377Z() {
        return this.f574bC;
    }

    /* renamed from: aa */
    public boolean m4351aa() {
        if (GameEngine.getInstance().PathEngine.f5557A.f5509i > 3000) {
            return true;
        }
        return false;
    }

    /* renamed from: ab */
    public boolean m4350ab() {
        if (m4351aa() || !this.f582be || !this.f583bf || !this.f584bg || !this.f585bh) {
            return true;
        }
        return false;
    }

    /* renamed from: ac */
    public boolean m4349ac() {
        if (this.f585bh && m4350ab() && this.f583bf) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4374a(float f, float f2, Zone zone, MovementType movementType) {
        if (m4375a(f, f2, zone.x, zone.y, movementType)) {
            return true;
        }
        float f3 = -180.0f;
        while (true) {
            float f4 = f3;
            if (f4 < 180.0f) {
                if (!m4375a(f, f2, zone.x + (CommonUtils.cos(f4) * zone.radius * 0.4f), zone.y + (CommonUtils.sin(f4) * zone.radius * 0.4f), movementType)) {
                    f3 = f4 + 90.0f;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public boolean m4375a(float f, float f2, float f3, float f4, MovementType movementType) {
        if (movementType == MovementType.f1646d || movementType == MovementType.f1643a) {
            return true;
        }
        short m442b = C0955y.m442b(f, f2, movementType);
        short m442b2 = C0955y.m442b(f3, f4, movementType);
        if (m442b == -3 || m442b2 == -3) {
            String str = "null";
            if (movementType != null) {
                str = movementType.name();
            }
            aiDebug("pathPossible: no isolatedGroups found! (" + str + ")");
            GameEngine.m914P();
        }
        if (m442b != -1 && m442b2 != -1 && m442b != -2 && m442b2 != -2 && m442b == m442b2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4365a(Unit unit, float f, float f2) {
        return m4375a(unit.x, unit.y, f, f2, unit.getMovementType());
    }

    /* renamed from: b */
    public boolean m4333b(Unit unit, float f, float f2) {
        MovementType movementType = unit.getMovementType();
        return m4375a(unit.x, unit.y, f, f2, movementType) || m4375a(unit.x, unit.y, f + 60.0f, f2, movementType) || m4375a(unit.x, unit.y, f - 60.0f, f2, movementType) || m4375a(unit.x, unit.y, f, f2 + 60.0f, movementType) || m4375a(unit.x, unit.y, f, f2 - 60.0f, movementType);
    }

    /* renamed from: a */
    public boolean m4363a(Unit unit, Unit unit2) {
        return m4333b(unit, unit2.x, unit2.y);
    }

    @Override // com.corrodinggames.rts.game.Team, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        int i;
        outputNetStream.writeBoolean(this.f543aH);
        outputNetStream.writeFloat(this.f544aI);
        outputNetStream.writeFloat(this.f545aJ);
        outputNetStream.writeFloat(this.f546aK);
        outputNetStream.writeFloat(this.f547aL);
        outputNetStream.writeFloat(this.f552aQ);
        outputNetStream.writeInt(this.f554aS);
        outputNetStream.writeFloat(this.doAttackDelay);
        outputNetStream.writeBoolean(this.f556aU);
        outputNetStream.writeInt(this.attackingCount);
        outputNetStream.writeInt(this.f587bj.size());
        Iterator it = this.f587bj.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                i = 1;
            } else if (zone instanceof C0156g) {
                i = 2;
            } else if (zone instanceof C0163n) {
                i = 3;
            } else if (zone instanceof C0162m) {
                i = 4;
            } else if (zone instanceof C0161l) {
                i = 5;
            } else {
                throw new RuntimeException("zone not instance not supported:" + zone.getClass().getName());
            }
            outputNetStream.writeByte(i);
            outputNetStream.writeInt(zone.id);
        }
        Iterator it2 = this.f587bj.iterator();
        while (it2.hasNext()) {
            Zone zone2 = (Zone) it2.next();
            outputNetStream.writeInt(zone2.id);
            zone2.writeOut(outputNetStream);
        }
        outputNetStream.writeByte(9);
        outputNetStream.writeInt(this.f541aF);
        outputNetStream.writeBoolean(this.firstRun);
        outputNetStream.writeBoolean(this.f582be);
        outputNetStream.writeBoolean(this.f583bf);
        outputNetStream.writeBoolean(this.f584bg);
        outputNetStream.writeBoolean(this.f585bh);
        outputNetStream.writeFloat(this.f553aR);
        outputNetStream.writeInt(this.f586bi);
        outputNetStream.writeInt(this.f563ar);
        outputNetStream.writeInt(this.f564as);
        outputNetStream.writeInt(this.f565at);
        outputNetStream.writeBoolean(this.f557aV);
        outputNetStream.writeInt(this.f542aG);
        outputNetStream.mo1292e();
        outputNetStream.writeInt(this.zones.size);
        for (int i2 = 0; i2 < this.zones.size; i2++) {
            AbstractC0144a abstractC0144a = (AbstractC0144a) this.zones.get(i2);
            outputNetStream.writeEnum(abstractC0144a.mo4305a());
            abstractC0144a.mo4308a(outputNetStream);
        }
        outputNetStream.mo1292e();
        super.writeOut(outputNetStream);
    }

    /* renamed from: l */
    public Zone m4315l(int type) {
        if (type == 1) {
            return new Base(this, -1.0f, -1.0f);
        }
        if (type == 2) {
            return new C0156g(this);
        }
        if (type == 3) {
            return new C0163n(this);
        }
        if (type == 4) {
            return new C0162m(this);
        }
        if (type == 5) {
            return new C0161l(this);
        }
        if (type == 0) {
            GameEngine.log("Found zone type 0, loading PlainZone instead");
            return new C0162m(this);
        }
        throw new RuntimeException("Unknown zone type:" + type);
    }

    @Override // com.corrodinggames.rts.game.Team
    /* renamed from: c */
    public void mo3919c(InputNetStream inputNetStream) {
        Zone zone;
        this.f543aH = inputNetStream.readBoolean();
        this.f544aI = inputNetStream.readFloat();
        this.f545aJ = inputNetStream.readFloat();
        this.f546aK = inputNetStream.readFloat();
        this.f547aL = inputNetStream.readFloat();
        this.f552aQ = inputNetStream.readFloat();
        this.f554aS = inputNetStream.readInt();
        this.doAttackDelay = inputNetStream.readFloat();
        this.f556aU = inputNetStream.readBoolean();
        this.attackingCount = inputNetStream.readInt();
        int readInt = inputNetStream.readInt();
        this.f587bj.clear();
        boolean z = false;
        if (inputNetStream.m1237b() >= 20) {
            z = true;
            for (int i = 0; i < readInt; i++) {
                m4315l((int) inputNetStream.readByte()).id = inputNetStream.readInt();
            }
        }
        for (int i2 = 0; i2 < readInt; i2++) {
            if (!z) {
                zone = m4315l((int) inputNetStream.readByte());
            } else {
                zone = m4313m(inputNetStream.readInt());
            }
            zone.mo4188a(inputNetStream);
        }
        byte readByte = inputNetStream.readByte();
        if (readByte >= 1) {
            this.f541aF = inputNetStream.readInt();
        }
        this.f588bk.clear();
        this.f588bk.addAll(this.f587bj);
        if (readByte >= 2) {
            this.firstRun = inputNetStream.readBoolean();
            this.f582be = inputNetStream.readBoolean();
            this.f583bf = inputNetStream.readBoolean();
        }
        if (readByte >= 3) {
            this.f584bg = inputNetStream.readBoolean();
            this.f585bh = inputNetStream.readBoolean();
        }
        if (readByte >= 4) {
            this.f553aR = inputNetStream.readFloat();
        }
        if (readByte >= 5) {
            this.f586bi = inputNetStream.readInt();
        }
        if (readByte >= 6) {
            this.f563ar = inputNetStream.readInt();
            this.f564as = inputNetStream.readInt();
            this.f565at = inputNetStream.readInt();
        }
        if (readByte >= 7) {
            this.f557aV = inputNetStream.readBoolean();
        }
        if (readByte >= 8) {
            this.f542aG = inputNetStream.readInt();
        }
        if (readByte >= 9) {
            inputNetStream.m1241a("ai-c s");
            this.zones.clear();
            int readInt2 = inputNetStream.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                AbstractC0144a mo4310a = ((EnumC0146b) inputNetStream.readEnum(EnumC0146b.class)).mo4310a();
                mo4310a.mo4307a(inputNetStream);
                m4372a(mo4310a);
            }
            inputNetStream.m1241a("ai-c e");
        }
        super.mo3919c(inputNetStream);
        m4348ad();
    }

    /* renamed from: m */
    public Zone m4313m(int i) {
        Iterator it = this.f587bj.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone.id == i) {
                return zone;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m4368a(Zone zone) {
        if (zone == null) {
            return -1;
        }
        return zone.id;
    }

    /* renamed from: ad */
    void m4348ad() {
        this.f568aw = 0;
        this.f571az = 0;
        this.f536aA = 0;
        this.f537aB = 0;
        this.f569ax = 0;
        this.f570ay = 0;
        this.f538aC = 0;
        this.f539aD = 0;
        this.f566au = 0;
        this.f567av = 0;
        this.f540aE = 0;
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                Base base = (Base) zone;
                this.f566au++;
                if (base.m4204u() >= 2) {
                    this.f567av++;
                }
                if (base.f694n) {
                    this.f540aE++;
                }
            }
            if (zone instanceof C0156g) {
                C0156g c0156g = (C0156g) zone;
                if (!c0156g.f643a) {
                    if (c0156g.f650h) {
                        this.f568aw++;
                        if (!c0156g.f664v && !c0156g.m4269d()) {
                            if (!c0156g.f639B) {
                                this.f569ax++;
                            } else {
                                this.f570ay++;
                            }
                        }
                    } else {
                        this.f571az++;
                        if (c0156g.m4269d()) {
                            this.f536aA++;
                        }
                        this.f537aB += c0156g.m4254l();
                    }
                }
            }
            if (zone instanceof C0163n) {
                this.f538aC++;
                if (((AbstractC0157h) zone).m4254l() > 0) {
                    this.f539aD++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4361a(UnitType unitType) {
        Unit m3768b = Unit.m3768b(unitType);
        if (!m3768b.mo2975bH() && (m3768b instanceof OrderableUnit) && !m4323g(m3768b) && !m3768b.mo2561ai() && ((OrderableUnit) m3768b).canAttack()) {
            if (unitType instanceof CustomUnitMetadata) {
                CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) unitType;
                if (customUnitMetadata.f2981fl || !customUnitMetadata.f2977fh) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public AI(int i) {
        this(i, true);
    }

    public AI(int i, boolean z) {
        super(i, z);
        this.f562aq = 3000;
        this.f542aG = 0;
        this.f550aO = 0.0f;
        this.f551aP = 0.0f;
        this.firstRun = true;
        this.f579bb = true;
        this.f580bc = false;
        this.f587bj = new ConcurrentLinkedQueue();
        this.f588bk = new ArrayList();
        this._returnPoint = new PointF();
        this.f591bn = new ArrayList();
        this.f592bo = new AbstractC0153d("attackingUnitsLand") { // from class: com.corrodinggames.rts.game.a.a.1
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                return AI.this.m4361a(unitType) && m4288a(unitType, MovementType.f1644b);
            }
        };
        this.f593bp = new AbstractC0153d("attackingUnitsHover") { // from class: com.corrodinggames.rts.game.a.a.6
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                return AI.this.m4361a(unitType) && m4288a(unitType, MovementType.f1648f);
            }
        };
        this.f594bq = new AbstractC0153d("attackingUnitsAir") { // from class: com.corrodinggames.rts.game.a.a.7
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                return AI.this.m4361a(unitType) && m4288a(unitType, MovementType.f1646d);
            }
        };
        this.f595br = new AbstractC0153d("attackingUnitsWater") { // from class: com.corrodinggames.rts.game.a.a.8
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                return AI.this.m4361a(unitType) && m4288a(unitType, MovementType.f1647e);
            }
        };
        this.f596bs = new AbstractC0153d("buildingUnits") { // from class: com.corrodinggames.rts.game.a.a.9
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (Unit.m3768b(unitType).mo2975bH()) {
                    if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2981fl) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        this.f597bt = new AbstractC0153d("transportUnits") { // from class: com.corrodinggames.rts.game.a.a.10
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (AI.this.m4323g(Unit.m3768b(unitType))) {
                    if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2981fl) {
                        return false;
                    }
                    if (unitType.mo3075o() == MovementType.f1646d || unitType.mo3075o() == MovementType.f1648f || unitType.mo3075o() == MovementType.f1650h) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.f598bu = new AbstractC0153d("transportUnitsFlying") { // from class: com.corrodinggames.rts.game.a.a.11
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (AI.this.f597bt.mo4289a(unitType) && unitType.mo3075o() == MovementType.f1646d) {
                    return true;
                }
                return false;
            }
        };
        this.f599bv = new AbstractC0153d("transportUnitsNonFlying") { // from class: com.corrodinggames.rts.game.a.a.12
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (AI.this.f597bt.mo4289a(unitType) && unitType.mo3075o() != MovementType.f1646d) {
                    return true;
                }
                return false;
            }
        };
        this.f600bw = new AbstractC0153d("builderUnits") { // from class: com.corrodinggames.rts.game.a.a.13
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (unitType.mo3079m()) {
                    if ((!(unitType instanceof CustomUnitMetadata) || !((CustomUnitMetadata) unitType).f2981fl) && unitType.mo3075o() != MovementType.f1647e) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.f601bx = new AbstractC0153d("harvesterUnits") { // from class: com.corrodinggames.rts.game.a.a.2
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                Unit.m3768b(unitType);
                if (unitType.mo3077n()) {
                    if ((!(unitType instanceof CustomUnitMetadata) || !((CustomUnitMetadata) unitType).f2981fl) && unitType.mo3075o() != MovementType.f1647e) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.f602by = new AbstractC0153d("extractorUnits") { // from class: com.corrodinggames.rts.game.a.a.3
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                if (Unit.m3768b(unitType).mo2975bH() && unitType.mo3073p()) {
                    if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2981fl) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        this.f603bz = new AbstractC0153d("buildingFactories") { // from class: com.corrodinggames.rts.game.a.a.4
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                UnitType i2;
                Unit m3768b = Unit.m3768b(unitType);
                if (m3768b.mo2975bH()) {
                    if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2981fl) {
                        return false;
                    }
                    boolean z2 = false;
                    Iterator it = m3768b.mo2712M().iterator();
                    while (it.hasNext()) {
                        Action action = (Action) it.next();
                        if (action != null && (action instanceof AbstractC0222w)) {
                            AbstractC0222w abstractC0222w = (AbstractC0222w) action;
                            if (!abstractC0222w.mo3615D() && (i2 = abstractC0222w.mo2734i()) != null && !i2.mo3085j()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.f572bA = new AbstractC0153d("buildingFactoriesForBuilders") { // from class: com.corrodinggames.rts.game.a.a.5
            @Override // com.corrodinggames.rts.game.ai.AbstractC0153d
            /* renamed from: a */
            public boolean mo4289a(UnitType unitType) {
                UnitType i2;
                Unit m3768b = Unit.m3768b(unitType);
                if (m3768b.mo2975bH()) {
                    if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2981fl) {
                        return false;
                    }
                    boolean z2 = false;
                    Iterator it = m3768b.mo2712M().iterator();
                    while (it.hasNext()) {
                        Action action = (Action) it.next();
                        if (action != null && (action instanceof AbstractC0222w)) {
                            AbstractC0222w abstractC0222w = (AbstractC0222w) action;
                            if (!abstractC0222w.mo3615D() && (i2 = abstractC0222w.mo2734i()) != null && !i2.mo3085j() && i2.mo3079m()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.f573bB = new C0152c();
        this.f575bD = 0.0f;
        this.f576bE = new ArrayList();
        this.zones = new ObjectVector();
        m4337ao();
    }

    /* renamed from: ao */
    private void m4337ao() {
        GameEngine game = GameEngine.getInstance();
        this.f544aI = 100 + (this.teamID * 9);
        this.f546aK = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15 + (this.teamID * 19);
        this.f548aM = 50 + (this.teamID * 2);
        this.doAttackDelay = 4200 + (this.teamID * 5);
        this.f552aQ = 3500 + (this.teamID * 5);
        this.f553aR = 7500 + (this.teamID * 5);
        this.f590bm = new Paint();
        this.f590bm.setColor(Color.m4733a(0, 255, 0));
        this.f590bm.setStyle(Paint.Style.f217b);
        this.f590bm.mo935a(true);
        game.m892a(this.f590bm, 14.0f);
        m4347ae();
    }

    /* renamed from: ae */
    public void m4347ae() {
        Iterator it = this.f591bn.iterator();
        while (it.hasNext()) {
            ((AbstractC0153d) it.next()).rebuildUnitMix();
        }
    }

    /* renamed from: d */
    public void aiDebug(String message) {
        GameEngine.log("ai_debug(" + this.teamID + ")", message);
    }

    /* renamed from: af */
    public PointF m4346af() {
        GameEngine game = GameEngine.getInstance();
        game.map.fromGrid(CommonUtils.m1737a(0, game.map.mapWidth), CommonUtils.m1737a(0, game.map.mapHeight));
        this._returnPoint.set(game.map.returnX, game.map.returnY);
        return this._returnPoint;
    }

    /* renamed from: ag */
    public PointF getRandomResPool() {
        GameEngine game = GameEngine.getInstance();
        if (game.map.resPools.size() == 0) {
            return null;
        }
        Point point = (Point) game.map.resPools.get(CommonUtils.realRand(game.map.resPools.size()));
        game.map.fromGrid(point.game, point.y);
        this._returnPoint.set(game.map.returnX, game.map.returnY);
        return this._returnPoint;
    }

    /* renamed from: a */
    public PointF m4376a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f3 = -1.0f;
        PointF pointF = new PointF();
        for (int i = 0; i < gameEngine.map.resPools.size(); i++) {
            Point point = (Point) gameEngine.map.resPools.get(i);
            gameEngine.map.fromGrid(point.game, point.y);
            this._returnPoint.set(gameEngine.map.returnX, gameEngine.map.returnY);
            PointF pointF2 = this._returnPoint;
            float distanceSq = CommonUtils.distanceSq(pointF2.x, pointF2.y, f, f2);
            if (distanceSq < f3 || f3 == -1.0f) {
                f3 = distanceSq;
                pointF.m4669a(pointF2);
            }
        }
        if (f3 == -1.0f) {
            return null;
        }
        return pointF;
    }

    /* renamed from: e */
    Base m4326e(Unit unit) {
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                Base base = (Base) zone;
                if (base.m4187b(unit)) {
                    return base;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    Base m4336b(float f, float f2) {
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                Base base = (Base) zone;
                if (base.m4186c(f, f2)) {
                    return base;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    Base m4324f(Unit unit) {
        return m4331c(unit.x, unit.y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Base m4331c(float f, float f2) {
        float f3 = -1.0f;
        Base base = null;
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                Base base2 = (Base) zone;
                float d = base2.m4184d(f, f2);
                if (base == null || d < f3) {
                    f3 = d;
                    base = base2;
                }
            }
        }
        return base;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Base m4362a(MovementType movementType, float f, float f2, boolean z) {
        float f3 = -1.0f;
        Base base = null;
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                Base base2 = (Base) zone;
                float d = base2.m4184d(f, f2);
                if (m4374a(f, f2, base2, movementType) && (!z || !base2.f697t)) {
                    if (base == null || d < f3) {
                        f3 = d;
                        base = base2;
                    }
                }
            }
        }
        return base;
    }

    /* renamed from: a */
    public static boolean m4364a(Unit unit, float f, float f2, float f3) {
        if (CommonUtils.distanceSq(unit.x, unit.y, f, f2) < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4373a(PointF pointF) {
        if (m4367a(this, pointF.x, pointF.y, 290.0f) != null) {
            return false;
        }
        Base m4331c = m4331c(pointF.x, pointF.y);
        if (m4331c != null && m4331c.m4184d(pointF.x, pointF.y) < 490000.0f) {
            return false;
        }
        PointF m4376a = m4376a(pointF.x, pointF.y);
        if ((m4376a != null && CommonUtils.distanceSq(pointF.x, pointF.y, m4376a.x, m4376a.y) < 160000.0f) || C0955y.m436d(pointF.x, pointF.y) || C0955y.m436d(pointF.x + 60.0f, pointF.y) || C0955y.m436d(pointF.x, pointF.y + 60.0f) || C0955y.m436d(pointF.x - 60.0f, pointF.y) || C0955y.m436d(pointF.x, pointF.y + 60.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m4335b(PointF pointF) {
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team != this && (unit instanceof CommandCenter)) {
                if (unit.team.m3925c(this) && m4364a(unit, pointF.x, pointF.y, 300.0f)) {
                    return false;
                }
                if (unit.team.m3913d(this) && m4364a(unit, pointF.x, pointF.y, 320.0f)) {
                    return false;
                }
            }
        }
        if (m4334b(this, pointF.x, pointF.y, 360.0f) >= 4 || m4366a((Team) this, pointF.x, pointF.y, 360.0f, true) >= 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int m4369a(AbstractC0153d abstractC0153d, EnumC0151b enumC0151b) {
        int i = 0;
        Iterator it = abstractC0153d.unitMix.iterator();
        while (it.hasNext()) {
            i += m4359a(((C0154e) it.next()).f635a, enumC0151b);
        }
        return i;
    }

    /* renamed from: a */
    public int m4359a(UnitType unitType, EnumC0151b enumC0151b) {
        return m4358a(unitType, true, enumC0151b);
    }

    /* renamed from: a */
    public int m4358a(UnitType unitType, boolean z, EnumC0151b enumC0151b) {
        boolean mo3085j = unitType.mo3085j();
        Integer m4295a = this.f573bB.m4295a(mo3085j, unitType, z);
        if (m4295a != null) {
            return m4295a.intValue();
        }
        int i = 0;
        if (mo3085j) {
            z = false;
        }
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == this && (enumC0151b == EnumC0151b.f625a || !unit.f1603bE)) {
                if (unit.unitType == unitType) {
                    i++;
                }
                if (z && (unit instanceof AbstractC0483l)) {
                    i += ((AbstractC0483l) unit).mo2906h(unitType);
                }
            }
        }
        this.f573bB.m4294a(mo3085j, unitType, z, Integer.valueOf(i));
        return i;
    }

    /* renamed from: ah */
    public int m4344ah() {
        int i = 0;
        Iterator it = this.f588bk.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof C0156g) {
                i += ((C0156g) zone).f670G.size();
            }
        }
        return i;
    }

    /* renamed from: g */
    public boolean m4323g(Unit unit) {
        if (unit instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit;
            if (orderableUnit.mo2823cp()) {
                UnitType r = orderableUnit.getUnitType();
                if ((r instanceof CustomUnitMetadata) && !((CustomUnitMetadata) r).f2978fi) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m4322h(Unit unit) {
        if (unit instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit;
            if (!orderableUnit.mo2975bH() && orderableUnit.canAttack() && !m4323g(orderableUnit) && !orderableUnit.mo2561ai()) {
                UnitType r = orderableUnit.getUnitType();
                if ((r instanceof CustomUnitMetadata) && !((CustomUnitMetadata) r).f2977fh) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4332b(Unit unit, Unit unit2) {
        if (this.isSurvival) {
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.m2554ap() && C0236ak.m3716a(orderableUnit, unit2)) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (m4322h(unit) && (unit instanceof OrderableUnit) && C0236ak.m3716a((OrderableUnit) unit, unit2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void m4321i(float f) {
        String[] split;
        C0163n c0163n;
        String[] split2;
        if (!f535ap || !GameEngine.getInstance().debugTempMode || this.f558aW || this.f556aU) {
            return;
        }
        GameEngine game = GameEngine.getInstance();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this && game.f5958cM.m4661b((int) (unit.x - 200.0f), (int) (unit.y - 200.0f), (int) (unit.x + 200.0f), (int) (unit.y + 200.0f))) {
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) unit;
                }
                String str = VariableScope.nullOrMissingString;
                float f2 = (unit.y - game.viewpointY_rounded) - 60.0f;
                this.f590bm.setColor(Color.m4733a(0, 255, 0));
                if (unit instanceof CommandCenter) {
                    f2 -= 80.0f;
                    str = ((((((str + "Base ( Team:" + this.teamID + " )") + "\nuseTransportsOnThisMap: " + m4350ab()) + "\nuseHoverTransportsOnThisMap: " + m4349ac()) + "\nattackingCount: " + this.attackingCount) + "\ndefendingCount: " + this.defendingCount) + "\nnumOfUnitsNeedingTransport: " + m4344ah()) + "\ntransport: " + this.f539aD;
                    if (m4379X()) {
                        str = str + "\nTurtling: true";
                    }
                    this.f590bm.setColor(Color.m4733a(255, 255, 255));
                }
                if (str.length() != 0) {
                    for (String str2 : str.split("\n")) {
                        float f3 = unit.x - game.viewpointX_rounded;
                        float f4 = f2;
                        float m4676m = (-this.f590bm.m4677l()) + this.f590bm.m4676m();
                        game.graphics.mo135j();
                        if (game.viewpointZoom > 1.0f) {
                            game.m915O();
                            f3 *= game.viewpointZoom;
                            f4 *= game.viewpointZoom;
                            m4676m /= game.viewpointZoom;
                        }
                        game.graphics.drawText(str2, f3, f4, this.f590bm);
                        game.graphics.mo134k();
                        f2 += m4676m;
                    }
                }
            }
        }
        Iterator it = this.f587bj.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (game.f5958cM.m4661b((int) (zone.x - zone.radius), (int) (zone.y - zone.radius), (int) (zone.x + zone.radius), (int) (zone.y + zone.radius))) {
                this.f590bm.setColor(m3983E());
                game.graphics.mo219a(zone.x - game.viewpointX_rounded, zone.y - game.viewpointY_rounded, zone.radius + 2.0f, this.f590bm);
                int m4733a = Color.m4733a(0, 255, 0);
                String str3 = VariableScope.nullOrMissingString + "\n" + zone.getClass().getSimpleName() + " ( Team:" + this.teamID + " )";
                float f5 = zone.y - game.viewpointY_rounded;
                if (zone instanceof Base) {
                    f5 -= 50.0f;
                    Base base = (Base) zone;
                    String str4 = (((str3 + "\nState: " + base.state.name() + "(id:" + base.id + ")") + "\nunsafe: " + base.m4220f() + " (" + base.f696s + ")") + "\nunsafeBaseTimer: " + base.f708v) + "\nallowedUnits: " + base.allowedUnits;
                    if (base.f700z != null) {
                        str4 = str4 + "\nlastAttemptedBuilding: " + base.f700z.mo3087i();
                    }
                    if (base.f671A != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordPrice: " + base.f671A.m3389a(false, true, 4, true);
                    }
                    if (base.f672B != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordBy: " + base.f672B.m3389a(false, true, 4, true);
                    }
                    String str5 = ((((str4 + "\nlastAttemptedBuildingCount: " + base.f673C) + "\nlastAttemptedBuildingFailed: " + base.f674D) + "\nlastUnitAttempt: " + base.f675E + " (" + base.f676F + " - " + base.f677G + ")") + "\nbuildBuildingDelay: " + base.f688e) + "\ncredits: " + CommonUtils.m1673c(this.credits) + " (x" + CommonUtils.m1645f(m3873z()) + ")";
                    if (base.state == BaseStates.f713a) {
                        str5 = str5 + "\nclaimedBaseTimer: " + base.claimedBaseTimer;
                    }
                    if (base.abandonedTimer > 100.0f) {
                        str5 = str5 + "\nabandonedTimer: " + base.abandonedTimer;
                    }
                    if (base.requestedBuildersDelay > 0.0f) {
                        str5 = str5 + "\nrequestedBuildersDelay: " + base.requestedBuildersDelay + " (" + base.f690h + ")";
                    }
                    str3 = (str5 + "\nBuilders: " + base.Builders) + "\nIdle Builders: " + base.f680K;
                }
                if (zone instanceof C0156g) {
                    C0156g c0156g = (C0156g) zone;
                    if (c0156g.f645c) {
                        str3 = str3 + "\nVIP Mode";
                    }
                    String str6 = (((str3 + "\n" + (c0156g.mo4257b() ? "Defensive Type" : "Attack Type")) + "\nUnits: " + c0156g.f669F.size() + " / " + c0156g.f638A) + "\nStagingForAttack: " + c0156g.StagingForAttack) + "\nAttackDelay: " + c0156g.AttackDelay;
                    if (c0156g.StagingTimer != 0.0f) {
                        str6 = str6 + "\nStagingTimer: " + c0156g.StagingTimer;
                    }
                    String str7 = str6 + "\nStagingTargetFound: " + c0156g.f660r;
                    if (c0156g.f657o != 0.0f) {
                        str7 = str7 + "\nattackingFor: " + c0156g.f657o;
                    }
                    str3 = str7 + "\ncommonMovement: " + c0156g.m4262i().name();
                    if (c0156g.f639B) {
                        str3 = str3 + " (seaGroup)";
                    }
                    if (c0156g.f670G.size() > 0) {
                        str3 = str3 + "\nunitsNeedingTransport:" + c0156g.f670G.size();
                    }
                    if (c0156g.f644b != null) {
                        str3 = str3 + "\nlast action:" + c0156g.f644b;
                    }
                    if (!c0156g.f664v && !c0156g.StagingForAttack) {
                        str3 = str3 + "\nnext move:" + ((int) m4317k(c0156g.f656n)) + "s";
                    }
                }
                if (zone instanceof C0163n) {
                    str3 = ((str3 + "\nUnitsWanted: " + c0163n.f730l) + "\nunits: " + c0163n.f669F.size()) + "\nreadyToMoveOut: " + c0163n.f733q;
                    if (((C0163n) zone).f731m != null) {
                        str3 = str3 + "\nCurrentlyHelping: " + c0163n.f731m.id;
                    }
                }
                if (zone instanceof C0161l) {
                    str3 = str3 + "\nneedsTransportGroup: " + ((C0161l) zone).f721a;
                }
                this.f590bm.setColor(m3983E());
                for (String str8 : str3.split("\n")) {
                    if (!str8.trim().equals(VariableScope.nullOrMissingString)) {
                        float f6 = zone.x - game.viewpointX_rounded;
                        float f7 = f5;
                        float m4676m2 = (-this.f590bm.m4677l()) + this.f590bm.m4676m();
                        game.graphics.mo135j();
                        if (game.viewpointZoom > 1.0f) {
                            game.m915O();
                            f6 *= game.viewpointZoom;
                            f7 *= game.viewpointZoom;
                            m4676m2 /= game.viewpointZoom;
                        }
                        game.graphics.drawText(str8, f6, f7, this.f590bm);
                        game.graphics.mo134k();
                        f5 += m4676m2;
                        this.f590bm.setColor(m4733a);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public Unit m4327e(Team team) {
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == team && ((unit instanceof CommandCenter) || unit.f1606bH)) {
                return unit;
            }
        }
        Iterator it2 = Unit.fastUnitList.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2.team == team && unit2.f1605bG) {
                return unit2;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.Team
    /* renamed from: a */
    public void mo3864a(float unit) {
        Unit m4327e;
        super.mo3864a(unit);
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f556aU || this.f558aW) {
            return;
        }
        if (gameEngine.networkEngine.networked && (!gameEngine.networkEngine.isServer || gameEngine.replayEngine.isPlaying())) {
            return;
        }
        if (this.f575bD > 0.0f) {
            this.f575bD -= unit;
            return;
        }
        this.f574bC = m3875x();
        if (this.f579bb && gameEngine.f5845by > 3000) {
            this.f579bb = false;
            Unit[] m485a = Unit.fastUnitList.m485a();
            int i = 0;
            int size = Unit.fastUnitList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                Unit unit2 = m485a[i];
                if (!(unit2 instanceof ZoneMarkerOrDamagingBorder)) {
                    i++;
                } else {
                    aiDebug("firstRunDelayed: Found damagingBorder");
                    this.f581bd = (ZoneMarkerOrDamagingBorder) unit2;
                    break;
                }
            }
        }
        if (this.firstRun) {
            this.firstRun = false;
            this.f582be = true;
            this.f583bf = true;
            this.f584bg = true;
            this.f585bh = true;
            Unit m4327e2 = m4327e(this);
            if (m4327e2 == null) {
                aiDebug("firstRun: no command center found");
            }
            if (m4327e2 != null) {
                for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                    Team team = Team.getTeam(i2);
                    if (team != null && team != this && (m4327e = m4327e(team)) != null) {
                        if (!m4375a(m4327e2.x, m4327e2.y, m4327e.x, m4327e.y, MovementType.f1644b)) {
                            this.f582be = false;
                        }
                        if (!m4375a(m4327e2.x, m4327e2.y, m4327e.x, m4327e.y, MovementType.f1648f)) {
                            this.f583bf = false;
                        }
                    }
                }
                Iterator it = gameEngine.map.resPools.iterator();
                while (it.hasNext()) {
                    PointF m4158a = gameEngine.map.m4158a((Point) it.next());
                    if (!m4375a(m4327e2.x, m4327e2.y, m4158a.x, m4158a.y + gameEngine.map.pixel_Height, MovementType.f1644b)) {
                        this.f584bg = false;
                    }
                    if (!m4375a(m4327e2.x, m4327e2.y, m4158a.x, m4158a.y + gameEngine.map.pixel_Height, MovementType.f1648f)) {
                        this.f585bh = false;
                    }
                }
            }
        }
        this.f548aM += unit;
        this.f549aN += unit;
        if (this.f548aM > 25.0f) {
            this.f548aM -= 25.0f;
            if (this.f548aM > 25.0f) {
                this.f548aM = 25.0f;
            }
            if (this.f548aM < -1.0f) {
                this.f548aM = -1.0f;
            }
            Iterator it2 = this.f587bj.iterator();
            while (it2.hasNext()) {
                Object team2 = it2.next();
                Zone zone = (Zone) team2;
                if (zone instanceof Base) {
                    ((Base) zone).f685a += this.f549aN;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                Base base = null;
                Iterator it3 = this.f587bj.iterator();
                while (it3.hasNext()) {
                    Zone zone2 = (Zone) it3.next();
                    if (zone2 instanceof Base) {
                        Base base2 = (Base) zone2;
                        if (base == null || base.f685a < base2.f685a) {
                            base = base2;
                        }
                    }
                }
                if (base == null || base.f685a < 50.0f) {
                    break;
                }
                Base base3 = base;
                base3.m4229b(base3.f685a);
                base3.m4223d(base3.f685a);
                base3.f685a = 0.0f;
            }
            this.f549aN = 0.0f;
        }
        this.f544aI += unit;
        this.f545aJ += unit;
        if (this.f544aI > 80.0f) {
            m4312n(this.f545aJ);
            this.f544aI -= 80.0f;
            if (this.f544aI > 80.0f) {
                this.f544aI = 80.0f;
            }
            if (this.f544aI < -1.0f) {
                this.f544aI = -1.0f;
            }
            this.f545aJ = 0.0f;
        }
        this.f546aK += unit;
        this.f547aL += unit;
        if (this.f546aK > 250.0f) {
            m4314m(this.f547aL);
            this.f546aK -= 250.0f;
            if (this.f546aK > 250.0f) {
                this.f546aK = 250.0f;
            }
            if (this.f546aK < -1.0f) {
                this.f546aK = -1.0f;
            }
            this.f547aL = 0.0f;
        }
    }

    /* renamed from: j */
    public float m4319j(float f) {
        return (f / 60.0f) * 1000.0f;
    }

    /* renamed from: k */
    public float m4317k(float f) {
        return f / 60.0f;
    }

    /* renamed from: a */
    public void m4355a(OrderableUnit orderableUnit, C0202c c0202c) {
        C0678e m2261a = GameEngine.getInstance().f5867cf.m2261a(this);
        m2261a.m2092a(orderableUnit);
        m2261a.m2097a(c0202c);
    }

    /* renamed from: l */
    public void m4316l(float f) {
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == this && (unit instanceof OrderableUnit) && m4320i(unit)) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit instanceof AttackSubmarine) {
                    boolean z = false;
                    Unit m2569aa = orderableUnit.m2569aa();
                    if (m2569aa != null && orderableUnit.m2472h(m2569aa)) {
                        z = !m2569aa.m3752cF();
                    }
                    boolean z2 = !orderableUnit.isUnderwater();
                    if (z && z != z2) {
                        m4355a(orderableUnit, AttackSubmarine.f3643j.m3834L());
                    }
                    if (!z && z != z2) {
                        m4355a(orderableUnit, AttackSubmarine.f3644k.m3834L());
                    }
                }
                if (orderableUnit instanceof AmphibiousJet) {
                    boolean z3 = true;
                    Unit m2569aa2 = orderableUnit.m2569aa();
                    if (m2569aa2 != null && orderableUnit.m2472h(m2569aa2)) {
                        z3 = !m2569aa2.isUnderwater();
                    }
                    boolean z4 = !orderableUnit.isUnderwater();
                    if (z3 && z3 != z4) {
                        m4355a(orderableUnit, AmphibiousJet.f1805y.m3834L());
                    }
                    if (!z3 && z3 != z4) {
                        m4355a(orderableUnit, AmphibiousJet.f1806z.m3834L());
                    }
                }
                if (orderableUnit.mo2519bd() == EnumC0295b.f1772d && orderableUnit.m2554ap() && orderableUnit.m2569aa() != null) {
                    C0678e m2261a = GameEngine.getInstance().f5867cf.m2261a(this);
                    m2261a.m2092a(orderableUnit);
                    m2261a.m2094a(orderableUnit.m2569aa());
                }
            }
        }
    }

    /* renamed from: c */
    public AttackMode m4330c(OrderableUnit orderableUnit) {
        if (orderableUnit.mo2579aR()) {
            boolean z = true;
            if (orderableUnit.mo2561ai()) {
                z = false;
            }
            if (m4323g(orderableUnit)) {
                z = false;
            }
            if (z) {
                if (this.f557aV) {
                    return AttackMode.f1397f;
                }
                return AttackMode.f1392a;
            }
        }
        return AttackMode.f1393b;
    }

    public ArrayList ai() {
        f604bH.clear();
        return f604bH;
    }

    /* renamed from: d */
    public void m4329d(OrderableUnit orderableUnit) {
        Iterator it = this.zones.iterator();
        while (it.hasNext()) {
            ((AbstractC0144a) it.next()).mo4309a(this, orderableUnit);
        }
    }

    /* renamed from: e */
    public void m4325e(OrderableUnit orderableUnit) {
        Iterator it = this.zones.iterator();
        while (it.hasNext()) {
            ((AbstractC0144a) it.next()).mo4306b(this, orderableUnit);
        }
    }

    /* renamed from: m */
    public void m4314m(float f) {
        boolean z;
        Unit m4341ak;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f573bB.m4293b();
        Iterator it = this.zones.iterator();
        while (it.hasNext()) {
            ((AbstractC0144a) it.next()).mo4303b(m4319j(f), this);
        }
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == this && !unit.mo1773u()) {
                i++;
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) unit;
                    if (!orderableUnit.f1531bv) {
                        orderableUnit.f1531bv = true;
                        m4329d(orderableUnit);
                    }
                    if (unit.transportedBy == null) {
                        Base base = orderableUnit.f3703av;
                        orderableUnit.f3703av = m4324f(orderableUnit);
                        if (orderableUnit.f3703av != null && base != orderableUnit.f3703av) {
                            if (orderableUnit.mo2975bH()) {
                                orderableUnit.f3704aw = m4375a(unit.x, unit.y, orderableUnit.f3703av.x, orderableUnit.f3703av.y, MovementType.f1644b);
                                if (!orderableUnit.f3704aw && orderableUnit.getUnitType().mo3073p()) {
                                    orderableUnit.f3704aw = m4375a(unit.x, unit.y + 15.0f, orderableUnit.f3703av.x, orderableUnit.f3703av.y, MovementType.f1644b);
                                }
                            } else {
                                orderableUnit.f3704aw = m4375a(unit.x, unit.y, orderableUnit.f3703av.x, orderableUnit.f3703av.y, MovementType.f1644b);
                            }
                        }
                    }
                }
            }
        }
        m4316l(f);
        Iterator it2 = Unit.fastUnitList.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2.team == this && (unit2 instanceof OrderableUnit)) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit2;
                AttackMode m4330c = m4330c(orderableUnit2);
                if (orderableUnit2.f3762I != m4330c && m4320i(orderableUnit2)) {
                    C0678e m2261a = gameEngine.f5867cf.m2261a(this);
                    m2261a.m2092a(orderableUnit2);
                    m2261a.m2095a(m4330c);
                }
                if (orderableUnit2.mo2561ai() && orderableUnit2.mo2845cZ() && orderableUnit2.f3702au == null && m4320i(orderableUnit2)) {
                    C0156g.m4276a(this, orderableUnit2);
                }
            }
        }
        if (i == 0 && !this.isSurvival) {
            this.f558aW = true;
        }
        this.f553aR = CommonUtils.toZero(this.f553aR, f);
        this.f552aQ = CommonUtils.toZero(this.f552aQ, f);
        if (m4381V()) {
            this.f552aQ = CommonUtils.toZero(this.f552aQ, 4.0f * f);
        }
        if (this.f552aQ == 0.0f) {
            int i3 = 0;
            Iterator it3 = this.f588bk.iterator();
            while (it3.hasNext()) {
                Zone zone = (Zone) it3.next();
                if ((zone instanceof Base) && ((Base) zone).state == BaseStates.f713a) {
                    i3++;
                }
            }
            boolean z2 = false;
            if (i3 > 2) {
                z2 = true;
            }
            if (z2) {
                this.f552aQ = 300.0f;
            } else {
                PointF randomResPool = getRandomResPool();
                if (randomResPool != null) {
                    randomResPool.y += gameEngine.map.pixel_Height;
                    if (m4336b(randomResPool.x, randomResPool.y) == null && m4335b(randomResPool)) {
                        this.f552aQ = 2000.0f;
                        Base base2 = new Base(this, randomResPool.x, randomResPool.y);
                        base2.radius = 360.0f;
                        base2.state = BaseStates.f713a;
                        base2.type = BaseType.f718b;
                        this.f565at++;
                    }
                }
            }
        }
        if (this.f553aR == 0.0f) {
            this.f553aR = 100.0f;
            int i4 = 0;
            Iterator it4 = this.f588bk.iterator();
            while (it4.hasNext()) {
                Zone zone2 = (Zone) it4.next();
                if ((zone2 instanceof Base) && ((Base) zone2).type == BaseType.f719c) {
                    i4++;
                }
            }
            if (i4 < 3 && (m4341ak = m4341ak()) != null) {
                PointF pointF = new PointF();
                pointF.x = m4341ak.x;
                pointF.y = m4341ak.y;
                if (pointF != null && m4336b(pointF.x, pointF.y) == null && m4373a(pointF)) {
                    this.f553aR = 5000.0f;
                    Base base3 = new Base(this, pointF.x, pointF.y);
                    base3.radius = 310.0f;
                    base3.state = BaseStates.f713a;
                    base3.type = BaseType.f719c;
                    this.f565at++;
                }
            }
        }
        this.f561aZ = 0;
        this.attackingCount = 0;
        this.defendingCount = 0;
        Unit[] m485a2 = Unit.fastUnitList.m485a();
        int size2 = Unit.fastUnitList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Unit unit3 = m485a2[i5];
            if (unit3.team == this && (unit3 instanceof OrderableUnit)) {
                OrderableUnit orderableUnit3 = (OrderableUnit) unit3;
                if (!unit3.mo2975bH()) {
                    if (orderableUnit3.f3702au != null && orderableUnit3.f3702au.mo4257b()) {
                        this.defendingCount++;
                    } else if (m4322h(orderableUnit3) && !orderableUnit3.f1603bE) {
                        if (orderableUnit3.getMovementType() == MovementType.f1647e) {
                            this.f561aZ++;
                        } else {
                            this.attackingCount++;
                        }
                    }
                }
            }
        }
        this.f550aO = CommonUtils.toZero(this.f550aO, f);
        this.f551aP += f;
        if (this.f550aO == 0.0f) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Iterator it5 = Unit.fastUnitList.iterator();
            while (it5.hasNext()) {
                Unit unit4 = (Unit) it5.next();
                if (unit4.team == this && unit4.isActive()) {
                    if (((unit4 instanceof LandFactory) || (unit4 instanceof AirFactory) || (unit4 instanceof SeaFactory)) && (unit4 instanceof AirFactory)) {
                        i7++;
                        if (((AirFactory) unit4).mo2647U() > 1) {
                            i6++;
                        }
                    }
                    if (unit4.getUnitType().mo3073p()) {
                        i8++;
                        if (Action.m3827c(unit4.mo2870ck())) {
                            i9++;
                        }
                    }
                }
            }
            if (canBuy(4100.0d) || this.f551aP > 2400.0f || this.f540aE == 0) {
                Iterator it6 = Unit.fastUnitList.iterator();
                while (it6.hasNext()) {
                    Unit unit5 = (Unit) it6.next();
                    if (unit5.team == this && (unit5 instanceof OrderableUnit)) {
                        OrderableUnit orderableUnit4 = (OrderableUnit) unit5;
                        if (orderableUnit4.mo3179cj()) {
                            ArrayList M = orderableUnit4.mo2712M();
                            ArrayList ai = ai();
                            Iterator it7 = M.iterator();
                            while (it7.hasNext()) {
                                Action action = (Action) it7.next();
                                if (action.mo3596n(orderableUnit4)) {
                                    ai.add(action);
                                }
                            }
                            if (ai.size() > 0) {
                                m4354a(orderableUnit4, (Action) C0155f.m4280a(ai));
                            }
                        }
                    }
                }
                boolean z3 = false;
                if (canBuy(30000.0d)) {
                    z3 = true;
                }
                Iterator it8 = Unit.fastUnitList.iterator();
                while (it8.hasNext()) {
                    Unit unit6 = (Unit) it8.next();
                    if (unit6.team == this && (unit6 instanceof OrderableUnit)) {
                        OrderableUnit orderableUnit5 = (OrderableUnit) unit6;
                        C0202c ck = orderableUnit5.mo2870ck();
                        if (Action.m3827c(ck)) {
                            float cl = orderableUnit5.mo3178cl();
                            if (cl < 0.0f) {
                                cl = 6.0f;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (cl == 0.0f) {
                                continue;
                            } else {
                                int realRand = CommonUtils.realRand(100);
                                float f2 = 100.0f - cl;
                                if (z3) {
                                    f2 -= 4.0f;
                                }
                                if (!z) {
                                    if (unit6.getUnitType().mo3073p() && i9 > 0) {
                                        f2 = 50.0f;
                                    }
                                    if (i7 > 0 && i6 == 0) {
                                        f2 = 99.0f;
                                        if (unit6 instanceof AirFactory) {
                                            f2 = 40.0f;
                                        }
                                    }
                                }
                                if (f2 < 10.0f) {
                                    f2 = 10.0f;
                                }
                                if (!(((float) realRand) > f2)) {
                                    continue;
                                } else {
                                    if (orderableUnit5.m3743cm()) {
                                    }
                                    if (CommonUtils.realRand(100) > 50) {
                                        orderableUnit5.mo3030a(this.f576bE);
                                        if (this.f576bE.size() != 0) {
                                            ck = (C0202c) this.f576bE.get(new Random().nextInt(this.f576bE.size()));
                                        }
                                    }
                                    boolean z4 = false;
                                    Action a = orderableUnit5.mo3219a(ck);
                                    if (a != null) {
                                        if (a.mo3597m(orderableUnit5)) {
                                            z4 = true;
                                        }
                                        if (a.mo2698e() == EnumC0220u.f1453g) {
                                            z4 = true;
                                        }
                                        if (!a.isAvailable(orderableUnit5)) {
                                            z4 = true;
                                        }
                                        if (!a.isActive((Unit) orderableUnit5, false)) {
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        m4355a(orderableUnit5, ck);
                                        m4352a(orderableUnit5, a.mo3586z(), true);
                                        this.f550aO = 900.0f;
                                        this.f551aP = 0.0f;
                                        if (!z3) {
                                            break;
                                        } else if (canBuy(40000.0d)) {
                                            if (CommonUtils.realRand(100) > 95) {
                                                break;
                                            }
                                        } else if (CommonUtils.realRand(100) > 80) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        Iterator it9 = this.f587bj.iterator();
        while (it9.hasNext()) {
            Zone zone3 = (Zone) it9.next();
            if (zone3 instanceof AbstractC0157h) {
                ((AbstractC0157h) zone3).mo4256b(f);
            }
        }
    }

    /* renamed from: a */
    public boolean m4354a(OrderableUnit orderableUnit, Action action) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action.isAvailable(orderableUnit) && action.isActive((Unit) orderableUnit, false)) {
            C0678e m2261a = gameEngine.f5867cf.m2261a(this);
            m2261a.m2092a(orderableUnit);
            m2261a.m2097a(action.mo3819x());
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4353a(OrderableUnit orderableUnit, Action action, PointF pointF, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action.isAvailable(orderableUnit) && action.isActive((Unit) orderableUnit, false)) {
            C0678e m2261a = gameEngine.f5867cf.m2261a(this);
            m2261a.m2092a(orderableUnit);
            m2261a.m2096a(action.mo3819x(), pointF, unit);
            return true;
        }
        return false;
    }

    /* renamed from: aj */
    public void m4342aj() {
        Iterator it = this.f587bj.iterator();
        while (it.hasNext()) {
            Zone zone = (Zone) it.next();
            if (zone instanceof Base) {
                ((Base) zone).m4205t();
            }
        }
        Iterator it2 = this.f587bj.iterator();
        while (it2.hasNext()) {
            Zone zone2 = (Zone) it2.next();
            Iterator it3 = this.f587bj.iterator();
            while (it3.hasNext()) {
                Zone zone3 = (Zone) it3.next();
                if (zone2 != zone3 && zone2.id == zone3.id) {
                    GameEngine.PrintLOG_err("Id overlap on:" + zone2.id);
                    GameEngine.PrintLOG_err("zone x:" + zone2.x);
                    GameEngine.PrintLOG_err("zone y:" + zone2.y);
                    GameEngine.PrintLOG_err("zone radius:" + zone2.radius);
                    GameEngine.PrintLOG_err("zone type:" + zone2.getClass().getName());
                }
            }
        }
        int i = 0;
        Iterator it4 = this.f587bj.iterator();
        while (it4.hasNext()) {
            if (((Zone) it4.next()) instanceof Base) {
                i++;
            }
        }
        int i2 = 0;
        Iterator it5 = this.f587bj.iterator();
        while (it5.hasNext()) {
            Zone zone4 = (Zone) it5.next();
            if (zone4 instanceof Base) {
                Iterator it6 = this.f587bj.iterator();
                while (it6.hasNext()) {
                    Zone zone5 = (Zone) it6.next();
                    if ((zone5 instanceof Base) && zone4 != zone5 && CommonUtils.distanceSq(zone4.x, zone4.y, zone5.x, zone5.y) < 400.0f) {
                        i2++;
                    }
                }
            }
        }
        if (i2 > 0) {
            aiDebug("baseOverlapCount:" + i2);
        }
    }

    @Override // com.corrodinggames.rts.game.Team
    /* renamed from: a */
    public void mo3956a(OrderableUnit orderableUnit) {
        if (orderableUnit.team == this) {
            this.f573bB.m4296a(orderableUnit);
        }
    }

    /* renamed from: n */
    public void m4312n(float timePasted) {
        int leaveBehind;
        Waypoint waypoint;
        Base m4324f;
        GameEngine game = GameEngine.getInstance();
        this.f573bB.m4298a();
        Iterator it = this.zones.iterator();
        while (it.hasNext()) {
            ((AbstractC0144a) it.next()).m4311a(m4319j(timePasted), this);
        }
        Iterator it2 = this.f587bj.iterator();
        while (it2.hasNext()) {
            Zone zone = (Zone) it2.next();
            if (zone instanceof AbstractC0157h) {
                ((AbstractC0157h) zone).mo4194c(timePasted);
            }
        }
        if (this.f581bd != null) {
            Iterator it3 = this.f587bj.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Zone zone2 = (Zone) it3.next();
                if (this.f581bd.m2800a(zone2.x, zone2.y)) {
                    if (zone2 instanceof Base) {
                        zone2.mo4182p();
                        break;
                    } else if (zone2 instanceof C0156g) {
                        PointF m2799a = this.f581bd.m2799a(zone2.x, zone2.y, zone2.radius + 20.0f);
                        zone2.x = m2799a.x;
                        zone2.y = m2799a.y;
                    }
                }
            }
        }
        this.doAttackDelay = CommonUtils.toZero(this.doAttackDelay, timePasted);
        int numOfBases = 0;
        Iterator it4 = this.f588bk.iterator();
        while (it4.hasNext()) {
            if (((Zone) it4.next()) instanceof Base) {
                numOfBases++;
            }
        }
        if (numOfBases < 1) {
            Iterator it5 = Unit.fastUnitList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Unit unit = (Unit) it5.next();
                if (unit.team == this && (unit instanceof CommandCenter)) {
                    Base base = new Base(this, unit.x, unit.y);
                    base.radius = 420.0f;
                    base.state = BaseStates.f715c;
                    base.type = BaseType.f717a;
                    numOfBases++;
                    break;
                }
            }
            if (numOfBases < 1) {
                Iterator it6 = Unit.fastUnitList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Unit unit2 = (Unit) it6.next();
                    if (unit2.team == this && this.f600bw.m4286b(unit2.getUnitType())) {
                        Base base2 = new Base(this, unit2.x, unit2.y);
                        base2.radius = 420.0f;
                        base2.state = BaseStates.f715c;
                        base2.type = BaseType.f717a;
                        numOfBases++;
                        break;
                    }
                }
            }
            if (numOfBases < 1) {
                Iterator it7 = Unit.fastUnitList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Unit unit3 = (Unit) it7.next();
                    if (unit3.team == this && (unit3 instanceof OrderableUnit)) {
                        OrderableUnit orderableUnit = (OrderableUnit) unit3;
                        boolean z = false;
                        Iterator it8 = this.f600bw.unitMix.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            } else if (orderableUnit.m2533b(((C0154e) it8.next()).f635a, true)) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            Base base3 = new Base(this, unit3.x, unit3.y);
                            base3.radius = 420.0f;
                            base3.state = BaseStates.f715c;
                            base3.type = BaseType.f717a;
                            numOfBases++;
                            break;
                        }
                    }
                }
            }
            if (numOfBases < 1) {
                Iterator it9 = Unit.fastUnitList.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Unit unit4 = (Unit) it9.next();
                    if (unit4.team == this && (unit4 instanceof OrderableUnit) && ((OrderableUnit) unit4).m2562ah()) {
                        Base base4 = new Base(this, unit4.x, unit4.y);
                        base4.radius = 420.0f;
                        base4.state = BaseStates.f715c;
                        base4.type = BaseType.f717a;
                        int i = numOfBases + 1;
                        break;
                    }
                }
            }
            if (!this.f580bc) {
                this.f580bc = true;
                if (m4369a(this.f602by, EnumC0151b.f625a) >= 1) {
                    for (int i2 = 0; i2 < game.map.resPools.size(); i2++) {
                        Point point = (Point) game.map.resPools.get(i2);
                        game.map.fromGrid(point.game, point.y);
                        this._returnPoint.set(game.map.returnX, game.map.returnY);
                        PointF pointF = this._returnPoint;
                        pointF.y += game.map.pixel_Height;
                        if (m4336b(pointF.x, pointF.y) == null && m4370a(this.f602by, pointF.x, pointF.y, 200) >= 1 && m4335b(pointF)) {
                            Base base5 = new Base(this, pointF.x, pointF.y);
                            base5.radius = 360.0f;
                            base5.state = BaseStates.f713a;
                            base5.type = BaseType.f718b;
                        }
                    }
                }
            }
        }
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Unit unit5 = m485a[i3];
            if (unit5.team == this && unit5.transportedBy == null && (unit5 instanceof OrderableUnit) && unit5.mo2561ai() && m4320i(unit5)) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit5;
                if (m4326e((Unit) orderableUnit2) != null) {
                    if (orderableUnit2.m2554ap()) {
                    }
                } else if (orderableUnit2.m2554ap() && (m4324f = m4324f(orderableUnit2)) != null) {
                    PointF w = m4324f.getRandomPoint();
                    C0678e m2261a = game.f5867cf.m2261a(this);
                    m2261a.m2092a(orderableUnit2);
                    m2261a.m2102a(w.x, w.y);
                }
            }
        }
        int size2 = Unit.fastUnitList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Unit unit6 = m485a[i4];
            if (unit6.team == this && (unit6 instanceof OrderableUnit)) {
                OrderableUnit orderableUnit3 = (OrderableUnit) unit6;
                if (orderableUnit3.f3678O > 2400.0f && m4320i(orderableUnit3)) {
                    if (!orderableUnit3.f3693aG || orderableUnit3.f3678O >= 24000.0f) {
                        C0678e m2261a2 = game.f5867cf.m2261a(this);
                        m2261a2.m2092a(orderableUnit3);
                        m2261a2.m2075h();
                    }
                }
                if (orderableUnit3.mo2561ai() && m4320i(orderableUnit3) && (waypoint = orderableUnit3.getActiveWaypoint()) != null && waypoint.getType() == WaypointType.f1753c && orderableUnit3.f3678O > 700.0f) {
                    C0678e m2261a3 = game.f5867cf.m2261a(this);
                    m2261a3.m2092a(orderableUnit3);
                    m2261a3.m2075h();
                }
            }
        }
        if (!this.isSurvival) {
            m4348ad();
            int i5 = 1;
            boolean z2 = true;
            if (m4378Y()) {
                i5 = 1 + 1;
                z2 = false;
            }
            if (this.f567av > 6) {
                i5 = 2;
            }
            if (this.f567av > 11) {
                i5 = 3;
            }
            if (this.f571az < i5) {
                C0156g c0156g = new C0156g(this, false);
                c0156g.f638A = 8;
                if (m4381V()) {
                    c0156g.f638A = 10;
                }
                c0156g.m4260k();
                this.f564as++;
            }
            if ((this.f536aA >= i5 || this.f537aB > 6) && this.f569ax < 1 && z2) {
                C0156g c0156g2 = new C0156g(this, true);
                if (this.f563ar < 2) {
                    c0156g2.f638A = 3;
                } else if (this.f563ar < 5) {
                    c0156g2.f638A = 5;
                } else {
                    c0156g2.f638A = 7;
                    if (m4381V()) {
                        if (this.f563ar < 25) {
                            c0156g2.f638A = 14;
                        } else {
                            c0156g2.f638A = 18;
                        }
                    }
                }
                c0156g2.m4260k();
                this.f563ar++;
            }
            if (m4351aa() && this.f570ay < 1 && z2) {
                C0156g c0156g3 = new C0156g(this, true);
                c0156g3.f639B = true;
                c0156g3.f638A = 5;
                if (m4381V()) {
                    c0156g3.f638A = 10;
                }
                c0156g3.m4260k();
            }
            if (m4350ab() && this.f538aC < 3) {
                C0163n c0163n = new C0163n(this);
                c0163n.f730l = 1;
                c0163n.m4191f();
            }
        }
        if (this.isSurvival) {
            if (this.doAttackDelay > 30.0f) {
                this.doAttackDelay = 30.0f;
            }
            if (this.doAttackDelay == 0.0f) {
                this.f554aS++;
                if (this.f554aS == 1) {
                    this.doAttackDelay = 1000.0f;
                } else if (this.f554aS == 2) {
                    this.doAttackDelay = 3000.0f;
                    Unit m4340al = m4340al();
                    if (m4340al != null) {
                        if (this.isSurvival) {
                            leaveBehind = 0;
                        } else {
                            leaveBehind = 2;
                            if (this.attackingCount < 4) {
                                leaveBehind = 5;
                            }
                        }
                        C0678e m2261a4 = game.f5867cf.m2261a(this);
                        int size3 = Unit.fastUnitList.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            Unit unit7 = m485a[i6];
                            if (unit7.team == this && (unit7 instanceof OrderableUnit)) {
                                OrderableUnit orderableUnit4 = (OrderableUnit) unit7;
                                if (!orderableUnit4.f1603bE && m4332b(orderableUnit4, m4340al)) {
                                    if (leaveBehind <= 0) {
                                        m2261a4.m2092a(orderableUnit4);
                                    } else {
                                        leaveBehind--;
                                    }
                                }
                            }
                        }
                        m2261a4.m2087b(m4340al.x, m4340al.y);
                    }
                } else {
                    this.f554aS = 0;
                }
            }
        }
    }

    /* renamed from: i */
    public boolean m4320i(Unit unit) {
        if (unit.mo1773u() || unit.mo1774t() || unit.mo3185cS()) {
            return false;
        }
        return true;
    }

    /* renamed from: ak */
    public Unit m4341ak() {
        Unit unit = null;
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m485a[i2];
            if (!unit2.dead && unit2.transportedBy == null && this == unit2.team && m4322h(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.fastUnitList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.dead && unit3.transportedBy == null && this == unit3.team && m4322h(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        return unit;
    }

    /* renamed from: al */
    public Unit m4340al() {
        Unit unit = null;
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m485a[i2];
            if (!unit2.dead && unit2.transportedBy == null && !unit2.mo1773u() && m3925c(unit2.team) && m4318j(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.fastUnitList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.dead && unit3.transportedBy == null && !unit3.mo1773u() && m3925c(unit3.team) && m4318j(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        return unit;
    }

    /* renamed from: am */
    public PointF m4339am() {
        Unit unit = null;
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m485a[i2];
            if (!unit2.dead && unit2.transportedBy == null && !unit2.mo1773u() && m3925c(unit2.team) && m4318j(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.fastUnitList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.dead && unit3.transportedBy == null && !unit3.mo1773u() && m3925c(unit3.team) && m4318j(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        if (unit != null) {
            return new PointF(unit.x, unit.y);
        }
        return null;
    }

    /* renamed from: a */
    public static Unit m4367a(Team team, float f, float f2, float f3) {
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.x + f3 > f && unit.x - f3 < f && unit.y + f3 > f2 && unit.y - f3 < f2 && unit.team != team && m4364a(unit, f, f2, f3) && unit.team.m3925c(team)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m4366a(Team team, float f, float f2, float f3, boolean z) {
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.x + f3 > f && unit.x - f3 < f && unit.y + f3 > f2 && unit.y - f3 < f2 && unit.team != team && m4364a(unit, f, f2, f3) && unit.team.m3913d(team) && (!z || unit.mo2975bH())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m4334b(Team team, float f, float f2, float f3) {
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.x + f3 > f && unit.x - f3 < f && unit.y + f3 > f2 && unit.y - f3 < f2 && unit.team != team && m4364a(unit, f, f2, f3) && unit.team.m3925c(team)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m4370a(AbstractC0153d abstractC0153d, float f, float f2, int i) {
        int i2 = 0;
        Iterator it = abstractC0153d.unitMix.iterator();
        while (it.hasNext()) {
            i2 += m4360a(((C0154e) it.next()).f635a, f, f2, i);
        }
        return i2;
    }

    /* renamed from: a */
    public int m4360a(UnitType unitType, float f, float f2, int i) {
        int i2 = 0;
        GameEngine gameEngine = GameEngine.getInstance();
        f605bF.clear();
        gameEngine.UnitGeoIndex.m2782a(this, f, f2, i, f605bF);
        Unit[] m485a = f605bF.m485a();
        int size = f605bF.size();
        for (int i3 = 0; i3 < size; i3++) {
            Unit unit = m485a[i3];
            if (unit.team == this && unit.unitType == unitType && m4364a(unit, f, f2, i)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: an */
    public int m4338an() {
        int i = 0;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            i++;
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.Team
    /* renamed from: N */
    public void mo3974N() {
        if (this.f558aW && m4338an() != 0) {
            GameEngine.PrintLOG("waking up AI");
            this.f558aW = false;
        }
    }

    @Override // com.corrodinggames.rts.game.Team
    /* renamed from: d */
    public void mo3912d(Unit unit) {
        if (!(unit instanceof OrderableUnit)) {
            return;
        }
        OrderableUnit orderableUnit = (OrderableUnit) unit;
        orderableUnit.f1531bv = false;
        if (orderableUnit.f3703av != null) {
            orderableUnit.f3703av.m4235a(orderableUnit);
            orderableUnit.f3703av = null;
        }
        if (orderableUnit.f3702au != null) {
            orderableUnit.f3702au.m4255b(orderableUnit);
            orderableUnit.f3702au = null;
        }
        m4325e(orderableUnit);
    }

    /* renamed from: a */
    public void m4352a(OrderableUnit orderableUnit, C0407b c0407b, boolean z) {
        if (orderableUnit.f3703av != null) {
            orderableUnit.f3703av.m4233a(orderableUnit, c0407b, z);
        }
    }

    /* renamed from: j */
    public boolean m4318j(Unit unit) {
        if (!unit.mo3181ce() && m3925c(unit.team)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4357a(C0407b c0407b, Unit unit) {
        return m4356a(c0407b, unit, false);
    }

    /* renamed from: a */
    public boolean m4356a(C0407b c0407b, Unit unit, boolean z) {
        return c0407b.mo3358b(unit);
    }

    /* renamed from: a */
    public void m4372a(AbstractC0144a abstractC0144a) {
        if (!this.zones.contains(abstractC0144a)) {
            this.zones.add(abstractC0144a);
        } else {
            log("Skipping add of component: " + abstractC0144a.mo4305a().name());
        }
    }
}