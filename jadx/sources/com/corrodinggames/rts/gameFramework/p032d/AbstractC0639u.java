package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/u.class */
abstract class AbstractC0639u {

    /* renamed from: a */
    static AbstractC0639u f4526a = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.1
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (!rVar.mo2245ah() || rVar.mo1607o_() || !rVar.m2238ao()) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: b */
    static AbstractC0639u f4527b = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.2
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (!rVar.mo2245ah() || rVar.mo1607o_()) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: c */
    static AbstractC0639u f4528c = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.3
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (rVar.mo1606r() == EnumC0215ak.extractor) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d */
    static AbstractC0639u f4529d = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.4
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (rVar.mo1606r() != EnumC0215ak.fabricator || rVar.mo2329T() >= 3) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: e */
    static AbstractC0639u f4530e = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.5
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (rVar.mo1606r() == EnumC0215ak.landFactory) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: f */
    static AbstractC0639u f4531f = new AbstractC0639u() { // from class: com.corrodinggames.rts.gameFramework.d.u.6
        @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0639u
        /* renamed from: a */
        public boolean mo1602a(AbstractC0515r rVar) {
            if (rVar.mo1606r() == EnumC0215ak.airFactory) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a */
    public abstract boolean mo1602a(AbstractC0515r rVar);

    AbstractC0639u() {
    }

    /* renamed from: a */
    public static void m1603a(ArrayList arrayList, AbstractC0639u uVar, AbstractC0639u uVar2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5518bA.m1659p() != 1) {
            arrayList.clear();
        }
        AbstractC0515r r = u.f5518bA.m1655r();
        if (r != null) {
            if (!uVar.mo1602a(r) && (uVar2 == null || !uVar2.mo1602a(r))) {
                arrayList.clear();
            } else if (!arrayList.contains(r)) {
                arrayList.add(r);
            }
        }
        AbstractC0515r a = m1604a(arrayList, uVar);
        if (a == null && uVar2 != null) {
            a = m1604a(arrayList, uVar2);
        }
        if (a == null) {
            arrayList.clear();
            if (r != null) {
                arrayList.add(r);
            }
            a = m1604a(arrayList, uVar);
            if (a == null && uVar2 != null) {
                a = m1604a(arrayList, uVar2);
            }
        }
        if (a != null) {
            u.f5518bA.m1649w();
            u.f5518bA.m1670j(a);
            u.m688b(a.f5842dH, a.f5843dI);
            arrayList.add(a);
        }
    }

    /* renamed from: a */
    public static AbstractC0515r m1604a(ArrayList arrayList, AbstractC0639u uVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r rVar = null;
        float f = -1.0f;
        Iterator it = AbstractC0210af.f1442bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) afVar;
                if (u.f5518bA.m1664m(rVar2) && uVar.mo1602a(rVar2) && !arrayList.contains(rVar2)) {
                    float a = C0654f.m1520a(u.f5549cf + u.f5559cp, u.f5550cg + u.f5560cq, rVar2.f5842dH, rVar2.f5843dI);
                    if (rVar == null || a < f) {
                        f = a;
                        rVar = rVar2;
                    }
                }
            }
        }
        return rVar;
    }
}
