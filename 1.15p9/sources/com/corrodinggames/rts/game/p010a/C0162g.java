package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.water.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/g.class */
public class C0162g extends AbstractC0163h {

    /* renamed from: a */
    boolean f655a;

    /* renamed from: b */
    String f656b;

    /* renamed from: c */
    boolean f657c;

    /* renamed from: d */
    boolean f658d;

    /* renamed from: e */
    boolean f659e;

    /* renamed from: f */
    boolean f660f;

    /* renamed from: g */
    AbstractC0623y f661g;

    /* renamed from: h */
    boolean f662h;

    /* renamed from: i */
    int f663i;

    /* renamed from: j */
    int f664j;

    /* renamed from: k */
    C0164i f665k;

    /* renamed from: l */
    float f666l;

    /* renamed from: m */
    float f667m;

    /* renamed from: n */
    float f668n;

    /* renamed from: o */
    float f669o;

    /* renamed from: p */
    float f670p;

    /* renamed from: q */
    boolean f671q;

    /* renamed from: r */
    boolean f672r;

    /* renamed from: s */
    boolean f673s;

    /* renamed from: t */
    float f674t;

    /* renamed from: u */
    float f675u;

    /* renamed from: v */
    boolean f676v;

    /* renamed from: w */
    Unit f677w;

    /* renamed from: x */
    float f678x;

    /* renamed from: y */
    float f679y;

    /* renamed from: z */
    float f680z;

    /* renamed from: A */
    int f681A;

    /* renamed from: B */
    boolean f682B;

    /* renamed from: C */
    public int f683C;

    /* renamed from: D */
    public Unit f684D;

    /* renamed from: E */
    EnumC0246ao f685E;

    /* renamed from: a */
    public boolean m6774a() {
        return this.f655a;
    }

