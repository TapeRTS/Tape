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
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class C0427r extends AbstractC0413h {

    /* renamed from: a */
    static C0748e f3089a = null;

    /* renamed from: b */
    static C0748e f3090b = null;

    /* renamed from: c */
    static C0748e f3091c = null;

    /* renamed from: d */
    static C0748e[] f3092d = new C0748e[10];

    /* renamed from: e */
    static C0748e[] f3093e = new C0748e[10];

    /* renamed from: f */
    static C0748e f3094f = null;

    /* renamed from: g */
    static AbstractC0197s f3095g = new AbstractC0201w(110) { // from class: com.corrodinggames.rts.game.units.d.r.1
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
            return EnumC0215ak.seaFactory.mo3264c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0427r rVar = (C0427r) afVar;
            if (rVar.f2969r != 1 || rVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            if (((C0427r) afVar).f2969r != 1) {
                return false;
            }
            return true;
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

    /* renamed from: b */
    public static void m2555b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3089a = u.f5514bw.mo194a(C0063R.drawable.sea_factory);
        f3090b = u.f5514bw.mo194a(C0063R.drawable.sea_factory_t2);
        f3094f = u.f5514bw.mo194a(C0063R.drawable.sea_factory_dead);
        f3092d = AbstractC0171m.m3501a(f3089a);
        f3093e = AbstractC0171m.m3501a(f3090b);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        this.f2964m = null;
        this.f3387D = f3094f;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3094f;
        }
        if (this.f1461bB == null) {
            return f3092d[f3092d.length - 1];
        }
        if (this.f2969r == 1) {
            return f3092d[this.f1461bB.m3518M()];
        }
        return f3093e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0427r(boolean z) {
        super(z);
        this.f3387D = f3089a;
        m2035b(f3089a);
        this.f1474bO = 45.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 1000.0f;
        this.f1484bY = this.f1485bZ;
        m406R(2);
        this.f2965n.m4136a(-1, -1, 1, 2);
        this.f2966o.m4136a(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3095g.m3387J())) {
            mo2310a(2);
            m2328U();
            return;
        }
        super.mo2548a(iVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h
    /* renamed from: db */
    public int mo2552db() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: T */
    public int mo2329T() {
        return this.f2969r;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        if (i == 1) {
            this.f2969r = 1;
        } else if (i == 2 && this.f2969r == 1) {
            this.f2969r = 2;
        }
        mo2332Q();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f2969r == 1) {
            return f3095g.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    /* renamed from: a */
    public static void m2556a(ArrayList arrayList, int i) {
        arrayList.add(new C0193o());
        arrayList.add(f3095g);
        arrayList.add(new C0190l(EnumC0215ak.builderShip, 1));
        arrayList.add(new C0190l(EnumC0215ak.gunBoat, 2));
        arrayList.add(new C0190l(EnumC0215ak.missileShip, 3));
        arrayList.add(new C0190l(EnumC0215ak.hovercraft, 4));
        arrayList.add(new C0190l(EnumC0215ak.battleShip, 5));
        arrayList.add(new C0190l(EnumC0215ak.attackSubmarine, 6));
        if (i > 1) {
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
