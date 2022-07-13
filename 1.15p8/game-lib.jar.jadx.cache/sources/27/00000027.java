package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;

/* renamed from: com.corrodinggames.rts.game.units.custom.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
public class C0331aa {

    /* renamed from: a */
    String f2088a;

    /* renamed from: b */
    String f2089b;

    /* renamed from: c */
    int f2090c;

    /* renamed from: d */
    int f2091d;

    /* renamed from: e */
    String f2092e;

    /* renamed from: f */
    CustomUnitMetadata f2093f;

    /* renamed from: a */
    public String m3585a() {
        String str = "from internal units";
        if (this.f2088a != null) {
            str = "from mod:'" + this.f2088a + "'";
        }
        Mod m1578e = GameEngine.getInstance().ModEngine.m1578e(this.f2088a);
        if (m1578e != null) {
            if (!m1578e.m1551l()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (this.f2093f != null && this.f2092e != null) {
            if (this.f2093f.f2735F == null) {
                str2 = " (Extra debug not enabled)";
            } else {
                String[] split = this.f2092e.split("\n");
                String[] split2 = this.f2093f.f2735F.split("\n");
                int mini = CommonUtils.mini(split.length, split2.length);
                if (split.length != split2.length) {
                    str2 = str2 + "Line length difference: " + split.length + " vs " + split2.length;
                }
                int i = 0;
                while (true) {
                    if (i >= mini) {
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
        if (this.f2091d == -1) {
            return "The server requires the unit:" + this.f2089b + " that was not found " + str + str2;
        }
        return "Found unit:" + this.f2089b + " but it does not match the server's copy " + str + str2 + " (checksum c:" + this.f2091d + " s:" + this.f2090c + ")";
    }

    /* renamed from: b */
    public void m3584b() {
        String str = "from internal units";
        if (this.f2088a != null) {
            str = "from mod:'" + this.f2088a + "'";
        }
        Mod m1578e = GameEngine.getInstance().ModEngine.m1578e(this.f2088a);
        if (m1578e != null) {
            if (!m1578e.m1551l()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        if (this.f2091d == -1) {
            throw new C0384ba("The server requires the unit:" + this.f2089b + " that was not found " + str, VariableScope.nullOrMissingString);
        }
        throw new C0384ba("Found unit:" + this.f2089b + " but it does not match the server's copy " + str, "checksum c:" + this.f2091d + " s:" + this.f2090c);
    }
}