package com.corrodinggames.rts.gameFramework;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bb.class */
class RunnableC0578bb implements Runnable {

    /* renamed from: b */
    volatile int f3986b;

    /* renamed from: c */
    int f3987c;

    /* renamed from: d */
    int f3988d;

    /* renamed from: e */
    int f3989e;

    /* renamed from: f */
    int f3990f;

    /* renamed from: g */
    int f3991g;

    /* renamed from: k */
    final /* synthetic */ C0577ba f3995k;

    /* renamed from: a */
    volatile boolean f3985a = true;

    /* renamed from: h */
    boolean f3992h = false;

    /* renamed from: i */
    public ConcurrentLinkedQueue f3993i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    public long f3994j = 0;

    RunnableC0578bb(C0577ba baVar) {
        this.f3995k = baVar;
    }

    /* renamed from: a */
    public synchronized void m1936a(C0580bd bdVar) {
        if (this.f3992h) {
            AbstractC0789l.m670d("Replay:addCommand skipped due to stopped recording");
        }
        this.f3993i.add(bdVar);
        this.f3990f = bdVar.f3999a;
        if (bdVar.f4003e != null) {
            this.f3995k.f3970y++;
        }
        if (bdVar.f4004f != null) {
            this.f3995k.f3971z++;
        }
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m1937a() {
        boolean z;
        this.f3985a = false;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0577ba.m1956a("stop requested at:" + u.f5498bg);
        z = this.f3995k.f3962N;
        if (!z) {
            C0577ba.m1956a("Replay stop: warning: active==false");
        }
        if (this.f3995k.f3964s) {
            C0577ba.m1956a("Replay stop: warning: replaying==true");
        }
        this.f3986b = u.f5498bg;
        this.f3987c = u.f5499bh;
        this.f3988d = this.f3995k.f3970y;
        this.f3989e = this.f3995k.f3971z;
        if (this.f3986b < this.f3990f) {
            AbstractC0789l.m670d("Replay: stoppedFrame<lastCommandFrame: " + this.f3986b + "<" + this.f3990f);
            this.f3986b = this.f3990f;
        }
        this.f3994j = 0L;
        notifyAll();
    }

    /* renamed from: b */
    private synchronized void m1935b() {
        try {
            if (this.f3985a) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        while (this.f3985a) {
            if (this.f3993i.size() > 0) {
                C0580bd bdVar = (C0580bd) this.f3993i.remove();
                try {
                    if (bdVar.f4003e != null) {
                        this.f3995k.f3979H.mo1125e("rc");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        bdVar.f4003e.m1562a(this.f3995k.f3979H);
                        this.f3995k.f3979H.mo1093a("rc");
                        this.f3991g = bdVar.f3999a;
                    } else if (bdVar.f4001c != null) {
                        this.f3995k.f3979H.mo1125e("cs");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1148a(bdVar.f4001c.longValue());
                        this.f3995k.f3979H.mo1093a("cs");
                    } else if (bdVar.f4002d != null) {
                        this.f3995k.f3979H.mo1125e("wait");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1093a("wait");
                        this.f3995k.f3979H.mo1125e("es");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1137a(bdVar.f4002d);
                        this.f3995k.f3979H.mo1093a("es");
                    } else if (bdVar.f4004f != null) {
                        this.f3995k.f3979H.mo1125e("wait");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1093a("wait");
                        this.f3995k.f3979H.mo1125e("resync");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1095a(bdVar.f4006h);
                        this.f3995k.f3979H.mo1095a(bdVar.f4007i);
                        this.f3995k.f3979H.mo1096a(bdVar.f4008j);
                        this.f3995k.f3979H.mo1096a(bdVar.f4009k);
                        this.f3995k.f3979H.mo1137a(bdVar.f4004f);
                        this.f3995k.f3979H.mo1093a("resync");
                    } else if (bdVar.f4005g != null) {
                        this.f3995k.f3979H.mo1125e("chat");
                        this.f3995k.f3979H.mo1095a(bdVar.f3999a);
                        this.f3995k.f3979H.mo1095a(bdVar.f4005g.f3996a);
                        this.f3995k.f3979H.mo1132b(bdVar.f4005g.f3997b);
                        this.f3995k.f3979H.mo1132b(bdVar.f4005g.f3998c);
                        this.f3995k.f3979H.mo1093a("chat");
                    } else {
                        throw new RuntimeException("Unknown saved command");
                    }
                    if (this.f3994j == 0 || this.f3994j + 3000 < System.currentTimeMillis()) {
                        this.f3994j = System.currentTimeMillis();
                        this.f3995k.f3979H.mo1150a();
                    }
                } catch (IOException e) {
                    AbstractC0789l u = AbstractC0789l.m638u();
                    AbstractC0789l.m714a("Replay error", (Throwable) e);
                    u.f5518bA.f4280e.m1642a("", "IO error recording replay, disabling record");
                    this.f3995k.f3962N = false;
                    this.f3992h = true;
                    return;
                }
            }
            if (this.f3993i.size() == 0) {
                m1935b();
            }
        }
        try {
            this.f3995k.f3979H.mo1125e("wait");
            this.f3995k.f3979H.mo1095a(this.f3986b);
            this.f3995k.f3979H.mo1093a("wait");
            this.f3995k.f3979H.mo1125e("end");
            this.f3995k.f3979H.mo1093a("end");
            this.f3995k.f3979H.mo1125e("endReplayMetaData");
            this.f3995k.f3979H.mo1130c(0);
            this.f3995k.f3979H.mo1095a(this.f3986b);
            this.f3995k.f3979H.mo1095a(this.f3987c);
            this.f3995k.f3979H.mo1095a(this.f3988d);
            this.f3995k.f3979H.mo1095a(this.f3989e);
            this.f3995k.f3979H.mo1129c("{frames:" + this.f3986b + ",time:" + this.f3987c + ",commandCount:" + this.f3988d + ",resyncCount:" + this.f3989e + "}");
            this.f3995k.f3979H.mo1093a("endReplayMetaData");
            this.f3995k.f3979H.mo1150a();
            C0577ba.m1956a("Background writer stopping");
            C0577ba.m1956a("Remainding commands: " + this.f3993i.size());
            C0577ba.m1956a("last command: " + this.f3990f);
            C0577ba.m1956a("last command write: " + this.f3991g);
            C0577ba.m1956a("Commands issued: " + this.f3988d);
            this.f3992h = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
