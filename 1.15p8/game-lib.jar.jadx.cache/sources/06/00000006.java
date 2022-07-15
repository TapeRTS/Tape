package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.C0173f;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.air.AbstractC0297b;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.LaserDefence;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.EnumC0334ad;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.custom.p018c.C0401c;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.land.AbstractC0507h;
import com.corrodinggames.rts.game.units.land.AbstractC0511j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.water.WaterUnit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.PhysicalObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.C0661a;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0942o;
import com.corrodinggames.rts.gameFramework.utility.C0950u;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ag.class */
public abstract class Unit extends PhysicalObject {

    /* renamed from: bj */
    public float f1525bj;

    /* renamed from: bo */
    public VariableScope f1526bo;

    /* renamed from: bp */
    public C0407b f1527bp;

    /* renamed from: bq */
    public C0407b f1528bq;

    /* renamed from: br */
    public int f1529br;

    /* renamed from: bu */
    public int f1530bu;

    /* renamed from: bv */
    public boolean f1531bv;

    /* renamed from: bD */
    public boolean f1517bD;

    /* renamed from: bJ */
    public Unit f1518bJ;

    /* renamed from: bK */
    public float f1519bK;

    /* renamed from: bO */
    public Team team;

    /* renamed from: bP */
    public boolean f1521bP;

    /* renamed from: bX */
    public float direction;

    /* renamed from: bY */
    public float f1523bY;

    /* renamed from: bZ */
    public boolean f1524bZ;

    /* renamed from: ca */
    public float radius;

    /* renamed from: cb */
    public float displayRadius;

    /* renamed from: cc */
    public float f1541cc;

    /* renamed from: cl */
    public float hp;

    /* renamed from: cm */
    public float maxHp;

    /* renamed from: cn */
    public float f1544cn;

    /* renamed from: co */
    public float shield;

    /* renamed from: cp */
    public float f1546cp;

    /* renamed from: cq */
    public float f1547cq;

    /* renamed from: cr */
    public float maxShield;

    /* renamed from: cs */
    public float f1549cs;

    /* renamed from: ct */
    public float f1550ct;

    /* renamed from: cu */
    public float f1551cu;

    /* renamed from: cv */
    public int f1552cv;

    /* renamed from: cw */
    public int f1553cw;

    /* renamed from: cx */
    public boolean selected;

    /* renamed from: cz */
    public boolean f1555cz;

    /* renamed from: cC */
    public C0235aj[] f1532cC;

    /* renamed from: cD */
    public boolean f1533cD;

    /* renamed from: cI */
    public boolean f1534cI;

    /* renamed from: cJ */
    public int f1535cJ;

    /* renamed from: cK */
    public int f1536cK;

    /* renamed from: cL */
    public int f1537cL;

    /* renamed from: cM */
    public float f1538cM;

    /* renamed from: df */
    public float f1556df;

    /* renamed from: dg */
    public float f1557dg;

    /* renamed from: dq */
    public UnitType unitType;

    /* renamed from: dw */
    C0233ah[] f1559dw;

    /* renamed from: bw */
    public static final C0950u fastUnitList = new C0950u();

    /* renamed from: a */
    private static final C0942o fastLiveUnitList = new C0942o();

    /* renamed from: bx */
    public static HashMap f1562bx = new HashMap();

    /* renamed from: by */
    public static HashMap f1563by = new HashMap();

    /* renamed from: bz */
    public static HashMap f1564bz = new HashMap();

    /* renamed from: bA */
    public static final Paint f1565bA = new UniquePaint();

    /* renamed from: bB */
    public static final Paint f1566bB = new UniquePaint();

    /* renamed from: bC */
    static final LightingColorFilter f1567bC = new LightingColorFilter(Color.m4733a(255, 255, 255), Color.m4733a(100, 100, 100));

    /* renamed from: cN */
    public static final Paint f1568cN = new Paint();

    /* renamed from: cO */
    public static final Paint f1569cO = new UniquePaint();

    /* renamed from: cP */
    public static final Paint f1570cP = new UniquePaint();

    /* renamed from: cQ */
    public static final Paint f1571cQ = new UniquePaint();

    /* renamed from: cR */
    public static final Paint f1572cR = new UniquePaint();

    /* renamed from: cS */
    public static final Paint f1573cS = new UniquePaint();

    /* renamed from: cT */
    public static final Paint f1574cT = new UniquePaint();

    /* renamed from: cU */
    public static final Paint f1575cU = new Paint();

    /* renamed from: cV */
    public static final Paint f1576cV = new Paint();

    /* renamed from: cW */
    public static final Paint f1577cW = new Paint();

    /* renamed from: cX */
    public static final Paint f1578cX = new UniquePaint();

    /* renamed from: cY */
    public static final Paint f1579cY = new UniquePaint();

    /* renamed from: cZ */
    public static final Paint f1580cZ = new UniquePaint();

    /* renamed from: da */
    public static final Paint f1581da = new UniquePaint();

    /* renamed from: db */
    public static final Paint f1582db = new Paint();

    /* renamed from: di */
    static final RectF f1583di = new RectF();

    /* renamed from: dj */
    static Paint f1584dj = new Paint();

    /* renamed from: dk */
    static Paint f1585dk = new Paint();

    /* renamed from: dl */
    public static final RectF f1586dl = new RectF();

    /* renamed from: dm */
    public static final Rect f1587dm = new Rect();

    /* renamed from: dn */
    static final Rect f1588dn = new Rect();

    /* renamed from: do */
    static final ArrayList f1589do = new ArrayList();

    /* renamed from: dp */
    static ArrayList f1590dp = new ArrayList();

    /* renamed from: dr */
    static final RectF f1591dr = new RectF();

    /* renamed from: ds */
    static final RectF f1592ds = new RectF();

    /* renamed from: dt */
    static final Rect f1593dt = new Rect();

    /* renamed from: du */
    static final PointF f1594du = new PointF();

    /* renamed from: dv */
    static final PointF f1595dv = new PointF();

    /* renamed from: dx */
    static final PointF f1596dx = new PointF();

    /* renamed from: bk */
    public int f1597bk = -9999;

    /* renamed from: bl */
    public Unit f1598bl = null;

    /* renamed from: bm */
    public Unit f1599bm = null;

    /* renamed from: bn */
    public Unit f1600bn = null;

    /* renamed from: bs */
    public int f1601bs = -9999;

    /* renamed from: bt */
    public int f1602bt = -9999;

    /* renamed from: bE */
    public boolean f1603bE = false;

    /* renamed from: bF */
    public boolean f1604bF = false;

    /* renamed from: bG */
    public boolean f1605bG = false;

    /* renamed from: bH */
    public boolean f1606bH = false;

    /* renamed from: bI */
    public Unit f1607bI = null;

    /* renamed from: bL */
    public boolean collidable = true;

    /* renamed from: bM */
    public boolean dead = false;

    /* renamed from: bN */
    public long f1610bN = 0;

    /* renamed from: bQ */
    public float f1611bQ = 0.0f;

    /* renamed from: bR */
    public float f1612bR = 0.0f;

    /* renamed from: bS */
    public boolean f1613bS = false;

    /* renamed from: bT */
    public float f1614bT = 0.0f;

    /* renamed from: bU */
    public float f1615bU = 0.0f;

    /* renamed from: bV */
    public float f1616bV = 0.0f;

    /* renamed from: bW */
    public float speed = 0.0f;

    /* renamed from: cd */
    public float built = 1.0f;

    /* renamed from: ce */
    public float f1619ce = 1.0f;

    /* renamed from: cf */
    public boolean f1620cf = false;

    /* renamed from: cg */
    public boolean f1621cg = false;

    /* renamed from: ch */
    public boolean f1622ch = false;

    /* renamed from: ci */
    public boolean f1623ci = false;

    /* renamed from: cj */
    public boolean f1624cj = false;

    /* renamed from: ck */
    public boolean f1625ck = false;

    /* renamed from: cy */
    public int f1626cy = -9999;

    /* renamed from: cA */
    public float f1627cA = 0.0f;

    /* renamed from: cB */
    public boolean moving = true;

    /* renamed from: cE */
    public Unit transportedBy = null;

    /* renamed from: cF */
    public OrderableUnit f1630cF = null;

    /* renamed from: cG */
    public C0383i f1631cG = null;

    /* renamed from: cH */
    public int f1632cH = -9999;

    /* renamed from: dc */
    public int f1633dc = -1;

    /* renamed from: dd */
    public int f1634dd = -1;

    /* renamed from: de */
    public int f1635de = -99;

    /* renamed from: dh */
    public float f1636dh = 70.0f;

    /* renamed from: dy */
    final C0421e f1637dy = new C0421e();

    /* renamed from: dz */
    public C0401c f1638dz = new C0401c();

    /* renamed from: dA */
    C0407b f1639dA = null;

    /* renamed from: h */
    public abstract MovementType getMovementType();

    /* renamed from: i */
    public abstract boolean mo2676i();

    /* renamed from: P */
    public abstract boolean isUnderwater();

    /* renamed from: ai */
    public abstract boolean mo2561ai();

    /* renamed from: aj */
    public abstract boolean mo2560aj();

    /* renamed from: p_ */
    public abstract boolean isOnScreen();

    /* renamed from: r */
    public abstract UnitType getUnitType();

    /* renamed from: l */
    public abstract boolean canAttack();

