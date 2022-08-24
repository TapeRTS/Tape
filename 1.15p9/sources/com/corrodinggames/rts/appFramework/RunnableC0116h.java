package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.appFramework.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/h.class */
public class RunnableC0116h implements Runnable {

    /* renamed from: a */
    public String f471a;

    /* renamed from: b */
    final /* synthetic */ ActivityC0097g f472b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0116h(ActivityC0097g activityC0097g) {
        this.f472b = activityC0097g;
    }

    public void run() {
        GameEngine m1228A = GameEngine.m1228A();
        m1228A.m1218K();
        m1228A.f6119ca.m438b(this.f471a, false);
        m1228A.m1220I();
        if (this.f472b.f439e != null && this.f472b.f439e.isShowing()) {
            this.f472b.m6596b(0);
        }
    }
}
