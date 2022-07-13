package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AbstractC0601h;
import com.corrodinggames.rts.gameFramework.GameAudio.AbstractC0602i;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.Sound;

/* renamed from: com.corrodinggames.rts.java.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class C1023q extends AbstractC0602i {

    /* renamed from: a */
    Sound loadedSound;

    /* renamed from: b */
    final /* synthetic */ C1021o f6651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023q(C1021o c1021o, String str, AbstractC0601h abstractC0601h) {
        super(str, abstractC0601h);
        this.f6651b = c1021o;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameAudio.AbstractC0602i
    /* renamed from: a */
    public void mo74a(float f, float f2, int i, int i2, float f3) {
        C1022p c1022p = (C1022p) this.f6651b.f6640c.m597a();
        if (c1022p == null) {
            return;
        }
        c1022p.f6645b = f;
        c1022p.f6646c = f2;
        c1022p.f6647d = i;
        c1022p.f6648e = i2;
        c1022p.f6649f = f3;
        c1022p.f6644a = this;
        this.f6651b.f6639b.offer(c1022p);
    }

    /* renamed from: b */
    public void m73b(float f, float f2, int i, int i2, float f3) {
        if (this.loadedSound == null) {
            GameEngine.PrintLOG("Sound not loaded");
            return;
        }
        synchronized (this.f6651b.m77b()) {
            this.loadedSound.play(CommonUtils.maxf(f, f2), f3, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameAudio.AbstractC0602i
    /* renamed from: a */
    public int mo75a() {
        return this.loadedSound.getBytesUsed();
    }
}