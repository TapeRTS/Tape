package net.rudp;

import java.io.IOException;
import net.rudp.impl.C0001a;
import net.rudp.impl.C0003c;
import net.rudp.impl.C0007g;
import net.rudp.impl.Segment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.m */
/* loaded from: game-lib.jar:a/a/m.class */
public class C0023m extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0017h f91a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023m(C0017h c0017h) {
        super("ReliableSocket");
        this.f91a = c0017h;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Segment m5237i;
        while (true) {
            try {
                m5237i = this.f91a.m5237i();
                if (m5237i != null) {
                    if (m5237i instanceof C0007g) {
                        this.f91a.m5272a((C0007g) m5237i);
                    } else if (m5237i instanceof C0003c) {
                        this.f91a.m5273a((C0003c) m5237i);
                    } else if (!(m5237i instanceof C0001a)) {
                        this.f91a.m5242g(m5237i);
                    }
                    this.f91a.m5255c(m5237i);
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
