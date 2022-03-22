package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0846u;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class C0185g extends AbstractC0197s {

    /* renamed from: a */
    public AbstractC0197s f1329a;

    /* renamed from: b */
    public AbstractC0515r f1330b;

    /* renamed from: c */
    public C0180b f1331c = C0180b.emptyActionFilter;

    /* renamed from: d */
    static C0846u f1332d;

    /* renamed from: e */
    static final C0846u f1333e = new C0846u();

    /* renamed from: H */
    private void m3405H() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (f1332d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        f1332d = u.f5518bA.f4412bF;
        f1333e.clear();
        f1333e.add(this.f1330b);
        u.f5518bA.f4412bF = f1333e;
    }

    /* renamed from: M */
    private void m3404M() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (f1332d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        u.f5518bA.f4412bF = f1332d;
        f1332d = null;
        f1333e.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j_ */
    public float mo3363j_() {
        return super.mo3363j_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public int compareTo(AbstractC0197s sVar) {
        return super.compareTo(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return this.f1329a.mo2379b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public String mo3171e(AbstractC0210af afVar) {
        return this.f1329a.mo3171e(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return this.f1329a.mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public String mo3170f(AbstractC0210af afVar) {
        return this.f1329a.mo3170f(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return this.f1329a.mo2415c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return this.f1329a.mo2416b(this.f1330b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k_ */
    public boolean mo3370k_() {
        return this.f1329a.mo3370k_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2386a(AbstractC0210af afVar, boolean z) {
        return this.f1329a.mo2386a(this.f1330b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: p */
    public int mo3369p() {
        return this.f1329a.mo3369p();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public void mo2675g(AbstractC0210af afVar) {
        this.f1329a.mo2675g(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo3169h(AbstractC0210af afVar) {
        return this.f1329a.mo3169h(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        return this.f1329a.mo3161q();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo2382h() {
        return this.f1329a.mo2382h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        return this.f1329a.mo2412i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return this.f1329a.mo2413g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return this.f1329a.mo2377e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return this.f1329a.mo2376f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        m3405H();
        String d = this.f1329a.mo2378d();
        m3404M();
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        m3405H();
        String c = this.f1329a.mo2414c(afVar);
        m3404M();
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public C0748e mo3160r() {
        return this.f1329a.mo3160r();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public C0748e mo3168i(AbstractC0210af afVar) {
        return this.f1329a.mo3168i(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: s */
    public Rect mo3374s() {
        return this.f1329a.mo3374s();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public AbstractC0210af mo3167j(AbstractC0210af afVar) {
        return this.f1329a.mo3167j(afVar);
    }

    public int hashCode() {
        return this.f1329a.hashCode();
    }

    public String toString() {
        return this.f1329a.toString();
    }

    public C0185g(AbstractC0197s sVar, AbstractC0515r rVar, C0181c cVar) {
        super(cVar);
        this.f1329a = sVar;
        this.f1330b = rVar;
        this.f1354f = this.f1329a.f1354f;
    }

    /* renamed from: t */
    public AbstractC0197s m3402t() {
        return this.f1329a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: u */
    public boolean mo3373u() {
        return this.f1329a.mo3373u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        return this.f1329a.mo3361o();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: v */
    public AbstractC0268al mo3156v() {
        return this.f1329a.mo3156v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: w */
    public C0181c mo3372w() {
        return this.f1329a.m3387J();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public void mo3383a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        super.mo3383a(afVar, afVar2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo3174a(AbstractC0210af afVar, AbstractC0171m mVar) {
        return this.f1329a.mo3174a(this.f1330b, mVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: x */
    public boolean mo3155x() {
        return this.f1329a.mo3155x();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public boolean mo2410b(AbstractC0210af afVar) {
        return this.f1329a.mo2410b(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: y */
    public C0363g mo3154y() {
        return this.f1329a.mo3154y();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k */
    public String mo3166k(AbstractC0210af afVar) {
        return this.f1329a.mo3166k(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public boolean mo3172d(AbstractC0210af afVar, boolean z) {
        return this.f1329a.mo3172d(this.f1330b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: l */
    public boolean mo3165l(AbstractC0210af afVar) {
        return this.f1329a.mo3165l(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: m */
    public boolean mo3164m(AbstractC0210af afVar) {
        return this.f1329a.mo3164m(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: z */
    public boolean mo3359z() {
        return this.f1329a.mo3359z();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: A */
    public boolean mo3371A() {
        return this.f1329a.mo3371A();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: B */
    public AbstractC0268al mo3182B() {
        return this.f1329a.mo3182B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: C */
    public boolean mo3181C() {
        return this.f1329a.mo3181C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: n */
    public boolean mo3163n(AbstractC0210af afVar) {
        return this.f1329a.mo3163n(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3162o(AbstractC0210af afVar) {
        return this.f1329a.mo3162o(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public boolean mo2409c(AbstractC0210af afVar, boolean z) {
        return this.f1329a.mo2409c(this.f1330b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: p */
    public boolean mo3376p(AbstractC0210af afVar) {
        return this.f1329a.mo3376p(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: D */
    public boolean mo3364D() {
        return this.f1329a.mo3364D();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public void mo3378d(AbstractC0210af afVar) {
        this.f1329a.mo3378d(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public float mo2375j() {
        return this.f1329a.mo2375j();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k */
    public int mo2374k() {
        return this.f1329a.mo2374k();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: E */
    public boolean mo3180E() {
        return this.f1329a.mo3180E();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: F */
    public boolean mo3179F() {
        return this.f1329a.mo3179F();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public float mo3368q(AbstractC0210af afVar) {
        return this.f1329a.mo3368q(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public ArrayList mo3375r(AbstractC0210af afVar) {
        return this.f1329a.mo3375r(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: s */
    public boolean mo3159s(AbstractC0210af afVar) {
        if (!this.f1331c.isAvailable(this, afVar)) {
            return false;
        }
        return this.f1329a.mo3159s(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        if (!this.f1331c.isAvailable(this, afVar)) {
            return false;
        }
        return this.f1329a.mo2381a((AbstractC0210af) this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: G */
    public int mo3178G() {
        return this.f1329a.mo3178G();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: t */
    public boolean mo3158t(AbstractC0210af afVar) {
        return this.f1329a.mo3158t(this.f1330b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: u */
    public boolean mo3157u(AbstractC0210af afVar) {
        return this.f1329a.mo3157u(this.f1330b);
    }

    /* renamed from: a */
    public boolean m3403a(C0185g gVar) {
        return this.f1329a == gVar.f1329a && this.f1330b == gVar.f1330b && m3387J() == gVar.m3387J() && this.f1331c == gVar.f1331c;
    }
}
