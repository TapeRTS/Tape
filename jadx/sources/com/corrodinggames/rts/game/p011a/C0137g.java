package com.corrodinggames.rts.game.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0214aj;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.p028h.AbstractC0497f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/g.class */
public class C0137g extends AbstractC0138h {

    /* renamed from: a */
    boolean f603a;

    /* renamed from: b */
    boolean f604b;

    /* renamed from: c */
    boolean f605c;

    /* renamed from: d */
    boolean f606d;

    /* renamed from: e */
    boolean f607e;

    /* renamed from: f */
    AbstractC0515r f608f;

    /* renamed from: g */
    boolean f609g;

    /* renamed from: h */
    int f610h;

    /* renamed from: i */
    int f611i;

    /* renamed from: j */
    C0139i f612j;

    /* renamed from: k */
    float f613k;

    /* renamed from: l */
    float f614l;

    /* renamed from: m */
    float f615m;

    /* renamed from: n */
    float f616n;

    /* renamed from: o */
    float f617o;

    /* renamed from: p */
    boolean f618p;

    /* renamed from: q */
    boolean f619q;

    /* renamed from: r */
    boolean f620r;

    /* renamed from: s */
    float f621s;

    /* renamed from: t */
    float f622t;

    /* renamed from: u */
    boolean f623u;

    /* renamed from: v */
    AbstractC0210af f624v;

    /* renamed from: w */
    float f625w;

    /* renamed from: x */
    float f626x;

    /* renamed from: y */
    float f627y;

    /* renamed from: z */
    int f628z;

