package p000a.p001a;

import java.util.ArrayList;

/* renamed from: a.a.f */
/* loaded from: game-lib.jar:a/a/f.class */
class C0015f implements AbstractC0029s {

    /* renamed from: a */
    final /* synthetic */ C0010b f44a;

    private C0015f(C0010b bVar) {
        this.f44a = bVar;
    }

    @Override // p000a.p001a.AbstractC0029s
    /* renamed from: a */
    public void mo4297a(C0017h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (hVar instanceof C0014e) {
            arrayList = this.f44a.f33h;
            synchronized (arrayList) {
                while (true) {
                    arrayList2 = this.f44a.f33h;
                    if (arrayList2.size() > 50) {
                        try {
                            arrayList5 = this.f44a.f33h;
                            arrayList5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        arrayList3 = this.f44a.f33h;
                        arrayList3.add((C0014e) hVar);
                        arrayList4 = this.f44a.f33h;
                        arrayList4.notify();
                    }
                }
            }
        }
    }

    @Override // p000a.p001a.AbstractC0029s
    /* renamed from: b */
    public void mo4296b(C0017h hVar) {
    }

    @Override // p000a.p001a.AbstractC0029s
    /* renamed from: c */
    public void mo4295c(C0017h hVar) {
        if (hVar instanceof C0014e) {
            this.f44a.m4383a(hVar.getRemoteSocketAddress());
        }
    }

    @Override // p000a.p001a.AbstractC0029s
    /* renamed from: d */
    public void mo4294d(C0017h hVar) {
        if (hVar instanceof C0014e) {
            this.f44a.m4383a(hVar.getRemoteSocketAddress());
        }
    }

    @Override // p000a.p001a.AbstractC0029s
    /* renamed from: e */
    public void mo4293e(C0017h hVar) {
    }
}
