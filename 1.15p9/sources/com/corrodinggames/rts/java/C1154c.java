package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

/* renamed from: com.corrodinggames.rts.java.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c.class */
public class C1154c extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1152b f7081a;

    public C1154c(C1152b c1152b) {
        this.f7081a = c1152b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
            }
            Display.processMessages();
        }
    }
}
