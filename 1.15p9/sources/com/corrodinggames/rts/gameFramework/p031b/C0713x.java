package com.corrodinggames.rts.gameFramework.p031b;

import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/x.class */
public class C0713x extends AbstractC0690b {

    /* renamed from: m */
    private final boolean f4441m;

    /* renamed from: n */
    private int f4442n;

    /* renamed from: l */
    protected boolean f4443l;

    public C0713x(int i, int i2, boolean z) {
        this(i, i2, z, 3553);
    }

    public C0713x(int i, int i2, boolean z, int i3) {
        this.f4442n = 3553;
        this.f4441m = z;
        m2812a(i, i2);
        this.f4442n = i3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2671b(InterfaceC0700k interfaceC0700k) {
        this.f4346a = interfaceC0700k.mo2775a().mo2680a();
        if (this.f4442n == 3553) {
            interfaceC0700k.mo2769a(this, 6408, 5121, 6408);
        }
        interfaceC0700k.mo2758d(this);
        this.f4347b = 1;
        m2809a(interfaceC0700k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public boolean mo2670c(InterfaceC0700k interfaceC0700k) {
        if (m2802i()) {
            return true;
        }
        Log.m6347c("RawTexture", "lost the content due to context change");
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: g */
    public int mo2669g() {
        return this.f4442n;
    }

    /* renamed from: k */
    public boolean m2667k() {
        return this.f4443l;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2672b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: h */
    public int mo2668h() {
        return 9729;
    }
}
