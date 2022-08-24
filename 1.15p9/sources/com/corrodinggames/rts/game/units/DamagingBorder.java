package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.CommonUtils;
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
public class DamagingBorder extends AbstractC0622x {

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
    boolean noDamage;

    /* renamed from: r */
    static final PointF f3698r;

    static {
        f3691k.m7270a(10.0f);
        f3691k.m7242b(Color.argb(100, 160, 0, 0));
        f3691k.m7260a(Paint.Style.STROKE);
        f3693m = new Paint();
        f3693m.m7259a(f3691k);
        f3693m.m7242b(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3692l = new Paint();
        f3692l.m7270a(2.0f);
        f3692l.m7242b(Color.argb(100, 160, 0, 0));
        f3692l.m7260a(Paint.Style.STROKE);
        f3694n = new Paint();
        f3694n.m7259a(f3692l);
        f3694n.m7242b(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3695o = new Paint();
        f3695o.m7270a(2.0f);
        f3695o.m7242b(Color.argb(50, 255, 255, 255));
        f3695o.m7260a(Paint.Style.STROKE);
        f3696p = new Paint(f3695o);
        f3698r = new PointF();
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.m1554c(0);
        c0859ar.mo1488a(this.f3681a);
        c0859ar.mo1488a(this.f3682b);
        c0859ar.mo1488a(this.f3683c);
        c0859ar.mo1488a(this.f3684d);
        c0859ar.mo1488a(this.f3685e);
        c0859ar.mo1488a(this.f3686f);
        c0859ar.mo1482a(this.f3687g);
        c0859ar.mo1488a(this.f3688h);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        c0876k.m1457d();
        this.f3681a = c0876k.m1453g();
        this.f3682b = c0876k.m1453g();
        this.f3683c = c0876k.m1453g();
        this.f3684d = c0876k.m1453g();
        this.f3685e = c0876k.m1453g();
        this.f3686f = c0876k.m1453g();
        this.f3687g = c0876k.m1455e();
        this.f3688h = c0876k.m1453g();
        super.mo2877a(c0876k);
        if (!this.isDead) {
            GameEngine.getInstance().f6115bW.m1938a(this);
        }
    }

    /* renamed from: b */
    public UnitType m3804r() {
        if (this.noDamage) {
            return UnitType.f1783X;
        }
        return UnitType.f1782W;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine.getInstance();
    }

    public DamagingBorder(boolean z) {
        super(z);
        this.f3681a = 2000.0f;
        this.f3682b = 0.0f;
        this.f3683c = 0.0f;
        this.f3684d = 2000.0f;
        this.f3687g = true;
        this.f3688h = 1.0f;
    }

    /* renamed from: f */
    public DamagingBorder m3805f() {
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof DamagingBorder) && !unit.isDead && unit != this) {
                DamagingBorder damagingBorder = (DamagingBorder) unit;
                if (damagingBorder.noDamage == this.noDamage) {
                    return damagingBorder;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3814a(float f) {
        super.m3280a(f);
        if (this.isDead) {
            return;
        }
        if (this.f3687g) {
            this.f3687g = false;
            DamagingBorder m3805f = m3805f();
            if (m3805f != null) {
                m3805f.f3685e = this.f6951ek;
                m3805f.f3686f = this.f6952el;
                m3805f.f3684d = this.f3684d;
                m5812ch();
            } else {
                this.f3685e = this.f6951ek;
                this.f3686f = this.f6952el;
                if (!this.noDamage) {
                    GameEngine.PrintLog("DamagingBorder created " + this.f3685e + "," + this.f3686f + " size:" + this.f3684d);
                }
                GameEngine.getInstance().f6115bW.m1938a(this);
            }
        }
        if (this.noDamage) {
            this.f3681a = this.f3684d;
            this.f6951ek = this.f3685e;
            this.f6952el = this.f3686f;
        } else if (this.f3681a > this.f3684d) {
            this.f3682b += 2.5E-4f * f;
            this.f3681a -= this.f3682b;
            this.f3689i = true;
            float m2314b = CommonUtils.m2314b(this.f6951ek, this.f6952el, this.f3685e, this.f3686f);
            float m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, this.f3685e, this.f3686f);
            if (m2314b > 1.0f) {
                float f2 = this.f3682b;
                if (f2 > m2314b * f) {
                    f2 = m2314b * f;
                }
                this.f6951ek += f2 * CommonUtils.m2249i(m2280d) * f;
                this.f6952el += f2 * CommonUtils.sin(m2280d) * f;
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
            m5812ch();
            return;
        }
        this.f3683c -= f;
        if (!this.isDead && this.f3683c <= 0.0f && !this.noDamage) {
            this.f3683c = 2.0f;
            float m2249i = this.f3681a * CommonUtils.m2249i(45.0f);
            float f3 = this.f6951ek - m2249i;
            float f4 = this.f6951ek + m2249i;
            float f5 = this.f6952el - m2249i;
            float f6 = this.f6952el + m2249i;
            float f7 = this.f3681a * this.f3681a;
            Iterator it = Unit.m5870bF().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.f6951ek <= f3 || unit.f6951ek >= f4 || unit.f6952el <= f5 || unit.f6952el >= f6) {
                    if (CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el) >= f7 && !unit.isDead && !(unit instanceof Tree) && !unit.m5755u() && unit.f1650cL == null) {
                        unit.mo4499a(this, (0.5f + (unit.f1631cs * 0.002f) + (unit.f1632ct * 0.001f)) * this.f3688h, (Projectile) null);
                    }
                }
            }
        }
        if (!this.noDamage) {
            GameEngine gameEngine = GameEngine.getInstance();
            this.f3690j += f;
            if (this.f3690j > 3.0f) {
                this.f3690j = 0.0f;
                int m2360a = gameEngine.f6136ct + CommonUtils.m2360a(0, (int) gameEngine.f6142cz);
                int m2360a2 = gameEngine.f6137cu + CommonUtils.m2360a(0, (int) gameEngine.f6143cA);
                if (CommonUtils.m2366a(this.f6951ek, this.f6952el, m2360a, m2360a2) > (this.f3681a + 30.0f) * (this.f3681a + 30.0f)) {
                    gameEngine.f6104bL.m6652a(m2360a, m2360a2);
                    gameEngine.f6104bL.m6648a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
                    C0745e m2537b = gameEngine.effects.m2537b(gameEngine.f6104bL.f800T + 10, (gameEngine.f6104bL.f801U - 10) + 10, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4826a);
                    if (m2537b != null) {
                        m2537b.f4763aq = 19;
                        m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
                        m2537b.f4720s = true;
                        m2537b.f4786ar = (short) 1;
                        m2537b.f4728F = 0.7f;
                        m2537b.f4745W = 30.0f;
                        m2537b.f4746X = m2537b.f4745W;
                        m2537b.f4730H = 0.2f;
                        m2537b.f4729G = 1.2f;
                        m2537b.f4725y = Color.argb(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public int m3803s() {
        return 0;
    }

    /* renamed from: t */
    public boolean m3802t() {
        return true;
    }

    /* renamed from: u */
    public boolean m3801u() {
        return true;
    }

    /* renamed from: a */
    public boolean m3808a(GameEngine gameEngine) {
        return true;
    }

    /* renamed from: a */
    public void m3811a(float f, boolean z) {
        DamagingBorder m3805f;
        GameEngine gameEngine = GameEngine.getInstance();
        float f2 = this.f6951ek - gameEngine.f6138cv;
        float f3 = this.f6952el - gameEngine.f6139cw;
        Paint paint = this.f3689i ? f3693m : f3691k;
        if (this.noDamage) {
            paint = f3695o;
        }
        float f4 = this.f3681a;
        if (this.f3687g && (m3805f = m3805f()) != null) {
            f4 = m3805f.f3684d - 300.0f;
        }
        gameEngine.graphics.mo931a(f2, f3, f4, paint);
    }

    /* renamed from: a */
    public boolean m3809a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.graphics.mo880i();
        gameEngine.graphics.mo923a(gameEngine.f6115bW.f5310w);
        float m1934b = gameEngine.f6115bW.m1934b(this.f3681a);
        Paint paint = this.f3689i ? f3694n : f3692l;
        if (this.noDamage) {
            paint = f3696p;
        }
        C0924aa.m1089a(gameEngine.graphics, i, i2, m1934b, paint);
        gameEngine.graphics.mo879j();
        return true;
    }

    /* renamed from: a */
    public void m3810a(int i) {
        this.f3681a = i * 100;
        this.f3684d = i * 100;
    }

    /* renamed from: a */
    public boolean m3813a(float f, float f2) {
        return CommonUtils.m2366a(this.f3685e, this.f3686f, f, f2) >= this.f3684d * this.f3684d;
    }

    /* renamed from: a */
    public PointF m3812a(float f, float f2, float f3) {
        if (f3 > this.f3684d) {
            f3 = this.f3684d;
        }
        float m2280d = CommonUtils.m2280d(this.f6951ek, this.f6952el, f, f2);
        float f4 = this.f3684d - f3;
        float m2249i = this.f6951ek + (CommonUtils.m2249i(m2280d) * f4);
        float sin = this.f6952el + (CommonUtils.sin(m2280d) * f4);
        f3698r.x = m2249i;
        f3698r.y = sin;
        return f3698r;
    }
}
