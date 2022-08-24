package com.corrodinggames.rts.game.p010a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a;
import com.corrodinggames.rts.game.p010a.p011a.EnumC0152b;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.DamagingBorder;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.air.AmphibiousJet;
import com.corrodinggames.rts.game.units.buildings.AirFactory;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.buildings.LandFactory;
import com.corrodinggames.rts.game.units.buildings.SeaFactory;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.water.AttackSubmarine;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a.class */
public final class C0136a extends Team {

    /* renamed from: ar */
    public static boolean f552ar;

    /* renamed from: as */
    final int f553as = 3000;

    /* renamed from: at */
    int f554at;

    /* renamed from: au */
    int f555au;

    /* renamed from: av */
    int f556av;

    /* renamed from: aw */
    int f557aw;

    /* renamed from: ax */
    int f558ax;

    /* renamed from: ay */
    int f559ay;

    /* renamed from: az */
    int f560az;

    /* renamed from: aA */
    int f561aA;

    /* renamed from: aB */
    int f562aB;

    /* renamed from: aC */
    int f563aC;

    /* renamed from: aD */
    int f564aD;

    /* renamed from: aE */
    int f565aE;

    /* renamed from: aF */
    int f566aF;

    /* renamed from: aG */
    int f567aG;

    /* renamed from: aH */
    public int f568aH;

    /* renamed from: aI */
    int f569aI;

    /* renamed from: aJ */
    boolean f570aJ;

    /* renamed from: aK */
    float f571aK;

    /* renamed from: aL */
    float f572aL;

    /* renamed from: aM */
    float f573aM;

    /* renamed from: aN */
    float f574aN;

    /* renamed from: aO */
    float f575aO;

    /* renamed from: aP */
    float f576aP;

    /* renamed from: aQ */
    float f577aQ;

    /* renamed from: aR */
    float f578aR;

    /* renamed from: aS */
    float f579aS;

    /* renamed from: aT */
    float f580aT;

    /* renamed from: aU */
    int f581aU;

    /* renamed from: aV */
    float f582aV;

    /* renamed from: aW */
    public boolean f583aW;

    /* renamed from: aX */
    public boolean f584aX;

    /* renamed from: aY */
    public boolean f585aY;

    /* renamed from: aZ */
    int f586aZ;

    /* renamed from: ba */
    int f587ba;

    /* renamed from: bb */
    int f588bb;

    /* renamed from: bc */
    boolean f589bc;

    /* renamed from: bd */
    boolean f590bd;

    /* renamed from: be */
    boolean f591be;

    /* renamed from: bf */
    DamagingBorder f592bf;

    /* renamed from: bg */
    boolean f593bg;

    /* renamed from: bh */
    boolean f594bh;

    /* renamed from: bi */
    boolean f595bi;

    /* renamed from: bj */
    boolean f596bj;

    /* renamed from: bk */
    int f597bk;

    /* renamed from: bl */
    ConcurrentLinkedQueue f598bl;

    /* renamed from: bm */
    ArrayList f599bm;

    /* renamed from: bn */
    PointF f600bn;

    /* renamed from: bo */
    Paint f601bo;

    /* renamed from: bp */
    ArrayList f602bp;

    /* renamed from: bq */
    AbstractC0159d f603bq;

    /* renamed from: br */
    AbstractC0159d f604br;

    /* renamed from: bs */
    AbstractC0159d f605bs;

    /* renamed from: bt */
    AbstractC0159d f606bt;

    /* renamed from: bu */
    AbstractC0159d f607bu;

    /* renamed from: bv */
    AbstractC0159d f608bv;

    /* renamed from: bw */
    AbstractC0159d f609bw;

    /* renamed from: bx */
    AbstractC0159d f610bx;

    /* renamed from: by */
    AbstractC0159d f611by;

    /* renamed from: bz */
    AbstractC0159d f612bz;

    /* renamed from: bA */
    AbstractC0159d f613bA;

    /* renamed from: bB */
    AbstractC0159d f614bB;

    /* renamed from: bC */
    AbstractC0159d f615bC;

    /* renamed from: bD */
    public C0158c f616bD;

    /* renamed from: bE */
    int f617bE;

    /* renamed from: bF */
    public float f618bF;

    /* renamed from: bG */
    ArrayList f619bG;

    /* renamed from: bJ */
    private static ArrayList f620bJ = new ArrayList();

    /* renamed from: bH */
    public static final C1112u f621bH = new C1112u();

    /* renamed from: bI */
    public final C1101m f622bI;

    /* renamed from: a */
    static /* synthetic */ boolean m6886a(C0136a c0136a, InterfaceC0303as interfaceC0303as) {
        return c0136a.m6876a(interfaceC0303as);
    }

    /* renamed from: Y */
    public boolean m6894Y() {
        return m6863ac() == 3 || m6863ac() > 300;
    }

    /* renamed from: Z */
    public boolean m6893Z() {
        return m6863ac() >= 2;
    }

    /* renamed from: aa */
    public boolean m6865aa() {
        return (1 & this.f569aI) == 1;
    }

    /* renamed from: ab */
    public boolean m6864ab() {
        return m6865aa();
    }

    /* renamed from: ac */
    public int m6863ac() {
        return this.f617bE;
    }

