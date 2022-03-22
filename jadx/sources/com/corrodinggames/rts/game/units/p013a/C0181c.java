package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/c.class */
public class C0181c {

    /* renamed from: c */
    private static final HashMap f1324c = new HashMap();

    /* renamed from: a */
    public static final C0181c f1325a = m3412a("-1");

    /* renamed from: b */
    String f1326b;

    /* renamed from: a */
    public static C0181c m3412a(String str) {
        C0181c cVar = (C0181c) f1324c.get(str);
        if (cVar != null) {
            return cVar;
        }
        C0181c cVar2 = new C0181c(str);
        f1324c.put(str, cVar2);
        return cVar2;
    }

    /* renamed from: a */
    public String m3415a() {
        return this.f1326b;
    }

    private C0181c(String str) {
        this.f1326b = str;
    }

    /* renamed from: a */
    public static void m3414a(C0690ap apVar, C0181c cVar) {
        String str = null;
        if (cVar != null) {
            str = cVar.f1326b;
        }
        apVar.mo1132b(str);
    }

    /* renamed from: a */
    public static C0181c m3413a(C0707k kVar) {
        String j = kVar.m1058j();
        if (j != null) {
            return m3412a(j);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return this.f1326b.hashCode();
    }

    public String toString() {
        return "ActionId(" + this.f1326b + ")";
    }
}
