package com.corrodinggames.rts.game.units.p029h;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.h.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class AbstractC0590f extends AbstractC0621w {

    /* renamed from: m */
    float f3840m;

    /* renamed from: n */
    float f3841n;

    /* renamed from: o */
    boolean f3842o;

    /* renamed from: p */
    public static C0934e f3843p = null;

    /* renamed from: q */
    public static C0934e[] f3844q = new C0934e[10];

    public AbstractC0590f(boolean z) {
        super(z);
        this.f3842o = false;
    }

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3841n);
        c0859ar.mo1482a(this.f3842o);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3841n = c0876k.m1453g();
        this.f3842o = c0876k.m1455e();
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3844q[this.f1608bV.m5267O()];
    }

    /* renamed from: L */
    public static void m3386L() {
        f3843p = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.unit_icon_water);
        f3844q = AbstractC0197n.m5244a(f3843p);
    }

    /* renamed from: h */
    public EnumC0246ao m3383h() {
        return EnumC0246ao.WATER;
    }

    /* renamed from: ct */
    public boolean m3385ct() {
        return true;
    }

    /* renamed from: f */
    public boolean m3384f() {
        return true;
    }

    /* renamed from: s */
    public void m3382s(float f) {
        if (this.f6953em != 0.0f) {
            this.f6953em = C0758f.m2362a(this.f6953em, 0.0f, 0.2f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo4640a(float f) {
        super.mo4640a(f);
        if (this.f1606bT) {
            if (this.f6953em > -10.0f) {
                this.f3841n += 0.002f * f;
                this.f6953em -= this.f3841n * f;
                return;
            }
            this.f6953em = -10.0f;
            if (!this.f3842o) {
                this.f3842o = true;
            }
        } else if (!m4759bS() || this.f1606bT) {
        } else {
            m3382s(f);
            if (m3384f()) {
                if (this.f1616cd != 0.0f) {
                    this.f3840m += f;
                }
                if (this.f3840m > 10.0f) {
                    this.f3840m = 0.0f;
                    if (mo3021p_()) {
                        GameEngine m1234A = GameEngine.m1234A();
                        float f2 = this.f1617ce + 180.0f;
                        if (this.f1616cd < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.f1620ch - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        m1234A.f6110bR.m2536b(this.f6951ek + (C0758f.m2244i(f2) * f3), this.f6952el + (C0758f.m2249h(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
