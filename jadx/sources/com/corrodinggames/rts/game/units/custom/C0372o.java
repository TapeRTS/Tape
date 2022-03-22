package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/o.class */
public class C0372o {

    /* renamed from: a */
    String f2866a;

    /* renamed from: b */
    C0362f f2867b;

    /* renamed from: c */
    final /* synthetic */ C0368l f2868c;

    public C0372o(C0368l lVar) {
        this.f2868c = lVar;
    }

    /* renamed from: a */
    public void m2726a() {
        if (this.f2866a != null && m2725b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.f2866a);
        }
    }

    /* renamed from: b */
    public C0362f m2725b() {
        if (this.f2866a == null) {
            return null;
        }
        if (this.f2867b != null) {
            return this.f2867b;
        }
        Iterator it = this.f2868c.f2694dd.iterator();
        while (it.hasNext()) {
            C0362f fVar = (C0362f) it.next();
            if (fVar.f2405a.equalsIgnoreCase(this.f2866a)) {
                this.f2867b = fVar;
                return fVar;
            }
        }
        return null;
    }
}
