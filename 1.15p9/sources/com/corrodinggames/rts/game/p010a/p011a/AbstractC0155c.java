package com.corrodinggames.rts.game.p010a.p011a;

import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/c.class */
public abstract class AbstractC0155c extends AbstractC0150a {

    /* renamed from: a */
    C1112u f639a = new C1112u();

    /* renamed from: c */
    public abstract boolean mo6038c(C0136a c0136a, AbstractC0623y abstractC0623y);

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo6043a(C0876k c0876k) {
        super.mo6043a(c0876k);
        int m1448f = c0876k.m1448f();
        for (int i = 0; i < m1448f; i++) {
            AbstractC0623y m1438p = c0876k.m1438p();
            if (m1438p != null) {
                this.f639a.mo513a(m1438p);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo6044a(C0859ar c0859ar) {
        super.mo6044a(c0859ar);
        c0859ar.mo1481a(this.f639a.size());
        Iterator it = this.f639a.iterator();
        while (it.hasNext()) {
            c0859ar.m1566a((AbstractC0623y) it.next());
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo6045a(C0136a c0136a, AbstractC0623y abstractC0623y) {
        if (mo6038c(c0136a, abstractC0623y) && !this.f639a.contains(abstractC0623y)) {
            this.f639a.mo513a(abstractC0623y);
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo6042b(C0136a c0136a, AbstractC0623y abstractC0623y) {
    }
}
