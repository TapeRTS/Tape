package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bj.class */
public class C0409bj {

    /* renamed from: a */
    ArrayList f2537a = new ArrayList();

    /* renamed from: b */
    int f2538b;

    /* renamed from: a */
    public void m5271a(float f) {
        Iterator it = this.f2537a.iterator();
        while (it.hasNext()) {
            ((C0410bk) it.next()).f2540b = f;
        }
    }

    /* renamed from: a */
    public boolean m5272a() {
        return m5269a(0.0f, 0.0f, 1.0f, true);
    }

    /* renamed from: a */
    public boolean m5270a(float f, float f2, float f3) {
        return m5269a(f, f2, f3, false);
    }

    /* renamed from: a */
    public boolean m5269a(float f, float f2, float f3, boolean z) {
        if (this.f2537a.size() == 0) {
            return false;
        }
        if (this.f2538b >= this.f2537a.size()) {
            this.f2538b = 0;
        }
        C0410bk c0410bk = (C0410bk) this.f2537a.get(this.f2538b);
        GameEngine gameEngine = GameEngine.getInstance();
        if (z) {
            gameEngine.audio.m2996c(c0410bk.f2539a, c0410bk.f2540b);
        } else {
            gameEngine.audio.m3004a(c0410bk.f2539a, c0410bk.f2540b, f, f2);
        }
        this.f2538b++;
        return true;
    }

    /* renamed from: a */
    public static C0409bj m5268a(C0453l c0453l, String str) {
        return m5267a(c0453l, str, (C0409bj) null);
    }

    /* renamed from: a */
    public static C0409bj m5267a(C0453l c0453l, String str, C0409bj c0409bj) {
        if ((str == null || str.equals(VariableScope.nullOrMissingString)) && c0409bj != null) {
            return c0409bj;
        }
        return new C0409bj(c0453l, str);
    }

    public C0409bj() {
    }

    public C0409bj(C0453l c0453l, String str) {
        String[] split;
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return;
        }
        for (String str2 : str.split(",")) {
            C0410bk c0410bk = new C0410bk(this);
            String trim = str2.trim();
            String str3 = VariableScope.nullOrMissingString;
            if (trim.startsWith("ROOT:")) {
                trim = trim.substring("ROOT:".length());
                str3 = str3 + "ROOT:";
            }
            if (trim.startsWith("SHARED:")) {
                trim = trim.substring("SHARED:".length());
                str3 = str3 + "SHARED:";
            }
            String[] split2 = trim.split(":");
            String str4 = null;
            String trim2 = split2[0].trim();
            if (split2.length != 1) {
                if (split2.length == 2) {
                    str4 = split2[1].trim();
                } else {
                    throw new RuntimeException("Unknown sound format:" + trim);
                }
            }
            if (str4 != null) {
                try {
                    c0410bk.f2540b = Float.parseFloat(str4);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Failed to parse volume float: '" + str4 + "' of sound: '" + trim + "'");
                }
            }
            c0410bk.f2539a = C0348af.m5410a(c0453l.f2914E, str3 + trim2, c0453l);
            if (c0410bk.f2539a != null) {
                this.f2537a.add(c0410bk);
            }
        }
    }
}
