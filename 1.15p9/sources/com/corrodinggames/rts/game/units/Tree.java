package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.units.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/al.class */
public class Tree extends AbstractC0620v {

    /* renamed from: a */
    static BitmapOrTexture[] f1563a = new BitmapOrTexture[3];

    /* renamed from: b */
    static BitmapOrTexture f1564b = null;

    /* renamed from: c */
    BitmapOrTexture f1565c;

    /* renamed from: d */
    int f1566d;

    /* renamed from: e */
    int f1567e;

    /* renamed from: f */
    int f1568f;

    /* renamed from: g */
    float f1569g;

    /* renamed from: h */
    boolean f1570h;

    /* renamed from: i */
    float f1571i;

    /* renamed from: j */
    int f1572j;

    /* renamed from: k */
    int f1573k;

    /* renamed from: l */
    float f1574l;

    /* renamed from: m */
    boolean f1575m;

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1563a[0] = gameEngine.graphics.loadImage(R.drawable.palm_tree);
        f1563a[1] = gameEngine.graphics.loadImage(R.drawable.trees);
        f1563a[2] = gameEngine.graphics.loadImage(R.drawable.trees_snow);
        f1564b = gameEngine.graphics.loadImage(R.drawable.palm_leaves);
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f1566d);
        c0859ar.mo1487a(this.f1568f);
        c0859ar.mo1488a(this.f1569g);
        c0859ar.mo1482a(this.f1570h);
        c0859ar.mo1488a(this.f1571i);
        c0859ar.m1554c(2);
        c0859ar.mo1488a(this.f1574l);
        c0859ar.mo1487a(this.f1567e);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f1566d = c0876k.m1454f();
        this.f1568f = c0876k.m1454f();
        this.f1569g = c0876k.m1453g();
        this.f1570h = c0876k.m1455e();
        this.f1571i = c0876k.m1453g();
        byte m1457d = c0876k.m1457d();
        if (m1457d >= 1) {
            this.f1574l = c0876k.m1453g();
        } else {
            this.f1574l = 1.0f;
        }
        if (m1457d >= 2) {
            this.f1567e = c0876k.m1454f();
        } else {
            this.f1567e = 0;
        }
        m5922b(this.f1566d, this.f1567e);
        super.mo2877a(c0876k);
        if (this.isDead) {
            this.f1575m = false;
        }
    }

    /* renamed from: c */
    public BitmapOrTexture m5920c() {
        return this.f1565c;
    }

    /* renamed from: e */
    public boolean m5917e() {
        m5916f();
        return true;
    }

    public Tree(boolean z) {
        super(z);
        this.f1568f = 0;
        this.f1572j = 0;
        this.f1573k = 0;
        this.f1574l = 1.0f;
        this.f1575m = false;
        m5922b(1, -1);
        this.radius = 3.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 100.0f;
        this.f1631cs = this.f1632ct;
        this.direction = -90.0f;
        setDrawLayer(3);
    }

    /* renamed from: a_ */
    public void m5927a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (split.length != 0 && split.length != 1) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            m5922b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m5922b(int i, int i2) {
        this.f1566d = i;
        this.f1567e = i2;
        if (this.f1566d == 0) {
            m2884T(27);
            m2883U(41);
            this.f1572j = 1;
            this.f1573k = 1;
            this.f1565c = f1563a[0];
        } else if (this.f1566d == 1 || this.f1566d == 2) {
            if (i2 == -1) {
                i2 = CommonUtils.m2358a(0, 4, (int) this.f6945ed);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            m2884T(25);
            m2883U(30);
            if (this.f1566d == 1) {
                this.f1565c = f1563a[1];
            } else {
                this.f1565c = f1563a[2];
            }
            this.f1572j = 0;
            this.f1573k = 30 * i2;
            if (i2 == 0) {
                this.f1574l = CommonUtils.m2364a(1.0f, 1.2f, ((int) this.f6945ed) + 1);
            } else {
                this.f1574l = CommonUtils.m2364a(1.0f, 2.0f, ((int) this.f6945ed) + 1);
            }
            this.f1575m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1566d + " is not supported");
        }
    }

    /* renamed from: a */
    public void m5931a(float f) {
        if (this.f1566d == 0) {
            if (this.f1570h) {
                if (this.f1568f < 4) {
                    this.f1569g += f;
                    if (this.f1569g > 5.0f) {
                        this.f1569g = 0.0f;
                        this.f1568f++;
                    }
                }
            } else if (this.f1571i != 0.0f) {
                this.f1571i = CommonUtils.m2368a(this.f1571i, 0.1f * f);
                this.f1568f = 2;
            } else if (this.f1568f > 1) {
                this.f1568f = 1;
            }
        }
    }

    /* renamed from: a_ */
    public Rect m5926a_(boolean z) {
        int i = this.f1572j;
        int i2 = this.f1573k;
        int i3 = i + (this.f1568f * (this.f4223eo + 1));
        f1691dA.m7208a(i3, i2, i3 + this.f4223eo, i2 + this.f4224ep);
        return f1691dA;
    }

    /* renamed from: c */
    public boolean m5919c(float f) {
        BitmapOrTexture m5920c = m5920c();
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6250cW < 0.15d) {
            return false;
        }
        f1683ds.m7193a(mo4492cE());
        f1683ds.m7196a(0.0f, (int) (-this.height));
        float m7184d = f1683ds.m7184d();
        float m7183e = f1683ds.m7183e();
        f1684dt.m7207a(m5926a_(false));
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        interfaceC1027y.mo878k();
        if (this.f1574l != 1.0f) {
            interfaceC1027y.mo933a(this.f1574l, this.f1574l, m7184d, m7183e);
        }
        if (this.f1575m) {
            f1684dt.m7209a(this.f4223eo, 0);
            gameEngine.graphics.mo909a(m5920c, f1684dt, f1683ds, (Paint) null);
            f1684dt.m7209a(-this.f4223eo, 0);
        }
        interfaceC1027y.mo934a(mo3996d(false), m7184d, m7183e);
        interfaceC1027y.mo909a(m5920c, f1684dt, f1683ds, (Paint) null);
        interfaceC1027y.mo877l();
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao m5915h() {
        return EnumC0246ao.f1702a;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return false;
    }

    /* renamed from: aj */
    public boolean m5925aj() {
        return false;
    }

    /* renamed from: ak */
    public boolean m5924ak() {
        return false;
    }

    /* renamed from: p_ */
    public boolean m5912p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m5921b_() {
        return false;
    }

    /* renamed from: d */
    public UnitType m5910r() {
        return UnitType.f1760A;
    }

    /* renamed from: a */
    public boolean m5930a(Unit unit, float f) {
        if (!this.f1570h) {
            if (this.f1571i == 0.0f) {
            }
            this.f1631cs -= (((unit.mo3513bN() / 3000.0f) * this.f1632ct) * 0.06f) * f;
            this.f1571i = 1.0f;
            this.f1678dn = 1000.0f;
            if (this.f1631cs <= 0.0f) {
                this.direction = CommonUtils.m2280d(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el) + 180.0f;
                m5916f();
            }
            if (!this.f1570h) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m5916f() {
        if (!this.f1570h) {
            GameEngine gameEngine = GameEngine.getInstance();
            this.f1568f = 2;
            this.f1569g = 0.0f;
            setDrawLayer(0);
            this.collidable = false;
            this.isDead = true;
            this.f1607bU = gameEngine.f6096by;
            this.f1570h = true;
            this.f1575m = false;
            for (int i = 0; i < 1; i++) {
                gameEngine.effects.m2566a();
                C0745e m2537b = gameEngine.effects.m2537b(this.f6951ek + CommonUtils.rnd(-12.0f, 12.0f), this.f6952el + CommonUtils.rnd(-12.0f, 12.0f), this.height, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                if (m2537b != null) {
                    m2537b.f4763aq = 9;
                    m2537b.f4762ap = CommonUtils.m2360a(4, 5);
                    m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
                    m2537b.f4784an = true;
                    m2537b.f4734L = 5.0f + CommonUtils.rnd(0.0f, 3.0f);
                    m2537b.f4739Q = CommonUtils.rnd(-0.05f, 0.05f) + (CommonUtils.m2249i(this.direction) * 0.4f);
                    m2537b.f4740R = CommonUtils.rnd(-0.05f, 0.05f) + (CommonUtils.sin(this.direction) * 0.4f);
                    m2537b.f4724w = true;
                    m2537b.f4781x = 0.2f;
                    m2537b.f4730H = 0.4f * this.f1574l;
                    m2537b.f4729G = 0.4f * this.f1574l;
                    m2537b.f4745W = 90 + CommonUtils.m2360a(0, 40);
                    m2537b.f4746X = m2537b.f4745W;
                    m2537b.f4720s = true;
                    m2537b.f4786ar = (short) 2;
                }
            }
            float m2249i = this.f6951ek + (CommonUtils.m2249i(this.direction) * (this.f4224ep - 5));
            float sin = this.f6952el + (CommonUtils.sin(this.direction) * (this.f4224ep - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                gameEngine.effects.m2566a();
                C0745e m2537b2 = gameEngine.effects.m2537b(m2249i + CommonUtils.rnd(-17, 17), sin + CommonUtils.rnd(-17, 17), this.height, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                if (m2537b2 != null) {
                    m2537b2.f4763aq = 9;
                    m2537b2.f4762ap = CommonUtils.m2360a(4, 5);
                    if (z) {
                        z = false;
                        m2537b2.f4762ap = 3;
                    }
                    m2537b2.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
                    m2537b2.f4784an = true;
                    if (m2537b2.f4762ap == 3) {
                        m2537b2.f4739Q = CommonUtils.rnd(-0.05f, 0.05f);
                        m2537b2.f4740R = CommonUtils.rnd(-0.05f, 0.05f);
                        m2537b2.f4730H = 1.5f * this.f1574l;
                        m2537b2.f4729G = 2.2f * this.f1574l;
                        m2537b2.f4745W = 90 + CommonUtils.m2360a(0, 40);
                        m2537b2.f4786ar = (short) 2;
                    } else {
                        m2537b2.f4739Q = CommonUtils.rnd(-0.05f, 0.05f);
                        m2537b2.f4740R = CommonUtils.rnd(-0.05f, 0.0f);
                        m2537b2.f4730H = 1.3f;
                        m2537b2.f4729G = 1.3f;
                        m2537b2.f4745W = 60 + CommonUtils.m2360a(0, 40);
                        m2537b2.f4786ar = (short) 1;
                    }
                    m2537b2.f4746X = m2537b2.f4745W;
                    m2537b2.f4720s = true;
                }
            }
            if (this.f1566d == 1 || this.f1566d == 2) {
                this.f6951ek += CommonUtils.m2249i(this.direction) * ((this.f4224ep / 2) - 3);
                this.f6952el += CommonUtils.sin(this.direction) * ((this.f4224ep / 2) - 3);
            }
        }
    }

    /* renamed from: n */
    public void m5913n() {
        super.mo4207n();
        this.direction = CommonUtils.m2362a((this.f6952el * 5.0f) + (this.f6951ek * 3.0f), false);
        if (this.f1566d == 0) {
            this.f1568f = ((int) ((this.f6952el * 5.0f) + (this.f6951ek * 3.0f))) % 1;
        }
        if (this.f1566d == 1) {
        }
    }

    /* renamed from: a_ */
    public float m5928a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean m5914l() {
        return false;
    }

    /* renamed from: a */
    public float m5929a(Unit unit, float f, Projectile projectile) {
        boolean z = this.isDead;
        float a = super.mo4499a(unit, f, projectile);
        if (!z && this.isDead && projectile != null) {
            this.direction = CommonUtils.m2280d(this.f6951ek, this.f6952el, projectile.f6951ek, projectile.f6952el) + 180.0f;
        }
        return a;
    }

    /* renamed from: q */
    public boolean m5911q() {
        return true;
    }

    /* renamed from: t */
    public boolean m5909t() {
        return true;
    }
}
