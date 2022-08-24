package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.AbstractC0429a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/c.class */
public class C0436c {

    /* renamed from: a */
    public final C1101m f2770a = new C1101m();

    /* renamed from: a */
    public void m5134a(C0428a c0428a) {
        if (!this.f2770a.contains(c0428a)) {
            this.f2770a.add(c0428a);
        }
    }

    /* renamed from: a */
    public void m5132a(C0439f c0439f, Unit unit, double d) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m559a[i2];
            if (c0438e.f2798a.mo5140a(unit) < c0438e.f2799b * d) {
                m5134a(c0438e.f2798a);
            }
        }
    }

    /* renamed from: a */
    public void m5135a(C0424b c0424b, Unit unit, double d) {
        if (!c0424b.f2707k.m5100c()) {
            m5132a(c0424b.f2707k, unit, d);
        }
        if (c0424b.f2698b > 0 && unit.team.f1309o < c0424b.f2698b * d) {
            m5134a(AbstractC0429a.f2761B);
        }
    }

    /* renamed from: a */
    public boolean m5133a(C0439f c0439f) {
        int i = c0439f.f2801b.f6888a;
        Object[] m559a = c0439f.f2801b.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2770a.contains(((C0438e) m559a[i2]).f2798a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5136a(C0424b c0424b) {
        if (c0424b.f2698b > 0 && this.f2770a.contains(AbstractC0429a.f2761B)) {
            return true;
        }
        if (!c0424b.f2707k.m5100c() && m5133a(c0424b.f2707k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m5137a() {
        this.f2770a.clear();
    }
}
