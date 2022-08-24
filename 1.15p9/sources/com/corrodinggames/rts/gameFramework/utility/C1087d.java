package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/d.class */
public class C1087d extends Thread {

    /* renamed from: a */
    private static final InterfaceC1091e f6852a = new InterfaceC1091e() { // from class: com.corrodinggames.rts.gameFramework.utility.d.1
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1091e
        /* renamed from: a */
        public void mo582a(C1066a c1066a) {
            throw c1066a;
        }
    };

    /* renamed from: b */
    private static final InterfaceC1092f f6853b = new InterfaceC1092f() { // from class: com.corrodinggames.rts.gameFramework.utility.d.2
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1092f
        /* renamed from: a */
        public void mo581a(InterruptedException interruptedException) {
            Log.m6347c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: c */
    private InterfaceC1091e f6854c;

    /* renamed from: d */
    private InterfaceC1092f f6855d;

    /* renamed from: e */
    private final Handler f6856e;

    /* renamed from: f */
    private final int f6857f;

    /* renamed from: g */
    private String f6858g;

    /* renamed from: h */
    private boolean f6859h;

    /* renamed from: i */
    private boolean f6860i;

    /* renamed from: j */
    private volatile int f6861j;

    /* renamed from: k */
    private final Runnable f6862k;

    public C1087d() {
        this(5000);
    }

    public C1087d(int i) {
        this.f6854c = f6852a;
        this.f6855d = f6853b;
        this.f6856e = new Handler(Looper.m6384b());
        this.f6858g = VariableScope.nullOrMissingString;
        this.f6859h = false;
        this.f6860i = false;
        this.f6861j = 0;
        this.f6862k = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.d.3
            @Override // java.lang.Runnable
            public void run() {
                C1087d.this.f6861j = (C1087d.this.f6861j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f6857f = i;
    }

    /* renamed from: a */
    public C1087d m583a(InterfaceC1091e interfaceC1091e) {
        if (interfaceC1091e == null) {
            this.f6854c = f6852a;
        } else {
            this.f6854c = interfaceC1091e;
        }
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C1066a m750a;
        setName("|ANR-WatchDog|");
        int i = -1;
        while (!isInterrupted()) {
            int i2 = this.f6861j;
            this.f6856e.m6394a(this.f6862k);
            try {
                Thread.sleep(this.f6857f);
                if (this.f6861j == i2) {
                    if (!this.f6860i && Debug.isDebuggerConnected()) {
                        if (this.f6861j != i) {
                            Log.m6347c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i = this.f6861j;
                    } else {
                        if (this.f6858g != null) {
                            m750a = C1066a.m749a(this.f6858g, this.f6859h);
                        } else {
                            m750a = C1066a.m750a();
                        }
                        this.f6854c.mo582a(m750a);
                        return;
                    }
                }
            } catch (InterruptedException e) {
                this.f6855d.mo581a(e);
                return;
            }
        }
    }
}
