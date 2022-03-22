package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.gameFramework.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class C0583bg {

    /* renamed from: a */
    C0584bh f4025a = new C0584bh(this);

    /* renamed from: b */
    C0584bh[] f4026b = new C0584bh[AbstractC0171m.f1232c];

    /* renamed from: a */
    public void m1923a(C0690ap apVar) {
        apVar.mo1125e("stats");
        apVar.mo1130c(0);
        int i = AbstractC0171m.f1230a;
        apVar.mo1095a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f4026b[i2].m1921a(apVar);
        }
        apVar.mo1093a("stats");
    }

    /* renamed from: a */
    public void m1922a(C0707k kVar, boolean z) {
        kVar.m1068b("stats");
        kVar.m1065d();
        int f = kVar.m1062f();
        this.f4026b = new C0584bh[AbstractC0171m.f1232c];
        for (int i = 0; i < f; i++) {
            this.f4026b[i] = new C0584bh(this);
            this.f4026b[i].m1920a(kVar);
        }
        kVar.m1064d("stats");
    }

    /* renamed from: a */
    public void m1927a() {
        this.f4025a = new C0584bh(this);
        this.f4026b = new C0584bh[AbstractC0171m.f1232c];
        for (int i = 0; i < this.f4026b.length; i++) {
            this.f4026b[i] = new C0584bh(this);
        }
    }

    /* renamed from: a */
    public C0584bh m1925a(AbstractC0210af afVar) {
        return m1926a(afVar.f1461bB);
    }

    /* renamed from: a */
    public C0584bh m1926a(AbstractC0171m mVar) {
        int i = mVar.f1239i;
        if (i < 0 || i >= this.f4026b.length) {
            return this.f4025a;
        }
        C0584bh bhVar = this.f4026b[i];
        if (bhVar == null) {
            return this.f4025a;
        }
        return bhVar;
    }

    /* renamed from: a */
    public void m1924a(AbstractC0210af afVar, AbstractC0210af afVar2, float f) {
        if (afVar != null) {
            boolean z = afVar2.f1459bz;
            C0584bh a = m1925a(afVar);
            C0584bh a2 = m1925a(afVar2);
            if (z) {
                if (afVar2.mo2643bw()) {
                    a.f4030d++;
                    a2.f4033g++;
                } else if (afVar2.mo2520cL()) {
                    a.f4031e++;
                    a2.f4034h++;
                } else {
                    a.f4029c++;
                    a2.f4032f++;
                }
            }
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        if (afVar2.f1461bB == u.f5493bb) {
            u.m722a(afVar2, f);
        }
    }
}
