package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

/* renamed from: com.corrodinggames.rts.java.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c.class */
public class C0888c extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0886b f5968a;

    public C0888c(C0886b bVar) {
        this.f5968a = bVar;
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
