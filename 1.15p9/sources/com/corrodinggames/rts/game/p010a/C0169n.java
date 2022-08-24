package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/n.class */
public class C0169n extends AbstractC0163h {

    /* renamed from: a */
    boolean f739a;

    /* renamed from: b */
    int f740b;

    /* renamed from: c */
    int f741c;

    /* renamed from: d */
    C0164i f742d;

    /* renamed from: e */
    float f743e;

    /* renamed from: f */
    float f744f;

    /* renamed from: g */
    float f745g;

    /* renamed from: h */
    float f746h;

    /* renamed from: i */
    float f747i;

    /* renamed from: j */
    float f748j;

    /* renamed from: k */
    float f749k;

    /* renamed from: l */
    int f750l;

    /* renamed from: m */
    AbstractC0163h f751m;

    /* renamed from: n */
    AbstractC0623y f752n;

    /* renamed from: o */
    float f753o;

    /* renamed from: p */
    boolean f754p;

    /* renamed from: q */
    boolean f755q;

    /* renamed from: r */
    float f756r;

    /* renamed from: s */
    float f757s;

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f739a);
        c0859ar.mo1487a(this.f740b);
        c0859ar.mo1487a(this.f741c);
        c0859ar.mo1487a(this.f686F.size());
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            c0859ar.m1572a((AbstractC0623y) it.next());
        }
        c0859ar.m1554c(5);
        c0859ar.mo1487a(this.f759R.m6883a(this.f751m));
        c0859ar.mo1482a(this.f755q);
        c0859ar.m1572a(this.f752n);
        c0859ar.mo1488a(this.f753o);
        c0859ar.mo1482a(this.f754p);
        c0859ar.mo1488a(this.f756r);
        c0859ar.mo1488a(this.f757s);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void m6681a(C0876k c0876k) {
        this.f739a = c0876k.m1455e();
        this.f740b = c0876k.m1454f();
        this.f741c = c0876k.m1454f();
        m6738q();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            AbstractC0623y m1444p = c0876k.m1444p();
            if (m1444p != null) {
                if (!this.f759R.m6832g(m1444p)) {
                    GameEngine.m1145b("TransporterGroup:readIn: Unit is not transporterUnit");
                } else {
                    m6748a(m1444p);
                }
            }
        }
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f751m = (AbstractC0163h) this.f759R.m6822m(c0876k.m1454f());
        }
        if (m1457d >= 2) {
            this.f755q = c0876k.m1455e();
        }
        if (m1457d >= 3) {
            this.f752n = c0876k.m1444p();
        }
        if (m1457d >= 4) {
            this.f753o = c0876k.m1453g();
            this.f754p = c0876k.m1455e();
        }
        if (m1457d >= 5) {
            this.f756r = c0876k.m1453g();
            this.f757s = c0876k.m1453g();
        }
        super.m6672a(c0876k);
    }

    public C0169n(C0136a c0136a) {
        super(c0136a);
        this.f743e = 100.0f;
        this.f744f = 4000.0f;
        this.f745g = 100.0f;
        this.f753o = 0.0f;
        this.f754p = false;
    }

    /* renamed from: c */
    public void m6679c() {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (!unit.isDead && unit.team == this.f759R && this.f750l > this.f686F.size() && (unit instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (!abstractC0623y.f1599bM && abstractC0623y.f3942aA == null && this.f759R.m6832g(abstractC0623y) && this.f759R.m6829i(abstractC0623y)) {
                    m6748a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m6677d() {
        return this.f751m != null;
    }

    /* renamed from: c */
    public void m6678c(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f746h += f;
        m6741n();
        if (this.f750l <= this.f686F.size()) {
        }
        this.f747i = CommonUtils.m2368a(this.f747i, f);
        this.f748j = CommonUtils.m2368a(this.f748j, f);
        this.f749k = CommonUtils.m2368a(this.f749k, f);
        if (!m6677d() && !this.f755q && this.f750l > this.f686F.size() && this.f747i == 0.0f) {
            this.f747i = 300.0f;
            m6679c();
        }
        if (!m6677d() && this.f686F.size() != 0) {
            if (!m6677d()) {
                this.f744f = CommonUtils.m2368a(this.f744f, f);
                if (this.f744f == 0.0f) {
                    this.f744f = 4000.0f;
                    if (this.f742d != null) {
                        PointF w = this.f742d.m6665w();
                        this.f760S = w.x;
                        this.f761T = w.y;
                    }
                }
            }
            if (this.f748j == 0.0f) {
                this.f748j = 400.0f;
                C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                Iterator it = this.f686F.iterator();
                while (it.hasNext()) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                    if (m6669c(abstractC0623y) > 28900.0f && !abstractC0623y.m3130aw()) {
                        m2594a.m2491a(abstractC0623y);
                    } else if (((InterfaceC0242ak) abstractC0623y).mo5935bB() != 0) {
                        C0208c co = abstractC0623y.m5805co();
                        C0749e m2594a2 = gameEngine.f6124cf.m2594a(this.f759R);
                        m2594a2.m2491a(abstractC0623y);
                        m2594a2.m2496a(co);
                    }
                }
                m2594a.m2501a(this.f760S, this.f761T);
            }
            if (this.f751m == null) {
                this.f745g = CommonUtils.m2368a(this.f745g, f);
                if (this.f745g == 0.0f) {
                    this.f745g = 100.0f;
                    if (CommonUtils.m2360a(0, 100) < 80) {
                        m6682a(f, true);
                    }
                    if (this.f751m == null) {
                        m6682a(f, false);
                    }
                }
            }
        }
        if (this.f751m != null && this.f751m.f763V) {
            this.f751m = null;
        }
        if (!this.f755q) {
            if (this.f751m != null) {
                ArrayList arrayList = this.f751m.f687G;
                if (this.f752n != null && (this.f752n.isDead || this.f752n.f1650cL != null || this.f752n.f1651cM != null)) {
                    arrayList.remove(this.f752n);
                    this.f752n = null;
                }
                if (this.f752n == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                        if (abstractC0623y2.f1650cL == null) {
                            Iterator it3 = this.f686F.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC0623y) it3.next()).m5792d((Unit) abstractC0623y2, false)) {
                                        this.f752n = abstractC0623y2;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f752n == null) {
                        this.f755q = true;
                        this.f748j = 0.0f;
                        this.f749k = 0.0f;
                        this.f756r = this.f751m.f760S;
                        this.f757s = this.f751m.f761T;
                    }
                }
                if (this.f752n != null) {
                    if (this.f748j == 0.0f) {
                        this.f748j = 400.0f;
                        C0749e m2594a3 = gameEngine.f6124cf.m2594a(this.f759R);
                        Iterator it4 = this.f686F.iterator();
                        while (it4.hasNext()) {
                            m2594a3.m2491a((AbstractC0623y) it4.next());
                        }
                        m2594a3.m2501a(this.f752n.f6951ek, this.f752n.f6952el);
                    }
                    if (this.f749k == 0.0f) {
                        this.f749k = 80.0f;
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            AbstractC0623y abstractC0623y3 = (AbstractC0623y) it5.next();
                            Iterator it6 = this.f686F.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    AbstractC0623y abstractC0623y4 = (AbstractC0623y) it6.next();
                                    if (abstractC0623y4.m5792d((Unit) abstractC0623y3, false) && CommonUtils.m2366a(abstractC0623y4.f6951ek, abstractC0623y4.f6952el, abstractC0623y3.f6951ek, abstractC0623y3.f6952el) < 14400.0f) {
                                        C0749e m2594a4 = gameEngine.f6124cf.m2594a(this.f759R);
                                        m2594a4.m2491a(abstractC0623y3);
                                        m2594a4.m2478e(abstractC0623y4);
                                        break;
                                    }
                                }
                            }
                        }
                        boolean z = false;
                        Iterator it7 = this.f686F.iterator();
                        while (it7.hasNext()) {
                            if (((AbstractC0623y) it7.next()).m5792d((Unit) this.f752n, false)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f752n = null;
                        }
                    }
                }
            }
        } else if (this.f751m == null) {
            m6676e();
        } else {
            if (this.f748j == 0.0f) {
                this.f748j = 400.0f;
                float rnd = this.f751m.f760S + CommonUtils.rnd(-40.0f, 40.0f);
                float rnd2 = this.f751m.f761T + CommonUtils.rnd(-40.0f, 40.0f);
                if (this.f753o > 600.0f) {
                    rnd += CommonUtils.rnd(-300.0f, 300.0f);
                    rnd2 += CommonUtils.rnd(-300.0f, 300.0f);
                }
                if (this.f753o > 1200.0f) {
                    rnd += CommonUtils.rnd(-300.0f, 300.0f);
                    rnd2 += CommonUtils.rnd(-300.0f, 300.0f);
                }
                if (C1117y.m501a(rnd, rnd2, EnumC0246ao.f1703b)) {
                    rnd += CommonUtils.rnd(-100.0f, 100.0f);
                    rnd2 += CommonUtils.rnd(-100.0f, 100.0f);
                }
                if (C1117y.m501a(rnd, rnd2, EnumC0246ao.f1703b)) {
                    rnd += CommonUtils.rnd(-200.0f, 200.0f);
                    rnd2 += CommonUtils.rnd(-200.0f, 200.0f);
                }
                if (C1117y.m501a(rnd, rnd2, EnumC0246ao.f1703b)) {
                    rnd += CommonUtils.rnd(-200.0f, 200.0f);
                    rnd2 += CommonUtils.rnd(-200.0f, 200.0f);
                }
                if (C1117y.m501a(rnd, rnd2, EnumC0246ao.f1703b)) {
                    this.f748j = 30.0f;
                } else {
                    this.f756r = rnd;
                    this.f757s = rnd2;
                    C0749e m2594a5 = gameEngine.f6124cf.m2594a(this.f759R);
                    Iterator it8 = this.f686F.iterator();
                    while (it8.hasNext()) {
                        AbstractC0623y abstractC0623y5 = (AbstractC0623y) it8.next();
                        if (((InterfaceC0242ak) abstractC0623y5).mo5935bB() != 0) {
                            if (CommonUtils.m2366a(abstractC0623y5.f6951ek, abstractC0623y5.f6952el, this.f756r, this.f757s) > 1600.0f) {
                                m2594a5.m2491a(abstractC0623y5);
                            }
                        } else {
                            C0749e m2594a6 = gameEngine.f6124cf.m2594a(this.f759R);
                            m2594a6.m2491a(abstractC0623y5);
                            m2594a6.m2501a(this.f760S, this.f761T);
                        }
                    }
                    m2594a5.m2501a(this.f756r, this.f757s);
                }
            }
            if (this.f749k == 0.0f) {
                this.f749k = 100.0f;
                Iterator it9 = this.f686F.iterator();
                while (it9.hasNext()) {
                    AbstractC0623y abstractC0623y6 = (AbstractC0623y) it9.next();
                    if (CommonUtils.m2366a(abstractC0623y6.f6951ek, abstractC0623y6.f6952el, this.f756r, this.f757s) < 6400.0f) {
                        this.f754p = true;
                        C0208c co2 = abstractC0623y6.m5805co();
                        C0749e m2594a7 = gameEngine.f6124cf.m2594a(this.f759R);
                        m2594a7.m2491a(abstractC0623y6);
                        m2594a7.m2496a(co2);
                    }
                }
            }
            if (this.f754p) {
                this.f751m.m6740o();
                this.f753o += f;
            }
            boolean z2 = false;
            Iterator it10 = this.f686F.iterator();
            while (it10.hasNext()) {
                AbstractC0623y abstractC0623y7 = (AbstractC0623y) it10.next();
                if (!abstractC0623y7.isDead && ((InterfaceC0242ak) abstractC0623y7).mo5935bB() != 0) {
                    z2 = true;
                }
            }
            if (!z2 || this.f753o > 1700.0f) {
                m6676e();
            }
        }
        if (this.f746h > 1500.0f && this.f686F.size() == 0) {
            m6739p();
        }
    }

    /* renamed from: e */
    public void m6676e() {
        this.f755q = false;
        this.f751m = null;
        this.f753o = 0.0f;
        this.f748j = 0.0f;
        this.f749k = 0.0f;
        this.f754p = false;
        m6675f();
    }

    /* renamed from: a */
    public void m6682a(float f, boolean z) {
        Iterator it = this.f759R.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof AbstractC0163h) && !(abstractC0170o instanceof C0169n) && (!z || (abstractC0170o instanceof C0167l))) {
                AbstractC0163h abstractC0163h = (AbstractC0163h) abstractC0170o;
                if (abstractC0163h.f687G.size() != 0 && !abstractC0163h.m6742m()) {
                    this.f751m = abstractC0163h;
                    this.f752n = null;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C0164i m6680a(boolean z) {
        C0164i c0164i = null;
        Iterator it = this.f759R.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (!c0164i2.f706s || !z) {
                    if (c0164i2.f689b == EnumC0165j.f732c) {
                        c0164i = c0164i2;
                        if (CommonUtils.m2290c(3) == 0) {
                            return c0164i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: f */
    public void m6675f() {
        PointF pointF = null;
        if (1 != 0) {
            this.f742d = m6680a(true);
            if (this.f742d == null) {
                this.f742d = m6680a(false);
            }
            if (this.f742d != null) {
                pointF = this.f742d.m6665w();
            }
        }
        if (pointF == null) {
            pointF = this.f759R.m6857ai();
            this.f742d = null;
        }
        this.f760S = pointF.x;
        this.f761T = pointF.y;
    }
}
