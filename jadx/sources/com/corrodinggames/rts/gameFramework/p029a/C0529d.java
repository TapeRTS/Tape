package com.corrodinggames.rts.gameFramework.p029a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class C0529d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0526a f3562a;

    public C0529d(C0526a aVar) {
        this.f3562a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        while (true) {
            try {
                C0528c cVar = (C0528c) this.f3562a.f3547a.take();
                cVar.m2120a();
                this.f3562a.f3549c.m549a(cVar);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
