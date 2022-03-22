package p000a.p001a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p001a.p002a.AbstractC0008h;

/* renamed from: a.a.n */
/* loaded from: game-lib.jar:a/a/n.class */
class RunnableC0024n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0017h f93a;

    private RunnableC0024n(C0017h hVar) {
        this.f93a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.f93a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f93a.f66u;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    this.f93a.m4345f((AbstractC0008h) it.next());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
