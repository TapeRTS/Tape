package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class LaserDefence extends AbstractC0498i {

    /* renamed from: d */
    boolean f3508d;

    /* renamed from: e */
    boolean f3509e;

    /* renamed from: f */
    float f3510f;

    /* renamed from: i */
    PointF f3511i;

    /* renamed from: j */
    Rect f3512j;

    /* renamed from: a */
    static C0934e[] f3513a = new C0934e[10];

    /* renamed from: b */
    static C0934e[] f3514b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3515c = null;

    /* renamed from: g */
    static C0934e f3516g = null;

    /* renamed from: h */
    static C0934e[] f3517h = new C0934e[10];

    /* renamed from: k */
    static Action f3518k = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.p.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5207g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5215a() {
            return C0820a.m1882a("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5213b() {
            return C0820a.m1882a("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5211c() {
            return UnitType.laserDefence.getUpgradePrice(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3740K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3438a(Unit unit, boolean z) {
            LaserDefence laserDefence = (LaserDefence) unit;
            if (laserDefence.f3508d || laserDefence.mo3820a(m5121N(), z) > 0) {
                return false;
            }
            return super.mo4767a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3439b(Unit unit) {
            if (((LaserDefence) unit).f3508d) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6526i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5208f() {
            return EnumC0225t.f1466c;
        }
    };

    /* renamed from: l */
    static ArrayList f3519l = new ArrayList();

    static {
        f3519l.add(f3518k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3508d);
        c0859ar.mo1488a(this.f1638cz);
        c0859ar.mo1482a(this.f3509e);
        c0859ar.mo1488a(this.f3510f);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3508d = c0876k.m1455e();
        this.f1638cz = c0876k.m1453g();
        this.f3509e = c0876k.m1455e();
        if (c0876k.m1463b() >= 38) {
            this.f3510f = c0876k.m1453g();
        }
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3251v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3517h[this.f1608bV.m5431O()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3515c = m1234A.f6107bO.mo930a(C0067R.drawable.laser_defence_dead);
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.laser_defence);
        C0934e mo930a2 = m1234A.f6107bO.mo930a(C0067R.drawable.laser_defence_t2);
        f3513a = AbstractC0197n.m5408a(mo930a);
        f3514b = AbstractC0197n.m5408a(mo930a2);
        mo930a.mo395n();
        mo930a2.mo395n();
        f3516g = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_building_turrent);
        f3517h = AbstractC0197n.m5408a(f3516g);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3748K() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2558a(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3515c;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3515c;
        }
        if (this.f1608bV == null) {
            return f3513a[f3513a.length - 1];
        }
        if (!this.f3508d) {
            return f3513a[this.f1608bV.m5431O()];
        }
        return f3514b[this.f1608bV.m5431O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return null;
    }

    public LaserDefence(boolean z) {
        super(z);
        this.f3511i = new PointF();
        this.f3512j = new Rect();
        m2874a(f3513a[0], 2);
        this.f1638cz = 1.0f;
        this.f1620ch = 19.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 500.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3513a[f3513a.length - 1];
        this.f3421n.m6217a(0, 0, 1, 1);
        this.f3422o.m6217a(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        float f2;
        super.mo470a(f);
        if (!m4916bS() || this.f1606bT) {
            return;
        }
        GameEngine.m1234A();
        float f3 = 4.0E-4f * f;
        if (this.f3508d) {
            f3 += 2.0E-4f * f;
        }
        this.f1638cz = C0758f.m2362a(this.f1638cz, 1.0f, f3);
        if (this.f1638cz >= 1.0f) {
            this.f3509e = false;
        }
        this.f3510f -= f;
        this.f3511i.m6221a(mo3241E(0));
        if (this.f1638cz > 0.0f && !this.f3509e) {
            if (!this.f3508d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m3804a(this, this.f3511i.f227a, this.f3511i.f228b, this.f6953em, mo3032m(), f2)) {
                this.f3510f = 3.0f;
            }
            if (this.f1638cz < 0.0f) {
                this.f1638cz = 0.0f;
                this.f3509e = true;
            }
        }
        if (this.f3509e) {
            this.f3426s = 1;
        } else {
            this.f3426s = 0;
        }
    }

    /* renamed from: a */
    public static boolean m3804a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, float f5) {
        GameEngine m1234A = GameEngine.m1234A();
        float f6 = f4 * f4;
        Object[] m559a = C0188f.f1082a.m559a();
        int i = C0188f.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f = (C0188f) m559a[i2];
            if (!c0188f.f1000A && !c0188f.f1002C && ((c0188f.f1009J > 7.0f || (c0188f.f1009J > 2.0f && c0188f.f993t > 8.0f)) && !c0188f.f1070aS && ((c0188f.f6951ek - f) * (c0188f.f6951ek - f)) + ((c0188f.f6952el - f2) * (c0188f.f6952el - f2)) < f6 && c0188f.f6953em >= -1.0f)) {
                boolean z = false;
                if (c0188f.f985l != null && abstractC0623y.f1608bV.m5368d(c0188f.f985l.f1608bV)) {
                    z = true;
                }
                if (!z && c0188f.f983j != null && abstractC0623y.f1608bV.m5380c(c0188f.f983j.f1608bV)) {
                    z = true;
                }
                if (z) {
                    C0745e m2555a = m1234A.f6110bR.m2555a(f, f2, f3, c0188f.f6951ek, c0188f.f6952el, c0188f.f6953em);
                    if (m2555a != null) {
                        m2555a.f4745W = 10.0f;
                        m2555a.f4746X = m2555a.f4745W;
                    }
                    C0745e m2532b = m1234A.f6110bR.m2532b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                    if (m2532b != null) {
                        m2532b.f4739Q = 0.0f;
                        m2532b.f4740R = 0.0f;
                        m2532b.f4762ap = 4;
                        m2532b.f4745W = 39.0f;
                        m2532b.f4746X = m2532b.f4745W;
                        m2532b.f4720s = true;
                        m2532b.f4728F = 1.3f;
                        m2532b.f4730H = 1.1f;
                        m2532b.f4729G = 0.7f;
                    }
                    c0188f.f1007H -= 1.01f;
                    if (c0188f.f1007H <= 0.0f) {
                        c0188f.m5525d();
                        C0745e m2532b2 = m1234A.f6110bR.m2532b(c0188f.f6951ek, c0188f.f6952el, c0188f.f6953em, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                        if (m2532b2 != null) {
                            m2532b2.f4739Q = 0.0f;
                            m2532b2.f4740R = 0.0f;
                            m2532b2.f4762ap = 4;
                            m2532b2.f4745W = 23.0f;
                            m2532b2.f4746X = m2532b2.f4745W;
                            m2532b2.f4720s = true;
                            m2532b2.f4728F = 0.9f;
                            m2532b2.f4730H = 0.5f;
                            m2532b2.f4729G = 0.2f;
                        }
                        m1234A.f6105bM.m2996a(C0631e.f4061F, 0.2f, 1.0f + C0758f.m2288c(-0.07f, 0.07f), c0188f.f6951ek, c0188f.f6952el);
                    }
                    abstractC0623y.f1638cz -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3241E(int i) {
        f3980bf.m6222a(this.f6951ek, this.f6952el - 13.0f);
        return f3980bf;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        if (!this.f3508d) {
            return 160.0f;
        }
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3114b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo462c(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo6527r() {
        return UnitType.laserDefence;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3253l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public float mo3568bV() {
        if (this.f1638cz != 1.0f) {
            return this.f1638cz;
        }
        return super.mo3568bV();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bW */
    public boolean mo3567bW() {
        return this.f3509e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bd */
    public float mo3094bd() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3747a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3518k.m5121N())) {
            mo3206a(2);
            m3222W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3798cl() {
        if (!this.f3508d) {
            return f3518k.m5121N();
        }
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3223V() {
        if (this.f3508d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3206a(int i) {
        if (i == 1) {
            this.f3508d = false;
        } else if (i == 2 && !this.f3508d) {
            this.f3508d = true;
            this.f1632ct += 900.0f;
            this.f1631cs += 900.0f;
        }
        mo3226S();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3589N() {
        return f3519l;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo4783e(f);
        C1117y.m495a(this, mo3032m());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo3801cX() {
        return GameEngine.m1234A().f6104bL.f784n;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cY */
    public float mo3800cY() {
        return GameEngine.m1234A().f6104bL.f785o;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public float mo3799cZ() {
        return super.mo3807cZ() - 8.0f;
    }
}
