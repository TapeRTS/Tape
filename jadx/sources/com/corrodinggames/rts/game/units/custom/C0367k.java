package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0384d;
import com.corrodinggames.rts.game.units.AbstractC0513p;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0206ab;
import com.corrodinggames.rts.game.units.C0213ai;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0178a;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.EnumC0272b;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.EnumC0524z;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p016a.C0304f;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0302d;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a;
import com.corrodinggames.rts.game.units.custom.p018b.C0330c;
import com.corrodinggames.rts.game.units.custom.p018b.C0331d;
import com.corrodinggames.rts.game.units.custom.p018b.C0335h;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p023d.AbstractC0413h;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0414i;
import com.corrodinggames.rts.game.units.p023d.C0415j;
import com.corrodinggames.rts.game.units.p023d.C0422o;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.game.units.p025e.C0441i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0536ab;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0814ag;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/k.class */
public final class C0367k extends AbstractC0513p implements AbstractC0208ad, AbstractC0384d, AbstractC0416k {

    /* renamed from: a */
    public int f2439a;

    /* renamed from: d */
    float f2440d;

    /* renamed from: e */
    float f2441e;

    /* renamed from: f */
    public float f2442f;

    /* renamed from: g */
    boolean f2443g;

    /* renamed from: l */
    boolean f2444l;

    /* renamed from: m */
    float f2445m;

    /* renamed from: n */
    boolean f2446n;

    /* renamed from: o */
    float f2447o;

    /* renamed from: p */
    boolean f2448p;

    /* renamed from: q */
    float f2449q;

    /* renamed from: r */
    float f2450r;

    /* renamed from: s */
    public float f2451s;

    /* renamed from: t */
    public boolean f2452t;

    /* renamed from: u */
    float f2453u;

    /* renamed from: v */
    public C0368l f2454v;

    /* renamed from: w */
    public C0368l f2455w;

    /* renamed from: z */
    public float f2456z;

    /* renamed from: C */
    C0163f[] f2457C;

    /* renamed from: dn */
    Paint f2458dn;

    /* renamed from: dp */
    public float f2459dp;

    /* renamed from: dq */
    public float f2460dq;

    /* renamed from: dr */
    public float f2461dr;

    /* renamed from: dx */
    C0365i f2462dx;

    /* renamed from: dl */
    static PointF f2463dl = new PointF();

    /* renamed from: dm */
    static PointF f2464dm = new PointF();

    /* renamed from: dt */
    static ArrayList f2465dt = new ArrayList();

    /* renamed from: du */
    public static C0835m f2466du = new C0835m();

    /* renamed from: dv */
    public static C0835m f2467dv = new C0835m();

    /* renamed from: dw */
    static PointF f2468dw = new PointF();

    /* renamed from: dy */
    protected static final C0814ag f2469dy = new C0814ag();

    /* renamed from: b */
    public final C0355e f2470b = new C0355e(this);

    /* renamed from: c */
    float f2471c = 1.0f;

    /* renamed from: h */
    public boolean f2472h = true;

    /* renamed from: i */
    public boolean f2473i = true;

    /* renamed from: j */
    float f2474j = 1.0f;

    /* renamed from: k */
    boolean f2475k = false;

    /* renamed from: x */
    public final C0835m f2476x = new C0835m();

    /* renamed from: y */
    public C0835m f2477y = null;

    /* renamed from: A */
    PointF[] f2478A = null;

    /* renamed from: B */
    PointF[] f2479B = null;

    /* renamed from: do */
    final C0415j f2480do = new C0415j(this);

    /* renamed from: ds */
    public C0331d[] f2481ds = null;

    /* renamed from: dz */
    C0835m f2482dz = new C0835m();

    /* renamed from: K */
    public void m3096K() {
        this.f2478A = new PointF[6];
        this.f2479B = new PointF[this.f2478A.length];
        for (int i = 0; i < this.f2478A.length; i++) {
            this.f2478A[i] = new PointF();
            this.f2479B[i] = new PointF();
        }
    }

    /* renamed from: b */
    public PointF[] mo2497b() {
        if (this.f2478A == null) {
            m3096K();
        }
        return this.f2478A;
    }

    /* renamed from: c */
    public PointF[] mo2495c() {
        if (this.f2478A == null) {
            m3096K();
        }
        return this.f2479B;
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.mo1109a(9);
        apVar.mo1110a(this.f2441e);
        apVar.mo1110a(this.f2445m);
        apVar.mo1104a(this.f2446n);
        apVar.mo1109a(this.f2476x.size());
        Iterator it = this.f2476x.iterator();
        while (it.hasNext()) {
            apVar.mo1108a((AbstractC0210af) it.next());
        }
        apVar.mo1104a(this.f2448p);
        apVar.mo1110a(this.f2447o);
        apVar.mo1110a(this.f2442f);
        apVar.mo1110a(this.f2449q);
        apVar.mo1104a(this.f2452t);
        byte b = 0;
        if (this.f2481ds != null) {
            b = (byte) this.f2481ds.length;
        }
        apVar.m1175c(b);
        if (this.f2481ds != null) {
            for (int i = 0; i < b; i++) {
                C0331d dVar = this.f2481ds[i];
                apVar.mo1110a(dVar.f2233b);
                apVar.mo1110a(dVar.f2234c);
                apVar.mo1110a(dVar.f2245d);
                apVar.mo1110a(dVar.f2239i);
                apVar.mo1104a(dVar.f2240k);
                apVar.mo1104a(dVar.f2246j);
                apVar.mo1104a(dVar.f2247m);
                apVar.mo1104a(dVar.f2248n);
            }
        }
        this.f2480do.m2753a(apVar);
        apVar.m1194a(this.f2455w);
        apVar.mo1104a(this.f2473i);
        apVar.mo1104a(this.f2472h);
        boolean z = this.f2462dx != this.f2454v.f2499G;
        apVar.mo1104a(z);
        if (z) {
            C0364h.m3117a(this.f2462dx, apVar);
        }
        super.mo1654a(apVar);
    }

