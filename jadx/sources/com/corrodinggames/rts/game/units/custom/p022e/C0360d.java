package com.corrodinggames.rts.game.units.custom.p022e;

import com.corrodinggames.rts.game.units.custom.C0324at;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/d.class */
public class C0360d {
    /* renamed from: a */
    public static void m2952a(String str) {
        if (str.length() == 0) {
            throw new C0324at("name cannot be empty");
        } else if (str.contains(" ") || str.contains("}") || str.contains("$") || str.contains(".") || str.contains("{") || str.contains("-") || str.contains("+") || str.contains(":") || str.contains("(")) {
            throw new C0324at("invalid character in name");
        } else if (Character.isDigit(str.charAt(0))) {
            throw new C0324at("name cannot start with a digit");
        }
    }
}