    /* renamed from: b */
    public boolean m6764b() {
        if (!this.f662h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0162g m6771a(C0136a c0136a, AbstractC0623y abstractC0623y) {
        C0162g c0162g = new C0162g(c0136a, false);
        c0162g.f655a = true;
        c0162g.f657c = true;
        c0162g.f658d = true;
        c0162g.f659e = true;
        c0162g.f661g = abstractC0623y;
        c0162g.m6768a(abstractC0623y);
        c0162g.f681A = 0;
        c0162g.m6750k();
        return c0162g;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f662h);
        c0859ar.mo1487a(this.f663i);
        c0859ar.mo1487a(this.f664j);
        c0859ar.mo1487a(this.f686F.size());
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            c0859ar.m1572a((AbstractC0623y) it.next());
        }
        c0859ar.m1554c(7);
        c0859ar.mo1482a(false);
        c0859ar.mo1482a(this.f673s);
        c0859ar.mo1488a(this.f669o);
        c0859ar.mo1487a(this.f687G.size());
        Iterator it2 = this.f687G.iterator();
        while (it2.hasNext()) {
            c0859ar.m1572a((AbstractC0623y) it2.next());
        }
        c0859ar.mo1482a(this.f682B);
        c0859ar.mo1482a(this.f655a);
        c0859ar.mo1482a(this.f657c);
        c0859ar.mo1482a(this.f658d);
        c0859ar.mo1482a(this.f659e);
        c0859ar.mo1482a(this.f660f);
        c0859ar.m1572a(this.f661g);
        c0859ar.mo1487a(this.f681A);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void m6766a(C0876k c0876k) {
        this.f662h = c0876k.m1455e();
        this.f663i = c0876k.m1454f();
        this.f664j = c0876k.m1454f();
        m6738q();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            AbstractC0623y m1444p = c0876k.m1444p();
            if (m1444p != null) {
                m6768a(m1444p);
            }
        }
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            c0876k.m1455e();
        }
        if (m1457d >= 2) {
            this.f673s = c0876k.m1455e();
        }
        if (m1457d >= 3) {
            this.f669o = c0876k.m1453g();
        }
        if (m1457d >= 4) {
            this.f687G.clear();
            int m1454f2 = c0876k.m1454f();
            for (int i2 = 0; i2 < m1454f2; i2++) {
                AbstractC0623y m1444p2 = c0876k.m1444p();
                if (m1444p2 != null) {
                    this.f687G.add(m1444p2);
                }
            }
        }
        if (m1457d >= 5) {
            this.f682B = c0876k.m1455e();
        }
        if (m1457d >= 6) {
            this.f655a = c0876k.m1455e();
            this.f657c = c0876k.m1455e();
            this.f658d = c0876k.m1455e();
            this.f659e = c0876k.m1455e();
            this.f660f = c0876k.m1455e();
            this.f661g = c0876k.m1444p();
        }
        if (m1457d >= 7) {
            this.f681A = c0876k.m1454f();
        }
        if (!this.f682B) {
            Iterator it = this.f686F.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                if (abstractC0623y instanceof AbstractC0590f) {
                    if (abstractC0623y != null && abstractC0623y.f3942aA == this) {
                        abstractC0623y.f3942aA = null;
                    }
                    if (abstractC0623y != null) {
                        this.f687G.remove(abstractC0623y);
                    }
                    it.remove();
                }
            }
        }
        super.m6672a(c0876k);
    }

    public C0162g(C0136a c0136a) {
        super(c0136a);
        this.f662h = true;
        this.f666l = 1000.0f;
        this.f667m = 100.0f;
        this.f668n = 4000.0f;
        this.f669o = 0.0f;
        this.f670p = 1000.0f;
        this.f671q = false;
        this.f672r = false;
        this.f673s = false;
        this.f674t = 0.0f;
        this.f675u = 0.0f;
        this.f683C = -9999;
        this.f684D = null;
        this.f685E = EnumC0246ao.f1702a;
    }

    public C0162g(C0136a c0136a, boolean z) {
        this(c0136a);
        this.f662h = z;
    }

    /* renamed from: a */
    protected void m6768a(AbstractC0623y abstractC0623y) {
        super.m6748a(abstractC0623y);
        this.f685E = m6751j();
    }

    /* renamed from: c */
    public void m6761c() {
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (!unit.isDead && unit.team == this.f759R && this.f681A > this.f686F.size() && (unit instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (!abstractC0623y.f1598bL && !abstractC0623y.f1599bM && abstractC0623y.f3942aA == null && this.f759R.m6831h(abstractC0623y) && this.f759R.m6829i(abstractC0623y)) {
                    if (this.f682B) {
                        if (unit.mo5645h() != EnumC0246ao.f1703b) {
                            if (!this.f759R.m6880a(abstractC0623y, this.f760S, this.f761T) || (!m6764b() && CommonUtils.m2360a(0, 100) <= 2)) {
                                m6768a(abstractC0623y);
                            }
                        }
                    } else if (unit.mo5645h() != EnumC0246ao.f1706e) {
                        if (!this.f759R.m6880a(abstractC0623y, this.f760S, this.f761T)) {
                        }
                        m6768a(abstractC0623y);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m6759d() {
        if (this.f681A <= this.f686F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Unit m6773a(float f) {
        if (GameEngine.getInstance().f6096by - (f * 1000.0f) < this.f683C) {
            return this.f684D;
        }
        return null;
    }

    /* renamed from: e */
    public Unit m6757e() {
        Unit m6773a = m6773a(6.0f);
        if (m6773a != null) {
            return m6773a;
        }
        return null;
    }

    /* renamed from: f */
    public Unit m6755f() {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            Unit m3151ab = ((AbstractC0623y) it.next()).m3151ab();
            if (m3151ab != null) {
                return m3151ab;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m6767a(C0749e c0749e, boolean z, Unit unit) {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!z || abstractC0623y.m3136aq()) {
                if (unit == null || this.f759R.m6878a(abstractC0623y, unit)) {
                    c0749e.m2491a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public void m6765a(String str) {
        this.f656b = str;
    }

    /* renamed from: a */
    public PointF m6770a(Unit unit) {
        PointF pointF = new PointF();
        pointF.x = this.f760S;
        pointF.y = this.f761T;
        float random = (float) (Math.random() * 360.0d);
        float rnd = CommonUtils.rnd(50.0f, 100.0f);
        pointF.x += CommonUtils.m2249i(random) * rnd;
        pointF.y += CommonUtils.sin(random) * rnd;
        if (unit != null) {
            float m2280d = CommonUtils.m2280d(pointF.x, pointF.y, unit.f6951ek, unit.f6952el);
            float rnd2 = CommonUtils.rnd(100.0f, 200.0f);
            pointF.x += CommonUtils.m2249i(m2280d) * (-rnd2);
            pointF.y += CommonUtils.sin(m2280d) * (-rnd2);
        }
        return pointF;
    }

    /* renamed from: b */
    public void m6763b(float f) {
        Unit m6757e;
        super.m6746b(f);
        m6741n();
        this.f685E = m6751j();
        if (!this.f660f && (m6757e = m6757e()) != null && m6755f() == null) {
            if (m6769a(m6757e, false)) {
                m6765a("fighting attacker");
                C0749e m2594a = GameEngine.getInstance().f6124cf.m2594a(this.f759R);
                m6767a(m2594a, true, m6757e);
                m2594a.m2499a(m6757e.f6951ek, m6757e.f6952el, false);
                return;
            }
            m6765a("flight from attacker");
            PointF m6770a = m6770a(m6757e);
            this.f760S = m6770a.x;
            this.f761T = m6770a.y;
            if (this.f680z > 200.0f) {
                this.f680z = 200.0f;
            }
        }
    }

    /* renamed from: c */
    public void m6760c(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f678x += f;
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y != null && this.f683C < abstractC0623y.f1577br) {
                this.f683C = abstractC0623y.f1577br;
                this.f684D = abstractC0623y.f1578bs;
            }
        }
        m6741n();
        if (m6759d()) {
            this.f666l = CommonUtils.m2368a(this.f666l, f);
        } else if (this.f676v) {
        }
        this.f679y = CommonUtils.m2368a(this.f679y, f);
        this.f680z = CommonUtils.m2368a(this.f680z, f);
        this.f670p = CommonUtils.m2368a(this.f670p, f);
        if (!this.f676v && !this.f672r && !m6759d() && this.f679y == 0.0f) {
            this.f679y = 200 + CommonUtils.m2290c(200);
            m6761c();
        }
        if (!this.f676v || this.f671q) {
            if (!this.f671q) {
                this.f668n = CommonUtils.m2368a(this.f668n, f);
                if (this.f668n == 0.0f) {
                    if (this.f665k == null) {
                        this.f665k = m6754g();
                    }
                    if (this.f665k != null) {
                        PointF w = this.f665k.m6665w();
                        if (!m6772a(w.x, w.y)) {
                            this.f668n = 100.0f;
                            m6765a("random move: bad target");
                        } else {
                            this.f668n = 4000.0f;
                            this.f760S = w.x;
                            this.f761T = w.y;
                            m6765a("random move");
                        }
                    } else {
                        m6765a("random move: no linked base");
                    }
                }
            }
            if (this.f680z == 0.0f) {
                this.f680z = 800.0f;
                C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                Iterator it2 = this.f686F.iterator();
                while (it2.hasNext()) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                    boolean z = true;
                    if (m6669c(abstractC0623y2) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f660f && abstractC0623y2.mo3143aj() && !abstractC0623y2.m3136aq()) {
                        z = false;
                    }
                    if (z) {
                        m2594a.m2491a(abstractC0623y2);
                    }
                }
                if (this.f660f) {
                    m2594a.m2501a(this.f760S, this.f761T);
                } else {
                    m2594a.m2486b(this.f760S, this.f761T);
                }
            }
        }
        if (this.f662h) {
            m6756e(f);
        } else {
            m6758d(f);
        }
        if (this.f681A == 0 && this.f686F.size() == 0) {
            m6739p();
        }
        if (this.f657c) {
            if (this.f661g == null || this.f661g.isDead) {
                m6739p();
            }
        }
    }

    /* renamed from: g */
    C0164i m6754g() {
        float f = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f759R.f599bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (m6762b(c0164i2.f760S, c0164i2.f761T)) {
                    float d = c0164i2.m6668d(this.f760S, this.f761T);
                    if (c0164i == null || d < f) {
                        f = d;
                        c0164i = c0164i2;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: d */
    public void m6758d(float f) {
        if (this.f665k == null || this.f665k.f763V) {
            m6750k();
        }
        if (this.f657c && this.f661g != null) {
            if (this.f659e && !this.f660f) {
                if (this.f661g.f1631cs / this.f661g.f1632ct < 0.5d) {
                    this.f660f = true;
                    if (this.f680z > 100.0f) {
                        this.f680z = 100.0f;
                    }
                }
                if (this.f677w == null) {
                    m6750k();
                }
            } else {
                if (this.f661g.f1631cs / this.f661g.f1632ct > 0.6d) {
                    this.f660f = false;
                }
                boolean z = false;
                if (this.f665k != null && !this.f665k.f707t) {
                    z = true;
                }
                if (!z) {
                    C0164i m6877a = this.f759R.m6877a(this.f661g.mo5645h(), this.f661g.f6951ek, this.f661g.f6952el, true);
                    if (m6877a != null) {
                        this.f665k = m6877a;
                    }
                    if (this.f665k != null) {
                        PointF w = this.f665k.m6665w();
                        this.f760S = w.x;
                        this.f761T = w.y;
                        if (this.f680z > 100.0f) {
                            this.f680z = 100.0f;
                        }
                        m6765a("moving to new base");
                    }
                }
            }
        }
        if (this.f665k != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f670p == 0.0f) {
                    Unit m6705g = this.f665k.m6705g();
                    if (m6705g == null) {
                        break;
                    } else if (m6769a(m6705g, false)) {
                        this.f677w = m6705g;
                        this.f670p = 500.0f;
                        this.f668n = 2000.0f;
                        if (!this.f660f) {
                            this.f760S = m6705g.f6951ek;
                            this.f761T = m6705g.f6952el;
                        }
                        if (this.f680z > 100.0f) {
                            this.f680z = 100.0f;
                        }
                        m6765a("defending base");
                    }
                }
            }
            if (this.f670p == 0.0f) {
                this.f660f = false;
                this.f677w = null;
            }
        }
    }

    /* renamed from: e */
    public void m6756e(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.f676v) {
            if (this.f666l == 0.0f) {
                this.f676v = true;
                this.f671q = true;
            }
        } else {
            if (this.f677w == null || !this.f677w.isActive() || this.f677w.isDead || !this.f672r) {
                this.f677w = this.f759R.m6851ao();
                if (this.f677w != null && !m6769a(this.f677w, true)) {
                    this.f677w = null;
                }
            }
            if (this.f677w != null) {
                if (this.f671q) {
                    this.f675u += f;
                    if (!this.f672r) {
                        this.f674t = CommonUtils.m2368a(this.f674t, f);
                        if (this.f674t == 0.0f) {
                            this.f674t = 20.0f;
                            m6753h();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.f686F.iterator();
                        while (it.hasNext()) {
                            if (m6669c((AbstractC0623y) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f671q = false;
                        }
                        Iterator it2 = this.f686F.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0623y) it2.next()).f1577br > gameEngine.f6096by - 1000) {
                                this.f671q = false;
                                m6765a("Not staging due to damage");
                            }
                        }
                    }
                    if (this.f675u > 17000.0f) {
                        this.f671q = false;
                        m6765a("attacking target");
                    }
                } else {
                    this.f669o += f;
                    if (this.f680z == 0.0f) {
                        this.f680z = 800.0f;
                        boolean z2 = false;
                        AbstractList c1101m = new C1101m();
                        Iterator it3 = this.f686F.iterator();
                        while (it3.hasNext()) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) it3.next();
                            boolean z3 = true;
                            if (this.f677w != null) {
                                if (!this.f759R.m6878a(abstractC0623y, this.f677w)) {
                                    z3 = false;
                                }
                                if (z3 && !C0248aq.m5741a(abstractC0623y, this.f677w)) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                z2 = true;
                                c1101m.add(abstractC0623y);
                            }
                        }
                        if (!z2) {
                            this.f671q = false;
                            m6765a("cannot reach main target");
                        } else {
                            C0749e m2594a = gameEngine.f6124cf.m2594a(this.f759R);
                            m2594a.m2488a(c1101m);
                            if (this.f677w != null && CommonUtils.m2360a(0, 100) < 80) {
                                m2594a.m2499a(this.f677w.f6951ek, this.f677w.f6952el, true);
                            } else {
                                m2594a.m2492a(this.f677w, true);
                            }
                            m6765a("attacking main target");
                        }
                    }
                }
            }
        }
        if (this.f676v) {
            if (this.f686F.size() == 0) {
                m6739p();
            }
            if (this.f669o > 1000.0f && this.f686F.size() < 3) {
                m6739p();
            }
            if (this.f669o > 11000.0f) {
                m6739p();
            }
        }
    }

    /* renamed from: h */
    public void m6753h() {
        float f = this.f677w.f6951ek;
        float f2 = this.f677w.f6952el;
        float m2280d = CommonUtils.m2280d(f, f2, this.f760S, this.f761T);
        float m2314b = CommonUtils.m2314b(f, f2, this.f760S, this.f761T);
        if (CommonUtils.m2360a(0, 100) < 80) {
            m2280d += CommonUtils.m2360a(-110, 110);
        }
        int i = (int) (m2314b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float m2360a = CommonUtils.m2360a(50, i);
        if (CommonUtils.m2360a(0, 100) < 80 && m2360a < 450.0f) {
            m2360a = CommonUtils.m2360a(450, i);
        }
        float m2249i = f + (CommonUtils.m2249i(m2280d) * m2360a);
        float sin = f2 + (CommonUtils.sin(m2280d) * m2360a);
        boolean z = true;
        if (!m6772a(m2249i, sin)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.mo5645h() == EnumC0246ao.f1703b) {
                z2 = true;
            }
            if (abstractC0623y.mo5645h() == EnumC0246ao.f1706e) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.f759R.f566aF == 0 && !m6762b(m2249i, sin)) {
                z = false;
            }
            if (!this.f759R.m6890a(m2249i, sin, this.f677w.f6951ek, this.f677w.f6952el, EnumC0246ao.f1703b) && CommonUtils.m2360a(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!m6762b(m2249i, sin)) {
                z = false;
            }
            if (!this.f759R.m6890a(m2249i, sin, this.f677w.f6951ek, this.f677w.f6952el, EnumC0246ao.f1706e)) {
                z = false;
            }
        }
        if (z) {
            this.f760S = m2249i;
            this.f761T = sin;
            this.f680z = 0.0f;
            this.f672r = true;
            this.f687G.clear();
            Iterator it2 = this.f686F.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                if (abstractC0623y2.mo5645h() != EnumC0246ao.f1706e && !this.f759R.m6880a(abstractC0623y2, this.f760S, this.f761T)) {
                    this.f687G.add(abstractC0623y2);
                }
            }
        }
    }

    /* renamed from: i */
    public EnumC0246ao m6752i() {
        return this.f685E;
    }

    /* renamed from: j */
    public EnumC0246ao m6751j() {
        if (this.f686F.size() == 0) {
            if (this.f682B) {
                return EnumC0246ao.f1706e;
            }
            return EnumC0246ao.f1703b;
        }
        boolean z = true;
        Iterator it = this.f686F.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AbstractC0623y) it.next()).mo5645h() != EnumC0246ao.f1705d) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            return EnumC0246ao.f1705d;
        }
        if (this.f682B) {
            boolean z2 = true;
            Iterator it2 = this.f686F.iterator();
            while (it2.hasNext()) {
                if (((AbstractC0623y) it2.next()).mo5645h() == EnumC0246ao.f1706e) {
                    z2 = false;
                }
            }
            if (z2) {
                return EnumC0246ao.f1707f;
            }
            return EnumC0246ao.f1706e;
        }
        boolean z3 = true;
        Iterator it3 = this.f686F.iterator();
        while (it3.hasNext()) {
            EnumC0246ao h = ((AbstractC0623y) it3.next()).mo5645h();
            if (h == EnumC0246ao.f1703b || h == EnumC0246ao.f1708g) {
                z3 = false;
            }
        }
        if (z3) {
            return EnumC0246ao.f1707f;
        }
        return EnumC0246ao.f1703b;
    }

    /* renamed from: a */
    public boolean m6772a(float f, float f2) {
        return !C1117y.m501a(f, f2, m6752i());
    }

    /* renamed from: b */
    public boolean m6762b(float f, float f2) {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            if (!this.f759R.m6880a((AbstractC0623y) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m6769a(Unit unit, boolean z) {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (z || this.f759R.m6880a(abstractC0623y, unit.f6951ek, unit.f6952el)) {
                if (C0248aq.m5741a(abstractC0623y, unit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m6750k() {
        PointF pointF = null;
        if (this.f657c && this.f661g != null) {
            this.f760S = this.f661g.f6951ek;
            this.f761T = this.f661g.f6952el;
            this.f665k = this.f759R.m6842c(this.f661g.f6951ek, this.f661g.f6952el);
            return;
        }
        if (1 != 0) {
            int i = 0;
            while (i < 7) {
                boolean z = i > 3;
                if (pointF == null) {
                    Iterator it = this.f759R.f599bm.iterator();
                    while (it.hasNext()) {
                        AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
                        if (abstractC0170o instanceof C0164i) {
                            C0164i c0164i = (C0164i) abstractC0170o;
                            if (c0164i.f689b == EnumC0165j.f732c && (c0164i.m6691u() > 2 || z)) {
                                if (pointF == null || CommonUtils.m2290c(this.f759R.f558ax + 2) == 0) {
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        if (pointF == null) {
                                            PointF w = c0164i.m6665w();
                                            if (m6772a(w.x, w.y)) {
                                                pointF = w;
                                            }
                                        }
                                    }
                                    this.f665k = c0164i;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        if (pointF == null) {
            pointF = this.f759R.m6857ai();
            this.f665k = null;
        }
        this.f760S = pointF.x;
        this.f761T = pointF.y;
    }
}
