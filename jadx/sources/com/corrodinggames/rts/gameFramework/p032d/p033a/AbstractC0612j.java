package com.corrodinggames.rts.gameFramework.p032d.p033a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a/j.class */
public abstract class AbstractC0612j {

    /* renamed from: g */
    float f4227g;

    /* renamed from: h */
    float f4228h;

    /* renamed from: k */
    float f4231k;

    /* renamed from: l */
    float f4232l;

    /* renamed from: m */
    float f4233m;

    /* renamed from: n */
    float f4234n;

    /* renamed from: o */
    float f4235o;

    /* renamed from: p */
    float f4236p;

    /* renamed from: q */
    float f4237q;

    /* renamed from: r */
    float f4238r;

    /* renamed from: u */
    boolean f4241u;

    /* renamed from: v */
    AbstractC0612j f4242v;

    /* renamed from: y */
    float f4245y;

    /* renamed from: z */
    float f4246z;

    /* renamed from: B */
    AbstractC0611i f4248B;

    /* renamed from: e */
    static final PointF f4225e = new PointF();

    /* renamed from: f */
    static final RectF f4226f = new RectF();

    /* renamed from: A */
    static final PointF f4247A = new PointF();

    /* renamed from: i */
    float f4229i = 50.0f;

    /* renamed from: j */
    float f4230j = 50.0f;

    /* renamed from: s */
    boolean f4239s = false;

    /* renamed from: t */
    boolean f4240t = false;

    /* renamed from: w */
    C0835m f4243w = new C0835m();

    /* renamed from: x */
    EnumC0613k f4244x = EnumC0613k.vertical;

    /* renamed from: a */
    public String mo1800a() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    public AbstractC0755l m1784d() {
        return AbstractC0789l.m638u().f5514bw;
    }

    /* renamed from: a */
    public RectF m1796a(RectF rectF, float f, float f2) {
        rectF.f231a = 0.0f + f;
        rectF.f232b = 0.0f + f2;
        rectF.f233c = 0.0f + this.f4229i + f;
        rectF.f234d = 0.0f + this.f4230j + f2;
        return rectF;
    }

    /* renamed from: a */
    public RectF m1797a(RectF rectF) {
        f4247A.f224a = this.f4227g;
        f4247A.f225b = this.f4228h;
        if (this.f4242v != null) {
            this.f4242v.m1798a(f4247A);
        }
        rectF.f231a = 0.0f + f4247A.f224a;
        rectF.f232b = 0.0f + f4247A.f225b;
        rectF.f233c = 0.0f + this.f4229i + f4247A.f224a;
        rectF.f234d = 0.0f + this.f4230j + f4247A.f225b;
        return rectF;
    }

