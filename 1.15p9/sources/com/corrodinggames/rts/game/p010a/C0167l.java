package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/l.class */
public class C0167l extends AbstractC0163h {

    /* renamed from: a */
    float f738a;

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f686F.size());
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            c0859ar.m1572a((AbstractC0623y) it.next());
        }
        c0859ar.m1554c(1);
        c0859ar.mo1487a(this.f687G.size());
        Iterator it2 = this.f687G.iterator();
        while (it2.hasNext()) {
            c0859ar.m1572a((AbstractC0623y) it2.next());
        }
        c0859ar.mo1488a(this.f738a);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void m6685a(C0876k c0876k) {
        m6738q();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            AbstractC0623y m1444p = c0876k.m1444p();
            if (m1444p != null) {
                m6748a(m1444p);
            }
        }
        if (c0876k.m1457d() >= 1) {
            this.f687G.clear();
            int m1454f2 = c0876k.m1454f();
            for (int i2 = 0; i2 < m1454f2; i2++) {
                AbstractC0623y m1444p2 = c0876k.m1444p();
                if (m1444p2 != null) {
                    this.f687G.add(m1444p2);
                }
            }
            this.f738a = c0876k.m1453g();
        }
        super.m6672a(c0876k);
    }

    public C0167l(C0136a c0136a) {
        super(c0136a);
        this.f738a = 0.0f;
    }

    /* renamed from: c */
    public void m6684c(float f) {
        m6741n();
        if (!m6742m()) {
            this.f738a += f;
        }
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (m6669c((Unit) abstractC0623y) < 3600.0f && abstractC0623y.f1650cL == null) {
                if (abstractC0623y.f3942aA == this) {
                    abstractC0623y.f3942aA = null;
                }
                it.remove();
            }
        }
        if (this.f686F.size() == 0 || this.f738a > 5000.0f) {
            m6739p();
        }
    }

    /* renamed from: c */
    public void m6683c(AbstractC0623y abstractC0623y) {
        m6748a(abstractC0623y);
        this.f687G.add(abstractC0623y);
    }
}
