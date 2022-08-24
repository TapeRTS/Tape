package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class C1188r extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1185o f7249a;

    public C1188r(C1185o c1185o) {
        this.f7249a = c1185o;
    }

    public void run() {
        GameEngine.m1156ap();
        while (true) {
            try {
                C1186p c1186p = (C1186p) this.f7249a.f7236b.take();
                c1186p.m76a();
                this.f7249a.f7237c.m641a(c1186p);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
