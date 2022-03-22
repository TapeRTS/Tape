package com.corrodinggames.rts.game.units;

import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ah.class */
public enum EnumC0212ah {
    NONE,
    LAND,
    BUILDING,
    AIR,
    WATER,
    HOVER,
    OVER_CLIFF,
    OVER_CLIFF_WATER;

    /* renamed from: a */
    public static EnumC0212ah m3289a(String str, String str2) {
        EnumC0212ah[] values;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            String str3 = "";
            for (int i = 0; i < values().length; i++) {
                str3 = str3 + ", " + values[i].toString();
            }
            throw new IllegalArgumentException("Unknown movement type:'" + str + "' possible type:" + str3 + " on key:" + str2);
        }
    }
}
