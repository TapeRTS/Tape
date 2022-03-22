package com.corrodinggames.rts.game.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/n.class */
public class C0144n extends AbstractC0138h {

    /* renamed from: a */
    boolean f683a;

    /* renamed from: b */
    int f684b;

    /* renamed from: c */
    int f685c;

    /* renamed from: d */
    C0139i f686d;

    /* renamed from: h */
    float f690h;

    /* renamed from: i */
    float f691i;

    /* renamed from: j */
    float f692j;

    /* renamed from: k */
    float f693k;

    /* renamed from: l */
    int f694l;

    /* renamed from: m */
    AbstractC0138h f695m;

    /* renamed from: n */
    AbstractC0515r f696n;

    /* renamed from: q */
    boolean f699q;

    /* renamed from: r */
    float f700r;

    /* renamed from: s */
    float f701s;

    /* renamed from: e */
    float f687e = 100.0f;

    /* renamed from: f */
    float f688f = 4000.0f;

    /* renamed from: g */
    float f689g = 100.0f;

    /* renamed from: o */
    float f697o = 0.0f;

    /* renamed from: p */
    boolean f698p = false;

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f683a);
        apVar.mo1095a(this.f684b);
        apVar.mo1095a(this.f685c);
        apVar.mo1095a(this.f630B.size());
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            apVar.mo1144a((AbstractC0515r) it.next());
        }
        apVar.mo1130c(5);
        apVar.mo1095a(this.f703R.m3867a(this.f695m));
        apVar.mo1090a(this.f699q);
        apVar.mo1144a(this.f696n);
        apVar.mo1096a(this.f697o);
        apVar.mo1090a(this.f698p);
        apVar.mo1096a(this.f700r);
        apVar.mo1096a(this.f701s);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o
    /* renamed from: a */
    public void mo3722a(C0707k kVar) {
        this.f683a = kVar.m1063e();
        this.f684b = kVar.m1062f();
        this.f685c = kVar.m1062f();
        m3784l();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0515r o = kVar.m1053o();
            if (o != null) {
                if (!this.f703R.m3828g(o)) {
                    AbstractC0789l.m682b("TransporterGroup:readIn: Unit is not transporterUnit");
                } else {
                    m3791a(o);
                }
            }
        }
        byte d = kVar.m1065d();
        if (d >= 1) {
            this.f695m = (AbstractC0138h) this.f703R.m3821p(kVar.m1062f());
        }
        if (d >= 2) {
            this.f699q = kVar.m1063e();
        }
        if (d >= 3) {
            this.f696n = kVar.m1053o();
        }
        if (d >= 4) {
            this.f697o = kVar.m1061g();
            this.f698p = kVar.m1063e();
        }
        if (d >= 5) {
            this.f700r = kVar.m1061g();
            this.f701s = kVar.m1061g();
        }
        super.mo3722a(kVar);
    }

    public C0144n(C0118a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public void m3728c() {
        Iterator it = AbstractC0210af.f1442bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (!afVar.f1459bz && afVar.f1461bB == this.f703R && this.f694l > this.f630B.size() && (afVar instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (!rVar.f1452bs && rVar.f3449ar == null && this.f703R.m3828g(rVar) && this.f703R.m3824i(rVar)) {
                    m3791a(rVar);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m3727d() {
        return this.f695m != null;
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0138h
    /* renamed from: a */
    public void mo3731a(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f690h += f;
        m3786i();
        if (this.f694l <= this.f630B.size()) {
        }
        this.f691i = C0654f.m1522a(this.f691i, f);
        this.f692j = C0654f.m1522a(this.f692j, f);
        this.f693k = C0654f.m1522a(this.f693k, f);
        if (!m3727d() && !this.f699q && this.f694l > this.f630B.size() && this.f691i == 0.0f) {
            this.f691i = 300.0f;
            m3728c();
        }
        if (!m3727d() && this.f630B.size() != 0) {
            if (!m3727d()) {
                this.f688f = C0654f.m1522a(this.f688f, f);
                if (this.f688f == 0.0f) {
                    this.f688f = 4000.0f;
                    if (this.f686d != null) {
                        PointF w = this.f686d.m3715w();
                        this.f704S = w.f224a;
                        this.f705T = w.f225b;
                    }
                }
            }
            if (this.f692j == 0.0f) {
                this.f692j = 400.0f;
                C0651e a = u.f5531bN.m1901a(this.f703R);
                Iterator it = this.f630B.iterator();
                while (it.hasNext()) {
                    AbstractC0515r rVar = (AbstractC0515r) it.next();
                    if (m3719c(rVar) > 28900.0f && !rVar.m2232au()) {
                        a.m1563a(rVar);
                    } else if (((AbstractC0208ad) rVar).mo2494f() != 0) {
                        C0181c ca = rVar.mo2499ca();
                        C0651e a2 = u.f5531bN.m1901a(this.f703R);
                        a2.m1563a(rVar);
                        a2.m1568a(ca);
                    }
                }
                a.m1573a(this.f704S, this.f705T);
            }
            if (this.f695m == null) {
                this.f689g = C0654f.m1522a(this.f689g, f);
                if (this.f689g == 0.0f) {
                    this.f689g = 100.0f;
                    if (C0654f.m1514a(0, 100) < 80) {
                        m3730a(f, true);
                    }
                    if (this.f695m == null) {
                        m3730a(f, false);
                    }
                }
            }
        }
        if (this.f695m != null && this.f695m.f707V) {
            this.f695m = null;
        }
        if (!this.f699q) {
            if (this.f695m != null) {
                ArrayList arrayList = this.f695m.f631C;
                if (!(this.f696n == null || (!this.f696n.f1459bz && this.f696n.f1501cp == null && this.f696n.f1502cq == null))) {
                    arrayList.remove(this.f696n);
                    this.f696n = null;
                }
                if (this.f696n == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC0515r rVar2 = (AbstractC0515r) it2.next();
                        if (rVar2.f1501cp == null) {
                            Iterator it3 = this.f630B.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((AbstractC0515r) it3.next()).mo2497d((AbstractC0210af) rVar2, false)) {
                                        this.f696n = rVar2;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f696n == null) {
                        this.f699q = true;
                        this.f692j = 0.0f;
                        this.f693k = 0.0f;
                        this.f700r = this.f695m.f704S;
                        this.f701s = this.f695m.f705T;
                    }
                }
                if (this.f696n != null) {
                    if (this.f692j == 0.0f) {
                        this.f692j = 400.0f;
                        C0651e a3 = u.f5531bN.m1901a(this.f703R);
                        Iterator it4 = this.f630B.iterator();
                        while (it4.hasNext()) {
                            a3.m1563a((AbstractC0515r) it4.next());
                        }
                        a3.m1573a(this.f696n.f5842dH, this.f696n.f5843dI);
                    }
                    if (this.f693k == 0.0f) {
                        this.f693k = 80.0f;
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            AbstractC0515r rVar3 = (AbstractC0515r) it5.next();
                            Iterator it6 = this.f630B.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    AbstractC0515r rVar4 = (AbstractC0515r) it6.next();
                                    if (rVar4.mo2497d((AbstractC0210af) rVar3, false) && C0654f.m1520a(rVar4.f5842dH, rVar4.f5843dI, rVar3.f5842dH, rVar3.f5843dI) < 14400.0f) {
                                        C0651e a4 = u.f5531bN.m1901a(this.f703R);
                                        a4.m1563a(rVar3);
                                        a4.m1550e(rVar4);
                                        break;
                                    }
                                }
                            }
                        }
                        boolean z = false;
                        Iterator it7 = this.f630B.iterator();
                        while (it7.hasNext()) {
                            if (((AbstractC0515r) it7.next()).mo2497d((AbstractC0210af) this.f696n, false)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f696n = null;
                        }
                    }
                }
            }
        } else if (this.f695m == null) {
            m3726e();
        } else {
            if (this.f692j == 0.0f) {
                this.f692j = 400.0f;
                float c = this.f695m.f704S + C0654f.m1458c(-40.0f, 40.0f);
                float c2 = this.f695m.f705T + C0654f.m1458c(-40.0f, 40.0f);
                if (this.f697o > 600.0f) {
                    c += C0654f.m1458c(-300.0f, 300.0f);
                    c2 += C0654f.m1458c(-300.0f, 300.0f);
                }
                if (this.f697o > 1200.0f) {
                    c += C0654f.m1458c(-300.0f, 300.0f);
                    c2 += C0654f.m1458c(-300.0f, 300.0f);
                }
                if (C0851y.m434a(c, c2, EnumC0212ah.LAND)) {
                    c += C0654f.m1458c(-100.0f, 100.0f);
                    c2 += C0654f.m1458c(-100.0f, 100.0f);
                }
                if (C0851y.m434a(c, c2, EnumC0212ah.LAND)) {
                    c += C0654f.m1458c(-200.0f, 200.0f);
                    c2 += C0654f.m1458c(-200.0f, 200.0f);
                }
                if (C0851y.m434a(c, c2, EnumC0212ah.LAND)) {
                    c += C0654f.m1458c(-200.0f, 200.0f);
                    c2 += C0654f.m1458c(-200.0f, 200.0f);
                }
                if (C0851y.m434a(c, c2, EnumC0212ah.LAND)) {
                    this.f692j = 30.0f;
                } else {
                    this.f700r = c;
                    this.f701s = c2;
                    C0651e a5 = u.f5531bN.m1901a(this.f703R);
                    Iterator it8 = this.f630B.iterator();
                    while (it8.hasNext()) {
                        AbstractC0515r rVar5 = (AbstractC0515r) it8.next();
                        if (((AbstractC0208ad) rVar5).mo2494f() == 0) {
                            C0651e a6 = u.f5531bN.m1901a(this.f703R);
                            a6.m1563a(rVar5);
                            a6.m1573a(this.f704S, this.f705T);
                        } else if (C0654f.m1520a(rVar5.f5842dH, rVar5.f5843dI, this.f700r, this.f701s) > 1600.0f) {
                            a5.m1563a(rVar5);
                        }
                    }
                    a5.m1573a(this.f700r, this.f701s);
                }
            }
            if (this.f693k == 0.0f) {
                this.f693k = 100.0f;
                Iterator it9 = this.f630B.iterator();
                while (it9.hasNext()) {
                    AbstractC0515r rVar6 = (AbstractC0515r) it9.next();
                    if (C0654f.m1520a(rVar6.f5842dH, rVar6.f5843dI, this.f700r, this.f701s) < 6400.0f) {
                        this.f698p = true;
                        C0181c ca2 = rVar6.mo2499ca();
                        C0651e a7 = u.f5531bN.m1901a(this.f703R);
                        a7.m1563a(rVar6);
                        a7.m1568a(ca2);
                    }
                }
            }
            if (this.f698p) {
                this.f695m.m3785j();
                this.f697o += f;
            }
            boolean z2 = false;
            Iterator it10 = this.f630B.iterator();
            while (it10.hasNext()) {
                AbstractC0515r rVar7 = (AbstractC0515r) it10.next();
                if (!rVar7.f1459bz && ((AbstractC0208ad) rVar7).mo2494f() != 0) {
                    z2 = true;
                }
            }
            if (!z2 || this.f697o > 1700.0f) {
                m3726e();
            }
        }
        if (this.f690h > 1500.0f && this.f630B.size() == 0) {
            mo3716k();
        }
    }

    /* renamed from: e */
    public void m3726e() {
        this.f699q = false;
        this.f695m = null;
        this.f697o = 0.0f;
        this.f692j = 0.0f;
        this.f693k = 0.0f;
        this.f698p = false;
        m3725f();
    }

    /* renamed from: a */
    public void m3730a(float f, boolean z) {
        Iterator it = this.f703R.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if ((oVar instanceof AbstractC0138h) && !(oVar instanceof C0144n) && (!z || (oVar instanceof C0142l))) {
                AbstractC0138h hVar = (AbstractC0138h) oVar;
                if (hVar.f631C.size() != 0 && !hVar.m3787h()) {
                    this.f695m = hVar;
                    this.f696n = null;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C0139i m3729a(boolean z) {
        C0139i iVar = null;
        Iterator it = this.f703R.f555aV.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if (oVar instanceof C0139i) {
                C0139i iVar2 = (C0139i) oVar;
                if (!iVar2.f650s || !z) {
                    if (iVar2.f633b == EnumC0140j.Active) {
                        iVar = iVar2;
                        if (C0654f.m1473b(3) == 0) {
                            return iVar;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return iVar;
    }

    /* renamed from: f */
    public void m3725f() {
        PointF pointF = null;
        if (1 != 0) {
            this.f686d = m3729a(true);
            if (this.f686d == null) {
                this.f686d = m3729a(false);
            }
            if (this.f686d != null) {
                pointF = this.f686d.m3715w();
            }
        }
        if (pointF == null) {
            pointF = this.f703R.m3850ab();
            this.f686d = null;
        }
        this.f704S = pointF.f224a;
        this.f705T = pointF.f225b;
    }
}
