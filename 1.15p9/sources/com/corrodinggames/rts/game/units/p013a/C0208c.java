package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/c.class */
public class C0208c {

    /* renamed from: c */
    private static final HashMap f1426c = new HashMap();

    /* renamed from: a */
    public static final C0208c f1427a = m5539a("-1");

    /* renamed from: b */
    String f1428b;

    /* renamed from: a */
    public static C0208c m5539a(String str) {
        C0208c c0208c = (C0208c) f1426c.get(str);
        if (c0208c != null) {
            return c0208c;
        }
        C0208c c0208c2 = new C0208c(str);
        f1426c.put(str, c0208c2);
        return c0208c2;
    }

    /* renamed from: a */
    public String m5543a() {
        return this.f1428b;
    }

    private C0208c(String str) {
        this.f1428b = str;
    }

    /* renamed from: a */
    public static void m5541a(C0859ar c0859ar, C0208c c0208c) {
        String str = null;
        if (c0208c != null) {
            str = c0208c.f1428b;
        }
        c0859ar.m1551b(str);
    }

    /* renamed from: a */
    public static C0208c m5540a(C0876k c0876k) {
        String m1444j = c0876k.m1444j();
        if (m1444j != null) {
            return m5539a(m1444j);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return this.f1428b.hashCode();
    }

    public String toString() {
        return "ActionId(" + this.f1428b + ")";
    }

    /* renamed from: a */
    public final boolean m5542a(C0208c c0208c) {
        return this == c0208c;
    }
}
