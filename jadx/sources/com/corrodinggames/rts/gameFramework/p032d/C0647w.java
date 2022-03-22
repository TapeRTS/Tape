package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.gameFramework.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/w.class */
public class C0647w {

    /* renamed from: a */
    static C0835m f4541a = new C0835m();

    /* renamed from: b */
    static final C0638t f4542b = new C0638t();

    /* renamed from: a */
    public static C0648x m1647a(long j) {
        Object[] a = f4541a.m490a();
        for (int i = f4541a.f5778a - 1; i >= 0; i--) {
            C0648x xVar = (C0648x) a[i];
            if (xVar.f4543a == j) {
                return xVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0648x m1646a(AbstractC0210af afVar) {
        C0648x a = m1647a(afVar.f5835dA);
        if (a == null) {
            a = new C0648x();
            a.f4543a = afVar.f5835dA;
            a.f4544b = afVar.f1458cg;
            a.f4545c = afVar.f1459ch;
            a.f4546d = AbstractC0789l.m651u().f5486bF.f4740R;
            f4541a.add(a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m1645a(AbstractC0210af afVar, C0363g gVar) {
        if (AbstractC0789l.m651u().f5486bF.f4734z) {
            C0648x a = m1646a(afVar);
            a.f4544b += gVar.f2427f;
            a.f4545c = gVar.m3131c(a.f4545c);
            if (!gVar.f2432k.m3201b()) {
                a.f4547e = C0354d.m3195b(a.f4547e, gVar.f2432k);
            }
        }
    }

    /* renamed from: b */
    public static void m1642b(AbstractC0210af afVar, C0363g gVar) {
        if (AbstractC0789l.m651u().f5486bF.f4734z) {
            C0648x a = m1646a(afVar);
            a.f4544b -= gVar.f2427f;
            a.f4545c = gVar.m3131c(a.f4545c);
            if (!gVar.f2432k.m3201b()) {
                a.f4547e = C0354d.m3206a(a.f4547e, gVar.f2432k);
            }
            if (f4541a.f5778a > 0) {
                AbstractC0789l.m683d("LagHiding: fake refund of: " + gVar.m3140a(false, true, 5, true) + " setFlags: " + gVar.f2428g);
            }
        }
    }

    /* renamed from: c */
    public static boolean m1641c(AbstractC0210af afVar, C0363g gVar) {
        C0648x a = m1647a(afVar.f5835dA);
        if (a == null) {
            return gVar.m3135b(afVar, false);
        }
        f4542b.f1441bB = afVar.f1441bB;
        f4542b.f1458cg = a.f4544b;
        f4542b.f1459ch = a.f4545c;
        f4542b.m1664a(a.f4547e);
        return gVar.m3135b((AbstractC0210af) f4542b, false);
    }

    /* renamed from: a */
    public static boolean m1644a(LogicBoolean logicBoolean, C0367k kVar) {
        C0648x a = m1647a(kVar.f5835dA);
        if (a == null) {
            return logicBoolean.read(kVar);
        }
        int i = kVar.f1458cg;
        int i2 = kVar.f1459ch;
        kVar.f1458cg = a.f4544b;
        kVar.f1459ch = a.f4545c;
        boolean read = logicBoolean.read(kVar);
        kVar.f1458cg = i;
        kVar.f1459ch = i2;
        return read;
    }

    /* renamed from: a */
    public static void m1648a() {
        if (f4541a.f5778a > 0) {
            AbstractC0789l.m683d("LagHiding: clearing: " + f4541a.f5778a);
        }
        f4541a.clear();
    }

    /* renamed from: a */
    public static void m1643a(AbstractC0515r rVar, AbstractC0197s sVar) {
        if (f4541a.size() != 0) {
            int i = AbstractC0789l.m651u().f5486bF.f4740R;
            for (int size = f4541a.size() - 1; size >= 0; size--) {
                C0648x xVar = (C0648x) f4541a.get(size);
                if (xVar.f4543a == rVar.f5835dA) {
                    f4541a.remove(size);
                    return;
                } else if (xVar.f4546d < i + 80) {
                    f4541a.remove(size);
                    return;
                }
            }
        }
    }
}
