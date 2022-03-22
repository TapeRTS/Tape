package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0190l;
import com.corrodinggames.rts.game.units.p013a.C0193o;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class C0385a extends AbstractC0413h {

    /* renamed from: f */
    int f2906f = 1;

    /* renamed from: g */
    float f2907g = 0.0f;

    /* renamed from: a */
    static C0748e f2901a = null;

    /* renamed from: b */
    static C0748e f2902b = null;

    /* renamed from: c */
    static C0748e[] f2903c = new C0748e[10];

    /* renamed from: d */
    static C0748e[] f2904d = new C0748e[10];

    /* renamed from: e */
    static C0748e f2905e = null;

    /* renamed from: h */
    static AbstractC0197s f2908h = new AbstractC0201w(110) { // from class: com.corrodinggames.rts.game.units.d.a.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Allows factory to build Tech 2 units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return EnumC0215ak.airFactory.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0385a aVar = (C0385a) afVar;
            if (aVar.f2906f != 1 || aVar.mo2589a(m3387J(), z) > 0) {
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
        apVar.mo1095a(this.f2906f);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1071b() >= 17) {
            mo2310a(kVar.m1062f());
        }
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public static void m2705b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2901a = u.f5514bw.mo194a(C0063R.drawable.air_factory);
        f2902b = u.f5514bw.mo194a(C0063R.drawable.air_factory_t2);
        f2905e = u.f5514bw.mo194a(C0063R.drawable.air_factory_dead);
        f2903c = AbstractC0171m.m3501a(f2901a);
        f2904d = AbstractC0171m.m3501a(f2902b);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        this.f3387D = f2905e;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f2905e;
        }
        if (this.f1461bB == null) {
            return f2903c[f2903c.length - 1];
        }
        if (this.f2906f == 1) {
            return f2903c[this.f1461bB.m3518M()];
        }
        return f2904d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0385a(boolean z) {
        super(z);
        this.f3387D = f2901a;
        m2038S(40);
        m2037T(61);
        this.f1474bO = 30.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 1000.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4136a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f2907g = C0654f.m1522a(this.f2907g, f);
            if (this.f2907g == 0.0f) {
                this.f2907g = 27.0f;
                this.f2970s++;
                if (this.f2970s > 4) {
                    this.f2970s = 0;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f2908h.m3387J())) {
            mo2310a(2);
            m2328U();
            return;
        }
        super.mo2548a(iVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        return this.f2906f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        if (i == 1) {
            this.f2906f = 1;
        } else if (i == 2 && this.f2906f == 1) {
            this.f2906f = 2;
        }
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f2906f == 1) {
            return f2908h.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    /* renamed from: a */
    public static void m2706a(ArrayList arrayList, int i) {
        arrayList.add(new C0193o());
        if (i == 1) {
            arrayList.add(f2908h);
        }
        if (i > 1) {
            arrayList.add(new C0190l(EnumC0215ak.dropship, 3));
            arrayList.add(new C0190l(EnumC0215ak.gunShip, 4));
            arrayList.add(new C0190l(EnumC0215ak.amphibiousJet, 5));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return mo1606r().mo2798a(mo2329T());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bx */
    public boolean mo2554bx() {
        return true;
    }
}
