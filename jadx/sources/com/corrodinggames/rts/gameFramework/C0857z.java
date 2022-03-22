package com.corrodinggames.rts.gameFramework;

import android.os.Process;

/* renamed from: com.corrodinggames.rts.gameFramework.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/z.class */
public class C0857z extends Thread {

    /* renamed from: a */
    public boolean f5850a = true;

    /* renamed from: b */
    long f5851b;

    /* renamed from: a */
    public synchronized void m377a(boolean z) {
        this.f5850a = z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        char c;
        AbstractC0789l.m702ag();
        if (!AbstractC0789l.f5471aF) {
            Process.setThreadPriority(-4);
        }
        m378a();
        long j = this.f5851b;
        AbstractC0789l u = AbstractC0789l.m638u();
        while (this.f5850a) {
            long nanoTime = System.nanoTime();
            long j2 = this.f5851b;
            m378a();
            u.mo731a(((float) (this.f5851b - j2)) * 0.060000002f, (int) (this.f5851b - j2));
            if (!u.f5516by.batterySaving) {
            }
            if (u.f5516by.batterySaving) {
                c = 14352;
            } else if (u.f5516by.highRefreshRate) {
                c = 56533;
            } else {
                c = 9442;
            }
            long round = Math.round((float) (c - (System.nanoTime() - nanoTime)));
            if (round > 0) {
                long nanoTime2 = System.nanoTime();
                while (true) {
                    long nanoTime3 = System.nanoTime() - nanoTime2;
                    if (nanoTime3 <= round && nanoTime3 >= 0) {
                        long j3 = (long) ((round - nanoTime3) / 1000000.0d);
                        if (j3 > 1) {
                            try {
                                Thread.sleep(j3);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m378a() {
        this.f5851b = System.currentTimeMillis();
    }
}
