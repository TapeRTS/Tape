package com.corrodinggames.rts.game.units.custom;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/q.class */
public class C0459q implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C0453l c0453l, C0453l c0453l2) {
        if (c0453l.f2920L == null || c0453l2.f2920L == null) {
            return 0;
        }
        return c0453l.f2920L.compareTo(c0453l2.f2920L);
    }
}
