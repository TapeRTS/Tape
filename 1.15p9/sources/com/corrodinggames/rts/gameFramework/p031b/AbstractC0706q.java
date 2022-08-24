package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;

/* renamed from: com.corrodinggames.rts.gameFramework.b.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/q.class */
abstract class AbstractC0706q {

    /* renamed from: b */
    protected final String f4431b;

    /* renamed from: a */
    public int f4432a = -1;

    /* renamed from: c */
    public int f4433c = -1;

    /* renamed from: a */
    public abstract void mo2681a(int i);

    public AbstractC0706q(String str) {
        this.f4431b = str;
    }

    /* renamed from: a */
    public void m2683a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f4432a, 1, false, fArr, 0);
    }
}
