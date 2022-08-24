package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ba.class */
public class C0400ba {

    /* renamed from: a */
    public String f2485a;

    /* renamed from: b */
    public String f2486b;

    public C0400ba() {
    }

    public C0400ba(String str, String str2) {
        this.f2485a = str;
        this.f2486b = str2;
    }

    /* renamed from: a */
    public void m4640a(String str, String str2) {
        if (this.f2486b != null) {
            this.f2486b = this.f2486b.replaceAll(str, str2);
        }
    }
}
