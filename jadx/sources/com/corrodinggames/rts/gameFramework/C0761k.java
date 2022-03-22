package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k.class */
class C0761k extends Thread {

    /* renamed from: a */
    boolean f5311a = true;

    C0761k() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f5311a) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
            C0743j.m879b();
        }
    }
}
