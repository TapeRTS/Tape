package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class C0630d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0627a f4029a;

    public C0630d(C0627a c0627a) {
        this.f4029a = c0627a;
    }

    public void run() {
        GameEngine.m1156ap();
        while (true) {
            try {
                C0629c c0629c = (C0629c) this.f4029a.f4013a.take();
                c0629c.m3006a();
                this.f4029a.f4015c.m641a(c0629c);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
