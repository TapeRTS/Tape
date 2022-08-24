package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/aj.class */
public class C1081aj {

    /* renamed from: a */
    ConcurrentLinkedQueue f6846a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public void m589a(Runnable runnable) {
        this.f6846a.add(runnable);
    }

    /* renamed from: a */
    public void m590a() {
        while (true) {
            Runnable runnable = (Runnable) this.f6846a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
