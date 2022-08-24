package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.utility.C1115w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/e.class */
public final class RunnableC0870e implements Runnable {

    /* renamed from: b */
    OutputStream f5811b;

    /* renamed from: c */
    BufferedOutputStream f5812c;

    /* renamed from: d */
    DataOutputStream f5813d;

    /* renamed from: f */
    final /* synthetic */ Connection f5815f;

    /* renamed from: a */
    Boolean f5810a = true;

    /* renamed from: e */
    C1115w f5814e = new C1115w();

    /* renamed from: a */
    public synchronized void m1484a(C0861at c0861at) {
        if (this.f5815f.f5797a) {
            return;
        }
        this.f5815f.f5799f.add(c0861at);
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m1485a() {
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void m1483b() {
        try {
            if (this.f5815f.f5799f.isEmpty() && !this.f5815f.f5797a && !this.f5815f.f5798b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0870e(Connection connection) {
        this.f5815f = connection;
        this.f5811b = connection.f5761d.getOutputStream();
        this.f5812c = new BufferedOutputStream(this.f5811b);
        this.f5813d = new DataOutputStream(this.f5812c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f5815f.f5797a = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p041i.RunnableC0870e.run():void");
    }
}
