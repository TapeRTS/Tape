package com.corrodinggames.rts.gameFramework.p035d;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public class C0746f extends AbstractC1120w {

    /* renamed from: a */
    public float f4789a;

    /* renamed from: c */
    float f4790c;

    /* renamed from: d */
    float f4791d;

    /* renamed from: e */
    float f4792e;

    /* renamed from: f */
    float f4793f;

    /* renamed from: g */
    float f4794g;

    /* renamed from: h */
    float f4795h;

    /* renamed from: i */
    C0745e f4796i;

    /* renamed from: m */
    float f4797m;

    /* renamed from: n */
    float f4798n;

    /* renamed from: o */
    float f4799o;

    /* renamed from: p */
    float f4800p;

    /* renamed from: q */
    float f4801q;

    /* renamed from: r */
    float f4802r;

    /* renamed from: s */
    EnumC0748h f4803s;

    /* renamed from: t */
    public float f4804t;

    /* renamed from: v */
    static C0745e f4805v;

    /* renamed from: w */
    static C0745e f4806w;

    /* renamed from: x */
    private final C0743c f4807x;

    /* renamed from: b */
    public boolean f4808b = true;

    /* renamed from: j */
    public int f4809j = 0;

    /* renamed from: k */
    public int f4810k = 0;

    /* renamed from: l */
    public int f4811l = -1;

    /* renamed from: u */
    public boolean f4812u = false;

    /* renamed from: b */
    public static void m2513b() {
        C0743c c0743c = GameEngine.getInstance().effects;
        C0745e c0745e = new C0745e(c0743c);
        m2516a(c0745e, false);
        c0745e.f4763aq = 18;
        c0745e.f4722u = 15.0f;
        f4805v = c0745e;
        C0745e c0745e2 = new C0745e(c0743c);
        m2511b(c0745e2, false);
        f4806w = c0745e2;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f6951ek);
        c0859ar.mo1488a(this.f6952el);
        c0859ar.mo1488a(this.f4789a);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f6951ek = c0876k.m1453g();
        this.f6952el = c0876k.m1453g();
        this.f4789a = c0876k.m1453g();
        this.f4808b = false;
        super.mo2877a(c0876k);
    }

    public C0746f(C0743c c0743c) {
        this.f4807x = c0743c;
    }

    /* renamed from: a */
    public static void m2516a(C0745e c0745e, boolean z) {
        c0745e.m2521c();
        c0745e.f4763aq = 5;
        if (z) {
            c0745e.f4762ap = CommonUtils.m2360a(0, 1);
        } else {
            c0745e.f4762ap = 0;
        }
        c0745e.f4747Y = 0.0f;
        c0745e.f4784an = true;
        c0745e.f4739Q = 0.1f;
        c0745e.f4741S = 0.5f;
        c0745e.f4723v = true;
        c0745e.f4745W = 300.0f;
        c0745e.f4746X = c0745e.f4745W;
        c0745e.f4720s = true;
        c0745e.f4721t = true;
        c0745e.f4722u = 40.0f;
        c0745e.f4787as = false;
        c0745e.f4786ar = (short) 2;
        c0745e.f4730H = 0.4f;
        c0745e.f4729G = 1.5f;
        c0745e.f4716g = C0745e.f4770k;
    }

    /* renamed from: b */
    public static void m2511b(C0745e c0745e, boolean z) {
        c0745e.m2521c();
        c0745e.f4763aq = 7;
        if (z) {
            c0745e.f4762ap = CommonUtils.m2360a(0, 3);
        } else {
            c0745e.f4762ap = 0;
        }
        c0745e.f4747Y = 0.0f;
        c0745e.f4784an = true;
        c0745e.f4739Q = 0.0f;
        c0745e.f4741S = 0.2f;
        c0745e.f4723v = true;
        c0745e.f4745W = 50.0f;
        c0745e.f4746X = c0745e.f4745W;
        c0745e.f4720s = true;
        c0745e.f4721t = true;
        c0745e.f4722u = 10.0f;
        c0745e.f4787as = false;
        c0745e.f4786ar = (short) 2;
        c0745e.f4716g = C0745e.f4773n;
    }

    /* renamed from: a */
    public static C0746f m2519a(float f, float f2) {
        C0746f m2518a = m2518a(f, f2, f4805v);
        m2518a.f4789a = 280.0f;
        m2518a.f4793f = 10.0f;
        m2518a.f4790c = 10.0f;
        m2518a.f4797m = 0.03f;
        m2518a.f4798n = 0.03f;
        m2518a.f4800p = 6.0f;
        m2518a.f4801q = 6.0f;
        m2518a.f4803s = EnumC0748h.f4826a;
        m2518a.f4802r = 180.0f;
        m2518a.f4809j = -16777216;
        return m2518a;
    }

    /* renamed from: b */
    public static C0746f m2512b(float f, float f2) {
        C0746f m2518a = m2518a(f, f2, f4806w);
        m2518a.f4789a = 330.0f;
        m2518a.f4793f = 10.0f;
        m2518a.f4790c = 10.0f;
        m2518a.f4797m = 0.1f;
        m2518a.f4798n = 0.03f;
        m2518a.f4800p = 4.0f;
        m2518a.f4801q = 4.0f;
        m2518a.f4803s = EnumC0748h.f4826a;
        return m2518a;
    }

    /* renamed from: a */
    public static C0746f m2518a(float f, float f2, C0745e c0745e) {
        C0743c c0743c = GameEngine.getInstance().effects;
        C0746f c0746f = new C0746f(c0743c);
        c0746f.f6951ek = f;
        c0746f.f6952el = f2;
        c0746f.f4789a = 100.0f;
        c0746f.f4793f = 10.0f;
        c0746f.f4796i = c0745e;
        if (c0745e == null) {
            c0746f.f4796i = new C0745e(c0743c);
            GameEngine.m1145b("Error: Emitter create srcEffect==null");
        }
        return c0746f;
    }

    /* renamed from: c */
    public boolean m2510c() {
        return GameEngine.getInstance().f6246cO.m7189b(this.f6951ek, this.f6952el);
    }

    /* renamed from: a */
    public void m2520a(float f) {
        C0745e m2537b;
        this.f4804t = CommonUtils.m2368a(this.f4804t, f);
        if (this.f4804t > 0.0f) {
            return;
        }
        if (this.f4808b) {
            this.f4790c += f;
            if (this.f4790c > this.f4793f) {
                this.f4791d += f;
                if (this.f4791d > this.f4794g) {
                    this.f4791d = 0.0f;
                    this.f4792e += 1.0f;
                    if (this.f4792e > this.f4795h) {
                        this.f4790c = 0.0f;
                        this.f4792e = 0.0f;
                    }
                    if ((this.f4812u || m2510c()) && (m2537b = this.f4807x.m2537b(this.f6951ek, this.f6952el, 0.0f, EnumC0744d.f4702a, false, this.f4803s)) != null) {
                        m2537b.m2525a(this.f4796i);
                        m2537b.f4739Q += CommonUtils.rnd(-this.f4797m, this.f4797m);
                        m2537b.f4740R += CommonUtils.rnd(-this.f4798n, this.f4798n);
                        m2537b.f4741S += CommonUtils.rnd(-this.f4799o, this.f4799o);
                        m2537b.f4747Y = CommonUtils.rnd(-this.f4802r, this.f4802r);
                        m2537b.f4732J = this.f6951ek;
                        m2537b.f4733K = this.f6952el;
                        m2537b.f4732J += CommonUtils.rnd(-this.f4800p, this.f4800p);
                        m2537b.f4733K += CommonUtils.rnd(-this.f4801q, this.f4801q);
                        if (this.f4809j != 0) {
                            m2537b.f4725y = this.f4809j;
                        }
                        if (this.f4811l >= 0) {
                            m2537b.f4726z = this.f4810k;
                            m2537b.f4782A = this.f4811l;
                        }
                    }
                }
            }
        }
        this.f4789a -= f;
        if (this.f4789a < 0.0f) {
            mo2880a();
        }
    }

    /* renamed from: a */
    public boolean m2514a(GameEngine gameEngine) {
        return false;
    }

    /* renamed from: c */
    public boolean m2509c(float f) {
        return false;
    }

    /* renamed from: e */
    public void m2507e(float f) {
    }

    /* renamed from: a */
    public void m2517a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m2508d(float f) {
    }

    /* renamed from: f */
    public boolean m2506f(float f) {
        return false;
    }
}
