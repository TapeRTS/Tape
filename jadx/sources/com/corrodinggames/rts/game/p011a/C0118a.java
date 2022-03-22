package com.corrodinggames.rts.game.p011a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0214aj;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.C0450f;
import com.corrodinggames.rts.game.units.EnumC0178a;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.EnumC0272b;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.game.units.p014b.C0275c;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0385a;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.game.units.p023d.C0417l;
import com.corrodinggames.rts.game.units.p023d.C0427r;
import com.corrodinggames.rts.game.units.p028h.C0494e;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a.class */
public final class C0118a extends AbstractC0171m {

    /* renamed from: ab */
    public static boolean f509ab;

    /* renamed from: ac */
    final int f510ac = 3000;

    /* renamed from: ad */
    int f511ad;

    /* renamed from: ae */
    int f512ae;

    /* renamed from: af */
    int f513af;

    /* renamed from: ag */
    int f514ag;

    /* renamed from: ah */
    int f515ah;

    /* renamed from: ai */
    int f516ai;

    /* renamed from: aj */
    int f517aj;

    /* renamed from: ak */
    int f518ak;

    /* renamed from: al */
    int f519al;

    /* renamed from: am */
    int f520am;

    /* renamed from: an */
    int f521an;

    /* renamed from: ao */
    int f522ao;

    /* renamed from: ap */
    int f523ap;

    /* renamed from: aq */
    int f524aq;

    /* renamed from: ar */
    public int f525ar;

    /* renamed from: as */
    int f526as;

    /* renamed from: at */
    boolean f527at;

    /* renamed from: au */
    float f528au;

    /* renamed from: av */
    float f529av;

    /* renamed from: aw */
    float f530aw;

    /* renamed from: ax */
    float f531ax;

    /* renamed from: ay */
    float f532ay;

    /* renamed from: az */
    float f533az;

    /* renamed from: aA */
    float f534aA;

    /* renamed from: aB */
    float f535aB;

    /* renamed from: aC */
    float f536aC;

    /* renamed from: aD */
    float f537aD;

    /* renamed from: aE */
    int f538aE;

    /* renamed from: aF */
    float f539aF;

    /* renamed from: aG */
    public boolean f540aG;

    /* renamed from: aH */
    public boolean f541aH;

    /* renamed from: aI */
    public boolean f542aI;

    /* renamed from: aJ */
    int f543aJ;

    /* renamed from: aK */
    int f544aK;

    /* renamed from: aL */
    int f545aL;

    /* renamed from: aM */
    boolean f546aM;

    /* renamed from: aN */
    boolean f547aN;

    /* renamed from: aO */
    C0450f f548aO;

    /* renamed from: aP */
    boolean f549aP;

    /* renamed from: aQ */
    boolean f550aQ;

    /* renamed from: aR */
    boolean f551aR;

    /* renamed from: aS */
    boolean f552aS;

    /* renamed from: aT */
    int f553aT;

    /* renamed from: aU */
    ConcurrentLinkedQueue f554aU;

    /* renamed from: aV */
    ArrayList f555aV;

    /* renamed from: aW */
    PointF f556aW;

    /* renamed from: aX */
    Paint f557aX;

    /* renamed from: aY */
    ArrayList f558aY;

    /* renamed from: aZ */
    AbstractC0134d f559aZ;

    /* renamed from: ba */
    AbstractC0134d f560ba;

    /* renamed from: bb */
    AbstractC0134d f561bb;

    /* renamed from: bc */
    AbstractC0134d f562bc;

    /* renamed from: bd */
    AbstractC0134d f563bd;

    /* renamed from: be */
    AbstractC0134d f564be;

    /* renamed from: bf */
    AbstractC0134d f565bf;

    /* renamed from: bg */
    AbstractC0134d f566bg;

    /* renamed from: bh */
    AbstractC0134d f567bh;

    /* renamed from: bi */
    AbstractC0134d f568bi;

    /* renamed from: bj */
    AbstractC0134d f569bj;

    /* renamed from: bk */
    AbstractC0134d f570bk;

    /* renamed from: bl */
    AbstractC0134d f571bl;

    /* renamed from: bm */
    public C0133c f572bm;

    /* renamed from: bn */
    int f573bn;

    /* renamed from: bo */
    public float f574bo;

    /* renamed from: bp */
    ArrayList f575bp;

    /* renamed from: bq */
    private static ArrayList f576bq = new ArrayList();

    /* renamed from: a */
    static /* synthetic */ boolean m4199a(C0118a aVar, AbstractC0268al alVar) {
        return aVar.m4189a(alVar);
    }

    /* renamed from: R */
    public boolean m4212R() {
        return m4208V() == 3 || m4208V() > 300;
    }

    /* renamed from: S */
    public boolean m4211S() {
        return m4208V() >= 2;
    }

    /* renamed from: T */
    public boolean m4210T() {
        return (1 & this.f526as) == 1;
    }

    /* renamed from: U */
    public boolean m4209U() {
        return m4210T();
    }

    /* renamed from: V */
    public int m4208V() {
        return this.f573bn;
    }

