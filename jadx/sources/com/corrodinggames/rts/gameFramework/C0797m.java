package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;

/* renamed from: com.corrodinggames.rts.gameFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m.class */
class C0797m {

    /* renamed from: a */
    float f5643a;

    /* renamed from: b */
    Paint f5644b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0789l f5645c;

    C0797m(AbstractC0789l lVar) {
        this.f5645c = lVar;
    }

    /* renamed from: a */
    void m629a() {
        float e = this.f5645c.m668e(this.f5643a);
        if (this.f5644b.m4149k() == e) {
            return;
        }
        if (this.f5644b instanceof C0760q) {
            ((C0760q) this.f5644b).m834c(e);
        } else {
            this.f5644b.mo836b(e);
        }
    }
}
