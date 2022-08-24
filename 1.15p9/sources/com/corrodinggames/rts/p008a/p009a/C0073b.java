package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/b.class */
public class C0073b extends AbstractC0083l {
    /* renamed from: a */
    public void m6266a() {
        m6265b();
    }

    /* renamed from: b */
    public void m6265b() {
        GameEngine.PrintLog("networkSocks");
        GameEngine m1228A = GameEngine.m1228A();
        for (int i = 0; i < 10000; i++) {
            m1228A.networkEngine.m1681b(false);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m1228A.networkEngine.m1684b("test");
        }
        GameEngine.PrintLog("done");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
