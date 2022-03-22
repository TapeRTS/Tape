package p000a.p001a;

import java.io.IOException;
import java.util.ArrayList;
import p000a.p001a.p002a.C0005e;

/* renamed from: a.a.l */
/* loaded from: game-lib.jar:a/a/l.class */
class RunnableC0022l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0017h f91a;

    private RunnableC0022l(C0017h hVar) {
        this.f91a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        C0019i iVar;
        arrayList = this.f91a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f91a.f66u;
            if (arrayList2.isEmpty()) {
                try {
                    C0017h hVar = this.f91a;
                    iVar = this.f91a.f70y;
                    hVar.m4348e(new C0005e(iVar.m4327a()));
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