    /* renamed from: b */
    public void mo1791b() {
        Iterator it = this.f4243w.iterator();
        while (it.hasNext()) {
            ((AbstractC0612j) it.next()).mo1791b();
        }
        this.f4245y = 0.0f;
        this.f4246z = 0.0f;
        if (this.f4244x != EnumC0613k.none) {
            if (this.f4244x == EnumC0613k.vertical) {
                float f = 0.0f;
                float f2 = 0.0f;
                Iterator it2 = this.f4243w.iterator();
                while (it2.hasNext()) {
                    AbstractC0612j jVar = (AbstractC0612j) it2.next();
                    if (jVar.f4229i > f) {
                        f = jVar.m1778g();
                    }
                    f2 += jVar.m1777h();
                }
                this.f4245y = f2;
                this.f4246z = f;
                m1789b(this.f4246z * 0.5f, this.f4245y * 0.5f, this.f4243w);
            } else if (this.f4244x == EnumC0613k.horizontal) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                Iterator it3 = this.f4243w.iterator();
                while (it3.hasNext()) {
                    AbstractC0612j jVar2 = (AbstractC0612j) it3.next();
                    if (jVar2.f4230j > f3) {
                        f3 = jVar2.m1777h();
                    }
                    f4 += jVar2.m1778g();
                }
                this.f4245y = f3;
                this.f4246z = f4;
                m1799a(this.f4246z * 0.5f, this.f4245y * 0.5f, this.f4243w);
            } else {
                throw new RuntimeException("Unknown layout style:" + this.f4244x);
            }
        }
        this.f4239s = false;
    }

    /* renamed from: a */
    public static void m1799a(float f, float f2, C0835m mVar) {
        float f3 = 0.0f;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0612j) it.next()).m1778g();
        }
        float f4 = f - (f3 * 0.5f);
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            AbstractC0612j jVar = (AbstractC0612j) it2.next();
            float f5 = f4 + jVar.f4237q;
            jVar.f4227g = f5;
            f4 = f5 + jVar.f4229i + jVar.f4238r;
            jVar.m1783d(f2);
        }
    }

    /* renamed from: b */
    public static void m1789b(float f, float f2, C0835m mVar) {
        float f3 = 0.0f;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0612j) it.next()).m1777h();
        }
        float f4 = f2 - (f3 * 0.5f);
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            AbstractC0612j jVar = (AbstractC0612j) it2.next();
            float f5 = f4 + jVar.f4235o;
            jVar.f4228h = f5;
            f4 = f5 + jVar.f4230j + jVar.f4236p;
            jVar.m1786c(f);
        }
    }

    /* renamed from: a */
    public void m1798a(PointF pointF) {
        if (this.f4242v != null) {
            this.f4242v.m1798a(pointF);
        }
        pointF.f224a += this.f4227g;
        pointF.f225b += this.f4228h;
    }

    /* renamed from: a */
    public void m1793a(AbstractC0612j jVar) {
        jVar.m1787b(this);
    }

    /* renamed from: b */
    public void m1787b(AbstractC0612j jVar) {
        m1792a(jVar, false);
    }

    /* renamed from: a */
    public void m1792a(AbstractC0612j jVar, boolean z) {
        if (this.f4242v != jVar) {
            if (this.f4242v != null) {
                this.f4242v.f4243w.remove(this);
            }
            this.f4242v = jVar;
            if (jVar != null) {
                if (!z) {
                    jVar.f4243w.add(this);
                } else {
                    jVar.f4243w.add(0, this);
                }
            }
            m1782e();
        }
    }

    /* renamed from: e */
    public void m1782e() {
        this.f4239s = true;
        if (this.f4242v != null) {
            this.f4242v.m1782e();
        }
    }

    /* renamed from: b */
    public void m1790b(float f) {
        if (this.f4243w.size() > 0) {
            Iterator it = this.f4243w.iterator();
            while (it.hasNext()) {
                ((AbstractC0612j) it.next()).m1790b(f);
            }
        }
    }

    /* renamed from: f */
    public void m1780f() {
        f4247A.f224a = this.f4227g;
        f4247A.f225b = this.f4228h;
        if (this.f4242v != null) {
            this.f4242v.m1798a(f4247A);
        }
        mo1775a(f4247A.f224a, f4247A.f225b);
        if (this.f4243w.size() > 0) {
            Iterator it = this.f4243w.iterator();
            while (it.hasNext()) {
                ((AbstractC0612j) it.next()).m1780f();
            }
        }
    }

    /* renamed from: a */
    public void mo1775a(float f, float f2) {
        if (this.f4240t) {
            C0609g.f4216d.m1806a(m1784d(), m1796a(new RectF(), f, f2));
        }
    }

    /* renamed from: a */
    public void m1794a(AbstractC0611i iVar) {
        this.f4248B = iVar;
    }

    /* renamed from: a */
    public boolean m1795a(C0604c cVar) {
        if (cVar.m1816a() && m1785c(cVar)) {
            AbstractC0789l.m670d("UI click " + mo1800a());
            if (this.f4248B != null) {
                return this.f4248B.mo1180a(cVar);
            }
            return false;
        } else if (!cVar.m1814b()) {
            return false;
        } else {
            if (m1785c(cVar)) {
                this.f4241u = true;
                return false;
            }
            this.f4241u = false;
            return false;
        }
    }

    /* renamed from: b */
    public boolean m1788b(C0604c cVar) {
        if (this.f4243w.size() > 0) {
            Iterator it = this.f4243w.iterator();
            while (it.hasNext()) {
                if (((AbstractC0612j) it.next()).m1788b(cVar)) {
                    return true;
                }
            }
        }
        if (m1795a(cVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1785c(C0604c cVar) {
        m1797a(f4226f);
        return f4226f.m4116b(cVar.f4202a, cVar.f4203b);
    }

    /* renamed from: c */
    public void m1786c(float f) {
        this.f4227g = f - (this.f4229i * 0.5f);
    }

    /* renamed from: d */
    public void m1783d(float f) {
        this.f4228h = f - (this.f4230j * 0.5f);
    }

    /* renamed from: e */
    public void m1781e(float f) {
        this.f4235o = f;
        this.f4236p = f;
        this.f4237q = f;
        this.f4238r = f;
    }

    /* renamed from: f */
    public void m1779f(float f) {
        this.f4231k = f;
        this.f4232l = f;
        this.f4233m = f;
        this.f4234n = f;
    }

    /* renamed from: g */
    public float m1778g() {
        return this.f4237q + this.f4229i + this.f4238r;
    }

    /* renamed from: h */
    public float m1777h() {
        return this.f4235o + this.f4230j + this.f4236p;
    }

    /* renamed from: i */
    public void m1776i() {
        m1787b((AbstractC0612j) null);
    }
}
