package com.corrodinggames.rts.game.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.game.units.p026f.C0456f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class C0139i extends AbstractC0145o {

    /* renamed from: a */
    float f632a;

    /* renamed from: b */
    EnumC0140j f633b;

    /* renamed from: c */
    EnumC0141k f634c;

    /* renamed from: e */
    float f635e;

    /* renamed from: f */
    float f636f;

    /* renamed from: h */
    int f637h;

    /* renamed from: k */
    float f638k;

    /* renamed from: l */
    float f639l;

    /* renamed from: m */
    float f640m;

    /* renamed from: n */
    boolean f641n;

    /* renamed from: o */
    boolean f642o;

    /* renamed from: s */
    boolean f643s;

    /* renamed from: t */
    boolean f644t;

    /* renamed from: u */
    float f645u;

    /* renamed from: y */
    int f646y;

    /* renamed from: z */
    AbstractC0268al f647z;

    /* renamed from: A */
    C0363g f648A;

    /* renamed from: B */
    C0363g f649B;

    /* renamed from: C */
    int f650C;

    /* renamed from: D */
    int f651D;

    /* renamed from: E */
    String f652E;

    /* renamed from: F */
    int f653F;

    /* renamed from: G */
    int f654G;

    /* renamed from: I */
    int f655I;

    /* renamed from: J */
    int f656J;

    /* renamed from: K */
    int f657K;

    /* renamed from: L */
    int f658L;

    /* renamed from: M */
    boolean f659M;

    /* renamed from: O */
    AbstractC0268al f660O;

    /* renamed from: P */
    C0363g f661P;

    /* renamed from: d */
    float f662d = -1.0f;

    /* renamed from: g */
    float f663g = 100.0f;

    /* renamed from: i */
    float f664i = 50.0f;

    /* renamed from: j */
    float f665j = 50.0f;

    /* renamed from: p */
    C0835m f666p = new C0835m();

    /* renamed from: q */
    C0846u f667q = new C0846u();

    /* renamed from: r */
    C0846u f668r = new C0846u();

    /* renamed from: v */
    float f669v = 0.0f;

    /* renamed from: w */
    PointF f670w = new PointF();

    /* renamed from: x */
    PointF f671x = new PointF();

    /* renamed from: H */
    boolean f672H = false;

    /* renamed from: N */
    ArrayList f673N = new ArrayList();

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.m1184a(this.f633b);
        apVar.m1184a(this.f634c);
        apVar.mo1110a(this.f662d);
        apVar.mo1110a(this.f635e);
        apVar.mo1110a(this.f636f);
        apVar.mo1110a(this.f663g);
        apVar.mo1110a(this.f664i);
        apVar.mo1110a(this.f665j);
        apVar.mo1110a(this.f638k);
        apVar.mo1110a(this.f639l);
        apVar.m1175c(4);
        apVar.mo1110a(this.f669v);
        apVar.mo1110a(this.f640m);
        apVar.mo1104a(this.f641n);
        apVar.mo1104a(this.f642o);
        apVar.mo1109a(this.f637h);
        super.mo1654a(apVar);
    }

    /* renamed from: a */
    public void mo4048a(C0707k kVar) {
        this.f633b = (EnumC0140j) kVar.m1083b(EnumC0140j.class);
        this.f634c = (EnumC0141k) kVar.m1083b(EnumC0141k.class);
        this.f662d = kVar.m1075g();
        this.f635e = kVar.m1075g();
        this.f636f = kVar.m1075g();
        this.f663g = kVar.m1075g();
        this.f664i = kVar.m1075g();
        this.f665j = kVar.m1075g();
        this.f638k = kVar.m1075g();
        this.f639l = kVar.m1075g();
        byte d = kVar.m1079d();
        if (d >= 1) {
            this.f669v = kVar.m1075g();
        }
        if (d >= 2) {
            this.f640m = kVar.m1075g();
        }
        if (d >= 3) {
            this.f641n = kVar.m1077e();
            this.f642o = kVar.m1077e();
        }
        if (d >= 4) {
            this.f637h = kVar.m1076f();
        }
        super.mo4048a(kVar);
    }

    public C0139i(C0118a aVar, float f, float f2) {
        super(aVar, f, f2);
    }

    /* renamed from: a */
    public PointF m4108a() {
        C0155g e;
        AbstractC0789l u = AbstractC0789l.m651u();
        PointF pointF = null;
        int i = (int) (this.f706U * u.f5474bt.f731o);
        u.f5474bt.m4029a(this.f704S, this.f705T);
        int i2 = u.f5474bt.f741M;
        int i3 = u.f5474bt.f742N;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (u.f5474bt.m3987c(i4, i5) && (e = u.f5474bt.m3977e(i4, i5)) != null && e.f857i) {
                    AbstractC0210af b = AbstractC0403c.m2801b(i4, i5);
                    boolean z = false;
                    if (b == null) {
                        z = true;
                    }
                    if (b != null && (b instanceof AbstractC0515r) && !((AbstractC0515r) b).mo1660r().mo3487p()) {
                        z = true;
                    }
                    if (z) {
                        u.f5474bt.m4025a(i4, i5);
                        if (pointF == null || C0654f.m1567a(0, 100) < 50) {
                            this.f670w.m4474a(u.f5474bt.f741M + u.f5474bt.f729m, u.f5474bt.f742N + u.f5474bt.f730n);
                            pointF = this.f670w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m4095a(AbstractC0515r rVar) {
        this.f667q.remove(rVar);
    }

    /* renamed from: b */
    public void m4090b() {
        this.f666p.clear();
        this.f667q.clear();
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && !afVar.f1520bz && !afVar.mo1661o_() && m4104a(afVar)) {
                this.f667q.m452a(afVar);
                AbstractC0268al alVar = afVar.f1471db;
                if (!this.f666p.contains(alVar)) {
                    this.f666p.add(alVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4101a(AbstractC0268al alVar) {
        if (m4097a(alVar, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4088b(AbstractC0268al alVar) {
        if ((AbstractC0789l.m651u().f5575am && !alVar.mo3506B()) || alVar.mo3483w()) {
            return false;
        }
        Object[] a = this.f666p.m490a();
        int size = this.f666p.size();
        for (int i = 0; i < size; i++) {
            AbstractC0268al alVar2 = (AbstractC0268al) a[i];
            AbstractC0210af[] a2 = this.f667q.m456a();
            int i2 = 0;
            int size2 = this.f667q.size();
            while (true) {
                if (i2 < size2) {
                    AbstractC0210af afVar = a2[i2];
                    if (afVar.mo1660r() != alVar2 || !(afVar instanceof AbstractC0515r)) {
                        i2++;
                    } else if (((AbstractC0515r) afVar).m2280b(alVar, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public AbstractC0268al m4087c() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f703R.f541aH) {
            return null;
        }
        int a = m4106a(this.f703R.f570bk);
        AbstractC0268al alVar = null;
        float f = -1.0f;
        Iterator it = EnumC0215ak.f1639ad.iterator();
        while (it.hasNext()) {
            AbstractC0268al alVar2 = (AbstractC0268al) it.next();
            if (alVar2.mo3493j() && m4088b(alVar2)) {
                int a2 = this.f703R.m4187a(alVar2, EnumC0132b.f590a);
                int c = m4085c(alVar2);
                boolean z = false;
                if (alVar2 instanceof C0368l) {
                    z = true;
                    C0368l lVar = (C0368l) alVar2;
                    if (lVar.f2835fz.size() != 0) {
                        Iterator it2 = lVar.f2835fz.iterator();
                        while (it2.hasNext()) {
                            AbstractC0268al alVar3 = (AbstractC0268al) it2.next();
                            a2 += this.f703R.m4187a(alVar3, EnumC0132b.f590a);
                            c += m4085c(alVar3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (alVar2.mo3487p() && !z && m4108a() != null && C0654f.m1567a(0, 100) < 90) {
                    if (c == 0) {
                        if (this.f703R.money < 5000) {
                            f2 = 0.98f;
                        } else {
                            f2 = 0.58f;
                        }
                    }
                    if (c == 1) {
                        f2 = 0.55f;
                    }
                    if (c == 2) {
                        f2 = 0.4f;
                    }
                    if (c >= 3) {
                        f2 = 0.25f / c;
                    }
                    if (a2 >= 3) {
                        f2 = (float) (f2 * 0.6d);
                    }
                }
                if (alVar2 == EnumC0215ak.f1585b && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.8f;
                    } else if (c < 2) {
                        f2 = 0.46f / (a2 + (c * 2));
                    }
                }
                if (alVar2 == EnumC0215ak.f1587d && this.f703R.m4207W() && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.3f;
                    } else if (c < 1) {
                        f2 = 0.1f / (a2 + (c * 2));
                    }
                }
                if (alVar2 == EnumC0215ak.f1586c && (a2 < 5 || a == 0)) {
                    if (a2 == 0) {
                        f2 = 0.48f;
                    } else if (c < 2) {
                        f2 = 0.29f / (a2 + c);
                    }
                }
                if (alVar2 == EnumC0215ak.f1589f) {
                    if (c == 0) {
                        f2 = 0.47f;
                    } else if (c < 3) {
                        f2 = 0.35f / c;
                    } else if (c < 4) {
                        f2 = 0.025f / c;
                    }
                }
                if (alVar2 == EnumC0215ak.f1608y && c == 0) {
                    f2 = 0.018f;
                }
                if (alVar2 == EnumC0215ak.f1611B && c == 0) {
                    f2 = 0.02f;
                }
                if (alVar2 == EnumC0215ak.f1590g) {
                    if (c == 0) {
                        f2 = 0.42f;
                    } else if (this.f703R.m4212R()) {
                        if (c < 4) {
                            f2 = 0.3f / c;
                        }
                    } else if (c < 3) {
                        f2 = 0.3f / c;
                    } else if (c < 4) {
                        f2 = 0.02f / c;
                    }
                }
                if (alVar2 == EnumC0215ak.f1619J && this.f703R.money > 2000 && c < 5) {
                    if (a2 == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * a2) + c);
                    }
                }
                if (alVar2 == EnumC0215ak.f1613D && ((!u.m766H() || !u.f5486bF.f4763aH.f4818i) && this.f703R.money > 2200 && a2 < 4)) {
                    if (a2 == 0) {
                        f2 = 0.06f;
                    } else if (c < 1) {
                        f2 = 0.05f / (a2 + (c * 2));
                    }
                }
                if (z) {
                    C0368l lVar2 = (C0368l) alVar2;
                    if (!lVar2.f2736fk && ((a2 < lVar2.f2737fl || lVar2.f2737fl == -1) && (c < lVar2.f2738fm || lVar2.f2738fm == -1))) {
                        f2 = lVar2.f2739fn;
                        if (c < lVar2.f2740fo) {
                            f2 = lVar2.f2741fp;
                        }
                        if (c == 0) {
                            f2 += lVar2.f2742fq;
                        }
                        if (a2 == 0) {
                            f2 += lVar2.f2743fr;
                        }
                        if (alVar2.mo3487p() && m4108a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.f703R.m4211S() && alVar2 == EnumC0215ak.f1616G && this.f703R.money > 15000) {
                    if (a2 == 0) {
                        f2 = 0.04f;
                    }
                    if (this.f703R.money > 55000 && a2 == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || C0654f.m1511c(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    alVar = alVar2;
                }
            }
        }
        this.f636f = f;
        return alVar;
    }

    /* renamed from: a */
    public int m4106a(AbstractC0134d dVar) {
        int i = 0;
        Iterator it = dVar.f597c.iterator();
        while (it.hasNext()) {
            i += m4085c(((C0135e) it.next()).f600a);
        }
        return i;
    }

    /* renamed from: c */
    public int m4085c(AbstractC0268al alVar) {
        int i = 0;
        C0846u uVar = this.f667q;
        AbstractC0210af[] a = uVar.m456a();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f1441bB == this.f703R && afVar.f1471db == alVar && m4104a(afVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m4084d() {
        int i = 0;
        C0846u uVar = this.f667q;
        AbstractC0210af[] a = uVar.m456a();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f1441bB == this.f703R && (afVar instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (m4092a(rVar, false) && !rVar.f1514br && rVar.f3428ar == null && this.f703R.m4152h(rVar) && this.f703R.m4150i(rVar)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4081e() {
        return this.f657K;
    }

    /* renamed from: f */
    public boolean m4080f() {
        return m4076h() != 0;
    }

    /* renamed from: g */
    public AbstractC0210af m4078g() {
        float f = this.f706U + 120.0f;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f5841dH + f > this.f704S && afVar.f5841dH - f < this.f704S && afVar.f5842dI + f > this.f705T && afVar.f5842dI - f < this.f705T && afVar.f1441bB != this.f703R && m4049a(afVar, 120.0f) && afVar.f1441bB.m3778c(this.f703R) && this.f703R.m4149j(afVar)) {
                return afVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m4076h() {
        return m4107a(60.0f);
    }

    /* renamed from: a */
    public int m4107a(float f) {
        int i = 0;
        float f2 = this.f706U + f;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar.f5841dH + f2 > this.f704S && afVar.f5841dH - f2 < this.f704S && afVar.f5842dI + f2 > this.f705T && afVar.f5842dI - f2 < this.f705T && afVar.f1441bB != this.f703R && m4049a(afVar, f) && afVar.f1441bB.m3778c(this.f703R) && afVar.mo2421l() && this.f703R.m4149j(afVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m4075i() {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af g = m4078g();
        if (g != null) {
            C0651e a = u.f5494bN.m1956a(this.f703R);
            AbstractC0210af[] a2 = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a2[i];
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar = (AbstractC0515r) afVar;
                    if (afVar.f1441bB == this.f703R && this.f703R.m4165b(afVar, g) && this.f703R.m4150i(rVar) && rVar.m2301ao()) {
                        if (!afVar.f1514br) {
                            if (C0118a.m4192a(afVar, this.f704S, this.f705T, 800.0f)) {
                                a.m1616a(rVar);
                            }
                        } else if (C0118a.m4192a(afVar, this.f704S, this.f705T, 540.0f)) {
                            a.m1616a(rVar);
                        }
                    }
                }
            }
            a.m1618a(g);
        }
    }

    /* renamed from: a */
    public boolean m4104a(AbstractC0210af afVar) {
        return m4102a(afVar, false);
    }

    /* renamed from: a */
    public boolean m4102a(AbstractC0210af afVar, boolean z) {
        if (!(afVar instanceof AbstractC0515r) || ((AbstractC0515r) afVar).f3429as != this) {
            return false;
        }
        if (!z || m4047b(afVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4092a(AbstractC0515r rVar, boolean z) {
        if (rVar.f3429as != this) {
            return false;
        }
        if (!z || m4047b(rVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public int m4074j() {
        int i = 0;
        Iterator it = m4073l().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (this.f703R != afVar.f1441bB && afVar.f1441bB.m3778c(this.f703R) && (afVar instanceof AbstractC0515r) && m4047b(afVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: l */
    public C0456f m4073l() {
        return AbstractC0789l.m651u().f5491bK.m2586b(this.f704S, this.f705T, this.f706U);
    }

    /* renamed from: x */
    private AbstractC0515r m4062x() {
        return m4100a((AbstractC0268al) null, (PointF) null, true);
    }

    /* renamed from: y */
    private AbstractC0515r m4061y() {
        return m4079f(null);
    }

    /* renamed from: f */
    private AbstractC0515r m4079f(AbstractC0268al alVar) {
        return m4100a(alVar, (PointF) null, false);
    }

    /* renamed from: a */
    private AbstractC0515r m4100a(AbstractC0268al alVar, PointF pointF, boolean z) {
        if (this.f657K == 0) {
            return null;
        }
        this.f646y = 0;
        float f = Float.MAX_VALUE;
        AbstractC0515r rVar = null;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (alVar != null && ((u.f5575am && !alVar.mo3506B()) || alVar.mo3483w())) {
            return null;
        }
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && m4104a(afVar) && afVar.f1539cp == null && afVar.mo3621ah() && (afVar instanceof AbstractC0515r) && this.f703R.m4150i(afVar)) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                if (C0136f.m4131a(rVar2) && (!z || rVar2.mo2440I())) {
                    this.f646y++;
                    if (alVar == null || rVar2.m2280b(alVar, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0654f.m1573a(pointF.f224a, pointF.f225b, afVar.f5841dH, afVar.f5842dI);
                        }
                        if (rVar == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0654f.m1511c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            rVar = (AbstractC0515r) afVar;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return rVar;
    }

    /* renamed from: a */
    private AbstractC0515r m4103a(AbstractC0210af afVar, PointF pointF, boolean z) {
        if (this.f658L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        AbstractC0515r rVar = null;
        AbstractC0789l.m651u();
        AbstractC0210af[] a = this.f667q.m456a();
        int size = this.f667q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar2 = a[i];
            if (afVar2.f1441bB == this.f703R && m4104a(afVar2) && afVar2.f1539cp == null) {
                AbstractC0268al r = afVar2.mo1660r();
                if (r.mo3489n() && (afVar2 instanceof AbstractC0515r) && this.f703R.m4150i(afVar2)) {
                    AbstractC0515r rVar2 = (AbstractC0515r) afVar2;
                    if (C0136f.m4129b(rVar2) && ((!z || rVar2.mo2440I()) && (afVar == null || rVar2.mo3538x(afVar)))) {
                        boolean z2 = false;
                        if (r instanceof C0368l) {
                            C0368l lVar = (C0368l) r;
                            if (lVar.f2747fv != null && !m4096a(lVar.f2747fv)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0654f.m1573a(pointF.f224a, pointF.f225b, afVar2.f5841dH, afVar2.f5842dI);
                        }
                        if (rVar == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0654f.m1511c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            rVar = (AbstractC0515r) afVar2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return rVar;
    }

    /* renamed from: g */
    private boolean m4077g(AbstractC0268al alVar) {
        PointF pointF;
        AbstractC0515r a;
        this.f647z = alVar;
        this.f648A = null;
        this.f649B = null;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (alVar.mo3487p()) {
            pointF = m4108a();
        } else {
            pointF = m4043e(alVar);
        }
        if (pointF == null || (a = m4100a(alVar, pointF, false)) == null) {
            return false;
        }
        if (alVar == EnumC0215ak.f1587d) {
            int c = C0851y.m408c(pointF.f224a, pointF.f225b, EnumC0212ah.f1556e);
            this.f703R.getClass();
            if (c < 3000) {
                return false;
            }
        }
        int i = 1;
        AbstractC0197s a2 = a.m2358a(alVar, true);
        if (a2 != null) {
            i = a2.mo3677p();
        } else {
            AbstractC0789l.m695b("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + alVar.mo3494i());
        }
        if (!a2.mo2465a((AbstractC0210af) a) || !a2.mo2470a((AbstractC0210af) a, false)) {
            if (this.f703R.m4185a(a2.mo3368y(), a)) {
                return true;
            }
            this.f648A = a2.mo3368y();
            this.f649B = this.f648A.m3121g(a);
            return true;
        } else if (a2.mo3369x()) {
            C0651e a3 = u.f5494bN.m1956a(this.f703R);
            a3.m1616a(a);
            a3.m1620a(a2.m3690J(), pointF, (AbstractC0210af) null);
            return true;
        } else {
            C0651e a4 = u.f5494bN.m1956a(this.f703R);
            a4.m1616a(a);
            a4.m1625a(pointF.f224a, pointF.f225b, alVar, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m4060z() {
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && m4104a(afVar) && afVar.m3613bG() && !afVar.mo1661o_() && (afVar instanceof AbstractC0515r) && ((AbstractC0515r) afVar).m2309ag()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4096a(C0365i iVar) {
        C0365i cM;
        AbstractC0210af[] a = this.f667q.m456a();
        int size = this.f667q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && afVar.m3613bG() && (cM = afVar.mo3582cM()) != null && C0364h.m3118a(iVar, cM)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private AbstractC0515r m4097a(AbstractC0268al alVar, boolean z, boolean z2) {
        AbstractC0210af[] a = this.f667q.m456a();
        int size = this.f667q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && afVar.m3613bG() && this.f703R.m4150i(afVar) && (afVar instanceof AbstractC0416k) && (afVar instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                AbstractC0416k kVar = (AbstractC0416k) afVar;
                AbstractC0197s e = afVar.mo2768e(alVar);
                if (e != null && ((kVar.mo2737de() || !z) && !e.mo3377n(afVar) && e.mo2465a((AbstractC0210af) rVar) && e.mo2470a((AbstractC0210af) rVar, false) && ((!(afVar instanceof C0404d) || alVar.mo3490m() || m4064u() <= 2 || this.f643s || !z) && (!z2 || rVar.f3430at)))) {
                    return rVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m4105a(AbstractC0134d dVar, boolean z) {
        Iterator it = dVar.m4140a().iterator();
        while (it.hasNext()) {
            if (m4099a(((C0135e) it.next()).f600a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4099a(AbstractC0268al alVar, boolean z) {
        return m4098a(alVar, z, 1);
    }

    /* renamed from: a */
    private boolean m4098a(AbstractC0268al alVar, boolean z, int i) {
        if (i < 1) {
            AbstractC0789l.m694b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        AbstractC0515r a = m4097a(alVar, true, z);
        if (a == null) {
        }
        if (a == null) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0197s e = a.mo2768e(alVar);
        if (e == null) {
            AbstractC0789l.m694b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.mo2465a((AbstractC0210af) a)) {
            AbstractC0789l.m694b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.mo2470a((AbstractC0210af) a, false)) {
            AbstractC0789l.m694b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.mo3383h(a)) {
            return false;
        } else {
            if (e.mo3678k_() && u.f5575am) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0651e a2 = u.f5494bN.m1956a(this.f703R);
                a2.m1616a(a);
                a2.m1621a(e.mo3672w());
            }
            return true;
        }
    }

    /* renamed from: m */
    C0139i m4072m() {
        C0139i iVar;
        float f = -1.0f;
        C0139i iVar2 = null;
        Iterator it = this.f703R.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if ((oVar instanceof C0139i) && (iVar = (C0139i) oVar) != this && iVar.m4081e() > 1) {
                float a = iVar.m4050a(this);
                if (iVar2 == null || a < f) {
                    f = a;
                    iVar2 = iVar;
                }
            }
        }
        return iVar2;
    }

    /* renamed from: n */
    public void m4071n() {
        AbstractC0515r x;
        AbstractC0789l u = AbstractC0789l.m651u();
        C0139i m = m4072m();
        if (m != null && m.m4081e() > 1 && (x = m.m4062x()) != null) {
            PointF w = m4041w();
            if (C0851y.m427a(x, w.f224a, w.f225b)) {
                boolean a = this.f703R.m4193a(x, w.f224a, w.f225b);
                if (a || this.f703R.f523ap != 0) {
                    C0651e a2 = u.f5494bN.m1956a(this.f703R);
                    a2.m1616a(x);
                    a2.m1626a(w.f224a, w.f225b);
                    this.f637h++;
                    this.f663g = C0654f.m1567a(1800, 2500);
                    if (this.f637h >= 2) {
                        this.f663g += 11000.0f;
                    }
                    m.f657K--;
                    if (!a) {
                        boolean z = true;
                        if (x.f3428ar != null) {
                            if (!x.f3428ar.mo4118a()) {
                                x.f3428ar.m4115b(x);
                            } else {
                                z = false;
                                if (!x.f3428ar.f631C.contains(x)) {
                                    x.f3428ar.f631C.add(x);
                                }
                            }
                        }
                        if (z) {
                            C0142l lVar = new C0142l(this.f703R);
                            lVar.m4058c(x);
                            lVar.f704S = w.f224a;
                            lVar.f705T = w.f225b;
                        }
                        this.f663g = C0654f.m1567a(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private AbstractC0210af m4109A() {
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this.f703R && m4102a(afVar, true) && afVar.mo2797bw() && (afVar.f1450bY < afVar.f1451bZ - 1.0f || afVar.f1529bR < 1.0f)) {
                return afVar;
            }
        }
        return null;
    }

    /* renamed from: o */
    public void m4070o() {
        AbstractC0789l.m651u();
        if (this.f668r.size() != 0 && !this.f643s) {
            for (int i = 0; i < 8; i++) {
                AbstractC0268al c = this.f703R.f568bi.m4133c();
                if (c != null && m4101a(c) && m4082d(c)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m4082d(AbstractC0268al alVar) {
        if (!(alVar instanceof C0368l)) {
            return false;
        }
        C0368l lVar = (C0368l) alVar;
        if (lVar.f2744fs == -1 && lVar.f2745ft == -1) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z = lVar.f2746fu;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0210af afVar = a[i3];
            if (afVar.f1441bB == this.f703R && afVar.f1539cp == null && (afVar instanceof AbstractC0515r) && this.f703R.m4150i(afVar)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                AbstractC0268al r = afVar.mo1660r();
                if (z) {
                    if (!r.mo3489n()) {
                    }
                    i2++;
                    if (!m4104a(afVar)) {
                        i++;
                    }
                } else {
                    if (r != lVar && !lVar.f2835fz.contains(r)) {
                    }
                    i2++;
                    if (!m4104a(afVar)) {
                    }
                }
            }
        }
        if (lVar.f2744fs != -1 && i >= lVar.f2744fs) {
            return false;
        }
        if (lVar.f2745ft == -1 || i2 < lVar.f2745ft) {
            return m4099a((AbstractC0268al) lVar, true);
        }
        return false;
    }

    /* renamed from: p */
    public void m4069p() {
        AbstractC0210af r;
        if (this.f668r.size() != 0 && (r = m4067r()) != null) {
            this.f671x.m4474a(r.f5841dH, r.f5842dI);
            AbstractC0515r a = m4103a(r, this.f671x, true);
            if (a != null) {
                m4094a(a, r);
            }
        }
    }

    /* renamed from: q */
    public void m4068q() {
        AbstractC0515r rVar;
        C0270an ap;
        AbstractC0210af i;
        if (!(this.f668r.size() == 0 || this.f649B == null)) {
            AbstractC0210af[] a = this.f667q.m456a();
            int size = this.f667q.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0210af afVar = a[i2];
                if (afVar.f1441bB == this.f703R && m4104a(afVar) && afVar.f1539cp == null && afVar.mo1660r().mo3489n() && (afVar instanceof AbstractC0515r) && this.f703R.m4150i(afVar) && C0654f.m1511c(0.0f, 1.0f) <= 0.3d && (ap = (rVar = (AbstractC0515r) afVar).m2300ap()) != null && ap.m3464d() == EnumC0271ao.f1665g && (i = ap.m3454i()) != null && i.mo2679g() > 0.0f && !this.f649B.m3134b(i.m3558cv())) {
                    m4094a(rVar, m4067r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public AbstractC0210af m4067r() {
        AbstractC0210af afVar = null;
        for (int i = 0; i < 20; i++) {
            afVar = this.f668r.m455a(C0654f.m1567a(0, this.f668r.size() - 1));
            if (afVar == null || this.f649B == null || this.f649B.m3134b(afVar.m3558cv())) {
                break;
            }
        }
        return afVar;
    }

    /* renamed from: a */
    public void m4094a(AbstractC0515r rVar, AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (rVar.mo2490w(afVar)) {
            C0651e a = u.f5494bN.m1956a(this.f703R);
            a.m1616a(rVar);
            a.m1605d(afVar);
        }
    }

    /* renamed from: s */
    public void m4066s() {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af A = m4109A();
        if (A != null) {
            this.f671x.m4474a(A.f5841dH, A.f5842dI);
            AbstractC0515r a = m4100a((AbstractC0268al) null, this.f671x, true);
            if (a != null && a.mo2499a(A) && A.m3549e(a) < 2) {
                C0651e a2 = u.f5494bN.m1956a(this.f703R);
                a2.m1616a(a);
                a2.m1610b(A);
            }
        }
    }

    /* renamed from: b */
    public void m4089b(float f) {
        m4086c(f);
        int i = this.f656J;
        int i2 = this.f655I;
        m4090b();
        this.f641n = m4060z();
        if (this.f641n) {
            this.f642o = true;
        }
        if (i >= 1) {
            m4066s();
        }
        if (this.f659M && this.f655I > 0) {
            m4070o();
            m4068q();
            m4069p();
        }
        if (i < 2 && this.f664i == 0.0f) {
            this.f664i = 300.0f;
            int a = this.f703R.m4197a(this.f703R.f567bh, EnumC0132b.f590a);
            if (!this.f643s || a <= 2) {
                boolean z = C0654f.m1567a(0, 100) < 5;
                if (z || !m4105a(this.f703R.f567bh, true)) {
                    if (!z) {
                        this.f672H = true;
                    }
                    if (!this.f643s && this.f669v == 0.0f && i < 1 && this.f663g == 0.0f) {
                        m4071n();
                    }
                } else {
                    this.f672H = false;
                    this.f664i = 900.0f;
                }
            }
        }
        int j = m4074j();
        if (i == 0 && i2 == 0) {
            this.f638k += f;
            if (j > 2) {
                this.f638k += 2.0f * f;
            }
            if (j > 5) {
                this.f638k += 4.0f * f;
            }
        } else {
            this.f638k = C0654f.m1575a(this.f638k, f);
        }
        if (this.f638k > 11000.0f) {
            mo4042k();
        }
        if (this.f633b == EnumC0140j.f674a && (!(i == 0 || i2 == 0) || (i2 > 5 && j == 0))) {
            this.f639l += f;
            if (this.f639l > 2000.0f) {
                this.f633b = EnumC0140j.f676c;
            }
        }
        m4065t();
    }

    /* renamed from: t */
    public void m4065t() {
        if (this.f633b == null) {
            AbstractC0789l.m732a("fixOverlaps: this.state==null");
            AbstractC0789l.m732a("id:" + this.f702Q);
            AbstractC0789l.m732a("x:" + this.f704S);
            AbstractC0789l.m732a("y:" + this.f705T);
            AbstractC0789l.m732a("radius:" + this.f706U);
            if (this.f703R != null) {
                AbstractC0789l.m732a("team:" + this.f703R.f1230i);
                return;
            }
            return;
        }
        Iterator it = this.f703R.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if ((oVar instanceof C0139i) && oVar != this) {
                C0139i iVar = (C0139i) oVar;
                if (C0654f.m1573a(this.f704S, this.f705T, iVar.f704S, iVar.f705T) < 400.0f) {
                    if (iVar.f633b == null) {
                        AbstractC0789l.m732a("fixOverlaps: targetBase.state==null");
                    } else if (iVar.f633b.m4059a() < this.f633b.m4059a()) {
                        iVar.mo4042k();
                    } else {
                        mo4042k();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m4064u() {
        return this.f655I;
    }

    /* renamed from: c */
    public void m4086c(float f) {
        this.f655I = 0;
        this.f656J = 0;
        this.f658L = 0;
        this.f657K = 0;
        this.f659M = false;
        this.f668r.clear();
        if (1 != 0) {
            Iterator it = m4073l().iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar = (AbstractC0210af) it.next();
                if (afVar.mo2679g() > 0.0f && m4047b(afVar)) {
                    this.f659M = true;
                    this.f668r.m452a(afVar);
                }
            }
        }
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar2 = a[i];
            if (afVar2.f1441bB == this.f703R && (afVar2 instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (m4092a(rVar, false) && afVar2.m3613bG() && this.f703R.m4150i(afVar2) && !afVar2.mo1661o_()) {
                    AbstractC0268al r = afVar2.mo1660r();
                    if (r.mo3493j()) {
                        this.f655I++;
                    }
                    if (r.mo3490m()) {
                        this.f656J++;
                        if (C0136f.m4131a(rVar)) {
                            this.f657K++;
                        }
                    }
                    if (r.mo3489n()) {
                        this.f658L++;
                    }
                    if (afVar2 instanceof AbstractC0416k) {
                        this.f656J += ((AbstractC0416k) afVar2).mo2734h(EnumC0215ak.f1591h);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m4083d(float f) {
        AbstractC0268al c;
        this.f643s = m4080f();
        this.f644t = this.f643s;
        if (this.f643s) {
            this.f669v += f;
            this.f645u = 100.0f;
        } else {
            this.f669v = 0.0f;
        }
        if (this.f669v > 6000.0f) {
            this.f643s = false;
        }
        this.f640m = C0654f.m1575a(this.f640m, f);
        this.f635e = C0654f.m1575a(this.f635e, f);
        this.f663g = C0654f.m1575a(this.f663g, f);
        this.f664i = C0654f.m1575a(this.f664i, f);
        this.f665j = C0654f.m1575a(this.f665j, f);
        if (this.f643s && this.f665j == 0.0f) {
            this.f665j = 100 + (this.f702Q % 15);
            if (!this.f703R.f541aH) {
                m4075i();
            }
        }
        if (this.f635e <= 0.0f) {
            this.f635e = 270 + (this.f702Q % 15);
            if (this.f703R.m4212R()) {
                this.f635e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.f702Q % 15);
            }
            if (this.f636f < 0.2d) {
                this.f635e += 180.0f;
            }
            if (this.f636f < 0.08d) {
                this.f635e += 180.0f;
            }
            if ((m4061y() != null) && (c = m4087c()) != null && ((this.f636f > 0.8d || this.f703R.m3748j(1300)) && ((this.f636f > 0.4d || this.f703R.m3748j(1700)) && ((this.f636f > 0.2d || this.f703R.m3748j(2100)) && ((this.f636f > 0.1d || this.f703R.m3748j(2800)) && ((this.f636f > 0.05d || this.f703R.m3748j(3100)) && (this.f636f > 0.01d || this.f703R.m3748j(4800)))))))) {
                this.f650C++;
                if (!m4077g(c)) {
                    this.f635e -= 120.0f;
                    this.f651D++;
                }
            }
        }
        float u = m4064u() / 3.0f;
        if (u < 1.0f) {
            u = 1.0f;
        }
        if (this.f643s) {
            this.f662d = (float) (this.f662d + (f * 0.015d));
        }
        if (this.f636f < 0.6d) {
            if (this.f703R.f544aK < 2) {
                this.f662d = (float) (this.f662d + (f * 7.0E-4d * u));
            } else if (this.f703R.m3748j(1200)) {
                this.f662d = (float) (this.f662d + (f * 1.0E-4d * u));
            }
            if (this.f703R.m3748j(1600)) {
                this.f662d = (float) (this.f662d + (f * 0.001d));
            }
            if (this.f703R.m3748j(2200)) {
                this.f662d = (float) (this.f662d + (f * 0.001d));
            }
            if (this.f703R.m3748j(2600)) {
                this.f662d = (float) (this.f662d + (f * 0.001d));
            }
            if (this.f703R.m3748j(8000)) {
                this.f662d = (float) (this.f662d + (f * 0.005d));
            }
            if (this.f703R.m3748j(9000)) {
                this.f662d = (float) (this.f662d + (f * 0.01d));
            }
            if (this.f703R.m3748j(10100)) {
                this.f662d = (float) (this.f662d + (f * 0.01d));
            }
            if (this.f703R.m3748j(30000)) {
                this.f662d = (float) (this.f662d + (f * 0.05d));
            }
        }
        if (this.f703R.m3748j(5000)) {
            this.f662d = (float) (this.f662d + (f * 0.001d));
        }
        if (!this.f703R.m3748j(800) && !this.f643s && this.f662d > 1.2f) {
            this.f662d = 1.2f;
        }
        if (this.f662d > 3.5f) {
            this.f662d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m4063v();
            if (this.f662d < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m4091a(ArrayList arrayList, AbstractC0134d dVar, EnumC0212ah ahVar, int i) {
        this.f673N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0268al a = dVar.m4139a(ahVar);
            if (a != null && !this.f673N.contains(a)) {
                this.f673N.add(a);
            }
        }
        arrayList.addAll(this.f673N);
    }

    /* renamed from: v */
    public void m4063v() {
        EnumC0212ah ahVar;
        AbstractC0210af g;
        int d = m4084d();
        int i = 12;
        int i2 = 50;
        if (this.f703R.m4212R()) {
            i2 = 65;
            i = 16;
        }
        boolean j = this.f703R.m3748j(25000);
        ArrayList arrayList = new ArrayList();
        boolean X = this.f703R.m4206X();
        boolean Y = this.f703R.m4205Y();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.f703R.f549aP) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.f703R.f550aQ) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float c = C0654f.m1511c(0.0f, 1.0f);
        if (c < f) {
            ahVar = EnumC0212ah.f1553b;
        } else if (c < f + f2) {
            ahVar = EnumC0212ah.f1557f;
        } else {
            ahVar = EnumC0212ah.f1555d;
        }
        if ((this.f703R.m3748j(1300) && this.f662d >= 1.0f) || (this.f703R.m3748j(300) && this.f662d >= 3.0f)) {
            if (this.f703R.m4207W() && this.f703R.f545aL < i && C0654f.m1526b(100) < 35) {
                m4091a(arrayList, this.f703R.f562bc, null, 2);
                if (j) {
                }
            }
            if (d < 3 && this.f703R.f543aJ < i2) {
                if (ahVar == EnumC0212ah.f1553b) {
                    m4091a(arrayList, this.f703R.f559aZ, null, 4);
                    if (j) {
                    }
                } else if (ahVar == EnumC0212ah.f1557f) {
                    m4091a(arrayList, this.f703R.f560ba, null, 4);
                    if (j) {
                    }
                } else {
                    m4091a(arrayList, this.f703R.f561bb, null, 4);
                    if (j) {
                    }
                }
            }
            if (this.f662d >= 1.0f && X && this.f640m == 0.0f) {
                int a = this.f703R.m4197a(this.f703R.f565bf, EnumC0132b.f590a);
                int a2 = a + this.f703R.m4197a(this.f703R.f566bg, EnumC0132b.f590a);
                int ad = this.f703R.m4176ad();
                if ((this.f703R.m3748j(1700) || ad > 10 || (this.f703R.f553aT == 0 && ad >= 1 && a == 0)) && (a2 < 3 || (ad > 20 && a2 < 5))) {
                    if (!Y || a2 >= 2) {
                        m4091a(arrayList, this.f703R.f564be, EnumC0212ah.f1555d, 2);
                    } else {
                        m4091a(arrayList, this.f703R.f564be, null, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f653F++;
        }
        while (arrayList.size() != 0) {
            AbstractC0268al alVar = (AbstractC0268al) arrayList.remove(arrayList.size() - 1);
            AbstractC0210af b = AbstractC0210af.m3617b(alVar);
            boolean z = true;
            if (this.f643s && C0654f.m1526b(100) < 10 && (g = m4078g()) != null && !this.f703R.m4165b(b, g)) {
                this.f653F++;
                z = false;
            }
            if (z) {
                if (m4099a(alVar, false)) {
                    this.f653F++;
                    this.f703R.f572bm.m4145a(alVar);
                    this.f662d -= 1.0f;
                    if (this.f703R.m4154g(b)) {
                        this.f640m = 1000.0f;
                        this.f703R.f553aT++;
                        return;
                    }
                    return;
                }
                this.f654G++;
            }
        }
    }

    /* renamed from: a */
    public void m4093a(AbstractC0515r rVar, C0363g gVar, boolean z) {
        this.f660O = rVar.mo1660r();
        if (z) {
            this.f661P = null;
            this.f649B = null;
            return;
        }
        this.f661P = gVar;
        this.f649B = gVar.m3121g(rVar);
    }
}
