package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0190l;
import com.corrodinggames.rts.game.units.p013a.C0193o;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/l.class */
public class C0417l extends AbstractC0413h {

    /* renamed from: g */
    boolean f3047g;

    /* renamed from: a */
    static C0748e f3041a = null;

    /* renamed from: b */
    static C0748e f3042b = null;

    /* renamed from: c */
    static C0748e f3043c = null;

    /* renamed from: d */
    static C0748e[] f3044d = new C0748e[10];

    /* renamed from: e */
    static C0748e[] f3045e = new C0748e[10];

    /* renamed from: f */
    static C0748e f3046f = null;

    /* renamed from: h */
    static AbstractC0197s f3048h = new AbstractC0201w(110) { // from class: com.corrodinggames.rts.game.units.d.l.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.landFactory.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("units.landFactory.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.landFactory.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0417l lVar = (C0417l) afVar;
            if (lVar.f3047g || lVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        /* renamed from: H */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.upgrade;
        }
    };

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1090a(this.f3047g);
        apVar.mo1130c(0);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1063e()) {
            mo2310a(2);
        }
        kVar.m1065d();
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public static void m2579b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3041a = u.f5514bw.mo194a(C0063R.drawable.land_factory_front);
        f3042b = u.f5514bw.mo194a(C0063R.drawable.land_factory_front_t2);
        f3043c = u.f5514bw.mo194a(C0063R.drawable.land_factory_back);
        f3046f = u.f5514bw.mo194a(C0063R.drawable.land_factory_dead);
        f3044d = AbstractC0171m.m3501a(f3041a);
        f3045e = AbstractC0171m.m3501a(f3042b);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2015a(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f2964m = null;
        this.f3387D = f3046f;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: Q */
    public void mo2332Q() {
        super.mo2332Q();
        if (this.f1459bz) {
            this.f2964m = null;
        } else {
            this.f2964m = f3043c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3046f;
        }
        if (this.f1461bB == null) {
            return f3044d[f3044d.length - 1];
        }
        if (!this.f3047g) {
            return f3044d[this.f1461bB.m3518M()];
        }
        return f3045e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0417l(boolean z) {
        super(z);
        this.f3387D = f3041a;
        this.f2964m = f3043c;
        m2035b(this.f3387D);
        this.f1474bO = 30.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 1200.0f;
        this.f1484bY = this.f1485bZ;
        m406R(3);
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4136a(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (f3048h.m3379d(iVar.f3031h)) {
            mo2310a(2);
            m2328U();
            return;
        }
        super.mo2548a(iVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        if (i == 1) {
            this.f3047g = false;
        } else if (i == 2 && !this.f3047g) {
            this.f3047g = true;
        }
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (!this.f3047g) {
            return f3048h.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    /* renamed from: a */
    public static void m2580a(ArrayList arrayList, int i) {
        arrayList.add(new C0193o());
        if (i == 1) {
            arrayList.add(f3048h);
        }
        arrayList.add(new C0190l(EnumC0215ak.builder, 1));
        arrayList.add(new C0190l(EnumC0215ak.tank, 2));
        arrayList.add(new C0190l(EnumC0215ak.hoverTank, 3));
        arrayList.add(new C0190l(EnumC0215ak.artillery, 4));
        if (i >= 2) {
            arrayList.add(new C0190l(EnumC0215ak.hovercraft, 5));
            arrayList.add(new C0190l(EnumC0215ak.heavyTank, 6));
            arrayList.add(new C0190l(EnumC0215ak.heavyHoverTank, 7));
            arrayList.add(new C0190l(EnumC0215ak.laserTank, 8));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return mo1606r().mo2798a(mo2329T());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        if (this.f3047g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h
    /* renamed from: da */
    public C0415j mo2577da() {
        return new C0419m(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bx */
    public boolean mo2554bx() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cJ */
    public float mo2570cJ() {
        return super.mo2570cJ() - 8.0f;
    }
}
