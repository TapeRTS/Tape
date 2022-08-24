package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;

/* renamed from: com.corrodinggames.rts.gameFramework.b.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/t.class */
public class C0709t implements InterfaceC0710u {

    /* renamed from: a */
    private final int[] f4435a = new int[1];

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0710u
    /* renamed from: a */
    public int mo2680a() {
        GLES20.glGenTextures(1, this.f4435a, 0);
        C0703n.m2689o();
        return this.f4435a[0];
    }
}
