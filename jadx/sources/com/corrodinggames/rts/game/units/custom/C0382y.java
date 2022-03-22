package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0743j;

/* renamed from: com.corrodinggames.rts.game.units.custom.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/y.class */
class C0382y {

    /* renamed from: a */
    public long f2893a = m2707a(true);

    /* renamed from: b */
    public String f2894b;

    public C0382y(String str) {
        this.f2894b = str;
    }

    /* renamed from: a */
    public long m2707a(boolean z) {
        if (AbstractC0789l.m698ak()) {
            return 0L;
        }
        long a = C0743j.m881a(this.f2894b, z);
        if (z && a == 0) {
            AbstractC0789l.m670d("Failed to watch: " + this.f2894b);
        }
        return a;
    }
}
