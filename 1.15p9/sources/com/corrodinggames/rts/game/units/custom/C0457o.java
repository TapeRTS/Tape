package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/o.class */
public class C0457o {

    /* renamed from: a */
    String f3321a;

    /* renamed from: b */
    C0441f f3322b;

    /* renamed from: c */
    final /* synthetic */ C0453l f3323c;

    public C0457o(C0453l c0453l) {
        this.f3323c = c0453l;
    }

    /* renamed from: a */
    public void m4072a() {
        if (this.f3321a != null && m4071b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.f3321a);
        }
    }

    /* renamed from: b */
    public C0441f m4071b() {
        if (this.f3321a == null) {
            return null;
        }
        if (this.f3322b != null) {
            return this.f3322b;
        }
        Iterator it = this.f3323c.f3245dm.iterator();
        while (it.hasNext()) {
            C0441f c0441f = (C0441f) it.next();
            if (c0441f.f2804a.equalsIgnoreCase(this.f3321a)) {
                this.f3322b = c0441f;
                return c0441f;
            }
        }
        return null;
    }
}
