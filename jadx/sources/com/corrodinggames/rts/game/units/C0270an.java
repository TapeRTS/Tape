package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0536ab;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.game.units.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/an.class */
public final class C0270an {

    /* renamed from: a */
    EnumC0271ao f1645a;

    /* renamed from: b */
    AbstractC0268al f1646b;

    /* renamed from: c */
    C0181c f1647c;

    /* renamed from: d */
    int f1648d;

    /* renamed from: h */
    AbstractC0210af f1652h;

    /* renamed from: i */
    public C0536ab f1653i;

    /* renamed from: j */
    public boolean f1654j;

    /* renamed from: m */
    public boolean f1657m;

    /* renamed from: n */
    public boolean f1658n;

    /* renamed from: e */
    float f1649e = 1.0f;

    /* renamed from: f */
    float f1650f = 1.0f;

    /* renamed from: g */
    long f1651g = -1;

    /* renamed from: k */
    public float f1655k = -1.0f;

    /* renamed from: l */
    public float f1656l = -1.0f;

    /* renamed from: a */
    public boolean m3254a(C0270an anVar) {
        if (C0654f.m1459c(this.f1649e - anVar.f1649e) > 3.0f || C0654f.m1459c(this.f1650f - anVar.f1650f) > 3.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m3248b(C0270an anVar) {
        if (anVar != null && this.f1645a == anVar.f1645a && this.f1646b == anVar.f1646b && C0654f.m1459c(this.f1649e - anVar.f1649e) <= 1.0f && C0654f.m1459c(this.f1650f - anVar.f1650f) <= 1.0f && this.f1648d == anVar.f1648d && this.f1652h == anVar.f1652h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0268al m3258a() {
        return this.f1646b;
    }

    /* renamed from: b */
    public int m3251b() {
        return this.f1648d;
    }

    /* renamed from: a */
    public void m3253a(C0690ap apVar) {
        apVar.mo1138a(this.f1645a);
        apVar.mo1145a(this.f1646b);
        apVar.mo1096a(this.f1649e);
        apVar.mo1096a(this.f1650f);
        if (this.f1651g != -1) {
            apVar.mo1148a(this.f1651g);
        } else {
            apVar.mo1094a(this.f1652h);
        }
        apVar.mo1130c(this.f1648d);
        apVar.mo1096a(this.f1655k);
        apVar.mo1096a(this.f1656l);
        apVar.mo1090a(this.f1657m);
        apVar.mo1090a(this.f1654j);
        apVar.mo1090a(this.f1658n);
        C0181c.m3414a(apVar, this.f1647c);
    }

    /* renamed from: a */
    public void m3252a(C0707k kVar) {
        this.f1645a = (EnumC0271ao) kVar.m1069b(EnumC0271ao.class);
        this.f1646b = kVar.m1052p();
        this.f1649e = kVar.m1061g();
        this.f1650f = kVar.m1061g();
        this.f1651g = kVar.m1055m();
        this.f1652h = null;
        if (kVar.m1071b() >= 40) {
            this.f1648d = kVar.m1065d();
        }
        if (kVar.m1071b() >= 46) {
            this.f1655k = kVar.m1061g();
            this.f1656l = kVar.m1061g();
        }
        if (kVar.m1071b() >= 58) {
            this.f1657m = kVar.m1063e();
        }
        if (kVar.m1071b() >= 65) {
            this.f1654j = kVar.m1063e();
        }
        if (kVar.m1071b() >= 79) {
            this.f1658n = kVar.m1063e();
        }
        if (kVar.m1071b() >= 82) {
            this.f1647c = C0181c.m3413a(kVar);
        }
    }

    /* renamed from: c */
    public void m3247c() {
        if (this.f1651g != -1) {
            this.f1652h = AbstractC0854w.m401a(this.f1651g, true);
            if (this.f1652h == null) {
                AbstractC0789l.m682b("convertUnitIds failed");
                if (this.f1645a != null) {
                    AbstractC0789l.m682b("convertUnitIds: type:" + this.f1645a.toString());
                }
                if (this.f1646b != null) {
                    AbstractC0789l.m682b("convertUnitIds: build:" + this.f1646b.toString());
                }
                AbstractC0789l.m682b("convertUnitIds: x:" + this.f1649e + ", y:" + this.f1650f);
            }
            this.f1651g = -1L;
        }
    }

    /* renamed from: d */
    public EnumC0271ao m3243d() {
        return this.f1645a;
    }

    /* renamed from: e */
    public void m3241e() {
        this.f1645a = EnumC0271ao.move;
        this.f1646b = null;
        this.f1648d = 1;
        this.f1649e = 2.0f;
        this.f1650f = 2.0f;
        this.f1651g = -1L;
        this.f1652h = null;
        this.f1653i = null;
        this.f1655k = -1.0f;
        this.f1656l = -1.0f;
        this.f1657m = false;
        this.f1654j = false;
        this.f1658n = false;
        this.f1647c = null;
    }

    /* renamed from: f */
    public boolean m3239f() {
        return this.f1645a == EnumC0271ao.attack || this.f1645a == EnumC0271ao.repair || this.f1645a == EnumC0271ao.reclaim || this.f1645a == EnumC0271ao.loadInto || this.f1645a == EnumC0271ao.loadUp || this.f1645a == EnumC0271ao.guard || this.f1645a == EnumC0271ao.touchTarget || this.f1645a == EnumC0271ao.follow;
    }

    /* renamed from: g */
    public float m3237g() {
        if (!m3239f() || this.f1652h == null) {
            return this.f1649e;
        }
        return this.f1652h.f5842dH;
    }

    /* renamed from: h */
    public float m3235h() {
        if (!m3239f() || this.f1652h == null) {
            return this.f1650f;
        }
        return this.f1652h.f5843dI;
    }

    /* renamed from: i */
    public AbstractC0210af m3233i() {
        return this.f1652h;
    }

    /* renamed from: a */
    public void m3257a(float f, float f2) {
        m3241e();
        this.f1645a = EnumC0271ao.move;
        this.f1649e = f;
        this.f1650f = f2;
    }

    /* renamed from: b */
    public void m3250b(float f, float f2) {
        m3241e();
        this.f1645a = EnumC0271ao.attackMove;
        this.f1649e = f;
        this.f1650f = f2;
    }

    /* renamed from: a */
    public void m3255a(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.attack;
        this.f1652h = afVar;
    }

    /* renamed from: a */
    public void m3256a(float f, float f2, AbstractC0268al alVar, int i) {
        m3241e();
        this.f1645a = EnumC0271ao.build;
        this.f1649e = f;
        this.f1650f = f2;
        this.f1646b = alVar;
        this.f1648d = (byte) i;
    }

    /* renamed from: b */
    public void m3249b(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.repair;
        this.f1652h = afVar;
    }

    /* renamed from: c */
    public void m3245c(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.guard;
        this.f1652h = afVar;
    }

    /* renamed from: d */
    public void m3242d(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.touchTarget;
        this.f1652h = afVar;
    }

    /* renamed from: e */
    public void m3240e(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.follow;
        this.f1652h = afVar;
    }

    /* renamed from: c */
    public void m3246c(float f, float f2) {
        m3241e();
        this.f1645a = EnumC0271ao.patrol;
        this.f1649e = f;
        this.f1650f = f2;
    }

    /* renamed from: f */
    public void m3238f(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.reclaim;
        this.f1652h = afVar;
    }

    /* renamed from: g */
    public void m3236g(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.loadInto;
        this.f1652h = afVar;
    }

    /* renamed from: h */
    public void m3234h(AbstractC0210af afVar) {
        m3241e();
        this.f1645a = EnumC0271ao.loadUp;
        this.f1652h = afVar;
    }

    /* renamed from: c */
    public void m3244c(C0270an anVar) {
        m3241e();
        this.f1645a = anVar.f1645a;
        this.f1646b = anVar.f1646b;
        this.f1649e = anVar.f1649e;
        this.f1650f = anVar.f1650f;
        this.f1652h = anVar.f1652h;
        this.f1653i = anVar.f1653i;
        this.f1648d = anVar.f1648d;
        this.f1654j = anVar.f1654j;
        this.f1647c = anVar.f1647c;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* renamed from: j */
    public long m3232j() {
        char c = 0;
        if (this.f1645a != null) {
            c = 0 + this.f1645a.ordinal();
        }
        return c;
    }

    /* renamed from: k */
    public void m3231k() {
        if (this.f1652h != null) {
            this.f1651g = this.f1652h.f5835dA;
            this.f1652h = null;
        }
        this.f1653i = null;
    }
}
