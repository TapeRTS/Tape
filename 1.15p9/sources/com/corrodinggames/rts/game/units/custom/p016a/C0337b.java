package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.C0206a;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/b.class */
public class C0337b extends C0206a {

    /* renamed from: b */
    public C0206a f2032b;

    /* renamed from: c */
    public C0424b f2033c;

    /* renamed from: d */
    public C0424b f2034d;

    public C0337b(C0206a c0206a) {
        this.f2032b = c0206a;
    }

    /* renamed from: b */
    public boolean m5496b(Unit unit) {
        return this.f2032b.m6287b(unit);
    }

    /* renamed from: c */
    public String m5495c(Unit unit) {
        return this.f2032b.m6286c(unit);
    }

    /* renamed from: a */
    public boolean m5498a(Unit unit, boolean z) {
        return this.f2032b.m6289a(unit, z);
    }

    /* renamed from: d */
    public boolean m5494d(Unit unit) {
        return this.f2032b.m6285d(unit);
    }

    /* renamed from: a */
    public C0424b m5500a() {
        if (this.f2033c != null) {
            return this.f2033c;
        }
        return this.f2032b.m6292a();
    }

    /* renamed from: b */
    public C0424b m5497b() {
        if (this.f2034d != null) {
            return this.f2034d;
        }
        return this.f2032b.m6288b();
    }

    /* renamed from: a */
    public void m5499a(Unit unit, Unit unit2) {
        this.f2032b.m6290a(unit, unit2);
    }
}
