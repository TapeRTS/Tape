package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ao.class */
public enum EnumC0246ao {
    f1702a,
    f1703b,
    f1704c,
    f1705d,
    f1706e,
    f1707f,
    f1708g,
    f1709h;

    /* renamed from: a */
    public static EnumC0246ao m5142a(String str, String str2) {
        EnumC0246ao[] values;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            String str3 = VariableScope.nullOrMissingString;
            for (int i = 0; i < values().length; i++) {
                str3 = str3 + ", " + values[i].toString();
            }
            throw new IllegalArgumentException("Unknown movement type:'" + str + "' possible type:" + str3 + " on key:" + str2);
        }
    }
}
