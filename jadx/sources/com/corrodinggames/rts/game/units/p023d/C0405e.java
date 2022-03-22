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
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class C0405e extends AbstractC0413h {

    /* renamed from: f */
    boolean f2988f;

    /* renamed from: a */
    static C0748e f2983a = null;

    /* renamed from: b */
    static C0748e f2984b = null;

    /* renamed from: c */
    static C0748e[] f2985c = new C0748e[10];

    /* renamed from: d */
    static C0748e[] f2986d = new C0748e[10];

    /* renamed from: e */
    static C0748e f2987e = null;

    /* renamed from: g */
    static AbstractC0197s f2989g = new AbstractC0201w(110) { // from class: com.corrodinggames.rts.game.units.d.e.1
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
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0405e eVar = (C0405e) afVar;
            if (eVar.f2988f || eVar.mo2589a(m3387J(), z) > 0) {
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
        apVar.mo1090a(this.f2988f);
        apVar.mo1130c(0);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1063e()) {
            m2636L();
        }
        kVar.m1065d();
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public static void m2634b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2983a = u.f5514bw.mo194a(C0063R.drawable.experimental_unit_factory_front);
        f2984b = u.f5514bw.mo194a(C0063R.drawable.experimental_unit_factory_base);
        f2987e = u.f5514bw.mo194a(C0063R.drawable.experimental_unit_factory_dead);
        f2985c = AbstractC0171m.m3501a(f2983a);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.experimentalLandFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l.m638u();
        this.f2964m = null;
        this.f3387D = f2987e;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.verylargeBuilding);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f2987e;
        }
        if (this.f1461bB == null) {
            return f2985c[f2985c.length - 1];
        }
        if (!this.f2988f) {
            return f2985c[this.f1461bB.m3518M()];
        }
        return f2986d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: Q */
    public void mo2332Q() {
        super.mo2332Q();
        if (this.f1459bz) {
            this.f2964m = null;
        } else {
            this.f2964m = f2984b;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0405e(boolean z) {
        super(z);
        this.f3387D = f2983a;
        this.f2964m = f2984b;
        m2035b(this.f3387D);
        this.f1474bO = 55.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 3200.0f;
        this.f1484bY = this.f1485bZ;
        m406R(4);
        this.f2965n.m4136a(-2, -2, 2, 2);
        this.f2966o.m4136a(-2, -2, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f2989g.m3387J())) {
            m2636L();
        } else {
            super.mo2548a(iVar);
        }
    }

    /* renamed from: L */
    public void m2636L() {
        if (!this.f2988f) {
            this.f2988f = true;
            mo2332Q();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        return AbstractC0197s.f1356h;
    }

    /* renamed from: a */
    public static void m2635a(ArrayList arrayList, int i) {
        arrayList.add(new C0193o());
        arrayList.add(new C0190l(EnumC0215ak.experimentalTank, 2));
        arrayList.add(new C0190l(EnumC0215ak.experimentalHoverTank, 3));
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
