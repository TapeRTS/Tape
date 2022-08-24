package com.corrodinggames.rts.gameFramework;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k.class */
public class C0912k extends Thread {

    /* renamed from: a */
    boolean f6070a = true;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f6070a) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
            C0894j.m1393b();
        }
    }
}
