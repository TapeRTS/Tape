package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ag.class */
public class C0686ag {
    /* renamed from: a */
    public static void m2823a(AbstractC0690b abstractC0690b, RectF rectF) {
        int i = 0;
        int i2 = 0;
        int mo2807b = abstractC0690b.mo2807b();
        int mo2806c = abstractC0690b.mo2806c();
        if (abstractC0690b.m2803f()) {
            i = 1;
            i2 = 1;
            mo2807b--;
            mo2806c--;
        }
        rectF.m6434a(i, i2, mo2807b, mo2806c);
    }
}
