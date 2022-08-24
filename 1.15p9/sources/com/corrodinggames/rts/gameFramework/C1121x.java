package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/x.class */
public class C1121x implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int mo449a(AbstractC1120w abstractC1120w, AbstractC1120w abstractC1120w2) {
        if (abstractC1120w.f6949ei > abstractC1120w2.f6949ei) {
            return 1;
        }
        if (abstractC1120w.f6949ei < abstractC1120w2.f6949ei) {
            return -1;
        }
        if (abstractC1120w.f6950ej > abstractC1120w2.f6950ej) {
            return 1;
        }
        if (abstractC1120w.f6950ej < abstractC1120w2.f6950ej) {
            return -1;
        }
        if (abstractC1120w.f6952el > abstractC1120w2.f6952el) {
            return 1;
        }
        return abstractC1120w.f6952el < abstractC1120w2.f6952el ? -1 : 0;
    }
}
