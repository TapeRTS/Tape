package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/z.class */
public class C0468z {

    /* renamed from: a */
    public long f3355a = m4053a(true);

    /* renamed from: b */
    public String f3356b;

    public C0468z(String str) {
        this.f3356b = str;
    }

    /* renamed from: a */
    public long m4053a(boolean z) {
        if (GameEngine.m1152at()) {
            return 0L;
        }
        long m1395a = C0894j.m1395a(this.f3356b, z);
        if (z && m1395a == 0) {
            GameEngine.PrintLog("Failed to watch: " + this.f3356b);
        }
        return m1395a;
    }
}
