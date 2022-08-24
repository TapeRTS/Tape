package com.corrodinggames.rts.game.units.custom.p023f;

import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/d.class */
public class C0446d {

    /* renamed from: a */
    HashMap f2832a = new HashMap();

    /* renamed from: a */
    public void m4417a(String str, String str2) {
        this.f2832a.put(str, str2);
    }

    /* renamed from: a */
    public String m4418a(String str) {
        return (String) this.f2832a.get(str);
    }

    /* renamed from: a */
    public void m4419a() {
        this.f2832a.clear();
    }
}
