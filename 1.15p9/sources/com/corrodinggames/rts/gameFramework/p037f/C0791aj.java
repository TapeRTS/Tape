package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aj.class */
public class C0791aj extends C0789ah {
    public C0791aj(float f, float f2, InterfaceC0303as interfaceC0303as) {
        super(f, f2, interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0789ah, com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public String mo2091a() {
        if (this.f5086g == null) {
            this.f5086g = String.format(C0820a.m1880a("gui.log.upgradeCompleted", new Object[0]), this.f5079a.mo4980e(), Integer.valueOf(this.f5080b));
        }
        return this.f5086g;
    }
}
