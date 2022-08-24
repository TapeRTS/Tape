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
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.air.AbstractC0309b;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.buildings.LaserDefence;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0418c;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.land.AbstractC0525h;
import com.corrodinggames.rts.game.units.land.AbstractC0529j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.water.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.AbstractC0667ay;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/am.class */
public abstract class Unit extends AbstractC0667ay {

    /* renamed from: bq */
    public float f1576bq;

    /* renamed from: br */
    public int f1577br;

    /* renamed from: bs */
    public Unit f1578bs;

    /* renamed from: bt */
    public Unit f1579bt;

    /* renamed from: bu */
    public Unit f1580bu;

    /* renamed from: bv */
    public VariableScope f1581bv;

    /* renamed from: bw */
    public C0424b f1582bw;

    /* renamed from: bx */
    public C0424b f1583bx;

    /* renamed from: by */
    public int f1584by;

    /* renamed from: bz */
    public int f1585bz;

    /* renamed from: bA */
    public int f1586bA;

    /* renamed from: bB */
    public int f1587bB;

    /* renamed from: bC */
    public boolean f1588bC;

    /* renamed from: bD */
    public static final C1112u f1589bD = new C1112u();

    /* renamed from: a */
    private static final C1104o f1590a = new C1104o();

    /* renamed from: bE */
    public static HashMap f1591bE = new HashMap();

    /* renamed from: bF */
    public static HashMap f1592bF = new HashMap();

    /* renamed from: bG */
    public static HashMap f1593bG = new HashMap();

    /* renamed from: bH */
    public static final Paint f1594bH = new C0930ag();

    /* renamed from: bI */
    public static final Paint f1595bI;

    /* renamed from: bJ */
    static final LightingColorFilter f1596bJ;

    /* renamed from: bK */
    public boolean f1597bK;

    /* renamed from: bL */
    public boolean f1598bL;

    /* renamed from: bM */
    public boolean f1599bM;

    /* renamed from: bN */
    public boolean f1600bN;

    /* renamed from: bO */
    public boolean f1601bO;

    /* renamed from: bP */
    public Unit f1602bP;

    /* renamed from: bQ */
    public Unit f1603bQ;

    /* renamed from: bR */
    public float f1604bR;

    /* renamed from: bS */
    public boolean collidable;

    /* renamed from: bT */
    public boolean isDead;

    /* renamed from: bU */
    public long f1607bU;

    /* renamed from: bV */
    public Team team;

    /* renamed from: bW */
    public boolean f1609bW;

    /* renamed from: bX */
    public float f1610bX;

    /* renamed from: bY */
    public float f1611bY;

    /* renamed from: bZ */
    public boolean f1612bZ;

    /* renamed from: ca */
    public float f1613ca;

    /* renamed from: cb */
    public float f1614cb;

    /* renamed from: cc */
    public float f1615cc;

    /* renamed from: cd */
    public float f1616cd;

    /* renamed from: ce */
    public float direction;

    /* renamed from: cf */
    public float f1618cf;

    /* renamed from: cg */
    public boolean f1619cg;

    /* renamed from: ch */
    public float radius;

    /* renamed from: ci */
    public float displayRadius;

    /* renamed from: cj */
    public float f1622cj;

    /* renamed from: ck */
    public float f1623ck;

    /* renamed from: cl */
    public float f1624cl;

    /* renamed from: cm */
    public boolean f1625cm;

    /* renamed from: cn */
    public boolean f1626cn;

    /* renamed from: co */
    public boolean f1627co;

    /* renamed from: cp */
    public boolean f1628cp;

    /* renamed from: cq */
    public boolean f1629cq;

    /* renamed from: cr */
    public boolean f1630cr;

    /* renamed from: cs */
    public float f1631cs;

    /* renamed from: ct */
    public float f1632ct;

    /* renamed from: cu */
    public float f1633cu;

    /* renamed from: cv */
    public float f1634cv;

    /* renamed from: cw */
    public float f1635cw;

    /* renamed from: cx */
    public float f1636cx;

    /* renamed from: cy */
    public float f1637cy;

    /* renamed from: cz */
    public float f1638cz;

    /* renamed from: cA */
    public float f1639cA;

    /* renamed from: cB */
    public float f1640cB;

    /* renamed from: cC */
    public int f1641cC;

    /* renamed from: cD */
    public int f1642cD;

    /* renamed from: cE */
    public boolean f1643cE;

    /* renamed from: cF */
    public int f1644cF;

    /* renamed from: cG */
    public boolean f1645cG;

    /* renamed from: cH */
    public float f1646cH;

    /* renamed from: cI */
    public boolean f1647cI;

    /* renamed from: cJ */
    public C0247ap[] f1648cJ;

    /* renamed from: cK */
    public boolean f1649cK;

    /* renamed from: cL */
    public Unit f1650cL;

    /* renamed from: cM */
    public AbstractC0623y f1651cM;

    /* renamed from: cN */
    public C0399m f1652cN;

    /* renamed from: cO */
    public int f1653cO;

    /* renamed from: cP */
    public boolean f1654cP;

    /* renamed from: cQ */
    public int f1655cQ;

    /* renamed from: cR */
    public int f1656cR;

    /* renamed from: cS */
    public int f1657cS;

    /* renamed from: cT */
    public float f1658cT;

    /* renamed from: cU */
    public static final Paint f1659cU;

    /* renamed from: cV */
    public static final Paint f1660cV;

    /* renamed from: cW */
    public static final Paint f1661cW;

    /* renamed from: cX */
    public static final Paint f1662cX;

    /* renamed from: cY */
    public static final Paint f1663cY;

    /* renamed from: cZ */
    public static final Paint f1664cZ;

    /* renamed from: da */
    public static final Paint f1665da;

    /* renamed from: db */
    public static final Paint f1666db;

    /* renamed from: dc */
    public static final Paint f1667dc;

    /* renamed from: dd */
    public static final Paint f1668dd;

    /* renamed from: de */
    public static final Paint f1669de;

    /* renamed from: df */
    public static final Paint f1670df;

    /* renamed from: dg */
    public static final Paint f1671dg;

    /* renamed from: dh */
    public static final Paint f1672dh;

    /* renamed from: di */
    public static final Paint f1673di;

    /* renamed from: dj */
    public int f1674dj;

    /* renamed from: dk */
    public int f1675dk;

    /* renamed from: dl */
    public int f1676dl;

    /* renamed from: dm */
    public float f1677dm;

    /* renamed from: dn */
    public float f1678dn;

    /* renamed from: do */
    public float f1679do;

    /* renamed from: dp */
    static final RectF f1680dp;

    /* renamed from: dq */
    static Paint f1681dq;

    /* renamed from: dr */
    static Paint f1682dr;

    /* renamed from: ds */
    public static final RectF f1683ds;

    /* renamed from: dt */
    public static final Rect f1684dt;

    /* renamed from: du */
    static final Rect f1685du;

    /* renamed from: dv */
    static final ArrayList f1686dv;

    /* renamed from: dw */
    static ArrayList f1687dw;

    /* renamed from: dx */
    public InterfaceC0303as f1688dx;

    /* renamed from: dy */
    static final RectF f1689dy;

    /* renamed from: dz */
    static final RectF f1690dz;

    /* renamed from: dA */
    static final Rect f1691dA;

    /* renamed from: dB */
    static final PointF f1692dB;

    /* renamed from: dC */
    static final PointF f1693dC;

    /* renamed from: dD */
    C0245an[] f1694dD;

    /* renamed from: dE */
    static final PointF f1695dE;

    /* renamed from: dF */
    C0439f f1696dF;

    /* renamed from: dG */
    public C0418c f1697dG;

    /* renamed from: dH */
    C0424b f1698dH;

    /* renamed from: h */
    public abstract EnumC0246ao mo5645h();

    /* renamed from: i */
    public abstract boolean mo3293i();

    /* renamed from: Q */
    public abstract boolean mo3294Q();

    /* renamed from: aj */
    public abstract boolean mo3143aj();

    /* renamed from: ak */
    public abstract boolean mo3142ak();

    /* renamed from: p_ */
    public abstract boolean mo4204p_();

    /* renamed from: r */
    public abstract InterfaceC0303as getUnitType();

