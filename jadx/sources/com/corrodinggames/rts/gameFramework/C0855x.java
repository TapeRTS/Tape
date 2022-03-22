package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.gameFramework.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/x.class */
class C0855x implements Comparator {
    C0855x() {
    }

    /* renamed from: a */
    public int compare(AbstractC0854w wVar, AbstractC0854w wVar2) {
        if (wVar.f5840dF > wVar2.f5840dF) {
            return 1;
        }
        if (wVar.f5840dF < wVar2.f5840dF) {
            return -1;
        }
        if (wVar.f5841dG > wVar2.f5841dG) {
            return 1;
        }
        if (wVar.f5841dG < wVar2.f5841dG) {
            return -1;
        }
        if (wVar.f5843dI > wVar2.f5843dI) {
            return 1;
        }
        return wVar.f5843dI < wVar2.f5843dI ? -1 : 0;
    }
}