    @Override // com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f1603bE);
        outputNetStream.mo1260a(this.f1607bI);
        outputNetStream.mo1260a(this.f1518bJ);
        outputNetStream.writeFloat(this.f1519bK);
        outputNetStream.writeBoolean(this.collidable);
        outputNetStream.writeBoolean(this.dead);
        outputNetStream.writeLong(this.f1610bN);
        outputNetStream.mo1312a(this.team);
        outputNetStream.writeFloat(this.f1611bQ);
        outputNetStream.writeFloat(this.f1612bR);
        outputNetStream.writeFloat(this.f1614bT);
        outputNetStream.writeFloat(this.f1615bU);
        outputNetStream.writeFloat(this.speed);
        outputNetStream.writeFloat(this.direction);
        outputNetStream.writeFloat(this.radius);
        outputNetStream.writeFloat(this.displayRadius);
        outputNetStream.writeFloat(this.f1541cc);
        outputNetStream.writeFloat(this.built);
        outputNetStream.writeBoolean(this.f1621cg);
        outputNetStream.writeBoolean(this.f1624cj);
        outputNetStream.writeFloat(this.hp);
        outputNetStream.writeFloat(this.maxHp);
        outputNetStream.writeBoolean(this.moving);
        outputNetStream.writeFloat(this.f1532cC[0].f1652a);
        outputNetStream.writeFloat(this.f1532cC[0].f1655d);
        outputNetStream.mo1260a(this.transportedBy);
        outputNetStream.writeByte(25);
        outputNetStream.writeInt(this.f1537cL);
        outputNetStream.writeFloat(this.f1538cM);
        outputNetStream.writeFloat(this.f1616bV);
        outputNetStream.writeFloat(this.f1523bY);
        int mo2512bk = mo2512bk();
        outputNetStream.writeInt(mo2512bk);
        for (int i = 0; i < mo2512bk; i++) {
            C0235aj c0235aj = this.f1532cC[i];
            outputNetStream.writeFloat(c0235aj.f1652a);
            outputNetStream.writeFloat(c0235aj.f1654c);
            outputNetStream.writeFloat(c0235aj.f1655d);
            outputNetStream.writeFloat(c0235aj.f1656e);
            outputNetStream.writeFloat(c0235aj.f1657f);
            outputNetStream.writeFloat(c0235aj.f1659h);
            outputNetStream.writeFloat(c0235aj.f1660i);
            Unit unit = c0235aj.f1661j;
            if (unit != null && unit.dead) {
                unit = null;
            }
            outputNetStream.mo1260a(unit);
            outputNetStream.writeBoolean(this.f1533cD);
        }
        outputNetStream.writeInt(this.f1597bk);
        outputNetStream.writeFloat(this.shield);
        outputNetStream.writeFloat(this.f1546cp);
        outputNetStream.writeFloat(this.f1547cq);
        outputNetStream.writeFloat(this.maxShield);
        outputNetStream.writeBoolean(this.f1622ch);
        outputNetStream.writeBoolean(this.f1623ci);
        outputNetStream.writeBoolean(this.f1625ck);
        outputNetStream.writeBoolean(this.f1604bF);
        outputNetStream.writeFloat(this.f1549cs);
        outputNetStream.writeBoolean(this.f1524bZ);
        outputNetStream.writeBoolean(this.f1559dw != null);
        if (this.f1559dw != null) {
            outputNetStream.writeInt(this.f1559dw.length);
            for (int i2 = 0; i2 < this.f1559dw.length; i2++) {
                C0233ah c0233ah = this.f1559dw[i2];
                outputNetStream.writeBoolean(c0233ah.f1640a);
                outputNetStream.writeInt(c0233ah.f1641b);
            }
        }
        outputNetStream.writeFloat(this.f1544cn);
        outputNetStream.mo1300b(this.f1598bl);
        outputNetStream.writeInt(this.f1552cv);
        outputNetStream.writeInt(this.f1553cw);
        outputNetStream.writeInt(this.f1529br);
        outputNetStream.writeInt(this.f1601bs);
        outputNetStream.writeInt(this.f1602bt);
        outputNetStream.writeInt(this.f1530bu);
        outputNetStream.writeBoolean(this.f1605bG);
        outputNetStream.writeBoolean(this.f1606bH);
        this.f1637dy.m3300a(outputNetStream);
        this.f1638dz.m3410a(outputNetStream);
        outputNetStream.mo1300b((Unit) this.f1630cF);
        short s = -1;
        if (this.f1630cF != null && this.f1631cG != null) {
            s = this.f1631cG.m3463a();
        }
        outputNetStream.mo1257a(s);
        outputNetStream.writeInt(this.f1632cH);
        VariableScope.writeOutUnitOrPlaceholder(outputNetStream, this.f1599bm);
        VariableScope.writeOutUnitOrPlaceholder(outputNetStream, this.f1600bn);
        VariableScope.writeOut(outputNetStream, this.f1526bo);
        C0407b.m3391a(outputNetStream, this.f1527bp);
        C0407b.m3391a(outputNetStream, this.f1528bq);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        C0383i mo2599a;
        this.f1603bE = inputNetStream.readBoolean();
        this.f1607bI = inputNetStream.m1219o();
        this.f1518bJ = inputNetStream.m1219o();
        this.f1519bK = inputNetStream.readFloat();
        this.collidable = inputNetStream.readBoolean();
        this.dead = inputNetStream.readBoolean();
        this.f1610bN = inputNetStream.readLong();
        mo2537b(inputNetStream.m1216r());
        this.f1611bQ = inputNetStream.readFloat();
        this.f1612bR = inputNetStream.readFloat();
        this.f1614bT = inputNetStream.readFloat();
        this.f1615bU = inputNetStream.readFloat();
        this.speed = inputNetStream.readFloat();
        this.direction = inputNetStream.readFloat();
        inputNetStream.readFloat();
        inputNetStream.readFloat();
        this.f1541cc = inputNetStream.readFloat();
        this.built = inputNetStream.readFloat();
        this.f1621cg = inputNetStream.readBoolean();
        this.f1624cj = inputNetStream.readBoolean();
        m3730o(inputNetStream.readFloat());
        this.maxHp = inputNetStream.readFloat();
        this.moving = inputNetStream.readBoolean();
        this.f1532cC[0].f1652a = inputNetStream.readFloat();
        this.f1532cC[0].f1655d = inputNetStream.readFloat();
        this.transportedBy = inputNetStream.m1219o();
        byte readByte = inputNetStream.readByte();
        if (readByte >= 1) {
            this.f1537cL = inputNetStream.readInt();
            this.f1538cM = inputNetStream.readFloat();
        }
        if (readByte >= 2) {
            this.f1616bV = inputNetStream.readFloat();
            this.f1523bY = inputNetStream.readFloat();
            int readInt = inputNetStream.readInt();
            m3787N(readInt);
            for (int i = 0; i < readInt; i++) {
                C0235aj c0235aj = this.f1532cC[i];
                c0235aj.f1652a = inputNetStream.readFloat();
                c0235aj.f1654c = inputNetStream.readFloat();
                c0235aj.f1655d = inputNetStream.readFloat();
                c0235aj.f1656e = inputNetStream.readFloat();
                c0235aj.f1657f = inputNetStream.readFloat();
                if (readByte >= 8) {
                    c0235aj.f1659h = inputNetStream.readFloat();
                    c0235aj.f1660i = inputNetStream.readFloat();
                    c0235aj.f1661j = inputNetStream.m1219o();
                }
                if (readByte >= 12) {
                    this.f1533cD = inputNetStream.readBoolean();
                }
            }
        }
        if (readByte >= 3) {
            this.f1597bk = inputNetStream.readInt();
        }
        if (readByte >= 4) {
            this.shield = inputNetStream.readFloat();
            this.f1546cp = inputNetStream.readFloat();
            this.f1547cq = inputNetStream.readFloat();
            this.maxShield = inputNetStream.readFloat();
        }
        if (readByte >= 5) {
            this.f1622ch = inputNetStream.readBoolean();
            this.f1623ci = inputNetStream.readBoolean();
        }
        if (readByte >= 6) {
            this.f1625ck = inputNetStream.readBoolean();
        }
        if (readByte >= 7) {
            this.f1604bF = inputNetStream.readBoolean();
        }
        if (readByte >= 9) {
            this.f1549cs = inputNetStream.readFloat();
        }
        if (readByte >= 10) {
            this.f1524bZ = inputNetStream.readBoolean();
        }
        if (readByte >= 11 && inputNetStream.readBoolean()) {
            this.f1559dw = new C0233ah[inputNetStream.readInt()];
            for (int i2 = 0; i2 < this.f1559dw.length; i2++) {
                this.f1559dw[i2] = new C0233ah();
                C0233ah c0233ah = this.f1559dw[i2];
                c0233ah.f1640a = inputNetStream.readBoolean();
                c0233ah.f1641b = inputNetStream.readInt();
            }
        }
        if (readByte >= 13) {
            this.f1544cn = inputNetStream.readFloat();
        }
        if (readByte >= 14) {
            this.f1598bl = inputNetStream.m1219o();
        }
        if (readByte >= 15) {
            this.f1552cv = inputNetStream.readInt();
            this.f1553cw = inputNetStream.readInt();
        }
        if (readByte >= 16) {
            this.f1529br = inputNetStream.readInt();
            this.f1601bs = inputNetStream.readInt();
            this.f1602bt = inputNetStream.readInt();
        }
        if (readByte >= 17) {
            this.f1530bu = inputNetStream.readInt();
        }
        if (readByte >= 18) {
            this.f1605bG = inputNetStream.readBoolean();
            this.f1606bH = inputNetStream.readBoolean();
        }
        if (readByte >= 19) {
            this.f1637dy.m3299a(inputNetStream);
            this.f1638dz.m3414a(this, inputNetStream);
        }
        if (readByte >= 20) {
            OrderableUnit m1218p = inputNetStream.m1218p();
            short m1212v = inputNetStream.m1212v();
            if (m1212v != -1) {
                boolean z = false;
                if (m1218p != null && (this instanceof OrderableUnit) && (mo2599a = m1218p.mo2599a(m1212v)) != null && m1218p.mo2607a((OrderableUnit) this, mo2599a)) {
                    z = true;
                }
                if (!z) {
                    m3744ch();
                }
            }
        }
        if (readByte >= 21) {
            this.f1632cH = inputNetStream.readInt();
        }
        if (readByte >= 22) {
            if (readByte < 24) {
                throw new IOException("extension >=22 but <24");
            }
            this.f1599bm = VariableScope.readInUnitOrPlaceholder(inputNetStream);
            this.f1600bn = VariableScope.readInUnitOrPlaceholder(inputNetStream);
        }
        if (readByte >= 23) {
            this.f1526bo = VariableScope.readIn(inputNetStream);
        }
        if (readByte >= 25) {
            this.f1527bp = C0407b.m3390a(inputNetStream);
            this.f1528bq = C0407b.m3390a(inputNetStream);
        }
        if (this.dead) {
            GameEngine gameEngine = GameEngine.getInstance();
            fastUnitList.remove(this);
            gameEngine.UnitGeoIndex.m2781a(this);
        }
        super.mo427a(inputNetStream);
    }

    /* renamed from: a */
    public static BitmapOrTexture m3773a(BitmapOrTexture bitmapOrTexture) {
        return m3772a(bitmapOrTexture, bitmapOrTexture.getWidth(), bitmapOrTexture.getHeight());
    }

    /* renamed from: a */
    public static BitmapOrTexture m3772a(BitmapOrTexture bitmapOrTexture, int width, int height) {
        BitmapOrTexture mo61a = bitmapOrTexture.mo61a(width, height, false);
        bitmapOrTexture.mo43w();
        mo61a.mo52i();
        int width2 = mo61a.getWidth();
        int height2 = mo61a.getHeight();
        for (int i = 0; i < width2; i++) {
            for (int i2 = 0; i2 < height2; i2++) {
                mo61a.mo62a(i, i2, Color.argb(Color.m4734a(bitmapOrTexture.mo63a(i, i2)), 0, 0, 0));
            }
        }
        mo61a.mo48o();
        mo61a.mo45r();
        bitmapOrTexture.mo42x();
        mo61a.m1016a("shadow:" + bitmapOrTexture.mo64a());
        return mo61a;
    }

    static {
        f1565bA.mo935a(true);
        f1565bA.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        f1566bB.mo935a(true);
        f1566bB.m4717a(255, 255, 255, 255);
        f1566bB.m4715a(f1567bC);
        f1568cN.setStyle(Paint.Style.f217b);
        f1568cN.setStrokeWidth(2.0f);
        m3783a(f1568cN);
        f1569cO.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1569cO.setStyle(Paint.Style.f217b);
        f1569cO.setStrokeWidth(2.0f);
        m3782a(f1569cO, true);
        f1570cP.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1570cP.setStyle(Paint.Style.f217b);
        f1570cP.setStrokeWidth(2.0f);
        m3783a(f1570cP);
        f1571cQ.m4717a(130, 0, 255, 0);
        f1571cQ.setStyle(Paint.Style.f217b);
        f1571cQ.setStrokeWidth(2.0f);
        m3783a(f1571cQ);
        f1575cU.m4717a(70, 0, 255, 0);
        f1575cU.setStyle(Paint.Style.f217b);
        f1575cU.setStrokeWidth(1.0f);
        m3783a(f1575cU);
        f1572cR.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        f1572cR.setStyle(Paint.Style.f217b);
        f1572cR.setStrokeWidth(2.0f);
        m3783a(f1572cR);
        f1576cV.m4717a(70, 255, 0, 0);
        f1576cV.setStyle(Paint.Style.f217b);
        f1576cV.setStrokeWidth(1.0f);
        m3783a(f1576cV);
        f1574cT.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        f1574cT.setStyle(Paint.Style.f217b);
        f1574cT.setStrokeWidth(2.0f);
        m3783a(f1574cT);
        f1577cW.m4717a(70, 255, 255, 0);
        f1577cW.setStyle(Paint.Style.f217b);
        f1577cW.setStrokeWidth(1.0f);
        m3783a(f1577cW);
        f1573cS.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        f1573cS.setStyle(Paint.Style.f217b);
        f1573cS.setStrokeWidth(2.0f);
        m3783a(f1573cS);
        f1578cX.m4717a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1578cX.setStyle(Paint.Style.f217b);
        f1578cX.setStrokeWidth(1.0f);
        m3783a(f1578cX);
        f1579cY.m4717a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1579cY.setStyle(Paint.Style.f217b);
        f1579cY.setStrokeWidth(2.0f);
        m3783a(f1579cY);
        f1580cZ.m4717a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        f1580cZ.setStyle(Paint.Style.f217b);
        f1580cZ.setStrokeWidth(1.0f);
        m3783a(f1580cZ);
        f1581da.setStyle(Paint.Style.f217b);
        f1582db.setStyle(Paint.Style.f217b);
    }

    /* renamed from: bE */
    public static C0942o m3767bE() {
        fastLiveUnitList.m511a();
        return fastLiveUnitList;
    }

    /* renamed from: bF */
    public static void m3766bF() {
        fastLiveUnitList.m511a();
    }

    /* renamed from: bG */
    public static void loadAllUnits() {
        AbstractC0511j.m2815do();
        Building.m2972do();
        AbstractC0507h.m2835K();
        WaterUnit.load();
        AbstractC0297b.m3664K();
        if (GameEngine.getInstance().m863ao()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                ((UnitType) it.next()).load();
            }
        } else {
            Builder.m2855K();
            LaserDefence.load();
            Repairbay.load();
            Tree.load();
        }
        UnitType.m3702t();
    }

    /* renamed from: bH */
    public boolean mo2975bH() {
        return false;
    }

    /* renamed from: bI */
    public boolean mo2879bI() {
        return false;
    }

    /* renamed from: bJ */
    public static HashMap m3764bJ() {
        HashMap hashMap = new HashMap();
        if (GameEngine.getInstance().m863ao()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                UnitType unitType = (UnitType) it.next();
                Unit createInstance = unitType.createInstance(true);
                createInstance.remove();
                createInstance.mo2537b(Team.f1346g);
                createInstance.f1621cg = true;
                hashMap.put(unitType, createInstance);
            }
        }
        Iterator it2 = CustomUnitMetadata.instances.iterator();
        while (it2.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it2.next();
            Unit m3110a = customUnitMetadata.m3110a(true);
            m3110a.remove();
            m3110a.mo2537b(Team.f1346g);
            m3110a.f1621cg = true;
            hashMap.put(customUnitMetadata, m3110a);
        }
        return hashMap;
    }

    /* renamed from: bK */
    public static void m3763bK() {
        f1563by = m3764bJ();
        f1564bz = m3764bJ();
        f1562bx = m3764bJ();
    }

    /* renamed from: a */
    public static Unit m3777a(UnitType unitType) {
        return (Unit) f1562bx.get(unitType);
    }

    /* renamed from: b */
    public static Unit m3768b(UnitType unitType) {
        return m3756c(unitType);
    }

    /* renamed from: c */
    public static Unit m3756c(UnitType unitType) {
        Unit unit = (Unit) f1563by.get(unitType);
        if (unit == null) {
            if (CustomUnitMetadata.frontCustomUnitMetadata == null) {
                GameEngine.PrintLOG("Could not find:" + unitType.mo3087i() + " and missing place holder is null");
                return null;
            }
            unit = (Unit) f1563by.get(CustomUnitMetadata.frontCustomUnitMetadata);
            if (unit == null) {
                GameEngine.PrintLOG("name: " + CustomUnitMetadata.frontCustomUnitMetadata.core_name);
                GameEngine.PrintLOG("contains:" + f1563by.containsKey(CustomUnitMetadata.frontCustomUnitMetadata));
                Iterator it = f1563by.keySet().iterator();
                while (it.hasNext()) {
                    GameEngine.PrintLOG("has:" + ((UnitType) it.next()).mo3087i());
                }
                GameEngine.PrintLOG("Could not find:" + unitType.mo3087i() + " and missing place holder could not be found");
            }
        }
        return unit;
    }

    /* renamed from: d */
    public static Unit m3738d(UnitType unitType) {
        Unit unit = (Unit) f1564bz.get(unitType);
        if (unit == null) {
            unit = (Unit) f1564bz.get(CustomUnitMetadata.frontCustomUnitMetadata);
        }
        return unit;
    }

    /* renamed from: bL */
    public static int m3762bL() {
        int i = 0;
        if (GameEngine.getInstance().m863ao()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + m3777a((UnitType) it.next()).mo2501bv();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Unit(boolean z) {
        super(z);
        this.f1529br = -9999;
        m3760bQ();
        if (!z) {
            this.f1517bD = true;
            fastUnitList.m481a(this);
            fastLiveUnitList.m507a(this);
        }
        this.f1529br = GameEngine.getInstance().f5845by;
        this.unitType = getUnitType();
    }

    @Override // com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        Team.m3960a(this);
        if (this.f1517bD) {
            fastUnitList.remove(this);
            fastLiveUnitList.remove(this);
        }
        GameEngine.getInstance().interfaceEngine.unselectUnit(this);
        super.remove();
    }

    /* renamed from: bM */
    public float getMass() {
        return 3000.0f;
    }

    /* renamed from: s */
    public int mo3143s(Unit unit) {
        return 0;
    }

    /* renamed from: bN */
    public boolean mo3198bN() {
        return false;
    }

    /* renamed from: bO */
    public boolean mo3197bO() {
        return false;
    }

    /* renamed from: bP */
    public float m3761bP() {
        return -1.0f;
    }

    /* renamed from: o */
    public void m3730o(float f) {
        this.hp = f;
    }

    /* renamed from: bQ */
    public void m3760bQ() {
        m3787N(1);
    }

    /* renamed from: N */
    public void m3787N(int i) {
        int i2;
        int mo2512bk = mo2512bk();
        if (mo2512bk < i) {
            mo2512bk = i;
        }
        if (this.f1532cC == null) {
            i2 = 0;
            this.f1532cC = new C0235aj[mo2512bk];
        } else if (this.f1532cC.length < mo2512bk) {
            i2 = this.f1532cC.length;
            this.f1532cC = (C0235aj[]) Arrays.copyOf(this.f1532cC, mo2512bk);
        } else {
            return;
        }
        for (int i3 = i2; i3 < this.f1532cC.length; i3++) {
            this.f1532cC[i3] = new C0235aj();
        }
    }

    /* renamed from: a */
    public static void m3783a(Paint paint) {
        m3782a(paint, false);
    }

    /* renamed from: a */
    public static void m3782a(Paint paint, boolean z) {
        if (!GameEngine.isPC() && z) {
            paint.setStrokeWidth(0.0f);
        }
    }

    /* renamed from: d */
    public float mo2836d(boolean z) {
        return this.direction + 90.0f;
    }

    /* renamed from: bR */
    public final boolean isActive() {
        return this.transportedBy == null && this.built >= 1.0f;
    }

    /* renamed from: a_ */
    public float getHpBar() {
        if (this.hp < this.maxHp) {
            return this.hp / this.maxHp;
        }
        return -1.0f;
    }

    /* renamed from: bS */
    public boolean mo3196bS() {
        return true;
    }

    /* renamed from: bT */
    public float getSecBar() {
        if (this.built < 1.0f) {
            if (this.f1630cF == null || this.f1630cF.built >= 1.0f) {
                return this.built;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    /* renamed from: bU */
    public float mo2813bU() {
        return -1.0f;
    }

    /* renamed from: bV */
    public boolean mo2812bV() {
        return false;
    }

    /* renamed from: bW */
    public int getBlockBar() {
        return -1;
    }

    /* renamed from: bX */
    public int getBlockBarMax() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.dead) {
            Unit radius = this.transportedBy;
            if (radius != null) {
                return;
            }
            GameEngine gameEngine = GameEngine.getInstance();
            float f3 = this.radius;
            if (z) {
                return;
            }
            boolean z2 = false;
            int blockBar = getBlockBar();
            if (getSecBar() >= 0.0f) {
                z2 = true;
            }
            if (mo2813bU() >= 0.0f) {
                z2 = true;
            }
            if (this.selected || gameEngine.curSettings.showHp) {
                if (getHpBar() >= 0.0f) {
                    z2 = true;
                }
                if (blockBar >= 0) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            float game = this.x - gameEngine.viewpointX_rounded;
            float f4 = (this.y - gameEngine.viewpointY_rounded) - this.height;
            float blockbar = f3 + 4.0f;
            int i5 = 4;
            float f5 = 2.0f * f3;
            if (this.f1620cf) {
                f2 = 1.0f;
            } else {
                f2 = gameEngine.viewpointZoom;
            }
            if (f2 < 1.0f) {
                gameEngine.graphics.mo135j();
                gameEngine.m915O();
                game *= gameEngine.viewpointZoom;
                f4 *= gameEngine.viewpointZoom;
                blockbar *= gameEngine.viewpointZoom;
            }
            float f6 = 3.0f;
            if (this.selected || gameEngine.curSettings.showHp) {
                if (getHpBar() >= 0.0f) {
                    boolean z3 = false;
                    boolean z4 = false;
                    C0383i m3735dj = m3735dj();
                    if (m3735dj != null) {
                        z3 = m3735dj.f2315p;
                        z4 = m3735dj.f2316q;
                    }
                    if (!z4) {
                        if (gameEngine.playerTeam.m3925c(this.team)) {
                            i4 = CommonUtils.m1686b(200, 183, 44, 44);
                            i3 = CommonUtils.m1686b(120, 255, 60, 60);
                        } else {
                            i4 = CommonUtils.m1686b(200, 0, 150, 0);
                            i3 = CommonUtils.m1686b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                        }
                        Paint m460a = C0955y.m460a(i4, Paint.Style.f216a);
                        Paint m460a2 = C0955y.m460a(i3, Paint.Style.f217b);
                        int i6 = 4;
                        if (z3) {
                            i6 = 1;
                        }
                        f1583di.m4652a(game - f3, f4 + blockbar, (game - f3) + (f5 * getHpBar()), f4 + blockbar + i6);
                        gameEngine.graphics.mo201a(f1583di, m460a);
                        f1583di.m4652a(game - f3, f4 + blockbar, (game - f3) + f5, f4 + blockbar + i6);
                        gameEngine.graphics.mo201a(f1583di, m460a2);
                        if (this.f1550ct != 0.0f && mo3196bS() && gameEngine.curSettings.showHpChanges) {
                            float hpBar = getHpBar();
                            float f7 = hpBar + ((-this.f1550ct) / this.maxHp);
                            if (f7 < 0.0f) {
                                f7 = 0.0f;
                            }
                            if (f7 >= 1.0f) {
                                f7 = 1.0f;
                            }
                            Paint m460a3 = C0955y.m460a(CommonUtils.m1686b(100, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 208, 26), Paint.Style.f216a);
                            f1583di.m4652a((game - f3) + (f5 * hpBar), f4 + blockbar, (game - f3) + (f5 * f7), f4 + blockbar + i6);
                            gameEngine.graphics.mo201a(f1583di, m460a3);
                        }
                    }
                }
                if (blockBar >= 0) {
                    int blockBarMax = getBlockBarMax();
                    float f8 = f5;
                    if (blockBarMax > 10) {
                        f8 += 20.0f;
                    }
                    float f9 = game - (f8 / 2.0f);
                    float f10 = (int) ((f8 / blockBarMax) + 0.5f);
                    float f11 = f10 - 2.0f;
                    for (int i7 = 1; i7 <= blockBarMax; i7++) {
                        float f12 = f9 + ((i7 - 1) * f10);
                        f1583di.m4652a(f12, f4 + blockbar + 3.0f, f12 + f11, f4 + blockbar + 3.0f + 3.0f);
                        if (blockBar >= i7) {
                            gameEngine.graphics.mo201a(f1583di, C0955y.m461a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.f216a));
                        }
                        gameEngine.graphics.mo201a(f1583di, C0955y.m461a(110, 0, 0, 210, Paint.Style.f217b));
                    }
                    f6 = 3.0f + 5.0f;
                }
            }
            if (mo2813bU() >= 0.0f) {
                int i8 = 2 + 1;
                boolean mo2812bV = mo2812bV();
                f1583di.m4652a(game - f3, f4 + blockbar + i8 + f6, (game - f3) + (f5 * mo2813bU()), f4 + blockbar + i8 + 2 + f6);
                if (mo2812bV) {
                    i = CommonUtils.m1686b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
                } else {
                    i = CommonUtils.m1686b(200, 23, 179, 207);
                }
                gameEngine.graphics.mo201a(f1583di, C0955y.m460a(i, Paint.Style.f216a));
                f1583di.m4652a(game - f3, f4 + blockbar + i8 + f6, (game - f3) + f5, f4 + blockbar + i8 + 2 + f6);
                if (mo2812bV) {
                    i2 = CommonUtils.m1686b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
                } else {
                    i2 = CommonUtils.m1686b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
                }
                gameEngine.graphics.mo201a(f1583di, C0955y.m460a(i2, Paint.Style.f217b));
                f6 += 2;
                i5 = 4;
            }
            if (getSecBar() >= 0.0f) {
                int i9 = i5 + 1;
                float goingToDraw = blockbar;
                f1583di.m4652a(game - f3, f4 + blockbar + i9 + f6, (game - f3) + (f5 * getSecBar()), f4 + goingToDraw + i9 + i5 + f6);
                gameEngine.graphics.mo201a(f1583di, C0955y.m461a(200, 0, 0, 150, Paint.Style.f216a));
                f1583di.m4652a(game - f3, f4 + blockbar + i9 + f6, (game - f3) + f5, f4 + blockbar + i9 + i5 + f6);
                gameEngine.graphics.mo201a(f1583di, C0955y.m461a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.f217b));
                float f13 = f6 + i5;
            }
            if (f2 < 1.0f) {
                gameEngine.graphics.mo134k();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: d */
    public void mo423d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: p */
    public void mo418p(float f) {
        if (this.dead) {
            return;
        }
        Unit game = this.transportedBy;
        if (game == null && this.selected) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (this.team == gameEngine.playerTeam || gameEngine.interfaceEngine.m1832m(this)) {
                if (gameEngine.curSettings.showUnitWaypoints && gameEngine.f5897dw <= 40) {
                    gameEngine.f5897dw++;
                    mo2755N();
                }
                mo2948bY();
            }
            if (C0955y.m458a(this)) {
                mo2985bZ();
            }
        }
    }

    /* renamed from: bY */
    public void mo2948bY() {
    }

    /* renamed from: N */
    public void mo2755N() {
        GameEngine gameEngine = GameEngine.getInstance();
        Waypoint waypoint = null;
        Waypoint waypoint2 = null;
        if (this instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) this;
            int m2549au = orderableUnit.m2549au();
            float f = this.x;
            float f2 = this.y;
            for (int i = 0; i < m2549au; i++) {
                Waypoint m2462k = orderableUnit.m2462k(i);
                if (m2462k != null) {
                    if (GameEngine.isPC()) {
                        f1584dj.setStrokeWidth(2.0f);
                    } else {
                        f1584dj.setStrokeWidth(0.0f);
                    }
                    if (m2462k.getType() == WaypointType.f1752b) {
                        f1584dj.setColor(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (m2462k.getType() == WaypointType.f1758h) {
                        f1584dj.setColor(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (m2462k.getType() == WaypointType.f1753c) {
                        f1584dj.setColor(Color.argb(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2462k.getType() == WaypointType.f1754d) {
                        f1584dj.setColor(Color.argb(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2462k.getType() == WaypointType.f1755e || m2462k.getType() == WaypointType.f1759i) {
                        f1584dj.setColor(Color.argb(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2462k.getType() == WaypointType.f1757g) {
                        f1584dj.setColor(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (m2462k.getType() == WaypointType.f1761k || m2462k.getType() == WaypointType.f1762l) {
                        f1584dj.setColor(Color.argb(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (m2462k.getType() == WaypointType.f1760j) {
                        f1584dj.setColor(Color.argb(160, 0, 210, 210));
                        if (waypoint == null) {
                            waypoint = m2462k;
                        } else {
                            waypoint2 = m2462k;
                        }
                    } else {
                        f1584dj.setColor(Color.argb(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float realX = m2462k.getRealX();
                    float realY = m2462k.getRealY();
                    Unit m3670i = m2462k.m3670i();
                    if (m3670i != null && m2462k.m3676f() && !m3670i.mo2975bH() && !m3670i.m3739d(gameEngine.playerTeam)) {
                        float m1659d = CommonUtils.m1659d(f, f2, realX, realY);
                        realX = f + (CommonUtils.cos(m1659d) * 400.0f);
                        realY = f2 + (CommonUtils.sin(m1659d) * 400.0f);
                    }
                    gameEngine.graphics.mo221a(f - gameEngine.viewpointX_rounded, f2 - gameEngine.viewpointY_rounded, realX - gameEngine.viewpointX_rounded, realY - gameEngine.viewpointY_rounded, f1584dj);
                    if (0 != 0) {
                        float m1691b = CommonUtils.m1691b(f, f2, realX, realY);
                        float m1659d2 = CommonUtils.m1659d(f, f2, realX, realY);
                        float f3 = gameEngine.interfaceEngine.f4689aN * m1691b;
                        float cos = f + (CommonUtils.cos(m1659d2) * f3);
                        float sin = f2 + (CommonUtils.sin(m1659d2) * f3);
                        f1583di.m4652a(cos - 1.0f, sin - 1.0f, cos + 1.0f, sin + 1.0f);
                        f1583di.m4653a(-gameEngine.viewpointX_rounded, -gameEngine.viewpointY_rounded);
                        gameEngine.graphics.mo201a(f1583di, f1584dj);
                    }
                    f = realX;
                    f2 = realY;
                }
            }
        }
        if (waypoint != null && waypoint2 != null && waypoint != waypoint2) {
            f1584dj.setColor(Color.argb(50, 0, 210, 210));
            Waypoint waypoint3 = waypoint;
            gameEngine.graphics.mo221a(waypoint2.getRealX() - gameEngine.viewpointX_rounded, waypoint2.getRealY() - gameEngine.viewpointY_rounded, waypoint3.getRealX() - gameEngine.viewpointX_rounded, waypoint3.getRealY() - gameEngine.viewpointY_rounded, f1584dj);
        }
    }

    /* renamed from: bZ */
    public void mo2985bZ() {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        Paint paint;
        boolean z = false;
        if (this.f1627cA != 0.0f) {
            this.f1627cA = CommonUtils.toZero(this.f1627cA, f);
            if (this.f1627cA % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.selected || z) {
            GameEngine gameEngine = GameEngine.getInstance();
            float f2 = this.x - gameEngine.viewpointX_rounded;
            float f3 = (this.y - gameEngine.viewpointY_rounded) - this.height;
            if (gameEngine.playerTeam == this.team) {
                if (this.displayRadius < 8.0f) {
                    paint = f1569cO;
                } else {
                    paint = f1570cP;
                }
            } else if (gameEngine.playerTeam.m3925c(this.team)) {
                paint = f1572cR;
            } else if (this.team != null && gameEngine.replayEngine.isPlaying()) {
                f1568cN.setColor(Team.m3892i(this.team.allyGroup));
                paint = f1568cN;
            } else {
                paint = f1574cT;
            }
            if (z) {
                paint = f1573cS;
            }
            if (mo2975bH()) {
                if (paint == f1570cP) {
                    paint = f1571cQ;
                }
                Rect mo3182cc = mo3182cc();
                if (mo3182cc != null) {
                    f1583di.m4651a(mo3182cc);
                    f1583di.top *= gameEngine.map.pixel_Height;
                    f1583di.bottom *= gameEngine.map.pixel_Height;
                    f1583di.left *= gameEngine.map.pixel_Width;
                    f1583di.right *= gameEngine.map.pixel_Width;
                    float mo2895cX = mo2895cX();
                    f1583di.m4653a(-(mo2897cV() - gameEngine.map.f792p), -(mo2896cW() - gameEngine.map.f793q));
                    CommonUtils.m1726a(f1583di, mo2895cX);
                    f1583di.m4653a(f2, f3);
                    gameEngine.graphics.mo221a(f1583di.left - 11.0f, f1583di.top, f1583di.right + 11.0f, f1583di.top, paint);
                    gameEngine.graphics.mo221a(f1583di.left - 11.0f, f1583di.bottom, f1583di.right + 11.0f, f1583di.bottom, paint);
                    gameEngine.graphics.mo221a(f1583di.left, f1583di.top - 11.0f, f1583di.left, f1583di.bottom + 11.0f, paint);
                    gameEngine.graphics.mo221a(f1583di.right, f1583di.top - 11.0f, f1583di.right, f1583di.bottom + 11.0f, paint);
                    return;
                }
                return;
            }
            float m1822r = this.displayRadius + gameEngine.interfaceEngine.m1822r(this);
            if (gameEngine.m901a(f2, f3, m1822r)) {
                gameEngine.graphics.mo219a(f2, f3, m1822r, paint);
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return true;
    }

    /* renamed from: ca */
    public Rect mo2974ca() {
        return f1588dn;
    }

    /* renamed from: cb */
    public Rect mo2973cb() {
        return f1588dn;
    }

    /* renamed from: cc */
    public Rect mo3182cc() {
        return mo2974ca();
    }

    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: f */
    public boolean mo419f(float f) {
        Paint paint;
        BitmapOrTexture mo2674v = mo2674v();
        if (mo2674v == null) {
            return false;
        }
        if (this.dead) {
            return true;
        }
        GameEngine game = GameEngine.getInstance();
        game.graphics.mo134k();
        float f2 = (int) (this.x - game.viewpointX_rounded);
        float f3 = (int) (this.y - game.viewpointY_rounded);
        float f4 = f2 * game.viewpointZoom;
        float f5 = f3 * game.viewpointZoom;
        if (this.selected) {
            paint = f1566bB;
        } else {
            paint = f1565bA;
        }
        game.graphics.mo196a(mo2674v, f4, f5, paint);
        game.graphics.mo135j();
        game.m916N();
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public boolean mo426a(GameEngine gameEngine) {
        if (!gameEngine.f5959cN.m4646b(this.x, this.y) || this.transportedBy != null) {
            return false;
        }
        if ((this.f1631cG != null && (this.f1631cG.f2327I || this.f1631cG.f2324C)) || !m3739d(gameEngine.playerTeam)) {
            return false;
        }
        return true;
    }

    /* renamed from: b_ */
    public boolean mo3195b_() {
        return true;
    }

    /* renamed from: cd */
    public final boolean m3746cd() {
        return m3739d(GameEngine.getInstance().playerTeam);
    }

    /* renamed from: d */
    public boolean m3739d(Team team) {
        Map map = GameEngine.getInstance().map;
        if ((this.team != team || this.f1630cF != null) && map.f818D && team.fogOfWar_map != null) {
            map.m4168a(this.x, this.y);
            int i = map.returnX;
            int i2 = map.returnY;
            if (map.isInMap(i, i2) && team.fogOfWar_map[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: ce */
    public boolean mo3181ce() {
        return true;
    }

    /* renamed from: c_ */
    public void mo2680c_() {
        if (this.dead) {
            this.collidable = false;
        } else {
            this.collidable = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        EffectObject emitEffect;
        if (!this.dead) {
            if (this.f1544cn > 0.0f) {
                if (this.f1544cn > this.maxHp * 2.0f) {
                    this.f1544cn = this.maxHp * 2.0f;
                }
                this.f1544cn = CommonUtils.toZero(this.f1544cn, f);
            }
            if (this.hp < this.maxHp * 0.33f && this.height > -1.0f) {
                GameEngine instance = GameEngine.getInstance();
                this.f1556df += f;
                this.f1557dg += f;
                this.f1636dh += f;
                if (this.f1556df > 10.0f && this.f1557dg < 300.0f && !mo3162dh()) {
                    this.f1556df = 0.0f;
                    if (this.trailEffect && instance.f5967dc && (emitEffect = instance.effects.emitEffect(this.x, this.y, this.height, EffectType.f4274a, false, EnumC0668h.f4397a)) != null) {
                        Emitter.m2190b(emitEffect, true);
                        emitEffect.f4289J = this.x;
                        emitEffect.f4290K = this.y;
                        emitEffect.f4291L = this.height;
                        emitEffect.f4296Q += CommonUtils.rnd(-0.1f, 0.1f) + this.f1614bT;
                        emitEffect.ySpeed += CommonUtils.rnd(-0.1f, 0.1f) + this.f1615bU;
                        emitEffect.f4289J += CommonUtils.rnd(-4.0f, 4.0f);
                        emitEffect.f4290K += CommonUtils.rnd(-4.0f, 4.0f);
                    }
                }
                if (this.f1636dh > 30.0f && this.f1557dg < 600.0f && !mo3161di()) {
                    this.f1636dh = 0.0f;
                    instance.effects.m2240a();
                    EffectObject emitEffect2 = instance.effects.emitEffect(this.x, this.y, this.height, EffectType.f4274a, false, EnumC0668h.f4397a);
                    if (emitEffect2 != null) {
                        Emitter.m2193a(emitEffect2, true);
                        emitEffect2.f4289J = this.x;
                        emitEffect2.f4290K = this.y;
                        emitEffect2.f4291L = this.height;
                        emitEffect2.f4296Q += CommonUtils.rnd(-0.1f, 0.1f);
                        emitEffect2.ySpeed += CommonUtils.rnd(-0.1f, 0.1f);
                        emitEffect2.f4289J += CommonUtils.rnd(-4.0f, 4.0f);
                        emitEffect2.f4290K += CommonUtils.rnd(-4.0f, 4.0f);
                    }
                }
            } else if (this.f1557dg != 0.0f) {
                this.f1557dg = 0.0f;
            }
            if (this.f1550ct != 0.0f) {
                this.f1550ct = CommonUtils.toZero(this.f1550ct, this.maxHp * this.f1551cu * 0.005f * f);
                this.f1551cu += f + (0.2f * this.f1551cu * f);
                if (this.f1550ct == 0.0f) {
                    this.f1551cu = 0.0f;
                }
            }
            if (this.hp <= 0.0f) {
                destroy();
            }
        }
    }

    /* renamed from: b */
    public float m3769b(Unit unit, float f, Projectile projectile) {
        float f2 = f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (projectile != null) {
            f3 = projectile.f1064ak;
            f4 = projectile.f1065al;
            f5 = projectile.f1066am;
        }
        if (this.shield < this.maxShield) {
            float f6 = f2 * f3;
            if (this.maxShield - this.shield > f6) {
                this.shield += f6;
                f2 -= f6 * f4;
            } else {
                this.shield = this.maxShield;
                f2 -= f6 * f4;
            }
        }
        if (f2 > 0.0f && this.hp < this.maxHp) {
            float f7 = f2 * f5;
            float f8 = this.maxHp - this.hp;
            if (f8 > f7) {
                m3730o(this.hp + f7);
                return 0.0f;
            }
            m3730o(this.maxHp);
            float f9 = f2 - f8;
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    public boolean mo2684J() {
        return false;
    }

    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        GameEngine game = GameEngine.getInstance();
        if (this.built < 1.0f) {
            f *= 1.75f;
        }
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (projectile != null) {
            f2 = projectile.f1064ak;
            f3 = projectile.f1065al;
            f4 = projectile.f1066am;
        }
        float f5 = f;
        float f6 = 0.0f;
        if (this.f1547cq == 0.0f && this.shield > 0.0f) {
            float f7 = f5 * f2;
            if (this.shield < f7) {
                f5 -= this.shield * f3;
                f6 = 0.0f + this.shield;
                this.f1546cp += this.shield;
                this.shield = 0.0f;
            } else {
                this.shield -= f7;
                this.f1546cp += f7;
                f6 = 0.0f + f7;
                f5 -= f5 * f3;
            }
        }
        if (f5 > 0.0f) {
            float f8 = f5 * f4;
            if (this.hp < f8) {
                f5 -= this.hp;
                float f9 = f6 + this.hp;
                m3730o(0.0f);
                this.f1550ct += this.hp;
            } else {
                m3730o(this.hp - f8);
                float f10 = f6 + f8;
                f5 -= f8;
                this.f1550ct -= f8;
            }
        }
        this.f1597bk = game.f5845by;
        if (unit != null) {
            this.f1598bl = unit;
        } else {
            this.f1598bl = null;
        }
        destroy();
        return f5;
    }

    /* renamed from: q */
    public Unit m3729q(float f) {
        if (GameEngine.getInstance().f5845by - (f * 1000.0f) < this.f1597bk) {
            return this.f1598bl;
        }
        return null;
    }

    /* renamed from: cf */
    public void destroy() {
        if (!this.dead && this.hp <= 0.0f) {
            mo2502bu();
        }
    }

    /* renamed from: n */
    public void mo2861n() {
    }

    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        return false;
    }

    /* renamed from: bs */
    public void mo2504bs() {
    }

    /* renamed from: bt */
    public void mo2503bt() {
        GameEngine game = GameEngine.getInstance();
        game.interfaceEngine.unselectUnit(this);
        Team.m3960a(this);
        if (fastUnitList.remove(this)) {
        }
        this.dead = true;
        this.f1610bN = game.f5845by;
        if (this.f1532cC != null) {
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                this.f1532cC[i].f1661j = null;
            }
        }
        game.UnitGeoIndex.m2781a(this);
    }

    /* renamed from: cg */
    public void m3745cg() {
        mo2503bt();
        remove();
        mo2504bs();
    }

    /* renamed from: ch */
    public void m3744ch() {
        this.hp = -1.0f;
    }

    /* renamed from: bu */
    public void mo2502bu() {
        mo2503bt();
        if (!destroyEffectAndWreak()) {
            remove();
        }
        mo2504bs();
    }

    /* renamed from: a */
    public boolean m3781a(RectF rectF) {
        if (this.x + this.radius > rectF.left && this.x - this.radius < rectF.right && this.y + this.radius > rectF.top && this.y - this.radius < rectF.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m3758c(float f, float f2, float f3) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f, f2);
        float f4 = this.radius + f3;
        if (distanceSq < f4 * f4) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m3727t(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float f = this.radius + unit.radius;
        if (distanceSq < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final void m3786O(int id) {
        Team team = Team.getTeam(id);
        if (team == null) {
            throw new C0173f("Could not find team with id: " + id);
        }
        mo3151e(team);
    }

    /* renamed from: e */
    public void mo3151e(Team team) {
        if (this.team == team) {
            return;
        }
        if (team == null) {
            throw new RuntimeException("Could not set team to null");
        }
        if (this.team != null) {
            Team.m3940b(this);
            this.team.mo3912d(this);
        }
        mo2537b(team);
        Team.m3924c(this);
        if (team != Team.f1346g) {
            mo2491c(false);
        }
    }

    /* renamed from: b */
    public void mo2537b(Team team) {
        if (team == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.team = team;
    }

    /* renamed from: P */
    public final void m3785P(int id) {
        this.team = Team.getTeam(id);
        if (this.team == null) {
            throw new C0173f("Could not find team with id: " + id);
        }
        mo2537b(this.team);
    }

    /* renamed from: M */
    public ArrayList mo2712M() {
        return f1589do;
    }

    /* renamed from: U */
    public int mo2647U() {
        return 1;
    }

    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
    }

    /* renamed from: a */
    public void mo2752a(Action action, boolean z, PointF pointF, Unit unit) {
        mo2711a(action, z);
    }

    /* renamed from: b */
    public void mo2949b(Action action, boolean z) {
    }

    /* renamed from: b */
    public void mo2950b(Action action) {
    }

    /* renamed from: a */
    public Action mo3219a(C0202c c0202c) {
        ArrayList mo2712M = mo2712M();
        int size = mo2712M.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) mo2712M.get(i);
            if (action.m3825d(c0202c)) {
                return action;
            }
        }
        return null;
    }

    /* renamed from: ci */
    public boolean mo2983ci() {
        if (mo2975bH()) {
            return Action.m3827c(mo2870ck());
        }
        return false;
    }

    /* renamed from: cj */
    public boolean mo3179cj() {
        return false;
    }

    /* renamed from: ck */
    public C0202c mo2870ck() {
        return Action.f1432h;
    }

    /* renamed from: cl */
    public float mo3178cl() {
        return -1.0f;
    }

    /* renamed from: cm */
    public boolean m3743cm() {
        return false;
    }

    /* renamed from: a */
    public void mo3030a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: cn */
    public C0202c mo2824cn() {
        return Action.f1432h;
    }

    /* renamed from: e */
    public Action getSpecialActionFor(UnitType unitType) {
        return null;
    }

    /* renamed from: co */
    public final int m3742co() {
        int i = 0;
        Iterator it = mo2712M().iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (action.isAvailable(this) || action.mo3805p()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m3757c(Unit unit, boolean z) {
        Unit unit2 = unit.transportedBy;
        OrderableUnit orderableUnit = unit.f1630cF;
        unit.transportedBy = null;
        unit.f1630cF = null;
        boolean mo2822d = mo2822d(unit, z);
        unit.transportedBy = unit2;
        unit.f1630cF = orderableUnit;
        return mo2822d;
    }

    /* renamed from: d */
    public boolean mo2822d(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo2819e(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: cp */
    public boolean mo2823cp() {
        return false;
    }

    /* renamed from: cq */
    public boolean mo3177cq() {
        return mo2676i();
    }

    /* renamed from: cr */
    public boolean mo3176cr() {
        return false;
    }

    /* renamed from: cs */
    public boolean mo2706cs() {
        return false;
    }

    /* renamed from: O */
    public boolean mo2683O() {
        return false;
    }

    /* renamed from: ct */
    public int mo2844ct() {
        return 1;
    }

    /* renamed from: y */
    public int mo2719y() {
        return 85;
    }

    /* renamed from: f */
    public float mo2723f(UnitType unitType) {
        return unitType.mo3130a(this) + mo2719y();
    }

    /* renamed from: u */
    public int mo2721u(Unit unit) {
        return mo2719y() + unit.getUnitType().mo3130a(this);
    }

    /* renamed from: v */
    public int mo2720v(Unit unit) {
        return mo2719y() + unit.getUnitType().mo3130a(this);
    }

    /* renamed from: w */
    public boolean mo3142w(Unit unit) {
        return false;
    }

    /* renamed from: x */
    public boolean mo3141x(Unit unit) {
        return false;
    }

    /* renamed from: b */
    public float mo2749b(Unit unit) {
        return 1.0f;
    }

    /* renamed from: c */
    public float mo2748c(Unit unit) {
        return 0.2f;
    }

    /* renamed from: y */
    public boolean m3726y(Unit unit) {
        boolean z = false;
        if (unit.mo2862g() > 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    public float mo3140z(Unit unit) {
        float mo2748c = mo2748c(unit) * 5.1f;
        if (unit.mo2862g() > 0.0f) {
            mo2748c = unit.mo2862g();
        }
        return mo2748c;
    }

    /* renamed from: cu */
    public float mo3175cu() {
        return 1.0f;
    }

    /* renamed from: cv */
    public float getIncome() {
        return 0.0f;
    }

    /* renamed from: cw */
    public C0421e mo3174cw() {
        float income = getIncome();
        if (income == 0.0f) {
            return C0421e.f2634a;
        }
        C0421e c0421e = new C0421e();
        c0421e.m3294b(C0411a.f2600A, income);
        return c0421e;
    }

    /* renamed from: cx */
    public C0421e mo3173cx() {
        return C0421e.f2634a;
    }

    /* renamed from: cy */
    public String m3741cy() {
        return getUnitType().mo3087i() + "(id:" + this.GameObjectID + ")";
    }

    /* renamed from: f */
    public static String m3732f(Unit unit, boolean z) {
        if (unit != null) {
            return unit.getUnitType().mo3095e();
        }
        return "No unit";
    }

    /* renamed from: A */
    public static String m3788A(Unit unit) {
        if (unit != null) {
            return unit.m3740cz();
        }
        return "<null unit>";
    }

    /* renamed from: cz */
    public String m3740cz() {
        String str = getUnitType().mo3087i() + "(pos:" + ((int) this.x) + "," + ((int) this.y) + " id:" + this.GameObjectID + VariableScope.nullOrMissingString;
        if (this.team != null) {
            str = str + " t:" + this.team.teamID;
        }
        if (this.dead) {
            str = str + " [dead]";
        }
        if (this.deleted) {
            str = str + " [deleted]";
        }
        return str + ")";
    }

    /* renamed from: cA */
    public String m3754cA() {
        String str = (getUnitType().mo3087i() + "(pos:" + ((int) this.x) + "," + ((int) this.y) + " id:" + this.GameObjectID + VariableScope.nullOrMissingString) + ", hp:" + this.hp + ", dead:" + this.dead + ", deleted:" + this.deleted + " tags:" + mo3167da();
        if (this.team != null) {
            str = str + " t:" + this.team.teamID;
        }
        return str + ")";
    }

    /* renamed from: cB */
    public float mo3194cB() {
        return 1.0f;
    }

    /* renamed from: cC */
    public RectF m3753cC() {
        GameEngine gameEngine = GameEngine.getInstance();
        float mo3194cB = mo3194cB();
        f1591dr.m4652a((this.x - (this.halfObjectWidth * mo3194cB)) - gameEngine.viewpointX_rounded, (this.y - (this.halfObjectHeight * mo3194cB)) - gameEngine.viewpointY_rounded, (this.x + (this.halfObjectWidth * mo3194cB)) - gameEngine.viewpointX_rounded, (this.y + (this.halfObjectHeight * mo3194cB)) - gameEngine.viewpointY_rounded);
        return f1591dr;
    }

    /* renamed from: cD */
    public RectF mo2967cD() {
        GameEngine gameEngine = GameEngine.getInstance();
        RectF rectF = f1591dr;
        float f = gameEngine.viewpointX_rounded;
        float f2 = gameEngine.viewpointY_rounded;
        int i = this.halfObjectWidth;
        int i2 = this.halfObjectHeight;
        rectF.left = (this.x - i) - f;
        rectF.right = (this.x + i) - f;
        rectF.top = (this.y - i2) - f2;
        rectF.bottom = (this.y + i2) - f2;
        return rectF;
    }

    /* renamed from: cE */
    public boolean mo3193cE() {
        return false;
    }

    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        f1593dt.left = 0;
        f1593dt.top = 0;
        f1593dt.right = 0 + this.objectWidth;
        f1593dt.bottom = 0 + this.objectHeight;
        return f1593dt;
    }

    /* renamed from: a */
    public Rect m3771a(boolean z, int i) {
        int i2 = 0 + (i * this.objectWidth);
        f1593dt.set(i2, 0, i2 + this.objectWidth, 0 + this.objectHeight);
        return f1593dt;
    }

    /* renamed from: a */
    public Rect m3770a(boolean z, int i, int i2) {
        int i3 = this.objectWidth;
        int i4 = this.objectHeight;
        int i5 = i * i3;
        int i6 = i2 * i4;
        f1593dt.left = i5;
        f1593dt.top = i6;
        f1593dt.right = i5 + i3;
        f1593dt.bottom = i6 + i4;
        return f1593dt;
    }

    /* renamed from: a */
    public boolean mo3778a(Unit unit, float f) {
        return false;
    }

    /* renamed from: a_ */
    public void type(String str) {
    }

    /* renamed from: cF */
    public final boolean m3752cF() {
        if (!m3750cH() || this.height > 2.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: cG */
    public boolean m3751cG() {
        return C0955y.m443b(this.x, this.y);
    }

    /* renamed from: cH */
    public boolean m3750cH() {
        return C0955y.m438c(this.x, this.y);
    }

    /* renamed from: cI */
    public boolean m3749cI() {
        return C0955y.m436d(this.x, this.y);
    }

    /* renamed from: bv */
    public int mo2501bv() {
        return (((0 * 31) + ((int) getMass())) * 31) + ((int) this.maxHp);
    }

    /* renamed from: cJ */
    public int mo3021cJ() {
        return getUnitType().mo3107b(mo2647U());
    }

    /* renamed from: cK */
    public C0407b m3748cK() {
        return getUnitType().mo3097d(mo2647U());
    }

    /* renamed from: cL */
    public C0407b mo3192cL() {
        return null;
    }

    /* renamed from: a */
    public PointF m3784a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.moving) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF mo2456m = mo2456m(f6);
                f6 = CommonUtils.m1691b(f, f2, mo2456m.x, mo2456m.y) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF mo2456m2 = mo2456m(f6);
        float distanceSq = CommonUtils.distanceSq(f, f2, mo2456m2.x, mo2456m2.y);
        if (f5 >= 0.0f && f5 * f5 < distanceSq) {
            float m1659d = CommonUtils.m1659d(f, f2, mo2456m2.x, mo2456m2.y);
            mo2456m2.x = f + (CommonUtils.cos(m1659d) * f5);
            mo2456m2.y = f2 + (CommonUtils.sin(m1659d) * f5);
        }
        f1594du.m4669a(mo2456m2);
        return f1594du;
    }

    /* renamed from: m */
    PointF mo2456m(float f) {
        f1595dv.set(this.x + (this.f1614bT * f), this.y + (this.f1615bU * f));
        return f1595dv;
    }

    /* renamed from: o */
    public boolean mo2860o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo2859p() {
        return false;
    }

    /* renamed from: f */
    public void mo3149f(Team team) {
        if (mo2859p()) {
            mo2537b(Team.f1346g);
        } else {
            mo2537b(team);
        }
    }

    /* renamed from: B */
    public void mo3233B(Unit unit) {
        if (unit instanceof SandBoxAct) {
            unit = null;
        }
        this.f1599bm = unit;
    }

    /* renamed from: cM */
    public void mo3191cM() {
    }

    /* renamed from: g */
    public float mo2862g() {
        return 0.0f;
    }

    /* renamed from: cN */
    public int mo3190cN() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: cO */
    public ValueList mo3189cO() {
        return null;
    }

    /* renamed from: C */
    public boolean mo2728C(Unit unit) {
        return false;
    }

    /* renamed from: D */
    public boolean mo3232D(Unit unit) {
        return mo2728C(unit);
    }

    /* renamed from: cP */
    public int mo3188cP() {
        return 500;
    }

    /* renamed from: c */
    public boolean m3755c(OrderableUnit orderableUnit) {
        int mo3190cN = mo3190cN();
        if (mo3190cN < Integer.MAX_VALUE && m3737d(orderableUnit) >= mo3190cN) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m3737d(OrderableUnit orderableUnit) {
        Waypoint activeWaypoint;
        int i = 0;
        Team team = orderableUnit.team;
        Unit[] m485a = fastUnitList.m485a();
        int size = fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == team && (unit instanceof OrderableUnit) && (activeWaypoint = ((OrderableUnit) unit).getActiveWaypoint()) != null && activeWaypoint.getType() == WaypointType.f1757g && activeWaypoint.targetUnit == this && unit != orderableUnit) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m3733e(OrderableUnit orderableUnit) {
        Waypoint activeWaypoint;
        int i = 0;
        Team team = orderableUnit.team;
        Unit[] m485a = fastUnitList.m485a();
        int size = fastUnitList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m485a[i2];
            if (unit.team == team && (unit instanceof OrderableUnit) && (activeWaypoint = ((OrderableUnit) unit).getActiveWaypoint()) != null && activeWaypoint.getType() == WaypointType.f1754d && activeWaypoint.targetUnit == this && unit != orderableUnit) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bk */
    public int mo2512bk() {
        return 1;
    }

    /* renamed from: u */
    public boolean mo1773u() {
        return false;
    }

    /* renamed from: cQ */
    public boolean mo3187cQ() {
        return mo1773u() || this.built < 1.0f || this.team == Team.f1345f;
    }

    /* renamed from: t */
    public boolean mo1774t() {
        return false;
    }

    /* renamed from: cR */
    public boolean mo3186cR() {
        return mo1774t();
    }

    /* renamed from: cS */
    public boolean mo3185cS() {
        return false;
    }

    /* renamed from: d */
    public boolean mo2679d(Unit unit) {
        return true;
    }

    /* renamed from: g */
    public void m3731g(Team team) {
        if (this.f1559dw == null || this.f1559dw.length != Team.playerNumMax) {
            this.f1559dw = new C0233ah[Team.playerNumMax];
            for (int i = 0; i < this.f1559dw.length; i++) {
                this.f1559dw[i] = new C0233ah();
            }
        }
        C0233ah c0233ah = this.f1559dw[team.teamID];
        if (this.dead) {
            if (c0233ah.f1640a && m3739d(team)) {
                c0233ah.f1640a = false;
            }
        } else if (m3739d(team)) {
            c0233ah.f1640a = true;
            c0233ah.f1641b = mo2647U();
        }
    }

    /* renamed from: cT */
    public void m3747cT() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.playerTeam != null && this.team != gameEngine.playerTeam && gameEngine.playerTeam.teamID >= 0 && gameEngine.playerTeam.teamID < Team.playerNumMax) {
            C0233ah c0233ah = this.f1559dw[gameEngine.playerTeam.teamID];
            if (c0233ah.f1642c != null && c0233ah.f1642c.f4217c) {
                c0233ah.f1642c = null;
            }
            if (c0233ah.f1642c == null && c0233ah.f1640a && !m3739d(gameEngine.playerTeam)) {
                C0661a c0661a = new C0661a();
                c0233ah.f1642c = c0661a;
                c0661a.f4218d = getUnitType();
                c0661a.f4220g = this.x;
                c0661a.f4221h = this.y;
                c0661a.f4227n = false;
                c0661a.f4219e = this.team;
                c0661a.f4241f = c0233ah.f1641b;
                c0661a.f4223j = gameEngine.playerTeam;
                c0661a.f4231u = mo3195b_();
                c0661a.f4232v = this;
            }
        }
    }

    /* renamed from: cU */
    public PointF mo3184cU() {
        f1596dx.set(0.0f, 0.0f);
        return f1596dx;
    }

    /* renamed from: cV */
    public float mo2897cV() {
        return GameEngine.getInstance().map.f792p;
    }

    /* renamed from: cW */
    public float mo2896cW() {
        return GameEngine.getInstance().map.f793q;
    }

    /* renamed from: cX */
    public float mo2895cX() {
        GameEngine gameEngine = GameEngine.getInstance();
        return gameEngine.map.f792p + 2 + gameEngine.interfaceEngine.m1822r(this);
    }

    /* renamed from: a */
    public Point m3780a(Map map, Point point) {
        point.game = (int) (((this.x - mo2897cV()) + 1.0f) * map.f794r);
        point.y = (int) (((this.y - mo2896cW()) + 1.0f) * map.f795s);
        return point;
    }

    /* renamed from: a */
    public RectF m3779a(Map map, RectF rectF) {
        map.fromGrid((int) (((this.x - mo2897cV()) + 1.0f) * map.f794r), (int) (((this.y - mo2896cW()) + 1.0f) * map.f795s));
        float f = map.returnX;
        float f2 = map.returnY;
        Rect mo2973cb = mo2973cb();
        rectF.m4652a(f + (mo2973cb.left * map.pixel_Width), f2 + (mo2973cb.top * map.pixel_Height), f + ((mo2973cb.right + 1) * map.pixel_Width), f2 + ((mo2973cb.bottom + 1) * map.pixel_Height));
        return rectF;
    }

    /* renamed from: cY */
    public void mo3183cY() {
    }

    /* renamed from: cZ */
    public boolean mo2845cZ() {
        return false;
    }

    /* renamed from: q */
    public boolean mo2858q() {
        return false;
    }

    /* renamed from: da */
    public ValueList mo3167da() {
        return null;
    }

    /* renamed from: db */
    public C0421e mo1776db() {
        return this.f1637dy;
    }

    /* renamed from: a */
    public double m3774a(C0411a c0411a) {
        return this.f1637dy.m3310a(c0411a);
    }

    /* renamed from: dc */
    public C0401c m3736dc() {
        return this.f1638dz;
    }

    /* renamed from: dd */
    public ValueList mo3166dd() {
        return null;
    }

    /* renamed from: bc */
    public float mo2520bc() {
        return 0.0f;
    }

    /* renamed from: de */
    public void mo3165de() {
    }

    /* renamed from: df */
    public void mo3164df() {
    }

    /* renamed from: dg */
    public boolean mo3163dg() {
        return false;
    }

    /* renamed from: dh */
    public boolean mo3162dh() {
        return mo3198bN();
    }

    /* renamed from: di */
    public boolean mo3161di() {
        return mo3198bN();
    }

    /* renamed from: dj */
    public final C0383i m3735dj() {
        return this.f1631cG;
    }

    public String toString() {
        return "unit(id=" + this.GameObjectID + ",type=" + getUnitType().mo3087i() + ")";
    }

    /* renamed from: r */
    public void m3728r(float f) {
        if (f >= 1.0f) {
            if (!(this.built >= 1.0f)) {
                Team.m3940b(this);
                this.built = 1.0f;
                Team.m3924c(this);
                return;
            }
            return;
        }
        if (this.built >= 1.0f) {
            Team.m3940b(this);
            this.built = f;
            Team.m3924c(this);
            return;
        }
        this.built = f;
    }

    /* renamed from: a */
    public final void m3776a(EnumC0334ad enumC0334ad) {
        mo3214a(enumC0334ad, (Unit) null, (ValueList) null, (VariableScope) null);
    }

    /* renamed from: a */
    public final void m3775a(EnumC0334ad enumC0334ad, Unit unit) {
        mo3214a(enumC0334ad, unit, (ValueList) null, (VariableScope) null);
    }

    /* renamed from: a */
    public void mo3214a(EnumC0334ad enumC0334ad, Unit unit, ValueList valueList, VariableScope variableScope) {
    }

    /* renamed from: h */
    public void mo2475h(float f) {
        this.direction = f;
    }

    /* renamed from: dk */
    public int mo2947dk() {
        return 0;
    }

    /* renamed from: e */
    public ObjectVector mo3150e(boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean mo2798a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public void mo2491c(boolean z) {
    }

    /* renamed from: dl */
    public float mo3160dl() {
        return this.radius;
    }

    /* renamed from: bB */
    public void mo2525bB() {
    }

    /* renamed from: dm */
    public final C0407b m3734dm() {
        return this.f1639dA;
    }
}