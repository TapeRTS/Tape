package com.corrodinggames.rts.gameFramework;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
public class C0663au extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0648am f4218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0663au(C0648am c0648am) {
        this.f4218a = c0648am;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.f4218a.f4187c) {
                this.f4218a.f4190g = true;
                if (!this.f4218a.f4189f) {
                    try {
                        this.f4218a.f4187c.wait(C0648am.f4183a.mo2905e());
                    } catch (InterruptedException e) {
                    }
                }
                this.f4218a.f4189f = false;
                f = this.f4218a.f4188d;
            }
            synchronized (this.f4218a.f4186b) {
                if (!this.f4218a.m2924b(f)) {
                    return;
                }
            }
        }
    }
}
