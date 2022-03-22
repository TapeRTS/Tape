package com.corrodinggames.rts.game.units.custom;

import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/q.class */
class C0374q implements Comparator {
    /* renamed from: a */
    public int compare(C0368l lVar, C0368l lVar2) {
        if (lVar.f2513E == null || lVar2.f2513E == null) {
            return 0;
        }
        return lVar.f2513E.compareTo(lVar2.f2513E);
    }
}