    /* renamed from: a */
    public void mo2031a(C0707k kVar) {
        AbstractC0268al p;
        byte d;
        C0331d dVar;
        if (kVar.m1085b() >= 32) {
            int f = kVar.m1076f();
            this.f2441e = kVar.m1075g();
            this.f2445m = kVar.m1075g();
            this.f2446n = kVar.m1077e();
            this.f2476x.clear();
            int f2 = kVar.m1076f();
            for (int i = 0; i < f2; i++) {
                AbstractC0210af n = kVar.m1068n();
                if (n != null) {
                    this.f2476x.add(n);
                }
            }
            if (f >= 1) {
                this.f2448p = kVar.m1077e();
            }
            if (f >= 2) {
                this.f2447o = kVar.m1075g();
            }
            if (f >= 3) {
                this.f2442f = kVar.m1075g();
                this.f2449q = kVar.m1075g();
            }
            if (f >= 4) {
                this.f2452t = kVar.m1077e();
            }
            if (f >= 5 && (d = kVar.m1079d()) != 0) {
                m2998dh();
                if (this.f2481ds == null) {
                    AbstractC0789l.m683d("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < d; i2++) {
                    if (this.f2481ds == null) {
                        dVar = new C0331d();
                    } else if (i2 >= this.f2481ds.length) {
                        AbstractC0789l.m683d("readIn: legs " + i2 + ">=" + this.f2481ds.length);
                        dVar = new C0331d();
                    } else {
                        dVar = this.f2481ds[i2];
                    }
                    dVar.f2233b = kVar.m1075g();
                    dVar.f2234c = kVar.m1075g();
                    dVar.f2245d = kVar.m1075g();
                    dVar.f2239i = kVar.m1075g();
                    dVar.f2240k = kVar.m1077e();
                    dVar.f2249o = true;
                    dVar.f2246j = kVar.m1077e();
                    dVar.f2247m = kVar.m1077e();
                    dVar.f2248n = kVar.m1077e();
                }
            }
            if (f >= 6) {
                this.f2480do.m2752a(kVar);
            }
            if (f >= 7 && (p = kVar.m1066p()) != null) {
                if (p instanceof C0368l) {
                    this.f2455w = (C0368l) p;
                } else {
                    AbstractC0789l.m695b("Got non CustomUnitMetadata object of:" + p.mo3494i() + " loading real_meta");
                    this.f2455w = C0368l.f2483b;
                }
            }
            if (f >= 8) {
                this.f2473i = kVar.m1077e();
                this.f2472h = kVar.m1077e();
            }
            if (f >= 9 && kVar.m1077e()) {
                m3074a(C0364h.m3116a(kVar), true);
            }
        }
        super.mo2031a(kVar);
        if (this.f2481ds != null) {
            this.f2459dp = this.f5841dH;
            this.f2460dq = this.f5842dI;
            this.f2461dr = this.f1444bL;
        }
    }

    /* renamed from: cc */
    public boolean mo2631cc() {
        return this.f2454v.f2830eB > 0;
    }

    /* renamed from: f */
    public int mo2627f() {
        return this.f2476x.size();
    }

    /* renamed from: m_ */
    public boolean mo2625m_() {
        return this.f2446n;
    }

    /* renamed from: d */
    public boolean mo2630d(AbstractC0210af afVar, boolean z) {
        if (this.f2454v.f2830eB == 0 || this.f2446n || this.f1529bR < 1.0f || !m3099C(afVar) || afVar == this) {
            return false;
        }
        if (this.f1441bB != afVar.f1441bB && !z && (!this.f2454v.f2601ci || this.f1441bB != AbstractC0171m.f1281g)) {
            return false;
        }
        if (this.f2454v.f2709eE != null && !this.f2454v.f2709eE.m3110a() && !C0364h.m3118a(this.f2454v.f2709eE, afVar.mo3582cM())) {
            return false;
        }
        if (this.f2454v.f2831eF.size() > 0) {
            boolean z2 = false;
            Iterator it = this.f2454v.f2831eF.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((EnumC0212ah) it.next()) == afVar.mo2424h()) {
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
        return C0851y.m421a(afVar, this.f2454v.f2710eG, this.f2454v.f2711eH);
    }

    /* renamed from: e */
    public boolean mo2628e(AbstractC0210af afVar, boolean z) {
        if (!mo2630d(afVar, z)) {
            return false;
        }
        m2971y(afVar);
        return true;
    }

    /* renamed from: y */
    public void m2971y(AbstractC0210af afVar) {
        afVar.f1539cp = this;
        this.f2476x.add(afVar);
        if (this.f2454v.f2602cj && this.f1441bB == AbstractC0171m.f1281g) {
            mo3595c(afVar.f1441bB);
        }
        mo3629a(EnumC0306ab.f1981l);
        AbstractC0789l.m651u().f5481bA.m1721l(afVar);
    }

    /* renamed from: z */
    public void m2969z(AbstractC0210af afVar) {
        mo3629a(EnumC0306ab.f1982m);
        if (this.f2454v.f2603ck && this.f2476x.size() == 0) {
            mo3595c(AbstractC0171m.f1281g);
        }
    }

    /* renamed from: e */
    public void mo2629e(AbstractC0210af afVar) {
        if (afVar.f1539cp == this) {
            this.f2476x.remove(afVar);
            afVar.f1539cp = null;
            m2969z(afVar);
            return;
        }
        AbstractC0789l.m676f("Unit is not being transported");
    }

    /* renamed from: L */
    public void m3095L() {
        if (this.f2454v.f2830eB != 0) {
            this.f2446n = true;
            this.f2445m = 30.0f;
        }
    }

    /* renamed from: cY */
    public void m3014cY() {
        if (this.f2454v.f2830eB != 0) {
            this.f2446n = false;
        }
    }

    /* renamed from: i */
    public boolean m2985i(boolean z) {
        if (this.f2476x.size() == 0) {
            return false;
        }
        return m3049b((AbstractC0210af) this.f2476x.remove(this.f2476x.size() - 1), z, this.f2476x.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m3082a(AbstractC0210af afVar, boolean z, boolean z2) {
        this.f2476x.remove(afVar);
        return m3049b(afVar, z, z2);
    }

    /* renamed from: b */
    private boolean m3049b(AbstractC0210af afVar, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.f2454v.f2637cW != null) {
            f = this.f2454v.f2637cW.floatValue();
        }
        float f2 = 70.0f;
        if (this.f2454v.f2640cZ != null) {
            f2 = this.f2454v.f2640cZ.floatValue();
        }
        float f3 = this.f2454v.f2635cU;
        float f4 = this.f2454v.f2636cV;
        float i = (this.f5841dH + (C0654f.m1474i(this.f1444bL + f) * f4)) - (C0654f.m1478h(this.f1444bL + f) * f3);
        float h = this.f5842dI + (C0654f.m1478h(this.f1444bL + f) * f4) + (C0654f.m1474i(this.f1444bL + f) * f3);
        float i2 = i + (C0654f.m1474i(this.f1444bL + 90.0f) * (z2 ? -7.0f : 7.0f));
        float h2 = h + (C0654f.m1478h(this.f1444bL + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !mo2797bw()) {
            if (!C0851y.m427a(afVar, i2, h2)) {
                i2 += 10.0f;
            }
            if (!C0851y.m427a(afVar, i2, h2)) {
                i2 -= 20.0f;
            }
            if (!C0851y.m427a(afVar, i2, h2)) {
                i2 -= 10.0f;
                h2 += 10.0f;
            }
            if (!C0851y.m427a(afVar, i2, h2)) {
                h2 -= 20.0f;
            }
        }
        if (z || C0851y.m427a(afVar, i2, h2) || mo2797bw()) {
            z3 = true;
            boolean z4 = false;
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1540cq == this) {
                    C0336i cV = rVar.m3574cV();
                    if (cV == null) {
                        AbstractC0789l.m683d("Unload, attachment data is null");
                    }
                    if (cV != null) {
                        z4 = cV.f2277E;
                    }
                }
            }
            C0851y.m422a(afVar, this);
            float f5 = this.f1444bL + f;
            if (!z4) {
                afVar.f5841dH = i2;
                afVar.f5842dI = h2;
                afVar.f1444bL = f5;
                afVar.f1526bI = 0.0f;
                afVar.f1525bH = 0.0f;
                afVar.f1522bD = 0.0f;
                afVar.f1523bE = 0.0f;
                afVar.f1522bD += 0.1f;
            }
            afVar.f1439bw = this;
            afVar.f1440bx = 45.0f;
            if (z4) {
                afVar.f1440bx = 85.0f;
            }
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                if (!z4) {
                    rVar2.m2225j(afVar.f1444bL);
                }
                if (!this.f2454v.f2715eL.read(this)) {
                    rVar2.m2292ax();
                    if (f2 != 0.0f) {
                        rVar2.m2249d(afVar.f5841dH + (C0654f.m1474i(f5 + (z2 ? -7.0f : 7.0f)) * f2), afVar.f5842dI + (C0654f.m1478h(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    rVar2.f3415T = 0;
                } else {
                    rVar2.m2338aE();
                }
            }
            if (!z4) {
                if (!this.f2454v.f2639cY) {
                    afVar.f5843dJ = this.f5843dJ;
                }
                afVar.f5843dJ += this.f2454v.f2638cX;
            }
            if (afVar instanceof C0367k) {
                ((C0367k) afVar).m2994dl();
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            this.f2476x.add(afVar);
        } else {
            m2969z(afVar);
        }
        return z3;
    }

    /* renamed from: bK */
    public int mo2636bK() {
        if (this.f2454v.f2830eB == 0 || !this.f2454v.f2487s) {
            return -1;
        }
        return m2991do();
    }

    /* renamed from: bL */
    public int mo2635bL() {
        if (this.f2454v.f2830eB == 0 || !this.f2454v.f2487s) {
            return -1;
        }
        return this.f2454v.f2830eB;
    }

    /* renamed from: cZ */
    public void m3013cZ() {
        if (this.f2476x.f5778a > 0) {
            m2983j(this.f2454v.f2714eK.read(this));
        }
    }

    /* renamed from: j */
    public void m2983j(boolean z) {
        Iterator it = this.f2476x.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            afVar.f1539cp = null;
            afVar.f5841dH = this.f5841dH + (C0654f.m1474i(this.f1444bL) * (-9.0f));
            afVar.f5842dI = this.f5842dI + (C0654f.m1478h(this.f1444bL) * (-9.0f));
            if (z) {
                afVar.f1450bY = -1.0f;
            }
        }
        this.f2476x.clear();
    }

    /* renamed from: bp */
    public void mo3603bp() {
        if (!this.f1520bz) {
            mo3629a(EnumC0306ab.f1972c);
        }
        Object[] a = this.f2454v.f2773h.m490a();
        for (int i = this.f2454v.f2773h.f5778a - 1; i >= 0; i--) {
            ((AbstractC0328a) a[i]).mo3254b(this);
        }
        super.mo3603bp();
    }

    /* renamed from: a */
    public void mo2099a() {
        m3013cZ();
        Object[] a = this.f2454v.f2773h.m490a();
        for (int i = this.f2454v.f2773h.f5778a - 1; i >= 0; i--) {
            ((AbstractC0328a) a[i]).mo3252c(this);
        }
        AbstractC0171m.m3812a((AbstractC0210af) this);
        this.f2480do.m2746e();
        super.mo2099a();
    }

    /* renamed from: da */
    public C0368l mo1660r() {
        return this.f2454v;
    }

    /* renamed from: I */
    public boolean mo2440I() {
        if (!this.f2454v.f2523aw && !this.f2443g && this.f1540cq == null) {
            return true;
        }
        return false;
    }

    /* renamed from: aN */
    public boolean m3066aN() {
        if (this.f2454v.f2665dC) {
            return false;
        }
        C0336i cV = m3574cV();
        if (cV == null || cV.f2283O) {
            return true;
        }
        return false;
    }

    /* renamed from: aO */
    public boolean m3065aO() {
        if (this.f2454v.f2523aw) {
            return false;
        }
        C0336i cV = m3574cV();
        if (cV == null || cV.f2279H) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public EnumC0212ah mo2424h() {
        return this.f2454v.f2722eW;
    }

    /* renamed from: i */
    public boolean mo2423i() {
        return this.f2454v.f2722eW == EnumC0212ah.f1555d && this.f5843dJ >= 4.0f;
    }

    /* renamed from: P */
    public boolean mo2437P() {
        return this.f5843dJ <= -1.0f;
    }

    /* renamed from: cf */
    public boolean mo2468cf() {
        if (mo2424h() == EnumC0212ah.f1556e) {
            return true;
        }
        return false;
    }

    /* renamed from: cd */
    public boolean mo3434cd() {
        if (mo2424h() == EnumC0212ah.f1555d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public C0748e mo2419v() {
        if (this.f1441bB.f1230i == -1 || this.f2454v.f2516ah == null) {
            return null;
        }
        return this.f2454v.f2516ah[this.f1441bB.m3822M()];
    }

    /* renamed from: d */
    public C0748e mo2431d() {
        if (!this.f1520bz || this.f2454v.f2789ac == null) {
            return this.f2454v.f2792ag[this.f1441bB.m3822M()];
        }
        return this.f2454v.f2789ac;
    }

    /* renamed from: k */
    public C0748e mo2422k() {
        return this.f2454v.f2791ae;
    }

    /* renamed from: F */
    public boolean mo2443F() {
        return AbstractC0789l.m651u().f5479by.renderExtraShadows && (!this.f1520bz || this.f5843dJ >= 1.0f) && this.f5843dJ >= -1.0f;
    }

    /* renamed from: d */
    public C0748e mo2430d(int i) {
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2127B != null && asVar.f2127B.read(this)) {
            return null;
        }
        if (asVar.f2162aD != null) {
            return asVar.f2162aD[this.f1441bB.m3822M()];
        }
        if (asVar.f2161aC != null) {
            return asVar.f2161aC;
        }
        if (this.f2454v.f2793ai != null) {
            return this.f2454v.f2793ai[this.f1441bB.m3822M()];
        }
        return this.f2454v.f2790ad;
    }

    /* renamed from: h */
    public float m2989h(int i) {
        return this.f2454v.f2836fE[i].f2164aF;
    }

    /* renamed from: i */
    public float m2987i(int i) {
        return this.f2454v.f2836fE[i].f2165aG;
    }

    /* renamed from: e */
    public boolean mo2428e() {
        AbstractC0171m mVar;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (mo2797bw()) {
            u.f5483bC.m971a(this);
        }
        if (this.f1529bR >= 1.0f) {
            if (!this.f2454v.f2723eX) {
                m406R(0);
            }
            if (this.f2454v.f2564bn != null && this.f2454v.f2564bn.m2874b()) {
                this.f2454v.f2564bn.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, null);
            }
            if (this.f2454v.f2804bq != -1) {
                m3085a((AbstractC0210af) null, this.f5841dH, this.f5842dI, this.f2454v.f2804bq, (C0317am) null, 0);
            }
            if (this.f2454v.f2566br != null) {
                if (!this.f2454v.f2567bs || this.f1511be == null || this.f1511be.f1441bB == null) {
                    mVar = this.f1441bB;
                } else {
                    mVar = this.f1511be.f1441bB;
                }
                if (!mVar.f1244u) {
                    this.f2454v.f2566br.m3284a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, mVar, this.f1460ci, this);
                }
            }
            this.f1519by = false;
            if (!this.f2454v.f2723eX) {
                m3013cZ();
            }
            if (this.f2454v.f2553bc) {
                boolean z = false;
                if (this.f2454v.f2557bg && u.m766H() && u.f5486bF.f4763aH.f4818i) {
                    z = true;
                }
                if (!z) {
                    C0163f a = C0422o.m2715a(this, this.f5841dH, this.f5842dI, this.f5841dH, this.f5842dI);
                    a.f967aH = false;
                    a.f945Z = this.f2454v.f2554bd;
                    a.f944Y = this.f2454v.f2555be;
                }
            }
            if (this.f2454v.f2552bb != 0) {
                C0206ab abVar = new C0206ab(false);
                abVar.f5841dH = this.f5841dH;
                abVar.f5842dI = this.f5842dI;
                abVar.mo3633a(AbstractC0171m.f1280f);
                AbstractC0171m.m3777c(abVar);
            }
            if (this.f2454v.f2565bo != null) {
                this.f2454v.f2565bo.m3292a(this.f5841dH, this.f5842dI, 1.0f);
            }
            if (this.f2454v.f2701es) {
                if (this.f2454v.f2565bo == null) {
                    u.f5475bu.m2178a(C0530e.f3588z, 0.8f, this.f5841dH, this.f5842dI);
                }
                if (this.f2454v.f2560bj) {
                    if (!mo2423i() && !this.f2454v.f2827ey) {
                        C0169k.m3840a(this, 1);
                    }
                    if (this.f2454v.f2559bi != null) {
                        m2350a(this.f2454v.f2559bi, true);
                    } else if (this.f2454v.f2549aY) {
                        m2351a(EnumC0519u.f3505d);
                    }
                }
                if (this.f2454v.f2702et) {
                    for (int i = 0; i < mo2711bk(); i++) {
                        u.f5480bz.m2046d(this.f5841dH, this.f5842dI, this.f5843dJ);
                    }
                }
            } else {
                if (this.f2481ds != null) {
                    m2997di();
                    for (int i2 = 0; i2 < this.f2481ds.length; i2++) {
                        C0331d dVar = this.f2481ds[i2];
                        C0310af afVar = this.f2454v.f2796am[i2];
                        float f = this.f5841dH + dVar.f2233b;
                        float f2 = this.f5842dI + dVar.f2234c;
                        if (afVar.f2042F && !afVar.f2018m && (afVar.f2019n == null || !afVar.f2019n.read(this))) {
                            if (!C0851y.m409c(f, f2) && !this.f2454v.f2827ey) {
                                C0169k.m3842a(f, f2);
                            }
                            u.f5480bz.m2056b(f, f2, 0.0f);
                        }
                    }
                }
                if (mo2423i()) {
                    if (this.f2454v.f2560bj) {
                        if (this.f2454v.f2559bi != null) {
                            m2350a(this.f2454v.f2559bi, false);
                        } else {
                            u.f5480bz.m2056b(this.f5841dH, this.f5842dI, this.f5843dJ);
                        }
                    }
                    for (int i3 = 0; i3 < mo2711bk(); i3++) {
                        u.f5480bz.m2044e(this.f5841dH, this.f5842dI, this.f5843dJ);
                    }
                } else if (this.f2454v.f2560bj) {
                    if (this.f2454v.f2559bi != null) {
                        m2350a(this.f2454v.f2559bi, true);
                    } else {
                        m2351a(EnumC0519u.f3503b);
                    }
                }
            }
            if (this.f2454v.f2723eX) {
                return true;
            }
            if (this.f2454v.f2789ac == null) {
                return false;
            }
            this.f3387D = this.f2454v.f2789ac;
            this.f2439a = 0;
            this.f3756dP = true;
            return true;
        } else if (this.f2454v.f2563bm != null && this.f2454v.f2563bm.m2874b()) {
            this.f2454v.f2563bm.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, null);
            return false;
        } else if (this.f2454v.f2564bn == null || !this.f2454v.f2564bn.m2874b()) {
            m2351a(EnumC0519u.f3502a);
            return false;
        } else {
            this.f2454v.f2564bn.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, null);
            return false;
        }
    }

    /* renamed from: bl */
    public void m3033bl() {
        if (!this.f2454v.f2827ey) {
            super.m2263bl();
        }
    }

    /* renamed from: S */
    public void m3094S() {
        float C;
        super.m2393S();
        for (int i = 0; i < this.f2454v.f2836fE.length; i++) {
            C0213ai aiVar = this.f1462cn[i];
            AbstractC0789l.m683d("Dir was:" + aiVar.f1561a + " for name:" + this.f2454v.f2836fE[i].f2112a);
            AbstractC0789l.m683d("lockDelay:" + aiVar.f1564d + " shootCooldown:" + aiVar.f1565e);
            AbstractC0789l.m683d("updateAndShouldResetTurret:" + mo2713b(i, 0.0f));
            AbstractC0789l.m683d("idleDir:" + mo2507C(i));
            AbstractC0789l.m683d("diffDir:" + C0654f.m1510c(aiVar.f1561a, C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m3073a(C0368l lVar, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0368l lVar2 = this.f2454v;
        this.f2454v = lVar;
        this.f1471db = this.f2454v;
        m3614bF();
        m2982k(true);
        if (z) {
            for (int i = 0; i < lVar.f2836fE.length; i++) {
                this.f1462cn[i].m3535a(this.f1444bL + m3101B(i));
            }
        } else if (lVar.f2836fE.length > 1) {
            boolean z2 = true;
            if (lVar.f2836fE.length == lVar2.f2836fE.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= lVar.f2836fE.length) {
                        break;
                    }
                    if (!lVar.f2836fE[i2].f2112a.equalsIgnoreCase(lVar2.f2836fE[i2].f2112a)) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                C0213ai[] aiVarArr = new C0213ai[lVar.f2836fE.length];
                for (int i3 = 0; i3 < lVar.f2836fE.length; i3++) {
                    C0323as asVar = lVar.f2836fE[i3];
                    C0323as c = lVar2.m2932c(asVar.f2112a);
                    if (c != null) {
                        aiVarArr[asVar.f2116e] = this.f1462cn[c.f2116e];
                        this.f1462cn[c.f2116e] = null;
                    }
                }
                for (int i4 = 0; i4 < lVar.f2836fE.length; i4++) {
                    if (aiVarArr[i4] == null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= lVar.f2836fE.length) {
                                break;
                            } else if (this.f1462cn[i5] != null) {
                                aiVarArr[i4] = this.f1462cn[i5];
                                this.f1462cn[i5] = null;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (aiVarArr[i4] == null) {
                            aiVarArr[i4] = new C0213ai();
                        }
                        aiVarArr[i4].m3535a(this.f1444bL);
                    }
                }
                this.f1462cn = aiVarArr;
            }
        }
        m2101S(this.f2454v.f2510W);
        m2100T(this.f2454v.f2511X);
        this.f3756dP = false;
        this.f1447bO = this.f2454v.f2625cH;
        this.f1448bP = this.f2454v.f2629cO;
        if (this.f1520bz) {
            this.f2439a = 0;
        } else {
            this.f2439a = this.f2454v.f2504P;
        }
        this.f2443g = false;
        if (z) {
            this.f5843dJ += this.f2454v.f2821dF;
        }
        float f = this.f1451bZ;
        this.f1451bZ = this.f2454v.f2610cs;
        if (z) {
            this.f1450bY = this.f1451bZ;
        } else if (f == 0.0f) {
            this.f1450bY = this.f1451bZ;
        } else {
            this.f1450bY = (this.f1450bY / f) * this.f1451bZ;
        }
        float f2 = this.f1456ce;
        this.f1456ce = this.f2454v.f2611ct;
        if (this.f2454v.f2612cu) {
            if (this.f1453cb > this.f1456ce) {
                this.f1453cb = this.f1456ce;
            }
        } else if (z) {
            this.f1453cb = this.f1456ce;
        } else if (f2 == 0.0f) {
            this.f1453cb = this.f1456ce;
        } else {
            this.f1453cb = (this.f1453cb / f2) * this.f1456ce;
        }
        if (this.f2454v.f2617cz) {
            if (this.f1457cf > this.f2454v.f2616cy) {
                this.f1457cf = this.f2454v.f2616cy;
            }
        } else if (z) {
            this.f1457cf = this.f2454v.f2616cy * this.f2454v.f2621cD;
        } else if (lVar2.f2616cy == 0.0f) {
            this.f1457cf = this.f2454v.f2616cy;
        } else {
            this.f1457cf = (this.f1457cf / lVar2.f2616cy) * this.f2454v.f2616cy;
        }
        if (this.f1441bB == null) {
            this.f3387D = this.f2454v.f2787V;
        } else {
            mo2732Q();
        }
        if (this.f2454v.f2523aw && z) {
            this.f1444bL = -90.0f;
        }
        mo2432c_();
        if (!z) {
            boolean z3 = this.f2454v.mo3493j() != lVar2.mo3493j();
            if (this.f2454v.mo3493j()) {
                this.f1526bI = 0.0f;
                this.f1525bH = 0.0f;
                if (lVar2.mo3493j() && !this.f2454v.f2814cI.equals(lVar2.f2814cI)) {
                    z3 = true;
                }
            }
            if (z3) {
                u.f5483bC.m971a(this);
            }
        }
        this.f2474j = 1.0f;
        if (this.f2454v.f2813cp != -2) {
        }
        if (!this.f1520bz) {
            m2994dl();
        }
        if (this.f2454v.f2703eu) {
        }
        m2998dh();
        m3581cO().m3237a(this.f2454v);
        if (!z) {
            int bg = mo2496bg();
            for (int i6 = 0; i6 < bg; i6++) {
                C0213ai aiVar = this.f1462cn[i6];
                C0323as asVar2 = this.f2454v.f2836fE[i6];
                if (asVar2 != null) {
                    if (aiVar.f1565e > asVar2.f2169l) {
                        aiVar.f1565e = asVar2.f2169l;
                    }
                    if (aiVar.f1566f > asVar2.f2170m) {
                        aiVar.f1566f = asVar2.f2170m;
                    }
                }
            }
        }
        if (!z) {
            if (!this.f2454v.f2628cN) {
                this.f2480do.f3036b = null;
            }
            if (this.f2454v.f2721eV != lVar2.f2721eV) {
                m2338aE();
            }
        }
        if (this.f2454v.f2603ck && this.f2476x.size() == 0) {
            mo3595c(AbstractC0171m.f1281g);
        }
        if (this.f1460ci && !u.f5481bA.m1727i(this)) {
            u.f5481bA.m1721l(this);
        }
        if (!z) {
            Object[] a = this.f2454v.f2773h.m490a();
            for (int i7 = this.f2454v.f2773h.f5778a - 1; i7 >= 0; i7--) {
                ((AbstractC0328a) a[i7]).mo3259a(this, lVar2);
            }
            if (this.f1529bR >= 1.0f) {
                if (this.f2454v.f2633cS > lVar2.f2633cS) {
                    mo3591c(false);
                }
            } else if (this.f2454v.f2634cT > lVar2.f2634cT) {
                mo3591c(false);
            }
        }
        if (this.f2473i && this.f2454v.f2644dh != null) {
            this.f2470b.m3183a(this.f2454v.f2644dh, 7, true);
        }
    }

    /* renamed from: c_ */
    public void mo2432c_() {
        if (this.f2454v.f2523aw) {
            this.f1519by = false;
        } else if (!this.f1520bz) {
            this.f1519by = true;
            if (this.f2454v.f2700er) {
                this.f1519by = false;
            }
        } else {
            this.f1519by = false;
        }
        if (this.f1540cq != null) {
            this.f1519by = false;
        }
    }

    public C0367k(boolean z, C0368l lVar) {
        super(z);
        m3073a(lVar, true);
    }

    /* renamed from: a */
    public void mo1665a(float f) {
        float f2;
        AbstractC0268al c;
        float f3;
        C0573e c2;
        float f4;
        float f5;
        float f6;
        C0573e b;
        if (this.f2473i) {
            this.f2473i = false;
            Object[] a = this.f2454v.f2773h.m490a();
            for (int i = this.f2454v.f2773h.f5778a - 1; i >= 0; i--) {
                ((AbstractC0328a) a[i]).mo3264a(this);
            }
            m3048b(EnumC0306ab.f1970a);
        }
        C0368l lVar = this.f2454v;
        super.mo1665a(f);
        if (this.f1520bz && !this.f2444l) {
            if (this.f5843dJ > 0.0f) {
                if (!lVar.f2723eX || (this.f1528bK == 0.0f && this.f1525bH == 0.0f && this.f1526bI == 0.0f)) {
                    this.f2442f += lVar.f2824dK * f;
                    this.f5843dJ -= this.f2442f * f;
                } else {
                    this.f2442f += 0.017f * f;
                    this.f5843dJ -= this.f2442f * f;
                    PointF n = m2211n(f);
                    this.f5841dH += n.f224a;
                    this.f5842dI += n.f225b;
                    if (lVar.f2721eV == EnumC0212ah.f1555d) {
                        AbstractC0789l u = AbstractC0789l.m651u();
                        this.f1546cS += f;
                        this.f1469cQ += f;
                        if (lVar.f2724eY && this.f1546cS > 9.0f) {
                            this.f1546cS = C0654f.m1511c(1.0f, 3.0f);
                            C0573e b2 = u.f5480bz.m2051b(this.f5841dH, this.f5842dI, this.f5843dJ, EnumC0572d.f3816a, false, EnumC0576h.f3940b);
                            if (b2 != null) {
                                b2.f3876ap = 0;
                                b2.f3875ao = 0;
                                b2.f3899aq = (short) 2;
                                b2.f3834s = true;
                                b2.f3842F = 0.5f;
                                b2.f3860X = 60.0f;
                                b2.f3859W = 60.0f;
                                b2.f3844H = 0.9f;
                                b2.f3843G = 1.2f;
                                b2.f3900ar = false;
                                b2.f3853Q = 0.0f;
                                b2.f3854R = 0.0f;
                            }
                        }
                        if (this.f1469cQ > 7.0f) {
                            this.f1469cQ = 0.0f;
                            C0573e b3 = u.f5480bz.m2051b(this.f5841dH, this.f5842dI, this.f5843dJ, EnumC0572d.f3816a, false, EnumC0576h.f3939a);
                            if (b3 != null) {
                                C0574f.m2027b(b3, true);
                                b3.f3846J = this.f5841dH;
                                b3.f3847K = this.f5842dI;
                                b3.f3848L = this.f5843dJ;
                                b3.f3853Q += C0654f.m1511c(-0.1f, 0.1f) + this.f1525bH;
                                b3.f3854R += C0654f.m1511c(-0.1f, 0.1f) + this.f1526bI;
                                b3.f3846J += C0654f.m1511c(-4.0f, 4.0f);
                                b3.f3847K += C0654f.m1511c(-4.0f, 4.0f);
                            }
                        }
                    }
                }
            } else if (!this.f2475k) {
                this.f2475k = true;
                if (lVar.f2723eX) {
                    m3013cZ();
                    m406R(0);
                    if (lVar.f2789ac != null) {
                        this.f3387D = lVar.f2789ac;
                        this.f2439a = 0;
                        this.f3756dP = true;
                    } else {
                        m3608bU();
                    }
                }
                if (this.f2442f > 0.5d) {
                    if (lVar.f2562bl != null && lVar.f2562bl.m2877a()) {
                        lVar.f2562bl.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, null);
                    }
                    if (m3559cu()) {
                        if (lVar.f2561bk) {
                            m2351a(EnumC0519u.f3502a);
                        }
                        if (m3560ct()) {
                            AbstractC0789l.m651u().f5480bz.m2069a(this.f5841dH, this.f5842dI, 0.0f, 0, 0.0f, 0.0f, this.f1444bL);
                        }
                    } else if (lVar.f2561bk) {
                        m2351a(EnumC0519u.f3503b);
                    }
                }
                this.f2442f = 0.0f;
            } else if (!m3559cu()) {
                this.f5843dJ = 0.0f;
                this.f2444l = true;
            } else if (this.f5843dJ > -10.0f) {
                this.f2442f += 8.0E-4f * f;
                this.f5843dJ -= this.f2442f * f;
                if (m3560ct()) {
                    this.f2450r += f;
                    if (this.f2450r > 30.0f) {
                        this.f2450r = 0.0f;
                        if (mo2678j() && (b = AbstractC0789l.m651u().f5480bz.m2055b(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL)) != null) {
                            b.f3853Q = 0.0f;
                            b.f3854R = -0.1f;
                        }
                    }
                }
            } else {
                this.f2444l = true;
            }
        }
        if (!this.f1520bz) {
            AbstractC0789l u2 = AbstractC0789l.m651u();
            if (lVar.f2547aW != 0.0f && this.f1529bR < 1.0f) {
                float f7 = this.f1529bR + (lVar.f2547aW * f);
                if (f7 > 1.0f) {
                    AbstractC0171m.m3792b((AbstractC0210af) this);
                    this.f1529bR = 1.0f;
                    AbstractC0171m.m3777c(this);
                } else {
                    this.f1529bR = f7;
                }
            }
            if (!m3613bG()) {
                if (this.f1529bR < 1.0f) {
                    if (lVar.f2645di != null) {
                        this.f2470b.m3184a(lVar.f2645di, 8);
                        this.f2470b.m3186a(f);
                    } else if (lVar.f2646dj != null) {
                        this.f2470b.m3184a(lVar.f2646dj, 99);
                        this.f2470b.f2380b = this.f1529bR;
                        this.f2470b.f2388d = 0.0f;
                        this.f2470b.m3186a(f);
                    }
                }
                Object[] a2 = lVar.f2773h.m490a();
                for (int i2 = lVar.f2773h.f5778a - 1; i2 >= 0; i2--) {
                    ((AbstractC0328a) a2[i2]).mo3263a(this, f);
                }
                return;
            }
            Object[] a3 = lVar.f2773h.m490a();
            for (int i3 = lVar.f2773h.f5778a - 1; i3 >= 0; i3--) {
                ((AbstractC0328a) a3[i3]).mo3253b(this, f);
            }
            if (this.f2472h) {
                this.f2472h = false;
                mo3629a(EnumC0306ab.f1971b);
            }
            if (lVar.f2546aV != 0.0f && (this.f1450bY < this.f1451bZ || lVar.f2546aV < 0.0f)) {
                this.f1450bY += lVar.f2546aV * f;
                if (this.f1450bY > this.f1451bZ) {
                    this.f1450bY = this.f1451bZ;
                }
            }
            if (lVar.f2616cy != 0.0f) {
                if (!this.f2452t) {
                    f6 = lVar.f2618cA;
                } else {
                    f6 = lVar.f2619cB;
                }
                if (this.f1457cf < lVar.f2616cy || f6 < 0.0f) {
                    this.f1457cf += f6 * f;
                }
                if (this.f1457cf >= lVar.f2616cy) {
                    this.f1457cf = lVar.f2616cy;
                    this.f2452t = false;
                }
                if (this.f1457cf <= 0.0f) {
                    if (lVar.f2550aZ) {
                        mo2770bq();
                        return;
                    }
                    this.f1457cf = 0.0f;
                }
            }
            if (this.f1456ce != 0.0f) {
                if (lVar.f2615cx != 0.0f) {
                    this.f1453cb += lVar.f2615cx * f;
                    if (this.f1453cb > this.f1456ce) {
                        this.f1453cb = this.f1456ce;
                    }
                }
                if (this.f1453cb < 0.0f) {
                    this.f1453cb = 0.0f;
                }
                if (this.f1454cc != 0.0f) {
                    this.f1454cc -= (this.f1454cc * 0.02f) * f;
                    this.f1454cc = C0654f.m1574a(this.f1454cc, 0.0f, lVar.f2624cG * f);
                    if (this.f1454cc > 50.0f) {
                        this.f1454cc = 50.0f;
                    }
                }
            }
            this.f2480do.m2765a(f);
            C0368l lVar2 = this.f2454v;
            if (lVar2.f2730fe) {
                C0434b.m2670a(f, this);
            }
            if (!lVar2.f2809bZ.m3139b()) {
                this.f2447o += f;
                if (this.f2447o > lVar2.f2596cc - 0.1f) {
                    this.f2447o -= lVar2.f2596cc;
                    if (lVar2.f2598cf.read(this)) {
                        lVar2.f2809bZ.m3125e(this);
                    }
                }
            }
            if (this.f1538cm) {
                this.f2470b.m3184a(lVar2.f2818de, 3);
            } else if (!this.f2470b.f2389e || this.f2470b.f2379a == lVar2.f2819df) {
                this.f2470b.m3184a(lVar2.f2819df, 2);
            }
            if (lVar2.f2573bA) {
                if (lVar2.f2571by && u2.f5605cK) {
                    if (this.f1528bK > 0.0f || (this.f1528bK < 0.0f && lVar2.f2572bz)) {
                        this.f2450r += f;
                    }
                    if (this.f2450r > 10.0f) {
                        this.f2450r = 0.0f;
                        if (this.f5838dE && m3560ct()) {
                            float f8 = this.f1444bL + 180.0f;
                            if (this.f1528bK < 0.0f) {
                                f8 += 180.0f;
                            }
                            float f9 = this.f1447bO - 6.0f;
                            if (f9 < 4.0f) {
                                f9 = 4.0f;
                            }
                            u2.f5480bz.m2055b(this.f5841dH + (C0654f.m1474i(f8) * f9), this.f5842dI + (C0654f.m1478h(f8) * f9), 0.0f, f8);
                        }
                    }
                }
                if (u2.f5604cJ && ((this.f1528bK > 0.0f || this.f1528bK < 0.0f) && this.f5838dE)) {
                    this.f2440d += f;
                    if (this.f2440d > lVar2.f2579bG) {
                        this.f2440d = 0.0f;
                        if (this.f1528bK > 0.0f) {
                            if (lVar2.f2576bD != null) {
                                lVar2.f2576bD.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, this);
                            }
                        } else if (lVar2.f2577bE != null) {
                            float f10 = this.f1444bL;
                            if (lVar2.f2578bF) {
                                f10 += 180.0f;
                            }
                            lVar2.f2577bE.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, f10, this);
                        }
                        if (lVar2.f2574bB && ((this.f1528bK > 0.0f || lVar2.f2575bC) && !m3560ct())) {
                            int i4 = 0;
                            while (i4 <= 1) {
                                float f11 = i4 == 0 ? -20 : 20;
                                float f12 = this.f1444bL + 180.0f;
                                if (this.f1528bK < 0.0f) {
                                    f11 += 180.0f;
                                    f12 += 180.0f;
                                }
                                C0573e c3 = u2.f5480bz.m2048c(this.f5841dH + (C0654f.m1474i(this.f1444bL + 180.0f + f11) * (this.f1447bO - 1.0f)), this.f5842dI + (C0654f.m1478h(this.f1444bL + 180.0f + f11) * (this.f1447bO - 1.0f)), this.f5843dJ, f12 + C0654f.m1511c(-7.0f, 7.0f), 0);
                                if (c3 != null) {
                                    c3.f3853Q += C0654f.m1511c(-0.15f, 0.15f);
                                    c3.f3854R += C0654f.m1511c(-0.15f, 0.15f);
                                }
                                i4++;
                            }
                        }
                    }
                }
            }
            if (lVar2.f2830eB > 0) {
                if (lVar2.f2717eN != 0.0f && this.f2476x.f5778a > 0) {
                    Object[] a4 = this.f2476x.m490a();
                    for (int i5 = 0; i5 < this.f2476x.f5778a; i5++) {
                        AbstractC0210af afVar = (AbstractC0210af) a4[i5];
                        if (afVar.f1450bY < afVar.f1451bZ || lVar2.f2717eN < 0.0f) {
                            afVar.f1450bY += lVar2.f2717eN * f;
                            if (afVar.f1450bY > afVar.f1451bZ) {
                                afVar.f1450bY = afVar.f1451bZ;
                            }
                        }
                    }
                }
                if (this.f2446n && lVar2.f2718eR.read(this)) {
                    this.f2445m = C0654f.m1575a(this.f2445m, f);
                    if (this.f2445m == 0.0f) {
                        this.f2445m = lVar2.f2707eC;
                        if (this.f2476x.size() == 0) {
                            this.f2446n = false;
                        } else {
                            m2985i(false);
                            if (this.f2476x.size() == 0) {
                                this.f2446n = false;
                            }
                        }
                    }
                }
            }
            if (!this.f1538cm) {
                this.f2449q += f;
            } else {
                this.f2449q = 0.0f;
            }
            if (lVar2.f2721eV != EnumC0212ah.f1555d && this.f1540cq == null) {
                m2994dl();
            }
            if ((lVar2.f2721eV == EnumC0212ah.f1558g || lVar2.f2721eV == EnumC0212ah.f1559h) && this.f1538cm) {
                if (m3561cs()) {
                    this.f2474j = 0.7f;
                } else {
                    this.f2474j = 1.0f;
                }
            }
            if (lVar2.f2721eV == EnumC0212ah.f1555d) {
                this.f2441e += 2.0f * f;
                if (this.f2441e > 360.0f) {
                    this.f2441e -= 360.0f;
                }
                boolean i6 = mo2423i();
                boolean z = false;
                if (lVar2.f2666dD) {
                    boolean cu = m3559cu();
                    if (!this.f1538cm && !cu && this.f2449q > 3.0f && (!lVar2.f2667dE || m2301ao())) {
                        z = true;
                    }
                }
                if (this.f1540cq == null) {
                    if (z) {
                        if (lVar2.f2822dI < 0.0f) {
                            f5 = (C0654f.m1512c(this.f5843dJ - 2.0f) * 0.05f * 0.4f) + 0.2f;
                        } else {
                            f5 = lVar2.f2822dI;
                        }
                        this.f5843dJ = C0654f.m1574a(this.f5843dJ, 2.0f, f5 * f);
                    } else {
                        float h = lVar2.f2668dG + (C0654f.m1478h(this.f2441e) * lVar2.f2669dH);
                        if (lVar2.f2822dI < 0.0f) {
                            f4 = (C0654f.m1512c(this.f5843dJ - 2.0f) * 0.05f * 0.4f) + 0.2f;
                        } else {
                            f4 = lVar2.f2822dI;
                        }
                        this.f5843dJ = C0654f.m1574a(this.f5843dJ, h, C0654f.m1529b(f4, (C0654f.m1512c(this.f5843dJ - h) * 0.05f * 0.3f) + 0.1f) * f);
                    }
                    if (i6 != mo2423i()) {
                        this.f3425ao = true;
                        m2994dl();
                    }
                }
            } else {
                float f13 = lVar2.f2668dG - lVar2.f2669dH;
                if (this.f5843dJ < f13) {
                    this.f5843dJ += 0.2f * f;
                    if (this.f5843dJ >= f13) {
                        this.f5843dJ = f13;
                    }
                }
                if (!(lVar2.f2668dG == 0.0f && lVar2.f2669dH == 0.0f && this.f5843dJ <= 0.0f) && this.f1540cq == null) {
                    float f14 = lVar2.f2668dG;
                    if (lVar2.f2669dH != 0.0f) {
                        this.f2441e += 2.0f * f;
                        if (this.f2441e > 360.0f) {
                            this.f2441e -= 360.0f;
                        }
                        f14 += C0654f.m1478h(this.f2441e) * lVar2.f2669dH;
                    }
                    if (lVar2.f2822dI < 0.0f) {
                        f3 = (C0654f.m1512c(this.f5843dJ - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = lVar2.f2822dI;
                    }
                    this.f5843dJ = C0654f.m1574a(this.f5843dJ, f14, C0654f.m1529b(f3, (C0654f.m1512c(this.f5843dJ - f14) * 0.05f * 0.3f) + 0.1f) * f);
                    boolean z2 = false;
                    if (this.f5843dJ > lVar2.f2668dG + lVar2.f2669dH + 1.0f) {
                        this.f2442f += lVar2.f2823dJ * f;
                        if (this.f5843dJ < 0.0f) {
                            this.f2442f = C0654f.m1529b(this.f2442f, 0.2f);
                        }
                        this.f5843dJ -= this.f2442f * f;
                        if (this.f2442f > 1.5d) {
                            this.f1546cS += f;
                            if (this.f1546cS > 0.5d) {
                                this.f1546cS = 0.0f;
                                C0573e b4 = u2.f5480bz.m2051b(this.f5841dH + C0654f.m1511c(-this.f1447bO, this.f1447bO), this.f5842dI + C0654f.m1511c(-this.f1447bO, this.f1447bO), this.f5843dJ, EnumC0572d.f3816a, false, EnumC0576h.f3941c);
                                if (b4 != null) {
                                    b4.f3876ap = 0;
                                    b4.f3875ao = 0;
                                    b4.f3899aq = (short) 2;
                                    b4.f3834s = true;
                                    b4.f3835t = true;
                                    b4.f3836u = 40.0f;
                                    b4.f3897am = true;
                                    b4.f3853Q = 0.1f;
                                    b4.f3855S = 0.0f;
                                    b4.f3837v = true;
                                    b4.f3842F = 0.4f;
                                    b4.f3860X = 380.0f;
                                    b4.f3859W = b4.f3860X;
                                    b4.f3844H = 0.8f;
                                    b4.f3843G = 1.7f;
                                    b4.f3900ar = false;
                                    b4.f3853Q += C0654f.m1511c(-0.04f, 0.04f);
                                    b4.f3854R += C0654f.m1511c(-0.04f, 0.04f);
                                }
                            }
                        }
                        if (this.f5843dJ <= lVar2.f2668dG + lVar2.f2669dH + 1.0f) {
                            if (this.f2442f > 2.0f) {
                                z2 = true;
                            }
                            if (this.f5843dJ < lVar2.f2668dG + lVar2.f2669dH) {
                                this.f5843dJ = lVar2.f2668dG + lVar2.f2669dH;
                            }
                            this.f2442f = 0.0f;
                        }
                    } else {
                        if (this.f2442f > 2.0f) {
                            z2 = true;
                        }
                        this.f2442f = 0.0f;
                    }
                    if (z2 && (c2 = u2.f5480bz.m2047c(this.f5841dH, this.f5842dI, this.f5843dJ, 0)) != null) {
                        c2.f3844H = 0.8f;
                        c2.f3843G = 1.4f;
                        c2.f3859W = 60.0f;
                        c2.f3860X = c2.f3859W;
                    }
                }
            }
            boolean z3 = false;
            if (lVar2.f2545aU) {
                AbstractC0197s c4 = this.f2480do.m2748c();
                boolean z4 = false;
                if (c4 != null) {
                    if (c4 instanceof C0304f) {
                        C0304f fVar = (C0304f) c4;
                        C0301c cVar = fVar.f1964a;
                        boolean z5 = false;
                        z4 = fVar.m3392H();
                        if (!(cVar.f1881k == null || (c = cVar.f1881k.mo2882c()) == null || !(c instanceof C0368l))) {
                            z3 = true;
                            if (c != lVar2) {
                                if (this.f2455w != null) {
                                    AbstractC0171m.m3792b((AbstractC0210af) this);
                                    m3073a(this.f2455w, false);
                                    this.f2455w = null;
                                    lVar2 = this.f2454v;
                                    AbstractC0171m.m3777c(this);
                                }
                                AbstractC0171m.m3792b((AbstractC0210af) this);
                                this.f2455w = lVar2;
                                m3073a((C0368l) c, false);
                                lVar2 = this.f2454v;
                                AbstractC0171m.m3777c(this);
                            }
                        }
                        if (cVar.f1903Q != null) {
                            float floatValue = cVar.f1903Q.floatValue();
                            if (cVar.f1906T) {
                                float f15 = this.f5841dH;
                                float f16 = this.f5842dI;
                                C0414i b5 = this.f2480do.m2751b();
                                if (b5 != null) {
                                    float f17 = Float.MIN_VALUE;
                                    float f18 = Float.MIN_VALUE;
                                    if (b5.f3029g != null) {
                                        f17 = b5.f3029g.f5841dH;
                                        f18 = b5.f3029g.f5842dI;
                                    } else if (b5.f3028f != null) {
                                        f17 = b5.f3028f.f224a;
                                        f18 = b5.f3028f.f225b;
                                    }
                                    if (f17 > Float.MIN_VALUE) {
                                        floatValue += C0654f.m1499d(f15, f16, f17, f18);
                                    }
                                }
                            }
                            if (cVar.f1907U == null) {
                                f2 = m2381a(f, floatValue, true, cVar.f1904R);
                            } else {
                                int i7 = cVar.f1907U.f2116e;
                                f2 = m2384a(f, floatValue, i7);
                                C0213ai aiVar = this.f1462cn[i7];
                                aiVar.m3532b(5);
                                aiVar.f1562b = aiVar.f1561a;
                            }
                            if (cVar.f1905S && C0654f.m1512c(f2) > 5.0f) {
                                z5 = true;
                            }
                        }
                        if (cVar.f1902P != null && !z5) {
                            this.f2470b.m3184a(cVar.f1902P.m2890b(), 10);
                        }
                        if (z5) {
                            this.f2480do.f3039e = 0.0f;
                        }
                    }
                    if (!(lVar2.f2647dk == null || c4.mo2686i() == null || this.f2480do.f3039e < lVar2.f2647dk.f2417p)) {
                        this.f2470b.m3184a(lVar2.f2647dk, 5);
                    }
                }
                this.f2443g = z4;
                if (this.f2443g) {
                    this.f1525bH = 0.0f;
                    this.f1526bI = 0.0f;
                    this.f1528bK = 0.0f;
                }
            }
            if (this.f2455w != null && !z3) {
                AbstractC0171m.m3792b((AbstractC0210af) this);
                m3073a(this.f2455w, false);
                this.f2455w = null;
                C0368l lVar3 = this.f2454v;
                AbstractC0171m.m3777c(this);
            }
            this.f2470b.m3186a(f);
            m2979r(f);
            C0368l lVar4 = this.f2454v;
        }
    }

    /* renamed from: ci */
    public float mo2776ci() {
        return this.f2454v.f2809bZ.f2423b * this.f2454v.f2597cd;
    }

    /* renamed from: cj */
    public C0354d mo3569cj() {
        return this.f2454v.f2810ca;
    }

    /* renamed from: ck */
    public C0354d mo3568ck() {
        return this.f2454v.f2811cb;
    }

    /* renamed from: a */
    public boolean mo2660a(int i, AbstractC0210af afVar, boolean z, boolean z2) {
        return m3077a(this.f2454v.f2836fE[i], i, afVar, z, z2);
    }

    /* renamed from: a */
    public final boolean m3078a(C0323as asVar, int i, float f, float f2, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        float a = C0654f.m1573a(this.f5841dH, this.f5842dI, f, f2);
        if (a > asVar.f2148ad) {
            if (this.f1441bB != u.f5464bb) {
                return false;
            }
            u.f5481bA.m1766a("Location too far");
            return false;
        } else if (a >= asVar.f2188ag) {
            return true;
        } else {
            if (this.f1441bB != u.f5464bb) {
                return false;
            }
            u.f5481bA.m1766a("Location too close");
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m3077a(C0323as asVar, int i, AbstractC0210af afVar, boolean z, boolean z2) {
        float f;
        if (!z && (asVar.f2133H || z2)) {
            float a = C0654f.m1573a(this.f5841dH, this.f5842dI, afVar.f5841dH, afVar.f5842dI);
            if (a > asVar.f2148ad || a < asVar.f2188ag) {
                return false;
            }
        }
        if (!asVar.f2132G) {
            return true;
        }
        if (asVar.f2189ah != -1.0f) {
            if (asVar.f2177v != -1) {
                f = this.f1462cn[asVar.f2177v].f1561a + asVar.f2119i;
            } else {
                f = this.f1444bL + asVar.f2119i;
            }
            if (C0654f.m1512c(C0654f.m1510c(f, C0654f.m1499d(this.f5841dH, this.f5842dI, afVar.f5841dH, afVar.f5842dI), 360.0f)) > asVar.f2189ah) {
                return false;
            }
        }
        if (asVar.f2138M != null && !asVar.f2138M.read(this)) {
            return false;
        }
        if (asVar.f2139N != null && !C0364h.m3118a(asVar.f2139N, afVar.mo3582cM())) {
            return false;
        }
        if (asVar.f2140O != null && C0364h.m3118a(asVar.f2140O, afVar.mo3582cM())) {
            return false;
        }
        if (afVar.mo2423i()) {
            if (asVar.f2134I != null) {
                return asVar.f2134I.read(this);
            }
            return true;
        } else if (afVar.mo2437P()) {
            if (asVar.f2136K != null) {
                return asVar.f2136K.read(this);
            }
            return true;
        } else if (asVar.f2137L != null && !asVar.f2137L.read(this) && !afVar.m3562cr()) {
            return false;
        } else {
            if (asVar.f2135J != null) {
                return asVar.f2135J.read(this);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo2435a(AbstractC0210af afVar, int i) {
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2179A && m3077a(asVar, i, afVar, false, false)) {
            for (int i2 = 0; i2 < this.f2454v.f2836fE.length; i2++) {
                C0323as asVar2 = this.f2454v.f2836fE[i2];
                if (!(asVar2 == null || i2 == i || asVar2.f2152an == null || asVar2.f2152an != asVar || this.f1462cn[i2].f1565e >= 9000.0f - ((mo2434b(i) * 0.5f) - asVar2.f2170m))) {
                    this.f1462cn[i2].f1565e = 0.0f;
                }
            }
            if (asVar.f2177v != -1) {
                C0323as asVar3 = this.f2454v.f2836fE[asVar.f2177v];
                if (!asVar3.f2179A && asVar3.f2172o != 0.0f) {
                    this.f1462cn[asVar.f2177v].f1565e = mo2434b(asVar.f2177v) + m2977t(asVar.f2177v);
                }
            }
            this.f2470b.m3183a(this.f2454v.f2820dg, 11, true);
            m3047b(asVar);
            m3085a(afVar, -1.0f, -1.0f, i, (C0317am) null, 0);
        }
    }

    /* renamed from: a */
    public boolean m3079a(C0323as asVar) {
        if (asVar.f2176t > 0.0f && (asVar.f2176t > this.f1457cf || this.f2452t)) {
            return false;
        }
        if (asVar.f2123u == null || asVar.f2123u.m3135b((AbstractC0210af) this, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m3047b(C0323as asVar) {
        if (asVar.f2176t > 0.0f) {
            this.f1457cf -= asVar.f2176t;
            if (this.f1457cf < asVar.f2176t && this.f2454v.f2620cC) {
                this.f2452t = true;
            }
        }
        if (asVar.f2123u != null) {
            asVar.f2123u.m3129c(this, false);
        }
    }

    /* renamed from: a */
    public static C0163f m3083a(AbstractC0210af afVar, int i, C0317am amVar, float f, float f2, float f3, float f4) {
        C0163f a = C0163f.m3899a(afVar, f, f2, f3, i);
        m3090a(a, afVar, i, amVar, f, f2, f3, f4);
        return a;
    }

    /* renamed from: a */
    public static void m3090a(C0163f fVar, AbstractC0210af afVar, int i, C0317am amVar, float f, float f2, float f3, float f4) {
        C0573e a;
        AbstractC0789l u = AbstractC0789l.m651u();
        fVar.f959az = f4;
        fVar.f1032aT = f4;
        if (afVar == null) {
            throw new RuntimeException("Source cannot be null");
        }
        fVar.f1001g = amVar;
        fVar.f934G = amVar.f1070aH;
        fVar.f1031aR = amVar.f1133aI;
        fVar.f943U = amVar.f1034b;
        fVar.f944Y = amVar.f1035c;
        fVar.f945Z = amVar.f1085i;
        if (amVar.f1088l) {
            fVar.f946aa = false;
            fVar.f1016ab = true;
        } else {
            fVar.f946aa = !amVar.f1087k;
        }
        fVar.f1017ac = amVar.f1090n;
        if (amVar.f1089m) {
            fVar.f1018ad = true;
            fVar.f1019ae = false;
        }
        fVar.f931D = amVar.f1092p;
        fVar.f979aY = amVar.f1093q;
        fVar.f980aZ = amVar.f1094r;
        if (amVar.f1091o < 0.5d) {
            fVar.f930C = true;
        } else {
            fVar.f1008H = amVar.f1091o;
        }
        fVar.f915h = amVar.f1042v;
        fVar.f916i = amVar.f1041u;
        fVar.f924t = amVar.f1097w;
        if (amVar.f1073aL != 0.0f) {
            fVar.f924t += C0654f.m1552a((AbstractC0854w) afVar, (int) ((-amVar.f1073aL) * 100.0f), (int) (amVar.f1073aL * 100.0f), 1) / 100.0f;
        }
        if (amVar.f1054S && i != -1) {
            fVar.f955au = afVar;
            if (afVar instanceof AbstractC0515r) {
                fVar.f1026av = i;
                C0814ag D = ((AbstractC0515r) afVar).m2410D(i);
                fVar.f956aw = D.f5735a;
                fVar.f957ax = D.f5736b;
                fVar.f958ay = afVar.f5843dJ + D.f5737c;
            } else {
                fVar.f956aw = afVar.f5841dH;
                fVar.f957ax = afVar.f5842dI;
                fVar.f958ay = afVar.f5843dJ;
            }
        }
        fVar.f927w = amVar.f1047D;
        fVar.f925u = amVar.f1048E;
        fVar.f926v = amVar.f1049F;
        fVar.f947af = amVar.f1074aM;
        fVar.f948ag = amVar.f1075aN;
        fVar.f949ah = amVar.f1076aO;
        fVar.f1020ai = amVar.f1134aP;
        fVar.f1022ak = amVar.f1135aQ;
        fVar.f1023al = amVar.f1136aR;
        fVar.f1024am = amVar.f1137aS;
        fVar.f950an = amVar.f1077aT;
        if (amVar.f1138aU > 0.0f) {
            fVar.f951ao = true;
            fVar.f1014W = amVar.f1138aU;
            fVar.f1015X = fVar.f1014W;
        }
        fVar.f1025ar = amVar.f1129aD;
        if (amVar.f1131aF != 0.0f) {
            float f5 = amVar.f1132aG;
            int a2 = Color.m4548a(fVar.f1025ar);
            int b = (int) (Color.m4544b(fVar.f1025ar) * f5);
            int c = (int) (Color.m4543c(fVar.f1025ar) * f5);
            int d = (int) (Color.m4542d(fVar.f1025ar) * f5);
            int F = afVar.f1441bB.m3829F();
            fVar.f1025ar = Color.m4546a(a2, C0654f.m1524b((int) (b + (Color.m4544b(F) * amVar.f1131aF)), 0, 255), C0654f.m1524b((int) (c + (Color.m4543c(F) * amVar.f1131aF)), 0, 255), C0654f.m1524b((int) (d + (Color.m4542d(F) * amVar.f1131aF)), 0, 255));
        }
        fVar.f1009P = amVar.f1098x;
        fVar.f1011R = amVar.f1043y;
        fVar.f1012S = !amVar.f1044A;
        fVar.f1010Q = amVar.f1099z;
        if (amVar.f1045B != null) {
            fVar.f1009P = (short) 0;
            fVar.f1011R = (short) 0;
        }
        fVar.f1005x = amVar.f1130aE;
        fVar.f919m = amVar.f1095s;
        fVar.f928A = amVar.f1100H;
        fVar.f939M = amVar.f1109U;
        fVar.f929B = amVar.f1110V;
        fVar.f967aH = amVar.f1112ad;
        fVar.f966aG = amVar.f1123av;
        fVar.f968aM = amVar.f1113ae;
        if (amVar.f1062ah != null) {
            amVar.f1062ah.m2876a(fVar.f5841dH, fVar.f5842dI, fVar.f5843dJ, fVar.f959az, fVar);
        }
        if (amVar.f1116an != -1) {
            boolean z = false;
            C0573e eVar = fVar.f971aP;
            if (eVar != null && eVar.f3827b == fVar && eVar.f3829d && eVar != null) {
                if (eVar.f3859W < 150.0f) {
                    eVar.f3859W = 200.0f;
                }
                z = true;
            }
            if (!z && (a = u.f5480bz.m2062a(fVar, amVar.f1116an, amVar.f1117ao)) != null) {
                if (amVar.f1067ap) {
                    a.f3828c = true;
                }
                if (amVar.f1103K) {
                    fVar.f971aP = a;
                }
            }
        }
        fVar.f972aQ = amVar.f1118aq;
        if (amVar.f1119ar != -1.0f) {
            fVar.f1027aI = amVar.f1119ar;
        }
        if (amVar.f1120as != -1.0f) {
            fVar.f1028aJ = amVar.f1120as;
        }
        fVar.f1030aL = -1.0f;
        if (amVar.f1121at != -1.0f) {
            fVar.f1003r = amVar.f1121at;
        }
        fVar.f1004s = amVar.f1122au;
        if (amVar.f1080aX != null) {
        }
        fVar.f964aE = amVar.f1084bb;
        fVar.f5839dF = afVar.f5839dF;
        if (fVar.f5839dF < 4 && f3 >= -1.0f) {
            fVar.f5839dF = 4;
        }
        if (amVar.f1108T) {
            fVar.f5839dF = 1;
        }
    }

    /* renamed from: a */
    public C0163f m3085a(AbstractC0210af afVar, float f, float f2, int i, C0317am amVar, int i2) {
        C0317am amVar2;
        AbstractC0789l u = AbstractC0789l.m651u();
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2158az != null) {
            this.f2470b.m3183a(asVar.f2158az.m2890b(), 6, true);
        }
        if (asVar.f2159aA > 0.0f) {
            m2289b(asVar.f2159aA);
        }
        if (asVar.f2160aB != null) {
            asVar.f2160aB.m2886a(this, new PointF(f, f2), afVar, i2 + 1);
        }
        if (asVar.f2166aH > 0) {
            for (int i3 = 0; i3 < asVar.f2166aH; i3++) {
                if (this.f2476x != null && this.f2476x.size() > 0) {
                    AbstractC0210af afVar2 = (AbstractC0210af) this.f2476x.remove(this.f2476x.size() - 1);
                    afVar2.f1539cp = null;
                    afVar2.f5841dH = afVar2.f5841dH;
                    afVar2.f5842dI = afVar2.f5842dI;
                    afVar2.f1444bL = this.f1444bL;
                    if (afVar2 instanceof AbstractC0515r) {
                        AbstractC0515r rVar = (AbstractC0515r) afVar2;
                        rVar.m2292ax();
                        if (afVar != null) {
                            rVar.m2219k(afVar);
                        } else {
                            rVar.m2245e(f, f2);
                        }
                    }
                }
            }
        }
        if (amVar == null) {
            amVar2 = this.f2454v.f2754fF[asVar.m3286a(this)];
        } else {
            amVar2 = amVar;
        }
        PointF J = mo2666J(i);
        C0814ag D = m3098D(i);
        C0163f fVar = null;
        if (amVar2.f1103K && amVar == null) {
            if (this.f2457C == null) {
                this.f2457C = new C0163f[31];
            }
            if (this.f2457C[i] != null && !this.f2457C[i].f5836dC) {
                fVar = this.f2457C[i];
                fVar.m3900a(this, D.f5735a, D.f5736b, this.f5843dJ + D.f5737c);
                if (!amVar2.f1105M && fVar.f952ap != null) {
                    fVar.f952ap.clear();
                }
            }
        }
        this.f1437bi = (int) (this.f1437bi + 1 + this.f5835dA);
        float f3 = this.f1462cn[i].f1561a;
        boolean z = false;
        if (fVar == null) {
            fVar = C0163f.m3899a(this, D.f5735a, D.f5736b, this.f5843dJ + D.f5737c, i);
            if (amVar2.f1103K) {
                this.f2457C[i] = fVar;
            }
        } else {
            fVar.f1001g = amVar2;
            z = true;
        }
        m3090a(fVar, this, i, amVar2, D.f5735a, D.f5736b, this.f5843dJ + D.f5737c, f3);
        amVar2.m3304a(this, fVar, afVar, f, f2, mo2420m());
        if (!z && amVar2.f1052Q == 0.0f && amVar2.f1053R == 0.0f) {
            fVar.f937K = J.f224a;
            fVar.f938L = J.f225b;
        }
        if (asVar.f2131F != null) {
            u.f5480bz.m2071a(D.f5735a, D.f5736b, this.f5843dJ + D.f5737c, asVar.f2131F.intValue());
        }
        if (asVar.f2129D != null) {
            asVar.f2129D.m2876a(D.f5735a, D.f5736b, this.f5843dJ + D.f5737c, this.f1462cn[i].f1561a, this);
        }
        if (asVar.f2128C != null) {
            asVar.f2128C.m3292a(D.f5735a, D.f5736b, 1.0f + C0654f.m1511c(-0.07f, 0.07f));
        }
        if (this.f2454v.f2680dV) {
            this.f3394I = null;
        }
        if (asVar.f2156ax) {
            this.f1462cn[i].f1570j = null;
        }
        if (this.f2454v.f2549aY && !this.f1520bz) {
            mo2770bq();
        }
        if (this.f2454v.f2551ba && !this.f1520bz) {
            mo2099a();
            this.f1520bz = true;
        }
        return fVar;
    }

    /* renamed from: m */
    public float mo2420m() {
        return this.f2454v.f2657du;
    }

    /* renamed from: y */
    public int mo2489y() {
        if (this.f2454v.f2539aM != -1) {
            return this.f2454v.f2539aM;
        }
        return super.mo2489y();
    }

    /* renamed from: s */
    public int mo2492s(AbstractC0210af afVar) {
        int a = afVar.mo1660r().mo3502a(this);
        if (this.f2454v.f2801aN == -1) {
            return mo2489y() + a;
        }
        if (!this.f2454v.f2540aO) {
            return this.f2454v.f2801aN + a;
        }
        int i = (int) (this.f2454v.f2801aN + this.f1447bO);
        if (afVar != null) {
            i = (int) (i + afVar.f1447bO);
        }
        return i + a;
    }

    /* renamed from: t */
    public int mo2491t(AbstractC0210af afVar) {
        int a = afVar.mo1660r().mo3502a(this);
        if (this.f2454v.f2802aP == -1) {
            return mo2489y() + a;
        }
        if (!this.f2454v.f2541aQ) {
            return this.f2454v.f2802aP + a;
        }
        int i = (int) (this.f2454v.f2802aP + this.f1447bO);
        if (afVar != null) {
            i = (int) (i + afVar.f1447bO);
        }
        return i + a;
    }

    /* renamed from: u */
    public boolean mo3540u(AbstractC0210af afVar) {
        return this.f2454v.f2541aQ;
    }

    /* renamed from: v */
    public boolean mo3539v(AbstractC0210af afVar) {
        return this.f2454v.f2540aO;
    }

    /* renamed from: ch */
    public float mo3570ch() {
        return this.f2454v.f2544aT;
    }

    /* renamed from: c */
    public float mo2577c(AbstractC0210af afVar) {
        return this.f2454v.f2542aR;
    }

    /* renamed from: b */
    public float mo2578b(AbstractC0210af afVar) {
        return this.f2454v.f2543aS;
    }

    /* renamed from: z */
    public float mo2418z() {
        return this.f2454v.f2662dz * this.f2474j;
    }

    /* renamed from: aU */
    public float m3061aU() {
        return this.f2454v.f2683dY;
    }

    /* renamed from: aV */
    public float m3060aV() {
        return this.f2454v.f2684dZ;
    }

    /* renamed from: A */
    public float mo2448A() {
        return this.f2454v.f2670dL;
    }

    /* renamed from: c */
    public float mo2433c(int i) {
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2142T != null) {
            return asVar.f2142T.floatValue();
        }
        return this.f2454v.f2675dQ;
    }

    /* renamed from: x */
    public float m2974x(int i) {
        return this.f2454v.f2836fE[i].f2180P;
    }

    /* renamed from: w */
    public float mo2471w(int i) {
        return this.f2454v.f2836fE[i].f2183U;
    }

    /* renamed from: y */
    public float mo3439y(int i) {
        return this.f2454v.f2836fE[i].f2184V;
    }

    /* renamed from: B */
    public float mo2447B() {
        return this.f2454v.f2686ed;
    }

    /* renamed from: cn */
    public float mo3565cn() {
        return this.f2454v.f2805bw * this.f2471c;
    }

    /* renamed from: p */
    public float m2981p(int i) {
        return this.f2454v.f2806bx;
    }

    /* renamed from: f */
    public float mo2645f(boolean z) {
        if (!this.f2454v.f2650dn) {
            return 0.0f;
        }
        if (z && this.f2454v.f2652dp) {
            return this.f1462cn[this.f2454v.f2654dr.f2116e].f1561a + 90.0f;
        }
        if (this.f2454v.f2651do) {
            return this.f1462cn[this.f2454v.f2654dr.f2116e].f1561a + 90.0f;
        }
        return super.mo2645f(z);
    }

    /* renamed from: cG */
    public PointF mo3584cG() {
        if (!this.f2454v.f2651do || this.f1462cn[this.f2454v.f2654dr.f2116e].f1565e == 0.0f || this.f2454v.f2654dr.f2172o == 0.0f) {
            f2463dl.m4474a(0.0f, 0.0f);
            return f2463dl;
        }
        f2463dl.m4473a(mo2501F(this.f2454v.f2654dr.f2116e));
        f2463dl.m4472b(-this.f5841dH, -this.f5842dI);
        return f2463dl;
    }

    /* renamed from: aL */
    public PointF m3067aL() {
        PointF cG = mo3584cG();
        f2464dm.m4474a(cG.f224a + this.f2454v.f2608cq, cG.f225b + this.f2454v.f2609cr);
        return f2464dm;
    }

    /* renamed from: c */
    public boolean mo2025c(float f) {
        C0748e R;
        float f2;
        float f3;
        if (this.f2481ds != null && !this.f1520bz) {
            C0330c.m3272a(this, f, false, false);
        }
        if (!super.mo2025c(f)) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0851y.m420a((AbstractC0515r) this);
        if (this.f2481ds != null && !this.f1520bz && this.f2454v.f2797an) {
            C0330c.m3272a(this, f, true, false);
        }
        if (mo3620ai() && this.f2454v.f2840fJ != null && !this.f1520bz) {
            float e = this.f1462cn[this.f2454v.f2840fJ.f2116e].f1566f / mo2427e(this.f2454v.f2840fJ.f2116e);
            if (e != 0.0f) {
                boolean z = true;
                boolean W = m2389W();
                if (W && this.f2454v.f2584bL) {
                    z = false;
                } else if (!W && this.f2454v.f2580bH) {
                    z = false;
                }
                if (z && this.f2454v.f2836fE[this.f2454v.f2840fJ.f2116e].f2163aE == null) {
                    C0814ag bi = m2266bi();
                    u.f5477bw.mo125j();
                    u.f5477bw.mo147b(bi.f5735a - u.f5508cd, ((bi.f5736b - bi.f5737c) - u.f5509ce) - this.f5843dJ);
                    u.f5477bw.mo200a(e, e);
                    if (W) {
                        u.f5477bw.mo175a(C0434b.f3127f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        u.f5477bw.mo175a(C0434b.f3126e, 0.0f, 0.0f, (Paint) null);
                    }
                    u.f5477bw.mo124k();
                }
            }
        }
        if (this.f2454v.f2753fD && !this.f1520bz) {
            int bg = mo2496bg();
            for (int i = 0; i < bg; i++) {
                float e2 = this.f1462cn[i].f1566f / mo2427e(i);
                C0323as asVar = this.f2454v.f2836fE[i];
                if (!(asVar == null || e2 == 0.0f || asVar.f2163aE == null)) {
                    C0851y.m418a(this, asVar.f2163aE, e2, i);
                }
            }
        }
        if (this.f1520bz || this.f1453cb <= 0.0f || this.f1455cd != 0.0f || (R = mo2664R()) == null) {
            return true;
        }
        if (!this.f2454v.f2623cF) {
            f2 = 0.0f + 0.09f + ((this.f1453cb / this.f1456ce) * 0.4f) + ((C0654f.m1529b(this.f1454cc, 50.0f) / 50.0f) * 0.5f);
        } else {
            float b = 0.0f + ((C0654f.m1529b(this.f1454cc, 50.0f) / 50.0f) * 0.5f);
            float f4 = this.f1454cc;
            if (f4 > 5.0f) {
                f4 = 5.0f;
            }
            f2 = b + ((f4 / 5.0f) * 0.2f);
        }
        if (f2 <= 0.0f) {
            return true;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (this.f2458dn == null) {
            this.f2458dn = C0851y.m438a();
        }
        Paint paint = this.f2458dn;
        paint.m4522a((int) (f2 * 255.0f), 255, 255, 255);
        float f5 = this.f5841dH - u.f5508cd;
        float f6 = (this.f5842dI - u.f5509ce) - this.f5843dJ;
        if (!this.f2454v.f2795ak) {
            f3 = ((this.f2454v.f2631cQ * 2) / 87.0f) * 1.25f;
        } else {
            f3 = ((this.f2454v.f2631cQ * 2) / R.f5243k) * 1.25f;
        }
        u.f5477bw.mo125j();
        u.f5477bw.mo198a(f3, f3, f5, f6);
        u.f5477bw.mo176a(R, f5, f6, mo2645f(false) - 90.0f, paint);
        u.f5477bw.mo124k();
        return true;
    }

    /* renamed from: R */
    public C0748e mo2664R() {
        return this.f2454v.f2794aj;
    }

    /* renamed from: C */
    public float mo2446C() {
        return this.f2454v.f2663dA;
    }

    /* renamed from: D */
    public float mo2445D() {
        return this.f2454v.f2664dB;
    }

    /* renamed from: bd */
    public boolean mo2648bd() {
        return this.f2454v.f2671dM;
    }

    /* renamed from: be */
    public boolean mo2647be() {
        return this.f2454v.f2672dN;
    }

    /* renamed from: l */
    public boolean mo2421l() {
        return this.f2454v.f2687ee;
    }

    /* renamed from: ae */
    public boolean mo2476ae() {
        return this.f2454v.f2689eg.read(this);
    }

    /* renamed from: ad */
    public boolean mo2477ad() {
        return this.f2454v.f2688ef.read(this);
    }

    /* renamed from: ac */
    public boolean mo2478ac() {
        return this.f2454v.f2690eh.read(this);
    }

    /* renamed from: af */
    public boolean mo2475af() {
        if (this.f2454v.f2691ei == null) {
            return true;
        }
        return this.f2454v.f2691ei.read(this);
    }

    /* renamed from: h */
    public boolean m2988h(AbstractC0210af afVar) {
        C0368l lVar = this.f2454v;
        if (lVar.f2692ej) {
            if (!(lVar.f2693ek == null || C0364h.m3118a(lVar.f2693ek, afVar.mo3582cM()))) {
                return false;
            }
            if (lVar.f2694el != null && C0364h.m3118a(lVar.f2694el, afVar.mo3582cM())) {
                return false;
            }
            if (lVar.f2695em) {
                boolean z = false;
                for (int i = 0; i < lVar.f2836fE.length; i++) {
                    C0323as asVar = lVar.f2836fE[i];
                    if ((asVar.f2140O == null || !C0364h.m3118a(asVar.f2140O, afVar.mo3582cM())) && (asVar.f2139N == null || C0364h.m3118a(asVar.f2139N, afVar.mo3582cM()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (afVar.mo2423i()) {
            return mo2477ad();
        }
        if (afVar.mo2437P()) {
            return mo2478ac();
        }
        if (mo2475af() || afVar.m3562cr()) {
            return mo2476ae();
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo2444E() {
        return this.f2454v.f2696en;
    }

    /* renamed from: g */
    public float mo2425g(int i) {
        return this.f2454v.f2836fE[i].f2143W;
    }

    /* renamed from: z */
    public float m2970z(int i) {
        return this.f2454v.f2836fE[i].f2186aa;
    }

    /* renamed from: A */
    public float m3103A(int i) {
        return this.f2454v.f2836fE[i].f2188ag;
    }

    /* renamed from: B */
    public float m3101B(int i) {
        return this.f2454v.f2836fE[i].f2119i;
    }

    /* renamed from: C */
    public float mo2507C(int i) {
        float f;
        float f2;
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2177v != -1) {
            f = this.f1462cn[asVar.f2177v].f1561a;
        } else {
            f = this.f1444bL;
        }
        if (!this.f1446bN || mo2484aX() <= 0.95d) {
            f2 = f + asVar.f2119i;
        } else {
            f2 = f + asVar.f2120j;
        }
        if (asVar.f2195aq != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    /* renamed from: bh */
    public boolean mo3450bh() {
        return this.f2454v.f2660dx;
    }

    /* renamed from: q */
    public float mo2472q(int i) {
        C0317am amVar;
        C0323as asVar = this.f2454v.f2836fE[i];
        if (!asVar.f2179A) {
            return 0.0f;
        }
        float f = 0.0f;
        if (!this.f2454v.f2754fF[asVar.m3286a(this)].f1095s) {
            f = 0.0f + amVar.f1034b;
        }
        return f + amVar.f1035c;
    }

    /* renamed from: b */
    public float mo2434b(int i) {
        return this.f2454v.f2836fE[i].f2169l;
    }

    /* renamed from: e */
    public float mo2427e(int i) {
        return this.f2454v.f2836fE[i].f2170m;
    }

    /* renamed from: f */
    public float mo2426f(int i) {
        return this.f2454v.f2836fE[i].f2171n;
    }

    /* renamed from: s */
    public boolean m2978s(int i) {
        return this.f2454v.f2836fE[i].f2175r;
    }

    /* renamed from: t */
    public float m2977t(int i) {
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2122s == 0.0f || asVar.f2170m == 0.0f) {
            return 0.0f;
        }
        return -(asVar.f2122s * (this.f1462cn[i].f1566f / asVar.f2170m));
    }

    /* renamed from: r */
    public boolean mo2863r(int i) {
        if (this.f2454v.f2836fE[i].f2179A) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m3050b(AbstractC0210af afVar, int i) {
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2130E != null) {
            PointF E = mo2485E(i);
            asVar.f2130E.m2876a(E.f224a, E.f225b, this.f5843dJ, this.f1462cn[i].f1561a, this);
        }
    }

    /* renamed from: u */
    public boolean mo2862u(int i) {
        if (!m3079a(this.f2454v.f2836fE[i])) {
            return false;
        }
        return super.mo2862u(i);
    }

    /* renamed from: q */
    public int mo3542q(AbstractC0210af afVar) {
        return this.f2454v.f2699eq;
    }

    /* renamed from: bC */
    public boolean mo3426bC() {
        return this.f2454v.f2701es;
    }

    /* renamed from: bD */
    public boolean mo3425bD() {
        return this.f2454v.f2702et;
    }

    /* renamed from: bB */
    public float mo2487bB() {
        return this.f2454v.f2588bQ;
    }

    /* renamed from: cq */
    public boolean mo3563cq() {
        return this.f2454v.f2515af;
    }

    /* renamed from: a_ */
    public Rect mo2611a_(boolean z) {
        float f;
        if (z && !this.f2454v.f2515af) {
            return super.mo2611a_(z);
        }
        if (this.f1520bz) {
            return super.mo2611a_(z);
        }
        int i = this.f2439a;
        int i2 = 0;
        C0370m mVar = this.f2454v.f2656dt;
        if (!(this.f2470b.f2379a == null || this.f2470b.f2379a.f2414j == null)) {
            mVar = this.f2470b.f2379a.f2414j;
        }
        if (mVar != null) {
            float f2 = mVar.f2852b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.f1444bL;
                if (mVar.f2851a) {
                    f = -this.f1462cn[this.f2454v.f2654dr.f2116e].f1561a;
                }
            } else {
                f = this.f1444bL;
                if (mVar.f2851a) {
                    f = this.f1462cn[this.f2454v.f2654dr.f2116e].f1561a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - mVar.f2855e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (mVar.f2853c > 0) {
                i += i4 * mVar.f2853c;
            }
            if (mVar.f2854d > 0) {
                i2 = 0 + (i4 * mVar.f2854d);
            }
        }
        if (i >= this.f2454v.f2784M) {
            i2 += i / this.f2454v.f2784M;
            i %= this.f2454v.f2784M;
        }
        return super.m3624a(z, i, i2);
    }

    /* renamed from: cp */
    public RectF mo2791cp() {
        RectF cp = super.mo2791cp();
        cp.m4456a(this.f2454v.f2512Y, this.f2454v.f2513Z);
        return cp;
    }

    /* renamed from: bg */
    public int mo2496bg() {
        if (this.f2454v == null) {
            return 1;
        }
        return this.f2454v.f2836fE.length;
    }

    /* renamed from: v */
    public int mo2861v(int i) {
        return this.f2454v.f2836fE[i].f2178w;
    }

    /* renamed from: F */
    public PointF mo2501F(int i) {
        return m3091a(i, false);
    }

    /* renamed from: a */
    public PointF m3091a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2177v == -1) {
            f3 = this.f5841dH;
            f2 = this.f5842dI;
            f = this.f1444bL;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            PointF a = m3091a(asVar.f2177v, true);
            f3 = a.f224a;
            f2 = a.f225b;
            f = this.f1462cn[asVar.f2177v].f1561a;
        }
        if (this.f1462cn[i].f1565e > 0.0f && asVar.f2172o != 0.0f) {
            float f4 = 0.0f;
            float b = (mo2434b(i) + m2977t(i)) - this.f1462cn[i].f1565e;
            if (b < asVar.f2173p) {
                f4 = (b / asVar.f2173p) * asVar.f2172o;
            } else if (b < asVar.f2173p + asVar.f2174q) {
                f4 = asVar.f2172o - (((b - asVar.f2173p) / asVar.f2174q) * asVar.f2172o);
            }
            if (f4 != 0.0f) {
                f3 += C0654f.m1474i(this.f1462cn[i].f1561a) * f4;
                f2 += C0654f.m1478h(this.f1462cn[i].f1561a) * f4;
            }
        }
        if (!(asVar.f2117f == 0.0f && asVar.f2118g == 0.0f)) {
            float h = C0654f.m1478h(f);
            float i2 = C0654f.m1474i(f);
            f3 += (i2 * asVar.f2118g) - (h * asVar.f2117f);
            f2 += ((h * asVar.f2118g) + (i2 * asVar.f2117f)) * asVar.f2168h;
        }
        f3463aU.m4474a(f3, f2);
        f3463aU.f224a = f3;
        f3463aU.f225b = f2;
        return f3463aU;
    }

    /* renamed from: M */
    public ArrayList mo2480M() {
        if (this.f2455w != null) {
            return this.f2455w.mo3503a(mo2702T());
        }
        return this.f2454v.mo3503a(mo2702T());
    }

    /* renamed from: a */
    public AbstractC0197s mo3632a(C0181c cVar) {
        C0368l lVar;
        if (this.f2455w != null) {
            lVar = this.f2455w;
        } else {
            lVar = this.f2454v;
        }
        return lVar.m2962a(cVar);
    }

    /* renamed from: T */
    public int mo2702T() {
        return this.f2454v.f2594bX;
    }

    /* renamed from: e */
    public AbstractC0197s mo2768e(AbstractC0268al alVar) {
        return this.f2480do.m2749b(alVar);
    }

    /* renamed from: a */
    public void mo2716a(AbstractC0197s sVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        if (!z) {
            mo3629a(EnumC0306ab.f1975f);
        } else {
            mo3629a(EnumC0306ab.f1976g);
        }
        if (sVar == C0441i.f3178i) {
            if (!z) {
                m3095L();
            } else {
                m3014cY();
            }
        } else if (sVar != C0441i.f3179j) {
            if (!z) {
                if (pointF != null && !m3087a(sVar, pointF.f224a, pointF.f225b)) {
                    return;
                }
                if (sVar instanceof C0304f) {
                    C0304f fVar = (C0304f) sVar;
                    if (fVar.f1964a.f1925an != null) {
                        AbstractC0789l u = AbstractC0789l.m651u();
                        if (this.f1441bB == u.f5464bb && !u.m772B()) {
                            fVar.f1964a.f1925an.m3294a();
                        }
                    }
                    if (fVar.f1964a.f1921aj != null) {
                        fVar.f1964a.f1921aj.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, this);
                    }
                }
            }
            if (!z || !(sVar instanceof C0304f) || ((C0304f) sVar).f1964a.f1943H) {
                this.f2480do.m2760a(sVar, z, pointF, afVar);
            }
        } else if (!z) {
            m3014cY();
        }
    }

    /* renamed from: a */
    public void mo2479a(AbstractC0197s sVar, boolean z) {
        mo2716a(sVar, z, (PointF) null, (AbstractC0210af) null);
    }

    /* renamed from: b */
    public void mo2772b(AbstractC0197s sVar, boolean z) {
        this.f2480do.m2761a(sVar, z);
    }

    /* renamed from: b */
    public void mo2773b(AbstractC0197s sVar) {
        this.f2480do.m2762a(sVar);
    }

    /* renamed from: a */
    public boolean m3087a(AbstractC0197s sVar, float f, float f2) {
        if (!(sVar instanceof C0304f)) {
            return true;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0304f fVar = (C0304f) sVar;
        if (fVar.f1964a.f1912aa == null || fVar.f1964a.f1913ab != null) {
            return true;
        }
        if (!m3078a(this.f2454v.f2836fE[fVar.f1964a.f1912aa.intValue()], fVar.f1964a.f1912aa.intValue(), f, f2, true)) {
            return false;
        }
        if (fVar.f1964a.f1916ae == null || !C0851y.m434a(f, f2, fVar.f1964a.f1916ae)) {
            return true;
        }
        if (this.f1441bB != u.f5464bb) {
            return false;
        }
        u.f5481bA.m1766a("Invalid map location (Must be passable by " + fVar.f1964a.f1916ae.name() + ")");
        return false;
    }

    /* renamed from: a */
    public void m3088a(AbstractC0197s sVar) {
        if (sVar instanceof C0304f) {
            C0304f fVar = (C0304f) sVar;
            if (fVar.f1964a.f1912aa != null && fVar.f1964a.f1913ab == null) {
                C0323as asVar = this.f2454v.f2836fE[fVar.f1964a.f1912aa.intValue()];
                if (asVar.f2187af > 0.0f) {
                    C0851y.m410b((AbstractC0210af) this, asVar.f2187af, true);
                }
                C0851y.m423a((AbstractC0210af) this, asVar.f2147ac, true, true);
            }
        }
        super.m2367a(sVar);
    }

    /* renamed from: a */
    public boolean m3086a(AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (i > 10) {
            return false;
        }
        sVar.mo3686a(this, afVar);
        if (!(sVar instanceof C0304f)) {
            return false;
        }
        C0304f fVar = (C0304f) sVar;
        C0301c cVar = fVar.f1964a;
        if (!(cVar.f1885p == null || cVar.f1885p.read(this))) {
            return true;
        }
        boolean z = false;
        if (cVar.f1909X != null) {
            this.f1457cf += fVar.f1964a.f1909X.floatValue();
            z = true;
        }
        if (cVar.f1910Y != null) {
            cVar.f1910Y.m3123f(this);
            z = true;
        }
        if (cVar.f1911Z != null) {
            cVar.f1911Z.m3151a(this, this.f1441bB.m3834A(), true);
            z = true;
        }
        if (cVar.f1934ax != null) {
            if (cVar.f1934ax.read(this)) {
                this.f1512bg = u.f5467bh;
            }
            z = true;
        }
        if (cVar.f1912aa != null) {
            PointF pointF2 = pointF;
            for (int i2 = 0; i2 < cVar.f1915ad; i2++) {
                if (cVar.f1913ab != null) {
                    pointF2 = new PointF();
                    pointF2.m4474a(this.f5841dH, this.f5842dI);
                    float i3 = C0654f.m1474i(this.f1444bL);
                    float h = C0654f.m1478h(this.f1444bL);
                    float f = cVar.f1913ab.f224a;
                    float f2 = cVar.f1913ab.f225b;
                    pointF2.m4472b((i3 * f2) - (h * f), (h * f2) + (i3 * f));
                }
                if (pointF2 == null) {
                    Hcat_Multiplaye.m1261f("completeQueueItem:" + fVar.m3690J() + " for fireTurretXAtGround needs points but it is missing");
                } else {
                    m3085a((AbstractC0210af) null, pointF2.f224a, pointF2.f225b, fVar.f1964a.f1912aa.intValue(), fVar.f1964a.f1914ac, i);
                }
            }
            z = true;
        }
        if (cVar.f1920ai != null) {
            cVar.f1920ai.m2876a(this.f5841dH, this.f5842dI, this.f5843dJ, this.f1444bL, this);
            z = true;
        }
        if (cVar.f1922ak != null) {
            cVar.f1922ak.m3292a(this.f5841dH, this.f5842dI, 1.0f);
            z = true;
        }
        if (cVar.f1923al != null && !u.m772B()) {
            cVar.f1923al.m3294a();
            z = true;
        }
        if (cVar.f1924am != null) {
            if (this.f1441bB == u.f5464bb && !u.m772B()) {
                cVar.f1924am.m3294a();
            }
            z = true;
        }
        if (cVar.f1950W.f5778a > 0) {
            Object[] a = cVar.f1950W.m490a();
            for (int i4 = 0; i4 < cVar.f1950W.f5778a; i4++) {
                if (((AbstractC0286a) a[i4]).mo3409a(this, sVar, pointF, afVar, i)) {
                    z = true;
                }
            }
        }
        if (cVar.f1918ag != null) {
            if (cVar.f1917af == null || cVar.f1917af.read(this)) {
                fVar.f1964a.f1918ag.m2886a(this, pointF, afVar, i + 1);
            }
            z = true;
        }
        if (fVar.f1964a.f1919ah != null) {
            if (cVar.f1917af == null || cVar.f1917af.read(this)) {
                fVar.f1964a.f1919ah.m2887a(this, pointF, afVar);
            }
            z = true;
        }
        AbstractC0268al alVar = null;
        if (cVar.f1898C != null) {
            alVar = cVar.f1898C.mo2882c();
        }
        if (alVar != null) {
            if (!(alVar instanceof C0368l)) {
                AbstractC0210af a2 = alVar.mo3504a();
                a2.f5841dH = this.f5841dH;
                a2.f5842dI = this.f5842dI;
                if (!a2.mo2797bw()) {
                    a2.f1444bL = this.f1444bL;
                }
                a2.mo3553d(this.f1441bB);
                a2.mo3556cx();
                float f3 = this.f1451bZ;
                float f4 = a2.f1451bZ;
                if (f3 == 0.0f) {
                    a2.f1450bY = a2.f1451bZ;
                } else {
                    a2.f1450bY = (this.f1450bY / f3) * f4;
                }
                if (this.f1460ci) {
                    AbstractC0789l.m651u().f5481bA.m1723k(a2);
                }
                AbstractC0171m.m3777c(a2);
                m3608bU();
            } else {
                C0365i iVar = null;
                if (cVar.f1901L) {
                    iVar = mo3582cM();
                }
                AbstractC0171m.m3792b((AbstractC0210af) this);
                this.f2455w = null;
                m3073a((C0368l) alVar, false);
                if (iVar != null) {
                    m3074a(iVar, true);
                }
                mo2732Q();
                this.f2480do.m2747d();
                this.f1513bh = AbstractC0789l.m651u().f5467bh;
                AbstractC0171m.m3777c(this);
            }
            z = true;
            if (!fVar.mo3368y().m3139b()) {
                m2391U();
            }
        }
        if (z || !cVar.f1882l) {
            return true;
        }
        AbstractC0789l.m683d("completeQueueItem:" + fVar.m3690J() + " had no effect (but should have)");
        return true;
    }

    /* renamed from: b */
    public void mo2740b(C0414i iVar) {
        AbstractC0197s a = mo3632a(iVar.f3033h);
        if (a != null && (a instanceof C0304f)) {
            C0301c cVar = ((C0304f) a).f1964a;
            if (cVar.f1908V != null) {
                f2468dw.f224a = this.f5841dH;
                f2468dw.f225b = this.f5842dI;
                cVar.f1908V.m2886a(this, f2468dw, null, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo2693a(C0414i iVar) {
        float f;
        AbstractC0197s a = mo3632a(iVar.f3033h);
        if (a == null || !m3086a(a, iVar.f3028f, iVar.f3029g, 0)) {
            float f2 = 0.0f;
            if (this.f2454v.f2523aw && this.f2454v.f2637cW != null) {
                f2 = this.f1444bL + this.f2454v.f2637cW.floatValue() + 90.0f;
            }
            if (this.f2454v.f2640cZ != null) {
                f = this.f2454v.f2640cZ.floatValue();
            } else if (this.f2480do.f3036b != null) {
                f = this.f1447bO * 3.0f;
            } else {
                f = this.f1447bO * 2.0f;
            }
            AbstractC0210af a2 = this.f2480do.m2754a(iVar, f, this.f2448p, f2);
            if (a2 != null) {
                m3100B(a2);
                AbstractC0171m.m3777c(a2);
                mo3629a(EnumC0306ab.f1974e);
            }
        }
    }

    /* renamed from: A */
    public void m3102A(AbstractC0210af afVar) {
        float f = 0.0f;
        if (this.f2454v.f2523aw && this.f2454v.f2637cW != null) {
            f = this.f1444bL + this.f2454v.f2637cW.floatValue() + 90.0f;
        }
        afVar.f1444bL = 90.0f + f;
        float f2 = 70.0f;
        if (this.f2454v.f2640cZ != null) {
            f2 = this.f2454v.f2640cZ.floatValue();
        }
        this.f2480do.m2757a(afVar, f2, this.f2448p);
    }

    /* renamed from: B */
    public void m3100B(AbstractC0210af afVar) {
        afVar.f5841dH = this.f5841dH + this.f2454v.f2635cU;
        afVar.f5842dI = this.f5842dI + this.f2454v.f2636cV;
        if (!this.f2454v.f2523aw) {
            float f = 180.0f;
            if (this.f2454v.f2637cW != null) {
                f = this.f2454v.f2637cW.floatValue();
            }
            float f2 = 70.0f;
            if (this.f2454v.f2640cZ != null) {
                f2 = this.f2454v.f2640cZ.floatValue();
            }
            boolean a = C0441i.m2640a(this, afVar, this.f2448p, 7.0f, f, f2, this.f2454v.f2635cU, this.f2454v.f2636cV);
            if (!this.f2454v.f2639cY) {
                afVar.f5843dJ = this.f5843dJ;
            }
            afVar.f5843dJ += this.f2454v.f2638cX;
            if (afVar instanceof C0367k) {
                ((C0367k) afVar).m2994dl();
            }
            if ((mo2423i() || !a || this.f2454v.f2713eJ.read(this)) && mo2631cc()) {
                m2971y(afVar);
            }
        }
        this.f2448p = !this.f2448p;
    }

    /* renamed from: db */
    public C0363g m2999db() {
        C0363g gVar = new C0363g();
        C0835m h = this.f2480do.m2743h();
        int size = h.size();
        if (size != 0) {
            Object[] a = h.m490a();
            for (int i = 0; i < size; i++) {
                AbstractC0197s a2 = mo3632a(((C0414i) a[i]).f3033h);
                if (a2 != null && (a2 instanceof C0304f)) {
                    C0304f fVar = (C0304f) a2;
                    if (fVar.f1964a.f1909X != null) {
                        gVar.f2424c += fVar.f1964a.f1909X.floatValue();
                    }
                    if (fVar.f1964a.f1910Y != null) {
                        C0363g gVar2 = fVar.f1964a.f1910Y;
                        if (!gVar2.m3139b()) {
                            gVar = C0363g.m3146a(gVar, gVar2);
                        }
                    }
                    if (fVar.f1964a.f1911Z != null) {
                        C0363g gVar3 = fVar.f1964a.f1911Z;
                        if (!gVar3.m3139b()) {
                            gVar = C0363g.m3146a(gVar, gVar3);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    /* renamed from: dg */
    public boolean mo2735dg() {
        return this.f2454v.f2830eB > 0 && m2991do() > this.f2454v.f2830eB;
    }

    /* renamed from: h */
    public int mo2734h(AbstractC0268al alVar) {
        return this.f2480do.m2756a(alVar);
    }

    /* renamed from: h */
    public int mo2733h(boolean z) {
        return this.f2480do.m2763a(AbstractC0197s.f1356h, z, true);
    }

    /* renamed from: a */
    public int mo2741a(C0181c cVar, boolean z) {
        return this.f2480do.m2764a(cVar, z);
    }

    /* renamed from: dc */
    public C0414i mo2739dc() {
        return this.f2480do.m2751b();
    }

    /* renamed from: dd */
    public C0835m mo2738dd() {
        return this.f2480do.f3037c;
    }

    /* renamed from: df */
    public void mo2736df() {
        this.f2480do.f3039e = 1.0f;
    }

    /* renamed from: de */
    public boolean mo2737de() {
        return this.f2480do.m2766a();
    }

    /* renamed from: cW */
    public int mo2769cW() {
        return this.f2480do.m2745f();
    }

    /* renamed from: a */
    public void mo2742a(PointF pointF) {
        if (this.f2454v.f2628cN) {
            this.f2480do.f3036b = pointF;
        }
    }

    /* renamed from: a_ */
    public float mo3623a_() {
        if (!this.f2454v.f2485q) {
            return -1.0f;
        }
        return super.mo3623a_();
    }

    /* renamed from: bH */
    public float mo2712bH() {
        if (!m3613bG() || this.f2480do.m2766a() || !this.f2454v.f2489u) {
            return super.mo2712bH();
        }
        return this.f2480do.f3039e;
    }

    /* renamed from: bI */
    public float mo2618bI() {
        if (this.f2454v.f2616cy > 0.0f && this.f1457cf < this.f2454v.f2616cy && this.f2454v.f2486r) {
            return this.f1457cf / this.f2454v.f2616cy;
        }
        if (this.f1456ce > 0.0f && this.f1453cb < this.f1456ce && this.f2454v.f2488t) {
            return this.f1453cb / this.f1456ce;
        }
        if (this.f2454v.f2616cy == 0.0f && this.f1456ce == 0.0f) {
            if (this.f2454v.f2825eb != -1 && this.f1462cn[this.f2454v.f2825eb].f1565e > 0.0f) {
                return 1.0f - (this.f1462cn[this.f2454v.f2825eb].f1565e / mo2434b(this.f2454v.f2825eb));
            }
            if (!(this.f2454v.f2826ec == -1 || this.f1462cn[this.f2454v.f2826ec].f1566f == 0.0f)) {
                return this.f1462cn[this.f2454v.f2826ec].f1566f / mo2427e(this.f2454v.f2826ec);
            }
        }
        return super.mo2618bI();
    }

    /* renamed from: f */
    public boolean mo2022f(float f) {
        return super.mo2022f(f);
    }

    /* renamed from: bM */
    public void mo2771bM() {
        if (this.f2480do.f3036b != null) {
            AbstractC0789l u = AbstractC0789l.m651u();
            u.f5477bw.mo197a((int) (this.f5841dH - u.f5508cd), (int) (this.f5842dI - u.f5509ce), (int) (this.f2480do.f3036b.f224a - u.f5508cd), (int) (this.f2480do.f3036b.f225b - u.f5509ce), AbstractC0413h.f3020y);
        }
    }

    /* renamed from: bN */
    public void mo2809bN() {
        if ((this.f2454v.f2657du > 70.0f && this.f2454v.f2687ee && this.f2454v.f2659dw == null) || (this.f2454v.f2659dw != null && this.f2454v.f2659dw.booleanValue())) {
            C0851y.m425a((AbstractC0210af) this, mo2420m(), true);
        } else if (this.f2454v.f2523aw && this.f2454v.f2539aM > 50 && !this.f2454v.f2687ee) {
            C0851y.m425a((AbstractC0210af) this, this.f2454v.f2539aM, true);
        }
        if (this.f2454v.f2779n.size() != 0) {
            Iterator it = this.f2454v.f2779n.iterator();
            while (it.hasNext()) {
                C0851y.m425a((AbstractC0210af) this, ((C0380w) it.next()).f2889a, true);
            }
        }
        if (this.f2454v.f2569bu) {
            int bg = mo2496bg();
            for (int i = 0; i < bg; i++) {
                C0323as asVar = this.f2454v.f2836fE[i];
                if (asVar.f2151aj != null && asVar.f2190ak > 0.0f) {
                    C0851y.m426a((AbstractC0210af) this, asVar.f2190ak, Color.m4546a(90, 135, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 135), 1, true);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo2024d(float f) {
        super.mo2024d(f);
        if (!this.f1520bz) {
            this.f1548dk.m3241a(f, this);
            if (this.f2454v.f2788aa != null) {
                AbstractC0789l u = AbstractC0789l.m651u();
                float f2 = this.f5841dH - u.f5508cd;
                float f3 = (this.f5842dI - u.f5509ce) - this.f5843dJ;
                float cn = mo3565cn();
                if (cn != 1.0f) {
                    u.f5477bw.mo125j();
                    u.f5477bw.mo198a(cn, cn, f2, f3);
                }
                if (this.f2454v.f2514ab) {
                    int i = this.f2454v.f2788aa.f5243k;
                    int i2 = this.f2454v.f2788aa.f5244l;
                    int i3 = i / 2;
                    int i4 = i2 / 2;
                    f1499cW.m4455a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                    f1500cX.m4469a(0, 0, 0 + i, 0 + i2);
                } else {
                    f1499cW.m4455a(f2 - this.f3754dN, f3 - this.f3755dO, f2 + this.f3754dN, f3 + this.f3755dO);
                    f1500cX.m4469a(0, 0, 0 + this.f3752dL, 0 + this.f3753dM);
                }
                u.f5477bw.mo169a(this.f2454v.f2788aa, f1500cX, f1499cW, m3068aK());
                if (cn != 1.0f) {
                    u.f5477bw.mo124k();
                }
            }
            if (this.f2454v.f2798ao && this.f2481ds != null && !this.f1520bz) {
                C0330c.m3272a(this, f, false, true);
            }
        }
    }

    /* renamed from: aJ */
    public float m3069aJ() {
        return this.f2454v.f2655ds;
    }

    /* renamed from: aK */
    public Paint m3068aK() {
        return super.m2332aK();
    }

    /* renamed from: aR */
    public boolean m3062aR() {
        return this.f2454v.f2703eu;
    }

    /* renamed from: bw */
    public boolean mo2797bw() {
        return this.f2454v.f2523aw;
    }

    /* renamed from: q */
    public boolean mo2674q() {
        if (this.f1540cq == null || this.f1540cq.f1529bR >= 1.0f) {
            return this.f2454v.f2526az;
        }
        return true;
    }

    /* renamed from: D */
    private boolean m3097D(AbstractC0210af afVar) {
        if (afVar.mo2674q() || afVar == this) {
            return false;
        }
        if (afVar.mo2797bw()) {
            if (this.f2454v.f2536aJ) {
                return true;
            }
            return false;
        } else if (this.f2454v.f2537aK) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo2499a(AbstractC0210af afVar) {
        if (this.f2454v.f2729fd == null || C0364h.m3118a(this.f2454v.f2729fd, afVar.mo3582cM())) {
            return m3097D(afVar);
        }
        return false;
    }

    /* renamed from: i */
    public boolean m2986i(AbstractC0210af afVar) {
        if (afVar.mo2679g() != 0.0f && mo3538x(afVar)) {
            return true;
        }
        if (this.f2454v.f2728fc == null || C0364h.m3118a(this.f2454v.f2728fc, afVar.mo3582cM())) {
            return m3097D(afVar);
        }
        return false;
    }

    /* renamed from: j */
    public void m2984j(AbstractC0210af afVar) {
        C0536ab abVar;
        if (this.f2454v.f2548aX) {
            C0270an ap = m2300ap();
            if (!(ap == null || (abVar = ap.f1650i) == null)) {
                abVar.m2159a(ap);
            }
            if (this.f1460ci && afVar != null) {
                AbstractC0789l.m651u().f5481bA.m1723k(afVar);
            }
            m3608bU();
        }
    }

    /* renamed from: aj */
    public boolean m3054aj() {
        if (this.f2454v.f2548aX) {
            return true;
        }
        return false;
    }

    /* renamed from: ah */
    public boolean mo3621ah() {
        return this.f2454v.f2731ff;
    }

    /* renamed from: ce */
    public boolean mo3571ce() {
        return this.f2454v.f2751fB;
    }

    /* renamed from: ai */
    public boolean mo3620ai() {
        return this.f2454v.f2730fe;
    }

    /* renamed from: w */
    public boolean mo2490w(AbstractC0210af afVar) {
        if (mo3538x(afVar) && !afVar.m3592c((AbstractC0515r) this)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo3538x(AbstractC0210af afVar) {
        if (!this.f2454v.f2725eZ) {
            return false;
        }
        if (this.f2454v.f2726fa == null || C0364h.m3118a(this.f2454v.f2726fa, afVar.mo3582cM())) {
            return true;
        }
        return false;
    }

    /* renamed from: cB */
    public int mo3589cB() {
        return this.f2454v.f2727fb;
    }

    /* renamed from: bx */
    public boolean mo2699bx() {
        return this.f2454v.f2735fj;
    }

    /* renamed from: a */
    public void mo2033a(float f, boolean z) {
        super.mo2033a(f, z);
        if (!this.f1520bz && mo3620ai()) {
            if (m2389W()) {
                if (!this.f2454v.f2584bL) {
                    C0434b.m2668b(f, this);
                }
            } else if (!this.f2454v.f2580bH) {
                C0434b.m2668b(f, this);
            }
        }
    }

    /* renamed from: o */
    public boolean mo2676o() {
        return this.f2454v.f2599cg;
    }

    /* renamed from: p */
    public boolean mo2675p() {
        return this.f2454v.f2600ch;
    }

    /* renamed from: d */
    public void mo3553d(AbstractC0171m mVar) {
        if (this.f2454v.f2604cl) {
            mo3633a(AbstractC0171m.f1280f);
        } else if (!this.f2454v.f2603ck || this.f2476x.size() != 0) {
            super.mo3553d(mVar);
        } else {
            mo3633a(AbstractC0171m.f1281g);
        }
    }

    /* renamed from: cx */
    public void mo3556cx() {
    }

    /* renamed from: g */
    public float mo2679g() {
        return this.f2454v.f2605cm;
    }

    /* renamed from: cz */
    public int mo3554cz() {
        return this.f2454v.f2606cn;
    }

    /* renamed from: cA */
    public C0365i mo3590cA() {
        return this.f2454v.f2607co;
    }

    /* renamed from: cy */
    public void mo3555cy() {
        if (this.f2454v.f2547aW == 0.0f && mo2679g() > 0.0f) {
            AbstractC0171m.m3792b((AbstractC0210af) this);
            this.f1529bR = 1.0f;
            AbstractC0171m.m3777c(this);
        }
    }

    /* renamed from: ca */
    public C0181c mo2632ca() {
        if (this.f2454v.f2830eB != 0) {
            return C0441i.f3178i.m3690J();
        }
        return super.mo2632ca();
    }

    /* renamed from: K */
    public float mo2665K(int i) {
        return this.f2454v.f2836fE[i].f2149ae;
    }

    /* renamed from: J */
    public PointF mo2666J(int i) {
        C0163f fVar;
        PointF J = super.mo2666J(i);
        if (this.f2454v.f2698ep) {
            if (this.f2454v.f2754fF[this.f2454v.f2836fE[i].m3286a(this)].f1104L && this.f2457C != null && (fVar = this.f2457C[i]) != null && !fVar.f5836dC) {
                J.f224a += fVar.f937K;
                J.f225b += fVar.f938L;
            }
        }
        return J;
    }

    /* renamed from: aY */
    public float mo2725aY() {
        return this.f2454v.f2616cy;
    }

    /* renamed from: aZ */
    public EnumC0272b m3059aZ() {
        return this.f2454v.f2676dR;
    }

    /* renamed from: ba */
    public boolean m3036ba() {
        if (this.f2454v.f2679dU) {
            return false;
        }
        if (this.f2454v.f2676dR != EnumC0272b.f1680d) {
            return true;
        }
        C0270an ap = m2300ap();
        if ((ap == null || (ap.m3464d() != EnumC0271ao.f1666h && ap.m3464d() != EnumC0271ao.f1668j)) && this.f3472G != EnumC0178a.f1315a) {
            return false;
        }
        return true;
    }

    /* renamed from: bJ */
    public boolean mo2617bJ() {
        return this.f2452t;
    }

    /* renamed from: bb */
    public boolean m3035bb() {
        return this.f2454v.f2682dX;
    }

    /* renamed from: aX */
    public float mo2484aX() {
        return this.f2454v.f2685ea;
    }

    /* renamed from: dh */
    public void m2998dh() {
        if (this.f2454v.f2796am != null || this.f2481ds != null) {
            if (this.f2454v.f2796am == null || this.f2454v.f2796am.length == 0) {
                this.f2481ds = null;
            } else if (this.f2481ds == null || this.f2481ds.length != this.f2454v.f2796am.length) {
                this.f2481ds = new C0331d[this.f2454v.f2796am.length];
                for (int i = 0; i < this.f2454v.f2796am.length; i++) {
                    C0331d dVar = new C0331d();
                    this.f2481ds[i] = dVar;
                    dVar.f2232a = i;
                    dVar.f2250s = this.f2454v.f2796am[i].f2034o;
                }
                this.f2459dp = this.f5841dH;
                this.f2460dq = this.f5842dI;
                this.f2461dr = this.f1444bL;
                m2997di();
                for (int i2 = 0; i2 < this.f2454v.f2796am.length; i2++) {
                    this.f2481ds[i2].f2247m = true;
                }
            }
        }
    }

    /* renamed from: di */
    public void m2997di() {
        C0330c.f2228a.mo3253b(this, 0.0f);
    }

    /* renamed from: dj */
    public void m2996dj() {
        if (this.f2481ds != null) {
            for (int i = 0; i < this.f2481ds.length; i++) {
                this.f2481ds[i].f2248n = true;
                this.f2481ds[i].f2247m = true;
            }
            m2997di();
        }
    }

    /* renamed from: aP */
    public int m3064aP() {
        if (this.f2454v.f2840fJ == null) {
            return -1;
        }
        return this.f2454v.f2840fJ.f2116e;
    }

    /* renamed from: s */
    public int mo2449s() {
        return this.f2454v.f2633cS;
    }

    /* renamed from: c */
    public void mo3591c(boolean z) {
        C0368l lVar = this.f2454v;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f1539cp == null && this.f1540cq == null) {
            int i = lVar.f2633cS;
            if (this.f1529bR < 1.0f) {
                i = lVar.f2634cT;
            }
            if (i > 0) {
                u.f5474bt.m4028a(this.f5841dH, this.f5842dI, i, this.f1441bB, z);
            }
        }
    }

    /* renamed from: bO */
    public Rect mo2799bO() {
        return this.f2454v.f2814cI;
    }

    /* renamed from: bQ */
    public Rect mo3612bQ() {
        return this.f2454v.f2816cK;
    }

    /* renamed from: bP */
    public Rect mo2798bP() {
        return this.f2454v.f2815cJ;
    }

    /* renamed from: b */
    public boolean mo2713b(int i, float f) {
        float f2;
        C0323as asVar = this.f2454v.f2836fE[i];
        if (asVar.f2196ar != 0.0f) {
            boolean z = true;
            if (asVar.f2154au != null && !asVar.f2154au.read(this)) {
                z = false;
            }
            if (z) {
                C0213ai aiVar = this.f1462cn[i];
                if (asVar.f2195aq != 0.0f) {
                    f2 = aiVar.f1561a;
                } else if (!asVar.f2194ap) {
                    f2 = aiVar.f1562b;
                } else {
                    f2 = mo2507C(i);
                }
                aiVar.f1571k += f;
                float f3 = f * asVar.f2153at;
                if (aiVar.f1572l > 0.0f) {
                    if (aiVar.f1572l < Float.POSITIVE_INFINITY && m2384a(f3, f2 + aiVar.f1572l, i) == 0.0f) {
                        aiVar.f1572l = Float.POSITIVE_INFINITY;
                    }
                } else if (aiVar.f1572l > Float.NEGATIVE_INFINITY && m2384a(f3, f2 + aiVar.f1572l, i) == 0.0f) {
                    aiVar.f1572l = Float.NEGATIVE_INFINITY;
                }
                if (aiVar.f1571k <= asVar.f2197as) {
                    return false;
                }
                aiVar.f1571k = -C0654f.m1553a(this, 0, (int) asVar.f2198av);
                float f4 = asVar.f2196ar;
                if (asVar.f2155aw > 0.0f) {
                    f4 += C0654f.m1520b(this, 0.0f, asVar.f2155aw, i);
                }
                aiVar.f1572l = aiVar.f1572l > 0.0f ? -f4 : f4;
                return false;
            }
        }
        if (asVar.f2195aq == 0.0f) {
            return asVar.f2194ap;
        }
        this.f1462cn[i].f1561a += asVar.f2195aq * f;
        if (this.f1462cn[i].f1561a > 180.0f) {
            this.f1462cn[i].f1561a -= 360.0f;
        }
        if (this.f1462cn[i].f1561a >= -180.0f) {
            return false;
        }
        this.f1462cn[i].f1561a += 360.0f;
        return false;
    }

    /* renamed from: cg */
    public int mo2655cg() {
        return this.f2454v.f2832eO;
    }

    /* renamed from: dk */
    public ArrayList m2995dk() {
        f2465dt.clear();
        ArrayList M = mo2480M();
        if (M.size() != 0) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar = (AbstractC0197s) it.next();
                if (sVar instanceof C0304f) {
                    C0304f fVar = (C0304f) sVar;
                    if (fVar.f1966c == EnumC0302d.f1956c) {
                        f2465dt.add(fVar);
                    }
                }
            }
        }
        return f2465dt;
    }

    /* renamed from: bX */
    public C0181c mo2691bX() {
        ArrayList dk = m2995dk();
        if (dk.size() > 0) {
            return ((AbstractC0197s) dk.get(0)).m3690J();
        }
        return null;
    }

    /* renamed from: a */
    public void mo2867a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList dk = m2995dk();
        if (dk.size() >= 2) {
            dk.remove(0);
            Iterator it = dk.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC0197s) it.next()).m3690J());
            }
        }
    }

    /* renamed from: cH */
    public float mo2722cH() {
        return this.f2454v.f2626cL;
    }

    /* renamed from: cI */
    public float mo2721cI() {
        return this.f2454v.f2627cM;
    }

    /* renamed from: bq */
    public void mo2770bq() {
        AbstractC0171m.m3812a((AbstractC0210af) this);
        this.f2480do.m2746e();
        super.mo2770bq();
    }

    /* renamed from: cK */
    public void mo3583cK() {
        this.f5843dJ = 170.0f;
        this.f2442f = 1.5f;
        m2996dj();
        super.mo3583cK();
    }

    /* renamed from: cL */
    public boolean mo2656cL() {
        return this.f2454v.f2595bY;
    }

    /* renamed from: bk */
    public int mo2711bk() {
        return this.f2454v.f2556bf;
    }

    /* renamed from: a */
    public void m3092a(int i, float f) {
        this.f1462cn[i].f1561a += f;
        if (this.f2454v.f2839fI) {
            for (int i2 = 0; i2 < this.f2454v.f2836fE.length; i2++) {
                if (this.f2454v.f2836fE[i2].f2177v == i) {
                    this.f1462cn[i2].f1561a += f;
                    this.f1462cn[i2].m3534a(2);
                }
            }
        }
    }

    /* renamed from: cJ */
    public float mo2720cJ() {
        return super.mo2720cJ() + this.f2454v.f2632cR;
    }

    /* renamed from: G */
    public float mo2506G(int i) {
        return this.f2454v.f2836fE[i].f2172o;
    }

    /* renamed from: H */
    public float mo2505H(int i) {
        return this.f2454v.f2836fE[i].f2173p;
    }

    /* renamed from: I */
    public float mo2504I(int i) {
        return this.f2454v.f2836fE[i].f2174q;
    }

    /* renamed from: a */
    public float mo2436a(AbstractC0210af afVar, float f, C0163f fVar) {
        C0336i cV = m3574cV();
        if (!(cV == null || this.f1540cq == null || !cV.f2271j)) {
            int i = 0;
            if (fVar != null) {
                i = fVar.f963aD;
            }
            if (i >= 0) {
                C0163f a = C0163f.m3903a(fVar);
                if (cV.f2272k) {
                    a.f1024am = 0.0f;
                }
                f = this.f1540cq.mo2436a(afVar, f, a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (mo2439J()) {
            f = 0.0f;
        }
        if (this.f2454v.f2613cv > 0.0f && f > this.f2454v.f2614cw) {
            float f2 = this.f2454v.f2613cv;
            if (fVar != null) {
                f2 -= fVar.f950an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.f2454v.f2614cw) {
                f = this.f2454v.f2614cw;
            }
        }
        mo3629a(EnumC0306ab.f1983n);
        return super.mo2436a(afVar, f, fVar);
    }

    /* renamed from: aQ */
    public float m3063aQ() {
        return this.f2454v.f2658dv;
    }

    /* renamed from: aa */
    public boolean m3057aa() {
        if (!this.f2454v.f2681dW) {
            return false;
        }
        return super.m2315aa();
    }

    /* renamed from: a */
    public boolean m3071a(EnumC0524z zVar) {
        if (zVar == EnumC0524z.f3529a) {
            return this.f2454v.f2641da.m3294a();
        }
        if (zVar == EnumC0524z.f3530b) {
            return this.f2454v.f2642db.m3294a();
        }
        if (zVar == EnumC0524z.f3531c) {
            return this.f2454v.f2643dc.m3294a();
        }
        return false;
    }

    /* renamed from: b */
    public void m3048b(EnumC0306ab abVar) {
        C0368l lVar = this.f2454v;
        if (lVar.f2849ga.f5778a != 0) {
            Object[] a = lVar.f2849ga.m490a();
            for (int i = lVar.f2849ga.f5778a - 1; i >= 0; i--) {
                C0305aa aaVar = (C0305aa) a[i];
                if (aaVar.f1967a == abVar) {
                    f2468dw.f224a = this.f5841dH;
                    f2468dw.f225b = this.f5842dI;
                    m3086a(aaVar.f1968b, f2468dw, (AbstractC0210af) null, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3629a(EnumC0306ab abVar) {
        C0368l lVar = this.f2454v;
        if (lVar.f2849ga.f5778a != 0) {
            Object[] a = lVar.f2849ga.m490a();
            for (int i = lVar.f2849ga.f5778a - 1; i >= 0; i--) {
                C0305aa aaVar = (C0305aa) a[i];
                if (aaVar.f1967a == abVar) {
                    f2466du.add(aaVar);
                    f2467dv.add(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3093a(float f, int i) {
        if (f2466du.f5778a != 0) {
            if (f2466du.f5778a != f2467dv.f5778a) {
                throw new RuntimeException("queuedUnitEvents out of sync: " + f2466du.f5778a + " vs " + f2467dv.f5778a);
            }
            Object[] a = f2466du.m490a();
            Object[] a2 = f2467dv.m490a();
            int i2 = f2466du.f5778a;
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                C0305aa aaVar = (C0305aa) a[i3];
                C0367k kVar = (C0367k) a2[i3];
                if (aaVar.f1969c == kVar.f2454v) {
                    f2468dw.f224a = kVar.f5841dH;
                    f2468dw.f225b = kVar.f5842dI;
                    kVar.m3086a(aaVar.f1968b, f2468dw, (AbstractC0210af) null, 0);
                }
            }
            if (i < 1 && i2 != f2466du.f5778a) {
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    f2466du.remove(i4);
                    f2467dv.remove(i4);
                }
                m3093a(f, i + 1);
            }
            f2466du.clear();
            f2467dv.clear();
        }
    }

    /* renamed from: r */
    public void m2979r(float f) {
        if (this.f2454v.f2755fL != null) {
            AbstractC0789l u = AbstractC0789l.m651u();
            C0368l lVar = this.f2454v;
            if (this.f2453u != 0.0f) {
                this.f2453u = C0654f.m1575a(this.f2453u, f);
                return;
            }
            for (int i = 0; i < lVar.f2755fL.length; i++) {
                C0375r rVar = lVar.f2755fL[i];
                if (rVar.f2876a.read(this)) {
                    if (u.f5578aV && u.f5580aX && this.f1460ci) {
                        if (rVar.f2877b != null) {
                            String str = "" + rVar.f2877b.m3689K();
                        }
                        String str2 = "autoTrigger fired on: " + m3567cl() + " details: " + rVar.f2876a.getDebugDetails(this);
                        AbstractC0789l.m683d(str2);
                        u.f5481bA.f4279f.m1636a(str2);
                    }
                    f2468dw.f224a = this.f5841dH;
                    f2468dw.f225b = this.f5842dI;
                    m3086a(rVar.f2877b, f2468dw, (AbstractC0210af) null, 0);
                    this.f2453u = this.f2454v.f2807bP;
                    if (lVar != this.f2454v) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: cM */
    public C0365i mo3582cM() {
        return this.f2462dx;
    }

    /* renamed from: a */
    public void m3074a(C0365i iVar, boolean z) {
        if (z) {
            this.f2462dx = iVar;
            return;
        }
        AbstractC0171m.m3792b((AbstractC0210af) this);
        this.f2462dx = iVar;
        AbstractC0171m.m3777c(this);
    }

    /* renamed from: k */
    public void m2982k(boolean z) {
        m3074a(this.f2454v.f2499G, z);
    }

    /* renamed from: a */
    public void m3075a(C0365i iVar) {
        C0365i cM = mo3582cM();
        if (cM == null || cM.m3108b() == 0) {
            m3074a(iVar, false);
        } else if (!C0364h.m3113b(cM, iVar)) {
            C0366j jVar = new C0366j(cM);
            if (jVar.m3105a(iVar)) {
                m3074a(jVar.m3107a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m3046b(C0365i iVar) {
        C0365i cM = mo3582cM();
        if (cM != null && cM.m3108b() != 0 && C0364h.m3118a(iVar, cM)) {
            C0366j jVar = new C0366j(cM);
            if (jVar.m3104b(iVar)) {
                m3074a(jVar.m3107a(), false);
            }
        }
    }

    /* renamed from: dl */
    public final void m2994dl() {
        if (this.f2454v.f2721eV == EnumC0212ah.f1555d) {
            if (mo2423i()) {
                m406R(5);
            } else if (!mo2631cc() || this.f1449bQ != 0.0f) {
                m406R(2);
            } else {
                m406R(3);
            }
        } else if (this.f1449bQ == 0.0f) {
            m406R(this.f2454v.f2813cp);
        }
        this.f5840dG = 0;
    }

    /* renamed from: bV */
    public boolean mo2808bV() {
        if (!this.f2454v.f2756fS) {
            return false;
        }
        return true;
    }

    /* renamed from: n_ */
    public boolean mo2624n_() {
        return this.f2454v.f2719eS.read(this);
    }

    /* renamed from: u */
    public boolean mo2623u() {
        return true;
    }

    /* renamed from: D */
    public C0814ag m3098D(int i) {
        f2469dy.m528a(mo2485E(i));
        C0323as asVar = this.f2454v.f2836fE[i];
        f2469dy.f5737c += asVar.f2145Z;
        return f2469dy;
    }

    /* renamed from: E */
    public PointF mo2485E(int i) {
        C0213ai aiVar = this.f1462cn[i];
        C0323as asVar = this.f2454v.f2836fE[i];
        float f = asVar.f2143W;
        float f2 = asVar.f2144X;
        if (asVar.f2185Y != 0.0f && aiVar.f1573m) {
            f2 += asVar.f2185Y;
        }
        float f3 = mo2444E() ? this.f1444bL : aiVar.f1561a;
        PointF F = mo2501F(i);
        float i2 = C0654f.m1474i(f3);
        float h = C0654f.m1478h(f3);
        f3462aT.m4474a(F.f224a + ((i2 * f) - (h * f2)), F.f225b + (h * f) + (i2 * f2));
        return f3462aT;
    }

    /* renamed from: bW */
    public boolean mo3607bW() {
        return this.f2454v.f2749fx;
    }

    /* renamed from: bY */
    public float mo3606bY() {
        return this.f2454v.f2834fy;
    }

    /* renamed from: a */
    public void m3084a(AbstractC0210af afVar, float f, int i) {
        if (this.f2454v.f2648dl != null) {
            this.f2470b.m3184a(this.f2454v.f2648dl, 5);
        }
        if (this.f2454v.f2580bH) {
            this.f3397L = C0654f.m1575a(this.f3397L, f);
            if (this.f3397L == 0.0f) {
                this.f3397L = this.f2454v.f2581bI;
                if (this.f2454v.f2582bJ != null) {
                    C0213ai aiVar = this.f1462cn[i];
                    PointF E = mo2485E(i);
                    this.f2454v.f2582bJ.m2876a(E.f224a, E.f225b, this.f5843dJ, aiVar.f1561a, this);
                }
                if (this.f2454v.f2583bK != null) {
                    this.f2454v.f2583bK.m2876a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, afVar.f1444bL, afVar);
                    return;
                }
                return;
            }
            return;
        }
        super.m2364a(afVar, f, i);
    }

    /* renamed from: b */
    public void m3051b(AbstractC0210af afVar, float f, int i) {
        if (this.f2454v.f2649dm != null) {
            this.f2470b.m3184a(this.f2454v.f2649dm, 5);
        }
        if (this.f2454v.f2584bL) {
            this.f3397L = C0654f.m1575a(this.f3397L, f);
            if (this.f3397L == 0.0f) {
                this.f3397L = this.f2454v.f2585bM;
                if (this.f2454v.f2586bN != null) {
                    C0213ai aiVar = this.f1462cn[i];
                    PointF E = mo2485E(i);
                    this.f2454v.f2586bN.m2876a(E.f224a, E.f225b, this.f5843dJ, aiVar.f1561a, this);
                }
                if (this.f2454v.f2587bO != null) {
                    this.f2454v.f2587bO.m2876a(afVar.f5841dH, afVar.f5842dI, afVar.f5843dJ, afVar.f1444bL, afVar);
                    return;
                }
                return;
            }
            return;
        }
        super.m2283b(afVar, f, i);
    }

    /* renamed from: bS */
    public boolean mo3610bS() {
        return this.f2454v.f2506R;
    }

    /* renamed from: dm */
    public boolean m2993dm() {
        if (this.f2454v.f2505Q != null && !this.f2454v.f2505Q.read(this)) {
            return false;
        }
        if (!this.f2454v.f2506R && AbstractC0789l.m651u().f5464bb.m3778c(this.f1441bB)) {
            return false;
        }
        C0336i cV = m3574cV();
        if (cV == null || cV.f2288o) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo1659t() {
        C0336i cV = m3574cV();
        if (cV == null || !cV.f2286m) {
            return this.f2454v.f2528aB;
        }
        return true;
    }

    /* renamed from: cD */
    public boolean mo3587cD() {
        C0336i cV = m3574cV();
        if (cV == null || !cV.f2287n) {
            return this.f2454v.f2529aC;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo2429d(AbstractC0210af afVar) {
        C0368l lVar = this.f2454v;
        return (lVar.f2534aH == null || C0364h.m3118a(lVar.f2534aH, afVar.mo3582cM())) && !m2992dn() && !lVar.f2530aD;
    }

    /* renamed from: cE */
    public boolean mo3586cE() {
        return this.f2454v.f2535aI;
    }

    /* renamed from: cC */
    public boolean mo3588cC() {
        return this.f2454v.f2530aD || mo1661o_() || (this.f1529bR < 1.0f && this.f2454v.f2547aW <= 0.0f);
    }

    /* renamed from: cP */
    public C0365i mo3580cP() {
        return this.f2454v.f2500H;
    }

    /* renamed from: ak */
    public float m3053ak() {
        return this.f2454v.f2704ev;
    }

    /* renamed from: al */
    public boolean m3052al() {
        return super.m2304al() || this.f2454v.f2703eu;
    }

    /* renamed from: a */
    public boolean mo2030a(AbstractC0789l lVar) {
        if (!lVar.f5597cv.m4449b(this.f5841dH, this.f5842dI)) {
            if (!this.f2454v.f2490v) {
                return false;
            }
            boolean z = false;
            if (this.f2454v.f2491w != null) {
                C0368l.f2763a.m4468a(this.f2454v.f2491w);
                C0368l.f2763a.m4470a((int) this.f5841dH, (int) this.f5842dI);
                if (lVar.f5599cx.m4464b(C0368l.f2763a)) {
                    z = true;
                }
            }
            if (lVar.f5597cv.m4449b(this.f5841dH, this.f5842dI - this.f5843dJ)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.f1539cp != null) {
            return false;
        }
        if ((this.f1541cr == null || !this.f1541cr.f2301I) && m3619b(lVar.f5464bb) && m2993dm()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0515r m3076a(C0336i iVar) {
        return C0335h.m3261a(this, iVar);
    }

    /* renamed from: a */
    public C0336i m3070a(short s) {
        return C0335h.m3257a(this, s);
    }

    /* renamed from: a */
    public boolean m3072a(AbstractC0515r rVar, C0336i iVar) {
        if (rVar == this) {
            return false;
        }
        if (iVar == null) {
            AbstractC0789l.m695b("attachRequest: No attachedSlotData");
            return false;
        }
        AbstractC0515r a = C0335h.m3261a(this, iVar);
        if (a != null) {
            AbstractC0789l.m695b("attachRequest: a unit is already in slot (parent:" + m3567cl() + " slot:" + iVar.m3250b() + " existing:" + a.m3566cm() + ")");
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0335h.m3260a(this, iVar, rVar);
        rVar.f1540cq = this;
        rVar.f1541cr = iVar;
        rVar.f1542cs = u.f5467bh;
        rVar.f1519by = false;
        return true;
    }

    /* renamed from: b */
    public boolean m3045b(AbstractC0515r rVar) {
        if (rVar.f1540cq != this) {
            AbstractC0789l.m695b("deattachRequest: unit is not attached");
            return false;
        }
        C0336i iVar = rVar.f1541cr;
        if (iVar == null) {
            AbstractC0789l.m695b("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        AbstractC0515r a = C0335h.m3261a(this, iVar);
        if (a == null) {
            AbstractC0789l.m695b("deattachRequest: Failed, no unit in slot");
            AbstractC0789l.m676f("deattachRequest");
            return false;
        } else if (rVar != a) {
            String str = "null";
            if (a != null) {
                str = a.m3567cl();
            }
            AbstractC0789l.m695b("deattachRequest: unit and slot don't match - requested:" + rVar.m3567cl() + " current:" + str);
            return false;
        } else {
            if (this.f2476x.remove(rVar)) {
                m2969z(rVar);
            }
            C0335h.m3260a(this, iVar, (AbstractC0515r) null);
            rVar.f1540cq = null;
            rVar.f1541cr = null;
            rVar.mo2432c_();
            return true;
        }
    }

    /* renamed from: dn */
    public boolean m2992dn() {
        C0336i cV = m3574cV();
        if (cV == null || cV.f2285l) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public boolean mo2439J() {
        if (!m2992dn() && !this.f2454v.f2531aE) {
            return false;
        }
        return true;
    }

    /* renamed from: cQ */
    public void mo3579cQ() {
        C0368l lVar = this.f2454v;
        if (!lVar.f2812ce.m3139b()) {
            lVar.f2812ce.m3129c(this, false);
        }
    }

    /* renamed from: cR */
    public void mo3578cR() {
        C0368l lVar = this.f2454v;
        if (!lVar.f2812ce.m3139b()) {
            lVar.f2812ce.m3123f(this);
        }
    }

    /* renamed from: a */
    public void m3081a(C0270an anVar) {
        mo3629a(EnumC0306ab.f1979j);
        C0336i cV = m3574cV();
        if (cV != null && cV.f2279H) {
            EnumC0271ao d = anVar.m3464d();
            if (d == EnumC0271ao.f1666h || d == EnumC0271ao.f1659a) {
                m2256bs();
            }
        }
    }

    /* renamed from: b_ */
    public boolean mo3604b_() {
        C0368l lVar = this.f2454v;
        if (lVar.f2533aG || !AbstractC0789l.m651u().f5464bb.m3778c(this.f1441bB)) {
            return lVar.f2532aF;
        }
        return false;
    }

    /* renamed from: cS */
    public boolean mo3577cS() {
        return this.f2454v.f2507S;
    }

    /* renamed from: cT */
    public boolean mo3576cT() {
        return this.f2454v.f2828ez;
    }

    /* renamed from: cU */
    public boolean mo3575cU() {
        return this.f2454v.f2829eA;
    }

    /* renamed from: C */
    public boolean m3099C(AbstractC0210af afVar) {
        int i = m2991do();
        int cg = afVar.mo2655cg();
        if (this.f2454v.f2708eD) {
            cg = 1;
        }
        if (i + cg <= this.f2454v.f2830eB) {
            return true;
        }
        return false;
    }

    /* renamed from: do */
    public int m2991do() {
        int i = 0;
        if (this.f2454v.f2708eD) {
            i = 0 + this.f2476x.size();
        } else if (this.f2476x.f5778a > 0) {
            Iterator it = this.f2476x.iterator();
            while (it.hasNext()) {
                i += ((AbstractC0210af) it.next()).mo2655cg();
            }
        }
        return i;
    }

    /* renamed from: c */
    public void mo3595c(AbstractC0171m mVar) {
        C0336i cV;
        if (this.f1441bB != mVar) {
            super.mo3595c(mVar);
            if (this.f2476x != null && !this.f2454v.f2716eM) {
                Iterator it = this.f2476x.iterator();
                while (it.hasNext()) {
                    ((AbstractC0210af) it.next()).mo3595c(mVar);
                }
            }
            if (this.f2477y != null) {
                Iterator it2 = this.f2477y.iterator();
                while (it2.hasNext()) {
                    AbstractC0210af afVar = (AbstractC0210af) it2.next();
                    if (!(afVar == null || (cV = afVar.m3574cV()) == null || cV.f2276z)) {
                        afVar.mo3595c(mVar);
                    }
                }
            }
            mo3629a(EnumC0306ab.f1980k);
        }
    }

    /* renamed from: cw */
    public C0363g mo3557cw() {
        return this.f2454v.f2593bV;
    }

    /* renamed from: bT */
    public void mo3609bT() {
        if (!this.f2454v.f2558bh) {
            super.mo3609bT();
        } else if (this.f1450bY <= -1.0f) {
            this.f1450bY = -1.0f;
        }
    }

    /* renamed from: g */
    public C0835m mo3548g(boolean z) {
        this.f2482dz.clear();
        if (this.f2454v.f2799ap.f5778a > 0) {
            C0335h.m3258a(this, this.f2482dz, z);
        }
        if (this.f2482dz.f5778a > 0) {
            return this.f2482dz;
        }
        return null;
    }

    /* renamed from: cX */
    public float mo3573cX() {
        return this.f2454v.f2630cP;
    }
}
