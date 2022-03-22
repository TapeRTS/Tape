package com.corrodinggames.rts.gameFramework.p036g;

import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.g.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/o.class */
class C0712o extends TimerTask {

    /* renamed from: a */
    int f5024a;

    C0712o(int i) {
        this.f5024a = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        C0710n.m1042a(this.f5024a, -1);
    }
}
