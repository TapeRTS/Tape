package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0247ap;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0238ag;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.SpreadingFire;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.AbstractC0498i;
import com.corrodinggames.rts.game.units.buildings.C0499j;
import com.corrodinggames.rts.game.units.buildings.C0500k;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.buildings.NukeLaucher;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a;
import com.corrodinggames.rts.game.units.custom.p018b.C0393g;
import com.corrodinggames.rts.game.units.custom.p018b.C0394h;
import com.corrodinggames.rts.game.units.custom.p018b.C0398l;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class C0451j extends AbstractC0621w implements InterfaceC0242ak, InterfaceC0469d, InterfaceC0501l {

    /* renamed from: a */
    public int f2839a;

    /* renamed from: b */
    public final C0427e f2840b;

    /* renamed from: c */
    float f2841c;

    /* renamed from: d */
    float f2842d;

    /* renamed from: e */
    float f2843e;

    /* renamed from: f */
    public float f2844f;

    /* renamed from: g */
    boolean f2845g;

    /* renamed from: h */
    public boolean f2846h;

    /* renamed from: i */
    public boolean f2847i;

    /* renamed from: j */
    float f2848j;

    /* renamed from: k */
    boolean f2849k;

    /* renamed from: l */
    boolean f2850l;

    /* renamed from: m */
    float f2851m;

    /* renamed from: n */
    boolean f2852n;

    /* renamed from: o */
    float f2853o;

    /* renamed from: p */
    public boolean f2854p;

    /* renamed from: q */
    boolean f2855q;

    /* renamed from: r */
    float f2856r;

    /* renamed from: s */
    float f2857s;

    /* renamed from: t */
    public float f2858t;

    /* renamed from: u */
    public boolean f2859u;

    /* renamed from: v */
    float f2860v;

    /* renamed from: w */
    public C0453l f2861w;

    /* renamed from: x */
    public C0359aq f2862x;

    /* renamed from: y */
    public C0453l f2863y;

    /* renamed from: z */
    public AbstractC0377ar[] f2864z;

    /* renamed from: A */
    public final C1101m f2865A;

    /* renamed from: B */
    public C1101m f2866B;

    /* renamed from: C */
    public float f2867C;

    /* renamed from: D */
    PointF[] f2868D;

    /* renamed from: E */
    PointF[] f2869E;

    /* renamed from: F */
    Projectile[] f2870F;

    /* renamed from: I */
    Paint f2873I;

    /* renamed from: dJ */
    final C0500k f2876dJ;

    /* renamed from: dK */
    public static PointF f2877dK;

    /* renamed from: dL */
    public static Unit f2878dL;

    /* renamed from: dM */
    public float f2879dM;

    /* renamed from: dN */
    public float f2880dN;

    /* renamed from: dO */
    public float f2881dO;

    /* renamed from: dP */
    public float f2882dP;

    /* renamed from: dQ */
    public C0394h[] f2883dQ;

    /* renamed from: dU */
    static boolean f2887dU;

    /* renamed from: dV */
    static final HashMap f2888dV;

    /* renamed from: dW */
    static int f2889dW;

    /* renamed from: dX */
    static String f2890dX;

    /* renamed from: dY */
    static final PointF f2891dY;

    /* renamed from: dZ */
    C0449h f2892dZ;

    /* renamed from: ea */
    protected static final C1080ai f2893ea;

    /* renamed from: eb */
    protected static final PointF f2894eb;

    /* renamed from: ec */
    C1101m f2895ec;

    /* renamed from: G */
    static final PointF f2871G = new PointF();

    /* renamed from: H */
    static PointF f2872H = new PointF();

    /* renamed from: J */
    protected static final PointF f2874J = new PointF();

    /* renamed from: dI */
    protected static final C1080ai f2875dI = new C1080ai();

    /* renamed from: dR */
    static ArrayList f2884dR = new ArrayList();

    /* renamed from: dS */
    public static C1101m f2885dS = new C1101m();

    /* renamed from: dT */
    public static C1101m f2886dT = new C1101m();

    /* renamed from: K */
    public void m5022K() {
        this.f2868D = new PointF[6];
        this.f2869E = new PointF[this.f2868D.length];
        for (int i = 0; i < this.f2868D.length; i++) {
            this.f2868D[i] = new PointF();
            this.f2869E[i] = new PointF();
        }
    }

    /* renamed from: b */
    public PointF[] mo3515b() {
        if (this.f2868D == null) {
            m5022K();
        }
        return this.f2868D;
    }

    /* renamed from: c */
    public PointF[] mo3511c() {
        if (this.f2868D == null) {
            m5022K();
        }
        return this.f2869E;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(10);
        c0859ar.mo1488a(this.f2843e);
        c0859ar.mo1488a(this.f2851m);
        c0859ar.mo1482a(this.f2852n);
        c0859ar.mo1487a(this.f2865A.size());
        Iterator it = this.f2865A.iterator();
        while (it.hasNext()) {
            c0859ar.mo1486a((Unit) it.next());
        }
        c0859ar.mo1482a(this.f2855q);
        c0859ar.mo1488a(this.f2853o);
        c0859ar.mo1488a(this.f2844f);
        c0859ar.mo1488a(this.f2856r);
        c0859ar.mo1482a(this.f2859u);
        byte b = 0;
        if (this.f2883dQ != null) {
            b = (byte) this.f2883dQ.length;
        }
        c0859ar.m1554c(b);
        if (this.f2883dQ != null) {
            for (int i = 0; i < b; i++) {
                C0394h c0394h = this.f2883dQ[i];
                c0859ar.mo1488a(c0394h.f2414b);
                c0859ar.mo1488a(c0394h.f2415c);
                c0859ar.mo1488a(c0394h.f2426d);
                c0859ar.mo1488a(c0394h.f2420i);
                c0859ar.mo1482a(c0394h.f2421k);
                c0859ar.mo1482a(c0394h.f2427j);
                c0859ar.mo1482a(c0394h.f2428m);
                c0859ar.mo1482a(c0394h.f2429n);
            }
        }
        this.f2876dJ.m4390a(c0859ar);
        c0859ar.m1574a(this.f2863y);
        c0859ar.mo1482a(this.f2847i);
        c0859ar.mo1482a(this.f2846h);
        boolean z = this.f2892dZ != this.f2861w.f2921N;
        c0859ar.mo1482a(z);
        if (z) {
            C0448g.m5060a(this.f2892dZ, c0859ar);
        }
        C0359aq.m5366a(this.f2862x, this, c0859ar);
        super.mo466a(c0859ar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        InterfaceC0303as m1443q;
        byte m1457d;
        C0394h c0394h;
        if (c0876k.m1463b() >= 32) {
            int m1454f = c0876k.m1454f();
            this.f2843e = c0876k.m1453g();
            this.f2851m = c0876k.m1453g();
            this.f2852n = c0876k.m1455e();
            this.f2865A.clear();
            int m1454f2 = c0876k.m1454f();
            for (int i = 0; i < m1454f2; i++) {
                Unit m1445o = c0876k.m1445o();
                if (m1445o != null) {
                    this.f2865A.add(m1445o);
                }
            }
            if (m1454f >= 1) {
                this.f2855q = c0876k.m1455e();
            }
            if (m1454f >= 2) {
                this.f2853o = c0876k.m1453g();
            }
            if (m1454f >= 3) {
                this.f2844f = c0876k.m1453g();
                this.f2856r = c0876k.m1453g();
            }
            if (m1454f >= 4) {
                this.f2859u = c0876k.m1455e();
            }
            if (m1454f >= 5 && (m1457d = c0876k.m1457d()) != 0) {
                m4843ds();
                if (this.f2883dQ == null) {
                    GameEngine.PrintLog("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < m1457d; i2++) {
                    if (this.f2883dQ == null) {
                        c0394h = new C0394h();
                    } else if (i2 >= this.f2883dQ.length) {
                        GameEngine.PrintLog("readIn: legs " + ((int) i2) + ">=" + this.f2883dQ.length);
                        c0394h = new C0394h();
                    } else {
                        c0394h = this.f2883dQ[i2];
                    }
                    C0394h c0394h2 = c0394h;
                    c0394h2.f2414b = c0876k.m1453g();
                    c0394h2.f2415c = c0876k.m1453g();
                    c0394h2.f2426d = c0876k.m1453g();
                    c0394h2.f2420i = c0876k.m1453g();
                    c0394h2.f2421k = c0876k.m1455e();
                    c0394h2.f2430o = true;
                    c0394h2.f2427j = c0876k.m1455e();
                    c0394h2.f2428m = c0876k.m1455e();
                    c0394h2.f2429n = c0876k.m1455e();
                }
            }
            if (m1454f >= 6) {
                this.f2876dJ.m4389a(c0876k);
            }
            if (m1454f >= 7 && (m1443q = c0876k.m1443q()) != null) {
                if (m1443q instanceof C0453l) {
                    this.f2863y = (C0453l) m1443q;
                } else {
                    GameEngine.m1145b("Got non CustomUnitMetadata object of:" + m1443q.mo5706i() + " loading real_meta");
                    this.f2863y = C0453l.f2901b;
                }
            }
            if (m1454f >= 8) {
                this.f2847i = c0876k.m1455e();
                this.f2846h = c0876k.m1455e();
            }
            if (m1454f >= 9 && c0876k.m1455e()) {
                m4984a(C0448g.m5059a(c0876k), true);
            }
            if (m1454f >= 10) {
                C0359aq.m5363a(this, c0876k, m1454f);
            }
        }
        super.mo2877a(c0876k);
        if (this.f2883dQ != null) {
            this.f2879dM = this.f6951ek;
            this.f2880dN = this.f6952el;
            this.f2881dO = this.height;
            this.f2882dP = this.direction;
        }
    }

    /* renamed from: cq */
    public boolean m4879cq() {
        return this.f2861w.f3258eH > 0;
    }

    /* renamed from: bB */
    public int mo5935bB() {
        return this.f2865A.size();
    }

    /* renamed from: bA */
    public boolean mo5936bA() {
        return this.f2852n;
    }

    /* renamed from: d */
    public boolean m4866d(Unit unit, boolean z) {
        if (this.f2861w.f3258eH == 0 || this.f2852n || this.f1623ck < 1.0f || !m5028G(unit) || unit == this) {
            return false;
        }
        if (this.team != unit.team && !z && (!this.f2861w.f3026cw || this.team != Team.f1370i)) {
            return false;
        }
        if (this.f2861w.f3125eK != null && !this.f2861w.f3125eK.m5053a() && !C0448g.m5061a(this.f2861w.f3125eK, unit.m5787dc())) {
            return false;
        }
        if (this.f2861w.f3259eL.size() > 0) {
            boolean z2 = false;
            Iterator it = this.f2861w.f3259eL.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((EnumC0246ao) it.next()) == unit.mo5645h()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return C1117y.m488a(unit, this.f2861w.f3126eM, this.f2861w.f3127eN);
    }

    /* renamed from: e */
    public boolean m4835e(Unit unit, boolean z) {
        if (!m4866d(unit, z)) {
            return false;
        }
        m5039C(unit);
        return true;
    }

    /* renamed from: C */
    public void m5039C(Unit unit) {
        unit.f1650cL = this;
        this.f2865A.add(unit);
        if (this.f2861w.f3027cx && this.team == Team.f1370i) {
            m4837e(unit.team);
        }
        m5888a(EnumC0347ae.f2182l, unit);
        unit.m5888a(EnumC0347ae.f2185o, this);
        GameEngine.getInstance().f6111bS.m1976l(unit);
    }

    /* renamed from: D */
    public void m5036D(Unit unit) {
        m5888a(EnumC0347ae.f2183m, unit);
        unit.m5888a(EnumC0347ae.f2186p, this);
        if (this.f2861w.f3028cy && this.f2865A.size() == 0) {
            m4837e(Team.f1370i);
        }
    }

    /* renamed from: e */
    public void mo5934e(Unit unit) {
        if (unit.f1650cL == this) {
            this.f2865A.remove(unit);
            unit.f1650cL = null;
            m5036D(unit);
            return;
        }
        GameEngine.m1120g("Unit is not being transported");
    }

    /* renamed from: L */
    public void m5020L() {
        if (this.f2861w.f3258eH == 0) {
            return;
        }
        this.f2852n = true;
        this.f2851m = 30.0f;
    }

    /* renamed from: M */
    public void m5018M() {
        if (this.f2861w.f3258eH == 0) {
            return;
        }
        this.f2852n = false;
    }

    /* renamed from: g */
    public boolean m4823g(boolean z) {
        if (this.f2865A.size() == 0) {
            return false;
        }
        return m4947b((Unit) this.f2865A.remove(this.f2865A.size() - 1), z, this.f2865A.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m4993a(Unit unit, boolean z, boolean z2) {
        this.f2865A.remove(unit);
        return m4947b(unit, z, z2);
    }

    /* renamed from: b */
    private boolean m4947b(Unit unit, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.f2861w.f3056df != null) {
            f = this.f2861w.f3056df.floatValue();
        }
        float f2 = 70.0f;
        if (this.f2861w.f3059di != null) {
            f2 = this.f2861w.f3059di.floatValue();
        }
        float f3 = this.f2861w.f3054dd;
        float f4 = this.f2861w.f3055de;
        float m2249i = (this.f6951ek + (CommonUtils.m2249i(this.direction + f) * f4)) - (CommonUtils.sin(this.direction + f) * f3);
        float sin = this.f6952el + (CommonUtils.sin(this.direction + f) * f4) + (CommonUtils.m2249i(this.direction + f) * f3);
        float m2249i2 = m2249i + (CommonUtils.m2249i(this.direction + 90.0f) * (z2 ? -7.0f : 7.0f));
        float sin2 = sin + (CommonUtils.sin(this.direction + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !m4939bI()) {
            if (!C1117y.m494a(unit, m2249i2, sin2)) {
                m2249i2 += 10.0f;
            }
            if (!C1117y.m494a(unit, m2249i2, sin2)) {
                m2249i2 -= 20.0f;
            }
            if (!C1117y.m494a(unit, m2249i2, sin2)) {
                m2249i2 -= 10.0f;
                sin2 += 10.0f;
            }
            if (!C1117y.m494a(unit, m2249i2, sin2)) {
                sin2 -= 20.0f;
            }
        }
        if (!z && !C1117y.m494a(unit, m2249i2, sin2) && !m4939bI()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1651cM == this) {
                    C0399m dl = abstractC0623y.m5778dl();
                    if (dl == null) {
                        GameEngine.PrintLog("Unload, attachment data is null");
                    }
                    if (dl != null) {
                        z4 = dl.f2458E;
                    }
                }
            }
            C1117y.m489a(unit, this);
            float f5 = this.direction + f;
            if (!z4) {
                unit.f6951ek = m2249i2;
                unit.f6952el = sin2;
                unit.direction = f5;
                unit.f1614cb = 0.0f;
                unit.f1613ca = 0.0f;
                unit.f1610bX = 0.0f;
                unit.f1611bY = 0.0f;
                unit.f1610bX += 0.1f;
            }
            unit.f1603bQ = this;
            unit.f1604bR = 45.0f;
            if (z4) {
                unit.f1604bR = 85.0f;
            }
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
                if (!z4) {
                    abstractC0623y2.m3049j(unit.direction);
                }
                if (!this.f2861w.f3131eR.read(this)) {
                    abstractC0623y2.m3127az();
                    if (f2 != 0.0f) {
                        abstractC0623y2.m3071d(unit.f6951ek + (CommonUtils.m2249i(f5 + (z2 ? -7.0f : 7.0f)) * f2), unit.f6952el + (CommonUtils.sin(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    abstractC0623y2.f3915ab = 0;
                } else {
                    abstractC0623y2.m3172aH();
                }
            }
            if (!z4) {
                if (!this.f2861w.f3058dh) {
                    unit.height = this.height;
                }
                unit.height += this.f2861w.f3057dg;
            }
            if (unit instanceof C0451j) {
                ((C0451j) unit).m4861dD();
            }
        }
        if (!z3) {
            this.f2865A.add(unit);
        } else {
            m5036D(unit);
        }
        return z3;
    }

    /* renamed from: bX */
    public int m4930bX() {
        if (this.f2861w.f3258eH == 0 || !this.f2861w.f2907w) {
            return -1;
        }
        return m4858dG();
    }

    /* renamed from: bY */
    public int m4929bY() {
        if (this.f2861w.f3258eH == 0 || !this.f2861w.f2907w) {
            return -1;
        }
        return this.f2861w.f3258eH;
    }

    /* renamed from: dq */
    public void m4845dq() {
        if (this.f2865A.f6888a > 0) {
            m4819h(this.f2861w.f3130eQ.read(this));
        }
    }

    /* renamed from: h */
    public void m4819h(boolean z) {
        Iterator it = this.f2865A.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.f1650cL = null;
            unit.f6951ek = this.f6951ek + (CommonUtils.m2249i(this.direction) * (-9.0f));
            unit.f6952el = this.f6952el + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m5811ci();
            }
        }
        this.f2865A.clear();
    }

    /* renamed from: bu */
    public void m4914bu() {
        if (!this.isDead) {
            m5889a(EnumC0347ae.f2173c);
        }
        Object[] m559a = this.f2861w.f3193h.m559a();
        for (int i = this.f2861w.f3193h.f6888a - 1; i >= 0; i--) {
            ((AbstractC0387a) m559a[i]).mo5332b(this);
        }
        super.mo3084bu();
    }

    /* renamed from: a */
    public void mo2880a() {
        m4845dq();
        Object[] m559a = this.f2861w.f3193h.m559a();
        for (int i = this.f2861w.f3193h.f6888a - 1; i >= 0; i--) {
            ((AbstractC0387a) m559a[i]).mo5331c(this);
        }
        Team.m6389a((Unit) this);
        this.f2876dJ.m4388a(true);
        super.mo2880a();
    }

    /* renamed from: dr */
    public C0453l m4802r() {
        return this.f2861w;
    }

    /* renamed from: I */
    public boolean mo3295I() {
        if (this.f2861w.f2947aG || this.f2845g || this.f1651cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: aR */
    public boolean m4974aR() {
        if (this.f2861w.f3082dJ) {
            return false;
        }
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2464O) {
            return false;
        }
        return true;
    }

    /* renamed from: aS */
    public boolean m4973aS() {
        if (this.f2861w.f2947aG) {
            return false;
        }
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2460H) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao m4822h() {
        return this.f2861w.f3138fc;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return this.f2861w.f3138fc == EnumC0246ao.f1705d && this.height >= 4.0f;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return this.height <= -1.0f;
    }

    /* renamed from: ct */
    public boolean m4876ct() {
        if (m4822h() == EnumC0246ao.f1706e) {
            return true;
        }
        return false;
    }

    /* renamed from: cr */
    public boolean m4878cr() {
        if (m4822h() == EnumC0246ao.f1705d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public BitmapOrTexture m4792v() {
        if (this.team.f1305k == -1 || this.f2861w.f2940ar == null) {
            return null;
        }
        return this.f2861w.f2940ar[this.team.getId()];
    }

    /* renamed from: d */
    public BitmapOrTexture m4870d() {
        if (this.isDead && this.f2861w.f3213am != null) {
            return this.f2861w.f3213am;
        }
        return this.f2861w.f3216aq[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4814k() {
        return this.f2861w.f3215ao;
    }

    /* renamed from: F */
    public boolean m5032F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && (!this.isDead || this.height >= 1.0f) && this.height >= -1.0f;
    }

    /* renamed from: d */
    public BitmapOrTexture m4868d(int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2558C != null && c0411bl.f2558C.read(this)) {
            return null;
        }
        if (c0411bl.f2593aE != null) {
            return c0411bl.f2593aE[this.team.getId()];
        }
        if (c0411bl.f2592aD != null) {
            return c0411bl.f2592aD;
        }
        if (this.f2861w.f3217as != null) {
            return this.f2861w.f3217as[this.team.getId()];
        }
        return this.f2861w.f3214an;
    }

    /* renamed from: h */
    public float m4821h(int i) {
        return this.f2861w.f3264fL[i].f2595aG;
    }

    /* renamed from: i */
    public float m4818i(int i) {
        return this.f2861w.f3264fL[i].f2596aH;
    }

    /* renamed from: e */
    public boolean m4840e() {
        Team team;
        GameEngine gameEngine = GameEngine.getInstance();
        if (m4939bI()) {
            gameEngine.f6113bU.m1312a(this);
        }
        if (this.f1623ck < 1.0f) {
            if (this.f2861w.f2987bx != null && this.f2861w.f2987bx.m4676b()) {
                this.f2861w.f2987bx.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, null);
                return false;
            } else if (this.f2861w.f2988by != null && this.f2861w.f2988by.m4676b()) {
                this.f2861w.f2988by.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, null);
                return false;
            } else {
                m3206a(EnumC0233ab.f1501a);
                return false;
            }
        }
        if (!this.f2861w.f3139fd) {
            setDrawLayer(0);
        }
        if (this.f2861w.f2988by != null && this.f2861w.f2988by.m4676b()) {
            this.f2861w.f2988by.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, null);
        }
        if (this.f2861w.f3229bB != -1) {
            m4998a((Unit) null, this.f6951ek, this.f6952el, this.f2861w.f3229bB, (C0405bf) null, 0);
        }
        if (this.f2861w.f2990bC != null) {
            if (this.f2861w.f2991bD && this.f1578bs != null && this.f1578bs.team != null) {
                team = this.f1578bs.team;
            } else {
                team = this.team;
            }
            if (!team.f1326D) {
                this.f2861w.f2990bC.m5262a(this.f6951ek, this.f6952el, this.height, this.direction, team, this.f1643cE, this);
            }
        }
        this.collidable = false;
        if (!this.f2861w.f3139fd) {
            m4845dq();
        }
        if (this.f2861w.f2977bn) {
            boolean z = false;
            if (this.f2861w.f2981br && gameEngine.m1221N() && gameEngine.networkEngine.f5597aO.f5656i) {
                z = true;
            }
            if (!z) {
                Projectile m4310a = NukeLaucher.m4310a(this, this.f6951ek, this.f6952el, this.f6951ek, this.f6952el);
                m4310a.f1058aH = false;
                m4310a.f1025Z = this.f2861w.f2978bo;
                m4310a.f1024Y = this.f2861w.f2979bp;
            }
        }
        if (this.f2861w.f2976bm != 0) {
            SpreadingFire spreadingFire = new SpreadingFire(false);
            spreadingFire.f6951ek = this.f6951ek;
            spreadingFire.f6952el = this.f6952el;
            spreadingFire.mo3120b(Team.f1369h);
            Team.m6353c(spreadingFire);
        }
        if (this.f2861w.f2989bz != null) {
            this.f2861w.f2989bz.m5270a(this.f6951ek, this.f6952el, 1.0f);
        }
        if (this.f2861w.f3117ey) {
            if (this.f2861w.f2989bz == null) {
                gameEngine.audio.m3004a(AudioEngine.f4056A, 0.8f, this.f6951ek, this.f6952el);
            }
            if (this.f2861w.f2984bu) {
                if (!mo3293i() && !this.f2861w.f3255eE) {
                    C0195l.m6431a(this, 1);
                }
                if (this.f2861w.f2983bt != null) {
                    m3205a(this.f2861w.f2983bt, true);
                } else if (this.f2861w.f2973bj) {
                    m3206a(EnumC0233ab.f1504d);
                }
            }
            if (this.f2861w.f3118ez) {
                for (int i = 0; i < m4916bp(); i++) {
                    gameEngine.effects.m2532d(this.f6951ek, this.f6952el, this.height);
                }
            }
        } else {
            if (this.f2883dQ != null) {
                m4842dy();
                for (int i2 = 0; i2 < this.f2883dQ.length; i2++) {
                    C0394h c0394h = this.f2883dQ[i2];
                    C0384ay c0384ay = this.f2861w.f3220aw[i2];
                    float f = this.f6951ek + c0394h.f2414b;
                    float f2 = this.f6952el + c0394h.f2415c;
                    if (c0384ay.f2308J && !c0384ay.f2280p && (c0384ay.f2281q == null || !c0384ay.f2281q.read(this))) {
                        if (!C1117y.m474d(f, f2) && !this.f2861w.f3255eE) {
                            C0195l.m6434a(f, f2);
                        }
                        gameEngine.effects.m2542b(f, f2, 0.0f);
                    }
                }
            }
            if (!mo3293i()) {
                if (this.f2861w.f2984bu) {
                    if (this.f2861w.f2983bt != null) {
                        m3205a(this.f2861w.f2983bt, true);
                    } else {
                        m3206a(EnumC0233ab.f1502b);
                    }
                }
            } else {
                if (this.f2861w.f2984bu) {
                    if (this.f2861w.f2983bt != null) {
                        m3205a(this.f2861w.f2983bt, false);
                    } else {
                        gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
                    }
                }
                for (int i3 = 0; i3 < m4916bp(); i3++) {
                    gameEngine.effects.m2530e(this.f6951ek, this.f6952el, this.height);
                }
            }
        }
        if (this.f2861w.f3139fd) {
            return true;
        }
        if (this.f2861w.f3213am != null) {
            this.image = this.f2861w.f3213am;
            this.f2839a = 0;
            this.f4227es = true;
            return true;
        }
        return false;
    }

    /* renamed from: bq */
    public void m4915bq() {
        if (!this.f2861w.f3255eE) {
            super.m3088bq();
        }
    }

    /* renamed from: U */
    public void m5015U() {
        float m5040C;
        super.m3231U();
        for (int i = 0; i < this.f2861w.f3264fL.length; i++) {
            C0247ap c0247ap = this.f1648cJ[i];
            GameEngine.PrintLog("Dir was:" + c0247ap.f1711a + " for name:" + this.f2861w.f3264fL[i].f2542a);
            GameEngine.PrintLog("lockDelay:" + c0247ap.f1714d + " shootCooldown:" + c0247ap.f1715e);
            GameEngine.PrintLog("updateAndShouldResetTurret:" + m4954b(i, 0.0f));
            GameEngine.PrintLog("idleDir:" + m5040C(i));
            GameEngine.PrintLog("diffDir:" + CommonUtils.m2292c(c0247ap.f1711a, m5040C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m4983a(C0453l c0453l, boolean z, boolean z2) {
        m4982a(c0453l, z, z2, (AbstractC0377ar[]) null);
    }

    /* renamed from: a */
    public void m4982a(C0453l c0453l, boolean z, boolean z2, AbstractC0377ar[] abstractC0377arArr) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0453l c0453l2 = this.f2861w;
        C0359aq c0359aq = this.f2862x;
        this.f2861w = c0453l;
        this.f1688dx = this.f2861w;
        this.f2862x = c0453l.f3241cG;
        if (z2) {
            C0359aq.m5365a(this, c0359aq, c0453l2);
        } else if (abstractC0377arArr != null) {
            C0359aq.m5364a(this, c0359aq, abstractC0377arArr);
        }
        m5860bR();
        if (!z2) {
            m4815j(true);
        }
        if (!z) {
            if (c0453l.f3264fL.length > 1) {
                boolean z3 = true;
                if (c0453l.f3264fL.length != c0453l2.f3264fL.length) {
                    z3 = false;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= c0453l.f3264fL.length) {
                            break;
                        }
                        if (c0453l.f3264fL[i].f2542a.equalsIgnoreCase(c0453l2.f3264fL[i].f2542a)) {
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    C0247ap[] c0247apArr = new C0247ap[c0453l.f3264fL.length];
                    for (int i2 = 0; i2 < c0453l.f3264fL.length; i2++) {
                        C0411bl c0411bl = c0453l.f3264fL[i2];
                        C0411bl m4731e = c0453l2.m4731e(c0411bl.f2542a);
                        if (m4731e != null) {
                            c0247apArr[c0411bl.f2546e] = this.f1648cJ[m4731e.f2546e];
                            this.f1648cJ[m4731e.f2546e] = null;
                        }
                    }
                    for (int i3 = 0; i3 < c0453l.f3264fL.length; i3++) {
                        if (c0247apArr[i3] == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < c0453l.f3264fL.length) {
                                    if (this.f1648cJ[i4] == null) {
                                        i4++;
                                    } else {
                                        c0247apArr[i3] = this.f1648cJ[i4];
                                        this.f1648cJ[i4] = null;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (c0247apArr[i3] == null) {
                                c0247apArr[i3] = new C0247ap();
                            }
                            c0247apArr[i3].m5748a(this.direction);
                        }
                    }
                    this.f1648cJ = c0247apArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < c0453l.f3264fL.length; i5++) {
                this.f1648cJ[i5].m5748a(this.direction + m5043B(i5));
            }
        }
        if (this.f2861w.f3211ad) {
            m2882V(this.f2861w.f2932ae);
            m2881W(this.f2861w.f2933af);
        } else {
            m2884T(this.f2861w.f2932ae);
            m2883U(this.f2861w.f2933af);
        }
        this.f4227es = false;
        this.radius = this.f2861w.f3045cR;
        this.displayRadius = this.f2861w.f3049cY;
        if (this.isDead) {
            this.f2839a = 0;
        } else {
            this.f2839a = this.f2861w.f2927X;
        }
        this.f2845g = false;
        if (z) {
            this.height += this.f2861w.f3249dM;
        }
        float f = this.f1632ct;
        this.f1632ct = this.f2862x.f2239c;
        if (z) {
            m5762o(this.f1632ct);
        } else if (f == 0.0f) {
            m5762o(this.f1632ct);
        } else {
            m5762o((this.f1631cs / f) * this.f1632ct);
        }
        float f2 = this.f1637cy;
        this.f1637cy = this.f2862x.f2243g;
        if (this.f2861w.f3035cH) {
            if (this.f1634cv > this.f1637cy) {
                this.f1634cv = this.f1637cy;
            }
        } else if (z) {
            this.f1634cv = this.f1637cy;
        } else if (f2 == 0.0f) {
            this.f1634cv = this.f1637cy;
        } else {
            this.f1634cv = (this.f1634cv / f2) * this.f1637cy;
        }
        if (this.f2861w.f3037cJ) {
            if (this.f1638cz > this.f2862x.f2240d) {
                this.f1638cz = this.f2862x.f2240d;
            }
        } else if (z) {
            this.f1638cz = this.f2862x.f2240d * this.f2861w.f3041cN;
        } else if (c0359aq.f2240d == 0.0f) {
            this.f1638cz = this.f2862x.f2240d;
        } else {
            this.f1638cz = (this.f1638cz / c0359aq.f2240d) * this.f2862x.f2240d;
        }
        if (this.team == null) {
            this.image = this.f2861w.f3210ac;
        } else {
            mo4500S();
        }
        if (this.f2861w.f2947aG && z) {
            this.direction = -90.0f;
        }
        m4891c_();
        if (!z && ((this.f1582bw != null || this.f1583bx != null) && (!C0424b.m5202b(this.f2861w.f3015cf, c0453l2.f3015cf) || !C0424b.m5202b(this.f2861w.f3017ch, c0453l2.f3017ch)))) {
            this.f1582bw = null;
            this.f1583bx = null;
        }
        if (!z) {
            boolean z4 = this.f2861w.m4722j() != c0453l2.m4722j();
            if (this.f2861w.m4722j()) {
                this.f1614cb = 0.0f;
                this.f1613ca = 0.0f;
                if (c0453l2.m4722j() && !this.f2861w.f3242cS.equals(c0453l2.f3242cS)) {
                    z4 = true;
                }
            }
            if (z4) {
                gameEngine.f6113bU.m1312a(this);
            }
        }
        this.f2848j = 1.0f;
        if (this.f2861w.f3240cD != -2) {
        }
        if (!this.isDead) {
            m4861dD();
        }
        if (this.f2861w.f3119eA) {
        }
        m4843ds();
        m5785de().m5240a(this.f2861w);
        if (!z) {
            int m4918bl = m4918bl();
            for (int i6 = 0; i6 < m4918bl; i6++) {
                C0247ap c0247ap = this.f1648cJ[i6];
                C0411bl c0411bl2 = this.f2861w.f3264fL[i6];
                if (c0411bl2 != null) {
                    if (c0247ap.f1715e > c0411bl2.f2600m) {
                        c0247ap.f1715e = c0411bl2.f2600m;
                    }
                    if (c0247ap.f1716f > c0411bl2.f2601n) {
                        c0247ap.f1716f = c0411bl2.f2601n;
                    }
                }
            }
        }
        if (!z) {
            if (!this.f2861w.f3048cX) {
                this.f2876dJ.f3495b = null;
            }
            if (this.f2861w.f3137fb != c0453l2.f3137fb) {
                m3172aH();
            }
        }
        if (this.f2861w.f3028cy && this.f2865A.size() == 0) {
            mo3120b(Team.f1370i);
        }
        if (this.f1643cE && !gameEngine.f6111bS.m1982i(this)) {
            gameEngine.f6111bS.m1976l(this);
        }
        if (!z) {
            Object[] m559a = this.f2861w.f3193h.m559a();
            for (int i7 = this.f2861w.f3193h.f6888a - 1; i7 >= 0; i7--) {
                ((AbstractC0387a) m559a[i7]).mo5333a(this, c0453l2);
            }
            if (this.f1623ck >= 1.0f) {
                if (this.f2862x.f2250n > c0359aq.f2250n) {
                    m4908c(false);
                }
            } else {
                if ((this.f2861w.f3053dc != -1 ? this.f2861w.f3053dc : this.f2862x.f2250n) > (c0453l2.f3053dc != -1 ? c0453l2.f3053dc : c0359aq.f2250n)) {
                    m4908c(false);
                }
            }
        }
        if (this.f2847i && this.f2861w.f3063dq != null) {
            this.f2840b.m5166a(this.f2861w.f3063dq, 7, true);
        }
    }

    /* renamed from: c_ */
    public void m4891c_() {
        if (this.f2861w.f2947aG) {
            this.collidable = false;
        } else if (!this.isDead) {
            this.collidable = true;
            if (this.f2861w.f3116ex) {
                this.collidable = false;
            }
        } else {
            this.collidable = false;
        }
        if (this.f1651cM != null) {
            this.collidable = false;
        }
    }

    public C0451j(boolean z, C0453l c0453l) {
        super(z);
        this.f2840b = new C0427e(this);
        this.f2841c = 1.0f;
        this.f2846h = true;
        this.f2847i = true;
        this.f2848j = 1.0f;
        this.f2849k = false;
        this.f2854p = true;
        this.f2865A = new C1101m();
        this.f2866B = null;
        this.f2868D = null;
        this.f2869E = null;
        this.f2876dJ = new C0500k(this);
        this.f2883dQ = null;
        this.f2895ec = new C1101m();
        m4983a(c0453l, true, false);
    }

    /* renamed from: a */
    public void update(float f) {
        float f2;
        C0745e m2533c;
        float a;
        InterfaceC0303as mo7518c;
        float f3;
        float f4;
        float f5;
        C0745e m2541b;
        boolean z = this.f2847i;
        if (z) {
            this.f2847i = false;
            Object[] m559a = this.f2861w.f3193h.m559a();
            for (int i = this.f2861w.f3193h.f6888a - 1; i >= 0; i--) {
                ((AbstractC0387a) m559a[i]).mo5335a(this);
            }
            m4946b(EnumC0347ae.f2171a);
        }
        C0453l c0453l = this.f2861w;
        super.update(f);
        if (this.isDead && !this.f2850l) {
            if (this.height > 0.0f) {
                if (c0453l.f3139fd && !(this.f1616cd == 0.0f && this.f1613ca == 0.0f && this.f1614cb == 0.0f)) {
                    this.f2844f += 0.017f * f;
                    this.height -= this.f2844f * f;
                    PointF n = m3035n(f);
                    this.f6951ek += n.x;
                    this.f6952el += n.y;
                    if (c0453l.f3137fb == EnumC0246ao.f1705d) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        this.f1679do += f;
                        this.f1677dm += f;
                        if (c0453l.f3140fe && this.f1679do > 9.0f) {
                            this.f1679do = CommonUtils.rnd(1.0f, 3.0f);
                            C0745e m2537b = gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
                            if (m2537b != null) {
                                m2537b.f4763aq = 0;
                                m2537b.f4762ap = 0;
                                m2537b.f4786ar = (short) 2;
                                m2537b.f4720s = true;
                                m2537b.f4728F = 0.5f;
                                m2537b.f4746X = 60.0f;
                                m2537b.f4745W = 60.0f;
                                m2537b.f4730H = 0.9f;
                                m2537b.f4729G = 1.2f;
                                m2537b.f4787as = false;
                                m2537b.f4739Q = 0.0f;
                                m2537b.f4740R = 0.0f;
                            }
                        }
                        if (this.f1677dm > 7.0f) {
                            this.f1677dm = 0.0f;
                            C0745e m2537b2 = gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4702a, false, EnumC0748h.f4826a);
                            if (m2537b2 != null) {
                                C0746f.m2511b(m2537b2, true);
                                m2537b2.f4732J = this.f6951ek;
                                m2537b2.f4733K = this.f6952el;
                                m2537b2.f4734L = this.height;
                                m2537b2.f4739Q += CommonUtils.rnd(-0.1f, 0.1f) + this.f1613ca;
                                m2537b2.f4740R += CommonUtils.rnd(-0.1f, 0.1f) + this.f1614cb;
                                m2537b2.f4732J += CommonUtils.rnd(-4.0f, 4.0f);
                                m2537b2.f4733K += CommonUtils.rnd(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f2844f += c0453l.f3252dR * f;
                    this.height -= this.f2844f * f;
                }
            } else if (!this.f2849k) {
                this.f2849k = true;
                if (c0453l.f3139fd) {
                    m4845dq();
                    setDrawLayer(0);
                    if (c0453l.f3213am != null) {
                        this.image = c0453l.f3213am;
                        this.f2839a = 0;
                        this.f4227es = true;
                    } else {
                        m5812ch();
                    }
                }
                if (this.f2844f > 0.5d) {
                    if (c0453l.f2986bw != null && c0453l.f2986bw.m4679a()) {
                        c0453l.f2986bw.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, null);
                    }
                    if (m5837cJ()) {
                        if (c0453l.f2985bv) {
                            m3206a(EnumC0233ab.f1501a);
                        }
                        if (m5838cI()) {
                            GameEngine.getInstance().effects.m2555a(this.f6951ek, this.f6952el, 0.0f, 0, 0.0f, 0.0f, this.direction);
                        }
                    } else if (c0453l.f2985bv) {
                        m3206a(EnumC0233ab.f1502b);
                    }
                }
                this.f2844f = 0.0f;
            } else if (m5837cJ()) {
                if (this.height > -10.0f) {
                    this.f2844f += 8.0E-4f * f;
                    this.height -= this.f2844f * f;
                    if (m5838cI()) {
                        this.f2857s += f;
                        if (this.f2857s > 30.0f) {
                            this.f2857s = 0.0f;
                            if (mo4204p_() && (m2541b = GameEngine.getInstance().effects.m2541b(this.f6951ek, this.f6952el, this.height, this.direction)) != null) {
                                m2541b.f4739Q = 0.0f;
                                m2541b.f4740R = -0.1f;
                            }
                        }
                    }
                } else {
                    this.f2850l = true;
                }
            } else {
                this.height = 0.0f;
                this.f2850l = true;
            }
        }
        if (this.isDead) {
            return;
        }
        GameEngine gameEngine2 = GameEngine.getInstance();
        if (c0453l.f2971bh != 0.0f && this.f1623ck < 1.0f) {
            float f6 = this.f1623ck + (c0453l.f2971bh * f);
            if (f6 >= 1.0f) {
                Team.m6369b((Unit) this);
                this.f1623ck = 1.0f;
                this.f1624cl = 1.0f;
                Team.m6353c(this);
            } else {
                this.f1623ck = f6;
                this.f1624cl = f6;
            }
        }
        if (!isActive()) {
            if (this.f1623ck < 1.0f) {
                if (c0453l.f3064dr != null) {
                    this.f2840b.m5167a(c0453l.f3064dr, 8);
                    this.f2840b.m5169a(f);
                } else if (c0453l.f3065ds != null) {
                    this.f2840b.m5167a(c0453l.f3065ds, 99);
                    this.f2840b.f2721b = this.f1623ck;
                    this.f2840b.f2729d = 0.0f;
                    this.f2840b.m5169a(f);
                }
            }
            Object[] m559a2 = c0453l.f3193h.m559a();
            for (int i2 = c0453l.f3193h.f6888a - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m559a2[i2]).mo5334a(this, f);
            }
            return;
        }
        Object[] m559a3 = c0453l.f3193h.m559a();
        for (int i3 = c0453l.f3193h.f6888a - 1; i3 >= 0; i3--) {
            ((AbstractC0387a) m559a3[i3]).mo5310b(this, f);
        }
        if (this.f2846h) {
            this.f2846h = false;
            m5889a(EnumC0347ae.f2172b);
        }
        if (this.f2862x.f2252p != 0.0f && (this.f1631cs < this.f1632ct || this.f2862x.f2252p < 0.0f)) {
            this.f1631cs += this.f2862x.f2252p * f;
            if (this.f1631cs > this.f1632ct) {
                this.f1631cs = this.f1632ct;
            }
        }
        if (this.f2862x.f2240d != 0.0f) {
            if (!this.f2859u) {
                f5 = c0453l.f3038cK;
            } else {
                f5 = c0453l.f3039cL;
            }
            if (this.f1638cz < this.f2862x.f2240d || f5 < 0.0f) {
                this.f1638cz += f5 * f;
            }
            if (this.f1638cz >= this.f2862x.f2240d) {
                this.f1638cz = this.f2862x.f2240d;
                this.f2859u = false;
            }
            if (this.f1638cz <= 0.0f) {
                if (c0453l.f2974bk) {
                    m4913bv();
                    return;
                }
                this.f1638cz = 0.0f;
            }
        }
        if (this.f1637cy != 0.0f) {
            if (this.f2862x.f2244h != 0.0f) {
                this.f1634cv += this.f2862x.f2244h * f;
                if (this.f1634cv > this.f1637cy) {
                    this.f1634cv = this.f1637cy;
                }
            }
            if (this.f1634cv < 0.0f) {
                this.f1634cv = 0.0f;
            }
            if (this.f1635cw != 0.0f) {
                this.f1635cw -= (this.f1635cw * 0.02f) * f;
                this.f1635cw = CommonUtils.m2367a(this.f1635cw, 0.0f, c0453l.f3044cQ * f);
                if (this.f1635cw > 50.0f) {
                    this.f1635cw = 50.0f;
                }
            }
        }
        this.f2876dJ.m4404a(f);
        C0453l c0453l2 = this.f2861w;
        if (c0453l2.f3146fk) {
            Builder.m4164a(f, this);
        }
        if (!c0453l2.f3235cl.m5209b()) {
            this.f2853o += f;
            if (this.f2853o > c0453l2.f3020co - 0.1f) {
                this.f2853o -= c0453l2.f3020co;
                boolean read = c0453l2.f3022cs.read(this);
                if (this.f2854p != read) {
                    Team.m6389a((Unit) this);
                    this.f2854p = read;
                    Team.m6353c(this);
                }
                if (this.f2854p) {
                    c0453l2.f3235cl.m5186g(this);
                }
            }
        }
        if (this.f1647cI) {
            this.f2840b.m5167a(c0453l2.f3246dn, 3);
        } else if (!this.f2840b.f2730e || this.f2840b.f2720a == c0453l2.f3247do) {
            this.f2840b.m5167a(c0453l2.f3247do, 2);
        }
        if (c0453l2.f2997bL) {
            if (c0453l2.f2995bJ && gameEngine2.f6253dc) {
                if (this.f1616cd > 0.0f || (this.f1616cd < 0.0f && c0453l2.f2996bK)) {
                    this.f2857s += f;
                }
                if (this.f2857s > 10.0f) {
                    this.f2857s = 0.0f;
                    if (this.f6948eh && m5838cI()) {
                        float f7 = this.direction + 180.0f;
                        if (this.f1616cd < 0.0f) {
                            f7 += 180.0f;
                        }
                        float f8 = this.radius - 6.0f;
                        if (f8 < 4.0f) {
                            f8 = 4.0f;
                        }
                        gameEngine2.effects.m2541b(this.f6951ek + (CommonUtils.m2249i(f7) * f8), this.f6952el + (CommonUtils.sin(f7) * f8), 0.0f, f7);
                    }
                }
            }
            if (gameEngine2.f6252db && ((this.f1616cd > 0.0f || this.f1616cd < 0.0f) && this.f6948eh)) {
                this.f2842d += f;
                if (this.f2842d > c0453l2.f3003bR) {
                    this.f2842d = 0.0f;
                    if (this.f1616cd > 0.0f) {
                        if (c0453l2.f3000bO != null) {
                            c0453l2.f3000bO.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, this);
                        }
                    } else if (c0453l2.f3001bP != null) {
                        float f9 = this.direction;
                        if (c0453l2.f3002bQ) {
                            f9 += 180.0f;
                        }
                        c0453l2.f3001bP.m4678a(this.f6951ek, this.f6952el, this.height, f9, this);
                    }
                    if (c0453l2.f2998bM && ((this.f1616cd > 0.0f || c0453l2.f2999bN) && !m5838cI())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f10 = i4 == 0 ? -20 : 20;
                            float f11 = this.direction + 180.0f;
                            if (this.f1616cd < 0.0f) {
                                f10 += 180.0f;
                                f11 += 180.0f;
                            }
                            C0745e m2534c = gameEngine2.effects.m2534c(this.f6951ek + (CommonUtils.m2249i(this.direction + 180.0f + f10) * (this.radius - 1.0f)), this.f6952el + (CommonUtils.sin(this.direction + 180.0f + f10) * (this.radius - 1.0f)), this.height, f11 + CommonUtils.rnd(-7.0f, 7.0f), 0);
                            if (m2534c != null) {
                                m2534c.f4739Q += CommonUtils.rnd(-0.15f, 0.15f);
                                m2534c.f4740R += CommonUtils.rnd(-0.15f, 0.15f);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (c0453l2.f3258eH > 0) {
            if (c0453l2.f3133eT != 0.0f && this.f2865A.f6888a > 0) {
                Object[] m559a4 = this.f2865A.m559a();
                for (int i5 = 0; i5 < this.f2865A.f6888a; i5++) {
                    Unit unit = (Unit) m559a4[i5];
                    if (unit.f1631cs < unit.f1632ct || c0453l2.f3133eT < 0.0f) {
                        unit.f1631cs += c0453l2.f3133eT * f;
                        if (unit.f1631cs > unit.f1632ct) {
                            unit.f1631cs = unit.f1632ct;
                        }
                    }
                }
            }
            if (this.f2852n && c0453l2.f3134eX.read(this)) {
                this.f2851m = CommonUtils.m2368a(this.f2851m, f);
                if (this.f2851m == 0.0f) {
                    this.f2851m = c0453l2.f3123eI;
                    if (this.f2865A.size() == 0) {
                        this.f2852n = false;
                    } else {
                        m4823g(false);
                        if (this.f2865A.size() == 0) {
                            this.f2852n = false;
                        }
                    }
                }
            }
        }
        if (!this.f1647cI) {
            this.f2856r += f;
        } else {
            this.f2856r = 0.0f;
        }
        if (c0453l2.f3137fb != EnumC0246ao.f1705d && this.f1651cM == null) {
            m4861dD();
        }
        if ((c0453l2.f3137fb == EnumC0246ao.f1708g || c0453l2.f3137fb == EnumC0246ao.f1709h) && this.f1647cI) {
            if (m5839cH()) {
                this.f2848j = 0.7f;
            } else {
                this.f2848j = 1.0f;
            }
        }
        if (c0453l2.f3137fb == EnumC0246ao.f1705d) {
            this.f2843e += 2.0f * f;
            if (this.f2843e > 360.0f) {
                this.f2843e -= 360.0f;
            }
            boolean mo3293i = mo3293i();
            boolean z2 = false;
            if (c0453l2.f3083dK) {
                boolean cJ = m5837cJ();
                if (!this.f1647cI && !cJ && this.f2856r > 3.0f && (!c0453l2.f3084dL || m3136aq())) {
                    z2 = true;
                }
            }
            if (this.f1651cM == null) {
                if (z2) {
                    if (c0453l2.f3250dP < 0.0f) {
                        f4 = (CommonUtils.m2294c(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = c0453l2.f3250dP;
                    }
                    this.height = CommonUtils.m2367a(this.height, 2.0f, f4 * f);
                } else {
                    float sin = c0453l2.f3085dN + (CommonUtils.sin(this.f2843e) * c0453l2.f3086dO);
                    if (c0453l2.f3250dP < 0.0f) {
                        f3 = (CommonUtils.m2294c(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = c0453l2.f3250dP;
                    }
                    this.height = CommonUtils.m2367a(this.height, sin, CommonUtils.m2316b(f3, (CommonUtils.m2294c(this.height - sin) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (mo3293i != mo3293i()) {
                    this.f3939ax = true;
                    m4861dD();
                }
            }
        } else {
            float f12 = c0453l2.f3085dN - c0453l2.f3086dO;
            if (this.height < f12) {
                this.height += 0.2f * f;
                if (this.height >= f12) {
                    this.height = f12;
                }
            }
            if ((c0453l2.f3085dN != 0.0f || c0453l2.f3086dO != 0.0f || this.height > 0.0f) && this.f1651cM == null) {
                float f13 = c0453l2.f3085dN;
                if (c0453l2.f3086dO != 0.0f) {
                    this.f2843e += 2.0f * f;
                    if (this.f2843e > 360.0f) {
                        this.f2843e -= 360.0f;
                    }
                    f13 += CommonUtils.sin(this.f2843e) * c0453l2.f3086dO;
                }
                if (c0453l2.f3250dP < 0.0f) {
                    f2 = (CommonUtils.m2294c(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f2 = c0453l2.f3250dP;
                }
                this.height = CommonUtils.m2367a(this.height, f13, CommonUtils.m2316b(f2, (CommonUtils.m2294c(this.height - f13) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z3 = false;
                if (this.height > c0453l2.f3085dN + c0453l2.f3086dO + 1.0f) {
                    this.f2844f += c0453l2.f3251dQ * f;
                    if (this.height < 0.0f) {
                        this.f2844f = CommonUtils.m2316b(this.f2844f, 0.2f);
                    }
                    this.height -= this.f2844f * f;
                    if (this.f2844f > 1.5d) {
                        this.f1679do += f;
                        if (this.f1679do > 0.5d) {
                            this.f1679do = 0.0f;
                            C0745e m2537b3 = gameEngine2.effects.m2537b(this.f6951ek + CommonUtils.rnd(-this.radius, this.radius), this.f6952el + CommonUtils.rnd(-this.radius, this.radius), this.height, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
                            if (m2537b3 != null) {
                                m2537b3.f4763aq = 0;
                                m2537b3.f4762ap = 0;
                                m2537b3.f4786ar = (short) 2;
                                m2537b3.f4720s = true;
                                m2537b3.f4721t = true;
                                m2537b3.f4722u = 40.0f;
                                m2537b3.f4784an = true;
                                m2537b3.f4739Q = 0.1f;
                                m2537b3.f4741S = 0.0f;
                                m2537b3.f4723v = true;
                                m2537b3.f4728F = 0.4f;
                                m2537b3.f4746X = 380.0f;
                                m2537b3.f4745W = m2537b3.f4746X;
                                m2537b3.f4730H = 0.8f;
                                m2537b3.f4729G = 1.7f;
                                m2537b3.f4787as = false;
                                m2537b3.f4739Q += CommonUtils.rnd(-0.04f, 0.04f);
                                m2537b3.f4740R += CommonUtils.rnd(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.height <= c0453l2.f3085dN + c0453l2.f3086dO + 1.0f) {
                        if (this.f2844f > 2.0f) {
                            z3 = true;
                        }
                        if (this.height < c0453l2.f3085dN + c0453l2.f3086dO) {
                            this.height = c0453l2.f3085dN + c0453l2.f3086dO;
                        }
                        this.f2844f = 0.0f;
                    }
                } else {
                    if (this.f2844f > 2.0f) {
                        z3 = true;
                    }
                    this.f2844f = 0.0f;
                }
                if (z3 && (m2533c = gameEngine2.effects.m2533c(this.f6951ek, this.f6952el, this.height, 0)) != null) {
                    m2533c.f4730H = 0.8f;
                    m2533c.f4729G = 1.4f;
                    m2533c.f4745W = 60.0f;
                    m2533c.f4746X = m2533c.f4745W;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (c0453l2.f2970bg) {
            z5 = true;
        }
        if (this.f2863y != null && this.f2863y.f2970bg) {
            z5 = true;
        }
        if (z5) {
            Action m4381d = this.f2876dJ.m4381d();
            boolean z6 = false;
            if (m4381d != null) {
                if (m4381d instanceof C0342g) {
                    C0342g c0342g = (C0342g) m4381d;
                    C0339d c0339d = c0342g.f2148a;
                    boolean z7 = false;
                    z6 = c0342g.m5473L();
                    if (c0339d.f2056k != null && (mo7518c = c0339d.f2056k.mo7518c()) != null && (mo7518c instanceof C0453l)) {
                        z4 = true;
                        if (mo7518c != c0453l2) {
                            if (this.f2863y != null) {
                                Team.m6369b((Unit) this);
                                m4982a(this.f2863y, false, false, this.f2864z);
                                this.f2863y = null;
                                this.f2864z = null;
                                c0453l2 = this.f2861w;
                                Team.m6353c(this);
                            }
                            Team.m6369b((Unit) this);
                            this.f2863y = c0453l2;
                            this.f2864z = c0339d.f2057l;
                            m4982a((C0453l) mo7518c, false, false, c0339d.f2057l);
                            c0453l2 = this.f2861w;
                            Team.m6353c(this);
                        }
                    }
                    if (c0339d.f2083V != null) {
                        float floatValue = c0339d.f2083V.floatValue();
                        if (c0339d.f2086Y) {
                            float f14 = this.f6951ek;
                            float f15 = this.f6952el;
                            C0499j m4387b = this.f2876dJ.m4387b();
                            if (m4387b != null) {
                                float f16 = Float.MIN_VALUE;
                                float f17 = Float.MIN_VALUE;
                                if (m4387b.f3486i != null) {
                                    f16 = m4387b.f3486i.f6951ek;
                                    f17 = m4387b.f3486i.f6952el;
                                } else if (m4387b.f3485h != null) {
                                    f16 = m4387b.f3485h.x;
                                    f17 = m4387b.f3485h.y;
                                }
                                if (f16 > Float.MIN_VALUE) {
                                    floatValue += CommonUtils.m2280d(f14, f15, f16, f17);
                                }
                            }
                        }
                        if (c0339d.f2087Z == null) {
                            a = m3221a(f, floatValue, true, c0339d.f2084W);
                        } else {
                            int i6 = c0339d.f2087Z.f2546e;
                            a = m3224a(f, floatValue, i6);
                            C0247ap c0247ap = this.f1648cJ[i6];
                            c0247ap.m5745b(5);
                            c0247ap.f1712b = c0247ap.f1711a;
                        }
                        if (c0339d.f2085X && CommonUtils.m2294c(a) > 5.0f) {
                            z7 = true;
                        }
                    }
                    if (c0339d.f2082U != null && !z7) {
                        this.f2840b.m5167a(c0339d.f2082U.m4691b(), 10);
                    }
                    if (z7) {
                        this.f2876dJ.f3498e = 0.0f;
                    }
                }
                if (c0453l2.f3066dt != null && m4381d.mo7517i() != null && this.f2876dJ.f3498e >= c0453l2.f3066dt.f2817q) {
                    this.f2840b.m5167a(c0453l2.f3066dt, 5);
                }
            }
            this.f2845g = z6;
            if (this.f2845g) {
                this.f1613ca = 0.0f;
                this.f1614cb = 0.0f;
                this.f1616cd = 0.0f;
            }
        }
        if (this.f2863y != null && !z4) {
            Team.m6369b((Unit) this);
            m4982a(this.f2863y, false, false, this.f2864z);
            this.f2863y = null;
            this.f2864z = null;
            C0453l c0453l3 = this.f2861w;
            Team.m6353c(this);
        }
        this.f2840b.m5169a(f);
        m4956b(f, z);
        C0453l c0453l4 = this.f2861w;
    }

    /* renamed from: cw */
    public float m4873cw() {
        int i = this.f2861w.f3235cl.f2698b;
        if (!this.f2854p) {
            return 0.0f;
        }
        return i * this.f2861w.f3021cp;
    }

    /* renamed from: cx */
    public C0439f m4872cx() {
        if (!this.f2854p) {
            return C0439f.f2800a;
        }
        return this.f2861w.f3236cm;
    }

    /* renamed from: cy */
    public C0439f m4871cy() {
        if (!this.f2854p) {
            return C0439f.f2800a;
        }
        return this.f2861w.f3237cn;
    }

    /* renamed from: a */
    public boolean m5009a(int i, Unit unit, boolean z, boolean z2) {
        return m4987a(this.f2861w.f3264fL[i], i, unit, z, z2);
    }

    /* renamed from: a */
    public final boolean m4988a(C0411bl c0411bl, int i, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, f, f2);
        if (m2366a > c0411bl.f2579ae) {
            if (this.team == gameEngine.f6093bs) {
                gameEngine.f6111bS.m2008b("Location too far");
                return false;
            }
            return false;
        } else if (m2366a < c0411bl.f2619ah) {
            if (this.team == gameEngine.f6093bs) {
                gameEngine.f6111bS.m2008b("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m4987a(C0411bl c0411bl, int i, Unit unit, boolean z, boolean z2) {
        float f;
        if (!z && (c0411bl.f2564I || z2)) {
            float m2366a = CommonUtils.m2366a(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el);
            if (m2366a > c0411bl.f2579ae || m2366a < c0411bl.f2619ah) {
                return false;
            }
        }
        if (!c0411bl.f2563H) {
            return true;
        }
        if (c0411bl.f2620ai != -1.0f) {
            if (c0411bl.f2608w != -1) {
                f = this.f1648cJ[c0411bl.f2608w].f1711a + c0411bl.f2550j;
            } else {
                f = this.direction + c0411bl.f2550j;
            }
            if (CommonUtils.m2294c(CommonUtils.m2292c(f, CommonUtils.m2280d(this.f6951ek, this.f6952el, unit.f6951ek, unit.f6952el), 360.0f)) > c0411bl.f2620ai) {
                return false;
            }
        }
        if (c0411bl.f2569N != null && !c0411bl.f2569N.read(this)) {
            return false;
        }
        if (c0411bl.f2570O != null && !C0448g.m5061a(c0411bl.f2570O, unit.m5787dc())) {
            return false;
        }
        if (c0411bl.f2571P != null && C0448g.m5061a(c0411bl.f2571P, unit.m5787dc())) {
            return false;
        }
        if (unit.mo3293i()) {
            if (c0411bl.f2565J != null) {
                return c0411bl.f2565J.read(this);
            }
            return true;
        } else if (unit.mo3294Q()) {
            if (c0411bl.f2567L != null) {
                return c0411bl.f2567L.read(this);
            }
            return true;
        } else if (c0411bl.f2568M != null && !c0411bl.f2568M.read(this) && !unit.m5840cG()) {
            return false;
        } else {
            if (c0411bl.f2566K != null) {
                return c0411bl.f2566K.read(this);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void m4995a(Unit unit, int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (!c0411bl.f2610B || !m4987a(c0411bl, i, unit, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.f2861w.f3264fL.length; i2++) {
            C0411bl c0411bl2 = this.f2861w.f3264fL[i2];
            if (c0411bl2 != null && i2 != i && c0411bl2.f2583ao != null && c0411bl2.f2583ao == c0411bl && this.f1648cJ[i2].f1715e < 9000.0f - ((m4955b(i) * 0.5f) - c0411bl2.f2601n)) {
                this.f1648cJ[i2].f1715e = 0.0f;
            }
        }
        if (c0411bl.f2608w != -1) {
            C0411bl c0411bl3 = this.f2861w.f3264fL[c0411bl.f2608w];
            if (!c0411bl3.f2610B && c0411bl3.f2603p != 0.0f) {
                this.f1648cJ[c0411bl.f2608w].f1715e = m4955b(c0411bl.f2608w) + m4795t(c0411bl.f2608w);
            }
        }
        this.f2840b.m5166a(this.f2861w.f3248dp, 11, true);
        m4945b(c0411bl);
        m4998a(unit, -1.0f, -1.0f, i, (C0405bf) null, 0);
    }

    /* renamed from: a */
    public boolean m4989a(C0411bl c0411bl) {
        if (c0411bl.f2607u > 0.0f && (c0411bl.f2607u > this.f1638cz || this.f2859u)) {
            return false;
        }
        if (c0411bl.f2554v != null && !c0411bl.f2554v.mo5235b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m4945b(C0411bl c0411bl) {
        if (c0411bl.f2607u > 0.0f) {
            this.f1638cz -= c0411bl.f2607u;
            if (this.f1638cz < c0411bl.f2607u && this.f2861w.f3040cM) {
                this.f2859u = true;
            }
        }
        if (c0411bl.f2554v != null) {
            c0411bl.f2554v.mo5237a(this);
        }
    }

    /* renamed from: a */
    public static Projectile m4994a(Unit unit, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        Projectile createProjectile = Projectile.createProjectile(unit, f, f2, f3, i);
        m5007a(createProjectile, unit, i, c0405bf, f, f2, f3, f4);
        return createProjectile;
    }

    /* renamed from: a */
    public static void m5007a(Projectile projectile, Unit unit, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        C0745e m2548a;
        GameEngine gameEngine = GameEngine.getInstance();
        projectile.f1050az = f4;
        projectile.f1071aT = f4;
        if (unit == null) {
            throw new RuntimeException("Source cannot be null");
        }
        projectile.f980g = c0405bf;
        projectile.f1006G = c0405bf.f1136aI;
        projectile.f1068aR = c0405bf.f1200aJ;
        projectile.directDamage = c0405bf.f1099b;
        projectile.f1024Y = c0405bf.f1100c;
        if (!c0405bf.f1140aN && (unit instanceof C0451j)) {
            C0451j c0451j = (C0451j) unit;
            projectile.directDamage *= c0451j.f2862x.f2242f;
            projectile.f1024Y *= c0451j.f2862x.f2242f;
        }
        projectile.f1025Z = c0405bf.f1152i;
        if (c0405bf.f1155l) {
            projectile.f1026aa = false;
            projectile.f1027ab = true;
        } else {
            projectile.f1026aa = !c0405bf.f1154k;
        }
        projectile.f1028ac = c0405bf.f1157n;
        if (c0405bf.f1156m) {
            projectile.f1029ad = true;
            projectile.f1030ae = false;
        }
        projectile.f1003D = c0405bf.f1159p;
        projectile.f1076aY = c0405bf.f1160q;
        projectile.f1077aZ = c0405bf.f1161r;
        if (c0405bf.f1158o < 0.5d) {
            projectile.f1002C = true;
        } else {
            projectile.f1007H = c0405bf.f1158o;
        }
        projectile.lifeTimer = c0405bf.f1107v;
        projectile.f982i = c0405bf.f1106u;
        projectile.speed = c0405bf.f1164w;
        if (c0405bf.f1139aM != 0.0f) {
            projectile.speed += CommonUtils.m2345a((AbstractC1120w) unit, (int) ((-c0405bf.f1139aM) * 100.0f), (int) (c0405bf.f1139aM * 100.0f), 1) / 100.0f;
        }
        if (c0405bf.f1120T && i != -1) {
            projectile.f1045au = unit;
            if (unit instanceof AbstractC0623y) {
                projectile.f1046av = i;
                C1080ai m3250D = ((AbstractC0623y) unit).m3250D(i);
                projectile.f1047aw = m3250D.f6843a;
                projectile.f1048ax = m3250D.f6844b;
                projectile.f1049ay = unit.height + m3250D.f6845c;
            } else {
                projectile.f1047aw = unit.f6951ek;
                projectile.f1048ax = unit.f6952el;
                projectile.f1049ay = unit.height;
            }
        }
        projectile.f996w = c0405bf.f1112D;
        projectile.f994u = c0405bf.f1113E;
        projectile.f995v = c0405bf.f1114F;
        projectile.f1031af = c0405bf.f1141aO;
        projectile.f1032ag = c0405bf.f1142aP;
        projectile.f1033ah = c0405bf.f1143aQ;
        projectile.f1034ai = c0405bf.f1201aR;
        projectile.f1036ak = c0405bf.f1202aS;
        projectile.f1037al = c0405bf.f1203aT;
        projectile.f1038am = c0405bf.f1204aU;
        projectile.f1039an = c0405bf.f1144aV;
        if (c0405bf.f1205aW > 0.0f) {
            projectile.f1040ao = true;
            projectile.f1022W = c0405bf.f1205aW;
            projectile.f1023X = projectile.f1022W;
        }
        projectile.color = c0405bf.f1196aE;
        if (c0405bf.f1198aG != 0.0f) {
            float f5 = c0405bf.f1199aH;
            int m7284a = Color.m7284a(projectile.color);
            int m7280b = (int) (Color.m7280b(projectile.color) * f5);
            int m7279c = (int) (Color.m7279c(projectile.color) * f5);
            int m7278d = (int) (Color.m7278d(projectile.color) * f5);
            int m6413H = unit.team.m6413H();
            projectile.color = Color.argb(m7284a, CommonUtils.m2310b((int) (m7280b + (Color.m7280b(m6413H) * c0405bf.f1198aG)), 0, 255), CommonUtils.m2310b((int) (m7279c + (Color.m7279c(m6413H) * c0405bf.f1198aG)), 0, 255), CommonUtils.m2310b((int) (m7278d + (Color.m7278d(m6413H) * c0405bf.f1198aG)), 0, 255));
        }
        projectile.f1015P = c0405bf.f1165x;
        projectile.f1017R = c0405bf.f1108y;
        projectile.f1018S = !c0405bf.f1109A;
        projectile.f1016Q = c0405bf.f1166z;
        if (c0405bf.f1110B != null) {
            projectile.f1015P = (short) 0;
            projectile.f1017R = (short) 0;
        }
        projectile.f997x = c0405bf.f1197aF;
        projectile.f986m = c0405bf.f1162s;
        projectile.f1000A = c0405bf.f1167I;
        projectile.f1012M = c0405bf.f1176V;
        projectile.f1001B = c0405bf.f1177W;
        projectile.f1058aH = c0405bf.f1179ae;
        projectile.f1057aG = c0405bf.f1190aw;
        projectile.f1063aM = c0405bf.f1180af;
        if (c0405bf.f1128ai != null) {
            c0405bf.f1128ai.m4678a(projectile.f6951ek, projectile.f6952el, projectile.height, projectile.f1050az, projectile);
        }
        if (c0405bf.f1183ao != -1) {
            boolean z = false;
            C0745e c0745e = projectile.f1066aP;
            if (c0745e != null && c0745e.f4713b == projectile && c0745e.f4715d && c0745e != null) {
                if (c0745e.f4745W < 150.0f) {
                    c0745e.f4745W = 200.0f;
                }
                z = true;
            }
            if (!z && (m2548a = gameEngine.effects.m2548a(projectile, c0405bf.f1183ao, c0405bf.f1184ap)) != null) {
                if (c0405bf.f1133aq) {
                    m2548a.f4714c = true;
                }
                if (c0405bf.f1170L) {
                    projectile.f1066aP = m2548a;
                }
            }
        }
        projectile.f1067aQ = c0405bf.f1185ar;
        if (c0405bf.f1186as != -1.0f) {
            projectile.f1059aI = c0405bf.f1186as;
        }
        if (c0405bf.f1187at != -1.0f) {
            projectile.f1060aJ = c0405bf.f1187at;
        }
        projectile.f1062aL = -1.0f;
        if (c0405bf.f1188au != -1.0f) {
            projectile.f991r = c0405bf.f1188au;
        }
        projectile.f992s = c0405bf.f1189av;
        if (c0405bf.f1147aZ != null) {
        }
        projectile.f1055aE = c0405bf.f1151bd;
        projectile.f6949ei = unit.f6949ei;
        if (projectile.f6949ei < 4 && f3 >= -1.0f) {
            projectile.f6949ei = 4;
        }
        if (c0405bf.f1175U) {
            projectile.f6949ei = 1;
        }
    }

    /* renamed from: a */
    public Projectile m4998a(Unit unit, float f, float f2, int i, C0405bf c0405bf, int i2) {
        C0405bf c0405bf2;
        GameEngine gameEngine = GameEngine.getInstance();
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2589aA != null) {
            this.f2840b.m5166a(c0411bl.f2589aA.m4691b(), 6, true);
        }
        if (c0411bl.f2590aB > 0.0f) {
            m3126b(c0411bl.f2590aB);
        }
        if (c0411bl.f2591aC != null) {
            c0411bl.f2591aC.m4687a(this, new PointF(f, f2), unit, i2 + 1);
        }
        if (c0405bf == null) {
            c0405bf2 = this.f2861w.f3171fM[c0411bl.m5264a(this)];
        } else {
            c0405bf2 = c0405bf;
        }
        PointF m5021K = m5021K(i);
        C1080ai m5037D = m5037D(i);
        if (c0411bl.f2597aI > 0) {
            for (int i3 = 0; i3 < c0411bl.f2597aI; i3++) {
                if (this.f2865A != null && this.f2865A.size() > 0) {
                    Unit unit2 = (Unit) this.f2865A.remove(this.f2865A.size() - 1);
                    C0247ap c0247ap = this.f1648cJ[i];
                    C1117y.m489a(unit2, this);
                    unit2.f6951ek = m5037D.f6843a;
                    unit2.f6952el = m5037D.f6844b;
                    unit2.direction = c0247ap.f1711a;
                    if (unit2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                        abstractC0623y.m3127az();
                        if (unit != null) {
                            abstractC0623y.m3033n(unit);
                        } else {
                            abstractC0623y.m3067e(f, f2);
                        }
                    }
                }
            }
        }
        Projectile projectile = null;
        if (c0405bf2.f1170L && c0405bf == null) {
            if (this.f2870F == null) {
                this.f2870F = new Projectile[31];
            }
            if (this.f2870F[i] != null && !this.f2870F[i].f6946ef) {
                projectile = this.f2870F[i];
                projectile.m6508a(this, m5037D.f6843a, m5037D.f6844b, this.height + m5037D.f6845c);
                if (!c0405bf2.f1172N && projectile.f1041ap != null) {
                    projectile.f1041ap.clear();
                }
            }
        }
        this.f1587bB = (int) (this.f1587bB + 1 + this.f6945ed);
        float f3 = this.f1648cJ[i].f1711a;
        boolean z = false;
        if (projectile == null) {
            projectile = Projectile.createProjectile(this, m5037D.f6843a, m5037D.f6844b, this.height + m5037D.f6845c, i);
            if (c0405bf2.f1170L && c0405bf == null) {
                this.f2870F[i] = projectile;
            }
        } else {
            projectile.f980g = c0405bf2;
            z = true;
        }
        m5007a(projectile, this, i, c0405bf2, m5037D.f6843a, m5037D.f6844b, this.height + m5037D.f6845c, f3);
        c0405bf2.m5282a(this, projectile, unit, f, f2, m4810m());
        if (!z && c0405bf2.f1118R == 0.0f && c0405bf2.f1119S == 0.0f) {
            projectile.x = m5021K.x;
            projectile.y = m5021K.y;
        }
        if (c0411bl.f2562G != null) {
            gameEngine.effects.emitLight(m5037D.f6843a, m5037D.f6844b, this.height + m5037D.f6845c, c0411bl.f2562G.intValue());
        }
        if (c0411bl.f2560E != null) {
            c0411bl.f2560E.m4678a(m5037D.f6843a, m5037D.f6844b, this.height + m5037D.f6845c, this.f1648cJ[i].f1711a, this);
        }
        if (c0411bl.f2559D != null) {
            c0411bl.f2559D.m5270a(m5037D.f6843a, m5037D.f6844b, 1.0f + CommonUtils.rnd(-0.07f, 0.07f));
        }
        if (this.f2861w.f3096eb) {
            this.f3891Q = null;
        }
        if (c0411bl.f2587ay) {
            this.f1648cJ[i].f1720j = null;
        }
        if (this.f2861w.f2973bj && !this.isDead) {
            m4913bv();
        }
        if (this.f2861w.f2975bl && !this.isDead) {
            mo2880a();
            this.isDead = true;
        }
        return projectile;
    }

    /* renamed from: m */
    public float m4810m() {
        return this.f2862x.f2245i;
    }

    /* renamed from: y */
    public int m4785y() {
        if (this.f2862x.f2251o != -1) {
            return this.f2862x.f2251o;
        }
        return super.mo3492y();
    }

    /* renamed from: u */
    public int m4793u(Unit unit) {
        int mo5715a = unit.getUnitType().mo5715a(this);
        if (this.f2861w.f3225aW != -1) {
            if (this.f2861w.f2963aX) {
                int i = (int) (this.f2861w.f3225aW + this.radius);
                if (unit != null) {
                    i = (int) (i + unit.radius);
                }
                return i + mo5715a;
            }
            return this.f2861w.f3225aW + mo5715a;
        }
        return m4785y() + mo5715a;
    }

    /* renamed from: v */
    public int m4790v(Unit unit) {
        int mo5715a = unit.getUnitType().mo5715a(this);
        if (this.f2861w.f3226aY != -1) {
            if (this.f2861w.f2964aZ) {
                int i = (int) (this.f2861w.f3226aY + this.radius);
                if (unit != null) {
                    i = (int) (i + unit.radius);
                }
                return i + mo5715a;
            }
            return this.f2861w.f3226aY + mo5715a;
        }
        return m4785y() + mo5715a;
    }

    /* renamed from: w */
    public boolean m4788w(Unit unit) {
        return this.f2861w.f2964aZ;
    }

    /* renamed from: x */
    public boolean m4786x(Unit unit) {
        return this.f2861w.f2963aX;
    }

    /* renamed from: cv */
    public float m4874cv() {
        return this.f2861w.f2969bf;
    }

    /* renamed from: c */
    public float m4909c(Unit unit) {
        return this.f2861w.f2965ba;
    }

    /* renamed from: z */
    public float m4781z(Unit unit) {
        float f = this.f2861w.f2966bb;
        if (unit.mo4209g() > 0.0f) {
            f = unit.mo4209g() * this.f2861w.f3227bc;
        }
        return f;
    }

    /* renamed from: f */
    public float m4827f(Unit unit) {
        return this.f2861w.f2967bd;
    }

    /* renamed from: b */
    public float m4950b(Unit unit) {
        return this.f2861w.f2968be;
    }

    /* renamed from: z */
    public float m4783z() {
        return this.f2862x.f2246j * this.f2848j;
    }

    /* renamed from: aZ */
    public float m4969aZ() {
        return this.f2861w.f3099ee;
    }

    /* renamed from: ba */
    public float m4926ba() {
        return this.f2861w.f3100ef;
    }

    /* renamed from: A */
    public float m5046A() {
        return this.f2862x.f2247k;
    }

    /* renamed from: c */
    public float m4910c(int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2573U != null) {
            return c0411bl.f2573U.floatValue();
        }
        return this.f2861w.f3091dW;
    }

    /* renamed from: x */
    public float m4787x(int i) {
        return this.f2861w.f3264fL[i].f2611Q;
    }

    /* renamed from: w */
    public float m4789w(int i) {
        return this.f2861w.f3264fL[i].f2614V;
    }

    /* renamed from: y */
    public float m4784y(int i) {
        return this.f2861w.f3264fL[i].f2615W;
    }

    /* renamed from: B */
    public float m5044B() {
        return this.f2861w.f3102ej;
    }

    /* renamed from: cC */
    public float m4907cC() {
        return this.f2861w.f3230bH * this.f2841c;
    }

    /* renamed from: p */
    public float m4805p(int i) {
        return this.f2861w.f3231bI;
    }

    /* renamed from: d */
    public float m4865d(boolean z) {
        if (!this.f2861w.f3069dw) {
            return 0.0f;
        }
        if (z && this.f2861w.f3071dy) {
            return this.f1648cJ[this.f2861w.f3073dA.f2546e].f1711a + 90.0f;
        }
        if (this.f2861w.f3070dx) {
            return this.f1648cJ[this.f2861w.f3073dA.f2546e].f1711a + 90.0f;
        }
        return super.mo3996d(z);
    }

    static {
        for (int i = 0; i < 10; i++) {
            f2886dT.add(new C0452k());
        }
        f2887dU = true;
        f2888dV = new HashMap();
        f2889dW = 0;
        f2890dX = VariableScope.nullOrMissingString;
        f2891dY = new PointF();
        f2893ea = new C1080ai();
        f2894eb = new PointF();
    }

    /* renamed from: cW */
    public PointF m4895cW() {
        PointF pointF = f2871G;
        C0453l c0453l = this.f2861w;
        if (c0453l.f3070dx && this.f1648cJ[c0453l.f3073dA.f2546e].f1715e != 0.0f && c0453l.f3073dA.f2603p != 0.0f) {
            pointF.m7212a(m5029G(c0453l.f3073dA.f2546e));
            pointF.m7211b(-this.f6951ek, -this.f6952el);
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        return pointF;
    }

    /* renamed from: aP */
    public PointF m4975aP() {
        PointF m4895cW = m4895cW();
        f2872H.m7213a(m4895cW.x + this.f2861w.f3033cE, m4895cW.y + this.f2861w.f3034cF);
        return f2872H;
    }

    /* renamed from: c */
    public boolean draw(float f) {
        BitmapOrTexture m5016T;
        float f2;
        float f3;
        C0453l c0453l = this.f2861w;
        boolean z = this.isDead;
        if (this.f2883dQ != null && !z) {
            C0393g.m5315a(this, f, false, false);
        }
        GameEngine gameEngine = GameEngine.getInstance();
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        Paint m4976aN = m4976aN();
        float m4907cC = m4907cC();
        PointF m4895cW = m4895cW();
        mo5654aQ();
        int i = c0453l.f3194i.f6888a;
        if (i > 0) {
            Object[] m559a = c0453l.f3194i.m559a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m559a[i2]).mo5329d(this, f);
            }
        }
        if (this.f4227es) {
            float f4 = (this.f6951ek + m4895cW.x) - gameEngine.f6138cv;
            float f5 = ((this.f6952el + m4895cW.y) - gameEngine.f6139cw) - this.height;
            if (m4907cC != 1.0f) {
                interfaceC1027y.mo878k();
                interfaceC1027y.mo933a(m4907cC, m4907cC, f4, f5);
            }
            interfaceC1027y.mo916a(this.image, f4, f5, m4865d(false) - 90.0f, m4976aN);
            if (m4907cC != 1.0f) {
                interfaceC1027y.mo877l();
            }
        } else {
            RectF m4906cE = m4906cE();
            float f6 = m4895cW.x;
            float f7 = m4895cW.y - this.height;
            m4906cE.f234a += f6;
            m4906cE.f235b += f7;
            m4906cE.f236c += f6;
            m4906cE.f237d += f7;
            Rect m4967a_ = m4967a_(false);
            float f8 = (m4906cE.f234a + m4906cE.f236c) * 0.5f;
            float f9 = (m4906cE.f235b + m4906cE.f237d) * 0.5f;
            interfaceC1027y.mo878k();
            if (m4907cC != 1.0f) {
                interfaceC1027y.mo933a(m4907cC, m4907cC, f8, f9);
            }
            interfaceC1027y.mo934a(m4865d(false), f8, f9);
            interfaceC1027y.mo909a(this.image, m4967a_, m4906cE, m4976aN);
            interfaceC1027y.mo877l();
        }
        if (i > 0) {
            Object[] m559a2 = c0453l.f3194i.m559a();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((AbstractC0387a) m559a2[i3]).mo5328e(this, f);
            }
        }
        C1117y.m487a((AbstractC0623y) this);
        if (this.f2883dQ != null && !z && c0453l.f3221ax) {
            C0393g.m5315a(this, f, true, false);
        }
        if (m4960ak() && c0453l.f3268fQ != null && !z) {
            float m4838e = this.f1648cJ[c0453l.f3268fQ.f2546e].f1716f / m4838e(c0453l.f3268fQ.f2546e);
            if (m4838e != 0.0f) {
                boolean z2 = true;
                boolean Y = m3227Y();
                if (Y && c0453l.f3008bW) {
                    z2 = false;
                } else if (!Y && c0453l.f3004bS) {
                    z2 = false;
                }
                if (z2 && c0453l.f3264fL[c0453l.f3268fQ.f2546e].f2594aF == null) {
                    C1080ai bn = m3091bn();
                    gameEngine.graphics.mo878k();
                    gameEngine.graphics.mo896b(bn.f6843a - gameEngine.f6138cv, ((bn.f6844b - bn.f6845c) - gameEngine.f6139cw) - this.height);
                    gameEngine.graphics.mo935a(m4838e, m4838e);
                    if (Y) {
                        gameEngine.graphics.mo915a(Builder.f3586f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        gameEngine.graphics.mo915a(Builder.f3585e, 0.0f, 0.0f, (Paint) null);
                    }
                    gameEngine.graphics.mo877l();
                }
            }
        }
        if (c0453l.f3170fK && !z) {
            int m4918bl = m4918bl();
            for (int i4 = 0; i4 < m4918bl; i4++) {
                float m4838e2 = this.f1648cJ[i4].f1716f / m4838e(i4);
                C0411bl c0411bl = c0453l.f3264fL[i4];
                if (c0411bl != null && m4838e2 != 0.0f && c0411bl.f2594aF != null) {
                    C1117y.m485a(this, c0411bl.f2594aF, m4838e2, i4);
                }
            }
        }
        if (!z && this.f1634cv > 0.0f && this.f1636cx == 0.0f && (m5016T = m5016T()) != null) {
            if (!c0453l.f3043cP) {
                f2 = 0.0f + 0.09f + ((this.f1634cv / this.f1637cy) * 0.4f) + ((CommonUtils.m2316b(this.f1635cw, 50.0f) / 50.0f) * 0.5f);
            } else {
                float m2316b = 0.0f + ((CommonUtils.m2316b(this.f1635cw, 50.0f) / 50.0f) * 0.5f);
                float f10 = this.f1635cw;
                if (f10 > 5.0f) {
                    f10 = 5.0f;
                }
                f2 = m2316b + ((f10 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.f2873I == null) {
                    this.f2873I = C1117y.m505a();
                }
                Paint paint = this.f2873I;
                paint.m7267a((int) (f2 * 255.0f), 255, 255, 255);
                float f11 = this.f6951ek - gameEngine.f6138cv;
                float f12 = (this.f6952el - gameEngine.f6139cw) - this.height;
                if (!c0453l.f3219au) {
                    f3 = ((c0453l.f3051da * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((c0453l.f3051da * 2) / m5016T.f6396p) * 1.25f;
                }
                gameEngine.graphics.mo878k();
                gameEngine.graphics.mo933a(f3, f3, f11, f12);
                gameEngine.graphics.mo916a(m5016T, f11, f12, m4865d(false) - 90.0f, paint);
                gameEngine.graphics.mo877l();
            }
        }
        if (i > 0) {
            Object[] m559a3 = c0453l.f3194i.m559a();
            for (int i5 = i - 1; i5 >= 0; i5--) {
                ((AbstractC0387a) m559a3[i5]).mo5330c(this, f);
            }
            return true;
        }
        return true;
    }

    /* renamed from: T */
    public BitmapOrTexture m5016T() {
        return this.f2861w.f3218at;
    }

    /* renamed from: C */
    public float m5041C() {
        return this.f2861w.f3080dH;
    }

    /* renamed from: D */
    public float m5038D() {
        return this.f2861w.f3081dI;
    }

    /* renamed from: bi */
    public boolean m4920bi() {
        return this.f2861w.f3087dS;
    }

    /* renamed from: bj */
    public boolean m4919bj() {
        return this.f2861w.f3088dT;
    }

    /* renamed from: l */
    public boolean m4812l() {
        return this.f2861w.f3103ek;
    }

    /* renamed from: ag */
    public boolean m4963ag() {
        return this.f2861w.f3105em.read(this);
    }

    /* renamed from: af */
    public boolean m4964af() {
        return this.f2861w.f3104el.read(this);
    }

    /* renamed from: ae */
    public boolean m4965ae() {
        return this.f2861w.f3106en.read(this);
    }

    /* renamed from: ah */
    public boolean m4962ah() {
        if (this.f2861w.f3107eo == null) {
            return true;
        }
        return this.f2861w.f3107eo.read(this);
    }

    /* renamed from: k */
    public boolean m4813k(Unit unit) {
        C0453l c0453l = this.f2861w;
        if (c0453l.f3108ep) {
            if (c0453l.f3109eq != null && !C0448g.m5061a(c0453l.f3109eq, unit.m5787dc())) {
                return false;
            }
            if (c0453l.f3110er != null && C0448g.m5061a(c0453l.f3110er, unit.m5787dc())) {
                return false;
            }
            if (c0453l.f3111es) {
                boolean z = false;
                for (int i = 0; i < c0453l.f3264fL.length; i++) {
                    C0411bl c0411bl = c0453l.f3264fL[i];
                    if ((c0411bl.f2571P == null || !C0448g.m5061a(c0411bl.f2571P, unit.m5787dc())) && (c0411bl.f2570O == null || C0448g.m5061a(c0411bl.f2570O, unit.m5787dc()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (unit.mo3293i()) {
            return m4964af();
        }
        if (unit.mo3294Q()) {
            return m4965ae();
        }
        if (!m4962ah() && !unit.m5840cG()) {
            return false;
        }
        return m4963ag();
    }

    /* renamed from: E */
    public boolean m5035E() {
        return this.f2861w.f3112et;
    }

    /* renamed from: g */
    public float m4825g(int i) {
        return this.f2861w.f3264fL[i].f2574X;
    }

    /* renamed from: z */
    public float m4782z(int i) {
        return this.f2861w.f3264fL[i].f2617ab;
    }

    /* renamed from: A */
    public float m5045A(int i) {
        return this.f2861w.f3264fL[i].f2619ah;
    }

    /* renamed from: B */
    public float m5043B(int i) {
        return this.f2861w.f3264fL[i].f2550j;
    }

    /* renamed from: C */
    public float m5040C(int i) {
        float f;
        float f2;
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2608w != -1) {
            f = this.f1648cJ[c0411bl.f2608w].f1711a;
        } else {
            f = this.direction;
        }
        if (this.f1619cg && m4925bc() > 0.95d) {
            f2 = f + c0411bl.f2551k;
        } else {
            f2 = f + c0411bl.f2550j;
        }
        if (c0411bl.f2626ar != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    /* renamed from: bm */
    public boolean m4917bm() {
        return this.f2861w.f3078dF;
    }

    /* renamed from: q */
    public float m4803q(int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (!c0411bl.f2610B) {
            return 0.0f;
        }
        C0405bf c0405bf = this.f2861w.f3171fM[c0411bl.m5264a(this)];
        float f = 0.0f;
        if (!c0405bf.f1162s) {
            f = 0.0f + c0405bf.f1099b;
        }
        float f2 = f + c0405bf.f1100c;
        if (!c0405bf.f1140aN) {
            f2 *= this.f2862x.f2242f;
        }
        return f2;
    }

    /* renamed from: b */
    public float m4955b(int i) {
        return this.f2861w.f3264fL[i].f2600m * this.f2862x.f2241e;
    }

    /* renamed from: e */
    public float m4838e(int i) {
        return this.f2861w.f3264fL[i].f2601n;
    }

    /* renamed from: f */
    public float m4829f(int i) {
        return this.f2861w.f3264fL[i].f2602o;
    }

    /* renamed from: s */
    public boolean m4798s(int i) {
        return this.f2861w.f3264fL[i].f2606s;
    }

    /* renamed from: t */
    public float m4795t(int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2553t == 0.0f || c0411bl.f2601n == 0.0f) {
            return 0.0f;
        }
        return -(c0411bl.f2553t * (this.f1648cJ[i].f1716f / c0411bl.f2601n));
    }

    /* renamed from: r */
    public boolean m4801r(int i) {
        if (this.f2861w.f3264fL[i].f2610B) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m4948b(Unit unit, int i) {
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2561F != null) {
            PointF m5034E = m5034E(i);
            c0411bl.f2561F.m4678a(m5034E.x, m5034E.y, this.height, this.f1648cJ[i].f1711a, this);
        }
    }

    /* renamed from: u */
    public boolean m4794u(int i) {
        if (!m4989a(this.f2861w.f3264fL[i])) {
            return false;
        }
        return super.m3020u(i);
    }

    /* renamed from: s */
    public int m4797s(Unit unit) {
        return this.f2861w.f3115ew;
    }

    /* renamed from: bO */
    public boolean m4936bO() {
        return this.f2861w.f3117ey;
    }

    /* renamed from: bP */
    public boolean m4935bP() {
        return this.f2861w.f3118ez;
    }

    /* renamed from: bN */
    public float m4937bN() {
        return this.f2862x.f2238b;
    }

    /* renamed from: cF */
    public boolean m4905cF() {
        return this.f2861w.f2939ap;
    }

    /* renamed from: a_ */
    public Rect m4967a_(boolean z) {
        float f;
        if (z && !this.f2861w.f2939ap) {
            return super.m5876a_(z);
        }
        if (this.isDead) {
            return super.m5876a_(z);
        }
        C0453l c0453l = this.f2861w;
        int i = this.f2839a;
        int i2 = 0;
        C0455m c0455m = c0453l.f3075dC;
        if (this.f2840b.f2720a != null && this.f2840b.f2720a.f2814k != null) {
            c0455m = this.f2840b.f2720a.f2814k;
        }
        if (c0455m != null) {
            float f2 = c0455m.f3307b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.direction;
                if (c0455m.f3306a) {
                    f = -this.f1648cJ[c0453l.f3073dA.f2546e].f1711a;
                }
            } else {
                f = this.direction;
                if (c0455m.f3306a) {
                    f = this.f1648cJ[c0453l.f3073dA.f2546e].f1711a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - c0455m.f3310e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (c0455m.f3308c > 0) {
                i += i4 * c0455m.f3308c;
            }
            if (c0455m.f3309d > 0) {
                i2 = 0 + (i4 * c0455m.f3309d);
            }
        }
        if (i >= c0453l.f3207U) {
            i2 += i / c0453l.f3207U;
            i %= c0453l.f3207U;
        }
        return super.m5879a(z, i, i2);
    }

    /* renamed from: cE */
    public RectF m4906cE() {
        RectF cE = super.mo4492cE();
        if (this.f2861w.f2937aj) {
            cE.m7196a(this.f2861w.f2934ag, this.f2861w.f2935ah - this.f2861w.f2936ai);
        }
        return cE;
    }

    /* renamed from: bl */
    public int m4918bl() {
        if (this.f2861w == null) {
            return 1;
        }
        return this.f2861w.f3264fL.length;
    }

    /* renamed from: v */
    public int m4791v(int i) {
        return this.f2861w.f3264fL[i].f2609x;
    }

    /* renamed from: F */
    public C1080ai m5031F(int i) {
        return m5008a(i, false);
    }

    /* renamed from: G */
    public PointF m5029G(int i) {
        C1080ai m5008a = m5008a(i, false);
        f2874J.x = m5008a.f6843a;
        f2874J.y = m5008a.f6844b;
        return f2874J;
    }

    /* renamed from: a */
    public C1080ai m5008a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2608w == -1) {
            f = this.f6951ek;
            f2 = this.f6952el;
            f3 = 0.0f;
            f4 = this.direction;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            C1080ai m5008a = m5008a(c0411bl.f2608w, true);
            f = m5008a.f6843a;
            f2 = m5008a.f6844b;
            f3 = m5008a.f6845c;
            f4 = this.f1648cJ[c0411bl.f2608w].f1711a;
        }
        if (this.f1648cJ[i].f1715e > 0.0f && c0411bl.f2603p != 0.0f) {
            float f5 = 0.0f;
            float m4955b = (m4955b(i) + m4795t(i)) - this.f1648cJ[i].f1715e;
            if (m4955b < c0411bl.f2604q) {
                f5 = (m4955b / c0411bl.f2604q) * c0411bl.f2603p;
            } else if (m4955b < c0411bl.f2604q + c0411bl.f2605r) {
                f5 = c0411bl.f2603p - (((m4955b - c0411bl.f2604q) / c0411bl.f2605r) * c0411bl.f2603p);
            }
            if (f5 != 0.0f) {
                f += CommonUtils.m2249i(this.f1648cJ[i].f1711a) * f5;
                f2 += CommonUtils.sin(this.f1648cJ[i].f1711a) * f5;
            }
        }
        float f6 = c0411bl.f2547f;
        float f7 = c0411bl.f2548g;
        float f8 = c0411bl.f2549h;
        if (f6 != 0.0f || f7 != 0.0f) {
            float sin = CommonUtils.sin(f4);
            float m2249i = CommonUtils.m2249i(f4);
            f += (m2249i * f7) - (sin * f6);
            f2 += ((sin * f7) + (m2249i * f6)) * c0411bl.f2599i;
        }
        f2875dI.f6843a = f;
        f2875dI.f6844b = f2;
        f2875dI.f6845c = f3 + f8;
        return f2875dI;
    }

    /* renamed from: N */
    public ArrayList m5017N() {
        if (this.f2863y != null) {
            return this.f2863y.m4773a(m5014V());
        }
        return this.f2861w.m4773a(m5014V());
    }

    /* renamed from: a */
    public Action m5006a(C0208c c0208c) {
        C0453l c0453l;
        if (this.f2863y != null) {
            c0453l = this.f2863y;
        } else {
            c0453l = this.f2861w;
        }
        return c0453l.m4772a(c0208c);
    }

    /* renamed from: V */
    public int m5014V() {
        return this.f2861w.f3018cj;
    }

    /* renamed from: e */
    public Action m4834e(InterfaceC0303as interfaceC0303as) {
        return this.f2876dJ.m4385b(interfaceC0303as);
    }

    /* renamed from: a */
    public void m5001a(Action action, boolean z, PointF pointF, Unit unit) {
        if (action == Hovercraft.f3639i) {
            if (!z) {
                m5020L();
            } else {
                m5018M();
            }
        } else if (action == Hovercraft.f3640j) {
            if (!z) {
                m5018M();
            }
        } else {
            if (!z) {
                if (pointF != null && !m5004a(action, pointF.x, pointF.y)) {
                    return;
                }
                if (action instanceof C0342g) {
                    C0342g c0342g = (C0342g) action;
                    if (c0342g.f2148a.f2107au != null) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        if (this.team == gameEngine.f6093bs && !gameEngine.m1227H()) {
                            c0342g.f2148a.f2107au.m5272a();
                        }
                    }
                    if (c0342g.f2148a.f2103aq != null) {
                        c0342g.f2148a.f2103aq.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, this);
                    }
                }
            }
            if (z && (action instanceof C0342g) && !((C0342g) action).f2148a.f2125L) {
                return;
            }
            C0499j m4399a = this.f2876dJ.m4399a(action, z, pointF, unit);
            if (!z) {
                if (m4399a != null) {
                    m4991a(EnumC0347ae.f2176f, (Unit) null, action.m6093P(), (VariableScope) null);
                }
            } else if (m4399a != null) {
                m4991a(EnumC0347ae.f2177g, (Unit) null, action.m6093P(), (VariableScope) null);
            }
        }
    }

    /* renamed from: a */
    public void m5002a(Action action, boolean z) {
        m5001a(action, z, (PointF) null, (Unit) null);
    }

    /* renamed from: b */
    public void m4951b(Action action, boolean z) {
        this.f2876dJ.m4400a(action, z);
    }

    /* renamed from: b */
    public void m4953b(Action action) {
        this.f2876dJ.m4401a(action);
    }

    /* renamed from: a */
    public boolean m5004a(Action action, float f, float f2) {
        if (action instanceof C0342g) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0342g c0342g = (C0342g) action;
            if (c0342g.f2148a.f2092af != null && c0342g.f2148a.f2093ag == null) {
                if (c0342g.f2148a.f2092af.intValue() >= this.f2861w.f3264fL.length) {
                    m3183a("checkTargetedActionOrder: " + c0342g.f2148a.f2092af + " larger than max turret size");
                    return true;
                } else if (!m4988a(this.f2861w.f3264fL[c0342g.f2148a.f2092af.intValue()], c0342g.f2148a.f2092af.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (c0342g.f2148a.f2097ak != null && C1117y.m501a(f, f2, c0342g.f2148a.f2097ak)) {
                        if (this.team == gameEngine.f6093bs) {
                            gameEngine.f6111bS.m2008b("Invalid map location (Must be passable by " + c0342g.f2148a.f2097ak.name() + ")");
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m5005a(Action action) {
        Action m5006a;
        if ((action instanceof C0342g) && (m5006a = m5006a(action.m6095N())) != null) {
            C0342g c0342g = (C0342g) m5006a;
            Integer num = c0342g.f2148a.f2092af;
            if (num != null && c0342g.f2148a.f2093ag == null && num.intValue() < this.f2861w.f3264fL.length) {
                C0411bl c0411bl = this.f2861w.f3264fL[num.intValue()];
                if (c0411bl.f2618ag > 0.0f) {
                    C1117y.m477b((Unit) this, c0411bl.f2618ag, true);
                }
                C1117y.m490a((Unit) this, c0411bl.f2578ad, true, true);
            }
        }
        super.m3208a(action);
    }

    /* renamed from: a */
    public boolean m5003a(Action action, PointF pointF, Unit unit, int i) {
        PointF pointF2 = null;
        Unit unit2 = null;
        if (i > 0) {
            pointF2 = f2877dK;
            unit2 = f2878dL;
        }
        f2877dK = pointF;
        f2878dL = unit;
        boolean m4952b = m4952b(action, pointF, unit, i);
        f2877dK = pointF2;
        f2878dL = unit2;
        return m4952b;
    }

    /* renamed from: b */
    public boolean m4952b(Action action, PointF pointF, Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (i > 10) {
            return false;
        }
        action.m6086a(this, unit);
        if (action instanceof C0342g) {
            C0342g c0342g = (C0342g) action;
            C0339d c0339d = c0342g.f2148a;
            if (c0339d.f2063s != null && !c0339d.f2063s.read(this)) {
                return true;
            }
            boolean z = false;
            if (c0339d.f2089ac != null) {
                this.f1638cz += c0342g.f2148a.f2089ac.floatValue();
                z = true;
            }
            if (c0339d.f2090ad != null) {
                c0339d.f2090ad.m5185h(this);
                z = true;
            }
            if (c0339d.f2091ae != null) {
                c0339d.f2091ae.m5225a((Unit) this, this.team.m6418C(), true);
                z = true;
            }
            if (c0339d.f2116aE != null) {
                if (c0339d.f2116aE.read(this)) {
                    this.f1585bz = gameEngine.f6096by;
                }
                z = true;
            }
            if (c0339d.f2092af != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < c0339d.f2096aj; i2++) {
                    if (c0339d.f2093ag != null) {
                        pointF2 = new PointF();
                        if (c0339d.f2094ah == null) {
                            pointF2.m7213a(this.f6951ek, this.f6952el);
                        } else {
                            Unit readUnit = c0339d.f2094ah.readUnit(this);
                            if (readUnit != null) {
                                pointF2.m7213a(readUnit.f6951ek, readUnit.f6952el);
                            } else {
                                pointF2.m7213a(this.f6951ek, this.f6952el);
                            }
                        }
                        float m2249i = CommonUtils.m2249i(this.direction);
                        float sin = CommonUtils.sin(this.direction);
                        float f = c0339d.f2093ag.x;
                        float f2 = c0339d.f2093ag.y;
                        pointF2.m7211b((m2249i * f2) - (sin * f), (sin * f2) + (m2249i * f));
                    }
                    if (pointF2 == null) {
                        C0831ad.m1648g("completeQueueItem:" + c0342g.m6095N() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        m4998a((Unit) null, pointF2.x, pointF2.y, c0342g.f2148a.f2092af.intValue(), c0342g.f2148a.f2095ai, i);
                    }
                }
                z = true;
            }
            if (c0339d.f2102ap != null) {
                c0339d.f2102ap.m4678a(this.f6951ek, this.f6952el, this.height, this.direction, this);
                z = true;
            }
            if (c0339d.f2104ar != null) {
                c0339d.f2104ar.m5270a(this.f6951ek, this.f6952el, 1.0f);
                z = true;
            }
            if (c0339d.f2105as != null && !gameEngine.m1227H()) {
                c0339d.f2105as.m5272a();
                z = true;
            }
            if (c0339d.f2106at != null) {
                if (this.team == gameEngine.f6093bs && !gameEngine.m1227H()) {
                    c0339d.f2106at.m5272a();
                }
                z = true;
            }
            if (c0339d.f2132ab.f6888a > 0) {
                Object[] m559a = c0339d.f2132ab.m559a();
                for (int i3 = 0; i3 < c0339d.f2132ab.f6888a; i3++) {
                    if (((AbstractC0321a) m559a[i3]).mo5529a(this, action, pointF, unit, i)) {
                        z = true;
                    }
                }
            }
            PointF pointF3 = pointF;
            Unit unit2 = unit;
            if ((c0339d.f2100an != null || c0342g.f2148a.f2101ao != null) && c0339d.f2098al != null) {
                unit2 = c0339d.f2098al.readUnit(this);
                pointF3 = new PointF();
                if (unit2 != null) {
                    pointF3.x = unit2.f6951ek;
                    pointF3.y = unit2.f6952el;
                } else {
                    pointF3.x = this.f6951ek;
                    pointF3.y = this.f6952el;
                }
            }
            if (c0339d.f2100an != null) {
                if (c0339d.f2099am == null || c0339d.f2099am.read(this)) {
                    c0342g.f2148a.f2100an.m4687a(this, pointF3, unit2, i + 1);
                }
                z = true;
            }
            if (c0342g.f2148a.f2101ao != null) {
                if (c0339d.f2099am == null || c0339d.f2099am.read(this)) {
                    c0342g.f2148a.f2101ao.m4688a(this, pointF3, unit2);
                }
                z = true;
            }
            C0453l c0453l = null;
            if (c0339d.f2077G != null) {
                c0453l = c0339d.f2077G.mo7518c();
            }
            if (c0453l != null) {
                if (GameEngine.f6187aw) {
                    GameEngine.m1145b(m5845cA() + ": converting unit: " + action.m6094O());
                }
                if (!(c0453l instanceof C0453l)) {
                    Unit mo5717a = c0453l.mo5717a();
                    mo5717a.f6951ek = this.f6951ek;
                    mo5717a.f6952el = this.f6952el;
                    if (!mo5717a.m5867bI()) {
                        mo5717a.direction = this.direction;
                    }
                    mo5717a.m5766f(this.team);
                    mo5717a.m5907B(null);
                    float f3 = this.f1632ct;
                    float f4 = mo5717a.f1632ct;
                    if (f3 == 0.0f) {
                        mo5717a.m5762o(mo5717a.f1632ct);
                    } else {
                        mo5717a.m5762o((this.f1631cs / f3) * f4);
                    }
                    if (this.f1643cE) {
                        GameEngine.getInstance().f6111bS.m1978k(mo5717a);
                    }
                    Team.m6353c(mo5717a);
                    m5812ch();
                } else {
                    C0449h c0449h = null;
                    if (c0339d.f2080P) {
                        c0449h = m4854dc();
                    }
                    Team.m6369b((Unit) this);
                    this.f2863y = null;
                    m4982a(c0453l, false, false, c0339d.f2081Q);
                    if (c0449h != null) {
                        m4984a(c0449h, true);
                    }
                    mo4500S();
                    this.f2876dJ.m4380e();
                    this.f1586bA = GameEngine.getInstance().f6096by;
                    Team.m6353c(this);
                }
                z = true;
                if (!c0342g.m5480B().m5209b()) {
                    m3229W();
                }
            }
            if (!z && c0339d.f2058m) {
                GameEngine.PrintLog("completeQueueItem:" + c0342g.m6095N() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo4374b(C0499j c0499j) {
        Action m5006a = m5006a(c0499j.f3491j);
        if (m5006a != null && (m5006a instanceof C0342g)) {
            C0339d c0339d = ((C0342g) m5006a).f2148a;
            if (c0339d.f2088aa != null) {
                f2891dY.x = this.f6951ek;
                f2891dY.y = this.f6952el;
                c0339d.f2088aa.m4687a(this, f2891dY, null, 0);
            }
        }
    }

    /* renamed from: c */
    public boolean mo4373c(C0499j c0499j) {
        return true;
    }

    /* renamed from: i */
    public void m4817i(boolean z) {
        this.f2876dJ.m4388a(z);
    }

    /* renamed from: a */
    public void mo4375a(C0499j c0499j) {
        float f;
        Action m5006a = m5006a(c0499j.f3491j);
        if (m5006a != null && m5003a(m5006a, c0499j.f3485h, c0499j.f3486i, 0)) {
            return;
        }
        float f2 = 0.0f;
        if (this.f2861w.f2947aG && this.f2861w.f3056df != null) {
            f2 = this.direction + this.f2861w.f3056df.floatValue() + 90.0f;
        }
        if (this.f2861w.f3059di != null) {
            f = this.f2861w.f3059di.floatValue();
        } else if (this.f2876dJ.f3495b != null) {
            f = this.radius * 3.0f;
        } else {
            f = this.radius * 2.0f;
        }
        Unit m4391a = this.f2876dJ.m4391a(c0499j, f, this.f2855q, f2);
        if (m4391a != null) {
            m5030F(m4391a);
            Team.m6353c(m4391a);
            m5888a(EnumC0347ae.f2175e, m4391a);
        }
    }

    /* renamed from: E */
    public void m5033E(Unit unit) {
        float f = 0.0f;
        if (this.f2861w.f2947aG && this.f2861w.f3056df != null) {
            f = this.direction + this.f2861w.f3056df.floatValue() + 90.0f;
        }
        unit.direction = 90.0f + f;
        float f2 = 70.0f;
        if (this.f2861w.f3059di != null) {
            f2 = this.f2861w.f3059di.floatValue();
        }
        this.f2876dJ.m4396a(unit, f2, this.f2855q);
    }

    /* renamed from: F */
    public void m5030F(Unit unit) {
        unit.f6951ek = this.f6951ek + this.f2861w.f3054dd;
        unit.f6952el = this.f6952el + this.f2861w.f3055de;
        if (!this.f2861w.f2947aG) {
            float f = 180.0f;
            if (this.f2861w.f3056df != null) {
                f = this.f2861w.f3056df.floatValue();
            }
            float f2 = 70.0f;
            if (this.f2861w.f3059di != null) {
                f2 = this.f2861w.f3059di.floatValue();
            }
            boolean m3979a = Hovercraft.m3979a(this, unit, this.f2855q, 7.0f, f, f2, this.f2861w.f3054dd, this.f2861w.f3055de);
            if (!this.f2861w.f3058dh) {
                unit.height = this.height;
            }
            unit.height += this.f2861w.f3057dg;
            if (unit instanceof C0451j) {
                ((C0451j) unit).m4861dD();
            }
            if ((mo3293i() || !m3979a || this.f2861w.f3129eP.read(this)) && m4879cq()) {
                m5039C(unit);
            }
        }
        this.f2855q = !this.f2855q;
    }

    /* renamed from: by */
    public C0424b m4912by() {
        C1101m m4378g = this.f2876dJ.m4378g();
        int size = m4378g.size();
        if (size == 0) {
            return C0424b.f2709a;
        }
        C0424b c0424b = new C0424b();
        Object[] m559a = m4378g.m559a();
        for (int i = 0; i < size; i++) {
            Action m5006a = m5006a(((C0499j) m559a[i]).f3491j);
            if (m5006a != null && (m5006a instanceof C0342g)) {
                C0342g c0342g = (C0342g) m5006a;
                if (c0342g.f2148a.f2089ac != null) {
                    c0424b.f2699c += c0342g.f2148a.f2089ac.floatValue();
                }
                if (c0342g.f2148a.f2090ad != null) {
                    C0424b c0424b2 = c0342g.f2148a.f2090ad;
                    if (!c0424b2.m5209b()) {
                        c0424b = C0424b.m5219a(c0424b, c0424b2);
                    }
                }
                if (c0342g.f2148a.f2091ae != null) {
                    C0424b c0424b3 = c0342g.f2148a.f2091ae;
                    if (!c0424b3.m5209b()) {
                        c0424b = C0424b.m5219a(c0424b, c0424b3);
                    }
                }
            }
        }
        return c0424b;
    }

    /* renamed from: dx */
    public boolean mo4368dx() {
        return this.f2861w.f3258eH > 0 && m4858dG() > this.f2861w.f3258eH;
    }

    /* renamed from: h */
    public int mo4366h(InterfaceC0303as interfaceC0303as) {
        return this.f2876dJ.m4395a(interfaceC0303as);
    }

    /* renamed from: f */
    public int mo4367f(boolean z) {
        return this.f2876dJ.m4402a(Action.f1461i, z, true);
    }

    /* renamed from: a */
    public int mo4376a(C0208c c0208c, boolean z) {
        return this.f2876dJ.m4403a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo4372dt() {
        return this.f2876dJ.m4387b();
    }

    /* renamed from: bD */
    public C0424b m4940bD() {
        return this.f2876dJ.m4383c();
    }

    /* renamed from: du */
    public C1101m mo4371du() {
        return this.f2876dJ.f3496c;
    }

    /* renamed from: dw */
    public void mo4369dw() {
        this.f2876dJ.f3498e = 1.0f;
    }

    /* renamed from: dv */
    public boolean mo4370dv() {
        return this.f2876dJ.m4405a();
    }

    /* renamed from: a */
    public int m4986a(C0448g c0448g) {
        return this.f2876dJ.m4393a(c0448g);
    }

    /* renamed from: a */
    public void mo4377a(PointF pointF) {
        if (this.f2861w.f3048cX) {
            this.f2876dJ.f3495b = pointF;
        }
    }

    /* renamed from: a_ */
    public float m4968a_() {
        if (!this.f2861w.f2903s) {
            return -1.0f;
        }
        return super.m5878a_();
    }

    /* renamed from: bT */
    public boolean m4934bT() {
        return this.f2861w.f2904t;
    }

    /* renamed from: bU */
    public float m4933bU() {
        if (isActive() && !this.f2876dJ.m4405a() && this.f2861w.f2909y) {
            return this.f2876dJ.f3498e;
        }
        return super.m5857bU();
    }

    /* renamed from: bV */
    public float m4932bV() {
        if (this.f2862x.f2240d > 0.0f && this.f1638cz < this.f2862x.f2240d && this.f2861w.f2905u) {
            return this.f1638cz / this.f2862x.f2240d;
        }
        if (this.f1637cy > 0.0f && this.f1634cv < this.f1637cy && this.f2861w.f2908x) {
            return this.f1634cv / this.f1637cy;
        }
        if (this.f2862x.f2240d == 0.0f && this.f1637cy == 0.0f) {
            if (this.f2861w.f3253eh != -1 && this.f1648cJ[this.f2861w.f3253eh].f1715e > 0.0f) {
                return 1.0f - (this.f1648cJ[this.f2861w.f3253eh].f1715e / m4955b(this.f2861w.f3253eh));
            }
            if (this.f2861w.f3254ei != -1 && this.f1648cJ[this.f2861w.f3254ei].f1716f != 0.0f) {
                return this.f1648cJ[this.f2861w.f3254ei].f1716f / m4838e(this.f2861w.f3254ei);
            }
        }
        return super.m5856bV();
    }

    /* renamed from: f */
    public boolean m4831f(float f) {
        return super.m5768f(f);
    }

    /* renamed from: p */
    public void m4806p(float f) {
        int i = this.f2861w.f3194i.f6888a;
        if (i > 0) {
            Object[] m559a = this.f2861w.f3194i.m559a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m559a[i2]).mo5327f(this, f);
            }
        }
        super.m5761p(f);
    }

    /* renamed from: e */
    public void m4839e(float f) {
        super.mo458e(f);
    }

    /* renamed from: bZ */
    public void m4928bZ() {
        if (this.f2876dJ.f3495b != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.graphics.mo932a((int) (this.f6951ek - gameEngine.f6138cv), (int) (this.f6952el - gameEngine.f6139cw), (int) (this.f2876dJ.f3495b.x - gameEngine.f6138cv), (int) (this.f2876dJ.f3495b.y - gameEngine.f6139cw), AbstractC0498i.f3476y);
        }
    }

    /* renamed from: ca */
    public void m4890ca() {
        boolean z = false;
        if ((this.f2862x.f2245i > 70.0f && this.f2861w.f3103ek && this.f2861w.f3077dE == null) || (this.f2861w.f3077dE != null && this.f2861w.f3077dE.booleanValue())) {
            C1117y.m492a((Unit) this, m4810m(), true);
            z = true;
        } else if (this.f2861w.f2947aG && this.f2862x.f2251o > 50 && !this.f2861w.f3103ek) {
            C1117y.m492a((Unit) this, this.f2862x.f2251o, true);
            z = true;
        }
        if (this.f2861w.f3200o.size() != 0) {
            Iterator it = this.f2861w.f3200o.iterator();
            while (it.hasNext()) {
                C1117y.m492a((Unit) this, ((C0466x) it.next()).f3351a, true);
                z = true;
            }
        }
        if (this.f2861w.f2993bF) {
            int m4918bl = m4918bl();
            for (int i = 0; i < m4918bl; i++) {
                C0411bl c0411bl = this.f2861w.f3264fL[i];
                if (c0411bl.f2582ak != null && c0411bl.f2621al > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    C1117y.m493a((Unit) this, c0411bl.f2621al, Color.argb(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    /* renamed from: d */
    public void m4869d(float f) {
        super.mo461d(f);
        if (this.isDead) {
            return;
        }
        this.f1697dG.m5244a(f, this);
        if (this.f2861w.f3212ak != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            float f2 = this.f6951ek - gameEngine.f6138cv;
            float f3 = (this.f6952el - gameEngine.f6139cw) - this.height;
            float m4907cC = m4907cC();
            if (m4907cC != 1.0f) {
                gameEngine.graphics.mo878k();
                gameEngine.graphics.mo933a(m4907cC, m4907cC, f2, f3);
            }
            if (this.f2861w.f2938al) {
                int i = this.f2861w.f3212ak.f6396p;
                int i2 = this.f2861w.f3212ak.f6397q;
                int i3 = i / 2;
                int i4 = i2 / 2;
                f1683ds.m7195a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                f1684dt.m7208a(0, 0, 0 + i, 0 + i2);
            } else {
                f1683ds.m7195a(f2 - this.f4225eq, f3 - this.f4226er, f2 + this.f4225eq, f3 + this.f4226er);
                f1684dt.m7208a(0, 0, 0 + this.f4223eo, 0 + this.f4224ep);
            }
            gameEngine.graphics.mo909a(this.f2861w.f3212ak, f1684dt, f1683ds, m4976aN());
            if (m4907cC != 1.0f) {
                gameEngine.graphics.mo877l();
            }
        }
        if (this.f2861w.f3222ay && this.f2883dQ != null && !this.isDead) {
            C0393g.m5315a(this, f, false, true);
        }
    }

    /* renamed from: aM */
    public float m4977aM() {
        return this.f2861w.f3074dB;
    }

    /* renamed from: aN */
    public Paint m4976aN() {
        return super.m3166aN();
    }

    /* renamed from: aV */
    public boolean m4970aV() {
        return this.f2861w.f3119eA;
    }

    /* renamed from: bI */
    public boolean m4939bI() {
        return this.f2861w.f2947aG;
    }

    /* renamed from: q */
    public boolean m4804q() {
        if (this.f1651cM != null && this.f1651cM.f1623ck < 1.0f) {
            return true;
        }
        return this.f2861w.f2950aJ;
    }

    /* renamed from: H */
    private boolean m5026H(Unit unit) {
        if (unit.mo4203q() || unit == this) {
            return false;
        }
        if (unit.m5867bI()) {
            if (this.f2861w.f2960aT) {
                return true;
            }
            return false;
        } else if (this.f2861w.f2961aU) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m4999a(Unit unit) {
        if (this.f2861w.f3145fj != null && !C0448g.m5061a(this.f2861w.f3145fj, unit.m5787dc())) {
            return false;
        }
        return m5026H(unit);
    }

    /* renamed from: l */
    public boolean m4811l(Unit unit) {
        if (unit.mo4209g() != 0.0f && m4820h(unit, true)) {
            return true;
        }
        if (this.f2861w.f3144fi != null && !C0448g.m5061a(this.f2861w.f3144fi, unit.m5787dc())) {
            return false;
        }
        return m5026H(unit);
    }

    /* renamed from: m */
    public void m4809m(Unit unit) {
        C0637ab c0637ab;
        if (this.f2861w.f2972bi) {
            C0305au ar = m3135ar();
            if (ar != null && (c0637ab = ar.f1801i) != null) {
                c0637ab.m2975a(ar);
            }
            if (this.f1643cE && unit != null) {
                GameEngine.getInstance().f6111bS.m1978k(unit);
            }
            m5812ch();
        }
    }

    /* renamed from: al */
    public boolean m4959al() {
        if (this.f2861w.f2972bi) {
            return true;
        }
        return false;
    }

    /* renamed from: aj */
    public boolean m4961aj() {
        return this.f2861w.f3147fl;
    }

    /* renamed from: cs */
    public boolean m4877cs() {
        return this.f2861w.f3168fI;
    }

    /* renamed from: ak */
    public boolean m4960ak() {
        return this.f2861w.f3146fk;
    }

    /* renamed from: g */
    public boolean m4824g(Unit unit, boolean z) {
        if (!m4820h(unit, z)) {
            return false;
        }
        if (z && unit.m5846c((AbstractC0623y) this)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m4820h(Unit unit, boolean z) {
        if (!this.f2861w.f3141ff) {
            return false;
        }
        if (this.f2861w.f3142fg != null && !C0448g.m5061a(this.f2861w.f3142fg, unit.m5787dc())) {
            return false;
        }
        return true;
    }

    /* renamed from: cR */
    public int m4899cR() {
        return this.f2861w.f3143fh;
    }

    /* renamed from: bJ */
    public boolean m4938bJ() {
        return this.f2861w.f3151fp;
    }

    /* renamed from: a */
    public void m5012a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.isDead && m4960ak()) {
            if (m3227Y()) {
                if (!this.f2861w.f3008bW) {
                    Builder.m4158b(f, this);
                }
            } else if (!this.f2861w.f3004bS) {
                Builder.m4158b(f, this);
            }
        }
    }

    /* renamed from: o */
    public boolean m4808o() {
        return this.f2861w.f3023ct;
    }

    /* renamed from: p */
    public boolean m4807p() {
        return this.f2861w.f3024cu;
    }

    /* renamed from: cN */
    public boolean m4903cN() {
        return this.f2861w.f3025cv;
    }

    /* renamed from: f */
    public void m4828f(Team team) {
        if (this.f2861w.f3029cz) {
            mo3120b(Team.f1369h);
        } else if (this.f2861w.f3028cy && this.f2865A.size() == 0) {
            mo3120b(Team.f1370i);
        } else {
            super.m5766f(team);
        }
    }

    /* renamed from: B */
    public void m5042B(Unit unit) {
        super.m5907B(unit);
    }

    /* renamed from: g */
    public float m4826g() {
        return this.f2861w.f3030cA;
    }

    /* renamed from: cP */
    public int m4901cP() {
        return this.f2861w.f3031cB;
    }

    /* renamed from: cQ */
    public C0449h m4900cQ() {
        return this.f2861w.f3032cC;
    }

    /* renamed from: cO */
    public void m4902cO() {
        if (this.f2861w.f2971bh == 0.0f && m4826g() > 0.0f) {
            Team.m6369b((Unit) this);
            this.f1623ck = 1.0f;
            Team.m6353c(this);
        }
    }

    /* renamed from: co */
    public C0208c m4880co() {
        if (this.f2861w.f3258eH != 0) {
            return Hovercraft.f3639i.m6095N();
        }
        return super.m5805co();
    }

    /* renamed from: L */
    public float m5019L(int i) {
        return this.f2861w.f3264fL[i].f2580af;
    }

    /* renamed from: K */
    public PointF m5021K(int i) {
        Projectile projectile;
        PointF K = super.m3238K(i);
        if (this.f2861w.f3114ev) {
            if (this.f2861w.f3171fM[this.f2861w.f3264fL[i].m5264a(this)].f1171M && this.f2870F != null && (projectile = this.f2870F[i]) != null && !projectile.f6946ef) {
                K.x += projectile.x;
                K.y += projectile.y;
            }
        }
        return K;
    }

    /* renamed from: bd */
    public float m4924bd() {
        return this.f2862x.f2240d;
    }

    /* renamed from: be */
    public EnumC0307b m4923be() {
        return this.f2861w.f3092dX;
    }

    /* renamed from: bf */
    public boolean m4922bf() {
        if (this.f2861w.f3095ea) {
            return false;
        }
        if (this.f2861w.f3092dX == EnumC0307b.f1831d) {
            C0305au ar = m3135ar();
            if ((ar != null && (ar.m5676d() == EnumC0306av.f1817h || ar.m5676d() == EnumC0306av.f1819j)) || this.f3889O == EnumC0205a.f1417a) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: bW */
    public boolean m4931bW() {
        return this.f2859u;
    }

    /* renamed from: bg */
    public boolean m4921bg() {
        return this.f2861w.f3098ed;
    }

    /* renamed from: bc */
    public float m4925bc() {
        return this.f2861w.f3101eg;
    }

    /* renamed from: f */
    public void m4830f(float f, float f2) {
        super.m5767f(f, f2);
        m5889a(EnumC0347ae.f2178h);
        float f3 = this.direction;
        if (this.f2861w.f3072dz) {
            f3 = this.f1648cJ[this.f2861w.f3073dA.f2546e].f1711a;
        }
        this.f2879dM = this.f6951ek;
        this.f2880dN = this.f6952el;
        this.f2881dO = this.height;
        this.f2882dP = f3;
    }

    /* renamed from: ds */
    public void m4843ds() {
        if (this.f2861w.f3220aw == null && this.f2883dQ == null) {
            return;
        }
        if (this.f2861w.f3220aw == null || this.f2861w.f3220aw.length == 0) {
            this.f2883dQ = null;
        } else if (this.f2883dQ == null || this.f2883dQ.length != this.f2861w.f3220aw.length) {
            this.f2883dQ = new C0394h[this.f2861w.f3220aw.length];
            for (int i = 0; i < this.f2861w.f3220aw.length; i++) {
                C0394h c0394h = new C0394h();
                this.f2883dQ[i] = c0394h;
                c0394h.f2413a = i;
                c0394h.f2431s = this.f2861w.f3220aw[i].f2300r;
            }
            float f = this.direction;
            if (this.f2861w.f3072dz) {
                f = this.f1648cJ[this.f2861w.f3073dA.f2546e].f1711a;
            }
            this.f2879dM = this.f6951ek;
            this.f2880dN = this.f6952el;
            this.f2881dO = this.height;
            this.f2882dP = f;
            m4842dy();
            for (int i2 = 0; i2 < this.f2861w.f3220aw.length; i2++) {
                this.f2883dQ[i2].f2428m = true;
            }
        }
    }

    /* renamed from: dy */
    public void m4842dy() {
        C0393g.f2409a.mo5310b(this, 0.0f);
    }

    /* renamed from: dz */
    public void m4841dz() {
        if (this.f2883dQ != null) {
            for (int i = 0; i < this.f2883dQ.length; i++) {
                this.f2883dQ[i].f2429n = true;
                this.f2883dQ[i].f2428m = true;
            }
            m4842dy();
        }
    }

    /* renamed from: aT */
    public int m4972aT() {
        if (this.f2861w.f3268fQ == null) {
            return -1;
        }
        return this.f2861w.f3268fQ.f2546e;
    }

    /* renamed from: s */
    public int m4800s() {
        return this.f2862x.f2250n;
    }

    /* renamed from: c */
    public void m4908c(boolean z) {
        C0453l c0453l = this.f2861w;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1650cL != null || this.f1651cM != null) {
            return;
        }
        int i = this.f2862x.f2250n;
        if (this.f1623ck < 1.0f && c0453l.f3053dc != -1) {
            i = c0453l.f3053dc;
        }
        if (i > 0) {
            gameEngine.f6104bL.m6651a(this.f6951ek, this.f6952el, i, this.team, z);
        }
    }

    /* renamed from: cb */
    public Rect m4889cb() {
        return this.f2861w.f3242cS;
    }

    /* renamed from: cd */
    public Rect m4887cd() {
        return this.f2861w.f3244cU;
    }

    /* renamed from: cc */
    public Rect m4888cc() {
        return this.f2861w.f3243cT;
    }

    /* renamed from: b */
    public boolean m4954b(int i, float f) {
        float m5040C;
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        if (c0411bl.f2627as != 0.0f) {
            boolean z = true;
            if (c0411bl.f2585av != null && !c0411bl.f2585av.read(this)) {
                z = false;
            }
            if (z) {
                C0247ap c0247ap = this.f1648cJ[i];
                if (c0411bl.f2626ar != 0.0f) {
                    m5040C = c0247ap.f1711a;
                } else if (!c0411bl.f2625aq) {
                    m5040C = c0247ap.f1712b;
                } else {
                    m5040C = m5040C(i);
                }
                c0247ap.f1721k += f;
                float f2 = f * c0411bl.f2584au;
                if (c0247ap.f1722l > 0.0f) {
                    if (c0247ap.f1722l < Float.POSITIVE_INFINITY && m3224a(f2, m5040C + c0247ap.f1722l, i) == 0.0f) {
                        c0247ap.f1722l = Float.POSITIVE_INFINITY;
                    }
                } else if (c0247ap.f1722l > Float.NEGATIVE_INFINITY && m3224a(f2, m5040C + c0247ap.f1722l, i) == 0.0f) {
                    c0247ap.f1722l = Float.NEGATIVE_INFINITY;
                }
                if (c0247ap.f1721k > c0411bl.f2628at) {
                    c0247ap.f1721k = -CommonUtils.m2346a(this, 0, (int) c0411bl.f2629aw);
                    float f3 = c0411bl.f2627as;
                    if (c0411bl.f2586ax > 0.0f) {
                        f3 += CommonUtils.m2306b(this, 0.0f, c0411bl.f2586ax, i);
                    }
                    c0247ap.f1722l = c0247ap.f1722l > 0.0f ? -f3 : f3;
                    return false;
                }
                return false;
            }
        }
        if (c0411bl.f2626ar != 0.0f) {
            this.f1648cJ[i].f1711a += c0411bl.f2626ar * f;
            if (this.f1648cJ[i].f1711a > 180.0f) {
                this.f1648cJ[i].f1711a -= 360.0f;
            }
            if (this.f1648cJ[i].f1711a < -180.0f) {
                this.f1648cJ[i].f1711a += 360.0f;
                return false;
            }
            return false;
        }
        return c0411bl.f2625aq;
    }

    /* renamed from: cu */
    public int m4875cu() {
        return this.f2861w.f3260eU;
    }

    /* renamed from: dA */
    public ArrayList m4864dA() {
        f2884dR.clear();
        ArrayList m5017N = m5017N();
        if (m5017N.size() != 0) {
            Iterator it = m5017N.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (action instanceof C0342g) {
                    C0342g c0342g = (C0342g) action;
                    if (c0342g.f2150c == EnumC0340e.f2138c) {
                        f2884dR.add(c0342g);
                    }
                }
            }
        }
        return f2884dR;
    }

    /* renamed from: cl */
    public C0208c m4882cl() {
        ArrayList m4864dA = m4864dA();
        if (m4864dA.size() > 0) {
            return ((Action) m4864dA.get(0)).m6095N();
        }
        return null;
    }

    /* renamed from: a */
    public void m4979a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList m4864dA = m4864dA();
        if (m4864dA.size() < 2) {
            return;
        }
        m4864dA.remove(0);
        Iterator it = m4864dA.iterator();
        while (it.hasNext()) {
            arrayList.add(((Action) it.next()).m6095N());
        }
    }

    /* renamed from: cX */
    public float m4894cX() {
        return this.f2861w.f3046cV;
    }

    /* renamed from: cY */
    public float m4893cY() {
        return this.f2861w.f3047cW;
    }

    /* renamed from: bv */
    public void m4913bv() {
        Team.m6389a((Unit) this);
        this.f2876dJ.m4388a(true);
        super.mo3083bv();
    }

    /* renamed from: da */
    public void m4856da() {
        this.height = 170.0f;
        this.f2844f = 1.5f;
        m4841dz();
        super.m5789da();
    }

    /* renamed from: db */
    public boolean m4855db() {
        return this.f2861w.f3019ck;
    }

    /* renamed from: bp */
    public int m4916bp() {
        return this.f2861w.f2980bq;
    }

    /* renamed from: a */
    public void m5010a(int i, float f) {
        this.f1648cJ[i].f1711a += f;
        if (this.f2861w.f3267fP) {
            for (int i2 = 0; i2 < this.f2861w.f3264fL.length; i2++) {
                if (this.f2861w.f3264fL[i2].f2608w == i) {
                    this.f1648cJ[i2].f1711a += f;
                    this.f1648cJ[i2].m5747a(2);
                }
            }
        }
    }

    /* renamed from: cZ */
    public float m4892cZ() {
        return super.m5821cZ() + this.f2861w.f3052db;
    }

    /* renamed from: H */
    public float m5027H(int i) {
        return this.f2861w.f3264fL[i].f2603p;
    }

    /* renamed from: I */
    public float m5025I(int i) {
        return this.f2861w.f3264fL[i].f2604q;
    }

    /* renamed from: J */
    public float m5023J(int i) {
        return this.f2861w.f3264fL[i].f2605r;
    }

    /* renamed from: a */
    public float m4996a(Unit unit, float f, Projectile projectile) {
        C0399m dl = m5778dl();
        if (dl != null && this.f1651cM != null && dl.f2452j) {
            int i = 0;
            if (projectile != null) {
                i = projectile.f1054aD;
            }
            if (i >= 0) {
                Projectile m6511a = Projectile.m6511a(projectile);
                if (dl.f2453k) {
                    m6511a.f1038am = 0.0f;
                }
                f = this.f1651cM.mo4499a(unit, f, m6511a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (m5024J()) {
            f = 0.0f;
        }
        if (this.f2862x.f2248l > 0.0f && f > this.f2861w.f3036cI) {
            float f2 = this.f2862x.f2248l;
            if (projectile != null) {
                f2 -= projectile.f1039an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.f2861w.f3036cI) {
                f = this.f2861w.f3036cI;
            }
        }
        if (projectile != null) {
            m4991a(EnumC0347ae.f2184n, unit, projectile.f1055aE, (VariableScope) null);
        } else {
            m5888a(EnumC0347ae.f2184n, unit);
        }
        return super.mo4499a(unit, f, projectile);
    }

    /* renamed from: aU */
    public float m4971aU() {
        return this.f2861w.f3076dD;
    }

    /* renamed from: ac */
    public boolean m4966ac() {
        if (!this.f2861w.f3097ec) {
            return false;
        }
        return super.m3150ac();
    }

    /* renamed from: a */
    public boolean m5000a(EnumC0238ag enumC0238ag) {
        if (enumC0238ag == EnumC0238ag.f1529a) {
            return this.f2861w.f3060dj.m5272a();
        }
        if (enumC0238ag == EnumC0238ag.f1530b) {
            return this.f2861w.f3061dk.m5272a();
        }
        if (enumC0238ag == EnumC0238ag.f1531c) {
            return this.f2861w.f3062dl.m5272a();
        }
        return false;
    }

    /* renamed from: b */
    public void m4946b(EnumC0347ae enumC0347ae) {
        C0453l c0453l = this.f2861w;
        if (c0453l.f3277gk.f6888a == 0) {
            return;
        }
        Object[] m559a = c0453l.f3277gk.m559a();
        for (int i = c0453l.f3277gk.f6888a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m559a[i];
            if (c0346ad.f2167a == enumC0347ae) {
                f2891dY.x = this.f6951ek;
                f2891dY.y = this.f6952el;
                m5003a(c0346ad.f2168b, f2891dY, (Unit) null, 0);
            }
        }
    }

    /* renamed from: a */
    public void m4991a(EnumC0347ae enumC0347ae, Unit unit, C0449h c0449h, VariableScope variableScope) {
        C0452k c0452k;
        C0453l c0453l = this.f2861w;
        if (c0453l.f3277gk.f6888a == 0) {
            return;
        }
        Object[] m559a = c0453l.f3277gk.m559a();
        for (int i = c0453l.f3277gk.f6888a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m559a[i];
            if (c0346ad.f2167a == enumC0347ae && (c0346ad.f2170d == null || C0448g.m5062a(c0346ad.f2170d, c0449h))) {
                if (f2886dT.size() > 0) {
                    c0452k = (C0452k) f2886dT.m555b();
                } else {
                    c0452k = new C0452k();
                }
                c0452k.f2896a = c0346ad;
                c0452k.f2897b = this;
                c0452k.f2898c = unit;
                c0452k.f2899d = c0449h;
                c0452k.f2900e = variableScope;
                f2885dS.add(c0452k);
            }
        }
    }

    /* renamed from: s */
    public static void m4799s(float f) {
    }

    /* renamed from: dB */
    public static void m4863dB() {
        if (f2885dS.f6888a == 0) {
            return;
        }
        f2885dS = new C1101m();
    }

    /* renamed from: a */
    public static void m5013a(float f, int i) {
        if (f2885dS.f6888a == 0) {
            return;
        }
        Object[] m559a = f2885dS.m559a();
        int i2 = f2885dS.f6888a;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            C0452k c0452k = (C0452k) m559a[i3];
            C0346ad c0346ad = c0452k.f2896a;
            C0451j c0451j = c0452k.f2897b;
            if (c0346ad.f2169c == c0451j.f2861w) {
                f2891dY.x = c0451j.f6951ek;
                f2891dY.y = c0451j.f6952el;
                PointF pointF = f2891dY;
                LogicBoolean.setContextEventSource(c0452k);
                c0451j.m5003a(c0346ad.f2168b, pointF, (Unit) null, 0);
                LogicBoolean.clearContext();
            }
        }
        if (i < 1 && i2 != f2885dS.f6888a) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                C0452k c0452k2 = (C0452k) f2885dS.remove(i4);
                c0452k2.m4780a();
                f2886dT.add(c0452k2);
            }
            m5013a(f, i + 1);
        }
        Object[] m559a2 = f2885dS.m559a();
        for (int i5 = f2885dS.f6888a - 1; i5 >= 0; i5--) {
            C0452k c0452k3 = (C0452k) m559a2[i5];
            c0452k3.m4780a();
            f2886dT.add(c0452k3);
        }
        f2885dS.clear();
    }

    /* renamed from: dC */
    public static void m4862dC() {
    }

    /* renamed from: b */
    public void m4956b(float f, boolean z) {
        C0453l c0453l = this.f2861w;
        if (!c0453l.f3172fS) {
            return;
        }
        if (this.f2860v != 0.0f) {
            this.f2860v = CommonUtils.m2368a(this.f2860v, f);
            if (this.f2860v == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        C0460r[] c0460rArr = c0453l.f3173fT;
        if (c0460rArr != null) {
            m5011a(f, c0460rArr);
            if (c0453l != this.f2861w) {
                return;
            }
        }
        C0460r[] c0460rArr2 = c0453l.f3174fU;
        if (c0460rArr2 != null && (((int) (GameEngine.getInstance().f6233bx + this.f6945ed)) % 4 == 0 || z)) {
            m5011a(f, c0460rArr2);
            if (c0453l != this.f2861w) {
                return;
            }
        }
        C0460r[] c0460rArr3 = c0453l.f3175fV;
        if (c0460rArr3 != null) {
            if (((int) (GameEngine.getInstance().f6233bx + this.f6945ed)) % 8 == 0 || z) {
                m5011a(f, c0460rArr3);
                if (c0453l != this.f2861w) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m5011a(float f, C0460r[] c0460rArr) {
        C0453l c0453l = this.f2861w;
        GameEngine gameEngine = GameEngine.getInstance();
        for (C0460r c0460r : c0460rArr) {
            if (c0460r.f3331a.read(this)) {
                if (gameEngine.f6225bl && gameEngine.f6227bn && this.f1643cE) {
                    if (c0460r.f3334d != null) {
                        String str = VariableScope.nullOrMissingString + c0460r.f3334d.m6094O();
                    }
                    String str2 = "autoTrigger fired on: " + m5795cz() + " details: " + c0460r.f3331a.getDebugDetails(this);
                    GameEngine.PrintLog(str2);
                    gameEngine.f6111bS.f5108f.m2102a(str2, 2000);
                }
                f2891dY.x = this.f6951ek;
                f2891dY.y = this.f6952el;
                m5003a(c0460r.f3334d, f2891dY, (Unit) null, 0);
                this.f2860v = this.f2861w.f3232ca;
                if (c0453l != this.f2861w) {
                    return;
                }
            }
        }
    }

    /* renamed from: dc */
    public C0449h m4854dc() {
        return this.f2892dZ;
    }

    /* renamed from: a */
    public void m4984a(C0449h c0449h, boolean z) {
        if (z) {
            this.f2892dZ = c0449h;
            return;
        }
        Team.m6369b((Unit) this);
        this.f2892dZ = c0449h;
        Team.m6353c(this);
    }

    /* renamed from: j */
    public void m4815j(boolean z) {
        m4984a(this.f2861w.f2921N, z);
    }

    /* renamed from: a */
    public void m4985a(C0449h c0449h) {
        C0449h m4854dc = m4854dc();
        if (m4854dc == null || m4854dc.m5051b() == 0) {
            m4984a(c0449h, false);
        } else if (C0448g.m5056b(m4854dc, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m4854dc);
            if (c0450i.m5048a(c0449h)) {
                m4984a(c0450i.m5050a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m4944b(C0449h c0449h) {
        C0449h m4854dc = m4854dc();
        if (m4854dc == null || m4854dc.m5051b() == 0 || !C0448g.m5061a(c0449h, m4854dc)) {
            return;
        }
        C0450i c0450i = new C0450i(m4854dc);
        if (c0450i.m5047b(c0449h)) {
            m4984a(c0450i.m5050a(), false);
        }
    }

    /* renamed from: dD */
    public final void m4861dD() {
        if (this.f2861w.f3137fb == EnumC0246ao.f1705d) {
            if (mo3293i()) {
                setDrawLayer(5);
            } else if (m4879cq() && this.f1622cj == 0.0f) {
                setDrawLayer(3);
            } else {
                setDrawLayer(2);
            }
        } else if (this.f1622cj == 0.0f) {
            setDrawLayer(this.f2861w.f3240cD);
        }
        this.f6950ej = 0;
    }

    /* renamed from: cj */
    public boolean m4884cj() {
        if (!this.f2861w.f3176gc) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo5933f() {
        return this.f2861w.f3135eY.read(this);
    }

    /* renamed from: j */
    public boolean mo5932j() {
        return true;
    }

    /* renamed from: D */
    public C1080ai m5037D(int i) {
        C0247ap c0247ap = this.f1648cJ[i];
        C0411bl c0411bl = this.f2861w.f3264fL[i];
        float f = c0411bl.f2574X;
        float f2 = c0411bl.f2575Y;
        if (c0411bl.f2616Z != 0.0f && c0247ap.f1723m) {
            f2 += c0411bl.f2616Z;
        }
        float f3 = m5035E() ? this.direction : c0247ap.f1711a;
        C1080ai m5031F = m5031F(i);
        float m2249i = CommonUtils.m2249i(f3);
        float sin = CommonUtils.sin(f3);
        float f4 = m5031F.f6843a;
        float f5 = m5031F.f6844b;
        float f6 = m5031F.f6845c;
        f2893ea.f6843a = f4 + ((m2249i * f) - (sin * f2));
        f2893ea.f6844b = f5 + (sin * f) + (m2249i * f2);
        f2893ea.f6845c = f6 + c0411bl.f2576aa;
        return f2893ea;
    }

    /* renamed from: E */
    public PointF m5034E(int i) {
        C1080ai m5037D = m5037D(i);
        f2894eb.x = m5037D.f6843a;
        f2894eb.y = m5037D.f6844b;
        return f2894eb;
    }

    /* renamed from: ck */
    public boolean m4883ck() {
        return this.f2861w.f3166fE;
    }

    /* renamed from: cm */
    public float m4881cm() {
        return this.f2861w.f3262fF;
    }

    /* renamed from: a */
    public void m4997a(Unit unit, float f, int i) {
        if (this.f2861w.f3067du != null) {
            this.f2840b.m5167a(this.f2861w.f3067du, 5);
        }
        if (this.f2861w.f3004bS) {
            this.f3894T = CommonUtils.m2368a(this.f3894T, f);
            if (this.f3894T == 0.0f) {
                this.f3894T = this.f2861w.f3005bT;
                if (this.f2861w.f3006bU != null) {
                    C0247ap c0247ap = this.f1648cJ[i];
                    PointF m5034E = m5034E(i);
                    this.f2861w.f3006bU.m4678a(m5034E.x, m5034E.y, this.height, c0247ap.f1711a, this);
                }
                if (this.f2861w.f3007bV != null) {
                    this.f2861w.f3007bV.m4678a(unit.f6951ek, unit.f6952el, unit.height, unit.direction, unit);
                    return;
                }
                return;
            }
            return;
        }
        super.m3202a(unit, f, i);
    }

    /* renamed from: b */
    public void m4949b(Unit unit, float f, int i) {
        if (this.f2861w.f3068dv != null) {
            this.f2840b.m5167a(this.f2861w.f3068dv, 5);
        }
        if (this.f2861w.f3008bW) {
            this.f3894T = CommonUtils.m2368a(this.f3894T, f);
            if (this.f3894T == 0.0f) {
                this.f3894T = this.f2861w.f3009bX;
                if (this.f2861w.f3010bY != null) {
                    C0247ap c0247ap = this.f1648cJ[i];
                    PointF m5034E = m5034E(i);
                    this.f2861w.f3010bY.m4678a(m5034E.x, m5034E.y, this.height, c0247ap.f1711a, this);
                }
                if (this.f2861w.f3011bZ != null) {
                    this.f2861w.f3011bZ.m4678a(unit.f6951ek, unit.f6952el, unit.height, unit.direction, unit);
                    return;
                }
                return;
            }
            return;
        }
        super.m3119b(unit, f, i);
    }

    /* renamed from: cf */
    public boolean m4886cf() {
        return this.f2862x.f2249m;
    }

    /* renamed from: dE */
    public boolean m4860dE() {
        if (this.f2861w.f2928Y != null && !this.f2861w.f2928Y.read(this)) {
            return false;
        }
        if (!this.f2862x.f2249m) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6093bs.m6354c(this.team) && !gameEngine.f6093bs.m6374b()) {
                return false;
            }
        }
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2469o) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m4796t() {
        C0399m dl = m5778dl();
        if (dl != null && dl.f2467m) {
            return true;
        }
        return this.f2861w.f2952aL;
    }

    /* renamed from: cT */
    public boolean m4897cT() {
        C0399m dl = m5778dl();
        if (dl != null && dl.f2468n) {
            return true;
        }
        return this.f2861w.f2953aM;
    }

    /* renamed from: d */
    public boolean m4867d(Unit unit) {
        C0453l c0453l = this.f2861w;
        return (c0453l.f2958aR == null || C0448g.m5061a(c0453l.f2958aR, unit.m5787dc())) && !m4859dF() && !c0453l.f2954aN;
    }

    /* renamed from: cU */
    public boolean m4896cU() {
        return this.f2861w.f2959aS;
    }

    /* renamed from: cS */
    public boolean m4898cS() {
        return this.f2861w.f2954aN || m5755u() || (this.f1623ck < 1.0f && this.f2861w.f2971bh <= 0.0f);
    }

    /* renamed from: df */
    public C0449h m4853df() {
        return this.f2861w.f2922O;
    }

    /* renamed from: am */
    public float m4958am() {
        return this.f2861w.f3120eB;
    }

    /* renamed from: an */
    public boolean m4957an() {
        return super.m3139an() || this.f2861w.f3119eA;
    }

    /* renamed from: a */
    public boolean m4980a(GameEngine gameEngine) {
        if (!gameEngine.f6245cN.m7189b(this.f6951ek, this.f6952el)) {
            if (!this.f2861w.f2910A) {
                return false;
            }
            boolean z = false;
            if (this.f2861w.f2911B != null) {
                C0453l.f3183a.m7207a(this.f2861w.f2911B);
                C0453l.f3183a.m7209a((int) this.f6951ek, (int) this.f6952el);
                if (gameEngine.f6247cP.m7203b(C0453l.f3183a)) {
                    z = true;
                }
            }
            if (gameEngine.f6245cN.m7189b(this.f6951ek, this.f6952el - this.height)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.f1650cL != null) {
            return false;
        }
        if ((this.f1652cN != null && this.f1652cN.f2482I) || !m5794d(gameEngine.f6093bs) || !m4860dE()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC0623y m4990a(C0399m c0399m) {
        return C0398l.m5303a(this, c0399m);
    }

    /* renamed from: a */
    public C0399m m4978a(short s) {
        return C0398l.m5299a(this, s);
    }

    /* renamed from: a */
    public boolean m4981a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        if (abstractC0623y == this) {
            return false;
        }
        if (c0399m == null) {
            GameEngine.m1145b("attachRequest: No attachedSlotData");
            return false;
        }
        AbstractC0623y m5303a = C0398l.m5303a(this, c0399m);
        if (m5303a != null) {
            GameEngine.m1145b("attachRequest: a unit is already in slot (parent:" + m5795cz() + " slot:" + c0399m.m5292b() + " existing:" + m5303a.m5844cB() + ")");
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0398l.m5302a(this, c0399m, abstractC0623y);
        abstractC0623y.f1651cM = this;
        abstractC0623y.f1652cN = c0399m;
        abstractC0623y.f1653cO = gameEngine.f6096by;
        abstractC0623y.collidable = false;
        return true;
    }

    /* renamed from: b */
    public boolean m4943b(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f1651cM != this) {
            GameEngine.m1145b("deattachRequest: unit is not attached");
            return false;
        }
        C0399m c0399m = abstractC0623y.f1652cN;
        if (c0399m == null) {
            GameEngine.m1145b("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        AbstractC0623y m5303a = C0398l.m5303a(this, c0399m);
        if (m5303a == null) {
            GameEngine.m1145b("deattachRequest: Failed, no unit in slot");
            GameEngine.m1120g("deattachRequest");
            return false;
        } else if (abstractC0623y != m5303a) {
            String str = "null";
            if (m5303a != null) {
                str = m5303a.m5795cz();
            }
            GameEngine.m1145b("deattachRequest: unit and slot don't match - requested:" + abstractC0623y.m5795cz() + " current:" + str);
            return false;
        } else {
            if (this.f2865A.remove(abstractC0623y)) {
                m5036D(abstractC0623y);
            }
            C0398l.m5302a(this, c0399m, (AbstractC0623y) null);
            abstractC0623y.f1651cM = null;
            abstractC0623y.f1652cN = null;
            abstractC0623y.m5820c_();
            m5888a(EnumC0347ae.f2188r, this);
            return true;
        }
    }

    /* renamed from: dF */
    public boolean m4859dF() {
        C0399m dl = m5778dl();
        if (dl != null && !dl.f2466l) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean m5024J() {
        if (m4859dF() || this.f2861w.f2955aO) {
            return true;
        }
        return false;
    }

    /* renamed from: dg */
    public void m4852dg() {
        C0453l c0453l = this.f2861w;
        if (!c0453l.f3238cq.m5209b()) {
            c0453l.f3238cq.mo5237a(this);
        }
        if (!c0453l.f3239cr.m5209b() && this.f1623ck >= 1.0f) {
            c0453l.f3239cr.mo5237a(this);
        }
        super.m5783dg();
    }

    /* renamed from: dh */
    public void m4851dh() {
        C0453l c0453l = this.f2861w;
        if (!c0453l.f3238cq.m5209b()) {
            c0453l.f3238cq.m5185h(this);
        }
        if (!c0453l.f3239cr.m5209b() && this.f1623ck >= 1.0f) {
            c0453l.f3239cr.m5185h(this);
        }
        super.m5782dh();
    }

    /* renamed from: a */
    public void m4992a(C0305au c0305au) {
        m5889a(EnumC0347ae.f2180j);
        C0399m dl = m5778dl();
        if (dl != null && dl.f2460H) {
            EnumC0306av m5676d = c0305au.m5676d();
            if (m5676d == EnumC0306av.f1817h || m5676d == EnumC0306av.f1810a) {
                m3081bx();
            }
        }
    }

    /* renamed from: b_ */
    public boolean m4927b_() {
        C0453l c0453l = this.f2861w;
        if (!c0453l.f2957aQ && GameEngine.getInstance().f6093bs.m6354c(this.team)) {
            return false;
        }
        return c0453l.f2956aP;
    }

    /* renamed from: di */
    public boolean m4850di() {
        return this.f2861w.f2929Z;
    }

    /* renamed from: dj */
    public boolean m4849dj() {
        return this.f2861w.f3256eF;
    }

    /* renamed from: dk */
    public boolean m4848dk() {
        return this.f2861w.f3257eG;
    }

    /* renamed from: G */
    public boolean m5028G(Unit unit) {
        int m4858dG = m4858dG();
        int m5799cu = unit.m5799cu();
        if (this.f2861w.f3124eJ) {
            m5799cu = 1;
        }
        if (m4858dG + m5799cu <= this.f2861w.f3258eH) {
            return true;
        }
        return false;
    }

    /* renamed from: dG */
    public int m4858dG() {
        int i = 0;
        if (this.f2861w.f3124eJ) {
            i = 0 + this.f2865A.size();
        } else if (this.f2865A.f6888a > 0) {
            Iterator it = this.f2865A.iterator();
            while (it.hasNext()) {
                i += ((Unit) it.next()).m5799cu();
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m4837e(Team team) {
        C0399m m5778dl;
        if (this.team == team) {
            return;
        }
        super.m5773e(team);
        if (this.f2865A != null && !this.f2861w.f3132eS) {
            Iterator it = this.f2865A.iterator();
            while (it.hasNext()) {
                ((Unit) it.next()).m5773e(team);
            }
        }
        if (this.f2866B != null) {
            Iterator it2 = this.f2866B.iterator();
            while (it2.hasNext()) {
                Unit unit = (Unit) it2.next();
                if (unit != null && (m5778dl = unit.m5778dl()) != null && !m5778dl.f2457z) {
                    unit.m5773e(team);
                }
            }
        }
        m5889a(EnumC0347ae.f2181k);
    }

    /* renamed from: cM */
    public C0424b m4904cM() {
        return this.f2861w.f3016cg;
    }

    /* renamed from: cg */
    public void m4885cg() {
        if (this.f2861w.f2982bs) {
            if (this.f1631cs <= -1.0f) {
                this.f1631cs = -1.0f;
                return;
            }
            return;
        }
        super.m5813cg();
    }

    /* renamed from: bz */
    public C1101m m4911bz() {
        return this.f2865A;
    }

    /* renamed from: e */
    public C1101m m4833e(boolean z) {
        this.f2895ec.clear();
        if (this.f2861w.f3223az.f6888a > 0) {
            C0398l.m5300a(this, this.f2895ec, z);
        }
        if (this.f2895ec.f6888a > 0) {
            return this.f2895ec;
        }
        return null;
    }

    /* renamed from: dm */
    public float m4847dm() {
        return this.f2861w.f3050cZ;
    }

    /* renamed from: dn */
    public boolean m4846dn() {
        return this.f2861w.f3203z;
    }

    /* renamed from: dH */
    public void m4857dH() {
        if (this.f2862x.f2237a) {
            this.f2862x = this.f2862x.m5358b();
        }
    }
}