    /* renamed from: l */
    public abstract boolean canAttack();

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f1598bL);
        c0859ar.mo1486a(this.f1602bP);
        c0859ar.mo1486a(this.f1603bQ);
        c0859ar.mo1488a(this.f1604bR);
        c0859ar.mo1482a(this.collidable);
        c0859ar.mo1482a(this.isDead);
        c0859ar.m1577a(this.f1607bU);
        c0859ar.m1575a(this.team);
        c0859ar.mo1488a(this.f1610bX);
        c0859ar.mo1488a(this.f1611bY);
        c0859ar.mo1488a(this.f1613ca);
        c0859ar.mo1488a(this.f1614cb);
        c0859ar.mo1488a(this.f1616cd);
        c0859ar.mo1488a(this.direction);
        c0859ar.mo1488a(this.radius);
        c0859ar.mo1488a(this.displayRadius);
        c0859ar.mo1488a(this.f1622cj);
        c0859ar.mo1488a(this.f1623ck);
        c0859ar.mo1482a(this.f1626cn);
        c0859ar.mo1482a(this.f1629cq);
        c0859ar.mo1488a(this.f1631cs);
        c0859ar.mo1488a(this.f1632ct);
        c0859ar.mo1482a(this.f1647cI);
        c0859ar.mo1488a(this.f1648cJ[0].f1711a);
        c0859ar.mo1488a(this.f1648cJ[0].f1714d);
        c0859ar.mo1486a(this.f1650cL);
        c0859ar.m1554c(26);
        c0859ar.mo1487a(this.f1657cS);
        c0859ar.mo1488a(this.f1658cT);
        c0859ar.mo1488a(this.f1615cc);
        c0859ar.mo1488a(this.f1618cf);
        int mo3512bl = mo3512bl();
        c0859ar.mo1487a(mo3512bl);
        for (int i = 0; i < mo3512bl; i++) {
            C0247ap c0247ap = this.f1648cJ[i];
            c0859ar.mo1488a(c0247ap.f1711a);
            c0859ar.mo1488a(c0247ap.f1713c);
            c0859ar.mo1488a(c0247ap.f1714d);
            c0859ar.mo1488a(c0247ap.f1715e);
            c0859ar.mo1488a(c0247ap.f1716f);
            c0859ar.mo1488a(c0247ap.f1718h);
            c0859ar.mo1488a(c0247ap.f1719i);
            Unit unit = c0247ap.f1720j;
            if (unit != null && unit.isDead) {
                unit = null;
            }
            c0859ar.mo1486a(unit);
            c0859ar.mo1482a(this.f1649cK);
        }
        c0859ar.mo1487a(this.f1577br);
        c0859ar.mo1488a(this.f1634cv);
        c0859ar.mo1488a(this.f1635cw);
        c0859ar.mo1488a(this.f1636cx);
        c0859ar.mo1488a(this.f1637cy);
        c0859ar.mo1482a(this.f1627co);
        c0859ar.mo1482a(this.f1628cp);
        c0859ar.mo1482a(this.f1630cr);
        c0859ar.mo1482a(this.f1599bM);
        c0859ar.mo1488a(this.f1638cz);
        c0859ar.mo1482a(this.f1619cg);
        c0859ar.mo1482a(this.f1694dD != null);
        if (this.f1694dD != null) {
            c0859ar.mo1487a(this.f1694dD.length);
            for (int i2 = 0; i2 < this.f1694dD.length; i2++) {
                C0245an c0245an = this.f1694dD[i2];
                c0859ar.mo1482a(c0245an.f1699a);
                c0859ar.mo1487a(c0245an.f1700b);
            }
        }
        c0859ar.mo1488a(this.f1633cu);
        c0859ar.m1559b(this.f1578bs);
        c0859ar.mo1487a(this.f1641cC);
        c0859ar.mo1487a(this.f1642cD);
        c0859ar.mo1487a(this.f1584by);
        c0859ar.mo1487a(this.f1585bz);
        c0859ar.mo1487a(this.f1586bA);
        c0859ar.mo1487a(this.f1587bB);
        c0859ar.mo1482a(this.f1600bN);
        c0859ar.mo1482a(this.f1601bO);
        this.f1696dF.m5113a(c0859ar);
        this.f1697dG.m5239a(c0859ar);
        c0859ar.m1559b((Unit) this.f1651cM);
        short s = -1;
        if (this.f1651cM != null && this.f1652cN != null) {
            s = this.f1652cN.m5293a();
        }
        c0859ar.mo1483a(s);
        c0859ar.mo1487a(this.f1653cO);
        VariableScope.writeOutUnitOrPlaceholder(c0859ar, this.f1579bt);
        VariableScope.writeOutUnitOrPlaceholder(c0859ar, this.f1580bu);
        VariableScope.writeOut(c0859ar, this.f1581bv);
        C0424b.m5212a(c0859ar, this.f1582bw);
        C0424b.m5212a(c0859ar, this.f1583bx);
        c0859ar.mo1488a(this.f1624cl);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        C0399m m3182a;
        this.f1598bL = c0876k.m1455e();
        this.f1602bP = c0876k.m1445o();
        this.f1603bQ = c0876k.m1445o();
        this.f1604bR = c0876k.m1453g();
        this.collidable = c0876k.m1455e();
        this.isDead = c0876k.m1455e();
        this.f1607bU = c0876k.m1451i();
        mo3120b(c0876k.m1442r());
        this.f1610bX = c0876k.m1453g();
        this.f1611bY = c0876k.m1453g();
        this.f1613ca = c0876k.m1453g();
        this.f1614cb = c0876k.m1453g();
        this.f1616cd = c0876k.m1453g();
        this.direction = c0876k.m1453g();
        c0876k.m1453g();
        c0876k.m1453g();
        this.f1622cj = c0876k.m1453g();
        this.f1623ck = c0876k.m1453g();
        this.f1626cn = c0876k.m1455e();
        this.f1629cq = c0876k.m1455e();
        m5762o(c0876k.m1453g());
        this.f1632ct = c0876k.m1453g();
        this.f1647cI = c0876k.m1455e();
        this.f1648cJ[0].f1711a = c0876k.m1453g();
        this.f1648cJ[0].f1714d = c0876k.m1453g();
        this.f1650cL = c0876k.m1445o();
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f1657cS = c0876k.m1454f();
            this.f1658cT = c0876k.m1453g();
        }
        if (m1457d >= 2) {
            this.f1615cc = c0876k.m1453g();
            this.f1618cf = c0876k.m1453g();
            int m1454f = c0876k.m1454f();
            m5904O(m1454f);
            for (int i = 0; i < m1454f; i++) {
                C0247ap c0247ap = this.f1648cJ[i];
                c0247ap.f1711a = c0876k.m1453g();
                c0247ap.f1713c = c0876k.m1453g();
                c0247ap.f1714d = c0876k.m1453g();
                c0247ap.f1715e = c0876k.m1453g();
                c0247ap.f1716f = c0876k.m1453g();
                if (m1457d >= 8) {
                    c0247ap.f1718h = c0876k.m1453g();
                    c0247ap.f1719i = c0876k.m1453g();
                    c0247ap.f1720j = c0876k.m1445o();
                }
                if (m1457d >= 12) {
                    this.f1649cK = c0876k.m1455e();
                }
            }
        }
        if (m1457d >= 3) {
            this.f1577br = c0876k.m1454f();
        }
        if (m1457d >= 4) {
            this.f1634cv = c0876k.m1453g();
            this.f1635cw = c0876k.m1453g();
            this.f1636cx = c0876k.m1453g();
            this.f1637cy = c0876k.m1453g();
        }
        if (m1457d >= 5) {
            this.f1627co = c0876k.m1455e();
            this.f1628cp = c0876k.m1455e();
        }
        if (m1457d >= 6) {
            this.f1630cr = c0876k.m1455e();
        }
        if (m1457d >= 7) {
            this.f1599bM = c0876k.m1455e();
        }
        if (m1457d >= 9) {
            this.f1638cz = c0876k.m1453g();
        }
        if (m1457d >= 10) {
            this.f1619cg = c0876k.m1455e();
        }
        if (m1457d >= 11 && c0876k.m1455e()) {
            this.f1694dD = new C0245an[c0876k.m1454f()];
            for (int i2 = 0; i2 < this.f1694dD.length; i2++) {
                this.f1694dD[i2] = new C0245an();
                C0245an c0245an = this.f1694dD[i2];
                c0245an.f1699a = c0876k.m1455e();
                c0245an.f1700b = c0876k.m1454f();
            }
        }
        if (m1457d >= 13) {
            this.f1633cu = c0876k.m1453g();
        }
        if (m1457d >= 14) {
            this.f1578bs = c0876k.m1445o();
        }
        if (m1457d >= 15) {
            this.f1641cC = c0876k.m1454f();
            this.f1642cD = c0876k.m1454f();
        }
        if (m1457d >= 16) {
            this.f1584by = c0876k.m1454f();
            this.f1585bz = c0876k.m1454f();
            this.f1586bA = c0876k.m1454f();
        }
        if (m1457d >= 17) {
            this.f1587bB = c0876k.m1454f();
        }
        if (m1457d >= 18) {
            this.f1600bN = c0876k.m1455e();
            this.f1601bO = c0876k.m1455e();
        }
        if (m1457d >= 19) {
            this.f1696dF.m5112a(c0876k);
            this.f1697dG.m5243a(this, c0876k);
        }
        if (m1457d >= 20) {
            AbstractC0623y m1444p = c0876k.m1444p();
            short m1438v = c0876k.m1438v();
            if (m1438v != -1) {
                boolean z = false;
                if (m1444p != null && (this instanceof AbstractC0623y) && (m3182a = m1444p.m3182a(m1438v)) != null && m1444p.m3188a((AbstractC0623y) this, m3182a)) {
                    z = true;
                }
                if (!z) {
                    m5811ci();
                }
            }
        }
        if (m1457d >= 21) {
            this.f1653cO = c0876k.m1454f();
        }
        if (m1457d >= 22) {
            if (m1457d < 24) {
                throw new IOException("extension >=22 but <24");
            }
            this.f1579bt = VariableScope.readInUnitOrPlaceholder(c0876k);
            this.f1580bu = VariableScope.readInUnitOrPlaceholder(c0876k);
        }
        if (m1457d >= 23) {
            this.f1581bv = VariableScope.readIn(c0876k);
        }
        if (m1457d >= 25) {
            this.f1582bw = C0424b.m5211a(c0876k);
            this.f1583bx = C0424b.m5211a(c0876k);
        }
        if (m1457d >= 26) {
            this.f1624cl = c0876k.m1453g();
        }
        if (this.isDead) {
            GameEngine gameEngine = GameEngine.getInstance();
            f1589bD.remove(this);
            gameEngine.f6121cc.m3787a(this);
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: a */
    public static BitmapOrTexture m5884a(BitmapOrTexture bitmapOrTexture) {
        return m5883a(bitmapOrTexture, bitmapOrTexture.mo396m(), bitmapOrTexture.mo397l());
    }

    /* renamed from: a */
    public static BitmapOrTexture m5883a(BitmapOrTexture bitmapOrTexture, int i, int i2) {
        BitmapOrTexture mo410a = bitmapOrTexture.mo410a(i, i2, false);
        bitmapOrTexture.m1032x();
        mo410a.mo398j();
        int mo396m = mo410a.mo396m();
        int mo397l = mo410a.mo397l();
        for (int i3 = 0; i3 < mo396m; i3++) {
            for (int i4 = 0; i4 < mo397l; i4++) {
                mo410a.mo411a(i3, i4, Color.argb(Color.m7284a(bitmapOrTexture.mo412a(i3, i4)), 0, 0, 0));
            }
        }
        mo410a.mo393p();
        mo410a.m1033s();
        bitmapOrTexture.m1031y();
        mo410a.m1041a("shadow:" + bitmapOrTexture.mo413a());
        mo410a.f6395n = true;
        return mo410a;
    }

    static {
        f1594bH.m7248a(true);
        f1594bH.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        f1595bI = new C0930ag();
        f1595bI.m7248a(true);
        f1596bJ = new LightingColorFilter(Color.m7283a(255, 255, 255), Color.m7283a(100, 100, 100));
        f1595bI.m7267a(255, 255, 255, 255);
        f1595bI.m7264a(f1596bJ);
        f1659cU = new Paint();
        f1660cV = new C0930ag();
        f1661cW = new C0930ag();
        f1662cX = new C0930ag();
        f1663cY = new C0930ag();
        f1664cZ = new C0930ag();
        f1665da = new C0930ag();
        f1666db = new Paint();
        f1667dc = new Paint();
        f1668dd = new Paint();
        f1669de = new C0930ag();
        f1670df = new C0930ag();
        f1671dg = new C0930ag();
        f1672dh = new C0930ag();
        f1673di = new Paint();
        f1659cU.m7260a(Paint.Style.STROKE);
        f1659cU.m7270a(2.0f);
        m5898a(f1659cU);
        f1660cV.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1660cV.m7260a(Paint.Style.STROKE);
        f1660cV.m7270a(2.0f);
        m5897a(f1660cV, true);
        f1661cW.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1661cW.m7260a(Paint.Style.STROKE);
        f1661cW.m7270a(2.0f);
        m5898a(f1661cW);
        f1662cX.m7267a(130, 0, 255, 0);
        f1662cX.m7260a(Paint.Style.STROKE);
        f1662cX.m7270a(2.0f);
        m5898a(f1662cX);
        f1666db.m7267a(70, 0, 255, 0);
        f1666db.m7260a(Paint.Style.STROKE);
        f1666db.m7270a(1.0f);
        m5898a(f1666db);
        f1663cY.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        f1663cY.m7260a(Paint.Style.STROKE);
        f1663cY.m7270a(2.0f);
        m5898a(f1663cY);
        f1667dc.m7267a(70, 255, 0, 0);
        f1667dc.m7260a(Paint.Style.STROKE);
        f1667dc.m7270a(1.0f);
        m5898a(f1667dc);
        f1665da.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        f1665da.m7260a(Paint.Style.STROKE);
        f1665da.m7270a(2.0f);
        m5898a(f1665da);
        f1668dd.m7267a(70, 255, 255, 0);
        f1668dd.m7260a(Paint.Style.STROKE);
        f1668dd.m7270a(1.0f);
        m5898a(f1668dd);
        f1664cZ.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        f1664cZ.m7260a(Paint.Style.STROKE);
        f1664cZ.m7270a(2.0f);
        m5898a(f1664cZ);
        f1669de.m7267a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1669de.m7260a(Paint.Style.STROKE);
        f1669de.m7270a(1.0f);
        m5898a(f1669de);
        f1670df.m7267a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1670df.m7260a(Paint.Style.STROKE);
        f1670df.m7270a(2.0f);
        m5898a(f1670df);
        f1671dg.m7267a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        f1671dg.m7260a(Paint.Style.STROKE);
        f1671dg.m7270a(1.0f);
        m5898a(f1671dg);
        f1672dh.m7260a(Paint.Style.STROKE);
        f1673di.m7260a(Paint.Style.STROKE);
        f1680dp = new RectF();
        f1681dq = new Paint();
        f1682dr = new Paint();
        f1683ds = new RectF();
        f1684dt = new Rect();
        f1685du = new Rect();
        f1686dv = new ArrayList();
        f1687dw = new ArrayList();
        f1689dy = new RectF();
        f1690dz = new RectF();
        f1691dA = new Rect();
        f1692dB = new PointF();
        f1693dC = new PointF();
        f1695dE = new PointF();
    }

    /* renamed from: bF */
    public static C1104o m5870bF() {
        f1590a.m549a();
        return f1590a;
    }

    /* renamed from: bG */
    public static void m5869bG() {
        f1590a.m549a();
    }

    /* renamed from: bH */
    public static void m5868bH() {
        AbstractC0529j.m3941dq();
        AbstractC0488d.m4506dq();
        AbstractC0525h.m3994K();
        AbstractC0590f.m3398L();
        AbstractC0309b.m5659K();
        if (GameEngine.getInstance().m1160ar()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                ((UnitType) it.next()).load();
            }
        } else {
            Builder.load();
            LaserDefence.load();
            Repairbay.load();
            Tree.load();
        }
        UnitType.m5727t();
    }

    /* renamed from: bI */
    public boolean m5867bI() {
        return false;
    }

    /* renamed from: bJ */
    public boolean mo4495bJ() {
        return false;
    }

    /* renamed from: bK */
    public static HashMap m5866bK() {
        HashMap hashMap = new HashMap();
        if (GameEngine.getInstance().m1160ar()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                UnitType unitType = (UnitType) it.next();
                Unit createInstance = unitType.createInstance(true);
                createInstance.mo2880a();
                createInstance.mo3120b(Team.f1370i);
                createInstance.f1626cn = true;
                hashMap.put(unitType, createInstance);
            }
        }
        Iterator it2 = C0453l.f3185d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l = (C0453l) it2.next();
            Unit m4748a = c0453l.m4748a(true);
            m4748a.mo2880a();
            m4748a.mo3120b(Team.f1370i);
            m4748a.f1626cn = true;
            hashMap.put(c0453l, m4748a);
        }
        return hashMap;
    }

    /* renamed from: bL */
    public static void m5865bL() {
        f1592bF = m5866bK();
        f1593bG = m5866bK();
        f1591bE = m5866bK();
    }

    /* renamed from: a */
    public static Unit m5890a(InterfaceC0303as interfaceC0303as) {
        return (Unit) f1591bE.get(interfaceC0303as);
    }

    /* renamed from: b */
    public static Unit m5871b(InterfaceC0303as interfaceC0303as) {
        return m5847c(interfaceC0303as);
    }

    /* renamed from: c */
    public static Unit m5847c(InterfaceC0303as interfaceC0303as) {
        Unit unit = (Unit) f1592bF.get(interfaceC0303as);
        if (unit == null) {
            if (C0453l.f2901b == null) {
                GameEngine.PrintLog("Could not find:" + interfaceC0303as.mo5706i() + " and missing place holder is null");
                return null;
            }
            unit = (Unit) f1592bF.get(C0453l.f2901b);
            if (unit == null) {
                GameEngine.PrintLog("name: " + C0453l.f2901b.f2920L);
                GameEngine.PrintLog("contains:" + f1592bF.containsKey(C0453l.f2901b));
                Iterator it = f1592bF.keySet().iterator();
                while (it.hasNext()) {
                    GameEngine.PrintLog("has:" + ((InterfaceC0303as) it.next()).mo5706i());
                }
                GameEngine.PrintLog("Could not find:" + interfaceC0303as.mo5706i() + " and missing place holder could not be found");
            }
        }
        return unit;
    }

    /* renamed from: d */
    public static Unit m5791d(InterfaceC0303as interfaceC0303as) {
        Unit unit = (Unit) f1593bG.get(interfaceC0303as);
        if (unit == null) {
            unit = (Unit) f1593bG.get(C0453l.f2901b);
        }
        return unit;
    }

    /* renamed from: bM */
    public static int m5864bM() {
        int i = 0;
        if (GameEngine.getInstance().m1160ar()) {
            Iterator it = EnumSet.allOf(UnitType.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + m5890a((UnitType) it.next()).mo3082bw();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Unit(boolean z) {
        super(z);
        this.f1577br = -9999;
        this.f1578bs = null;
        this.f1579bt = null;
        this.f1580bu = null;
        this.f1584by = -9999;
        this.f1585bz = -9999;
        this.f1586bA = -9999;
        this.f1598bL = false;
        this.f1599bM = false;
        this.f1600bN = false;
        this.f1601bO = false;
        this.f1602bP = null;
        this.collidable = true;
        this.isDead = false;
        this.f1607bU = 0L;
        this.f1610bX = 0.0f;
        this.f1611bY = 0.0f;
        this.f1612bZ = false;
        this.f1613ca = 0.0f;
        this.f1614cb = 0.0f;
        this.f1615cc = 0.0f;
        this.f1616cd = 0.0f;
        this.f1623ck = 1.0f;
        this.f1624cl = 1.0f;
        this.f1625cm = false;
        this.f1626cn = false;
        this.f1627co = false;
        this.f1628cp = false;
        this.f1629cq = false;
        this.f1630cr = false;
        this.f1644cF = -9999;
        this.f1646cH = 0.0f;
        this.f1647cI = true;
        this.f1650cL = null;
        this.f1651cM = null;
        this.f1652cN = null;
        this.f1653cO = -9999;
        this.f1674dj = -1;
        this.f1675dk = -1;
        this.f1676dl = -99;
        this.f1679do = 70.0f;
        this.f1696dF = new C0439f();
        this.f1697dG = new C0418c();
        this.f1698dH = null;
        m5860bR();
        if (!z) {
            this.f1597bK = true;
            f1589bD.m519a(this);
            f1590a.m545a(this);
        }
        this.f1584by = GameEngine.getInstance().f6096by;
        this.f1688dx = getUnitType();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0667ay, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2880a() {
        Team.m6389a(this);
        if (this.f1597bK) {
            f1589bD.remove(this);
            f1590a.m542b(this);
        }
        GameEngine.getInstance().f6111bS.m1976l(this);
        super.mo2880a();
    }

    /* renamed from: bN */
    public float mo3513bN() {
        return 3000.0f;
    }

    /* renamed from: s */
    public int m5758s(Unit unit) {
        return 0;
    }

    /* renamed from: bO */
    public boolean m5863bO() {
        return false;
    }

    /* renamed from: bP */
    public boolean m5862bP() {
        return false;
    }

    /* renamed from: bQ */
    public float m5861bQ() {
        return -1.0f;
    }

    /* renamed from: o */
    public void m5762o(float f) {
        this.f1631cs = f;
    }

    /* renamed from: bR */
    public void m5860bR() {
        m5904O(1);
    }

    /* renamed from: O */
    public void m5904O(int i) {
        int length;
        int mo3512bl = mo3512bl();
        if (mo3512bl < i) {
            mo3512bl = i;
        }
        if (this.f1648cJ == null) {
            length = 0;
            this.f1648cJ = new C0247ap[mo3512bl];
        } else if (this.f1648cJ.length < mo3512bl) {
            length = this.f1648cJ.length;
            this.f1648cJ = (C0247ap[]) Arrays.copyOf(this.f1648cJ, mo3512bl);
        } else {
            return;
        }
        for (int i2 = length; i2 < this.f1648cJ.length; i2++) {
            this.f1648cJ[i2] = new C0247ap();
        }
    }

    /* renamed from: a */
    public static void m5898a(Paint paint) {
        m5897a(paint, false);
    }

    /* renamed from: a */
    public static void m5897a(Paint paint, boolean z) {
        if (!GameEngine.m1157au() && z) {
            paint.m7270a(0.0f);
        }
    }

    /* renamed from: d */
    public float mo3996d(boolean z) {
        return this.direction + 90.0f;
    }

    /* renamed from: bS */
    public final boolean isActive() {
        return this.f1650cL == null && this.f1623ck >= 1.0f;
    }

    /* renamed from: a_ */
    public float m5878a_() {
        if (this.f1631cs < this.f1632ct) {
            return this.f1631cs / this.f1632ct;
        }
        return -1.0f;
    }

    /* renamed from: bT */
    public boolean m5858bT() {
        return true;
    }

    /* renamed from: bU */
    public float m5857bU() {
        if (this.f1623ck < 1.0f) {
            if (this.f1651cM == null || this.f1651cM.f1623ck >= 1.0f) {
                return this.f1623ck;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    /* renamed from: bV */
    public float m5856bV() {
        return -1.0f;
    }

    /* renamed from: bW */
    public boolean m5855bW() {
        return false;
    }

    /* renamed from: bX */
    public int m5854bX() {
        return -1;
    }

    /* renamed from: bY */
    public int m5853bY() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo469a(float f, boolean z) {
        float f2;
        int m2309b;
        int m2309b2;
        int m2309b3;
        int m2309b4;
        if (this.isDead || this.f1650cL != null) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        float f3 = this.radius;
        if (z) {
            return;
        }
        boolean z2 = false;
        int m5854bX = m5854bX();
        if (m5857bU() >= 0.0f) {
            z2 = true;
        }
        if (m5856bV() >= 0.0f) {
            z2 = true;
        }
        if (this.f1643cE || gameEngine.f6109bQ.showHp) {
            if (m5878a_() >= 0.0f) {
                z2 = true;
            }
            if (m5854bX >= 0) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        float f4 = this.f6951ek - gameEngine.f6138cv;
        float f5 = (this.f6952el - gameEngine.f6139cw) - this.height;
        float f6 = f3 + 4.0f;
        int i = 4;
        float f7 = 2.0f * f3;
        if (this.f1625cm) {
            f2 = 1.0f;
        } else {
            f2 = gameEngine.f6250cW;
        }
        if (f2 < 1.0f) {
            gameEngine.graphics.mo878k();
            gameEngine.m1217R();
            f4 *= gameEngine.f6250cW;
            f5 *= gameEngine.f6250cW;
            f6 *= gameEngine.f6250cW;
        }
        float f8 = 3.0f;
        if (this.f1643cE || gameEngine.f6109bQ.showHp) {
            if (m5878a_() >= 0.0f) {
                boolean z3 = false;
                boolean z4 = false;
                C0399m m5778dl = m5778dl();
                if (m5778dl != null) {
                    z3 = m5778dl.f2470p;
                    z4 = m5778dl.f2471q;
                }
                if (!z4) {
                    if (gameEngine.f6093bs.m6354c(this.team)) {
                        m2309b = CommonUtils.m2309b(200, 183, 44, 44);
                        m2309b2 = CommonUtils.m2309b(120, 255, 60, 60);
                    } else {
                        m2309b = CommonUtils.m2309b(200, 0, 150, 0);
                        m2309b2 = CommonUtils.m2309b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                    }
                    Paint m498a = C1117y.m498a(m2309b, Paint.Style.FILL);
                    Paint m498a2 = C1117y.m498a(m2309b2, Paint.Style.STROKE);
                    int i2 = 4;
                    if (z3) {
                        i2 = 1;
                    }
                    f1680dp.m7195a(f4 - f3, f5 + f6, (f4 - f3) + (f7 * m5878a_()), f5 + f6 + i2);
                    gameEngine.graphics.mo920a(f1680dp, m498a);
                    f1680dp.m7195a(f4 - f3, f5 + f6, (f4 - f3) + f7, f5 + f6 + i2);
                    gameEngine.graphics.mo920a(f1680dp, m498a2);
                    if (this.f1639cA != 0.0f && m5858bT() && gameEngine.f6109bQ.showHpChanges) {
                        float m5878a_ = m5878a_();
                        float f9 = m5878a_ + ((-this.f1639cA) / this.f1632ct);
                        if (f9 < 0.0f) {
                            f9 = 0.0f;
                        }
                        if (f9 >= 1.0f) {
                            f9 = 1.0f;
                        }
                        Paint m498a3 = C1117y.m498a(CommonUtils.m2309b(100, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 208, 26), Paint.Style.FILL);
                        f1680dp.m7195a((f4 - f3) + (f7 * m5878a_), f5 + f6, (f4 - f3) + (f7 * f9), f5 + f6 + i2);
                        gameEngine.graphics.mo920a(f1680dp, m498a3);
                    }
                }
            }
            if (m5854bX >= 0) {
                int m5853bY = m5853bY();
                float f10 = f7;
                if (m5853bY > 10) {
                    f10 += 20.0f;
                }
                float f11 = f4 - (f10 / 2.0f);
                float f12 = (int) ((f10 / m5853bY) + 0.5f);
                float f13 = f12 - 2.0f;
                for (int i3 = 1; i3 <= m5853bY; i3++) {
                    float f14 = f11 + ((i3 - 1) * f12);
                    f1680dp.m7195a(f14, f5 + f6 + 3.0f, f14 + f13, f5 + f6 + 3.0f + 3.0f);
                    if (m5854bX >= i3) {
                        gameEngine.graphics.mo920a(f1680dp, C1117y.m499a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.FILL));
                    }
                    gameEngine.graphics.mo920a(f1680dp, C1117y.m499a(110, 0, 0, 210, Paint.Style.STROKE));
                }
                f8 = 3.0f + 5.0f;
            }
        }
        if (m5856bV() >= 0.0f) {
            int i4 = 2 + 1;
            boolean m5855bW = m5855bW();
            f1680dp.m7195a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + (f7 * m5856bV()), f5 + f6 + i4 + 2 + f8);
            if (m5855bW) {
                m2309b3 = CommonUtils.m2309b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
            } else {
                m2309b3 = CommonUtils.m2309b(200, 23, 179, 207);
            }
            gameEngine.graphics.mo920a(f1680dp, C1117y.m498a(m2309b3, Paint.Style.FILL));
            f1680dp.m7195a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + f7, f5 + f6 + i4 + 2 + f8);
            if (m5855bW) {
                m2309b4 = CommonUtils.m2309b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
            } else {
                m2309b4 = CommonUtils.m2309b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
            }
            gameEngine.graphics.mo920a(f1680dp, C1117y.m498a(m2309b4, Paint.Style.STROKE));
            f8 += 2;
            i = 4;
        }
        if (m5857bU() >= 0.0f) {
            int i5 = i + 1;
            f1680dp.m7195a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + (f7 * m5857bU()), f5 + f6 + i5 + i + f8);
            gameEngine.graphics.mo920a(f1680dp, C1117y.m499a(200, 0, 0, 150, Paint.Style.FILL));
            f1680dp.m7195a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + f7, f5 + f6 + i5 + i + f8);
            gameEngine.graphics.mo920a(f1680dp, C1117y.m499a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.STROKE));
            float f15 = f8 + i;
        }
        if (f2 < 1.0f) {
            gameEngine.graphics.mo877l();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: d */
    public void mo461d(float f) {
    }

    /* renamed from: p */
    public void m5761p(float f) {
        if (!this.isDead && this.f1650cL == null && this.f1643cE) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (this.team == gameEngine.f6093bs || gameEngine.f6111bS.m1974m(this)) {
                if (gameEngine.f6109bQ.showUnitWaypoints && gameEngine.f6164dv <= 40) {
                    gameEngine.f6164dv++;
                    m5905O();
                }
                m5852bZ();
            }
            if (C1117y.m496a(this)) {
                m5819ca();
            }
        }
    }

    /* renamed from: bZ */
    public void m5852bZ() {
    }

    /* renamed from: O */
    public void m5905O() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0305au c0305au = null;
        C0305au c0305au2 = null;
        if (this instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) this;
            int m3131av = abstractC0623y.m3131av();
            float f = this.f6951ek;
            float f2 = this.f6952el;
            for (int i = 0; i < m3131av; i++) {
                C0305au m3044k = abstractC0623y.m3044k(i);
                if (m3044k != null) {
                    if (GameEngine.m1157au()) {
                        f1681dq.m7270a(2.0f);
                    } else {
                        f1681dq.m7270a(0.0f);
                    }
                    if (m3044k.m5676d() == EnumC0306av.f1811b) {
                        f1681dq.m7242b(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (m3044k.m5676d() == EnumC0306av.f1817h) {
                        f1681dq.m7242b(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (m3044k.m5676d() == EnumC0306av.f1812c) {
                        f1681dq.m7242b(Color.argb(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m3044k.m5676d() == EnumC0306av.f1813d) {
                        f1681dq.m7242b(Color.argb(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m3044k.m5676d() == EnumC0306av.f1814e || m3044k.m5676d() == EnumC0306av.f1818i) {
                        f1681dq.m7242b(Color.argb(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m3044k.m5676d() == EnumC0306av.f1816g) {
                        f1681dq.m7242b(Color.argb(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (m3044k.m5676d() == EnumC0306av.f1820k || m3044k.m5676d() == EnumC0306av.f1821l) {
                        f1681dq.m7242b(Color.argb(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (m3044k.m5676d() == EnumC0306av.f1819j) {
                        f1681dq.m7242b(Color.argb(160, 0, 210, 210));
                        if (c0305au == null) {
                            c0305au = m3044k;
                        } else {
                            c0305au2 = m3044k;
                        }
                    } else {
                        f1681dq.m7242b(Color.argb(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float m5670g = m3044k.m5670g();
                    float m5668h = m3044k.m5668h();
                    Unit m5666i = m3044k.m5666i();
                    if (m5666i != null && m3044k.m5672f() && !m5666i.m5867bI() && !m5666i.m5794d(gameEngine.f6093bs)) {
                        float m2280d = CommonUtils.m2280d(f, f2, m5670g, m5668h);
                        m5670g = f + (CommonUtils.m2249i(m2280d) * 400.0f);
                        m5668h = f2 + (CommonUtils.sin(m2280d) * 400.0f);
                    }
                    gameEngine.graphics.mo932a(f - gameEngine.f6138cv, f2 - gameEngine.f6139cw, m5670g - gameEngine.f6138cv, m5668h - gameEngine.f6139cw, f1681dq);
                    if (0 != 0) {
                        float m2314b = CommonUtils.m2314b(f, f2, m5670g, m5668h);
                        float m2280d2 = CommonUtils.m2280d(f, f2, m5670g, m5668h);
                        float f3 = gameEngine.f6111bS.f5162aN * m2314b;
                        float m2249i = f + (CommonUtils.m2249i(m2280d2) * f3);
                        float sin = f2 + (CommonUtils.sin(m2280d2) * f3);
                        f1680dp.m7195a(m2249i - 1.0f, sin - 1.0f, m2249i + 1.0f, sin + 1.0f);
                        f1680dp.m7196a(-gameEngine.f6138cv, -gameEngine.f6139cw);
                        gameEngine.graphics.mo920a(f1680dp, f1681dq);
                    }
                    f = m5670g;
                    f2 = m5668h;
                }
            }
        }
        if (c0305au != null && c0305au2 != null && c0305au != c0305au2) {
            f1681dq.m7242b(Color.argb(50, 0, 210, 210));
            C0305au c0305au3 = c0305au;
            gameEngine.graphics.mo932a(c0305au2.m5670g() - gameEngine.f6138cv, c0305au2.m5668h() - gameEngine.f6139cw, c0305au3.m5670g() - gameEngine.f6138cv, c0305au3.m5668h() - gameEngine.f6139cw, f1681dq);
        }
    }

    /* renamed from: ca */
    public void m5819ca() {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        Paint paint;
        boolean z = false;
        if (this.f1646cH != 0.0f) {
            this.f1646cH = CommonUtils.m2368a(this.f1646cH, f);
            if (this.f1646cH % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.f1643cE || z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (m5776dn()) {
                float f2 = this.f6951ek - gameEngine.f6138cv;
                float f3 = (this.f6952el - gameEngine.f6139cw) - this.height;
                Team team = gameEngine.f6093bs;
                if (team == this.team) {
                    if (this.displayRadius < 8.0f) {
                        paint = f1660cV;
                    } else {
                        paint = f1661cW;
                    }
                } else if (team.m6354c(this.team)) {
                    paint = f1663cY;
                } else if (this.team != null && gameEngine.f6120cb.m2635h()) {
                    f1659cU.m7242b(Team.m6321i(this.team.f1311q));
                    paint = f1659cU;
                } else {
                    paint = f1665da;
                }
                if (z) {
                    paint = f1664cZ;
                }
                if (m5867bI()) {
                    if (paint == f1661cW) {
                        paint = f1662cX;
                    }
                    Rect m5816cd = m5816cd();
                    if (m5816cd != null) {
                        f1680dp.m7194a(m5816cd);
                        f1680dp.f235b *= gameEngine.f6104bL.f785o;
                        f1680dp.f237d *= gameEngine.f6104bL.f785o;
                        f1680dp.f234a *= gameEngine.f6104bL.f784n;
                        f1680dp.f236c *= gameEngine.f6104bL.f784n;
                        float m5821cZ = m5821cZ();
                        f1680dp.m7196a(-(m5823cX() - gameEngine.f6104bL.f786p), -(m5822cY() - gameEngine.f6104bL.f787q));
                        CommonUtils.m2349a(f1680dp, m5821cZ);
                        f1680dp.m7196a(f2, f3);
                        gameEngine.graphics.mo932a(f1680dp.f234a - 11.0f, f1680dp.f235b, f1680dp.f236c + 11.0f, f1680dp.f235b, paint);
                        gameEngine.graphics.mo932a(f1680dp.f234a - 11.0f, f1680dp.f237d, f1680dp.f236c + 11.0f, f1680dp.f237d, paint);
                        gameEngine.graphics.mo932a(f1680dp.f234a, f1680dp.f235b - 11.0f, f1680dp.f234a, f1680dp.f237d + 11.0f, paint);
                        gameEngine.graphics.mo932a(f1680dp.f236c, f1680dp.f235b - 11.0f, f1680dp.f236c, f1680dp.f237d + 11.0f, paint);
                        return;
                    }
                    return;
                }
                float m1964r = this.displayRadius + gameEngine.f6111bS.m1964r(this);
                if (gameEngine.m1206a(f2, f3, m1964r)) {
                    gameEngine.graphics.mo931a(f2, f3, m1964r, paint);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        return true;
    }

    /* renamed from: cb */
    public Rect m5818cb() {
        return f1685du;
    }

    /* renamed from: cc */
    public Rect m5817cc() {
        return f1685du;
    }

    /* renamed from: cd */
    public Rect m5816cd() {
        return m5818cb();
    }

    /* renamed from: v */
    public BitmapOrTexture mo5658v() {
        return null;
    }

    /* renamed from: f */
    public boolean m5768f(float f) {
        Paint paint;
        BitmapOrTexture mo5658v = mo5658v();
        if (mo5658v == null) {
            return false;
        }
        if (this.isDead) {
            return true;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.graphics.mo877l();
        float f2 = (int) (this.f6951ek - gameEngine.f6138cv);
        float f3 = (int) (this.f6952el - gameEngine.f6139cw);
        float f4 = f2 * gameEngine.f6250cW;
        float f5 = f3 * gameEngine.f6250cW;
        if (this.f1643cE) {
            paint = f1595bI;
        } else {
            paint = f1594bH;
        }
        gameEngine.graphics.mo915a(mo5658v, f4, f5, paint);
        gameEngine.graphics.mo878k();
        gameEngine.m1218Q();
        return true;
    }

    /* renamed from: a */
    public boolean m5882a(GameEngine gameEngine) {
        if (!gameEngine.f6245cN.m7189b(this.f6951ek, this.f6952el) || this.f1650cL != null) {
            return false;
        }
        if ((this.f1652cN != null && (this.f1652cN.f2482I || this.f1652cN.f2479C)) || !m5794d(gameEngine.f6093bs)) {
            return false;
        }
        return true;
    }

    /* renamed from: b_ */
    public boolean m5851b_() {
        return true;
    }

    /* renamed from: ce */
    public final boolean m5815ce() {
        return m5794d(GameEngine.getInstance().f6093bs);
    }

    /* renamed from: d */
    public boolean m5794d(Team team) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        if ((this.team != team || this.f1651cM != null) && c0173b.f840E && team.f1336M != null) {
            c0173b.m6652a(this.f6951ek, this.f6952el);
            int i = c0173b.f800T;
            int i2 = c0173b.f801U;
            if (c0173b.m6608c(i, i2) && team.f1336M[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: cf */
    public boolean m5814cf() {
        return true;
    }

    /* renamed from: c_ */
    public void m5820c_() {
        if (this.isDead) {
            this.collidable = false;
        } else {
            this.collidable = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        C0745e m2537b;
        if (!this.isDead) {
            if (this.f1633cu > 0.0f) {
                if (this.f1633cu > this.f1632ct * 2.0f) {
                    this.f1633cu = this.f1632ct * 2.0f;
                }
                this.f1633cu = CommonUtils.m2368a(this.f1633cu, f);
            }
            if (this.f1631cs < this.f1632ct * 0.33f && this.height > -1.0f) {
                GameEngine gameEngine = GameEngine.getInstance();
                this.f1677dm += f;
                this.f1678dn += f;
                this.f1679do += f;
                if (this.f1677dm > 10.0f && this.f1678dn < 300.0f && !m5780dj()) {
                    this.f1677dm = 0.0f;
                    if (this.f6948eh && gameEngine.f6253dc && (m2537b = gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4702a, false, EnumC0748h.f4826a)) != null) {
                        C0746f.m2511b(m2537b, true);
                        m2537b.f4732J = this.f6951ek;
                        m2537b.f4733K = this.f6952el;
                        m2537b.f4734L = this.height;
                        m2537b.f4739Q += CommonUtils.rnd(-0.1f, 0.1f) + this.f1613ca;
                        m2537b.f4740R += CommonUtils.rnd(-0.1f, 0.1f) + this.f1614cb;
                        m2537b.f4732J += CommonUtils.rnd(-4.0f, 4.0f);
                        m2537b.f4733K += CommonUtils.rnd(-4.0f, 4.0f);
                    }
                }
                if (this.f1679do > 30.0f && this.f1678dn < 600.0f && !m5779dk()) {
                    this.f1679do = 0.0f;
                    gameEngine.effects.m2566a();
                    C0745e m2537b2 = gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4702a, false, EnumC0748h.f4826a);
                    if (m2537b2 != null) {
                        C0746f.m2516a(m2537b2, true);
                        m2537b2.f4732J = this.f6951ek;
                        m2537b2.f4733K = this.f6952el;
                        m2537b2.f4734L = this.height;
                        m2537b2.f4739Q += CommonUtils.rnd(-0.1f, 0.1f);
                        m2537b2.f4740R += CommonUtils.rnd(-0.1f, 0.1f);
                        m2537b2.f4732J += CommonUtils.rnd(-4.0f, 4.0f);
                        m2537b2.f4733K += CommonUtils.rnd(-4.0f, 4.0f);
                    }
                }
            } else if (this.f1678dn != 0.0f) {
                this.f1678dn = 0.0f;
            }
            if (this.f1639cA != 0.0f) {
                this.f1639cA = CommonUtils.m2368a(this.f1639cA, this.f1632ct * this.f1640cB * 0.005f * f);
                this.f1640cB += f + (0.2f * this.f1640cB * f);
                if (this.f1639cA == 0.0f) {
                    this.f1640cB = 0.0f;
                }
            }
            if (this.f1631cs <= 0.0f) {
                m5813cg();
            }
        }
    }

    /* renamed from: b */
    public float m5872b(Unit unit, float f, Projectile projectile) {
        float f2 = f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (projectile != null) {
            f3 = projectile.f1036ak;
            f4 = projectile.f1037al;
            f5 = projectile.f1038am;
        }
        if (this.f1634cv < this.f1637cy) {
            float f6 = f2 * f3;
            if (this.f1637cy - this.f1634cv > f6) {
                this.f1634cv += f6;
                f2 -= f6 * f4;
            } else {
                this.f1634cv = this.f1637cy;
                f2 -= f6 * f4;
            }
        }
        if (f2 > 0.0f && this.f1631cs < this.f1632ct) {
            float f7 = f2 * f5;
            float f8 = this.f1632ct - this.f1631cs;
            if (f8 > f7) {
                m5762o(this.f1631cs + f7);
                return 0.0f;
            }
            m5762o(this.f1632ct);
            float f9 = f2 - f8;
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    public boolean m5906J() {
        return false;
    }

    /* renamed from: a */
    public float mo4499a(Unit unit, float f, Projectile projectile) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1623ck < 1.0f) {
            f *= 1.75f;
        }
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (projectile != null) {
            f2 = projectile.f1036ak;
            f3 = projectile.f1037al;
            f4 = projectile.f1038am;
        }
        float f5 = f;
        float f6 = 0.0f;
        if (this.f1636cx == 0.0f && this.f1634cv > 0.0f) {
            float f7 = f5 * f2;
            if (this.f1634cv < f7) {
                f5 -= this.f1634cv * f3;
                f6 = 0.0f + this.f1634cv;
                this.f1635cw += this.f1634cv;
                this.f1634cv = 0.0f;
            } else {
                this.f1634cv -= f7;
                this.f1635cw += f7;
                f6 = 0.0f + f7;
                f5 -= f5 * f3;
            }
        }
        if (f5 > 0.0f) {
            float f8 = f5 * f4;
            if (this.f1631cs < f8) {
                f5 -= this.f1631cs;
                float f9 = f6 + this.f1631cs;
                m5762o(0.0f);
                this.f1639cA += this.f1631cs;
            } else {
                m5762o(this.f1631cs - f8);
                float f10 = f6 + f8;
                f5 -= f8;
                this.f1639cA -= f8;
            }
        }
        this.f1577br = gameEngine.f6096by;
        if (unit != null) {
            this.f1578bs = unit;
        } else {
            this.f1578bs = null;
        }
        m5813cg();
        return f5;
    }

    /* renamed from: q */
    public Unit m5760q(float f) {
        if (GameEngine.getInstance().f6096by - (f * 1000.0f) < this.f1577br) {
            return this.f1578bs;
        }
        return null;
    }

    /* renamed from: cg */
    public void m5813cg() {
        if (!this.isDead && this.f1631cs <= 0.0f) {
            mo3083bv();
        }
    }

    /* renamed from: n */
    public void mo4207n() {
    }

    /* renamed from: e */
    public boolean mo5648e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        return false;
    }

    /* renamed from: bt */
    public void mo3085bt() {
    }

    /* renamed from: bu */
    public void mo3084bu() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6111bS.m1976l(this);
        Team.m6389a(this);
        if (f1589bD.remove(this)) {
        }
        this.isDead = true;
        this.f1607bU = gameEngine.f6096by;
        if (this.f1631cs > 0.0f) {
            this.f1631cs = 0.0f;
        }
        if (this.f1648cJ != null) {
            int mo3512bl = mo3512bl();
            for (int i = 0; i < mo3512bl; i++) {
                this.f1648cJ[i].f1720j = null;
            }
        }
        gameEngine.f6121cc.m3787a(this);
    }

    /* renamed from: ch */
    public void m5812ch() {
        mo3084bu();
        mo2880a();
        mo3085bt();
    }

    /* renamed from: ci */
    public void m5811ci() {
        this.f1631cs = -1.0f;
    }

    /* renamed from: bv */
    public void mo3083bv() {
        mo3084bu();
        if (!mo5648e()) {
            mo2880a();
        }
        mo3085bt();
    }

    /* renamed from: a */
    public boolean m5896a(RectF rectF) {
        if (this.f6951ek + this.radius > rectF.f234a && this.f6951ek - this.radius < rectF.f236c && this.f6952el + this.radius > rectF.f235b && this.f6952el - this.radius < rectF.f237d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m5850c(float f, float f2, float f3) {
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f, f2);
        float f4 = this.radius + f3;
        if (m2366a < f4 * f4) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m5756t(Unit unit) {
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el);
        float f = this.radius + unit.radius;
        if (m2366a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m5902P(int i) {
        Team m6317k = Team.m6317k(i);
        if (m6317k == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        m5773e(m6317k);
    }

    /* renamed from: e */
    public void m5773e(Team team) {
        if (this.team == team) {
            return;
        }
        if (team == null) {
            throw new RuntimeException("Could not set team to null");
        }
        if (this.team != null) {
            Team.m6369b(this);
            this.team.m6341d(this);
        }
        mo3120b(team);
        Team.m6353c(this);
        if (team != Team.f1370i) {
            mo3073c(false);
        }
    }

    /* renamed from: b */
    public void mo3120b(Team team) {
        if (team == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.team = team;
    }

    /* renamed from: Q */
    public final void m5901Q(int i) {
        this.team = Team.m6317k(i);
        if (this.team == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        mo3120b(this.team);
    }

    /* renamed from: N */
    public ArrayList mo3520N() {
        return f1686dv;
    }

    /* renamed from: V */
    public int mo3230V() {
        return 1;
    }

    /* renamed from: a */
    public void mo3519a(Action action, boolean z) {
    }

    /* renamed from: a */
    public void m5892a(Action action, boolean z, PointF pointF, Unit unit) {
        mo3519a(action, z);
    }

    /* renamed from: b */
    public void m5874b(Action action, boolean z) {
    }

    /* renamed from: b */
    public void m5875b(Action action) {
    }

    /* renamed from: a */
    public Action m5893a(C0208c c0208c) {
        ArrayList mo3520N = mo3520N();
        int size = mo3520N.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) mo3520N.get(i);
            if (action.m6076d(c0208c)) {
                return action;
            }
        }
        return null;
    }

    /* renamed from: cj */
    public boolean m5810cj() {
        if (m5867bI()) {
            return Action.m6080c(m5808cl());
        }
        return false;
    }

    /* renamed from: ck */
    public boolean m5809ck() {
        return false;
    }

    /* renamed from: cl */
    public C0208c m5808cl() {
        return Action.f1461i;
    }

    /* renamed from: cm */
    public float m5807cm() {
        return -1.0f;
    }

    /* renamed from: cn */
    public boolean m5806cn() {
        return false;
    }

    /* renamed from: a */
    public void m5881a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: co */
    public C0208c m5805co() {
        return Action.f1461i;
    }

    /* renamed from: e */
    public Action m5771e(InterfaceC0303as interfaceC0303as) {
        return null;
    }

    /* renamed from: cp */
    public final int m5804cp() {
        int i = 0;
        Iterator it = mo3520N().iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (action.mo4245b(this) || action.mo6178s()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m5848c(Unit unit, boolean z) {
        Unit unit2 = unit.f1650cL;
        AbstractC0623y abstractC0623y = unit.f1651cM;
        unit.f1650cL = null;
        unit.f1651cM = null;
        boolean m5792d = m5792d(unit, z);
        unit.f1650cL = unit2;
        unit.f1651cM = abstractC0623y;
        return m5792d;
    }

    /* renamed from: d */
    public boolean m5792d(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean m5772e(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: cq */
    public boolean m5803cq() {
        return false;
    }

    /* renamed from: cr */
    public boolean m5802cr() {
        return mo3293i();
    }

    /* renamed from: cs */
    public boolean m5801cs() {
        return false;
    }

    /* renamed from: ct */
    public boolean m5800ct() {
        return false;
    }

    /* renamed from: P */
    public boolean m5903P() {
        return false;
    }

    /* renamed from: cu */
    public int m5799cu() {
        return 1;
    }

    /* renamed from: y */
    public int mo3492y() {
        return 85;
    }

    /* renamed from: f */
    public float mo3503f(InterfaceC0303as interfaceC0303as) {
        return interfaceC0303as.mo5715a(this) + mo3492y();
    }

    /* renamed from: u */
    public int mo3495u(Unit unit) {
        return mo3492y() + unit.getUnitType().mo5715a(this);
    }

    /* renamed from: v */
    public int mo3494v(Unit unit) {
        return mo3492y() + unit.getUnitType().mo5715a(this);
    }

    /* renamed from: w */
    public boolean m5754w(Unit unit) {
        return false;
    }

    /* renamed from: x */
    public boolean m5753x(Unit unit) {
        return false;
    }

    /* renamed from: b */
    public float m5873b(Unit unit) {
        return 1.0f;
    }

    /* renamed from: c */
    public float m5849c(Unit unit) {
        return 0.2f;
    }

    /* renamed from: y */
    public boolean m5752y(Unit unit) {
        boolean z = false;
        if (unit.mo4209g() > 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    public float m5751z(Unit unit) {
        float m5849c = m5849c(unit) * 5.1f;
        if (unit.mo4209g() > 0.0f) {
            m5849c = unit.mo4209g();
        }
        return m5849c;
    }

    /* renamed from: cv */
    public float m5798cv() {
        return 1.0f;
    }

    /* renamed from: cw */
    public float mo4491cw() {
        return 0.0f;
    }

    /* renamed from: cx */
    public C0439f m5797cx() {
        float mo4491cw = mo4491cw();
        if (mo4491cw == 0.0f) {
            return C0439f.f2800a;
        }
        C0439f c0439f = new C0439f();
        c0439f.m5107b(C0428a.f2761B, mo4491cw);
        return c0439f;
    }

    /* renamed from: cy */
    public C0439f m5796cy() {
        return C0439f.f2800a;
    }

    /* renamed from: cz */
    public String m5795cz() {
        return getUnitType().mo5706i() + "(id:" + this.f6945ed + ")";
    }

    /* renamed from: f */
    public static String m5765f(Unit unit, boolean z) {
        if (unit != null) {
            return unit.getUnitType().mo5710e();
        }
        return "No unit";
    }

    /* renamed from: A */
    public static String m5908A(Unit unit) {
        if (unit != null) {
            return unit.m5845cA();
        }
        return "<null unit>";
    }

    /* renamed from: cA */
    public String m5845cA() {
        String str = getUnitType().mo5706i() + "(pos:" + ((int) this.f6951ek) + "," + ((int) this.f6952el) + " id:" + this.f6945ed + VariableScope.nullOrMissingString;
        if (this.team != null) {
            str = str + " t:" + this.team.f1305k;
        }
        if (this.isDead) {
            str = str + " [dead]";
        }
        if (this.f6946ef) {
            str = str + " [deleted]";
        }
        return str + ")";
    }

    /* renamed from: cB */
    public String m5844cB() {
        String str = (getUnitType().mo5706i() + "(pos:" + ((int) this.f6951ek) + "," + ((int) this.f6952el) + " id:" + this.f6945ed + VariableScope.nullOrMissingString) + ", hp:" + this.f1631cs + ", dead:" + this.isDead + ", deleted:" + this.f6946ef + " tags:" + m5787dc();
        if (this.team != null) {
            str = str + " t:" + this.team.f1305k;
        }
        return str + ")";
    }

    /* renamed from: cC */
    public float m5843cC() {
        return 1.0f;
    }

    /* renamed from: cD */
    public RectF m5842cD() {
        GameEngine gameEngine = GameEngine.getInstance();
        float m5843cC = m5843cC();
        f1689dy.m7195a((this.f6951ek - (this.f4225eq * m5843cC)) - gameEngine.f6138cv, (this.f6952el - (this.f4226er * m5843cC)) - gameEngine.f6139cw, (this.f6951ek + (this.f4225eq * m5843cC)) - gameEngine.f6138cv, (this.f6952el + (this.f4226er * m5843cC)) - gameEngine.f6139cw);
        return f1689dy;
    }

    /* renamed from: cE */
    public RectF mo4492cE() {
        GameEngine gameEngine = GameEngine.getInstance();
        RectF rectF = f1689dy;
        float f = gameEngine.f6138cv;
        float f2 = gameEngine.f6139cw;
        float f3 = this.f4225eq;
        float f4 = this.f4226er;
        rectF.f234a = (this.f6951ek - f3) - f;
        rectF.f236c = (this.f6951ek + f3) - f;
        rectF.f235b = (this.f6952el - f4) - f2;
        rectF.f237d = (this.f6952el + f4) - f2;
        return rectF;
    }

    /* renamed from: cF */
    public boolean m5841cF() {
        return false;
    }

    /* renamed from: a_ */
    public Rect m5876a_(boolean z) {
        f1691dA.f230a = 0;
        f1691dA.f231b = 0;
        f1691dA.f232c = 0 + this.f4223eo;
        f1691dA.f233d = 0 + this.f4224ep;
        return f1691dA;
    }

    /* renamed from: a */
    public Rect m5880a(boolean z, int i) {
        int i2 = 0 + (i * this.f4223eo);
        f1691dA.m7208a(i2, 0, i2 + this.f4223eo, 0 + this.f4224ep);
        return f1691dA;
    }

    /* renamed from: a */
    public Rect m5879a(boolean z, int i, int i2) {
        int i3 = this.f4223eo;
        int i4 = this.f4224ep;
        int i5 = i * i3;
        int i6 = i2 * i4;
        f1691dA.f230a = i5;
        f1691dA.f231b = i6;
        f1691dA.f232c = i5 + i3;
        f1691dA.f233d = i6 + i4;
        return f1691dA;
    }

    /* renamed from: a */
    public boolean m5891a(Unit unit, float f) {
        return false;
    }

    /* renamed from: a_ */
    public void setType(String str) {
    }

    /* renamed from: cG */
    public final boolean m5840cG() {
        if (!m5838cI() || this.height > 2.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: cH */
    public boolean m5839cH() {
        return C1117y.m481b(this.f6951ek, this.f6952el);
    }

    /* renamed from: cI */
    public boolean m5838cI() {
        return C1117y.m476c(this.f6951ek, this.f6952el);
    }

    /* renamed from: cJ */
    public boolean m5837cJ() {
        return C1117y.m474d(this.f6951ek, this.f6952el);
    }

    /* renamed from: bw */
    public int mo3082bw() {
        return (((0 * 31) + ((int) mo3513bN())) * 31) + ((int) this.f1632ct);
    }

    /* renamed from: cK */
    public int m5836cK() {
        return getUnitType().mo5714b(mo3230V());
    }

    /* renamed from: cL */
    public C0424b m5835cL() {
        return getUnitType().mo5711d(mo3230V());
    }

    /* renamed from: cM */
    public C0424b m5834cM() {
        return null;
    }

    /* renamed from: a */
    public PointF m5900a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.f1647cI) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF mo3038m = mo3038m(f6);
                f6 = CommonUtils.m2314b(f, f2, mo3038m.x, mo3038m.y) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF mo3038m2 = mo3038m(f6);
        float m2366a = CommonUtils.m2366a(f, f2, mo3038m2.x, mo3038m2.y);
        if (f5 >= 0.0f && f5 * f5 < m2366a) {
            float m2280d = CommonUtils.m2280d(f, f2, mo3038m2.x, mo3038m2.y);
            mo3038m2.x = f + (CommonUtils.m2249i(m2280d) * f5);
            mo3038m2.y = f2 + (CommonUtils.sin(m2280d) * f5);
        }
        f1692dB.m7212a(mo3038m2);
        return f1692dB;
    }

    /* renamed from: m */
    PointF mo3038m(float f) {
        f1693dC.m7213a(this.f6951ek + (this.f1613ca * f), this.f6952el + (this.f1614cb * f));
        return f1693dC;
    }

    /* renamed from: o */
    public boolean mo4206o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo4205p() {
        return false;
    }

    /* renamed from: cN */
    public boolean m5833cN() {
        return false;
    }

    /* renamed from: f */
    public void m5766f(Team team) {
        if (mo4205p()) {
            mo3120b(Team.f1370i);
        } else {
            mo3120b(team);
        }
    }

    /* renamed from: B */
    public void m5907B(Unit unit) {
        if (unit instanceof EditorOrBuilder) {
            unit = null;
        }
        this.f1579bt = unit;
    }

    /* renamed from: cO */
    public void m5832cO() {
    }

    /* renamed from: g */
    public float mo4209g() {
        return 0.0f;
    }

    /* renamed from: cP */
    public int m5831cP() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: cQ */
    public C0449h m5830cQ() {
        return null;
    }

    /* renamed from: g */
    public boolean mo3501g(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: h */
    public boolean m5763h(Unit unit, boolean z) {
        return mo3501g(unit, z);
    }

    /* renamed from: cR */
    public int m5829cR() {
        return 500;
    }

    /* renamed from: c */
    public boolean m5846c(AbstractC0623y abstractC0623y) {
        int m5831cP = m5831cP();
        if (m5831cP < Integer.MAX_VALUE && m5790d(abstractC0623y) >= m5831cP) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m5790d(AbstractC0623y abstractC0623y) {
        C0305au m3135ar;
        int i = 0;
        Team team = abstractC0623y.team;
        Unit[] m523a = f1589bD.m523a();
        int size = f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == team && (unit instanceof AbstractC0623y) && (m3135ar = ((AbstractC0623y) unit).m3135ar()) != null && m3135ar.m5676d() == EnumC0306av.f1816g && m3135ar.f1800h == this && unit != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m5770e(AbstractC0623y abstractC0623y) {
        C0305au m3135ar;
        int i = 0;
        Team team = abstractC0623y.team;
        Unit[] m523a = f1589bD.m523a();
        int size = f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == team && (unit instanceof AbstractC0623y) && (m3135ar = ((AbstractC0623y) unit).m3135ar()) != null && m3135ar.m5676d() == EnumC0306av.f1813d && m3135ar.f1800h == this && unit != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bl */
    public int mo3512bl() {
        return 1;
    }

    /* renamed from: u */
    public boolean m5755u() {
        return false;
    }

    /* renamed from: cS */
    public boolean m5828cS() {
        return m5755u() || this.f1623ck < 1.0f || this.team == Team.f1369h;
    }

    /* renamed from: t */
    public boolean m5757t() {
        return false;
    }

    /* renamed from: cT */
    public boolean m5827cT() {
        return m5757t();
    }

    /* renamed from: cU */
    public boolean m5826cU() {
        return false;
    }

    /* renamed from: d */
    public boolean m5793d(Unit unit) {
        return true;
    }

    /* renamed from: g */
    public void m5764g(Team team) {
        if (this.f1694dD == null || this.f1694dD.length != Team.f1364c) {
            this.f1694dD = new C0245an[Team.f1364c];
            for (int i = 0; i < this.f1694dD.length; i++) {
                this.f1694dD[i] = new C0245an();
            }
        }
        C0245an c0245an = this.f1694dD[team.f1305k];
        if (this.isDead) {
            if (c0245an.f1699a && m5794d(team)) {
                c0245an.f1699a = false;
            }
        } else if (m5794d(team)) {
            c0245an.f1699a = true;
            c0245an.f1700b = mo3230V();
        }
    }

    /* renamed from: cV */
    public void m5825cV() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6093bs != null && this.team != gameEngine.f6093bs && gameEngine.f6093bs.f1305k >= 0 && gameEngine.f6093bs.f1305k < Team.f1364c) {
            C0245an c0245an = this.f1694dD[gameEngine.f6093bs.f1305k];
            if (c0245an.f1701c != null && c0245an.f1701c.f4643c) {
                c0245an.f1701c = null;
            }
            if (c0245an.f1701c == null && c0245an.f1699a && !m5794d(gameEngine.f6093bs)) {
                C0741a c0741a = new C0741a();
                c0245an.f1701c = c0741a;
                c0741a.f4644d = getUnitType();
                c0741a.f4646g = this.f6951ek;
                c0741a.f4647h = this.f6952el;
                c0741a.f4653n = false;
                c0741a.f4645e = this.team;
                c0741a.f4667f = c0245an.f1700b;
                c0741a.f4649j = gameEngine.f6093bs;
                c0741a.f4657u = m5851b_();
                c0741a.f4658v = this;
            }
        }
    }

    /* renamed from: cW */
    public PointF m5824cW() {
        f1695dE.m7213a(0.0f, 0.0f);
        return f1695dE;
    }

    /* renamed from: cX */
    public float m5823cX() {
        return GameEngine.getInstance().f6104bL.f786p;
    }

    /* renamed from: cY */
    public float m5822cY() {
        return GameEngine.getInstance().f6104bL.f787q;
    }

    /* renamed from: cZ */
    public float m5821cZ() {
        GameEngine gameEngine = GameEngine.getInstance();
        return gameEngine.f6104bL.f786p + 2 + gameEngine.f6111bS.m1964r(this);
    }

    /* renamed from: a */
    public Point m5895a(C0173b c0173b, Point point) {
        point.f224a = (int) (((this.f6951ek - m5823cX()) + 1.0f) * c0173b.f788r);
        point.f225b = (int) (((this.f6952el - m5822cY()) + 1.0f) * c0173b.f789s);
        return point;
    }

    /* renamed from: a */
    public RectF m5894a(C0173b c0173b, RectF rectF) {
        c0173b.m6648a((int) (((this.f6951ek - m5823cX()) + 1.0f) * c0173b.f788r), (int) (((this.f6952el - m5822cY()) + 1.0f) * c0173b.f789s));
        float f = c0173b.f800T;
        float f2 = c0173b.f801U;
        Rect m5817cc = m5817cc();
        rectF.m7195a(f + (m5817cc.f230a * c0173b.f784n), f2 + (m5817cc.f231b * c0173b.f785o), f + ((m5817cc.f232c + 1) * c0173b.f784n), f2 + ((m5817cc.f233d + 1) * c0173b.f785o));
        return rectF;
    }

    /* renamed from: da */
    public void m5789da() {
    }

    /* renamed from: db */
    public boolean m5788db() {
        return false;
    }

    /* renamed from: q */
    public boolean mo4203q() {
        return false;
    }

    /* renamed from: dc */
    public C0449h m5787dc() {
        return null;
    }

    /* renamed from: dd */
    public C0439f m5786dd() {
        return this.f1696dF;
    }

    /* renamed from: a */
    public double m5886a(C0428a c0428a) {
        return this.f1696dF.m5123a(c0428a);
    }

    /* renamed from: de */
    public C0418c m5785de() {
        return this.f1697dG;
    }

    /* renamed from: df */
    public C0449h m5784df() {
        return null;
    }

    /* renamed from: bd */
    public float mo3101bd() {
        return 0.0f;
    }

    /* renamed from: dg */
    public void m5783dg() {
    }

    /* renamed from: dh */
    public void m5782dh() {
    }

    /* renamed from: di */
    public boolean m5781di() {
        return false;
    }

    /* renamed from: dj */
    public boolean m5780dj() {
        return m5863bO();
    }

    /* renamed from: dk */
    public boolean m5779dk() {
        return m5863bO();
    }

    /* renamed from: dl */
    public final C0399m m5778dl() {
        return this.f1652cN;
    }

    public String toString() {
        return "unit(id=" + this.f6945ed + ",type=" + getUnitType().mo5706i() + ")";
    }

    /* renamed from: r */
    public void m5759r(float f) {
        if (f >= 1.0f) {
            if (!(this.f1623ck >= 1.0f)) {
                Team.m6369b(this);
                this.f1623ck = 1.0f;
                Team.m6353c(this);
                return;
            }
            return;
        }
        if (this.f1623ck >= 1.0f) {
            Team.m6369b(this);
            this.f1623ck = f;
            Team.m6353c(this);
            return;
        }
        this.f1623ck = f;
    }

    /* renamed from: a */
    public final void m5889a(EnumC0347ae enumC0347ae) {
        m5887a(enumC0347ae, (Unit) null, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public final void m5888a(EnumC0347ae enumC0347ae, Unit unit) {
        m5887a(enumC0347ae, unit, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public void m5887a(EnumC0347ae enumC0347ae, Unit unit, C0449h c0449h, VariableScope variableScope) {
    }

    /* renamed from: h */
    public void mo3057h(float f) {
        this.direction = f;
    }

    /* renamed from: a */
    public int m5885a(C0448g c0448g) {
        return 0;
    }

    /* renamed from: e */
    public C1101m m5769e(boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean m5899a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public void mo3073c(boolean z) {
    }

    /* renamed from: dm */
    public float m5777dm() {
        return this.radius;
    }

    /* renamed from: dn */
    public boolean m5776dn() {
        return true;
    }

    /* renamed from: bC */
    public void mo3107bC() {
    }

    /* renamed from: do */
    public final C0424b m5775do() {
        return this.f1698dH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.am] */
    /* renamed from: dp */
    public final Unit m5774dp() {
        AbstractC0623y abstractC0623y = this.f1651cM;
        if (abstractC0623y == null && this.f1650cL != null) {
            abstractC0623y = this.f1650cL;
        }
        return abstractC0623y;
    }

    /* renamed from: f */
    public void m5767f(float f, float f2) {
        this.f6951ek = f;
        this.f6952el = f2;
        mo3073c(true);
    }
}