    /* renamed from: A */
    boolean f629A;

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0138h
    /* renamed from: a */
    public boolean mo3792a() {
        return this.f603a;
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0138h
    /* renamed from: b */
    public boolean mo3790b() {
        if (!this.f609g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0137g m3801a(C0118a aVar, AbstractC0515r rVar) {
        C0137g gVar = new C0137g(aVar, false);
        gVar.f603a = true;
        gVar.f604b = true;
        gVar.f605c = true;
        gVar.f606d = true;
        gVar.f608f = rVar;
        gVar.m3791a(rVar);
        gVar.f628z = 0;
        gVar.m3793f();
        return gVar;
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f609g);
        apVar.mo1095a(this.f610h);
        apVar.mo1095a(this.f611i);
        apVar.mo1095a(this.f630B.size());
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            apVar.mo1144a((AbstractC0515r) it.next());
        }
        apVar.mo1130c(7);
        apVar.mo1090a(false);
        apVar.mo1090a(this.f620r);
        apVar.mo1096a(this.f616n);
        apVar.mo1095a(this.f631C.size());
        Iterator it2 = this.f631C.iterator();
        while (it2.hasNext()) {
            apVar.mo1144a((AbstractC0515r) it2.next());
        }
        apVar.mo1090a(this.f629A);
        apVar.mo1090a(this.f603a);
        apVar.mo1090a(this.f604b);
        apVar.mo1090a(this.f605c);
        apVar.mo1090a(this.f606d);
        apVar.mo1090a(this.f607e);
        apVar.mo1144a(this.f608f);
        apVar.mo1095a(this.f628z);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o
    /* renamed from: a */
    public void mo3722a(C0707k kVar) {
        this.f609g = kVar.m1063e();
        this.f610h = kVar.m1062f();
        this.f611i = kVar.m1062f();
        m3784l();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0515r o = kVar.m1053o();
            if (o != null) {
                m3791a(o);
            }
        }
        byte d = kVar.m1065d();
        if (d >= 1) {
            kVar.m1063e();
        }
        if (d >= 2) {
            this.f620r = kVar.m1063e();
        }
        if (d >= 3) {
            this.f616n = kVar.m1061g();
        }
        if (d >= 4) {
            this.f631C.clear();
            int f2 = kVar.m1062f();
            for (int i2 = 0; i2 < f2; i2++) {
                AbstractC0515r o2 = kVar.m1053o();
                if (o2 != null) {
                    this.f631C.add(o2);
                }
            }
        }
        if (d >= 5) {
            this.f629A = kVar.m1063e();
        }
        if (d >= 6) {
            this.f603a = kVar.m1063e();
            this.f604b = kVar.m1063e();
            this.f605c = kVar.m1063e();
            this.f606d = kVar.m1063e();
            this.f607e = kVar.m1063e();
            this.f608f = kVar.m1053o();
        }
        if (d >= 7) {
            this.f628z = kVar.m1062f();
        }
        if (!this.f629A) {
            Iterator it = this.f630B.iterator();
            while (it.hasNext()) {
                AbstractC0515r rVar = (AbstractC0515r) it.next();
                if (rVar instanceof AbstractC0497f) {
                    if (rVar != null && rVar.f3449ar == this) {
                        rVar.f3449ar = null;
                    }
                    if (rVar != null) {
                        this.f631C.remove(rVar);
                    }
                    it.remove();
                }
            }
        }
        super.mo3722a(kVar);
    }

    public C0137g(C0118a aVar) {
        super(aVar);
        this.f609g = true;
        this.f613k = 1000.0f;
        this.f614l = 100.0f;
        this.f615m = 4000.0f;
        this.f616n = 0.0f;
        this.f617o = 1000.0f;
        this.f618p = false;
        this.f619q = false;
        this.f620r = false;
        this.f621s = 0.0f;
        this.f622t = 0.0f;
    }

    public C0137g(C0118a aVar, boolean z) {
        this(aVar);
        this.f609g = z;
    }

    /* renamed from: c */
    public void m3797c() {
        Iterator it = AbstractC0210af.f1442bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (!afVar.f1459bz && afVar.f1461bB == this.f703R && this.f628z > this.f630B.size() && (afVar instanceof AbstractC0515r)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (!rVar.f1451br && rVar.f3449ar == null && this.f703R.m3826h(rVar) && this.f703R.m3824i(rVar)) {
                    if (this.f629A) {
                        if (afVar.mo2358h() != EnumC0212ah.LAND) {
                            if (!this.f703R.m3864a(rVar, this.f704S, this.f705T) || (!mo3790b() && C0654f.m1514a(0, 100) <= 2)) {
                                m3791a(rVar);
                            }
                        }
                    } else if (afVar.mo2358h() != EnumC0212ah.WATER) {
                        if (!this.f703R.m3864a(rVar, this.f704S, this.f705T)) {
                        }
                        m3791a(rVar);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m3795d() {
        if (this.f628z <= this.f630B.size()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0138h
    /* renamed from: a */
    public void mo3731a(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f625w += f;
        m3786i();
        if (m3795d()) {
            this.f613k = C0654f.m1522a(this.f613k, f);
        }
        this.f626x = C0654f.m1522a(this.f626x, f);
        this.f627y = C0654f.m1522a(this.f627y, f);
        this.f617o = C0654f.m1522a(this.f617o, f);
        if (!this.f623u && !this.f619q && !m3795d() && this.f626x == 0.0f) {
            this.f626x = 200 + C0654f.m1473b(200);
            m3797c();
        }
        if (!this.f623u || this.f618p) {
            if (!this.f618p) {
                this.f615m = C0654f.m1522a(this.f615m, f);
                if (this.f615m == 0.0f && this.f612j != null) {
                    PointF w = this.f612j.m3715w();
                    if (!m3802a(w.f224a, w.f225b)) {
                        this.f615m = 100.0f;
                    } else {
                        this.f615m = 4000.0f;
                        this.f704S = w.f224a;
                        this.f705T = w.f225b;
                    }
                }
            }
            if (this.f627y == 0.0f) {
                this.f627y = 800.0f;
                C0651e a = u.f5531bN.m1901a(this.f703R);
                Iterator it = this.f630B.iterator();
                while (it.hasNext()) {
                    AbstractC0515r rVar = (AbstractC0515r) it.next();
                    boolean z = true;
                    if (m3719c(rVar) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f607e && rVar.mo2245ah() && !rVar.m2238ao()) {
                        z = false;
                    }
                    if (z) {
                        a.m1563a(rVar);
                    }
                }
                if (this.f607e) {
                    a.m1573a(this.f704S, this.f705T);
                } else {
                    a.m1558b(this.f704S, this.f705T);
                }
            }
        }
        if (this.f609g) {
            m3796c(f);
        } else {
            m3799b(f);
        }
        if (this.f628z == 0 && this.f630B.size() == 0) {
            mo3716k();
        }
        if (!this.f604b) {
            return;
        }
        if (this.f608f == null || this.f608f.f1459bz) {
            mo3716k();
        }
    }

    /* renamed from: b */
    public void m3799b(float f) {
        if (this.f612j == null || this.f612j.f707V) {
            m3793f();
        }
        if (this.f604b && this.f608f != null) {
            if (!this.f606d || this.f607e) {
                if (this.f608f.f1484bY / this.f608f.f1485bZ > 0.6d) {
                    this.f607e = false;
                }
                boolean z = false;
                if (this.f612j != null && !this.f612j.f651t) {
                    z = true;
                }
                if (!z) {
                    C0139i a = this.f703R.m3861a(this.f608f.mo2358h(), this.f608f.f5842dH, this.f608f.f5843dI, true);
                    if (a != null) {
                        this.f612j = a;
                    }
                    if (this.f612j != null) {
                        PointF w = this.f612j.m3715w();
                        this.f704S = w.f224a;
                        this.f705T = w.f225b;
                        if (this.f627y > 100.0f) {
                            this.f627y = 100.0f;
                        }
                    }
                }
            } else {
                if (this.f608f.f1484bY / this.f608f.f1485bZ < 0.5d) {
                    this.f607e = true;
                    if (this.f627y > 100.0f) {
                        this.f627y = 100.0f;
                    }
                }
                if (this.f624v == null) {
                    m3793f();
                }
            }
        }
        if (this.f612j != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f617o == 0.0f) {
                    AbstractC0210af g = this.f612j.m3752g();
                    if (g == null) {
                        break;
                    } else if (m3800a(g, false)) {
                        this.f624v = g;
                        this.f617o = 500.0f;
                        this.f615m = 2000.0f;
                        if (!this.f607e) {
                            this.f704S = g.f5842dH;
                            this.f705T = g.f5843dI;
                        }
                        if (this.f627y > 100.0f) {
                            this.f627y = 100.0f;
                        }
                    }
                }
            }
            if (this.f617o == 0.0f) {
                this.f607e = false;
                this.f624v = null;
            }
        }
    }

    /* renamed from: c */
    public void m3796c(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f623u) {
            if (this.f624v == null || !this.f624v.m3321bG() || this.f624v.f1459bz || !this.f619q) {
                this.f624v = this.f703R.m3844ah();
                if (this.f624v != null && !m3800a(this.f624v, true)) {
                    this.f624v = null;
                }
            }
            if (this.f624v != null) {
                if (this.f618p) {
                    this.f622t += f;
                    if (!this.f619q) {
                        this.f621s = C0654f.m1522a(this.f621s, f);
                        if (this.f621s == 0.0f) {
                            this.f621s = 20.0f;
                            m3794e();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.f630B.iterator();
                        while (it.hasNext()) {
                            if (m3719c((AbstractC0515r) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f618p = false;
                        }
                        Iterator it2 = this.f630B.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0515r) it2.next()).f1436bd > u.f5499bh - 1000) {
                                this.f618p = false;
                            }
                        }
                    }
                    if (this.f622t > 17000.0f) {
                        this.f618p = false;
                    }
                } else {
                    this.f616n += f;
                    if (this.f627y == 0.0f) {
                        this.f627y = 800.0f;
                        boolean z2 = false;
                        AbstractList mVar = new C0835m();
                        Iterator it3 = this.f630B.iterator();
                        while (it3.hasNext()) {
                            AbstractC0515r rVar = (AbstractC0515r) it3.next();
                            boolean z3 = true;
                            if (this.f624v != null) {
                                if (!this.f703R.m3862a(rVar, this.f624v)) {
                                    z3 = false;
                                }
                                if (z3 && !C0214aj.m3280a(rVar, this.f624v)) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                z2 = true;
                                mVar.add(rVar);
                            }
                        }
                        if (!z2) {
                            this.f618p = false;
                        } else {
                            C0651e a = u.f5531bN.m1901a(this.f703R);
                            a.m1560a(mVar);
                            if (this.f624v == null || C0654f.m1514a(0, 100) >= 80) {
                                a.m1564a(this.f624v, true);
                            } else {
                                a.m1571a(this.f624v.f5842dH, this.f624v.f5843dI, true);
                            }
                        }
                    }
                }
            }
        } else if (this.f613k == 0.0f) {
            this.f623u = true;
            this.f618p = true;
        }
        if (this.f623u) {
            if (this.f630B.size() == 0) {
                mo3716k();
            }
            if (this.f616n > 1000.0f && this.f630B.size() < 3) {
                mo3716k();
            }
            if (this.f616n > 11000.0f) {
                mo3716k();
            }
        }
    }

    /* renamed from: e */
    public void m3794e() {
        float f = this.f624v.f5842dH;
        float f2 = this.f624v.f5843dI;
        float d = C0654f.m1446d(f, f2, this.f704S, this.f705T);
        float b = C0654f.m1474b(f, f2, this.f704S, this.f705T);
        if (C0654f.m1514a(0, 100) < 80) {
            d += C0654f.m1514a(-110, 110);
        }
        int i = (int) (b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float a = C0654f.m1514a(50, i);
        if (C0654f.m1514a(0, 100) < 80 && a < 450.0f) {
            a = C0654f.m1514a(450, i);
        }
        float i2 = f + (C0654f.m1421i(d) * a);
        float h = f2 + (C0654f.m1425h(d) * a);
        boolean z = true;
        if (!m3802a(i2, h)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (rVar.mo2358h() == EnumC0212ah.LAND) {
                z2 = true;
            }
            if (rVar.mo2358h() == EnumC0212ah.WATER) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.f703R.f523ap == 0 && !m3798b(i2, h)) {
                z = false;
            }
            if (!this.f703R.m3873a(i2, h, this.f624v.f5842dH, this.f624v.f5843dI, EnumC0212ah.LAND) && C0654f.m1514a(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!m3798b(i2, h)) {
                z = false;
            }
            if (!this.f703R.m3873a(i2, h, this.f624v.f5842dH, this.f624v.f5843dI, EnumC0212ah.WATER)) {
                z = false;
            }
        }
        if (z) {
            this.f704S = i2;
            this.f705T = h;
            this.f627y = 0.0f;
            this.f619q = true;
            this.f631C.clear();
            Iterator it2 = this.f630B.iterator();
            while (it2.hasNext()) {
                AbstractC0515r rVar2 = (AbstractC0515r) it2.next();
                if (rVar2.mo2358h() != EnumC0212ah.WATER && !this.f703R.m3864a(rVar2, this.f704S, this.f705T)) {
                    this.f631C.add(rVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m3802a(float f, float f2) {
        return this.f629A ? !C0851y.m434a(f, f2, EnumC0212ah.WATER) : !C0851y.m434a(f, f2, EnumC0212ah.LAND);
    }

    /* renamed from: b */
    public boolean m3798b(float f, float f2) {
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            if (!this.f703R.m3864a((AbstractC0515r) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m3800a(AbstractC0210af afVar, boolean z) {
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (z || this.f703R.m3864a(rVar, afVar.f5842dH, afVar.f5843dI)) {
                if (C0214aj.m3280a(rVar, afVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m3793f() {
        PointF pointF = null;
        if (!this.f604b || this.f608f == null) {
            if (1 != 0) {
                int i = 0;
                while (i < 7) {
                    boolean z = i > 3;
                    if (pointF == null) {
                        Iterator it = this.f703R.f555aV.iterator();
                        while (it.hasNext()) {
                            AbstractC0145o oVar = (AbstractC0145o) it.next();
                            if (oVar instanceof C0139i) {
                                C0139i iVar = (C0139i) oVar;
                                if (iVar.f633b == EnumC0140j.Active && (iVar.m3738u() > 2 || z)) {
                                    if (pointF == null || C0654f.m1473b(this.f703R.f515ah + 2) == 0) {
                                        for (int i2 = 0; i2 < 10; i2++) {
                                            if (pointF == null) {
                                                PointF w = iVar.m3715w();
                                                if (m3802a(w.f224a, w.f225b)) {
                                                    pointF = w;
                                                }
                                            }
                                        }
                                        this.f612j = iVar;
                                    }
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            if (pointF == null) {
                pointF = this.f703R.m3850ab();
                this.f612j = null;
            }
            this.f704S = pointF.f224a;
            this.f705T = pointF.f225b;
            return;
        }
        this.f704S = this.f608f.f5842dH;
        this.f705T = this.f608f.f5843dI;
        this.f612j = this.f703R.m3836c(this.f608f.f5842dH, this.f608f.f5843dI);
    }
}
