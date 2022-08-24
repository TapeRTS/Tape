package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/e.class */
public class C0693e extends AbstractC0687ah {

    /* renamed from: l */
    protected Bitmap f4361l;

    public C0693e(Bitmap bitmap) {
        this(bitmap, false);
    }

    public C0693e(Bitmap bitmap, boolean z) {
        super(z);
        this.f4361l = bitmap;
        this.f4340m = mo2797k();
        m2812a(this.f4340m.m6553b() + 0, this.f4340m.m6550c() + 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0687ah
    /* renamed from: a */
    protected void mo2798a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0687ah
    /* renamed from: k */
    protected Bitmap mo2797k() {
        return this.f4361l;
    }
}
