package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.java.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class C0919q extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0916n f6104a;

    public C0919q(C0916n nVar) {
        this.f6104a = nVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        while (true) {
            try {
                C0917o oVar = (C0917o) this.f6104a.f6091b.take();
                oVar.m74a();
                this.f6104a.f6092c.m549a(oVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
