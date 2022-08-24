package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public class C0450i {

    /* renamed from: a */
    public C1101m f2838a = new C1101m();

    public C0450i() {
    }

    public C0450i(C0449h c0449h) {
        if (c0449h == null) {
            return;
        }
        for (C0448g c0448g : c0449h.f2837a) {
            this.f2838a.add(c0448g);
        }
    }

    /* renamed from: a */
    public boolean m4401a(C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        boolean z = false;
        for (C0448g c0448g : c0449h.f2837a) {
            if (m4402a(c0448g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m4402a(C0448g c0448g) {
        if (!this.f2838a.contains(c0448g)) {
            this.f2838a.add(c0448g);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4400b(C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        boolean z = false;
        for (C0448g c0448g : c0449h.f2837a) {
            if (this.f2838a.remove(c0448g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C0449h m4403a() {
        if (this.f2838a.size() == 0) {
            return C0448g.f2836d;
        }
        return new C0449h((C0448g[]) this.f2838a.toArray(C0448g.f2835c));
    }
}
