package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/c.class */
public class C0794c {

    /* renamed from: a */
    Unit f5091a;

    /* renamed from: b */
    Action f5092b;

    /* renamed from: c */
    float f5093c;

    /* renamed from: d */
    boolean f5094d;

    /* renamed from: e */
    boolean f5095e;

    /* renamed from: f */
    static C1101m f5096f = new C1101m();

    C0794c() {
    }

    /* renamed from: a */
    public static void m2087a(Unit unit, Action action, boolean z, boolean z2) {
        C0794c m2088a = m2088a(unit, action, z2);
        if (m2088a == null) {
            m2088a = new C0794c();
            f5096f.add(m2088a);
        }
        m2088a.f5091a = unit;
        m2088a.f5092b = action;
        m2088a.f5093c = 10.0f;
        m2088a.f5094d = z;
        m2088a.f5095e = z2;
    }

    /* renamed from: a */
    public static C0794c m2088a(Unit unit, Action action, boolean z) {
        Iterator it = f5096f.iterator();
        while (it.hasNext()) {
            C0794c c0794c = (C0794c) it.next();
            if (c0794c.f5091a == unit && c0794c.f5092b == action && c0794c.f5095e == z) {
                return c0794c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static float m2086b(Unit unit, Action action, boolean z) {
        C0794c m2088a = m2088a(unit, action, z);
        if (m2088a != null) {
            float f = m2088a.f5093c / 10.0f;
            if (m2088a.f5094d) {
                f = -f;
            }
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m2089a(float f) {
        for (int size = f5096f.size() - 1; size >= 0; size--) {
            C0794c c0794c = (C0794c) f5096f.get(size);
            c0794c.f5093c -= f;
            if (c0794c.f5093c <= 0.0f) {
                f5096f.remove(size);
            }
        }
    }
}
