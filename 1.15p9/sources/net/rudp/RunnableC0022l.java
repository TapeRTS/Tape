package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import net.rudp.impl.C0005e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.l */
/* loaded from: game-lib.jar:a/a/l.class */
public class RunnableC0022l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0017h f90a;

    private RunnableC0022l(C0017h c0017h) {
        this.f90a = c0017h;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        C0019i c0019i;
        arrayList = this.f90a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f90a.f66u;
            if (arrayList2.isEmpty()) {
                try {
                    C0017h c0017h = this.f90a;
                    c0019i = this.f90a.f70y;
                    c0017h.m5248e(new C0005e(c0019i.m5225a()));
                } catch (IOException e) {
                    z = C0017h.f81I;
                    if (z) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
