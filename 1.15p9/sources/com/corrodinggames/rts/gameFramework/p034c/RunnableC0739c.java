package com.corrodinggames.rts.gameFramework.p034c;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/c.class */
public class RunnableC0739c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0737a f4632a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0739c(RunnableC0737a runnableC0737a) {
        this.f4632a = runnableC0737a;
    }

    public void run() {
        GameEngine m1228A = GameEngine.m1228A();
        if (this.f4632a.f4628f) {
            this.f4632a.f4628f = false;
            return;
        }
        if (RunnableC0737a.f4624c) {
            if (m1228A.f6104bL == null) {
                return;
            }
            m1228A.f6106bN.f4195F = true;
            if (!m1228A.f6106bN.m2914j()) {
                RunnableC0737a.f4620e += 1.0f;
            }
            if (RunnableC0737a.f4620e > 5.0f) {
                RunnableC0737a.f4620e = 0.0f;
                System.gc();
                System.gc();
                m1228A.f6106bN.m2919e();
            }
        }
        if (RunnableC0737a.f4625d && m1228A.f6104bL != null) {
            m1228A.f6104bL.m5836g();
        }
    }
}
