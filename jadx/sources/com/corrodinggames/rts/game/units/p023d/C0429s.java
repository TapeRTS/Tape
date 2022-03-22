package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class C0429s extends AbstractC0413h {

    /* renamed from: f */
    int f3101f = 1;

    /* renamed from: g */
    float f3102g = 0.0f;

    /* renamed from: h */
    int f3103h = 0;

    /* renamed from: a */
    static C0748e f3096a = null;

    /* renamed from: b */
    static C0748e f3097b = null;

    /* renamed from: c */
    static C0748e[] f3098c = new C0748e[10];

    /* renamed from: d */
    static C0748e[] f3099d = new C0748e[10];

    /* renamed from: e */
    static C0748e f3100e = null;

    /* renamed from: i */
    public static int f3104i = 0;

    /* renamed from: j */
    static AbstractC0197s f3105j = new AbstractC0201w(102) { // from class: com.corrodinggames.rts.game.units.d.s.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return C0652a.m1536a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return C0652a.m1536a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0429s sVar = (C0429s) afVar;
            if (sVar.f3101f != 1 || sVar.mo2589a(m3387J(), z) > 0) {
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

    /* renamed from: k */
    static ArrayList f3106k = new ArrayList();

    static {
        f3106k.add(f3105j);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f3101f);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        mo2310a(kVar.m1062f());
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.supplyDepot;
    }

    /* renamed from: c */
    public static void m2545c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3096a = u.f5514bw.mo194a(C0063R.drawable.supply_depot);
        f3097b = u.f5514bw.mo194a(C0063R.drawable.supply_depot_t2);
        f3098c = AbstractC0171m.m3501a(f3096a);
        f3099d = AbstractC0171m.m3501a(f3097b);
        f3100e = u.f5514bw.mo194a(C0063R.drawable.supply_depot_dead);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2015a(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3100e;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3577o, 0.8f, this.f5842dH, this.f5843dI);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3100e;
        }
        if (this.f1461bB == null) {
            return f3098c[f3098c.length - 1];
        }
        if (this.f3101f == 1) {
            return f3098c[this.f1461bB.m3518M()];
        }
        return f3099d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    public C0429s(boolean z) {
        super(z);
        this.f3387D = f3096a;
        m2036a(this.f3387D, 1);
        this.f1474bO = 20.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 800.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-1, -1, 0, 0);
        this.f2966o.m4135a(this.f2965n);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f3105j.m3387J())) {
            m2549L();
            m2328U();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        this.f3101f = i;
    }

    /* renamed from: L */
    public void m2549L() {
        if (this.f3101f == 1) {
            this.f3101f = 2;
            mo2332Q();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (this.f3101f == 1) {
            return f3105j.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3106k;
    }
}
