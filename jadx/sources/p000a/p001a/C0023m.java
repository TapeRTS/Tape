package p000a.p001a;

import java.io.IOException;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0003c;
import p000a.p001a.p002a.C0007g;

/* renamed from: a.a.m */
/* loaded from: game-lib.jar:a/a/m.class */
class C0023m extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0017h f92a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023m(C0017h hVar) {
        super("ReliableSocket");
        this.f92a = hVar;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0008h g;
        while (true) {
            try {
                g = this.f92a.m4343g();
                if (g != null) {
                    if (g instanceof C0007g) {
                        this.f92a.m4372a((C0007g) g);
                    } else if (g instanceof C0003c) {
                        this.f92a.m4373a((C0003c) g);
                    } else if (!(g instanceof C0001a)) {
                        this.f92a.m4342g(g);
                    }
                    this.f92a.m4355c(g);
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
