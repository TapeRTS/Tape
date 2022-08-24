package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class AbstractC0525h extends AbstractC0529j {

    /* renamed from: l */
    float f3628l;

    /* renamed from: m */
    public static C0934e f3629m = null;

    /* renamed from: n */
    public static C0934e[] f3630n = new C0934e[10];

    public AbstractC0525h(boolean z) {
        super(z);
    }

    /* renamed from: v */
    public C0934e m3607v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        if (mo3621db()) {
            return AbstractC0529j.f3646dM[this.f1608bV.m5267O()];
        }
        return f3630n[this.f1608bV.m5267O()];
    }

    /* renamed from: K */
    public static void m3609K() {
        f3629m = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.unit_icon_hover);
        f3630n = AbstractC0197n.m5244a(f3629m);
    }

    /* renamed from: h */
    public EnumC0246ao m3608h() {
        return EnumC0246ao.HOVER;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (m4759bS() && !this.f1606bT && m4748cJ()) {
            if (this.f1616cd > 0.0f) {
                this.f3628l += f;
            }
            if (this.f3628l > 10.0f) {
                this.f3628l = 0.0f;
                if (mo3021p_()) {
                    C0745e m2532b = GameEngine.m1234A().f6110bR.m2532b(this.f6951ek + (C0758f.m2244i(this.f1617ce) * 4.0f), this.f6952el + (C0758f.m2249h(this.f1617ce) * 4.0f), 0.0f, EnumC0744d.custom, false, EnumC0748h.low);
                    if (m2532b != null) {
                        m2532b.f4763aq = 0;
                        m2532b.f4762ap = 13;
                        m2532b.f4786ar = (short) 1;
                        m2532b.f4720s = true;
                        m2532b.f4728F = 0.8f;
                        m2532b.f4746X = 80.0f;
                        m2532b.f4745W = 80.0f;
                        m2532b.f4739Q = (-C0758f.m2244i(this.f1617ce)) * 0.1f;
                        m2532b.f4740R = (-C0758f.m2249h(this.f1617ce)) * 0.1f;
                        m2532b.f4747Y = C0758f.m2288c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
