package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.rudp.impl.Segment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.n */
/* loaded from: game-lib.jar:a/a/n.class */
public class RunnableC0024n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0017h f92a;

    private RunnableC0024n(C0017h c0017h) {
        this.f92a = c0017h;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.f92a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f92a.f66u;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    this.f92a.m5245f((Segment) it.next());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
