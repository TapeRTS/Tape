package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m.class */
public class C1029m {

    /* renamed from: a */
    float f6588a;

    /* renamed from: b */
    Paint f6589b;

    /* renamed from: c */
    final /* synthetic */ GameEngine f6590c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1029m(GameEngine gameEngine) {
        this.f6590c = gameEngine;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m864a() {
        float m1122e = this.f6590c.m1122e(this.f6588a);
        if (this.f6589b.m6461k() != m1122e) {
            if (this.f6589b instanceof C0930ag) {
                ((C0930ag) this.f6589b).m1044c(m1122e);
            } else {
                this.f6589b.mo6482b(m1122e);
            }
        }
    }
}
