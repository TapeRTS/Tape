package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/j.class */
public abstract class AbstractC0773j {

    /* renamed from: g */
    float f5023g;

    /* renamed from: h */
    float f5024h;

    /* renamed from: k */
    float f5025k;

    /* renamed from: l */
    float f5026l;

    /* renamed from: m */
    float f5027m;

    /* renamed from: n */
    float f5028n;

    /* renamed from: o */
    float f5029o;

    /* renamed from: p */
    float f5030p;

    /* renamed from: q */
    float f5031q;

    /* renamed from: r */
    float f5032r;

    /* renamed from: u */
    boolean f5033u;

    /* renamed from: v */
    AbstractC0773j f5034v;

    /* renamed from: y */
    float f5035y;

    /* renamed from: z */
    float f5036z;

    /* renamed from: B */
    AbstractC0772i f5037B;

    /* renamed from: e */
    static final PointF f5038e = new PointF();

    /* renamed from: f */
    static final RectF f5039f = new RectF();

    /* renamed from: A */
    static final PointF f5040A = new PointF();

    /* renamed from: i */
    float f5041i = 50.0f;

    /* renamed from: j */
    float f5042j = 50.0f;

    /* renamed from: s */
    boolean f5043s = false;

    /* renamed from: t */
    boolean f5044t = false;

    /* renamed from: w */
    C1101m f5045w = new C1101m();

    /* renamed from: x */
    EnumC0774k f5046x = EnumC0774k.vertical;

    /* renamed from: a */
    public String m2157a() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    public InterfaceC1027y m2141d() {
        return GameEngine.getInstance().graphics;
    }

    /* renamed from: a */
    public RectF m2153a(RectF rectF, float f, float f2) {
        rectF.f234a = 0.0f + f;
        rectF.f235b = 0.0f + f2;
        rectF.f236c = 0.0f + this.f5041i + f;
        rectF.f237d = 0.0f + this.f5042j + f2;
        return rectF;
    }

    /* renamed from: a */
    public RectF m2154a(RectF rectF) {
        f5040A.x = this.f5023g;
        f5040A.y = this.f5024h;
        if (this.f5034v != null) {
            this.f5034v.m2155a(f5040A);
        }
        rectF.f234a = 0.0f + f5040A.x;
        rectF.f235b = 0.0f + f5040A.y;
        rectF.f236c = 0.0f + this.f5041i + f5040A.x;
        rectF.f237d = 0.0f + this.f5042j + f5040A.y;
        return rectF;
    }

