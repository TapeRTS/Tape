package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0412bm;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/e.class */
public class C0447e {
    /* renamed from: a */
    public static void m4416a(String str) {
        if (str.length() == 0) {
            throw new C0412bm("name cannot be empty");
        }
        if (str.contains(" ") || str.contains("}") || str.contains("$") || str.contains(".") || str.contains("{") || str.contains("-") || str.contains("+") || str.contains(":") || str.contains("(")) {
            throw new C0412bm("invalid character in name");
        }
        if (Character.isDigit(str.charAt(0))) {
            throw new C0412bm("name cannot start with a digit");
        }
    }
}
