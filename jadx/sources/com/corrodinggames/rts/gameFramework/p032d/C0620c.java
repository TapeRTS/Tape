package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
class C0620c {

    /* renamed from: a */
    AbstractC0210af f4264a;

    /* renamed from: b */
    AbstractC0197s f4265b;

    /* renamed from: c */
    float f4266c;

    /* renamed from: d */
    boolean f4267d;

    /* renamed from: e */
    boolean f4268e;

    /* renamed from: f */
    static C0835m f4269f = new C0835m();

    C0620c() {
    }

    /* renamed from: a */
    public static void m1768a(AbstractC0210af afVar, AbstractC0197s sVar, boolean z, boolean z2) {
        C0620c a = m1769a(afVar, sVar, z2);
        if (a == null) {
            a = new C0620c();
            f4269f.add(a);
        }
        a.f4264a = afVar;
        a.f4265b = sVar;
        a.f4266c = 10.0f;
        a.f4267d = z;
        a.f4268e = z2;
    }

    /* renamed from: a */
    public static C0620c m1769a(AbstractC0210af afVar, AbstractC0197s sVar, boolean z) {
        Iterator it = f4269f.iterator();
        while (it.hasNext()) {
            C0620c cVar = (C0620c) it.next();
            if (cVar.f4264a == afVar && cVar.f4265b == sVar && cVar.f4268e == z) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static float m1767b(AbstractC0210af afVar, AbstractC0197s sVar, boolean z) {
        C0620c a = m1769a(afVar, sVar, z);
        if (a == null) {
            return 0.0f;
        }
        float f = a.f4266c / 10.0f;
        if (a.f4267d) {
            f = -f;
        }
        return f;
    }

    /* renamed from: a */
    public static void m1770a(float f) {
        for (int size = f4269f.size() - 1; size >= 0; size--) {
            C0620c cVar = (C0620c) f4269f.get(size);
            cVar.f4266c -= f;
            if (cVar.f4266c <= 0.0f) {
                f4269f.remove(size);
            }
        }
    }
}
