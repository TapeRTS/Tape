package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class SeaFactory extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3548a = null;

    /* renamed from: b */
    static C0934e f3549b = null;

    /* renamed from: c */
    static C0934e f3550c = null;

    /* renamed from: d */
    static C0934e[] f3551d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3552e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3553f = null;

    /* renamed from: g */
    static final C0208c f3554g = C0208c.m5800a(String.valueOf(110));

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3548a = m1234A.f6107bO.mo930a(C0067R.drawable.sea_factory);
        f3549b = m1234A.f6107bO.mo930a(C0067R.drawable.sea_factory_t2);
        f3553f = m1234A.f6107bO.mo930a(C0067R.drawable.sea_factory_dead);
        f3551d = AbstractC0197n.m5902a(f3548a);
        f3552e = AbstractC0197n.m5902a(f3549b);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo7017r() {
        return UnitType.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3870K() {
        this.f3420m = null;
        this.f3880L = f3553f;
        m472S(0);
        this.f1605bS = false;
        m3200a(EnumC0233ab.f1504d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3553f;
        }
        if (this.f1608bV == null) {
            return f3551d[f3551d.length - 1];
        }
        if (this.f3425r == 1) {
            return f3551d[this.f1608bV.m5925O()];
        }
        return f3552e[this.f1608bV.m5925O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return null;
    }

    public SeaFactory(boolean z) {
        super(z);
        this.f3880L = f3548a;
        m2873b(f3548a);
        this.f1620ch = 45.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        m472S(2);
        this.f3421n.m6705a(-1, -1, 1, 2);
        this.f3422o.m6705a(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3868a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3554g)) {
            mo3207a(2);
            m3223W();
            return;
        }
        super.mo3868a(c0499j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i
    /* renamed from: ds */
    public int mo3862ds() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3224V() {
        return this.f3425r;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
        if (i == 1) {
            this.f3425r = 1;
        } else if (i == 2 && this.f3425r == 1) {
            this.f3425r = 2;
        }
        mo3227S();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3863cl() {
        if (this.f3425r == 1) {
            return f3554g;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m3867a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0513u());
        arrayList.add(new C0217l(UnitType.builderShip, 1));
        arrayList.add(new C0217l(UnitType.gunBoat, 2));
        arrayList.add(new C0217l(UnitType.missileShip, 3));
        arrayList.add(new C0217l(UnitType.hovercraft, 4));
        arrayList.add(new C0217l(UnitType.battleShip, 5));
        arrayList.add(new C0217l(UnitType.attackSubmarine, 6));
        if (i > 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3869N() {
        return mo7017r().mo4404a(mo3224V());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bJ */
    public boolean mo3865bJ() {
        return true;
    }
}
