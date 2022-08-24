package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.game.units.custom.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
public class C0343aa {

    /* renamed from: a */
    String f2151a;

    /* renamed from: b */
    String f2152b;

    /* renamed from: c */
    int f2153c;

    /* renamed from: d */
    int f2154d;

    /* renamed from: e */
    String f2155e;

    /* renamed from: f */
    C0453l f2156f;

    /* renamed from: a */
    public String m4785a() {
        String str = "from internal units";
        if (this.f2151a != null) {
            str = "from mod:'" + this.f2151a + "'";
        }
        C0824b m1852e = GameEngine.m1228A().f6118bZ.m1852e(this.f2151a);
        if (m1852e != null) {
            if (!m1852e.m1822m()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (this.f2156f != null && this.f2155e != null) {
            if (this.f2156f.f2916H == null) {
                str2 = " (Extra debug not enabled)";
            } else {
                String[] split = this.f2155e.split("\n");
                String[] split2 = this.f2156f.f2916H.split("\n");
                int m2286c = C0758f.m2286c(split.length, split2.length);
                if (split.length != split2.length) {
                    str2 = str2 + "Line length difference: " + split.length + " vs " + split2.length;
                }
                int i = 0;
                while (true) {
                    if (i >= m2286c) {
                        break;
                    } else if (split[i].equals(split2[i])) {
                        i++;
                    } else {
                        str2 = str2 + "Difference on line " + i + ": '" + split[i] + "' vs '" + split2[i] + "'";
                        break;
                    }
                }
            }
        }
        if (this.f2154d == -1) {
            return "The server requires the unit:" + this.f2152b + " that was not found " + str + str2;
        }
        return "Found unit:" + this.f2152b + " but it does not match the server's copy " + str + str2 + " (checksum c:" + this.f2154d + " s:" + this.f2153c + ")";
    }
}
