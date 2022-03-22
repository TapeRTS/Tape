package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public final class C0365i {

    /* renamed from: a */
    public final C0364h[] f2437a;

    public C0365i(C0364h[] hVarArr) {
        this.f2437a = hVarArr;
    }

    /* renamed from: a */
    public boolean m2896a() {
        return this.f2437a.length == 0;
    }

    /* renamed from: a */
    public boolean m2895a(C0365i iVar) {
        C0364h[] hVarArr;
        if (iVar == null) {
            if (m2896a()) {
                return true;
            }
            return false;
        } else if (this.f2437a.length != iVar.f2437a.length) {
            return false;
        } else {
            for (C0364h hVar : this.f2437a) {
                boolean z = false;
                C0364h[] hVarArr2 = iVar.f2437a;
                int length = hVarArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (hVar == hVarArr2[i]) {
                        z = true;
                        break;
                    } else {
                        i++;
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
    public int m2894b() {
        return this.f2437a.length;
    }

    public String toString() {
        C0364h[] hVarArr;
        String str = "";
        boolean z = true;
        for (C0364h hVar : this.f2437a) {
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = str + hVar.f2433a;
        }
        return "{" + str + "}";
    }
}
