package net.rudp;

import net.rudp.C0010b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.f */
/* loaded from: game-lib.jar:a/a/f.class */
public class C0015f implements InterfaceC0029s {

    /* renamed from: a */
    final /* synthetic */ C0010b f44a;

    /* JADX INFO: Access modifiers changed from: private */
    public C0015f(C0010b c0010b) {
        this.f44a = c0010b;
    }

    /* synthetic */ C0015f(C0010b c0010b, C0010b.C00111 c00111) {
        this(c0010b);
    }

    /* renamed from: a */
    public void m6694a(C0017h c0017h) {
        if (c0017h instanceof C0014e) {
            synchronized (C0010b.m6697e(this.f44a)) {
                while (C0010b.m6697e(this.f44a).size() > 50) {
                    try {
                        C0010b.m6697e(this.f44a).wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                C0010b.m6697e(this.f44a).add((C0014e) c0017h);
                C0010b.m6697e(this.f44a).notify();
            }
        }
    }

    /* renamed from: b */
    public void m6693b(C0017h c0017h) {
    }

    /* renamed from: c */
    public void m6692c(C0017h c0017h) {
        if (c0017h instanceof C0014e) {
            C0010b.m6707a(this.f44a, ((C0014e) c0017h).m6669c());
        }
    }

    /* renamed from: d */
    public void m6691d(C0017h c0017h) {
        if (c0017h instanceof C0014e) {
            C0010b.m6707a(this.f44a, ((C0014e) c0017h).m6669c());
        }
    }

    /* renamed from: e */
    public void m6690e(C0017h c0017h) {
    }
}
