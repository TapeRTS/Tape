package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class C0535f extends AbstractC0622x {

    /* renamed from: a */
    public float f3681a;

    /* renamed from: b */
    public float f3682b;

    /* renamed from: c */
    public float f3683c;

    /* renamed from: d */
    public float f3684d;

    /* renamed from: e */
    public float f3685e;

    /* renamed from: f */
    public float f3686f;

    /* renamed from: g */
    public boolean f3687g;

    /* renamed from: h */
    public float f3688h;

    /* renamed from: i */
    public boolean f3689i;

    /* renamed from: j */
    public float f3690j;

    /* renamed from: k */
    static Paint f3691k = new Paint();

    /* renamed from: l */
    static Paint f3692l;

    /* renamed from: m */
    static Paint f3693m;

    /* renamed from: n */
    static Paint f3694n;

    /* renamed from: o */
    static Paint f3695o;

    /* renamed from: p */
    static Paint f3696p;

    /* renamed from: q */
    boolean f3697q;

    /* renamed from: r */
    static final PointF f3698r;

    static {
        f3691k.m6115a(10.0f);
        f3691k.m6087b(Color.m6127a(100, 160, 0, 0));
        f3691k.m6105a(Paint.Style.STROKE);
        f3693m = new Paint();
        f3693m.m6104a(f3691k);
        f3693m.m6087b(Color.m6127a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3692l = new Paint();
        f3692l.m6115a(2.0f);
        f3692l.m6087b(Color.m6127a(100, 160, 0, 0));
        f3692l.m6105a(Paint.Style.STROKE);
        f3694n = new Paint();
        f3694n.m6104a(f3692l);
        f3694n.m6087b(Color.m6127a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3695o = new Paint();
        f3695o.m6115a(2.0f);
        f3695o.m6087b(Color.m6127a(50, 255, 255, 255));
        f3695o.m6105a(Paint.Style.STROKE);
        f3696p = new Paint(f3695o);
        f3698r = new PointF();
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.m1554c(0);
        c0859ar.mo1488a(this.f3681a);
        c0859ar.mo1488a(this.f3682b);
        c0859ar.mo1488a(this.f3683c);
        c0859ar.mo1488a(this.f3684d);
        c0859ar.mo1488a(this.f3685e);
        c0859ar.mo1488a(this.f3686f);
        c0859ar.mo1482a(this.f3687g);
        c0859ar.mo1488a(this.f3688h);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        c0876k.m1457d();
        this.f3681a = c0876k.m1453g();
        this.f3682b = c0876k.m1453g();
        this.f3683c = c0876k.m1453g();
        this.f3684d = c0876k.m1453g();
        this.f3685e = c0876k.m1453g();
        this.f3686f = c0876k.m1453g();
        this.f3687g = c0876k.m1455e();
        this.f3688h = c0876k.m1453g();
        super.mo2872a(c0876k);
        if (!this.f1606bT) {
            GameEngine.m1234A().f6115bW.m1934a(this);
        }
    }

    /* renamed from: b */
    public UnitType m3554r() {
        if (this.f3697q) {
            return UnitType.zoneMarker;
        }
        return UnitType.damagingBorder;
    }

    /* renamed from: c */
    public static void m3556c() {
        GameEngine.m1234A();
    }

    public C0535f(boolean z) {
        super(z);
        this.f3681a = 2000.0f;
        this.f3682b = 0.0f;
        this.f3683c = 0.0f;
        this.f3684d = 2000.0f;
        this.f3687g = true;
        this.f3688h = 1.0f;
    }

    /* renamed from: f */
    public C0535f m3555f() {
        Iterator it = Unit.m4767bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof C0535f) && !unit.f1606bT && unit != this) {
                C0535f c0535f = (C0535f) unit;
                if (c0535f.f3697q == this.f3697q) {
                    return c0535f;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3564a(float f) {
        super.mo470a(f);
        if (this.f1606bT) {
            return;
        }
        if (this.f3687g) {
            this.f3687g = false;
            C0535f m3555f = m3555f();
            if (m3555f != null) {
                m3555f.f3685e = this.f6951ek;
                m3555f.f3686f = this.f6952el;
                m3555f.f3684d = this.f3684d;
                m4744ch();
            } else {
                this.f3685e = this.f6951ek;
                this.f3686f = this.f6952el;
                if (!this.f3697q) {
                    GameEngine.PrintLog("DamagingBorder created " + this.f3685e + "," + this.f3686f + " size:" + this.f3684d);
                }
                GameEngine.m1234A().f6115bW.m1934a(this);
            }
        }
        if (this.f3697q) {
            this.f3681a = this.f3684d;
            this.f6951ek = this.f3685e;
            this.f6952el = this.f3686f;
        } else if (this.f3681a > this.f3684d) {
            this.f3682b += 2.5E-4f * f;
            this.f3681a -= this.f3682b;
            this.f3689i = true;
            float m2309b = C0758f.m2309b(this.f6951ek, this.f6952el, this.f3685e, this.f3686f);
            float m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, this.f3685e, this.f3686f);
            if (m2309b > 1.0f) {
                float f2 = this.f3682b;
                if (f2 > m2309b * f) {
                    f2 = m2309b * f;
                }
                this.f6951ek += f2 * C0758f.m2244i(m2275d) * f;
                this.f6952el += f2 * C0758f.m2249h(m2275d) * f;
            }
        } else {
            this.f3689i = false;
            this.f6951ek = (float) (this.f6951ek + ((this.f3685e - this.f6951ek) * 0.003d * f));
            this.f6952el = (float) (this.f6952el + ((this.f3686f - this.f6952el) * 0.003d * f));
        }
        if (this.f3681a < this.f3684d) {
            this.f3681a = this.f3684d;
            this.f3682b = 0.0f;
        }
        if (this.f3684d < 0.0f) {
            m4744ch();
            return;
        }
        this.f3683c -= f;
        if (!this.f1606bT && this.f3683c <= 0.0f && !this.f3697q) {
            this.f3683c = 2.0f;
            float m2244i = this.f3681a * C0758f.m2244i(45.0f);
            float f3 = this.f6951ek - m2244i;
            float f4 = this.f6951ek + m2244i;
            float f5 = this.f6952el - m2244i;
            float f6 = this.f6952el + m2244i;
            float f7 = this.f3681a * this.f3681a;
            Iterator it = Unit.m4767bF().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.f6951ek <= f3 || unit.f6951ek >= f4 || unit.f6952el <= f5 || unit.f6952el >= f6) {
                    if (C0758f.m2361a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el) >= f7 && !unit.f1606bT && !(unit instanceof Tree) && !unit.mo3253u() && unit.f1650cL == null) {
                        unit.mo4806a(this, (0.5f + (unit.f1631cs * 0.002f) + (unit.f1632ct * 0.001f)) * this.f3688h, (C0188f) null);
                    }
                }
            }
        }
        if (!this.f3697q) {
            GameEngine m1234A = GameEngine.m1234A();
            this.f3690j += f;
            if (this.f3690j > 3.0f) {
                this.f3690j = 0.0f;
                int m2355a = m1234A.f6136ct + C0758f.m2355a(0, (int) m1234A.f6142cz);
                int m2355a2 = m1234A.f6137cu + C0758f.m2355a(0, (int) m1234A.f6143cA);
                if (C0758f.m2361a(this.f6951ek, this.f6952el, m2355a, m2355a2) > (this.f3681a + 30.0f) * (this.f3681a + 30.0f)) {
                    m1234A.f6104bL.m5512a(m2355a, m2355a2);
                    m1234A.f6104bL.m5508a(m1234A.f6104bL.f800T, m1234A.f6104bL.f801U);
                    C0745e m2532b = m1234A.f6110bR.m2532b(m1234A.f6104bL.f800T + 10, (m1234A.f6104bL.f801U - 10) + 10, 0.0f, EnumC0744d.custom, true, EnumC0748h.verylow);
                    if (m2532b != null) {
                        m2532b.f4763aq = 19;
                        m2532b.f4747Y = C0758f.m2288c(-180.0f, 180.0f);
                        m2532b.f4720s = true;
                        m2532b.f4786ar = (short) 1;
                        m2532b.f4728F = 0.7f;
                        m2532b.f4745W = 30.0f;
                        m2532b.f4746X = m2532b.f4745W;
                        m2532b.f4730H = 0.2f;
                        m2532b.f4729G = 1.2f;
                        m2532b.f4725y = Color.m6127a(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public int m3553s() {
        return 0;
    }

    /* renamed from: t */
    public boolean m3552t() {
        return true;
    }

    /* renamed from: u */
    public boolean m3551u() {
        return true;
    }

    /* renamed from: a */
    public boolean m3558a(GameEngine gameEngine) {
        return true;
    }

    /* renamed from: a */
    public void m3561a(float f, boolean z) {
        C0535f m3555f;
        GameEngine m1234A = GameEngine.m1234A();
        float f2 = this.f6951ek - m1234A.f6138cv;
        float f3 = this.f6952el - m1234A.f6139cw;
        Paint paint = this.f3689i ? f3693m : f3691k;
        if (this.f3697q) {
            paint = f3695o;
        }
        float f4 = this.f3681a;
        if (this.f3687g && (m3555f = m3555f()) != null) {
            f4 = m3555f.f3684d - 300.0f;
        }
        m1234A.f6107bO.mo931a(f2, f3, f4, paint);
    }

    /* renamed from: a */
    public boolean m3559a(int i, int i2) {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6107bO.mo880i();
        m1234A.f6107bO.mo923a(m1234A.f6115bW.f5310w);
        float m1930b = m1234A.f6115bW.m1930b(this.f3681a);
        Paint paint = this.f3689i ? f3694n : f3692l;
        if (this.f3697q) {
            paint = f3696p;
        }
        C0924aa.m1089a(m1234A.f6107bO, i, i2, m1930b, paint);
        m1234A.f6107bO.mo879j();
        return true;
    }

    /* renamed from: a */
    public void m3560a(int i) {
        this.f3681a = i * 100;
        this.f3684d = i * 100;
    }

    /* renamed from: a */
    public boolean m3563a(float f, float f2) {
        return C0758f.m2361a(this.f3685e, this.f3686f, f, f2) >= this.f3684d * this.f3684d;
    }

    /* renamed from: a */
    public PointF m3562a(float f, float f2, float f3) {
        if (f3 > this.f3684d) {
            f3 = this.f3684d;
        }
        float m2275d = C0758f.m2275d(this.f6951ek, this.f6952el, f, f2);
        float f4 = this.f3684d - f3;
        float m2244i = this.f6951ek + (C0758f.m2244i(m2275d) * f4);
        float m2249h = this.f6952el + (C0758f.m2249h(m2275d) * f4);
        f3698r.f227a = m2244i;
        f3698r.f228b = m2249h;
        return f3698r;
    }
}
