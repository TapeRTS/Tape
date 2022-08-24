package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p027f.C0541f;
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

/* renamed from: com.corrodinggames.rts.game.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class C0164i extends AbstractC0170o {

    /* renamed from: a */
    float f688a;

    /* renamed from: b */
    EnumC0165j f689b;

    /* renamed from: c */
    EnumC0166k f690c;

    /* renamed from: d */
    float f691d;

    /* renamed from: e */
    float f692e;

    /* renamed from: f */
    float f693f;

    /* renamed from: g */
    float f694g;

    /* renamed from: h */
    int f695h;

    /* renamed from: i */
    float f696i;

    /* renamed from: j */
    float f697j;

    /* renamed from: k */
    float f698k;

    /* renamed from: l */
    float f699l;

    /* renamed from: m */
    float f700m;

    /* renamed from: n */
    boolean f701n;

    /* renamed from: o */
    boolean f702o;

    /* renamed from: p */
    C1101m f703p;

    /* renamed from: q */
    C1112u f704q;

    /* renamed from: r */
    C1112u f705r;

    /* renamed from: s */
    boolean f706s;

    /* renamed from: t */
    boolean f707t;

    /* renamed from: u */
    float f708u;

    /* renamed from: v */
    float f709v;

    /* renamed from: w */
    PointF f710w;

    /* renamed from: x */
    PointF f711x;

    /* renamed from: y */
    int f712y;

    /* renamed from: z */
    InterfaceC0303as f713z;

    /* renamed from: A */
    C0424b f714A;

    /* renamed from: B */
    C0424b f715B;

    /* renamed from: C */
    int f716C;

    /* renamed from: D */
    int f717D;

    /* renamed from: E */
    String f718E;

    /* renamed from: F */
    int f719F;

    /* renamed from: G */
    int f720G;

    /* renamed from: H */
    boolean f721H;

    /* renamed from: I */
    int f722I;

    /* renamed from: J */
    int f723J;

    /* renamed from: K */
    int f724K;

    /* renamed from: L */
    int f725L;

    /* renamed from: M */
    boolean f726M;

    /* renamed from: N */
    ArrayList f727N;

    /* renamed from: O */
    InterfaceC0303as f728O;

    /* renamed from: P */
    C0424b f729P;

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.m1564a(this.f689b);
        c0859ar.m1564a(this.f690c);
        c0859ar.mo1488a(this.f691d);
        c0859ar.mo1488a(this.f692e);
        c0859ar.mo1488a(this.f693f);
        c0859ar.mo1488a(this.f694g);
        c0859ar.mo1488a(this.f696i);
        c0859ar.mo1488a(this.f697j);
        c0859ar.mo1488a(this.f698k);
        c0859ar.mo1488a(this.f699l);
        c0859ar.m1554c(4);
        c0859ar.mo1488a(this.f709v);
        c0859ar.mo1488a(this.f700m);
        c0859ar.mo1482a(this.f701n);
        c0859ar.mo1482a(this.f702o);
        c0859ar.mo1487a(this.f695h);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void m6719a(C0876k c0876k) {
        this.f689b = (EnumC0165j) c0876k.m1461b(EnumC0165j.class);
        this.f690c = (EnumC0166k) c0876k.m1461b(EnumC0166k.class);
        this.f691d = c0876k.m1453g();
        this.f692e = c0876k.m1453g();
        this.f693f = c0876k.m1453g();
        this.f694g = c0876k.m1453g();
        this.f696i = c0876k.m1453g();
        this.f697j = c0876k.m1453g();
        this.f698k = c0876k.m1453g();
        this.f699l = c0876k.m1453g();
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f709v = c0876k.m1453g();
        }
        if (m1457d >= 2) {
            this.f700m = c0876k.m1453g();
        }
        if (m1457d >= 3) {
            this.f701n = c0876k.m1455e();
            this.f702o = c0876k.m1455e();
        }
        if (m1457d >= 4) {
            this.f695h = c0876k.m1454f();
        }
        super.m6672a(c0876k);
    }

    public C0164i(C0136a c0136a, float f, float f2) {
        super(c0136a, f, f2);
        this.f691d = -1.0f;
        this.f694g = 100.0f;
        this.f696i = 50.0f;
        this.f697j = 50.0f;
        this.f703p = new C1101m();
        this.f704q = new C1112u();
        this.f705r = new C1112u();
        this.f709v = 0.0f;
        this.f710w = new PointF();
        this.f711x = new PointF();
        this.f721H = false;
        this.f727N = new ArrayList();
    }

    /* renamed from: a */
    public PointF m6736a() {
        C0180g m6598e;
        GameEngine gameEngine = GameEngine.getInstance();
        PointF pointF = null;
        int i = (int) (this.f762U * gameEngine.f6104bL.f788r);
        gameEngine.f6104bL.m6652a(this.f760S, this.f761T);
        int i2 = gameEngine.f6104bL.f800T;
        int i3 = gameEngine.f6104bL.f801U;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (gameEngine.f6104bL.m6608c(i4, i5) && (m6598e = gameEngine.f6104bL.m6598e(i4, i5)) != null && m6598e.f921i) {
                    Unit m4514b = AbstractC0488d.m4514b(i4, i5);
                    boolean z = false;
                    if (m4514b == null) {
                        z = true;
                    }
                    if (m4514b != null && (m4514b instanceof AbstractC0623y) && !((AbstractC0623y) m4514b).getUnitType().mo5699p()) {
                        z = true;
                    }
                    if (z) {
                        gameEngine.f6104bL.m6648a(i4, i5);
                        if (pointF == null || CommonUtils.m2360a(0, 100) < 50) {
                            this.f710w.m7213a(gameEngine.f6104bL.f800T + gameEngine.f6104bL.f786p, gameEngine.f6104bL.f801U + gameEngine.f6104bL.f787q);
                            pointF = this.f710w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m6723a(AbstractC0623y abstractC0623y) {
        this.f704q.remove(abstractC0623y);
    }

    /* renamed from: b */
    public void m6717b() {
        this.f703p.clear();
        this.f704q.clear();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && !unit.isDead && !unit.m5755u() && m6732a(unit)) {
                this.f704q.m519a(unit);
                InterfaceC0303as interfaceC0303as = unit.f1688dx;
                if (!this.f703p.contains(interfaceC0303as)) {
                    this.f703p.add(interfaceC0303as);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m6729a(InterfaceC0303as interfaceC0303as) {
        if (m6725a(interfaceC0303as, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m6715b(InterfaceC0303as interfaceC0303as) {
        if ((GameEngine.getInstance().f6222ar && !interfaceC0303as.mo5719C()) || interfaceC0303as.mo5695w()) {
            return false;
        }
        Object[] m559a = this.f703p.m559a();
        int size = this.f703p.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) m559a[i];
            Unit[] m523a = this.f704q.m523a();
            int i2 = 0;
            int size2 = this.f704q.size();
            while (true) {
                if (i2 < size2) {
                    Unit unit = m523a[i2];
                    if (unit.getUnitType() != interfaceC0303as2 || !(unit instanceof AbstractC0623y)) {
                        i2++;
                    } else if (((AbstractC0623y) unit).m3116b(interfaceC0303as, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public InterfaceC0303as m6714c() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f759R.f584aX) {
            return null;
        }
        int m6734a = m6734a(this.f759R.f614bB);
        InterfaceC0303as interfaceC0303as = null;
        float f = -1.0f;
        Iterator it = UnitType.f1790ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
            if (interfaceC0303as2.mo5705j() && m6715b(interfaceC0303as2)) {
                int m6874a = this.f759R.m6874a(interfaceC0303as2, EnumC0157b.include);
                int m6712c = m6712c(interfaceC0303as2);
                boolean z = false;
                if (interfaceC0303as2 instanceof C0453l) {
                    z = true;
                    C0453l c0453l = (C0453l) interfaceC0303as2;
                    if (c0453l.f3263fG.size() != 0) {
                        Iterator it2 = c0453l.f3263fG.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0303as interfaceC0303as3 = (InterfaceC0303as) it2.next();
                            m6874a += this.f759R.m6874a(interfaceC0303as3, EnumC0157b.include);
                            m6712c += m6712c(interfaceC0303as3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (interfaceC0303as2.mo5699p() && !z) {
                    int i = m6712c;
                    if (m6736a() != null && CommonUtils.m2360a(0, 100) < 90) {
                        if (i == 0) {
                            if (this.f759R.f1309o < 5000.0d) {
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
                        if (m6874a >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (interfaceC0303as2 == UnitType.f1735b && (m6874a < 5 || m6734a == 0)) {
                    if (m6874a == 0) {
                        f2 = 0.8f;
                    } else if (m6712c < 2) {
                        f2 = 0.46f / (m6874a + (m6712c * 2));
                    }
                }
                if (interfaceC0303as2 == UnitType.f1737d && this.f759R.m6862ad() && (m6874a < 5 || m6734a == 0)) {
                    if (m6874a == 0) {
                        f2 = 0.3f;
                    } else if (m6712c < 1) {
                        f2 = 0.1f / (m6874a + (m6712c * 2));
                    }
                }
                if (interfaceC0303as2 == UnitType.f1736c && (m6874a < 5 || m6734a == 0)) {
                    if (m6874a == 0) {
                        f2 = 0.48f;
                    } else if (m6712c < 2) {
                        f2 = 0.29f / (m6874a + m6712c);
                    }
                }
                if (interfaceC0303as2 == UnitType.f1739f) {
                    if (m6712c == 0) {
                        f2 = 0.47f;
                    } else if (m6712c < 3) {
                        f2 = 0.35f / m6712c;
                    } else if (m6712c < 4) {
                        f2 = 0.025f / m6712c;
                    }
                }
                if (interfaceC0303as2 == UnitType.f1758y && m6712c == 0) {
                    f2 = 0.018f;
                }
                if (interfaceC0303as2 == UnitType.f1761B && m6712c == 0) {
                    f2 = 0.02f;
                }
                if (interfaceC0303as2 == UnitType.f1740g) {
                    if (m6712c == 0) {
                        f2 = 0.42f;
                    } else if (this.f759R.m6894Y()) {
                        if (m6712c < 4) {
                            f2 = 0.3f / m6712c;
                        }
                    } else if (m6712c < 3) {
                        f2 = 0.3f / m6712c;
                    } else if (m6712c < 4) {
                        f2 = 0.02f / m6712c;
                    }
                }
                if (interfaceC0303as2 == UnitType.f1769J && this.f759R.f1309o > 2000.0d && m6712c < 5) {
                    if (m6874a == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * m6874a) + m6712c);
                    }
                }
                if (interfaceC0303as2 == UnitType.f1763D && ((!gameEngine.m1221N() || !gameEngine.networkEngine.f5597aO.f5656i) && this.f759R.f1309o > 2200.0d && m6874a < 4)) {
                    if (m6874a == 0) {
                        f2 = 0.06f;
                    } else if (m6712c < 1) {
                        f2 = 0.05f / (m6874a + (m6712c * 2));
                    }
                }
                if (z) {
                    C0453l c0453l2 = (C0453l) interfaceC0303as2;
                    if (!c0453l2.f3153fr && ((m6874a < c0453l2.f3154fs || c0453l2.f3154fs == -1) && (m6712c < c0453l2.f3155ft || c0453l2.f3155ft == -1))) {
                        f2 = c0453l2.f3156fu;
                        if (m6712c < c0453l2.f3157fv) {
                            f2 = c0453l2.f3158fw;
                        }
                        if (m6712c == 0) {
                            f2 += c0453l2.f3159fx;
                        }
                        if (m6874a == 0) {
                            f2 += c0453l2.f3160fy;
                        }
                        if (interfaceC0303as2.mo5699p() && m6736a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.f759R.m6893Z() && interfaceC0303as2 == UnitType.f1766G && this.f759R.f1309o > 15000.0d) {
                    if (m6874a == 0) {
                        f2 = 0.04f;
                    }
                    if (this.f759R.f1309o > 55000.0d && m6874a == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || CommonUtils.rnd(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    interfaceC0303as = interfaceC0303as2;
                }
            }
        }
        this.f693f = f;
        return interfaceC0303as;
    }

    /* renamed from: a */
    public int m6734a(AbstractC0159d abstractC0159d) {
        int i = 0;
        Iterator it = abstractC0159d.f649c.iterator();
        while (it.hasNext()) {
            i += m6712c(((C0160e) it.next()).f652a);
        }
        return i;
    }

    /* renamed from: c */
    public int m6712c(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        C1112u c1112u = this.f704q;
        Unit[] m523a = c1112u.m523a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == this.f759R && unit.f1688dx == interfaceC0303as && m6732a(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m6711d() {
        int i = 0;
        C1112u c1112u = this.f704q;
        Unit[] m523a = c1112u.m523a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.team == this.f759R && (unit instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (m6720a(abstractC0623y, false) && !abstractC0623y.f1598bL && abstractC0623y.f3942aA == null && this.f759R.m6831h(abstractC0623y) && this.f759R.m6829i(abstractC0623y)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m6708e() {
        return this.f724K;
    }

    /* renamed from: f */
    public boolean m6707f() {
        return m6703h() != 0;
    }

    /* renamed from: g */
    public Unit m6705g() {
        float f = this.f762U + 120.0f;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.f6951ek + f > this.f760S && unit.f6951ek - f < this.f760S && unit.f6952el + f > this.f761T && unit.f6952el - f < this.f761T && unit.team != this.f759R && m6673a(unit, 120.0f) && unit.team.m6354c(this.f759R) && this.f759R.m6827j(unit)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m6703h() {
        return m6735a(60.0f);
    }

    /* renamed from: a */
    public int m6735a(float f) {
        int i = 0;
        float f2 = this.f762U + f;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit.f6951ek + f2 > this.f760S && unit.f6951ek - f2 < this.f760S && unit.f6952el + f2 > this.f761T && unit.f6952el - f2 < this.f761T && unit.team != this.f759R && m6673a(unit, f) && unit.team.m6354c(this.f759R) && unit.canAttack() && this.f759R.m6827j(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m6702i() {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m6705g = m6705g();
        if (m6705g != null) {
            C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
            Unit[] m523a = Unit.f1589bD.m523a();
            int size = Unit.f1589bD.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m523a[i];
                if (unit instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                    if (unit.team == this.f759R && this.f759R.m6843b(unit, m6705g) && this.f759R.m6829i(abstractC0623y) && abstractC0623y.m3136aq()) {
                        if (!unit.f1598bL) {
                            if (C0136a.m6879a(unit, this.f760S, this.f761T, 800.0f)) {
                                m2594a.m2491a(abstractC0623y);
                            }
                        } else if (C0136a.m6879a(unit, this.f760S, this.f761T, 540.0f)) {
                            m2594a.m2491a(abstractC0623y);
                        }
                    }
                }
            }
            m2594a.m2493a(m6705g);
        }
    }

    /* renamed from: a */
    public boolean m6732a(Unit unit) {
        return m6730a(unit, false);
    }

    /* renamed from: a */
    public boolean m6730a(Unit unit, boolean z) {
        if ((unit instanceof AbstractC0623y) && ((AbstractC0623y) unit).f3943aB == this) {
            if (!z || m6671b(unit)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6720a(AbstractC0623y abstractC0623y, boolean z) {
        if (abstractC0623y.f3943aB == this) {
            if (!z || m6671b(abstractC0623y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public int m6701j() {
        int i = 0;
        Iterator it = m6700k().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (this.f759R != unit.team && unit.team.m6354c(this.f759R) && (unit instanceof AbstractC0623y) && m6671b(unit)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public C0541f m6700k() {
        return GameEngine.getInstance().f6121cc.m3784b(this.f760S, this.f761T, this.f762U);
    }

    /* renamed from: x */
    private AbstractC0623y m6689x() {
        return m6728a((InterfaceC0303as) null, (PointF) null, true);
    }

    /* renamed from: y */
    private AbstractC0623y m6688y() {
        return m6706f(null);
    }

    /* renamed from: f */
    private AbstractC0623y m6706f(InterfaceC0303as interfaceC0303as) {
        return m6728a(interfaceC0303as, (PointF) null, false);
    }

    /* renamed from: a */
    private AbstractC0623y m6728a(InterfaceC0303as interfaceC0303as, PointF pointF, boolean z) {
        if (this.f724K == 0) {
            return null;
        }
        this.f712y = 0;
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        GameEngine gameEngine = GameEngine.getInstance();
        if (interfaceC0303as != null && ((gameEngine.f6222ar && !interfaceC0303as.mo5719C()) || interfaceC0303as.mo5695w())) {
            return null;
        }
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && m6732a(unit) && unit.f1650cL == null && unit.mo3143aj() && (unit instanceof AbstractC0623y) && this.f759R.m6829i(unit)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                if (C0161f.m6778a(abstractC0623y2) && (!z || abstractC0623y2.mo3295I())) {
                    this.f712y++;
                    if (interfaceC0303as == null || abstractC0623y2.m3116b(interfaceC0303as, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = CommonUtils.m2366a(pointF.x, pointF.y, unit.f6951ek, unit.f6952el);
                        }
                        if (abstractC0623y == null) {
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
                            abstractC0623y = (AbstractC0623y) unit;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: a */
    private AbstractC0623y m6731a(Unit unit, PointF pointF, boolean z) {
        if (this.f725L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        GameEngine.getInstance();
        Unit[] m523a = this.f704q.m523a();
        int size = this.f704q.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m523a[i];
            if (unit2.team == this.f759R && m6732a(unit2) && unit2.f1650cL == null) {
                InterfaceC0303as unitType = unit2.getUnitType();
                if (unitType.mo5701n() && (unit2 instanceof AbstractC0623y) && this.f759R.m6829i(unit2)) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit2;
                    if (C0161f.m6775b(abstractC0623y2) && ((!z || abstractC0623y2.mo3295I()) && (unit == null || abstractC0623y2.m5763h(unit, true)))) {
                        boolean z2 = false;
                        if (unitType instanceof C0453l) {
                            C0453l c0453l = (C0453l) unitType;
                            if (c0453l.f3164fC != null && !m6724a(c0453l.f3164fC)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = CommonUtils.m2366a(pointF.x, pointF.y, unit2.f6951ek, unit2.f6952el);
                        }
                        if (abstractC0623y == null) {
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
                            abstractC0623y = (AbstractC0623y) unit2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: g */
    private boolean m6704g(InterfaceC0303as interfaceC0303as) {
        PointF e;
        AbstractC0623y m6728a;
        this.f713z = interfaceC0303as;
        this.f714A = null;
        this.f715B = null;
        GameEngine gameEngine = GameEngine.getInstance();
        if (interfaceC0303as.mo5699p()) {
            e = m6736a();
        } else {
            e = m6667e(interfaceC0303as);
        }
        if (e == null || (m6728a = m6728a(interfaceC0303as, e, false)) == null) {
            return false;
        }
        if (interfaceC0303as == UnitType.f1737d) {
            int m475c = C1117y.m475c(e.x, e.y, EnumC0246ao.f1706e);
            this.f759R.getClass();
            if (m475c < 3000) {
                return false;
            }
        }
        int i = 1;
        Action m3195a = m6728a.m3195a(interfaceC0303as, true);
        if (m3195a != null) {
            i = m3195a.m6044t();
        } else {
            GameEngine.m1145b("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + interfaceC0303as.mo5706i());
        }
        if (!m3195a.mo4245b(m6728a) || !m3195a.mo4247a((Unit) m6728a, false)) {
            if (!this.f759R.m6872a(m3195a.m6105B(), m6728a)) {
                this.f714A = m3195a.m6105B();
                this.f715B = this.f714A.m5184i(m6728a);
                return true;
            }
            return true;
        } else if (m3195a.m6106A()) {
            C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
            m2594a.m2491a(m6728a);
            m2594a.m2495a(m3195a.m6095N(), e, (Unit) null);
            return true;
        } else {
            C0749e m2594a2 = gameEngine.f6124cf.m2594a(this.f759R);
            m2594a2.m2491a(m6728a);
            m2594a2.m2500a(e.x, e.y, interfaceC0303as, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m6687z() {
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && m6732a(unit) && unit.isActive() && !unit.m5755u() && (unit instanceof AbstractC0623y) && ((AbstractC0623y) unit).m3144ai()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6724a(C0449h c0449h) {
        C0449h m5787dc;
        Unit[] m523a = this.f704q.m523a();
        int size = this.f704q.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && unit.isActive() && (m5787dc = unit.m5787dc()) != null && C0448g.m5061a(c0449h, m5787dc)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private AbstractC0623y m6725a(InterfaceC0303as interfaceC0303as, boolean z, boolean z2) {
        Unit[] m523a = this.f704q.m523a();
        int size = this.f704q.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && unit.isActive() && this.f759R.m6829i(unit) && (unit instanceof InterfaceC0501l) && (unit instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                InterfaceC0501l interfaceC0501l = (InterfaceC0501l) unit;
                Action m5771e = unit.m5771e(interfaceC0303as);
                if (m5771e != null && ((interfaceC0501l.mo4370dv() || !z) && !m5771e.m6055m(unit) && m5771e.mo4245b(abstractC0623y) && m5771e.mo4247a((Unit) abstractC0623y, false) && ((!(unit instanceof CommandCenter) || interfaceC0303as.mo5702m() || m6691u() <= 2 || this.f706s || !z) && (!z2 || abstractC0623y.f3944aC)))) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m6733a(AbstractC0159d abstractC0159d, boolean z) {
        Iterator it = abstractC0159d.m6788a().iterator();
        while (it.hasNext()) {
            if (m6727a(((C0160e) it.next()).f652a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m6727a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m6726a(interfaceC0303as, z, 1);
    }

    /* renamed from: a */
    private boolean m6726a(InterfaceC0303as interfaceC0303as, boolean z, int i) {
        if (i < 1) {
            GameEngine.m1144b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        AbstractC0623y m6725a = m6725a(interfaceC0303as, true, z);
        if (m6725a == null) {
        }
        if (m6725a == null) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Action e = m6725a.m5771e(interfaceC0303as);
        if (e == null) {
            GameEngine.m1144b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.mo4245b(m6725a)) {
            GameEngine.m1144b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.mo4247a((Unit) m6725a, false)) {
            GameEngine.m1144b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.m6068g(m6725a)) {
            return false;
        } else {
            if (e.m6060k_() && gameEngine.f6222ar) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                m2594a.m2491a(m6725a);
                m2594a.m2496a(e.m6035z());
            }
            return true;
        }
    }

    /* renamed from: l */
    C0164i m6699l() {
        C0164i c0164i;
        float f = -1.0f;
        C0164i c0164i2 = null;
        Iterator it = this.f759R.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && (c0164i = (C0164i) abstractC0170o) != this && c0164i.m6708e() > 1) {
                float a = c0164i.m6674a(this);
                if (c0164i2 == null || a < f) {
                    f = a;
                    c0164i2 = c0164i;
                }
            }
        }
        return c0164i2;
    }

    /* renamed from: m */
    public void m6698m() {
        AbstractC0623y m6689x;
        GameEngine gameEngine = GameEngine.getInstance();
        C0164i m6699l = m6699l();
        if (m6699l != null && m6699l.m6708e() > 1 && (m6689x = m6699l.m6689x()) != null) {
            PointF w = m6665w();
            if (C1117y.m494a(m6689x, w.x, w.y)) {
                boolean m6880a = this.f759R.m6880a(m6689x, w.x, w.y);
                if (m6880a || this.f759R.f566aF != 0) {
                    C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                    m2594a.m2491a(m6689x);
                    m2594a.m2501a(w.x, w.y);
                    this.f695h++;
                    this.f694g = CommonUtils.m2360a(1800, 2500);
                    if (this.f695h >= 2) {
                        this.f694g += 11000.0f;
                    }
                    m6699l.f724K--;
                    if (!m6880a) {
                        boolean z = true;
                        if (m6689x.f3942aA != null) {
                            if (!m6689x.f3942aA.m6749a()) {
                                m6689x.f3942aA.m6745b(m6689x);
                            } else {
                                z = false;
                                if (!m6689x.f3942aA.f687G.contains(m6689x)) {
                                    m6689x.f3942aA.f687G.add(m6689x);
                                }
                            }
                        }
                        if (z) {
                            C0167l c0167l = new C0167l(this.f759R);
                            c0167l.m6683c(m6689x);
                            c0167l.f760S = w.x;
                            c0167l.f761T = w.y;
                        }
                        this.f694g = CommonUtils.m2360a(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private Unit m6737A() {
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.team == this.f759R && m6730a(unit, true) && unit.m5867bI() && (unit.f1631cs < unit.f1632ct - 1.0f || unit.f1623ck < 1.0f)) {
                return unit;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m6697n() {
        GameEngine.getInstance();
        if (this.f705r.size() == 0 || this.f706s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            InterfaceC0303as m6781c = this.f759R.f612bz.m6781c();
            if (m6781c != null && m6729a(m6781c) && m6709d(m6781c)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6709d(com.corrodinggames.rts.game.units.InterfaceC0303as r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.p010a.C0164i.m6709d(com.corrodinggames.rts.game.units.as):boolean");
    }

    /* renamed from: o */
    public void m6696o() {
        Unit m6694r;
        if (this.f705r.size() != 0 && (m6694r = m6694r()) != null) {
            this.f711x.m7213a(m6694r.f6951ek, m6694r.f6952el);
            AbstractC0623y m6731a = m6731a(m6694r, this.f711x, true);
            if (m6731a != null) {
                m6722a(m6731a, m6694r);
            }
        }
    }

    /* renamed from: q */
    public void m6695q() {
        AbstractC0623y abstractC0623y;
        C0305au m3135ar;
        Unit m5666i;
        if (this.f705r.size() != 0 && this.f715B != null) {
            Unit[] m523a = this.f704q.m523a();
            int size = this.f704q.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m523a[i];
                if (unit.team == this.f759R && m6732a(unit) && unit.f1650cL == null && unit.getUnitType().mo5701n() && (unit instanceof AbstractC0623y) && this.f759R.m6829i(unit) && CommonUtils.rnd(0.0f, 1.0f) <= 0.3d && (m3135ar = (abstractC0623y = (AbstractC0623y) unit).m3135ar()) != null && m3135ar.m5676d() == EnumC0306av.f1816g && (m5666i = m3135ar.m5666i()) != null && m5666i.mo4209g() > 0.0f && !this.f715B.m5193c(m5666i.m5835cL())) {
                    m6722a(abstractC0623y, m6694r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public Unit m6694r() {
        Unit unit = null;
        for (int i = 0; i < 20; i++) {
            unit = this.f705r.m522a(CommonUtils.m2360a(0, this.f705r.size() - 1));
            if (unit == null || this.f715B == null || this.f715B.m5193c(unit.m5835cL())) {
                break;
            }
        }
        return unit;
    }

    /* renamed from: a */
    public void m6722a(AbstractC0623y abstractC0623y, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (abstractC0623y.mo3501g(unit, true)) {
            C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
            m2594a.m2491a(abstractC0623y);
            m2594a.m2480d(unit);
        }
    }

    /* renamed from: s */
    public void m6693s() {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m6737A = m6737A();
        if (m6737A != null) {
            this.f711x.m7213a(m6737A.f6951ek, m6737A.f6952el);
            AbstractC0623y m6728a = m6728a((InterfaceC0303as) null, this.f711x, true);
            if (m6728a != null && m6728a.mo3518a(m6737A) && m6737A.m5770e(m6728a) < 2) {
                C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                m2594a.m2491a(m6728a);
                m2594a.m2485b(m6737A);
            }
        }
    }

    /* renamed from: b */
    public void m6716b(float f) {
        m6713c(f);
        int i = this.f723J;
        int i2 = this.f722I;
        m6717b();
        this.f701n = m6687z();
        if (this.f701n) {
            this.f702o = true;
        }
        if (i >= 1) {
            m6693s();
        }
        if (this.f726M && this.f722I > 0) {
            m6697n();
            m6695q();
            m6696o();
        }
        if (i < 2 && this.f696i == 0.0f) {
            this.f696i = 300.0f;
            int m6884a = this.f759R.m6884a(this.f759R.f611by, EnumC0157b.include);
            if (!this.f706s || m6884a <= 2) {
                boolean z = CommonUtils.m2360a(0, 100) < 5;
                if (!z && m6733a(this.f759R.f611by, true)) {
                    this.f721H = false;
                    this.f696i = 900.0f;
                } else {
                    if (!z) {
                        this.f721H = true;
                    }
                    if (!this.f706s && this.f709v == 0.0f && i < 1 && this.f694g == 0.0f) {
                        m6698m();
                    }
                }
            }
        }
        int m6701j = m6701j();
        if (i == 0 && i2 == 0) {
            this.f698k += f;
            if (m6701j > 2) {
                this.f698k += 2.0f * f;
            }
            if (m6701j > 5) {
                this.f698k += 4.0f * f;
            }
        } else {
            this.f698k = CommonUtils.m2368a(this.f698k, f);
        }
        if (this.f698k > 11000.0f) {
            m6666p();
        }
        if (this.f689b == EnumC0165j.f730a && ((i != 0 && i2 != 0) || (i2 > 5 && m6701j == 0))) {
            this.f699l += f;
            if (this.f699l > 2000.0f) {
                this.f689b = EnumC0165j.f732c;
            }
        }
        m6692t();
    }

    /* renamed from: t */
    public void m6692t() {
        if (this.f689b == null) {
            GameEngine.m1193a("fixOverlaps: this.state==null");
            GameEngine.m1193a("id:" + this.f758Q);
            GameEngine.m1193a("x:" + this.f760S);
            GameEngine.m1193a("y:" + this.f761T);
            GameEngine.m1193a("radius:" + this.f762U);
            if (this.f759R != null) {
                GameEngine.m1193a("team:" + this.f759R.f1305k);
                return;
            }
            return;
        }
        Iterator it = this.f759R.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && abstractC0170o != this) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (CommonUtils.m2366a(this.f760S, this.f761T, c0164i.f760S, c0164i.f761T) < 400.0f) {
                    if (c0164i.f689b == null) {
                        GameEngine.m1193a("fixOverlaps: targetBase.state==null");
                    } else if (c0164i.f689b.m6686a() < this.f689b.m6686a()) {
                        c0164i.m6666p();
                    } else {
                        m6666p();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m6691u() {
        return this.f722I;
    }

    /* renamed from: c */
    public void m6713c(float f) {
        this.f722I = 0;
        this.f723J = 0;
        this.f725L = 0;
        this.f724K = 0;
        this.f726M = false;
        this.f705r.clear();
        if (1 != 0) {
            Iterator it = m6700k().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.mo4209g() > 0.0f && m6671b(unit)) {
                    this.f726M = true;
                    this.f705r.m519a(unit);
                }
            }
        }
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m523a[i];
            if (unit2.team == this.f759R && (unit2 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (m6720a(abstractC0623y, false) && unit2.isActive() && this.f759R.m6829i(unit2) && !unit2.m5755u()) {
                    InterfaceC0303as unitType = unit2.getUnitType();
                    if (unitType.mo5705j()) {
                        this.f722I++;
                    }
                    if (unitType.mo5702m()) {
                        this.f723J++;
                        if (C0161f.m6778a(abstractC0623y)) {
                            this.f724K++;
                        }
                    }
                    if (unitType.mo5701n()) {
                        this.f725L++;
                    }
                    if (unit2 instanceof InterfaceC0501l) {
                        this.f723J += ((InterfaceC0501l) unit2).mo4366h(UnitType.f1741h);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m6710d(float f) {
        InterfaceC0303as m6714c;
        this.f706s = m6707f();
        this.f707t = this.f706s;
        if (this.f706s) {
            this.f709v += f;
            this.f708u = 100.0f;
        } else {
            this.f709v = 0.0f;
        }
        if (this.f709v > 6000.0f) {
            this.f706s = false;
        }
        this.f700m = CommonUtils.m2368a(this.f700m, f);
        this.f692e = CommonUtils.m2368a(this.f692e, f);
        this.f694g = CommonUtils.m2368a(this.f694g, f);
        this.f696i = CommonUtils.m2368a(this.f696i, f);
        this.f697j = CommonUtils.m2368a(this.f697j, f);
        if (this.f706s && this.f697j == 0.0f) {
            this.f697j = 100 + (this.f758Q % 15);
            if (!this.f759R.f584aX) {
                m6702i();
            }
        }
        if (this.f692e <= 0.0f) {
            this.f692e = 270 + (this.f758Q % 15);
            if (this.f759R.m6894Y()) {
                this.f692e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.f758Q % 15);
            }
            if (this.f693f < 0.2d) {
                this.f692e += 180.0f;
            }
            if (this.f693f < 0.08d) {
                this.f692e += 180.0f;
            }
            if ((m6688y() != null) && (m6714c = m6714c()) != null && ((this.f693f > 0.8d || this.f759R.m6395a(1300.0d)) && ((this.f693f > 0.4d || this.f759R.m6395a(1700.0d)) && ((this.f693f > 0.2d || this.f759R.m6395a(2100.0d)) && ((this.f693f > 0.1d || this.f759R.m6395a(2800.0d)) && ((this.f693f > 0.05d || this.f759R.m6395a(3100.0d)) && (this.f693f > 0.01d || this.f759R.m6395a(4800.0d)))))))) {
                this.f716C++;
                if (!m6704g(m6714c)) {
                    this.f692e -= 120.0f;
                    this.f717D++;
                }
            }
        }
        float m6691u = m6691u() / 3.0f;
        if (m6691u < 1.0f) {
            m6691u = 1.0f;
        }
        if (this.f706s) {
            this.f691d = (float) (this.f691d + (f * 0.015d));
        }
        if (this.f693f < 0.6d) {
            if (this.f759R.f587ba < 2) {
                this.f691d = (float) (this.f691d + (f * 7.0E-4d * m6691u));
            } else if (this.f759R.m6395a(1200.0d)) {
                this.f691d = (float) (this.f691d + (f * 1.0E-4d * m6691u));
            }
            if (this.f759R.m6395a(1600.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.001d));
            }
            if (this.f759R.m6395a(2200.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.001d));
            }
            if (this.f759R.m6395a(2600.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.001d));
            }
            if (this.f759R.m6395a(8000.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.005d));
            }
            if (this.f759R.m6395a(9000.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.01d));
            }
            if (this.f759R.m6395a(10100.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.01d));
            }
            if (this.f759R.m6395a(30000.0d)) {
                this.f691d = (float) (this.f691d + (f * 0.05d));
            }
        }
        if (this.f759R.m6395a(5000.0d)) {
            this.f691d = (float) (this.f691d + (f * 0.001d));
        }
        if (!this.f759R.m6395a(800.0d) && !this.f706s && this.f691d > 1.2f) {
            this.f691d = 1.2f;
        }
        if (this.f691d > 3.5f) {
            this.f691d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m6690v();
            if (this.f691d < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m6718a(ArrayList arrayList, AbstractC0159d abstractC0159d, EnumC0246ao enumC0246ao, int i) {
        this.f727N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0303as m6787a = abstractC0159d.m6787a(enumC0246ao);
            if (m6787a != null && !this.f727N.contains(m6787a)) {
                this.f727N.add(m6787a);
            }
        }
        arrayList.addAll(this.f727N);
    }

    /* renamed from: v */
    public void m6690v() {
        EnumC0246ao enumC0246ao;
        Unit m6705g;
        int m6711d = m6711d();
        int i = 12;
        int i2 = 50;
        if (this.f759R.m6894Y()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.f759R.m6395a(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean m6861ae = this.f759R.m6861ae();
        boolean m6860af = this.f759R.m6860af();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.f759R.f593bg) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.f759R.f594bh) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float rnd = CommonUtils.rnd(0.0f, 1.0f);
        if (rnd < f) {
            enumC0246ao = EnumC0246ao.f1703b;
        } else if (rnd < f + f2) {
            enumC0246ao = EnumC0246ao.f1707f;
        } else {
            enumC0246ao = EnumC0246ao.f1705d;
        }
        if ((this.f759R.m6395a(1300.0d) && this.f691d >= 1.0f) || (this.f759R.m6395a(300.0d) && this.f691d >= 3.0f)) {
            if (this.f759R.m6862ad() && this.f759R.f588bb < i && CommonUtils.m2290c(100) < 35) {
                m6718a(arrayList, this.f759R.f606bt, null, 2);
                if (a) {
                }
            }
            if (m6711d < 3 && this.f759R.f586aZ < i2) {
                if (enumC0246ao == EnumC0246ao.f1703b) {
                    m6718a(arrayList, this.f759R.f603bq, null, 4);
                    if (a) {
                    }
                } else if (enumC0246ao == EnumC0246ao.f1707f) {
                    m6718a(arrayList, this.f759R.f604br, null, 4);
                    if (a) {
                    }
                } else {
                    m6718a(arrayList, this.f759R.f605bs, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.f691d >= 1.0f && m6861ae && this.f700m == 0.0f) {
                int m6884a = this.f759R.m6884a(this.f759R.f609bw, EnumC0157b.include);
                int m6884a2 = m6884a + this.f759R.m6884a(this.f759R.f610bx, EnumC0157b.include);
                int m6855ak = this.f759R.m6855ak();
                if ((this.f759R.m6395a(1700.0d) || m6855ak > 10 || (this.f759R.f597bk == 0 && m6855ak >= 1 && m6884a == 0)) && (m6884a2 < 3 || (m6855ak > 20 && m6884a2 < 5))) {
                    if (m6860af && m6884a2 < 2) {
                        m6718a(arrayList, this.f759R.f608bv, null, 2);
                    } else {
                        m6718a(arrayList, this.f759R.f608bv, EnumC0246ao.f1705d, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f719F++;
        }
        while (arrayList.size() != 0) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) arrayList.remove(arrayList.size() - 1);
            Unit m5871b = Unit.m5871b(interfaceC0303as);
            boolean z = true;
            if (this.f706s && CommonUtils.m2290c(100) < 10 && (m6705g = m6705g()) != null && !this.f759R.m6843b(m5871b, m6705g)) {
                this.f719F++;
                z = false;
            }
            if (z) {
                if (m6727a(interfaceC0303as, false)) {
                    this.f719F++;
                    this.f759R.f616bD.m6793a(interfaceC0303as);
                    this.f691d -= 1.0f;
                    if (this.f759R.m6832g(m5871b)) {
                        this.f700m = 1000.0f;
                        this.f759R.f597bk++;
                        return;
                    }
                    return;
                }
                this.f720G++;
            }
        }
    }

    /* renamed from: a */
    public void m6721a(AbstractC0623y abstractC0623y, C0424b c0424b, boolean z) {
        this.f728O = abstractC0623y.getUnitType();
        if (z) {
            this.f729P = null;
            this.f715B = null;
            return;
        }
        this.f729P = c0424b;
        this.f715B = c0424b.m5184i(abstractC0623y);
    }
}
