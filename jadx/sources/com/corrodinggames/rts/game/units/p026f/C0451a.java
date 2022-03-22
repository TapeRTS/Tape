package com.corrodinggames.rts.game.units.p026f;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;

/* renamed from: com.corrodinggames.rts.game.units.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/a.class */
public class C0451a {

    /* renamed from: a */
    public final C0452b f3240a = new C0452b();

    /* renamed from: b */
    public final C0452b[] f3241b = new C0452b[AbstractC0171m.f1232c];

    /* renamed from: c */
    public final C0452b f3242c = new C0452b();

    /* renamed from: d */
    public final C0452b f3243d = new C0452b();

    /* renamed from: e */
    float f3244e;

    public C0451a() {
        for (int i = 0; i < this.f3241b.length; i++) {
            this.f3241b[i] = new C0452b();
        }
    }

    /* renamed from: a */
    public void m2467a(AbstractC0210af afVar) {
        this.f3240a.f3245a.add(afVar);
        if (afVar.f1527cP >= 0) {
            this.f3241b[afVar.f1527cP].f3245a.add(afVar);
        } else if (afVar.f1527cP == -1) {
            this.f3243d.f3245a.add(afVar);
        } else if (afVar.f1527cP == -2) {
            this.f3242c.f3245a.add(afVar);
        }
        if (afVar.f1474bO > this.f3244e) {
            this.f3244e = afVar.f1474bO;
        }
    }

    /* renamed from: b */
    public void m2466b(AbstractC0210af afVar) {
        this.f3240a.f3245a.remove(afVar);
        if (afVar.f1527cP >= 0) {
            this.f3241b[afVar.f1527cP].f3245a.remove(afVar);
        } else if (afVar.f1527cP == -1) {
            this.f3243d.f3245a.remove(afVar);
        } else if (afVar.f1527cP == -2) {
            this.f3242c.f3245a.remove(afVar);
        }
        if (this.f3240a.f3245a.f5806b == 0) {
            this.f3244e = 0.0f;
        }
    }
}
