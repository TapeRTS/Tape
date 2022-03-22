package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ah.class */
public class C0312ah {

    /* renamed from: a */
    public String f2056a;

    /* renamed from: b */
    public String f2057b;

    public C0312ah() {
    }

    public C0312ah(String str, String str2) {
        this.f2056a = str;
        this.f2057b = str2;
    }

    /* renamed from: a */
    public void m3099a(String str, String str2) {
        if (this.f2057b != null) {
            this.f2057b = this.f2057b.replaceAll(str, str2);
        }
    }
}
