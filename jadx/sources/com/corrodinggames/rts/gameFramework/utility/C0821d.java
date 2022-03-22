package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/d.class */
public class C0821d extends Thread {

    /* renamed from: a */
    private static final AbstractC0825e f5744a = new AbstractC0825e() { // from class: com.corrodinggames.rts.gameFramework.utility.d.1
        @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC0825e
        /* renamed from: a */
        public void mo519a(C0806a aVar) {
            throw aVar;
        }
    };

    /* renamed from: b */
    private static final AbstractC0826f f5745b = new AbstractC0826f() { // from class: com.corrodinggames.rts.gameFramework.utility.d.2
        @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC0826f
        /* renamed from: a */
        public void mo518a(InterruptedException interruptedException) {
            Log.m4035c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: c */
    private AbstractC0825e f5746c;

    /* renamed from: d */
    private AbstractC0826f f5747d;

    /* renamed from: e */
    private final Handler f5748e;

    /* renamed from: f */
    private final int f5749f;

    /* renamed from: g */
    private String f5750g;

    /* renamed from: h */
    private boolean f5751h;

    /* renamed from: i */
    private boolean f5752i;

    /* renamed from: j */
    private volatile int f5753j;

    /* renamed from: k */
    private final Runnable f5754k;

    public C0821d() {
        this(5000);
    }

    public C0821d(int i) {
        this.f5746c = f5744a;
        this.f5747d = f5745b;
        this.f5748e = new Handler(Looper.m4072b());
        this.f5750g = "";
        this.f5751h = false;
        this.f5752i = false;
        this.f5753j = 0;
        this.f5754k = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.d.3
            @Override // java.lang.Runnable
            public void run() {
                C0821d.this.f5753j = (C0821d.this.f5753j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f5749f = i;
    }

    /* renamed from: a */
    public C0821d m520a(AbstractC0825e eVar) {
        if (eVar == null) {
            this.f5746c = f5744a;
        } else {
            this.f5746c = eVar;
        }
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C0806a aVar;
        setName("|ANR-WatchDog|");
        int i = -1;
        while (!isInterrupted()) {
            int i2 = this.f5753j;
            this.f5748e.m4082a(this.f5754k);
            try {
                Thread.sleep(this.f5749f);
                if (this.f5753j == i2) {
                    if (this.f5752i || !Debug.isDebuggerConnected()) {
                        if (this.f5750g != null) {
                            aVar = C0806a.m615a(this.f5750g, this.f5751h);
                        } else {
                            aVar = C0806a.m616a();
                        }
                        this.f5746c.mo519a(aVar);
                        return;
                    }
                    if (this.f5753j != i) {
                        Log.m4035c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f5753j;
                }
            } catch (InterruptedException e) {
                this.f5747d.mo518a(e);
                return;
            }
        }
    }
}
