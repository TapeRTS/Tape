package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class AirFactory extends AbstractC0498i {

    /* renamed from: f */
    int f3357f;

    /* renamed from: g */
    float f3358g;

    /* renamed from: a */
    static C0934e f3359a = null;

    /* renamed from: b */
    static C0934e f3360b = null;

    /* renamed from: c */
    static C0934e[] f3361c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3362d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3363e = null;

    /* renamed from: h */
    static final C0208c f3364h = C0208c.m5800a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3357f);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        if (c0876k.m1463b() >= 17) {
            mo3207a(c0876k.m1454f());
        }
        super.mo2872a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3359a = m1234A.f6107bO.mo930a(C0067R.drawable.air_factory);
        f3360b = m1234A.f6107bO.mo930a(C0067R.drawable.air_factory_t2);
        f3363e = m1234A.f6107bO.mo930a(C0067R.drawable.air_factory_dead);
        f3361c = AbstractC0197n.m5902a(f3359a);
        f3362d = AbstractC0197n.m5902a(f3360b);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo7017r() {
        return UnitType.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3870K() {
        this.f3880L = f3363e;
        m472S(0);
        this.f1605bS = false;
        m3200a(EnumC0233ab.f1504d);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3363e;
        }
        if (this.f1608bV == null) {
            return f3361c[f3361c.length - 1];
        }
        if (this.f3357f == 1) {
            return f3361c[this.f1608bV.m5925O()];
        }
        return f3362d[this.f1608bV.m5925O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return null;
    }

    public AirFactory(boolean z) {
        super(z);
        this.f3357f = 1;
        this.f3358g = 0.0f;
        this.f3880L = f3359a;
        m2879T(40);
        m2878U(61);
        this.f1620ch = 30.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6705a(-1, -1, 1, 1);
        this.f3422o.m6705a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3274a(float f) {
        super.mo3274a(f);
        if (!m5390bS() || this.f1606bT) {
            return;
        }
        this.f3358g = C0758f.m2363a(this.f3358g, f);
        if (this.f3358g == 0.0f) {
            this.f3358g = 27.0f;
            this.f3426s++;
            if (this.f3426s > 4) {
                this.f3426s = 0;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3868a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3364h)) {
            mo3207a(2);
            m3223W();
            return;
        }
        super.mo3868a(c0499j);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3224V() {
        return this.f3357f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
        if (i == 1) {
            this.f3357f = 1;
        } else if (i == 2 && this.f3357f == 1) {
            this.f3357f = 2;
        }
        mo3227S();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3863cl() {
        if (this.f3357f == 1) {
            return f3364h;
        }
        return Action.f1461i;
    }

    /* renamed from: a */
    public static void m4304a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0484b());
        }
        if (i > 1) {
            arrayList.add(new C0217l(UnitType.dropship, 3));
            arrayList.add(new C0217l(UnitType.gunShip, 4));
            arrayList.add(new C0217l(UnitType.amphibiousJet, 5));
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
