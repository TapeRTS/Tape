package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class LandFactory extends AbstractC0498i {

    /* renamed from: g */
    boolean f3500g;

    /* renamed from: a */
    static C0934e f3501a = null;

    /* renamed from: b */
    static C0934e f3502b = null;

    /* renamed from: c */
    static C0934e f3503c = null;

    /* renamed from: d */
    static C0934e[] f3504d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3505e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3506f = null;

    /* renamed from: h */
    static final C0208c f3507h = C0208c.m5800a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3500g);
        c0859ar.m1554c(0);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            mo3207a(2);
        }
        c0876k.m1457d();
        super.mo2872a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3501a = m1234A.f6107bO.mo930a(C0067R.drawable.land_factory_front);
        f3502b = m1234A.f6107bO.mo930a(C0067R.drawable.land_factory_front_t2);
        f3503c = m1234A.f6107bO.mo930a(C0067R.drawable.land_factory_back);
        f3506f = m1234A.f6107bO.mo930a(C0067R.drawable.land_factory_dead);
        f3504d = AbstractC0197n.m5902a(f3501a);
        f3505e = AbstractC0197n.m5902a(f3502b);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo7017r() {
        return UnitType.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3870K() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2558a(this.f6951ek, this.f6952el, this.f6953em);
        this.f3420m = null;
        this.f3880L = f3506f;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3227S() {
        super.mo3227S();
        if (this.f1606bT) {
            this.f3420m = null;
        } else {
            this.f3420m = f3503c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3506f;
        }
        if (this.f1608bV == null) {
            return f3504d[f3504d.length - 1];
        }
        if (!this.f3500g) {
            return f3504d[this.f1608bV.m5925O()];
        }
        return f3505e[this.f1608bV.m5925O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return null;
    }

    public LandFactory(boolean z) {
        super(z);
        this.f3880L = f3501a;
        this.f3420m = f3503c;
        m2873b(this.f3880L);
        this.f1620ch = 30.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1200.0f;
        this.f1631cs = this.f1632ct;
        m472S(3);
        this.f3421n.m6705a(-1, -1, 1, 1);
        this.f3422o.m6705a(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3868a(C0499j c0499j) {
        if (f3507h.m5803a(c0499j.f3491j)) {
            mo3207a(2);
            m3223W();
            return;
        }
        super.mo3868a(c0499j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
        if (i == 1) {
            this.f3500g = false;
        } else if (i == 2 && !this.f3500g) {
            this.f3500g = true;
        }
        mo3227S();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3863cl() {
        if (!this.f3500g) {
            return f3507h;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m3953a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0503n());
        }
        arrayList.add(new C0217l(UnitType.builder, 1));
        arrayList.add(new C0217l(UnitType.tank, 2));
        arrayList.add(new C0217l(UnitType.hoverTank, 3));
        arrayList.add(new C0217l(UnitType.artillery, 4));
        if (i >= 2) {
            arrayList.add(new C0217l(UnitType.hovercraft, 5));
            arrayList.add(new C0217l(UnitType.heavyTank, 6));
            arrayList.add(new C0217l(UnitType.heavyHoverTank, 7));
            arrayList.add(new C0217l(UnitType.laserTank, 8));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3869N() {
        return mo7017r().mo4404a(mo3224V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3224V() {
        if (this.f3500g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i
    /* renamed from: dr */
    public C0500k mo3949dr() {
        return new C0504o(this);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bJ */
    public boolean mo3865bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public float mo3950cZ() {
        return super.mo3950cZ() - 8.0f;
    }
}
