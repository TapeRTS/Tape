package com.corrodinggames.rts.gameFramework.p030b;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.gameFramework.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/f.class */
public class C0574f extends AbstractC0854w {

    /* renamed from: a */
    public float f3902a;

    /* renamed from: c */
    float f3904c;

    /* renamed from: d */
    float f3905d;

    /* renamed from: e */
    float f3906e;

    /* renamed from: f */
    float f3907f;

    /* renamed from: g */
    float f3908g;

    /* renamed from: h */
    float f3909h;

    /* renamed from: i */
    C0573e f3910i;

    /* renamed from: m */
    float f3914m;

    /* renamed from: n */
    float f3915n;

    /* renamed from: o */
    float f3916o;

    /* renamed from: p */
    float f3917p;

    /* renamed from: q */
    float f3918q;

    /* renamed from: r */
    float f3919r;

    /* renamed from: s */
    EnumC0576h f3920s;

    /* renamed from: t */
    public float f3921t;

    /* renamed from: v */
    static C0573e f3923v;

    /* renamed from: w */
    static C0573e f3924w;

    /* renamed from: x */
    private final C0571c f3925x;

    /* renamed from: b */
    public boolean f3903b = true;

    /* renamed from: j */
    public int f3911j = 0;

    /* renamed from: k */
    public int f3912k = 0;

    /* renamed from: l */
    public int f3913l = -1;

    /* renamed from: u */
    public boolean f3922u = false;

    /* renamed from: b */
    public static void m1970b() {
        C0571c cVar = AbstractC0789l.m638u().f5517bz;
        C0573e eVar = new C0573e(cVar);
        m1971a(eVar, false);
        eVar.f3894ap = 18;
        eVar.f3847u = 15.0f;
        f3923v = eVar;
        C0573e eVar2 = new C0573e(cVar);
        m1968b(eVar2, false);
        f3924w = eVar2;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f5842dH);
        apVar.mo1096a(this.f5843dI);
        apVar.mo1096a(this.f3902a);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f5842dH = kVar.m1061g();
        this.f5843dI = kVar.m1061g();
        this.f3902a = kVar.m1061g();
        this.f3903b = false;
        super.mo399a(kVar);
    }

    public C0574f(C0571c cVar) {
        this.f3925x = cVar;
    }

    /* renamed from: a */
    public static void m1971a(C0573e eVar, boolean z) {
        eVar.m1974c();
        eVar.f3894ap = 5;
        if (z) {
            eVar.f3893ao = C0654f.m1514a(0, 1);
        } else {
            eVar.f3893ao = 0;
        }
        eVar.f3877Y = 0.0f;
        eVar.f3891am = true;
        eVar.f3869Q = 0.1f;
        eVar.f3871S = 0.5f;
        eVar.f3848v = true;
        eVar.f3875W = 300.0f;
        eVar.f3876X = eVar.f3875W;
        eVar.f3845s = true;
        eVar.f3846t = true;
        eVar.f3847u = 40.0f;
        eVar.f3896ar = false;
        eVar.f3895aq = (short) 2;
        eVar.f3860H = 0.4f;
        eVar.f3859G = 1.5f;
        eVar.f3833g = C0573e.f3837k;
    }

    /* renamed from: b */
    public static void m1968b(C0573e eVar, boolean z) {
        eVar.m1974c();
        eVar.f3894ap = 7;
        if (z) {
            eVar.f3893ao = C0654f.m1514a(0, 3);
        } else {
            eVar.f3893ao = 0;
        }
        eVar.f3877Y = 0.0f;
        eVar.f3891am = true;
        eVar.f3869Q = 0.0f;
        eVar.f3871S = 0.2f;
        eVar.f3848v = true;
        eVar.f3875W = 50.0f;
        eVar.f3876X = eVar.f3875W;
        eVar.f3845s = true;
        eVar.f3846t = true;
        eVar.f3847u = 10.0f;
        eVar.f3896ar = false;
        eVar.f3895aq = (short) 2;
        eVar.f3833g = C0573e.f3840n;
    }

    /* renamed from: a */
    public static C0574f m1973a(float f, float f2) {
        C0574f a = m1972a(f, f2, f3923v);
        a.f3902a = 280.0f;
        a.f3907f = 10.0f;
        a.f3904c = 10.0f;
        a.f3914m = 0.03f;
        a.f3915n = 0.03f;
        a.f3917p = 6.0f;
        a.f3918q = 6.0f;
        a.f3920s = EnumC0576h.verylow;
        a.f3919r = 180.0f;
        a.f3911j = -16777216;
        return a;
    }

    /* renamed from: b */
    public static C0574f m1969b(float f, float f2) {
        C0574f a = m1972a(f, f2, f3924w);
        a.f3902a = 330.0f;
        a.f3907f = 10.0f;
        a.f3904c = 10.0f;
        a.f3914m = 0.1f;
        a.f3915n = 0.03f;
        a.f3917p = 4.0f;
        a.f3918q = 4.0f;
        a.f3920s = EnumC0576h.verylow;
        return a;
    }

    /* renamed from: a */
    public static C0574f m1972a(float f, float f2, C0573e eVar) {
        C0571c cVar = AbstractC0789l.m638u().f5517bz;
        C0574f fVar = new C0574f(cVar);
        fVar.f5842dH = f;
        fVar.f5843dI = f2;
        fVar.f3902a = 100.0f;
        fVar.f3907f = 10.0f;
        fVar.f3910i = eVar;
        if (eVar == null) {
            fVar.f3910i = new C0573e(cVar);
            AbstractC0789l.m682b("Error: Emitter create srcEffect==null");
        }
        return fVar;
    }

    /* renamed from: c */
    public boolean m1967c() {
        return AbstractC0789l.m638u().f5566cw.m4116b(this.f5842dH, this.f5843dI);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        C0573e b;
        this.f3921t = C0654f.m1522a(this.f3921t, f);
        if (this.f3921t <= 0.0f) {
            if (this.f3903b) {
                this.f3904c += f;
                if (this.f3904c > this.f3907f) {
                    this.f3905d += f;
                    if (this.f3905d > this.f3908g) {
                        this.f3905d = 0.0f;
                        this.f3906e += 1.0f;
                        if (this.f3906e > this.f3909h) {
                            this.f3904c = 0.0f;
                            this.f3906e = 0.0f;
                        }
                        if ((this.f3922u || m1967c()) && (b = this.f3925x.m1989b(this.f5842dH, this.f5843dI, 0.0f, EnumC0572d.custom, false, this.f3920s)) != null) {
                            b.m1978a(this.f3910i);
                            b.f3869Q += C0654f.m1458c(-this.f3914m, this.f3914m);
                            b.f3870R += C0654f.m1458c(-this.f3915n, this.f3915n);
                            b.f3871S += C0654f.m1458c(-this.f3916o, this.f3916o);
                            b.f3877Y = C0654f.m1458c(-this.f3919r, this.f3919r);
                            b.f3862J = this.f5842dH;
                            b.f3863K = this.f5843dI;
                            b.f3862J += C0654f.m1458c(-this.f3917p, this.f3917p);
                            b.f3863K += C0654f.m1458c(-this.f3918q, this.f3918q);
                            if (this.f3911j != 0) {
                                b.f3851y = this.f3911j;
                            }
                            if (this.f3913l >= 0) {
                                b.f3852z = this.f3912k;
                                b.f3853A = this.f3913l;
                            }
                        }
                    }
                }
            }
            this.f3902a -= f;
            if (this.f3902a < 0.0f) {
                mo405a();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: d */
    public void mo395d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: f */
    public boolean mo391f(float f) {
        return false;
    }
}
