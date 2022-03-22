package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
class C0562au extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0547am f3747a;

    C0562au(C0547am amVar) {
        this.f3747a = amVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.f3747a.f3691c) {
                this.f3747a.f3695g = true;
                if (!this.f3747a.f3694f) {
                    try {
                        this.f3747a.f3691c.wait(C0547am.f3689a.mo90e());
                    } catch (InterruptedException e) {
                    }
                }
                this.f3747a.f3694f = false;
                f = this.f3747a.f3692d;
            }
            synchronized (this.f3747a.f3690b) {
                if (!this.f3747a.m2054b(f)) {
                    return;
                }
            }
        }
    }
}
