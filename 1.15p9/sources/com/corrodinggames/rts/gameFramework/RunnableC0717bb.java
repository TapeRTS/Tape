package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bb.class */
public class RunnableC0717bb implements Runnable {

    /* renamed from: b */
    volatile int f4509b;

    /* renamed from: c */
    int f4510c;

    /* renamed from: d */
    int f4511d;

    /* renamed from: e */
    int f4512e;

    /* renamed from: f */
    int f4513f;

    /* renamed from: g */
    int f4514g;

    /* renamed from: k */
    final /* synthetic */ C0716ba f4518k;

    /* renamed from: a */
    volatile boolean f4508a = true;

    /* renamed from: h */
    boolean f4515h = false;

    /* renamed from: i */
    public ConcurrentLinkedQueue f4516i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    public long f4517j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0717bb(C0716ba c0716ba) {
        this.f4518k = c0716ba;
    }

    /* renamed from: a */
    public synchronized void m2630a(C0719bd c0719bd) {
        if (this.f4515h) {
            GameEngine.PrintLog("Replay:addCommand skipped due to stopped recording");
        }
        this.f4516i.add(c0719bd);
        this.f4513f = c0719bd.f4522a;
        if (c0719bd.f4526e != null) {
            this.f4518k.f4490y++;
        }
        if (c0719bd.f4527f != null) {
            this.f4518k.f4491z++;
        }
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m2631a() {
        this.f4508a = false;
        GameEngine m1228A = GameEngine.m1228A();
        C0716ba.m2650a("stop requested at:" + m1228A.f6233bx);
        if (!C0716ba.m2653a(this.f4518k)) {
            C0716ba.m2650a("Replay stop: warning: active==false");
        }
        if (this.f4518k.f4485s) {
            C0716ba.m2650a("Replay stop: warning: replaying==true");
        }
        this.f4509b = m1228A.f6233bx;
        this.f4510c = m1228A.f6096by;
        this.f4511d = this.f4518k.f4490y;
        this.f4512e = this.f4518k.f4491z;
        if (this.f4509b < this.f4513f) {
            GameEngine.PrintLog("Replay: stoppedFrame<lastCommandFrame: " + this.f4509b + "<" + this.f4513f);
            this.f4509b = this.f4513f;
        }
        this.f4517j = 0L;
        notifyAll();
    }

    /* renamed from: b */
    private synchronized void m2629b() {
        try {
            if (this.f4508a) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }

    public void run() {
        GameEngine.m1156ap();
        while (this.f4508a) {
            if (this.f4516i.size() > 0) {
                C0719bd c0719bd = (C0719bd) this.f4516i.remove();
                try {
                    if (c0719bd.f4526e != null) {
                        this.f4518k.f4499H.m1543e("rc");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        c0719bd.f4526e.m2487a(this.f4518k.f4499H);
                        this.f4518k.f4499H.mo1479a("rc");
                        this.f4514g = c0719bd.f4522a;
                    } else if (c0719bd.f4524c != null) {
                        this.f4518k.f4499H.m1543e("cs");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.m1571a(c0719bd.f4524c.longValue());
                        this.f4518k.f4499H.mo1479a("cs");
                    } else if (c0719bd.f4525d != null) {
                        this.f4518k.f4499H.m1543e("wait");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.mo1479a("wait");
                        this.f4518k.f4499H.m1543e("es");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.m1556a(c0719bd.f4525d);
                        this.f4518k.f4499H.mo1479a("es");
                    } else if (c0719bd.f4527f != null) {
                        this.f4518k.f4499H.m1543e("wait");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.mo1479a("wait");
                        this.f4518k.f4499H.m1543e("resync");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.mo1481a(c0719bd.f4529h);
                        this.f4518k.f4499H.mo1481a(c0719bd.f4530i);
                        this.f4518k.f4499H.mo1482a(c0719bd.f4531j);
                        this.f4518k.f4499H.mo1482a(c0719bd.f4532k);
                        this.f4518k.f4499H.m1556a(c0719bd.f4527f);
                        this.f4518k.f4499H.mo1479a("resync");
                    } else if (c0719bd.f4528g != null) {
                        this.f4518k.f4499H.m1543e("chat");
                        this.f4518k.f4499H.mo1481a(c0719bd.f4522a);
                        this.f4518k.f4499H.mo1481a(c0719bd.f4528g.f4519a);
                        this.f4518k.f4499H.m1551b(c0719bd.f4528g.f4520b);
                        this.f4518k.f4499H.m1551b(c0719bd.f4528g.f4521c);
                        this.f4518k.f4499H.mo1479a("chat");
                    } else {
                        throw new RuntimeException("Unknown saved command");
                    }
                    if (this.f4517j == 0 || this.f4517j + 3000 < System.currentTimeMillis()) {
                        this.f4517j = System.currentTimeMillis();
                        this.f4518k.f4499H.m1574a();
                    }
                } catch (IOException e) {
                    GameEngine m1228A = GameEngine.m1228A();
                    GameEngine.m1182a("Replay error", (Throwable) e);
                    m1228A.f6111bS.f5107e.m1946a(VariableScope.nullOrMissingString, "IO error recording replay, disabling record");
                    C0716ba.m2652a(this.f4518k, false);
                    this.f4515h = true;
                    return;
                }
            }
            if (this.f4516i.size() == 0) {
                m2629b();
            }
        }
        try {
            this.f4518k.f4499H.m1543e("wait");
            this.f4518k.f4499H.mo1481a(this.f4509b);
            this.f4518k.f4499H.mo1479a("wait");
            this.f4518k.f4499H.m1543e("end");
            this.f4518k.f4499H.mo1479a("end");
            this.f4518k.f4499H.m1543e("endReplayMetaData");
            this.f4518k.f4499H.m1548c(0);
            this.f4518k.f4499H.mo1481a(this.f4509b);
            this.f4518k.f4499H.mo1481a(this.f4510c);
            this.f4518k.f4499H.mo1481a(this.f4511d);
            this.f4518k.f4499H.mo1481a(this.f4512e);
            this.f4518k.f4499H.m1547c("{frames:" + this.f4509b + ",time:" + this.f4510c + ",commandCount:" + this.f4511d + ",resyncCount:" + this.f4512e + "}");
            this.f4518k.f4499H.mo1479a("endReplayMetaData");
            this.f4518k.f4499H.m1574a();
            C0716ba.m2650a("Background writer stopping");
            C0716ba.m2650a("Remainding commands: " + this.f4516i.size());
            C0716ba.m2650a("last command: " + this.f4513f);
            C0716ba.m2650a("last command write: " + this.f4514g);
            C0716ba.m2650a("Commands issued: " + this.f4511d);
            this.f4515h = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
