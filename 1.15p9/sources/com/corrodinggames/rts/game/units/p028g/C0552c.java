package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.g.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/c.class */
public final class C0552c {
    /* renamed from: a */
    public static void m3736a(AbstractC0623y abstractC0623y, float f) {
        C1101m c1101m = abstractC0623y.f3989bo;
        if (c1101m == null) {
            return;
        }
        int i = GameEngine.getInstance().f6096by;
        Object[] m559a = c1101m.m559a();
        for (int i2 = c1101m.f6888a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m559a[i2];
            if (abstractC0547a.f3750a <= i) {
                c1101m.remove(i2);
            } else {
                abstractC0547a.m3738a(abstractC0623y, f);
            }
        }
    }

    /* renamed from: a */
    public static void m3735a(AbstractC0623y abstractC0623y, AbstractC0547a abstractC0547a) {
        if (abstractC0623y.f3989bo == null) {
            abstractC0623y.f3989bo = new C1101m();
        }
        if (abstractC0623y.f3989bo.size() > 1000) {
            abstractC0623y.m3183a("status effect limit reached");
        } else {
            abstractC0623y.f3989bo.add(abstractC0547a);
        }
    }

    /* renamed from: a */
    public static void m3734a(AbstractC0623y abstractC0623y, C0859ar c0859ar) {
        int size;
        C1101m c1101m = abstractC0623y.f3989bo;
        if (c1101m == null) {
            size = 0;
        } else {
            size = c1101m.size();
        }
        c0859ar.mo1483a((short) size);
        if (size == 0) {
            return;
        }
        c0859ar.m1549e("s");
        Object[] m559a = c1101m.m559a();
        for (int i = 0; i < c1101m.f6888a; i++) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m559a[i];
            c0859ar.m1564a(abstractC0547a.mo3730b());
            abstractC0547a.mo3732a(abstractC0623y, c0859ar);
        }
        c0859ar.mo1485a("s");
    }

    /* renamed from: a */
    public static void m3733a(AbstractC0623y abstractC0623y, C0876k c0876k) {
        int m1438v = c0876k.m1438v();
        if (m1438v <= 0) {
            abstractC0623y.f3989bo = null;
            return;
        }
        if (abstractC0623y.f3989bo == null) {
            abstractC0623y.f3989bo = new C1101m();
        } else {
            abstractC0623y.f3989bo.clear();
        }
        C1101m c1101m = abstractC0623y.f3989bo;
        c0876k.m1460b("s");
        for (int i = 0; i < m1438v; i++) {
            EnumC0549b enumC0549b = (EnumC0549b) c0876k.m1461b(EnumC0549b.class);
            if (enumC0549b == null) {
                throw new IOException("Unknown status effect type");
            }
            AbstractC0547a mo3737a = enumC0549b.mo3737a();
            mo3737a.mo3731a(abstractC0623y, c0876k);
            c1101m.add(mo3737a);
        }
        c0876k.m1456d("s");
    }
}
