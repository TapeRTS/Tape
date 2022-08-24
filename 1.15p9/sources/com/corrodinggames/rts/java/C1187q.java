package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.java.audio.Sound;

/* renamed from: com.corrodinggames.rts.java.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class C1187q extends AbstractC0635i {

    /* renamed from: a */
    Sound f7247a;

    /* renamed from: b */
    final /* synthetic */ C1185o f7248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187q(C1185o c1185o, String str, AbstractC0634h abstractC0634h) {
        super(str, abstractC0634h);
        this.f7248b = c1185o;
    }

    /* renamed from: a */
    public void mo2985a(float f, float f2, int i, int i2, float f3) {
        C1186p c1186p = (C1186p) this.f7248b.f7237c.m642a();
        if (c1186p == null) {
            return;
        }
        c1186p.f7242b = f;
        c1186p.f7243c = f2;
        c1186p.f7244d = i;
        c1186p.f7245e = i2;
        c1186p.f7246f = f3;
        c1186p.f7241a = this;
        this.f7248b.f7236b.offer(c1186p);
    }

    /* renamed from: b */
    public void m73b(float f, float f2, int i, int i2, float f3) {
        if (this.f7247a == null) {
            GameEngine.PrintLog("Sound not loaded");
            return;
        }
        synchronized (this.f7248b.m77b()) {
            this.f7247a.play(C0758f.m2262f(f, f2), f3, 0.0f);
        }
    }

    /* renamed from: a */
    public int mo2986a() {
        return this.f7247a.getBytesUsed();
    }
}
