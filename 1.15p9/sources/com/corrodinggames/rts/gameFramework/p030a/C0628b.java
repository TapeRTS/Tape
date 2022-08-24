package com.corrodinggames.rts.gameFramework.p030a;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/b.class */
public class C0628b extends AbstractC0635i {

    /* renamed from: a */
    C0627a f4020a;

    /* renamed from: b */
    int f4021b;

    /* renamed from: c */
    final /* synthetic */ C0627a f4022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0628b(C0627a c0627a, String str, AbstractC0634h abstractC0634h) {
        super(str, abstractC0634h);
        this.f4022c = c0627a;
        this.f4021b = -1;
    }

    /* renamed from: a */
    public void mo2985a(float f, float f2, int i, int i2, float f3) {
        C0629c c0629c = (C0629c) this.f4022c.f4015c.m642a();
        if (c0629c == null) {
            return;
        }
        c0629c.f4024b = f;
        c0629c.f4025c = f2;
        c0629c.f4027e = i2;
        c0629c.f4028f = f3;
        c0629c.f4023a = this;
        boolean z = false;
        GameEngine m1228A = GameEngine.m1228A();
        if (m1228A != null && m1228A.f6109bQ != null && m1228A.f6109bQ.androidNoSoundPrioritiesDebug) {
            z = true;
        }
        if (z) {
            c0629c.f4026d = 0;
        } else {
            this.f4022c.f4017e--;
            if (this.f4022c.f4017e <= 1) {
                this.f4022c.f4017e = 1000;
            }
            c0629c.f4026d = this.f4022c.f4017e;
        }
        this.f4022c.f4013a.offer(c0629c);
    }

    /* renamed from: b */
    public void m3007b(float f, float f2, int i, int i2, float f3) {
        if (this.f4021b == 0) {
            Log.m6345d("RustedWarfare", "Sound not loaded");
        } else {
            if (this.f4020a.f4019g.play(this.f4021b, f, f2, i, i2, f3) == 0) {
            }
        }
    }

    /* renamed from: a */
    public int mo2986a() {
        return 0;
    }
}
