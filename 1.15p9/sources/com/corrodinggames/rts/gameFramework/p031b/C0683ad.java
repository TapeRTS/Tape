package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ad.class */
public class C0683ad extends AbstractC0690b {

    /* renamed from: l */
    int f4326l = 9729;

    public C0683ad(InterfaceC0700k interfaceC0700k, int i, int i2) {
        m2812a(i, i2);
        this.f4346a = interfaceC0700k.mo2775a().mo2680a();
        interfaceC0700k.mo2758d(this);
        interfaceC0700k.mo2769a(this, 6408, 5121, 6408);
    }

    /* renamed from: a */
    public void m2824a(InterfaceC0700k interfaceC0700k, Bitmap bitmap, int i, int i2) {
        interfaceC0700k.mo2756f();
        int mo2669g = mo2669g();
        interfaceC0700k.mo2762b(this);
        C0703n.m2689o();
        GLUtils.texSubImage2D(mo2669g, 0, i, i2, bitmap, 6408, 5121);
    }

    /* renamed from: c */
    protected boolean mo2670c(InterfaceC0700k interfaceC0700k) {
        return false;
    }

    /* renamed from: b */
    public void mo2671b(InterfaceC0700k interfaceC0700k) {
        GameEngine.PrintLog("BackingTexture prepare TODO");
    }

    /* renamed from: g */
    protected int mo2669g() {
        return 3553;
    }

    /* renamed from: b */
    public void mo2672b(int i) {
        if (this.f4326l != i) {
            int mo2669g = mo2669g();
            GLES20.glTexParameterf(mo2669g, 10241, i);
            GLES20.glTexParameterf(mo2669g, 10240, i);
            this.f4326l = i;
        }
    }

    /* renamed from: h */
    public int mo2668h() {
        return this.f4326l;
    }
}