    /* renamed from: b */
    public void mo2168b() {
        Iterator it = this.f5045w.iterator();
        while (it.hasNext()) {
            ((AbstractC0773j) it.next()).mo2168b();
        }
        this.f5035y = 0.0f;
        this.f5036z = 0.0f;
        if (this.f5046x != EnumC0774k.none) {
            if (this.f5046x == EnumC0774k.vertical) {
                float f = 0.0f;
                float f2 = 0.0f;
                Iterator it2 = this.f5045w.iterator();
                while (it2.hasNext()) {
                    AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
                    if (abstractC0773j.f5041i > f) {
                        f = abstractC0773j.m2135g();
                    }
                    f2 += abstractC0773j.m2134h();
                }
                this.f5035y = f2;
                this.f5036z = f;
                m2146b(this.f5036z * 0.5f, this.f5035y * 0.5f, this.f5045w);
            } else if (this.f5046x == EnumC0774k.horizontal) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                Iterator it3 = this.f5045w.iterator();
                while (it3.hasNext()) {
                    AbstractC0773j abstractC0773j2 = (AbstractC0773j) it3.next();
                    if (abstractC0773j2.f5042j > f3) {
                        f3 = abstractC0773j2.m2134h();
                    }
                    f4 += abstractC0773j2.m2135g();
                }
                this.f5035y = f3;
                this.f5036z = f4;
                m2156a(this.f5036z * 0.5f, this.f5035y * 0.5f, this.f5045w);
            } else {
                throw new RuntimeException("Unknown layout style:" + this.f5046x);
            }
        }
        this.f5043s = false;
    }

    /* renamed from: a */
    public static void m2156a(float f, float f2, C1101m c1101m) {
        float f3 = 0.0f;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0773j) it.next()).m2135g();
        }
        float f4 = f - (f3 * 0.5f);
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
            float f5 = f4 + abstractC0773j.f5031q;
            abstractC0773j.f5023g = f5;
            f4 = f5 + abstractC0773j.f5041i + abstractC0773j.f5032r;
            abstractC0773j.m2140d(f2);
        }
    }

    /* renamed from: b */
    public static void m2146b(float f, float f2, C1101m c1101m) {
        float f3 = 0.0f;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0773j) it.next()).m2134h();
        }
        float f4 = f2 - (f3 * 0.5f);
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
            float f5 = f4 + abstractC0773j.f5029o;
            abstractC0773j.f5024h = f5;
            f4 = f5 + abstractC0773j.f5042j + abstractC0773j.f5030p;
            abstractC0773j.m2143c(f);
        }
    }

    /* renamed from: a */
    public void m2155a(PointF pointF) {
        if (this.f5034v != null) {
            this.f5034v.m2155a(pointF);
        }
        pointF.x += this.f5023g;
        pointF.y += this.f5024h;
    }

    /* renamed from: a */
    public void m2150a(AbstractC0773j abstractC0773j) {
        abstractC0773j.m2144b(this);
    }

    /* renamed from: b */
    public void m2144b(AbstractC0773j abstractC0773j) {
        m2149a(abstractC0773j, false);
    }

    /* renamed from: a */
    public void m2149a(AbstractC0773j abstractC0773j, boolean z) {
        if (this.f5034v == abstractC0773j) {
            return;
        }
        if (this.f5034v != null) {
            this.f5034v.f5045w.remove(this);
        }
        this.f5034v = abstractC0773j;
        if (abstractC0773j != null) {
            if (!z) {
                abstractC0773j.f5045w.add(this);
            } else {
                abstractC0773j.f5045w.add(0, this);
            }
        }
        m2139e();
    }

    /* renamed from: e */
    public void m2139e() {
        this.f5043s = true;
        if (this.f5034v != null) {
            this.f5034v.m2139e();
        }
    }

    /* renamed from: b */
    public void m2147b(float f) {
        if (this.f5045w.size() > 0) {
            Iterator it = this.f5045w.iterator();
            while (it.hasNext()) {
                ((AbstractC0773j) it.next()).m2147b(f);
            }
        }
    }

    /* renamed from: f */
    public void m2137f() {
        f5040A.x = this.f5023g;
        f5040A.y = this.f5024h;
        if (this.f5034v != null) {
            this.f5034v.m2155a(f5040A);
        }
        mo2132a(f5040A.x, f5040A.y);
        if (this.f5045w.size() > 0) {
            Iterator it = this.f5045w.iterator();
            while (it.hasNext()) {
                ((AbstractC0773j) it.next()).m2137f();
            }
        }
    }

    /* renamed from: a */
    public void mo2132a(float f, float f2) {
        if (this.f5044t) {
            C0770g.f5014d.m2166a(m2141d(), m2153a(new RectF(), f, f2));
        }
    }

    /* renamed from: a */
    public void m2151a(AbstractC0772i abstractC0772i) {
        this.f5037B = abstractC0772i;
    }

    /* renamed from: a */
    public boolean m2152a(C0765c c0765c) {
        if (c0765c.m2177a() && m2142c(c0765c)) {
            GameEngine.PrintLog("UI click " + m2157a());
            if (this.f5037B != null) {
                return this.f5037B.mo2158a(c0765c);
            }
            return false;
        } else if (c0765c.m2175b()) {
            if (m2142c(c0765c)) {
                this.f5033u = true;
                return false;
            }
            this.f5033u = false;
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m2145b(C0765c c0765c) {
        if (this.f5045w.size() > 0) {
            Iterator it = this.f5045w.iterator();
            while (it.hasNext()) {
                if (((AbstractC0773j) it.next()).m2145b(c0765c)) {
                    return true;
                }
            }
        }
        if (m2152a(c0765c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m2142c(C0765c c0765c) {
        m2154a(f5039f);
        return f5039f.m7189b(c0765c.f5000a, c0765c.f5001b);
    }

    /* renamed from: c */
    public void m2143c(float f) {
        this.f5023g = f - (this.f5041i * 0.5f);
    }

    /* renamed from: d */
    public void m2140d(float f) {
        this.f5024h = f - (this.f5042j * 0.5f);
    }

    /* renamed from: e */
    public void m2138e(float f) {
        this.f5029o = f;
        this.f5030p = f;
        this.f5031q = f;
        this.f5032r = f;
    }

    /* renamed from: f */
    public void m2136f(float f) {
        this.f5025k = f;
        this.f5026l = f;
        this.f5027m = f;
        this.f5028n = f;
    }

    /* renamed from: g */
    public float m2135g() {
        return this.f5031q + this.f5041i + this.f5032r;
    }

    /* renamed from: h */
    public float m2134h() {
        return this.f5029o + this.f5042j + this.f5030p;
    }

    /* renamed from: i */
    public void m2133i() {
        m2144b((AbstractC0773j) null);
    }
}
