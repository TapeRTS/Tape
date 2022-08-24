package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.C0758f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ak.class */
public abstract class AbstractC0792ak implements Comparable {

    /* renamed from: c */
    long f5082c;

    /* renamed from: d */
    long f5083d = 5000;

    /* renamed from: e */
    float f5084e;

    /* renamed from: f */
    float f5085f;

    /* renamed from: g */
    String f5086g;

    /* renamed from: h */
    boolean f5087h;

    /* renamed from: i */
    boolean f5088i;

    /* renamed from: b */
    public abstract void mo2088b(AbstractC0792ak abstractC0792ak);

    /* renamed from: a */
    public abstract String mo2091a();

    public AbstractC0792ak(float f, float f2) {
        this.f5084e = f;
        this.f5085f = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int mo2087c(AbstractC0792ak abstractC0792ak) {
        return (int) (abstractC0792ak.f5082c - this.f5082c);
    }

    /* renamed from: a */
    public boolean mo2090a(AbstractC0792ak abstractC0792ak) {
        if (this.f5082c + mo2089b() < System.currentTimeMillis() || C0758f.m2363a(this.f5084e, this.f5085f, abstractC0792ak.f5084e, abstractC0792ak.f5085f) > 90000.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    protected long mo2089b() {
        return 5000L;
    }
}
