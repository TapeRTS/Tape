package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class C0516w extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3566a = null;

    /* renamed from: b */
    static C0934e[] f3567b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3568c = null;

    /* renamed from: b */
    public static void m3661b() {
        GameEngine m1234A = GameEngine.m1234A();
        f3566a = m1234A.f6107bO.mo930a(C0067R.drawable.wall_v);
        f3568c = m1234A.f6107bO.mo930a(C0067R.drawable.wall_v);
        f3567b = AbstractC0197n.m5244a(f3566a);
    }

    /* renamed from: d */
    public C0934e m3659d() {
        if (this.f1606bT) {
            return f3568c;
        }
        if (this.f1608bV == null) {
            return f3567b[f3567b.length - 1];
        }
        return f3567b[this.f1608bV.m5267O()];
    }

    /* renamed from: k */
    public C0934e m3658k() {
        return null;
    }

    /* renamed from: a */
    public void m3662a(int i) {
    }

    public C0516w(boolean z) {
        super(z);
        m2873b(f3566a);
        this.f1620ch = 15.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 700.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3566a;
        this.f3421n.m6053a(0, 0, 1, 0);
        this.f3422o.m6053a(0, 0, 1, 0);
    }

    /* renamed from: c */
    public UnitType m3657r() {
        return UnitType.wall_v;
    }
}
