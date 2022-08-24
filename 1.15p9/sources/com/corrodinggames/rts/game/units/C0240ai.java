package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public class C0240ai extends AbstractC0620v {

    /* renamed from: b */
    C0934e f1539b;

    /* renamed from: c */
    int f1540c;

    /* renamed from: d */
    int f1541d;

    /* renamed from: e */
    float f1542e;

    /* renamed from: f */
    float f1543f;

    /* renamed from: g */
    int f1544g;

    /* renamed from: h */
    int f1545h;

    /* renamed from: i */
    float f1546i;

    /* renamed from: j */
    float f1547j;

    /* renamed from: k */
    boolean f1548k;

    /* renamed from: l */
    float f1549l;

    /* renamed from: m */
    float f1550m;

    /* renamed from: n */
    float f1551n;

    /* renamed from: o */
    float f1552o;

    /* renamed from: p */
    float f1553p;

    /* renamed from: q */
    float f1554q;

    /* renamed from: r */
    boolean f1555r;

    /* renamed from: u */
    Rect f1556u;

    /* renamed from: a */
    static C0934e[] f1557a = new C0934e[2];

    /* renamed from: s */
    static Point f1558s = new Point();

    /* renamed from: t */
    public static C0241aj f1559t = new C0241aj();

    /* renamed from: b */
    public static void m4823b() {
        f1557a[0] = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.fire);
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f1540c);
        c0859ar.mo1487a(this.f1541d);
        c0859ar.mo1488a(this.f1542e);
        c0859ar.m1554c(0);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f1540c = c0876k.m1454f();
        this.f1541d = c0876k.m1454f();
        this.f1542e = c0876k.m1453g();
        c0876k.m1457d();
        super.mo2872a(c0876k);
    }

    /* renamed from: c */
    public C0934e m4820c() {
        return this.f1539b;
    }

    /* renamed from: e */
    public boolean m4816e() {
        return false;
    }

    public C0240ai(boolean z) {
        super(z);
        this.f1541d = 0;
        this.f1544g = 0;
        this.f1545h = 0;
        this.f1548k = false;
        this.f1556u = new Rect();
        m4829a(0);
        this.f1620ch = 20.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 100.0f;
        this.f1631cs = this.f1632ct;
        this.f1617ce = -90.0f;
        this.f1605bS = false;
        this.f1552o = 0.05f;
        this.f1553p = 120.0f;
        m472S(3);
    }

    /* renamed from: c_ */
    public void m4818c_() {
        this.f1605bS = false;
    }

    /* renamed from: a */
    public void m4829a(int i) {
        this.f1540c = i;
        if (this.f1540c == 0) {
            m2879T(20);
            m2878U(20);
            this.f1544g = 0;
            this.f1545h = 0;
            this.f1539b = f1557a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.f1540c + " is not supported");
    }

    /* renamed from: d */
    public void m4817d() {
        this.f1548k = true;
        this.f1546i = C0758f.m2340a((AbstractC1120w) this, -5, 5, 1);
        this.f1547j = C0758f.m2340a((AbstractC1120w) this, -5, 5, 2);
        this.f1542e = C0758f.m2340a((AbstractC1120w) this, 1, 10, 3);
        this.f1541d = C0758f.m2340a((AbstractC1120w) this, 0, 2, 4);
        this.f1543f = C0758f.m2340a((AbstractC1120w) this, 7, 13, 5);
        GameEngine m1234A = GameEngine.m1234A();
        C0173b c0173b = m1234A.f6104bL;
        m1234A.f6104bL.m5512a(this.f6951ek, this.f6952el);
        int i = m1234A.f6104bL.f800T;
        int i2 = m1234A.f6104bL.f801U;
        if (!c0173b.m5468c(i, i2)) {
            this.f1549l = 0.0f;
            this.f1550m = 0.0f;
            this.f1551n = 2.0f;
            return;
        }
        C0180g m5420a = m1234A.f6104bL.f832u.m5420a(i, i2);
        boolean z = false;
        if (m5420a.f917e || m5420a.f920h || m5420a.f923k || m5420a.f918f) {
            z = true;
        }
        if (z) {
            this.f1549l = 0.0f;
            this.f1550m = 0.0f;
            this.f1551n = 2.0f;
            return;
        }
        this.f1549l = 5.0E-4f;
        this.f1550m = 1.0f;
        this.f1551n = 0.3f;
        this.f1552o += C0758f.m2340a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
    }

    /* renamed from: a */
    public void m4831a(float f) {
        super.mo4640a(f);
        if (!this.f1548k) {
            m4817d();
        }
        if (this.f1552o < this.f1550m) {
            this.f1552o += this.f1549l * f;
            if (this.f1552o > this.f1550m) {
                this.f1552o = this.f1550m;
            }
        }
        if (this.f1552o > this.f1551n) {
            this.f1554q = (float) (this.f1554q + (0.01d * f));
            if ((!this.f1555r && this.f1554q > 1.0f) || this.f1554q > 8.0f) {
                this.f1554q = C0758f.m2340a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
                m4815f();
            }
        }
        this.f1542e += f;
        if (this.f1542e > 10.0f) {
            this.f1542e = 0.0f;
            this.f1541d++;
            if (this.f1541d > 3) {
                this.f1541d = 0;
            }
        }
        if (this.f1552o < 0.0f) {
            mo3076bv();
        }
    }

    /* renamed from: f */
    public void m4815f() {
        this.f1555r = true;
        m4822b(-1, -1);
        m4822b(0, -1);
        m4822b(1, -1);
        m4822b(-1, 0);
        m4822b(1, 0);
        m4822b(-1, 1);
        m4822b(0, 1);
        m4822b(1, 1);
    }

    /* renamed from: b */
    public void m4822b(int i, int i2) {
        GameEngine m1234A = GameEngine.m1234A();
        float f = (int) (this.f6951ek + (i * m1234A.f6104bL.f784n));
        float f2 = (int) (this.f6952el + (i2 * m1234A.f6104bL.f785o));
        if (m4830a(f, f2) == null) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f6951ek = f;
            c0240ai.f6952el = f2;
            c0240ai.mo3113b(this.f1608bV);
            m1234A.f6121cc.m3537a(c0240ai);
            AbstractC0197n.m5215c(c0240ai);
            this.f1555r = false;
        }
    }

    /* renamed from: a */
    public static C0240ai m4830a(float f, float f2) {
        GameEngine m1234A = GameEngine.m1234A();
        f1559t.m4808a(f, f2);
        m1234A.f6121cc.m3542a(f, f2, 30.0f, null, 1.0f, f1559t);
        return f1559t.f1562c;
    }

    /* renamed from: a_ */
    public Rect m4826a_(boolean z) {
        int i = this.f1544g;
        int i2 = this.f1545h;
        int i3 = i + (this.f1541d * this.f4223eo);
        f1691dA.m6053a(i3, i2, i3 + this.f4223eo, i2 + this.f4224ep);
        return f1691dA;
    }

    /* renamed from: c */
    public boolean m4819c(float f) {
        C0934e m4820c = m4820c();
        GameEngine m1234A = GameEngine.m1234A();
        f1683ds.m6038a(mo3841cE());
        f1683ds.m6041a(0.0f, (int) (-this.f6953em));
        f1683ds.m6041a(this.f1546i, this.f1547j);
        f1684dt.m6052a(m4826a_(false));
        m1234A.f6107bO.mo878k();
        float m6029d = f1683ds.m6029d();
        float m6028e = f1683ds.m6028e();
        m1234A.f6107bO.mo934a(mo4653d(false), m6029d, m6028e);
        m1234A.f6107bO.mo933a(this.f1552o * 2.7f, this.f1552o * 2.7f, m6029d, m6028e);
        m1234A.f6107bO.mo909a(m4820c, f1684dt, f1683ds, (Paint) null);
        m1234A.f6107bO.mo877l();
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao m4814h() {
        return EnumC0246ao.NONE;
    }

    /* renamed from: i */
    public boolean mo3283i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3284Q() {
        return false;
    }

    /* renamed from: ak */
    public boolean m4824ak() {
        return false;
    }

    /* renamed from: aj */
    public boolean m4825aj() {
        return false;
    }

    /* renamed from: p_ */
    public boolean m4810p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m4821b_() {
        return false;
    }

    /* renamed from: m */
    public UnitType m4809r() {
        return UnitType.spreadingFire;
    }

    /* renamed from: n */
    public void m4811n() {
        super.mo4793n();
    }

    /* renamed from: a_ */
    public float m4827a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean m4813l() {
        return false;
    }

    /* renamed from: P */
    public boolean m4832P() {
        return true;
    }

    /* renamed from: a */
    public float m4828a(Unit unit, float f, C0188f c0188f) {
        this.f1552o -= f / 100.0f;
        return super.mo4806a(unit, 0.0f, c0188f);
    }
}
