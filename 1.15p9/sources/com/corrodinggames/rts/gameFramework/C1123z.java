package com.corrodinggames.rts.gameFramework;

import android.os.Process;

/* renamed from: com.corrodinggames.rts.gameFramework.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/z.class */
public class C1123z extends Thread {

    /* renamed from: a */
    static int f6961a = 0;

    /* renamed from: b */
    public boolean f6962b;

    /* renamed from: c */
    long f6963c;

    /* renamed from: a */
    public synchronized void m434a(boolean z) {
        this.f6962b = z;
    }

    public C1123z() {
        super("GameThread" + f6961a);
        this.f6962b = true;
        f6961a++;
    }

    public void run() {
        long j;
        GameEngine.m1156ap();
        if (!GameEngine.f6199aU) {
            Process.setThreadPriority(-4);
        }
        m435a();
        long j2 = this.f6963c;
        GameEngine m1228A = GameEngine.m1228A();
        while (this.f6962b) {
            long nanoTime = System.nanoTime();
            long j3 = this.f6963c;
            m435a();
            m1228A.mo5734a(((float) (this.f6963c - j3)) * 0.060000002f, (int) (this.f6963c - j3));
            if (!m1228A.f6109bQ.batterySaving) {
            }
            if (m1228A.f6109bQ.batterySaving) {
                j = 32258064;
            } else if (m1228A.f6109bQ.highRefreshRate) {
                j = 3333333;
            } else {
                j = 16393442;
            }
            long round = Math.round((float) (j - (System.nanoTime() - nanoTime)));
            if (round > 0) {
                long nanoTime2 = System.nanoTime();
                while (true) {
                    long nanoTime3 = System.nanoTime() - nanoTime2;
                    if (nanoTime3 <= round && nanoTime3 >= 0) {
                        long j4 = (long) ((round - nanoTime3) / 1000000.0d);
                        if (j4 > 1) {
                            try {
                                Thread.sleep(j4);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m435a() {
        this.f6963c = System.currentTimeMillis();
    }
}
