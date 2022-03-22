package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ah.class */
public class C0815ah {

    /* renamed from: a */
    ConcurrentLinkedQueue f5738a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public void m526a(Runnable runnable) {
        this.f5738a.add(runnable);
    }

    /* renamed from: a */
    public void m527a() {
        while (true) {
            Runnable runnable = (Runnable) this.f5738a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
