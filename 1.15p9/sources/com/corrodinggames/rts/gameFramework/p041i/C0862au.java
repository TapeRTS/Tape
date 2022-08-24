package com.corrodinggames.rts.gameFramework.p041i;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/au.class */
public class C0862au extends TimerTask {

    /* renamed from: c */
    private final C0831ad f5739c;

    /* renamed from: a */
    public boolean f5740a = true;

    /* renamed from: b */
    public long f5741b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0862au(C0831ad c0831ad) {
        this.f5739c = c0831ad;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f5739c.f5516aK != 0 && (currentTimeMillis > this.f5739c.f5516aK + 5 || currentTimeMillis < this.f5739c.f5516aK)) {
                this.f5739c.f5516aK = 0L;
                this.f5739c.m1780Q();
            }
            if (currentTimeMillis > this.f5741b + 1000 || currentTimeMillis < this.f5741b) {
                this.f5741b = currentTimeMillis;
                if (this.f5740a) {
                    C0859ar c0859ar = new C0859ar();
                    c0859ar.m1571a(System.currentTimeMillis());
                    c0859ar.m1548c(0);
                    this.f5739c.m1644g(c0859ar.m1554b(108));
                } else {
                    this.f5739c.m1781P();
                }
                this.f5740a = !this.f5740a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
