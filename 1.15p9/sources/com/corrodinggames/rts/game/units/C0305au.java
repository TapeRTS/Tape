package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/au.class */
public final class C0305au {

    /* renamed from: a */
    EnumC0306av f1796a;

    /* renamed from: b */
    InterfaceC0303as f1797b;

    /* renamed from: c */
    C0208c f1798c;

    /* renamed from: d */
    int f1799d;

    /* renamed from: h */
    Unit f1800h;

    /* renamed from: i */
    public C0637ab f1801i;

    /* renamed from: j */
    public boolean f1802j;

    /* renamed from: m */
    public boolean f1803m;

    /* renamed from: n */
    public boolean f1804n;

    /* renamed from: e */
    float f1805e = 1.0f;

    /* renamed from: f */
    float f1806f = 1.0f;

    /* renamed from: g */
    long f1807g = -1;

    /* renamed from: k */
    public float f1808k = -1.0f;

    /* renamed from: l */
    public float f1809l = -1.0f;

    /* renamed from: a */
    public boolean m5687a(C0305au c0305au) {
        if (CommonUtils.m2294c(this.f1805e - c0305au.f1805e) > 3.0f || CommonUtils.m2294c(this.f1806f - c0305au.f1806f) > 3.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m5681b(C0305au c0305au) {
        if (c0305au == null || this.f1796a != c0305au.f1796a || this.f1797b != c0305au.f1797b || CommonUtils.m2294c(this.f1805e - c0305au.f1805e) > 1.0f || CommonUtils.m2294c(this.f1806f - c0305au.f1806f) > 1.0f || this.f1799d != c0305au.f1799d || this.f1800h != c0305au.f1800h) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public InterfaceC0303as m5691a() {
        return this.f1797b;
    }

    /* renamed from: b */
    public int m5684b() {
        return this.f1799d;
    }

    /* renamed from: a */
    public void m5686a(C0859ar c0859ar) {
        c0859ar.m1564a(this.f1796a);
        c0859ar.m1574a(this.f1797b);
        c0859ar.mo1488a(this.f1805e);
        c0859ar.mo1488a(this.f1806f);
        if (this.f1807g != -1) {
            c0859ar.m1577a(this.f1807g);
        } else {
            c0859ar.mo1486a(this.f1800h);
        }
        c0859ar.m1554c(this.f1799d);
        c0859ar.mo1488a(this.f1808k);
        c0859ar.mo1488a(this.f1809l);
        c0859ar.mo1482a(this.f1803m);
        c0859ar.mo1482a(this.f1802j);
        c0859ar.mo1482a(this.f1804n);
        C0208c.m6282a(c0859ar, this.f1798c);
    }

    /* renamed from: a */
    public void m5685a(C0876k c0876k) {
        this.f1796a = (EnumC0306av) c0876k.m1461b(EnumC0306av.class);
        this.f1797b = c0876k.m1443q();
        this.f1805e = c0876k.m1453g();
        this.f1806f = c0876k.m1453g();
        this.f1807g = c0876k.m1446n();
        this.f1800h = null;
        if (c0876k.m1463b() >= 40) {
            this.f1799d = c0876k.m1457d();
        }
        if (c0876k.m1463b() >= 46) {
            this.f1808k = c0876k.m1453g();
            this.f1809l = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 58) {
            this.f1803m = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 65) {
            this.f1802j = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 79) {
            this.f1804n = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 82) {
            this.f1798c = C0208c.m6281a(c0876k);
        }
    }

    /* renamed from: c */
    public void m5680c() {
        if (this.f1807g != -1) {
            this.f1800h = AbstractC1120w.m467a(this.f1807g, true);
            if (this.f1800h == null) {
                GameEngine.m1145b("convertUnitIds failed");
                if (this.f1796a != null) {
                    GameEngine.m1145b("convertUnitIds: type:" + this.f1796a.toString());
                }
                if (this.f1797b != null) {
                    GameEngine.m1145b("convertUnitIds: build:" + this.f1797b.toString());
                }
                GameEngine.m1145b("convertUnitIds: x:" + this.f1805e + ", y:" + this.f1806f);
            }
            this.f1807g = -1L;
        }
    }

    /* renamed from: d */
    public EnumC0306av m5676d() {
        return this.f1796a;
    }

    /* renamed from: e */
    public void m5674e() {
        this.f1796a = EnumC0306av.f1810a;
        this.f1797b = null;
        this.f1799d = 1;
        this.f1805e = 2.0f;
        this.f1806f = 2.0f;
        this.f1807g = -1L;
        this.f1800h = null;
        this.f1801i = null;
        this.f1808k = -1.0f;
        this.f1809l = -1.0f;
        this.f1803m = false;
        this.f1802j = false;
        this.f1804n = false;
        this.f1798c = null;
    }

    /* renamed from: f */
    public boolean m5672f() {
        return this.f1796a == EnumC0306av.f1811b || this.f1796a == EnumC0306av.f1813d || this.f1796a == EnumC0306av.f1816g || this.f1796a == EnumC0306av.f1814e || this.f1796a == EnumC0306av.f1818i || this.f1796a == EnumC0306av.f1820k || this.f1796a == EnumC0306av.f1822m || this.f1796a == EnumC0306av.f1823n;
    }

    /* renamed from: g */
    public float m5670g() {
        if (m5672f() && this.f1800h != null) {
            return this.f1800h.f6951ek;
        }
        return this.f1805e;
    }

    /* renamed from: h */
    public float m5668h() {
        if (m5672f() && this.f1800h != null) {
            return this.f1800h.f6952el;
        }
        return this.f1806f;
    }

    /* renamed from: i */
    public Unit m5666i() {
        return this.f1800h;
    }

    /* renamed from: a */
    public void m5690a(float f, float f2) {
        m5674e();
        this.f1796a = EnumC0306av.f1810a;
        this.f1805e = f;
        this.f1806f = f2;
    }

    /* renamed from: b */
    public void m5683b(float f, float f2) {
        m5674e();
        this.f1796a = EnumC0306av.f1817h;
        this.f1805e = f;
        this.f1806f = f2;
    }

    /* renamed from: a */
    public void m5688a(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1811b;
        this.f1800h = unit;
    }

    /* renamed from: a */
    public void m5689a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        m5674e();
        this.f1796a = EnumC0306av.f1812c;
        this.f1805e = f;
        this.f1806f = f2;
        this.f1797b = interfaceC0303as;
        this.f1799d = (byte) i;
    }

    /* renamed from: b */
    public void m5682b(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1813d;
        this.f1800h = unit;
    }

    /* renamed from: c */
    public void m5678c(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1820k;
        this.f1800h = unit;
    }

    /* renamed from: d */
    public void m5675d(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1822m;
        this.f1800h = unit;
    }

    /* renamed from: e */
    public void m5673e(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1823n;
        this.f1800h = unit;
    }

    /* renamed from: c */
    public void m5679c(float f, float f2) {
        m5674e();
        this.f1796a = EnumC0306av.f1819j;
        this.f1805e = f;
        this.f1806f = f2;
    }

    /* renamed from: f */
    public void m5671f(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1816g;
        this.f1800h = unit;
    }

    /* renamed from: g */
    public void m5669g(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1814e;
        this.f1800h = unit;
    }

    /* renamed from: h */
    public void m5667h(Unit unit) {
        m5674e();
        this.f1796a = EnumC0306av.f1818i;
        this.f1800h = unit;
    }

    /* renamed from: c */
    public void m5677c(C0305au c0305au) {
        m5674e();
        this.f1796a = c0305au.f1796a;
        this.f1797b = c0305au.f1797b;
        this.f1805e = c0305au.f1805e;
        this.f1806f = c0305au.f1806f;
        this.f1800h = c0305au.f1800h;
        this.f1801i = c0305au.f1801i;
        this.f1799d = c0305au.f1799d;
        this.f1802j = c0305au.f1802j;
        this.f1798c = c0305au.f1798c;
    }

    /* renamed from: j */
    public long m5665j() {
        long j = 0;
        if (this.f1796a != null) {
            j = 0 + this.f1796a.ordinal();
        }
        return j;
    }

    /* renamed from: k */
    public void m5664k() {
        if (this.f1800h != null) {
            this.f1807g = this.f1800h.f6945ed;
            this.f1800h = null;
        }
        this.f1801i = null;
    }

    /* renamed from: l */
    public Unit m5663l() {
        if (m5672f()) {
            return m5666i();
        }
        AbstractC0623y abstractC0623y = Team.f1370i.f1313s;
        abstractC0623y.direction = 0.0f;
        abstractC0623y.f6951ek = this.f1805e;
        abstractC0623y.f6952el = this.f1806f;
        abstractC0623y.height = 0.0f;
        return abstractC0623y;
    }
}