    /* renamed from: W */
    public boolean m4207W() {
        if (AbstractC0789l.m651u().f5483bC.f5144x.f5095i > 3000) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public boolean m4206X() {
        if (!m4207W() && this.f549aP && this.f550aQ && this.f551aR && this.f552aS) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public boolean m4205Y() {
        if (this.f552aS && m4206X() && this.f550aQ) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4201a(float f, float f2, AbstractC0145o oVar, EnumC0212ah ahVar) {
        if (m4202a(f, f2, oVar.f704S, oVar.f705T, ahVar)) {
            return true;
        }
        for (float f3 = -180.0f; f3 < 180.0f; f3 += 90.0f) {
            if (m4202a(f, f2, oVar.f704S + (C0654f.m1474i(f3) * oVar.f706U * 0.4f), oVar.f705T + (C0654f.m1478h(f3) * oVar.f706U * 0.4f), ahVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4202a(float f, float f2, float f3, float f4, EnumC0212ah ahVar) {
        if (ahVar == EnumC0212ah.f1555d || ahVar == EnumC0212ah.f1552a) {
            return true;
        }
        short b = C0851y.m413b(f, f2, ahVar);
        short b2 = C0851y.m413b(f3, f4, ahVar);
        if (b == -3 || b2 == -3) {
            String str = "null";
            if (ahVar != null) {
                str = ahVar.name();
            }
            m4160d("pathPossible: no isolatedGroups found! (" + str + ")");
            AbstractC0789l.m761M();
        }
        if (b == -1 || b2 == -1 || b == -2 || b2 == -2 || b != b2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4193a(AbstractC0210af afVar, float f, float f2) {
        return m4202a(afVar.f5841dH, afVar.f5842dI, f, f2, afVar.mo2424h());
    }

    /* renamed from: b */
    public boolean m4166b(AbstractC0210af afVar, float f, float f2) {
        EnumC0212ah h = afVar.mo2424h();
        return m4202a(afVar.f5841dH, afVar.f5842dI, f, f2, h) || m4202a(afVar.f5841dH, afVar.f5842dI, f + 60.0f, f2, h) || m4202a(afVar.f5841dH, afVar.f5842dI, f - 60.0f, f2, h) || m4202a(afVar.f5841dH, afVar.f5842dI, f, f2 + 60.0f, h) || m4202a(afVar.f5841dH, afVar.f5842dI, f, f2 - 60.0f, h);
    }

    /* renamed from: a */
    public boolean m4191a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        return m4166b(afVar, afVar2.f5841dH, afVar2.f5842dI);
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        int i;
        apVar.mo1104a(this.f527at);
        apVar.mo1110a(this.f528au);
        apVar.mo1110a(this.f529av);
        apVar.mo1110a(this.f530aw);
        apVar.mo1110a(this.f531ax);
        apVar.mo1110a(this.f536aC);
        apVar.mo1109a(this.f538aE);
        apVar.mo1110a(this.f539aF);
        apVar.mo1104a(this.f540aG);
        apVar.mo1109a(this.f543aJ);
        apVar.mo1109a(this.f554aU.size());
        Iterator it = this.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                i = 1;
            } else if (oVar instanceof C0137g) {
                i = 2;
            } else if (oVar instanceof C0144n) {
                i = 3;
            } else if (oVar instanceof C0143m) {
                i = 4;
            } else if (oVar instanceof C0142l) {
                i = 5;
            } else {
                throw new RuntimeException("zone not instance not supported:" + oVar.getClass().getName());
            }
            apVar.m1175c(i);
            apVar.mo1109a(oVar.f702Q);
        }
        Iterator it2 = this.f554aU.iterator();
        while (it2.hasNext()) {
            AbstractC0145o oVar2 = (AbstractC0145o) it2.next();
            apVar.mo1109a(oVar2.f702Q);
            oVar2.mo1654a(apVar);
        }
        apVar.m1175c(8);
        apVar.mo1109a(this.f525ar);
        apVar.mo1104a(this.f546aM);
        apVar.mo1104a(this.f549aP);
        apVar.mo1104a(this.f550aQ);
        apVar.mo1104a(this.f551aR);
        apVar.mo1104a(this.f552aS);
        apVar.mo1110a(this.f537aD);
        apVar.mo1109a(this.f553aT);
        apVar.mo1109a(this.f511ad);
        apVar.mo1109a(this.f512ae);
        apVar.mo1109a(this.f513af);
        apVar.mo1104a(this.f541aH);
        apVar.mo1109a(this.f526as);
        super.mo1654a(apVar);
    }

    /* renamed from: o */
    public AbstractC0145o m4148o(int i) {
        if (i == 1) {
            return new C0139i(this, -1.0f, -1.0f);
        }
        if (i == 2) {
            return new C0137g(this);
        }
        if (i == 3) {
            return new C0144n(this);
        }
        if (i == 4) {
            return new C0143m(this);
        }
        if (i == 5) {
            return new C0142l(this);
        }
        if (i == 0) {
            AbstractC0789l.m695b("Found zone type 0, loading PlainZone instead");
            return new C0143m(this);
        }
        throw new RuntimeException("Unknown zone type:" + i);
    }

    /* renamed from: c */
    public void m4162c(C0707k kVar) {
        AbstractC0145o oVar;
        this.f527at = kVar.m1077e();
        this.f528au = kVar.m1075g();
        this.f529av = kVar.m1075g();
        this.f530aw = kVar.m1075g();
        this.f531ax = kVar.m1075g();
        this.f536aC = kVar.m1075g();
        this.f538aE = kVar.m1076f();
        this.f539aF = kVar.m1075g();
        this.f540aG = kVar.m1077e();
        this.f543aJ = kVar.m1076f();
        int f = kVar.m1076f();
        this.f554aU.clear();
        boolean z = false;
        if (kVar.m1085b() >= 20) {
            z = true;
            for (int i = 0; i < f; i++) {
                m4148o(kVar.m1079d()).f702Q = kVar.m1076f();
            }
        }
        for (int i2 = 0; i2 < f; i2++) {
            if (!z) {
                oVar = m4148o(kVar.m1079d());
            } else {
                oVar = m4147p(kVar.m1076f());
            }
            oVar.mo4048a(kVar);
        }
        byte d = kVar.m1079d();
        if (d >= 1) {
            this.f525ar = kVar.m1076f();
        }
        this.f555aV.clear();
        this.f555aV.addAll(this.f554aU);
        if (d >= 2) {
            this.f546aM = kVar.m1077e();
            this.f549aP = kVar.m1077e();
            this.f550aQ = kVar.m1077e();
        }
        if (d >= 3) {
            this.f551aR = kVar.m1077e();
            this.f552aS = kVar.m1077e();
        }
        if (d >= 4) {
            this.f537aD = kVar.m1075g();
        }
        if (d >= 5) {
            this.f553aT = kVar.m1076f();
        }
        if (d >= 6) {
            this.f511ad = kVar.m1076f();
            this.f512ae = kVar.m1076f();
            this.f513af = kVar.m1076f();
        }
        if (d >= 7) {
            this.f541aH = kVar.m1077e();
        }
        if (d >= 8) {
            this.f526as = kVar.m1076f();
        }
        super.m3774c(kVar);
        m4204Z();
    }

    /* renamed from: p */
    public AbstractC0145o m4147p(int i) {
        Iterator it = this.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar.f702Q == i) {
                return oVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m4196a(AbstractC0145o oVar) {
        if (oVar == null) {
            return -1;
        }
        return oVar.f702Q;
    }

    /* renamed from: Z */
    void m4204Z() {
        this.f516ai = 0;
        this.f519al = 0;
        this.f520am = 0;
        this.f521an = 0;
        this.f517aj = 0;
        this.f518ak = 0;
        this.f522ao = 0;
        this.f523ap = 0;
        this.f514ag = 0;
        this.f515ah = 0;
        this.f524aq = 0;
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar = (C0139i) oVar;
                this.f514ag++;
                if (iVar.m4064u() >= 2) {
                    this.f515ah++;
                }
                if (iVar.f641n) {
                    this.f524aq++;
                }
            }
            if (oVar instanceof C0137g) {
                C0137g gVar = (C0137g) oVar;
                if (!gVar.f603a) {
                    if (gVar.f609g) {
                        this.f516ai++;
                        if (!gVar.f623u && !gVar.m4121d()) {
                            if (!gVar.f629A) {
                                this.f517aj++;
                            } else {
                                this.f518ak++;
                            }
                        }
                    } else {
                        this.f519al++;
                        if (gVar.m4121d()) {
                            this.f520am++;
                        }
                        this.f521an += gVar.m4114g();
                    }
                }
            }
            if (oVar instanceof C0144n) {
                this.f522ao++;
                if (((AbstractC0138h) oVar).m4114g() > 0) {
                    this.f523ap++;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4189a(AbstractC0268al alVar) {
        AbstractC0210af b = AbstractC0210af.m3617b(alVar);
        if (b.mo2797bw() || !(b instanceof AbstractC0515r) || m4154g(b) || b.mo3621ah() || !((AbstractC0515r) b).mo2421l()) {
            return false;
        }
        if (!(alVar instanceof C0368l)) {
            return true;
        }
        C0368l lVar = (C0368l) alVar;
        if (lVar.f2736fk || !lVar.f2733fh) {
            return false;
        }
        return true;
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$1.class */
    class C01191 extends AbstractC0134d {
        C01191(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            return C0118a.m4199a(C0118a.this, alVar) && m4136a(alVar, EnumC0212ah.f1553b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$6.class */
    class C01286 extends AbstractC0134d {
        C01286(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            return C0118a.m4199a(C0118a.this, alVar) && m4136a(alVar, EnumC0212ah.f1557f);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$7.class */
    class C01297 extends AbstractC0134d {
        C01297(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            return C0118a.m4199a(C0118a.this, alVar) && m4136a(alVar, EnumC0212ah.f1555d);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$8.class */
    class C01308 extends AbstractC0134d {
        C01308(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            return C0118a.m4199a(C0118a.this, alVar) && m4136a(alVar, EnumC0212ah.f1556e);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$9.class */
    class C01319 extends AbstractC0134d {
        C01319(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!AbstractC0210af.m3617b(alVar).mo2797bw()) {
                return false;
            }
            if (!(alVar instanceof C0368l) || !((C0368l) alVar).f2736fk) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$10.class */
    class C012010 extends AbstractC0134d {
        C012010(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!C0118a.this.m4154g(AbstractC0210af.m3617b(alVar))) {
                return false;
            }
            if ((alVar instanceof C0368l) && ((C0368l) alVar).f2736fk) {
                return false;
            }
            if (alVar.mo3488o() == EnumC0212ah.f1555d || alVar.mo3488o() == EnumC0212ah.f1557f || alVar.mo3488o() == EnumC0212ah.f1559h) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$11.class */
    class C012111 extends AbstractC0134d {
        C012111(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!C0118a.this.f564be.mo4137a(alVar) || alVar.mo3488o() != EnumC0212ah.f1555d) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$12.class */
    class C012212 extends AbstractC0134d {
        C012212(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!C0118a.this.f564be.mo4137a(alVar) || alVar.mo3488o() == EnumC0212ah.f1555d) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$13.class */
    class C012313 extends AbstractC0134d {
        C012313(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!alVar.mo3490m()) {
                return false;
            }
            if ((!(alVar instanceof C0368l) || !((C0368l) alVar).f2736fk) && alVar.mo3488o() != EnumC0212ah.f1556e) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$2.class */
    class C01242 extends AbstractC0134d {
        C01242(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            AbstractC0210af.m3617b(alVar);
            if (!alVar.mo3489n()) {
                return false;
            }
            if ((!(alVar instanceof C0368l) || !((C0368l) alVar).f2736fk) && alVar.mo3488o() != EnumC0212ah.f1556e) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$3.class */
    class C01253 extends AbstractC0134d {
        C01253(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            if (!AbstractC0210af.m3617b(alVar).mo2797bw() || !alVar.mo3487p()) {
                return false;
            }
            if (!(alVar instanceof C0368l) || !((C0368l) alVar).f2736fk) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$4.class */
    class C01264 extends AbstractC0134d {
        C01264(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            AbstractC0268al i;
            AbstractC0210af b = AbstractC0210af.m3617b(alVar);
            if (!b.mo2797bw()) {
                return false;
            }
            if ((alVar instanceof C0368l) && ((C0368l) alVar).f2736fk) {
                return false;
            }
            boolean z = false;
            Iterator it = b.mo2480M().iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar = (AbstractC0197s) it.next();
                if (sVar != null && (sVar instanceof AbstractC0201w)) {
                    AbstractC0201w wVar = (AbstractC0201w) sVar;
                    if (!wVar.mo3396C() && (i = wVar.mo2686i()) != null && !i.mo3493j()) {
                        z = true;
                    }
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.a.a$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$5.class */
    class C01275 extends AbstractC0134d {
        C01275(String str) {
            super(C0118a.this, str);
        }

        /* renamed from: a */
        public boolean mo4137a(AbstractC0268al alVar) {
            AbstractC0268al i;
            AbstractC0210af b = AbstractC0210af.m3617b(alVar);
            if (!b.mo2797bw()) {
                return false;
            }
            if ((alVar instanceof C0368l) && ((C0368l) alVar).f2736fk) {
                return false;
            }
            boolean z = false;
            Iterator it = b.mo2480M().iterator();
            while (it.hasNext()) {
                AbstractC0197s sVar = (AbstractC0197s) it.next();
                if (sVar != null && (sVar instanceof AbstractC0201w)) {
                    AbstractC0201w wVar = (AbstractC0201w) sVar;
                    if (!wVar.mo3396C() && (i = wVar.mo2686i()) != null && !i.mo3493j() && i.mo3490m()) {
                        z = true;
                    }
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    public C0118a(int i) {
        this(i, true);
    }

    public C0118a(int i, boolean z) {
        super(i, z);
        this.f510ac = 3000;
        this.f526as = 0;
        this.f534aA = 0.0f;
        this.f535aB = 0.0f;
        this.f546aM = true;
        this.f547aN = true;
        this.f554aU = new ConcurrentLinkedQueue();
        this.f555aV = new ArrayList();
        this.f556aW = new PointF();
        this.f558aY = new ArrayList();
        this.f559aZ = new C01191("attackingUnitsLand");
        this.f560ba = new C01286("attackingUnitsHover");
        this.f561bb = new C01297("attackingUnitsAir");
        this.f562bc = new C01308("attackingUnitsWater");
        this.f563bd = new C01319("buildingUnits");
        this.f564be = new C012010("transportUnits");
        this.f565bf = new C012111("transportUnitsFlying");
        this.f566bg = new C012212("transportUnitsNonFlying");
        this.f567bh = new C012313("builderUnits");
        this.f568bi = new C01242("harvesterUnits");
        this.f569bj = new C01253("extractorUnits");
        this.f570bk = new C01264("buildingFactories");
        this.f571bl = new C01275("buildingFactoriesForBuilders");
        this.f572bm = new C0133c();
        this.f574bo = 0.0f;
        this.f575bp = new ArrayList();
        m4170aj();
    }

    /* renamed from: aj */
    private void m4170aj() {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f528au = 100 + (this.f1230i * 9);
        this.f530aw = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15 + (this.f1230i * 19);
        this.f532ay = 50 + (this.f1230i * 2);
        this.f539aF = 4200 + (this.f1230i * 5);
        this.f536aC = 3500 + (this.f1230i * 5);
        this.f537aD = 7500 + (this.f1230i * 5);
        this.f557aX = new Paint();
        this.f557aX.m4502b(Color.m4547a(0, 255, 0));
        this.f557aX.m4517a(Paint.Style.f217b);
        this.f557aX.m4506a(true);
        u.m736a(this.f557aX, 14.0f);
        m4179aa();
    }

    /* renamed from: aa */
    public void m4179aa() {
        Iterator it = this.f558aY.iterator();
        while (it.hasNext()) {
            ((AbstractC0134d) it.next()).m4135b();
        }
    }

    /* renamed from: d */
    public void m4160d(String str) {
        AbstractC0789l.m694b("ai_debug(" + this.f1230i + ")", str);
    }

    /* renamed from: ab */
    public PointF m4178ab() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5474bt.m4025a(C0654f.m1567a(0, u.f5474bt.f734y), C0654f.m1567a(0, u.f5474bt.f735z));
        this.f556aW.m4474a(u.f5474bt.f741M, u.f5474bt.f742N);
        return this.f556aW;
    }

    /* renamed from: ac */
    public PointF m4177ac() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5474bt.f773w.size() == 0) {
            return null;
        }
        Point point = (Point) u.f5474bt.f773w.get(C0654f.m1526b(u.f5474bt.f773w.size()));
        u.f5474bt.m4025a(point.f221a, point.f222b);
        this.f556aW.m4474a(u.f5474bt.f741M, u.f5474bt.f742N);
        return this.f556aW;
    }

    /* renamed from: a */
    public PointF m4203a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        float f3 = -1.0f;
        PointF pointF = new PointF();
        for (int i = 0; i < u.f5474bt.f773w.size(); i++) {
            Point point = (Point) u.f5474bt.f773w.get(i);
            u.f5474bt.m4025a(point.f221a, point.f222b);
            this.f556aW.m4474a(u.f5474bt.f741M, u.f5474bt.f742N);
            PointF pointF2 = this.f556aW;
            float a = C0654f.m1573a(pointF2.f224a, pointF2.f225b, f, f2);
            if (a < f3 || f3 == -1.0f) {
                f3 = a;
                pointF.m4473a(pointF2);
            }
        }
        if (f3 == -1.0f) {
            return null;
        }
        return pointF;
    }

    /* renamed from: e */
    C0139i m4158e(AbstractC0210af afVar) {
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar = (C0139i) oVar;
                if (iVar.m4047b(afVar)) {
                    return iVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    C0139i m4169b(float f, float f2) {
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar = (C0139i) oVar;
                if (iVar.m4046c(f, f2)) {
                    return iVar;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    C0139i m4156f(AbstractC0210af afVar) {
        return m4164c(afVar.f5841dH, afVar.f5842dI);
    }

    /* renamed from: c */
    C0139i m4164c(float f, float f2) {
        float f3 = -1.0f;
        C0139i iVar = null;
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar2 = (C0139i) oVar;
                float d = iVar2.m4044d(f, f2);
                if (iVar == null || d < f3) {
                    f3 = d;
                    iVar = iVar2;
                }
            }
        }
        return iVar;
    }

    /* renamed from: a */
    C0139i m4190a(EnumC0212ah ahVar, float f, float f2, boolean z) {
        float f3 = -1.0f;
        C0139i iVar = null;
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar2 = (C0139i) oVar;
                float d = iVar2.m4044d(f, f2);
                if (m4201a(f, f2, iVar2, ahVar) && (!z || !iVar2.f644t)) {
                    if (iVar == null || d < f3) {
                        f3 = d;
                        iVar = iVar2;
                    }
                }
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public static boolean m4192a(AbstractC0210af afVar, float f, float f2, float f3) {
        if (C0654f.m1573a(afVar.f5841dH, afVar.f5842dI, f, f2) < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4200a(PointF pointF) {
        if (m4195a(this, pointF.f224a, pointF.f225b, 290.0f) != null) {
            return false;
        }
        C0139i c = m4164c(pointF.f224a, pointF.f225b);
        if (c != null && c.m4044d(pointF.f224a, pointF.f225b) < 490000.0f) {
            return false;
        }
        PointF a = m4203a(pointF.f224a, pointF.f225b);
        if ((a == null || C0654f.m1573a(pointF.f224a, pointF.f225b, a.f224a, a.f225b) >= 160000.0f) && !C0851y.m409c(pointF.f224a, pointF.f225b) && !C0851y.m409c(pointF.f224a + 60.0f, pointF.f225b) && !C0851y.m409c(pointF.f224a, pointF.f225b + 60.0f) && !C0851y.m409c(pointF.f224a - 60.0f, pointF.f225b) && !C0851y.m409c(pointF.f224a, pointF.f225b + 60.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4168b(PointF pointF) {
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar.f1441bB != this && (afVar instanceof C0404d)) {
                if (afVar.f1441bB.m3778c(this) && m4192a(afVar, pointF.f224a, pointF.f225b, 300.0f)) {
                    return false;
                }
                if (afVar.f1441bB.m3768d(this) && m4192a(afVar, pointF.f224a, pointF.f225b, 320.0f)) {
                    return false;
                }
            }
        }
        if (m4167b(this, pointF.f224a, pointF.f225b, 360.0f) < 4 && m4194a((AbstractC0171m) this, pointF.f224a, pointF.f225b, 360.0f, true) < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int m4197a(AbstractC0134d dVar, EnumC0132b bVar) {
        int i = 0;
        Iterator it = dVar.f597c.iterator();
        while (it.hasNext()) {
            i += m4187a(((C0135e) it.next()).f600a, bVar);
        }
        return i;
    }

    /* renamed from: a */
    public int m4187a(AbstractC0268al alVar, EnumC0132b bVar) {
        return m4186a(alVar, true, bVar);
    }

    /* renamed from: a */
    public int m4186a(AbstractC0268al alVar, boolean z, EnumC0132b bVar) {
        boolean j = alVar.mo3493j();
        Integer a = this.f572bm.m4143a(j, alVar, z);
        if (a != null) {
            return a.intValue();
        }
        int i = 0;
        if (j) {
            z = false;
        }
        AbstractC0210af[] a2 = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a2[i2];
            if (afVar.f1441bB == this && (bVar == EnumC0132b.f590a || !afVar.f1514br)) {
                if (afVar.f1471db == alVar) {
                    i++;
                }
                if (z && (afVar instanceof AbstractC0416k)) {
                    i += ((AbstractC0416k) afVar).mo2734h(alVar);
                }
            }
        }
        this.f572bm.m4142a(j, alVar, z, Integer.valueOf(i));
        return i;
    }

    /* renamed from: ad */
    public int m4176ad() {
        int i = 0;
        Iterator it = this.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0137g) {
                i += ((C0137g) oVar).f631C.size();
            }
        }
        return i;
    }

    /* renamed from: g */
    public boolean m4154g(AbstractC0210af afVar) {
        if (!(afVar instanceof AbstractC0515r)) {
            return false;
        }
        AbstractC0515r rVar = (AbstractC0515r) afVar;
        if (!rVar.mo2631cc()) {
            return false;
        }
        AbstractC0268al r = rVar.mo1660r();
        if (!(r instanceof C0368l) || ((C0368l) r).f2734fi) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m4152h(AbstractC0210af afVar) {
        if (!(afVar instanceof AbstractC0515r)) {
            return false;
        }
        AbstractC0515r rVar = (AbstractC0515r) afVar;
        if (rVar.mo2797bw() || !rVar.mo2421l() || m4154g(rVar) || rVar.mo3621ah()) {
            return false;
        }
        AbstractC0268al r = rVar.mo1660r();
        if (!(r instanceof C0368l) || ((C0368l) r).f2733fh) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4165b(AbstractC0210af afVar, AbstractC0210af afVar2) {
        if (this.f1260J) {
            if (!(afVar instanceof AbstractC0515r)) {
                return false;
            }
            AbstractC0515r rVar = (AbstractC0515r) afVar;
            if (!rVar.m2301ao() || !C0214aj.m3528a(rVar, afVar2)) {
                return false;
            }
            return true;
        } else if (!m4152h(afVar) || !(afVar instanceof AbstractC0515r) || !C0214aj.m3528a((AbstractC0515r) afVar, afVar2)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public void m4157f(float f) {
        String[] split;
        C0144n nVar;
        String[] split2;
        if (f509ab && AbstractC0789l.m651u().f5578aV && !this.f542aI && !this.f540aG) {
            AbstractC0789l u = AbstractC0789l.m651u();
            AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar.f1441bB == this && u.f5596cu.m4465b((int) (afVar.f5841dH - 200.0f), (int) (afVar.f5842dI - 200.0f), (int) (afVar.f5841dH + 200.0f), (int) (afVar.f5842dI + 200.0f))) {
                    if (afVar instanceof AbstractC0515r) {
                        AbstractC0515r rVar = (AbstractC0515r) afVar;
                    }
                    String str = "";
                    float f2 = (afVar.f5842dI - u.f5509ce) - 60.0f;
                    this.f557aX.m4502b(Color.m4547a(0, 255, 0));
                    if (afVar instanceof C0404d) {
                        f2 -= 80.0f;
                        str = ((((((str + "Base ( Team:" + this.f1230i + " )") + "\nuseTransportsOnThisMap: " + m4206X()) + "\nuseHoverTransportsOnThisMap: " + m4205Y()) + "\nattackingCount: " + this.f543aJ) + "\ndefendingCount: " + this.f544aK) + "\nnumOfUnitsNeedingTransport: " + m4176ad()) + "\ntransport: " + this.f523ap;
                        if (m4210T()) {
                            str = str + "\nTurtling: true";
                        }
                        this.f557aX.m4502b(Color.m4547a(255, 255, 255));
                    }
                    if (str.length() != 0) {
                        for (String str2 : str.split("\n")) {
                            float f3 = afVar.f5841dH - u.f5508cd;
                            float f4 = f2;
                            float m = (-this.f557aX.m4481l()) + this.f557aX.m4480m();
                            u.f5477bw.mo125j();
                            if (u.f5602cE > 1.0f) {
                                u.m762L();
                                f3 *= u.f5602cE;
                                f4 *= u.f5602cE;
                                m /= u.f5602cE;
                            }
                            u.f5477bw.mo158a(str2, f3, f4, this.f557aX);
                            u.f5477bw.mo124k();
                            f2 += m;
                        }
                    }
                }
            }
            Iterator it = this.f554aU.iterator();
            while (it.hasNext()) {
                AbstractC0145o oVar = (AbstractC0145o) it.next();
                if (u.f5596cu.m4465b((int) (oVar.f704S - oVar.f706U), (int) (oVar.f705T - oVar.f706U), (int) (oVar.f704S + oVar.f706U), (int) (oVar.f705T + oVar.f706U))) {
                    this.f557aX.m4502b(m3829F());
                    u.f5477bw.mo195a(oVar.f704S - u.f5508cd, oVar.f705T - u.f5509ce, oVar.f706U + 2.0f, this.f557aX);
                    int a2 = Color.m4547a(0, 255, 0);
                    String str3 = "\n" + oVar.getClass().getSimpleName() + " ( Team:" + this.f1230i + " )";
                    float f5 = oVar.f705T - u.f5509ce;
                    if (oVar instanceof C0139i) {
                        f5 -= 50.0f;
                        C0139i iVar = (C0139i) oVar;
                        String str4 = (((str3 + "\nState: " + iVar.f633b.name() + "(id:" + iVar.f702Q + ")") + "\nunsafe: " + iVar.m4080f() + " (" + iVar.f643s + ")") + "\nunsafeBaseTimer: " + iVar.f669v) + "\nallowedUnits: " + iVar.f662d;
                        if (iVar.f647z != null) {
                            str4 = str4 + "\nlastAttemptedBuilding: " + iVar.f647z.mo3494i();
                        }
                        if (iVar.f648A != null) {
                            str4 = str4 + "\nlastAttemptedBuilding-cannotAffordPrice: " + iVar.f648A.m3140a(false, true, 4, true);
                        }
                        if (iVar.f649B != null) {
                            str4 = str4 + "\nlastAttemptedBuilding-cannotAffordBy: " + iVar.f649B.m3140a(false, true, 4, true);
                        }
                        String str5 = ((((str4 + "\nlastAttemptedBuildingCount: " + iVar.f650C) + "\nlastAttemptedBuildingFailed: " + iVar.f651D) + "\nlastUnitAttempt: " + iVar.f652E + " (" + iVar.f653F + " - " + iVar.f654G + ")") + "\nbuildBuildingDelay: " + iVar.f635e) + "\ncredits: " + this.money;
                        if (iVar.f633b == EnumC0140j.f674a) {
                            str5 = str5 + "\nclaimedBaseTimer: " + iVar.f639l;
                        }
                        if (iVar.f638k > 100.0f) {
                            str5 = str5 + "\nabandonedTimer: " + iVar.f638k;
                        }
                        if (iVar.f663g > 0.0f) {
                            str5 = str5 + "\nrequestedBuildersDelay: " + iVar.f663g + " (" + iVar.f637h + ")";
                        }
                        str3 = (str5 + "\nBuilders: " + iVar.f656J) + "\nIdle Builders: " + iVar.f657K;
                    }
                    if (oVar instanceof C0137g) {
                        C0137g gVar = (C0137g) oVar;
                        if (gVar.f604b) {
                            str3 = str3 + "\nVIP Mode";
                        }
                        String str6 = (((str3 + "\n" + (gVar.mo4116b() ? "Defensive Type" : "Attack Type")) + "\nUnits: " + gVar.f630B.size() + " / " + gVar.f628z) + "\nStagingForAttack: " + gVar.f618p) + "\nAttackDelay: " + gVar.f613k;
                        if (gVar.f622t != 0.0f) {
                            str6 = str6 + "\nStagingTimer: " + gVar.f622t;
                        }
                        str3 = str6 + "\nStagingTargetFound: " + gVar.f619q;
                        if (gVar.f616n != 0.0f) {
                            str3 = str3 + "\nattackingFor: " + gVar.f616n;
                        }
                        if (gVar.f629A) {
                            str3 = str3 + "\nseaUnitGroup";
                        }
                    }
                    if (oVar instanceof C0144n) {
                        str3 = ((str3 + "\nUnitsWanted: " + nVar.f691l) + "\nunits: " + nVar.f630B.size()) + "\nreadyToMoveOut: " + nVar.f694q;
                        if (((C0144n) oVar).f692m != null) {
                            str3 = str3 + "\nCurrentlyHelping: " + nVar.f692m.f702Q;
                        }
                    }
                    if (oVar instanceof C0142l) {
                        str3 = str3 + "\nneedsTransportGroup: " + ((C0142l) oVar).f682a;
                    }
                    this.f557aX.m4502b(m3829F());
                    for (String str7 : str3.split("\n")) {
                        if (!str7.trim().equals("")) {
                            float f6 = oVar.f704S - u.f5508cd;
                            float f7 = f5;
                            float m2 = (-this.f557aX.m4481l()) + this.f557aX.m4480m();
                            u.f5477bw.mo125j();
                            if (u.f5602cE > 1.0f) {
                                u.m762L();
                                f6 *= u.f5602cE;
                                f7 *= u.f5602cE;
                                m2 /= u.f5602cE;
                            }
                            u.f5477bw.mo158a(str7, f6, f7, this.f557aX);
                            u.f5477bw.mo124k();
                            f5 += m2;
                            this.f557aX.m4502b(a2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public AbstractC0210af m4159e(AbstractC0171m mVar) {
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar.f1441bB == mVar && ((afVar instanceof C0404d) || afVar.f1517bu)) {
                return afVar;
            }
        }
        Iterator it2 = AbstractC0210af.f1473bj.iterator();
        while (it2.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
            if (afVar2.f1441bB == mVar && afVar2.f1516bt) {
                return afVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3720a(float f) {
        AbstractC0210af e;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!(this.f540aG || this.f542aI)) {
            if (u.f5486bF.f4734z && (!u.f5486bF.f4664A || u.f5490bJ.m1995h())) {
                return;
            }
            if (this.f574bo > 0.0f) {
                this.f574bo -= f;
                return;
            }
            this.f573bn = m3729y();
            if (this.f547aN && u.f5467bh > 3000) {
                this.f547aN = false;
                AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
                int i = 0;
                int size = AbstractC0210af.f1473bj.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    AbstractC0210af afVar = a[i];
                    if (afVar instanceof C0450f) {
                        m4160d("firstRunDelayed: Found damagingBorder");
                        this.f548aO = (C0450f) afVar;
                        break;
                    }
                    i++;
                }
            }
            if (this.f546aM) {
                this.f546aM = false;
                this.f549aP = true;
                this.f550aQ = true;
                this.f551aR = true;
                this.f552aS = true;
                AbstractC0210af e2 = m4159e(this);
                if (e2 == null) {
                    m4160d("firstRun: no command center found");
                }
                if (e2 != null) {
                    for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                        AbstractC0171m n = AbstractC0171m.m3740n(i2);
                        if (!(n == null || n == this || (e = m4159e(n)) == null)) {
                            if (!m4202a(e2.f5841dH, e2.f5842dI, e.f5841dH, e.f5842dI, EnumC0212ah.f1553b)) {
                                this.f549aP = false;
                            }
                            if (!m4202a(e2.f5841dH, e2.f5842dI, e.f5841dH, e.f5842dI, EnumC0212ah.f1557f)) {
                                this.f550aQ = false;
                            }
                        }
                    }
                    Iterator it = u.f5474bt.f773w.iterator();
                    while (it.hasNext()) {
                        PointF a2 = u.f5474bt.m4020a((Point) it.next());
                        if (!m4202a(e2.f5841dH, e2.f5842dI, a2.f224a, a2.f225b + u.f5474bt.f728l, EnumC0212ah.f1553b)) {
                            this.f551aR = false;
                        }
                        if (!m4202a(e2.f5841dH, e2.f5842dI, a2.f224a, a2.f225b + u.f5474bt.f728l, EnumC0212ah.f1557f)) {
                            this.f552aS = false;
                        }
                    }
                }
            }
            this.f532ay += f;
            this.f533az += f;
            if (this.f532ay > 25.0f) {
                this.f532ay -= 25.0f;
                if (this.f532ay > 25.0f) {
                    this.f532ay = 25.0f;
                }
                if (this.f532ay < -1.0f) {
                    this.f532ay = -1.0f;
                }
                Iterator it2 = this.f554aU.iterator();
                while (it2.hasNext()) {
                    AbstractC0145o oVar = (AbstractC0145o) it2.next();
                    if (oVar instanceof C0139i) {
                        ((C0139i) oVar).f632a += this.f533az;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    C0139i iVar = null;
                    Iterator it3 = this.f554aU.iterator();
                    while (it3.hasNext()) {
                        AbstractC0145o oVar2 = (AbstractC0145o) it3.next();
                        if (oVar2 instanceof C0139i) {
                            C0139i iVar2 = (C0139i) oVar2;
                            if (iVar == null || iVar.f632a < iVar2.f632a) {
                                iVar = iVar2;
                            }
                        }
                    }
                    if (iVar == null || iVar.f632a < 50.0f) {
                        break;
                    }
                    iVar.m4089b(iVar.f632a);
                    iVar.m4083d(iVar.f632a);
                    iVar.f632a = 0.0f;
                }
                this.f533az = 0.0f;
            }
            this.f528au += f;
            this.f529av += f;
            if (this.f528au > 80.0f) {
                m4151i(this.f529av);
                this.f528au -= 80.0f;
                if (this.f528au > 80.0f) {
                    this.f528au = 80.0f;
                }
                if (this.f528au < -1.0f) {
                    this.f528au = -1.0f;
                }
                this.f529av = 0.0f;
            }
            this.f530aw += f;
            this.f531ax += f;
            if (this.f530aw > 250.0f) {
                m4153h(this.f531ax);
                this.f530aw -= 250.0f;
                if (this.f530aw > 250.0f) {
                    this.f530aw = 250.0f;
                }
                if (this.f530aw < -1.0f) {
                    this.f530aw = -1.0f;
                }
                this.f531ax = 0.0f;
            }
        }
    }

    /* renamed from: a */
    public void m4182a(AbstractC0515r rVar, C0181c cVar) {
        C0651e a = AbstractC0789l.m651u().f5494bN.m1956a(this);
        a.m1616a(rVar);
        a.m1621a(cVar);
    }

    /* renamed from: g */
    public void m4155g(float f) {
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar.f1441bB == this && (afVar instanceof AbstractC0515r) && m4150i(afVar)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar instanceof C0494e) {
                    boolean z = false;
                    AbstractC0210af Z = rVar.m2386Z();
                    if (Z != null && rVar.m2316a_(Z)) {
                        z = !Z.m3562cr();
                    }
                    boolean z2 = !rVar.mo2437P();
                    if (z && z != z2) {
                        m4182a(rVar, C0494e.f3362j.m3690J());
                    }
                    if (!z && z != z2) {
                        m4182a(rVar, C0494e.f3363k.m3690J());
                    }
                }
                if (rVar instanceof C0275c) {
                    boolean z3 = true;
                    AbstractC0210af Z2 = rVar.m2386Z();
                    if (Z2 != null && rVar.m2316a_(Z2)) {
                        z3 = !Z2.mo2437P();
                    }
                    boolean z4 = !rVar.mo2437P();
                    if (z3 && z3 != z4) {
                        m4182a(rVar, C0275c.f1713y.m3690J());
                    }
                    if (!z3 && z3 != z4) {
                        m4182a(rVar, C0275c.f1714z.m3690J());
                    }
                }
                if (rVar.m2317aZ() == EnumC0272b.f1680d && rVar.m2301ao() && rVar.m2386Z() != null) {
                    C0651e a = AbstractC0789l.m651u().f5494bN.m1956a(this);
                    a.m1616a(rVar);
                    a.m1618a(rVar.m2386Z());
                }
            }
        }
    }

    /* renamed from: c */
    public EnumC0178a m4163c(AbstractC0515r rVar) {
        if (rVar.m2328aO()) {
            boolean z = true;
            if (rVar.mo3621ah()) {
                z = false;
            }
            if (m4154g(rVar)) {
                z = false;
            }
            if (z) {
                if (this.f541aH) {
                    return EnumC0178a.f1320f;
                }
                return EnumC0178a.f1315a;
            }
        }
        return EnumC0178a.f1316b;
    }

    /* renamed from: ae */
    public ArrayList m4175ae() {
        f576bq.clear();
        return f576bq;
    }

    /* renamed from: h */
    public void m4153h(float f) {
        boolean z;
        AbstractC0210af ag;
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f572bm.m4141b();
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f1441bB == this && !afVar.mo1661o_()) {
                i++;
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar = (AbstractC0515r) afVar;
                    if (afVar.f1539cp == null) {
                        C0139i iVar = rVar.f3429as;
                        rVar.f3429as = m4156f(rVar);
                        if (!(rVar.f3429as == null || iVar == rVar.f3429as)) {
                            if (rVar.mo2797bw()) {
                                rVar.f3430at = m4202a(afVar.f5841dH, afVar.f5842dI, rVar.f3429as.f704S, rVar.f3429as.f705T, EnumC0212ah.f1553b);
                                if (!rVar.f3430at && rVar.mo1660r().mo3487p()) {
                                    rVar.f3430at = m4202a(afVar.f5841dH, afVar.f5842dI + 15.0f, rVar.f3429as.f704S, rVar.f3429as.f705T, EnumC0212ah.f1553b);
                                }
                            } else {
                                rVar.f3430at = m4202a(afVar.f5841dH, afVar.f5842dI, rVar.f3429as.f704S, rVar.f3429as.f705T, EnumC0212ah.f1553b);
                            }
                        }
                    }
                }
            }
        }
        m4155g(f);
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2.f1441bB == this && (afVar2 instanceof AbstractC0515r)) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar2;
                EnumC0178a c = m4163c(rVar2);
                if (rVar2.f3472G != c && m4150i(rVar2)) {
                    C0651e a2 = u.f5494bN.m1956a(this);
                    a2.m1616a(rVar2);
                    a2.m1619a(c);
                }
                if (rVar2.mo3621ah() && rVar2.mo2656cL() && rVar2.f3428ar == null && m4150i(rVar2)) {
                    C0137g.m4127a(this, rVar2);
                }
            }
        }
        if (i == 0 && !this.f1260J) {
            this.f542aI = true;
        }
        this.f537aD = C0654f.m1575a(this.f537aD, f);
        this.f536aC = C0654f.m1575a(this.f536aC, f);
        if (m4212R()) {
            this.f536aC = C0654f.m1575a(this.f536aC, 4.0f * f);
        }
        if (this.f536aC == 0.0f) {
            int i3 = 0;
            Iterator it2 = this.f555aV.iterator();
            while (it2.hasNext()) {
                AbstractC0145o oVar = (AbstractC0145o) it2.next();
                if ((oVar instanceof C0139i) && ((C0139i) oVar).f633b == EnumC0140j.f674a) {
                    i3++;
                }
            }
            boolean z2 = false;
            if (i3 > 2) {
                z2 = true;
            }
            if (z2) {
                this.f536aC = 300.0f;
            } else {
                PointF ac = m4177ac();
                if (ac != null) {
                    ac.f225b += u.f5474bt.f728l;
                    if (m4169b(ac.f224a, ac.f225b) == null && m4168b(ac)) {
                        this.f536aC = 2000.0f;
                        C0139i iVar2 = new C0139i(this, ac.f224a, ac.f225b);
                        iVar2.f706U = 360.0f;
                        iVar2.f633b = EnumC0140j.f674a;
                        iVar2.f634c = EnumC0141k.f679b;
                        this.f513af++;
                    }
                }
            }
        }
        if (this.f537aD == 0.0f) {
            this.f537aD = 100.0f;
            int i4 = 0;
            Iterator it3 = this.f555aV.iterator();
            while (it3.hasNext()) {
                AbstractC0145o oVar2 = (AbstractC0145o) it3.next();
                if ((oVar2 instanceof C0139i) && ((C0139i) oVar2).f634c == EnumC0141k.f680c) {
                    i4++;
                }
            }
            if (i4 < 3 && (ag = m4173ag()) != null) {
                PointF pointF = new PointF();
                pointF.f224a = ag.f5841dH;
                pointF.f225b = ag.f5842dI;
                if (pointF != null && m4169b(pointF.f224a, pointF.f225b) == null && m4200a(pointF)) {
                    this.f537aD = 5000.0f;
                    C0139i iVar3 = new C0139i(this, pointF.f224a, pointF.f225b);
                    iVar3.f706U = 310.0f;
                    iVar3.f633b = EnumC0140j.f674a;
                    iVar3.f634c = EnumC0141k.f680c;
                    this.f513af++;
                }
            }
        }
        this.f545aL = 0;
        this.f543aJ = 0;
        this.f544aK = 0;
        AbstractC0210af[] a3 = AbstractC0210af.f1473bj.m456a();
        int size2 = AbstractC0210af.f1473bj.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC0210af afVar3 = a3[i5];
            if (afVar3.f1441bB == this && (afVar3 instanceof AbstractC0515r)) {
                AbstractC0515r rVar3 = (AbstractC0515r) afVar3;
                if (!afVar3.mo2797bw()) {
                    if (rVar3.f3428ar != null && rVar3.f3428ar.mo4116b()) {
                        this.f544aK++;
                    } else if (m4152h(rVar3) && !rVar3.f1514br) {
                        if (rVar3.mo2424h() == EnumC0212ah.f1556e) {
                            this.f545aL++;
                        } else {
                            this.f543aJ++;
                        }
                    }
                }
            }
        }
        this.f534aA = C0654f.m1575a(this.f534aA, f);
        this.f535aB += f;
        if (this.f534aA == 0.0f) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Iterator it4 = AbstractC0210af.f1473bj.iterator();
            while (it4.hasNext()) {
                AbstractC0210af afVar4 = (AbstractC0210af) it4.next();
                if (afVar4.f1441bB == this && afVar4.m3613bG()) {
                    if (((afVar4 instanceof C0417l) || (afVar4 instanceof C0385a) || (afVar4 instanceof C0427r)) && (afVar4 instanceof C0385a)) {
                        i7++;
                        if (((C0385a) afVar4).mo2702T() > 1) {
                            i6++;
                        }
                    }
                    if (afVar4.mo1660r().mo3487p()) {
                        i8++;
                        if (AbstractC0197s.m3683c(afVar4.mo2691bX())) {
                            i9++;
                        }
                    }
                }
            }
            if (m3748j(4100) || this.f535aB > 2400.0f || this.f524aq == 0) {
                Iterator it5 = AbstractC0210af.f1473bj.iterator();
                while (it5.hasNext()) {
                    AbstractC0210af afVar5 = (AbstractC0210af) it5.next();
                    if (afVar5.f1441bB == this && (afVar5 instanceof AbstractC0515r)) {
                        AbstractC0515r rVar4 = (AbstractC0515r) afVar5;
                        if (rVar4.mo3607bW()) {
                            ArrayList M = rVar4.mo2480M();
                            ArrayList ae = m4175ae();
                            Iterator it6 = M.iterator();
                            while (it6.hasNext()) {
                                AbstractC0197s sVar = (AbstractC0197s) it6.next();
                                if (sVar.mo3376o(rVar4)) {
                                    ae.add(sVar);
                                }
                            }
                            if (ae.size() > 0) {
                                m4181a(rVar4, (AbstractC0197s) C0136f.m4130a(ae));
                            }
                        }
                    }
                }
                boolean z3 = false;
                if (m3748j(30000)) {
                    z3 = true;
                }
                Iterator it7 = AbstractC0210af.f1473bj.iterator();
                while (it7.hasNext()) {
                    AbstractC0210af afVar6 = (AbstractC0210af) it7.next();
                    if (afVar6.f1441bB == this && (afVar6 instanceof AbstractC0515r)) {
                        AbstractC0515r rVar5 = (AbstractC0515r) afVar6;
                        C0181c bX = rVar5.mo2691bX();
                        if (AbstractC0197s.m3683c(bX)) {
                            float bY = rVar5.mo3606bY();
                            if (bY < 0.0f) {
                                bY = 6.0f;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (bY == 0.0f) {
                                continue;
                            } else {
                                int b = C0654f.m1526b(100);
                                float f2 = 100.0f - bY;
                                if (z3) {
                                    f2 -= 4.0f;
                                }
                                if (!z) {
                                    if (afVar6.mo1660r().mo3487p() && i9 > 0) {
                                        f2 = 50.0f;
                                    }
                                    if (i7 > 0 && i6 == 0) {
                                        f2 = 99.0f;
                                        if (afVar6 instanceof C0385a) {
                                            f2 = 40.0f;
                                        }
                                    }
                                }
                                if (f2 < 10.0f) {
                                    f2 = 10.0f;
                                }
                                if (!(((float) b) > f2)) {
                                    continue;
                                } else {
                                    if (rVar5.m3605bZ()) {
                                    }
                                    if (C0654f.m1526b(100) > 50) {
                                        rVar5.mo2867a(this.f575bp);
                                        if (this.f575bp.size() != 0) {
                                            bX = (C0181c) this.f575bp.get(new Random().nextInt(this.f575bp.size()));
                                        }
                                    }
                                    boolean z4 = false;
                                    AbstractC0197s a4 = rVar5.mo3632a(bX);
                                    if (a4 != null) {
                                        if (a4.mo3377n(rVar5)) {
                                            z4 = true;
                                        }
                                        if (a4.mo2461e() == EnumC0199u.f1375g) {
                                            z4 = true;
                                        }
                                        if (!a4.mo2465a((AbstractC0210af) rVar5)) {
                                            z4 = true;
                                        }
                                        if (!a4.mo2470a((AbstractC0210af) rVar5, false)) {
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        m4182a(rVar5, bX);
                                        m4180a(rVar5, a4.mo3368y(), true);
                                        this.f534aA = 900.0f;
                                        this.f535aB = 0.0f;
                                        if (!z3) {
                                            return;
                                        }
                                        if (m3748j(40000)) {
                                            if (C0654f.m1526b(100) > 95) {
                                                return;
                                            }
                                        } else if (C0654f.m1526b(100) > 80) {
                                            return;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4181a(AbstractC0515r rVar, AbstractC0197s sVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!sVar.mo2465a((AbstractC0210af) rVar) || !sVar.mo2470a((AbstractC0210af) rVar, false)) {
            return false;
        }
        C0651e a = u.f5494bN.m1956a(this);
        a.m1616a(rVar);
        a.m1621a(sVar.mo3672w());
        return true;
    }

    /* renamed from: af */
    public void m4174af() {
        Iterator it = this.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                ((C0139i) oVar).m4065t();
            }
        }
        Iterator it2 = this.f554aU.iterator();
        while (it2.hasNext()) {
            AbstractC0145o oVar2 = (AbstractC0145o) it2.next();
            Iterator it3 = this.f554aU.iterator();
            while (it3.hasNext()) {
                AbstractC0145o oVar3 = (AbstractC0145o) it3.next();
                if (oVar2 != oVar3 && oVar2.f702Q == oVar3.f702Q) {
                    AbstractC0789l.m732a("Id overlap on:" + oVar2.f702Q);
                    AbstractC0789l.m732a("zone x:" + oVar2.f704S);
                    AbstractC0789l.m732a("zone y:" + oVar2.f705T);
                    AbstractC0789l.m732a("zone radius:" + oVar2.f706U);
                    AbstractC0789l.m732a("zone type:" + oVar2.getClass().getName());
                }
            }
        }
        int i = 0;
        Iterator it4 = this.f554aU.iterator();
        while (it4.hasNext()) {
            if (((AbstractC0145o) it4.next()) instanceof C0139i) {
                i++;
            }
        }
        int i2 = 0;
        Iterator it5 = this.f554aU.iterator();
        while (it5.hasNext()) {
            AbstractC0145o oVar4 = (AbstractC0145o) it5.next();
            if (oVar4 instanceof C0139i) {
                Iterator it6 = this.f554aU.iterator();
                while (it6.hasNext()) {
                    AbstractC0145o oVar5 = (AbstractC0145o) it6.next();
                    if ((oVar5 instanceof C0139i) && oVar4 != oVar5 && C0654f.m1573a(oVar4.f704S, oVar4.f705T, oVar5.f704S, oVar5.f705T) < 400.0f) {
                        i2++;
                    }
                }
            }
        }
        if (i2 > 0) {
            m4160d("baseOverlapCount:" + i2);
        }
    }

    /* renamed from: a */
    public void m4183a(AbstractC0515r rVar) {
        if (rVar.f1441bB == this) {
            this.f572bm.m4144a(rVar);
        }
    }

    /* renamed from: i */
    public void m4151i(float f) {
        int i;
        C0270an ap;
        C0139i f2;
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f572bm.m4146a();
        Iterator it = this.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof AbstractC0138h) {
                ((AbstractC0138h) oVar).mo4057a(f);
            }
        }
        if (this.f548aO != null) {
            Iterator it2 = this.f554aU.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC0145o oVar2 = (AbstractC0145o) it2.next();
                if (this.f548aO.m2605a(oVar2.f704S, oVar2.f705T)) {
                    if (oVar2 instanceof C0139i) {
                        oVar2.mo4042k();
                        break;
                    } else if (oVar2 instanceof C0137g) {
                        PointF a = this.f548aO.m2604a(oVar2.f704S, oVar2.f705T, oVar2.f706U + 20.0f);
                        oVar2.f704S = a.f224a;
                        oVar2.f705T = a.f225b;
                    }
                }
            }
        }
        this.f539aF = C0654f.m1575a(this.f539aF, f);
        int i2 = 0;
        Iterator it3 = this.f555aV.iterator();
        while (it3.hasNext()) {
            if (((AbstractC0145o) it3.next()) instanceof C0139i) {
                i2++;
            }
        }
        if (i2 < 1) {
            Iterator it4 = AbstractC0210af.f1473bj.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                AbstractC0210af afVar = (AbstractC0210af) it4.next();
                if (afVar.f1441bB == this && (afVar instanceof C0404d)) {
                    C0139i iVar = new C0139i(this, afVar.f5841dH, afVar.f5842dI);
                    iVar.f706U = 420.0f;
                    iVar.f633b = EnumC0140j.f676c;
                    iVar.f634c = EnumC0141k.f678a;
                    i2++;
                    break;
                }
            }
            if (i2 < 1) {
                Iterator it5 = AbstractC0210af.f1473bj.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    AbstractC0210af afVar2 = (AbstractC0210af) it5.next();
                    if (afVar2.f1441bB == this && this.f567bh.m4134b(afVar2.mo1660r())) {
                        C0139i iVar2 = new C0139i(this, afVar2.f5841dH, afVar2.f5842dI);
                        iVar2.f706U = 420.0f;
                        iVar2.f633b = EnumC0140j.f676c;
                        iVar2.f634c = EnumC0141k.f678a;
                        i2++;
                        break;
                    }
                }
            }
            if (i2 < 1) {
                Iterator it6 = AbstractC0210af.f1473bj.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    AbstractC0210af afVar3 = (AbstractC0210af) it6.next();
                    if (afVar3.f1441bB == this && (afVar3 instanceof AbstractC0515r)) {
                        AbstractC0515r rVar = (AbstractC0515r) afVar3;
                        boolean z = false;
                        Iterator it7 = this.f567bh.f597c.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (rVar.m2280b(((C0135e) it7.next()).f600a, true)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            C0139i iVar3 = new C0139i(this, afVar3.f5841dH, afVar3.f5842dI);
                            iVar3.f706U = 420.0f;
                            iVar3.f633b = EnumC0140j.f676c;
                            iVar3.f634c = EnumC0141k.f678a;
                            i2++;
                            break;
                        }
                    }
                }
            }
            if (i2 < 1) {
                Iterator it8 = AbstractC0210af.f1473bj.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    AbstractC0210af afVar4 = (AbstractC0210af) it8.next();
                    if (afVar4.f1441bB == this && (afVar4 instanceof AbstractC0515r) && ((AbstractC0515r) afVar4).m2309ag()) {
                        C0139i iVar4 = new C0139i(this, afVar4.f5841dH, afVar4.f5842dI);
                        iVar4.f706U = 420.0f;
                        iVar4.f633b = EnumC0140j.f676c;
                        iVar4.f634c = EnumC0141k.f678a;
                        int i3 = i2 + 1;
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < u.f5474bt.f773w.size(); i4++) {
                Point point = (Point) u.f5474bt.f773w.get(i4);
                u.f5474bt.m4025a(point.f221a, point.f222b);
                this.f556aW.m4474a(u.f5474bt.f741M, u.f5474bt.f742N);
                PointF pointF = this.f556aW;
                pointF.f225b += u.f5474bt.f728l;
                if (m4169b(pointF.f224a, pointF.f225b) == null && m4168b(pointF) && m4198a(this.f569bj, pointF.f224a, pointF.f225b, 200) >= 1) {
                    C0139i iVar5 = new C0139i(this, pointF.f224a, pointF.f225b);
                    iVar5.f706U = 360.0f;
                    iVar5.f633b = EnumC0140j.f674a;
                    iVar5.f634c = EnumC0141k.f679b;
                }
            }
        }
        AbstractC0210af[] a2 = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0210af afVar5 = a2[i5];
            if (afVar5.f1441bB == this && afVar5.f1539cp == null && (afVar5 instanceof AbstractC0515r) && afVar5.mo3621ah() && m4150i(afVar5)) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar5;
                if (m4158e(rVar2) != null) {
                    if (rVar2.m2301ao()) {
                    }
                } else if (rVar2.m2301ao() && (f2 = m4156f(rVar2)) != null) {
                    PointF w = f2.m4041w();
                    C0651e a3 = u.f5494bN.m1956a(this);
                    a3.m1616a(rVar2);
                    a3.m1626a(w.f224a, w.f225b);
                }
            }
        }
        int size2 = AbstractC0210af.f1473bj.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AbstractC0210af afVar6 = a2[i6];
            if (afVar6.f1441bB == this && (afVar6 instanceof AbstractC0515r)) {
                AbstractC0515r rVar3 = (AbstractC0515r) afVar6;
                if (rVar3.f3399M > 2400.0f && m4150i(rVar3)) {
                    if (!rVar3.f3436aC || rVar3.f3399M >= 24000.0f) {
                        C0651e a4 = u.f5494bN.m1956a(this);
                        a4.m1616a(rVar3);
                        a4.m1599h();
                    }
                }
                if (rVar3.mo3621ah() && m4150i(rVar3) && (ap = rVar3.m2300ap()) != null && ap.m3464d() == EnumC0271ao.f1661c && rVar3.f3399M > 700.0f) {
                    C0651e a5 = u.f5494bN.m1956a(this);
                    a5.m1616a(rVar3);
                    a5.m1599h();
                }
            }
        }
        if (!this.f1260J) {
            m4204Z();
            int i7 = 1;
            boolean z2 = true;
            if (m4209U()) {
                i7 = 1 + 1;
                z2 = false;
            }
            if (this.f515ah > 6) {
                i7 = 2;
            }
            if (this.f515ah > 11) {
                i7 = 3;
            }
            if (this.f519al < i7) {
                C0137g gVar = new C0137g(this, false);
                gVar.f628z = 8;
                if (m4212R()) {
                    gVar.f628z = 10;
                }
                gVar.m4119f();
                this.f512ae++;
            }
            if ((this.f520am >= i7 || this.f521an > 6) && this.f517aj < 1 && z2) {
                C0137g gVar2 = new C0137g(this, true);
                if (this.f511ad < 2) {
                    gVar2.f628z = 3;
                } else if (this.f511ad < 5) {
                    gVar2.f628z = 5;
                } else {
                    gVar2.f628z = 7;
                    if (m4212R()) {
                        if (this.f511ad < 25) {
                            gVar2.f628z = 14;
                        } else {
                            gVar2.f628z = 18;
                        }
                    }
                }
                gVar2.m4119f();
                this.f511ad++;
            }
            if (m4207W() && this.f518ak < 1 && z2) {
                C0137g gVar3 = new C0137g(this, true);
                gVar3.f629A = true;
                gVar3.f628z = 5;
                if (m4212R()) {
                    gVar3.f628z = 10;
                }
                gVar3.m4119f();
            }
            if (m4206X() && this.f522ao < 3) {
                C0144n nVar = new C0144n(this);
                nVar.f691l = 1;
                nVar.m4051f();
            }
        }
        if (this.f1260J) {
            if (this.f539aF > 30.0f) {
                this.f539aF = 30.0f;
            }
            if (this.f539aF == 0.0f) {
                this.f538aE++;
                if (this.f538aE == 1) {
                    this.f539aF = 1000.0f;
                } else if (this.f538aE == 2) {
                    this.f539aF = 3000.0f;
                    AbstractC0210af ah = m4172ah();
                    if (ah != null) {
                        if (this.f1260J) {
                            i = 0;
                        } else {
                            i = 2;
                            if (this.f543aJ < 4) {
                                i = 5;
                            }
                        }
                        C0651e a6 = u.f5494bN.m1956a(this);
                        int size3 = AbstractC0210af.f1473bj.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            AbstractC0210af afVar7 = a2[i8];
                            if (afVar7.f1441bB == this && (afVar7 instanceof AbstractC0515r)) {
                                AbstractC0515r rVar4 = (AbstractC0515r) afVar7;
                                if (!rVar4.f1514br && m4165b(rVar4, ah)) {
                                    if (i <= 0) {
                                        a6.m1616a(rVar4);
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        a6.m1611b(ah.f5841dH, ah.f5842dI);
                    }
                } else {
                    this.f538aE = 0;
                }
            }
        }
    }

    /* renamed from: i */
    public boolean m4150i(AbstractC0210af afVar) {
        if (afVar.mo1661o_() || afVar.mo1659t() || afVar.mo3586cE()) {
            return false;
        }
        return true;
    }

    /* renamed from: ag */
    public AbstractC0210af m4173ag() {
        AbstractC0210af afVar = null;
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar2 = a[i2];
            if (!afVar2.f1520bz && afVar2.f1539cp == null && this == afVar2.f1441bB && m4152h(afVar2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0210af afVar3 = (AbstractC0210af) it.next();
            if (!afVar3.f1520bz && afVar3.f1539cp == null && this == afVar3.f1441bB && m4152h(afVar3)) {
                if (i3 == random) {
                    afVar = afVar3;
                    break;
                }
                i3++;
            }
        }
        return afVar;
    }

    /* renamed from: ah */
    public AbstractC0210af m4172ah() {
        AbstractC0210af afVar = null;
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar2 = a[i2];
            if (!afVar2.f1520bz && afVar2.f1539cp == null && !afVar2.mo1661o_() && m3778c(afVar2.f1441bB) && m4149j(afVar2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0210af afVar3 = (AbstractC0210af) it.next();
            if (!afVar3.f1520bz && afVar3.f1539cp == null && !afVar3.mo1661o_() && m3778c(afVar3.f1441bB) && m4149j(afVar3)) {
                if (i3 == random) {
                    afVar = afVar3;
                    break;
                }
                i3++;
            }
        }
        return afVar;
    }

    /* renamed from: a */
    public static AbstractC0210af m4195a(AbstractC0171m mVar, float f, float f2, float f3) {
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f5841dH + f3 > f && afVar.f5841dH - f3 < f && afVar.f5842dI + f3 > f2 && afVar.f5842dI - f3 < f2 && afVar.f1441bB != mVar && m4192a(afVar, f, f2, f3) && afVar.f1441bB.m3778c(mVar)) {
                return afVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m4194a(AbstractC0171m mVar, float f, float f2, float f3, boolean z) {
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f5841dH + f3 > f && afVar.f5841dH - f3 < f && afVar.f5842dI + f3 > f2 && afVar.f5842dI - f3 < f2 && afVar.f1441bB != mVar && m4192a(afVar, f, f2, f3) && afVar.f1441bB.m3768d(mVar) && (!z || afVar.mo2797bw())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m4167b(AbstractC0171m mVar, float f, float f2, float f3) {
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f5841dH + f3 > f && afVar.f5841dH - f3 < f && afVar.f5842dI + f3 > f2 && afVar.f5842dI - f3 < f2 && afVar.f1441bB != mVar && m4192a(afVar, f, f2, f3) && afVar.f1441bB.m3778c(mVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m4198a(AbstractC0134d dVar, float f, float f2, int i) {
        int i2 = 0;
        Iterator it = dVar.f597c.iterator();
        while (it.hasNext()) {
            i2 += m4188a(((C0135e) it.next()).f600a, f, f2, i);
        }
        return i2;
    }

    /* renamed from: a */
    public int m4188a(AbstractC0268al alVar, float f, float f2, int i) {
        int i2 = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0210af afVar = a[i3];
            if (afVar.f1441bB == this && afVar.f1471db == alVar && m4192a(afVar, f, f2, i)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: ai */
    public int m4171ai() {
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            i++;
        }
        return i;
    }

    /* renamed from: N */
    public void m4213N() {
        if (this.f542aI && m4171ai() != 0) {
            AbstractC0789l.m683d("waking up AI");
            this.f542aI = false;
        }
    }

    /* renamed from: d */
    public void m4161d(AbstractC0210af afVar) {
        if (afVar instanceof AbstractC0515r) {
            AbstractC0515r rVar = (AbstractC0515r) afVar;
            if (rVar.f3429as != null) {
                rVar.f3429as.m4095a(rVar);
                rVar.f3429as = null;
            }
            if (rVar.f3428ar != null) {
                rVar.f3428ar.m4115b(rVar);
                rVar.f3428ar = null;
            }
        }
    }

    /* renamed from: a */
    public void m4180a(AbstractC0515r rVar, C0363g gVar, boolean z) {
        if (rVar.f3429as != null) {
            rVar.f3429as.m4093a(rVar, gVar, z);
        }
    }

    /* renamed from: j */
    public boolean m4149j(AbstractC0210af afVar) {
        if (afVar.mo3610bS() || !m3778c(afVar.f1441bB)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4185a(C0363g gVar, AbstractC0210af afVar) {
        return m4184a(gVar, afVar, false);
    }

    /* renamed from: a */
    public boolean m4184a(C0363g gVar, AbstractC0210af afVar, boolean z) {
        return gVar.m3135b(afVar, false);
    }
}
