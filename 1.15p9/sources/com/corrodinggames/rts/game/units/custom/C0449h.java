package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.game.units.custom.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/h.class */
public final class C0449h {

    /* renamed from: a */
    public final C0448g[] f2837a;

    public C0449h(C0448g[] c0448gArr) {
        this.f2837a = c0448gArr;
    }

    /* renamed from: a */
    public boolean m4406a() {
        return this.f2837a.length == 0;
    }

    /* renamed from: a */
    public boolean m4405a(C0449h c0449h) {
        C0448g[] c0448gArr;
        if (c0449h == null) {
            if (m4406a()) {
                return true;
            }
            return false;
        } else if (this.f2837a.length != c0449h.f2837a.length) {
            return false;
        } else {
            for (C0448g c0448g : this.f2837a) {
                boolean z = false;
                C0448g[] c0448gArr2 = c0449h.f2837a;
                int length = c0448gArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c0448g != c0448gArr2[i]) {
                            i++;
                        } else {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public int m4404b() {
        return this.f2837a.length;
    }

    public String toString() {
        C0448g[] c0448gArr;
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        for (C0448g c0448g : this.f2837a) {
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = str + c0448g.f2833a;
        }
        return "{" + str + "}";
    }
}
