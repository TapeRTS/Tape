package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.b.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/s.class */
public class C0708s extends AbstractC0706q {
    public C0708s(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0706q
    /* renamed from: a */
    public void mo2681a(int i) {
        if (this.f4433c != i) {
            this.f4432a = GLES20.glGetUniformLocation(i, this.f4431b);
            this.f4433c = i;
            C0703n.m2688p();
            if (this.f4432a == -1) {
                Log.m6345d(C0703n.m2687q(), "loadHandle: Failed to find: " + this.f4431b);
            }
        }
    }
}