    /* renamed from: ad */
    public boolean m6862ad() {
        if (GameEngine.getInstance().f6113bU.f6013A.f5959i > 3000) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean m6861ae() {
        if (m6862ad() || !this.f593bg || !this.f594bh || !this.f595bi || !this.f596bj) {
            return true;
        }
        return false;
    }

    /* renamed from: af */
    public boolean m6860af() {
        if (this.f596bj && m6861ae() && this.f594bh) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6889a(float f, float f2, AbstractC0170o abstractC0170o, EnumC0246ao enumC0246ao) {
        if (m6890a(f, f2, abstractC0170o.f760S, abstractC0170o.f761T, enumC0246ao)) {
            return true;
        }
        float f3 = -180.0f;
        while (true) {
            float f4 = f3;
            if (f4 < 180.0f) {
                if (!m6890a(f, f2, abstractC0170o.f760S + (CommonUtils.m2249i(f4) * abstractC0170o.f762U * 0.4f), abstractC0170o.f761T + (CommonUtils.sin(f4) * abstractC0170o.f762U * 0.4f), enumC0246ao)) {
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
    public boolean m6890a(float f, float f2, float f3, float f4, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == EnumC0246ao.f1705d || enumC0246ao == EnumC0246ao.f1702a) {
            return true;
        }
        short m480b = C1117y.m480b(f, f2, enumC0246ao);
        short m480b2 = C1117y.m480b(f3, f4, enumC0246ao);
        if (m480b == -3 || m480b2 == -3) {
            String str = "null";
            if (enumC0246ao != null) {
                str = enumC0246ao.name();
            }
            m6837d("pathPossible: no isolatedGroups found! (" + str + ")");
            GameEngine.m1216S();
        }
        if (m480b != -1 && m480b2 != -1 && m480b != -2 && m480b2 != -2 && m480b == m480b2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6880a(Unit unit, float f, float f2) {
        return m6890a(unit.f6951ek, unit.f6952el, f, f2, unit.mo5645h());
    }

    /* renamed from: b */
    public boolean m6844b(Unit unit, float f, float f2) {
        EnumC0246ao mo5645h = unit.mo5645h();
        return m6890a(unit.f6951ek, unit.f6952el, f, f2, mo5645h) || m6890a(unit.f6951ek, unit.f6952el, f + 60.0f, f2, mo5645h) || m6890a(unit.f6951ek, unit.f6952el, f - 60.0f, f2, mo5645h) || m6890a(unit.f6951ek, unit.f6952el, f, f2 + 60.0f, mo5645h) || m6890a(unit.f6951ek, unit.f6952el, f, f2 - 60.0f, mo5645h);
    }

    /* renamed from: a */
    public boolean m6878a(Unit unit, Unit unit2) {
        return m6844b(unit, unit2.f6951ek, unit2.f6952el);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        int i;
        c0859ar.mo1482a(this.f570aJ);
        c0859ar.mo1488a(this.f571aK);
        c0859ar.mo1488a(this.f572aL);
        c0859ar.mo1488a(this.f573aM);
        c0859ar.mo1488a(this.f574aN);
        c0859ar.mo1488a(this.f579aS);
        c0859ar.mo1487a(this.f581aU);
        c0859ar.mo1488a(this.f582aV);
        c0859ar.mo1482a(this.f583aW);
        c0859ar.mo1487a(this.f586aZ);
        c0859ar.mo1487a(this.f598bl.size());
        Iterator it = this.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                i = 1;
            } else if (abstractC0170o instanceof C0162g) {
                i = 2;
            } else if (abstractC0170o instanceof C0169n) {
                i = 3;
            } else if (abstractC0170o instanceof C0168m) {
                i = 4;
            } else if (abstractC0170o instanceof C0167l) {
                i = 5;
            } else {
                throw new RuntimeException("zone not instance not supported:" + abstractC0170o.getClass().getName());
            }
            c0859ar.m1554c(i);
            c0859ar.mo1487a(abstractC0170o.f758Q);
        }
        Iterator it2 = this.f598bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o2 = (AbstractC0170o) it2.next();
            c0859ar.mo1487a(abstractC0170o2.f758Q);
            abstractC0170o2.mo466a(c0859ar);
        }
        c0859ar.m1554c(9);
        c0859ar.mo1487a(this.f568aH);
        c0859ar.mo1482a(this.f589bc);
        c0859ar.mo1482a(this.f593bg);
        c0859ar.mo1482a(this.f594bh);
        c0859ar.mo1482a(this.f595bi);
        c0859ar.mo1482a(this.f596bj);
        c0859ar.mo1488a(this.f580aT);
        c0859ar.mo1487a(this.f597bk);
        c0859ar.mo1487a(this.f554at);
        c0859ar.mo1487a(this.f555au);
        c0859ar.mo1487a(this.f556av);
        c0859ar.mo1482a(this.f584aX);
        c0859ar.mo1487a(this.f569aI);
        c0859ar.m1550e();
        c0859ar.mo1487a(this.f622bI.f6888a);
        for (int i2 = 0; i2 < this.f622bI.f6888a; i2++) {
            AbstractC0150a abstractC0150a = (AbstractC0150a) this.f622bI.get(i2);
            c0859ar.m1564a(abstractC0150a.mo6801a());
            abstractC0150a.mo6804a(c0859ar);
        }
        c0859ar.m1550e();
        super.mo466a(c0859ar);
    }

    /* renamed from: l */
    public AbstractC0170o m6824l(int i) {
        if (i == 1) {
            return new C0164i(this, -1.0f, -1.0f);
        }
        if (i == 2) {
            return new C0162g(this);
        }
        if (i == 3) {
            return new C0169n(this);
        }
        if (i == 4) {
            return new C0168m(this);
        }
        if (i == 5) {
            return new C0167l(this);
        }
        if (i == 0) {
            GameEngine.m1145b("Found zone type 0, loading PlainZone instead");
            return new C0168m(this);
        }
        throw new RuntimeException("Unknown zone type:" + i);
    }

    /* renamed from: c */
    public void m6840c(C0876k c0876k) {
        AbstractC0170o m6822m;
        this.f570aJ = c0876k.m1455e();
        this.f571aK = c0876k.m1453g();
        this.f572aL = c0876k.m1453g();
        this.f573aM = c0876k.m1453g();
        this.f574aN = c0876k.m1453g();
        this.f579aS = c0876k.m1453g();
        this.f581aU = c0876k.m1454f();
        this.f582aV = c0876k.m1453g();
        this.f583aW = c0876k.m1455e();
        this.f586aZ = c0876k.m1454f();
        int m1454f = c0876k.m1454f();
        this.f598bl.clear();
        boolean z = false;
        if (c0876k.m1463b() >= 20) {
            z = true;
            for (int i = 0; i < m1454f; i++) {
                m6824l((int) c0876k.m1457d()).f758Q = c0876k.m1454f();
            }
        }
        for (int i2 = 0; i2 < m1454f; i2++) {
            if (!z) {
                m6822m = m6824l((int) c0876k.m1457d());
            } else {
                m6822m = m6822m(c0876k.m1454f());
            }
            m6822m.m6672a(c0876k);
        }
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f568aH = c0876k.m1454f();
        }
        this.f599bm.clear();
        this.f599bm.addAll(this.f598bl);
        if (m1457d >= 2) {
            this.f589bc = c0876k.m1455e();
            this.f593bg = c0876k.m1455e();
            this.f594bh = c0876k.m1455e();
        }
        if (m1457d >= 3) {
            this.f595bi = c0876k.m1455e();
            this.f596bj = c0876k.m1455e();
        }
        if (m1457d >= 4) {
            this.f580aT = c0876k.m1453g();
        }
        if (m1457d >= 5) {
            this.f597bk = c0876k.m1454f();
        }
        if (m1457d >= 6) {
            this.f554at = c0876k.m1454f();
            this.f555au = c0876k.m1454f();
            this.f556av = c0876k.m1454f();
        }
        if (m1457d >= 7) {
            this.f584aX = c0876k.m1455e();
        }
        if (m1457d >= 8) {
            this.f569aI = c0876k.m1454f();
        }
        if (m1457d >= 9) {
            c0876k.m1467a("ai-c s");
            this.f622bI.clear();
            int m1454f2 = c0876k.m1454f();
            for (int i3 = 0; i3 < m1454f2; i3++) {
                AbstractC0150a mo6806a = ((EnumC0152b) c0876k.m1461b(EnumC0152b.class)).mo6806a();
                mo6806a.mo6803a(c0876k);
                m6887a(mo6806a);
            }
            c0876k.m1467a("ai-c e");
        }
        super.m6348c(c0876k);
        m6859ag();
    }

    /* renamed from: m */
    public AbstractC0170o m6822m(int i) {
        Iterator it = this.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o.f758Q == i) {
                return abstractC0170o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m6883a(AbstractC0170o abstractC0170o) {
        if (abstractC0170o == null) {
            return -1;
        }
        return abstractC0170o.f758Q;
    }

    /* renamed from: ag */
    void m6859ag() {
        this.f559ay = 0;
        this.f562aB = 0;
        this.f563aC = 0;
        this.f564aD = 0;
        this.f560az = 0;
        this.f561aA = 0;
        this.f565aE = 0;
        this.f566aF = 0;
        this.f557aw = 0;
        this.f558ax = 0;
        this.f567aG = 0;
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                this.f557aw++;
                if (c0164i.m6691u() >= 2) {
                    this.f558ax++;
                }
                if (c0164i.f701n) {
                    this.f567aG++;
                }
            }
            if (abstractC0170o instanceof C0162g) {
                C0162g c0162g = (C0162g) abstractC0170o;
                if (!c0162g.f655a) {
                    if (c0162g.f662h) {
                        this.f559ay++;
                        if (!c0162g.f676v && !c0162g.m6759d()) {
                            if (!c0162g.f682B) {
                                this.f560az++;
                            } else {
                                this.f561aA++;
                            }
                        }
                    } else {
                        this.f562aB++;
                        if (c0162g.m6759d()) {
                            this.f563aC++;
                        }
                        this.f564aD += c0162g.m6743l();
                    }
                }
            }
            if (abstractC0170o instanceof C0169n) {
                this.f565aE++;
                if (((AbstractC0163h) abstractC0170o).m6743l() > 0) {
                    this.f566aF++;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m6876a(InterfaceC0303as interfaceC0303as) {
        Unit m5871b = Unit.m5871b(interfaceC0303as);
        if (!m5871b.m5867bI() && (m5871b instanceof AbstractC0623y) && !m6832g(m5871b) && !m5871b.mo3143aj() && ((AbstractC0623y) m5871b).canAttack()) {
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f3153fr || !c0453l.f3149fn) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$1.class */
    public class C01371 extends AbstractC0159d {
        C01371(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6820a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m6886a(C0136a.this, interfaceC0303as) && m6784a(interfaceC0303as, EnumC0246ao.f1703b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$6.class */
    public class C01466 extends AbstractC0159d {
        C01466(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6811a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m6886a(C0136a.this, interfaceC0303as) && m6784a(interfaceC0303as, EnumC0246ao.f1707f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$7.class */
    public class C01477 extends AbstractC0159d {
        C01477(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6810a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m6886a(C0136a.this, interfaceC0303as) && m6784a(interfaceC0303as, EnumC0246ao.f1705d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$8.class */
    public class C01488 extends AbstractC0159d {
        C01488(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6809a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m6886a(C0136a.this, interfaceC0303as) && m6784a(interfaceC0303as, EnumC0246ao.f1706e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$9.class */
    public class C01499 extends AbstractC0159d {
        C01499(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6808a(InterfaceC0303as interfaceC0303as) {
            if (Unit.m5871b(interfaceC0303as).m5867bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3153fr) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$10.class */
    public class C013810 extends AbstractC0159d {
        C013810(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6819a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.m6832g(Unit.m5871b(interfaceC0303as))) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3153fr) {
                    return false;
                }
                if (interfaceC0303as.mo5700o() == EnumC0246ao.f1705d || interfaceC0303as.mo5700o() == EnumC0246ao.f1707f || interfaceC0303as.mo5700o() == EnumC0246ao.f1709h) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$11.class */
    public class C013911 extends AbstractC0159d {
        C013911(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6818a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.f608bv.m6785a(interfaceC0303as) && interfaceC0303as.mo5700o() == EnumC0246ao.f1705d) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$12.class */
    public class C014012 extends AbstractC0159d {
        C014012(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6817a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.f608bv.m6785a(interfaceC0303as) && interfaceC0303as.mo5700o() != EnumC0246ao.f1705d) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$13.class */
    public class C014113 extends AbstractC0159d {
        C014113(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6816a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as.mo5702m()) {
                if ((!(interfaceC0303as instanceof C0453l) || !((C0453l) interfaceC0303as).f3153fr) && interfaceC0303as.mo5700o() != EnumC0246ao.f1706e) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$2.class */
    public class C01422 extends AbstractC0159d {
        C01422(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6815a(InterfaceC0303as interfaceC0303as) {
            Unit.m5871b(interfaceC0303as);
            if (interfaceC0303as.mo5701n()) {
                if ((!(interfaceC0303as instanceof C0453l) || !((C0453l) interfaceC0303as).f3153fr) && interfaceC0303as.mo5700o() != EnumC0246ao.f1706e) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$3.class */
    public class C01433 extends AbstractC0159d {
        C01433(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6814a(InterfaceC0303as interfaceC0303as) {
            if (Unit.m5871b(interfaceC0303as).m5867bI() && interfaceC0303as.mo5699p()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3153fr) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$4.class */
    public class C01444 extends AbstractC0159d {
        C01444(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6813a(InterfaceC0303as interfaceC0303as) {
            InterfaceC0303as i;
            Unit m5871b = Unit.m5871b(interfaceC0303as);
            if (m5871b.m5867bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3153fr) {
                    return false;
                }
                boolean z = false;
                Iterator it = m5871b.mo3520N().iterator();
                while (it.hasNext()) {
                    Action action = (Action) it.next();
                    if (action != null && (action instanceof AbstractC0228w)) {
                        AbstractC0228w abstractC0228w = (AbstractC0228w) action;
                        if (!abstractC0228w.m6101F() && (i = abstractC0228w.mo7517i()) != null && !i.mo5705j()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$5.class */
    public class C01455 extends AbstractC0159d {
        C01455(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m6812a(InterfaceC0303as interfaceC0303as) {
            InterfaceC0303as i;
            Unit m5871b = Unit.m5871b(interfaceC0303as);
            if (m5871b.m5867bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3153fr) {
                    return false;
                }
                boolean z = false;
                Iterator it = m5871b.mo3520N().iterator();
                while (it.hasNext()) {
                    Action action = (Action) it.next();
                    if (action != null && (action instanceof AbstractC0228w)) {
                        AbstractC0228w abstractC0228w = (AbstractC0228w) action;
                        if (!abstractC0228w.m6101F() && (i = abstractC0228w.mo7517i()) != null && !i.mo5705j() && i.mo5702m()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public C0136a(int i) {
        this(i, true);
    }

    public C0136a(int i, boolean z) {
        super(i, z);
        this.f553as = 3000;
        this.f569aI = 0;
        this.f577aQ = 0.0f;
        this.f578aR = 0.0f;
        this.f589bc = true;
        this.f590bd = true;
        this.f591be = false;
        this.f598bl = new ConcurrentLinkedQueue();
        this.f599bm = new ArrayList();
        this.f600bn = new PointF();
        this.f602bp = new ArrayList();
        this.f603bq = new C01371("attackingUnitsLand");
        this.f604br = new C01466("attackingUnitsHover");
        this.f605bs = new C01477("attackingUnitsAir");
        this.f606bt = new C01488("attackingUnitsWater");
        this.f607bu = new C01499("buildingUnits");
        this.f608bv = new C013810("transportUnits");
        this.f609bw = new C013911("transportUnitsFlying");
        this.f610bx = new C014012("transportUnitsNonFlying");
        this.f611by = new C014113("builderUnits");
        this.f612bz = new C01422("harvesterUnits");
        this.f613bA = new C01433("extractorUnits");
        this.f614bB = new C01444("buildingFactories");
        this.f615bC = new C01455("buildingFactoriesForBuilders");
        this.f616bD = new C0158c();
        this.f618bF = 0.0f;
        this.f619bG = new ArrayList();
        this.f622bI = new C1101m();
        m6848ar();
    }

    /* renamed from: ar */
    private void m6848ar() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f571aK = 100 + (this.f1305k * 9);
        this.f573aM = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15 + (this.f1305k * 19);
        this.f575aO = 50 + (this.f1305k * 2);
        this.f582aV = 4200 + (this.f1305k * 5);
        this.f579aS = 3500 + (this.f1305k * 5);
        this.f580aT = 7500 + (this.f1305k * 5);
        this.f601bo = new Paint();
        this.f601bo.m7242b(Color.m7283a(0, 255, 0));
        this.f601bo.m7260a(Paint.Style.STROKE);
        this.f601bo.m7248a(true);
        gameEngine.m1197a(this.f601bo, 14.0f);
        m6858ah();
    }

    /* renamed from: ah */
    public void m6858ah() {
        Iterator it = this.f602bp.iterator();
        while (it.hasNext()) {
            ((AbstractC0159d) it.next()).m6783b();
        }
    }

    /* renamed from: d */
    public void m6837d(String str) {
        GameEngine.m1144b("ai_debug(" + this.f1305k + ")", str);
    }

    /* renamed from: ai */
    public PointF m6857ai() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.m6648a(CommonUtils.m2360a(0, gameEngine.f6104bL.f791C), CommonUtils.m2360a(0, gameEngine.f6104bL.f792D));
        this.f600bn.m7213a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
        return this.f600bn;
    }

    /* renamed from: aj */
    public PointF m6856aj() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6104bL.f837A.size() == 0) {
            return null;
        }
        Point point = (Point) gameEngine.f6104bL.f837A.get(CommonUtils.m2290c(gameEngine.f6104bL.f837A.size()));
        gameEngine.f6104bL.m6648a(point.f224a, point.f225b);
        this.f600bn.m7213a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
        return this.f600bn;
    }

    /* renamed from: a */
    public PointF m6891a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f3 = -1.0f;
        PointF pointF = new PointF();
        for (int i = 0; i < gameEngine.f6104bL.f837A.size(); i++) {
            Point point = (Point) gameEngine.f6104bL.f837A.get(i);
            gameEngine.f6104bL.m6648a(point.f224a, point.f225b);
            this.f600bn.m7213a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
            PointF pointF2 = this.f600bn;
            float m2366a = CommonUtils.m2366a(pointF2.x, pointF2.y, f, f2);
            if (m2366a < f3 || f3 == -1.0f) {
                f3 = m2366a;
                pointF.m7212a(pointF2);
            }
        }
        if (f3 == -1.0f) {
            return null;
        }
        return pointF;
    }

    /* renamed from: e */
    C0164i m6835e(Unit unit) {
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (c0164i.m6671b(unit)) {
                    return c0164i;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    C0164i m6847b(float f, float f2) {
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (c0164i.m6670c(f, f2)) {
                    return c0164i;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    C0164i m6833f(Unit unit) {
        return m6842c(unit.f6951ek, unit.f6952el);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C0164i m6842c(float f, float f2) {
        float f3 = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                float d = c0164i2.m6668d(f, f2);
                if (c0164i == null || d < f3) {
                    f3 = d;
                    c0164i = c0164i2;
                }
            }
        }
        return c0164i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0164i m6877a(EnumC0246ao enumC0246ao, float f, float f2, boolean z) {
        float f3 = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                float d = c0164i2.m6668d(f, f2);
                if (m6889a(f, f2, c0164i2, enumC0246ao) && (!z || !c0164i2.f707t)) {
                    if (c0164i == null || d < f3) {
                        f3 = d;
                        c0164i = c0164i2;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: a */
    public static boolean m6879a(Unit unit, float f, float f2, float f3) {
        if (CommonUtils.m2366a(unit.f6951ek, unit.f6952el, f, f2) < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m6888a(PointF pointF) {
        if (m6882a(this, pointF.x, pointF.y, 290.0f) != null) {
            return false;
        }
        C0164i m6842c = m6842c(pointF.x, pointF.y);
        if (m6842c != null && m6842c.m6668d(pointF.x, pointF.y) < 490000.0f) {
            return false;
        }
        PointF m6891a = m6891a(pointF.x, pointF.y);
        if ((m6891a != null && CommonUtils.m2366a(pointF.x, pointF.y, m6891a.x, m6891a.y) < 160000.0f) || C1117y.m474d(pointF.x, pointF.y) || C1117y.m474d(pointF.x + 60.0f, pointF.y) || C1117y.m474d(pointF.x, pointF.y + 60.0f) || C1117y.m474d(pointF.x - 60.0f, pointF.y) || C1117y.m474d(pointF.x, pointF.y + 60.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m6846b(PointF pointF) {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team != this && (unit instanceof CommandCenter)) {
                if (unit.team.m6354c(this) && m6879a(unit, pointF.x, pointF.y, 300.0f)) {
                    return false;
                }
                if (unit.team.m6342d(this) && m6879a(unit, pointF.x, pointF.y, 320.0f)) {
                    return false;
                }
            }
        }
        if (m6845b(this, pointF.x, pointF.y, 360.0f) >= 4 || m6881a((Team) this, pointF.x, pointF.y, 360.0f, true) >= 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int m6884a(AbstractC0159d abstractC0159d, EnumC0157b enumC0157b) {
        int i = 0;
        Iterator it = abstractC0159d.f649c.iterator();
        while (it.hasNext()) {
            i += m6874a(((C0160e) it.next()).f652a, enumC0157b);
        }
        return i;
    }

    /* renamed from: a */
    public int m6874a(InterfaceC0303as interfaceC0303as, EnumC0157b enumC0157b) {
        return m6873a(interfaceC0303as, true, enumC0157b);
    }

    /* renamed from: a */
    public int m6873a(InterfaceC0303as interfaceC0303as, boolean z, EnumC0157b enumC0157b) {
        boolean mo5705j = interfaceC0303as.mo5705j();
        Integer m6791a = this.f616bD.m6791a(mo5705j, interfaceC0303as, z);
        if (m6791a != null) {
            return m6791a.intValue();
        }
        int i = 0;
        if (mo5705j) {
            z = false;
        }
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == this && (enumC0157b == EnumC0157b.include || !unit.f1598bL)) {
                if (unit.f1688dx == interfaceC0303as) {
                    i++;
                }
                if (z && (unit instanceof InterfaceC0501l)) {
                    i += ((InterfaceC0501l) unit).mo4366h(interfaceC0303as);
                }
            }
        }
        this.f616bD.m6790a(mo5705j, interfaceC0303as, z, Integer.valueOf(i));
        return i;
    }

    /* renamed from: ak */
    public int m6855ak() {
        int i = 0;
        Iterator it = this.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0162g) {
                i += ((C0162g) abstractC0170o).f687G.size();
            }
        }
        return i;
    }

    /* renamed from: g */
    public boolean m6832g(Unit unit) {
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
            if (abstractC0623y.m5803cq()) {
                InterfaceC0303as r = abstractC0623y.getUnitType();
                if ((r instanceof C0453l) && !((C0453l) r).f3150fo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m6831h(Unit unit) {
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
            if (!abstractC0623y.m5867bI() && abstractC0623y.canAttack() && !m6832g(abstractC0623y) && !abstractC0623y.mo3143aj()) {
                InterfaceC0303as r = abstractC0623y.getUnitType();
                if ((r instanceof C0453l) && !((C0453l) r).f3149fn) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m6843b(Unit unit, Unit unit2) {
        if (this.f1343T) {
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.m3136aq() && C0248aq.m5741a(abstractC0623y, unit2)) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (m6831h(unit) && (unit instanceof AbstractC0623y) && C0248aq.m5741a((AbstractC0623y) unit, unit2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void m6830i(float f) {
        String[] split;
        C0169n c0169n;
        String[] split2;
        if (!f552ar || !GameEngine.getInstance().f6225bl || this.f585aY || this.f583aW) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this && gameEngine.f6244cM.m7204b((int) (unit.f6951ek - 200.0f), (int) (unit.f6952el - 200.0f), (int) (unit.f6951ek + 200.0f), (int) (unit.f6952el + 200.0f))) {
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                }
                String str = VariableScope.nullOrMissingString;
                float f2 = (unit.f6952el - gameEngine.f6139cw) - 60.0f;
                this.f601bo.m7242b(Color.m7283a(0, 255, 0));
                if (unit instanceof CommandCenter) {
                    f2 -= 80.0f;
                    str = ((((((str + "Base ( Team:" + this.f1305k + " )") + "\nuseTransportsOnThisMap: " + m6861ae()) + "\nuseHoverTransportsOnThisMap: " + m6860af()) + "\nattackingCount: " + this.f586aZ) + "\ndefendingCount: " + this.f587ba) + "\nnumOfUnitsNeedingTransport: " + m6855ak()) + "\ntransport: " + this.f566aF;
                    if (m6865aa()) {
                        str = str + "\nTurtling: true";
                    }
                    this.f601bo.m7242b(Color.m7283a(255, 255, 255));
                }
                if (str.length() != 0) {
                    for (String str2 : str.split("\n")) {
                        float f3 = unit.f6951ek - gameEngine.f6138cv;
                        float f4 = f2;
                        float m7220m = (-this.f601bo.m7221l()) + this.f601bo.m7220m();
                        gameEngine.graphics.mo878k();
                        if (gameEngine.f6250cW > 1.0f) {
                            gameEngine.m1217R();
                            f3 *= gameEngine.f6250cW;
                            f4 *= gameEngine.f6250cW;
                            m7220m /= gameEngine.f6250cW;
                        }
                        gameEngine.graphics.mo903a(str2, f3, f4, this.f601bo);
                        gameEngine.graphics.mo877l();
                        f2 += m7220m;
                    }
                }
            }
        }
        Iterator it = this.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (gameEngine.f6244cM.m7204b((int) (abstractC0170o.f760S - abstractC0170o.f762U), (int) (abstractC0170o.f761T - abstractC0170o.f762U), (int) (abstractC0170o.f760S + abstractC0170o.f762U), (int) (abstractC0170o.f761T + abstractC0170o.f762U))) {
                this.f601bo.m7242b(m6413H());
                gameEngine.graphics.mo931a(abstractC0170o.f760S - gameEngine.f6138cv, abstractC0170o.f761T - gameEngine.f6139cw, abstractC0170o.f762U + 2.0f, this.f601bo);
                int m7283a = Color.m7283a(0, 255, 0);
                String str3 = VariableScope.nullOrMissingString + "\n" + abstractC0170o.getClass().getSimpleName() + " ( Team:" + this.f1305k + " )";
                float f5 = abstractC0170o.f761T - gameEngine.f6139cw;
                if (abstractC0170o instanceof C0164i) {
                    f5 -= 50.0f;
                    C0164i c0164i = (C0164i) abstractC0170o;
                    String str4 = (((str3 + "\nState: " + c0164i.f689b.name() + "(id:" + c0164i.f758Q + ")") + "\nunsafe: " + c0164i.m6707f() + " (" + c0164i.f706s + ")") + "\nunsafeBaseTimer: " + c0164i.f709v) + "\nallowedUnits: " + c0164i.f691d;
                    if (c0164i.f713z != null) {
                        str4 = str4 + "\nlastAttemptedBuilding: " + c0164i.f713z.mo5706i();
                    }
                    if (c0164i.f714A != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordPrice: " + c0164i.f714A.m5210a(false, true, 4, true);
                    }
                    if (c0164i.f715B != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordBy: " + c0164i.f715B.m5210a(false, true, 4, true);
                    }
                    String str5 = ((((str4 + "\nlastAttemptedBuildingCount: " + c0164i.f716C) + "\nlastAttemptedBuildingFailed: " + c0164i.f717D) + "\nlastUnitAttempt: " + c0164i.f718E + " (" + c0164i.f719F + " - " + c0164i.f720G + ")") + "\nbuildBuildingDelay: " + c0164i.f692e) + "\ncredits: " + CommonUtils.m2295c(this.f1309o) + " (x" + CommonUtils.m2266f(m6418C()) + ")";
                    if (c0164i.f689b == EnumC0165j.f730a) {
                        str5 = str5 + "\nclaimedBaseTimer: " + c0164i.f699l;
                    }
                    if (c0164i.f698k > 100.0f) {
                        str5 = str5 + "\nabandonedTimer: " + c0164i.f698k;
                    }
                    if (c0164i.f694g > 0.0f) {
                        str5 = str5 + "\nrequestedBuildersDelay: " + c0164i.f694g + " (" + c0164i.f695h + ")";
                    }
                    str3 = (str5 + "\nBuilders: " + c0164i.f723J) + "\nIdle Builders: " + c0164i.f724K;
                }
                if (abstractC0170o instanceof C0162g) {
                    C0162g c0162g = (C0162g) abstractC0170o;
                    if (c0162g.f657c) {
                        str3 = str3 + "\nVIP Mode";
                    }
                    String str6 = (((str3 + "\n" + (c0162g.m6764b() ? "Defensive Type" : "Attack Type")) + "\nUnits: " + c0162g.f686F.size() + " / " + c0162g.f681A) + "\nStagingForAttack: " + c0162g.f671q) + "\nAttackDelay: " + c0162g.f666l;
                    if (c0162g.f675u != 0.0f) {
                        str6 = str6 + "\nStagingTimer: " + c0162g.f675u;
                    }
                    String str7 = str6 + "\nStagingTargetFound: " + c0162g.f672r;
                    if (c0162g.f669o != 0.0f) {
                        str7 = str7 + "\nattackingFor: " + c0162g.f669o;
                    }
                    str3 = str7 + "\ncommonMovement: " + c0162g.m6752i().name();
                    if (c0162g.f682B) {
                        str3 = str3 + " (seaGroup)";
                    }
                    if (c0162g.f687G.size() > 0) {
                        str3 = str3 + "\nunitsNeedingTransport:" + c0162g.f687G.size();
                    }
                    if (c0162g.f656b != null) {
                        str3 = str3 + "\nlast action:" + c0162g.f656b;
                    }
                    if (!c0162g.f676v && !c0162g.f671q) {
                        str3 = str3 + "\nnext move:" + ((int) m6826k(c0162g.f668n)) + "s";
                    }
                }
                if (abstractC0170o instanceof C0169n) {
                    str3 = ((str3 + "\nUnitsWanted: " + c0169n.f750l) + "\nunits: " + c0169n.f686F.size()) + "\nreadyToMoveOut: " + c0169n.f755q;
                    if (((C0169n) abstractC0170o).f751m != null) {
                        str3 = str3 + "\nCurrentlyHelping: " + c0169n.f751m.f758Q;
                    }
                }
                if (abstractC0170o instanceof C0167l) {
                    str3 = str3 + "\nneedsTransportGroup: " + ((C0167l) abstractC0170o).f738a;
                }
                this.f601bo.m7242b(m6413H());
                for (String str8 : str3.split("\n")) {
                    if (!str8.trim().equals(VariableScope.nullOrMissingString)) {
                        float f6 = abstractC0170o.f760S - gameEngine.f6138cv;
                        float f7 = f5;
                        float m7220m2 = (-this.f601bo.m7221l()) + this.f601bo.m7220m();
                        gameEngine.graphics.mo878k();
                        if (gameEngine.f6250cW > 1.0f) {
                            gameEngine.m1217R();
                            f6 *= gameEngine.f6250cW;
                            f7 *= gameEngine.f6250cW;
                            m7220m2 /= gameEngine.f6250cW;
                        }
                        gameEngine.graphics.mo903a(str8, f6, f7, this.f601bo);
                        gameEngine.graphics.mo877l();
                        f5 += m7220m2;
                        this.f601bo.m7242b(m7283a);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public Unit m6836e(Team team) {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == team && ((unit instanceof CommandCenter) || unit.f1601bO)) {
                return unit;
            }
        }
        Iterator it2 = Unit.f1589bD.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2.team == team && unit2.f1600bN) {
                return unit2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m6892a(float f) {
        Unit m6836e;
        super.m6394a(f);
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f583aW || this.f585aY) {
            return;
        }
        if (gameEngine.networkEngine.f5564B && (!gameEngine.networkEngine.f5485C || gameEngine.f6120cb.m2635h())) {
            return;
        }
        if (this.f618bF > 0.0f) {
            this.f618bF -= f;
            return;
        }
        this.f617bE = m6420A();
        if (this.f590bd && gameEngine.f6096by > 3000) {
            this.f590bd = false;
            Unit[] m523a = Unit.f1589bD.m523a();
            int i = 0;
            int size = Unit.f1589bD.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                Unit unit = m523a[i];
                if (!(unit instanceof DamagingBorder)) {
                    i++;
                } else {
                    m6837d("firstRunDelayed: Found damagingBorder");
                    this.f592bf = (DamagingBorder) unit;
                    break;
                }
            }
        }
        if (this.f589bc) {
            this.f589bc = false;
            this.f593bg = true;
            this.f594bh = true;
            this.f595bi = true;
            this.f596bj = true;
            Unit m6836e2 = m6836e(this);
            if (m6836e2 == null) {
                m6837d("firstRun: no command center found");
            }
            if (m6836e2 != null) {
                for (int i2 = 0; i2 < Team.f1364c; i2++) {
                    Team m6317k = Team.m6317k(i2);
                    if (m6317k != null && m6317k != this && (m6836e = m6836e(m6317k)) != null) {
                        if (!m6890a(m6836e2.f6951ek, m6836e2.f6952el, m6836e.f6951ek, m6836e.f6952el, EnumC0246ao.f1703b)) {
                            this.f593bg = false;
                        }
                        if (!m6890a(m6836e2.f6951ek, m6836e2.f6952el, m6836e.f6951ek, m6836e.f6952el, EnumC0246ao.f1707f)) {
                            this.f594bh = false;
                        }
                    }
                }
                Iterator it = gameEngine.f6104bL.f837A.iterator();
                while (it.hasNext()) {
                    PointF m6642a = gameEngine.f6104bL.m6642a((Point) it.next());
                    if (!m6890a(m6836e2.f6951ek, m6836e2.f6952el, m6642a.x, m6642a.y + gameEngine.f6104bL.f785o, EnumC0246ao.f1703b)) {
                        this.f595bi = false;
                    }
                    if (!m6890a(m6836e2.f6951ek, m6836e2.f6952el, m6642a.x, m6642a.y + gameEngine.f6104bL.f785o, EnumC0246ao.f1707f)) {
                        this.f596bj = false;
                    }
                }
            }
        }
        this.f575aO += f;
        this.f576aP += f;
        if (this.f575aO > 25.0f) {
            this.f575aO -= 25.0f;
            if (this.f575aO > 25.0f) {
                this.f575aO = 25.0f;
            }
            if (this.f575aO < -1.0f) {
                this.f575aO = -1.0f;
            }
            Iterator it2 = this.f598bl.iterator();
            while (it2.hasNext()) {
                AbstractC0170o abstractC0170o = (AbstractC0170o) it2.next();
                if (abstractC0170o instanceof C0164i) {
                    ((C0164i) abstractC0170o).f688a += this.f576aP;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                C0164i c0164i = null;
                Iterator it3 = this.f598bl.iterator();
                while (it3.hasNext()) {
                    AbstractC0170o abstractC0170o2 = (AbstractC0170o) it3.next();
                    if (abstractC0170o2 instanceof C0164i) {
                        C0164i c0164i2 = (C0164i) abstractC0170o2;
                        if (c0164i == null || c0164i.f688a < c0164i2.f688a) {
                            c0164i = c0164i2;
                        }
                    }
                }
                if (c0164i == null || c0164i.f688a < 50.0f) {
                    break;
                }
                C0164i c0164i3 = c0164i;
                c0164i3.m6716b(c0164i3.f688a);
                c0164i3.m6710d(c0164i3.f688a);
                c0164i3.f688a = 0.0f;
            }
            this.f576aP = 0.0f;
        }
        this.f571aK += f;
        this.f572aL += f;
        if (this.f571aK > 80.0f) {
            m6821n(this.f572aL);
            this.f571aK -= 80.0f;
            if (this.f571aK > 80.0f) {
                this.f571aK = 80.0f;
            }
            if (this.f571aK < -1.0f) {
                this.f571aK = -1.0f;
            }
            this.f572aL = 0.0f;
        }
        this.f573aM += f;
        this.f574aN += f;
        if (this.f573aM > 250.0f) {
            m6823m(this.f574aN);
            this.f573aM -= 250.0f;
            if (this.f573aM > 250.0f) {
                this.f573aM = 250.0f;
            }
            if (this.f573aM < -1.0f) {
                this.f573aM = -1.0f;
            }
            this.f574aN = 0.0f;
        }
    }

    /* renamed from: j */
    public float m6828j(float f) {
        return (f / 60.0f) * 1000.0f;
    }

    /* renamed from: k */
    public float m6826k(float f) {
        return f / 60.0f;
    }

    /* renamed from: a */
    public void m6869a(AbstractC0623y abstractC0623y, C0208c c0208c) {
        C0749e m2594a = GameEngine.getInstance().f6124cf.m2594a(this);
        m2594a.m2491a(abstractC0623y);
        m2594a.m2496a(c0208c);
    }

    /* renamed from: l */
    public void m6825l(float f) {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == this && (unit instanceof AbstractC0623y) && m6829i(unit)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y instanceof AttackSubmarine) {
                    boolean z = false;
                    Unit m3151ab = abstractC0623y.m3151ab();
                    if (m3151ab != null && abstractC0623y.m3054h(m3151ab)) {
                        z = !m3151ab.m5840cG();
                    }
                    boolean z2 = !abstractC0623y.mo3294Q();
                    if (z && z != z2) {
                        m6869a(abstractC0623y, AttackSubmarine.f3837j.m6095N());
                    }
                    if (!z && z != z2) {
                        m6869a(abstractC0623y, AttackSubmarine.f3838k.m6095N());
                    }
                }
                if (abstractC0623y instanceof AmphibiousJet) {
                    boolean z3 = true;
                    Unit m3151ab2 = abstractC0623y.m3151ab();
                    if (m3151ab2 != null && abstractC0623y.m3054h(m3151ab2)) {
                        z3 = !m3151ab2.mo3294Q();
                    }
                    boolean z4 = !abstractC0623y.mo3294Q();
                    if (z3 && z3 != z4) {
                        m6869a(abstractC0623y, AmphibiousJet.f1864y.m6095N());
                    }
                    if (!z3 && z3 != z4) {
                        m6869a(abstractC0623y, AmphibiousJet.f1865z.m6095N());
                    }
                }
                if (abstractC0623y.m3100be() == EnumC0307b.f1831d && abstractC0623y.m3136aq() && abstractC0623y.m3151ab() != null) {
                    C0749e m2594a = GameEngine.getInstance().f6124cf.m2594a(this);
                    m2594a.m2491a(abstractC0623y);
                    m2594a.m2493a(abstractC0623y.m3151ab());
                }
            }
        }
    }

    /* renamed from: c */
    public EnumC0205a m6841c(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.m3161aS()) {
            boolean z = true;
            if (abstractC0623y.mo3143aj()) {
                z = false;
            }
            if (m6832g(abstractC0623y)) {
                z = false;
            }
            if (z) {
                if (this.f584aX) {
                    return EnumC0205a.f1422f;
                }
                return EnumC0205a.f1417a;
            }
        }
        return EnumC0205a.f1418b;
    }

    /* renamed from: al */
    public ArrayList m6854al() {
        f620bJ.clear();
        return f620bJ;
    }

    /* renamed from: d */
    public void m6838d(AbstractC0623y abstractC0623y) {
        Iterator it = this.f622bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo6805a(this, abstractC0623y);
        }
    }

    /* renamed from: e */
    public void m6834e(AbstractC0623y abstractC0623y) {
        Iterator it = this.f622bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo6802b(this, abstractC0623y);
        }
    }

    /* renamed from: m */
    public void m6823m(float f) {
        boolean z;
        Unit m6852an;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f616bD.m6789b();
        Iterator it = this.f622bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo6799b(m6828j(f), this);
        }
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == this && !unit.m5755u()) {
                i++;
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                    if (!abstractC0623y.f1588bC) {
                        abstractC0623y.f1588bC = true;
                        m6838d(abstractC0623y);
                    }
                    if (unit.f1650cL == null) {
                        C0164i c0164i = abstractC0623y.f3943aB;
                        abstractC0623y.f3943aB = m6833f(abstractC0623y);
                        if (abstractC0623y.f3943aB != null && c0164i != abstractC0623y.f3943aB) {
                            if (abstractC0623y.m5867bI()) {
                                abstractC0623y.f3944aC = m6890a(unit.f6951ek, unit.f6952el, abstractC0623y.f3943aB.f760S, abstractC0623y.f3943aB.f761T, EnumC0246ao.f1703b);
                                if (!abstractC0623y.f3944aC && abstractC0623y.getUnitType().mo5699p()) {
                                    abstractC0623y.f3944aC = m6890a(unit.f6951ek, unit.f6952el + 15.0f, abstractC0623y.f3943aB.f760S, abstractC0623y.f3943aB.f761T, EnumC0246ao.f1703b);
                                }
                            } else {
                                abstractC0623y.f3944aC = m6890a(unit.f6951ek, unit.f6952el, abstractC0623y.f3943aB.f760S, abstractC0623y.f3943aB.f761T, EnumC0246ao.f1703b);
                            }
                        }
                    }
                }
            }
        }
        m6825l(f);
        Iterator it2 = Unit.f1589bD.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2.team == this && (unit2 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit2;
                EnumC0205a m6841c = m6841c(abstractC0623y2);
                if (abstractC0623y2.f3889O != m6841c && m6829i(abstractC0623y2)) {
                    C0749e m2594a = gameEngine.f6124cf.m2594a(this);
                    m2594a.m2491a(abstractC0623y2);
                    m2594a.m2494a(m6841c);
                }
                if (abstractC0623y2.mo3143aj() && abstractC0623y2.m5788db() && abstractC0623y2.f3942aA == null && m6829i(abstractC0623y2)) {
                    C0162g.m6771a(this, abstractC0623y2);
                }
            }
        }
        if (i == 0 && !this.f1343T) {
            this.f585aY = true;
        }
        this.f580aT = CommonUtils.m2368a(this.f580aT, f);
        this.f579aS = CommonUtils.m2368a(this.f579aS, f);
        if (m6894Y()) {
            this.f579aS = CommonUtils.m2368a(this.f579aS, 4.0f * f);
        }
        if (this.f579aS == 0.0f) {
            int i3 = 0;
            Iterator it3 = this.f599bm.iterator();
            while (it3.hasNext()) {
                AbstractC0170o abstractC0170o = (AbstractC0170o) it3.next();
                if ((abstractC0170o instanceof C0164i) && ((C0164i) abstractC0170o).f689b == EnumC0165j.f730a) {
                    i3++;
                }
            }
            boolean z2 = false;
            if (i3 > 2) {
                z2 = true;
            }
            if (z2) {
                this.f579aS = 300.0f;
            } else {
                PointF m6856aj = m6856aj();
                if (m6856aj != null) {
                    m6856aj.y += gameEngine.f6104bL.f785o;
                    if (m6847b(m6856aj.x, m6856aj.y) == null && m6846b(m6856aj)) {
                        this.f579aS = 2000.0f;
                        C0164i c0164i2 = new C0164i(this, m6856aj.x, m6856aj.y);
                        c0164i2.f762U = 360.0f;
                        c0164i2.f689b = EnumC0165j.f730a;
                        c0164i2.f690c = EnumC0166k.ResourceOutpost;
                        this.f556av++;
                    }
                }
            }
        }
        if (this.f580aT == 0.0f) {
            this.f580aT = 100.0f;
            int i4 = 0;
            Iterator it4 = this.f599bm.iterator();
            while (it4.hasNext()) {
                AbstractC0170o abstractC0170o2 = (AbstractC0170o) it4.next();
                if ((abstractC0170o2 instanceof C0164i) && ((C0164i) abstractC0170o2).f690c == EnumC0166k.ForwardOutpost) {
                    i4++;
                }
            }
            if (i4 < 3 && (m6852an = m6852an()) != null) {
                PointF pointF = new PointF();
                pointF.x = m6852an.f6951ek;
                pointF.y = m6852an.f6952el;
                if (pointF != null && m6847b(pointF.x, pointF.y) == null && m6888a(pointF)) {
                    this.f580aT = 5000.0f;
                    C0164i c0164i3 = new C0164i(this, pointF.x, pointF.y);
                    c0164i3.f762U = 310.0f;
                    c0164i3.f689b = EnumC0165j.f730a;
                    c0164i3.f690c = EnumC0166k.ForwardOutpost;
                    this.f556av++;
                }
            }
        }
        this.f588bb = 0;
        this.f586aZ = 0;
        this.f587ba = 0;
        Unit[] m523a2 = Unit.f1589bD.m523a();
        int size2 = Unit.f1589bD.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Unit unit3 = m523a2[i5];
            if (unit3.team == this && (unit3 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) unit3;
                if (!unit3.m5867bI()) {
                    if (abstractC0623y3.f3942aA != null && abstractC0623y3.f3942aA.m6747b()) {
                        this.f587ba++;
                    } else if (m6831h(abstractC0623y3) && !abstractC0623y3.f1598bL) {
                        if (abstractC0623y3.mo5645h() == EnumC0246ao.f1706e) {
                            this.f588bb++;
                        } else {
                            this.f586aZ++;
                        }
                    }
                }
            }
        }
        this.f577aQ = CommonUtils.m2368a(this.f577aQ, f);
        this.f578aR += f;
        if (this.f577aQ == 0.0f) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Iterator it5 = Unit.f1589bD.iterator();
            while (it5.hasNext()) {
                Unit unit4 = (Unit) it5.next();
                if (unit4.team == this && unit4.isActive()) {
                    if (((unit4 instanceof LandFactory) || (unit4 instanceof AirFactory) || (unit4 instanceof SeaFactory)) && (unit4 instanceof AirFactory)) {
                        i7++;
                        if (((AirFactory) unit4).m4671V() > 1) {
                            i6++;
                        }
                    }
                    if (unit4.getUnitType().mo5699p()) {
                        i8++;
                        if (Action.m6080c(unit4.m5808cl())) {
                            i9++;
                        }
                    }
                }
            }
            if (m6395a(4100.0d) || this.f578aR > 2400.0f || this.f567aG == 0) {
                Iterator it6 = Unit.f1589bD.iterator();
                while (it6.hasNext()) {
                    Unit unit5 = (Unit) it6.next();
                    if (unit5.team == this && (unit5 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y4 = (AbstractC0623y) unit5;
                        if (abstractC0623y4.m5809ck()) {
                            ArrayList N = abstractC0623y4.mo3520N();
                            ArrayList m6854al = m6854al();
                            Iterator it7 = N.iterator();
                            while (it7.hasNext()) {
                                Action action = (Action) it7.next();
                                if (action.m6054n(abstractC0623y4)) {
                                    m6854al.add(action);
                                }
                            }
                            if (m6854al.size() > 0) {
                                m6868a(abstractC0623y4, (Action) C0161f.m6776a(m6854al));
                            }
                        }
                    }
                }
                boolean z3 = false;
                if (m6395a(30000.0d)) {
                    z3 = true;
                }
                Iterator it8 = Unit.f1589bD.iterator();
                while (it8.hasNext()) {
                    Unit unit6 = (Unit) it8.next();
                    if (unit6.team == this && (unit6 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y5 = (AbstractC0623y) unit6;
                        C0208c cl = abstractC0623y5.m5808cl();
                        if (Action.m6080c(cl)) {
                            float cm = abstractC0623y5.m5807cm();
                            if (cm < 0.0f) {
                                cm = 6.0f;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (cm == 0.0f) {
                                continue;
                            } else {
                                int m2290c = CommonUtils.m2290c(100);
                                float f2 = 100.0f - cm;
                                if (z3) {
                                    f2 -= 4.0f;
                                }
                                if (!z) {
                                    if (unit6.getUnitType().mo5699p() && i9 > 0) {
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
                                if (!(((float) m2290c) > f2)) {
                                    continue;
                                } else {
                                    if (abstractC0623y5.m5806cn()) {
                                    }
                                    if (CommonUtils.m2290c(100) > 50) {
                                        abstractC0623y5.m5881a(this.f619bG);
                                        if (this.f619bG.size() != 0) {
                                            cl = (C0208c) this.f619bG.get(new Random().nextInt(this.f619bG.size()));
                                        }
                                    }
                                    boolean z4 = false;
                                    Action a = abstractC0623y5.m5893a(cl);
                                    if (a != null) {
                                        if (a.m6055m(abstractC0623y5)) {
                                            z4 = true;
                                        }
                                        if (a.mo6184e() == EnumC0226u.f1480g) {
                                            z4 = true;
                                        }
                                        if (!a.mo4245b(abstractC0623y5)) {
                                            z4 = true;
                                        }
                                        if (!a.mo4247a((Unit) abstractC0623y5, false)) {
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        m6869a(abstractC0623y5, cl);
                                        m6866a(abstractC0623y5, a.m6105B(), true);
                                        this.f577aQ = 900.0f;
                                        this.f578aR = 0.0f;
                                        if (!z3) {
                                            break;
                                        } else if (m6395a(40000.0d)) {
                                            if (CommonUtils.m2290c(100) > 95) {
                                                break;
                                            }
                                        } else if (CommonUtils.m2290c(100) > 80) {
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
        Iterator it9 = this.f598bl.iterator();
        while (it9.hasNext()) {
            AbstractC0170o abstractC0170o3 = (AbstractC0170o) it9.next();
            if (abstractC0170o3 instanceof AbstractC0163h) {
                ((AbstractC0163h) abstractC0170o3).m6746b(f);
            }
        }
    }

    /* renamed from: a */
    public boolean m6868a(AbstractC0623y abstractC0623y, Action action) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action.mo4245b(abstractC0623y) && action.mo4247a((Unit) abstractC0623y, false)) {
            C0749e m2594a = gameEngine.f6124cf.m2594a(this);
            m2594a.m2491a(abstractC0623y);
            m2594a.m2496a(action.m6035z());
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6867a(AbstractC0623y abstractC0623y, Action action, PointF pointF, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action.mo4245b(abstractC0623y) && action.mo4247a((Unit) abstractC0623y, false)) {
            C0749e m2594a = gameEngine.f6124cf.m2594a(this);
            m2594a.m2491a(abstractC0623y);
            m2594a.m2495a(action.m6035z(), pointF, unit);
            return true;
        }
        return false;
    }

    /* renamed from: am */
    public void m6853am() {
        Iterator it = this.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                ((C0164i) abstractC0170o).m6692t();
            }
        }
        Iterator it2 = this.f598bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o2 = (AbstractC0170o) it2.next();
            Iterator it3 = this.f598bl.iterator();
            while (it3.hasNext()) {
                AbstractC0170o abstractC0170o3 = (AbstractC0170o) it3.next();
                if (abstractC0170o2 != abstractC0170o3 && abstractC0170o2.f758Q == abstractC0170o3.f758Q) {
                    GameEngine.m1193a("Id overlap on:" + abstractC0170o2.f758Q);
                    GameEngine.m1193a("zone x:" + abstractC0170o2.f760S);
                    GameEngine.m1193a("zone y:" + abstractC0170o2.f761T);
                    GameEngine.m1193a("zone radius:" + abstractC0170o2.f762U);
                    GameEngine.m1193a("zone type:" + abstractC0170o2.getClass().getName());
                }
            }
        }
        int i = 0;
        Iterator it4 = this.f598bl.iterator();
        while (it4.hasNext()) {
            if (((AbstractC0170o) it4.next()) instanceof C0164i) {
                i++;
            }
        }
        int i2 = 0;
        Iterator it5 = this.f598bl.iterator();
        while (it5.hasNext()) {
            AbstractC0170o abstractC0170o4 = (AbstractC0170o) it5.next();
            if (abstractC0170o4 instanceof C0164i) {
                Iterator it6 = this.f598bl.iterator();
                while (it6.hasNext()) {
                    AbstractC0170o abstractC0170o5 = (AbstractC0170o) it6.next();
                    if ((abstractC0170o5 instanceof C0164i) && abstractC0170o4 != abstractC0170o5 && CommonUtils.m2366a(abstractC0170o4.f760S, abstractC0170o4.f761T, abstractC0170o5.f760S, abstractC0170o5.f761T) < 400.0f) {
                        i2++;
                    }
                }
            }
        }
        if (i2 > 0) {
            m6837d("baseOverlapCount:" + i2);
        }
    }

    /* renamed from: a */
    public void m6870a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.team == this) {
            this.f616bD.m6792a(abstractC0623y);
        }
    }

    /* renamed from: n */
    public void m6821n(float f) {
        int i;
        C0305au m3135ar;
        C0164i m6833f;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f616bD.m6794a();
        Iterator it = this.f622bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).m6807a(m6828j(f), this);
        }
        Iterator it2 = this.f598bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it2.next();
            if (abstractC0170o instanceof AbstractC0163h) {
                ((AbstractC0163h) abstractC0170o).m6744c(f);
            }
        }
        if (this.f592bf != null) {
            Iterator it3 = this.f598bl.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC0170o abstractC0170o2 = (AbstractC0170o) it3.next();
                if (this.f592bf.m3813a(abstractC0170o2.f760S, abstractC0170o2.f761T)) {
                    if (abstractC0170o2 instanceof C0164i) {
                        abstractC0170o2.m6666p();
                        break;
                    } else if (abstractC0170o2 instanceof C0162g) {
                        PointF m3812a = this.f592bf.m3812a(abstractC0170o2.f760S, abstractC0170o2.f761T, abstractC0170o2.f762U + 20.0f);
                        abstractC0170o2.f760S = m3812a.x;
                        abstractC0170o2.f761T = m3812a.y;
                    }
                }
            }
        }
        this.f582aV = CommonUtils.m2368a(this.f582aV, f);
        int i2 = 0;
        Iterator it4 = this.f599bm.iterator();
        while (it4.hasNext()) {
            if (((AbstractC0170o) it4.next()) instanceof C0164i) {
                i2++;
            }
        }
        if (i2 < 1) {
            Iterator it5 = Unit.f1589bD.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Unit unit = (Unit) it5.next();
                if (unit.team == this && (unit instanceof CommandCenter)) {
                    C0164i c0164i = new C0164i(this, unit.f6951ek, unit.f6952el);
                    c0164i.f762U = 420.0f;
                    c0164i.f689b = EnumC0165j.f732c;
                    c0164i.f690c = EnumC0166k.Main;
                    i2++;
                    break;
                }
            }
            if (i2 < 1) {
                Iterator it6 = Unit.f1589bD.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Unit unit2 = (Unit) it6.next();
                    if (unit2.team == this && this.f611by.m6782b(unit2.getUnitType())) {
                        C0164i c0164i2 = new C0164i(this, unit2.f6951ek, unit2.f6952el);
                        c0164i2.f762U = 420.0f;
                        c0164i2.f689b = EnumC0165j.f732c;
                        c0164i2.f690c = EnumC0166k.Main;
                        i2++;
                        break;
                    }
                }
            }
            if (i2 < 1) {
                Iterator it7 = Unit.f1589bD.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Unit unit3 = (Unit) it7.next();
                    if (unit3.team == this && (unit3 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) unit3;
                        boolean z = false;
                        Iterator it8 = this.f611by.f649c.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            } else if (abstractC0623y.m3116b(((C0160e) it8.next()).f652a, true)) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            C0164i c0164i3 = new C0164i(this, unit3.f6951ek, unit3.f6952el);
                            c0164i3.f762U = 420.0f;
                            c0164i3.f689b = EnumC0165j.f732c;
                            c0164i3.f690c = EnumC0166k.Main;
                            i2++;
                            break;
                        }
                    }
                }
            }
            if (i2 < 1) {
                Iterator it9 = Unit.f1589bD.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Unit unit4 = (Unit) it9.next();
                    if (unit4.team == this && (unit4 instanceof AbstractC0623y) && ((AbstractC0623y) unit4).m3144ai()) {
                        C0164i c0164i4 = new C0164i(this, unit4.f6951ek, unit4.f6952el);
                        c0164i4.f762U = 420.0f;
                        c0164i4.f689b = EnumC0165j.f732c;
                        c0164i4.f690c = EnumC0166k.Main;
                        int i3 = i2 + 1;
                        break;
                    }
                }
            }
            if (!this.f591be) {
                this.f591be = true;
                if (m6884a(this.f613bA, EnumC0157b.include) >= 1) {
                    for (int i4 = 0; i4 < gameEngine.f6104bL.f837A.size(); i4++) {
                        Point point = (Point) gameEngine.f6104bL.f837A.get(i4);
                        gameEngine.f6104bL.m6648a(point.f224a, point.f225b);
                        this.f600bn.m7213a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
                        PointF pointF = this.f600bn;
                        pointF.y += gameEngine.f6104bL.f785o;
                        if (m6847b(pointF.x, pointF.y) == null && m6885a(this.f613bA, pointF.x, pointF.y, 200) >= 1 && m6846b(pointF)) {
                            C0164i c0164i5 = new C0164i(this, pointF.x, pointF.y);
                            c0164i5.f762U = 360.0f;
                            c0164i5.f689b = EnumC0165j.f730a;
                            c0164i5.f690c = EnumC0166k.ResourceOutpost;
                        }
                    }
                }
            }
        }
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i5 = 0; i5 < size; i5++) {
            Unit unit5 = m523a[i5];
            if (unit5.team == this && unit5.f1650cL == null && (unit5 instanceof AbstractC0623y) && unit5.mo3143aj() && m6829i(unit5)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit5;
                if (m6835e((Unit) abstractC0623y2) != null) {
                    if (abstractC0623y2.m3136aq()) {
                    }
                } else if (abstractC0623y2.m3136aq() && (m6833f = m6833f(abstractC0623y2)) != null) {
                    PointF w = m6833f.m6665w();
                    C0749e m2594a = gameEngine.f6124cf.m2594a(this);
                    m2594a.m2491a(abstractC0623y2);
                    m2594a.m2501a(w.x, w.y);
                }
            }
        }
        int size2 = Unit.f1589bD.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Unit unit6 = m523a[i6];
            if (unit6.team == this && (unit6 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) unit6;
                if (abstractC0623y3.f3897U > 2400.0f && m6829i(abstractC0623y3)) {
                    if (!abstractC0623y3.f3961aM || abstractC0623y3.f3897U >= 24000.0f) {
                        C0749e m2594a2 = gameEngine.f6124cf.m2594a(this);
                        m2594a2.m2491a(abstractC0623y3);
                        m2594a2.m2474h();
                    }
                }
                if (abstractC0623y3.mo3143aj() && m6829i(abstractC0623y3) && (m3135ar = abstractC0623y3.m3135ar()) != null && m3135ar.m5676d() == EnumC0306av.f1812c && abstractC0623y3.f3897U > 700.0f) {
                    C0749e m2594a3 = gameEngine.f6124cf.m2594a(this);
                    m2594a3.m2491a(abstractC0623y3);
                    m2594a3.m2474h();
                }
            }
        }
        if (!this.f1343T) {
            m6859ag();
            int i7 = 1;
            boolean z2 = true;
            if (m6864ab()) {
                i7 = 1 + 1;
                z2 = false;
            }
            if (this.f558ax > 6) {
                i7 = 2;
            }
            if (this.f558ax > 11) {
                i7 = 3;
            }
            if (this.f562aB < i7) {
                C0162g c0162g = new C0162g(this, false);
                c0162g.f681A = 8;
                if (m6894Y()) {
                    c0162g.f681A = 10;
                }
                c0162g.m6750k();
                this.f555au++;
            }
            if ((this.f563aC >= i7 || this.f564aD > 6) && this.f560az < 1 && z2) {
                C0162g c0162g2 = new C0162g(this, true);
                if (this.f554at < 2) {
                    c0162g2.f681A = 3;
                } else if (this.f554at < 5) {
                    c0162g2.f681A = 5;
                } else {
                    c0162g2.f681A = 7;
                    if (m6894Y()) {
                        if (this.f554at < 25) {
                            c0162g2.f681A = 14;
                        } else {
                            c0162g2.f681A = 18;
                        }
                    }
                }
                c0162g2.m6750k();
                this.f554at++;
            }
            if (m6862ad() && this.f561aA < 1 && z2) {
                C0162g c0162g3 = new C0162g(this, true);
                c0162g3.f682B = true;
                c0162g3.f681A = 5;
                if (m6894Y()) {
                    c0162g3.f681A = 10;
                }
                c0162g3.m6750k();
            }
            if (m6861ae() && this.f565aE < 3) {
                C0169n c0169n = new C0169n(this);
                c0169n.f750l = 1;
                c0169n.m6675f();
            }
        }
        if (this.f1343T) {
            if (this.f582aV > 30.0f) {
                this.f582aV = 30.0f;
            }
            if (this.f582aV == 0.0f) {
                this.f581aU++;
                if (this.f581aU == 1) {
                    this.f582aV = 1000.0f;
                } else if (this.f581aU == 2) {
                    this.f582aV = 3000.0f;
                    Unit m6851ao = m6851ao();
                    if (m6851ao != null) {
                        if (this.f1343T) {
                            i = 0;
                        } else {
                            i = 2;
                            if (this.f586aZ < 4) {
                                i = 5;
                            }
                        }
                        C0749e m2594a4 = gameEngine.f6124cf.m2594a(this);
                        int size3 = Unit.f1589bD.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            Unit unit7 = m523a[i8];
                            if (unit7.team == this && (unit7 instanceof AbstractC0623y)) {
                                AbstractC0623y abstractC0623y4 = (AbstractC0623y) unit7;
                                if (!abstractC0623y4.f1598bL && m6843b(abstractC0623y4, m6851ao)) {
                                    if (i <= 0) {
                                        m2594a4.m2491a(abstractC0623y4);
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        m2594a4.m2486b(m6851ao.f6951ek, m6851ao.f6952el);
                    }
                } else {
                    this.f581aU = 0;
                }
            }
        }
    }

    /* renamed from: i */
    public boolean m6829i(Unit unit) {
        if (unit.m5755u() || unit.m5757t() || unit.m5826cU() || unit.f1599bM) {
            return false;
        }
        return true;
    }

    /* renamed from: an */
    public Unit m6852an() {
        Unit unit = null;
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m523a[i2];
            if (!unit2.isDead && unit2.f1650cL == null && this == unit2.team && m6831h(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.f1589bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.isDead && unit3.f1650cL == null && this == unit3.team && m6831h(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        return unit;
    }

    /* renamed from: ao */
    public Unit m6851ao() {
        Unit unit = null;
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m523a[i2];
            if (!unit2.isDead && unit2.f1650cL == null && !unit2.m5755u() && m6354c(unit2.team) && m6827j(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.f1589bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.isDead && unit3.f1650cL == null && !unit3.m5755u() && m6354c(unit3.team) && m6827j(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        return unit;
    }

    /* renamed from: ap */
    public PointF m6850ap() {
        Unit unit = null;
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit2 = m523a[i2];
            if (!unit2.isDead && unit2.f1650cL == null && !unit2.m5755u() && m6354c(unit2.team) && m6827j(unit2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = Unit.f1589bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit unit3 = (Unit) it.next();
            if (!unit3.isDead && unit3.f1650cL == null && !unit3.m5755u() && m6354c(unit3.team) && m6827j(unit3)) {
                if (i3 == random) {
                    unit = unit3;
                    break;
                }
                i3++;
            }
        }
        if (unit != null) {
            return new PointF(unit.f6951ek, unit.f6952el);
        }
        return null;
    }

    /* renamed from: a */
    public static Unit m6882a(Team team, float f, float f2, float f3) {
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.f6951ek + f3 > f && unit.f6951ek - f3 < f && unit.f6952el + f3 > f2 && unit.f6952el - f3 < f2 && unit.team != team && m6879a(unit, f, f2, f3) && unit.team.m6354c(team)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m6881a(Team team, float f, float f2, float f3, boolean z) {
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.f6951ek + f3 > f && unit.f6951ek - f3 < f && unit.f6952el + f3 > f2 && unit.f6952el - f3 < f2 && unit.team != team && m6879a(unit, f, f2, f3) && unit.team.m6342d(team) && (!z || unit.m5867bI())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m6845b(Team team, float f, float f2, float f3) {
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.f6951ek + f3 > f && unit.f6951ek - f3 < f && unit.f6952el + f3 > f2 && unit.f6952el - f3 < f2 && unit.team != team && m6879a(unit, f, f2, f3) && unit.team.m6354c(team)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m6885a(AbstractC0159d abstractC0159d, float f, float f2, int i) {
        int i2 = 0;
        Iterator it = abstractC0159d.f649c.iterator();
        while (it.hasNext()) {
            i2 += m6875a(((C0160e) it.next()).f652a, f, f2, i);
        }
        return i2;
    }

    /* renamed from: a */
    public int m6875a(InterfaceC0303as interfaceC0303as, float f, float f2, int i) {
        int i2 = 0;
        GameEngine gameEngine = GameEngine.getInstance();
        f621bH.clear();
        gameEngine.f6121cc.m3788a(this, f, f2, i, f621bH);
        Unit[] m523a = f621bH.m523a();
        int size = f621bH.size();
        for (int i3 = 0; i3 < size; i3++) {
            Unit unit = m523a[i3];
            if (unit.team == this && unit.f1688dx == interfaceC0303as && m6879a(unit, f, f2, i)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: aq */
    public int m6849aq() {
        int i = 0;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            i++;
        }
        return i;
    }

    /* renamed from: Q */
    public void m6895Q() {
        if (this.f585aY && m6849aq() != 0) {
            GameEngine.PrintLog("waking up AI");
            this.f585aY = false;
        }
    }

    /* renamed from: d */
    public void m6839d(Unit unit) {
        if (!(unit instanceof AbstractC0623y)) {
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
        abstractC0623y.f1588bC = false;
        if (abstractC0623y.f3943aB != null) {
            abstractC0623y.f3943aB.m6723a(abstractC0623y);
            abstractC0623y.f3943aB = null;
        }
        if (abstractC0623y.f3942aA != null) {
            abstractC0623y.f3942aA.m6745b(abstractC0623y);
            abstractC0623y.f3942aA = null;
        }
        m6834e(abstractC0623y);
    }

    /* renamed from: a */
    public void m6866a(AbstractC0623y abstractC0623y, C0424b c0424b, boolean z) {
        if (abstractC0623y.f3943aB != null) {
            abstractC0623y.f3943aB.m6721a(abstractC0623y, c0424b, z);
        }
    }

    /* renamed from: j */
    public boolean m6827j(Unit unit) {
        if (!unit.m5814cf() && m6354c(unit.team)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m6872a(C0424b c0424b, Unit unit) {
        return m6871a(c0424b, unit, false);
    }

    /* renamed from: a */
    public boolean m6871a(C0424b c0424b, Unit unit, boolean z) {
        return c0424b.mo5235b(unit);
    }

    /* renamed from: a */
    public void m6887a(AbstractC0150a abstractC0150a) {
        if (!this.f622bI.contains(abstractC0150a)) {
            this.f622bI.add(abstractC0150a);
        } else {
            m6347c("Skipping add of component: " + abstractC0150a.mo6801a().name());
        }
    }
}
